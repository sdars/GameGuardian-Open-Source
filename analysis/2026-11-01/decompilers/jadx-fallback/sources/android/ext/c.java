package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f668d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a.e f669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a.e f670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static a.e f671g;
    private static a.e h;
    private static android.util.SparseIntArray i;
    private static int j;
    private static final int[] k = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f674c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.lang.CharSequence f676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f677c;

        public a(int r1, java.lang.CharSequence r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f675a = r1
                r0.f676b = r2
                r0.f677c = r3
                return
        }

        public java.lang.String toString() {
                r2 = this;
                int r0 = r2.f677c
                if (r0 <= 0) goto L21
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r2.f677c
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                java.lang.CharSequence r1 = r2.f676b
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                goto L27
            L21:
                java.lang.CharSequence r0 = r2.f676b
                java.lang.String r0 = r0.toString()
            L27:
                return r0
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f680c;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            r0 = 9
            long[] r0 = new long[r0]
            r0 = {x00f0: FILL_ARRAY_DATA , data: [0, 255, 65535, 16777215, 4294967295, 1099511627775, 281474976710655, 72057594037927935, -1} // fill-array
            android.ext.c.f668d = r0
            r0 = 0
            android.ext.c.f669e = r0
            android.ext.c.f670f = r0
            android.ext.c.f671g = r0
            android.ext.c.h = r0
            android.ext.c.i = r0
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            android.ext.c.j = r0
            java.lang.Object[] r0 = android.ext.t1.k()
            a.e r8 = new a.e
            r8.<init>()
            a.e r9 = new a.e
            r9.<init>()
            r3 = 1
            java.lang.String r4 = "B: %s (%,d - %,d)"
            r5 = 2131297028(0x7f090304, float:1.821199E38)
            r1 = 0
            r6 = r0[r1]
            r1 = 1
            r7 = r0[r1]
            r1 = r8
            r2 = r9
            U(r1, r2, r3, r4, r5, r6, r7)
            r3 = 2
            java.lang.String r4 = "W: %s (%,d - %,d)"
            r5 = 2131297043(0x7f090313, float:1.821202E38)
            r1 = 2
            r6 = r0[r1]
            r1 = 3
            r7 = r0[r1]
            r1 = r8
            U(r1, r2, r3, r4, r5, r6, r7)
            r3 = 4
            java.lang.String r4 = "D: %s (%,d - %,d)"
            r5 = 2131297034(0x7f09030a, float:1.8212002E38)
            r10 = 4
            r6 = r0[r10]
            r11 = 5
            r7 = r0[r11]
            U(r1, r2, r3, r4, r5, r6, r7)
            r3 = 8
            java.lang.String r4 = "X: %s (%,d - %,d)"
            r5 = 2131297045(0x7f090315, float:1.8212024E38)
            r6 = r0[r10]
            r7 = r0[r11]
            U(r1, r2, r3, r4, r5, r6, r7)
            r3 = 16
            java.lang.String r4 = "F: %s (%.1e - %.1e)"
            r5 = 2131297037(0x7f09030d, float:1.8212008E38)
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            java.lang.Float r6 = java.lang.Float.valueOf(r1)
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r7 = java.lang.Float.valueOf(r1)
            r1 = r8
            U(r1, r2, r3, r4, r5, r6, r7)
            r3 = 32
            java.lang.String r4 = "Q: %s (%,d - %,d)"
            r5 = 2131297039(0x7f09030f, float:1.8212012E38)
            r1 = 6
            r6 = r0[r1]
            r10 = 7
            r7 = r0[r10]
            r1 = r8
            U(r1, r2, r3, r4, r5, r6, r7)
            r3 = 64
            java.lang.String r4 = "E: %s (%.1e - %.1e)"
            r5 = 2131297031(0x7f090307, float:1.8211995E38)
            r0 = -4503599627370497(0xffefffffffffffff, double:-1.7976931348623157E308)
            java.lang.Double r6 = java.lang.Double.valueOf(r0)
            r0 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            java.lang.Double r7 = java.lang.Double.valueOf(r0)
            r1 = r8
            U(r1, r2, r3, r4, r5, r6, r7)
            android.ext.c.f670f = r9
            android.ext.c.f669e = r8
            updateLocale()
            a.e r0 = new a.e
            r0.<init>()
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            java.lang.String r2 = "="
            r0.append(r1, r2)
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            java.lang.String r4 = "≥"
            r0.append(r3, r4)
            r3 = 134217728(0x8000000, float:3.85186E-34)
            java.lang.String r4 = "≤"
            r0.append(r3, r4)
            r3 = 268435456(0x10000000, float:2.524355E-29)
            java.lang.String r4 = "≠"
            r0.append(r3, r4)
            android.ext.c.f671g = r0
            a.e r0 = new a.e
            r0.<init>()
            r0.append(r1, r2)
            r0.append(r3, r4)
            android.ext.c.h = r0
            java.lang.Class<android.ext.c> r0 = android.ext.c.class
            android.ext.k.h(r0)
            int[] r0 = new int[r10]
            r0 = {x0118: FILL_ARRAY_DATA , data: [8, 32, 1, 2, 64, 16, 4} // fill-array
            android.ext.c.k = r0
            return
    }

    protected c() {
            r0 = this;
            r0.<init>()
            return
    }

    public c(long r1, long r3, int r5) {
            r0 = this;
            r0.<init>()
            r0.f672a = r1
            r0.f673b = r3
            r0.f674c = r5
            return
    }

    public c(android.ext.c r7) {
            r6 = this;
            long r1 = r7.f672a
            long r3 = r7.f673b
            int r5 = r7.f674c
            r0 = r6
            r0.<init>(r1, r3, r5)
            return
    }

    public static java.lang.CharSequence A(int r2) {
            r2 = r2 & 127(0x7f, float:1.78E-43)
            java.lang.CharSequence r2 = t(r2)
            java.lang.String r2 = r2.toString()
            r0 = 0
            r1 = 1
            java.lang.String r2 = r2.substring(r0, r1)
            java.lang.String r2 = r2.intern()
            return r2
    }

    public static a.e B() {
            a.e r0 = android.ext.c.f671g
            return r0
    }

    public static a.e C() {
            a.e r0 = android.ext.c.h
            return r0
    }

    public static int E(int r2) {
            r0 = r2 & 96
            r1 = 8
            if (r0 == 0) goto L7
            return r1
        L7:
            r0 = r2 & 28
            if (r0 == 0) goto Ld
            r2 = 4
            return r2
        Ld:
            r0 = r2 & 2
            if (r0 == 0) goto L13
            r2 = 2
            return r2
        L13:
            r0 = 1
            r2 = r2 & r0
            if (r2 == 0) goto L18
            return r0
        L18:
            return r1
    }

    public static java.lang.String G(long r1, int r3) {
            r0 = 8
            long r1 = j(r1, r3)
            java.lang.String r1 = android.ext.t2.e(r0, r1)
            return r1
    }

    public static java.lang.String I(long r2, long r4, int r6) {
            r6 = r6 & 127(0x7f, float:1.78E-43)
            r0 = 8
            r1 = 0
            if (r6 == r0) goto L1e
            r2 = 16
            if (r6 == r2) goto L19
            r2 = 64
            if (r6 == r2) goto L14
            r2 = 80
            if (r6 == r2) goto L14
            goto L1f
        L14:
            java.lang.String r1 = android.ext.b0.b(r4)
            goto L1f
        L19:
            java.lang.String r1 = android.ext.b0.e(r4)
            goto L1f
        L1e:
            long r4 = r4 ^ r2
        L1f:
            if (r1 != 0) goto L25
            java.lang.String r1 = android.ext.i0.c(r4, r6)
        L25:
            return r1
    }

    public static java.lang.String K(long r0, long r2, int r4) {
            java.lang.String r0 = I(r0, r2, r4)
            java.lang.String r0 = r0.trim()
            return r0
    }

    public static java.lang.String M(long r6, long r8, int r10) {
            r5 = 0
            r0 = r6
            r2 = r8
            r4 = r10
            java.lang.String r6 = N(r0, r2, r4, r5)
            return r6
    }

    private static java.lang.String N(long r4, long r6, int r8, boolean r9) {
            r8 = r8 & 127(0x7f, float:1.78E-43)
            r0 = 8
            if (r8 != r0) goto L7
            long r6 = r6 ^ r4
        L7:
            if (r9 == 0) goto L21
            int r4 = E(r8)
            long r5 = java.lang.Long.reverseBytes(r6)
            int r7 = r4 * 8
            int r9 = 64 - r7
            long r5 = r5 >> r9
            if (r4 == r0) goto L20
            r0 = 1
            long r2 = r0 << r7
            long r2 = r2 - r0
            long r6 = r5 & r2
            goto L21
        L20:
            r6 = r5
        L21:
            r4 = 1
            java.lang.String r4 = android.ext.i0.d(r6, r8, r4)
            return r4
    }

    public static java.lang.String P(long r6, long r8, int r10) {
            r5 = 1
            r0 = r6
            r2 = r8
            r4 = r10
            java.lang.String r6 = N(r0, r2, r4, r5)
            return r6
    }

    public static int R(int r2) {
            r0 = 127(0x7f, float:1.78E-43)
            r2 = r2 & r0
            if (r2 == 0) goto L21
            r1 = 1
            if (r2 == r1) goto L21
            r1 = 2
            if (r2 == r1) goto L21
            r1 = 4
            if (r2 == r1) goto L21
            r1 = 8
            if (r2 == r1) goto L21
            r1 = 16
            if (r2 == r1) goto L21
            r1 = 32
            if (r2 == r1) goto L21
            r1 = 64
            if (r2 == r1) goto L21
            if (r2 == r0) goto L21
            goto L22
        L21:
            r0 = r2
        L22:
            return r0
    }

    public static int S(long r1, boolean r3) {
            r0 = 0
            int r1 = T(r1, r3, r0)
            return r1
    }

    public static int T(long r7, boolean r9, android.util.SparseIntArray r10) {
            r0 = 3
            long r0 = r0 & r7
            r2 = 1
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L26
            r0 = 32
            if (r9 == 0) goto Lf
            return r0
        Lf:
            if (r10 == 0) goto L23
            int r1 = r10.get(r0)
            int r1 = r1 + r2
            r10.put(r0, r1)
            r0 = 64
            int r1 = r10.get(r0)
            int r1 = r1 + r2
            r10.put(r0, r1)
        L23:
            r0 = 96
            goto L27
        L26:
            r0 = 0
        L27:
            if (r5 != 0) goto L4d
            r1 = 4
            if (r9 == 0) goto L2d
            return r1
        L2d:
            r0 = r0 | 28
            if (r10 == 0) goto L4d
            int r5 = r10.get(r1)
            int r5 = r5 + r2
            r10.put(r1, r5)
            r1 = 8
            int r5 = r10.get(r1)
            int r5 = r5 + r2
            r10.put(r1, r5)
            r1 = 16
            int r5 = r10.get(r1)
            int r5 = r5 + r2
            r10.put(r1, r5)
        L4d:
            r5 = 1
            long r7 = r7 & r5
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L64
            r7 = 2
            if (r9 == 0) goto L58
            return r7
        L58:
            r0 = r0 | 2
            if (r10 == 0) goto L64
            int r8 = r10.get(r7)
            int r8 = r8 + r2
            r10.put(r7, r8)
        L64:
            r7 = r0 | 1
            if (r10 == 0) goto L70
            int r8 = r10.get(r2)
            int r8 = r8 + r2
            r10.put(r2, r8)
        L70:
            return r7
    }

    private static void U(a.e r3, a.e r4, int r5, java.lang.String r6, int r7, java.lang.Object r8, java.lang.Object r9) {
            java.lang.String r7 = android.ext.b2.f(r7)
            int r0 = n(r5)
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r7
            r2 = 1
            r1[r2] = r8
            r8 = 2
            r1[r8] = r9
            java.lang.String r6 = android.ext.Tools.L1(r6, r1)
            java.lang.CharSequence r6 = android.ext.Tools.t(r6, r0)
            r3.append(r5, r6)
            java.lang.CharSequence r3 = android.ext.Tools.t(r7, r0)
            r4.append(r5, r3)
            return
    }

    public static android.ext.t1.b W(android.ext.t1.b r6, java.lang.String r7, int r8, int r9, long r10) {
            r3 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            android.ext.t1$b r6 = android.ext.t1.p(r0, r1, r2, r3, r4)     // Catch: java.lang.NumberFormatException -> La
            return r6
        La:
            r6 = move-exception
            java.lang.String r9 = android.ext.b2.f(r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Failed parse '"
            r10.append(r11)
            r10.append(r7)
            java.lang.String r7 = "' as "
            r10.append(r7)
            r10.append(r8)
            java.lang.String r7 = " on '"
            r10.append(r7)
            r10.append(r9)
            r7 = 39
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            android.ext.e1.s(r7, r6)
            boolean r7 = r6 instanceof android.ext.t1.a
            if (r7 != 0) goto L62
            boolean r7 = r6 instanceof android.ext.n.b
            if (r7 == 0) goto L41
            goto L62
        L41:
            java.lang.NumberFormatException r7 = new java.lang.NumberFormatException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            java.lang.String r9 = ": "
            r8.append(r9)
            java.lang.String r9 = r6.getMessage()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            r7.initCause(r6)
            throw r7
        L62:
            throw r6
    }

    public static long d(android.ext.t1.b r6, java.lang.String r7, int r8) {
            r2 = r8 & 127(0x7f, float:1.78E-43)
            r3 = 2131296829(0x7f09023d, float:1.8211586E38)
            r4 = 0
            r0 = r6
            r1 = r7
            android.ext.t1$b r6 = W(r0, r1, r2, r3, r4)
            long r6 = r6.f1261a
            return r6
    }

    public static long e(long r6, java.lang.String r8, int r9) {
            r9 = r9 & 127(0x7f, float:1.78E-43)
            r0 = 0
            r3 = 2131296829(0x7f09023d, float:1.8211586E38)
            r1 = r8
            r2 = r9
            r4 = r6
            android.ext.t1$b r8 = W(r0, r1, r2, r3, r4)
            long r0 = r8.f1261a
            r8 = 8
            if (r9 != r8) goto L14
            long r0 = r0 ^ r6
        L14:
            return r0
    }

    public static int g(int r6, long r7, boolean r9) {
            r0 = 80
            if (r6 == r0) goto L4d
            r0 = 64
            if (r6 != r0) goto L9
            goto L4d
        L9:
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L2c
            r9 = 7
            long r2 = r7 >> r9
            r4 = -1
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 == 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            r9 = 15
            long r1 = r7 >> r9
            int r9 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r9 == 0) goto L22
            r0 = r0 | 2
        L22:
            r9 = 31
            long r7 = r7 >> r9
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 == 0) goto L4b
        L29:
            r0 = r0 | 12
            goto L4b
        L2c:
            r9 = 8
            long r2 = r7 >> r9
            r4 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 == 0) goto L37
            goto L38
        L37:
            r0 = 0
        L38:
            r9 = 16
            long r1 = r7 >> r9
            int r9 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r9 == 0) goto L43
            r9 = r0 | 2
            r0 = r9
        L43:
            r9 = 32
            long r7 = r7 >> r9
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 == 0) goto L4b
            goto L29
        L4b:
            int r7 = ~r0
            r6 = r6 & r7
        L4d:
            return r6
    }

    public static long h(long r4, int r6) {
            r0 = r6 & 127(0x7f, float:1.78E-43)
            r1 = 1
            if (r0 == r1) goto L17
            r1 = 2
            if (r0 == r1) goto L14
            r1 = 4
            if (r0 == r1) goto L11
            r1 = 8
            if (r0 == r1) goto L11
            r0 = r4
            goto L1a
        L11:
            int r0 = (int) r4
        L12:
            long r0 = (long) r0
            goto L1a
        L14:
            int r0 = (int) r4
            short r0 = (short) r0
            goto L12
        L17:
            int r0 = (int) r4
            byte r0 = (byte) r0
            goto L12
        L1a:
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L69
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "fixValue["
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = ", "
            r2.append(r3)
            java.lang.String r6 = java.lang.Integer.toHexString(r6)
            r2.append(r6)
            java.lang.String r6 = "]: "
            r2.append(r6)
            r2.append(r4)
            r6 = 91
            r2.append(r6)
            java.lang.String r4 = java.lang.Long.toHexString(r4)
            r2.append(r4)
            java.lang.String r4 = "] -> "
            r2.append(r4)
            r2.append(r0)
            r2.append(r6)
            java.lang.String r4 = java.lang.Long.toHexString(r0)
            r2.append(r4)
            r4 = 93
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            android.ext.e1.d(r4)
        L69:
            return r0
    }

    public static long j(long r0, int r2) {
            return r0
    }

    public static int l(int r2) {
            r0 = r2 & 96
            r1 = 4
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = r2 & 28
            if (r0 == 0) goto Lb
            return r1
        Lb:
            r0 = r2 & 2
            if (r0 == 0) goto L11
            r2 = 2
            return r2
        L11:
            r0 = 1
            r2 = r2 & r0
            if (r2 == 0) goto L16
            return r0
        L16:
            return r1
    }

    public static int n(int r4) {
            android.util.SparseIntArray r0 = android.ext.c.i     // Catch: java.lang.Throwable -> L66
            if (r0 != 0) goto L68
            android.util.SparseIntArray r0 = new android.util.SparseIntArray     // Catch: java.lang.Throwable -> L66
            r1 = 8
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L66
            r2 = 2130837531(0x7f02001b, float:1.7280019E38)
            int r2 = android.ext.Tools.d0(r2)     // Catch: java.lang.Throwable -> L66
            r3 = 1
            r0.append(r3, r2)     // Catch: java.lang.Throwable -> L66
            r2 = 2130837537(0x7f020021, float:1.728003E38)
            int r2 = android.ext.Tools.d0(r2)     // Catch: java.lang.Throwable -> L66
            r3 = 2
            r0.append(r3, r2)     // Catch: java.lang.Throwable -> L66
            r2 = 2130837533(0x7f02001d, float:1.7280023E38)
            int r2 = android.ext.Tools.d0(r2)     // Catch: java.lang.Throwable -> L66
            r3 = 4
            r0.append(r3, r2)     // Catch: java.lang.Throwable -> L66
            r2 = 2130837538(0x7f020022, float:1.7280033E38)
            int r2 = android.ext.Tools.d0(r2)     // Catch: java.lang.Throwable -> L66
            r0.append(r1, r2)     // Catch: java.lang.Throwable -> L66
            r1 = 2130837534(0x7f02001e, float:1.7280025E38)
            int r1 = android.ext.Tools.d0(r1)     // Catch: java.lang.Throwable -> L66
            r2 = 16
            r0.append(r2, r1)     // Catch: java.lang.Throwable -> L66
            r1 = 2130837535(0x7f02001f, float:1.7280027E38)
            int r1 = android.ext.Tools.d0(r1)     // Catch: java.lang.Throwable -> L66
            r2 = 32
            r0.append(r2, r1)     // Catch: java.lang.Throwable -> L66
            r1 = 2130837532(0x7f02001c, float:1.728002E38)
            int r1 = android.ext.Tools.d0(r1)     // Catch: java.lang.Throwable -> L66
            r2 = 64
            r0.append(r2, r1)     // Catch: java.lang.Throwable -> L66
            android.ext.c.i = r0     // Catch: java.lang.Throwable -> L66
            r1 = 2130837536(0x7f020020, float:1.7280029E38)
            int r1 = android.ext.Tools.d0(r1)     // Catch: java.lang.Throwable -> L66
            android.ext.c.j = r1     // Catch: java.lang.Throwable -> L66
            goto L68
        L66:
            r0 = move-exception
            goto L75
        L68:
            int r1 = R(r4)     // Catch: java.lang.Throwable -> L66
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L66
            if (r0 != 0) goto L8b
            int r0 = android.ext.c.j     // Catch: java.lang.Throwable -> L66
            goto L8b
        L75:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed getColor for: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.ext.e1.l(r4, r0)
            int r0 = android.ext.c.j
        L8b:
            return r0
    }

    public static a.e o(int r2) {
            r0 = 0
            a.e r2 = p(r2, r0)
            return r2
    }

    public static a.e p(int r5, long r6) {
            a.e r5 = q(r5)
            r0 = 127(0x7f, float:1.78E-43)
            r5.remove(r0)
            r0 = 3
            long r0 = r0 & r6
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1c
            r0 = 32
            r5.remove(r0)
            r0 = 64
            r5.remove(r0)
        L1c:
            if (r4 == 0) goto L2c
            r0 = 4
            r5.remove(r0)
            r0 = 8
            r5.remove(r0)
            r0 = 16
            r5.remove(r0)
        L2c:
            r0 = 1
            long r6 = r6 & r0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L37
            r6 = 2
            r5.remove(r6)
        L37:
            return r5
    }

    public static a.e q(int r1) {
            r0 = 0
            a.e r1 = r(r1, r0)
            return r1
    }

    public static a.e r(int r5, boolean r6) {
            a.e r0 = new a.e
            r0.<init>()
            a.e r1 = android.ext.c.f669e
            int r1 = r1.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L26
            a.e r3 = android.ext.c.f669e
            int r3 = r3.keyAt(r2)
            r4 = r5 & r3
            if (r4 != r3) goto L23
            a.e r4 = android.ext.c.f669e
            java.lang.Object r4 = r4.valueAt(r2)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.append(r3, r4)
        L23:
            int r2 = r2 + 1
            goto Lc
        L26:
            if (r6 == 0) goto L3b
            java.lang.Object r6 = r0.get(r5)
            if (r6 != 0) goto L3b
            a.e r6 = android.ext.c.f669e
            r1 = 127(0x7f, float:1.78E-43)
            java.lang.Object r6 = r6.get(r1)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r0.append(r5, r6)
        L3b:
            return r0
    }

    public static java.lang.String s(int r7) {
            r0 = 2131297036(0x7f09030c, float:1.8212006E38)
            java.lang.String r1 = "%.1e"
            r2 = 2
            r3 = 0
            r4 = 1
            if (r7 == 0) goto L70
            r5 = r7 & 64
            if (r5 == 0) goto Lf
            goto L70
        Lf:
            r5 = r7 & 16
            if (r5 == 0) goto L40
            java.lang.String r7 = android.ext.b2.f(r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r2[r3] = r5
            java.lang.String r2 = android.ext.Tools.L1(r1, r2)
            r0[r3] = r2
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r5 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r2[r3] = r5
            java.lang.String r1 = android.ext.Tools.L1(r1, r2)
            r0[r4] = r1
            java.lang.String r7 = android.ext.Tools.L1(r7, r0)
            return r7
        L40:
            java.lang.Object[] r1 = android.ext.t1.k()
            int r7 = y(r7)
            java.lang.String r0 = android.ext.b2.f(r0)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Object[] r6 = new java.lang.Object[r4]
            int r7 = r7 * 2
            r2 = r1[r7]
            r6[r3] = r2
            java.lang.String r2 = "%,d"
            java.lang.String r6 = android.ext.Tools.L1(r2, r6)
            r5[r3] = r6
            java.lang.Object[] r6 = new java.lang.Object[r4]
            int r7 = r7 + r4
            r7 = r1[r7]
            r6[r3] = r7
            java.lang.String r7 = android.ext.Tools.L1(r2, r6)
            r5[r4] = r7
            java.lang.String r7 = android.ext.Tools.L1(r0, r5)
            return r7
        L70:
            java.lang.String r7 = android.ext.b2.f(r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r5 = -4503599627370497(0xffefffffffffffff, double:-1.7976931348623157E308)
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r2[r3] = r5
            java.lang.String r2 = android.ext.Tools.L1(r1, r2)
            r0[r3] = r2
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r5 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r2[r3] = r5
            java.lang.String r1 = android.ext.Tools.L1(r1, r2)
            r0[r4] = r1
            java.lang.String r7 = android.ext.Tools.L1(r7, r0)
            return r7
    }

    public static java.lang.CharSequence t(int r1) {
            a.e r0 = android.ext.c.f669e
            int r1 = R(r1)
            java.lang.Object r1 = r0.get(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 != 0) goto L10
            java.lang.String r1 = "Unknown"
        L10:
            return r1
    }

    public static void updateLocale() {
            a.e r0 = android.ext.c.f669e
            a.e r1 = android.ext.c.f670f
            r2 = 127(0x7f, float:1.78E-43)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "A: %s (%.1e - %.1e) ("
            r3.append(r4)
            r4 = 2131296967(0x7f0902c7, float:1.8211866E38)
            java.lang.String r4 = android.ext.b2.f(r4)
            r3.append(r4)
            r4 = 41
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 2131297026(0x7f090302, float:1.8211985E38)
            r5 = -4503599627370497(0xffefffffffffffff, double:-1.7976931348623157E308)
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r6 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            U(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static java.lang.CharSequence v(int r1) {
            a.e r0 = android.ext.c.f670f
            int r1 = R(r1)
            java.lang.Object r1 = r0.get(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 != 0) goto L10
            java.lang.String r1 = "Unknown"
        L10:
            return r1
    }

    public static int w(int r1) {
            r0 = 1
            if (r1 == r0) goto L2e
            r0 = 2
            if (r1 == r0) goto L2b
            r0 = 4
            if (r1 == r0) goto L28
            r0 = 8
            if (r1 == r0) goto L25
            r0 = 16
            if (r1 == r0) goto L22
            r0 = 32
            if (r1 == r0) goto L1f
            r0 = 64
            if (r1 == r0) goto L1c
            r1 = 250(0xfa, float:3.5E-43)
            goto L30
        L1c:
            r1 = 30
            goto L30
        L1f:
            r1 = 60
            goto L30
        L22:
            r1 = 20
            goto L30
        L25:
            r1 = 70
            goto L30
        L28:
            r1 = 10
            goto L30
        L2b:
            r1 = 40
            goto L30
        L2e:
            r1 = 50
        L30:
            return r1
    }

    public static android.ext.c.a[] x(a.e r14, android.util.SparseIntArray r15) {
            int r0 = r14.size()
            android.ext.c$a[] r1 = new android.ext.c.a[r0]
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L25
            int r0 = r14.keyAt(r2)
            android.ext.c$a r3 = new android.ext.c$a
            java.lang.Object r14 = r14.valueAt(r2)
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            if (r15 != 0) goto L1a
            r15 = 0
            goto L1e
        L1a:
            int r15 = r15.get(r0)
        L1e:
            r3.<init>(r0, r14, r15)
            r1[r2] = r3
            goto La7
        L25:
            boolean[] r4 = new boolean[r0]
            int r5 = r0 + (-1)
            r6 = 0
        L2a:
            if (r6 >= r0) goto L51
            int r7 = r14.keyAt(r6)
            r8 = -10
            if (r7 <= r8) goto L35
            goto L51
        L35:
            android.ext.c$a r8 = new android.ext.c$a
            java.lang.Object r9 = r14.valueAt(r6)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            if (r15 != 0) goto L41
            r10 = 0
            goto L45
        L41:
            int r10 = r15.get(r7)
        L45:
            r8.<init>(r7, r9, r10)
            r1[r5] = r8
            r4[r6] = r3
            int r5 = r5 + (-1)
            int r6 = r6 + 1
            goto L2a
        L51:
            int[] r6 = android.ext.c.k
            int r7 = r6.length
            r8 = 0
        L55:
            if (r8 >= r7) goto L80
            r9 = r6[r8]
            int r10 = r14.indexOfKey(r9)
            if (r10 < 0) goto L7d
            boolean r11 = r4[r10]
            if (r11 == 0) goto L64
            goto L7d
        L64:
            android.ext.c$a r11 = new android.ext.c$a
            java.lang.Object r12 = r14.valueAt(r10)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            if (r15 != 0) goto L70
            r13 = 0
            goto L74
        L70:
            int r13 = r15.get(r9)
        L74:
            r11.<init>(r9, r12, r13)
            r1[r5] = r11
            r4[r10] = r3
            int r5 = r5 + (-1)
        L7d:
            int r8 = r8 + 1
            goto L55
        L80:
            r3 = 0
            r5 = 0
        L82:
            if (r3 >= r0) goto La7
            boolean r6 = r4[r3]
            if (r6 == 0) goto L89
            goto La4
        L89:
            int r6 = r14.keyAt(r3)
            android.ext.c$a r7 = new android.ext.c$a
            java.lang.Object r8 = r14.valueAt(r3)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            if (r15 != 0) goto L99
            r9 = 0
            goto L9d
        L99:
            int r9 = r15.get(r6)
        L9d:
            r7.<init>(r6, r8, r9)
            r1[r5] = r7
            int r5 = r5 + 1
        La4:
            int r3 = r3 + 1
            goto L82
        La7:
            return r1
    }

    public static int y(int r3) {
            r0 = r3 & 96
            r1 = 3
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = r3 & 28
            if (r0 == 0) goto Lc
            r3 = 2
            return r3
        Lc:
            r0 = r3 & 2
            r2 = 1
            if (r0 == 0) goto L12
            return r2
        L12:
            r3 = r3 & r2
            if (r3 == 0) goto L17
            r3 = 0
            return r3
        L17:
            return r1
    }

    public int D() {
            r1 = this;
            int r0 = r1.f674c
            int r0 = E(r0)
            return r0
    }

    public java.lang.String F() {
            r3 = this;
            long r0 = r3.f672a
            int r2 = r3.f674c
            java.lang.String r0 = G(r0, r2)
            return r0
    }

    public java.lang.String H() {
            r5 = this;
            long r0 = r5.f672a
            long r2 = r5.f673b
            int r4 = r5.f674c
            java.lang.String r0 = I(r0, r2, r4)
            return r0
    }

    public java.lang.String J() {
            r5 = this;
            long r0 = r5.f672a
            long r2 = r5.f673b
            int r4 = r5.f674c
            java.lang.String r0 = K(r0, r2, r4)
            return r0
    }

    public java.lang.String L() {
            r6 = this;
            long r0 = r6.f672a
            long r2 = r6.f673b
            int r4 = r6.f674c
            r5 = 0
            java.lang.String r0 = N(r0, r2, r4, r5)
            return r0
    }

    public java.lang.String O() {
            r6 = this;
            long r0 = r6.f672a
            long r2 = r6.f673b
            int r4 = r6.f674c
            r5 = 1
            java.lang.String r0 = N(r0, r2, r4, r5)
            return r0
    }

    public int Q() {
            r1 = this;
            int r0 = r1.f674c
            int r0 = R(r0)
            return r0
    }

    public boolean V() {
            r6 = this;
            long r0 = r6.f672a
            int r2 = r6.k()
            r3 = 1
            int r2 = r2 - r3
            long r4 = (long) r2
            long r0 = r0 & r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L11
            goto L12
        L11:
            r3 = 0
        L12:
            return r3
    }

    public void X(java.lang.String r4) {
            r3 = this;
            long r0 = r3.f672a
            int r2 = r3.f674c
            long r0 = e(r0, r4, r2)
            r3.f673b = r0
            return
    }

    public void a() {
            r1 = this;
            r0 = 0
            r1.b(r0)
            return
    }

    public void b(int r2) {
            r1 = this;
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.f0 r0 = r0.i
            r0.a(r1, r2)
            return
    }

    public android.ext.c c() {
            r1 = this;
            android.ext.c r0 = new android.ext.c
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 != 0) goto L8
            return r1
        L8:
            boolean r2 = r8 instanceof android.ext.c
            if (r2 != 0) goto Ld
            return r1
        Ld:
            android.ext.c r8 = (android.ext.c) r8
            long r2 = r7.f672a
            long r4 = r8.f672a
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L18
            return r1
        L18:
            int r2 = r7.f674c
            int r8 = r8.f674c
            r8 = r8 ^ r2
            r8 = r8 & 127(0x7f, float:1.78E-43)
            if (r8 == 0) goto L22
            return r1
        L22:
            return r0
    }

    public android.ext.c.b f(android.ext.c.b r7, android.ext.t1.b r8, java.lang.String r9, long r10, java.lang.String r12, int r13) {
            r6 = this;
            if (r8 != 0) goto Le
            r0 = 0
            int r2 = r6.f674c
            r3 = 2131296829(0x7f09023d, float:1.8211586E38)
            r1 = r9
            r4 = r10
            android.ext.t1$b r8 = W(r0, r1, r2, r3, r4)
        Le:
            long r9 = r8.f1261a
            if (r13 == 0) goto L6c
            if (r7 != 0) goto L3c
            r0 = 0
            int r2 = r6.f674c
            r3 = 2131296993(0x7f0902e1, float:1.8211918E38)
            r4 = 0
            r1 = r12
            android.ext.t1$b r7 = W(r0, r1, r2, r3, r4)
            android.ext.c$b r11 = new android.ext.c$b
            r11.<init>()
            long r0 = r7.f1261a
            int r12 = (int) r0
            float r12 = java.lang.Float.intBitsToFloat(r12)
            r11.f678a = r12
            long r0 = r7.f1261a
            double r0 = java.lang.Double.longBitsToDouble(r0)
            r11.f679b = r0
            long r0 = r7.f1261a
            r11.f680c = r0
            r7 = r11
        L3c:
            int r8 = r8.f1263c
            r11 = 16
            if (r8 != r11) goto L53
            int r8 = (int) r9
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r9 = r7.f678a
            float r10 = (float) r13
            float r9 = r9 * r10
            float r8 = r8 + r9
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r9 = (long) r8
            goto L6c
        L53:
            r11 = 64
            if (r8 != r11) goto L66
            double r8 = java.lang.Double.longBitsToDouble(r9)
            double r10 = r7.f679b
            double r12 = (double) r13
            double r10 = r10 * r12
            double r8 = r8 + r10
            long r9 = java.lang.Double.doubleToRawLongBits(r8)
            goto L6c
        L66:
            long r11 = r7.f680c
            long r0 = (long) r13
            long r11 = r11 * r0
            long r9 = r9 + r11
        L6c:
            int r8 = r6.f674c
            r11 = 8
            if (r8 != r11) goto L75
            long r11 = r6.f672a
            long r9 = r9 ^ r11
        L75:
            r6.f673b = r9
            return r7
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.f672a
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            int r1 = r1 + 31
            int r1 = r1 * 31
            int r0 = r4.f674c
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r1 = r1 + r0
            return r1
    }

    public long i() {
            r3 = this;
            long r0 = r3.f672a
            int r2 = r3.f674c
            long r0 = j(r0, r2)
            return r0
    }

    public int k() {
            r1 = this;
            int r0 = r1.f674c
            int r0 = l(r0)
            return r0
    }

    public int m() {
            r1 = this;
            int r0 = r1.f674c
            int r0 = n(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.F()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r1 = r2.H()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.CharSequence r1 = r2.u()
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            int r1 = r2.f674c
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.CharSequence u() {
            r1 = this;
            int r0 = r1.f674c
            java.lang.CharSequence r0 = v(r0)
            return r0
    }

    public java.lang.CharSequence z() {
            r1 = this;
            int r0 = r1.f674c
            java.lang.CharSequence r0 = A(r0)
            return r0
    }
}
