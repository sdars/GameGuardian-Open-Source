package android.ext;

import android.app.AlertDialog;

/* JADX INFO: loaded from: classes.dex */
class f$d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertDialog f766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ f$n f767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Runnable f768c;

    f$d(AlertDialog alertDialog, f$n f_n, Runnable runnable) {
        this.f766a = alertDialog;
        this.f767b = f_n;
        this.f768c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f766a.isShowing()) {
            this.f767b.a();
            return;
        }
        if (this.f767b.c()) {
            e1.d("Fail-closed dialog was not shown");
            Runnable runnable = this.f768c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
