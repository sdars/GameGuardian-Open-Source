package android.ext;

/* JADX INFO: loaded from: classes.dex */
class z$j implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.app.Activity f1404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.view.View f1405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ android.view.WindowManager.LayoutParams f1406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int[] f1407d;

    z$j(android.app.Activity activity, android.view.View view, android.view.WindowManager.LayoutParams windowManager$LayoutParams, int[] iArr) {
        this.f1404a = activity;
        this.f1405b = view;
        this.f1406c = windowManager$LayoutParams;
        this.f1407d = iArr;
    }

    @Override // java.lang.Runnable
    public void run() {
java.lang.Throwable th = null;
        boolean z;
        android.view.WindowManager windowManager = null;
        try {
            windowManager = this.f1404a.getWindowManager();
            windowManager.addView(this.f1405b, this.f1406c);
            try {
                windowManager.removeView(this.f1405b);
                this.f1407d[0] = 1;
                synchronized (this) {
                    try {
                        notify();
                    } catch (java.lang.Throwable th_c) {
                        throw th_c;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                z = true;
                try {
                    android.ext.e1.s("Failed overlay probe", th);
                    this.f1407d[0] = -1;
                    if (z && windowManager != null) {
                        try {
                            windowManager.removeView(this.f1405b);
                        } catch (java.lang.Throwable th3) {
                            android.ext.e1.s("Failed remove overlay probe", th3);
                        }
                    }
                    synchronized (this) {
                        try {
                            notify();
                        } catch (java.lang.Throwable th4) {
                            throw th4;
                        }
                    }
                } catch (java.lang.Throwable th5) {
                    synchronized (this) {
                        try {
                            notify();
                            throw th5;
                        } catch (java.lang.Throwable th6) {
                            throw th6;
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            z = false;
        }
    }
}
