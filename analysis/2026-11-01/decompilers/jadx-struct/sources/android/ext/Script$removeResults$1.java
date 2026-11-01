package android.ext;

/* JADX INFO: loaded from: classes.dex */
class Script$removeResults$1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Script$removeResults f437b;

    Script$removeResults$1(Script$removeResults script$removeResults, Object obj) {
        this.f437b = script$removeResults;
        this.f436a = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        MainService.instance.D0(false);
        synchronized (this.f436a) {
            try {
                this.f436a.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
