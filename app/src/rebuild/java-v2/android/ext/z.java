package android.ext;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AppOpsManager;
import android.app.UiAutomation;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.fix.TextView;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import catch_.me_.if_.you_.can_.R;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class z implements View.OnClickListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnShowListener, View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f1376b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static View[] f1377c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static AlertDialog f1378d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f1379e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile Activity f1380f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile boolean f1381g = false;
    private static volatile DialogInterface h;
    private static int i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Activity f1382a;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f1383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f1384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1385c;

        /* JADX INFO: renamed from: android.ext.z$a$a, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0024a implements DialogInterface.OnClickListener {
            DialogInterfaceOnClickListenerC0024a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                boolean zX;
                Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                intent.setData(Uri.parse("package:" + Tools.C0()));
                synchronized (z.class) {
                    try {
                        zX = z.x();
                        if (zX) {
                            z.g();
                            s1.x();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    a.this.f1383a.startActivityForResult(intent, 0);
                } catch (Throwable th2) {
                    e1.l("Failed call intent", th2);
                    if (zX) {
                        s1.g();
                    }
                }
            }
        }

        class b implements DialogInterface.OnClickListener {
            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (z.x()) {
                    z.F();
                }
            }
        }

        class c implements DialogInterface.OnDismissListener {
            c() {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (z.x()) {
                    boolean unused = z.f1381g = false;
                }
            }
        }

        a(Activity activity, boolean z, int i) {
            this.f1383a = activity;
            this.f1384b = z;
            this.f1385c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                synchronized (z.class) {
                    try {
                        if (z.j(this.f1383a) && (!this.f1384b || z.s(this.f1385c, true))) {
                            AlertDialog alertDialogCreate = android.ext.ggf.c(this.f1383a).setCustomTitle(Tools.g0(R.string.floating_window_fail)).setMessage(R.string.enable_draw_perm).setNegativeButton(b2.f(R.string.skip), new b()).setPositiveButton(b2.f(R.string.ok), new DialogInterfaceOnClickListenerC0024a()).create();
                            android.ext.f.k(alertDialogCreate, new c());
                            if (z.r(this.f1383a, this.f1384b, this.f1385c, alertDialogCreate)) {
                                android.ext.f.w(alertDialogCreate);
                                return;
                            }
                            return;
                        }
                        z.q(this.f1383a);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                e1.l("Failed show float dialog", th2);
                z.q(this.f1383a);
                if (this.f1384b && z.x()) {
                    z.F();
                }
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.l();
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f1390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WindowManager.LayoutParams f1391b;

        c(View view, WindowManager.LayoutParams layoutParams) {
            this.f1390a = view;
            this.f1391b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Tools.f(this.f1390a, this.f1391b);
            } catch (Throwable th) {
                e1.l("Failed show test view(" + this.f1391b.type + ", " + this.f1391b.flags + "): " + this.f1390a + "; " + this.f1391b, th);
            }
            synchronized (this) {
                notify();
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AlertDialog f1393a;

        d(AlertDialog alertDialog) {
            this.f1393a = alertDialog;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                android.ext.f.w(this.f1393a);
            } catch (Throwable th) {
                e1.l("Failed show dialog: " + this.f1393a, th);
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.n();
        }
    }

    class f implements DialogInterface.OnClickListener {
        f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            StringBuilder sb = new StringBuilder();
            sb.append("package:");
            sb.append(Config.vSpaceReal ? Config.E : Tools.C0());
            intent.setData(Uri.parse(sb.toString()));
            z.this.f1382a.startActivity(intent);
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AlertDialog.Builder f1397a;

        g(AlertDialog.Builder builder) {
            this.f1397a = builder;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AlertDialog alertDialogCreate = this.f1397a.create();
                android.ext.f.w(alertDialogCreate);
                Tools.u1(alertDialogCreate);
            } catch (Throwable th) {
                e1.l("Failed show float dialog", th);
            }
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f1399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f1400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1401c;

        h(Activity activity, boolean z, int i) {
            this.f1399a = activity;
            this.f1400b = z;
            this.f1401c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.o(this.f1399a, this.f1400b, this.f1401c);
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f1402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DialogInterface f1403b;

        i(Activity activity, DialogInterface dialogInterface) {
            this.f1402a = activity;
            this.f1403b = dialogInterface;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.D(this.f1402a, this.f1403b);
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f1404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WindowManager.LayoutParams f1406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int[] f1407d;

        j(Activity activity, View view, WindowManager.LayoutParams layoutParams, int[] iArr) {
            this.f1404a = activity;
            this.f1405b = view;
            this.f1406c = layoutParams;
            this.f1407d = iArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            WindowManager windowManager = null;
            try {
                windowManager = this.f1404a.getWindowManager();
                windowManager.addView(this.f1405b, this.f1406c);
                try {
                    windowManager.removeView(this.f1405b);
                    this.f1407d[0] = 1;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    try {
                        e1.s("Failed overlay probe", th);
                        this.f1407d[0] = -1;
                        if (z && windowManager != null) {
                            try {
                                windowManager.removeView(this.f1405b);
                            } catch (Throwable th2) {
                                e1.s("Failed remove overlay probe", th2);
                            }
                        }
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th3) {
                        synchronized (this) {
                            notify();
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                z = false;
            }
        }
    }

    private static class k extends TextView implements View.OnTouchListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f1408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1410e;

        public k(Context context, String str, int i, int i2) {
            super(context);
            this.f1408c = str;
            this.f1409d = i;
            this.f1410e = i2;
            setTextColor(Color.rgb(255, 255, 255));
            setText(str);
            setOnTouchListener(this);
        }

        @Override // android.view.View
        protected boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
            e1.g("TestButton: dispatchGenericFocusedEvent for " + this.f1408c + ": " + motionEvent, new RuntimeException());
            return super.dispatchGenericFocusedEvent(motionEvent);
        }

        @Override // android.view.View
        public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
            e1.g("TestButton: dispatchGenericMotionEvent for " + this.f1408c + ": " + motionEvent, new RuntimeException());
            return super.dispatchGenericMotionEvent(motionEvent);
        }

        @Override // android.view.View
        protected boolean dispatchGenericPointerEvent(MotionEvent motionEvent) {
            e1.g("TestButton: dispatchGenericPointerEvent for " + this.f1408c + ": " + motionEvent, new RuntimeException());
            return super.dispatchGenericPointerEvent(motionEvent);
        }

        @Override // android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            e1.g("TestButton: dispatchKeyEvent for " + this.f1408c + ": " + keyEvent, new RuntimeException());
            return super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            e1.g("TestButton: dispatchTouchEvent for " + this.f1408c + ": " + motionEvent, new RuntimeException());
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
            e1.g("TestButton: dispatchTrackballEvent for " + this.f1408c + ": " + motionEvent, new RuntimeException());
            return super.dispatchTrackballEvent(motionEvent);
        }

        @Override // android.widget.TextView, android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            e1.g("TestButton: onGenericMotionEvent for " + this.f1408c + ": " + motionEvent, new RuntimeException());
            return super.onGenericMotionEvent(motionEvent);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            e1.g("TestButton: onTouch for " + this.f1408c + ": " + motionEvent, new RuntimeException());
            return false;
        }

        @Override // android.fix.TextView, android.widget.TextView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            e1.g("TestButton: onTouchEvent for " + this.f1408c + ": " + motionEvent, new RuntimeException());
            return super.onTouchEvent(motionEvent);
        }
    }

    public z(Activity activity) {
        this.f1382a = activity;
    }

    private static int A(Activity activity) {
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.type = m2.b();
            layoutParams.width = 1;
            layoutParams.height = 1;
            layoutParams.format = -2;
            layoutParams.flags = 312;
            if (Config.vSpaceReal && !Config.D) {
                layoutParams.packageName = Config.E;
            }
            int[] iArr = {0};
            j jVar = new j(activity, new View(activity), layoutParams, iArr);
            synchronized (jVar) {
                try {
                    n2.i(jVar);
                    long jUptimeMillis = SystemClock.uptimeMillis() + 10000;
                    while (iArr[0] == 0) {
                        long jUptimeMillis2 = jUptimeMillis - SystemClock.uptimeMillis();
                        if (jUptimeMillis2 <= 0) {
                            break;
                        }
                        jVar.wait(jUptimeMillis2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iArr[0];
        } catch (Throwable th2) {
            e1.s("Failed overlay probe", th2);
            return 0;
        }
    }

    private static synchronized boolean B(int i2, boolean z) {
        if (i2 != i) {
            return true;
        }
        return z && s1.D();
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
    public static void D(Activity activity, DialogInterface dialogInterface) {
        synchronized (z.class) {
            if (dialogInterface != null) {
                if (h == dialogInterface) {
                    q(activity);
                    try {
                        dialogInterface.dismiss();
                    } catch (Throwable th) {
                        e1.s("Failed dismiss overlay prompt", th);
                    }
                }
            }
        }
    }

    static void F() {
        synchronized (z.class) {
            try {
                if (x()) {
                    G();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void G() {
        t();
        s1.T("overlay-settled");
        s1.l();
    }

    public static AlertDialog.Builder H(AlertDialog.Builder builder) {
        String strF = Config.vSpaceReal ? Config.F : b2.f(R.string.app_name);
        return builder.setCustomTitle(Tools.g0(R.string.floating_window_fail)).setMessage(Tools.L1(Tools.N1(R.string.float_prompt), strF, strF, strF, strF) + ":\nhttps://productforums.google.com/forum/#!topic/translate/1Pywh5vI1kE\n\n" + Tools.N1(R.string.without_float) + ":\n" + Tools.removeNewLinesChars("kwwsv=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh25730krz0wr0xvh0jdphjxdugldq0zlwkrxw0iordw0zlqgrz0jdphjxdugldq2")).setNegativeButton(b2.f(R.string.ok), (DialogInterface.OnClickListener) null);
    }

    private void I() {
        AlertDialog.Builder builderH = H(android.ext.ggf.c(this.f1382a));
        builderH.setPositiveButton(b2.f(R.string.site), new r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf2:7360nqrzq0sureohpv2Bgr@ilqgFrpphqw)frpphqw@76<88"));
        if (Build.VERSION.SDK_INT >= 23) {
            builderH.setNeutralButton(b2.f(R.string.fix_it), new f());
        }
        n2.i(new g(builderH));
    }

    private static void K(Activity activity, boolean z, int i2) {
        n2.i(new a(activity, z, i2));
    }

    private void L(View view, int i2) {
        M(view, i2, m2.b(), m2.a() | 256, 0, 0);
    }

    private void M(View view, int i2, int i3, int i4, int i5, int i6) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = i3;
        layoutParams.width = i2;
        layoutParams.height = i2;
        layoutParams.format = -2;
        layoutParams.flags = i4;
        layoutParams.alpha = 1.0f;
        layoutParams.x = i5;
        layoutParams.y = i6;
        layoutParams.gravity = 51;
        c cVar = new c(view, layoutParams);
        synchronized (cVar) {
            n2.i(cVar);
            cVar.wait();
        }
    }

    static /* synthetic */ int g() {
        int i2 = i;
        i = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(Activity activity) {
        if (activity == null || activity != r.n || activity.isFinishing()) {
            return false;
        }
        return !activity.isDestroyed();
    }

    private static boolean k(Context context) {
        boolean zM = Tools.m(context);
        if (zM && Config.vSpaceReal) {
            int iMyUid = Process.myUid();
            boolean z = true;
            try {
                Method declaredMethod = Settings.class.getDeclaredMethod("isCallingPackageAllowedToDrawOverlays", Context.class, Integer.TYPE, String.class, Boolean.TYPE);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, context, Integer.valueOf(iMyUid), Config.E, Boolean.FALSE);
                if ((objInvoke instanceof Boolean) && !((Boolean) objInvoke).booleanValue()) {
                    zM = false;
                }
                e1.d("canDrawOverlays extended 1: " + objInvoke);
            } catch (Throwable th) {
                e1.s("Failed check canDrawOverlays", th);
            }
            try {
                int iCheckOpNoThrow = ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:system_alert_window", iMyUid, Config.E);
                if (iCheckOpNoThrow != 0 && (iCheckOpNoThrow != 3 || Tools.B0().checkPermission("android.permission.SYSTEM_ALERT_WINDOW", Config.E) != 0)) {
                    z = false;
                }
                if (!z) {
                    zM = false;
                }
                e1.d("canDrawOverlays extended 2: " + z + ' ' + iCheckOpNoThrow);
            } catch (Throwable th2) {
                e1.s("Failed check canDrawOverlays", th2);
            }
        }
        return zM;
    }

    public static void m() {
        r rVar;
        int i2;
        if (Build.VERSION.SDK_INT < 23 || (rVar = r.n) == null) {
            return;
        }
        boolean zX = x();
        synchronized (z.class) {
            i2 = i;
        }
        new g0(new h(rVar, zX, i2), "CheckFloatingWindowAPI").start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(Activity activity, boolean z, int i2) {
        boolean z2;
        try {
            boolean zK = k(activity);
            e1.d("canDrawOverlays: " + zK);
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
                        e1.d("overlay usable by probe");
                        Tools.h1();
                    }
                    if (!z) {
                        if (f1379e) {
                            f1379e = false;
                            ConfigListAdapter.m();
                            return;
                        }
                        return;
                    }
                    synchronized (z.class) {
                        try {
                            if (s(i2, true)) {
                                if (f1379e) {
                                    f1379e = false;
                                }
                                G();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                f1379e = true;
                if (!z) {
                    K(activity, false, 0);
                    return;
                }
                synchronized (z.class) {
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
                                s1.T("overlay-shown");
                                K(activity, true, i2);
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                e1.a(th);
            }
        } catch (Throwable th3) {
            e1.a(th3);
        }
    }

    private void p(boolean z) {
        AlertDialog alertDialog;
        View[] viewArr = f1377c;
        if (viewArr != null) {
            for (View view : viewArr) {
                if (view != null) {
                    Tools.m1(view);
                }
            }
            f1377c = null;
        }
        if (!z || (alertDialog = f1378d) == null) {
            return;
        }
        Tools.D(alertDialog);
        f1378d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(Activity activity) {
        synchronized (z.class) {
            try {
                if (f1380f == activity) {
                    f1380f = null;
                    f1381g = false;
                    h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Activity activity, boolean z, int i2, DialogInterface dialogInterface) {
        synchronized (z.class) {
            if (z) {
                try {
                    if (!s(i2, true)) {
                        q(activity);
                        return false;
                    }
                } catch (Throwable th) {
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
        Activity activity;
        DialogInterface dialogInterface;
        synchronized (z.class) {
            activity = f1380f;
            dialogInterface = h;
        }
        if (dialogInterface == null) {
            return;
        }
        n2.i(new i(activity, dialogInterface));
    }

    private int v(Random random) {
        return Color.rgb(random.nextInt(127) + 64, random.nextInt(127) + 64, random.nextInt(127) + 64);
    }

    private void w(MotionEvent motionEvent, boolean z) {
        if (u.f1267b == null) {
            return;
        }
        u.f1267b.sendPointerSync(motionEvent);
        UiAutomation uiAutomation = u.f1267b.getUiAutomation();
        if (uiAutomation != null) {
            uiAutomation.injectInputEvent(motionEvent, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean x() {
        return s1.u() && s1.O() == 3;
    }

    static boolean y() {
        return x() && f1381g;
    }

    static boolean z(int i2) {
        return i2 == 0 || i2 == 1;
    }

    public void E(int i2, int i3) {
        try {
            Tools.X1(Tools.I(new String[]{"input", "tap", Integer.toString(i2), Integer.toString(i3)}), 15);
        } catch (IOException e2) {
            e1.s("sendClick", e2);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        float f2 = i2;
        float f3 = i3;
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, f2, f3, 0);
        MotionEvent motionEventObtain2 = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, f2, f3, 0);
        motionEventObtain.setSource(4098);
        motionEventObtain2.setSource(4098);
        w(motionEventObtain, true);
        w(motionEventObtain2, true);
        motionEventObtain.recycle();
        motionEventObtain2.recycle();
    }

    public void J() {
        AlertDialog alertDialogCreate = android.ext.ggf.c(this.f1382a).setNegativeButton(b2.f(R.string.cancel), this).setCancelable(true).create();
        alertDialogCreate.setOnDismissListener(this);
        alertDialogCreate.setCanceledOnTouchOutside(false);
        alertDialogCreate.setCancelable(true);
        alertDialogCreate.setOnShowListener(this);
        f1378d = alertDialogCreate;
        n2.i(new d(alertDialogCreate));
    }

    void l() {
        try {
            int iV = v(Tools.f489a);
            int iG = (int) Tools.G(128.0f);
            View view = new View(MainService.context);
            view.setBackgroundColor(iV);
            view.setOnClickListener(this);
            try {
                L(view, iG);
                Thread.sleep(1000L);
                int[] iArr = {0, 0};
                view.getLocationOnScreen(iArr);
                int i2 = iG >> 1;
                E(iArr[0] + i2, iArr[1] + i2);
                Thread.sleep(1000L);
                Tools.m1(view);
                if (f1376b) {
                    Tools.H1(R.string.check_success);
                } else {
                    I();
                }
            } catch (Throwable th) {
                Tools.m1(view);
                throw th;
            }
        } catch (Throwable th2) {
            e1.l("Failed check floating window", th2);
        }
    }

    void n() {
        View[] viewArr;
        int i2;
        Random random;
        View[] viewArr2 = null;
        try {
            Random random2 = Tools.f489a;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) Tools.f0().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int iH = Tools.H();
            int i3 = ((displayMetrics.widthPixels / iH) / 2) * 2;
            int i4 = (displayMetrics.heightPixels / iH) * i3;
            int i5 = i4 > 100 ? 100 : i4;
            e1.d("checkAll: " + iH + "; " + i3 + "; " + i5 + "; " + iH + "; " + displayMetrics);
            int i6 = i5 / 2;
            int i7 = i3 / 2;
            viewArr = new View[i5];
            int i8 = 0;
            while (i8 < i5) {
                try {
                    boolean z = i8 / i6 == 0;
                    int i9 = (i8 % i6) + 2000;
                    int i10 = (z ? 0 : 32) | 8;
                    int iV = v(random2);
                    Context applicationContext = MainService.context.getApplicationContext();
                    StringBuilder sb = new StringBuilder();
                    sb.append(Integer.toString(i8 % i6));
                    sb.append(z ? "" : "'");
                    k kVar = new k(applicationContext, sb.toString(), i9, i10);
                    kVar.setBackgroundColor(iV);
                    kVar.setOnClickListener(this);
                    try {
                        random = random2;
                        i2 = i8;
                        try {
                            M(kVar, iH, i9, i10, ((i8 % i7) + (z ? 0 : i7)) * iH, ((i8 % i6) / i7) * iH);
                            viewArr[i2] = kVar;
                        } catch (Throwable th) {
                            th = th;
                            e1.l("Failed show: " + i9, th);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i2 = i8;
                        random = random2;
                    }
                    i8 = i2 + 1;
                    random2 = random;
                } catch (Throwable th3) {
                    th = th3;
                    viewArr2 = viewArr;
                    e1.l("Failed checkAll floating window", th);
                    viewArr = viewArr2;
                    p(false);
                    f1377c = viewArr;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
        p(false);
        f1377c = viewArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        p(true);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        p(true);
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        new g0(new e(), "ChangeFloatingWindow").start();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        e1.g("dbg: " + view + ' ' + motionEvent, new RuntimeException());
        return false;
    }

    public void u() {
        new g0(new b(), "CheckFloatingWindow").start();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e1.g("TestButton: onClick for " + view, new RuntimeException());
        if (!(view instanceof k)) {
            f1376b = true;
            return;
        }
        k kVar = (k) view;
        e1.d("onClick for " + kVar.f1408c);
        Config.b(R.id.config_float_type).f42d = kVar.f1409d;
        Config.b(R.id.config_float_flags).f42d = kVar.f1410e;
        Config.k();
        p(true);
        r.I();
    }
}
