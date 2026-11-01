package android.ext;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
class MainService$o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService f276a;

    MainService$o(MainService mainService) {
        this.f276a = mainService;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            MainService mainService = this.f276a;
            if (mainService.f0 == mainService.a0) {
                mainService.t0.i();
            }
        } catch (Throwable th) {
            e1.l("Failed update saved list", th);
        }
        try {
            int i = Config.n;
            if (i <= 0) {
                i = 1000;
            }
            Handler handlerD = n2.d();
            handlerD.removeCallbacks(this);
            handlerD.postDelayed(this, i);
        } catch (Throwable th2) {
            e1.s("Failed post timer", th2);
        }
    }
}
