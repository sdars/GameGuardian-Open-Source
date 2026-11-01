package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class x2 {

    class a implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.e f1310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f1311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean[] f1312c;

        a(a.e r1, java.lang.Runnable r2, boolean[] r3) {
                r0 = this;
                r0.f1310a = r1
                r0.f1311b = r2
                r0.f1312c = r3
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r2, int r3) {
                r1 = this;
                java.lang.String r2 = "Un: no"
                android.ext.e1.d(r2)
                a.e r2 = r1.f1310a
                java.lang.Runnable r3 = r1.f1311b
                boolean r2 = android.ext.x2.r(r2, r3)
                if (r2 == 0) goto L15
                boolean[] r2 = r1.f1312c
                r3 = 0
                r0 = 1
                r2[r3] = r0
            L15:
                return
        }
    }

    class b implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean[] f1313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.content.DialogInterface.OnClickListener f1314b;

        b(boolean[] r1, android.content.DialogInterface.OnClickListener r2) {
                r0 = this;
                r0.f1313a = r1
                r0.f1314b = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r4, int r5) {
                r3 = this;
                boolean[] r0 = r3.f1313a
                r1 = 0
                r2 = 1
                r0[r1] = r2
                android.content.DialogInterface$OnClickListener r0 = r3.f1314b
                r0.onClick(r4, r5)
                return
        }
    }

    class c implements android.content.DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean[] f1315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f1316b;

        c(boolean[] r1, java.lang.Runnable r2) {
                r0 = this;
                r0.f1315a = r1
                r0.f1316b = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r2) {
                r1 = this;
                boolean[] r2 = r1.f1315a
                r0 = 0
                boolean r2 = r2[r0]
                if (r2 != 0) goto Lc
                java.lang.Runnable r2 = r1.f1316b
                r2.run()
            Lc:
                return
        }
    }

    class d implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f1318b;

        d(int r1, a.e r2) {
                r0 = this;
                r0.f1317a = r1
                r0.f1318b = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r3, int r4) {
                r2 = this;
                r3 = -3
                if (r4 != r3) goto L14
                android.ext.g2 r3 = new android.ext.g2
                r3.<init>()
                java.lang.String r4 = "skip-old"
                int r0 = r2.f1317a
                android.ext.g2 r3 = r3.f(r4, r0)
                r3.commit()
                return
            L14:
                r3 = 0
                r4 = 0
            L16:
                a.e r0 = r2.f1318b
                int r0 = r0.size()
                if (r3 >= r0) goto L38
                a.e r0 = r2.f1318b
                java.lang.Object r0 = r0.valueAt(r3)
                android.ext.x2$h r0 = (android.ext.x2.h) r0
                java.lang.String r0 = r0.f1323a
                boolean r1 = android.ext.Tools.e1(r0)
                if (r1 == 0) goto L35
                boolean r0 = android.ext.x2.t(r0)
                if (r0 == 0) goto L35
                r4 = 1
            L35:
                int r3 = r3 + 1
                goto L16
            L38:
                if (r4 == 0) goto L3e
                android.ext.s1.H()
                goto L41
            L3e:
                android.ext.s1.e()
            L41:
                return
        }
    }

    class e implements android.content.DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f1319a;

        e(java.lang.Runnable r1) {
                r0 = this;
                r0.f1319a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r1) {
                r0 = this;
                java.lang.Runnable r1 = r0.f1319a
                r1.run()
                return
        }
    }

    class f implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f1320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String f1321b;

        f(java.lang.Runnable r1, java.lang.String r2) {
                r0 = this;
                r0.f1320a = r1
                r0.f1321b = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.Runnable r2 = r0.f1320a
                r1.append(r2)
                java.lang.String r2 = ": 120"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.ext.e1.d(r1)
                java.lang.String r1 = r0.f1321b
                android.ext.x2.t(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.Runnable r2 = r0.f1320a
                r1.append(r2)
                java.lang.String r2 = ": 130"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.ext.e1.d(r1)
                return
        }
    }

    class g extends java.io.FileInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f1322a;

        g(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.f1322a = r2
                r0.<init>(r1)
                return
        }

        @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r2 = this;
                super.close()
                java.io.File r0 = new java.io.File
                java.lang.String r1 = r2.f1322a
                r0.<init>(r1)
                r0.delete()
                return
        }

        @Override // java.io.FileInputStream
        protected void finalize() {
                r2 = this;
                super.finalize()
                java.io.File r0 = new java.io.File
                java.lang.String r1 = r2.f1322a
                r0.<init>(r1)
                r0.delete()
                return
        }
    }

    private static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.String f1323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        java.lang.String f1325c;

        public h(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.f1323a = r1
                r0.f1324b = r2
                r0.f1325c = r3
                return
        }
    }

    private static class i extends java.io.InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.io.InputStream f1326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final byte[] f1329d;

        public i(java.io.InputStream r1) {
                r0 = this;
                r0.<init>()
                r0.f1326a = r1
                r1 = 0
                r0.f1327b = r1
                r0.f1328c = r1
                r1 = 512(0x200, float:7.17E-43)
                byte[] r1 = new byte[r1]
                r0.f1329d = r1
                return
        }

        public java.lang.String a() {
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "buf["
                r0.append(r1)
                int r1 = r6.f1327b
                r0.append(r1)
                java.lang.String r1 = "]: "
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                int r1 = r6.f1327b
                byte[] r2 = r6.f1329d
                int r2 = r2.length
                r3 = 0
                if (r1 > r2) goto L39
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = new java.lang.String
                byte[] r2 = r6.f1329d
                int r4 = r6.f1328c
                r0.<init>(r2, r3, r4)
            L31:
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                goto L59
            L39:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = new java.lang.String
                byte[] r2 = r6.f1329d
                int r4 = r6.f1328c
                int r5 = r2.length
                int r5 = r5 - r4
                r0.<init>(r2, r4, r5)
                r1.append(r0)
                java.lang.String r0 = new java.lang.String
                byte[] r2 = r6.f1329d
                int r4 = r6.f1328c
                r0.<init>(r2, r3, r4)
                goto L31
            L59:
                return r0
        }

        @Override // java.io.InputStream
        public int available() {
                r1 = this;
                java.io.InputStream r0 = r1.f1326a
                int r0 = r0.available()
                return r0
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                java.io.InputStream r0 = r1.f1326a
                r0.close()
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                java.io.InputStream r0 = r1.f1326a
                boolean r2 = r0.equals(r2)
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.io.InputStream r0 = r1.f1326a
                int r0 = r0.hashCode()
                return r0
        }

        @Override // java.io.InputStream
        public void mark(int r2) {
                r1 = this;
                java.io.InputStream r0 = r1.f1326a
                r0.mark(r2)
                return
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
                r1 = this;
                java.io.InputStream r0 = r1.f1326a
                boolean r0 = r0.markSupported()
                return r0
        }

        @Override // java.io.InputStream
        public int read() {
                r4 = this;
                java.io.InputStream r0 = r4.f1326a
                int r0 = r0.read()
                if (r0 <= 0) goto L1b
                int r1 = r4.f1327b
                int r1 = r1 + 1
                r4.f1327b = r1
                byte[] r1 = r4.f1329d
                int r2 = r4.f1328c
                byte r3 = (byte) r0
                r1[r2] = r3
                int r2 = r2 + 1
                int r1 = r1.length
                int r2 = r2 % r1
                r4.f1328c = r2
            L1b:
                return r0
        }

        @Override // java.io.InputStream
        public void reset() {
                r1 = this;
                java.io.InputStream r0 = r1.f1326a
                r0.reset()
                return
        }

        @Override // java.io.InputStream
        public long skip(long r2) {
                r1 = this;
                java.io.InputStream r0 = r1.f1326a
                long r2 = r0.skip(r2)
                return r2
        }

        public java.lang.String toString() {
                r1 = this;
                java.io.InputStream r0 = r1.f1326a
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static java.io.InputStream a(java.lang.String r11, int r12) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = android.ext.Tools.K0()
            r0.append(r1)
            java.lang.String r1 = "/tmp.file.tmp"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.content.Context r2 = android.ext.Tools.f0()
            r3 = 0
            java.io.File r2 = r2.getExternalFilesDir(r3)
            if (r2 == 0) goto L3d
            r2.mkdirs()
            boolean r4 = r2.exists()
            if (r4 == 0) goto L3d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = r2.getAbsolutePath()
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            goto L3e
        L3d:
            r1 = r3
        L3e:
            if (r1 != 0) goto L41
            r1 = r0
        L41:
            r2 = 5
            java.lang.String[][] r4 = new java.lang.String[r2][]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "exec cat "
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            java.lang.String[] r5 = new java.lang.String[]{r5, r3}
            r6 = 0
            r4[r6] = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "exec dalvikvm -cp "
            r5.append(r7)
            java.lang.String r7 = android.ext.Tools.W()
            r5.append(r7)
            r7 = 32
            r5.append(r7)
            java.lang.Class<android.ext.Cat> r8 = android.ext.Cat.class
            java.lang.String r8 = r8.getName()
            r5.append(r8)
            r5.append(r7)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            java.lang.String[] r5 = new java.lang.String[]{r5, r3}
            r8 = 1
            r4[r8] = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "exec cp "
            r5.append(r9)
            r5.append(r11)
            r5.append(r7)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String[] r5 = new java.lang.String[]{r5, r1}
            r10 = 2
            r4[r10] = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r9)
            r5.append(r11)
            r5.append(r7)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String[] r0 = new java.lang.String[]{r5, r0}
            r5 = 3
            r4[r5] = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r0.append(r11)
            r0.append(r7)
            java.lang.String r11 = "/emulated/0"
            java.lang.String r5 = "/emulated/legacy"
            java.lang.String r11 = r1.replace(r11, r5)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.String[] r11 = new java.lang.String[]{r11, r1}
            r0 = 4
            r4[r0] = r11
            if (r12 < r2) goto Led
            return r3
        Led:
            r11 = r4[r12]
            r12 = r11[r6]
            java.lang.Process r12 = android.ext.e2.q(r12)
            if (r12 != 0) goto L110
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Failed run "
            r12.append(r0)
            java.lang.String r11 = java.util.Arrays.toString(r11)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            android.ext.e1.p(r11)
            return r3
        L110:
            r0 = r11[r8]     // Catch: java.io.IOException -> L11a
            if (r0 != 0) goto L11c
            java.io.InputStream r11 = r12.getInputStream()     // Catch: java.io.IOException -> L11a
            r3 = r11
            goto L147
        L11a:
            r11 = move-exception
            goto L142
        L11c:
            r12.waitFor()     // Catch: java.io.IOException -> L11a java.lang.InterruptedException -> L120
            goto L137
        L120:
            r12 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L11a
            r0.<init>()     // Catch: java.io.IOException -> L11a
            java.lang.String r1 = "Wait fail: "
            r0.append(r1)     // Catch: java.io.IOException -> L11a
            r1 = r11[r6]     // Catch: java.io.IOException -> L11a
            r0.append(r1)     // Catch: java.io.IOException -> L11a
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L11a
            android.ext.e1.s(r0, r12)     // Catch: java.io.IOException -> L11a
        L137:
            r12 = r11[r8]     // Catch: java.io.IOException -> L11a
            android.ext.x2$g r0 = new android.ext.x2$g     // Catch: java.io.IOException -> L11a
            r11 = r11[r8]     // Catch: java.io.IOException -> L11a
            r0.<init>(r11, r12)     // Catch: java.io.IOException -> L11a
            r3 = r0
            goto L147
        L142:
            java.lang.String r12 = "Failed read xml"
            android.ext.e1.s(r12, r11)
        L147:
            return r3
    }

    private static void b(java.io.File r16, java.io.File r17, java.lang.String r18) {
            r1 = r16
            r2 = 0
            r3 = 0
        L4:
            r4 = 10
            if (r3 >= r4) goto L108
            java.lang.String r0 = r16.getAbsolutePath()
            java.io.InputStream r0 = i(r0, r3)
            if (r0 != 0) goto L18
            r10 = r17
            r8 = r18
            goto L104
        L18:
            java.io.BufferedReader r5 = new java.io.BufferedReader
            java.io.InputStreamReader r6 = new java.io.InputStreamReader
            r6.<init>(r0)
            r5.<init>(r6)
            r6 = 0
        L23:
            java.lang.String r0 = r5.readLine()     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto Le5
            int r6 = r6 + 1
            java.lang.String r7 = "_preferences.xml"
            boolean r7 = r0.endsWith(r7)     // Catch: java.lang.Throwable -> L4f
            if (r7 != 0) goto L3b
            java.lang.String r7 = ".xml"
            boolean r7 = r0.endsWith(r7)     // Catch: java.lang.Throwable -> L4f
            if (r7 != 0) goto L41
        L3b:
            r10 = r17
            r8 = r18
            goto Le1
        L41:
            java.lang.String r7 = "/"
            boolean r7 = r0.startsWith(r7)     // Catch: java.lang.Throwable -> L4f
            if (r7 == 0) goto L56
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L4f
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L4f
            goto L5b
        L4f:
            r0 = move-exception
            r10 = r17
            r8 = r18
            goto Led
        L56:
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L4f
            r7.<init>(r1, r0)     // Catch: java.lang.Throwable -> L4f
        L5b:
            java.lang.String r0 = r7.getName()     // Catch: java.lang.Throwable -> L4f
            r8 = r18
            boolean r9 = r0.equals(r8)     // Catch: java.lang.Throwable -> Ldd
            if (r9 != 0) goto L6f
            java.lang.String r9 = "DefaultStorage.xml"
            boolean r0 = r0.equals(r9)     // Catch: java.lang.Throwable -> Ldd
            if (r0 == 0) goto L73
        L6f:
            r10 = r17
            goto Le1
        L73:
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r0 = r7.getName()     // Catch: java.lang.Throwable -> Ldd
            r10 = r17
            r9.<init>(r10, r0)     // Catch: java.lang.Throwable -> Lb7
            r17.mkdirs()     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = r9.exists()     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto L88
            goto Le1
        L88:
            r11 = 0
        L89:
            if (r11 >= r4) goto Le1
            java.lang.String r0 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> Lb7
            java.io.InputStream r0 = a(r0, r11)     // Catch: java.lang.Throwable -> Lb7
            if (r0 != 0) goto L96
            goto Ld8
        L96:
            r12 = 8192(0x2000, float:1.148E-41)
            byte[] r12 = new byte[r12]     // Catch: java.lang.Throwable -> Lb7 java.io.IOException -> Lbf
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lb7 java.io.IOException -> Lbf
            r13.<init>(r9)     // Catch: java.lang.Throwable -> Lb7 java.io.IOException -> Lbf
            r14 = 0
        La0:
            int r15 = r0.read(r12)     // Catch: java.lang.Throwable -> Lae
            r4 = -1
            if (r15 == r4) goto Lb0
            r13.write(r12, r2, r15)     // Catch: java.lang.Throwable -> Lae
            int r14 = r14 + r15
            r4 = 10
            goto La0
        Lae:
            r0 = move-exception
            goto Lbb
        Lb0:
            r13.close()     // Catch: java.lang.Throwable -> Lb7 java.io.IOException -> Lb9
            r0.close()     // Catch: java.lang.Throwable -> Lb7 java.io.IOException -> Lb9
            goto Ld5
        Lb7:
            r0 = move-exception
            goto Led
        Lb9:
            r0 = move-exception
            goto Lc1
        Lbb:
            r13.close()     // Catch: java.lang.Throwable -> Lb7 java.io.IOException -> Lb9
            throw r0     // Catch: java.lang.Throwable -> Lb7 java.io.IOException -> Lb9
        Lbf:
            r0 = move-exception
            r14 = 0
        Lc1:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r4.<init>()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r12 = "Failed read data from "
            r4.append(r12)     // Catch: java.lang.Throwable -> Lb7
            r4.append(r7)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lb7
            android.ext.e1.s(r4, r0)     // Catch: java.lang.Throwable -> Lb7
        Ld5:
            if (r14 <= 0) goto Ld8
            goto Le1
        Ld8:
            int r11 = r11 + 1
            r4 = 10
            goto L89
        Ldd:
            r0 = move-exception
            r10 = r17
            goto Led
        Le1:
            r4 = 10
            goto L23
        Le5:
            r10 = r17
            r8 = r18
            r5.close()     // Catch: java.lang.Throwable -> Lb7
            goto L101
        Led:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed read list from "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.ext.e1.s(r4, r0)
        L101:
            if (r6 <= 0) goto L104
            goto L108
        L104:
            int r3 = r3 + 1
            goto L4
        L108:
            return
    }

    private static boolean c(a.e r15) {
            java.lang.String r0 = android.ext.MainService.G0
            java.io.File r0 = g(r0)
            boolean r1 = h()
            r2 = 0
            if (r1 == 0) goto Le
            return r2
        Le:
            android.content.SharedPreferences r1 = android.ext.Tools.M0()
            java.util.HashMap r8 = new java.util.HashMap
            java.util.Map r3 = r1.getAll()
            r8.<init>(r3)
            android.content.SharedPreferences$Editor r9 = r1.edit()
            java.lang.String r10 = r0.getAbsolutePath()
            java.lang.String r11 = android.ext.Tools.C0()
            java.lang.String r1 = "DefaultStorage"
            java.io.File r12 = g(r1)
            boolean r1 = r12.exists()
            if (r1 == 0) goto L41
            r7 = 1
            r1 = r10
            r2 = r11
            r3 = r0
            r4 = r8
            r5 = r9
            r6 = r11
            boolean r2 = d(r1, r2, r3, r4, r5, r6, r7)
            r12.delete()
        L41:
            int r1 = r15.size()
            r12 = 1
            int r1 = r1 - r12
            r13 = r1
            r14 = r2
        L49:
            if (r13 < 0) goto L63
            java.lang.Object r1 = r15.valueAt(r13)
            android.ext.x2$h r1 = (android.ext.x2.h) r1
            java.lang.String r6 = r1.f1323a
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r0
            r4 = r8
            r5 = r9
            boolean r1 = d(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L60
            r14 = 1
        L60:
            int r13 = r13 + (-1)
            goto L49
        L63:
            int r15 = n(r9, r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "New: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = " from "
            r0.append(r15)
            int r15 = r8.size()
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            android.ext.e1.d(r15)
            java.lang.String r15 = "installed"
            android.content.SharedPreferences$Editor r15 = r9.putBoolean(r15, r12)
            r15.commit()
            return r14
    }

    private static boolean d(java.lang.String r4, java.lang.String r5, java.io.File r6, java.util.Map r7, android.content.SharedPreferences.Editor r8, java.lang.String r9, boolean r10) {
            java.lang.String r0 = r4.replace(r5, r9)
            r1 = 0
            if (r10 != 0) goto Le
            boolean r2 = r4.equals(r0)
            if (r2 == 0) goto Le
            return r1
        Le:
            if (r10 != 0) goto L26
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            java.io.File r2 = r2.getParentFile()
            java.io.File r6 = r6.getParentFile()
            java.lang.String r3 = android.ext.MainService.G0
            java.lang.String r3 = r3.replace(r5, r9)
            b(r2, r6, r3)
        L26:
            if (r10 == 0) goto L2a
            r6 = 0
            goto L2e
        L2a:
            java.util.HashMap r6 = k(r0)
        L2e:
            if (r6 != 0) goto L43
            java.lang.String r6 = android.ext.MainService.G0
            java.lang.String r10 = "DefaultStorage"
            java.lang.String r4 = r4.replace(r6, r10)
            java.lang.String r4 = r4.replace(r5, r9)
            java.util.HashMap r6 = k(r4)
            if (r6 != 0) goto L43
            return r1
        L43:
            java.util.Set r4 = r6.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L4b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L64
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getKey()
            boolean r5 = r7.containsKey(r5)
            if (r5 != 0) goto L4b
            int r1 = r1 + 1
            goto L4b
        L64:
            int r4 = n(r8, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Copy: "
            r5.append(r7)
            r5.append(r4)
            java.lang.String r4 = " from "
            r5.append(r4)
            int r4 = r6.size()
            r5.append(r4)
            java.lang.String r4 = " new "
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = r5.toString()
            android.ext.e1.d(r4)
            r4 = 1
            return r4
    }

    private static a.e e(java.lang.String r9) {
            a.e r0 = new a.e
            r0.<init>()
            if (r9 == 0) goto L63
            int r1 = r9.length()
            if (r1 != 0) goto Le
            goto L63
        Le:
            java.lang.String r1 = ";"
            java.lang.String[] r9 = r9.split(r1)
            r1 = 0
            r2 = 0
        L16:
            int r3 = r9.length
            if (r2 >= r3) goto L63
            r3 = r9[r2]
            r4 = 124(0x7c, float:1.74E-43)
            int r5 = r3.indexOf(r4)
            if (r5 >= 0) goto L25
            r4 = -1
            goto L2b
        L25:
            int r6 = r5 + 1
            int r4 = r3.indexOf(r4, r6)
        L2b:
            if (r5 < 0) goto L60
            if (r4 >= 0) goto L30
            goto L60
        L30:
            int r6 = r5 + 1
            java.lang.String r6 = r3.substring(r6, r4)     // Catch: java.lang.NumberFormatException -> L3b
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L3b
            goto L42
        L3b:
            r6 = move-exception
            java.lang.String r7 = "Failed parse deferred old version code"
            android.ext.e1.s(r7, r6)
            r6 = 0
        L42:
            int r7 = r0.size()
            android.ext.x2$h r8 = new android.ext.x2$h
            java.lang.String r5 = r3.substring(r1, r5)
            java.lang.String r5 = android.ext.s1.S(r5)
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)
            java.lang.String r3 = android.ext.s1.S(r3)
            r8.<init>(r5, r6, r3)
            r0.put(r7, r8)
        L60:
            int r2 = r2 + 1
            goto L16
        L63:
            return r0
    }

    private static java.lang.String f(a.e r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.size()
            if (r1 >= r2) goto L4a
            java.lang.Object r2 = r5.valueAt(r1)
            android.ext.x2$h r2 = (android.ext.x2.h) r2
            if (r2 == 0) goto L47
            java.lang.String r3 = r2.f1323a
            if (r3 != 0) goto L19
            goto L47
        L19:
            int r3 = r0.length()
            if (r3 <= 0) goto L24
            r3 = 59
            r0.append(r3)
        L24:
            java.lang.String r3 = r2.f1323a
            java.lang.String r3 = android.ext.s1.p(r3)
            r0.append(r3)
            r3 = 124(0x7c, float:1.74E-43)
            r0.append(r3)
            int r4 = r2.f1324b
            r0.append(r4)
            r0.append(r3)
            java.lang.String r2 = r2.f1325c
            if (r2 != 0) goto L40
            java.lang.String r2 = ""
        L40:
            java.lang.String r2 = android.ext.s1.p(r2)
            r0.append(r2)
        L47:
            int r1 = r1 + 1
            goto L6
        L4a:
            java.lang.String r5 = r0.toString()
            return r5
    }

    public static java.io.File g(java.lang.String r7) {
            android.content.Context r0 = android.ext.MainService.context
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2c
            r2 = 24
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 0
            r5 = 1
            if (r1 < r2) goto L2e
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "getSharedPreferencesPath"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L25
            r6[r4] = r3     // Catch: java.lang.Throwable -> L25
            java.lang.reflect.Method r1 = r1.getMethod(r2, r6)     // Catch: java.lang.Throwable -> L25
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L25
            r2[r4] = r7     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L25
            java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Throwable -> L25
            goto L2f
        L25:
            r1 = move-exception
            java.lang.String r2 = "Failed call getSharedPreferencesPath"
            android.ext.e1.s(r2, r1)     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r0 = move-exception
            goto L4b
        L2e:
            r1 = 0
        L2f:
            if (r1 != 0) goto L6f
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "getSharedPrefsFile"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L2c
            r6[r4] = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.reflect.Method r1 = r1.getMethod(r2, r6)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2c
            r2[r4] = r7     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L2c
            r1 = r0
            java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Throwable -> L2c
            goto L6f
        L4b:
            java.lang.String r1 = "Failed call getSharedPrefsFile"
            android.ext.e1.s(r1, r0)
            java.io.File r1 = new java.io.File
            java.io.File r0 = android.ext.Tools.p0()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "../shared_prefs/"
            r2.append(r3)
            r2.append(r7)
            java.lang.String r7 = ".xml"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r1.<init>(r0, r7)
        L6f:
            return r1
    }

    public static boolean h() {
            android.content.SharedPreferences r0 = android.ext.Tools.M0()
            java.lang.String r1 = "installed"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    public static java.io.InputStream i(java.lang.String r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "exec ls "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "exec dalvikvm -cp "
            r1.append(r2)
            java.lang.String r2 = android.ext.Tools.W()
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            java.lang.Class<android.ext.Ls> r3 = android.ext.Ls.class
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String[] r4 = new java.lang.String[]{r0, r4}
            r0 = 0
            r1 = 2
            if (r5 < r1) goto L43
            return r0
        L43:
            r4 = r4[r5]
            java.lang.Process r5 = android.ext.e2.q(r4)
            if (r5 != 0) goto L60
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "Failed run "
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.ext.e1.p(r4)
            return r0
        L60:
            java.io.InputStream r4 = r5.getInputStream()
            return r4
    }

    private static final java.lang.String j(java.lang.String r1) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Throwable -> L16
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L16
            r0.update(r1)     // Catch: java.lang.Throwable -> L16
            byte[] r1 = r0.digest()     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = android.ext.Tools.l(r1)     // Catch: java.lang.Throwable -> L16
            return r1
        L16:
            r1 = move-exception
            java.lang.String r0 = "Failed check old versions"
            android.ext.e1.s(r0, r1)
            r1 = 0
            return r1
    }

    public static java.util.HashMap k(java.lang.String r7) {
            r0 = 0
            r1 = 0
        L2:
            r2 = 10
            if (r1 >= r2) goto L54
            java.io.InputStream r3 = a(r7, r1)     // Catch: java.io.IOException -> L48
            if (r3 != 0) goto Ld
            goto L51
        Ld:
            android.ext.x2$i r4 = new android.ext.x2$i     // Catch: java.io.IOException -> L48
            r4.<init>(r3)     // Catch: java.io.IOException -> L48
            java.util.HashMap r0 = b.b.a(r4)     // Catch: java.lang.Throwable -> L17
            goto L44
        L17:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L48
            r5.<init>()     // Catch: java.io.IOException -> L48
            java.lang.String r6 = "Fail: "
            r5.append(r6)     // Catch: java.io.IOException -> L48
            r5.append(r7)     // Catch: java.io.IOException -> L48
            java.lang.String r5 = r5.toString()     // Catch: java.io.IOException -> L48
            android.ext.e1.s(r5, r3)     // Catch: java.io.IOException -> L48
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L48
            r3.<init>()     // Catch: java.io.IOException -> L48
            java.lang.String r5 = "Last data: "
            r3.append(r5)     // Catch: java.io.IOException -> L48
            java.lang.String r5 = r4.a()     // Catch: java.io.IOException -> L48
            r3.append(r5)     // Catch: java.io.IOException -> L48
            java.lang.String r3 = r3.toString()     // Catch: java.io.IOException -> L48
            android.ext.e1.p(r3)     // Catch: java.io.IOException -> L48
        L44:
            r4.close()     // Catch: java.io.IOException -> L48
            goto L4e
        L48:
            r3 = move-exception
            java.lang.String r4 = "Failed read xml"
            android.ext.e1.s(r4, r3)
        L4e:
            if (r0 == 0) goto L51
            goto L54
        L51:
            int r1 = r1 + 1
            goto L2
        L54:
            if (r0 != 0) goto L71
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r1.<init>()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = "exec ls -l "
            r1.append(r3)     // Catch: java.lang.Throwable -> L6b
            r1.append(r7)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L6b
            android.ext.e2.n(r7, r2)     // Catch: java.lang.Throwable -> L6b
            goto L71
        L6b:
            r7 = move-exception
            java.lang.String r1 = "Failed check xml"
            android.ext.e1.s(r1, r7)
        L71:
            return r0
    }

    private static void l(a.e r1) {
            r0 = 0
            m(r1, r0)
            return
    }

    private static boolean m(a.e r6, java.lang.Runnable r7) {
            r0 = 1
            boolean[] r1 = new boolean[r0]
            android.ext.p0 r2 = new android.ext.p0
            r3 = 1300(0x514, float:1.822E-42)
            r2.<init>(r3, r0)
            android.app.AlertDialog$Builder r3 = android.ext.f.b()
            r4 = 2131296280(0x7f090018, float:1.8210472E38)
            android.view.View r4 = android.ext.Tools.g0(r4)
            android.app.AlertDialog$Builder r3 = r3.setCustomTitle(r4)
            r4 = 2131296425(0x7f0900a9, float:1.8210766E38)
            java.lang.String r4 = android.ext.b2.f(r4)
            android.app.AlertDialog$Builder r3 = r3.setMessage(r4)
            r4 = 2131296904(0x7f090288, float:1.8211738E38)
            java.lang.String r4 = android.ext.b2.f(r4)
            android.ext.x2$b r5 = new android.ext.x2$b
            r5.<init>(r1, r2)
            android.app.AlertDialog$Builder r2 = r3.setPositiveButton(r4, r5)
            r3 = 2131296963(0x7f0902c3, float:1.8211858E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            android.ext.x2$a r4 = new android.ext.x2$a
            r4.<init>(r6, r7, r1)
            android.app.AlertDialog$Builder r6 = r2.setNegativeButton(r3, r4)
            r2 = 0
            android.app.AlertDialog$Builder r6 = r6.setCancelable(r2)
            android.app.AlertDialog r6 = r6.create()
            if (r7 == 0) goto L57
            android.ext.x2$c r2 = new android.ext.x2$c
            r2.<init>(r1, r7)
            android.ext.f.k(r6, r2)
        L57:
            android.ext.f.m(r6)
            return r0
    }

    private static int n(android.content.SharedPreferences.Editor r6, java.util.Map r7) {
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
        L9:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto La9
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            boolean r3 = r2 instanceof java.lang.Boolean
            if (r3 == 0) goto L32
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r6.putBoolean(r3, r4)
            int r0 = r0 + 1
        L32:
            boolean r3 = r2 instanceof java.lang.Float
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.getValue()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r6.putFloat(r3, r4)
            int r0 = r0 + 1
        L4b:
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L64
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.getValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r6.putInt(r3, r4)
            int r0 = r0 + 1
        L64:
            boolean r3 = r2 instanceof java.lang.Long
            if (r3 == 0) goto L7d
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.getValue()
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r6.putLong(r3, r4)
            int r0 = r0 + 1
        L7d:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L92
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r6.putString(r3, r4)
            int r0 = r0 + 1
        L92:
            boolean r2 = r2 instanceof java.util.Set
            if (r2 == 0) goto L9
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            r6.putStringSet(r2, r1)
            int r0 = r0 + 1
            goto L9
        La9:
            return r0
    }

    static boolean o(java.lang.String r1, java.lang.Runnable r2) {
            a.e r1 = e(r1)
            int r0 = r1.size()
            if (r0 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            boolean r1 = r(r1, r2)
            return r1
    }

    static boolean p(java.lang.String r1, java.lang.Runnable r2) {
            a.e r1 = e(r1)
            int r0 = r1.size()
            if (r0 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            boolean r1 = m(r1, r2)
            return r1
    }

    static void q(a.e r1) {
            r0 = 0
            r(r1, r0)
            return
    }

    static boolean r(a.e r11, java.lang.Runnable r12) {
            r0 = 1
            float r1 = (float) r0
            r2 = 1182797414(0x46800e66, float:16391.2)
            float r2 = r2 * r1
            r3 = 1131164467(0x436c3333, float:236.2)
            float r2 = r2 - r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            r4 = 0
            r5 = 0
        L11:
            int r6 = r11.size()
            if (r5 >= r6) goto L5a
            java.lang.Object r6 = r11.valueAt(r5)
            android.ext.x2$h r6 = (android.ext.x2.h) r6
            int r7 = r6.f1324b
            if (r7 != r2) goto L2b
            java.lang.String r7 = android.ext.i.f1000b
            java.lang.String r8 = r6.f1323a
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L33
        L2b:
            java.lang.String r7 = r6.f1323a
            boolean r7 = android.ext.Tools.e1(r7)
            if (r7 != 0) goto L58
        L33:
            r11.removeAt(r5)
            int r5 = r5 + (-1)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Un: ignore: "
            r7.append(r8)
            java.lang.String r8 = r6.f1323a
            r7.append(r8)
            r8 = 32
            r7.append(r8)
            int r6 = r6.f1324b
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.ext.e1.d(r6)
        L58:
            int r5 = r5 + r0
            goto L11
        L5a:
            int r2 = r11.size()
            if (r2 != 0) goto L66
            java.lang.String r11 = "Un: empty"
        L62:
            android.ext.e1.d(r11)
            return r4
        L66:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = 2131296479(0x7f0900df, float:1.8210876E38)
            java.lang.String r5 = android.ext.b2.f(r5)
            r2.append(r5)
            r5 = 0
        L76:
            int r6 = r11.size()
            r7 = 0
            if (r5 >= r6) goto Lf9
            java.lang.Object r6 = r11.valueAt(r5)
            android.ext.x2$h r6 = (android.ext.x2.h) r6
            java.lang.String r8 = "\n\n"
            r2.append(r8)
            java.lang.String r8 = r6.f1323a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            android.content.pm.PackageInfo r8 = android.ext.Tools.z0(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            goto La7
        L8f:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Package not found: "
            r9.append(r10)
            java.lang.String r10 = r6.f1323a
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.ext.e1.l(r9, r8)
            r8 = r7
        La7:
            if (r8 == 0) goto Le6
            android.content.pm.ApplicationInfo r9 = r8.applicationInfo
            if (r9 == 0) goto Lb1
            java.lang.String r7 = android.ext.Tools.a0(r9)
        Lb1:
            r2.append(r7)
            java.lang.String r7 = " ("
            r2.append(r7)
            java.lang.String r9 = r6.f1323a
            r2.append(r9)
            java.lang.String r9 = ") - "
            r2.append(r9)
            java.lang.String r9 = r6.f1325c
            int r9 = r9.length()
            if (r9 <= 0) goto Lce
            java.lang.String r9 = r6.f1325c
            goto Ld0
        Lce:
            java.lang.String r9 = r8.versionName
        Ld0:
            r2.append(r9)
            r2.append(r7)
            int r6 = r6.f1324b
            if (r6 <= 0) goto Ldb
            goto Ldd
        Ldb:
            int r6 = r8.versionCode
        Ldd:
            r2.append(r6)
            r6 = 41
            r2.append(r6)
            goto Lf5
        Le6:
            java.lang.String r7 = r6.f1323a
            r2.append(r7)
            java.lang.String r7 = " - "
            r2.append(r7)
            int r6 = r6.f1324b
            r2.append(r6)
        Lf5:
            int r5 = r5 + 1
            goto L76
        Lf9:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Un: alert: "
            r5.append(r6)
            int r6 = r11.size()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.ext.e1.d(r5)
            java.lang.String r2 = r2.toString()
            int r5 = r2.hashCode()
            r6 = 1183485082(0x468a8c9a, float:17734.3)
            float r1 = r1 * r6
            r6 = 1153788314(0x44c5699a, float:1579.3)
            float r1 = r1 - r6
            float r1 = r1 + r3
            int r1 = (int) r1
            r1 = r1 ^ r5
            android.content.SharedPreferences r3 = android.ext.Tools.M0()
            java.lang.String r5 = "skip-old"
            int r3 = r3.getInt(r5, r4)
            if (r1 != r3) goto L135
            java.lang.String r11 = "Un: skip"
            goto L62
        L135:
            android.ext.x2$d r3 = new android.ext.x2$d
            r3.<init>(r1, r11)
            android.app.AlertDialog$Builder r11 = android.ext.f.b()
            r1 = 2131296838(0x7f090246, float:1.8211604E38)
            android.view.View r1 = android.ext.Tools.g0(r1)
            android.app.AlertDialog$Builder r11 = r11.setCustomTitle(r1)
            android.app.AlertDialog$Builder r11 = r11.setMessage(r2)
            android.app.AlertDialog$Builder r11 = r11.setCancelable(r4)
            r1 = 2131297115(0x7f09035b, float:1.8212166E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r11 = r11.setPositiveButton(r1, r3)
            r1 = 2131296963(0x7f0902c3, float:1.8211858E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r11 = r11.setNeutralButton(r1, r3)
            r1 = 2131296805(0x7f090225, float:1.8211537E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r11 = r11.setNegativeButton(r1, r7)
            android.app.AlertDialog r11 = r11.create()
            if (r12 == 0) goto L180
            android.ext.x2$e r1 = new android.ext.x2$e
            r1.<init>(r12)
            android.ext.f.k(r11, r1)
        L180:
            android.ext.f.m(r11)
            return r0
    }

    public static void s(java.lang.String r4, java.lang.Runnable r5) {
            java.lang.String r0 = "run cmd fail"
            boolean r1 = android.ext.Tools.e1(r4)
            if (r1 != 0) goto L22
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            java.lang.String r0 = ": 50"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            android.ext.e1.d(r4)
            if (r5 == 0) goto L21
            r5.run()
        L21:
            return
        L22:
            if (r5 == 0) goto Le2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r2 = ": 60"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.ext.e1.d(r1)
            r1 = 45
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r2.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = "exec pm uninstall --user -1 "
            r2.append(r3)     // Catch: java.lang.Throwable -> L4f
            r2.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4f
            android.ext.e2.n(r2, r1)     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r2 = move-exception
            android.ext.e1.l(r0, r2)
        L53:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r3 = ": 70"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.ext.e1.d(r2)
            boolean r2 = android.ext.Tools.e1(r4)
            if (r2 == 0) goto L86
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r2.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = "exec pm uninstall "
            r2.append(r3)     // Catch: java.lang.Throwable -> L82
            r2.append(r4)     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L82
            android.ext.e2.n(r2, r1)     // Catch: java.lang.Throwable -> L82
            goto L86
        L82:
            r1 = move-exception
            android.ext.e1.l(r0, r1)
        L86:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = ": 80"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            boolean r0 = android.ext.Tools.e1(r4)
            if (r0 == 0) goto Lca
            android.content.Context r0 = android.ext.r.p
            android.app.AlertDialog$Builder r0 = android.ext.f.c(r0)
            r1 = 2131296799(0x7f09021f, float:1.8211525E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            r1 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.ext.x2$f r2 = new android.ext.x2$f
            r2.<init>(r5, r4)
            android.app.AlertDialog$Builder r4 = r0.setPositiveButton(r1, r2)
            android.app.AlertDialog r4 = r4.create()
            r0 = 1
            android.ext.f.r(r4, r5, r0)
            goto Le5
        Lca:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            java.lang.String r0 = ": 110"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            android.ext.e1.d(r4)
            r5.run()
            goto Le5
        Le2:
            t(r4)
        Le5:
            return
    }

    static boolean t(java.lang.String r5) {
            android.content.Intent[] r5 = android.ext.b1.k0(r5)
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L7:
            if (r2 >= r0) goto L1d
            r3 = r5[r2]
            android.content.Context r4 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> L14
            r4.startActivity(r3)     // Catch: java.lang.Throwable -> L14
            r5 = 1
            return r5
        L14:
            r3 = move-exception
            java.lang.String r4 = "intent fail"
            android.ext.e1.l(r4, r3)
            int r2 = r2 + 1
            goto L7
        L1d:
            return r1
    }

    public static void u(android.ext.w r35, boolean r36) {
            r0 = r35
            java.lang.String r1 = "df1e68bf2355bb69260b6efaa7fdacc1"
            java.lang.String r2 = "f63d4ea576f8d71e0963de6834e0c219"
            java.lang.String r3 = "b333d385ec3aeaaf7598031a42f99961"
            java.lang.String r4 = "f6d10cdcc825ab580f2fbb8ae2752990"
            java.lang.String r5 = "6c188a31fe500c3ada0914215e7df3b3"
            java.lang.String r6 = "4aa610afe8a9f409d98e62b4ed2ef780"
            java.lang.String r7 = "bbc0c87ac43ea5b61f59d6607a1eaf84"
            java.lang.String r8 = "70fb9cca0e11cb09250a11ba0c23b4c2"
            java.lang.String r9 = "b4d8929ffb0484d60369dd2c2e5c919d"
            java.lang.String r10 = "1517a1932503e400deef335e1d331593"
            java.lang.String r11 = "761cf7c032752696b26cd60ea3f3d74d"
            java.lang.String r12 = "1027157cbd6831cfebb80321570bb784"
            java.lang.String r13 = "8791855c8c65cb6a950f34ec0b093668"
            java.lang.String r14 = "a517cf7078e7e9b25ae975b4bdb2cc65"
            java.lang.String r15 = "b4ab3afbb70f23f600d048be0e8d49b2"
            java.lang.String r16 = "bd2173c6afb552fae3d9428756430123"
            java.lang.String r17 = "9bcf2de327544b17352830f9b004b229"
            java.lang.String r18 = "94d8ee3a7d26aa70f473e0ac8845b040"
            java.lang.String r19 = "d6683c02b361fed6c0ece0338921cf2b"
            java.lang.String r20 = "2cba6ddcf12910bc651455907da1fa00"
            java.lang.String r21 = "95760d2d26320be5d407e9823fd089ea"
            java.lang.String r22 = "db2aaa81ea92a69ae45642d0f5142c24"
            java.lang.String r23 = "6e513de086b0378f970968445a5da263"
            java.lang.String r24 = "60ee44a5be7a862f6615d5b68ca0d017"
            java.lang.String r25 = "0e41efb62a276c61f7b2253a1cb70c96"
            java.lang.String r26 = "3534ed8e94149e09012244b0053f387c"
            java.lang.String r27 = "7e146f369544a77f5bd3dcaa498a1e93"
            java.lang.String r28 = "5ff0619a03b5424a273491e365b6356a"
            java.lang.String r29 = "7abdd4c0904fe8f0a78424f971ff52f4"
            java.lang.String r30 = "4be2ea55d617fc0362440a93ae8a0bda"
            java.lang.String r31 = "25a4c4b1be1822ea6b990582e5038364"
            java.lang.String r32 = "b3ea34ef077e6fb86332e03b5321b28c"
            java.lang.String r33 = "ff748cbd537fd83894360f37ac9ccb03"
            java.lang.String r34 = "1353d43dff30877182f5d709e282d224"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34}
            a.e r2 = new a.e
            r2.<init>()
            r35.j()
            r3 = 1
            float r4 = (float) r3
            r5 = 1182735462(0x467f1c66, float:16327.1)
            float r4 = r4 * r5
            r5 = 1126963610(0x432c199a, float:172.1)
            float r4 = r4 - r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            int r4 = (int) r4
            java.lang.String r5 = android.ext.Tools.C0()
            int r6 = r35.k()
            int r6 = r6 / 9
            r7 = 0
            if (r36 == 0) goto L74
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            goto L75
        L74:
            r8 = r7
        L75:
            r9 = 0
        L76:
            int r10 = r35.f()     // Catch: java.io.IOException -> La4
            if (r10 < 0) goto Lf5
            r11 = 1024(0x400, float:1.435E-42)
            if (r10 <= r11) goto L82
            goto Lf5
        L82:
            if (r10 != 0) goto L86
            goto L120
        L86:
            int r11 = r35.f()     // Catch: java.io.IOException -> La4
            int r12 = r35.f()     // Catch: java.io.IOException -> La4
            java.lang.String r10 = r0.i(r10, r7)     // Catch: java.io.IOException -> La4
            byte r13 = r35.e()     // Catch: java.io.IOException -> La4
            java.lang.String r13 = r0.i(r13, r7)     // Catch: java.io.IOException -> La4
            if (r36 == 0) goto La6
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.io.IOException -> La4
            r8.put(r10, r12)     // Catch: java.io.IOException -> La4
            goto La6
        La4:
            r0 = move-exception
            goto L10f
        La6:
            boolean r12 = r5.equals(r10)     // Catch: java.io.IOException -> La4
            if (r12 == 0) goto Lad
            goto L76
        Lad:
            if (r11 <= 0) goto Lc1
            if (r11 > r4) goto L76
            int r12 = r4 - r11
            int r12 = r12 * r6
            int r12 = r12 + r9
            android.ext.x2$h r14 = new android.ext.x2$h     // Catch: java.io.IOException -> La4
            r14.<init>(r10, r11, r13)     // Catch: java.io.IOException -> La4
            r2.put(r12, r14)     // Catch: java.io.IOException -> La4
            int r9 = r9 + 1
            goto L76
        Lc1:
            java.lang.String r12 = android.ext.i.f1000b     // Catch: java.io.IOException -> La4
            boolean r12 = r10.equals(r12)     // Catch: java.io.IOException -> La4
            if (r12 == 0) goto Ld4
            int r12 = r6 * r4
            int r12 = r12 + r3
            android.ext.x2$h r14 = new android.ext.x2$h     // Catch: java.io.IOException -> La4
            r14.<init>(r10, r11, r13)     // Catch: java.io.IOException -> La4
            r2.put(r12, r14)     // Catch: java.io.IOException -> La4
        Ld4:
            java.lang.String r12 = j(r10)     // Catch: java.io.IOException -> La4
            r14 = 33
        Lda:
            if (r14 < 0) goto L76
            r15 = r1[r14]     // Catch: java.io.IOException -> La4
            boolean r15 = r15.equalsIgnoreCase(r12)     // Catch: java.io.IOException -> La4
            if (r15 == 0) goto Lf2
            int r12 = 35 - r14
            int r14 = r6 * r4
            int r12 = r12 + r14
            android.ext.x2$h r14 = new android.ext.x2$h     // Catch: java.io.IOException -> La4
            r14.<init>(r10, r11, r13)     // Catch: java.io.IOException -> La4
            r2.put(r12, r14)     // Catch: java.io.IOException -> La4
            goto L76
        Lf2:
            int r14 = r14 + (-1)
            goto Lda
        Lf5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La4
            r0.<init>()     // Catch: java.io.IOException -> La4
            java.lang.String r1 = "Bad pkg length: "
            r0.append(r1)     // Catch: java.io.IOException -> La4
            r0.append(r10)     // Catch: java.io.IOException -> La4
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> La4
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.io.IOException -> La4
            r1.<init>()     // Catch: java.io.IOException -> La4
            android.ext.e1.l(r0, r1)     // Catch: java.io.IOException -> La4
            goto L120
        L10f:
            java.lang.String r1 = "???"
            android.ext.e1.l(r1, r0)
            int r0 = r2.size()
            if (r0 != 0) goto L120
            java.lang.String r0 = "Un: what?"
        L11c:
            android.ext.e1.d(r0)
            return
        L120:
            if (r36 == 0) goto L124
            android.ext.z1.j = r8
        L124:
            boolean r0 = h()
            r0 = r0 ^ r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Un: copy "
            r1.append(r4)
            int r4 = r2.size()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.ext.e1.d(r1)
            boolean r1 = c(r2)
            boolean r4 = android.ext.s1.u()
            if (r4 == 0) goto L164
            java.lang.String r0 = f(r2)
            if (r1 == 0) goto L15a
            java.lang.String r1 = "Un: defer restart"
            android.ext.e1.d(r1)
            android.ext.s1.v(r3, r0)
            goto L163
        L15a:
            java.lang.String r1 = "Un: defer show"
            android.ext.e1.d(r1)
            r1 = 2
            android.ext.s1.v(r1, r0)
        L163:
            return
        L164:
            boolean r3 = android.ext.s1.n()
            if (r3 == 0) goto L16d
            java.lang.String r0 = "Un: drain owns recovery"
            goto L11c
        L16d:
            if (r1 == 0) goto L178
            java.lang.String r1 = "Un: restart?"
            android.ext.e1.d(r1)
            l(r2)
            goto L180
        L178:
            java.lang.String r1 = "Un: show"
            android.ext.e1.d(r1)
            q(r2)
        L180:
            if (r0 == 0) goto L194
            boolean r0 = h()
            if (r0 == 0) goto L194
            java.lang.String r0 = "Un: faq"
            android.ext.e1.d(r0)
            android.content.Context r0 = android.ext.Tools.f0()
            android.ext.f1.q(r0)
        L194:
            return
    }
}
