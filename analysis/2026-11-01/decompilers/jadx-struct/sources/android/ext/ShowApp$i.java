package android.ext;

/* JADX INFO: loaded from: classes.dex */
class ShowApp$i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ShowApp f469a;

    ShowApp$i(ShowApp showApp) {
        this.f469a = showApp;
    }

    @Override // java.lang.Runnable
    public void run() {
        ShowApp showApp = this.f469a;
        if (showApp.b(showApp.i)) {
            this.f469a.i = null;
        }
    }
}
