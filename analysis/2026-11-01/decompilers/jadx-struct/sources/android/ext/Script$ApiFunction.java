package android.ext;

import java.io.IOException;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import luaj.Globals;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.lib.VarArgFunction;

/* JADX INFO: loaded from: classes.dex */
public abstract class Script$ApiFunction extends VarArgFunction {
    static WeakReference Y = new WeakReference(null);
    static WeakReference Z = new WeakReference(null);
    private static Map a0 = null;
    private static Map b0 = null;
    private static Map c0 = null;
    private static Map d0 = null;
    private String X;
    private final boolean W = this instanceof Script$BusyApiFunction;
    private volatile Varargs T = null;
    private volatile Throwable U = null;
    protected volatile Object V = new Object();

    private static Map X2(int i) {
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < 8; i2++) {
            if (((1 << i2) & i) != 0) {
                map.put(Script.t0[i2], LuaValue.f1673c);
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    static boolean e3(Script$ApiFunction script$ApiFunction, Writer writer, int i, LuaValue luaValue) throws IOException {
        Map mapX2;
        if (luaValue instanceof LuaString) {
            return Script$Consts.d(writer, luaValue.g0());
        }
        if (luaValue instanceof LuaTable) {
            if (script$ApiFunction == null || i != 1) {
                mapX2 = null;
            } else if ((script$ApiFunction instanceof Script$removeResults) || (script$ApiFunction instanceof Script$loadResults) || (script$ApiFunction instanceof Script$getValues)) {
                mapX2 = a0;
                if (mapX2 == null) {
                    mapX2 = X2(5);
                    a0 = mapX2;
                }
            } else if (script$ApiFunction instanceof Script$setValues) {
                mapX2 = b0;
                if (mapX2 == null) {
                    mapX2 = X2(7);
                    b0 = mapX2;
                }
            } else if ((script$ApiFunction instanceof Script$getValuesRange) || (script$ApiFunction instanceof Script$removeListItems)) {
                mapX2 = c0;
                if (mapX2 == null) {
                    mapX2 = X2(1);
                    c0 = mapX2;
                }
            } else if (script$ApiFunction instanceof Script$addListItems) {
                mapX2 = d0;
                if (mapX2 == null) {
                    mapX2 = X2(255);
                    d0 = mapX2;
                }
            } else {
                mapX2 = null;
            }
            ((LuaTable) luaValue).E3(writer, mapX2);
        } else {
            writer.write(luaValue.g0());
        }
        return true;
    }

    private void f3(Writer writer, Varargs varargs) throws IOException {
        int iU = varargs.U();
        int iY2 = Y2();
        if (iY2 >= 0 && iU > iY2) {
            iU = iY2;
        }
        for (int i = 1; i <= iU; i++) {
            if (i != 1) {
                writer.write(", ");
            }
            if (!d3(writer, i, varargs.v(i))) {
                return;
            }
        }
    }

    protected static boolean g3(Writer writer, Script$Const[] script$ConstArr, LuaValue luaValue) {
        return Script$Consts.a(writer, script$ConstArr, luaValue.y2());
    }

    protected static boolean h3(Writer writer, LuaValue luaValue) {
        return Script$Consts.b(writer, luaValue.z2());
    }

    @Override // luaj.LuaFunction
    public String T2() {
        String str = this.X;
        if (str != null) {
            return str;
        }
        String strT2 = super.T2();
        this.X = strT2;
        return strT2;
    }

    protected abstract int Y2();

    protected String Z2() {
        return null;
    }

    protected Varargs a3() {
        return LuaValue.f1674d;
    }

    public Varargs b3(Varargs varargs) {
        this.T = null;
        this.U = null;
        Script$ApiFunction$1 script$ApiFunction$1 = new Script$ApiFunction$1(this, varargs);
        synchronized (this.V) {
            try {
                n2.i(script$ApiFunction$1);
                Script.W3(this.V);
            } catch (Throwable th) {
                throw th;
            }
        }
        Throwable th2 = this.U;
        this.U = null;
        if (th2 != null) {
            this.T = null;
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw new RuntimeException(th2);
        }
        Varargs varargs2 = this.T;
        this.T = null;
        if (!this.W || varargs2 != null) {
            return varargs2;
        }
        String strZ2 = Z2();
        return strZ2 == null ? a3() : LuaValue.K2(strZ2);
    }

    public Varargs c3(Varargs varargs) {
        return LuaValue.f1673c;
    }

    protected boolean d3(Writer writer, int i, LuaValue luaValue) {
        return e3(this, writer, i, luaValue);
    }

    @Override // luaj.lib.LibFunction, luaj.LuaFunction, luaj.LuaValue, luaj.Varargs
    public String g0() {
        String strK3 = k3();
        String strReplace = strK3.replace("[", "").replace("]", "").replace(" ,", ",");
        Pattern pattern = (Pattern) Y.get();
        if (pattern == null) {
            Pattern patternCompile = Pattern.compile(".*(\\(.*\\)).*");
            Y = new WeakReference(patternCompile);
            pattern = patternCompile;
        }
        String strReplaceAll = pattern.matcher(strReplace).replaceAll("$1");
        Pattern pattern2 = (Pattern) Z.get();
        if (pattern2 == null) {
            Pattern patternCompile2 = Pattern.compile("(?<=[\\(,])( ?)\\s*\\S*\\s*(\\S*)(\\s*=\\s*[^,\\)]*)?(?=[,\\)])");
            Z = new WeakReference(patternCompile2);
            pattern2 = patternCompile2;
        }
        return "function " + pattern2.matcher(strReplaceAll).replaceAll("$1$2") + " end, -- " + strK3;
    }

    protected void i3(Writer writer, Varargs varargs) throws IOException {
        if ((this instanceof Script$isVisible) || (this instanceof Script$internal1) || (this instanceof Script$internal2) || (this instanceof Script$sleep)) {
            return;
        }
        writer.write(T2());
        writer.write("(");
        f3(writer, varargs);
        writer.write(")\n");
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public final Varargs invoke(Varargs varargs) {
        ThreadLocal threadLocal = Varargs.f1678a;
        VarArgFunction varArgFunction = (VarArgFunction) threadLocal.get();
        threadLocal.set(this);
        try {
            LuaValue luaValueW = varargs.w();
            if ((luaValueW instanceof LuaString) && luaValueW.W1() > 1000000) {
                varargs = LuaValue.N2(luaValueW.G0().j3(0, 1000000), varargs.e0(2));
            }
            Script$DebugLog script$DebugLog = Script.w0;
            if (script$DebugLog != null) {
                long jNanoTime = System.nanoTime();
                try {
                    i3(script$DebugLog.f378a, varargs);
                } catch (Throwable th) {
                    e1.s("Failed write log for " + T2(), th);
                }
                Globals globals = script$DebugLog.f379b;
                globals.b0 = (int) (((long) globals.b0) + ((System.nanoTime() - jNanoTime) / 1000000));
            }
            Varargs varargsB3 = b3(varargs);
            if (((this instanceof Script$alert) || (this instanceof Script$prompt) || (this instanceof Script$choice) || (this instanceof Script$multiChoice)) && script$DebugLog != null) {
                long jNanoTime2 = System.nanoTime();
                try {
                    Writer writer = script$DebugLog.f378a;
                    writer.write("--[[ return: ");
                    writer.write(varargsB3 == null ? "null" : varargsB3.toString());
                    writer.write(" ]]\n");
                } catch (Throwable th2) {
                    e1.s("Failed log for " + T2(), th2);
                }
                Globals globals2 = script$DebugLog.f379b;
                globals2.b0 = (int) (((long) globals2.b0) + ((System.nanoTime() - jNanoTime2) / 1000000));
            }
            if ((this instanceof Script$getResults) && (varargsB3 instanceof LuaTable) && script$DebugLog != null) {
                long jNanoTime3 = System.nanoTime();
                try {
                    Writer writer2 = script$DebugLog.f378a;
                    writer2.write("--[[ count: ");
                    writer2.write(Integer.toString(((LuaTable) varargsB3).W1()));
                    writer2.write(" ]]\n");
                } catch (Throwable th3) {
                    e1.s("Failed log for " + T2(), th3);
                }
                Globals globals3 = script$DebugLog.f379b;
                globals3.b0 = (int) (((long) globals3.b0) + ((System.nanoTime() - jNanoTime3) / 1000000));
            }
            if (varargsB3 == LuaValue.f1674d && (((this instanceof Script$searchNumber) || (this instanceof Script$refineNumber) || (this instanceof Script$startFuzzy) || (this instanceof Script$searchFuzzy) || (this instanceof Script$searchAddress) || (this instanceof Script$refineAddress)) && script$DebugLog != null)) {
                long jNanoTime4 = System.nanoTime();
                try {
                    Writer writer3 = script$DebugLog.f378a;
                    writer3.write("--[[ found: ");
                    writer3.write(Long.toString(MainService.instance.p0));
                    writer3.write(" ]]\n");
                } catch (Throwable th4) {
                    e1.s("Failed log for " + T2(), th4);
                }
                Globals globals4 = script$DebugLog.f379b;
                globals4.b0 = (int) (((long) globals4.b0) + ((System.nanoTime() - jNanoTime4) / 1000000));
            }
            threadLocal.set(varArgFunction);
            return varargsB3;
        } catch (Throwable th5) {
            threadLocal.set(varArgFunction);
            throw th5;
        }
    }

    public void j3(Varargs varargs) {
        Varargs varargsC3;
        Throwable th = null;
        try {
            varargsC3 = c3(varargs);
            try {
                this.T = varargsC3;
            } catch (Throwable th2) {
                th = th2;
                this.U = th;
            }
        } catch (Throwable th3) {
            th = th3;
            varargsC3 = null;
        }
        if (this.W && varargsC3 == null && th == null) {
            return;
        }
        synchronized (this.V) {
            try {
                this.V.notifyAll();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    abstract String k3();
}
