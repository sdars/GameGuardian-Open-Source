package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public final class r0 {

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.r0 f1235a;

        a(android.ext.r0 r1) {
                r0 = this;
                r0.f1235a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.ext.r0 r0 = r1.f1235a
                r0.a()
                return
        }
    }

    public r0(boolean r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L15
            android.ext.g0 r3 = new android.ext.g0
            android.ext.r0$a r0 = new android.ext.r0$a
            r0.<init>(r2)
            java.lang.String r1 = "FloatCheck"
            r3.<init>(r0, r1)
            r3.start()
            goto L18
        L15:
            r2.a()
        L18:
            return
    }

    private void b(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FloatCheck: float off by "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            android.ext.e1.d(r3)
            r3 = 0
            android.ext.m2.f1074a = r3
            return
    }

    private void c() {
            r4 = this;
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "getprop"
            r2 = 0
            r0[r2] = r1     // Catch: java.lang.Throwable -> L48
            java.lang.Process r0 = android.ext.Tools.I(r0)     // Catch: java.lang.Throwable -> L48
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L48
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L48
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> L48
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L48
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L48
        L1a:
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L4a
            java.lang.String r2 = "ro.build.remixos.version"
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L1a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r2.<init>()     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "Remix-detect: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L48
            r2.append(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L48
            android.ext.e1.d(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = "[2."
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L4a
            r4.b(r0)     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r0 = move-exception
            goto L4e
        L4a:
            r1.close()     // Catch: java.lang.Throwable -> L48
            goto L53
        L4e:
            java.lang.String r1 = "Remix-detect"
            android.ext.e1.l(r1, r0)
        L53:
            return
    }

    public static void d(boolean r3) {
            android.ext.g2 r0 = new android.ext.g2
            r0.<init>()
            java.lang.String r1 = "float-off"
            r2 = 0
            android.ext.g2 r3 = r0.c(r1, r3, r2)
            r3.commit()
            return
    }

    void a() {
            r3 = this;
            android.content.SharedPreferences r0 = android.ext.Tools.M0()
            java.lang.String r1 = "float-off"
            boolean r2 = r0.contains(r1)
            if (r2 == 0) goto L19
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L1c
            java.lang.String r0 = "pref"
            r3.b(r0)
            goto L1c
        L19:
            r3.c()
        L1c:
            return
    }
}
