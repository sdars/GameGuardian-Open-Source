package android.ext;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Looper[] f1137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Handler[] f1138b;

    static {
        n2$a n2_a = new n2$a("Main");
        n2_a.start();
        n2$a n2_a2 = new n2$a("Log");
        n2_a2.start();
        n2$a n2_a3 = new n2$a("Write");
        n2_a3.start();
        Looper[] looperArr = {Looper.getMainLooper(), n2_a.getLooper(), n2_a2.getLooper(), n2_a3.getLooper()};
        Handler[] handlerArr = {new Handler(looperArr[0]), new Handler(looperArr[1]), new Handler(looperArr[2]), new Handler(looperArr[3])};
        f1137a = looperArr;
        f1138b = handlerArr;
    }

    public static void a() {
        int i = 0;
        while (true) {
            Looper[] looperArr = f1137a;
            if (i >= looperArr.length) {
                return;
            }
            if (i != 0) {
                Looper looper = looperArr[i];
                try {
                    looper.quitSafely();
                } catch (NoSuchMethodError unused) {
                    looper.quit();
                }
            }
            i++;
        }
    }

    private static Handler b(int i) {
        return f1138b[i];
    }

    public static Handler c() {
        return b(1);
    }

    public static Handler d() {
        return b(0);
    }

    public static boolean e() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static void f(int i, Runnable runnable, boolean z) {
        Looper[] looperArr = f1137a;
        if (looperArr == null) {
            e1$e.d("AndroidService", "Bad implementation", new NullPointerException("loopers"));
            return;
        }
        if (looperArr[i] == null) {
            e1$e.d("AndroidService", "Bad implementation", new NullPointerException("loopers[" + i + ']'));
            return;
        }
        if (Looper.myLooper() != looperArr[i] || z) {
            f1138b[i].post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void g(Runnable runnable) {
        try {
            f(2, runnable, false);
        } catch (Throwable th) {
            e1$e.d("AndroidService", "Bad implementation", th);
        }
    }

    public static void h(Runnable runnable) {
        f(1, runnable, false);
    }

    public static void i(Runnable runnable) {
        f(0, runnable, false);
    }

    public static void j(Runnable runnable) {
        f(3, runnable, false);
    }
}
