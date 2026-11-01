package android.ext;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Toast f1176a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile WeakReference f1178c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile WeakReference f1180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Context f1181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Context f1182g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f1177b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f1179d = new Object();

    static {
        new g0(new p2$a(), "toastThread").start();
        f1181f = null;
        f1182g = null;
    }

    private static void f(Toast toast) {
        if (toast != null) {
            n2.i(new p2$c(toast));
        }
    }

    private static Toast g(Toast toast) {
        Object objA;
        try {
            Field declaredField = Toast.class.getDeclaredField("mTN");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(toast);
            for (Field field : obj.getClass().getDeclaredFields()) {
                String name = field.getName();
                if (name.equals("mShow") || name.equals("mHide")) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 instanceof Runnable) {
                        objA = Tools$z.a((Runnable) obj2);
                        field.set(obj, objA);
                    }
                } else if (name.equals("mHandler")) {
                    field.setAccessible(true);
                    Object obj3 = field.get(obj);
                    if (obj3 instanceof Handler) {
                        objA = Tools$x.a((Handler) obj3);
                        field.set(obj, objA);
                    }
                }
            }
        } catch (Throwable th) {
            e1.a(th);
        }
        return toast;
    }

    public static Context h() {
        Context contextF0 = Tools.f0();
        if (!Config.vSpaceReal || Config.D) {
            return contextF0;
        }
        Context context = f1181f;
        if (context == null || context != contextF0) {
            f1182g = Config.a(contextF0);
            f1181f = contextF0;
        }
        return f1182g;
    }

    public static void i() {
    }

    public static void j(Toast toast) {
        Toast toast2;
        Runnable runnable;
        Toast toast3;
        Object obj = f1179d;
        synchronized (obj) {
            try {
                WeakReference weakReference = f1178c;
                toast2 = weakReference == null ? null : (Toast) weakReference.get();
                f1178c = null;
                WeakReference weakReference2 = f1180e;
                runnable = weakReference2 == null ? null : (Runnable) weakReference2.get();
                f1180e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        g(toast).show();
        p2$b p2_b = new p2$b(toast);
        synchronized (obj) {
            try {
                f1178c = new WeakReference(toast);
                f1180e = new WeakReference(p2_b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (f1177b) {
            try {
                toast3 = f1176a;
                f1176a = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        f(toast3);
        f(toast2);
        Handler handlerD = n2.d();
        if (runnable != null) {
            handlerD.removeCallbacks(runnable);
        }
        handlerD.postDelayed(p2_b, 3000L);
    }
}
