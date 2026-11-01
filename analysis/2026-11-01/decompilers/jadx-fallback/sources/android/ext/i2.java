package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class i2 extends android.ext.j2 implements android.view.View.OnClickListener {
    public static java.lang.String l;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long[] f1009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long[] f1010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int[] f1011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1012d;

        public a(int r2) {
                r1 = this;
                r1.<init>()
                long[] r0 = new long[r2]
                r1.f1009a = r0
                long[] r0 = new long[r2]
                r1.f1010b = r0
                int[] r2 = new int[r2]
                r1.f1011c = r2
                r2 = 2
                r1.f1012d = r2
                return
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f1014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1016d;

        public b() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f1013a = r0
                r2.f1014b = r0
                r0 = 0
                r2.f1015c = r0
                r0 = 536870912(0x20000000, float:1.0842022E-19)
                r2.f1016d = r0
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                long r1 = r3.f1013a
                r0.append(r1)
                int r1 = r3.f1016d
                r2 = 536870912(0x20000000, float:1.0842022E-19)
                if (r1 != r2) goto L1f
                java.lang.String r1 = "~"
                goto L21
            L1f:
                java.lang.String r1 = "~~"
            L21:
                r0.append(r1)
                long r1 = r3.f1014b
                r0.append(r1)
                r1 = 32
                r0.append(r1)
                int r1 = r3.f1015c
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.String f1017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1018b;

        public c() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            return
    }

    public i2() {
            r2 = this;
            r0 = 2131296945(0x7f0902b1, float:1.821182E38)
            r1 = 2130968628(0x7f040034, float:1.7545915E38)
            r2.<init>(r0, r1)
            return
    }

    private static boolean A(byte r16, long r17, long r19, int r21, int r22, long r23, long r25, boolean r27, long r28) {
            r14 = r16
            android.ext.MainService r0 = android.ext.MainService.instance
            boolean r1 = r0.a1()
            if (r1 == 0) goto L45
            long r1 = r0.p0
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L17
            if (r27 == 0) goto L17
            r0.n(r14)
        L17:
            long r1 = r0.p0
            r15 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L25
            r0.q0 = r15
            android.ext.f0 r1 = r0.i
            r1.x0(r14)
        L25:
            r0.R(r14)
            r0.r0 = r15
            android.ext.f0 r0 = r0.i
            r1 = r16
            r2 = r17
            r4 = r19
            r6 = r21
            r7 = r22
            r8 = r23
            r10 = r25
            r12 = r28
            r0.r0(r1, r2, r4, r6, r7, r8, r10, r12)
            r0 = r22
            android.ext.MainService.N0(r0, r14)
            return r15
        L45:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 2131296305(0x7f090031, float:1.8210523E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.<init>(r1)
            throw r0
    }

    private static boolean k(byte r23, java.lang.String r24, int r25, boolean r26, boolean r27, int r28, long r29, long r31, boolean r33, long r34) {
            r0 = r26
            r1 = r28
            java.lang.String r2 = r24.trim()
            r3 = r25
            android.ext.i2$a r2 = v(r2, r3, r0)
            r3 = 0
            if (r0 == 0) goto L14
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L15
        L14:
            r0 = 0
        L15:
            r4 = 10
            r5 = 1
            r6 = 2131296630(0x7f090176, float:1.8211182E38)
            r7 = 2
            r8 = 2131296384(0x7f090080, float:1.8210683E38)
            java.lang.String r9 = ""
            if (r27 == 0) goto L4e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = android.ext.b2.f(r8)
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.String r12 = android.ext.b2.f(r6)
            r11[r3] = r12
            r12 = 2131296780(0x7f09020c, float:1.8211486E38)
            java.lang.String r12 = android.ext.b2.f(r12)
            r11[r5] = r12
            java.lang.String r9 = android.ext.Tools.L1(r9, r11)
            r10.append(r9)
            r10.append(r4)
            java.lang.String r9 = r10.toString()
        L4e:
            r10 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r10) goto L84
            r10 = 268435456(0x10000000, float:2.524355E-29)
            if (r1 == r10) goto L84
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r8 = android.ext.b2.f(r8)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r6 = android.ext.b2.f(r6)
            r7[r3] = r6
            a.e r3 = android.ext.c.B()
            java.lang.Object r1 = r3.get(r1)
            r7[r5] = r1
            java.lang.String r1 = android.ext.Tools.L1(r8, r7)
            r10.append(r1)
            r10.append(r4)
            java.lang.String r9 = r10.toString()
        L82:
            r15 = r0
            goto L86
        L84:
            r0 = r0 | r1
            goto L82
        L86:
            int r0 = r9.length()
            if (r0 > 0) goto La3
            long[] r11 = r2.f1009a
            long[] r12 = r2.f1010b
            int[] r13 = r2.f1011c
            int r14 = r2.f1012d
            r10 = r23
            r16 = r29
            r18 = r31
            r20 = r33
            r21 = r34
            boolean r0 = z(r10, r11, r12, r13, r14, r15, r16, r18, r20, r21)
            return r0
        La3:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r9)
            throw r0
    }

    private static boolean l(byte r20, java.lang.String r21, int r22, boolean r23, int r24, long r25, long r27, boolean r29, long r30, int r32) {
            r0 = r24
            java.lang.String r1 = r21.trim()
            r2 = 1
            android.ext.i2$c r3 = x(r1, r2)
            r4 = 0
            if (r3 == 0) goto L12
            int r5 = r3.f1018b
            r11 = r5
            goto L13
        L12:
            r11 = 0
        L13:
            if (r3 == 0) goto L17
            java.lang.String r1 = r3.f1017a
        L17:
            r3 = 0
            r5 = r22
            android.ext.i2$b r1 = w(r3, r1, r5, r0)
            r3 = 10
            r5 = 2131296649(0x7f090189, float:1.821122E38)
            r6 = 2
            r7 = 2131296384(0x7f090080, float:1.8210683E38)
            java.lang.String r8 = ""
            if (r23 == 0) goto L56
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = android.ext.b2.f(r7)
            java.lang.Object[] r10 = new java.lang.Object[r6]
            java.lang.String r12 = android.ext.b2.f(r5)
            r10[r4] = r12
            r12 = 2131296780(0x7f09020c, float:1.8211486E38)
            java.lang.String r12 = android.ext.b2.f(r12)
            r10[r2] = r12
            java.lang.String r8 = android.ext.Tools.L1(r8, r10)
            r9.append(r8)
            r9.append(r3)
            java.lang.String r8 = r9.toString()
        L56:
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            if (r0 == r9) goto L8a
            r9 = 268435456(0x10000000, float:2.524355E-29)
            if (r0 == r9) goto L8a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r7 = android.ext.b2.f(r7)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r5 = android.ext.b2.f(r5)
            r6[r4] = r5
            a.e r4 = android.ext.c.B()
            java.lang.Object r0 = r4.get(r0)
            r6[r2] = r0
            java.lang.String r0 = android.ext.Tools.L1(r7, r6)
            r9.append(r0)
            r9.append(r3)
            java.lang.String r8 = r9.toString()
        L8a:
            int r0 = r8.length()
            if (r0 > 0) goto Lb3
            if (r11 == 0) goto L99
            int r0 = r1.f1015c
            r2 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 | r2
            r1.f1015c = r0
        L99:
            long r7 = r1.f1013a
            long r9 = r1.f1014b
            int r0 = r1.f1015c
            int r1 = r1.f1016d
            r0 = r0 | r1
            r12 = r0 | r32
            r6 = r20
            r13 = r25
            r15 = r27
            r17 = r29
            r18 = r30
            boolean r0 = A(r6, r7, r9, r11, r12, r13, r15, r17, r18)
            return r0
        Lb3:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r8)
            throw r0
    }

    public static boolean m(byte r13, int r14, byte[] r15, long r16, long r18, boolean r20, long r21) {
            r10 = r13
            r0 = r14 & 127(0x7f, float:1.78E-43)
            android.ext.MainService r1 = android.ext.MainService.instance
            long r2 = r1.p0
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L16
            if (r20 != 0) goto L16
            int r2 = android.ext.MainService.D()
            r2 = r2 & 127(0x7f, float:1.78E-43)
            r0 = r0 & r2
        L16:
            r11 = r0
            if (r11 != 0) goto L1e
            r1.n(r13)
            r0 = 1
            return r0
        L1e:
            boolean r0 = r1.a1()
            if (r0 == 0) goto L54
            long r2 = r1.p0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L2f
            if (r20 == 0) goto L2f
            r1.n(r13)
        L2f:
            long r2 = r1.p0
            r12 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L3d
            r1.q0 = r12
            android.ext.f0 r0 = r1.i
            r0.x0(r13)
        L3d:
            r1.R(r13)
            r1.r0 = r12
            android.ext.f0 r0 = r1.i
            r1 = r13
            r2 = r11
            r3 = r15
            r4 = r16
            r6 = r18
            r8 = r21
            r0.s0(r1, r2, r3, r4, r6, r8)
            android.ext.MainService.N0(r11, r13)
            return r12
        L54:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 2131296305(0x7f090031, float:1.8210523E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.<init>(r1)
            throw r0
    }

    public static boolean n(byte r13, java.lang.String r14, int r15, boolean r16, int r17, long r18, long r20, boolean r22, long r23) {
            r12 = 0
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r7 = r20
            r9 = r22
            r10 = r23
            boolean r0 = o(r0, r1, r2, r3, r4, r5, r7, r9, r10, r12)
            return r0
    }

    public static boolean o(byte r19, java.lang.String r20, int r21, boolean r22, int r23, long r24, long r26, boolean r28, long r29, int r31) {
            r12 = r19
            r10 = r20
            r4 = r22
            r2 = r21 & 127(0x7f, float:1.78E-43)
            r0 = 1006632960(0x3c000000, float:0.0078125)
            r5 = r23 & r0
            android.ext.MainService r0 = android.ext.MainService.instance
            boolean r1 = android.ext.t1.m(r20)
            r3 = 2
            r6 = 59
            r7 = 1
            r13 = 0
            if (r1 == 0) goto L37
            char r0 = r10.charAt(r13)
            if (r0 != r6) goto L21
            r1 = 2
            goto L22
        L21:
            r1 = 1
        L22:
            byte[] r2 = android.ext.t1.h(r20)
            r0 = r19
            r3 = r24
            r5 = r26
            r7 = r28
            r8 = r29
            boolean r0 = m(r0, r1, r2, r3, r5, r7, r8)
            android.ext.i2.l = r10
            return r0
        L37:
            int r1 = r10.indexOf(r6)
            r6 = -1
            if (r1 == r6) goto L57
            java.lang.String r0 = "::"
            boolean r3 = r10.contains(r0)
            r0 = r19
            r1 = r20
            r4 = r22
            r6 = r24
            r8 = r26
            r10 = r28
            r11 = r29
            boolean r0 = k(r0, r1, r2, r3, r4, r5, r6, r8, r10, r11)
            return r0
        L57:
            r1 = 126(0x7e, float:1.77E-43)
            int r1 = r10.indexOf(r1)
            if (r1 == r6) goto L7b
            int r1 = android.ext.t1.C(r20)
            if (r1 != 0) goto L7b
            r0 = r19
            r1 = r20
            r3 = r22
            r4 = r5
            r5 = r24
            r7 = r26
            r9 = r28
            r10 = r29
            r12 = r31
            boolean r0 = l(r0, r1, r2, r3, r4, r5, r7, r9, r10, r12)
            return r0
        L7b:
            long r8 = r0.p0
            r14 = 0
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 == 0) goto L8c
            if (r28 != 0) goto L8c
            int r1 = android.ext.MainService.D()
            r1 = r1 & 127(0x7f, float:1.78E-43)
            r2 = r2 & r1
        L8c:
            if (r2 != 0) goto L92
            r0.n(r12)
            return r7
        L92:
            android.ext.i2$c r1 = x(r10, r7)
            if (r1 == 0) goto L9b
            int r8 = r1.f1018b
            goto L9c
        L9b:
            r8 = 0
        L9c:
            if (r1 == 0) goto La1
            java.lang.String r1 = r1.f1017a
            r10 = r1
        La1:
            android.ext.t1$b r1 = new android.ext.t1$b
            r1.<init>()
            long r13 = android.ext.c.d(r1, r10, r2)
            int r9 = r1.f1263c
            r2 = r2 & r9
            int r9 = java.lang.Integer.bitCount(r2)
            if (r9 <= r7) goto Lbc
            boolean r1 = r1.f1262b
            int r2 = android.ext.c.g(r2, r13, r1)
        Lb9:
            r15 = r2
            goto L190
        Lbc:
            if (r4 != 0) goto Lb9
            r1 = 16
            if (r2 == r1) goto Lb9
            r1 = 64
            if (r2 == r1) goto Lb9
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r9 = 134217728(0x8000000, float:3.85186E-34)
            if (r5 == r9) goto Lce
            if (r5 != r1) goto Lb9
        Lce:
            r11 = 45
            int r11 = r10.indexOf(r11)
            if (r11 != r6) goto Lb9
            int r6 = android.ext.c.E(r2)
            int r6 = r6 * 8
            int r6 = r6 - r7
            r17 = 1
            long r17 = r17 << r6
            long r17 = r13 & r17
            r15 = 0
            int r6 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r6 == 0) goto Lb9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "unsigned search 1: '"
            r0.append(r3)
            r0.append(r10)
            java.lang.String r3 = "' "
            r0.append(r3)
            java.lang.String r6 = java.lang.Integer.toHexString(r2)
            r0.append(r6)
            r6 = 32
            r0.append(r6)
            r0.append(r4)
            r0.append(r6)
            java.lang.String r7 = java.lang.Integer.toHexString(r5)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            if (r5 != r9) goto L134
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r1 = "~0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r1 = r0
            r5 = 268435456(0x10000000, float:2.524355E-29)
            goto L14e
        L134:
            if (r5 != r1) goto L14d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r1 = "~-1"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r0
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            goto L14e
        L14d:
            r1 = r10
        L14e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "unsigned search 2: '"
            r0.append(r7)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r2)
            r0.append(r3)
            r0.append(r6)
            r0.append(r4)
            r0.append(r6)
            java.lang.String r3 = java.lang.Integer.toHexString(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            r0 = r19
            r3 = r22
            r4 = r5
            r5 = r24
            r7 = r26
            r9 = r28
            r10 = r29
            r12 = r31
            boolean r0 = o(r0, r1, r2, r3, r4, r5, r7, r9, r10, r12)
            return r0
        L190:
            if (r4 == 0) goto L196
            if (r8 != 0) goto L196
            r5 = 33554432(0x2000000, float:9.403955E-38)
        L196:
            r1 = r15 | r5
            if (r8 == 0) goto L1c6
            if (r4 != 0) goto L1a0
            r2 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r2
            goto L1c6
        L1a0:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 2131296384(0x7f090080, float:1.8210683E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r3 = 2131296669(0x7f09019d, float:1.8211261E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r4 = 0
            r2[r4] = r3
            r3 = 2131296780(0x7f09020c, float:1.8211486E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r2[r7] = r3
            java.lang.String r1 = android.ext.Tools.L1(r1, r2)
            r0.<init>(r1)
            throw r0
        L1c6:
            r5 = r1 | r31
            boolean r1 = r0.a1()
            if (r1 == 0) goto L202
            long r1 = r0.p0
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L1db
            if (r28 == 0) goto L1db
            r0.n(r12)
        L1db:
            long r1 = r0.p0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r1 = 0
            if (r6 != 0) goto L1e9
            r0.q0 = r1
            android.ext.f0 r2 = r0.i
            r2.x0(r12)
        L1e9:
            r0.R(r12)
            r0.r0 = r1
            android.ext.f0 r0 = r0.i
            r1 = r19
            r2 = r13
            r4 = r8
            r6 = r24
            r8 = r26
            r10 = r29
            r0.p0(r1, r2, r4, r5, r6, r8, r10)
            android.ext.MainService.N0(r15, r12)
            r0 = 0
            return r0
        L202:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 2131296305(0x7f090031, float:1.8210523E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.<init>(r1)
            throw r0
    }

    public static boolean p(byte r13, short r14, long r15, long r17, long r19) {
            r10 = r13
            android.ext.MainService r0 = android.ext.MainService.instance
            long r1 = r0.p0
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L10
            r0.n(r13)
            r0 = 1
            return r0
        L10:
            boolean r1 = r0.a1()
            if (r1 == 0) goto L3c
            r0.R(r13)
            r11 = 0
            r0.r0 = r11
            android.ext.z1$d r1 = r0.v0
            if (r1 == 0) goto L29
            boolean r1 = r1.n
            if (r1 == 0) goto L29
            r1 = 32
            r12 = 32
            goto L2b
        L29:
            r1 = 4
            r12 = 4
        L2b:
            android.ext.f0 r0 = r0.i
            r1 = r13
            r2 = r14
            r3 = r12
            r4 = r15
            r6 = r17
            r8 = r19
            r0.q0(r1, r2, r3, r4, r6, r8)
            android.ext.MainService.N0(r12, r13)
            return r11
        L3c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 2131296305(0x7f090031, float:1.8210523E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.<init>(r1)
            throw r0
    }

    public static boolean q(java.lang.String r12, int r13, boolean r14, int r15, long r16, long r18, boolean r20, long r21) {
            r11 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r8 = r20
            r9 = r21
            boolean r0 = r(r0, r1, r2, r3, r4, r6, r8, r9, r11)
            return r0
    }

    public static boolean r(java.lang.String r14, int r15, boolean r16, int r17, long r18, long r20, boolean r22, long r23, int r25) {
            java.lang.String r13 = android.ext.j2.h(r14)
            r0 = 0
            r1 = r13
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r7 = r20
            r9 = r22
            r10 = r23
            r12 = r25
            boolean r0 = o(r0, r1, r2, r3, r4, r5, r7, r9, r10, r12)
            android.ext.MainService r1 = android.ext.MainService.instance
            android.ext.c2 r1 = r1.f216f
            if (r1 == 0) goto L8b
            r2 = 1048576(0x100000, float:1.469368E-39)
            r2 = r25 & r2
            if (r2 == 0) goto L2b
            java.lang.String r2 = "\n-- pointer search by address: not recorded (no gg.searchNumber/gg.refineNumber equivalent for the ARM64 tag-normalizing pointer comparison)\n"
        L27:
            r1.write(r2)
            goto L8b
        L2b:
            if (r22 == 0) goto L32
            java.lang.String r2 = "\ngg.clearResults()\n"
            r1.write(r2)
        L32:
            if (r22 != 0) goto L45
            android.ext.MainService r2 = android.ext.MainService.instance
            long r2 = r2.p0
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L3f
            goto L45
        L3f:
            java.lang.String r2 = "gg.refineNumber("
        L41:
            r1.write(r2)
            goto L48
        L45:
            java.lang.String r2 = "gg.searchNumber("
            goto L41
        L48:
            android.ext.Script.Consts.c(r1, r13)
            java.lang.String r2 = ", "
            r1.write(r2)
            android.ext.Script$Consts r3 = r1.f697c
            android.ext.Script$Const[] r3 = r3.f372b
            r4 = r15
            android.ext.Script.Consts.a(r1, r3, r15)
            r1.write(r2)
            java.lang.String r3 = java.lang.Boolean.toString(r16)
            r1.write(r3)
            r1.write(r2)
            android.ext.Script$Consts r3 = r1.f697c
            android.ext.Script$Const[] r3 = r3.f374d
            r4 = r17
            android.ext.Script.Consts.a(r1, r3, r4)
            r1.write(r2)
            r3 = r18
            android.ext.Script.Consts.b(r1, r3)
            r1.write(r2)
            r3 = r20
            android.ext.Script.Consts.b(r1, r3)
            r1.write(r2)
            java.lang.String r2 = java.lang.Long.toString(r23)
            r1.write(r2)
            java.lang.String r2 = ")\n"
            goto L27
        L8b:
            return r0
    }

    private static void s(android.ext.i2.b r8, java.lang.String r9) {
            int r0 = r8.f1015c
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r1 = android.ext.c.E(r0)
            int r1 = r1 * 8
            r2 = 1
            int r1 = r1 - r2
            r3 = 1
            long r3 = r3 << r1
            int r1 = java.lang.Integer.bitCount(r0)
            if (r1 != r2) goto Lc0
            r1 = 16
            if (r0 == r1) goto Lc0
            r1 = 64
            if (r0 == r1) goto Lc0
            r1 = 45
            int r1 = r9.indexOf(r1)
            r2 = -1
            if (r1 != r2) goto Lc0
            long r1 = r8.f1013a
            long r1 = r1 & r3
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto Lc0
            long r1 = r8.f1014b
            long r1 = r1 & r3
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto Lc0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsigned search 3: '"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = "' "
            r1.append(r2)
            long r3 = r8.f1013a
            r1.append(r3)
            r3 = 32
            r1.append(r3)
            long r4 = r8.f1014b
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = java.lang.Integer.toHexString(r0)
            r1.append(r4)
            r1.append(r3)
            int r4 = r8.f1016d
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.ext.e1.d(r1)
            long r4 = r8.f1014b
            long r6 = r8.f1013a
            r8.f1014b = r6
            r8.f1013a = r4
            int r1 = r8.f1016d
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 != r4) goto L84
            r4 = 268435456(0x10000000, float:2.524355E-29)
        L84:
            r8.f1016d = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "unsigned search 4: '"
            r1.append(r4)
            r1.append(r9)
            r1.append(r2)
            long r4 = r8.f1013a
            r1.append(r4)
            r1.append(r3)
            long r4 = r8.f1014b
            r1.append(r4)
            r1.append(r3)
            java.lang.String r9 = java.lang.Integer.toHexString(r0)
            r1.append(r9)
            r1.append(r3)
            int r8 = r8.f1016d
            java.lang.String r8 = java.lang.Integer.toHexString(r8)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            android.ext.e1.d(r8)
        Lc0:
            return
    }

    public static int t(java.lang.String r2, int r3, boolean r4) {
            android.ext.i2$a r2 = v(r2, r3, r4)     // Catch: java.lang.NumberFormatException -> L1c
            int[] r3 = r2.f1011c     // Catch: java.lang.NumberFormatException -> L1c
            int r3 = r3.length     // Catch: java.lang.NumberFormatException -> L1c
            int r3 = r3 + (-1)
            r4 = 0
            r0 = 0
        Lb:
            if (r4 >= r3) goto L19
            int[] r1 = r2.f1011c     // Catch: java.lang.NumberFormatException -> L1c
            r1 = r1[r4]     // Catch: java.lang.NumberFormatException -> L1c
            int r1 = android.ext.c.E(r1)     // Catch: java.lang.NumberFormatException -> L1c
            int r0 = r0 + r1
            int r4 = r4 + 1
            goto Lb
        L19:
            int r0 = r0 + 1
            goto L1d
        L1c:
            r0 = 2
        L1d:
            return r0
    }

    private static android.ext.i2.a v(java.lang.String r8, int r9, boolean r10) {
            java.lang.String r8 = r8.trim()
            if (r10 == 0) goto L9
            java.lang.String r10 = "::"
            goto Lb
        L9:
            java.lang.String r10 = ":"
        Lb:
            java.lang.String[] r8 = r8.split(r10)
            int r0 = r8.length
            r1 = 2
            if (r0 > r1) goto Lf3
            int r10 = r8.length
            r0 = 1
            if (r10 != r0) goto L1a
            r2 = 512(0x200, double:2.53E-321)
            goto L22
        L1a:
            r10 = r8[r0]
            android.ext.t1$b r10 = android.ext.t1.x(r10)
            long r2 = r10.f1261a
        L22:
            int r10 = (int) r2
            r2 = 65536(0x10000, float:9.1835E-41)
            r3 = 0
            if (r10 < r1) goto Lba
            if (r10 > r2) goto Lba
            r8 = r8[r3]
            java.lang.String r0 = ";"
            java.lang.String[] r8 = r8.split(r0)
            int r0 = r8.length
            if (r0 < r1) goto Lad
            int r0 = r8.length
            r1 = 64
            if (r0 > r1) goto L8c
            android.ext.i2$a r0 = new android.ext.i2$a
            int r1 = r8.length
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L42:
            int r4 = r8.length
            if (r2 >= r4) goto L89
            r4 = r8[r2]
            r5 = 126(0x7e, float:1.77E-43)
            int r4 = r4.indexOf(r5)
            r5 = -1
            if (r4 == r5) goto L6e
            r4 = r8[r2]
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            android.ext.i2$b r4 = w(r1, r4, r9, r5)
            long[] r5 = r0.f1009a
            long r6 = r4.f1013a
            r5[r2] = r6
            long[] r5 = r0.f1010b
            long r6 = r4.f1014b
            r5[r2] = r6
            int[] r5 = r0.f1011c
            int r6 = r4.f1015c
            int r4 = r4.f1016d
            r4 = r4 | r6
            r5[r2] = r4
            goto L86
        L6e:
            r4 = r8[r2]
            android.ext.t1$b r1 = android.ext.t1.o(r1, r4, r9, r3)
            long[] r4 = r0.f1009a
            long r5 = r1.f1261a
            r4[r2] = r5
            long[] r4 = r0.f1010b
            r5 = 0
            r4[r2] = r5
            int[] r4 = r0.f1011c
            int r5 = r1.f1263c
            r4[r2] = r5
        L86:
            int r2 = r2 + 1
            goto L42
        L89:
            r0.f1012d = r10
            return r0
        L8c:
            java.lang.NumberFormatException r8 = new java.lang.NumberFormatException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = 2131297017(0x7f0902f9, float:1.8211967E38)
            java.lang.String r10 = android.ext.Tools.N1(r10)
            r9.append(r10)
            java.lang.String r10 = ": "
            r9.append(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Lad:
            java.lang.NumberFormatException r8 = new java.lang.NumberFormatException
            r9 = 2131297051(0x7f09031b, float:1.8212036E38)
            java.lang.String r9 = android.ext.b2.f(r9)
            r8.<init>(r9)
            throw r8
        Lba:
            android.ext.t1$a r8 = new android.ext.t1$a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r4 = 2131296712(0x7f0901c8, float:1.8211348E38)
            java.lang.String r4 = android.ext.b2.f(r4)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5[r3] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r5[r0] = r1
            java.lang.String r0 = android.ext.Tools.L1(r4, r5)
            r9.append(r0)
            r0 = 32
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            r9 = 65536(0x10000, double:3.2379E-319)
            r8.a(r9)
            throw r8
        Lf3:
            java.lang.NumberFormatException r8 = new java.lang.NumberFormatException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r0 = 2131297016(0x7f0902f8, float:1.8211965E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            r9.append(r0)
            java.lang.String r0 = " '"
            r9.append(r0)
            r9.append(r10)
            r10 = 39
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    public static android.ext.i2.b w(android.ext.t1.b r10, java.lang.String r11, int r12, int r13) {
            java.lang.String r11 = r11.trim()
            java.lang.String r0 = "~~"
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto L16
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            if (r13 != r1) goto L13
            r13 = 268435456(0x10000000, float:2.524355E-29)
            goto L18
        L13:
            r13 = 536870912(0x20000000, float:1.0842022E-19)
            goto L18
        L16:
            java.lang.String r0 = "~"
        L18:
            java.lang.String[] r1 = r11.split(r0)
            int r2 = r1.length
            r3 = 2
            if (r2 > r3) goto Ld3
            int r0 = r1.length
            if (r0 == r3) goto L2a
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r3)
            r1 = r0
            java.lang.String[] r1 = (java.lang.String[]) r1
        L2a:
            long[] r0 = new long[r3]
            int[] r2 = new int[r3]
            r4 = 1
            r5 = 1
        L30:
            r6 = 127(0x7f, float:1.78E-43)
            java.lang.String r7 = ""
            r8 = 0
            if (r5 < 0) goto L75
            r9 = r1[r5]
            if (r9 != 0) goto L3c
            goto L40
        L3c:
            java.lang.String r7 = r9.trim()
        L40:
            if (r5 != r4) goto L44
            r9 = r12
            goto L46
        L44:
            r9 = r2[r4]
        L46:
            android.ext.t1$b r10 = android.ext.t1.o(r10, r7, r9, r8)
            if (r12 != r6) goto L6a
            int r6 = r10.f1263c
            r8 = 64
            if (r6 != r8) goto L6a
            int r6 = r7.length()
            int r6 = r6 - r4
            char r6 = r7.charAt(r6)
            java.lang.String r7 = "BWDXFQEAbwdxfqea"
            int r6 = r7.indexOf(r6)
            r7 = -1
            if (r6 != r7) goto L6a
            int r6 = r10.f1263c
            r6 = r6 | 16
            r10.f1263c = r6
        L6a:
            long r6 = r10.f1261a
            r0[r5] = r6
            int r6 = r10.f1263c
            r2[r5] = r6
            int r5 = r5 + (-1)
            goto L30
        L75:
            r10 = r2[r8]
            r1 = r2[r4]
            r10 = r10 & r1
            if (r10 != 0) goto L97
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r5 = 2131296881(0x7f090271, float:1.8211691E38)
            java.lang.String r5 = android.ext.b2.f(r5)
            r1.append(r5)
            r5 = 10
            r1.append(r5)
            java.lang.String r7 = r1.toString()
        L97:
            int r1 = r7.length()
            if (r1 > 0) goto Lcd
            if (r12 != r6) goto Lb8
            r12 = r10 & 32
            if (r12 != 0) goto Lb8
            r12 = 0
        La4:
            if (r12 >= r3) goto Lb8
            r1 = r2[r12]
            r1 = r1 & 32
            if (r1 == 0) goto Lb5
            r5 = r0[r12]
            double r5 = (double) r5
            long r5 = java.lang.Double.doubleToRawLongBits(r5)
            r0[r12] = r5
        Lb5:
            int r12 = r12 + 1
            goto La4
        Lb8:
            android.ext.i2$b r12 = new android.ext.i2$b
            r12.<init>()
            r1 = r0[r8]
            r12.f1013a = r1
            r1 = r0[r4]
            r12.f1014b = r1
            r12.f1015c = r10
            r12.f1016d = r13
            s(r12, r11)
            return r12
        Lcd:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            r10.<init>(r7)
            throw r10
        Ld3:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r12 = 2131297016(0x7f0902f8, float:1.8211965E38)
            java.lang.String r12 = android.ext.b2.f(r12)
            r11.append(r12)
            java.lang.String r12 = " '"
            r11.append(r12)
            r11.append(r0)
            r12 = 39
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
    }

    public static android.ext.i2.c x(java.lang.String r9, boolean r10) {
            boolean r0 = android.ext.t1.m(r9)
            r1 = 0
            if (r0 != 0) goto L78
            int r0 = android.ext.t1.C(r9)
            if (r0 != 0) goto L78
            r0 = 88
            int r0 = r9.indexOf(r0)
            r2 = -1
            if (r0 != r2) goto L1e
            r0 = 120(0x78, float:1.68E-43)
            int r0 = r9.indexOf(r0)
            if (r0 == r2) goto L78
        L1e:
            android.ext.i2$c r0 = new android.ext.i2$c
            r0.<init>()
            java.lang.String r2 = "[Xx]"
            java.lang.String[] r9 = r9.split(r2)
            int r2 = r9.length
            java.lang.String r3 = ""
            r4 = 2
            r5 = 1
            if (r2 != r4) goto L33
            r2 = r9[r5]
            goto L34
        L33:
            r2 = r3
        L34:
            r6 = 0
            android.ext.t1$b r1 = android.ext.t1.o(r1, r2, r4, r6)
            long r7 = r1.f1261a
            int r1 = (int) r7
            int r4 = r9.length
            if (r4 <= 0) goto L41
            r3 = r9[r6]
        L41:
            r0.f1017a = r3
            if (r10 == 0) goto L75
            if (r1 < r5) goto L4c
            r9 = 4096(0x1000, float:5.74E-42)
            if (r1 > r9) goto L4c
            goto L75
        L4c:
            android.ext.t1$a r9 = new android.ext.t1$a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r0 = 2131296830(0x7f09023e, float:1.8211588E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r6] = r2
            java.lang.String r0 = android.ext.Tools.L1(r0, r1)
            r10.append(r0)
            java.lang.String r0 = " [1; 4096]"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            r9.c(r2)
            throw r9
        L75:
            r0.f1018b = r1
            r1 = r0
        L78:
            return r1
    }

    private static boolean z(byte r16, long[] r17, long[] r18, int[] r19, int r20, int r21, long r22, long r24, boolean r26, long r27) {
            r13 = r16
            r14 = r19
            android.ext.MainService r0 = android.ext.MainService.instance
            boolean r1 = r0.a1()
            if (r1 == 0) goto L52
            long r1 = r0.p0
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L19
            if (r26 == 0) goto L19
            r0.n(r13)
        L19:
            long r1 = r0.p0
            r15 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L27
            r0.q0 = r15
            android.ext.f0 r1 = r0.i
            r1.x0(r13)
        L27:
            r0.Q()
            r0.r0 = r15
            android.ext.f0 r0 = r0.i
            r1 = r16
            r2 = r21
            r3 = r20
            r4 = r19
            r5 = r17
            r6 = r18
            r7 = r22
            r9 = r24
            r11 = r27
            r0.n0(r1, r2, r3, r4, r5, r6, r7, r9, r11)
            r0 = 0
            r1 = 0
        L45:
            int r2 = r14.length
            if (r0 >= r2) goto L4e
            r2 = r14[r0]
            r1 = r1 | r2
            int r0 = r0 + 1
            goto L45
        L4e:
            android.ext.MainService.N0(r1, r13)
            return r15
        L52:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 2131296305(0x7f090031, float:1.8210523E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.<init>(r1)
            throw r0
    }

    @Override // android.ext.j2
    public void j(android.content.DialogInterface r12, int r13) {
            r11 = this;
            android.ext.Searcher r12 = r11.j
            java.lang.String r0 = r12.f()
            android.ext.Searcher r12 = r11.j
            boolean r2 = r12.p()
            android.ext.Searcher r12 = r11.j
            int r3 = r12.i()
            android.ext.Searcher r12 = r11.j
            r1 = 0
            long r4 = r12.e(r1)
            android.ext.Searcher r12 = r11.j
            r6 = 1
            long r7 = r12.e(r6)
            int r12 = r11.i
            r9 = -3
            if (r12 != r9) goto L27
            r12 = 1
            goto L28
        L27:
            r12 = 0
        L28:
            android.ext.Searcher r1 = r11.j
            long r9 = r1.b()
            r1 = r13
            r6 = r7
            r8 = r12
            q(r0, r1, r2, r3, r4, r6, r8, r9)
            return
    }

    @Override // android.ext.j2, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r2) {
            r1 = this;
            android.ext.Searcher r0 = r1.j
            java.lang.String r0 = r0.f()
            r1.f1037f = r0
            android.ext.Searcher r0 = r1.j
            int r0 = r0.i()
            r1.f1038g = r0
            android.ext.Searcher r0 = r1.j
            int r0 = r0.j()
            android.ext.MainService.O0 = r0
            super.onDismiss(r2)
            return
    }

    public void u(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            java.lang.String r1 = ""
        L4:
            r0.f1037f = r1
            android.widget.ImageView r1 = r0.a()
            r1.performClick()
            return
    }

    public void y(java.lang.String r3) {
            r2 = this;
            android.widget.ImageView r0 = r2.a()
            r0.performClick()
            android.ext.Searcher r0 = r2.j
            android.ext.MemoryRange r0 = r0.y
            r1 = 2
            r0.setType(r1)
            r0.setAddress(r3)
            return
    }
}
