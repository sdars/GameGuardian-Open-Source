#!/usr/bin/env python3
"""Apply deterministic repairs to the JADX source after package renaming."""

from __future__ import annotations

import re
import sys
from pathlib import Path


ROOT = Path(__file__).resolve().parents[3]
SRC = ROOT / "app" / "src" / "rebuild" / "java"


def replace(path: Path, old: str, new: str, count: int = 0) -> None:
    text = path.read_text(encoding="utf-8")
    if old not in text:
        return
    path.write_text(text.replace(old, new, count), encoding="utf-8")


def main() -> int:
    main_service = SRC / "android" / "ext" / "MainService.java"
    text = main_service.read_text(encoding="utf-8")
    text = re.sub(r"(?<![\w.$])R\.", "catch_.me_.if_.you_.can_.R.", text)
    main_service.write_text(text, encoding="utf-8")

    for path in SRC.rglob("*.java"):
        text = path.read_text(encoding="utf-8")
        text = text.replace("ggg.k", "ggg.g.k")
        text = text.replace("ggg.j", "ggg.g.j")
        text = text.replace("ggg.i", "ggg.g.i")
        path.write_text(text, encoding="utf-8")

    replace(SRC / "gga" / "d.java", "(d) ggf.a(", "(d) gga.f.a(")
    print("repairs applied")
    return 0


if __name__ == "__main__":
    sys.exit(main())
