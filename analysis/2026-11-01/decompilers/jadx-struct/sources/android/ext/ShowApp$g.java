package android.ext;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class ShowApp$g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ShowApp f467a;

    ShowApp$g(ShowApp showApp) {
        this.f467a = showApp;
    }

    @Override // java.lang.Runnable
    public void run() {
        View view = this.f467a.f459g;
        if (view == null) {
            return;
        }
        if (MainService.instance.f213c == null || MainService.instance.n == null) {
            this.f467a.f(view);
        }
    }
}
