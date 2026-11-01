package android.ext;

/* JADX INFO: loaded from: classes.dex */
class z2$b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1443a;

    z2$b(String str) {
        this.f1443a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this) {
            try {
                z2.b(this.f1443a.getBytes());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
