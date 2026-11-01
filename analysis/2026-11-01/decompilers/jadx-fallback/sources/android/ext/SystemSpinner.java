package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class SystemSpinner extends android.fix.Button implements android.view.View.OnClickListener, android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected android.content.DialogInterface.OnClickListener f476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected a.e f477c;

    public SystemSpinner(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f477c = r1
            return
    }

    protected void a() {
            r5 = this;
            a.e r0 = r5.f477c
            int r1 = r0.size()
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r1]
            r3 = 0
        L9:
            if (r3 >= r1) goto L19
            int r4 = r1 + (-1)
            int r4 = r4 - r3
            java.lang.Object r4 = r0.valueAt(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto L9
        L19:
            android.content.Context r3 = r5.getContext()
            android.app.AlertDialog$Builder r3 = android.ext.f.c(r3)
            int r1 = r1 + (-1)
            int r4 = r5.f475a
            int r0 = r0.indexOfKey(r4)
            int r1 = r1 - r0
            android.app.AlertDialog$Builder r0 = r3.setSingleChoiceItems(r2, r1, r5)
            android.ext.f.o(r0)
            return
    }

    public int getSelected() {
            r1 = this;
            int r0 = r1.f475a
            return r0
    }

    public void onClick(android.content.DialogInterface r3, int r4) {
            r2 = this;
            a.e r0 = r2.f477c
            int r1 = r0.size()
            int r1 = r1 + (-1)
            int r1 = r1 - r4
            int r4 = r0.keyAt(r1)
            r2.setSelected(r4)
            android.ext.Tools.D(r3)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r1) {
            r0 = this;
            a.e r1 = r0.f477c
            if (r1 != 0) goto L5
            return
        L5:
            int r1 = r1.size()
            if (r1 != 0) goto Lc
            return
        Lc:
            r0.a()
            return
    }

    public void setData(a.e r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            r1.f477c = r2
            int r0 = r2.size()
            if (r0 != 0) goto Lc
            return
        Lc:
            int r0 = r0 + (-1)
            int r2 = r2.keyAt(r0)
            r1.f475a = r2
            r1.setOnClickListener(r1)
            return
    }

    public void setOnItemSelectedListener(android.content.DialogInterface.OnClickListener r1) {
            r0 = this;
            r0.f476b = r1
            return
    }

    public void setSelected(int r4) {
            r3 = this;
            a.e r0 = r3.f477c
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Object r1 = r0.get(r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 != 0) goto L22
            int r1 = r0.size()
            r2 = 1
            if (r1 != r2) goto L20
            r4 = 0
            java.lang.Object r1 = r0.valueAt(r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r4 = r0.keyAt(r4)
            goto L22
        L20:
            java.lang.String r1 = "???"
        L22:
            r3.setText(r1)
            r3.f475a = r4
            android.content.DialogInterface$OnClickListener r0 = r3.f476b
            if (r0 == 0) goto L2f
            r1 = 0
            r0.onClick(r1, r4)
        L2f:
            return
    }
}
