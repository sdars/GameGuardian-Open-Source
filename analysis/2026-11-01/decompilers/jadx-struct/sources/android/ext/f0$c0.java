package android.ext;

/* JADX INFO: loaded from: classes.dex */
class f0$c0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f0 f820a;

    f0$c0(f0 f0Var) {
        this.f820a = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        MainService.instance.W(MainService.instance.Y);
    }
}
