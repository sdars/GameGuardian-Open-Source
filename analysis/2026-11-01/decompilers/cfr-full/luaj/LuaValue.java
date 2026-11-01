/*
 * Decompiled with CFR 0.152.
 */
package luaj;

import f.a;
import g.g;
import luaj.Globals;
import luaj.LuaBoolean;
import luaj.LuaClosure;
import luaj.LuaDouble;
import luaj.LuaFunction;
import luaj.LuaLong;
import luaj.LuaNil;
import luaj.LuaNumber;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaThread;
import luaj.Varargs;
import luaj.WeakTable;
import luaj.c;
import luaj.d;
import luaj.e;
import luaj.f;

public abstract class LuaValue
extends Varargs {
    public static final LuaString A;
    public static final LuaString B;
    public static final LuaString C;
    public static final LuaString D;
    public static final LuaString E;
    public static final LuaString F;
    public static final LuaString G;
    public static final LuaString H;
    public static final LuaString I;
    public static final LuaString J;
    public static final LuaString K;
    public static final LuaString L;
    public static final LuaString M;
    public static final LuaString N;
    public static final LuaValue[] O;
    public static final String[] b;
    public static final LuaValue c;
    public static final LuaBoolean d;
    public static final LuaBoolean e;
    public static final LuaValue f;
    public static final LuaNumber g;
    public static final LuaNumber h;
    public static final LuaNumber i;
    public static final LuaValue[] j;
    public static final LuaString k;
    public static final LuaString l;
    public static final LuaString m;
    public static final LuaString n;
    public static final LuaString o;
    public static final LuaString p;
    public static final LuaString q;
    public static final LuaString r;
    public static final LuaString s;
    public static final LuaString t;
    public static final LuaString u;
    public static final LuaString v;
    public static final LuaString w;
    public static final LuaString x;
    public static final LuaString y;
    public static final LuaString z;

    static {
        b = new String[]{"nil", "boolean", "lightuserdata", "number", "string", "table", "function", "userdata", "thread", "value"};
        c = new LuaNil();
        d = new LuaBoolean(true);
        e = new LuaBoolean(false);
        f = new None();
        g = LuaLong.I2(0L);
        h = LuaLong.I2(1L);
        i = LuaLong.I2(-1L);
        j = new LuaValue[0];
        k = LuaString.i3("_ENV");
        l = LuaString.i3("__index");
        m = LuaString.i3("__newindex");
        n = LuaString.i3("__call");
        o = LuaString.i3("__mode");
        p = LuaString.i3("__metatable");
        q = LuaString.i3("__add");
        r = LuaString.i3("__sub");
        s = LuaString.i3("__div");
        t = LuaString.i3("__mul");
        u = LuaString.i3("__pow");
        v = LuaString.i3("__mod");
        w = LuaString.i3("__unm");
        x = LuaString.i3("__len");
        y = LuaString.i3("__eq");
        z = LuaString.i3("__lt");
        A = LuaString.i3("__le");
        B = LuaString.i3("__tostring");
        C = LuaString.i3("__concat");
        D = LuaString.i3("__idiv");
        E = LuaString.i3("__bnot");
        F = LuaString.i3("__band");
        G = LuaString.i3("__bor");
        H = LuaString.i3("__bxor");
        I = LuaString.i3("__shl");
        J = LuaString.i3("__shr");
        K = LuaString.i3("__name");
        L = LuaString.i3("");
        M = LuaString.i3("0");
        N = LuaString.i3("1");
        O = new LuaValue[250];
        for (int i3 = 0; i3 < 250; ++i3) {
            LuaValue.O[i3] = c;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static LuaNumber C1(String string2) {
        if (string2.length() > 20) return LuaDouble.J2(Double.parseDouble(string2));
        if (string2.indexOf(46) != -1) return LuaDouble.J2(Double.parseDouble(string2));
        if (string2.indexOf(101) != -1) return LuaDouble.J2(Double.parseDouble(string2));
        if (string2.indexOf(69) != -1) return LuaDouble.J2(Double.parseDouble(string2));
        try {
            return LuaLong.I2(Long.parseLong(string2));
        }
        catch (NumberFormatException numberFormatException) {
            return LuaDouble.J2(Double.parseDouble(string2));
        }
    }

    public static LuaBoolean H2(boolean bl) {
        LuaBoolean luaBoolean = bl ? d : e;
        return luaBoolean;
    }

    public static LuaLong I2(long l3) {
        return LuaLong.I2(l3);
    }

    public static LuaNumber J2(double d4) {
        return LuaDouble.J2(d4);
    }

    public static LuaString K2(String string2) {
        return LuaString.K2(string2);
    }

    public static LuaString L2(byte[] byArray, int n3, int n4) {
        return LuaString.L2(byArray, n3, n4);
    }

    public static Varargs M2(LuaValue luaValue, LuaValue luaValue2, Varargs varargs) {
        if (varargs.U() != 0) {
            return new Varargs.a(new LuaValue[]{luaValue, luaValue2}, 0, 2, varargs);
        }
        return new Varargs.c(luaValue, luaValue2);
    }

    public static LuaValue N1(CharSequence object) {
        double d4;
        int n3;
        int n4;
        long l3;
        double d5;
        int n5;
        int n6;
        block38: {
            int n7;
            int n8;
            int n9;
            int n10;
            block39: {
                double d6;
                block34: {
                    block35: {
                        n6 = object.length();
                        for (n5 = 0; n5 < n6 && g.g.P0(object.charAt(n5)); ++n5) {
                        }
                        d6 = 1.0;
                        n10 = n5;
                        d5 = d6;
                        if (n5 >= n6) break block34;
                        n9 = object.charAt(n5);
                        if (n9 == 45) break block35;
                        n10 = n5;
                        d5 = d6;
                        if (n9 != 43) break block34;
                    }
                    if (n9 == 45) {
                        d6 = -1.0;
                    }
                    n10 = n5 + 1;
                    d5 = d6;
                }
                if (n10 + 2 >= n6) {
                    return null;
                }
                if (object.charAt(n10) != '0') {
                    return null;
                }
                n5 = object.charAt(n10 + 1);
                if (n5 != 120 && n5 != 88) {
                    return null;
                }
                l3 = 0L;
                d6 = 0.0;
                n4 = 0;
                n5 = 0;
                for (n3 = n10 + 2; n3 < n6 && g.g.Q0(n10 = (int)object.charAt(n3)); ++n3) {
                    long l4;
                    block37: {
                        block36: {
                            n8 = g.g.H0(n10);
                            if (n4 != 0) break block36;
                            n9 = n4;
                            n10 = n5;
                            l4 = l3;
                            d4 = d6;
                            if (n8 == 0) break block37;
                        }
                        if (n4 < 30) {
                            d6 = d6 * 16.0 + (double)n8;
                        } else {
                            n5 += 4;
                        }
                        l4 = l3 * 16L + (long)n8;
                        n9 = n4 + 1;
                        d4 = d6;
                        n10 = n5;
                    }
                    n4 = n9;
                    n5 = n10;
                    l3 = l4;
                    d6 = d4;
                }
                n9 = n3;
                n8 = n4;
                n10 = n5;
                d4 = d6;
                if (n3 < n6) {
                    n9 = n3;
                    n8 = n4;
                    n10 = n5;
                    d4 = d6;
                    if (object.charAt(n3) == '.') {
                        n10 = n4 + 0x800000;
                        n4 = n3 + 1;
                        n7 = Integer.MAX_VALUE;
                        n3 = n10;
                        while (true) {
                            n9 = n4;
                            n8 = n3;
                            n10 = n5;
                            d4 = d6;
                            if (n4 >= n6) break;
                            char c4 = object.charAt(n4);
                            n9 = n4;
                            n8 = n3;
                            n10 = n5;
                            d4 = d6;
                            if (!g.g.Q0(c4)) break;
                            n10 = n7;
                            if (n7 == Integer.MAX_VALUE) {
                                n10 = n7;
                                if (d6 != 0.0) {
                                    n10 = n4 + 30;
                                }
                            }
                            n8 = n3;
                            n9 = n5;
                            d4 = d6;
                            if (n4 < n10) {
                                d4 = d6 * 16.0 + (double)g.g.H0(c4);
                                n9 = n5 - 4;
                                n8 = n3 + 1;
                            }
                            ++n4;
                            n7 = n10;
                            n3 = n8;
                            n5 = n9;
                            d6 = d4;
                        }
                    }
                }
                if ((0x7FFFFF & n8) == 0) {
                    return null;
                }
                n5 = n9;
                n4 = n8;
                n3 = n10;
                if (n9 >= n6) break block38;
                n7 = object.charAt(n9);
                if (n7 == 112) break block39;
                n5 = n9;
                n4 = n8;
                n3 = n10;
                if (n7 != 80) break block38;
            }
            n4 = n8 + 0x1000000;
            n5 = n9 + 1;
            if (n5 < n6 && ((n3 = (int)object.charAt(n5)) == 45 || n3 == 43)) {
                n5 = n3 == 45 ? 1 : 0;
                n3 = n5;
                n5 = n9 += 2;
            } else {
                n3 = 0;
            }
            n9 = 0;
            n8 = 0;
            while (n5 < n6 && g.g.O0(n7 = (int)object.charAt(n5))) {
                n9 = n9 * 10 + n7 - 48;
                ++n5;
                n8 = 1;
            }
            if (n8 == 0) {
                return null;
            }
            n8 = n9;
            if (n3 != 0) {
                n8 = -n9;
            }
            n3 = n10 + n8;
        }
        while (n5 < n6 && g.g.P0(object.charAt(n5))) {
            ++n5;
        }
        if (n5 != n6) {
            return null;
        }
        if (n4 < 0x800000) {
            if (!(d5 > 0.0)) {
                l3 = -l3;
            }
            object = LuaLong.I2(l3);
        } else {
            object = LuaValue.J2(d5 * d4 * Math.pow(2.0, n3));
        }
        return object;
    }

    public static Varargs N2(LuaValue luaValue, Varargs varargs) {
        if (varargs.U() != 0) {
            return new Varargs.c(luaValue, varargs);
        }
        return luaValue;
    }

    public static LuaValue O1(String string2) {
        if (string2.indexOf(120) < 0 && string2.indexOf(88) < 0) {
            return LuaValue.C1(string2.trim());
        }
        return LuaValue.N1(string2);
    }

    public static Varargs O2(LuaValue[] luaValueArray) {
        int n3 = luaValueArray.length;
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    return new Varargs.b(luaValueArray, f);
                }
                return new Varargs.c(luaValueArray[0], luaValueArray[1]);
            }
            return luaValueArray[0];
        }
        return f;
    }

    public static LuaValue P1(String object, LuaValue luaValue) {
        block2: {
            try {
                object = LuaValue.O1((String)object);
            }
            catch (NumberFormatException numberFormatException) {
                object = null;
            }
            if (object != null) break block2;
            object = luaValue;
        }
        return object;
    }

    public static Varargs P2(LuaValue[] luaValueArray, int n3, int n4) {
        if (n4 != 0) {
            if (n4 != 1) {
                if (n4 != 2) {
                    return new Varargs.a(luaValueArray, n3, n4, f);
                }
                return new Varargs.c(luaValueArray[n3], luaValueArray[n3 + 1]);
            }
            return luaValueArray[n3];
        }
        return f;
    }

    public static final boolean Q0(LuaValue luaValue, LuaValue luaValue2) {
        LuaValue luaValue3 = c;
        LuaValue luaValue4 = luaValue.V0();
        if (luaValue4 != null) {
            luaValue3 = luaValue4.V1(y);
        }
        luaValue4 = luaValue3;
        if (luaValue3.l1()) {
            LuaValue luaValue5 = luaValue2.V0();
            luaValue4 = luaValue3;
            if (luaValue5 != null) {
                luaValue4 = luaValue5.V1(y);
            }
        }
        boolean bl = luaValue4.l1() ? false : luaValue4.call(luaValue, luaValue2).w2();
        return bl;
    }

    public static Varargs Q2(LuaValue[] object, int n3, int n4, Varargs varargs) {
        if (n4 != 0) {
            if (n4 != 1) {
                if (n4 != 2) {
                    return new Varargs.a((LuaValue[])object, n3, n4, varargs);
                }
                object = varargs.U() > 0 ? new Varargs.a((LuaValue[])object, n3, n4, varargs) : new Varargs.c(object[n3], object[n3 + 1]);
                return object;
            }
            object = varargs.U() > 0 ? new Varargs.c(object[n3], varargs) : object[n3];
            return object;
        }
        return varargs;
    }

    public static LuaValue R0(String string2) {
        throw new d(string2);
    }

    public static Varargs R2(LuaValue[] object, Varargs varargs) {
        int n3 = ((LuaValue[])object).length;
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    return new Varargs.b((LuaValue[])object, varargs);
                }
                object = varargs.U() > 0 ? new Varargs.b((LuaValue[])object, varargs) : new Varargs.c(object[0], object[1]);
                return object;
            }
            object = varargs.U() > 0 ? new Varargs.c(object[0], varargs) : object[0];
            return object;
        }
        return varargs;
    }

    public static LuaValue S0(String string2, Throwable throwable) {
        throw new d(string2, throwable);
    }

    protected static LuaValue W0(LuaValue luaValue, LuaValue luaValue2) {
        int n3 = 0;
        LuaValue luaValue3 = luaValue;
        while (true) {
            LuaValue luaValue4;
            if (luaValue3.o1()) {
                luaValue4 = luaValue3.V1(luaValue2);
                if (!luaValue4.l1() || (luaValue = luaValue3.x1(l)).l1()) {
                    return luaValue4;
                }
            } else {
                luaValue = luaValue4 = luaValue3.x1(l);
                if (luaValue4.l1()) {
                    luaValue3.b1(luaValue2.g0());
                    luaValue = luaValue4;
                }
            }
            if (luaValue.g1()) {
                return luaValue.call(luaValue3, luaValue2);
            }
            if (++n3 >= 100) {
                LuaValue.R0("loop in gettable");
                return c;
            }
            luaValue3 = luaValue;
        }
    }

    private void b1(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("attempt to index ? (a ");
        stringBuilder.append(this.D2());
        stringBuilder.append(" value) with key '");
        stringBuilder.append(string2);
        stringBuilder.append('\'');
        LuaValue.R0(stringBuilder.toString());
    }

    public static LuaValue k0(int n3, String string2) {
        throw new c(n3, null, string2);
    }

    public static LuaValue l0(int n3, String string2, String string3) {
        throw new c(n3, string2, string3);
    }

    protected static boolean l2(LuaValue object, LuaValue luaValue, LuaValue luaValue2) {
        int n3 = 0;
        Object object2 = object;
        while (true) {
            block7: {
                block5: {
                    block6: {
                        if (!((LuaValue)object2).o1()) break block5;
                        if (!((LuaValue)object2).V1(luaValue).l1()) break block6;
                        LuaValue luaValue3 = ((LuaValue)object2).x1(m);
                        object = luaValue3;
                        if (!luaValue3.l1()) break block7;
                    }
                    ((LuaValue)object2).d2(luaValue, luaValue2);
                    return true;
                }
                object = ((LuaValue)object2).x1(m);
                if (((LuaValue)object).l1()) break;
            }
            if (((LuaValue)object).g1()) {
                ((LuaValue)object).call((LuaValue)object2, luaValue, luaValue2);
                return true;
            }
            if (++n3 >= 100) {
                LuaValue.R0("loop in settable");
                return false;
            }
            object2 = object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("table expected for set index ('");
        ((StringBuilder)object).append(luaValue);
        ((StringBuilder)object).append("') value, got ");
        ((StringBuilder)object).append(((LuaValue)object2).D2());
        throw new d(((StringBuilder)object).toString());
    }

    public static LuaValue n0(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        LuaValue luaValue4 = luaValue2.x1(luaValue);
        Object object = luaValue4;
        if (luaValue4.l1()) {
            luaValue4 = luaValue3.x1(luaValue);
            object = luaValue4;
            if (luaValue4.l1()) {
                object = new StringBuilder();
                ((StringBuilder)object).append("attempt to perform arithmetic ");
                ((StringBuilder)object).append(luaValue);
                ((StringBuilder)object).append(" on a ");
                ((StringBuilder)object).append(luaValue2.E2());
                ((StringBuilder)object).append(" value and a ");
                ((StringBuilder)object).append(luaValue3.E2());
                ((StringBuilder)object).append(" value");
                LuaValue.R0(((StringBuilder)object).toString());
                object = luaValue4;
            }
        }
        return ((LuaValue)object).call(luaValue2, luaValue3);
    }

    public static LuaValue p0(LuaValue object, LuaValue luaValue, LuaValue luaValue2) {
        Object object2;
        Object object3 = object2 = luaValue.x1((LuaValue)object);
        if (((LuaValue)object2).l1()) {
            object3 = object2 = luaValue2.x1((LuaValue)object);
            if (((LuaValue)object2).l1()) {
                object3 = luaValue.m1() && !luaValue.k1() ? luaValue : (luaValue2.m1() && !luaValue2.k1() ? luaValue2 : null);
                object = LuaValue.v2((LuaValue)object);
                if (object3 == null) {
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append("attempt to perform bitwise operation ");
                    ((StringBuilder)object3).append((String)object);
                    ((StringBuilder)object3).append(" on a ");
                    ((StringBuilder)object3).append(luaValue.D2());
                    ((StringBuilder)object3).append(" value and a ");
                    ((StringBuilder)object3).append(luaValue2.D2());
                    ((StringBuilder)object3).append(" value");
                    LuaValue.R0(((StringBuilder)object3).toString());
                    object3 = object2;
                } else {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("number '");
                    ((StringBuilder)object2).append(((LuaValue)object3).g0());
                    ((StringBuilder)object2).append("' has no integer representation (for bitwise operation '");
                    ((StringBuilder)object2).append(luaValue.g0());
                    ((StringBuilder)object2).append(" ");
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append(" ");
                    ((StringBuilder)object2).append(luaValue2.g0());
                    ((StringBuilder)object2).append("')");
                    throw new d(((StringBuilder)object2).toString());
                }
            }
        }
        return ((LuaValue)object3).call(luaValue, luaValue2);
    }

    public static LuaTable s2() {
        return new LuaTable();
    }

    public static LuaTable t2(Varargs varargs, int n3) {
        return new LuaTable(varargs, n3);
    }

    public static LuaTable u2(LuaValue[] luaValueArray) {
        return new LuaTable(luaValueArray, null, null);
    }

    public static String v2(LuaValue luaValue) {
        if (luaValue == F) {
            return "&";
        }
        if (luaValue == G) {
            return "|";
        }
        if (luaValue == H) {
            return "~";
        }
        if (luaValue == I) {
            return "<<";
        }
        if (luaValue == J) {
            return ">>";
        }
        return luaValue.g0();
    }

    protected static e w1(LuaValue luaValue) {
        if (luaValue != null && luaValue.o1()) {
            Object object = luaValue.V1(o);
            if (((LuaValue)object).n1()) {
                object = ((LuaValue)object).g0();
                int n3 = ((String)object).indexOf(107);
                boolean bl = false;
                boolean bl2 = n3 >= 0;
                if (((String)object).indexOf(118) >= 0) {
                    bl = true;
                }
                if (bl2 || bl) {
                    return new WeakTable(bl2, bl, luaValue);
                }
            }
            return (LuaTable)luaValue;
        }
        if (luaValue != null) {
            return new f(luaValue);
        }
        return null;
    }

    public int A0() {
        this.m0("int");
        return 0;
    }

    public LuaValue A1() {
        return this.D0(w, "attempt to perform arithmetic on ").call(this);
    }

    public LuaValue A2() {
        return c;
    }

    public String B0() {
        this.m0("string");
        return null;
    }

    public LuaValue B1() {
        return e;
    }

    public LuaValue B2() {
        return c;
    }

    public long C0() {
        this.m0("long");
        return 0L;
    }

    public abstract int C2();

    protected LuaValue D0(LuaValue object, String string2) {
        LuaValue luaValue = this.x1((LuaValue)object);
        if (luaValue.l1()) {
            if (object == E && this.m1()) {
                object = new StringBuilder();
                ((StringBuilder)object).append("number has no integer representation (for bitwise operation '~");
                ((StringBuilder)object).append(this.g0());
                ((StringBuilder)object).append("')");
                throw new d(((StringBuilder)object).toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append("a ");
            ((StringBuilder)object).append(this.E2());
            ((StringBuilder)object).append(" value");
            throw new d(((StringBuilder)object).toString());
        }
        return luaValue;
    }

    public Varargs D1(Varargs varargs, boolean bl) {
        return this.invoke(varargs);
    }

    public abstract String D2();

    public LuaNumber E0() {
        this.m0("number");
        return null;
    }

    public boolean E1(boolean bl) {
        this.m0("boolean");
        return false;
    }

    public String E2() {
        LuaValue luaValue = this.x1(K);
        if (luaValue.n1()) {
            return luaValue.g0();
        }
        return this.D2();
    }

    public LuaNumber F0(String string2) {
        throw new d(string2);
    }

    public double F1(double d4) {
        this.m0("number");
        return 0.0;
    }

    protected LuaValue F2(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" expected, got ");
        stringBuilder.append(this.E2());
        throw new d(stringBuilder.toString());
    }

    public LuaString G0() {
        this.m0("string");
        return null;
    }

    public LuaFunction G1(LuaFunction luaFunction) {
        this.m0("function");
        return null;
    }

    protected LuaValue G2(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\'');
        stringBuilder.append(string2);
        stringBuilder.append("' not implemented for ");
        stringBuilder.append(this.D2());
        throw new d(stringBuilder.toString());
    }

    public LuaTable H0() {
        this.m0("table");
        return null;
    }

    public int H1(int n3) {
        this.m0("int");
        return 0;
    }

    public LuaThread I0() {
        this.m0("thread");
        return null;
    }

    public String I1(String string2) {
        this.m0("String");
        return null;
    }

    public LuaValue J0(LuaValue object, LuaValue object2) {
        LuaValue luaValue = this.x1((LuaValue)object);
        Object object3 = luaValue;
        if (luaValue.l1() && ((LuaValue)(object3 = ((LuaValue)object2).x1((LuaValue)object))).l1()) {
            if (A.T1((LuaValue)object)) {
                luaValue = z;
                object = object3 = this.x1(luaValue);
                if (!((LuaValue)object3).l1() || !((LuaValue)(object = ((LuaValue)object2).x1(luaValue))).l1()) {
                    return ((LuaValue)object).call((LuaValue)object2, this).B1();
                }
            }
            if (((String)(object = this.E2())).equals(object2 = ((LuaValue)object2).E2())) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("two ");
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(" values");
                object = ((StringBuilder)object2).toString();
            } else {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object);
                ((StringBuilder)object3).append(" with ");
                ((StringBuilder)object3).append((String)object2);
                object = ((StringBuilder)object3).toString();
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("attempt to compare ");
            ((StringBuilder)object2).append((String)object);
            return LuaValue.R0(((StringBuilder)object2).toString());
        }
        return ((LuaValue)object3).call(this, (LuaValue)object2);
    }

    public long J1(long l3) {
        this.m0("long");
        return 0L;
    }

    public LuaValue K0(LuaValue luaValue) {
        return this.N0(luaValue);
    }

    public LuaString K1(LuaString luaString) {
        this.m0("string");
        return null;
    }

    public LuaValue L0(LuaNumber luaNumber) {
        return luaNumber.N0(this);
    }

    public LuaTable L1(LuaTable luaTable) {
        this.m0("table");
        return null;
    }

    public LuaValue M0(LuaString luaString) {
        return luaString.N0(this);
    }

    public LuaValue M1(LuaValue luaValue) {
        return this;
    }

    public LuaValue N0(LuaValue object) {
        LuaString luaString = C;
        LuaValue luaValue = this.x1(luaString);
        Object object2 = luaValue;
        if (luaValue.l1()) {
            luaValue = ((LuaValue)object).x1(luaString);
            object2 = luaValue;
            if (luaValue.l1()) {
                object2 = !this.n1() ? this : (!((LuaValue)object).n1() ? object : null);
                if (object2 == null) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("attempt to concatenate ");
                    ((StringBuilder)object2).append(this.D2());
                    ((StringBuilder)object2).append(" and ");
                    ((StringBuilder)object2).append(((LuaValue)object).D2());
                    LuaValue.R0(((StringBuilder)object2).toString());
                    object2 = luaValue;
                } else {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("attempt to concatenate a ");
                    ((StringBuilder)object).append(((LuaValue)object2).D2());
                    ((StringBuilder)object).append(" value");
                    throw new d(((StringBuilder)object).toString());
                }
            }
        }
        return ((LuaValue)object2).call(this, (LuaValue)object);
    }

    public LuaValue O0(LuaValue luaValue) {
        return LuaValue.n0(s, this, luaValue);
    }

    public boolean P0(LuaValue luaValue) {
        boolean bl = this == luaValue;
        return bl;
    }

    public LuaValue Q1(LuaValue luaValue) {
        return LuaValue.n0(u, this, luaValue);
    }

    public void R1(int n3) {
        this.F2("table");
    }

    public boolean S1(LuaString luaString) {
        return false;
    }

    public LuaValue T0(String string2) {
        return this.U0(LuaValue.K2(string2));
    }

    public boolean T1(LuaValue luaValue) {
        boolean bl = this == luaValue;
        return bl;
    }

    @Override
    public int U() {
        return 1;
    }

    public LuaValue U0(LuaValue luaValue) {
        return LuaValue.W0(this, luaValue);
    }

    public LuaValue U1(String string2) {
        return this.V1(LuaValue.K2(string2));
    }

    public LuaValue V0() {
        return null;
    }

    public LuaValue V1(LuaValue luaValue) {
        return this.G2("rawget");
    }

    public int W1() {
        this.F2("table or string");
        return 0;
    }

    public boolean X0(LuaValue luaValue) {
        return luaValue.J0(A, this).w2();
    }

    public void X1(int n3, String string2) {
        if (string2 != null) {
            this.Y1(n3, LuaValue.K2(string2));
        }
    }

    public boolean Y0(LuaValue luaValue) {
        return luaValue.J0(z, this).w2();
    }

    public void Y1(int n3, LuaValue luaValue) {
        if (luaValue != null) {
            this.d2(LuaValue.I2(n3), luaValue);
        }
    }

    public LuaValue Z0(LuaValue luaValue) {
        return LuaValue.n0(D, this, luaValue);
    }

    public void Z1(String string2, double d4) {
        if (string2 != null) {
            this.d2(LuaValue.K2(string2), LuaValue.J2(d4));
        }
    }

    protected LuaValue a1(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("illegal operation '");
        stringBuilder.append(string2);
        stringBuilder.append("' for ");
        stringBuilder.append(string3);
        throw new d(stringBuilder.toString());
    }

    public void a2(String string2, int n3) {
        if (string2 != null) {
            this.d2(LuaValue.K2(string2), LuaValue.I2(n3));
        }
    }

    public void b2(String string2, String string3) {
        if (string2 != null && string3 != null) {
            this.d2(LuaValue.K2(string2), LuaValue.K2(string3));
        }
    }

    public void c1(LuaValue luaValue) {
    }

    public void c2(String string2, LuaValue luaValue) {
        if (string2 != null && luaValue != null) {
            this.d2(LuaValue.K2(string2), luaValue);
        }
    }

    public LuaValue call() {
        return this.u0().call(this);
    }

    public LuaValue call(String string2) {
        return this.call(LuaValue.K2(string2));
    }

    public LuaValue call(LuaValue luaValue) {
        return this.u0().call(this, luaValue);
    }

    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        return this.u0().call(this, luaValue, luaValue2);
    }

    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        return this.u0().invoke(new LuaValue[]{this, luaValue, luaValue2, luaValue3}).w();
    }

    public boolean d1() {
        return false;
    }

    public void d2(LuaValue luaValue, LuaValue luaValue2) {
        if (luaValue != null && luaValue2 != null) {
            this.G2("rawset");
        }
    }

    @Override
    public Varargs e0(int n3) {
        if (n3 == 1) {
            return this;
        }
        if (n3 > 1) {
            return f;
        }
        return LuaValue.k0(1, "start must be > 0");
    }

    public boolean e1() {
        return false;
    }

    public void e2(int n3, LuaValue luaValue) {
        if (luaValue != null) {
            this.j2(LuaLong.I2(n3), luaValue);
        }
    }

    public boolean equals(Object object) {
        boolean bl = this == object;
        return bl;
    }

    public boolean f1() {
        return false;
    }

    public void f2(String string2, double d4) {
        if (string2 != null) {
            this.j2(LuaValue.K2(string2), LuaValue.J2(d4));
        }
    }

    @Override
    public String g0() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.E2());
        stringBuilder.append(": ");
        stringBuilder.append(Integer.toHexString(this.hashCode()));
        return stringBuilder.toString();
    }

    public boolean g1() {
        return false;
    }

    public void g2(String string2, int n3) {
        if (string2 != null) {
            this.j2(LuaValue.K2(string2), LuaValue.I2(n3));
        }
    }

    public boolean h1() {
        return false;
    }

    public void h2(String string2, String string3) {
        if (string2 != null && string3 != null) {
            this.j2(LuaValue.K2(string2), LuaValue.K2(string3));
        }
    }

    public boolean i1() {
        return false;
    }

    public void i2(String string2, LuaValue luaValue) {
        if (string2 != null && luaValue != null) {
            this.j2(LuaValue.K2(string2), luaValue);
        }
    }

    public Varargs invoke() {
        return this.invoke(f);
    }

    public Varargs invoke(LuaValue luaValue, LuaValue luaValue2, Varargs varargs) {
        return this.invoke(LuaValue.M2(luaValue, luaValue2, varargs));
    }

    public Varargs invoke(LuaValue luaValue, Varargs varargs) {
        return this.invoke(LuaValue.N2(luaValue, varargs));
    }

    public Varargs invoke(Varargs varargs) {
        return this.u0().invoke(this, varargs);
    }

    public Varargs invoke(LuaValue[] luaValueArray) {
        return this.invoke(LuaValue.O2(luaValueArray));
    }

    public Varargs invoke(LuaValue[] luaValueArray, Varargs varargs) {
        return this.invoke(LuaValue.R2(luaValueArray, varargs));
    }

    public LuaValue j0(LuaValue luaValue) {
        return LuaValue.n0(q, this, luaValue);
    }

    public boolean j1() {
        return false;
    }

    public void j2(LuaValue luaValue, LuaValue luaValue2) {
        if (luaValue != null && luaValue2 != null) {
            LuaValue.l2(this, luaValue, luaValue2);
        }
    }

    public boolean k1() {
        return false;
    }

    public LuaValue k2(LuaValue luaValue) {
        return this.m0("table");
    }

    public boolean l1() {
        return false;
    }

    protected LuaValue m0(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bad argument: ");
        stringBuilder.append(string2);
        stringBuilder.append(" expected, got ");
        stringBuilder.append(this.E2());
        throw new d(stringBuilder.toString());
    }

    public boolean m1() {
        return false;
    }

    public LuaValue m2(LuaValue luaValue) {
        return LuaValue.p0(I, this, luaValue);
    }

    public boolean n1() {
        return false;
    }

    public LuaValue n2(LuaValue luaValue) {
        return LuaValue.p0(J, this, luaValue);
    }

    public LuaValue o0(LuaValue luaValue) {
        return LuaValue.p0(F, this, luaValue);
    }

    public boolean o1() {
        return false;
    }

    public int o2(LuaString object) {
        object = new StringBuilder();
        ((StringBuilder)object).append("attempt to compare ");
        ((StringBuilder)object).append(this.D2());
        LuaValue.R0(((StringBuilder)object).toString());
        return 0;
    }

    public boolean p1() {
        return false;
    }

    public LuaValue p2() {
        return this;
    }

    public LuaValue q0() {
        return this.D0(E, "attempt to perform bitwise on ").call(this);
    }

    public boolean q1() {
        return true;
    }

    public LuaString q2() {
        this.F2("string or number");
        return null;
    }

    public LuaValue r0(LuaValue luaValue) {
        return LuaValue.p0(G, this, luaValue);
    }

    public LuaValue r1() {
        return this.D0(x, "attempt to get length of ").call(this);
    }

    public LuaValue r2(LuaValue luaValue) {
        return LuaValue.n0(r, this, luaValue);
    }

    public a s0() {
        return new a(this);
    }

    public int s1() {
        return this.r1().y2();
    }

    public LuaValue t0(LuaValue luaValue) {
        return LuaValue.p0(H, this, luaValue);
    }

    public LuaValue t1(LuaValue luaValue) {
        return luaValue.call(L, this);
    }

    @Override
    public String toString() {
        return this.g0();
    }

    protected LuaValue u0() {
        return this.D0(n, "attempt to call ");
    }

    public boolean u1(LuaValue luaValue) {
        return this.J0(z, luaValue).w2();
    }

    @Override
    public LuaValue v(int n3) {
        LuaValue luaValue = n3 == 1 ? this : c;
        return luaValue;
    }

    public boolean v0() {
        this.m0("boolean");
        return false;
    }

    public boolean v1(LuaValue luaValue) {
        return this.J0(A, luaValue).w2();
    }

    @Override
    public LuaValue w() {
        return this;
    }

    public LuaClosure w0() {
        this.m0("closure");
        return null;
    }

    public boolean w2() {
        return true;
    }

    public double x0() {
        this.m0("number");
        return 0.0;
    }

    public LuaValue x1(LuaValue luaValue) {
        LuaValue luaValue2 = this.V0();
        if (luaValue2 == null) {
            return c;
        }
        return luaValue2.V1(luaValue);
    }

    public double x2() {
        return 0.0;
    }

    public LuaFunction y0() {
        this.m0("function");
        return null;
    }

    public LuaValue y1(LuaValue luaValue) {
        return LuaValue.n0(v, this, luaValue);
    }

    public int y2() {
        return 0;
    }

    public Globals z0() {
        this.m0("globals");
        return null;
    }

    public LuaValue z1(LuaValue luaValue) {
        return LuaValue.n0(t, this, luaValue);
    }

    public long z2() {
        return 0L;
    }

    private static final class None
    extends LuaNil {
        private None() {
        }

        @Override
        void L(LuaValue[] luaValueArray, int n3, int n4) {
            while (n4 > 0) {
                luaValueArray[n3] = c;
                --n4;
                ++n3;
            }
        }

        @Override
        public int U() {
            return 0;
        }

        @Override
        public Varargs e0(int n3) {
            LuaValue luaValue = n3 > 0 ? this : LuaValue.k0(1, "start must be > 0");
            return luaValue;
        }

        @Override
        public String g0() {
            return "none";
        }

        @Override
        public LuaValue v(int n3) {
            return c;
        }

        @Override
        public LuaValue w() {
            return c;
        }
    }
}

