package luaj;

import luaj.lib.VarArgFunction;

/* JADX INFO: loaded from: classes.dex */
public abstract class Varargs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1678a = new ThreadLocal();

    static final class a extends Varargs {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final LuaValue[] f1680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f1681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Varargs f1682e;

        public a(LuaValue[] luaValueArr, int i, int i2, Varargs varargs) {
            this.f1680c = luaValueArr;
            this.f1679b = i;
            this.f1681d = i2;
            this.f1682e = varargs;
        }

        @Override // luaj.Varargs
        void L(LuaValue[] luaValueArr, int i, int i2) {
            int iMin = Math.min(this.f1681d, i2);
            System.arraycopy(this.f1680c, this.f1679b, luaValueArr, i, iMin);
            this.f1682e.L(luaValueArr, i + iMin, i2 - iMin);
        }

        @Override // luaj.Varargs
        public int U() {
            return this.f1681d + this.f1682e.U();
        }

        @Override // luaj.Varargs
        public Varargs e0(int i) {
            if (i <= 0) {
                LuaValue.k0(1, "start must be > 0");
            }
            if (i == 1) {
                return this;
            }
            int i2 = this.f1681d;
            return i > i2 ? this.f1682e.e0(i - i2) : LuaValue.Q2(this.f1680c, (this.f1679b + i) - 1, i2 - (i - 1), this.f1682e);
        }

        @Override // luaj.Varargs
        public LuaValue v(int i) {
            if (i < 1) {
                return LuaValue.f1673c;
            }
            int i2 = this.f1681d;
            return i <= i2 ? this.f1680c[(this.f1679b + i) - 1] : this.f1682e.v(i - i2);
        }

        @Override // luaj.Varargs
        public LuaValue w() {
            return this.f1681d > 0 ? this.f1680c[this.f1679b] : this.f1682e.w();
        }
    }

    static final class b extends Varargs {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LuaValue[] f1683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Varargs f1684c;

        b(LuaValue[] luaValueArr, Varargs varargs) {
            this.f1683b = luaValueArr;
            this.f1684c = varargs;
        }

        @Override // luaj.Varargs
        void L(LuaValue[] luaValueArr, int i, int i2) {
            int iMin = Math.min(this.f1683b.length, i2);
            System.arraycopy(this.f1683b, 0, luaValueArr, i, iMin);
            this.f1684c.L(luaValueArr, i + iMin, i2 - iMin);
        }

        @Override // luaj.Varargs
        public int U() {
            return this.f1683b.length + this.f1684c.U();
        }

        @Override // luaj.Varargs
        public Varargs e0(int i) {
            if (i <= 0) {
                LuaValue.k0(1, "start must be > 0");
            }
            if (i == 1) {
                return this;
            }
            LuaValue[] luaValueArr = this.f1683b;
            if (i > luaValueArr.length) {
                return this.f1684c.e0(i - luaValueArr.length);
            }
            int i2 = i - 1;
            return LuaValue.Q2(luaValueArr, i2, luaValueArr.length - i2, this.f1684c);
        }

        @Override // luaj.Varargs
        public LuaValue v(int i) {
            if (i < 1) {
                return LuaValue.f1673c;
            }
            LuaValue[] luaValueArr = this.f1683b;
            return i <= luaValueArr.length ? luaValueArr[i - 1] : this.f1684c.v(i - luaValueArr.length);
        }

        @Override // luaj.Varargs
        public LuaValue w() {
            LuaValue[] luaValueArr = this.f1683b;
            return luaValueArr.length > 0 ? luaValueArr[0] : this.f1684c.w();
        }
    }

    static final class c extends Varargs {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LuaValue f1685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Varargs f1686c;

        c(LuaValue luaValue, Varargs varargs) {
            this.f1685b = luaValue;
            this.f1686c = varargs;
        }

        @Override // luaj.Varargs
        public int U() {
            return this.f1686c.U() + 1;
        }

        @Override // luaj.Varargs
        public Varargs e0(int i) {
            if (i == 1) {
                return this;
            }
            if (i == 2) {
                return this.f1686c;
            }
            return i > 2 ? this.f1686c.e0(i - 1) : LuaValue.k0(1, "start must be > 0");
        }

        @Override // luaj.Varargs
        public LuaValue v(int i) {
            return i == 1 ? this.f1685b : this.f1686c.v(i - 1);
        }

        @Override // luaj.Varargs
        public LuaValue w() {
            return this.f1685b;
        }
    }

    private d y(int i, d dVar) {
        String message = dVar.getMessage();
        if (message.startsWith("bad argument: ")) {
            message = message.substring(14);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i <= U() ? v(i).D2() : "no value");
        sb.append(": ");
        sb.append(message);
        String string = sb.toString();
        VarArgFunction varArgFunction = (VarArgFunction) f1678a.get();
        return new luaj.c(i, varArgFunction == null ? null : varArgFunction.T2(), string);
    }

    public LuaClosure A(int i) {
        try {
            return v(i).w0();
        } catch (d e2) {
            throw y(i, e2);
        }
    }

    public double B(int i) {
        try {
            return v(i).x0();
        } catch (d e2) {
            throw y(i, e2);
        }
    }

    public LuaFunction C(int i) {
        try {
            return v(i).y0();
        } catch (d e2) {
            throw y(i, e2);
        }
    }

    public int D(int i) {
        try {
            return v(i).A0();
        } catch (d e2) {
            throw y(i, e2);
        }
    }

    public String E(int i) {
        try {
            return v(i).B0();
        } catch (d e2) {
            throw y(i, e2);
        }
    }

    public long F(int i) {
        try {
            return v(i).C0();
        } catch (d e2) {
            throw y(i, e2);
        }
    }

    public LuaNumber G(int i) {
        try {
            return v(i).E0();
        } catch (d e2) {
            throw y(i, e2);
        }
    }

    public LuaString H(int i) {
        try {
            return v(i).G0();
        } catch (d e2) {
            throw y(i, e2);
        }
    }

    public LuaTable I(int i) {
        try {
            return v(i).H0();
        } catch (d e2) {
            throw y(i, e2);
        }
    }

    public LuaThread J(int i) {
        try {
            return v(i).I0();
        } catch (d e2) {
            throw y(i, e2);
        }
    }

    public LuaValue K(int i) {
        return i <= U() ? v(i) : LuaValue.k0(i, "value expected");
    }

    void L(LuaValue[] luaValueArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i + i3;
            i3++;
            luaValueArr[i4] = v(i3);
        }
    }

    public Varargs M() {
        int iU = U();
        if (iU == 0) {
            return LuaValue.f1676f;
        }
        if (iU == 1) {
            return w();
        }
        if (iU == 2) {
            return new c(w(), v(2));
        }
        LuaValue[] luaValueArr = new LuaValue[iU];
        L(luaValueArr, 0, iU);
        return new b(luaValueArr, LuaValue.f1676f);
    }

    public Varargs N() {
        return this;
    }

    public boolean O() {
        return false;
    }

    public boolean P(int i) {
        return v(i).g1();
    }

    public boolean Q(int i) {
        return v(i).l1();
    }

    public boolean R(int i) {
        return v(i).m1();
    }

    public boolean S(int i) {
        return v(i).n1();
    }

    public boolean T(int i) {
        return v(i).p1();
    }

    public abstract int U();

    public boolean V(int i, boolean z) {
        try {
            return v(i).E1(z);
        } catch (d e2) {
            throw y(i, e2);
        }
    }

    public double W(int i, double d2) {
        try {
            return v(i).F1(d2);
        } catch (d e2) {
            throw y(i, e2);
        }
    }

    public LuaFunction X(int i, LuaFunction luaFunction) {
        try {
            return v(i).G1(luaFunction);
        } catch (d e2) {
            throw y(i, e2);
        }
    }

    public int Y(int i, int i2) {
        try {
            return v(i).H1(i2);
        } catch (d e2) {
            throw y(i, e2);
        }
    }

    public String Z(int i, String str) {
        try {
            return v(i).I1(str);
        } catch (d e2) {
            throw y(i, e2);
        }
    }

    public long a0(int i, long j) {
        try {
            return v(i).J1(j);
        } catch (d e2) {
            throw y(i, e2);
        }
    }

    public LuaString b0(int i, LuaString luaString) {
        try {
            return v(i).K1(luaString);
        } catch (d e2) {
            throw y(i, e2);
        }
    }

    public LuaTable c0(int i, LuaTable luaTable) {
        try {
            return v(i).L1(luaTable);
        } catch (d e2) {
            throw y(i, e2);
        }
    }

    public LuaValue d0(int i, LuaValue luaValue) {
        return (i <= 0 || i > U()) ? luaValue : v(i);
    }

    public abstract Varargs e0(int i);

    public boolean f0(int i) {
        return v(i).w2();
    }

    public String g0() {
        ggf.a aVar = new ggf.a();
        aVar.b("(");
        int iU = U();
        for (int i = 1; i <= iU; i++) {
            if (i > 1) {
                aVar.b(",");
            }
            aVar.b(v(i).g0());
        }
        aVar.b(")");
        return aVar.k();
    }

    public String h0(int i) {
        return v(i).g0();
    }

    public long i0(int i) {
        return v(i).z2();
    }

    public String toString() {
        return g0();
    }

    public abstract LuaValue v(int i);

    public abstract LuaValue w();

    public void x(boolean z, int i, String str) {
        if (z) {
            return;
        }
        LuaValue.k0(i, str);
    }

    public boolean z(int i) {
        try {
            return v(i).v0();
        } catch (d e2) {
            throw y(i, e2);
        }
    }
}
