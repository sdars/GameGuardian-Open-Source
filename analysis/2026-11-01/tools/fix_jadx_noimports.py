#!/usr/bin/env python3
"""Turn JADX's fully-qualified `--no-imports` output into compilable Java.

JADX writes fully qualified types (`android.ext.c`, `java.lang.String`), but
in a package whose classes are also called `a`..`g` a type reference like
`a.e` is parsed by javac as the nested class `e` of `android.ext.a` instead
of the top-level class `e` in package `a`.  Qualify those references with a
leading package root so javac resolves them the same way the JVM does.

The same pass repairs JADX's `??` unknown-type locals (the pinned type table
lives in fix_jadx_unknowns.py and is applied first).
"""

from pathlib import Path
import re

ROOT = Path(__file__).resolve().parents[3]
SRC = ROOT / "app/src/rebuild-jadx/java"

# Only these package prefixes need disambiguation.  They are the obfuscated
# top-level packages; each has a same-named class in android.ext.
PKGS = "abcdefg"

# A reference starts with the single-letter package followed by a dot, and
# the preceding character must not be part of a longer identifier (so we do
# not touch `android.ext.a`, `my.a.b`, or string literals).
PATTERN = re.compile(r"(?<![\w$.])([a-g])\.(?=[A-Za-z_$])")

# Do not rewrite these contexts: string/char literals and comments are hard to
# parse without a full lexer, but the obfuscated package names are ASCII and
# the decompiler emits them as identifiers only; strings containing `a.b` do
# occur in the help URLs.  Restrict the rewrite to lines that look like code
# and skip the known data blobs (long quoted arrays).


def rewrite_line(line: str) -> str:
    if '"' in line and line.count('"') >= 2:
        # Split on string literals, only rewrite code segments.
        parts = re.split(r'("(?:\\.|[^"\\])*")', line)
        for i in range(0, len(parts), 2):
            parts[i] = PATTERN.sub(lambda m: "gg" + m.group(1) + ".", parts[i])
        return "".join(parts)
    return PATTERN.sub(lambda m: "gg" + m.group(1) + ".", line)


def main() -> None:
    total = 0
    files = 0
    for path in SRC.rglob("*.java"):
        text = path.read_text(encoding="utf-8")
        new = "".join(rewrite_line(line) for line in text.splitlines(keepends=True))
        if new != text:
            path.write_text(new, encoding="utf-8")
            files += 1
            total += sum(1 for a, b in zip(text.splitlines(), new.splitlines()) if a != b)
    print(f"rewrote {total} lines in {files} files")


if __name__ == "__main__":
    main()
