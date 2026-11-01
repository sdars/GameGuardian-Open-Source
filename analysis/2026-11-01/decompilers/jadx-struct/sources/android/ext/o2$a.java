package android.ext;

/* JADX INFO: loaded from: classes.dex */
class o2$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f1160a;

    o2$a(long j) {
        this.f1160a = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        MainService.instance.i.e(this.f1160a);
    }
}
