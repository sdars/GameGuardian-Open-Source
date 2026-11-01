package android.ext;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class ShowApp$f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ShowApp f466a;

    ShowApp$f(ShowApp showApp) {
        this.f466a = showApp;
    }

    @Override // java.lang.Runnable
    public void run() {
        View view;
        n2.d().removeCallbacks(this.f466a.j);
        ShowApp showApp = this.f466a;
        showApp.f(showApp.f459g);
        MainService mainService = MainService.instance;
        if (mainService == null || (view = mainService.f213c) == null) {
            return;
        }
        View view2 = mainService.f214d;
        if (view2 != null && MainService.instance.n != null) {
            ShowApp showApp2 = this.f466a;
            if (showApp2.l(view2, showApp2.f454b)) {
                this.f466a.h = view2;
            }
        }
        ShowApp showApp3 = this.f466a;
        if (showApp3.l(view, showApp3.f454b)) {
            this.f466a.f459g = view;
        }
    }
}
