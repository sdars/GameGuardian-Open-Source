package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class g0 extends Thread {
    public g0(Runnable runnable, String str) {
        super(runnable, str);
        setDaemon(true);
        n0.g(this);
    }

    public g0(String str) {
        super(str);
        setDaemon(true);
        n0.g(this);
    }
}
