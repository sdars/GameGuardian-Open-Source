package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class l0 implements android.text.TextWatcher, android.view.View.OnClickListener, android.view.View.OnLongClickListener {
    private static volatile boolean F = false;
    private final android.view.View[] A;
    private final int[][] B;
    private final android.ext.c C;
    private int D;
    private java.lang.String E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.View f1050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.widget.TextView f1051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.view.View f1052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.widget.CheckBox f1053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.view.View f1054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final android.ext.EditText f1055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.widget.TextView f1056g;
    private final android.ext.EditText h;
    private final android.view.View i;
    private final android.ext.EditText j;
    private final android.view.View k;
    private final android.view.View l;
    private final android.view.View m;
    private final android.view.View n;
    private final android.view.View o;
    private final android.view.View p;
    private final android.view.View q;
    private final android.view.View r;
    final android.widget.CheckBox s;
    final android.widget.CheckBox t;
    final android.widget.CheckBox u;
    private final android.ext.SystemSpinner v;
    final android.view.View w;
    private final android.ext.EditText x;
    private final android.ext.EditText y;
    private final android.widget.Button z;

    class a extends android.ext.InternalKeyboard.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.l0 f1057a;

        a(android.ext.l0 r1) {
                r0 = this;
                r0.f1057a = r1
                r0.<init>()
                return
        }

        @Override // android.ext.InternalKeyboard.e
        protected boolean a(android.view.View r1, boolean r2) {
                r0 = this;
                android.ext.l0 r2 = r0.f1057a
                boolean r2 = android.ext.l0.a(r2)
                if (r2 != 0) goto L11
                android.ext.l0 r2 = r0.f1057a
                android.ext.EditText r2 = r2.f1055f
                if (r1 != r2) goto Lf
                goto L11
            Lf:
                r1 = 0
                goto L12
            L11:
                r1 = 1
            L12:
                return r1
        }
    }

    class b implements android.text.TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.l0 f1058a;

        b(android.ext.l0 r1) {
                r0 = this;
                r0.f1058a = r1
                r0.<init>()
                return
        }

        private void a() {
                r2 = this;
                android.ext.l0 r0 = r2.f1058a
                android.widget.CheckBox r0 = r0.t
                r1 = 1
                r0.setChecked(r1)
                android.ext.l0 r0 = r2.f1058a
                android.ext.l0.a(r0)
                return
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable r1) {
                r0 = this;
                r0.a()
                return
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                r0.a()
                return
        }
    }

    class c implements android.widget.CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.l0 f1059a;

        c(android.ext.l0 r1) {
                r0 = this;
                r0.f1059a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto La
                android.ext.l0 r1 = r0.f1059a
                android.widget.CheckBox r1 = r1.u
                r2 = 0
                r1.setChecked(r2)
            La:
                android.ext.l0 r1 = r0.f1059a
                android.widget.CheckBox r1 = r1.t
                r2 = 1
                r1.setChecked(r2)
                return
        }
    }

    class d implements android.widget.CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.l0 f1060a;

        d(android.ext.l0 r1) {
                r0 = this;
                r0.f1060a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto La
                android.ext.l0 r1 = r0.f1060a
                android.widget.CheckBox r1 = r1.s
                r2 = 0
                r1.setChecked(r2)
            La:
                return
        }
    }

    class e implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.l0 f1061a;

        e(android.ext.l0 r1) {
                r0 = this;
                r0.f1061a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r2, int r3) {
                r1 = this;
                android.ext.l0 r2 = r1.f1061a
                android.view.View r2 = r2.w
                r0 = 3
                if (r3 != r0) goto L9
                r3 = 0
                goto Lb
            L9:
                r3 = 8
            Lb:
                r2.setVisibility(r3)
                return
        }
    }

    static {
            return
    }

    public l0(int r9, android.ext.c r10) {
            r8 = this;
            r8.<init>()
            r8.D = r9
            android.ext.c r0 = r10.c()
            r8.C = r0
            r0 = 2131099678(0x7f06001e, float:1.7811716E38)
            r1 = 0
            android.view.View r0 = a.d.f(r0, r1)
            r8.f1050a = r0
            r1 = 2131034328(0x7f0500d8, float:1.767917E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r8.f1051b = r1
            r1 = 2131034338(0x7f0500e2, float:1.767919E38)
            android.view.View r1 = r0.findViewById(r1)
            r8.f1052c = r1
            r1 = 2131034385(0x7f050111, float:1.7679286E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r8.f1053d = r1
            r1 = 2131034339(0x7f0500e3, float:1.7679193E38)
            android.view.View r1 = r0.findViewById(r1)
            r8.f1054e = r1
            r1 = 2131034337(0x7f0500e1, float:1.7679189E38)
            android.view.View r1 = r0.findViewById(r1)
            android.ext.EditText r1 = (android.ext.EditText) r1
            r8.f1055f = r1
            r2 = 3
            r1.setDataType(r2)
            r1 = 2131034432(0x7f050140, float:1.7679381E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r8.f1056g = r1
            r1 = 2131034346(0x7f0500ea, float:1.7679207E38)
            android.view.View r1 = r0.findViewById(r1)
            android.ext.EditText r1 = (android.ext.EditText) r1
            r8.h = r1
            r3 = 1
            r1.setDataType(r3)
            r4 = 2131034347(0x7f0500eb, float:1.7679209E38)
            android.view.View r4 = r0.findViewById(r4)
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = 0
            r6[r7] = r1
            int r10 = r10.f674c
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6[r3] = r10
            r4.setTag(r6)
            r10 = 2131034241(0x7f050081, float:1.7678994E38)
            android.view.View r10 = r0.findViewById(r10)
            r8.i = r10
            r10 = 2131034239(0x7f05007f, float:1.767899E38)
            android.view.View r10 = r0.findViewById(r10)
            android.ext.EditText r10 = (android.ext.EditText) r10
            r8.j = r10
            r10.setDataType(r3)
            r1 = 2131034418(0x7f050132, float:1.7679353E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setTag(r10)
            r10 = 2131034240(0x7f050080, float:1.7678992E38)
            android.view.View r10 = r0.findViewById(r10)
            android.ext.Tools.r1(r10)
            r10.setOnClickListener(r8)
            r10 = 2131034115(0x7f050003, float:1.7678738E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.CheckBox r10 = (android.widget.CheckBox) r10
            r8.s = r10
            android.ext.Tools.r1(r10)
            r10.setOnLongClickListener(r8)
            r10 = 2131034254(0x7f05008e, float:1.767902E38)
            android.view.View r10 = r0.findViewById(r10)
            r8.k = r10
            r10 = 2131034261(0x7f050095, float:1.7679035E38)
            android.view.View r10 = r0.findViewById(r10)
            r8.l = r10
            r10 = 2131034260(0x7f050094, float:1.7679033E38)
            android.view.View r10 = r0.findViewById(r10)
            r8.m = r10
            r10 = 2131034259(0x7f050093, float:1.767903E38)
            android.view.View r10 = r0.findViewById(r10)
            r8.n = r10
            r10 = 2131034255(0x7f05008f, float:1.7679022E38)
            android.view.View r10 = r0.findViewById(r10)
            r8.o = r10
            r10 = 2131034257(0x7f050091, float:1.7679026E38)
            android.view.View r10 = r0.findViewById(r10)
            r8.p = r10
            r10 = 2131034256(0x7f050090, float:1.7679024E38)
            android.view.View r10 = r0.findViewById(r10)
            r8.q = r10
            r10 = 2131034258(0x7f050092, float:1.7679028E38)
            android.view.View r10 = r0.findViewById(r10)
            r8.r = r10
            r10 = 2131034147(0x7f050023, float:1.7678803E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.CheckBox r10 = (android.widget.CheckBox) r10
            r8.t = r10
            r10 = 2131034265(0x7f050099, float:1.7679043E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.CheckBox r10 = (android.widget.CheckBox) r10
            r8.u = r10
            r10 = 2131034269(0x7f05009d, float:1.767905E38)
            android.view.View r10 = r0.findViewById(r10)
            android.ext.SystemSpinner r10 = (android.ext.SystemSpinner) r10
            r8.v = r10
            r10 = 2131034267(0x7f05009b, float:1.7679047E38)
            android.view.View r10 = r0.findViewById(r10)
            r8.w = r10
            r10 = 2131034266(0x7f05009a, float:1.7679045E38)
            android.view.View r10 = r0.findViewById(r10)
            android.ext.EditText r10 = (android.ext.EditText) r10
            r8.x = r10
            r10.setDataType(r3)
            r1 = 2131034271(0x7f05009f, float:1.7679055E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setTag(r10)
            r10 = 2131034270(0x7f05009e, float:1.7679053E38)
            android.view.View r10 = r0.findViewById(r10)
            android.ext.EditText r10 = (android.ext.EditText) r10
            r8.y = r10
            r10.setDataType(r3)
            r1 = 2131034428(0x7f05013c, float:1.7679373E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setTag(r10)
            r10 = 2131034248(0x7f050088, float:1.7679008E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.Button r10 = (android.widget.Button) r10
            r8.z = r10
            android.ext.l0$a r10 = new android.ext.l0$a
            r10.<init>(r8)
            java.util.ArrayList r0 = r0.getFocusables(r5)
            java.util.Iterator r0 = r0.iterator()
        L177:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18b
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            boolean r4 = r1 instanceof android.ext.EditText
            if (r4 == 0) goto L177
            android.ext.Tools.z1(r1, r10)
            goto L177
        L18b:
            r10 = 7
            android.view.View[] r0 = new android.view.View[r10]
            android.view.View r1 = r8.f1052c
            r0[r7] = r1
            android.widget.CheckBox r1 = r8.f1053d
            r0[r3] = r1
            android.view.View r1 = r8.f1054e
            r0[r5] = r1
            android.view.View r1 = r8.i
            r0[r2] = r1
            android.view.View r1 = r8.k
            r4 = 4
            r0[r4] = r1
            r1 = 5
            android.widget.Button r6 = r8.z
            r0[r1] = r6
            r1 = 6
            android.widget.CheckBox r6 = r8.t
            r0[r1] = r6
            r8.A = r0
            int[][] r0 = new int[r4][]
            int[] r1 = new int[r10]
            r1 = {x025a: FILL_ARRAY_DATA , data: [1, 0, 1, 0, 0, 0, 0} // fill-array
            r0[r7] = r1
            int[] r1 = new int[r10]
            r1 = {x026c: FILL_ARRAY_DATA , data: [1, 1, 0, 0, 0, 0, 0} // fill-array
            r0[r3] = r1
            int[] r1 = new int[r10]
            r1 = {x027e: FILL_ARRAY_DATA , data: [0, 0, 0, 1, 1, 1, 1} // fill-array
            r0[r5] = r1
            int[] r10 = new int[r10]
            r10 = {x0290: FILL_ARRAY_DATA , data: [1, 1, 0, 0, 0, 0, 0} // fill-array
            r0[r2] = r10
            r8.B = r0
            if (r9 < 0) goto L238
            int r10 = r0.length
            if (r9 >= r10) goto L238
            r8.t(r9)
            r10 = 2131296396(0x7f09008c, float:1.8210707E38)
            java.lang.String r10 = android.ext.b2.f(r10)
            r8.E = r10
            android.view.View r10 = r8.f1050a
            r0 = 2131034438(0x7f050146, float:1.7679394E38)
            android.view.View r10 = r10.findViewById(r0)
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r9 != r5) goto L202
            android.ext.Tools.r1(r10)
            r10.setOnClickListener(r8)
            r9 = 2131296394(0x7f09008a, float:1.8210703E38)
            java.lang.String r9 = android.ext.b2.f(r9)
            r8.E = r9
            boolean r9 = android.ext.l0.F
            r8.p(r9)
            goto L20a
        L202:
            if (r9 != r3) goto L20a
            android.ext.Tools.r1(r10)
            r10.setOnClickListener(r8)
        L20a:
            android.widget.Button r9 = r8.z
            r9.setOnClickListener(r8)
            java.lang.CharSequence r9 = r10.getText()
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = android.ext.Tools.O1(r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r9 = 58
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.setText(r9)
            r8.m()
            android.ext.EditText r9 = r8.f1055f
            r9.addTextChangedListener(r8)
            return
        L238:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Type must be between: 0 and "
            r1.append(r2)
            int r0 = r0.length
            int r0 = r0 - r3
            r1.append(r0)
            java.lang.String r0 = " but got: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r10.<init>(r9)
            throw r10
    }

    static /* synthetic */ boolean a(android.ext.l0 r0) {
            boolean r0 = r0.u()
            return r0
    }

    private void m() {
            r5 = this;
            android.widget.TextView r0 = r5.f1056g
            android.ext.c r1 = r5.C
            int r1 = r1.f674c
            java.lang.String r1 = android.ext.c.s(r1)
            r0.setText(r1)
            android.ext.EditText r0 = r5.h
            android.ext.c r1 = r5.C
            java.lang.String r1 = r1.J()
            r0.setText(r1)
            android.ext.EditText r0 = r5.j
            java.lang.String r1 = "0"
            r0.setText(r1)
            android.widget.CheckBox r0 = r5.t
            r2 = 1
            r0.setChecked(r2)
            android.ext.l0$b r0 = new android.ext.l0$b
            r0.<init>(r5)
            android.ext.EditText r3 = r5.h
            r3.addTextChangedListener(r0)
            android.ext.EditText r3 = r5.j
            r3.addTextChangedListener(r0)
            android.widget.CheckBox r0 = r5.s
            android.ext.l0$c r3 = new android.ext.l0$c
            r3.<init>(r5)
            r0.setOnCheckedChangeListener(r3)
            android.widget.CheckBox r0 = r5.u
            android.ext.l0$d r3 = new android.ext.l0$d
            r3.<init>(r5)
            r0.setOnCheckedChangeListener(r3)
            android.ext.SystemSpinner r0 = r5.v
            a.e r3 = android.ext.h2.a0()
            r0.setData(r3)
            android.ext.SystemSpinner r0 = r5.v
            android.ext.l0$e r3 = new android.ext.l0$e
            r3.<init>(r5)
            r0.setOnItemSelectedListener(r3)
            android.ext.c r0 = r5.C
            boolean r3 = r0 instanceof android.ext.h2
            r4 = 0
            if (r3 == 0) goto L8e
            android.ext.h2 r0 = (android.ext.h2) r0
            android.ext.EditText r1 = r5.f1055f
            java.lang.String r3 = r0.b0()
            r1.setText(r3)
            android.widget.CheckBox r1 = r5.u
            boolean r3 = r0.m
            r1.setChecked(r3)
            android.ext.SystemSpinner r1 = r5.v
            byte r3 = r0.n
            r1.setSelected(r3)
            android.ext.EditText r1 = r5.x
            java.lang.String r2 = r0.c0(r2)
            r1.setText(r2)
            android.ext.EditText r1 = r5.y
            java.lang.String r0 = r0.c0(r4)
            r1.setText(r0)
            goto La2
        L8e:
            android.widget.CheckBox r0 = r5.u
            r0.setChecked(r4)
            android.ext.SystemSpinner r0 = r5.v
            r0.setSelected(r4)
            android.ext.EditText r0 = r5.x
            r0.setText(r1)
            android.ext.EditText r0 = r5.y
            r0.setText(r1)
        La2:
            return
    }

    private void p(boolean r6) {
            r5 = this;
            android.ext.l0.F = r6
            android.widget.Button r0 = r5.z
            if (r6 == 0) goto Le
            r1 = 2131296738(0x7f0901e2, float:1.8211401E38)
        L9:
            java.lang.String r1 = android.ext.b2.f(r1)
            goto L12
        Le:
            r1 = 2131296786(0x7f090212, float:1.8211499E38)
            goto L9
        L12:
            r0.setText(r1)
            android.view.View r0 = r5.i
            r1 = 8
            r2 = 0
            if (r6 == 0) goto L1e
            r3 = 0
            goto L20
        L1e:
            r3 = 8
        L20:
            r0.setVisibility(r3)
            android.view.View r0 = r5.k
            if (r6 == 0) goto L29
            r3 = 0
            goto L2b
        L29:
            r3 = 8
        L2b:
            r0.setVisibility(r3)
            android.view.View r0 = r5.m
            r3 = 1
            if (r6 == 0) goto L3b
            android.ext.c r4 = r5.C
            int r4 = r4.f674c
            if (r4 != r3) goto L3b
            r4 = 0
            goto L3d
        L3b:
            r4 = 8
        L3d:
            r0.setVisibility(r4)
            android.view.View r0 = r5.n
            if (r6 == 0) goto L4e
            android.ext.c r4 = r5.C
            int r4 = r4.f674c
            r4 = r4 & 7
            if (r4 == 0) goto L4e
            r4 = 0
            goto L50
        L4e:
            r4 = 8
        L50:
            r0.setVisibility(r4)
            if (r6 == 0) goto L5c
            android.ext.c r6 = r5.C
            int r6 = r6.f674c
            if (r6 != r3) goto L5c
            r1 = 0
        L5c:
            android.view.View r6 = r5.o
            r6.setVisibility(r1)
            android.view.View r6 = r5.p
            r6.setVisibility(r1)
            android.view.View r6 = r5.q
            r6.setVisibility(r1)
            android.view.View r6 = r5.r
            r6.setVisibility(r1)
            return
    }

    private void t(int r6) {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            int[][] r2 = r5.B
            r2 = r2[r6]
            int r3 = r2.length
            if (r1 >= r3) goto L1c
            android.view.View[] r3 = r5.A
            r3 = r3[r1]
            r2 = r2[r1]
            r4 = 1
            if (r2 != r4) goto L14
            r2 = 0
            goto L16
        L14:
            r2 = 8
        L16:
            r3.setVisibility(r2)
            int r1 = r1 + 1
            goto L2
        L1c:
            return
    }

    private boolean u() {
            r3 = this;
            int r0 = android.ext.Config.B
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            android.ext.EditText r0 = r3.h
            boolean r0 = r0.isFocused()
            if (r0 == 0) goto L21
            android.ext.EditText r0 = r3.h
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = android.ext.t1.n(r0)
            if (r0 == 0) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            android.ext.EditText r0 = r3.h
            android.ext.InternalKeyboard.i(r0, r1)
            return r1
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable r2) {
            r1 = this;
            android.widget.CheckBox r2 = r1.f1053d
            r0 = 1
            r2.setChecked(r0)
            return
    }

    public java.lang.String b() {
            r2 = this;
            android.view.View r0 = r2.i
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L1b
            android.ext.EditText r0 = r2.j
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r1 = 1
            android.ext.y0.b(r0, r1)
            return r0
        L1b:
            java.lang.String r0 = "0"
            return r0
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public android.ext.c c() {
            r1 = this;
            android.ext.c r0 = r1.C
            return r0
    }

    public java.lang.String d() {
            r2 = this;
            android.ext.EditText r0 = r2.f1055f
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r1 = 2
            android.ext.y0.b(r0, r1)
            return r0
    }

    public java.lang.String e() {
            r2 = this;
            android.ext.EditText r0 = r2.h
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r1 = 1
            android.ext.y0.b(r0, r1)
            return r0
    }

    public android.ext.EditText f() {
            r1 = this;
            android.ext.EditText r0 = r1.h
            return r0
    }

    public android.ext.h2 g() {
            r1 = this;
            android.ext.c r0 = r1.C
            android.ext.h2 r0 = r1.h(r0)
            return r0
    }

    public android.ext.h2 h(android.ext.c r3) {
            r2 = this;
            android.ext.h2 r0 = new android.ext.h2
            r0.<init>(r3)
            android.widget.CheckBox r3 = r2.u
            boolean r3 = r3.isChecked()
            r0.m = r3
            android.ext.SystemSpinner r3 = r2.v
            int r3 = r3.getSelected()
            r0.d0(r3)
            byte r3 = r0.n
            r1 = 3
            if (r3 != r1) goto L42
            android.ext.EditText r3 = r2.x
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = android.ext.j2.h(r3)
            android.ext.EditText r1 = r2.y
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            java.lang.String r1 = android.ext.j2.h(r1)
            r0.e0(r3, r1)
        L42:
            boolean r3 = r0.m
            if (r3 != 0) goto L55
            android.widget.CheckBox r3 = r2.s
            boolean r3 = r3.isChecked()
            if (r3 == 0) goto L55
            int r3 = r0.f674c
            r1 = 1073741824(0x40000000, float:2.0)
            r3 = r3 | r1
            r0.f674c = r3
        L55:
            android.widget.CheckBox r3 = r2.f1053d
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L65
            android.widget.CheckBox r3 = r2.f1053d
            boolean r3 = r3.isChecked()
            if (r3 != 0) goto L6d
        L65:
            android.view.View r3 = r2.f1054e
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L7d
        L6d:
            java.lang.String r3 = r2.d()
            java.lang.String r1 = r0.b0()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L7d
            r0.l = r3
        L7d:
            return r0
    }

    public android.view.View i() {
            r1 = this;
            android.view.View r0 = r1.f1050a
            return r0
    }

    public android.view.View j() {
            r1 = this;
            android.view.View r0 = r1.k()
            android.view.View r0 = android.ext.InternalKeyboard.d(r0)
            return r0
    }

    public android.view.View k() {
            r1 = this;
            android.view.View r0 = r1.i()
            android.view.View r0 = android.ext.Tools.O0(r0)
            return r0
    }

    public void l() {
            r2 = this;
            android.widget.CheckBox r0 = r2.f1053d
            r1 = 1
            r0.setChecked(r1)
            return
    }

    public boolean n() {
            r2 = this;
            android.widget.CheckBox r0 = r2.u
            boolean r0 = r0.isChecked()
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            android.view.View r0 = r2.f1052c
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L2c
            android.widget.CheckBox r0 = r2.f1053d
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L23
            android.widget.CheckBox r0 = r2.f1053d
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L23
            return r1
        L23:
            android.view.View r0 = r2.f1054e
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L2c
            return r1
        L2c:
            r0 = 0
            return r0
    }

    public boolean o() {
            r1 = this;
            android.widget.CheckBox r0 = r1.t
            boolean r0 = r0.isChecked()
            return r0
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            int r2 = r2.getId()
            r0 = 2131034240(0x7f050080, float:1.7678992E38)
            if (r2 == r0) goto L2f
            r0 = 2131034248(0x7f050088, float:1.7679008E38)
            if (r2 == r0) goto L1d
            r0 = 2131034438(0x7f050146, float:1.7679394E38)
            if (r2 == r0) goto L17
            goto L35
        L17:
            java.lang.String r2 = r1.E
            android.ext.Searcher.I(r2)
            goto L35
        L1d:
            int r2 = r1.D
            r0 = 2
            if (r2 != r0) goto L29
            boolean r2 = android.ext.l0.F
            r2 = r2 ^ 1
            r1.p(r2)
        L29:
            android.ext.EditText r2 = r1.h
            r2.requestFocus()
            goto L35
        L2f:
            r2 = 2131296608(0x7f090160, float:1.8211137E38)
            android.ext.ConfigListAdapter.t(r2)
        L35:
            return
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r3 = r3.getId()
            r1 = 2131034115(0x7f050003, float:1.7678738E38)
            if (r3 == r1) goto Le
            return r0
        Le:
            r3 = 2131296520(0x7f090108, float:1.821096E38)
            android.ext.ConfigListAdapter.t(r3)
            r3 = 1
            return r3
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            android.widget.CheckBox r1 = r0.f1053d
            r2 = 1
            r1.setChecked(r2)
            return
    }

    public void q(android.view.View.OnClickListener r2) {
            r1 = this;
            android.view.View r0 = r1.l
            r0.setOnClickListener(r2)
            android.view.View r0 = r1.m
            r0.setOnClickListener(r2)
            android.view.View r0 = r1.n
            r0.setOnClickListener(r2)
            android.view.View r0 = r1.o
            r0.setOnClickListener(r2)
            android.view.View r0 = r1.p
            r0.setOnClickListener(r2)
            android.view.View r0 = r1.q
            r0.setOnClickListener(r2)
            android.view.View r0 = r1.r
            r0.setOnClickListener(r2)
            return
    }

    public void r(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.f1051b
            r0.setText(r2)
            return
    }

    public void s(java.lang.String r2) {
            r1 = this;
            android.ext.EditText r0 = r1.h
            java.lang.String r2 = r2.trim()
            r0.setText(r2)
            return
    }
}
