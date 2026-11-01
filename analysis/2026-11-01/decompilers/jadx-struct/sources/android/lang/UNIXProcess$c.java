package android.lang;

/* JADX INFO: loaded from: classes.dex */
class UNIXProcess$c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ UNIXProcess f1482a;

    UNIXProcess$c(UNIXProcess uNIXProcess) {
        this.f1482a = uNIXProcess;
    }

    @Override // java.lang.Runnable
    public void run() {
        UNIXProcess uNIXProcess = this.f1482a;
        this.f1482a.k(uNIXProcess.waitForProcessExit(uNIXProcess.pid));
    }
}
