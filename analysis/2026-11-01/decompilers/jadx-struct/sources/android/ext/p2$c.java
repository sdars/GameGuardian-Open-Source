package android.ext;

import android.widget.Toast;

/* JADX INFO: loaded from: classes.dex */
class p2$c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Toast f1185a;

    p2$c(Toast toast) {
        this.f1185a = toast;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f1185a.cancel();
        } catch (Throwable th) {
            e1.s("Toast cancel", th);
        }
    }
}
