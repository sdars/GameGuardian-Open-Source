#!/usr/bin/env python3
"""Replace two JADX-broken Tools methods with smali-equivalent code."""

from pathlib import Path


ROOT = Path(__file__).resolve().parents[3]
TOOLS = ROOT / "app" / "src" / "rebuild" / "java" / "android" / "ext" / "Tools.java"

A0 = '''    public static PackageInfo A0(String str, int i2) throws PackageManager.NameNotFoundException {
        if (android.ext.a0.i(str)) {
            e1.i("Failed getPackageInfo, isBuggedPackage: " + str);
            return null;
        }
        PackageManager packageManagerB0 = B0();
        if (packageManagerB0 != null) {
            boolean zA2 = android.ext.a0.a(str, "pkg_info");
            try {
                PackageInfo packageInfo = packageManagerB0.getPackageInfo(str, i2);
                android.ext.a0.b(zA2);
                if (packageInfo != null) {
                    return packageInfo;
                }
            } catch (Throwable th) {
                android.ext.a0.b(zA2);
                if (th instanceof PackageManager.NameNotFoundException) {
                    throw (PackageManager.NameNotFoundException) th;
                }
                e1.l("Failed getPackageInfo", th);
            }
        }
        Object objU0 = u0();
        if (objU0 == null) {
            return null;
        }
        try {
            Class<?> cls = objU0.getClass();
            Class<?> cls2 = Integer.TYPE;
            y yVarX0 = x0(cls, new y[]{new y(cls, "getPackageInfo", new Class[]{String.class, cls2, cls2}, objU0, new Object[]{str, Integer.valueOf(i2), Integer.valueOf(0)}), new y(cls, "getPackageInfo", new Class[]{String.class, cls2}, objU0, new Object[]{str, Integer.valueOf(i2)})});
            if (yVarX0 == null) {
                return null;
            }
            boolean zA = android.ext.a0.a(str, "pkg_info2");
            Object objB;
            try {
                objB = yVarX0.b();
            } finally {
                android.ext.a0.b(zA);
            }
            if (objB == null) {
                throw new PackageManager.NameNotFoundException(str);
            }
            if (objB instanceof PackageInfo) {
                return (PackageInfo) objB;
            }
        } catch (Throwable th2) {
            if (th2 instanceof PackageManager.NameNotFoundException) {
                throw (PackageManager.NameNotFoundException) th2;
            }
            e1.l("Failed getPackageInfo", th2);
        }
        return null;
    }
'''

Z = '''    public static ApplicationInfo Z(String str, int i2) throws PackageManager.NameNotFoundException {
        if (android.ext.a0.i(str)) {
            e1.i("Failed getApplicationInfo, isBuggedPackage: " + str);
            return null;
        }
        PackageManager packageManagerB0 = B0();
        if (packageManagerB0 != null) {
            boolean zA2 = android.ext.a0.a(str, "app_info");
            try {
                ApplicationInfo applicationInfo = packageManagerB0.getApplicationInfo(str, i2);
                android.ext.a0.b(zA2);
                if (applicationInfo != null) {
                    return applicationInfo;
                }
            } catch (Throwable th) {
                android.ext.a0.b(zA2);
                if (th instanceof PackageManager.NameNotFoundException) {
                    throw (PackageManager.NameNotFoundException) th;
                }
                e1.l("Failed getApplicationInfo", th);
            }
        }
        Object objU0 = u0();
        if (objU0 == null) {
            return null;
        }
        try {
            Class<?> cls = objU0.getClass();
            Class<?> cls2 = Integer.TYPE;
            y yVarX0 = x0(cls, new y[]{new y(cls, "getApplicationInfo", new Class[]{String.class, cls2, cls2}, objU0, new Object[]{str, Integer.valueOf(i2), Integer.valueOf(0)}), new y(cls, "getApplicationInfo", new Class[]{String.class, cls2}, objU0, new Object[]{str, Integer.valueOf(i2)})});
            if (yVarX0 == null) {
                return null;
            }
            boolean zA = android.ext.a0.a(str, "app_info2");
            Object objB;
            try {
                objB = yVarX0.b();
            } finally {
                android.ext.a0.b(zA);
            }
            if (objB == null) {
                throw new PackageManager.NameNotFoundException(str);
            }
            if (objB instanceof ApplicationInfo) {
                return (ApplicationInfo) objB;
            }
        } catch (Throwable th2) {
            if (th2 instanceof PackageManager.NameNotFoundException) {
                throw (PackageManager.NameNotFoundException) th2;
            }
            e1.l("Failed getApplicationInfo", th2);
        }
        return null;
    }
'''


def replace_method(text: str, signature: str, replacement: str) -> str:
    start = text.index(signature)
    brace = text.index("{", start)
    depth = 0
    i = brace
    while i < len(text):
        if text[i] == "{":
            depth += 1
        elif text[i] == "}":
            depth -= 1
            if depth == 0:
                return text[:start] + replacement + text[i + 1:]
        i += 1
    raise SystemExit("unbalanced braces")


def main() -> None:
    text = TOOLS.read_text(encoding="utf-8")
    text = replace_method(text, "    public static PackageInfo A0(String str, int i2)", A0)
    text = replace_method(text, "    public static ApplicationInfo Z(String str, int i2)", Z)
    TOOLS.write_text(text, encoding="utf-8")
    print("replaced A0 and Z")


if __name__ == "__main__":
    main()
