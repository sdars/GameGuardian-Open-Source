package android.lang;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
class UNIXProcess$h implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadGroup f1485a = a();

    private UNIXProcess$h() {
    }

    /* synthetic */ UNIXProcess$h(UNIXProcess$a uNIXProcess$a) {
        this();
    }

    private static ThreadGroup a() {
        return (ThreadGroup) UNIXProcess.e(new UNIXProcess$h$a());
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(f1485a, runnable, "process reaper", 32768L);
        thread.setDaemon(true);
        thread.setPriority(10);
        return thread;
    }
}
