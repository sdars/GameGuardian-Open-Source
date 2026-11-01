package android.ext;

import android.app.AlertDialog;

/* JADX INFO: loaded from: classes.dex */
class Tools$d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertDialog f505a;

    Tools$d(AlertDialog alertDialog) {
        this.f505a = alertDialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Tools.T0(this.f505a.getWindow());
        } catch (Throwable th) {
            e1.l("hideSoftInputFromWindow", th);
        }
    }
}
