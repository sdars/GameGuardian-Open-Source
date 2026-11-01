package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class u2 implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final android.ext.c.a[] f1273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f1274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.DialogInterface.OnClickListener f1275c;

    class a extends android.ext.ArrayAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.u2 f1276b;

        a(android.ext.u2 r1, android.content.Context r2, android.ext.c.a[] r3) {
                r0 = this;
                r0.f1276b = r1
                r0.<init>(r2, r3)
                return
        }

        @Override // android.ext.ArrayAdapter, android.widget.ArrayAdapter, android.widget.Adapter
        public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
                r2 = this;
                android.view.View r4 = super.getView(r3, r4, r5)
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                android.view.View r5 = r4.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                if (r5 == 0) goto L2b
                r0 = 2131361799(0x7f0a0007, float:1.834336E38)
                android.ext.Tools.D1(r5, r0)
                if (r3 < 0) goto L2b
                android.ext.u2 r0 = r2.f1276b
                android.ext.c$a[] r0 = r0.f1273a
                int r1 = r0.length
                if (r3 >= r1) goto L2b
                r3 = r0[r3]
                if (r3 == 0) goto L2b
                int r3 = r3.f675a
                int r3 = android.ext.c.n(r3)
                r5.setTextColor(r3)
            L2b:
                return r4
        }
    }

    public u2(a.e r1, android.util.SparseIntArray r2, java.lang.String r3, java.lang.String r4, android.content.DialogInterface.OnClickListener r5) {
            r0 = this;
            r0.<init>()
            android.ext.c$a[] r2 = android.ext.c.x(r1, r2)
            r0.f1273a = r2
            r0.f1274b = r3
            r0.f1275c = r5
            int r1 = r1.size()
            r3 = 1
            r5 = 0
            if (r1 != r3) goto L1a
            r1 = 0
            r0.onClick(r5, r1)
            goto L43
        L1a:
            android.content.Context r1 = android.ext.Tools.k0()
            android.app.AlertDialog$Builder r1 = android.ext.f.c(r1)
            android.view.View r3 = android.ext.Tools.h0(r4)
            android.app.AlertDialog$Builder r1 = r1.setCustomTitle(r3)
            android.ext.u2$a r3 = new android.ext.u2$a
            android.content.Context r4 = android.ext.MainService.context
            r3.<init>(r0, r4, r2)
            android.app.AlertDialog$Builder r1 = r1.setAdapter(r3, r0)
            r2 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r2, r5)
            android.ext.f.o(r1)
        L43:
            return
    }

    public u2(a.e r7, java.lang.String r8, java.lang.String r9, android.content.DialogInterface.OnClickListener r10) {
            r6 = this;
            r2 = 0
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r4, int r5) {
            r3 = this;
            android.ext.c$a[] r0 = r3.f1273a     // Catch: java.lang.NumberFormatException -> L18
            r5 = r0[r5]     // Catch: java.lang.NumberFormatException -> L18
            int r5 = r5.f675a     // Catch: java.lang.NumberFormatException -> L18
            java.lang.String r0 = "0"
            java.lang.String r1 = r3.f1274b     // Catch: java.lang.NumberFormatException -> L18
            boolean r0 = r0.equals(r1)     // Catch: java.lang.NumberFormatException -> L18
            if (r0 != 0) goto L1a
            java.lang.String r0 = r3.f1274b     // Catch: java.lang.NumberFormatException -> L18
            r1 = 0
            android.ext.c.e(r1, r0, r5)     // Catch: java.lang.NumberFormatException -> L18
            goto L1a
        L18:
            r4 = move-exception
            goto L25
        L1a:
            if (r4 == 0) goto L1f
            android.ext.Tools.D(r4)     // Catch: java.lang.NumberFormatException -> L18
        L1f:
            android.content.DialogInterface$OnClickListener r0 = r3.f1275c     // Catch: java.lang.NumberFormatException -> L18
            r0.onClick(r4, r5)     // Catch: java.lang.NumberFormatException -> L18
            return
        L25:
            r5 = 0
            android.ext.j2.i(r4, r5)
            return
    }
}
