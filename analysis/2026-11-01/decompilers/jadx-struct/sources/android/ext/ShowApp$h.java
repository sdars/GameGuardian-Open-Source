package android.ext;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class ShowApp$h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ShowApp f468a;

    ShowApp$h(ShowApp showApp) {
        this.f468a = showApp;
    }

    @Override // java.lang.Runnable
    public void run() {
        ShowApp showApp = this.f468a;
        if (showApp.b(showApp.i)) {
            this.f468a.i = null;
        }
        MainService mainService = MainService.instance;
        if (mainService == null) {
            return;
        }
        View view = mainService.f217g;
        ShowApp showApp2 = this.f468a;
        if (showApp2.l(view, showApp2.f454b)) {
            this.f468a.i = view;
        }
    }
}
