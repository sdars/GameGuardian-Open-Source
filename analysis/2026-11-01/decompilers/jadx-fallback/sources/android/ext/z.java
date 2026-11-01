package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class z implements android.view.View.OnClickListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnShowListener, android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f1376b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static android.view.View[] f1377c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static android.app.AlertDialog f1378d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f1379e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile android.app.Activity f1380f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile boolean f1381g = false;
    private static volatile android.content.DialogInterface h;
    private static int i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.app.Activity f1382a;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.Activity f1383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f1384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1385c;

        /* JADX INFO: renamed from: android.ext.z$a$a, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0024a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.z.a f1386a;

            DialogInterfaceOnClickListenerC0024a(android.ext.z.a r1) {
                    r0 = this;
                    r0.f1386a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r3, int r4) {
                    r2 = this;
                    android.content.Intent r3 = new android.content.Intent
                    java.lang.String r4 = "android.settings.action.MANAGE_OVERLAY_PERMISSION"
                    r3.<init>(r4)
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r0 = "package:"
                    r4.append(r0)
                    java.lang.String r0 = android.ext.Tools.C0()
                    r4.append(r0)
                    java.lang.String r4 = r4.toString()
                    android.net.Uri r4 = android.net.Uri.parse(r4)
                    r3.setData(r4)
                    java.lang.Class<android.ext.z> r4 = android.ext.z.class
                    monitor-enter(r4)
                    boolean r0 = android.ext.z.f()     // Catch: java.lang.Throwable -> L33
                    if (r0 == 0) goto L35
                    android.ext.z.g()     // Catch: java.lang.Throwable -> L33
                    android.ext.s1.x()     // Catch: java.lang.Throwable -> L33
                    goto L35
                L33:
                    r3 = move-exception
                    goto L4b
                L35:
                    monitor-exit(r4)     // Catch: java.lang.Throwable -> L33
                    android.ext.z$a r4 = r2.f1386a     // Catch: java.lang.Throwable -> L3f
                    android.app.Activity r4 = r4.f1383a     // Catch: java.lang.Throwable -> L3f
                    r1 = 0
                    r4.startActivityForResult(r3, r1)     // Catch: java.lang.Throwable -> L3f
                    goto L4a
                L3f:
                    r3 = move-exception
                    java.lang.String r4 = "Failed call intent"
                    android.ext.e1.l(r4, r3)
                    if (r0 == 0) goto L4a
                    android.ext.s1.g()
                L4a:
                    return
                L4b:
                    monitor-exit(r4)     // Catch: java.lang.Throwable -> L33
                    throw r3
            }
        }

        class b implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.z.a f1387a;

            b(android.ext.z.a r1) {
                    r0 = this;
                    r0.f1387a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r1, int r2) {
                    r0 = this;
                    boolean r1 = android.ext.z.f()
                    if (r1 == 0) goto L9
                    android.ext.z.F()
                L9:
                    return
            }
        }

        class c implements android.content.DialogInterface.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.z.a f1388a;

            c(android.ext.z.a r1) {
                    r0 = this;
                    r0.f1388a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(android.content.DialogInterface r1) {
                    r0 = this;
                    boolean r1 = android.ext.z.f()
                    if (r1 == 0) goto La
                    r1 = 0
                    android.ext.z.h(r1)
                La:
                    return
            }
        }

        a(android.app.Activity r1, boolean r2, int r3) {
                r0 = this;
                r0.f1383a = r1
                r0.f1384b = r2
                r0.f1385c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.lang.Class<android.ext.z> r0 = android.ext.z.class
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L71
                android.app.Activity r1 = r4.f1383a     // Catch: java.lang.Throwable -> L19
                boolean r1 = android.ext.z.c(r1)     // Catch: java.lang.Throwable -> L19
                if (r1 == 0) goto L73
                boolean r1 = r4.f1384b     // Catch: java.lang.Throwable -> L19
                if (r1 == 0) goto L1b
                int r1 = r4.f1385c     // Catch: java.lang.Throwable -> L19
                r2 = 1
                boolean r1 = android.ext.z.d(r1, r2)     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto L1b
                goto L73
            L19:
                r1 = move-exception
                goto L7a
            L1b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                android.app.Activity r0 = r4.f1383a     // Catch: java.lang.Throwable -> L71
                android.app.AlertDialog$Builder r0 = android.ext.f.c(r0)     // Catch: java.lang.Throwable -> L71
                r1 = 2131296459(0x7f0900cb, float:1.8210835E38)
                android.view.View r1 = android.ext.Tools.g0(r1)     // Catch: java.lang.Throwable -> L71
                android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r1)     // Catch: java.lang.Throwable -> L71
                r1 = 2131296405(0x7f090095, float:1.8210726E38)
                android.app.AlertDialog$Builder r0 = r0.setMessage(r1)     // Catch: java.lang.Throwable -> L71
                r1 = 2131296963(0x7f0902c3, float:1.8211858E38)
                java.lang.String r1 = android.ext.b2.f(r1)     // Catch: java.lang.Throwable -> L71
                android.ext.z$a$b r2 = new android.ext.z$a$b     // Catch: java.lang.Throwable -> L71
                r2.<init>(r4)     // Catch: java.lang.Throwable -> L71
                android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)     // Catch: java.lang.Throwable -> L71
                r1 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r1 = android.ext.b2.f(r1)     // Catch: java.lang.Throwable -> L71
                android.ext.z$a$a r2 = new android.ext.z$a$a     // Catch: java.lang.Throwable -> L71
                r2.<init>(r4)     // Catch: java.lang.Throwable -> L71
                android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)     // Catch: java.lang.Throwable -> L71
                android.app.AlertDialog r0 = r0.create()     // Catch: java.lang.Throwable -> L71
                android.ext.z$a$c r1 = new android.ext.z$a$c     // Catch: java.lang.Throwable -> L71
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L71
                android.ext.f.k(r0, r1)     // Catch: java.lang.Throwable -> L71
                android.app.Activity r1 = r4.f1383a     // Catch: java.lang.Throwable -> L71
                boolean r2 = r4.f1384b     // Catch: java.lang.Throwable -> L71
                int r3 = r4.f1385c     // Catch: java.lang.Throwable -> L71
                boolean r1 = android.ext.z.i(r1, r2, r3, r0)     // Catch: java.lang.Throwable -> L71
                if (r1 != 0) goto L6d
                return
            L6d:
                android.ext.f.w(r0)     // Catch: java.lang.Throwable -> L71
                goto L93
            L71:
                r0 = move-exception
                goto L7c
            L73:
                android.app.Activity r1 = r4.f1383a     // Catch: java.lang.Throwable -> L19
                android.ext.z.e(r1)     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L7a:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.Throwable -> L71
            L7c:
                java.lang.String r1 = "Failed show float dialog"
                android.ext.e1.l(r1, r0)
                android.app.Activity r0 = r4.f1383a
                android.ext.z.e(r0)
                boolean r0 = r4.f1384b
                if (r0 == 0) goto L93
                boolean r0 = android.ext.z.f()
                if (r0 == 0) goto L93
                android.ext.z.F()
            L93:
                return
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.z f1389a;

        b(android.ext.z r1) {
                r0 = this;
                r0.f1389a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.ext.z r0 = r1.f1389a
                r0.l()
                return
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View f1390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.WindowManager.LayoutParams f1391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.z f1392c;

        c(android.ext.z r1, android.view.View r2, android.view.WindowManager.LayoutParams r3) {
                r0 = this;
                r0.f1392c = r1
                r0.f1390a = r2
                r0.f1391b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.view.View r0 = r3.f1390a     // Catch: java.lang.Throwable -> L8
                android.view.WindowManager$LayoutParams r1 = r3.f1391b     // Catch: java.lang.Throwable -> L8
                android.ext.Tools.f(r0, r1)     // Catch: java.lang.Throwable -> L8
                goto L41
            L8:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed show test view("
                r1.append(r2)
                android.view.WindowManager$LayoutParams r2 = r3.f1391b
                int r2 = r2.type
                r1.append(r2)
                java.lang.String r2 = ", "
                r1.append(r2)
                android.view.WindowManager$LayoutParams r2 = r3.f1391b
                int r2 = r2.flags
                r1.append(r2)
                java.lang.String r2 = "): "
                r1.append(r2)
                android.view.View r2 = r3.f1390a
                r1.append(r2)
                java.lang.String r2 = "; "
                r1.append(r2)
                android.view.WindowManager$LayoutParams r2 = r3.f1391b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.ext.e1.l(r1, r0)
            L41:
                monitor-enter(r3)
                r3.notify()     // Catch: java.lang.Throwable -> L47
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L47
                return
            L47:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L47
                throw r0
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog f1393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.z f1394b;

        d(android.ext.z r1, android.app.AlertDialog r2) {
                r0 = this;
                r0.f1394b = r1
                r0.f1393a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.app.AlertDialog r0 = r3.f1393a     // Catch: java.lang.Throwable -> L6
                android.ext.f.w(r0)     // Catch: java.lang.Throwable -> L6
                goto L1d
            L6:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed show dialog: "
                r1.append(r2)
                android.app.AlertDialog r2 = r3.f1393a
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.ext.e1.l(r1, r0)
            L1d:
                return
        }
    }

    class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.z f1395a;

        e(android.ext.z r1) {
                r0 = this;
                r0.f1395a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.ext.z r0 = r1.f1395a
                r0.n()
                return
        }
    }

    class f implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.z f1396a;

        f(android.ext.z r1) {
                r0 = this;
                r0.f1396a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r2, int r3) {
                r1 = this;
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r3 = "android.settings.action.MANAGE_OVERLAY_PERMISSION"
                r2.<init>(r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "package:"
                r3.append(r0)
                boolean r0 = android.ext.Config.vSpaceReal
                if (r0 == 0) goto L18
                java.lang.String r0 = android.ext.Config.E
                goto L1c
            L18:
                java.lang.String r0 = android.ext.Tools.C0()
            L1c:
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                android.net.Uri r3 = android.net.Uri.parse(r3)
                r2.setData(r3)
                android.ext.z r3 = r1.f1396a
                android.app.Activity r3 = r3.f1382a
                r3.startActivity(r2)
                return
        }
    }

    class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog.Builder f1397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.z f1398b;

        g(android.ext.z r1, android.app.AlertDialog.Builder r2) {
                r0 = this;
                r0.f1398b = r1
                r0.f1397a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.app.AlertDialog$Builder r0 = r2.f1397a     // Catch: java.lang.Throwable -> Ld
                android.app.AlertDialog r0 = r0.create()     // Catch: java.lang.Throwable -> Ld
                android.ext.f.w(r0)     // Catch: java.lang.Throwable -> Ld
                android.ext.Tools.u1(r0)     // Catch: java.lang.Throwable -> Ld
                goto L13
            Ld:
                r0 = move-exception
                java.lang.String r1 = "Failed show float dialog"
                android.ext.e1.l(r1, r0)
            L13:
                return
        }
    }

    class h implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.Activity f1399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f1400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1401c;

        h(android.app.Activity r1, boolean r2, int r3) {
                r0 = this;
                r0.f1399a = r1
                r0.f1400b = r2
                r0.f1401c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.app.Activity r0 = r3.f1399a
                boolean r1 = r3.f1400b
                int r2 = r3.f1401c
                android.ext.z.a(r0, r1, r2)
                return
        }
    }

    class i implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.Activity f1402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.content.DialogInterface f1403b;

        i(android.app.Activity r1, android.content.DialogInterface r2) {
                r0 = this;
                r0.f1402a = r1
                r0.f1403b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.app.Activity r0 = r2.f1402a
                android.content.DialogInterface r1 = r2.f1403b
                android.ext.z.b(r0, r1)
                return
        }
    }

    class j implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.Activity f1404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.View f1405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.view.WindowManager.LayoutParams f1406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int[] f1407d;

        j(android.app.Activity r1, android.view.View r2, android.view.WindowManager.LayoutParams r3, int[] r4) {
                r0 = this;
                r0.f1404a = r1
                r0.f1405b = r2
                r0.f1406c = r3
                r0.f1407d = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                r0 = 0
                r1 = 0
                android.app.Activity r2 = r5.f1404a     // Catch: java.lang.Throwable -> L22
                android.view.WindowManager r0 = r2.getWindowManager()     // Catch: java.lang.Throwable -> L22
                android.view.View r2 = r5.f1405b     // Catch: java.lang.Throwable -> L22
                android.view.WindowManager$LayoutParams r3 = r5.f1406c     // Catch: java.lang.Throwable -> L22
                r0.addView(r2, r3)     // Catch: java.lang.Throwable -> L22
                r2 = 1
                android.view.View r3 = r5.f1405b     // Catch: java.lang.Throwable -> L25
                r0.removeView(r3)     // Catch: java.lang.Throwable -> L25
                int[] r3 = r5.f1407d     // Catch: java.lang.Throwable -> L22
                r3[r1] = r2     // Catch: java.lang.Throwable -> L22
                monitor-enter(r5)
                r5.notify()     // Catch: java.lang.Throwable -> L1f
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L1f
                goto L4a
            L1f:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L1f
                throw r0
            L22:
                r2 = move-exception
                r3 = 0
                goto L28
            L25:
                r3 = move-exception
                r2 = r3
                r3 = 1
            L28:
                java.lang.String r4 = "Failed overlay probe"
                android.ext.e1.s(r4, r2)     // Catch: java.lang.Throwable -> L43
                int[] r2 = r5.f1407d     // Catch: java.lang.Throwable -> L43
                r4 = -1
                r2[r1] = r4     // Catch: java.lang.Throwable -> L43
                if (r3 == 0) goto L45
                if (r0 == 0) goto L45
                android.view.View r1 = r5.f1405b     // Catch: java.lang.Throwable -> L3c
                r0.removeView(r1)     // Catch: java.lang.Throwable -> L3c
                goto L45
            L3c:
                r0 = move-exception
                java.lang.String r1 = "Failed remove overlay probe"
                android.ext.e1.s(r1, r0)     // Catch: java.lang.Throwable -> L43
                goto L45
            L43:
                r0 = move-exception
                goto L4e
            L45:
                monitor-enter(r5)
                r5.notify()     // Catch: java.lang.Throwable -> L4b
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L4b
            L4a:
                return
            L4b:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L4b
                throw r0
            L4e:
                monitor-enter(r5)
                r5.notify()     // Catch: java.lang.Throwable -> L54
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L54
                throw r0
            L54:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L54
                throw r0
        }
    }

    private static class k extends android.fix.TextView implements android.view.View.OnTouchListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        java.lang.String f1408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1410e;

        public k(android.content.Context r1, java.lang.String r2, int r3, int r4) {
                r0 = this;
                r0.<init>(r1)
                r0.f1408c = r2
                r0.f1409d = r3
                r0.f1410e = r4
                r1 = 255(0xff, float:3.57E-43)
                int r1 = android.graphics.Color.rgb(r1, r1, r1)
                r0.setTextColor(r1)
                r0.setText(r2)
                r0.setOnTouchListener(r0)
                return
        }

        @Override // android.view.View
        protected boolean dispatchGenericFocusedEvent(android.view.MotionEvent r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "TestButton: dispatchGenericFocusedEvent for "
                r0.append(r1)
                java.lang.String r1 = r2.f1408c
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>()
                android.ext.e1.g(r0, r1)
                boolean r3 = super.dispatchGenericFocusedEvent(r3)
                return r3
        }

        @Override // android.view.View
        public boolean dispatchGenericMotionEvent(android.view.MotionEvent r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "TestButton: dispatchGenericMotionEvent for "
                r0.append(r1)
                java.lang.String r1 = r2.f1408c
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>()
                android.ext.e1.g(r0, r1)
                boolean r3 = super.dispatchGenericMotionEvent(r3)
                return r3
        }

        @Override // android.view.View
        protected boolean dispatchGenericPointerEvent(android.view.MotionEvent r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "TestButton: dispatchGenericPointerEvent for "
                r0.append(r1)
                java.lang.String r1 = r2.f1408c
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>()
                android.ext.e1.g(r0, r1)
                boolean r3 = super.dispatchGenericPointerEvent(r3)
                return r3
        }

        @Override // android.view.View
        public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "TestButton: dispatchKeyEvent for "
                r0.append(r1)
                java.lang.String r1 = r2.f1408c
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>()
                android.ext.e1.g(r0, r1)
                boolean r3 = super.dispatchKeyEvent(r3)
                return r3
        }

        @Override // android.view.View
        public boolean dispatchTouchEvent(android.view.MotionEvent r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "TestButton: dispatchTouchEvent for "
                r0.append(r1)
                java.lang.String r1 = r2.f1408c
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>()
                android.ext.e1.g(r0, r1)
                boolean r3 = super.dispatchTouchEvent(r3)
                return r3
        }

        @Override // android.view.View
        public boolean dispatchTrackballEvent(android.view.MotionEvent r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "TestButton: dispatchTrackballEvent for "
                r0.append(r1)
                java.lang.String r1 = r2.f1408c
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>()
                android.ext.e1.g(r0, r1)
                boolean r3 = super.dispatchTrackballEvent(r3)
                return r3
        }

        @Override // android.widget.TextView, android.view.View
        public boolean onGenericMotionEvent(android.view.MotionEvent r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "TestButton: onGenericMotionEvent for "
                r0.append(r1)
                java.lang.String r1 = r2.f1408c
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>()
                android.ext.e1.g(r0, r1)
                boolean r3 = super.onGenericMotionEvent(r3)
                return r3
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r2, android.view.MotionEvent r3) {
                r1 = this;
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "TestButton: onTouch for "
                r2.append(r0)
                java.lang.String r0 = r1.f1408c
                r2.append(r0)
                java.lang.String r0 = ": "
                r2.append(r0)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                r3.<init>()
                android.ext.e1.g(r2, r3)
                r2 = 0
                return r2
        }

        @Override // android.fix.TextView, android.widget.TextView, android.view.View
        public boolean onTouchEvent(android.view.MotionEvent r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "TestButton: onTouchEvent for "
                r0.append(r1)
                java.lang.String r1 = r2.f1408c
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>()
                android.ext.e1.g(r0, r1)
                boolean r3 = super.onTouchEvent(r3)
                return r3
        }
    }

    static {
            return
    }

    public z(android.app.Activity r1) {
            r0 = this;
            r0.<init>()
            r0.f1382a = r1
            return
    }

    private static int A(android.app.Activity r9) {
            r0 = 0
            android.view.WindowManager$LayoutParams r1 = new android.view.WindowManager$LayoutParams     // Catch: java.lang.Throwable -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L25
            int r2 = android.ext.m2.b()     // Catch: java.lang.Throwable -> L25
            r1.type = r2     // Catch: java.lang.Throwable -> L25
            r2 = 1
            r1.width = r2     // Catch: java.lang.Throwable -> L25
            r1.height = r2     // Catch: java.lang.Throwable -> L25
            r2 = -2
            r1.format = r2     // Catch: java.lang.Throwable -> L25
            r2 = 312(0x138, float:4.37E-43)
            r1.flags = r2     // Catch: java.lang.Throwable -> L25
            boolean r2 = android.ext.Config.vSpaceReal     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
            boolean r2 = android.ext.Config.D     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L27
            java.lang.String r2 = android.ext.Config.E     // Catch: java.lang.Throwable -> L25
            r1.packageName = r2     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r9 = move-exception
            goto L5c
        L27:
            android.view.View r2 = new android.view.View     // Catch: java.lang.Throwable -> L25
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L25
            int[] r3 = new int[]{r0}     // Catch: java.lang.Throwable -> L25
            android.ext.z$j r4 = new android.ext.z$j     // Catch: java.lang.Throwable -> L25
            r4.<init>(r9, r2, r1, r3)     // Catch: java.lang.Throwable -> L25
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L25
            android.ext.n2.i(r4)     // Catch: java.lang.Throwable -> L54
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L54
            r5 = 10000(0x2710, double:4.9407E-320)
            long r1 = r1 + r5
        L40:
            r9 = r3[r0]     // Catch: java.lang.Throwable -> L54
            if (r9 != 0) goto L56
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L54
            long r5 = r1 - r5
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L56
            r4.wait(r5)     // Catch: java.lang.Throwable -> L54
            goto L40
        L54:
            r9 = move-exception
            goto L5a
        L56:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L54
            r9 = r3[r0]     // Catch: java.lang.Throwable -> L25
            return r9
        L5a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L54
            throw r9     // Catch: java.lang.Throwable -> L25
        L5c:
            java.lang.String r1 = "Failed overlay probe"
            android.ext.e1.s(r1, r9)
            return r0
    }

    private static synchronized boolean B(int r3, boolean r4) {
            java.lang.Class<android.ext.z> r0 = android.ext.z.class
            monitor-enter(r0)
            int r1 = android.ext.z.i     // Catch: java.lang.Throwable -> L13
            r2 = 1
            if (r3 == r1) goto La
            monitor-exit(r0)
            return r2
        La:
            if (r4 == 0) goto L15
            boolean r3 = android.ext.s1.D()     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L15
            goto L16
        L13:
            r3 = move-exception
            goto L18
        L15:
            r2 = 0
        L16:
            monitor-exit(r0)
            return r2
        L18:
            monitor-exit(r0)
            throw r3
    }

    static int C(boolean r0, int r1) {
            if (r0 == 0) goto L4
            r0 = 0
            return r0
        L4:
            r0 = 1
            if (r1 != r0) goto L8
            return r0
        L8:
            r0 = -1
            if (r1 != r0) goto Ld
            r0 = 2
            return r0
        Ld:
            r0 = 3
            return r0
    }

    private static void D(android.app.Activity r2, android.content.DialogInterface r3) {
            java.lang.Class<android.ext.z> r0 = android.ext.z.class
            monitor-enter(r0)
            if (r3 == 0) goto L1b
            android.content.DialogInterface r1 = android.ext.z.h     // Catch: java.lang.Throwable -> L19
            if (r1 == r3) goto La
            goto L1b
        La:
            q(r2)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            r3.dismiss()     // Catch: java.lang.Throwable -> L12
            goto L18
        L12:
            r2 = move-exception
            java.lang.String r3 = "Failed dismiss overlay prompt"
            android.ext.e1.s(r3, r2)
        L18:
            return
        L19:
            r2 = move-exception
            goto L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r2
    }

    static void F() {
            java.lang.Class<android.ext.z> r0 = android.ext.z.class
            monitor-enter(r0)
            boolean r1 = x()     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            goto L12
        Ld:
            G()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    private static void G() {
            t()
            java.lang.String r0 = "overlay-settled"
            android.ext.s1.T(r0)
            android.ext.s1.l()
            return
    }

    public static android.app.AlertDialog.Builder H(android.app.AlertDialog.Builder r5) {
            boolean r0 = android.ext.Config.vSpaceReal
            if (r0 == 0) goto L7
            java.lang.String r0 = android.ext.Config.F
            goto Le
        L7:
            r0 = 2131296280(0x7f090018, float:1.8210472E38)
            java.lang.String r0 = android.ext.b2.f(r0)
        Le:
            r1 = 2131296459(0x7f0900cb, float:1.8210835E38)
            android.view.View r1 = android.ext.Tools.g0(r1)
            android.app.AlertDialog$Builder r5 = r5.setCustomTitle(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 2131296458(0x7f0900ca, float:1.8210833E38)
            java.lang.String r2 = android.ext.Tools.N1(r2)
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            r4 = 1
            r3[r4] = r0
            r4 = 2
            r3[r4] = r0
            r4 = 3
            r3[r4] = r0
            java.lang.String r0 = android.ext.Tools.L1(r2, r3)
            r1.append(r0)
            java.lang.String r0 = ":\nhttps://productforums.google.com/forum/#!topic/translate/1Pywh5vI1kE\n\n"
            r1.append(r0)
            r0 = 2131297101(0x7f09034d, float:1.8212137E38)
            java.lang.String r0 = android.ext.Tools.N1(r0)
            r1.append(r0)
            java.lang.String r0 = ":\n"
            r1.append(r0)
            java.lang.String r0 = "kwwsv=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25730krz0wr0xvh0jdphjxdugldq0zlwkrxw0iordw0zlqgrz0jdphjxdugldq2"
            java.lang.String r0 = android.ext.Tools.removeNewLinesChars(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.app.AlertDialog$Builder r5 = r5.setMessage(r0)
            r0 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            r1 = 0
            android.app.AlertDialog$Builder r5 = r5.setNegativeButton(r0, r1)
            return r5
    }

    private void I() {
            r4 = this;
            android.app.Activity r0 = r4.f1382a
            android.app.AlertDialog$Builder r0 = android.ext.f.c(r0)
            android.app.AlertDialog$Builder r0 = H(r0)
            r1 = 2131296962(0x7f0902c2, float:1.8211855E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.ext.r$n r2 = new android.ext.r$n
            java.lang.String r3 = "kwws=22jdphjxdugldq1qhw2iruxp2wrslf2:7360nqrzq0sureohpv2Bgr@ilqgFrpphqw)frpphqw@76<88"
            r2.<init>(r3)
            r0.setPositiveButton(r1, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L30
            r1 = 2131296455(0x7f0900c7, float:1.8210827E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.ext.z$f r2 = new android.ext.z$f
            r2.<init>(r4)
            r0.setNeutralButton(r1, r2)
        L30:
            android.ext.z$g r1 = new android.ext.z$g
            r1.<init>(r4, r0)
            android.ext.n2.i(r1)
            return
    }

    private static void K(android.app.Activity r1, boolean r2, int r3) {
            android.ext.z$a r0 = new android.ext.z$a
            r0.<init>(r1, r2, r3)
            android.ext.n2.i(r0)
            return
    }

    private void L(android.view.View r8, int r9) {
            r7 = this;
            int r3 = android.ext.m2.b()
            int r0 = android.ext.m2.a()
            r4 = r0 | 256(0x100, float:3.59E-43)
            r5 = 0
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.M(r1, r2, r3, r4, r5, r6)
            return
    }

    private void M(android.view.View r2, int r3, int r4, int r5, int r6, int r7) {
            r1 = this;
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r0.type = r4
            r0.width = r3
            r0.height = r3
            r3 = -2
            r0.format = r3
            r0.flags = r5
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.alpha = r3
            r0.x = r6
            r0.y = r7
            r3 = 51
            r0.gravity = r3
            android.ext.z$c r3 = new android.ext.z$c
            r3.<init>(r1, r2, r0)
            monitor-enter(r3)
            android.ext.n2.i(r3)     // Catch: java.lang.Throwable -> L2a
            r3.wait()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            throw r2
    }

    static /* synthetic */ void a(android.app.Activity r0, boolean r1, int r2) {
            o(r0, r1, r2)
            return
    }

    static /* synthetic */ void b(android.app.Activity r0, android.content.DialogInterface r1) {
            D(r0, r1)
            return
    }

    static /* synthetic */ boolean c(android.app.Activity r0) {
            boolean r0 = j(r0)
            return r0
    }

    static /* synthetic */ boolean d(int r0, boolean r1) {
            boolean r0 = s(r0, r1)
            return r0
    }

    static /* synthetic */ void e(android.app.Activity r0) {
            q(r0)
            return
    }

    static /* synthetic */ boolean f() {
            boolean r0 = x()
            return r0
    }

    static /* synthetic */ int g() {
            int r0 = android.ext.z.i
            int r1 = r0 + 1
            android.ext.z.i = r1
            return r0
    }

    static /* synthetic */ boolean h(boolean r0) {
            android.ext.z.f1381g = r0
            return r0
    }

    static /* synthetic */ boolean i(android.app.Activity r0, boolean r1, int r2, android.content.DialogInterface r3) {
            boolean r0 = r(r0, r1, r2, r3)
            return r0
    }

    private static boolean j(android.app.Activity r2) {
            r0 = 0
            if (r2 == 0) goto L16
            android.ext.r r1 = android.ext.r.n
            if (r2 == r1) goto L8
            goto L16
        L8:
            boolean r1 = r2.isFinishing()
            if (r1 == 0) goto Lf
            return r0
        Lf:
            boolean r2 = r2.isDestroyed()
            r2 = r2 ^ 1
            return r2
        L16:
            return r0
    }

    private static boolean k(android.content.Context r12) {
            java.lang.String r0 = "Failed check canDrawOverlays"
            boolean r1 = android.ext.Tools.m(r12)
            if (r1 == 0) goto Lbd
            boolean r2 = android.ext.Config.vSpaceReal
            if (r2 == 0) goto Lbd
            int r2 = android.os.Process.myUid()
            r3 = 3
            r4 = 1
            r5 = 0
            java.lang.Class<android.provider.Settings> r6 = android.provider.Settings.class
            java.lang.String r7 = "isCallingPackageAllowedToDrawOverlays"
            r8 = 4
            java.lang.Class[] r9 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> L58
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r9[r5] = r10     // Catch: java.lang.Throwable -> L58
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L58
            r9[r4] = r10     // Catch: java.lang.Throwable -> L58
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r11 = 2
            r9[r11] = r10     // Catch: java.lang.Throwable -> L58
            java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L58
            r9[r3] = r10     // Catch: java.lang.Throwable -> L58
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r9)     // Catch: java.lang.Throwable -> L58
            r6.setAccessible(r4)     // Catch: java.lang.Throwable -> L58
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L58
            r7[r5] = r12     // Catch: java.lang.Throwable -> L58
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L58
            r7[r4] = r8     // Catch: java.lang.Throwable -> L58
            java.lang.String r8 = android.ext.Config.E     // Catch: java.lang.Throwable -> L58
            r7[r11] = r8     // Catch: java.lang.Throwable -> L58
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L58
            r7[r3] = r8     // Catch: java.lang.Throwable -> L58
            r8 = 0
            java.lang.Object r6 = r6.invoke(r8, r7)     // Catch: java.lang.Throwable -> L58
            boolean r7 = r6 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L58
            if (r7 == 0) goto L5a
            r7 = r6
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L58
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L58
            if (r7 != 0) goto L5a
            r1 = 0
            goto L5a
        L58:
            r6 = move-exception
            goto L6f
        L5a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r7.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.String r8 = "canDrawOverlays extended 1: "
            r7.append(r8)     // Catch: java.lang.Throwable -> L58
            r7.append(r6)     // Catch: java.lang.Throwable -> L58
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L58
            android.ext.e1.d(r6)     // Catch: java.lang.Throwable -> L58
            goto L72
        L6f:
            android.ext.e1.s(r0, r6)
        L72:
            java.lang.String r6 = "appops"
            java.lang.Object r12 = r12.getSystemService(r6)     // Catch: java.lang.Throwable -> L98
            android.app.AppOpsManager r12 = (android.app.AppOpsManager) r12     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = "android:system_alert_window"
            java.lang.String r7 = android.ext.Config.E     // Catch: java.lang.Throwable -> L98
            int r12 = r12.checkOpNoThrow(r6, r2, r7)     // Catch: java.lang.Throwable -> L98
            if (r12 == 0) goto L9a
            if (r12 == r3) goto L87
            goto L96
        L87:
            android.content.pm.PackageManager r2 = android.ext.Tools.B0()     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = "android.permission.SYSTEM_ALERT_WINDOW"
            java.lang.String r6 = android.ext.Config.E     // Catch: java.lang.Throwable -> L98
            int r2 = r2.checkPermission(r3, r6)     // Catch: java.lang.Throwable -> L98
            if (r2 != 0) goto L96
            goto L9a
        L96:
            r4 = 0
            goto L9a
        L98:
            r12 = move-exception
            goto Lba
        L9a:
            if (r4 != 0) goto L9d
            r1 = 0
        L9d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r2.<init>()     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = "canDrawOverlays extended 2: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L98
            r2.append(r4)     // Catch: java.lang.Throwable -> L98
            r3 = 32
            r2.append(r3)     // Catch: java.lang.Throwable -> L98
            r2.append(r12)     // Catch: java.lang.Throwable -> L98
            java.lang.String r12 = r2.toString()     // Catch: java.lang.Throwable -> L98
            android.ext.e1.d(r12)     // Catch: java.lang.Throwable -> L98
            goto Lbd
        Lba:
            android.ext.e1.s(r0, r12)
        Lbd:
            return r1
    }

    public static void m() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L28
            android.ext.r r0 = android.ext.r.n
            if (r0 != 0) goto Lb
            return
        Lb:
            boolean r1 = x()
            java.lang.Class<android.ext.z> r2 = android.ext.z.class
            monitor-enter(r2)
            int r3 = android.ext.z.i     // Catch: java.lang.Throwable -> L25
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            android.ext.g0 r2 = new android.ext.g0
            android.ext.z$h r4 = new android.ext.z$h
            r4.<init>(r0, r1, r3)
            java.lang.String r0 = "CheckFloatingWindowAPI"
            r2.<init>(r4, r0)
            r2.start()
            goto L28
        L25:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            throw r0
        L28:
            return
    }

    private static void o(android.app.Activity r4, boolean r5, int r6) {
            boolean r0 = k(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            r1.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "canDrawOverlays: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L42
            r1.append(r0)     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L42
            android.ext.e1.d(r1)     // Catch: java.lang.Throwable -> L42
            r1 = 1
            if (r0 == 0) goto L1d
            r2 = 1
            goto L21
        L1d:
            int r2 = A(r4)     // Catch: java.lang.Throwable -> L42
        L21:
            int r0 = C(r0, r2)     // Catch: java.lang.Throwable -> L42
            boolean r2 = j(r4)     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto Lba
            boolean r2 = x()     // Catch: java.lang.Throwable -> L42
            if (r5 != r2) goto Lba
            boolean r2 = B(r6, r5)     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L39
            goto Lba
        L39:
            r2 = 0
            if (r5 != 0) goto L45
            r3 = 0
            android.ext.z.f1380f = r3     // Catch: java.lang.Throwable -> L42
            android.ext.z.f1381g = r2     // Catch: java.lang.Throwable -> L42
            goto L45
        L42:
            r4 = move-exception
            goto Lbb
        L45:
            r3 = 2
            if (r0 != r3) goto L82
            android.ext.z.f1379e = r1     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L7e
            java.lang.Class<android.ext.z> r0 = android.ext.z.class
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L42
            boolean r5 = s(r6, r5)     // Catch: java.lang.Throwable -> L57
            if (r5 != 0) goto L59
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            return
        L57:
            r4 = move-exception
            goto L7c
        L59:
            android.app.Activity r5 = android.ext.z.f1380f     // Catch: java.lang.Throwable -> L57
            if (r5 == r4) goto L63
            android.ext.z.f1380f = r4     // Catch: java.lang.Throwable -> L57
            android.ext.z.f1381g = r1     // Catch: java.lang.Throwable -> L57
            r5 = 1
            goto L6b
        L63:
            boolean r5 = android.ext.z.f1381g     // Catch: java.lang.Throwable -> L57
            if (r5 != 0) goto L6a
            r5 = 0
            r2 = 1
            goto L6b
        L6a:
            r5 = 0
        L6b:
            if (r2 == 0) goto L70
            G()     // Catch: java.lang.Throwable -> L57
        L70:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto Lbe
            java.lang.String r5 = "overlay-shown"
            android.ext.s1.T(r5)     // Catch: java.lang.Throwable -> L42
            K(r4, r1, r6)     // Catch: java.lang.Throwable -> L42
            goto Lbe
        L7c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            throw r4     // Catch: java.lang.Throwable -> L42
        L7e:
            K(r4, r2, r2)     // Catch: java.lang.Throwable -> L42
            goto Lbe
        L82:
            r4 = 3
            if (r0 != r4) goto L86
            goto Lbe
        L86:
            boolean r4 = z(r0)     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L94
            java.lang.String r4 = "overlay usable by probe"
            android.ext.e1.d(r4)     // Catch: java.lang.Throwable -> L42
            android.ext.Tools.h1()     // Catch: java.lang.Throwable -> L42
        L94:
            if (r5 == 0) goto Lb0
            java.lang.Class<android.ext.z> r4 = android.ext.z.class
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L42
            boolean r5 = s(r6, r1)     // Catch: java.lang.Throwable -> La1
            if (r5 != 0) goto La3
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La1
            return
        La1:
            r5 = move-exception
            goto Lae
        La3:
            boolean r5 = android.ext.z.f1379e     // Catch: java.lang.Throwable -> La1
            if (r5 == 0) goto La9
            android.ext.z.f1379e = r2     // Catch: java.lang.Throwable -> La1
        La9:
            G()     // Catch: java.lang.Throwable -> La1
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La1
            goto Lbe
        Lae:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La1
            throw r5     // Catch: java.lang.Throwable -> L42
        Lb0:
            boolean r4 = android.ext.z.f1379e     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto Lbe
            android.ext.z.f1379e = r2     // Catch: java.lang.Throwable -> L42
            android.ext.ConfigListAdapter.m()     // Catch: java.lang.Throwable -> L42
            goto Lbe
        Lba:
            return
        Lbb:
            android.ext.e1.a(r4)
        Lbe:
            return
    }

    private void p(boolean r6) {
            r5 = this;
            android.view.View[] r0 = android.ext.z.f1377c
            r1 = 0
            if (r0 == 0) goto L16
            int r2 = r0.length
            r3 = 0
        L7:
            if (r3 >= r2) goto L14
            r4 = r0[r3]
            if (r4 != 0) goto Le
            goto L11
        Le:
            android.ext.Tools.m1(r4)
        L11:
            int r3 = r3 + 1
            goto L7
        L14:
            android.ext.z.f1377c = r1
        L16:
            if (r6 == 0) goto L21
            android.app.AlertDialog r6 = android.ext.z.f1378d
            if (r6 == 0) goto L21
            android.ext.Tools.D(r6)
            android.ext.z.f1378d = r1
        L21:
            return
    }

    private static void q(android.app.Activity r2) {
            java.lang.Class<android.ext.z> r0 = android.ext.z.class
            monitor-enter(r0)
            android.app.Activity r1 = android.ext.z.f1380f     // Catch: java.lang.Throwable -> L10
            if (r1 != r2) goto L12
            r2 = 0
            android.ext.z.f1380f = r2     // Catch: java.lang.Throwable -> L10
            r1 = 0
            android.ext.z.f1381g = r1     // Catch: java.lang.Throwable -> L10
            android.ext.z.h = r2     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r2 = move-exception
            goto L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    private static boolean r(android.app.Activity r2, boolean r3, int r4, android.content.DialogInterface r5) {
            java.lang.Class<android.ext.z> r0 = android.ext.z.class
            monitor-enter(r0)
            r1 = 1
            if (r3 == 0) goto L14
            boolean r4 = s(r4, r1)     // Catch: java.lang.Throwable -> L12
            if (r4 != 0) goto L14
            q(r2)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            r2 = 0
            return r2
        L12:
            r2 = move-exception
            goto L1a
        L14:
            if (r3 == 0) goto L18
            android.ext.z.h = r5     // Catch: java.lang.Throwable -> L12
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r1
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    private static boolean s(int r0, boolean r1) {
            boolean r0 = B(r0, r1)
            if (r0 != 0) goto Le
            boolean r0 = x()
            if (r1 != r0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    static void t() {
            java.lang.Class<android.ext.z> r0 = android.ext.z.class
            monitor-enter(r0)
            android.app.Activity r1 = android.ext.z.f1380f     // Catch: java.lang.Throwable -> L14
            android.content.DialogInterface r2 = android.ext.z.h     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lb
            return
        Lb:
            android.ext.z$i r0 = new android.ext.z$i
            r0.<init>(r1, r2)
            android.ext.n2.i(r0)
            return
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    private int v(java.util.Random r4) {
            r3 = this;
            r0 = 127(0x7f, float:1.78E-43)
            int r1 = r4.nextInt(r0)
            int r1 = r1 + 64
            int r2 = r4.nextInt(r0)
            int r2 = r2 + 64
            int r4 = r4.nextInt(r0)
            int r4 = r4 + 64
            int r4 = android.graphics.Color.rgb(r1, r2, r4)
            return r4
    }

    private void w(android.view.MotionEvent r2, boolean r3) {
            r1 = this;
            android.ext.u r0 = android.ext.u.f1267b
            if (r0 != 0) goto L5
            return
        L5:
            android.ext.u r0 = android.ext.u.f1267b
            r0.sendPointerSync(r2)
            android.ext.u r0 = android.ext.u.f1267b
            android.app.UiAutomation r0 = r0.getUiAutomation()
            if (r0 == 0) goto L15
            r0.injectInputEvent(r2, r3)
        L15:
            return
    }

    private static boolean x() {
            boolean r0 = android.ext.s1.u()
            if (r0 == 0) goto Lf
            int r0 = android.ext.s1.O()
            r1 = 3
            if (r0 != r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    static boolean y() {
            boolean r0 = x()
            if (r0 == 0) goto Lc
            boolean r0 = android.ext.z.f1381g
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    static boolean z(int r1) {
            r0 = 1
            if (r1 == 0) goto L7
            if (r1 != r0) goto L6
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void E(int r14, int r15) {
            r13 = this;
            r0 = 4
            r1 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.io.IOException -> L25
            java.lang.String r2 = "input"
            r3 = 0
            r0[r3] = r2     // Catch: java.io.IOException -> L25
            java.lang.String r2 = "tap"
            r0[r1] = r2     // Catch: java.io.IOException -> L25
            java.lang.String r2 = java.lang.Integer.toString(r14)     // Catch: java.io.IOException -> L25
            r3 = 2
            r0[r3] = r2     // Catch: java.io.IOException -> L25
            java.lang.String r2 = java.lang.Integer.toString(r15)     // Catch: java.io.IOException -> L25
            r3 = 3
            r0[r3] = r2     // Catch: java.io.IOException -> L25
            java.lang.Process r0 = android.ext.Tools.I(r0)     // Catch: java.io.IOException -> L25
            r2 = 15
            android.ext.Tools.X1(r0, r2)     // Catch: java.io.IOException -> L25
            goto L2b
        L25:
            r0 = move-exception
            java.lang.String r2 = "sendClick"
            android.ext.e1.s(r2, r0)
        L2b:
            long r11 = android.os.SystemClock.uptimeMillis()
            r7 = 0
            float r14 = (float) r14
            float r15 = (float) r15
            r10 = 0
            r3 = r11
            r5 = r11
            r8 = r14
            r9 = r15
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            r7 = 1
            android.view.MotionEvent r14 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            r15 = 4098(0x1002, float:5.743E-42)
            r0.setSource(r15)
            r14.setSource(r15)
            r13.w(r0, r1)
            r13.w(r14, r1)
            r0.recycle()
            r14.recycle()
            return
    }

    public void J() {
            r3 = this;
            android.app.Activity r0 = r3.f1382a
            android.app.AlertDialog$Builder r0 = android.ext.f.c(r0)
            r1 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r3)
            r1 = 1
            android.app.AlertDialog$Builder r0 = r0.setCancelable(r1)
            android.app.AlertDialog r0 = r0.create()
            r0.setOnDismissListener(r3)
            r2 = 0
            r0.setCanceledOnTouchOutside(r2)
            r0.setCancelable(r1)
            r0.setOnShowListener(r3)
            android.ext.z.f1378d = r0
            android.ext.z$d r1 = new android.ext.z$d
            r1.<init>(r3, r0)
            android.ext.n2.i(r1)
            return
    }

    void l() {
            r7 = this;
            java.util.Random r0 = android.ext.Tools.f489a     // Catch: java.lang.Throwable -> L46
            int r0 = r7.v(r0)     // Catch: java.lang.Throwable -> L46
            r1 = 1124073472(0x43000000, float:128.0)
            float r1 = android.ext.Tools.G(r1)     // Catch: java.lang.Throwable -> L46
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L46
            android.view.View r2 = new android.view.View     // Catch: java.lang.Throwable -> L46
            android.content.Context r3 = android.ext.MainService.context     // Catch: java.lang.Throwable -> L46
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L46
            r2.setBackgroundColor(r0)     // Catch: java.lang.Throwable -> L46
            r2.setOnClickListener(r7)     // Catch: java.lang.Throwable -> L46
            r7.L(r2, r1)     // Catch: java.lang.Throwable -> L4c
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r3)     // Catch: java.lang.Throwable -> L4c
            r0 = 0
            int[] r5 = new int[]{r0, r0}     // Catch: java.lang.Throwable -> L4c
            r2.getLocationOnScreen(r5)     // Catch: java.lang.Throwable -> L4c
            r6 = 1
            int r1 = r1 >> r6
            r0 = r5[r0]     // Catch: java.lang.Throwable -> L4c
            int r0 = r0 + r1
            r5 = r5[r6]     // Catch: java.lang.Throwable -> L4c
            int r5 = r5 + r1
            r7.E(r0, r5)     // Catch: java.lang.Throwable -> L4c
            java.lang.Thread.sleep(r3)     // Catch: java.lang.Throwable -> L4c
            android.ext.Tools.m1(r2)     // Catch: java.lang.Throwable -> L46
            boolean r0 = android.ext.z.f1376b     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L48
            r0 = 2131296322(0x7f090042, float:1.8210557E38)
            android.ext.Tools.H1(r0)     // Catch: java.lang.Throwable -> L46
            goto L56
        L46:
            r0 = move-exception
            goto L51
        L48:
            r7.I()     // Catch: java.lang.Throwable -> L46
            goto L56
        L4c:
            r0 = move-exception
            android.ext.Tools.m1(r2)     // Catch: java.lang.Throwable -> L46
            throw r0     // Catch: java.lang.Throwable -> L46
        L51:
            java.lang.String r1 = "Failed check floating window"
            android.ext.e1.l(r1, r0)
        L56:
            return
    }

    void n() {
            r18 = this;
            r8 = r18
            java.lang.String r0 = "; "
            r1 = 0
            java.util.Random r10 = android.ext.Tools.f489a     // Catch: java.lang.Throwable -> Lf8
            android.util.DisplayMetrics r2 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> Lf8
            r2.<init>()     // Catch: java.lang.Throwable -> Lf8
            android.content.Context r3 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r4 = "window"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch: java.lang.Throwable -> Lf8
            android.view.WindowManager r3 = (android.view.WindowManager) r3     // Catch: java.lang.Throwable -> Lf8
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch: java.lang.Throwable -> Lf8
            r3.getMetrics(r2)     // Catch: java.lang.Throwable -> Lf8
            int r11 = android.ext.Tools.H()     // Catch: java.lang.Throwable -> Lf8
            int r3 = r2.widthPixels     // Catch: java.lang.Throwable -> Lf8
            int r3 = r3 / r11
            int r3 = r3 / 2
            int r3 = r3 * 2
            int r4 = r2.heightPixels     // Catch: java.lang.Throwable -> Lf8
            int r4 = r4 / r11
            int r4 = r4 * r3
            r5 = 100
            if (r4 <= r5) goto L36
            r12 = 100
            goto L37
        L36:
            r12 = r4
        L37:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf8
            r4.<init>()     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r5 = "checkAll: "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lf8
            r4.append(r11)     // Catch: java.lang.Throwable -> Lf8
            r4.append(r0)     // Catch: java.lang.Throwable -> Lf8
            r4.append(r3)     // Catch: java.lang.Throwable -> Lf8
            r4.append(r0)     // Catch: java.lang.Throwable -> Lf8
            r4.append(r12)     // Catch: java.lang.Throwable -> Lf8
            r4.append(r0)     // Catch: java.lang.Throwable -> Lf8
            r4.append(r11)     // Catch: java.lang.Throwable -> Lf8
            r4.append(r0)     // Catch: java.lang.Throwable -> Lf8
            r4.append(r2)     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Lf8
            android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> Lf8
            int r13 = r12 / 2
            int r14 = r3 / 2
            android.view.View[] r15 = new android.view.View[r12]     // Catch: java.lang.Throwable -> Lf8
            r7 = 0
        L6a:
            if (r7 >= r12) goto Lf6
            int r0 = r7 / r13
            if (r0 != 0) goto L72
            r0 = 1
            goto L73
        L72:
            r0 = 0
        L73:
            int r1 = r7 % r13
            int r6 = r1 + 2000
            if (r0 == 0) goto L7b
            r1 = 0
            goto L7d
        L7b:
            r1 = 32
        L7d:
            r5 = r1 | 8
            int r1 = r8.v(r10)     // Catch: java.lang.Throwable -> L9e
            android.ext.z$k r4 = new android.ext.z$k     // Catch: java.lang.Throwable -> L9e
            android.content.Context r2 = android.ext.MainService.context     // Catch: java.lang.Throwable -> L9e
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L9e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r3.<init>()     // Catch: java.lang.Throwable -> L9e
            int r16 = r7 % r13
            java.lang.String r9 = java.lang.Integer.toString(r16)     // Catch: java.lang.Throwable -> L9e
            r3.append(r9)     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto La1
            java.lang.String r9 = ""
            goto La3
        L9e:
            r0 = move-exception
            r1 = r15
            goto Lf9
        La1:
            java.lang.String r9 = "'"
        La3:
            r3.append(r9)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L9e
            r4.<init>(r2, r3, r6, r5)     // Catch: java.lang.Throwable -> L9e
            r4.setBackgroundColor(r1)     // Catch: java.lang.Throwable -> L9e
            r4.setOnClickListener(r8)     // Catch: java.lang.Throwable -> L9e
            int r1 = r7 % r14
            if (r0 == 0) goto Lb9
            r0 = 0
            goto Lba
        Lb9:
            r0 = r14
        Lba:
            int r1 = r1 + r0
            int r0 = r7 % r13
            int r0 = r0 / r14
            int r9 = r1 * r11
            int r0 = r0 * r11
            r1 = r18
            r2 = r4
            r3 = r11
            r16 = r4
            r4 = r6
            r17 = r10
            r10 = r6
            r6 = r9
            r9 = r7
            r7 = r0
            r1.M(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Ld5
            r15[r9] = r16     // Catch: java.lang.Throwable -> Ld5
            goto Lf0
        Ld5:
            r0 = move-exception
            goto Ldc
        Ld7:
            r0 = move-exception
            r9 = r7
            r17 = r10
            r10 = r6
        Ldc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r1.<init>()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = "Failed show: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L9e
            r1.append(r10)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L9e
            android.ext.e1.l(r1, r0)     // Catch: java.lang.Throwable -> L9e
        Lf0:
            int r7 = r9 + 1
            r10 = r17
            goto L6a
        Lf6:
            r1 = 0
            goto L100
        Lf8:
            r0 = move-exception
        Lf9:
            java.lang.String r2 = "Failed checkAll floating window"
            android.ext.e1.l(r2, r0)
            r15 = r1
            goto Lf6
        L100:
            r8.p(r1)
            android.ext.z.f1377c = r15
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r1, int r2) {
            r0 = this;
            r1 = 1
            r0.p(r1)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TestButton: onClick for "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>()
            android.ext.e1.g(r0, r1)
            boolean r0 = r4 instanceof android.ext.z.k
            r1 = 1
            if (r0 == 0) goto L56
            android.ext.z$k r4 = (android.ext.z.k) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "onClick for "
            r0.append(r2)
            java.lang.String r2 = r4.f1408c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            r0 = 2131034165(0x7f050035, float:1.767884E38)
            android.ext.Config$p r0 = android.ext.Config.b(r0)
            int r2 = r4.f1409d
            r0.f42d = r2
            r0 = 2131034164(0x7f050034, float:1.7678838E38)
            android.ext.Config$p r0 = android.ext.Config.b(r0)
            int r4 = r4.f1410e
            r0.f42d = r4
            android.ext.Config.k()
            r3.p(r1)
            android.ext.r.I()
            return
        L56:
            android.ext.z.f1376b = r1
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r1) {
            r0 = this;
            r1 = 1
            r0.p(r1)
            return
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(android.content.DialogInterface r3) {
            r2 = this;
            android.ext.g0 r3 = new android.ext.g0
            android.ext.z$e r0 = new android.ext.z$e
            r0.<init>(r2)
            java.lang.String r1 = "ChangeFloatingWindow"
            r3.<init>(r0, r1)
            r3.start()
            return
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r3, android.view.MotionEvent r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "dbg: "
            r0.append(r1)
            r0.append(r3)
            r3 = 32
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>()
            android.ext.e1.g(r3, r4)
            r3 = 0
            return r3
    }

    public void u() {
            r3 = this;
            android.ext.g0 r0 = new android.ext.g0
            android.ext.z$b r1 = new android.ext.z$b
            r1.<init>(r3)
            java.lang.String r2 = "CheckFloatingWindow"
            r0.<init>(r1, r2)
            r0.start()
            return
    }
}
