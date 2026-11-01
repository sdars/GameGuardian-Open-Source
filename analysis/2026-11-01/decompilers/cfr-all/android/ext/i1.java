/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.DeadObjectException
 *  android.view.DisplayCutout
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.view.WindowInsets
 *  android.view.WindowManager$LayoutParams
 */
package android.ext;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.ext.Config;
import android.ext.MainService;
import android.ext.ShowApp;
import android.ext.Tools;
import android.ext.b2;
import android.ext.e1;
import android.ext.f;
import android.ext.g1;
import android.ext.h1;
import android.ext.m2;
import android.ext.n2;
import android.ext.p0;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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

public class i1
extends Dialog
implements DialogInterface.OnDismissListener {
    private View a;

    public i1(Context context, View view) {
        super(context);
        this.a = view;
        this.requestWindowFeature(1);
        this.setContentView(Tools.O0(view));
        this.setCanceledOnTouchOutside(false);
        this.setCancelable(false);
        this.setOnDismissListener(this);
    }

    private void c(int n3) {
        if (!Tools.W1()) {
            n3 = 0;
        }
        int n4 = n3;
        if ((Config.B & 0x10) != 0) {
            n4 = Math.max(n3, (int)Tools.G(24.0f));
        }
        this.a.setPadding(0, n4, 0, 0);
    }

    private static int d(WindowInsets windowInsets) {
        int n3 = (windowInsets = g1.a(windowInsets)) == null ? 0 : h1.a((DisplayCutout)windowInsets);
        return n3;
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

    private static int f(WindowInsets windowInsets) {
        int n3;
        int n4 = n3 = windowInsets.getSystemWindowInsetTop();
        if (Build.VERSION.SDK_INT >= 28) {
            n4 = Math.max(n3, i1.d(windowInsets));
        }
        return n4;
    }

    private void i() {
        this.c(0);
        Window window = this.getWindow();
        window.setAttributes(this.e());
        window.setBackgroundDrawable((Drawable)new ColorDrawable(0));
        if ((Config.B & 2) != 0) {
            window.addFlags(0x1000000);
        } else {
            window.clearFlags(0x1000000);
        }
        this.a.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this){
            final i1 a;
            {
                this.a = i12;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                this.a.c(i1.f(windowInsets));
                return windowInsets;
            }
        });
        ShowApp.i(window);
    }

    public void dismiss() {
        try {
            super.dismiss();
            Tools.O0(this.a);
        }
        catch (Throwable throwable) {
            Throwable throwable2 = throwable.getCause();
            if (throwable2 != null && throwable2 instanceof DeadObjectException) {
                f.o(f.b().setCustomTitle(Tools.g0(2131296440)).setMessage((CharSequence)b2.f(2131297003)).setPositiveButton((CharSequence)b2.f(2131296424), (DialogInterface.OnClickListener)new p0(900)).setNegativeButton((CharSequence)b2.f(2131296963), null));
            }
            e1.l("main dismiss failed", throwable);
        }
        if (this.isShowing()) {
            e1.p("main hide fail");
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            boolean bl = super.dispatchTouchEvent(motionEvent);
            return bl;
        }
        catch (Throwable throwable) {
            e1.a(throwable);
            return false;
        }
    }

    public void g() {
        e1.d("MainDialog menu");
        MainService.instance.g0();
    }

    public void h() {
        Window window = this.getWindow();
        if (window == null) {
            return;
        }
        if ((window = window.getDecorView()) == null) {
            return;
        }
        n2.i(new Runnable(this, (View)window){
            final View a;
            final i1 b;
            {
                this.b = i12;
                this.a = view;
            }

            @Override
            public void run() {
                this.a.requestApplyInsets();
            }
        });
    }

    public void onBackPressed() {
        super.onBackPressed();
        e1.d("MainDialog back");
        MainService.instance.t();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        e1.d("MainDialog dismiss");
    }

    public boolean onKeyDown(int n3, KeyEvent keyEvent) {
        if (super.onKeyDown(n3, keyEvent)) {
            return true;
        }
        if (n3 == 82) {
            keyEvent.startTracking();
            return true;
        }
        return false;
    }

    public boolean onKeyUp(int n3, KeyEvent keyEvent) {
        if (super.onKeyUp(n3, keyEvent)) {
            return true;
        }
        if (n3 == 82 && keyEvent.isTracking() && !keyEvent.isCanceled()) {
            this.g();
            return true;
        }
        return false;
    }

    public void setContentView(int n3) {
        try {
            super.setContentView(n3);
        }
        catch (RuntimeException runtimeException) {
            e1.a(runtimeException);
        }
    }

    public void setContentView(View view) {
        try {
            super.setContentView(view);
        }
        catch (RuntimeException runtimeException) {
            e1.a(runtimeException);
        }
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        try {
            super.setContentView(view, layoutParams);
        }
        catch (RuntimeException runtimeException) {
            e1.a(runtimeException);
        }
    }

    public void show() {
        this.i();
        Tools.R(this.getWindow());
        try {
            super.show();
            Tools.S(this.getWindow().getDecorView());
        }
        catch (Throwable throwable) {
            Throwable throwable2 = throwable.getCause();
            if (throwable2 != null && throwable2 instanceof DeadObjectException) {
                f.o(f.b().setCustomTitle(Tools.g0(2131296434)).setMessage((CharSequence)b2.f(2131297003)).setPositiveButton((CharSequence)b2.f(2131296424), (DialogInterface.OnClickListener)new p0(800)).setNegativeButton((CharSequence)b2.f(2131296963), null));
            }
            e1.l("main show failed", throwable);
        }
        if (!this.isShowing()) {
            e1.p("main show fail");
        }
    }
}

