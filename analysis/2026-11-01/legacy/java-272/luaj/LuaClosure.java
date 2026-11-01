package luaj;

import android.ext.Script;
import luaj.lib.DebugLib;

/* JADX INFO: loaded from: classes.dex */
public class LuaClosure extends LuaFunction {
    private static final i[] X = new i[0];
    private static int Y;
    public final h R;
    public i[] S;
    final Globals T;
    public String U = null;
    private Varargs V = LuaValue.f1676f;
    public volatile int W;

    public LuaClosure(h hVar, LuaValue luaValue, boolean z) {
        this.R = hVar;
        f.d[] dVarArr = hVar.f1728f;
        if (dVarArr == null || dVarArr.length == 0) {
            this.S = X;
        } else {
            int length = dVarArr.length;
            i[] iVarArr = new i[length];
            if (z) {
                LuaValue[] luaValueArr = new LuaValue[length];
                luaValueArr[0] = luaValue;
                iVarArr[0] = new i(luaValueArr, 0);
                for (int i = 1; i < length; i++) {
                    luaValueArr[i] = LuaValue.f1673c;
                    iVarArr[i] = new i(luaValueArr, i);
                }
            }
            this.S = iVarArr;
        }
        this.T = luaValue instanceof Globals ? (Globals) luaValue : null;
    }

    private LuaValue V2(LuaValue luaValue) {
        if (luaValue != null) {
            return luaValue;
        }
        throw new NullPointerException("return null as LuaValue");
    }

    private Varargs W2(Varargs varargs) {
        if (varargs != null) {
            return varargs;
        }
        throw new NullPointerException("return null as Varargs");
    }

    private static void X2(Globals globals, d dVar, StringBuilder sb) {
        if (globals != null) {
            LuaThread luaThread = globals.f0;
            if (luaThread.S != null) {
                String string = sb.toString();
                dVar.f1712e = string;
                try {
                    LuaValue luaValue = luaThread.S;
                    LuaValue luaValueK2 = dVar.f1714g;
                    if (luaValueK2 == null) {
                        luaValueK2 = LuaValue.K2(string);
                    }
                    dVar.f1714g = luaValue.call(luaValueK2);
                    return;
                } catch (Throwable unused) {
                    dVar.f1714g = LuaValue.K2("error in error handling");
                    return;
                }
            }
            if (globals.i0 != null) {
                sb.append('\n');
                sb.append(globals.i0.m3(globals, dVar.f1708a));
            }
        }
        dVar.f1712e = sb.toString();
    }

    private i Z2(LuaValue[] luaValueArr, short s, i[] iVarArr) {
        int length = iVarArr.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            i iVar = iVarArr[i2];
            if (iVar != null) {
                if (iVar.f1731b == s) {
                    return iVar;
                }
            } else if (i < 0) {
                i = i2;
            }
        }
        if (i >= 0) {
            i iVar2 = new i(luaValueArr, s);
            iVarArr[i] = iVar2;
            return iVar2;
        }
        LuaValue.R0("No space for upvalue " + length);
        return null;
    }

    private LuaValue[] a3() {
        int i = this.R.l;
        LuaValue[] luaValueArr = new LuaValue[i];
        System.arraycopy(LuaValue.O, 0, luaValueArr, 0, i);
        return luaValueArr;
    }

    private static void c3(Globals globals, d dVar, h hVar, int i, String str) {
        DebugLib.a aVarD3;
        DebugLib debugLib;
        if (dVar.f1712e != null) {
            return;
        }
        if (hVar != null) {
            if (globals == null || (debugLib = globals.i0) == null) {
                aVarD3 = null;
            } else {
                aVarD3 = debugLib.d3(dVar.f1708a);
                if (aVarD3 != null) {
                    String strI = aVarD3.i();
                    if (strI == null) {
                        strI = "?";
                    }
                    dVar.f1710c = strI;
                    dVar.f1711d = aVarD3.a();
                }
            }
            if (aVarD3 == null) {
                LuaString luaString = hVar.f1729g;
                dVar.f1710c = luaString != null ? luaString.g0() : "?";
                int[] iArr = hVar.f1726d;
                dVar.f1711d = (iArr == null || i < 0 || i >= iArr.length) ? -1 : iArr[i];
            }
            dVar.d();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.getMessage());
        if (str != null) {
            sb.append(" (");
            sb.append(str);
            sb.append(")");
        }
        sb.append("\nlevel = ");
        sb.append(dVar.f1708a);
        if (hVar != null) {
            sb.append(", const = ");
            sb.append(hVar.f1723a.length);
            sb.append(", proto = ");
            sb.append(hVar.f1725c.length);
            sb.append(", upval = ");
            sb.append(hVar.f1728f.length);
            sb.append(", vars = ");
            sb.append(hVar.l);
            sb.append(", code = ");
            sb.append(hVar.f1724b.length);
            sb.append('\n');
            if (i < 0 || i >= hVar.f1724b.length) {
                sb.append("PC ");
                sb.append(i);
            } else {
                g.F(sb, hVar, i, null);
                sb.append('\n');
                g.v(sb, i, hVar.f1724b[i]);
            }
        }
        X2(globals, dVar, sb);
    }

    public static Varargs d3(Globals globals, LuaFunction luaFunction, LuaValue luaValue, Varargs varargs) {
        DebugLib debugLib;
        DebugLib debugLib2;
        DebugLib debugLib3;
        if (globals != null && (debugLib3 = globals.i0) != null) {
            debugLib3.j3(luaFunction, false);
        }
        int i = Y;
        Y = 0;
        try {
            Varargs varargsN2 = LuaValue.N2(LuaValue.f1674d, luaValue.invoke(varargs));
            Y = i;
            if (globals != null && (debugLib2 = globals.i0) != null) {
                debugLib2.l3();
            }
            return varargsN2;
        } catch (Throwable th) {
            try {
                d aVar = th instanceof d ? th : new d.a(th);
                if (aVar.f1712e == null) {
                    c3(globals, aVar, null, 0, null);
                }
                LuaValue luaValueB = aVar.b();
                LuaBoolean luaBoolean = LuaValue.f1675e;
                if (luaValueB == null) {
                    luaValueB = LuaValue.f1673c;
                }
                return LuaValue.N2(luaBoolean, luaValueB);
            } finally {
                Y = i;
                if (globals != null && (debugLib = globals.i0) != null) {
                    debugLib.l3();
                }
            }
        }
    }

    private void e3(LuaValue luaValue) {
        if (luaValue instanceof Script.DebugFunction) {
            ((Script.DebugFunction) luaValue).l3(this);
        }
    }

    private static d g3(int i, int i2, int i3) {
        return new d("Damaged script " + i + ": an attempt to get an upvalue with index " + i2 + " when there are " + i3 + " in total.");
    }

    @Override // luaj.LuaValue
    public final Varargs D1(Varargs varargs, boolean z) {
        h hVar;
        int i;
        LuaValue[] luaValueArrA3 = a3();
        h hVar2 = this.R;
        if (hVar2.l < hVar2.j) {
            throw new d("Damaged script: .maxstacksize (" + this.R.l + ") < .numparams (" + this.R.j + ")");
        }
        int i2 = 0;
        while (true) {
            hVar = this.R;
            i = hVar.j;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 + 1;
            luaValueArrA3[i2] = varargs.v(i3);
            i2 = i3;
        }
        return Y2(luaValueArrA3, hVar.k == 0 ? LuaValue.f1676f : varargs.e0(i + 1), z);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 48941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    protected luaj.Varargs Y2(luaj.LuaValue[] r40, luaj.Varargs r41, boolean r42) {
        /*
            Method dump skipped, instruction units count: 4894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: luaj.LuaClosure.Y2(luaj.LuaValue[], luaj.Varargs, boolean):luaj.Varargs");
    }

    public Varargs b3() {
        return this.V;
    }

    @Override // luaj.LuaValue
    public final LuaValue call() {
        return Y2(a3(), LuaValue.f1676f, false).w();
    }

    @Override // luaj.LuaValue
    public boolean f1() {
        return true;
    }

    public void f3(Varargs varargs) {
        this.V = varargs;
    }

    @Override // luaj.LuaFunction, luaj.LuaValue, luaj.Varargs
    public String g0() {
        return "function: " + this.R.toString();
    }

    @Override // luaj.LuaValue
    public final Varargs invoke(Varargs varargs) {
        return D1(varargs, false).N();
    }

    @Override // luaj.LuaValue
    public LuaClosure w0() {
        return this;
    }

    @Override // luaj.LuaValue
    public final LuaValue call(LuaValue luaValue) {
        LuaValue[] luaValueArrA3 = a3();
        h hVar = this.R;
        if (hVar.j == 0) {
            if (hVar.k == 0) {
            }
            return Y2(luaValueArrA3, luaValue, false).w();
        }
        luaValueArrA3[0] = luaValue;
        luaValue = LuaValue.f1676f;
        return Y2(luaValueArrA3, luaValue, false).w();
    }

    @Override // luaj.LuaValue
    public final LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        Varargs varargsN2;
        Varargs varargsY2;
        LuaValue[] luaValueArrA3 = a3();
        h hVar = this.R;
        int i = hVar.j;
        if (i == 0) {
            if (hVar.k != 0) {
                varargsN2 = LuaValue.N2(luaValue, luaValue2);
            }
            varargsY2 = Y2(luaValueArrA3, varargsN2, false);
            return varargsY2.w();
        }
        if (i != 1) {
            luaValueArrA3[0] = luaValue;
            luaValueArrA3[1] = luaValue2;
        } else {
            luaValueArrA3[0] = luaValue;
            if (hVar.k == 0) {
                luaValue2 = LuaValue.f1676f;
            }
            varargsY2 = Y2(luaValueArrA3, luaValue2, false);
        }
        return varargsY2.w();
        varargsN2 = LuaValue.f1676f;
        varargsY2 = Y2(luaValueArrA3, varargsN2, false);
        return varargsY2.w();
    }

    @Override // luaj.LuaValue
    public final LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        Varargs varargsY2;
        Varargs varargsM2;
        LuaValue[] luaValueArrA3 = a3();
        h hVar = this.R;
        int i = hVar.j;
        if (i != 0) {
            if (i == 1) {
                luaValueArrA3[0] = luaValue;
                if (hVar.k != 0) {
                    varargsM2 = LuaValue.N2(luaValue2, luaValue3);
                }
                varargsY2 = Y2(luaValueArrA3, varargsM2, false);
            } else if (i != 2) {
                luaValueArrA3[0] = luaValue;
                luaValueArrA3[1] = luaValue2;
                luaValueArrA3[2] = luaValue3;
            } else {
                luaValueArrA3[0] = luaValue;
                luaValueArrA3[1] = luaValue2;
                if (hVar.k == 0) {
                    luaValue3 = LuaValue.f1676f;
                }
                varargsY2 = Y2(luaValueArrA3, luaValue3, false);
            }
            varargsY2 = Y2(luaValueArrA3, varargsM2, false);
        } else {
            varargsM2 = hVar.k == 0 ? LuaValue.f1676f : LuaValue.M2(luaValue, luaValue2, luaValue3);
            varargsY2 = Y2(luaValueArrA3, varargsM2, false);
        }
        return varargsY2.w();
    }
}
