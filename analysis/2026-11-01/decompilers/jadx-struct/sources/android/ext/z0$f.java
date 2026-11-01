package android.ext;

/* JADX INFO: loaded from: classes.dex */
class z0$f implements Runnable {
    z0$f() {
    }

    @Override // java.lang.Runnable
    public void run() {
        b1.R1("install-mode-unavailable");
        r rVar = r.n;
        if (rVar != null) {
            rVar.finish();
        }
        f1.n();
    }
}
