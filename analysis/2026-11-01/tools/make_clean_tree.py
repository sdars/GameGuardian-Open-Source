#!/usr/bin/env python3
"""Create a clean source tree by renaming only the obfuscated top-level
packages a..g to gga..ggg.  Class names are deliberately left untouched:
the Android package contains classes called a..g as well, and renaming the
packages removes the package/class ambiguity without changing the bytecode
shape of the application.
"""

from pathlib import Path
import shutil

ROOT = Path(__file__).resolve().parents[3]
SRC = ROOT / "app/src/main/java"
DST = ROOT / "app/src/rebuild-clean/java"

OLD = list("abcdefg")
NEW = ["gg" + c for c in OLD]


def main() -> None:
    if DST.exists():
        shutil.rmtree(DST)
    shutil.copytree(SRC, DST)

    for old, new in zip(OLD, NEW):
        src = DST / old
        dst = DST / new
        if src.is_dir():
            src.rename(dst)

    # Rewrite package declarations and the handful of cross-package imports.
    # Do not touch same-package class references such as c.W or f.b: those
    # are resolved against classes in android.ext and must stay unchanged.
    package_map = {old: new for old, new in zip(OLD, NEW)}
    for path in DST.rglob("*.java"):
        text = path.read_text(encoding="utf-8", errors="surrogateescape")
        lines = text.splitlines(keepends=True)
        out = []
        for line in lines:
            stripped = line.strip()
            if stripped.startswith("package "):
                name = stripped[len("package "):].rstrip(";").strip()
                if name in package_map:
                    line = line.replace("package " + name, "package " + package_map[name], 1)
            elif stripped.startswith("import "):
                name = stripped[len("import "):].rstrip(";").strip()
                if name in {"a.b", "a.e", "d.b", "d.c", "e.d", "e.e", "e.f", "f.d", "g.f"}:
                    line = line.replace("import " + name, "import " + package_map[name[0]] + name[1:], 1)
            out.append(line)
        new_text = "".join(out)
        if new_text != text:
            path.write_text(new_text, encoding="utf-8", errors="surrogateescape")

    print(f"created {DST}")


if __name__ == "__main__":
    main()
