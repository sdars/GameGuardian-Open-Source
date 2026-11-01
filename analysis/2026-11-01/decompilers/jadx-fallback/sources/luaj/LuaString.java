package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class LuaString extends luaj.LuaValue {
    public static luaj.LuaValue U;
    private static final boolean[] V = null;
    public final byte[] P;
    public final int Q;
    public final int R;
    public final int S;
    private luaj.LuaValue T;

    private static class DeprecatedLuaString extends luaj.LuaString {
        public DeprecatedLuaString(byte[] r2, int r3, int r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r4, r0)
                return
        }

        @Override // luaj.LuaValue
        public boolean d1() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    static /* synthetic */ class a {
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final luaj.LuaString[] f1645a = null;

        static {
                r0 = 128(0x80, float:1.8E-43)
                luaj.LuaString[] r0 = new luaj.LuaString[r0]
                luaj.LuaString.b.f1645a = r0
                return
        }
    }

    static {
            r0 = 128(0x80, float:1.8E-43)
            boolean[] r0 = new boolean[r0]
            luaj.LuaString.V = r0
            r0 = 48
        L8:
            r1 = 57
            r2 = 1
            if (r0 > r1) goto L15
            boolean[] r1 = luaj.LuaString.V
            r1[r0] = r2
            int r0 = r0 + 1
            byte r0 = (byte) r0
            goto L8
        L15:
            r0 = 65
        L17:
            r1 = 70
            if (r0 > r1) goto L23
            boolean[] r1 = luaj.LuaString.V
            r1[r0] = r2
            int r0 = r0 + 1
            byte r0 = (byte) r0
            goto L17
        L23:
            r0 = 97
        L25:
            r1 = 102(0x66, float:1.43E-43)
            if (r0 > r1) goto L31
            boolean[] r1 = luaj.LuaString.V
            r1[r0] = r2
            int r0 = r0 + 1
            byte r0 = (byte) r0
            goto L25
        L31:
            boolean[] r0 = luaj.LuaString.V
            r1 = 13
            r0[r1] = r2
            r1 = 10
            r0[r1] = r2
            r1 = 9
            r0[r1] = r2
            r1 = 32
            r0[r1] = r2
            r1 = 43
            r0[r1] = r2
            r1 = 45
            r0[r1] = r2
            r1 = 46
            r0[r1] = r2
            r1 = 80
            r0[r1] = r2
            r1 = 112(0x70, float:1.57E-43)
            r0[r1] = r2
            r1 = 88
            r0[r1] = r2
            r1 = 120(0x78, float:1.68E-43)
            r0[r1] = r2
            return
    }

    private LuaString(byte[] r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.T = r0
            r1.P = r2
            r1.Q = r3
            r1.R = r4
            int r2 = b3(r2, r3, r4)
            r1.S = r2
            return
    }

    /* synthetic */ LuaString(byte[] r1, int r2, int r3, luaj.LuaString.a r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public static luaj.LuaString K2(java.lang.String r2) {
            luaj.LuaString r0 = Z2(r2)
            if (r0 == 0) goto L7
            return r0
        L7:
            byte[] r2 = r2.getBytes()
            int r0 = r2.length
            r1 = 0
            luaj.LuaString r2 = p3(r2, r1, r0)
            return r2
    }

    public static luaj.LuaString L2(byte[] r5, int r6, int r7) {
            luaj.LuaString r0 = a3(r5, r6, r7)
            if (r0 == 0) goto L7
            return r0
        L7:
            r0 = 32
            if (r7 <= r0) goto L10
            luaj.LuaString r5 = m3(r5, r6, r7)
            return r5
        L10:
            int r0 = b3(r5, r6, r7)
            r1 = r0 & 127(0x7f, float:1.78E-43)
            luaj.LuaString[] r2 = luaj.LuaString.b.f1645a
            r3 = r2[r1]
            if (r3 == 0) goto L27
            int r4 = r3.S
            if (r4 != r0) goto L27
            boolean r0 = r3.S2(r5, r6, r7)
            if (r0 == 0) goto L27
            return r3
        L27:
            luaj.LuaString r5 = m3(r5, r6, r7)
            r2[r1] = r5
            return r5
    }

    private boolean S2(byte[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.R
            if (r0 != r5) goto L10
            byte[] r0 = r2.P
            int r1 = r2.Q
            boolean r3 = X2(r0, r1, r3, r4, r5)
            if (r3 == 0) goto L10
            r3 = 1
            goto L11
        L10:
            r3 = 0
        L11:
            return r3
    }

    public static java.lang.String V2(byte[] r1, int r2, int r3) {
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static boolean W2(luaj.LuaString r1, int r2, luaj.LuaString r3, int r4, int r5) {
            byte[] r0 = r1.P
            int r1 = r1.Q
            int r1 = r1 + r2
            byte[] r2 = r3.P
            int r3 = r3.Q
            int r3 = r3 + r4
            boolean r1 = X2(r0, r1, r2, r3, r5)
            return r1
    }

    public static boolean X2(byte[] r3, int r4, byte[] r5, int r6, int r7) {
            int r0 = r3.length
            int r1 = r4 + r7
            r2 = 0
            if (r0 < r1) goto L20
            int r0 = r5.length
            int r1 = r6 + r7
            if (r0 >= r1) goto Lc
            goto L20
        Lc:
            int r7 = r7 + (-1)
            if (r7 < 0) goto L1e
            int r0 = r4 + 1
            r4 = r3[r4]
            int r1 = r6 + 1
            r6 = r5[r6]
            if (r4 == r6) goto L1b
            return r2
        L1b:
            r4 = r0
            r6 = r1
            goto Lc
        L1e:
            r3 = 1
            return r3
        L20:
            return r2
    }

    private luaj.LuaValue Y2() {
            r1 = this;
            luaj.LuaValue r0 = r1.T
            if (r0 != 0) goto La
            luaj.LuaValue r0 = r1.A2()
            r1.T = r0
        La:
            return r0
    }

    private static luaj.LuaString Z2(java.lang.String r2) {
            int r0 = r2.length()
            if (r0 != 0) goto L9
            luaj.LuaString r2 = luaj.LuaValue.L
            return r2
        L9:
            r1 = 1
            if (r0 != r1) goto L1f
            r0 = 0
            char r2 = r2.charAt(r0)
            r0 = 48
            if (r2 != r0) goto L18
            luaj.LuaString r2 = luaj.LuaValue.M
            return r2
        L18:
            r0 = 49
            if (r2 != r0) goto L1f
            luaj.LuaString r2 = luaj.LuaValue.N
            return r2
        L1f:
            r2 = 0
            return r2
    }

    private static luaj.LuaString a3(byte[] r1, int r2, int r3) {
            if (r3 != 0) goto L5
            luaj.LuaString r1 = luaj.LuaValue.L
            return r1
        L5:
            r0 = 1
            if (r3 != r0) goto L18
            r1 = r1[r2]
            r2 = 48
            if (r1 != r2) goto L11
            luaj.LuaString r1 = luaj.LuaValue.M
            return r1
        L11:
            r2 = 49
            if (r1 != r2) goto L18
            luaj.LuaString r1 = luaj.LuaValue.N
            return r1
        L18:
            r1 = 0
            return r1
    }

    public static int b3(byte[] r4, int r5, int r6) {
            int r0 = r6 >> 5
            int r0 = r0 + 1
            r1 = r6
        L5:
            if (r6 < r0) goto L18
            int r2 = r1 << 5
            int r3 = r1 >> 2
            int r2 = r2 + r3
            int r3 = r5 + r6
            int r3 = r3 + (-1)
            r3 = r4[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r3
            r1 = r1 ^ r2
            int r6 = r6 - r0
            goto L5
        L18:
            int r4 = r1 >>> 6
            int r5 = r1 << 26
            r4 = r4 | r5
            return r4
    }

    static luaj.LuaString i3(java.lang.String r3) {
            byte[] r3 = r3.getBytes()
            luaj.LuaString r0 = new luaj.LuaString
            int r1 = r3.length
            r2 = 0
            r0.<init>(r3, r2, r1)
            return r0
    }

    private static luaj.LuaString m3(byte[] r2, int r3, int r4) {
            byte[] r0 = new byte[r4]
            r1 = 0
            java.lang.System.arraycopy(r2, r3, r0, r1, r4)
            luaj.LuaString r2 = new luaj.LuaString
            r2.<init>(r0, r1, r4)
            return r2
    }

    public static luaj.LuaString n3(char[] r4, int r5, int r6) {
            byte[] r0 = new byte[r6]
            r1 = 0
            r2 = 0
        L4:
            if (r2 >= r6) goto L10
            int r3 = r2 + r5
            char r3 = r4[r3]
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r2 + 1
            goto L4
        L10:
            luaj.LuaString r4 = p3(r0, r1, r6)
            return r4
    }

    public static luaj.LuaString o3(byte[] r2) {
            int r0 = r2.length
            r1 = 0
            luaj.LuaString r2 = p3(r2, r1, r0)
            return r2
    }

    public static luaj.LuaString p3(byte[] r5, int r6, int r7) {
            luaj.LuaString r0 = a3(r5, r6, r7)
            if (r0 == 0) goto L7
            return r0
        L7:
            int r0 = r5.length
            r1 = 32
            if (r0 <= r1) goto L12
            luaj.LuaString r0 = new luaj.LuaString
            r0.<init>(r5, r6, r7)
            return r0
        L12:
            int r0 = b3(r5, r6, r7)
            r1 = r0 & 127(0x7f, float:1.78E-43)
            luaj.LuaString[] r2 = luaj.LuaString.b.f1645a
            r3 = r2[r1]
            if (r3 == 0) goto L29
            int r4 = r3.S
            if (r4 != r0) goto L29
            boolean r0 = r3.S2(r5, r6, r7)
            if (r0 == 0) goto L29
            return r3
        L29:
            luaj.LuaString r0 = new luaj.LuaString
            r0.<init>(r5, r6, r7)
            r2[r1] = r0
            return r0
    }

    @Override // luaj.LuaValue
    public int A0() {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            boolean r1 = r0.l1()
            if (r1 == 0) goto Lf
            int r0 = super.A0()
            goto L13
        Lf:
            int r0 = r0.A0()
        L13:
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue A1() {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            boolean r1 = r0.l1()
            if (r1 == 0) goto Lf
            luaj.LuaValue r0 = super.A1()
            goto L13
        Lf:
            luaj.LuaValue r0 = r0.A1()
        L13:
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue A2() {
            r7 = this;
            byte[] r0 = r7.P
            int r1 = r7.Q
            int r2 = r7.R
            boolean[] r3 = luaj.LuaString.V
            r4 = 0
        L9:
            if (r4 >= r2) goto L1e
            int r5 = r1 + r4
            r5 = r0[r5]
            r6 = 9
            if (r5 < r6) goto L1b
            boolean r5 = r3[r5]
            if (r5 != 0) goto L18
            goto L1b
        L18:
            int r4 = r4 + 1
            goto L9
        L1b:
            luaj.LuaValue r0 = luaj.LuaValue.f1671c
            return r0
        L1e:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            luaj.LuaValue r0 = luaj.LuaValue.f1671c     // Catch: java.lang.Throwable -> L2a
            luaj.LuaValue r0 = luaj.LuaValue.P1(r3, r0)     // Catch: java.lang.Throwable -> L2a
            return r0
        L2a:
            luaj.LuaValue r0 = luaj.LuaValue.f1671c
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
            r0 = this;
            return r0
    }

    @Override // luaj.LuaValue
    public long C0() {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            boolean r1 = r0.l1()
            if (r1 == 0) goto Lf
            long r0 = super.C0()
            goto L13
        Lf:
            long r0 = r0.C0()
        L13:
            return r0
    }

    @Override // luaj.LuaValue
    public int C2() {
            r1 = this;
            r0 = 4
            return r0
    }

    @Override // luaj.LuaValue
    public java.lang.String D2() {
            r1 = this;
            java.lang.String r0 = "string"
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaNumber E0() {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            boolean r1 = r0.l1()
            if (r1 == 0) goto Lf
            luaj.LuaNumber r0 = super.E0()
            goto L13
        Lf:
            luaj.LuaNumber r0 = r0.E0()
        L13:
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaNumber F0(java.lang.String r3) {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            boolean r1 = r0.l1()
            if (r1 == 0) goto Lf
            luaj.LuaNumber r3 = super.F0(r3)
            goto L13
        Lf:
            luaj.LuaNumber r3 = r0.F0(r3)
        L13:
            return r3
    }

    @Override // luaj.LuaValue
    public double F1(double r1) {
            r0 = this;
            double r1 = r0.x0()
            return r1
    }

    @Override // luaj.LuaValue
    public luaj.LuaString G0() {
            r0 = this;
            return r0
    }

    @Override // luaj.LuaValue
    public int H1(int r1) {
            r0 = this;
            int r1 = r0.A0()
            return r1
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
            long r1 = r0.C0()
            return r1
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue K0(luaj.LuaValue r1) {
            r0 = this;
            luaj.LuaValue r1 = r1.M0(r0)
            return r1
    }

    @Override // luaj.LuaValue
    public luaj.LuaString K1(luaj.LuaString r1) {
            r0 = this;
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue L0(luaj.LuaNumber r1) {
            r0 = this;
            luaj.LuaString r1 = r1.q2()
            luaj.LuaValue r1 = r0.M0(r1)
            return r1
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue M0(luaj.LuaString r7) {
            r6 = this;
            int r0 = r7.R
            int r1 = r6.R
            int r1 = r1 + r0
            byte[] r2 = new byte[r1]
            byte[] r3 = r7.P
            int r4 = r7.Q
            r5 = 0
            java.lang.System.arraycopy(r3, r4, r2, r5, r0)
            byte[] r0 = r6.P
            int r3 = r6.Q
            int r7 = r7.R
            int r4 = r6.R
            java.lang.System.arraycopy(r0, r3, r2, r7, r4)
            luaj.LuaString r7 = p3(r2, r5, r1)
            return r7
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue O0(luaj.LuaValue r3) {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            boolean r1 = r0.l1()
            if (r1 == 0) goto Lf
            luaj.LuaValue r3 = super.O0(r3)
            goto L13
        Lf:
            luaj.LuaValue r3 = r0.O0(r3)
        L13:
            return r3
    }

    @Override // luaj.LuaValue
    public boolean P0(luaj.LuaValue r1) {
            r0 = this;
            boolean r1 = r1.S1(r0)
            return r1
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue Q1(luaj.LuaValue r3) {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            boolean r1 = r0.l1()
            if (r1 == 0) goto Lf
            luaj.LuaValue r3 = super.Q1(r3)
            goto L13
        Lf:
            luaj.LuaValue r3 = r0.Q1(r3)
        L13:
            return r3
    }

    @Override // luaj.LuaValue
    public boolean S1(luaj.LuaString r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            int r1 = r7.R
            int r2 = r6.R
            r3 = 0
            if (r1 == r2) goto Lc
            return r3
        Lc:
            byte[] r1 = r7.P
            byte[] r2 = r6.P
            if (r1 != r2) goto L19
            int r1 = r7.Q
            int r2 = r6.Q
            if (r1 != r2) goto L19
            return r0
        L19:
            int r1 = r7.hashCode()
            int r2 = r6.hashCode()
            if (r1 == r2) goto L24
            return r3
        L24:
            r1 = 0
        L25:
            int r2 = r6.R
            if (r1 >= r2) goto L3d
            byte[] r2 = r7.P
            int r4 = r7.Q
            int r4 = r4 + r1
            r2 = r2[r4]
            byte[] r4 = r6.P
            int r5 = r6.Q
            int r5 = r5 + r1
            r4 = r4[r5]
            if (r2 == r4) goto L3a
            return r3
        L3a:
            int r1 = r1 + 1
            goto L25
        L3d:
            return r0
    }

    @Override // luaj.LuaValue
    public boolean T1(luaj.LuaValue r1) {
            r0 = this;
            boolean r1 = r1.S1(r0)
            return r1
    }

    public int T2(int r2) {
            r1 = this;
            if (r2 < 0) goto Lb
            int r0 = r1.R
            if (r2 >= r0) goto Lb
            int r2 = r1.g3(r2)
            return r2
        Lb:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    public void U2(int r3, byte[] r4, int r5, int r6) {
            r2 = this;
            byte[] r0 = r2.P
            int r1 = r2.Q
            int r1 = r1 + r3
            java.lang.System.arraycopy(r0, r1, r4, r5, r6)
            return
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue V0() {
            r1 = this;
            luaj.LuaValue r0 = luaj.LuaString.U
            return r0
    }

    @Override // luaj.LuaValue
    public int W1() {
            r1 = this;
            int r0 = r1.R
            return r0
    }

    @Override // luaj.LuaValue
    public boolean X0(luaj.LuaValue r2) {
            r1 = this;
            boolean r0 = r2.n1()
            if (r0 == 0) goto L10
            int r2 = r2.o2(r1)
            if (r2 >= 0) goto Le
            r2 = 1
            goto L14
        Le:
            r2 = 0
            goto L14
        L10:
            boolean r2 = super.X0(r2)
        L14:
            return r2
    }

    @Override // luaj.LuaValue
    public boolean Y0(luaj.LuaValue r2) {
            r1 = this;
            boolean r0 = r2.n1()
            if (r0 == 0) goto L10
            int r2 = r2.o2(r1)
            if (r2 > 0) goto Le
            r2 = 1
            goto L14
        Le:
            r2 = 0
            goto L14
        L10:
            boolean r2 = super.Y0(r2)
        L14:
            return r2
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue Z0(luaj.LuaValue r3) {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            boolean r1 = r0.l1()
            if (r1 == 0) goto Lf
            luaj.LuaValue r3 = super.Z0(r3)
            goto L13
        Lf:
            luaj.LuaValue r3 = r0.Z0(r3)
        L13:
            return r3
    }

    public int c3(byte r3, int r4) {
            r2 = this;
        L0:
            int r0 = r2.R
            if (r4 >= r0) goto L11
            byte[] r0 = r2.P
            int r1 = r2.Q
            int r1 = r1 + r4
            r0 = r0[r1]
            if (r0 != r3) goto Le
            return r4
        Le:
            int r4 = r4 + 1
            goto L0
        L11:
            r3 = -1
            return r3
    }

    public int d3(luaj.LuaString r7, int r8) {
            r6 = this;
            int r0 = r7.s1()
            int r1 = r6.R
            int r1 = r1 - r0
        L7:
            if (r8 > r1) goto L1c
            byte[] r2 = r6.P
            int r3 = r6.Q
            int r3 = r3 + r8
            byte[] r4 = r7.P
            int r5 = r7.Q
            boolean r2 = X2(r2, r3, r4, r5, r0)
            if (r2 == 0) goto L19
            return r8
        L19:
            int r8 = r8 + 1
            goto L7
        L1c:
            r7 = -1
            return r7
    }

    public int e3(luaj.LuaString r7) {
            r6 = this;
            int r0 = r6.Q
            int r1 = r6.R
            int r1 = r1 + r0
            int r2 = r7.Q
            int r3 = r7.R
            int r2 = r2 + r3
        La:
            if (r0 >= r1) goto L24
            int r3 = r7.Q
        Le:
            if (r3 >= r2) goto L21
            byte[] r4 = r6.P
            r4 = r4[r0]
            byte[] r5 = r7.P
            r5 = r5[r3]
            if (r4 != r5) goto L1e
            int r7 = r6.Q
            int r0 = r0 - r7
            return r0
        L1e:
            int r3 = r3 + 1
            goto Le
        L21:
            int r0 = r0 + 1
            goto La
        L24:
            r7 = -1
            return r7
    }

    @Override // luaj.LuaValue
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof luaj.LuaString
            if (r0 == 0) goto Lb
            luaj.LuaString r2 = (luaj.LuaString) r2
            boolean r2 = r1.S1(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public boolean f3() {
            r8 = this;
            byte[] r0 = r8.P
            int r1 = r8.Q
            int r2 = r8.R
            int r2 = r2 + r1
        L7:
            if (r1 >= r2) goto L5e
            int r3 = r1 + 1
            r4 = r0[r1]
            if (r4 < 0) goto L11
        Lf:
            r1 = r3
            goto L7
        L11:
            r5 = r4 & 224(0xe0, float:3.14E-43)
            r6 = 128(0x80, float:1.8E-43)
            r7 = 192(0xc0, float:2.69E-43)
            if (r5 != r7) goto L24
            if (r3 >= r2) goto L24
            int r1 = r1 + 2
            r3 = r0[r3]
            r3 = r3 & r7
            if (r3 != r6) goto L23
            goto L7
        L23:
            r3 = r1
        L24:
            r1 = r4 & 240(0xf0, float:3.36E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r1 != r5) goto L3c
            int r1 = r3 + 1
            if (r1 >= r2) goto L3c
            r5 = r0[r3]
            r5 = r5 & r7
            if (r5 != r6) goto L3b
            int r3 = r3 + 2
            r1 = r0[r1]
            r1 = r1 & r7
            if (r1 != r6) goto L3c
            goto Lf
        L3b:
            r3 = r1
        L3c:
            r1 = r4 & 248(0xf8, float:3.48E-43)
            r4 = 240(0xf0, float:3.36E-43)
            if (r1 != r4) goto L5c
            int r1 = r3 + 2
            if (r1 >= r2) goto L5c
            int r1 = r3 + 1
            r4 = r0[r3]
            r4 = r4 & r7
            if (r4 != r6) goto L5c
            int r4 = r3 + 2
            r1 = r0[r1]
            r1 = r1 & r7
            if (r1 != r6) goto L5c
            int r1 = r3 + 3
            r3 = r0[r4]
            r3 = r3 & r7
            if (r3 != r6) goto L5c
            goto L7
        L5c:
            r0 = 0
            return r0
        L5e:
            r0 = 1
            return r0
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public java.lang.String g0() {
            r3 = this;
            byte[] r0 = r3.P
            int r1 = r3.Q
            int r2 = r3.R
            java.lang.String r0 = V2(r0, r1, r2)
            return r0
    }

    public int g3(int r3) {
            r2 = this;
            byte[] r0 = r2.P
            int r1 = r2.Q
            int r1 = r1 + r3
            r3 = r0[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            return r3
    }

    @Override // luaj.LuaValue
    public boolean h1() {
            r1 = this;
            luaj.LuaValue r0 = r1.Y2()
            boolean r0 = r0.h1()
            return r0
    }

    public luaj.LuaString h3() {
            r4 = this;
            luaj.LuaString$DeprecatedLuaString r0 = new luaj.LuaString$DeprecatedLuaString
            byte[] r1 = r4.P
            int r2 = r4.Q
            int r3 = r4.R
            r0.<init>(r1, r2, r3)
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.S
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue j0(luaj.LuaValue r3) {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            boolean r1 = r0.l1()
            if (r1 == 0) goto Lf
            luaj.LuaValue r3 = super.j0(r3)
            goto L13
        Lf:
            luaj.LuaValue r3 = r0.j0(r3)
        L13:
            return r3
    }

    @Override // luaj.LuaValue
    public boolean j1() {
            r1 = this;
            luaj.LuaValue r0 = r1.Y2()
            boolean r0 = r0.j1()
            return r0
    }

    public luaj.LuaString j3(int r2, int r3) {
            r1 = this;
            int r0 = r1.Q
            int r0 = r0 + r2
            int r3 = r3 - r2
            int r2 = r1.R
            int r2 = r2 / 2
            if (r3 < r2) goto L11
            byte[] r2 = r1.P
            luaj.LuaString r2 = p3(r2, r0, r3)
            goto L17
        L11:
            byte[] r2 = r1.P
            luaj.LuaString r2 = L2(r2, r0, r3)
        L17:
            return r2
    }

    @Override // luaj.LuaValue
    public boolean k1() {
            r1 = this;
            luaj.LuaValue r0 = r1.Y2()
            boolean r0 = r0.k1()
            return r0
    }

    public java.io.InputStream k3() {
            r4 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[] r1 = r4.P
            int r2 = r4.Q
            int r3 = r4.R
            r0.<init>(r1, r2, r3)
            return r0
    }

    public luaj.LuaValue l3(int r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            byte[] r2 = r0.P
            int r3 = r0.Q
            int r4 = r0.R
            int r4 = r4 + r3
        Lb:
            r5 = 32
            if (r3 >= r4) goto L18
            r6 = r2[r3]
            if (r6 > r5) goto L18
            if (r6 <= 0) goto L18
            int r3 = r3 + 1
            goto Lb
        L18:
            if (r3 >= r4) goto L25
            int r6 = r4 + (-1)
            r6 = r2[r6]
            if (r6 > r5) goto L25
            if (r6 <= 0) goto L25
            int r4 = r4 + (-1)
            goto L18
        L25:
            if (r3 != r4) goto L2a
            luaj.LuaValue r1 = luaj.LuaValue.f1671c
            return r1
        L2a:
            r5 = r2[r3]
            r6 = 45
            if (r5 == r6) goto L34
            r7 = 43
            if (r5 != r7) goto L36
        L34:
            int r3 = r3 + 1
        L36:
            if (r3 != r4) goto L3b
            luaj.LuaValue r1 = luaj.LuaValue.f1671c
            return r1
        L3b:
            long r7 = (long) r1
            r9 = -9223372036854775808
            long r9 = r9 / r7
            r13 = 0
        L41:
            if (r3 >= r4) goto L85
            int r15 = r3 + 1
            r3 = r2[r3]
            r11 = 10
            r12 = 48
            if (r1 <= r11) goto L61
            if (r3 < r12) goto L54
            r11 = 57
            if (r3 > r11) goto L54
            goto L61
        L54:
            r11 = 65
            if (r3 < r11) goto L5f
            r11 = 90
            if (r3 > r11) goto L5f
            r12 = 55
            goto L61
        L5f:
            r12 = 87
        L61:
            int r3 = r3 - r12
            if (r3 < 0) goto L82
            if (r3 < r1) goto L67
            goto L82
        L67:
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 <= 0) goto L6e
            luaj.LuaValue r1 = luaj.LuaValue.f1671c
            return r1
        L6e:
            long r11 = r13 * r7
            r16 = r7
            long r6 = (long) r3
            long r11 = r11 - r6
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 <= 0) goto L7b
            luaj.LuaValue r1 = luaj.LuaValue.f1671c
            return r1
        L7b:
            r13 = r11
            r3 = r15
            r7 = r16
            r6 = 45
            goto L41
        L82:
            luaj.LuaValue r1 = luaj.LuaValue.f1671c
            return r1
        L85:
            r1 = 45
            if (r5 == r1) goto L93
            long r13 = -r13
            r1 = 0
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 >= 0) goto L93
            luaj.LuaValue r1 = luaj.LuaValue.f1671c
            return r1
        L93:
            luaj.LuaLong r1 = luaj.LuaLong.I2(r13)
            return r1
    }

    @Override // luaj.LuaValue
    public boolean m1() {
            r1 = this;
            luaj.LuaValue r0 = r1.Y2()
            boolean r0 = r0.m1()
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue m2(luaj.LuaValue r3) {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            boolean r1 = r0.l1()
            if (r1 == 0) goto Lf
            luaj.LuaValue r3 = super.m2(r3)
            goto L13
        Lf:
            luaj.LuaValue r3 = r0.m2(r3)
        L13:
            return r3
    }

    @Override // luaj.LuaValue
    public boolean n1() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue n2(luaj.LuaValue r3) {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            boolean r1 = r0.l1()
            if (r1 == 0) goto Lf
            luaj.LuaValue r3 = super.n2(r3)
            goto L13
        Lf:
            luaj.LuaValue r3 = r0.n2(r3)
        L13:
            return r3
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue o0(luaj.LuaValue r3) {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            boolean r1 = r0.l1()
            if (r1 == 0) goto Lf
            luaj.LuaValue r3 = super.o0(r3)
            goto L13
        Lf:
            luaj.LuaValue r3 = r0.o0(r3)
        L13:
            return r3
    }

    @Override // luaj.LuaValue
    public int o2(luaj.LuaString r9) {
            r8 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r8.R
            if (r0 >= r2) goto L29
            int r3 = r9.R
            if (r1 >= r3) goto L29
            byte[] r2 = r8.P
            int r3 = r8.Q
            int r4 = r3 + r0
            r4 = r2[r4]
            byte[] r5 = r9.P
            int r6 = r9.Q
            int r7 = r6 + r1
            r7 = r5[r7]
            if (r4 == r7) goto L24
            int r3 = r3 + r0
            r9 = r2[r3]
            int r6 = r6 + r1
            r0 = r5[r6]
            int r9 = r9 - r0
            return r9
        L24:
            int r0 = r0 + 1
            int r1 = r1 + 1
            goto L2
        L29:
            int r9 = r9.R
            int r2 = r2 - r9
            return r2
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue q0() {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            boolean r1 = r0.l1()
            if (r1 == 0) goto Lf
            luaj.LuaValue r0 = super.q0()
            goto L13
        Lf:
            luaj.LuaValue r0 = r0.q0()
        L13:
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaString q2() {
            r0 = this;
            return r0
    }

    public void q3(java.io.DataOutputStream r3, int r4, int r5) {
            r2 = this;
            byte[] r0 = r2.P
            int r1 = r2.Q
            int r1 = r1 + r4
            r3.write(r0, r1, r5)
            return
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue r0(luaj.LuaValue r3) {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            boolean r1 = r0.l1()
            if (r1 == 0) goto Lf
            luaj.LuaValue r3 = super.r0(r3)
            goto L13
        Lf:
            luaj.LuaValue r3 = r0.r0(r3)
        L13:
            return r3
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue r1() {
            r2 = this;
            int r0 = r2.R
            long r0 = (long) r0
            luaj.LuaLong r0 = luaj.LuaLong.I2(r0)
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue r2(luaj.LuaValue r3) {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            boolean r1 = r0.l1()
            if (r1 == 0) goto Lf
            luaj.LuaValue r3 = super.r2(r3)
            goto L13
        Lf:
            luaj.LuaValue r3 = r0.r2(r3)
        L13:
            return r3
    }

    @Override // luaj.LuaValue
    public int s1() {
            r1 = this;
            int r0 = r1.R
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue t0(luaj.LuaValue r3) {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            boolean r1 = r0.l1()
            if (r1 == 0) goto Lf
            luaj.LuaValue r3 = super.t0(r3)
            goto L13
        Lf:
            luaj.LuaValue r3 = r0.t0(r3)
        L13:
            return r3
    }

    @Override // luaj.LuaValue
    public boolean u1(luaj.LuaValue r2) {
            r1 = this;
            boolean r0 = r2.n1()
            if (r0 == 0) goto L10
            int r2 = r2.o2(r1)
            if (r2 <= 0) goto Le
            r2 = 1
            goto L14
        Le:
            r2 = 0
            goto L14
        L10:
            boolean r2 = super.u1(r2)
        L14:
            return r2
    }

    @Override // luaj.LuaValue
    public boolean v1(luaj.LuaValue r2) {
            r1 = this;
            boolean r0 = r2.n1()
            if (r0 == 0) goto L10
            int r2 = r2.o2(r1)
            if (r2 < 0) goto Le
            r2 = 1
            goto L14
        Le:
            r2 = 0
            goto L14
        L10:
            boolean r2 = super.v1(r2)
        L14:
            return r2
    }

    @Override // luaj.LuaValue
    public double x0() {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            boolean r1 = r0.l1()
            if (r1 == 0) goto Lf
            double r0 = super.x0()
            goto L13
        Lf:
            double r0 = r0.x0()
        L13:
            return r0
    }

    @Override // luaj.LuaValue
    public double x2() {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            double r0 = r0.x2()
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue y1(luaj.LuaValue r3) {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            boolean r1 = r0.l1()
            if (r1 == 0) goto Lf
            luaj.LuaValue r3 = super.y1(r3)
            goto L13
        Lf:
            luaj.LuaValue r3 = r0.y1(r3)
        L13:
            return r3
    }

    @Override // luaj.LuaValue
    public int y2() {
            r1 = this;
            luaj.LuaValue r0 = r1.Y2()
            int r0 = r0.y2()
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue z1(luaj.LuaValue r3) {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            boolean r1 = r0.l1()
            if (r1 == 0) goto Lf
            luaj.LuaValue r3 = super.z1(r3)
            goto L13
        Lf:
            luaj.LuaValue r3 = r0.z1(r3)
        L13:
            return r3
    }

    @Override // luaj.LuaValue
    public long z2() {
            r2 = this;
            luaj.LuaValue r0 = r2.Y2()
            long r0 = r0.z2()
            return r0
    }
}
