/*
 * Decompiled with CFR 0.152.
 */
package luaj;

import luaj.LuaDouble;
import luaj.LuaNumber;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.d;

public class LuaLong
extends LuaNumber {
    public static final LuaLong R = new LuaLong(Long.MAX_VALUE);
    public static final LuaLong S = new LuaLong(Long.MIN_VALUE);
    private static final LuaLong[] T = new LuaLong[512];
    private static final LuaString[] U = new LuaString[512];
    private static final String[] V = new String[512];
    public final long Q;

    LuaLong(long l3) {
        this.Q = l3;
    }

    public static LuaLong I2(long l3) {
        if (l3 <= 255L && l3 >= -256L) {
            LuaLong luaLong;
            LuaLong[] luaLongArray = T;
            int n3 = (int)(256L + l3);
            LuaLong luaLong2 = luaLong = luaLongArray[n3];
            if (luaLong == null) {
                luaLongArray[n3] = luaLong2 = new LuaLong(l3);
            }
            return luaLong2;
        }
        if (l3 == Long.MAX_VALUE) {
            return R;
        }
        if (l3 == Long.MIN_VALUE) {
            return S;
        }
        return new LuaLong(l3);
    }

    public static long S2(long l3, long l4) {
        if (l4 != 0L) {
            long l5;
            long l6 = l5 = l3 / l4;
            if ((l3 ^ l4) < 0L) {
                l6 = l5;
                if (l4 * l5 != l3) {
                    l6 = l5 - 1L;
                }
            }
            return l6;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("attempt to divide by zero (as '");
        stringBuilder.append(l3);
        stringBuilder.append(" // ");
        stringBuilder.append(l4);
        stringBuilder.append("')");
        throw new d(stringBuilder.toString());
    }

    private LuaString T2() {
        long l3 = this.Q;
        if (l3 <= 255L && l3 >= -256L) {
            LuaString luaString;
            LuaString[] luaStringArray = U;
            LuaString luaString2 = luaString = luaStringArray[(int)(l3 + 256L)];
            if (luaString == null) {
                int n3 = (int)(l3 + 256L);
                luaStringArray[n3] = luaString2 = LuaString.K2(this.U2());
            }
            return luaString2;
        }
        return LuaString.K2(this.U2());
    }

    private String U2() {
        long l3 = this.Q;
        if (l3 <= 255L && l3 >= -256L) {
            String string2;
            String[] stringArray = V;
            String string3 = string2 = stringArray[(int)(l3 + 256L)];
            if (string2 == null) {
                int n3 = (int)(256L + l3);
                stringArray[n3] = string3 = Long.toString(l3);
            }
            return string3;
        }
        return Long.toString(l3);
    }

    public static int V2(long l3) {
        return (int)(l3 ^ l3 >>> 32);
    }

    public static long W2(long l3, long l4) {
        long l5 = l4 - 0L;
        long l6 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
        if (l6 != false) {
            long l7 = l3 % l4;
            long l8 = l7 - 0L;
            long l9 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            l3 = l7;
            if (l9 != false) {
                int n3 = 0;
                l9 = l9 < 0 ? (long)1 : (long)0;
                if (l6 < 0) {
                    n3 = 1;
                }
                l3 = l7;
                if ((n3 ^ l9) != 0) {
                    l3 = l7 + l4;
                }
            }
            return l3;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("attempt to perform 'n%0' (as '");
        stringBuilder.append(l3);
        stringBuilder.append(" % ");
        stringBuilder.append(l4);
        stringBuilder.append("')");
        throw new d(stringBuilder.toString());
    }

    public static LuaValue X2(long l3, long l4) {
        if (l4 < 0L) {
            return LuaLong.Y2(l3, -l4);
        }
        if (l4 > 63L) {
            return LuaValue.g;
        }
        return LuaLong.I2(l3 << (int)l4);
    }

    public static LuaValue Y2(long l3, long l4) {
        if (l4 < 0L) {
            return LuaLong.X2(l3, -l4);
        }
        if (l4 > 63L) {
            return LuaValue.g;
        }
        return LuaLong.I2(l3 >>> (int)l4);
    }

    @Override
    public int A0() {
        return (int)this.Q;
    }

    @Override
    public LuaValue A1() {
        return LuaLong.I2(-this.Q);
    }

    @Override
    public String B0() {
        return String.valueOf(this.Q);
    }

    @Override
    public LuaValue B2() {
        return this.T2();
    }

    @Override
    public long C0() {
        return this.Q;
    }

    @Override
    public double F1(double d4) {
        return this.Q;
    }

    @Override
    public LuaString G0() {
        return LuaValue.K2(String.valueOf(this.Q));
    }

    @Override
    public int H1(int n3) {
        return (int)this.Q;
    }

    @Override
    public String I1(String string2) {
        return this.U2();
    }

    @Override
    public long J1(long l3) {
        return this.Q;
    }

    @Override
    public LuaString K1(LuaString luaString) {
        return this.T2();
    }

    @Override
    public LuaValue O0(LuaValue luaValue) {
        luaValue = !luaValue.m1() ? super.O0(luaValue) : (luaValue.k1() && luaValue.z2() != 0L ? LuaLong.I2(this.Q / luaValue.z2()) : LuaDouble.S2(this.Q, luaValue.x2()));
        return luaValue;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean P0(LuaValue luaValue) {
        if (!luaValue.m1()) {
            return super.P0(luaValue);
        }
        boolean bl = luaValue.k1();
        long l3 = this.Q;
        if (bl) {
            if (l3 != luaValue.z2()) return false;
            return true;
        }
        if ((double)l3 != luaValue.x2()) return false;
        return true;
    }

    @Override
    public LuaValue Q1(LuaValue luaValue) {
        luaValue = !luaValue.m1() ? super.Q1(luaValue) : LuaValue.J2(Math.pow(this.Q, luaValue.x2()));
        return luaValue;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean T1(LuaValue luaValue) {
        boolean bl = luaValue.m1();
        boolean bl2 = false;
        if (!bl) return bl2;
        bl = luaValue.k1();
        long l3 = this.Q;
        if (bl) {
            if (l3 != luaValue.z2()) return bl2;
            return true;
        }
        if ((double)l3 != luaValue.x2()) return bl2;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean X0(LuaValue luaValue) {
        if (!(luaValue instanceof LuaNumber)) {
            return super.X0(luaValue);
        }
        boolean bl = luaValue.k1();
        long l3 = this.Q;
        if (bl) {
            if (l3 <= luaValue.z2()) return false;
            return true;
        }
        if (!((double)l3 > luaValue.x2())) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean Y0(LuaValue luaValue) {
        if (!(luaValue instanceof LuaNumber)) {
            return super.Y0(luaValue);
        }
        boolean bl = luaValue.k1();
        long l3 = this.Q;
        if (bl) {
            if (l3 < luaValue.z2()) return false;
            return true;
        }
        if (!((double)l3 >= luaValue.x2())) return false;
        return true;
    }

    @Override
    public LuaValue Z0(LuaValue luaValue) {
        luaValue = !luaValue.m1() ? super.Z0(luaValue) : (luaValue.j1() ? LuaLong.I2(LuaLong.S2(this.Q, luaValue.z2())) : LuaDouble.T2(this.Q, luaValue.x2()));
        return luaValue;
    }

    @Override
    public boolean equals(Object object) {
        boolean bl;
        boolean bl2 = object instanceof LuaLong;
        boolean bl3 = bl = false;
        if (bl2) {
            bl3 = bl;
            if (((LuaLong)object).Q == this.Q) {
                bl3 = true;
            }
        }
        return bl3;
    }

    @Override
    public String g0() {
        return this.U2();
    }

    @Override
    public boolean h1() {
        return true;
    }

    public int hashCode() {
        return LuaLong.V2(this.Q);
    }

    @Override
    public boolean i1() {
        long l3 = this.Q;
        boolean bl = (long)((int)l3) == l3;
        return bl;
    }

    @Override
    public LuaValue j0(LuaValue luaValue) {
        luaValue = !luaValue.m1() ? super.j0(luaValue) : (luaValue.k1() ? LuaLong.I2(this.Q + luaValue.z2()) : LuaValue.J2((double)this.Q + luaValue.x2()));
        return luaValue;
    }

    @Override
    public boolean j1() {
        return true;
    }

    @Override
    public boolean k1() {
        return true;
    }

    @Override
    public LuaValue m2(LuaValue luaValue) {
        luaValue = !luaValue.k1() ? super.m2(luaValue) : LuaLong.X2(this.Q, luaValue.z2());
        return luaValue;
    }

    @Override
    public LuaValue n2(LuaValue luaValue) {
        luaValue = !luaValue.k1() ? super.n2(luaValue) : LuaLong.Y2(this.Q, luaValue.z2());
        return luaValue;
    }

    @Override
    public LuaValue o0(LuaValue luaValue) {
        luaValue = !luaValue.k1() ? super.o0(luaValue) : LuaLong.I2(this.Q & luaValue.z2());
        return luaValue;
    }

    @Override
    public LuaValue q0() {
        return LuaLong.I2(this.Q ^ 0xFFFFFFFFFFFFFFFFL);
    }

    @Override
    public LuaString q2() {
        return this.T2();
    }

    @Override
    public LuaValue r0(LuaValue luaValue) {
        luaValue = !luaValue.k1() ? super.r0(luaValue) : LuaLong.I2(this.Q | luaValue.z2());
        return luaValue;
    }

    @Override
    public LuaValue r2(LuaValue luaValue) {
        luaValue = !luaValue.m1() ? super.r2(luaValue) : (luaValue.k1() ? LuaLong.I2(this.Q - luaValue.z2()) : LuaValue.J2((double)this.Q - luaValue.x2()));
        return luaValue;
    }

    @Override
    public LuaValue t0(LuaValue luaValue) {
        luaValue = !luaValue.k1() ? super.t0(luaValue) : LuaLong.I2(this.Q ^ luaValue.z2());
        return luaValue;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean u1(LuaValue luaValue) {
        if (!(luaValue instanceof LuaNumber)) {
            return super.u1(luaValue);
        }
        boolean bl = luaValue.k1();
        long l3 = this.Q;
        if (bl) {
            if (l3 >= luaValue.z2()) return false;
            return true;
        }
        if (!((double)l3 < luaValue.x2())) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean v1(LuaValue luaValue) {
        if (!(luaValue instanceof LuaNumber)) {
            return super.v1(luaValue);
        }
        boolean bl = luaValue.k1();
        long l3 = this.Q;
        if (bl) {
            if (l3 > luaValue.z2()) return false;
            return true;
        }
        if (!((double)l3 <= luaValue.x2())) return false;
        return true;
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
        luaValue = !luaValue.m1() ? super.y1(luaValue) : (luaValue.j1() ? LuaLong.I2(LuaLong.W2(this.Q, luaValue.z2())) : LuaDouble.U2(this.Q, luaValue.x2()));
        return luaValue;
    }

    @Override
    public int y2() {
        return (int)this.Q;
    }

    @Override
    public LuaValue z1(LuaValue luaValue) {
        luaValue = !luaValue.m1() ? super.z1(luaValue) : (luaValue.k1() ? LuaLong.I2(this.Q * luaValue.z2()) : LuaValue.J2((double)this.Q * luaValue.x2()));
        return luaValue;
    }

    @Override
    public long z2() {
        return this.Q;
    }
}

