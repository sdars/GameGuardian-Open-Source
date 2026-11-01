package android.ext;

/* JADX INFO: loaded from: classes.dex */
class s1$d$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ s1$d f1245a;

    s1$d$a(s1$d s1_d) {
        this.f1245a = s1_d;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (s1.u() && s1.O() == 1 && r.n != null) {
            s1.N();
        }
    }
}
