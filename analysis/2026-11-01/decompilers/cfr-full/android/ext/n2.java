/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.ext.e1;
import android.ext.n0;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

public abstract class n2 {
    private static final Looper[] a;
    private static final Handler[] b;

    static {
        Looper[] looperArray = new Looper[4];
        looperArray[0] = Looper.getMainLooper();
        Handler handler = new Handler(looperArray[0]);
        a a4 = new a("Main");
        ((Thread)((Object)a4)).start();
        looperArray[1] = a4.getLooper();
        a4 = new Handler(looperArray[1]);
        a a5 = new a("Log");
        ((Thread)((Object)a5)).start();
        looperArray[2] = a5.getLooper();
        a5 = new Handler(looperArray[2]);
        a a6 = new a("Write");
        ((Thread)((Object)a6)).start();
        looperArray[3] = a6.getLooper();
        a6 = new Handler(looperArray[3]);
        a = looperArray;
        b = new Handler[]{handler, a4, a5, a6};
    }

    public static void a() {
        Looper looper;
        for (int i3 = 0; i3 < ((Looper[])(looper = a)).length; ++i3) {
            if (i3 == 0) continue;
            looper = looper[i3];
            try {
                looper.quitSafely();
                continue;
            }
            catch (NoSuchMethodError noSuchMethodError) {
                looper.quit();
            }
        }
    }

    private static Handler b(int n3) {
        return b[n3];
    }

    public static Handler c() {
        return n2.b(1);
    }

    public static Handler d() {
        return n2.b(0);
    }

    public static boolean e() {
        boolean bl = Looper.myLooper() == Looper.getMainLooper();
        return bl;
    }

    private static void f(int n3, Runnable object, boolean bl) {
        Looper[] looperArray = a;
        if (looperArray == null) {
            e1.e.d("AndroidService", "Bad implementation", new NullPointerException("loopers"));
            return;
        }
        if (looperArray[n3] == null) {
            object = new StringBuilder();
            ((StringBuilder)object).append("loopers[");
            ((StringBuilder)object).append(n3);
            ((StringBuilder)object).append(']');
            e1.e.d("AndroidService", "Bad implementation", new NullPointerException(((StringBuilder)object).toString()));
            return;
        }
        if (Looper.myLooper() == looperArray[n3] && !bl) {
            object.run();
        } else {
            b[n3].post((Runnable)object);
        }
    }

    public static void g(Runnable runnable) {
        try {
            n2.f(2, runnable, false);
        }
        catch (Throwable throwable) {
            e1.e.d("AndroidService", "Bad implementation", throwable);
        }
    }

    public static void h(Runnable runnable) {
        n2.f(1, runnable, false);
    }

    public static void i(Runnable runnable) {
        n2.f(0, runnable, false);
    }

    public static void j(Runnable runnable) {
        n2.f(3, runnable, false);
    }

    private static class a
    extends HandlerThread {
        public a(String string2) {
            super(string2);
            n0.g((Thread)((Object)this));
        }
    }
}

