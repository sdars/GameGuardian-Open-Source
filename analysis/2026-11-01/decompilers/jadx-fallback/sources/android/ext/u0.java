package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class u0 extends android.ext.p1 {

    static /* synthetic */ class a {
    }

    private static class b implements android.view.View.OnClickListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static java.lang.String f1268c = "";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.app.AlertDialog f1269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.ext.EditText f1270b;

        class a implements android.view.View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.RegionList f1271a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.u0.b f1272b;

            a(android.ext.u0.b r1, android.ext.RegionList r2) {
                    r0 = this;
                    r0.f1272b = r1
                    r0.f1271a = r2
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r2) {
                    r1 = this;
                    int r2 = r2.getId()
                    r0 = 2131034144(0x7f050020, float:1.7678797E38)
                    if (r2 == r0) goto L1c
                    r0 = 2131034363(0x7f0500fb, float:1.7679241E38)
                    if (r2 == r0) goto L19
                    r0 = 2131034456(0x7f050158, float:1.767943E38)
                    if (r2 == r0) goto L16
                    r2 = 8
                    goto L1e
                L16:
                    r2 = 16384(0x4000, float:2.2959E-41)
                    goto L1e
                L19:
                    r2 = 262144(0x40000, float:3.67342E-40)
                    goto L1e
                L1c:
                    r2 = 16
                L1e:
                    android.ext.RegionList r0 = r1.f1271a
                    r0.j(r0, r2)
                    return
            }
        }

        static {
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b(android.ext.u0.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r2, int r3) {
                r1 = this;
                r0 = -1
                if (r3 != r0) goto Lc
                android.app.AlertDialog r2 = (android.app.AlertDialog) r2
                android.widget.Button r2 = r2.getButton(r3)
                r1.onClick(r2)
            Lc:
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r8) {
                r7 = this;
                r0 = 1
                r1 = 2131296311(0x7f090037, float:1.8210535E38)
                r2 = 2131034116(0x7f050004, float:1.767874E38)
                r3 = 2131034286(0x7f0500ae, float:1.7679085E38)
                r4 = 0
                if (r8 == 0) goto L9e
                java.lang.Object r5 = r8.getTag()
                boolean r5 = r5 instanceof android.ext.p1
                if (r5 == 0) goto L17
                goto L9e
            L17:
                int r5 = r8.getId()
                if (r5 != r3) goto L2a
                android.app.AlertDialog r8 = r7.f1269a
                android.ext.Tools.D(r8)
                android.ext.MainService r8 = android.ext.MainService.instance
                android.ext.o1 r8 = r8.O
                r8.d()
                return
            L2a:
                int r8 = r8.getId()
                if (r8 != r2) goto L6b
                android.app.AlertDialog$Builder r8 = android.ext.f.b()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r2 = 2131296418(0x7f0900a2, float:1.8210752E38)
                java.lang.String r2 = android.ext.b2.f(r2)
                r0.append(r2)
                java.lang.String r2 = ":\nBAFE890\nBAFE890+3F0\nBAFE890-A40\nBAFE890+FE-CD7+44-3E\n\nlibc.so\nlibc.so+E0\nlibc.so-32C"
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                android.app.AlertDialog$Builder r8 = r8.setMessage(r0)
                r0 = 2131296519(0x7f090107, float:1.8210957E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.content.DialogInterface$OnClickListener r2 = android.ext.ConfigListAdapter.h()
                android.app.AlertDialog$Builder r8 = r8.setPositiveButton(r0, r2)
                java.lang.String r0 = android.ext.b2.f(r1)
                android.app.AlertDialog$Builder r8 = r8.setNegativeButton(r0, r4)
                android.ext.f.o(r8)
                return
            L6b:
                android.ext.EditText r8 = r7.f1270b     // Catch: java.lang.NumberFormatException -> L8f
                if (r8 == 0) goto L91
                android.text.Editable r8 = r8.getText()     // Catch: java.lang.NumberFormatException -> L8f
                java.lang.String r8 = r8.toString()     // Catch: java.lang.NumberFormatException -> L8f
                java.lang.String r8 = r8.trim()     // Catch: java.lang.NumberFormatException -> L8f
                java.lang.String r8 = android.ext.j2.h(r8)     // Catch: java.lang.NumberFormatException -> L8f
                android.ext.y0.b(r8, r0)     // Catch: java.lang.NumberFormatException -> L8f
                android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.NumberFormatException -> L8f
                r1 = 2131296497(0x7f0900f1, float:1.8210912E38)
                java.lang.String r1 = android.ext.Tools.N1(r1)     // Catch: java.lang.NumberFormatException -> L8f
                r0.L(r4, r8, r1)     // Catch: java.lang.NumberFormatException -> L8f
                goto L91
            L8f:
                r8 = move-exception
                goto L98
            L91:
                android.app.AlertDialog r8 = r7.f1269a     // Catch: java.lang.NumberFormatException -> L8f
                android.ext.Tools.D(r8)     // Catch: java.lang.NumberFormatException -> L8f
                goto L132
            L98:
                android.ext.EditText r0 = r7.f1270b
                android.ext.j2.i(r8, r0)
                return
            L9e:
                r8 = 2131099681(0x7f060021, float:1.7811722E38)
                android.view.View r8 = a.d.f(r8, r4)
                android.view.View r2 = r8.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                android.ext.Tools.r1(r2)
                r2.setOnClickListener(r7)
                r2 = 2131034316(0x7f0500cc, float:1.7679146E38)
                android.view.View r2 = r8.findViewById(r2)
                android.ext.EditText r2 = (android.ext.EditText) r2
                r7.f1270b = r2
                r5 = 2131034377(0x7f050109, float:1.767927E38)
                android.view.View r5 = r8.findViewById(r5)
                android.ext.RegionList r5 = (android.ext.RegionList) r5
                r5.setTag(r2)
                android.ext.u0$b$a r6 = new android.ext.u0$b$a
                r6.<init>(r7, r5)
                r5 = 2131034145(0x7f050021, float:1.76788E38)
                android.view.View r5 = r8.findViewById(r5)
                r5.setOnClickListener(r6)
                r5 = 2131034144(0x7f050020, float:1.7678797E38)
                android.view.View r5 = r8.findViewById(r5)
                r5.setOnClickListener(r6)
                r5 = 2131034363(0x7f0500fb, float:1.7679241E38)
                android.view.View r5 = r8.findViewById(r5)
                r5.setOnClickListener(r6)
                r5 = 2131034456(0x7f050158, float:1.767943E38)
                android.view.View r5 = r8.findViewById(r5)
                r5.setOnClickListener(r6)
                android.view.View r3 = r8.findViewById(r3)
                r3.setOnClickListener(r7)
                java.lang.String r3 = android.ext.u0.b.f1268c
                r2.setText(r3)
                r2.setDataType(r0)
                android.app.AlertDialog$Builder r0 = android.ext.f.b()
                android.view.View r8 = android.ext.InternalKeyboard.d(r8)
                android.app.AlertDialog$Builder r8 = r0.setView(r8)
                r0 = 2131296514(0x7f090102, float:1.8210947E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r8 = r8.setPositiveButton(r0, r7)
                java.lang.String r0 = android.ext.b2.f(r1)
                android.app.AlertDialog$Builder r8 = r8.setNegativeButton(r0, r4)
                android.app.AlertDialog r8 = r8.create()
                r7.f1269a = r8
                android.ext.f.k(r8, r7)
                android.ext.f.l(r8, r7)
                android.ext.f.n(r8, r2)
            L132:
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r1) {
                r0 = this;
                android.ext.EditText r1 = r0.f1270b
                if (r1 == 0) goto L12
                android.text.Editable r1 = r1.getText()
                java.lang.String r1 = r1.toString()
                java.lang.String r1 = r1.trim()
                android.ext.u0.b.f1268c = r1
            L12:
                return
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface r4) {
                r3 = this;
                r0 = 0
                android.ext.EditText r1 = r3.f1270b
                r2 = -1
                android.ext.Tools.t1(r4, r2, r0, r3, r1)
                return
        }
    }

    public u0() {
            r2 = this;
            r0 = 2131296514(0x7f090102, float:1.8210947E38)
            r1 = 2130968618(0x7f04002a, float:1.7545895E38)
            r2.<init>(r0, r1)
            return
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            android.ext.u0$b r0 = new android.ext.u0$b
            r1 = 0
            r0.<init>(r1)
            r0.onClick(r3)
            return
    }
}
