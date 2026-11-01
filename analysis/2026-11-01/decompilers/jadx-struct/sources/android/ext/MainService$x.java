package android.ext;

/* JADX INFO: loaded from: classes.dex */
class MainService$x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService f305a;

    MainService$x(MainService mainService) {
        this.f305a = mainService;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f305a.n == null) {
            this.f305a.c0();
        }
    }
}
