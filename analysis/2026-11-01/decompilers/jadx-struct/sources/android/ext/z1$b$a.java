package android.ext;

/* JADX INFO: loaded from: classes.dex */
class z1$b$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f1423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ z1$b f1424b;

    z1$b$a(z1$b z1_b, int i) {
        this.f1424b = z1_b;
        this.f1423a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        z1$b z1_b = this.f1424b;
        z1.q(z1_b.f1422d, z1_b.f1419a, this.f1423a, z1_b.f1421c);
    }
}
