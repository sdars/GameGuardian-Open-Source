package android.ext;

/* JADX INFO: loaded from: classes.dex */
public class Tools$z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Runnable f556a;

    public Tools$z(Runnable runnable) {
        this.f556a = runnable;
    }

    public static Runnable a(Runnable runnable) {
        return !(runnable instanceof Tools$z) ? new Tools$z(runnable) : runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f556a.run();
        } catch (Throwable th) {
            e1.a(th);
        }
    }
}
