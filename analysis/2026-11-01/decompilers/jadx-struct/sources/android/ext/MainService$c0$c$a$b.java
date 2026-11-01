package android.ext;

/* JADX INFO: loaded from: classes.dex */
class MainService$c0$c$a$b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MainService$c0$c$a f234b;

    MainService$c0$c$a$b(MainService$c0$c$a mainService$c0$c$a, String str) {
        this.f234b = mainService$c0$c$a;
        this.f233a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            e2.n(this.f233a + " ''", 5);
        } catch (Throwable th) {
            e1.l("Failed unstub app: " + this.f234b.f230a.f229a.f224a, th);
        }
    }
}
