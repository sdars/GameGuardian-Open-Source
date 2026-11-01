package android.ext;

/* JADX INFO: loaded from: classes.dex */
class t$b implements Runnable {
    t$b() {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (MainService.instance != null) {
                MainService.instance.b0();
            }
        } catch (Throwable th) {
            e1.s("MainService onDestroy fail", th);
        }
    }
}
