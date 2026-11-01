package android.ext;

import android.app.AlertDialog;

/* JADX INFO: loaded from: classes.dex */
class z$d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertDialog f1393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f1394b;

    z$d(z zVar, AlertDialog alertDialog) {
        this.f1394b = zVar;
        this.f1393a = alertDialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            f.w(this.f1393a);
        } catch (Throwable th) {
            e1.l("Failed show dialog: " + this.f1393a, th);
        }
    }
}
