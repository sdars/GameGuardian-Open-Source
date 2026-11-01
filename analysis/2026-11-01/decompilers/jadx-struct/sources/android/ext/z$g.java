package android.ext;

import android.app.AlertDialog;
import android.app.AlertDialog$Builder;

/* JADX INFO: loaded from: classes.dex */
class z$g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertDialog$Builder f1397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f1398b;

    z$g(z zVar, AlertDialog$Builder alertDialog$Builder) {
        this.f1398b = zVar;
        this.f1397a = alertDialog$Builder;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            AlertDialog alertDialogCreate = this.f1397a.create();
            f.w(alertDialogCreate);
            Tools.u1(alertDialogCreate);
        } catch (Throwable th) {
            e1.l("Failed show float dialog", th);
        }
    }
}
