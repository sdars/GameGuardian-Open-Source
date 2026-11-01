package android.ext;

import android.app.Activity;
import android.app.AlertDialog;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class z$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f1383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f1384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f1385c;

    z$a(Activity activity, boolean z, int i) {
        this.f1383a = activity;
        this.f1384b = z;
        this.f1385c = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            synchronized (z.class) {
                try {
                    if (z.j(this.f1383a) && (!this.f1384b || z.s(this.f1385c, true))) {
                        AlertDialog alertDialogCreate = f.c(this.f1383a).setCustomTitle(Tools.g0(R$string.floating_window_fail)).setMessage(R$string.enable_draw_perm).setNegativeButton(b2.f(R$string.skip), new z$a$b(this)).setPositiveButton(b2.f(R$string.ok), new z$a$a(this)).create();
                        f.k(alertDialogCreate, new z$a$c(this));
                        if (z.r(this.f1383a, this.f1384b, this.f1385c, alertDialogCreate)) {
                            f.w(alertDialogCreate);
                            return;
                        }
                        return;
                    }
                    z.q(this.f1383a);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            e1.l("Failed show float dialog", th2);
            z.q(this.f1383a);
            if (this.f1384b && z.x()) {
                z.F();
            }
        }
    }
}
