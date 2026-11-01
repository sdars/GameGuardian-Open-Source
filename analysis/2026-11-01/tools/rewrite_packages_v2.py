#!/usr/bin/env python3
"""Package-aware rewrite of the JADX tree.

The first JADX pass emitted one-letter package names (a..g).  A naive
``a.`` -> ``gga.`` replacement also rewrites same-package class references
such as ``b.e()`` inside package ``a``.  This pass uses the original class
index to distinguish packages from classes and preserves same-package
references.
"""

from __future__ import annotations

import re
import shutil
import sys
from pathlib import Path


ROOT = Path(__file__).resolve().parents[3]
SRC = ROOT / "app" / "src" / "main" / "java"
DST = ROOT / "app" / "src" / "rebuild" / "java-v2"
PACKAGES = set("abcdefg")


def package_of(path: Path) -> str:
    text = path.read_text(encoding="utf-8")
    match = re.search(r"(?m)^package\s+([\w.$]+)\s*;", text)
    return match.group(1) if match else ""


def class_name_of(path: Path) -> str:
    return path.stem


def build_index() -> tuple[dict[str, set[str]], dict[str, set[str]]]:
    classes: dict[str, set[str]] = {}
    imports: dict[str, set[str]] = {}
    for path in SRC.rglob("*.java"):
        pkg = package_of(path)
        classes.setdefault(pkg, set()).add(class_name_of(path))
    # Keep a small explicit import map from the source tree.  JADX emits
    # imports for every non-same-package type it uses.
    for path in SRC.rglob("*.java"):
        pkg = package_of(path)
        names: set[str] = set()
        for line in path.read_text(encoding="utf-8").splitlines():
            match = re.match(r"\s*import\s+(?:static\s+)?([\w.$]+)\s*;", line)
            if not match:
                continue
            fq = match.group(1)
            if fq.endswith(".*"):
                continue
            parts = fq.split(".")
            if len(parts) >= 2:
                names.add(parts[-1])
        imports[pkg] = names
    return classes, imports


def is_ident_char(ch: str) -> bool:
    return ch.isalnum() or ch == "_" or ch == "$"


def rewrite_code(text: str, pkg: str, classes: dict[str, set[str]], imports: dict[str, set[str]]) -> str:
    """Rewrite code outside comments and literals."""
    out: list[str] = []
    i = 0
    n = len(text)
    current_pkg = pkg.split(".", 1)[0] if pkg else ""
    same_classes = classes.get(pkg, set())
    imported = imports.get(pkg, set())

    while i < n:
        ch = text[i]
        # Preserve line/block comments and quoted literals verbatim.
        if ch == "/" and i + 1 < n and text[i + 1] == "/":
            j = text.find("\n", i)
            if j < 0:
                out.append(text[i:])
                break
            out.append(text[i:j])
            i = j
            continue
        if ch == "/" and i + 1 < n and text[i + 1] == "*":
            j = text.find("*/", i + 2)
            if j < 0:
                out.append(text[i:])
                break
            out.append(text[i:j + 2])
            i = j + 2
            continue
        if ch in "\"'":
            quote = ch
            j = i + 1
            while j < n:
                if text[j] == "\\":
                    j += 2
                    continue
                if text[j] == quote:
                    j += 1
                    break
                j += 1
            out.append(text[i:j])
            i = j
            continue

        # A qualified reference starts at a standalone one-letter segment.
        if ch in PACKAGES and (i == 0 or not is_ident_char(text[i - 1])) and i + 2 < n and text[i + 1] == ".":
            j = i + 2
            while j < n and is_ident_char(text[j]):
                j += 1
            name = text[i + 2:j]
            if name:
                # ``x.this`` is a class reference, never a package.
                if name == "this":
                    out.append(ch)
                    i += 1
                    continue
                # A class in the current package wins over a package of the
                # same one-letter name (e.g. b.e() inside package a).
                if ch == current_pkg and name in same_classes:
                    out.append(text[i:j])
                    i = j
                    continue
                # Explicitly imported classes win as well.
                if ch in imported and ch not in PACKAGES:
                    out.append(text[i:j])
                    i = j
                    continue
                if ch in PACKAGES and name in classes.get(ch, set()):
                    out.append("gg" + ch + text[i + 1:j])
                    i = j
                    continue
                # If x is a class in the current package, this is a member
                # reference and must stay untouched.
                if ch in same_classes:
                    out.append(text[i:j])
                    i = j
                    continue
            out.append(ch)
            i += 1
            continue
        out.append(ch)
        i += 1
    return "".join(out)


def rewrite_file(path: Path, classes: dict[str, set[str]], imports: dict[str, set[str]]) -> str:
    pkg = package_of(path)
    text = path.read_text(encoding="utf-8")
    # Package declarations are unambiguous.
    text = re.sub(
        r"(?m)^package\s+([a-g])(?:\.([\w.$]+))?\s*;",
        lambda m: "package gg%s%s;" % (m.group(1), ("." + m.group(2)) if m.group(2) else ""),
        text,
    )
    # Imports are also unambiguous package prefixes.
    text = re.sub(
        r"(?m)^(import\s+(?:static\s+)?)([a-g])\.",
        lambda m: m.group(1) + "gg" + m.group(2) + ".",
        text,
    )
    return rewrite_code(text, pkg, classes, imports)


def main() -> int:
    classes, imports = build_index()
    if DST.exists():
        shutil.rmtree(DST)
    DST.mkdir(parents=True)
    count = 0
    for path in SRC.rglob("*.java"):
        rel = path.relative_to(SRC)
        parts = list(rel.parts)
        if parts[0] in PACKAGES:
            parts[0] = "gg" + parts[0]
        out = DST.joinpath(*parts)
        out.parent.mkdir(parents=True, exist_ok=True)
        out.write_text(rewrite_file(path, classes, imports), encoding="utf-8")
        count += 1
    print(f"rewrote {count} files -> {DST}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
