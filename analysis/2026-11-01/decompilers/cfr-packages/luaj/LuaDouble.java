/*
 * Decompiled with CFR 0.152.
 */
package luaj;

import luaj.LuaLong;
import luaj.LuaNumber;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.d;

public class LuaDouble
extends LuaNumber {
    public static final LuaDouble R = new LuaDouble(Double.NaN);
    public static final LuaDouble S = new LuaDouble(Double.POSITIVE_INFINITY);
    public static final LuaDouble T = new LuaDouble(Double.NEGATIVE_INFINITY);
    final double Q;

    private LuaDouble(double d4) {
        this.Q = d4;
    }

    public static LuaNumber J2(double d4) {
        return new LuaDouble(d4);
    }

    public static LuaValue S2(double d4, double d5) {
        double d6;
        double d7;
        LuaNumber luaNumber = d5 != 0.0 ? LuaDouble.J2(d4 / d5) : ((d7 = (d6 = d4 - 0.0) == 0.0 ? 0 : (d6 > 0.0 ? 1 : -1)) > 0 ? S : (d7 == false ? R : T));
        return luaNumber;
    }

    public static LuaValue T2(double d4, double d5) {
        double d6;
        double d7;
        LuaNumber luaNumber = d5 != 0.0 ? LuaDouble.J2(Math.floor(d4 / d5)) : ((d7 = (d6 = d4 - 0.0) == 0.0 ? 0 : (d6 > 0.0 ? 1 : -1)) > 0 ? S : (d7 == false ? R : T));
        return luaNumber;
    }

    public static LuaValue U2(double d4, double d5) {
        if (d5 != 0.0 && d4 != Double.POSITIVE_INFINITY && d4 != Double.NEGATIVE_INFINITY) {
            if (d5 == Double.POSITIVE_INFINITY) {
                LuaNumber luaNumber = d4 < 0.0 ? S : LuaDouble.J2(d4);
                return luaNumber;
            }
            if (d5 == Double.NEGATIVE_INFINITY) {
                LuaNumber luaNumber = d4 > 0.0 ? T : LuaDouble.J2(d4);
                return luaNumber;
            }
            return LuaDouble.J2(d4 - d5 * Math.floor(d4 / d5));
        }
        return R;
    }

    private boolean V2(String string2, LuaValue luaValue) {
        if (!luaValue.m1()) {
            return true;
        }
        if (this.k1()) {
            if (luaValue.k1()) {
                return false;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("number '");
            stringBuilder.append(luaValue.g0());
            stringBuilder.append("' has no integer representation (for bitwise operation '");
            stringBuilder.append(this.g0());
            stringBuilder.append(" ");
            stringBuilder.append(string2);
            stringBuilder.append(" ");
            stringBuilder.append(luaValue.g0());
            stringBuilder.append("')");
            throw new d(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("number '");
        stringBuilder.append(this.g0());
        stringBuilder.append("' has no integer representation (for bitwise operation '");
        stringBuilder.append(this.g0());
        stringBuilder.append(" ");
        stringBuilder.append(string2);
        stringBuilder.append(" ");
        stringBuilder.append(luaValue.g0());
        stringBuilder.append("')");
        throw new d(stringBuilder.toString());
    }

    @Override
    public int A0() {
        double d4 = this.Q;
        int n3 = (int)d4;
        if ((double)n3 == d4) {
            return n3;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("number '");
        stringBuilder.append(this.g0());
        stringBuilder.append("' has no integer representation");
        throw new d(stringBuilder.toString());
    }

    @Override
    public LuaValue A1() {
        return LuaDouble.J2(-this.Q);
    }

    @Override
    public String B0() {
        return this.g0();
    }

    @Override
    public LuaValue B2() {
        return LuaString.K2(this.g0());
    }

    @Override
    public long C0() {
        double d4 = this.Q;
        long l3 = (long)d4;
        if ((double)l3 == d4) {
            return l3;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("number '");
        stringBuilder.append(this.g0());
        stringBuilder.append("' has no integer representation");
        throw new d(stringBuilder.toString());
    }

    @Override
    public double F1(double d4) {
        return this.Q;
    }

    @Override
    public LuaString G0() {
        return LuaString.K2(this.g0());
    }

    @Override
    public int H1(int n3) {
        return (int)this.Q;
    }

    @Override
    public String I1(String string2) {
        return this.g0();
    }

    @Override
    public long J1(long l3) {
        return (long)this.Q;
    }

    @Override
    public LuaString K1(LuaString luaString) {
        return LuaString.K2(this.g0());
    }

    @Override
    public LuaValue O0(LuaValue luaValue) {
        luaValue = !luaValue.m1() ? super.O0(luaValue) : LuaDouble.S2(this.Q, luaValue.x2());
        return luaValue;
    }

    @Override
    public boolean P0(LuaValue luaValue) {
        boolean bl = !luaValue.m1() ? super.P0(luaValue) : this.Q == luaValue.x2();
        return bl;
    }

    @Override
    public LuaValue Q1(LuaValue luaValue) {
        luaValue = !luaValue.m1() ? super.Q1(luaValue) : LuaDouble.J2(Math.pow(this.Q, luaValue.x2()));
        return luaValue;
    }

    @Override
    public boolean T1(LuaValue luaValue) {
        boolean bl = luaValue.m1();
        boolean bl2 = false;
        if (bl && this.Q == luaValue.x2()) {
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public boolean X0(LuaValue luaValue) {
        boolean bl = !(luaValue instanceof LuaNumber) ? super.X0(luaValue) : this.Q > luaValue.x2();
        return bl;
    }

    @Override
    public boolean Y0(LuaValue luaValue) {
        boolean bl = !(luaValue instanceof LuaNumber) ? super.Y0(luaValue) : this.Q >= luaValue.x2();
        return bl;
    }

    @Override
    public LuaValue Z0(LuaValue luaValue) {
        luaValue = !luaValue.m1() ? super.Z0(luaValue) : LuaDouble.T2(this.Q, luaValue.x2());
        return luaValue;
    }

    @Override
    public boolean equals(Object object) {
        boolean bl;
        boolean bl2 = object instanceof LuaDouble;
        boolean bl3 = bl = false;
        if (bl2) {
            bl3 = bl;
            if (Double.doubleToRawLongBits(((LuaDouble)object).Q) == Double.doubleToRawLongBits(this.Q)) {
                bl3 = true;
            }
        }
        return bl3;
    }

    @Override
    public String g0() {
        double d4 = this.Q;
        if (d4 == 0.0) {
            String string2 = Double.doubleToLongBits(d4) >> 63 == 0L ? "0.0" : "-0.0";
            return string2;
        }
        if (Double.isNaN(d4)) {
            return "nan";
        }
        if (Double.isInfinite(this.Q)) {
            String string3 = this.Q < 0.0 ? "-inf" : "inf";
            return string3;
        }
        d4 = this.Q;
        long l3 = (long)d4;
        String string4 = (double)l3 == d4 ? Long.toString(l3) : Double.toString(d4);
        CharSequence charSequence = string4;
        if (string4.indexOf(46) == -1) {
            charSequence = string4;
            if (string4.indexOf(101) == -1) {
                charSequence = string4;
                if (string4.indexOf(69) == -1) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(string4);
                    ((StringBuilder)charSequence).append(".0");
                    charSequence = ((StringBuilder)charSequence).toString();
                }
            }
        }
        return charSequence;
    }

    public int hashCode() {
        double d4 = this.Q;
        int n3 = (int)d4;
        long l3 = (double)n3 == d4 ? (long)n3 : Double.doubleToRawLongBits(d4);
        return (int)(l3 ^ l3 >>> 32);
    }

    @Override
    public boolean i1() {
        double d4 = this.Q;
        boolean bl = (double)((int)d4) == d4;
        return bl;
    }

    @Override
    public LuaValue j0(LuaValue luaValue) {
        luaValue = !luaValue.m1() ? super.j0(luaValue) : LuaDouble.J2(this.Q + luaValue.x2());
        return luaValue;
    }

    @Override
    public boolean k1() {
        double d4 = this.Q;
        boolean bl = -9.007199254740992E15 <= d4 && d4 <= 9.007199254740992E15 && (double)((long)d4) == d4;
        return bl;
    }

    @Override
    public LuaValue m2(LuaValue luaValue) {
        luaValue = this.V2("<<", luaValue) ? super.m2(luaValue) : LuaLong.X2(this.z2(), luaValue.z2());
        return luaValue;
    }

    @Override
    public LuaValue n2(LuaValue luaValue) {
        luaValue = this.V2(">>", luaValue) ? super.n2(luaValue) : LuaLong.Y2(this.z2(), luaValue.z2());
        return luaValue;
    }

    @Override
    public LuaValue o0(LuaValue luaValue) {
        luaValue = this.V2("&", luaValue) ? super.o0(luaValue) : LuaValue.I2(this.z2() & luaValue.z2());
        return luaValue;
    }

    @Override
    public LuaValue q0() {
        LuaValue luaValue = !this.k1() ? super.q0() : LuaValue.I2(this.z2() ^ 0xFFFFFFFFFFFFFFFFL);
        return luaValue;
    }

    @Override
    public boolean q1() {
        return Double.isNaN(this.Q) ^ true;
    }

    @Override
    public LuaString q2() {
        return LuaString.K2(this.g0());
    }

    @Override
    public LuaValue r0(LuaValue luaValue) {
        luaValue = this.V2("|", luaValue) ? super.r0(luaValue) : LuaValue.I2(this.z2() | luaValue.z2());
        return luaValue;
    }

    @Override
    public LuaValue r2(LuaValue luaValue) {
        luaValue = !luaValue.m1() ? super.r2(luaValue) : LuaDouble.J2(this.Q - luaValue.x2());
        return luaValue;
    }

    @Override
    public LuaValue t0(LuaValue luaValue) {
        luaValue = this.V2("~", luaValue) ? super.t0(luaValue) : LuaValue.I2(this.z2() ^ luaValue.z2());
        return luaValue;
    }

    @Override
    public boolean u1(LuaValue luaValue) {
        boolean bl = !(luaValue instanceof LuaNumber) ? super.u1(luaValue) : this.Q < luaValue.x2();
        return bl;
    }

    @Override
    public boolean v1(LuaValue luaValue) {
        boolean bl = !(luaValue instanceof LuaNumber) ? super.v1(luaValue) : this.Q <= luaValue.x2();
        return bl;
    }

    @Override
    public double x0() {
        return this.Q;
    }

    @Override
    public double x2() {
        return this.Q;
    }

    @Override
    public LuaValue y1(LuaValue luaValue) {
        luaValue = !luaValue.m1() ? super.y1(luaValue) : LuaDouble.U2(this.Q, luaValue.x2());
        return luaValue;
    }

    @Override
    public int y2() {
        return (int)this.Q;
    }

    @Override
    public LuaValue z1(LuaValue luaValue) {
        luaValue = !luaValue.m1() ? super.z1(luaValue) : LuaDouble.J2(this.Q * luaValue.x2());
        return luaValue;
    }

    @Override
    public long z2() {
        return (long)this.Q;
    }
}

