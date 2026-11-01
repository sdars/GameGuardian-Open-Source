package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class LuaLong extends LuaNumber {
    public static final LuaLong R = new LuaLong(Long.MAX_VALUE);
    public static final LuaLong S = new LuaLong(Long.MIN_VALUE);
    private static final LuaLong[] T = new LuaLong[512];
    private static final LuaString[] U = new LuaString[512];
    private static final String[] V = new String[512];
    public final long Q;

    LuaLong(long j) {
        this.Q = j;
    }

    public static LuaLong I2(long j) {
        if (j > 255 || j < -256) {
            if (j == Long.MAX_VALUE) {
                return R;
            }
            return j == Long.MIN_VALUE ? S : new LuaLong(j);
        }
        LuaLong[] luaLongArr = T;
        int i = (int) (256 + j);
        LuaLong luaLong = luaLongArr[i];
        if (luaLong != null) {
            return luaLong;
        }
        LuaLong luaLong2 = new LuaLong(j);
        luaLongArr[i] = luaLong2;
        return luaLong2;
    }

    public static long S2(long j, long j2) {
        if (j2 != 0) {
            long j3 = j / j2;
            return ((j ^ j2) >= 0 || j2 * j3 == j) ? j3 : j3 - 1;
        }
        throw new d("attempt to divide by zero (as '" + j + " // " + j2 + "')");
    }

    private LuaString T2() {
        long j = this.Q;
        if (j > 255 || j < -256) {
            return LuaString.K2(U2());
        }
        LuaString[] luaStringArr = U;
        LuaString luaString = luaStringArr[(int) (j + 256)];
        if (luaString != null) {
            return luaString;
        }
        LuaString luaStringK2 = LuaString.K2(U2());
        luaStringArr[(int) (j + 256)] = luaStringK2;
        return luaStringK2;
    }

    private String U2() {
        long j = this.Q;
        if (j > 255 || j < -256) {
            return Long.toString(j);
        }
        String[] strArr = V;
        String str = strArr[(int) (j + 256)];
        if (str != null) {
            return str;
        }
        String string = Long.toString(j);
        strArr[(int) (256 + j)] = string;
        return string;
    }

    public static int V2(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static long W2(long j, long j2) {
        if (j2 != 0) {
            long j3 = j % j2;
            if (j3 != 0) {
                return (j2 < 0) ^ ((j3 > 0L ? 1 : (j3 == 0L ? 0 : -1)) < 0) ? j3 + j2 : j3;
            }
            return j3;
        }
        throw new d("attempt to perform 'n%0' (as '" + j + " % " + j2 + "')");
    }

    public static LuaValue X2(long j, long j2) {
        if (j2 < 0) {
            return Y2(j, -j2);
        }
        return j2 > 63 ? LuaValue.f1675g : I2(j << ((int) j2));
    }

    public static LuaValue Y2(long j, long j2) {
        if (j2 < 0) {
            return X2(j, -j2);
        }
        return j2 > 63 ? LuaValue.f1675g : I2(j >>> ((int) j2));
    }

    @Override // luaj.LuaValue
    public int A0() {
        return (int) this.Q;
    }

    @Override // luaj.LuaValue
    public LuaValue A1() {
        return I2(-this.Q);
    }

    @Override // luaj.LuaValue
    public String B0() {
        return String.valueOf(this.Q);
    }

    @Override // luaj.LuaValue
    public LuaValue B2() {
        return T2();
    }

    @Override // luaj.LuaValue
    public long C0() {
        return this.Q;
    }

    @Override // luaj.LuaValue
    public double F1(double d2) {
        return this.Q;
    }

    @Override // luaj.LuaValue
    public LuaString G0() {
        return LuaValue.K2(String.valueOf(this.Q));
    }

    @Override // luaj.LuaValue
    public int H1(int i) {
        return (int) this.Q;
    }

    @Override // luaj.LuaValue
    public String I1(String str) {
        return U2();
    }

    @Override // luaj.LuaValue
    public long J1(long j) {
        return this.Q;
    }

    @Override // luaj.LuaValue
    public LuaString K1(LuaString luaString) {
        return T2();
    }

    @Override // luaj.LuaValue
    public LuaValue O0(LuaValue luaValue) {
        if (luaValue.m1()) {
            return (!luaValue.k1() || luaValue.z2() == 0) ? LuaDouble.S2(this.Q, luaValue.x2()) : I2(this.Q / luaValue.z2());
        }
        return super.O0(luaValue);
    }

    @Override // luaj.LuaValue
    public boolean P0(LuaValue luaValue) {
        if (!luaValue.m1()) {
            return super.P0(luaValue);
        }
        boolean zK1 = luaValue.k1();
        long j = this.Q;
        return !zK1 ? ((double) j) != luaValue.x2() : j != luaValue.z2();
    }

    @Override // luaj.LuaValue
    public LuaValue Q1(LuaValue luaValue) {
        return !luaValue.m1() ? super.Q1(luaValue) : LuaValue.J2(Math.pow(this.Q, luaValue.x2()));
    }

    @Override // luaj.LuaValue
    public boolean T1(LuaValue luaValue) {
        if (!luaValue.m1()) {
            return false;
        }
        boolean zK1 = luaValue.k1();
        long j = this.Q;
        if (zK1) {
            if (j != luaValue.z2()) {
                return false;
            }
        } else if (j != luaValue.x2()) {
            return false;
        }
        return true;
    }

    @Override // luaj.LuaValue
    public boolean X0(LuaValue luaValue) {
        if (!(luaValue instanceof LuaNumber)) {
            return super.X0(luaValue);
        }
        boolean zK1 = luaValue.k1();
        long j = this.Q;
        return !zK1 ? ((double) j) <= luaValue.x2() : j <= luaValue.z2();
    }

    @Override // luaj.LuaValue
    public boolean Y0(LuaValue luaValue) {
        if (!(luaValue instanceof LuaNumber)) {
            return super.Y0(luaValue);
        }
        boolean zK1 = luaValue.k1();
        long j = this.Q;
        return !zK1 ? ((double) j) < luaValue.x2() : j < luaValue.z2();
    }

    @Override // luaj.LuaValue
    public LuaValue Z0(LuaValue luaValue) {
        if (luaValue.m1()) {
            return luaValue.j1() ? I2(S2(this.Q, luaValue.z2())) : LuaDouble.T2(this.Q, luaValue.x2());
        }
        return super.Z0(luaValue);
    }

    @Override // luaj.LuaValue
    public boolean equals(Object obj) {
        return (obj instanceof LuaLong) && ((LuaLong) obj).Q == this.Q;
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public String g0() {
        return U2();
    }

    @Override // luaj.LuaValue
    public boolean h1() {
        return true;
    }

    public int hashCode() {
        return V2(this.Q);
    }

    @Override // luaj.LuaValue
    public boolean i1() {
        long j = this.Q;
        return ((long) ((int) j)) == j;
    }

    @Override // luaj.LuaValue
    public LuaValue j0(LuaValue luaValue) {
        if (luaValue.m1()) {
            return luaValue.k1() ? I2(this.Q + luaValue.z2()) : LuaValue.J2(this.Q + luaValue.x2());
        }
        return super.j0(luaValue);
    }

    @Override // luaj.LuaValue
    public boolean j1() {
        return true;
    }

    @Override // luaj.LuaValue
    public boolean k1() {
        return true;
    }

    @Override // luaj.LuaValue
    public LuaValue m2(LuaValue luaValue) {
        return !luaValue.k1() ? super.m2(luaValue) : X2(this.Q, luaValue.z2());
    }

    @Override // luaj.LuaValue
    public LuaValue n2(LuaValue luaValue) {
        return !luaValue.k1() ? super.n2(luaValue) : Y2(this.Q, luaValue.z2());
    }

    @Override // luaj.LuaValue
    public LuaValue o0(LuaValue luaValue) {
        return !luaValue.k1() ? super.o0(luaValue) : I2(this.Q & luaValue.z2());
    }

    @Override // luaj.LuaValue
    public LuaValue q0() {
        return I2(~this.Q);
    }

    @Override // luaj.LuaValue
    public LuaString q2() {
        return T2();
    }

    @Override // luaj.LuaValue
    public LuaValue r0(LuaValue luaValue) {
        return !luaValue.k1() ? super.r0(luaValue) : I2(this.Q | luaValue.z2());
    }

    @Override // luaj.LuaValue
    public LuaValue r2(LuaValue luaValue) {
        if (luaValue.m1()) {
            return luaValue.k1() ? I2(this.Q - luaValue.z2()) : LuaValue.J2(this.Q - luaValue.x2());
        }
        return super.r2(luaValue);
    }

    @Override // luaj.LuaValue
    public LuaValue t0(LuaValue luaValue) {
        return !luaValue.k1() ? super.t0(luaValue) : I2(this.Q ^ luaValue.z2());
    }

    @Override // luaj.LuaValue
    public boolean u1(LuaValue luaValue) {
        if (!(luaValue instanceof LuaNumber)) {
            return super.u1(luaValue);
        }
        boolean zK1 = luaValue.k1();
        long j = this.Q;
        return !zK1 ? ((double) j) >= luaValue.x2() : j >= luaValue.z2();
    }

    @Override // luaj.LuaValue
    public boolean v1(LuaValue luaValue) {
        if (!(luaValue instanceof LuaNumber)) {
            return super.v1(luaValue);
        }
        boolean zK1 = luaValue.k1();
        long j = this.Q;
        return !zK1 ? ((double) j) > luaValue.x2() : j > luaValue.z2();
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
        if (luaValue.m1()) {
            return luaValue.j1() ? I2(W2(this.Q, luaValue.z2())) : LuaDouble.U2(this.Q, luaValue.x2());
        }
        return super.y1(luaValue);
    }

    @Override // luaj.LuaValue
    public int y2() {
        return (int) this.Q;
    }

    @Override // luaj.LuaValue
    public LuaValue z1(LuaValue luaValue) {
        if (luaValue.m1()) {
            return luaValue.k1() ? I2(this.Q * luaValue.z2()) : LuaValue.J2(this.Q * luaValue.x2());
        }
        return super.z1(luaValue);
    }

    @Override // luaj.LuaValue
    public long z2() {
        return this.Q;
    }
}
