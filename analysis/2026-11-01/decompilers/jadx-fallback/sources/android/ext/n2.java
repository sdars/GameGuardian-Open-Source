package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final android.os.Looper[] f1137a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final android.os.Handler[] f1138b = null;

    private static class a extends android.os.HandlerThread {
        public a(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                android.ext.n0.g(r0)
                return
        }
    }

    static {
            r0 = 4
            android.os.Looper[] r1 = new android.os.Looper[r0]
            android.os.Handler[] r0 = new android.os.Handler[r0]
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r3 = 0
            r1[r3] = r2
            android.os.Handler r2 = new android.os.Handler
            r4 = r1[r3]
            r2.<init>(r4)
            r0[r3] = r2
            android.ext.n2$a r2 = new android.ext.n2$a
            java.lang.String r3 = "Main"
            r2.<init>(r3)
            r2.start()
            android.os.Looper r2 = r2.getLooper()
            r3 = 1
            r1[r3] = r2
            android.os.Handler r2 = new android.os.Handler
            r4 = r1[r3]
            r2.<init>(r4)
            r0[r3] = r2
            android.ext.n2$a r2 = new android.ext.n2$a
            java.lang.String r3 = "Log"
            r2.<init>(r3)
            r2.start()
            android.os.Looper r2 = r2.getLooper()
            r3 = 2
            r1[r3] = r2
            android.os.Handler r2 = new android.os.Handler
            r4 = r1[r3]
            r2.<init>(r4)
            r0[r3] = r2
            android.ext.n2$a r2 = new android.ext.n2$a
            java.lang.String r3 = "Write"
            r2.<init>(r3)
            r2.start()
            android.os.Looper r2 = r2.getLooper()
            r3 = 3
            r1[r3] = r2
            android.os.Handler r2 = new android.os.Handler
            r4 = r1[r3]
            r2.<init>(r4)
            r0[r3] = r2
            android.ext.n2.f1137a = r1
            android.ext.n2.f1138b = r0
            return
    }

    public static void a() {
            r0 = 0
        L1:
            android.os.Looper[] r1 = android.ext.n2.f1137a
            int r2 = r1.length
            if (r0 >= r2) goto L15
            if (r0 != 0) goto L9
            goto L12
        L9:
            r1 = r1[r0]
            r1.quitSafely()     // Catch: java.lang.NoSuchMethodError -> Lf
            goto L12
        Lf:
            r1.quit()
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    private static android.os.Handler b(int r1) {
            android.os.Handler[] r0 = android.ext.n2.f1138b
            r1 = r0[r1]
            return r1
    }

    public static android.os.Handler c() {
            r0 = 1
            android.os.Handler r0 = b(r0)
            return r0
    }

    public static android.os.Handler d() {
            r0 = 0
            android.os.Handler r0 = b(r0)
            return r0
    }

    public static boolean e() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private static void f(int r4, java.lang.Runnable r5, boolean r6) {
            android.os.Looper[] r0 = android.ext.n2.f1137a
            java.lang.String r1 = "Bad implementation"
            java.lang.String r2 = "AndroidService"
            if (r0 != 0) goto L13
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "loopers"
            r4.<init>(r5)
            android.ext.e1.e.d(r2, r1, r4)
            return
        L13:
            r3 = r0[r4]
            if (r3 != 0) goto L36
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "loopers["
            r6.append(r0)
            r6.append(r4)
            r4 = 93
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            android.ext.e1.e.d(r2, r1, r5)
            return
        L36:
            android.os.Looper r1 = android.os.Looper.myLooper()
            r0 = r0[r4]
            if (r1 != r0) goto L44
            if (r6 != 0) goto L44
            r5.run()
            goto L4b
        L44:
            android.os.Handler[] r6 = android.ext.n2.f1138b
            r4 = r6[r4]
            r4.post(r5)
        L4b:
            return
    }

    public static void g(java.lang.Runnable r2) {
            r0 = 2
            r1 = 0
            f(r0, r2, r1)     // Catch: java.lang.Throwable -> L6
            goto Le
        L6:
            r2 = move-exception
            java.lang.String r0 = "AndroidService"
            java.lang.String r1 = "Bad implementation"
            android.ext.e1.e.d(r0, r1, r2)
        Le:
            return
    }

    public static void h(java.lang.Runnable r2) {
            r0 = 1
            r1 = 0
            f(r0, r2, r1)
            return
    }

    public static void i(java.lang.Runnable r1) {
            r0 = 0
            f(r0, r1, r0)
            return
    }

    public static void j(java.lang.Runnable r2) {
            r0 = 3
            r1 = 0
            f(r0, r2, r1)
            return
    }
}
