#!/usr/bin/env python3
"""Deterministic compile repairs for the JADX rebuild tree."""

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


def sub(path: Path, old: str, new: str, count: int = 0) -> None:
    text = read(path)
    if old not in text:
        return
    write(path, text.replace(old, new, count))


def sub_re(path: Path, pattern: str, repl: str, count: int = 0) -> None:
    text = read(path)
    write(path, re.sub(pattern, repl, text, count=count, flags=re.M))


def add_static(path: Path, names: list[str]) -> None:
    text = read(path)
    for name in names:
        text = re.sub(
            r"(?m)^(    )class " + re.escape(name) + r"\b",
            r"\1static class " + name,
            text,
        )
    write(path, text)


def repair_simple() -> None:
    # package-level over-rewrites
    for path in SRC.rglob("*.java"):
        text = read(path)
        text = text.replace("ggb.this", "b.this")
        text = text.replace("gga.this", "a.this")
        text = text.replace("b2.f(", "android.ext.b2.f(")
        write(path, text)

    sub(SRC / "ggd" / "a.java", "ggb.", "ggd.b.")
    sub(SRC / "android" / "ext" / "c.java", "k.h(ggc.class)", "k.h(c.class)")
    sub(SRC / "android" / "fix" / "LinearLayout.java", "ggb.f(configuration)", "gga.b.f(configuration)")
    sub(SRC / "gga" / "d.java", "(d) ggf.a(", "(d) gga.f.a(")
    for old, new in [
        ("R.style.Theme.DeviceDefault", "16974120"),
        ("R.style.Theme.Material", "16974372"),
        ("R.style.Theme.Holo", "16973931"),
        ("R.style.Theme", "16973829"),
        ("R.style.Theme.Black", "16973832"),
    ]:
        sub(SRC / "gga" / "d.java", old, new)

    sub(SRC / "android" / "ext" / "t1.java", "class C0021a implements Comparator {", "class C0021a implements Comparator<String> {")
    sub(SRC / "android" / "ext" / "t1.java", "ggc.E(", "c.E(")
    sub(SRC / "android" / "ext" / "ArrayAdapter.java", "Object[] objArr", "T[] objArr")

    # AddressArrayAdapter
    p = SRC / "android" / "ext" / "AddressArrayAdapter.java"
    sub(p, "boolean z2 = (Config.q & (1 << Tools.d1())) == 0 ? 0 : 1;", "boolean z2 = (Config.q & (1 << Tools.d1())) != 0;")
    sub(p, "d3Var2.o.setOrientation(!z2);", "d3Var2.o.setOrientation(z2 ? 0 : 1);")
    sub(p, "z2 != 0 ? -2 : Tools.H()", "z2 ? -2 : Tools.H()")
    sub(p, "private final ggd.a f25b = new ggd.a();", "private final android.ext.d.a f25b = new android.ext.d.a();")
    sub(p, "ggd.a aVar2 = this.f25b;", "android.ext.d.a aVar2 = this.f25b;")
    sub(p, "ggc.I(", "c.I(")

    # FloatPanel catch variables
    p = SRC / "android" / "ext" / "FloatPanel.java"
    sub(p, "                } catch (Throwable th) {\n                    th = th;\n                    e1.a(th);", "                } catch (Throwable th) {\n                    e1.a(th);")
    sub(p, "            } catch (Throwable th2) {\n                th = th2;\n                width = -1;", "            } catch (Throwable th2) {\n                width = -1;")

    # Config inner option classes do not capture the outer instance.
    add_static(SRC / "android" / "ext" / "Config.java", list("abcdefghijklmn"))

    # Tools inner classes do not capture the outer instance.
    add_static(SRC / "android" / "ext" / "Tools.java", list("abcdefghijklmnopqrstu"))
    add_static(SRC / "android" / "ext" / "Tools.java", ["a"])

    # Tools uses java.lang.Process for command handles and android.os.Process
    # only for uid/kill calls.
    p = SRC / "android" / "ext" / "Tools.java"
    sub(p, "import android.os.Process;\n", "")
    sub(p, "Process.myUid()", "android.os.Process.myUid()")
    sub(p, "                e = e4;\n", "")
    sub(p, "                e = th;\n", "")
    sub(p, "e1.s(\"Fail\", e);", "e1.s(\"Fail\", e4);")

    # MainService
    p = SRC / "android" / "ext" / "MainService.java"
    sub(p, "y0.b(str, 1);", "android.ext.y0.b(str, 1);")
    sub(p, "i6 = this.D0;", "i6 = this.D0 ? 1 : 0;")
    sub(p, "        t tVar = new t();", "        t tVar = new t();")
    add_static(p, ["t"])

    # ConfigListAdapter inner classes used from static methods.
    p = SRC / "android" / "ext" / "ConfigListAdapter.java"
    add_static(p, ["f", "g", "h", "i", "l", "m", "n", "o", "p", "q", "r"])
    sub(p, "class q implements Comparator {", "class q implements Comparator<String> {")


def replace_method(path: Path, signature: str, replacement: str) -> None:
    text = read(path)
    start = text.find(signature)
    if start < 0:
        return
    brace = text.find("{", start)
    if brace < 0:
        return
    depth = 0
    i = brace
    while i < len(text):
        ch = text[i]
        if ch == "{":
            depth += 1
        elif ch == "}":
            depth -= 1
            if depth == 0:
                end = i + 1
                write(path, text[:start] + replacement + text[end:])
                return
        i += 1


def repair_locale_method() -> None:
    replacement = '''    static void e() {
        MainService mainService = MainService.instance;
        if (mainService == null) {
            return;
        }
        ArrayList<String> codes = new ArrayList<String>();
        ArrayList<CharSequence> labels = new ArrayList<CharSequence>();
        HashMap<String, String> seen = new HashMap<String, String>();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        mainService.l.getDefaultDisplay().getMetrics(displayMetrics);
        Resources resources = MainService.context.getResources();
        Configuration configuration = resources.getConfiguration();
        AssetManager assets = resources.getAssets();
        String[] locales = android.ext.k.e();
        Arrays.sort(locales, new q());
        String langCode = android.ext.b2.f(R.string.lang_code);
        int selected = -1;
        for (String code : locales) {
            if (code == null) {
                continue;
            }
            String tag = code.length() == 0 ? "en_US" : code;
            Locale locale;
            try {
                locale = android.ext.k.d(tag);
            } catch (Throwable t) {
                e1.l("Failed check locale: " + tag, t);
                continue;
            }
            String key;
            try {
                key = g(configuration, locale, assets, displayMetrics);
            } catch (Throwable t) {
                e1.l("Failed check locale: " + tag, t);
                continue;
            }
            if (seen.containsKey(key)) {
                continue;
            }
            if (selected == -1 && key.startsWith(langCode)) {
                selected = codes.size();
            }
            seen.put(key, tag);
            codes.add(tag);
            String sample = "";
            try {
                sample = String.format(locale, "\n[%,.1f | %.2e]", Double.valueOf(-1234.0d), Double.valueOf(-4.56E-78d));
            } catch (Throwable t) {
                e1.a(t);
            }
            SpannableStringBuilder builder = new SpannableStringBuilder();
            builder.append((CharSequence) locale.getDisplayName(locale));
            builder.setSpan(new ForegroundColorSpan(z1.d.s), 0, builder.length(), 33);
            int start = builder.length();
            builder.append((CharSequence) " (");
            builder.append((CharSequence) tag);
            builder.append(')');
            builder.setSpan(new ForegroundColorSpan(z1.d.r), start, builder.length(), 33);
            int sampleStart = builder.length();
            builder.append((CharSequence) sample);
            builder.setSpan(new RelativeSizeSpan(0.6f), sampleStart, builder.length(), 33);
            builder.setSpan(new ForegroundColorSpan(z1.d.t), sampleStart, builder.length(), 33);
            labels.add(builder);
        }
        g(configuration, android.ext.k.d(android.ext.k.b()), assets, displayMetrics);
        android.ext.k.g();
        n2.i(new r(new ArrayAdapter(MainService.context, labels), selected, codes));
    }
'''
    replace_method(SRC / "android" / "ext" / "ConfigListAdapter.java", "    static void e() {", replacement)


def main() -> int:
    repair_simple()
    repair_locale_method()
    print("compile repairs applied")
    return 0


if __name__ == "__main__":
    sys.exit(main())
