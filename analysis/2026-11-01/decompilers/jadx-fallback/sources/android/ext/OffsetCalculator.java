package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class OffsetCalculator extends android.ext.p1 implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnShowListener, android.text.TextWatcher, java.lang.Runnable, android.widget.CompoundButton.OnCheckedChangeListener, android.content.DialogInterface.OnDismissListener {
    private static java.lang.String x = "";
    private static java.lang.String y = "";
    private static boolean z = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.Long f317g;
    private android.ext.EditText h;
    private android.ext.EditText i;
    private android.widget.TextView j;
    private android.widget.CheckBox k;
    private android.widget.ImageView l;
    private android.widget.TextView m;
    private android.widget.TextView n;
    private android.widget.TextView o;
    private android.widget.TextView p;
    private android.widget.TextView q;
    private android.widget.TextView r;
    private android.widget.TextView s;
    private android.widget.TextView t;
    private android.widget.TextView u;
    private android.widget.TextView v;
    private android.widget.TextView w;

    class a implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.OffsetCalculator f318a;

        a(android.ext.OffsetCalculator r1) {
                r0 = this;
                r0.f318a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r8, int r9) {
                r7 = this;
                android.ext.MainService r8 = android.ext.MainService.instance
                android.ext.SavedListAdapter r8 = r8.t0
                android.ext.h2 r6 = new android.ext.h2
                android.ext.OffsetCalculator r0 = r7.f318a
                long r1 = r0.f316f
                r3 = 0
                r0 = r6
                r5 = r9
                r0.<init>(r1, r3, r5)
                boolean r9 = r6.V()
                r0 = 1
                if (r9 != 0) goto L20
                long r1 = r6.f672a
                int r9 = android.ext.c.S(r1, r0)
                r6.f674c = r9
            L20:
                android.ext.OffsetCalculator r9 = r7.f318a
                long r1 = r9.f316f
                android.ext.h2 r9 = r8.e(r1)
                if (r9 == 0) goto L30
                int r9 = r9.f674c
                int r1 = r6.f674c
                if (r9 == r1) goto L36
            L30:
                r8.a(r6)
                r8.i()
            L36:
                r8 = 2131296721(0x7f0901d1, float:1.8211367E38)
                java.lang.String r8 = android.ext.b2.f(r8)
                java.lang.Object[] r9 = new java.lang.Object[r0]
                r1 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r9[r1] = r0
                java.lang.String r8 = android.ext.Tools.L1(r8, r9)
                android.ext.Tools.J1(r8)
                return
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.OffsetCalculator f321c;

        b(android.ext.OffsetCalculator r1, long r2, long r4) {
                r0 = this;
                r0.f321c = r1
                r0.f319a = r2
                r0.f320b = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                android.ext.OffsetCalculator r0 = r6.f321c     // Catch: java.lang.Throwable -> Lb
                long r1 = r6.f319a     // Catch: java.lang.Throwable -> Lb
                long r3 = r6.f320b     // Catch: java.lang.Throwable -> Lb
                r5 = 0
                r0.l(r1, r3, r5)     // Catch: java.lang.Throwable -> Lb
                goto L2c
            Lb:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed update value: "
                r1.append(r2)
                long r2 = r6.f319a
                r1.append(r2)
                r2 = 32
                r1.append(r2)
                long r2 = r6.f320b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.ext.e1.s(r1, r0)
            L2c:
                return
        }
    }

    static {
            return
    }

    public OffsetCalculator() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public OffsetCalculator(java.lang.Long r3) {
            r2 = this;
            r0 = 2131296834(0x7f090242, float:1.8211596E38)
            r1 = 2130968592(0x7f040010, float:1.7545842E38)
            r2.<init>(r0, r1)
            r0 = 0
            r2.f316f = r0
            r0 = 0
            r2.h = r0
            r2.i = r0
            r2.j = r0
            r2.k = r0
            r2.l = r0
            r2.f317g = r3
            return
    }

    private int h(long r4, long r6, int r8, android.widget.TextView r9, int r10, int r11, int r12, boolean r13) {
            r3 = this;
            if (r13 != 0) goto L14
            int r12 = r12 + (-1)
            long r12 = (long) r12
            long r12 = r12 & r4
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 != 0) goto L14
            java.lang.String r4 = android.ext.c.K(r4, r6, r10)
            if (r8 != 0) goto L16
            r8 = r11
            goto L16
        L14:
            java.lang.String r4 = "-"
        L16:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.CharSequence r4 = android.ext.c.A(r10)
            r5.append(r4)
            r4 = 59
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r9.setText(r4)
            return r8
    }

    private void i() {
            r6 = this;
            android.util.SparseIntArray r2 = new android.util.SparseIntArray
            r2.<init>()
            long r0 = r6.f316f
            r3 = 0
            int r0 = android.ext.c.T(r0, r3, r2)
            a.e r1 = android.ext.c.o(r0)
            android.ext.u2 r0 = new android.ext.u2
            java.lang.String r3 = "0"
            r4 = 2131297030(0x7f090306, float:1.8211993E38)
            java.lang.String r4 = android.ext.b2.f(r4)
            android.ext.OffsetCalculator$a r5 = new android.ext.OffsetCalculator$a
            r5.<init>(r6)
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private void k() {
            r11 = this;
            java.lang.String r0 = "; "
            java.lang.String r1 = "Failed parse"
            android.ext.EditText r2 = r11.i
            if (r2 == 0) goto Lc5
            android.widget.TextView r2 = r11.j
            if (r2 != 0) goto Le
            goto Lc5
        Le:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            r5 = 32
            r6 = 16
            android.ext.EditText r7 = r11.h     // Catch: java.lang.Throwable -> L2c
            android.text.Editable r7 = r7.getText()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L2c
            long r7 = android.ext.t1.r(r7, r6)     // Catch: java.lang.Throwable -> L2c
            goto L4e
        L2c:
            r7 = move-exception
            android.ext.e1.g(r1, r7)
            int r8 = r2.length()
            if (r8 == 0) goto L39
            r2.append(r0)
        L39:
            r8 = 2131296264(0x7f090008, float:1.821044E38)
            java.lang.String r8 = android.ext.b2.f(r8)
            r2.append(r8)
            r2.append(r5)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            r7 = r3
        L4e:
            android.ext.EditText r9 = r11.i
            android.text.Editable r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r9.trim()
            android.widget.CheckBox r10 = r11.k     // Catch: java.lang.Throwable -> L6f
            boolean r10 = r10.isChecked()     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L65
            goto L67
        L65:
            r6 = 10
        L67:
            long r9 = android.ext.t1.r(r9, r6)     // Catch: java.lang.Throwable -> L6f
            long r7 = r7 + r9
            r11.f316f = r7     // Catch: java.lang.Throwable -> L6f
            goto L92
        L6f:
            r6 = move-exception
            android.ext.e1.g(r1, r6)
            int r1 = r2.length()
            if (r1 == 0) goto L7c
            r2.append(r0)
        L7c:
            r0 = 2131296833(0x7f090241, float:1.8211594E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r6.getMessage()
            r2.append(r0)
            r11.f316f = r3
        L92:
            int r0 = r2.length()
            if (r0 == 0) goto L9b
            r0 = 1
            r8 = 1
            goto L9d
        L9b:
            r0 = 0
            r8 = 0
        L9d:
            if (r8 != 0) goto Lb4
            long r0 = r11.f316f
            r3 = 4
            java.lang.String r0 = android.ext.c.G(r0, r3)
            r2.append(r0)
            android.os.Handler r0 = android.ext.n2.c()
            r0.removeCallbacks(r11)
            r0.post(r11)
            goto Lbc
        Lb4:
            r4 = 0
            r6 = 0
            r3 = r11
            r3.l(r4, r6, r8)
        Lbc:
            android.widget.TextView r0 = r11.j
            java.lang.String r1 = r2.toString()
            r0.setText(r1)
        Lc5:
            return
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable r1) {
            r0 = this;
            r0.k()
            return
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public void j(java.lang.String r5) {
            r4 = this;
            r0 = 2131099683(0x7f060023, float:1.7811726E38)
            r1 = 0
            android.view.View r0 = a.d.f(r0, r1)
            r2 = 2131034123(0x7f05000b, float:1.7678755E38)
            android.view.View r2 = r0.findViewById(r2)
            android.ext.EditText r2 = (android.ext.EditText) r2
            r4.h = r2
            r2 = 2131034348(0x7f0500ec, float:1.767921E38)
            android.view.View r2 = r0.findViewById(r2)
            android.ext.EditText r2 = (android.ext.EditText) r2
            r4.i = r2
            r2 = 2131034379(0x7f05010b, float:1.7679274E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r4.j = r2
            r2 = 2131034384(0x7f050110, float:1.7679284E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.widget.ImageView r2 = android.ext.Config.m(r2)
            r4.l = r2
            r2.setOnClickListener(r4)
            r2 = 2131034280(0x7f0500a8, float:1.7679073E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            r4.k = r2
            boolean r3 = android.ext.OffsetCalculator.z
            r2.setChecked(r3)
            android.widget.CheckBox r2 = r4.k
            r2.setOnCheckedChangeListener(r4)
            r2 = 2131034446(0x7f05014e, float:1.767941E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r4.m = r2
            r2 = 2131034449(0x7f050151, float:1.7679416E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r4.n = r2
            r2 = 2131034451(0x7f050153, float:1.767942E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r4.o = r2
            r2 = 2131034447(0x7f05014f, float:1.7679412E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r4.p = r2
            r2 = 2131034443(0x7f05014b, float:1.7679404E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r4.q = r2
            r2 = 2131034444(0x7f05014c, float:1.7679406E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r4.r = r2
            r2 = 2131034442(0x7f05014a, float:1.7679402E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r4.s = r2
            r2 = 2131034453(0x7f050155, float:1.7679424E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r4.t = r2
            r2 = 2131034441(0x7f050149, float:1.76794E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r4.u = r2
            r2 = 2131034448(0x7f050150, float:1.7679414E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r4.v = r2
            r2 = 2131034454(0x7f050156, float:1.7679426E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r4.w = r2
            android.ext.EditText r2 = r4.h
            if (r5 != 0) goto Lcf
            java.lang.String r5 = android.ext.OffsetCalculator.x
        Lcf:
            r2.setText(r5)
            android.ext.EditText r5 = r4.h
            r2 = 1
            r5.setDataType(r2)
            android.ext.EditText r5 = r4.i
            java.lang.String r3 = android.ext.OffsetCalculator.y
            r5.setText(r3)
            android.ext.EditText r5 = r4.i
            r5.setDataType(r2)
            android.ext.EditText r5 = r4.h
            r5.addTextChangedListener(r4)
            android.ext.EditText r5 = r4.i
            r5.addTextChangedListener(r4)
            r4.k()
            android.app.AlertDialog$Builder r5 = android.ext.f.b()
            android.view.View r0 = android.ext.InternalKeyboard.d(r0)
            android.app.AlertDialog$Builder r5 = r5.setView(r0)
            r0 = 2131296514(0x7f090102, float:1.8210947E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            android.app.AlertDialog$Builder r5 = r5.setPositiveButton(r0, r4)
            r0 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            android.app.AlertDialog$Builder r5 = r5.setNegativeButton(r0, r1)
            r0 = 2131296338(0x7f090052, float:1.821059E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            android.app.AlertDialog$Builder r5 = r5.setNeutralButton(r0, r4)
            android.app.AlertDialog r5 = r5.create()
            android.ext.f.k(r5, r4)
            android.ext.f.l(r5, r4)
            android.ext.EditText r0 = r4.i
            android.ext.f.n(r5, r0)
            return
    }

    void l(long r13, long r15, boolean r17) {
            r12 = this;
            r11 = r12
            android.widget.TextView r0 = r11.j
            if (r0 != 0) goto L6
            return
        L6:
            r5 = 0
            android.widget.TextView r6 = r11.s
            r7 = 64
            r8 = 8
            r9 = 4
            r0 = r12
            r1 = r13
            r3 = r15
            r10 = r17
            int r5 = r0.h(r1, r3, r5, r6, r7, r8, r9, r10)
            android.widget.TextView r6 = r11.v
            r7 = 32
            int r5 = r0.h(r1, r3, r5, r6, r7, r8, r9, r10)
            android.widget.TextView r6 = r11.r
            r7 = 16
            r8 = 4
            int r5 = r0.h(r1, r3, r5, r6, r7, r8, r9, r10)
            android.widget.TextView r6 = r11.q
            r7 = 4
            int r5 = r0.h(r1, r3, r5, r6, r7, r8, r9, r10)
            android.widget.TextView r6 = r11.w
            r7 = 8
            int r5 = r0.h(r1, r3, r5, r6, r7, r8, r9, r10)
            android.widget.TextView r6 = r11.t
            r7 = 2
            r8 = 2
            r9 = 2
            int r5 = r0.h(r1, r3, r5, r6, r7, r8, r9, r10)
            android.widget.TextView r6 = r11.u
            r7 = 1
            r8 = 1
            r9 = 1
            int r0 = r0.h(r1, r3, r5, r6, r7, r8, r9, r10)
            if (r0 != 0) goto L4c
            r0 = 1
        L4c:
            r1 = 1
            r3 = 8
            if (r17 != 0) goto L74
            if (r0 == r3) goto L5b
            int r4 = r0 * 8
            long r4 = r1 << r4
            long r4 = r4 - r1
            long r4 = r4 & r15
            goto L5c
        L5b:
            r4 = r15
        L5c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r7 = r0 * 2
            java.lang.String r7 = android.ext.t2.e(r7, r4)
            r6.append(r7)
            java.lang.String r7 = "h;"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto L77
        L74:
            java.lang.String r6 = "-h;"
            r4 = r15
        L77:
            android.widget.TextView r7 = r11.m
            r7.setText(r6)
            if (r17 != 0) goto La5
            long r6 = java.lang.Long.reverseBytes(r4)
            int r8 = r0 * 8
            int r9 = 64 - r8
            long r6 = r6 >> r9
            if (r0 == r3) goto L8d
            long r8 = r1 << r8
            long r8 = r8 - r1
            long r6 = r6 & r8
        L8d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r0 * 2
            java.lang.String r2 = android.ext.t2.e(r2, r6)
            r1.append(r2)
            java.lang.String r2 = "r;"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto La7
        La5:
            java.lang.String r1 = "-r;"
        La7:
            android.widget.TextView r2 = r11.n
            r2.setText(r1)
            java.lang.String r1 = "-;"
            if (r17 != 0) goto Lcb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 39
            r2.append(r3)
            java.lang.String r3 = android.ext.n1.I(r4, r0)
            r2.append(r3)
            java.lang.String r3 = "';"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto Lcc
        Lcb:
            r2 = r1
        Lcc:
            android.widget.TextView r3 = r11.o
            r3.setText(r2)
            if (r17 != 0) goto Led
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 34
            r1.append(r2)
            java.lang.String r0 = android.ext.n1.H(r4, r0)
            r1.append(r0)
            java.lang.String r0 = "\";"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
        Led:
            android.widget.TextView r0 = r11.p
            r0.setText(r1)
            return
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton r1, boolean r2) {
            r0 = this;
            r0.k()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r4, int r5) {
            r3 = this;
            long r0 = r3.f316f
            r4 = 4
            java.lang.String r4 = android.ext.c.G(r0, r4)
            r0 = -3
            r1 = 1
            if (r5 == r0) goto L6c
            r0 = -1
            if (r5 == r0) goto Lf
            goto L80
        Lf:
            android.ext.EditText r5 = r3.i
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.trim()
            android.ext.y0.b(r5, r1)
            android.ext.MainService r5 = android.ext.MainService.instance
            java.lang.Long r0 = r3.f317g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 2131296494(0x7f0900ee, float:1.8210906E38)
            java.lang.String r2 = android.ext.Tools.N1(r2)
            r1.append(r2)
            java.lang.String r2 = ": ("
            r1.append(r2)
            android.ext.EditText r2 = r3.h
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
            r1.append(r2)
            java.lang.String r2 = " + "
            r1.append(r2)
            android.ext.EditText r2 = r3.i
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r5.L(r0, r4, r1)
            goto L80
        L6c:
            android.ext.EditText r5 = r3.i
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.trim()
            android.ext.y0.b(r5, r1)
            android.ext.Tools.z(r4)
        L80:
            return
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            if (r2 == 0) goto Lf
            int r2 = r2.getId()
            r0 = 2131034384(0x7f050110, float:1.7679284E38)
            if (r2 != r0) goto Lf
            r1.i()
            return
        Lf:
            android.ext.OffsetCalculator r2 = new android.ext.OffsetCalculator
            r2.<init>()
            r0 = 0
            r2.j(r0)
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r1) {
            r0 = this;
            android.ext.EditText r1 = r0.h
            if (r1 == 0) goto L2c
            android.widget.CheckBox r1 = r0.k
            boolean r1 = r1.isChecked()
            android.ext.OffsetCalculator.z = r1
            android.ext.EditText r1 = r0.i
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            android.ext.OffsetCalculator.y = r1
            android.ext.EditText r1 = r0.h
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            android.ext.OffsetCalculator.x = r1
        L2c:
            return
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(android.content.DialogInterface r1) {
            r0 = this;
            android.ext.EditText r1 = r0.h
            android.text.Editable r1 = r1.getText()
            int r1 = r1.length()
            if (r1 <= 0) goto L12
            android.ext.EditText r1 = r0.i
        Le:
            r1.requestFocus()
            goto L15
        L12:
            android.ext.EditText r1 = r0.h
            goto Le
        L15:
            android.ext.EditText r1 = r0.i
            android.ext.Tools.o1(r1)
            r0.k()
            return
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            r0.k()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r9 = this;
            long r6 = r9.f316f
            r0 = 1
            int r0 = android.ext.c.S(r6, r0)     // Catch: java.lang.Throwable -> L1b
            android.ext.MainService r1 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L1b
            android.ext.f0 r1 = r1.i     // Catch: java.lang.Throwable -> L1b
            long r4 = r1.Q(r6, r0)     // Catch: java.lang.Throwable -> L1b
            android.ext.OffsetCalculator$b r8 = new android.ext.OffsetCalculator$b     // Catch: java.lang.Throwable -> L1b
            r0 = r8
            r1 = r9
            r2 = r6
            r0.<init>(r1, r2, r4)     // Catch: java.lang.Throwable -> L1b
            android.ext.n2.i(r8)     // Catch: java.lang.Throwable -> L1b
            goto L30
        L1b:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed update value: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            android.ext.e1.s(r1, r0)
        L30:
            return
    }
}
