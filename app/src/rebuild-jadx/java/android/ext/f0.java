package android.ext;

/* JADX INFO: loaded from: classes.dex */
class f0 {
    public static volatile boolean v = false;
    public static volatile boolean w = false;
    public static volatile boolean x = false;
    static android.ext.f0.n0 y;
    private static final java.util.List z = new java.util.ArrayList();
    private static boolean A = true;
    static volatile java.lang.String B = null;
    private static volatile java.lang.String C = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.ext.f0.n0 f792a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    java.util.concurrent.Exchanger f794c = new java.util.concurrent.Exchanger();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f795d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile int f796e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile int f797f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile java.lang.String f798g = "???";
    private volatile int h = 0;
    private volatile int i = 0;
    private volatile long j = 0;
    private volatile long k = -1;
    private volatile long l = 0;
    java.lang.Thread m = new android.ext.f0.d0("mReaderThread");
    private volatile int n = 1;
    private volatile int o = 1;
    private volatile long p = 0;
    private final java.util.ArrayList q = new java.util.ArrayList();
    private final java.util.ArrayList r = new java.util.ArrayList();
    private final java.util.ArrayList s = new java.util.ArrayList();
    long t = 0;
    private java.lang.Integer u = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final android.ext.InOut f793b = new android.ext.InOut();

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f801c;

        a(byte b2, int i, long j) {
            this.f799a = b2;
            this.f800b = i;
            this.f801c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            inOut.q(this.f799a, (byte) 32, 0);
            inOut.u(this.f800b);
            inOut.v(this.f801c);
            android.ext.f0.this.t0();
        }
    }

    class a0 extends android.ext.g0 {

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: android.ext.f0$a0$a$a, reason: collision with other inner class name */
            class DialogInterfaceOnClickListenerC0016a implements android.content.DialogInterface.OnClickListener {
                DialogInterfaceOnClickListenerC0016a() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i) {
                    if (!android.ext.Config.vSpaceReal || android.ext.Config.C || (android.ext.Config.B & 512) == 0) {
                        android.ext.ConfigListAdapter.t(catch_.me_.if_.you_.can_.R.string.work_without_root);
                    } else {
                        android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_vspace_root).b();
                    }
                }
            }

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    android.app.AlertDialog alertDialogCreate = android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.failed_load_daemon)).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.is_device_rooted) + "\n\n" + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.must_be_root)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.fix_it), new android.ext.f0.a0.a.DialogInterfaceOnClickListenerC0016a()).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null).create();
                    android.ext.f.m(alertDialogCreate);
                    android.ext.Tools.u1(alertDialogCreate);
                } catch (java.lang.Throwable th) {
                    android.ext.e1.a(th);
                }
            }
        }

        a0(java.lang.String str) {
            super(str);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0177 A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #3 {all -> 0x0189, blocks: (B:37:0x0171, B:39:0x0177), top: B:76:0x0171 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x0185  */
        /* JADX WARN: Code duplicated, block: B:47:0x0193 A[Catch: all -> 0x01a5, TRY_LEAVE, TryCatch #1 {all -> 0x01a5, blocks: (B:45:0x018d, B:47:0x0193), top: B:74:0x018d }] */
        /* JADX WARN: Code duplicated, block: B:49:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:55:0x01af A[Catch: all -> 0x01c1, TRY_LEAVE, TryCatch #0 {all -> 0x01c1, blocks: (B:53:0x01a9, B:55:0x01af), top: B:72:0x01a9 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x01bd  */
        /* JADX WARN: Code duplicated, block: B:68:0x0202  */
        /* JADX WARN: Code duplicated, block: B:85:0x0186 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x01a2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x01be A[SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:68:0x0202, please report this as an issue */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean zEquals;
            java.lang.String string;
            int i;
            int i2;
            int i3;
            java.lang.String str;
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            try {
                java.lang.String strH = android.ext.e0.h();
                android.ext.f0 f0Var = android.ext.f0.this;
                android.ext.f0.n0 n0VarO0 = f0Var.O0(strH);
                f0Var.f792a = n0VarO0;
                android.ext.e2.f745a = "";
                inOut.o(n0VarO0.f918c, n0VarO0.f917b);
                inOut.n(true);
                android.ext.MainService.instance.q0();
                android.ext.e1.o(n0VarO0.f916a, n0VarO0.f919d);
                byte[] bArrK = inOut.k();
                if (bArrK == null) {
                    str = "DI: null";
                } else if (bArrK.length != 7) {
                    str = "DI: " + bArrK.length;
                } else {
                    android.ext.w wVar = new android.ext.w(bArrK);
                    byte bE = wVar.e();
                    android.ext.InOut.p(bE == 8);
                    byte bE2 = wVar.e();
                    if (bE2 != 4) {
                        android.ext.e1.i("DI: QE " + ((int) bE2));
                    }
                    android.ext.f0.this.f796e = wVar.f();
                    str = "DI: " + ((int) bE) + " " + ((int) bE2) + " " + android.ext.f0.this.f796e;
                }
                android.ext.e1.d(str);
                android.ext.w wVar2 = new android.ext.w(inOut.k());
                wVar2.e();
                byte[] bArr = new byte[wVar2.e()];
                wVar2.c(bArr);
                android.ext.f0.this.f798g = new java.lang.String(bArr);
                android.ext.e1.d("InOut: x64: " + android.ext.InOut.m + "; QE_ALIGN: 4; " + android.ext.f0.this.f796e + "; " + android.ext.f0.this.f798g);
                android.ext.f0.this.m.start();
                android.ext.MainService.instance.q0();
                inOut.m();
                android.ext.f0.this.v0((byte) 0);
            } catch (android.ext.f0.l0 e2) {
                android.ext.e1.l("start daemon failed", e2);
                java.lang.String str2 = "" + e2.getMessage();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                try {
                    java.lang.String str3 = android.os.Build.CPU_ABI;
                    sb.append(str3);
                    sb.append("; ");
                    zEquals = "armeabi".equals(str3);
                    try {
                        java.lang.String str4 = android.os.Build.CPU_ABI2;
                        sb.append(str4);
                        sb.append("; ");
                        if ("armeabi".equals(str4)) {
                            zEquals = true;
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        android.ext.e1.s("Failed get ABI", th);
                        for (java.lang.String str5 : android.os.Build.SUPPORTED_ABIS) {
                            sb.append(str5);
                            sb.append("; ");
                            if ("armeabi".equals(str5)) {
                                zEquals = true;
                            }
                        }
                        for (java.lang.String str6 : android.os.Build.SUPPORTED_32_BIT_ABIS) {
                            sb.append(str6);
                            sb.append("; ");
                            if ("armeabi".equals(str6)) {
                                zEquals = true;
                            }
                        }
                        for (java.lang.String str7 : android.os.Build.SUPPORTED_64_BIT_ABIS) {
                            sb.append(str7);
                            sb.append("; ");
                            if ("armeabi".equals(str7)) {
                                zEquals = true;
                            }
                        }
                        if (zEquals && android.ext.b2.d("ydwa", "raw") == 0) {
                            str2 = str2 + "\n\n" + android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.try_arm_version) + ": " + android.ext.i.f999a;
                        }
                        string = sb.toString();
                        if (string.contains("mips")) {
                            str2 = str2 + "\n\n" + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.mips_arch);
                        }
                        java.lang.String str8 = str2 + "\n\nABIs: " + string + '\n' + ((java.lang.Object) android.ext.e0.f730g) + '\n' + android.os.Build.VERSION.SDK_INT + '\n' + ((java.lang.Object) android.ext.e0.h);
                        android.ext.e1.d("Supported ABIs: " + string);
                        android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.failed_load_daemon)).setMessage(str8).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null));
                        inOut.n(false);
                        android.ext.MainService.instance.q0();
                        android.ext.f0.r();
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    zEquals = false;
                }
                try {
                    while (i3 < r10) {
                        sb.append(str5);
                        sb.append("; ");
                        if ("armeabi".equals(str5)) {
                            zEquals = true;
                        }
                    }
                } catch (java.lang.Throwable th3) {
                    android.ext.e1.s("Failed get ABI", th3);
                }
                try {
                    while (i2 < r10) {
                        sb.append(str6);
                        sb.append("; ");
                        if ("armeabi".equals(str6)) {
                            zEquals = true;
                        }
                    }
                } catch (java.lang.Throwable th4) {
                    android.ext.e1.s("Failed get ABI", th4);
                }
                try {
                    while (i < r10) {
                        sb.append(str7);
                        sb.append("; ");
                        if ("armeabi".equals(str7)) {
                            zEquals = true;
                        }
                    }
                } catch (java.lang.Throwable th5) {
                    android.ext.e1.s("Failed get ABI", th5);
                }
                if (zEquals) {
                    str2 = str2 + "\n\n" + android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.try_arm_version) + ": " + android.ext.i.f999a;
                }
                string = sb.toString();
                if (string.contains("mips")) {
                    str2 = str2 + "\n\n" + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.mips_arch);
                }
                java.lang.String str9 = str2 + "\n\nABIs: " + string + '\n' + ((java.lang.Object) android.ext.e0.f730g) + '\n' + android.os.Build.VERSION.SDK_INT + '\n' + ((java.lang.Object) android.ext.e0.h);
                android.ext.e1.d("Supported ABIs: " + string);
                android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.failed_load_daemon)).setMessage(str9).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null));
                inOut.n(false);
                android.ext.MainService.instance.q0();
            } catch (java.lang.Throwable th6) {
                android.ext.e1.l("start daemon failed", th6);
                android.ext.n2.i(new android.ext.f0.a0.a());
                inOut.n(false);
                android.ext.MainService.instance.q0();
            }
            android.ext.f0.r();
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

        b(byte[] bArr, byte[] bArr2, byte b2, long j, long j2, int i, java.lang.String str) {
            this.f806a = bArr;
            this.f807b = bArr2;
            this.f808c = b2;
            this.f809d = j;
            this.f810e = j2;
            this.f811f = i;
            this.f812g = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            int length = this.f806a.length;
            int length2 = this.f807b.length;
            inOut.q(this.f808c, (byte) 61, 0);
            inOut.v(this.f809d);
            inOut.v(this.f810e);
            inOut.u(this.f811f);
            inOut.u(length);
            inOut.t(this.f806a, length);
            inOut.u(length2);
            inOut.t(this.f807b, length2);
            android.ext.f0.this.t0();
            android.ext.MainService.instance.h0(android.ext.Tools.L1("%s: %s - %s > %s", android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.dump_memory), android.ext.c.G(this.f809d, 4), android.ext.c.G(this.f810e, 4), this.f812g));
        }
    }

    class b0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f813a;

        b0(byte b2) {
            this.f813a = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.f0 f0Var = android.ext.f0.this;
            android.ext.InOut inOut = f0Var.f793b;
            f0Var.L0(this.f813a, (byte) 1);
            android.ext.f0.this.u0(this.f813a, (byte) 45);
            inOut.n(false);
            android.ext.MainService.instance.q0();
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

        c(byte b2, long j, long j2, int i) {
            this.f815a = b2;
            this.f816b = j;
            this.f817c = j2;
            this.f818d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            inOut.q(this.f815a, (byte) 62, 0);
            inOut.v(this.f816b);
            inOut.v(this.f817c);
            inOut.u(this.f818d);
            android.ext.f0.this.t0();
        }
    }

    class c0 implements java.lang.Runnable {
        c0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.MainService.instance.W(android.ext.MainService.instance.Y);
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

        d(byte b2, int i, boolean[] zArr, long j, long j2, double d2, double d3) {
            this.f821a = b2;
            this.f822b = i;
            this.f823c = zArr;
            this.f824d = j;
            this.f825e = j2;
            this.f826f = d2;
            this.f827g = d3;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            inOut.q(this.f821a, (byte) 35, 0);
            inOut.u(this.f822b | 17);
            android.ext.f0.this.W0(this.f823c);
            inOut.w(this.f824d);
            inOut.w(this.f825e);
            inOut.w(java.lang.Double.doubleToRawLongBits(this.f826f));
            inOut.w(java.lang.Double.doubleToRawLongBits(this.f827g));
            android.ext.f0.this.t0();
        }
    }

    class d0 extends android.ext.g0 {

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ byte[] f829a;

            a(byte[] bArr) {
                this.f829a = bArr;
            }

            @Override // java.lang.Runnable
            public void run() throws java.lang.Throwable {
                try {
                    android.ext.f0.this.h0(this.f829a);
                } catch (java.io.IOException e2) {
                    android.ext.e1.l("Failed process message: " + ((int) this.f829a[0]) + ' ' + this.f829a.length, e2);
                }
            }
        }

        class b implements java.lang.Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                android.ext.f0.this.g0();
            }
        }

        d0(java.lang.String str) {
            super(str);
        }

        private void a(byte[] bArr) {
            try {
                java.util.concurrent.Exchanger exchanger = android.ext.f0.this.f794c;
                while (!java.lang.Thread.interrupted()) {
                    try {
                        exchanger.exchange(bArr, 500L, java.util.concurrent.TimeUnit.MILLISECONDS);
                        return;
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            } catch (java.lang.Throwable th) {
                android.ext.e1.l("handleMemoryItem failed", th);
            }
        }

        private void b(byte[] bArr) {
            if (bArr[0] == 20 && bArr[1] == 0) {
                a(bArr);
            } else {
                android.ext.n2.d().post(new android.ext.f0.d0.a(bArr));
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            while (!java.lang.Thread.interrupted()) {
                try {
                    byte[] bArrK = inOut.k();
                    android.ext.f0.B = null;
                    if (bArrK != null) {
                        b(bArrK);
                    }
                } catch (java.lang.Throwable th) {
                    android.ext.e1.l("Read error", th);
                    android.ext.f0.B = th.toString();
                    android.ext.n2.d().post(new android.ext.f0.d0.b());
                    return;
                }
            }
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

        e(byte b2, boolean[] zArr, int i, int i2, long j) {
            this.f832a = b2;
            this.f833b = zArr;
            this.f834c = i;
            this.f835d = i2;
            this.f836e = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            inOut.q(this.f832a, (byte) 35, 0);
            inOut.u(16);
            android.ext.f0.this.W0(this.f833b);
            inOut.u(this.f834c);
            inOut.u(this.f835d);
            inOut.w(this.f836e);
            android.ext.f0.this.t0();
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

        e0(byte b2, int i, int i2, int i3, long j, long j2, long j3, int i4, long j4, int i5, int i6, int i7, double d2, int i8) {
            this.f838a = b2;
            this.f839b = i;
            this.f840c = i2;
            this.f841d = i3;
            this.f842e = j;
            this.f843f = j2;
            this.f844g = j3;
            this.h = i4;
            this.i = j4;
            this.j = i5;
            this.k = i6;
            this.l = i7;
            this.m = d2;
            this.n = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            inOut.q(this.f838a, (byte) 39, 0);
            inOut.u(this.f839b);
            inOut.u(this.f840c);
            inOut.u(this.f841d);
            inOut.w(this.f842e);
            inOut.w(this.f843f);
            inOut.w(this.f844g);
            inOut.u(this.h);
            inOut.w(this.i);
            inOut.u(this.j);
            inOut.u(this.k);
            inOut.u(this.l);
            inOut.w(java.lang.Double.doubleToRawLongBits(this.m));
            inOut.u(this.n);
            android.ext.f0.this.t0();
        }
    }

    class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean[] f847c;

        f(byte b2, int i, boolean[] zArr) {
            this.f845a = b2;
            this.f846b = i;
            this.f847c = zArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            inOut.q(this.f845a, (byte) 35, 0);
            inOut.u(this.f846b | 32);
            android.ext.f0.this.W0(this.f847c);
            android.ext.f0.this.t0();
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

        RunnableC0017f0(int[] iArr, byte b2, long[] jArr) {
            this.f849a = iArr;
            this.f850b = b2;
            this.f851c = jArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            int length = this.f849a.length;
            int i = 0;
            while (i < length) {
                int i2 = length - i;
                if (i2 > 100000000) {
                    i2 = 100000000;
                }
                inOut.q(this.f850b, (byte) 36, (android.ext.InOut.n + 4) * i2);
                inOut.u(i2);
                int i3 = i2 + i;
                while (i < i3) {
                    int i4 = this.f849a[i];
                    if (i4 != 0) {
                        inOut.u(i4);
                        inOut.v(this.f851c[i]);
                    }
                    i++;
                }
                inOut.u(0);
                android.ext.f0.this.t0();
                i = i3;
            }
        }
    }

    class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean[] f855c;

        g(byte b2, int i, boolean[] zArr) {
            this.f853a = b2;
            this.f854b = i;
            this.f855c = zArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            inOut.q(this.f853a, (byte) 35, 0);
            inOut.u(this.f854b | 8);
            android.ext.f0.this.W0(this.f855c);
            android.ext.f0.this.t0();
        }
    }

    class g0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f859c;

        g0(byte b2, long j, int i) {
            this.f857a = b2;
            this.f858b = j;
            this.f859c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            inOut.q(this.f857a, (byte) 50, 0);
            inOut.v(this.f858b);
            inOut.u(this.f859c);
            inOut.s((byte) 0);
            android.ext.f0.this.t0();
        }
    }

    class h implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f863c;

        h(byte b2, long j, int i) {
            this.f861a = b2;
            this.f862b = j;
            this.f863c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.f0 f0Var = android.ext.f0.this;
            android.ext.InOut inOut = f0Var.f793b;
            f0Var.u0(this.f861a, (byte) 58);
            inOut.q(this.f861a, (byte) 59, 0);
            inOut.v(this.f862b);
            inOut.u(this.f863c);
            android.ext.f0.this.t0();
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

        h0(java.lang.String str, java.lang.String str2, byte b2, int i) {
            this.f865a = str;
            this.f866b = str2;
            this.f867c = b2;
            this.f868d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            byte[] bytes = this.f865a.getBytes();
            int length = bytes.length;
            if (length > 255) {
                length = 255;
            }
            java.lang.String str = this.f866b;
            byte[] bytes2 = str == null ? ggd.b.f1513c : str.getBytes();
            int length2 = bytes2.length;
            int i = length2 <= 255 ? length2 : 255;
            inOut.q(this.f867c, (byte) 37, 0);
            inOut.u(this.f868d);
            inOut.s((byte) length);
            inOut.t(bytes, length);
            inOut.s((byte) i);
            inOut.t(bytes2, i);
            android.ext.f0.this.t0();
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

        i(int[] iArr, byte b2, int i, int i2, long j, long j2, long j3, long[] jArr, long[] jArr2) {
            this.f870a = iArr;
            this.f871b = b2;
            this.f872c = i;
            this.f873d = i2;
            this.f874e = j;
            this.f875f = j2;
            this.f876g = j3;
            this.h = jArr;
            this.i = jArr2;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            int length = this.f870a.length;
            android.ext.y yVar = new android.ext.y();
            yVar.a(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.union));
            yVar.a(" = ");
            inOut.q(this.f871b, (byte) 55, 0);
            inOut.u(this.f872c);
            inOut.u(this.f873d);
            inOut.v(this.f874e);
            inOut.v(this.f875f);
            inOut.v(this.f876g);
            inOut.u(length);
            for (int i = 0; i < length; i++) {
                long[] jArr = this.h;
                jArr[i] = android.ext.c.h(jArr[i], this.f870a[i]);
                long[] jArr2 = this.i;
                jArr2[i] = android.ext.c.h(jArr2[i], this.f870a[i]);
                inOut.u(this.f870a[i]);
                inOut.w(this.h[i]);
                inOut.w(this.i[i]);
                java.lang.String strK = android.ext.c.K(0L, this.h[i], this.f870a[i]);
                if ((this.f870a[i] & 805306368) != 0) {
                    strK = strK + '~' + android.ext.c.K(0L, this.i[i], this.f870a[i]);
                }
                if ((this.f870a[i] & 268435456) != 0) {
                    strK = "≠ " + strK;
                }
                if (i != 0) {
                    yVar.a("; ");
                }
                yVar.a(android.ext.Tools.t(strK + ((java.lang.Object) android.ext.c.A(this.f870a[i])), android.ext.c.n(this.f870a[i])));
            }
            android.ext.f0.this.t0();
            yVar.a(" :");
            if ((this.f872c & 4194304) != 0) {
                yVar.a(":");
            }
            yVar.a(android.ext.Tools.L1("%,d", java.lang.Integer.valueOf(this.f873d)));
            android.ext.MainService.instance.h0(yVar.d());
            android.ext.f0.w = false;
        }
    }

    class i0 implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f878b;

        i0(byte[] bArr, byte b2) {
            this.f877a = bArr;
            this.f878b = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            int length = this.f877a.length;
            inOut.q(this.f878b, (byte) 48, length + 4);
            inOut.u(length);
            inOut.t(this.f877a, length);
            android.ext.f0.this.t0();
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

        j(byte b2, long j, long j2, int i, long j3, long j4, long j5) {
            this.f880a = b2;
            this.f881b = j;
            this.f882c = j2;
            this.f883d = i;
            this.f884e = j3;
            this.f885f = j4;
            this.f886g = j5;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            inOut.q(this.f880a, (byte) 63, 0);
            inOut.v(this.f881b);
            inOut.v(this.f882c);
            inOut.u(this.f883d);
            inOut.v(this.f884e);
            inOut.v(this.f885f);
            inOut.v(this.f886g);
            android.ext.f0.this.t0();
            android.ext.f0.w = false;
        }
    }

    static class j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long[] f887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int[] f888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f889c;

        public j0(long[] jArr, int[] iArr) {
            this.f887a = jArr;
            this.f888b = iArr;
        }
    }

    class k implements android.content.DialogInterface.OnClickListener {
        k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.ConfigListAdapter.b();
        }
    }

    private static class k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.ext.c f891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f892b;

        public k0(android.ext.c cVar, int i) {
            this.f891a = cVar;
            this.f892b = i;
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

        l(byte b2, short s, int i, long j, long j2, long j3) {
            this.f893a = b2;
            this.f894b = s;
            this.f895c = i;
            this.f896d = j;
            this.f897e = j2;
            this.f898f = j3;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            inOut.q(this.f893a, (byte) 64, 0);
            inOut.u(this.f894b);
            inOut.u(this.f895c);
            inOut.v(this.f896d);
            inOut.v(this.f897e);
            inOut.v(this.f898f);
            android.ext.f0.this.t0();
            android.ext.f0.w = false;
        }
    }

    private static class l0 extends java.lang.Exception {
        public l0(java.lang.String str) {
            super(str);
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

        m(byte b2, int i, long j, long j2, long j3, byte[] bArr) {
            this.f900a = b2;
            this.f901b = i;
            this.f902c = j;
            this.f903d = j2;
            this.f904e = j3;
            this.f905f = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            inOut.q(this.f900a, (byte) 34, 0);
            inOut.u(this.f901b);
            inOut.v(this.f902c);
            inOut.v(this.f903d);
            inOut.v(this.f904e);
            inOut.u(this.f905f.length);
            byte[] bArr = this.f905f;
            inOut.t(bArr, bArr.length);
            android.ext.f0.this.t0();
            android.ext.f0.w = false;
        }
    }

    static class m0 implements java.lang.Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f908b;

        public m0(long j, int i) {
            this.f907a = j;
            this.f908b = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(android.ext.f0.m0 m0Var) {
            long j = this.f907a;
            long j2 = m0Var.f907a;
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
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

        n(byte b2, long j, long j2, int i, int i2, long j3, long j4, long j5) {
            this.f909a = b2;
            this.f910b = j;
            this.f911c = j2;
            this.f912d = i;
            this.f913e = i2;
            this.f914f = j3;
            this.f915g = j4;
            this.h = j5;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            inOut.q(this.f909a, (byte) 38, 0);
            inOut.w(this.f910b);
            inOut.w(this.f911c);
            inOut.u(this.f912d);
            inOut.u(this.f913e);
            inOut.v(this.f914f);
            inOut.v(this.f915g);
            inOut.v(this.h);
            android.ext.f0.this.t0();
            android.ext.f0.w = (this.f913e & Integer.MIN_VALUE) != 0;
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
        }
    }

    class o implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Object[] f920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f921b;

        o(java.lang.Object[] objArr, byte b2) {
            this.f920a = objArr;
            this.f921b = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.c cVar;
            int i;
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            int length = this.f920a.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = length - i2;
                if (i3 > 100000000) {
                    i3 = 100000000;
                }
                inOut.q(this.f921b, (byte) 43, (android.ext.InOut.n + 16) * i3);
                inOut.u(i3);
                int i4 = i3 + i2;
                while (i2 < i4) {
                    java.lang.Object obj = this.f920a[i2];
                    if (obj instanceof android.ext.f0.k0) {
                        android.ext.f0.k0 k0Var = (android.ext.f0.k0) obj;
                        cVar = k0Var.f891a;
                        i = k0Var.f892b;
                    } else {
                        cVar = (android.ext.c) obj;
                        i = 0;
                    }
                    int i5 = cVar.f674c;
                    if (i5 != 0) {
                        inOut.u(i5);
                        inOut.v(cVar.f672a);
                        inOut.w(cVar.f673b);
                        inOut.u(i);
                    }
                    i2++;
                }
                inOut.u(0);
                android.ext.f0.this.t0();
                i2 = i4;
            }
        }
    }

    class p implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.h2[] f923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f924b;

        p(android.ext.h2[] h2VarArr, byte b2) {
            this.f923a = h2VarArr;
            this.f924b = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            int length = this.f923a.length;
            int i = 0;
            while (i < length) {
                int i2 = length - i;
                if (i2 > 100000000) {
                    i2 = 100000000;
                }
                inOut.q(this.f924b, (byte) 40, (android.ext.InOut.n + 29) * i2);
                int i3 = i2 + i;
                while (i < i3) {
                    android.ext.h2 h2Var = this.f923a[i];
                    int i4 = h2Var.f674c;
                    if (i4 != 0) {
                        inOut.u(i4);
                        inOut.v(h2Var.f672a);
                        inOut.w(h2Var.f673b);
                        inOut.s(h2Var.n);
                        inOut.w(h2Var.o);
                        inOut.w(h2Var.p);
                    }
                    i++;
                }
                inOut.u(0);
                android.ext.f0.this.t0();
                i = i3;
            }
        }
    }

    class q implements java.lang.Runnable {

        class a implements android.content.DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_hide_from_game).f42d = 0;
                android.ext.Config.k();
            }
        }

        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.bad_settings)).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.freeze_lags)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.fix_it), new android.ext.f0.q.a()).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.skip), (android.content.DialogInterface.OnClickListener) null));
        }
    }

    class r implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.h2[] f928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f929b;

        r(android.ext.h2[] h2VarArr, byte b2) {
            this.f928a = h2VarArr;
            this.f929b = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            int length = this.f928a.length;
            int i = 0;
            while (i < length) {
                int i2 = length - i;
                if (i2 > 100000000) {
                    i2 = 100000000;
                }
                inOut.q(this.f929b, (byte) 41, (android.ext.InOut.n + 4) * i2);
                int i3 = i2 + i;
                while (i < i3) {
                    android.ext.h2 h2Var = this.f928a[i];
                    int i4 = h2Var.f674c;
                    if (i4 != 0) {
                        inOut.u(i4);
                        inOut.v(h2Var.f672a);
                    }
                    i++;
                }
                inOut.u(0);
                android.ext.f0.this.t0();
                i = i3;
            }
        }
    }

    class s implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.f0.j0 f931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f932b;

        s(android.ext.f0.j0 j0Var, byte b2) {
            this.f931a = j0Var;
            this.f932b = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            int length = this.f931a.f887a.length;
            int i = 0;
            while (i < length) {
                int i2 = length - i;
                if (i2 > 100000000) {
                    i2 = 100000000;
                }
                inOut.q(this.f932b, (byte) 33, (android.ext.InOut.n + 4) * i2);
                inOut.u(i2);
                android.ext.f0.j0 j0Var = this.f931a;
                int[] iArr = j0Var.f888b;
                long[] jArr = j0Var.f887a;
                int i3 = i2 + i;
                while (i < i3) {
                    inOut.u(iArr[i]);
                    inOut.v(jArr[i]);
                    i++;
                }
                android.ext.f0.this.t0();
                i = i3;
            }
        }
    }

    class t implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.f0.j0 f934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f935b;

        t(android.ext.f0.j0 j0Var, byte b2) {
            this.f934a = j0Var;
            this.f935b = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            int length = this.f934a.f887a.length;
            int i = 0;
            while (i < length) {
                int i2 = length - i;
                if (i2 > 100000000) {
                    i2 = 100000000;
                }
                inOut.q(this.f935b, (byte) 52, (android.ext.InOut.n + 4) * i2);
                inOut.u(i2);
                android.ext.f0.j0 j0Var = this.f934a;
                int[] iArr = j0Var.f888b;
                long[] jArr = j0Var.f887a;
                int i3 = i2 + i;
                while (i < i3) {
                    inOut.u(iArr[i]);
                    inOut.v(jArr[i]);
                    i++;
                }
                android.ext.f0.this.t0();
                i = i3;
            }
        }
    }

    class u implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f938b;

        u(byte b2, byte b3) {
            this.f937a = b2;
            this.f938b = b3;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            inOut.q(this.f937a, (byte) 53, 0);
            inOut.s(this.f938b);
            android.ext.f0.this.t0();
        }
    }

    class v implements java.lang.Runnable {
        v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.os.Handler handlerC = android.ext.n2.c();
            handlerC.removeCallbacks(this);
            if (android.ext.f0.this.e0()) {
                handlerC.postDelayed(this, 1000L);
            }
        }
    }

    class w implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.String f943c;

        w(byte b2, byte[] bArr, java.lang.String str) {
            this.f941a = b2;
            this.f942b = bArr;
            this.f943c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            inOut.q(this.f941a, (byte) 54, 0);
            inOut.u(android.ext.Config.h);
            inOut.u(android.ext.Config.A);
            inOut.w(android.ext.Config.j);
            inOut.u(android.ext.Config.m);
            inOut.u(android.ext.Config.i);
            inOut.u(this.f942b.length);
            byte[] bArr = this.f942b;
            inOut.t(bArr, bArr.length);
            long jE = inOut.e();
            android.ext.f0 f0Var = android.ext.f0.this;
            if (jE != f0Var.t) {
                f0Var.t = jE;
                f0Var.t0();
                android.ext.e1.d("Sended config: " + android.ext.Config.h + ' ' + java.lang.Integer.toBinaryString(android.ext.Config.A) + ' ' + java.lang.Long.toBinaryString(android.ext.Config.j) + ' ' + android.ext.Config.m + ' ' + android.ext.Config.i + ' ' + this.f943c + "; " + this.f942b.length);
            }
        }
    }

    class x implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f945a;

        x(byte b2) {
            this.f945a = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.InOut inOut = android.ext.f0.this.f793b;
            inOut.q(this.f945a, (byte) 47, 0);
            inOut.u(android.os.Process.myPid());
            inOut.u(android.ext.f0.this.f797f);
            android.ext.f0.this.t0();
        }
    }

    class y implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte f947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte f948b;

        y(byte b2, byte b3) {
            this.f947a = b2;
            this.f948b = b3;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.f0.this.f793b.q(this.f947a, this.f948b, 0);
            android.ext.f0.this.t0();
        }
    }

    class z implements java.lang.Runnable {
        z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.f0.this.g0();
        }
    }

    private int A(byte b2) {
        android.ext.h2[] h2VarArr;
        java.util.ArrayList arrayList = this.s;
        synchronized (arrayList) {
            h2VarArr = (android.ext.h2[]) arrayList.toArray(new android.ext.h2[arrayList.size()]);
            arrayList.clear();
            arrayList.trimToSize();
        }
        int length = h2VarArr.length;
        if (length != 0) {
            android.ext.n2.j(new android.ext.f0.r(h2VarArr, b2));
        }
        return length;
    }

    private boolean[] I(int i2) {
        return (i2 == 1 ? android.ext.MainService.instance.o0 : android.ext.MainService.instance.n0).b();
    }

    private java.lang.String[] K(boolean z2, java.lang.String str, java.io.File file) {
        java.lang.String[] strArr = new java.lang.String[5];
        strArr[0] = str;
        strArr[1] = android.ext.Tools.C0();
        strArr[2] = file.getAbsolutePath();
        strArr[3] = T();
        strArr[4] = android.ext.Config.C ? "1" : "0";
        if (z2) {
            return strArr;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("exec");
        for (int i2 = 0; i2 < 5; i2++) {
            java.lang.String str2 = strArr[i2];
            sb.append(' ');
            sb.append(str2);
        }
        return new java.lang.String[]{sb.toString()};
    }

    static android.ext.f0.j0 M0(java.util.List list, boolean z2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.ext.c cVar = (android.ext.c) list.get(i2);
            if (cVar != null) {
                arrayList.add(new android.ext.f0.m0(android.ext.e.a(cVar.f672a, z2), cVar.f674c));
            }
        }
        android.ext.f0.m0[] m0VarArr = (android.ext.f0.m0[]) arrayList.toArray(new android.ext.f0.m0[arrayList.size()]);
        java.util.Arrays.sort(m0VarArr);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(m0VarArr.length);
        android.ext.f0.m0 m0Var = null;
        for (android.ext.f0.m0 m0Var2 : m0VarArr) {
            if (m0Var2 != null) {
                if (m0Var == null || m0Var.f907a != m0Var2.f907a) {
                    arrayList2.add(m0Var2);
                    m0Var = m0Var2;
                } else {
                    m0Var.f908b = m0Var2.f908b | m0Var.f908b;
                }
            }
        }
        int size2 = arrayList2.size();
        long[] jArr = new long[size2];
        int[] iArr = new int[size2];
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            android.ext.f0.m0 m0Var3 = (android.ext.f0.m0) arrayList2.get(i4);
            jArr[i4] = m0Var3.f907a;
            int i5 = m0Var3.f908b;
            iArr[i4] = i5;
            i3 |= i5;
        }
        android.ext.f0.j0 j0Var = new android.ext.f0.j0(jArr, iArr);
        j0Var.f889c = i3 & 127;
        return j0Var;
    }

    private void R0() {
        this.f795d = false;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x030c A[Catch: all -> 0x033e, TryCatch #17 {all -> 0x033e, blocks: (B:151:0x02e9, B:152:0x0303, B:155:0x030c, B:159:0x0339, B:158:0x0317, B:162:0x0342), top: B:217:0x02e9 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0316  */
    /* JADX WARN: Code duplicated, block: B:158:0x0317 A[Catch: all -> 0x033e, TryCatch #17 {all -> 0x033e, blocks: (B:151:0x02e9, B:152:0x0303, B:155:0x030c, B:159:0x0339, B:158:0x0317, B:162:0x0342), top: B:217:0x02e9 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0367 A[Catch: all -> 0x0392, TryCatch #13 {all -> 0x0392, blocks: (B:163:0x034b, B:165:0x0367, B:178:0x0395, B:168:0x0370, B:170:0x037b, B:172:0x0381, B:174:0x038d, B:179:0x0398), top: B:210:0x034b }] */
    /* JADX WARN: Code duplicated, block: B:167:0x036f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0370 A[Catch: all -> 0x0392, TryCatch #13 {all -> 0x0392, blocks: (B:163:0x034b, B:165:0x0367, B:178:0x0395, B:168:0x0370, B:170:0x037b, B:172:0x0381, B:174:0x038d, B:179:0x0398), top: B:210:0x034b }] */
    /* JADX WARN: Code duplicated, block: B:170:0x037b A[Catch: all -> 0x0392, TryCatch #13 {all -> 0x0392, blocks: (B:163:0x034b, B:165:0x0367, B:178:0x0395, B:168:0x0370, B:170:0x037b, B:172:0x0381, B:174:0x038d, B:179:0x0398), top: B:210:0x034b }] */
    /* JADX WARN: Code duplicated, block: B:231:0x0395 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static java.lang.String S0(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.io.File file;
        java.lang.String str5;
        java.lang.String string;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String strTrim;
        java.lang.StringBuilder sb;
        int i2;
        java.lang.String str10;
        java.lang.String string2;
        int i3;
        java.lang.String str11;
        java.io.File file2;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14 = str;
        java.lang.String str15 = "\n";
        try {
            java.io.File file3 = new java.io.File(str14);
            if (!file3.exists() || !file3.canExecute()) {
                return null;
            }
            java.lang.String name = file3.getName();
            int i4 = 5;
            java.lang.String[] strArr = {"/system/bin", "/system/xbin", "/sbin/.magisk/mirror/data", "/sbin/.magisk/modules", "/sbin"};
            int i5 = 0;
            while (true) {
                java.lang.String str16 = "exit";
                str3 = "; chmod 0755 ";
                if (i5 < i4) {
                    try {
                        java.io.File file4 = new java.io.File(strArr[i5], name);
                        if (file4.exists() && file4.canExecute() && file3.length() == file4.length()) {
                            return file4.getAbsolutePath();
                        }
                        i5++;
                        i4 = 5;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        str4 = "/sbin";
                        str15 = "\n";
                        file = file3;
                        str3 = "; chmod 0755 ";
                        string = null;
                        str14 = str14;
                        str5 = "exit";
                    }
                } else {
                    try {
                        java.lang.String[] strArrSplit = android.ext.e2.n("exec mount", 10).split("\n");
                        int length = strArrSplit.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length) {
                                str6 = null;
                                str7 = null;
                                break;
                            }
                            int i7 = length;
                            java.lang.String str17 = strArrSplit[i6];
                            if (str17 != null && str17.contains(" /system ")) {
                                java.lang.String[] strArrSplit2 = str17.trim().split(" ");
                                int length2 = strArrSplit2.length;
                                int i8 = 0;
                                java.lang.String str18 = null;
                                while (true) {
                                    if (i8 >= length2) {
                                        strTrim = null;
                                        break;
                                    }
                                    java.lang.String[] strArr2 = strArrSplit2;
                                    strTrim = strArrSplit2[i8].trim();
                                    int i9 = length2;
                                    if (!"on".equals(strTrim) && !"type".equals(strTrim) && !"/system".equals(strTrim)) {
                                        if (str18 != null) {
                                            break;
                                        }
                                        str18 = strTrim;
                                    }
                                    i8++;
                                    length2 = i9;
                                    strArrSplit2 = strArr2;
                                }
                                str7 = strTrim;
                                str6 = str18;
                                break;
                            }
                            i6++;
                            length = i7;
                            strArrSplit = strArrSplit;
                        }
                        if (str6 == null) {
                            return null;
                        }
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        str4 = "/sbin";
                        file = file3;
                        try {
                            java.lang.String[] strArr3 = new java.lang.String[2];
                            try {
                                strArr3[0] = "rw";
                                strArr3[1] = "ro";
                                int i10 = 0;
                                for (int i11 = 2; i10 < i11; i11 = 2) {
                                    try {
                                        java.lang.String str19 = strArr3[i10];
                                        java.lang.String[] strArr4 = strArr3;
                                        str8 = str16;
                                        try {
                                            java.lang.String[] strArr5 = new java.lang.String[4];
                                            try {
                                                strArr5[0] = "";
                                                strArr5[1] = "/system/bin/";
                                                int i12 = i10;
                                                strArr5[2] = "/system/xbin/";
                                                strArr5[3] = "/system/sbin/";
                                                int i13 = 0;
                                                for (int i14 = 4; i13 < i14; i14 = 4) {
                                                    try {
                                                        java.lang.String str20 = strArr5[i13];
                                                        str9 = str3;
                                                        java.lang.String[] strArr6 = strArr5;
                                                        try {
                                                            java.lang.String[] strArr7 = new java.lang.String[2];
                                                            try {
                                                                strArr7[0] = str19 + ",remount";
                                                                strArr7[1] = "remount," + str19;
                                                                int i15 = 0;
                                                                while (i15 < 2) {
                                                                    java.lang.String str21 = strArr7[i15];
                                                                    java.lang.String[] strArr8 = strArr7;
                                                                    java.lang.String[] strArr9 = {null, str7};
                                                                    java.lang.String str22 = str7;
                                                                    int i16 = 0;
                                                                    for (int i17 = 2; i16 < i17; i17 = 2) {
                                                                        java.lang.String str23 = strArr9[i16];
                                                                        sb2.append(str20);
                                                                        java.lang.String str24 = str20;
                                                                        sb2.append("mount -o ");
                                                                        sb2.append(str21);
                                                                        if (str23 != null) {
                                                                            sb2.append(" -t ");
                                                                            sb2.append(str23);
                                                                        }
                                                                        sb2.append(" ");
                                                                        sb2.append(str6);
                                                                        sb2.append(" /system; ");
                                                                        i16++;
                                                                        str20 = str24;
                                                                    }
                                                                    i15++;
                                                                    str7 = str22;
                                                                    strArr7 = strArr8;
                                                                }
                                                                i13++;
                                                                strArr5 = strArr6;
                                                                str3 = str9;
                                                            } catch (java.lang.Throwable th2) {
                                                                th = th2;
                                                                str14 = str;
                                                                str15 = "\n";
                                                                str5 = str8;
                                                                str3 = str9;
                                                                string = null;
                                                                android.ext.e1.l("Failed remount 2 " + str14 + str15 + string, th);
                                                                sb = new java.lang.StringBuilder();
                                                                i2 = 0;
                                                                while (i2 < 5) {
                                                                    str12 = strArr[i2];
                                                                    str13 = str4;
                                                                    if (!str12.startsWith(str13)) {
                                                                        java.io.File file5 = new java.io.File(str12, name);
                                                                        sb.append("cp -f ");
                                                                        sb.append(str14);
                                                                        sb.append(" ");
                                                                        sb.append(file5.getAbsolutePath());
                                                                        sb.append(str3);
                                                                        sb.append(file5.getAbsolutePath());
                                                                        sb.append("; ");
                                                                    }
                                                                    i2++;
                                                                    str4 = str13;
                                                                }
                                                                str10 = str4;
                                                                sb.append(str5);
                                                                string2 = sb.toString();
                                                                java.lang.String str25 = string2 + str15 + android.ext.e2.n(string2, 15);
                                                                for (i3 = 0; i3 < 5; i3++) {
                                                                    str11 = strArr[i3];
                                                                    if (!str11.startsWith(str10)) {
                                                                        file2 = new java.io.File(str11, name);
                                                                        if (file2.exists()) {
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                                android.ext.e1.i("Failed remount 3 " + str14 + str15 + str25);
                                                                return null;
                                                            }
                                                        } catch (java.lang.Throwable th3) {
                                                            th = th3;
                                                            str14 = str;
                                                            str15 = "\n";
                                                            str5 = str8;
                                                            str3 = str9;
                                                            string = null;
                                                            android.ext.e1.l("Failed remount 2 " + str14 + str15 + string, th);
                                                            sb = new java.lang.StringBuilder();
                                                            i2 = 0;
                                                            while (i2 < 5) {
                                                                str12 = strArr[i2];
                                                                str13 = str4;
                                                                if (!str12.startsWith(str13)) {
                                                                    java.io.File file6 = new java.io.File(str12, name);
                                                                    sb.append("cp -f ");
                                                                    sb.append(str14);
                                                                    sb.append(" ");
                                                                    sb.append(file6.getAbsolutePath());
                                                                    sb.append(str3);
                                                                    sb.append(file6.getAbsolutePath());
                                                                    sb.append("; ");
                                                                }
                                                                i2++;
                                                                str4 = str13;
                                                            }
                                                            str10 = str4;
                                                            sb.append(str5);
                                                            string2 = sb.toString();
                                                            java.lang.String str26 = string2 + str15 + android.ext.e2.n(string2, 15);
                                                            while (i3 < 5) {
                                                                str11 = strArr[i3];
                                                                if (!str11.startsWith(str10)) {
                                                                    file2 = new java.io.File(str11, name);
                                                                    if (file2.exists()) {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            android.ext.e1.i("Failed remount 3 " + str14 + str15 + str26);
                                                            return null;
                                                        }
                                                    } catch (java.lang.Throwable th4) {
                                                        th = th4;
                                                        str9 = str3;
                                                    }
                                                }
                                                java.lang.String str27 = str7;
                                                java.lang.String str28 = str3;
                                                try {
                                                    sb2.append("blockdev --set");
                                                    sb2.append(str19);
                                                    sb2.append(" ");
                                                    sb2.append(str6);
                                                    sb2.append("; ");
                                                    if (str19.equals("rw")) {
                                                        int i18 = 0;
                                                        while (i18 < 5) {
                                                            java.lang.String str29 = strArr[i18];
                                                            if (str29.startsWith("/system")) {
                                                                java.io.File file7 = new java.io.File(str29, name);
                                                                sb2.append("cp -f ");
                                                                str14 = str;
                                                                try {
                                                                    sb2.append(str14);
                                                                    sb2.append(" ");
                                                                    sb2.append(file7.getAbsolutePath());
                                                                    str3 = str28;
                                                                    try {
                                                                        sb2.append(str3);
                                                                        sb2.append(file7.getAbsolutePath());
                                                                        sb2.append("; ");
                                                                    } catch (java.lang.Throwable th5) {
                                                                        th = th5;
                                                                        str15 = "\n";
                                                                        str5 = str8;
                                                                        string = null;
                                                                        android.ext.e1.l("Failed remount 2 " + str14 + str15 + string, th);
                                                                        sb = new java.lang.StringBuilder();
                                                                        i2 = 0;
                                                                        while (i2 < 5) {
                                                                            str12 = strArr[i2];
                                                                            str13 = str4;
                                                                            if (!str12.startsWith(str13)) {
                                                                                java.io.File file8 = new java.io.File(str12, name);
                                                                                sb.append("cp -f ");
                                                                                sb.append(str14);
                                                                                sb.append(" ");
                                                                                sb.append(file8.getAbsolutePath());
                                                                                sb.append(str3);
                                                                                sb.append(file8.getAbsolutePath());
                                                                                sb.append("; ");
                                                                            }
                                                                            i2++;
                                                                            str4 = str13;
                                                                        }
                                                                        str10 = str4;
                                                                        sb.append(str5);
                                                                        string2 = sb.toString();
                                                                        java.lang.String str210 = string2 + str15 + android.ext.e2.n(string2, 15);
                                                                        while (i3 < 5) {
                                                                            str11 = strArr[i3];
                                                                            if (!str11.startsWith(str10)) {
                                                                                file2 = new java.io.File(str11, name);
                                                                                if (file2.exists()) {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                        android.ext.e1.i("Failed remount 3 " + str14 + str15 + str210);
                                                                        return null;
                                                                    }
                                                                } catch (java.lang.Throwable th6) {
                                                                    th = th6;
                                                                    str3 = str28;
                                                                    str15 = "\n";
                                                                    str5 = str8;
                                                                    string = null;
                                                                    android.ext.e1.l("Failed remount 2 " + str14 + str15 + string, th);
                                                                    sb = new java.lang.StringBuilder();
                                                                    i2 = 0;
                                                                    while (i2 < 5) {
                                                                        str12 = strArr[i2];
                                                                        str13 = str4;
                                                                        if (!str12.startsWith(str13)) {
                                                                            java.io.File file9 = new java.io.File(str12, name);
                                                                            sb.append("cp -f ");
                                                                            sb.append(str14);
                                                                            sb.append(" ");
                                                                            sb.append(file9.getAbsolutePath());
                                                                            sb.append(str3);
                                                                            sb.append(file9.getAbsolutePath());
                                                                            sb.append("; ");
                                                                        }
                                                                        i2++;
                                                                        str4 = str13;
                                                                    }
                                                                    str10 = str4;
                                                                    sb.append(str5);
                                                                    string2 = sb.toString();
                                                                    java.lang.String str211 = string2 + str15 + android.ext.e2.n(string2, 15);
                                                                    while (i3 < 5) {
                                                                        str11 = strArr[i3];
                                                                        if (!str11.startsWith(str10)) {
                                                                            file2 = new java.io.File(str11, name);
                                                                            if (file2.exists()) {
                                                                                continue;
                                                                            }
                                                                        }
                                                                    }
                                                                    android.ext.e1.i("Failed remount 3 " + str14 + str15 + str211);
                                                                    return null;
                                                                }
                                                            } else {
                                                                str3 = str28;
                                                            }
                                                            i18++;
                                                            str28 = str3;
                                                        }
                                                    }
                                                    i10 = i12 + 1;
                                                    str14 = str;
                                                    str3 = str28;
                                                    str7 = str27;
                                                    strArr3 = strArr4;
                                                    str16 = str8;
                                                } catch (java.lang.Throwable th7) {
                                                    th = th7;
                                                    str14 = str;
                                                }
                                            } catch (java.lang.Throwable th8) {
                                                th = th8;
                                                str14 = str14;
                                                str3 = str3;
                                            }
                                        } catch (java.lang.Throwable th9) {
                                            th = th9;
                                            str15 = "\n";
                                            str5 = str8;
                                            string = null;
                                            android.ext.e1.l("Failed remount 2 " + str14 + str15 + string, th);
                                            sb = new java.lang.StringBuilder();
                                            i2 = 0;
                                            while (i2 < 5) {
                                                str12 = strArr[i2];
                                                str13 = str4;
                                                if (!str12.startsWith(str13)) {
                                                    java.io.File file10 = new java.io.File(str12, name);
                                                    sb.append("cp -f ");
                                                    sb.append(str14);
                                                    sb.append(" ");
                                                    sb.append(file10.getAbsolutePath());
                                                    sb.append(str3);
                                                    sb.append(file10.getAbsolutePath());
                                                    sb.append("; ");
                                                }
                                                i2++;
                                                str4 = str13;
                                            }
                                            str10 = str4;
                                            sb.append(str5);
                                            string2 = sb.toString();
                                            java.lang.String str212 = string2 + str15 + android.ext.e2.n(string2, 15);
                                            while (i3 < 5) {
                                                str11 = strArr[i3];
                                                if (!str11.startsWith(str10)) {
                                                    file2 = new java.io.File(str11, name);
                                                    if (file2.exists()) {
                                                        continue;
                                                    }
                                                }
                                            }
                                            android.ext.e1.i("Failed remount 3 " + str14 + str15 + str212);
                                            return null;
                                        }
                                    } catch (java.lang.Throwable th10) {
                                        th = th10;
                                        str8 = str16;
                                    }
                                }
                                str14 = str14;
                                str3 = str3;
                                str5 = str16;
                                try {
                                    sb2.append(str5);
                                    string = sb2.toString();
                                    try {
                                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                        sb3.append(string);
                                        str15 = "\n";
                                        try {
                                            sb3.append(str15);
                                            sb3.append(android.ext.e2.n(string, 15));
                                            string = sb3.toString();
                                            for (int i19 = 0; i19 < 5; i19++) {
                                                java.io.File file11 = new java.io.File(strArr[i19], name);
                                                if (file11.exists() && file11.canExecute() && file.length() == file11.length()) {
                                                    return file11.getAbsolutePath();
                                                }
                                            }
                                            android.ext.e1.i("Failed remount 1 " + str14 + str15 + string);
                                            break;
                                        } catch (java.lang.Throwable th11) {
                                            th = th11;
                                            android.ext.e1.l("Failed remount 2 " + str14 + str15 + string, th);
                                        }
                                    } catch (java.lang.Throwable th12) {
                                        th = th12;
                                        str15 = "\n";
                                    }
                                } catch (java.lang.Throwable th13) {
                                    th = th13;
                                    str15 = "\n";
                                    string = null;
                                }
                            } catch (java.lang.Throwable th14) {
                                th = th14;
                                str5 = "exit";
                            }
                        } catch (java.lang.Throwable th15) {
                            th = th15;
                            str14 = str14;
                            str15 = "\n";
                            str3 = "; chmod 0755 ";
                            str5 = "exit";
                        }
                    } catch (java.lang.Throwable th16) {
                        th = th16;
                        str4 = "/sbin";
                        file = file3;
                    }
                    str5 = "exit";
                    string = null;
                }
                try {
                    android.ext.e1.l("Failed remount 2 " + str14 + str15 + string, th);
                } catch (java.lang.Throwable th17) {
                    th = th17;
                    str2 = string;
                }
            }
            sb = new java.lang.StringBuilder();
            i2 = 0;
            while (i2 < 5) {
                str12 = strArr[i2];
                str13 = str4;
                if (!str12.startsWith(str13)) {
                    java.io.File file12 = new java.io.File(str12, name);
                    sb.append("cp -f ");
                    sb.append(str14);
                    sb.append(" ");
                    sb.append(file12.getAbsolutePath());
                    sb.append(str3);
                    sb.append(file12.getAbsolutePath());
                    sb.append("; ");
                }
                i2++;
                str4 = str13;
            }
            str10 = str4;
            sb.append(str5);
            string2 = sb.toString();
            try {
                java.lang.String str213 = string2 + str15 + android.ext.e2.n(string2, 15);
                while (i3 < 5) {
                    str11 = strArr[i3];
                    if (!str11.startsWith(str10)) {
                        file2 = new java.io.File(str11, name);
                        if (file2.exists() && file2.canExecute() && file.length() == file2.length()) {
                            return file2.getAbsolutePath();
                        }
                    }
                }
                android.ext.e1.i("Failed remount 3 " + str14 + str15 + str213);
                return null;
            } catch (java.lang.Throwable th18) {
                th = th18;
                str2 = string2;
            }
        } catch (java.lang.Throwable th19) {
            th = th19;
            str14 = str14;
            str15 = "\n";
            str2 = null;
        }
        android.ext.e1.l("Failed remount 4 " + str14 + str15 + str2, th);
        return null;
    }

    public static java.lang.String T() {
        return android.ext.w0.a(android.ext.h0.c(), "S!H!A!-!3!8!4".replace("!", ""));
    }

    private void c0() {
        android.ext.MainService.instance.Q();
        android.ext.MainService.instance.l();
    }

    private static boolean j(android.ext.f0.n0 n0Var, java.io.File file) throws java.io.IOException {
        boolean z2 = false;
        if (n0Var == null || n0Var.f916a == null) {
            return false;
        }
        java.io.InputStream inputStream = n0Var.f918c;
        boolean z3 = k(n0Var.f919d, "android-daemon err") && k(inputStream, "android-daemon out");
        if (!android.ext.Config.C && z3) {
            new android.ext.g2().putInt("root-ok", (int) (((1 * 16338.7f) - 183.7f) + 0.5f)).commit();
        }
        if (z3) {
            int i2 = inputStream.read();
            if (i2 == 49 || i2 == 48) {
                inputStream.read();
            }
            if (i2 == 49) {
                try {
                    java.io.OutputStream outputStream = n0Var.f917b;
                    try {
                        android.ext.e1.d("IF 0");
                        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(new java.io.File(file, "o"));
                        android.ext.e1.d("IF 1");
                        java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(new java.io.File(file, "e"));
                        android.ext.e1.d("IF 2");
                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(new java.io.File(file, "i"));
                        android.ext.e1.d("IF 3");
                        n0Var.f917b = fileOutputStream;
                        n0Var.f918c = fileInputStream;
                        n0Var.f919d = fileInputStream2;
                        z2 = true;
                    } catch (java.lang.Throwable th) {
                        android.ext.e1.l("Fifo fail", th);
                    }
                    outputStream.write(z2 ? 89 : 78);
                    outputStream.write(10);
                    outputStream.flush();
                    android.ext.InOut.o = z2;
                } catch (java.lang.Throwable th2) {
                    android.ext.e1.l("Fifo fail 2", th2);
                }
            } else if (i2 != 48) {
                android.ext.e1.p("Odd fifo: " + i2);
            }
        }
        return z3;
    }

    private static boolean k(java.io.InputStream inputStream, java.lang.String str) throws java.io.IOException {
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[4096];
        android.ext.e1.d("Start: " + str);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                break;
            }
            byte b2 = (byte) i4;
            if (i2 >= 4096) {
                break;
            }
            int i5 = i2 + 1;
            bArr[i2] = b2;
            if (b2 == bytes[i3]) {
                i3++;
                if (i3 == bytes.length) {
                    android.ext.e1.d("Good: " + str);
                    return true;
                }
            } else {
                i3 = 0;
            }
            if (inputStream.available() == 0) {
                for (int i6 = 0; i6 < 30; i6++) {
                    try {
                        java.lang.Thread.sleep(100L);
                    } catch (java.lang.InterruptedException unused) {
                    }
                    if (inputStream.available() != 0) {
                        break;
                    }
                }
            }
            if (inputStream.available() == 0) {
                android.ext.e2.f745a += "No more data: " + i5 + '\n';
                i2 = i5;
                break;
            }
            i2 = i5;
        }
        java.lang.String str2 = "Fail: '" + str + "' " + i2 + " '" + new java.lang.String(bArr, 0, i2) + '\'';
        android.ext.e2.f745a += str2 + '\n';
        android.ext.e1.d(str2);
        return false;
    }

    public static void m0(java.lang.Runnable runnable) {
        java.util.List list = z;
        synchronized (list) {
            try {
                if (A) {
                    list.add(runnable);
                } else {
                    new android.ext.g0(runnable, "runAfterDaemonStart").start();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    static void r() {
        java.util.List list = z;
        synchronized (list) {
            try {
                A = false;
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    new android.ext.g0((java.lang.Runnable) it.next(), "waitForDaemonStart").start();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private int u(byte b2) {
        java.lang.Object[] array;
        java.util.ArrayList arrayList = this.q;
        synchronized (arrayList) {
            array = arrayList.toArray(new java.lang.Object[arrayList.size()]);
            arrayList.clear();
            arrayList.trimToSize();
        }
        int length = array.length;
        if (length != 0) {
            android.ext.n2.j(new android.ext.f0.o(array, b2));
        }
        return length;
    }

    private void v() {
        if (this.f795d && this.f796e > 0) {
            java.io.File file = new java.io.File(android.ext.Tools.q0(), "stop.tmp");
            try {
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                fileOutputStream.write(java.nio.ByteBuffer.allocate(4).order(java.nio.ByteOrder.LITTLE_ENDIAN).putInt(this.f796e).array());
                fileOutputStream.close();
                if (file.renameTo(new java.io.File(android.ext.Tools.q0(), "stop"))) {
                    return;
                }
                android.ext.e1.s("Failed rename stop file: " + file, new java.lang.RuntimeException());
                this.f795d = false;
                file.delete();
            } catch (java.io.IOException e2) {
                android.ext.e1.s("Failed make stop file: " + file, e2);
                this.f795d = false;
            }
        }
    }

    private int y(byte b2) {
        android.ext.h2[] h2VarArr;
        java.util.ArrayList arrayList = this.r;
        synchronized (arrayList) {
            h2VarArr = (android.ext.h2[]) arrayList.toArray(new android.ext.h2[arrayList.size()]);
            arrayList.clear();
            arrayList.trimToSize();
        }
        int length = h2VarArr.length;
        if (length != 0) {
            android.ext.n2.j(new android.ext.f0.p(h2VarArr, b2));
            if ((android.ext.Config.A & 128) != 0 && !x) {
                x = true;
                android.ext.n2.i(new android.ext.f0.q());
            }
        }
        return length;
    }

    private void y0(byte b2, long j2, long j3, int i2, int i3, long j4, long j5, long j6) {
        long jH = android.ext.c.h(j2, i3);
        long jH2 = android.ext.c.h(j3, i3);
        android.ext.e1.d("sendSearchNumber: " + jH + "; " + jH2 + " x" + i2 + " as " + java.lang.Integer.toHexString(i3) + " in " + java.lang.Long.toHexString(j4) + '-' + java.lang.Long.toHexString(j5) + ", " + java.lang.Long.toString(j6));
        android.ext.n2.j(new android.ext.f0.n(b2, jH, jH2, i2, i3, j4, j5, j6));
        android.ext.i2.l = null;
    }

    private void z0(byte b2, long j2, long j3, int i2, long j4, long j5, long j6) {
        y0(b2, j2, j3, 0, i2, j4, j5, j6);
    }

    public void A0(byte b2, java.lang.String str) {
        byte[] bytes = str.getBytes();
        if (bytes.length == 0) {
            return;
        }
        if (bytes.length <= 4000) {
            android.ext.n2.j(new android.ext.f0.i0(bytes, b2));
            return;
        }
        android.ext.e1.i("path big: " + bytes.length + " > 4000");
    }

    public void B() {
        C((byte) 0);
    }

    public void B0(java.lang.String str) {
        A0((byte) 0, str);
    }

    public void C(byte b2) {
        if (u(b2) + y(b2) + A(b2) > 0) {
            android.ext.MainService.instance.F0();
        }
    }

    public void C0(byte b2, int i2, java.lang.String str, java.lang.String str2) {
        android.ext.n2.j(new android.ext.f0.h0(str, str2, b2, i2));
        x0(b2);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[PHI: r6
      0x008c: PHI (r6v5 java.lang.String) = (r6v4 java.lang.String), (r6v17 java.lang.String), (r6v18 java.lang.String) binds: [B:40:0x00a9, B:37:0x009b, B:31:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    public void D(byte b2, long j2, long j3, int i2, int i3, int i4, long j4, long j5, long j6) {
        java.lang.String str;
        int i5;
        java.lang.String strF;
        java.lang.String strF2;
        boolean z2;
        java.lang.String strReplace;
        int i6 = i2 & 127;
        java.lang.CharSequence charSequenceV = android.ext.c.v(i6);
        boolean z3 = (i2 & 8388608) != 0;
        boolean z4 = !z3 && j2 == 0;
        java.lang.String strK = android.ext.c.K(0L, j2, i6);
        if (z3) {
            strK = strK + '~' + android.ext.c.K(0L, j3, i6);
        }
        if (i3 == 67108864) {
            str = "N > O+D";
            if (z4) {
                i5 = catch_.me_.if_.you_.can_.R.string.fuzzy_larger;
                strF = android.ext.b2.f(i5);
            } else {
                strF = str;
            }
            strF2 = strF;
            z2 = false;
        } else if (i3 == 134217728) {
            str = "N < O+D";
            if (z4) {
                i5 = catch_.me_.if_.you_.can_.R.string.fuzzy_smaller;
                strF = android.ext.b2.f(i5);
            } else {
                strF = str;
            }
            strF2 = strF;
            z2 = false;
        } else if (i3 != 268435456) {
            if (this.i == 0) {
                this.i = i4;
            }
            this.h = i4 - 1;
            this.j = j4;
            this.k = j5;
            this.l = j6;
            str = "N = O+D";
            strF2 = z4 ? android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.fuzzy_equal) : "N = O+D";
            z2 = true;
        } else {
            str = "N ≠ O+D";
            if (z4) {
                i5 = catch_.me_.if_.you_.can_.R.string.fuzzy_inequal;
                strF = android.ext.b2.f(i5);
            } else {
                strF = str;
            }
            strF2 = strF;
            z2 = false;
        }
        if (z4) {
            strReplace = strF2 + " (" + str.replace("+D", "") + ')';
        } else {
            strReplace = strF2.replace("+D", " + (" + strK + ')');
        }
        java.lang.CharSequence charSequenceD = new android.ext.y().b("%s %s", strReplace, charSequenceV).d();
        if (z2) {
            android.ext.MainService.instance.i0(charSequenceD, -1L, 1L, this.i - this.h, this.i, 0L);
        } else {
            android.ext.MainService.instance.h0(charSequenceD);
        }
        z0(b2, j2, j3, i2 | Integer.MIN_VALUE | i3, j4, j5, j6);
    }

    public void D0(int i2, java.lang.String str, java.lang.String str2) {
        C0((byte) 0, i2, str, str2);
    }

    public void E(long j2, long j3, int i2, int i3, int i4, long j4, long j5, long j6) {
        D((byte) 0, j2, j3, i2, i3, i4, j4, j5, j6);
    }

    public void E0(byte b2) {
        F0(b2, this.n, this.o);
    }

    public void F(byte b2, int i2, long j2, long j3, long j4) {
        android.ext.MainService.instance.h0(new android.ext.y().b("%s %s", android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.search_unknown_value), android.ext.c.v(i2 & 127)).d());
        z0(b2, 0L, 0L, i2 | Integer.MIN_VALUE, j2, j3, j4);
    }

    public void F0(byte b2, int i2, int i3) {
        c0();
        boolean[] zArrI = I(0);
        long j2 = this.p;
        this.n = i2;
        this.o = i3;
        android.ext.n2.j(new android.ext.f0.e(b2, zArrI, i2, i3, j2));
        this.p = 0L;
    }

    public void G() {
        H((byte) 0);
    }

    public void G0(byte b2, int i2) {
        c0();
        android.ext.n2.j(new android.ext.f0.f(b2, i2, I(i2)));
    }

    public void H(byte b2) {
        u0(b2, (byte) 57);
    }

    public void H0(int i2) {
        G0((byte) 0, i2);
    }

    public void I0(byte b2, int i2) {
        c0();
        android.ext.n2.j(new android.ext.f0.g(b2, i2, I(i2)));
    }

    public int J() {
        return this.f796e;
    }

    public void J0(int i2) {
        I0((byte) 0, i2);
    }

    public void K0(byte b2) {
        L0((byte) 0, b2);
    }

    public void L() {
        M((byte) 0);
    }

    public void L0(byte b2, byte b3) {
        android.ext.n2.j(new android.ext.f0.u(b2, b3));
    }

    public void M(byte b2) {
        u0(b2, (byte) 58);
    }

    public void N(byte b2, long j2, int i2) {
        android.ext.n2.j(new android.ext.f0.h(b2, j2, i2));
    }

    public void N0() {
        new android.ext.f0.a0("DaemonLoader").start();
    }

    public void O(long j2, int i2) {
        N((byte) 0, j2, i2);
    }

    public android.ext.f0.n0 O0(java.lang.String str) throws android.ext.f0.l0 {
        java.lang.String strS0;
        try {
            boolean z2 = android.ext.Config.C;
            java.io.File fileQ0 = android.ext.Tools.q0();
            java.lang.String[] strArrK = K(z2, str, fileQ0);
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                java.lang.String[] strArr = {"i", "o", "e"};
                for (int i2 = 0; i2 < 3; i2++) {
                    new java.io.File(fileQ0, strArr[i2]).delete();
                }
                if (z2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("try: direct");
                    for (java.lang.String str2 : strArrK) {
                        sb.append(' ');
                        sb.append(str2);
                    }
                    android.ext.e1.d(sb.toString());
                }
                java.lang.Process processI = z2 ? android.ext.Tools.I(strArrK) : android.ext.e2.r(strArrK[0], null, true);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append("Daemon process: ");
                sb2.append(processI);
                sb2.append("; pid=");
                sb2.append(processI == null ? "n/a" : java.lang.Integer.valueOf(android.ext.Tools.D0(processI)));
                android.ext.e1.d(sb2.toString());
                android.ext.f0.n0 n0Var = new android.ext.f0.n0();
                n0Var.f916a = processI;
                if (processI != null) {
                    n0Var.f917b = processI.getOutputStream();
                    n0Var.f918c = processI.getInputStream();
                    n0Var.f919d = processI.getErrorStream();
                }
                if (j(n0Var, fileQ0)) {
                    y = n0Var;
                    this.f797f = android.ext.Tools.D0(processI);
                    if (!e0()) {
                        break;
                    }
                    android.ext.n2.h(new android.ext.f0.v());
                    return n0Var;
                }
                if (!z3) {
                    java.lang.String strRemoveNewLinesChars = android.ext.Tools.removeNewLinesChars("h{hf#lg");
                    android.ext.e1.d("Test 1 start");
                    if (z2) {
                        strRemoveNewLinesChars = "id";
                    }
                    android.ext.e2.o(strRemoveNewLinesChars, 45, z2 ? "" : null);
                    android.ext.e2.f745a = "";
                    android.ext.e1.d("Test 1 end");
                    android.ext.Tools.q(new java.io.File(str), 493);
                    android.ext.Tools.r(str, "0755");
                    z3 = true;
                } else if (android.ext.Config.C) {
                    if (!z2) {
                        i(str, z3);
                        java.lang.Thread.sleep(1000L);
                        java.lang.String str3 = android.ext.e2.f745a + android.ext.e2.g(processI);
                        android.ext.e2.f745a = str3;
                        android.ext.e1.d(str3);
                        android.ext.r.k = true;
                        android.ext.e1.i("Show error alert");
                        android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.daemon_failed)).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.failed_run_daemon) + "\n\n" + android.ext.e2.f745a).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.exit), new android.ext.p0(400)).setNeutralButton("SU", new android.ext.f0.k()).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.skip), (android.content.DialogInterface.OnClickListener) null));
                        return null;
                    }
                    strArrK = K(false, str, fileQ0);
                    z2 = false;
                } else {
                    if (z4 || (strS0 = S0(str)) == null) {
                        i(str, z3);
                        java.lang.Thread.sleep(1000L);
                        java.lang.String str4 = android.ext.e2.f745a + android.ext.e2.g(processI);
                        android.ext.e2.f745a = str4;
                        android.ext.e1.d(str4);
                        android.ext.r.k = true;
                        android.ext.e1.i("Show error alert");
                        android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.daemon_failed)).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.failed_run_daemon) + "\n\n" + android.ext.e2.f745a).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.exit), new android.ext.p0(400)).setNeutralButton("SU", new android.ext.f0.k()).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.skip), (android.content.DialogInterface.OnClickListener) null));
                        return null;
                    }
                    strArrK = K(z2, strS0, fileQ0);
                    z4 = true;
                }
            }
        } catch (android.ext.f0.l0 e2) {
            throw e2;
        } catch (java.lang.Exception e3) {
            android.ext.e1.l("" + e3.getMessage(), e3);
            android.ext.Tools.J1(e3.getMessage());
        }
        return null;
    }

    public long P(byte b2, long j2, int i2) {
        if (!this.f793b.h()) {
            return -1L;
        }
        android.ext.n2.j(new android.ext.f0.g0(b2, j2, i2));
        java.util.concurrent.Exchanger exchanger = this.f794c;
        while (true) {
            try {
                android.ext.w wVar = new android.ext.w((byte[]) exchanger.exchange(null, 500L, java.util.concurrent.TimeUnit.MILLISECONDS));
                wVar.l(3);
                if (wVar.g() == j2) {
                    wVar.l(4);
                    return wVar.h();
                }
                continue;
            } catch (java.lang.InterruptedException unused) {
            } catch (java.util.concurrent.TimeoutException unused2) {
                return -1L;
            } catch (java.lang.Throwable th) {
                android.ext.e1.l("getMemoryContent failed", th);
                return -1L;
            }
        }
    }

    public void P0() {
        Q0((byte) 0);
    }

    public long Q(long j2, int i2) {
        return P((byte) 0, j2, i2);
    }

    public void Q0(byte b2) {
        android.ext.n2.j(new android.ext.f0.b0(b2));
        try {
            java.lang.Thread.sleep(3L);
        } catch (java.lang.InterruptedException unused) {
        }
    }

    public void R(byte b2, int[] iArr, long[] jArr) {
        if (iArr.length == jArr.length) {
            android.ext.n2.j(new android.ext.f0.RunnableC0017f0(iArr, b2, jArr));
            return;
        }
        throw new java.lang.RuntimeException("Size mismatch: " + iArr.length + " != " + jArr.length);
    }

    public void S(int[] iArr, long[] jArr) {
        R((byte) 0, iArr, jArr);
    }

    public void T0() {
        u0((byte) 0, (byte) 51);
    }

    public void U() {
        V((byte) 0);
    }

    public void U0(byte b2, int i2, long j2, long j3, double d2, double d3) {
        c0();
        android.ext.n2.j(new android.ext.f0.d(b2, i2, I(1), j2, j3, d2, d3));
    }

    public void V(byte b2) {
        u0(b2, (byte) 56);
    }

    public void V0(int i2, long j2, long j3, double d2, double d3) {
        U0((byte) 0, i2, j2, j3, d2, d3);
    }

    public void W() {
        X((byte) 0);
    }

    void W0(boolean[] zArr) {
        android.ext.InOut inOut = this.f793b;
        for (boolean z2 : zArr) {
            inOut.s(z2 ? (byte) 1 : (byte) 0);
        }
    }

    public void X(byte b2) {
        u0(b2, (byte) 60);
    }

    public void Y(byte b2, int i2, int i3, int i4, long j2, long j3, long j4, int i5, long j5, int i6, int i7, int i8, double d2, int i9) {
        android.ext.n2.j(new android.ext.f0.e0(b2, i2, i3, i4, j2, j3, j4, i5, j5, i6, i7, i8, d2, i9));
    }

    public double Z() {
        return ((double) this.n) / ((double) this.o);
    }

    public void a(android.ext.c cVar, int i2) {
        java.lang.Object k0Var = cVar;
        if (i2 != 0) {
            k0Var = new android.ext.f0.k0(cVar, i2);
        }
        synchronized (this.q) {
            this.q.add(k0Var);
        }
    }

    public java.lang.CharSequence a0() {
        int iD0;
        java.lang.String str;
        java.lang.String str2;
        int i2;
        if (this.f793b.h()) {
            if (android.ext.Config.C) {
                iD0 = android.ext.Tools.d0(catch_.me_.if_.you_.can_.R.color.daemon_user);
                str = "$";
            } else if (android.ext.Config.vSpaceReal) {
                iD0 = android.ext.Tools.d0(catch_.me_.if_.you_.can_.R.color.daemon_vroot);
                str = "@";
            } else {
                iD0 = android.ext.Tools.d0(catch_.me_.if_.you_.can_.R.color.daemon_root);
                str = "#";
            }
            return android.ext.Tools.t(str, iD0);
        }
        android.ext.f0.n0 n0Var = this.f792a;
        if (n0Var == null || n0Var.f916a == null) {
            if (android.ext.Config.C) {
                str2 = "!";
            } else {
                str2 = android.ext.Config.vSpaceReal ? "I" : "?";
            }
            i2 = catch_.me_.if_.you_.can_.R.color.daemon_bad;
        } else {
            if (android.ext.Config.C) {
                str2 = "V";
            } else {
                str2 = android.ext.Config.vSpaceReal ? "U" : "W";
            }
            i2 = catch_.me_.if_.you_.can_.R.color.daemon_wait;
        }
        return android.ext.Tools.t(str2, android.ext.Tools.d0(i2));
    }

    public void b(android.ext.h2 h2Var) {
        synchronized (this.r) {
            this.r.add(h2Var);
        }
    }

    public int b0() {
        return this.f797f;
    }

    public void c(android.ext.h2 h2Var) {
        synchronized (this.s) {
            this.s.add(h2Var);
        }
    }

    public void d(byte b2, long j2) {
        this.p += j2;
        E0(b2);
    }

    public boolean d0() {
        boolean z2 = (v || this.f793b.h()) ? false : true;
        if (z2) {
            android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.daemon_fail)).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.wait_daemon)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null));
        }
        return !z2;
    }

    public void e(long j2) {
        d((byte) 0, j2);
    }

    public boolean e0() {
        java.lang.Process process;
        java.lang.Integer numValueOf;
        java.lang.String str;
        java.lang.String string;
        android.ext.f0.n0 n0Var = y;
        if (n0Var == null || (process = n0Var.f916a) == null) {
            return false;
        }
        try {
            numValueOf = java.lang.Integer.valueOf(process.exitValue());
        } catch (java.lang.IllegalThreadStateException unused) {
            numValueOf = null;
        }
        if (numValueOf == null && C == null && B == null) {
            return true;
        }
        if (!android.ext.r.k && !android.ext.f1.f952b) {
            if (numValueOf == null || (!(numValueOf.intValue() == 9 || numValueOf.intValue() == 15 || numValueOf.intValue() == 137) || android.ext.Config.h == 0)) {
                str = null;
            } else {
                android.ext.Config.b(catch_.me_.if_.you_.can_.R.id.config_ram).f42d = 0;
                android.ext.Config.k();
                str = "Found SIGKILL/SIGTERM/SIGKILL_OOM: " + numValueOf;
            }
            if (str != null) {
                android.ext.e1.i(str);
                android.ext.n2.i(new android.ext.f0.c0());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int iD0 = android.ext.Tools.D0(process);
            sb.append('\n');
            sb.append(this.f798g);
            sb.append(" ( ");
            sb.append(android.os.Process.myPid());
            sb.append(" / ");
            sb.append(iD0);
            sb.append(" / ");
            sb.append(this.f796e);
            sb.append(" )\n");
            sb.append(numValueOf);
            sb.append(" / ");
            sb.append(C);
            sb.append(" / ");
            sb.append(B);
            sb.append('\n');
            sb.append(android.ext.MainService.instance.m0 / 1024);
            sb.append(" / ");
            sb.append(android.ext.Tools.r0());
            sb.append(" / ");
            sb.append(android.ext.MainService.instance.l0 / 1024);
            sb.append('\n');
            java.lang.String strH = android.ext.e0.h();
            sb.append(strH);
            sb.append('\n');
            sb.append(android.ext.w0.a(strH, "S$H$A$-$3$8$4".replace("$", "")));
            sb.append('\n');
            java.io.File file = new java.io.File(strH);
            sb.append(file.length());
            sb.append('\n');
            sb.append(android.ext.w0.a(file, "S#H#A#-#3#8#4".replace("#", "")));
            if (numValueOf != null) {
                sb.append("\nOutput:\n");
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(n0Var.f919d));
                while (true) {
                    try {
                        try {
                            java.lang.String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            try {
                                sb.append(line);
                                sb.append('\n');
                            } catch (java.lang.OutOfMemoryError e2) {
                                android.ext.e1.s("Failed get err for daemon exit", e2);
                                sb.append(e2);
                                sb.append('\n');
                            }
                        } catch (java.io.IOException e3) {
                            android.ext.e1.l("checkProcess", e3);
                        }
                    } catch (java.lang.OutOfMemoryError e4) {
                        android.ext.e1.s("Failed get err for daemon exit", e4);
                        sb.append(e4);
                        sb.append('\n');
                    }
                }
            }
            sb.append("\nDEBUG:\n");
            sb.append(android.ext.h0.f(false));
            try {
                string = sb.toString();
            } catch (java.lang.OutOfMemoryError e5) {
                android.ext.e1.s("Failed get string for daemon exit", e5);
                string = e5.toString();
            }
            java.lang.String str2 = string;
            try {
                android.ext.e1.i("Daemon closed" + str2);
            } catch (java.lang.OutOfMemoryError e6) {
                android.ext.e1.s("Failed out string for daemon exit", e6);
            }
            if (!android.ext.n0.d(str2) && str == null) {
                try {
                    if (str2.contains("backtrace:") && str2.contains(this.f798g) && !str2.contains("SIGPIPE")) {
                        android.ext.n0.i(str2);
                    }
                } catch (java.lang.OutOfMemoryError e7) {
                    android.ext.e1.s("Failed send string for daemon exit", e7);
                }
            }
            try {
                str2 = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.daemon_unexpected_closed) + '\n' + str2;
            } catch (java.lang.OutOfMemoryError e8) {
                android.ext.e1.s("Failed out string for daemon exit", e8);
            }
            android.ext.r.k = true;
            android.ext.e1.i("Show error alert");
            android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.daemon_exited)).setMessage(str2).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.exit), new android.ext.p0(500)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.skip), (android.content.DialogInterface.OnClickListener) null));
            this.f793b.n(false);
            android.ext.MainService.instance.q0();
            if (numValueOf != null && (numValueOf.intValue() == 9 || numValueOf.intValue() == 15 || numValueOf.intValue() == 137)) {
                android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.g0(catch_.me_.if_.you_.can_.R.string.daemon_exited)).setMessage(android.ext.b2.f(numValueOf.intValue() == 137 ? catch_.me_.if_.you_.can_.R.string.daemon_killed_oom : catch_.me_.if_.you_.can_.R.string.daemon_killed)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.ok), (android.content.DialogInterface.OnClickListener) null));
            }
        }
        return false;
    }

    public void f(byte b2, long j2, int i2) {
        android.ext.n2.j(new android.ext.f0.a(b2, i2, j2));
    }

    public void f0(byte b2, java.util.List list) {
        android.ext.f0.j0 j0VarM0 = M0(list, android.ext.e0.m());
        if (j0VarM0.f887a.length == 0) {
            return;
        }
        if (j0VarM0.f889c == 0) {
            l(b2);
            return;
        }
        android.ext.n2.j(new android.ext.f0.s(j0VarM0, b2));
        android.ext.MainService.N0(j0VarM0.f889c, b2);
        android.ext.i2.l = null;
    }

    public void g(long j2, int i2) {
        f((byte) 0, j2, i2);
    }

    public void g0() {
        android.ext.e1.d("messageFailed");
        e0();
        android.ext.MainService.instance.s();
    }

    public void h() {
        this.f795d = true;
        v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.ext.f0] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.StringBuilder] */
    void h0(byte[] bArr) throws java.lang.Throwable {
        java.lang.String r15;
        byte b2;
        android.ext.MainService mainService;
        android.ext.TimersEditor timersEditor;
        int i2;
        android.ext.f0 r16 = this;
        byte b3 = 0;
        z = false;
        boolean z2 = false;
        boolean z3 = false;
        try {
            android.ext.w wVar = new android.ext.w(bArr);
            byte bE = wVar.e();
            try {
                byte bE2 = wVar.e();
                try {
                    try {
                        switch (bE) {
                            case 16:
                                b2 = bE;
                                r16 = ", size: ";
                                android.ext.MainService.instance.l0(wVar);
                                break;
                            case 17:
                                long jG = wVar.g();
                                long jG2 = wVar.g();
                                int iF = wVar.f();
                                if (iF == 0 && r16.h > 0 && bE2 == 0) {
                                    long j2 = bE2;
                                    int iD = android.ext.MainService.D() & 127;
                                    int i3 = r16.h;
                                    long j3 = r16.j;
                                    long j4 = r16.k;
                                    long j5 = r16.l;
                                    b2 = bE;
                                    r16 = ", size: ";
                                    E(j2, 0L, iD, 536870912, i3, j3, j4, j5);
                                } else {
                                    b2 = bE;
                                    java.lang.Object obj = ", size: ";
                                    android.ext.MainService.instance.o0(bE2, jG, jG2, iF);
                                    r16 = obj;
                                    if (iF == 0) {
                                        android.ext.MainService.instance.X(bE2, null);
                                        r16 = obj;
                                    }
                                }
                                break;
                            case 18:
                                m();
                                android.ext.MainService.instance.r0();
                                break;
                            case 19:
                                m();
                                android.ext.MainService.instance.k0(wVar.f());
                                break;
                            case 20:
                            default:
                                android.ext.e1.p("Unknown message: " + ((int) bE) + ", size: " + bArr.length);
                                break;
                            case 21:
                                android.ext.MainService.instance.i0(null, wVar.g(), wVar.g(), -1, -1, wVar.g());
                                v();
                                break;
                            case 22:
                                android.ext.MainService.instance.t0.h(wVar);
                                if (bE2 != 0) {
                                    android.ext.Script.C3(wVar);
                                    mainService = android.ext.MainService.instance;
                                    mainService.X(bE2, null);
                                }
                                break;
                            case 23:
                                android.ext.d dVar = android.ext.MainService.instance.u0;
                                new android.ext.d.a();
                                while (true) {
                                    int iF2 = wVar.f();
                                    if (iF2 == 0) {
                                        if (z3) {
                                            android.ext.MainService.instance.e0();
                                        }
                                        break;
                                    } else {
                                        long jG3 = wVar.g();
                                        long jH = wVar.h();
                                        if ((16777216 & iF2) == 0 && dVar.c(jG3, iF2, jH)) {
                                            z3 = true;
                                        }
                                    }
                                }
                                break;
                            case 24:
                                android.ext.z1.o(wVar);
                                break;
                            case 25:
                                if (android.ext.Config.vSpaceReal && !android.ext.Config.C) {
                                    z2 = true;
                                }
                                android.ext.x2.u(wVar, z2);
                                break;
                            case 26:
                                android.ext.MainService.instance.O0(wVar.f(), wVar.f());
                                break;
                            case 27:
                                android.ext.MainService.instance.P0(wVar);
                                break;
                            case 28:
                                int iF3 = wVar.f();
                                int iE = wVar.e();
                                int[] iArr = iE > 0 ? new int[iE] : null;
                                for (int i4 = 0; i4 < iE; i4++) {
                                    iArr[i4] = wVar.f();
                                }
                                android.ext.MainService.instance.p0(bE2, iF3, iArr);
                                if (iF3 == 7) {
                                    R0();
                                }
                                break;
                            case 29:
                                android.ext.RegionList.h(wVar);
                                break;
                            case 30:
                                if (wVar.f() == 1) {
                                    timersEditor = android.ext.MainService.instance.o0;
                                    i2 = 19;
                                } else {
                                    timersEditor = android.ext.MainService.instance.n0;
                                    i2 = 44;
                                }
                                int i5 = i2 * 4;
                                boolean[] zArr = new boolean[i5];
                                for (int i6 = 0; i6 < i5; i6++) {
                                    zArr[i6] = wVar.e() != 0;
                                }
                                timersEditor.i(zArr);
                                mainService = android.ext.MainService.instance;
                                mainService.X(bE2, null);
                                break;
                            case 31:
                                long jG4 = wVar.g();
                                if (bE2 != 0) {
                                    android.ext.Script.Y2(jG4);
                                    mainService = android.ext.MainService.instance;
                                    mainService.X(bE2, null);
                                } else {
                                    android.ext.MainService.instance.h(jG4);
                                }
                                break;
                        }
                    } catch (java.nio.BufferUnderflowException e2) {
                        e = e2;
                        b3 = b2;
                        r15 = r16;
                        android.ext.e1.l("Failed process message: " + b3 + r15 + bArr.length, e);
                    }
                } catch (java.nio.BufferUnderflowException e3) {
                    e = e3;
                    b3 = bE;
                    r15 = ", size: ";
                    android.ext.e1.l("Failed process message: " + b3 + r15 + bArr.length, e);
                }
            } catch (java.nio.BufferUnderflowException e4) {
                e = e4;
                b2 = bE;
                r16 = ", size: ";
            }
        } catch (java.nio.BufferUnderflowException e5) {
            e = e5;
        }
    }

    void i(java.lang.String str, boolean z2) throws android.ext.f0.l0 {
        int i2;
        java.lang.String str2;
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            i2 = catch_.me_.if_.you_.can_.R.string.file_not_found;
        } else if (file.isFile()) {
            java.lang.String[] strArr = {"ls", "-l", android.ext.Tools.F0(str)};
            try {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(android.ext.Tools.I(strArr).getInputStream()));
                android.ext.e1.p("ls for '" + str + "' got: " + bufferedReader.readLine());
                bufferedReader.close();
            } catch (java.lang.Exception e2) {
                android.ext.e1.l("run '" + java.util.Arrays.toString(strArr) + "' error", e2);
            }
            i2 = !file.canExecute() ? catch_.me_.if_.you_.can_.R.string.not_execute : 0;
        } else {
            i2 = catch_.me_.if_.you_.can_.R.string.not_file;
        }
        if (i2 != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(android.ext.Tools.N1(i2));
            sb.append(": '");
            sb.append(str);
            sb.append("'\n\n");
            sb.append(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.check_install));
            if (i2 == catch_.me_.if_.you_.can_.R.string.not_execute) {
                str2 = "\n\n" + android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.sdcard_install);
            } else {
                str2 = "";
            }
            sb.append(str2);
            throw new android.ext.f0.l0(sb.toString());
        }
    }

    public void i0(byte b2, java.util.List list) {
        android.ext.f0.j0 j0VarM0 = M0(list, false);
        if (j0VarM0.f887a.length == 0) {
            return;
        }
        android.ext.n2.j(new android.ext.f0.t(j0VarM0, b2));
    }

    public void j0(java.util.List list) {
        i0((byte) 0, list);
    }

    public void k0() {
        l0((byte) 0);
    }

    public void l(byte b2) {
        u0(b2, (byte) 44);
        android.ext.i2.l = null;
    }

    public void l0(byte b2) {
        this.n = 1;
        this.o = 1;
        this.p = 0L;
        android.ext.y2.i();
        this.f793b.r();
        u0(b2, (byte) 42);
        android.ext.i2.l = null;
    }

    public void m() {
        this.h = 0;
        this.i = 0;
    }

    public void n() {
        o((byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034 A[LOOP:1: B:20:0x0032->B:21:0x0034, LOOP_END] */
    public void n0(byte b2, int i2, int i3, int[] iArr, long[] jArr, long[] jArr2, long j2, long j3, long j4) {
        int length;
        byte[] bArr;
        boolean z2 = (i2 & 4194304) != 0;
        if (z2 && i3 != jArr.length) {
            z2 = false;
        }
        if (z2) {
            for (int i4 : iArr) {
                if (((i4 | i2) & (-4194306)) == 0) {
                }
            }
            if (z2) {
                length = jArr.length;
                bArr = new byte[length];
                for (int i5 = 0; i5 < length; i5++) {
                    bArr[i5] = (byte) jArr[i5];
                }
                s0(b2, 1, bArr, j2, j3, j4);
                return;
            }
        } else if (z2) {
            length = jArr.length;
            bArr = new byte[length];
            while (i5 < length) {
                bArr[i5] = (byte) jArr[i5];
            }
            s0(b2, 1, bArr, j2, j3, j4);
            return;
        }
        android.ext.n2.j(new android.ext.f0.i(iArr, b2, i2, i3, j2, j3, j4, jArr, jArr2));
        android.ext.i2.l = null;
    }

    public void o(byte b2) {
        u0(b2, (byte) 46);
    }

    public void o0(byte b2, long j2, long j3, int i2, long j4, long j5, long j6) {
        android.ext.e1.d("searchMask: " + java.lang.Long.toHexString(j2) + ':' + java.lang.Long.toHexString(j3) + " as " + java.lang.Integer.toHexString(i2) + " in " + java.lang.Long.toHexString(j4) + '-' + java.lang.Long.toHexString(j5) + ", " + java.lang.Long.toString(j6));
        gga.e eVarB = android.ext.c.B();
        java.lang.CharSequence charSequence = null;
        for (int i3 = 0; i3 < eVarB.size(); i3++) {
            int iKeyAt = eVarB.keyAt(i3);
            if (iKeyAt != 0 && (i2 & iKeyAt) == iKeyAt) {
                charSequence = (java.lang.CharSequence) eVarB.valueAt(i3);
            }
        }
        java.lang.String hexString = java.lang.Long.toHexString(j2);
        java.util.Locale locale = java.util.Locale.US;
        java.lang.String upperCase = hexString.toUpperCase(locale);
        java.lang.String upperCase2 = java.lang.Long.toHexString(j3).toUpperCase(locale);
        if (upperCase.length() < upperCase2.length()) {
            upperCase = new java.lang.String(new char[upperCase2.length() - upperCase.length()]).replace((char) 0, '0') + upperCase;
        } else if (upperCase.length() > upperCase2.length()) {
            upperCase2 = new java.lang.String(new char[upperCase.length() - upperCase2.length()]).replace((char) 0, '0') + upperCase2;
        }
        android.ext.MainService.instance.h0(new android.ext.y().b("%s %s %s; %s: %s; %s: %s", android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.address), charSequence, upperCase, android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.mask), upperCase2, android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.type), android.ext.c.v(i2 & 127)).d());
        android.ext.n2.j(new android.ext.f0.j(b2, j2, j3, i2, j4, j5, j6));
        android.ext.i2.l = null;
    }

    public void p(byte b2, long j2, long j3, int i2) {
        android.ext.n2.j(new android.ext.f0.c(b2, j2, j3, i2));
    }

    public void p0(byte b2, long j2, int i2, int i3, long j3, long j4, long j5) {
        java.lang.CharSequence charSequence;
        gga.e eVarB = android.ext.c.B();
        if ((i3 & 33554432) != 0) {
            charSequence = "" + eVarB.get(536870912) + '*';
        } else {
            java.lang.CharSequence charSequence2 = null;
            for (int i4 = 0; i4 < eVarB.size(); i4++) {
                int iKeyAt = eVarB.keyAt(i4);
                if (iKeyAt != 0 && (i3 & iKeyAt) == iKeyAt) {
                    charSequence2 = (java.lang.CharSequence) eVarB.valueAt(i4);
                }
            }
            charSequence = charSequence2;
        }
        android.ext.c cVar = new android.ext.c(0L, j2, i3 & 127);
        android.ext.y yVar = new android.ext.y();
        java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[3];
        charSequenceArr[0] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.value);
        charSequenceArr[1] = charSequence;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = cVar.J();
        objArr[1] = i2 != 0 ? " X" + i2 : "";
        objArr[2] = cVar.u();
        charSequenceArr[2] = android.ext.Tools.t(android.ext.Tools.L1("%s%s %s", objArr), cVar.m());
        yVar.b("%s %s %s", charSequenceArr);
        android.ext.MainService.instance.h0(yVar.d());
        y0(b2, j2, 0L, i2, i3, j3, j4, j5);
    }

    public void q(long j2, long j3, int i2) {
        p((byte) 0, j2, j3, i2);
    }

    public void q0(byte b2, short s2, int i2, long j2, long j3, long j4) {
        java.lang.String hexString = java.lang.Integer.toHexString(s2);
        android.ext.e1.d("searchPointer: " + hexString + " as " + java.lang.Integer.toHexString(i2) + " in " + java.lang.Long.toHexString(j2) + '-' + java.lang.Long.toHexString(j3) + ", " + java.lang.Long.toString(j4));
        android.ext.MainService mainService = android.ext.MainService.instance;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("-> ");
        sb.append(hexString);
        mainService.h0(sb.toString());
        android.ext.n2.j(new android.ext.f0.l(b2, s2, i2, j2, j3, j4));
        android.ext.i2.l = null;
    }

    public void r0(byte b2, long j2, long j3, int i2, int i3, long j4, long j5, long j6) {
        gga.e eVarB = android.ext.c.B();
        int i4 = (i3 & 33554432) != 0 ? i3 & (-33554433) : i3;
        java.lang.CharSequence charSequence = null;
        for (int i5 = 0; i5 < eVarB.size(); i5++) {
            int iKeyAt = eVarB.keyAt(i5);
            if (iKeyAt != 0 && (i4 & iKeyAt) == iKeyAt) {
                charSequence = (java.lang.CharSequence) eVarB.valueAt(i5);
            }
        }
        int i6 = i4 & 127;
        android.ext.c cVar = new android.ext.c(0L, j2, i6);
        android.ext.c cVar2 = new android.ext.c(0L, j3, i6);
        android.ext.y yVar = new android.ext.y();
        java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[3];
        charSequenceArr[0] = android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.value);
        charSequenceArr[1] = charSequence;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = cVar.J();
        objArr[1] = cVar2.J();
        objArr[2] = i2 == 0 ? "" : " X" + i2;
        objArr[3] = cVar.u();
        charSequenceArr[2] = android.ext.Tools.t(android.ext.Tools.L1("%s ~ %s%s %s", objArr), cVar.m());
        yVar.b("%s %s %s", charSequenceArr);
        android.ext.MainService.instance.h0(yVar.d());
        y0(b2, j2, j3, i2, i4 | 8388608, j4, j5, j6);
    }

    public void s() {
        t((byte) 0);
    }

    public void s0(byte b2, int i2, byte[] bArr, long j2, long j3, long j4) {
        java.lang.String string = android.ext.x0.b(null, i2, bArr, bArr.length, true, true, null).toString();
        if (string.length() > 48) {
            string = string.substring(0, 48) + "...";
        }
        android.ext.e1.d("searchText: [" + bArr.length + "] = " + string + " in " + java.lang.Long.toHexString(j2) + '-' + java.lang.Long.toHexString(j3) + ", " + java.lang.Long.toString(j4));
        if (bArr.length == 0) {
            return;
        }
        if (bArr.length == 1) {
            p0(b2, bArr[0], 0, 536870913, j2, j3, j4);
            return;
        }
        android.ext.MainService.instance.h0(android.ext.Tools.L1("%s[%d] = %s", android.ext.Tools.N1(catch_.me_.if_.you_.can_.R.string.text), java.lang.Integer.valueOf(bArr.length), string));
        android.ext.n2.j(new android.ext.f0.m(b2, i2, j2, j3, j4, bArr));
        android.ext.i2.l = null;
    }

    public void t(byte b2) {
        u0(b2, (byte) 49);
    }

    void t0() {
        android.ext.InOut inOut = this.f793b;
        if (C != null) {
            android.ext.e1.i("Last send error: " + C);
            inOut.d();
            return;
        }
        try {
            inOut.l();
            C = null;
        } catch (java.lang.Throwable th) {
            inOut.d();
            android.ext.e1.l("Send error", th);
            C = th.toString();
            android.ext.n2.d().post(new android.ext.f0.z());
        }
    }

    void u0(byte b2, byte b3) {
        android.ext.n2.j(new android.ext.f0.y(b2, b3));
    }

    void v0(byte b2) {
        android.ext.n2.j(new android.ext.f0.x(b2));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x004b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x006e, please report this as an issue */
    public void w(byte b2, long j2, long j3, int i2, java.lang.String str, java.lang.String str2) {
        java.lang.String string;
        java.lang.StringBuilder sb;
        java.lang.String strReplace;
        byte[] bytes;
        byte[] bytes2;
        if (!str.contains("/emulated/legacy")) {
            if (str.contains("/emulated/0")) {
                sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append('|');
                strReplace = str.replace("/emulated/0", "/emulated/legacy");
            } else {
                string = str;
            }
            bytes = string.getBytes();
            if (bytes.length == 0) {
                return;
            }
            if (bytes.length > 4000) {
                android.ext.e1.i("path big: " + bytes.length + " > 4000");
                return;
            }
            bytes2 = str2.getBytes();
            if (bytes2.length > 4000) {
                android.ext.n2.j(new android.ext.f0.b(bytes, bytes2, b2, j2, j3, i2, str));
                return;
            }
            android.ext.e1.i("pkg big: " + bytes2.length + " > 4000");
        }
        sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append('|');
        strReplace = str.replace("/emulated/legacy", "/emulated/0");
        sb.append(strReplace);
        string = sb.toString();
        bytes = string.getBytes();
        if (bytes.length == 0) {
            return;
        }
        if (bytes.length > 4000) {
            android.ext.e1.i("path big: " + bytes.length + " > 4000");
            return;
        }
        bytes2 = str2.getBytes();
        if (bytes2.length > 4000) {
            android.ext.n2.j(new android.ext.f0.b(bytes, bytes2, b2, j2, j3, i2, str));
            return;
        }
        android.ext.e1.i("pkg big: " + bytes2.length + " > 4000");
    }

    public void w0() {
        x0((byte) 0);
    }

    public void x(long j2, long j3, int i2, java.lang.String str, java.lang.String str2) {
        w((byte) 0, j2, j3, i2, str, str2);
    }

    public void x0(byte b2) {
        if (this.u == null || android.ext.Config.h != this.u.intValue()) {
            if (this.u != null) {
                android.ext.MainService.instance.m();
            }
            this.u = java.lang.Integer.valueOf(android.ext.Config.h);
        }
        java.lang.String absolutePath = android.ext.Tools.q0().getAbsolutePath();
        android.ext.n2.j(new android.ext.f0.w(b2, absolutePath.getBytes(), absolutePath));
    }

    public void z() {
        this.f793b.r();
        if (this.f796e <= 0) {
            return;
        }
        java.io.File file = new java.io.File(android.ext.Tools.q0(), "OOM.tmp");
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            fileOutputStream.write(java.nio.ByteBuffer.allocate(4).order(java.nio.ByteOrder.LITTLE_ENDIAN).putInt(this.f796e).array());
            fileOutputStream.close();
            if (file.renameTo(new java.io.File(android.ext.Tools.q0(), "OOM"))) {
                return;
            }
            android.ext.e1.s("Failed rename OOM file: " + file, new java.lang.RuntimeException());
            file.delete();
        } catch (java.io.IOException e2) {
            android.ext.e1.s("Failed make OOM file: " + file, e2);
        }
    }
}
