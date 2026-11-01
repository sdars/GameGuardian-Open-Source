package android.ext;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.DeadObjectException;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import catch_.me_.if_.you_.can_.R;

/* JADX INFO: loaded from: classes.dex */
public class i1 extends Dialog implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f1005a;

    class a implements View.OnApplyWindowInsetsListener {
        a() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            i1.this.c(i1.f(windowInsets));
            return windowInsets;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f1007a;

        b(View view) {
            this.f1007a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1007a.requestApplyInsets();
        }
    }

    public i1(Context context, View view) {
        super(context);
        this.f1005a = view;
        requestWindowFeature(1);
        setContentView(Tools.O0(view));
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        setOnDismissListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        if (!Tools.W1()) {
            i = 0;
        }
        if ((Config.B & 16) != 0) {
            i = Math.max(i, (int) Tools.G(24.0f));
        }
        this.f1005a.setPadding(0, i, 0, 0);
    }

    private static int d(WindowInsets windowInsets) {
        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.getSafeInsetTop();
    }

    private WindowManager.LayoutParams e() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = m2.b();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.format = -2;
        layoutParams.horizontalMargin = 0.0f;
        layoutParams.horizontalWeight = 1.0f;
        layoutParams.verticalMargin = 0.0f;
        layoutParams.verticalWeight = 1.0f;
        layoutParams.dimAmount = 0.0f;
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(WindowInsets windowInsets) {
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        return Build.VERSION.SDK_INT >= 28 ? Math.max(systemWindowInsetTop, d(windowInsets)) : systemWindowInsetTop;
    }

    private void i() {
        c(0);
        Window window = getWindow();
        window.setAttributes(e());
        window.setBackgroundDrawable(new ColorDrawable(0));
        if ((Config.B & 2) != 0) {
            window.addFlags(16777216);
        } else {
            window.clearFlags(16777216);
        }
        this.f1005a.setOnApplyWindowInsetsListener(new a());
        ShowApp.i(window);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
            Tools.O0(this.f1005a);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null && (cause instanceof DeadObjectException)) {
                f.o(ggf.b().setCustomTitle(Tools.g0(R.string.failed_remove_window)).setMessage(b2.f(R.string.system_service_stopped)).setPositiveButton(b2.f(R.string.exit), new p0(900)).setNegativeButton(b2.f(R.string.skip), (DialogInterface.OnClickListener) null));
            }
            e1.l("main dismiss failed", th);
        }
        if (isShowing()) {
            e1.p("main hide fail");
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable th) {
            e1.a(th);
            return false;
        }
    }

    public void g() {
        e1.d("MainDialog menu");
        MainService.instance.g0();
    }

    public void h() {
        View decorView;
        Window window = getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        n2.i(new b(decorView));
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        e1.d("MainDialog back");
        MainService.instance.t();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        e1.d("MainDialog dismiss");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            return true;
        }
        if (i != 82) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (super.onKeyUp(i, keyEvent)) {
            return true;
        }
        if (i != 82 || !keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        g();
        return true;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        try {
            super.setContentView(i);
        } catch (RuntimeException e2) {
            e1.a(e2);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        i();
        Tools.R(getWindow());
        try {
            super.show();
            Tools.S(getWindow().getDecorView());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null && (cause instanceof DeadObjectException)) {
                f.o(ggf.b().setCustomTitle(Tools.g0(R.string.failed_add_window)).setMessage(b2.f(R.string.system_service_stopped)).setPositiveButton(b2.f(R.string.exit), new p0(800)).setNegativeButton(b2.f(R.string.skip), (DialogInterface.OnClickListener) null));
            }
            e1.l("main show failed", th);
        }
        if (isShowing()) {
            return;
        }
        e1.p("main show fail");
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        try {
            super.setContentView(view);
        } catch (RuntimeException e2) {
            e1.a(e2);
        }
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        try {
            super.setContentView(view, layoutParams);
        } catch (RuntimeException e2) {
            e1.a(e2);
        }
    }
}
