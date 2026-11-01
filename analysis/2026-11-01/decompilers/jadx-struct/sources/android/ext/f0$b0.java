package android.ext;

/* JADX INFO: loaded from: classes.dex */
class f0$b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte f813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ f0 f814b;

    f0$b0(f0 f0Var, byte b2) {
        this.f814b = f0Var;
        this.f813a = b2;
    }

    @Override // java.lang.Runnable
    public void run() {
        f0 f0Var = this.f814b;
        InOut inOut = f0Var.f793b;
        f0Var.L0(this.f813a, (byte) 1);
        this.f814b.u0(this.f813a, (byte) 45);
        inOut.n(false);
        MainService.instance.q0();
    }
}
