package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class r extends a.a implements android.view.View.OnClickListener {
    public static volatile boolean k = false;
    public static volatile boolean l = true;
    public static volatile boolean m = false;
    public static volatile android.ext.r n = null;
    public static volatile android.content.Context o = null;
    public static volatile android.content.Context p = null;
    public static volatile boolean q = true;
    private static volatile boolean r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile boolean f1206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f1207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.ref.WeakReference f1208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.lang.ref.WeakReference f1209g;
    private java.lang.ref.WeakReference h;
    private java.lang.StringBuilder i;
    private java.lang.Runnable j;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.os.Bundle f1211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.r f1212c;

        a(android.ext.r r1, android.os.Bundle r2) {
                r0 = this;
                r0.f1212c = r1
                r0.f1211b = r2
                r0.<init>()
                r1 = 0
                r0.f1210a = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r1 = ": 1200"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.ext.e1.d(r0)
                boolean r0 = r2.f1210a
                if (r0 == 0) goto L2d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r1 = ": already"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.ext.e1.d(r0)
                return
            L2d:
                r0 = 1
                r2.f1210a = r0
                android.ext.r r0 = r2.f1212c
                android.os.Bundle r1 = r2.f1211b
                r0.F(r1)
                return
        }
    }

    class b implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f1213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.r f1214b;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.r.b f1215a;

            a(android.ext.r.b r1) {
                    r0 = this;
                    r0.f1215a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r3, int r4) {
                    r2 = this;
                    android.content.Context r3 = android.ext.r.p     // Catch: java.lang.Throwable -> L17
                    android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L17
                    java.lang.String r0 = "android.intent.action.VIEW"
                    java.lang.String r1 = "kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2"
                    java.lang.String r1 = android.ext.Tools.removeNewLinesChars(r1)     // Catch: java.lang.Throwable -> L17
                    android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L17
                    r4.<init>(r0, r1)     // Catch: java.lang.Throwable -> L17
                    r3.startActivity(r4)     // Catch: java.lang.Throwable -> L17
                    goto L1d
                L17:
                    r3 = move-exception
                    java.lang.String r4 = "Failed call activity"
                    android.ext.e1.s(r4, r3)
                L1d:
                    android.ext.p0 r3 = new android.ext.p0
                    r4 = 1400(0x578, float:1.962E-42)
                    r3.<init>(r4)
                    r4 = 0
                    r0 = 0
                    r3.onClick(r4, r0)
                    return
            }
        }

        b(android.ext.r r1, java.lang.Runnable r2) {
                r0 = this;
                r0.f1214b = r1
                r0.f1213a = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r2, int r3) {
                r1 = this;
                if (r3 != 0) goto L8
                java.lang.Runnable r2 = r1.f1213a
                r2.run()
                goto L43
            L8:
                r2 = 1
                r0 = 0
                if (r3 != r2) goto L38
                android.content.Context r2 = android.ext.r.p
                android.app.AlertDialog$Builder r2 = android.ext.f.c(r2)
                r3 = 2131296684(0x7f0901ac, float:1.8211292E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                android.app.AlertDialog$Builder r2 = r2.setMessage(r3)
                android.app.AlertDialog$Builder r2 = r2.setCancelable(r0)
                r3 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                android.ext.r$b$a r0 = new android.ext.r$b$a
                r0.<init>(r1)
                android.app.AlertDialog$Builder r2 = r2.setPositiveButton(r3, r0)
                android.ext.f.o(r2)
                android.ext.r.h()
                goto L43
            L38:
                android.ext.p0 r2 = new android.ext.p0
                r3 = 1500(0x5dc, float:2.102E-42)
                r2.<init>(r3)
                r3 = 0
                r2.onClick(r3, r0)
            L43:
                return
        }
    }

    class c implements android.content.DialogInterface.OnClickListener {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r3, int r4) {
                r2 = this;
                android.content.Context r3 = android.ext.r.p     // Catch: java.lang.Throwable -> L13
                android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L13
                java.lang.String r0 = "android.intent.action.VIEW"
                java.lang.String r1 = "https://support.google.com/android/answer/6088895"
                android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L13
                r4.<init>(r0, r1)     // Catch: java.lang.Throwable -> L13
                r3.startActivity(r4)     // Catch: java.lang.Throwable -> L13
                goto L19
            L13:
                r3 = move-exception
                java.lang.String r4 = "Failed call activity"
                android.ext.e1.s(r4, r3)
            L19:
                return
        }
    }

    class d implements java.lang.Runnable {
        d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.ext.MainService r0 = android.ext.MainService.instance
                r0.e1()
                return
        }
    }

    class e implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.r f1216a;

        e(android.ext.r r1) {
                r0 = this;
                r0.f1216a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r3, int r4) {
                r2 = this;
                r3 = 1
                r0 = 0
                switch(r4) {
                    case 0: goto L96;
                    case 1: goto L88;
                    case 2: goto L7d;
                    case 3: goto L69;
                    case 4: goto L58;
                    case 5: goto L4d;
                    case 6: goto L47;
                    case 7: goto L3f;
                    case 8: goto L3b;
                    case 9: goto L37;
                    case 10: goto L33;
                    case 11: goto L28;
                    case 12: goto L1d;
                    case 13: goto L12;
                    case 14: goto L7;
                    default: goto L5;
                }
            L5:
                goto L9b
            L7:
                r3 = 2131034183(0x7f050047, float:1.7678876E38)
                android.ext.Config$p r3 = android.ext.Config.b(r3)
                r3.b()
                return
            L12:
                r3 = 2131034214(0x7f050066, float:1.767894E38)
                android.ext.Config$p r3 = android.ext.Config.b(r3)
                r3.b()
                return
            L1d:
                r3 = 2131034150(0x7f050026, float:1.767881E38)
                android.ext.Config$p r3 = android.ext.Config.b(r3)
                r3.b()
                return
            L28:
                r3 = 2131034186(0x7f05004a, float:1.7678882E38)
                android.ext.Config$p r3 = android.ext.Config.b(r3)
                r3.b()
                return
            L33:
                android.ext.r.O()
                return
            L37:
                android.ext.r.H()
                return
            L3b:
                android.ext.ConfigListAdapter.b()
                return
            L3f:
                r3 = 0
                android.ext.Config.f30c = r3
            L43:
                android.ext.Config.k()
                goto L9b
            L47:
                android.ext.r r3 = r2.f1216a
                r3.T()
                return
            L4d:
                r3 = 2131034169(0x7f050039, float:1.7678848E38)
                android.ext.Config$p r3 = android.ext.Config.b(r3)
                r3.b()
                return
            L58:
                r4 = 2131034210(0x7f050062, float:1.7678931E38)
                android.ext.Config$p r4 = android.ext.Config.b(r4)
                int r1 = android.ext.Config.B
                r1 = r1 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L66
            L65:
                r3 = 0
            L66:
                r4.f42d = r3
                goto L43
            L69:
                r3 = 2131034165(0x7f050035, float:1.767884E38)
                android.ext.Config$p r3 = android.ext.Config.b(r3)
                r4 = -1
                r3.f42d = r4
                r3 = 2131034164(0x7f050034, float:1.7678838E38)
                android.ext.Config$p r3 = android.ext.Config.b(r3)
                r3.f42d = r4
                goto L43
            L7d:
                android.ext.z r3 = new android.ext.z
                android.ext.r r4 = r2.f1216a
                r3.<init>(r4)
                r3.J()
                return
            L88:
                r4 = 2131034402(0x7f050122, float:1.767932E38)
                android.ext.Config$p r4 = android.ext.Config.b(r4)
                int r1 = android.ext.Config.A
                r1 = r1 & 4
                if (r1 == 0) goto L66
                goto L65
            L96:
                boolean r3 = android.ext.m2.f1074a
                android.ext.r0.d(r3)
            L9b:
                android.ext.r.I()
                return
        }
    }

    class f implements android.ext.Config.p.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.Config.p f1217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.r f1218b;

        f(android.ext.r r1, android.ext.Config.p r2) {
                r0 = this;
                r0.f1218b = r1
                r0.f1217a = r2
                r0.<init>()
                return
        }

        @Override // android.ext.Config.p.b
        public void a(int r2) {
                r1 = this;
                android.ext.Config$p r2 = r1.f1217a
                r0 = 0
                r2.g(r0)
                android.ext.r.I()
                return
        }
    }

    class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f1219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.r f1220b;

        g(android.ext.r r1, java.lang.String r2) {
                r0 = this;
                r0.f1220b = r1
                r0.f1219a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r10 = this;
                java.lang.String r0 = "/emulated/0"
                java.lang.String r1 = "chmod 0644 "
                r2 = 2131296417(0x7f0900a1, float:1.821075E38)
                r3 = 2131296886(0x7f090276, float:1.8211701E38)
                java.lang.String r4 = android.ext.r.v()     // Catch: java.lang.Throwable -> L5a
                java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L5a
                r5.<init>(r4)     // Catch: java.lang.Throwable -> L5a
                java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5a
                r6.<init>(r5)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r7 = r10.f1219a     // Catch: java.lang.Throwable -> L5a
                android.ext.r.U(r6, r4, r7)     // Catch: java.lang.Throwable -> L5a
                r7 = 420(0x1a4, float:5.89E-43)
                android.ext.Tools.q(r5, r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r5.<init>()     // Catch: java.lang.Throwable -> L5a
                r5.append(r1)     // Catch: java.lang.Throwable -> L5a
                r5.append(r4)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r7 = " 2>&1 ; logcat -v threadtime -b main -b system *:V 2>&1 ; exit\n"
                r5.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5a
                boolean r7 = r4.contains(r0)     // Catch: java.lang.Throwable -> L5a
                if (r7 == 0) goto L5d
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r7.<init>()     // Catch: java.lang.Throwable -> L5a
                r7.append(r1)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r1 = "/emulated/legacy"
                java.lang.String r0 = r4.replace(r0, r1)     // Catch: java.lang.Throwable -> L5a
                r7.append(r0)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r0 = " 2>&1 ; "
                r7.append(r0)     // Catch: java.lang.Throwable -> L5a
                r7.append(r5)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L5a
                goto L5d
            L5a:
                r0 = move-exception
                goto Le7
            L5d:
                java.lang.Process r0 = android.ext.e2.q(r5)     // Catch: java.lang.Throwable -> L5a
                java.io.InputStream r1 = r0.getInputStream()     // Catch: java.lang.Throwable -> L5a
                r5 = 8192(0x2000, float:1.148E-41)
                byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L5a
                boolean r7 = android.ext.Tools.Z0(r0)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r8 = ": "
                if (r7 != 0) goto L8b
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r7.<init>()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r9 = android.ext.b2.f(r3)     // Catch: java.lang.Throwable -> L5a
                r7.append(r9)     // Catch: java.lang.Throwable -> L5a
                r7.append(r8)     // Catch: java.lang.Throwable -> L5a
                r7.append(r4)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L5a
            L87:
                android.ext.Tools.J1(r4)     // Catch: java.lang.Throwable -> L5a
                goto La6
            L8b:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r4.<init>()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r7 = android.ext.b2.f(r3)     // Catch: java.lang.Throwable -> L5a
                r4.append(r7)     // Catch: java.lang.Throwable -> L5a
                r4.append(r8)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r7 = android.ext.b2.f(r2)     // Catch: java.lang.Throwable -> L5a
                r4.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5a
                goto L87
            La6:
                boolean r4 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5a
                if (r4 != 0) goto Lc3
                int r4 = r1.read(r5)     // Catch: java.lang.Throwable -> L5a
                if (r4 <= 0) goto Lba
                r7 = 0
                r6.write(r5, r7, r4)     // Catch: java.lang.Throwable -> L5a
                r6.flush()     // Catch: java.lang.Throwable -> L5a
                goto La6
            Lba:
                r7 = -1
                if (r4 != r7) goto La6
                boolean r4 = android.ext.Tools.Z0(r0)     // Catch: java.lang.Throwable -> L5a
                if (r4 == 0) goto La6
            Lc3:
                r6.close()     // Catch: java.lang.Throwable -> L5a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r0.<init>()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r1 = android.ext.b2.f(r3)     // Catch: java.lang.Throwable -> L5a
                r0.append(r1)     // Catch: java.lang.Throwable -> L5a
                r0.append(r8)     // Catch: java.lang.Throwable -> L5a
                r1 = 2131296424(0x7f0900a8, float:1.8210764E38)
                java.lang.String r1 = android.ext.b2.f(r1)     // Catch: java.lang.Throwable -> L5a
                r0.append(r1)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5a
                android.ext.Tools.J1(r0)     // Catch: java.lang.Throwable -> L5a
                goto L109
            Le7:
                android.ext.e1.a(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = android.ext.b2.f(r3)
                r0.append(r1)
                java.lang.String r1 = "> "
                r0.append(r1)
                java.lang.String r1 = android.ext.b2.f(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.ext.Tools.J1(r0)
            L109:
                return
        }
    }

    class h implements android.content.DialogInterface.OnClickListener {
        h() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r3, int r4) {
                r2 = this;
                r3 = 2131034375(0x7f050107, float:1.7679266E38)
                android.ext.Config$p r3 = android.ext.Config.b(r3)
                r4 = 1
                float r0 = (float) r4
                r1 = 1182972621(0x4682bacd, float:16733.4)
                float r0 = r0 * r1
                r1 = 1141938586(0x4410999a, float:578.4)
                float r0 = r0 - r1
                r1 = 1056964608(0x3f000000, float:0.5)
                float r0 = r0 + r1
                int r0 = (int) r0
                r3.f42d = r0
                android.ext.Config.k()
                android.ext.p0 r3 = new android.ext.p0
                r0 = 1400(0x578, float:1.962E-42)
                r3.<init>(r0, r4)
                r4 = 0
                r0 = 0
                r3.onClick(r4, r0)
                return
        }
    }

    class i implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.r f1222b;

        i(android.ext.r r1, int r2) {
                r0 = this;
                r0.f1222b = r1
                r0.f1221a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                android.ext.r r0 = r7.f1222b
                java.lang.ref.WeakReference r0 = android.ext.r.d(r0)
                java.lang.Object r0 = r0.get()
                android.view.View r0 = (android.view.View) r0
                if (r0 != 0) goto Lf
                return
            Lf:
                r1 = 2131034310(0x7f0500c6, float:1.7679134E38)
                android.view.View r1 = r0.findViewById(r1)
                r2 = 8
                r3 = 0
                if (r1 == 0) goto L26
                int r4 = r7.f1221a
                if (r4 != 0) goto L21
                r4 = 0
                goto L23
            L21:
                r4 = 8
            L23:
                r1.setVisibility(r4)
            L26:
                r4 = 2131034293(0x7f0500b5, float:1.76791E38)
                android.view.View r4 = r0.findViewById(r4)
                if (r4 == 0) goto L3b
                int r5 = r7.f1221a
                r6 = 1
                if (r5 != r6) goto L36
                r5 = 0
                goto L38
            L36:
                r5 = 8
            L38:
                r4.setVisibility(r5)
            L3b:
                r5 = 2131034415(0x7f05012f, float:1.7679347E38)
                android.view.View r0 = r0.findViewById(r5)
                r5 = 2
                if (r0 == 0) goto L4d
                int r6 = r7.f1221a
                if (r6 != r5) goto L4a
                r2 = 0
            L4a:
                r0.setVisibility(r2)
            L4d:
                int r0 = r7.f1221a
                if (r0 != r5) goto L5b
                if (r1 == 0) goto L56
                android.ext.Tools.O0(r1)
            L56:
                if (r4 == 0) goto L5b
                android.ext.Tools.O0(r4)
            L5b:
                return
        }
    }

    class j implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.r f1223a;

        j(android.ext.r r1) {
                r0 = this;
                r0.f1223a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r3, int r4) {
                r2 = this;
                r3 = -1
                r0 = 1
                if (r4 != r3) goto L6
                r3 = 1
                goto L7
            L6:
                r3 = 0
            L7:
                android.ext.g2 r4 = new android.ext.g2
                r4.<init>()
                if (r3 == 0) goto Lf
                goto L10
            Lf:
                r0 = 2
            L10:
                java.lang.String r1 = "odd-vspace"
                android.ext.g2 r4 = r4.f(r1, r0)
                r4.commit()
                if (r3 == 0) goto L1e
                android.ext.ConfigListAdapter.m()
            L1e:
                return
        }
    }

    class k implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.os.Bundle f1225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.r f1226c;

        k(android.ext.r r1, android.os.Bundle r2) {
                r0 = this;
                r0.f1226c = r1
                r0.f1225b = r2
                r0.<init>()
                r1 = 0
                r0.f1224a = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r1 = ": 200"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.ext.e1.d(r0)
                boolean r0 = r2.f1224a
                if (r0 == 0) goto L2d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r1 = ": already"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.ext.e1.d(r0)
                return
            L2d:
                r0 = 1
                r2.f1224a = r0
                android.ext.r r0 = r2.f1226c
                android.os.Bundle r1 = r2.f1225b
                r0.B(r1)
                return
        }
    }

    class l implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.os.Bundle f1227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.r f1228b;

        l(android.ext.r r1, android.os.Bundle r2) {
                r0 = this;
                r0.f1228b = r1
                r0.f1227a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.ext.r r0 = r3.f1228b
                r1 = 0
                android.ext.r.e(r0, r1)
                android.ext.r r0 = r3.f1228b
                android.os.Bundle r1 = r3.f1227a
                r2 = 0
                r0.C(r1, r2)
                return
        }
    }

    class m implements android.ext.e2.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.os.Bundle f1229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.r f1230b;

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.r f1231a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f1232b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ android.ext.r.m f1233c;

            a(android.ext.r.m r1, android.ext.r r2, int r3) {
                    r0 = this;
                    r0.f1233c = r1
                    r0.f1231a = r2
                    r0.f1232b = r3
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    android.ext.r r0 = r3.f1231a
                    boolean r0 = android.ext.r.f(r0)
                    if (r0 != 0) goto L24
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    android.ext.r r1 = r3.f1231a
                    r0.append(r1)
                    java.lang.String r1 = ": drop root probe verdict "
                    r0.append(r1)
                    int r1 = r3.f1232b
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.ext.e1.d(r0)
                    return
                L24:
                    android.ext.r r0 = r3.f1231a
                    android.ext.r$m r1 = r3.f1233c
                    android.os.Bundle r1 = r1.f1229a
                    int r2 = r3.f1232b
                    android.ext.r.g(r0, r1, r2)
                    return
            }
        }

        m(android.ext.r r1, android.os.Bundle r2) {
                r0 = this;
                r0.f1230b = r1
                r0.f1229a = r2
                r0.<init>()
                return
        }

        @Override // android.ext.e2.c
        public void a(int r3) {
                r2 = this;
                android.ext.r r0 = r2.f1230b
                android.ext.r$m$a r1 = new android.ext.r$m$a
                r1.<init>(r2, r0, r3)
                android.ext.n2.i(r1)
                return
        }
    }

    public static class n implements android.content.DialogInterface.OnClickListener, android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f1234a;

        public n(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                if (r1 != 0) goto L7
                java.lang.String r1 = "kwws=22jdphjxdugldq1qhw2grzqordg"
            L7:
                r0.f1234a = r1
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r3, int r4) {
                r2 = this;
                android.content.Context r3 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> L1c
                android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L1c
                java.lang.String r0 = "android.intent.action.VIEW"
                java.lang.String r1 = r2.f1234a     // Catch: java.lang.Throwable -> L1c
                java.lang.String r1 = android.ext.Tools.removeNewLinesChars(r1)     // Catch: java.lang.Throwable -> L1c
                android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L1c
                r4.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1c
                r3.startActivity(r4)     // Catch: java.lang.Throwable -> L1c
                android.ext.f.d()     // Catch: java.lang.Throwable -> L1c
                goto L22
            L1c:
                r3 = move-exception
                java.lang.String r4 = "Failed call activity"
                android.ext.e1.s(r4, r3)
            L22:
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                r2 = 0
                r0 = 0
                r1.onClick(r2, r0)
                return
        }
    }

    static {
            java.lang.String r0 = "BaseActivity clinit"
            android.ext.e1.d(r0)
            android.ext.i.a()
            android.ext.n0.f()
            r0 = 0
            android.ext.r.r = r0
            return
    }

    public r() {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.f1206d = r0
            r1 = 0
            r3.f1207e = r1
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r2 = 0
            r1.<init>(r2)
            r3.f1208f = r1
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
            r3.f1209g = r1
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
            r3.h = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3.i = r1
            boolean r1 = r3 instanceof catch_.me_.if_.you_.can_.MainActivity
            if (r1 != 0) goto L2e
            android.ext.r r2 = android.ext.r.n
            if (r2 != 0) goto L30
        L2e:
            android.ext.r.n = r3
        L30:
            if (r1 != 0) goto L36
            android.content.Context r2 = android.ext.r.p
            if (r2 != 0) goto L38
        L36:
            android.ext.r.p = r3
        L38:
            r0 = r0 ^ r1
            android.ext.r.l = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BaseActivity init: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            android.ext.n0.f()
            return
    }

    private void A() {
            r5 = this;
            java.lang.ref.WeakReference r0 = r5.f1209g
            java.lang.Object r0 = r0.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.ref.WeakReference r1 = r5.h
            java.lang.Object r1 = r1.get()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L19
            r0.setText(r1)
            return
        L19:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 2131296387(0x7f090083, float:1.821069E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r1.append(r2)
            java.lang.String r2 = "#kwws=22jdphjxdugldq1qhw2grzqordg"
            java.lang.String r2 = android.ext.Tools.removeNewLinesChars(r2)
            r1.append(r2)
            java.lang.String r2 = "\n\n"
            r1.append(r2)
            r3 = 2131296502(0x7f0900f6, float:1.8210922E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "     32. __help_faq_32_q__\r\n        __help_faq_32_b__\r\n\r\n__rtfm__"
            java.lang.String r3 = android.ext.b2.g(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r2 = 2131296617(0x7f090169, float:1.8211156E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r3)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            android.ext.Tools.v1(r0, r1)
            java.lang.CharSequence r1 = r0.getText()
            android.ext.Tools.u(r1)
            java.lang.CharSequence r1 = r0.getText()
            r2 = 2130837505(0x7f020001, float:1.7279966E38)
            int r2 = android.ext.Tools.d0(r2)
            android.ext.Tools.v(r1, r3, r2)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            java.lang.CharSequence r0 = r0.getText()
            r1.<init>(r0)
            r5.h = r1
            return
    }

    private void E(android.os.Bundle r5, int r6) {
            r4 = this;
            r0 = 1
            if (r6 != r0) goto L1f
            android.ext.g2 r1 = new android.ext.g2
            r1.<init>()
            r2 = 1186682675(0x46bb5733, float:23979.6)
            float r3 = (float) r0
            float r3 = r3 * r2
            r2 = 1173652685(0x45f484cd, float:7824.6)
            float r3 = r3 - r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            java.lang.String r3 = "root-ok"
            android.ext.g2 r1 = r1.f(r3, r2)
            r1.commit()
        L1f:
            r1 = -1
            if (r6 == r1) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            r4.D(r5, r0)
            return
    }

    private boolean G() {
            r1 = this;
            android.ext.r r0 = android.ext.r.n
            if (r1 != r0) goto L12
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L12
            boolean r0 = r1.isDestroyed()
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    static void H() {
            java.lang.String r0 = v()
            android.content.Context r1 = android.ext.r.p
            android.app.AlertDialog$Builder r1 = android.ext.f.c(r1)
            r2 = 2131296887(0x7f090277, float:1.8211703E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = android.ext.Tools.L1(r2, r3)
            android.app.AlertDialog$Builder r0 = r1.setMessage(r0)
            r1 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.ext.r$h r2 = new android.ext.r$h
            r2.<init>()
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            r1 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            android.ext.f.o(r0)
            return
    }

    public static void I() {
            r0 = 2
            android.ext.f1.f953c = r0     // Catch: java.lang.Throwable -> L7
            android.ext.f1.o()     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Failed restart"
            r1.<init>(r2, r0)
            throw r1
    }

    public static void J(android.content.Context r4, long r5) {
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.String r0 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> L3e
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = t()     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L3e
            r0 = 1
            r2 = 200(0xc8, float:2.8E-43)
            android.ext.Tools.w1(r2, r1, r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = t()     // Catch: java.lang.Throwable -> L3e
            android.content.Intent r1 = android.ext.Tools.N0(r4, r1, r2)     // Catch: java.lang.Throwable -> L3e
            r2 = 123456(0x1e240, float:1.72999E-40)
            r3 = 268435456(0x10000000, float:2.524355E-29)
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r4, r2, r1, r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "alarm"
            java.lang.Object r4 = r4.getSystemService(r2)     // Catch: java.lang.Throwable -> L3e
            android.app.AlarmManager r4 = (android.app.AlarmManager) r4     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L42
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3e
            long r2 = r2 + r5
            r4.set(r0, r2, r1)     // Catch: java.lang.Throwable -> L3e
            goto L42
        L3e:
            r4 = move-exception
            android.ext.e1.a(r4)
        L42:
            return
    }

    public static void K(android.os.Bundle r3) {
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "reminst"
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L13
            java.lang.String r0 = "removeInstaller: from bundle"
            android.ext.e1.d(r0)
            r0 = 1
            android.ext.r.m = r0
        L13:
            java.lang.String r0 = "hw"
            boolean r1 = r3.containsKey(r0)
            if (r1 == 0) goto L21
            boolean r0 = r3.getBoolean(r0)
            android.ext.r.l = r0
        L21:
            java.lang.String r0 = "uid"
            boolean r1 = r3.containsKey(r0)
            if (r1 == 0) goto L5a
            int r0 = r3.getInt(r0)
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = "vspace"
            boolean r3 = r3.getBoolean(r2)
            if (r3 == 0) goto L5a
            if (r1 == r0) goto L5a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "Kill by diff uids: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = " != "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            android.ext.e1.d(r3)
            android.ext.f1.n()
        L5a:
            return
    }

    private void N(java.lang.String r8) {
            r7 = this;
            java.lang.StringBuilder r0 = r7.i
            java.lang.String r1 = "/mnt/expand/"
            boolean r2 = r8.startsWith(r1)
            r3 = 1
            r4 = 3
            r5 = -1
            java.lang.String r6 = "/"
            if (r2 == 0) goto L31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String[] r1 = r8.split(r6, r5)
            r1 = r1[r4]
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "/data"
            java.lang.String r8 = r8.replace(r1, r2)
            android.ext.r.r = r3
            java.lang.String r1 = "1\n"
            r0.append(r1)
        L31:
            java.lang.String r1 = "/data/data/"
            boolean r1 = r8.startsWith(r1)
            if (r1 == 0) goto L45
            java.lang.String[] r8 = r8.split(r6, r5)
            r8 = r8[r4]
            java.lang.String r1 = "2\n"
        L41:
            r0.append(r1)
            goto L58
        L45:
            java.lang.String r1 = "/data/user/"
            boolean r1 = r8.startsWith(r1)
            if (r1 == 0) goto L57
            java.lang.String[] r8 = r8.split(r6, r5)
            r1 = 4
            r8 = r8[r1]
            java.lang.String r1 = "3\n"
            goto L41
        L57:
            r8 = 0
        L58:
            java.lang.String r1 = ""
            android.ext.Config.F = r1
            if (r8 == 0) goto L99
            r0.append(r8)
            java.lang.String r1 = "\n4\n"
            r0.append(r1)
            java.lang.String r1 = android.ext.i.f1002d
            boolean r1 = r8.startsWith(r1)
            r1 = r1 ^ r3
            android.ext.Config.C = r1
            android.ext.Config.E = r8
            java.lang.String r1 = "vmos"
            boolean r1 = r8.contains(r1)
            android.ext.Config.D = r1
            android.content.pm.ApplicationInfo r1 = android.ext.Tools.Y(r8)     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = android.ext.Tools.a0(r1)     // Catch: java.lang.Throwable -> L84
            android.ext.Config.F = r1     // Catch: java.lang.Throwable -> L84
            goto L99
        L84:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed get vSpace name for "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            android.ext.e1.s(r8, r1)
        L99:
            java.lang.String r8 = android.ext.Config.F
            int r8 = r8.length()
            if (r8 != 0) goto Laa
            r8 = 2131297088(0x7f090340, float:1.8212111E38)
            java.lang.String r8 = android.ext.b2.f(r8)
            android.ext.Config.F = r8
        Laa:
            boolean r8 = android.ext.Config.C
            r0.append(r8)
            r8 = 10
            r0.append(r8)
            return
    }

    static void O() {
            java.lang.String r0 = " -> "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 1
            q(r1, r2)
            android.ext.r r2 = android.ext.r.n     // Catch: java.lang.Throwable -> L15
            java.io.File r2 = r2.getFilesDir()     // Catch: java.lang.Throwable -> L15
            r1.append(r2)     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r2 = move-exception
            r1.append(r2)
        L19:
            r2 = 2
            q(r1, r2)
            int r2 = android.os.Process.myUid()
            r1.append(r2)     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r3 = move-exception
            r1.append(r3)
        L29:
            r3 = 3
            q(r1, r3)
            android.ext.r r3 = android.ext.r.n     // Catch: java.lang.Throwable -> L3f
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L3f
            java.lang.String[] r2 = r3.getPackagesForUid(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = java.util.Arrays.toString(r2)     // Catch: java.lang.Throwable -> L3f
            r1.append(r2)     // Catch: java.lang.Throwable -> L3f
            goto L43
        L3f:
            r2 = move-exception
            r1.append(r2)
        L43:
            r2 = 4
            q(r1, r2)
            android.ext.r r2 = android.ext.r.n     // Catch: java.lang.Throwable -> L5f
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L5f
            android.ext.r r3 = android.ext.r.n     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L5f
            int[] r2 = r2.getPackageGids(r3)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = java.util.Arrays.toString(r2)     // Catch: java.lang.Throwable -> L5f
            r1.append(r2)     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r2 = move-exception
            r1.append(r2)
        L63:
            r2 = 5
            q(r1, r2)
            r2 = 0
            android.ext.r r3 = android.ext.r.n     // Catch: java.lang.Throwable -> L7c
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L7c
            android.ext.r r4 = android.ext.r.n     // Catch: java.lang.Throwable -> L7c
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L7c
            int r3 = android.ext.q.a(r3, r4, r2)     // Catch: java.lang.Throwable -> L7c
            r1.append(r3)     // Catch: java.lang.Throwable -> L7c
            goto L80
        L7c:
            r3 = move-exception
            r1.append(r3)
        L80:
            r3 = 6
            q(r1, r3)
            android.ext.r r3 = android.ext.r.n     // Catch: java.lang.Throwable -> L94
            java.lang.String r4 = "dqgurlg1shuplvvlrq1UHDGbVPV"
            java.lang.String r4 = android.ext.Tools.removeNewLinesChars(r4)     // Catch: java.lang.Throwable -> L94
            int r3 = r3.checkCallingOrSelfPermission(r4)     // Catch: java.lang.Throwable -> L94
            r1.append(r3)     // Catch: java.lang.Throwable -> L94
            goto L98
        L94:
            r3 = move-exception
            r1.append(r3)
        L98:
            r3 = 32
            r1.append(r3)
            android.content.SharedPreferences r3 = android.ext.Tools.M0()
            java.lang.String r4 = "odd-vspace"
            int r3 = r3.getInt(r4, r2)
            r1.append(r3)
            r3 = 7
            q(r1, r3)
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb4
            r1.append(r3)     // Catch: java.lang.Throwable -> Lb4
            goto Lb8
        Lb4:
            r3 = move-exception
            r1.append(r3)
        Lb8:
            r3 = 8
            q(r1, r3)
            r3 = 10
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15f
            r4.<init>()     // Catch: java.lang.Throwable -> L15f
            java.util.Random r5 = android.ext.Tools.f489a     // Catch: java.lang.Throwable -> L15f
            int r5 = r5.nextInt()     // Catch: java.lang.Throwable -> L15f
            r4.append(r5)     // Catch: java.lang.Throwable -> L15f
            java.lang.String r5 = ".txt"
            r4.append(r5)     // Catch: java.lang.Throwable -> L15f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L15f
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L15f
            android.ext.r r6 = android.ext.r.n     // Catch: java.lang.Throwable -> L15f
            java.io.File r6 = r6.getFilesDir()     // Catch: java.lang.Throwable -> L15f
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L15f
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L161
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L161
            r7 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L161
            r6.write(r7)     // Catch: java.lang.Throwable -> L161
            r6.flush()     // Catch: java.lang.Throwable -> L161
            java.io.FileDescriptor r7 = r6.getFD()     // Catch: java.lang.Throwable -> L161
            int r7 = android.lang.a.a(r7)     // Catch: java.lang.Throwable -> L161
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L161
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L161
            r9.<init>()     // Catch: java.lang.Throwable -> L161
            java.lang.String r10 = "/proc/self/fd/"
            r9.append(r10)     // Catch: java.lang.Throwable -> L161
            r9.append(r7)     // Catch: java.lang.Throwable -> L161
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L161
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L161
            java.lang.String r7 = r8.getPath()     // Catch: java.lang.Throwable -> L161
            r1.append(r7)     // Catch: java.lang.Throwable -> L161
            r1.append(r0)     // Catch: java.lang.Throwable -> L161
            java.lang.String r7 = r8.getCanonicalPath()     // Catch: java.lang.Throwable -> L161
            r1.append(r7)     // Catch: java.lang.Throwable -> L161
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L13c
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L13c
            java.nio.channels.FileChannel r8 = r7.getChannel()     // Catch: java.lang.Throwable -> L13c
            java.nio.channels.FileChannel$MapMode r9 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L13c
            r10 = 0
            r12 = 4096(0x1000, double:2.0237E-320)
            java.nio.MappedByteBuffer r8 = r8.map(r9, r10, r12)     // Catch: java.lang.Throwable -> L13c
            l(r1, r4)     // Catch: java.lang.Throwable -> L13c
            r8.capacity()     // Catch: java.lang.Throwable -> L13c
            r7.close()     // Catch: java.lang.Throwable -> L13c
            goto L143
        L13c:
            r4 = move-exception
            r1.append(r3)     // Catch: java.lang.Throwable -> L161
            r1.append(r4)     // Catch: java.lang.Throwable -> L161
        L143:
            java.lang.String r4 = "\nN: '"
            r1.append(r4)     // Catch: java.lang.Throwable -> L161
            java.lang.String r4 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L161
            java.lang.String r4 = android.ext.Tools.y0(r4)     // Catch: java.lang.Throwable -> L161
            r1.append(r4)     // Catch: java.lang.Throwable -> L161
            r4 = 39
            r1.append(r4)     // Catch: java.lang.Throwable -> L161
            r6.close()     // Catch: java.lang.Throwable -> L161
            r5.delete()     // Catch: java.lang.Throwable -> L15f
            goto L169
        L15f:
            r4 = move-exception
            goto L166
        L161:
            r4 = move-exception
            r5.delete()     // Catch: java.lang.Throwable -> L15f
            throw r4     // Catch: java.lang.Throwable -> L15f
        L166:
            r1.append(r4)
        L169:
            r4 = 9
            q(r1, r4)
            android.ext.r r4 = android.ext.r.n     // Catch: java.lang.Throwable -> L178
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L178
            l(r1, r4)     // Catch: java.lang.Throwable -> L178
            goto L17c
        L178:
            r4 = move-exception
            r1.append(r4)
        L17c:
            q(r1, r3)
            boolean r3 = android.ext.ConfigListAdapter.k()     // Catch: java.lang.Throwable -> L187
            r1.append(r3)     // Catch: java.lang.Throwable -> L187
            goto L18b
        L187:
            r3 = move-exception
            r1.append(r3)
        L18b:
            r3 = 11
            q(r1, r3)
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L1a9
            java.lang.String r4 = "/proc/self/exe"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1a9
            java.lang.String r4 = r3.getPath()     // Catch: java.lang.Throwable -> L1a9
            r1.append(r4)     // Catch: java.lang.Throwable -> L1a9
            r1.append(r0)     // Catch: java.lang.Throwable -> L1a9
            java.lang.String r3 = r3.getCanonicalPath()     // Catch: java.lang.Throwable -> L1a9
            r1.append(r3)     // Catch: java.lang.Throwable -> L1a9
            goto L1ad
        L1a9:
            r3 = move-exception
            r1.append(r3)
        L1ad:
            r3 = 12
            q(r1, r3)
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L1ba
            r1.append(r3)     // Catch: java.lang.Throwable -> L1ba
            goto L1be
        L1ba:
            r3 = move-exception
            r1.append(r3)
        L1be:
            r3 = 13
            q(r1, r3)
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1e3
            java.lang.String r4 = "/proc/self/status"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1e3
            r4 = 65536(0x10000, float:9.1835E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L1e3
            int r5 = r3.read(r4)     // Catch: java.lang.Throwable -> L1e3
            r1.append(r5)     // Catch: java.lang.Throwable -> L1e3
            r1.append(r0)     // Catch: java.lang.Throwable -> L1e3
            if (r5 <= 0) goto L1e5
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L1e3
            r0.<init>(r4, r2, r5)     // Catch: java.lang.Throwable -> L1e3
            r1.append(r0)     // Catch: java.lang.Throwable -> L1e3
            goto L1e5
        L1e3:
            r0 = move-exception
            goto L1e9
        L1e5:
            r3.close()     // Catch: java.lang.Throwable -> L1e3
            goto L1ec
        L1e9:
            r1.append(r0)
        L1ec:
            java.lang.String r0 = "FIN"
            android.ext.e1.d(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.trim()
            android.ext.Tools.h(r0, r2)
            return
    }

    private android.app.AlertDialog P(android.content.Context r5) {
            r4 = this;
            android.app.AlertDialog$Builder r5 = android.ext.f.c(r5)
            r0 = 2131296455(0x7f0900c7, float:1.8210827E38)
            android.view.View r0 = android.ext.Tools.g0(r0)
            android.app.AlertDialog$Builder r5 = r5.setCustomTitle(r0)
            r0 = 15
            java.lang.String[] r0 = new java.lang.String[r0]
            boolean r1 = android.ext.m2.f1074a
            if (r1 == 0) goto L1b
            r1 = 2131296380(0x7f09007c, float:1.8210675E38)
            goto L1e
        L1b:
            r1 = 2131296406(0x7f090096, float:1.8210728E38)
        L1e:
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = android.ext.Config.A
            r2 = 4
            r1 = r1 & r2
            if (r1 == 0) goto L2f
            r1 = 2131297107(0x7f090353, float:1.821215E38)
            goto L32
        L2f:
            r1 = 2131297104(0x7f090350, float:1.8212143E38)
        L32:
            java.lang.String r1 = android.ext.b2.f(r1)
            r3 = 1
            r0[r3] = r1
            r1 = 2131296315(0x7f09003b, float:1.8210543E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r3 = 2
            r0[r3] = r1
            r1 = 2131296899(0x7f090283, float:1.8211728E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r3 = 3
            r0[r3] = r1
            r1 = 2131034210(0x7f050062, float:1.7678931E38)
            android.ext.Config$p r1 = android.ext.Config.b(r1)
            java.lang.String r1 = r1.toString()
            r0[r2] = r1
            r1 = 2131034169(0x7f050039, float:1.7678848E38)
            android.ext.Config$p r1 = android.ext.Config.b(r1)
            java.lang.String r1 = r1.toString()
            r2 = 5
            r0[r2] = r1
            r1 = 2131034157(0x7f05002d, float:1.7678824E38)
            android.ext.Config$p r1 = android.ext.Config.b(r1)
            java.lang.String r1 = r1.toString()
            r2 = 6
            r0[r2] = r1
            r1 = 2131296900(0x7f090284, float:1.821173E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 7
            r0[r2] = r1
            r1 = 2131297002(0x7f0902ea, float:1.8211937E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 8
            r0[r2] = r1
            r1 = 2131296886(0x7f090276, float:1.8211701E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 9
            r0[r2] = r1
            r1 = 2131296958(0x7f0902be, float:1.8211847E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 10
            r0[r2] = r1
            r1 = 2131034186(0x7f05004a, float:1.7678882E38)
            android.ext.Config$p r1 = android.ext.Config.b(r1)
            java.lang.String r1 = r1.toString()
            r2 = 11
            r0[r2] = r1
            r1 = 2131034150(0x7f050026, float:1.767881E38)
            android.ext.Config$p r1 = android.ext.Config.b(r1)
            java.lang.String r1 = r1.toString()
            r2 = 12
            r0[r2] = r1
            r1 = 2131034214(0x7f050066, float:1.767894E38)
            android.ext.Config$p r1 = android.ext.Config.b(r1)
            java.lang.String r1 = r1.toString()
            r2 = 13
            r0[r2] = r1
            r1 = 2131034183(0x7f050047, float:1.7678876E38)
            android.ext.Config$p r1 = android.ext.Config.b(r1)
            java.lang.String r1 = r1.toString()
            r2 = 14
            r0[r2] = r1
            android.ext.r$e r1 = new android.ext.r$e
            r1.<init>(r4)
            android.app.AlertDialog$Builder r5 = r5.setItems(r0, r1)
            r0 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            r1 = 0
            android.app.AlertDialog$Builder r5 = r5.setNegativeButton(r0, r1)
            android.app.AlertDialog r5 = r5.create()
            return r5
    }

    private void R(android.os.Bundle r2) {
            r1 = this;
            android.ext.r$m r0 = new android.ext.r$m
            r0.<init>(r1, r2)
            android.ext.e2.i(r0)
            return
    }

    private static void S() {
            android.os.Handler r0 = android.ext.n2.d()
            android.ext.r$d r1 = new android.ext.r$d
            r1.<init>()
            r0.post(r1)
            return
    }

    static void U(java.io.OutputStream r3, java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "\n\n"
            java.util.GregorianCalendar r1 = new java.util.GregorianCalendar     // Catch: java.lang.Throwable -> L60
            r1.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r2.<init>()     // Catch: java.lang.Throwable -> L60
            r2.append(r0)     // Catch: java.lang.Throwable -> L60
            java.util.Date r1 = r1.getTime()     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L60
            r2.append(r1)     // Catch: java.lang.Throwable -> L60
            r1 = 10
            r2.append(r1)     // Catch: java.lang.Throwable -> L60
            r2.append(r4)     // Catch: java.lang.Throwable -> L60
            r2.append(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = android.ext.h0.c()     // Catch: java.lang.Throwable -> L60
            r2.append(r4)     // Catch: java.lang.Throwable -> L60
            r2.append(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = android.ext.f1.x()     // Catch: java.lang.Throwable -> L60
            r2.append(r4)     // Catch: java.lang.Throwable -> L60
            r2.append(r1)     // Catch: java.lang.Throwable -> L60
            android.content.Context r4 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> L60
            java.io.File r4 = r4.getFilesDir()     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L60
            r2.append(r4)     // Catch: java.lang.Throwable -> L60
            r2.append(r1)     // Catch: java.lang.Throwable -> L60
            r2.append(r5)     // Catch: java.lang.Throwable -> L60
            r2.append(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L60
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Throwable -> L60
            r3.write(r4)     // Catch: java.lang.Throwable -> L60
            r3.flush()     // Catch: java.lang.Throwable -> L60
            goto L66
        L60:
            r3 = move-exception
            java.lang.String r4 = "Fail write logcat header"
            android.ext.e1.s(r4, r3)
        L66:
            return
    }

    static /* synthetic */ java.lang.ref.WeakReference d(android.ext.r r0) {
            java.lang.ref.WeakReference r0 = r0.f1208f
            return r0
    }

    static /* synthetic */ java.lang.Runnable e(android.ext.r r0, java.lang.Runnable r1) {
            r0.j = r1
            return r1
    }

    static /* synthetic */ boolean f(android.ext.r r0) {
            boolean r0 = r0.G()
            return r0
    }

    static /* synthetic */ void g(android.ext.r r0, android.os.Bundle r1, int r2) {
            r0.E(r1, r2)
            return
    }

    static /* synthetic */ void h() {
            k()
            return
    }

    private static void i(android.content.Context r3) {
            java.lang.String r0 = android.ext.MainService.G0     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            android.content.SharedPreferences r0 = r3.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L1b
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "perm-restart"
            r2 = 1
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r2)     // Catch: java.lang.Throwable -> L1b
            r0.commit()     // Catch: java.lang.Throwable -> L1b
            r0 = 3000(0xbb8, double:1.482E-320)
            J(r3, r0)     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            android.ext.e1.a(r3)
        L1f:
            return
    }

    private static void j() {
            java.lang.String r0 = "perm-restart"
            android.content.SharedPreferences r1 = android.ext.Tools.M0()     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.contains(r0)     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L25
            java.lang.String r1 = "cancelPermissionRestart"
            android.ext.e1.d(r1)     // Catch: java.lang.Throwable -> L21
            android.content.SharedPreferences r1 = android.ext.Tools.M0()     // Catch: java.lang.Throwable -> L21
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L21
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L21
            r0.commit()     // Catch: java.lang.Throwable -> L21
            goto L25
        L21:
            r0 = move-exception
            android.ext.e1.a(r0)
        L25:
            android.content.Context r0 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L2c
            return
        L2c:
            java.lang.String r1 = "alarm"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L4f
            android.app.AlarmManager r1 = (android.app.AlarmManager) r1     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L53
            java.lang.String r2 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = t()     // Catch: java.lang.Throwable -> L4f
            android.content.Intent r2 = android.ext.Tools.N0(r0, r2, r3)     // Catch: java.lang.Throwable -> L4f
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r4 = 123456(0x1e240, float:1.72999E-40)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r0, r4, r2, r3)     // Catch: java.lang.Throwable -> L4f
            r1.cancel(r0)     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r0 = move-exception
            android.ext.e1.a(r0)
        L53:
            return
    }

    private static void k() {
            boolean r0 = android.ext.r.r
            if (r0 != 0) goto L5
            return
        L5:
            android.content.Context r0 = android.ext.r.p
            android.app.AlertDialog$Builder r0 = android.ext.f.c(r0)
            r1 = 2131296778(0x7f09020a, float:1.8211482E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            r1 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNeutralButton(r1, r2)
            r1 = 2131296455(0x7f0900c7, float:1.8210827E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.ext.r$c r2 = new android.ext.r$c
            r2.<init>()
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            android.ext.f.o(r0)
            return
    }

    private static void l(java.lang.StringBuilder r6, java.lang.String r7) {
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.FileReader r1 = new java.io.FileReader
            java.lang.String r2 = "/proc/self/maps"
            r1.<init>(r2)
            r0.<init>(r1)
        Lc:
            java.lang.String r1 = r0.readLine()
            if (r1 == 0) goto L43
            int r2 = r1.indexOf(r7)
            if (r2 >= 0) goto L19
            goto Lc
        L19:
            r3 = r2
        L1a:
            if (r3 <= 0) goto L27
            char r4 = r1.charAt(r3)
            r5 = 32
            if (r4 <= r5) goto L27
            int r3 = r3 + (-1)
            goto L1a
        L27:
            if (r3 >= r2) goto Lc
            java.lang.String r2 = "\n'"
            r6.append(r2)
            int r2 = r1.length()
            java.lang.String r1 = r1.substring(r3, r2)
            java.lang.String r1 = r1.trim()
            r6.append(r1)
            r1 = 39
            r6.append(r1)
            goto Lc
        L43:
            r0.close()
            return
    }

    private void n() {
            r2 = this;
            java.lang.ref.WeakReference r0 = r2.f1209g
            java.lang.Object r0 = r0.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto Lf
            java.lang.String r1 = ""
            r0.setText(r1)
        Lf:
            r0 = 0
            r2.y(r0)
            return
    }

    static boolean o(android.content.Context r3) {
            java.lang.String r0 = "perm-restart"
            r1 = 0
            java.lang.String r2 = android.ext.MainService.G0     // Catch: java.lang.Throwable -> L22
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r2, r1)     // Catch: java.lang.Throwable -> L22
            boolean r2 = r3.getBoolean(r0, r1)     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L10
            return r1
        L10:
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L22
            android.content.SharedPreferences$Editor r3 = r3.remove(r0)     // Catch: java.lang.Throwable -> L22
            r3.commit()     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = "consumePermissionRestart"
            android.ext.e1.d(r3)     // Catch: java.lang.Throwable -> L22
            r3 = 1
            return r3
        L22:
            r3 = move-exception
            android.ext.e1.a(r3)
            return r1
    }

    private static void q(java.lang.StringBuilder r2, int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "START: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            r0 = 10
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = ": "
            r2.append(r3)
            return
    }

    private void r() {
            r12 = this;
            java.lang.String r0 = ""
            java.lang.StringBuilder r1 = r12.i
            r2 = 0
            r3 = 10
            java.io.File r4 = r12.getFilesDir()     // Catch: java.lang.Throwable -> L46
            java.lang.String r5 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L46
            r1.append(r5)     // Catch: java.lang.Throwable -> L46
            r1.append(r3)     // Catch: java.lang.Throwable -> L46
            java.lang.String r6 = android.ext.i.f1002d     // Catch: java.lang.Throwable -> L46
            r1.append(r6)     // Catch: java.lang.Throwable -> L46
            r1.append(r3)     // Catch: java.lang.Throwable -> L46
            r12.N(r5)     // Catch: java.lang.Throwable -> L46
            boolean r7 = android.ext.Config.C     // Catch: java.lang.Throwable -> L46
            if (r7 != 0) goto L166
            android.ext.r r7 = android.ext.r.n     // Catch: java.lang.Throwable -> L46
            java.lang.String r8 = "dqgurlg1shuplvvlrq1UHDGbVPV"
            java.lang.String r8 = android.ext.Tools.removeNewLinesChars(r8)     // Catch: java.lang.Throwable -> L46
            int r7 = r7.checkCallingOrSelfPermission(r8)     // Catch: java.lang.Throwable -> L46
            if (r7 == 0) goto L49
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L46
            java.lang.String r8 = "/proc/self/exe"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L46
            java.lang.String r7 = r7.getCanonicalPath()     // Catch: java.lang.Throwable -> L46
            java.lang.String r8 = "/system/"
            boolean r7 = r7.startsWith(r8)     // Catch: java.lang.Throwable -> L46
            if (r7 != 0) goto L166
            goto L49
        L46:
            r0 = move-exception
            goto L189
        L49:
            java.lang.String r7 = "? "
            r1.append(r7)     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r7.<init>()     // Catch: java.lang.Throwable -> L46
            java.util.Random r8 = android.ext.Tools.f489a     // Catch: java.lang.Throwable -> L46
            int r8 = r8.nextInt()     // Catch: java.lang.Throwable -> L46
            r7.append(r8)     // Catch: java.lang.Throwable -> L46
            java.lang.String r8 = ".txt"
            r7.append(r8)     // Catch: java.lang.Throwable -> L46
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L46
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L46
            r8.<init>(r4, r7)     // Catch: java.lang.Throwable -> L46
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L46
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L46
            r10 = 4096(0x1000, float:5.74E-42)
            byte[] r10 = new byte[r10]     // Catch: java.lang.Throwable -> L46
            r9.write(r10)     // Catch: java.lang.Throwable -> L46
            r9.flush()     // Catch: java.lang.Throwable -> L46
            r9.close()     // Catch: java.lang.Throwable -> L46
            java.lang.String r9 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L46
            java.lang.String r9 = android.ext.Tools.y0(r9)     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r10.<init>()     // Catch: java.lang.Throwable -> L46
            r11 = 47
            r10.append(r11)     // Catch: java.lang.Throwable -> L46
            r10.append(r7)     // Catch: java.lang.Throwable -> L46
            java.lang.String r7 = r10.toString()     // Catch: java.lang.Throwable -> L46
            java.lang.String r7 = r9.replace(r7, r0)     // Catch: java.lang.Throwable -> L46
            r8.delete()     // Catch: java.lang.Throwable -> L46
            r1.append(r7)     // Catch: java.lang.Throwable -> L46
            r1.append(r3)     // Catch: java.lang.Throwable -> L46
            r12.N(r7)     // Catch: java.lang.Throwable -> L46
            boolean r8 = android.ext.Config.C     // Catch: java.lang.Throwable -> L46
            if (r8 == 0) goto Lf9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r8.<init>()     // Catch: java.lang.Throwable -> L46
            r8.append(r11)     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L46
            r8.append(r4)     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> L46
            java.lang.String r7 = r7.replace(r4, r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = r5.replace(r4, r0)     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r4.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r8 = "F2R: ["
            r4.append(r8)     // Catch: java.lang.Throwable -> L46
            int r8 = r7.length()     // Catch: java.lang.Throwable -> L46
            r4.append(r8)     // Catch: java.lang.Throwable -> L46
            java.lang.String r8 = "] "
            r4.append(r8)     // Catch: java.lang.Throwable -> L46
            r4.append(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r8 = " -> "
            r4.append(r8)     // Catch: java.lang.Throwable -> L46
            r4.append(r7)     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L46
            android.ext.e1.p(r4)     // Catch: java.lang.Throwable -> L46
            r1.append(r4)     // Catch: java.lang.Throwable -> L46
            r1.append(r3)     // Catch: java.lang.Throwable -> L46
            java.lang.String[] r0 = new java.lang.String[]{r0, r7}     // Catch: java.lang.Throwable -> L46
            android.ext.Tools.v = r0     // Catch: java.lang.Throwable -> L46
            goto L166
        Lf9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r0.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = "Odd vSpace: "
            r0.append(r4)     // Catch: java.lang.Throwable -> L46
            r0.append(r5)     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = "; "
            r0.append(r4)     // Catch: java.lang.Throwable -> L46
            r0.append(r7)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L46
            android.ext.e1.p(r0)     // Catch: java.lang.Throwable -> L46
            r1.append(r0)     // Catch: java.lang.Throwable -> L46
            r1.append(r3)     // Catch: java.lang.Throwable -> L46
            android.content.SharedPreferences r0 = android.ext.Tools.M0()     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = "odd-vspace"
            int r0 = r0.getInt(r4, r2)     // Catch: java.lang.Throwable -> L46
            r1.append(r0)     // Catch: java.lang.Throwable -> L46
            r1.append(r3)     // Catch: java.lang.Throwable -> L46
            r4 = 1
            if (r0 != r4) goto L131
            android.ext.Config.C = r4     // Catch: java.lang.Throwable -> L46
            goto L166
        L131:
            if (r0 != 0) goto L166
            android.ext.r$j r0 = new android.ext.r$j     // Catch: java.lang.Throwable -> L46
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L46
            android.content.Context r4 = android.ext.r.p     // Catch: java.lang.Throwable -> L46
            android.app.AlertDialog$Builder r4 = android.ext.f.c(r4)     // Catch: java.lang.Throwable -> L46
            r7 = 2131296831(0x7f09023f, float:1.821159E38)
            java.lang.String r7 = android.ext.b2.f(r7)     // Catch: java.lang.Throwable -> L46
            android.app.AlertDialog$Builder r4 = r4.setMessage(r7)     // Catch: java.lang.Throwable -> L46
            android.app.AlertDialog$Builder r4 = r4.setCancelable(r2)     // Catch: java.lang.Throwable -> L46
            r7 = 2131297115(0x7f09035b, float:1.8212166E38)
            java.lang.String r7 = android.ext.b2.f(r7)     // Catch: java.lang.Throwable -> L46
            android.app.AlertDialog$Builder r4 = r4.setPositiveButton(r7, r0)     // Catch: java.lang.Throwable -> L46
            r7 = 2131296805(0x7f090225, float:1.8211537E38)
            java.lang.String r7 = android.ext.b2.f(r7)     // Catch: java.lang.Throwable -> L46
            android.app.AlertDialog$Builder r0 = r4.setNegativeButton(r7, r0)     // Catch: java.lang.Throwable -> L46
            android.ext.f.o(r0)     // Catch: java.lang.Throwable -> L46
        L166:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r0.<init>()     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = "Files: "
            r0.append(r4)     // Catch: java.lang.Throwable -> L46
            r0.append(r5)     // Catch: java.lang.Throwable -> L46
            r4 = 32
            r0.append(r4)     // Catch: java.lang.Throwable -> L46
            r0.append(r6)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L46
            android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L46
            r1.append(r0)     // Catch: java.lang.Throwable -> L46
            r1.append(r3)     // Catch: java.lang.Throwable -> L46
            goto L196
        L189:
            android.ext.e1.a(r0)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            r1.append(r3)
        L196:
            boolean r0 = android.ext.Config.C
            android.ext.Config.vSpaceReal = r0
            boolean r0 = android.ext.Config.C
            if (r0 == 0) goto L1a6
            int r0 = android.ext.Config.B
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L1a6
            android.ext.Config.C = r2
        L1a6:
            return
    }

    private static void s() {
            java.lang.Class<android.animation.ValueAnimator> r0 = android.animation.ValueAnimator.class
            java.lang.String r1 = "sDurationScale"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L2f
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L2f
            boolean r3 = r2 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L35
            r3 = 0
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L35
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch: java.lang.Throwable -> L2f
            r0.set(r1, r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "Fix sDurationScale"
            android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L2f
            goto L35
        L2f:
            r0 = move-exception
            java.lang.String r1 = "failed fix sDurationScale"
            android.ext.e1.s(r1, r0)
        L35:
            return
    }

    public static java.lang.String t() {
            boolean r0 = android.ext.r.l
            if (r0 == 0) goto Lb
            java.lang.Class<catch_.me_.if_.you_.can_.ActivityMain> r0 = catch_.me_.if_.you_.can_.ActivityMain.class
        L6:
            java.lang.String r0 = r0.getName()
            goto Le
        Lb:
            java.lang.Class<catch_.me_.if_.you_.can_.MainActivity> r0 = catch_.me_.if_.you_.can_.MainActivity.class
            goto L6
        Le:
            return r0
    }

    public static android.os.Bundle u() {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "hw"
            boolean r2 = android.ext.r.l
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "uid"
            int r2 = android.os.Process.myUid()
            r0.putInt(r1, r2)
            java.lang.String r1 = "vspace"
            boolean r2 = android.ext.Config.C
            r0.putBoolean(r1, r2)
            boolean r1 = android.ext.r.m
            if (r1 == 0) goto L2b
            java.lang.String r1 = "removeInstaller: to bundle"
            android.ext.e1.d(r1)
            java.lang.String r1 = "reminst"
            r2 = 1
            r0.putBoolean(r1, r2)
        L2b:
            return r0
    }

    static java.lang.String v() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = android.ext.Tools.K0()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "GG_logcat_"
            r2.append(r3)
            boolean r3 = android.ext.Config.C
            if (r3 == 0) goto L17
            java.lang.String r3 = "v"
            goto L20
        L17:
            boolean r3 = android.ext.Config.vSpaceReal
            if (r3 == 0) goto L1e
            java.lang.String r3 = "R"
            goto L20
        L1e:
            java.lang.String r3 = "r"
        L20:
            r2.append(r3)
            r3 = 1
            float r3 = (float) r3
            r4 = 1122461287(0x42e76667, float:115.700005)
            float r4 = r4 * r3
            r5 = 1097125069(0x4164cccd, float:14.3)
            float r4 = r4 - r5
            r2.append(r4)
            r4 = 95
            r2.append(r4)
            r5 = 1182843034(0x4680c09a, float:16480.3)
            float r3 = r3 * r5
            r5 = 1134732902(0x43a2a666, float:325.3)
            float r3 = r3 - r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r5
            int r3 = (int) r3
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            r2.append(r3)
            r2.append(r4)
            int r3 = android.os.Build.VERSION.SDK_INT
            r2.append(r3)
            java.lang.String r3 = ".log"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }

    private java.lang.String w() {
            r2 = this;
            java.lang.StringBuilder r0 = r2.i
            r1 = 0
            r2.i = r1
            if (r0 != 0) goto La
            java.lang.String r0 = ""
            goto Le
        La:
            java.lang.String r0 = r0.toString()
        Le:
            return r0
    }

    private void y(boolean r8) {
            r7 = this;
            java.lang.ref.WeakReference r0 = r7.f1208f
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            r1 = 2131034415(0x7f05012f, float:1.7679347E38)
            android.view.View r2 = r0.findViewById(r1)
            if (r8 == 0) goto L6d
            if (r2 != 0) goto L2e
            r8 = 2131099657(0x7f060009, float:1.7811673E38)
            r2 = 0
            android.view.View r8 = a.d.f(r8, r2)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            android.view.View r8 = r8.findViewById(r1)
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r8 = android.ext.Tools.O0(r8)
            r1.addView(r8)
        L2e:
            r8 = 2131034272(0x7f0500a0, float:1.7679057E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r8)
            r7.f1209g = r1
            r1 = 6
            int[] r2 = new int[r1]
            r2 = {x0084: FILL_ARRAY_DATA , data: [2131034134, 2131034133, 2131034149, 2131034263, 2131034304, 2131034277} // fill-array
            r3 = 0
        L45:
            if (r3 >= r1) goto L69
            r4 = r2[r3]
            android.view.View r4 = r0.findViewById(r4)
            boolean r5 = r4 instanceof android.widget.TextView
            if (r5 == 0) goto L63
            r5 = r4
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.CharSequence r6 = r5.getText()
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = android.ext.b2.g(r6)
            r5.setText(r6)
        L63:
            r4.setOnClickListener(r7)
            int r3 = r3 + 1
            goto L45
        L69:
            android.ext.Tools.S(r8)
            goto L82
        L6d:
            if (r2 == 0) goto L82
            java.lang.ref.WeakReference r8 = r7.f1209g
            java.lang.Object r8 = r8.get()
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L7f
            android.ext.Tools.P(r8)
            android.ext.Tools.O0(r8)
        L7f:
            android.ext.Tools.O0(r2)
        L82:
            return
    }

    private void z() {
            r4 = this;
            s()
            r0 = 2131099657(0x7f060009, float:1.7811673E38)
            r4.setContentView(r0)
            r0 = 2131034380(0x7f05010c, float:1.7679276E38)
            android.view.View r0 = r4.findViewById(r0)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r4.f1208f = r1
            r1 = 2131034294(0x7f0500b6, float:1.7679101E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 2131296705(0x7f0901c1, float:1.8211334E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r1.setText(r2)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r3 = 2131034357(0x7f0500f5, float:1.767923E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            r2.<init>(r3)
            android.ext.b1.G = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r3 = 2131034360(0x7f0500f8, float:1.7679235E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.<init>(r3)
            android.ext.b1.H = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            android.ext.b1.I = r2
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r2 = 2131034112(0x7f050000, float:1.7678732E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.<init>(r0)
            android.ext.b1.E = r1
            r0 = 0
            r4.L(r0)
            r0 = 1
            r4.y(r0)
            return
    }

    void B(android.os.Bundle r3) {
            r2 = this;
            boolean r0 = android.ext.s1.u()
            android.ext.s1.d()
            if (r0 != 0) goto L11
            boolean r0 = android.ext.s1.E()
            r2.C(r3, r0)
            return
        L11:
            int r0 = android.ext.s1.O()
            r1 = 2
            if (r0 >= r1) goto L20
            android.ext.r$l r0 = new android.ext.r$l
            r0.<init>(r2, r3)
            r2.j = r0
            return
        L20:
            r0 = 1
            r2.C(r3, r0)
            return
    }

    void C(android.os.Bundle r4, boolean r5) {
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L36
            boolean r5 = android.ext.Config.vSpaceReal
            if (r5 != 0) goto L36
            boolean r5 = android.ext.b1.B0()
            if (r5 != 0) goto L36
            android.content.SharedPreferences r5 = android.ext.Tools.M0()
            java.lang.String r1 = "root-ok"
            r2 = 0
            int r5 = r5.getInt(r1, r2)
            r1 = 1183200512(0x46863500, float:17178.5)
            float r2 = (float) r0
            float r2 = r2 * r1
            r1 = 1149231104(0x447fe000, float:1023.5)
            float r2 = r2 - r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r1
            int r1 = (int) r2
            if (r5 == r1) goto L36
            r3.R(r4)     // Catch: java.lang.Throwable -> L2c
            goto L35
        L2c:
            r5 = move-exception
            java.lang.String r1 = "Failed start root probe"
            android.ext.e1.l(r1, r5)
            r3.D(r4, r0)
        L35:
            return
        L36:
            r3.D(r4, r0)
            return
    }

    void D(android.os.Bundle r5, boolean r6) {
            r4 = this;
            if (r6 == 0) goto L6
            r4.F(r5)
            goto L4a
        L6:
            android.ext.r$a r6 = new android.ext.r$a
            r6.<init>(r4, r5)
            android.content.Context r5 = android.ext.r.p
            android.app.AlertDialog$Builder r5 = android.ext.f.c(r5)
            r0 = 2131297103(0x7f09034f, float:1.8212141E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            android.app.AlertDialog$Builder r5 = r5.setTitle(r0)
            r0 = 0
            android.app.AlertDialog$Builder r5 = r5.setCancelable(r0)
            r1 = 2131296913(0x7f090291, float:1.8211756E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 2131296812(0x7f09022c, float:1.8211551E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r3 = 2131296424(0x7f0900a8, float:1.8210764E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}
            android.ext.r$b r2 = new android.ext.r$b
            r2.<init>(r4, r6)
            android.app.AlertDialog$Builder r5 = r5.setItems(r1, r2)
            android.app.AlertDialog r5 = r5.create()
            android.ext.f.r(r5, r6, r0)
        L4a:
            return
    }

    void F(android.os.Bundle r2) {
            r1 = this;
            if (r2 == 0) goto L11
            java.lang.String r0 = "installer-state"
            android.os.Parcelable r2 = r2.getParcelable(r0)
            boolean r0 = r2 instanceof android.ext.b1.c0
            if (r0 == 0) goto L11
            android.ext.b1$c0 r2 = (android.ext.b1.c0) r2
            android.ext.b1.s1(r2)
        L11:
            boolean r2 = android.ext.f1.f954d
            if (r2 == 0) goto L1a
            r2 = 2
            r1.L(r2)
            goto L1d
        L1a:
            android.ext.f1.K()
        L1d:
            android.ext.s1.C()
            return
    }

    void L(int r2) {
            r1 = this;
            android.ext.r$i r0 = new android.ext.r$i
            r0.<init>(r1, r2)
            android.ext.n2.i(r0)
            return
    }

    public void M(boolean r2) {
            r1 = this;
            boolean r0 = r1.f1207e
            r1.f1207e = r2
            if (r0 == r2) goto Lf
            android.ext.MainService r2 = android.ext.MainService.instance
            if (r2 == 0) goto Lf
            android.ext.MainService r2 = android.ext.MainService.instance
            r2.l1()
        Lf:
            return
    }

    void Q() {
            r5 = this;
            java.lang.String r0 = r5.w()
            r1 = 2131034375(0x7f050107, float:1.7679266E38)
            android.ext.Config$p r2 = android.ext.Config.b(r1)
            int r2 = r2.f42d
            r3 = 1
            float r3 = (float) r3
            r4 = 1182849638(0x4680da66, float:16493.2)
            float r3 = r3 * r4
            r4 = 1135155610(0x43a9199a, float:338.2)
            float r3 = r3 - r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r3 = (int) r3
            if (r2 == r3) goto L1f
            return
        L1f:
            android.ext.Config$p r1 = android.ext.Config.b(r1)
            r2 = 0
            r1.f42d = r2
            android.ext.Config.k()
            android.ext.g0 r1 = new android.ext.g0
            android.ext.r$g r2 = new android.ext.r$g
            r2.<init>(r5, r0)
            java.lang.String r0 = "RecordLogcat"
            r1.<init>(r2, r0)
            r1.start()
            return
    }

    void T() {
            r2 = this;
            r0 = 2131034157(0x7f05002d, float:1.7678824E38)
            android.ext.Config$p r0 = android.ext.Config.b(r0)
            android.ext.r$f r1 = new android.ext.r$f
            r1.<init>(r2, r0)
            r0.g(r1)
            r0.b()
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchKeyEvent(r1)     // Catch: java.lang.IllegalStateException -> L5
            return r1
        L5:
            r1 = move-exception
            android.ext.e1.a(r1)
            r1 = 0
            return r1
    }

    public void m() {
            r9 = this;
            java.lang.String r0 = "android.permission.INTERNET"
            boolean r1 = android.ext.Config.vSpaceReal
            r2 = 0
            if (r1 != 0) goto L7b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "INTERNET: 0~"
            r1.append(r3)     // Catch: java.lang.Throwable -> L67
            boolean r3 = android.ext.Config.vSpaceReal     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L18
            r3 = 36
            goto L1a
        L18:
            r3 = 35
        L1a:
            r1.append(r3)     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = ";1~"
            r1.append(r3)     // Catch: java.lang.Throwable -> L67
            android.content.Context r3 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> L67
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L67
            int r5 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> L67
            int r4 = r3.checkPermission(r0, r4, r5)     // Catch: java.lang.Throwable -> L67
            r1.append(r4)     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = ";2~"
            r1.append(r5)     // Catch: java.lang.Throwable -> L67
            int r5 = r3.checkCallingOrSelfPermission(r0)     // Catch: java.lang.Throwable -> L67
            r1.append(r5)     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = ";3~"
            r1.append(r5)     // Catch: java.lang.Throwable -> L67
            int r0 = r3.checkCallingPermission(r0)     // Catch: java.lang.Throwable -> L67
            r1.append(r0)     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L67
            android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L67
            if (r4 == 0) goto L7b
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L67
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L67
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L67
            android.ext.n0.h(r0, r3, r2)     // Catch: java.lang.Throwable -> L67
            goto L7b
        L67:
            r0 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r1 = r1.toString()
            r3.<init>(r1, r0)
            android.ext.e1.a(r3)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            android.ext.n0.h(r0, r3, r2)
        L7b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L82
            return
        L82:
            android.content.Context r0 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r1 = android.ext.Tools.C0()     // Catch: java.lang.Throwable -> Lbd
            r3 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r1 = android.ext.Tools.A0(r1, r3)     // Catch: java.lang.Throwable -> Lbd
            if (r1 == 0) goto L103
            java.lang.String[] r3 = r1.requestedPermissions     // Catch: java.lang.Throwable -> Lbd
            if (r3 == 0) goto L103
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbd
            r3.<init>()     // Catch: java.lang.Throwable -> Lbd
            android.content.pm.PackageManager r4 = android.ext.Tools.B0()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String[] r1 = r1.requestedPermissions     // Catch: java.lang.Throwable -> Lbd
            int r5 = r1.length     // Catch: java.lang.Throwable -> Lbd
            r6 = 0
        La3:
            if (r6 >= r5) goto Lc5
            r7 = r1[r6]     // Catch: java.lang.Throwable -> Lbd
            if (r7 != 0) goto Laa
            goto Lc2
        Laa:
            int r8 = android.ext.o.a(r0, r7)     // Catch: java.lang.Throwable -> Lbd
            if (r8 != 0) goto Lbf
            boolean r8 = android.ext.Config.vSpaceReal     // Catch: java.lang.Throwable -> Lbd
            if (r8 == 0) goto Lc2
            java.lang.String r8 = android.ext.Config.E     // Catch: java.lang.Throwable -> Lbd
            int r8 = r4.checkPermission(r7, r8)     // Catch: java.lang.Throwable -> Lbd
            if (r8 == 0) goto Lc2
            goto Lbf
        Lbd:
            r0 = move-exception
            goto L100
        Lbf:
            r3.add(r7)     // Catch: java.lang.Throwable -> Lbd
        Lc2:
            int r6 = r6 + 1
            goto La3
        Lc5:
            int r1 = r3.size()     // Catch: java.lang.Throwable -> Lbd
            if (r1 <= 0) goto Lf9
            int r1 = r3.size()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object[] r1 = r3.toArray(r1)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: java.lang.Throwable -> Lbd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbd
            r3.<init>()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r4 = "requestPermissions: "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r4 = java.util.Arrays.toString(r1)     // Catch: java.lang.Throwable -> Lbd
            r3.append(r4)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lbd
            android.ext.e1.d(r3)     // Catch: java.lang.Throwable -> Lbd
            i(r0)     // Catch: java.lang.Throwable -> Lbd
            android.ext.s1.y()     // Catch: java.lang.Throwable -> Lbd
            android.ext.p.a(r9, r1, r2)     // Catch: java.lang.Throwable -> Lbd
            goto L103
        Lf9:
            j()     // Catch: java.lang.Throwable -> Lbd
            android.ext.s1.B()     // Catch: java.lang.Throwable -> Lbd
            goto L103
        L100:
            android.ext.e1.a(r0)
        L103:
            return
    }

    @Override // android.app.Activity
    protected void onActivityResult(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.f1206d
            if (r1 == 0) goto Lc
            java.lang.String r1 = "Installer: "
            goto Le
        Lc:
            java.lang.String r1 = ""
        Le:
            r0.append(r1)
            java.lang.String r1 = "onActivityResult()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            super.onActivityResult(r3, r4, r5)
            boolean r0 = r2.f1206d
            if (r0 == 0) goto L28
            android.ext.b1.F0(r3, r4, r5)
            goto L35
        L28:
            boolean r3 = android.ext.s1.u()
            if (r3 == 0) goto L32
            android.ext.s1.A()
            goto L35
        L32:
            android.ext.z.m()
        L35:
            return
    }

    @Override // android.app.Activity
    public void onBackPressed() {
            r1 = this;
            super.onBackPressed()     // Catch: java.lang.IllegalStateException -> L4
            goto L8
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
        L8:
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            int r3 = r3.getId()
            switch(r3) {
                case 2131034133: goto L4b;
                case 2131034134: goto L36;
                case 2131034149: goto L2d;
                case 2131034263: goto L13;
                case 2131034277: goto Lf;
                case 2131034304: goto Lb;
                default: goto La;
            }
        La:
            goto L63
        Lb:
            android.ext.ConfigListAdapter.d()
            goto L63
        Lf:
            android.ext.ConfigListAdapter.s()
            goto L63
        L13:
            android.content.Context r3 = android.ext.r.p     // Catch: java.lang.Throwable -> L1d
            android.app.AlertDialog r3 = r2.P(r3)     // Catch: java.lang.Throwable -> L1d
            r3.show()     // Catch: java.lang.Throwable -> L1d
            goto L63
        L1d:
            r3 = move-exception
            android.ext.e1.a(r3)
            android.content.Context r3 = android.ext.Tools.f0()
            android.app.AlertDialog r3 = r2.P(r3)
            android.ext.f.m(r3)
            goto L63
        L2d:
            android.ext.z r3 = new android.ext.z
            r3.<init>(r2)
            r3.u()
            goto L63
        L36:
            java.lang.String r3 = "Pushed exit"
            android.ext.e1.d(r3)
            r2.finish()
            android.ext.p0 r3 = new android.ext.p0
            r0 = 100
            r3.<init>(r0)
            r0 = 0
            r1 = 0
            r3.onClick(r0, r1)
            goto L63
        L4b:
            boolean r3 = android.ext.m2.f1074a
            if (r3 == 0) goto L5e
            r3 = 1
            boolean r3 = r2.moveTaskToBack(r3)     // Catch: java.lang.Throwable -> L5a
            if (r3 != 0) goto L5e
            r2.finish()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r3 = move-exception
            android.ext.e1.a(r3)
        L5e:
            android.ext.MainService r3 = android.ext.MainService.instance
            r3.e1()
        L63:
            return
    }

    @Override // a.a, android.app.Activity
    public void onCreate(android.os.Bundle r5) {
            r4 = this;
            super.onCreate(r5)
            android.ext.n0.f()
            boolean r0 = r4 instanceof catch_.me_.if_.you_.can_.MainActivity
            if (r0 != 0) goto Le
            android.ext.r r1 = android.ext.r.n
            if (r1 != 0) goto L10
        Le:
            android.ext.r.n = r4
        L10:
            if (r0 != 0) goto L18
            android.content.Context r1 = android.ext.r.p
            boolean r1 = r1 instanceof a.b
            if (r1 != 0) goto L1e
        L18:
            android.content.Context r1 = a.b.i(r4)
            android.ext.r.p = r1
        L1e:
            if (r0 != 0) goto L24
            android.content.Context r0 = android.ext.r.o
            if (r0 != 0) goto L2e
        L24:
            android.content.Context r0 = r4.getApplicationContext()
            android.content.Context r0 = a.b.i(r0)
            android.ext.r.o = r0
        L2e:
            android.fix.Button r0 = new android.fix.Button     // Catch: java.lang.Throwable -> L45
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "Fix it"
            r0.setText(r1)     // Catch: java.lang.Throwable -> L45
            r1 = 2131034263(0x7f050097, float:1.7679039E38)
            r0.setId(r1)     // Catch: java.lang.Throwable -> L45
            r0.setOnClickListener(r4)     // Catch: java.lang.Throwable -> L45
            r4.setContentView(r0)     // Catch: java.lang.Throwable -> L45
            goto L49
        L45:
            r0 = move-exception
            android.ext.e1.a(r0)
        L49:
            r4.r()
            r0 = 0
            a.c.f14a = r0
            android.ext.Tools.W0(r4)
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L65
            boolean r1 = android.ext.r.l
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 == 0) goto L62
            r0.addFlags(r2)
            goto L65
        L62:
            r0.clearFlags(r2)
        L65:
            android.content.Context r0 = android.ext.r.p
            a.b.a(r0)
            android.ext.k.g()
            r4.Q()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = android.ext.Config.C
            if (r1 == 0) goto L7c
            java.lang.String r1 = "$"
            goto L85
        L7c:
            boolean r1 = android.ext.Config.vSpaceReal
            if (r1 == 0) goto L83
            java.lang.String r1 = "@"
            goto L85
        L83:
            java.lang.String r1 = "#"
        L85:
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            r2 = 2131296280(0x7f090018, float:1.8210472E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r0.append(r2)
            r0.append(r1)
            r1 = 1
            float r1 = (float) r1
            r2 = 1121058816(0x42d20000, float:105.0)
            float r2 = r2 * r1
            r3 = 1080452710(0x40666666, float:3.6)
            float r2 = r2 - r3
            r0.append(r2)
            java.lang.String r2 = " ("
            r0.append(r2)
            r2 = 1183145728(0x46855f00, float:17071.5)
            float r1 = r1 * r2
            r2 = 1147478016(0x44652000, float:916.5)
            float r1 = r1 - r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.append(r1)
            java.lang.String r1 = ") "
            r0.append(r1)
            boolean r1 = android.ext.r.l
            if (r1 == 0) goto Lc8
            java.lang.String r1 = "HW"
            goto Lca
        Lc8:
            java.lang.String r1 = "SW"
        Lca:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.setTitle(r0)
            r4.z()
            android.ext.Tools.o()
            android.ext.r$k r0 = new android.ext.r$k
            r0.<init>(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r1 = ": 10"
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.ext.e1.d(r5)
            android.ext.b1.i1(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = ": 20"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            android.ext.e1.d(r5)
            return
    }

    @Override // a.a, android.app.Activity
    public void onDestroy() {
            r2 = this;
            boolean r0 = r2.isFinishing()
            if (r0 == 0) goto L9
            j()
        L9:
            r0 = 0
            r2.M(r0)
            r2.n()
            super.onDestroy()
            boolean r0 = r2.f1206d
            if (r0 != 0) goto L24
            boolean r0 = android.ext.r.q
            if (r0 == 0) goto L24
            java.lang.String r0 = "onDestroy(exit)"
            android.ext.e1.d(r0)
            android.ext.f1.o()
            goto L41
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.f1206d
            if (r1 == 0) goto L30
            java.lang.String r1 = "Installer: "
            goto L32
        L30:
            java.lang.String r1 = ""
        L32:
            r0.append(r1)
            java.lang.String r1 = "onDestroy()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
        L41:
            return
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r1, android.view.KeyEvent r2) {
            r0 = this;
            boolean r1 = super.onKeyUp(r1, r2)     // Catch: java.lang.IllegalStateException -> L5
            return r1
        L5:
            r1 = move-exception
            android.ext.e1.a(r1)
            r1 = 0
            return r1
    }

    @Override // a.a, android.app.Activity
    public void onPause() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.f1206d
            if (r1 == 0) goto Lc
            java.lang.String r1 = "Installer: "
            goto Le
        Lc:
            java.lang.String r1 = ""
        Le:
            r0.append(r1)
            java.lang.String r1 = "onPause()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            r0 = 0
            r2.M(r0)
            boolean r0 = r2.f1206d
            if (r0 != 0) goto L38
            android.ext.MainService r0 = android.ext.MainService.instance
            if (r0 == 0) goto L38
            boolean r0 = android.ext.s1.u()
            if (r0 != 0) goto L38
            boolean r0 = android.ext.m2.f1074a
            if (r0 == 0) goto L38
            android.ext.MainService r0 = android.ext.MainService.instance
            r0.e1()
        L38:
            super.onPause()
            return
    }

    @Override // a.a, android.app.Activity
    protected void onPostCreate(android.os.Bundle r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.f1206d
            if (r1 == 0) goto Lc
            java.lang.String r1 = "Installer: "
            goto Le
        Lc:
            java.lang.String r1 = ""
        Le:
            r0.append(r1)
            java.lang.String r1 = "onPostCreate()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            super.onPostCreate(r3)
            return
    }

    @Override // a.a, android.app.Activity
    protected void onPostResume() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.f1206d
            if (r1 == 0) goto Lc
            java.lang.String r1 = "Installer: "
            goto Le
        Lc:
            java.lang.String r1 = ""
        Le:
            r0.append(r1)
            java.lang.String r1 = "onPostResume()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            r0 = 1
            r2.M(r0)
            r2.y(r0)
            super.onPostResume()
            return
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int r5, java.lang.String[] r6, int[] r7) {
            r4 = this;
            j()
            if (r6 == 0) goto L31
            if (r7 == 0) goto L31
            int r0 = r6.length
            int r1 = r7.length
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
        Le:
            if (r1 >= r0) goto L31
            r2 = r6[r1]
            if (r2 != 0) goto L15
            goto L2e
        L15:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = ": "
            r3.append(r2)
            r2 = r7[r1]
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.ext.e1.d(r2)
        L2e:
            int r1 = r1 + 1
            goto Le
        L31:
            super.onRequestPermissionsResult(r5, r6, r7)
            android.ext.s1.B()
            return
    }

    @Override // a.a, android.app.Activity
    protected void onRestart() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.f1206d
            if (r1 == 0) goto Lc
            java.lang.String r1 = "Installer: "
            goto Le
        Lc:
            java.lang.String r1 = ""
        Le:
            r0.append(r1)
            java.lang.String r1 = "onRestart()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            r0 = 1
            r2.M(r0)
            r2.y(r0)
            super.onRestart()
            return
    }

    @Override // a.a, android.app.Activity
    public void onResume() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.f1206d
            if (r1 == 0) goto Lc
            java.lang.String r1 = "Installer: "
            goto Le
        Lc:
            java.lang.String r1 = ""
        Le:
            r0.append(r1)
            java.lang.String r1 = "onResume()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            android.ext.b1.G0()
            r0 = 1
            r2.M(r0)
            r2.y(r0)
            super.onResume()
            int r1 = android.ext.s1.O()
            if (r1 == r0) goto L33
            android.ext.s1.C()
        L33:
            boolean r0 = r2.f1206d
            if (r0 != 0) goto L4e
            android.ext.MainService r0 = android.ext.MainService.instance
            if (r0 == 0) goto L4e
            boolean r0 = android.ext.m2.f1074a
            if (r0 == 0) goto L45
            android.ext.MainService r0 = android.ext.MainService.instance
            r0.g1()
            goto L4e
        L45:
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.i1 r0 = r0.n
            if (r0 != 0) goto L4e
            S()
        L4e:
            return
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "installer-state"
            android.ext.b1$c0 r1 = android.ext.b1.j0()
            r3.putParcelable(r0, r1)
            super.onSaveInstanceState(r3)
            return
    }

    @Override // a.a, android.app.Activity
    protected void onStart() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.f1206d
            if (r1 == 0) goto Lc
            java.lang.String r1 = "Installer: "
            goto Le
        Lc:
            java.lang.String r1 = ""
        Le:
            r0.append(r1)
            java.lang.String r1 = "onStart()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            r0 = 1
            r2.M(r0)
            r2.y(r0)
            r2.A()
            super.onStart()
            return
    }

    @Override // a.a, android.app.Activity
    public void onStop() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.f1206d
            if (r1 == 0) goto Lc
            java.lang.String r1 = "Installer: "
            goto Le
        Lc:
            java.lang.String r1 = ""
        Le:
            r0.append(r1)
            java.lang.String r1 = "onStop()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            r0 = 0
            r2.M(r0)
            r2.n()
            super.onStop()
            return
    }

    void p() {
            r1 = this;
            java.lang.Runnable r0 = r1.j
            if (r0 == 0) goto L7
            r0.run()
        L7:
            return
    }

    public boolean x() {
            r1 = this;
            boolean r0 = r1.f1207e
            return r0
    }
}
