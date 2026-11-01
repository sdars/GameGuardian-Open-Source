package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.ext.z1.d f1019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f1020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile java.lang.Runnable f1021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f1022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.String f1024f;

    class a implements java.lang.Runnable {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.ext.MainService r0 = android.ext.MainService.instance
                android.ext.f0 r0 = r0.i
                r0.U()
                return
        }
    }

    class b implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.List f1026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.j f1027c;

        b(android.ext.j r1, int r2, java.util.List r3) {
                r0 = this;
                r0.f1027c = r1
                r0.f1025a = r2
                r0.f1026b = r3
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r3, int r4) {
                r2 = this;
                int r0 = r2.f1025a
                if (r4 != r0) goto Lb
                r3 = 2131296621(0x7f09016d, float:1.8211164E38)
                android.ext.ConfigListAdapter.t(r3)
                return
            Lb:
                android.ext.j r0 = r2.f1027c
                java.util.List r1 = r2.f1026b
                java.lang.Object r4 = r1.get(r4)
                android.ext.z1$d r4 = (android.ext.z1.d) r4
                r0.f(r4)
                android.ext.j r4 = r2.f1027c
                r0 = 1
                r4.f1020b = r0
                android.ext.Tools.D(r3)
                android.ext.j r3 = r2.f1027c
                java.lang.Runnable r3 = r3.f1021c
                if (r3 == 0) goto L2e
                android.ext.j r4 = r2.f1027c
                r0 = 0
                r4.f1021c = r0
                r3.run()
            L2e:
                return
        }
    }

    public j(android.app.ActivityManager r3, android.content.pm.PackageManager r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1020b = r0
            r1 = 0
            r2.f1021c = r1
            r2.f1022d = r0
            r2.f1023e = r0
            r2.f1024f = r1
            android.ext.z1 r0 = new android.ext.z1
            r0.<init>(r3, r4)
            return
    }

    private static void h() {
            android.os.Handler r0 = android.ext.n2.d()
            android.ext.j$a r1 = new android.ext.j$a
            r1.<init>()
            r0.post(r1)
            return
    }

    public boolean a(boolean r4, java.lang.Runnable r5) {
            r3 = this;
            r0 = 0
            r3.f1021c = r0
            boolean r0 = r3.f1020b
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Lf
            r3.b(r2)
            r3.f1021c = r5
            return r1
        Lf:
            if (r4 == 0) goto L14
            r3.b(r1)
        L14:
            return r2
    }

    public void b(boolean r2) {
            r1 = this;
            r0 = 0
            r1.c(r2, r0)
            return
    }

    public void c(boolean r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.f1022d
            r1 = 0
            if (r0 == 0) goto L19
            if (r3 == 0) goto L18
            android.ext.MainService r3 = android.ext.MainService.instance
            android.ext.f0 r3 = r3.i
            boolean r3 = r3.d0()
            if (r3 != 0) goto L12
            return
        L12:
            r3 = 2131296365(0x7f09006d, float:1.8210645E38)
            android.ext.Tools.I1(r3, r1)
        L18:
            return
        L19:
            r0 = 1
            r2.f1022d = r0
            r2.f1023e = r3
            r2.f1024f = r4
            if (r3 == 0) goto L28
            r3 = 2131296991(0x7f0902df, float:1.8211914E38)
            android.ext.Tools.I1(r3, r1)
        L28:
            h()
            return
    }

    public void d(java.util.List r13) {
            r12 = this;
            boolean r0 = r12.f1022d
            if (r0 == 0) goto L100
            r0 = 0
            int r1 = r13.size()     // Catch: java.lang.Throwable -> L1c
            r2 = 2131296621(0x7f09016d, float:1.8211164E38)
            if (r1 != 0) goto L2e
            java.lang.String r13 = "listProcesses empty"
            android.ext.e1.p(r13)     // Catch: java.lang.Throwable -> L1c
            boolean r13 = r12.f1023e     // Catch: java.lang.Throwable -> L1c
            if (r13 != 0) goto L1f
            android.ext.z1$d r13 = r12.f1019a     // Catch: java.lang.Throwable -> L1c
            if (r13 != 0) goto Lfa
            goto L1f
        L1c:
            r13 = move-exception
            goto Lfd
        L1f:
            r13 = 2131296436(0x7f0900b4, float:1.8210789E38)
            android.ext.Tools.H1(r13)     // Catch: java.lang.Throwable -> L1c
            boolean r13 = android.ext.Config.C     // Catch: java.lang.Throwable -> L1c
            if (r13 == 0) goto Lfa
            android.ext.ConfigListAdapter.t(r2)     // Catch: java.lang.Throwable -> L1c
            goto Lfa
        L2e:
            android.ext.z1$d r1 = r12.f1019a     // Catch: java.lang.Throwable -> L1c
            r3 = 1
            if (r1 == 0) goto L4d
            java.util.Iterator r1 = r13.iterator()     // Catch: java.lang.Throwable -> L1c
        L37:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L1c
            android.ext.z1$d r4 = (android.ext.z1.d) r4     // Catch: java.lang.Throwable -> L1c
            int r4 = r4.f1437f     // Catch: java.lang.Throwable -> L1c
            android.ext.z1$d r5 = r12.f1019a     // Catch: java.lang.Throwable -> L1c
            int r5 = r5.f1437f     // Catch: java.lang.Throwable -> L1c
            if (r4 != r5) goto L37
            r1 = 1
            goto L4e
        L4d:
            r1 = 0
        L4e:
            java.lang.String r4 = r12.f1024f     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L77
            java.util.Iterator r4 = r13.iterator()     // Catch: java.lang.Throwable -> L1c
        L56:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L1c
            if (r5 == 0) goto L72
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L1c
            android.ext.z1$d r5 = (android.ext.z1.d) r5     // Catch: java.lang.Throwable -> L1c
            java.lang.String r6 = r5.f1434c     // Catch: java.lang.Throwable -> L1c
            java.lang.String r7 = r12.f1024f     // Catch: java.lang.Throwable -> L1c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L1c
            if (r6 == 0) goto L56
            r12.f(r5)     // Catch: java.lang.Throwable -> L1c
            r1 = 1
            r4 = 1
            goto L73
        L72:
            r4 = 0
        L73:
            if (r4 != r3) goto L77
            r12.f1023e = r0     // Catch: java.lang.Throwable -> L1c
        L77:
            if (r1 != 0) goto L82
            java.lang.Object r1 = r13.get(r0)     // Catch: java.lang.Throwable -> L1c
            android.ext.z1$d r1 = (android.ext.z1.d) r1     // Catch: java.lang.Throwable -> L1c
            r12.f(r1)     // Catch: java.lang.Throwable -> L1c
        L82:
            boolean r1 = android.ext.Config.C     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto La3
            byte r1 = android.ext.Config.G     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto La3
            java.lang.Object r1 = r13.get(r0)     // Catch: java.lang.Throwable -> L1c
            android.ext.z1$d r1 = (android.ext.z1.d) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.n     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto La0
            java.lang.String r1 = android.ext.Config.E     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "64"
            boolean r1 = r1.contains(r4)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto La0
            r1 = 1
            goto La1
        La0:
            r1 = 2
        La1:
            android.ext.Config.G = r1     // Catch: java.lang.Throwable -> L1c
        La3:
            boolean r1 = r12.f1023e     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto Lfa
            int r1 = r13.size()     // Catch: java.lang.Throwable -> L1c
            android.ext.z1$c r5 = new android.ext.z1$c     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "stub"
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = android.ext.b2.f(r2)     // Catch: java.lang.Throwable -> L1c
            r5.f1428d = r2     // Catch: java.lang.Throwable -> L1c
            r5.h = r3     // Catch: java.lang.Throwable -> L1c
            android.ext.z1$d r2 = new android.ext.z1$d     // Catch: java.lang.Throwable -> L1c
            r6 = 1
            r7 = 1
            java.lang.String r8 = "stub"
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1c
            r3 = 2130968623(0x7f04002f, float:1.7545905E38)
            android.graphics.drawable.Drawable r3 = android.ext.Tools.o0(r3)     // Catch: java.lang.Throwable -> L1c
            r2.f1436e = r3     // Catch: java.lang.Throwable -> L1c
            r13.add(r2)     // Catch: java.lang.Throwable -> L1c
            android.ext.a2 r2 = new android.ext.a2     // Catch: java.lang.Throwable -> L1c
            r2.<init>(r13)     // Catch: java.lang.Throwable -> L1c
            android.ext.z1.p(r13)     // Catch: java.lang.Throwable -> L1c
            android.content.Context r3 = android.ext.Tools.k0()     // Catch: java.lang.Throwable -> L1c
            android.app.AlertDialog$Builder r3 = android.ext.f.c(r3)     // Catch: java.lang.Throwable -> L1c
            r4 = 2131296897(0x7f090281, float:1.8211724E38)
            android.view.View r4 = android.ext.Tools.g0(r4)     // Catch: java.lang.Throwable -> L1c
            android.app.AlertDialog$Builder r3 = r3.setCustomTitle(r4)     // Catch: java.lang.Throwable -> L1c
            android.ext.j$b r4 = new android.ext.j$b     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r12, r1, r13)     // Catch: java.lang.Throwable -> L1c
            android.app.AlertDialog$Builder r13 = r3.setAdapter(r2, r4)     // Catch: java.lang.Throwable -> L1c
            android.ext.f.o(r13)     // Catch: java.lang.Throwable -> L1c
        Lfa:
            r12.f1022d = r0
            goto L100
        Lfd:
            r12.f1022d = r0
            throw r13
        L100:
            return
    }

    public boolean e() {
            r1 = this;
            boolean r0 = r1.f1020b
            return r0
    }

    void f(android.ext.z1.d r3) {
            r2 = this;
            r3.h()
            r3.k()
            r2.f1019a = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "used: "
            r0.append(r1)
            java.lang.String r1 = r3.d()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            android.ext.MainService r0 = android.ext.MainService.instance
            r0.Q0(r3)
            return
    }

    public void g() {
            r1 = this;
            r0 = 0
            r1.f1020b = r0
            return
    }
}
