#!/usr/bin/env python3
"""Rename the obfuscated top-level packages a..g to gga..ggg inside the
JADX --no-imports tree.  All references were already rewritten to the new
prefixes by fix_jadx_noimports.py, so this only moves directories and fixes
the package declaration lines.
"""

from pathlib import Path

ROOT = Path(__file__).resolve().parents[3]
SRC = ROOT / "app/src/rebuild-jadx/java"


def main() -> None:
    for old in "abcdefg":
        new = "gg" + old
        src = SRC / old
        dst = SRC / new
        if src.is_dir() and not dst.exists():
            src.rename(dst)
        elif src.is_dir() and dst.exists():
            raise SystemExit(f"both {src} and {dst} exist")
    for path in SRC.rglob("*.java"):
        text = path.read_text(encoding="utf-8")
        lines = text.splitlines(keepends=True)
        changed = False
        for i, line in enumerate(lines):
            stripped = line.strip()
            if stripped.startswith("package "):
                name = stripped[len("package "):].rstrip(";").strip()
                if name in set("abcdefg"):
                    lines[i] = line.replace("package " + name, "package gg" + name, 1)
                    changed = True
        if changed:
            path.write_text("".join(lines), encoding="utf-8")
    print("renamed")


if __name__ == "__main__":
    main()
