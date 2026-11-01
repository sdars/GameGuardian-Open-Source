package luaj.lib;

import luaj.Globals;
import luaj.LuaClosure;
import luaj.LuaFunction;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaThread;
import luaj.LuaThread$a;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.d$a;
import luaj.h;
import luaj.i;

/* JADX INFO: loaded from: classes.dex */
public class DebugLib extends TwoArgFunction {
    public static boolean U;
    public static boolean V;
    private static final LuaString W;
    private static final LuaString X;
    private static final LuaString Y;
    private static final LuaString Z;
    private static final LuaString a0;
    private static final LuaString b0;
    static final LuaString c0;
    static final LuaString d0;
    static final LuaString e0;
    static final LuaString f0;
    static final LuaString g0;
    static final LuaString h0;
    static final LuaString i0;
    static final LuaString j0;
    static final LuaString k0;
    static final LuaString l0;
    static final LuaString m0;
    static final LuaString n0;
    static final LuaString o0;
    static final LuaString p0;
    static final LuaString q0;
    static final LuaString r0;
    Globals T;

    static {
        boolean z = true;
        try {
            U = System.getProperty("CALLS") != null;
        } catch (Exception unused) {
        }
        try {
            if (System.getProperty("TRACE") == null) {
                z = false;
            }
            V = z;
        } catch (Exception unused2) {
        }
        W = LuaValue.K2("?");
        X = LuaValue.K2("call");
        Y = LuaValue.K2("tail call");
        Z = LuaValue.K2("line");
        a0 = LuaValue.K2("count");
        b0 = LuaValue.K2("return");
        c0 = LuaValue.K2("func");
        d0 = LuaValue.K2("istailcall");
        e0 = LuaValue.K2("isvararg");
        f0 = LuaValue.K2("nups");
        g0 = LuaValue.K2("nparams");
        h0 = LuaValue.K2("name");
        i0 = LuaValue.K2("namewhat");
        j0 = LuaValue.K2("what");
        k0 = LuaValue.K2("source");
        l0 = LuaValue.K2("short_src");
        m0 = LuaValue.K2("linedefined");
        n0 = LuaValue.K2("lastlinedefined");
        o0 = LuaValue.K2("currentline");
        p0 = LuaValue.K2("activelines");
        q0 = LuaValue.K2("(*temporary)");
        r0 = LuaValue.K2("(*vararg)");
    }

    private static LuaString a3(f.d dVar, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("(.upval ");
        if (dVar != null) {
            sb.append(dVar.f1566b ? 'v' : 'u');
            sb.append((int) dVar.f1567c);
        } else {
            sb.append("???");
        }
        sb.append(" \"(*no name)\"; u");
        sb.append(i);
        sb.append(')');
        return LuaString.K2(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0063  */
    static int b3(h hVar, int i, int i2) {
        int i3 = -1;
        int i4 = 0;
        while (i4 < i) {
            int i5 = hVar.f1724b[i4];
            int i6 = luaj.b.i(i5);
            if (i6 < 47) {
                int iC = luaj.b.c(i5);
                if (i6 == 4) {
                    int iE = luaj.b.e(i5);
                    if (iC <= i2 && i2 <= iC + iE) {
                        i3 = i4;
                    }
                } else if (i6 == 23) {
                    int iH = luaj.b.h(i5);
                    int i7 = i4 + 1 + iH;
                    if (i4 < i7 && i7 <= i) {
                        i4 += iH;
                    }
                } else if (i6 != 27) {
                    if (i6 != 34) {
                        if (i6 != 36) {
                            if (i6 == 29 || i6 == 30) {
                                if (i2 >= iC) {
                                    i3 = i4;
                                }
                            } else if (luaj.b.q(i6) && i2 == iC) {
                                i3 = i4;
                            }
                        } else if (((i5 >> 14) & 511) == 0) {
                            i4++;
                        }
                    } else if (i2 >= iC + 2) {
                        i3 = i4;
                    }
                } else if (i2 == iC) {
                    i3 = i4;
                }
            }
            i4++;
        }
        return i3;
    }

    static LuaString c3(LuaClosure luaClosure, int i) {
        i[] iVarArr = luaClosure.S;
        if (iVarArr == null || i <= 0 || i > iVarArr.length) {
            return null;
        }
        f.d[] dVarArr = luaClosure.R.f1728f;
        if (dVarArr == null || i > dVarArr.length) {
            return a3(null, i);
        }
        f.d dVar = dVarArr[i - 1];
        LuaString luaString = dVar.f1565a;
        return luaString == null ? a3(dVar, i) : luaString;
    }

    static DebugLib$d e3(DebugLib$a debugLib$a) {
        LuaString luaString;
        if (!debugLib$a.f1749a.f1()) {
            return new DebugLib$d(debugLib$a.f1749a.S2(), "Java");
        }
        h hVar = debugLib$a.f1749a.w0().R;
        int i = debugLib$a.f1750b;
        int[] iArr = hVar.f1724b;
        if (i >= iArr.length) {
            return null;
        }
        int i2 = iArr[i];
        switch (luaj.b.i(i2)) {
            case 6:
            case 7:
            case 12:
                luaString = LuaValue.l;
                break;
            case 8:
            case 10:
                luaString = LuaValue.m;
                break;
            case 9:
            case 11:
            case 20:
            case 23:
            case 27:
            case 28:
            case 31:
            case 32:
            case 33:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            default:
                return null;
            case 13:
                luaString = LuaValue.q;
                break;
            case 14:
                luaString = LuaValue.r;
                break;
            case 15:
                luaString = LuaValue.t;
                break;
            case 16:
                luaString = LuaValue.s;
                break;
            case 17:
                luaString = LuaValue.v;
                break;
            case 18:
                luaString = LuaValue.u;
                break;
            case 19:
                luaString = LuaValue.w;
                break;
            case 21:
                luaString = LuaValue.x;
                break;
            case 22:
                luaString = LuaValue.C;
                break;
            case 24:
                luaString = LuaValue.y;
                break;
            case 25:
                luaString = LuaValue.z;
                break;
            case 26:
                luaString = LuaValue.A;
                break;
            case 29:
            case 30:
                return g3(hVar, i, luaj.b.c(i2));
            case 34:
                return new DebugLib$d("for iterator", "for iterator");
            case 40:
                luaString = LuaValue.D;
                break;
            case 41:
                luaString = LuaValue.E;
                break;
            case 42:
                luaString = LuaValue.F;
                break;
            case 43:
                luaString = LuaValue.G;
                break;
            case 44:
                luaString = LuaValue.H;
                break;
            case 45:
                luaString = LuaValue.I;
                break;
            case 46:
                luaString = LuaValue.J;
                break;
        }
        return new DebugLib$d(luaString.g0(), "metamethod");
    }

    public static String f3(int i, int i2, h hVar) {
        DebugLib$d debugLib$dG3 = g3(hVar, i, i2);
        if (debugLib$dG3 == null) {
            return null;
        }
        return debugLib$dG3.toString();
    }

    static DebugLib$d g3(h hVar, int i, int i2) {
        LuaString luaStringA;
        LuaString luaStringA2 = hVar.a(i2 + 1, i);
        if (luaStringA2 != null) {
            return new DebugLib$d(luaStringA2.g0(), "local");
        }
        int iB3 = b3(hVar, i, i2);
        if (iB3 != -1) {
            int i3 = hVar.f1724b[iB3];
            int i4 = luaj.b.i(i3);
            if (i4 == 0) {
                int iC = luaj.b.c(i3);
                int iE = luaj.b.e(i3);
                if (iE < iC) {
                    return g3(hVar, iB3, iE);
                }
            } else if (i4 == 1 || i4 == 2) {
                int iF = luaj.b.i(i3) == 1 ? luaj.b.f(i3) : luaj.b.d(hVar.f1724b[iB3 + 1]);
                if (hVar.f1723a[iF].n1()) {
                    return new DebugLib$d(hVar.f1723a[iF].q2().g0(), "constant");
                }
            } else {
                if (i4 == 5) {
                    int iE2 = luaj.b.e(i3);
                    f.d[] dVarArr = hVar.f1728f;
                    LuaString luaString = iE2 < dVarArr.length ? dVarArr[iE2].f1565a : W;
                    if (luaString == null) {
                        return null;
                    }
                    return new DebugLib$d(luaString.g0(), "upvalue");
                }
                if (i4 == 6 || i4 == 7) {
                    int iG = luaj.b.g(i3);
                    int iE3 = luaj.b.e(i3);
                    if (luaj.b.i(i3) == 7) {
                        luaStringA = hVar.a(iE3 + 1, iB3);
                    } else {
                        f.d[] dVarArr2 = hVar.f1728f;
                        luaStringA = iE3 < dVarArr2.length ? dVarArr2[iE3].f1565a : W;
                    }
                    return new DebugLib$d(h3(hVar, iB3, iG), (luaStringA == null || !luaStringA.P0(LuaValue.k)) ? "field" : "global");
                }
                if (i4 == 12) {
                    return new DebugLib$d(h3(hVar, iB3, luaj.b.g(i3)), "method");
                }
            }
        }
        return null;
    }

    static String h3(h hVar, int i, int i2) {
        if (luaj.b.k(i2)) {
            LuaValue luaValue = hVar.f1723a[luaj.b.j(i2)];
            return luaValue.n1() ? luaValue.g0() : "?";
        }
        DebugLib$d debugLib$dG3 = g3(hVar, i, i2);
        return (debugLib$dG3 == null || !"constant".equals(debugLib$dG3.f1766b)) ? "?" : debugLib$dG3.f1765a;
    }

    void X2(LuaThread$a luaThread$a, LuaValue luaValue, LuaValue luaValue2) {
        LuaFunction luaFunction = luaThread$a.f1670f;
        if (luaThread$a.k != 0 || luaFunction == null) {
            return;
        }
        luaThread$a.k = 1;
        try {
            try {
                try {
                    boolean zF1 = true ^ luaFunction.f1();
                    if (zF1) {
                        j3(luaFunction, false);
                    }
                    try {
                        luaFunction.call(luaValue, luaValue2);
                        if (zF1) {
                            l3();
                        }
                        luaThread$a.k = 0;
                    } catch (Throwable th) {
                        if (zF1) {
                            l3();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    luaThread$a.k = 0;
                    throw th2;
                }
            } catch (luaj.d e2) {
                throw e2;
            }
        } catch (RuntimeException e3) {
            throw new d$a(e3);
        }
    }

    DebugLib$b Y2() {
        return Z2(this.T.f0);
    }

    DebugLib$b Z2(LuaThread luaThread) {
        if (luaThread.Q == null) {
            luaThread.Q = new DebugLib$b();
        }
        return (DebugLib$b) luaThread.Q;
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        Globals globalsZ0 = luaValue2.z0();
        this.T = globalsZ0;
        globalsZ0.i0 = this;
        LuaTable luaTable = new LuaTable();
        luaTable.i2("debug", new DebugLib$debug());
        luaTable.i2("gethook", new DebugLib$gethook(this));
        luaTable.i2("getinfo", new DebugLib$getinfo(this));
        luaTable.i2("getlocal", new DebugLib$getlocal(this));
        luaTable.i2("getmetatable", new DebugLib$getmetatable());
        luaTable.i2("getregistry", new DebugLib$getregistry(this));
        luaTable.i2("getupvalue", new DebugLib$getupvalue());
        luaTable.i2("sethook", new DebugLib$sethook(this));
        luaTable.i2("setlocal", new DebugLib$setlocal(this));
        luaTable.i2("setmetatable", new DebugLib$setmetatable());
        luaTable.i2("setupvalue", new DebugLib$setupvalue());
        luaTable.i2("traceback", new DebugLib$traceback(this));
        luaTable.i2("upvalueid", new DebugLib$upvalueid());
        luaTable.i2("upvaluejoin", new DebugLib$upvaluejoin());
        luaValue2.i2("debug", luaTable);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("debug", luaTable);
        }
        return luaTable;
    }

    public DebugLib$a d3(int i) {
        return Y2().e(i);
    }

    public void i3(LuaClosure luaClosure, Varargs varargs, LuaValue[] luaValueArr, boolean z) {
        LuaThread$a luaThread$a = this.T.f0.P;
        boolean z2 = luaThread$a.k == 1;
        if (z2) {
            luaThread$a.k = 2;
        }
        Y2().f(luaClosure, varargs, luaValueArr, z2, z);
        if (luaThread$a.k != 0) {
            return;
        }
        if (luaThread$a.f1671g) {
            luaThread$a.l = 0;
            luaThread$a.m = 0;
        }
        if (luaThread$a.h) {
            X2(luaThread$a, z ? Y : X, LuaValue.f1673c);
        }
    }

    public void j3(LuaFunction luaFunction, boolean z) {
        LuaThread$a luaThread$a = this.T.f0.P;
        boolean z2 = luaThread$a.k == 1;
        if (z2) {
            luaThread$a.k = 2;
        }
        Y2().g(luaFunction, z2, z);
        if (luaThread$a.k != 0) {
            return;
        }
        if (luaThread$a.f1671g) {
            luaThread$a.l = 0;
            luaThread$a.m = 0;
        }
        if (luaThread$a.h) {
            X2(luaThread$a, z ? Y : X, LuaValue.f1673c);
        }
    }

    public void k3(int i, Varargs varargs, int i2) {
        LuaThread luaThread = this.T.f0;
        LuaThread$a luaThread$a = luaThread.P;
        Z2(luaThread).h(i, varargs, i2);
        if (luaThread$a.k == 0 && luaThread$a.f1670f != null) {
            int i3 = luaThread$a.j;
            if (i3 > 0) {
                int i4 = luaThread$a.n + 1;
                luaThread$a.n = i4;
                if (i4 % i3 == 0) {
                    X2(luaThread$a, a0, LuaValue.f1673c);
                }
            }
            if (luaThread$a.f1671g) {
                int iB = Y2().b();
                if (iB != luaThread$a.l || i <= luaThread$a.m) {
                    luaThread$a.l = iB;
                    X2(luaThread$a, Z, LuaValue.I2(iB));
                }
                luaThread$a.m = i;
            }
        }
    }

    public void l3() {
        LuaThread$a luaThread$a = this.T.f0.P;
        if (luaThread$a.k == 0 && luaThread$a.i) {
            X2(luaThread$a, b0, LuaValue.f1673c);
        }
        Y2().i(luaThread$a);
    }

    public String m3(Globals globals, int i) {
        return Y2().m(globals, i);
    }
}
