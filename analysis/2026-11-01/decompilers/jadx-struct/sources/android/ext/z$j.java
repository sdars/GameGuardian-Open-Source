package android.ext;

import android.app.Activity;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager$LayoutParams;

/* JADX INFO: loaded from: classes.dex */
class z$j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f1404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f1405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ WindowManager$LayoutParams f1406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int[] f1407d;

    z$j(Activity activity, View view, WindowManager$LayoutParams windowManager$LayoutParams, int[] iArr) {
        this.f1404a = activity;
        this.f1405b = view;
        this.f1406c = windowManager$LayoutParams;
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
                    try {
                        notify();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                z = true;
                try {
                    e1.s("Failed overlay probe", th);
                    this.f1407d[0] = -1;
                    if (z && windowManager != null) {
                        try {
                            windowManager.removeView(this.f1405b);
                        } catch (Throwable th3) {
                            e1.s("Failed remove overlay probe", th3);
                        }
                    }
                    synchronized (this) {
                        try {
                            notify();
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    synchronized (this) {
                        try {
                            notify();
                            throw th5;
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                }
            }
        } catch (Throwable th7) {
            th = th7;
            z = false;
        }
    }
}
