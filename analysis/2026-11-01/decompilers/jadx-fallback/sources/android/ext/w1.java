package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class w1 extends android.ext.j2 {
    private static java.lang.String l = "0";
    private static boolean m = true;

    static {
            return
    }

    public w1() {
            r2 = this;
            r0 = 2131296647(0x7f090187, float:1.8211217E38)
            r1 = 2130968640(0x7f040040, float:1.754594E38)
            r2.<init>(r0, r1)
            return
    }

    private int k() {
            r1 = this;
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.z1$d r0 = r0.v0
            if (r0 == 0) goto Ld
            boolean r0 = r0.n
            if (r0 == 0) goto Ld
            r0 = 36
            goto Le
        Ld:
            r0 = 4
        Le:
            return r0
    }

    @Override // android.ext.j2
    public void j(android.content.DialogInterface r1, int r2) {
            r0 = this;
            return
    }

    public void l(java.lang.String r8) {
            r7 = this;
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.f0 r0 = r0.i
            boolean r0 = r0.d0()
            if (r0 != 0) goto Lb
            return
        Lb:
            android.ext.MainService r0 = android.ext.MainService.instance
            int r1 = r7.k()
            android.ext.Searcher r2 = r7.j
            r3 = 4
            if (r2 != 0) goto L1d
            android.ext.Searcher r2 = new android.ext.Searcher
            r2.<init>(r3, r1)
            r7.j = r2
        L1d:
            android.ext.Searcher r2 = r7.j
            r4 = 0
            r5 = 1
            if (r8 != 0) goto L25
            r6 = 1
            goto L26
        L25:
            r6 = 0
        L26:
            r2.u(r6)
            android.ext.Searcher r2 = r7.j
            if (r8 != 0) goto L2f
            java.lang.String r8 = r7.f1037f
        L2f:
            r2.z(r8)
            android.ext.Searcher r8 = r7.j
            r2 = 2131296768(0x7f090200, float:1.8211462E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r8.y(r2)
            android.ext.Searcher r8 = r7.j
            java.lang.String r2 = android.ext.w1.l
            r8.A(r2)
            android.ext.Searcher r8 = r7.j
            boolean r2 = android.ext.w1.m
            r8.B(r2)
            android.ext.Searcher r8 = r7.j
            if (r1 == r3) goto L51
            r4 = 1
        L51:
            a.e r2 = android.ext.c.r(r1, r4)
            r8.F(r2, r1)
            android.app.AlertDialog$Builder r8 = android.ext.f.b()
            android.ext.Searcher r2 = r7.j
            android.view.View r2 = r2.l()
            android.app.AlertDialog$Builder r8 = r8.setView(r2)
            r2 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r3 = 0
            android.app.AlertDialog$Builder r8 = r8.setNegativeButton(r2, r3)
            long r2 = r0.p0
            r4 = 0
            r0 = 2131296802(0x7f090222, float:1.821153E38)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L98
            int r2 = android.ext.MainService.D()
            r1 = r1 & r2
            if (r1 != 0) goto L85
            goto L98
        L85:
            r1 = 2131296889(0x7f090279, float:1.8211707E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r1 = r8.setPositiveButton(r1, r7)
            java.lang.String r0 = android.ext.b2.f(r0)
            r1.setNeutralButton(r0, r7)
            goto L9f
        L98:
            java.lang.String r0 = android.ext.b2.f(r0)
            r8.setPositiveButton(r0, r7)
        L9f:
            android.app.AlertDialog r8 = r8.create()
            android.ext.f.k(r8, r7)
            android.ext.f.l(r8, r7)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r8)
            r7.k = r0
            android.ext.Searcher r0 = r7.j
            android.ext.EditText r0 = r0.g()
            android.ext.f.n(r8, r0)
            return
    }

    @Override // android.ext.j2, android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r20, int r21) {
            r19 = this;
            r1 = r19
            android.ext.Searcher r0 = r1.j     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            java.lang.String r0 = r0.f()     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            java.lang.String r0 = android.ext.j2.h(r0)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r2 = 16
            long r3 = android.ext.t1.r(r0, r2)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            android.ext.Searcher r0 = r1.j     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            java.lang.String r0 = r0.h()     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            java.lang.String r0 = android.ext.j2.h(r0)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            android.ext.Searcher r5 = r1.j     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            boolean r5 = r5.q()     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            if (r5 == 0) goto L25
            goto L27
        L25:
            r2 = 10
        L27:
            long r5 = android.ext.t1.r(r0, r2)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            android.ext.Searcher r0 = r1.j     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            int r8 = r0.j()     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r0.<init>()     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            java.lang.String r2 = android.ext.c.G(r3, r8)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r0.append(r2)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r2 = 104(0x68, float:1.46E-43)
            r0.append(r2)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r7.<init>()     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            long r3 = r3 - r5
            java.lang.String r3 = android.ext.c.G(r3, r8)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r7.append(r3)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r7.append(r2)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r3 = 0
            r7 = 126(0x7e, float:1.77E-43)
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 <= 0) goto L7a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r3.<init>()     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r3.append(r2)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r3.append(r7)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r3.append(r0)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
        L70:
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
        L74:
            r7 = r0
            goto L8b
        L76:
            r0 = move-exception
            goto Lc2
        L78:
            r0 = move-exception
            goto Lcd
        L7a:
            if (r9 >= 0) goto L74
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r3.<init>()     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r3.append(r0)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r3.append(r7)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r3.append(r2)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            goto L70
        L8b:
            r9 = 0
            r10 = 536870912(0x20000000, float:1.0842022E-19)
            android.ext.Searcher r0 = r1.j     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r2 = 0
            long r11 = r0.e(r2)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            android.ext.Searcher r0 = r1.j     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r3 = 1
            long r13 = r0.e(r3)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r0 = -3
            r4 = r21
            if (r4 == r0) goto Lab
            int r0 = android.ext.MainService.D()     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r0 = r0 & r8
            if (r0 != 0) goto La9
            goto Lab
        La9:
            r15 = 0
            goto Lac
        Lab:
            r15 = 1
        Lac:
            android.ext.Searcher r0 = r1.j     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            long r16 = r0.b()     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r18 = 1048576(0x100000, float:1.469368E-39)
            android.ext.i2.r(r7, r8, r9, r10, r11, r13, r15, r16, r18)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            r0.U0(r3)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            java.lang.ref.WeakReference r0 = r1.k     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            android.ext.Tools.U0(r0)     // Catch: java.lang.Throwable -> L76 java.lang.NumberFormatException -> L78
            goto Lc7
        Lc2:
            java.lang.String r2 = "Exception on start search"
            android.ext.e1.l(r2, r0)
        Lc7:
            java.lang.ref.WeakReference r0 = r1.k
            android.ext.Tools.E(r0)
            return
        Lcd:
            android.ext.Searcher r2 = r1.j
            android.ext.EditText r2 = r2.g()
            android.ext.j2.i(r0, r2)
            return
    }

    @Override // android.ext.j2, android.ext.p1, android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L19
            java.lang.Object r1 = r3.getTag()
            boolean r1 = r1 instanceof java.lang.Integer
            if (r1 == 0) goto L19
            java.lang.Object r3 = r3.getTag()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.onClick(r0, r3)
            return
        L19:
            r2.l(r0)
            return
    }

    @Override // android.ext.j2, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r2) {
            r1 = this;
            android.ext.Searcher r0 = r1.j
            if (r0 == 0) goto L1a
            boolean r0 = r0.q()
            android.ext.w1.m = r0
            android.ext.Searcher r0 = r1.j
            java.lang.String r0 = r0.h()
            android.ext.w1.l = r0
            android.ext.Searcher r0 = r1.j
            java.lang.String r0 = r0.f()
            r1.f1037f = r0
        L1a:
            super.onDismiss(r2)
            return
    }
}
