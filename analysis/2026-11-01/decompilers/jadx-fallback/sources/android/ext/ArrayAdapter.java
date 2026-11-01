package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class ArrayAdapter<T> extends android.widget.ArrayAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a.d f27a;

    public ArrayAdapter(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f27a = r1
            return
    }

    public ArrayAdapter(android.content.Context r1, int r2, int r3, java.lang.Object[] r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r1 = 0
            r0.f27a = r1
            return
    }

    public ArrayAdapter(android.content.Context r3, java.util.List<T> r4) {
            r2 = this;
            r0 = 17367057(0x1090011, float:2.5162974E-38)
            r1 = 16908308(0x1020014, float:2.3877285E-38)
            r2.<init>(r3, r0, r1, r4)
            r3 = 0
            r2.f27a = r3
            return
    }

    public ArrayAdapter(android.content.Context r3, T[] r4) {
            r2 = this;
            r0 = 17367057(0x1090011, float:2.5162974E-38)
            r1 = 16908308(0x1020014, float:2.3877285E-38)
            r2.<init>(r3, r0, r1, r4)
            r3 = 0
            r2.f27a = r3
            return
    }

    @Override // android.widget.ArrayAdapter
    public void addAll(java.util.Collection r1) {
            r0 = this;
            super.addAll(r1)
            return
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
            r3 = this;
            android.view.View r5 = super.getView(r4, r5, r6)     // Catch: java.lang.Throwable -> L7
            r6 = 0
            r0 = r6
            goto L3d
        L7:
            r0 = move-exception
            java.lang.String r1 = "Failed get view for ArrayAdapter"
            android.ext.e1.l(r1, r0)
            if (r5 != 0) goto L23
            a.d r5 = r3.f27a
            if (r5 != 0) goto L19
            a.d r5 = a.d.c()
            r3.f27a = r5
        L19:
            a.d r5 = r3.f27a
            r0 = 2131099670(0x7f060016, float:1.78117E38)
            r1 = 0
            android.view.View r5 = r5.inflate(r0, r6, r1)
        L23:
            r6 = r5
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.Object r0 = r3.getItem(r4)
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L35
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L31:
            r6.setText(r1)
            goto L3a
        L35:
            java.lang.String r1 = r0.toString()
            goto L31
        L3a:
            r2 = r0
            r0 = r6
            r6 = r2
        L3d:
            if (r6 != 0) goto L4a
            boolean r1 = r5 instanceof android.widget.TextView
            if (r1 == 0) goto L4a
            java.lang.Object r6 = r3.getItem(r4)
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
        L4a:
            boolean r4 = r6 instanceof android.ext.p1
            if (r4 == 0) goto L5f
            if (r0 == 0) goto L5f
            android.ext.p1 r6 = (android.ext.p1) r6
            android.graphics.drawable.Drawable r4 = r6.c()
            if (r4 == 0) goto L5f
            int r6 = android.ext.Config.d()
            android.ext.Tools.c(r0, r4, r6)
        L5f:
            return r5
    }
}
