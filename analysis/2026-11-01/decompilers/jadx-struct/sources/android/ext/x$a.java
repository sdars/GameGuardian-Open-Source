package android.ext;

import android.app.AlertDialog;

/* JADX INFO: loaded from: classes.dex */
class x$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f1297a;

    x$a(x xVar) {
        this.f1297a = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertDialog alertDialog = this.f1297a.f1290a;
        if (alertDialog != null) {
            f.m(alertDialog);
        }
    }
}
