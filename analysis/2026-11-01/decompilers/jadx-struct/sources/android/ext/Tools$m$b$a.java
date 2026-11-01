package android.ext;

/* JADX INFO: loaded from: classes.dex */
class Tools$m$b$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Tools$m$b f525a;

    Tools$m$b$a(Tools$m$b tools$m$b) {
        this.f525a = tools$m$b;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f525a.f523a.fullScroll(130);
    }
}
