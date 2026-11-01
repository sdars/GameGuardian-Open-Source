package android.ext;

/* JADX INFO: loaded from: classes.dex */
class Script$removeListItems$1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long[] f432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Script$removeListItems f435d;

    Script$removeListItems$1(Script$removeListItems script$removeListItems, long[] jArr, int i, Object obj) {
        this.f435d = script$removeListItems;
        this.f432a = jArr;
        this.f433b = i;
        this.f434c = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            MainService.instance.t0.m(this.f432a, this.f433b);
        } catch (Throwable th) {
            e1.l("Failed remove list items", th);
        }
        synchronized (this.f434c) {
            try {
                this.f434c.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
