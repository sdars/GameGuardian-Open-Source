package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class o0 extends android.ext.p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static boolean f1139f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static boolean f1140g = true;
    static boolean h = true;
    static boolean i = true;

    static /* synthetic */ class a {
    }

    private class b implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnShowListener, android.content.DialogInterface.OnDismissListener, android.view.View.OnClickListener, android.view.View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.app.AlertDialog f1141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.widget.EditText f1142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private android.widget.EditText f1143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private android.widget.CheckBox f1144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private android.widget.CheckBox f1145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private android.widget.CheckBox f1146f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private android.widget.Button f1147g;
        private android.view.View h;
        final /* synthetic */ android.ext.o0 i;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1148a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.o0.b f1149b;

            a(android.ext.o0.b r1, int r2) {
                    r0 = this;
                    r0.f1149b = r1
                    r0.f1148a = r2
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r2, int r3) {
                    r1 = this;
                    android.ext.MainService r2 = android.ext.MainService.instance
                    r2.P()
                    android.ext.o0$b r2 = r1.f1149b
                    r3 = 0
                    int r0 = r1.f1148a
                    r2.onClick(r3, r0)
                    return
            }
        }

        private b(android.ext.o0 r1) {
                r0 = this;
                r0.i = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(android.ext.o0 r1, android.ext.o0.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void a() {
                r3 = this;
                boolean r0 = android.ext.o0.f1139f
                android.widget.Button r1 = r3.f1147g
                if (r0 == 0) goto La
                r2 = 2131296738(0x7f0901e2, float:1.8211401E38)
                goto Ld
            La:
                r2 = 2131296786(0x7f090212, float:1.8211499E38)
            Ld:
                java.lang.String r2 = android.ext.b2.f(r2)
                r1.setText(r2)
                android.view.View r1 = r3.h
                if (r0 == 0) goto L1a
                r0 = 0
                goto L1c
            L1a:
                r0 = 8
            L1c:
                r1.setVisibility(r0)
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r5, int r6) {
                r4 = this;
                android.widget.CheckBox r5 = r4.f1144d
                boolean r5 = r5.isChecked()
                android.ext.o0.f1140g = r5
                android.widget.CheckBox r5 = r4.f1145e
                boolean r5 = r5.isChecked()
                android.ext.o0.h = r5
                android.widget.CheckBox r5 = r4.f1146f
                boolean r5 = r5.isChecked()
                android.ext.o0.i = r5
                android.widget.EditText r5 = r4.f1143c
                android.text.Editable r5 = r5.getText()
                java.lang.String r5 = r5.toString()
                java.lang.String r5 = r5.trim()
                boolean r0 = android.ext.o0.f1139f
                if (r0 == 0) goto L40
                boolean r0 = android.ext.Tools.f1(r5)
                if (r0 != 0) goto L31
                return
            L31:
                boolean r0 = android.ext.o0.f1140g
                boolean r1 = android.ext.o0.h
                if (r1 == 0) goto L39
                r0 = r0 | 2
            L39:
                boolean r1 = android.ext.o0.i
                if (r1 == 0) goto L41
                r0 = r0 | 4
                goto L41
            L40:
                r0 = 0
            L41:
                r1 = 4
                android.ext.y0.b(r5, r1)
                android.widget.EditText r2 = r4.f1142b
                if (r2 != 0) goto L4a
                return
            L4a:
                android.text.Editable r2 = r2.getText()
                java.lang.String r2 = r2.toString()
                java.lang.String r2 = r2.trim()
                boolean r3 = android.ext.Tools.f1(r2)
                if (r3 == 0) goto Lc3
                boolean r3 = android.ext.Tools.a1(r2)
                if (r3 != 0) goto L63
                goto Lc3
            L63:
                android.ext.y0.b(r2, r1)
                android.ext.MainService r1 = android.ext.MainService.instance
                android.ext.Script r1 = r1.f212b
                if (r1 == 0) goto La6
                android.app.AlertDialog$Builder r5 = android.ext.f.b()
                r0 = 2131296417(0x7f0900a1, float:1.821075E38)
                android.view.View r0 = android.ext.Tools.g0(r0)
                android.app.AlertDialog$Builder r5 = r5.setCustomTitle(r0)
                r0 = 2131296276(0x7f090014, float:1.8210464E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r5 = r5.setMessage(r0)
                r0 = 2131296711(0x7f0901c7, float:1.8211346E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.ext.o0$b$a r1 = new android.ext.o0$b$a
                r1.<init>(r4, r6)
                android.app.AlertDialog$Builder r5 = r5.setPositiveButton(r0, r1)
                r6 = 2131296805(0x7f090225, float:1.8211537E38)
                java.lang.String r6 = android.ext.b2.f(r6)
                r0 = 0
                android.app.AlertDialog$Builder r5 = r5.setNegativeButton(r6, r0)
                android.ext.f.o(r5)
                return
            La6:
                android.ext.MainService r6 = android.ext.MainService.instance
                r6.x(r2, r0, r5)
                android.app.AlertDialog r5 = r4.f1141a
                android.ext.Tools.D(r5)
                android.ext.MainService r5 = android.ext.MainService.instance
                android.ext.c2 r5 = r5.f216f
                if (r5 == 0) goto Lc3
                java.lang.String r6 = "loadfile("
                r5.write(r6)
                android.ext.Script.Consts.d(r5, r2)
                java.lang.String r6 = ")()\n"
                r5.write(r6)
            Lc3:
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r11) {
                r10 = this;
                r0 = 2131034278(0x7f0500a6, float:1.767907E38)
                r1 = 2131034248(0x7f050088, float:1.7679008E38)
                r2 = 2131034246(0x7f050086, float:1.7679004E38)
                r3 = 1
                r4 = 0
                r5 = 0
                if (r11 == 0) goto Lba
                java.lang.Object r6 = r11.getTag()
                boolean r6 = r6 instanceof android.ext.p1
                if (r6 == 0) goto L18
                goto Lba
            L18:
                int r11 = r11.getId()
                java.lang.String r6 = ""
                if (r11 == r2) goto Lae
                if (r11 == r1) goto La4
                if (r11 == r0) goto L2a
                r11 = -1
                r10.onClick(r5, r11)
                goto L1e0
            L2a:
                java.io.File r11 = new java.io.File
                java.lang.String r0 = android.ext.Tools.K0()
                java.lang.String r1 = "help.zip"
                r11.<init>(r0, r1)
                java.lang.String r0 = "he"
                android.ext.Tools.M(r0, r11)     // Catch: java.lang.RuntimeException -> L3c
                r0 = r5
                goto L50
            L3c:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                java.lang.String r0 = r0.getMessage()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
            L50:
                android.app.AlertDialog$Builder r1 = android.ext.f.b()
                r2 = 2131296532(0x7f090114, float:1.8210983E38)
                android.view.View r2 = android.ext.Tools.g0(r2)
                android.app.AlertDialog$Builder r1 = r1.setCustomTitle(r2)
                if (r0 != 0) goto L75
                r0 = 2131296533(0x7f090115, float:1.8210985E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                java.lang.Object[] r2 = new java.lang.Object[r3]
                java.lang.String r11 = r11.getAbsolutePath()
                r2[r4] = r11
                java.lang.String r11 = android.ext.Tools.L1(r0, r2)
                goto L90
            L75:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r2 = 2131296534(0x7f090116, float:1.8210987E38)
                java.lang.String r2 = android.ext.Tools.N1(r2)
                r11.append(r2)
                java.lang.String r2 = ": "
                r11.append(r2)
                r11.append(r0)
                java.lang.String r11 = r11.toString()
            L90:
                android.app.AlertDialog$Builder r11 = r1.setMessage(r11)
                r0 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r11 = r11.setNegativeButton(r0, r5)
                android.ext.f.o(r11)
                goto L1e0
            La4:
                boolean r11 = android.ext.o0.f1139f
                r11 = r11 ^ r3
                android.ext.o0.f1139f = r11
                r10.a()
                goto L1e0
            Lae:
                android.ext.Script r11 = new android.ext.Script
                java.lang.String r0 = "print('gg =', gg)"
                r11.<init>(r0, r4, r6)
                r11.R3()
                goto L1e0
            Lba:
                android.ext.MainService r11 = android.ext.MainService.instance
                android.ext.f0 r11 = r11.i
                boolean r11 = r11.d0()
                if (r11 != 0) goto Lc5
                return
            Lc5:
                r11 = 2131099651(0x7f060003, float:1.7811661E38)
                android.view.View r11 = a.d.f(r11, r5)
                r6 = 2131034328(0x7f0500d8, float:1.767917E38)
                android.view.View r6 = r11.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r7 = 2131296423(0x7f0900a7, float:1.8210762E38)
                java.lang.String r7 = android.ext.b2.f(r7)
                r6.setText(r7)
                r6 = 2131034251(0x7f05008b, float:1.7679014E38)
                android.view.View r6 = r11.findViewById(r6)
                android.ext.EditTextPath r6 = (android.ext.EditTextPath) r6
                r10.f1142b = r6
                java.lang.String r7 = "-script"
                java.lang.String r8 = ".lua"
                java.lang.String r9 = "script-path"
                java.lang.String r7 = android.ext.v1.a(r9, r7, r8)
                r6.setText(r7)
                r7 = 4
                r6.setDataType(r7)
                r6.setPathType(r3)
                r3 = 2131034252(0x7f05008c, float:1.7679016E38)
                android.view.View r3 = r11.findViewById(r3)
                r3.setTag(r6)
                android.view.View r2 = r11.findViewById(r2)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                android.widget.ImageView r2 = android.ext.Config.m(r2)
                r2.setOnClickListener(r10)
                r2 = 2131034229(0x7f050075, float:1.767897E38)
                android.view.View r2 = r11.findViewById(r2)
                android.ext.r$n r3 = new android.ext.r$n
                java.lang.String r8 = "kwws=22jdphjxdugldq1qhw2iruxp2ilohv2fdwhjru|290oxd0vfulswv2"
                r3.<init>(r8)
                r2.setOnClickListener(r3)
                r2 = 2131034277(0x7f0500a5, float:1.7679067E38)
                android.view.View r2 = r11.findViewById(r2)
                android.ext.r$n r3 = new android.ext.r$n
                java.lang.String r8 = "kwws=22jdphjxdugldq1qhw2khos2"
                r3.<init>(r8)
                r2.setOnClickListener(r3)
                android.view.View r0 = r11.findViewById(r0)
                r0.setOnClickListener(r10)
                r0 = 2131034223(0x7f05006f, float:1.7678957E38)
                android.view.View r0 = r11.findViewById(r0)
                r10.h = r0
                r0 = 2131034353(0x7f0500f1, float:1.7679221E38)
                android.view.View r0 = r11.findViewById(r0)
                android.ext.EditTextPath r0 = (android.ext.EditTextPath) r0
                r10.f1143c = r0
                java.lang.String r2 = "script-debug"
                java.lang.String r2 = android.ext.v1.b(r5, r2)
                r0.setText(r2)
                r0.setDataType(r7)
                r0.setPathType(r4)
                r2 = 2131034354(0x7f0500f2, float:1.7679223E38)
                android.view.View r2 = r11.findViewById(r2)
                r2.setTag(r0)
                r0 = 2131034226(0x7f050072, float:1.7678964E38)
                android.view.View r0 = r11.findViewById(r0)
                android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                r10.f1144d = r0
                boolean r2 = android.ext.o0.f1140g
                r0.setChecked(r2)
                android.ext.Tools.r1(r0)
                r0.setOnLongClickListener(r10)
                r0 = 2131034308(0x7f0500c4, float:1.767913E38)
                android.view.View r0 = r11.findViewById(r0)
                android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                r10.f1145e = r0
                boolean r2 = android.ext.o0.h
                r0.setChecked(r2)
                r0 = 2131034311(0x7f0500c7, float:1.7679136E38)
                android.view.View r0 = r11.findViewById(r0)
                android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                r10.f1146f = r0
                boolean r2 = android.ext.o0.i
                r0.setChecked(r2)
                android.view.View r0 = r11.findViewById(r1)
                android.widget.Button r0 = (android.widget.Button) r0
                r10.f1147g = r0
                r0.setOnClickListener(r10)
                r10.a()
                android.app.AlertDialog$Builder r0 = android.ext.f.b()
                android.view.View r11 = android.ext.InternalKeyboard.e(r11, r4)
                android.app.AlertDialog$Builder r11 = r0.setView(r11)
                r0 = 2131296422(0x7f0900a6, float:1.821076E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r11 = r11.setPositiveButton(r0, r10)
                r0 = 2131296311(0x7f090037, float:1.8210535E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r11 = r11.setNegativeButton(r0, r5)
                android.app.AlertDialog r11 = r11.create()
                android.ext.f.l(r11, r10)
                android.ext.f.k(r11, r10)
                r10.f1141a = r11
                android.ext.f.n(r11, r6)
            L1e0:
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r4) {
                r3 = this;
                android.widget.EditText r4 = r3.f1142b
                if (r4 == 0) goto L15
                android.text.Editable r4 = r4.getText()
                java.lang.String r4 = r4.toString()
                java.lang.String r0 = "-script"
                java.lang.String r1 = ".lua"
                java.lang.String r2 = "script-path"
                android.ext.v1.c(r4, r2, r0, r1)
            L15:
                android.widget.EditText r4 = r3.f1143c
                if (r4 == 0) goto L2a
                android.text.Editable r4 = r4.getText()
                java.lang.String r4 = r4.toString()
                java.lang.String r4 = r4.trim()
                java.lang.String r0 = "script-debug"
                android.ext.v1.b(r4, r0)
            L2a:
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
                r1 = 2131034226(0x7f050072, float:1.7678964E38)
                if (r3 == r1) goto Le
                return r0
            Le:
                r3 = 2131296638(0x7f09017e, float:1.8211198E38)
                android.ext.ConfigListAdapter.t(r3)
                r3 = 1
                return r3
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

    public o0() {
            r2 = this;
            r0 = 2131296423(0x7f0900a7, float:1.8210762E38)
            r1 = 2130968638(0x7f04003e, float:1.7545935E38)
            r2.<init>(r0, r1)
            return
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            android.ext.o0$b r0 = new android.ext.o0$b
            r1 = 0
            r0.<init>(r2, r1)
            r0.onClick(r3)
            return
    }
}
