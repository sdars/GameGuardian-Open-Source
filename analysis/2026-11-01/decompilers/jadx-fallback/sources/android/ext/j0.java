package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class j0 extends android.ext.p1 {

    static /* synthetic */ class a {
    }

    private static class b implements android.view.View.OnClickListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnShowListener, android.content.DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.widget.EditText f1028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.app.AlertDialog f1029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private android.ext.EditText f1030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private android.ext.EditText f1031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private android.widget.CheckBox f1032e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f1033f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f1034g;

        class a extends android.ext.InternalKeyboard.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.EditTextPath f1035a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.j0.b f1036b;

            a(android.ext.j0.b r1, android.ext.EditTextPath r2) {
                    r0 = this;
                    r0.f1036b = r1
                    r0.f1035a = r2
                    r0.<init>()
                    return
            }

            @Override // android.ext.InternalKeyboard.e
            protected boolean a(android.view.View r1, boolean r2) {
                    r0 = this;
                    android.ext.EditTextPath r2 = r0.f1035a
                    if (r1 != r2) goto L6
                    r1 = 1
                    goto L7
                L6:
                    r1 = 0
                L7:
                    return r1
            }
        }

        private b() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f1033f = r0
                r0 = -1
                r2.f1034g = r0
                return
        }

        /* synthetic */ b(android.ext.j0.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private java.lang.String a() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = android.ext.Tools.K0()
                r0.append(r1)
                java.lang.String r1 = "/dump"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        private long b(int r5) {
                r4 = this;
                android.ext.EditText r0 = r4.f1030c
                android.ext.EditText r1 = r4.f1031d
                java.lang.String r2 = "-1"
                java.lang.String r3 = "0"
                long r0 = android.ext.MemoryRange.b(r5, r0, r3, r1, r2)
                if (r5 != 0) goto L11
                r4.f1033f = r0
                goto L13
            L11:
                r4.f1034g = r0
            L13:
                return r0
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r12, int r13) {
                r11 = this;
                java.lang.String r12 = "; "
                java.lang.String r13 = ", "
                android.widget.EditText r0 = r11.f1028a
                if (r0 != 0) goto L9
                return
            L9:
                r1 = 0
                r11.b(r1)     // Catch: java.lang.NumberFormatException -> L79
                r1 = 1
                r11.b(r1)     // Catch: java.lang.NumberFormatException -> L79
                android.text.Editable r1 = r0.getText()     // Catch: java.lang.NumberFormatException -> L79
                java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L79
                java.lang.String r1 = r1.trim()     // Catch: java.lang.NumberFormatException -> L79
                java.lang.String r1 = android.ext.Tools.Q1(r1)     // Catch: java.lang.NumberFormatException -> L79
                boolean r2 = android.ext.Tools.f1(r1)     // Catch: java.lang.NumberFormatException -> L79
                if (r2 != 0) goto L28
                return
            L28:
                r2 = 4
                android.ext.y0.b(r1, r2)     // Catch: java.lang.NumberFormatException -> L79
                android.widget.CheckBox r2 = r11.f1032e     // Catch: java.lang.NumberFormatException -> L79
                boolean r10 = r2.isChecked()     // Catch: java.lang.NumberFormatException -> L79
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L79
                r2.<init>()     // Catch: java.lang.NumberFormatException -> L79
                java.lang.String r3 = "Dump: "
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> L79
                r2.append(r1)     // Catch: java.lang.NumberFormatException -> L79
                r2.append(r12)     // Catch: java.lang.NumberFormatException -> L79
                long r3 = r11.f1033f     // Catch: java.lang.NumberFormatException -> L79
                java.lang.String r3 = java.lang.Long.toHexString(r3)     // Catch: java.lang.NumberFormatException -> L79
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> L79
                r3 = 45
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> L79
                long r3 = r11.f1034g     // Catch: java.lang.NumberFormatException -> L79
                java.lang.String r3 = java.lang.Long.toHexString(r3)     // Catch: java.lang.NumberFormatException -> L79
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> L79
                r2.append(r12)     // Catch: java.lang.NumberFormatException -> L79
                java.lang.String r12 = java.lang.Integer.toHexString(r10)     // Catch: java.lang.NumberFormatException -> L79
                r2.append(r12)     // Catch: java.lang.NumberFormatException -> L79
                java.lang.String r12 = r2.toString()     // Catch: java.lang.NumberFormatException -> L79
                android.ext.e1.d(r12)     // Catch: java.lang.NumberFormatException -> L79
                android.app.AlertDialog r12 = r11.f1029b     // Catch: java.lang.NumberFormatException -> L79
                android.ext.Tools.D(r12)     // Catch: java.lang.NumberFormatException -> L79
                android.ext.MainService r12 = android.ext.MainService.instance     // Catch: java.lang.NumberFormatException -> L79
                android.ext.z1$d r12 = r12.v0     // Catch: java.lang.NumberFormatException -> L79
                if (r12 != 0) goto L7b
                java.lang.String r12 = "unknown"
            L77:
                r9 = r12
                goto L7e
            L79:
                r12 = move-exception
                goto Lc1
            L7b:
                java.lang.String r12 = r12.f1434c     // Catch: java.lang.NumberFormatException -> L79
                goto L77
            L7e:
                android.ext.MainService r12 = android.ext.MainService.instance     // Catch: java.lang.NumberFormatException -> L79
                boolean r12 = r12.a1()     // Catch: java.lang.NumberFormatException -> L79
                if (r12 == 0) goto Lc0
                android.ext.MainService r12 = android.ext.MainService.instance     // Catch: java.lang.NumberFormatException -> L79
                android.ext.f0 r2 = r12.i     // Catch: java.lang.NumberFormatException -> L79
                long r3 = r11.f1033f     // Catch: java.lang.NumberFormatException -> L79
                long r5 = r11.f1034g     // Catch: java.lang.NumberFormatException -> L79
                r7 = r10
                r8 = r1
                r2.x(r3, r5, r7, r8, r9)     // Catch: java.lang.NumberFormatException -> L79
                android.ext.MainService r12 = android.ext.MainService.instance     // Catch: java.lang.NumberFormatException -> L79
                android.ext.c2 r12 = r12.f216f     // Catch: java.lang.NumberFormatException -> L79
                if (r12 == 0) goto Lc0
                java.lang.String r2 = "gg.dumpMemory("
                r12.write(r2)     // Catch: java.lang.NumberFormatException -> L79
                long r2 = r11.f1033f     // Catch: java.lang.NumberFormatException -> L79
                android.ext.Script.Consts.b(r12, r2)     // Catch: java.lang.NumberFormatException -> L79
                r12.write(r13)     // Catch: java.lang.NumberFormatException -> L79
                long r2 = r11.f1034g     // Catch: java.lang.NumberFormatException -> L79
                android.ext.Script.Consts.b(r12, r2)     // Catch: java.lang.NumberFormatException -> L79
                r12.write(r13)     // Catch: java.lang.NumberFormatException -> L79
                android.ext.Script.Consts.d(r12, r1)     // Catch: java.lang.NumberFormatException -> L79
                r12.write(r13)     // Catch: java.lang.NumberFormatException -> L79
                android.ext.Script$Consts r13 = r12.f697c     // Catch: java.lang.NumberFormatException -> L79
                android.ext.Script$Const[] r13 = r13.i     // Catch: java.lang.NumberFormatException -> L79
                android.ext.Script.Consts.a(r12, r13, r10)     // Catch: java.lang.NumberFormatException -> L79
                java.lang.String r13 = ")\n"
                r12.write(r13)     // Catch: java.lang.NumberFormatException -> L79
            Lc0:
                return
            Lc1:
                android.ext.j2.i(r12, r0)
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r9) {
                r8 = this;
                r0 = 0
                if (r9 == 0) goto L12
                java.lang.Object r9 = r9.getTag()
                boolean r9 = r9 instanceof android.ext.p1
                if (r9 == 0) goto Lc
                goto L12
            Lc:
                r9 = -1
                r8.onClick(r0, r9)
                goto Lf7
            L12:
                r9 = 2131099650(0x7f060002, float:1.781166E38)
                android.view.View r9 = a.d.f(r9, r0)
                r1 = 2131034353(0x7f0500f1, float:1.7679221E38)
                android.view.View r1 = r9.findViewById(r1)
                android.ext.EditTextPath r1 = (android.ext.EditTextPath) r1
                r8.f1028a = r1
                android.content.SharedPreferences r2 = android.ext.Tools.M0()
                java.lang.String r3 = "dump-path"
                java.lang.String r4 = r8.a()
                java.lang.String r2 = r2.getString(r3, r4)
                r1.setText(r2)
                r2 = 4
                r1.setDataType(r2)
                r3 = 0
                r1.setPathType(r3)
                r3 = 2131034354(0x7f0500f2, float:1.7679223E38)
                android.view.View r3 = r9.findViewById(r3)
                r3.setTag(r1)
                r3 = 2131034434(0x7f050142, float:1.7679385E38)
                android.view.View r3 = r9.findViewById(r3)
                android.widget.Button r3 = (android.widget.Button) r3
                android.ext.v2.a(r3, r1)
                r3 = 2131034320(0x7f0500d0, float:1.7679154E38)
                android.view.View r3 = r9.findViewById(r3)
                android.ext.EditText r3 = (android.ext.EditText) r3
                r8.f1030c = r3
                r4 = 2131034377(0x7f050109, float:1.767927E38)
                android.view.View r4 = r9.findViewById(r4)
                r4.setTag(r3)
                r4 = 2131034324(0x7f0500d4, float:1.7679162E38)
                android.view.View r4 = r9.findViewById(r4)
                android.ext.EditText r4 = (android.ext.EditText) r4
                r8.f1031d = r4
                r5 = 2131034378(0x7f05010a, float:1.7679272E38)
                android.view.View r5 = r9.findViewById(r5)
                r5.setTag(r4)
                long r5 = r8.f1033f
                java.lang.String r5 = android.ext.c.G(r5, r2)
                r3.setText(r5)
                r5 = 1
                r3.setDataType(r5)
                android.ext.InternalKeyboard.o(r3, r5)
                long r6 = r8.f1034g
                java.lang.String r2 = android.ext.c.G(r6, r2)
                r4.setText(r2)
                r4.setDataType(r5)
                r2 = 2131034406(0x7f050126, float:1.7679329E38)
                android.view.View r2 = r9.findViewById(r2)
                android.widget.CheckBox r2 = (android.widget.CheckBox) r2
                r8.f1032e = r2
                android.ext.j0$b$a r2 = new android.ext.j0$b$a
                r2.<init>(r8, r1)
                r3 = 2
                java.util.ArrayList r3 = r9.getFocusables(r3)
                java.util.Iterator r3 = r3.iterator()
            Lb2:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto Lc6
                java.lang.Object r4 = r3.next()
                android.view.View r4 = (android.view.View) r4
                boolean r5 = r4 instanceof android.ext.EditText
                if (r5 == 0) goto Lb2
                android.ext.Tools.z1(r4, r2)
                goto Lb2
            Lc6:
                android.app.AlertDialog$Builder r2 = android.ext.f.b()
                android.view.View r9 = android.ext.InternalKeyboard.d(r9)
                android.app.AlertDialog$Builder r9 = r2.setView(r9)
                r2 = 2131296917(0x7f090295, float:1.8211764E38)
                java.lang.String r2 = android.ext.b2.f(r2)
                android.app.AlertDialog$Builder r9 = r9.setPositiveButton(r2, r8)
                r2 = 2131296311(0x7f090037, float:1.8210535E38)
                java.lang.String r2 = android.ext.b2.f(r2)
                android.app.AlertDialog$Builder r9 = r9.setNegativeButton(r2, r0)
                android.app.AlertDialog r9 = r9.create()
                r8.f1029b = r9
                android.ext.f.l(r9, r8)
                android.ext.f.k(r9, r8)
                android.ext.f.n(r9, r1)
            Lf7:
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r4) {
                r3 = this;
                android.widget.EditText r4 = r3.f1028a
                if (r4 != 0) goto L5
                return
            L5:
                android.ext.g2 r0 = new android.ext.g2
                r0.<init>()
                android.text.Editable r4 = r4.getText()
                java.lang.String r4 = r4.toString()
                java.lang.String r4 = r4.trim()
                java.lang.String r1 = r3.a()
                java.lang.String r2 = "dump-path"
                android.ext.g2 r4 = r0.k(r2, r4, r1)
                r4.commit()
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

    public j0() {
            r2 = this;
            r0 = 2131296392(0x7f090088, float:1.82107E38)
            r1 = 2130968613(0x7f040025, float:1.7545885E38)
            r2.<init>(r0, r1)
            return
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            android.ext.j0$b r0 = new android.ext.j0$b
            r1 = 0
            r0.<init>(r1)
            r0.onClick(r3)
            return
    }
}
