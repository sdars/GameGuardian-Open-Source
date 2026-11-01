package android.ext;

/* JADX INFO: loaded from: classes.dex */
class ShowApp$d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ShowApp f464a;

    ShowApp$d(ShowApp showApp) {
        this.f464a = showApp;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f464a.e();
    }
}
