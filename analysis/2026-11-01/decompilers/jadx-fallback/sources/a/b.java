package a;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class b extends android.view.ContextThemeWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f7c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static android.content.res.Configuration f8d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static java.util.Locale f9e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.res.Configuration f10a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.res.Resources f11b;

    class a extends a.b {
        private java.lang.Object mPackageInfo;

        a(android.content.Context r3) {
                r2 = this;
                r2.<init>(r3)
                android.content.Context r3 = r2.getBaseContext()     // Catch: java.lang.Throwable -> L3a
                java.lang.String r0 = "android.app.ContextImpl"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L3a
                boolean r1 = r0.isInstance(r3)     // Catch: java.lang.Throwable -> L3a
                if (r1 == 0) goto L3e
                java.lang.String r1 = "mPackageInfo"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L3a
                r1 = 1
                r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L3a
                java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L3a
                r2.mPackageInfo = r3     // Catch: java.lang.Throwable -> L3a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
                r3.<init>()     // Catch: java.lang.Throwable -> L3a
                java.lang.String r0 = "WBContext: "
                r3.append(r0)     // Catch: java.lang.Throwable -> L3a
                java.lang.Object r0 = r2.mPackageInfo     // Catch: java.lang.Throwable -> L3a
                r3.append(r0)     // Catch: java.lang.Throwable -> L3a
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3a
                android.ext.e1.d(r3)     // Catch: java.lang.Throwable -> L3a
                goto L3e
            L3a:
                r3 = move-exception
                android.ext.e1.a(r3)
            L3e:
                return
        }
    }

    /* JADX INFO: renamed from: a.b$b, reason: collision with other inner class name */
    class RunnableC0001b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f12a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.content.Intent f13b;

        RunnableC0001b(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                r0.f12a = r1
                r0.f13b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.content.Context r0 = r3.f12a     // Catch: java.lang.Throwable -> L8
                android.content.Intent r1 = r3.f13b     // Catch: java.lang.Throwable -> L8
                r0.startActivity(r1)     // Catch: java.lang.Throwable -> L8
                goto L1f
            L8:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed startActivity from UI thread: "
                r1.append(r2)
                android.content.Intent r2 = r3.f13b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.ext.e1.s(r1, r0)
            L1f:
                return
        }
    }

    static {
            java.util.Locale r0 = java.util.Locale.getDefault()
            a.b.f9e = r0
            return
    }

    public b(android.content.Context r2) {
            r1 = this;
            r0 = 2131361794(0x7f0a0002, float:1.834335E38)
            r1.<init>(r2, r0)
            r2 = 0
            r1.f10a = r2
            r1.f11b = r2
            return
    }

    public static void a(android.content.Context r1) {
            boolean r0 = r1 instanceof a.b
            if (r0 == 0) goto L26
            a.b r1 = (a.b) r1
            android.view.LayoutInflater.from(r1)     // Catch: java.lang.AssertionError -> La
            goto L21
        La:
            r0 = move-exception
            android.content.Context r1 = r1.getBaseContext()     // Catch: java.lang.AssertionError -> L1b
            android.view.LayoutInflater.from(r1)     // Catch: java.lang.AssertionError -> L1b
            java.lang.String r1 = "Failed use fix for LayoutInflater"
            android.ext.e1.l(r1, r0)     // Catch: java.lang.AssertionError -> L1b
            r1 = 0
            a.b.f7c = r1     // Catch: java.lang.AssertionError -> L1b
            goto L21
        L1b:
            r1 = move-exception
            java.lang.String r0 = "Can not get LayoutInflater"
            android.ext.e1.l(r0, r1)
        L21:
            java.lang.String r1 = "Check LayoutInflater - ok"
            android.ext.e1.i(r1)
        L26:
            return
    }

    private boolean b(android.content.Intent r8) {
            r7 = this;
            java.lang.String r0 = "Failed exec intent: "
            r1 = 5
            java.lang.String r1 = r8.toUri(r1)
            java.lang.String r2 = "am"
            java.lang.String r3 = "start"
            java.lang.String[] r1 = new java.lang.String[]{r2, r3, r1}
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Try exec intent: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = "; "
            r2.append(r3)
            java.lang.String r4 = java.util.Arrays.toString(r1)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.ext.e1.p(r2)
            r2 = 0
            java.lang.Process r4 = android.ext.Tools.I(r1)     // Catch: java.lang.Throwable -> L5d
            java.io.InputStream r5 = r4.getInputStream()     // Catch: java.lang.Throwable -> L5d
            r5.close()     // Catch: java.lang.Throwable -> L5d
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5d
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L5d
            java.io.InputStream r4 = r4.getErrorStream()     // Catch: java.lang.Throwable -> L5d
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L5d
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r4.<init>()     // Catch: java.lang.Throwable -> L5d
        L4e:
            java.lang.String r6 = r5.readLine()     // Catch: java.lang.Throwable -> L5d
            if (r6 == 0) goto L5f
            r4.append(r6)     // Catch: java.lang.Throwable -> L5d
            r6 = 10
            r4.append(r6)     // Catch: java.lang.Throwable -> L5d
            goto L4e
        L5d:
            r4 = move-exception
            goto L93
        L5f:
            r5.close()     // Catch: java.lang.Throwable -> L5d
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L5d
            if (r5 <= 0) goto L91
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r5.<init>()     // Catch: java.lang.Throwable -> L5d
            r5.append(r0)     // Catch: java.lang.Throwable -> L5d
            r5.append(r8)     // Catch: java.lang.Throwable -> L5d
            r5.append(r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r6 = java.util.Arrays.toString(r1)     // Catch: java.lang.Throwable -> L5d
            r5.append(r6)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r6 = ":\n"
            r5.append(r6)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5d
            r5.append(r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L5d
            android.ext.e1.p(r4)     // Catch: java.lang.Throwable -> L5d
            return r2
        L91:
            r8 = 1
            return r8
        L93:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r8)
            r5.append(r3)
            java.lang.String r8 = java.util.Arrays.toString(r1)
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            android.ext.e1.s(r8, r4)
            return r2
    }

    public static android.content.res.Configuration c(android.content.res.Configuration r1) {
            java.util.Locale r0 = a.b.f9e
            android.ext.ConfigListAdapter.q(r1, r0)
            android.content.res.Configuration r0 = new android.content.res.Configuration
            r0.<init>(r1)
            return r0
    }

    public static a.b d(android.content.Context r1) {
            java.lang.String r0 = "com.wobian.wv.wb.WBContext"
            java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> Lb
            a.b$a r0 = new a.b$a     // Catch: java.lang.Throwable -> Lb
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb
            return r0
        Lb:
            a.b r0 = new a.b
            r0.<init>(r1)
            return r0
    }

    public static boolean e() {
            boolean r0 = a.b.f7c
            return r0
    }

    public static android.content.res.Configuration f(android.content.res.Configuration r1) {
            android.content.res.Configuration r1 = c(r1)
            r0 = 0
            g(r1, r0)
            return r1
    }

    public static void g(android.content.res.Configuration r0, java.util.Locale r1) {
            if (r1 == 0) goto L4
            a.b.f9e = r1
        L4:
            if (r0 != 0) goto L8
            android.content.res.Configuration r0 = a.b.f8d
        L8:
            if (r0 != 0) goto L16
            android.content.Context r0 = android.ext.Tools.f0()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
        L16:
            android.content.res.Configuration r0 = c(r0)
            android.content.res.Configuration r1 = a.b.f8d
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L24
            a.b.f8d = r0
        L24:
            return
    }

    public static boolean h(java.lang.Throwable r1, android.content.Context r2, android.content.Intent r3) {
            java.lang.String r1 = r1.getMessage()
            boolean r0 = android.ext.n2.e()
            if (r0 != 0) goto L1e
            if (r1 == 0) goto L1e
            java.lang.String r0 = "Looper.prepare()"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L1e
            a.b$b r1 = new a.b$b
            r1.<init>(r2, r3)
            android.ext.n2.i(r1)
            r1 = 1
            return r1
        L1e:
            r1 = 0
            return r1
    }

    public static android.content.Context i(android.content.Context r1) {
            if (r1 == 0) goto La
            boolean r0 = r1 instanceof a.b
            if (r0 != 0) goto La
            a.b r1 = d(r1)
        La:
            return r1
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public boolean bindService(android.content.Intent r1, android.content.ServiceConnection r2, int r3) {
            r0 = this;
            boolean r1 = super.bindService(r1, r2, r3)     // Catch: java.lang.IllegalArgumentException -> L5
            goto La
        L5:
            r1 = move-exception
            android.ext.e1.a(r1)
            r1 = 0
        La:
            return r1
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.content.res.AssetManager r0 = r0.getAssets()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.io.File getCacheDir() {
            r1 = this;
            java.io.File r0 = super.getCacheDir()     // Catch: java.lang.NullPointerException -> L5
            return r0
        L5:
            r0 = move-exception
            android.ext.e1.a(r0)
            java.io.File r0 = android.ext.Tools.b0()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.io.File getExternalCacheDir() {
            r2 = this;
            r0 = 0
            java.io.File r0 = super.getExternalCacheDir()     // Catch: java.lang.NullPointerException -> L6 java.lang.ArrayIndexOutOfBoundsException -> Lb
            return r0
        L6:
            r1 = move-exception
            android.ext.e1.a(r1)
            return r0
        Lb:
            r1 = move-exception
            android.ext.e1.a(r1)
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.io.File getExternalFilesDir(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.io.File r2 = super.getExternalFilesDir(r2)     // Catch: java.lang.NullPointerException -> L6 java.lang.ArrayIndexOutOfBoundsException -> Lb
            return r2
        L6:
            r2 = move-exception
            android.ext.e1.a(r2)
            return r0
        Lb:
            r2 = move-exception
            android.ext.e1.a(r2)
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.io.File getFilesDir() {
            r1 = this;
            java.io.File r0 = super.getFilesDir()     // Catch: java.lang.NullPointerException -> L5
            return r0
        L5:
            r0 = move-exception
            android.ext.e1.a(r0)
            java.io.File r0 = android.ext.Tools.p0()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.pm.PackageManager getPackageManager() {
            r1 = this;
            android.content.pm.PackageManager r0 = super.getPackageManager()     // Catch: java.lang.NullPointerException -> L5
            return r0
        L5:
            r0 = move-exception
            android.ext.e1.a(r0)
            android.content.pm.PackageManager r0 = android.ext.Tools.B0()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.String getPackageName() {
            r1 = this;
            java.lang.String r0 = super.getPackageName()     // Catch: java.lang.NullPointerException -> L5
            return r0
        L5:
            r0 = move-exception
            android.ext.e1.a(r0)
            java.lang.String r0 = android.ext.Tools.C0()
            return r0
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
            r5 = this;
            android.content.res.Configuration r0 = a.b.f8d
            android.content.res.Configuration r1 = r5.f10a
            android.content.res.Resources r2 = r5.f11b
            r3 = 0
            if (r1 != r0) goto L15
            if (r2 == 0) goto L44
            android.content.res.Configuration r4 = r2.getConfiguration()
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L44
        L15:
            r5.f10a = r0
            android.content.res.Resources r1 = super.getResources()
            if (r0 == 0) goto L42
            r1.updateConfiguration(r0, r3)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L2e
            if (r2 == r1) goto L2e
            r2.updateConfiguration(r0, r3)     // Catch: java.lang.Throwable -> L28
            goto L2e
        L28:
            r2 = move-exception
            java.lang.String r4 = "Failed set locale"
            android.ext.e1.l(r4, r2)
        L2e:
            android.content.Context r3 = r5.createConfigurationContext(r0)     // Catch: java.lang.Throwable -> L33
            goto L37
        L33:
            r0 = move-exception
            android.ext.e1.a(r0)
        L37:
            if (r3 != 0) goto L3b
            r2 = r1
            goto L40
        L3b:
            android.content.res.Resources r0 = r3.getResources()
            r2 = r0
        L40:
            r3 = r1
            goto L44
        L42:
            r2 = r1
            r3 = r2
        L44:
            if (r2 != 0) goto L4f
            if (r3 != 0) goto L4e
            android.content.res.Resources r0 = super.getResources()
            r2 = r0
            goto L4f
        L4e:
            r2 = r3
        L4f:
            r5.f11b = r2
            return r2
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.SharedPreferences getSharedPreferences(java.lang.String r1, int r2) {
            r0 = this;
            android.content.SharedPreferences r1 = super.getSharedPreferences(r1, r2)
            android.content.SharedPreferences r1 = android.ext.f2.a(r1)
            return r1
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = super.getSystemService(r1)
            java.lang.Object r1 = a.f.a(r1)
            return r1
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(android.content.Intent r4) {
            r3 = this;
            super.startActivity(r4)     // Catch: java.lang.Throwable -> L4
            goto L22
        L4:
            r0 = move-exception
            if (r4 == 0) goto L14
            java.lang.String r1 = "android.intent.action.WEB_SEARCH"
            java.lang.String r2 = r4.getAction()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L14
            return
        L14:
            boolean r1 = h(r0, r3, r4)
            if (r1 != 0) goto L22
            boolean r4 = r3.b(r4)
            if (r4 == 0) goto L21
            goto L22
        L21:
            throw r0
        L22:
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public boolean startInstrumentation(android.content.ComponentName r1, java.lang.String r2, android.os.Bundle r3) {
            r0 = this;
            boolean r1 = super.startInstrumentation(r1, r2, r3)     // Catch: java.lang.Throwable -> L5
            return r1
        L5:
            r1 = move-exception
            android.ext.e1.a(r1)
            r1 = 0
            return r1
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unregisterReceiver(android.content.BroadcastReceiver r1) {
            r0 = this;
            super.unregisterReceiver(r1)     // Catch: java.lang.IllegalArgumentException -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }
}
