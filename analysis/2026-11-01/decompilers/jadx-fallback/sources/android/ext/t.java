package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class t {

    class a implements java.lang.Runnable {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> La
                if (r0 == 0) goto Lc
                android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> La
                r0.Z()     // Catch: java.lang.Throwable -> La
                goto Lc
            La:
                r0 = move-exception
                goto Ld
            Lc:
                return
            Ld:
                java.lang.String r1 = "MainService onCreate fail"
                android.ext.e1.s(r1, r0)
                throw r0
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
                r2 = this;
                android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> La
                if (r0 == 0) goto L10
                android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> La
                r0.b0()     // Catch: java.lang.Throwable -> La
                goto L10
            La:
                r0 = move-exception
                java.lang.String r1 = "MainService onDestroy fail"
                android.ext.e1.s(r1, r0)
            L10:
                return
        }
    }

    public static void a() {
            java.lang.String r0 = "Bootstrap onDestroy"
            android.ext.e1.d(r0)
            android.ext.t$b r0 = new android.ext.t$b
            r0.<init>()
            android.ext.n2.i(r0)
            return
    }

    public static void b(android.content.Context r1) {
            android.ext.MainService r0 = android.ext.MainService.instance
            if (r0 == 0) goto L9
            java.lang.String r0 = "Bootstrap start: already"
            android.ext.e1.d(r0)
        L9:
            android.ext.MainService r0 = new android.ext.MainService
            android.content.Context r1 = a.b.i(r1)
            r0.<init>(r1)
            android.ext.t$a r1 = new android.ext.t$a
            r1.<init>()
            android.ext.n2.i(r1)
            return
    }

    public static void c() {
            java.lang.String r0 = "Bootstrap startService"
            android.ext.e1.d(r0)
            android.ext.MainService r0 = android.ext.MainService.instance
            if (r0 == 0) goto Lf
            java.lang.String r0 = "Bootstrap startService: already"
            android.ext.e1.d(r0)
            return
        Lf:
            boolean r0 = android.ext.u.c()
            if (r0 == 0) goto L1d
            android.ext.u r0 = android.ext.u.f1267b
            r1 = 0
            android.content.Context r0 = r0.b(r1)
            goto L26
        L1d:
            android.ext.v r0 = android.ext.v.f1277a
            if (r0 == 0) goto L24
            android.ext.v r0 = android.ext.v.f1277a
            goto L26
        L24:
            android.content.Context r0 = android.ext.MainService.context
        L26:
            if (r0 == 0) goto L2c
            b(r0)
            goto L31
        L2c:
            java.lang.String r0 = "Bootstrap startService: null"
            android.ext.e1.p(r0)
        L31:
            return
    }
}
