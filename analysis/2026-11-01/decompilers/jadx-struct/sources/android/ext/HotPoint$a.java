package android.ext;

/* JADX INFO: loaded from: classes.dex */
class HotPoint$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ HotPoint f158a;

    HotPoint$a(HotPoint hotPoint) {
        this.f158a = hotPoint;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f158a.q();
        Tools.y1(this.f158a.s, 0.0f);
    }
}
