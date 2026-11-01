package android.ext;

/* JADX INFO: loaded from: classes.dex */
class b1$i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f625a;

    b1$i(Runnable runnable) {
        this.f625a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        b1.S1();
        this.f625a.run();
        b1.R1("normal-service-ready");
        b1.f("normal-service-ready");
    }
}
