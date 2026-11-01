package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile android.widget.Toast f1176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.Object f1177b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile java.lang.ref.WeakReference f1178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.Object f1179d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile java.lang.ref.WeakReference f1180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static android.content.Context f1181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static android.content.Context f1182g;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: android.ext.p2$a$a, reason: collision with other inner class name */
        class RunnableC0019a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.p2.a f1183a;

            RunnableC0019a(android.ext.p2.a r1) {
                    r0 = this;
                    r0.f1183a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
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
            }
        }

        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                r0 = 3000(0xbb8, double:1.482E-320)
                java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> L6
                goto Lc
            L6:
                r0 = move-exception
                java.lang.String r1 = "toastThread"
                android.ext.e1.l(r1, r0)
            Lc:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                boolean r0 = r0.isInterrupted()
                if (r0 != 0) goto L3e
                java.lang.Object r0 = android.ext.p2.a()     // Catch: java.lang.Throwable -> L6
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L6
                android.widget.Toast r1 = android.ext.p2.b()     // Catch: java.lang.Throwable -> L3b
                r2 = 0
                android.ext.p2.c(r2)     // Catch: java.lang.Throwable -> L3b
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
                int r0 = android.ext.Config.B     // Catch: java.lang.Throwable -> L6
                r0 = r0 & 8192(0x2000, float:1.148E-41)
                if (r0 == 0) goto L32
                android.ext.p2$a$a r0 = new android.ext.p2$a$a     // Catch: java.lang.Throwable -> L6
                r0.<init>(r3)     // Catch: java.lang.Throwable -> L6
                android.ext.n2.i(r0)     // Catch: java.lang.Throwable -> L6
            L32:
                android.ext.p2.e(r1)     // Catch: java.lang.Throwable -> L6
                r0 = 1500(0x5dc, double:7.41E-321)
                java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> L6
                goto Lc
            L3b:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
                throw r1     // Catch: java.lang.Throwable -> L6
            L3e:
                return
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.widget.Toast f1184a;

        b(android.widget.Toast r1) {
                r0 = this;
                r0.f1184a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.widget.Toast r0 = r1.f1184a
                android.ext.p2.e(r0)
                return
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.widget.Toast f1185a;

        c(android.widget.Toast r1) {
                r0 = this;
                r0.f1185a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.widget.Toast r0 = r2.f1185a     // Catch: java.lang.Throwable -> L6
                r0.cancel()     // Catch: java.lang.Throwable -> L6
                goto Lc
            L6:
                r0 = move-exception
                java.lang.String r1 = "Toast cancel"
                android.ext.e1.s(r1, r0)
            Lc:
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            android.ext.p2.f1177b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            android.ext.p2.f1179d = r0
            android.ext.g0 r0 = new android.ext.g0
            android.ext.p2$a r1 = new android.ext.p2$a
            r1.<init>()
            java.lang.String r2 = "toastThread"
            r0.<init>(r1, r2)
            r0.start()
            r0 = 0
            android.ext.p2.f1181f = r0
            android.ext.p2.f1182g = r0
            return
    }

    static /* synthetic */ java.lang.Object a() {
            java.lang.Object r0 = android.ext.p2.f1177b
            return r0
    }

    static /* synthetic */ android.widget.Toast b() {
            android.widget.Toast r0 = android.ext.p2.f1176a
            return r0
    }

    static /* synthetic */ android.widget.Toast c(android.widget.Toast r0) {
            android.ext.p2.f1176a = r0
            return r0
    }

    static /* synthetic */ android.widget.Toast d(android.widget.Toast r0) {
            android.widget.Toast r0 = g(r0)
            return r0
    }

    static /* synthetic */ void e(android.widget.Toast r0) {
            f(r0)
            return
    }

    private static void f(android.widget.Toast r1) {
            if (r1 == 0) goto La
            android.ext.p2$c r0 = new android.ext.p2$c
            r0.<init>(r1)
            android.ext.n2.i(r0)
        La:
            return
    }

    private static android.widget.Toast g(android.widget.Toast r8) {
            java.lang.Class<android.widget.Toast> r0 = android.widget.Toast.class
            java.lang.String r1 = "mTN"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L50
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L50
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.Throwable -> L50
            java.lang.reflect.Field[] r2 = r2.getDeclaredFields()     // Catch: java.lang.Throwable -> L50
            int r3 = r2.length     // Catch: java.lang.Throwable -> L50
            r4 = 0
        L1a:
            if (r4 >= r3) goto L6a
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = "mShow"
            boolean r7 = r6.equals(r7)     // Catch: java.lang.Throwable -> L50
            if (r7 != 0) goto L52
            java.lang.String r7 = "mHide"
            boolean r7 = r6.equals(r7)     // Catch: java.lang.Throwable -> L50
            if (r7 == 0) goto L33
            goto L52
        L33:
            java.lang.String r7 = "mHandler"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L50
            if (r6 == 0) goto L64
            r5.setAccessible(r1)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r6 = r5.get(r0)     // Catch: java.lang.Throwable -> L50
            boolean r7 = r6 instanceof android.os.Handler     // Catch: java.lang.Throwable -> L50
            if (r7 == 0) goto L64
            android.os.Handler r6 = (android.os.Handler) r6     // Catch: java.lang.Throwable -> L50
            android.os.Handler r6 = android.ext.Tools.x.a(r6)     // Catch: java.lang.Throwable -> L50
        L4c:
            r5.set(r0, r6)     // Catch: java.lang.Throwable -> L50
            goto L64
        L50:
            r0 = move-exception
            goto L67
        L52:
            r5.setAccessible(r1)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r6 = r5.get(r0)     // Catch: java.lang.Throwable -> L50
            boolean r7 = r6 instanceof java.lang.Runnable     // Catch: java.lang.Throwable -> L50
            if (r7 == 0) goto L64
            java.lang.Runnable r6 = (java.lang.Runnable) r6     // Catch: java.lang.Throwable -> L50
            java.lang.Runnable r6 = android.ext.Tools.z.a(r6)     // Catch: java.lang.Throwable -> L50
            goto L4c
        L64:
            int r4 = r4 + 1
            goto L1a
        L67:
            android.ext.e1.a(r0)
        L6a:
            return r8
    }

    public static android.content.Context h() {
            android.content.Context r0 = android.ext.Tools.f0()
            boolean r1 = android.ext.Config.vSpaceReal
            if (r1 == 0) goto L1c
            boolean r1 = android.ext.Config.D
            if (r1 != 0) goto L1c
            android.content.Context r1 = android.ext.p2.f1181f
            if (r1 == 0) goto L12
            if (r1 == r0) goto L1a
        L12:
            android.content.Context r1 = android.ext.Config.a(r0)
            android.ext.p2.f1182g = r1
            android.ext.p2.f1181f = r0
        L1a:
            android.content.Context r0 = android.ext.p2.f1182g
        L1c:
            return r0
    }

    public static void i() {
            return
    }

    public static void j(android.widget.Toast r6) {
            java.lang.Object r0 = android.ext.p2.f1179d
            monitor-enter(r0)
            java.lang.ref.WeakReference r1 = android.ext.p2.f1178c     // Catch: java.lang.Throwable -> L60
            r2 = 0
            if (r1 != 0) goto La
            r1 = r2
            goto L10
        La:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L60
            android.widget.Toast r1 = (android.widget.Toast) r1     // Catch: java.lang.Throwable -> L60
        L10:
            android.ext.p2.f1178c = r2     // Catch: java.lang.Throwable -> L60
            java.lang.ref.WeakReference r3 = android.ext.p2.f1180e     // Catch: java.lang.Throwable -> L60
            if (r3 != 0) goto L18
            r3 = r2
            goto L1e
        L18:
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L60
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L60
        L1e:
            android.ext.p2.f1180e = r2     // Catch: java.lang.Throwable -> L60
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            android.widget.Toast r4 = g(r6)
            r4.show()
            android.ext.p2$b r4 = new android.ext.p2$b
            r4.<init>(r6)
            monitor-enter(r0)
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L5d
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L5d
            android.ext.p2.f1178c = r5     // Catch: java.lang.Throwable -> L5d
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L5d
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L5d
            android.ext.p2.f1180e = r6     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = android.ext.p2.f1177b
            monitor-enter(r6)
            android.widget.Toast r0 = android.ext.p2.f1176a     // Catch: java.lang.Throwable -> L5a
            android.ext.p2.f1176a = r2     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5a
            f(r0)
            f(r1)
            android.os.Handler r6 = android.ext.n2.d()
            if (r3 == 0) goto L54
            r6.removeCallbacks(r3)
        L54:
            r0 = 3000(0xbb8, double:1.482E-320)
            r6.postDelayed(r4, r0)
            return
        L5a:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5a
            throw r0
        L5d:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5d
            throw r6
        L60:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            throw r6
    }
}
