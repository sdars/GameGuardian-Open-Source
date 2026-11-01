package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
class a2 extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f570a;

    public a2(java.util.List r1) {
            r0 = this;
            r0.<init>()
            r0.f570a = r1
            return
    }

    private static android.widget.TextView b(android.view.View r1) {
            boolean r0 = r1 instanceof android.widget.TextView
            if (r0 == 0) goto L7
            android.widget.TextView r1 = (android.widget.TextView) r1
            return r1
        L7:
            r0 = 16908308(0x1020014, float:2.3877285E-38)
            android.view.View r1 = r1.findViewById(r0)
            boolean r0 = r1 instanceof android.widget.TextView
            if (r0 == 0) goto L15
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    public android.ext.z1.d a(int r2) {
            r1 = this;
            java.util.List r0 = r1.f570a
            java.lang.Object r2 = r0.get(r2)
            android.ext.z1$d r2 = (android.ext.z1.d) r2
            return r2
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            java.util.List r0 = r1.f570a
            int r0 = r0.size()
            return r0
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            android.ext.z1$d r1 = r0.a(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            if (r4 != 0) goto L2d
            r4 = 0
            a.d r0 = a.d.c()     // Catch: java.lang.Throwable -> Lf
            r1 = 17367057(0x1090011, float:2.5162974E-38)
            android.view.View r4 = r0.inflate(r1, r5, r4)     // Catch: java.lang.Throwable -> Lf
            goto L20
        Lf:
            r0 = move-exception
            java.lang.String r1 = "Failed inflate process list item"
            android.ext.e1.l(r1, r0)
            a.d r0 = a.d.c()
            r1 = 2131099670(0x7f060016, float:1.78117E38)
            android.view.View r4 = r0.inflate(r1, r5, r4)
        L20:
            android.widget.TextView r5 = b(r4)
            if (r5 == 0) goto L31
            r0 = 2131361796(0x7f0a0004, float:1.8343354E38)
            android.ext.Tools.D1(r5, r0)
            goto L31
        L2d:
            android.widget.TextView r5 = b(r4)
        L31:
            if (r5 != 0) goto L34
            return r4
        L34:
            java.util.List r0 = r2.f570a     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L4c
            android.ext.z1$d r3 = (android.ext.z1.d) r3     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L50
            java.lang.CharSequence r0 = r3.l()     // Catch: java.lang.Throwable -> L4c
            r5.setText(r0)     // Catch: java.lang.Throwable -> L4c
            r5.setTag(r3)     // Catch: java.lang.Throwable -> L4c
            r3.j(r5)     // Catch: java.lang.Throwable -> L4c
            goto L50
        L4c:
            r3 = move-exception
            android.ext.e1.a(r3)
        L50:
            return r4
    }
}
