package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class x implements android.content.DialogInterface.OnShowListener, android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile android.app.AlertDialog f1290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final android.widget.TextView f1291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final android.widget.ProgressBar f1292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final android.widget.TextView f1293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final android.view.View f1294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final android.widget.ProgressBar f1295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final android.widget.TextView f1296g;
    final android.widget.TextView h;
    final android.widget.TextView i;
    final android.view.View j;
    long k;
    long l;
    long m;
    final java.lang.Runnable n;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.x f1297a;

        a(android.ext.x r1) {
                r0 = this;
                r0.f1297a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.ext.x r0 = r1.f1297a
                android.app.AlertDialog r0 = r0.f1290a
                if (r0 == 0) goto L9
                android.ext.f.m(r0)
            L9:
                return
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.x f1298a;

        b(android.ext.x r1) {
                r0 = this;
                r0.f1298a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r13 = this;
                android.ext.x r0 = r13.f1298a
                r1 = -1
                r0.k = r1
                android.app.AlertDialog$Builder r1 = android.ext.f.b()
                android.ext.x r2 = r13.f1298a
                android.view.View r2 = r2.j
                android.view.View r2 = android.ext.Tools.O0(r2)
                android.app.AlertDialog$Builder r1 = r1.setView(r2)
                r2 = 0
                android.app.AlertDialog$Builder r1 = r1.setCancelable(r2)
                r2 = 2131296674(0x7f0901a2, float:1.8211271E38)
                r3 = 0
                android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r3)
                r2 = 2131296311(0x7f090037, float:1.8210535E38)
                android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r2, r3)
                android.app.AlertDialog r1 = r1.create()
                r0.f1290a = r1
                android.ext.x r2 = r13.f1298a
                java.lang.String r3 = ""
                r4 = -1
                r6 = 1
                r8 = 0
                r9 = 1
                r10 = 0
                java.lang.String r12 = ""
                r2.c(r3, r4, r6, r8, r9, r10, r12)
                android.ext.x r0 = r13.f1298a
                android.app.AlertDialog r0 = r0.f1290a
                android.ext.x r1 = r13.f1298a
                android.ext.f.l(r0, r1)
                android.ext.MainService r0 = android.ext.MainService.instance
                android.ext.i1 r0 = r0.n
                if (r0 == 0) goto L64
                android.os.Handler r0 = android.ext.n2.d()
                android.ext.x r1 = r13.f1298a
                java.lang.Runnable r1 = r1.n
                r0.removeCallbacks(r1)
                android.ext.x r1 = r13.f1298a
                java.lang.Runnable r1 = r1.n
                r2 = 100
                r0.postDelayed(r1, r2)
            L64:
                return
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.CharSequence f1299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f1300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f1301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1302d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f1303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f1304f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ java.lang.String f1305g;
        final /* synthetic */ android.ext.x h;

        c(android.ext.x r1, java.lang.CharSequence r2, long r3, long r5, int r7, int r8, long r9, java.lang.String r11) {
                r0 = this;
                r0.h = r1
                r0.f1299a = r2
                r0.f1300b = r3
                r0.f1301c = r5
                r0.f1302d = r7
                r0.f1303e = r8
                r0.f1304f = r9
                r0.f1305g = r11
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r11 = this;
                android.ext.x r0 = r11.h
                java.lang.CharSequence r1 = r11.f1299a
                long r2 = r11.f1300b
                long r4 = r11.f1301c
                int r6 = r11.f1302d
                int r7 = r11.f1303e
                long r8 = r11.f1304f
                java.lang.String r10 = r11.f1305g
                r0.d(r1, r2, r4, r6, r7, r8, r10)
                return
        }
    }

    public x() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.k = r0
            r2.l = r0
            r2.m = r0
            android.ext.x$a r0 = new android.ext.x$a
            r0.<init>(r2)
            r2.n = r0
            r0 = 2131099673(0x7f060019, float:1.7811706E38)
            r1 = 0
            android.view.View r0 = a.d.f(r0, r1)
            r2.j = r0
            r1 = 2131034328(0x7f0500d8, float:1.767917E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.f1291b = r1
            r1 = 2131034357(0x7f0500f5, float:1.767923E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r2.f1292c = r1
            r1 = 2131034360(0x7f0500f8, float:1.7679235E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.f1293d = r1
            r1 = 2131034414(0x7f05012e, float:1.7679345E38)
            android.view.View r1 = r0.findViewById(r1)
            r2.f1294e = r1
            r1 = 2131034358(0x7f0500f6, float:1.7679231E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r2.f1295f = r1
            r1 = 2131034359(0x7f0500f7, float:1.7679233E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.f1296g = r1
            r1 = 2131034264(0x7f050098, float:1.767904E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.h = r1
            r1 = 2131034425(0x7f050139, float:1.7679367E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.i = r1
            r1 = 2131034279(0x7f0500a7, float:1.7679071E38)
            android.view.View r0 = r0.findViewById(r1)
            r0.setOnClickListener(r2)
            return
    }

    public void a(boolean r4) {
            r3 = this;
            android.app.AlertDialog r0 = r3.f1290a
            if (r0 != 0) goto L5
            return
        L5:
            android.os.Handler r1 = android.ext.n2.d()
            java.lang.Runnable r2 = r3.n
            r1.removeCallbacks(r2)
            android.ext.Tools.D(r0)
            if (r4 == 0) goto L16
            r4 = 0
            r3.f1290a = r4
        L16:
            return
    }

    public boolean b() {
            r1 = this;
            android.app.AlertDialog r0 = r1.f1290a
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void c(java.lang.CharSequence r14, long r15, long r17, int r19, int r20, long r21, java.lang.String r23) {
            r13 = this;
            boolean r0 = r13.b()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = android.ext.n2.e()
            if (r0 == 0) goto L11
            r13.d(r14, r15, r17, r19, r20, r21, r23)
            goto L27
        L11:
            android.ext.x$c r0 = new android.ext.x$c
            r1 = r0
            r2 = r13
            r3 = r14
            r4 = r15
            r6 = r17
            r8 = r19
            r9 = r20
            r10 = r21
            r12 = r23
            r1.<init>(r2, r3, r4, r6, r8, r9, r10, r12)
            android.ext.n2.i(r0)
        L27:
            return
    }

    void d(java.lang.CharSequence r19, long r20, long r22, int r24, int r25, long r26, java.lang.String r28) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r4 = r22
            r6 = r24
            r7 = r25
            r8 = r28
            if (r1 == 0) goto L15
            android.widget.TextView r9 = r0.f1291b
            r9.setText(r1)
        L15:
            r1 = 1
            r9 = 0
            r10 = 0
            int r12 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r12 < 0) goto L39
            int r13 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r13 != 0) goto L22
            goto L39
        L22:
            android.widget.ProgressBar r13 = r0.f1292c
            r13.setIndeterminate(r9)
            android.widget.ProgressBar r13 = r0.f1292c
            int r14 = (int) r4
            r13.setMax(r14)
            android.widget.ProgressBar r13 = r0.f1292c
            int r14 = (int) r2
            r13.setProgress(r14)
            android.widget.TextView r13 = r0.f1293d
            r13.setText(r8)
            goto L43
        L39:
            android.widget.TextView r13 = r0.f1293d
            r13.setText(r8)
            android.widget.ProgressBar r8 = r0.f1292c
            r8.setIndeterminate(r1)
        L43:
            if (r6 < 0) goto L7d
            if (r7 > r1) goto L4f
            android.view.View r6 = r0.f1294e
            r7 = 8
            r6.setVisibility(r7)
            goto L7d
        L4f:
            android.widget.ProgressBar r8 = r0.f1295f
            r8.setMax(r7)
            android.widget.ProgressBar r8 = r0.f1295f
            r8.setProgress(r6)
            android.widget.TextView r8 = r0.f1296g
            r13 = 2131296492(0x7f0900ec, float:1.8210902E38)
            java.lang.String r13 = android.ext.b2.f(r13)
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r24)
            r14[r9] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r25)
            r14[r1] = r6
            java.lang.String r6 = android.ext.Tools.L1(r13, r14)
            r8.setText(r6)
            android.view.View r6 = r0.f1294e
            r6.setVisibility(r9)
        L7d:
            android.widget.TextView r6 = r0.h
            r7 = 2131296477(0x7f0900dd, float:1.8210872E38)
            java.lang.String r7 = android.ext.b2.f(r7)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Long r8 = java.lang.Long.valueOf(r26)
            r1[r9] = r8
            java.lang.String r1 = android.ext.Tools.L1(r7, r1)
            r6.setText(r1)
            long r6 = java.lang.System.currentTimeMillis()
            r8 = -1
            if (r12 >= 0) goto La4
            r0.k = r8
            r0.l = r8
            r0.m = r8
            goto Lb0
        La4:
            long r12 = r0.m
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 == 0) goto Lb0
            r0.k = r6
            r0.l = r2
            r0.m = r4
        Lb0:
            long r12 = r0.k
            int r1 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r1 < 0) goto Ldb
            long r14 = r6 - r12
            r16 = 2000(0x7d0, double:9.88E-321)
            int r1 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r1 < 0) goto Ldb
            long r14 = r0.l
            long r16 = r2 - r14
            int r1 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r1 != 0) goto Lc7
            goto Ldb
        Lc7:
            long r6 = r6 - r12
            double r6 = (double) r6
            long r4 = r4 - r2
            double r4 = (double) r4
            double r6 = r6 * r4
            long r1 = r2 - r14
            double r1 = (double) r1
            double r6 = r6 / r1
            r1 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r6 = r6 / r1
            long r8 = java.lang.Math.round(r6)
        Ldb:
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 > 0) goto Le7
            android.widget.TextView r1 = r0.i
            java.lang.String r2 = ""
        Le3:
            r1.setText(r2)
            goto L109
        Le7:
            android.widget.TextView r1 = r0.i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 2131297013(0x7f0902f5, float:1.8211959E38)
            java.lang.String r3 = android.ext.Tools.N1(r3)
            r2.append(r3)
            java.lang.String r3 = ": "
            r2.append(r3)
            java.lang.String r3 = android.ext.Tools.g1(r8)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto Le3
        L109:
            return
    }

    public boolean e(boolean r3) {
            r2 = this;
            android.app.AlertDialog r0 = r2.f1290a
            r1 = 1
            if (r0 == 0) goto L15
            android.ext.f.m(r0)
            if (r3 == 0) goto L14
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>()
            java.lang.String r0 = "Show busy dialog not first time"
            android.ext.e1.g(r0, r3)
        L14:
            return r1
        L15:
            if (r3 == 0) goto L1f
            android.ext.x$b r3 = new android.ext.x$b
            r3.<init>(r2)
            android.ext.n2.i(r3)
        L1f:
            return r1
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r1) {
            r0 = this;
            r1 = 2131296654(0x7f09018e, float:1.821123E38)
            android.ext.ConfigListAdapter.t(r1)
            return
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(android.content.DialogInterface r4) {
            r3 = this;
            r0 = 2131296674(0x7f0901a2, float:1.8211271E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.ext.MainService r1 = android.ext.MainService.instance
            r2 = -1
            android.ext.Tools.s1(r4, r2, r0, r1)
            r0 = 2131034112(0x7f050000, float:1.7678732E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.ext.MainService r1 = android.ext.MainService.instance
            r2 = -2
            android.ext.Tools.s1(r4, r2, r0, r1)
            return
    }
}
