package android.ext;

/* JADX INFO: loaded from: classes.dex */
class t$a implements Runnable {
    t$a() {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (MainService.instance != null) {
                MainService.instance.Z();
            }
        } catch (Throwable th) {
            e1.s("MainService onCreate fail", th);
            throw th;
        }
    }
}
