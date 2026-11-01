package a;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class a extends android.app.Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.view.View f0a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.app.AlertDialog f1b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.content.Context f2c;

    /* JADX INFO: renamed from: a.a$a, reason: collision with other inner class name */
    class RunnableC0000a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Intent f3a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a.a f5c;

        RunnableC0000a(a.a r1, android.content.Intent r2, int r3) {
                r0 = this;
                r0.f5c = r1
                r0.f3a = r2
                r0.f4b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                a.a r0 = r3.f5c
                android.content.Intent r1 = r3.f3a
                int r2 = r3.f4b
                r0.startActivityForResult(r1, r2)
                return
        }
    }

    class b implements android.content.DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.a f6a;

        b(a.a r1) {
                r0 = this;
                r0.f6a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(android.content.DialogInterface r1) {
                r0 = this;
                a.a r1 = r0.f6a
                r1.a()
                return
        }
    }

    public a() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f0a = r0
            r1.f1b = r0
            r1.f2c = r0
            return
    }

    private android.content.Context b() {
            r1 = this;
            android.content.Context r0 = r1.f2c
            if (r0 != 0) goto L12
            android.content.Context r0 = r1.getBaseContext()
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            android.content.Context r0 = a.b.i(r0)
            r1.f2c = r0
        L12:
            android.content.Context r0 = r1.f2c
            return r0
    }

    private void c() {
            r1 = this;
            android.app.AlertDialog r0 = r1.f1b     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto Lc
            r0.dismiss()     // Catch: java.lang.Throwable -> L8
            goto Lc
        L8:
            r0 = move-exception
            android.ext.e1.a(r0)
        Lc:
            return
    }

    public void a() {
            r1 = this;
            super.finish()     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
        L8:
            return
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(android.content.Context r1) {
            r0 = this;
            android.content.Context r1 = a.b.i(r1)
            super.attachBaseContext(r1)
            return
    }

    @Override // android.app.Activity
    public android.view.View findViewById(int r2) {
            r1 = this;
            android.view.View r0 = r1.f0a
            if (r0 != 0) goto L9
            android.view.View r2 = super.findViewById(r2)
            goto Ld
        L9:
            android.view.View r2 = r0.findViewById(r2)
        Ld:
            return r2
    }

    @Override // android.app.Activity
    public void finish() {
            r0 = this;
            r0.c()
            r0.a()
            return
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
            r1 = this;
            android.content.Context r0 = r1.b()
            if (r0 != 0) goto Lb
            android.content.res.AssetManager r0 = super.getAssets()
            goto Lf
        Lb:
            android.content.res.AssetManager r0 = r0.getAssets()
        Lf:
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
            java.io.File r0 = super.getExternalCacheDir()     // Catch: java.lang.SecurityException -> L6 java.lang.NullPointerException -> Lb java.lang.ArrayIndexOutOfBoundsException -> L10
            return r0
        L6:
            r1 = move-exception
            android.ext.e1.a(r1)
            return r0
        Lb:
            r1 = move-exception
            android.ext.e1.a(r1)
            return r0
        L10:
            r1 = move-exception
            android.ext.e1.a(r1)
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.io.File getExternalFilesDir(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.io.File r2 = super.getExternalFilesDir(r2)     // Catch: java.lang.SecurityException -> L6 java.lang.NullPointerException -> Lb java.lang.ArrayIndexOutOfBoundsException -> L10
            return r2
        L6:
            r2 = move-exception
            android.ext.e1.a(r2)
            return r0
        Lb:
            r2 = move-exception
            android.ext.e1.a(r2)
            return r0
        L10:
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
            r1 = this;
            android.content.Context r0 = r1.b()
            if (r0 != 0) goto Lb
            android.content.res.Resources r0 = super.getResources()
            goto Lf
        Lb:
            android.content.res.Resources r0 = r0.getResources()
        Lf:
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.SharedPreferences getSharedPreferences(java.lang.String r1, int r2) {
            r0 = this;
            android.content.SharedPreferences r1 = super.getSharedPreferences(r1, r2)
            android.content.SharedPreferences r1 = android.ext.f2.a(r1)
            return r1
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = super.getSystemService(r1)     // Catch: java.lang.NullPointerException -> L9
            java.lang.Object r1 = a.f.a(r1)     // Catch: java.lang.NullPointerException -> L9
            return r1
        L9:
            r1 = move-exception
            android.ext.e1.a(r1)
            r1 = 0
            return r1
    }

    @Override // android.app.Activity
    public boolean moveTaskToBack(boolean r1) {
            r0 = this;
            r0.c()     // Catch: java.lang.Throwable -> L8
            boolean r1 = super.moveTaskToBack(r1)     // Catch: java.lang.Throwable -> L8
            return r1
        L8:
            r1 = move-exception
            android.ext.e1.a(r1)
            r0.finish()
            r1 = 1
            return r1
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle r1, android.os.PersistableBundle r2) {
            r0 = this;
            super.onCreate(r1, r2)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.app.Activity
    public void onDestroy() {
            r1 = this;
            r1.c()
            super.onDestroy()     // Catch: java.lang.Throwable -> L7
            goto Lb
        L7:
            r0 = move-exception
            android.ext.e1.a(r0)
        Lb:
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
            r1 = this;
            java.lang.String r0 = "Activity onLowMemory"
            android.ext.e1.d(r0)
            super.onLowMemory()
            r0 = -1
            android.ext.MainService.t0(r0)
            return
    }

    @Override // android.app.Activity
    protected void onPause() {
            r1 = this;
            super.onPause()     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
        L8:
            return
    }

    @Override // android.app.Activity
    protected void onPostCreate(android.os.Bundle r1) {
            r0 = this;
            super.onPostCreate(r1)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.app.Activity
    protected void onPostResume() {
            r1 = this;
            super.onPostResume()     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
        L8:
            return
    }

    @Override // android.app.Activity
    protected void onRestart() {
            r1 = this;
            super.onRestart()     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
        L8:
            return
    }

    @Override // android.app.Activity
    protected void onResume() {
            r1 = this;
            super.onResume()     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
        L8:
            return
    }

    @Override // android.app.Activity
    protected void onStart() {
            r1 = this;
            super.onStart()     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
        L8:
            return
    }

    @Override // android.app.Activity
    protected void onStop() {
            r1 = this;
            super.onStop()     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
        L8:
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Activity onTrimMemory: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            super.onTrimMemory(r3)
            android.ext.MainService.t0(r3)
            return
    }

    @Override // android.app.Activity
    public void setContentView(int r8) {
            r7 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            r1 = 1
            r2 = 0
            super.setContentView(r8)     // Catch: java.lang.RuntimeException -> Lb
            goto L6f
        Lb:
            r3 = move-exception
            java.lang.String r4 = "Failed fix call setContentView"
            if (r0 == r3) goto L18
            java.lang.String r5 = "Failed call super setContentView"
            android.ext.e1.l(r5, r3)     // Catch: java.lang.RuntimeException -> L16
            goto L19
        L16:
            r3 = move-exception
            goto L3b
        L18:
            r0 = r3
        L19:
            android.view.Window r5 = r7.getWindow()     // Catch: java.lang.RuntimeException -> L2f
            r5.setContentView(r8)     // Catch: java.lang.RuntimeException -> L2f
            r7.getActionBar()     // Catch: java.lang.RuntimeException -> L24
            goto L6f
        L24:
            r3 = move-exception
            if (r0 == r3) goto L2d
            java.lang.String r5 = "Failed call setup action bar"
            android.ext.e1.l(r5, r3)     // Catch: java.lang.RuntimeException -> L16
            goto L6f
        L2d:
            r0 = r3
            goto L6f
        L2f:
            r5 = move-exception
            if (r0 == r5) goto L36
            android.ext.e1.l(r4, r5)     // Catch: java.lang.RuntimeException -> L16
            goto L37
        L36:
            r0 = r5
        L37:
            r3.addSuppressed(r5)     // Catch: java.lang.RuntimeException -> L16
            throw r3     // Catch: java.lang.RuntimeException -> L16
        L3b:
            android.view.View r5 = a.d.f(r8, r2)     // Catch: java.lang.Throwable -> L84
            r7.f0a = r5     // Catch: java.lang.Throwable -> L84
            android.app.AlertDialog$Builder r6 = android.ext.f.c(r7)     // Catch: java.lang.Throwable -> L84
            android.app.AlertDialog$Builder r5 = r6.setView(r5)     // Catch: java.lang.Throwable -> L84
            java.lang.CharSequence r6 = r7.getTitle()     // Catch: java.lang.Throwable -> L84
            android.app.AlertDialog$Builder r5 = r5.setTitle(r6)     // Catch: java.lang.Throwable -> L84
            r6 = 0
            android.app.AlertDialog$Builder r5 = r5.setCancelable(r6)     // Catch: java.lang.Throwable -> L84
            android.app.AlertDialog r5 = r5.create()     // Catch: java.lang.Throwable -> L84
            a.a$b r6 = new a.a$b     // Catch: java.lang.Throwable -> L66
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L66
            r5.setOnCancelListener(r6)     // Catch: java.lang.Throwable -> L66
            r5.setCancelable(r1)     // Catch: java.lang.Throwable -> L66
            goto L6a
        L66:
            r6 = move-exception
            android.ext.e1.a(r6)     // Catch: java.lang.Throwable -> L84
        L6a:
            r7.f1b = r5     // Catch: java.lang.Throwable -> L84
            r5.show()     // Catch: java.lang.Throwable -> L84
        L6f:
            java.lang.String r0 = android.ext.e1.n(r0)
            java.lang.String r3 = r7.getPackageName()
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L83
            r7.f0a = r2
            int r8 = r8 - r1
            super.setContentView(r8)
        L83:
            return
        L84:
            r8 = move-exception
            android.ext.e1.l(r4, r8)
            r3.addSuppressed(r8)
            throw r3
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(android.content.Intent r4) {
            r3 = this;
            super.startActivity(r4)     // Catch: java.lang.RuntimeException -> L4 android.content.ActivityNotFoundException -> Ld java.lang.SecurityException -> L12
            goto L37
        L4:
            r0 = move-exception
            boolean r4 = a.b.h(r0, r3, r4)
            if (r4 == 0) goto Lc
            goto L37
        Lc:
            throw r0
        Ld:
            r4 = move-exception
            android.ext.e1.a(r4)
            goto L37
        L12:
            r0 = move-exception
            java.lang.String r1 = r4.getAction()
            java.lang.String r2 = "android.intent.action.UNINSTALL_PACKAGE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L28
            java.lang.String r0 = "android.intent.action.DELETE"
        L21:
            r4.setAction(r0)
            r3.startActivity(r4)
            goto L37
        L28:
            java.lang.String r1 = r4.getAction()
            java.lang.String r2 = "android.intent.action.INSTALL_PACKAGE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L38
            java.lang.String r0 = "android.intent.action.VIEW"
            goto L21
        L37:
            return
        L38:
            throw r0
    }

    @Override // android.app.Activity
    public void startActivityForResult(android.content.Intent r4, int r5) {
            r3 = this;
            super.startActivityForResult(r4, r5)     // Catch: java.lang.RuntimeException -> L4 android.content.ActivityNotFoundException -> L23 java.lang.SecurityException -> L28
            goto L4d
        L4:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            boolean r2 = android.ext.n2.e()
            if (r2 != 0) goto L22
            if (r1 == 0) goto L22
            java.lang.String r2 = "Looper.prepare()"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L22
            a.a$a r0 = new a.a$a
            r0.<init>(r3, r4, r5)
            android.ext.n2.i(r0)
            goto L4d
        L22:
            throw r0
        L23:
            r4 = move-exception
            android.ext.e1.a(r4)
            goto L4d
        L28:
            r0 = move-exception
            java.lang.String r1 = r4.getAction()
            java.lang.String r2 = "android.intent.action.UNINSTALL_PACKAGE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3e
            java.lang.String r0 = "android.intent.action.DELETE"
        L37:
            r4.setAction(r0)
            r3.startActivityForResult(r4, r5)
            goto L4d
        L3e:
            java.lang.String r1 = r4.getAction()
            java.lang.String r2 = "android.intent.action.INSTALL_PACKAGE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4e
            java.lang.String r0 = "android.intent.action.VIEW"
            goto L37
        L4d:
            return
        L4e:
            throw r0
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
}
