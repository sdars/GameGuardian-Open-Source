package android.ext;

import android.widget.Toast;

/* JADX INFO: loaded from: classes.dex */
class p2$b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Toast f1184a;

    p2$b(Toast toast) {
        this.f1184a = toast;
    }

    @Override // java.lang.Runnable
    public void run() {
        p2.f(this.f1184a);
    }
}
