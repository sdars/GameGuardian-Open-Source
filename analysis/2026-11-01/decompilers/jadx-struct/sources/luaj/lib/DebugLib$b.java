package luaj.lib;

import luaj.Globals;
import luaj.LuaClosure;
import luaj.LuaFunction;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaTable$i;
import luaj.LuaThread$a;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.h;

/* JADX INFO: loaded from: classes.dex */
public class DebugLib$b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final DebugLib$a[] f1755c = new DebugLib$a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    DebugLib$a[] f1756a = f1755c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f1757b = 0;

    DebugLib$b() {
    }

    private static LuaValue d(StringBuffer stringBuffer, LuaTable luaTable, LuaValue luaValue, int i) {
        String strG0;
        LuaValue luaValueD;
        if (luaTable == null) {
            return null;
        }
        LuaTable$i luaTable$iS3 = luaTable.s3();
        while (luaTable$iS3.c()) {
            if (luaTable$iS3.a() == 0) {
                LuaValue luaValueB = luaTable$iS3.b();
                if (luaValueB instanceof LuaString) {
                    LuaValue luaValueD2 = luaTable$iS3.d();
                    if (luaValueD2 == luaValue) {
                        if (i != 2) {
                            return luaValueB;
                        }
                        stringBuffer.append("function '");
                        strG0 = luaValueB.g0();
                    } else if (i > 1 && luaValueD2.o1() && (luaValueD = d(stringBuffer, luaValueD2.H0(), luaValue, i - 1)) != null) {
                        String strG1 = luaValueB.g0();
                        stringBuffer.append("function '");
                        if (!strG1.equals("_G")) {
                            stringBuffer.append(strG1);
                            stringBuffer.append('.');
                        }
                        strG0 = luaValueD.g0();
                    }
                    stringBuffer.append(strG0);
                    stringBuffer.append('\'');
                    return LuaValue.f1673c;
                }
                continue;
            }
        }
        return null;
    }

    private synchronized DebugLib$a j(boolean z) {
        try {
            if (z) {
                return this.f1756a[this.f1757b - 1];
            }
            int i = this.f1757b;
            DebugLib$a[] debugLib$aArr = this.f1756a;
            if (i >= debugLib$aArr.length) {
                int iMax = Math.max(4, (debugLib$aArr.length * 3) / 2);
                DebugLib$a[] debugLib$aArr2 = new DebugLib$a[iMax];
                DebugLib$a[] debugLib$aArr3 = this.f1756a;
                System.arraycopy(debugLib$aArr3, 0, debugLib$aArr2, 0, debugLib$aArr3.length);
                for (int length = this.f1756a.length; length < iMax; length++) {
                    debugLib$aArr2[length] = new DebugLib$a();
                }
                this.f1756a = debugLib$aArr2;
                for (int i2 = 1; i2 < iMax; i2++) {
                    debugLib$aArr2[i2].f1752d = debugLib$aArr2[i2 - 1];
                }
            }
            DebugLib$a[] debugLib$aArr4 = this.f1756a;
            int i3 = this.f1757b;
            this.f1757b = i3 + 1;
            return debugLib$aArr4[i3];
        } catch (Throwable th) {
            throw th;
        }
    }

    private static void k(StringBuffer stringBuffer, Globals globals, DebugLib$c debugLib$c) {
        char c2;
        if (d(stringBuffer, globals, debugLib$c.m.f1749a, 2) != null) {
            return;
        }
        if (debugLib$c.f1759b.length() > 0) {
            stringBuffer.append(debugLib$c.f1759b);
            stringBuffer.append(" '");
            stringBuffer.append(debugLib$c.f1758a);
            c2 = '\'';
        } else if (debugLib$c.f1760c.charAt(0) == 'm') {
            stringBuffer.append("main chunk");
            return;
        } else if (debugLib$c.f1760c.charAt(0) != 'J') {
            stringBuffer.append("function <");
            stringBuffer.append(debugLib$c.l);
            stringBuffer.append(':');
            stringBuffer.append(debugLib$c.f1763f);
            c2 = '>';
        } else {
            c2 = '?';
        }
        stringBuffer.append(c2);
    }

    synchronized DebugLib$c a(String str, LuaFunction luaFunction, DebugLib$a debugLib$a) {
        DebugLib$c debugLib$c;
        DebugLib$d debugLib$dE3;
        try {
            debugLib$c = new DebugLib$c();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == 'S') {
                    debugLib$c.a(luaFunction);
                } else if (cCharAt == 'l') {
                    debugLib$c.f1762e = (debugLib$a == null || !debugLib$a.f1749a.f1()) ? -1 : debugLib$a.a();
                } else if (cCharAt != 'n') {
                    boolean z = true;
                    if (cCharAt == 't') {
                        if (debugLib$a == null || !debugLib$a.f1754f) {
                            z = false;
                        }
                        debugLib$c.k = z;
                    } else if (cCharAt == 'u') {
                        if (luaFunction == null || !luaFunction.f1()) {
                            debugLib$c.h = (short) 0;
                            debugLib$c.j = true;
                            debugLib$c.i = (short) 0;
                        } else {
                            h hVar = luaFunction.w0().R;
                            debugLib$c.h = (short) hVar.f1728f.length;
                            debugLib$c.i = (short) hVar.j;
                            if (hVar.k == 0) {
                                z = false;
                            }
                            debugLib$c.j = z;
                        }
                    }
                } else {
                    if (debugLib$a != null && !debugLib$a.f1754f) {
                        if (debugLib$a.f1753e) {
                            debugLib$c.f1759b = "hook";
                            debugLib$c.f1758a = "?";
                        } else {
                            DebugLib$a debugLib$a2 = debugLib$a.f1752d;
                            if (debugLib$a2 != null && debugLib$a2.f1749a.f1() && (debugLib$dE3 = DebugLib.e3(debugLib$a.f1752d)) != null) {
                                debugLib$c.f1758a = debugLib$dE3.f1765a;
                                debugLib$c.f1759b = debugLib$dE3.f1766b;
                            }
                        }
                    }
                    if (debugLib$c.f1759b == null) {
                        debugLib$c.f1759b = "";
                        debugLib$c.f1758a = null;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return debugLib$c;
    }

    synchronized int b() {
        int i;
        try {
            i = this.f1757b;
        } catch (Throwable th) {
            throw th;
        }
        return i > 0 ? this.f1756a[i - 1].a() : -1;
    }

    synchronized DebugLib$a c(LuaValue luaValue) {
        int i = 1;
        while (true) {
            try {
                int i2 = this.f1757b;
                if (i > i2) {
                    return null;
                }
                DebugLib$a[] debugLib$aArr = this.f1756a;
                if (debugLib$aArr[i2 - i].f1749a == luaValue) {
                    return debugLib$aArr[i];
                }
                i++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    synchronized DebugLib$a e(int i) {
        if (i >= 1) {
            try {
                int i2 = this.f1757b;
                if (i <= i2) {
                    return this.f1756a[i2 - i];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    final synchronized void f(LuaClosure luaClosure, Varargs varargs, LuaValue[] luaValueArr, boolean z, boolean z2) {
        try {
            j(z2).f(luaClosure, varargs, luaValueArr, z, z2);
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void g(LuaFunction luaFunction, boolean z, boolean z2) {
        try {
            j(z2).g(luaFunction, z, z2);
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void h(int i, Varargs varargs, int i2) {
        try {
            int i3 = this.f1757b;
            if (i3 > 0) {
                this.f1756a[i3 - 1].d(i, varargs, i2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void i(LuaThread$a luaThread$a) {
        try {
            int i = this.f1757b;
            if (i > 0) {
                DebugLib$a[] debugLib$aArr = this.f1756a;
                int i2 = i - 1;
                this.f1757b = i2;
                debugLib$aArr[i2].e();
            }
            l(luaThread$a);
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void l(LuaThread$a luaThread$a) {
        int i;
        try {
            if (luaThread$a.f1671g && (i = this.f1757b) > 0) {
                DebugLib$a debugLib$a = this.f1756a[i - 1];
                luaThread$a.l = debugLib$a.a();
                luaThread$a.m = debugLib$a.f1750b;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized String m(Globals globals, int i) {
        StringBuffer stringBuffer;
        try {
            stringBuffer = new StringBuffer();
            stringBuffer.append("stack traceback:");
            while (true) {
                int i2 = i + 1;
                DebugLib$a debugLib$aE = e(i);
                if (debugLib$aE != null) {
                    DebugLib$c debugLib$cA = a("Slnt", debugLib$aE.f1749a, debugLib$aE);
                    debugLib$cA.m = debugLib$aE;
                    stringBuffer.append("\n\t");
                    stringBuffer.append(debugLib$cA.l);
                    stringBuffer.append(':');
                    int i3 = debugLib$cA.f1762e;
                    if (i3 > 0) {
                        stringBuffer.append(i3);
                    }
                    stringBuffer.append(" in ");
                    k(stringBuffer, globals, debugLib$cA);
                    if (debugLib$cA.k) {
                        stringBuffer.append("\n\t(...tail calls...)");
                    }
                    i = i2;
                } else {
                    stringBuffer.append("\n\t[Java]: in ?");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return stringBuffer.toString();
    }
}
