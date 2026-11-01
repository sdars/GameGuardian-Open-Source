package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class t0 extends android.ext.j2 implements android.view.View.OnClickListener {
    private a.e l;
    private long m;
    private long n;
    private long o;

    class a implements android.widget.SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.widget.TextView f1247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.t0 f1248b;

        a(android.ext.t0 r1, android.widget.TextView r2) {
                r0 = this;
                r0.f1248b = r1
                r0.f1247a = r2
                r0.<init>()
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar r2, int r3, boolean r4) {
                r1 = this;
                android.widget.TextView r2 = r1.f1247a
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = ""
                r4.append(r0)
                int r3 = r3 + 1
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                r2.setText(r3)
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar r1) {
                r0 = this;
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar r1) {
                r0 = this;
                return
        }
    }

    class b implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.widget.SeekBar f1249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.t0 f1250b;

        b(android.ext.t0 r1, android.widget.SeekBar r2) {
                r0 = this;
                r0.f1250b = r1
                r0.f1249a = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r11, int r12) {
                r10 = this;
                int r11 = android.ext.MainService.D()     // Catch: java.lang.NumberFormatException -> L30
                r1 = r11 & 127(0x7f, float:1.78E-43)
                java.lang.String r0 = "0"
                r2 = 536870912(0x20000000, float:1.0842022E-19)
                android.widget.SeekBar r11 = r10.f1249a     // Catch: java.lang.NumberFormatException -> L30
                int r11 = r11.getProgress()     // Catch: java.lang.NumberFormatException -> L30
                r12 = 1
                int r3 = r11 + 1
                android.ext.t0 r11 = r10.f1250b     // Catch: java.lang.NumberFormatException -> L30
                android.ext.Searcher r11 = r11.j     // Catch: java.lang.NumberFormatException -> L30
                r4 = 0
                long r4 = r11.e(r4)     // Catch: java.lang.NumberFormatException -> L30
                android.ext.t0 r11 = r10.f1250b     // Catch: java.lang.NumberFormatException -> L30
                android.ext.Searcher r11 = r11.j     // Catch: java.lang.NumberFormatException -> L30
                long r6 = r11.e(r12)     // Catch: java.lang.NumberFormatException -> L30
                android.ext.t0 r11 = r10.f1250b     // Catch: java.lang.NumberFormatException -> L30
                android.ext.Searcher r11 = r11.j     // Catch: java.lang.NumberFormatException -> L30
                long r8 = r11.b()     // Catch: java.lang.NumberFormatException -> L30
                android.ext.t0.l(r0, r1, r2, r3, r4, r6, r8)     // Catch: java.lang.NumberFormatException -> L30
                return
            L30:
                r11 = move-exception
                android.ext.t0 r12 = r10.f1250b
                android.ext.Searcher r12 = r12.j
                android.ext.EditText r12 = r12.g()
                android.ext.j2.i(r11, r12)
                return
        }
    }

    public t0() {
            r4 = this;
            r0 = 2131296947(0x7f0902b3, float:1.8211825E38)
            r1 = 2130968619(0x7f04002b, float:1.7545897E38)
            r4.<init>(r0, r1)
            r0 = 0
            r4.m = r0
            r2 = -1
            r4.n = r2
            r4.o = r0
            return
    }

    public static boolean k(byte r18, java.lang.String r19, int r20, int r21, int r22, long r23, long r25, long r27) {
            r15 = r18
            r0 = r19
            r1 = r20 & 127(0x7f, float:1.78E-43)
            r2 = 1006632960(0x3c000000, float:0.0078125)
            r2 = r21 & r2
            android.ext.MainService r3 = android.ext.MainService.instance
            int r4 = android.ext.MainService.D()
            r4 = r4 & 127(0x7f, float:1.78E-43)
            r1 = r1 & r4
            r4 = 1
            if (r1 != 0) goto L1a
            r3.n(r15)
            return r4
        L1a:
            r5 = 126(0x7e, float:1.77E-43)
            int r5 = r0.indexOf(r5)
            r6 = -1
            r13 = 0
            if (r5 == r6) goto L26
            r5 = 1
            goto L27
        L26:
            r5 = 0
        L27:
            android.ext.t1$b r6 = new android.ext.t1$b
            r6.<init>()
            r7 = 0
            if (r5 == 0) goto L71
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            if (r2 == r9) goto L60
            r9 = 268435456(0x10000000, float:2.524355E-29)
            if (r2 != r9) goto L39
            goto L60
        L39:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 2131296384(0x7f090080, float:1.8210683E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r5 = 2131296649(0x7f090189, float:1.821122E38)
            java.lang.String r5 = android.ext.b2.f(r5)
            r3[r13] = r5
            a.e r5 = android.ext.c.B()
            java.lang.Object r2 = r5.get(r2)
            r3[r4] = r2
            java.lang.String r1 = android.ext.Tools.L1(r1, r3)
            r0.<init>(r1)
            throw r0
        L60:
            android.ext.i2$b r0 = android.ext.i2.w(r6, r0, r1, r2)
            long r1 = r0.f1013a
            long r9 = r0.f1014b
            int r11 = r0.f1015c
            int r0 = r0.f1016d
            r14 = r0
            r0 = r11
            r11 = r9
            r9 = r1
            goto L7c
        L71:
            long r9 = android.ext.c.d(r6, r0, r1)
            int r0 = r6.f1263c
            r11 = r1 & r0
            r14 = r2
            r0 = r11
            r11 = r7
        L7c:
            int r1 = java.lang.Integer.bitCount(r0)
            if (r1 <= r4) goto L92
            boolean r1 = r6.f1262b
            int r0 = android.ext.c.g(r0, r9, r1)
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 == 0) goto L92
            boolean r1 = r6.f1262b
            int r0 = android.ext.c.g(r0, r11, r1)
        L92:
            r8 = r0
            boolean r0 = r3.a1()
            if (r0 == 0) goto Lc3
            r3.R(r15)
            r3.r0 = r13
            android.ext.f0 r0 = r3.i
            if (r5 == 0) goto La7
            r1 = 8388608(0x800000, float:1.1754944E-38)
            r1 = r1 | r8
            r6 = r1
            goto La8
        La7:
            r6 = r8
        La8:
            r1 = r18
            r2 = r9
            r4 = r11
            r7 = r14
            r14 = r8
            r8 = r22
            r9 = r23
            r11 = r25
            r17 = r14
            r16 = 0
            r13 = r27
            r0.D(r1, r2, r4, r6, r7, r8, r9, r11, r13)
            r0 = r17
            android.ext.MainService.N0(r0, r15)
            return r16
        Lc3:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 2131296305(0x7f090031, float:1.8210523E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.<init>(r1)
            throw r0
    }

    public static boolean l(java.lang.String r12, int r13, int r14, int r15, long r16, long r18, long r20) {
            java.lang.String r11 = android.ext.j2.h(r12)
            r0 = 0
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r7 = r18
            r9 = r20
            boolean r0 = k(r0, r1, r2, r3, r4, r5, r7, r9)
            android.ext.MainService r1 = android.ext.MainService.instance
            android.ext.c2 r1 = r1.f216f
            if (r1 == 0) goto L58
            java.lang.String r2 = "gg.searchFuzzy("
            r1.write(r2)
            android.ext.Script.Consts.d(r1, r11)
            java.lang.String r2 = ", "
            r1.write(r2)
            android.ext.Script$Consts r3 = r1.f697c
            android.ext.Script$Const[] r3 = r3.f373c
            r4 = r14
            android.ext.Script.Consts.a(r1, r3, r14)
            r1.write(r2)
            android.ext.Script$Consts r3 = r1.f697c
            android.ext.Script$Const[] r3 = r3.f372b
            r4 = r13
            android.ext.Script.Consts.a(r1, r3, r13)
            r1.write(r2)
            r3 = r16
            android.ext.Script.Consts.b(r1, r3)
            r1.write(r2)
            r3 = r18
            android.ext.Script.Consts.b(r1, r3)
            r1.write(r2)
            java.lang.String r2 = java.lang.Long.toString(r20)
            r1.write(r2)
            java.lang.String r2 = ")\n"
            r1.write(r2)
        L58:
            return r0
    }

    public static boolean m(byte r12, int r13, long r14, long r16, long r18) {
            r9 = r12
            r10 = r13 & 127(0x7f, float:1.78E-43)
            android.ext.MainService r0 = android.ext.MainService.instance
            r1 = 1
            if (r10 != 0) goto Lc
            r0.n(r12)
            return r1
        Lc:
            boolean r2 = r0.a1()
            if (r2 == 0) goto L3a
            long r2 = r0.p0
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L1d
            r0.n(r12)
        L1d:
            r0.q0 = r1
            android.ext.f0 r1 = r0.i
            r1.x0(r12)
            r0.R(r12)
            r11 = 0
            r0.r0 = r11
            android.ext.f0 r0 = r0.i
            r1 = r12
            r2 = r10
            r3 = r14
            r5 = r16
            r7 = r18
            r0.F(r1, r2, r3, r5, r7)
            android.ext.MainService.N0(r10, r12)
            return r11
        L3a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 2131296305(0x7f090031, float:1.8210523E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.<init>(r1)
            throw r0
    }

    public static boolean n(int r8, long r9, long r11, long r13) {
            r0 = 0
            r1 = r8
            r2 = r9
            r4 = r11
            r6 = r13
            boolean r0 = m(r0, r1, r2, r4, r6)
            android.ext.MainService r1 = android.ext.MainService.instance
            android.ext.c2 r1 = r1.f216f
            if (r1 == 0) goto L38
            java.lang.String r2 = "\ngg.startFuzzy("
            r1.write(r2)
            android.ext.Script$Consts r2 = r1.f697c
            android.ext.Script$Const[] r2 = r2.f372b
            android.ext.Script.Consts.a(r1, r2, r8)
            java.lang.String r8 = ", "
            r1.write(r8)
            android.ext.Script.Consts.b(r1, r9)
            r1.write(r8)
            android.ext.Script.Consts.b(r1, r11)
            r1.write(r8)
            java.lang.String r8 = java.lang.Long.toString(r13)
            r1.write(r8)
            java.lang.String r8 = ")\n"
            r1.write(r8)
        L38:
            return r0
    }

    private void o() {
            r6 = this;
            r0 = 2131099680(0x7f060020, float:1.781172E38)
            r1 = 0
            android.view.View r0 = a.d.f(r0, r1)
            r2 = 2131034219(0x7f05006b, float:1.767895E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.SeekBar r2 = (android.widget.SeekBar) r2
            r3 = 2131034218(0x7f05006a, float:1.7678947E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.ext.t0$a r4 = new android.ext.t0$a
            r4.<init>(r6, r3)
            r2.setOnSeekBarChangeListener(r4)
            android.app.AlertDialog$Builder r3 = android.ext.f.b()
            r4 = 2131296504(0x7f0900f8, float:1.8210927E38)
            android.view.View r4 = android.ext.Tools.g0(r4)
            android.app.AlertDialog$Builder r3 = r3.setCustomTitle(r4)
            r4 = 2131296352(0x7f090060, float:1.8210618E38)
            java.lang.String r4 = android.ext.b2.f(r4)
            android.app.AlertDialog$Builder r3 = r3.setMessage(r4)
            r4 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r4 = android.ext.b2.f(r4)
            android.ext.t0$b r5 = new android.ext.t0$b
            r5.<init>(r6, r2)
            android.app.AlertDialog$Builder r2 = r3.setPositiveButton(r4, r5)
            r3 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            android.app.AlertDialog$Builder r1 = r2.setNegativeButton(r3, r1)
            android.app.AlertDialog$Builder r0 = r1.setView(r0)
            android.ext.f.o(r0)
            return
    }

    private void p() {
            r6 = this;
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.f0 r1 = r0.i
            boolean r1 = r1.d0()
            if (r1 != 0) goto Lb
            return
        Lb:
            int r1 = android.ext.MainService.D()
            long r2 = r0.p0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L6b
            android.ext.Searcher r0 = new android.ext.Searcher
            r2 = 1
            r0.<init>(r2, r1)
            r6.j = r0
            a.e r0 = r0.G(r1)
            r6.l = r0
            android.ext.Searcher r0 = r6.j
            r1 = 2131297042(0x7f090312, float:1.8212018E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.y(r1)
            android.app.AlertDialog$Builder r0 = android.ext.f.b()
            android.ext.Searcher r1 = r6.j
            android.view.View r1 = r1.l()
            android.app.AlertDialog$Builder r0 = r0.setView(r1)
            r1 = 2131296942(0x7f0902ae, float:1.8211815E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r6)
            r1 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            android.app.AlertDialog r0 = r0.create()
            android.ext.f.k(r0, r6)
            android.ext.f.l(r0, r6)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r6.k = r1
            android.ext.f.m(r0)
            return
        L6b:
            android.ext.Searcher r0 = new android.ext.Searcher
            r2 = 2
            r0.<init>(r2, r1)
            r6.j = r0
            a.e r0 = r0.G(r1)
            r6.l = r0
            android.ext.Searcher r0 = r6.j
            r1 = 2131296332(0x7f09004c, float:1.8210578E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.y(r1)
            android.ext.Searcher r0 = r6.j
            r0.C(r6)
            android.ext.Searcher r0 = r6.j
            android.view.View r0 = r0.l()
            r1 = 2131034245(0x7f050085, float:1.7679002E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r1.setOnClickListener(r6)
            r1 = 2131034341(0x7f0500e5, float:1.7679197E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r1.setOnClickListener(r6)
            r1 = 2131034305(0x7f0500c1, float:1.7679124E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r1.setOnClickListener(r6)
            r1 = 2131034408(0x7f050128, float:1.7679333E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r1.setOnClickListener(r6)
            android.app.AlertDialog$Builder r1 = android.ext.f.b()
            android.app.AlertDialog$Builder r0 = r1.setView(r0)
            android.app.AlertDialog r0 = r0.create()
            android.ext.f.k(r0, r6)
            android.ext.f.l(r0, r6)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r6.k = r1
            android.ext.Searcher r1 = r6.j
            android.ext.EditText r1 = r1.g()
            android.ext.f.n(r0, r1)
            return
    }

    @Override // android.ext.j2
    public void j(android.content.DialogInterface r1, int r2) {
            r0 = this;
            return
    }

    @Override // android.ext.j2, android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r8, int r9) {
            r7 = this;
            r0 = -1
            if (r9 != r0) goto Ld
            android.app.AlertDialog r8 = (android.app.AlertDialog) r8
            android.widget.Button r8 = r8.getButton(r0)
            r7.onClick(r8)
            return
        Ld:
            android.ext.MainService r8 = android.ext.MainService.instance
            long r0 = r8.p0
            r2 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L23
            android.ext.MainService.O0 = r9
            long r1 = r7.m
            long r3 = r7.n
            long r5 = r7.o
            r0 = r9
            n(r0, r1, r3, r5)
        L23:
            return
    }

    @Override // android.ext.j2, android.ext.p1, android.view.View.OnClickListener
    public void onClick(android.view.View r15) {
            r14 = this;
            android.ext.MainService r0 = android.ext.MainService.instance
            if (r15 == 0) goto Ldb
            java.lang.Object r1 = r15.getTag()
            boolean r1 = r1 instanceof android.ext.p1
            if (r1 == 0) goto Le
            goto Ldb
        Le:
            java.lang.Object r1 = r15.getTag()
            boolean r1 = r1 instanceof java.lang.Integer
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L66
            long r4 = r0.p0
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L66
            android.ext.Searcher r1 = r14.j     // Catch: java.lang.NumberFormatException -> L60
            long r4 = r1.e(r3)     // Catch: java.lang.NumberFormatException -> L60
            r14.m = r4     // Catch: java.lang.NumberFormatException -> L60
            android.ext.Searcher r1 = r14.j     // Catch: java.lang.NumberFormatException -> L60
            long r4 = r1.e(r2)     // Catch: java.lang.NumberFormatException -> L60
            r14.n = r4     // Catch: java.lang.NumberFormatException -> L60
            android.ext.Searcher r1 = r14.j     // Catch: java.lang.NumberFormatException -> L60
            long r4 = r1.b()     // Catch: java.lang.NumberFormatException -> L60
            r14.o = r4     // Catch: java.lang.NumberFormatException -> L60
            java.lang.ref.WeakReference r1 = r14.k
            android.ext.Tools.U0(r1)
            android.ext.Searcher r1 = r14.j
            int r4 = r1.j()
            if (r4 != 0) goto L56
            android.ext.u2 r1 = new android.ext.u2
            a.e r4 = r14.l
            r5 = 2131297042(0x7f090312, float:1.8212018E38)
            java.lang.String r5 = android.ext.b2.f(r5)
            java.lang.String r6 = "0"
            r1.<init>(r4, r6, r5, r14)
            goto L66
        L56:
            long r5 = r14.m
            long r7 = r14.n
            long r9 = r14.o
            n(r4, r5, r7, r9)
            goto L66
        L60:
            r15 = move-exception
            r0 = 0
            android.ext.j2.i(r15, r0)
            return
        L66:
            int r15 = r15.getId()
            switch(r15) {
                case 2131034245: goto L7d;
                case 2131034305: goto L78;
                case 2131034341: goto L73;
                case 2131034408: goto L6e;
                default: goto L6d;
            }
        L6d:
            goto L89
        L6e:
            r15 = 134217728(0x8000000, float:3.85186E-34)
            r6 = 134217728(0x8000000, float:3.85186E-34)
            goto L8f
        L73:
            r15 = 268435456(0x10000000, float:2.524355E-29)
            r6 = 268435456(0x10000000, float:2.524355E-29)
            goto L8f
        L78:
            r15 = 67108864(0x4000000, float:1.5046328E-36)
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            goto L8f
        L7d:
            boolean r15 = android.ext.Searcher.L
            if (r15 != 0) goto L8b
            boolean r15 = r0.R
            if (r15 == 0) goto L86
            goto L8b
        L86:
            r14.o()
        L89:
            r6 = 0
            goto L8f
        L8b:
            r15 = 536870912(0x20000000, float:1.0842022E-19)
            r6 = 536870912(0x20000000, float:1.0842022E-19)
        L8f:
            if (r6 == 0) goto Ld0
            android.ext.Searcher r15 = r14.j     // Catch: java.lang.NumberFormatException -> La0
            int r15 = r15.j()     // Catch: java.lang.NumberFormatException -> La0
            if (r15 == 0) goto La2
            boolean r0 = android.ext.Searcher.L     // Catch: java.lang.NumberFormatException -> La0
            if (r0 != 0) goto L9e
            goto La2
        L9e:
            r5 = r15
            goto La9
        La0:
            r15 = move-exception
            goto Lc6
        La2:
            int r15 = android.ext.MainService.D()     // Catch: java.lang.NumberFormatException -> La0
            r15 = r15 & 127(0x7f, float:1.78E-43)
            goto L9e
        La9:
            android.ext.Searcher r15 = r14.j     // Catch: java.lang.NumberFormatException -> La0
            java.lang.String r4 = r15.f()     // Catch: java.lang.NumberFormatException -> La0
            r7 = 1
            android.ext.Searcher r15 = r14.j     // Catch: java.lang.NumberFormatException -> La0
            long r8 = r15.e(r3)     // Catch: java.lang.NumberFormatException -> La0
            android.ext.Searcher r15 = r14.j     // Catch: java.lang.NumberFormatException -> La0
            long r10 = r15.e(r2)     // Catch: java.lang.NumberFormatException -> La0
            android.ext.Searcher r15 = r14.j     // Catch: java.lang.NumberFormatException -> La0
            long r12 = r15.b()     // Catch: java.lang.NumberFormatException -> La0
            l(r4, r5, r6, r7, r8, r10, r12)     // Catch: java.lang.NumberFormatException -> La0
            goto Ld0
        Lc6:
            android.ext.Searcher r0 = r14.j
            android.ext.EditText r0 = r0.g()
            android.ext.j2.i(r15, r0)
            return
        Ld0:
            java.lang.ref.WeakReference r15 = r14.k
            android.ext.Tools.U0(r15)
            java.lang.ref.WeakReference r15 = r14.k
            android.ext.Tools.E(r15)
            return
        Ldb:
            android.ext.t0 r15 = new android.ext.t0
            r15.<init>()
            r15.p()
            return
    }

    @Override // android.ext.j2, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r2) {
            r1 = this;
            android.ext.Searcher r0 = r1.j
            int r0 = r0.j()
            android.ext.MainService.O0 = r0
            super.onDismiss(r2)
            return
    }
}
