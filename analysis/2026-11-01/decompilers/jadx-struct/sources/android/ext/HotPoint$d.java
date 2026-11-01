package android.ext;

/* JADX INFO: loaded from: classes.dex */
class HotPoint$d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ HotPoint f169b;

    HotPoint$d(HotPoint hotPoint, int i) {
        this.f169b = hotPoint;
        this.f168a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = this.f168a;
        if (i == -1) {
            i = this.f169b.B.getVisibility() == 8 ? 0 : 8;
        }
        this.f169b.B.setVisibility(i);
        this.f169b.C.setVisibility(i);
        this.f169b.setSpeedPanelVisibility(true);
        this.f169b.o();
        if (i == 0) {
            HotPoint hotPoint = this.f169b;
            if (hotPoint.p >= 0) {
                hotPoint.v(true);
            }
        }
    }
}
