package android.ext;

/* JADX INFO: loaded from: classes.dex */
class r$m$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f1231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f1232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ r$m f1233c;

    r$m$a(r$m r_m, r rVar, int i) {
        this.f1233c = r_m;
        this.f1231a = rVar;
        this.f1232b = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f1231a.G()) {
            this.f1231a.E(this.f1233c.f1229a, this.f1232b);
            return;
        }
        e1.d(this.f1231a + ": drop root probe verdict " + this.f1232b);
    }
}
