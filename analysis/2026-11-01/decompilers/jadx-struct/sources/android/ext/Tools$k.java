package android.ext;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
class Tools$k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ DialogInterface f512a;

    Tools$k(DialogInterface dialogInterface) {
        this.f512a = dialogInterface;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f512a.dismiss();
        } catch (Throwable th) {
            e1.a(th);
        }
    }
}
