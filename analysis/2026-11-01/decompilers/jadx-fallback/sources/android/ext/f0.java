package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
class f0 {
    private static boolean A = false;
    static volatile java.lang.String B = null;
    private static volatile java.lang.String C = null;
    public static volatile boolean v = false;
    public static volatile boolean w = false;
    public static volatile boolean x = false;
    static android.ext.f0.n0 y;
    private static final java.util.List z = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.ext.f0.n0 f792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final android.ext.InOut f793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    java.util.concurrent.Exchanger f794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile int f796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile int f797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile java.lang.String f798g;
    private volatile int h;
    private volatile int i;
    private volatile long j;
    private volatile long k;
    private volatile long l;
    java.lang.Thread m;
    private volatile int n;
    private volatile int o;
    private volatile long p;
    private final java.util.ArrayList q;
    private final java.util.ArrayList r;
    private final java.util.ArrayList s;
    long t;
    private java.lang.Integer u;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f802d;

        a(android.ext.f0 r1, byte r2, int r3, long r4) {
                r0 = this;
                r0.f802d = r1
                r0.f799a = r2
                r0.f800b = r3
                r0.f801c = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.f0 r0 = r4.f802d
                android.ext.InOut r0 = r0.f793b
                byte r1 = r4.f799a
                r2 = 32
                r3 = 0
                r0.q(r1, r2, r3)
                int r1 = r4.f800b
                r0.u(r1)
                long r1 = r4.f801c
                r0.v(r1)
                android.ext.f0 r0 = r4.f802d
                r0.t0()
                return
        }
    }

    class a0 extends android.ext.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f803a;

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.f0.a0 f804a;

            /* JADX INFO: renamed from: android.ext.f0$a0$a$a, reason: collision with other inner class name */
            class DialogInterfaceOnClickListenerC0016a implements android.content.DialogInterface.OnClickListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ android.ext.f0.a0.a f805a;

                DialogInterfaceOnClickListenerC0016a(android.ext.f0.a0.a r1) {
                        r0 = this;
                        r0.f805a = r1
                        r0.<init>()
                        return
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface r1, int r2) {
                        r0 = this;
                        boolean r1 = android.ext.Config.vSpaceReal
                        if (r1 == 0) goto L19
                        boolean r1 = android.ext.Config.C
                        if (r1 != 0) goto L19
                        int r1 = android.ext.Config.B
                        r1 = r1 & 512(0x200, float:7.17E-43)
                        if (r1 == 0) goto L19
                        r1 = 2131034214(0x7f050066, float:1.767894E38)
                        android.ext.Config$p r1 = android.ext.Config.b(r1)
                        r1.b()
                        goto L1f
                    L19:
                        r1 = 2131297105(0x7f090351, float:1.8212146E38)
                        android.ext.ConfigListAdapter.t(r1)
                    L1f:
                        return
                }
            }

            a(android.ext.f0.a0 r1) {
                    r0 = this;
                    r0.f804a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
                    r0.<init>()     // Catch: java.lang.Throwable -> L5c
                    r1 = 2131296720(0x7f0901d0, float:1.8211365E38)
                    java.lang.String r1 = android.ext.b2.f(r1)     // Catch: java.lang.Throwable -> L5c
                    r0.append(r1)     // Catch: java.lang.Throwable -> L5c
                    java.lang.String r1 = "\n\n"
                    r0.append(r1)     // Catch: java.lang.Throwable -> L5c
                    r1 = 2131296787(0x7f090213, float:1.82115E38)
                    java.lang.String r1 = android.ext.b2.f(r1)     // Catch: java.lang.Throwable -> L5c
                    r0.append(r1)     // Catch: java.lang.Throwable -> L5c
                    java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5c
                    android.app.AlertDialog$Builder r1 = android.ext.f.b()     // Catch: java.lang.Throwable -> L5c
                    r2 = 2131296439(0x7f0900b7, float:1.8210795E38)
                    android.view.View r2 = android.ext.Tools.g0(r2)     // Catch: java.lang.Throwable -> L5c
                    android.app.AlertDialog$Builder r1 = r1.setCustomTitle(r2)     // Catch: java.lang.Throwable -> L5c
                    android.app.AlertDialog$Builder r0 = r1.setMessage(r0)     // Catch: java.lang.Throwable -> L5c
                    r1 = 2131296455(0x7f0900c7, float:1.8210827E38)
                    java.lang.String r1 = android.ext.b2.f(r1)     // Catch: java.lang.Throwable -> L5c
                    android.ext.f0$a0$a$a r2 = new android.ext.f0$a0$a$a     // Catch: java.lang.Throwable -> L5c
                    r2.<init>(r3)     // Catch: java.lang.Throwable -> L5c
                    android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)     // Catch: java.lang.Throwable -> L5c
                    r1 = 2131296836(0x7f090244, float:1.82116E38)
                    java.lang.String r1 = android.ext.b2.f(r1)     // Catch: java.lang.Throwable -> L5c
                    r2 = 0
                    android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)     // Catch: java.lang.Throwable -> L5c
                    android.app.AlertDialog r0 = r0.create()     // Catch: java.lang.Throwable -> L5c
                    android.ext.f.m(r0)     // Catch: java.lang.Throwable -> L5c
                    android.ext.Tools.u1(r0)     // Catch: java.lang.Throwable -> L5c
                    goto L60
                L5c:
                    r0 = move-exception
                    android.ext.e1.a(r0)
                L60:
                    return
            }
        }

        a0(android.ext.f0 r1, java.lang.String r2) {
                r0 = this;
                r0.f803a = r1
                r0.<init>(r2)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r16 = this;
                r1 = r16
                java.lang.String r2 = "start daemon failed"
                java.lang.String r0 = " "
                java.lang.String r3 = ""
                java.lang.String r4 = "Failed get ABI"
                java.lang.String r5 = "armeabi"
                java.lang.String r6 = "; "
                android.ext.f0 r7 = r1.f803a
                android.ext.InOut r7 = r7.f793b
                r8 = 0
                r9 = 1
                java.lang.String r10 = android.ext.e0.h()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                android.ext.f0 r11 = r1.f803a     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                android.ext.f0$n0 r10 = r11.O0(r10)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r11.f792a = r10     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                android.ext.e2.f745a = r3     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                java.io.InputStream r11 = r10.f918c     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                java.io.OutputStream r12 = r10.f917b     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r7.o(r11, r12)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r7.n(r9)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                android.ext.MainService r11 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r11.q0()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                java.lang.Process r11 = r10.f916a     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                java.io.InputStream r10 = r10.f919d     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                android.ext.e1.o(r11, r10)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                byte[] r10 = r7.k()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r11 = 4
                if (r10 != 0) goto L4c
                java.lang.String r0 = "DI: null"
            L41:
                android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                goto Lb8
            L46:
                r0 = move-exception
                goto L11e
            L49:
                r0 = move-exception
                goto L133
            L4c:
                int r12 = r10.length     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r13 = 7
                java.lang.String r14 = "DI: "
                if (r12 == r13) goto L63
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r0.<init>()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r0.append(r14)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                int r10 = r10.length     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r0.append(r10)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                goto L41
            L63:
                android.ext.w r12 = new android.ext.w     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r12.<init>(r10)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                byte r10 = r12.e()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r13 = 8
                if (r10 != r13) goto L72
                r13 = 1
                goto L73
            L72:
                r13 = 0
            L73:
                android.ext.InOut.p(r13)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                byte r13 = r12.e()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                if (r13 == r11) goto L90
                java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r15.<init>()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                java.lang.String r9 = "DI: QE "
                r15.append(r9)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r15.append(r13)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                java.lang.String r9 = r15.toString()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                android.ext.e1.i(r9)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
            L90:
                android.ext.f0 r9 = r1.f803a     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                int r12 = r12.f()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r9.f796e = r12     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r9.<init>()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r9.append(r14)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r9.append(r10)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r9.append(r0)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r9.append(r13)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r9.append(r0)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                android.ext.f0 r0 = r1.f803a     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                int r0 = r0.f796e     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r9.append(r0)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                goto L41
            Lb8:
                byte[] r0 = r7.k()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                android.ext.w r9 = new android.ext.w     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r9.<init>(r0)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r9.e()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                byte r0 = r9.e()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r9.c(r0)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                android.ext.f0 r9 = r1.f803a     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                java.lang.String r10 = new java.lang.String     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r10.<init>(r0)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r9.f798g = r10     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r0.<init>()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                java.lang.String r9 = "InOut: x64: "
                r0.append(r9)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                boolean r9 = android.ext.InOut.m     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r0.append(r9)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                java.lang.String r9 = "; QE_ALIGN: "
                r0.append(r9)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r0.append(r11)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r0.append(r6)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                android.ext.f0 r9 = r1.f803a     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                int r9 = r9.f796e     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r0.append(r9)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r0.append(r6)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                android.ext.f0 r9 = r1.f803a     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                java.lang.String r9 = r9.f798g     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r0.append(r9)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                android.ext.f0 r0 = r1.f803a     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                java.lang.Thread r0 = r0.m     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r0.start()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r0.q0()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r7.m()     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                android.ext.f0 r0 = r1.f803a     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                r0.v0(r8)     // Catch: java.lang.Throwable -> L46 android.ext.f0.l0 -> L49
                goto L281
            L11e:
                android.ext.e1.l(r2, r0)
                android.ext.f0$a0$a r0 = new android.ext.f0$a0$a
                r0.<init>(r1)
                android.ext.n2.i(r0)
            L129:
                r7.n(r8)
                android.ext.MainService r0 = android.ext.MainService.instance
                r0.q0()
                goto L281
            L133:
                android.ext.e1.l(r2, r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r3)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = android.os.Build.CPU_ABI     // Catch: java.lang.Throwable -> L16c
                r3.append(r0)     // Catch: java.lang.Throwable -> L16c
                r3.append(r6)     // Catch: java.lang.Throwable -> L16c
                boolean r9 = r5.equals(r0)     // Catch: java.lang.Throwable -> L16c
                java.lang.String r0 = android.os.Build.CPU_ABI2     // Catch: java.lang.Throwable -> L16a
                r3.append(r0)     // Catch: java.lang.Throwable -> L16a
                r3.append(r6)     // Catch: java.lang.Throwable -> L16a
                boolean r0 = r5.equals(r0)     // Catch: java.lang.Throwable -> L16a
                if (r0 == 0) goto L171
                r9 = 1
                goto L171
            L16a:
                r0 = move-exception
                goto L16e
            L16c:
                r0 = move-exception
                r9 = 0
            L16e:
                android.ext.e1.s(r4, r0)
            L171:
                java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS     // Catch: java.lang.Throwable -> L189
                int r10 = r0.length     // Catch: java.lang.Throwable -> L189
                r11 = 0
            L175:
                if (r11 >= r10) goto L18d
                r12 = r0[r11]     // Catch: java.lang.Throwable -> L189
                r3.append(r12)     // Catch: java.lang.Throwable -> L189
                r3.append(r6)     // Catch: java.lang.Throwable -> L189
                boolean r12 = r5.equals(r12)     // Catch: java.lang.Throwable -> L189
                if (r12 == 0) goto L186
                r9 = 1
            L186:
                int r11 = r11 + 1
                goto L175
            L189:
                r0 = move-exception
                android.ext.e1.s(r4, r0)
            L18d:
                java.lang.String[] r0 = android.os.Build.SUPPORTED_32_BIT_ABIS     // Catch: java.lang.Throwable -> L1a5
                int r10 = r0.length     // Catch: java.lang.Throwable -> L1a5
                r11 = 0
            L191:
                if (r11 >= r10) goto L1a9
                r12 = r0[r11]     // Catch: java.lang.Throwable -> L1a5
                r3.append(r12)     // Catch: java.lang.Throwable -> L1a5
                r3.append(r6)     // Catch: java.lang.Throwable -> L1a5
                boolean r12 = r5.equals(r12)     // Catch: java.lang.Throwable -> L1a5
                if (r12 == 0) goto L1a2
                r9 = 1
            L1a2:
                int r11 = r11 + 1
                goto L191
            L1a5:
                r0 = move-exception
                android.ext.e1.s(r4, r0)
            L1a9:
                java.lang.String[] r0 = android.os.Build.SUPPORTED_64_BIT_ABIS     // Catch: java.lang.Throwable -> L1c1
                int r10 = r0.length     // Catch: java.lang.Throwable -> L1c1
                r11 = 0
            L1ad:
                if (r11 >= r10) goto L1c5
                r12 = r0[r11]     // Catch: java.lang.Throwable -> L1c1
                r3.append(r12)     // Catch: java.lang.Throwable -> L1c1
                r3.append(r6)     // Catch: java.lang.Throwable -> L1c1
                boolean r12 = r5.equals(r12)     // Catch: java.lang.Throwable -> L1c1
                if (r12 == 0) goto L1be
                r9 = 1
            L1be:
                int r11 = r11 + 1
                goto L1ad
            L1c1:
                r0 = move-exception
                android.ext.e1.s(r4, r0)
            L1c5:
                java.lang.String r0 = "\n\n"
                if (r9 == 0) goto L1f6
                java.lang.String r4 = "ydwa"
                java.lang.String r5 = "raw"
                int r4 = android.ext.b2.d(r4, r5)
                if (r4 != 0) goto L1f6
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                r4.append(r0)
                r2 = 2131297020(0x7f0902fc, float:1.8211973E38)
                java.lang.String r2 = android.ext.Tools.N1(r2)
                r4.append(r2)
                java.lang.String r2 = ": "
                r4.append(r2)
                float r2 = android.ext.i.f999a
                r4.append(r2)
                java.lang.String r2 = r4.toString()
            L1f6:
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "mips"
                boolean r4 = r3.contains(r4)
                if (r4 == 0) goto L21b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                r4.append(r0)
                r0 = 2131296776(0x7f090208, float:1.8211478E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                r4.append(r0)
                java.lang.String r2 = r4.toString()
            L21b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r2 = "\n\nABIs: "
                r0.append(r2)
                r0.append(r3)
                r2 = 10
                r0.append(r2)
                java.lang.StringBuilder r4 = android.ext.e0.f730g
                r0.append(r4)
                r0.append(r2)
                int r4 = android.os.Build.VERSION.SDK_INT
                r0.append(r4)
                r0.append(r2)
                java.lang.StringBuilder r2 = android.ext.e0.h
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Supported ABIs: "
                r2.append(r4)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.ext.e1.d(r2)
                android.app.AlertDialog$Builder r2 = android.ext.f.b()
                r3 = 2131296439(0x7f0900b7, float:1.8210795E38)
                android.view.View r3 = android.ext.Tools.g0(r3)
                android.app.AlertDialog$Builder r2 = r2.setCustomTitle(r3)
                android.app.AlertDialog$Builder r0 = r2.setMessage(r0)
                r2 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r2 = android.ext.b2.f(r2)
                r3 = 0
                android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r3)
                android.ext.f.o(r0)
                goto L129
            L281:
                android.ext.f0.r()
                return
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte f808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f809d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f810e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f811f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ java.lang.String f812g;
        final /* synthetic */ android.ext.f0 h;

        b(android.ext.f0 r1, byte[] r2, byte[] r3, byte r4, long r5, long r7, int r9, java.lang.String r10) {
                r0 = this;
                r0.h = r1
                r0.f806a = r2
                r0.f807b = r3
                r0.f808c = r4
                r0.f809d = r5
                r0.f810e = r7
                r0.f811f = r9
                r0.f812g = r10
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                android.ext.f0 r0 = r6.h
                android.ext.InOut r0 = r0.f793b
                byte[] r1 = r6.f806a
                int r1 = r1.length
                byte[] r2 = r6.f807b
                int r2 = r2.length
                byte r3 = r6.f808c
                r4 = 61
                r5 = 0
                r0.q(r3, r4, r5)
                long r3 = r6.f809d
                r0.v(r3)
                long r3 = r6.f810e
                r0.v(r3)
                int r3 = r6.f811f
                r0.u(r3)
                r0.u(r1)
                byte[] r3 = r6.f806a
                r0.t(r3, r1)
                r0.u(r2)
                byte[] r1 = r6.f807b
                r0.t(r1, r2)
                android.ext.f0 r0 = r6.h
                r0.t0()
                android.ext.MainService r0 = android.ext.MainService.instance
                r1 = 4
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r3 = 2131296392(0x7f090088, float:1.82107E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                r2[r5] = r3
                long r3 = r6.f809d
                java.lang.String r3 = android.ext.c.G(r3, r1)
                r4 = 1
                r2[r4] = r3
                long r3 = r6.f810e
                java.lang.String r1 = android.ext.c.G(r3, r1)
                r3 = 2
                r2[r3] = r1
                r1 = 3
                java.lang.String r3 = r6.f812g
                r2[r1] = r3
                java.lang.String r1 = "%s: %s - %s > %s"
                java.lang.String r1 = android.ext.Tools.L1(r1, r2)
                r0.h0(r1)
                return
        }
    }

    class b0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f814b;

        b0(android.ext.f0 r1, byte r2) {
                r0 = this;
                r0.f814b = r1
                r0.f813a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.f0 r0 = r4.f814b
                android.ext.InOut r1 = r0.f793b
                byte r2 = r4.f813a
                r3 = 1
                r0.L0(r2, r3)
                android.ext.f0 r0 = r4.f814b
                byte r2 = r4.f813a
                r3 = 45
                r0.u0(r2, r3)
                r0 = 0
                r1.n(r0)
                android.ext.MainService r0 = android.ext.MainService.instance
                r0.q0()
                return
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f819e;

        c(android.ext.f0 r1, byte r2, long r3, long r5, int r7) {
                r0 = this;
                r0.f819e = r1
                r0.f815a = r2
                r0.f816b = r3
                r0.f817c = r5
                r0.f818d = r7
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.f0 r0 = r4.f819e
                android.ext.InOut r0 = r0.f793b
                byte r1 = r4.f815a
                r2 = 62
                r3 = 0
                r0.q(r1, r2, r3)
                long r1 = r4.f816b
                r0.v(r1)
                long r1 = r4.f817c
                r0.v(r1)
                int r1 = r4.f818d
                r0.u(r1)
                android.ext.f0 r0 = r4.f819e
                r0.t0()
                return
        }
    }

    class c0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f820a;

        c0(android.ext.f0 r1) {
                r0 = this;
                r0.f820a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.ext.MainService r0 = android.ext.MainService.instance
                android.ext.MainService r1 = android.ext.MainService.instance
                android.widget.ListView r1 = r1.Y
                r0.W(r1)
                return
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean[] f823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ double f826f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ double f827g;
        final /* synthetic */ android.ext.f0 h;

        d(android.ext.f0 r1, byte r2, int r3, boolean[] r4, long r5, long r7, double r9, double r11) {
                r0 = this;
                r0.h = r1
                r0.f821a = r2
                r0.f822b = r3
                r0.f823c = r4
                r0.f824d = r5
                r0.f825e = r7
                r0.f826f = r9
                r0.f827g = r11
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.f0 r0 = r4.h
                android.ext.InOut r0 = r0.f793b
                byte r1 = r4.f821a
                r2 = 35
                r3 = 0
                r0.q(r1, r2, r3)
                int r1 = r4.f822b
                r1 = r1 | 17
                r0.u(r1)
                android.ext.f0 r1 = r4.h
                boolean[] r2 = r4.f823c
                r1.W0(r2)
                long r1 = r4.f824d
                r0.w(r1)
                long r1 = r4.f825e
                r0.w(r1)
                double r1 = r4.f826f
                long r1 = java.lang.Double.doubleToRawLongBits(r1)
                r0.w(r1)
                double r1 = r4.f827g
                long r1 = java.lang.Double.doubleToRawLongBits(r1)
                r0.w(r1)
                android.ext.f0 r0 = r4.h
                r0.t0()
                return
        }
    }

    class d0 extends android.ext.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f828a;

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ byte[] f829a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.f0.d0 f830b;

            a(android.ext.f0.d0 r1, byte[] r2) {
                    r0 = this;
                    r0.f830b = r1
                    r0.f829a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    android.ext.f0$d0 r0 = r4.f830b     // Catch: java.io.IOException -> La
                    android.ext.f0 r0 = r0.f828a     // Catch: java.io.IOException -> La
                    byte[] r1 = r4.f829a     // Catch: java.io.IOException -> La
                    r0.h0(r1)     // Catch: java.io.IOException -> La
                    goto L2f
                La:
                    r0 = move-exception
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Failed process message: "
                    r1.append(r2)
                    byte[] r2 = r4.f829a
                    r3 = 0
                    r2 = r2[r3]
                    r1.append(r2)
                    r2 = 32
                    r1.append(r2)
                    byte[] r2 = r4.f829a
                    int r2 = r2.length
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    android.ext.e1.l(r1, r0)
                L2f:
                    return
            }
        }

        class b implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.f0.d0 f831a;

            b(android.ext.f0.d0 r1) {
                    r0 = this;
                    r0.f831a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    android.ext.f0$d0 r0 = r1.f831a
                    android.ext.f0 r0 = r0.f828a
                    r0.g0()
                    return
            }
        }

        d0(android.ext.f0 r1, java.lang.String r2) {
                r0 = this;
                r0.f828a = r1
                r0.<init>(r2)
                return
        }

        private void a(byte[] r5) {
                r4 = this;
                android.ext.f0 r0 = r4.f828a     // Catch: java.lang.Throwable -> L12
                java.util.concurrent.Exchanger r0 = r0.f794c     // Catch: java.lang.Throwable -> L12
            L4:
                boolean r1 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L12
                if (r1 != 0) goto L18
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L4 java.lang.Throwable -> L12
                r2 = 500(0x1f4, double:2.47E-321)
                r0.exchange(r5, r2, r1)     // Catch: java.lang.InterruptedException -> L4 java.lang.Throwable -> L12
                return
            L12:
                r5 = move-exception
                java.lang.String r0 = "handleMemoryItem failed"
                android.ext.e1.l(r0, r5)
            L18:
                return
        }

        private void b(byte[] r3) {
                r2 = this;
                r0 = 0
                r0 = r3[r0]
                r1 = 20
                if (r0 != r1) goto L10
                r0 = 1
                r0 = r3[r0]
                if (r0 != 0) goto L10
                r2.a(r3)
                return
            L10:
                android.os.Handler r0 = android.ext.n2.d()
                android.ext.f0$d0$a r1 = new android.ext.f0$d0$a
                r1.<init>(r2, r3)
                r0.post(r1)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r3 = this;
                android.ext.f0 r0 = r3.f828a
                android.ext.InOut r0 = r0.f793b
            L4:
                boolean r1 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L18
                if (r1 != 0) goto L30
                byte[] r1 = r0.k()     // Catch: java.lang.Throwable -> L18
                r2 = 0
                android.ext.f0.B = r2     // Catch: java.lang.Throwable -> L18
                if (r1 != 0) goto L14
                goto L4
            L14:
                r3.b(r1)     // Catch: java.lang.Throwable -> L18
                goto L4
            L18:
                r0 = move-exception
                java.lang.String r1 = "Read error"
                android.ext.e1.l(r1, r0)
                java.lang.String r0 = r0.toString()
                android.ext.f0.B = r0
                android.os.Handler r0 = android.ext.n2.d()
                android.ext.f0$d0$b r1 = new android.ext.f0$d0$b
                r1.<init>(r3)
                r0.post(r1)
            L30:
                return
        }
    }

    class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean[] f833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f834c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f835d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f836e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f837f;

        e(android.ext.f0 r1, byte r2, boolean[] r3, int r4, int r5, long r6) {
                r0 = this;
                r0.f837f = r1
                r0.f832a = r2
                r0.f833b = r3
                r0.f834c = r4
                r0.f835d = r5
                r0.f836e = r6
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.f0 r0 = r4.f837f
                android.ext.InOut r0 = r0.f793b
                byte r1 = r4.f832a
                r2 = 35
                r3 = 0
                r0.q(r1, r2, r3)
                r1 = 16
                r0.u(r1)
                android.ext.f0 r1 = r4.f837f
                boolean[] r2 = r4.f833b
                r1.W0(r2)
                int r1 = r4.f834c
                r0.u(r1)
                int r1 = r4.f835d
                r0.u(r1)
                long r1 = r4.f836e
                r0.w(r1)
                android.ext.f0 r0 = r4.f837f
                r0.t0()
                return
        }
    }

    class e0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f841d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f842e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f843f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f844g;
        final /* synthetic */ int h;
        final /* synthetic */ long i;
        final /* synthetic */ int j;
        final /* synthetic */ int k;
        final /* synthetic */ int l;
        final /* synthetic */ double m;
        final /* synthetic */ int n;
        final /* synthetic */ android.ext.f0 o;

        e0(android.ext.f0 r4, byte r5, int r6, int r7, int r8, long r9, long r11, long r13, int r15, long r16, int r18, int r19, int r20, double r21, int r23) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.o = r1
                r1 = r5
                r0.f838a = r1
                r1 = r6
                r0.f839b = r1
                r1 = r7
                r0.f840c = r1
                r1 = r8
                r0.f841d = r1
                r1 = r9
                r0.f842e = r1
                r1 = r11
                r0.f843f = r1
                r1 = r13
                r0.f844g = r1
                r1 = r15
                r0.h = r1
                r1 = r16
                r0.i = r1
                r1 = r18
                r0.j = r1
                r1 = r19
                r0.k = r1
                r1 = r20
                r0.l = r1
                r1 = r21
                r0.m = r1
                r1 = r23
                r0.n = r1
                r3.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.f0 r0 = r4.o
                android.ext.InOut r0 = r0.f793b
                byte r1 = r4.f838a
                r2 = 39
                r3 = 0
                r0.q(r1, r2, r3)
                int r1 = r4.f839b
                r0.u(r1)
                int r1 = r4.f840c
                r0.u(r1)
                int r1 = r4.f841d
                r0.u(r1)
                long r1 = r4.f842e
                r0.w(r1)
                long r1 = r4.f843f
                r0.w(r1)
                long r1 = r4.f844g
                r0.w(r1)
                int r1 = r4.h
                r0.u(r1)
                long r1 = r4.i
                r0.w(r1)
                int r1 = r4.j
                r0.u(r1)
                int r1 = r4.k
                r0.u(r1)
                int r1 = r4.l
                r0.u(r1)
                double r1 = r4.m
                long r1 = java.lang.Double.doubleToRawLongBits(r1)
                r0.w(r1)
                int r1 = r4.n
                r0.u(r1)
                android.ext.f0 r0 = r4.o
                r0.t0()
                return
        }
    }

    class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean[] f847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f848d;

        f(android.ext.f0 r1, byte r2, int r3, boolean[] r4) {
                r0 = this;
                r0.f848d = r1
                r0.f845a = r2
                r0.f846b = r3
                r0.f847c = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.f0 r0 = r4.f848d
                android.ext.InOut r0 = r0.f793b
                byte r1 = r4.f845a
                r2 = 35
                r3 = 0
                r0.q(r1, r2, r3)
                int r1 = r4.f846b
                r1 = r1 | 32
                r0.u(r1)
                android.ext.f0 r0 = r4.f848d
                boolean[] r1 = r4.f847c
                r0.W0(r1)
                android.ext.f0 r0 = r4.f848d
                r0.t0()
                return
        }
    }

    /* JADX INFO: renamed from: android.ext.f0$f0, reason: collision with other inner class name */
    class RunnableC0017f0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long[] f851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f852d;

        RunnableC0017f0(android.ext.f0 r1, int[] r2, byte r3, long[] r4) {
                r0 = this;
                r0.f852d = r1
                r0.f849a = r2
                r0.f850b = r3
                r0.f851c = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                android.ext.f0 r0 = r8.f852d
                android.ext.InOut r0 = r0.f793b
                int[] r1 = r8.f849a
                int r1 = r1.length
                r2 = 0
                r3 = 0
            L9:
                if (r3 >= r1) goto L46
                int r4 = r1 - r3
                r5 = 100000000(0x5f5e100, float:2.3122341E-35)
                if (r4 <= r5) goto L15
                r4 = 100000000(0x5f5e100, float:2.3122341E-35)
            L15:
                byte r5 = r8.f850b
                int r6 = android.ext.InOut.n
                int r6 = r6 + 4
                int r6 = r6 * r4
                r7 = 36
                r0.q(r5, r7, r6)
                r0.u(r4)
                int r4 = r4 + r3
            L26:
                if (r3 >= r4) goto L3c
                int[] r5 = r8.f849a
                r5 = r5[r3]
                if (r5 != 0) goto L2f
                goto L39
            L2f:
                r0.u(r5)
                long[] r5 = r8.f851c
                r6 = r5[r3]
                r0.v(r6)
            L39:
                int r3 = r3 + 1
                goto L26
            L3c:
                r0.u(r2)
                android.ext.f0 r3 = r8.f852d
                r3.t0()
                r3 = r4
                goto L9
            L46:
                return
        }
    }

    class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean[] f855c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f856d;

        g(android.ext.f0 r1, byte r2, int r3, boolean[] r4) {
                r0 = this;
                r0.f856d = r1
                r0.f853a = r2
                r0.f854b = r3
                r0.f855c = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.f0 r0 = r4.f856d
                android.ext.InOut r0 = r0.f793b
                byte r1 = r4.f853a
                r2 = 35
                r3 = 0
                r0.q(r1, r2, r3)
                int r1 = r4.f854b
                r1 = r1 | 8
                r0.u(r1)
                android.ext.f0 r0 = r4.f856d
                boolean[] r1 = r4.f855c
                r0.W0(r1)
                android.ext.f0 r0 = r4.f856d
                r0.t0()
                return
        }
    }

    class g0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f860d;

        g0(android.ext.f0 r1, byte r2, long r3, int r5) {
                r0 = this;
                r0.f860d = r1
                r0.f857a = r2
                r0.f858b = r3
                r0.f859c = r5
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.f0 r0 = r4.f860d
                android.ext.InOut r0 = r0.f793b
                byte r1 = r4.f857a
                r2 = 50
                r3 = 0
                r0.q(r1, r2, r3)
                long r1 = r4.f858b
                r0.v(r1)
                int r1 = r4.f859c
                r0.u(r1)
                r0.s(r3)
                android.ext.f0 r0 = r4.f860d
                r0.t0()
                return
        }
    }

    class h implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f864d;

        h(android.ext.f0 r1, byte r2, long r3, int r5) {
                r0 = this;
                r0.f864d = r1
                r0.f861a = r2
                r0.f862b = r3
                r0.f863c = r5
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.f0 r0 = r4.f864d
                android.ext.InOut r1 = r0.f793b
                byte r2 = r4.f861a
                r3 = 58
                r0.u0(r2, r3)
                byte r0 = r4.f861a
                r2 = 59
                r3 = 0
                r1.q(r0, r2, r3)
                long r2 = r4.f862b
                r1.v(r2)
                int r0 = r4.f863c
                r1.u(r0)
                android.ext.f0 r0 = r4.f864d
                r0.t0()
                return
        }
    }

    class h0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String f866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte f867c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f868d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f869e;

        h0(android.ext.f0 r1, java.lang.String r2, java.lang.String r3, byte r4, int r5) {
                r0 = this;
                r0.f869e = r1
                r0.f865a = r2
                r0.f866b = r3
                r0.f867c = r4
                r0.f868d = r5
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                android.ext.f0 r0 = r8.f869e
                android.ext.InOut r0 = r0.f793b
                java.lang.String r1 = r8.f865a
                byte[] r1 = r1.getBytes()
                int r2 = r1.length
                r3 = 255(0xff, float:3.57E-43)
                if (r2 <= r3) goto L11
                r2 = 255(0xff, float:3.57E-43)
            L11:
                java.lang.String r4 = r8.f866b
                if (r4 != 0) goto L18
                byte[] r4 = d.b.f1511c
                goto L1c
            L18:
                byte[] r4 = r4.getBytes()
            L1c:
                int r5 = r4.length
                if (r5 <= r3) goto L20
                goto L21
            L20:
                r3 = r5
            L21:
                byte r5 = r8.f867c
                r6 = 37
                r7 = 0
                r0.q(r5, r6, r7)
                int r5 = r8.f868d
                r0.u(r5)
                byte r5 = (byte) r2
                r0.s(r5)
                r0.t(r1, r2)
                byte r1 = (byte) r3
                r0.s(r1)
                r0.t(r4, r3)
                android.ext.f0 r0 = r8.f869e
                r0.t0()
                return
        }
    }

    class i implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f875f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f876g;
        final /* synthetic */ long[] h;
        final /* synthetic */ long[] i;
        final /* synthetic */ android.ext.f0 j;

        i(android.ext.f0 r1, int[] r2, byte r3, int r4, int r5, long r6, long r8, long r10, long[] r12, long[] r13) {
                r0 = this;
                r0.j = r1
                r0.f870a = r2
                r0.f871b = r3
                r0.f872c = r4
                r0.f873d = r5
                r0.f874e = r6
                r0.f875f = r8
                r0.f876g = r10
                r0.h = r12
                r0.i = r13
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r12 = this;
                android.ext.f0 r0 = r12.j
                android.ext.InOut r0 = r0.f793b
                int[] r1 = r12.f870a
                int r1 = r1.length
                android.ext.y r2 = new android.ext.y
                r2.<init>()
                r3 = 2131297050(0x7f09031a, float:1.8212034E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                r2.a(r3)
                java.lang.String r3 = " = "
                r2.a(r3)
                byte r3 = r12.f871b
                r4 = 55
                r5 = 0
                r0.q(r3, r4, r5)
                int r3 = r12.f872c
                r0.u(r3)
                int r3 = r12.f873d
                r0.u(r3)
                long r3 = r12.f874e
                r0.v(r3)
                long r3 = r12.f875f
                r0.v(r3)
                long r3 = r12.f876g
                r0.v(r3)
                r0.u(r1)
                r3 = 0
            L40:
                if (r3 >= r1) goto Lf5
                long[] r4 = r12.h
                r6 = r4[r3]
                int[] r8 = r12.f870a
                r8 = r8[r3]
                long r6 = android.ext.c.h(r6, r8)
                r4[r3] = r6
                long[] r4 = r12.i
                r6 = r4[r3]
                int[] r8 = r12.f870a
                r8 = r8[r3]
                long r6 = android.ext.c.h(r6, r8)
                r4[r3] = r6
                int[] r4 = r12.f870a
                r4 = r4[r3]
                r0.u(r4)
                long[] r4 = r12.h
                r6 = r4[r3]
                r0.w(r6)
                long[] r4 = r12.i
                r6 = r4[r3]
                r0.w(r6)
                long[] r4 = r12.h
                r6 = r4[r3]
                int[] r4 = r12.f870a
                r4 = r4[r3]
                r8 = 0
                java.lang.String r4 = android.ext.c.K(r8, r6, r4)
                int[] r6 = r12.f870a
                r6 = r6[r3]
                r7 = 805306368(0x30000000, float:4.656613E-10)
                r6 = r6 & r7
                if (r6 == 0) goto Laa
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r4)
                r4 = 126(0x7e, float:1.77E-43)
                r6.append(r4)
                long[] r4 = r12.i
                r10 = r4[r3]
                int[] r4 = r12.f870a
                r4 = r4[r3]
                java.lang.String r4 = android.ext.c.K(r8, r10, r4)
                r6.append(r4)
                java.lang.String r4 = r6.toString()
            Laa:
                int[] r6 = r12.f870a
                r6 = r6[r3]
                r7 = 268435456(0x10000000, float:2.524355E-29)
                r6 = r6 & r7
                if (r6 == 0) goto Lc4
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "≠ "
                r6.append(r7)
                r6.append(r4)
                java.lang.String r4 = r6.toString()
            Lc4:
                if (r3 == 0) goto Lcb
                java.lang.String r6 = "; "
                r2.a(r6)
            Lcb:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r4)
                int[] r4 = r12.f870a
                r4 = r4[r3]
                java.lang.CharSequence r4 = android.ext.c.A(r4)
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                int[] r6 = r12.f870a
                r6 = r6[r3]
                int r6 = android.ext.c.n(r6)
                java.lang.CharSequence r4 = android.ext.Tools.t(r4, r6)
                r2.a(r4)
                int r3 = r3 + 1
                goto L40
            Lf5:
                android.ext.f0 r0 = r12.j
                r0.t0()
                java.lang.String r0 = " :"
                r2.a(r0)
                int r0 = r12.f872c
                r1 = 4194304(0x400000, float:5.877472E-39)
                r0 = r0 & r1
                if (r0 == 0) goto L10b
                java.lang.String r0 = ":"
                r2.a(r0)
            L10b:
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r1 = r12.f873d
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r5] = r1
                java.lang.String r1 = "%,d"
                java.lang.String r0 = android.ext.Tools.L1(r1, r0)
                r2.a(r0)
                android.ext.MainService r0 = android.ext.MainService.instance
                java.lang.CharSequence r1 = r2.d()
                r0.h0(r1)
                android.ext.f0.w = r5
                return
        }
    }

    class i0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f879c;

        i0(android.ext.f0 r1, byte[] r2, byte r3) {
                r0 = this;
                r0.f879c = r1
                r0.f877a = r2
                r0.f878b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                android.ext.f0 r0 = r5.f879c
                android.ext.InOut r0 = r0.f793b
                byte[] r1 = r5.f877a
                int r1 = r1.length
                byte r2 = r5.f878b
                int r3 = r1 + 4
                r4 = 48
                r0.q(r2, r4, r3)
                r0.u(r1)
                byte[] r2 = r5.f877a
                r0.t(r2, r1)
                android.ext.f0 r0 = r5.f879c
                r0.t0()
                return
        }
    }

    class j implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f882c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f883d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f884e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f885f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f886g;
        final /* synthetic */ android.ext.f0 h;

        j(android.ext.f0 r1, byte r2, long r3, long r5, int r7, long r8, long r10, long r12) {
                r0 = this;
                r0.h = r1
                r0.f880a = r2
                r0.f881b = r3
                r0.f882c = r5
                r0.f883d = r7
                r0.f884e = r8
                r0.f885f = r10
                r0.f886g = r12
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.f0 r0 = r4.h
                android.ext.InOut r0 = r0.f793b
                byte r1 = r4.f880a
                r2 = 63
                r3 = 0
                r0.q(r1, r2, r3)
                long r1 = r4.f881b
                r0.v(r1)
                long r1 = r4.f882c
                r0.v(r1)
                int r1 = r4.f883d
                r0.u(r1)
                long r1 = r4.f884e
                r0.v(r1)
                long r1 = r4.f885f
                r0.v(r1)
                long r1 = r4.f886g
                r0.v(r1)
                android.ext.f0 r0 = r4.h
                r0.t0()
                android.ext.f0.w = r3
                return
        }
    }

    static class j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long[] f887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int[] f888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f889c;

        public j0(long[] r1, int[] r2) {
                r0 = this;
                r0.<init>()
                r0.f887a = r1
                r0.f888b = r2
                return
        }
    }

    class k implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f890a;

        k(android.ext.f0 r1) {
                r0 = this;
                r0.f890a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.ext.ConfigListAdapter.b()
                return
        }
    }

    private static class k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.ext.c f891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f892b;

        public k0(android.ext.c r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f891a = r1
                r0.f892b = r2
                return
        }
    }

    class l implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ short f894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f898f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f899g;

        l(android.ext.f0 r1, byte r2, short r3, int r4, long r5, long r7, long r9) {
                r0 = this;
                r0.f899g = r1
                r0.f893a = r2
                r0.f894b = r3
                r0.f895c = r4
                r0.f896d = r5
                r0.f897e = r7
                r0.f898f = r9
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.f0 r0 = r4.f899g
                android.ext.InOut r0 = r0.f793b
                byte r1 = r4.f893a
                r2 = 64
                r3 = 0
                r0.q(r1, r2, r3)
                short r1 = r4.f894b
                r0.u(r1)
                int r1 = r4.f895c
                r0.u(r1)
                long r1 = r4.f896d
                r0.v(r1)
                long r1 = r4.f897e
                r0.v(r1)
                long r1 = r4.f898f
                r0.v(r1)
                android.ext.f0 r0 = r4.f899g
                r0.t0()
                android.ext.f0.w = r3
                return
        }
    }

    private static class l0 extends java.lang.Exception {
        public l0(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    class m implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f902c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f903d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f904e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ byte[] f905f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f906g;

        m(android.ext.f0 r1, byte r2, int r3, long r4, long r6, long r8, byte[] r10) {
                r0 = this;
                r0.f906g = r1
                r0.f900a = r2
                r0.f901b = r3
                r0.f902c = r4
                r0.f903d = r6
                r0.f904e = r8
                r0.f905f = r10
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.f0 r0 = r4.f906g
                android.ext.InOut r0 = r0.f793b
                byte r1 = r4.f900a
                r2 = 34
                r3 = 0
                r0.q(r1, r2, r3)
                int r1 = r4.f901b
                r0.u(r1)
                long r1 = r4.f902c
                r0.v(r1)
                long r1 = r4.f903d
                r0.v(r1)
                long r1 = r4.f904e
                r0.v(r1)
                byte[] r1 = r4.f905f
                int r1 = r1.length
                r0.u(r1)
                byte[] r1 = r4.f905f
                int r2 = r1.length
                r0.t(r1, r2)
                android.ext.f0 r0 = r4.f906g
                r0.t0()
                android.ext.f0.w = r3
                return
        }
    }

    static class m0 implements java.lang.Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f908b;

        public m0(long r1, int r3) {
                r0 = this;
                r0.<init>()
                r0.f907a = r1
                r0.f908b = r3
                return
        }

        public int a(android.ext.f0.m0 r5) {
                r4 = this;
                long r0 = r4.f907a
                long r2 = r5.f907a
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 >= 0) goto La
                r5 = -1
                goto Lf
            La:
                if (r5 != 0) goto Le
                r5 = 0
                goto Lf
            Le:
                r5 = 1
            Lf:
                return r5
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                android.ext.f0$m0 r1 = (android.ext.f0.m0) r1
                int r1 = r0.a(r1)
                return r1
        }
    }

    class n implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f912d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f913e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f914f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f915g;
        final /* synthetic */ long h;
        final /* synthetic */ android.ext.f0 i;

        n(android.ext.f0 r1, byte r2, long r3, long r5, int r7, int r8, long r9, long r11, long r13) {
                r0 = this;
                r0.i = r1
                r0.f909a = r2
                r0.f910b = r3
                r0.f911c = r5
                r0.f912d = r7
                r0.f913e = r8
                r0.f914f = r9
                r0.f915g = r11
                r0.h = r13
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.f0 r0 = r4.i
                android.ext.InOut r0 = r0.f793b
                byte r1 = r4.f909a
                r2 = 38
                r3 = 0
                r0.q(r1, r2, r3)
                long r1 = r4.f910b
                r0.w(r1)
                long r1 = r4.f911c
                r0.w(r1)
                int r1 = r4.f912d
                r0.u(r1)
                int r1 = r4.f913e
                r0.u(r1)
                long r1 = r4.f914f
                r0.v(r1)
                long r1 = r4.f915g
                r0.v(r1)
                long r1 = r4.h
                r0.v(r1)
                android.ext.f0 r0 = r4.i
                r0.t0()
                int r0 = r4.f913e
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L3c
                r3 = 1
            L3c:
                android.ext.f0.w = r3
                return
        }
    }

    static final class n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.Process f916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.io.OutputStream f917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        java.io.InputStream f918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        java.io.InputStream f919d;

        n0() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    class o implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Object[] f920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f922c;

        o(android.ext.f0 r1, java.lang.Object[] r2, byte r3) {
                r0 = this;
                r0.f922c = r1
                r0.f920a = r2
                r0.f921b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r9 = this;
                android.ext.f0 r0 = r9.f922c
                android.ext.InOut r0 = r0.f793b
                java.lang.Object[] r1 = r9.f920a
                int r1 = r1.length
                r2 = 0
                r3 = 0
            L9:
                if (r3 >= r1) goto L5d
                int r4 = r1 - r3
                r5 = 100000000(0x5f5e100, float:2.3122341E-35)
                if (r4 <= r5) goto L15
                r4 = 100000000(0x5f5e100, float:2.3122341E-35)
            L15:
                byte r5 = r9.f921b
                int r6 = android.ext.InOut.n
                int r6 = r6 + 16
                int r6 = r6 * r4
                r7 = 43
                r0.q(r5, r7, r6)
                r0.u(r4)
                int r4 = r4 + r3
            L26:
                if (r3 >= r4) goto L53
                java.lang.Object[] r5 = r9.f920a
                r5 = r5[r3]
                boolean r6 = r5 instanceof android.ext.f0.k0
                if (r6 == 0) goto L37
                android.ext.f0$k0 r5 = (android.ext.f0.k0) r5
                android.ext.c r6 = r5.f891a
                int r5 = r5.f892b
                goto L3b
            L37:
                r6 = r5
                android.ext.c r6 = (android.ext.c) r6
                r5 = 0
            L3b:
                int r7 = r6.f674c
                if (r7 != 0) goto L40
                goto L50
            L40:
                r0.u(r7)
                long r7 = r6.f672a
                r0.v(r7)
                long r6 = r6.f673b
                r0.w(r6)
                r0.u(r5)
            L50:
                int r3 = r3 + 1
                goto L26
            L53:
                r0.u(r2)
                android.ext.f0 r3 = r9.f922c
                r3.t0()
                r3 = r4
                goto L9
            L5d:
                return
        }
    }

    class p implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.h2[] f923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f925c;

        p(android.ext.f0 r1, android.ext.h2[] r2, byte r3) {
                r0 = this;
                r0.f925c = r1
                r0.f923a = r2
                r0.f924b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                android.ext.f0 r0 = r8.f925c
                android.ext.InOut r0 = r0.f793b
                android.ext.h2[] r1 = r8.f923a
                int r1 = r1.length
                r2 = 0
                r3 = 0
            L9:
                if (r3 >= r1) goto L57
                int r4 = r1 - r3
                r5 = 100000000(0x5f5e100, float:2.3122341E-35)
                if (r4 <= r5) goto L15
                r4 = 100000000(0x5f5e100, float:2.3122341E-35)
            L15:
                byte r5 = r8.f924b
                int r6 = android.ext.InOut.n
                int r6 = r6 + 29
                int r6 = r6 * r4
                r7 = 40
                r0.q(r5, r7, r6)
                int r4 = r4 + r3
            L23:
                if (r3 >= r4) goto L4d
                android.ext.h2[] r5 = r8.f923a
                r5 = r5[r3]
                int r6 = r5.f674c
                if (r6 != 0) goto L2e
                goto L4a
            L2e:
                r0.u(r6)
                long r6 = r5.f672a
                r0.v(r6)
                long r6 = r5.f673b
                r0.w(r6)
                byte r6 = r5.n
                r0.s(r6)
                long r6 = r5.o
                r0.w(r6)
                long r5 = r5.p
                r0.w(r5)
            L4a:
                int r3 = r3 + 1
                goto L23
            L4d:
                r0.u(r2)
                android.ext.f0 r3 = r8.f925c
                r3.t0()
                r3 = r4
                goto L9
            L57:
                return
        }
    }

    class q implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f926a;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.f0.q f927a;

            a(android.ext.f0.q r1) {
                    r0 = this;
                    r0.f927a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r1, int r2) {
                    r0 = this;
                    r1 = 2131034167(0x7f050037, float:1.7678844E38)
                    android.ext.Config$p r1 = android.ext.Config.b(r1)
                    r2 = 0
                    r1.f42d = r2
                    android.ext.Config.k()
                    return
            }
        }

        q(android.ext.f0 r1) {
                r0 = this;
                r0.f926a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.app.AlertDialog$Builder r0 = android.ext.f.b()
                r1 = 2131296300(0x7f09002c, float:1.8210513E38)
                android.view.View r1 = android.ext.Tools.g0(r1)
                android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r1)
                r1 = 2131296488(0x7f0900e8, float:1.8210894E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
                r1 = 2131296455(0x7f0900c7, float:1.8210827E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                android.ext.f0$q$a r2 = new android.ext.f0$q$a
                r2.<init>(r3)
                android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
                r1 = 2131296963(0x7f0902c3, float:1.8211858E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                r2 = 0
                android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
                android.ext.f.o(r0)
                return
        }
    }

    class r implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.h2[] f928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f930c;

        r(android.ext.f0 r1, android.ext.h2[] r2, byte r3) {
                r0 = this;
                r0.f930c = r1
                r0.f928a = r2
                r0.f929b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                android.ext.f0 r0 = r8.f930c
                android.ext.InOut r0 = r0.f793b
                android.ext.h2[] r1 = r8.f928a
                int r1 = r1.length
                r2 = 0
                r3 = 0
            L9:
                if (r3 >= r1) goto L43
                int r4 = r1 - r3
                r5 = 100000000(0x5f5e100, float:2.3122341E-35)
                if (r4 <= r5) goto L15
                r4 = 100000000(0x5f5e100, float:2.3122341E-35)
            L15:
                byte r5 = r8.f929b
                int r6 = android.ext.InOut.n
                int r6 = r6 + 4
                int r6 = r6 * r4
                r7 = 41
                r0.q(r5, r7, r6)
                int r4 = r4 + r3
            L23:
                if (r3 >= r4) goto L39
                android.ext.h2[] r5 = r8.f928a
                r5 = r5[r3]
                int r6 = r5.f674c
                if (r6 != 0) goto L2e
                goto L36
            L2e:
                r0.u(r6)
                long r5 = r5.f672a
                r0.v(r5)
            L36:
                int r3 = r3 + 1
                goto L23
            L39:
                r0.u(r2)
                android.ext.f0 r3 = r8.f930c
                r3.t0()
                r3 = r4
                goto L9
            L43:
                return
        }
    }

    class s implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.f0.j0 f931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f933c;

        s(android.ext.f0 r1, android.ext.f0.j0 r2, byte r3) {
                r0 = this;
                r0.f933c = r1
                r0.f931a = r2
                r0.f932b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                android.ext.f0 r0 = r8.f933c
                android.ext.InOut r0 = r0.f793b
                android.ext.f0$j0 r1 = r8.f931a
                long[] r1 = r1.f887a
                int r1 = r1.length
                r2 = 0
            La:
                if (r2 >= r1) goto L43
                int r3 = r1 - r2
                r4 = 100000000(0x5f5e100, float:2.3122341E-35)
                if (r3 <= r4) goto L16
                r3 = 100000000(0x5f5e100, float:2.3122341E-35)
            L16:
                byte r4 = r8.f932b
                int r5 = android.ext.InOut.n
                int r5 = r5 + 4
                int r5 = r5 * r3
                r6 = 33
                r0.q(r4, r6, r5)
                r0.u(r3)
                android.ext.f0$j0 r4 = r8.f931a
                int[] r5 = r4.f888b
                long[] r4 = r4.f887a
                int r3 = r3 + r2
            L2d:
                if (r2 >= r3) goto L3c
                r6 = r5[r2]
                r0.u(r6)
                r6 = r4[r2]
                r0.v(r6)
                int r2 = r2 + 1
                goto L2d
            L3c:
                android.ext.f0 r2 = r8.f933c
                r2.t0()
                r2 = r3
                goto La
            L43:
                return
        }
    }

    class t implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.f0.j0 f934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f936c;

        t(android.ext.f0 r1, android.ext.f0.j0 r2, byte r3) {
                r0 = this;
                r0.f936c = r1
                r0.f934a = r2
                r0.f935b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                android.ext.f0 r0 = r8.f936c
                android.ext.InOut r0 = r0.f793b
                android.ext.f0$j0 r1 = r8.f934a
                long[] r1 = r1.f887a
                int r1 = r1.length
                r2 = 0
            La:
                if (r2 >= r1) goto L43
                int r3 = r1 - r2
                r4 = 100000000(0x5f5e100, float:2.3122341E-35)
                if (r3 <= r4) goto L16
                r3 = 100000000(0x5f5e100, float:2.3122341E-35)
            L16:
                byte r4 = r8.f935b
                int r5 = android.ext.InOut.n
                int r5 = r5 + 4
                int r5 = r5 * r3
                r6 = 52
                r0.q(r4, r6, r5)
                r0.u(r3)
                android.ext.f0$j0 r4 = r8.f934a
                int[] r5 = r4.f888b
                long[] r4 = r4.f887a
                int r3 = r3 + r2
            L2d:
                if (r2 >= r3) goto L3c
                r6 = r5[r2]
                r0.u(r6)
                r6 = r4[r2]
                r0.v(r6)
                int r2 = r2 + 1
                goto L2d
            L3c:
                android.ext.f0 r2 = r8.f936c
                r2.t0()
                r2 = r3
                goto La
            L43:
                return
        }
    }

    class u implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f939c;

        u(android.ext.f0 r1, byte r2, byte r3) {
                r0 = this;
                r0.f939c = r1
                r0.f937a = r2
                r0.f938b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.f0 r0 = r4.f939c
                android.ext.InOut r0 = r0.f793b
                byte r1 = r4.f937a
                r2 = 53
                r3 = 0
                r0.q(r1, r2, r3)
                byte r1 = r4.f938b
                r0.s(r1)
                android.ext.f0 r0 = r4.f939c
                r0.t0()
                return
        }
    }

    class v implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f940a;

        v(android.ext.f0 r1) {
                r0 = this;
                r0.f940a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.os.Handler r0 = android.ext.n2.c()
                r0.removeCallbacks(r3)
                android.ext.f0 r1 = r3.f940a
                boolean r1 = r1.e0()
                if (r1 == 0) goto L14
                r1 = 1000(0x3e8, double:4.94E-321)
                r0.postDelayed(r3, r1)
            L14:
                return
        }
    }

    class w implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.String f943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f944d;

        w(android.ext.f0 r1, byte r2, byte[] r3, java.lang.String r4) {
                r0 = this;
                r0.f944d = r1
                r0.f941a = r2
                r0.f942b = r3
                r0.f943c = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                android.ext.f0 r0 = r6.f944d
                android.ext.InOut r0 = r0.f793b
                byte r1 = r6.f941a
                r2 = 54
                r3 = 0
                r0.q(r1, r2, r3)
                int r1 = android.ext.Config.h
                r0.u(r1)
                int r1 = android.ext.Config.A
                r0.u(r1)
                long r1 = android.ext.Config.j
                r0.w(r1)
                int r1 = android.ext.Config.m
                r0.u(r1)
                int r1 = android.ext.Config.i
                r0.u(r1)
                byte[] r1 = r6.f942b
                int r1 = r1.length
                r0.u(r1)
                byte[] r1 = r6.f942b
                int r2 = r1.length
                r0.t(r1, r2)
                long r0 = r0.e()
                android.ext.f0 r2 = r6.f944d
                long r3 = r2.t
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 == 0) goto L95
                r2.t = r0
                r2.t0()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Sended config: "
                r0.append(r1)
                int r1 = android.ext.Config.h
                r0.append(r1)
                r1 = 32
                r0.append(r1)
                int r2 = android.ext.Config.A
                java.lang.String r2 = java.lang.Integer.toBinaryString(r2)
                r0.append(r2)
                r0.append(r1)
                long r2 = android.ext.Config.j
                java.lang.String r2 = java.lang.Long.toBinaryString(r2)
                r0.append(r2)
                r0.append(r1)
                int r2 = android.ext.Config.m
                r0.append(r2)
                r0.append(r1)
                int r2 = android.ext.Config.i
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = r6.f943c
                r0.append(r1)
                java.lang.String r1 = "; "
                r0.append(r1)
                byte[] r1 = r6.f942b
                int r1 = r1.length
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.ext.e1.d(r0)
            L95:
                return
        }
    }

    class x implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f946b;

        x(android.ext.f0 r1, byte r2) {
                r0 = this;
                r0.f946b = r1
                r0.f945a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.f0 r0 = r4.f946b
                android.ext.InOut r0 = r0.f793b
                byte r1 = r4.f945a
                r2 = 47
                r3 = 0
                r0.q(r1, r2, r3)
                int r1 = android.os.Process.myPid()
                r0.u(r1)
                android.ext.f0 r1 = r4.f946b
                int r1 = r1.f797f
                r0.u(r1)
                android.ext.f0 r0 = r4.f946b
                r0.t0()
                return
        }
    }

    class y implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f949c;

        y(android.ext.f0 r1, byte r2, byte r3) {
                r0 = this;
                r0.f949c = r1
                r0.f947a = r2
                r0.f948b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.f0 r0 = r4.f949c
                android.ext.InOut r0 = r0.f793b
                byte r1 = r4.f947a
                byte r2 = r4.f948b
                r3 = 0
                r0.q(r1, r2, r3)
                android.ext.f0 r0 = r4.f949c
                r0.t0()
                return
        }
    }

    class z implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.f0 f950a;

        z(android.ext.f0 r1) {
                r0 = this;
                r0.f950a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.ext.f0 r0 = r1.f950a
                r0.g0()
                return
        }
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.ext.f0.z = r0
            r0 = 1
            android.ext.f0.A = r0
            r0 = 0
            android.ext.f0.B = r0
            android.ext.f0.C = r0
            return
    }

    public f0() {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.f792a = r0
            java.util.concurrent.Exchanger r1 = new java.util.concurrent.Exchanger
            r1.<init>()
            r5.f794c = r1
            r1 = 0
            r5.f795d = r1
            r2 = -1
            r5.f796e = r2
            r5.f797f = r2
            java.lang.String r2 = "???"
            r5.f798g = r2
            r5.h = r1
            r5.i = r1
            r1 = 0
            r5.j = r1
            r3 = -1
            r5.k = r3
            r5.l = r1
            android.ext.f0$d0 r3 = new android.ext.f0$d0
            java.lang.String r4 = "mReaderThread"
            r3.<init>(r5, r4)
            r5.m = r3
            r3 = 1
            r5.n = r3
            r5.o = r3
            r5.p = r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.q = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.r = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.s = r3
            r5.t = r1
            r5.u = r0
            android.ext.InOut r0 = new android.ext.InOut
            r0.<init>()
            r5.f793b = r0
            return
    }

    private int A(byte r4) {
            r3 = this;
            java.util.ArrayList r0 = r3.s
            monitor-enter(r0)
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L22
            android.ext.h2[] r1 = new android.ext.h2[r1]     // Catch: java.lang.Throwable -> L22
            java.lang.Object[] r1 = r0.toArray(r1)     // Catch: java.lang.Throwable -> L22
            android.ext.h2[] r1 = (android.ext.h2[]) r1     // Catch: java.lang.Throwable -> L22
            r0.clear()     // Catch: java.lang.Throwable -> L22
            r0.trimToSize()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            int r0 = r1.length
            if (r0 == 0) goto L21
            android.ext.f0$r r2 = new android.ext.f0$r
            r2.<init>(r3, r1, r4)
            android.ext.n2.j(r2)
        L21:
            return r0
        L22:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r4
    }

    private boolean[] I(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L8
            android.ext.MainService r2 = android.ext.MainService.instance
            android.ext.TimersEditor r2 = r2.o0
            goto Lc
        L8:
            android.ext.MainService r2 = android.ext.MainService.instance
            android.ext.TimersEditor r2 = r2.n0
        Lc:
            boolean[] r2 = r2.b()
            return r2
    }

    private java.lang.String[] K(boolean r5, java.lang.String r6, java.io.File r7) {
            r4 = this;
            r0 = 5
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r1[r2] = r6
            r6 = 1
            java.lang.String r3 = android.ext.Tools.C0()
            r1[r6] = r3
            r6 = 2
            java.lang.String r7 = r7.getAbsolutePath()
            r1[r6] = r7
            r6 = 3
            java.lang.String r7 = T()
            r1[r6] = r7
            boolean r6 = android.ext.Config.C
            if (r6 == 0) goto L22
            java.lang.String r6 = "1"
            goto L24
        L22:
            java.lang.String r6 = "0"
        L24:
            r7 = 4
            r1[r7] = r6
            if (r5 == 0) goto L2a
            return r1
        L2a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "exec"
            r5.append(r6)
        L34:
            if (r2 >= r0) goto L43
            r6 = r1[r2]
            r7 = 32
            r5.append(r7)
            r5.append(r6)
            int r2 = r2 + 1
            goto L34
        L43:
            java.lang.String r5 = r5.toString()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            return r5
    }

    static android.ext.f0.j0 M0(java.util.List r10, boolean r11) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.size()
            r0.<init>(r1)
            int r1 = r10.size()
            r2 = 0
            r3 = 0
        Lf:
            if (r3 >= r1) goto L2d
            java.lang.Object r4 = r10.get(r3)
            android.ext.c r4 = (android.ext.c) r4
            if (r4 != 0) goto L1a
            goto L2a
        L1a:
            android.ext.f0$m0 r5 = new android.ext.f0$m0
            long r6 = r4.f672a
            long r6 = android.ext.e.a(r6, r11)
            int r4 = r4.f674c
            r5.<init>(r6, r4)
            r0.add(r5)
        L2a:
            int r3 = r3 + 1
            goto Lf
        L2d:
            int r10 = r0.size()
            android.ext.f0$m0[] r10 = new android.ext.f0.m0[r10]
            java.lang.Object[] r10 = r0.toArray(r10)
            android.ext.f0$m0[] r10 = (android.ext.f0.m0[]) r10
            java.util.Arrays.sort(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r0 = r10.length
            r11.<init>(r0)
            int r0 = r10.length
            r1 = 0
            r3 = 0
        L45:
            if (r3 >= r0) goto L66
            r4 = r10[r3]
            if (r4 != 0) goto L4c
            goto L63
        L4c:
            if (r1 == 0) goto L5f
            long r5 = r1.f907a
            long r7 = r4.f907a
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L57
            goto L5f
        L57:
            int r5 = r1.f908b
            int r4 = r4.f908b
            r4 = r4 | r5
            r1.f908b = r4
            goto L63
        L5f:
            r11.add(r4)
            r1 = r4
        L63:
            int r3 = r3 + 1
            goto L45
        L66:
            int r10 = r11.size()
            long[] r0 = new long[r10]
            int[] r1 = new int[r10]
            r3 = 0
        L6f:
            if (r2 >= r10) goto L83
            java.lang.Object r4 = r11.get(r2)
            android.ext.f0$m0 r4 = (android.ext.f0.m0) r4
            long r5 = r4.f907a
            r0[r2] = r5
            int r4 = r4.f908b
            r1[r2] = r4
            r3 = r3 | r4
            int r2 = r2 + 1
            goto L6f
        L83:
            r10 = r3 & 127(0x7f, float:1.78E-43)
            android.ext.f0$j0 r11 = new android.ext.f0$j0
            r11.<init>(r0, r1)
            r11.f889c = r10
            return r11
    }

    private void R0() {
            r1 = this;
            r0 = 0
            r1.f795d = r0
            return
    }

    public static java.lang.String S0(java.lang.String r33) {
            r1 = r33
            java.lang.String r0 = "rw"
            java.lang.String r2 = "/sbin"
            java.lang.String r3 = "\n"
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L3b4
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L3b4
            boolean r6 = r5.exists()     // Catch: java.lang.Throwable -> L3b4
            if (r6 == 0) goto L19
            boolean r6 = r5.canExecute()     // Catch: java.lang.Throwable -> L3b4
            if (r6 != 0) goto L1c
        L19:
            r1 = 0
            goto L3b9
        L1c:
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L3b4
            r7 = 5
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L3b4
            java.lang.String r9 = "/system/bin"
            r10 = 0
            r8[r10] = r9     // Catch: java.lang.Throwable -> L3b4
            java.lang.String r9 = "/system/xbin"
            r11 = 1
            r8[r11] = r9     // Catch: java.lang.Throwable -> L3b4
            java.lang.String r9 = "/sbin/.magisk/mirror/data"
            r12 = 2
            r8[r12] = r9     // Catch: java.lang.Throwable -> L3b4
            java.lang.String r9 = "/sbin/.magisk/modules"
            r13 = 3
            r8[r13] = r9     // Catch: java.lang.Throwable -> L3b4
            r9 = 4
            r8[r9] = r2     // Catch: java.lang.Throwable -> L3b4
            r14 = 0
        L3b:
            java.lang.String r15 = "exit"
            java.lang.String r13 = "; chmod 0755 "
            java.lang.String r9 = "cp -f "
            java.lang.String r11 = "; "
            java.lang.String r10 = " "
            if (r14 >= r7) goto L82
            r7 = r8[r14]     // Catch: java.lang.Throwable -> L6b
            java.io.File r12 = new java.io.File     // Catch: java.lang.Throwable -> L6b
            r12.<init>(r7, r6)     // Catch: java.lang.Throwable -> L6b
            boolean r7 = r12.exists()     // Catch: java.lang.Throwable -> L6b
            if (r7 == 0) goto L79
            boolean r7 = r12.canExecute()     // Catch: java.lang.Throwable -> L6b
            if (r7 == 0) goto L79
            long r21 = r5.length()     // Catch: java.lang.Throwable -> L6b
            long r23 = r12.length()     // Catch: java.lang.Throwable -> L6b
            int r7 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r7 != 0) goto L79
            java.lang.String r0 = r12.getAbsolutePath()     // Catch: java.lang.Throwable -> L6b
            return r0
        L6b:
            r0 = move-exception
            r22 = r2
            r4 = r3
            r23 = r5
            r5 = r13
            r3 = 0
            r19 = 0
            r2 = r1
            r1 = r15
            goto L2e9
        L79:
            int r14 = r14 + 1
            r7 = 5
            r9 = 4
            r10 = 0
            r11 = 1
            r12 = 2
            r13 = 3
            goto L3b
        L82:
            java.lang.String r7 = "exec mount"
            r12 = 10
            java.lang.String r7 = android.ext.e2.n(r7, r12)     // Catch: java.lang.Throwable -> L2de
            java.lang.String[] r7 = r7.split(r3)     // Catch: java.lang.Throwable -> L2de
            int r12 = r7.length     // Catch: java.lang.Throwable -> L2de
            r14 = 0
        L90:
            java.lang.String r4 = "/system"
            if (r14 >= r12) goto Led
            r22 = r12
            r12 = r7[r14]     // Catch: java.lang.Throwable -> L6b
            if (r12 != 0) goto L9d
            r23 = r7
            goto La7
        L9d:
            r23 = r7
            java.lang.String r7 = " /system "
            boolean r7 = r12.contains(r7)     // Catch: java.lang.Throwable -> L6b
            if (r7 != 0) goto Lae
        La7:
            int r14 = r14 + 1
            r12 = r22
            r7 = r23
            goto L90
        Lae:
            java.lang.String r7 = r12.trim()     // Catch: java.lang.Throwable -> L6b
            java.lang.String[] r7 = r7.split(r10)     // Catch: java.lang.Throwable -> L6b
            int r12 = r7.length     // Catch: java.lang.Throwable -> L6b
            r14 = 0
            r22 = 0
        Lba:
            if (r14 >= r12) goto Le8
            r23 = r7[r14]     // Catch: java.lang.Throwable -> L6b
            r24 = r7
            java.lang.String r7 = r23.trim()     // Catch: java.lang.Throwable -> L6b
            r23 = r12
            java.lang.String r12 = "on"
            boolean r12 = r12.equals(r7)     // Catch: java.lang.Throwable -> L6b
            if (r12 != 0) goto Le1
            java.lang.String r12 = "type"
            boolean r12 = r12.equals(r7)     // Catch: java.lang.Throwable -> L6b
            if (r12 != 0) goto Le1
            boolean r12 = r4.equals(r7)     // Catch: java.lang.Throwable -> L6b
            if (r12 == 0) goto Ldd
            goto Le1
        Ldd:
            if (r22 != 0) goto Le9
            r22 = r7
        Le1:
            int r14 = r14 + 1
            r12 = r23
            r7 = r24
            goto Lba
        Le8:
            r7 = 0
        Le9:
            r12 = r7
            r7 = r22
            goto Lef
        Led:
            r7 = 0
            r12 = 0
        Lef:
            if (r7 != 0) goto Lf3
            r14 = 0
            return r14
        Lf3:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2de
            r14.<init>()     // Catch: java.lang.Throwable -> L2de
            r22 = r2
            r23 = r5
            r2 = 2
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L2ce
            r19 = 0
            r5[r19] = r0     // Catch: java.lang.Throwable -> L2d7
            java.lang.String r20 = "ro"
            r18 = 1
            r5[r18] = r20     // Catch: java.lang.Throwable -> L2ce
            r24 = r3
            r3 = 0
        L10c:
            if (r3 >= r2) goto L257
            r2 = r5[r3]     // Catch: java.lang.Throwable -> L251
            r25 = r5
            r26 = r15
            r5 = 4
            java.lang.String[] r15 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L247
            java.lang.String r5 = ""
            r19 = 0
            r15[r19] = r5     // Catch: java.lang.Throwable -> L24d
            java.lang.String r5 = "/system/bin/"
            r18 = 1
            r15[r18] = r5     // Catch: java.lang.Throwable -> L247
            java.lang.String r5 = "/system/xbin/"
            r27 = r3
            r3 = 2
            r15[r3] = r5     // Catch: java.lang.Throwable -> L247
            java.lang.String r5 = "/system/sbin/"
            r16 = 3
            r15[r16] = r5     // Catch: java.lang.Throwable -> L247
            r3 = 4
            r5 = 0
        L132:
            if (r5 >= r3) goto L1ce
            r3 = r15[r5]     // Catch: java.lang.Throwable -> L1ca
            r29 = r13
            r28 = r15
            r15 = 2
            java.lang.String[] r13 = new java.lang.String[r15]     // Catch: java.lang.Throwable -> L1c6
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c6
            r15.<init>()     // Catch: java.lang.Throwable -> L1c6
            r15.append(r2)     // Catch: java.lang.Throwable -> L1c6
            java.lang.String r1 = ",remount"
            r15.append(r1)     // Catch: java.lang.Throwable -> L1c6
            java.lang.String r1 = r15.toString()     // Catch: java.lang.Throwable -> L1c6
            r19 = 0
            r13[r19] = r1     // Catch: java.lang.Throwable -> L193
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L193
            r1.<init>()     // Catch: java.lang.Throwable -> L193
            java.lang.String r15 = "remount,"
            r1.append(r15)     // Catch: java.lang.Throwable -> L193
            r1.append(r2)     // Catch: java.lang.Throwable -> L193
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L193
            r15 = 1
            r13[r15] = r1     // Catch: java.lang.Throwable -> L193
            r1 = 0
        L167:
            r15 = 2
            if (r1 >= r15) goto L1b9
            r15 = r13[r1]     // Catch: java.lang.Throwable -> L193
            r30 = r13
            r13 = 0
            java.lang.String[] r31 = new java.lang.String[]{r13, r12}     // Catch: java.lang.Throwable -> L193
            r20 = r12
            r12 = 2
            r13 = 0
        L177:
            if (r13 >= r12) goto L1b0
            r12 = r31[r13]     // Catch: java.lang.Throwable -> L193
            r14.append(r3)     // Catch: java.lang.Throwable -> L193
            r32 = r3
            java.lang.String r3 = "mount -o "
            r14.append(r3)     // Catch: java.lang.Throwable -> L193
            r14.append(r15)     // Catch: java.lang.Throwable -> L193
            if (r12 == 0) goto L19f
            java.lang.String r3 = " -t "
            r14.append(r3)     // Catch: java.lang.Throwable -> L193
            r14.append(r12)     // Catch: java.lang.Throwable -> L193
            goto L19f
        L193:
            r0 = move-exception
        L194:
            r2 = r33
            r4 = r24
            r1 = r26
            r5 = r29
        L19c:
            r3 = 0
            goto L2e9
        L19f:
            r14.append(r10)     // Catch: java.lang.Throwable -> L193
            r14.append(r7)     // Catch: java.lang.Throwable -> L193
            java.lang.String r3 = " /system; "
            r14.append(r3)     // Catch: java.lang.Throwable -> L193
            int r13 = r13 + 1
            r3 = r32
            r12 = 2
            goto L177
        L1b0:
            r32 = r3
            int r1 = r1 + 1
            r12 = r20
            r13 = r30
            goto L167
        L1b9:
            r20 = r12
            int r5 = r5 + 1
            r1 = r33
            r15 = r28
            r13 = r29
            r3 = 4
            goto L132
        L1c6:
            r0 = move-exception
        L1c7:
            r19 = 0
            goto L194
        L1ca:
            r0 = move-exception
            r29 = r13
            goto L1c7
        L1ce:
            r20 = r12
            r29 = r13
            r19 = 0
            java.lang.String r1 = "blockdev --set"
            r14.append(r1)     // Catch: java.lang.Throwable -> L232
            r14.append(r2)     // Catch: java.lang.Throwable -> L232
            r14.append(r10)     // Catch: java.lang.Throwable -> L232
            r14.append(r7)     // Catch: java.lang.Throwable -> L232
            r14.append(r11)     // Catch: java.lang.Throwable -> L232
            boolean r1 = r2.equals(r0)     // Catch: java.lang.Throwable -> L232
            if (r1 == 0) goto L236
            r1 = 0
        L1ec:
            r2 = 5
            if (r1 >= r2) goto L236
            r2 = r8[r1]     // Catch: java.lang.Throwable -> L232
            boolean r3 = r2.startsWith(r4)     // Catch: java.lang.Throwable -> L232
            if (r3 != 0) goto L1fc
            r2 = r33
            r5 = r29
            goto L222
        L1fc:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L232
            r3.<init>(r2, r6)     // Catch: java.lang.Throwable -> L232
            r14.append(r9)     // Catch: java.lang.Throwable -> L232
            r2 = r33
            r14.append(r2)     // Catch: java.lang.Throwable -> L22e
            r14.append(r10)     // Catch: java.lang.Throwable -> L22e
            java.lang.String r5 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L22e
            r14.append(r5)     // Catch: java.lang.Throwable -> L22e
            r5 = r29
            r14.append(r5)     // Catch: java.lang.Throwable -> L227
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L227
            r14.append(r3)     // Catch: java.lang.Throwable -> L227
            r14.append(r11)     // Catch: java.lang.Throwable -> L227
        L222:
            int r1 = r1 + 1
            r29 = r5
            goto L1ec
        L227:
            r0 = move-exception
        L228:
            r4 = r24
            r1 = r26
            goto L19c
        L22e:
            r0 = move-exception
        L22f:
            r5 = r29
            goto L228
        L232:
            r0 = move-exception
            r2 = r33
            goto L22f
        L236:
            r2 = r33
            r5 = r29
            int r3 = r27 + 1
            r1 = r2
            r13 = r5
            r12 = r20
            r5 = r25
            r15 = r26
            r2 = 2
            goto L10c
        L247:
            r0 = move-exception
            r2 = r1
            r5 = r13
        L24a:
            r19 = 0
            goto L228
        L24d:
            r0 = move-exception
            r2 = r1
            r5 = r13
            goto L228
        L251:
            r0 = move-exception
            r2 = r1
            r5 = r13
            r26 = r15
            goto L24a
        L257:
            r2 = r1
            r5 = r13
            r1 = r15
            r19 = 0
            r14.append(r1)     // Catch: java.lang.Throwable -> L2c9
            java.lang.String r3 = r14.toString()     // Catch: java.lang.Throwable -> L2c9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c5
            r0.<init>()     // Catch: java.lang.Throwable -> L2c5
            r0.append(r3)     // Catch: java.lang.Throwable -> L2c5
            r4 = r24
            r0.append(r4)     // Catch: java.lang.Throwable -> L2a5
            r7 = 15
            java.lang.String r12 = android.ext.e2.n(r3, r7)     // Catch: java.lang.Throwable -> L2a5
            r0.append(r12)     // Catch: java.lang.Throwable -> L2a5
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L2a5
            r0 = 0
        L27e:
            r7 = 5
            if (r0 >= r7) goto L2aa
            r7 = r8[r0]     // Catch: java.lang.Throwable -> L2a5
            java.io.File r12 = new java.io.File     // Catch: java.lang.Throwable -> L2a5
            r12.<init>(r7, r6)     // Catch: java.lang.Throwable -> L2a5
            boolean r7 = r12.exists()     // Catch: java.lang.Throwable -> L2a5
            if (r7 == 0) goto L2a7
            boolean r7 = r12.canExecute()     // Catch: java.lang.Throwable -> L2a5
            if (r7 == 0) goto L2a7
            long r13 = r23.length()     // Catch: java.lang.Throwable -> L2a5
            long r16 = r12.length()     // Catch: java.lang.Throwable -> L2a5
            int r7 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r7 != 0) goto L2a7
            java.lang.String r0 = r12.getAbsolutePath()     // Catch: java.lang.Throwable -> L2a5
            return r0
        L2a5:
            r0 = move-exception
            goto L2e9
        L2a7:
            int r0 = r0 + 1
            goto L27e
        L2aa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a5
            r0.<init>()     // Catch: java.lang.Throwable -> L2a5
            java.lang.String r7 = "Failed remount 1 "
            r0.append(r7)     // Catch: java.lang.Throwable -> L2a5
            r0.append(r2)     // Catch: java.lang.Throwable -> L2a5
            r0.append(r4)     // Catch: java.lang.Throwable -> L2a5
            r0.append(r3)     // Catch: java.lang.Throwable -> L2a5
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2a5
            android.ext.e1.i(r0)     // Catch: java.lang.Throwable -> L2a5
            goto L303
        L2c5:
            r0 = move-exception
            r4 = r24
            goto L2e9
        L2c9:
            r0 = move-exception
            r4 = r24
            goto L19c
        L2ce:
            r0 = move-exception
            r2 = r1
            r4 = r3
            r5 = r13
            r1 = r15
            r19 = 0
            goto L19c
        L2d7:
            r0 = move-exception
            r2 = r1
            r4 = r3
            r5 = r13
        L2db:
            r1 = r15
            goto L19c
        L2de:
            r0 = move-exception
            r22 = r2
            r4 = r3
            r23 = r5
            r5 = r13
            r19 = 0
            r2 = r1
            goto L2db
        L2e9:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33e
            r7.<init>()     // Catch: java.lang.Throwable -> L33e
            java.lang.String r12 = "Failed remount 2 "
            r7.append(r12)     // Catch: java.lang.Throwable -> L33e
            r7.append(r2)     // Catch: java.lang.Throwable -> L33e
            r7.append(r4)     // Catch: java.lang.Throwable -> L33e
            r7.append(r3)     // Catch: java.lang.Throwable -> L33e
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L33e
            android.ext.e1.l(r7, r0)     // Catch: java.lang.Throwable -> L33e
        L303:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33e
            r0.<init>()     // Catch: java.lang.Throwable -> L33e
            r7 = 0
        L309:
            r12 = 5
            if (r7 >= r12) goto L342
            r12 = r8[r7]     // Catch: java.lang.Throwable -> L33e
            r13 = r22
            boolean r14 = r12.startsWith(r13)     // Catch: java.lang.Throwable -> L33e
            if (r14 != 0) goto L317
            goto L339
        L317:
            java.io.File r14 = new java.io.File     // Catch: java.lang.Throwable -> L33e
            r14.<init>(r12, r6)     // Catch: java.lang.Throwable -> L33e
            r0.append(r9)     // Catch: java.lang.Throwable -> L33e
            r0.append(r2)     // Catch: java.lang.Throwable -> L33e
            r0.append(r10)     // Catch: java.lang.Throwable -> L33e
            java.lang.String r12 = r14.getAbsolutePath()     // Catch: java.lang.Throwable -> L33e
            r0.append(r12)     // Catch: java.lang.Throwable -> L33e
            r0.append(r5)     // Catch: java.lang.Throwable -> L33e
            java.lang.String r12 = r14.getAbsolutePath()     // Catch: java.lang.Throwable -> L33e
            r0.append(r12)     // Catch: java.lang.Throwable -> L33e
            r0.append(r11)     // Catch: java.lang.Throwable -> L33e
        L339:
            int r7 = r7 + 1
            r22 = r13
            goto L309
        L33e:
            r0 = move-exception
            r14 = r3
            goto L3ba
        L342:
            r13 = r22
            r0.append(r1)     // Catch: java.lang.Throwable -> L33e
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L33e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L392
            r0.<init>()     // Catch: java.lang.Throwable -> L392
            r0.append(r1)     // Catch: java.lang.Throwable -> L392
            r0.append(r4)     // Catch: java.lang.Throwable -> L392
            r3 = 15
            java.lang.String r3 = android.ext.e2.n(r1, r3)     // Catch: java.lang.Throwable -> L392
            r0.append(r3)     // Catch: java.lang.Throwable -> L392
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L392
            r3 = 5
            r10 = 0
        L365:
            if (r10 >= r3) goto L398
            r0 = r8[r10]     // Catch: java.lang.Throwable -> L392
            boolean r5 = r0.startsWith(r13)     // Catch: java.lang.Throwable -> L392
            if (r5 != 0) goto L370
            goto L395
        L370:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L392
            r5.<init>(r0, r6)     // Catch: java.lang.Throwable -> L392
            boolean r0 = r5.exists()     // Catch: java.lang.Throwable -> L392
            if (r0 == 0) goto L395
            boolean r0 = r5.canExecute()     // Catch: java.lang.Throwable -> L392
            if (r0 == 0) goto L395
            long r11 = r23.length()     // Catch: java.lang.Throwable -> L392
            long r14 = r5.length()     // Catch: java.lang.Throwable -> L392
            int r0 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r0 != 0) goto L395
            java.lang.String r0 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L392
            return r0
        L392:
            r0 = move-exception
            r14 = r1
            goto L3ba
        L395:
            int r10 = r10 + 1
            goto L365
        L398:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L392
            r0.<init>()     // Catch: java.lang.Throwable -> L392
            java.lang.String r3 = "Failed remount 3 "
            r0.append(r3)     // Catch: java.lang.Throwable -> L392
            r0.append(r2)     // Catch: java.lang.Throwable -> L392
            r0.append(r4)     // Catch: java.lang.Throwable -> L392
            r0.append(r1)     // Catch: java.lang.Throwable -> L392
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L392
            android.ext.e1.i(r0)     // Catch: java.lang.Throwable -> L392
        L3b2:
            r1 = 0
            goto L3d5
        L3b4:
            r0 = move-exception
            r2 = r1
            r4 = r3
            r14 = 0
            goto L3ba
        L3b9:
            return r1
        L3ba:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Failed remount 4 "
            r1.append(r3)
            r1.append(r2)
            r1.append(r4)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.ext.e1.l(r1, r0)
            goto L3b2
        L3d5:
            return r1
    }

    public static java.lang.String T() {
            java.lang.String r0 = android.ext.h0.c()
            java.lang.String r1 = "!"
            java.lang.String r2 = ""
            java.lang.String r3 = "S!H!A!-!3!8!4"
            java.lang.String r1 = r3.replace(r1, r2)
            java.lang.String r0 = android.ext.w0.a(r0, r1)
            return r0
    }

    private void c0() {
            r1 = this;
            android.ext.MainService r0 = android.ext.MainService.instance
            r0.Q()
            android.ext.MainService r0 = android.ext.MainService.instance
            r0.l()
            return
    }

    private static boolean j(android.ext.f0.n0 r9, java.io.File r10) {
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.Process r1 = r9.f916a
            if (r1 != 0) goto L9
            return r0
        L9:
            java.io.InputStream r1 = r9.f918c
            java.io.InputStream r2 = r9.f919d
            java.lang.String r3 = "android-daemon err"
            boolean r2 = k(r2, r3)
            r3 = 1
            if (r2 == 0) goto L20
            java.lang.String r2 = "android-daemon out"
            boolean r2 = k(r1, r2)
            if (r2 == 0) goto L20
            r2 = 1
            goto L21
        L20:
            r2 = 0
        L21:
            boolean r4 = android.ext.Config.C
            if (r4 != 0) goto L43
            if (r2 == 0) goto L43
            android.ext.g2 r4 = new android.ext.g2
            r4.<init>()
            r5 = 1182747341(0x467f4acd, float:16338.7)
            float r6 = (float) r3
            float r6 = r6 * r5
            r5 = 1127723827(0x4337b333, float:183.7)
            float r6 = r6 - r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r5
            int r5 = (int) r6
            java.lang.String r6 = "root-ok"
            android.ext.g2 r4 = r4.f(r6, r5)
            r4.commit()
        L43:
            if (r2 == 0) goto Ld0
            int r4 = r1.read()
            r5 = 48
            r6 = 49
            if (r4 == r6) goto L51
            if (r4 != r5) goto L54
        L51:
            r1.read()
        L54:
            if (r4 != r6) goto Lba
            java.io.OutputStream r1 = r9.f917b     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r4 = "IF 0"
            android.ext.e1.d(r4)     // Catch: java.lang.Throwable -> L98
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L98
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = "o"
            r5.<init>(r10, r6)     // Catch: java.lang.Throwable -> L98
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L98
            java.lang.String r5 = "IF 1"
            android.ext.e1.d(r5)     // Catch: java.lang.Throwable -> L98
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L98
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L98
            java.lang.String r7 = "e"
            r6.<init>(r10, r7)     // Catch: java.lang.Throwable -> L98
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = "IF 2"
            android.ext.e1.d(r6)     // Catch: java.lang.Throwable -> L98
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L98
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L98
            java.lang.String r8 = "i"
            r7.<init>(r10, r8)     // Catch: java.lang.Throwable -> L98
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L98
            java.lang.String r10 = "IF 3"
            android.ext.e1.d(r10)     // Catch: java.lang.Throwable -> L98
            r9.f917b = r6     // Catch: java.lang.Throwable -> L98
            r9.f918c = r4     // Catch: java.lang.Throwable -> L98
            r9.f919d = r5     // Catch: java.lang.Throwable -> L98
            r0 = 1
            goto L9e
        L98:
            r9 = move-exception
            java.lang.String r10 = "Fifo fail"
            android.ext.e1.l(r10, r9)     // Catch: java.lang.Throwable -> Lb3
        L9e:
            if (r0 == 0) goto La3
            r9 = 89
            goto La5
        La3:
            r9 = 78
        La5:
            r1.write(r9)     // Catch: java.lang.Throwable -> Lb3
            r9 = 10
            r1.write(r9)     // Catch: java.lang.Throwable -> Lb3
            r1.flush()     // Catch: java.lang.Throwable -> Lb3
            android.ext.InOut.o = r0     // Catch: java.lang.Throwable -> Lb3
            goto Ld0
        Lb3:
            r9 = move-exception
            java.lang.String r10 = "Fifo fail 2"
            android.ext.e1.l(r10, r9)
            goto Ld0
        Lba:
            if (r4 == r5) goto Ld0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Odd fifo: "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            android.ext.e1.p(r9)
        Ld0:
            return r2
    }

    private static boolean k(java.io.InputStream r11, java.lang.String r12) {
            byte[] r0 = r12.getBytes()
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r1]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Start: "
            r3.append(r4)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            android.ext.e1.d(r3)
            r3 = 0
            r4 = 0
            r5 = 0
        L1f:
            int r6 = r11.read()
            r7 = -1
            r8 = 10
            if (r6 == r7) goto L91
            byte r6 = (byte) r6
            if (r4 < r1) goto L2c
            goto L91
        L2c:
            int r7 = r4 + 1
            r2[r4] = r6
            r4 = r0[r5]
            if (r6 != r4) goto L4f
            int r5 = r5 + 1
            int r4 = r0.length
            if (r5 != r4) goto L50
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Good: "
            r11.append(r0)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.ext.e1.d(r11)
            r11 = 1
            return r11
        L4f:
            r5 = 0
        L50:
            int r4 = r11.available()
            if (r4 != 0) goto L6c
            r4 = 0
        L57:
            r6 = 30
            if (r4 >= r6) goto L6c
            r9 = 100
            java.lang.Thread.sleep(r9)     // Catch: java.lang.InterruptedException -> L61
            goto L62
        L61:
        L62:
            int r6 = r11.available()
            if (r6 == 0) goto L69
            goto L6c
        L69:
            int r4 = r4 + 1
            goto L57
        L6c:
            int r4 = r11.available()
            if (r4 != 0) goto L8f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = android.ext.e2.f745a
            r11.append(r0)
            java.lang.String r0 = "No more data: "
            r11.append(r0)
            r11.append(r7)
            r11.append(r8)
            java.lang.String r11 = r11.toString()
            android.ext.e2.f745a = r11
            r4 = r7
            goto L91
        L8f:
            r4 = r7
            goto L1f
        L91:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r2, r3, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fail: '"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = "' "
            r0.append(r12)
            r0.append(r4)
            java.lang.String r12 = " '"
            r0.append(r12)
            r0.append(r11)
            r11 = 39
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = android.ext.e2.f745a
            r12.append(r0)
            r12.append(r11)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            android.ext.e2.f745a = r12
            android.ext.e1.d(r11)
            return r3
    }

    public static void m0(java.lang.Runnable r3) {
            java.util.List r0 = android.ext.f0.z
            monitor-enter(r0)
            boolean r1 = android.ext.f0.A     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            r0.add(r3)     // Catch: java.lang.Throwable -> Lb
            goto L17
        Lb:
            r3 = move-exception
            goto L19
        Ld:
            android.ext.g0 r1 = new android.ext.g0     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = "runAfterDaemonStart"
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> Lb
            r1.start()     // Catch: java.lang.Throwable -> Lb
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r3
    }

    static void r() {
            java.util.List r0 = android.ext.f0.z
            monitor-enter(r0)
            r1 = 0
            android.ext.f0.A = r1     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L21
        La:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.Throwable -> L21
            android.ext.g0 r3 = new android.ext.g0     // Catch: java.lang.Throwable -> L21
            java.lang.String r4 = "waitForDaemonStart"
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L21
            r3.start()     // Catch: java.lang.Throwable -> L21
            goto La
        L21:
            r1 = move-exception
            goto L25
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r1
    }

    private int u(byte r4) {
            r3 = this;
            java.util.ArrayList r0 = r3.q
            monitor-enter(r0)
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L20
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L20
            java.lang.Object[] r1 = r0.toArray(r1)     // Catch: java.lang.Throwable -> L20
            r0.clear()     // Catch: java.lang.Throwable -> L20
            r0.trimToSize()     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            int r0 = r1.length
            if (r0 == 0) goto L1f
            android.ext.f0$o r2 = new android.ext.f0$o
            r2.<init>(r3, r1, r4)
            android.ext.n2.j(r2)
        L1f:
            return r0
        L20:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r4
    }

    private void v() {
            r5 = this;
            boolean r0 = r5.f795d
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r5.f796e
            if (r0 > 0) goto La
            return
        La:
            java.io.File r0 = new java.io.File
            java.io.File r1 = android.ext.Tools.q0()
            java.lang.String r2 = "stop.tmp"
            r0.<init>(r1, r2)
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L66
            r2.<init>(r0)     // Catch: java.io.IOException -> L66
            r3 = 4
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)     // Catch: java.io.IOException -> L66
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.io.IOException -> L66
            java.nio.ByteBuffer r3 = r3.order(r4)     // Catch: java.io.IOException -> L66
            int r4 = r5.f796e     // Catch: java.io.IOException -> L66
            java.nio.ByteBuffer r3 = r3.putInt(r4)     // Catch: java.io.IOException -> L66
            byte[] r3 = r3.array()     // Catch: java.io.IOException -> L66
            r2.write(r3)     // Catch: java.io.IOException -> L66
            r2.close()     // Catch: java.io.IOException -> L66
            java.io.File r2 = new java.io.File     // Catch: java.io.IOException -> L66
            java.io.File r3 = android.ext.Tools.q0()     // Catch: java.io.IOException -> L66
            java.lang.String r4 = "stop"
            r2.<init>(r3, r4)     // Catch: java.io.IOException -> L66
            boolean r2 = r0.renameTo(r2)     // Catch: java.io.IOException -> L66
            if (r2 != 0) goto L7d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L66
            r2.<init>()     // Catch: java.io.IOException -> L66
            java.lang.String r3 = "Failed rename stop file: "
            r2.append(r3)     // Catch: java.io.IOException -> L66
            r2.append(r0)     // Catch: java.io.IOException -> L66
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L66
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L66
            r3.<init>()     // Catch: java.io.IOException -> L66
            android.ext.e1.s(r2, r3)     // Catch: java.io.IOException -> L66
            r5.f795d = r1     // Catch: java.io.IOException -> L66
            r0.delete()     // Catch: java.io.IOException -> L66
            goto L7d
        L66:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed make stop file: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.ext.e1.s(r0, r2)
            r5.f795d = r1
        L7d:
            return
    }

    private int y(byte r4) {
            r3 = this;
            java.util.ArrayList r0 = r3.r
            monitor-enter(r0)
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L37
            android.ext.h2[] r1 = new android.ext.h2[r1]     // Catch: java.lang.Throwable -> L37
            java.lang.Object[] r1 = r0.toArray(r1)     // Catch: java.lang.Throwable -> L37
            android.ext.h2[] r1 = (android.ext.h2[]) r1     // Catch: java.lang.Throwable -> L37
            r0.clear()     // Catch: java.lang.Throwable -> L37
            r0.trimToSize()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            int r0 = r1.length
            if (r0 == 0) goto L36
            android.ext.f0$p r2 = new android.ext.f0$p
            r2.<init>(r3, r1, r4)
            android.ext.n2.j(r2)
            int r4 = android.ext.Config.A
            r4 = r4 & 128(0x80, float:1.8E-43)
            if (r4 == 0) goto L36
            boolean r4 = android.ext.f0.x
            if (r4 != 0) goto L36
            r4 = 1
            android.ext.f0.x = r4
            android.ext.f0$q r4 = new android.ext.f0$q
            r4.<init>(r3)
            android.ext.n2.i(r4)
        L36:
            return r0
        L37:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r4
    }

    private void y0(byte r17, long r18, long r20, int r22, int r23, long r24, long r26, long r28) {
            r16 = this;
            r8 = r23
            r0 = r18
            long r3 = android.ext.c.h(r0, r8)
            r0 = r20
            long r5 = android.ext.c.h(r0, r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sendSearchNumber: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "; "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = " x"
            r0.append(r1)
            r7 = r22
            r0.append(r7)
            java.lang.String r1 = " as "
            r0.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r23)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            java.lang.String r1 = java.lang.Long.toHexString(r24)
            r0.append(r1)
            r1 = 45
            r0.append(r1)
            java.lang.String r1 = java.lang.Long.toHexString(r26)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r1 = java.lang.Long.toString(r28)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            android.ext.f0$n r15 = new android.ext.f0$n
            r0 = r15
            r1 = r16
            r2 = r17
            r9 = r24
            r11 = r26
            r13 = r28
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r11, r13)
            android.ext.n2.j(r15)
            r0 = 0
            android.ext.i2.l = r0
            return
    }

    private void z0(byte r15, long r16, long r18, int r20, long r21, long r23, long r25) {
            r14 = this;
            r6 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r4 = r18
            r7 = r20
            r8 = r21
            r10 = r23
            r12 = r25
            r0.y0(r1, r2, r4, r6, r7, r8, r10, r12)
            return
    }

    public void A0(byte r3, java.lang.String r4) {
            r2 = this;
            byte[] r4 = r4.getBytes()
            int r0 = r4.length
            if (r0 != 0) goto L8
            return
        L8:
            int r0 = r4.length
            r1 = 4000(0xfa0, float:5.605E-42)
            if (r0 <= r1) goto L2b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "path big: "
            r3.append(r0)
            int r4 = r4.length
            r3.append(r4)
            java.lang.String r4 = " > "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            android.ext.e1.i(r3)
            return
        L2b:
            android.ext.f0$i0 r0 = new android.ext.f0$i0
            r0.<init>(r2, r4, r3)
            android.ext.n2.j(r0)
            return
    }

    public void B() {
            r1 = this;
            r0 = 0
            r1.C(r0)
            return
    }

    public void B0(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.A0(r0, r2)
            return
    }

    public void C(byte r3) {
            r2 = this;
            int r0 = r2.u(r3)
            int r1 = r2.y(r3)
            int r0 = r0 + r1
            int r3 = r2.A(r3)
            int r0 = r0 + r3
            if (r0 <= 0) goto L15
            android.ext.MainService r3 = android.ext.MainService.instance
            r3.F0()
        L15:
            return
    }

    public void C0(byte r8, int r9, java.lang.String r10, java.lang.String r11) {
            r7 = this;
            android.ext.f0$h0 r6 = new android.ext.f0$h0
            r0 = r6
            r1 = r7
            r2 = r10
            r3 = r11
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            android.ext.n2.j(r6)
            r7.x0(r8)
            return
    }

    public void D(byte r28, long r29, long r31, int r33, int r34, int r35, long r36, long r38, long r40) {
            r27 = this;
            r13 = r27
            r2 = r29
            r0 = r34
            r1 = r35
            r4 = r33 & 127(0x7f, float:1.78E-43)
            java.lang.CharSequence r5 = android.ext.c.v(r4)
            r6 = 8388608(0x800000, float:1.1754944E-38)
            r6 = r33 & r6
            if (r6 == 0) goto L16
            r6 = 1
            goto L17
        L16:
            r6 = 0
        L17:
            r9 = 0
            if (r6 != 0) goto L21
            int r11 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r11 != 0) goto L21
            r11 = 1
            goto L22
        L21:
            r11 = 0
        L22:
            java.lang.String r12 = android.ext.c.K(r9, r2, r4)
            if (r6 == 0) goto L43
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r12)
            r12 = 126(0x7e, float:1.77E-43)
            r6.append(r12)
            r14 = r31
            java.lang.String r4 = android.ext.c.K(r9, r14, r4)
            r6.append(r4)
            java.lang.String r12 = r6.toString()
            goto L45
        L43:
            r14 = r31
        L45:
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            if (r0 == r4) goto La1
            r4 = 134217728(0x8000000, float:3.85186E-34)
            if (r0 == r4) goto L93
            r4 = 268435456(0x10000000, float:2.524355E-29)
            if (r0 == r4) goto L7a
            int r4 = r13.i
            if (r4 != 0) goto L57
            r13.i = r1
        L57:
            int r1 = r1 + (-1)
            r13.h = r1
            r9 = r36
            r13.j = r9
            r7 = r38
            r13.k = r7
            r14 = r40
            r13.l = r14
            java.lang.String r6 = "N = O+D"
            if (r11 == 0) goto L73
            r16 = 2131296504(0x7f0900f8, float:1.8210927E38)
            java.lang.String r16 = android.ext.b2.f(r16)
            goto L75
        L73:
            r16 = r6
        L75:
            r1 = r16
            r16 = 1
            goto Laf
        L7a:
            r9 = r36
            r7 = r38
            r14 = r40
            java.lang.String r6 = "N ≠ O+D"
            if (r11 == 0) goto L8c
            r16 = 2131296505(0x7f0900f9, float:1.8210929E38)
        L87:
            java.lang.String r16 = android.ext.b2.f(r16)
            goto L8e
        L8c:
            r16 = r6
        L8e:
            r1 = r16
            r16 = 0
            goto Laf
        L93:
            r9 = r36
            r7 = r38
            r14 = r40
            java.lang.String r6 = "N < O+D"
            if (r11 == 0) goto L8c
            r16 = 2131296507(0x7f0900fb, float:1.8210933E38)
            goto L87
        La1:
            r9 = r36
            r7 = r38
            r14 = r40
            java.lang.String r6 = "N > O+D"
            if (r11 == 0) goto L8c
            r16 = 2131296506(0x7f0900fa, float:1.821093E38)
            goto L87
        Laf:
            java.lang.String r4 = "+D"
            if (r11 == 0) goto Ld3
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            java.lang.String r1 = " ("
            r11.append(r1)
            java.lang.String r1 = ""
            java.lang.String r1 = r6.replace(r4, r1)
            r11.append(r1)
            r6 = 41
            r11.append(r6)
            java.lang.String r1 = r11.toString()
            goto Lef
        Ld3:
            r6 = 41
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r6 = " + ("
            r11.append(r6)
            r11.append(r12)
            r6 = 41
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            java.lang.String r1 = r1.replace(r4, r6)
        Lef:
            android.ext.y r4 = new android.ext.y
            r4.<init>()
            r6 = 2
            java.lang.CharSequence[] r6 = new java.lang.CharSequence[r6]
            r11 = 0
            r6[r11] = r1
            r1 = 1
            r6[r1] = r5
            java.lang.String r1 = "%s %s"
            android.ext.y r1 = r4.b(r1, r6)
            java.lang.CharSequence r1 = r1.d()
            if (r16 == 0) goto L121
            android.ext.MainService r17 = android.ext.MainService.instance
            r19 = -1
            r21 = 1
            int r4 = r13.i
            int r5 = r13.h
            int r23 = r4 - r5
            int r4 = r13.i
            r25 = 0
            r18 = r1
            r24 = r4
            r17.i0(r18, r19, r21, r23, r24, r25)
            goto L126
        L121:
            android.ext.MainService r4 = android.ext.MainService.instance
            r4.h0(r1)
        L126:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r33 | r1
            r6 = r1 | r0
            r0 = r27
            r1 = r28
            r2 = r29
            r4 = r31
            r7 = r36
            r9 = r38
            r11 = r40
            r0.z0(r1, r2, r4, r6, r7, r9, r11)
            return
    }

    public void D0(int r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.C0(r0, r2, r3, r4)
            return
    }

    public void E(long r16, long r18, int r20, int r21, int r22, long r23, long r25, long r27) {
            r15 = this;
            r1 = 0
            r0 = r15
            r2 = r16
            r4 = r18
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r11 = r25
            r13 = r27
            r0.D(r1, r2, r4, r6, r7, r8, r9, r11, r13)
            return
    }

    public void E0(byte r3) {
            r2 = this;
            int r0 = r2.n
            int r1 = r2.o
            r2.F0(r3, r0, r1)
            return
    }

    public void F(byte r16, int r17, long r18, long r20, long r22) {
            r15 = this;
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.y r1 = new android.ext.y
            r1.<init>()
            r2 = 2
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]
            r3 = 2131296947(0x7f0902b3, float:1.8211825E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r4 = 0
            r2[r4] = r3
            r3 = r17 & 127(0x7f, float:1.78E-43)
            java.lang.CharSequence r3 = android.ext.c.v(r3)
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "%s %s"
            android.ext.y r1 = r1.b(r3, r2)
            java.lang.CharSequence r1 = r1.d()
            r0.h0(r1)
            r4 = 0
            r6 = 0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r17 | r0
            r2 = r15
            r3 = r16
            r9 = r18
            r11 = r20
            r13 = r22
            r2.z0(r3, r4, r6, r8, r9, r11, r13)
            return
    }

    public void F0(byte r10, int r11, int r12) {
            r9 = this;
            r9.c0()
            r0 = 0
            boolean[] r4 = r9.I(r0)
            long r7 = r9.p
            r9.n = r11
            r9.o = r12
            android.ext.f0$e r0 = new android.ext.f0$e
            r1 = r0
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            android.ext.n2.j(r0)
            r10 = 0
            r9.p = r10
            return
    }

    public void G() {
            r1 = this;
            r0 = 0
            r1.H(r0)
            return
    }

    public void G0(byte r3, int r4) {
            r2 = this;
            r2.c0()
            boolean[] r0 = r2.I(r4)
            android.ext.f0$f r1 = new android.ext.f0$f
            r1.<init>(r2, r3, r4, r0)
            android.ext.n2.j(r1)
            return
    }

    public void H(byte r2) {
            r1 = this;
            r0 = 57
            r1.u0(r2, r0)
            return
    }

    public void H0(int r2) {
            r1 = this;
            r0 = 0
            r1.G0(r0, r2)
            return
    }

    public void I0(byte r3, int r4) {
            r2 = this;
            r2.c0()
            boolean[] r0 = r2.I(r4)
            android.ext.f0$g r1 = new android.ext.f0$g
            r1.<init>(r2, r3, r4, r0)
            android.ext.n2.j(r1)
            return
    }

    public int J() {
            r1 = this;
            int r0 = r1.f796e
            return r0
    }

    public void J0(int r2) {
            r1 = this;
            r0 = 0
            r1.I0(r0, r2)
            return
    }

    public void K0(byte r2) {
            r1 = this;
            r0 = 0
            r1.L0(r0, r2)
            return
    }

    public void L() {
            r1 = this;
            r0 = 0
            r1.M(r0)
            return
    }

    public void L0(byte r2, byte r3) {
            r1 = this;
            android.ext.f0$u r0 = new android.ext.f0$u
            r0.<init>(r1, r2, r3)
            android.ext.n2.j(r0)
            return
    }

    public void M(byte r2) {
            r1 = this;
            r0 = 58
            r1.u0(r2, r0)
            return
    }

    public void N(byte r8, long r9, int r11) {
            r7 = this;
            android.ext.f0$h r6 = new android.ext.f0$h
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r5)
            android.ext.n2.j(r6)
            return
    }

    public void N0() {
            r2 = this;
            android.ext.f0$a0 r0 = new android.ext.f0$a0
            java.lang.String r1 = "DaemonLoader"
            r0.<init>(r2, r1)
            r0.start()
            return
    }

    public void O(long r2, int r4) {
            r1 = this;
            r0 = 0
            r1.N(r0, r2, r4)
            return
    }

    public android.ext.f0.n0 O0(java.lang.String r15) {
            r14 = this;
            java.lang.String r0 = ""
            r1 = 0
            boolean r2 = android.ext.Config.C     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.io.File r3 = android.ext.Tools.q0()     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.String[] r4 = r14.K(r2, r15, r3)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r5 = 0
            r6 = 0
            r7 = 0
        L10:
            r8 = 3
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.String r10 = "i"
            r9[r5] = r10     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.String r10 = "o"
            r11 = 1
            r9[r11] = r10     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.String r10 = "e"
            r12 = 2
            r9[r12] = r10     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r10 = 0
        L22:
            if (r10 >= r8) goto L37
            r12 = r9[r10]     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.io.File r13 = new java.io.File     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r13.<init>(r3, r12)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r13.delete()     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            int r10 = r10 + 1
            goto L22
        L31:
            r15 = move-exception
            goto L19e
        L34:
            r15 = move-exception
            goto L1bc
        L37:
            if (r2 == 0) goto L5b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r8.<init>()     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.String r9 = "try: direct"
            r8.append(r9)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            int r9 = r4.length     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r10 = 0
        L45:
            if (r10 >= r9) goto L54
            r12 = r4[r10]     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r13 = 32
            r8.append(r13)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r8.append(r12)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            int r10 = r10 + 1
            goto L45
        L54:
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            android.ext.e1.d(r8)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
        L5b:
            if (r2 == 0) goto L62
            java.lang.Process r8 = android.ext.Tools.I(r4)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            goto L68
        L62:
            r8 = r4[r5]     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.Process r8 = android.ext.e2.r(r8, r1, r11)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
        L68:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r9.<init>()     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.String r10 = "Daemon process: "
            r9.append(r10)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r9.append(r8)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.String r10 = "; pid="
            r9.append(r10)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            if (r8 != 0) goto L7f
            java.lang.String r10 = "n/a"
            goto L87
        L7f:
            int r10 = android.ext.Tools.D0(r8)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
        L87:
            r9.append(r10)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            android.ext.e1.d(r9)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            android.ext.f0$n0 r9 = new android.ext.f0$n0     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r9.<init>()     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r9.f916a = r8     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            if (r8 == 0) goto Lac
            java.io.OutputStream r10 = r8.getOutputStream()     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r9.f917b = r10     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.io.InputStream r10 = r8.getInputStream()     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r9.f918c = r10     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.io.InputStream r10 = r8.getErrorStream()     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r9.f919d = r10     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
        Lac:
            boolean r10 = j(r9, r3)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            if (r10 != 0) goto L187
            if (r6 != 0) goto Le6
            java.lang.String r6 = "h{hf#lg"
            java.lang.String r6 = android.ext.Tools.removeNewLinesChars(r6)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.String r8 = "Test 1 start"
            android.ext.e1.d(r8)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            if (r2 == 0) goto Lc3
            java.lang.String r6 = "id"
        Lc3:
            if (r2 == 0) goto Lc7
            r8 = r0
            goto Lc8
        Lc7:
            r8 = r1
        Lc8:
            r9 = 45
            android.ext.e2.o(r6, r9, r8)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            android.ext.e2.f745a = r0     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.String r6 = "Test 1 end"
            android.ext.e1.d(r6)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.io.File r6 = new java.io.File     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r6.<init>(r15)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r8 = 493(0x1ed, float:6.91E-43)
            android.ext.Tools.q(r6, r8)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.String r6 = "0755"
            android.ext.Tools.r(r15, r6)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r6 = 1
            goto L10
        Le6:
            boolean r4 = android.ext.Config.C     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            if (r4 == 0) goto Lf3
            if (r2 == 0) goto L102
            java.lang.String[] r4 = r14.K(r5, r15, r3)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r2 = 0
            goto L10
        Lf3:
            if (r7 != 0) goto L102
            java.lang.String r4 = S0(r15)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            if (r4 == 0) goto L102
            java.lang.String[] r4 = r14.K(r2, r4, r3)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r7 = 1
            goto L10
        L102:
            r14.i(r15, r6)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r2 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r2)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r15.<init>()     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.String r2 = android.ext.e2.f745a     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r15.append(r2)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.String r2 = android.ext.e2.g(r8)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r15.append(r2)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            android.ext.e2.f745a = r15     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            android.ext.e1.d(r15)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            android.ext.r.k = r11     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.String r15 = "Show error alert"
            android.ext.e1.i(r15)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            android.app.AlertDialog$Builder r15 = android.ext.f.b()     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r2 = 2131296359(0x7f090067, float:1.8210632E38)
            android.view.View r2 = android.ext.Tools.g0(r2)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            android.app.AlertDialog$Builder r15 = r15.setCustomTitle(r2)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r2.<init>()     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r3 = 2131296441(0x7f0900b9, float:1.8210799E38)
            java.lang.String r3 = android.ext.b2.f(r3)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r2.append(r3)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.String r3 = "\n\n"
            r2.append(r3)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.String r3 = android.ext.e2.f745a     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r2.append(r3)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            android.app.AlertDialog$Builder r15 = r15.setMessage(r2)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r2 = 2131296424(0x7f0900a8, float:1.8210764E38)
            java.lang.String r2 = android.ext.b2.f(r2)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            android.ext.p0 r3 = new android.ext.p0     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r4 = 400(0x190, float:5.6E-43)
            r3.<init>(r4)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            android.app.AlertDialog$Builder r15 = r15.setPositiveButton(r2, r3)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            java.lang.String r2 = "SU"
            android.ext.f0$k r3 = new android.ext.f0$k     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r3.<init>(r14)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            android.app.AlertDialog$Builder r15 = r15.setNeutralButton(r2, r3)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r2 = 2131296963(0x7f0902c3, float:1.8211858E38)
            java.lang.String r2 = android.ext.b2.f(r2)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            android.app.AlertDialog$Builder r15 = r15.setNegativeButton(r2, r1)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            android.ext.f.o(r15)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            return r1
        L187:
            android.ext.f0.y = r9     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            int r15 = android.ext.Tools.D0(r8)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r14.f797f = r15     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            boolean r15 = r14.e0()     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            if (r15 == 0) goto L1bb
            android.ext.f0$v r15 = new android.ext.f0$v     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            r15.<init>(r14)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            android.ext.n2.h(r15)     // Catch: java.lang.Exception -> L31 android.ext.f0.l0 -> L34
            return r9
        L19e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = r15.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.ext.e1.l(r0, r15)
            java.lang.String r15 = r15.getMessage()
            android.ext.Tools.J1(r15)
        L1bb:
            return r1
        L1bc:
            throw r15
    }

    public long P(byte r10, long r11, int r13) {
            r9 = this;
            android.ext.InOut r0 = r9.f793b
            boolean r0 = r0.h()
            r1 = -1
            if (r0 != 0) goto Lb
            return r1
        Lb:
            android.ext.f0$g0 r0 = new android.ext.f0$g0
            r3 = r0
            r4 = r9
            r5 = r10
            r6 = r11
            r8 = r13
            r3.<init>(r4, r5, r6, r8)
            android.ext.n2.j(r0)
            java.util.concurrent.Exchanger r10 = r9.f794c
        L1a:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L3f java.util.concurrent.TimeoutException -> L45
            r0 = 0
            r3 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r13 = r10.exchange(r0, r3, r13)     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L3f java.util.concurrent.TimeoutException -> L45
            byte[] r13 = (byte[]) r13     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L3f java.util.concurrent.TimeoutException -> L45
            android.ext.w r0 = new android.ext.w     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L3f java.util.concurrent.TimeoutException -> L45
            r0.<init>(r13)     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L3f java.util.concurrent.TimeoutException -> L45
            r13 = 3
            r0.l(r13)     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L3f java.util.concurrent.TimeoutException -> L45
            long r3 = r0.g()     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L3f java.util.concurrent.TimeoutException -> L45
            int r13 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r13 != 0) goto L1a
            r13 = 4
            r0.l(r13)     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L3f java.util.concurrent.TimeoutException -> L45
            long r10 = r0.h()     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L3f java.util.concurrent.TimeoutException -> L45
            return r10
        L3f:
            r10 = move-exception
            java.lang.String r11 = "getMemoryContent failed"
            android.ext.e1.l(r11, r10)
        L45:
            return r1
    }

    public void P0() {
            r1 = this;
            r0 = 0
            r1.Q0(r0)
            return
    }

    public long Q(long r2, int r4) {
            r1 = this;
            r0 = 0
            long r2 = r1.P(r0, r2, r4)
            return r2
    }

    public void Q0(byte r3) {
            r2 = this;
            android.ext.f0$b0 r0 = new android.ext.f0$b0
            r0.<init>(r2, r3)
            android.ext.n2.j(r0)
            r0 = 3
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> Ld
        Ld:
            return
    }

    public void R(byte r3, int[] r4, long[] r5) {
            r2 = this;
            int r0 = r4.length
            int r1 = r5.length
            if (r0 != r1) goto Ld
            android.ext.f0$f0 r0 = new android.ext.f0$f0
            r0.<init>(r2, r4, r3, r5)
            android.ext.n2.j(r0)
            return
        Ld:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Size mismatch: "
            r0.append(r1)
            int r4 = r4.length
            r0.append(r4)
            java.lang.String r4 = " != "
            r0.append(r4)
            int r4 = r5.length
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    public void S(int[] r2, long[] r3) {
            r1 = this;
            r0 = 0
            r1.R(r0, r2, r3)
            return
    }

    public void T0() {
            r2 = this;
            r0 = 0
            r1 = 51
            r2.u0(r0, r1)
            return
    }

    public void U() {
            r1 = this;
            r0 = 0
            r1.V(r0)
            return
    }

    public void U0(byte r16, int r17, long r18, long r20, double r22, double r24) {
            r15 = this;
            r15.c0()
            r0 = 1
            r14 = r15
            boolean[] r5 = r15.I(r0)
            android.ext.f0$d r0 = new android.ext.f0$d
            r1 = r0
            r2 = r15
            r3 = r16
            r4 = r17
            r6 = r18
            r8 = r20
            r10 = r22
            r12 = r24
            r1.<init>(r2, r3, r4, r5, r6, r8, r10, r12)
            android.ext.n2.j(r0)
            return
    }

    public void V(byte r2) {
            r1 = this;
            r0 = 56
            r1.u0(r2, r0)
            return
    }

    public void V0(int r12, long r13, long r15, double r17, double r19) {
            r11 = this;
            r1 = 0
            r0 = r11
            r2 = r12
            r3 = r13
            r5 = r15
            r7 = r17
            r9 = r19
            r0.U0(r1, r2, r3, r5, r7, r9)
            return
    }

    public void W() {
            r1 = this;
            r0 = 0
            r1.X(r0)
            return
    }

    void W0(boolean[] r5) {
            r4 = this;
            android.ext.InOut r0 = r4.f793b
            int r1 = r5.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Lf
            boolean r3 = r5[r2]
            byte r3 = (byte) r3
            r0.s(r3)
            int r2 = r2 + 1
            goto L4
        Lf:
            return
    }

    public void X(byte r2) {
            r1 = this;
            r0 = 60
            r1.u0(r2, r0)
            return
    }

    public void Y(byte r23, int r24, int r25, int r26, long r27, long r29, long r31, int r33, long r34, int r36, int r37, int r38, double r39, int r41) {
            r22 = this;
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r8 = r29
            r10 = r31
            r12 = r33
            r13 = r34
            r15 = r36
            r16 = r37
            r17 = r38
            r18 = r39
            r20 = r41
            android.ext.f0$e0 r21 = new android.ext.f0$e0
            r0 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r12, r13, r15, r16, r17, r18, r20)
            android.ext.n2.j(r21)
            return
    }

    public double Z() {
            r4 = this;
            int r0 = r4.n
            double r0 = (double) r0
            int r2 = r4.o
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    public void a(android.ext.c r2, int r3) {
            r1 = this;
            if (r3 != 0) goto L3
            goto L9
        L3:
            android.ext.f0$k0 r0 = new android.ext.f0$k0
            r0.<init>(r2, r3)
            r2 = r0
        L9:
            java.util.ArrayList r3 = r1.q
            monitor-enter(r3)
            java.util.ArrayList r0 = r1.q     // Catch: java.lang.Throwable -> L13
            r0.add(r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    public java.lang.CharSequence a0() {
            r2 = this;
            android.ext.InOut r0 = r2.f793b
            boolean r0 = r0.h()
            if (r0 != 0) goto L41
            android.ext.f0$n0 r0 = r2.f792a
            if (r0 == 0) goto L2d
            java.lang.Process r0 = r0.f916a
            if (r0 != 0) goto L11
            goto L2d
        L11:
            boolean r0 = android.ext.Config.C
            if (r0 == 0) goto L18
            java.lang.String r0 = "V"
            goto L21
        L18:
            boolean r0 = android.ext.Config.vSpaceReal
            if (r0 == 0) goto L1f
            java.lang.String r0 = "U"
            goto L21
        L1f:
            java.lang.String r0 = "W"
        L21:
            r1 = 2130837510(0x7f020006, float:1.7279976E38)
        L24:
            int r1 = android.ext.Tools.d0(r1)
            java.lang.CharSequence r0 = android.ext.Tools.t(r0, r1)
            return r0
        L2d:
            boolean r0 = android.ext.Config.C
            if (r0 == 0) goto L34
            java.lang.String r0 = "!"
            goto L3d
        L34:
            boolean r0 = android.ext.Config.vSpaceReal
            if (r0 == 0) goto L3b
            java.lang.String r0 = "I"
            goto L3d
        L3b:
            java.lang.String r0 = "?"
        L3d:
            r1 = 2130837506(0x7f020002, float:1.7279968E38)
            goto L24
        L41:
            boolean r0 = android.ext.Config.C
            if (r0 == 0) goto L53
            r0 = 2130837508(0x7f020004, float:1.7279972E38)
            int r0 = android.ext.Tools.d0(r0)
            java.lang.String r1 = "$"
        L4e:
            java.lang.CharSequence r0 = android.ext.Tools.t(r1, r0)
            goto L6b
        L53:
            boolean r0 = android.ext.Config.vSpaceReal
            if (r0 == 0) goto L61
            r0 = 2130837509(0x7f020005, float:1.7279974E38)
            int r0 = android.ext.Tools.d0(r0)
            java.lang.String r1 = "@"
            goto L4e
        L61:
            r0 = 2130837507(0x7f020003, float:1.727997E38)
            int r0 = android.ext.Tools.d0(r0)
            java.lang.String r1 = "#"
            goto L4e
        L6b:
            return r0
    }

    public void b(android.ext.h2 r3) {
            r2 = this;
            java.util.ArrayList r0 = r2.r
            monitor-enter(r0)
            java.util.ArrayList r1 = r2.r     // Catch: java.lang.Throwable -> La
            r1.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public int b0() {
            r1 = this;
            int r0 = r1.f797f
            return r0
    }

    public void c(android.ext.h2 r3) {
            r2 = this;
            java.util.ArrayList r0 = r2.s
            monitor-enter(r0)
            java.util.ArrayList r1 = r2.s     // Catch: java.lang.Throwable -> La
            r1.add(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public void d(byte r3, long r4) {
            r2 = this;
            long r0 = r2.p
            long r0 = r0 + r4
            r2.p = r0
            r2.E0(r3)
            return
    }

    public boolean d0() {
            r5 = this;
            boolean r0 = android.ext.f0.v
            r1 = 1
            if (r0 != 0) goto Lf
            android.ext.InOut r0 = r5.f793b
            boolean r0 = r0.h()
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L3b
            android.app.AlertDialog$Builder r2 = android.ext.f.b()
            r3 = 2131296358(0x7f090066, float:1.821063E38)
            android.view.View r3 = android.ext.Tools.g0(r3)
            android.app.AlertDialog$Builder r2 = r2.setCustomTitle(r3)
            r3 = 2131297094(0x7f090346, float:1.8212123E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            android.app.AlertDialog$Builder r2 = r2.setMessage(r3)
            r3 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r4 = 0
            android.app.AlertDialog$Builder r2 = r2.setNegativeButton(r3, r4)
            android.ext.f.o(r2)
        L3b:
            r0 = r0 ^ r1
            return r0
    }

    public void e(long r2) {
            r1 = this;
            r0 = 0
            r1.d(r0, r2)
            return
    }

    public boolean e0() {
            r16 = this;
            r1 = r16
            java.lang.String r2 = "Failed out string for daemon exit"
            java.lang.String r3 = "Failed get err for daemon exit"
            android.ext.f0$n0 r0 = android.ext.f0.y
            r4 = 0
            if (r0 != 0) goto Lc
            return r4
        Lc:
            java.lang.Process r5 = r0.f916a
            if (r5 != 0) goto L11
            return r4
        L11:
            r6 = 0
            int r7 = r5.exitValue()     // Catch: java.lang.IllegalThreadStateException -> L1b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.IllegalThreadStateException -> L1b
            goto L1d
        L1b:
            r7 = r6
        L1d:
            r8 = 1
            if (r7 != 0) goto L29
            java.lang.String r9 = android.ext.f0.C
            if (r9 != 0) goto L29
            java.lang.String r9 = android.ext.f0.B
            if (r9 != 0) goto L29
            return r8
        L29:
            boolean r9 = android.ext.r.k
            if (r9 != 0) goto L26c
            boolean r9 = android.ext.f1.f952b
            if (r9 != 0) goto L26c
            r9 = 15
            r10 = 9
            r11 = 137(0x89, float:1.92E-43)
            if (r7 == 0) goto L6d
            int r12 = r7.intValue()
            if (r12 == r10) goto L4b
            int r12 = r7.intValue()
            if (r12 == r9) goto L4b
            int r12 = r7.intValue()
            if (r12 != r11) goto L6d
        L4b:
            int r12 = android.ext.Config.h
            if (r12 == 0) goto L6d
            r12 = 2131034188(0x7f05004c, float:1.7678886E38)
            android.ext.Config$p r12 = android.ext.Config.b(r12)
            r12.f42d = r4
            android.ext.Config.k()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Found SIGKILL/SIGTERM/SIGKILL_OOM: "
            r12.append(r13)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            goto L6e
        L6d:
            r12 = r6
        L6e:
            if (r12 == 0) goto L7b
            android.ext.e1.i(r12)
            android.ext.f0$c0 r13 = new android.ext.f0$c0
            r13.<init>(r1)
            android.ext.n2.i(r13)
        L7b:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r5 = android.ext.Tools.D0(r5)
            r14 = 10
            r13.append(r14)
            java.lang.String r15 = r1.f798g
            r13.append(r15)
            java.lang.String r15 = " ( "
            r13.append(r15)
            int r15 = android.os.Process.myPid()
            r13.append(r15)
            java.lang.String r15 = " / "
            r13.append(r15)
            r13.append(r5)
            r13.append(r15)
            int r5 = r1.f796e
            r13.append(r5)
            java.lang.String r5 = " )\n"
            r13.append(r5)
            r13.append(r7)
            r13.append(r15)
            java.lang.String r5 = android.ext.f0.C
            r13.append(r5)
            r13.append(r15)
            java.lang.String r5 = android.ext.f0.B
            r13.append(r5)
            r13.append(r14)
            android.ext.MainService r5 = android.ext.MainService.instance
            int r5 = r5.m0
            int r5 = r5 / 1024
            r13.append(r5)
            r13.append(r15)
            long r9 = android.ext.Tools.r0()
            r13.append(r9)
            r13.append(r15)
            android.ext.MainService r9 = android.ext.MainService.instance
            int r9 = r9.l0
            int r9 = r9 / 1024
            r13.append(r9)
            r13.append(r14)
            java.lang.String r9 = android.ext.e0.h()
            r13.append(r9)
            r13.append(r14)
            java.lang.String r10 = "S$H$A$-$3$8$4"
            java.lang.String r15 = "$"
            java.lang.String r5 = ""
            java.lang.String r10 = r10.replace(r15, r5)
            java.lang.String r10 = android.ext.w0.a(r9, r10)
            r13.append(r10)
            r13.append(r14)
            java.io.File r10 = new java.io.File
            r10.<init>(r9)
            long r8 = r10.length()
            r13.append(r8)
            r13.append(r14)
            java.lang.String r8 = "S#H#A#-#3#8#4"
            java.lang.String r9 = "#"
            java.lang.String r5 = r8.replace(r9, r5)
            java.lang.String r5 = android.ext.w0.a(r10, r5)
            r13.append(r5)
            if (r7 == 0) goto L160
            java.lang.String r5 = "\nOutput:\n"
            r13.append(r5)
            java.io.BufferedReader r5 = new java.io.BufferedReader
            java.io.InputStreamReader r8 = new java.io.InputStreamReader
            java.io.InputStream r0 = r0.f919d
            r8.<init>(r0)
            r5.<init>(r8)
        L136:
            java.lang.String r0 = r5.readLine()     // Catch: java.io.IOException -> L143 java.lang.OutOfMemoryError -> L150
            if (r0 == 0) goto L160
            r13.append(r0)     // Catch: java.io.IOException -> L143 java.lang.OutOfMemoryError -> L145
            r13.append(r14)     // Catch: java.io.IOException -> L143 java.lang.OutOfMemoryError -> L145
            goto L136
        L143:
            r0 = move-exception
            goto L15b
        L145:
            r0 = move-exception
            android.ext.e1.s(r3, r0)     // Catch: java.io.IOException -> L143 java.lang.OutOfMemoryError -> L150
            r13.append(r0)     // Catch: java.io.IOException -> L143 java.lang.OutOfMemoryError -> L150
            r13.append(r14)     // Catch: java.io.IOException -> L143 java.lang.OutOfMemoryError -> L150
            goto L136
        L150:
            r0 = move-exception
            android.ext.e1.s(r3, r0)
            r13.append(r0)
            r13.append(r14)
            goto L160
        L15b:
            java.lang.String r3 = "checkProcess"
            android.ext.e1.l(r3, r0)
        L160:
            java.lang.String r0 = "\nDEBUG:\n"
            r13.append(r0)
            java.lang.String r0 = android.ext.h0.f(r4)
            r13.append(r0)
            java.lang.String r0 = r13.toString()     // Catch: java.lang.OutOfMemoryError -> L172
        L170:
            r3 = r0
            goto L17e
        L172:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = "Failed get string for daemon exit"
            android.ext.e1.s(r0, r3)
            java.lang.String r0 = r3.toString()
            goto L170
        L17e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.OutOfMemoryError -> L193
            r0.<init>()     // Catch: java.lang.OutOfMemoryError -> L193
            java.lang.String r5 = "Daemon closed"
            r0.append(r5)     // Catch: java.lang.OutOfMemoryError -> L193
            r0.append(r3)     // Catch: java.lang.OutOfMemoryError -> L193
            java.lang.String r0 = r0.toString()     // Catch: java.lang.OutOfMemoryError -> L193
            android.ext.e1.i(r0)     // Catch: java.lang.OutOfMemoryError -> L193
            goto L197
        L193:
            r0 = move-exception
            android.ext.e1.s(r2, r0)
        L197:
            boolean r0 = android.ext.n0.d(r3)
            if (r0 != 0) goto L1c1
            if (r12 != 0) goto L1c1
            java.lang.String r0 = "backtrace:"
            boolean r0 = r3.contains(r0)     // Catch: java.lang.OutOfMemoryError -> L1bb
            if (r0 == 0) goto L1c1
            java.lang.String r0 = r1.f798g     // Catch: java.lang.OutOfMemoryError -> L1bb
            boolean r0 = r3.contains(r0)     // Catch: java.lang.OutOfMemoryError -> L1bb
            if (r0 == 0) goto L1c1
            java.lang.String r0 = "SIGPIPE"
            boolean r0 = r3.contains(r0)     // Catch: java.lang.OutOfMemoryError -> L1bb
            if (r0 != 0) goto L1c1
            android.ext.n0.i(r3)     // Catch: java.lang.OutOfMemoryError -> L1bb
            goto L1c1
        L1bb:
            r0 = move-exception
            java.lang.String r5 = "Failed send string for daemon exit"
            android.ext.e1.s(r5, r0)
        L1c1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.OutOfMemoryError -> L1dc
            r0.<init>()     // Catch: java.lang.OutOfMemoryError -> L1dc
            r5 = 2131296362(0x7f09006a, float:1.8210639E38)
            java.lang.String r5 = android.ext.b2.f(r5)     // Catch: java.lang.OutOfMemoryError -> L1dc
            r0.append(r5)     // Catch: java.lang.OutOfMemoryError -> L1dc
            r0.append(r14)     // Catch: java.lang.OutOfMemoryError -> L1dc
            r0.append(r3)     // Catch: java.lang.OutOfMemoryError -> L1dc
            java.lang.String r3 = r0.toString()     // Catch: java.lang.OutOfMemoryError -> L1dc
        L1da:
            r2 = 1
            goto L1e1
        L1dc:
            r0 = move-exception
            android.ext.e1.s(r2, r0)
            goto L1da
        L1e1:
            android.ext.r.k = r2
            java.lang.String r0 = "Show error alert"
            android.ext.e1.i(r0)
            android.app.AlertDialog$Builder r0 = android.ext.f.b()
            r2 = 2131296357(0x7f090065, float:1.8210628E38)
            android.view.View r5 = android.ext.Tools.g0(r2)
            android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r5)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r3)
            r3 = 2131296424(0x7f0900a8, float:1.8210764E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            android.ext.p0 r5 = new android.ext.p0
            r8 = 500(0x1f4, float:7.0E-43)
            r5.<init>(r8)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r3, r5)
            r3 = 2131296963(0x7f0902c3, float:1.8211858E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r3, r6)
            android.ext.f.o(r0)
            android.ext.InOut r0 = r1.f793b
            r0.n(r4)
            android.ext.MainService r0 = android.ext.MainService.instance
            r0.q0()
            if (r7 == 0) goto L26c
            int r0 = r7.intValue()
            r3 = 9
            if (r0 == r3) goto L23d
            int r0 = r7.intValue()
            r3 = 15
            if (r0 == r3) goto L23d
            int r0 = r7.intValue()
            if (r0 != r11) goto L26c
        L23d:
            android.app.AlertDialog$Builder r0 = android.ext.f.b()
            android.view.View r2 = android.ext.Tools.g0(r2)
            android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r2)
            int r2 = r7.intValue()
            if (r2 != r11) goto L253
            r2 = 2131296361(0x7f090069, float:1.8210637E38)
            goto L256
        L253:
            r2 = 2131296360(0x7f090068, float:1.8210634E38)
        L256:
            java.lang.String r2 = android.ext.b2.f(r2)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r2)
            r2 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r6)
            android.ext.f.o(r0)
        L26c:
            return r4
    }

    public void f(byte r8, long r9, int r11) {
            r7 = this;
            android.ext.f0$a r6 = new android.ext.f0$a
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            r4 = r9
            r0.<init>(r1, r2, r3, r4)
            android.ext.n2.j(r6)
            return
    }

    public void f0(byte r2, java.util.List r3) {
            r1 = this;
            boolean r0 = android.ext.e0.m()
            android.ext.f0$j0 r3 = M0(r3, r0)
            long[] r0 = r3.f887a
            int r0 = r0.length
            if (r0 != 0) goto Le
            return
        Le:
            int r0 = r3.f889c
            if (r0 != 0) goto L16
            r1.l(r2)
            return
        L16:
            android.ext.f0$s r0 = new android.ext.f0$s
            r0.<init>(r1, r3, r2)
            android.ext.n2.j(r0)
            int r3 = r3.f889c
            android.ext.MainService.N0(r3, r2)
            r2 = 0
            android.ext.i2.l = r2
            return
    }

    public void g(long r2, int r4) {
            r1 = this;
            r0 = 0
            r1.f(r0, r2, r4)
            return
    }

    public void g0() {
            r1 = this;
            java.lang.String r0 = "messageFailed"
            android.ext.e1.d(r0)
            r1.e0()
            android.ext.MainService r0 = android.ext.MainService.instance
            r0.s()
            return
    }

    public void h() {
            r1 = this;
            r0 = 1
            r1.f795d = r0
            r1.v()
            return
    }

    void h0(byte[] r27) {
            r26 = this;
            r15 = r26
            r13 = r27
            java.lang.String r14 = ", size: "
            r1 = 0
            android.ext.w r0 = new android.ext.w     // Catch: java.nio.BufferUnderflowException -> L1a5
            r0.<init>(r13)     // Catch: java.nio.BufferUnderflowException -> L1a5
            byte r11 = r0.e()     // Catch: java.nio.BufferUnderflowException -> L1a5
            byte r9 = r0.e()     // Catch: java.nio.BufferUnderflowException -> L185
            r10 = 0
            r2 = 1
            switch(r11) {
                case 16: goto L19c;
                case 17: goto L144;
                case 18: goto L13a;
                case 19: goto L12c;
                case 20: goto L19;
                case 21: goto L110;
                case 22: goto L100;
                case 23: goto Ld2;
                case 24: goto Lcd;
                case 25: goto Lbf;
                case 26: goto Lb0;
                case 27: goto La9;
                case 28: goto L85;
                case 29: goto L80;
                case 30: goto L52;
                case 31: goto L3b;
                default: goto L19;
            }
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.nio.BufferUnderflowException -> L36
            r0.<init>()     // Catch: java.nio.BufferUnderflowException -> L36
            java.lang.String r1 = "Unknown message: "
            r0.append(r1)     // Catch: java.nio.BufferUnderflowException -> L36
            r0.append(r11)     // Catch: java.nio.BufferUnderflowException -> L36
            r0.append(r14)     // Catch: java.nio.BufferUnderflowException -> L36
            int r1 = r13.length     // Catch: java.nio.BufferUnderflowException -> L36
            r0.append(r1)     // Catch: java.nio.BufferUnderflowException -> L36
            java.lang.String r0 = r0.toString()     // Catch: java.nio.BufferUnderflowException -> L36
            android.ext.e1.p(r0)     // Catch: java.nio.BufferUnderflowException -> L36
            goto L1c5
        L36:
            r0 = move-exception
            r1 = r11
        L38:
            r15 = r14
            goto L1a8
        L3b:
            long r0 = r0.g()     // Catch: java.nio.BufferUnderflowException -> L36
            if (r9 == 0) goto L4b
            android.ext.Script.Y2(r0)     // Catch: java.nio.BufferUnderflowException -> L36
            android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.nio.BufferUnderflowException -> L36
        L46:
            r0.X(r9, r10)     // Catch: java.nio.BufferUnderflowException -> L36
            goto L1c5
        L4b:
            android.ext.MainService r2 = android.ext.MainService.instance     // Catch: java.nio.BufferUnderflowException -> L36
            r2.h(r0)     // Catch: java.nio.BufferUnderflowException -> L36
            goto L1c5
        L52:
            int r3 = r0.f()     // Catch: java.nio.BufferUnderflowException -> L36
            if (r3 != r2) goto L5f
            android.ext.MainService r3 = android.ext.MainService.instance     // Catch: java.nio.BufferUnderflowException -> L36
            android.ext.TimersEditor r3 = r3.o0     // Catch: java.nio.BufferUnderflowException -> L36
            r4 = 19
            goto L65
        L5f:
            android.ext.MainService r3 = android.ext.MainService.instance     // Catch: java.nio.BufferUnderflowException -> L36
            android.ext.TimersEditor r3 = r3.n0     // Catch: java.nio.BufferUnderflowException -> L36
            r4 = 44
        L65:
            int r4 = r4 * 4
            boolean[] r5 = new boolean[r4]     // Catch: java.nio.BufferUnderflowException -> L36
            r6 = 0
        L6a:
            if (r6 >= r4) goto L7a
            byte r7 = r0.e()     // Catch: java.nio.BufferUnderflowException -> L36
            if (r7 == 0) goto L74
            r7 = 1
            goto L75
        L74:
            r7 = 0
        L75:
            r5[r6] = r7     // Catch: java.nio.BufferUnderflowException -> L36
            int r6 = r6 + 1
            goto L6a
        L7a:
            r3.i(r5)     // Catch: java.nio.BufferUnderflowException -> L36
            android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.nio.BufferUnderflowException -> L36
            goto L46
        L80:
            android.ext.RegionList.h(r0)     // Catch: java.nio.BufferUnderflowException -> L36
            goto L1c5
        L85:
            int r2 = r0.f()     // Catch: java.nio.BufferUnderflowException -> L36
            byte r3 = r0.e()     // Catch: java.nio.BufferUnderflowException -> L36
            if (r3 <= 0) goto L91
            int[] r10 = new int[r3]     // Catch: java.nio.BufferUnderflowException -> L36
        L91:
            if (r1 >= r3) goto L9c
            int r4 = r0.f()     // Catch: java.nio.BufferUnderflowException -> L36
            r10[r1] = r4     // Catch: java.nio.BufferUnderflowException -> L36
            int r1 = r1 + 1
            goto L91
        L9c:
            android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.nio.BufferUnderflowException -> L36
            r0.p0(r9, r2, r10)     // Catch: java.nio.BufferUnderflowException -> L36
            r0 = 7
            if (r2 != r0) goto L1c5
            r26.R0()     // Catch: java.nio.BufferUnderflowException -> L36
            goto L1c5
        La9:
            android.ext.MainService r1 = android.ext.MainService.instance     // Catch: java.nio.BufferUnderflowException -> L36
            r1.P0(r0)     // Catch: java.nio.BufferUnderflowException -> L36
            goto L1c5
        Lb0:
            android.ext.MainService r1 = android.ext.MainService.instance     // Catch: java.nio.BufferUnderflowException -> L36
            int r2 = r0.f()     // Catch: java.nio.BufferUnderflowException -> L36
            int r0 = r0.f()     // Catch: java.nio.BufferUnderflowException -> L36
            r1.O0(r2, r0)     // Catch: java.nio.BufferUnderflowException -> L36
            goto L1c5
        Lbf:
            boolean r3 = android.ext.Config.vSpaceReal     // Catch: java.nio.BufferUnderflowException -> L36
            if (r3 == 0) goto Lc8
            boolean r3 = android.ext.Config.C     // Catch: java.nio.BufferUnderflowException -> L36
            if (r3 != 0) goto Lc8
            r1 = 1
        Lc8:
            android.ext.x2.u(r0, r1)     // Catch: java.nio.BufferUnderflowException -> L36
            goto L1c5
        Lcd:
            android.ext.z1.o(r0)     // Catch: java.nio.BufferUnderflowException -> L36
            goto L1c5
        Ld2:
            android.ext.MainService r3 = android.ext.MainService.instance     // Catch: java.nio.BufferUnderflowException -> L36
            android.ext.d r3 = r3.u0     // Catch: java.nio.BufferUnderflowException -> L36
            android.ext.d$a r4 = new android.ext.d$a     // Catch: java.nio.BufferUnderflowException -> L36
            r4.<init>()     // Catch: java.nio.BufferUnderflowException -> L36
        Ldb:
            int r7 = r0.f()     // Catch: java.nio.BufferUnderflowException -> L36
            if (r7 != 0) goto Lea
            if (r1 == 0) goto L1c5
            android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.nio.BufferUnderflowException -> L36
            r0.e0()     // Catch: java.nio.BufferUnderflowException -> L36
            goto L1c5
        Lea:
            long r5 = r0.g()     // Catch: java.nio.BufferUnderflowException -> L36
            long r8 = r0.h()     // Catch: java.nio.BufferUnderflowException -> L36
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r4 = r4 & r7
            if (r4 != 0) goto Ldb
            r4 = r3
            boolean r4 = r4.c(r5, r7, r8)     // Catch: java.nio.BufferUnderflowException -> L36
            if (r4 == 0) goto Ldb
            r1 = 1
            goto Ldb
        L100:
            android.ext.MainService r1 = android.ext.MainService.instance     // Catch: java.nio.BufferUnderflowException -> L36
            android.ext.SavedListAdapter r1 = r1.t0     // Catch: java.nio.BufferUnderflowException -> L36
            r1.h(r0)     // Catch: java.nio.BufferUnderflowException -> L36
            if (r9 == 0) goto L1c5
            android.ext.Script.C3(r0)     // Catch: java.nio.BufferUnderflowException -> L36
            android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.nio.BufferUnderflowException -> L36
            goto L46
        L110:
            android.ext.MainService r16 = android.ext.MainService.instance     // Catch: java.nio.BufferUnderflowException -> L36
            r17 = 0
            long r18 = r0.g()     // Catch: java.nio.BufferUnderflowException -> L36
            long r20 = r0.g()     // Catch: java.nio.BufferUnderflowException -> L36
            r22 = -1
            r23 = -1
            long r24 = r0.g()     // Catch: java.nio.BufferUnderflowException -> L36
            r16.i0(r17, r18, r20, r22, r23, r24)     // Catch: java.nio.BufferUnderflowException -> L36
            r26.v()     // Catch: java.nio.BufferUnderflowException -> L36
            goto L1c5
        L12c:
            r26.m()     // Catch: java.nio.BufferUnderflowException -> L36
            android.ext.MainService r1 = android.ext.MainService.instance     // Catch: java.nio.BufferUnderflowException -> L36
            int r0 = r0.f()     // Catch: java.nio.BufferUnderflowException -> L36
            r1.k0(r0)     // Catch: java.nio.BufferUnderflowException -> L36
            goto L1c5
        L13a:
            r26.m()     // Catch: java.nio.BufferUnderflowException -> L36
            android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.nio.BufferUnderflowException -> L36
            r0.r0()     // Catch: java.nio.BufferUnderflowException -> L36
            goto L1c5
        L144:
            long r4 = r0.g()     // Catch: java.nio.BufferUnderflowException -> L185
            long r6 = r0.g()     // Catch: java.nio.BufferUnderflowException -> L185
            int r0 = r0.f()     // Catch: java.nio.BufferUnderflowException -> L185
            if (r0 != 0) goto L18a
            int r1 = r15.h     // Catch: java.nio.BufferUnderflowException -> L185
            if (r1 <= 0) goto L18a
            if (r9 != 0) goto L18a
            long r2 = (long) r9     // Catch: java.nio.BufferUnderflowException -> L185
            r4 = 0
            int r0 = android.ext.MainService.D()     // Catch: java.nio.BufferUnderflowException -> L185
            r6 = r0 & 127(0x7f, float:1.78E-43)
            int r8 = r15.h     // Catch: java.nio.BufferUnderflowException -> L185
            long r9 = r15.j     // Catch: java.nio.BufferUnderflowException -> L185
            long r0 = r15.k     // Catch: java.nio.BufferUnderflowException -> L185
            r16 = r8
            long r7 = r15.l     // Catch: java.nio.BufferUnderflowException -> L185
            r17 = r0
            r1 = r26
            r19 = r7
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r7 = r0
            r8 = r16
            r16 = r11
            r11 = r17
            r15 = r14
            r13 = r19
            r1.E(r2, r4, r6, r7, r8, r9, r11, r13)     // Catch: java.nio.BufferUnderflowException -> L181
            goto L1c5
        L181:
            r0 = move-exception
        L182:
            r1 = r16
            goto L1a8
        L185:
            r0 = move-exception
            r16 = r11
            r15 = r14
            goto L182
        L18a:
            r16 = r11
            r15 = r14
            android.ext.MainService r2 = android.ext.MainService.instance     // Catch: java.nio.BufferUnderflowException -> L181
            r3 = r9
            r8 = r0
            r2.o0(r3, r4, r6, r8)     // Catch: java.nio.BufferUnderflowException -> L181
            if (r0 != 0) goto L1c5
            android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.nio.BufferUnderflowException -> L181
            r0.X(r9, r10)     // Catch: java.nio.BufferUnderflowException -> L181
            goto L1c5
        L19c:
            r16 = r11
            r15 = r14
            android.ext.MainService r1 = android.ext.MainService.instance     // Catch: java.nio.BufferUnderflowException -> L181
            r1.l0(r0)     // Catch: java.nio.BufferUnderflowException -> L181
            goto L1c5
        L1a5:
            r0 = move-exception
            goto L38
        L1a8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed process message: "
            r2.append(r3)
            r2.append(r1)
            r2.append(r15)
            r1 = r27
            int r1 = r1.length
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.ext.e1.l(r1, r0)
        L1c5:
            return
    }

    void i(java.lang.String r6, boolean r7) {
            r5 = this;
            java.io.File r7 = new java.io.File
            r7.<init>(r6)
            boolean r0 = r7.exists()
            r1 = 2131296817(0x7f090231, float:1.8211561E38)
            if (r0 != 0) goto L13
            r7 = 2131296450(0x7f0900c2, float:1.8210817E38)
            goto L88
        L13:
            boolean r0 = r7.isFile()
            if (r0 != 0) goto L1d
            r7 = 2131296818(0x7f090232, float:1.8211563E38)
            goto L88
        L1d:
            java.lang.String r0 = "-l"
            java.lang.String r2 = android.ext.Tools.F0(r6)
            java.lang.String r3 = "ls"
            java.lang.String[] r0 = new java.lang.String[]{r3, r0, r2}
            java.lang.Process r2 = android.ext.Tools.I(r0)     // Catch: java.lang.Exception -> L5f
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L5f
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L5f
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L5f
            r4.<init>(r2)     // Catch: java.lang.Exception -> L5f
            r3.<init>(r4)     // Catch: java.lang.Exception -> L5f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5f
            r2.<init>()     // Catch: java.lang.Exception -> L5f
            java.lang.String r4 = "ls for '"
            r2.append(r4)     // Catch: java.lang.Exception -> L5f
            r2.append(r6)     // Catch: java.lang.Exception -> L5f
            java.lang.String r4 = "' got: "
            r2.append(r4)     // Catch: java.lang.Exception -> L5f
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Exception -> L5f
            r2.append(r4)     // Catch: java.lang.Exception -> L5f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L5f
            android.ext.e1.p(r2)     // Catch: java.lang.Exception -> L5f
            r3.close()     // Catch: java.lang.Exception -> L5f
            goto L7d
        L5f:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "run '"
            r3.append(r4)
            java.lang.String r0 = java.util.Arrays.toString(r0)
            r3.append(r0)
            java.lang.String r0 = "' error"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.ext.e1.l(r0, r2)
        L7d:
            boolean r7 = r7.canExecute()
            if (r7 != 0) goto L87
            r7 = 2131296817(0x7f090231, float:1.8211561E38)
            goto L88
        L87:
            r7 = 0
        L88:
            if (r7 == 0) goto Ld7
            android.ext.f0$l0 r0 = new android.ext.f0$l0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = android.ext.Tools.N1(r7)
            r2.append(r3)
            java.lang.String r3 = ": '"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = "'\n\n"
            r2.append(r6)
            r6 = 2131296320(0x7f090040, float:1.8210553E38)
            java.lang.String r6 = android.ext.b2.f(r6)
            r2.append(r6)
            if (r7 != r1) goto Lca
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "\n\n"
            r6.append(r7)
            r7 = 2131296941(0x7f0902ad, float:1.8211813E38)
            java.lang.String r7 = android.ext.b2.f(r7)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto Lcc
        Lca:
            java.lang.String r6 = ""
        Lcc:
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.<init>(r6)
            throw r0
        Ld7:
            return
    }

    public void i0(byte r2, java.util.List r3) {
            r1 = this;
            r0 = 0
            android.ext.f0$j0 r3 = M0(r3, r0)
            long[] r0 = r3.f887a
            int r0 = r0.length
            if (r0 != 0) goto Lb
            return
        Lb:
            android.ext.f0$t r0 = new android.ext.f0$t
            r0.<init>(r1, r3, r2)
            android.ext.n2.j(r0)
            return
    }

    public void j0(java.util.List r2) {
            r1 = this;
            r0 = 0
            r1.i0(r0, r2)
            return
    }

    public void k0() {
            r1 = this;
            r0 = 0
            r1.l0(r0)
            return
    }

    public void l(byte r2) {
            r1 = this;
            r0 = 44
            r1.u0(r2, r0)
            r2 = 0
            android.ext.i2.l = r2
            return
    }

    public void l0(byte r3) {
            r2 = this;
            r0 = 1
            r2.n = r0
            r2.o = r0
            r0 = 0
            r2.p = r0
            android.ext.y2.i()
            android.ext.InOut r0 = r2.f793b
            r0.r()
            r0 = 42
            r2.u0(r3, r0)
            r3 = 0
            android.ext.i2.l = r3
            return
    }

    public void m() {
            r1 = this;
            r0 = 0
            r1.h = r0
            r1.i = r0
            return
    }

    public void n() {
            r1 = this;
            r0 = 0
            r1.o(r0)
            return
    }

    public void n0(byte r16, int r17, int r18, int[] r19, long[] r20, long[] r21, long r22, long r24, long r26) {
            r15 = this;
            r2 = r19
            r12 = r20
            r0 = 4194304(0x400000, float:5.877472E-39)
            r0 = r17 & r0
            r1 = 0
            if (r0 != 0) goto Ld
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            if (r0 == 0) goto L17
            int r3 = r12.length
            r5 = r18
            if (r5 == r3) goto L19
            r0 = 0
            goto L19
        L17:
            r5 = r18
        L19:
            if (r0 == 0) goto L2d
            int r3 = r2.length
            r4 = 0
        L1d:
            if (r4 >= r3) goto L2d
            r6 = r2[r4]
            r6 = r6 | r17
            r7 = -4194306(0xffffffffffbffffe, float:NaN)
            r6 = r6 & r7
            if (r6 == 0) goto L2a
            goto L4b
        L2a:
            int r4 = r4 + 1
            goto L1d
        L2d:
            if (r0 == 0) goto L4b
            int r0 = r12.length
            byte[] r5 = new byte[r0]
        L32:
            if (r1 >= r0) goto L3d
            r2 = r12[r1]
            int r3 = (int) r2
            byte r2 = (byte) r3
            r5[r1] = r2
            int r1 = r1 + 1
            goto L32
        L3d:
            r4 = 1
            r2 = r15
            r3 = r16
            r6 = r22
            r8 = r24
            r10 = r26
            r2.s0(r3, r4, r5, r6, r8, r10)
            return
        L4b:
            android.ext.f0$i r14 = new android.ext.f0$i
            r0 = r14
            r1 = r15
            r2 = r19
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r22
            r8 = r24
            r10 = r26
            r12 = r20
            r13 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r12, r13)
            android.ext.n2.j(r14)
            r0 = 0
            android.ext.i2.l = r0
            return
    }

    public void o(byte r2) {
            r1 = this;
            r0 = 46
            r1.u0(r2, r0)
            return
    }

    public void o0(byte r17, long r18, long r20, int r22, long r23, long r25, long r27) {
            r16 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "searchMask: "
            r0.append(r1)
            java.lang.String r1 = java.lang.Long.toHexString(r18)
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            java.lang.String r1 = java.lang.Long.toHexString(r20)
            r0.append(r1)
            java.lang.String r1 = " as "
            r0.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r22)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            java.lang.String r1 = java.lang.Long.toHexString(r23)
            r0.append(r1)
            r1 = 45
            r0.append(r1)
            java.lang.String r1 = java.lang.Long.toHexString(r25)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r1 = java.lang.Long.toString(r27)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            a.e r0 = android.ext.c.B()
            r14 = 0
            r1 = 0
            r3 = r14
            r2 = 0
        L5c:
            int r4 = r0.size()
            if (r2 >= r4) goto L75
            int r4 = r0.keyAt(r2)
            if (r4 == 0) goto L72
            r5 = r22 & r4
            if (r5 != r4) goto L72
            java.lang.Object r3 = r0.valueAt(r2)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
        L72:
            int r2 = r2 + 1
            goto L5c
        L75:
            java.lang.String r0 = java.lang.Long.toHexString(r18)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = r0.toUpperCase(r2)
            java.lang.String r4 = java.lang.Long.toHexString(r20)
            java.lang.String r2 = r4.toUpperCase(r2)
            int r4 = r0.length()
            int r5 = r2.length()
            r6 = 48
            if (r4 >= r5) goto Lb7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = new java.lang.String
            int r7 = r2.length()
            int r8 = r0.length()
            int r7 = r7 - r8
            char[] r7 = new char[r7]
            r5.<init>(r7)
            java.lang.String r5 = r5.replace(r1, r6)
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            goto Le4
        Lb7:
            int r4 = r0.length()
            int r5 = r2.length()
            if (r4 <= r5) goto Le4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = new java.lang.String
            int r7 = r0.length()
            int r8 = r2.length()
            int r7 = r7 - r8
            char[] r7 = new char[r7]
            r5.<init>(r7)
            java.lang.String r5 = r5.replace(r1, r6)
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        Le4:
            android.ext.MainService r4 = android.ext.MainService.instance
            android.ext.y r5 = new android.ext.y
            r5.<init>()
            r6 = 7
            java.lang.CharSequence[] r6 = new java.lang.CharSequence[r6]
            r7 = 2131296264(0x7f090008, float:1.821044E38)
            java.lang.String r7 = android.ext.Tools.N1(r7)
            r6[r1] = r7
            r1 = 1
            r6[r1] = r3
            r1 = 2
            r6[r1] = r0
            r0 = 2131296765(0x7f0901fd, float:1.8211456E38)
            java.lang.String r0 = android.ext.Tools.N1(r0)
            r1 = 3
            r6[r1] = r0
            r0 = 4
            r6[r0] = r2
            r0 = 2131297025(0x7f090301, float:1.8211983E38)
            java.lang.String r0 = android.ext.Tools.N1(r0)
            r1 = 5
            r6[r1] = r0
            r0 = r22 & 127(0x7f, float:1.78E-43)
            java.lang.CharSequence r0 = android.ext.c.v(r0)
            r1 = 6
            r6[r1] = r0
            java.lang.String r0 = "%s %s %s; %s: %s; %s: %s"
            android.ext.y r0 = r5.b(r0, r6)
            java.lang.CharSequence r0 = r0.d()
            r4.h0(r0)
            android.ext.f0$j r15 = new android.ext.f0$j
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r20
            r7 = r22
            r8 = r23
            r10 = r25
            r12 = r27
            r0.<init>(r1, r2, r3, r5, r7, r8, r10, r12)
            android.ext.n2.j(r15)
            android.ext.i2.l = r14
            return
    }

    public void p(byte r10, long r11, long r13, int r15) {
            r9 = this;
            android.ext.f0$c r8 = new android.ext.f0$c
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r13
            r7 = r15
            r0.<init>(r1, r2, r3, r5, r7)
            android.ext.n2.j(r8)
            return
    }

    public void p0(byte r15, long r16, int r18, int r19, long r20, long r22, long r24) {
            r14 = this;
            r6 = r18
            a.e r0 = android.ext.c.B()
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r19 & r1
            java.lang.String r2 = ""
            r3 = 0
            if (r1 == 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            java.lang.Object r0 = r0.get(r4)
            r1.append(r0)
            r0 = 42
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L46
        L2a:
            r1 = 0
            r4 = 0
        L2c:
            int r5 = r0.size()
            if (r4 >= r5) goto L45
            int r5 = r0.keyAt(r4)
            if (r5 == 0) goto L42
            r7 = r19 & r5
            if (r7 != r5) goto L42
            java.lang.Object r1 = r0.valueAt(r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L42:
            int r4 = r4 + 1
            goto L2c
        L45:
            r0 = r1
        L46:
            android.ext.c r1 = new android.ext.c
            r8 = 0
            r12 = r19 & 127(0x7f, float:1.78E-43)
            r7 = r1
            r10 = r16
            r7.<init>(r8, r10, r12)
            android.ext.y r4 = new android.ext.y
            r4.<init>()
            r5 = 3
            java.lang.CharSequence[] r7 = new java.lang.CharSequence[r5]
            r8 = 2131297080(0x7f090338, float:1.8212095E38)
            java.lang.String r8 = android.ext.b2.f(r8)
            r7[r3] = r8
            r8 = 1
            r7[r8] = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r5 = r1.J()
            r0[r3] = r5
            if (r6 != 0) goto L71
            goto L82
        L71:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " X"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
        L82:
            r0[r8] = r2
            java.lang.CharSequence r2 = r1.u()
            r3 = 2
            r0[r3] = r2
            java.lang.String r2 = "%s%s %s"
            java.lang.String r0 = android.ext.Tools.L1(r2, r0)
            int r1 = r1.m()
            java.lang.CharSequence r0 = android.ext.Tools.t(r0, r1)
            r7[r3] = r0
            java.lang.String r0 = "%s %s %s"
            r4.b(r0, r7)
            android.ext.MainService r0 = android.ext.MainService.instance
            java.lang.CharSequence r1 = r4.d()
            r0.h0(r1)
            r4 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r6 = r18
            r7 = r19
            r8 = r20
            r10 = r22
            r12 = r24
            r0.y0(r1, r2, r4, r6, r7, r8, r10, r12)
            return
    }

    public void q(long r8, long r10, int r12) {
            r7 = this;
            r1 = 0
            r0 = r7
            r2 = r8
            r4 = r10
            r6 = r12
            r0.p(r1, r2, r4, r6)
            return
    }

    public void q0(byte r14, short r15, int r16, long r17, long r19, long r21) {
            r13 = this;
            java.lang.String r0 = java.lang.Integer.toHexString(r15)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "searchPointer: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = " as "
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r16)
            r1.append(r2)
            java.lang.String r2 = " in "
            r1.append(r2)
            java.lang.String r2 = java.lang.Long.toHexString(r17)
            r1.append(r2)
            r2 = 45
            r1.append(r2)
            java.lang.String r2 = java.lang.Long.toHexString(r19)
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            java.lang.String r2 = java.lang.Long.toString(r21)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.ext.e1.d(r1)
            android.ext.MainService r1 = android.ext.MainService.instance
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "-> "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.h0(r0)
            android.ext.f0$l r0 = new android.ext.f0$l
            r2 = r0
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r9 = r19
            r11 = r21
            r2.<init>(r3, r4, r5, r6, r7, r9, r11)
            android.ext.n2.j(r0)
            r0 = 0
            android.ext.i2.l = r0
            return
    }

    public void r0(byte r17, long r18, long r20, int r22, int r23, long r24, long r26, long r28) {
            r16 = this;
            r6 = r22
            a.e r0 = android.ext.c.B()
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r23 & r1
            if (r1 == 0) goto L12
            r1 = -33554433(0xfffffffffdffffff, float:-4.2535293E37)
            r1 = r23 & r1
            goto L14
        L12:
            r1 = r23
        L14:
            r2 = 0
            r3 = 0
            r4 = 0
        L17:
            int r5 = r0.size()
            if (r4 >= r5) goto L30
            int r5 = r0.keyAt(r4)
            if (r5 == 0) goto L2d
            r7 = r1 & r5
            if (r7 != r5) goto L2d
            java.lang.Object r3 = r0.valueAt(r4)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
        L2d:
            int r4 = r4 + 1
            goto L17
        L30:
            android.ext.c r0 = new android.ext.c
            r8 = 0
            r15 = r1 & 127(0x7f, float:1.78E-43)
            r7 = r0
            r10 = r18
            r12 = r15
            r7.<init>(r8, r10, r12)
            android.ext.c r4 = new android.ext.c
            r11 = 0
            r10 = r4
            r13 = r20
            r10.<init>(r11, r13, r15)
            android.ext.y r5 = new android.ext.y
            r5.<init>()
            r7 = 3
            java.lang.CharSequence[] r8 = new java.lang.CharSequence[r7]
            r9 = 2131297080(0x7f090338, float:1.8212095E38)
            java.lang.String r9 = android.ext.b2.f(r9)
            r8[r2] = r9
            r9 = 1
            r8[r9] = r3
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r10 = r0.J()
            r3[r2] = r10
            java.lang.String r2 = r4.J()
            r3[r9] = r2
            if (r6 != 0) goto L6f
            java.lang.String r2 = ""
            goto L80
        L6f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = " X"
            r2.append(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
        L80:
            r4 = 2
            r3[r4] = r2
            java.lang.CharSequence r2 = r0.u()
            r3[r7] = r2
            java.lang.String r2 = "%s ~ %s%s %s"
            java.lang.String r2 = android.ext.Tools.L1(r2, r3)
            int r0 = r0.m()
            java.lang.CharSequence r0 = android.ext.Tools.t(r2, r0)
            r8[r4] = r0
            java.lang.String r0 = "%s %s %s"
            r5.b(r0, r8)
            android.ext.MainService r0 = android.ext.MainService.instance
            java.lang.CharSequence r2 = r5.d()
            r0.h0(r2)
            r0 = 8388608(0x800000, float:1.1754944E-38)
            r7 = r1 | r0
            r0 = r16
            r1 = r17
            r2 = r18
            r4 = r20
            r6 = r22
            r8 = r24
            r10 = r26
            r12 = r28
            r0.y0(r1, r2, r4, r6, r7, r8, r10, r12)
            return
    }

    public void s() {
            r1 = this;
            r0 = 0
            r1.t(r0)
            return
    }

    public void s0(byte r14, int r15, byte[] r16, long r17, long r19, long r21) {
            r13 = this;
            r10 = r16
            r0 = 0
            int r3 = r10.length
            r4 = 1
            r5 = 1
            r6 = 0
            r1 = r15
            r2 = r16
            java.lang.StringBuilder r0 = android.ext.x0.b(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            r2 = 0
            r3 = 48
            if (r1 <= r3) goto L30
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.substring(r2, r3)
            r1.append(r0)
            java.lang.String r0 = "..."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L30:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "searchText: ["
            r1.append(r3)
            int r3 = r10.length
            r1.append(r3)
            java.lang.String r3 = "] = "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = " in "
            r1.append(r3)
            java.lang.String r3 = java.lang.Long.toHexString(r17)
            r1.append(r3)
            r3 = 45
            r1.append(r3)
            java.lang.String r3 = java.lang.Long.toHexString(r19)
            r1.append(r3)
            java.lang.String r3 = ", "
            r1.append(r3)
            java.lang.String r3 = java.lang.Long.toString(r21)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.ext.e1.d(r1)
            int r1 = r10.length
            if (r1 != 0) goto L75
            return
        L75:
            int r1 = r10.length
            r3 = 1
            if (r1 != r3) goto L8c
            r0 = r10[r2]
            long r3 = (long) r0
            r5 = 0
            r6 = 536870913(0x20000001, float:1.0842023E-19)
            r1 = r13
            r2 = r14
            r7 = r17
            r9 = r19
            r11 = r21
            r1.p0(r2, r3, r5, r6, r7, r9, r11)
            return
        L8c:
            android.ext.MainService r1 = android.ext.MainService.instance
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 2131297005(0x7f0902ed, float:1.8211943E38)
            java.lang.String r5 = android.ext.Tools.N1(r5)
            r4[r2] = r5
            int r2 = r10.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r3] = r2
            r2 = 2
            r4[r2] = r0
            java.lang.String r0 = "%s[%d] = %s"
            java.lang.String r0 = android.ext.Tools.L1(r0, r4)
            r1.h0(r0)
            android.ext.f0$m r11 = new android.ext.f0$m
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r17
            r6 = r19
            r8 = r21
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r6, r8, r10)
            android.ext.n2.j(r11)
            r0 = 0
            android.ext.i2.l = r0
            return
    }

    public void t(byte r2) {
            r1 = this;
            r0 = 49
            r1.u0(r2, r0)
            return
    }

    void t0() {
            r3 = this;
            android.ext.InOut r0 = r3.f793b
            java.lang.String r1 = android.ext.f0.C
            if (r1 == 0) goto L20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Last send error: "
            r1.append(r2)
            java.lang.String r2 = android.ext.f0.C
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.ext.e1.i(r1)
            r0.d()
            return
        L20:
            r0.l()     // Catch: java.lang.Throwable -> L27
            r1 = 0
            android.ext.f0.C = r1     // Catch: java.lang.Throwable -> L27
            goto L42
        L27:
            r1 = move-exception
            r0.d()
            java.lang.String r0 = "Send error"
            android.ext.e1.l(r0, r1)
            java.lang.String r0 = r1.toString()
            android.ext.f0.C = r0
            android.os.Handler r0 = android.ext.n2.d()
            android.ext.f0$z r1 = new android.ext.f0$z
            r1.<init>(r3)
            r0.post(r1)
        L42:
            return
    }

    void u0(byte r2, byte r3) {
            r1 = this;
            android.ext.f0$y r0 = new android.ext.f0$y
            r0.<init>(r1, r2, r3)
            android.ext.n2.j(r0)
            return
    }

    void v0(byte r2) {
            r1 = this;
            android.ext.f0$x r0 = new android.ext.f0$x
            r0.<init>(r1, r2)
            android.ext.n2.j(r0)
            return
    }

    public void w(byte r13, long r14, long r16, int r18, java.lang.String r19, java.lang.String r20) {
            r12 = this;
            r10 = r19
            java.lang.String r0 = "/emulated/legacy"
            boolean r1 = r10.contains(r0)
            r2 = 124(0x7c, float:1.74E-43)
            java.lang.String r3 = "/emulated/0"
            if (r1 == 0) goto L25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r2)
            java.lang.String r0 = r10.replace(r0, r3)
        L1d:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L3c
        L25:
            boolean r1 = r10.contains(r3)
            if (r1 == 0) goto L3b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r2)
            java.lang.String r0 = r10.replace(r3, r0)
            goto L1d
        L3b:
            r0 = r10
        L3c:
            byte[] r2 = r0.getBytes()
            int r0 = r2.length
            if (r0 != 0) goto L44
            return
        L44:
            int r0 = r2.length
            java.lang.String r1 = " > "
            r3 = 4000(0xfa0, float:5.605E-42)
            if (r0 <= r3) goto L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "path big: "
            r0.append(r4)
            int r2 = r2.length
            r0.append(r2)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.ext.e1.i(r0)
            return
        L67:
            byte[] r4 = r20.getBytes()
            int r0 = r4.length
            if (r0 <= r3) goto L8a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "pkg big: "
            r0.append(r2)
            int r2 = r4.length
            r0.append(r2)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.ext.e1.i(r0)
            return
        L8a:
            android.ext.f0$b r11 = new android.ext.f0$b
            r0 = r11
            r1 = r12
            r3 = r4
            r4 = r13
            r5 = r14
            r7 = r16
            r9 = r18
            r10 = r19
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10)
            android.ext.n2.j(r11)
            return
    }

    public void w0() {
            r1 = this;
            r0 = 0
            r1.x0(r0)
            return
    }

    public void x(long r10, long r12, int r14, java.lang.String r15, java.lang.String r16) {
            r9 = this;
            r1 = 0
            r0 = r9
            r2 = r10
            r4 = r12
            r6 = r14
            r7 = r15
            r8 = r16
            r0.w(r1, r2, r4, r6, r7, r8)
            return
    }

    public void x0(byte r4) {
            r3 = this;
            java.lang.Integer r0 = r3.u
            if (r0 == 0) goto Le
            int r0 = android.ext.Config.h
            java.lang.Integer r1 = r3.u
            int r1 = r1.intValue()
            if (r0 == r1) goto L1f
        Le:
            java.lang.Integer r0 = r3.u
            if (r0 == 0) goto L17
            android.ext.MainService r0 = android.ext.MainService.instance
            r0.m()
        L17:
            int r0 = android.ext.Config.h
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.u = r0
        L1f:
            java.io.File r0 = android.ext.Tools.q0()
            java.lang.String r0 = r0.getAbsolutePath()
            byte[] r1 = r0.getBytes()
            android.ext.f0$w r2 = new android.ext.f0$w
            r2.<init>(r3, r4, r1, r0)
            android.ext.n2.j(r2)
            return
    }

    public void z() {
            r4 = this;
            android.ext.InOut r0 = r4.f793b
            r0.r()
            int r0 = r4.f796e
            if (r0 > 0) goto La
            return
        La:
            java.io.File r0 = new java.io.File
            java.io.File r1 = android.ext.Tools.q0()
            java.lang.String r2 = "OOM.tmp"
            r0.<init>(r1, r2)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L63
            r1.<init>(r0)     // Catch: java.io.IOException -> L63
            r2 = 4
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)     // Catch: java.io.IOException -> L63
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.io.IOException -> L63
            java.nio.ByteBuffer r2 = r2.order(r3)     // Catch: java.io.IOException -> L63
            int r3 = r4.f796e     // Catch: java.io.IOException -> L63
            java.nio.ByteBuffer r2 = r2.putInt(r3)     // Catch: java.io.IOException -> L63
            byte[] r2 = r2.array()     // Catch: java.io.IOException -> L63
            r1.write(r2)     // Catch: java.io.IOException -> L63
            r1.close()     // Catch: java.io.IOException -> L63
            java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> L63
            java.io.File r2 = android.ext.Tools.q0()     // Catch: java.io.IOException -> L63
            java.lang.String r3 = "OOM"
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L63
            boolean r1 = r0.renameTo(r1)     // Catch: java.io.IOException -> L63
            if (r1 != 0) goto L78
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L63
            r1.<init>()     // Catch: java.io.IOException -> L63
            java.lang.String r2 = "Failed rename OOM file: "
            r1.append(r2)     // Catch: java.io.IOException -> L63
            r1.append(r0)     // Catch: java.io.IOException -> L63
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L63
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L63
            r2.<init>()     // Catch: java.io.IOException -> L63
            android.ext.e1.s(r1, r2)     // Catch: java.io.IOException -> L63
            r0.delete()     // Catch: java.io.IOException -> L63
            goto L78
        L63:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed make OOM file: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.ext.e1.s(r0, r1)
        L78:
            return
    }
}
