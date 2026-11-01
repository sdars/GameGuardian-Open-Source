package android.ext;

/* JADX INFO: loaded from: classes.dex */
class MainService$d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService f237a;

    MainService$d0(MainService mainService) {
        this.f237a = mainService;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f237a.i.K0((byte) 2);
        } catch (Throwable unused) {
        }
    }
}
