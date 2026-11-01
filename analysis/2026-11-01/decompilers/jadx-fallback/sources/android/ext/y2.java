package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class y2 extends android.ext.p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static volatile boolean f1360f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static volatile long f1361g = 0;
    static volatile boolean h = false;
    static volatile long i = 1;
    static volatile boolean j = false;
    static volatile double k = 0.0d;
    static volatile boolean l = false;
    static volatile double m = 0.01d;
    static volatile android.ext.y2 n;

    static /* synthetic */ class a {
    }

    private class b implements android.view.View.OnClickListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.widget.CheckBox f1362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        android.ext.EditText f1363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        android.widget.CheckBox f1364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        android.ext.EditText f1365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        android.widget.CheckBox f1366e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        android.ext.EditText f1367f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        android.widget.CheckBox f1368g;
        android.ext.EditText h;
        android.app.AlertDialog i;
        final /* synthetic */ android.ext.y2 j;

        class a implements android.text.TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.widget.CheckBox f1369a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.widget.CheckBox f1370b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ android.ext.y2.b f1371c;

            a(android.ext.y2.b r1, android.widget.CheckBox r2, android.widget.CheckBox r3) {
                    r0 = this;
                    r0.f1371c = r1
                    r0.f1369a = r2
                    r0.f1370b = r3
                    r0.<init>()
                    return
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable r2) {
                    r1 = this;
                    android.widget.CheckBox r2 = r1.f1369a
                    r0 = 1
                    r2.setChecked(r0)
                    android.widget.CheckBox r2 = r1.f1370b
                    if (r2 == 0) goto Ld
                    r2.setChecked(r0)
                Ld:
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

        /* JADX INFO: renamed from: android.ext.y2$b$b, reason: collision with other inner class name */
        class C0023b implements android.widget.CompoundButton.OnCheckedChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.widget.CheckBox f1372a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.y2.b f1373b;

            C0023b(android.ext.y2.b r1, android.widget.CheckBox r2) {
                    r0 = this;
                    r0.f1373b = r1
                    r0.f1372a = r2
                    r0.<init>()
                    return
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(android.widget.CompoundButton r1, boolean r2) {
                    r0 = this;
                    if (r2 != 0) goto L8
                    android.widget.CheckBox r1 = r0.f1372a
                    r2 = 0
                    r1.setChecked(r2)
                L8:
                    return
            }
        }

        class c implements android.widget.CompoundButton.OnCheckedChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.widget.CheckBox f1374a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.y2.b f1375b;

            c(android.ext.y2.b r1, android.widget.CheckBox r2) {
                    r0 = this;
                    r0.f1375b = r1
                    r0.f1374a = r2
                    r0.<init>()
                    return
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(android.widget.CompoundButton r1, boolean r2) {
                    r0 = this;
                    if (r2 == 0) goto L8
                    android.widget.CheckBox r1 = r0.f1374a
                    r2 = 1
                    r1.setChecked(r2)
                L8:
                    return
            }
        }

        private b(android.ext.y2 r1) {
                r0 = this;
                r0.j = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(android.ext.y2 r1, android.ext.y2.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void a(android.widget.CheckBox r1, android.widget.CheckBox r2, boolean r3, android.ext.EditText r4, java.lang.String r5) {
                r0 = this;
                r2.setChecked(r3)
                java.lang.CharSequence r3 = r2.getText()
                java.lang.String r3 = r3.toString()
                java.lang.String r3 = android.ext.b2.g(r3)
                r2.setText(r3)
                r3 = 1
                r4.setDataType(r3)
                r4.setText(r5)
                r4.setTag(r2)
                android.ext.y2$b$a r3 = new android.ext.y2$b$a
                r3.<init>(r0, r2, r1)
                r4.addTextChangedListener(r3)
                if (r1 == 0) goto L36
                android.ext.y2$b$b r3 = new android.ext.y2$b$b
                r3.<init>(r0, r2)
                r1.setOnCheckedChangeListener(r3)
                android.ext.y2$b$c r3 = new android.ext.y2$b$c
                r3.<init>(r0, r1)
                r2.setOnCheckedChangeListener(r3)
            L36:
                return
        }

        private long b(android.ext.EditText r3, boolean r4) {
                r2 = this;
                android.text.Editable r3 = r3.getText()
                java.lang.String r3 = r3.toString()
                java.lang.String r3 = r3.trim()
                java.lang.String r3 = android.ext.j2.h(r3)
                if (r4 == 0) goto L19
                android.ext.t1$b r4 = android.ext.t1.x(r3)
            L16:
                long r0 = r4.f1261a
                goto L1e
            L19:
                android.ext.t1$b r4 = android.ext.t1.u(r3)
                goto L16
            L1e:
                r4 = 1
                android.ext.y0.b(r3, r4)
                return r0
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r24, int r25) {
                r23 = this;
                r1 = r23
                android.widget.CheckBox r0 = r1.f1362a     // Catch: java.lang.NumberFormatException -> L2e
                boolean r0 = r0.isChecked()     // Catch: java.lang.NumberFormatException -> L2e
                r2 = 0
                r4 = 0
                if (r0 == 0) goto L31
                android.ext.EditText r5 = r1.f1363b     // Catch: java.lang.NumberFormatException -> L2e
                r6 = 1
                long r7 = r1.b(r5, r6)     // Catch: java.lang.NumberFormatException -> L2e
                android.ext.y2.f1361g = r7     // Catch: java.lang.NumberFormatException -> L2e
                android.widget.CheckBox r5 = r1.f1364c     // Catch: java.lang.NumberFormatException -> L2e
                boolean r5 = r5.isChecked()     // Catch: java.lang.NumberFormatException -> L2e
                r9 = 2
                if (r5 == 0) goto L27
                android.ext.EditText r2 = r1.f1365d     // Catch: java.lang.NumberFormatException -> L2e
                long r2 = r1.b(r2, r6)     // Catch: java.lang.NumberFormatException -> L2e
                android.ext.y2.i = r2     // Catch: java.lang.NumberFormatException -> L2e
            L27:
                r21 = r7
                r7 = r5
                r5 = r2
                r2 = r21
                goto L34
            L2e:
                r0 = move-exception
                goto Lc4
            L31:
                r5 = r2
                r7 = 0
                r9 = 0
            L34:
                android.ext.y2.f1360f = r0     // Catch: java.lang.NumberFormatException -> L2e
                android.ext.y2.h = r7     // Catch: java.lang.NumberFormatException -> L2e
                android.widget.CheckBox r7 = r1.f1366e     // Catch: java.lang.NumberFormatException -> L2e
                boolean r7 = r7.isChecked()     // Catch: java.lang.NumberFormatException -> L2e
                r10 = 0
                if (r7 == 0) goto L6a
                r8 = r9 | 4
                android.ext.EditText r9 = r1.f1367f     // Catch: java.lang.NumberFormatException -> L2e
                long r12 = r1.b(r9, r4)     // Catch: java.lang.NumberFormatException -> L2e
                double r12 = java.lang.Double.longBitsToDouble(r12)     // Catch: java.lang.NumberFormatException -> L2e
                android.ext.y2.k = r12     // Catch: java.lang.NumberFormatException -> L2e
                android.widget.CheckBox r9 = r1.f1368g     // Catch: java.lang.NumberFormatException -> L2e
                boolean r9 = r9.isChecked()     // Catch: java.lang.NumberFormatException -> L2e
                if (r9 == 0) goto L64
                android.ext.EditText r10 = r1.h     // Catch: java.lang.NumberFormatException -> L2e
                long r10 = r1.b(r10, r4)     // Catch: java.lang.NumberFormatException -> L2e
                double r10 = java.lang.Double.longBitsToDouble(r10)     // Catch: java.lang.NumberFormatException -> L2e
                android.ext.y2.m = r10     // Catch: java.lang.NumberFormatException -> L2e
            L64:
                r4 = r9
                r19 = r10
                r10 = r8
                r8 = r12
                goto L6f
            L6a:
                r19 = r10
                r10 = r9
                r8 = r19
            L6f:
                android.ext.y2.j = r7     // Catch: java.lang.NumberFormatException -> L2e
                android.ext.y2.l = r4     // Catch: java.lang.NumberFormatException -> L2e
                r11 = r2
                r13 = r5
                r15 = r8
                r17 = r19
                android.ext.y2.h(r10, r11, r13, r15, r17)     // Catch: java.lang.NumberFormatException -> L2e
                android.ext.Tools.D(r24)     // Catch: java.lang.NumberFormatException -> L2e
                android.ext.MainService r4 = android.ext.MainService.instance     // Catch: java.lang.NumberFormatException -> L2e
                android.ext.c2 r4 = r4.f216f     // Catch: java.lang.NumberFormatException -> L2e
                if (r4 == 0) goto Lc3
                java.lang.String r10 = "gg.unrandomizer("
                r4.write(r10)     // Catch: java.lang.NumberFormatException -> L2e
                java.lang.String r10 = ", "
                if (r0 == 0) goto La2
                java.lang.String r0 = java.lang.Long.toString(r2)     // Catch: java.lang.NumberFormatException -> L2e
                r4.write(r0)     // Catch: java.lang.NumberFormatException -> L2e
                r4.write(r10)     // Catch: java.lang.NumberFormatException -> L2e
                java.lang.String r0 = java.lang.Long.toString(r5)     // Catch: java.lang.NumberFormatException -> L2e
                r4.write(r0)     // Catch: java.lang.NumberFormatException -> L2e
                r4.write(r10)     // Catch: java.lang.NumberFormatException -> L2e
                goto La7
            La2:
                java.lang.String r0 = "nil, nil, "
                r4.write(r0)     // Catch: java.lang.NumberFormatException -> L2e
            La7:
                if (r7 == 0) goto Lbb
                java.lang.String r0 = java.lang.Double.toString(r8)     // Catch: java.lang.NumberFormatException -> L2e
                r4.write(r0)     // Catch: java.lang.NumberFormatException -> L2e
                r4.write(r10)     // Catch: java.lang.NumberFormatException -> L2e
                java.lang.String r0 = java.lang.Double.toString(r19)     // Catch: java.lang.NumberFormatException -> L2e
            Lb7:
                r4.write(r0)     // Catch: java.lang.NumberFormatException -> L2e
                goto Lbe
            Lbb:
                java.lang.String r0 = "nil, nil"
                goto Lb7
            Lbe:
                java.lang.String r0 = ")\n"
                r4.write(r0)     // Catch: java.lang.NumberFormatException -> L2e
            Lc3:
                return
            Lc4:
                r2 = 0
                android.ext.j2.i(r0, r2)
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r15) {
                r14 = this;
                r0 = 2131034328(0x7f0500d8, float:1.767917E38)
                if (r15 == 0) goto L24
                java.lang.Object r1 = r15.getTag()
                boolean r1 = r1 instanceof android.ext.p1
                if (r1 == 0) goto Le
                goto L24
            Le:
                int r15 = r15.getId()
                if (r15 == r0) goto L1c
                android.app.AlertDialog r15 = r14.i
                r0 = -1
                r14.onClick(r15, r0)
                goto L10a
            L1c:
                r15 = 2131296664(0x7f090198, float:1.8211251E38)
                android.ext.ConfigListAdapter.t(r15)
                goto L10a
            L24:
                r15 = 2131099694(0x7f06002e, float:1.7811748E38)
                r1 = 0
                android.view.View r15 = a.d.f(r15, r1)
                android.view.View r0 = r15.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                android.ext.Tools.r1(r0)
                r0.setOnClickListener(r14)
                r0 = 2131034373(0x7f050105, float:1.7679262E38)
                android.view.View r0 = r15.findViewById(r0)
                android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                r14.f1362a = r0
                r0 = 2131034370(0x7f050102, float:1.7679256E38)
                android.view.View r0 = r15.findViewById(r0)
                android.ext.EditText r0 = (android.ext.EditText) r0
                r14.f1363b = r0
                r0 = 2131034372(0x7f050104, float:1.767926E38)
                android.view.View r0 = r15.findViewById(r0)
                android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                r14.f1364c = r0
                r0 = 2131034371(0x7f050103, float:1.7679258E38)
                android.view.View r0 = r15.findViewById(r0)
                android.ext.EditText r0 = (android.ext.EditText) r0
                r14.f1365d = r0
                r3 = 0
                android.widget.CheckBox r4 = r14.f1362a
                boolean r5 = android.ext.y2.f1360f
                android.ext.EditText r6 = r14.f1363b
                long r7 = android.ext.y2.f1361g
                r0 = 32
                java.lang.String r7 = android.ext.i0.c(r7, r0)
                r2 = r14
                r2.a(r3, r4, r5, r6, r7)
                android.widget.CheckBox r9 = r14.f1362a
                android.widget.CheckBox r10 = r14.f1364c
                boolean r11 = android.ext.y2.h
                android.ext.EditText r12 = r14.f1365d
                long r2 = android.ext.y2.i
                java.lang.String r13 = android.ext.i0.c(r2, r0)
                r8 = r14
                r8.a(r9, r10, r11, r12, r13)
                r0 = 2131034369(0x7f050101, float:1.7679254E38)
                android.view.View r0 = r15.findViewById(r0)
                android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                r14.f1366e = r0
                r0 = 2131034366(0x7f0500fe, float:1.7679248E38)
                android.view.View r0 = r15.findViewById(r0)
                android.ext.EditText r0 = (android.ext.EditText) r0
                r14.f1367f = r0
                r0 = 2131034368(0x7f050100, float:1.7679252E38)
                android.view.View r0 = r15.findViewById(r0)
                android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                r14.f1368g = r0
                r0 = 2131034367(0x7f0500ff, float:1.767925E38)
                android.view.View r0 = r15.findViewById(r0)
                android.ext.EditText r0 = (android.ext.EditText) r0
                r14.h = r0
                r3 = 0
                android.widget.CheckBox r4 = r14.f1366e
                boolean r5 = android.ext.y2.j
                android.ext.EditText r6 = r14.f1367f
                double r7 = android.ext.y2.k
                java.lang.String r7 = java.lang.Double.toString(r7)
                r2 = r14
                r2.a(r3, r4, r5, r6, r7)
                android.widget.CheckBox r9 = r14.f1366e
                android.widget.CheckBox r10 = r14.f1368g
                boolean r11 = android.ext.y2.l
                android.ext.EditText r12 = r14.h
                double r2 = android.ext.y2.m
                java.lang.String r13 = java.lang.Double.toString(r2)
                r8 = r14
                r8.a(r9, r10, r11, r12, r13)
                android.app.AlertDialog$Builder r0 = android.ext.f.b()
                android.view.View r15 = android.ext.InternalKeyboard.d(r15)
                android.app.AlertDialog$Builder r15 = r0.setView(r15)
                r0 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r15 = r15.setPositiveButton(r0, r14)
                r0 = 2131296311(0x7f090037, float:1.8210535E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r15 = r15.setNegativeButton(r0, r1)
                android.app.AlertDialog r15 = r15.create()
                r14.i = r15
                android.ext.f.l(r15, r14)
                android.app.AlertDialog r15 = r14.i
                android.ext.EditText r0 = r14.f1363b
                android.ext.f.n(r15, r0)
            L10a:
                return
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface r3) {
                r2 = this;
                r0 = -1
                r1 = 0
                android.ext.Tools.s1(r3, r0, r1, r2)
                return
        }
    }

    static {
            return
    }

    public y2() {
            r2 = this;
            r0 = 2131297065(0x7f090329, float:1.8212064E38)
            r1 = 2130968604(0x7f04001c, float:1.7545866E38)
            r2.<init>(r0, r1)
            android.ext.y2.n = r2
            return
    }

    public static void h(int r11, long r12, long r14, double r16, double r18) {
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.f0 r1 = r0.i
            r2 = r11
            r3 = r12
            r5 = r14
            r7 = r16
            r9 = r18
            r1.V0(r2, r3, r5, r7, r9)
            return
    }

    public static void i() {
            r0 = 0
            android.ext.y2.f1360f = r0
            android.ext.y2.h = r0
            android.ext.y2.j = r0
            android.ext.y2.l = r0
            return
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            android.ext.y2$b r0 = new android.ext.y2$b
            r1 = 0
            r0.<init>(r2, r1)
            r0.onClick(r3)
            return
    }
}
