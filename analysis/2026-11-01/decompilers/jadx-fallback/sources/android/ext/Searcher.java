package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class Searcher implements android.content.DialogInterface.OnClickListener, android.text.TextWatcher, android.view.View.OnFocusChangeListener, android.widget.CompoundButton.OnCheckedChangeListener, android.view.View.OnClickListener, java.lang.Runnable {
    public static final int[] K = null;
    public static volatile boolean L = false;
    private final android.widget.Button A;
    private final android.widget.Button B;
    private final android.view.View[] C;
    private final int[][] D;
    private final int E;
    private int F;
    private java.lang.String G;
    private boolean H;
    private char I;
    private int J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.view.View f446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.widget.TextView f447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final android.ext.SystemSpinner f448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.widget.TextView f449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final android.ext.EditText f450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.view.View f451g;
    private final android.view.View h;
    private final android.widget.TextView i;
    private final android.view.View j;
    private final android.ext.EditText k;
    private final android.widget.TextView l;
    private final android.view.View m;
    private final android.ext.EditText n;
    private final android.widget.CheckBox o;
    private final android.view.View p;
    private final android.ext.SystemSpinnerType q;
    private final android.view.View r;
    private final android.widget.CheckBox s;
    private final android.widget.CheckBox t;
    private final android.widget.Button u;
    private final android.widget.Button v;
    private final android.widget.Button w;
    private final android.view.View x;
    final android.ext.MemoryRange y;
    final android.ext.EditText z;

    class a implements android.text.TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.Searcher f452a;

        a(android.ext.Searcher r1) {
                r0 = this;
                r0.f452a = r1
                r0.<init>()
                return
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable r1) {
                r0 = this;
                android.ext.Searcher r1 = r0.f452a
                r1.L()
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
                android.ext.Searcher r1 = r0.f452a
                r1.L()
                return
        }
    }

    static {
            r0 = 5
            int[] r0 = new int[r0]
            android.ext.Searcher.K = r0
            return
    }

    public Searcher(int r11, int r12) {
            r10 = this;
            r10.<init>()
            r0 = 1
            r10.f445a = r0
            r1 = 0
            r10.H = r1
            r10.I = r1
            r10.J = r1
            r10.F = r11
            r10.E = r12
            r12 = 2131099685(0x7f060025, float:1.781173E38)
            r2 = 0
            android.view.View r12 = a.d.f(r12, r2)
            r10.f446b = r12
            r2 = 2131034328(0x7f0500d8, float:1.767917E38)
            android.view.View r2 = r12.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r10.f447c = r2
            r2 = 2131034404(0x7f050124, float:1.7679325E38)
            android.view.View r2 = r12.findViewById(r2)
            android.ext.SystemSpinner r2 = (android.ext.SystemSpinner) r2
            r10.f448d = r2
            r2.setOnItemSelectedListener(r10)
            r2 = 2131034432(0x7f050140, float:1.7679381E38)
            android.view.View r2 = r12.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r10.f449e = r2
            r2 = 2131034346(0x7f0500ea, float:1.7679207E38)
            android.view.View r2 = r12.findViewById(r2)
            android.ext.EditText r2 = (android.ext.EditText) r2
            r10.f450f = r2
            r2.setDataType(r0)
            r3 = 2131034347(0x7f0500eb, float:1.7679209E38)
            android.view.View r3 = r12.findViewById(r3)
            r10.f451g = r3
            r4 = 2131034450(0x7f050152, float:1.7679418E38)
            android.view.View r4 = r12.findViewById(r4)
            r10.h = r4
            r4 = 2131034238(0x7f05007e, float:1.7678988E38)
            android.view.View r4 = r12.findViewById(r4)
            r10.j = r4
            r4 = 2131034237(0x7f05007d, float:1.7678986E38)
            android.view.View r4 = r12.findViewById(r4)
            android.ext.EditText r4 = (android.ext.EditText) r4
            r10.k = r4
            r5 = 2131034315(0x7f0500cb, float:1.7679144E38)
            android.view.View r5 = r12.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r10.l = r5
            android.ext.Searcher$a r5 = new android.ext.Searcher$a
            r5.<init>(r10)
            r4.addTextChangedListener(r5)
            r4 = 2131034349(0x7f0500ed, float:1.7679213E38)
            android.view.View r4 = r12.findViewById(r4)
            r10.m = r4
            r4 = 2131034348(0x7f0500ec, float:1.767921E38)
            android.view.View r4 = r12.findViewById(r4)
            android.ext.EditText r4 = (android.ext.EditText) r4
            r10.n = r4
            r4 = 2131034280(0x7f0500a8, float:1.7679073E38)
            android.view.View r4 = r12.findViewById(r4)
            android.widget.CheckBox r4 = (android.widget.CheckBox) r4
            r10.o = r4
            r4 = 2131034433(0x7f050141, float:1.7679383E38)
            android.view.View r4 = r12.findViewById(r4)
            r10.p = r4
            r4 = 2131034431(0x7f05013f, float:1.767938E38)
            android.view.View r4 = r12.findViewById(r4)
            android.ext.SystemSpinnerType r4 = (android.ext.SystemSpinnerType) r4
            r10.q = r4
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r1] = r2
            r7[r0] = r4
            r3.setTag(r7)
            r4.setOnItemSelectedListener(r10)
            r2 = 2131034335(0x7f0500df, float:1.7679185E38)
            android.view.View r2 = r12.findViewById(r2)
            r10.r = r2
            r2 = 2131034334(0x7f0500de, float:1.7679183E38)
            android.view.View r2 = r12.findViewById(r2)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            r10.s = r2
            r2.setOnCheckedChangeListener(r10)
            r2 = 2131034351(0x7f0500ef, float:1.7679217E38)
            android.view.View r2 = r12.findViewById(r2)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            r10.t = r2
            r2.setOnCheckedChangeListener(r10)
            r2 = 2131034281(0x7f0500a9, float:1.7679075E38)
            android.view.View r2 = r12.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r10.u = r2
            r2.setOnClickListener(r10)
            r2 = 2131034282(0x7f0500aa, float:1.7679077E38)
            android.view.View r2 = r12.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r10.v = r2
            r2.setOnClickListener(r10)
            r2 = 2131034329(0x7f0500d9, float:1.7679172E38)
            android.view.View r2 = r12.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r10.w = r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r2.setTag(r3)
            r2.setOnClickListener(r10)
            r2 = 2131034273(0x7f0500a1, float:1.7679059E38)
            android.view.View r2 = r12.findViewById(r2)
            r10.x = r2
            r2 = 2131034306(0x7f0500c2, float:1.7679126E38)
            android.view.View r2 = r12.findViewById(r2)
            android.ext.EditText r2 = (android.ext.EditText) r2
            r10.z = r2
            r2.setDataType(r0)
            r2 = 2131034321(0x7f0500d1, float:1.7679156E38)
            android.view.View r2 = r12.findViewById(r2)
            android.ext.MemoryRange r2 = (android.ext.MemoryRange) r2
            r10.y = r2
            r2.c()
            r2 = 2131034248(0x7f050088, float:1.7679008E38)
            android.view.View r2 = r12.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r10.A = r2
            r2 = 2131034143(0x7f05001f, float:1.7678795E38)
            android.view.View r2 = r12.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r10.B = r2
            java.util.ArrayList r12 = r12.getFocusables(r6)
            java.util.Iterator r12 = r12.iterator()
        L15f:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L173
            java.lang.Object r2 = r12.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof android.ext.EditText
            if (r3 == 0) goto L15f
            android.ext.Tools.z1(r2, r10)
            goto L15f
        L173:
            android.ext.MemoryRange r12 = r10.y
            int[] r2 = android.ext.Searcher.K
            r2 = r2[r11]
            r12.setType(r2)
            android.ext.MemoryRange r12 = r10.y
            r12.setTypeChangeListener(r10)
            r12 = 11
            android.view.View[] r2 = new android.view.View[r12]
            android.ext.SystemSpinner r3 = r10.f448d
            r2[r1] = r3
            android.view.View r3 = r10.h
            r2[r0] = r3
            android.view.View r3 = r10.p
            r2[r6] = r3
            android.view.View r3 = r10.r
            r4 = 3
            r2[r4] = r3
            android.view.View r3 = r10.x
            r7 = 4
            r2[r7] = r3
            android.widget.Button r3 = r10.A
            r8 = 5
            r2[r8] = r3
            r3 = 6
            android.widget.Button r9 = r10.B
            r2[r3] = r9
            r3 = 7
            android.view.View r9 = r10.j
            r2[r3] = r9
            r3 = 8
            android.widget.TextView r9 = r10.f449e
            r2[r3] = r9
            r3 = 9
            android.view.View r9 = r10.f451g
            r2[r3] = r9
            r3 = 10
            android.view.View r9 = r10.m
            r2[r3] = r9
            r10.C = r2
            int[][] r2 = new int[r8][]
            int[] r3 = new int[r12]
            r3 = {x02c6: FILL_ARRAY_DATA , data: [1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0} // fill-array
            r2[r1] = r3
            int[] r1 = new int[r12]
            r1 = {x02e0: FILL_ARRAY_DATA , data: [0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0} // fill-array
            r2[r0] = r1
            int[] r1 = new int[r12]
            r1 = {x02fa: FILL_ARRAY_DATA , data: [0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0} // fill-array
            r2[r6] = r1
            int[] r1 = new int[r12]
            r1 = {x0314: FILL_ARRAY_DATA , data: [1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0} // fill-array
            r2[r4] = r1
            int[] r12 = new int[r12]
            r12 = {x032e: FILL_ARRAY_DATA , data: [0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1} // fill-array
            r2[r7] = r12
            r10.D = r2
            if (r11 < 0) goto L2a5
            int r12 = r2.length
            if (r11 >= r12) goto L2a5
            r10.H(r11)
            r12 = 2131296419(0x7f0900a3, float:1.8210754E38)
            java.lang.String r12 = android.ext.b2.f(r12)
            r10.G = r12
            android.view.View r12 = r10.f446b
            r0 = 2131034438(0x7f050146, float:1.7679394E38)
            android.view.View r12 = r12.findViewById(r0)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r10.i = r12
            if (r11 != r6) goto L234
            r11 = 2131296379(0x7f09007b, float:1.8210673E38)
            r12.setText(r11)
            android.view.View r11 = r10.f446b
            r0 = 2131034274(0x7f0500a2, float:1.767906E38)
            android.view.View r11 = r11.findViewById(r0)
            android.widget.TextView r11 = (android.widget.TextView) r11
            java.lang.String r0 = "N - __new_value__; O - __old_value__; D - __difference__;"
            java.lang.String r0 = android.ext.b2.g(r0)
            r11.setText(r0)
            android.ext.Tools.r1(r12)
            r12.setOnClickListener(r10)
            r11 = 2131296378(0x7f09007a, float:1.821067E38)
            java.lang.String r11 = android.ext.b2.f(r11)
            r10.G = r11
            boolean r11 = android.ext.Searcher.L
            r10.v(r11)
            goto L273
        L234:
            if (r11 != 0) goto L23d
            android.ext.Tools.r1(r12)
            r12.setOnClickListener(r10)
            goto L273
        L23d:
            r0 = 2131296264(0x7f090008, float:1.821044E38)
            if (r11 != r4) goto L25d
            android.ext.Tools.r1(r12)
            r12.setOnClickListener(r10)
            r12.setText(r0)
            r11 = 2131296767(0x7f0901ff, float:1.821146E38)
            java.lang.String r11 = android.ext.b2.f(r11)
            r10.G = r11
            android.ext.EditText r11 = r10.f450f
            r11.addTextChangedListener(r5)
            r10.L()
            goto L273
        L25d:
            if (r11 != r7) goto L273
            r12.setText(r0)
            android.view.View r11 = r10.f446b
            r0 = 2131034350(0x7f0500ee, float:1.7679215E38)
            android.view.View r11 = r11.findViewById(r0)
            android.widget.TextView r11 = (android.widget.TextView) r11
            android.ext.Tools.r1(r11)
            r11.setOnClickListener(r10)
        L273:
            android.widget.Button r11 = r10.A
            r11.setOnClickListener(r10)
            java.lang.CharSequence r11 = r12.getText()
            java.lang.String r11 = r11.toString()
            java.lang.String r11 = android.ext.Tools.O1(r11)
            android.ext.SystemSpinner r0 = r10.f448d
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L28d
            goto L29e
        L28d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r11 = 58
            r0.append(r11)
            java.lang.String r11 = r0.toString()
        L29e:
            r12.setText(r11)
            r10.n()
            return
        L2a5:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Type must be between: 0 and "
            r1.append(r3)
            int r2 = r2.length
            int r2 = r2 - r0
            r1.append(r2)
            java.lang.String r0 = " but got: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r12.<init>(r11)
            throw r12
    }

    private void H(int r6) {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            int[][] r2 = r5.D
            r2 = r2[r6]
            int r3 = r2.length
            if (r1 >= r3) goto L1c
            android.view.View[] r3 = r5.C
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

    public static void I(java.lang.String r3) {
            android.app.AlertDialog$Builder r0 = android.ext.f.b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 2131296418(0x7f0900a2, float:1.8210752E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r1.append(r2)
            java.lang.String r2 = ":\n"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            android.app.AlertDialog$Builder r3 = r0.setMessage(r3)
            r0 = 2131296519(0x7f090107, float:1.8210957E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            android.content.DialogInterface$OnClickListener r1 = android.ext.ConfigListAdapter.h()
            android.app.AlertDialog$Builder r3 = r3.setPositiveButton(r0, r1)
            r0 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            r1 = 0
            android.app.AlertDialog$Builder r3 = r3.setNegativeButton(r0, r1)
            android.ext.f.o(r3)
            return
    }

    private void J(boolean r12) {
            r11 = this;
            int r0 = r11.F
            if (r0 != 0) goto L1c3
            android.ext.EditText r0 = r11.f450f
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r1 = android.ext.t1.m(r0)
            int r2 = android.ext.t1.C(r0)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r1 != 0) goto L27
            boolean r5 = r11.o()
            if (r5 == 0) goto L27
            r5 = 1
            goto L28
        L27:
            r5 = 0
        L28:
            boolean r6 = android.ext.t1.n(r0)
            if (r1 == 0) goto L32
            if (r6 == 0) goto L32
            r7 = 1
            goto L33
        L32:
            r7 = 0
        L33:
            android.widget.CheckBox r8 = r11.t
            java.lang.Object r8 = r8.getTag()
            if (r8 == 0) goto L3d
            r8 = 1
            goto L3e
        L3d:
            r8 = 0
        L3e:
            if (r8 == r7) goto L5b
            android.widget.CheckBox r8 = r11.t
            if (r7 == 0) goto L47
            java.lang.String r9 = "UTF-16LE"
            goto L4e
        L47:
            r9 = 2131296841(0x7f090249, float:1.821161E38)
            java.lang.String r9 = android.ext.b2.f(r9)
        L4e:
            r8.setText(r9)
            android.widget.CheckBox r8 = r11.t
            if (r7 == 0) goto L57
            r9 = r8
            goto L58
        L57:
            r9 = 0
        L58:
            r8.setTag(r9)
        L5b:
            int r8 = android.ext.Config.B
            r8 = r8 & r3
            if (r8 == 0) goto L7c
            if (r6 == 0) goto L6c
            android.ext.EditText r6 = r11.f450f
            boolean r6 = r6.isFocused()
            if (r6 == 0) goto L6c
            r6 = 1
            goto L6d
        L6c:
            r6 = 0
        L6d:
            boolean r8 = r11.H
            if (r8 == r6) goto L7c
            if (r6 == 0) goto L75
            if (r12 != 0) goto L7c
        L75:
            r11.H = r6
            android.ext.EditText r12 = r11.f450f
            android.ext.InternalKeyboard.i(r12, r6)
        L7c:
            if (r1 == 0) goto L83
            char r12 = r0.charAt(r4)
            goto L84
        L83:
            r12 = 0
        L84:
            android.ext.SystemSpinnerType r6 = r11.q
            int r6 = r6.getSelected()
            r11.w(r12, r6)
            android.view.View r12 = r11.p
            r6 = 8
            if (r1 != 0) goto L98
            if (r2 == 0) goto L96
            goto L98
        L96:
            r8 = 0
            goto L9a
        L98:
            r8 = 8
        L9a:
            r12.setVisibility(r8)
            android.ext.SystemSpinner r12 = r11.f448d
            if (r1 == 0) goto La4
            r8 = 8
            goto La5
        La4:
            r8 = 0
        La5:
            r12.setVisibility(r8)
            if (r5 == 0) goto Laf
            a.e r12 = android.ext.c.C()
            goto Lb3
        Laf:
            a.e r12 = android.ext.c.B()
        Lb3:
            android.ext.SystemSpinner r8 = r11.f448d
            java.lang.Object r8 = r8.getTag()
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            if (r8 == r12) goto Ld6
            android.ext.SystemSpinner r8 = r11.f448d
            r8.setTag(r12)
            int r8 = r11.i()
            java.lang.Object r10 = r12.get(r8)
            if (r10 != 0) goto Lce
            r8 = 536870912(0x20000000, float:1.0842022E-19)
        Lce:
            android.ext.SystemSpinner r10 = r11.f448d
            r10.setData(r12)
            r11.D(r8)
        Ld6:
            android.widget.CheckBox r12 = r11.s
            if (r1 != 0) goto Le1
            if (r2 != 0) goto Le1
            if (r5 == 0) goto Ldf
            goto Le1
        Ldf:
            r2 = 0
            goto Le3
        Le1:
            r2 = 8
        Le3:
            r12.setVisibility(r2)
            android.widget.CheckBox r12 = r11.t
            if (r7 != 0) goto Lf0
            if (r5 == 0) goto Led
            goto Lf0
        Led:
            r2 = 8
            goto Lf1
        Lf0:
            r2 = 0
        Lf1:
            r12.setVisibility(r2)
            android.widget.Button r12 = r11.w
            if (r1 != 0) goto Lfe
            if (r5 == 0) goto Lfb
            goto Lfe
        Lfb:
            r2 = 8
            goto Lff
        Lfe:
            r2 = 0
        Lff:
            r12.setVisibility(r2)
            android.widget.Button r12 = r11.u
            if (r1 == 0) goto L108
            r2 = 0
            goto L10a
        L108:
            r2 = 8
        L10a:
            r12.setVisibility(r2)
            android.widget.Button r12 = r11.v
            r12.setVisibility(r6)
            if (r1 != 0) goto L116
            if (r5 == 0) goto L1c3
        L116:
            android.widget.CheckBox r12 = r11.s
            boolean r12 = r12.isChecked()
            if (r12 == 0) goto L123
            android.widget.CheckBox r12 = r11.s
            r12.setChecked(r4)
        L123:
            if (r1 == 0) goto L12e
            int r12 = r11.i()
            if (r12 == r9) goto L12e
            r11.D(r9)
        L12e:
            if (r5 == 0) goto L16d
            java.lang.String r12 = r0.trim()
            java.lang.String r0 = "::"
            boolean r1 = r12.contains(r0)
            int r2 = r11.j()
            if (r2 != 0) goto L141
            r2 = 4
        L141:
            int r12 = android.ext.i2.t(r12, r2, r1)
            android.widget.CheckBox r2 = r11.t
            r2.setChecked(r1)
            android.widget.Button r2 = r11.w
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r2.setTag(r3)
            android.widget.Button r2 = r11.w
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            if (r1 == 0) goto L15d
            goto L15f
        L15d:
            java.lang.String r0 = ":"
        L15f:
            r3.append(r0)
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            r2.setText(r12)
            goto L1c3
        L16d:
            char r12 = android.ext.t1.l(r0)
            android.widget.CheckBox r1 = r11.t
            r2 = 58
            if (r12 == r2) goto L17e
            r2 = 39
            if (r12 != r2) goto L17c
            goto L17e
        L17c:
            r12 = 0
            goto L17f
        L17e:
            r12 = 1
        L17f:
            r1.setChecked(r12)
            char r12 = r0.charAt(r4)
            r0 = 104(0x68, float:1.46E-43)
            if (r12 == r0) goto L190
            r0 = 72
            if (r12 != r0) goto L18f
            goto L190
        L18f:
            r3 = 0
        L190:
            android.widget.Button r0 = r11.w
            java.lang.String r1 = "HEX+U8"
            if (r3 == 0) goto L198
            r2 = r1
            goto L19a
        L198:
            java.lang.String r2 = "HEX"
        L19a:
            r0.setText(r2)
            android.widget.Button r0 = r11.u
            java.lang.String r2 = "HEX+U16"
            if (r3 != 0) goto L1a7
            r5 = 59
            if (r12 != r5) goto L1a8
        L1a7:
            r1 = r2
        L1a8:
            r0.setText(r1)
            if (r3 != 0) goto L1b5
            r0 = 81
            if (r12 == r0) goto L1b5
            r0 = 113(0x71, float:1.58E-43)
            if (r12 != r0) goto L1ba
        L1b5:
            android.widget.Button r12 = r11.v
            r12.setVisibility(r4)
        L1ba:
            android.widget.Button r12 = r11.v
            if (r3 == 0) goto L1c0
            java.lang.String r2 = "HEX+U8+U16"
        L1c0:
            r12.setText(r2)
        L1c3:
            return
    }

    private void K() {
            r2 = this;
            char r0 = r2.I
            android.ext.SystemSpinnerType r1 = r2.q
            int r1 = r1.getSelected()
            r2.w(r0, r1)
            r0 = 0
            r2.J(r0)
            return
    }

    private static java.lang.String d(java.lang.String r4) {
            java.lang.String r0 = "?"
            r1 = 0
            char r0 = r0.charAt(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        Lc:
            int r3 = r4.length()
            if (r1 >= r3) goto L23
            char r3 = r4.charAt(r1)
            if (r3 != r0) goto L1b
            java.lang.String r3 = "0"
            goto L1d
        L1b:
            java.lang.String r3 = "F"
        L1d:
            r2.append(r3)
            int r1 = r1 + 1
            goto Lc
        L23:
            java.lang.String r4 = r2.toString()
            return r4
    }

    private void n() {
            r3 = this;
            char r0 = r3.I
            int r1 = r3.E
            r3.w(r0, r1)
            android.ext.SystemSpinner r0 = r3.f448d
            int r1 = r3.F
            r2 = 3
            if (r1 != r2) goto L13
            a.e r1 = android.ext.c.C()
            goto L17
        L13:
            a.e r1 = android.ext.c.B()
        L17:
            r0.setData(r1)
            int r0 = r3.E
            r1 = 1
            a.e r0 = android.ext.c.r(r0, r1)
            int r1 = r3.E
            r3.F(r0, r1)
            android.ext.EditText r0 = r3.f450f
            r0.addTextChangedListener(r3)
            return
    }

    private boolean o() {
            r5 = this;
            int r0 = r5.F
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            android.ext.EditText r0 = r5.f450f
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            int r2 = r0.length()
            r3 = 1
            if (r2 < r3) goto L2d
            char r2 = r0.charAt(r1)
            r4 = 61
            if (r2 != r4) goto L24
            goto L2d
        L24:
            r2 = 59
            int r0 = r0.indexOf(r2)
            if (r0 <= 0) goto L2d
            r1 = 1
        L2d:
            return r1
    }

    public static long[] t(java.lang.String r4, long r5) {
            java.lang.String r0 = "?"
            java.lang.String r1 = "0"
            java.lang.String r0 = r4.replace(r0, r1)
            r1 = 16
            long r2 = android.ext.t1.r(r0, r1)
            java.lang.String r4 = d(r4)
            long r0 = android.ext.t1.r(r4, r1)
            long r4 = r0 & r5
            r6 = 2
            long[] r6 = new long[r6]
            r0 = 0
            long r1 = r2 & r4
            r6[r0] = r1
            r0 = 1
            r6[r0] = r4
            return r6
    }

    private void v(boolean r5) {
            r4 = this;
            android.ext.Searcher.L = r5
            android.widget.Button r0 = r4.A
            if (r5 == 0) goto Le
            r1 = 2131296738(0x7f0901e2, float:1.8211401E38)
        L9:
            java.lang.String r1 = android.ext.b2.f(r1)
            goto L12
        Le:
            r1 = 2131296786(0x7f090212, float:1.8211499E38)
            goto L9
        L12:
            r0.setText(r1)
            android.view.View r0 = r4.h
            r1 = 8
            r2 = 0
            if (r5 == 0) goto L1e
            r3 = 0
            goto L20
        L1e:
            r3 = 8
        L20:
            r0.setVisibility(r3)
            android.view.View r0 = r4.p
            if (r5 == 0) goto L29
            r3 = 0
            goto L2b
        L29:
            r3 = 8
        L2b:
            r0.setVisibility(r3)
            android.view.View r0 = r4.f446b
            r3 = 2131034274(0x7f0500a2, float:1.767906E38)
            android.view.View r0 = r0.findViewById(r3)
            if (r5 == 0) goto L3a
            r1 = 0
        L3a:
            r0.setVisibility(r1)
            android.view.View r0 = r4.f446b
            r1 = 2131034245(0x7f050085, float:1.7679002E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r5 == 0) goto L4d
            java.lang.String r1 = "N = O+D"
            goto L54
        L4d:
            r1 = 2131296416(0x7f0900a0, float:1.8210748E38)
            java.lang.String r1 = android.ext.b2.f(r1)
        L54:
            r0.setText(r1)
            android.view.View r0 = r4.f446b
            r1 = 2131034341(0x7f0500e5, float:1.7679197E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r5 == 0) goto L67
            java.lang.String r1 = "N ≠ O+D"
            goto L6e
        L67:
            r1 = 2131296698(0x7f0901ba, float:1.821132E38)
            java.lang.String r1 = android.ext.b2.f(r1)
        L6e:
            r0.setText(r1)
            android.view.View r0 = r4.f446b
            r1 = 2131034305(0x7f0500c1, float:1.7679124E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r5 == 0) goto L81
            java.lang.String r1 = "N > O+D"
            goto L88
        L81:
            r1 = 2131296735(0x7f0901df, float:1.8211395E38)
            java.lang.String r1 = android.ext.b2.f(r1)
        L88:
            r0.setText(r1)
            android.view.View r0 = r4.f446b
            r1 = 2131034408(0x7f050128, float:1.7679333E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r5 == 0) goto L9b
            java.lang.String r5 = "N < O+D"
            goto La2
        L9b:
            r5 = 2131296972(0x7f0902cc, float:1.8211876E38)
            java.lang.String r5 = android.ext.b2.f(r5)
        La2:
            r0.setText(r5)
            return
    }

    private void w(char r4, int r5) {
            r3 = this;
            int r0 = r3.J
            if (r0 != r5) goto L8
            char r0 = r3.I
            if (r0 == r4) goto L45
        L8:
            android.widget.TextView r0 = r3.f449e
            int r1 = r3.F
            if (r1 != 0) goto L3a
            if (r4 == 0) goto L3a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 2131296418(0x7f0900a2, float:1.8210752E38)
            java.lang.String r2 = android.ext.Tools.N1(r2)
            r1.append(r2)
            java.lang.String r2 = ": "
            r1.append(r2)
            android.ext.EditText r2 = r3.f450f
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = android.ext.t1.d(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L3e
        L3a:
            java.lang.String r1 = android.ext.c.s(r5)
        L3e:
            r0.setText(r1)
            r3.I = r4
            r3.J = r5
        L45:
            return
    }

    public void A(java.lang.String r2) {
            r1 = this;
            android.ext.EditText r0 = r1.n
            java.lang.String r2 = r2.trim()
            r0.setText(r2)
            return
    }

    public void B(boolean r2) {
            r1 = this;
            android.widget.CheckBox r0 = r1.o
            r0.setChecked(r2)
            return
    }

    public void C(android.view.View.OnClickListener r2) {
            r1 = this;
            android.widget.Button r0 = r1.B
            r0.setOnClickListener(r2)
            return
    }

    public void D(int r2) {
            r1 = this;
            android.ext.SystemSpinner r0 = r1.f448d
            r0.setSelected(r2)
            boolean r0 = r1.p()
            if (r0 == 0) goto L15
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r2 == r0) goto L15
            android.widget.CheckBox r2 = r1.s
            r0 = 0
            r2.setChecked(r0)
        L15:
            return
    }

    public void E(int r2) {
            r1 = this;
            android.ext.SystemSpinnerType r0 = r1.q
            r0.setSelected(r2)
            r1.K()
            return
    }

    public void F(a.e r4, int r5) {
            r3 = this;
            int r0 = r3.F
            if (r0 != 0) goto L5a
            r0 = 2131297005(0x7f0902ed, float:1.8211943E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r2 = " UTF-8"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = -100
            r4.put(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " UTF-16LE"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = -200(0xffffffffffffff38, float:NaN)
            r4.put(r1, r0)
            r0 = -300(0xfffffffffffffed4, float:NaN)
            java.lang.String r1 = "HEX"
            r4.put(r0, r1)
            r0 = -400(0xfffffffffffffe70, float:NaN)
            java.lang.String r1 = "HEX + UTF-8 + UTF-16LE"
            r4.put(r0, r1)
            r0 = -500(0xfffffffffffffe0c, float:NaN)
            java.lang.String r1 = "ARM (x32)"
            r4.put(r0, r1)
            r0 = -600(0xfffffffffffffda8, float:NaN)
            java.lang.String r1 = "Thumb"
            r4.put(r0, r1)
            r0 = -700(0xfffffffffffffd44, float:NaN)
            java.lang.String r1 = "ARM (x64)"
            r4.put(r0, r1)
        L5a:
            android.ext.SystemSpinnerType r0 = r3.q
            r0.setData(r4)
            r3.E(r5)
            return
    }

    a.e G(int r4) {
            r3 = this;
            r0 = 1
            a.e r0 = android.ext.c.r(r4, r0)
            int r1 = android.ext.MainService.E()
            if (r1 == 0) goto L12
            java.lang.Object r2 = r0.get(r1)
            if (r2 != 0) goto L12
            goto L13
        L12:
            r4 = r1
        L13:
            r3.F(r0, r4)
            return r0
    }

    void L() {
            r4 = this;
            int r0 = r4.F
            r1 = 3
            if (r0 != r1) goto L39
            long[] r0 = r4.s()     // Catch: java.lang.Throwable -> L17
            r1 = 1
            r1 = r0[r1]     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = java.lang.Long.toHexString(r1)     // Catch: java.lang.Throwable -> L17
            java.util.Locale r1 = java.util.Locale.US     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = r0.toUpperCase(r1)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            java.lang.String r0 = "???"
        L19:
            android.widget.TextView r1 = r4.l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 2131296908(0x7f09028c, float:1.8211746E38)
            java.lang.String r3 = android.ext.Tools.N1(r3)
            r2.append(r3)
            java.lang.String r3 = ": "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.setText(r0)
        L39:
            return
    }

    public long a() {
            r2 = this;
            java.lang.String r0 = r2.c()
            r1 = 16
            long r0 = android.ext.t1.r(r0, r1)
            return r0
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable r1) {
            r0 = this;
            return
    }

    public long b() {
            r4 = this;
            android.ext.EditText r0 = r4.z
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            int r1 = r0.length()
            if (r1 <= 0) goto L2a
            java.lang.String r0 = android.ext.j2.h(r0)
            r1 = 10
            long r1 = android.ext.t1.r(r0, r1)     // Catch: java.lang.NumberFormatException -> L23
            r3 = 1
            android.ext.y0.b(r0, r3)     // Catch: java.lang.NumberFormatException -> L23
            goto L2c
        L23:
            r0 = move-exception
            android.ext.EditText r1 = r4.z
            r1.requestFocus()
            throw r0
        L2a:
            r1 = 0
        L2c:
            return r1
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public java.lang.String c() {
            r2 = this;
            android.ext.EditText r0 = r2.k
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r1 = 1
            android.ext.y0.b(r0, r1)
            return r0
    }

    public long e(int r3) {
            r2 = this;
            android.ext.MemoryRange r0 = r2.y
            long r0 = r0.a(r3)
            return r0
    }

    public java.lang.String f() {
            r2 = this;
            int r0 = r2.F
            r1 = 2
            if (r0 != r1) goto Lc
            boolean r0 = android.ext.Searcher.L
            if (r0 != 0) goto Lc
            java.lang.String r0 = "0"
            return r0
        Lc:
            android.ext.EditText r0 = r2.f450f
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r1 = 1
            android.ext.y0.b(r0, r1)
            return r0
    }

    public android.ext.EditText g() {
            r1 = this;
            android.ext.EditText r0 = r1.f450f
            return r0
    }

    public java.lang.String h() {
            r2 = this;
            android.ext.EditText r0 = r2.n
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r1 = 1
            android.ext.y0.b(r0, r1)
            return r0
    }

    public int i() {
            r1 = this;
            android.ext.SystemSpinner r0 = r1.f448d
            int r0 = r0.getSelected()
            return r0
    }

    public int j() {
            r2 = this;
            int r0 = r2.F
            if (r0 != 0) goto L28
            android.ext.EditText r0 = r2.f450f
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r1 = android.ext.t1.m(r0)
            if (r1 == 0) goto L21
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 59
            if (r0 != r1) goto L1f
            r0 = 2
            goto L20
        L1f:
            r0 = 1
        L20:
            return r0
        L21:
            int r0 = android.ext.t1.C(r0)
            if (r0 == 0) goto L28
            return r0
        L28:
            android.ext.SystemSpinnerType r0 = r2.q
            int r0 = r0.getSelected()
            return r0
    }

    public android.view.View k() {
            r1 = this;
            android.view.View r0 = r1.f446b
            return r0
    }

    public android.view.View l() {
            r1 = this;
            android.view.View r0 = r1.m()
            android.view.View r0 = android.ext.InternalKeyboard.d(r0)
            return r0
    }

    public android.view.View m() {
            r1 = this;
            android.view.View r0 = r1.k()
            android.view.View r0 = android.ext.Tools.O0(r0)
            return r0
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton r6, boolean r7) {
            r5 = this;
            int r6 = r6.getId()
            r0 = 2131034334(0x7f0500de, float:1.7679183E38)
            if (r6 == r0) goto Laf
            r0 = 2131034351(0x7f0500ef, float:1.7679217E38)
            if (r6 == r0) goto L10
            goto Lbc
        L10:
            int r6 = r5.F
            if (r6 != 0) goto L71
            android.ext.EditText r6 = r5.f450f
            android.text.Editable r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            boolean r0 = android.ext.t1.m(r6)
            if (r0 == 0) goto L71
            char r0 = android.ext.t1.l(r6)
            r1 = 58
            r2 = 0
            r3 = 39
            r4 = 1
            if (r0 == r1) goto L35
            if (r0 != r3) goto L33
            goto L35
        L33:
            r1 = 0
            goto L36
        L35:
            r1 = 1
        L36:
            if (r1 == r7) goto Lbc
            r1 = 34
            if (r0 == r3) goto L4e
            if (r0 != r1) goto L3f
            goto L4e
        L3f:
            android.ext.EditText r6 = r5.f450f
            android.text.Editable r6 = r6.getText()
            java.lang.String r7 = java.lang.String.valueOf(r0)
            r6.replace(r2, r4, r7)
            goto Lbc
        L4e:
            if (r7 == 0) goto L51
            goto L53
        L51:
            r3 = 34
        L53:
            java.lang.String r7 = java.lang.String.valueOf(r0)
            android.ext.EditText r0 = r5.f450f
            android.text.Editable r0 = r0.getText()
            int r1 = r6.length()
        L61:
            if (r4 >= r1) goto Lbc
            char r2 = r6.charAt(r4)
            if (r2 != r3) goto L6e
            int r2 = r4 + 1
            r0.replace(r4, r2, r7)
        L6e:
            int r4 = r4 + 1
            goto L61
        L71:
            boolean r6 = r5.o()
            if (r6 == 0) goto Lbc
            android.ext.EditText r6 = r5.f450f
            android.text.Editable r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "::"
            boolean r1 = r6.contains(r0)
            if (r1 == r7) goto Lbc
            java.lang.String r1 = ":"
            if (r7 == 0) goto L8f
            r2 = r1
            goto L90
        L8f:
            r2 = r0
        L90:
            int r3 = r6.indexOf(r2)
            int r2 = r2.length()
            int r2 = r2 + r3
            r4 = -1
            if (r3 != r4) goto La1
            int r3 = r6.length()
            r2 = r3
        La1:
            android.ext.EditText r6 = r5.f450f
            android.text.Editable r6 = r6.getText()
            if (r7 == 0) goto Laa
            goto Lab
        Laa:
            r0 = r1
        Lab:
            r6.replace(r3, r2, r0)
            goto Lbc
        Laf:
            if (r7 == 0) goto Lbc
            int r6 = r5.i()
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            if (r6 == r7) goto Lbc
            r5.D(r7)
        Lbc:
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r5, int r6) {
            r4 = this;
            r5 = 0
            r0 = -100
            if (r6 > r0) goto L48
            r1 = -700(0xfffffffffffffd44, float:NaN)
            r2 = 4
            if (r6 == r1) goto L38
            r1 = -600(0xfffffffffffffda8, float:NaN)
            r3 = 2
            if (r6 == r1) goto L35
            r1 = -500(0xfffffffffffffe0c, float:NaN)
            if (r6 == r1) goto L32
            r1 = -400(0xfffffffffffffe70, float:NaN)
            r2 = 1
            if (r6 == r1) goto L2f
            r1 = -300(0xfffffffffffffed4, float:NaN)
            if (r6 == r1) goto L2c
            r1 = -200(0xffffffffffffff38, float:NaN)
            if (r6 == r1) goto L28
            if (r6 == r0) goto L25
            r6 = 0
            r2 = 0
            goto L3a
        L25:
            java.lang.String r6 = ":"
            goto L3a
        L28:
            java.lang.String r6 = ";"
        L2a:
            r2 = 2
            goto L3a
        L2c:
            java.lang.String r6 = "h"
            goto L3a
        L2f:
            java.lang.String r6 = "Q"
            goto L3a
        L32:
            java.lang.String r6 = "~A "
            goto L3a
        L35:
            java.lang.String r6 = "~T "
            goto L2a
        L38:
            java.lang.String r6 = "~A8 "
        L3a:
            if (r6 == 0) goto L48
            android.ext.EditText r0 = r4.f450f
            android.text.Editable r0 = r0.getText()
            r0.insert(r5, r6)
            r4.E(r2)
        L48:
            r4.K()
            boolean r6 = r4.p()
            if (r6 == 0) goto L5e
            int r6 = r4.i()
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r6 == r0) goto L5e
            android.widget.CheckBox r6 = r4.s
            r6.setChecked(r5)
        L5e:
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r13) {
            r12 = this;
            java.lang.String r0 = "'"
            if (r13 != 0) goto L5
            return
        L5:
            int r1 = r13.getId()
            r2 = 1
            switch(r1) {
                case 2131034248: goto L1a7;
                case 2131034281: goto L36;
                case 2131034282: goto L36;
                case 2131034329: goto L36;
                case 2131034350: goto L16;
                case 2131034438: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto L1c7
        Lf:
            java.lang.String r13 = r12.G
            I(r13)
            goto L1c7
        L16:
            android.app.AlertDialog$Builder r13 = android.ext.f.b()
            r0 = 2131296835(0x7f090243, float:1.8211598E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            android.app.AlertDialog$Builder r13 = r13.setMessage(r0)
            r0 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            r1 = 0
            android.app.AlertDialog$Builder r13 = r13.setNegativeButton(r0, r1)
            android.ext.f.o(r13)
            goto L1c7
        L36:
            boolean r1 = r12.o()
            if (r1 == 0) goto L85
            java.lang.Object r13 = r13.getTag()
            boolean r0 = r13 instanceof java.lang.Integer
            if (r0 == 0) goto L1c7
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            android.ext.EditText r0 = r12.f450f
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "::"
            boolean r2 = r0.contains(r1)
            if (r2 == 0) goto L5d
            goto L5f
        L5d:
            java.lang.String r1 = ":"
        L5f:
            int r2 = r0.indexOf(r1)
            int r0 = r0.length()
            r3 = -1
            if (r2 != r3) goto L6b
            r2 = r0
        L6b:
            android.ext.EditText r3 = r12.f450f
            android.text.Editable r3 = r3.getText()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            r3.replace(r2, r0, r13)
            goto L1c7
        L85:
            android.ext.EditText r1 = r12.f450f
            android.text.Editable r1 = r1.getText()
            int r3 = r1.length()     // Catch: java.lang.Throwable -> Lb7
            if (r3 <= 0) goto L1c7
            int r13 = r13.getId()     // Catch: java.lang.Throwable -> Lb7
            r10 = 0
            char r3 = r1.charAt(r10)     // Catch: java.lang.Throwable -> Lb7
            r4 = 104(0x68, float:1.46E-43)
            if (r3 == r4) goto La5
            r4 = 72
            if (r3 != r4) goto La3
            goto La5
        La3:
            r4 = 0
            goto La6
        La5:
            r4 = 1
        La6:
            r5 = 2131034329(0x7f0500d9, float:1.7679172E38)
            if (r13 != r5) goto Lba
            if (r4 != 0) goto Lba
            android.ext.t1.h(r1)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r13 = "h"
        Lb2:
            r1.replace(r10, r2, r13)     // Catch: java.lang.Throwable -> Lb7
            goto L1c7
        Lb7:
            r13 = move-exception
            goto L18f
        Lba:
            r6 = 39
            r7 = 2131034281(0x7f0500a9, float:1.7679075E38)
            if (r13 != r7) goto Lec
            r8 = 58
            if (r3 != r8) goto Lec
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r13.<init>()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = "Q '"
            r13.append(r3)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r2 = r3.substring(r2)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = "' 27 '"
            java.lang.String r2 = r2.replace(r0, r3)     // Catch: java.lang.Throwable -> Lb7
            r13.append(r2)     // Catch: java.lang.Throwable -> Lb7
            r13.append(r6)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> Lb7
            int r2 = r1.length()     // Catch: java.lang.Throwable -> Lb7
            goto Lb2
        Lec:
            r8 = 34
            if (r13 != r7) goto L11d
            r9 = 59
            if (r3 != r9) goto L11d
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r13.<init>()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = "Q \""
            r13.append(r3)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r2 = r3.substring(r2)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = "\""
            java.lang.String r4 = "\" 22 \""
            java.lang.String r2 = r2.replace(r3, r4)     // Catch: java.lang.Throwable -> Lb7
            r13.append(r2)     // Catch: java.lang.Throwable -> Lb7
            r13.append(r8)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> Lb7
            int r2 = r1.length()     // Catch: java.lang.Throwable -> Lb7
            goto Lb2
        L11d:
            if (r4 == 0) goto L149
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> Lb7
            byte[] r6 = android.ext.t1.h(r3)     // Catch: java.lang.Throwable -> Lb7
            r3 = 0
            r4 = 0
            int r8 = r6.length     // Catch: java.lang.Throwable -> Lb7
            r9 = 2131034282(0x7f0500aa, float:1.7679077E38)
            if (r13 == r5) goto L134
            if (r13 != r9) goto L132
            goto L134
        L132:
            r11 = 0
            goto L135
        L134:
            r11 = 1
        L135:
            if (r13 == r7) goto L13c
            if (r13 != r9) goto L13a
            goto L13c
        L13a:
            r13 = 0
            goto L13d
        L13c:
            r13 = 1
        L13d:
            r5 = r6
            r6 = r8
            r7 = r11
            r8 = r13
            r9 = r1
            android.ext.x0.b(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r13 = "Q"
            goto Lb2
        L149:
            if (r13 != r7) goto L14d
            r6 = 34
        L14d:
            r13 = 1
            r3 = 0
        L14f:
            int r4 = r1.length()     // Catch: java.lang.Throwable -> Lb7
            if (r13 >= r4) goto L1c7
            char r4 = r1.charAt(r13)     // Catch: java.lang.Throwable -> Lb7
            if (r4 != r6) goto L18d
            if (r3 != 0) goto L160
            int r3 = r13 + 1
            goto L18d
        L160:
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = r4.substring(r3, r13)     // Catch: java.lang.Throwable -> Lb7
            if (r6 != r8) goto L16c
            r5 = 1
            goto L16d
        L16c:
            r5 = 0
        L16d:
            java.nio.charset.Charset r5 = android.ext.t1.i(r5)     // Catch: java.lang.Throwable -> Lb7
            byte[] r4 = r4.getBytes(r5)     // Catch: java.lang.Throwable -> Lb7
            int r5 = r4.length     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = android.ext.InOut.b(r4, r10, r5)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> Lb7
            int r3 = r3 + (-1)
            int r5 = r13 + 1
            r1.replace(r3, r5, r4)     // Catch: java.lang.Throwable -> Lb7
            int r4 = r4.length()     // Catch: java.lang.Throwable -> Lb7
            int r5 = r5 - r3
            int r4 = r4 - r5
            int r13 = r13 + r4
            r3 = 0
        L18d:
            int r13 = r13 + r2
            goto L14f
        L18f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed convert '"
            r2.append(r3)
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.ext.e1.g(r0, r13)
            goto L1c7
        L1a7:
            int r13 = r12.F
            r0 = 2
            if (r13 != r0) goto L1b2
            boolean r13 = android.ext.Searcher.L
            r13 = r13 ^ r2
            r12.v(r13)
        L1b2:
            android.ext.EditText r13 = r12.f450f
            int r13 = r13.getVisibility()
            if (r13 != 0) goto L1c7
            android.view.View r13 = r12.h
            int r13 = r13.getVisibility()
            if (r13 != 0) goto L1c7
            android.ext.EditText r13 = r12.f450f
            r13.requestFocus()
        L1c7:
            return
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View r2, boolean r3) {
            r1 = this;
            int r3 = android.ext.Config.B
            r3 = r3 & 1
            if (r3 != 0) goto L7
            return
        L7:
            android.view.View r3 = r2.getRootView()
            r0 = 2131034303(0x7f0500bf, float:1.767912E38)
            android.view.View r3 = r3.findViewById(r0)
            android.ext.InternalKeyboard r3 = (android.ext.InternalKeyboard) r3
            if (r3 == 0) goto L3b
            int r0 = r1.F
            if (r0 != 0) goto L34
            android.ext.EditText r0 = r1.f450f
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = android.ext.t1.n(r0)
            if (r0 == 0) goto L34
            android.ext.EditText r2 = r1.f450f
            boolean r3 = r2.isFocused()
            android.ext.InternalKeyboard.i(r2, r3)
            goto L3b
        L34:
            r0 = 0
            r3.setHideKeyboard(r0)
            android.ext.Tools.S0(r2)
        L3b:
            return
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            if (r2 != 0) goto L8
            r1 = 1
            if (r3 != r1) goto L8
            if (r4 != 0) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            r0.J(r1)
            return
    }

    public boolean p() {
            r1 = this;
            android.widget.CheckBox r0 = r1.s
            boolean r0 = r0.isChecked()
            return r0
    }

    public boolean q() {
            r1 = this;
            android.widget.CheckBox r0 = r1.o
            boolean r0 = r0.isChecked()
            return r0
    }

    public void r() {
            r3 = this;
            int r0 = r3.F
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L2a
            r1 = 2
            if (r0 == r1) goto L25
            r1 = 3
            if (r0 == r1) goto L1d
            r1 = 4
            if (r0 == r1) goto L12
        Lf:
            android.ext.EditText r2 = r3.f450f
            goto L2a
        L12:
            boolean r0 = r3.f445a
            if (r0 == 0) goto L1a
        L16:
            android.ext.EditText r0 = r3.f450f
        L18:
            r2 = r0
            goto L2a
        L1a:
            android.ext.EditText r0 = r3.n
            goto L18
        L1d:
            boolean r0 = r3.f445a
            if (r0 == 0) goto L22
            goto L16
        L22:
            android.ext.EditText r0 = r3.k
            goto L18
        L25:
            boolean r0 = android.ext.Searcher.L
            if (r0 == 0) goto L2a
            goto Lf
        L2a:
            if (r2 == 0) goto L33
            r2.requestFocus()
            android.ext.Tools.o1(r2)
            goto L39
        L33:
            android.view.View r0 = r3.f446b
            r1 = 0
            r3.onFocusChange(r0, r1)
        L39:
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            int[] r0 = android.ext.Searcher.K
            int r1 = r3.F
            android.ext.MemoryRange r2 = r3.y
            int r2 = r2.getType()
            r0[r1] = r2
            return
    }

    public long[] s() {
            r3 = this;
            java.lang.String r0 = r3.f()
            long r1 = r3.a()
            long[] r0 = t(r0, r1)
            return r0
    }

    public void u(boolean r1) {
            r0 = this;
            r0.f445a = r1
            return
    }

    public void x(java.lang.String r2) {
            r1 = this;
            android.ext.EditText r0 = r1.k
            java.lang.String r2 = r2.trim()
            r0.setText(r2)
            return
    }

    public void y(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.f447c
            r0.setText(r2)
            return
    }

    public void z(java.lang.String r2) {
            r1 = this;
            android.ext.EditText r0 = r1.f450f
            java.lang.String r2 = r2.trim()
            r0.setText(r2)
            return
    }
}
