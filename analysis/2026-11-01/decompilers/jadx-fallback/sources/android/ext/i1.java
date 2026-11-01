package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class i1 extends android.app.Dialog implements android.content.DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.view.View f1005a;

    class a implements android.view.View.OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.i1 f1006a;

        a(android.ext.i1 r1) {
                r0 = this;
                r0.f1006a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public android.view.WindowInsets onApplyWindowInsets(android.view.View r2, android.view.WindowInsets r3) {
                r1 = this;
                android.ext.i1 r2 = r1.f1006a
                int r0 = android.ext.i1.a(r3)
                android.ext.i1.b(r2, r0)
                return r3
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View f1007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.i1 f1008b;

        b(android.ext.i1 r1, android.view.View r2) {
                r0 = this;
                r0.f1008b = r1
                r0.f1007a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.view.View r0 = r1.f1007a
                r0.requestApplyInsets()
                return
        }
    }

    public i1(android.content.Context r1, android.view.View r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f1005a = r2
            r1 = 1
            r0.requestWindowFeature(r1)
            android.view.View r1 = android.ext.Tools.O0(r2)
            r0.setContentView(r1)
            r1 = 0
            r0.setCanceledOnTouchOutside(r1)
            r0.setCancelable(r1)
            r0.setOnDismissListener(r0)
            return
    }

    static /* synthetic */ int a(android.view.WindowInsets r0) {
            int r0 = f(r0)
            return r0
    }

    static /* synthetic */ void b(android.ext.i1 r0, int r1) {
            r0.c(r1)
            return
    }

    private void c(int r3) {
            r2 = this;
            boolean r0 = android.ext.Tools.W1()
            r1 = 0
            if (r0 == 0) goto L8
            goto L9
        L8:
            r3 = 0
        L9:
            int r0 = android.ext.Config.B
            r0 = r0 & 16
            if (r0 == 0) goto L1a
            r0 = 1103101952(0x41c00000, float:24.0)
            float r0 = android.ext.Tools.G(r0)
            int r0 = (int) r0
            int r3 = java.lang.Math.max(r3, r0)
        L1a:
            android.view.View r0 = r2.f1005a
            r0.setPadding(r1, r3, r1, r1)
            return
    }

    private static int d(android.view.WindowInsets r0) {
            android.view.DisplayCutout r0 = android.ext.g1.a(r0)
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            int r0 = android.ext.h1.a(r0)
        Lc:
            return r0
    }

    private android.view.WindowManager.LayoutParams e() {
            r3 = this;
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            int r1 = android.ext.m2.b()
            r0.type = r1
            r1 = -1
            r0.width = r1
            r0.height = r1
            r1 = -2
            r0.format = r1
            r1 = 0
            r0.horizontalMargin = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.horizontalWeight = r2
            r0.verticalMargin = r1
            r0.verticalWeight = r2
            r0.dimAmount = r1
            return r0
    }

    private static int f(android.view.WindowInsets r3) {
            int r0 = r3.getSystemWindowInsetTop()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L12
            int r3 = d(r3)
            int r0 = java.lang.Math.max(r0, r3)
        L12:
            return r0
    }

    private void i() {
            r3 = this;
            r0 = 0
            r3.c(r0)
            android.view.Window r1 = r3.getWindow()
            android.view.WindowManager$LayoutParams r2 = r3.e()
            r1.setAttributes(r2)
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>(r0)
            r1.setBackgroundDrawable(r2)
            int r0 = android.ext.Config.B
            r0 = r0 & 2
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 == 0) goto L23
            r1.addFlags(r2)
            goto L26
        L23:
            r1.clearFlags(r2)
        L26:
            android.view.View r0 = r3.f1005a
            android.ext.i1$a r2 = new android.ext.i1$a
            r2.<init>(r3)
            r0.setOnApplyWindowInsetsListener(r2)
            android.ext.ShowApp.i(r1)
            return
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
            r5 = this;
            super.dismiss()     // Catch: java.lang.Throwable -> L9
            android.view.View r0 = r5.f1005a     // Catch: java.lang.Throwable -> L9
            android.ext.Tools.O0(r0)     // Catch: java.lang.Throwable -> L9
            goto L54
        L9:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L4f
            boolean r1 = r1 instanceof android.os.DeadObjectException
            if (r1 == 0) goto L4f
            android.app.AlertDialog$Builder r1 = android.ext.f.b()
            r2 = 2131296440(0x7f0900b8, float:1.8210797E38)
            android.view.View r2 = android.ext.Tools.g0(r2)
            android.app.AlertDialog$Builder r1 = r1.setCustomTitle(r2)
            r2 = 2131297003(0x7f0902eb, float:1.8211939E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            android.app.AlertDialog$Builder r1 = r1.setMessage(r2)
            r2 = 2131296424(0x7f0900a8, float:1.8210764E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            android.ext.p0 r3 = new android.ext.p0
            r4 = 900(0x384, float:1.261E-42)
            r3.<init>(r4)
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r3)
            r2 = 2131296963(0x7f0902c3, float:1.8211858E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r3 = 0
            android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r2, r3)
            android.ext.f.o(r1)
        L4f:
            java.lang.String r1 = "main dismiss failed"
            android.ext.e1.l(r1, r0)
        L54:
            boolean r0 = r5.isShowing()
            if (r0 == 0) goto L5f
            java.lang.String r0 = "main hide fail"
            android.ext.e1.p(r0)
        L5f:
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchTouchEvent(r1)     // Catch: java.lang.Throwable -> L5
            return r1
        L5:
            r1 = move-exception
            android.ext.e1.a(r1)
            r1 = 0
            return r1
    }

    public void g() {
            r1 = this;
            java.lang.String r0 = "MainDialog menu"
            android.ext.e1.d(r0)
            android.ext.MainService r0 = android.ext.MainService.instance
            r0.g0()
            return
    }

    public void h() {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            if (r0 != 0) goto L7
            return
        L7:
            android.view.View r0 = r0.getDecorView()
            if (r0 != 0) goto Le
            return
        Le:
            android.ext.i1$b r1 = new android.ext.i1$b
            r1.<init>(r2, r0)
            android.ext.n2.i(r1)
            return
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
            r1 = this;
            super.onBackPressed()
            java.lang.String r0 = "MainDialog back"
            android.ext.e1.d(r0)
            android.ext.MainService r0 = android.ext.MainService.instance
            r0.t()
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r1) {
            r0 = this;
            java.lang.String r1 = "MainDialog dismiss"
            android.ext.e1.d(r1)
            return
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r3, android.view.KeyEvent r4) {
            r2 = this;
            boolean r0 = super.onKeyDown(r3, r4)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 82
            if (r3 != r0) goto L10
            r4.startTracking()
            return r1
        L10:
            r3 = 0
            return r3
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r3, android.view.KeyEvent r4) {
            r2 = this;
            boolean r0 = super.onKeyUp(r3, r4)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 82
            if (r3 != r0) goto L1c
            boolean r3 = r4.isTracking()
            if (r3 == 0) goto L1c
            boolean r3 = r4.isCanceled()
            if (r3 != 0) goto L1c
            r2.g()
            return r1
        L1c:
            r3 = 0
            return r3
    }

    @Override // android.app.Dialog
    public void setContentView(int r1) {
            r0 = this;
            super.setContentView(r1)     // Catch: java.lang.RuntimeException -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r1) {
            r0 = this;
            super.setContentView(r1)     // Catch: java.lang.RuntimeException -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            super.setContentView(r1, r2)     // Catch: java.lang.RuntimeException -> L4
            goto L8
        L4:
            r1 = move-exception
            android.ext.e1.a(r1)
        L8:
            return
    }

    @Override // android.app.Dialog
    public void show() {
            r5 = this;
            r5.i()
            android.view.Window r0 = r5.getWindow()
            android.ext.Tools.R(r0)
            super.show()     // Catch: java.lang.Throwable -> L19
            android.view.Window r0 = r5.getWindow()     // Catch: java.lang.Throwable -> L19
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> L19
            android.ext.Tools.S(r0)     // Catch: java.lang.Throwable -> L19
            goto L64
        L19:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L5f
            boolean r1 = r1 instanceof android.os.DeadObjectException
            if (r1 == 0) goto L5f
            android.app.AlertDialog$Builder r1 = android.ext.f.b()
            r2 = 2131296434(0x7f0900b2, float:1.8210785E38)
            android.view.View r2 = android.ext.Tools.g0(r2)
            android.app.AlertDialog$Builder r1 = r1.setCustomTitle(r2)
            r2 = 2131297003(0x7f0902eb, float:1.8211939E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            android.app.AlertDialog$Builder r1 = r1.setMessage(r2)
            r2 = 2131296424(0x7f0900a8, float:1.8210764E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            android.ext.p0 r3 = new android.ext.p0
            r4 = 800(0x320, float:1.121E-42)
            r3.<init>(r4)
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r3)
            r2 = 2131296963(0x7f0902c3, float:1.8211858E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r3 = 0
            android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r2, r3)
            android.ext.f.o(r1)
        L5f:
            java.lang.String r1 = "main show failed"
            android.ext.e1.l(r1, r0)
        L64:
            boolean r0 = r5.isShowing()
            if (r0 != 0) goto L6f
            java.lang.String r0 = "main show fail"
            android.ext.e1.p(r0)
        L6f:
            return
    }
}
