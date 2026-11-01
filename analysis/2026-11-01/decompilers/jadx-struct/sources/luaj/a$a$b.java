package luaj;

import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;

/* JADX INFO: loaded from: classes.dex */
class a$a$b implements DialogInterface$OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a$a f1705a;

    a$a$b(a$a a_a) {
        this.f1705a = a_a;
    }

    @Override // android.content.DialogInterface$OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        synchronized (this.f1705a.f1702a) {
            try {
                this.f1705a.f1702a.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
