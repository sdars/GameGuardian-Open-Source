package android.ext;

/* JADX INFO: loaded from: classes.dex */
class MainService$p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService f278a;

    MainService$p(MainService mainService) {
        this.f278a = mainService;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f278a.E0();
    }
}
