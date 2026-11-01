package android.ext;

import android.widget.Toast;

/* JADX INFO: loaded from: classes.dex */
class p2$a implements Runnable {
    p2$a() {
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:6:0x0007 -> B:7:0x000c). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public void run() {
        Toast toast;
        try {
            Thread.sleep(3000L);
        } catch (Throwable th) {
            e1.l("toastThread", th);
        }
        while (!Thread.currentThread().isInterrupted()) {
            synchronized (p2.f1177b) {
                try {
                    toast = p2.f1176a;
                    Toast unused = p2.f1176a = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if ((Config.B & 8192) != 0) {
                n2.i(new p2$a$a(this));
            }
            p2.f(toast);
            Thread.sleep(1500L);
        }
    }
}
