package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class SystemSpinnerType extends android.ext.SystemSpinner {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    android.ext.c.a[] f478d;

    class a extends android.ext.ArrayAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.SystemSpinnerType f479b;

        a(android.ext.SystemSpinnerType r1, android.content.Context r2, int r3, int r4, android.ext.c.a[] r5) {
                r0 = this;
                r0.f479b = r1
                r0.<init>(r2, r3, r4, r5)
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
                if (r3 <= 0) goto L2b
                android.ext.SystemSpinnerType r0 = r2.f479b
                android.ext.c$a[] r0 = r0.f478d
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

    public SystemSpinnerType(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.ext.SystemSpinner
    protected void a() {
            r9 = this;
            a.e r0 = r9.f477c
            r1 = 0
            android.ext.c$a[] r0 = android.ext.c.x(r0, r1)
            r9.f478d = r0
            r0 = 0
            r1 = 0
        Lb:
            android.ext.c$a[] r2 = r9.f478d
            int r3 = r2.length
            if (r1 >= r3) goto L1d
            r2 = r2[r1]
            int r2 = r2.f675a
            int r3 = r9.f475a
            if (r2 != r3) goto L1a
            r0 = r1
            goto L1d
        L1a:
            int r1 = r1 + 1
            goto Lb
        L1d:
            android.content.Context r1 = r9.getContext()
            android.content.Context r1 = android.ext.Tools.l0(r1)
            android.app.AlertDialog$Builder r1 = android.ext.f.c(r1)
            android.ext.SystemSpinnerType$a r8 = new android.ext.SystemSpinnerType$a
            android.content.Context r4 = android.ext.MainService.context
            r5 = 17367058(0x1090012, float:2.5162976E-38)
            r6 = 16908308(0x1020014, float:2.3877285E-38)
            android.ext.c$a[] r7 = r9.f478d
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            android.app.AlertDialog$Builder r0 = r1.setSingleChoiceItems(r8, r0, r9)
            android.ext.f.o(r0)
            return
    }

    @Override // android.ext.SystemSpinner, android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r2, int r3) {
            r1 = this;
            android.ext.c$a[] r0 = r1.f478d
            r3 = r0[r3]
            int r3 = r3.f675a
            r1.setSelected(r3)
            android.ext.Tools.D(r2)
            return
    }

    @Override // android.ext.SystemSpinner
    public void setSelected(int r1) {
            r0 = this;
            super.setSelected(r1)
            int r1 = android.ext.c.n(r1)
            r0.setTextColor(r1)
            return
    }
}
