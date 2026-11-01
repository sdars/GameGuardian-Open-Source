#!/usr/bin/env python3
"""Deterministic repairs for the rebuilt GameGuardian tree.

Run from the repository root with the Knight virtualenv:
    /root/Knight/.venv/bin/python analysis/2026-11-01/tools/rebuild_repair.py
"""

from __future__ import annotations

import re
import sys
from pathlib import Path


ROOT = Path(__file__).resolve().parents[3]
SRC = ROOT / "app" / "src" / "rebuild" / "java"


def read(path: Path) -> str:
    return path.read_text(encoding="utf-8")


def write(path: Path, text: str) -> None:
    path.write_text(text, encoding="utf-8")


def replace_once(path: Path, old: str, new: str) -> bool:
    text = read(path)
    if old not in text:
        print(f"MISS {path.relative_to(ROOT)}: {old[:70]!r}")
        return False
    write(path, text.replace(old, new, 1))
    return True


def replace_method(path: Path, signature: str, replacement: str) -> bool:
    text = read(path)
    start = text.find(signature)
    if start < 0:
        print(f"MISS method {path.relative_to(ROOT)}: {signature!r}")
        return False
    brace = text.find("{", start)
    if brace < 0:
        return False
    depth = 0
    i = brace
    while i < len(text):
        ch = text[i]
        if ch == "{":
            depth += 1
        elif ch == "}":
            depth -= 1
            if depth == 0:
                write(path, text[:start] + replacement + text[end:])
                return True
        i += 1
    return False


def main() -> int:
    print("repair script skeleton")
    return 0


if __name__ == "__main__":
    sys.exit(main())
