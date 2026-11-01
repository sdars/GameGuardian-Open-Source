package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class v extends android.app.Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile android.ext.v f1277a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f1278b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile java.lang.Runnable f1279c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile boolean f1280d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile boolean f1281e = false;

    static {
            return
    }

    public v() {
            r0 = this;
            r0.<init>()
            android.ext.v.f1277a = r0
            return
    }

    private void a() {
            r6 = this;
            boolean r0 = android.ext.v.f1281e
            if (r0 != 0) goto L51
            boolean r0 = android.ext.v.f1280d
            if (r0 != 0) goto L9
            goto L51
        L9:
            java.lang.String[] r0 = android.ext.n0.e()
            r1 = 2
        Le:
            int r2 = r0.length
            if (r1 >= r2) goto L51
            r2 = r0[r1]
            int r3 = r1 + 1
            r3 = r0[r3]
            boolean r3 = android.ext.Tools.e1(r3)
            if (r3 == 0) goto L4e
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "BootstrapService stop: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Found: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.ext.e1.s(r2, r3)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            android.ext.n0.m(r2, r3)
        L4e:
            int r1 = r1 + 2
            goto Le
        L51:
            return
    }

    private void b() {
            r1 = this;
            android.ext.Tools.X0(r1)
            boolean r0 = android.ext.v.f1280d
            if (r0 == 0) goto L14
            android.content.Context r0 = android.ext.MainService.context
            if (r0 != 0) goto L11
            android.content.Context r0 = android.ext.l2.i(r1)
            android.ext.MainService.context = r0
        L11:
            android.ext.n0.f()
        L14:
            return
    }

    void c() {
            r3 = this;
            r0 = 1
            r3.stopForeground(r0)     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = "BootstrapService stopForeground"
            android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> La
            goto Le
        La:
            r0 = move-exception
            android.ext.e1.a(r0)
        Le:
            java.lang.String r0 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> L3a
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L3a
            r1.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<catch_.me_.if_.you_.can_.AnalyticsService> r2 = catch_.me_.if_.you_.can_.AnalyticsService.class
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L3a
            android.content.Intent r0 = r1.setClassName(r0, r2)     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r3.stopService(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r1.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "BootstrapService stop: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L3a
            r1.append(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L3a
            android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L3a
            goto L40
        L3a:
            r0 = move-exception
            java.lang.String r1 = "Failed stop Service"
            android.ext.e1.l(r1, r0)
        L40:
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.SharedPreferences getSharedPreferences(java.lang.String r1, int r2) {
            r0 = this;
            android.content.SharedPreferences r1 = super.getSharedPreferences(r1, r2)
            android.content.SharedPreferences r1 = android.ext.f2.a(r1)
            return r1
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BootstrapService onBind: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            android.ext.e1.d(r3)
            r3 = 0
            return r3
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BootstrapService onConfigurationChanged: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            boolean r0 = android.ext.v.f1278b
            if (r0 != 0) goto L19
            return
        L19:
            android.content.res.Configuration r3 = a.b.f(r3)
            super.onConfigurationChanged(r3)
            android.ext.MainService.Y(r3)
            return
    }

    @Override // android.app.Service
    public void onCreate() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BootstrapService onCreate: "
            r0.append(r1)
            boolean r1 = android.ext.v.f1278b
            r0.append(r1)
            r1 = 45
            r0.append(r1)
            boolean r1 = android.ext.v.f1280d
            r0.append(r1)
            java.lang.String r1 = "; "
            r0.append(r1)
            android.ext.v r2 = android.ext.v.f1277a
            r0.append(r2)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            boolean r0 = android.ext.v.f1278b
            if (r0 != 0) goto L52
            boolean r0 = android.ext.r.o(r3)
            if (r0 == 0) goto L4e
            r0 = 1
            android.ext.v.f1278b = r0
            android.ext.v.f1277a = r3
            super.onCreate()
            r3.b()
            android.ext.s1.w()
            r0 = 1000(0x3e8, double:4.94E-321)
            android.ext.r.J(r3, r0)
            return
        L4e:
            r3.c()
            return
        L52:
            android.ext.v.f1277a = r3
            super.onCreate()
            r3.b()
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r3 = this;
            java.lang.Runnable r0 = android.ext.v.f1279c
            if (r0 == 0) goto L11
            java.lang.String r0 = "AndroidService"
            java.lang.String r1 = "wait 3"
            android.ext.e1.e.a(r0, r1)
            java.lang.Runnable r0 = android.ext.v.f1279c
            r0.run()
            return
        L11:
            boolean r0 = android.ext.v.f1278b
            r1 = 45
            if (r0 != 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "BootstrapService onDestroy 1: "
            r0.append(r2)
            boolean r2 = android.ext.v.f1278b
            r0.append(r2)
            r0.append(r1)
            boolean r1 = android.ext.v.f1281e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            return
        L36:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "BootstrapService onDestroy 2: "
            r0.append(r2)
            boolean r2 = android.ext.v.f1278b
            r0.append(r2)
            r0.append(r1)
            boolean r1 = android.ext.v.f1281e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>()
            android.ext.e1.g(r0, r1)
            r3.a()
            r0 = 1
            r3.stopForeground(r0)
            boolean r0 = android.ext.u.c()
            if (r0 != 0) goto L69
            android.ext.t.a()
        L69:
            super.onDestroy()
            return
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
            r1 = this;
            java.lang.String r0 = "BootstrapService onLowMemory"
            android.ext.e1.d(r0)
            boolean r0 = android.ext.v.f1278b
            if (r0 != 0) goto La
            return
        La:
            super.onLowMemory()
            r0 = -1
            android.ext.MainService.t0(r0)
            return
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BootstrapService onRebind: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            super.onRebind(r3)
            return
    }

    @Override // android.app.Service
    public void onStart(android.content.Intent r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BootstrapService onStart: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "; "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            super.onStart(r3, r4)
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r10, int r11, int r12) {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BootstrapService onStartCommand: "
            r0.append(r1)
            boolean r2 = android.ext.v.f1278b
            r0.append(r2)
            r2 = 45
            r0.append(r2)
            boolean r2 = android.ext.v.f1280d
            r0.append(r2)
            java.lang.String r2 = "; "
            r0.append(r2)
            android.ext.v r3 = android.ext.v.f1277a
            r0.append(r3)
            r0.append(r2)
            r0.append(r9)
            r0.append(r2)
            android.content.Context r2 = android.ext.MainService.context
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r12)
            r1 = 32
            r0.append(r1)
            r0.append(r11)
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            boolean r0 = android.ext.v.f1278b
            r1 = 2
            if (r0 != 0) goto L61
            r9.c()
            return r1
        L61:
            r9.b()
            boolean r0 = android.ext.v.f1280d
            if (r0 == 0) goto Lbc
            android.ext.f1.D()
            boolean r0 = android.ext.Config.vSpaceReal
            if (r0 == 0) goto L71
            r0 = 4
            goto L72
        L71:
            r0 = 2
        L72:
            r2 = 0
            r3 = 0
            r4 = 0
        L75:
            if (r4 >= r0) goto Lbc
            android.ext.MainService r5 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> La2
            int r6 = r4 % 2
            r7 = 1
            if (r6 != 0) goto L80
            r6 = 1
            goto L81
        L80:
            r6 = 0
        L81:
            if (r4 < r1) goto L85
            r8 = 1
            goto L86
        L85:
            r8 = 0
        L86:
            android.app.Notification r5 = r5.F(r6, r8)     // Catch: java.lang.Throwable -> La2
            r9.startForeground(r7, r5)     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r5.<init>()     // Catch: java.lang.Throwable -> La2
            java.lang.String r6 = "startForeground 1."
            r5.append(r6)     // Catch: java.lang.Throwable -> La2
            r5.append(r4)     // Catch: java.lang.Throwable -> La2
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La2
            android.ext.e1.d(r5)     // Catch: java.lang.Throwable -> La2
            goto Lbc
        La2:
            r5 = move-exception
            if (r3 == 0) goto La8
            r5.addSuppressed(r3)
        La8:
            int r3 = r0 + (-1)
            if (r4 != r3) goto Lb8
            java.lang.String r3 = "Failed startForeground"
            android.ext.e1.s(r3, r5)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            android.ext.n0.h(r3, r5, r2)
        Lb8:
            int r4 = r4 + 1
            r3 = r5
            goto L75
        Lbc:
            int r10 = super.onStartCommand(r10, r11, r12)
            return r10
    }

    @Override // android.app.Service
    public void onTaskRemoved(android.content.Intent r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BootstrapService onTaskRemoved: "
            r0.append(r1)
            boolean r1 = android.ext.v.f1278b
            r0.append(r1)
            r1 = 45
            r0.append(r1)
            boolean r2 = android.ext.v.f1281e
            r0.append(r2)
            r0.append(r1)
            boolean r1 = android.ext.v.f1280d
            r0.append(r1)
            java.lang.String r1 = "; "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>()
            android.ext.e1.g(r0, r1)
            boolean r0 = android.ext.v.f1278b
            if (r0 != 0) goto L3a
            return
        L3a:
            r3.a()
            super.onTaskRemoved(r4)
            return
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BootstrapService onTrimMemory: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            boolean r0 = android.ext.v.f1278b
            if (r0 != 0) goto L19
            return
        L19:
            super.onTrimMemory(r3)
            android.ext.MainService.t0(r3)
            return
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BootstrapService onUnbind: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            boolean r3 = super.onUnbind(r3)
            return r3
    }
}
