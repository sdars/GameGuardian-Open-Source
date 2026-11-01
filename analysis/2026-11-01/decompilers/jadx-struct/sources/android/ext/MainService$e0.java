package android.ext;

/* JADX INFO: loaded from: classes.dex */
class MainService$e0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService f239a;

    MainService$e0(MainService mainService) {
        this.f239a = mainService;
    }

    @Override // java.lang.Runnable
    public void run() {
        e1.d("doCheckLibs: " + this.f239a.v());
    }
}
