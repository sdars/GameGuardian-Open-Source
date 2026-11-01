package android.ext;

/* JADX INFO: loaded from: classes.dex */
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
