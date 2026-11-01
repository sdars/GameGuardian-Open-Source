package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class MainService extends android.ext.k2 implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {
    public static final java.lang.String G0 = null;
    public static volatile boolean H0;
    public static volatile boolean I0;
    public static final android.ext.p1[][] J0 = null;
    private static volatile boolean K0;
    public static final boolean[] L0 = null;
    public static final boolean[] M0 = null;
    private static int N0;
    static int O0;
    private static volatile boolean P0;
    private static volatile android.content.ComponentCallbacks Q0;
    private static volatile boolean R0;
    private static volatile boolean S0;
    private static long T0;
    public static volatile android.content.Context context;
    public static volatile android.ext.MainService instance;
    private volatile long A;
    private final java.lang.Runnable A0;
    private volatile long B;
    java.lang.Runnable B0;
    android.widget.TextView C;
    private boolean C0;
    final android.fix.WrapLayout[] D;
    private boolean D0;
    android.view.View E;
    private final android.ext.a3[] E0;
    private android.widget.ImageView F;
    volatile boolean F0;
    android.widget.ListView G;
    android.ext.q0 H;
    android.ext.p1 I;
    android.view.View J;
    android.widget.ImageView K;
    android.widget.ListView L;
    android.widget.ListView M;
    android.ext.n1 N;
    android.ext.o1 O;
    android.widget.ImageButton P;
    private android.widget.ImageButton Q;
    boolean R;
    boolean S;
    private boolean T;
    private boolean U;
    android.ext.t0 V;
    android.ext.i2 W;
    android.ext.m1 X;
    android.widget.ListView Y;
    android.view.View Z;
    android.view.View a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    android.ext.Script f212b;
    android.view.View b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    android.view.View f213c;
    android.view.View c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    android.view.View f214d;
    private android.widget.TextView d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f215e;
    private android.widget.TextView e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    android.ext.c2 f216f;
    android.view.View f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    android.view.View f217g;
    android.widget.TextView g0;
    android.ext.j h;
    android.ext.ShowApp h0;
    android.ext.f0 i;
    android.ext.x i0;
    android.ext.HotPoint j;
    private boolean j0;
    android.ext.TimeJumpPanel k;
    public android.ext.d1 k0;
    android.view.WindowManager l;
    volatile int l0;
    android.widget.TabHost m;
    volatile int m0;
    volatile android.ext.i1 n;
    android.ext.TimersEditor n0;
    private android.widget.ImageView o;
    android.ext.TimersEditor o0;
    private android.widget.ImageView p;
    volatile long p0;
    private android.widget.ImageView q;
    boolean q0;
    android.view.View r;
    boolean r0;
    android.widget.TextView s;
    final d.a s0;
    android.widget.TextView t;
    android.ext.SavedListAdapter t0;
    android.widget.TextView u;
    final android.ext.d u0;
    android.view.View v;
    public android.ext.z1.d v0;
    android.widget.TextView w;
    private android.util.SparseBooleanArray w0;
    android.view.View x;
    android.ext.ConfigListAdapter x0;
    android.widget.TextView y;
    private volatile java.util.ArrayList y0;
    android.view.View z;
    private final int[] z0;

    class a extends android.ext.p1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f218f;

        a(android.ext.MainService r1, int r2, int r3) {
                r0 = this;
                r0.f218f = r1
                r0.<init>(r2, r3)
                return
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                android.ext.MainService r4 = r3.f218f
                android.ext.SavedListAdapter r4 = r4.t0
                int r4 = r4.getCount()
                android.ext.h2[] r0 = new android.ext.h2[r4]
                r1 = 0
            Lb:
                if (r1 >= r4) goto L1a
                android.ext.MainService r2 = r3.f218f
                android.ext.SavedListAdapter r2 = r2.t0
                android.ext.h2 r2 = r2.d(r1)
                r0[r1] = r2
                int r1 = r1 + 1
                goto Lb
            L1a:
                android.ext.c1 r4 = new android.ext.c1
                android.ext.MainService r1 = r3.f218f
                android.ext.z1$d r1 = r1.v0
                r4.<init>(r1, r0)
                return
        }
    }

    class a0 implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f219a;

        a0(android.ext.MainService r1) {
                r0 = this;
                r0.f219a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.ext.MainService r1 = r0.f219a
                r2 = 1
                r1.q(r2)
                r1 = 2131296623(0x7f09016f, float:1.8211168E38)
                android.ext.ConfigListAdapter.t(r1)
                return
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f220a;

        b(android.ext.MainService r1) {
                r0 = this;
                r0.f220a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                android.ext.MainService r6 = r7.f220a
                java.lang.String r1 = "script-interrupt"
                r2 = 0
                r3 = 0
                r4 = 2131296711(0x7f0901c7, float:1.8211346E38)
                r5 = 2130968654(0x7f04004e, float:1.7545968E38)
                r0 = r6
                android.ext.FloatPanel r0 = r0.C(r1, r2, r3, r4, r5)
                r6.f213c = r0
                android.ext.MainService r0 = r7.f220a
                r1 = 0
                r0.f214d = r1
                android.ext.ShowApp r0 = r0.h0
                r0.o()
                return
        }
    }

    class b0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f221a;

        b0(android.ext.MainService r1) {
                r0 = this;
                r0.f221a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.ext.MainService r0 = r2.f221a
                android.ext.i1 r0 = r0.n
                r0.show()
                android.ext.MainService r0 = r2.f221a
                android.ext.x r0 = r0.i0
                r1 = 0
                r0.e(r1)
                return
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f223b;

        c(android.ext.MainService r1, boolean r2) {
                r0 = this;
                r0.f223b = r1
                r0.f222a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r9 = this;
                boolean r0 = r9.f222a
                if (r0 == 0) goto L9
                android.ext.MainService r1 = r9.f223b
                r2 = 0
                r1.f215e = r2
            L9:
                android.ext.MainService r1 = r9.f223b
                if (r0 == 0) goto L1e
                java.lang.String r4 = "script-ui-button"
                r5 = 0
                r6 = 50
                r7 = 2130968657(0x7f040051, float:1.7545974E38)
                r8 = 2130968657(0x7f040051, float:1.7545974E38)
                r3 = r1
                android.ext.FloatPanel r0 = r3.C(r4, r5, r6, r7, r8)
                goto L1f
            L1e:
                r0 = 0
            L1f:
                r1.f214d = r0
                android.ext.MainService r0 = r9.f223b
                android.ext.ShowApp r0 = r0.h0
                r0.o()
                return
        }
    }

    class c0 implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f226c;

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.MainService.c0 f227a;

            a(android.ext.MainService.c0 r1) {
                    r0 = this;
                    r0.f227a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    android.ext.MainService$c0 r0 = r3.f227a
                    android.ext.MainService r1 = r0.f226c
                    android.ext.j r1 = r1.h
                    r2 = 1
                    java.lang.String r0 = r0.f224a
                    r1.c(r2, r0)
                    return
            }
        }

        class b implements android.content.DialogInterface.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.MainService.c0 f228a;

            b(android.ext.MainService.c0 r1) {
                    r0 = this;
                    r0.f228a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(android.content.DialogInterface r3) {
                    r2 = this;
                    android.ext.MainService$c0 r3 = r2.f228a
                    android.ext.MainService r0 = r3.f226c
                    java.lang.String r1 = r3.f224a
                    boolean r3 = r3.f225b
                    r0.s0(r1, r3)
                    return
            }
        }

        class c implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.MainService.c0 f229a;

            class a implements java.lang.Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ android.ext.MainService.c0.c f230a;

                /* JADX INFO: renamed from: android.ext.MainService$c0$c$a$a, reason: collision with other inner class name */
                class RunnableC0007a implements java.lang.Runnable {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ android.content.Intent f231a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ android.ext.MainService.c0.c.a f232b;

                    RunnableC0007a(android.ext.MainService.c0.c.a r1, android.content.Intent r2) {
                            r0 = this;
                            r0.f232b = r1
                            r0.f231a = r2
                            r0.<init>()
                            return
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                            r3 = this;
                            android.content.Context r0 = android.ext.Tools.f0()     // Catch: java.lang.Exception -> La
                            android.content.Intent r1 = r3.f231a     // Catch: java.lang.Exception -> La
                            r0.startActivity(r1)     // Catch: java.lang.Exception -> La
                            goto L27
                        La:
                            r0 = move-exception
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Failed restart app 2: "
                            r1.append(r2)
                            android.ext.MainService$c0$c$a r2 = r3.f232b
                            android.ext.MainService$c0$c r2 = r2.f230a
                            android.ext.MainService$c0 r2 = r2.f229a
                            java.lang.String r2 = r2.f224a
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            android.ext.e1.l(r1, r0)
                        L27:
                            return
                    }
                }

                class b implements java.lang.Runnable {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ java.lang.String f233a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ android.ext.MainService.c0.c.a f234b;

                    b(android.ext.MainService.c0.c.a r1, java.lang.String r2) {
                            r0 = this;
                            r0.f234b = r1
                            r0.f233a = r2
                            r0.<init>()
                            return
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                            r3 = this;
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
                            r0.<init>()     // Catch: java.lang.Throwable -> L18
                            java.lang.String r1 = r3.f233a     // Catch: java.lang.Throwable -> L18
                            r0.append(r1)     // Catch: java.lang.Throwable -> L18
                            java.lang.String r1 = " ''"
                            r0.append(r1)     // Catch: java.lang.Throwable -> L18
                            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L18
                            r1 = 5
                            android.ext.e2.n(r0, r1)     // Catch: java.lang.Throwable -> L18
                            goto L35
                        L18:
                            r0 = move-exception
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Failed unstub app: "
                            r1.append(r2)
                            android.ext.MainService$c0$c$a r2 = r3.f234b
                            android.ext.MainService$c0$c r2 = r2.f230a
                            android.ext.MainService$c0 r2 = r2.f229a
                            java.lang.String r2 = r2.f224a
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            android.ext.e1.l(r1, r0)
                        L35:
                            return
                    }
                }

                /* JADX INFO: renamed from: android.ext.MainService$c0$c$a$c, reason: collision with other inner class name */
                class RunnableC0008c implements java.lang.Runnable {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ android.ext.MainService.c0.c.a f235a;

                    RunnableC0008c(android.ext.MainService.c0.c.a r1) {
                            r0 = this;
                            r0.f235a = r1
                            r0.<init>()
                            return
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                            r3 = this;
                            android.ext.MainService$c0$c$a r0 = r3.f235a
                            android.ext.MainService$c0$c r0 = r0.f230a
                            android.ext.MainService$c0 r0 = r0.f229a
                            android.ext.MainService r1 = r0.f226c
                            android.ext.j r1 = r1.h
                            r2 = 1
                            java.lang.String r0 = r0.f224a
                            r1.c(r2, r0)
                            return
                    }
                }

                a(android.ext.MainService.c0.c r1) {
                        r0 = this;
                        r0.f230a = r1
                        r0.<init>()
                        return
                }

                @Override // java.lang.Runnable
                public void run() {
                        r8 = this;
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Restart stub: "
                        r0.append(r1)
                        android.ext.MainService$c0$c r1 = r8.f230a
                        android.ext.MainService$c0 r1 = r1.f229a
                        java.lang.String r1 = r1.f224a
                        r0.append(r1)
                        java.lang.String r0 = r0.toString()
                        android.ext.e1.d(r0)
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "exec setprop wrap."
                        r0.append(r1)
                        android.ext.MainService$c0$c r1 = r8.f230a
                        android.ext.MainService$c0 r1 = r1.f229a
                        java.lang.String r1 = r1.f224a
                        r2 = 0
                        if (r1 == 0) goto L40
                        int r1 = r1.length()
                        r3 = 26
                        if (r1 <= r3) goto L40
                        android.ext.MainService$c0$c r1 = r8.f230a
                        android.ext.MainService$c0 r1 = r1.f229a
                        java.lang.String r1 = r1.f224a
                        java.lang.String r1 = r1.substring(r2, r3)
                        goto L46
                    L40:
                        android.ext.MainService$c0$c r1 = r8.f230a
                        android.ext.MainService$c0 r1 = r1.f229a
                        java.lang.String r1 = r1.f224a
                    L46:
                        r0.append(r1)
                        java.lang.String r0 = r0.toString()
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
                        r1.<init>()     // Catch: java.lang.Throwable -> L83
                        java.lang.String r3 = android.ext.e0.g()     // Catch: java.lang.Throwable -> L83
                        r1.append(r3)     // Catch: java.lang.Throwable -> L83
                        android.ext.MainService$c0$c r3 = r8.f230a     // Catch: java.lang.Throwable -> L83
                        android.ext.MainService$c0 r3 = r3.f229a     // Catch: java.lang.Throwable -> L83
                        boolean r3 = r3.f225b     // Catch: java.lang.Throwable -> L83
                        java.lang.String r3 = android.ext.e0.k(r3)     // Catch: java.lang.Throwable -> L83
                        r1.append(r3)     // Catch: java.lang.Throwable -> L83
                        java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L83
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
                        r3.<init>()     // Catch: java.lang.Throwable -> L83
                        r3.append(r0)     // Catch: java.lang.Throwable -> L83
                        java.lang.String r4 = " LD_PRELOAD="
                        r3.append(r4)     // Catch: java.lang.Throwable -> L83
                        r3.append(r1)     // Catch: java.lang.Throwable -> L83
                        java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L83
                        r3 = 5
                        android.ext.e2.n(r1, r3)     // Catch: java.lang.Throwable -> L83
                        goto L9e
                    L83:
                        r1 = move-exception
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        r3.<init>()
                        java.lang.String r4 = "Failed stub app: "
                        r3.append(r4)
                        android.ext.MainService$c0$c r4 = r8.f230a
                        android.ext.MainService$c0 r4 = r4.f229a
                        java.lang.String r4 = r4.f224a
                        r3.append(r4)
                        java.lang.String r3 = r3.toString()
                        android.ext.e1.l(r3, r1)
                    L9e:
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le9
                        r1.<init>()     // Catch: java.lang.Throwable -> Le9
                        java.lang.String r3 = "exec monkey -p "
                        r1.append(r3)     // Catch: java.lang.Throwable -> Le9
                        android.ext.MainService$c0$c r3 = r8.f230a     // Catch: java.lang.Throwable -> Le9
                        android.ext.MainService$c0 r3 = r3.f229a     // Catch: java.lang.Throwable -> Le9
                        java.lang.String r3 = r3.f224a     // Catch: java.lang.Throwable -> Le9
                        r1.append(r3)     // Catch: java.lang.Throwable -> Le9
                        java.lang.String r3 = " 1"
                        r1.append(r3)     // Catch: java.lang.Throwable -> Le9
                        java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le9
                        r3 = 10
                        java.lang.String r1 = android.ext.e2.n(r1, r3)     // Catch: java.lang.Throwable -> Le9
                        java.lang.String r4 = "Events injected"
                        boolean r1 = r1.contains(r4)     // Catch: java.lang.Throwable -> Le9
                        if (r1 != 0) goto L11f
                        android.content.pm.PackageManager r1 = android.ext.Tools.B0()     // Catch: java.lang.Throwable -> Le9
                        android.ext.MainService$c0$c r4 = r8.f230a     // Catch: java.lang.Throwable -> Le9
                        android.ext.MainService$c0 r4 = r4.f229a     // Catch: java.lang.Throwable -> Le9
                        java.lang.String r4 = r4.f224a     // Catch: java.lang.Throwable -> Le9
                        android.content.Intent r1 = r1.getLaunchIntentForPackage(r4)     // Catch: java.lang.Throwable -> Le9
                        if (r1 != 0) goto Leb
                        android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> Le9
                        java.lang.String r4 = "android.intent.action.MAIN"
                        r1.<init>(r4)     // Catch: java.lang.Throwable -> Le9
                        android.ext.MainService$c0$c r4 = r8.f230a     // Catch: java.lang.Throwable -> Le9
                        android.ext.MainService$c0 r4 = r4.f229a     // Catch: java.lang.Throwable -> Le9
                        java.lang.String r4 = r4.f224a     // Catch: java.lang.Throwable -> Le9
                        r1.setPackage(r4)     // Catch: java.lang.Throwable -> Le9
                        goto Leb
                    Le9:
                        r1 = move-exception
                        goto L121
                    Leb:
                        android.content.ComponentName r4 = r1.getComponent()     // Catch: java.lang.Throwable -> Le9
                        if (r4 == 0) goto L112
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le9
                        r5.<init>()     // Catch: java.lang.Throwable -> Le9
                        java.lang.String r6 = "exec am start -n "
                        r5.append(r6)     // Catch: java.lang.Throwable -> Le9
                        java.lang.String r4 = r4.flattenToString()     // Catch: java.lang.Throwable -> Le9
                        r5.append(r4)     // Catch: java.lang.Throwable -> Le9
                        java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> Le9
                        java.lang.String r3 = android.ext.e2.n(r4, r3)     // Catch: java.lang.Throwable -> Le9
                        java.lang.String r4 = "Starting: Intent"
                        boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> Le9
                        if (r3 != 0) goto L11f
                    L112:
                        r3 = 268435456(0x10000000, float:2.524355E-29)
                        r1.setFlags(r3)     // Catch: java.lang.Throwable -> Le9
                        android.ext.MainService$c0$c$a$a r3 = new android.ext.MainService$c0$c$a$a     // Catch: java.lang.Throwable -> Le9
                        r3.<init>(r8, r1)     // Catch: java.lang.Throwable -> Le9
                        android.ext.n2.i(r3)     // Catch: java.lang.Throwable -> Le9
                    L11f:
                        r2 = 1
                        goto L13b
                    L121:
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        r3.<init>()
                        java.lang.String r4 = "Failed restart app: "
                        r3.append(r4)
                        android.ext.MainService$c0$c r4 = r8.f230a
                        android.ext.MainService$c0 r4 = r4.f229a
                        java.lang.String r4 = r4.f224a
                        r3.append(r4)
                        java.lang.String r3 = r3.toString()
                        android.ext.e1.l(r3, r1)
                    L13b:
                        android.os.Handler r1 = android.ext.n2.c()
                        android.ext.MainService$c0$c$a$b r3 = new android.ext.MainService$c0$c$a$b
                        r3.<init>(r8, r0)
                        r4 = 0
                        if (r2 == 0) goto L14b
                        r6 = 10000(0x2710, double:4.9407E-320)
                        goto L14c
                    L14b:
                        r6 = r4
                    L14c:
                        r1.postDelayed(r3, r6)
                        android.os.Handler r0 = android.ext.n2.d()
                        android.ext.MainService$c0$c$a$c r1 = new android.ext.MainService$c0$c$a$c
                        r1.<init>(r8)
                        if (r2 == 0) goto L15c
                        r4 = 4000(0xfa0, double:1.9763E-320)
                    L15c:
                        r0.postDelayed(r1, r4)
                        return
                }
            }

            c(android.ext.MainService.c0 r1) {
                    r0 = this;
                    r0.f229a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r1, int r2) {
                    r0 = this;
                    android.ext.MainService$c0$c$a r1 = new android.ext.MainService$c0$c$a
                    r1.<init>(r0)
                    android.ext.n2.h(r1)
                    return
            }
        }

        c0(android.ext.MainService r1, java.lang.String r2, boolean r3) {
                r0 = this;
                r0.f226c = r1
                r0.f224a = r2
                r0.f225b = r3
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r4, int r5) {
                r3 = this;
                android.ext.MainService r0 = r3.f226c
                r1 = 0
                r0.F0 = r1
                if (r5 == 0) goto Lcf
                r0 = 1
                if (r5 == r0) goto L66
                r0 = 2
                if (r5 == r0) goto L20
                r0 = 3
                if (r5 == r0) goto L11
                goto L17
            L11:
                r5 = 2131296626(0x7f090172, float:1.8211174E38)
                android.ext.ConfigListAdapter.t(r5)
            L17:
                android.ext.MainService r5 = r3.f226c
                android.ext.j r5 = r5.h
                r5.g()
                goto Ld9
            L20:
                android.ext.MainService$c0$b r5 = new android.ext.MainService$c0$b
                r5.<init>(r3)
                r0 = 0
                boolean r5 = android.ext.f1.z(r0, r5)
                if (r5 == 0) goto Ld9
                android.app.AlertDialog$Builder r5 = android.ext.f.b()
                r1 = 2131296906(0x7f09028a, float:1.8211742E38)
                android.view.View r1 = android.ext.Tools.g0(r1)
                android.app.AlertDialog$Builder r5 = r5.setCustomTitle(r1)
                r1 = 2131297100(0x7f09034c, float:1.8212135E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                android.app.AlertDialog$Builder r5 = r5.setMessage(r1)
                r1 = 2131296311(0x7f090037, float:1.8210535E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                android.app.AlertDialog$Builder r5 = r5.setNegativeButton(r1, r0)
                r0 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.ext.MainService$c0$c r1 = new android.ext.MainService$c0$c
                r1.<init>(r3)
                android.app.AlertDialog$Builder r5 = r5.setPositiveButton(r0, r1)
                android.ext.f.o(r5)
                goto Ld9
            L66:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = "Restart: "
                r5.append(r2)
                java.lang.String r2 = r3.f224a
                r5.append(r2)
                java.lang.String r5 = r5.toString()
                android.ext.e1.d(r5)
                android.content.pm.PackageManager r5 = android.ext.Tools.B0()     // Catch: java.lang.Exception -> L95
                java.lang.String r2 = r3.f224a     // Catch: java.lang.Exception -> L95
                android.content.Intent r5 = r5.getLaunchIntentForPackage(r2)     // Catch: java.lang.Exception -> L95
                if (r5 != 0) goto L97
                android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Exception -> L95
                java.lang.String r2 = "android.intent.action.MAIN"
                r5.<init>(r2)     // Catch: java.lang.Exception -> L95
                java.lang.String r2 = r3.f224a     // Catch: java.lang.Exception -> L95
                r5.setPackage(r2)     // Catch: java.lang.Exception -> L95
                goto L97
            L95:
                r5 = move-exception
                goto La5
            L97:
                r2 = 268435456(0x10000000, float:2.524355E-29)
                r5.setFlags(r2)     // Catch: java.lang.Exception -> L95
                android.content.Context r2 = android.ext.Tools.f0()     // Catch: java.lang.Exception -> L95
                r2.startActivity(r5)     // Catch: java.lang.Exception -> L95
                r1 = 1
                goto Lbb
            La5:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Failed restart app: "
                r0.append(r2)
                java.lang.String r2 = r3.f224a
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                android.ext.e1.l(r0, r5)
            Lbb:
                android.os.Handler r5 = android.ext.n2.d()
                android.ext.MainService$c0$a r0 = new android.ext.MainService$c0$a
                r0.<init>(r3)
                if (r1 == 0) goto Lc9
                r1 = 4000(0xfa0, double:1.9763E-320)
                goto Lcb
            Lc9:
                r1 = 0
            Lcb:
                r5.postDelayed(r0, r1)
                goto Ld9
            Lcf:
                android.ext.p0 r0 = new android.ext.p0
                r1 = 1100(0x44c, float:1.541E-42)
                r0.<init>(r1)
                r0.onClick(r4, r5)
            Ld9:
                android.ext.Tools.D(r4)
                return
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f236a;

        d(android.ext.MainService r1) {
                r0 = this;
                r0.f236a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.ext.MainService r0 = r2.f236a
                r1 = 0
                r0.f213c = r1
                r0.f214d = r1
                android.ext.ShowApp r0 = r0.h0
                r0.e()
                android.ext.MainService r0 = r2.f236a
                r1 = 1
                r0.D0(r1)
                return
        }
    }

    class d0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f237a;

        d0(android.ext.MainService r1) {
                r0 = this;
                r0.f237a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.ext.MainService r0 = r2.f237a     // Catch: java.lang.Throwable -> L8
                android.ext.f0 r0 = r0.i     // Catch: java.lang.Throwable -> L8
                r1 = 2
                r0.K0(r1)     // Catch: java.lang.Throwable -> L8
            L8:
                return
        }
    }

    class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f238a;

        e(android.ext.MainService r1) {
                r0 = this;
                r0.f238a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.ext.MainService r0 = r2.f238a
                r1 = 0
                r0.f217g = r1
                android.ext.ShowApp r0 = r0.h0
                r0.d()
                return
        }
    }

    class e0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f239a;

        e0(android.ext.MainService r1) {
                r0 = this;
                r0.f239a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "doCheckLibs: "
                r0.append(r1)
                android.ext.MainService r1 = r2.f239a
                int r1 = r1.v()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.ext.e1.d(r0)
                return
        }
    }

    class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f240a;

        f(android.ext.MainService r1) {
                r0 = this;
                r0.f240a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                android.ext.MainService r6 = r7.f240a
                java.lang.String r1 = "record-interrupt"
                r2 = 0
                r3 = 0
                r4 = 2131296884(0x7f090274, float:1.8211697E38)
                r5 = 2130968654(0x7f04004e, float:1.7545968E38)
                r0 = r6
                android.ext.FloatPanel r0 = r0.C(r1, r2, r3, r4, r5)
                r6.f217g = r0
                android.ext.MainService r0 = r7.f240a
                android.ext.ShowApp r0 = r0.h0
                r0.n()
                return
        }
    }

    class f0 implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f241a;

        f0(android.ext.MainService r1) {
                r0 = this;
                r0.f241a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                r1 = 2131034154(0x7f05002a, float:1.7678818E38)
                android.ext.Config$p r1 = android.ext.Config.b(r1)
                r2 = 0
                r1.f42d = r2
                android.ext.Config.k()
                return
        }
    }

    class g extends android.ext.FloatPanel {
        final /* synthetic */ java.lang.String p;
        final /* synthetic */ int q;
        final /* synthetic */ int r;
        final /* synthetic */ android.ext.MainService s;

        g(android.ext.MainService r1, android.content.Context r2, java.lang.String r3, int r4, int r5) {
                r0 = this;
                r0.s = r1
                r0.p = r3
                r0.q = r4
                r0.r = r5
                r0.<init>(r2)
                return
        }

        @Override // android.ext.FloatPanel
        protected boolean f() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.ext.FloatPanel
        protected int getDefX() {
                r1 = this;
                int r0 = r1.q
                return r0
        }

        @Override // android.ext.FloatPanel
        protected int getDefY() {
                r1 = this;
                int r0 = r1.r
                return r0
        }

        @Override // android.ext.FloatPanel
        protected java.lang.String getPrefName() {
                r1 = this;
                java.lang.String r0 = r1.p
                return r0
        }
    }

    class g0 implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f243b;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.MainService.g0 f244a;

            /* JADX INFO: renamed from: android.ext.MainService$g0$a$a, reason: collision with other inner class name */
            class RunnableC0009a implements java.lang.Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ android.ext.MainService.g0.a f245a;

                RunnableC0009a(android.ext.MainService.g0.a r1) {
                        r0 = this;
                        r0.f245a = r1
                        r0.<init>()
                        return
                }

                @Override // java.lang.Runnable
                public void run() {
                        r4 = this;
                        r0 = 2131296893(0x7f09027d, float:1.8211716E38)
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.InterruptedException -> L3a
                        r1.<init>()     // Catch: java.lang.InterruptedException -> L3a
                        java.lang.String r2 = "h{hf#sp#lqvwdoo#0u#00del#{;9#"
                        java.lang.String r2 = android.ext.Tools.removeNewLinesChars(r2)     // Catch: java.lang.InterruptedException -> L3a
                        r1.append(r2)     // Catch: java.lang.InterruptedException -> L3a
                        android.ext.MainService$g0$a r2 = r4.f245a     // Catch: java.lang.InterruptedException -> L3a
                        android.ext.MainService$g0 r2 = r2.f244a     // Catch: java.lang.InterruptedException -> L3a
                        java.lang.String r2 = r2.f242a     // Catch: java.lang.InterruptedException -> L3a
                        r1.append(r2)     // Catch: java.lang.InterruptedException -> L3a
                        java.lang.String r1 = r1.toString()     // Catch: java.lang.InterruptedException -> L3a
                        java.lang.Process r1 = android.ext.e2.q(r1)     // Catch: java.lang.InterruptedException -> L3a
                        if (r1 != 0) goto L3c
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.InterruptedException -> L3a
                        r1.<init>()     // Catch: java.lang.InterruptedException -> L3a
                        java.lang.String r2 = android.ext.b2.f(r0)     // Catch: java.lang.InterruptedException -> L3a
                        r1.append(r2)     // Catch: java.lang.InterruptedException -> L3a
                        java.lang.String r2 = "\nnull"
                        r1.append(r2)     // Catch: java.lang.InterruptedException -> L3a
                        java.lang.String r0 = r1.toString()     // Catch: java.lang.InterruptedException -> L3a
                        goto L84
                    L3a:
                        r1 = move-exception
                        goto L63
                    L3c:
                        int r1 = r1.waitFor()     // Catch: java.lang.InterruptedException -> L3a
                        if (r1 != 0) goto L4a
                        r1 = 2131296891(0x7f09027b, float:1.8211711E38)
                        java.lang.String r0 = android.ext.b2.f(r1)     // Catch: java.lang.InterruptedException -> L3a
                        goto L84
                    L4a:
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.InterruptedException -> L3a
                        r2.<init>()     // Catch: java.lang.InterruptedException -> L3a
                        java.lang.String r3 = android.ext.b2.f(r0)     // Catch: java.lang.InterruptedException -> L3a
                        r2.append(r3)     // Catch: java.lang.InterruptedException -> L3a
                        java.lang.String r3 = "\ncode: "
                        r2.append(r3)     // Catch: java.lang.InterruptedException -> L3a
                        r2.append(r1)     // Catch: java.lang.InterruptedException -> L3a
                        java.lang.String r0 = r2.toString()     // Catch: java.lang.InterruptedException -> L3a
                        goto L84
                    L63:
                        java.lang.String r2 = "Reinstall failed"
                        android.ext.e1.g(r2, r1)
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r0 = android.ext.b2.f(r0)
                        r2.append(r0)
                        java.lang.String r0 = "\n"
                        r2.append(r0)
                        java.lang.String r0 = r1.getMessage()
                        r2.append(r0)
                        java.lang.String r0 = r2.toString()
                    L84:
                        r1 = 1
                        android.ext.Tools.K1(r0, r1)
                        return
                }
            }

            a(android.ext.MainService.g0 r1) {
                    r0 = this;
                    r0.f244a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r2, int r3) {
                    r1 = this;
                    r2 = 2131296894(0x7f09027e, float:1.8211718E38)
                    r3 = 0
                    android.ext.Tools.I1(r2, r3)
                    android.ext.n0$i r2 = new android.ext.n0$i
                    android.ext.MainService$g0$a$a r3 = new android.ext.MainService$g0$a$a
                    r3.<init>(r1)
                    java.lang.String r0 = "FixLibs"
                    r2.<init>(r3, r0)
                    r2.start()
                    return
            }
        }

        g0(android.ext.MainService r1, java.lang.String r2) {
                r0 = this;
                r0.f243b = r1
                r0.f242a = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r3, int r4) {
                r2 = this;
                android.app.AlertDialog$Builder r3 = android.ext.f.b()
                r4 = 2131297024(0x7f090300, float:1.8211981E38)
                java.lang.String r4 = android.ext.b2.f(r4)
                android.app.AlertDialog$Builder r3 = r3.setMessage(r4)
                r4 = 2131297115(0x7f09035b, float:1.8212166E38)
                java.lang.String r4 = android.ext.b2.f(r4)
                android.ext.MainService$g0$a r0 = new android.ext.MainService$g0$a
                r0.<init>(r2)
                android.app.AlertDialog$Builder r3 = r3.setPositiveButton(r4, r0)
                r4 = 2131296962(0x7f0902c2, float:1.8211855E38)
                java.lang.String r4 = android.ext.b2.f(r4)
                android.ext.r$n r0 = new android.ext.r$n
                java.lang.String r1 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh278:0krz0wr0uhsodfh0dup0oleudulhv0zlwk0{;90oleudulhv0{0soruh2"
                r0.<init>(r1)
                android.app.AlertDialog$Builder r3 = r3.setNeutralButton(r4, r0)
                r4 = 2131296805(0x7f090225, float:1.8211537E38)
                java.lang.String r4 = android.ext.b2.f(r4)
                r0 = 0
                android.app.AlertDialog$Builder r3 = r3.setNegativeButton(r4, r0)
                android.ext.f.o(r3)
                return
        }
    }

    class h implements android.widget.TabHost.OnTabChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f246a;

        h(android.ext.MainService r1) {
                r0 = this;
                r0.f246a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.TabHost.OnTabChangeListener
        public void onTabChanged(java.lang.String r8) {
                r7 = this;
                android.ext.MainService r8 = android.ext.MainService.instance
                int r0 = r8.H()
                android.view.View r1 = r8.r
                r2 = 8
                r3 = 0
                r4 = 1
                if (r0 < r4) goto L10
                r5 = 0
                goto L12
            L10:
                r5 = 8
            L12:
                r1.setVisibility(r5)
                android.widget.TextView r1 = r8.s
                r5 = 3
                if (r0 == r5) goto L1c
                r6 = 0
                goto L1e
            L1c:
                r6 = 8
            L1e:
                r1.setVisibility(r6)
                android.view.View r1 = r8.z
                if (r0 != r4) goto L27
                r6 = 0
                goto L29
            L27:
                r6 = 8
            L29:
                r1.setVisibility(r6)
                android.view.View r1 = r8.v
                if (r0 != r5) goto L32
                r5 = 0
                goto L34
            L32:
                r5 = 8
            L34:
                r1.setVisibility(r5)
                android.widget.TextView r1 = r8.w
                r5 = 2
                if (r0 != r5) goto L3d
                r2 = 0
            L3d:
                r1.setVisibility(r2)
                r8.q1()
                android.widget.TabHost r1 = r8.m
                android.view.View r1 = r1.getCurrentView()
                r8.f0 = r1
                android.widget.ImageButton r1 = r8.P
                android.ext.Tools.s(r1)
                r8.p1()
                android.ext.MainService r8 = r7.f246a
                android.ext.ConfigListAdapter r8 = r8.x0
                if (r8 == 0) goto L5f
                if (r0 != 0) goto L5c
                r3 = 1
            L5c:
                r8.l(r3)
            L5f:
                return
        }
    }

    class h0 extends android.ext.p1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f247f;

        h0(android.ext.MainService r1, int r2, int r3) {
                r0 = this;
                r0.f247f = r1
                r0.<init>(r2, r3)
                return
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                r2 = 2131296986(0x7f0902da, float:1.8211904E38)
                android.ext.Tools.H1(r2)
                android.ext.MainService r2 = r1.f247f
                r2.t()
                android.ext.MainService r2 = r1.f247f
                r0 = 0
                r2.onLongClick(r0)
                return
        }
    }

    class i extends android.ext.p1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f248f;

        i(android.ext.MainService r1, int r2, int r3) {
                r0 = this;
                r0.f248f = r1
                r0.<init>(r2, r3)
                return
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                android.ext.MainService r1 = r0.f248f
                android.ext.n1 r1 = r1.N
                r1.b()
                return
        }
    }

    class i0 extends android.ext.p1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f249f;

        i0(android.ext.MainService r1, int r2, int r3) {
                r0 = this;
                r0.f249f = r1
                r0.<init>(r2, r3)
                return
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                android.ext.c1 r3 = new android.ext.c1
                android.ext.MainService r0 = r2.f249f
                android.ext.z1$d r0 = r0.v0
                r1 = 0
                r3.<init>(r0, r1)
                return
        }
    }

    class j extends android.ext.p1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f250f;

        j(android.ext.MainService r1, java.lang.String r2) {
                r0 = this;
                r0.f250f = r1
                r0.<init>(r2)
                return
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                return
        }
    }

    private class j0 extends android.ext.p1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f251f;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ long[] f252a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long[] f253b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f254c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ android.ext.MainService.j0 f255d;

            a(android.ext.MainService.j0 r1, long[] r2, long[] r3, int r4) {
                    r0 = this;
                    r0.f255d = r1
                    r0.f252a = r2
                    r0.f253b = r3
                    r0.f254c = r4
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r4, int r5) {
                    r3 = this;
                    android.ext.MainService$j0 r4 = r3.f255d
                    long[] r0 = r3.f252a
                    long[] r1 = r3.f253b
                    int r2 = r3.f254c
                    r4.i(r0, r1, r2, r5)
                    return
            }
        }

        class b implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String[] f256a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.MainService.j0 f257b;

            b(android.ext.MainService.j0 r1, java.lang.String[] r2) {
                    r0 = this;
                    r0.f257b = r1
                    r0.f256a = r2
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r2, int r3) {
                    r1 = this;
                    java.lang.String[] r0 = r1.f256a
                    r3 = r0[r3]
                    android.ext.Tools.z(r3)
                    android.ext.Tools.D(r2)
                    return
            }
        }

        public j0(android.ext.MainService r2) {
                r1 = this;
                r1.f251f = r2
                r2 = 2131296309(0x7f090035, float:1.8210531E38)
                r0 = 2130968665(0x7f040059, float:1.754599E38)
                r1.<init>(r2, r0)
                return
        }

        private void h() {
                r18 = this;
                r0 = r18
                android.ext.MainService r1 = r0.f251f
                java.lang.Object r1 = r1.z()
                r2 = 10
                long[] r3 = new long[r2]
                long[] r4 = new long[r2]
                boolean r5 = r1 instanceof d.a
                r6 = 1
                r7 = 0
                if (r5 == 0) goto L4c
                d.a r1 = (d.a) r1
                android.ext.c r5 = new android.ext.c
                r5.<init>()
                int r8 = r1.i()
                r9 = 0
                r10 = 0
                r11 = 0
            L22:
                if (r9 >= r8) goto Lcb
                boolean r12 = r1.c(r9)
                if (r12 != 0) goto L2b
                goto L49
            L2b:
                if (r10 >= r2) goto L43
                r1.f(r9, r5)
                long r12 = r5.f672a
                r3[r10] = r12
                long r12 = r5.f673b
                long[] r14 = android.ext.c.f668d
                int r15 = r5.D()
                r15 = r14[r15]
                long r12 = r12 & r15
                r4[r10] = r12
                int r10 = r10 + 1
            L43:
                int r11 = r11 + 1
                if (r11 <= r2) goto L49
                goto Lcb
            L49:
                int r9 = r9 + 1
                goto L22
            L4c:
                boolean r5 = r1 instanceof d.e
                if (r5 == 0) goto L8d
                d.e r1 = (d.e) r1
                int r5 = r1.l()
                r8 = 0
                r9 = 0
                r10 = 0
            L59:
                if (r8 >= r5) goto L87
                boolean r11 = r1.a(r8)
                if (r11 != 0) goto L62
                goto L8a
            L62:
                java.lang.Object r11 = r1.n(r8)
                android.ext.h2 r11 = (android.ext.h2) r11
                boolean r12 = r11 instanceof android.ext.h2
                if (r12 != 0) goto L6d
                goto L8a
            L6d:
                if (r9 >= r2) goto L83
                long r12 = r11.f672a
                r3[r9] = r12
                long r12 = r11.f673b
                long[] r14 = android.ext.c.f668d
                int r11 = r11.D()
                r15 = r14[r11]
                long r11 = r12 & r15
                r4[r9] = r11
                int r9 = r9 + 1
            L83:
                int r10 = r10 + 1
                if (r10 <= r2) goto L8a
            L87:
                r11 = r10
                r10 = r9
                goto Lcb
            L8a:
                int r8 = r8 + 1
                goto L59
            L8d:
                boolean r5 = r1 instanceof boolean[]
                if (r5 == 0) goto Lc9
                android.ext.MainService r5 = r0.f251f
                android.ext.n1 r5 = r5.N
                boolean[] r1 = (boolean[]) r1
                int r8 = r1.length
                int r8 = r8 - r6
                r9 = 1
                r10 = 0
                r11 = 0
            L9c:
                if (r9 >= r8) goto Lcb
                boolean r12 = r1[r9]
                if (r12 != 0) goto La3
                goto Lc6
            La3:
                if (r10 >= r2) goto Lc1
                long r12 = r5.e(r9)
                r3[r10] = r12
                java.lang.Object r12 = r5.getItem(r9)
                android.ext.c r12 = (android.ext.c) r12
                long r13 = r12.f673b
                long[] r15 = android.ext.c.f668d
                int r12 = r12.D()
                r16 = r15[r12]
                long r12 = r13 & r16
                r4[r10] = r12
                int r10 = r10 + 1
            Lc1:
                int r11 = r11 + 1
                if (r11 <= r2) goto Lc6
                goto Lcb
            Lc6:
                int r9 = r9 + 1
                goto L9c
            Lc9:
                r10 = 0
                r11 = 0
            Lcb:
                r1 = 2
                if (r10 >= r1) goto Le5
                r2 = 2131296798(0x7f09021e, float:1.8211523E38)
                java.lang.String r2 = android.ext.b2.f(r2)
                java.lang.Object[] r3 = new java.lang.Object[r6]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r3[r7] = r1
                java.lang.String r1 = android.ext.Tools.L1(r2, r3)
                android.ext.Tools.J1(r1)
                goto L12d
            Le5:
                if (r11 <= r10) goto Lfd
                r1 = 2131297077(0x7f090335, float:1.8212089E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                java.lang.Object[] r2 = new java.lang.Object[r6]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
                r2[r7] = r5
                java.lang.String r1 = android.ext.Tools.L1(r1, r2)
                android.ext.Tools.J1(r1)
            Lfd:
                android.app.AlertDialog$Builder r1 = android.ext.f.b()
                android.ext.ArrayAdapter r2 = new android.ext.ArrayAdapter
                android.content.Context r5 = android.ext.MainService.context
                r6 = 2131296833(0x7f090241, float:1.8211594E38)
                java.lang.String r6 = android.ext.Tools.N1(r6)
                java.lang.String r7 = "XOR"
                java.lang.String[] r6 = new java.lang.String[]{r6, r7}
                r2.<init>(r5, r6)
                android.ext.MainService$j0$a r5 = new android.ext.MainService$j0$a
                r5.<init>(r0, r3, r4, r10)
                android.app.AlertDialog$Builder r1 = r1.setAdapter(r2, r5)
                r2 = 2131296311(0x7f090037, float:1.8210535E38)
                java.lang.String r2 = android.ext.b2.f(r2)
                r3 = 0
                android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r2, r3)
                android.ext.f.o(r1)
            L12d:
                return
        }

        void i(long[] r19, long[] r20, int r21, int r22) {
                r18 = this;
                r0 = r21
                int r1 = r0 + (-1)
                int r2 = r0 * r1
                int r2 = r2 / 2
                java.lang.String[] r3 = new java.lang.String[r2]
                java.lang.String[] r2 = new java.lang.String[r2]
                r4 = 0
                r5 = 0
                r6 = 0
            Lf:
                if (r5 >= r1) goto L6f
                int r7 = r5 + 1
                r8 = r7
            L14:
                if (r8 >= r0) goto L6d
                r9 = r19[r5]
                r11 = r19[r8]
                if (r22 != 0) goto L29
                long r13 = r11 - r9
                java.lang.String r13 = java.lang.Long.toHexString(r13)
                java.util.Locale r14 = java.util.Locale.US
                java.lang.String r13 = r13.toUpperCase(r14)
                goto L3e
            L29:
                r13 = 1
                java.lang.Object[] r13 = new java.lang.Object[r13]
                r14 = r20[r5]
                r16 = r20[r8]
                long r14 = r14 ^ r16
                java.lang.Long r14 = java.lang.Long.valueOf(r14)
                r13[r4] = r14
                java.lang.String r14 = "%,d"
                java.lang.String r13 = android.ext.Tools.L1(r14, r13)
            L3e:
                r2[r6] = r13
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r15 = 8
                java.lang.String r9 = android.ext.t2.e(r15, r9)
                r14.append(r9)
                java.lang.String r9 = " - "
                r14.append(r9)
                java.lang.String r9 = android.ext.t2.e(r15, r11)
                r14.append(r9)
                java.lang.String r9 = ": "
                r14.append(r9)
                r14.append(r13)
                java.lang.String r9 = r14.toString()
                r3[r6] = r9
                int r6 = r6 + 1
                int r8 = r8 + 1
                goto L14
            L6d:
                r5 = r7
                goto Lf
            L6f:
                android.app.AlertDialog$Builder r0 = android.ext.f.b()
                r1 = 2131296949(0x7f0902b5, float:1.821183E38)
                android.view.View r1 = android.ext.Tools.g0(r1)
                android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r1)
                android.ext.ArrayAdapter r1 = new android.ext.ArrayAdapter
                android.content.Context r4 = android.ext.MainService.context
                r1.<init>(r4, r3)
                android.ext.MainService$j0$b r3 = new android.ext.MainService$j0$b
                r4 = r18
                r3.<init>(r4, r2)
                android.app.AlertDialog$Builder r0 = r0.setAdapter(r1, r3)
                r1 = 2131296311(0x7f090037, float:1.8210535E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                r2 = 0
                android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
                android.ext.f.o(r0)
                return
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                r0.h()
                return
        }
    }

    class k implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.widget.ListAdapter f258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f259b;

        k(android.ext.MainService r1, android.widget.ListAdapter r2) {
                r0 = this;
                r0.f259b = r1
                r0.f258a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.widget.ListAdapter r0 = r2.f258a
                boolean r1 = r0 instanceof android.ext.ConfigListAdapter
                if (r1 == 0) goto Lb
                android.ext.ConfigListAdapter r0 = (android.ext.ConfigListAdapter) r0
                r0.x()
            Lb:
                android.widget.ListAdapter r0 = r2.f258a
                boolean r1 = r0 instanceof android.widget.BaseAdapter
                if (r1 == 0) goto L1b
                android.widget.BaseAdapter r0 = (android.widget.BaseAdapter) r0     // Catch: java.lang.NoSuchMethodError -> L17
                r0.notifyDataSetChanged()     // Catch: java.lang.NoSuchMethodError -> L17
                goto L1b
            L17:
                r0 = move-exception
                android.ext.e1.a(r0)
            L1b:
                return
        }
    }

    private class k0 extends android.ext.p1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f260f;

        public k0(android.ext.MainService r2) {
                r1 = this;
                r1.f260f = r2
                r2 = 2131296327(0x7f090047, float:1.8210568E38)
                r0 = 2130968650(0x7f04004a, float:1.754596E38)
                r1.<init>(r2, r0)
                return
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                android.ext.MainService r2 = r1.f260f
                r0 = 0
                r2.j(r0)
                return
        }
    }

    class l implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f262b;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f263a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.MainService.l f264b;

            a(android.ext.MainService.l r1, java.lang.String r2) {
                    r0 = this;
                    r0.f264b = r1
                    r0.f263a = r2
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r3, int r4) {
                    r2 = this;
                    r3 = -3
                    if (r4 == r3) goto L17
                    r3 = -1
                    if (r4 == r3) goto L7
                    goto L1c
                L7:
                    android.ext.MainService r3 = android.ext.MainService.instance
                    java.lang.String r4 = r2.f263a
                    r0 = 2131296271(0x7f09000f, float:1.8210454E38)
                    java.lang.String r0 = android.ext.Tools.N1(r0)
                    r1 = 0
                    r3.L(r1, r4, r0)
                    goto L1c
                L17:
                    java.lang.String r3 = r2.f263a
                    android.ext.Tools.z(r3)
                L1c:
                    return
            }
        }

        l(android.ext.MainService r1, long r2) {
                r0 = this;
                r0.f262b = r1
                r0.f261a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                long r0 = r7.f261a
                r2 = 0
                r3 = 2131296836(0x7f090244, float:1.82116E38)
                r4 = -1024(0xfffffffffffffc00, double:NaN)
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 >= 0) goto L48
                r4 = 0
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 > 0) goto L48
                android.app.AlertDialog$Builder r0 = android.ext.f.b()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r4 = 2131296269(0x7f09000d, float:1.821045E38)
                java.lang.String r4 = android.ext.b2.f(r4)
                r1.append(r4)
                r4 = 32
                r1.append(r4)
                long r4 = r7.f261a
                long r4 = -r4
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            L38:
                java.lang.String r1 = android.ext.b2.f(r3)
                android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
                android.app.AlertDialog r0 = r0.create()
                android.ext.f.m(r0)
                goto La3
            L48:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long r4 = r7.f261a
                r1 = 4
                java.lang.String r1 = android.ext.c.G(r4, r1)
                r0.append(r1)
                r1 = 104(0x68, float:1.46E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.ext.MainService$l$a r1 = new android.ext.MainService$l$a
                r1.<init>(r7, r0)
                r4 = 1
                android.ext.y0.b(r0, r4)
                android.app.AlertDialog$Builder r4 = android.ext.f.b()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r6 = 2131296271(0x7f09000f, float:1.8210454E38)
                java.lang.String r6 = android.ext.Tools.N1(r6)
                r5.append(r6)
                java.lang.String r6 = ": "
                r5.append(r6)
                r5.append(r0)
                java.lang.String r0 = r5.toString()
                android.app.AlertDialog$Builder r0 = r4.setMessage(r0)
                r4 = 2131296514(0x7f090102, float:1.8210947E38)
                java.lang.String r4 = android.ext.b2.f(r4)
                android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r4, r1)
                r4 = 2131296338(0x7f090052, float:1.821059E38)
                java.lang.String r4 = android.ext.b2.f(r4)
                android.app.AlertDialog$Builder r0 = r0.setNeutralButton(r4, r1)
                goto L38
            La3:
                return
        }
    }

    private class l0 extends android.ext.p1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f265f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f266g;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.MainService.l0 f267a;

            a(android.ext.MainService.l0 r1) {
                    r0 = this;
                    r0.f267a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r1, int r2) {
                    r0 = this;
                    android.ext.MainService$l0 r1 = r0.f267a
                    r1.f265f = r2
                    r1.i()
                    return
            }
        }

        public l0(android.ext.MainService r2) {
                r1 = this;
                r1.f266g = r2
                r2 = 2131296428(0x7f0900ac, float:1.8210772E38)
                r0 = 2130968606(0x7f04001e, float:1.754587E38)
                r1.<init>(r2, r0)
                r2 = 0
                r1.f265f = r2
                return
        }

        l0(android.ext.MainService r1, int r2, int r3) {
                r0 = this;
                r0.f266g = r1
                r0.<init>(r2, r3)
                r1 = 0
                r0.f265f = r1
                return
        }

        void h(java.util.List r5, java.lang.Object r6) {
                r4 = this;
                int r6 = r5.size()
                android.ext.h2[] r0 = new android.ext.h2[r6]
                r1 = 0
            L7:
                if (r1 >= r6) goto L21
                java.lang.Object r2 = r5.get(r1)
                android.ext.c r2 = (android.ext.c) r2
                boolean r3 = r2 instanceof android.ext.h2
                if (r3 == 0) goto L16
                android.ext.h2 r2 = (android.ext.h2) r2
                goto L1c
            L16:
                android.ext.h2 r3 = new android.ext.h2
                r3.<init>(r2)
                r2 = r3
            L1c:
                r0[r1] = r2
                int r1 = r1 + 1
                goto L7
            L21:
                android.ext.c1 r5 = new android.ext.c1
                android.ext.MainService r6 = r4.f266g
                android.ext.z1$d r6 = r6.v0
                r5.<init>(r6, r0)
                r6 = 1
                r5.f694g = r6
                return
        }

        void i() {
                r10 = this;
                android.ext.MainService r0 = r10.f266g
                java.lang.Object r0 = r0.z()
                int r1 = android.ext.Tools.L0(r0)
                if (r1 != 0) goto L13
                r0 = 2131296822(0x7f090236, float:1.8211572E38)
                android.ext.Tools.H1(r0)
                return
            L13:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                boolean r2 = r0 instanceof boolean[]
                r3 = 0
                if (r2 == 0) goto L78
                int r2 = r10.f265f
                if (r2 != 0) goto L48
                android.util.SparseIntArray r6 = new android.util.SparseIntArray
                r6.<init>()
                android.ext.MainService r1 = r10.f266g
                android.ext.n1 r1 = r1.N
                boolean[] r0 = (boolean[]) r0
                int r0 = r1.q(r0, r6)
                a.e r5 = android.ext.c.o(r0)
                android.ext.u2 r4 = new android.ext.u2
                java.lang.String r7 = "0"
                r0 = 2131297030(0x7f090306, float:1.8211993E38)
                java.lang.String r8 = android.ext.b2.f(r0)
                android.ext.MainService$l0$a r9 = new android.ext.MainService$l0$a
                r9.<init>(r10)
                r4.<init>(r5, r6, r7, r8, r9)
                return
            L48:
                android.ext.MainService r2 = r10.f266g
                android.ext.n1 r2 = r2.N
                r4 = r0
                boolean[] r4 = (boolean[]) r4
                int r5 = r4.length
                r6 = 1
                int r5 = r5 - r6
            L52:
                if (r6 >= r5) goto L75
                boolean r7 = r4[r6]
                if (r7 != 0) goto L59
                goto L72
            L59:
                java.lang.Object r7 = r2.getItem(r6)
                boolean r8 = r7 instanceof android.ext.c
                if (r8 != 0) goto L62
                goto L72
            L62:
                android.ext.c r7 = (android.ext.c) r7
                int r8 = r10.f265f
                r7.f674c = r8
                boolean r8 = r7.V()
                if (r8 != 0) goto L6f
                goto L72
            L6f:
                r1.add(r7)
            L72:
                int r6 = r6 + 1
                goto L52
            L75:
                r10.f265f = r3
                goto Lbc
            L78:
                boolean r2 = r0 instanceof d.a
                if (r2 == 0) goto L97
                r2 = r0
                d.a r2 = (d.a) r2
                int r4 = r2.i()
            L83:
                if (r3 >= r4) goto Lbc
                boolean r5 = r2.c(r3)
                if (r5 != 0) goto L8c
                goto L94
            L8c:
                r5 = 0
                android.ext.c r5 = r2.f(r3, r5)
                r1.add(r5)
            L94:
                int r3 = r3 + 1
                goto L83
            L97:
                boolean r2 = r0 instanceof d.e
                if (r2 == 0) goto Lbc
                r2 = r0
                d.e r2 = (d.e) r2
                int r4 = r2.l()
            La2:
                if (r3 >= r4) goto Lbc
                boolean r5 = r2.a(r3)
                if (r5 != 0) goto Lab
                goto Lb9
            Lab:
                java.lang.Object r5 = r2.n(r3)
                android.ext.h2 r5 = (android.ext.h2) r5
                boolean r6 = r5 instanceof android.ext.h2
                if (r6 != 0) goto Lb6
                goto Lb9
            Lb6:
                r1.add(r5)
            Lb9:
                int r3 = r3 + 1
                goto La2
            Lbc:
                r10.h(r1, r0)
                return
        }

        void j() {
                r1 = this;
                r0 = 0
                r1.f265f = r0
                r1.i()
                return
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                r0.j()
                return
        }
    }

    class m implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.widget.ListAdapter[] f268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.p1[][] f269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f270c;

        class a extends android.ext.ArrayAdapter {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.MainService.m f271b;

            a(android.ext.MainService.m r1, android.content.Context r2, android.ext.p1[] r3) {
                    r0 = this;
                    r0.f271b = r1
                    r0.<init>(r2, r3)
                    return
            }

            @Override // android.ext.ArrayAdapter, android.widget.ArrayAdapter, android.widget.Adapter
            public android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
                    r0 = this;
                    android.view.View r1 = super.getView(r1, r2, r3)
                    r2 = 16908308(0x1020014, float:2.3877285E-38)
                    android.view.View r2 = r1.findViewById(r2)
                    android.widget.TextView r2 = (android.widget.TextView) r2
                    if (r2 == 0) goto L15
                    r3 = 2131361799(0x7f0a0007, float:1.834336E38)
                    android.ext.Tools.D1(r2, r3)
                L15:
                    return r1
            }
        }

        class b implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f272a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.MainService.m f273b;

            b(android.ext.MainService.m r1, int r2) {
                    r0 = this;
                    r0.f273b = r1
                    r0.f272a = r2
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r4, int r5) {
                    r3 = this;
                    android.ext.MainService$m r0 = r3.f273b
                    android.ext.p1[][] r1 = r0.f269b
                    int r2 = r3.f272a
                    r1 = r1[r2]
                    r5 = r1[r5]
                    android.ext.MainService r0 = r0.f270c
                    android.view.View r0 = r0.J
                    r5.e(r0)
                    android.ext.Tools.D(r4)
                    return
            }
        }

        m(android.ext.MainService r1, android.ext.p1[][] r2) {
                r0 = this;
                r0.f270c = r1
                r0.f269b = r2
                r0.<init>()
                int r1 = r2.length
                android.widget.ListAdapter[] r1 = new android.widget.ListAdapter[r1]
                r0.f268a = r1
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r5) {
                r4 = this;
                android.ext.MainService r5 = r4.f270c
                android.view.View r5 = r5.f0
                int r5 = r5.getId()
                r0 = 2131034319(0x7f0500cf, float:1.7679152E38)
                if (r5 == r0) goto L2e
                r0 = 2131034389(0x7f050115, float:1.7679294E38)
                if (r5 == r0) goto L23
                r0 = 2131034395(0x7f05011b, float:1.7679306E38)
                if (r5 == r0) goto L18
                return
            L18:
                java.lang.String r5 = "kwws=22jdphjxdugldq1qhw2grzqordg"
                r0 = 11
                char r5 = r5.charAt(r0)
                int r5 = 106 - r5
                goto L38
            L23:
                java.lang.String r5 = "kwws=22jdphjxdugldq1qhw2iruxp2wrslf25<;940grqdwh2"
                r0 = 13
                char r5 = r5.charAt(r0)
                int r5 = 101 - r5
                goto L38
            L2e:
                java.lang.String r5 = "kwws=22jdphjxdugldq1qhw2khos2"
                r0 = 20
                char r5 = r5.charAt(r0)
                int r5 = 115 - r5
            L38:
                android.widget.ListAdapter[] r0 = r4.f268a
                r1 = r0[r5]
                if (r1 != 0) goto L4b
                android.ext.MainService$m$a r1 = new android.ext.MainService$m$a
                android.content.Context r2 = android.ext.MainService.context
                android.ext.p1[][] r3 = r4.f269b
                r3 = r3[r5]
                r1.<init>(r4, r2, r3)
                r0[r5] = r1
            L4b:
                android.content.Context r0 = android.ext.Tools.k0()
                android.app.AlertDialog$Builder r0 = android.ext.f.c(r0)
                android.widget.ListAdapter[] r1 = r4.f268a
                r1 = r1[r5]
                android.ext.MainService$m$b r2 = new android.ext.MainService$m$b
                r2.<init>(r4, r5)
                android.app.AlertDialog$Builder r5 = r0.setAdapter(r1, r2)
                android.ext.f.o(r5)
                return
        }
    }

    private class m0 extends android.ext.p1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f274f;

        public m0(android.ext.MainService r2) {
                r1 = this;
                r1.f274f = r2
                r2 = 2131296718(0x7f0901ce, float:1.821136E38)
                r0 = 2130968649(0x7f040049, float:1.7545958E38)
                r1.<init>(r2, r0)
                return
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                android.ext.MainService r2 = r1.f274f
                r0 = 2
                r2.j(r0)
                return
        }
    }

    class n extends android.database.DataSetObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f275a;

        n(android.ext.MainService r1) {
                r0 = this;
                r0.f275a = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r1 = this;
                super.onChanged()
                android.ext.MainService r0 = r1.f275a
                r0.k1()
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r1 = this;
                super.onInvalidated()
                android.ext.MainService r0 = r1.f275a
                r0.k1()
                return
        }
    }

    private class n0 extends android.ext.MainService.o0 {
        final /* synthetic */ android.ext.MainService i;

        public n0(android.ext.MainService r3) {
                r2 = this;
                r2.i = r3
                r0 = 2131296317(0x7f09003d, float:1.8210547E38)
                r1 = 2130968645(0x7f040045, float:1.754595E38)
                r2.<init>(r3, r0, r1)
                return
        }

        @Override // android.ext.MainService.l0
        void i() {
                r2 = this;
                android.ext.MainService r0 = r2.i
                android.ext.d r0 = r0.u0
                int r1 = r0.e()
                if (r1 != 0) goto L15
                r0 = 2131296318(0x7f09003e, float:1.821055E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.ext.Tools.J1(r0)
                return
            L15:
                java.util.List r0 = r0.b()
                r1 = 0
                r2.h(r0, r1)
                return
        }
    }

    class o implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f276a;

        o(android.ext.MainService r1) {
                r0 = this;
                r0.f276a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.MainService r0 = r4.f276a     // Catch: java.lang.Throwable -> Le
                android.view.View r1 = r0.f0     // Catch: java.lang.Throwable -> Le
                android.view.View r2 = r0.a0     // Catch: java.lang.Throwable -> Le
                if (r1 != r2) goto L14
                android.ext.SavedListAdapter r0 = r0.t0     // Catch: java.lang.Throwable -> Le
                r0.i()     // Catch: java.lang.Throwable -> Le
                goto L14
            Le:
                r0 = move-exception
                java.lang.String r1 = "Failed update saved list"
                android.ext.e1.l(r1, r0)
            L14:
                int r0 = android.ext.Config.n     // Catch: java.lang.Throwable -> L26
                if (r0 > 0) goto L1a
                r0 = 1000(0x3e8, float:1.401E-42)
            L1a:
                android.os.Handler r1 = android.ext.n2.d()     // Catch: java.lang.Throwable -> L26
                r1.removeCallbacks(r4)     // Catch: java.lang.Throwable -> L26
                long r2 = (long) r0     // Catch: java.lang.Throwable -> L26
                r1.postDelayed(r4, r2)     // Catch: java.lang.Throwable -> L26
                goto L2c
            L26:
                r0 = move-exception
                java.lang.String r1 = "Failed post timer"
                android.ext.e1.s(r1, r0)
            L2c:
                return
        }
    }

    private class o0 extends android.ext.MainService.l0 {
        final /* synthetic */ android.ext.MainService h;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.MainService.o0 f277a;

            a(android.ext.MainService.o0 r1) {
                    r0 = this;
                    r0.f277a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r1, int r2) {
                    r0 = this;
                    android.ext.MainService$o0 r1 = r0.f277a
                    r1.j()
                    return
            }
        }

        public o0(android.ext.MainService r3) {
                r2 = this;
                r2.h = r3
                r0 = 2131296952(0x7f0902b8, float:1.8211835E38)
                r1 = 2130968647(0x7f040047, float:1.7545954E38)
                r2.<init>(r3, r0, r1)
                return
        }

        o0(android.ext.MainService r1, int r2, int r3) {
                r0 = this;
                r0.h = r1
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // android.ext.MainService.l0
        void h(java.util.List r7, java.lang.Object r8) {
                r6 = this;
                int r0 = r7.size()
                r1 = 0
                if (r0 != 0) goto Ld
                android.ext.MainService r7 = r6.h
                r7.n(r1)
                goto L56
            Ld:
                android.ext.MainService r0 = r6.h
                boolean r0 = r0.a1()
                if (r0 == 0) goto L57
                android.ext.MainService r0 = r6.h
                long r2 = r0.p0
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 == 0) goto L24
                android.ext.MainService r0 = r6.h
                r0.n(r1)
            L24:
                android.ext.MainService r0 = r6.h
                r0.q0 = r1
                android.ext.f0 r0 = r0.i
                r0.x0(r1)
                android.ext.MainService r0 = r6.h
                r0.R(r1)
                android.ext.MainService r0 = r6.h
                r0.r0 = r1
                android.ext.f0 r0 = r0.i
                r0.f0(r1, r7)
                android.ext.MainService r7 = r6.h
                android.widget.TabHost r7 = r7.m
                r0 = 1
                r7.setCurrentTab(r0)
                boolean r7 = r8 instanceof d.a
                if (r7 != 0) goto L4b
                boolean r8 = r8 instanceof d.e
                if (r8 == 0) goto L56
            L4b:
                android.ext.MainService r8 = r6.h
                android.ext.c2 r8 = r8.f216f
                if (r8 == 0) goto L56
                if (r7 == 0) goto L56
                android.ext.b0.n(r8, r0)
            L56:
                return
            L57:
                java.lang.NumberFormatException r7 = new java.lang.NumberFormatException
                r8 = 2131296305(0x7f090031, float:1.8210523E38)
                java.lang.String r8 = android.ext.b2.f(r8)
                r7.<init>(r8)
                throw r7
        }

        @Override // android.ext.MainService.l0, android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View r5) {
                r4 = this;
                android.ext.MainService r5 = r4.h
                long r0 = r5.p0
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 != 0) goto Le
                r4.j()
                goto L3c
            Le:
                android.app.AlertDialog$Builder r5 = android.ext.f.b()
                r0 = 2131296326(0x7f090046, float:1.8210566E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r5 = r5.setMessage(r0)
                r0 = 2131297115(0x7f09035b, float:1.8212166E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.ext.MainService$o0$a r1 = new android.ext.MainService$o0$a
                r1.<init>(r4)
                android.app.AlertDialog$Builder r5 = r5.setPositiveButton(r0, r1)
                r0 = 2131296805(0x7f090225, float:1.8211537E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                r1 = 0
                android.app.AlertDialog$Builder r5 = r5.setNegativeButton(r0, r1)
                android.ext.f.o(r5)
            L3c:
                return
        }
    }

    class p implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f278a;

        p(android.ext.MainService r1) {
                r0 = this;
                r0.f278a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.ext.MainService r0 = r1.f278a
                r0.E0()
                return
        }
    }

    class p0 extends android.ext.p1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f279f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f280g;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f281a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ java.lang.Object f282b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ android.ext.MainService.p0 f283c;

            /* JADX INFO: renamed from: android.ext.MainService$p0$a$a, reason: collision with other inner class name */
            class DialogInterfaceOnClickListenerC0010a implements android.content.DialogInterface.OnClickListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ android.ext.MainService.p0.a f284a;

                DialogInterfaceOnClickListenerC0010a(android.ext.MainService.p0.a r1) {
                        r0 = this;
                        r0.f284a = r1
                        r0.<init>()
                        return
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface r1, int r2) {
                        r0 = this;
                        android.ext.MainService$p0$a r1 = r0.f284a
                        android.ext.MainService$p0 r1 = r1.f283c
                        boolean r2 = r1.f279f
                        android.ext.MainService r1 = r1.f280g
                        if (r2 == 0) goto L10
                        android.ext.SavedListAdapter r1 = r1.t0
                        r1.c()
                        goto L13
                    L10:
                        r1.m()
                    L13:
                        android.ext.MainService r1 = android.ext.MainService.instance
                        android.ext.c2 r1 = r1.f216f
                        if (r1 == 0) goto L29
                        android.ext.MainService$p0$a r2 = r0.f284a
                        android.ext.MainService$p0 r2 = r2.f283c
                        boolean r2 = r2.f279f
                        if (r2 == 0) goto L24
                        java.lang.String r2 = "\ngg.clearList()\n"
                        goto L26
                    L24:
                        java.lang.String r2 = "\ngg.clearResults()\n"
                    L26:
                        r1.write(r2)
                    L29:
                        return
                }
            }

            class b implements java.lang.Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ android.content.DialogInterface f285a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ android.ext.MainService.p0.a f286b;

                b(android.ext.MainService.p0.a r1, android.content.DialogInterface r2) {
                        r0 = this;
                        r0.f286b = r1
                        r0.f285a = r2
                        r0.<init>()
                        return
                }

                @Override // java.lang.Runnable
                public void run() {
                        r1 = this;
                        android.content.DialogInterface r0 = r1.f285a
                        android.app.AlertDialog r0 = (android.app.AlertDialog) r0
                        android.ext.f.m(r0)
                        return
                }
            }

            a(android.ext.MainService.p0 r1, int r2, java.lang.Object r3) {
                    r0 = this;
                    r0.f283c = r1
                    r0.f281a = r2
                    r0.f282b = r3
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r4, int r5) {
                    r3 = this;
                    r0 = 2
                    if (r5 <= r0) goto Le
                    int r1 = r3.f281a
                    if (r1 != 0) goto Le
                    r4 = 2131296822(0x7f090236, float:1.8211572E38)
                    android.ext.Tools.H1(r4)
                    return
                Le:
                    r1 = 0
                    if (r5 == 0) goto L3c
                    r2 = 1
                    if (r5 == r2) goto L2d
                    if (r5 == r0) goto L1a
                    r4 = 3
                    if (r5 == r4) goto L23
                    goto L69
                L1a:
                    android.ext.MainService$p0 r4 = r3.f283c
                    android.ext.MainService r4 = r4.f280g
                    java.lang.Object r5 = r3.f282b
                    r4.L0(r5, r1)
                L23:
                    android.ext.MainService$p0 r4 = r3.f283c
                    android.ext.MainService r4 = r4.f280g
                    java.lang.Object r5 = r3.f282b
                    r4.H0(r5)
                    goto L69
                L2d:
                    android.os.Handler r5 = android.ext.n2.d()
                    android.ext.MainService$p0$a$b r0 = new android.ext.MainService$p0$a$b
                    r0.<init>(r3, r4)
                    r1 = 1000(0x3e8, double:4.94E-321)
                    r5.postDelayed(r0, r1)
                    goto L69
                L3c:
                    android.app.AlertDialog$Builder r4 = android.ext.f.b()
                    r5 = 2131296896(0x7f090280, float:1.8211722E38)
                    android.view.View r5 = android.ext.Tools.g0(r5)
                    android.app.AlertDialog$Builder r4 = r4.setCustomTitle(r5)
                    r5 = 2131297115(0x7f09035b, float:1.8212166E38)
                    java.lang.String r5 = android.ext.b2.f(r5)
                    android.ext.MainService$p0$a$a r0 = new android.ext.MainService$p0$a$a
                    r0.<init>(r3)
                    android.app.AlertDialog$Builder r4 = r4.setPositiveButton(r5, r0)
                    r5 = 2131296805(0x7f090225, float:1.8211537E38)
                    java.lang.String r5 = android.ext.b2.f(r5)
                    android.app.AlertDialog$Builder r4 = r4.setNegativeButton(r5, r1)
                    android.ext.f.o(r4)
                L69:
                    return
            }
        }

        public p0(android.ext.MainService r2, boolean r3) {
                r1 = this;
                r1.f280g = r2
                r2 = 2131296895(0x7f09027f, float:1.821172E38)
                r0 = 2130968603(0x7f04001b, float:1.7545864E38)
                r1.<init>(r2, r0)
                r1.f279f = r3
                return
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View r7) {
                r6 = this;
                android.ext.MainService r7 = r6.f280g
                java.lang.Object r7 = r7.z()
                int r0 = android.ext.Tools.L0(r7)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = " ("
                r1.append(r2)
                r1.append(r0)
                r2 = 41
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = 2131296896(0x7f090280, float:1.8211722E38)
                java.lang.String r2 = android.ext.b2.f(r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r4 = 2131296909(0x7f09028d, float:1.8211748E38)
                java.lang.String r4 = android.ext.b2.f(r4)
                r3.append(r4)
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r5 = 2131296895(0x7f09027f, float:1.821172E38)
                java.lang.String r5 = android.ext.b2.f(r5)
                r4.append(r5)
                r4.append(r1)
                java.lang.String r1 = r4.toString()
                java.lang.String r4 = "---"
                java.lang.String[] r1 = new java.lang.String[]{r2, r4, r3, r1}
                android.app.AlertDialog$Builder r2 = android.ext.f.b()
                android.ext.MainService$p0$a r3 = new android.ext.MainService$p0$a
                r3.<init>(r6, r0, r7)
                android.app.AlertDialog$Builder r7 = r2.setItems(r1, r3)
                r0 = 2131296311(0x7f090037, float:1.8210535E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                r1 = 0
                android.app.AlertDialog$Builder r7 = r7.setNegativeButton(r0, r1)
                android.ext.f.o(r7)
                return
        }
    }

    class q implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f287a;

        q(android.ext.MainService r1) {
                r0 = this;
                r0.f287a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.ext.MainService r1 = r0.f287a
                r1.P()
                return
        }
    }

    class q0 extends android.ext.p1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f288f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f289g;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.MainService.q0 f290a;

            a(android.ext.MainService.q0 r1) {
                    r0 = this;
                    r0.f290a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r1, int r2) {
                    r0 = this;
                    android.ext.MainService$q0 r1 = r0.f290a
                    r1.f288f = r2
                    r1.h()
                    return
            }
        }

        class b implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.d f291a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.MainService.q0 f292b;

            b(android.ext.MainService.q0 r1, android.ext.d r2) {
                    r0 = this;
                    r0.f292b = r1
                    r0.f291a = r2
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r1, int r2) {
                    r0 = this;
                    android.ext.d r1 = r0.f291a
                    r1.d()
                    android.ext.MainService r1 = android.ext.MainService.instance
                    android.ext.c2 r1 = r1.f216f
                    if (r1 == 0) goto L10
                    java.lang.String r2 = "if revert ~= nil then gg.setValues(revert) end\n"
                    r1.write(r2)
                L10:
                    return
            }
        }

        public q0(android.ext.MainService r2) {
                r1 = this;
                r1.f289g = r2
                r2 = 2131296911(0x7f09028f, float:1.8211752E38)
                r0 = 2130968658(0x7f040052, float:1.7545976E38)
                r1.<init>(r2, r0)
                r2 = 0
                r1.f288f = r2
                return
        }

        void h() {
                r22 = this;
                r0 = r22
                android.ext.MainService r1 = r0.f289g
                java.lang.Object r1 = r1.z()
                android.ext.d r8 = new android.ext.d
                r8.<init>()
                android.ext.MainService r2 = r0.f289g
                android.ext.d r9 = r2.u0
                android.ext.d$a r10 = new android.ext.d$a
                r10.<init>()
                boolean r2 = r1 instanceof boolean[]
                r11 = 0
                r12 = 1
                if (r2 == 0) goto L93
                int r2 = r0.f288f
                if (r2 != 0) goto L4f
                android.util.SparseIntArray r15 = new android.util.SparseIntArray
                r15.<init>()
                android.ext.MainService r2 = r0.f289g
                android.ext.n1 r2 = r2.N
                boolean[] r1 = (boolean[]) r1
                int r1 = r2.q(r1, r15)
                a.e r14 = android.ext.c.o(r1)
                int r1 = r15.size()
                if (r1 <= 0) goto L98
                android.ext.u2 r13 = new android.ext.u2
                java.lang.String r16 = "0"
                r1 = 2131297030(0x7f090306, float:1.8211993E38)
                java.lang.String r17 = android.ext.b2.f(r1)
                android.ext.MainService$q0$a r1 = new android.ext.MainService$q0$a
                r1.<init>(r0)
                r18 = r1
                r13.<init>(r14, r15, r16, r17, r18)
                return
            L4f:
                android.ext.MainService r2 = r0.f289g
                android.ext.n1 r13 = r2.N
                boolean[] r1 = (boolean[]) r1
                int r2 = r1.length
                int r14 = r2 + (-1)
                r15 = 1
            L59:
                if (r15 >= r14) goto L90
                boolean r2 = r1[r15]
                if (r2 != 0) goto L60
                goto L8d
            L60:
                android.ext.c r2 = new android.ext.c
                long r17 = r13.e(r15)
                r19 = 0
                int r3 = r0.f288f
                r16 = r2
                r21 = r3
                r16.<init>(r17, r19, r21)
                boolean r3 = r2.V()
                if (r3 != 0) goto L78
                goto L8d
            L78:
                long r3 = r2.f672a
                int r5 = r2.f674c
                r9.a(r3, r5, r10)
                boolean r3 = r10.f702b
                if (r3 == 0) goto L8d
                long r3 = r2.f672a
                int r5 = r2.f674c
                long r6 = r10.f701a
                r2 = r8
                r2.c(r3, r5, r6)
            L8d:
                int r15 = r15 + 1
                goto L59
            L90:
                r0.f288f = r11
                goto L98
            L93:
                android.ext.MainService r2 = r0.f289g
                r2.L0(r1, r8)
            L98:
                int r1 = r8.e()
                if (r1 != 0) goto La5
                r1 = 2131296823(0x7f090237, float:1.8211574E38)
                android.ext.Tools.H1(r1)
                goto Lea
            La5:
                android.app.AlertDialog$Builder r2 = android.ext.f.b()
                r3 = 2131296911(0x7f09028f, float:1.8211752E38)
                android.view.View r3 = android.ext.Tools.g0(r3)
                android.app.AlertDialog$Builder r2 = r2.setCustomTitle(r3)
                r3 = 2131296910(0x7f09028e, float:1.821175E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                java.lang.Object[] r4 = new java.lang.Object[r12]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r4[r11] = r1
                java.lang.String r1 = android.ext.Tools.L1(r3, r4)
                android.app.AlertDialog$Builder r1 = r2.setMessage(r1)
                r2 = 2131297115(0x7f09035b, float:1.8212166E38)
                java.lang.String r2 = android.ext.b2.f(r2)
                android.ext.MainService$q0$b r3 = new android.ext.MainService$q0$b
                r3.<init>(r0, r8)
                android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r3)
                r2 = 2131296805(0x7f090225, float:1.8211537E38)
                java.lang.String r2 = android.ext.b2.f(r2)
                r3 = 0
                android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r2, r3)
                android.ext.f.o(r1)
            Lea:
                return
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                r1 = 0
                r0.f288f = r1
                r0.h()
                return
        }
    }

    class r implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f293a;

        r(android.ext.MainService r1) {
                r0 = this;
                r0.f293a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.ext.MainService r1 = r0.f293a
                r1.O()
                return
        }
    }

    class r0 extends android.ext.p1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f294f;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.Object f295a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f296b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ android.ext.MainService.r0 f297c;

            a(android.ext.MainService.r0 r1, java.lang.Object r2, int r3) {
                    r0 = this;
                    r0.f297c = r1
                    r0.f295a = r2
                    r0.f296b = r3
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r17, int r18) {
                    r16 = this;
                    r0 = r16
                    android.ext.MainService$r0 r1 = r0.f297c
                    android.ext.MainService r1 = r1.f294f
                    android.ext.n1 r1 = r1.N
                    java.lang.Object r2 = r0.f295a
                    boolean[] r2 = (boolean[]) r2
                    int r3 = r2.length
                    r4 = 1
                    int r3 = r3 - r4
                    r5 = 1
                L10:
                    r6 = 0
                    if (r5 >= r3) goto L53
                    boolean r7 = r2[r5]
                    if (r7 == 0) goto L50
                    long r14 = r1.e(r5)
                    android.ext.h2 r7 = new android.ext.h2
                    r11 = 0
                    r8 = r7
                    r9 = r14
                    r13 = r18
                    r8.<init>(r9, r11, r13)
                    boolean r8 = r7.V()
                    if (r8 != 0) goto L34
                    long r8 = r7.f672a
                    int r8 = android.ext.c.S(r8, r4)
                    r7.f674c = r8
                L34:
                    android.ext.MainService$r0 r8 = r0.f297c
                    android.ext.MainService r8 = r8.f294f
                    android.ext.SavedListAdapter r8 = r8.t0
                    android.ext.h2 r8 = r8.e(r14)
                    if (r8 == 0) goto L47
                    int r8 = r8.f674c
                    int r9 = r7.f674c
                    if (r8 != r9) goto L47
                    goto L50
                L47:
                    android.ext.MainService$r0 r8 = r0.f297c
                    android.ext.MainService r8 = r8.f294f
                    android.ext.SavedListAdapter r8 = r8.t0
                    r8.b(r7, r6, r6)
                L50:
                    int r5 = r5 + 1
                    goto L10
                L53:
                    android.ext.MainService$r0 r1 = r0.f297c
                    android.ext.MainService r1 = r1.f294f
                    android.ext.SavedListAdapter r1 = r1.t0
                    r1.notifyDataSetChanged()
                    android.ext.MainService$r0 r1 = r0.f297c
                    android.ext.MainService r1 = r1.f294f
                    android.ext.SavedListAdapter r1 = r1.t0
                    r1.i()
                    r1 = 2131296721(0x7f0901d1, float:1.8211367E38)
                    java.lang.String r1 = android.ext.b2.f(r1)
                    java.lang.Object[] r2 = new java.lang.Object[r4]
                    int r3 = r0.f296b
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r2[r6] = r3
                    java.lang.String r1 = android.ext.Tools.L1(r1, r2)
                    android.ext.Tools.J1(r1)
                    return
            }
        }

        public r0(android.ext.MainService r2) {
                r1 = this;
                r1.f294f = r2
                r2 = 2131296920(0x7f090298, float:1.821177E38)
                r0 = 2130968600(0x7f040018, float:1.7545858E38)
                r1.<init>(r2, r0)
                return
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View r9) {
                r8 = this;
                android.ext.MainService r9 = r8.f294f
                java.lang.Object r9 = r9.z()
                int r0 = android.ext.Tools.L0(r9)
                if (r0 != 0) goto L14
                r9 = 2131296822(0x7f090236, float:1.8211572E38)
                android.ext.Tools.H1(r9)
                goto Ld2
            L14:
                boolean r1 = r9 instanceof boolean[]
                if (r1 == 0) goto L41
                android.util.SparseIntArray r4 = new android.util.SparseIntArray
                r4.<init>()
                android.ext.MainService r1 = r8.f294f
                android.ext.n1 r1 = r1.N
                r2 = r9
                boolean[] r2 = (boolean[]) r2
                int r1 = r1.q(r2, r4)
                a.e r3 = android.ext.c.o(r1)
                android.ext.u2 r2 = new android.ext.u2
                java.lang.String r5 = "0"
                r1 = 2131297030(0x7f090306, float:1.8211993E38)
                java.lang.String r6 = android.ext.b2.f(r1)
                android.ext.MainService$r0$a r7 = new android.ext.MainService$r0$a
                r7.<init>(r8, r9, r0)
                r2.<init>(r3, r4, r5, r6, r7)
                goto Ld2
            L41:
                boolean r1 = r9 instanceof d.a
                if (r1 == 0) goto Ld2
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                d.a r9 = (d.a) r9
                int r2 = r9.i()
                r3 = 0
                r4 = 0
            L52:
                if (r4 >= r2) goto L65
                boolean r5 = r9.c(r4)
                if (r5 == 0) goto L62
                r5 = 0
                android.ext.c r5 = r9.f(r4, r5)
                r1.add(r5)
            L62:
                int r4 = r4 + 1
                goto L52
            L65:
                java.util.Iterator r9 = r1.iterator()
            L69:
                boolean r1 = r9.hasNext()
                if (r1 == 0) goto L95
                java.lang.Object r1 = r9.next()
                android.ext.c r1 = (android.ext.c) r1
                android.ext.MainService r2 = r8.f294f
                android.ext.SavedListAdapter r2 = r2.t0
                long r4 = r1.f672a
                android.ext.h2 r2 = r2.e(r4)
                if (r2 == 0) goto L88
                int r2 = r2.f674c
                int r4 = r1.f674c
                if (r2 != r4) goto L88
                goto L69
            L88:
                android.ext.MainService r2 = r8.f294f
                android.ext.SavedListAdapter r2 = r2.t0
                android.ext.h2 r4 = new android.ext.h2
                r4.<init>(r1)
                r2.b(r4, r3, r3)
                goto L69
            L95:
                android.ext.MainService r9 = r8.f294f
                android.ext.SavedListAdapter r9 = r9.t0
                r9.notifyDataSetChanged()
                android.ext.MainService r9 = r8.f294f
                android.ext.SavedListAdapter r9 = r9.t0
                r9.i()
                r9 = 2131296721(0x7f0901d1, float:1.8211367E38)
                java.lang.String r9 = android.ext.b2.f(r9)
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2[r3] = r0
                java.lang.String r9 = android.ext.Tools.L1(r9, r2)
                android.ext.Tools.J1(r9)
                android.ext.MainService r9 = android.ext.MainService.instance
                android.ext.c2 r9 = r9.f216f
                if (r9 == 0) goto Ld2
                java.lang.String r0 = "\nlocal t = "
                r9.write(r0)
                android.ext.b0.n(r9, r1)
                java.lang.String r0 = "gg.addListItems(t)\n"
                r9.write(r0)
                java.lang.String r0 = "t = nil\n\n"
                r9.write(r0)
            Ld2:
                return
        }
    }

    class s implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f298a;

        s(android.ext.MainService r1) {
                r0 = this;
                r0.f298a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.ext.MainService r0 = r2.f298a
                r1 = 0
                r0.onLongClick(r1)
                return
        }
    }

    private class s0 extends android.ext.p1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f299f;

        public s0(android.ext.MainService r2) {
                r1 = this;
                r1.f299f = r2
                r2 = 2131296948(0x7f0902b4, float:1.8211827E38)
                r0 = 2130968648(0x7f040048, float:1.7545956E38)
                r1.<init>(r2, r0)
                return
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                android.ext.MainService r2 = r1.f299f
                r0 = 1
                r2.j(r0)
                return
        }
    }

    class t implements android.content.ComponentCallbacks2 {
        t() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(android.content.res.Configuration r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ComponentCallbacks2 onConfigurationChanged: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                android.ext.e1.d(r0)
                android.content.res.Configuration r3 = a.b.f(r3)
                android.ext.MainService.Y(r3)
                return
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
                r1 = this;
                java.lang.String r0 = "ComponentCallbacks2 onLowMemory"
                android.ext.e1.d(r0)
                r0 = -1
                android.ext.MainService.t0(r0)
                return
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ComponentCallbacks2 onTrimMemory: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                android.ext.e1.d(r0)
                android.ext.MainService.t0(r3)
                return
        }
    }

    class u implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f300a;

        u(android.ext.MainService r1) {
                r0 = this;
                r0.f300a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.ext.MainService r0 = r1.f300a
                r0.e()
                return
        }
    }

    class v implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.CharSequence f302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f303c;

        v(android.ext.MainService r1, java.lang.String r2, java.lang.CharSequence r3) {
                r0 = this;
                r0.f303c = r1
                r0.f301a = r2
                r0.f302b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.String r0 = r2.f301a
                if (r0 == 0) goto Lb
                android.ext.MainService r1 = r2.f303c
                android.widget.TextView r1 = r1.C
                r1.setText(r0)
            Lb:
                java.lang.CharSequence r0 = r2.f302b
                if (r0 == 0) goto L16
                android.ext.MainService r1 = r2.f303c
                android.widget.TextView r1 = r1.y
                r1.setText(r0)
            L16:
                android.ext.MainService r0 = r2.f303c
                android.view.View r0 = r0.x
                r1 = 8
                r0.setVisibility(r1)
                return
        }
    }

    class w implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f304a;

        w(android.ext.MainService r1) {
                r0 = this;
                r0.f304a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                r1 = 2131034215(0x7f050067, float:1.7678941E38)
                android.ext.Config$p r1 = android.ext.Config.b(r1)
                r2 = 1
                r1.f42d = r2
                android.ext.Config.k()
                android.ext.ConfigListAdapter.m()
                return
        }
    }

    class x implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f305a;

        x(android.ext.MainService r1) {
                r0 = this;
                r0.f305a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.ext.MainService r0 = r1.f305a
                android.ext.i1 r0 = r0.n
                if (r0 != 0) goto Lb
                android.ext.MainService r0 = r1.f305a
                r0.c0()
            Lb:
                return
        }
    }

    class y implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f306a;

        y(android.ext.MainService r1) {
                r0 = this;
                r0.f306a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.ext.MainService r1 = r0.f306a
                r2 = 1
                r1.q(r2)
                return
        }
    }

    class z implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.MainService f307a;

        z(android.ext.MainService r1) {
                r0 = this;
                r0.f307a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                r1 = 0
                android.ext.ConfigListAdapter.a(r1)
                return
        }
    }

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = android.ext.i.f1002d
            r0.append(r1)
            java.lang.String r1 = "_preferences"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.MainService.G0 = r0
            r0 = 0
            android.ext.MainService.instance = r0
            r1 = 0
            android.ext.MainService.H0 = r1
            android.ext.MainService.I0 = r1
            r2 = 3
            android.ext.p1[][] r3 = new android.ext.p1[r2][]
            android.ext.MainService.J0 = r3
            android.ext.MainService.K0 = r1
            r3 = 176(0xb0, float:2.47E-43)
            boolean[] r3 = new boolean[r3]
            android.ext.MainService.L0 = r3
            r3 = 76
            boolean[] r3 = new boolean[r3]
            android.ext.MainService.M0 = r3
            r3 = 0
        L31:
            boolean[] r4 = android.ext.MainService.M0
            int r5 = r4.length
            r6 = 2
            r7 = 1
            if (r3 >= r5) goto L43
            int r5 = r3 % 4
            if (r5 >= r6) goto L3d
            goto L3e
        L3d:
            r7 = 0
        L3e:
            r4[r3] = r7
            int r3 = r3 + 1
            goto L31
        L43:
            r3 = 0
        L44:
            boolean[] r4 = android.ext.MainService.L0
            int r5 = r4.length
            if (r3 >= r5) goto L55
            int r5 = r3 % 4
            if (r5 >= r6) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = 0
        L50:
            r4[r3] = r5
            int r3 = r3 + 1
            goto L44
        L55:
            r3 = 43
            r4 = 44
            r5 = 40
            int[] r3 = new int[]{r5, r3, r4}
            r4 = 0
        L60:
            if (r4 >= r2) goto L7a
            r5 = r3[r4]
            int r5 = r5 + (-1)
            boolean[] r6 = android.ext.MainService.L0
            int r5 = r5 * 4
            r6[r5] = r1
            int r8 = r5 + 1
            r6[r8] = r1
            int r8 = r5 + 2
            r6[r8] = r1
            int r5 = r5 + r2
            r6[r5] = r1
            int r4 = r4 + 1
            goto L60
        L7a:
            r2 = 127(0x7f, float:1.78E-43)
            android.ext.MainService.N0 = r2
            android.ext.MainService.O0 = r1
            android.ext.MainService.P0 = r7
            android.ext.MainService.Q0 = r0
            android.ext.MainService.R0 = r1
            android.ext.MainService.S0 = r7
            r0 = 0
            android.ext.MainService.T0 = r0
            return
    }

    public MainService(android.content.Context r6) {
            r5 = this;
            r5.<init>(r6)
            r0 = 0
            r5.f212b = r0
            r5.f213c = r0
            r5.f214d = r0
            r1 = 0
            r5.f215e = r1
            r5.f216f = r0
            r5.f217g = r0
            r5.k = r0
            r5.n = r0
            r5.R = r1
            r5.S = r1
            r5.T = r1
            r5.U = r1
            r2 = 1
            r5.j0 = r2
            r5.l0 = r1
            r5.m0 = r1
            r3 = 0
            r5.p0 = r3
            r5.q0 = r1
            r5.r0 = r2
            d.a r3 = new d.a
            r3.<init>()
            r5.s0 = r3
            android.ext.SavedListAdapter r3 = new android.ext.SavedListAdapter
            r3.<init>()
            r5.t0 = r3
            android.ext.d r3 = new android.ext.d
            r3.<init>()
            r5.u0 = r3
            r5.v0 = r0
            android.util.SparseBooleanArray r3 = new android.util.SparseBooleanArray
            r3.<init>()
            r5.w0 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.y0 = r3
            r3 = 3
            int[] r4 = new int[r3]
            r5.z0 = r4
            android.ext.MainService$o r4 = new android.ext.MainService$o
            r4.<init>(r5)
            r5.A0 = r4
            r5.B0 = r0
            r5.C0 = r2
            r5.D0 = r1
            r0 = 4
            android.ext.a3[] r0 = new android.ext.a3[r0]
            r5.E0 = r0
            r5.F0 = r1
            android.content.Context r0 = android.ext.MainService.context
            if (r0 != 0) goto L74
            android.content.Context r6 = android.ext.l2.i(r6)
            android.ext.MainService.context = r6
        L74:
            android.ext.MainService.instance = r5
            android.ext.Tools.o()
            android.ext.f0 r6 = new android.ext.f0
            r6.<init>()
            r5.i = r6
            android.fix.WrapLayout[] r6 = new android.fix.WrapLayout[r3]
            r5.D = r6
            return
    }

    public static android.content.ComponentCallbacks A() {
            android.content.ComponentCallbacks r0 = android.ext.MainService.Q0
            if (r0 != 0) goto Lb
            android.ext.MainService$t r0 = new android.ext.MainService$t
            r0.<init>()
            android.ext.MainService.Q0 = r0
        Lb:
            return r0
    }

    static int D() {
            android.ext.MainService r0 = android.ext.MainService.instance
            long r0 = r0.p0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Ld
            r0 = 127(0x7f, float:1.78E-43)
            goto Lf
        Ld:
            int r0 = android.ext.MainService.N0
        Lf:
            return r0
    }

    static int E() {
            android.ext.MainService r0 = android.ext.MainService.instance
            long r0 = r0.p0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L12
            int r0 = android.ext.MainService.N0
            int r1 = android.ext.MainService.O0
            r2 = r0 & r1
            if (r2 != r1) goto L14
        L12:
            int r0 = android.ext.MainService.O0
        L14:
            return r0
    }

    private void G0() {
            r2 = this;
            android.content.Context r0 = android.ext.MainService.context
            android.content.ComponentCallbacks r1 = A()
            r0.registerComponentCallbacks(r1)
            return
    }

    public static void I0() {
            android.app.AlertDialog$Builder r0 = android.ext.f.b()
            r1 = 2131296297(0x7f090029, float:1.8210507E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            r1 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            android.ext.f.o(r0)
            return
    }

    private void J0() {
            r2 = this;
            r2.z0()
            r0 = 1
            r2.q(r0)
            android.ext.d r1 = r2.u0
            r1.f()
            r2.j0 = r0
            android.widget.ImageView r0 = r2.q
            r1 = 4
            r0.setVisibility(r1)
            android.ext.d1 r0 = r2.k0
            r0.j()
            android.ext.HotPoint r0 = r2.j
            r0.q()
            android.util.SparseBooleanArray r0 = r2.w0
            r0.clear()
            android.ext.SavedListAdapter r0 = r2.t0
            r0.c()
            android.ext.f0 r0 = r2.i
            r0.k0()
            return
    }

    private void M() {
            r0 = this;
            return
    }

    private void M0(java.lang.Long r4, long r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L45
            android.widget.ListView r4 = r3.M
            int r4 = r4.getFirstVisiblePosition()
            android.widget.ListView r1 = r3.M
            int r1 = r1.getChildCount()
            r2 = 1
            if (r1 <= r2) goto L20
            android.widget.ListView r1 = r3.M
            android.view.View r1 = r1.getChildAt(r0)
            int r1 = r1.getTop()
            if (r1 >= 0) goto L20
            int r4 = r4 + 1
        L20:
            android.widget.ListView r1 = r3.M
            java.lang.Object r4 = r1.getItemAtPosition(r4)
            boolean r1 = r4 instanceof android.ext.v0
            if (r1 == 0) goto L36
            r1 = r4
            android.ext.v0 r1 = (android.ext.v0) r1
            long r1 = r1.b()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L37
        L36:
            r1 = 0
        L37:
            boolean r2 = r4 instanceof android.ext.c
            if (r2 == 0) goto L44
            android.ext.c r4 = (android.ext.c) r4
            long r1 = r4.f672a
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            goto L45
        L44:
            r4 = r1
        L45:
            if (r4 == 0) goto L86
            long r1 = r4.longValue()
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 == 0) goto L86
            android.ext.o1 r4 = r3.O
            long r4 = r4.f()
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L86
            android.ext.n1 r4 = r3.N
            int r4 = r4.p(r1)
            android.widget.ListView r5 = r3.M
            int r5 = r5.getFirstVisiblePosition()
            int r4 = r4 - r5
            if (r4 < 0) goto L7a
            android.widget.ListView r5 = r3.M
            int r5 = r5.getChildCount()
            if (r4 >= r5) goto L7a
            android.widget.ListView r5 = r3.M
            android.view.View r4 = r5.getChildAt(r4)
            int r0 = r4.getTop()
        L7a:
            android.ext.o1 r4 = r3.O
            r5 = 2131296862(0x7f09025e, float:1.8211653E38)
            java.lang.String r5 = android.ext.Tools.N1(r5)
            r4.b(r1, r5, r0)
        L86:
            return
    }

    private void N(java.lang.String r4, int r5, int r6) {
            r3 = this;
            android.widget.TabHost r0 = r3.m
            android.widget.TabHost$TabSpec r4 = r0.newTabSpec(r4)
            r4.setContent(r5)
            android.widget.TabHost r5 = r3.m
            android.view.View r5 = r5.findViewById(r6)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.widget.ImageView r5 = android.ext.Config.m(r5)
            android.graphics.drawable.Drawable r6 = r5.getDrawable()
            java.lang.String r0 = ""
            r4.setIndicator(r0, r6)
            android.widget.TabHost r6 = r3.m     // Catch: java.lang.IllegalArgumentException -> L24
            r6.addTab(r4)     // Catch: java.lang.IllegalArgumentException -> L24
            return
        L24:
            r6 = move-exception
            android.ext.e1.a(r6)
            r4.setIndicator(r0)
            android.widget.TabHost r6 = r3.m     // Catch: java.lang.IllegalArgumentException -> L31
            r6.addTab(r4)     // Catch: java.lang.IllegalArgumentException -> L31
            return
        L31:
            r6 = move-exception
            android.ext.e1.a(r6)
            android.widget.TabHost r6 = r3.m     // Catch: java.lang.NoSuchMethodError -> L47
            android.widget.TabWidget r6 = r6.getTabWidget()     // Catch: java.lang.NoSuchMethodError -> L47
            r1 = 0
            r2 = 2131099687(0x7f060027, float:1.7811734E38)
            android.view.View r6 = a.d.g(r2, r6, r1)     // Catch: java.lang.NoSuchMethodError -> L47
            r4.setIndicator(r6)     // Catch: java.lang.NoSuchMethodError -> L47
            goto L52
        L47:
            r6 = move-exception
            android.ext.e1.a(r6)
            android.graphics.drawable.Drawable r5 = r5.getDrawable()
            r4.setIndicator(r0, r5)
        L52:
            android.widget.TabHost r5 = r3.m
            r5.addTab(r4)
            return
    }

    static void N0(int r0, int r1) {
            r0 = r0 & 127(0x7f, float:1.78E-43)
            android.ext.MainService.N0 = r0
            if (r1 != 0) goto L8
            android.ext.MainService.O0 = r0
        L8:
            return
    }

    private void S(int[] r4) {
            r3 = this;
            if (r4 == 0) goto L23
            int r0 = r4.length
            r1 = 2
            if (r0 == r1) goto L7
            goto L23
        L7:
            r0 = 0
            r0 = r4[r0]
            android.ext.a3[] r1 = r3.E0
            if (r0 < 0) goto L23
            r2 = 4
            if (r0 < r2) goto L12
            goto L23
        L12:
            r2 = r1[r0]
            if (r2 != 0) goto L1d
            android.ext.a3 r2 = new android.ext.a3
            r2.<init>(r0)
            r1[r0] = r2
        L1d:
            r0 = 1
            r4 = r4[r0]
            r2.a(r4)
        L23:
            return
    }

    private void T0(byte r3, double r4) {
            r2 = this;
            android.ext.d1$a r4 = android.ext.d1.d(r4)
            android.ext.f0 r5 = r2.i
            int r0 = r4.f718a
            int r1 = r4.f719b
            r5.F0(r3, r0, r1)
            android.ext.HotPoint r3 = r2.j
            int r5 = r4.f718a
            double r0 = (double) r5
            int r4 = r4.f719b
            double r4 = (double) r4
            double r0 = r0 / r4
            java.lang.String r4 = android.ext.d1.a(r0)
            r3.A(r4)
            return
    }

    private void V0() {
            r2 = this;
            android.ext.ConfigListAdapter r0 = new android.ext.ConfigListAdapter
            r0.<init>()
            r2.x0 = r0
            android.widget.ListView r1 = r2.Y
            r1.setAdapter(r0)
            android.widget.ListView r1 = r2.Y
            r1.setOnItemClickListener(r0)
            return
    }

    private void W0(android.ext.p1[][] r9) {
            r8 = this;
            android.ext.o1 r0 = new android.ext.o1
            r0.<init>()
            r8.O = r0
            android.ext.n1 r0 = new android.ext.n1
            r0.<init>()
            r8.N = r0
            android.ext.p1 r1 = r0.i()
            android.widget.TextView r2 = r8.t
            r2.setOnClickListener(r1)
            r2 = 19
            android.ext.p1[] r2 = new android.ext.p1[r2]
            android.ext.EditorListener r3 = new android.ext.EditorListener
            r3.<init>()
            r4 = 0
            r2[r4] = r3
            android.ext.MainService$l0 r3 = new android.ext.MainService$l0
            r3.<init>(r8)
            r4 = 1
            r2[r4] = r3
            android.ext.MainService$r0 r3 = new android.ext.MainService$r0
            r3.<init>(r8)
            r5 = 2
            r2[r5] = r3
            android.ext.u0 r3 = new android.ext.u0
            r3.<init>()
            r6 = 3
            r2[r6] = r3
            android.ext.o1$c r3 = new android.ext.o1$c
            android.ext.o1 r7 = r8.O
            r3.<init>(r7)
            r7 = 4
            r2[r7] = r3
            android.ext.o1$b r3 = new android.ext.o1$b
            android.ext.o1 r7 = r8.O
            r3.<init>(r7)
            r7 = 5
            r2[r7] = r3
            android.ext.d0 r3 = new android.ext.d0
            r3.<init>()
            r7 = 6
            r2[r7] = r3
            android.ext.MainService$o0 r3 = new android.ext.MainService$o0
            r3.<init>(r8)
            r7 = 7
            r2[r7] = r3
            android.ext.MainService$q0 r3 = new android.ext.MainService$q0
            r3.<init>(r8)
            r7 = 8
            r2[r7] = r3
            android.ext.MainService$k0 r3 = new android.ext.MainService$k0
            r3.<init>(r8)
            r7 = 9
            r2[r7] = r3
            android.ext.MainService$j0 r3 = new android.ext.MainService$j0
            r3.<init>(r8)
            r7 = 10
            r2[r7] = r3
            android.ext.j0 r3 = new android.ext.j0
            r3.<init>()
            r7 = 11
            r2[r7] = r3
            android.ext.c0 r3 = new android.ext.c0
            r3.<init>()
            r7 = 12
            r2[r7] = r3
            android.ext.h r3 = new android.ext.h
            r3.<init>()
            r7 = 13
            r2[r7] = r3
            android.ext.OffsetCalculator r3 = new android.ext.OffsetCalculator
            r3.<init>()
            r7 = 14
            r2[r7] = r3
            android.ext.MainService$s0 r3 = new android.ext.MainService$s0
            r3.<init>(r8)
            r7 = 15
            r2[r7] = r3
            android.ext.MainService$m0 r3 = new android.ext.MainService$m0
            r3.<init>(r8)
            r7 = 16
            r2[r7] = r3
            r3 = 17
            android.ext.p1 r7 = r8.I
            r2[r3] = r7
            r3 = 18
            r2[r3] = r1
            r9[r5] = r2
            android.widget.ListView r9 = r8.M     // Catch: java.lang.OutOfMemoryError -> Ld6
            r9.setAdapter(r0)     // Catch: java.lang.OutOfMemoryError -> Ld6
            android.widget.ListView r9 = r8.M     // Catch: java.lang.OutOfMemoryError -> Ld6
            android.ext.EditorListener r0 = new android.ext.EditorListener     // Catch: java.lang.OutOfMemoryError -> Ld6
            r0.<init>(r4)     // Catch: java.lang.OutOfMemoryError -> Ld6
            r9.setOnItemClickListener(r0)     // Catch: java.lang.OutOfMemoryError -> Ld6
            android.widget.ListView r9 = r8.M     // Catch: java.lang.OutOfMemoryError -> Ld6
            android.ext.ItemContextMenu r0 = new android.ext.ItemContextMenu     // Catch: java.lang.OutOfMemoryError -> Ld6
            r0.<init>(r6)     // Catch: java.lang.OutOfMemoryError -> Ld6
            r9.setOnItemLongClickListener(r0)     // Catch: java.lang.OutOfMemoryError -> Ld6
            goto Lda
        Ld6:
            r9 = move-exception
            android.ext.e1.a(r9)
        Lda:
            android.widget.ListView r9 = r8.M
            android.ext.FastScrollerFix.a(r9, r4)
            return
    }

    public static void Y(android.content.res.Configuration r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Main onConfigurationChanged: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            boolean r0 = android.ext.MainService.R0
            if (r0 == 0) goto L19
            return
        L19:
            r0 = 1
            android.ext.MainService.R0 = r0
            r0 = 0
            android.ext.Tools.U1(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = android.ext.k.b()     // Catch: java.lang.Throwable -> L36
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L36
            boolean r2 = r2.equals(r1)     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L38
            android.ext.k.g()     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r2 = move-exception
            goto L66
        L38:
            android.ext.MainService r2 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L49
            android.ext.MainService r2 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L36
            android.ext.HotPoint r2 = r2.j     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L49
            android.ext.MainService r2 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L36
            android.ext.HotPoint r2 = r2.j     // Catch: java.lang.Throwable -> L36
            r2.o()     // Catch: java.lang.Throwable -> L36
        L49:
            android.ext.MainService r2 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L5a
            android.ext.MainService r2 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L36
            android.ext.i1 r2 = r2.n     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L5a
            android.ext.MainService r2 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L36
            android.ext.i1 r2 = r2.n     // Catch: java.lang.Throwable -> L36
            r2.h()     // Catch: java.lang.Throwable -> L36
        L5a:
            boolean r2 = android.ext.MainService.I0     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L63
            android.ext.MainService r2 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L36
            r2.q1()     // Catch: java.lang.Throwable -> L36
        L63:
            android.ext.MainService.R0 = r0
            return
        L66:
            android.ext.MainService.R0 = r0
            throw r2
    }

    private void Y0(android.ext.p1[][] r7) {
            r6 = this;
            r0 = 15
            android.ext.p1[] r0 = new android.ext.p1[r0]
            android.ext.MainService$i0 r1 = new android.ext.MainService$i0
            r2 = 2131296751(0x7f0901ef, float:1.8211428E38)
            r3 = 2130968664(0x7f040058, float:1.7545988E38)
            r1.<init>(r6, r2, r3)
            r2 = 0
            r0[r2] = r1
            android.ext.MainService$q0 r1 = new android.ext.MainService$q0
            r1.<init>(r6)
            r2 = 1
            r0[r2] = r1
            android.ext.MainService$s0 r1 = new android.ext.MainService$s0
            r1.<init>(r6)
            r3 = 2
            r0[r3] = r1
            android.ext.MainService$a r1 = new android.ext.MainService$a
            r4 = 2131296919(0x7f090297, float:1.8211768E38)
            r5 = 2130968607(0x7f04001f, float:1.7545872E38)
            r1.<init>(r6, r4, r5)
            r4 = 3
            r0[r4] = r1
            android.ext.MainService$p0 r1 = new android.ext.MainService$p0
            r1.<init>(r6, r2)
            r4 = 4
            r0[r4] = r1
            android.ext.EditorListener r1 = new android.ext.EditorListener
            r1.<init>()
            r4 = 5
            r0[r4] = r1
            android.ext.MainService$m0 r1 = new android.ext.MainService$m0
            r1.<init>(r6)
            r4 = 6
            r0[r4] = r1
            android.ext.MainService$l0 r1 = new android.ext.MainService$l0
            r1.<init>(r6)
            r4 = 7
            r0[r4] = r1
            android.ext.MainService$o0 r1 = new android.ext.MainService$o0
            r1.<init>(r6)
            r4 = 8
            r0[r4] = r1
            android.ext.d0 r1 = new android.ext.d0
            r1.<init>()
            r4 = 9
            r0[r4] = r1
            android.ext.MainService$j0 r1 = new android.ext.MainService$j0
            r1.<init>(r6)
            r4 = 10
            r0[r4] = r1
            android.ext.b r1 = new android.ext.b
            r1.<init>()
            r4 = 11
            r0[r4] = r1
            android.ext.MainService$k0 r1 = new android.ext.MainService$k0
            r1.<init>(r6)
            r4 = 12
            r0[r4] = r1
            android.ext.OffsetCalculator r1 = new android.ext.OffsetCalculator
            r1.<init>()
            r4 = 13
            r0[r4] = r1
            r1 = 14
            android.ext.p1 r4 = r6.I
            r0[r1] = r4
            r7[r2] = r0
            android.widget.ListView r7 = r6.L
            android.ext.SavedListAdapter r0 = r6.t0
            r7.setAdapter(r0)
            android.widget.ListView r7 = r6.L
            android.ext.EditorListener r0 = new android.ext.EditorListener
            r0.<init>()
            r7.setOnItemClickListener(r0)
            android.widget.ListView r7 = r6.L
            android.ext.ItemContextMenu r0 = new android.ext.ItemContextMenu
            r0.<init>(r3)
            r7.setOnItemLongClickListener(r0)
            android.ext.FastScrollerFix r7 = new android.ext.FastScrollerFix
            android.widget.ListView r0 = r6.L
            r7.<init>(r0)
            android.ext.SavedListAdapter.r()
            r6.X0()
            return
    }

    private void Z0(android.ext.p1[][] r7) {
            r6 = this;
            android.ext.t0 r0 = new android.ext.t0
            r0.<init>()
            r6.V = r0
            android.ext.i2 r0 = new android.ext.i2
            r0.<init>()
            r6.W = r0
            android.ext.m1 r0 = new android.ext.m1
            r0.<init>()
            r6.X = r0
            r0 = 23
            android.ext.p1[] r0 = new android.ext.p1[r0]
            android.ext.o0 r1 = new android.ext.o0
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            android.ext.i2 r1 = r6.W
            r3 = 1
            r0[r3] = r1
            android.ext.EditorListener r1 = new android.ext.EditorListener
            r1.<init>()
            r4 = 2
            r0[r4] = r1
            android.ext.MainService$p0 r1 = new android.ext.MainService$p0
            r1.<init>(r6, r2)
            r4 = 3
            r0[r4] = r1
            r1 = 4
            android.ext.t0 r4 = r6.V
            r0[r1] = r4
            android.ext.MainService$r0 r1 = new android.ext.MainService$r0
            r1.<init>(r6)
            r4 = 5
            r0[r4] = r1
            android.ext.o2 r1 = new android.ext.o2
            r1.<init>()
            r4 = 6
            r0[r4] = r1
            android.ext.MainService$q0 r1 = new android.ext.MainService$q0
            r1.<init>(r6)
            r4 = 7
            r0[r4] = r1
            android.ext.MainService$s0 r1 = new android.ext.MainService$s0
            r1.<init>(r6)
            r4 = 8
            r0[r4] = r1
            android.ext.d0 r1 = new android.ext.d0
            r1.<init>()
            r4 = 9
            r0[r4] = r1
            r1 = 10
            android.ext.m1 r4 = r6.X
            r0[r1] = r4
            android.ext.MainService$m0 r1 = new android.ext.MainService$m0
            r1.<init>(r6)
            r4 = 11
            r0[r4] = r1
            android.ext.d2 r1 = new android.ext.d2
            r1.<init>()
            r4 = 12
            r0[r4] = r1
            android.ext.MainService$l0 r1 = new android.ext.MainService$l0
            r1.<init>(r6)
            r4 = 13
            r0[r4] = r1
            android.ext.MainService$k0 r1 = new android.ext.MainService$k0
            r1.<init>(r6)
            r4 = 14
            r0[r4] = r1
            android.ext.MainService$o0 r1 = new android.ext.MainService$o0
            r1.<init>(r6)
            r4 = 15
            r0[r4] = r1
            android.ext.MainService$j0 r1 = new android.ext.MainService$j0
            r1.<init>(r6)
            r4 = 16
            r0[r4] = r1
            android.ext.y2 r1 = new android.ext.y2
            r1.<init>()
            r4 = 17
            r0[r4] = r1
            android.ext.w1 r1 = new android.ext.w1
            r1.<init>()
            r4 = 18
            r0[r4] = r1
            android.ext.OffsetCalculator r1 = new android.ext.OffsetCalculator
            r1.<init>()
            r4 = 19
            r0[r4] = r1
            r1 = 20
            android.ext.q0 r4 = r6.H
            r0[r1] = r4
            android.ext.MainService$h0 r1 = new android.ext.MainService$h0
            r4 = 2131296978(0x7f0902d2, float:1.8211888E38)
            r5 = 2130968653(0x7f04004d, float:1.7545966E38)
            r1.<init>(r6, r4, r5)
            r4 = 21
            r0[r4] = r1
            android.ext.MainService$n0 r1 = new android.ext.MainService$n0
            r1.<init>(r6)
            r4 = 22
            r0[r4] = r1
            r7[r2] = r0
            android.widget.ListView r7 = r6.G
            android.ext.AddressArrayAdapter r0 = new android.ext.AddressArrayAdapter
            d.a r1 = r6.s0
            r0.<init>(r1)
            r7.setAdapter(r0)
            android.widget.ListView r7 = r6.G
            android.ext.EditorListener r0 = new android.ext.EditorListener
            r0.<init>()
            r7.setOnItemClickListener(r0)
            android.widget.ListView r7 = r6.G
            android.ext.ItemContextMenu r0 = new android.ext.ItemContextMenu
            r0.<init>(r3)
            r7.setOnItemLongClickListener(r0)
            android.ext.FastScrollerFix r7 = new android.ext.FastScrollerFix
            android.widget.ListView r0 = r6.G
            r7.<init>(r0)
            r6.b1()
            return
    }

    private static void d(java.util.List r2, java.lang.String r3) {
            if (r3 == 0) goto L23
            int r0 = r3.length()
            if (r0 != 0) goto L9
            goto L23
        L9:
            java.util.Iterator r0 = r2.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Ld
            return
        L20:
            r2.add(r3)
        L23:
            return
    }

    private static void f(java.util.List r0, java.io.File r1) {
            if (r1 != 0) goto L3
            return
        L3:
            java.lang.String r1 = r1.getAbsolutePath()
            g(r0, r1)
            return
    }

    private static void g(java.util.List r2, java.lang.String r3) {
            if (r3 == 0) goto L1d
            int r0 = r3.length()
            if (r0 != 0) goto L9
            goto L1d
        L9:
            java.lang.String r0 = "/emulated/0"
            boolean r1 = r3.contains(r0)
            if (r1 == 0) goto L1a
            java.lang.String r1 = "/emulated/legacy"
            java.lang.String r0 = r3.replace(r0, r1)
            d(r2, r0)
        L1a:
            d(r2, r3)
        L1d:
            return
    }

    private java.lang.String i(java.lang.String r3) {
            r2 = this;
            android.ext.z1$d r0 = r2.v0
            if (r0 == 0) goto L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "\n\n"
            r1.append(r3)
            java.lang.String r3 = r0.f1433b
            r1.append(r3)
            java.lang.String r3 = "\n["
            r1.append(r3)
            java.lang.String r3 = r0.f1434c
            r1.append(r3)
            java.lang.String r3 = "]"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
        L29:
            return r3
    }

    private void j1() {
            r2 = this;
            android.content.Context r0 = android.ext.MainService.context
            android.content.ComponentCallbacks r1 = A()
            r0.unregisterComponentCallbacks(r1)
            return
    }

    private void k() {
            r1 = this;
            android.ext.i1 r0 = r1.n
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r1.T
            if (r0 != 0) goto L17
            int r0 = android.ext.Config.B
            r0 = r0 & 4
            if (r0 == 0) goto L1b
            android.ext.j r0 = r1.h
            boolean r0 = r0.e()
            if (r0 == 0) goto L1b
        L17:
            r0 = 0
            r1.y0(r0)
        L1b:
            r1.n1()
            return
    }

    public static void t0(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onTrimMemory: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.ext.e1.p(r0)
            android.ext.MainService r0 = android.ext.MainService.instance
            if (r0 != 0) goto L19
            return
        L19:
            android.ext.b2.a()
            android.ext.z1.g()
            android.ext.MainService r0 = android.ext.MainService.instance
            r0.w(r2)
            return
    }

    boolean A0(byte r4) {
            r3 = this;
            boolean r0 = r3.R
            r1 = 0
            if (r0 == 0) goto L14
            r3.Q()
            android.ext.f0 r0 = r3.i
            r2 = 1
            r0.L0(r4, r2)
            r3.R = r1
            r3.n1()
            return r2
        L14:
            return r1
    }

    public long B(long r2, int r4) {
            r1 = this;
            r1.Q()
            android.ext.f0 r0 = r1.i
            long r2 = r0.Q(r2, r4)
            return r2
    }

    boolean B0(byte r2, boolean r3) {
            r1 = this;
            if (r3 != 0) goto L8
            android.ext.i1 r3 = r1.n
            if (r3 != 0) goto L8
            r2 = 0
            return r2
        L8:
            r1.Q()
            android.ext.f0 r3 = r1.i
            boolean r0 = r1.R
            r3.L0(r2, r0)
            boolean r2 = r1.R
            r3 = 1
            r2 = r2 ^ r3
            r1.R = r2
            r1.n1()
            return r3
    }

    android.ext.FloatPanel C(java.lang.String r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            android.ext.MainService$g r6 = new android.ext.MainService$g
            android.content.Context r2 = android.ext.MainService.context
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            android.fix.ImageButton r8 = new android.fix.ImageButton
            android.content.Context r9 = android.ext.MainService.context
            r8.<init>(r9)
            r8.setImageResource(r12)
            r9 = 1
            r8.setKeepScreenOn(r9)
            r8.setId(r11)
            android.ext.MainService r9 = android.ext.MainService.instance
            r8.setOnClickListener(r9)
            r6.addView(r8)
            return r6
    }

    boolean C0(boolean r3) {
            r2 = this;
            r0 = 0
            boolean r3 = r2.B0(r0, r3)
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.c2 r0 = r0.f216f
            if (r0 == 0) goto L10
            java.lang.String r1 = "gg.processToggle()\n"
            r0.write(r1)
        L10:
            return r3
    }

    void D0(boolean r5) {
            r4 = this;
            if (r5 != 0) goto La
            android.ext.x r5 = r4.i0
            boolean r5 = r5.b()
            if (r5 != 0) goto L1a
        La:
            long r0 = r4.A
            r2 = 1
            long r0 = r0 + r2
            r4.A = r0
            android.view.View r5 = r4.x
            r0 = 0
            r5.setVisibility(r0)
            android.ext.b0.g()
        L1a:
            return
    }

    public void E0() {
            r2 = this;
            android.view.View r0 = r2.f0
            android.view.View r1 = r2.a0
            if (r0 != r1) goto Lc
            android.ext.SavedListAdapter r0 = r2.t0
            r0.i()
            goto L1a
        Lc:
            android.view.View r1 = r2.b0
            if (r0 != r1) goto L16
            android.ext.n1 r0 = r2.N
            r0.L()
            goto L1a
        L16:
            r0 = 0
            r2.D0(r0)
        L1a:
            return
    }

    public android.app.Notification F(boolean r13, boolean r14) {
            r12 = this;
            java.lang.Class<java.lang.CharSequence> r0 = java.lang.CharSequence.class
            java.lang.String r1 = ""
            r2 = 0
            android.app.PendingIntent r3 = android.ext.w2.b(r2)
            boolean r4 = android.ext.m2.f1074a
            if (r4 == 0) goto L12
            android.ext.i1 r4 = r12.n
            if (r4 != 0) goto L23
            goto L27
        L12:
            android.ext.i1 r4 = r12.n
            if (r4 == 0) goto L27
            android.ext.r r4 = android.ext.r.n
            if (r4 == 0) goto L27
            android.ext.r r4 = android.ext.r.n
            boolean r4 = r4.x()
            if (r4 != 0) goto L23
            goto L27
        L23:
            r4 = 2131296678(0x7f0901a6, float:1.821128E38)
            goto L2a
        L27:
            r4 = 2131296959(0x7f0902bf, float:1.821185E38)
        L2a:
            java.lang.String r4 = android.ext.b2.f(r4)
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 1
            r7 = 2130968633(0x7f040039, float:1.7545925E38)
            android.content.Context r8 = android.ext.MainService.context     // Catch: java.lang.Throwable -> L41
            android.content.Context r8 = r8.getApplicationContext()     // Catch: java.lang.Throwable -> L41
            if (r14 == 0) goto L43
            android.content.Context r8 = android.ext.Config.a(r8)     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r14 = move-exception
            goto L94
        L43:
            android.app.Notification$Builder r14 = new android.app.Notification$Builder     // Catch: java.lang.Throwable -> L41
            r14.<init>(r8)     // Catch: java.lang.Throwable -> L41
            android.app.Notification$Builder r14 = r14.setContentTitle(r4)     // Catch: java.lang.Throwable -> L41
            android.app.Notification$Builder r14 = r14.setContentText(r1)     // Catch: java.lang.Throwable -> L41
            android.app.Notification$Builder r14 = r14.setContentIntent(r3)     // Catch: java.lang.Throwable -> L41
            android.app.Notification$Builder r14 = r14.setAutoCancel(r2)     // Catch: java.lang.Throwable -> L41
            android.app.Notification$Builder r14 = r14.setOngoing(r6)     // Catch: java.lang.Throwable -> L41
            if (r13 == 0) goto L8f
            r14.setSmallIcon(r7)     // Catch: java.lang.Throwable -> L41
            r8 = 2131296926(0x7f09029e, float:1.8211782E38)
            java.lang.String r8 = android.ext.b2.f(r8)     // Catch: java.lang.Throwable -> L41
            android.app.PendingIntent r9 = android.ext.w2.b(r6)     // Catch: java.lang.Throwable -> L41
            r10 = 23
            r11 = 2130968593(0x7f040011, float:1.7545844E38)
            if (r5 < r10) goto L83
            android.ext.l1.a()     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> L41
            android.graphics.drawable.Icon r5 = android.ext.j1.a(r5, r11)     // Catch: java.lang.Throwable -> L41
            android.app.Notification$Action$Builder r5 = android.ext.k1.a(r5, r8, r9)     // Catch: java.lang.Throwable -> L41
            goto L88
        L83:
            android.app.Notification$Action$Builder r5 = new android.app.Notification$Action$Builder     // Catch: java.lang.Throwable -> L41
            r5.<init>(r11, r8, r9)     // Catch: java.lang.Throwable -> L41
        L88:
            android.app.Notification$Action r5 = r5.build()     // Catch: java.lang.Throwable -> L41
            r14.addAction(r5)     // Catch: java.lang.Throwable -> L41
        L8f:
            android.app.Notification r14 = r14.build()     // Catch: java.lang.Throwable -> L41
            goto L98
        L94:
            android.ext.e1.a(r14)
            r14 = 0
        L98:
            if (r14 != 0) goto Ldf
            android.app.Notification r14 = new android.app.Notification
            r14.<init>()
            if (r13 == 0) goto La8
            r14.icon = r7     // Catch: java.lang.Throwable -> La4
            goto La8
        La4:
            r13 = move-exception
            android.ext.e1.a(r13)
        La8:
            r14.tickerText = r4
            r14.contentIntent = r3
            java.lang.Class<android.app.Notification> r13 = android.app.Notification.class
            java.lang.String r5 = "setLatestEventInfo"
            r7 = 4
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Ld9
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r8[r2] = r9     // Catch: java.lang.Throwable -> Ld9
            r8[r6] = r0     // Catch: java.lang.Throwable -> Ld9
            r9 = 2
            r8[r9] = r0     // Catch: java.lang.Throwable -> Ld9
            java.lang.Class<android.app.PendingIntent> r0 = android.app.PendingIntent.class
            r10 = 3
            r8[r10] = r0     // Catch: java.lang.Throwable -> Ld9
            java.lang.reflect.Method r13 = r13.getMethod(r5, r8)     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> Ld9
            android.content.Context r5 = android.ext.MainService.context     // Catch: java.lang.Throwable -> Ld9
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> Ld9
            r0[r2] = r5     // Catch: java.lang.Throwable -> Ld9
            r0[r6] = r4     // Catch: java.lang.Throwable -> Ld9
            r0[r9] = r1     // Catch: java.lang.Throwable -> Ld9
            r0[r10] = r3     // Catch: java.lang.Throwable -> Ld9
            r13.invoke(r14, r0)     // Catch: java.lang.Throwable -> Ld9
            goto Ldf
        Ld9:
            r13 = move-exception
            java.lang.String r0 = "Method not found"
            android.ext.e1.s(r0, r13)
        Ldf:
            r13 = 34
            r14.flags = r13
            return r14
    }

    public void F0() {
            r4 = this;
            java.lang.Runnable r0 = r4.B0
            android.os.Handler r1 = android.ext.n2.d()
            if (r0 == 0) goto Lc
            r1.removeCallbacks(r0)
            goto L13
        Lc:
            android.ext.MainService$p r0 = new android.ext.MainService$p
            r0.<init>(r4)
            r4.B0 = r0
        L13:
            r2 = 500(0x1f4, double:2.47E-321)
            r1.postDelayed(r0, r2)
            return
    }

    public double G() {
            r2 = this;
            android.ext.f0 r0 = r2.i
            double r0 = r0.Z()
            return r0
    }

    public int H() {
            r1 = this;
            android.widget.TabHost r0 = r1.m
            int r0 = r0.getCurrentTab()
            return r0
    }

    void H0(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof d.e
            r1 = 0
            if (r0 == 0) goto L30
            d.e r6 = (d.e) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r6.l()
        L10:
            if (r1 >= r2) goto L2a
            boolean r3 = r6.a(r1)
            if (r3 != 0) goto L19
            goto L27
        L19:
            java.lang.Object r3 = r6.n(r1)
            android.ext.h2 r3 = (android.ext.h2) r3
            boolean r4 = r3 instanceof android.ext.h2
            if (r4 != 0) goto L24
            goto L27
        L24:
            r0.add(r3)
        L27:
            int r1 = r1 + 1
            goto L10
        L2a:
            android.ext.SavedListAdapter r6 = r5.t0
            r6.l(r0)
            goto L5b
        L30:
            boolean r0 = r6 instanceof d.a
            if (r0 == 0) goto L5b
            d.a r6 = (d.a) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r6.i()
            r3 = 0
        L40:
            if (r3 >= r2) goto L53
            boolean r4 = r6.c(r3)
            if (r4 == 0) goto L50
            r4 = 0
            android.ext.c r4 = r6.f(r3, r4)
            r0.add(r4)
        L50:
            int r3 = r3 + 1
            goto L40
        L53:
            android.ext.f0 r6 = r5.i
            r6.j0(r0)
            r5.D0(r1)
        L5b:
            return
    }

    java.lang.String I() {
            r9 = this;
            java.lang.String r0 = "Fail get path"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.content.SharedPreferences r2 = android.ext.Tools.M0()
            java.lang.String r3 = "temp-path"
            r4 = 0
            java.lang.String r5 = r2.getString(r3, r4)
            r6 = 0
            if (r5 == 0) goto L53
            java.lang.String r7 = "/bypass"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L20
            r7 = 1
            android.ext.f0.v = r7
        L20:
            int r7 = r5.length()
            r8 = 2
            if (r7 < r8) goto L34
            char r7 = r5.charAt(r6)
            r8 = 47
            if (r7 == r8) goto L30
            goto L34
        L30:
            g(r1, r5)
            goto L53
        L34:
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r2 = r2.remove(r3)
            r2.commit()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Removed bad path: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.ext.e1.i(r2)
        L53:
            android.content.Context r2 = android.ext.MainService.context     // Catch: java.lang.Throwable -> L5d
            java.io.File r2 = r2.getExternalFilesDir(r4)     // Catch: java.lang.Throwable -> L5d
            f(r1, r2)     // Catch: java.lang.Throwable -> L5d
            goto L61
        L5d:
            r2 = move-exception
            android.ext.e1.l(r0, r2)
        L61:
            android.content.Context r2 = android.ext.MainService.context     // Catch: java.lang.Throwable -> L73
            java.io.File[] r2 = r2.getExternalFilesDirs(r4)     // Catch: java.lang.Throwable -> L73
            int r3 = r2.length     // Catch: java.lang.Throwable -> L73
            r4 = 0
        L69:
            if (r4 >= r3) goto L77
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L73
            f(r1, r5)     // Catch: java.lang.Throwable -> L73
            int r4 = r4 + 1
            goto L69
        L73:
            r2 = move-exception
            android.ext.e1.l(r0, r2)
        L77:
            android.content.Context r2 = android.ext.MainService.context     // Catch: java.lang.Throwable -> L81
            java.io.File r2 = r2.getExternalCacheDir()     // Catch: java.lang.Throwable -> L81
            f(r1, r2)     // Catch: java.lang.Throwable -> L81
            goto L85
        L81:
            r2 = move-exception
            android.ext.e1.l(r0, r2)
        L85:
            android.content.Context r2 = android.ext.MainService.context     // Catch: java.lang.Throwable -> L96
            java.io.File[] r2 = r2.getExternalCacheDirs()     // Catch: java.lang.Throwable -> L96
            int r3 = r2.length     // Catch: java.lang.Throwable -> L96
        L8c:
            if (r6 >= r3) goto L9a
            r4 = r2[r6]     // Catch: java.lang.Throwable -> L96
            f(r1, r4)     // Catch: java.lang.Throwable -> L96
            int r6 = r6 + 1
            goto L8c
        L96:
            r2 = move-exception
            android.ext.e1.l(r0, r2)
        L9a:
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> La2
            f(r1, r2)     // Catch: java.lang.Throwable -> La2
            goto La6
        La2:
            r2 = move-exception
            android.ext.e1.l(r0, r2)
        La6:
            java.lang.String r2 = "/sdcard"
            g(r1, r2)
            java.io.File r2 = android.ext.Tools.p0()     // Catch: java.lang.Throwable -> Lb3
            f(r1, r2)     // Catch: java.lang.Throwable -> Lb3
            goto Lb7
        Lb3:
            r2 = move-exception
            android.ext.e1.l(r0, r2)
        Lb7:
            java.io.File r2 = android.ext.Tools.b0()     // Catch: java.lang.Throwable -> Lbf
            f(r1, r2)     // Catch: java.lang.Throwable -> Lbf
            goto Lc3
        Lbf:
            r2 = move-exception
            android.ext.e1.l(r0, r2)
        Lc3:
            java.lang.String r0 = "/data"
            g(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        Ld1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lfc
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Le0
            goto Ld1
        Le0:
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto Led
            goto Ld1
        Led:
            int r3 = r0.length()
            if (r3 <= 0) goto Lf8
            r3 = 124(0x7c, float:1.74E-43)
            r0.append(r3)
        Lf8:
            r0.append(r2)
            goto Ld1
        Lfc:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void J(long r2) {
            r1 = this;
            r0 = 0
            r1.K(r2, r0)
            return
    }

    public void K(long r2, int r4) {
            r1 = this;
            android.ext.n1 r0 = r1.N
            r0.M(r2, r4)
            android.view.View r2 = r1.f0
            android.view.View r3 = r1.b0
            if (r2 != r3) goto L11
            android.widget.ImageButton r2 = r1.P
            android.ext.Tools.s(r2)
            goto L17
        L11:
            android.widget.TabHost r2 = r1.m
            r3 = 3
            r2.setCurrentTab(r3)
        L17:
            return
    }

    public void K0() {
            r1 = this;
            java.lang.String r0 = "***"
            android.ext.e1.d(r0)
            android.ext.d1 r0 = r1.k0
            r0.j()
            r0 = 1
            r1.o1(r0)
            return
    }

    public void L(java.lang.Long r16, java.lang.String r17, java.lang.CharSequence r18) {
            r15 = this;
            r1 = r15
            r2 = r17
            r3 = 1
            android.ext.y0.b(r2, r3)
            int r4 = r17.length()
            r5 = 0
            r7 = 0
            r0 = 0
        Lf:
            if (r0 >= r4) goto La0
            int r8 = r0 + 1
            r9 = 45
            int r9 = r2.indexOf(r9, r8)
            r10 = 43
            int r8 = r2.indexOf(r10, r8)
            r10 = -1
            if (r8 == r10) goto L28
            if (r9 == r10) goto L27
            if (r9 >= r8) goto L27
            goto L28
        L27:
            r9 = r8
        L28:
            if (r9 != r10) goto L2b
            r9 = r4
        L2b:
            java.lang.String r0 = r2.substring(r0, r9)
            java.lang.String r0 = r0.trim()
            int r8 = r0.length()
            if (r8 <= 0) goto L7e
            java.util.List r10 = android.ext.RegionList.getList()
            java.util.Iterator r10 = r10.iterator()
        L41:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L7e
            java.lang.Object r11 = r10.next()
            android.ext.RegionList$b r11 = (android.ext.RegionList.b) r11
            java.lang.String r12 = r11.f358d
            if (r12 == 0) goto L41
            int r13 = r12.length()
            if (r13 >= r8) goto L58
            goto L41
        L58:
            boolean r13 = r12.endsWith(r0)
            if (r13 == 0) goto L41
            int r13 = r12.length()
            int r14 = r0.length()
            if (r13 == r14) goto L7a
            int r13 = r12.length()
            int r14 = r0.length()
            int r13 = r13 - r14
            int r13 = r13 - r3
            char r12 = r12.charAt(r13)
            r13 = 47
            if (r12 != r13) goto L41
        L7a:
            long r10 = r11.f356b
        L7c:
            long r5 = r5 + r10
            goto L9d
        L7e:
            java.lang.String r8 = "h"
            boolean r8 = r0.endsWith(r8)
            if (r8 == 0) goto L8f
            int r8 = r0.length()
            int r8 = r8 - r3
            java.lang.String r0 = r0.substring(r7, r8)
        L8f:
            r8 = 16
            long r10 = android.ext.t1.r(r0, r8)     // Catch: java.lang.Throwable -> L96
            goto L7c
        L96:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Failed parse"
            android.ext.e1.g(r0, r8)
        L9d:
            r0 = r9
            goto Lf
        La0:
            r8 = r16
            r15.M0(r8, r5)
            android.ext.o1 r0 = r1.O
            r2 = r18
            r0.a(r5, r2)
            r15.J(r5)
            return
    }

    void L0(java.lang.Object r13, android.ext.d r14) {
            r12 = this;
            r0 = 0
            if (r14 == 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            if (r1 != 0) goto Ld
            android.ext.d r14 = new android.ext.d
            r14.<init>()
        Ld:
            android.ext.d r8 = r12.u0
            android.ext.d$a r9 = new android.ext.d$a
            r9.<init>()
            boolean r2 = r13 instanceof d.a
            if (r2 == 0) goto L47
            d.a r13 = (d.a) r13
            android.ext.c r10 = new android.ext.c
            r10.<init>()
            int r11 = r13.i()
        L23:
            if (r0 >= r11) goto L7d
            boolean r2 = r13.c(r0)
            if (r2 != 0) goto L2c
            goto L44
        L2c:
            r13.f(r0, r10)
            long r2 = r10.f672a
            int r4 = r10.f674c
            r8.a(r2, r4, r9)
            boolean r2 = r9.f702b
            if (r2 == 0) goto L44
            long r3 = r10.f672a
            int r5 = r10.f674c
            long r6 = r9.f701a
            r2 = r14
            r2.c(r3, r5, r6)
        L44:
            int r0 = r0 + 1
            goto L23
        L47:
            boolean r2 = r13 instanceof d.e
            if (r2 == 0) goto L7d
            d.e r13 = (d.e) r13
            int r10 = r13.l()
        L51:
            if (r0 >= r10) goto L7d
            boolean r2 = r13.a(r0)
            if (r2 != 0) goto L5a
            goto L7a
        L5a:
            java.lang.Object r2 = r13.n(r0)
            android.ext.h2 r2 = (android.ext.h2) r2
            boolean r3 = r2 instanceof android.ext.h2
            if (r3 != 0) goto L65
            goto L7a
        L65:
            long r3 = r2.f672a
            int r5 = r2.f674c
            r8.a(r3, r5, r9)
            boolean r3 = r9.f702b
            if (r3 == 0) goto L7a
            long r3 = r2.f672a
            int r5 = r2.f674c
            long r6 = r9.f701a
            r2 = r14
            r2.c(r3, r5, r6)
        L7a:
            int r0 = r0 + 1
            goto L51
        L7d:
            if (r1 != 0) goto L82
            r14.d()
        L82:
            return
    }

    public void O() {
            r1 = this;
            android.ext.c2 r0 = r1.f216f
            if (r0 == 0) goto L7
            r0.e()
        L7:
            return
    }

    void O0(int r1, int r2) {
            r0 = this;
            r0.l0 = r1
            r0.m0 = r2
            return
    }

    public void P() {
            r1 = this;
            android.ext.Script r0 = r1.f212b
            if (r0 == 0) goto L7
            r0.w3()
        L7:
            return
    }

    public void P0(android.ext.w r2) {
            r1 = this;
            android.ext.n1 r0 = r1.N
            r0.G(r2)
            return
    }

    void Q() {
            r1 = this;
            r0 = 0
            r1.R(r0)
            return
    }

    public void Q0(android.ext.z1.d r5) {
            r4 = this;
            android.ext.z1$d r0 = r4.v0
            r1 = 1
            if (r0 == 0) goto L10
            if (r5 == 0) goto L10
            int r0 = r0.f1437f
            int r2 = r5.f1437f
            if (r0 == r2) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            if (r0 == 0) goto L18
            android.ext.MainService.P0 = r1
            r4.J0()
        L18:
            android.ext.Config.k()
            r4.v0 = r5
            android.ext.Config.h()
            android.ext.ConfigListAdapter r1 = r4.x0
            r1.o()
            if (r5 == 0) goto L69
            android.graphics.drawable.Drawable r1 = r5.f1436e
            android.graphics.drawable.Drawable r1 = android.ext.Tools.R1(r1)
            android.widget.ImageView r2 = r4.p
            r2.setImageDrawable(r1)
            android.graphics.drawable.Drawable r1 = r5.f1436e
            if (r1 != 0) goto L4a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setProcessInfo icon is null: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.ext.e1.i(r1)
        L4a:
            android.widget.TextView r1 = r4.s
            java.lang.String r2 = r5.toString()
            r1.setText(r2)
            android.graphics.drawable.Drawable r1 = r5.f1436e
            android.graphics.drawable.Drawable r1 = android.ext.Tools.R1(r1)
            android.ext.HotPoint r2 = r4.j
            r2.y(r1)
            android.ext.f0 r1 = r4.i
            int r2 = r5.f1437f
            java.lang.String r3 = r5.f1434c
            java.lang.String r5 = r5.f1435d
            r1.D0(r2, r3, r5)
        L69:
            android.ext.TimersEditor r5 = r4.n0
            r5.f()
            android.ext.TimersEditor r5 = r4.o0
            r5.f()
            r4.k()
            if (r0 == 0) goto L7b
            r4.E0()
        L7b:
            return
    }

    void R(byte r6) {
            r5 = this;
            boolean r0 = r5.j0
            if (r0 == 0) goto L69
            r0 = 0
            r5.r(r0)
            android.ext.z1$d r1 = r5.v0
            if (r1 == 0) goto L69
            android.ext.f0 r2 = r5.i
            int r3 = r1.f1437f
            java.lang.String r4 = r1.f1434c
            java.lang.String r1 = r1.f1435d
            r2.C0(r6, r3, r4, r1)
            r5.j0 = r0
            android.widget.ImageView r6 = r5.q
            r6.setVisibility(r0)
            android.widget.TextView r6 = r5.g0
            java.lang.CharSequence r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 2131297084(0x7f09033c, float:1.8212103E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            android.ext.f0 r1 = r5.i
            java.lang.CharSequence r1 = r1.a0()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r6 = r6.startsWith(r0)
            if (r6 != 0) goto L69
            android.os.Handler r6 = android.ext.n2.d()
            android.ext.MainService$d0 r0 = new android.ext.MainService$d0
            r0.<init>(r5)
            java.util.Random r1 = android.ext.Tools.f489a
            r2 = 300000(0x493e0, float:4.2039E-40)
            int r1 = r1.nextInt(r2)
            r2 = 180000(0x2bf20, float:2.52234E-40)
            int r1 = r1 + r2
            long r1 = (long) r1
            r6.postDelayed(r0, r1)
        L69:
            return
    }

    void R0(boolean r2) {
            r1 = this;
            android.view.View r0 = r1.f214d
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r2 != r0) goto La
            return
        La:
            android.ext.MainService$c r0 = new android.ext.MainService$c
            r0.<init>(r1, r2)
            android.ext.n2.i(r0)
            return
    }

    public void S0(byte r1, double r2) {
            r0 = this;
            r0.T0(r1, r2)
            android.ext.d1 r1 = r0.k0
            r1.i(r2)
            return
    }

    public void T() {
            r1 = this;
            java.lang.String r0 = ">>"
            android.ext.e1.d(r0)
            android.ext.d1 r0 = r1.k0
            r0.k()
            r0 = 1
            r1.o1(r0)
            return
    }

    void U() {
            r2 = this;
            android.view.View r0 = r2.f0
            android.view.View r1 = r2.Z
            if (r0 != r1) goto Lc
            android.widget.ListView r0 = r2.G
        L8:
            r2.W(r0)
            goto L1a
        Lc:
            android.view.View r1 = r2.a0
            if (r0 != r1) goto L13
            android.widget.ListView r0 = r2.L
            goto L8
        L13:
            android.view.View r1 = r2.b0
            if (r0 != r1) goto L1a
            android.widget.ListView r0 = r2.M
            goto L8
        L1a:
            return
    }

    public void U0(int r2) {
            r1 = this;
            android.widget.TabHost r0 = r1.m
            r0.setCurrentTab(r2)
            return
    }

    void V(android.widget.ListAdapter r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            android.ext.MainService$k r0 = new android.ext.MainService$k
            r0.<init>(r1, r2)
            android.ext.n2.i(r0)
            return
    }

    void W(android.widget.ListView r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            android.widget.ListAdapter r1 = r1.getAdapter()
            r0.V(r1)
            return
    }

    public void X(byte r5, java.lang.String r6) {
            r4 = this;
            if (r5 != 0) goto L17
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "notifyScript client: "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.ext.e1.d(r5)
            return
        L17:
            android.ext.Script r0 = r4.f212b
            java.lang.String r1 = "; "
            if (r0 == 0) goto L3b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "notifyScript: "
            r2.append(r3)
            r2.append(r5)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = r2.toString()
            android.ext.e1.d(r1)
            r0.c3(r5, r6)
            goto L55
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "notifyScript no script: "
            r0.append(r2)
            r0.append(r5)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r5 = r0.toString()
            android.ext.e1.d(r5)
        L55:
            return
    }

    public void X0() {
            r2 = this;
            android.os.Handler r0 = android.ext.n2.d()     // Catch: java.lang.Throwable -> La
            java.lang.Runnable r1 = r2.A0     // Catch: java.lang.Throwable -> La
            r0.post(r1)     // Catch: java.lang.Throwable -> La
            goto L10
        La:
            r0 = move-exception
            java.lang.String r1 = "Failed post timer"
            android.ext.e1.s(r1, r0)
        L10:
            return
    }

    public void Z() {
            r19 = this;
            r1 = r19
            java.lang.String r0 = "Service onCreate"
            android.ext.e1.d(r0)
            android.ext.TimersEditor r0 = new android.ext.TimersEditor
            java.lang.String r3 = "TE"
            java.lang.String r4 = "timers"
            r5 = 44
            boolean[] r6 = android.ext.MainService.L0
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            r1.n0 = r0
            android.ext.TimersEditor r0 = new android.ext.TimersEditor
            java.lang.String r9 = "RE"
            java.lang.String r10 = "rand"
            r11 = 19
            boolean[] r12 = android.ext.MainService.M0
            r13 = 1
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            r1.o0 = r0
            r0 = 2131099677(0x7f06001d, float:1.7811714E38)
            r2 = 0
            android.view.View r0 = a.d.f(r0, r2)
            r3 = r0
            android.widget.TabHost r3 = (android.widget.TabHost) r3
            r1.m = r3
            r4 = 1
            r3.setFocusableInTouchMode(r4)
            r0 = 2131034242(0x7f050082, float:1.7678996E38)
            int[] r0 = new int[]{r0}
            r5 = 0
            r0 = r0[r5]
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r6 = r0.getText()
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.trim()
            java.lang.String r6 = android.ext.b2.g(r6)
            r0.setText(r6)
            r0 = 2131034344(0x7f0500e8, float:1.7679203E38)
            java.util.zip.ZipFile r7 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L1d0
            android.content.Context r8 = android.ext.MainService.context     // Catch: java.lang.Throwable -> L1d0
            java.lang.String r8 = r8.getPackageResourcePath()     // Catch: java.lang.Throwable -> L1d0
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L1d0
            java.lang.String r8 = "zlqgrz&dvvhwv2&uhv2udz2&fodvvhv51gh{"
            java.lang.String r8 = android.ext.Tools.removeNewLinesChars(r8)     // Catch: java.lang.Throwable -> L1cd
            java.lang.String r9 = "#"
            java.lang.String[] r8 = r8.split(r9)     // Catch: java.lang.Throwable -> L1cd
            int r9 = r8.length     // Catch: java.lang.Throwable -> L1cd
            java.lang.String r10 = "uhv2udz2|gz"
            java.lang.String r10 = android.ext.Tools.removeNewLinesChars(r10)     // Catch: java.lang.Throwable -> L1cd
            java.util.Enumeration r11 = r7.entries()     // Catch: java.lang.Throwable -> L1cd
            r12 = 2131034292(0x7f0500b4, float:1.7679097E38)
            android.view.View r12 = r3.findViewById(r12)     // Catch: java.lang.Throwable -> L1cd
            r1.r = r12     // Catch: java.lang.Throwable -> L1cd
            r12 = 2131034113(0x7f050001, float:1.7678734E38)
        L8e:
            boolean r13 = r11.hasMoreElements()     // Catch: java.lang.Throwable -> Lb2
            r14 = 2131034128(0x7f050010, float:1.7678765E38)
            if (r13 == 0) goto L11a
            java.lang.Object r13 = r11.nextElement()     // Catch: java.lang.Throwable -> Lb2
            java.util.zip.ZipEntry r13 = (java.util.zip.ZipEntry) r13     // Catch: java.lang.Throwable -> Lb2
            r15 = 0
        L9e:
            if (r15 >= r9) goto L117
            android.widget.ImageView r2 = r1.o     // Catch: java.lang.Throwable -> Lb2
            if (r2 != 0) goto Laf
            r2 = 2131034131(0x7f050013, float:1.767877E38)
            android.view.View r2 = r3.findViewById(r2)     // Catch: java.lang.Throwable -> Lb2
            android.widget.ImageView r2 = (android.widget.ImageView) r2     // Catch: java.lang.Throwable -> Lb2
            r1.o = r2     // Catch: java.lang.Throwable -> Lb2
        Laf:
            r16 = r7
            goto Lb6
        Lb2:
            r16 = r7
            goto L18a
        Lb6:
            long r6 = (long) r12
            long r17 = r13.getSize()     // Catch: java.lang.Throwable -> L18a
            long r6 = r6 ^ r17
            int r7 = (int) r6     // Catch: java.lang.Throwable -> L18a
            android.widget.ImageView r6 = r1.p     // Catch: java.lang.Throwable -> L18a
            if (r6 != 0) goto Lca
            android.view.View r6 = r3.findViewById(r14)     // Catch: java.lang.Throwable -> L18a
            android.widget.ImageView r6 = (android.widget.ImageView) r6     // Catch: java.lang.Throwable -> L18a
            r1.p = r6     // Catch: java.lang.Throwable -> L18a
        Lca:
            long r6 = (long) r7     // Catch: java.lang.Throwable -> L18a
            long r17 = r13.getSize()     // Catch: java.lang.Throwable -> L18a
            long r6 = r6 ^ r17
            int r7 = (int) r6     // Catch: java.lang.Throwable -> L18a
            android.widget.ImageView r6 = r1.q     // Catch: java.lang.Throwable -> L18a
            if (r6 != 0) goto Le1
            r6 = 2131034407(0x7f050127, float:1.767933E38)
            android.view.View r6 = r3.findViewById(r6)     // Catch: java.lang.Throwable -> L18a
            android.widget.ImageView r6 = (android.widget.ImageView) r6     // Catch: java.lang.Throwable -> L18a
            r1.q = r6     // Catch: java.lang.Throwable -> L18a
        Le1:
            java.lang.String r6 = r13.getName()     // Catch: java.lang.Throwable -> L18a
            r12 = r8[r15]     // Catch: java.lang.Throwable -> L18a
            int r6 = r6.indexOf(r12)     // Catch: java.lang.Throwable -> L18a
            int r6 = -r6
            java.lang.String r12 = r13.getName()     // Catch: java.lang.Throwable -> L18a
            int r12 = r12.indexOf(r10)     // Catch: java.lang.Throwable -> L18a
            int r6 = r6 * r12
            java.lang.String r12 = r13.getName()     // Catch: java.lang.Throwable -> L18a
            int r12 = r12.indexOf(r10)     // Catch: java.lang.Throwable -> L18a
            int r6 = r6 - r12
            int r6 = r6 - r4
            int r12 = r7 * r6
            android.widget.TextView r6 = r1.y     // Catch: java.lang.Throwable -> L18a
            if (r6 != 0) goto L111
            r6 = 2131034264(0x7f050098, float:1.767904E38)
            android.view.View r6 = r3.findViewById(r6)     // Catch: java.lang.Throwable -> L18a
            android.widget.TextView r6 = (android.widget.TextView) r6     // Catch: java.lang.Throwable -> L18a
            r1.y = r6     // Catch: java.lang.Throwable -> L18a
        L111:
            int r15 = r15 + 1
            r7 = r16
            r2 = 0
            goto L9e
        L117:
            r2 = 0
            goto L8e
        L11a:
            r16 = r7
            r6 = r8[r5]     // Catch: java.lang.Throwable -> L18a
            java.lang.Object r6 = r1.b(r6)     // Catch: java.lang.Throwable -> L18a
            android.view.WindowManager r6 = (android.view.WindowManager) r6     // Catch: java.lang.Throwable -> L18a
            r1.l = r6     // Catch: java.lang.Throwable -> L18a
            r6 = 2131034129(0x7f050011, float:1.7678767E38)
            android.view.View r6 = r3.findViewById(r6)     // Catch: java.lang.Throwable -> L18a
            android.widget.TextView r6 = (android.widget.TextView) r6     // Catch: java.lang.Throwable -> L18a
            r1.s = r6     // Catch: java.lang.Throwable -> L18a
            int r14 = r14 / r12
            if (r14 == r0) goto L156
            r6 = 2131034115(0x7f050003, float:1.7678738E38)
            android.view.View r6 = r3.findViewById(r6)     // Catch: java.lang.Throwable -> L18a
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6     // Catch: java.lang.Throwable -> L18a
            r1.P = r6     // Catch: java.lang.Throwable -> L18a
            r6 = 2131034121(0x7f050009, float:1.767875E38)
            android.view.View r6 = r3.findViewById(r6)     // Catch: java.lang.Throwable -> L18a
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6     // Catch: java.lang.Throwable -> L18a
            r1.Q = r6     // Catch: java.lang.Throwable -> L18a
            r6 = 2131034334(0x7f0500de, float:1.7679183E38)
            android.view.View r6 = r3.findViewById(r6)     // Catch: java.lang.Throwable -> L18a
        L151:
            android.widget.ListView r6 = (android.widget.ListView) r6     // Catch: java.lang.Throwable -> L18a
            r1.Y = r6     // Catch: java.lang.Throwable -> L18a
            goto L174
        L156:
            r6 = 2131034201(0x7f050059, float:1.7678913E38)
            android.view.View r6 = r3.findViewById(r6)     // Catch: java.lang.Throwable -> L18a
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6     // Catch: java.lang.Throwable -> L18a
            r1.P = r6     // Catch: java.lang.Throwable -> L18a
            r6 = 2131034151(0x7f050027, float:1.7678811E38)
            android.view.View r6 = r3.findViewById(r6)     // Catch: java.lang.Throwable -> L18a
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6     // Catch: java.lang.Throwable -> L18a
            r1.Q = r6     // Catch: java.lang.Throwable -> L18a
            r6 = 2131034161(0x7f050031, float:1.7678832E38)
            android.view.View r6 = r3.findViewById(r6)     // Catch: java.lang.Throwable -> L18a
            goto L151
        L174:
            r6 = 2131034122(0x7f05000a, float:1.7678753E38)
            android.view.View r6 = r3.findViewById(r6)     // Catch: java.lang.Throwable -> L18a
            android.widget.ListView r6 = (android.widget.ListView) r6     // Catch: java.lang.Throwable -> L18a
            r1.G = r6     // Catch: java.lang.Throwable -> L18a
            r7 = 2131034345(0x7f0500e9, float:1.7679205E38)
            android.view.View r7 = r3.findViewById(r7)     // Catch: java.lang.Throwable -> L18a
            r6.setEmptyView(r7)     // Catch: java.lang.Throwable -> L18a
            goto L1a0
        L18a:
            r6 = 2131034120(0x7f050008, float:1.7678749E38)
            android.view.View r6 = r3.findViewById(r6)     // Catch: java.lang.Throwable -> L1ca
            android.widget.ListView r6 = (android.widget.ListView) r6     // Catch: java.lang.Throwable -> L1ca
            r1.G = r6     // Catch: java.lang.Throwable -> L1ca
            r6 = 2131034150(0x7f050026, float:1.767881E38)
            android.view.View r6 = r3.findViewById(r6)     // Catch: java.lang.Throwable -> L1ca
            android.widget.TextView r6 = (android.widget.TextView) r6     // Catch: java.lang.Throwable -> L1ca
            r1.y = r6     // Catch: java.lang.Throwable -> L1ca
        L1a0:
            java.lang.Object r6 = r11.nextElement()     // Catch: java.lang.Throwable -> L1ca
            java.util.zip.ZipEntry r6 = (java.util.zip.ZipEntry) r6     // Catch: java.lang.Throwable -> L1ca
            r6 = 2131034219(0x7f05006b, float:1.767895E38)
            android.view.View r6 = r3.findViewById(r6)     // Catch: java.lang.Throwable -> L1ca
            android.widget.ImageView r6 = (android.widget.ImageView) r6     // Catch: java.lang.Throwable -> L1ca
            r1.p = r6     // Catch: java.lang.Throwable -> L1ca
            r6 = 2131034177(0x7f050041, float:1.7678864E38)
            android.view.View r6 = r3.findViewById(r6)     // Catch: java.lang.Throwable -> L1ca
            android.widget.ImageView r6 = (android.widget.ImageView) r6     // Catch: java.lang.Throwable -> L1ca
            r1.o = r6     // Catch: java.lang.Throwable -> L1ca
            r6 = 2131034185(0x7f050049, float:1.767888E38)
            android.view.View r6 = r3.findViewById(r6)     // Catch: java.lang.Throwable -> L1ca
            android.widget.TextView r6 = (android.widget.TextView) r6     // Catch: java.lang.Throwable -> L1ca
            r1.y = r6     // Catch: java.lang.Throwable -> L1ca
            r7 = r16
            goto L215
        L1ca:
            r7 = r16
            goto L1d1
        L1cd:
            r16 = r7
            goto L1d1
        L1d0:
            r7 = 0
        L1d1:
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.C = r0
            android.fix.WrapLayout[] r0 = r1.D
            r6 = 2131034399(0x7f05011f, float:1.7679314E38)
            android.view.View r6 = r3.findViewById(r6)
            android.fix.WrapLayout r6 = (android.fix.WrapLayout) r6
            r0[r5] = r6
            android.fix.WrapLayout[] r0 = r1.D
            r6 = 2131034393(0x7f050119, float:1.7679302E38)
            android.view.View r6 = r3.findViewById(r6)
            android.fix.WrapLayout r6 = (android.fix.WrapLayout) r6
            r0[r4] = r6
            android.fix.WrapLayout[] r0 = r1.D
            r6 = 2131034325(0x7f0500d5, float:1.7679164E38)
            android.view.View r6 = r3.findViewById(r6)
            android.fix.WrapLayout r6 = (android.fix.WrapLayout) r6
            r2 = 2
            r0[r2] = r6
            r0 = 2131034429(0x7f05013d, float:1.7679375E38)
            android.view.View r0 = r3.findViewById(r0)
            r1.E = r0
            r0 = 2131034336(0x7f0500e0, float:1.7679187E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.F = r0
        L215:
            if (r7 == 0) goto L222
            r7.close()     // Catch: java.lang.Throwable -> L21b
            goto L222
        L21b:
            r0 = move-exception
            r6 = r0
            java.lang.String r0 = "Failed close apk"
            android.ext.e1.s(r0, r6)
        L222:
            r0 = 2131034262(0x7f050096, float:1.7679037E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.t = r0
            r0 = 2131034445(0x7f05014d, float:1.7679408E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.u = r0
            r0 = 2131034291(0x7f0500b3, float:1.7679095E38)
            android.view.View r0 = r3.findViewById(r0)
            r1.v = r0
            r0 = 2131034387(0x7f050113, float:1.767929E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.w = r0
            r0 = 2131034220(0x7f05006c, float:1.7678951E38)
            android.view.View r0 = r3.findViewById(r0)
            r1.x = r0
            r0 = 2131034290(0x7f0500b2, float:1.7679093E38)
            android.view.View r0 = r3.findViewById(r0)
            r1.z = r0
            android.ext.Config.h()
            r19.l1()
            r0 = 2131034395(0x7f05011b, float:1.7679306E38)
            android.view.View r6 = r3.findViewById(r0)
            r1.Z = r6
            r6 = 2131034389(0x7f050115, float:1.7679294E38)
            android.view.View r7 = r3.findViewById(r6)
            r1.a0 = r7
            r7 = 2131034319(0x7f0500cf, float:1.7679152E38)
            android.view.View r8 = r3.findViewById(r7)
            r1.b0 = r8
            r8 = 2131034184(0x7f050048, float:1.7678878E38)
            android.view.View r9 = r3.findViewById(r8)
            r1.c0 = r9
            r9 = 2131034397(0x7f05011d, float:1.767931E38)
            android.view.View r9 = r3.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1.d0 = r9
            r9 = 2131034391(0x7f050117, float:1.7679298E38)
            android.view.View r9 = r3.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1.e0 = r9
            r3.setup()
            java.lang.String r9 = "settings"
            r10 = 2131034203(0x7f05005b, float:1.7678917E38)
            r1.N(r9, r8, r10)
            java.lang.String r8 = "search"
            r9 = 2131034398(0x7f05011e, float:1.7679312E38)
            r1.N(r8, r0, r9)
            java.lang.String r0 = "saved"
            r8 = 2131034392(0x7f050118, float:1.76793E38)
            r1.N(r0, r6, r8)
            java.lang.String r0 = "memory"
            r6 = 2131034323(0x7f0500d3, float:1.767916E38)
            r1.N(r0, r7, r6)
            android.widget.TabWidget r0 = r3.getTabWidget()
            r6 = 0
        L2c6:
            int r7 = r0.getTabCount()
            if (r6 >= r7) goto L353
            android.view.View r7 = r0.getChildTabViewAt(r6)
            r2 = 2
            if (r6 == 0) goto L2e9
            if (r6 == r4) goto L2e5
            if (r6 == r2) goto L2e1
            r8 = 3
            if (r6 == r8) goto L2dd
            r7 = 0
            r8 = 0
            goto L2ec
        L2dd:
            r8 = 2131034322(0x7f0500d2, float:1.7679158E38)
            goto L2ec
        L2e1:
            r8 = 2131034390(0x7f050116, float:1.7679296E38)
            goto L2ec
        L2e5:
            r8 = 2131034396(0x7f05011c, float:1.7679308E38)
            goto L2ec
        L2e9:
            r8 = 2131034202(0x7f05005a, float:1.7678915E38)
        L2ec:
            boolean r9 = r7 instanceof android.view.ViewGroup
            if (r9 != 0) goto L2f1
            goto L34f
        L2f1:
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r9 = 0
        L2f4:
            int r10 = r7.getChildCount()
            if (r9 >= r10) goto L309
            android.view.View r10 = r7.getChildAt(r9)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L306
            if (r10 != 0) goto L301
            goto L306
        L301:
            r11 = 8
            r10.setVisibility(r11)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L306
        L306:
            int r9 = r9 + 1
            goto L2f4
        L309:
            android.view.ViewGroup$LayoutParams r9 = r7.getLayoutParams()
            boolean r9 = r9 instanceof android.widget.LinearLayout.LayoutParams
            if (r9 == 0) goto L31c
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r10 = -2
            r11 = 1065353216(0x3f800000, float:1.0)
            r9.<init>(r5, r10, r11)
            r7.setLayoutParams(r9)
        L31c:
            r7.setMinimumWidth(r5)
            r7.setMinimumHeight(r5)
            r7.setPadding(r5, r5, r5, r5)
            android.view.View r8 = r3.findViewById(r8)
            android.view.View r9 = android.ext.Tools.O0(r8)
            r7.addView(r9)
            android.view.ViewGroup$LayoutParams r7 = r8.getLayoutParams()
            boolean r9 = r7 instanceof android.widget.LinearLayout.LayoutParams
            if (r9 == 0) goto L33f
            r9 = r7
            android.widget.LinearLayout$LayoutParams r9 = (android.widget.LinearLayout.LayoutParams) r9
            r10 = 17
            r9.gravity = r10
        L33f:
            boolean r9 = r7 instanceof android.widget.RelativeLayout.LayoutParams
            if (r9 == 0) goto L34c
            r9 = r7
            android.widget.RelativeLayout$LayoutParams r9 = (android.widget.RelativeLayout.LayoutParams) r9
            r10 = 13
            r11 = -1
            r9.addRule(r10, r11)
        L34c:
            r8.setLayoutParams(r7)
        L34f:
            int r6 = r6 + 1
            goto L2c6
        L353:
            r0.setMinimumWidth(r5)
            r0.setMinimumHeight(r5)
            r0 = 2131034326(0x7f0500d6, float:1.7679166E38)
            android.view.View r0 = r3.findViewById(r0)
            r1.J = r0
            r0 = 2131034327(0x7f0500d7, float:1.7679168E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.K = r0
            r0 = 2131034388(0x7f050114, float:1.7679292E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            r1.L = r0
            r2 = 2131034243(0x7f050083, float:1.7678998E38)
            android.view.View r2 = r3.findViewById(r2)
            r0.setEmptyView(r2)
            r0 = 2131034317(0x7f0500cd, float:1.7679148E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            r1.M = r0
            r0 = 2131034307(0x7f0500c3, float:1.7679128E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r1.P = r0
            r0 = 2131034356(0x7f0500f4, float:1.7679227E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r1.Q = r0
            r0 = 2131034181(0x7f050045, float:1.7678872E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            r1.Y = r0
            r0 = 2131034417(0x7f050131, float:1.767935E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.g0 = r0
            r1.j0 = r4
            android.widget.ImageView r0 = r1.q
            r2 = 4
            r0.setVisibility(r2)
            android.ext.MainService$h r0 = new android.ext.MainService$h
            r0.<init>(r1)
            r3.setOnTabChangedListener(r0)
            android.ext.q0 r0 = new android.ext.q0
            r0.<init>(r1)
            r1.H = r0
            android.view.View r2 = r1.z
            r2.setOnClickListener(r0)
            android.view.View r0 = r1.z
            android.ext.q0 r2 = r1.H
            r0.setTag(r2)
            android.ext.MainService$i r0 = new android.ext.MainService$i
            r2 = 2131297081(0x7f090339, float:1.8212097E38)
            r6 = 2130968639(0x7f04003f, float:1.7545937E38)
            r0.<init>(r1, r2, r6)
            r1.I = r0
            android.widget.TextView r2 = r1.u
            r2.setOnClickListener(r0)
            android.widget.TextView r0 = r1.w
            android.ext.p1 r2 = r1.I
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r1.g0
            r0.setOnClickListener(r1)
            r0 = 2131099686(0x7f060026, float:1.7811732E38)
            r2 = 0
            android.view.View r0 = a.d.f(r0, r2)
            android.ext.ShowApp r0 = (android.ext.ShowApp) r0
            r1.h0 = r0
            android.widget.ImageButton r0 = r1.Q
            r0.setOnClickListener(r1)
            r3.setCurrentTab(r4)
            android.widget.ImageView r0 = r1.o
            r0.setOnClickListener(r1)
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L41d
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.Throwable -> L41d
            r2 = r0
            goto L423
        L41d:
            r0 = move-exception
            java.lang.String r3 = "Failed get service activity"
            android.ext.e1.l(r3, r0)
        L423:
            android.ext.j r0 = new android.ext.j
            android.content.pm.PackageManager r3 = android.ext.Tools.B0()
            r0.<init>(r2, r3)
            r1.h = r0
            android.ext.f0 r0 = r1.i
            r0.N0()
            android.ext.f0 r0 = r1.i
            r0.G()
            android.ext.HotPoint r0 = android.ext.HotPoint.getInstance()
            r1.j = r0
            android.ext.d1 r0 = new android.ext.d1
            r0.<init>()
            r1.k0 = r0
            android.ext.b0.j(r19)
            android.widget.ImageView r0 = r1.K
            android.ext.Config.m(r0)
            android.widget.ImageView r0 = r1.o
            android.ext.Config.m(r0)
            android.widget.ImageView r0 = r1.F
            android.ext.Config.m(r0)
            android.widget.ImageView r0 = r1.F
            r0.setOnClickListener(r1)
            android.ext.p1[][] r0 = android.ext.MainService.J0
            r1.Z0(r0)
            r1.Y0(r0)
            r1.W0(r0)
            r19.V0()
            r2 = 0
        L46b:
            android.fix.WrapLayout[] r3 = r1.D
            int r6 = r3.length
            if (r2 >= r6) goto L48d
            r3 = r3[r2]
            r3.removeAllViews()
            r6 = 0
        L476:
            r7 = r0[r2]
            int r8 = r7.length
            if (r6 >= r8) goto L48a
            r7 = r7[r6]
            r7.g(r2, r6)
            android.widget.ImageView r7 = r7.b(r4)
            r3.addView(r7)
            int r6 = r6 + 1
            goto L476
        L48a:
            int r2 = r2 + 1
            goto L46b
        L48d:
            android.widget.ImageButton r2 = r1.P
            r2.setOnClickListener(r1)
            android.ext.MainService$j r2 = new android.ext.MainService$j
            java.lang.String r3 = "tmp"
            r2.<init>(r1, r3)
            android.view.View r3 = r1.J
            r3.setTag(r2)
            android.widget.ImageView r3 = r1.K
            r3.setTag(r2)
            android.ext.MainService$m r2 = new android.ext.MainService$m
            r2.<init>(r1, r0)
            android.view.View r0 = r1.J
            r0.setOnClickListener(r2)
            android.widget.ImageView r0 = r1.K
            r0.setOnClickListener(r2)
            android.widget.ImageView r0 = r1.p
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r1.q
            r0.setOnClickListener(r1)
            android.widget.TextView r0 = r1.s
            r0.setOnClickListener(r1)
            r19.G0()
            android.content.SharedPreferences r0 = android.ext.Tools.M0()
            java.lang.String r2 = "mem-fail"
            boolean r3 = r0.contains(r2)
            if (r3 == 0) goto L4e7
            r3 = 2131034182(0x7f050046, float:1.7678874E38)
            android.ext.Config$p r3 = android.ext.Config.b(r3)
            r3.f42d = r5
            android.ext.Config.k()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r2)
            r0.commit()
        L4e7:
            android.ext.f0 r0 = r1.i
            java.lang.String r2 = r19.I()
            r0.B0(r2)
            android.ext.MainService$n r0 = new android.ext.MainService$n
            r0.<init>(r1)
            android.widget.ListView r2 = r1.G
            android.widget.ListAdapter r2 = r2.getAdapter()
            r2.registerDataSetObserver(r0)
            android.widget.ListView r2 = r1.L
            android.widget.ListAdapter r2 = r2.getAdapter()
            r2.registerDataSetObserver(r0)
            android.widget.ListView r2 = r1.M
            android.widget.ListAdapter r2 = r2.getAdapter()
            r2.registerDataSetObserver(r0)
            r19.k1()
            r19.l1()
            android.ext.x r0 = new android.ext.x
            r0.<init>()
            r1.i0 = r0
            android.ext.MainService.I0 = r4
            r19.q1()
            r19.M()
            return
    }

    public void a0() {
            r0 = this;
            r0.s()
            r0.h1()
            return
    }

    boolean a1() {
            r9 = this;
            android.ext.HotPoint r0 = r9.j
            r1 = 1
            r2 = -1
            r4 = 1
            r6 = 0
            r7 = 1
            java.lang.String r8 = ""
            r0.t(r1, r2, r4, r6, r7, r8)
            android.ext.x r0 = r9.i0
            boolean r0 = r0.e(r1)
            return r0
    }

    public void b0() {
            r1 = this;
            java.lang.String r0 = "Service onDestroy"
            android.ext.e1.d(r0)
            r0 = 1
            r1.m1(r0)
            r1.j1()
            android.ext.f1.o()
            return
    }

    public void b1() {
            r11 = this;
            long r0 = r11.p0
            r2 = 0
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L58
            boolean r0 = r11.r0
            r1 = 10
            if (r0 == 0) goto L2c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 2131296944(0x7f0902b0, float:1.8211819E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r0.append(r2)
            r0.append(r1)
            r1 = 2131296981(0x7f0902d5, float:1.8211894E38)
        L24:
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.append(r1)
            goto L59
        L2c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 2131296821(0x7f090235, float:1.821157E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r0.append(r2)
            int r2 = android.ext.Config.i
            r3 = -1
            if (r2 == r3) goto L4d
            r0.append(r1)
            r2 = 2131297023(0x7f0902ff, float:1.821198E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r0.append(r2)
        L4d:
            boolean r2 = r11.q0
            if (r2 != 0) goto L59
            r0.append(r1)
            r1 = 2131297021(0x7f0902fd, float:1.8211975E38)
            goto L24
        L58:
            r0 = r4
        L59:
            d.a r1 = r11.s0
            int r1 = r1.i()
            boolean r2 = android.ext.b0.k()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = " ("
            r3.append(r5)
            long r5 = (long) r1
            r1 = 32
            java.lang.String r7 = android.ext.i0.c(r5, r1)
            r3.append(r7)
            java.lang.String r7 = ""
            if (r2 != 0) goto L81
            long r8 = r11.p0
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 == 0) goto L9f
        L81:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            if (r2 == 0) goto L8a
            java.lang.String r7 = "*"
        L8a:
            r5.append(r7)
            java.lang.String r2 = "/"
            r5.append(r2)
            long r6 = r11.p0
            java.lang.String r1 = android.ext.i0.c(r6, r1)
            r5.append(r1)
            java.lang.String r7 = r5.toString()
        L9f:
            r3.append(r7)
            java.lang.String r1 = ")"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            if (r0 != 0) goto Lae
            goto Lb2
        Lae:
            java.lang.String r4 = r0.toString()
        Lb2:
            int r0 = android.ext.AddressArrayAdapter.f23d
            if (r0 != 0) goto Lb7
            goto Lcf
        Lb7:
            r0 = 3
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]
            r2 = 0
            r0[r2] = r1
            r1 = 1
            java.lang.String r2 = " "
            r0[r1] = r2
            int r1 = android.ext.AddressArrayAdapter.f23d
            java.lang.CharSequence r1 = android.ext.n1.B(r1)
            r2 = 2
            r0[r2] = r1
            java.lang.CharSequence r1 = android.ext.Tools.x(r0)
        Lcf:
            android.ext.MainService$v r0 = new android.ext.MainService$v
            r0.<init>(r11, r4, r1)
            android.ext.n2.i(r0)
            return
    }

    public void c0() {
            r1 = this;
            boolean r0 = android.ext.MainService.I0
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r1.D0(r0)
            r1.c1()
            return
    }

    void c1() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ServiceProxy showDialog: "
            r0.append(r1)
            android.ext.i1 r1 = r7.n
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            android.ext.i1 r0 = r7.n
            if (r0 == 0) goto L2b
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "mainDialog != null"
            r0.<init>(r1)
            java.lang.String r1 = "Something going wrong"
            android.ext.e1.g(r1, r0)
            android.ext.i1 r0 = r7.n
            r0.dismiss()
        L2b:
            android.ext.i1 r0 = new android.ext.i1
            android.content.Context r1 = android.ext.MainService.context
            android.widget.TabHost r2 = r7.m
            r0.<init>(r1, r2)
            r7.n = r0
            r0 = 0
            r1 = 0
        L38:
            android.fix.WrapLayout[] r2 = r7.D
            int r3 = r2.length
            if (r1 >= r3) goto L49
            r2 = r2[r1]
            int r3 = android.ext.Config.f34g
            int r3 = r3 + (-1)
            r2.setFill(r3)
            int r1 = r1 + 1
            goto L38
        L49:
            android.ext.MainService$b0 r1 = new android.ext.MainService$b0
            r1.<init>(r7)
            android.ext.n2.i(r1)
            android.ext.ShowApp r1 = r7.h0
            r1.k()
            android.ext.j r1 = r7.h
            boolean r2 = r7.j0
            r3 = 0
            r1.a(r2, r3)
            android.ext.HotPoint r1 = r7.j
            r1.e()
            r7.k()
            android.ext.f0 r1 = r7.i
            r1.L()
            android.ext.x r1 = r7.i0
            boolean r1 = r1.b()
            if (r1 != 0) goto La2
            r7.E0()
            boolean r1 = android.ext.MainService.K0
            if (r1 == 0) goto La2
            android.ext.MainService.K0 = r0
            d.a r1 = r7.s0
            int r1 = r1.i()
            if (r1 != 0) goto L8f
            long r1 = r7.p0
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L8f
            r7.D0(r0)
        L8f:
            boolean r0 = android.ext.f0.w
            if (r0 == 0) goto L9b
            android.ext.t0 r0 = r7.V
            android.view.View r1 = r7.J
            r0.onClick(r1)
            goto La2
        L9b:
            android.ext.i2 r0 = r7.W
            android.view.View r1 = r7.J
            r0.onClick(r1)
        La2:
            r7.l1()
            r7.d1(r3)
            return
    }

    public void d0(int r2) {
            r1 = this;
            int r0 = android.ext.Config.w
            if (r0 == 0) goto L10
            int r0 = android.ext.Config.w
            if (r2 != r0) goto L10
            android.ext.MainService$x r2 = new android.ext.MainService$x
            r2.<init>(r1)
            android.ext.n2.i(r2)
        L10:
            return
    }

    public void d1(java.lang.Runnable r3) {
            r2 = this;
            java.lang.String r0 = "Failed showScriptEnd"
            if (r3 != 0) goto L27
            java.util.ArrayList r3 = r2.y0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.y0 = r1
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r3.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()     // Catch: java.lang.Throwable -> L21
            goto L11
        L21:
            r1 = move-exception
            android.ext.e1.s(r0, r1)
            goto L11
        L26:
            return
        L27:
            android.ext.i1 r1 = r2.n
            if (r1 == 0) goto L34
            r3.run()     // Catch: java.lang.Throwable -> L2f
            goto L39
        L2f:
            r3 = move-exception
            android.ext.e1.s(r0, r3)
            goto L39
        L34:
            java.util.ArrayList r0 = r2.y0
            r0.add(r3)
        L39:
            return
    }

    void e() {
            r8 = this;
            android.widget.TextView r0 = r8.s
            if (r0 == 0) goto L1c
            android.ext.z1$d r1 = r8.v0
            if (r1 != 0) goto L1c
            android.ext.f0 r1 = r8.i
            android.ext.InOut r1 = r1.f793b
            boolean r1 = r1.h()
            if (r1 == 0) goto L1c
            r1 = 2131296754(0x7f0901f2, float:1.8211434E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.setText(r1)
        L1c:
            android.widget.TextView r0 = r8.g0
            if (r0 == 0) goto L87
            r1 = 32
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 7
            java.lang.CharSequence[] r3 = new java.lang.CharSequence[r2]
            int r4 = r1.length()
            int r4 = r4 * 10
            r5 = 2131297094(0x7f090346, float:1.8212123E38)
            int r5 = r5 - r4
            java.lang.String r4 = android.ext.b2.f(r5)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = " "
            r6 = 1
            r3[r6] = r4
            android.ext.f0 r4 = r8.i
            java.lang.CharSequence r4 = r4.a0()
            r7 = 2
            r3[r7] = r4
            r4 = 3
            java.lang.String r7 = r1.substring(r5, r6)
            r3[r4] = r7
            int r4 = r1.length()
            int r4 = r4 * 7
            r2 = 2131034196(0x7f050054, float:1.7678903E38)
            int r2 = r2 - r4
            android.ext.Config$p r2 = android.ext.Config.b(r2)
            java.lang.CharSequence r2 = r2.a()
            r4 = 4
            r3[r4] = r2
            r2 = 5
            java.lang.String r4 = r1.substring(r5, r6)
            r3[r2] = r4
            java.lang.Object r2 = r8.z()
            int r2 = android.ext.Tools.L0(r2)
            int r1 = r1.length()
            int r2 = r2 * r1
            java.lang.String r1 = java.lang.Integer.toString(r2)
            r2 = 6
            r3[r2] = r1
            java.lang.CharSequence r1 = android.ext.Tools.x(r3)
            r0.setText(r1)
        L87:
            return
    }

    public void e0() {
            r1 = this;
            r0 = 0
            r1.f0(r0)
            return
    }

    void e1() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "startHotkeyDetection: "
            r0.append(r1)
            android.ext.HotPoint r1 = r2.j
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            android.ext.HotPoint r0 = r2.j
            if (r0 != 0) goto L1b
            return
        L1b:
            r0.m()
            android.ext.f0 r0 = r2.i
            r0.L()
            return
    }

    public void f0(byte r2) {
            r1 = this;
            android.ext.f0 r0 = r1.i
            r0.C(r2)
            android.ext.SavedListAdapter r2 = r1.t0
            r2.i()
            r2 = 0
            r1.D0(r2)
            android.widget.ListView r2 = r1.M
            r1.W(r2)
            android.widget.ListView r2 = r1.L
            r1.W(r2)
            return
    }

    public void f1(android.ext.c2 r1) {
            r0 = this;
            r0.O()
            r0.f216f = r1
            android.ext.MainService$f r1 = new android.ext.MainService$f
            r1.<init>(r0)
            android.ext.n2.i(r1)
            return
    }

    public void g0() {
            r2 = this;
            android.view.View r0 = r2.f0
            android.view.View r1 = r2.Z
            if (r0 == r1) goto Le
            android.view.View r1 = r2.a0
            if (r0 == r1) goto Le
            android.view.View r1 = r2.b0
            if (r0 != r1) goto L13
        Le:
            android.view.View r0 = r2.J
            android.ext.Tools.s(r0)
        L13:
            return
    }

    void g1() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "stopHotkeyDetection: "
            r0.append(r1)
            android.ext.HotPoint r1 = r2.j
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            android.ext.HotPoint r0 = r2.j
            if (r0 != 0) goto L1b
            return
        L1b:
            r0.e()
            return
    }

    void h(long r2) {
            r1 = this;
            android.ext.MainService$l r0 = new android.ext.MainService$l
            r0.<init>(r1, r2)
            android.ext.n2.i(r0)
            return
    }

    public void h0(java.lang.CharSequence r11) {
            r10 = this;
            r2 = -1
            r4 = 1
            r6 = 0
            r7 = 1
            r8 = 0
            r0 = r10
            r1 = r11
            r0.i0(r1, r2, r4, r6, r7, r8)
            return
    }

    void h1() {
            r1 = this;
            java.lang.String r0 = "stopService"
            android.ext.e1.d(r0)
            boolean r0 = android.ext.MainService.H0
            if (r0 == 0) goto Lf
            java.lang.String r0 = "Service stopService: already"
            android.ext.e1.d(r0)
            return
        Lf:
            r0 = 1
            android.ext.MainService.H0 = r0
            android.ext.f0 r0 = r1.i
            r0.P0()
            android.ext.HotPoint r0 = r1.j
            r0.n()
            r1.c()
            return
    }

    public void i0(java.lang.CharSequence r19, long r20, long r22, int r24, int r25, long r26) {
            r18 = this;
            r0 = r18
            r12 = r20
            r14 = r22
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L36
            int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r3 == 0) goto L36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = (double) r12
            double r5 = r5 * r3
            double r3 = (double) r14
            double r5 = r5 / r3
            java.lang.Double r3 = java.lang.Double.valueOf(r5)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "%.2f"
            java.lang.String r2 = android.ext.Tools.L1(r3, r2)
            r1.append(r2)
            java.lang.String r2 = " %"
            r1.append(r2)
        L34:
            r11 = r1
            goto L38
        L36:
            r1 = 0
            goto L34
        L38:
            android.ext.x r1 = r0.i0
            java.lang.String r16 = ""
            if (r11 != 0) goto L41
            r17 = r16
            goto L47
        L41:
            java.lang.String r2 = r11.toString()
            r17 = r2
        L47:
            r2 = r19
            r3 = r20
            r5 = r22
            r7 = r24
            r8 = r25
            r9 = r26
            r12 = r11
            r11 = r17
            r1.c(r2, r3, r5, r7, r8, r9, r11)
            if (r12 == 0) goto L64
            r1 = 4
            r12.setLength(r1)
            r1 = 37
            r12.append(r1)
        L64:
            android.ext.HotPoint r1 = r0.j
            r2 = 0
            if (r12 != 0) goto L6c
            r9 = r16
            goto L71
        L6c:
            java.lang.String r3 = r12.toString()
            r9 = r3
        L71:
            r3 = r20
            r5 = r22
            r7 = r24
            r8 = r25
            r1.t(r2, r3, r5, r7, r8, r9)
            return
    }

    public void i1() {
            r7 = this;
            boolean r0 = android.ext.m2.f1074a
            if (r0 == 0) goto L12
            android.ext.i1 r0 = r7.n
            if (r0 != 0) goto Ld
            r7.c0()
            goto L8c
        Ld:
            r7.t()
            goto L8c
        L12:
            android.ext.i1 r0 = r7.n     // Catch: java.lang.Throwable -> L42
            r1 = 131072(0x20000, float:1.83671E-40)
            java.lang.String r2 = "android.intent.action.MAIN"
            if (r0 == 0) goto L4d
            android.ext.r r0 = android.ext.r.n     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L4d
            android.ext.r r0 = android.ext.r.n     // Catch: java.lang.Throwable -> L42
            boolean r0 = r0.x()     // Catch: java.lang.Throwable -> L42
            if (r0 != 0) goto L27
            goto L4d
        L27:
            android.ext.z1$d r0 = r7.v0     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L8c
            java.lang.String r0 = r0.f1434c     // Catch: java.lang.Throwable -> L42
            android.content.Context r3 = android.ext.MainService.context     // Catch: java.lang.Throwable -> L42
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L42
            android.content.Intent r3 = r3.getLaunchIntentForPackage(r0)     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L44
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L42
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L42
            r3.setPackage(r0)     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r0 = move-exception
            goto L87
        L44:
            r3.setFlags(r1)     // Catch: java.lang.Throwable -> L42
            android.content.Context r0 = android.ext.MainService.context     // Catch: java.lang.Throwable -> L42
            r0.startActivity(r3)     // Catch: java.lang.Throwable -> L42
            goto L8c
        L4d:
            android.content.Context r0 = android.ext.MainService.context     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L42
            android.content.Context r3 = android.ext.MainService.context     // Catch: java.lang.Throwable -> L42
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L42
            android.content.Intent r3 = r3.getLaunchIntentForPackage(r0)     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L77
            java.lang.String r3 = android.ext.r.t()     // Catch: java.lang.Throwable -> L42
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L42
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L42
            r5 = 1
            r6 = 300(0x12c, float:4.2E-43)
            android.ext.Tools.w1(r6, r4, r5)     // Catch: java.lang.Throwable -> L42
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L42
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L42
            android.content.Intent r3 = r4.setClassName(r0, r3)     // Catch: java.lang.Throwable -> L42
        L77:
            r3.setFlags(r1)     // Catch: java.lang.Throwable -> L42
            android.content.Context r0 = android.ext.MainService.context     // Catch: java.lang.Throwable -> L42
            r0.startActivity(r3)     // Catch: java.lang.Throwable -> L42
            android.ext.i1 r0 = r7.n     // Catch: java.lang.Throwable -> L42
            if (r0 != 0) goto L8c
            r7.c0()     // Catch: java.lang.Throwable -> L42
            goto L8c
        L87:
            java.lang.String r1 = "bring to front fail"
            android.ext.e1.s(r1, r0)
        L8c:
            return
    }

    void j(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.z()
            android.ext.Tools.n(r0, r2)
            r1.U()
            return
    }

    public void j0(android.ext.c2 r2) {
            r1 = this;
            android.ext.MainService$e r0 = new android.ext.MainService$e
            r0.<init>(r1)
            android.ext.n2.i(r0)
            android.ext.c2 r0 = r1.f216f
            if (r0 != r2) goto Lf
            r2 = 0
            r1.f216f = r2
        Lf:
            return
    }

    public void k0(int r18) {
            r17 = this;
            r1 = r17
            r2 = r18
            r17.s()
            r0 = 100
            r3 = 0
            r4 = 1
            if (r2 > r0) goto Lf
            r5 = 1
            goto L10
        Lf:
            r5 = 0
        L10:
            r7 = 2131296456(0x7f0900c8, float:1.821083E38)
            r8 = 2131296819(0x7f090233, float:1.8211565E38)
            java.lang.String r9 = "\n\n"
            r10 = 2131296903(0x7f090287, float:1.8211736E38)
            if (r2 == r4) goto L1b1
            r12 = 2
            if (r2 == r12) goto L1ac
            r0 = 3
            if (r2 == r0) goto L1a8
            r0 = 4
            r13 = 2131296719(0x7f0901cf, float:1.8211363E38)
            if (r2 == r0) goto L1a3
            r0 = 9
            r14 = 2131296764(0x7f0901fc, float:1.8211454E38)
            if (r2 == r0) goto L164
            r15 = 10
            if (r2 == r15) goto L13e
            r13 = 2131296410(0x7f09009a, float:1.8210736E38)
            java.lang.String r14 = ": "
            switch(r2) {
                case 105: goto Laa;
                case 106: goto L6b;
                case 107: goto L62;
                case 108: goto L42;
                default: goto L3c;
            }
        L3c:
            r13 = 2131297058(0x7f090322, float:1.821205E38)
        L3f:
            r0 = 0
            goto L1b6
        L42:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r12 = 2131297017(0x7f0902f9, float:1.8211967E38)
            java.lang.String r12 = android.ext.Tools.N1(r12)
            r0.append(r12)
            r0.append(r14)
            r12 = 64
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r13 = 2131296417(0x7f0900a1, float:1.821075E38)
            goto L1b6
        L62:
            r10 = 2131296979(0x7f0902d3, float:1.821189E38)
            r0 = 0
            r13 = 2131296979(0x7f0902d3, float:1.821189E38)
            goto L1b6
        L6b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r13 = android.ext.b2.f(r13)
            r0.append(r13)
            r0.append(r15)
            r0.append(r4)
            r0.append(r14)
            r13 = 2131296411(0x7f09009b, float:1.8210738E38)
            java.lang.String r13 = android.ext.b2.f(r13)
            r0.append(r13)
            r0.append(r15)
            r0.append(r12)
            r0.append(r14)
            r12 = 2131296412(0x7f09009c, float:1.821074E38)
            java.lang.String r12 = android.ext.b2.f(r12)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r1.i(r0)
            r13 = 2131296409(0x7f090099, float:1.8210734E38)
            goto L1b6
        Laa:
            boolean r0 = android.ext.Config.C
            if (r0 == 0) goto Lf0
            java.lang.String r0 = android.ext.Config.E     // Catch: java.lang.Throwable -> Ld4
            android.content.pm.ApplicationInfo r0 = android.ext.Tools.Y(r0)     // Catch: java.lang.Throwable -> Ld4
            int r0 = r0.flags     // Catch: java.lang.Throwable -> Ld4
            r0 = r0 & r12
            if (r0 != 0) goto Lf0
            java.lang.String r0 = android.ext.b2.f(r8)     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object[] r11 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r16 = android.ext.Config.F     // Catch: java.lang.Throwable -> Lcf
            r11[r3] = r16     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r16 = android.ext.Config.F     // Catch: java.lang.Throwable -> Lcf
            r11[r4] = r16     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r0 = android.ext.Tools.L1(r0, r11)     // Catch: java.lang.Throwable -> Lcf
            r11 = 2131296819(0x7f090233, float:1.8211565E38)
            goto Lf4
        Lcf:
            r0 = move-exception
            r11 = 2131296819(0x7f090233, float:1.8211565E38)
            goto Ld8
        Ld4:
            r0 = move-exception
            r11 = 2131296903(0x7f090287, float:1.8211736E38)
        Ld8:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r6 = "Failed check vSpace: "
            r8.append(r6)
            java.lang.String r6 = android.ext.Config.E
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            android.ext.e1.s(r6, r0)
            r0 = 0
            goto Lf4
        Lf0:
            r0 = 0
            r11 = 2131296903(0x7f090287, float:1.8211736E38)
        Lf4:
            r6 = 2131296408(0x7f090098, float:1.8210732E38)
            if (r11 != r10) goto L138
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = android.ext.b2.f(r13)
            r0.append(r8)
            r0.append(r15)
            r0.append(r4)
            r0.append(r14)
            r8 = 2131296413(0x7f09009d, float:1.8210742E38)
            java.lang.String r8 = android.ext.b2.f(r8)
            r0.append(r8)
            r0.append(r15)
            r0.append(r12)
            r0.append(r14)
            boolean r8 = android.ext.Config.C
            if (r8 != 0) goto L130
            r8 = 2131296414(0x7f09009e, float:1.8210744E38)
        L128:
            java.lang.String r8 = android.ext.b2.f(r8)
            r0.append(r8)
            goto L134
        L130:
            r8 = 2131296415(0x7f09009f, float:1.8210746E38)
            goto L128
        L134:
            java.lang.String r0 = r0.toString()
        L138:
            r10 = r11
            r13 = 2131296408(0x7f090098, float:1.8210732E38)
            goto L1b6
        L13e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = android.ext.b2.f(r14)
            r0.append(r6)
            r0.append(r9)
            boolean r6 = android.ext.Config.C
            if (r6 == 0) goto L155
            r6 = 2131297090(0x7f090342, float:1.8212115E38)
            goto L158
        L155:
            r6 = 2131296914(0x7f090292, float:1.8211758E38)
        L158:
            java.lang.String r6 = android.ext.b2.f(r6)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            goto L1b6
        L164:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = android.ext.b2.f(r14)
            r0.append(r6)
            r0.append(r9)
            r6 = 2131296509(0x7f0900fd, float:1.8210937E38)
            java.lang.String r6 = android.ext.b2.f(r6)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            boolean r6 = android.ext.Config.C
            if (r6 == 0) goto L19e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r9)
            r0 = 2131296796(0x7f09021c, float:1.8211519E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
        L19e:
            java.lang.String r0 = r1.i(r0)
            goto L1b6
        L1a3:
            r0 = 0
            r10 = 2131296456(0x7f0900c8, float:1.821083E38)
            goto L1b6
        L1a8:
            r13 = 2131296382(0x7f09007e, float:1.821068E38)
            goto L1a3
        L1ac:
            r13 = 2131296304(0x7f090030, float:1.821052E38)
            goto L3f
        L1b1:
            r13 = 2131296844(0x7f09024c, float:1.8211616E38)
            goto L3f
        L1b6:
            if (r0 != 0) goto L1bc
            java.lang.String r0 = android.ext.b2.f(r10)
        L1bc:
            java.lang.String r6 = android.ext.b2.f(r13)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "{"
            r8.append(r11)
            r8.append(r2)
            r11 = 125(0x7d, float:1.75E-43)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            android.util.SparseBooleanArray r11 = r1.w0
            boolean r11 = r11.get(r2)
            if (r11 == 0) goto L209
            long r6 = java.lang.System.currentTimeMillis()
            long r9 = android.ext.MainService.T0
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 >= 0) goto L203
            r9 = 2000(0x7d0, double:9.88E-321)
            long r6 = r6 + r9
            android.ext.MainService.T0 = r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r2 = android.ext.b2.f(r13)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.ext.Tools.K1(r0, r3)
        L203:
            if (r5 == 0) goto L208
            r1.q(r4)
        L208:
            return
        L209:
            android.util.SparseBooleanArray r11 = r1.w0
            r11.put(r2, r4)
            android.app.AlertDialog$Builder r2 = android.ext.f.b()
            android.view.View r4 = android.ext.Tools.h0(r8)
            android.app.AlertDialog$Builder r2 = r2.setCustomTitle(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r9)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.app.AlertDialog$Builder r0 = r2.setMessage(r0)
            r2 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            if (r5 != 0) goto L23b
            r11 = 0
            goto L240
        L23b:
            android.ext.MainService$y r11 = new android.ext.MainService$y
            r11.<init>(r1)
        L240:
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r2, r11)
            android.app.AlertDialog$Builder r0 = r0.setCancelable(r3)
            r2 = 2131296455(0x7f0900c7, float:1.8210827E38)
            if (r10 != r7) goto L25a
            java.lang.String r2 = android.ext.b2.f(r2)
            android.ext.MainService$z r3 = new android.ext.MainService$z
            r3.<init>(r1)
        L256:
            r0.setNeutralButton(r2, r3)
            goto L27d
        L25a:
            r3 = 2131296409(0x7f090099, float:1.8210734E38)
            if (r13 != r3) goto L26c
            r2 = 2131296519(0x7f090107, float:1.8210957E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            android.ext.MainService$a0 r3 = new android.ext.MainService$a0
            r3.<init>(r1)
            goto L256
        L26c:
            r3 = 2131296819(0x7f090233, float:1.8211565E38)
            if (r10 != r3) goto L27d
            java.lang.String r2 = android.ext.b2.f(r2)
            android.ext.r$n r3 = new android.ext.r$n
            java.lang.String r4 = "kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2"
            r3.<init>(r4)
            goto L256
        L27d:
            android.ext.f.o(r0)
            return
    }

    void k1() {
            r5 = this;
            android.widget.ListView r0 = r5.G
            android.widget.ListAdapter r0 = r0.getAdapter()
            int r0 = r0.getCount()
            android.widget.TextView r1 = r5.d0
            r2 = 0
            r3 = 8
            if (r0 != 0) goto L14
            r4 = 8
            goto L15
        L14:
            r4 = 0
        L15:
            r1.setVisibility(r4)
            android.widget.TextView r1 = r5.d0
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r1.setText(r0)
            android.widget.ListView r0 = r5.L
            android.widget.ListAdapter r0 = r0.getAdapter()
            int r0 = r0.getCount()
            android.widget.TextView r1 = r5.e0
            if (r0 != 0) goto L31
            r2 = 8
        L31:
            r1.setVisibility(r2)
            android.widget.TextView r1 = r5.e0
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r1.setText(r0)
            r5.p1()
            return
    }

    void l() {
            r3 = this;
            boolean r0 = android.ext.MainService.P0
            if (r0 == 0) goto L27
            int r0 = android.ext.Config.B
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L27
            android.ext.z1$d r0 = r3.v0
            if (r0 == 0) goto L27
            boolean r0 = android.ext.e0.p()
            if (r0 != 0) goto L15
            goto L27
        L15:
            r0 = 0
            android.ext.MainService.P0 = r0
            android.ext.n0$i r0 = new android.ext.n0$i
            android.ext.MainService$e0 r1 = new android.ext.MainService$e0
            r1.<init>(r3)
            java.lang.String r2 = "CheckLibs"
            r0.<init>(r1, r2)
            r0.start()
        L27:
            return
    }

    public void l0(android.ext.w r22) {
            r21 = this;
            r1 = r21
            android.widget.ListView r0 = r1.G
            android.ext.Tools$a0 r2 = android.ext.Tools.J0(r0)
            byte r3 = r22.b()
            r22.j()     // Catch: java.io.IOException -> L125 java.lang.OutOfMemoryError -> L129
            int r0 = r22.k()     // Catch: java.io.IOException -> L125 java.lang.OutOfMemoryError -> L129
            int r5 = r22.a()     // Catch: java.io.IOException -> L125 java.lang.OutOfMemoryError -> L129
            int r0 = r0 - r5
            r5 = 1
            int r6 = r0 + (-1)
            r22.f()     // Catch: java.io.IOException -> L125 java.lang.OutOfMemoryError -> L129
            d.a r14 = r1.s0     // Catch: java.io.IOException -> L125 java.lang.OutOfMemoryError -> L129
            int r15 = android.ext.b0.i()     // Catch: java.io.IOException -> L125 java.lang.OutOfMemoryError -> L129
            android.ext.c r13 = new android.ext.c     // Catch: java.io.IOException -> L125 java.lang.OutOfMemoryError -> L129
            r13.<init>()     // Catch: java.io.IOException -> L125 java.lang.OutOfMemoryError -> L129
            monitor-enter(r14)     // Catch: java.io.IOException -> L125 java.lang.OutOfMemoryError -> L129
            boolean r16 = android.ext.MainService.S0     // Catch: java.lang.Throwable -> L5c
            r17 = 0
            android.ext.MainService.S0 = r17     // Catch: java.lang.Throwable -> L5c
            if (r16 != 0) goto L70
            int r0 = r14.i()     // Catch: java.lang.Throwable -> L5c java.lang.OutOfMemoryError -> L61
            long[] r7 = new long[r0]     // Catch: java.lang.Throwable -> L5c java.lang.OutOfMemoryError -> L61
            int[] r8 = new int[r0]     // Catch: java.lang.Throwable -> L5c java.lang.OutOfMemoryError -> L61
            android.ext.c r9 = new android.ext.c     // Catch: java.lang.Throwable -> L5c java.lang.OutOfMemoryError -> L61
            r9.<init>()     // Catch: java.lang.Throwable -> L5c java.lang.OutOfMemoryError -> L61
            r10 = 0
            r11 = 0
        L41:
            if (r10 >= r0) goto L67
            boolean r12 = r14.c(r10)     // Catch: java.lang.Throwable -> L5c java.lang.OutOfMemoryError -> L61
            if (r12 == 0) goto L63
            r14.f(r10, r9)     // Catch: java.lang.Throwable -> L5c java.lang.OutOfMemoryError -> L61
            long r4 = r9.f672a     // Catch: java.lang.Throwable -> L5c java.lang.OutOfMemoryError -> L61
            r7[r11] = r4     // Catch: java.lang.Throwable -> L5c java.lang.OutOfMemoryError -> L61
            int r4 = r11 + 1
            int r5 = r9.f674c     // Catch: java.lang.Throwable -> L5c java.lang.OutOfMemoryError -> L61
            int r5 = android.ext.c.w(r5)     // Catch: java.lang.Throwable -> L5c java.lang.OutOfMemoryError -> L61
            r8[r11] = r5     // Catch: java.lang.Throwable -> L5c java.lang.OutOfMemoryError -> L61
            r11 = r4
            goto L63
        L5c:
            r0 = move-exception
            r19 = r2
            goto L11d
        L61:
            r0 = move-exception
            goto L6b
        L63:
            int r10 = r10 + 1
            r5 = 1
            goto L41
        L67:
            r0 = r7
            r4 = r8
            r5 = r11
            goto L73
        L6b:
            java.lang.String r4 = "Failed save checked data"
            android.ext.e1.l(r4, r0)     // Catch: java.lang.Throwable -> L5c
        L70:
            r0 = 0
            r4 = 0
            r5 = 0
        L73:
            r14.d()     // Catch: java.lang.Throwable -> L5c
            int r7 = android.ext.InOut.n     // Catch: java.lang.Throwable -> L5c
            int r7 = r7 + 12
            int r7 = r6 / r7
            if (r3 != 0) goto L81
            if (r7 <= r15) goto L81
            r7 = r15
        L81:
            r14.e(r7)     // Catch: java.lang.Throwable -> L5c
            r7 = 0
        L85:
            int r8 = r22.a()     // Catch: java.lang.Throwable -> L5c
            int r8 = r6 - r8
            r9 = 10
            if (r8 <= r9) goto L98
            if (r3 != 0) goto L9c
            int r8 = r14.i()     // Catch: java.lang.Throwable -> L5c
            if (r8 >= r15) goto L98
            goto L9c
        L98:
            r19 = r2
            goto Lf5
        L9c:
            long r8 = r22.g()     // Catch: java.lang.Throwable -> L5c
            long r10 = r22.h()     // Catch: java.lang.Throwable -> L5c
            int r12 = r22.f()     // Catch: java.lang.Throwable -> L5c
            r13.f672a = r8     // Catch: java.lang.Throwable -> L5c
            r13.f674c = r12     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto Le1
            r18 = r6
            int r6 = android.ext.c.w(r12)     // Catch: java.lang.Throwable -> L5c
        Lb4:
            if (r7 >= r5) goto Ldb
            r19 = r2
            r1 = r0[r7]     // Catch: java.lang.Throwable -> Lcd
            int r20 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r20 != 0) goto Lcf
            r1 = r4[r7]     // Catch: java.lang.Throwable -> Lcd
            if (r1 != r6) goto Lc7
            int r7 = r7 + 1
            r1 = r7
            r2 = 1
            goto Le6
        Lc7:
            if (r1 <= r6) goto Lca
            goto Ldd
        Lca:
            int r7 = r7 + 1
            goto Ld6
        Lcd:
            r0 = move-exception
            goto L11d
        Lcf:
            boolean r1 = android.ext.Tools.S1(r1, r8)     // Catch: java.lang.Throwable -> Lcd
            if (r1 == 0) goto Ldd
            goto Lca
        Ld6:
            r1 = r21
            r2 = r19
            goto Lb4
        Ldb:
            r19 = r2
        Ldd:
            r1 = r7
            r2 = r16
            goto Le6
        Le1:
            r19 = r2
            r18 = r6
            goto Ldd
        Le6:
            r7 = r14
            r6 = r13
            r13 = r2
            r7.a(r8, r10, r12, r13)     // Catch: java.lang.Throwable -> Lcd
            r7 = r1
            r13 = r6
            r6 = r18
            r2 = r19
            r1 = r21
            goto L85
        Lf5:
            r14.k()     // Catch: java.lang.Throwable -> Lcd
            if (r3 == 0) goto L119
            int r0 = r14.i()     // Catch: java.lang.Throwable -> Lcd
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcd
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lcd
            r2 = 0
        L104:
            if (r2 >= r0) goto L113
            r4 = 0
            android.ext.c r5 = r14.f(r2, r4)     // Catch: java.lang.Throwable -> Lcd
            if (r5 == 0) goto L110
            r1.add(r5)     // Catch: java.lang.Throwable -> Lcd
        L110:
            int r2 = r2 + 1
            goto L104
        L113:
            r1.trimToSize()     // Catch: java.lang.Throwable -> Lcd
            android.ext.Script.d3(r3, r1)     // Catch: java.lang.Throwable -> Lcd
        L119:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lcd
        L11a:
            r1 = r21
            goto L169
        L11d:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> Lcd
            throw r0     // Catch: java.io.IOException -> L11f java.lang.OutOfMemoryError -> L121
        L11f:
            r0 = move-exception
            goto L12d
        L121:
            r0 = move-exception
        L122:
            r1 = r21
            goto L133
        L125:
            r0 = move-exception
            r19 = r2
            goto L12d
        L129:
            r0 = move-exception
            r19 = r2
            goto L122
        L12d:
            java.lang.String r1 = "Failed read"
            android.ext.e1.l(r1, r0)
            goto L11a
        L133:
            d.a r2 = r1.s0
            int r2 = r2.i()
            d.a r4 = r1.s0
            r4.d()
            d.a r4 = r1.s0
            r4.k()
            r4 = 2131296845(0x7f09024d, float:1.8211618E38)
            android.ext.Tools.H1(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "list.size() = "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = "; show count = "
            r4.append(r2)
            int r2 = android.ext.b0.i()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.ext.e1.s(r2, r0)
        L169:
            android.widget.ListView r0 = r1.G
            android.widget.ListAdapter r0 = r0.getAdapter()
            r1.V(r0)
            r21.b1()
            if (r3 != 0) goto L17e
            long r4 = r1.B
            r6 = 1
            long r4 = r4 + r6
            r1.B = r4
        L17e:
            android.widget.ListView r0 = r1.G
            r2 = r19
            android.ext.Tools.A1(r0, r2)
            android.ext.MainService r0 = android.ext.MainService.instance
            r0.p1()
            r2 = 0
            r1.X(r3, r2)
            return
    }

    public void l1() {
            r1 = this;
            r0 = 0
            r1.m1(r0)
            return
    }

    void m() {
            r1 = this;
            r0 = 0
            r1.q(r0)
            return
    }

    public void m0(android.ext.Script r2) {
            r1 = this;
            android.ext.MainService$d r0 = new android.ext.MainService$d
            r0.<init>(r1)
            android.ext.n2.i(r0)
            android.ext.Script r0 = r1.f212b
            if (r0 != r2) goto Lf
            r2 = 0
            r1.f212b = r2
        Lf:
            return
    }

    public void m1(boolean r10) {
            r9 = this;
            boolean r0 = android.ext.f1.f952b
            r1 = 1
            if (r0 == 0) goto L6
            r10 = 1
        L6:
            boolean r0 = android.ext.Config.vSpaceReal     // Catch: java.lang.Throwable -> La5
            r2 = 2
            if (r0 == 0) goto Ld
            r0 = 4
            goto Le
        Ld:
            r0 = 2
        Le:
            r3 = 0
            r4 = 0
            r5 = 0
        L11:
            if (r5 >= r0) goto Lce
            if (r5 < r2) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            android.content.Context r7 = android.ext.MainService.context     // Catch: java.lang.Throwable -> L25
            android.content.Context r7 = r7.getApplicationContext()     // Catch: java.lang.Throwable -> L25
            if (r6 == 0) goto L28
            android.content.Context r7 = android.ext.Config.a(r7)     // Catch: java.lang.Throwable -> L25
            goto L28
        L25:
            r6 = move-exception
            goto L9f
        L28:
            java.lang.String r8 = "notification"
            java.lang.Object r7 = r7.getSystemService(r8)     // Catch: java.lang.Throwable -> L25
            android.app.NotificationManager r7 = (android.app.NotificationManager) r7     // Catch: java.lang.Throwable -> L25
            if (r10 != 0) goto L36
            boolean r8 = android.ext.v.f1280d     // Catch: java.lang.Throwable -> L25
            if (r8 != 0) goto L3c
        L36:
            int r8 = android.ext.Config.B     // Catch: java.lang.Throwable -> L25
            r8 = r8 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L71
        L3c:
            if (r5 != 0) goto L43
            java.lang.String r8 = "add notification"
            android.ext.e1.d(r8)     // Catch: java.lang.Throwable -> L25
        L43:
            if (r7 == 0) goto L8a
            int r8 = r5 % 2
            if (r8 != 0) goto L4b
            r8 = 1
            goto L4c
        L4b:
            r8 = 0
        L4c:
            android.app.Notification r6 = r9.F(r8, r6)     // Catch: java.lang.Throwable -> L25
            r7.notify(r1, r6)     // Catch: java.lang.Throwable -> L25
            android.ext.v r7 = android.ext.v.f1277a     // Catch: java.lang.Throwable -> L25
            if (r7 == 0) goto Lce
            android.ext.v r7 = android.ext.v.f1277a     // Catch: java.lang.Throwable -> L25
            r7.startForeground(r1, r6)     // Catch: java.lang.Throwable -> L25
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r6.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r7 = "startForeground 2."
            r6.append(r7)     // Catch: java.lang.Throwable -> L25
            r6.append(r5)     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L25
            android.ext.e1.d(r6)     // Catch: java.lang.Throwable -> L25
            goto Lce
        L71:
            if (r5 != 0) goto L81
            java.lang.String r6 = "cancel notification"
            android.ext.e1.d(r6)     // Catch: java.lang.Throwable -> L25
            android.ext.v r6 = android.ext.v.f1277a     // Catch: java.lang.Throwable -> L25
            if (r6 == 0) goto L81
            android.ext.v r6 = android.ext.v.f1277a     // Catch: java.lang.Throwable -> L25
            r6.stopForeground(r1)     // Catch: java.lang.Throwable -> L25
        L81:
            if (r7 == 0) goto L8a
            r7.cancel(r1)     // Catch: java.lang.Throwable -> L25
            r7.cancelAll()     // Catch: java.lang.Throwable -> L25
            goto Lce
        L8a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r6.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r7 = "Failed get NotificationManager "
            r6.append(r7)     // Catch: java.lang.Throwable -> L25
            r6.append(r5)     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L25
            android.ext.e1.d(r6)     // Catch: java.lang.Throwable -> L25
            goto Lc7
        L9f:
            if (r4 == 0) goto La7
            r6.addSuppressed(r4)     // Catch: java.lang.Throwable -> La5
            goto La7
        La5:
            r10 = move-exception
            goto Lcb
        La7:
            int r4 = r0 + (-1)
            if (r5 != r4) goto Lc6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La5
            r4.<init>()     // Catch: java.lang.Throwable -> La5
            java.lang.String r7 = "Failed startForeground "
            r4.append(r7)     // Catch: java.lang.Throwable -> La5
            r4.append(r5)     // Catch: java.lang.Throwable -> La5
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> La5
            android.ext.e1.s(r4, r6)     // Catch: java.lang.Throwable -> La5
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> La5
            android.ext.n0.h(r4, r6, r3)     // Catch: java.lang.Throwable -> La5
        Lc6:
            r4 = r6
        Lc7:
            int r5 = r5 + 1
            goto L11
        Lcb:
            android.ext.e1.a(r10)
        Lce:
            return
    }

    void n(byte r2) {
            r1 = this;
            r0 = 0
            r1.o(r2, r0)
            return
    }

    public void n0(android.ext.Script r1) {
            r0 = this;
            android.ext.MainService$b r1 = new android.ext.MainService$b
            r1.<init>(r0)
            android.ext.n2.i(r1)
            return
    }

    void n1() {
            r2 = this;
            android.widget.ImageButton r0 = r2.Q
            boolean r1 = r2.R
            if (r1 != 0) goto La
            r1 = 2130968634(0x7f04003a, float:1.7545927E38)
            goto Ld
        La:
            r1 = 2130968637(0x7f04003d, float:1.7545933E38)
        Ld:
            r0.setImageResource(r1)
            return
    }

    void o(byte r2, boolean r3) {
            r1 = this;
            r0 = 1
            r1.p(r2, r3, r0)
            return
    }

    public void o0(byte r3, long r4, long r6, int r8) {
            r2 = this;
            r2.p0 = r4
            r6 = 0
            if (r8 != 0) goto L61
            r2.s()
            r7 = 1
            android.ext.MainService.S0 = r7
            if (r3 != 0) goto L61
            boolean r3 = android.ext.b0.k()
            if (r3 != 0) goto L5e
            int r3 = android.ext.Config.k
            if (r3 == 0) goto L5e
            int r3 = android.ext.b0.i()
            long r0 = (long) r3
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 <= 0) goto L5e
            r2.t()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r8 = 2131296943(0x7f0902af, float:1.8211817E38)
            java.lang.String r8 = android.ext.b2.f(r8)
            r3.append(r8)
            r8 = 32
            r3.append(r8)
            r8 = 2131296477(0x7f0900dd, float:1.8210872E38)
            java.lang.String r8 = android.ext.b2.f(r8)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0[r6] = r4
            java.lang.String r4 = android.ext.Tools.L1(r8, r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.ext.Tools.J1(r3)
            int r3 = android.ext.Config.k
            r4 = 2
            if (r3 != r4) goto L5a
            goto L5b
        L5a:
            r7 = 0
        L5b:
            android.ext.MainService.K0 = r7
            goto L61
        L5e:
            r2.D0(r7)
        L61:
            long r3 = r2.p0
            r7 = 0
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L6c
            r2.p(r6, r6, r6)
        L6c:
            return
    }

    public void o1(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L5
            r3.Q()
        L5:
            android.ext.d1 r4 = r3.k0
            double r0 = r4.e()
            r4 = 0
            r3.T0(r4, r0)
            android.ext.MainService r4 = android.ext.MainService.instance
            android.ext.c2 r4 = r4.f216f
            if (r4 == 0) goto L26
            java.lang.String r2 = "gg.setSpeed("
            r4.write(r2)
            java.lang.String r0 = java.lang.Double.toString(r0)
            r4.write(r0)
            java.lang.String r0 = ")\n"
            r4.write(r0)
        L26:
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r6) {
            r5 = this;
            android.widget.ImageView r0 = r5.p
            r1 = 1
            if (r6 == r0) goto L100
            android.widget.ImageView r0 = r5.q
            if (r6 == r0) goto L100
            android.widget.TextView r0 = r5.s
            if (r6 != r0) goto Lf
            goto L100
        Lf:
            android.widget.ImageButton r0 = r5.P
            if (r6 != r0) goto L18
            r5.E0()
            goto L103
        L18:
            android.widget.ImageView r0 = r5.o
            if (r6 != r0) goto L21
        L1c:
            r5.t()
            goto L103
        L21:
            android.widget.ImageButton r0 = r5.Q
            if (r6 != r0) goto L2a
            r5.C0(r1)
            goto L103
        L2a:
            android.widget.TextView r0 = r5.g0
            if (r6 != r0) goto L3a
            r6 = 2131034189(0x7f05004d, float:1.7678889E38)
            android.ext.Config$p r6 = android.ext.Config.b(r6)
            r6.b()
            goto L103
        L3a:
            if (r6 == 0) goto L103
            java.lang.Object r0 = r6.getTag()
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L4f
            java.lang.Object r6 = r6.getTag()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L53
        L4f:
            int r6 = r6.getId()
        L53:
            r0 = 0
            r2 = 2131296805(0x7f090225, float:1.8211537E38)
            java.lang.String r3 = "?"
            switch(r6) {
                case 2130968657: goto Lfd;
                case 2131034112: goto Lf4;
                case 2131034287: goto Lf0;
                case 2131034336: goto Lea;
                case 2131296674: goto L1c;
                case 2131296711: goto L99;
                case 2131296884: goto L5e;
                default: goto L5c;
            }
        L5c:
            goto L103
        L5e:
            android.ext.c2 r6 = r5.f216f
            if (r6 == 0) goto L66
            java.lang.String r3 = r6.c()
        L66:
            android.app.AlertDialog$Builder r6 = android.ext.f.b()
            r1 = 2131296888(0x7f090278, float:1.8211705E38)
            java.lang.String r1 = android.ext.Tools.N1(r1)
            android.view.View r1 = android.ext.Tools.h0(r1)
            android.app.AlertDialog$Builder r6 = r6.setCustomTitle(r1)
            android.app.AlertDialog$Builder r6 = r6.setMessage(r3)
            r1 = 2131296994(0x7f0902e2, float:1.821192E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.ext.MainService$r r3 = new android.ext.MainService$r
            r3.<init>(r5)
        L89:
            android.app.AlertDialog$Builder r6 = r6.setPositiveButton(r1, r3)
            java.lang.String r1 = android.ext.b2.f(r2)
            android.app.AlertDialog$Builder r6 = r6.setNegativeButton(r1, r0)
            android.ext.f.o(r6)
            goto L103
        L99:
            android.ext.Script r6 = r5.f212b
            if (r6 == 0) goto Lc4
            java.lang.Object r6 = r6.U
            if (r6 == 0) goto Lc6
            java.lang.String r3 = r6.toString()
            int r6 = r3.length()
            r1 = 250(0xfa, float:3.5E-43)
            if (r6 <= r1) goto Lc6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r4 = 0
            java.lang.String r1 = r3.substring(r4, r1)
            r6.append(r1)
            java.lang.String r1 = "..."
            r6.append(r1)
            java.lang.String r3 = r6.toString()
            goto Lc6
        Lc4:
            java.lang.String r3 = "??"
        Lc6:
            android.app.AlertDialog$Builder r6 = android.ext.f.b()
            r1 = 2131296928(0x7f0902a0, float:1.8211787E38)
            java.lang.String r1 = android.ext.Tools.N1(r1)
            android.view.View r1 = android.ext.Tools.h0(r1)
            android.app.AlertDialog$Builder r6 = r6.setCustomTitle(r1)
            android.app.AlertDialog$Builder r6 = r6.setMessage(r3)
            r1 = 2131296711(0x7f0901c7, float:1.8211346E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.ext.MainService$q r3 = new android.ext.MainService$q
            r3.<init>(r5)
            goto L89
        Lea:
            android.view.View r6 = r5.J
            android.ext.Tools.s(r6)
            goto L103
        Lf0:
            r5.c0()
            goto L103
        Lf4:
            android.ext.f0 r6 = r5.i
            r6.h()
            r5.s()
            goto L103
        Lfd:
            r5.f215e = r1
            goto L103
        L100:
            r5.r(r1)
        L103:
            return
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View r3) {
            r2 = this;
            android.ext.j r3 = r2.h
            android.ext.MainService$s r0 = new android.ext.MainService$s
            r0.<init>(r2)
            r1 = 0
            r3.a(r1, r0)
            r2.o1(r1)
            android.ext.HotPoint r3 = r2.j
            r3.x()
            r3 = 1
            return r3
    }

    void p(byte r3, boolean r4, boolean r5) {
            r2 = this;
            if (r4 == 0) goto L5
            r4 = 1
            r2.r0 = r4
        L5:
            r0 = 0
            r2.p0 = r0
            if (r5 == 0) goto L10
            android.ext.f0 r4 = r2.i
            r4.l(r3)
        L10:
            android.ext.MainService r3 = android.ext.MainService.instance
            android.ext.f0 r3 = r3.i
            android.ext.InOut r3 = r3.f793b
            r3.r()
            d.a r3 = r2.s0
            monitor-enter(r3)
            r3.d()     // Catch: java.lang.Throwable -> L33
            r3.k()     // Catch: java.lang.Throwable -> L33
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            android.widget.ListView r3 = r2.G
            android.widget.ListAdapter r3 = r3.getAdapter()
            r2.V(r3)
            r2.b1()
            r3 = 0
            android.ext.MainService.K0 = r3
            return
        L33:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            throw r4
    }

    public void p0(byte r8, int r9, int[] r10) {
            r7 = this;
            java.lang.String r0 = "mem-fail"
            r1 = 2131296985(0x7f0902d9, float:1.8211902E38)
            java.lang.String r2 = "\n"
            r3 = 2131296836(0x7f090244, float:1.82116E38)
            r4 = 1
            r5 = 0
            r6 = 0
            switch(r9) {
                case 0: goto L1b9;
                case 1: goto L1a9;
                case 2: goto L10;
                case 3: goto L1a0;
                case 4: goto L196;
                case 5: goto L18c;
                case 6: goto L186;
                case 7: goto L10;
                case 8: goto L183;
                case 9: goto L180;
                case 10: goto L17a;
                case 11: goto L154;
                case 12: goto L14e;
                case 13: goto L11f;
                case 14: goto L10e;
                case 15: goto L104;
                case 16: goto Ld8;
                case 17: goto La0;
                case 18: goto L9b;
                case 19: goto L96;
                case 20: goto L4a;
                case 21: goto L16;
                case 22: goto L12;
                default: goto L10;
            }
        L10:
            goto L1c6
        L12:
            r7.D0 = r4
            goto L1c6
        L16:
            r8 = r10[r4]
            if (r8 == 0) goto L1e
            r8 = 2131296447(0x7f0900bf, float:1.821081E38)
            goto L41
        L1e:
            r8 = 2
            r8 = r10[r8]
            if (r8 == 0) goto L27
            r8 = 2131296446(0x7f0900be, float:1.8210809E38)
            goto L41
        L27:
            boolean r8 = r7.C0
            if (r8 == 0) goto L3e
            int r8 = android.ext.Config.A
            r9 = 131072(0x20000, float:1.83671E-40)
            r8 = r8 & r9
            if (r8 == 0) goto L3e
            r7.C0 = r6
            r8 = 2131034187(0x7f05004b, float:1.7678884E38)
            android.ext.Config$p r8 = android.ext.Config.b(r8)
            r8.b()
        L3e:
            r8 = 2131296448(0x7f0900c0, float:1.8210813E38)
        L41:
            java.lang.String r8 = android.ext.b2.f(r8)
            android.ext.Tools.K1(r8, r4)
            goto L1c6
        L4a:
            android.app.AlertDialog$Builder r8 = android.ext.f.b()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r0 = 2131296874(0x7f09026a, float:1.8211677E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            r9.append(r0)
            java.lang.String r0 = "\n\n"
            r9.append(r0)
            r10 = r10[r6]
            if (r10 == 0) goto L6a
            r10 = 2131296876(0x7f09026c, float:1.8211681E38)
            goto L6d
        L6a:
            r10 = 2131296875(0x7f09026b, float:1.821168E38)
        L6d:
            java.lang.String r10 = android.ext.b2.f(r10)
            r9.append(r10)
            r9.append(r0)
            r10 = 2131296877(0x7f09026d, float:1.8211683E38)
            java.lang.String r10 = android.ext.b2.f(r10)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.app.AlertDialog$Builder r8 = r8.setMessage(r9)
            java.lang.String r9 = android.ext.b2.f(r3)
            android.app.AlertDialog$Builder r8 = r8.setPositiveButton(r9, r5)
        L91:
            android.ext.f.o(r8)
            goto L1c6
        L96:
            r7.S(r10)
            goto L1c6
        L9b:
            r7.X(r8, r5)
            goto L1c6
        La0:
            if (r8 != 0) goto L1c6
            android.app.AlertDialog$Builder r8 = android.ext.f.b()
            r9 = 2131297096(0x7f090348, float:1.8212127E38)
            android.view.View r9 = android.ext.Tools.g0(r9)
            android.app.AlertDialog$Builder r8 = r8.setCustomTitle(r9)
            r9 = 2131296667(0x7f09019b, float:1.8211257E38)
            java.lang.String r9 = android.ext.b2.f(r9)
            android.app.AlertDialog$Builder r8 = r8.setMessage(r9)
            r9 = 2131296274(0x7f090012, float:1.821046E38)
            java.lang.String r9 = android.ext.b2.f(r9)
            android.ext.MainService$w r10 = new android.ext.MainService$w
            r10.<init>(r7)
            android.app.AlertDialog$Builder r8 = r8.setPositiveButton(r9, r10)
            r9 = 2131296963(0x7f0902c3, float:1.8211858E38)
            java.lang.String r9 = android.ext.b2.f(r9)
            android.app.AlertDialog$Builder r8 = r8.setNegativeButton(r9, r5)
            goto L91
        Ld8:
            if (r8 != 0) goto L100
            r8 = 2131297068(0x7f09032c, float:1.821207E38)
            java.lang.String r8 = android.ext.b2.f(r8)
            boolean r9 = r7.D0
            if (r9 == 0) goto Lfb
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            r9.append(r2)
            java.lang.String r8 = android.ext.b2.f(r1)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
        Lfb:
            boolean r9 = r7.D0
        Lfd:
            android.ext.Tools.K1(r8, r9)
        L100:
            r7.D0 = r6
            goto L1c6
        L104:
            if (r8 != 0) goto L1c6
            r8 = 2131297069(0x7f09032d, float:1.8212073E38)
        L109:
            android.ext.Tools.I1(r8, r6)
            goto L1c6
        L10e:
            r9 = 2131296848(0x7f090250, float:1.8211624E38)
            if (r8 != 0) goto L116
        L113:
            android.ext.Tools.H1(r9)
        L116:
            java.lang.String r9 = android.ext.b2.f(r9)
            r7.X(r8, r9)
            goto L1c6
        L11f:
            if (r8 != 0) goto L9b
            r9 = 2131296849(0x7f090251, float:1.8211626E38)
            android.ext.Tools.H1(r9)
            android.app.AlertDialog$Builder r9 = android.ext.f.b()
            r10 = 2131296381(0x7f09007d, float:1.8210677E38)
            android.view.View r10 = android.ext.Tools.g0(r10)
            android.app.AlertDialog$Builder r9 = r9.setCustomTitle(r10)
            r10 = 2131296788(0x7f090214, float:1.8211503E38)
            java.lang.String r10 = android.ext.b2.f(r10)
            android.app.AlertDialog$Builder r9 = r9.setMessage(r10)
            java.lang.String r10 = android.ext.b2.f(r3)
            android.app.AlertDialog$Builder r9 = r9.setPositiveButton(r10, r5)
            android.ext.f.o(r9)
            goto L9b
        L14e:
            if (r8 != 0) goto L1c6
            r8 = 2131296850(0x7f090252, float:1.8211628E38)
            goto L109
        L154:
            if (r8 != 0) goto L100
            r8 = 2131296983(0x7f0902d7, float:1.8211898E38)
            java.lang.String r8 = android.ext.b2.f(r8)
            boolean r9 = r7.D0
            if (r9 == 0) goto L177
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            r9.append(r2)
            java.lang.String r8 = android.ext.b2.f(r1)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
        L177:
            boolean r9 = r7.D0
            goto Lfd
        L17a:
            if (r8 != 0) goto L1c6
            r8 = 2131296984(0x7f0902d8, float:1.82119E38)
            goto L109
        L180:
            r7.S = r6
            goto L1c6
        L183:
            r7.S = r4
            goto L1c6
        L186:
            r9 = 2131296342(0x7f090056, float:1.8210598E38)
            if (r8 != 0) goto L116
            goto L113
        L18c:
            if (r8 != 0) goto L9b
            r9 = 2131296341(0x7f090055, float:1.8210596E38)
        L191:
            android.ext.Tools.I1(r9, r6)
            goto L9b
        L196:
            r7.s()
            r9 = 2131296391(0x7f090087, float:1.8210697E38)
            if (r8 != 0) goto L116
            goto L113
        L1a0:
            r7.s()
            if (r8 != 0) goto L9b
            r9 = 2131296390(0x7f090086, float:1.8210695E38)
            goto L191
        L1a9:
            android.content.SharedPreferences r8 = android.ext.Tools.M0()
            android.content.SharedPreferences$Editor r8 = r8.edit()
            android.content.SharedPreferences$Editor r8 = r8.remove(r0)
        L1b5:
            r8.commit()
            goto L1c6
        L1b9:
            android.content.SharedPreferences r8 = android.ext.Tools.M0()
            android.content.SharedPreferences$Editor r8 = r8.edit()
            android.content.SharedPreferences$Editor r8 = r8.putBoolean(r0, r4)
            goto L1b5
        L1c6:
            return
    }

    void p1() {
            r1 = this;
            boolean r0 = android.ext.n2.e()
            if (r0 == 0) goto La
            r1.e()
            goto L12
        La:
            android.ext.MainService$u r0 = new android.ext.MainService$u
            r0.<init>(r1)
            android.ext.n2.i(r0)
        L12:
            return
    }

    void q(boolean r2) {
            r1 = this;
            r0 = 0
            r1.o(r0, r2)
            return
    }

    public void q0() {
            r0 = this;
            r0.p1()
            return
    }

    public void q1() {
            r17 = this;
            r1 = r17
            boolean r0 = android.ext.MainService.I0
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r17.H()
            r2 = 1
            int r3 = r0 + (-1)
            int r4 = android.ext.Tools.d1()
            int r0 = android.ext.Config.p
            int r5 = r3 * 2
            int r5 = r5 + r4
            int r5 = r2 << r5
            r0 = r0 & r5
            r5 = 0
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            int r6 = android.ext.Config.r
            if (r3 < 0) goto L3e
            int[] r7 = r1.z0
            r8 = r7[r3]
            if (r8 == r6) goto L3e
            r7[r3] = r6
            int r7 = r2 << r3
            r6 = r6 & r7
            if (r6 != 0) goto L33
            r6 = 0
            goto L35
        L33:
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L35:
            android.widget.TabHost r7 = r1.m
            android.view.View r7 = r7.getCurrentView()
            r7.setBackgroundColor(r6)
        L3e:
            android.view.View r6 = r1.J
            r7 = 8
            if (r0 != 0) goto L48
            if (r4 != 0) goto L48
            r8 = 0
            goto L4a
        L48:
            r8 = 8
        L4a:
            r6.setVisibility(r8)
            android.widget.ImageView r6 = r1.K
            if (r4 != r2) goto L57
            if (r3 < 0) goto L55
            r8 = 0
            goto L59
        L55:
            r8 = 4
            goto L59
        L57:
            r8 = 8
        L59:
            r6.setVisibility(r8)
            android.widget.ImageView r6 = r1.F
            if (r4 != 0) goto L62
            r8 = 0
            goto L64
        L62:
            r8 = 8
        L64:
            r6.setVisibility(r8)
            android.view.View r6 = r1.E
            if (r3 < 0) goto L6f
            if (r0 == 0) goto L6f
            r0 = 0
            goto L71
        L6f:
            r0 = 8
        L71:
            r6.setVisibility(r0)
            r6 = 0
        L75:
            android.fix.WrapLayout[] r0 = r1.D
            int r8 = r0.length
            if (r6 >= r8) goto Lbc
            r8 = r0[r6]
            int r0 = android.ext.Config.f34g
            int r0 = r0 - r2
            r8.setFill(r0)
            if (r6 != r3) goto L86
            r0 = 0
            goto L88
        L86:
            r0 = 8
        L88:
            r8.setVisibility(r0)
            long[] r0 = android.ext.Config.f29b
            int r9 = r6 * 2
            int r9 = r9 + r4
            r9 = r0[r9]
            r11 = 0
        L93:
            int r0 = r8.getChildCount()
            if (r11 >= r0) goto Lb9
            android.view.View r0 = r8.getChildAt(r11)     // Catch: java.lang.Throwable -> Lb2 java.lang.ArrayIndexOutOfBoundsException -> Lb6
            if (r0 != 0) goto La0
            goto Lb6
        La0:
            r12 = 1
            long r12 = r12 << r11
            long r12 = r12 & r9
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto Lac
            r12 = 0
            goto Lae
        Lac:
            r12 = 8
        Lae:
            r0.setVisibility(r12)     // Catch: java.lang.Throwable -> Lb2 java.lang.ArrayIndexOutOfBoundsException -> Lb6
            goto Lb6
        Lb2:
            r0 = move-exception
            android.ext.e1.a(r0)
        Lb6:
            int r11 = r11 + 1
            goto L93
        Lb9:
            int r6 = r6 + 1
            goto L75
        Lbc:
            return
    }

    void r(boolean r2) {
            r1 = this;
            android.ext.j r0 = r1.h
            r0.b(r2)
            return
    }

    public void r0() {
            r3 = this;
            r3.P()
            boolean r0 = r3.F0
            if (r0 == 0) goto L8
            return
        L8:
            r0 = 1
            r3.F0 = r0
            android.ext.z1$d r0 = r3.v0
            if (r0 != 0) goto L11
            r1 = 0
            goto L13
        L11:
            java.lang.String r1 = r0.f1434c
        L13:
            r2 = 0
            if (r0 != 0) goto L18
            r0 = 0
            goto L1a
        L18:
            boolean r0 = r0.n
        L1a:
            r3.r(r2)
            r3.J0()
            r3.s()
            r3.s0(r1, r0)
            return
    }

    void s() {
            r9 = this;
            android.ext.HotPoint r0 = r9.j
            r1 = 2
            r2 = -1
            r4 = 1
            r6 = 0
            r7 = 1
            java.lang.String r8 = ""
            r0.t(r1, r2, r4, r6, r7, r8)
            android.ext.x r0 = r9.i0
            r1 = 1
            r0.a(r1)
            android.ext.f0 r0 = r9.i
            r0.m()
            android.ext.f0 r0 = r9.i
            r0.L()
            r0 = 0
            r9.U = r0
            return
    }

    void s0(java.lang.String r6, boolean r7) {
            r5 = this;
            r0 = 2131296424(0x7f0900a8, float:1.8210764E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            r1 = 2131296905(0x7f090289, float:1.821174E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 2131296906(0x7f09028a, float:1.8211742E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r3 = 2131296626(0x7f090172, float:1.8211174E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r4 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r4 = android.ext.b2.f(r4)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4}
            android.app.AlertDialog$Builder r1 = android.ext.f.b()
            r2 = 2131296508(0x7f0900fc, float:1.8210935E38)
            android.view.View r2 = android.ext.Tools.g0(r2)
            android.app.AlertDialog$Builder r1 = r1.setCustomTitle(r2)
            android.ext.MainService$c0 r2 = new android.ext.MainService$c0
            r2.<init>(r5, r6, r7)
            android.app.AlertDialog$Builder r6 = r1.setItems(r0, r2)
            r7 = 0
            android.app.AlertDialog$Builder r6 = r6.setCancelable(r7)
            android.ext.f.o(r6)
            return
    }

    void t() {
            r1 = this;
            r0 = 1
            r1.u(r0)
            return
    }

    void u(boolean r12) {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ServiceProxy dismissDialog: "
            r0.append(r1)
            android.ext.i1 r1 = r11.n
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            android.ext.i1 r0 = r11.n
            if (r0 != 0) goto L1b
            return
        L1b:
            android.ext.x r0 = r11.i0
            r1 = 0
            r0.a(r1)
            android.ext.i1 r0 = r11.n
            r0.dismiss()
            r0 = 0
            r11.n = r0
            android.ext.ShowApp r2 = r11.h0
            r2.a(r12)
            android.ext.HotPoint r12 = r11.j
            r12.m()
            boolean r12 = r11.R
            r11.T = r12
            boolean r12 = r11.S
            int r2 = android.ext.Config.A
            r2 = r2 & 128(0x80, float:1.8E-43)
            r3 = 1
            if (r2 == 0) goto L42
            r2 = 1
            goto L43
        L42:
            r2 = 0
        L43:
            android.ext.x r4 = r11.i0
            boolean r4 = r4.b()
            if (r4 == 0) goto L132
            if (r2 != 0) goto L4f
            if (r12 == 0) goto L132
        L4f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 2131296854(0x7f090256, float:1.8211636E38)
            java.lang.String r5 = android.ext.Tools.N1(r5)
            r4.append(r5)
            java.lang.String r5 = ":\n"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 2131296306(0x7f090032, float:1.8210525E38)
            java.lang.String r6 = ";\n"
            java.lang.String r7 = "- "
            if (r2 == 0) goto La9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r7)
            java.lang.String r4 = android.ext.b2.f(r5)
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = 2131296677(0x7f0901a5, float:1.8211277E38)
            java.lang.String r10 = android.ext.Tools.N1(r10)
            r9.append(r10)
            java.lang.String r10 = ": 1"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8[r1] = r9
            java.lang.String r4 = android.ext.Tools.L1(r4, r8)
            r2.append(r4)
            r2.append(r6)
            java.lang.String r4 = r2.toString()
        La9:
            if (r12 == 0) goto L108
            int r12 = android.ext.Config.B
            r12 = r12 & 4
            if (r12 == 0) goto Lf5
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            r12.append(r7)
            java.lang.String r2 = android.ext.b2.f(r5)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r7 = 2131296293(0x7f090025, float:1.8210499E38)
            java.lang.String r7 = android.ext.Tools.N1(r7)
            r5.append(r7)
            java.lang.String r7 = ": "
            r5.append(r7)
            r7 = 2131297115(0x7f09035b, float:1.8212166E38)
            java.lang.String r7 = android.ext.b2.f(r7)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r4[r1] = r5
            java.lang.String r1 = android.ext.Tools.L1(r2, r4)
        Lea:
            r12.append(r1)
            r12.append(r6)
            java.lang.String r4 = r12.toString()
            goto L108
        Lf5:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            r12.append(r7)
            r1 = 2131296307(0x7f090033, float:1.8210527E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            goto Lea
        L108:
            java.lang.String r12 = r4.trim()
            boolean r1 = r11.U
            if (r1 != 0) goto L12f
            r11.U = r3
            android.content.Context r1 = android.ext.r.p
            android.app.AlertDialog$Builder r1 = android.ext.f.c(r1)
            android.app.AlertDialog$Builder r12 = r1.setMessage(r12)
            r1 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r12 = r12.setNegativeButton(r1, r0)
            android.app.AlertDialog r12 = r12.create()
            android.ext.f.m(r12)
            goto L132
        L12f:
            android.ext.Tools.J1(r12)
        L132:
            r11.z0()
            android.ext.f0 r12 = r11.i
            r12.L()
            r11.l1()
            return
    }

    public void u0() {
            r1 = this;
            java.lang.String r0 = "<<"
            android.ext.e1.d(r0)
            android.ext.d1 r0 = r1.k0
            r0.l()
            r0 = 1
            r1.o1(r0)
            return
    }

    int v() {
            r16 = this;
            r1 = r16
            r2 = 0
            android.ext.z1$d r0 = r1.v0     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = r0.f1434c     // Catch: java.lang.Throwable -> Lb1
            android.content.pm.ApplicationInfo r3 = android.ext.Tools.Y(r0)     // Catch: java.lang.Throwable -> Lb1
            r4 = 1
            if (r3 != 0) goto Lf
            return r4
        Lf:
            java.lang.String r0 = r3.nativeLibraryDir     // Catch: java.lang.Throwable -> Lb1
            r5 = 2
            if (r0 != 0) goto L15
            return r5
        L15:
            r6 = 20
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> Lb1
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> Lb1
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lb1
            java.io.File[] r7 = r7.listFiles()     // Catch: java.lang.Throwable -> Lb1
            r8 = 3
            if (r7 == 0) goto L162
            int r9 = r7.length     // Catch: java.lang.Throwable -> Lb1
            r10 = 0
            r11 = 0
        L28:
            java.lang.String r0 = "doCheckLibs: "
            if (r10 >= r9) goto Lb8
            r12 = r7[r10]     // Catch: java.lang.Throwable -> Lb1
            if (r11 == 0) goto L32
            goto Lb8
        L32:
            if (r12 == 0) goto Lb4
            java.lang.String r13 = r12.getName()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r14 = "lib"
            boolean r13 = r13.startsWith(r14)     // Catch: java.lang.Throwable -> Lb1
            if (r13 == 0) goto Lb4
            java.lang.String r13 = r12.getName()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r14 = ".so"
            boolean r13 = r13.endsWith(r14)     // Catch: java.lang.Throwable -> Lb1
            if (r13 != 0) goto L4d
            goto Lb4
        L4d:
            java.io.FileInputStream r13 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L96
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L96
            int r14 = r13.read(r6)     // Catch: java.lang.Throwable -> L96
            r15 = 13
            if (r14 <= r15) goto L98
            r14 = r6[r2]     // Catch: java.lang.Throwable -> L96
            r15 = 127(0x7f, float:1.78E-43)
            if (r14 != r15) goto L98
            r14 = r6[r4]     // Catch: java.lang.Throwable -> L96
            r15 = 69
            if (r14 != r15) goto L98
            r14 = r6[r5]     // Catch: java.lang.Throwable -> L96
            r15 = 76
            if (r14 != r15) goto L98
            r14 = r6[r8]     // Catch: java.lang.Throwable -> L96
            r15 = 70
            if (r14 != r15) goto L98
            r14 = 18
            r14 = r6[r14]     // Catch: java.lang.Throwable -> L96
            r15 = 40
            if (r14 != r15) goto L98
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r11.<init>()     // Catch: java.lang.Throwable -> L93
            r11.append(r0)     // Catch: java.lang.Throwable -> L93
            r11.append(r12)     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = " is ARM lib"
            r11.append(r0)     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Throwable -> L93
            android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L93
            r11 = 1
            goto L98
        L93:
            r0 = move-exception
            r11 = 1
            goto L9c
        L96:
            r0 = move-exception
            goto L9c
        L98:
            r13.close()     // Catch: java.lang.Throwable -> L96
            goto Lb4
        L9c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb1
            r13.<init>()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r14 = "Failed check lib "
            r13.append(r14)     // Catch: java.lang.Throwable -> Lb1
            r13.append(r12)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> Lb1
            android.ext.e1.l(r12, r0)     // Catch: java.lang.Throwable -> Lb1
            goto Lb4
        Lb1:
            r0 = move-exception
            goto L163
        Lb4:
            int r10 = r10 + 1
            goto L28
        Lb8:
            if (r11 != 0) goto Lbc
            goto L162
        Lbc:
            java.lang.String r3 = r3.sourceDir     // Catch: java.lang.Throwable -> Lb1
            if (r3 != 0) goto Lc2
            r0 = 4
            return r0
        Lc2:
            java.util.zip.ZipFile r5 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> Lb1
            r5.<init>(r3)     // Catch: java.lang.Throwable -> Lb1
            java.util.Enumeration r6 = r5.entries()     // Catch: java.lang.Throwable -> Lb1
        Lcb:
            boolean r7 = r6.hasMoreElements()     // Catch: java.lang.Throwable -> Lb1
            if (r7 == 0) goto Lff
            java.lang.Object r7 = r6.nextElement()     // Catch: java.lang.Throwable -> Lb1
            java.util.zip.ZipEntry r7 = (java.util.zip.ZipEntry) r7     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r9 = "lib/x86/lib"
            boolean r8 = r8.contains(r9)     // Catch: java.lang.Throwable -> Lb1
            if (r8 == 0) goto Lcb
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb1
            r6.<init>()     // Catch: java.lang.Throwable -> Lb1
            r6.append(r0)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = r7.getName()     // Catch: java.lang.Throwable -> Lb1
            r6.append(r0)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = " is x86 lib"
            r6.append(r0)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> Lb1
            android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> Lb1
            goto L100
        Lff:
            r4 = 0
        L100:
            r5.close()     // Catch: java.lang.Throwable -> Lb1
            if (r4 != 0) goto L107
            r0 = 5
            return r0
        L107:
            android.app.AlertDialog$Builder r0 = android.ext.f.b()     // Catch: java.lang.Throwable -> Lb1
            r4 = 2131296321(0x7f090041, float:1.8210555E38)
            java.lang.String r4 = android.ext.Tools.N1(r4)     // Catch: java.lang.Throwable -> Lb1
            android.view.View r4 = android.ext.Tools.h0(r4)     // Catch: java.lang.Throwable -> Lb1
            android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r4)     // Catch: java.lang.Throwable -> Lb1
            r4 = 2131296286(0x7f09001e, float:1.8210484E38)
            java.lang.String r4 = android.ext.b2.f(r4)     // Catch: java.lang.Throwable -> Lb1
            android.app.AlertDialog$Builder r0 = r0.setMessage(r4)     // Catch: java.lang.Throwable -> Lb1
            r4 = 2131296455(0x7f0900c7, float:1.8210827E38)
            java.lang.String r4 = android.ext.b2.f(r4)     // Catch: java.lang.Throwable -> Lb1
            boolean r5 = android.ext.Config.C     // Catch: java.lang.Throwable -> Lb1
            if (r5 != 0) goto L136
            android.ext.MainService$g0 r5 = new android.ext.MainService$g0     // Catch: java.lang.Throwable -> Lb1
            r5.<init>(r1, r3)     // Catch: java.lang.Throwable -> Lb1
            goto L13d
        L136:
            android.ext.r$n r5 = new android.ext.r$n     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r3 = "kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh278:0krz0wr0uhsodfh0dup0oleudulhv0zlwk0{;90oleudulhv0{0soruh2"
            r5.<init>(r3)     // Catch: java.lang.Throwable -> Lb1
        L13d:
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r4, r5)     // Catch: java.lang.Throwable -> Lb1
            r3 = 2131296963(0x7f0902c3, float:1.8211858E38)
            java.lang.String r3 = android.ext.b2.f(r3)     // Catch: java.lang.Throwable -> Lb1
            android.ext.MainService$f0 r4 = new android.ext.MainService$f0     // Catch: java.lang.Throwable -> Lb1
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lb1
            android.app.AlertDialog$Builder r0 = r0.setNeutralButton(r3, r4)     // Catch: java.lang.Throwable -> Lb1
            r3 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r3 = android.ext.b2.f(r3)     // Catch: java.lang.Throwable -> Lb1
            r4 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r3, r4)     // Catch: java.lang.Throwable -> Lb1
            android.ext.f.o(r0)     // Catch: java.lang.Throwable -> Lb1
            r0 = 6
            return r0
        L162:
            return r8
        L163:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed check libs for "
            r3.append(r4)
            android.ext.z1$d r4 = r1.v0
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.ext.e1.l(r3, r0)
            return r2
    }

    boolean v0() {
            r3 = this;
            r0 = 0
            boolean r0 = r3.w0(r0)
            android.ext.MainService r1 = android.ext.MainService.instance
            android.ext.c2 r1 = r1.f216f
            if (r1 == 0) goto L10
            java.lang.String r2 = "gg.processKill()\n"
            r1.write(r2)
        L10:
            return r0
    }

    public void w(int r3) {
            r2 = this;
            android.ext.f0 r0 = r2.i
            if (r0 == 0) goto Lb
            r1 = 80
            if (r3 < r1) goto Lb
            r0.z()
        Lb:
            return
    }

    boolean w0(byte r5) {
            r4 = this;
            android.ext.z1$d r0 = r4.v0
            if (r0 != 0) goto L10
            r5 = 2131296806(0x7f090226, float:1.821154E38)
            java.lang.String r5 = android.ext.b2.f(r5)
            android.ext.Tools.J1(r5)
            r5 = 0
            return r5
        L10:
            java.lang.String r1 = "Kill game"
            android.ext.e1.d(r1)
            android.ext.f0 r1 = r4.i
            int r2 = r0.f1437f
            java.lang.String r3 = r0.f1434c
            java.lang.String r0 = r0.f1435d
            r1.C0(r5, r2, r3, r0)
            android.ext.f0 r0 = r4.i
            r1 = 2
            r0.L0(r5, r1)
            r5 = 1
            return r5
    }

    public void x(java.lang.String r3, int r4, java.lang.String r5) {
            r2 = this;
            r2.P()
            android.ext.Script r0 = new android.ext.Script
            java.io.File r1 = new java.io.File
            r1.<init>(r3)
            r0.<init>(r1, r4, r5)
            r2.f212b = r0
            r0.R3()
            return
    }

    boolean x0(byte r2, boolean r3) {
            r1 = this;
            r0 = 0
            if (r3 != 0) goto L8
            android.ext.i1 r3 = r1.n
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r3 = r1.R
            if (r3 != 0) goto L1b
            r1.Q()
            android.ext.f0 r3 = r1.i
            r3.L0(r2, r0)
            r2 = 1
            r1.R = r2
            r1.n1()
            return r2
        L1b:
            return r0
    }

    void y(boolean r2) {
            r1 = this;
            android.ext.i1 r0 = r1.n
            if (r0 == 0) goto L5
            return
        L5:
            if (r2 == 0) goto Ld
            android.ext.ShowApp r2 = r1.h0
            r2.k()
            goto L13
        Ld:
            android.ext.ShowApp r2 = r1.h0
            r0 = 1
            r2.a(r0)
        L13:
            return
    }

    boolean y0(boolean r3) {
            r2 = this;
            r0 = 0
            boolean r3 = r2.x0(r0, r3)
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.c2 r0 = r0.f216f
            if (r0 == 0) goto L10
            java.lang.String r1 = "gg.processPause()\n"
            r0.write(r1)
        L10:
            return r3
    }

    java.lang.Object z() {
            r3 = this;
            android.view.View r0 = r3.f0
            android.view.View r1 = r3.Z
            if (r0 != r1) goto L9
            d.a r0 = r3.s0
            goto L26
        L9:
            android.view.View r1 = r3.a0
            r2 = 0
            if (r0 != r1) goto L18
            android.ext.SavedListAdapter r0 = r3.t0
            if (r0 != 0) goto L13
            goto L25
        L13:
            d.e r0 = r0.f()
            goto L26
        L18:
            android.view.View r1 = r3.b0
            if (r0 != r1) goto L25
            android.ext.n1 r0 = r3.N
            if (r0 == 0) goto L25
            boolean[] r0 = r0.f()
            goto L26
        L25:
            r0 = r2
        L26:
            return r0
    }

    boolean z0() {
            r3 = this;
            r0 = 0
            boolean r0 = r3.A0(r0)
            android.ext.MainService r1 = android.ext.MainService.instance
            android.ext.c2 r1 = r1.f216f
            if (r1 == 0) goto L10
            java.lang.String r2 = "gg.processResume()\n"
            r1.write(r2)
        L10:
            return r0
    }
}
