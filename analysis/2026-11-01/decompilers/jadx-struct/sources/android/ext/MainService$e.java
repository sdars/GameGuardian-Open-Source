package android.ext;

/* JADX INFO: loaded from: classes.dex */
class MainService$e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService f238a;

    MainService$e(MainService mainService) {
        this.f238a = mainService;
    }

    @Override // java.lang.Runnable
    public void run() {
        MainService mainService = this.f238a;
        mainService.f217g = null;
        mainService.h0.d();
    }
}
