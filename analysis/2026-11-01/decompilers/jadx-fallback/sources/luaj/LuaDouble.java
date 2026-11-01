package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class LuaDouble extends luaj.LuaNumber {
    public static final luaj.LuaDouble R = null;
    public static final luaj.LuaDouble S = null;
    public static final luaj.LuaDouble T = null;
    final double Q;

    static {
            luaj.LuaDouble r0 = new luaj.LuaDouble
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r0.<init>(r1)
            luaj.LuaDouble.R = r0
            luaj.LuaDouble r0 = new luaj.LuaDouble
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r0.<init>(r1)
            luaj.LuaDouble.S = r0
            luaj.LuaDouble r0 = new luaj.LuaDouble
            r1 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r0.<init>(r1)
            luaj.LuaDouble.T = r0
            return
    }

    private LuaDouble(double r1) {
            r0 = this;
            r0.<init>()
            r0.Q = r1
            return
    }

    public static luaj.LuaNumber J2(double r1) {
            luaj.LuaDouble r0 = new luaj.LuaDouble
            r0.<init>(r1)
            return r0
    }

    public static luaj.LuaValue S2(double r3, double r5) {
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto Lc
            double r3 = r3 / r5
            luaj.LuaNumber r3 = J2(r3)
            goto L1a
        Lc:
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto L13
            luaj.LuaDouble r3 = luaj.LuaDouble.S
            goto L1a
        L13:
            if (r5 != 0) goto L18
            luaj.LuaDouble r3 = luaj.LuaDouble.R
            goto L1a
        L18:
            luaj.LuaDouble r3 = luaj.LuaDouble.T
        L1a:
            return r3
    }

    public static luaj.LuaValue T2(double r3, double r5) {
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto L10
            double r3 = r3 / r5
            double r3 = java.lang.Math.floor(r3)
            luaj.LuaNumber r3 = J2(r3)
            goto L1e
        L10:
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto L17
            luaj.LuaDouble r3 = luaj.LuaDouble.S
            goto L1e
        L17:
            if (r5 != 0) goto L1c
            luaj.LuaDouble r3 = luaj.LuaDouble.R
            goto L1e
        L1c:
            luaj.LuaDouble r3 = luaj.LuaDouble.T
        L1e:
            return r3
    }

    public static luaj.LuaValue U2(double r7, double r9) {
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 == 0) goto L41
            r2 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 == 0) goto L41
            r4 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L13
            goto L41
        L13:
            int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r6 != 0) goto L23
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 >= 0) goto L1e
            luaj.LuaDouble r7 = luaj.LuaDouble.S
            goto L22
        L1e:
            luaj.LuaNumber r7 = J2(r7)
        L22:
            return r7
        L23:
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 != 0) goto L33
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 <= 0) goto L2e
            luaj.LuaDouble r7 = luaj.LuaDouble.T
            goto L32
        L2e:
            luaj.LuaNumber r7 = J2(r7)
        L32:
            return r7
        L33:
            double r0 = r7 / r9
            double r0 = java.lang.Math.floor(r0)
            double r9 = r9 * r0
            double r7 = r7 - r9
            luaj.LuaNumber r7 = J2(r7)
            return r7
        L41:
            luaj.LuaDouble r7 = luaj.LuaDouble.R
            return r7
    }

    private boolean V2(java.lang.String r7, luaj.LuaValue r8) {
            r6 = this;
            boolean r0 = r8.m1()
            if (r0 != 0) goto L8
            r7 = 1
            return r7
        L8:
            boolean r0 = r6.k1()
            java.lang.String r1 = "')"
            java.lang.String r2 = "' has no integer representation (for bitwise operation '"
            java.lang.String r3 = "number '"
            java.lang.String r4 = " "
            if (r0 == 0) goto L54
            boolean r0 = r8.k1()
            if (r0 == 0) goto L1e
            r7 = 0
            return r7
        L1e:
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = r8.g0()
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r6.g0()
            r5.append(r2)
            r5.append(r4)
            r5.append(r7)
            r5.append(r4)
            java.lang.String r7 = r8.g0()
            r5.append(r7)
            r5.append(r1)
            java.lang.String r7 = r5.toString()
            r0.<init>(r7)
            throw r0
        L54:
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = r6.g0()
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r6.g0()
            r5.append(r2)
            r5.append(r4)
            r5.append(r7)
            r5.append(r4)
            java.lang.String r7 = r8.g0()
            r5.append(r7)
            r5.append(r1)
            java.lang.String r7 = r5.toString()
            r0.<init>(r7)
            throw r0
    }

    @Override // luaj.LuaValue
    public int A0() {
            r6 = this;
            double r0 = r6.Q
            long r2 = (long) r0
            int r3 = (int) r2
            double r4 = (double) r3
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            return r3
        La:
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "number '"
            r1.append(r2)
            java.lang.String r2 = r6.g0()
            r1.append(r2)
            java.lang.String r2 = "' has no integer representation"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue A1() {
            r2 = this;
            double r0 = r2.Q
            double r0 = -r0
            luaj.LuaNumber r0 = J2(r0)
            return r0
    }

    @Override // luaj.LuaValue
    public java.lang.String B0() {
            r1 = this;
            java.lang.String r0 = r1.g0()
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue B2() {
            r1 = this;
            java.lang.String r0 = r1.g0()
            luaj.LuaString r0 = luaj.LuaString.K2(r0)
            return r0
    }

    @Override // luaj.LuaValue
    public long C0() {
            r7 = this;
            double r0 = r7.Q
            long r2 = (long) r0
            double r4 = (double) r2
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L9
            return r2
        L9:
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "number '"
            r1.append(r2)
            java.lang.String r2 = r7.g0()
            r1.append(r2)
            java.lang.String r2 = "' has no integer representation"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // luaj.LuaValue
    public double F1(double r1) {
            r0 = this;
            double r1 = r0.Q
            return r1
    }

    @Override // luaj.LuaValue
    public luaj.LuaString G0() {
            r1 = this;
            java.lang.String r0 = r1.g0()
            luaj.LuaString r0 = luaj.LuaString.K2(r0)
            return r0
    }

    @Override // luaj.LuaValue
    public int H1(int r3) {
            r2 = this;
            double r0 = r2.Q
            long r0 = (long) r0
            int r3 = (int) r0
            return r3
    }

    @Override // luaj.LuaValue
    public java.lang.String I1(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.g0()
            return r1
    }

    @Override // luaj.LuaValue
    public long J1(long r1) {
            r0 = this;
            double r1 = r0.Q
            long r1 = (long) r1
            return r1
    }

    @Override // luaj.LuaValue
    public luaj.LuaString K1(luaj.LuaString r1) {
            r0 = this;
            java.lang.String r1 = r0.g0()
            luaj.LuaString r1 = luaj.LuaString.K2(r1)
            return r1
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue O0(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5.m1()
            if (r0 != 0) goto Lb
            luaj.LuaValue r5 = super.O0(r5)
            goto L15
        Lb:
            double r0 = r4.Q
            double r2 = r5.x2()
            luaj.LuaValue r5 = S2(r0, r2)
        L15:
            return r5
    }

    @Override // luaj.LuaValue
    public boolean P0(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5.m1()
            if (r0 != 0) goto Lb
            boolean r5 = super.P0(r5)
            goto L18
        Lb:
            double r0 = r4.Q
            double r2 = r5.x2()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L17
            r5 = 1
            goto L18
        L17:
            r5 = 0
        L18:
            return r5
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue Q1(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5.m1()
            if (r0 != 0) goto Lb
            luaj.LuaValue r5 = super.Q1(r5)
            goto L19
        Lb:
            double r0 = r4.Q
            double r2 = r5.x2()
            double r0 = java.lang.Math.pow(r0, r2)
            luaj.LuaNumber r5 = J2(r0)
        L19:
            return r5
    }

    @Override // luaj.LuaValue
    public boolean T1(luaj.LuaValue r7) {
            r6 = this;
            boolean r0 = r7.m1()
            r1 = 0
            if (r0 != 0) goto L8
            goto L13
        L8:
            double r2 = r6.Q
            double r4 = r7.x2()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L13
            r1 = 1
        L13:
            return r1
    }

    @Override // luaj.LuaValue
    public boolean X0(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5 instanceof luaj.LuaNumber
            if (r0 != 0) goto L9
            boolean r5 = super.X0(r5)
            goto L16
        L9:
            double r0 = r4.Q
            double r2 = r5.x2()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            return r5
    }

    @Override // luaj.LuaValue
    public boolean Y0(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5 instanceof luaj.LuaNumber
            if (r0 != 0) goto L9
            boolean r5 = super.Y0(r5)
            goto L16
        L9:
            double r0 = r4.Q
            double r2 = r5.x2()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            return r5
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue Z0(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5.m1()
            if (r0 != 0) goto Lb
            luaj.LuaValue r5 = super.Z0(r5)
            goto L15
        Lb:
            double r0 = r4.Q
            double r2 = r5.x2()
            luaj.LuaValue r5 = T2(r0, r2)
        L15:
            return r5
    }

    @Override // luaj.LuaValue
    public boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof luaj.LuaDouble
            r1 = 0
            if (r0 == 0) goto L18
            luaj.LuaDouble r7 = (luaj.LuaDouble) r7
            double r2 = r7.Q
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            double r4 = r6.Q
            long r4 = java.lang.Double.doubleToRawLongBits(r4)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L18
            r1 = 1
        L18:
            return r1
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public java.lang.String g0() {
            r7 = this;
            double r0 = r7.Q
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1b
            long r0 = java.lang.Double.doubleToLongBits(r0)
            r2 = 63
            long r0 = r0 >> r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L18
            java.lang.String r0 = "0.0"
            goto L1a
        L18:
            java.lang.String r0 = "-0.0"
        L1a:
            return r0
        L1b:
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = "nan"
            return r0
        L24:
            double r0 = r7.Q
            boolean r0 = java.lang.Double.isInfinite(r0)
            if (r0 == 0) goto L38
            double r0 = r7.Q
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L35
            java.lang.String r0 = "-inf"
            goto L37
        L35:
            java.lang.String r0 = "inf"
        L37:
            return r0
        L38:
            double r0 = r7.Q
            long r2 = (long) r0
            double r4 = (double) r2
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L45
            java.lang.String r0 = java.lang.Long.toString(r2)
            goto L49
        L45:
            java.lang.String r0 = java.lang.Double.toString(r0)
        L49:
            r1 = 46
            int r1 = r0.indexOf(r1)
            r2 = -1
            if (r1 != r2) goto L73
            r1 = 101(0x65, float:1.42E-43)
            int r1 = r0.indexOf(r1)
            if (r1 != r2) goto L73
            r1 = 69
            int r1 = r0.indexOf(r1)
            if (r1 != r2) goto L73
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ".0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L73:
            return r0
    }

    public int hashCode() {
            r6 = this;
            double r0 = r6.Q
            int r2 = (int) r0
            double r3 = (double) r2
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto La
            long r0 = (long) r2
            goto Le
        La:
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
        Le:
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            return r1
    }

    @Override // luaj.LuaValue
    public boolean i1() {
            r5 = this;
            double r0 = r5.Q
            int r2 = (int) r0
            double r2 = (double) r2
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue j0(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5.m1()
            if (r0 != 0) goto Lb
            luaj.LuaValue r5 = super.j0(r5)
            goto L16
        Lb:
            double r0 = r4.Q
            double r2 = r5.x2()
            double r0 = r0 + r2
            luaj.LuaNumber r5 = J2(r0)
        L16:
            return r5
    }

    @Override // luaj.LuaValue
    public boolean k1() {
            r5 = this;
            double r0 = r5.Q
            r2 = -4377498837804122112(0xc340000000000000, double:-9.007199254740992E15)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L16
            r2 = 4845873199050653696(0x4340000000000000, double:9.007199254740992E15)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L16
            long r2 = (long) r0
            double r2 = (double) r2
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue m2(luaj.LuaValue r5) {
            r4 = this;
            java.lang.String r0 = "<<"
            boolean r0 = r4.V2(r0, r5)
            if (r0 == 0) goto Ld
            luaj.LuaValue r5 = super.m2(r5)
            goto L19
        Ld:
            long r0 = r4.z2()
            long r2 = r5.z2()
            luaj.LuaValue r5 = luaj.LuaLong.X2(r0, r2)
        L19:
            return r5
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue n2(luaj.LuaValue r5) {
            r4 = this;
            java.lang.String r0 = ">>"
            boolean r0 = r4.V2(r0, r5)
            if (r0 == 0) goto Ld
            luaj.LuaValue r5 = super.n2(r5)
            goto L19
        Ld:
            long r0 = r4.z2()
            long r2 = r5.z2()
            luaj.LuaValue r5 = luaj.LuaLong.Y2(r0, r2)
        L19:
            return r5
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue o0(luaj.LuaValue r5) {
            r4 = this;
            java.lang.String r0 = "&"
            boolean r0 = r4.V2(r0, r5)
            if (r0 == 0) goto Ld
            luaj.LuaValue r5 = super.o0(r5)
            goto L1a
        Ld:
            long r0 = r4.z2()
            long r2 = r5.z2()
            long r0 = r0 & r2
            luaj.LuaLong r5 = luaj.LuaValue.I2(r0)
        L1a:
            return r5
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue q0() {
            r2 = this;
            boolean r0 = r2.k1()
            if (r0 != 0) goto Lb
            luaj.LuaValue r0 = super.q0()
            goto L14
        Lb:
            long r0 = r2.z2()
            long r0 = ~r0
            luaj.LuaLong r0 = luaj.LuaValue.I2(r0)
        L14:
            return r0
    }

    @Override // luaj.LuaValue
    public boolean q1() {
            r2 = this;
            double r0 = r2.Q
            boolean r0 = java.lang.Double.isNaN(r0)
            r0 = r0 ^ 1
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaString q2() {
            r1 = this;
            java.lang.String r0 = r1.g0()
            luaj.LuaString r0 = luaj.LuaString.K2(r0)
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue r0(luaj.LuaValue r5) {
            r4 = this;
            java.lang.String r0 = "|"
            boolean r0 = r4.V2(r0, r5)
            if (r0 == 0) goto Ld
            luaj.LuaValue r5 = super.r0(r5)
            goto L1a
        Ld:
            long r0 = r4.z2()
            long r2 = r5.z2()
            long r0 = r0 | r2
            luaj.LuaLong r5 = luaj.LuaValue.I2(r0)
        L1a:
            return r5
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue r2(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5.m1()
            if (r0 != 0) goto Lb
            luaj.LuaValue r5 = super.r2(r5)
            goto L16
        Lb:
            double r0 = r4.Q
            double r2 = r5.x2()
            double r0 = r0 - r2
            luaj.LuaNumber r5 = J2(r0)
        L16:
            return r5
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue t0(luaj.LuaValue r5) {
            r4 = this;
            java.lang.String r0 = "~"
            boolean r0 = r4.V2(r0, r5)
            if (r0 == 0) goto Ld
            luaj.LuaValue r5 = super.t0(r5)
            goto L1a
        Ld:
            long r0 = r4.z2()
            long r2 = r5.z2()
            long r0 = r0 ^ r2
            luaj.LuaLong r5 = luaj.LuaValue.I2(r0)
        L1a:
            return r5
    }

    @Override // luaj.LuaValue
    public boolean u1(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5 instanceof luaj.LuaNumber
            if (r0 != 0) goto L9
            boolean r5 = super.u1(r5)
            goto L16
        L9:
            double r0 = r4.Q
            double r2 = r5.x2()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            return r5
    }

    @Override // luaj.LuaValue
    public boolean v1(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5 instanceof luaj.LuaNumber
            if (r0 != 0) goto L9
            boolean r5 = super.v1(r5)
            goto L16
        L9:
            double r0 = r4.Q
            double r2 = r5.x2()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            return r5
    }

    @Override // luaj.LuaValue
    public double x0() {
            r2 = this;
            double r0 = r2.Q
            return r0
    }

    @Override // luaj.LuaValue
    public double x2() {
            r2 = this;
            double r0 = r2.Q
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue y1(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5.m1()
            if (r0 != 0) goto Lb
            luaj.LuaValue r5 = super.y1(r5)
            goto L15
        Lb:
            double r0 = r4.Q
            double r2 = r5.x2()
            luaj.LuaValue r5 = U2(r0, r2)
        L15:
            return r5
    }

    @Override // luaj.LuaValue
    public int y2() {
            r2 = this;
            double r0 = r2.Q
            long r0 = (long) r0
            int r1 = (int) r0
            return r1
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue z1(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5.m1()
            if (r0 != 0) goto Lb
            luaj.LuaValue r5 = super.z1(r5)
            goto L17
        Lb:
            double r0 = r4.Q
            double r2 = r5.x2()
            double r0 = r0 * r2
            luaj.LuaNumber r5 = J2(r0)
        L17:
            return r5
    }

    @Override // luaj.LuaValue
    public long z2() {
            r2 = this;
            double r0 = r2.Q
            long r0 = (long) r0
            return r0
    }
}
