package android.ext;

/* JADX INFO: loaded from: classes.dex */
class FloatPanel$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ FloatPanel f144a;

    FloatPanel$a(FloatPanel floatPanel) {
        this.f144a = floatPanel;
    }

    @Override // java.lang.Runnable
    public void run() {
        e1.d(this.f144a.d("show"));
        FloatPanel floatPanel = this.f144a;
        if (floatPanel.m) {
            return;
        }
        floatPanel.j();
    }
}
