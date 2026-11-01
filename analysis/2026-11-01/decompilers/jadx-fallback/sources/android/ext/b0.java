package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static android.ext.b0.a f582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.text.DecimalFormat f583c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.text.DecimalFormat f584d = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f588d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f590f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f591g;
        int h;
        int i;
        double j;
        int k;

        public a(int r4, long r5, long r7, long r9, int r11, long r12, int r14, int r15, int r16, double r17, int r19) {
                r3 = this;
                r0 = r3
                r3.<init>()
                r1 = r4
                r0.f585a = r1
                r1 = r5
                r0.f586b = r1
                r1 = r7
                r0.f587c = r1
                r1 = r9
                r0.f588d = r1
                r1 = r11
                r0.f589e = r1
                r1 = r12
                r0.f590f = r1
                r1 = r14
                r0.f591g = r1
                r1 = r15
                r0.h = r1
                r1 = r16
                r0.i = r1
                r1 = r17
                r0.j = r1
                r1 = r19
                r0.k = r1
                return
        }
    }

    static {
            android.ext.b0$a r17 = new android.ext.b0$a
            r0 = r17
            r1 = 0
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r0.<init>(r1, r2, r4, r6, r8, r9, r11, r12, r13, r14, r16)
            android.ext.b0.f582b = r17
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "0.0#######E0"
            r0.<init>(r1)
            android.ext.b0.f583c = r0
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "###,###,##0.0##########"
            r0.<init>(r1)
            android.ext.b0.f584d = r0
            return
    }

    public static java.lang.String a(double r5) {
            double r0 = java.lang.Math.abs(r5)
            r2 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L16
            r2 = 4756540486875873280(0x4202a05f20000000, double:1.0E10)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L1c
        L16:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1f
        L1c:
            java.text.DecimalFormat r0 = android.ext.b0.f584d
            goto L21
        L1f:
            java.text.DecimalFormat r0 = android.ext.b0.f583c
        L21:
            java.lang.String r5 = r0.format(r5)
            r6 = 69
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r5 = r5.replace(r6, r0)
            return r5
    }

    public static java.lang.String b(long r0) {
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.String r0 = a(r0)
            return r0
    }

    public static java.lang.String c(float r2) {
            double r0 = (double) r2
            java.lang.String r2 = a(r0)
            return r2
    }

    public static java.lang.String d(int r0) {
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = c(r0)
            return r0
    }

    public static java.lang.String e(long r0) {
            int r1 = (int) r0
            java.lang.String r0 = d(r1)
            return r0
    }

    public static android.ext.b0.a f(long r21, long r23, java.lang.String r25, java.lang.String r26, int r27, java.lang.String r28, int r29) {
            r0 = 1
            r1 = 0
            r2 = 0
            int r4 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r4 = 1
            goto Lb
        La:
            r4 = 0
        Lb:
            r5 = -1
            int r7 = (r23 > r5 ? 1 : (r23 == r5 ? 0 : -1))
            if (r7 == 0) goto L13
            r4 = r4 | 2
        L13:
            r5 = 127(0x7f, float:1.78E-43)
            r6 = 0
            if (r25 == 0) goto L29
            r4 = r4 | 4
            java.lang.String r7 = r25.trim()
            android.ext.t1$b r7 = android.ext.t1.o(r6, r7, r5, r1)
            long r8 = r7.f1261a
            int r7 = r7.f1263c
            r12 = r7
            r10 = r8
            goto L2b
        L29:
            r10 = r2
            r12 = 0
        L2b:
            if (r26 == 0) goto L3e
            r4 = r4 | 8
            java.lang.String r2 = r26.trim()
            android.ext.t1$b r2 = android.ext.t1.o(r6, r2, r5, r1)
            long r7 = r2.f1261a
            int r2 = r2.f1263c
            r15 = r2
            r13 = r7
            goto L40
        L3e:
            r13 = r2
            r15 = 0
        L40:
            if (r27 == 0) goto L44
            r4 = r4 | 16
        L44:
            if (r28 == 0) goto L74
            java.lang.String r2 = r28.trim()
            r4 = r4 | 32
            int r3 = r2.length()
            if (r3 <= 0) goto L61
            char r3 = r2.charAt(r1)
            r5 = 33
            if (r3 != r5) goto L61
            java.lang.String r2 = r2.substring(r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            goto L63
        L61:
            r0 = 536870912(0x20000000, float:1.0842022E-19)
        L63:
            r3 = 64
            android.ext.t1$b r1 = android.ext.t1.o(r6, r2, r3, r1)
            long r1 = r1.f1261a
            double r1 = java.lang.Double.longBitsToDouble(r1)
            r17 = r0
            r18 = r1
            goto L7a
        L74:
            r2 = 0
            r18 = r2
            r17 = 0
        L7a:
            if (r29 == 0) goto L80
            r0 = r4 | 64
            r5 = r0
            goto L81
        L80:
            r5 = r4
        L81:
            android.ext.b0$a r0 = new android.ext.b0$a
            r4 = r0
            r6 = r21
            r8 = r23
            r16 = r27
            r20 = r29
            r4.<init>(r5, r6, r8, r10, r12, r13, r15, r16, r17, r18, r20)
            return r0
    }

    public static void g() {
            int r0 = i()
            android.ext.b0$a r1 = android.ext.b0.f582b
            r2 = 0
            h(r2, r0, r2, r1)
            return
    }

    public static void h(byte r22, int r23, int r24, android.ext.b0.a r25) {
            r0 = r25
            r2 = r22
            r3 = r23
            r4 = r24
            android.ext.MainService r1 = android.ext.MainService.instance
            android.ext.f0 r1 = r1.i
            int r5 = r0.f585a
            long r6 = r0.f586b
            long r8 = r0.f587c
            long r10 = r0.f588d
            int r12 = r0.f589e
            long r13 = r0.f590f
            int r15 = r0.f591g
            r22 = r1
            int r1 = r0.h
            r16 = r1
            int r1 = r0.i
            r17 = r1
            r21 = r2
            double r1 = r0.j
            r18 = r1
            int r0 = r0.k
            r20 = r0
            r1 = r22
            r2 = r21
            r1.Y(r2, r3, r4, r5, r6, r8, r10, r12, r13, r15, r16, r17, r18, r20)
            return
    }

    public static int i() {
            int r0 = android.ext.b0.f581a
            return r0
    }

    public static void j(android.ext.MainService r2) {
            android.content.SharedPreferences r2 = android.ext.Tools.M0()
            r0 = 2131034233(0x7f050079, float:1.7678978E38)
            java.lang.String r0 = android.ext.b2.b(r0)     // Catch: java.lang.NumberFormatException -> L16
            java.lang.String r1 = "100"
            java.lang.String r2 = r2.getString(r0, r1)     // Catch: java.lang.NumberFormatException -> L16
            int r2 = m(r2)     // Catch: java.lang.NumberFormatException -> L16
            goto L18
        L16:
            r2 = 100
        L18:
            p(r2)
            return
    }

    public static boolean k() {
            android.ext.b0$a r0 = android.ext.b0.f582b
            int r0 = r0.f585a
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static int l(long r7) {
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            long r0 = r0 & r7
            r2 = 0
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            long r7 = r7 & r4
            int r8 = (int) r7
            if (r6 == 0) goto L13
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r8
            return r7
        L13:
            return r8
    }

    public static int m(java.lang.String r6) {
            java.lang.String r6 = r6.trim()
            r0 = 46
            int r0 = r6.indexOf(r0)
            r1 = -1
            if (r0 == r1) goto L1a
            float r0 = java.lang.Float.parseFloat(r6)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L1b
        L1a:
            r0 = 0
        L1b:
            int r1 = r6.length()
            r2 = 1
            r3 = 10
            if (r1 < r2) goto L48
            int r1 = r1 - r2
            char r2 = r6.charAt(r1)
            r4 = 104(0x68, float:1.46E-43)
            r5 = 0
            if (r2 != r4) goto L34
            java.lang.String r6 = r6.substring(r5, r1)
            r3 = 16
        L34:
            r4 = 102(0x66, float:1.43E-43)
            if (r2 != r4) goto L48
            java.lang.String r6 = r6.substring(r5, r1)
            float r0 = java.lang.Float.parseFloat(r6)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L48:
            if (r0 != 0) goto L56
            long r0 = android.ext.t1.r(r6, r3)
            int r6 = l(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
        L56:
            int r6 = r0.intValue()
            return r6
    }

    public static void n(android.ext.c2 r8, boolean r9) {
            java.lang.String r0 = "gg.getResults("
            r8.write(r0)
            int r0 = i()
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r8.write(r0)
            if (r9 == 0) goto Lc0
            android.ext.b0$a r9 = android.ext.b0.f582b
            int r0 = r9.f585a
            java.lang.String r1 = ", "
            r8.write(r1)
            java.lang.String r2 = "nil"
            r8.write(r2)
            r8.write(r1)
            r3 = r0 & 1
            if (r3 != 0) goto L2b
            r8.write(r2)
            goto L30
        L2b:
            long r3 = r9.f586b
            android.ext.Script.Consts.b(r8, r3)
        L30:
            r8.write(r1)
            r3 = r0 & 2
            if (r3 != 0) goto L3b
            r8.write(r2)
            goto L40
        L3b:
            long r3 = r9.f587c
            android.ext.Script.Consts.b(r8, r3)
        L40:
            r8.write(r1)
            r3 = r0 & 4
            r4 = 0
            if (r3 != 0) goto L4d
            r8.write(r2)
            goto L58
        L4d:
            long r6 = r9.f588d
            int r3 = r9.f589e
            java.lang.String r3 = android.ext.c.I(r4, r6, r3)
            android.ext.Script.Consts.d(r8, r3)
        L58:
            r8.write(r1)
            r3 = r0 & 8
            if (r3 != 0) goto L63
            r8.write(r2)
            goto L6e
        L63:
            long r6 = r9.f590f
            int r3 = r9.f591g
            java.lang.String r3 = android.ext.c.I(r4, r6, r3)
            android.ext.Script.Consts.d(r8, r3)
        L6e:
            r8.write(r1)
            r3 = r0 & 16
            if (r3 != 0) goto L79
            r8.write(r2)
            goto L82
        L79:
            android.ext.Script$Consts r3 = r8.f697c
            android.ext.Script$Const[] r3 = r3.f372b
            int r4 = r9.h
            android.ext.Script.Consts.a(r8, r3, r4)
        L82:
            r8.write(r1)
            r3 = r0 & 32
            if (r3 != 0) goto L8d
            r8.write(r2)
            goto Lac
        L8d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r9.i
            r5 = 268435456(0x10000000, float:2.524355E-29)
            if (r4 != r5) goto L9b
            java.lang.String r4 = "|"
            goto L9d
        L9b:
            java.lang.String r4 = ""
        L9d:
            r3.append(r4)
            double r4 = r9.j
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.ext.Script.Consts.d(r8, r3)
        Lac:
            r8.write(r1)
            r0 = r0 & 64
            if (r0 != 0) goto Lb7
            r8.write(r2)
            goto Lc0
        Lb7:
            android.ext.Script$Consts r0 = r8.f697c
            android.ext.Script$Const[] r0 = r0.h
            int r9 = r9.k
            android.ext.Script.Consts.a(r8, r0, r9)
        Lc0:
            java.lang.String r9 = ")\n"
            r8.write(r9)
            return
    }

    public static void o(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, java.lang.String r20, int r21) {
            r0 = 0
            r1 = 127(0x7f, float:1.78E-43)
            r2 = 104(0x68, float:1.46E-43)
            r3 = 0
            if (r15 != 0) goto Lc
            r4 = 0
        La:
            r6 = r4
            goto L26
        Lc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r15.trim()
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            android.ext.t1$b r4 = android.ext.t1.o(r3, r4, r1, r0)
            long r4 = r4.f1261a
            goto La
        L26:
            if (r16 != 0) goto L2c
            r0 = -1
        L2a:
            r8 = r0
            goto L46
        L2c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r16.trim()
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.ext.t1$b r0 = android.ext.t1.o(r3, r2, r1, r0)
            long r0 = r0.f1261a
            goto L2a
        L46:
            r10 = r17
            r11 = r18
            r12 = r19
            r13 = r20
            r14 = r21
            android.ext.b0$a r0 = f(r6, r8, r10, r11, r12, r13, r14)
            android.ext.b0.f582b = r0
            return
    }

    public static void p(int r1) {
            r0 = 1
            int r1 = java.lang.Math.max(r0, r1)
            r0 = 100000(0x186a0, float:1.4013E-40)
            int r1 = java.lang.Math.min(r1, r0)
            android.ext.b0.f581a = r1
            return
    }
}
