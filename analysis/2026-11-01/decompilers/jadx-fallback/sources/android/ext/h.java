package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class h extends android.ext.p1 {

    static /* synthetic */ class a {
    }

    private static class b implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnShowListener, android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.widget.CheckBox f994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.widget.CheckBox f995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private android.widget.CheckBox f996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private android.ext.EditText f997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private android.app.AlertDialog f998e;

        private b() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f994a = r0
                r1.f995b = r0
                r1.f996c = r0
                r1.f997d = r0
                r1.f998e = r0
                return
        }

        /* synthetic */ b(android.ext.h.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public void a(java.lang.String r5) {
                r4 = this;
                r0 = 2131099648(0x7f060000, float:1.7811655E38)
                r1 = 0
                android.view.View r0 = a.d.f(r0, r1)
                r2 = 2131034320(0x7f0500d0, float:1.7679154E38)
                android.view.View r2 = r0.findViewById(r2)
                android.ext.EditText r2 = (android.ext.EditText) r2
                r4.f997d = r2
                r3 = 2131034377(0x7f050109, float:1.767927E38)
                android.view.View r3 = r0.findViewById(r3)
                r3.setTag(r2)
                if (r5 == 0) goto L21
                r2.setText(r5)
            L21:
                r5 = 1
                r2.setDataType(r5)
                r5 = 2131034374(0x7f050106, float:1.7679264E38)
                android.view.View r5 = r0.findViewById(r5)
                android.widget.CheckBox r5 = (android.widget.CheckBox) r5
                r4.f994a = r5
                r5 = 2131034455(0x7f050157, float:1.7679428E38)
                android.view.View r5 = r0.findViewById(r5)
                android.widget.CheckBox r5 = (android.widget.CheckBox) r5
                r4.f995b = r5
                r5 = 2131034247(0x7f050087, float:1.7679006E38)
                android.view.View r5 = r0.findViewById(r5)
                android.widget.CheckBox r5 = (android.widget.CheckBox) r5
                r4.f996c = r5
                android.app.AlertDialog$Builder r5 = android.ext.f.b()
                r3 = 2131296270(0x7f09000e, float:1.8210452E38)
                android.view.View r3 = android.ext.Tools.g0(r3)
                android.app.AlertDialog$Builder r5 = r5.setCustomTitle(r3)
                android.view.View r0 = android.ext.InternalKeyboard.d(r0)
                android.app.AlertDialog$Builder r5 = r5.setView(r0)
                r0 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r5 = r5.setPositiveButton(r0, r4)
                r0 = 2131296311(0x7f090037, float:1.8210535E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                android.app.AlertDialog$Builder r5 = r5.setNegativeButton(r0, r1)
                android.app.AlertDialog r5 = r5.create()
                r4.f998e = r5
                android.ext.f.l(r5, r4)
                android.ext.f.n(r5, r2)
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r8, int r9) {
                r7 = this;
                android.ext.EditText r8 = r7.f997d
                if (r8 != 0) goto L5
                return
            L5:
                android.text.Editable r9 = r8.getText()     // Catch: java.lang.NumberFormatException -> L29
                java.lang.String r9 = r9.toString()     // Catch: java.lang.NumberFormatException -> L29
                java.lang.String r9 = r9.trim()     // Catch: java.lang.NumberFormatException -> L29
                java.lang.String r9 = android.ext.j2.h(r9)     // Catch: java.lang.NumberFormatException -> L29
                java.lang.String r0 = "h"
                boolean r0 = r9.endsWith(r0)     // Catch: java.lang.NumberFormatException -> L29
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L2c
                int r0 = r9.length()     // Catch: java.lang.NumberFormatException -> L29
                int r0 = r0 - r2
                java.lang.String r9 = r9.substring(r1, r0)     // Catch: java.lang.NumberFormatException -> L29
                goto L2c
            L29:
                r9 = move-exception
                goto Laf
            L2c:
                int r0 = r9.length()     // Catch: java.lang.NumberFormatException -> L29
                if (r0 != 0) goto L34
                java.lang.String r9 = "0"
            L34:
                r0 = 16
                long r3 = android.ext.t1.r(r9, r0)     // Catch: java.lang.NumberFormatException -> L44
                r5 = 0
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 == 0) goto L46
                android.ext.y0.b(r9, r2)     // Catch: java.lang.NumberFormatException -> L44
                goto L46
            L44:
                r9 = move-exception
                goto Lab
            L46:
                android.widget.CheckBox r9 = r7.f994a     // Catch: java.lang.NumberFormatException -> L29
                boolean r9 = r9.isChecked()     // Catch: java.lang.NumberFormatException -> L29
                if (r9 == 0) goto L4f
                r1 = 2
            L4f:
                android.widget.CheckBox r9 = r7.f995b     // Catch: java.lang.NumberFormatException -> L29
                boolean r9 = r9.isChecked()     // Catch: java.lang.NumberFormatException -> L29
                if (r9 == 0) goto L59
                r1 = r1 | 1
            L59:
                android.widget.CheckBox r9 = r7.f996c     // Catch: java.lang.NumberFormatException -> L29
                boolean r9 = r9.isChecked()     // Catch: java.lang.NumberFormatException -> L29
                if (r9 == 0) goto L63
                r1 = r1 | 4
            L63:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L29
                r9.<init>()     // Catch: java.lang.NumberFormatException -> L29
                java.lang.String r0 = "Allocate: "
                r9.append(r0)     // Catch: java.lang.NumberFormatException -> L29
                r9.append(r1)     // Catch: java.lang.NumberFormatException -> L29
                java.lang.String r0 = "; "
                r9.append(r0)     // Catch: java.lang.NumberFormatException -> L29
                r9.append(r3)     // Catch: java.lang.NumberFormatException -> L29
                java.lang.String r9 = r9.toString()     // Catch: java.lang.NumberFormatException -> L29
                android.ext.e1.d(r9)     // Catch: java.lang.NumberFormatException -> L29
                android.app.AlertDialog r9 = r7.f998e     // Catch: java.lang.NumberFormatException -> L29
                android.ext.Tools.D(r9)     // Catch: java.lang.NumberFormatException -> L29
                android.ext.MainService r9 = android.ext.MainService.instance     // Catch: java.lang.NumberFormatException -> L29
                android.ext.f0 r9 = r9.i     // Catch: java.lang.NumberFormatException -> L29
                r9.g(r3, r1)     // Catch: java.lang.NumberFormatException -> L29
                android.ext.MainService r9 = android.ext.MainService.instance     // Catch: java.lang.NumberFormatException -> L29
                android.ext.c2 r9 = r9.f216f     // Catch: java.lang.NumberFormatException -> L29
                if (r9 == 0) goto Laa
                java.lang.String r0 = "gg.allocatePage("
                r9.write(r0)     // Catch: java.lang.NumberFormatException -> L29
                android.ext.Script$Consts r0 = r9.f697c     // Catch: java.lang.NumberFormatException -> L29
                android.ext.Script$Const[] r0 = r0.f377g     // Catch: java.lang.NumberFormatException -> L29
                android.ext.Script.Consts.a(r9, r0, r1)     // Catch: java.lang.NumberFormatException -> L29
                java.lang.String r0 = ", "
                r9.write(r0)     // Catch: java.lang.NumberFormatException -> L29
                android.ext.Script.Consts.b(r9, r3)     // Catch: java.lang.NumberFormatException -> L29
                java.lang.String r0 = ")\n"
                r9.write(r0)     // Catch: java.lang.NumberFormatException -> L29
            Laa:
                return
            Lab:
                r8.requestFocus()     // Catch: java.lang.NumberFormatException -> L29
                throw r9     // Catch: java.lang.NumberFormatException -> L29
            Laf:
                android.ext.j2.i(r9, r8)
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                r0 = 0
                if (r2 == 0) goto L11
                java.lang.Object r2 = r2.getTag()
                boolean r2 = r2 instanceof android.ext.p1
                if (r2 == 0) goto Lc
                goto L11
            Lc:
                r2 = -1
                r1.onClick(r0, r2)
                goto L14
            L11:
                r1.a(r0)
            L14:
                return
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface r3) {
                r2 = this;
                android.app.AlertDialog r3 = r2.f998e
                r0 = -1
                r1 = 0
                android.ext.Tools.s1(r3, r0, r1, r2)
                return
        }
    }

    public h() {
            r2 = this;
            r0 = 2131296270(0x7f09000e, float:1.8210452E38)
            r1 = 2130968597(0x7f040015, float:1.7545852E38)
            r2.<init>(r0, r1)
            return
    }

    public static void h(java.lang.String r2) {
            android.ext.h$b r0 = new android.ext.h$b
            r1 = 0
            r0.<init>(r1)
            r0.a(r2)
            return
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            android.ext.h$b r0 = new android.ext.h$b
            r1 = 0
            r0.<init>(r1)
            r0.onClick(r3)
            return
    }
}
