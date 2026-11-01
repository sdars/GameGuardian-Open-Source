package android.ext;

import android.app.AlertDialog;
import android.app.AlertDialog$Builder;

/* JADX INFO: loaded from: classes.dex */
class q1$c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertDialog$Builder f1204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ q1 f1205b;

    q1$c(q1 q1Var, AlertDialog$Builder alertDialog$Builder) {
        this.f1205b = q1Var;
        this.f1204a = alertDialog$Builder;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            AlertDialog alertDialogCreate = this.f1204a.create();
            f.w(alertDialogCreate);
            Tools.u1(alertDialogCreate);
        } catch (Throwable th) {
            e1.l("Failed show miui dialog", th);
        }
    }
}
