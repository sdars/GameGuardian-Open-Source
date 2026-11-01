package android.ext;

import android.app.AlertDialog;

/* JADX INFO: loaded from: classes.dex */
class f$g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertDialog f775a;

    f$g(AlertDialog alertDialog) {
        this.f775a = alertDialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            f.t(this.f775a);
        } catch (Throwable th) {
            e1.l("Failed show dialog on service", th);
        }
    }
}
