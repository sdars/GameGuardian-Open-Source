/*
 * Decompiled with CFR 0.152.
 */
package luaj.lib;

import luaj.Globals;
import luaj.LuaBoolean;
import luaj.LuaClosure;
import luaj.LuaFunction;
import luaj.LuaNil;
import luaj.LuaNumber;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaThread;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.d;
import luaj.g;
import luaj.h;
import luaj.i;
import luaj.lib.LibFunction;
import luaj.lib.TwoArgFunction;
import luaj.lib.VarArgFunction;
import luaj.lib.ZeroArgFunction;

public class DebugLib
extends TwoArgFunction {
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        boolean bl;
        boolean bl2 = true;
        try {
            bl = System.getProperty("CALLS") != null;
            U = bl;
        }
        catch (Exception exception) {}
        try {
            bl = System.getProperty("TRACE") != null ? bl2 : false;
            V = bl;
        }
        catch (Exception exception) {}
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

    private static LuaString a3(f.d d4, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(.upval ");
        if (d4 != null) {
            char c4 = d4.b ? (char)'v' : 'u';
            stringBuilder.append(c4);
            stringBuilder.append(d4.c);
        } else {
            stringBuilder.append("???");
        }
        stringBuilder.append(" \"(*no name)\"; u");
        stringBuilder.append(n3);
        stringBuilder.append(')');
        return LuaString.K2(stringBuilder.toString());
    }

    static int b3(h h4, int n3, int n4) {
        int n5 = -1;
        int n6 = 0;
        while (n6 < n3) {
            int n7;
            int n8;
            block10: {
                block17: {
                    int n9;
                    int n10;
                    int n11;
                    block11: {
                        block12: {
                            block13: {
                                block14: {
                                    block15: {
                                        block16: {
                                            block9: {
                                                n11 = h4.b[n6];
                                                n10 = luaj.b.i(n11);
                                                if (n10 < 47) break block9;
                                                n8 = n5;
                                                n7 = n6;
                                                break block10;
                                            }
                                            n9 = luaj.b.c(n11);
                                            if (n10 == 4) break block11;
                                            if (n10 == 23) break block12;
                                            if (n10 == 27) break block13;
                                            if (n10 == 34) break block14;
                                            if (n10 == 36) break block15;
                                            if (n10 == 29 || n10 == 30) break block16;
                                            n8 = n5;
                                            n7 = n6;
                                            if (!luaj.b.q(n10)) break block10;
                                            n8 = n5;
                                            n7 = n6;
                                            if (n4 != n9) break block10;
                                            break block17;
                                        }
                                        n8 = n5;
                                        n7 = n6;
                                        if (n4 < n9) break block10;
                                        break block17;
                                    }
                                    n8 = n5;
                                    n7 = n6;
                                    if ((n11 >> 14 & 0x1FF) == 0) {
                                        n7 = n6 + 1;
                                        n8 = n5;
                                    }
                                    break block10;
                                }
                                n8 = n5;
                                n7 = n6;
                                if (n4 < n9 + 2) break block10;
                                break block17;
                            }
                            n8 = n5;
                            n7 = n6;
                            if (n4 != n9) break block10;
                            break block17;
                        }
                        n10 = luaj.b.h(n11);
                        n9 = n6 + 1 + n10;
                        n8 = n5;
                        n7 = n6;
                        if (n6 < n9) {
                            n8 = n5;
                            n7 = n6;
                            if (n9 <= n3) {
                                n7 = n6 + n10;
                                n8 = n5;
                            }
                        }
                        break block10;
                    }
                    n10 = luaj.b.e(n11);
                    n8 = n5;
                    n7 = n6;
                    if (n9 > n4) break block10;
                    n8 = n5;
                    n7 = n6;
                    if (n4 > n9 + n10) break block10;
                }
                n8 = n6;
                n7 = n6;
            }
            n6 = n7 + 1;
            n5 = n8;
        }
        return n5;
    }

    static LuaString c3(LuaClosure object, int n3) {
        Object object2 = object.S;
        if (object2 != null && n3 > 0 && n3 <= ((i[])object2).length) {
            object = object.R.f;
            if (object != null && n3 <= ((f.d[])object).length) {
                f.d d4 = object[n3 - 1];
                object2 = d4.a;
                object = object2;
                if (object2 == null) {
                    object = DebugLib.a3(d4, n3);
                }
                return object;
            }
            return DebugLib.a3(null, n3);
        }
        return null;
    }

    static d e3(a object) {
        if (!((a)object).a.f1()) {
            return new d(((a)object).a.S2(), "Java");
        }
        h h4 = ((a)object).a.w0().R;
        int n3 = ((a)object).b;
        object = h4.b;
        if (n3 >= ((Object)object).length) {
            return null;
        }
        Object object2 = object[n3];
        switch (luaj.b.i((int)object2)) {
            default: {
                return null;
            }
            case 46: {
                object = LuaValue.J;
                break;
            }
            case 45: {
                object = LuaValue.I;
                break;
            }
            case 44: {
                object = LuaValue.H;
                break;
            }
            case 43: {
                object = LuaValue.G;
                break;
            }
            case 42: {
                object = LuaValue.F;
                break;
            }
            case 41: {
                object = LuaValue.E;
                break;
            }
            case 40: {
                object = LuaValue.D;
                break;
            }
            case 34: {
                return new d("for iterator", "for iterator");
            }
            case 29: 
            case 30: {
                return DebugLib.g3(h4, n3, luaj.b.c((int)object2));
            }
            case 26: {
                object = LuaValue.A;
                break;
            }
            case 25: {
                object = LuaValue.z;
                break;
            }
            case 24: {
                object = LuaValue.y;
                break;
            }
            case 22: {
                object = LuaValue.C;
                break;
            }
            case 21: {
                object = LuaValue.x;
                break;
            }
            case 19: {
                object = LuaValue.w;
                break;
            }
            case 18: {
                object = LuaValue.u;
                break;
            }
            case 17: {
                object = LuaValue.v;
                break;
            }
            case 16: {
                object = LuaValue.s;
                break;
            }
            case 15: {
                object = LuaValue.t;
                break;
            }
            case 14: {
                object = LuaValue.r;
                break;
            }
            case 13: {
                object = LuaValue.q;
                break;
            }
            case 8: 
            case 10: {
                object = LuaValue.m;
                break;
            }
            case 6: 
            case 7: 
            case 12: {
                object = LuaValue.l;
            }
        }
        return new d(((LuaString)object).g0(), "metamethod");
    }

    public static String f3(int n3, int n4, h object) {
        object = (object = DebugLib.g3((h)object, n3, n4)) == null ? null : ((d)object).toString();
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    static d g3(h object, int n3, int n4) {
        Object object2 = ((h)object).a(n4 + 1, n3);
        if (object2 != null) {
            return new d(((LuaString)object2).g0(), "local");
        }
        n3 = DebugLib.b3((h)object, n3, n4);
        object2 = null;
        if (n3 == -1) return null;
        n4 = ((h)object).b[n3];
        int n5 = luaj.b.i(n4);
        if (n5 == 0) {
            n5 = luaj.b.c(n4);
            if ((n4 = luaj.b.e(n4)) >= n5) return null;
            return DebugLib.g3((h)object, n3, n4);
        }
        if (n5 != 1 && n5 != 2) {
            if (n5 != 5) {
                if (n5 != 6 && n5 != 7) {
                    if (n5 == 12) return new d(DebugLib.h3((h)object, n3, luaj.b.g(n4)), "method");
                    return null;
                }
                int n6 = luaj.b.g(n4);
                n5 = luaj.b.e(n4);
                object2 = luaj.b.i(n4) == 7 ? ((h)object).a(n5 + 1, n3) : (n5 < ((f.d[])(object2 = ((h)object).f)).length ? object2[n5].a : W);
                String string2 = DebugLib.h3((h)object, n3, n6);
                if (object2 != null && ((LuaString)object2).P0(LuaValue.k)) {
                    object = "global";
                    return new d(string2, (String)object);
                }
                object = "field";
                return new d(string2, (String)object);
            }
            n3 = luaj.b.e(n4);
            object = n3 < ((Object)(object = ((h)object).f)).length ? ((f.d)object[n3]).a : W;
            if (object != null) return new d(((LuaString)object).g0(), "upvalue");
            return object2;
        }
        n3 = luaj.b.i(n4) == 1 ? luaj.b.f(n4) : luaj.b.d(((h)object).b[n3 + 1]);
        if (!((h)object).a[n3].n1()) return null;
        return new d(((h)object).a[n3].q2().g0(), "constant");
    }

    static String h3(h object, int n3, int n4) {
        if (luaj.b.k(n4)) {
            object = ((h)object).a[luaj.b.j(n4)];
            if (((LuaValue)object).n1()) {
                return ((LuaValue)object).g0();
            }
        } else if ((object = DebugLib.g3((h)object, n3, n4)) != null && "constant".equals(((d)object).b)) {
            return ((d)object).a;
        }
        return "?";
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void X2(LuaThread.a a4, LuaValue object, LuaValue luaValue) {
        Throwable throwable322;
        block12: {
            RuntimeException runtimeException222;
            block13: {
                boolean bl;
                block11: {
                    LuaFunction luaFunction;
                    block10: {
                        luaFunction = a4.f;
                        if (a4.k != 0) return;
                        if (luaFunction == null) {
                            return;
                        }
                        a4.k = 1;
                        bl = true ^ luaFunction.f1();
                        if (!bl) break block10;
                        this.j3(luaFunction, false);
                    }
                    luaFunction.call((LuaValue)object, luaValue);
                    if (!bl) break block11;
                    this.l3();
                }
                a4.k = 0;
                return;
                catch (Throwable throwable2) {
                    if (!bl) throw throwable2;
                    try {
                        this.l3();
                        throw throwable2;
                    }
                    catch (Throwable throwable322) {
                        break block12;
                    }
                    catch (RuntimeException runtimeException222) {
                        break block13;
                    }
                    catch (luaj.d d4) {
                        throw d4;
                    }
                }
            }
            object = new d.a(runtimeException222);
            throw object;
        }
        a4.k = 0;
        throw throwable322;
    }

    b Y2() {
        return this.Z2(this.T.f0);
    }

    b Z2(LuaThread luaThread) {
        if (luaThread.Q == null) {
            luaThread.Q = new b();
        }
        return (b)luaThread.Q;
    }

    @Override
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        luaValue = luaValue2.z0();
        this.T = luaValue;
        ((Globals)luaValue).i0 = this;
        luaValue = new LuaTable();
        luaValue.i2("debug", new debug());
        luaValue.i2("gethook", new gethook(this));
        luaValue.i2("getinfo", new getinfo(this));
        luaValue.i2("getlocal", new getlocal(this));
        luaValue.i2("getmetatable", new getmetatable());
        luaValue.i2("getregistry", new getregistry(this));
        luaValue.i2("getupvalue", new getupvalue());
        luaValue.i2("sethook", new sethook(this));
        luaValue.i2("setlocal", new setlocal(this));
        luaValue.i2("setmetatable", new setmetatable());
        luaValue.i2("setupvalue", new setupvalue());
        luaValue.i2("traceback", new traceback(this));
        luaValue.i2("upvalueid", new upvalueid());
        luaValue.i2("upvaluejoin", new upvaluejoin());
        luaValue2.i2("debug", luaValue);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("debug", luaValue);
        }
        return luaValue;
    }

    public a d3(int n3) {
        return this.Y2().e(n3);
    }

    public void i3(LuaClosure luaValue, Varargs varargs, LuaValue[] luaValueArray, boolean bl) {
        LuaThread.a a4 = this.T.f0.P;
        boolean bl2 = a4.k == 1;
        if (bl2) {
            a4.k = 2;
        }
        this.Y2().f((LuaClosure)luaValue, varargs, luaValueArray, bl2, bl);
        if (a4.k != 0) {
            return;
        }
        if (a4.g) {
            a4.l = 0;
            a4.m = 0;
        }
        if (a4.h) {
            luaValue = bl ? Y : X;
            this.X2(a4, luaValue, LuaValue.c);
        }
    }

    public void j3(LuaFunction luaValue, boolean bl) {
        LuaThread.a a4 = this.T.f0.P;
        int n3 = a4.k;
        boolean bl2 = true;
        if (n3 != 1) {
            bl2 = false;
        }
        if (bl2) {
            a4.k = 2;
        }
        this.Y2().g((LuaFunction)luaValue, bl2, bl);
        if (a4.k != 0) {
            return;
        }
        if (a4.g) {
            a4.l = 0;
            a4.m = 0;
        }
        if (a4.h) {
            luaValue = bl ? Y : X;
            this.X2(a4, luaValue, LuaValue.c);
        }
    }

    public void k3(int n3, Varargs varargs, int n4) {
        LuaThread luaThread = this.T.f0;
        LuaThread.a a4 = luaThread.P;
        this.Z2(luaThread).h(n3, varargs, n4);
        if (a4.k != 0) {
            return;
        }
        if (a4.f == null) {
            return;
        }
        n4 = a4.j;
        if (n4 > 0) {
            int n5;
            a4.n = n5 = a4.n + 1;
            if (n5 % n4 == 0) {
                this.X2(a4, a0, LuaValue.c);
            }
        }
        if (a4.g) {
            n4 = this.Y2().b();
            if (n4 != a4.l || n3 <= a4.m) {
                a4.l = n4;
                this.X2(a4, Z, LuaValue.I2(n4));
            }
            a4.m = n3;
        }
    }

    public void l3() {
        LuaThread.a a4 = this.T.f0.P;
        if (a4.k == 0 && a4.i) {
            this.X2(a4, b0, LuaValue.c);
        }
        this.Y2().i(a4);
    }

    public String m3(Globals globals, int n3) {
        return this.Y2().m(globals, n3);
    }

    public static class a {
        LuaFunction a;
        int b;
        private LuaValue[] c;
        a d;
        boolean e;
        boolean f;

        public int a() {
            boolean bl = this.a.f1();
            int n3 = -1;
            if (!bl) {
                return -1;
            }
            int[] nArray = this.a.w0().R.d;
            int n4 = n3;
            if (nArray != null) {
                int n5 = this.b;
                n4 = n3;
                if (n5 >= 0) {
                    n4 = n5 >= nArray.length ? n3 : nArray[n5];
                }
            }
            return n4;
        }

        Varargs b(int n3) {
            LuaValue luaValue;
            if (n3 < 0) {
                if (!this.a.f1()) {
                    return LuaValue.c;
                }
                Varargs varargs = this.a.w0();
                n3 = -n3;
                if ((varargs = ((LuaClosure)varargs).b3()) != null && n3 <= varargs.U()) {
                    return LuaValue.N2(r0, varargs.v(n3));
                }
                return LuaValue.c;
            }
            LuaString luaString = this.c(n3);
            Object object = this.c;
            if (object != null && n3 >= 1 && n3 <= ((LuaValue[])object).length && (luaValue = object[n3 - 1]) != null) {
                object = luaString;
                if (luaString == null) {
                    object = q0;
                }
                return LuaValue.N2((LuaValue)object, luaValue);
            }
            return LuaValue.c;
        }

        LuaString c(int n3) {
            if (!this.a.f1()) {
                return null;
            }
            return this.a.w0().R.a(n3, this.b);
        }

        void d(int n3, Varargs varargs, int n4) {
            this.b = n3;
            if (V) {
                luaj.g.I(this.a.w0(), n3, this.c, n4, varargs);
            }
        }

        void e() {
            this.a = null;
            this.c = null;
            this.b = 0;
            this.e = false;
            this.f = false;
        }

        void f(LuaClosure luaClosure, Varargs varargs, LuaValue[] luaValueArray, boolean bl, boolean bl2) {
            this.a = luaClosure;
            this.c = luaValueArray;
            this.b = 0;
            this.e = bl;
            this.f = bl2;
        }

        void g(LuaFunction luaFunction, boolean bl, boolean bl2) {
            this.a = luaFunction;
            this.c = null;
            this.b = 0;
            this.e = bl;
            this.f = bl2;
        }

        Varargs h(int n3, LuaValue luaValue) {
            int n4 = 1;
            if (n3 < 0) {
                if (!this.a.f1()) {
                    return LuaValue.c;
                }
                LuaClosure luaClosure = this.a.w0();
                int n5 = -n3;
                Varargs varargs = luaClosure.b3();
                if (varargs != null && n5 <= varargs.U()) {
                    int n6 = varargs.U();
                    LuaValue[] luaValueArray = new LuaValue[n6];
                    for (n3 = n4; n3 <= n6; ++n3) {
                        LuaValue luaValue2 = n5 == n3 ? luaValue : varargs.v(n3);
                        luaValueArray[n3 - 1] = luaValue2;
                    }
                    luaClosure.f3(LuaValue.O2(luaValueArray));
                    return r0;
                }
                return LuaValue.c;
            }
            LuaString luaString = this.c(n3);
            LuaValue[] luaValueArray = this.c;
            if (luaValueArray != null && n3 >= 1 && n3 <= luaValueArray.length && luaValueArray[--n3] != null) {
                luaValueArray[n3] = luaValue;
                luaValue = luaString;
                if (luaString == null) {
                    luaValue = q0;
                }
                return luaValue;
            }
            return LuaValue.c;
        }

        public String i() {
            String string2 = this.a.f1() ? this.a.w0().R.b() : "[Java]";
            return string2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CallFrame [f=");
            stringBuilder.append(this.a);
            stringBuilder.append(", pc=");
            stringBuilder.append(this.b);
            stringBuilder.append(", hookcall=");
            stringBuilder.append(this.e);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public static class b {
        static final a[] c = new a[0];
        a[] a = c;
        int b = 0;

        b() {
        }

        /*
         * Enabled aggressive block sorting
         */
        private static LuaValue d(StringBuffer stringBuffer, LuaTable object, LuaValue luaValue, int n3) {
            if (object != null) {
                LuaTable.i i3 = ((LuaTable)object).s3();
                while (i3.c()) {
                    if (i3.a() != 0 || !((object = i3.b()) instanceof LuaString)) continue;
                    LuaValue luaValue2 = i3.d();
                    if (luaValue2 == luaValue) {
                        if (n3 != 2) {
                            return object;
                        }
                        stringBuffer.append("function '");
                        object = ((LuaValue)object).g0();
                    } else {
                        if (n3 <= 1 || !luaValue2.o1() || (luaValue2 = luaj.lib.DebugLib$b.d(stringBuffer, luaValue2.H0(), luaValue, n3 - 1)) == null) continue;
                        object = ((LuaValue)object).g0();
                        stringBuffer.append("function '");
                        if (!((String)object).equals("_G")) {
                            stringBuffer.append((String)object);
                            stringBuffer.append('.');
                        }
                        object = luaValue2.g0();
                    }
                    stringBuffer.append((String)object);
                    stringBuffer.append('\'');
                    return LuaValue.c;
                }
            }
            return null;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private a j(boolean var1_1) {
            synchronized (this) {
                block8: {
                    var3_2 = 1;
                    if (var1_1) {
                        try {
                            return this.a[this.b - 1];
                        }
                        catch (Throwable var5_4) {
                            break block8;
                        }
                    }
                    var2_6 = this.b;
                    var5_5 /* !! */  = this.a;
                    if (var2_6 < var5_5 /* !! */ .length) ** GOTO lbl-1000
                    var4_7 = Math.max(4, var5_5 /* !! */ .length * 3 / 2);
                    var5_5 /* !! */  = new a[var4_7];
                    var6_8 = this.a;
                    System.arraycopy(var6_8, 0, var5_5 /* !! */ , 0, var6_8.length);
                    for (var2_6 = this.a.length; var2_6 < var4_7; ++var2_6) {
                        var5_5 /* !! */ [var2_6] = new a();
                    }
                    this.a = var5_5 /* !! */ ;
                    for (var2_6 = var3_2; var2_6 < var4_7; ++var2_6) {
                        var5_5 /* !! */ [var2_6].d = var5_5 /* !! */ [var2_6 - 1];
                    }
lbl-1000:
                    // 2 sources

                    {
                        var5_5 /* !! */  = this.a;
                        var2_6 = this.b;
                        this.b = var2_6 + 1;
                    }
                    return var5_5 /* !! */ [var2_6];
                }
                throw var5_4;
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        private static void k(StringBuffer stringBuffer, Globals globals, c c4) {
            int n3;
            if (luaj.lib.DebugLib$b.d(stringBuffer, globals, c4.m.a, 2) != null) {
                return;
            }
            if (c4.b.length() > 0) {
                stringBuffer.append(c4.b);
                stringBuffer.append(" '");
                stringBuffer.append(c4.a);
                n3 = 39;
            } else {
                if (c4.c.charAt(0) == 'm') {
                    stringBuffer.append("main chunk");
                    return;
                }
                if (c4.c.charAt(0) != 'J') {
                    stringBuffer.append("function <");
                    stringBuffer.append(c4.l);
                    stringBuffer.append(':');
                    stringBuffer.append(c4.f);
                    n3 = 62;
                } else {
                    n3 = 63;
                }
            }
            stringBuffer.append((char)n3);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        c a(String string2, LuaFunction luaFunction, a a4) {
            synchronized (this) {
                int n3;
                c c4;
                try {
                    c4 = new c();
                    n3 = string2.length();
                }
                catch (Throwable throwable) {}
                throw throwable;
                for (int i3 = 0; i3 < n3; ++i3) {
                    int n4 = string2.charAt(i3);
                    if (n4 != 83) {
                        if (n4 != 108) {
                            Object object;
                            if (n4 != 110) {
                                boolean bl = true;
                                boolean bl2 = true;
                                if (n4 != 116) {
                                    if (n4 != 117) continue;
                                    if (luaFunction != null && luaFunction.f1()) {
                                        object = luaFunction.w0().R;
                                        c4.h = (short)((h)object).f.length;
                                        c4.i = (short)((h)object).j;
                                        bl = ((h)object).k != 0 ? bl2 : false;
                                        c4.j = bl;
                                        continue;
                                    }
                                    c4.h = 0;
                                    c4.j = true;
                                    c4.i = 0;
                                    continue;
                                }
                                if (a4 == null || !a4.f) {
                                    bl = false;
                                }
                                c4.k = bl;
                                continue;
                            }
                            if (a4 != null && !a4.f) {
                                if (a4.e) {
                                    c4.b = "hook";
                                    c4.a = "?";
                                } else {
                                    object = a4.d;
                                    if (object != null && ((a)object).a.f1() && (object = DebugLib.e3(a4.d)) != null) {
                                        c4.a = ((d)object).a;
                                        c4.b = ((d)object).b;
                                    }
                                }
                            }
                            if (c4.b != null) continue;
                            c4.b = "";
                            c4.a = null;
                            continue;
                        }
                        n4 = a4 != null && a4.a.f1() ? a4.a() : -1;
                        c4.e = n4;
                        continue;
                    }
                    c4.a(luaFunction);
                }
                return c4;
            }
        }

        int b() {
            synchronized (this) {
                Throwable throwable2;
                block6: {
                    int n3;
                    block5: {
                        block4: {
                            try {
                                n3 = this.b;
                                if (n3 <= 0) break block4;
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                            n3 = this.a[n3 - 1].a();
                            break block5;
                        }
                        n3 = -1;
                    }
                    return n3;
                }
                throw throwable2;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        a c(LuaValue object) {
            synchronized (this) {
                Throwable throwable2;
                int n3 = 1;
                while (true) {
                    block4: {
                        try {
                            int n4 = this.b;
                            if (n3 > n4) return null;
                            a[] aArray = this.a;
                            if (aArray[n4 - n3].a != object) break block4;
                            return aArray[n3];
                        }
                        catch (Throwable throwable2) {
                            break;
                        }
                    }
                    ++n3;
                }
                throw throwable2;
            }
        }

        a e(int n3) {
            synchronized (this) {
                block5: {
                    if (n3 >= 1) {
                        int n4 = this.b;
                        if (n3 > n4) break block5;
                        a a4 = this.a[n4 - n3];
                        return a4;
                    }
                }
                return null;
            }
        }

        final void f(LuaClosure luaClosure, Varargs varargs, LuaValue[] luaValueArray, boolean bl, boolean bl2) {
            synchronized (this) {
                this.j(bl2).f(luaClosure, varargs, luaValueArray, bl, bl2);
                return;
            }
        }

        final void g(LuaFunction luaFunction, boolean bl, boolean bl2) {
            synchronized (this) {
                this.j(bl2).g(luaFunction, bl, bl2);
                return;
            }
        }

        final void h(int n3, Varargs varargs, int n4) {
            synchronized (this) {
                Throwable throwable2;
                block5: {
                    block4: {
                        int n5;
                        try {
                            n5 = this.b;
                            if (n5 <= 0) break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                        this.a[n5 - 1].d(n3, varargs, n4);
                    }
                    return;
                }
                throw throwable2;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        final void i(LuaThread.a a4) {
            synchronized (this) {
                Throwable throwable2;
                block5: {
                    block4: {
                        a[] aArray;
                        int n3;
                        try {
                            n3 = this.b;
                            if (n3 <= 0) break block4;
                            aArray = this.a;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                        this.b = --n3;
                        aArray[n3].e();
                    }
                    this.l(a4);
                    return;
                }
                throw throwable2;
            }
        }

        void l(LuaThread.a a4) {
            synchronized (this) {
                Throwable throwable2;
                block5: {
                    block4: {
                        int n3;
                        try {
                            if (!a4.g || (n3 = this.b) <= 0) break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                        a a5 = this.a[n3 - 1];
                        a4.l = a5.a();
                        a4.m = a5.b;
                    }
                    return;
                }
                throw throwable2;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        String m(Globals object, int n3) {
            synchronized (this) {
                try {
                    a a4;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("stack traceback:");
                    while ((a4 = this.e(n3)) != null) {
                        c c4 = this.a("Slnt", a4.a, a4);
                        c4.m = a4;
                        stringBuffer.append("\n\t");
                        stringBuffer.append(c4.l);
                        stringBuffer.append(':');
                        int n4 = c4.e;
                        if (n4 > 0) {
                            stringBuffer.append(n4);
                        }
                        stringBuffer.append(" in ");
                        luaj.lib.DebugLib$b.k(stringBuffer, (Globals)object, c4);
                        if (c4.k) {
                            stringBuffer.append("\n\t(...tail calls...)");
                        }
                        ++n3;
                    }
                    stringBuffer.append("\n\t[Java]: in ?");
                    return stringBuffer.toString();
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }
    }

    static class c {
        String a;
        String b;
        String c;
        String d;
        int e;
        int f;
        int g;
        short h;
        short i;
        boolean j;
        boolean k;
        String l;
        a m;

        c() {
        }

        /*
         * Enabled aggressive block sorting
         */
        public void a(LuaFunction object) {
            if (((LuaValue)object).f1()) {
                int n3;
                h h4 = ((LuaValue)object).w0().R;
                object = h4.g;
                object = object != null ? ((LuaString)object).g0() : "=?";
                this.d = object;
                this.f = n3 = h4.h;
                this.g = h4.i;
                object = n3 == 0 ? "main" : "Lua";
                this.c = object;
                object = h4.b();
            } else {
                this.d = "=[Java]";
                this.f = -1;
                this.g = -1;
                this.c = "Java";
                object = "[Java]";
            }
            this.l = object;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DebugInfo [\n\tname=");
            stringBuilder.append(this.a);
            stringBuilder.append("\n\tnamewhat=");
            stringBuilder.append(this.b);
            stringBuilder.append("\n\twhat=");
            stringBuilder.append(this.c);
            stringBuilder.append("\n\tsource=");
            stringBuilder.append(this.d);
            stringBuilder.append("\n\tcurrentline=");
            stringBuilder.append(this.e);
            stringBuilder.append("\n\tlinedefined=");
            stringBuilder.append(this.f);
            stringBuilder.append("\n\tlastlinedefined=");
            stringBuilder.append(this.g);
            stringBuilder.append("\n\tnups=");
            stringBuilder.append(this.h);
            stringBuilder.append("\n\tnparams=");
            stringBuilder.append(this.i);
            stringBuilder.append("\n\tisvararg=");
            stringBuilder.append(this.j);
            stringBuilder.append("\n\tistailcall=");
            stringBuilder.append(this.k);
            stringBuilder.append("\n\tshort_src=");
            stringBuilder.append(this.l);
            stringBuilder.append("\n\tcf=");
            stringBuilder.append(this.m);
            stringBuilder.append("\n]");
            return stringBuilder.toString();
        }
    }

    static class d {
        final String a;
        final String b;

        d(String string2, String string3) {
            this.a = string2;
            this.b = string3;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.b);
            stringBuilder.append(" '");
            stringBuilder.append(this.a);
            stringBuilder.append("'");
            return stringBuilder.toString();
        }
    }

    static final class debug
    extends ZeroArgFunction {
        debug() {
        }

        @Override
        public LuaValue call() {
            return LuaValue.f;
        }
    }

    final class gethook
    extends VarArgFunction {
        final DebugLib T;

        gethook(DebugLib debugLib) {
            this.T = debugLib;
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            varargs = varargs.U() > 0 ? varargs.J(1) : this.T.T.f0;
            LuaThread.a a4 = ((LuaThread)varargs).P;
            varargs = a4.f;
            if (varargs == null) {
                varargs = LuaValue.c;
            }
            StringBuilder stringBuilder = new StringBuilder();
            boolean bl = a4.h;
            String string2 = "";
            String string3 = bl ? "c" : "";
            stringBuilder.append(string3);
            string3 = a4.i ? "r" : "";
            stringBuilder.append(string3);
            string3 = string2;
            if (a4.g) {
                string3 = "l";
            }
            stringBuilder.append(string3);
            return LuaValue.M2((LuaValue)varargs, LuaValue.K2(stringBuilder.toString()), LuaValue.I2(a4.j));
        }
    }

    final class getinfo
    extends VarArgFunction {
        final DebugLib T;

        getinfo(DebugLib debugLib) {
            this.T = debugLib;
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public Varargs invoke(Varargs object) {
            int n3;
            int n4;
            int n5;
            Object object2;
            if (((Varargs)object).T(1)) {
                object2 = ((Varargs)object).J(1);
                n5 = 2;
            } else {
                object2 = this.T.T.f0;
                n5 = 1;
            }
            LuaValue luaValue = ((Varargs)object).v(n5);
            String string2 = ((Varargs)object).Z(n5 + 1, "flnStu");
            object2 = this.T.Z2((LuaThread)object2);
            if (luaValue.m1()) {
                n3 = n4 = luaValue.y2();
                if (((b)object2).e((int)1).a == this) {
                    n3 = n4 + 1;
                }
                if ((object = ((b)object2).e(n3)) == null) {
                    return LuaValue.f;
                }
                luaValue = ((a)object).a;
            } else {
                if (!luaValue.g1()) {
                    return LuaValue.k0(n5, "function or level");
                }
                object = ((b)object2).c(luaValue);
            }
            c c4 = ((b)object2).a(string2, (LuaFunction)luaValue, (a)object);
            LuaTable luaTable = new LuaTable();
            n3 = 0;
            while (true) {
                block18: {
                    block11: {
                        block19: {
                            block20: {
                                block12: {
                                    block13: {
                                        block14: {
                                            block15: {
                                                block16: {
                                                    block17: {
                                                        if (n3 >= string2.length()) {
                                                            return luaTable;
                                                        }
                                                        n4 = string2.charAt(n3);
                                                        if (n4 == 76) break block11;
                                                        if (n4 == 83) break block12;
                                                        if (n4 == 102) break block13;
                                                        if (n4 == 108) break block14;
                                                        if (n4 == 110) break block15;
                                                        if (n4 == 116) break block16;
                                                        if (n4 == 117) break block17;
                                                        char c5 = string2.charAt(n3);
                                                        object = new StringBuilder();
                                                        ((StringBuilder)object).append("invalid option: '");
                                                        ((StringBuilder)object).append(c5);
                                                        ((StringBuilder)object).append("' [0x");
                                                        ((StringBuilder)object).append(Integer.toHexString(c5));
                                                        ((StringBuilder)object).append("] at index ");
                                                        ((StringBuilder)object).append(n3 + 1);
                                                        ((StringBuilder)object).append(" in '");
                                                        ((StringBuilder)object).append(string2);
                                                        ((StringBuilder)object).append("'");
                                                        LuaValue.l0(n5 + 1, "debug.getinfo", ((StringBuilder)object).toString());
                                                        break block18;
                                                    }
                                                    luaTable.j2(f0, LuaValue.I2(c4.h));
                                                    luaTable.j2(g0, LuaValue.I2(c4.i));
                                                    object2 = e0;
                                                    object = c4.j ? LuaValue.d : LuaValue.e;
                                                    break block19;
                                                }
                                                object2 = d0;
                                                object = LuaValue.H2(c4.k);
                                                break block19;
                                            }
                                            object2 = h0;
                                            object = c4.a;
                                            object = object != null ? LuaValue.K2((String)object) : LuaValue.c;
                                            luaTable.j2((LuaValue)object2, (LuaValue)object);
                                            object2 = i0;
                                            object = LuaValue.K2(c4.b);
                                            break block19;
                                        }
                                        object2 = o0;
                                        n4 = c4.e;
                                        break block20;
                                    }
                                    if (luaValue == null) break block18;
                                    luaTable.j2(c0, luaValue);
                                    break block18;
                                }
                                luaTable.j2(j0, LuaValue.K2(c4.c));
                                luaTable.j2(k0, LuaValue.K2(c4.d));
                                luaTable.j2(l0, LuaValue.K2(c4.l));
                                luaTable.j2(m0, LuaValue.I2(c4.f));
                                object2 = n0;
                                n4 = c4.g;
                            }
                            object = LuaValue.I2(n4);
                        }
                        luaTable.j2((LuaValue)object2, (LuaValue)object);
                        break block18;
                    }
                    if (luaValue.f1()) {
                        object = new LuaTable();
                        luaTable.j2(p0, (LuaValue)object);
                        object2 = luaValue.w0().R.d;
                        int n6 = ((Object)object2).length;
                        for (n4 = 0; n4 < n6; ++n4) {
                            ((LuaTable)object).d2(LuaValue.I2((long)object2[n4]), LuaValue.d);
                        }
                    }
                }
                ++n3;
            }
        }
    }

    final class getlocal
    extends VarArgFunction {
        final DebugLib T;

        getlocal(DebugLib debugLib) {
            this.T = debugLib;
        }

        @Override
        public Varargs invoke(Varargs object) {
            int n3;
            int n4;
            LuaThread luaThread;
            if (((Varargs)object).T(1)) {
                luaThread = ((Varargs)object).J(1);
                n4 = 2;
            } else {
                luaThread = this.T.T.f0;
                n4 = 1;
            }
            LuaValue luaValue = ((Varargs)object).v(n4);
            int n5 = ((Varargs)object).D(n4 + 1);
            if (luaValue.g1()) {
                if (!luaValue.f1()) {
                    return LuaValue.c;
                }
                return luaValue.w0().R.a(n5, 0);
            }
            int n6 = ((Varargs)object).D(n4);
            object = this.T.Z2(luaThread);
            int n7 = n3 = ((b)object).b;
            int n8 = n6;
            if (((b)object).e((int)1).a == this) {
                n8 = n6 + 1;
                n7 = n3 - 1;
            }
            if ((object = ((b)object).e(n8)) != null) {
                object = ((a)object).b(n5);
            } else {
                object = new StringBuilder();
                ((StringBuilder)object).append("level out of range: ");
                ((StringBuilder)object).append(n8);
                ((StringBuilder)object).append(" not between 1 and ");
                ((StringBuilder)object).append(n7);
                object = LuaValue.l0(n4, "debug.getlocal", ((StringBuilder)object).toString());
            }
            return object;
        }
    }

    static final class getmetatable
    extends LibFunction {
        getmetatable() {
        }

        @Override
        public LuaValue call(LuaValue luaValue) {
            if ((luaValue = luaValue.V0()) == null) {
                luaValue = LuaValue.c;
            }
            return luaValue;
        }
    }

    final class getregistry
    extends ZeroArgFunction {
        final DebugLib T;

        getregistry(DebugLib debugLib) {
            this.T = debugLib;
        }

        @Override
        public LuaValue call() {
            return this.T.T;
        }
    }

    static final class getupvalue
    extends VarArgFunction {
        getupvalue() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            LuaValue luaValue = varargs.C(1);
            int n3 = varargs.D(2);
            if (luaValue instanceof LuaClosure && (luaValue = DebugLib.c3((LuaClosure)(varargs = (LuaClosure)luaValue), n3)) != null) {
                return LuaValue.N2(luaValue, ((LuaClosure)varargs).S[n3 - 1].b());
            }
            return LuaValue.c;
        }
    }

    final class sethook
    extends VarArgFunction {
        final DebugLib T;

        sethook(DebugLib debugLib) {
            this.T = debugLib;
        }

        @Override
        public Varargs invoke(Varargs object) {
            int n3;
            LuaThread luaThread;
            if (((Varargs)object).T(1)) {
                luaThread = ((Varargs)object).J(1);
                n3 = 2;
            } else {
                luaThread = this.T.T.f0;
                n3 = 1;
            }
            LuaFunction luaFunction = ((Varargs)object).X(n3, null);
            String string2 = ((Varargs)object).Z(n3 + 1, "");
            int n4 = 0;
            int n5 = ((Varargs)object).Y(n3 + 2, 0);
            boolean bl = false;
            boolean bl2 = false;
            boolean bl3 = false;
            for (n3 = n4; n3 < string2.length(); ++n3) {
                n4 = string2.charAt(n3);
                if (n4 != 99) {
                    if (n4 != 108) {
                        if (n4 != 114) continue;
                        bl3 = true;
                        continue;
                    }
                    bl2 = true;
                    continue;
                }
                bl = true;
            }
            object = luaThread.P;
            ((LuaThread.a)object).f = luaFunction;
            ((LuaThread.a)object).h = bl;
            ((LuaThread.a)object).g = bl2;
            ((LuaThread.a)object).j = n5;
            ((LuaThread.a)object).i = bl3;
            this.T.Y2().l((LuaThread.a)object);
            return LuaValue.f;
        }
    }

    final class setlocal
    extends VarArgFunction {
        final DebugLib T;

        setlocal(DebugLib debugLib) {
            this.T = debugLib;
        }

        @Override
        public Varargs invoke(Varargs object) {
            int n3;
            Object object2;
            if (((Varargs)object).T(1)) {
                object2 = ((Varargs)object).J(1);
                n3 = 2;
            } else {
                object2 = this.T.T.f0;
                n3 = 1;
            }
            int n4 = ((Varargs)object).D(n3);
            int n5 = ((Varargs)object).D(n3 + 1);
            object = ((Varargs)object).v(n3 + 2);
            object2 = this.T.Z2((LuaThread)object2);
            int n6 = ((b)object2).b;
            int n7 = n4;
            int n8 = n6;
            if (((b)object2).e((int)1).a == this) {
                n7 = n4 + 1;
                n8 = n6 - 1;
            }
            if ((object2 = ((b)object2).e(n7)) != null) {
                object = ((a)object2).h(n5, (LuaValue)object);
            } else {
                object = new StringBuilder();
                ((StringBuilder)object).append("level out of range: ");
                ((StringBuilder)object).append(n7);
                ((StringBuilder)object).append(" not between 1 and ");
                ((StringBuilder)object).append(n8);
                object = LuaValue.l0(n3, "debug.setlocal", ((StringBuilder)object).toString());
            }
            return object;
        }
    }

    static final class setmetatable
    extends TwoArgFunction {
        setmetatable() {
        }

        @Override
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            luaValue2 = luaValue2.L1(null);
            int n3 = luaValue.C2();
            if (n3 != 0) {
                if (n3 != 1) {
                    if (n3 != 3) {
                        if (n3 != 4) {
                            if (n3 != 6) {
                                if (n3 != 8) {
                                    luaValue.k2(luaValue2);
                                } else {
                                    LuaThread.T = luaValue2;
                                }
                            } else {
                                LuaFunction.P = luaValue2;
                            }
                        } else {
                            LuaString.U = luaValue2;
                        }
                    } else {
                        LuaNumber.P = luaValue2;
                    }
                } else {
                    LuaBoolean.Q = luaValue2;
                }
            } else {
                LuaNil.P = luaValue2;
            }
            return luaValue;
        }
    }

    static final class setupvalue
    extends VarArgFunction {
        setupvalue() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            LuaString luaString;
            LuaFunction luaFunction = varargs.C(1);
            int n3 = varargs.D(2);
            varargs = varargs.v(3);
            if (luaFunction instanceof LuaClosure && (luaString = DebugLib.c3((LuaClosure)(luaFunction = (LuaClosure)luaFunction), n3)) != null) {
                ((LuaClosure)luaFunction).S[n3 - 1].c((LuaValue)varargs);
                return luaString;
            }
            return LuaValue.c;
        }
    }

    final class traceback
    extends VarArgFunction {
        final DebugLib T;

        traceback(DebugLib debugLib) {
            this.T = debugLib;
        }

        @Override
        public Varargs invoke(Varargs object) {
            int n3;
            Object object2;
            if (((Varargs)object).T(1)) {
                object2 = ((Varargs)object).J(1);
                n3 = 2;
            } else {
                object2 = this.T.T.f0;
                n3 = 1;
            }
            LuaValue luaValue = ((Varargs)object).v(n3);
            if (!luaValue.n1() && !luaValue.l1()) {
                return luaValue;
            }
            int n4 = ((Varargs)object).Y(n3 + 1, 1);
            object = this.T.Z2((LuaThread)object2);
            n3 = n4;
            if (((b)object).e((int)1).a == this) {
                n3 = n4 + 1;
            }
            object = object2 = ((b)object).m(this.T.T, n3);
            if (luaValue.n1()) {
                object = new StringBuilder();
                ((StringBuilder)object).append(luaValue.g0());
                ((StringBuilder)object).append('\n');
                ((StringBuilder)object).append((String)object2);
                object = ((StringBuilder)object).toString();
            }
            return LuaValue.K2((String)object);
        }
    }

    static final class upvalueid
    extends VarArgFunction {
        upvalueid() {
        }

        @Override
        public Varargs invoke(Varargs object) {
            LuaFunction luaFunction = ((Varargs)object).C(1);
            int n3 = ((Varargs)object).D(2);
            if (luaFunction instanceof LuaClosure && (object = ((LuaClosure)luaFunction).S) != null && n3 > 0 && n3 <= ((Object)object).length) {
                return LuaValue.I2(object[n3 - 1].hashCode());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("invalid upvalue index ");
            ((StringBuilder)object).append(n3);
            return LuaValue.l0(2, "debug.upvalueid", ((StringBuilder)object).toString());
        }
    }

    static final class upvaluejoin
    extends VarArgFunction {
        upvaluejoin() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            LuaClosure luaClosure = varargs.A(1);
            int n3 = varargs.D(2);
            LuaClosure luaClosure2 = varargs.A(3);
            int n4 = varargs.D(4);
            if (n3 < 1 || n3 > luaClosure.S.length) {
                this.m0("index out of range");
            }
            if (n4 < 1 || n4 > luaClosure2.S.length) {
                this.m0("index out of range");
            }
            luaClosure.S[n3 - 1] = luaClosure2.S[n4 - 1];
            return LuaValue.f;
        }
    }
}

