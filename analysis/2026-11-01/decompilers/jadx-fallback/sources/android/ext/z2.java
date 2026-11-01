package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class z2 {

    class a implements java.util.concurrent.Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f1442a;

        a(java.lang.String r1) {
                r0 = this;
                r0.f1442a = r1
                r0.<init>()
                return
        }

        public java.lang.Boolean a() {
                r1 = this;
                java.lang.String r0 = r1.f1442a
                byte[] r0 = r0.getBytes()
                boolean r0 = android.ext.z2.b(r0)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Object call() {
                r1 = this;
                java.lang.Boolean r0 = r1.a()
                return r0
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f1443a;

        b(java.lang.String r1) {
                r0 = this;
                r0.f1443a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                monitor-enter(r1)
                java.lang.String r0 = r1.f1443a     // Catch: java.lang.Throwable -> Lc
                byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> Lc
                android.ext.z2.b(r0)     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
                throw r0
        }
    }

    public static byte[] a(byte[] r2) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            int r1 = r2.length
            r0.<init>(r1)
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream
            r1.<init>(r0)
            r1.write(r2)
            r1.close()
            byte[] r2 = r0.toByteArray()
            r0.close()
            r0 = 0
            byte[] r2 = android.util.Base64.encode(r2, r0)
            return r2
    }

    static boolean b(byte[] r4) {
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L3e
            java.lang.String r1 = "kwws=22jdphjxdugldq1qhw2JJborjv2xvdjh1sks"
            java.lang.String r1 = android.ext.Tools.removeNewLinesChars(r1)     // Catch: java.lang.Exception -> L3e
            r0.<init>(r1)     // Catch: java.lang.Exception -> L3e
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Exception -> L3e
            r1 = 1
            r0.setDoOutput(r1)     // Catch: java.lang.Exception -> L3e
            java.io.OutputStream r1 = r0.getOutputStream()     // Catch: java.lang.Exception -> L3e
            byte[] r2 = a(r4)     // Catch: java.lang.Exception -> L3e
            r1.write(r2)     // Catch: java.lang.Exception -> L3e
            r1.close()     // Catch: java.lang.Exception -> L3e
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L3e
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L3e
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Exception -> L3e
            r3.<init>(r0)     // Catch: java.lang.Exception -> L3e
            r1.<init>(r3)     // Catch: java.lang.Exception -> L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3e
            r0.<init>()     // Catch: java.lang.Exception -> L3e
        L34:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Exception -> L3e
            if (r3 == 0) goto L40
            r0.append(r3)     // Catch: java.lang.Exception -> L3e
            goto L34
        L3e:
            r4 = move-exception
            goto L71
        L40:
            java.lang.String r1 = "OK"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L3e
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3e
            r1.<init>()     // Catch: java.lang.Exception -> L3e
            java.lang.String r3 = "UsageStats compress from "
            r1.append(r3)     // Catch: java.lang.Exception -> L3e
            int r4 = r4.length     // Catch: java.lang.Exception -> L3e
            r1.append(r4)     // Catch: java.lang.Exception -> L3e
            java.lang.String r4 = " to "
            r1.append(r4)     // Catch: java.lang.Exception -> L3e
            int r4 = r2.length     // Catch: java.lang.Exception -> L3e
            r1.append(r4)     // Catch: java.lang.Exception -> L3e
            java.lang.String r4 = ", sended: "
            r1.append(r4)     // Catch: java.lang.Exception -> L3e
            r1.append(r0)     // Catch: java.lang.Exception -> L3e
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Exception -> L3e
            android.ext.e1.d(r4)     // Catch: java.lang.Exception -> L3e
            return r0
        L71:
            java.lang.String r0 = "UsageStats send fail"
            android.ext.e1.g(r0, r4)
            r4 = 0
            return r4
    }

    public static boolean c(java.lang.String r1) {
            r0 = 0
            boolean r1 = d(r1, r0)
            return r1
    }

    public static boolean d(java.lang.String r3, boolean r4) {
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Boolean r1 = android.ext.f1.f951a
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto L11
            java.lang.String r3 = "NLV - log not sended"
            android.ext.e1.d(r3)
            return r1
        L11:
            java.lang.String r0 = "sendLog"
            if (r4 == 0) goto L33
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newSingleThreadExecutor()
            android.ext.z2$a r1 = new android.ext.z2$a
            r1.<init>(r3)
            java.util.concurrent.Future r3 = r4.submit(r1)
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L2d
            return r3
        L2d:
            r3 = move-exception
            android.ext.e1.s(r0, r3)
            r3 = 0
            return r3
        L33:
            android.ext.g0 r4 = new android.ext.g0
            android.ext.z2$b r2 = new android.ext.z2$b
            r2.<init>(r3)
            r4.<init>(r2, r0)
            r4.start()
            return r1
    }
}
