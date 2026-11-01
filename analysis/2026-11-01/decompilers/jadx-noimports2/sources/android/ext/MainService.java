package android.ext;

/* JADX INFO: loaded from: classes.dex */
public class MainService extends android.ext.k2 implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {
    private static int N0;
    static int O0;
    private static volatile boolean P0;
    private static volatile android.content.ComponentCallbacks Q0;
    private static volatile boolean R0;
    private static volatile boolean S0;
    private static long T0;
    public static volatile android.content.Context context;
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
    public static final java.lang.String G0 = android.ext.i.f1002d + "_preferences";
    public static volatile android.ext.MainService instance = null;
    public static volatile boolean H0 = false;
    public static volatile boolean I0 = false;
    public static final android.ext.p1[][] J0 = new android.ext.p1[3][];
    private static volatile boolean K0 = false;
    public static final boolean[] L0 = new boolean[176];
    public static final boolean[] M0 = new boolean[76];

    class a extends android.ext.p1 {
        a(int i, int i2) {
            super(i, i2);
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            int count = android.ext.MainService.this.t0.getCount();
            android.ext.h2[] h2VarArr = new android.ext.h2[count];
            for (int i = 0; i < count; i++) {
                h2VarArr[i] = android.ext.MainService.this.t0.getItem(i);
            }
            new android.ext.c1(android.ext.MainService.this.v0, h2VarArr);
        }
    }

    class a0 implements android.content.DialogInterface.OnClickListener {
        a0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.MainService.this.q(true);
            android.ext.ConfigListAdapter.t(catch_.me_.if_.you_.can_.R.string.help_games_protection_);
        }
    }

    class b implements java.lang.Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.MainService mainService = android.ext.MainService.this;
            mainService.f213c = mainService.C("script-interrupt", 0, 0, catch_.me_.if_.you_.can_.R.string.interrupt, catch_.me_.if_.you_.can_.R.drawable.ic_stop_white_24dp);
            android.ext.MainService mainService2 = android.ext.MainService.this;
            mainService2.f214d = null;
            mainService2.h0.o();
        }
    }

    class b0 implements java.lang.Runnable {
        b0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.MainService.this.n.show();
            android.ext.MainService.this.i0.e(false);
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f222a;

        c(boolean z) {
            this.f222a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = this.f222a;
            if (z) {
                android.ext.MainService.this.f215e = false;
            }
            android.ext.MainService mainService = android.ext.MainService.this;
            mainService.f214d = z ? mainService.C("script-ui-button", 0, 50, catch_.me_.if_.you_.can_.R.drawable.ic_ui_button_24dp, catch_.me_.if_.you_.can_.R.drawable.ic_ui_button_24dp) : null;
            android.ext.MainService.this.h0.o();
        }
    }

    class c0 implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f225b;

        class a implements java.lang.Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                android.ext.MainService.c0 c0Var = android.ext.MainService.c0.this;
                android.ext.MainService.this.h.c(true, c0Var.f224a);
            }
        }

        class b implements android.content.DialogInterface.OnDismissListener {
            b() {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(android.content.DialogInterface dialogInterface) {
                android.ext.MainService.c0 c0Var = android.ext.MainService.c0.this;
                android.ext.MainService.this.s0(c0Var.f224a, c0Var.f225b);
            }
        }

        class c implements android.content.DialogInterface.OnClickListener {

            class a implements java.lang.Runnable {

                /* JADX INFO: renamed from: android.ext.MainService$c0$c$a$a, reason: collision with other inner class name */
                class RunnableC0007a implements java.lang.Runnable {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ android.content.Intent f231a;

                    RunnableC0007a(android.content.Intent intent) {
                        this.f231a = intent;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            android.ext.Tools.f0().startActivity(this.f231a);
                        } catch (java.lang.Exception e2) {
                            android.ext.e1.l("Failed restart app 2: " + android.ext.MainService.c0.this.f224a, e2);
                        }
                    }
                }

                class b implements java.lang.Runnable {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ java.lang.String f233a;

                    b(java.lang.String str) {
                        this.f233a = str;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            android.ext.e2.n(this.f233a + " ''", 5);
                        } catch (java.lang.Throwable th) {
                            android.ext.e1.l("Failed unstub app: " + android.ext.MainService.c0.this.f224a, th);
                        }
                    }
                }

                /* JADX INFO: renamed from: android.ext.MainService$c0$c$a$c, reason: collision with other inner class name */
                class RunnableC0008c implements java.lang.Runnable {
                    RunnableC0008c() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        android.ext.MainService.c0 c0Var = android.ext.MainService.c0.this;
                        android.ext.MainService.this.h.c(true, c0Var.f224a);
                    }
                }

                a() {
                }

                /* JADX WARN: Code duplicated, block: B:24:0x0112 A[Catch: all -> 0x00e9, TRY_LEAVE, TryCatch #1 {all -> 0x00e9, blocks: (B:13:0x009e, B:15:0x00c8, B:17:0x00d8, B:20:0x00eb, B:22:0x00f1, B:24:0x0112), top: B:38:0x009e }] */
                @Override // java.lang.Runnable
                public void run() {
                    android.ext.e1.d("Restart stub: " + android.ext.MainService.c0.this.f224a);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("exec setprop wrap.");
                    java.lang.String str = android.ext.MainService.c0.this.f224a;
                    boolean z = false;
                    sb.append((str == null || str.length() <= 26) ? android.ext.MainService.c0.this.f224a : android.ext.MainService.c0.this.f224a.substring(0, 26));
                    java.lang.String string = sb.toString();
                    try {
                        android.ext.e2.n(string + " LD_PRELOAD=" + (android.ext.e0.g() + android.ext.e0.k(android.ext.MainService.c0.this.f225b)), 5);
                    } catch (java.lang.Throwable th) {
                        android.ext.e1.l("Failed stub app: " + android.ext.MainService.c0.this.f224a, th);
                    }
                    try {
                        if (!android.ext.e2.n("exec monkey -p " + android.ext.MainService.c0.this.f224a + " 1", 10).contains("Events injected")) {
                            android.content.Intent launchIntentForPackage = android.ext.Tools.B0().getLaunchIntentForPackage(android.ext.MainService.c0.this.f224a);
                            if (launchIntentForPackage == null) {
                                launchIntentForPackage = new android.content.Intent("android.intent.action.MAIN");
                                launchIntentForPackage.setPackage(android.ext.MainService.c0.this.f224a);
                            }
                            android.content.ComponentName component = launchIntentForPackage.getComponent();
                            if (component != null) {
                                if (!android.ext.e2.n("exec am start -n " + component.flattenToString(), 10).contains("Starting: Intent")) {
                                    launchIntentForPackage.setFlags(268435456);
                                    android.ext.n2.i(new android.ext.MainService.c0.c.a.RunnableC0007a(launchIntentForPackage));
                                }
                            } else {
                                launchIntentForPackage.setFlags(268435456);
                                android.ext.n2.i(new android.ext.MainService.c0.c.a.RunnableC0007a(launchIntentForPackage));
                            }
                        }
                        z = true;
                    } catch (java.lang.Throwable th2) {
                        android.ext.e1.l("Failed restart app: " + android.ext.MainService.c0.this.f224a, th2);
                    }
                    android.ext.n2.c().postDelayed(new android.ext.MainService.c0.c.a.b(string), z ? 10000L : 0L);
                    android.ext.n2.d().postDelayed(new android.ext.MainService.c0.c.a.RunnableC0008c(), z ? 4000L : 0L);
                }
            }

            c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                android.ext.n2.h(new android.ext.MainService.c0.c.a());
            }
        }

        c0(java.lang.String str, boolean z) {
            this.f224a = str;
            this.f225b = z;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            boolean z = false;
            android.ext.MainService.this.F0 = false;
            if (i == 0) {
                new android.ext.p0(1100).onClick(dialogInterface, i);
            } else if (i == 1) {
                android.ext.e1.d("Restart: " + this.f224a);
                try {
                    android.content.Intent launchIntentForPackage = android.ext.Tools.B0().getLaunchIntentForPackage(this.f224a);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new android.content.Intent("android.intent.action.MAIN");
                        launchIntentForPackage.setPackage(this.f224a);
                    }
                    launchIntentForPackage.setFlags(268435456);
                    android.ext.Tools.f0().startActivity(launchIntentForPackage);
                    z = true;
                } catch (java.lang.Exception e2) {
                    android.ext.e1.l("Failed restart app: " + this.f224a, e2);
                }
                android.ext.n2.d().postDelayed(new android.ext.MainService.c0.a(), z ? 4000L : 0L);
            } else if (i != 2) {
                if (i == 3) {
                    android.ext.ConfigListAdapter.t(catch_.me_.if_.you_.can_.R.string.help_games_protection_title);
                }
                android.ext.MainService.this.h.g();
            } else if (android.ext.f1.z(null, new android.ext.MainService.c0.b())) {
                android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.restart_game_without_protection)).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.warn_restart_off_prot)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), (android.content.DialogInterface.OnClickListener) null).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), new android.ext.MainService.c0.c()));
            }
            android.ext.Tools.D(dialogInterface);
        }
    }

    class d implements java.lang.Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.MainService mainService = android.ext.MainService.this;
            mainService.f213c = null;
            mainService.f214d = null;
            mainService.h0.e();
            android.ext.MainService.this.D0(true);
        }
    }

    class d0 implements java.lang.Runnable {
        d0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                android.ext.MainService.this.i.K0((byte) 2);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    class e implements java.lang.Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.MainService mainService = android.ext.MainService.this;
            mainService.f217g = null;
            mainService.h0.d();
        }
    }

    class e0 implements java.lang.Runnable {
        e0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.e1.d("doCheckLibs: " + android.ext.MainService.this.v());
        }
    }

    class f implements java.lang.Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.MainService mainService = android.ext.MainService.this;
            mainService.f217g = mainService.C("record-interrupt", 0, 0, catch_.me_.if_.you_.can_.R.string.record, catch_.me_.if_.you_.can_.R.drawable.ic_stop_white_24dp);
            android.ext.MainService.this.h0.n();
        }
    }

    class f0 implements android.content.DialogInterface.OnClickListener {
        f0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_check_libs).f42d = 0;
            android.ext.Config.k();
        }
    }

    class g extends android.ext.FloatPanel {
        final /* synthetic */ java.lang.String p;
        final /* synthetic */ int q;
        final /* synthetic */ int r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(android.content.Context context, java.lang.String str, int i, int i2) {
            super(context);
            this.p = str;
            this.q = i;
            this.r = i2;
        }

        @Override // android.ext.FloatPanel
        protected boolean f() {
            return true;
        }

        @Override // android.ext.FloatPanel
        protected int getDefX() {
            return this.q;
        }

        @Override // android.ext.FloatPanel
        protected int getDefY() {
            return this.r;
        }

        @Override // android.ext.FloatPanel
        protected java.lang.String getPrefName() {
            return this.p;
        }
    }

    class g0 implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f242a;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: android.ext.MainService$g0$a$a, reason: collision with other inner class name */
            class RunnableC0009a implements java.lang.Runnable {
                RunnableC0009a() {
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v0 */
                /* JADX WARN: Type inference failed for: r0v1, types: [int] */
                /* JADX WARN: Type inference failed for: r0v11 */
                /* JADX WARN: Type inference failed for: r0v12 */
                /* JADX WARN: Type inference failed for: r0v13 */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r0v9 */
                @Override // java.lang.Runnable
                public void run() {
                    ?? F = 2131296893;
                    try {
                        java.lang.Process processQ = android.ext.e2.q(android.ext.Tools.removeNewLinesChars("h{hf#sp#lqvwdoo#0u#00del#{;9#") + android.ext.MainService.g0.this.f242a);
                        if (processQ == null) {
                            F = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.reinstall_failed) + "\nnull";
                        } else {
                            int iWaitFor = processQ.waitFor();
                            if (iWaitFor == 0) {
                                F = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.reinstall_ended);
                            } else {
                                F = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.reinstall_failed) + "\ncode: " + iWaitFor;
                            }
                        }
                    } catch (java.lang.InterruptedException e2) {
                        android.ext.e1.g("Reinstall failed", e2);
                        F = android.ext.b2.f(F) + "\n" + e2.getMessage();
                    }
                    android.ext.Tools.K1(F, 1);
                }
            }

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                android.ext.Tools.I1(catch_.me_.if_.you_.can_.R.string.reinstall_started, 0);
                new android.ext.n0.i(new android.ext.MainService.g0.a.RunnableC0009a(), "FixLibs").start();
            }
        }

        g0(java.lang.String str) {
            this.f242a = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.f.o(android.ext.f.b().setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.try_reinstall_x86)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.yes), new android.ext.MainService.g0.a()).setNeutralButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.site), new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh278:0krz0wr0uhsodfh0dup0oleudulhv0zlwk0{;90oleudulhv0{0soruh2")).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.no), (android.content.DialogInterface.OnClickListener) null));
        }
    }

    class h implements android.widget.TabHost.OnTabChangeListener {
        h() {
        }

        @Override // android.widget.TabHost.OnTabChangeListener
        public void onTabChanged(java.lang.String str) {
            android.ext.MainService mainService = android.ext.MainService.instance;
            int iH = mainService.H();
            mainService.r.setVisibility(iH >= 1 ? 0 : 8);
            mainService.s.setVisibility(iH != 3 ? 0 : 8);
            mainService.z.setVisibility(iH == 1 ? 0 : 8);
            mainService.v.setVisibility(iH == 3 ? 0 : 8);
            mainService.w.setVisibility(iH == 2 ? 0 : 8);
            mainService.q1();
            mainService.f0 = mainService.m.getCurrentView();
            android.ext.Tools.s(mainService.P);
            mainService.p1();
            android.ext.ConfigListAdapter configListAdapter = android.ext.MainService.this.x0;
            if (configListAdapter != null) {
                configListAdapter.l(iH == 0);
            }
        }
    }

    class h0 extends android.ext.p1 {
        h0(int i, int i2) {
            super(i, i2);
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            android.ext.Tools.H1(catch_.me_.if_.you_.can_.R.string.speedhack_open);
            android.ext.MainService.this.t();
            android.ext.MainService.this.onLongClick(null);
        }
    }

    class i extends android.ext.p1 {
        i(int i, int i2) {
            super(i, i2);
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            android.ext.MainService.this.N.b();
        }
    }

    class i0 extends android.ext.p1 {
        i0(int i, int i2) {
            super(i, i2);
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            new android.ext.c1(android.ext.MainService.this.v0, null);
        }
    }

    class j extends android.ext.p1 {
        j(java.lang.String str) {
            super(str);
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View view) {
        }
    }

    private class j0 extends android.ext.p1 {

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ long[] f252a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long[] f253b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f254c;

            a(long[] jArr, long[] jArr2, int i) {
                this.f252a = jArr;
                this.f253b = jArr2;
                this.f254c = i;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                android.ext.MainService.j0.this.i(this.f252a, this.f253b, this.f254c, i);
            }
        }

        class b implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String[] f256a;

            b(java.lang.String[] strArr) {
                this.f256a = strArr;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                android.ext.Tools.z(this.f256a[i]);
                android.ext.Tools.D(dialogInterface);
            }
        }

        public j0() {
            super(catch_.me_.if_.you_.can_.R.string.calculate_offset_xor, catch_.me_.if_.you_.can_.R.drawable.ic_vector_difference_white_24dp);
        }

        private void h() {
            int i;
            int i2;
            java.lang.Object objZ = android.ext.MainService.this.z();
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            if (objZ instanceof d.a) {
                d.a aVar = (d.a) objZ;
                android.ext.c cVar = new android.ext.c();
                int i3 = aVar.i();
                i = 0;
                i2 = 0;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (aVar.c(i4)) {
                        if (i < 10) {
                            aVar.f(i4, cVar);
                            jArr[i] = cVar.f672a;
                            jArr2[i] = cVar.f673b & android.ext.c.f668d[cVar.D()];
                            i++;
                        }
                        i2++;
                        if (i2 > 10) {
                            break;
                        }
                    }
                }
            } else if (objZ instanceof d.e) {
                d.e eVar = (d.e) objZ;
                int iL = eVar.l();
                int i5 = 0;
                int i6 = 0;
                for (int i7 = 0; i7 < iL; i7++) {
                    if (eVar.a(i7)) {
                        android.ext.h2 h2Var = (android.ext.h2) eVar.n(i7);
                        if (h2Var instanceof android.ext.h2) {
                            if (i5 < 10) {
                                jArr[i5] = h2Var.f672a;
                                jArr2[i5] = h2Var.f673b & android.ext.c.f668d[h2Var.D()];
                                i5++;
                            }
                            i6++;
                            if (i6 > 10) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                i2 = i6;
                i = i5;
            } else if (objZ instanceof boolean[]) {
                android.ext.n1 n1Var = android.ext.MainService.this.N;
                boolean[] zArr = (boolean[]) objZ;
                int length = zArr.length - 1;
                i = 0;
                i2 = 0;
                for (int i8 = 1; i8 < length; i8++) {
                    if (zArr[i8]) {
                        if (i < 10) {
                            jArr[i] = n1Var.e(i8);
                            android.ext.c cVar2 = (android.ext.c) n1Var.getItem(i8);
                            jArr2[i] = cVar2.f673b & android.ext.c.f668d[cVar2.D()];
                            i++;
                        }
                        i2++;
                        if (i2 > 10) {
                            break;
                        }
                    }
                }
            } else {
                i = 0;
                i2 = 0;
            }
            if (i < 2) {
                android.ext.Tools.J1(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.need_select_more), 2));
                return;
            }
            if (i2 > i) {
                android.ext.Tools.J1(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.used_only_first), java.lang.Integer.valueOf(i)));
            }
            android.ext.f.o(android.ext.f.b().setAdapter(new android.ext.ArrayAdapter(android.ext.MainService.context, new java.lang.String[]{android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.offset), "XOR"}), new android.ext.MainService.j0.a(jArr, jArr2, i)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), (android.content.DialogInterface.OnClickListener) null));
        }

        void i(long[] jArr, long[] jArr2, int i, int i2) {
            int i3 = i - 1;
            int i4 = (i * i3) / 2;
            java.lang.String[] strArr = new java.lang.String[i4];
            java.lang.String[] strArr2 = new java.lang.String[i4];
            int i5 = 0;
            int i6 = 0;
            while (i5 < i3) {
                int i7 = i5 + 1;
                for (int i8 = i7; i8 < i; i8++) {
                    long j = jArr[i5];
                    long j2 = jArr[i8];
                    java.lang.String upperCase = i2 == 0 ? java.lang.Long.toHexString(j2 - j).toUpperCase(java.util.Locale.US) : android.ext.Tools.L1("%,d", java.lang.Long.valueOf(jArr2[i5] ^ jArr2[i8]));
                    strArr2[i6] = upperCase;
                    strArr[i6] = android.ext.t2.e(8, j) + " - " + android.ext.t2.e(8, j2) + ": " + upperCase;
                    i6++;
                }
                i5 = i7;
            }
            android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.select_copy_item)).setAdapter(new android.ext.ArrayAdapter(android.ext.MainService.context, strArr), new android.ext.MainService.j0.b(strArr2)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), (android.content.DialogInterface.OnClickListener) null));
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            h();
        }
    }

    class k implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.widget.ListAdapter f258a;

        k(android.widget.ListAdapter listAdapter) {
            this.f258a = listAdapter;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.widget.ListAdapter listAdapter = this.f258a;
            if (listAdapter instanceof android.ext.ConfigListAdapter) {
                ((android.ext.ConfigListAdapter) listAdapter).x();
            }
            android.widget.ListAdapter listAdapter2 = this.f258a;
            if (listAdapter2 instanceof android.widget.BaseAdapter) {
                try {
                    ((android.widget.BaseAdapter) listAdapter2).notifyDataSetChanged();
                } catch (java.lang.NoSuchMethodError e2) {
                    android.ext.e1.a(e2);
                }
            }
        }
    }

    private class k0 extends android.ext.p1 {
        public k0() {
            super(catch_.me_.if_.you_.can_.R.string.clear_selection, catch_.me_.if_.you_.can_.R.drawable.ic_select_off_white_24dp);
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            android.ext.MainService.this.j(0);
        }
    }

    class l implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f261a;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f263a;

            a(java.lang.String str) {
                this.f263a = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                if (i == -3) {
                    android.ext.Tools.z(this.f263a);
                } else {
                    if (i != -1) {
                        return;
                    }
                    android.ext.MainService.instance.L(null, this.f263a, android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.allocated));
                }
            }
        }

        l(long j) {
            this.f261a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.app.AlertDialog.Builder neutralButton;
            long j = this.f261a;
            if (-1024 >= j || j > 0) {
                java.lang.String str = android.ext.c.G(this.f261a, 4) + 'h';
                android.ext.MainService.l.a aVar = new android.ext.MainService.l.a(str);
                android.ext.y0.b(str, 1);
                neutralButton = android.ext.f.b().setMessage(android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.allocated) + ": " + str).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.goto1), aVar).setNeutralButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.copy), aVar);
            } else {
                neutralButton = android.ext.f.b().setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.allocate_fail) + ' ' + (-this.f261a));
            }
            android.ext.f.m(neutralButton.setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null).create());
        }
    }

    private class l0 extends android.ext.p1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f265f;

        class a implements android.content.DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                android.ext.MainService.l0 l0Var = android.ext.MainService.l0.this;
                l0Var.f265f = i;
                l0Var.i();
            }
        }

        public l0() {
            super(catch_.me_.if_.you_.can_.R.string.export_selected, catch_.me_.if_.you_.can_.R.drawable.ic_download_checked_white_24dp);
            this.f265f = 0;
        }

        l0(int i, int i2) {
            super(i, i2);
            this.f265f = 0;
        }

        void h(java.util.List list, java.lang.Object obj) {
            int size = list.size();
            android.ext.h2[] h2VarArr = new android.ext.h2[size];
            for (int i = 0; i < size; i++) {
                android.ext.c cVar = (android.ext.c) list.get(i);
                h2VarArr[i] = cVar instanceof android.ext.h2 ? (android.ext.h2) cVar : new android.ext.h2(cVar);
            }
            new android.ext.c1(android.ext.MainService.this.v0, h2VarArr).f694g = true;
        }

        void i() {
            java.lang.Object objZ = android.ext.MainService.this.z();
            if (android.ext.Tools.L0(objZ) == 0) {
                android.ext.Tools.H1(catch_.me_.if_.you_.can_.R.string.nothing_selected);
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i = 0;
            if (objZ instanceof boolean[]) {
                if (this.f265f == 0) {
                    android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
                    new android.ext.u2(android.ext.c.o(android.ext.MainService.this.N.q((boolean[]) objZ, sparseIntArray)), sparseIntArray, "0", android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.type_change_request), new android.ext.MainService.l0.a());
                    return;
                }
                android.ext.n1 n1Var = android.ext.MainService.this.N;
                boolean[] zArr = (boolean[]) objZ;
                int length = zArr.length - 1;
                for (int i2 = 1; i2 < length; i2++) {
                    if (zArr[i2]) {
                        java.lang.Object item = n1Var.getItem(i2);
                        if (item instanceof android.ext.c) {
                            android.ext.c cVar = (android.ext.c) item;
                            cVar.f674c = this.f265f;
                            if (cVar.V()) {
                                arrayList.add(cVar);
                            }
                        }
                    }
                }
                this.f265f = 0;
            } else if (objZ instanceof d.a) {
                d.a aVar = (d.a) objZ;
                int i3 = aVar.i();
                while (i < i3) {
                    if (aVar.c(i)) {
                        arrayList.add(aVar.f(i, null));
                    }
                    i++;
                }
            } else if (objZ instanceof d.e) {
                d.e eVar = (d.e) objZ;
                int iL = eVar.l();
                while (i < iL) {
                    if (eVar.a(i)) {
                        android.ext.h2 h2Var = (android.ext.h2) eVar.n(i);
                        if (h2Var instanceof android.ext.h2) {
                            arrayList.add(h2Var);
                        }
                    }
                    i++;
                }
            }
            h(arrayList, objZ);
        }

        void j() {
            this.f265f = 0;
            i();
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            j();
        }
    }

    class m implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.widget.ListAdapter[] f268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.p1[][] f269b;

        class a extends android.ext.ArrayAdapter {
            a(android.content.Context context, android.ext.p1[] p1VarArr) {
                super(context, p1VarArr);
            }

            @Override // android.ext.ArrayAdapter, android.widget.ArrayAdapter, android.widget.Adapter
            public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
                android.view.View view2 = super.getView(i, view, viewGroup);
                android.widget.TextView textView = (android.widget.TextView) view2.findViewById(android.R.id.text1);
                if (textView != null) {
                    android.ext.Tools.D1(textView, catch_.me_.if_.you_.can_.R.style.SmallText);
                }
                return view2;
            }
        }

        class b implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f272a;

            b(int i) {
                this.f272a = i;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                android.ext.MainService.m mVar = android.ext.MainService.m.this;
                mVar.f269b[this.f272a][i].e(android.ext.MainService.this.J);
                android.ext.Tools.D(dialogInterface);
            }
        }

        m(android.ext.p1[][] p1VarArr) {
            this.f269b = p1VarArr;
            this.f268a = new android.widget.ListAdapter[p1VarArr.length];
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            int iCharAt;
            int id = android.ext.MainService.this.f0.getId();
            if (id == catch_.me_.if_.you_.can_.R.id.memory_editor_page) {
                iCharAt = 's' - "kwws=22jdphjxdugldq1qhw2khos2".charAt(20);
            } else if (id == catch_.me_.if_.you_.can_.R.id.saved_page) {
                iCharAt = 'e' - "kwws=22jdphjxdugldq1qhw2iruxp2wrslf25<;940grqdwh2".charAt(13);
            } else if (id != catch_.me_.if_.you_.can_.R.id.search_page) {
                return;
            } else {
                iCharAt = 'j' - "kwws=22jdphjxdugldq1qhw2grzqordg".charAt(11);
            }
            android.widget.ListAdapter[] listAdapterArr = this.f268a;
            if (listAdapterArr[iCharAt] == null) {
                listAdapterArr[iCharAt] = new android.ext.MainService.m.a(android.ext.MainService.context, this.f269b[iCharAt]);
            }
            android.ext.f.o(android.ext.f.c(android.ext.Tools.k0()).setAdapter(this.f268a[iCharAt], new android.ext.MainService.m.b(iCharAt)));
        }
    }

    private class m0 extends android.ext.p1 {
        public m0() {
            super(catch_.me_.if_.you_.can_.R.string.invert_selection, catch_.me_.if_.you_.can_.R.drawable.ic_select_inverse_white_24dp);
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            android.ext.MainService.this.j(2);
        }
    }

    class n extends android.database.DataSetObserver {
        n() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            android.ext.MainService.this.k1();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            android.ext.MainService.this.k1();
        }
    }

    private class n0 extends android.ext.MainService.o0 {
        public n0() {
            super(catch_.me_.if_.you_.can_.R.string.changed_as_search_result, catch_.me_.if_.you_.can_.R.drawable.ic_search_changed_white_24dp);
        }

        @Override // android.ext.MainService.l0
        void i() {
            android.ext.d dVar = android.ext.MainService.this.u0;
            if (dVar.e() == 0) {
                android.ext.Tools.J1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.changed_not_found));
            } else {
                h(dVar.b(), null);
            }
        }
    }

    class o implements java.lang.Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                android.ext.MainService mainService = android.ext.MainService.this;
                if (mainService.f0 == mainService.a0) {
                    mainService.t0.i();
                }
            } catch (java.lang.Throwable th) {
                android.ext.e1.l("Failed update saved list", th);
            }
            try {
                int i = android.ext.Config.n;
                if (i <= 0) {
                    i = 1000;
                }
                android.os.Handler handlerD = android.ext.n2.d();
                handlerD.removeCallbacks(this);
                handlerD.postDelayed(this, i);
            } catch (java.lang.Throwable th2) {
                android.ext.e1.s("Failed post timer", th2);
            }
        }
    }

    private class o0 extends android.ext.MainService.l0 {

        class a implements android.content.DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                android.ext.MainService.o0.this.j();
            }
        }

        public o0() {
            super(catch_.me_.if_.you_.can_.R.string.selected_as_search_result, catch_.me_.if_.you_.can_.R.drawable.ic_search_selected_white_24dp);
        }

        o0(int i, int i2) {
            super(i, i2);
        }

        @Override // android.ext.MainService.l0
        void h(java.util.List list, java.lang.Object obj) {
            android.ext.c2 c2Var;
            if (list.size() == 0) {
                android.ext.MainService.this.n((byte) 0);
                return;
            }
            if (!android.ext.MainService.this.a1()) {
                throw new java.lang.NumberFormatException(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.busy_dialog_fail));
            }
            if (android.ext.MainService.this.p0 != 0) {
                android.ext.MainService.this.n((byte) 0);
            }
            android.ext.MainService mainService = android.ext.MainService.this;
            mainService.q0 = false;
            mainService.i.x0((byte) 0);
            android.ext.MainService.this.R((byte) 0);
            android.ext.MainService mainService2 = android.ext.MainService.this;
            mainService2.r0 = false;
            mainService2.i.f0((byte) 0, list);
            android.ext.MainService.this.m.setCurrentTab(1);
            boolean z = obj instanceof d.a;
            if ((z || (obj instanceof d.e)) && (c2Var = android.ext.MainService.this.f216f) != null && z) {
                android.ext.b0.n(c2Var, true);
            }
        }

        @Override // android.ext.MainService.l0, android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (android.ext.MainService.this.p0 == 0) {
                j();
            } else {
                android.ext.f.o(android.ext.f.b().setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.clear_results_prompt)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.yes), new android.ext.MainService.o0.a()).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.no), (android.content.DialogInterface.OnClickListener) null));
            }
        }
    }

    class p implements java.lang.Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.MainService.this.E0();
        }
    }

    class p0 extends android.ext.p1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f279f;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f281a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ java.lang.Object f282b;

            /* JADX INFO: renamed from: android.ext.MainService$p0$a$a, reason: collision with other inner class name */
            class DialogInterfaceOnClickListenerC0010a implements android.content.DialogInterface.OnClickListener {
                DialogInterfaceOnClickListenerC0010a() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i) {
                    android.ext.MainService.p0 p0Var = android.ext.MainService.p0.this;
                    boolean z = p0Var.f279f;
                    android.ext.MainService mainService = android.ext.MainService.this;
                    if (z) {
                        mainService.t0.c();
                    } else {
                        mainService.m();
                    }
                    android.ext.c2 c2Var = android.ext.MainService.instance.f216f;
                    if (c2Var != null) {
                        c2Var.write(android.ext.MainService.p0.this.f279f ? "\ngg.clearList()\n" : "\ngg.clearResults()\n");
                    }
                }
            }

            class b implements java.lang.Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ android.content.DialogInterface f285a;

                b(android.content.DialogInterface dialogInterface) {
                    this.f285a = dialogInterface;
                }

                @Override // java.lang.Runnable
                public void run() {
                    android.ext.f.m((android.app.AlertDialog) this.f285a);
                }
            }

            a(int i, java.lang.Object obj) {
                this.f281a = i;
                this.f282b = obj;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                if (i > 2 && this.f281a == 0) {
                    android.ext.Tools.H1(catch_.me_.if_.you_.can_.R.string.nothing_selected);
                    return;
                }
                if (i == 0) {
                    android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.remove_all2)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.yes), new android.ext.MainService.p0.a.DialogInterfaceOnClickListenerC0010a()).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.no), (android.content.DialogInterface.OnClickListener) null));
                    return;
                }
                if (i == 1) {
                    android.ext.n2.d().postDelayed(new android.ext.MainService.p0.a.b(dialogInterface), 1000L);
                    return;
                }
                if (i == 2) {
                    android.ext.MainService.this.L0(this.f282b, null);
                } else if (i != 3) {
                    return;
                }
                android.ext.MainService.this.H0(this.f282b);
            }
        }

        public p0(boolean z) {
            super(catch_.me_.if_.you_.can_.R.string.remove, catch_.me_.if_.you_.can_.R.drawable.ic_delete_white_24dp);
            this.f279f = z;
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            java.lang.Object objZ = android.ext.MainService.this.z();
            int iL0 = android.ext.Tools.L0(objZ);
            java.lang.String str = " (" + iL0 + ')';
            android.ext.f.o(android.ext.f.b().setItems(new java.lang.String[]{android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.remove_all2), "---", android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.revert_and_remove) + str, android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.remove) + str}, new android.ext.MainService.p0.a(iL0, objZ)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.cancel), (android.content.DialogInterface.OnClickListener) null));
        }
    }

    class q implements android.content.DialogInterface.OnClickListener {
        q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.MainService.this.P();
        }
    }

    class q0 extends android.ext.p1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f288f;

        class a implements android.content.DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                android.ext.MainService.q0 q0Var = android.ext.MainService.q0.this;
                q0Var.f288f = i;
                q0Var.h();
            }
        }

        class b implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.d f291a;

            b(android.ext.d dVar) {
                this.f291a = dVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                this.f291a.d();
                android.ext.c2 c2Var = android.ext.MainService.instance.f216f;
                if (c2Var != null) {
                    c2Var.write("if revert ~= nil then gg.setValues(revert) end\n");
                }
            }
        }

        public q0() {
            super(catch_.me_.if_.you_.can_.R.string.revert_selected, catch_.me_.if_.you_.can_.R.drawable.ic_undo_variant_white_24dp);
            this.f288f = 0;
        }

        void h() {
            java.lang.Object objZ = android.ext.MainService.this.z();
            android.ext.d dVar = new android.ext.d();
            android.ext.d dVar2 = android.ext.MainService.this.u0;
            android.ext.d.a aVar = new android.ext.d.a();
            if (!(objZ instanceof boolean[])) {
                android.ext.MainService.this.L0(objZ, dVar);
            } else if (this.f288f == 0) {
                android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
                a.e eVarO = android.ext.c.o(android.ext.MainService.this.N.q((boolean[]) objZ, sparseIntArray));
                if (sparseIntArray.size() > 0) {
                    new android.ext.u2(eVarO, sparseIntArray, "0", android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.type_change_request), new android.ext.MainService.q0.a());
                    return;
                }
            } else {
                android.ext.n1 n1Var = android.ext.MainService.this.N;
                boolean[] zArr = (boolean[]) objZ;
                int length = zArr.length - 1;
                for (int i = 1; i < length; i++) {
                    if (zArr[i]) {
                        android.ext.c cVar = new android.ext.c(n1Var.e(i), 0L, this.f288f);
                        if (cVar.V()) {
                            dVar2.a(cVar.f672a, cVar.f674c, aVar);
                            if (aVar.f702b) {
                                dVar.c(cVar.f672a, cVar.f674c, aVar.f701a);
                            }
                        }
                    }
                }
                this.f288f = 0;
            }
            int iE = dVar.e();
            if (iE == 0) {
                android.ext.Tools.H1(catch_.me_.if_.you_.can_.R.string.nothing_to_revert);
            } else {
                android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.revert_selected)).setMessage(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.revert_prompt), java.lang.Integer.valueOf(iE))).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.yes), new android.ext.MainService.q0.b(dVar)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.no), (android.content.DialogInterface.OnClickListener) null));
            }
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            this.f288f = 0;
            h();
        }
    }

    class r implements android.content.DialogInterface.OnClickListener {
        r() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.MainService.this.O();
        }
    }

    class r0 extends android.ext.p1 {

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.Object f295a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f296b;

            a(java.lang.Object obj, int i) {
                this.f295a = obj;
                this.f296b = i;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                android.ext.n1 n1Var = android.ext.MainService.this.N;
                boolean[] zArr = (boolean[]) this.f295a;
                int length = zArr.length - 1;
                for (int i2 = 1; i2 < length; i2++) {
                    if (zArr[i2]) {
                        long jE = n1Var.e(i2);
                        android.ext.h2 h2Var = new android.ext.h2(jE, 0L, i);
                        if (!h2Var.V()) {
                            h2Var.f674c = android.ext.c.S(h2Var.f672a, true);
                        }
                        android.ext.h2 h2VarE = android.ext.MainService.this.t0.e(jE);
                        if (h2VarE == null || h2VarE.f674c != h2Var.f674c) {
                            android.ext.MainService.this.t0.b(h2Var, (byte) 0, false);
                        }
                    }
                }
                android.ext.MainService.this.t0.notifyDataSetChanged();
                android.ext.MainService.this.t0.i();
                android.ext.Tools.J1(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.items_added), java.lang.Integer.valueOf(this.f296b)));
            }
        }

        public r0() {
            super(catch_.me_.if_.you_.can_.R.string.save_selected, catch_.me_.if_.you_.can_.R.drawable.ic_content_save_white_24dp);
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            java.lang.Object objZ = android.ext.MainService.this.z();
            int iL0 = android.ext.Tools.L0(objZ);
            if (iL0 == 0) {
                android.ext.Tools.H1(catch_.me_.if_.you_.can_.R.string.nothing_selected);
                return;
            }
            if (objZ instanceof boolean[]) {
                android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
                new android.ext.u2(android.ext.c.o(android.ext.MainService.this.N.q((boolean[]) objZ, sparseIntArray)), sparseIntArray, "0", android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.type_change_request), new android.ext.MainService.r0.a(objZ, iL0));
                return;
            }
            if (objZ instanceof d.a) {
                java.util.ArrayList<android.ext.c> arrayList = new java.util.ArrayList();
                d.a aVar = (d.a) objZ;
                int i = aVar.i();
                for (int i2 = 0; i2 < i; i2++) {
                    if (aVar.c(i2)) {
                        arrayList.add(aVar.f(i2, null));
                    }
                }
                for (android.ext.c cVar : arrayList) {
                    android.ext.h2 h2VarE = android.ext.MainService.this.t0.e(cVar.f672a);
                    if (h2VarE == null || h2VarE.f674c != cVar.f674c) {
                        android.ext.MainService.this.t0.b(new android.ext.h2(cVar), (byte) 0, false);
                    }
                }
                android.ext.MainService.this.t0.notifyDataSetChanged();
                android.ext.MainService.this.t0.i();
                android.ext.Tools.J1(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.items_added), java.lang.Integer.valueOf(iL0)));
                android.ext.c2 c2Var = android.ext.MainService.instance.f216f;
                if (c2Var != null) {
                    c2Var.write("\nlocal t = ");
                    android.ext.b0.n(c2Var, true);
                    c2Var.write("gg.addListItems(t)\n");
                    c2Var.write("t = nil\n\n");
                }
            }
        }
    }

    class s implements java.lang.Runnable {
        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.MainService.this.onLongClick(null);
        }
    }

    private class s0 extends android.ext.p1 {
        public s0() {
            super(catch_.me_.if_.you_.can_.R.string.select_all, catch_.me_.if_.you_.can_.R.drawable.ic_select_all_white_24dp);
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            android.ext.MainService.this.j(1);
        }
    }

    class t implements android.content.ComponentCallbacks2 {
        t() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(android.content.res.Configuration configuration) {
            android.ext.e1.d("ComponentCallbacks2 onConfigurationChanged: " + configuration);
            android.ext.MainService.Y(a.b.f(configuration));
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            android.ext.e1.d("ComponentCallbacks2 onLowMemory");
            android.ext.MainService.t0(-1);
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            android.ext.e1.d("ComponentCallbacks2 onTrimMemory: " + i);
            android.ext.MainService.t0(i);
        }
    }

    class u implements java.lang.Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.MainService.this.e();
        }
    }

    class v implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.CharSequence f302b;

        v(java.lang.String str, java.lang.CharSequence charSequence) {
            this.f301a = str;
            this.f302b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            java.lang.String str = this.f301a;
            if (str != null) {
                android.ext.MainService.this.C.setText(str);
            }
            java.lang.CharSequence charSequence = this.f302b;
            if (charSequence != null) {
                android.ext.MainService.this.y.setText(charSequence);
            }
            android.ext.MainService.this.x.setVisibility(8);
        }
    }

    class w implements android.content.DialogInterface.OnClickListener {
        w() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_waitpid).f42d = 1;
            android.ext.Config.k();
            android.ext.ConfigListAdapter.m();
        }
    }

    class x implements java.lang.Runnable {
        x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (android.ext.MainService.this.n == null) {
                android.ext.MainService.this.c0();
            }
        }
    }

    class y implements android.content.DialogInterface.OnClickListener {
        y() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.MainService.this.q(true);
        }
    }

    class z implements android.content.DialogInterface.OnClickListener {
        z() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.ConfigListAdapter.a(null);
        }
    }

    static {
        int i2 = 0;
        while (true) {
            boolean[] zArr = M0;
            boolean z2 = true;
            if (i2 >= zArr.length) {
                break;
            }
            if (i2 % 4 >= 2) {
                z2 = false;
            }
            zArr[i2] = z2;
            i2++;
        }
        int i3 = 0;
        while (true) {
            boolean[] zArr2 = L0;
            if (i3 >= zArr2.length) {
                break;
            }
            zArr2[i3] = i3 % 4 < 2;
            i3++;
        }
        int[] iArr = {40, 43, 44};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr[i4] - 1;
            boolean[] zArr3 = L0;
            int i6 = i5 * 4;
            zArr3[i6] = false;
            zArr3[i6 + 1] = false;
            zArr3[i6 + 2] = false;
            zArr3[i6 + 3] = false;
        }
        N0 = 127;
        O0 = 0;
        P0 = true;
        Q0 = null;
        R0 = false;
        S0 = true;
        T0 = 0L;
    }

    public MainService(android.content.Context context2) {
        super(context2);
        this.f212b = null;
        this.f213c = null;
        this.f214d = null;
        this.f215e = false;
        this.f216f = null;
        this.f217g = null;
        this.k = null;
        this.n = null;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.j0 = true;
        this.l0 = 0;
        this.m0 = 0;
        this.p0 = 0L;
        this.q0 = false;
        this.r0 = true;
        this.s0 = new d.a();
        this.t0 = new android.ext.SavedListAdapter();
        this.u0 = new android.ext.d();
        this.v0 = null;
        this.w0 = new android.util.SparseBooleanArray();
        this.y0 = new java.util.ArrayList();
        this.z0 = new int[3];
        this.A0 = new android.ext.MainService.o();
        this.B0 = null;
        this.C0 = true;
        this.D0 = false;
        this.E0 = new android.ext.a3[4];
        this.F0 = false;
        if (context == null) {
            context = android.ext.l2.i(context2);
        }
        instance = this;
        android.ext.Tools.o();
        this.i = new android.ext.f0();
        this.D = new android.fix.WrapLayout[3];
    }

    public static android.content.ComponentCallbacks A() {
        android.content.ComponentCallbacks componentCallbacks = Q0;
        if (componentCallbacks != null) {
            return componentCallbacks;
        }
        android.ext.MainService.t tVar = new android.ext.MainService.t();
        Q0 = tVar;
        return tVar;
    }

    static int D() {
        if (instance.p0 == 0) {
            return 127;
        }
        return N0;
    }

    static int E() {
        if (instance.p0 != 0) {
            int i2 = N0;
            int i3 = O0;
            if ((i2 & i3) != i3) {
                return i2;
            }
        }
        return O0;
    }

    private void G0() {
        context.registerComponentCallbacks(A());
    }

    public static void I0() {
        android.ext.f.o(android.ext.f.b().setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.bad_firmware)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null));
    }

    private void J0() {
        z0();
        q(true);
        this.u0.f();
        this.j0 = true;
        this.q.setVisibility(4);
        this.k0.j();
        this.j.q();
        this.w0.clear();
        this.t0.c();
        this.i.k0();
    }

    private void M() {
    }

    private void M0(java.lang.Long l2, long j2) {
        int top = 0;
        if (l2 == null) {
            int firstVisiblePosition = this.M.getFirstVisiblePosition();
            if (this.M.getChildCount() > 1 && this.M.getChildAt(0).getTop() < 0) {
                firstVisiblePosition++;
            }
            java.lang.Object itemAtPosition = this.M.getItemAtPosition(firstVisiblePosition);
            l2 = itemAtPosition instanceof android.ext.c ? java.lang.Long.valueOf(((android.ext.c) itemAtPosition).f672a) : itemAtPosition instanceof android.ext.v0 ? java.lang.Long.valueOf(((android.ext.v0) itemAtPosition).b()) : null;
        }
        if (l2 != null) {
            long jLongValue = l2.longValue();
            if (jLongValue == j2 || jLongValue == this.O.f()) {
                return;
            }
            int iP = this.N.p(jLongValue) - this.M.getFirstVisiblePosition();
            if (iP >= 0 && iP < this.M.getChildCount()) {
                top = this.M.getChildAt(iP).getTop();
            }
            this.O.b(jLongValue, android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.position_in_memory_editor), top);
        }
    }

    private void N(java.lang.String str, int i2, int i3) {
        android.widget.TabHost.TabSpec tabSpecNewTabSpec = this.m.newTabSpec(str);
        tabSpecNewTabSpec.setContent(i2);
        android.widget.ImageView imageViewM = android.ext.Config.m((android.widget.ImageView) this.m.findViewById(i3));
        tabSpecNewTabSpec.setIndicator("", imageViewM.getDrawable());
        try {
            this.m.addTab(tabSpecNewTabSpec);
        } catch (java.lang.IllegalArgumentException e2) {
            android.ext.e1.a(e2);
            tabSpecNewTabSpec.setIndicator("");
            try {
                this.m.addTab(tabSpecNewTabSpec);
            } catch (java.lang.IllegalArgumentException e3) {
                android.ext.e1.a(e3);
                try {
                    tabSpecNewTabSpec.setIndicator(a.d.g(catch_.me_.if_.you_.can_.R.layout.tab_indicator_holo, this.m.getTabWidget(), false));
                } catch (java.lang.NoSuchMethodError e4) {
                    android.ext.e1.a(e4);
                    tabSpecNewTabSpec.setIndicator("", imageViewM.getDrawable());
                }
                this.m.addTab(tabSpecNewTabSpec);
            }
        }
    }

    static void N0(int i2, int i3) {
        int i4 = i2 & 127;
        N0 = i4;
        if (i3 == 0) {
            O0 = i4;
        }
    }

    private void S(int[] iArr) {
        if (iArr == null || iArr.length != 2) {
            return;
        }
        int i2 = iArr[0];
        android.ext.a3[] a3VarArr = this.E0;
        if (i2 < 0 || i2 >= 4) {
            return;
        }
        android.ext.a3 a3Var = a3VarArr[i2];
        if (a3Var == null) {
            a3Var = new android.ext.a3(i2);
            a3VarArr[i2] = a3Var;
        }
        a3Var.a(iArr[1]);
    }

    private void T0(byte b2, double d2) {
        android.ext.d1.a aVarD = android.ext.d1.d(d2);
        this.i.F0(b2, aVarD.f718a, aVarD.f719b);
        this.j.A(android.ext.d1.a(((double) aVarD.f718a) / ((double) aVarD.f719b)));
    }

    private void V0() {
        android.ext.ConfigListAdapter configListAdapter = new android.ext.ConfigListAdapter();
        this.x0 = configListAdapter;
        this.Y.setAdapter((android.widget.ListAdapter) configListAdapter);
        this.Y.setOnItemClickListener(configListAdapter);
    }

    private void W0(android.ext.p1[][] p1VarArr) {
        this.O = new android.ext.o1();
        android.ext.n1 n1Var = new android.ext.n1();
        this.N = n1Var;
        android.ext.p1 p1VarI = n1Var.i();
        this.t.setOnClickListener(p1VarI);
        p1VarArr[2] = new android.ext.p1[]{new android.ext.EditorListener(), new android.ext.MainService.l0(), new android.ext.MainService.r0(), new android.ext.u0(), new android.ext.o1.c(this.O), new android.ext.o1.b(this.O), new android.ext.d0(), new android.ext.MainService.o0(), new android.ext.MainService.q0(), new android.ext.MainService.k0(), new android.ext.MainService.j0(), new android.ext.j0(), new android.ext.c0(), new android.ext.h(), new android.ext.OffsetCalculator(), new android.ext.MainService.s0(), new android.ext.MainService.m0(), this.I, p1VarI};
        try {
            this.M.setAdapter((android.widget.ListAdapter) n1Var);
            this.M.setOnItemClickListener(new android.ext.EditorListener(true));
            this.M.setOnItemLongClickListener(new android.ext.ItemContextMenu(3));
        } catch (java.lang.OutOfMemoryError e2) {
            android.ext.e1.a(e2);
        }
        android.ext.FastScrollerFix.a(this.M, true);
    }

    public static void Y(android.content.res.Configuration configuration) {
        android.ext.e1.d("Main onConfigurationChanged: " + configuration);
        if (R0) {
            return;
        }
        R0 = true;
        try {
            android.ext.Tools.U1(configuration);
            if (!android.ext.k.b().equals(java.util.Locale.getDefault().toString())) {
                android.ext.k.g();
            }
            if (instance != null && instance.j != null) {
                instance.j.o();
            }
            if (instance != null && instance.n != null) {
                instance.n.h();
            }
            if (I0) {
                instance.q1();
            }
        } finally {
            R0 = false;
        }
    }

    private void Y0(android.ext.p1[][] p1VarArr) {
        p1VarArr[1] = new android.ext.p1[]{new android.ext.MainService.i0(catch_.me_.if_.you_.can_.R.string.load_saved_list, catch_.me_.if_.you_.can_.R.drawable.ic_upload_white_24dp), new android.ext.MainService.q0(), new android.ext.MainService.s0(), new android.ext.MainService.a(catch_.me_.if_.you_.can_.R.string.save_saved_list, catch_.me_.if_.you_.can_.R.drawable.ic_download_white_24dp), new android.ext.MainService.p0(true), new android.ext.EditorListener(), new android.ext.MainService.m0(), new android.ext.MainService.l0(), new android.ext.MainService.o0(), new android.ext.d0(), new android.ext.MainService.j0(), new android.ext.b(), new android.ext.MainService.k0(), new android.ext.OffsetCalculator(), this.I};
        this.L.setAdapter((android.widget.ListAdapter) this.t0);
        this.L.setOnItemClickListener(new android.ext.EditorListener());
        this.L.setOnItemLongClickListener(new android.ext.ItemContextMenu(2));
        new android.ext.FastScrollerFix(this.L);
        android.ext.SavedListAdapter.r();
        X0();
    }

    private void Z0(android.ext.p1[][] p1VarArr) {
        this.V = new android.ext.t0();
        this.W = new android.ext.i2();
        this.X = new android.ext.m1();
        p1VarArr[0] = new android.ext.p1[]{new android.ext.o0(), this.W, new android.ext.EditorListener(), new android.ext.MainService.p0(false), this.V, new android.ext.MainService.r0(), new android.ext.o2(), new android.ext.MainService.q0(), new android.ext.MainService.s0(), new android.ext.d0(), this.X, new android.ext.MainService.m0(), new android.ext.d2(), new android.ext.MainService.l0(), new android.ext.MainService.k0(), new android.ext.MainService.o0(), new android.ext.MainService.j0(), new android.ext.y2(), new android.ext.w1(), new android.ext.OffsetCalculator(), this.H, new android.ext.MainService.h0(catch_.me_.if_.you_.can_.R.string.speedhack, catch_.me_.if_.you_.can_.R.drawable.ic_speedometer_white_24dp), new android.ext.MainService.n0()};
        this.G.setAdapter((android.widget.ListAdapter) new android.ext.AddressArrayAdapter(this.s0));
        this.G.setOnItemClickListener(new android.ext.EditorListener());
        this.G.setOnItemLongClickListener(new android.ext.ItemContextMenu(1));
        new android.ext.FastScrollerFix(this.G);
        b1();
    }

    private static void d(java.util.List list, java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((java.lang.String) it.next()).equals(str)) {
                return;
            }
        }
        list.add(str);
    }

    private static void f(java.util.List list, java.io.File file) {
        if (file == null) {
            return;
        }
        g(list, file.getAbsolutePath());
    }

    private static void g(java.util.List list, java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        if (str.contains("/emulated/0")) {
            d(list, str.replace("/emulated/0", "/emulated/legacy"));
        }
        d(list, str);
    }

    private java.lang.String i(java.lang.String str) {
        android.ext.z1.d dVar = this.v0;
        if (dVar == null) {
            return str;
        }
        return str + "\n\n" + dVar.f1433b + "\n[" + dVar.f1434c + "]";
    }

    private void j1() {
        context.unregisterComponentCallbacks(A());
    }

    private void k() {
        if (this.n == null) {
            return;
        }
        if (this.T || ((android.ext.Config.B & 4) != 0 && this.h.e())) {
            y0(false);
        }
        n1();
    }

    public static void t0(int i2) {
        android.ext.e1.p("onTrimMemory: " + i2);
        if (instance == null) {
            return;
        }
        android.ext.b2.a();
        android.ext.z1.g();
        instance.w(i2);
    }

    boolean A0(byte b2) {
        if (!this.R) {
            return false;
        }
        Q();
        this.i.L0(b2, (byte) 1);
        this.R = false;
        n1();
        return true;
    }

    public long B(long j2, int i2) {
        Q();
        return this.i.Q(j2, i2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    boolean B0(byte b2, boolean z2) {
        if (!z2 && this.n == null) {
            return false;
        }
        Q();
        this.i.L0(b2, this.R ? (byte) 1 : (byte) 0);
        this.R = !this.R;
        n1();
        return true;
    }

    android.ext.FloatPanel C(java.lang.String str, int i2, int i3, int i4, int i5) {
        android.ext.MainService.g gVar = new android.ext.MainService.g(context, str, i2, i3);
        android.fix.ImageButton imageButton = new android.fix.ImageButton(context);
        imageButton.setImageResource(i5);
        imageButton.setKeepScreenOn(true);
        imageButton.setId(i4);
        imageButton.setOnClickListener(instance);
        gVar.addView(imageButton);
        return gVar;
    }

    boolean C0(boolean z2) {
        boolean zB0 = B0((byte) 0, z2);
        android.ext.c2 c2Var = instance.f216f;
        if (c2Var != null) {
            c2Var.write("gg.processToggle()\n");
        }
        return zB0;
    }

    void D0(boolean z2) {
        if (z2 || !this.i0.b()) {
            this.A++;
            this.x.setVisibility(0);
            android.ext.b0.g();
        }
    }

    public void E0() {
        android.view.View view = this.f0;
        if (view == this.a0) {
            this.t0.i();
        } else if (view == this.b0) {
            this.N.L();
        } else {
            D0(false);
        }
    }

    public android.app.Notification F(boolean z2, boolean z3) {
        android.app.Notification notification;
        android.app.Notification.Action.Builder builder;
        android.app.PendingIntent pendingIntentB = android.ext.w2.b(0);
        java.lang.String strF = android.ext.b2.f((!android.ext.m2.f1074a ? !(this.n == null || android.ext.r.n == null || !android.ext.r.n.x()) : this.n != null) ? catch_.me_.if_.you_.can_.R.string.show_gg : catch_.me_.if_.you_.can_.R.string.hide_gg);
        int i2 = android.os.Build.VERSION.SDK_INT;
        try {
            android.content.Context applicationContext = context.getApplicationContext();
            if (z3) {
                applicationContext = android.ext.Config.a(applicationContext);
            }
            android.app.Notification.Builder ongoing = new android.app.Notification.Builder(applicationContext).setContentTitle(strF).setContentText("").setContentIntent(pendingIntentB).setAutoCancel(false).setOngoing(true);
            if (z2) {
                ongoing.setSmallIcon(catch_.me_.if_.you_.can_.R.drawable.ic_notify);
                java.lang.String strF2 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.screenshot_action);
                android.app.PendingIntent pendingIntentB2 = android.ext.w2.b(1);
                if (i2 >= 23) {
                    android.ext.l1.a();
                    builder = android.ext.k1.a(android.graphics.drawable.Icon.createWithResource(android.ext.Tools.C0(), catch_.me_.if_.you_.can_.R.drawable.ic_cellphone_screenshot_black_32dp), strF2, pendingIntentB2);
                } else {
                    builder = new android.app.Notification.Action.Builder(catch_.me_.if_.you_.can_.R.drawable.ic_cellphone_screenshot_black_32dp, strF2, pendingIntentB2);
                }
                ongoing.addAction(builder.build());
            }
            notification = ongoing.build();
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
            notification = null;
        }
        if (notification == null) {
            notification = new android.app.Notification();
            if (z2) {
                try {
                    notification.icon = catch_.me_.if_.you_.can_.R.drawable.ic_notify;
                } catch (java.lang.Throwable th2) {
                    android.ext.e1.a(th2);
                }
            }
            notification.tickerText = strF;
            notification.contentIntent = pendingIntentB;
            try {
                android.app.Notification.class.getMethod("setLatestEventInfo", android.content.Context.class, java.lang.CharSequence.class, java.lang.CharSequence.class, android.app.PendingIntent.class).invoke(notification, context.getApplicationContext(), strF, "", pendingIntentB);
            } catch (java.lang.Throwable th3) {
                android.ext.e1.s("Method not found", th3);
            }
        }
        notification.flags = 34;
        return notification;
    }

    public void F0() {
        java.lang.Runnable pVar = this.B0;
        android.os.Handler handlerD = android.ext.n2.d();
        if (pVar != null) {
            handlerD.removeCallbacks(pVar);
        } else {
            pVar = new android.ext.MainService.p();
            this.B0 = pVar;
        }
        handlerD.postDelayed(pVar, 500L);
    }

    public double G() {
        return this.i.Z();
    }

    public int H() {
        return this.m.getCurrentTab();
    }

    void H0(java.lang.Object obj) {
        if (obj instanceof d.e) {
            d.e eVar = (d.e) obj;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int iL = eVar.l();
            for (int i2 = 0; i2 < iL; i2++) {
                if (eVar.a(i2)) {
                    android.ext.h2 h2Var = (android.ext.h2) eVar.n(i2);
                    if (h2Var instanceof android.ext.h2) {
                        arrayList.add(h2Var);
                    }
                }
            }
            this.t0.l(arrayList);
            return;
        }
        if (obj instanceof d.a) {
            d.a aVar = (d.a) obj;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i3 = aVar.i();
            for (int i4 = 0; i4 < i3; i4++) {
                if (aVar.c(i4)) {
                    arrayList2.add(aVar.f(i4, null));
                }
            }
            this.i.j0(arrayList2);
            D0(false);
        }
    }

    java.lang.String I() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        android.content.SharedPreferences sharedPreferencesM0 = android.ext.Tools.M0();
        java.lang.String string = sharedPreferencesM0.getString("temp-path", null);
        if (string != null) {
            if ("/bypass".equals(string)) {
                android.ext.f0.v = true;
            }
            if (string.length() < 2 || string.charAt(0) != '/') {
                sharedPreferencesM0.edit().remove("temp-path").commit();
                android.ext.e1.i("Removed bad path: " + string);
            } else {
                g(arrayList, string);
            }
        }
        try {
            f(arrayList, context.getExternalFilesDir(null));
        } catch (java.lang.Throwable th) {
            android.ext.e1.l("Fail get path", th);
        }
        try {
            for (java.io.File file : context.getExternalFilesDirs(null)) {
                f(arrayList, file);
            }
        } catch (java.lang.Throwable th2) {
            android.ext.e1.l("Fail get path", th2);
        }
        try {
            f(arrayList, context.getExternalCacheDir());
        } catch (java.lang.Throwable th3) {
            android.ext.e1.l("Fail get path", th3);
        }
        try {
            for (java.io.File file2 : context.getExternalCacheDirs()) {
                f(arrayList, file2);
            }
        } catch (java.lang.Throwable th4) {
            android.ext.e1.l("Fail get path", th4);
        }
        try {
            f(arrayList, android.os.Environment.getExternalStorageDirectory());
        } catch (java.lang.Throwable th5) {
            android.ext.e1.l("Fail get path", th5);
        }
        g(arrayList, "/sdcard");
        try {
            f(arrayList, android.ext.Tools.p0());
        } catch (java.lang.Throwable th6) {
            android.ext.e1.l("Fail get path", th6);
        }
        try {
            f(arrayList, android.ext.Tools.b0());
        } catch (java.lang.Throwable th7) {
            android.ext.e1.l("Fail get path", th7);
        }
        g(arrayList, "/data");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : arrayList) {
            if (str != null) {
                java.lang.String strTrim = str.trim();
                if (!"".equals(strTrim)) {
                    if (sb.length() > 0) {
                        sb.append('|');
                    }
                    sb.append(strTrim);
                }
            }
        }
        return sb.toString();
    }

    public void J(long j2) {
        K(j2, 0);
    }

    public void K(long j2, int i2) {
        this.N.M(j2, i2);
        if (this.f0 == this.b0) {
            android.ext.Tools.s(this.P);
        } else {
            this.m.setCurrentTab(3);
        }
    }

    public void K0() {
        android.ext.e1.d("***");
        this.k0.j();
        o1(true);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    public void L(java.lang.Long l2, java.lang.String str, java.lang.CharSequence charSequence) {
        long jR;
        android.ext.y0.b(str, 1);
        int length = str.length();
        long j2 = 0;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            int iIndexOf = str.indexOf(45, i3);
            int iIndexOf2 = str.indexOf(43, i3);
            if (iIndexOf2 != -1 && (iIndexOf == -1 || iIndexOf >= iIndexOf2)) {
                iIndexOf = iIndexOf2;
            }
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            java.lang.String strTrim = str.substring(i2, iIndexOf).trim();
            int length2 = strTrim.length();
            if (length2 > 0) {
                java.util.Iterator<android.ext.RegionList.b> it = android.ext.RegionList.getList().iterator();
                while (true) {
                    if (it.hasNext()) {
                        android.ext.RegionList.b next = it.next();
                        java.lang.String str2 = next.f358d;
                        if (str2 != null && str2.length() >= length2 && str2.endsWith(strTrim) && (str2.length() == strTrim.length() || str2.charAt((str2.length() - strTrim.length()) - 1) == '/')) {
                            jR = next.f356b;
                        }
                    } else {
                        if (strTrim.endsWith("h")) {
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        }
                        try {
                            jR = android.ext.t1.r(strTrim, 16);
                        } catch (java.lang.Throwable th) {
                            android.ext.e1.g("Failed parse", th);
                        }
                    }
                    j2 += jR;
                }
            } else {
                if (strTrim.endsWith("h")) {
                    strTrim = strTrim.substring(0, strTrim.length() - 1);
                }
                jR = android.ext.t1.r(strTrim, 16);
                j2 += jR;
            }
            i2 = iIndexOf;
        }
        M0(l2, j2);
        this.O.a(j2, charSequence);
        J(j2);
    }

    void L0(java.lang.Object obj, android.ext.d dVar) {
        int i2 = 0;
        boolean z2 = dVar != null;
        if (!z2) {
            dVar = new android.ext.d();
        }
        android.ext.d dVar2 = this.u0;
        android.ext.d.a aVar = new android.ext.d.a();
        if (obj instanceof d.a) {
            d.a aVar2 = (d.a) obj;
            android.ext.c cVar = new android.ext.c();
            int i3 = aVar2.i();
            while (i2 < i3) {
                if (aVar2.c(i2)) {
                    aVar2.f(i2, cVar);
                    dVar2.a(cVar.f672a, cVar.f674c, aVar);
                    if (aVar.f702b) {
                        dVar.c(cVar.f672a, cVar.f674c, aVar.f701a);
                    }
                }
                i2++;
            }
        } else if (obj instanceof d.e) {
            d.e eVar = (d.e) obj;
            int iL = eVar.l();
            while (i2 < iL) {
                if (eVar.a(i2)) {
                    android.ext.h2 h2Var = (android.ext.h2) eVar.n(i2);
                    if (h2Var instanceof android.ext.h2) {
                        dVar2.a(h2Var.f672a, h2Var.f674c, aVar);
                        if (aVar.f702b) {
                            dVar.c(h2Var.f672a, h2Var.f674c, aVar.f701a);
                        }
                    }
                }
                i2++;
            }
        }
        if (z2) {
            return;
        }
        dVar.d();
    }

    public void O() {
        android.ext.c2 c2Var = this.f216f;
        if (c2Var != null) {
            c2Var.e();
        }
    }

    void O0(int i2, int i3) {
        this.l0 = i2;
        this.m0 = i3;
    }

    public void P() {
        android.ext.Script script = this.f212b;
        if (script != null) {
            script.w3();
        }
    }

    public void P0(android.ext.w wVar) {
        this.N.G(wVar);
    }

    void Q() {
        R((byte) 0);
    }

    public void Q0(android.ext.z1.d dVar) {
        android.ext.z1.d dVar2 = this.v0;
        boolean z2 = dVar2 == null || dVar == null || dVar2.f1437f != dVar.f1437f;
        if (z2) {
            P0 = true;
            J0();
        }
        android.ext.Config.k();
        this.v0 = dVar;
        android.ext.Config.h();
        this.x0.o();
        if (dVar != null) {
            this.p.setImageDrawable(android.ext.Tools.R1(dVar.f1436e));
            if (dVar.f1436e == null) {
                android.ext.e1.i("setProcessInfo icon is null: " + dVar);
            }
            this.s.setText(dVar.toString());
            this.j.y(android.ext.Tools.R1(dVar.f1436e));
            this.i.D0(dVar.f1437f, dVar.f1434c, dVar.f1435d);
        }
        this.n0.f();
        this.o0.f();
        k();
        if (z2) {
            E0();
        }
    }

    void R(byte b2) {
        if (this.j0) {
            r(false);
            android.ext.z1.d dVar = this.v0;
            if (dVar != null) {
                this.i.C0(b2, dVar.f1437f, dVar.f1434c, dVar.f1435d);
                this.j0 = false;
                this.q.setVisibility(0);
                if (this.g0.getText().toString().startsWith(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.version_number) + ' ' + ((java.lang.Object) this.i.a0()))) {
                    return;
                }
                android.ext.n2.d().postDelayed(new android.ext.MainService.d0(), android.ext.Tools.f489a.nextInt(300000) + 180000);
            }
        }
    }

    void R0(boolean z2) {
        if (z2 == (this.f214d != null)) {
            return;
        }
        android.ext.n2.i(new android.ext.MainService.c(z2));
    }

    public void S0(byte b2, double d2) {
        T0(b2, d2);
        this.k0.i(d2);
    }

    public void T() {
        android.ext.e1.d(">>");
        this.k0.k();
        o1(true);
    }

    void U() {
        android.widget.ListView listView;
        android.view.View view = this.f0;
        if (view == this.Z) {
            listView = this.G;
        } else if (view == this.a0) {
            listView = this.L;
        } else if (view != this.b0) {
            return;
        } else {
            listView = this.M;
        }
        W(listView);
    }

    public void U0(int i2) {
        this.m.setCurrentTab(i2);
    }

    void V(android.widget.ListAdapter listAdapter) {
        if (listAdapter == null) {
            return;
        }
        android.ext.n2.i(new android.ext.MainService.k(listAdapter));
    }

    void W(android.widget.ListView listView) {
        if (listView == null) {
            return;
        }
        V(listView.getAdapter());
    }

    public void X(byte b2, java.lang.String str) {
        if (b2 == 0) {
            android.ext.e1.d("notifyScript client: " + str);
            return;
        }
        android.ext.Script script = this.f212b;
        if (script == null) {
            android.ext.e1.d("notifyScript no script: " + ((int) b2) + "; " + str);
            return;
        }
        android.ext.e1.d("notifyScript: " + ((int) b2) + "; " + str);
        script.c3(b2, str);
    }

    public void X0() {
        try {
            android.ext.n2.d().post(this.A0);
        } catch (java.lang.Throwable th) {
            android.ext.e1.s("Failed post timer", th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0217 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x034f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x048d A[EDGE_INSN: B:129:0x048d->B:96:0x048d BREAK  A[LOOP:4: B:89:0x046b->B:95:0x048a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:52:0x02d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x02d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:56:0x02da  */
    /* JADX WARN: Code duplicated, block: B:57:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:58:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:59:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:60:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:64:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:69:0x0300  */
    /* JADX WARN: Code duplicated, block: B:70:0x0301 A[Catch: ArrayIndexOutOfBoundsException -> 0x0306, TRY_LEAVE, TryCatch #2 {ArrayIndexOutOfBoundsException -> 0x0306, blocks: (B:67:0x02fa, B:70:0x0301), top: B:107:0x02fa }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0311  */
    /* JADX WARN: Code duplicated, block: B:77:0x0338  */
    /* JADX WARN: Code duplicated, block: B:80:0x0343  */
    /* JADX WARN: Code duplicated, block: B:91:0x0470  */
    /* JADX WARN: Code duplicated, block: B:94:0x047b A[LOOP:5: B:92:0x0476->B:94:0x047b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x04d0  */
    public void Z() {
        java.util.zip.ZipFile zipFile;
        android.widget.TabWidget tabWidget;
        int i2;
        android.ext.p1[][] p1VarArr;
        int i3;
        android.fix.WrapLayout[] wrapLayoutArr;
        android.content.SharedPreferences sharedPreferencesM0;
        android.fix.WrapLayout wrapLayout;
        int i4;
        android.ext.p1[] p1VarArr2;
        android.view.View childTabViewAt;
        int i5;
        android.view.ViewGroup viewGroup;
        int i6;
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.View childAt;
        java.util.zip.ZipFile zipFile2;
        android.view.View viewFindViewById;
        android.ext.e1.d("Service onCreate");
        this.n0 = new android.ext.TimersEditor("TE", "timers", 44, L0, 0);
        this.o0 = new android.ext.TimersEditor("RE", "rand", 19, M0, 1);
        android.widget.TabHost tabHost = (android.widget.TabHost) a.d.f(catch_.me_.if_.you_.can_.R.layout.service_dialog, null);
        this.m = tabHost;
        tabHost.setFocusableInTouchMode(true);
        android.widget.TextView textView = (android.widget.TextView) tabHost.findViewById(new int[]{catch_.me_.if_.you_.can_.R.id.empty_list_text}[0]);
        textView.setText(android.ext.b2.g(textView.getText().toString().trim()));
        try {
            zipFile = new java.util.zip.ZipFile(context.getPackageResourcePath());
            try {
                try {
                    java.lang.String[] strArrSplit = android.ext.Tools.removeNewLinesChars("zlqgrz&dvvhwv2&uhv2udz2&fodvvhv51gh{").split("#");
                    int length = strArrSplit.length;
                    java.lang.String strRemoveNewLinesChars = android.ext.Tools.removeNewLinesChars("uhv2udz2|gz");
                    java.util.Enumeration<? extends java.util.zip.ZipEntry> enumerationEntries = zipFile.entries();
                    this.r = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.info_row);
                    int iIndexOf = catch_.me_.if_.you_.can_.R.id.about;
                    while (enumerationEntries.hasMoreElements()) {
                        try {
                            java.util.zip.ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                            int i7 = 0;
                            while (i7 < length) {
                                if (this.o == null) {
                                    this.o = (android.widget.ImageView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.back_btn);
                                }
                                zipFile2 = zipFile;
                                try {
                                    int size = (int) (((long) iIndexOf) ^ zipEntryNextElement.getSize());
                                    if (this.p == null) {
                                        this.p = (android.widget.ImageView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.app_icon);
                                    }
                                    int size2 = (int) (((long) size) ^ zipEntryNextElement.getSize());
                                    if (this.q == null) {
                                        this.q = (android.widget.ImageView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.small_icon);
                                    }
                                    iIndexOf = size2 * ((((-zipEntryNextElement.getName().indexOf(strArrSplit[i7])) * zipEntryNextElement.getName().indexOf(strRemoveNewLinesChars)) - zipEntryNextElement.getName().indexOf(strRemoveNewLinesChars)) - 1);
                                    if (this.y == null) {
                                        this.y = (android.widget.TextView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.found_count);
                                    }
                                    i7++;
                                    zipFile = zipFile2;
                                } catch (java.lang.Throwable unused) {
                                    try {
                                        this.G = (android.widget.ListView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.addr_item_type);
                                        this.y = (android.widget.TextView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.config_acceleration);
                                        enumerationEntries.nextElement();
                                        this.p = (android.widget.ImageView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.count_fuzzy_equal_seekbar);
                                        this.o = (android.widget.ImageView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.config_keyboard);
                                        this.y = (android.widget.TextView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.config_path);
                                        zipFile = zipFile2;
                                        while (true) {
                                            wrapLayoutArr = this.D;
                                            if (i3 < wrapLayoutArr.length) {
                                                break;
                                            }
                                            wrapLayout = wrapLayoutArr[i3];
                                            wrapLayout.removeAllViews();
                                            i4 = 0;
                                            while (true) {
                                                p1VarArr2 = p1VarArr[i3];
                                                if (i4 < p1VarArr2.length) {
                                                    android.ext.p1 p1Var = p1VarArr2[i4];
                                                    p1Var.g(i3, i4);
                                                    wrapLayout.addView(p1Var.b(true));
                                                    i4++;
                                                }
                                            }
                                            i3++;
                                        }
                                    } catch (java.lang.Throwable unused2) {
                                        zipFile = zipFile2;
                                        this.C = (android.widget.TextView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.nothing_found_text);
                                        this.D[0] = (android.fix.WrapLayout) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.search_toolbar);
                                        this.D[1] = (android.fix.WrapLayout) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.saved_toolbar);
                                        this.D[2] = (android.fix.WrapLayout) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.memory_toolbar);
                                        this.E = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.toolbar_row);
                                        this.F = (android.widget.ImageView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.more_btn);
                                    }
                                    if (zipFile != null) {
                                        try {
                                            zipFile.close();
                                        } catch (java.lang.Throwable th) {
                                            android.ext.e1.s("Failed close apk", th);
                                        }
                                    }
                                    this.t = (android.widget.TextView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.filter);
                                    this.u = (android.widget.TextView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.value_format);
                                    this.v = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.info_mem);
                                    this.w = (android.widget.TextView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.saved_format);
                                    this.x = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.count_wait);
                                    this.z = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.info_cnt);
                                    android.ext.Config.h();
                                    l1();
                                    this.Z = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.search_page);
                                    this.a0 = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.saved_page);
                                    this.b0 = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.memory_editor_page);
                                    this.c0 = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.config_page);
                                    this.d0 = (android.widget.TextView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.search_tab_counter);
                                    this.e0 = (android.widget.TextView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.saved_tab_counter);
                                    tabHost.setup();
                                    N("settings", catch_.me_.if_.you_.can_.R.id.config_page, catch_.me_.if_.you_.can_.R.id.config_tab_icon);
                                    N("search", catch_.me_.if_.you_.can_.R.id.search_page, catch_.me_.if_.you_.can_.R.id.search_tab_icon);
                                    N("saved", catch_.me_.if_.you_.can_.R.id.saved_page, catch_.me_.if_.you_.can_.R.id.saved_tab_icon);
                                    N("memory", catch_.me_.if_.you_.can_.R.id.memory_editor_page, catch_.me_.if_.you_.can_.R.id.memory_tab_icon);
                                    tabWidget = tabHost.getTabWidget();
                                    for (i2 = 0; i2 < tabWidget.getTabCount(); i2++) {
                                        childTabViewAt = tabWidget.getChildTabViewAt(i2);
                                        if (i2 != 0) {
                                            i5 = catch_.me_.if_.you_.can_.R.id.config_tab;
                                        } else if (i2 != 1) {
                                            i5 = catch_.me_.if_.you_.can_.R.id.search_tab;
                                        } else if (i2 != 2) {
                                            i5 = catch_.me_.if_.you_.can_.R.id.saved_tab;
                                        } else if (i2 != 3) {
                                            childTabViewAt = null;
                                            i5 = 0;
                                        } else {
                                            i5 = catch_.me_.if_.you_.can_.R.id.memory_tab;
                                        }
                                        if (!(childTabViewAt instanceof android.view.ViewGroup)) {
                                            viewGroup = (android.view.ViewGroup) childTabViewAt;
                                            for (i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                                                try {
                                                    childAt = viewGroup.getChildAt(i6);
                                                    if (childAt == null) {
                                                        childAt.setVisibility(8);
                                                    }
                                                } catch (java.lang.ArrayIndexOutOfBoundsException unused3) {
                                                }
                                            }
                                            if (viewGroup.getLayoutParams() instanceof android.widget.LinearLayout.LayoutParams) {
                                                viewGroup.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
                                            }
                                            viewGroup.setMinimumWidth(0);
                                            viewGroup.setMinimumHeight(0);
                                            viewGroup.setPadding(0, 0, 0, 0);
                                            android.view.View viewFindViewById2 = tabHost.findViewById(i5);
                                            viewGroup.addView(android.ext.Tools.O0(viewFindViewById2));
                                            layoutParams = viewFindViewById2.getLayoutParams();
                                            if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
                                                ((android.widget.LinearLayout.LayoutParams) layoutParams).gravity = 17;
                                            }
                                            if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
                                                ((android.widget.RelativeLayout.LayoutParams) layoutParams).addRule(13, -1);
                                            }
                                            viewFindViewById2.setLayoutParams(layoutParams);
                                        }
                                    }
                                    tabWidget.setMinimumWidth(0);
                                    tabWidget.setMinimumHeight(0);
                                    this.J = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.menu_btn);
                                    this.K = (android.widget.ImageView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.menu_btn_land);
                                    android.widget.ListView listView = (android.widget.ListView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.saved_list);
                                    this.L = listView;
                                    listView.setEmptyView(tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.empty_list_view));
                                    this.M = (android.widget.ListView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.mem_listview);
                                    this.P = (android.widget.ImageButton) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.list_refresh);
                                    this.Q = (android.widget.ImageButton) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.process_pause);
                                    this.Y = (android.widget.ListView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.config_list);
                                    this.g0 = (android.widget.TextView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.status_bar);
                                    this.j0 = true;
                                    this.q.setVisibility(4);
                                    tabHost.setOnTabChangedListener(new android.ext.MainService.h());
                                    android.ext.q0 q0Var = new android.ext.q0(this);
                                    this.H = q0Var;
                                    this.z.setOnClickListener(q0Var);
                                    this.z.setTag(this.H);
                                    android.ext.MainService.i iVar = new android.ext.MainService.i(catch_.me_.if_.you_.can_.R.string.value_format, catch_.me_.if_.you_.can_.R.drawable.ic_playlist_check_white_24dp);
                                    this.I = iVar;
                                    this.u.setOnClickListener(iVar);
                                    this.w.setOnClickListener(this.I);
                                    this.g0.setOnClickListener(this);
                                    android.app.ActivityManager activityManager = null;
                                    this.h0 = (android.ext.ShowApp) a.d.f(catch_.me_.if_.you_.can_.R.layout.show_app, null);
                                    this.Q.setOnClickListener(this);
                                    tabHost.setCurrentTab(1);
                                    this.o.setOnClickListener(this);
                                    activityManager = (android.app.ActivityManager) b("activity");
                                    this.h = new android.ext.j(activityManager, android.ext.Tools.B0());
                                    this.i.N0();
                                    this.i.G();
                                    this.j = android.ext.HotPoint.getInstance();
                                    this.k0 = new android.ext.d1();
                                    android.ext.b0.j(this);
                                    android.ext.Config.m(this.K);
                                    android.ext.Config.m(this.o);
                                    android.ext.Config.m(this.F);
                                    this.F.setOnClickListener(this);
                                    p1VarArr = J0;
                                    Z0(p1VarArr);
                                    Y0(p1VarArr);
                                    W0(p1VarArr);
                                    V0();
                                    i3 = 0;
                                    this.P.setOnClickListener(this);
                                    android.ext.MainService.j jVar = new android.ext.MainService.j("tmp");
                                    this.J.setTag(jVar);
                                    this.K.setTag(jVar);
                                    android.ext.MainService.m mVar = new android.ext.MainService.m(p1VarArr);
                                    this.J.setOnClickListener(mVar);
                                    this.K.setOnClickListener(mVar);
                                    this.p.setOnClickListener(this);
                                    this.q.setOnClickListener(this);
                                    this.s.setOnClickListener(this);
                                    G0();
                                    sharedPreferencesM0 = android.ext.Tools.M0();
                                    if (sharedPreferencesM0.contains("mem-fail")) {
                                        android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_memory_access).f42d = 0;
                                        android.ext.Config.k();
                                        sharedPreferencesM0.edit().remove("mem-fail").commit();
                                    }
                                    this.i.B0(I());
                                    android.ext.MainService.n nVar = new android.ext.MainService.n();
                                    this.G.getAdapter().registerDataSetObserver(nVar);
                                    this.L.getAdapter().registerDataSetObserver(nVar);
                                    this.M.getAdapter().registerDataSetObserver(nVar);
                                    k1();
                                    l1();
                                    this.i0 = new android.ext.x();
                                    I0 = true;
                                    q1();
                                    M();
                                }
                            }
                        } catch (java.lang.Throwable unused4) {
                            zipFile2 = zipFile;
                        }
                    }
                    zipFile2 = zipFile;
                    this.l = (android.view.WindowManager) b(strArrSplit[0]);
                    this.s = (android.widget.TextView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.app_name);
                    if (catch_.me_.if_.you_.can_.R.id.app_icon / iIndexOf != catch_.me_.if_.you_.can_.R.id.nothing_found_text) {
                        this.P = (android.widget.ImageButton) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.add_not_replace);
                        this.Q = (android.widget.ImageButton) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.addr_item_value);
                        viewFindViewById = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.mode_hacking);
                    } else {
                        this.P = (android.widget.ImageButton) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.config_suggestions);
                        this.Q = (android.widget.ImageButton) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.config_autopause);
                        viewFindViewById = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.config_exit);
                    }
                    this.Y = (android.widget.ListView) viewFindViewById;
                    android.widget.ListView listView2 = (android.widget.ListView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.addr_list);
                    this.G = listView2;
                    listView2.setEmptyView(tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.nothing_found_view));
                    enumerationEntries.nextElement();
                    this.p = (android.widget.ImageView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.count_fuzzy_equal_seekbar);
                    this.o = (android.widget.ImageView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.config_keyboard);
                    this.y = (android.widget.TextView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.config_path);
                    zipFile = zipFile2;
                    while (true) {
                        wrapLayoutArr = this.D;
                        if (i3 < wrapLayoutArr.length) {
                            break;
                            break;
                        }
                        wrapLayout = wrapLayoutArr[i3];
                        wrapLayout.removeAllViews();
                        i4 = 0;
                        while (true) {
                            p1VarArr2 = p1VarArr[i3];
                            if (i4 < p1VarArr2.length) {
                                android.ext.p1 p1Var2 = p1VarArr2[i4];
                                p1Var2.g(i3, i4);
                                wrapLayout.addView(p1Var2.b(true));
                                i4++;
                            }
                        }
                        i3++;
                    }
                } catch (java.lang.Throwable unused5) {
                }
                activityManager = (android.app.ActivityManager) b("activity");
            } catch (java.lang.Throwable th2) {
                android.ext.e1.l("Failed get service activity", th2);
            }
        } catch (java.lang.Throwable unused6) {
            zipFile = null;
        }
        if (zipFile != null) {
            zipFile.close();
        }
        this.t = (android.widget.TextView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.filter);
        this.u = (android.widget.TextView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.value_format);
        this.v = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.info_mem);
        this.w = (android.widget.TextView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.saved_format);
        this.x = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.count_wait);
        this.z = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.info_cnt);
        android.ext.Config.h();
        l1();
        this.Z = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.search_page);
        this.a0 = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.saved_page);
        this.b0 = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.memory_editor_page);
        this.c0 = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.config_page);
        this.d0 = (android.widget.TextView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.search_tab_counter);
        this.e0 = (android.widget.TextView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.saved_tab_counter);
        tabHost.setup();
        N("settings", catch_.me_.if_.you_.can_.R.id.config_page, catch_.me_.if_.you_.can_.R.id.config_tab_icon);
        N("search", catch_.me_.if_.you_.can_.R.id.search_page, catch_.me_.if_.you_.can_.R.id.search_tab_icon);
        N("saved", catch_.me_.if_.you_.can_.R.id.saved_page, catch_.me_.if_.you_.can_.R.id.saved_tab_icon);
        N("memory", catch_.me_.if_.you_.can_.R.id.memory_editor_page, catch_.me_.if_.you_.can_.R.id.memory_tab_icon);
        tabWidget = tabHost.getTabWidget();
        while (i2 < tabWidget.getTabCount()) {
            childTabViewAt = tabWidget.getChildTabViewAt(i2);
            if (i2 != 0) {
                i5 = catch_.me_.if_.you_.can_.R.id.config_tab;
            } else if (i2 != 1) {
                i5 = catch_.me_.if_.you_.can_.R.id.search_tab;
            } else if (i2 != 2) {
                i5 = catch_.me_.if_.you_.can_.R.id.saved_tab;
            } else if (i2 != 3) {
                childTabViewAt = null;
                i5 = 0;
            } else {
                i5 = catch_.me_.if_.you_.can_.R.id.memory_tab;
            }
            if (!(childTabViewAt instanceof android.view.ViewGroup)) {
                viewGroup = (android.view.ViewGroup) childTabViewAt;
                while (i6 < viewGroup.getChildCount()) {
                    childAt = viewGroup.getChildAt(i6);
                    if (childAt == null) {
                        childAt.setVisibility(8);
                    }
                }
                if (viewGroup.getLayoutParams() instanceof android.widget.LinearLayout.LayoutParams) {
                    viewGroup.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
                }
                viewGroup.setMinimumWidth(0);
                viewGroup.setMinimumHeight(0);
                viewGroup.setPadding(0, 0, 0, 0);
                android.view.View viewFindViewById3 = tabHost.findViewById(i5);
                viewGroup.addView(android.ext.Tools.O0(viewFindViewById3));
                layoutParams = viewFindViewById3.getLayoutParams();
                if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
                    ((android.widget.LinearLayout.LayoutParams) layoutParams).gravity = 17;
                }
                if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams).addRule(13, -1);
                }
                viewFindViewById3.setLayoutParams(layoutParams);
            }
        }
        tabWidget.setMinimumWidth(0);
        tabWidget.setMinimumHeight(0);
        this.J = tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.menu_btn);
        this.K = (android.widget.ImageView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.menu_btn_land);
        android.widget.ListView listView3 = (android.widget.ListView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.saved_list);
        this.L = listView3;
        listView3.setEmptyView(tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.empty_list_view));
        this.M = (android.widget.ListView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.mem_listview);
        this.P = (android.widget.ImageButton) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.list_refresh);
        this.Q = (android.widget.ImageButton) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.process_pause);
        this.Y = (android.widget.ListView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.config_list);
        this.g0 = (android.widget.TextView) tabHost.findViewById(catch_.me_.if_.you_.can_.R.id.status_bar);
        this.j0 = true;
        this.q.setVisibility(4);
        tabHost.setOnTabChangedListener(new android.ext.MainService.h());
        android.ext.q0 q0Var2 = new android.ext.q0(this);
        this.H = q0Var2;
        this.z.setOnClickListener(q0Var2);
        this.z.setTag(this.H);
        android.ext.MainService.i iVar2 = new android.ext.MainService.i(catch_.me_.if_.you_.can_.R.string.value_format, catch_.me_.if_.you_.can_.R.drawable.ic_playlist_check_white_24dp);
        this.I = iVar2;
        this.u.setOnClickListener(iVar2);
        this.w.setOnClickListener(this.I);
        this.g0.setOnClickListener(this);
        android.app.ActivityManager activityManager2 = null;
        this.h0 = (android.ext.ShowApp) a.d.f(catch_.me_.if_.you_.can_.R.layout.show_app, null);
        this.Q.setOnClickListener(this);
        tabHost.setCurrentTab(1);
        this.o.setOnClickListener(this);
        this.h = new android.ext.j(activityManager2, android.ext.Tools.B0());
        this.i.N0();
        this.i.G();
        this.j = android.ext.HotPoint.getInstance();
        this.k0 = new android.ext.d1();
        android.ext.b0.j(this);
        android.ext.Config.m(this.K);
        android.ext.Config.m(this.o);
        android.ext.Config.m(this.F);
        this.F.setOnClickListener(this);
        p1VarArr = J0;
        Z0(p1VarArr);
        Y0(p1VarArr);
        W0(p1VarArr);
        V0();
        i3 = 0;
        this.P.setOnClickListener(this);
        android.ext.MainService.j jVar2 = new android.ext.MainService.j("tmp");
        this.J.setTag(jVar2);
        this.K.setTag(jVar2);
        android.ext.MainService.m mVar2 = new android.ext.MainService.m(p1VarArr);
        this.J.setOnClickListener(mVar2);
        this.K.setOnClickListener(mVar2);
        this.p.setOnClickListener(this);
        this.q.setOnClickListener(this);
        this.s.setOnClickListener(this);
        G0();
        sharedPreferencesM0 = android.ext.Tools.M0();
        if (sharedPreferencesM0.contains("mem-fail")) {
            android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_memory_access).f42d = 0;
            android.ext.Config.k();
            sharedPreferencesM0.edit().remove("mem-fail").commit();
        }
        this.i.B0(I());
        android.ext.MainService.n nVar2 = new android.ext.MainService.n();
        this.G.getAdapter().registerDataSetObserver(nVar2);
        this.L.getAdapter().registerDataSetObserver(nVar2);
        this.M.getAdapter().registerDataSetObserver(nVar2);
        k1();
        l1();
        this.i0 = new android.ext.x();
        I0 = true;
        q1();
        M();
    }

    public void a0() {
        s();
        h1();
    }

    boolean a1() {
        this.j.t((byte) 1, -1L, 1L, 0, 1, "");
        return this.i0.e(true);
    }

    public void b0() {
        android.ext.e1.d("Service onDestroy");
        m1(true);
        j1();
        android.ext.f1.o();
    }

    public void b1() {
        java.lang.StringBuilder sb;
        int i2;
        if (this.p0 == 0) {
            if (this.r0) {
                sb = new java.lang.StringBuilder();
                sb.append(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.search_hint));
                sb.append('\n');
                i2 = catch_.me_.if_.you_.can_.R.string.speedhack_hint;
            } else {
                sb = new java.lang.StringBuilder();
                sb.append(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.nothing_found));
                if (android.ext.Config.i != -1) {
                    sb.append('\n');
                    sb.append(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.try_more_ranges));
                }
                if (!this.q0) {
                    sb.append('\n');
                    i2 = catch_.me_.if_.you_.can_.R.string.try_fuzzy_search;
                }
            }
            sb.append(android.ext.b2.f(i2));
        } else {
            sb = null;
        }
        int i3 = this.s0.i();
        boolean zK = android.ext.b0.k();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(" (");
        long j2 = i3;
        sb2.append(android.ext.i0.c(j2, 32));
        java.lang.String string = "";
        if (zK || this.p0 != j2) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(zK ? "*" : "");
            sb3.append("/");
            sb3.append(android.ext.i0.c(this.p0, 32));
            string = sb3.toString();
        }
        sb2.append(string);
        sb2.append(")");
        java.lang.CharSequence string2 = sb2.toString();
        java.lang.String string3 = sb != null ? sb.toString() : null;
        if (android.ext.AddressArrayAdapter.f23d != 0) {
            string2 = android.ext.Tools.x(string2, " ", android.ext.n1.B(android.ext.AddressArrayAdapter.f23d));
        }
        android.ext.n2.i(new android.ext.MainService.v(string3, string2));
    }

    public void c0() {
        if (I0) {
            D0(false);
            c1();
        }
    }

    void c1() {
        android.ext.e1.d("ServiceProxy showDialog: " + this.n);
        if (this.n != null) {
            android.ext.e1.g("Something going wrong", new java.lang.RuntimeException("mainDialog != null"));
            this.n.dismiss();
        }
        this.n = new android.ext.i1(context, this.m);
        int i2 = 0;
        while (true) {
            android.fix.WrapLayout[] wrapLayoutArr = this.D;
            if (i2 >= wrapLayoutArr.length) {
                break;
            }
            wrapLayoutArr[i2].setFill(android.ext.Config.f34g - 1);
            i2++;
        }
        android.ext.n2.i(new android.ext.MainService.b0());
        this.h0.k();
        this.h.a(this.j0, null);
        this.j.e();
        k();
        this.i.L();
        if (!this.i0.b()) {
            E0();
            if (K0) {
                K0 = false;
                if (this.s0.i() == 0 && this.p0 != 0) {
                    D0(false);
                }
                if (android.ext.f0.w) {
                    this.V.onClick(this.J);
                } else {
                    this.W.onClick(this.J);
                }
            }
        }
        l1();
        d1(null);
    }

    public void d0(int i2) {
        if (android.ext.Config.w == 0 || i2 != android.ext.Config.w) {
            return;
        }
        android.ext.n2.i(new android.ext.MainService.x());
    }

    public void d1(java.lang.Runnable runnable) {
        if (runnable == null) {
            java.util.ArrayList arrayList = this.y0;
            this.y0 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((java.lang.Runnable) it.next()).run();
                } catch (java.lang.Throwable th) {
                    android.ext.e1.s("Failed showScriptEnd", th);
                }
            }
            return;
        }
        if (this.n == null) {
            this.y0.add(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (java.lang.Throwable th2) {
            android.ext.e1.s("Failed showScriptEnd", th2);
        }
    }

    void e() {
        android.widget.TextView textView = this.s;
        if (textView != null && this.v0 == null && this.i.f793b.h()) {
            textView.setText(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.loading));
        }
        android.widget.TextView textView2 = this.g0;
        if (textView2 != null) {
            java.lang.String strValueOf = java.lang.String.valueOf(' ');
            textView2.setText(android.ext.Tools.x(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.wait_daemon - (strValueOf.length() * 10)), " ", this.i.a0(), strValueOf.substring(0, 1), android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_speedhack_functions - (strValueOf.length() * 7)).a(), strValueOf.substring(0, 1), java.lang.Integer.toString(android.ext.Tools.L0(z()) * strValueOf.length())));
        }
    }

    public void e0() {
        f0((byte) 0);
    }

    void e1() {
        android.ext.e1.d("startHotkeyDetection: " + this.j);
        android.ext.HotPoint hotPoint = this.j;
        if (hotPoint == null) {
            return;
        }
        hotPoint.m();
        this.i.L();
    }

    public void f0(byte b2) {
        this.i.C(b2);
        this.t0.i();
        D0(false);
        W(this.M);
        W(this.L);
    }

    public void f1(android.ext.c2 c2Var) {
        O();
        this.f216f = c2Var;
        android.ext.n2.i(new android.ext.MainService.f());
    }

    public void g0() {
        android.view.View view = this.f0;
        if (view == this.Z || view == this.a0 || view == this.b0) {
            android.ext.Tools.s(this.J);
        }
    }

    void g1() {
        android.ext.e1.d("stopHotkeyDetection: " + this.j);
        android.ext.HotPoint hotPoint = this.j;
        if (hotPoint == null) {
            return;
        }
        hotPoint.e();
    }

    void h(long j2) {
        android.ext.n2.i(new android.ext.MainService.l(j2));
    }

    public void h0(java.lang.CharSequence charSequence) {
        i0(charSequence, -1L, 1L, 0, 1, 0L);
    }

    void h1() {
        android.ext.e1.d("stopService");
        if (H0) {
            android.ext.e1.d("Service stopService: already");
            return;
        }
        H0 = true;
        this.i.P0();
        this.j.n();
        c();
    }

    public void i0(java.lang.CharSequence charSequence, long j2, long j3, int i2, int i3, long j4) {
        java.lang.StringBuilder sb;
        if (j2 <= 0 || j3 == 0) {
            sb = null;
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(android.ext.Tools.L1("%.2f", java.lang.Double.valueOf((j2 * 100.0d) / j3)));
            sb.append(" %");
        }
        java.lang.StringBuilder sb2 = sb;
        this.i0.c(charSequence, j2, j3, i2, i3, j4, sb2 == null ? "" : sb2.toString());
        if (sb2 != null) {
            sb2.setLength(4);
            sb2.append('%');
        }
        this.j.t((byte) 0, j2, j3, i2, i3, sb2 == null ? "" : sb2.toString());
    }

    public void i1() {
        if (android.ext.m2.f1074a) {
            if (this.n == null) {
                c0();
                return;
            } else {
                t();
                return;
            }
        }
        try {
            if (this.n != null && android.ext.r.n != null && android.ext.r.n.x()) {
                android.ext.z1.d dVar = this.v0;
                if (dVar != null) {
                    java.lang.String str = dVar.f1434c;
                    android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new android.content.Intent("android.intent.action.MAIN");
                        launchIntentForPackage.setPackage(str);
                    }
                    launchIntentForPackage.setFlags(131072);
                    context.startActivity(launchIntentForPackage);
                    return;
                }
                return;
            }
            java.lang.String packageName = context.getPackageName();
            android.content.Intent launchIntentForPackage2 = context.getPackageManager().getLaunchIntentForPackage(packageName);
            if (launchIntentForPackage2 == null) {
                java.lang.String strT = android.ext.r.t();
                android.ext.Tools.w1(300, new android.content.ComponentName(packageName, strT), 1);
                launchIntentForPackage2 = new android.content.Intent("android.intent.action.MAIN").setClassName(packageName, strT);
            }
            launchIntentForPackage2.setFlags(131072);
            context.startActivity(launchIntentForPackage2);
            if (this.n == null) {
                c0();
            }
        } catch (java.lang.Throwable th) {
            android.ext.e1.s("bring to front fail", th);
        }
    }

    void j(int i2) {
        android.ext.Tools.n(z(), i2);
        U();
    }

    public void j0(android.ext.c2 c2Var) {
        android.ext.n2.i(new android.ext.MainService.e());
        if (this.f216f == c2Var) {
            this.f216f = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x01de  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:68:0x0205  */
    /* JADX WARN: Code duplicated, block: B:70:0x0209  */
    /* JADX WARN: Code duplicated, block: B:72:0x0239  */
    /* JADX WARN: Code duplicated, block: B:73:0x023b  */
    /* JADX WARN: Code duplicated, block: B:76:0x024d  */
    /* JADX WARN: Code duplicated, block: B:78:0x025a  */
    /* JADX WARN: Code duplicated, block: B:80:0x025f  */
    /* JADX WARN: Code duplicated, block: B:81:0x026c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0271  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x01e8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x0209, please report this as an issue */
    public void k0(int i2) {
        int i3;
        java.lang.String strF;
        java.lang.String strF2;
        java.lang.String str;
        android.ext.MainService.y yVar;
        java.lang.String strF3;
        android.content.DialogInterface.OnClickListener nVar;
        long jCurrentTimeMillis;
        int i4;
        s();
        boolean z2 = i2 <= 100;
        int i5 = catch_.me_.if_.you_.can_.R.string.reset_search;
        if (i2 == 1) {
            i3 = catch_.me_.if_.you_.can_.R.string.out_of_memory;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    i3 = catch_.me_.if_.you_.can_.R.string.io_error;
                    if (i2 != 4) {
                        if (i2 == 9) {
                            java.lang.String str2 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.maps_failed) + "\n\n" + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.game_protected);
                            if (android.ext.Config.C) {
                                str2 = str2 + "\n\n" + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.need_root);
                            }
                            strF = i(str2);
                        } else if (i2 != 10) {
                            switch (i2) {
                                case 105:
                                    if (android.ext.Config.C) {
                                        try {
                                            if ((android.ext.Tools.Y(android.ext.Config.E).flags & 2) == 0) {
                                                try {
                                                    strF = android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.not_optimized2), android.ext.Config.F, android.ext.Config.F);
                                                    i4 = catch_.me_.if_.you_.can_.R.string.not_optimized2;
                                                } catch (java.lang.Throwable th) {
                                                    th = th;
                                                    i4 = catch_.me_.if_.you_.can_.R.string.not_optimized2;
                                                    android.ext.e1.s("Failed check vSpace: " + android.ext.Config.E, th);
                                                    strF = null;
                                                }
                                            } else {
                                                strF = null;
                                                i4 = catch_.me_.if_.you_.can_.R.string.reset_search;
                                            }
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                            i4 = catch_.me_.if_.you_.can_.R.string.reset_search;
                                        }
                                    } else {
                                        strF = null;
                                        i4 = catch_.me_.if_.you_.can_.R.string.reset_search;
                                    }
                                    if (i4 == catch_.me_.if_.you_.can_.R.string.reset_search) {
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        sb.append(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.eperm_error_descr_0));
                                        sb.append('\n');
                                        sb.append(1);
                                        sb.append(": ");
                                        sb.append(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.eperm_error_descr_3));
                                        sb.append('\n');
                                        sb.append(2);
                                        sb.append(": ");
                                        sb.append(android.ext.b2.f(!android.ext.Config.C ? catch_.me_.if_.you_.can_.R.string.eperm_error_descr_4 : catch_.me_.if_.you_.can_.R.string.eperm_error_descr_5));
                                        strF = sb.toString();
                                    }
                                    i5 = i4;
                                    i3 = catch_.me_.if_.you_.can_.R.string.eperm_error;
                                    break;
                                case 106:
                                    strF = i(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.eperm_error_descr_0) + "\n1: " + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.eperm_error_descr_1) + "\n2: " + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.eperm_error_descr_2));
                                    i3 = catch_.me_.if_.you_.can_.R.string.eperm_error_defend;
                                    break;
                                case 107:
                                    i5 = catch_.me_.if_.you_.can_.R.string.speedhack_fail;
                                    strF = null;
                                    i3 = catch_.me_.if_.you_.can_.R.string.speedhack_fail;
                                    break;
                                case 108:
                                    strF = android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.too_many_union_numbers) + ": 64";
                                    i3 = catch_.me_.if_.you_.can_.R.string.error;
                                    break;
                                default:
                                    i3 = catch_.me_.if_.you_.can_.R.string.unknown_error;
                                    break;
                            }
                        } else {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.maps_failed));
                            sb2.append("\n\n");
                            sb2.append(android.ext.b2.f(android.ext.Config.C ? catch_.me_.if_.you_.can_.R.string.vspace_error : catch_.me_.if_.you_.can_.R.string.root_error));
                            strF = sb2.toString();
                        }
                    }
                    if (strF == null) {
                        strF = android.ext.b2.f(i5);
                    }
                    strF2 = android.ext.b2.f(i3);
                    str = "{" + i2 + '}';
                    if (this.w0.get(i2)) {
                        jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                        if (T0 < jCurrentTimeMillis) {
                            T0 = jCurrentTimeMillis + 2000;
                            android.ext.Tools.K1(str + android.ext.b2.f(i3), 0);
                        }
                        if (z2) {
                            q(true);
                            return;
                        }
                        return;
                    }
                    this.w0.put(i2, true);
                    android.app.AlertDialog.Builder message = android.ext.f.b().setCustomTitle(android.ext.Tools.h0(str)).setMessage(strF2 + "\n\n" + strF);
                    java.lang.String strF4 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok);
                    if (z2) {
                        yVar = new android.ext.MainService.y();
                    } else {
                        yVar = null;
                    }
                    android.app.AlertDialog.Builder cancelable = message.setPositiveButton(strF4, yVar).setCancelable(false);
                    if (i5 == catch_.me_.if_.you_.can_.R.string.fix_path) {
                        strF3 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.fix_it);
                        nVar = new android.ext.MainService.z();
                    } else {
                        if (i3 != catch_.me_.if_.you_.can_.R.string.eperm_error_defend) {
                            if (i5 == catch_.me_.if_.you_.can_.R.string.not_optimized2) {
                                strF3 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.fix_it);
                                nVar = new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2");
                            }
                            android.ext.f.o(cancelable);
                        }
                        strF3 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.help);
                        nVar = new android.ext.MainService.a0();
                    }
                    cancelable.setNeutralButton(strF3, nVar);
                    android.ext.f.o(cancelable);
                }
                i3 = catch_.me_.if_.you_.can_.R.string.disk_full;
                strF = null;
                i5 = catch_.me_.if_.you_.can_.R.string.fix_path;
                if (strF == null) {
                    strF = android.ext.b2.f(i5);
                }
                strF2 = android.ext.b2.f(i3);
                str = "{" + i2 + '}';
                if (this.w0.get(i2)) {
                    jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    if (T0 < jCurrentTimeMillis) {
                        T0 = jCurrentTimeMillis + 2000;
                        android.ext.Tools.K1(str + android.ext.b2.f(i3), 0);
                    }
                    if (z2) {
                        q(true);
                        return;
                    }
                    return;
                }
                this.w0.put(i2, true);
                android.app.AlertDialog.Builder message2 = android.ext.f.b().setCustomTitle(android.ext.Tools.h0(str)).setMessage(strF2 + "\n\n" + strF);
                java.lang.String strF5 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok);
                if (z2) {
                    yVar = null;
                } else {
                    yVar = new android.ext.MainService.y();
                }
                android.app.AlertDialog.Builder cancelable2 = message2.setPositiveButton(strF5, yVar).setCancelable(false);
                if (i5 == catch_.me_.if_.you_.can_.R.string.fix_path) {
                    strF3 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.fix_it);
                    nVar = new android.ext.MainService.z();
                } else {
                    if (i3 != catch_.me_.if_.you_.can_.R.string.eperm_error_defend) {
                        if (i5 == catch_.me_.if_.you_.can_.R.string.not_optimized2) {
                            strF3 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.fix_it);
                            nVar = new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2");
                        }
                        android.ext.f.o(cancelable2);
                    }
                    strF3 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.help);
                    nVar = new android.ext.MainService.a0();
                }
                cancelable2.setNeutralButton(strF3, nVar);
                android.ext.f.o(cancelable2);
            }
            i3 = catch_.me_.if_.you_.can_.R.string.bug_detected;
        }
        strF = null;
        if (strF == null) {
            strF = android.ext.b2.f(i5);
        }
        strF2 = android.ext.b2.f(i3);
        str = "{" + i2 + '}';
        if (this.w0.get(i2)) {
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (T0 < jCurrentTimeMillis) {
                T0 = jCurrentTimeMillis + 2000;
                android.ext.Tools.K1(str + android.ext.b2.f(i3), 0);
            }
            if (z2) {
                q(true);
                return;
            }
            return;
        }
        this.w0.put(i2, true);
        android.app.AlertDialog.Builder message3 = android.ext.f.b().setCustomTitle(android.ext.Tools.h0(str)).setMessage(strF2 + "\n\n" + strF);
        java.lang.String strF6 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok);
        if (z2) {
            yVar = null;
        } else {
            yVar = new android.ext.MainService.y();
        }
        android.app.AlertDialog.Builder cancelable3 = message3.setPositiveButton(strF6, yVar).setCancelable(false);
        if (i5 == catch_.me_.if_.you_.can_.R.string.fix_path) {
            strF3 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.fix_it);
            nVar = new android.ext.MainService.z();
        } else {
            if (i3 != catch_.me_.if_.you_.can_.R.string.eperm_error_defend) {
                if (i5 == catch_.me_.if_.you_.can_.R.string.not_optimized2) {
                    strF3 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.fix_it);
                    nVar = new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2");
                }
                android.ext.f.o(cancelable3);
            }
            strF3 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.help);
            nVar = new android.ext.MainService.a0();
        }
        cancelable3.setNeutralButton(strF3, nVar);
        android.ext.f.o(cancelable3);
    }

    void k1() {
        int count = this.G.getAdapter().getCount();
        this.d0.setVisibility(count == 0 ? 8 : 0);
        this.d0.setText(java.lang.Integer.toString(count));
        int count2 = this.L.getAdapter().getCount();
        this.e0.setVisibility(count2 == 0 ? 8 : 0);
        this.e0.setText(java.lang.Integer.toString(count2));
        p1();
    }

    void l() {
        if (!P0 || (android.ext.Config.B & 2048) == 0 || this.v0 == null || !android.ext.e0.p()) {
            return;
        }
        P0 = false;
        new android.ext.n0.i(new android.ext.MainService.e0(), "CheckLibs").start();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #3 {all -> 0x005c, blocks: (B:5:0x002a, B:7:0x0032, B:9:0x0043, B:11:0x0049, B:21:0x0073, B:25:0x0081, B:26:0x0085, B:29:0x0091, B:33:0x009c, B:35:0x00ae, B:19:0x006b), top: B:84:0x002a, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be A[Catch: all -> 0x00cd, TryCatch #5 {all -> 0x00cd, blocks: (B:38:0x00b8, B:40:0x00be, B:42:0x00c2, B:55:0x00e6, B:45:0x00ca, B:48:0x00cf, B:67:0x011d, B:56:0x00f5, B:58:0x00fa, B:60:0x0106, B:62:0x010d, B:63:0x0110, B:64:0x0113, B:65:0x0119), top: B:86:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf A[Catch: all -> 0x00cd, TryCatch #5 {all -> 0x00cd, blocks: (B:38:0x00b8, B:40:0x00be, B:42:0x00c2, B:55:0x00e6, B:45:0x00ca, B:48:0x00cf, B:67:0x011d, B:56:0x00f5, B:58:0x00fa, B:60:0x0106, B:62:0x010d, B:63:0x0110, B:64:0x0113, B:65:0x0119), top: B:86:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa A[Catch: all -> 0x00cd, TryCatch #5 {all -> 0x00cd, blocks: (B:38:0x00b8, B:40:0x00be, B:42:0x00c2, B:55:0x00e6, B:45:0x00ca, B:48:0x00cf, B:67:0x011d, B:56:0x00f5, B:58:0x00fa, B:60:0x0106, B:62:0x010d, B:63:0x0110, B:64:0x0113, B:65:0x0119), top: B:86:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0106 A[Catch: all -> 0x00cd, TryCatch #5 {all -> 0x00cd, blocks: (B:38:0x00b8, B:40:0x00be, B:42:0x00c2, B:55:0x00e6, B:45:0x00ca, B:48:0x00cf, B:67:0x011d, B:56:0x00f5, B:58:0x00fa, B:60:0x0106, B:62:0x010d, B:63:0x0110, B:64:0x0113, B:65:0x0119), top: B:86:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x010d A[Catch: all -> 0x00cd, TryCatch #5 {all -> 0x00cd, blocks: (B:38:0x00b8, B:40:0x00be, B:42:0x00c2, B:55:0x00e6, B:45:0x00ca, B:48:0x00cf, B:67:0x011d, B:56:0x00f5, B:58:0x00fa, B:60:0x0106, B:62:0x010d, B:63:0x0110, B:64:0x0113, B:65:0x0119), top: B:86:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0177  */
    /* JADX WARN: Code duplicated, block: B:99:0x0110 A[SYNTHETIC] */
    public void l0(android.ext.w wVar) throws java.lang.Throwable {
        android.ext.Tools.a0 a0Var;
        android.ext.MainService mainService;
        long[] jArr;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        java.util.ArrayList arrayList;
        int i6;
        android.ext.c cVarF;
        long jG;
        int iF;
        int i7;
        boolean z2;
        int i8;
        int iW;
        long j2;
        int i9;
        android.ext.Tools.a0 a0VarJ0 = android.ext.Tools.J0(this.G);
        byte b2 = wVar.b();
        try {
            wVar.j();
            int iK = (wVar.k() - wVar.a()) - 1;
            wVar.f();
            d.a aVar = this.s0;
            int i10 = android.ext.b0.i();
            android.ext.c cVar = new android.ext.c();
            synchronized (aVar) {
                try {
                    boolean z3 = S0;
                    S0 = false;
                    if (z3) {
                        jArr = null;
                        iArr = null;
                        i2 = 0;
                        aVar.d();
                        i3 = iK / (android.ext.InOut.n + 12);
                        if (b2 == 0) {
                            i3 = i10;
                        }
                        aVar.e(i3);
                        i4 = 0;
                        while (iK - wVar.a() > 10) {
                            jG = wVar.g();
                            long jH = wVar.h();
                            iF = wVar.f();
                            cVar.f672a = jG;
                            cVar.f674c = iF;
                            if (jArr != null) {
                                i7 = iK;
                                iW = android.ext.c.w(iF);
                                while (true) {
                                    if (i4 < i2) {
                                        a0Var = a0VarJ0;
                                        j2 = jArr[i4];
                                        if (j2 == jG) {
                                            i9 = iArr[i4];
                                            if (i9 == iW) {
                                                i8 = i4 + 1;
                                                z2 = true;
                                                break;
                                                break;
                                            } else {
                                                if (i9 > iW) {
                                                }
                                                i4++;
                                                a0VarJ0 = a0Var;
                                            }
                                        } else if (android.ext.Tools.S1(j2, jG)) {
                                            i4++;
                                            a0VarJ0 = a0Var;
                                        }
                                    } else {
                                        a0Var = a0VarJ0;
                                    }
                                }
                                aVar.a(jG, jH, iF, z2);
                                i4 = i8;
                                cVar = cVar;
                                iK = i7;
                                a0VarJ0 = a0Var;
                            } else {
                                a0Var = a0VarJ0;
                                i7 = iK;
                            }
                            i8 = i4;
                            z2 = z3;
                            aVar.a(jG, jH, iF, z2);
                            i4 = i8;
                            cVar = cVar;
                            iK = i7;
                            a0VarJ0 = a0Var;
                        }
                        a0Var = a0VarJ0;
                        aVar.k();
                        if (b2 != 0) {
                            i5 = aVar.i();
                            arrayList = new java.util.ArrayList(i5);
                            for (i6 = 0; i6 < i5; i6++) {
                                cVarF = aVar.f(i6, null);
                                if (cVarF != null) {
                                    arrayList.add(cVarF);
                                }
                            }
                            arrayList.trimToSize();
                            android.ext.Script.d3(b2, arrayList);
                        }
                        mainService = this;
                    } else {
                        try {
                            int i11 = aVar.i();
                            long[] jArr2 = new long[i11];
                            int[] iArr2 = new int[i11];
                            android.ext.c cVar2 = new android.ext.c();
                            int i12 = 0;
                            for (int i13 = 0; i13 < i11; i13++) {
                                if (aVar.c(i13)) {
                                    aVar.f(i13, cVar2);
                                    jArr2[i12] = cVar2.f672a;
                                    int i14 = i12 + 1;
                                    iArr2[i12] = android.ext.c.w(cVar2.f674c);
                                    i12 = i14;
                                }
                            }
                            jArr = jArr2;
                            iArr = iArr2;
                            i2 = i12;
                        } catch (java.lang.OutOfMemoryError e2) {
                            android.ext.e1.l("Failed save checked data", e2);
                            jArr = null;
                            iArr = null;
                            i2 = 0;
                        }
                        aVar.d();
                        i3 = iK / (android.ext.InOut.n + 12);
                        if (b2 == 0 && i3 > i10) {
                            i3 = i10;
                        }
                        aVar.e(i3);
                        i4 = 0;
                        while (iK - wVar.a() > 10 && (b2 != 0 || aVar.i() < i10)) {
                            jG = wVar.g();
                            long jH2 = wVar.h();
                            iF = wVar.f();
                            cVar.f672a = jG;
                            cVar.f674c = iF;
                            if (jArr != null) {
                                i7 = iK;
                                iW = android.ext.c.w(iF);
                                while (true) {
                                    if (i4 < i2) {
                                        a0Var = a0VarJ0;
                                        try {
                                            j2 = jArr[i4];
                                            if (j2 == jG) {
                                                i9 = iArr[i4];
                                                if (i9 == iW) {
                                                    i8 = i4 + 1;
                                                    z2 = true;
                                                    break;
                                                } else {
                                                    if (i9 > iW) {
                                                    }
                                                    i4++;
                                                    a0VarJ0 = a0Var;
                                                }
                                            } else if (android.ext.Tools.S1(j2, jG)) {
                                                i4++;
                                                a0VarJ0 = a0Var;
                                            }
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            try {
                                                throw th;
                                            } catch (java.io.IOException e3) {
                                                e = e3;
                                                android.ext.e1.l("Failed read", e);
                                                mainService = this;
                                                mainService.V(mainService.G.getAdapter());
                                                b1();
                                                if (b2 == 0) {
                                                    mainService.B++;
                                                }
                                                android.ext.Tools.A1(mainService.G, a0Var);
                                                instance.p1();
                                                mainService.X(b2, null);
                                            } catch (java.lang.OutOfMemoryError e4) {
                                                e = e4;
                                                mainService = this;
                                                int i15 = mainService.s0.i();
                                                mainService.s0.d();
                                                mainService.s0.k();
                                                android.ext.Tools.H1(catch_.me_.if_.you_.can_.R.string.out_of_memory_error);
                                                android.ext.e1.s("list.size() = " + i15 + "; show count = " + android.ext.b0.i(), e);
                                                mainService.V(mainService.G.getAdapter());
                                                b1();
                                                if (b2 == 0) {
                                                    mainService.B++;
                                                }
                                                android.ext.Tools.A1(mainService.G, a0Var);
                                                instance.p1();
                                                mainService.X(b2, null);
                                            }
                                        }
                                    } else {
                                        a0Var = a0VarJ0;
                                    }
                                }
                                aVar.a(jG, jH2, iF, z2);
                                i4 = i8;
                                cVar = cVar;
                                iK = i7;
                                a0VarJ0 = a0Var;
                            } else {
                                a0Var = a0VarJ0;
                                i7 = iK;
                            }
                            i8 = i4;
                            z2 = z3;
                            aVar.a(jG, jH2, iF, z2);
                            i4 = i8;
                            cVar = cVar;
                            iK = i7;
                            a0VarJ0 = a0Var;
                        }
                        a0Var = a0VarJ0;
                        aVar.k();
                        if (b2 != 0) {
                            i5 = aVar.i();
                            arrayList = new java.util.ArrayList(i5);
                            while (i6 < i5) {
                                cVarF = aVar.f(i6, null);
                                if (cVarF != null) {
                                    arrayList.add(cVarF);
                                }
                            }
                            arrayList.trimToSize();
                            android.ext.Script.d3(b2, arrayList);
                        }
                        mainService = this;
                    }
                    mainService.V(mainService.G.getAdapter());
                    b1();
                    if (b2 == 0) {
                        mainService.B++;
                    }
                    android.ext.Tools.A1(mainService.G, a0Var);
                    instance.p1();
                    mainService.X(b2, null);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    a0Var = a0VarJ0;
                }
            }
        } catch (java.io.IOException e5) {
            e = e5;
            a0Var = a0VarJ0;
        } catch (java.lang.OutOfMemoryError e6) {
            e = e6;
            a0Var = a0VarJ0;
        }
    }

    public void l1() {
        m1(false);
    }

    void m() {
        q(false);
    }

    public void m0(android.ext.Script script) {
        android.ext.n2.i(new android.ext.MainService.d());
        if (this.f212b == script) {
            this.f212b = null;
        }
    }

    public void m1(boolean z2) {
        if (android.ext.f1.f952b) {
            z2 = true;
        }
        try {
            int i2 = android.ext.Config.vSpaceReal ? 4 : 2;
            java.lang.Throwable th = null;
            int i3 = 0;
            while (i3 < i2) {
                boolean z3 = i3 >= 2;
                try {
                    android.content.Context applicationContext = context.getApplicationContext();
                    if (z3) {
                        applicationContext = android.ext.Config.a(applicationContext);
                    }
                    android.app.NotificationManager notificationManager = (android.app.NotificationManager) applicationContext.getSystemService("notification");
                    if ((z2 || !android.ext.v.f1280d) && (android.ext.Config.B & 256) == 0) {
                        if (i3 == 0) {
                            android.ext.e1.d("cancel notification");
                            if (android.ext.v.f1277a != null) {
                                android.ext.v.f1277a.stopForeground(true);
                            }
                        }
                        if (notificationManager != null) {
                            notificationManager.cancel(1);
                            notificationManager.cancelAll();
                            return;
                        }
                    } else {
                        if (i3 == 0) {
                            android.ext.e1.d("add notification");
                        }
                        if (notificationManager != null) {
                            android.app.Notification notificationF = F(i3 % 2 == 0, z3);
                            notificationManager.notify(1, notificationF);
                            if (android.ext.v.f1277a != null) {
                                android.ext.v.f1277a.startForeground(1, notificationF);
                                android.ext.e1.d("startForeground 2." + i3);
                                return;
                            }
                            return;
                        }
                    }
                    android.ext.e1.d("Failed get NotificationManager " + i3);
                } catch (java.lang.Throwable th2) {
                    if (th != null) {
                        th2.addSuppressed(th);
                    }
                    if (i3 == i2 - 1) {
                        android.ext.e1.s("Failed startForeground " + i3, th2);
                        android.ext.n0.h(java.lang.Thread.currentThread(), th2, false);
                    }
                    th = th2;
                }
                i3++;
            }
        } catch (java.lang.Throwable th3) {
            android.ext.e1.a(th3);
        }
    }

    void n(byte b2) {
        o(b2, false);
    }

    public void n0(android.ext.Script script) {
        android.ext.n2.i(new android.ext.MainService.b());
    }

    void n1() {
        this.Q.setImageResource(!this.R ? catch_.me_.if_.you_.can_.R.drawable.ic_pause_white_18dp : catch_.me_.if_.you_.can_.R.drawable.ic_play_arrow_white_18dp);
    }

    void o(byte b2, boolean z2) {
        p(b2, z2, true);
    }

    public void o0(byte b2, long j2, long j3, int i2) {
        this.p0 = j2;
        if (i2 == 0) {
            s();
            S0 = true;
            if (b2 == 0) {
                if (android.ext.b0.k() || android.ext.Config.k == 0 || j2 <= android.ext.b0.i()) {
                    D0(true);
                } else {
                    t();
                    android.ext.Tools.J1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.search_helper) + ' ' + android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.found_count), java.lang.Long.valueOf(j2)));
                    K0 = android.ext.Config.k == 2;
                }
            }
        }
        if (this.p0 == 0) {
            p((byte) 0, false, false);
        }
    }

    public void o1(boolean z2) {
        if (z2) {
            Q();
        }
        double dE = this.k0.e();
        T0((byte) 0, dE);
        android.ext.c2 c2Var = instance.f216f;
        if (c2Var != null) {
            c2Var.write("gg.setSpeed(");
            c2Var.write(java.lang.Double.toString(dE));
            c2Var.write(")\n");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.app.AlertDialog.Builder message;
        java.lang.String strF;
        android.content.DialogInterface.OnClickListener qVar;
        if (view == this.p || view == this.q || view == this.s) {
            r(true);
            return;
        }
        if (view == this.P) {
            E0();
            return;
        }
        if (view != this.o) {
            if (view == this.Q) {
                C0(true);
                return;
            }
            if (view == this.g0) {
                android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_ranges).b();
                return;
            }
            if (view != null) {
                java.lang.String string = "?";
                switch (view.getTag() instanceof java.lang.Integer ? ((java.lang.Integer) view.getTag()).intValue() : view.getId()) {
                    case catch_.me_.if_.you_.can_.R.drawable.ic_ui_button_24dp /* 2130968657 */:
                        this.f215e = true;
                        return;
                    case catch_.me_.if_.you_.can_.R.id.abort_button /* 2131034112 */:
                        this.i.h();
                        s();
                        return;
                    case catch_.me_.if_.you_.can_.R.id.hot_frame /* 2131034287 */:
                        c0();
                        return;
                    case catch_.me_.if_.you_.can_.R.id.more_btn /* 2131034336 */:
                        android.ext.Tools.s(this.J);
                        return;
                    case catch_.me_.if_.you_.can_.R.string.hide /* 2131296674 */:
                        break;
                    case catch_.me_.if_.you_.can_.R.string.interrupt /* 2131296711 */:
                        android.ext.Script script = this.f212b;
                        if (script != null) {
                            java.lang.Object obj = script.U;
                            if (obj != null) {
                                string = obj.toString();
                                if (string.length() > 250) {
                                    string = string.substring(0, 250) + "...";
                                }
                            }
                        } else {
                            string = "??";
                        }
                        message = android.ext.f.b().setCustomTitle(android.ext.Tools.h0(android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.script))).setMessage(string);
                        strF = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.interrupt);
                        qVar = new android.ext.MainService.q();
                        break;
                    case catch_.me_.if_.you_.can_.R.string.record /* 2131296884 */:
                        android.ext.c2 c2Var = this.f216f;
                        message = android.ext.f.b().setCustomTitle(android.ext.Tools.h0(android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.record_script))).setMessage(c2Var != null ? c2Var.c() : "?");
                        strF = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.stop);
                        qVar = new android.ext.MainService.r();
                        break;
                    default:
                        return;
                }
                android.ext.f.o(message.setPositiveButton(strF, qVar).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.no), (android.content.DialogInterface.OnClickListener) null));
                return;
            }
            return;
        }
        t();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        this.h.a(false, new android.ext.MainService.s());
        o1(false);
        this.j.x();
        return true;
    }

    void p(byte b2, boolean z2, boolean z3) {
        if (z2) {
            this.r0 = true;
        }
        this.p0 = 0L;
        if (z3) {
            this.i.l(b2);
        }
        instance.i.f793b.r();
        d.a aVar = this.s0;
        synchronized (aVar) {
            aVar.d();
            aVar.k();
        }
        V(this.G.getAdapter());
        b1();
        K0 = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0113 A[PHI: r9
      0x0113: PHI (r9v16 int) = (r9v2 int), (r9v5 int), (r9v17 int) binds: [B:63:0x019c, B:57:0x0189, B:40:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public void p0(byte b2, int i2, int[] iArr) {
        android.content.SharedPreferences.Editor editorPutBoolean;
        int i3;
        int i4;
        int i5;
        java.lang.String strF;
        int i6;
        android.app.AlertDialog.Builder negativeButton;
        int i7;
        switch (i2) {
            case 0:
                editorPutBoolean = android.ext.Tools.M0().edit().putBoolean("mem-fail", true);
                editorPutBoolean.commit();
                break;
            case 1:
                editorPutBoolean = android.ext.Tools.M0().edit().remove("mem-fail");
                editorPutBoolean.commit();
                break;
            case 3:
                s();
                if (b2 == 0) {
                    i3 = catch_.me_.if_.you_.can_.R.string.dump_ended;
                    android.ext.Tools.I1(i3, 0);
                }
                X(b2, null);
                break;
            case 4:
                s();
                i4 = catch_.me_.if_.you_.can_.R.string.dump_failed;
                if (b2 == 0) {
                    android.ext.Tools.H1(i4);
                }
                X(b2, android.ext.b2.f(i4));
                break;
            case 5:
                if (b2 == 0) {
                    i3 = catch_.me_.if_.you_.can_.R.string.copy_ended;
                    android.ext.Tools.I1(i3, 0);
                }
                X(b2, null);
                break;
            case 6:
                i4 = catch_.me_.if_.you_.can_.R.string.copy_failed;
                if (b2 == 0) {
                    android.ext.Tools.H1(i4);
                }
                X(b2, android.ext.b2.f(i4));
                break;
            case 8:
                this.S = true;
                break;
            case 9:
                this.S = false;
                break;
            case 10:
                if (b2 == 0) {
                    i5 = catch_.me_.if_.you_.can_.R.string.speedhack_loading;
                    android.ext.Tools.I1(i5, 0);
                }
                break;
            case 11:
                if (b2 == 0) {
                    strF = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.speedhack_loaded);
                    if (this.D0) {
                        strF = strF + "\n" + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.speedhack_no_x86);
                    }
                    i6 = this.D0;
                    android.ext.Tools.K1(strF, i6);
                }
                this.D0 = false;
                break;
            case 12:
                if (b2 == 0) {
                    i5 = catch_.me_.if_.you_.can_.R.string.patch_loading;
                    android.ext.Tools.I1(i5, 0);
                }
                break;
            case 13:
                if (b2 == 0) {
                    android.ext.Tools.H1(catch_.me_.if_.you_.can_.R.string.patch_loaded);
                    android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.disable_protection)).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.must_restart_if)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null));
                }
                X(b2, null);
                break;
            case 14:
                i4 = catch_.me_.if_.you_.can_.R.string.patch_failed;
                if (b2 == 0) {
                    android.ext.Tools.H1(i4);
                }
                X(b2, android.ext.b2.f(i4));
                break;
            case 15:
                if (b2 == 0) {
                    i5 = catch_.me_.if_.you_.can_.R.string.unrandomizer_loading;
                    android.ext.Tools.I1(i5, 0);
                }
                break;
            case 16:
                if (b2 == 0) {
                    strF = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.unrandomizer_loaded);
                    if (this.D0) {
                        strF = strF + "\n" + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.speedhack_no_x86);
                    }
                    i6 = this.D0;
                    android.ext.Tools.K1(strF, i6);
                }
                this.D0 = false;
                break;
            case 17:
                if (b2 == 0) {
                    negativeButton = android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.waitpid_mode)).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.help_waitpid)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.alternative), new android.ext.MainService.w()).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.skip), (android.content.DialogInterface.OnClickListener) null);
                    android.ext.f.o(negativeButton);
                }
                break;
            case 18:
                X(b2, null);
                break;
            case 19:
                S(iArr);
                break;
            case 20:
                android.app.AlertDialog.Builder builderB = android.ext.f.b();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ptrace_fail));
                sb.append("\n\n");
                sb.append(android.ext.b2.f(iArr[0] != 0 ? catch_.me_.if_.you_.can_.R.string.ptrace_fail_partially : catch_.me_.if_.you_.can_.R.string.ptrace_fail_full));
                sb.append("\n\n");
                sb.append(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ptrace_fail_solve));
                negativeButton = builderB.setMessage(sb.toString()).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null);
                android.ext.f.o(negativeButton);
                break;
            case 21:
                if (iArr[1] != 0) {
                    i7 = catch_.me_.if_.you_.can_.R.string.feature_hide_4;
                } else if (iArr[2] != 0) {
                    i7 = catch_.me_.if_.you_.can_.R.string.feature_firmware;
                } else {
                    if (this.C0 && (android.ext.Config.A & 131072) != 0) {
                        this.C0 = false;
                        android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_ptrace_bypass_mode).b();
                    }
                    i7 = catch_.me_.if_.you_.can_.R.string.feature_protection;
                }
                android.ext.Tools.K1(android.ext.b2.f(i7), 1);
                break;
            case 22:
                this.D0 = true;
                break;
        }
    }

    void p1() {
        if (android.ext.n2.e()) {
            e();
        } else {
            android.ext.n2.i(new android.ext.MainService.u());
        }
    }

    void q(boolean z2) {
        o((byte) 0, z2);
    }

    public void q0() {
        p1();
    }

    public void q1() {
        if (!I0) {
            return;
        }
        int iH = H() - 1;
        int iD1 = android.ext.Tools.d1();
        boolean z2 = (android.ext.Config.p & (1 << ((iH * 2) + iD1))) != 0;
        int i2 = android.ext.Config.r;
        if (iH >= 0) {
            int[] iArr = this.z0;
            if (iArr[iH] != i2) {
                iArr[iH] = i2;
                this.m.getCurrentView().setBackgroundColor((i2 & (1 << iH)) == 0 ? 0 : -16777216);
            }
        }
        this.J.setVisibility((z2 || iD1 != 0) ? 8 : 0);
        this.K.setVisibility(iD1 == 1 ? iH >= 0 ? 0 : 4 : 8);
        this.F.setVisibility(iD1 == 0 ? 0 : 8);
        this.E.setVisibility((iH < 0 || !z2) ? 8 : 0);
        int i3 = 0;
        while (true) {
            android.fix.WrapLayout[] wrapLayoutArr = this.D;
            if (i3 >= wrapLayoutArr.length) {
                return;
            }
            android.fix.WrapLayout wrapLayout = wrapLayoutArr[i3];
            wrapLayout.setFill(android.ext.Config.f34g - 1);
            wrapLayout.setVisibility(i3 == iH ? 0 : 8);
            long j2 = android.ext.Config.f29b[(i3 * 2) + iD1];
            for (int i4 = 0; i4 < wrapLayout.getChildCount(); i4++) {
                try {
                    android.view.View childAt = wrapLayout.getChildAt(i4);
                    if (childAt != null) {
                        childAt.setVisibility(((1 << i4) & j2) != 0 ? 0 : 8);
                    }
                } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                } catch (java.lang.Throwable th) {
                    android.ext.e1.a(th);
                }
            }
            i3++;
        }
    }

    void r(boolean z2) {
        this.h.b(z2);
    }

    public void r0() {
        P();
        if (this.F0) {
            return;
        }
        this.F0 = true;
        android.ext.z1.d dVar = this.v0;
        java.lang.String str = dVar == null ? null : dVar.f1434c;
        boolean z2 = dVar == null ? false : dVar.n;
        r(false);
        J0();
        s();
        s0(str, z2);
    }

    void s() {
        this.j.t((byte) 2, -1L, 1L, 0, 1, "");
        this.i0.a(true);
        this.i.m();
        this.i.L();
        this.U = false;
    }

    void s0(java.lang.String str, boolean z2) {
        android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.game_dead)).setItems(new java.lang.String[]{android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.exit), android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.restart_game), android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.restart_game_without_protection), android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.help_games_protection_title), android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok)}, new android.ext.MainService.c0(str, z2)).setCancelable(false));
    }

    void t() {
        u(true);
    }

    void u(boolean z2) {
        java.lang.StringBuilder sb;
        java.lang.String strF;
        android.ext.e1.d("ServiceProxy dismissDialog: " + this.n);
        if (this.n == null) {
            return;
        }
        this.i0.a(false);
        this.n.dismiss();
        this.n = null;
        this.h0.a(z2);
        this.j.m();
        this.T = this.R;
        boolean z3 = this.S;
        boolean z4 = (android.ext.Config.A & 128) != 0;
        if (this.i0.b() && (z4 || z3)) {
            java.lang.String string = android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.paused) + ":\n";
            if (z4) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(string);
                sb2.append("- ");
                sb2.append(android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.by_option), android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.hide_from_game) + ": 1"));
                sb2.append(";\n");
                string = sb2.toString();
            }
            if (z3) {
                if ((android.ext.Config.B & 4) != 0) {
                    sb = new java.lang.StringBuilder();
                    sb.append(string);
                    sb.append("- ");
                    strF = android.ext.Tools.L1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.by_option), android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.autopause) + ": " + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.yes));
                } else {
                    sb = new java.lang.StringBuilder();
                    sb.append(string);
                    sb.append("- ");
                    strF = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.by_pause_button);
                }
                sb.append(strF);
                sb.append(";\n");
                string = sb.toString();
            }
            java.lang.String strTrim = string.trim();
            if (this.U) {
                android.ext.Tools.J1(strTrim);
            } else {
                this.U = true;
                android.ext.f.m(android.ext.f.c(android.ext.r.p).setMessage(strTrim).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null).create());
            }
        }
        z0();
        this.i.L();
        l1();
    }

    public void u0() {
        android.ext.e1.d("<<");
        this.k0.l();
        o1(true);
    }

    int v() {
        try {
            android.content.pm.ApplicationInfo applicationInfoY = android.ext.Tools.Y(this.v0.f1434c);
            boolean z2 = true;
            if (applicationInfoY == null) {
                return 1;
            }
            java.lang.String str = applicationInfoY.nativeLibraryDir;
            if (str == null) {
                return 2;
            }
            byte[] bArr = new byte[20];
            java.io.File[] fileArrListFiles = new java.io.File(str).listFiles();
            if (fileArrListFiles != null) {
                boolean z3 = false;
                for (java.io.File file : fileArrListFiles) {
                    if (z3) {
                        break;
                    }
                    if (file != null && file.getName().startsWith("lib") && file.getName().endsWith(".so")) {
                        try {
                            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
                            if (fileInputStream.read(bArr) > 13 && bArr[0] == 127 && bArr[1] == 69 && bArr[2] == 76 && bArr[3] == 70 && bArr[18] == 40) {
                                try {
                                    android.ext.e1.d("doCheckLibs: " + file + " is ARM lib");
                                    z3 = true;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    z3 = true;
                                    android.ext.e1.l("Failed check lib " + file, th);
                                }
                            }
                            fileInputStream.close();
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                        }
                    }
                }
                if (z3) {
                    java.lang.String str2 = applicationInfoY.sourceDir;
                    if (str2 == null) {
                        return 4;
                    }
                    java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(str2);
                    java.util.Enumeration<? extends java.util.zip.ZipEntry> enumerationEntries = zipFile.entries();
                    while (true) {
                        if (!enumerationEntries.hasMoreElements()) {
                            z2 = false;
                            break;
                        }
                        java.util.zip.ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement.getName().contains("lib/x86/lib")) {
                            android.ext.e1.d("doCheckLibs: " + zipEntryNextElement.getName() + " is x86 lib");
                            break;
                        }
                    }
                    zipFile.close();
                    if (!z2) {
                        return 5;
                    }
                    android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.h0(android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.check_libs))).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.arm_libs)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.fix_it), !android.ext.Config.C ? new android.ext.MainService.g0(str2) : new android.ext.r.n("kwws=22jdphjxdugldq1qhw2iruxp2jdoohu|2lpdjh278:0krz0wr0uhsodfh0dup0oleudulhv0zlwk0{;90oleudulhv0{0soruh2")).setNeutralButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.skip), new android.ext.MainService.f0()).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null));
                    return 6;
                }
            }
            return 3;
        } catch (java.lang.Throwable th3) {
            android.ext.e1.l("Failed check libs for " + this.v0, th3);
            return 0;
        }
    }

    boolean v0() {
        boolean zW0 = w0((byte) 0);
        android.ext.c2 c2Var = instance.f216f;
        if (c2Var != null) {
            c2Var.write("gg.processKill()\n");
        }
        return zW0;
    }

    public void w(int i2) {
        android.ext.f0 f0Var = this.i;
        if (f0Var == null || i2 < 80) {
            return;
        }
        f0Var.z();
    }

    boolean w0(byte b2) {
        android.ext.z1.d dVar = this.v0;
        if (dVar == null) {
            android.ext.Tools.J1(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.no_application));
            return false;
        }
        android.ext.e1.d("Kill game");
        this.i.C0(b2, dVar.f1437f, dVar.f1434c, dVar.f1435d);
        this.i.L0(b2, (byte) 2);
        return true;
    }

    public void x(java.lang.String str, int i2, java.lang.String str2) {
        P();
        android.ext.Script script = new android.ext.Script(new java.io.File(str), i2, str2);
        this.f212b = script;
        script.R3();
    }

    boolean x0(byte b2, boolean z2) {
        if ((!z2 && this.n == null) || this.R) {
            return false;
        }
        Q();
        this.i.L0(b2, (byte) 0);
        this.R = true;
        n1();
        return true;
    }

    void y(boolean z2) {
        if (this.n != null) {
            return;
        }
        if (z2) {
            this.h0.k();
        } else {
            this.h0.a(true);
        }
    }

    boolean y0(boolean z2) {
        boolean zX0 = x0((byte) 0, z2);
        android.ext.c2 c2Var = instance.f216f;
        if (c2Var != null) {
            c2Var.write("gg.processPause()\n");
        }
        return zX0;
    }

    java.lang.Object z() {
        android.ext.n1 n1Var;
        android.view.View view = this.f0;
        if (view == this.Z) {
            return this.s0;
        }
        if (view == this.a0) {
            android.ext.SavedListAdapter savedListAdapter = this.t0;
            if (savedListAdapter != null) {
                return savedListAdapter.f();
            }
        } else if (view == this.b0 && (n1Var = this.N) != null) {
            return n1Var.f();
        }
        return null;
    }

    boolean z0() {
        boolean zA0 = A0((byte) 0);
        android.ext.c2 c2Var = instance.f216f;
        if (c2Var != null) {
            c2Var.write("gg.processResume()\n");
        }
        return zA0;
    }
}
