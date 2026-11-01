package android.ext;

/* JADX INFO: loaded from: classes.dex */
class FloatPanel$b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ FloatPanel f145a;

    FloatPanel$b(FloatPanel floatPanel) {
        this.f145a = floatPanel;
    }

    @Override // java.lang.Runnable
    public void run() {
        e1.d(this.f145a.d("hide"));
        FloatPanel floatPanel = this.f145a;
        if (floatPanel.l) {
            floatPanel.l = false;
            floatPanel.i();
        }
    }
}
