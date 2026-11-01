package android.ext;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class e1$b implements Runnable {
    e1$b() {
    }

    @Override // java.lang.Runnable
    public void run() {
        e1.f735a = true;
        if (e1.f736b == null) {
            return;
        }
        try {
            e1.f736b.flush();
            e1.f736b.close();
            e1.f736b = null;
        } catch (IOException e2) {
            e1$e.b("AndroidService", "Log close: I/O", e2);
        }
    }
}
