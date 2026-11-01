package android.ext;

/* JADX INFO: loaded from: classes.dex */
class Script$setValues$1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Script$setValues f441b;

    Script$setValues$1(Script$setValues script$setValues, Object obj) {
        this.f441b = script$setValues;
        this.f440a = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        MainService.instance.f0(this.f441b.e0.t3());
        synchronized (this.f440a) {
            try {
                this.f440a.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
