package android.ext;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
class f0$v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f0 f940a;

    f0$v(f0 f0Var) {
        this.f940a = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        Handler handlerC = n2.c();
        handlerC.removeCallbacks(this);
        if (this.f940a.e0()) {
            handlerC.postDelayed(this, 1000L);
        }
    }
}
