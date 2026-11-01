#!/usr/bin/env python3
"""Create a compilable source tree by renaming JADX's one-letter packages.

The original dex uses packages a..g.  JADX emits qualified references such as
``a.e`` and ``d.f``; those names collide with fields, nested classes and even
the current class (``android.ext.d``).  Renaming only the package prefixes keeps
the class names and bytecode API intact while removing the collisions.
"""

from __future__ import annotations

import re
import shutil
import sys
from pathlib import Path


ROOT = Path(__file__).resolve().parents[3]
SRC = ROOT / "app" / "src" / "main" / "java"
DST = ROOT / "app" / "src" / "rebuild" / "java"

PACKAGE_MAP = {name: "gg" + name for name in "abcdefg"}


def rewrite(text: str) -> str:
    # Package declarations.
    text = re.sub(
        r"(?m)^package ([a-g])(?:\.([A-Za-z0-9_$]+))?;",
        lambda m: "package %s%s;"
        % (PACKAGE_MAP[m.group(1)], ("." + m.group(2)) if m.group(2) else ""),
        text,
    )

    # Imports and qualified type references.  Only the first segment is a
    # one-letter package when followed by a class name from that package.  The
    # lookbehind excludes field/method chains such as ``x.a`` and ``a.this``.
    for old, new in PACKAGE_MAP.items():
        text = re.sub(
            r"(?<![\w.$])" + old + r"\.(?=[A-Za-z_$][A-Za-z0-9_$]*\b)",
            new + ".",
            text,
        )
    return text


def main() -> int:
    if DST.exists():
        shutil.rmtree(DST)
    DST.mkdir(parents=True)
    count = 0
    for path in SRC.rglob("*.java"):
        rel = path.relative_to(SRC)
        parts = list(rel.parts)
        if parts[0] in PACKAGE_MAP:
            parts[0] = PACKAGE_MAP[parts[0]]
        out = DST.joinpath(*parts)
        out.parent.mkdir(parents=True, exist_ok=True)
        out.write_text(rewrite(path.read_text(encoding="utf-8")), encoding="utf-8")
        count += 1
    print(f"rewrote {count} files -> {DST}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
