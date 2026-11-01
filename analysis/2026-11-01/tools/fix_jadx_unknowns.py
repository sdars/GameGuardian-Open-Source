#!/usr/bin/env python3
"""Repair the handful of `??` unknown-type locals that JADX emits when it
can't infer a register type.  Each entry is pinned to the inferred Java type
that makes the surrounding statement type-correct; the substitution is
mechanical (only the `??` token is replaced).
"""

from pathlib import Path
import re
import sys

ROOT = Path(__file__).resolve().parents[3]
SRC = ROOT / "app/src/rebuild-jadx/java"

# file -> list of (regex that matches the declaration, replacement)
FIXES = {
    "a/d.java": [
        (r"\?\? Inflate", "int Inflate"),
    ],
    "luaj/Globals.java": [
        (r"\?\? r10", "java.io.InputStream r10"),
    ],
    "android/ext/Tools.java": [
        (r"\?\? r1", "int r1"),
        (r"\?\? r3", "java.io.FileInputStream r3"),
    ],
    "android/ext/MainService.java": [
        (r"\?\? F", "java.lang.String F"),
    ],
    "android/ext/f0.java": [
        (r"\?\? r15", "java.lang.String r15"),
        (r"\?\? r16", "android.ext.f0 r16"),
    ],
    "android/ext/b1.java": [
        (r"\?\? r0", "java.lang.Object r0"),
        (r"\?\? a0Var", "java.io.OutputStream a0Var"),
    ],
    "android/ext/o0.java": [
        (r"\?\? r0", "int r0"),
        (r"\?\? r1", "int r1"),
    ],
    "android/ext/n.java": [
        (r"\?\? r8", "int r8"),
        (r"\?\? r9", "int r9"),
        (r"\?\? r10", "int r10"),
        (r"\?\? r2", "int r2"),
        (r"\?\? r3", "int r3"),
        (r"\?\? r4", "int r4"),
        (r"\?\? r5", "int r5"),
        (r"\?\? r6", "int r6"),
        (r"\?\? r7", "int r7"),
        (r"\?\? r11", "int r11"),
        (r"\?\? r12", "int r12"),
        (r"\?\? r13", "int r13"),
        (r"\?\? r14", "int r14"),
        (r"\?\? r15", "int r15"),
        (r"\?\? r16", "int r16"),
    ],
}


def main() -> None:
    total = 0
    for rel, rules in FIXES.items():
        path = SRC / rel
        text = path.read_text(encoding="utf-8")
        changed = 0
        for pat, repl in rules:
            text, n = re.subn(pat, repl, text)
            changed += n
        if changed:
            path.write_text(text, encoding="utf-8")
        total += changed
        print(f"{rel}: {changed}")
    print(f"total replacements: {total}")


if __name__ == "__main__":
    main()
