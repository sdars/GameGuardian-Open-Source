package android.ext;

/* JADX INFO: loaded from: classes.dex */
class HotPoint$f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ HotPoint f173b;

    HotPoint$f(HotPoint hotPoint, String str) {
        this.f173b = hotPoint;
        this.f172a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f173b.y.setText(this.f172a);
        this.f173b.o();
    }
}
