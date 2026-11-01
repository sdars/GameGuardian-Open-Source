package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static java.lang.String f1251a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char f1252b = '.';

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f1253c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static java.nio.charset.Charset f1254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static java.nio.charset.Charset f1255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int[] f1256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static java.util.regex.Pattern f1257g;

    static class a extends java.lang.NumberFormatException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.util.ArrayList f1258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f1259b;

        /* JADX INFO: renamed from: android.ext.t1$a$a, reason: collision with other inner class name */
        class C0021a implements java.util.Comparator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.t1.a f1260a;

            C0021a(android.ext.t1.a r1) {
                    r0 = this;
                    r0.f1260a = r1
                    r0.<init>()
                    return
            }

            public int a(java.lang.String r1, java.lang.String r2) {
                    r0 = this;
                    int r2 = r2.length()
                    int r1 = r1.length()
                    int r2 = r2 - r1
                    return r2
            }

            @Override // java.util.Comparator
            public /* bridge */ /* synthetic */ int compare(java.lang.Object r1, java.lang.Object r2) {
                    r0 = this;
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.String r2 = (java.lang.String) r2
                    int r1 = r0.a(r1, r2)
                    return r1
            }
        }

        public a(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.f1258a = r1
                r0.f1259b = r1
                return
        }

        void a(long r4) {
                r3 = this;
                java.lang.String r0 = "__d__"
                java.lang.String r0 = android.ext.b2.g(r0)
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r1[r2] = r4
                java.lang.String r4 = android.ext.Tools.L1(r0, r1)
                r3.c(r4)
                return
        }

        void b(java.lang.Object r4) {
                r3 = this;
                java.lang.String r0 = "__d__"
                java.lang.String r0 = android.ext.b2.g(r0)
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                java.lang.String r4 = android.ext.Tools.L1(r0, r1)
                r3.c(r4)
                return
        }

        void c(java.lang.String r2) {
                r1 = this;
                java.util.ArrayList r0 = r1.f1258a
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f1258a = r0
            Lb:
                r0.add(r2)
                return
        }

        void d() {
                r9 = this;
                java.lang.String r0 = r9.f1259b
                if (r0 == 0) goto L5
                return
            L5:
                java.lang.String r0 = r9.getMessage()
                if (r0 != 0) goto Lc
                return
            Lc:
                r1 = 2131296757(0x7f0901f5, float:1.821144E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                int r1 = r0.indexOf(r1)
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L21
                java.lang.String r0 = r0.substring(r3, r1)
                r4 = 1
                goto L22
            L21:
                r4 = 0
            L22:
                java.util.ArrayList r5 = r9.f1258a
                if (r5 == 0) goto L59
                android.ext.t1$a$a r6 = new android.ext.t1$a$a
                r6.<init>(r9)
                java.util.Collections.sort(r5, r6)
                java.util.Iterator r5 = r5.iterator()
            L32:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L59
                java.lang.Object r6 = r5.next()
                java.lang.String r6 = (java.lang.String) r6
                if (r6 != 0) goto L41
                goto L32
            L41:
                java.lang.String r7 = android.ext.Script.E3(r6)
                boolean r8 = r6.equals(r7)
                if (r8 == 0) goto L4c
                goto L32
            L4c:
                int r8 = r0.indexOf(r6)
                if (r8 >= 0) goto L53
                goto L32
            L53:
                java.lang.String r0 = r0.replace(r6, r7)
                r4 = 1
                goto L32
            L59:
                if (r1 <= 0) goto L97
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r0 = 2131296756(0x7f0901f4, float:1.8211438E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                r1.append(r0)
                java.lang.String r0 = " (en_US):\n"
                r1.append(r0)
                r0 = 2131296755(0x7f0901f3, float:1.8211436E38)
                java.lang.String r0 = android.ext.t1.z(r0)
                r5 = 2
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = 46
                java.lang.Character r6 = java.lang.Character.valueOf(r6)
                r5[r3] = r6
                r3 = 44
                java.lang.Character r3 = java.lang.Character.valueOf(r3)
                r5[r2] = r3
                java.lang.String r0 = android.ext.Tools.L1(r0, r5)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
            L97:
                if (r4 == 0) goto L9b
                r9.f1259b = r0
            L9b:
                return
        }

        @Override // java.lang.Throwable
        public java.lang.String getMessage() {
                r1 = this;
                java.lang.String r0 = r1.f1259b
                if (r0 == 0) goto L5
                goto L9
            L5:
                java.lang.String r0 = super.getMessage()
            L9:
                return r0
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1263c;

        public b() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f1261a = r0
                r0 = 0
                r2.f1262b = r0
                r2.f1263c = r0
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
                long r1 = r3.f1261a
                r0.append(r1)
                java.lang.String r1 = " 0x"
                r0.append(r1)
                int r1 = r3.f1263c
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            updateLocale()
            java.lang.Class<android.ext.t1> r0 = android.ext.t1.class
            android.ext.k.h(r0)
            r0 = 0
            android.ext.t1.f1254d = r0
            android.ext.t1.f1255e = r0
            android.ext.t1.f1256f = r0
            android.ext.t1.f1257g = r0
            return
    }

    private static void A(android.ext.t1.b r11) {
            int[] r0 = android.ext.t1.f1256f
            r1 = 1
            r2 = 8
            r3 = 0
            if (r0 != 0) goto L32
            int[] r0 = new int[r2]
            r0[r3] = r1
            int r4 = android.ext.c.E(r1)
            r0[r1] = r4
            r4 = 2
            r0[r4] = r4
            r5 = 3
            int r4 = android.ext.c.E(r4)
            r0[r5] = r4
            r4 = 4
            r0[r4] = r4
            r5 = 5
            int r4 = android.ext.c.E(r4)
            r0[r5] = r4
            r4 = 6
            r0[r4] = r2
            r4 = 7
            int r5 = android.ext.c.E(r2)
            r0[r4] = r5
            android.ext.t1.f1256f = r0
        L32:
            int r4 = r0.length
            r5 = 0
        L34:
            if (r3 >= r4) goto L61
            int r6 = r3 + 1
            r6 = r0[r6]
            boolean r7 = r11.f1262b
            if (r7 == 0) goto L4c
            long r7 = r11.f1261a
            int r6 = r6 * 8
            int r6 = r6 - r1
            long r7 = r7 >> r6
            r9 = -1
            long r9 = r9 >> r6
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 == 0) goto L5b
            goto L5e
        L4c:
            if (r6 == r2) goto L5b
            long r7 = r11.f1261a
            int r6 = r6 * 8
            long r6 = r7 >> r6
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L5b
            goto L5e
        L5b:
            r6 = r0[r3]
            r5 = r5 | r6
        L5e:
            int r3 = r3 + 2
            goto L34
        L61:
            r0 = r5 | 32
            r11.f1263c = r0
            return
    }

    public static long B(java.lang.String r8) {
            int r0 = r8.length()
            r1 = 2
            r2 = 0
            if (r0 >= r1) goto La
            return r2
        La:
            r0 = 0
            char r1 = r8.charAt(r0)
            r4 = 59
            if (r1 != r4) goto L30
            int r0 = r8.length()
            r1 = 5
            if (r0 <= r1) goto L1b
            r0 = 5
        L1b:
            r1 = 1
        L1c:
            if (r1 >= r0) goto L4a
            char r4 = r8.charAt(r1)
            long r4 = (long) r4
            r6 = 65535(0xffff, double:3.23786E-319)
            long r4 = r4 & r6
            int r6 = r1 + (-1)
            int r6 = r6 * 16
            long r4 = r4 << r6
            long r2 = r2 | r4
            int r1 = r1 + 1
            goto L1c
        L30:
            byte[] r8 = h(r8)
            int r1 = r8.length
            r4 = 8
            if (r1 <= r4) goto L3b
            r1 = 8
        L3b:
            if (r0 >= r1) goto L4a
            r4 = r8[r0]
            long r4 = (long) r4
            r6 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r6
            int r6 = r0 * 8
            long r4 = r4 << r6
            long r2 = r2 | r4
            int r0 = r0 + 1
            goto L3b
        L4a:
            return r2
    }

    public static int C(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
            r2 = 2
            if (r0 <= r2) goto L29
            char r0 = r4.charAt(r1)
            r3 = 126(0x7e, float:1.77E-43)
            if (r0 != r3) goto L29
            r0 = 1
            char r4 = r4.charAt(r0)
            r0 = 65
            if (r4 == r0) goto L27
            r0 = 84
            if (r4 == r0) goto L26
            r0 = 97
            if (r4 == r0) goto L27
            r0 = 116(0x74, float:1.63E-43)
            if (r4 == r0) goto L26
            goto L29
        L26:
            return r2
        L27:
            r4 = 4
            return r4
        L29:
            return r1
    }

    private static byte[] a(byte[] r6, java.lang.String r7) {
            java.lang.String r0 = " "
            java.lang.String r1 = ""
            java.lang.String r7 = r7.replace(r0, r1)
            java.lang.String r0 = "\t"
            java.lang.String r7 = r7.replace(r0, r1)
            java.lang.String r0 = "\r"
            java.lang.String r7 = r7.replace(r0, r1)
            java.lang.String r0 = "\n"
            java.lang.String r7 = r7.replace(r0, r1)
            int r0 = r7.length()
            r1 = 2
            if (r0 >= r1) goto L22
            return r6
        L22:
            int r0 = r7.length()
            r0 = r0 & (-2)
            int r1 = r6.length
            int r2 = r0 / 2
            int r2 = r2 + r1
            byte[] r6 = java.util.Arrays.copyOf(r6, r2)
            r2 = 0
        L31:
            if (r2 >= r0) goto L47
            int r3 = r2 / 2
            int r3 = r3 + r1
            int r4 = r2 + 2
            java.lang.String r2 = r7.substring(r2, r4)
            r5 = 16
            int r2 = java.lang.Integer.parseInt(r2, r5)
            byte r2 = (byte) r2
            r6[r3] = r2
            r2 = r4
            goto L31
        L47:
            return r6
    }

    private static java.lang.String b(java.lang.String r3, boolean r4) {
            r0 = 2131296699(0x7f0901bb, float:1.8211322E38)
            if (r3 == 0) goto Lac
            boolean r1 = m(r3)
            if (r1 != 0) goto Lab
            int r1 = C(r3)
            if (r1 == 0) goto L13
            goto Lab
        L13:
            java.lang.String r3 = r3.trim()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r1)
            if (r4 == 0) goto L23
            java.lang.String r3 = e(r3)
        L23:
            int r4 = r3.length()
            if (r4 == 0) goto La1
            int r4 = android.ext.Config.B
            r4 = r4 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto La0
            java.util.regex.Pattern r4 = android.ext.t1.f1257g
            if (r4 != 0) goto L5b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r0.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "[^\\p{XDigit}"
            r0.append(r1)     // Catch: java.lang.Throwable -> L57
            char r1 = android.ext.t1.f1252b     // Catch: java.lang.Throwable -> L57
            r0.append(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = android.ext.t1.f1251a     // Catch: java.lang.Throwable -> L57
            r0.append(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = ".hrwxqHRWXQ~?*^$:;-]+"
            r0.append(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L57
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r0)     // Catch: java.lang.Throwable -> L57
            android.ext.t1.f1257g = r4     // Catch: java.lang.Throwable -> L57
            goto L5b
        L57:
            r0 = move-exception
            android.ext.e1.a(r0)
        L5b:
            if (r4 == 0) goto La0
            java.util.regex.Matcher r0 = r4.matcher(r3)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r1 = ""
            java.lang.String r0 = r0.replaceAll(r1)     // Catch: java.lang.Throwable -> L9c
            boolean r1 = r0.equals(r3)     // Catch: java.lang.Throwable -> L9c
            if (r1 != 0) goto La0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9c
            r1.<init>()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r2 = "strip: '"
            r1.append(r2)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r4 = r4.pattern()     // Catch: java.lang.Throwable -> L9c
            r1.append(r4)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r4 = "': '"
            r1.append(r4)     // Catch: java.lang.Throwable -> L9c
            r1.append(r3)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r4 = "' -> '"
            r1.append(r4)     // Catch: java.lang.Throwable -> L9c
            r1.append(r0)     // Catch: java.lang.Throwable -> L9c
            r4 = 39
            r1.append(r4)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L9c
            android.ext.e1.d(r4)     // Catch: java.lang.Throwable -> L9c
            r3 = r0
            goto La0
        L9c:
            r4 = move-exception
            android.ext.e1.a(r4)
        La0:
            return r3
        La1:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            java.lang.String r4 = z(r0)
            r3.<init>(r4)
            throw r3
        Lab:
            return r3
        Lac:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            java.lang.String r4 = z(r0)
            r3.<init>(r4)
            throw r3
    }

    private static android.ext.t1.b c(android.ext.t1.b r7, int r8, int r9) {
            r0 = 127(0x7f, float:1.78E-43)
            r9 = r9 & r0
            r1 = 1
            if (r9 == r1) goto L5e
            r2 = 2
            if (r9 == r2) goto L5e
            r2 = 4
            if (r9 == r2) goto L5e
            r2 = 8
            if (r9 == r2) goto L5e
            r2 = 16
            if (r9 == r2) goto L47
            r2 = 32
            if (r9 == r2) goto L5e
            r2 = 64
            if (r9 == r2) goto L3d
            if (r9 == r0) goto L37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown flags: "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = " we use Auto parsing"
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            android.ext.e1.p(r9)
        L37:
            long r2 = (long) r8
            r7.f1261a = r2
            r7.f1263c = r0
            goto L63
        L3d:
            double r3 = (double) r8
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
        L42:
            r7.f1261a = r3
            r7.f1263c = r2
            goto L63
        L47:
            float r9 = (float) r8
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r3 = (long) r9
            r5 = 0
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 >= 0) goto L42
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r3 = r3 & r5
            r5 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r3 = r3 + r5
            goto L42
        L5e:
            long r2 = (long) r8
            r7.f1261a = r2
            r7.f1263c = r9
        L63:
            if (r8 >= 0) goto L66
            goto L67
        L66:
            r1 = 0
        L67:
            r7.f1262b = r1
            return r7
    }

    public static java.lang.String d(java.lang.String r3) {
            int r0 = r3.length()
            if (r0 <= 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            char r3 = r3.charAt(r1)
            r0.append(r3)
            r1 = 58
            r2 = 2131297005(0x7f0902ed, float:1.8211943E38)
            if (r3 == r1) goto L5a
            r1 = 59
            if (r3 == r1) goto L50
            r1 = 72
            if (r3 == r1) goto L4d
            r1 = 81
            if (r3 == r1) goto L2f
            r1 = 104(0x68, float:1.46E-43)
            if (r3 == r1) goto L4d
            r1 = 113(0x71, float:1.58E-43)
            if (r3 == r1) goto L2f
            goto L64
        L2f:
            java.lang.String r3 = " DF 59 '"
            r0.append(r3)
            java.lang.String r3 = android.ext.b2.f(r2)
            r0.append(r3)
            java.lang.String r3 = " UTF-8' 37 5F \""
            r0.append(r3)
            java.lang.String r3 = android.ext.b2.f(r2)
            r0.append(r3)
            java.lang.String r3 = " UTF-16LE\" 48 00"
        L49:
            r0.append(r3)
            goto L64
        L4d:
            java.lang.String r3 = " DF 59 37 5F 00"
            goto L49
        L50:
            java.lang.String r3 = android.ext.b2.f(r2)
            r0.append(r3)
            java.lang.String r3 = " UTF-16LE"
            goto L49
        L5a:
            java.lang.String r3 = android.ext.b2.f(r2)
            r0.append(r3)
            java.lang.String r3 = " UTF-8"
            goto L49
        L64:
            java.lang.String r3 = r0.toString()
            return r3
        L69:
            java.lang.String r3 = ""
            return r3
    }

    public static java.lang.String e(java.lang.String r2) {
            java.lang.String r0 = " "
            java.lang.String r1 = ""
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = " "
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = android.ext.t1.f1251a
            java.lang.String r2 = r2.replace(r0, r1)
            boolean r0 = android.ext.t1.f1253c
            if (r0 == 0) goto L20
            char r0 = android.ext.t1.f1252b
            r1 = 46
            java.lang.String r2 = r2.replace(r0, r1)
        L20:
            return r2
    }

    public static java.lang.String f(java.lang.String r2) {
            java.lang.String r0 = " "
            java.lang.String r1 = ""
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = " "
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = ","
            java.lang.String r2 = r2.replace(r0, r1)
            boolean r0 = android.ext.t1.f1253c
            if (r0 == 0) goto L20
            r0 = 46
            char r1 = android.ext.t1.f1252b
            java.lang.String r2 = r2.replace(r0, r1)
        L20:
            return r2
    }

    public static byte[] g(long r6) {
            r0 = 9
            byte[] r0 = new byte[r0]
            r1 = -1
            r2 = 0
        L6:
            r3 = 8
            if (r2 >= r3) goto L1a
            r4 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r6
            int r5 = (int) r4
            byte r4 = (byte) r5
            r0[r2] = r4
            if (r4 == 0) goto L16
            if (r1 >= r2) goto L16
            r1 = r2
        L16:
            long r6 = r6 >> r3
            int r2 = r2 + 1
            goto L6
        L1a:
            byte r6 = (byte) r1
            r0[r3] = r6
            return r0
    }

    public static byte[] h(java.lang.CharSequence r12) {
            int r0 = r12.length()
            r1 = 1
            if (r0 >= r1) goto La
            byte[] r12 = d.b.f1511c
            return r12
        La:
            r0 = 0
            char r2 = r12.charAt(r0)
            byte[] r3 = d.b.f1511c
            boolean r4 = r12 instanceof java.lang.String
            if (r4 != 0) goto L1b
            boolean r4 = r12 instanceof android.text.Editable
            if (r4 == 0) goto L1b
            r4 = 1
            goto L1c
        L1b:
            r4 = 0
        L1c:
            r5 = 59
            if (r2 == r5) goto Ld2
            r5 = 72
            if (r2 == r5) goto Lc5
            r5 = 81
            if (r2 == r5) goto L33
            r5 = 104(0x68, float:1.46E-43)
            if (r2 == r5) goto Lc5
            r5 = 113(0x71, float:1.58E-43)
            if (r2 == r5) goto L33
            r2 = 0
            goto Ld3
        L33:
            r2 = 1
            r5 = 0
            r6 = 1
        L36:
            int r7 = r12.length()
            if (r2 >= r7) goto Lc4
            char r7 = r12.charAt(r2)
            r8 = 34
            r9 = 0
            if (r5 != 0) goto L4c
            r10 = 39
            if (r7 == r10) goto L4e
            if (r7 != r8) goto L5f
            goto L4e
        L4c:
            if (r7 != r5) goto L5f
        L4e:
            if (r6 == r2) goto L58
            java.lang.String r9 = r12.toString()
            java.lang.String r9 = r9.substring(r6, r2)
        L58:
            if (r5 != 0) goto L5b
            goto L5c
        L5b:
            r7 = 0
        L5c:
            int r6 = r2 + 1
            goto L6f
        L5f:
            int r7 = r12.length()
            int r7 = r7 - r1
            if (r2 != r7) goto L6e
            java.lang.String r7 = r12.toString()
            java.lang.String r9 = r7.substring(r6)
        L6e:
            r7 = r5
        L6f:
            if (r9 == 0) goto Lc0
            int r10 = r9.length()
            if (r10 <= 0) goto Lc0
            if (r5 != 0) goto L80
            if (r4 != 0) goto Lc0
            byte[] r3 = a(r3, r9)
            goto Lc0
        L80:
            if (r5 != r8) goto L84
            r5 = 1
            goto L85
        L84:
            r5 = 0
        L85:
            java.nio.charset.Charset r5 = i(r5)
            byte[] r5 = r9.getBytes(r5)
            if (r4 == 0) goto Lb5
            int r8 = r5.length
            java.lang.String r5 = android.ext.InOut.b(r5, r0, r8)
            java.lang.String r5 = r5.trim()
            r8 = r12
            android.text.Editable r8 = (android.text.Editable) r8
            int r10 = r9.length()
            int r10 = r2 - r10
            int r10 = r10 - r1
            int r11 = r2 + 1
            r8.replace(r10, r11, r5)
            int r5 = r5.length()
            int r8 = r9.length()
            int r8 = r8 + 2
            int r5 = r5 - r8
            int r2 = r2 + r5
            int r6 = r6 + r5
            goto Lc0
        Lb5:
            int r8 = r3.length
            int r9 = r5.length
            int r9 = r9 + r8
            byte[] r3 = java.util.Arrays.copyOf(r3, r9)
            int r9 = r5.length
            java.lang.System.arraycopy(r5, r0, r3, r8, r9)
        Lc0:
            int r2 = r2 + r1
            r5 = r7
            goto L36
        Lc4:
            return r3
        Lc5:
            java.lang.String r12 = r12.toString()
            java.lang.String r12 = r12.substring(r1)
            byte[] r12 = a(r3, r12)
            return r12
        Ld2:
            r2 = 1
        Ld3:
            java.lang.String r3 = r12.toString()
            java.lang.String r3 = r3.substring(r1)
            java.nio.charset.Charset r2 = i(r2)
            byte[] r2 = r3.getBytes(r2)
            if (r4 == 0) goto L109
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 32
            r3.append(r4)
            int r4 = r2.length
            java.lang.String r0 = android.ext.InOut.b(r2, r0, r4)
            java.lang.String r0 = r0.trim()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r3 = r12
            android.text.Editable r3 = (android.text.Editable) r3
            int r12 = r12.length()
            r3.replace(r1, r12, r0)
        L109:
            return r2
    }

    public static java.nio.charset.Charset i(boolean r1) {
            if (r1 == 0) goto L5
            java.nio.charset.Charset r0 = android.ext.t1.f1255e
            goto L7
        L5:
            java.nio.charset.Charset r0 = android.ext.t1.f1254d
        L7:
            if (r0 != 0) goto L14
            if (r1 == 0) goto L10
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            android.ext.t1.f1255e = r0
            goto L14
        L10:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            android.ext.t1.f1254d = r0
        L14:
            return r0
    }

    private static java.lang.NumberFormatException j(java.lang.String r3, java.lang.String r4, int r5, boolean r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 2131296717(0x7f0901cd, float:1.8211359E38)
            java.lang.String r1 = z(r1)
            r0.append(r1)
            java.lang.String r1 = " '"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "'."
            r0.append(r1)
            r1 = 10
            java.lang.String r2 = "\n\n"
            if (r5 != r1) goto L37
            java.lang.String r5 = ".*[A-Fa-f]+.*"
            boolean r5 = r3.matches(r5)
            if (r5 == 0) goto L37
            r0.append(r2)
            r5 = 2131296470(0x7f0900d6, float:1.8210858E38)
            java.lang.String r5 = z(r5)
            r0.append(r5)
        L37:
            if (r6 == 0) goto L4f
            char r5 = android.ext.t1.f1252b
            int r3 = r3.indexOf(r5)
            r5 = -1
            if (r3 == r5) goto L4f
            r0.append(r2)
            r3 = 2131296707(0x7f0901c3, float:1.8211338E38)
            java.lang.String r3 = z(r3)
            r0.append(r3)
        L4f:
            r0.append(r2)
            r3 = 2131296757(0x7f0901f5, float:1.821144E38)
            java.lang.String r3 = z(r3)
            r0.append(r3)
            java.lang.String r3 = " ("
            r0.append(r3)
            java.lang.String r3 = android.ext.k.b()
            r0.append(r3)
            java.lang.String r3 = "):\n"
            r0.append(r3)
            r3 = 2131296755(0x7f0901f3, float:1.8211436E38)
            java.lang.String r3 = z(r3)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            char r6 = android.ext.t1.f1252b
            java.lang.Character r6 = java.lang.Character.valueOf(r6)
            r1 = 0
            r5[r1] = r6
            r6 = 1
            java.lang.String r1 = android.ext.t1.f1251a
            r5[r6] = r1
            java.lang.String r3 = android.ext.Tools.L1(r3, r5)
            r0.append(r3)
            android.ext.t1$a r3 = new android.ext.t1$a
            java.lang.String r5 = r0.toString()
            r3.<init>(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "'"
            r5.append(r6)
            r5.append(r4)
            r5.append(r6)
            java.lang.String r4 = r5.toString()
            r3.c(r4)
            return r3
    }

    public static java.lang.Object[] k() {
            r0 = 1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.math.BigInteger r3 = new java.math.BigInteger     // Catch: java.lang.ArithmeticException -> L1e
            java.lang.String r4 = java.lang.Long.toString(r1)     // Catch: java.lang.ArithmeticException -> L1e
            r3.<init>(r4)     // Catch: java.lang.ArithmeticException -> L1e
            java.math.BigInteger r4 = java.math.BigInteger.ONE     // Catch: java.lang.ArithmeticException -> L1e
            java.math.BigInteger r3 = r3.add(r4)     // Catch: java.lang.ArithmeticException -> L1e
            java.math.BigInteger r3 = r3.shiftLeft(r0)     // Catch: java.lang.ArithmeticException -> L1e
            java.math.BigInteger r1 = r3.subtract(r4)     // Catch: java.lang.ArithmeticException -> L1e
            goto L28
        L1e:
            r3 = move-exception
            java.lang.String r4 = "Error get possible range for long as BigInteger"
            android.ext.e1.l(r4, r3)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L28:
            r2 = 8
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = -128(0xffffffffffffff80, float:NaN)
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            r3 = 255(0xff, double:1.26E-321)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r0] = r3
            r0 = -32768(0xffffffffffff8000, float:NaN)
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            r3 = 2
            r2[r3] = r0
            r3 = 65535(0xffff, double:3.23786E-319)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r3 = 3
            r2[r3] = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 4
            r2[r3] = r0
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r3 = 5
            r2[r3] = r0
            r3 = -9223372036854775808
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r3 = 6
            r2[r3] = r0
            r0 = 7
            r2[r0] = r1
            return r2
    }

    public static char l(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
            if (r0 <= 0) goto L29
            char r0 = r4.charAt(r1)
            r2 = 59
            r3 = 58
            if (r0 == r3) goto L28
            if (r0 == r2) goto L27
            r2 = 81
            if (r0 == r2) goto L1c
            r2 = 113(0x71, float:1.58E-43)
            if (r0 == r2) goto L1c
            goto L29
        L1c:
            r0 = 34
            int r4 = r4.indexOf(r0)
            if (r4 < 0) goto L26
            r0 = 39
        L26:
            return r0
        L27:
            return r3
        L28:
            return r2
        L29:
            return r1
    }

    public static boolean m(java.lang.String r2) {
            int r0 = r2.length()
            r1 = 0
            if (r0 <= 0) goto L26
            char r2 = r2.charAt(r1)
            r0 = 58
            if (r2 == r0) goto L24
            r0 = 59
            if (r2 == r0) goto L24
            r0 = 72
            if (r2 == r0) goto L24
            r0 = 81
            if (r2 == r0) goto L24
            r0 = 104(0x68, float:1.46E-43)
            if (r2 == r0) goto L24
            r0 = 113(0x71, float:1.58E-43)
            if (r2 == r0) goto L24
            goto L26
        L24:
            r2 = 1
            return r2
        L26:
            return r1
    }

    public static boolean n(java.lang.String r2) {
            int r0 = r2.length()
            r1 = 0
            if (r0 <= 0) goto L22
            char r2 = r2.charAt(r1)
            r0 = 58
            if (r2 == r0) goto L20
            r0 = 59
            if (r2 == r0) goto L20
            r0 = 81
            if (r2 == r0) goto L20
            r0 = 113(0x71, float:1.58E-43)
            if (r2 == r0) goto L20
            r0 = 126(0x7e, float:1.77E-43)
            if (r2 == r0) goto L20
            goto L22
        L20:
            r2 = 1
            return r2
        L22:
            return r1
    }

    public static android.ext.t1.b o(android.ext.t1.b r6, java.lang.String r7, int r8, boolean r9) {
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            android.ext.t1$b r6 = p(r0, r1, r2, r3, r4)
            return r6
    }

    public static android.ext.t1.b p(android.ext.t1.b r16, java.lang.String r17, int r18, boolean r19, long r20) {
            r0 = r17
            r1 = r18
            r2 = r20
            if (r16 != 0) goto Le
            android.ext.t1$b r4 = new android.ext.t1$b
            r4.<init>()
            goto L10
        Le:
            r4 = r16
        L10:
            int r5 = r17.length()
            r6 = 45
            r7 = 48
            r8 = 3
            r9 = 0
            r10 = 2
            r11 = 1
            if (r5 == r11) goto L28
            if (r5 == r10) goto L28
            if (r5 != r8) goto L59
            char r12 = r0.charAt(r9)
            if (r12 != r6) goto L59
        L28:
            char r12 = r0.charAt(r9)
            if (r12 != r6) goto L30
            r6 = 1
            goto L31
        L30:
            r6 = 0
        L31:
            int r12 = r5 + (-1)
            char r13 = r0.charAt(r12)
            if (r7 > r13) goto L59
            r14 = 57
            if (r13 > r14) goto L59
            if (r12 > r6) goto L42
            r5 = 48
            goto L48
        L42:
            int r5 = r5 + (-2)
            char r5 = r0.charAt(r5)
        L48:
            if (r7 > r5) goto L59
            if (r5 > r14) goto L59
            int r5 = r5 * 10
            int r5 = r5 + r13
            int r5 = r5 + (-528)
            if (r6 != r11) goto L54
            int r5 = -r5
        L54:
            android.ext.t1$b r0 = c(r4, r5, r1)
            return r0
        L59:
            java.lang.String r5 = b(r0, r11)
            boolean r6 = m(r5)
            r7 = 4
            r12 = 127(0x7f, float:1.78E-43)
            if (r6 == 0) goto L6a
            r6 = 127(0x7f, float:1.78E-43)
            goto L126
        L6a:
            int r6 = C(r5)
            if (r6 == 0) goto Ld2
            char r1 = r5.charAt(r11)
            r13 = 84
            r14 = 104(0x68, float:1.46E-43)
            r15 = 0
            if (r1 != r13) goto La2
            java.lang.String r1 = r5.substring(r10)
            java.lang.String r1 = r1.trim()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r1 = android.ext.n.p(r15, r2, r1)
        L8c:
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r2)
            r5.append(r1)
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            goto L126
        La2:
            r13 = 65
            if (r1 != r13) goto L126
            char r1 = r5.charAt(r10)
            r13 = 56
            if (r1 != r13) goto Lc0
            java.lang.String r1 = r5.substring(r8)
            java.lang.String r1 = r1.trim()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r1 = android.ext.m.k(r15, r15, r2, r1)
            goto L8c
        Lc0:
            java.lang.String r1 = r5.substring(r10)
            java.lang.String r1 = r1.trim()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r1 = android.ext.n.n(r15, r2, r1)
            goto L8c
        Ld2:
            int r2 = r5.length()
            if (r2 <= 0) goto Le2
            int r2 = r5.length()
            int r2 = r2 - r11
            char r2 = r5.charAt(r2)
            goto Le4
        Le2:
            r2 = 48
        Le4:
            r3 = 97
            if (r2 == r3) goto L117
            r3 = 98
            if (r2 == r3) goto Lfe
            r3 = 113(0x71, float:1.58E-43)
            if (r2 == r3) goto L10f
            r3 = 119(0x77, float:1.67E-43)
            if (r2 == r3) goto L101
            r3 = 120(0x78, float:1.68E-43)
            if (r2 == r3) goto L107
            switch(r2) {
                case 100: goto L104;
                case 101: goto L113;
                case 102: goto L10b;
                default: goto Lfb;
            }
        Lfb:
            r6 = r1 & 127(0x7f, float:1.78E-43)
            goto L126
        Lfe:
            if (r6 != 0) goto L101
            r6 = 1
        L101:
            if (r6 != 0) goto L104
            r6 = 2
        L104:
            if (r6 != 0) goto L107
            r6 = 4
        L107:
            if (r6 != 0) goto L10b
            r6 = 8
        L10b:
            if (r6 != 0) goto L10f
            r6 = 16
        L10f:
            if (r6 != 0) goto L113
            r6 = 32
        L113:
            if (r6 != 0) goto L117
            r6 = 64
        L117:
            if (r6 != 0) goto L11b
            r6 = 127(0x7f, float:1.78E-43)
        L11b:
            if (r19 != 0) goto L1ed
            int r1 = r5.length()
            int r1 = r1 - r11
            java.lang.String r5 = r5.substring(r9, r1)
        L126:
            if (r6 == r11) goto L171
            if (r6 == r10) goto L16f
            if (r6 == r7) goto L16d
            r1 = 8
            if (r6 == r1) goto L16d
            r1 = 16
            if (r6 == r1) goto L167
            r1 = 32
            if (r6 == r1) goto L17a
            r1 = 36
            if (r6 == r1) goto L17a
            r1 = 64
            if (r6 == r1) goto L161
            if (r6 == r12) goto L15b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown flags: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = " we use Auto parsing"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.ext.e1.p(r1)
        L15b:
            android.ext.t1$b r0 = q(r4, r5, r0)
            goto L1ec
        L161:
            android.ext.t1$b r0 = v(r4, r5, r0)
            goto L1ec
        L167:
            android.ext.t1$b r0 = w(r4, r5, r0)
            goto L1ec
        L16d:
            r1 = 3
            goto L175
        L16f:
            r1 = 3
            goto L172
        L171:
            r1 = 0
        L172:
            if (r1 != r8) goto L175
            r1 = 1
        L175:
            if (r1 != r8) goto L179
            r8 = 2
            goto L17a
        L179:
            r8 = r1
        L17a:
            android.ext.t1$b r1 = y(r4, r5, r0)
            if (r6 == 0) goto L1eb
            int r2 = r1.f1263c
            r2 = r2 & r6
            r1.f1263c = r2
            if (r2 != 0) goto L1eb
            java.lang.Object[] r1 = k()
            java.lang.String r2 = " [__d__; __d__]."
            java.lang.String r2 = android.ext.b2.g(r2)
            java.lang.Object[] r3 = new java.lang.Object[r10]
            int r4 = r8 * 2
            r5 = r1[r4]
            r3[r9] = r5
            int r5 = r4 + 1
            r6 = r1[r5]
            r3[r11] = r6
            java.lang.String r2 = android.ext.t2.f(r2, r3)
            android.ext.t1$a r3 = new android.ext.t1$a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = 2131296830(0x7f09023e, float:1.8211588E38)
            java.lang.String r7 = z(r7)
            java.lang.Object[] r10 = new java.lang.Object[r11]
            r10[r9] = r0
            java.lang.String r7 = android.ext.t2.f(r7, r10)
            r6.append(r7)
            if (r2 != 0) goto L1d0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = " possibleRange for "
            r7.append(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L1d1
        L1d0:
            r7 = r2
        L1d1:
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r3.<init>(r6)
            r3.c(r0)
            if (r2 == 0) goto L1ea
            r0 = r1[r4]
            r3.b(r0)
            r0 = r1[r5]
            r3.b(r0)
        L1ea:
            throw r3
        L1eb:
            r0 = r1
        L1ec:
            return r0
        L1ed:
            java.lang.NumberFormatException r0 = j(r5, r0, r9, r9)
            throw r0
    }

    private static android.ext.t1.b q(android.ext.t1.b r4, java.lang.String r5, java.lang.String r6) {
            r0 = 0
            java.lang.String r5 = b(r5, r0)
            r1 = 80
            android.ext.t1$b r4 = y(r4, r5, r6)     // Catch: java.lang.NumberFormatException -> L11
            int r5 = r4.f1263c
            r5 = r5 | r1
            r4.f1263c = r5
            return r4
        L11:
            r2 = move-exception
            android.ext.t1$b r4 = v(r4, r5, r6)     // Catch: java.lang.NumberFormatException -> L21
            long r2 = r4.f1261a
            android.ext.t1$b r4 = w(r4, r5, r6)     // Catch: java.lang.NumberFormatException -> L20
            r4.f1261a = r2     // Catch: java.lang.NumberFormatException -> L20
            r4.f1263c = r1     // Catch: java.lang.NumberFormatException -> L20
        L20:
            return r4
        L21:
            r4 = move-exception
            java.lang.NumberFormatException r5 = j(r5, r6, r0, r0)
            r5.initCause(r4)
            r5.addSuppressed(r2)
            throw r5
    }

    public static long r(java.lang.String r1, int r2) {
            r0 = 1
            java.lang.String r1 = b(r1, r0)
            long r1 = s(r1, r2)
            return r1
    }

    private static long s(java.lang.String r4, int r5) {
            r0 = 0
            java.lang.String r4 = b(r4, r0)
            long r4 = java.lang.Long.parseLong(r4, r5)     // Catch: java.lang.NumberFormatException -> La
            goto L4a
        La:
            r0 = move-exception
            java.math.BigInteger r1 = new java.math.BigInteger     // Catch: java.lang.ArithmeticException -> L1d java.lang.NumberFormatException -> L4d
            r1.<init>(r4, r5)     // Catch: java.lang.ArithmeticException -> L1d java.lang.NumberFormatException -> L4d
            int r2 = r1.bitLength()     // Catch: java.lang.ArithmeticException -> L1d java.lang.NumberFormatException -> L4d
            r3 = 64
            if (r2 > r3) goto L1f
            long r4 = r1.longValue()     // Catch: java.lang.ArithmeticException -> L1d java.lang.NumberFormatException -> L4d
            goto L4a
        L1d:
            r1 = move-exception
            goto L20
        L1f:
            throw r0     // Catch: java.lang.ArithmeticException -> L1d java.lang.NumberFormatException -> L4d
        L20:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error parse "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = " with "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = " as BigInteger"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.ext.e1.s(r2, r1)
            r1 = 10
            if (r5 != r1) goto L4c
            double r4 = java.lang.Double.parseDouble(r4)     // Catch: java.lang.NumberFormatException -> L4b
            long r4 = (long) r4
        L4a:
            return r4
        L4b:
            throw r0
        L4c:
            throw r0
        L4d:
            throw r0
    }

    public static android.ext.t1.b t(android.ext.t1.b r1, java.lang.String r2, java.lang.String r3) {
            r0 = 1
            java.lang.String r2 = b(r2, r0)
            android.ext.t1$b r1 = v(r1, r2, r3)
            return r1
    }

    public static android.ext.t1.b u(java.lang.String r1) {
            android.ext.t1$b r0 = new android.ext.t1$b
            r0.<init>()
            android.ext.t1$b r1 = t(r0, r1, r1)
            return r1
    }

    public static void updateLocale() {
            java.lang.String r0 = "e|whRughuPdvn"
            java.lang.String r1 = "dqgurlg1h{w1LqRxw"
            java.lang.String r2 = "dqgurlg1frqwhqw1Frqwh{w"
            java.lang.String r3 = "c"
            java.lang.String r4 = "cjcacvcac.clcacncgc.cSctcrcicncgc"
            java.lang.String r5 = "b"
            java.lang.String r6 = "brbebmbobvbebNbebwbLbibnbebsbCbhbabrbsb"
            java.lang.String r7 = "w"
            java.lang.String r8 = "wawnwdwrwowiwdw.wewxwtw.wTwowowlwsw"
            r9 = 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            java.lang.String r11 = "%d"
            java.lang.String r12 = "1"
            java.lang.String r10 = android.ext.Tools.M1(r11, r11, r12, r10)
            r11 = 1811(0x713, float:2.538E-42)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r12 = "%,d"
            java.lang.String r13 = "1,811"
            java.lang.String r11 = android.ext.Tools.M1(r12, r12, r13, r11)
            java.lang.String r13 = ""
            java.lang.String r11 = r11.replace(r10, r13)
            android.ext.t1.f1251a = r11
            r14 = 4617440492851260555(0x401471a9fbe76c8b, double:5.111)
            java.lang.Double r11 = java.lang.Double.valueOf(r14)
            java.lang.String r14 = "%.3f"
            java.lang.String r15 = "5.111"
            java.lang.String r11 = android.ext.Tools.M1(r14, r14, r15, r11)
            java.lang.String r11 = r11.replace(r10, r13)
            r15 = 0
            char r11 = r11.charAt(r15)
            android.ext.t1.f1252b = r11
            java.lang.String r11 = "edqqhu"
            java.lang.String r15 = "edqqhu1edqqhu1edqqhu5"
            java.lang.String r9 = "frp1vdyhjdph1VdyhvUhvwrulqj"
            java.lang.String[] r9 = new java.lang.String[]{r9, r11, r15}
            r11 = 0
        L5c:
            r15 = 3
            if (r11 >= r15) goto L50e
            r15 = r9[r11]
            java.lang.String r18 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4f2
            r19 = r9
            java.lang.Class r9 = java.lang.Class.forName(r18)     // Catch: java.lang.Throwable -> L4e3
            r18 = r14
            java.lang.String r14 = r6.replace(r5, r13)     // Catch: java.lang.Throwable -> L4d5
            r20 = r10
            r21 = r12
            r10 = 1
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> L4cb
            java.lang.String r17 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4cb
            java.lang.Class r17 = java.lang.Class.forName(r17)     // Catch: java.lang.Throwable -> L4cb
            r16 = 0
            r12[r16] = r17     // Catch: java.lang.Throwable -> L4cb
            java.lang.reflect.Method r9 = r9.getMethod(r14, r12)     // Catch: java.lang.Throwable -> L4cb
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L4cb
            r12[r16] = r15     // Catch: java.lang.Throwable -> L4cb
            r10 = 0
            java.lang.Object r9 = r9.invoke(r10, r12)     // Catch: java.lang.Throwable -> L4cb
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L4cb
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.Throwable -> L4cb
            java.lang.String r12 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4cb
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch: java.lang.Throwable -> L4cb
            java.lang.String r14 = r6.replace(r5, r13)     // Catch: java.lang.Throwable -> L4cb
            r15 = 1
            java.lang.Class[] r10 = new java.lang.Class[r15]     // Catch: java.lang.Throwable -> L4cb
            java.lang.String r17 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4cb
            java.lang.Class r17 = java.lang.Class.forName(r17)     // Catch: java.lang.Throwable -> L4cb
            r16 = 0
            r10[r16] = r17     // Catch: java.lang.Throwable -> L4cb
            java.lang.reflect.Method r10 = r12.getMethod(r14, r10)     // Catch: java.lang.Throwable -> L4cb
            java.lang.Object[] r12 = new java.lang.Object[r15]     // Catch: java.lang.Throwable -> L4cb
            java.lang.String r14 = "dqgurlg1h{w1PdlqVhuylfh"
            r12[r16] = r14     // Catch: java.lang.Throwable -> L4cb
            java.lang.Object r10 = r10.invoke(r9, r12)     // Catch: java.lang.Throwable -> L4cb
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L4cb
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L4cb
            java.lang.String r12 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4cb
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch: java.lang.Throwable -> L4cb
            java.lang.String r14 = r6.replace(r5, r13)     // Catch: java.lang.Throwable -> L4cb
            r22 = r11
            r15 = 1
            java.lang.Class[] r11 = new java.lang.Class[r15]     // Catch: java.lang.Throwable -> L4bd
            java.lang.String r17 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4bd
            java.lang.Class r17 = java.lang.Class.forName(r17)     // Catch: java.lang.Throwable -> L4bd
            r16 = 0
            r11[r16] = r17     // Catch: java.lang.Throwable -> L4bd
            java.lang.reflect.Method r11 = r12.getMethod(r14, r11)     // Catch: java.lang.Throwable -> L4bd
            java.lang.Object[] r12 = new java.lang.Object[r15]     // Catch: java.lang.Throwable -> L4bd
            java.lang.String r14 = "frqwh{w"
            r12[r16] = r14     // Catch: java.lang.Throwable -> L4bd
            java.lang.Object r11 = r11.invoke(r9, r12)     // Catch: java.lang.Throwable -> L4bd
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L4bd
            java.lang.reflect.Field r10 = r10.getField(r11)     // Catch: java.lang.Throwable -> L4bd
            java.lang.Object r9 = r10.get(r9)     // Catch: java.lang.Throwable -> L4bd
            java.lang.String r10 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4bd
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L4bd
            java.lang.String r11 = r6.replace(r5, r13)     // Catch: java.lang.Throwable -> L4bd
            r12 = 1
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> L4bd
            java.lang.String r15 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4bd
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch: java.lang.Throwable -> L4bd
            r16 = 0
            r14[r16] = r15     // Catch: java.lang.Throwable -> L4bd
            java.lang.reflect.Method r10 = r10.getMethod(r11, r14)     // Catch: java.lang.Throwable -> L4bd
            java.lang.Object[] r11 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L4bd
            r11[r16] = r2     // Catch: java.lang.Throwable -> L4bd
            java.lang.Object r10 = r10.invoke(r9, r11)     // Catch: java.lang.Throwable -> L4bd
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L4bd
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L4bd
            java.lang.String r11 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4bd
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L4bd
            java.lang.String r12 = r6.replace(r5, r13)     // Catch: java.lang.Throwable -> L4bd
            r14 = 1
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch: java.lang.Throwable -> L4c4
            java.lang.String r17 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4c4
            java.lang.Class r17 = java.lang.Class.forName(r17)     // Catch: java.lang.Throwable -> L4c4
            r14 = 0
            r15[r14] = r17     // Catch: java.lang.Throwable -> L4bd
            java.lang.reflect.Method r11 = r11.getMethod(r12, r15)     // Catch: java.lang.Throwable -> L4bd
            r12 = 1
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L4bd
            java.lang.String r12 = "jhwSdfndjhQdph"
            r15[r14] = r12     // Catch: java.lang.Throwable -> L4bd
            java.lang.Object r11 = r11.invoke(r9, r15)     // Catch: java.lang.Throwable -> L4bd
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L4bd
            java.lang.Class[] r12 = new java.lang.Class[r14]     // Catch: java.lang.Throwable -> L4bd
            java.lang.reflect.Method r10 = r10.getMethod(r11, r12)     // Catch: java.lang.Throwable -> L4bd
            java.lang.Object[] r11 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L4bd
            java.lang.Object r10 = r10.invoke(r9, r11)     // Catch: java.lang.Throwable -> L4bd
            java.lang.String r11 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4bd
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L4bd
            java.lang.String r12 = r6.replace(r5, r13)     // Catch: java.lang.Throwable -> L4bd
            r14 = 1
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch: java.lang.Throwable -> L4c4
            java.lang.String r17 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4c4
            java.lang.Class r17 = java.lang.Class.forName(r17)     // Catch: java.lang.Throwable -> L4c4
            r16 = 0
            r15[r16] = r17     // Catch: java.lang.Throwable -> L4c4
            java.lang.reflect.Method r11 = r11.getMethod(r12, r15)     // Catch: java.lang.Throwable -> L4c4
            java.lang.Object[] r12 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L4c4
            r12[r16] = r2     // Catch: java.lang.Throwable -> L4bd
            java.lang.Object r11 = r11.invoke(r9, r12)     // Catch: java.lang.Throwable -> L4bd
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L4bd
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L4bd
            java.lang.String r12 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4bd
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch: java.lang.Throwable -> L4bd
            java.lang.String r14 = r6.replace(r5, r13)     // Catch: java.lang.Throwable -> L4bd
            r23 = r2
            r15 = 1
            java.lang.Class[] r2 = new java.lang.Class[r15]     // Catch: java.lang.Throwable -> L4b4
            java.lang.String r17 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4b4
            java.lang.Class r17 = java.lang.Class.forName(r17)     // Catch: java.lang.Throwable -> L4b4
            r15 = 0
            r2[r15] = r17     // Catch: java.lang.Throwable -> L4b4
            java.lang.reflect.Method r2 = r12.getMethod(r14, r2)     // Catch: java.lang.Throwable -> L4b4
            r12 = 1
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L4b4
            java.lang.String r12 = "jhwSdfndjhPdqdjhu"
            r14[r15] = r12     // Catch: java.lang.Throwable -> L4b4
            java.lang.Object r2 = r2.invoke(r9, r14)     // Catch: java.lang.Throwable -> L4b4
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4b4
            java.lang.Class[] r12 = new java.lang.Class[r15]     // Catch: java.lang.Throwable -> L4b4
            java.lang.reflect.Method r2 = r11.getMethod(r2, r12)     // Catch: java.lang.Throwable -> L4b4
            java.lang.Object[] r11 = new java.lang.Object[r15]     // Catch: java.lang.Throwable -> L4b4
            java.lang.Object r2 = r2.invoke(r9, r11)     // Catch: java.lang.Throwable -> L4b4
            java.lang.String r11 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4b4
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L4b4
            java.lang.String r12 = r6.replace(r5, r13)     // Catch: java.lang.Throwable -> L4b4
            r14 = 1
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch: java.lang.Throwable -> L4b7
            java.lang.String r17 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4b7
            java.lang.Class r17 = java.lang.Class.forName(r17)     // Catch: java.lang.Throwable -> L4b7
            r16 = 0
            r15[r16] = r17     // Catch: java.lang.Throwable -> L4b7
            java.lang.reflect.Method r11 = r11.getMethod(r12, r15)     // Catch: java.lang.Throwable -> L4b7
            java.lang.Object[] r12 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L4b7
            java.lang.String r14 = "dqgurlg1frqwhqw1sp1SdfndjhPdqdjhu"
            r12[r16] = r14     // Catch: java.lang.Throwable -> L4b4
            java.lang.Object r11 = r11.invoke(r9, r12)     // Catch: java.lang.Throwable -> L4b4
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L4b4
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L4b4
            java.lang.String r12 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4b4
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch: java.lang.Throwable -> L4b4
            java.lang.String r14 = r6.replace(r5, r13)     // Catch: java.lang.Throwable -> L4b4
            r24 = r0
            r15 = 1
            java.lang.Class[] r0 = new java.lang.Class[r15]     // Catch: java.lang.Throwable -> L4b1
            java.lang.String r17 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4b1
            java.lang.Class r17 = java.lang.Class.forName(r17)     // Catch: java.lang.Throwable -> L4b1
            r16 = 0
            r0[r16] = r17     // Catch: java.lang.Throwable -> L4b1
            java.lang.reflect.Method r0 = r12.getMethod(r14, r0)     // Catch: java.lang.Throwable -> L4b1
            java.lang.Object[] r12 = new java.lang.Object[r15]     // Catch: java.lang.Throwable -> L4b1
            java.lang.String r14 = "jhwSdfndjhLqir"
            r12[r16] = r14     // Catch: java.lang.Throwable -> L4b1
            java.lang.Object r0 = r0.invoke(r9, r12)     // Catch: java.lang.Throwable -> L4b1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4b1
            r12 = 2
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> L4b1
            java.lang.String r15 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4b1
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch: java.lang.Throwable -> L4b1
            java.lang.String r12 = r6.replace(r5, r13)     // Catch: java.lang.Throwable -> L4b1
            r26 = r1
            r27 = r2
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L4af
            java.lang.String r17 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4af
            java.lang.Class r17 = java.lang.Class.forName(r17)     // Catch: java.lang.Throwable -> L4af
            r16 = 0
            r2[r16] = r17     // Catch: java.lang.Throwable -> L4af
            java.lang.reflect.Method r2 = r15.getMethod(r12, r2)     // Catch: java.lang.Throwable -> L4af
            java.lang.Object[] r12 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L4af
            java.lang.String r1 = "mdyd1odqj1Vwulqj"
            r12[r16] = r1     // Catch: java.lang.Throwable -> L4af
            java.lang.Object r1 = r2.invoke(r9, r12)     // Catch: java.lang.Throwable -> L4af
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4af
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L4af
            r14[r16] = r1     // Catch: java.lang.Throwable -> L4af
            java.lang.String r1 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4af
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L4af
            java.lang.String r2 = r6.replace(r5, r13)     // Catch: java.lang.Throwable -> L4af
            r12 = 1
            java.lang.Class[] r15 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> L4af
            java.lang.String r17 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4af
            java.lang.Class r17 = java.lang.Class.forName(r17)     // Catch: java.lang.Throwable -> L4af
            r16 = 0
            r15[r16] = r17     // Catch: java.lang.Throwable -> L4af
            java.lang.reflect.Method r1 = r1.getMethod(r2, r15)     // Catch: java.lang.Throwable -> L4af
            java.lang.Object[] r2 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L4af
            java.lang.String r12 = "mdyd1odqj1Lqwhjhu"
            r2[r16] = r12     // Catch: java.lang.Throwable -> L4af
            java.lang.Object r1 = r1.invoke(r9, r2)     // Catch: java.lang.Throwable -> L4af
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4af
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L4af
            java.lang.String r2 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4af
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L4af
            java.lang.String r12 = r6.replace(r5, r13)     // Catch: java.lang.Throwable -> L4af
            r28 = r5
            r15 = 1
            java.lang.Class[] r5 = new java.lang.Class[r15]     // Catch: java.lang.Throwable -> L4ac
            java.lang.String r17 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4ac
            java.lang.Class r17 = java.lang.Class.forName(r17)     // Catch: java.lang.Throwable -> L4ac
            r16 = 0
            r5[r16] = r17     // Catch: java.lang.Throwable -> L4ac
            java.lang.reflect.Method r2 = r2.getMethod(r12, r5)     // Catch: java.lang.Throwable -> L4ac
            java.lang.Object[] r5 = new java.lang.Object[r15]     // Catch: java.lang.Throwable -> L4ac
            java.lang.String r12 = "W\\SH"
            r5[r16] = r12     // Catch: java.lang.Throwable -> L4ac
            java.lang.Object r2 = r2.invoke(r9, r5)     // Catch: java.lang.Throwable -> L4ac
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4ac
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L4ac
            java.lang.Object r1 = r1.get(r9)     // Catch: java.lang.Throwable -> L4ac
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L4ac
            r2 = 1
            r14[r2] = r1     // Catch: java.lang.Throwable -> L4ac
            java.lang.reflect.Method r0 = r11.getMethod(r0, r14)     // Catch: java.lang.Throwable -> L4ac
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L4ac
            r5 = 0
            r1[r5] = r10     // Catch: java.lang.Throwable -> L4ac
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L4ac
            r1[r2] = r10     // Catch: java.lang.Throwable -> L4ac
            r5 = r27
            java.lang.Object r0 = r0.invoke(r5, r1)     // Catch: java.lang.Throwable -> L4ac
            java.lang.String r1 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4ac
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L4ac
            r10 = r28
            java.lang.String r11 = r6.replace(r10, r13)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Class[] r12 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r14 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch: java.lang.Throwable -> L4a9
            r15 = 0
            r12[r15] = r14     // Catch: java.lang.Throwable -> L4a9
            java.lang.reflect.Method r1 = r1.getMethod(r11, r12)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L4a9
            r11[r15] = r26     // Catch: java.lang.Throwable -> L4a9
            java.lang.Object r1 = r1.invoke(r9, r11)     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4a9
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r2 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r11 = r6.replace(r10, r13)     // Catch: java.lang.Throwable -> L4a9
            r12 = 1
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r15 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch: java.lang.Throwable -> L4a9
            r16 = 0
            r14[r16] = r15     // Catch: java.lang.Throwable -> L4a9
            java.lang.reflect.Method r2 = r2.getMethod(r11, r14)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Object[] r11 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L4a9
            r11[r16] = r24     // Catch: java.lang.Throwable -> L4a9
            java.lang.Object r2 = r2.invoke(r9, r11)     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4a9
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r2 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r11 = r6.replace(r10, r13)     // Catch: java.lang.Throwable -> L4a9
            r12 = 1
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r15 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Class r15 = java.lang.Class.forName(r15)     // Catch: java.lang.Throwable -> L4a9
            r16 = 0
            r14[r16] = r15     // Catch: java.lang.Throwable -> L4a9
            java.lang.reflect.Method r2 = r2.getMethod(r11, r14)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Object[] r11 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L4a9
            r11[r16] = r26     // Catch: java.lang.Throwable -> L4a9
            java.lang.Object r2 = r2.invoke(r9, r11)     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4a9
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r11 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r12 = r6.replace(r10, r13)     // Catch: java.lang.Throwable -> L4a9
            r14 = 1
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch: java.lang.Throwable -> L4fb
            java.lang.String r17 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4fb
            java.lang.Class r17 = java.lang.Class.forName(r17)     // Catch: java.lang.Throwable -> L4fb
            r16 = 0
            r15[r16] = r17     // Catch: java.lang.Throwable -> L4fb
            java.lang.reflect.Method r11 = r11.getMethod(r12, r15)     // Catch: java.lang.Throwable -> L4fb
            java.lang.Object[] r12 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L4fb
            r12[r16] = r24     // Catch: java.lang.Throwable -> L4a9
            java.lang.Object r11 = r11.invoke(r9, r12)     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L4a9
            java.lang.reflect.Field r2 = r2.getField(r11)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L4a9
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L4a9
            long r11 = (long) r2     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r2 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r14 = r6.replace(r10, r13)     // Catch: java.lang.Throwable -> L4a9
            r25 = r1
            r15 = 1
            java.lang.Class[] r1 = new java.lang.Class[r15]     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r17 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Class r17 = java.lang.Class.forName(r17)     // Catch: java.lang.Throwable -> L4a9
            r16 = 0
            r1[r16] = r17     // Catch: java.lang.Throwable -> L4a9
            java.lang.reflect.Method r1 = r2.getMethod(r14, r1)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Object[] r2 = new java.lang.Object[r15]     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r14 = "mdyd1odqj1V|vwhp"
            r2[r16] = r14     // Catch: java.lang.Throwable -> L4a9
            java.lang.Object r1 = r1.invoke(r9, r2)     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4a9
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r2 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r14 = r6.replace(r10, r13)     // Catch: java.lang.Throwable -> L4a9
            r27 = r5
            r15 = 1
            java.lang.Class[] r5 = new java.lang.Class[r15]     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r17 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Class r17 = java.lang.Class.forName(r17)     // Catch: java.lang.Throwable -> L4a9
            r15 = 0
            r5[r15] = r17     // Catch: java.lang.Throwable -> L4a9
            java.lang.reflect.Method r2 = r2.getMethod(r14, r5)     // Catch: java.lang.Throwable -> L4a9
            r5 = 1
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r5 = "fxuuhqwWlphPloolv"
            r14[r15] = r5     // Catch: java.lang.Throwable -> L4a9
            java.lang.Object r2 = r2.invoke(r9, r14)     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4a9
            java.lang.Class[] r5 = new java.lang.Class[r15]     // Catch: java.lang.Throwable -> L4a9
            java.lang.reflect.Method r1 = r1.getMethod(r2, r5)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Object[] r2 = new java.lang.Object[r15]     // Catch: java.lang.Throwable -> L4a9
            r5 = 0
            java.lang.Object r1 = r1.invoke(r5, r2)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L4a9
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r5 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r14 = r6.replace(r10, r13)     // Catch: java.lang.Throwable -> L4a9
            r28 = r11
            r15 = 1
            java.lang.Class[] r11 = new java.lang.Class[r15]     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r12 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch: java.lang.Throwable -> L4a9
            r16 = 0
            r11[r16] = r12     // Catch: java.lang.Throwable -> L4a9
            java.lang.reflect.Method r5 = r5.getMethod(r14, r11)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Object[] r11 = new java.lang.Object[r15]     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r12 = "dqgurlg1frqwhqw1sp1SdfndjhLqir"
            r11[r16] = r12     // Catch: java.lang.Throwable -> L4a9
            java.lang.Object r5 = r5.invoke(r9, r11)     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L4a9
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r11 = r8.replace(r7, r13)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L4a9
            java.lang.String r12 = r6.replace(r10, r13)     // Catch: java.lang.Throwable -> L4a9
            r14 = 1
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch: java.lang.Throwable -> L4fb
            java.lang.String r17 = r4.replace(r3, r13)     // Catch: java.lang.Throwable -> L4fb
            java.lang.Class r17 = java.lang.Class.forName(r17)     // Catch: java.lang.Throwable -> L4fb
            r16 = 0
            r15[r16] = r17     // Catch: java.lang.Throwable -> L4fb
            java.lang.reflect.Method r11 = r11.getMethod(r12, r15)     // Catch: java.lang.Throwable -> L4fb
            java.lang.Object[] r12 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L4fb
            java.lang.String r15 = "odvwXsgdwhWlph"
            r12[r16] = r15     // Catch: java.lang.Throwable -> L4fb
            java.lang.Object r9 = r11.invoke(r9, r12)     // Catch: java.lang.Throwable -> L4fb
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L4fb
            java.lang.reflect.Field r5 = r5.getField(r9)     // Catch: java.lang.Throwable -> L4fb
            long r11 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L4fb
            long r1 = r1 - r11
            r0 = 26
            long r0 = r1 >> r0
            long r0 = r28 | r0
            int r1 = (int) r0     // Catch: java.lang.Throwable -> L4fb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L4fb
            r2 = r25
            r1 = r27
            r2.set(r1, r0)     // Catch: java.lang.Throwable -> L4fb
            goto L4fb
        L4a9:
            r14 = 1
            goto L4fb
        L4ac:
            r10 = r28
            goto L4a9
        L4af:
            r10 = r5
            goto L4a9
        L4b1:
            r26 = r1
            goto L4af
        L4b4:
            r24 = r0
            goto L4b1
        L4b7:
            r24 = r0
            r26 = r1
        L4bb:
            r10 = r5
            goto L4fb
        L4bd:
            r24 = r0
            r26 = r1
            r23 = r2
            goto L4af
        L4c4:
            r24 = r0
            r26 = r1
            r23 = r2
            goto L4bb
        L4cb:
            r24 = r0
            r26 = r1
            r23 = r2
            r10 = r5
            r22 = r11
            goto L4a9
        L4d5:
            r24 = r0
            r26 = r1
            r23 = r2
            r20 = r10
            r22 = r11
            r21 = r12
        L4e1:
            r14 = 1
            goto L4bb
        L4e3:
            r24 = r0
            r26 = r1
            r23 = r2
        L4e9:
            r20 = r10
            r22 = r11
            r21 = r12
            r18 = r14
            goto L4e1
        L4f2:
            r24 = r0
            r26 = r1
            r23 = r2
            r19 = r9
            goto L4e9
        L4fb:
            int r11 = r22 + 1
            r5 = r10
            r14 = r18
            r9 = r19
            r10 = r20
            r12 = r21
            r2 = r23
            r0 = r24
            r1 = r26
            goto L5c
        L50e:
            r20 = r10
            r21 = r12
            r18 = r14
            r14 = 1
            r0 = 1111(0x457, float:1.557E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "1,111"
            r2 = r21
            java.lang.String r0 = android.ext.Tools.M1(r2, r2, r1, r0)
            r1 = r20
            java.lang.String r0 = r0.replace(r1, r13)
            android.ext.t1.f1251a = r0
            java.lang.String r2 = " "
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L53b
            java.lang.String r0 = android.ext.t1.f1251a
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L53f
        L53b:
            java.lang.String r0 = " "
            android.ext.t1.f1251a = r0
        L53f:
            r2 = 4607682318358655533(0x3ff1c6a7ef9db22d, double:1.111)
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            java.lang.String r2 = "1.111"
            r3 = r18
            java.lang.String r0 = android.ext.Tools.M1(r3, r3, r2, r0)
            java.lang.String r0 = r0.replace(r1, r13)
            r1 = 0
            char r0 = r0.charAt(r1)
            android.ext.t1.f1252b = r0
            r2 = 46
            if (r2 == r0) goto L561
            r9 = 1
            goto L562
        L561:
            r9 = 0
        L562:
            android.ext.t1.f1253c = r9
            return
    }

    private static android.ext.t1.b v(android.ext.t1.b r10, java.lang.String r11, java.lang.String r12) {
            r0 = 0
            java.lang.String r11 = b(r11, r0)
            int r1 = r11.length()
            r2 = -9223372036854775808
            r4 = 0
            if (r1 <= 0) goto La9
            int r1 = r11.length()
            int r1 = r1 + (-1)
            char r1 = r11.charAt(r1)
            r6 = 104(0x68, float:1.46E-43)
            if (r1 == r6) goto L8c
            r6 = 114(0x72, float:1.6E-43)
            if (r1 != r6) goto L22
            goto L8c
        L22:
            double r6 = java.lang.Double.parseDouble(r11)     // Catch: java.lang.NumberFormatException -> L66
            boolean r1 = java.lang.Double.isInfinite(r6)     // Catch: java.lang.NumberFormatException -> L66
            if (r1 != 0) goto L68
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L34
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 != 0) goto Laa
        L34:
            r1 = 101(0x65, float:1.42E-43)
            int r1 = r11.indexOf(r1)     // Catch: java.lang.NumberFormatException -> L66
            r8 = -1
            if (r1 == r8) goto Laa
            int r1 = r1 + (-1)
            java.lang.String r1 = r11.substring(r0, r1)     // Catch: java.lang.NumberFormatException -> L66
            double r8 = java.lang.Double.parseDouble(r1)     // Catch: java.lang.NumberFormatException -> L66
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L4c
            goto Laa
        L4c:
            android.ext.t1$a r10 = new android.ext.t1$a     // Catch: java.lang.NumberFormatException -> L66
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L66
            r1.<init>()     // Catch: java.lang.NumberFormatException -> L66
            java.lang.String r2 = "Data parsed as zero: "
            r1.append(r2)     // Catch: java.lang.NumberFormatException -> L66
            r1.append(r11)     // Catch: java.lang.NumberFormatException -> L66
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L66
            r10.<init>(r1)     // Catch: java.lang.NumberFormatException -> L66
            r10.c(r11)     // Catch: java.lang.NumberFormatException -> L66
            throw r10     // Catch: java.lang.NumberFormatException -> L66
        L66:
            r10 = move-exception
            goto L82
        L68:
            android.ext.t1$a r10 = new android.ext.t1$a     // Catch: java.lang.NumberFormatException -> L66
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L66
            r1.<init>()     // Catch: java.lang.NumberFormatException -> L66
            java.lang.String r2 = "Data parsed as infinity: "
            r1.append(r2)     // Catch: java.lang.NumberFormatException -> L66
            r1.append(r11)     // Catch: java.lang.NumberFormatException -> L66
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L66
            r10.<init>(r1)     // Catch: java.lang.NumberFormatException -> L66
            r10.c(r11)     // Catch: java.lang.NumberFormatException -> L66
            throw r10     // Catch: java.lang.NumberFormatException -> L66
        L82:
            r1 = 10
            java.lang.NumberFormatException r11 = j(r11, r12, r1, r0)
            r11.initCause(r10)
            throw r11
        L8c:
            android.ext.t1$b r11 = y(r10, r11, r12)
            long r11 = r11.f1261a
            r6 = 0
            int r1 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r1 < 0) goto L9b
            double r11 = (double) r11
        L99:
            r6 = r11
            goto Laa
        L9b:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r11 = r11 & r6
            double r11 = (double) r11
            r6 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            double r11 = r11 + r6
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = r11 + r6
            goto L99
        La9:
            r6 = r4
        Laa:
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 != 0) goto Laf
            goto Lb0
        Laf:
            r4 = r6
        Lb0:
            long r11 = java.lang.Double.doubleToRawLongBits(r4)
            r10.f1261a = r11
            r11 = 64
            r10.f1263c = r11
            r10.f1262b = r0
            return r10
    }

    private static android.ext.t1.b w(android.ext.t1.b r8, java.lang.String r9, java.lang.String r10) {
            r0 = 0
            java.lang.String r9 = b(r9, r0)
            int r1 = r9.length()
            r2 = 0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            if (r1 <= 0) goto La6
            int r1 = r9.length()
            int r1 = r1 + (-1)
            char r1 = r9.charAt(r1)
            r6 = 104(0x68, float:1.46E-43)
            if (r1 == r6) goto L8b
            r6 = 114(0x72, float:1.6E-43)
            if (r1 != r6) goto L23
            goto L8b
        L23:
            float r1 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L65
            boolean r6 = java.lang.Float.isInfinite(r1)     // Catch: java.lang.NumberFormatException -> L65
            if (r6 != 0) goto L67
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 == 0) goto L35
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto La7
        L35:
            r6 = 101(0x65, float:1.42E-43)
            int r6 = r9.indexOf(r6)     // Catch: java.lang.NumberFormatException -> L65
            r7 = -1
            if (r6 == r7) goto La7
            java.lang.String r6 = r9.substring(r0, r6)     // Catch: java.lang.NumberFormatException -> L65
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.NumberFormatException -> L65
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L4b
            goto La7
        L4b:
            android.ext.t1$a r8 = new android.ext.t1$a     // Catch: java.lang.NumberFormatException -> L65
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L65
            r1.<init>()     // Catch: java.lang.NumberFormatException -> L65
            java.lang.String r2 = "Data parsed as zero: "
            r1.append(r2)     // Catch: java.lang.NumberFormatException -> L65
            r1.append(r9)     // Catch: java.lang.NumberFormatException -> L65
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L65
            r8.<init>(r1)     // Catch: java.lang.NumberFormatException -> L65
            r8.c(r9)     // Catch: java.lang.NumberFormatException -> L65
            throw r8     // Catch: java.lang.NumberFormatException -> L65
        L65:
            r8 = move-exception
            goto L81
        L67:
            android.ext.t1$a r8 = new android.ext.t1$a     // Catch: java.lang.NumberFormatException -> L65
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L65
            r1.<init>()     // Catch: java.lang.NumberFormatException -> L65
            java.lang.String r2 = "Data parsed as infinity: "
            r1.append(r2)     // Catch: java.lang.NumberFormatException -> L65
            r1.append(r9)     // Catch: java.lang.NumberFormatException -> L65
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L65
            r8.<init>(r1)     // Catch: java.lang.NumberFormatException -> L65
            r8.c(r9)     // Catch: java.lang.NumberFormatException -> L65
            throw r8     // Catch: java.lang.NumberFormatException -> L65
        L81:
            r1 = 10
            java.lang.NumberFormatException r9 = j(r9, r10, r1, r0)
            r9.initCause(r8)
            throw r9
        L8b:
            android.ext.t1$b r9 = y(r8, r9, r10)
            long r9 = r9.f1261a
            int r1 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r1 < 0) goto L98
            float r9 = (float) r9
        L96:
            r1 = r9
            goto La7
        L98:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r9 = r9 & r6
            float r9 = (float) r9
            r10 = 1593835520(0x5f000000, float:9.223372E18)
            float r9 = r9 + r10
            r10 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 + r10
            goto L96
        La6:
            r1 = 0
        La7:
            int r9 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r9 != 0) goto Lac
            goto Lad
        Lac:
            r5 = r1
        Lad:
            int r9 = java.lang.Float.floatToRawIntBits(r5)
            long r9 = (long) r9
            int r1 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r1 >= 0) goto Lc0
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r9 = r9 & r1
            r1 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r9 = r9 + r1
        Lc0:
            r8.f1261a = r9
            r9 = 16
            r8.f1263c = r9
            r8.f1262b = r0
            return r8
    }

    public static android.ext.t1.b x(java.lang.String r2) {
            r0 = 1
            java.lang.String r0 = b(r2, r0)
            android.ext.t1$b r1 = new android.ext.t1$b
            r1.<init>()
            android.ext.t1$b r2 = y(r1, r0, r2)
            return r2
    }

    private static android.ext.t1.b y(android.ext.t1.b r9, java.lang.String r10, java.lang.String r11) {
            r0 = 0
            java.lang.String r10 = b(r10, r0)
            int r1 = r10.length()
            r2 = 0
            if (r1 <= 0) goto L6c
            char r1 = r10.charAt(r0)
            r4 = 45
            r5 = 1
            if (r1 != r4) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            r9.f1262b = r1
            boolean r1 = m(r10)
            if (r1 == 0) goto L26
            long r10 = B(r10)
            goto L6d
        L26:
            int r1 = r10.length()
            int r4 = r1 + (-1)
            char r6 = r10.charAt(r4)
            r7 = 104(0x68, float:1.46E-43)
            r8 = 114(0x72, float:1.6E-43)
            if (r6 == r7) goto L3d
            if (r6 != r8) goto L39
            goto L3d
        L39:
            r4 = 10
            r6 = 0
            goto L48
        L3d:
            if (r6 != r8) goto L41
            r6 = 1
            goto L42
        L41:
            r6 = 0
        L42:
            java.lang.String r10 = r10.substring(r0, r4)
            r4 = 16
        L48:
            long r10 = s(r10, r4)     // Catch: java.lang.NumberFormatException -> L63
            if (r6 == 0) goto L6d
            long r10 = java.lang.Long.reverseBytes(r10)
            int r1 = r1 >> r5
            int r1 = r1 * 8
            r4 = 64
            if (r1 >= r4) goto L6d
            int r4 = 64 - r1
            long r10 = r10 >> r4
            r4 = 1
            long r6 = r4 << r1
            long r6 = r6 - r4
            long r10 = r10 & r6
            goto L6d
        L63:
            r9 = move-exception
            java.lang.NumberFormatException r10 = j(r10, r11, r4, r5)
            r10.initCause(r9)
            throw r10
        L6c:
            r10 = r2
        L6d:
            r9.f1261a = r10
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 != 0) goto L79
            boolean r10 = r9.f1262b
            if (r10 == 0) goto L79
            r9.f1262b = r0
        L79:
            A(r9)
            return r9
    }

    public static java.lang.String z(int r0) {
            java.lang.String r0 = android.ext.b2.f(r0)
            return r0
    }
}
