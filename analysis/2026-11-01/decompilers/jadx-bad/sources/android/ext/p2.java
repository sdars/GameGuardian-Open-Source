package android.ext;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
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

    class a implements Runnable {

        /* JADX INFO: renamed from: android.ext.p2$a$a, reason: collision with other inner class name */
        class RunnableC0019a implements Runnable {
            RunnableC0019a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Toast toastMakeText = Toast.makeText(p2.h(), " ", 1);
                    View view = toastMakeText.getView();
                    view.setBackgroundColor(0);
                    toastMakeText.setView(view);
                    p2.g(toastMakeText).show();
                    synchronized (p2.f1177b) {
                        try {
                            Toast unused = p2.f1176a = toastMakeText;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    e1.s("Toast show", th2);
                }
            }
        }

        a() {
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
                    toast = p2.f1176a;
                    Toast unused = p2.f1176a = null;
                }
                if ((Config.B & 8192) != 0) {
                    n2.i(new RunnableC0019a());
                }
                p2.f(toast);
                Thread.sleep(1500L);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Toast f1184a;

        b(Toast toast) {
            this.f1184a = toast;
        }

        @Override // java.lang.Runnable
        public void run() {
            p2.f(this.f1184a);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Toast f1185a;

        c(Toast toast) {
            this.f1185a = toast;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1185a.cancel();
            } catch (Throwable th) {
                e1.s("Toast cancel", th);
            }
        }
    }

    static {
        new g0(new a(), "toastThread").start();
        f1181f = null;
        f1182g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Toast toast) {
        if (toast != null) {
            n2.i(new c(toast));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Toast g(Toast toast) {
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
                        objA = Tools.z.a((Runnable) obj2);
                        field.set(obj, objA);
                    }
                } else if (name.equals("mHandler")) {
                    field.setAccessible(true);
                    Object obj3 = field.get(obj);
                    if (obj3 instanceof Handler) {
                        objA = Tools.x.a((Handler) obj3);
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
            WeakReference weakReference = f1178c;
            toast2 = weakReference == null ? null : (Toast) weakReference.get();
            f1178c = null;
            WeakReference weakReference2 = f1180e;
            runnable = weakReference2 == null ? null : (Runnable) weakReference2.get();
            f1180e = null;
        }
        g(toast).show();
        b bVar = new b(toast);
        synchronized (obj) {
            f1178c = new WeakReference(toast);
            f1180e = new WeakReference(bVar);
        }
        synchronized (f1177b) {
            toast3 = f1176a;
            f1176a = null;
        }
        f(toast3);
        f(toast2);
        Handler handlerD = n2.d();
        if (runnable != null) {
            handlerD.removeCallbacks(runnable);
        }
        handlerD.postDelayed(bVar, 3000L);
    }
}
