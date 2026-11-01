package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static java.lang.String f745a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f746b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static java.lang.String f747c = "su";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.String[] f748d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static volatile int f749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.Object f750f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f751g;
    private static int h;
    private static boolean i;
    private static android.ext.e2.c j;

    class a implements java.util.concurrent.Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String f753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean[] f754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ java.lang.StringBuilder f755d;

        a(java.lang.String r1, java.lang.String r2, boolean[] r3, java.lang.StringBuilder r4) {
                r0 = this;
                r0.f752a = r1
                r0.f753b = r2
                r0.f754c = r3
                r0.f755d = r4
                r0.<init>()
                return
        }

        public java.lang.String a() {
                r8 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "cmd ("
                r0.append(r1)
                java.lang.String r2 = r8.f752a
                r0.append(r2)
                java.lang.String r2 = ") start"
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                android.ext.e1.d(r0)
                boolean r0 = android.ext.Config.C
                java.lang.String r2 = ""
                if (r0 == 0) goto L26
                java.lang.String r0 = r8.f753b
                if (r2 != r0) goto L26
                goto L2c
            L26:
                java.lang.String r0 = r8.f753b
                java.lang.String r0 = android.ext.e2.h(r0)
            L2c:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "su ("
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = ") used"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                android.ext.e1.d(r3)
                r3 = 1
                if (r0 != r2) goto L53
                java.lang.String r0 = r8.f752a
                java.lang.String[] r0 = new java.lang.String[]{r0}
                java.lang.Process r0 = android.ext.Tools.I(r0)
                goto L59
            L53:
                java.lang.String r2 = r8.f752a
                java.lang.Process r0 = android.ext.e2.r(r2, r0, r3)
            L59:
                if (r0 != 0) goto L74
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "cmd fail: "
                r0.append(r1)
                java.lang.String r1 = android.ext.e2.f745a
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.ext.e1.i(r0)
                java.lang.String r0 = "cmd fail - got null"
                return r0
            L74:
                boolean[] r2 = r8.f754c
                r4 = 0
                r2[r4] = r3
                int r2 = android.ext.Tools.D0(r0)
                android.ext.e2.f749e = r2
                java.io.BufferedReader r3 = new java.io.BufferedReader
                java.io.InputStreamReader r5 = new java.io.InputStreamReader
                java.io.InputStream r6 = r0.getInputStream()
                r5.<init>(r6)
                r3.<init>(r5)
            L8d:
                java.lang.String r5 = r3.readLine()     // Catch: java.lang.Throwable -> Lbc
                if (r5 == 0) goto Lbe
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbc
                r6.<init>()     // Catch: java.lang.Throwable -> Lbc
                r6.append(r1)     // Catch: java.lang.Throwable -> Lbc
                java.lang.String r7 = r8.f752a     // Catch: java.lang.Throwable -> Lbc
                r6.append(r7)     // Catch: java.lang.Throwable -> Lbc
                java.lang.String r7 = ") out: "
                r6.append(r7)     // Catch: java.lang.Throwable -> Lbc
                r6.append(r5)     // Catch: java.lang.Throwable -> Lbc
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lbc
                android.ext.e1.d(r6)     // Catch: java.lang.Throwable -> Lbc
                java.lang.StringBuilder r6 = r8.f755d     // Catch: java.lang.Throwable -> Lbc
                r6.append(r5)     // Catch: java.lang.Throwable -> Lbc
                java.lang.StringBuilder r5 = r8.f755d     // Catch: java.lang.Throwable -> Lbc
                r6 = 10
                r5.append(r6)     // Catch: java.lang.Throwable -> Lbc
                goto L8d
            Lbc:
                r0 = move-exception
                goto L11a
            Lbe:
                r3.close()
                java.lang.StringBuilder r3 = r8.f755d
                java.lang.String r5 = "exit code: "
                r3.append(r5)
                java.lang.StringBuilder r3 = r8.f755d
                int r5 = r0.waitFor()
                r3.append(r5)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                java.lang.String r1 = r8.f752a
                r3.append(r1)
                java.lang.String r1 = ") exit: "
                r3.append(r1)
                int r0 = r0.exitValue()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                android.ext.e1.d(r0)
                if (r2 <= 0) goto L116
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L110
                r0.<init>()     // Catch: java.lang.Throwable -> L110
                java.lang.String r1 = "Kill at end: "
                r0.append(r1)     // Catch: java.lang.Throwable -> L110
                r0.append(r2)     // Catch: java.lang.Throwable -> L110
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L110
                android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L110
                android.os.Process.killProcess(r2)     // Catch: java.lang.Throwable -> L110
                java.lang.String r0 = "Kill at end: ok"
                android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L110
                goto L116
            L110:
                r0 = move-exception
                java.lang.String r1 = "Failed kill at end"
                android.ext.e1.g(r1, r0)
            L116:
                android.ext.e2.f749e = r4
                r0 = 0
                return r0
            L11a:
                r3.close()
                throw r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Object call() {
                r1 = this;
                java.lang.String r0 = r1.a()
                return r0
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
                r1 = this;
                r0 = 0
                int r0 = android.ext.e2.k(r0)
                android.ext.e2.a(r0)
                return
        }
    }

    interface c {
        void a(int r1);
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.String f756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f758c;

        d(java.lang.String r1, boolean r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.f756a = r1
                r0.f757b = r2
                r0.f758c = r3
                return
        }
    }

    static {
            android.content.SharedPreferences r0 = android.ext.Tools.M0()
            java.lang.String r1 = "su"
            java.lang.String r1 = r0.getString(r1, r1)
            android.ext.e2.f747c = r1
            java.lang.String r1 = "sh"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            android.ext.e2.f746b = r0
            java.lang.String r3 = "/debug_ramdisk"
            java.lang.String r4 = "/sbin"
            java.lang.String r5 = "/su/bin"
            java.lang.String r6 = "/magisk/.core/bin"
            java.lang.String r7 = "/magisk/phh/bin"
            java.lang.String r8 = "/system/xbin"
            java.lang.String[] r0 = new java.lang.String[]{r3, r4, r5, r6, r7, r8}
            android.ext.e2.f748d = r0
            android.ext.e2.f749e = r2
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            android.ext.e2.f750f = r0
            android.ext.e2.f751g = r2
            android.ext.e2.h = r2
            android.ext.e2.i = r2
            return
    }

    static /* synthetic */ void a(int r0) {
            d(r0)
            return
    }

    private static java.lang.String b() {
            java.lang.String r0 = "/debug_ramdisk"
            java.lang.String r1 = "/vendor/bin"
            java.lang.String r2 = "/system/bin"
            java.lang.String r3 = "/bin"
            java.lang.String r4 = "/data/local"
            java.lang.String r5 = "/data/local/bin"
            java.lang.String r6 = "/system/sd/bin"
            java.lang.String r7 = "/system/bin/failsafe"
            java.lang.String r8 = "/system/bin/bstk"
            java.lang.String r9 = "/su/bin"
            java.lang.String r10 = "/magisk/.core/bin"
            java.lang.String r11 = "/magisk/phh/bin"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            java.lang.String r0 = c(r0)
            return r0
    }

    private static java.lang.String c(java.lang.String[] r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            int r1 = r1 * 3
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        La:
            if (r2 >= r1) goto L2e
            r3 = r6[r2]
            r0.add(r3)
            java.lang.String r4 = "/bin"
            boolean r5 = r3.contains(r4)
            if (r5 == 0) goto L2b
            java.lang.String r5 = "/xbin"
            java.lang.String r5 = r3.replace(r4, r5)
            r0.add(r5)
            java.lang.String r5 = "/sbin"
            java.lang.String r3 = r3.replace(r4, r5)
            r0.add(r3)
        L2b:
            int r2 = r2 + 1
            goto La
        L2e:
            java.lang.String r6 = ":"
            java.lang.String r6 = android.text.TextUtils.join(r6, r0)
            return r6
    }

    private static void d(int r3) {
            java.lang.Object r0 = android.ext.e2.f750f
            monitor-enter(r0)
            android.ext.e2.h = r3     // Catch: java.lang.Throwable -> L17
            r1 = 1
            android.ext.e2.f751g = r1     // Catch: java.lang.Throwable -> L17
            r1 = 0
            android.ext.e2.i = r1     // Catch: java.lang.Throwable -> L17
            android.ext.e2$c r1 = android.ext.e2.j     // Catch: java.lang.Throwable -> L17
            r2 = 0
            android.ext.e2.j = r2     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L16
            r1.a(r3)
        L16:
            return
        L17:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    private static java.lang.String e(java.lang.String r2, java.io.InputStream r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ": "
            r0.append(r2)
            int r2 = r3.available()     // Catch: java.io.IOException -> L28
            if (r2 <= 0) goto L30
            byte[] r2 = new byte[r2]     // Catch: java.io.IOException -> L28
            int r3 = r3.read(r2)     // Catch: java.io.IOException -> L28
            if (r3 <= 0) goto L30
            java.lang.String r1 = new java.lang.String     // Catch: java.io.IOException -> L28
            byte[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch: java.io.IOException -> L28
            r1.<init>(r2)     // Catch: java.io.IOException -> L28
            r0.append(r1)     // Catch: java.io.IOException -> L28
            goto L30
        L28:
            r2 = move-exception
            java.lang.String r2 = r2.toString()
            r0.append(r2)
        L30:
            r2 = 10
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static java.lang.String[] f(boolean r10) {
            java.util.Map r0 = java.lang.System.getenv()
            int r1 = r0.size()
            java.lang.String r2 = "PATH"
            java.lang.Object r3 = r0.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L14
            int r1 = r1 + 1
        L14:
            java.lang.String[] r1 = new java.lang.String[r1]
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L1f:
            boolean r5 = r0.hasNext()
            r6 = 58
            if (r5 == 0) goto L8a
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r7 = r5.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            boolean r8 = r2.equals(r7)
            if (r8 == 0) goto L70
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            if (r10 == 0) goto L62
            r8.<init>()
            java.lang.String r9 = m()
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = b()
            r8.append(r9)
            r8.append(r6)
        L5a:
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            goto L70
        L62:
            r8.<init>()
            r8.append(r5)
            r8.append(r6)
            java.lang.String r5 = b()
            goto L5a
        L70:
            int r6 = r4 + 1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r7 = 61
            r8.append(r7)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r1[r4] = r5
            r4 = r6
            goto L1f
        L8a:
            if (r3 != 0) goto Lc0
            if (r10 == 0) goto La9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = m()
            r10.append(r0)
            r10.append(r6)
            java.lang.String r0 = b()
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            goto Lad
        La9:
            java.lang.String r10 = b()
        Lad:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "PATH="
            r0.append(r2)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r1[r4] = r10
        Lc0:
            return r1
    }

    public static java.lang.String g(java.lang.Process r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r3 == 0) goto L39
            java.lang.String r1 = "stdout"
            java.io.InputStream r2 = r3.getInputStream()
            java.lang.String r1 = e(r1, r2)
            r0.append(r1)
            java.lang.String r1 = "stderr"
            java.io.InputStream r2 = r3.getErrorStream()
            java.lang.String r1 = e(r1, r2)
            r0.append(r1)
            java.lang.String r1 = "exit value: "
            r0.append(r1)
            int r3 = r3.exitValue()     // Catch: java.lang.IllegalThreadStateException -> L2e
            r0.append(r3)     // Catch: java.lang.IllegalThreadStateException -> L2e
            goto L33
        L2e:
            java.lang.String r3 = "already run"
            r0.append(r3)
        L33:
            r3 = 10
            r0.append(r3)
            goto L3e
        L39:
            java.lang.String r3 = "process is null\n"
            r0.append(r3)
        L3e:
            java.lang.String r3 = r0.toString()
            return r3
    }

    static java.lang.String h(java.lang.String r1) {
            boolean r0 = android.ext.Config.C
            if (r0 == 0) goto L7
            java.lang.String r1 = "sh"
            return r1
        L7:
            if (r1 == 0) goto La
            goto Lc
        La:
            java.lang.String r1 = android.ext.e2.f747c
        Lc:
            return r1
    }

    static void i(android.ext.e2.c r3) {
            java.lang.Object r0 = android.ext.e2.f750f
            monitor-enter(r0)
            boolean r1 = android.ext.e2.f751g     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            int r1 = android.ext.e2.h     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            r3.a(r1)
            return
        Le:
            r3 = move-exception
            goto L2c
        L10:
            android.ext.e2.j = r3     // Catch: java.lang.Throwable -> Le
            boolean r3 = android.ext.e2.i     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L18:
            r3 = 1
            android.ext.e2.i = r3     // Catch: java.lang.Throwable -> Le
            android.ext.n0$i r3 = new android.ext.n0$i     // Catch: java.lang.Throwable -> Le
            android.ext.e2$b r1 = new android.ext.e2$b     // Catch: java.lang.Throwable -> Le
            r1.<init>()     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = "RootProbe"
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> Le
            r3.start()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    static android.ext.e2.d j(java.lang.String r2) {
            java.lang.String r0 = "exec id"
            r1 = 20
            android.ext.e2$d r2 = p(r0, r1, r2)
            return r2
    }

    static int k(java.lang.String r3) {
            r0 = 0
            android.ext.e2$d r3 = j(r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = ""
            android.ext.e2.f745a = r1     // Catch: java.lang.Throwable -> L14
            boolean r1 = r3.f758c     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            java.lang.String r3 = "root probe refused: no root shell could be started"
            android.ext.e1.d(r3)     // Catch: java.lang.Throwable -> L14
            r3 = -1
            return r3
        L14:
            r3 = move-exception
            goto L43
        L16:
            boolean r1 = r3.f757b     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L20
            java.lang.String r3 = "root probe unanswered: bound expired after 20s"
            android.ext.e1.d(r3)     // Catch: java.lang.Throwable -> L14
            return r0
        L20:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "root probe: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = r3.f756a     // Catch: java.lang.Throwable -> L14
            r1.append(r2)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L14
            android.ext.e1.d(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = r3.f756a     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "uid=0"
            boolean r3 = r3.contains(r1)     // Catch: java.lang.Throwable -> L14
            if (r3 == 0) goto L42
            r3 = 1
            return r3
        L42:
            return r0
        L43:
            java.lang.String r1 = "Failed root probe"
            android.ext.e1.l(r1, r3)
            return r0
    }

    private static java.lang.String l() {
            java.lang.String[] r0 = android.ext.e2.f748d
            int r1 = r0.length
            r2 = 0
        L4:
            java.lang.String r3 = "su"
            if (r2 >= r1) goto L37
            r4 = r0[r2]
            java.io.File r5 = new java.io.File
            r5.<init>(r4, r3)
            boolean r3 = r5.isFile()
            if (r3 == 0) goto L34
            boolean r3 = r5.canExecute()
            if (r3 == 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "absolute su fallback selected: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            java.lang.String r0 = r5.getAbsolutePath()
            return r0
        L34:
            int r2 = r2 + 1
            goto L4
        L37:
            java.lang.String r0 = "no absolute su candidate usable; falling back to bare su"
            android.ext.e1.d(r0)
            return r3
    }

    private static java.lang.String m() {
            java.lang.String r0 = "/debug_ramdisk"
            java.lang.String r1 = "/su/bin"
            java.lang.String r2 = "/magisk/.core/bin"
            java.lang.String r3 = "/magisk/phh/bin"
            java.lang.String r4 = "/system/xbin"
            java.lang.String r5 = "/system/sbin"
            java.lang.String r6 = "/system/bin/failsafe"
            java.lang.String r7 = "/system/bin/bstk"
            java.lang.String r8 = "/bin"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            java.lang.String r0 = c(r0)
            return r0
    }

    public static java.lang.String n(java.lang.String r1, int r2) {
            r0 = 0
            java.lang.String r1 = o(r1, r2, r0)
            java.lang.String r2 = ""
            android.ext.e2.f745a = r2
            return r1
    }

    public static java.lang.String o(java.lang.String r0, int r1, java.lang.String r2) {
            android.ext.e2$d r0 = p(r0, r1, r2)
            java.lang.String r0 = r0.f756a
            return r0
    }

    private static android.ext.e2.d p(java.lang.String r8, int r9, java.lang.String r10) {
            java.lang.String r0 = "cmd ("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 1
            boolean[] r3 = new boolean[r2]
            r4 = 0
            r3[r4] = r4
            android.ext.e2.f749e = r4
            java.util.concurrent.FutureTask r5 = new java.util.concurrent.FutureTask
            android.ext.e2$a r6 = new android.ext.e2$a
            r6.<init>(r8, r10, r3, r1)
            r5.<init>(r6)
            android.ext.n0$i r10 = new android.ext.n0$i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "runCmd: "
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r10.<init>(r5, r6)
            r10.start()
            long r6 = (long) r9
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.TimeoutException -> L39 java.util.concurrent.ExecutionException -> L3b
            r5.get(r6, r10)     // Catch: java.util.concurrent.TimeoutException -> L39 java.util.concurrent.ExecutionException -> L3b
            goto L83
        L39:
            r10 = move-exception
            goto L3d
        L3b:
            r9 = move-exception
            goto L60
        L3d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r8)
            java.lang.String r8 = ") exit: timeout "
            r5.append(r8)
            r5.append(r9)
            java.lang.String r8 = r5.toString()
            android.ext.e1.g(r8, r10)
            java.lang.String r8 = "timeout: "
            r1.append(r8)
            r1.append(r9)
            goto L84
        L60:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r10.append(r8)
            java.lang.String r8 = ") expection"
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            android.ext.e1.l(r8, r9)
            java.lang.String r8 = "expection: "
            r1.append(r8)
            java.lang.String r8 = r9.getMessage()
            r1.append(r8)
        L83:
            r2 = 0
        L84:
            int r8 = android.ext.e2.f749e
            if (r8 <= 0) goto Lab
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La5
            r9.<init>()     // Catch: java.lang.Throwable -> La5
            java.lang.String r10 = "Kill: "
            r9.append(r10)     // Catch: java.lang.Throwable -> La5
            r9.append(r8)     // Catch: java.lang.Throwable -> La5
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> La5
            android.ext.e1.d(r9)     // Catch: java.lang.Throwable -> La5
            android.os.Process.killProcess(r8)     // Catch: java.lang.Throwable -> La5
            java.lang.String r8 = "Kill: ok"
            android.ext.e1.d(r8)     // Catch: java.lang.Throwable -> La5
            goto Lab
        La5:
            r8 = move-exception
            java.lang.String r9 = "Failed kill"
            android.ext.e1.g(r9, r8)
        Lab:
            android.ext.e2.f749e = r4
            android.ext.e2$d r8 = new android.ext.e2$d
            java.lang.String r9 = r1.toString()
            boolean r10 = r3[r4]
            r8.<init>(r9, r2, r10)
            return r8
    }

    public static java.lang.Process q(java.lang.String r2) {
            r0 = 0
            r1 = 0
            java.lang.Process r2 = r(r2, r0, r1)
            return r2
    }

    public static java.lang.Process r(java.lang.String r10, java.lang.String r11, boolean r12) {
            java.lang.String r0 = "su"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "try: "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            android.ext.e1.d(r2)
            java.lang.String r2 = "exec"
            boolean r2 = r10.contains(r2)
            if (r2 != 0) goto L34
            java.lang.String r2 = "exit"
            boolean r2 = r10.contains(r2)
            if (r2 == 0) goto L2c
            goto L34
        L2c:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r11 = "You forgot exec or exit"
            r10.<init>(r11)
            throw r10
        L34:
            java.lang.String r2 = "/emulated/0"
            boolean r2 = r10.contains(r2)
            if (r2 == 0) goto L50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Possible bugged call to /emulated/0 from root: "
            r2.append(r4)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            android.ext.e1.p(r2)
        L50:
            r1.append(r3)
            r1.append(r10)
            r2 = 10
            r1.append(r2)
            java.lang.String r3 = h(r11)
            java.lang.String r4 = "su: "
            r1.append(r4)
            r1.append(r3)
            r1.append(r2)
            boolean r4 = android.ext.Config.C
            if (r4 != 0) goto L8c
            boolean r4 = android.ext.e2.f746b
            if (r4 == 0) goto L8c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "exec "
            r4.append(r5)
            r4.append(r3)
            r4.append(r2)
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            java.lang.String r4 = "sh"
            goto L8d
        L8c:
            r4 = r3
        L8d:
            java.lang.String[] r5 = new java.lang.String[]{r4}
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "suCmd: '"
            r6.append(r7)
            r6.append(r11)
            java.lang.String r11 = "'; su: '"
            r6.append(r11)
            r6.append(r3)
            java.lang.String r11 = "'; runBin: '"
            r6.append(r11)
            r6.append(r4)
            r11 = 39
            r6.append(r11)
            java.lang.String r11 = r6.toString()
            android.ext.e1.d(r11)
            r11 = 0
            r3 = 0
            r6 = 0
        Lbd:
            r7 = 2
            if (r6 >= r7) goto L17b
            if (r6 == 0) goto L104
            r7 = 1
            if (r6 != r7) goto Lfe
            java.lang.String r8 = "exec 1 start"
            android.ext.e1.d(r8)     // Catch: java.lang.Throwable -> Ld9
            boolean r8 = r0.equals(r4)     // Catch: java.lang.Throwable -> Ld9
            if (r8 == 0) goto Ldc
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r8 = l()     // Catch: java.lang.Throwable -> Ld9
            r7[r11] = r8     // Catch: java.lang.Throwable -> Ld9
            goto Ldd
        Ld9:
            r7 = move-exception
            goto L159
        Ldc:
            r7 = r5
        Ldd:
            boolean r8 = r0.equals(r4)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String[] r8 = f(r8)     // Catch: java.lang.Throwable -> Ld9
            java.lang.Process r3 = android.ext.Tools.J(r7, r8)     // Catch: java.lang.Throwable -> Ld9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld9
            r7.<init>()     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r8 = "exec 1 end: "
            r7.append(r8)     // Catch: java.lang.Throwable -> Ld9
            r7.append(r3)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Ld9
        Lfa:
            android.ext.e1.d(r7)     // Catch: java.lang.Throwable -> Ld9
            goto L11f
        Lfe:
            java.lang.IllegalAccessException r7 = new java.lang.IllegalAccessException     // Catch: java.lang.Throwable -> Ld9
            r7.<init>()     // Catch: java.lang.Throwable -> Ld9
            throw r7     // Catch: java.lang.Throwable -> Ld9
        L104:
            java.lang.String r7 = "exec 0 start"
            android.ext.e1.d(r7)     // Catch: java.lang.Throwable -> Ld9
            java.lang.Process r3 = android.ext.Tools.I(r5)     // Catch: java.lang.Throwable -> Ld9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld9
            r7.<init>()     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r8 = "exec 0 end: "
            r7.append(r8)     // Catch: java.lang.Throwable -> Ld9
            r7.append(r3)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Ld9
            goto Lfa
        L11f:
            java.io.DataOutputStream r7 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> Ld9
            java.io.OutputStream r8 = r3.getOutputStream()     // Catch: java.lang.Throwable -> Ld9
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Ld9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld9
            r8.<init>()     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r9 = android.ext.Tools.F0(r10)     // Catch: java.lang.Throwable -> Ld9
            r8.append(r9)     // Catch: java.lang.Throwable -> Ld9
            r8.append(r2)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Ld9
            r7.writeBytes(r8)     // Catch: java.lang.Throwable -> Ld9
            r7.flush()     // Catch: java.lang.Throwable -> Ld9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld9
            r7.<init>()     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r8 = "process started: "
            r7.append(r8)     // Catch: java.lang.Throwable -> Ld9
            r7.append(r6)     // Catch: java.lang.Throwable -> Ld9
            r7.append(r2)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Ld9
            r1.append(r7)     // Catch: java.lang.Throwable -> Ld9
            goto L174
        L159:
            if (r7 == 0) goto L16a
            java.lang.String r8 = r7.toString()
            r1.append(r8)
            r1.append(r2)
            java.lang.Throwable r7 = r7.getCause()
            goto L159
        L16a:
            r1.append(r2)
            java.lang.String r7 = g(r3)
            r1.append(r7)
        L174:
            if (r3 == 0) goto L177
            goto L17b
        L177:
            int r6 = r6 + 1
            goto Lbd
        L17b:
            java.lang.String r10 = "tryRoot end"
            android.ext.e1.d(r10)
            if (r12 == 0) goto L188
            java.lang.String r10 = r1.toString()
            android.ext.e2.f745a = r10
        L188:
            return r3
    }
}
