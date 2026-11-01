package android.ext;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
class b1$b implements Runnable {
    b1$b() {
    }

    @Override // java.lang.Runnable
    public void run() {
        b1.H1();
        Handler handlerD = n2.d();
        handlerD.removeCallbacks(this);
        handlerD.postDelayed(this, 500L);
    }
}
