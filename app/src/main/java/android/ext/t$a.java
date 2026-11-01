package android.ext;

/* JADX INFO: loaded from: classes.dex */
class t$a implements java.lang.Runnable {
    t$a() {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (android.ext.MainService.instance != null) {
                android.ext.MainService.instance.Z();
            }
        } catch (java.lang.Throwable th) {
            android.ext.e1.s("MainService onCreate fail", th);
            throw th;
        }
    }
}
