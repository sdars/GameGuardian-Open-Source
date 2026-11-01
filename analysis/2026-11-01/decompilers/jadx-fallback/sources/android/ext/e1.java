package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile boolean f735a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static volatile java.io.BufferedWriter f736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final java.lang.Runnable f738d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static java.lang.String f739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static java.lang.String f740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static java.lang.StringBuilder f741g;

    class a implements java.lang.Runnable {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                r0 = 1
                android.ext.e1.m(r0)
                return
        }
    }

    class b implements java.lang.Runnable {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                r0 = 1
                android.ext.e1.f735a = r0
                java.io.BufferedWriter r0 = android.ext.e1.f736b
                if (r0 != 0) goto L8
                return
            L8:
                java.io.BufferedWriter r0 = android.ext.e1.f736b     // Catch: java.io.IOException -> L16
                r0.flush()     // Catch: java.io.IOException -> L16
                java.io.BufferedWriter r0 = android.ext.e1.f736b     // Catch: java.io.IOException -> L16
                r0.close()     // Catch: java.io.IOException -> L16
                r0 = 0
                android.ext.e1.f736b = r0     // Catch: java.io.IOException -> L16
                goto L1e
            L16:
                r0 = move-exception
                java.lang.String r1 = "AndroidService"
                java.lang.String r2 = "Log close: I/O"
                android.ext.e1.e.b(r1, r2, r0)
            L1e:
                return
        }
    }

    class c implements java.lang.Runnable {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                android.ext.e1.b()
                return
        }
    }

    class d extends android.ext.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.io.InputStream f742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.Process f743b;

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.e1.d f744a;

            a(android.ext.e1.d r1) {
                    r0 = this;
                    r0.f744a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    android.ext.MainService r0 = android.ext.MainService.instance
                    r1 = 20
                    r2 = 0
                    r3 = 0
                    r0.p0(r3, r1, r2)
                    return
            }
        }

        d(java.lang.String r1, java.io.InputStream r2, java.lang.Process r3) {
                r0 = this;
                r0.f742a = r2
                r0.f743b = r3
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r13 = this;
                java.lang.String r0 = " dbg: "
                super.run()
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.NullPointerException -> L28
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.NullPointerException -> L28
                java.io.InputStream r3 = r13.f742a     // Catch: java.lang.NullPointerException -> L28
                r2.<init>(r3)     // Catch: java.lang.NullPointerException -> L28
                r3 = 512(0x200, float:7.17E-43)
                r1.<init>(r2, r3)     // Catch: java.lang.NullPointerException -> L28
                r2 = 0
                r4 = 0
                r6 = r2
                r5 = 0
                r7 = 0
                r8 = 0
            L19:
                boolean r9 = java.lang.Thread.interrupted()     // Catch: java.lang.NullPointerException -> L28
                if (r9 != 0) goto L157
                if (r5 == 0) goto L30
                java.lang.Process r5 = r13.f743b     // Catch: java.lang.NullPointerException -> L28 java.lang.ArrayIndexOutOfBoundsException -> L2b java.lang.IllegalThreadStateException -> L2f
                r5.exitValue()     // Catch: java.lang.NullPointerException -> L28 java.lang.ArrayIndexOutOfBoundsException -> L2b java.lang.IllegalThreadStateException -> L2f
                goto L157
            L28:
                r0 = move-exception
                goto L152
            L2b:
                r5 = move-exception
                android.ext.e1.a(r5)     // Catch: java.lang.NullPointerException -> L28
            L2f:
                r5 = 0
            L30:
                java.lang.String r9 = r1.readLine()     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                if (r9 == 0) goto L13e
                java.lang.String r9 = r9.trim()     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                int r10 = r9.length()     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                if (r10 == 0) goto L19
                java.lang.String r10 = "KEY: "
                boolean r10 = r9.startsWith(r10)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                java.lang.String r11 = "Failed parse: "
                if (r10 == 0) goto L88
                r10 = 5
                java.lang.String r10 = r9.substring(r10)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.lang.NumberFormatException -> L5b java.io.IOException -> L14f java.lang.InterruptedException -> L157
                int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.lang.NumberFormatException -> L5b java.io.IOException -> L14f java.lang.InterruptedException -> L157
                if (r6 != 0) goto L5d
                int[] r6 = new int[r3]     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.lang.NumberFormatException -> L5b java.io.IOException -> L14f java.lang.InterruptedException -> L157
                goto L5d
            L58:
                r9 = move-exception
                goto L145
            L5b:
                r10 = move-exception
                goto L75
            L5d:
                int r12 = r6.length     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.lang.NumberFormatException -> L5b java.io.IOException -> L14f java.lang.InterruptedException -> L157
                if (r7 != r12) goto L66
                int r12 = r6.length     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.lang.NumberFormatException -> L5b java.io.IOException -> L14f java.lang.InterruptedException -> L157
                int r12 = r12 + r3
                int[] r6 = java.util.Arrays.copyOf(r6, r12)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.lang.NumberFormatException -> L5b java.io.IOException -> L14f java.lang.InterruptedException -> L157
            L66:
                int r12 = r7 + 1
                r6[r7] = r10     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L6c java.io.IOException -> L70 java.lang.NumberFormatException -> L73 java.lang.InterruptedException -> L157
                r7 = r12
                goto L19
            L6c:
                r9 = move-exception
                r7 = r12
                goto L145
            L70:
                r7 = r12
                goto L14f
            L73:
                r10 = move-exception
                r7 = r12
            L75:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                r12.<init>()     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                r12.append(r11)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                r12.append(r9)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                java.lang.String r9 = r12.toString()     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
            L84:
                android.ext.e1.s(r9, r10)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                goto L19
            L88:
                java.lang.String r10 = "KEY_END"
                boolean r10 = r9.startsWith(r10)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                if (r10 == 0) goto L9f
                if (r6 == 0) goto L9b
                if (r7 <= 0) goto L9b
                int[] r9 = java.util.Arrays.copyOf(r6, r7)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                android.ext.Config.s(r9)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
            L9b:
                r6 = r2
                r7 = 0
                goto L19
            L9f:
                java.lang.String r10 = "EVENT: "
                boolean r10 = r9.startsWith(r10)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                if (r10 == 0) goto Lcc
                r10 = 7
                java.lang.String r10 = r9.substring(r10)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.lang.NumberFormatException -> Lbb java.io.IOException -> L14f java.lang.InterruptedException -> L157
                int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.lang.NumberFormatException -> Lbb java.io.IOException -> L14f java.lang.InterruptedException -> L157
                android.ext.MainService r12 = android.ext.MainService.instance     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.lang.NumberFormatException -> Lbb java.io.IOException -> L14f java.lang.InterruptedException -> L157
                if (r12 == 0) goto L19
                android.ext.MainService r12 = android.ext.MainService.instance     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.lang.NumberFormatException -> Lbb java.io.IOException -> L14f java.lang.InterruptedException -> L157
                r12.d0(r10)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.lang.NumberFormatException -> Lbb java.io.IOException -> L14f java.lang.InterruptedException -> L157
                goto L19
            Lbb:
                r10 = move-exception
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                r12.<init>()     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                r12.append(r11)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                r12.append(r9)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                java.lang.String r9 = r12.toString()     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                goto L84
            Lcc:
                java.lang.String r10 = "BAD_KERNEL"
                boolean r10 = r9.startsWith(r10)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                if (r10 == 0) goto Lde
                android.ext.e1$d$a r9 = new android.ext.e1$d$a     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                r9.<init>(r13)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                android.ext.n2.i(r9)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                goto L19
            Lde:
                java.lang.StringBuilder r10 = android.ext.e1.f741g     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                boolean r11 = r9.contains(r0)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                if (r11 != 0) goto Lee
                java.lang.String r11 = "Send code: 2"
                boolean r11 = r9.endsWith(r11)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                if (r11 == 0) goto Lf5
            Lee:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                r10.<init>()     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                android.ext.e1.f741g = r10     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
            Lf5:
                boolean r11 = r9.contains(r0)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                java.lang.String r12 = "::searchDone:"
                if (r11 != 0) goto L113
                java.lang.String r11 = " clocks: "
                boolean r11 = r9.contains(r11)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                if (r11 != 0) goto L113
                java.lang.String r11 = "MR["
                boolean r11 = r9.startsWith(r11)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                if (r11 != 0) goto L113
                boolean r11 = r9.contains(r12)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                if (r11 == 0) goto L124
            L113:
                if (r10 != 0) goto L11c
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                r10.<init>()     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                android.ext.e1.f741g = r10     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
            L11c:
                r10.append(r9)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                r11 = 10
                r10.append(r11)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
            L124:
                boolean r11 = r9.contains(r12)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                if (r11 != 0) goto L132
                java.lang.String r11 = "Send code: 3"
                boolean r9 = r9.endsWith(r11)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                if (r9 == 0) goto L19
            L132:
                if (r10 == 0) goto L13a
                java.lang.String r9 = r10.toString()     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                android.ext.e1.f740f = r9     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
            L13a:
                android.ext.e1.f741g = r2     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                goto L19
            L13e:
                r9 = 500(0x1f4, double:2.47E-321)
                java.lang.Thread.sleep(r9)     // Catch: java.lang.NullPointerException -> L28 java.lang.IllegalArgumentException -> L58 java.io.IOException -> L14f java.lang.InterruptedException -> L157
                goto L19
            L145:
                android.ext.e1.a(r9)     // Catch: java.lang.NullPointerException -> L28
                int r8 = r8 + 1
                r9 = 30
                if (r8 <= r9) goto L19
                goto L157
            L14f:
                r5 = 1
                goto L19
            L152:
                java.lang.String r1 = "runLogOnProcessErrStream failed"
                android.ext.e1.s(r1, r0)
            L157:
                return
        }
    }

    public static class e {
        public static int a(java.lang.String r2, java.lang.String r3) {
                r0 = 2
                r1 = 0
                int r2 = f(r0, r2, r3, r1)
                return r2
        }

        public static int b(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
                r0 = 3
                int r1 = f(r0, r1, r2, r3)
                return r1
        }

        public static int c(java.lang.String r2, java.lang.String r3) {
                r0 = 9
                r1 = 0
                int r2 = f(r0, r2, r3, r1)
                return r2
        }

        public static int d(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
                r0 = 10
                int r1 = f(r0, r1, r2, r3)
                return r1
        }

        private static java.lang.String e(java.lang.String r2) {
                if (r2 != 0) goto L5
                java.lang.String r2 = "null"
                goto L12
            L5:
                int r0 = r2.length()
                r1 = 23
                if (r0 <= r1) goto L12
                r0 = 0
                java.lang.String r2 = r2.substring(r0, r1)
            L12:
                return r2
        }

        private static int f(int r5, java.lang.String r6, java.lang.String r7, java.lang.Throwable r8) {
                java.lang.String r6 = e(r6)
                if (r7 != 0) goto L8
                java.lang.String r7 = "null"
            L8:
                int r0 = r7.length()
                r1 = 0
                r2 = 0
            Le:
                int r3 = r0 - r2
                r4 = 1023(0x3ff, float:1.434E-42)
                if (r3 <= r4) goto L16
                r3 = 1023(0x3ff, float:1.434E-42)
            L16:
                int r3 = r3 + r2
                java.lang.String r2 = r7.substring(r2, r3)
                r4 = 2
                if (r5 == r4) goto L36
                r4 = 3
                if (r5 == r4) goto L3d
                r4 = 6
                if (r5 == r4) goto L36
                r4 = 7
                if (r5 == r4) goto L3a
                r4 = 9
                if (r5 == r4) goto L36
                r4 = 10
                if (r5 == r4) goto L30
                goto L45
            L30:
                if (r3 != r0) goto L36
            L32:
                android.util.Log.e(r6, r2, r8)     // Catch: java.lang.OutOfMemoryError -> L36
                goto L45
            L36:
                android.util.Log.e(r6, r2)     // Catch: java.lang.OutOfMemoryError -> L40
                goto L45
            L3a:
                if (r3 != r0) goto L36
                goto L32
            L3d:
                if (r3 != r0) goto L36
                goto L32
            L40:
                java.lang.String r2 = "OOM for Log 1"
                android.util.Log.e(r6, r2)
            L45:
                if (r3 < r0) goto L48
                return r1
            L48:
                r2 = r3
                goto Le
        }

        public static int g(java.lang.String r2, java.lang.String r3) {
                r0 = 6
                r1 = 0
                int r2 = f(r0, r2, r3, r1)
                return r2
        }

        public static int h(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
                r0 = 7
                int r1 = f(r0, r1, r2, r3)
                return r1
        }
    }

    static {
            android.ext.e1$a r0 = new android.ext.e1$a
            r0.<init>()
            android.ext.e1.f738d = r0
            java.lang.String r0 = "/last_run.log"
            android.ext.e1.f739e = r0
            java.lang.String r0 = "- none -"
            android.ext.e1.f740f = r0
            r0 = 0
            android.ext.e1.f741g = r0
            return
    }

    public static int a(java.lang.Throwable r1) {
            java.lang.String r0 = "Bad implementation"
            int r1 = s(r0, r1)
            return r1
    }

    public static void b() {
            android.ext.e1$b r0 = new android.ext.e1$b
            r0.<init>()
            android.ext.n2.g(r0)
            return
    }

    public static void c() {
            android.ext.e1$c r0 = new android.ext.e1$c
            r0.<init>()
            android.ext.n2.g(r0)
            return
    }

    public static int d(java.lang.String r1) {
            java.lang.String r0 = "AndroidService"
            int r1 = e(r0, r1)
            return r1
    }

    public static int e(java.lang.String r0, java.lang.String r1) {
            int r0 = android.ext.e1.e.a(r0, r1)
            return r0
    }

    public static int f(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            int r0 = android.ext.e1.e.b(r0, r1, r2)
            return r0
    }

    public static int g(java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r0 = "AndroidService"
            int r1 = f(r0, r1, r2)
            return r1
    }

    public static int h(java.lang.String r5) {
            int r0 = r5.length()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L18
            int r3 = r2 + 1003
            if (r3 >= r0) goto Le
            r4 = r3
            goto Lf
        Le:
            r4 = r0
        Lf:
            java.lang.String r2 = r5.substring(r2, r4)
            d(r2)
            r2 = r3
            goto L6
        L18:
            return r1
    }

    public static int i(java.lang.String r1) {
            java.lang.String r0 = "AndroidService"
            int r1 = j(r0, r1)
            return r1
    }

    public static int j(java.lang.String r0, java.lang.String r1) {
            int r0 = android.ext.e1.e.c(r0, r1)
            return r0
    }

    public static int k(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            int r0 = android.ext.e1.e.d(r0, r1, r2)
            return r0
    }

    public static int l(java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r0 = "AndroidService"
            int r1 = k(r0, r1, r2)
            return r1
    }

    public static boolean m(boolean r8) {
            java.io.BufferedWriter r0 = android.ext.e1.f736b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L1c
            long r4 = android.ext.e1.f737c     // Catch: java.io.IOException -> L1c
            long r4 = r2 - r4
            r6 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L16
            if (r8 == 0) goto L29
        L16:
            java.io.BufferedWriter r8 = android.ext.e1.f736b     // Catch: java.io.IOException -> L1c java.lang.NullPointerException -> L1e
            r8.flush()     // Catch: java.io.IOException -> L1c java.lang.NullPointerException -> L1e
            goto L1e
        L1c:
            r8 = move-exception
            goto L22
        L1e:
            android.ext.e1.f737c = r2     // Catch: java.io.IOException -> L1c
            r8 = 1
            return r8
        L22:
            java.lang.String r0 = "AndroidService"
            java.lang.String r2 = "Log write: I/O"
            android.ext.e1.e.b(r0, r2, r8)
        L29:
            return r1
    }

    public static java.lang.String n(java.lang.Throwable r5) {
            java.lang.String r0 = ""
            if (r5 != 0) goto L5
            return r0
        L5:
            r1 = r5
        L6:
            if (r1 == 0) goto L12
            boolean r2 = r1 instanceof java.net.UnknownHostException
            if (r2 == 0) goto Ld
            return r0
        Ld:
            java.lang.Throwable r1 = r1.getCause()
            goto L6
        L12:
            java.io.StringWriter r1 = new java.io.StringWriter
            r1.<init>()
            java.io.PrintWriter r2 = new java.io.PrintWriter
            r2.<init>(r1)
            r5.printStackTrace(r2)     // Catch: java.lang.Throwable -> L20 java.lang.OutOfMemoryError -> L3a
            goto L55
        L20:
            r5 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception on printStackTrace: "
            r3.append(r4)
            java.lang.String r5 = r5.getMessage()
            r3.append(r5)
            java.lang.String r5 = r3.toString()
        L36:
            r2.write(r5)
            goto L55
        L3a:
            java.lang.String r3 = "OutOfMemoryError 1\n"
            r2.write(r3)
        L3f:
            if (r5 == 0) goto L55
            java.lang.String r3 = r5.toString()     // Catch: java.lang.OutOfMemoryError -> L52
            r2.write(r3)     // Catch: java.lang.OutOfMemoryError -> L52
            java.lang.String r3 = "\n"
            r2.write(r3)     // Catch: java.lang.OutOfMemoryError -> L52
            java.lang.Throwable r5 = r5.getCause()     // Catch: java.lang.OutOfMemoryError -> L52
            goto L3f
        L52:
            java.lang.String r5 = "OutOfMemoryError 2\n"
            goto L36
        L55:
            r2.flush()
            java.lang.String r5 = r1.toString()
            if (r5 != 0) goto L5f
            goto L60
        L5f:
            r0 = r5
        L60:
            return r0
    }

    public static void o(java.lang.Process r2, java.io.InputStream r3) {
            if (r2 != 0) goto L3
            return
        L3:
            android.ext.e1$d r0 = new android.ext.e1$d
            java.lang.String r1 = "runLogOnProcessErrStream"
            r0.<init>(r1, r3, r2)
            r0.start()
            return
    }

    public static int p(java.lang.String r1) {
            java.lang.String r0 = "AndroidService"
            int r1 = q(r0, r1)
            return r1
    }

    public static int q(java.lang.String r0, java.lang.String r1) {
            int r0 = android.ext.e1.e.g(r0, r1)
            return r0
    }

    public static int r(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            int r0 = android.ext.e1.e.h(r0, r1, r2)
            return r0
    }

    public static int s(java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r0 = "AndroidService"
            int r1 = r(r0, r1, r2)
            return r1
    }
}
