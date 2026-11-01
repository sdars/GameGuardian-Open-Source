package android.ext;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
class b2$a implements Runnable {
    b2$a() {
    }

    @Override // java.lang.Runnable
    public void run() {
        long j = b2.f658d;
        if (j != 0 && System.currentTimeMillis() - j > 5000) {
            b2.a();
        }
        Handler handlerD = n2.d();
        try {
            handlerD.removeCallbacks(this);
        } catch (NullPointerException e2) {
            e1.a(e2);
        }
        handlerD.postDelayed(this, 1000L);
    }
}
