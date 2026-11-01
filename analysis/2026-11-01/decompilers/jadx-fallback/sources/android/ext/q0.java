package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class q0 extends android.ext.p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final android.util.SparseBooleanArray f1186f = null;

    static /* synthetic */ class a {
    }

    private class b implements android.view.View.OnClickListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnShowListener, android.view.View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.view.View f1187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.ext.EditText f1188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private android.widget.CheckBox f1189c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private android.ext.EditText f1190d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private android.widget.CheckBox f1191e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private android.ext.EditText f1192f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private android.widget.CheckBox f1193g;
        private android.ext.EditText h;
        private android.widget.CheckBox i;
        private android.ext.EditText j;
        private android.widget.CheckBox k;
        private android.ext.SystemSpinner l;
        private android.widget.CheckBox m;
        private android.ext.SystemSpinner n;
        private android.ext.EditText o;
        private android.widget.CheckBox p;
        private android.ext.SystemSpinner q;
        private final int[] r;
        private final android.widget.CheckBox[] s;
        private android.content.SharedPreferences t;
        private android.app.AlertDialog u;
        final /* synthetic */ android.ext.q0 v;

        class a implements android.text.TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.widget.CheckBox f1194a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.q0.b f1195b;

            a(android.ext.q0.b r1, android.widget.CheckBox r2) {
                    r0 = this;
                    r0.f1195b = r1
                    r0.f1194a = r2
                    r0.<init>()
                    return
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable r2) {
                    r1 = this;
                    android.widget.CheckBox r2 = r1.f1194a
                    r0 = 1
                    r2.setChecked(r0)
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
                    return
            }
        }

        /* JADX INFO: renamed from: android.ext.q0$b$b, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0020b implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.widget.CheckBox f1196a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.q0.b f1197b;

            DialogInterfaceOnClickListenerC0020b(android.ext.q0.b r1, android.widget.CheckBox r2) {
                    r0 = this;
                    r0.f1197b = r1
                    r0.f1196a = r2
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r1, int r2) {
                    r0 = this;
                    android.widget.CheckBox r1 = r0.f1196a
                    r2 = 1
                    r1.setChecked(r2)
                    return
            }
        }

        private b(android.ext.q0 r1) {
                r0 = this;
                r0.v = r1
                r0.<init>()
                r1 = 7
                int[] r1 = new int[r1]
                r1 = {x0014: FILL_ARRAY_DATA , data: [1, 2, 4, 8, 16, 32, 64} // fill-array
                r0.r = r1
                int r1 = r1.length
                android.widget.CheckBox[] r1 = new android.widget.CheckBox[r1]
                r0.s = r1
                return
        }

        /* synthetic */ b(android.ext.q0 r1, android.ext.q0.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void a(android.view.View r2, android.widget.CheckBox r3) {
                r1 = this;
                boolean r0 = r2 instanceof android.ext.EditText
                if (r0 == 0) goto Lf
                android.ext.EditText r2 = (android.ext.EditText) r2
                android.ext.q0$b$a r0 = new android.ext.q0$b$a
                r0.<init>(r1, r3)
                r2.addTextChangedListener(r0)
                goto L1d
            Lf:
                boolean r0 = r2 instanceof android.ext.SystemSpinner
                if (r0 == 0) goto L1d
                android.ext.SystemSpinner r2 = (android.ext.SystemSpinner) r2
                android.ext.q0$b$b r0 = new android.ext.q0$b$b
                r0.<init>(r1, r3)
                r2.setOnItemSelectedListener(r0)
            L1d:
                return
        }

        private void b(android.ext.g2 r5, android.view.View r6) {
                r4 = this;
                if (r6 != 0) goto L3
                return
            L3:
                boolean r0 = r6 instanceof android.view.ViewGroup
                r1 = 0
                if (r0 == 0) goto L1e
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                int r0 = r6.getChildCount()
            Le:
                if (r1 >= r0) goto L1d
                android.view.View r2 = r6.getChildAt(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1a
                if (r2 != 0) goto L17
                goto L1a
            L17:
                r4.b(r5, r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1a
            L1a:
                int r1 = r1 + 1
                goto Le
            L1d:
                return
            L1e:
                int r0 = r6.getId()
                r2 = -1
                if (r0 != r2) goto L26
                return
            L26:
                boolean r2 = r6 instanceof android.ext.EditText
                if (r2 == 0) goto L62
                android.ext.EditText r6 = (android.ext.EditText) r6
                r1 = 2131034233(0x7f050079, float:1.7678978E38)
                java.lang.String r2 = ""
                if (r0 != r1) goto L36
                java.lang.String r1 = "100"
                goto L37
            L36:
                r1 = r2
            L37:
                r3 = 1
                if (r5 != 0) goto L4b
                android.content.SharedPreferences r5 = r4.t
                java.lang.String r0 = android.ext.b2.b(r0)
                java.lang.String r5 = r5.getString(r0, r1)
                r6.setText(r5)
                r6.setDataType(r3)
                goto La6
            L4b:
                android.text.Editable r6 = r6.getText()
                java.lang.String r6 = r6.toString()
                java.lang.String r6 = r6.trim()
                android.ext.y0.b(r6, r3)
                java.lang.String r0 = android.ext.b2.b(r0)
                r5.k(r0, r6, r2)
                goto La6
            L62:
                boolean r2 = r6 instanceof android.ext.SystemSpinner
                if (r2 == 0) goto L8b
                android.ext.SystemSpinner r6 = (android.ext.SystemSpinner) r6
                r2 = 2131034381(0x7f05010d, float:1.7679278E38)
                if (r0 != r2) goto L6f
                r1 = 536870912(0x20000000, float:1.0842022E-19)
            L6f:
                if (r5 != 0) goto L7f
                android.content.SharedPreferences r5 = r4.t
                java.lang.String r0 = android.ext.b2.b(r0)
                int r5 = r5.getInt(r0, r1)
                r6.setSelected(r5)
                goto La6
            L7f:
                java.lang.String r0 = android.ext.b2.b(r0)
                int r6 = r6.getSelected()
                r5.g(r0, r6, r1)
                goto La6
            L8b:
                boolean r2 = r6 instanceof android.widget.CheckBox
                if (r2 == 0) goto La6
                android.widget.CheckBox r6 = (android.widget.CheckBox) r6
                if (r5 != 0) goto L9d
                android.util.SparseBooleanArray r5 = android.ext.q0.f1186f
                boolean r5 = r5.get(r0, r1)
                r6.setChecked(r5)
                goto La6
            L9d:
                android.util.SparseBooleanArray r5 = android.ext.q0.f1186f
                boolean r6 = r6.isChecked()
                r5.put(r0, r6)
            La6:
                return
        }

        private void c() {
                r11 = this;
                android.view.View r0 = r11.f1187a
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 2131099679(0x7f06001f, float:1.7811718E38)
                r1 = 0
                android.view.View r0 = a.d.f(r0, r1)
                r11.f1187a = r0
                android.content.SharedPreferences r0 = android.ext.Tools.M0()
                r11.t = r0
                android.view.View r0 = r11.f1187a
                r2 = 2131034233(0x7f050079, float:1.7678978E38)
                android.view.View r0 = r0.findViewById(r2)
                android.ext.EditText r0 = (android.ext.EditText) r0
                r11.f1188b = r0
                android.view.View r0 = r11.f1187a
                r2 = 2131034136(0x7f050018, float:1.7678781E38)
                android.view.View r0 = r0.findViewById(r2)
                android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                r11.f1189c = r0
                android.view.View r0 = r11.f1187a
                r2 = 2131034230(0x7f050076, float:1.7678972E38)
                android.view.View r0 = r0.findViewById(r2)
                android.ext.EditText r0 = (android.ext.EditText) r0
                r11.f1190d = r0
                android.view.View r0 = r11.f1187a
                r2 = 2131034137(0x7f050019, float:1.7678783E38)
                android.view.View r0 = r0.findViewById(r2)
                android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                r11.f1191e = r0
                android.view.View r0 = r11.f1187a
                r2 = 2131034231(0x7f050077, float:1.7678974E38)
                android.view.View r0 = r0.findViewById(r2)
                android.ext.EditText r0 = (android.ext.EditText) r0
                r11.f1192f = r0
                android.view.View r0 = r11.f1187a
                r2 = 2131034141(0x7f05001d, float:1.7678791E38)
                android.view.View r0 = r0.findViewById(r2)
                android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                r11.f1193g = r0
                android.view.View r0 = r11.f1187a
                r2 = 2131034234(0x7f05007a, float:1.767898E38)
                android.view.View r0 = r0.findViewById(r2)
                android.ext.EditText r0 = (android.ext.EditText) r0
                r11.h = r0
                android.view.View r0 = r11.f1187a
                r2 = 2131034142(0x7f05001e, float:1.7678793E38)
                android.view.View r0 = r0.findViewById(r2)
                android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                r11.i = r0
                android.view.View r0 = r11.f1187a
                r2 = 2131034235(0x7f05007b, float:1.7678982E38)
                android.view.View r0 = r0.findViewById(r2)
                android.ext.EditText r0 = (android.ext.EditText) r0
                r11.j = r0
                android.view.View r0 = r11.f1187a
                r2 = 2131034140(0x7f05001c, float:1.767879E38)
                android.view.View r0 = r0.findViewById(r2)
                android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                r11.k = r0
                android.view.View r0 = r11.f1187a
                r2 = 2131034383(0x7f05010f, float:1.7679282E38)
                android.view.View r0 = r0.findViewById(r2)
                android.ext.SystemSpinner r0 = (android.ext.SystemSpinner) r0
                r11.l = r0
                android.view.View r0 = r11.f1187a
                r2 = 2131034138(0x7f05001a, float:1.7678785E38)
                android.view.View r0 = r0.findViewById(r2)
                android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                r11.m = r0
                android.view.View r0 = r11.f1187a
                r2 = 2131034381(0x7f05010d, float:1.7679278E38)
                android.view.View r0 = r0.findViewById(r2)
                android.ext.SystemSpinner r0 = (android.ext.SystemSpinner) r0
                r11.n = r0
                android.view.View r0 = r11.f1187a
                r2 = 2131034232(0x7f050078, float:1.7678976E38)
                android.view.View r0 = r0.findViewById(r2)
                android.ext.EditText r0 = (android.ext.EditText) r0
                r11.o = r0
                android.view.View r0 = r11.f1187a
                r2 = 2131034139(0x7f05001b, float:1.7678787E38)
                android.view.View r0 = r0.findViewById(r2)
                android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                r11.p = r0
                android.view.View r0 = r11.f1187a
                r2 = 2131034382(0x7f05010e, float:1.767928E38)
                android.view.View r0 = r0.findViewById(r2)
                android.ext.SystemSpinner r0 = (android.ext.SystemSpinner) r0
                r11.q = r0
                r0 = 7
                int[] r0 = new int[r0]
                r0 = {x02ba: FILL_ARRAY_DATA , data: [2131034446, 2131034449, 2131034451, 2131034447, 2131034439, 2131034452, 2131034440} // fill-array
                java.lang.CharSequence[] r2 = android.ext.n1.l()
                int[] r3 = android.ext.n1.g()
                r4 = 0
                r5 = 0
            Lf5:
                int[] r6 = r11.r
                int r6 = r6.length
                r7 = -1
                r8 = 1
                if (r5 >= r6) goto L128
                android.view.View r6 = r11.f1187a
                r9 = r0[r5]
                android.view.View r6 = r6.findViewById(r9)
                android.widget.CheckBox r6 = (android.widget.CheckBox) r6
                r9 = r3[r5]
                r6.setTextColor(r9)
                r9 = r2[r5]
                r6.setText(r9)
                int r9 = android.ext.AddressArrayAdapter.f23d
                int[] r10 = r11.r
                r10 = r10[r5]
                r9 = r9 & r10
                if (r9 == 0) goto L11a
                goto L11b
            L11a:
                r8 = 0
            L11b:
                r6.setChecked(r8)
                r6.setId(r7)
                android.widget.CheckBox[] r7 = r11.s
                r7[r5] = r6
                int r5 = r5 + 1
                goto Lf5
            L128:
                android.widget.CheckBox r0 = r11.f1189c
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 2131296264(0x7f090008, float:1.821044E38)
                java.lang.String r4 = android.ext.Tools.N1(r3)
                r2.append(r4)
                java.lang.String r4 = " ≥"
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r0.setText(r2)
                android.widget.CheckBox r0 = r11.f1191e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = android.ext.Tools.N1(r3)
                r2.append(r3)
                java.lang.String r3 = " ≤"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.setText(r2)
                android.widget.CheckBox r0 = r11.f1193g
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r5 = 2131296825(0x7f090239, float:1.8211578E38)
                java.lang.String r6 = android.ext.Tools.N1(r5)
                r2.append(r6)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r0.setText(r2)
                android.widget.CheckBox r0 = r11.i
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = android.ext.Tools.N1(r5)
                r2.append(r4)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.setText(r2)
                android.ext.SystemSpinner r0 = r11.l
                a.e r2 = android.ext.c.o(r7)
                r0.setData(r2)
                android.widget.CheckBox r0 = r11.m
                android.ext.Tools.r1(r0)
                android.widget.CheckBox r0 = r11.m
                r0.setOnLongClickListener(r11)
                android.ext.SystemSpinner r0 = r11.n
                a.e r2 = android.ext.c.C()
                r0.setData(r2)
                a.e r0 = new a.e
                r0.<init>()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "-: "
                r2.append(r3)
                r3 = 2131296805(0x7f090225, float:1.8211537E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = 2130837520(0x7f020010, float:1.7279996E38)
                int r3 = android.ext.Tools.d0(r3)
                java.lang.CharSequence r2 = android.ext.Tools.t(r2, r3)
                r3 = 4
                r0.put(r3, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "R: "
                r2.append(r3)
                r3 = 2131296883(0x7f090273, float:1.8211695E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = 2130837519(0x7f02000f, float:1.7279994E38)
                int r3 = android.ext.Tools.d0(r3)
                java.lang.CharSequence r2 = android.ext.Tools.t(r2, r3)
                r3 = 8
                r0.put(r3, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "W: "
                r2.append(r3)
                r3 = 2131297108(0x7f090354, float:1.8212152E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = 2130837521(0x7f020011, float:1.7279998E38)
                int r3 = android.ext.Tools.d0(r3)
                java.lang.CharSequence r2 = android.ext.Tools.t(r2, r3)
                r3 = 16
                r0.put(r3, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "X: "
                r2.append(r3)
                r3 = 2131296421(0x7f0900a5, float:1.8210758E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = 2130837517(0x7f02000d, float:1.727999E38)
                int r3 = android.ext.Tools.d0(r3)
                java.lang.CharSequence r2 = android.ext.Tools.t(r2, r3)
                r3 = 2
                r0.put(r3, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "WX: "
                r2.append(r3)
                r3 = 2131297109(0x7f090355, float:1.8212154E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = 2130837518(0x7f02000e, float:1.7279992E38)
                int r3 = android.ext.Tools.d0(r3)
                java.lang.CharSequence r2 = android.ext.Tools.t(r2, r3)
                r0.put(r8, r2)
                android.ext.SystemSpinner r2 = r11.q
                r2.setData(r0)
                android.view.View r0 = r11.f1187a
                r11.b(r1, r0)
                android.ext.EditText r0 = r11.f1190d
                android.widget.CheckBox r1 = r11.f1189c
                r11.a(r0, r1)
                android.ext.EditText r0 = r11.f1192f
                android.widget.CheckBox r1 = r11.f1191e
                r11.a(r0, r1)
                android.ext.EditText r0 = r11.h
                android.widget.CheckBox r1 = r11.f1193g
                r11.a(r0, r1)
                android.ext.EditText r0 = r11.j
                android.widget.CheckBox r1 = r11.i
                r11.a(r0, r1)
                android.ext.SystemSpinner r0 = r11.l
                android.widget.CheckBox r1 = r11.k
                r11.a(r0, r1)
                android.ext.SystemSpinner r0 = r11.n
                android.widget.CheckBox r1 = r11.m
                r11.a(r0, r1)
                android.ext.EditText r0 = r11.o
                android.widget.CheckBox r1 = r11.m
                r11.a(r0, r1)
                android.ext.SystemSpinner r0 = r11.q
                android.widget.CheckBox r1 = r11.p
                r11.a(r0, r1)
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.app.AlertDialog r1 = (android.app.AlertDialog) r1
                android.widget.Button r1 = r1.getButton(r2)
                r0.onClick(r1)
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r11) {
                r10 = this;
                r0 = 0
                if (r11 == 0) goto L1bd
                java.lang.Object r1 = r11.getTag()
                boolean r1 = r1 instanceof android.ext.p1
                if (r1 == 0) goto Ld
                goto L1bd
            Ld:
                java.lang.Object r11 = r11.getTag()
                boolean r11 = r11 instanceof java.lang.Boolean
                r1 = 0
                if (r11 == 0) goto L49
                android.widget.CheckBox r11 = r10.f1189c
                r11.setChecked(r1)
                android.widget.CheckBox r11 = r10.f1191e
                r11.setChecked(r1)
                android.widget.CheckBox r11 = r10.f1193g
                r11.setChecked(r1)
                android.widget.CheckBox r11 = r10.i
                r11.setChecked(r1)
                android.widget.CheckBox r11 = r10.k
                r11.setChecked(r1)
                android.widget.CheckBox r11 = r10.m
                r11.setChecked(r1)
                android.widget.CheckBox r11 = r10.p
                r11.setChecked(r1)
                r11 = 0
            L3a:
                int[] r2 = r10.r
                int r2 = r2.length
                if (r11 >= r2) goto L49
                android.widget.CheckBox[] r2 = r10.s
                r2 = r2[r11]
                r2.setChecked(r1)
                int r11 = r11 + 1
                goto L3a
            L49:
                android.ext.EditText r11 = r10.f1188b     // Catch: java.lang.NumberFormatException -> Le8
                android.text.Editable r11 = r11.getText()     // Catch: java.lang.NumberFormatException -> Le8
                java.lang.String r11 = r11.toString()     // Catch: java.lang.NumberFormatException -> Le8
                java.lang.String r11 = r11.trim()     // Catch: java.lang.NumberFormatException -> Le8
                int r11 = android.ext.b0.m(r11)     // Catch: java.lang.NumberFormatException -> Le8
                r2 = 2131296770(0x7f090202, float:1.8211466E38)
                r3 = 2
                r4 = 1
                if (r11 < r4) goto L173
                r5 = 100000(0x186a0, float:1.4013E-40)
                if (r11 > r5) goto L154
                android.widget.CheckBox r2 = r10.f1189c     // Catch: java.lang.NumberFormatException -> Le8
                boolean r2 = r2.isChecked()     // Catch: java.lang.NumberFormatException -> Le8
                if (r2 != 0) goto L71
                r3 = r0
                goto L7c
            L71:
                android.ext.EditText r2 = r10.f1190d     // Catch: java.lang.NumberFormatException -> Le8
                android.text.Editable r2 = r2.getText()     // Catch: java.lang.NumberFormatException -> Le8
                java.lang.String r2 = r2.toString()     // Catch: java.lang.NumberFormatException -> Le8
                r3 = r2
            L7c:
                android.widget.CheckBox r2 = r10.f1191e     // Catch: java.lang.NumberFormatException -> Le8
                boolean r2 = r2.isChecked()     // Catch: java.lang.NumberFormatException -> Le8
                if (r2 != 0) goto L86
                r4 = r0
                goto L91
            L86:
                android.ext.EditText r2 = r10.f1192f     // Catch: java.lang.NumberFormatException -> Le8
                android.text.Editable r2 = r2.getText()     // Catch: java.lang.NumberFormatException -> Le8
                java.lang.String r2 = r2.toString()     // Catch: java.lang.NumberFormatException -> Le8
                r4 = r2
            L91:
                android.widget.CheckBox r2 = r10.f1193g     // Catch: java.lang.NumberFormatException -> Le8
                boolean r2 = r2.isChecked()     // Catch: java.lang.NumberFormatException -> Le8
                if (r2 != 0) goto L9b
                r5 = r0
                goto La6
            L9b:
                android.ext.EditText r2 = r10.h     // Catch: java.lang.NumberFormatException -> Le8
                android.text.Editable r2 = r2.getText()     // Catch: java.lang.NumberFormatException -> Le8
                java.lang.String r2 = r2.toString()     // Catch: java.lang.NumberFormatException -> Le8
                r5 = r2
            La6:
                android.widget.CheckBox r2 = r10.i     // Catch: java.lang.NumberFormatException -> Le8
                boolean r2 = r2.isChecked()     // Catch: java.lang.NumberFormatException -> Le8
                if (r2 != 0) goto Lb0
                r6 = r0
                goto Lbb
            Lb0:
                android.ext.EditText r2 = r10.j     // Catch: java.lang.NumberFormatException -> Le8
                android.text.Editable r2 = r2.getText()     // Catch: java.lang.NumberFormatException -> Le8
                java.lang.String r2 = r2.toString()     // Catch: java.lang.NumberFormatException -> Le8
                r6 = r2
            Lbb:
                android.widget.CheckBox r2 = r10.k     // Catch: java.lang.NumberFormatException -> Le8
                boolean r2 = r2.isChecked()     // Catch: java.lang.NumberFormatException -> Le8
                if (r2 != 0) goto Lc5
                r7 = 0
                goto Lcc
            Lc5:
                android.ext.SystemSpinner r2 = r10.l     // Catch: java.lang.NumberFormatException -> Le8
                int r2 = r2.getSelected()     // Catch: java.lang.NumberFormatException -> Le8
                r7 = r2
            Lcc:
                android.widget.CheckBox r2 = r10.m     // Catch: java.lang.NumberFormatException -> Le8
                boolean r2 = r2.isChecked()     // Catch: java.lang.NumberFormatException -> Le8
                if (r2 != 0) goto Ld6
                r8 = r0
                goto L102
            Ld6:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Le8
                r2.<init>()     // Catch: java.lang.NumberFormatException -> Le8
                android.ext.SystemSpinner r8 = r10.n     // Catch: java.lang.NumberFormatException -> Le8
                int r8 = r8.getSelected()     // Catch: java.lang.NumberFormatException -> Le8
                r9 = 268435456(0x10000000, float:2.524355E-29)
                if (r8 != r9) goto Leb
                java.lang.String r8 = "!"
                goto Led
            Le8:
                r11 = move-exception
                goto L192
            Leb:
                java.lang.String r8 = ""
            Led:
                r2.append(r8)     // Catch: java.lang.NumberFormatException -> Le8
                android.ext.EditText r8 = r10.o     // Catch: java.lang.NumberFormatException -> Le8
                android.text.Editable r8 = r8.getText()     // Catch: java.lang.NumberFormatException -> Le8
                java.lang.String r8 = r8.toString()     // Catch: java.lang.NumberFormatException -> Le8
                r2.append(r8)     // Catch: java.lang.NumberFormatException -> Le8
                java.lang.String r2 = r2.toString()     // Catch: java.lang.NumberFormatException -> Le8
                r8 = r2
            L102:
                android.widget.CheckBox r2 = r10.p     // Catch: java.lang.NumberFormatException -> Le8
                boolean r2 = r2.isChecked()     // Catch: java.lang.NumberFormatException -> Le8
                if (r2 != 0) goto L10c
                r9 = 0
                goto L113
            L10c:
                android.ext.SystemSpinner r2 = r10.q     // Catch: java.lang.NumberFormatException -> Le8
                int r2 = r2.getSelected()     // Catch: java.lang.NumberFormatException -> Le8
                r9 = r2
            L113:
                android.ext.b0.o(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.NumberFormatException -> Le8
                android.ext.b0.p(r11)     // Catch: java.lang.NumberFormatException -> Le8
                r11 = 0
                r2 = 0
            L11b:
                int[] r3 = r10.r     // Catch: java.lang.NumberFormatException -> Le8
                int r3 = r3.length     // Catch: java.lang.NumberFormatException -> Le8
                if (r11 >= r3) goto L132
                android.widget.CheckBox[] r3 = r10.s     // Catch: java.lang.NumberFormatException -> Le8
                r3 = r3[r11]     // Catch: java.lang.NumberFormatException -> Le8
                boolean r3 = r3.isChecked()     // Catch: java.lang.NumberFormatException -> Le8
                if (r3 == 0) goto L12f
                int[] r3 = r10.r     // Catch: java.lang.NumberFormatException -> Le8
                r3 = r3[r11]     // Catch: java.lang.NumberFormatException -> Le8
                r2 = r2 | r3
            L12f:
                int r11 = r11 + 1
                goto L11b
            L132:
                android.ext.AddressArrayAdapter.b(r2)     // Catch: java.lang.NumberFormatException -> Le8
                android.ext.g2 r11 = new android.ext.g2     // Catch: java.lang.NumberFormatException -> Le8
                android.content.SharedPreferences r2 = r10.t     // Catch: java.lang.NumberFormatException -> Le8
                android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.NumberFormatException -> Le8
                r11.<init>(r2)     // Catch: java.lang.NumberFormatException -> Le8
                android.view.View r2 = r10.f1187a     // Catch: java.lang.NumberFormatException -> Le8
                r10.b(r11, r2)     // Catch: java.lang.NumberFormatException -> Le8
                r11.commit()     // Catch: java.lang.NumberFormatException -> Le8
                android.app.AlertDialog r11 = r10.u     // Catch: java.lang.NumberFormatException -> Le8
                android.ext.Tools.D(r11)     // Catch: java.lang.NumberFormatException -> Le8
                android.ext.MainService r11 = android.ext.MainService.instance     // Catch: java.lang.NumberFormatException -> Le8
                r11.D0(r1)     // Catch: java.lang.NumberFormatException -> Le8
                goto L201
            L154:
                java.lang.NumberFormatException r11 = new java.lang.NumberFormatException     // Catch: java.lang.NumberFormatException -> Le8
                r6 = 2131296826(0x7f09023a, float:1.821158E38)
                java.lang.String r6 = android.ext.b2.f(r6)     // Catch: java.lang.NumberFormatException -> Le8
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.NumberFormatException -> Le8
                java.lang.String r2 = android.ext.b2.f(r2)     // Catch: java.lang.NumberFormatException -> Le8
                r3[r1] = r2     // Catch: java.lang.NumberFormatException -> Le8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.NumberFormatException -> Le8
                r3[r4] = r1     // Catch: java.lang.NumberFormatException -> Le8
                java.lang.String r1 = android.ext.Tools.L1(r6, r3)     // Catch: java.lang.NumberFormatException -> Le8
                r11.<init>(r1)     // Catch: java.lang.NumberFormatException -> Le8
                throw r11     // Catch: java.lang.NumberFormatException -> Le8
            L173:
                java.lang.NumberFormatException r11 = new java.lang.NumberFormatException     // Catch: java.lang.NumberFormatException -> Le8
                r5 = 2131296827(0x7f09023b, float:1.8211582E38)
                java.lang.String r5 = android.ext.b2.f(r5)     // Catch: java.lang.NumberFormatException -> Le8
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.NumberFormatException -> Le8
                java.lang.String r2 = android.ext.b2.f(r2)     // Catch: java.lang.NumberFormatException -> Le8
                r3[r1] = r2     // Catch: java.lang.NumberFormatException -> Le8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> Le8
                r3[r4] = r1     // Catch: java.lang.NumberFormatException -> Le8
                java.lang.String r1 = android.ext.Tools.L1(r5, r3)     // Catch: java.lang.NumberFormatException -> Le8
                r11.<init>(r1)     // Catch: java.lang.NumberFormatException -> Le8
                throw r11     // Catch: java.lang.NumberFormatException -> Le8
            L192:
                java.lang.String r1 = "Error"
                android.ext.e1.s(r1, r11)
                android.app.AlertDialog$Builder r1 = android.ext.f.b()
                r2 = 2131296417(0x7f0900a1, float:1.821075E38)
                android.view.View r2 = android.ext.Tools.g0(r2)
                android.app.AlertDialog$Builder r1 = r1.setCustomTitle(r2)
                java.lang.String r11 = r11.getMessage()
                android.app.AlertDialog$Builder r11 = r1.setMessage(r11)
                r1 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                android.app.AlertDialog$Builder r11 = r11.setPositiveButton(r1, r0)
                android.ext.f.o(r11)
                goto L201
            L1bd:
                r10.c()
                android.app.AlertDialog$Builder r11 = android.ext.f.b()
                android.view.View r1 = r10.f1187a
                android.view.View r1 = android.ext.Tools.O0(r1)
                android.view.View r1 = android.ext.InternalKeyboard.d(r1)
                android.app.AlertDialog$Builder r11 = r11.setView(r1)
                r1 = 2131296285(0x7f09001d, float:1.8210482E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                android.app.AlertDialog$Builder r11 = r11.setPositiveButton(r1, r10)
                r1 = 2131296898(0x7f090282, float:1.8211726E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                android.app.AlertDialog$Builder r11 = r11.setNeutralButton(r1, r10)
                r1 = 2131296311(0x7f090037, float:1.8210535E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                android.app.AlertDialog$Builder r11 = r11.setNegativeButton(r1, r0)
                android.app.AlertDialog r11 = r11.create()
                r10.u = r11
                android.ext.f.l(r11, r10)
                android.ext.EditText r0 = r10.f1188b
                android.ext.f.n(r11, r0)
            L201:
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
                r1 = 2131034138(0x7f05001a, float:1.7678785E38)
                if (r3 == r1) goto Le
                return r0
            Le:
                android.app.AlertDialog$Builder r3 = android.ext.f.b()
                r0 = 2131296482(0x7f0900e2, float:1.8210882E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r3 = r3.setMessage(r0)
                r0 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                r1 = 0
                android.app.AlertDialog$Builder r3 = r3.setNegativeButton(r0, r1)
                android.ext.f.o(r3)
                r3 = 1
                return r3
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface r4) {
                r3 = this;
                r0 = 0
                android.ext.EditText r1 = r3.f1188b
                r2 = -1
                android.ext.Tools.t1(r4, r2, r0, r3, r1)
                r0 = -3
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                android.ext.Tools.s1(r4, r0, r1, r3)
                return
        }
    }

    static {
            android.util.SparseBooleanArray r0 = new android.util.SparseBooleanArray
            r0.<init>()
            android.ext.q0.f1186f = r0
            return
    }

    public q0(android.ext.MainService r2) {
            r1 = this;
            r2 = 2131296453(0x7f0900c5, float:1.8210823E38)
            r0 = 2130968612(0x7f040024, float:1.7545883E38)
            r1.<init>(r2, r0)
            return
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            android.ext.q0$b r0 = new android.ext.q0$b
            r1 = 0
            r0.<init>(r2, r1)
            r0.onClick(r3)
            return
    }
}
