package android.ext;

import android.view.View;
import android.view.WindowManager$LayoutParams;

/* JADX INFO: loaded from: classes.dex */
class z$c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f1390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ WindowManager$LayoutParams f1391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ z f1392c;

    z$c(z zVar, View view, WindowManager$LayoutParams windowManager$LayoutParams) {
        this.f1392c = zVar;
        this.f1390a = view;
        this.f1391b = windowManager$LayoutParams;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Tools.f(this.f1390a, this.f1391b);
        } catch (Throwable th) {
            e1.l("Failed show test view(" + this.f1391b.type + ", " + this.f1391b.flags + "): " + this.f1390a + "; " + this.f1391b, th);
        }
        synchronized (this) {
            try {
                notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
