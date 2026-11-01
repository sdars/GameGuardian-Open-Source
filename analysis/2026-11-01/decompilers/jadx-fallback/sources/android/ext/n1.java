package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
class n1 extends android.ext.BaseAdapterLC implements android.ext.b3.a, android.widget.SectionIndexer, android.widget.Filterable {
    private static android.ext.n t;
    private static int[] u;
    private static volatile java.lang.CharSequence[] v;
    private static volatile int[] w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.lang.String f1115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.widget.Filter f1116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    short[] f1117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f1118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile long f1119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.nio.ByteBuffer f1120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f1121g;
    private int h;
    private boolean[] i;
    volatile int j;
    private android.ext.n1.f k;
    private int l;
    private long m;
    private final android.ext.d.a n;
    private final java.lang.CharSequence[] o;
    private long p;
    private int q;
    private int r;
    private android.ext.n1.d s;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.n1 f1122a;

        a(android.ext.n1 r1) {
                r0 = this;
                r0.f1122a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.ext.n1 r0 = r1.f1122a
                r0.notifyDataSetChanged()
                return
        }
    }

    class b implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f1123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean[] f1124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.n1 f1125c;

        b(android.ext.n1 r1, boolean r2, boolean[] r3) {
                r0 = this;
                r0.f1125c = r1
                r0.f1123a = r2
                r0.f1124b = r3
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r4, int r5) {
                r3 = this;
                boolean r4 = r3.f1123a
                r0 = 0
                if (r4 == 0) goto L7
                r4 = 0
                goto L9
            L7:
                r4 = -15999(0xffffffffffffc181, float:NaN)
            L9:
                r1 = -1
                r2 = 1
                if (r5 != r1) goto L21
            Ld:
                boolean[] r5 = r3.f1124b
                int r1 = r5.length
                if (r0 >= r1) goto L21
                boolean r5 = r5[r0]
                if (r5 == 0) goto L1a
                int r5 = r2 << r0
                r4 = r4 | r5
                goto L1e
            L1a:
                int r5 = r2 << r0
                int r5 = ~r5
                r4 = r4 & r5
            L1e:
                int r0 = r0 + 1
                goto Ld
            L21:
                boolean r5 = r3.f1123a
                if (r5 != 0) goto L30
                boolean[] r0 = r3.f1124b
                int r0 = r0.length
                int r0 = r2 << r0
                int r0 = r0 - r2
                r0 = r0 & r4
                if (r0 != 0) goto L30
                r4 = r4 | 8
            L30:
                if (r5 == 0) goto L36
                android.ext.SavedListAdapter.o(r4)
                goto L3b
            L36:
                android.ext.n1 r5 = r3.f1125c
                r5.R(r4)
            L3b:
                return
        }
    }

    class c implements android.content.DialogInterface.OnMultiChoiceClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean[] f1126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.n1 f1127b;

        c(android.ext.n1 r1, boolean[] r2) {
                r0 = this;
                r0.f1127b = r1
                r0.f1126a = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(android.content.DialogInterface r1, int r2, boolean r3) {
                r0 = this;
                boolean[] r1 = r0.f1126a
                r1[r2] = r3
                return
        }
    }

    private class d extends android.ext.p1 implements android.content.DialogInterface.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener, android.text.TextWatcher {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private java.lang.ref.WeakReference f1128f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private java.lang.ref.WeakReference f1129g;
        private java.lang.ref.WeakReference h;
        boolean i;
        final /* synthetic */ android.ext.n1 j;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.n1.d f1130a;

            a(android.ext.n1.d r1) {
                    r0 = this;
                    r0.f1130a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r1, int r2) {
                    r0 = this;
                    r1 = 2131296642(0x7f090182, float:1.8211206E38)
                    android.ext.ConfigListAdapter.t(r1)
                    return
            }
        }

        class b extends android.ext.InternalKeyboard.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.n1.d f1131a;

            b(android.ext.n1.d r1) {
                    r0 = this;
                    r0.f1131a = r1
                    r0.<init>()
                    return
            }

            @Override // android.ext.InternalKeyboard.e
            protected boolean a(android.view.View r1, boolean r2) {
                    r0 = this;
                    android.ext.n1$d r1 = r0.f1131a
                    boolean r1 = r1.i
                    return r1
            }
        }

        public d(android.ext.n1 r2) {
                r1 = this;
                r1.j = r2
                r2 = 2131296453(0x7f0900c5, float:1.8210823E38)
                r0 = 2130968612(0x7f040024, float:1.7545883E38)
                r1.<init>(r2, r0)
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r0 = 0
                r2.<init>(r0)
                r1.f1128f = r2
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r0)
                r1.f1129g = r2
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r0)
                r1.h = r2
                r2 = 0
                r1.i = r2
                return
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable r6) {
                r5 = this;
                java.lang.String r6 = r6.toString()
                java.lang.ref.WeakReference r0 = r5.f1129g
                java.lang.Object r0 = r0.get()
                android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                if (r0 != 0) goto Lf
                return
            Lf:
                r1 = 94
                int r1 = r6.indexOf(r1)
                r2 = 0
                r3 = 1
                r4 = -1
                if (r1 == r4) goto L1c
                r1 = 1
                goto L1d
            L1c:
                r1 = 0
            L1d:
                r0.setChecked(r1)
                java.lang.ref.WeakReference r0 = r5.h
                java.lang.Object r0 = r0.get()
                android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                if (r0 != 0) goto L2b
                return
            L2b:
                r1 = 36
                int r6 = r6.indexOf(r1)
                if (r6 == r4) goto L34
                r2 = 1
            L34:
                r0.setChecked(r2)
                return
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton r5, boolean r6) {
                r4 = this;
                if (r5 != 0) goto L3
                return
            L3:
                java.lang.ref.WeakReference r0 = r4.f1128f
                java.lang.Object r0 = r0.get()
                android.ext.EditText r0 = (android.ext.EditText) r0
                if (r0 != 0) goto Le
                return
            Le:
                int r5 = r5.getId()
                r1 = 2131034244(0x7f050084, float:1.7679E38)
                java.lang.String r2 = ""
                if (r5 == r1) goto L5a
                r1 = 2131034249(0x7f050089, float:1.767901E38)
                if (r5 == r1) goto L4d
                r1 = 2131034416(0x7f050130, float:1.7679349E38)
                if (r5 == r1) goto L24
                goto L7b
            L24:
                android.text.Editable r5 = r0.getText()
                java.lang.String r5 = r5.toString()
                java.lang.String r1 = "^"
                boolean r3 = r5.contains(r1)
                if (r3 == r6) goto L7b
                if (r6 == 0) goto L3f
                android.text.Editable r5 = r0.getText()
                r6 = 0
                r5.replace(r6, r6, r1)
                goto L7b
            L3f:
                int r5 = r5.indexOf(r1)
                android.text.Editable r6 = r0.getText()
                int r0 = r5 + 1
                r6.replace(r5, r0, r2)
                goto L7b
            L4d:
                r4.i = r6
                android.view.View$OnFocusChangeListener r5 = r0.getOnFocusChangeListener()
                if (r5 == 0) goto L7b
                r6 = 1
                r5.onFocusChange(r0, r6)
                goto L7b
            L5a:
                android.text.Editable r5 = r0.getText()
                java.lang.String r5 = r5.toString()
                java.lang.String r1 = "$"
                boolean r3 = r5.contains(r1)
                if (r3 == r6) goto L7b
                if (r6 == 0) goto L3f
                android.text.Editable r6 = r0.getText()
                int r0 = r5.length()
                int r5 = r5.length()
                r6.replace(r0, r5, r1)
            L7b:
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r3, int r4) {
                r2 = this;
                r3 = -1
                if (r4 != r3) goto L27
                java.lang.ref.WeakReference r3 = r2.f1128f
                java.lang.Object r3 = r3.get()
                android.ext.EditText r3 = (android.ext.EditText) r3
                if (r3 != 0) goto Le
                return
            Le:
                android.text.Editable r3 = r3.getText()
                java.lang.String r3 = r3.toString()
                int r4 = r3.length()
                if (r4 <= 0) goto L29
                boolean r4 = r2.i
                if (r4 == 0) goto L22
                r4 = 2
                goto L23
            L22:
                r4 = 1
            L23:
                android.ext.y0.b(r3, r4)
                goto L29
            L27:
                java.lang.String r3 = ""
            L29:
                android.ext.n1 r4 = r2.j
                r4.f1115a = r3
                android.ext.MainService r4 = android.ext.MainService.instance
                android.widget.TextView r4 = r4.t
                int r0 = r3.length()
                if (r0 <= 0) goto L53
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 2131296453(0x7f0900c5, float:1.8210823E38)
                java.lang.String r1 = android.ext.Tools.N1(r1)
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                goto L5a
            L53:
                r3 = 2131296807(0x7f090227, float:1.8211541E38)
                java.lang.String r3 = android.ext.b2.f(r3)
            L5a:
                r4.setText(r3)
                android.ext.n1 r3 = r2.j
                r3.notifyDataSetChanged()
                return
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View r6) {
                r5 = this;
                r0 = 2131296311(0x7f090037, float:1.8210535E38)
                r1 = 2131034328(0x7f0500d8, float:1.767917E38)
                r2 = 0
                if (r6 == 0) goto L55
                int r6 = r6.getId()
                if (r6 != r1) goto L55
                android.app.AlertDialog$Builder r6 = android.ext.f.b()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r3 = 2131296418(0x7f0900a2, float:1.8210752E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                r1.append(r3)
                java.lang.String r3 = ":\n"
                r1.append(r3)
                r3 = 2131296773(0x7f090205, float:1.8211472E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.app.AlertDialog$Builder r6 = r6.setMessage(r1)
                r1 = 2131296519(0x7f090107, float:1.8210957E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                android.ext.n1$d$a r3 = new android.ext.n1$d$a
                r3.<init>(r5)
                android.app.AlertDialog$Builder r6 = r6.setPositiveButton(r1, r3)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r6 = r6.setNegativeButton(r0, r2)
                android.ext.f.o(r6)
                return
            L55:
                r6 = 2131099660(0x7f06000c, float:1.781168E38)
                android.view.View r6 = a.d.f(r6, r2)
                android.view.View r1 = r6.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                android.ext.Tools.r1(r1)
                r1.setOnClickListener(r5)
                r1 = 2131034249(0x7f050089, float:1.767901E38)
                android.view.View r1 = r6.findViewById(r1)
                android.widget.CheckBox r1 = (android.widget.CheckBox) r1
                boolean r3 = r5.i
                r1.setChecked(r3)
                r3 = 2131296724(0x7f0901d4, float:1.8211373E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                r1.setText(r3)
                r1.setOnCheckedChangeListener(r5)
                r1 = 2131034416(0x7f050130, float:1.7679349E38)
                android.view.View r1 = r6.findViewById(r1)
                android.widget.CheckBox r1 = (android.widget.CheckBox) r1
                r1.setOnCheckedChangeListener(r5)
                java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
                r3.<init>(r1)
                r5.f1129g = r3
                r1 = 2131034244(0x7f050084, float:1.7679E38)
                android.view.View r1 = r6.findViewById(r1)
                android.widget.CheckBox r1 = (android.widget.CheckBox) r1
                r1.setOnCheckedChangeListener(r5)
                java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
                r3.<init>(r1)
                r5.h = r3
                android.ext.n1 r1 = r5.j
                java.lang.String r1 = r1.f1115a
                if (r1 != 0) goto Lb1
                java.lang.String r1 = ""
            Lb1:
                android.ext.n1$d$b r3 = new android.ext.n1$d$b
                r3.<init>(r5)
                r4 = 2131034262(0x7f050096, float:1.7679037E38)
                android.view.View r4 = r6.findViewById(r4)
                android.ext.EditText r4 = (android.ext.EditText) r4
                r4.setText(r1)
                r1 = 3
                r4.setDataType(r1)
                android.ext.Tools.z1(r4, r3)
                r4.addTextChangedListener(r5)
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r4)
                r5.f1128f = r1
                android.text.Editable r1 = r4.getText()
                r5.afterTextChanged(r1)
                r1 = 2131034347(0x7f0500eb, float:1.7679209E38)
                android.view.View r1 = r6.findViewById(r1)
                android.ext.HexConverter r1 = (android.ext.HexConverter) r1
                r1.setTag(r4)
                android.ext.InternalKeyboard$d r1 = new android.ext.InternalKeyboard$d
                r3 = 15
                r1.<init>(r3)
                r6.setTag(r1)
                android.app.AlertDialog$Builder r1 = android.ext.f.b()
                android.view.View r6 = android.ext.InternalKeyboard.d(r6)
                android.app.AlertDialog$Builder r6 = r1.setView(r6)
                r1 = 2131296836(0x7f090244, float:1.82116E38)
                android.app.AlertDialog$Builder r6 = r6.setPositiveButton(r1, r5)
                android.app.AlertDialog$Builder r6 = r6.setNegativeButton(r0, r2)
                r0 = 2131296323(0x7f090043, float:1.821056E38)
                android.app.AlertDialog$Builder r6 = r6.setNeutralButton(r0, r5)
                android.app.AlertDialog r6 = r6.create()
                android.ext.f.n(r6, r4)
                return
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }
    }

    private class e extends android.widget.Filter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.ext.n f1132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int[] f1133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.n1 f1134c;

        private e(android.ext.n1 r1) {
                r0 = this;
                r0.f1134c = r1
                r0.<init>()
                r1 = 0
                r0.f1132a = r1
                r0.f1133b = r1
                return
        }

        /* synthetic */ e(android.ext.n1 r1, android.ext.n1.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private java.lang.String a(java.lang.String r3) {
                r2 = this;
                java.util.Locale r0 = java.util.Locale.US
                java.lang.String r3 = r3.toLowerCase(r0)
                java.lang.String r0 = android.ext.t1.f1251a
                java.lang.String r1 = ""
                java.lang.String r3 = r3.replace(r0, r1)
                return r3
        }

        @Override // android.widget.Filter
        protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r11) {
                r10 = this;
                android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
                r0.<init>()
                r1 = 0
                r0.values = r1
                r2 = 0
                android.ext.n1 r3 = r10.f1134c     // Catch: java.lang.Throwable -> L2f
                int r3 = r3.j     // Catch: java.lang.Throwable -> L2f
                r3 = r3 & 12
                if (r3 != 0) goto L13
                r3 = 1
                goto L14
            L13:
                r3 = 0
            L14:
                if (r11 == 0) goto Lbf
                int r4 = r11.length()     // Catch: java.lang.Throwable -> L2f
                if (r4 <= 0) goto Lbf
                android.ext.n1 r4 = r10.f1134c     // Catch: java.lang.Throwable -> L2f
                boolean r4 = r4.E()     // Catch: java.lang.Throwable -> L2f
                if (r4 == 0) goto Lbf
                java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L2f
                if (r3 == 0) goto L32
                java.lang.String r11 = r10.a(r11)     // Catch: java.lang.Throwable -> L2f
                goto L32
            L2f:
                r11 = move-exception
                goto Lb3
            L32:
                java.lang.String r11 = android.ext.Tools.k1(r11)     // Catch: java.lang.Throwable -> L2f
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
                r4.<init>()     // Catch: java.lang.Throwable -> L2f
                java.lang.String r5 = "Filter: '"
                r4.append(r5)     // Catch: java.lang.Throwable -> L2f
                r4.append(r11)     // Catch: java.lang.Throwable -> L2f
                r5 = 39
                r4.append(r5)     // Catch: java.lang.Throwable -> L2f
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2f
                android.ext.e1.d(r4)     // Catch: java.lang.Throwable -> L2f
                r4 = 8
                java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11, r4)     // Catch: java.lang.Throwable -> L2f
                android.ext.n1 r4 = r10.f1134c     // Catch: java.lang.Throwable -> L2f
                int r4 = r4.j     // Catch: java.lang.Throwable -> L2f
                r4 = r4 & 48
                if (r4 != 0) goto L5f
                r4 = r1
                goto L6b
            L5f:
                android.ext.n r4 = r10.f1132a     // Catch: java.lang.Throwable -> L2f
                if (r4 == 0) goto L64
                goto L6b
            L64:
                android.ext.n r4 = new android.ext.n     // Catch: java.lang.Throwable -> L2f
                r4.<init>()     // Catch: java.lang.Throwable -> L2f
                r10.f1132a = r4     // Catch: java.lang.Throwable -> L2f
            L6b:
                android.ext.n1 r5 = r10.f1134c     // Catch: java.lang.Throwable -> L2f
                int r5 = r5.j     // Catch: java.lang.Throwable -> L2f
                r5 = r5 & 64
                if (r5 != 0) goto L74
                goto L7f
            L74:
                int[] r1 = r10.f1133b     // Catch: java.lang.Throwable -> L2f
                if (r1 == 0) goto L79
                goto L7f
            L79:
                int[] r1 = android.ext.m.d()     // Catch: java.lang.Throwable -> L2f
                r10.f1133b = r1     // Catch: java.lang.Throwable -> L2f
            L7f:
                android.ext.n1 r5 = r10.f1134c     // Catch: java.lang.Throwable -> L2f
                int r5 = r5.s()     // Catch: java.lang.Throwable -> L2f
                short r5 = (short) r5     // Catch: java.lang.Throwable -> L2f
                short[] r6 = new short[r5]     // Catch: java.lang.Throwable -> L2f
                r7 = 0
                r8 = 0
            L8a:
                if (r7 >= r5) goto Lac
                android.ext.n1 r9 = r10.f1134c     // Catch: java.lang.Throwable -> L2f
                java.lang.String r9 = r9.z(r4, r1, r7)     // Catch: java.lang.Throwable -> L2f
                if (r3 == 0) goto L98
                java.lang.String r9 = r10.a(r9)     // Catch: java.lang.Throwable -> L2f
            L98:
                java.util.regex.Matcher r9 = r11.matcher(r9)     // Catch: java.lang.Throwable -> L2f
                boolean r9 = r9.find()     // Catch: java.lang.Throwable -> L2f
                if (r9 != 0) goto La3
                goto La8
            La3:
                int r9 = r8 + 1
                r6[r8] = r7     // Catch: java.lang.Throwable -> L2f
                r8 = r9
            La8:
                int r7 = r7 + 1
                short r7 = (short) r7     // Catch: java.lang.Throwable -> L2f
                goto L8a
            Lac:
                short[] r11 = java.util.Arrays.copyOf(r6, r8)     // Catch: java.lang.Throwable -> L2f
                r0.values = r11     // Catch: java.lang.Throwable -> L2f
                goto Lbf
            Lb3:
                java.lang.String r1 = "Failed filter"
                android.ext.e1.g(r1, r11)
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                android.ext.n0.h(r1, r11, r2)
            Lbf:
                return r0
        }

        @Override // android.widget.Filter
        protected void publishResults(java.lang.CharSequence r1, android.widget.Filter.FilterResults r2) {
                r0 = this;
                android.ext.n1 r1 = r0.f1134c
                java.lang.Object r2 = r2.values
                short[] r2 = (short[]) r2
                r1.f1117c = r2
                r1.P()
                return
        }
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        short[] f1136b;

        private f(int r1, short[] r2) {
                r0 = this;
                r0.<init>()
                r0.f1135a = r1
                r0.f1136b = r2
                return
        }

        /* synthetic */ f(int r1, short[] r2, android.ext.n1.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    static {
            return
    }

    public n1() {
            r7 = this;
            r7.<init>()
            java.lang.String r0 = ""
            r7.f1115a = r0
            r0 = 0
            r7.f1116b = r0
            r7.f1117c = r0
            r1 = -1
            r7.h = r1
            r7.i = r0
            r1 = -15999(0xffffffffffffc181, float:NaN)
            r7.j = r1
            r7.k = r0
            r2 = 2
            r7.l = r2
            r3 = 0
            r7.m = r3
            android.ext.d$a r5 = new android.ext.d$a
            r5.<init>()
            r7.n = r5
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]
            r7.o = r2
            r5 = 1
            r7.p = r5
            r2 = 0
            r7.q = r2
            r7.r = r2
            r7.s = r0
            android.content.SharedPreferences r0 = android.ext.Tools.M0()
            java.lang.String r2 = "memory-editor-format"
            int r0 = r0.getInt(r2, r1)
            r7.j = r0
            r7.a()
            r0 = 8200(0x2008, float:1.149E-41)
            byte[] r0 = new byte[r0]
            r7.f1118d = r0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r7.f1120f = r0
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r1)
            r7.f1121g = r3
            r7.f1119e = r3
            android.ext.MainService r0 = android.ext.MainService.instance
            android.widget.TextView r0 = r0.u
            java.lang.CharSequence r1 = r7.A()
            r0.setText(r1)
            return
    }

    private java.lang.CharSequence A() {
            r1 = this;
            int r0 = r1.j
            java.lang.CharSequence r0 = B(r0)
            return r0
    }

    static java.lang.CharSequence B(int r6) {
            java.lang.CharSequence[] r0 = v()
            int r1 = r0.length
            int r1 = r1 * 2
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
            r2 = 0
            r3 = 0
        Lb:
            int r4 = r0.length
            if (r2 >= r4) goto L26
            r4 = 1
            int r4 = r4 << r2
            r4 = r4 & r6
            if (r4 == 0) goto L23
            if (r3 <= 0) goto L1c
            int r4 = r3 + 1
            java.lang.String r5 = ","
            r1[r3] = r5
            r3 = r4
        L1c:
            int r4 = r3 + 1
            r5 = r0[r2]
            r1[r3] = r5
            r3 = r4
        L23:
            int r2 = r2 + 1
            goto Lb
        L26:
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r1, r3)
            java.lang.CharSequence[] r6 = (java.lang.CharSequence[]) r6
            java.lang.CharSequence r6 = android.ext.Tools.x(r6)
            return r6
    }

    private int C(int r2) {
            r1 = this;
            short[] r0 = r1.f1117c
            int r2 = D(r2, r0)
            return r2
    }

    private static int D(int r0, short[] r1) {
            if (r1 != 0) goto L3
            return r0
        L3:
            short r0 = (short) r0
            int r0 = java.util.Arrays.binarySearch(r1, r0)
            if (r0 < 0) goto Lb
            return r0
        Lb:
            int r0 = -r0
            int r0 = r0 + (-2)
            if (r0 >= 0) goto L11
            r0 = 0
        L11:
            return r0
    }

    public static java.lang.String H(long r2, int r4) {
            byte[] r2 = android.ext.t1.g(r2)
            r3 = 8
            r3 = r2[r3]
            if (r3 <= r4) goto Lb
            goto Lc
        Lb:
            r4 = r3
        Lc:
            r3 = r4 & 1
            if (r3 != 0) goto L12
            int r4 = r4 + 1
        L12:
            java.lang.String r3 = new java.lang.String
            r0 = 1
            int r4 = r4 + r0
            java.nio.charset.Charset r0 = android.ext.t1.i(r0)
            r1 = 0
            r3.<init>(r2, r1, r4, r0)
            return r3
    }

    public static java.lang.String I(long r7, int r9) {
            r0 = 8
            byte[] r1 = new byte[r0]
            r2 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r7
            int r3 = (int) r2
            byte r2 = (byte) r3
            r3 = 0
            r1[r3] = r2
            r4 = 65280(0xff00, double:3.22526E-319)
            long r4 = r4 & r7
            long r4 = r4 >> r0
            int r2 = (int) r4
            byte r2 = (byte) r2
            r4 = 1
            r1[r4] = r2
            r4 = 16711680(0xff0000, double:8.256667E-317)
            long r4 = r4 & r7
            r2 = 16
            long r4 = r4 >> r2
            int r2 = (int) r4
            byte r2 = (byte) r2
            r4 = 2
            r1[r4] = r2
            r4 = 4278190080(0xff000000, double:2.113706745E-314)
            long r4 = r4 & r7
            r2 = 24
            long r4 = r4 >> r2
            int r2 = (int) r4
            byte r2 = (byte) r2
            r4 = 3
            r1[r4] = r2
            r4 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r4 = r4 & r7
            r2 = 32
            long r4 = r4 >> r2
            int r5 = (int) r4
            byte r4 = (byte) r5
            r5 = 4
            r1[r5] = r4
            r4 = 280375465082880(0xff0000000000, double:1.38523885234213E-309)
            long r4 = r4 & r7
            r6 = 40
            long r4 = r4 >> r6
            int r5 = (int) r4
            byte r4 = (byte) r5
            r5 = 5
            r1[r5] = r4
            r4 = 71776119061217280(0xff000000000000, double:7.06327445644526E-304)
            long r4 = r4 & r7
            r6 = 48
            long r4 = r4 >> r6
            int r5 = (int) r4
            byte r4 = (byte) r5
            r5 = 6
            r1[r5] = r4
            r4 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r7 = r7 & r4
            r4 = 56
            long r7 = r7 >> r4
            int r8 = (int) r7
            byte r7 = (byte) r8
            r8 = 7
            r1[r8] = r7
            r7 = 0
        L63:
            if (r7 >= r0) goto L70
            r8 = r1[r7]
            if (r8 >= r2) goto L6d
            r8 = 46
            r1[r7] = r8
        L6d:
            int r7 = r7 + 1
            goto L63
        L70:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1)
            java.lang.String r7 = r7.substring(r3, r9)
            return r7
    }

    private int J(int r3) {
            r2 = this;
            short[] r0 = r2.f1117c
            int r1 = r2.u()
            int r3 = K(r3, r0, r1)
            return r3
    }

    private static int K(int r1, short[] r2, int r3) {
            if (r2 == 0) goto L11
            if (r1 >= 0) goto L5
            goto L11
        L5:
            int r0 = r2.length
            if (r1 < r0) goto Lf
            int r2 = r2.length
            int r1 = r1 - r2
            r2 = 8192(0x2000, float:1.148E-41)
            int r2 = r2 >> r3
            int r1 = r1 + r2
            goto L11
        Lf:
            short r1 = r2[r1]
        L11:
            return r1
    }

    private static int N(android.widget.TextView r0, java.lang.CharSequence r1, int r2, int r3) {
            O(r0, r1)
            if (r1 == 0) goto L8
            if (r2 >= r3) goto L8
            r2 = r3
        L8:
            return r2
    }

    private static void O(android.widget.TextView r1, java.lang.CharSequence r2) {
            if (r2 != 0) goto L8
            r2 = 8
            r1.setVisibility(r2)
            goto Lf
        L8:
            r0 = 0
            r1.setVisibility(r0)
            r1.setText(r2)
        Lf:
            return
    }

    private void Q(android.ext.c3 r26, int r27) {
            r25 = this;
            r14 = r25
            r15 = r26
            r0 = r27
            android.widget.CheckBox r1 = r15.f661a
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            int r2 = android.ext.Config.q
            int r3 = android.ext.Tools.d1()
            r4 = 4
            int r3 = r3 + r4
            r16 = 1
            int r3 = r16 << r3
            r2 = r2 & r3
            r3 = -2
            if (r2 == 0) goto L1e
            r2 = -2
            goto L22
        L1e:
            int r2 = android.ext.Tools.H()
        L22:
            r1.height = r2
            r1 = 32
            r2 = 0
            if (r0 == 0) goto Lfb
            int r5 = r25.getCount()
            int r5 = r5 + (-1)
            if (r0 != r5) goto L33
            goto Lfb
        L33:
            android.widget.CheckBox r3 = r15.f661a
            r3.setVisibility(r2)
            android.widget.TextView r3 = r15.f662b
            r3.setVisibility(r2)
            android.widget.TextView r3 = r15.j
            r3.setVisibility(r2)
            r15.m = r0
            long r12 = r14.e(r0)
            android.widget.TextView r3 = r15.j
            java.lang.CharSequence r4 = r14.t(r12)
            r3.setText(r4)
            android.widget.TextView r3 = r15.f662b
            java.lang.String r1 = android.ext.c.G(r12, r1)
            r3.setText(r1)
            boolean[] r1 = r14.i     // Catch: java.lang.IndexOutOfBoundsException -> L5f
            boolean r2 = r1[r0]     // Catch: java.lang.IndexOutOfBoundsException -> L5f
            goto L65
        L5f:
            r0 = move-exception
            java.lang.String r1 = "ArrayAdapter getView failed"
            android.ext.e1.l(r1, r0)
        L65:
            android.widget.CheckBox r0 = r15.f661a
            r0.setChecked(r2)
            int r0 = r14.h
            r15.a(r2, r0)
            java.nio.ByteBuffer r0 = r14.f1120f
            int r1 = r14.n(r12)
            long r17 = r0.getLong(r1)
            boolean r0 = r25.E()
            android.ext.MainService r1 = android.ext.MainService.instance
            android.ext.d r11 = r1.u0
            r8 = 0
            android.widget.TextView r9 = r15.p
            r10 = 9
            r19 = 64
            r20 = 8
            r21 = 4
            r1 = r25
            r2 = r0
            r3 = r11
            r4 = r12
            r6 = r17
            r22 = r11
            r11 = r19
            r23 = r12
            r12 = r20
            r13 = r21
            int r8 = r1.x(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13)
            android.widget.TextView r9 = r15.s
            r10 = 12
            r11 = 32
            r12 = 8
            r13 = 4
            r3 = r22
            r4 = r23
            int r8 = r1.x(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13)
            android.widget.TextView r9 = r15.o
            r10 = 8
            r11 = 16
            r12 = 4
            int r8 = r1.x(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13)
            android.widget.TextView r9 = r15.n
            r10 = 7
            r11 = 4
            int r8 = r1.x(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13)
            android.widget.TextView r9 = r15.t
            r10 = 13
            r11 = 8
            int r8 = r1.x(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13)
            android.widget.TextView r9 = r15.q
            r10 = 10
            r11 = 2
            r12 = 2
            r13 = 2
            int r8 = r1.x(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13)
            android.widget.TextView r9 = r15.r
            r10 = 11
            r11 = 1
            r12 = 1
            r13 = 1
            int r1 = r1.x(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13)
            if (r1 != 0) goto Led
            int r1 = r25.u()
            int r1 = r16 << r1
        Led:
            r8 = r1
            int r6 = r14.j
            r1 = r26
            r2 = r23
            r4 = r17
            r7 = r0
            c(r1, r2, r4, r6, r7, r8)
            return
        Lfb:
            android.widget.CheckBox r5 = r15.f661a
            r5.setVisibility(r4)
            android.widget.TextView r4 = r15.f662b
            r5 = 8
            r4.setVisibility(r5)
            android.widget.TextView r4 = r15.f663c
            r4.setVisibility(r5)
            android.widget.TextView r4 = r15.f664d
            r4.setVisibility(r5)
            android.widget.TextView r4 = r15.f665e
            r4.setVisibility(r2)
            android.widget.TextView r4 = r15.f666f
            r4.setVisibility(r5)
            android.widget.TextView r4 = r15.f667g
            r4.setVisibility(r5)
            android.widget.TextView r4 = r15.h
            r4.setVisibility(r5)
            android.widget.TextView r4 = r15.i
            r4.setVisibility(r5)
            android.widget.TextView r4 = r15.n
            r4.setVisibility(r5)
            android.widget.TextView r4 = r15.o
            r4.setVisibility(r5)
            android.widget.TextView r4 = r15.p
            r4.setVisibility(r5)
            android.widget.TextView r4 = r15.q
            r4.setVisibility(r5)
            android.widget.TextView r4 = r15.r
            r4.setVisibility(r5)
            android.widget.TextView r4 = r15.s
            r4.setVisibility(r5)
            android.widget.TextView r4 = r15.t
            r4.setVisibility(r5)
            android.widget.TextView r4 = r15.j
            r4.setVisibility(r5)
            r15.a(r2, r3)
            if (r0 == 0) goto L159
            r0 = 1
            goto L15a
        L159:
            r0 = 0
        L15a:
            long[] r0 = r14.y(r0)
            android.widget.TextView r3 = r15.f665e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 2131296515(0x7f090103, float:1.8210949E38)
            java.lang.String r5 = android.ext.b2.f(r5)
            r4.append(r5)
            r4.append(r1)
            r5 = r0[r2]
            java.lang.String r0 = android.ext.c.G(r5, r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.setText(r0)
            return
    }

    private void a() {
            r13 = this;
            int r0 = r13.getCount()
            boolean[] r1 = r13.i
            android.ext.n1$f r2 = r13.k
            int r3 = r13.u()
            short[] r4 = r13.f1117c
            if (r1 == 0) goto L1a
            int r5 = r1.length
            if (r0 != r5) goto L1a
            if (r2 == 0) goto L1a
            int r5 = r2.f1135a
            if (r3 != r5) goto L1a
            goto L5e
        L1a:
            boolean[] r5 = new boolean[r0]
            r13.i = r5
            if (r2 == 0) goto L56
            int r6 = r2.f1135a
            short[] r2 = r2.f1136b
            r7 = 1
            int r8 = r7 << r6
            int r8 = r8 - r7
            int r0 = r0 + (-1)
            r9 = 1
        L2b:
            if (r9 >= r0) goto L56
            int r10 = r9 + (-1)
            int r10 = K(r10, r4, r3)
            int r10 = r10 << r3
            r11 = r10 & r8
            if (r11 == 0) goto L39
            goto L53
        L39:
            int r10 = r10 >> r6
            int r11 = D(r10, r2)
            int r12 = K(r11, r2, r6)
            if (r10 == r12) goto L45
            goto L53
        L45:
            int r11 = r11 + 1
            if (r11 < 0) goto L53
            int r10 = r1.length
            if (r11 >= r10) goto L53
            boolean r10 = r1[r11]
            if (r10 != 0) goto L51
            goto L53
        L51:
            r5[r9] = r7
        L53:
            int r9 = r9 + 1
            goto L2b
        L56:
            android.ext.n1$f r0 = new android.ext.n1$f
            r1 = 0
            r0.<init>(r3, r4, r1)
            r13.k = r0
        L5e:
            return
    }

    static void c(android.ext.b3 r16, long r17, long r19, int r21, boolean r22, int r23) {
            r0 = r16
            r1 = r17
            r3 = r19
            android.widget.TextView r5 = r0.h
            r6 = 1
            long r8 = r1 & r6
            r10 = 59
            r11 = 0
            r12 = 0
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 != 0) goto L3a
            r8 = r21 & 32
            if (r8 != 0) goto L1a
            goto L3a
        L1a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.ext.n r9 = android.ext.n1.t
            if (r9 == 0) goto L24
            goto L2b
        L24:
            android.ext.n r9 = new android.ext.n
            r9.<init>()
            android.ext.n1.t = r9
        L2b:
            java.lang.String r9 = android.ext.n.q(r9, r1, r3)
            r8.append(r9)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            goto L3b
        L3a:
            r8 = r11
        L3b:
            r9 = 2
            r14 = r23
            int r5 = N(r5, r8, r14, r9)
            android.widget.TextView r8 = r0.f667g
            r14 = 3
            long r14 = r14 & r1
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 != 0) goto L70
            r12 = r21 & 16
            if (r12 != 0) goto L50
            goto L70
        L50:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            android.ext.n r13 = android.ext.n1.t
            if (r13 == 0) goto L5a
            goto L61
        L5a:
            android.ext.n r13 = new android.ext.n
            r13.<init>()
            android.ext.n1.t = r13
        L61:
            java.lang.String r13 = android.ext.n.o(r13, r1, r3)
            r12.append(r13)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            goto L71
        L70:
            r12 = r11
        L71:
            r13 = 4
            int r5 = N(r8, r12, r5, r13)
            android.widget.TextView r8 = r0.i
            if (r9 != 0) goto L9c
            r9 = r21 & 64
            if (r9 != 0) goto L7f
            goto L9c
        L7f:
            int[] r9 = android.ext.n1.u
            if (r9 == 0) goto L84
            goto L8a
        L84:
            int[] r9 = android.ext.m.d()
            android.ext.n1.u = r9
        L8a:
            int r12 = (int) r3
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.StringBuilder r1 = android.ext.m.g(r9, r1, r12, r14)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            goto L9d
        L9c:
            r1 = r11
        L9d:
            int r1 = N(r8, r1, r5, r13)
            r2 = r21 & 1
            r5 = 0
            java.lang.String r8 = "?"
            r9 = 8
            if (r2 == 0) goto Lf7
            if (r22 == 0) goto Le1
            if (r1 == r9) goto Lb6
            int r2 = r1 * 8
            long r14 = r6 << r2
            long r14 = r14 - r6
            long r2 = r3 & r14
            goto Lb7
        Lb6:
            r2 = r3
        Lb7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r10 = r1 * 2
            java.lang.String r10 = android.ext.t2.e(r10, r2)
            r4.append(r10)
            java.lang.String r10 = "h;"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            android.ext.MainService r10 = android.ext.MainService.instance
            android.ext.z1$d r10 = r10.v0
            if (r1 == r13) goto Ldc
            if (r10 == 0) goto Le3
            boolean r10 = r10.n
            if (r10 == 0) goto Le3
            if (r1 != r9) goto Le3
        Ldc:
            android.ext.RegionList$b r10 = android.ext.RegionList.b(r2)
            goto Le4
        Le1:
            r2 = r3
            r4 = r8
        Le3:
            r10 = r11
        Le4:
            android.widget.TextView r12 = r0.f663c
            O(r12, r4)
            android.widget.TextView r4 = r0.f663c
            int r10 = android.ext.RegionList.b.c(r10)
            r4.setTextColor(r10)
            r4 = 1
            if (r1 != r4) goto Lfd
            r5 = 1
            goto Lfd
        Lf7:
            android.widget.TextView r2 = r0.f663c
            O(r2, r11)
            r2 = r3
        Lfd:
            if (r5 != 0) goto L133
            r4 = r21 & 2
            if (r4 == 0) goto L133
            if (r22 == 0) goto L12c
            long r4 = java.lang.Long.reverseBytes(r2)
            int r10 = r1 * 8
            int r12 = 64 - r10
            long r4 = r4 >> r12
            if (r1 == r9) goto L114
            long r12 = r6 << r10
            long r12 = r12 - r6
            long r4 = r4 & r12
        L114:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r7 = r1 * 2
            java.lang.String r4 = android.ext.t2.e(r7, r4)
            r6.append(r4)
            java.lang.String r4 = "r;"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            goto L12d
        L12c:
            r4 = r8
        L12d:
            android.widget.TextView r5 = r0.f664d
            O(r5, r4)
            goto L138
        L133:
            android.widget.TextView r4 = r0.f664d
            O(r4, r11)
        L138:
            android.widget.TextView r4 = r0.f665e
            r5 = r21 & 4
            if (r5 != 0) goto L140
            r5 = r11
            goto L15e
        L140:
            if (r22 == 0) goto L15d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 39
            r5.append(r6)
            java.lang.String r6 = I(r2, r1)
            r5.append(r6)
            java.lang.String r6 = "';"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            goto L15e
        L15d:
            r5 = r8
        L15e:
            O(r4, r5)
            android.widget.TextView r0 = r0.f666f
            r4 = r21 & 8
            if (r4 != 0) goto L168
            goto L186
        L168:
            if (r22 == 0) goto L185
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 34
            r4.append(r5)
            java.lang.String r1 = H(r2, r1)
            r4.append(r1)
            java.lang.String r1 = "\";"
            r4.append(r1)
            java.lang.String r11 = r4.toString()
            goto L186
        L185:
            r11 = r8
        L186:
            O(r0, r11)
            return
    }

    static int[] g() {
            int[] r0 = android.ext.n1.w
            if (r0 != 0) goto L6c
            r0 = 2130837526(0x7f020016, float:1.7280009E38)
            int r0 = android.ext.Tools.d0(r0)
            r1 = 2130837530(0x7f02001a, float:1.7280017E38)
            int r1 = android.ext.Tools.d0(r1)
            r2 = 14
            int[] r2 = new int[r2]
            r3 = 0
            r4 = -1
            r2[r3] = r4
            r3 = 1
            r2[r3] = r4
            r5 = 2
            r2[r5] = r4
            r6 = 3
            r2[r6] = r4
            r4 = 4
            r2[r4] = r0
            r6 = 5
            r2[r6] = r1
            r1 = 6
            r2[r1] = r0
            r0 = 7
            int r1 = android.ext.c.n(r4)
            r2[r0] = r1
            r0 = 16
            int r0 = android.ext.c.n(r0)
            r1 = 8
            r2[r1] = r0
            r0 = 64
            int r0 = android.ext.c.n(r0)
            r4 = 9
            r2[r4] = r0
            r0 = 10
            int r4 = android.ext.c.n(r5)
            r2[r0] = r4
            r0 = 11
            int r3 = android.ext.c.n(r3)
            r2[r0] = r3
            r0 = 32
            int r0 = android.ext.c.n(r0)
            r3 = 12
            r2[r3] = r0
            r0 = 13
            int r1 = android.ext.c.n(r1)
            r2[r0] = r1
            android.ext.n1.w = r2
            return r2
        L6c:
            int[] r0 = android.ext.n1.w
            return r0
    }

    private int h() {
            r1 = this;
            short[] r0 = r1.f1117c
            if (r0 != 0) goto L9
            int r0 = r1.s()
            goto La
        L9:
            int r0 = r0.length
        La:
            return r0
    }

    private int j() {
            r6 = this;
            int r0 = r6.j
            int r1 = r6.r
            if (r0 == r1) goto L20
            r1 = 14
            int[] r2 = new int[r1]
            r2 = {x0024: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 4, 2, 4, 4, 16, 64, 2, 1, 32, 8} // fill-array
            r3 = 0
            r4 = 0
        Lf:
            if (r3 >= r1) goto L1c
            r5 = 1
            int r5 = r5 << r3
            r5 = r5 & r0
            if (r5 == 0) goto L19
            r5 = r2[r3]
            r4 = r4 | r5
        L19:
            int r3 = r3 + 1
            goto Lf
        L1c:
            r6.r = r0
            r6.q = r4
        L20:
            int r0 = r6.q
            return r0
    }

    private int k(long r1) {
            r0 = this;
            int r1 = r0.p(r1)
            r0.h = r1
            return r1
    }

    static java.lang.CharSequence[] l() {
            r0 = 14
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]
            r1 = 2131296472(0x7f0900d8, float:1.8210862E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 0
            r0[r2] = r1
            r1 = 2131296473(0x7f0900d9, float:1.8210864E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r3 = 1
            r0[r3] = r1
            r1 = 2131296474(0x7f0900da, float:1.8210866E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r4 = 2
            r0[r4] = r1
            r1 = 3
            java.lang.String r4 = "UTF-16LE"
            r0[r1] = r4
            r1 = 2131296471(0x7f0900d7, float:1.821086E38)
            java.lang.String r4 = android.ext.b2.f(r1)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = "ARM (x32)"
            r5[r2] = r6
            java.lang.String r4 = android.ext.Tools.L1(r4, r5)
            r5 = 4
            r0[r5] = r4
            java.lang.String r4 = android.ext.b2.f(r1)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = "Thumb"
            r5[r2] = r6
            java.lang.String r4 = android.ext.Tools.L1(r4, r5)
            r5 = 5
            r0[r5] = r4
            java.lang.String r1 = android.ext.b2.f(r1)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "ARM (x64)"
            r3[r2] = r4
            java.lang.String r1 = android.ext.Tools.L1(r1, r3)
            r2 = 6
            r0[r2] = r1
            r1 = 2131297034(0x7f09030a, float:1.8212002E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 7
            r0[r2] = r1
            r1 = 2131297037(0x7f09030d, float:1.8212008E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 8
            r0[r2] = r1
            r1 = 2131297031(0x7f090307, float:1.8211995E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 9
            r0[r2] = r1
            r1 = 2131297043(0x7f090313, float:1.821202E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 10
            r0[r2] = r1
            r1 = 2131297028(0x7f090304, float:1.821199E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 11
            r0[r2] = r1
            r1 = 2131297039(0x7f09030f, float:1.8212012E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 12
            r0[r2] = r1
            r1 = 2131297045(0x7f090315, float:1.8212024E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 13
            r0[r2] = r1
            return r0
    }

    private android.view.View m(android.view.ViewGroup r3) {
            r2 = this;
            r0 = 2131099682(0x7f060022, float:1.7811724E38)
            r1 = 0
            android.view.View r3 = a.d.g(r0, r3, r1)
            android.ext.c3 r0 = new android.ext.c3
            r0.<init>(r3, r2)
            r1 = 2131034443(0x7f05014b, float:1.7679404E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.n = r1
            r1 = 2131034444(0x7f05014c, float:1.7679406E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.o = r1
            r1 = 2131034442(0x7f05014a, float:1.7679402E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.p = r1
            r1 = 2131034453(0x7f050155, float:1.7679424E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.q = r1
            r1 = 2131034441(0x7f050149, float:1.76794E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.r = r1
            r1 = 2131034448(0x7f050150, float:1.7679414E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.s = r1
            r1 = 2131034454(0x7f050156, float:1.7679426E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.t = r1
            return r3
    }

    private int n(long r3) {
            r2 = this;
            r0 = 8191(0x1fff, double:4.047E-320)
            long r3 = r3 & r0
            int r4 = (int) r3
            return r4
    }

    private long o() {
            r2 = this;
            long r0 = r2.f1121g
            return r0
    }

    private java.lang.CharSequence t(long r13) {
            r12 = this;
            java.lang.CharSequence[] r0 = r12.o
            long r1 = r12.o()
            long r3 = r12.p
            r5 = 4096(0x1000, double:2.0237E-320)
            r7 = 0
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 == 0) goto L22
            r12.p = r1
            r3 = 0
        L12:
            int r4 = r0.length
            if (r3 >= r4) goto L22
            long r8 = (long) r3
            long r8 = r8 * r5
            long r8 = r8 + r1
            java.lang.CharSequence r4 = android.ext.RegionList.a(r8)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L12
        L22:
            int r3 = r0.length
            if (r7 >= r3) goto L39
            int r3 = r7 + 1
            long r8 = (long) r3
            long r8 = r8 * r5
            long r8 = r8 + r1
            r10 = 1
            long r8 = r8 - r10
            boolean r4 = android.ext.Tools.T1(r13, r8)
            if (r4 == 0) goto L37
            r13 = r0[r7]
            return r13
        L37:
            r7 = r3
            goto L22
        L39:
            java.lang.String r13 = "??"
            return r13
    }

    private int u() {
            r7 = this;
            int r0 = r7.l
            int r1 = r7.j
            r2 = 17179869184(0x400000000, double:8.487983164E-314)
            long r4 = (long) r1
            long r2 = r2 | r4
            long r4 = r7.m
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L22
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L17
            r0 = 0
            goto L1e
        L17:
            r0 = r1 & 1056(0x420, float:1.48E-42)
            if (r0 == 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 2
        L1e:
            r7.l = r0
            r7.m = r2
        L22:
            return r0
    }

    private static java.lang.CharSequence[] v() {
            java.lang.CharSequence[] r0 = android.ext.n1.v
            if (r0 != 0) goto L97
            r0 = 14
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r0]
            r2 = 2131296670(0x7f09019e, float:1.8211263E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r3 = 0
            r1[r3] = r2
            r2 = 2131296912(0x7f090290, float:1.8211754E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r4 = 1
            r1[r4] = r2
            r2 = 2
            java.lang.String r4 = "S"
            r1[r2] = r4
            r2 = 3
            java.lang.String r4 = "J"
            r1[r2] = r4
            r2 = 4
            java.lang.String r4 = "A"
            r1[r2] = r4
            r2 = 5
            java.lang.String r4 = "T"
            r1[r2] = r4
            r2 = 6
            java.lang.String r4 = "A8"
            r1[r2] = r4
            r2 = 2131297035(0x7f09030b, float:1.8212004E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r4 = 7
            r1[r4] = r2
            r2 = 2131297038(0x7f09030e, float:1.821201E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r4 = 8
            r1[r4] = r2
            r2 = 2131297033(0x7f090309, float:1.8212E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r4 = 9
            r1[r4] = r2
            r2 = 2131297044(0x7f090314, float:1.8212022E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r4 = 10
            r1[r4] = r2
            r2 = 2131297029(0x7f090305, float:1.8211991E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r4 = 11
            r1[r4] = r2
            r2 = 2131297041(0x7f090311, float:1.8212016E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r4 = 12
            r1[r4] = r2
            r2 = 2131297046(0x7f090316, float:1.8212026E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r4 = 13
            r1[r4] = r2
            int[] r2 = g()
        L85:
            if (r3 >= r0) goto L94
            r4 = r1[r3]
            r5 = r2[r3]
            java.lang.CharSequence r4 = android.ext.Tools.t(r4, r5)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L85
        L94:
            android.ext.n1.v = r1
            return r1
        L97:
            java.lang.CharSequence[] r0 = android.ext.n1.v
            return r0
    }

    private int w(long r6, long r8, int r10, java.lang.StringBuilder r11, int r12, int r13, int r14, int r15) {
            r5 = this;
            r0 = 1
            int r15 = r15 - r0
            long r1 = (long) r15
            long r1 = r1 & r6
            r3 = 0
            int r15 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r15 != 0) goto L20
            int r15 = r5.j
            int r12 = r0 << r12
            r12 = r12 & r15
            if (r12 == 0) goto L20
            java.lang.String r6 = android.ext.c.K(r6, r8, r13)
            r11.append(r6)
            java.lang.String r6 = "\n"
            r11.append(r6)
            if (r10 != 0) goto L20
            r10 = r14
        L20:
            return r10
    }

    private int x(boolean r12, android.ext.d r13, long r14, long r16, int r18, android.widget.TextView r19, int r20, int r21, int r22, int r23) {
            r11 = this;
            r0 = r11
            r1 = r14
            r3 = r19
            r4 = r21
            r5 = 1
            int r6 = r23 + (-1)
            long r6 = (long) r6
            long r6 = r6 & r1
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L6c
            int r6 = r0.j
            int r5 = r5 << r20
            r5 = r5 & r6
            if (r5 == 0) goto L6c
            if (r12 == 0) goto L62
            r5 = r16
            java.lang.String r5 = android.ext.c.K(r14, r5, r4)
            android.ext.d$a r6 = r0.n
            r7 = r13
            r13.a(r14, r4, r6)
            boolean r7 = r6.f702b
            if (r7 == 0) goto L49
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = " ("
            r7.append(r5)
            long r5 = r6.f701a
            java.lang.String r1 = android.ext.c.I(r14, r5, r4)
            r7.append(r1)
            r1 = 41
            r7.append(r1)
            java.lang.String r5 = r7.toString()
        L49:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.CharSequence r2 = android.ext.c.A(r21)
            r1.append(r2)
            r2 = 59
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L64
        L62:
            java.lang.String r1 = "?"
        L64:
            O(r3, r1)
            if (r18 != 0) goto L70
            r1 = r22
            goto L72
        L6c:
            r1 = 0
            O(r3, r1)
        L70:
            r1 = r18
        L72:
            return r1
    }

    private long[] y(boolean r7) {
            r6 = this;
            long r0 = r6.o()
            r2 = 0
            if (r7 != 0) goto L13
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto Le
            r2 = r0
            goto L21
        Le:
            r2 = 1
            long r2 = r0 - r2
            goto L21
        L13:
            r4 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4 + r0
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 != 0) goto L1f
            r2 = 8191(0x1fff, double:4.047E-320)
            long r0 = r0 + r2
            r2 = r0
            goto L20
        L1f:
            r2 = r4
        L20:
            r0 = r4
        L21:
            r7 = 2
            long[] r7 = new long[r7]
            r4 = 0
            r7[r4] = r2
            r2 = 1
            r7[r2] = r0
            return r7
    }

    boolean E() {
            r5 = this;
            long r0 = r5.f1119e
            long r2 = r5.o()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public void F() {
            r4 = this;
            android.ext.MainService r0 = android.ext.MainService.instance
            r0.Q()
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.f0 r0 = r0.i
            long r1 = r4.o()
            r3 = 8196(0x2004, float:1.1485E-41)
            r0.O(r1, r3)
            return
    }

    public void G(android.ext.w r11) {
            r10 = this;
            long r0 = r10.o()
            r2 = 0
            r11.j()     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            long r3 = r11.g()     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            int r5 = r11.f()     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            java.lang.String r6 = ")"
            java.lang.String r7 = ") != "
            java.lang.String r8 = " ("
            int r9 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r9 != 0) goto L68
            r3 = 8192(0x2000, float:1.148E-41)
            if (r5 < r3) goto L2a
            byte[] r3 = r10.f1118d     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r11.d(r3, r2, r5)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            goto Lb0
        L25:
            r11 = move-exception
            goto La6
        L28:
            r11 = move-exception
            goto La6
        L2a:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r4.<init>()     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            java.lang.String r9 = "Size mismatch: "
            r4.append(r9)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r4.append(r5)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r4.append(r8)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            java.util.Locale r9 = java.util.Locale.US     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            java.lang.String r5 = r5.toUpperCase(r9)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r4.append(r5)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r4.append(r7)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r4.append(r3)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r4.append(r8)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            java.lang.String r3 = r3.toUpperCase(r9)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r4.append(r3)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r4.append(r6)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            java.lang.String r3 = r4.toString()     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r11.<init>(r3)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            throw r11     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
        L68:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r5.<init>()     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            java.lang.String r9 = "Offset mismatch: "
            r5.append(r9)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r5.append(r3)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r5.append(r8)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            java.lang.String r3 = java.lang.Long.toHexString(r3)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            java.lang.String r3 = r3.toUpperCase(r4)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r5.append(r3)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r5.append(r7)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r5.append(r0)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r5.append(r8)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            java.lang.String r3 = java.lang.Long.toHexString(r0)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            java.lang.String r3 = r3.toUpperCase(r4)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r5.append(r3)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r5.append(r6)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            java.lang.String r3 = r5.toString()     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            r11.<init>(r3)     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
            throw r11     // Catch: java.io.IOException -> L25 java.lang.RuntimeException -> L28
        La6:
            java.lang.String r3 = "Failed load data to memory editor"
            android.ext.e1.s(r3, r11)
            byte[] r11 = r10.f1118d
            java.util.Arrays.fill(r11, r2)
        Lb0:
            r10.f1119e = r0
            android.ext.MainService r11 = android.ext.MainService.instance
            android.widget.ListView r11 = r11.M
            android.ext.n1$a r0 = new android.ext.n1$a
            r0.<init>(r10)
            r11.post(r0)
            return
    }

    public void L() {
            r0 = this;
            r0.F()
            return
    }

    public void M(long r6, int r8) {
            r5 = this;
            r0 = -8192(0xffffffffffffe000, double:NaN)
            long r0 = r0 & r6
            long r2 = r5.f1121g
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L14
            r5.f1121g = r0
            boolean[] r0 = r5.i
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r5.notifyDataSetChanged()
        L14:
            android.ext.MainService r0 = android.ext.MainService.instance
            android.widget.ListView r0 = r0.M
            int r6 = r5.k(r6)
            android.ext.Tools.B1(r0, r6, r8)
            return
    }

    void P() {
            r0 = this;
            r0.a()
            super.notifyDataSetChanged()
            return
    }

    void R(int r10) {
            r9 = this;
            int r0 = r9.j
            if (r10 != r0) goto L5
            return
        L5:
            int r0 = r9.u()
            android.ext.MainService r1 = android.ext.MainService.instance
            android.widget.ListView r1 = r1.M
            android.ext.Tools$a0 r1 = android.ext.Tools.J0(r1)
            int r2 = r1.f498a
            long r2 = r9.e(r2)
            int r4 = r9.h
            if (r4 >= 0) goto L1e
            r4 = -1
            goto L22
        L1e:
            long r4 = r9.e(r4)
        L22:
            r9.j = r10
            android.ext.g2 r10 = new android.ext.g2
            r10.<init>()
            int r6 = r9.j
            r7 = -15999(0xffffffffffffc181, float:NaN)
            java.lang.String r8 = "memory-editor-format"
            android.ext.g2 r10 = r10.g(r8, r6, r7)
            r10.commit()
            r9.notifyDataSetChanged()
            int r10 = r9.u()
            if (r0 == r10) goto L56
            int r10 = r9.p(r2)
            r1.f498a = r10
            android.ext.MainService r10 = android.ext.MainService.instance
            android.widget.ListView r10 = r10.M
            android.ext.Tools.A1(r10, r1)
            int r10 = r9.h
            if (r10 < 0) goto L56
            int r10 = r9.p(r4)
            r9.h = r10
        L56:
            android.ext.MainService r10 = android.ext.MainService.instance
            android.widget.TextView r10 = r10.u
            java.lang.CharSequence r0 = r9.A()
            r10.setText(r0)
            return
    }

    public void b() {
            r11 = this;
            android.ext.MainService r0 = android.ext.MainService.instance
            int r0 = r0.H()
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            java.lang.CharSequence[] r1 = l()
            int r4 = r11.j
            if (r0 == 0) goto L1f
            r4 = 7
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            int r4 = android.ext.SavedListAdapter.f360c
        L1f:
            int r5 = r1.length
            boolean[] r5 = new boolean[r5]
            java.lang.CharSequence[] r6 = v()
            int[] r7 = g()
            r8 = 0
        L2b:
            int r9 = r1.length
            if (r8 >= r9) goto L5b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = r6[r8]
            r9.append(r10)
            java.lang.String r10 = ": "
            r9.append(r10)
            r10 = r1[r8]
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r10 = r7[r8]
            java.lang.CharSequence r9 = android.ext.Tools.t(r9, r10)
            r1[r8] = r9
            int r9 = r3 << r8
            r9 = r9 & r4
            if (r9 == 0) goto L55
            r9 = 1
            goto L56
        L55:
            r9 = 0
        L56:
            r5[r8] = r9
            int r8 = r8 + 1
            goto L2b
        L5b:
            android.ext.n1$b r2 = new android.ext.n1$b
            r2.<init>(r11, r0, r5)
            android.content.Context r0 = android.ext.Tools.k0()
            android.app.AlertDialog$Builder r0 = android.ext.f.c(r0)
            r3 = 2131297081(0x7f090339, float:1.8212097E38)
            android.view.View r3 = android.ext.Tools.g0(r3)
            android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r3)
            android.ext.n1$c r3 = new android.ext.n1$c
            r3.<init>(r11, r5)
            android.app.AlertDialog$Builder r0 = r0.setMultiChoiceItems(r1, r5, r3)
            r1 = 2131297115(0x7f09035b, float:1.8212166E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            r1 = 2131296898(0x7f090282, float:1.8211726E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setNeutralButton(r1, r2)
            r1 = 2131296805(0x7f090225, float:1.8211537E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            android.ext.f.o(r0)
            return
    }

    public void d() {
            r8 = this;
            long r0 = r8.o()
            r8.p = r0
            r2 = 0
            r3 = 0
        L8:
            java.lang.CharSequence[] r4 = r8.o
            int r4 = r4.length
            if (r2 >= r4) goto L29
            long r4 = (long) r2
            r6 = 4096(0x1000, double:2.0237E-320)
            long r4 = r4 * r6
            long r4 = r4 + r0
            java.lang.CharSequence r4 = android.ext.RegionList.a(r4)
            java.lang.CharSequence[] r5 = r8.o
            r5 = r5[r2]
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L26
            java.lang.CharSequence[] r3 = r8.o
            r3[r2] = r4
            r3 = 1
        L26:
            int r2 = r2 + 1
            goto L8
        L29:
            if (r3 == 0) goto L2e
            r8.notifyDataSetChanged()
        L2e:
            return
    }

    public long e(int r3) {
            r2 = this;
            int r3 = r3 + (-1)
            int r3 = r2.J(r3)
            long r0 = (long) r3
            long r0 = r2.r(r0)
            return r0
    }

    public boolean[] f() {
            r1 = this;
            boolean[] r0 = r1.i
            return r0
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            int r0 = r1.h()
            int r0 = r0 + 2
            return r0
    }

    @Override // android.widget.Filterable
    public android.widget.Filter getFilter() {
            r2 = this;
            android.widget.Filter r0 = r2.f1116b
            if (r0 != 0) goto Lc
            android.ext.n1$e r0 = new android.ext.n1$e
            r1 = 0
            r0.<init>(r2, r1)
            r2.f1116b = r0
        Lc:
            return r0
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int r10) {
            r9 = this;
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L33
            int r2 = r9.getCount()
            int r2 = r2 - r1
            if (r10 != r2) goto Lc
            goto L33
        Lc:
            long r4 = r9.e(r10)
            int r10 = android.ext.c.S(r4, r0)
            int r0 = r9.j()
            r10 = r10 & r0
            if (r10 == 0) goto L1d
        L1b:
            r8 = r10
            goto L22
        L1d:
            int r10 = android.ext.c.S(r4, r1)
            goto L1b
        L22:
            java.nio.ByteBuffer r10 = r9.f1120f
            int r0 = r9.n(r4)
            long r6 = r10.getLong(r0)
            android.ext.c r10 = new android.ext.c
            r3 = r10
            r3.<init>(r4, r6, r8)
            return r10
        L33:
            if (r10 == 0) goto L37
            r10 = 1
            goto L38
        L37:
            r10 = 0
        L38:
            long[] r10 = r9.y(r10)
            android.ext.v0 r2 = new android.ext.v0
            r3 = r10[r0]
            r0 = r10[r1]
            r2.<init>(r3, r0)
            return r2
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = r2.e(r3)
            return r0
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int r7) {
            r6 = this;
            long r0 = r6.f1121g
            long r2 = (long) r7
            r4 = 256(0x100, double:1.265E-321)
            long r2 = r2 * r4
            long r0 = r0 + r2
            int r7 = r6.p(r0)
            return r7
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int r5) {
            r4 = this;
            long r0 = r4.e(r5)
            long r2 = r4.o()
            long r0 = r0 - r2
            r2 = 256(0x100, double:1.265E-321)
            long r0 = r0 / r2
            int r5 = (int) r0
            if (r5 >= 0) goto L10
            r5 = 0
        L10:
            r0 = 32
            if (r5 < r0) goto L16
            r5 = 31
        L16:
            return r5
    }

    @Override // android.widget.SectionIndexer
    public java.lang.Object[] getSections() {
            r9 = this;
            r0 = 32
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
        L5:
            if (r2 >= r0) goto L19
            long r3 = r9.f1121g
            long r5 = (long) r2
            r7 = 256(0x100, double:1.265E-321)
            long r5 = r5 * r7
            long r3 = r3 + r5
            r5 = 4
            java.lang.String r3 = android.ext.c.G(r3, r5)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L5
        L19:
            return r1
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            if (r4 == 0) goto La
            java.lang.Object r0 = r4.getTag()
            boolean r0 = r0 instanceof android.ext.c3
            if (r0 != 0) goto Le
        La:
            android.view.View r4 = r2.m(r5)
        Le:
            java.lang.Object r0 = r4.getTag()
            android.ext.c3 r0 = (android.ext.c3) r0
            boolean r1 = r0.b()
            if (r1 == 0) goto L25
            android.view.View r4 = r2.m(r5)
            java.lang.Object r5 = r4.getTag()
            r0 = r5
            android.ext.c3 r0 = (android.ext.c3) r0
        L25:
            r2.Q(r0, r3)
            return r4
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.ext.p1 i() {
            r1 = this;
            android.ext.n1$d r0 = r1.s
            if (r0 != 0) goto Lb
            android.ext.n1$d r0 = new android.ext.n1$d
            r0.<init>(r1)
            r1.s = r0
        Lb:
            return r0
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
            r2 = this;
            android.widget.Filter r0 = r2.getFilter()
            java.lang.String r1 = r2.f1115a
            r0.filter(r1)
            r2.P()
            return
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton r3, boolean r4) {
            r2 = this;
            java.lang.Object r3 = r3.getTag()
            android.ext.b3 r3 = (android.ext.b3) r3
            if (r3 != 0) goto L9
            return
        L9:
            boolean[] r0 = r2.i     // Catch: java.lang.IndexOutOfBoundsException -> L15
            int r1 = r3.m     // Catch: java.lang.IndexOutOfBoundsException -> L15
            r0[r1] = r4     // Catch: java.lang.IndexOutOfBoundsException -> L15
            android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.IndexOutOfBoundsException -> L15
            r0.p1()     // Catch: java.lang.IndexOutOfBoundsException -> L15
            goto L1b
        L15:
            r0 = move-exception
            java.lang.String r1 = "ArrayAdapter onCheckedChanged failed"
            android.ext.e1.l(r1, r0)
        L1b:
            int r0 = r2.h
            r3.a(r4, r0)
            return
    }

    public int p(long r3) {
            r2 = this;
            long r0 = r2.o()
            long r3 = r3 - r0
            int r0 = r2.u()
            long r3 = r3 >> r0
            int r4 = (int) r3
            int r3 = r2.C(r4)
            int r3 = r3 + 1
            return r3
    }

    public int q(boolean[] r8, android.util.SparseIntArray r9) {
            r7 = this;
            int r0 = r8.length
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 1
            r4 = 0
        L6:
            if (r3 >= r0) goto L18
            boolean r5 = r8[r3]
            if (r5 == 0) goto L15
            long r5 = r7.e(r3)
            int r5 = android.ext.c.T(r5, r2, r9)
            r4 = r4 | r5
        L15:
            int r3 = r3 + 1
            goto L6
        L18:
            int r8 = android.ext.Config.B
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L2c
            int r8 = r7.j()
            int r9 = java.lang.Integer.bitCount(r8)
            if (r9 != r1) goto L2c
            r8 = r8 & r4
            if (r8 == 0) goto L2c
            r4 = r8
        L2c:
            return r4
    }

    public long r(long r3) {
            r2 = this;
            int r0 = r2.u()
            long r3 = r3 << r0
            long r0 = r2.o()
            long r3 = r3 + r0
            return r3
    }

    int s() {
            r2 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            int r1 = r2.u()
            int r0 = r0 >> r1
            return r0
    }

    java.lang.String z(android.ext.n r19, int[] r20, int r21) {
            r18 = this;
            r11 = r18
            r12 = r19
            boolean r0 = r18.E()
            if (r0 != 0) goto Ld
            java.lang.String r0 = ""
            return r0
        Ld:
            r0 = r21
            long r0 = (long) r0
            long r13 = r11.r(r0)
            java.nio.ByteBuffer r0 = r11.f1120f
            int r1 = r11.n(r13)
            long r15 = r0.getLong(r1)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r5 = 0
            r7 = 9
            r8 = 64
            r9 = 8
            r17 = 4
            r0 = r18
            r1 = r13
            r3 = r15
            r6 = r10
            r21 = r10
            r10 = r17
            int r5 = r0.w(r1, r3, r5, r6, r7, r8, r9, r10)
            r7 = 12
            r8 = 32
            r10 = 4
            r6 = r21
            int r5 = r0.w(r1, r3, r5, r6, r7, r8, r9, r10)
            r7 = 8
            r8 = 16
            r9 = 4
            int r5 = r0.w(r1, r3, r5, r6, r7, r8, r9, r10)
            r7 = 7
            r8 = 4
            int r5 = r0.w(r1, r3, r5, r6, r7, r8, r9, r10)
            r7 = 13
            r8 = 8
            int r5 = r0.w(r1, r3, r5, r6, r7, r8, r9, r10)
            r7 = 10
            r8 = 2
            r9 = 2
            r10 = 2
            int r5 = r0.w(r1, r3, r5, r6, r7, r8, r9, r10)
            r7 = 11
            r8 = 1
            r9 = 1
            r10 = 1
            int r0 = r0.w(r1, r3, r5, r6, r7, r8, r9, r10)
            r1 = 1
            if (r0 != 0) goto L76
            int r0 = r18.u()
            int r0 = r1 << r0
        L76:
            int r2 = r11.j
            r2 = r2 & r1
            r3 = 0
            r4 = 1
            r6 = 8
            java.lang.String r7 = "\n"
            if (r2 == 0) goto L9f
            if (r0 == r6) goto L8a
            int r2 = r0 * 8
            long r8 = r4 << r2
            long r8 = r8 - r4
            long r15 = r15 & r8
        L8a:
            r8 = r15
            int r2 = r0 * 2
            java.lang.String r2 = android.ext.t2.e(r2, r8)
            r10 = r21
            r10.append(r2)
            r10.append(r7)
            if (r0 != r1) goto L9c
            goto L9d
        L9c:
            r1 = 0
        L9d:
            r3 = r1
            goto La2
        L9f:
            r10 = r21
            r8 = r15
        La2:
            if (r3 != 0) goto Lc5
            int r1 = r11.j
            r1 = r1 & 2
            if (r1 == 0) goto Lc5
            long r1 = java.lang.Long.reverseBytes(r8)
            int r3 = r0 * 8
            int r15 = 64 - r3
            long r1 = r1 >> r15
            if (r0 == r6) goto Lb9
            long r15 = r4 << r3
            long r15 = r15 - r4
            long r1 = r1 & r15
        Lb9:
            int r3 = r0 * 2
            java.lang.String r1 = android.ext.t2.e(r3, r1)
            r10.append(r1)
            r10.append(r7)
        Lc5:
            int r1 = r11.j
            r1 = r1 & 4
            if (r1 == 0) goto Ld5
            java.lang.String r1 = I(r8, r0)
            r10.append(r1)
            r10.append(r7)
        Ld5:
            int r1 = r11.j
            r1 = r1 & r6
            if (r1 == 0) goto Le4
            java.lang.String r0 = H(r8, r0)
            r10.append(r0)
            r10.append(r7)
        Le4:
            int r0 = r11.j
            r0 = r0 & 16
            if (r0 == 0) goto Lf4
            java.lang.String r0 = android.ext.n.o(r12, r13, r8)
            r10.append(r0)
            r10.append(r7)
        Lf4:
            int r0 = r11.j
            r0 = r0 & 32
            if (r0 == 0) goto L104
            java.lang.String r0 = android.ext.n.q(r12, r13, r8)
            r10.append(r0)
            r10.append(r7)
        L104:
            int r0 = r11.j
            r0 = r0 & 64
            if (r0 == 0) goto L113
            int r0 = (int) r8
            r1 = r20
            android.ext.m.g(r1, r13, r0, r10)
            r10.append(r7)
        L113:
            java.lang.String r0 = r10.toString()
            return r0
    }
}
