package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class b extends android.ext.p1 {

    private static class a implements android.view.View.OnClickListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnShowListener, android.text.TextWatcher, android.widget.CompoundButton.OnCheckedChangeListener {
        private static java.lang.String j = "0";
        private static boolean k = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private android.app.AlertDialog f577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private android.ext.EditText f578e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private android.widget.CheckBox f579f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private android.widget.CheckBox f580g;
        private android.fix.TextView h;
        private android.ext.SystemSpinnerType i;

        static {
                return
        }

        a(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                r0 = 3
                int[] r0 = new int[r0]
                r1.f575b = r0
                r0 = 4
                int[] r0 = new int[r0]
                r1.f576c = r0
                r1.f574a = r2
                return
        }

        private void a() {
                r17 = this;
                r0 = r17
                android.ext.EditText r1 = r0.f578e
                if (r1 != 0) goto L7
                return
            L7:
                android.ext.SystemSpinnerType r1 = r0.i
                int r1 = r1.getSelected()
                r2 = 127(0x7f, float:1.78E-43)
                r3 = 0
                r4 = 1
                long r5 = r0.b(r3)     // Catch: java.lang.Throwable -> L38
                r7 = 0
                if (r1 != r2) goto L3c
                int[] r9 = r0.f575b     // Catch: java.lang.Throwable -> L38
                r10 = 0
                r11 = 1
                r12 = 0
            L1e:
                int r13 = r9.length     // Catch: java.lang.Throwable -> L36
                if (r10 >= r13) goto L62
                r13 = r9[r10]     // Catch: java.lang.Throwable -> L36
                if (r13 == 0) goto L31
                int r14 = r4 << r10
                int r15 = r14 + (-1)
                long r3 = (long) r15
                long r3 = r3 & r5
                int r15 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r15 == 0) goto L31
                int r12 = r12 + r13
                r11 = r14
            L31:
                int r10 = r10 + 1
                r3 = 0
                r4 = 1
                goto L1e
            L36:
                goto L62
            L38:
                r11 = 1
                r12 = 0
                goto L62
            L3c:
                int[] r3 = r0.f576c     // Catch: java.lang.Throwable -> L38
                int r11 = android.ext.c.l(r1)     // Catch: java.lang.Throwable -> L38
                r4 = 0
                r12 = 0
            L44:
                int r9 = r3.length     // Catch: java.lang.Throwable -> L36
                if (r4 >= r9) goto L62
                r9 = r3[r4]     // Catch: java.lang.Throwable -> L36
                if (r9 == 0) goto L59
                long r13 = (long) r4
                long r13 = r13 + r5
                int r10 = r11 + (-1)
                r16 = r3
                long r2 = (long) r10
                long r2 = r2 & r13
                int r10 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r10 == 0) goto L5b
                int r12 = r12 + r9
                goto L5b
            L59:
                r16 = r3
            L5b:
                int r4 = r4 + 1
                r3 = r16
                r2 = 127(0x7f, float:1.78E-43)
                goto L44
            L62:
                android.fix.TextView r2 = r0.h
                r3 = 127(0x7f, float:1.78E-43)
                if (r1 != r3) goto L6c
                r1 = 2131296266(0x7f09000a, float:1.8210444E38)
                goto L6f
            L6c:
                r1 = 2131296267(0x7f09000b, float:1.8210446E38)
            L6f:
                java.lang.String r1 = android.ext.b2.f(r1)
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
                r5 = 0
                r3[r5] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
                r6 = 1
                r3[r6] = r4
                java.lang.String r1 = android.ext.Tools.L1(r1, r3)
                r2.setText(r1)
                android.fix.TextView r1 = r0.h
                if (r12 <= 0) goto L91
                r3 = 0
                goto L92
            L91:
                r3 = 4
            L92:
                r1.setVisibility(r3)
                return
        }

        private long b(boolean r6) {
                r5 = this;
                android.ext.EditText r0 = r5.f578e
                android.text.Editable r0 = r0.getText()
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r0.trim()
                java.lang.String r0 = android.ext.j2.h(r0)
                int r1 = r0.length()
                if (r1 != 0) goto L1a
                java.lang.String r0 = "0"
            L1a:
                java.lang.String r1 = r5.f574a
                r2 = 16
                if (r1 != 0) goto L2c
                android.widget.CheckBox r1 = r5.f580g
                boolean r1 = r1.isChecked()
                if (r1 == 0) goto L29
                goto L2c
            L29:
                r1 = 10
                goto L2e
            L2c:
                r1 = 16
            L2e:
                long r3 = android.ext.t1.r(r0, r1)
                java.lang.String r1 = r5.f574a
                if (r1 == 0) goto L3b
                long r1 = android.ext.t1.r(r1, r2)
                long r3 = r3 - r1
            L3b:
                if (r6 == 0) goto L41
                r6 = 1
                android.ext.y0.b(r0, r6)
            L41:
                return r3
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

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton r1, boolean r2) {
                r0 = this;
                r0.a()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r2, int r3) {
                r1 = this;
                r1.a()
                r0 = -1
                if (r3 != r0) goto Lf
                android.app.AlertDialog r2 = (android.app.AlertDialog) r2
                android.widget.Button r2 = r2.getButton(r3)
                r1.onClick(r2)
            Lf:
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r15) {
                r14 = this;
                java.lang.String r0 = "\n"
                android.ext.MainService r1 = android.ext.MainService.instance
                java.lang.Object r1 = r1.z()
                int r2 = android.ext.Tools.L0(r1)
                if (r2 != 0) goto L15
                r15 = 2131296822(0x7f090236, float:1.8211572E38)
                android.ext.Tools.H1(r15)
                return
            L15:
                boolean r2 = r1 instanceof d.e
                if (r2 != 0) goto L1a
                return
            L1a:
                r2 = 127(0x7f, float:1.78E-43)
                r3 = 0
                r4 = 1
                if (r15 == 0) goto L134
                java.lang.Object r15 = r15.getTag()
                boolean r15 = r15 instanceof android.ext.p1
                if (r15 == 0) goto L2a
                goto L134
            L2a:
                android.ext.EditText r15 = r14.f578e     // Catch: java.lang.NumberFormatException -> L5c
                if (r15 == 0) goto L127
                long r5 = r14.b(r4)     // Catch: java.lang.NumberFormatException -> L5c
                java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.NumberFormatException -> L5c
                r15.<init>()     // Catch: java.lang.NumberFormatException -> L5c
                d.e r1 = (d.e) r1     // Catch: java.lang.NumberFormatException -> L5c
                int r7 = r1.l()     // Catch: java.lang.NumberFormatException -> L5c
                r8 = 0
            L3e:
                if (r8 >= r7) goto L5f
                boolean r9 = r1.a(r8)     // Catch: java.lang.NumberFormatException -> L5c
                if (r9 != 0) goto L47
                goto L59
            L47:
                java.lang.Object r9 = r1.n(r8)     // Catch: java.lang.NumberFormatException -> L5c
                android.ext.h2 r9 = (android.ext.h2) r9     // Catch: java.lang.NumberFormatException -> L5c
                boolean r10 = r9 instanceof android.ext.h2     // Catch: java.lang.NumberFormatException -> L5c
                if (r10 != 0) goto L52
                goto L59
            L52:
                android.ext.h2 r9 = r9.Y()     // Catch: java.lang.NumberFormatException -> L5c
                r15.add(r9)     // Catch: java.lang.NumberFormatException -> L5c
            L59:
                int r8 = r8 + 1
                goto L3e
            L5c:
                r15 = move-exception
                goto L12e
            L5f:
                android.ext.MainService r1 = android.ext.MainService.instance     // Catch: java.lang.NumberFormatException -> L5c
                r1.j(r3)     // Catch: java.lang.NumberFormatException -> L5c
                android.widget.CheckBox r1 = r14.f579f     // Catch: java.lang.NumberFormatException -> L5c
                boolean r1 = r1.isChecked()     // Catch: java.lang.NumberFormatException -> L5c
                android.ext.MainService r7 = android.ext.MainService.instance     // Catch: java.lang.NumberFormatException -> L5c
                android.ext.SavedListAdapter r7 = r7.t0     // Catch: java.lang.NumberFormatException -> L5c
                if (r1 != 0) goto L73
                r7.l(r15)     // Catch: java.lang.NumberFormatException -> L5c
            L73:
                android.ext.SystemSpinnerType r8 = r14.i     // Catch: java.lang.NumberFormatException -> L5c
                int r8 = r8.getSelected()     // Catch: java.lang.NumberFormatException -> L5c
                java.util.Iterator r15 = r15.iterator()     // Catch: java.lang.NumberFormatException -> L5c
            L7d:
                boolean r9 = r15.hasNext()     // Catch: java.lang.NumberFormatException -> L5c
                if (r9 == 0) goto Lc1
                java.lang.Object r9 = r15.next()     // Catch: java.lang.NumberFormatException -> L5c
                android.ext.h2 r9 = (android.ext.h2) r9     // Catch: java.lang.NumberFormatException -> L5c
                android.ext.h2 r9 = r9.Y()     // Catch: java.lang.NumberFormatException -> L5c
                if (r1 == 0) goto La6
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L5c
                r10.<init>()     // Catch: java.lang.NumberFormatException -> L5c
                java.lang.String r11 = r9.b0()     // Catch: java.lang.NumberFormatException -> L5c
                r10.append(r11)     // Catch: java.lang.NumberFormatException -> L5c
                java.lang.String r11 = " #2"
                r10.append(r11)     // Catch: java.lang.NumberFormatException -> L5c
                java.lang.String r10 = r10.toString()     // Catch: java.lang.NumberFormatException -> L5c
                r9.l = r10     // Catch: java.lang.NumberFormatException -> L5c
            La6:
                if (r8 == r2) goto Laa
                r9.f674c = r8     // Catch: java.lang.NumberFormatException -> L5c
            Laa:
                long r10 = r9.f672a     // Catch: java.lang.NumberFormatException -> L5c
                long r10 = r10 + r5
                r9.f672a = r10     // Catch: java.lang.NumberFormatException -> L5c
                boolean r10 = r9.V()     // Catch: java.lang.NumberFormatException -> L5c
                if (r10 != 0) goto Lbd
                long r10 = r9.f672a     // Catch: java.lang.NumberFormatException -> L5c
                int r10 = android.ext.c.S(r10, r4)     // Catch: java.lang.NumberFormatException -> L5c
                r9.f674c = r10     // Catch: java.lang.NumberFormatException -> L5c
            Lbd:
                r7.b(r9, r4, r3)     // Catch: java.lang.NumberFormatException -> L5c
                goto L7d
            Lc1:
                r7.notifyDataSetChanged()     // Catch: java.lang.NumberFormatException -> L5c
                r7.i()     // Catch: java.lang.NumberFormatException -> L5c
                android.ext.MainService r15 = android.ext.MainService.instance     // Catch: java.lang.NumberFormatException -> L5c
                android.ext.c2 r15 = r15.f216f     // Catch: java.lang.NumberFormatException -> L5c
                if (r15 == 0) goto L127
                java.lang.String r2 = "\nlocal copy = "
                r15.write(r2)     // Catch: java.lang.NumberFormatException -> L5c
                if (r1 == 0) goto Ld7
                java.lang.String r1 = "true"
                goto Ld9
            Ld7:
                java.lang.String r1 = "false"
            Ld9:
                r15.write(r1)     // Catch: java.lang.NumberFormatException -> L5c
                r15.write(r0)     // Catch: java.lang.NumberFormatException -> L5c
                java.lang.String r1 = "local t = gg.getListItems()\n"
                r15.write(r1)     // Catch: java.lang.NumberFormatException -> L5c
                java.lang.String r1 = "if not copy then gg.removeListItems(t) end\n"
                r15.write(r1)     // Catch: java.lang.NumberFormatException -> L5c
                java.lang.String r1 = "for i, v in ipairs(t) do\n"
                r15.write(r1)     // Catch: java.lang.NumberFormatException -> L5c
                java.lang.String r1 = "\tv.address = v.address + "
                r15.write(r1)     // Catch: java.lang.NumberFormatException -> L5c
                java.lang.String r1 = r14.f574a     // Catch: java.lang.NumberFormatException -> L5c
                if (r1 != 0) goto L108
                android.widget.CheckBox r1 = r14.f580g     // Catch: java.lang.NumberFormatException -> L5c
                boolean r1 = r1.isChecked()     // Catch: java.lang.NumberFormatException -> L5c
                if (r1 == 0) goto L100
                goto L108
            L100:
                java.lang.String r1 = java.lang.Long.toString(r5)     // Catch: java.lang.NumberFormatException -> L5c
                r15.write(r1)     // Catch: java.lang.NumberFormatException -> L5c
                goto L10b
            L108:
                android.ext.Script.Consts.b(r15, r5)     // Catch: java.lang.NumberFormatException -> L5c
            L10b:
                r15.write(r0)     // Catch: java.lang.NumberFormatException -> L5c
                java.lang.String r0 = "\tif copy then v.name = v.name..' #2' end\n"
                r15.write(r0)     // Catch: java.lang.NumberFormatException -> L5c
                java.lang.String r0 = "end\n"
                r15.write(r0)     // Catch: java.lang.NumberFormatException -> L5c
                java.lang.String r0 = "gg.addListItems(t)\n"
                r15.write(r0)     // Catch: java.lang.NumberFormatException -> L5c
                java.lang.String r0 = "t = nil\n"
                r15.write(r0)     // Catch: java.lang.NumberFormatException -> L5c
                java.lang.String r0 = "copy = nil\n\n"
                r15.write(r0)     // Catch: java.lang.NumberFormatException -> L5c
            L127:
                android.app.AlertDialog r15 = r14.f577d     // Catch: java.lang.NumberFormatException -> L5c
                android.ext.Tools.D(r15)     // Catch: java.lang.NumberFormatException -> L5c
                goto L245
            L12e:
                android.ext.EditText r0 = r14.f578e
                android.ext.j2.i(r15, r0)
                return
            L134:
                r15 = 2131099671(0x7f060017, float:1.7811702E38)
                r0 = 0
                android.view.View r15 = a.d.f(r15, r0)
                r5 = 2131034316(0x7f0500cc, float:1.7679146E38)
                android.view.View r5 = r15.findViewById(r5)
                android.ext.EditText r5 = (android.ext.EditText) r5
                r14.f578e = r5
                r6 = 2131034314(0x7f0500ca, float:1.7679142E38)
                android.view.View r6 = r15.findViewById(r6)
                android.widget.CheckBox r6 = (android.widget.CheckBox) r6
                r14.f579f = r6
                r6 = 2131034280(0x7f0500a8, float:1.7679073E38)
                android.view.View r6 = r15.findViewById(r6)
                android.widget.CheckBox r6 = (android.widget.CheckBox) r6
                r14.f580g = r6
                boolean r7 = android.ext.b.a.k
                r6.setChecked(r7)
                r6.setOnCheckedChangeListener(r14)
                r7 = 2131034126(0x7f05000e, float:1.767876E38)
                android.view.View r7 = r15.findViewById(r7)
                android.fix.TextView r7 = (android.fix.TextView) r7
                r14.h = r7
                r7 = 2131034431(0x7f05013f, float:1.767938E38)
                android.view.View r7 = r15.findViewById(r7)
                android.ext.SystemSpinnerType r7 = (android.ext.SystemSpinnerType) r7
                r14.i = r7
                a.e r8 = android.ext.c.r(r2, r4)
                r7.setData(r8)
                r7.setSelected(r2)
                r7.setOnItemSelectedListener(r14)
                d.e r1 = (d.e) r1
                int r2 = r1.l()
                int[] r7 = r14.f575b
                java.util.Arrays.fill(r7, r3)
                int[] r8 = r14.f576c
                java.util.Arrays.fill(r8, r3)
                r9 = 0
            L199:
                if (r9 >= r2) goto L1cc
                boolean r10 = r1.a(r9)
                if (r10 != 0) goto L1a2
                goto L1c9
            L1a2:
                java.lang.Object r10 = r1.n(r9)
                android.ext.h2 r10 = (android.ext.h2) r10
                boolean r11 = r10 instanceof android.ext.h2
                if (r11 != 0) goto L1ad
                goto L1c9
            L1ad:
                int r11 = r10.k()
                if (r11 != r4) goto L1b5
                r12 = 0
                goto L1b9
            L1b5:
                r12 = 2
                if (r11 != r12) goto L1b9
                r12 = 1
            L1b9:
                r11 = r7[r12]
                int r11 = r11 + r4
                r7[r12] = r11
                long r10 = r10.f672a
                r12 = 3
                long r10 = r10 & r12
                int r11 = (int) r10
                r10 = r8[r11]
                int r10 = r10 + r4
                r8[r11] = r10
            L1c9:
                int r9 = r9 + 1
                goto L199
            L1cc:
                r5.setDataType(r4)
                r5.addTextChangedListener(r14)
                java.lang.String r1 = r14.f574a
                if (r1 == 0) goto L20c
                r1 = 2131034276(0x7f0500a4, float:1.7679065E38)
                android.view.View r1 = r15.findViewById(r1)
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
                r1.setOrientation(r4)
                r1 = 2131034337(0x7f0500e1, float:1.7679189E38)
                android.view.View r1 = r15.findViewById(r1)
                android.fix.TextView r1 = (android.fix.TextView) r1
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 2131296801(0x7f090221, float:1.8211529E38)
                java.lang.String r3 = android.ext.Tools.N1(r3)
                r2.append(r3)
                java.lang.String r3 = ":"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.setText(r2)
                r1 = 8
                r6.setVisibility(r1)
                goto L211
            L20c:
                java.lang.String r1 = android.ext.b.a.j
                r5.setText(r1)
            L211:
                r14.a()
                android.app.AlertDialog$Builder r1 = android.ext.f.b()
                android.view.View r15 = android.ext.InternalKeyboard.d(r15)
                android.app.AlertDialog$Builder r15 = r1.setView(r15)
                r1 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                android.app.AlertDialog$Builder r15 = r15.setPositiveButton(r1, r14)
                r1 = 2131296311(0x7f090037, float:1.8210535E38)
                java.lang.String r1 = android.ext.b2.f(r1)
                android.app.AlertDialog$Builder r15 = r15.setNegativeButton(r1, r0)
                android.app.AlertDialog r15 = r15.create()
                r14.f577d = r15
                android.ext.f.k(r15, r14)
                android.ext.f.l(r15, r14)
                android.ext.f.n(r15, r5)
            L245:
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r1) {
                r0 = this;
                java.lang.String r1 = r0.f574a
                if (r1 == 0) goto L5
                return
            L5:
                android.ext.EditText r1 = r0.f578e
                if (r1 == 0) goto L1f
                android.text.Editable r1 = r1.getText()
                java.lang.String r1 = r1.toString()
                java.lang.String r1 = r1.trim()
                android.ext.b.a.j = r1
                android.widget.CheckBox r1 = r0.f580g
                boolean r1 = r1.isChecked()
                android.ext.b.a.k = r1
            L1f:
                return
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface r4) {
                r3 = this;
                r0 = 0
                android.ext.EditText r1 = r3.f578e
                r2 = -1
                android.ext.Tools.t1(r4, r2, r0, r3, r1)
                return
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                r0.a()
                return
        }
    }

    public b() {
            r2 = this;
            r0 = 2131296314(0x7f09003a, float:1.8210541E38)
            r1 = 2130968601(0x7f040019, float:1.754586E38)
            r2.<init>(r0, r1)
            return
    }

    public static void h(java.lang.String r1) {
            android.ext.b$a r0 = new android.ext.b$a
            r0.<init>(r1)
            r1 = 0
            r0.onClick(r1)
            return
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            android.ext.b$a r0 = new android.ext.b$a
            r1 = 0
            r0.<init>(r1)
            r0.onClick(r3)
            return
    }
}
