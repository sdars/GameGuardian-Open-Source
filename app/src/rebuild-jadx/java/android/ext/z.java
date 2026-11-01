package android.ext;

/* JADX INFO: loaded from: classes.dex */
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
            DialogInterfaceOnClickListenerC0024a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                boolean zX;
                android.content.Intent intent = new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                intent.setData(android.net.Uri.parse("package:" + android.ext.Tools.C0()));
                synchronized (android.ext.z.class) {
                    try {
                        zX = android.ext.z.x();
                        if (zX) {
                            android.ext.z.g();
                            android.ext.s1.x();
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                try {
                    android.ext.z.a.this.f1383a.startActivityForResult(intent, 0);
                } catch (java.lang.Throwable th2) {
                    android.ext.e1.l("Failed call intent", th2);
                    if (zX) {
                        android.ext.s1.g();
                    }
                }
            }
        }

        class b implements android.content.DialogInterface.OnClickListener {
            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                if (android.ext.z.x()) {
                    android.ext.z.F();
                }
            }
        }

        class c implements android.content.DialogInterface.OnDismissListener {
            c() {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(android.content.DialogInterface dialogInterface) {
                if (android.ext.z.x()) {
                    boolean unused = android.ext.z.f1381g = false;
                }
            }
        }

        a(android.app.Activity activity, boolean z, int i) {
            this.f1383a = activity;
            this.f1384b = z;
            this.f1385c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                synchronized (android.ext.z.class) {
                    try {
                        if (android.ext.z.j(this.f1383a) && (!this.f1384b || android.ext.z.s(this.f1385c, true))) {
                            android.app.AlertDialog alertDialogCreate = android.ext.f.c(this.f1383a).setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.floating_window_fail)).setMessage(catch_.me_.if_.you_.can_.R.string.enable_draw_perm).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.skip), new android.ext.z.a.b()).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), new android.ext.z.a.DialogInterfaceOnClickListenerC0024a()).create();
                            android.ext.f.k(alertDialogCreate, new android.ext.z.a.c());
                            if (android.ext.z.r(this.f1383a, this.f1384b, this.f1385c, alertDialogCreate)) {
                                android.ext.f.w(alertDialogCreate);
                                return;
                            }
                            return;
                        }
                        android.ext.z.q(this.f1383a);
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                android.ext.e1.l("Failed show float dialog", th2);
                android.ext.z.q(this.f1383a);
                if (this.f1384b && android.ext.z.x()) {
                    android.ext.z.F();
                }
            }
        }
    }

    class b implements java.lang.Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.z.this.l();
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View f1390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.WindowManager.LayoutParams f1391b;

        c(android.view.View view, android.view.WindowManager.LayoutParams layoutParams) {
            this.f1390a = view;
            this.f1391b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                android.ext.Tools.f(this.f1390a, this.f1391b);
            } catch (java.lang.Throwable th) {
                android.ext.e1.l("Failed show test view(" + this.f1391b.type + ", " + this.f1391b.flags + "): " + this.f1390a + "; " + this.f1391b, th);
            }
            synchronized (this) {
                notify();
            }
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog f1393a;

        d(android.app.AlertDialog alertDialog) {
            this.f1393a = alertDialog;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                android.ext.f.w(this.f1393a);
            } catch (java.lang.Throwable th) {
                android.ext.e1.l("Failed show dialog: " + this.f1393a, th);
            }
        }
    }

    class e implements java.lang.Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.z.this.n();
        }
    }

    class f implements android.content.DialogInterface.OnClickListener {
        f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.content.Intent intent = new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("package:");
            sb.append(android.ext.Config.vSpaceReal ? android.ext.Config.E : android.ext.Tools.C0());
            intent.setData(android.net.Uri.parse(sb.toString()));
            android.ext.z.this.f1382a.startActivity(intent);
        }
    }

    class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog.Builder f1397a;

        g(android.app.AlertDialog.Builder builder) {
            this.f1397a = builder;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                android.app.AlertDialog alertDialogCreate = this.f1397a.create();
                android.ext.f.w(alertDialogCreate);
                android.ext.Tools.u1(alertDialogCreate);
            } catch (java.lang.Throwable th) {
                android.ext.e1.l("Failed show float dialog", th);
            }
        }
    }

    class h implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.Activity f1399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f1400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1401c;

        h(android.app.Activity activity, boolean z, int i) {
            this.f1399a = activity;
            this.f1400b = z;
            this.f1401c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.z.o(this.f1399a, this.f1400b, this.f1401c);
        }
    }

    class i implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.Activity f1402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.content.DialogInterface f1403b;

        i(android.app.Activity activity, android.content.DialogInterface dialogInterface) {
            this.f1402a = activity;
            this.f1403b = dialogInterface;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.z.D(this.f1402a, this.f1403b);
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

        j(android.app.Activity activity, android.view.View view, android.view.WindowManager.LayoutParams layoutParams, int[] iArr) {
            this.f1404a = activity;
            this.f1405b = view;
            this.f1406c = layoutParams;
            this.f1407d = iArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            android.view.WindowManager windowManager = null;
            try {
                windowManager = this.f1404a.getWindowManager();
                windowManager.addView(this.f1405b, this.f1406c);
                try {
                    windowManager.removeView(this.f1405b);
                    this.f1407d[0] = 1;
                    synchronized (this) {
                        notify();
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    z = true;
                    try {
                        android.ext.e1.s("Failed overlay probe", th);
                        this.f1407d[0] = -1;
                        if (z && windowManager != null) {
                            try {
                                windowManager.removeView(this.f1405b);
                            } catch (java.lang.Throwable th2) {
                                android.ext.e1.s("Failed remove overlay probe", th2);
                            }
                        }
                        synchronized (this) {
                            notify();
                        }
                    } catch (java.lang.Throwable th3) {
                        synchronized (this) {
                            notify();
                            throw th3;
                        }
                    }
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                z = false;
            }
        }
    }

    private static class k extends android.fix.TextView implements android.view.View.OnTouchListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        java.lang.String f1408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1410e;

        public k(android.content.Context context, java.lang.String str, int i, int i2) {
            super(context);
            this.f1408c = str;
            this.f1409d = i;
            this.f1410e = i2;
            setTextColor(android.graphics.Color.rgb(255, 255, 255));
            setText(str);
            setOnTouchListener(this);
        }

        @Override // android.view.View
        protected boolean dispatchGenericFocusedEvent(android.view.MotionEvent motionEvent) {
            android.ext.e1.g("TestButton: dispatchGenericFocusedEvent for " + this.f1408c + ": " + motionEvent, new java.lang.RuntimeException());
            return super.dispatchGenericFocusedEvent(motionEvent);
        }

        @Override // android.view.View
        public boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
            android.ext.e1.g("TestButton: dispatchGenericMotionEvent for " + this.f1408c + ": " + motionEvent, new java.lang.RuntimeException());
            return super.dispatchGenericMotionEvent(motionEvent);
        }

        @Override // android.view.View
        protected boolean dispatchGenericPointerEvent(android.view.MotionEvent motionEvent) {
            android.ext.e1.g("TestButton: dispatchGenericPointerEvent for " + this.f1408c + ": " + motionEvent, new java.lang.RuntimeException());
            return super.dispatchGenericPointerEvent(motionEvent);
        }

        @Override // android.view.View
        public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
            android.ext.e1.g("TestButton: dispatchKeyEvent for " + this.f1408c + ": " + keyEvent, new java.lang.RuntimeException());
            return super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.View
        public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
            android.ext.e1.g("TestButton: dispatchTouchEvent for " + this.f1408c + ": " + motionEvent, new java.lang.RuntimeException());
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public boolean dispatchTrackballEvent(android.view.MotionEvent motionEvent) {
            android.ext.e1.g("TestButton: dispatchTrackballEvent for " + this.f1408c + ": " + motionEvent, new java.lang.RuntimeException());
            return super.dispatchTrackballEvent(motionEvent);
        }

        @Override // android.widget.TextView, android.view.View
        public boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
            android.ext.e1.g("TestButton: onGenericMotionEvent for " + this.f1408c + ": " + motionEvent, new java.lang.RuntimeException());
            return super.onGenericMotionEvent(motionEvent);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            android.ext.e1.g("TestButton: onTouch for " + this.f1408c + ": " + motionEvent, new java.lang.RuntimeException());
            return false;
        }

        @Override // android.fix.TextView, android.widget.TextView, android.view.View
        public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
            android.ext.e1.g("TestButton: onTouchEvent for " + this.f1408c + ": " + motionEvent, new java.lang.RuntimeException());
            return super.onTouchEvent(motionEvent);
        }
    }

    public z(android.app.Activity activity) {
        this.f1382a = activity;
    }

    private static int A(android.app.Activity activity) {
        try {
            android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
            layoutParams.type = android.ext.m2.b();
            layoutParams.width = 1;
            layoutParams.height = 1;
            layoutParams.format = -2;
            layoutParams.flags = 312;
            if (android.ext.Config.vSpaceReal && !android.ext.Config.D) {
                layoutParams.packageName = android.ext.Config.E;
            }
            int[] iArr = {0};
            android.ext.z.j jVar = new android.ext.z.j(activity, new android.view.View(activity), layoutParams, iArr);
            synchronized (jVar) {
                try {
                    android.ext.n2.i(jVar);
                    long jUptimeMillis = android.os.SystemClock.uptimeMillis() + 10000;
                    while (iArr[0] == 0) {
                        long jUptimeMillis2 = jUptimeMillis - android.os.SystemClock.uptimeMillis();
                        if (jUptimeMillis2 <= 0) {
                            break;
                        }
                        jVar.wait(jUptimeMillis2);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            return iArr[0];
        } catch (java.lang.Throwable th2) {
            android.ext.e1.s("Failed overlay probe", th2);
            return 0;
        }
    }

    private static synchronized boolean B(int i2, boolean z) {
        if (i2 != i) {
            return true;
        }
        return z && android.ext.s1.D();
    }

    static int C(boolean z, int i2) {
        if (z) {
            return 0;
        }
        if (i2 == 1) {
            return 1;
        }
        return i2 == -1 ? 2 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(android.app.Activity activity, android.content.DialogInterface dialogInterface) {
        synchronized (android.ext.z.class) {
            if (dialogInterface != null) {
                if (h == dialogInterface) {
                    q(activity);
                    try {
                        dialogInterface.dismiss();
                    } catch (java.lang.Throwable th) {
                        android.ext.e1.s("Failed dismiss overlay prompt", th);
                    }
                }
            }
        }
    }

    static void F() {
        synchronized (android.ext.z.class) {
            try {
                if (x()) {
                    G();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private static void G() {
        t();
        android.ext.s1.T("overlay-settled");
        android.ext.s1.l();
    }

    public static android.app.AlertDialog.Builder H(android.app.AlertDialog.Builder builder) {
        java.lang.String strF = android.ext.Config.vSpaceReal ? android.ext.Config.F : android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.app_name);
        return builder.setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.floating_window_fail)).setMessage(android.ext.Tools.L1(android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.float_prompt), strF, strF, strF, strF) + ":\nhttps://productforums.google.com/forum/#!topic/translate/1Pywh5vI1kE\n\n" + android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.without_float) + ":\n" + android.ext.Tools.removeNewLinesChars("kwwsv=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25730krz0wr0xvh0jdphjxdugldq0zlwkrxw0iordw0zlqgrz0jdphjxdugldq2")).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null);
    }

    private void I() {
        android.app.AlertDialog.Builder builderH = H(android.ext.f.c(this.f1382a));
        builderH.setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.site), new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf2:7360nqrzq0sureohpv2Bgr@ilqgFrpphqw)frpphqw@76<88"));
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            builderH.setNeutralButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.fix_it), new android.ext.z.f());
        }
        android.ext.n2.i(new android.ext.z.g(builderH));
    }

    private static void K(android.app.Activity activity, boolean z, int i2) {
        android.ext.n2.i(new android.ext.z.a(activity, z, i2));
    }

    private void L(android.view.View view, int i2) {
        M(view, i2, android.ext.m2.b(), android.ext.m2.a() | 256, 0, 0);
    }

    private void M(android.view.View view, int i2, int i3, int i4, int i5, int i6) {
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.type = i3;
        layoutParams.width = i2;
        layoutParams.height = i2;
        layoutParams.format = -2;
        layoutParams.flags = i4;
        layoutParams.alpha = 1.0f;
        layoutParams.x = i5;
        layoutParams.y = i6;
        layoutParams.gravity = 51;
        android.ext.z.c cVar = new android.ext.z.c(view, layoutParams);
        synchronized (cVar) {
            android.ext.n2.i(cVar);
            cVar.wait();
        }
    }

    static /* synthetic */ int g() {
        int i2 = i;
        i = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(android.app.Activity activity) {
        if (activity == null || activity != android.ext.r.n || activity.isFinishing()) {
            return false;
        }
        return !activity.isDestroyed();
    }

    private static boolean k(android.content.Context context) {
        boolean zM = android.ext.Tools.m(context);
        if (zM && android.ext.Config.vSpaceReal) {
            int iMyUid = android.os.Process.myUid();
            boolean z = true;
            try {
                java.lang.reflect.Method declaredMethod = android.provider.Settings.class.getDeclaredMethod("isCallingPackageAllowedToDrawOverlays", android.content.Context.class, java.lang.Integer.TYPE, java.lang.String.class, java.lang.Boolean.TYPE);
                declaredMethod.setAccessible(true);
                java.lang.Object objInvoke = declaredMethod.invoke(null, context, java.lang.Integer.valueOf(iMyUid), android.ext.Config.E, java.lang.Boolean.FALSE);
                if ((objInvoke instanceof java.lang.Boolean) && !((java.lang.Boolean) objInvoke).booleanValue()) {
                    zM = false;
                }
                android.ext.e1.d("canDrawOverlays extended 1: " + objInvoke);
            } catch (java.lang.Throwable th) {
                android.ext.e1.s("Failed check canDrawOverlays", th);
            }
            try {
                int iCheckOpNoThrow = ((android.app.AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:system_alert_window", iMyUid, android.ext.Config.E);
                if (iCheckOpNoThrow != 0 && (iCheckOpNoThrow != 3 || android.ext.Tools.B0().checkPermission("android.permission.SYSTEM_ALERT_WINDOW", android.ext.Config.E) != 0)) {
                    z = false;
                }
                if (!z) {
                    zM = false;
                }
                android.ext.e1.d("canDrawOverlays extended 2: " + z + ' ' + iCheckOpNoThrow);
            } catch (java.lang.Throwable th2) {
                android.ext.e1.s("Failed check canDrawOverlays", th2);
            }
        }
        return zM;
    }

    public static void m() {
        android.ext.r rVar;
        int i2;
        if (android.os.Build.VERSION.SDK_INT < 23 || (rVar = android.ext.r.n) == null) {
            return;
        }
        boolean zX = x();
        synchronized (android.ext.z.class) {
            i2 = i;
        }
        new android.ext.g0(new android.ext.z.h(rVar, zX, i2), "CheckFloatingWindowAPI").start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(android.app.Activity activity, boolean z, int i2) {
        boolean z2;
        try {
            boolean zK = k(activity);
            android.ext.e1.d("canDrawOverlays: " + zK);
            int iC = C(zK, zK ? 1 : A(activity));
            if (j(activity) && z == x() && !B(i2, z)) {
                boolean z3 = false;
                if (!z) {
                    f1380f = null;
                    f1381g = false;
                }
                if (iC != 2) {
                    if (iC == 3) {
                        return;
                    }
                    if (z(iC)) {
                        android.ext.e1.d("overlay usable by probe");
                        android.ext.Tools.h1();
                    }
                    if (!z) {
                        if (f1379e) {
                            f1379e = false;
                            android.ext.ConfigListAdapter.m();
                            return;
                        }
                        return;
                    }
                    synchronized (android.ext.z.class) {
                        try {
                            if (s(i2, true)) {
                                if (f1379e) {
                                    f1379e = false;
                                }
                                G();
                                return;
                            }
                            return;
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                }
                f1379e = true;
                if (!z) {
                    K(activity, false, 0);
                    return;
                }
                synchronized (android.ext.z.class) {
                    try {
                        if (s(i2, z)) {
                            if (f1380f != activity) {
                                f1380f = activity;
                                f1381g = true;
                                z2 = true;
                            } else if (f1381g) {
                                z2 = false;
                            } else {
                                z2 = false;
                                z3 = true;
                            }
                            if (z3) {
                                G();
                            }
                            if (z2) {
                                android.ext.s1.T("overlay-shown");
                                K(activity, true, i2);
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (java.lang.Throwable th2) {
                        throw th2;
                    }
                }
                android.ext.e1.a(th);
            }
        } catch (java.lang.Throwable th3) {
            android.ext.e1.a(th3);
        }
    }

    private void p(boolean z) {
        android.app.AlertDialog alertDialog;
        android.view.View[] viewArr = f1377c;
        if (viewArr != null) {
            for (android.view.View view : viewArr) {
                if (view != null) {
                    android.ext.Tools.m1(view);
                }
            }
            f1377c = null;
        }
        if (!z || (alertDialog = f1378d) == null) {
            return;
        }
        android.ext.Tools.D(alertDialog);
        f1378d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(android.app.Activity activity) {
        synchronized (android.ext.z.class) {
            try {
                if (f1380f == activity) {
                    f1380f = null;
                    f1381g = false;
                    h = null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(android.app.Activity activity, boolean z, int i2, android.content.DialogInterface dialogInterface) {
        synchronized (android.ext.z.class) {
            if (z) {
                try {
                    if (!s(i2, true)) {
                        q(activity);
                        return false;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            if (z) {
                h = dialogInterface;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean s(int i2, boolean z) {
        return !B(i2, z) && z == x();
    }

    static void t() {
        android.app.Activity activity;
        android.content.DialogInterface dialogInterface;
        synchronized (android.ext.z.class) {
            activity = f1380f;
            dialogInterface = h;
        }
        if (dialogInterface == null) {
            return;
        }
        android.ext.n2.i(new android.ext.z.i(activity, dialogInterface));
    }

    private int v(java.util.Random random) {
        return android.graphics.Color.rgb(random.nextInt(127) + 64, random.nextInt(127) + 64, random.nextInt(127) + 64);
    }

    private void w(android.view.MotionEvent motionEvent, boolean z) {
        if (android.ext.u.f1267b == null) {
            return;
        }
        android.ext.u.f1267b.sendPointerSync(motionEvent);
        android.app.UiAutomation uiAutomation = android.ext.u.f1267b.getUiAutomation();
        if (uiAutomation != null) {
            uiAutomation.injectInputEvent(motionEvent, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean x() {
        return android.ext.s1.u() && android.ext.s1.O() == 3;
    }

    static boolean y() {
        return x() && f1381g;
    }

    static boolean z(int i2) {
        return i2 == 0 || i2 == 1;
    }

    public void E(int i2, int i3) {
        try {
            android.ext.Tools.X1(android.ext.Tools.I(new java.lang.String[]{"input", "tap", java.lang.Integer.toString(i2), java.lang.Integer.toString(i3)}), 15);
        } catch (java.io.IOException e2) {
            android.ext.e1.s("sendClick", e2);
        }
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        float f2 = i2;
        float f3 = i3;
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, f2, f3, 0);
        android.view.MotionEvent motionEventObtain2 = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, f2, f3, 0);
        motionEventObtain.setSource(4098);
        motionEventObtain2.setSource(4098);
        w(motionEventObtain, true);
        w(motionEventObtain2, true);
        motionEventObtain.recycle();
        motionEventObtain2.recycle();
    }

    public void J() {
        android.app.AlertDialog alertDialogCreate = android.ext.f.c(this.f1382a).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), this).setCancelable(true).create();
        alertDialogCreate.setOnDismissListener(this);
        alertDialogCreate.setCanceledOnTouchOutside(false);
        alertDialogCreate.setCancelable(true);
        alertDialogCreate.setOnShowListener(this);
        f1378d = alertDialogCreate;
        android.ext.n2.i(new android.ext.z.d(alertDialogCreate));
    }

    void l() {
        try {
            int iV = v(android.ext.Tools.f489a);
            int iG = (int) android.ext.Tools.G(128.0f);
            android.view.View view = new android.view.View(android.ext.MainService.context);
            view.setBackgroundColor(iV);
            view.setOnClickListener(this);
            try {
                L(view, iG);
                java.lang.Thread.sleep(1000L);
                int[] iArr = {0, 0};
                view.getLocationOnScreen(iArr);
                int i2 = iG >> 1;
                E(iArr[0] + i2, iArr[1] + i2);
                java.lang.Thread.sleep(1000L);
                android.ext.Tools.m1(view);
                if (f1376b) {
                    android.ext.Tools.H1(catch_.me_.if_.you_.can_.R.string.check_success);
                } else {
                    I();
                }
            } catch (java.lang.Throwable th) {
                android.ext.Tools.m1(view);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            android.ext.e1.l("Failed check floating window", th2);
        }
    }

    void n() {
        android.view.View[] viewArr;
        int i2;
        java.util.Random random;
        android.view.View[] viewArr2 = null;
        try {
            java.util.Random random2 = android.ext.Tools.f489a;
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            ((android.view.WindowManager) android.ext.Tools.f0().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int iH = android.ext.Tools.H();
            int i3 = ((displayMetrics.widthPixels / iH) / 2) * 2;
            int i4 = (displayMetrics.heightPixels / iH) * i3;
            int i5 = i4 > 100 ? 100 : i4;
            android.ext.e1.d("checkAll: " + iH + "; " + i3 + "; " + i5 + "; " + iH + "; " + displayMetrics);
            int i6 = i5 / 2;
            int i7 = i3 / 2;
            viewArr = new android.view.View[i5];
            int i8 = 0;
            while (i8 < i5) {
                try {
                    boolean z = i8 / i6 == 0;
                    int i9 = (i8 % i6) + 2000;
                    int i10 = (z ? 0 : 32) | 8;
                    int iV = v(random2);
                    android.content.Context applicationContext = android.ext.MainService.context.getApplicationContext();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(java.lang.Integer.toString(i8 % i6));
                    sb.append(z ? "" : "'");
                    android.ext.z.k kVar = new android.ext.z.k(applicationContext, sb.toString(), i9, i10);
                    kVar.setBackgroundColor(iV);
                    kVar.setOnClickListener(this);
                    try {
                        random = random2;
                        i2 = i8;
                        try {
                            M(kVar, iH, i9, i10, ((i8 % i7) + (z ? 0 : i7)) * iH, ((i8 % i6) / i7) * iH);
                            viewArr[i2] = kVar;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            android.ext.e1.l("Failed show: " + i9, th);
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        i2 = i8;
                        random = random2;
                    }
                    i8 = i2 + 1;
                    random2 = random;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    viewArr2 = viewArr;
                    android.ext.e1.l("Failed checkAll floating window", th);
                    viewArr = viewArr2;
                    p(false);
                    f1377c = viewArr;
                }
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
        p(false);
        f1377c = viewArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i2) {
        p(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.ext.e1.g("TestButton: onClick for " + view, new java.lang.RuntimeException());
        if (!(view instanceof android.ext.z.k)) {
            f1376b = true;
            return;
        }
        android.ext.z.k kVar = (android.ext.z.k) view;
        android.ext.e1.d("onClick for " + kVar.f1408c);
        android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_float_type).f42d = kVar.f1409d;
        android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_float_flags).f42d = kVar.f1410e;
        android.ext.Config.k();
        p(true);
        android.ext.r.I();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        p(true);
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(android.content.DialogInterface dialogInterface) {
        new android.ext.g0(new android.ext.z.e(), "ChangeFloatingWindow").start();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.ext.e1.g("dbg: " + view + ' ' + motionEvent, new java.lang.RuntimeException());
        return false;
    }

    public void u() {
        new android.ext.g0(new android.ext.z.b(), "CheckFloatingWindow").start();
    }
}
