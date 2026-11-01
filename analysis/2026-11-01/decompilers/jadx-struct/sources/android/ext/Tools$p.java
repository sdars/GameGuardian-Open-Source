package android.ext;

import android.view.View;
import android.view.WindowManager$BadTokenException;
import android.view.WindowManager$LayoutParams;

/* JADX INFO: loaded from: classes.dex */
class Tools$p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ WindowManager$LayoutParams f531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f532c;

    Tools$p(boolean z, WindowManager$LayoutParams windowManager$LayoutParams, View view) {
        this.f530a = z;
        this.f531b = windowManager$LayoutParams;
        this.f532c = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        Tools.p();
        try {
            if (this.f530a) {
                MainService.instance.l.addView(this.f532c, this.f531b);
            } else {
                MainService.instance.l.updateViewLayout(this.f532c, this.f531b);
            }
        } catch (WindowManager$BadTokenException e2) {
            String message = e2.getMessage();
            if (!m2.f1074a || message == null || !message.contains("permission denied") || this.f531b.type == m2.c()) {
                throw e2;
            }
            WindowManager$LayoutParams windowManager$LayoutParams = this.f531b;
            int i = windowManager$LayoutParams.type;
            windowManager$LayoutParams.type = m2.c();
            try {
                if (this.f530a) {
                    MainService.instance.l.addView(this.f532c, this.f531b);
                } else {
                    MainService.instance.l.updateViewLayout(this.f532c, this.f531b);
                }
            } catch (WindowManager$BadTokenException e3) {
                this.f531b.type = i;
                throw e3;
            }
        } catch (IllegalArgumentException e4) {
            e = e4;
            e1.s("Fail", e);
        } catch (NullPointerException e5) {
            e1.a(e5);
        } catch (Throwable th) {
            e = th;
            e1.s("Fail", e);
        }
        if (this.f530a) {
            Tools.S(this.f532c);
        }
    }
}
