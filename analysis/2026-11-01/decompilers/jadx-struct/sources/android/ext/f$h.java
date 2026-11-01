package android.ext;

import android.app.AlertDialog$Builder;

/* JADX INFO: loaded from: classes.dex */
class f$h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertDialog$Builder f776a;

    f$h(AlertDialog$Builder alertDialog$Builder) {
        this.f776a = alertDialog$Builder;
    }

    @Override // java.lang.Runnable
    public void run() {
        f.q(this.f776a, null);
    }
}
