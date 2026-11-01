package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class LuaDouble extends LuaNumber {
    public static final LuaDouble R = new LuaDouble(Double.NaN);
    public static final LuaDouble S = new LuaDouble(Double.POSITIVE_INFINITY);
    public static final LuaDouble T = new LuaDouble(Double.NEGATIVE_INFINITY);
    final double Q;

    private LuaDouble(double d2) {
        this.Q = d2;
    }

    public static LuaNumber J2(double d2) {
        return new LuaDouble(d2);
    }

    public static LuaValue S2(double d2, double d3) {
        if (d3 != 0.0d) {
            return J2(d2 / d3);
        }
        if (d2 > 0.0d) {
            return S;
        }
        return d2 == 0.0d ? R : T;
    }

    public static LuaValue T2(double d2, double d3) {
        if (d3 != 0.0d) {
            return J2(Math.floor(d2 / d3));
        }
        if (d2 > 0.0d) {
            return S;
        }
        return d2 == 0.0d ? R : T;
    }

    public static LuaValue U2(double d2, double d3) {
        if (d3 == 0.0d || d2 == Double.POSITIVE_INFINITY || d2 == Double.NEGATIVE_INFINITY) {
            return R;
        }
        if (d3 == Double.POSITIVE_INFINITY) {
            return d2 < 0.0d ? S : J2(d2);
        }
        if (d3 == Double.NEGATIVE_INFINITY) {
            return d2 > 0.0d ? T : J2(d2);
        }
        return J2(d2 - (d3 * Math.floor(d2 / d3)));
    }

    private boolean V2(String str, LuaValue luaValue) {
        if (!luaValue.m1()) {
            return true;
        }
        if (!k1()) {
            throw new d("number '" + g0() + "' has no integer representation (for bitwise operation '" + g0() + " " + str + " " + luaValue.g0() + "')");
        }
        if (luaValue.k1()) {
            return false;
        }
        throw new d("number '" + luaValue.g0() + "' has no integer representation (for bitwise operation '" + g0() + " " + str + " " + luaValue.g0() + "')");
    }

    @Override // luaj.LuaValue
    public int A0() {
        double d2 = this.Q;
        int i = (int) d2;
        if (i == d2) {
            return i;
        }
        throw new d("number '" + g0() + "' has no integer representation");
    }

    @Override // luaj.LuaValue
    public LuaValue A1() {
        return J2(-this.Q);
    }

    @Override // luaj.LuaValue
    public String B0() {
        return g0();
    }

    @Override // luaj.LuaValue
    public LuaValue B2() {
        return LuaString.K2(g0());
    }

    @Override // luaj.LuaValue
    public long C0() {
        double d2 = this.Q;
        long j = (long) d2;
        if (j == d2) {
            return j;
        }
        throw new d("number '" + g0() + "' has no integer representation");
    }

    @Override // luaj.LuaValue
    public double F1(double d2) {
        return this.Q;
    }

    @Override // luaj.LuaValue
    public LuaString G0() {
        return LuaString.K2(g0());
    }

    @Override // luaj.LuaValue
    public int H1(int i) {
        return (int) this.Q;
    }

    @Override // luaj.LuaValue
    public String I1(String str) {
        return g0();
    }

    @Override // luaj.LuaValue
    public long J1(long j) {
        return (long) this.Q;
    }

    @Override // luaj.LuaValue
    public LuaString K1(LuaString luaString) {
        return LuaString.K2(g0());
    }

    @Override // luaj.LuaValue
    public LuaValue O0(LuaValue luaValue) {
        return !luaValue.m1() ? super.O0(luaValue) : S2(this.Q, luaValue.x2());
    }

    @Override // luaj.LuaValue
    public boolean P0(LuaValue luaValue) {
        if (luaValue.m1()) {
            return this.Q == luaValue.x2();
        }
        return super.P0(luaValue);
    }

    @Override // luaj.LuaValue
    public LuaValue Q1(LuaValue luaValue) {
        return !luaValue.m1() ? super.Q1(luaValue) : J2(Math.pow(this.Q, luaValue.x2()));
    }

    @Override // luaj.LuaValue
    public boolean T1(LuaValue luaValue) {
        return luaValue.m1() && this.Q == luaValue.x2();
    }

    @Override // luaj.LuaValue
    public boolean X0(LuaValue luaValue) {
        if (luaValue instanceof LuaNumber) {
            return this.Q > luaValue.x2();
        }
        return super.X0(luaValue);
    }

    @Override // luaj.LuaValue
    public boolean Y0(LuaValue luaValue) {
        if (luaValue instanceof LuaNumber) {
            return this.Q >= luaValue.x2();
        }
        return super.Y0(luaValue);
    }

    @Override // luaj.LuaValue
    public LuaValue Z0(LuaValue luaValue) {
        return !luaValue.m1() ? super.Z0(luaValue) : T2(this.Q, luaValue.x2());
    }

    @Override // luaj.LuaValue
    public boolean equals(Object obj) {
        return (obj instanceof LuaDouble) && Double.doubleToRawLongBits(((LuaDouble) obj).Q) == Double.doubleToRawLongBits(this.Q);
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public String g0() {
        double d2 = this.Q;
        if (d2 == 0.0d) {
            return (Double.doubleToLongBits(d2) >> 63) == 0 ? "0.0" : "-0.0";
        }
        if (Double.isNaN(d2)) {
            return "nan";
        }
        if (Double.isInfinite(this.Q)) {
            return this.Q < 0.0d ? "-inf" : "inf";
        }
        double d3 = this.Q;
        long j = (long) d3;
        String string = ((double) j) == d3 ? Long.toString(j) : Double.toString(d3);
        if (string.indexOf(46) != -1 || string.indexOf(101) != -1 || string.indexOf(69) != -1) {
            return string;
        }
        return string + ".0";
    }

    public int hashCode() {
        double d2 = this.Q;
        int i = (int) d2;
        long jDoubleToRawLongBits = ((double) i) == d2 ? i : Double.doubleToRawLongBits(d2);
        return (int) (jDoubleToRawLongBits ^ (jDoubleToRawLongBits >>> 32));
    }

    @Override // luaj.LuaValue
    public boolean i1() {
        double d2 = this.Q;
        return ((double) ((int) d2)) == d2;
    }

    @Override // luaj.LuaValue
    public LuaValue j0(LuaValue luaValue) {
        return !luaValue.m1() ? super.j0(luaValue) : J2(this.Q + luaValue.x2());
    }

    @Override // luaj.LuaValue
    public boolean k1() {
        double d2 = this.Q;
        return -9.007199254740992E15d <= d2 && d2 <= 9.007199254740992E15d && ((double) ((long) d2)) == d2;
    }

    @Override // luaj.LuaValue
    public LuaValue m2(LuaValue luaValue) {
        return V2("<<", luaValue) ? super.m2(luaValue) : LuaLong.X2(z2(), luaValue.z2());
    }

    @Override // luaj.LuaValue
    public LuaValue n2(LuaValue luaValue) {
        return V2(">>", luaValue) ? super.n2(luaValue) : LuaLong.Y2(z2(), luaValue.z2());
    }

    @Override // luaj.LuaValue
    public LuaValue o0(LuaValue luaValue) {
        return V2("&", luaValue) ? super.o0(luaValue) : LuaValue.I2(z2() & luaValue.z2());
    }

    @Override // luaj.LuaValue
    public LuaValue q0() {
        return !k1() ? super.q0() : LuaValue.I2(~z2());
    }

    @Override // luaj.LuaValue
    public boolean q1() {
        return !Double.isNaN(this.Q);
    }

    @Override // luaj.LuaValue
    public LuaString q2() {
        return LuaString.K2(g0());
    }

    @Override // luaj.LuaValue
    public LuaValue r0(LuaValue luaValue) {
        return V2("|", luaValue) ? super.r0(luaValue) : LuaValue.I2(z2() | luaValue.z2());
    }

    @Override // luaj.LuaValue
    public LuaValue r2(LuaValue luaValue) {
        return !luaValue.m1() ? super.r2(luaValue) : J2(this.Q - luaValue.x2());
    }

    @Override // luaj.LuaValue
    public LuaValue t0(LuaValue luaValue) {
        return V2("~", luaValue) ? super.t0(luaValue) : LuaValue.I2(z2() ^ luaValue.z2());
    }

    @Override // luaj.LuaValue
    public boolean u1(LuaValue luaValue) {
        if (luaValue instanceof LuaNumber) {
            return this.Q < luaValue.x2();
        }
        return super.u1(luaValue);
    }

    @Override // luaj.LuaValue
    public boolean v1(LuaValue luaValue) {
        if (luaValue instanceof LuaNumber) {
            return this.Q <= luaValue.x2();
        }
        return super.v1(luaValue);
    }

    @Override // luaj.LuaValue
    public double x0() {
        return this.Q;
    }

    @Override // luaj.LuaValue
    public double x2() {
        return this.Q;
    }

    @Override // luaj.LuaValue
    public LuaValue y1(LuaValue luaValue) {
        return !luaValue.m1() ? super.y1(luaValue) : U2(this.Q, luaValue.x2());
    }

    @Override // luaj.LuaValue
    public int y2() {
        return (int) this.Q;
    }

    @Override // luaj.LuaValue
    public LuaValue z1(LuaValue luaValue) {
        return !luaValue.m1() ? super.z1(luaValue) : J2(this.Q * luaValue.x2());
    }

    @Override // luaj.LuaValue
    public long z2() {
        return (long) this.Q;
    }
}
