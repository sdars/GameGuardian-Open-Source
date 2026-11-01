package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class j2 extends android.ext.p1 implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected java.lang.String f1037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f1038g;
    protected java.lang.String h;
    protected int i;
    protected android.ext.Searcher j;
    protected java.lang.ref.WeakReference k;

    class a implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.widget.EditText f1039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.n.b f1040b;

        a(android.widget.EditText r1, android.ext.n.b r2) {
                r0 = this;
                r0.f1039a = r1
                r0.f1040b = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r3, int r4) {
                r2 = this;
                android.widget.EditText r3 = r2.f1039a
                android.text.Editable r3 = r3.getText()
                java.lang.String r4 = r3.toString()
                android.ext.n$b r0 = r2.f1040b
                java.lang.String r0 = r0.f1085b
                boolean r1 = r4.contains(r0)
                if (r1 != 0) goto L15
                return
            L15:
                int r4 = r4.indexOf(r0)
                int r0 = r0.length()
                int r0 = r0 + r4
                android.ext.n$b r1 = r2.f1040b
                java.lang.String r1 = r1.f1084a
                r3.replace(r4, r0, r1)
                return
        }
    }

    public j2(int r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r1 = ""
            r0.f1037f = r1
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0.f1038g = r1
            java.lang.String r1 = "FFFFFFFFFFFFFFFF"
            r0.h = r1
            r1 = -1
            r0.i = r1
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r2 = 0
            r1.<init>(r2)
            r0.k = r1
            return
    }

    public static java.lang.String h(java.lang.String r4) {
            java.lang.String r0 = "'"
            if (r4 == 0) goto L7b
            java.lang.String r1 = r4.trim()
            int r2 = r1.length()
            if (r2 <= 0) goto L7b
            r2 = 0
            char r2 = r4.charAt(r2)
            r3 = 61
            if (r2 != r3) goto L7b
            r4 = 1
            java.lang.String r4 = r1.substring(r4)
            java.lang.String r1 = "return"
            int r1 = r4.indexOf(r1)
            if (r1 >= 0) goto L35
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "return "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
        L35:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r1.<init>()     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "oneLiner IN: '"
            r1.append(r2)     // Catch: java.lang.Throwable -> L68
            r1.append(r4)     // Catch: java.lang.Throwable -> L68
            r1.append(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L68
            android.ext.e1.d(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = android.ext.Script.F3(r4)     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r1.<init>()     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "oneLiner OUT: '"
            r1.append(r2)     // Catch: java.lang.Throwable -> L68
            r1.append(r4)     // Catch: java.lang.Throwable -> L68
            r1.append(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L68
            android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L68
            goto L7b
        L68:
            r4 = move-exception
            java.lang.String r0 = "oneLiner ERR:"
            android.ext.e1.g(r0, r4)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r4.getMessage()
            r0.<init>(r1)
            r0.initCause(r4)
            throw r0
        L7b:
            return r4
    }

    public static void i(java.lang.NumberFormatException r4, android.widget.EditText r5) {
            java.lang.String r0 = "Error"
            android.ext.e1.s(r0, r4)
            r0 = 0
            r1 = 2131296417(0x7f0900a1, float:1.821075E38)
            if (r5 == 0) goto L45
            boolean r2 = r4 instanceof android.ext.n.b
            if (r2 == 0) goto L45
            r2 = r4
            android.ext.n$b r2 = (android.ext.n.b) r2
            android.app.AlertDialog$Builder r3 = android.ext.f.b()
            android.view.View r1 = android.ext.Tools.g0(r1)
            android.app.AlertDialog$Builder r1 = r3.setCustomTitle(r1)
            java.lang.String r4 = r4.getMessage()
            android.app.AlertDialog$Builder r4 = r1.setMessage(r4)
            r1 = 2131297115(0x7f09035b, float:1.8212166E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.ext.j2$a r3 = new android.ext.j2$a
            r3.<init>(r5, r2)
            android.app.AlertDialog$Builder r4 = r4.setPositiveButton(r1, r3)
            r5 = 2131296805(0x7f090225, float:1.8211537E38)
            java.lang.String r5 = android.ext.b2.f(r5)
            android.app.AlertDialog$Builder r4 = r4.setNegativeButton(r5, r0)
        L41:
            android.ext.f.o(r4)
            return
        L45:
            android.app.AlertDialog$Builder r5 = android.ext.f.b()
            android.view.View r1 = android.ext.Tools.g0(r1)
            android.app.AlertDialog$Builder r5 = r5.setCustomTitle(r1)
            java.lang.String r4 = r4.getMessage()
            android.app.AlertDialog$Builder r4 = r5.setMessage(r4)
            r5 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r5 = android.ext.b2.f(r5)
            android.app.AlertDialog$Builder r4 = r4.setPositiveButton(r5, r0)
            goto L41
    }

    public abstract void j(android.content.DialogInterface r1, int r2);

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r2, int r3) {
            r1 = this;
            r0 = -1
            if (r3 == r0) goto L32
            r0 = -3
            if (r3 != r0) goto L7
            goto L32
        L7:
            r0 = -2
            if (r3 != r0) goto Lb
            goto L38
        Lb:
            android.ext.Searcher r0 = r1.j     // Catch: java.lang.Throwable -> L19 java.lang.NumberFormatException -> L1b
            r0.E(r3)     // Catch: java.lang.Throwable -> L19 java.lang.NumberFormatException -> L1b
            r1.j(r2, r3)     // Catch: java.lang.Throwable -> L19 java.lang.NumberFormatException -> L1b
            java.lang.ref.WeakReference r2 = r1.k     // Catch: java.lang.Throwable -> L19 java.lang.NumberFormatException -> L1b
            android.ext.Tools.U0(r2)     // Catch: java.lang.Throwable -> L19 java.lang.NumberFormatException -> L1b
            goto L22
        L19:
            r2 = move-exception
            goto L1d
        L1b:
            r2 = move-exception
            goto L28
        L1d:
            java.lang.String r3 = "Exception on start search"
            android.ext.e1.l(r3, r2)
        L22:
            java.lang.ref.WeakReference r2 = r1.k
            android.ext.Tools.E(r2)
            goto L38
        L28:
            android.ext.Searcher r3 = r1.j
            android.ext.EditText r3 = r3.g()
            i(r2, r3)
            return
        L32:
            r1.i = r3
            r2 = 0
            r1.onClick(r2)
        L38:
            return
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(android.view.View r8) {
            r7 = this;
            if (r8 == 0) goto L16
            java.lang.Object r0 = r8.getTag()
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L16
            java.lang.Object r0 = r8.getTag()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r7.i = r0
        L16:
            boolean r0 = r7 instanceof android.ext.m1
            r1 = 0
            r2 = 0
            r3 = 127(0x7f, float:1.78E-43)
            r4 = 1
            r5 = -1
            if (r8 == 0) goto Lda
            java.lang.Object r8 = r8.getTag()
            boolean r8 = r8 instanceof android.ext.p1
            if (r8 == 0) goto Lda
            android.ext.MainService r8 = android.ext.MainService.instance
            android.ext.f0 r8 = r8.i
            boolean r8 = r8.d0()
            if (r8 != 0) goto L33
            return
        L33:
            android.ext.Searcher r8 = r7.j
            if (r8 != 0) goto L41
            android.ext.Searcher r8 = new android.ext.Searcher
            if (r0 == 0) goto L3c
            r2 = 3
        L3c:
            r8.<init>(r2, r3)
            r7.j = r8
        L41:
            android.ext.Searcher r8 = r7.j
            if (r0 == 0) goto L49
            r2 = 2131296768(0x7f090200, float:1.8211462E38)
            goto L4c
        L49:
            r2 = 2131297082(0x7f09033a, float:1.8212099E38)
        L4c:
            java.lang.String r2 = android.ext.b2.f(r2)
            r8.y(r2)
            android.ext.Searcher r8 = r7.j
            int r2 = r7.f1038g
            r8.D(r2)
            android.ext.Searcher r8 = r7.j
            java.lang.String r2 = r7.f1037f
            r8.z(r2)
            if (r0 == 0) goto L78
            android.ext.Searcher r8 = r7.j
            java.lang.String r0 = r7.h
            r8.x(r0)
            android.ext.Searcher r8 = r7.j
            android.view.View r8 = r8.k()
            android.ext.InternalKeyboard$d r0 = new android.ext.InternalKeyboard$d
            r0.<init>(r4)
            r8.setTag(r0)
        L78:
            android.ext.Searcher r8 = r7.j
            r8.G(r3)
            android.app.AlertDialog$Builder r8 = android.ext.f.b()
            android.ext.Searcher r0 = r7.j
            android.view.View r0 = r0.l()
            android.app.AlertDialog$Builder r8 = r8.setView(r0)
            r0 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            android.app.AlertDialog$Builder r8 = r8.setNegativeButton(r0, r1)
            android.ext.MainService r0 = android.ext.MainService.instance
            long r0 = r0.p0
            r2 = 0
            r4 = 2131296802(0x7f090222, float:1.821153E38)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto Lab
            java.lang.String r0 = android.ext.b2.f(r4)
            r8.setPositiveButton(r0, r7)
            goto Lbd
        Lab:
            r0 = 2131296889(0x7f090279, float:1.8211707E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            android.app.AlertDialog$Builder r0 = r8.setPositiveButton(r0, r7)
            java.lang.String r1 = android.ext.b2.f(r4)
            r0.setNeutralButton(r1, r7)
        Lbd:
            r7.i = r5
            android.app.AlertDialog r8 = r8.create()
            android.ext.f.k(r8, r7)
            android.ext.f.l(r8, r7)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r8)
            r7.k = r0
            android.ext.Searcher r0 = r7.j
            android.ext.EditText r0 = r0.g()
            android.ext.f.n(r8, r0)
            goto L142
        Lda:
            android.ext.Searcher r8 = r7.j
            int r8 = r8.j()
            if (r8 != 0) goto L13f
            r8 = 2131297042(0x7f090312, float:1.8212018E38)
            java.lang.String r1 = "0"
            if (r0 == 0) goto Lf7
            a.e r0 = android.ext.c.r(r3, r4)
            android.ext.u2 r2 = new android.ext.u2
            java.lang.String r8 = android.ext.b2.f(r8)
            r2.<init>(r0, r1, r8, r7)
            goto L142
        Lf7:
            android.ext.Searcher r0 = r7.j
            java.lang.String r0 = r0.f()
            java.lang.String r0 = h(r0)     // Catch: java.lang.NumberFormatException -> L134
            r6 = 59
            int r6 = r0.indexOf(r6)
            if (r6 != r5) goto L121
            r6 = 126(0x7e, float:1.77E-43)
            int r6 = r0.indexOf(r6)
            if (r6 != r5) goto L121
            r6 = 88
            int r6 = r0.indexOf(r6)
            if (r6 != r5) goto L121
            r6 = 120(0x78, float:1.68E-43)
            int r6 = r0.indexOf(r6)
            if (r6 == r5) goto L122
        L121:
            r2 = 1
        L122:
            a.e r3 = android.ext.c.r(r3, r4)
            android.ext.u2 r4 = new android.ext.u2
            if (r2 == 0) goto L12b
            goto L12c
        L12b:
            r1 = r0
        L12c:
            java.lang.String r8 = android.ext.b2.f(r8)
            r4.<init>(r3, r1, r8, r7)
            goto L142
        L134:
            r8 = move-exception
            android.ext.Searcher r0 = r7.j
            android.ext.EditText r0 = r0.g()
            i(r8, r0)
            return
        L13f:
            r7.onClick(r1, r8)
        L142:
            return
    }

    public void onDismiss(android.content.DialogInterface r1) {
            r0 = this;
            android.ext.Searcher r1 = r0.j
            if (r1 == 0) goto L7
            r1.m()
        L7:
            return
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(android.content.DialogInterface r3) {
            r2 = this;
            r0 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.ext.Tools.s1(r3, r0, r1, r2)
            r0 = -3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.ext.Tools.s1(r3, r0, r1, r2)
            android.ext.Searcher r3 = r2.j
            if (r3 == 0) goto L17
            r3.r()
        L17:
            return
    }
}
