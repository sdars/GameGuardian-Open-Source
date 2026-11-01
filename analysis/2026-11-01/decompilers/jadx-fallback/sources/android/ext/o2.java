package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class o2 extends android.ext.p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static volatile java.lang.String f1158f = "0";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static volatile android.ext.o2 f1159g;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f1160a;

        a(long r1) {
                r0 = this;
                r0.f1160a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.ext.MainService r0 = android.ext.MainService.instance
                android.ext.f0 r0 = r0.i
                long r1 = r3.f1160a
                r0.e(r1)
                return
        }
    }

    private class b implements android.view.View.OnClickListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnShowListener, android.content.DialogInterface.OnDismissListener, android.text.TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.ext.EditText f1161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        android.widget.TextView f1162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        android.widget.TextView f1163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        android.app.AlertDialog f1164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ android.ext.o2 f1165e;

        class a implements android.ext.Config.p.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.Config.p f1166a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.o2.b f1167b;

            a(android.ext.o2.b r1, android.ext.Config.p r2) {
                    r0 = this;
                    r0.f1167b = r1
                    r0.f1166a = r2
                    r0.<init>()
                    return
            }

            @Override // android.ext.Config.p.b
            public void a(int r2) {
                    r1 = this;
                    android.ext.Config$p r2 = r1.f1166a
                    r0 = 0
                    r2.g(r0)
                    android.ext.o2$b r2 = r1.f1167b
                    android.widget.TextView r2 = r2.f1163c
                    android.ext.Config$p r0 = r1.f1166a
                    java.lang.String r0 = r0.toString()
                    r2.setText(r0)
                    return
            }
        }

        private b(android.ext.o2 r1) {
                r0 = this;
                r0.f1165e = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(android.ext.o2 r1, android.ext.o2.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public void a() {
                r6 = this;
                android.ext.EditText r0 = r6.f1161a
                android.widget.TextView r1 = r6.f1162b
                if (r0 != 0) goto L9
                java.lang.String r0 = "?"
                goto L24
            L9:
                android.text.Editable r0 = r0.getText()     // Catch: java.lang.NumberFormatException -> L22
                java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> L22
                java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L22
                long r2 = android.ext.o2.i(r0)     // Catch: java.lang.NumberFormatException -> L22
                r4 = 1000000000(0x3b9aca00, double:4.94065646E-315)
                long r2 = r2 / r4
                java.lang.String r0 = android.ext.Tools.g1(r2)     // Catch: java.lang.NumberFormatException -> L22
                goto L24
            L22:
                java.lang.String r0 = "???"
            L24:
                if (r1 == 0) goto L29
                r1.setText(r0)
            L29:
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

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r3, int r4) {
                r2 = this;
                android.ext.EditText r4 = r2.f1161a     // Catch: java.lang.NumberFormatException -> L21
                android.text.Editable r4 = r4.getText()     // Catch: java.lang.NumberFormatException -> L21
                java.lang.String r4 = r4.toString()     // Catch: java.lang.NumberFormatException -> L21
                java.lang.String r4 = r4.trim()     // Catch: java.lang.NumberFormatException -> L21
                java.lang.String r4 = android.ext.j2.h(r4)     // Catch: java.lang.NumberFormatException -> L21
                long r0 = android.ext.o2.i(r4)     // Catch: java.lang.NumberFormatException -> L21
                android.ext.o2.h(r0)     // Catch: java.lang.NumberFormatException -> L21
                r0 = 1
                android.ext.y0.b(r4, r0)     // Catch: java.lang.NumberFormatException -> L21
                android.ext.Tools.D(r3)     // Catch: java.lang.NumberFormatException -> L21
                return
            L21:
                r3 = move-exception
                android.ext.EditText r4 = r2.f1161a
                android.ext.j2.i(r3, r4)
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r6) {
                r5 = this;
                r0 = 2131034246(0x7f050086, float:1.7679004E38)
                r1 = 2131034205(0x7f05005d, float:1.767892E38)
                if (r6 == 0) goto L3e
                java.lang.Object r2 = r6.getTag()
                boolean r2 = r2 instanceof android.ext.p1
                if (r2 == 0) goto L11
                goto L3e
            L11:
                int r6 = r6.getId()
                if (r6 == r1) goto L2d
                if (r6 == r0) goto L21
                android.app.AlertDialog r6 = r5.f1164d
                r0 = -1
                r5.onClick(r6, r0)
                goto Le8
            L21:
                r6 = 2131296420(0x7f0900a4, float:1.8210756E38)
                java.lang.String r6 = android.ext.b2.f(r6)
                android.ext.Searcher.I(r6)
                goto Le8
            L2d:
                android.ext.Config$p r6 = android.ext.Config.b(r1)
                android.ext.o2$b$a r0 = new android.ext.o2$b$a
                r0.<init>(r5, r6)
                r6.g(r0)
                r6.b()
                goto Le8
            L3e:
                r6 = 2131099689(0x7f060029, float:1.7811738E38)
                r2 = 0
                android.view.View r6 = a.d.f(r6, r2)
                android.view.View r0 = r6.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                android.widget.ImageView r0 = android.ext.Config.m(r0)
                r0.setOnClickListener(r5)
                r0 = 2131034285(0x7f0500ad, float:1.7679083E38)
                android.view.View r0 = r6.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r5.f1162b = r0
                android.view.View r0 = r6.findViewById(r1)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r5.f1163c = r0
                r0.setOnClickListener(r5)
                android.widget.TextView r0 = r5.f1163c
                android.ext.Config$p r1 = android.ext.Config.b(r1)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                r0 = 2131034426(0x7f05013a, float:1.767937E38)
                android.view.View r0 = r6.findViewById(r0)
                android.ext.EditText r0 = (android.ext.EditText) r0
                r5.f1161a = r0
                java.lang.String r0 = android.ext.o2.f1158f
                int r1 = r0.length()
                if (r1 == 0) goto L91
                java.lang.String r1 = "0"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L9e
            L91:
                int r0 = android.ext.Config.v
                double r0 = (double) r0
                r3 = 4652007308841189376(0x408f400000000000, double:1000.0)
                double r0 = r0 / r3
                java.lang.String r0 = android.ext.Tools.F(r0)
            L9e:
                android.ext.EditText r1 = r5.f1161a
                r1.setText(r0)
                android.ext.EditText r0 = r5.f1161a
                r0.addTextChangedListener(r5)
                android.ext.EditText r0 = r5.f1161a
                r1 = 1
                r0.setDataType(r1)
                r5.a()
                android.app.AlertDialog$Builder r0 = android.ext.f.b()
                android.view.View r6 = android.ext.InternalKeyboard.d(r6)
                android.app.AlertDialog$Builder r6 = r0.setView(r6)
                r0 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r6 = r6.setPositiveButton(r0, r5)
                r0 = 2131296295(0x7f090027, float:1.8210503E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r6 = r6.setNegativeButton(r0, r2)
                android.app.AlertDialog r6 = r6.create()
                r5.f1164d = r6
                android.ext.f.l(r6, r5)
                android.app.AlertDialog r6 = r5.f1164d
                android.ext.f.k(r6, r5)
                android.app.AlertDialog r6 = r5.f1164d
                android.ext.EditText r0 = r5.f1161a
                android.ext.f.n(r6, r0)
            Le8:
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r3) {
                r2 = this;
                android.ext.EditText r3 = r2.f1161a
                android.text.Editable r3 = r3.getText()
                java.lang.String r3 = r3.toString()
                java.lang.String r3 = r3.trim()
                android.ext.o2.f1158f = r3
                java.lang.String r3 = android.ext.o2.f1158f     // Catch: java.lang.NumberFormatException -> L1d
                java.lang.String r3 = android.ext.j2.h(r3)     // Catch: java.lang.NumberFormatException -> L1d
                long r0 = android.ext.o2.i(r3)     // Catch: java.lang.NumberFormatException -> L1d
                android.ext.o2.j(r0)     // Catch: java.lang.NumberFormatException -> L1d
            L1d:
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

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                r0.a()
                return
        }
    }

    static {
            return
    }

    public o2() {
            r2 = this;
            r0 = 2131297011(0x7f0902f3, float:1.8211955E38)
            r1 = 2130968609(0x7f040021, float:1.7545876E38)
            r2.<init>(r0, r1)
            android.ext.o2.f1159g = r2
            return
    }

    public static void h(long r3) {
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.j r0 = r0.h
            android.ext.o2$a r1 = new android.ext.o2$a
            r1.<init>(r3)
            r2 = 0
            boolean r0 = r0.a(r2, r1)
            if (r0 == 0) goto L17
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.f0 r0 = r0.i
            r0.e(r3)
        L17:
            j(r3)
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.c2 r0 = r0.f216f
            if (r0 == 0) goto L38
            double r3 = (double) r3
            r1 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r3 = r3 / r1
            java.lang.String r3 = android.ext.Tools.F(r3)
            java.lang.String r4 = "gg.timeJump("
            r0.write(r4)
            android.ext.Script.Consts.c(r0, r3)
            java.lang.String r3 = ")\n"
            r0.write(r3)
        L38:
            return
    }

    public static long i(java.lang.String r10) {
            java.lang.String r10 = r10.trim()
            double r0 = android.ext.Tools.j1(r10)
            r2 = -92233720(0xfffffffffa80a008, double:NaN)
            double r4 = (double) r2
            r6 = 1
            r7 = 0
            r8 = 2
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 < 0) goto L45
            r2 = 92233720(0x57f5ff8, double:4.55695124E-316)
            double r4 = (double) r2
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 > 0) goto L24
            r2 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r0 = r0 * r2
            long r0 = (long) r0
            return r0
        L24:
            android.ext.t1$a r0 = new android.ext.t1$a
            r1 = 2131296826(0x7f09023a, float:1.821158E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            r4[r7] = r10
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            r4[r6] = r5
            java.lang.String r1 = android.ext.Tools.L1(r1, r4)
            r0.<init>(r1)
            r0.c(r10)
            r0.a(r2)
            throw r0
        L45:
            android.ext.t1$a r0 = new android.ext.t1$a
            r1 = 2131296827(0x7f09023b, float:1.8211582E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            r4[r7] = r10
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            r4[r6] = r5
            java.lang.String r1 = android.ext.Tools.L1(r1, r4)
            r0.<init>(r1)
            r0.c(r10)
            r0.a(r2)
            throw r0
    }

    static void j(long r3) {
            r0 = 2131034204(0x7f05005c, float:1.7678919E38)
            android.ext.Config$p r0 = android.ext.Config.b(r0)
            double r3 = (double) r3
            r1 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r3 = r3 / r1
            r1 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 * r1
            int r3 = (int) r3
            r0.f42d = r3
            android.ext.Config.k()
            android.ext.MainService r3 = android.ext.MainService.instance
            android.ext.TimeJumpPanel r3 = r3.k
            if (r3 == 0) goto L24
            r3.r()
        L24:
            return
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            android.ext.o2$b r0 = new android.ext.o2$b
            r1 = 0
            r0.<init>(r2, r1)
            r0.onClick(r3)
            return
    }
}
