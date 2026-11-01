package android.ext;

/* JADX INFO: loaded from: classes.dex */
class f1$n implements Runnable {
    f1$n() {
    }

    @Override // java.lang.Runnable
    public void run() {
        e1$e.a("AndroidService", "wait 4");
        n2.d().removeCallbacks(this);
        f1.p();
    }
}
