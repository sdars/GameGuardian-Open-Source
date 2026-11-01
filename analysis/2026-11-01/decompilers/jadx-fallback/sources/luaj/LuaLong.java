package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class LuaLong extends luaj.LuaNumber {
    public static final luaj.LuaLong R = null;
    public static final luaj.LuaLong S = null;
    private static final luaj.LuaLong[] T = null;
    private static final luaj.LuaString[] U = null;
    private static final java.lang.String[] V = null;
    public final long Q;

    static {
            luaj.LuaLong r0 = new luaj.LuaLong
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0.<init>(r1)
            luaj.LuaLong.R = r0
            luaj.LuaLong r0 = new luaj.LuaLong
            r1 = -9223372036854775808
            r0.<init>(r1)
            luaj.LuaLong.S = r0
            r0 = 512(0x200, float:7.17E-43)
            luaj.LuaLong[] r1 = new luaj.LuaLong[r0]
            luaj.LuaLong.T = r1
            luaj.LuaString[] r1 = new luaj.LuaString[r0]
            luaj.LuaLong.U = r1
            java.lang.String[] r0 = new java.lang.String[r0]
            luaj.LuaLong.V = r0
            return
    }

    LuaLong(long r1) {
            r0 = this;
            r0.<init>()
            r0.Q = r1
            return
    }

    public static luaj.LuaLong I2(long r3) {
            r0 = 255(0xff, double:1.26E-321)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L1e
            r0 = -256(0xffffffffffffff00, double:NaN)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L1e
            luaj.LuaLong[] r0 = luaj.LuaLong.T
            r1 = 256(0x100, double:1.265E-321)
            long r1 = r1 + r3
            int r2 = (int) r1
            r1 = r0[r2]
            if (r1 != 0) goto L1d
            luaj.LuaLong r1 = new luaj.LuaLong
            r1.<init>(r3)
            r0[r2] = r1
        L1d:
            return r1
        L1e:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L2a
            luaj.LuaLong r3 = luaj.LuaLong.R
            return r3
        L2a:
            r0 = -9223372036854775808
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L33
            luaj.LuaLong r3 = luaj.LuaLong.S
            return r3
        L33:
            luaj.LuaLong r0 = new luaj.LuaLong
            r0.<init>(r3)
            return r0
    }

    public static long S2(long r7, long r9) {
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 == 0) goto L18
            long r2 = r7 / r9
            long r4 = r7 ^ r9
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 >= 0) goto L17
            long r9 = r9 * r2
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L17
            r7 = 1
            long r2 = r2 - r7
        L17:
            return r2
        L18:
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "attempt to divide by zero (as '"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = " // "
            r1.append(r7)
            r1.append(r9)
            java.lang.String r7 = "')"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }

    private luaj.LuaString T2() {
            r7 = this;
            long r0 = r7.Q
            r2 = 255(0xff, double:1.26E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L26
            r2 = -256(0xffffffffffffff00, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L26
            luaj.LuaString[] r2 = luaj.LuaLong.U
            r3 = 256(0x100, double:1.265E-321)
            long r5 = r0 + r3
            int r6 = (int) r5
            r5 = r2[r6]
            if (r5 != 0) goto L25
            long r0 = r0 + r3
            int r1 = (int) r0
            java.lang.String r0 = r7.U2()
            luaj.LuaString r5 = luaj.LuaString.K2(r0)
            r2[r1] = r5
        L25:
            return r5
        L26:
            java.lang.String r0 = r7.U2()
            luaj.LuaString r0 = luaj.LuaString.K2(r0)
            return r0
    }

    private java.lang.String U2() {
            r7 = this;
            long r0 = r7.Q
            r2 = 255(0xff, double:1.26E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L22
            r2 = -256(0xffffffffffffff00, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L22
            java.lang.String[] r2 = luaj.LuaLong.V
            r3 = 256(0x100, double:1.265E-321)
            long r5 = r0 + r3
            int r6 = (int) r5
            r5 = r2[r6]
            if (r5 != 0) goto L21
            long r3 = r3 + r0
            int r4 = (int) r3
            java.lang.String r5 = java.lang.Long.toString(r0)
            r2[r4] = r5
        L21:
            return r5
        L22:
            java.lang.String r0 = java.lang.Long.toString(r0)
            return r0
    }

    public static int V2(long r2) {
            r0 = 32
            long r0 = r2 >>> r0
            long r2 = r2 ^ r0
            int r3 = (int) r2
            return r3
    }

    public static long W2(long r4, long r6) {
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L1a
            long r4 = r4 % r6
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L19
            r0 = 0
            r1 = 1
            if (r3 >= 0) goto L11
            r3 = 1
            goto L12
        L11:
            r3 = 0
        L12:
            if (r2 >= 0) goto L15
            r0 = 1
        L15:
            r0 = r0 ^ r3
            if (r0 == 0) goto L19
            long r4 = r4 + r6
        L19:
            return r4
        L1a:
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "attempt to perform 'n%0' (as '"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " % "
            r1.append(r4)
            r1.append(r6)
            java.lang.String r4 = "')"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public static luaj.LuaValue X2(long r3, long r5) {
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto Lc
            long r5 = -r5
            luaj.LuaValue r3 = Y2(r3, r5)
            return r3
        Lc:
            r0 = 63
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L15
            luaj.LuaNumber r3 = luaj.LuaValue.f1675g
            return r3
        L15:
            int r6 = (int) r5
            long r3 = r3 << r6
            luaj.LuaLong r3 = I2(r3)
            return r3
    }

    public static luaj.LuaValue Y2(long r3, long r5) {
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto Lc
            long r5 = -r5
            luaj.LuaValue r3 = X2(r3, r5)
            return r3
        Lc:
            r0 = 63
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L15
            luaj.LuaNumber r3 = luaj.LuaValue.f1675g
            return r3
        L15:
            int r6 = (int) r5
            long r3 = r3 >>> r6
            luaj.LuaLong r3 = I2(r3)
            return r3
    }

    @Override // luaj.LuaValue
    public int A0() {
            r2 = this;
            long r0 = r2.Q
            int r1 = (int) r0
            return r1
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue A1() {
            r2 = this;
            long r0 = r2.Q
            long r0 = -r0
            luaj.LuaLong r0 = I2(r0)
            return r0
    }

    @Override // luaj.LuaValue
    public java.lang.String B0() {
            r2 = this;
            long r0 = r2.Q
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue B2() {
            r1 = this;
            luaj.LuaString r0 = r1.T2()
            return r0
    }

    @Override // luaj.LuaValue
    public long C0() {
            r2 = this;
            long r0 = r2.Q
            return r0
    }

    @Override // luaj.LuaValue
    public double F1(double r1) {
            r0 = this;
            long r1 = r0.Q
            double r1 = (double) r1
            return r1
    }

    @Override // luaj.LuaValue
    public luaj.LuaString G0() {
            r2 = this;
            long r0 = r2.Q
            java.lang.String r0 = java.lang.String.valueOf(r0)
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            return r0
    }

    @Override // luaj.LuaValue
    public int H1(int r3) {
            r2 = this;
            long r0 = r2.Q
            int r3 = (int) r0
            return r3
    }

    @Override // luaj.LuaValue
    public java.lang.String I1(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.U2()
            return r1
    }

    @Override // luaj.LuaValue
    public long J1(long r1) {
            r0 = this;
            long r1 = r0.Q
            return r1
    }

    @Override // luaj.LuaValue
    public luaj.LuaString K1(luaj.LuaString r1) {
            r0 = this;
            luaj.LuaString r1 = r0.T2()
            return r1
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue O0(luaj.LuaValue r6) {
            r5 = this;
            boolean r0 = r6.m1()
            if (r0 != 0) goto Lb
            luaj.LuaValue r6 = super.O0(r6)
            goto L32
        Lb:
            boolean r0 = r6.k1()
            if (r0 == 0) goto L27
            long r0 = r6.z2()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L27
            long r0 = r5.Q
            long r2 = r6.z2()
            long r0 = r0 / r2
            luaj.LuaLong r6 = I2(r0)
            goto L32
        L27:
            long r0 = r5.Q
            double r0 = (double) r0
            double r2 = r6.x2()
            luaj.LuaValue r6 = luaj.LuaDouble.S2(r0, r2)
        L32:
            return r6
    }

    @Override // luaj.LuaValue
    public boolean P0(luaj.LuaValue r8) {
            r7 = this;
            boolean r0 = r8.m1()
            if (r0 != 0) goto Lb
            boolean r8 = super.P0(r8)
            goto L2b
        Lb:
            boolean r0 = r8.k1()
            r1 = 0
            r2 = 1
            long r3 = r7.Q
            if (r0 == 0) goto L21
            long r5 = r8.z2()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L1f
        L1d:
            r8 = 1
            goto L2b
        L1f:
            r8 = 0
            goto L2b
        L21:
            double r3 = (double) r3
            double r5 = r8.x2()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L1f
            goto L1d
        L2b:
            return r8
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue Q1(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5.m1()
            if (r0 != 0) goto Lb
            luaj.LuaValue r5 = super.Q1(r5)
            goto L1a
        Lb:
            long r0 = r4.Q
            double r0 = (double) r0
            double r2 = r5.x2()
            double r0 = java.lang.Math.pow(r0, r2)
            luaj.LuaNumber r5 = luaj.LuaValue.J2(r0)
        L1a:
            return r5
    }

    @Override // luaj.LuaValue
    public boolean T1(luaj.LuaValue r8) {
            r7 = this;
            boolean r0 = r8.m1()
            r1 = 0
            if (r0 != 0) goto L8
            goto L25
        L8:
            boolean r0 = r8.k1()
            r2 = 1
            long r3 = r7.Q
            if (r0 == 0) goto L1b
            long r5 = r8.z2()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L25
        L19:
            r1 = 1
            goto L25
        L1b:
            double r3 = (double) r3
            double r5 = r8.x2()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L25
            goto L19
        L25:
            return r1
    }

    @Override // luaj.LuaValue
    public boolean X0(luaj.LuaValue r8) {
            r7 = this;
            boolean r0 = r8 instanceof luaj.LuaNumber
            if (r0 != 0) goto L9
            boolean r8 = super.X0(r8)
            goto L29
        L9:
            boolean r0 = r8.k1()
            r1 = 0
            r2 = 1
            long r3 = r7.Q
            if (r0 == 0) goto L1f
            long r5 = r8.z2()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L1d
        L1b:
            r8 = 1
            goto L29
        L1d:
            r8 = 0
            goto L29
        L1f:
            double r3 = (double) r3
            double r5 = r8.x2()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L1d
            goto L1b
        L29:
            return r8
    }

    @Override // luaj.LuaValue
    public boolean Y0(luaj.LuaValue r8) {
            r7 = this;
            boolean r0 = r8 instanceof luaj.LuaNumber
            if (r0 != 0) goto L9
            boolean r8 = super.Y0(r8)
            goto L29
        L9:
            boolean r0 = r8.k1()
            r1 = 0
            r2 = 1
            long r3 = r7.Q
            if (r0 == 0) goto L1f
            long r5 = r8.z2()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L1d
        L1b:
            r8 = 1
            goto L29
        L1d:
            r8 = 0
            goto L29
        L1f:
            double r3 = (double) r3
            double r5 = r8.x2()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L1d
            goto L1b
        L29:
            return r8
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue Z0(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5.m1()
            if (r0 != 0) goto Lb
            luaj.LuaValue r5 = super.Z0(r5)
            goto L2b
        Lb:
            boolean r0 = r5.j1()
            if (r0 == 0) goto L20
            long r0 = r4.Q
            long r2 = r5.z2()
            long r0 = S2(r0, r2)
            luaj.LuaLong r5 = I2(r0)
            goto L2b
        L20:
            long r0 = r4.Q
            double r0 = (double) r0
            double r2 = r5.x2()
            luaj.LuaValue r5 = luaj.LuaDouble.T2(r0, r2)
        L2b:
            return r5
    }

    @Override // luaj.LuaValue
    public boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof luaj.LuaLong
            r1 = 0
            if (r0 == 0) goto L10
            luaj.LuaLong r7 = (luaj.LuaLong) r7
            long r2 = r7.Q
            long r4 = r6.Q
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L10
            r1 = 1
        L10:
            return r1
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public java.lang.String g0() {
            r1 = this;
            java.lang.String r0 = r1.U2()
            return r0
    }

    @Override // luaj.LuaValue
    public boolean h1() {
            r1 = this;
            r0 = 1
            return r0
    }

    public int hashCode() {
            r2 = this;
            long r0 = r2.Q
            int r0 = V2(r0)
            return r0
    }

    @Override // luaj.LuaValue
    public boolean i1() {
            r5 = this;
            long r0 = r5.Q
            int r2 = (int) r0
            long r2 = (long) r2
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
            goto L29
        Lb:
            boolean r0 = r5.k1()
            if (r0 == 0) goto L1d
            long r0 = r4.Q
            long r2 = r5.z2()
            long r0 = r0 + r2
            luaj.LuaLong r5 = I2(r0)
            goto L29
        L1d:
            long r0 = r4.Q
            double r0 = (double) r0
            double r2 = r5.x2()
            double r0 = r0 + r2
            luaj.LuaNumber r5 = luaj.LuaValue.J2(r0)
        L29:
            return r5
    }

    @Override // luaj.LuaValue
    public boolean j1() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // luaj.LuaValue
    public boolean k1() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue m2(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5.k1()
            if (r0 != 0) goto Lb
            luaj.LuaValue r5 = super.m2(r5)
            goto L15
        Lb:
            long r0 = r4.Q
            long r2 = r5.z2()
            luaj.LuaValue r5 = X2(r0, r2)
        L15:
            return r5
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue n2(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5.k1()
            if (r0 != 0) goto Lb
            luaj.LuaValue r5 = super.n2(r5)
            goto L15
        Lb:
            long r0 = r4.Q
            long r2 = r5.z2()
            luaj.LuaValue r5 = Y2(r0, r2)
        L15:
            return r5
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue o0(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5.k1()
            if (r0 != 0) goto Lb
            luaj.LuaValue r5 = super.o0(r5)
            goto L16
        Lb:
            long r0 = r4.Q
            long r2 = r5.z2()
            long r0 = r0 & r2
            luaj.LuaLong r5 = I2(r0)
        L16:
            return r5
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue q0() {
            r2 = this;
            long r0 = r2.Q
            long r0 = ~r0
            luaj.LuaLong r0 = I2(r0)
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaString q2() {
            r1 = this;
            luaj.LuaString r0 = r1.T2()
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue r0(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5.k1()
            if (r0 != 0) goto Lb
            luaj.LuaValue r5 = super.r0(r5)
            goto L16
        Lb:
            long r0 = r4.Q
            long r2 = r5.z2()
            long r0 = r0 | r2
            luaj.LuaLong r5 = I2(r0)
        L16:
            return r5
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue r2(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5.m1()
            if (r0 != 0) goto Lb
            luaj.LuaValue r5 = super.r2(r5)
            goto L29
        Lb:
            boolean r0 = r5.k1()
            if (r0 == 0) goto L1d
            long r0 = r4.Q
            long r2 = r5.z2()
            long r0 = r0 - r2
            luaj.LuaLong r5 = I2(r0)
            goto L29
        L1d:
            long r0 = r4.Q
            double r0 = (double) r0
            double r2 = r5.x2()
            double r0 = r0 - r2
            luaj.LuaNumber r5 = luaj.LuaValue.J2(r0)
        L29:
            return r5
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue t0(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5.k1()
            if (r0 != 0) goto Lb
            luaj.LuaValue r5 = super.t0(r5)
            goto L16
        Lb:
            long r0 = r4.Q
            long r2 = r5.z2()
            long r0 = r0 ^ r2
            luaj.LuaLong r5 = I2(r0)
        L16:
            return r5
    }

    @Override // luaj.LuaValue
    public boolean u1(luaj.LuaValue r8) {
            r7 = this;
            boolean r0 = r8 instanceof luaj.LuaNumber
            if (r0 != 0) goto L9
            boolean r8 = super.u1(r8)
            goto L29
        L9:
            boolean r0 = r8.k1()
            r1 = 0
            r2 = 1
            long r3 = r7.Q
            if (r0 == 0) goto L1f
            long r5 = r8.z2()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 >= 0) goto L1d
        L1b:
            r8 = 1
            goto L29
        L1d:
            r8 = 0
            goto L29
        L1f:
            double r3 = (double) r3
            double r5 = r8.x2()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 >= 0) goto L1d
            goto L1b
        L29:
            return r8
    }

    @Override // luaj.LuaValue
    public boolean v1(luaj.LuaValue r8) {
            r7 = this;
            boolean r0 = r8 instanceof luaj.LuaNumber
            if (r0 != 0) goto L9
            boolean r8 = super.v1(r8)
            goto L29
        L9:
            boolean r0 = r8.k1()
            r1 = 0
            r2 = 1
            long r3 = r7.Q
            if (r0 == 0) goto L1f
            long r5 = r8.z2()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L1d
        L1b:
            r8 = 1
            goto L29
        L1d:
            r8 = 0
            goto L29
        L1f:
            double r3 = (double) r3
            double r5 = r8.x2()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L1d
            goto L1b
        L29:
            return r8
    }

    @Override // luaj.LuaValue
    public double x0() {
            r2 = this;
            long r0 = r2.Q
            double r0 = (double) r0
            return r0
    }

    @Override // luaj.LuaValue
    public double x2() {
            r2 = this;
            long r0 = r2.Q
            double r0 = (double) r0
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue y1(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5.m1()
            if (r0 != 0) goto Lb
            luaj.LuaValue r5 = super.y1(r5)
            goto L2b
        Lb:
            boolean r0 = r5.j1()
            if (r0 == 0) goto L20
            long r0 = r4.Q
            long r2 = r5.z2()
            long r0 = W2(r0, r2)
            luaj.LuaLong r5 = I2(r0)
            goto L2b
        L20:
            long r0 = r4.Q
            double r0 = (double) r0
            double r2 = r5.x2()
            luaj.LuaValue r5 = luaj.LuaDouble.U2(r0, r2)
        L2b:
            return r5
    }

    @Override // luaj.LuaValue
    public int y2() {
            r2 = this;
            long r0 = r2.Q
            int r1 = (int) r0
            return r1
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue z1(luaj.LuaValue r5) {
            r4 = this;
            boolean r0 = r5.m1()
            if (r0 != 0) goto Lb
            luaj.LuaValue r5 = super.z1(r5)
            goto L2b
        Lb:
            boolean r0 = r5.k1()
            if (r0 == 0) goto L1e
            long r0 = r4.Q
            long r2 = r5.z2()
            long r0 = r0 * r2
            luaj.LuaLong r5 = I2(r0)
            goto L2b
        L1e:
            long r0 = r4.Q
            double r0 = (double) r0
            double r2 = r5.x2()
            double r0 = r0 * r2
            luaj.LuaNumber r5 = luaj.LuaValue.J2(r0)
        L2b:
            return r5
    }

    @Override // luaj.LuaValue
    public long z2() {
            r2 = this;
            long r0 = r2.Q
            return r0
    }
}
