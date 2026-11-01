package android.ext;

/* JADX INFO: loaded from: classes.dex */
public abstract class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile android.widget.Toast f1176a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile java.lang.ref.WeakReference f1178c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile java.lang.ref.WeakReference f1180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static android.content.Context f1181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static android.content.Context f1182g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.Object f1177b = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.Object f1179d = new java.lang.Object();

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: android.ext.p2$a$a, reason: collision with other inner class name */
        class RunnableC0019a implements java.lang.Runnable {
            RunnableC0019a() {
            }

            /* JADX WARN: Bottom block not found for handler: all -> 0x002a */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
            
                return;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    r3 = this;
                    android.content.Context r0 = android.ext.p2.h()     // Catch: java.lang.Throwable -> L2a
                    java.lang.String r1 = " "
                    r2 = 1
                    android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
                    android.view.View r1 = r0.getView()     // Catch: java.lang.Throwable -> L2a
                    r2 = 0
                    r1.setBackgroundColor(r2)     // Catch: java.lang.Throwable -> L2a
                    r0.setView(r1)     // Catch: java.lang.Throwable -> L2a
                    android.widget.Toast r1 = android.ext.p2.d(r0)     // Catch: java.lang.Throwable -> L2a
                    r1.show()     // Catch: java.lang.Throwable -> L2a
                    java.lang.Object r1 = android.ext.p2.a()     // Catch: java.lang.Throwable -> L2a
                    monitor-enter(r1)     // Catch: java.lang.Throwable -> L2a
                    android.ext.p2.c(r0)     // Catch: java.lang.Throwable -> L27
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
                    goto L30
                L27:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
                    throw r0     // Catch: java.lang.Throwable -> L2a
                L2a:
                    r0 = move-exception
                    java.lang.String r1 = "Toast show"
                    android.ext.e1.s(r1, r0)
                L30:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.ext.p2.a.RunnableC0019a.run():void");
            }
        }

        a() {
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:6:0x0007 -> B:7:0x000c). Please report as a decompilation issue!!! */
        @Override // java.lang.Runnable
        public void run() {
            android.widget.Toast toast;
            try {
                java.lang.Thread.sleep(3000L);
            } catch (java.lang.Throwable th) {
                android.ext.e1.l("toastThread", th);
            }
            while (!java.lang.Thread.currentThread().isInterrupted()) {
                synchronized (android.ext.p2.f1177b) {
                    toast = android.ext.p2.f1176a;
                    android.widget.Toast unused = android.ext.p2.f1176a = null;
                }
                if ((android.ext.Config.B & 8192) != 0) {
                    android.ext.n2.i(new android.ext.p2.a.RunnableC0019a());
                }
                android.ext.p2.f(toast);
                java.lang.Thread.sleep(1500L);
            }
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.widget.Toast f1184a;

        b(android.widget.Toast toast) {
            this.f1184a = toast;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.p2.f(this.f1184a);
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.widget.Toast f1185a;

        c(android.widget.Toast toast) {
            this.f1185a = toast;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1185a.cancel();
            } catch (java.lang.Throwable th) {
                android.ext.e1.s("Toast cancel", th);
            }
        }
    }

    static {
        new android.ext.g0(new android.ext.p2.a(), "toastThread").start();
        f1181f = null;
        f1182g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(android.widget.Toast toast) {
        if (toast != null) {
            android.ext.n2.i(new android.ext.p2.c(toast));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.widget.Toast g(android.widget.Toast toast) {
        java.lang.Object objA;
        try {
            java.lang.reflect.Field declaredField = android.widget.Toast.class.getDeclaredField("mTN");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(toast);
            for (java.lang.reflect.Field field : obj.getClass().getDeclaredFields()) {
                java.lang.String name = field.getName();
                if (name.equals("mShow") || name.equals("mHide")) {
                    field.setAccessible(true);
                    java.lang.Object obj2 = field.get(obj);
                    if (obj2 instanceof java.lang.Runnable) {
                        objA = android.ext.Tools.z.a((java.lang.Runnable) obj2);
                        field.set(obj, objA);
                    }
                } else if (name.equals("mHandler")) {
                    field.setAccessible(true);
                    java.lang.Object obj3 = field.get(obj);
                    if (obj3 instanceof android.os.Handler) {
                        objA = android.ext.Tools.x.a((android.os.Handler) obj3);
                        field.set(obj, objA);
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
        }
        return toast;
    }

    public static android.content.Context h() {
        android.content.Context contextF0 = android.ext.Tools.f0();
        if (!android.ext.Config.vSpaceReal || android.ext.Config.D) {
            return contextF0;
        }
        android.content.Context context = f1181f;
        if (context == null || context != contextF0) {
            f1182g = android.ext.Config.a(contextF0);
            f1181f = contextF0;
        }
        return f1182g;
    }

    public static void i() {
    }

    public static void j(android.widget.Toast toast) {
        android.widget.Toast toast2;
        java.lang.Runnable runnable;
        android.widget.Toast toast3;
        java.lang.Object obj = f1179d;
        synchronized (obj) {
            java.lang.ref.WeakReference weakReference = f1178c;
            toast2 = weakReference == null ? null : (android.widget.Toast) weakReference.get();
            f1178c = null;
            java.lang.ref.WeakReference weakReference2 = f1180e;
            runnable = weakReference2 == null ? null : (java.lang.Runnable) weakReference2.get();
            f1180e = null;
        }
        g(toast).show();
        android.ext.p2.b bVar = new android.ext.p2.b(toast);
        synchronized (obj) {
            f1178c = new java.lang.ref.WeakReference(toast);
            f1180e = new java.lang.ref.WeakReference(bVar);
        }
        synchronized (f1177b) {
            toast3 = f1176a;
            f1176a = null;
        }
        f(toast3);
        f(toast2);
        android.os.Handler handlerD = android.ext.n2.d();
        if (runnable != null) {
            handlerD.removeCallbacks(runnable);
        }
        handlerD.postDelayed(bVar, 3000L);
    }
}
