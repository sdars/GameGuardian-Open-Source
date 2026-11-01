/*
 * Decompiled with CFR 0.152.
 */
package luaj;

import luaj.LuaClosure;
import luaj.LuaFunction;
import luaj.LuaNumber;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaThread;
import luaj.LuaValue;
import luaj.d;
import luaj.lib.VarArgFunction;

public abstract class Varargs {
    public static final ThreadLocal a = new ThreadLocal();

    private d y(int n3, d object) {
        String string2 = ((d)object).getMessage();
        object = string2;
        if (string2.startsWith("bad argument: ")) {
            object = string2.substring(14);
        }
        StringBuilder stringBuilder = new StringBuilder();
        string2 = n3 <= this.U() ? this.v(n3).D2() : "no value";
        stringBuilder.append(string2);
        stringBuilder.append(": ");
        stringBuilder.append((String)object);
        string2 = stringBuilder.toString();
        object = (VarArgFunction)a.get();
        object = object == null ? null : ((LuaFunction)object).T2();
        return new luaj.c(n3, (String)object, string2);
    }

    public LuaClosure A(int n3) {
        try {
            LuaClosure luaClosure = this.v(n3).w0();
            return luaClosure;
        }
        catch (d d4) {
            throw this.y(n3, d4);
        }
    }

    public double B(int n3) {
        try {
            double d4 = this.v(n3).x0();
            return d4;
        }
        catch (d d5) {
            throw this.y(n3, d5);
        }
    }

    public LuaFunction C(int n3) {
        try {
            LuaFunction luaFunction = this.v(n3).y0();
            return luaFunction;
        }
        catch (d d4) {
            throw this.y(n3, d4);
        }
    }

    public int D(int n3) {
        try {
            int n4 = this.v(n3).A0();
            return n4;
        }
        catch (d d4) {
            throw this.y(n3, d4);
        }
    }

    public String E(int n3) {
        try {
            String string2 = this.v(n3).B0();
            return string2;
        }
        catch (d d4) {
            throw this.y(n3, d4);
        }
    }

    public long F(int n3) {
        try {
            long l3 = this.v(n3).C0();
            return l3;
        }
        catch (d d4) {
            throw this.y(n3, d4);
        }
    }

    public LuaNumber G(int n3) {
        try {
            LuaNumber luaNumber = this.v(n3).E0();
            return luaNumber;
        }
        catch (d d4) {
            throw this.y(n3, d4);
        }
    }

    public LuaString H(int n3) {
        try {
            LuaString luaString = this.v(n3).G0();
            return luaString;
        }
        catch (d d4) {
            throw this.y(n3, d4);
        }
    }

    public LuaTable I(int n3) {
        try {
            LuaTable luaTable = this.v(n3).H0();
            return luaTable;
        }
        catch (d d4) {
            throw this.y(n3, d4);
        }
    }

    public LuaThread J(int n3) {
        try {
            LuaThread luaThread = this.v(n3).I0();
            return luaThread;
        }
        catch (d d4) {
            throw this.y(n3, d4);
        }
    }

    public LuaValue K(int n3) {
        LuaValue luaValue = n3 <= this.U() ? this.v(n3) : LuaValue.k0(n3, "value expected");
        return luaValue;
    }

    void L(LuaValue[] luaValueArray, int n3, int n4) {
        int n5;
        int n6 = 0;
        while ((n5 = n6) < n4) {
            n6 = n5 + 1;
            luaValueArray[n3 + n5] = this.v(n6);
        }
    }

    public Varargs M() {
        int n3 = this.U();
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    LuaValue[] luaValueArray = new LuaValue[n3];
                    this.L(luaValueArray, 0, n3);
                    return new b(luaValueArray, LuaValue.f);
                }
                return new c(this.w(), this.v(2));
            }
            return this.w();
        }
        return LuaValue.f;
    }

    public Varargs N() {
        return this;
    }

    public boolean O() {
        return false;
    }

    public boolean P(int n3) {
        return this.v(n3).g1();
    }

    public boolean Q(int n3) {
        return this.v(n3).l1();
    }

    public boolean R(int n3) {
        return this.v(n3).m1();
    }

    public boolean S(int n3) {
        return this.v(n3).n1();
    }

    public boolean T(int n3) {
        return this.v(n3).p1();
    }

    public abstract int U();

    public boolean V(int n3, boolean bl) {
        try {
            bl = this.v(n3).E1(bl);
            return bl;
        }
        catch (d d4) {
            throw this.y(n3, d4);
        }
    }

    public double W(int n3, double d4) {
        try {
            d4 = this.v(n3).F1(d4);
            return d4;
        }
        catch (d d5) {
            throw this.y(n3, d5);
        }
    }

    public LuaFunction X(int n3, LuaFunction luaFunction) {
        try {
            luaFunction = this.v(n3).G1(luaFunction);
            return luaFunction;
        }
        catch (d d4) {
            throw this.y(n3, d4);
        }
    }

    public int Y(int n3, int n4) {
        try {
            n4 = this.v(n3).H1(n4);
            return n4;
        }
        catch (d d4) {
            throw this.y(n3, d4);
        }
    }

    public String Z(int n3, String string2) {
        try {
            string2 = this.v(n3).I1(string2);
            return string2;
        }
        catch (d d4) {
            throw this.y(n3, d4);
        }
    }

    public long a0(int n3, long l3) {
        try {
            l3 = this.v(n3).J1(l3);
            return l3;
        }
        catch (d d4) {
            throw this.y(n3, d4);
        }
    }

    public LuaString b0(int n3, LuaString luaString) {
        try {
            luaString = this.v(n3).K1(luaString);
            return luaString;
        }
        catch (d d4) {
            throw this.y(n3, d4);
        }
    }

    public LuaTable c0(int n3, LuaTable luaTable) {
        try {
            luaTable = this.v(n3).L1(luaTable);
            return luaTable;
        }
        catch (d d4) {
            throw this.y(n3, d4);
        }
    }

    public LuaValue d0(int n3, LuaValue luaValue) {
        LuaValue luaValue2 = luaValue;
        if (n3 > 0) {
            luaValue2 = luaValue;
            if (n3 <= this.U()) {
                luaValue2 = this.v(n3);
            }
        }
        return luaValue2;
    }

    public abstract Varargs e0(int var1);

    public boolean f0(int n3) {
        return this.v(n3).w2();
    }

    public String g0() {
        f.a a4 = new f.a();
        a4.b("(");
        int n3 = this.U();
        for (int i3 = 1; i3 <= n3; ++i3) {
            if (i3 > 1) {
                a4.b(",");
            }
            a4.b(this.v(i3).g0());
        }
        a4.b(")");
        return a4.k();
    }

    public String h0(int n3) {
        return this.v(n3).g0();
    }

    public long i0(int n3) {
        return this.v(n3).z2();
    }

    public String toString() {
        return this.g0();
    }

    public abstract LuaValue v(int var1);

    public abstract LuaValue w();

    public void x(boolean bl, int n3, String string2) {
        if (!bl) {
            LuaValue.k0(n3, string2);
        }
    }

    public boolean z(int n3) {
        try {
            boolean bl = this.v(n3).v0();
            return bl;
        }
        catch (d d4) {
            throw this.y(n3, d4);
        }
    }

    static final class a
    extends Varargs {
        private final int b;
        private final LuaValue[] c;
        private final int d;
        private final Varargs e;

        public a(LuaValue[] luaValueArray, int n3, int n4, Varargs varargs) {
            this.c = luaValueArray;
            this.b = n3;
            this.d = n4;
            this.e = varargs;
        }

        @Override
        void L(LuaValue[] luaValueArray, int n3, int n4) {
            int n5 = Math.min(this.d, n4);
            System.arraycopy(this.c, this.b, luaValueArray, n3, n5);
            this.e.L(luaValueArray, n3 + n5, n4 - n5);
        }

        @Override
        public int U() {
            return this.d + this.e.U();
        }

        @Override
        public Varargs e0(int n3) {
            if (n3 <= 0) {
                LuaValue.k0(1, "start must be > 0");
            }
            if (n3 == 1) {
                return this;
            }
            int n4 = this.d;
            if (n3 > n4) {
                return this.e.e0(n3 - n4);
            }
            return LuaValue.Q2(this.c, this.b + n3 - 1, n4 - (n3 - 1), this.e);
        }

        @Override
        public LuaValue v(int n3) {
            int n4;
            LuaValue luaValue = n3 < 1 ? LuaValue.c : (n3 <= (n4 = this.d) ? this.c[this.b + n3 - 1] : this.e.v(n3 - n4));
            return luaValue;
        }

        @Override
        public LuaValue w() {
            LuaValue luaValue = this.d > 0 ? this.c[this.b] : this.e.w();
            return luaValue;
        }
    }

    static final class b
    extends Varargs {
        private final LuaValue[] b;
        private final Varargs c;

        b(LuaValue[] luaValueArray, Varargs varargs) {
            this.b = luaValueArray;
            this.c = varargs;
        }

        @Override
        void L(LuaValue[] luaValueArray, int n3, int n4) {
            int n5 = Math.min(this.b.length, n4);
            System.arraycopy(this.b, 0, luaValueArray, n3, n5);
            this.c.L(luaValueArray, n3 + n5, n4 - n5);
        }

        @Override
        public int U() {
            return this.b.length + this.c.U();
        }

        @Override
        public Varargs e0(int n3) {
            if (n3 <= 0) {
                LuaValue.k0(1, "start must be > 0");
            }
            if (n3 == 1) {
                return this;
            }
            LuaValue[] luaValueArray = this.b;
            if (n3 > luaValueArray.length) {
                return this.c.e0(n3 - luaValueArray.length);
            }
            return LuaValue.Q2(luaValueArray, --n3, luaValueArray.length - n3, this.c);
        }

        @Override
        public LuaValue v(int n3) {
            Object object;
            object = n3 < 1 ? LuaValue.c : (n3 <= ((LuaValue[])(object = this.b)).length ? object[n3 - 1] : this.c.v(n3 - ((LuaValue[])object).length));
            return object;
        }

        @Override
        public LuaValue w() {
            Object object = this.b;
            object = ((LuaValue[])object).length > 0 ? object[0] : this.c.w();
            return object;
        }
    }

    static final class c
    extends Varargs {
        private final LuaValue b;
        private final Varargs c;

        c(LuaValue luaValue, Varargs varargs) {
            this.b = luaValue;
            this.c = varargs;
        }

        @Override
        public int U() {
            return this.c.U() + 1;
        }

        @Override
        public Varargs e0(int n3) {
            if (n3 == 1) {
                return this;
            }
            if (n3 == 2) {
                return this.c;
            }
            if (n3 > 2) {
                return this.c.e0(n3 - 1);
            }
            return LuaValue.k0(1, "start must be > 0");
        }

        @Override
        public LuaValue v(int n3) {
            LuaValue luaValue = n3 == 1 ? this.b : this.c.v(n3 - 1);
            return luaValue;
        }

        @Override
        public LuaValue w() {
            return this.b;
        }
    }
}

