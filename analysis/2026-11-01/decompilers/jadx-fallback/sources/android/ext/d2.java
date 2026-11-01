package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class d2 extends android.ext.p1 {

    static /* synthetic */ class a {
    }

    private class b implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnShowListener, android.content.DialogInterface.OnDismissListener, android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.app.AlertDialog f720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.widget.EditText f721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.d2 f722c;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f723a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.d2.b f724b;

            a(android.ext.d2.b r1, int r2) {
                    r0 = this;
                    r0.f724b = r1
                    r0.f723a = r2
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r2, int r3) {
                    r1 = this;
                    android.ext.MainService r2 = android.ext.MainService.instance
                    r2.O()
                    android.ext.d2$b r2 = r1.f724b
                    r3 = 0
                    int r0 = r1.f723a
                    r2.onClick(r3, r0)
                    return
            }
        }

        private b(android.ext.d2 r1) {
                r0 = this;
                r0.f722c = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(android.ext.d2 r1, android.ext.d2.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r4, int r5) {
                r3 = this;
                android.widget.EditText r4 = r3.f721b
                if (r4 != 0) goto L5
                return
            L5:
                android.text.Editable r4 = r4.getText()
                java.lang.String r4 = r4.toString()
                java.lang.String r4 = r4.trim()
                boolean r0 = android.ext.Tools.f1(r4)
                if (r0 != 0) goto L18
                return
            L18:
                android.ext.MainService r0 = android.ext.MainService.instance
                android.ext.c2 r0 = r0.f216f
                r1 = 0
                r2 = 2131296417(0x7f0900a1, float:1.821075E38)
                if (r0 == 0) goto L58
                android.app.AlertDialog$Builder r4 = android.ext.f.b()
                android.view.View r0 = android.ext.Tools.g0(r2)
                android.app.AlertDialog$Builder r4 = r4.setCustomTitle(r0)
                r0 = 2131296275(0x7f090013, float:1.8210462E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r4 = r4.setMessage(r0)
                r0 = 2131296994(0x7f0902e2, float:1.821192E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.ext.d2$b$a r2 = new android.ext.d2$b$a
                r2.<init>(r3, r5)
                android.app.AlertDialog$Builder r4 = r4.setPositiveButton(r0, r2)
                r5 = 2131296805(0x7f090225, float:1.8211537E38)
                java.lang.String r5 = android.ext.b2.f(r5)
                android.app.AlertDialog$Builder r4 = r4.setNegativeButton(r5, r1)
                android.ext.f.o(r4)
                return
            L58:
                android.ext.c2 r5 = new android.ext.c2     // Catch: java.lang.Throwable -> L6c
                r5.<init>(r4)     // Catch: java.lang.Throwable -> L6c
                r0 = 4
                android.ext.y0.b(r4, r0)
                android.ext.MainService r4 = android.ext.MainService.instance
                r4.f1(r5)
                android.app.AlertDialog r4 = r3.f720a
                android.ext.Tools.D(r4)
                return
            L6c:
                r5 = move-exception
                android.app.AlertDialog$Builder r0 = android.ext.f.b()
                android.view.View r2 = android.ext.Tools.g0(r2)
                android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r4)
                java.lang.String r4 = "\n\n"
                r2.append(r4)
                java.lang.String r4 = r5.toString()
                r2.append(r4)
                java.lang.String r4 = r2.toString()
                android.app.AlertDialog$Builder r4 = r0.setMessage(r4)
                r5 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r5 = android.ext.b2.f(r5)
                android.app.AlertDialog$Builder r4 = r4.setPositiveButton(r5, r1)
                android.ext.f.o(r4)
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r6) {
                r5 = this;
                r0 = 0
                if (r6 == 0) goto L12
                java.lang.Object r6 = r6.getTag()
                boolean r6 = r6 instanceof android.ext.p1
                if (r6 == 0) goto Lc
                goto L12
            Lc:
                r6 = -1
                r5.onClick(r0, r6)
                goto L93
            L12:
                android.ext.MainService r6 = android.ext.MainService.instance
                android.ext.f0 r6 = r6.i
                boolean r6 = r6.d0()
                if (r6 != 0) goto L1d
                return
            L1d:
                r6 = 2131099669(0x7f060015, float:1.7811698E38)
                android.view.View r6 = a.d.f(r6, r0)
                r1 = 2131034328(0x7f0500d8, float:1.767917E38)
                android.view.View r1 = r6.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r2 = 2131296888(0x7f090278, float:1.8211705E38)
                java.lang.String r2 = android.ext.b2.f(r2)
                r1.setText(r2)
                r1 = 2131034251(0x7f05008b, float:1.7679014E38)
                android.view.View r1 = r6.findViewById(r1)
                android.ext.EditTextPath r1 = (android.ext.EditTextPath) r1
                r5.f721b = r1
                java.lang.String r2 = "-record"
                java.lang.String r3 = ".lua"
                java.lang.String r4 = "record-path"
                java.lang.String r2 = android.ext.v1.a(r4, r2, r3)
                r1.setText(r2)
                r2 = 4
                r1.setDataType(r2)
                r2 = 2
                r1.setPathType(r2)
                r2 = 2131034354(0x7f0500f2, float:1.7679223E38)
                android.view.View r2 = r6.findViewById(r2)
                r2.setTag(r1)
                android.app.AlertDialog$Builder r2 = android.ext.f.b()
                r3 = 0
                android.view.View r6 = android.ext.InternalKeyboard.e(r6, r3)
                android.app.AlertDialog$Builder r6 = r2.setView(r6)
                r2 = 2131296884(0x7f090274, float:1.8211697E38)
                java.lang.String r2 = android.ext.b2.f(r2)
                android.app.AlertDialog$Builder r6 = r6.setPositiveButton(r2, r5)
                r2 = 2131296311(0x7f090037, float:1.8210535E38)
                java.lang.String r2 = android.ext.b2.f(r2)
                android.app.AlertDialog$Builder r6 = r6.setNegativeButton(r2, r0)
                android.app.AlertDialog r6 = r6.create()
                android.ext.f.l(r6, r5)
                android.ext.f.k(r6, r5)
                r5.f720a = r6
                android.ext.f.n(r6, r1)
            L93:
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r4) {
                r3 = this;
                android.widget.EditText r4 = r3.f721b
                if (r4 == 0) goto L15
                android.text.Editable r4 = r4.getText()
                java.lang.String r4 = r4.toString()
                java.lang.String r0 = "-record"
                java.lang.String r1 = ".lua"
                java.lang.String r2 = "record-path"
                android.ext.v1.c(r4, r2, r0, r1)
            L15:
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

    public d2() {
            r2 = this;
            r0 = 2131296888(0x7f090278, float:1.8211705E38)
            r1 = 2130968641(0x7f040041, float:1.7545941E38)
            r2.<init>(r0, r1)
            return
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            android.ext.d2$b r0 = new android.ext.d2$b
            r1 = 0
            r0.<init>(r2, r1)
            r0.onClick(r3)
            return
    }
}
