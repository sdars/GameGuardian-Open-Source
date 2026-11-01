package android.ext;

/* JADX INFO: loaded from: classes.dex */
class Script$editAll$1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Script$editAll f412b;

    Script$editAll$1(Script$editAll script$editAll, Object obj) {
        this.f412b = script$editAll;
        this.f411a = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        MainService.instance.f0(this.f412b.e0.t3());
        synchronized (this.f411a) {
            try {
                this.f411a.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
