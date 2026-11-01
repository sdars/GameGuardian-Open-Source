package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class MultiChoiceButton extends android.ext.SystemSpinner implements android.content.DialogInterface.OnMultiChoiceClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f315d;

    public MultiChoiceButton(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.ext.SystemSpinner
    protected void a() {
            r9 = this;
            a.e r0 = r9.f477c
            int r1 = r0.size()
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r1]
            boolean[] r3 = new boolean[r1]
            r4 = 0
            r9.f315d = r4
            r5 = 0
        Le:
            r6 = 0
            if (r5 >= r1) goto L30
            int r7 = r1 + (-1)
            int r7 = r7 - r5
            int r8 = r0.keyAt(r7)
            java.lang.Object r7 = r0.valueAt(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r2[r5] = r7
            int r7 = r9.f475a
            r7 = r7 & r8
            if (r7 == 0) goto L27
            r7 = 1
            goto L28
        L27:
            r7 = 0
        L28:
            r3[r5] = r7
            r9.onClick(r6, r5, r7)
            int r5 = r5 + 1
            goto Le
        L30:
            android.content.Context r0 = r9.getContext()
            android.content.Context r0 = android.ext.Tools.l0(r0)
            android.app.AlertDialog$Builder r0 = android.ext.f.c(r0)
            android.app.AlertDialog$Builder r0 = r0.setMultiChoiceItems(r2, r3, r9)
            r1 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r6)
            r1 = 2131296898(0x7f090282, float:1.8211726E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setNeutralButton(r1, r9)
            r1 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r9)
            android.ext.f.o(r0)
            return
    }

    @Override // android.ext.SystemSpinner, android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r5, int r6) {
            r4 = this;
            a.e r0 = r4.f477c
            int r0 = r0.size()
            r1 = -1
            r2 = 0
            if (r6 != r1) goto L23
            r6 = 0
        Lb:
            if (r2 >= r0) goto L22
            int r1 = r4.f315d
            r3 = 1
            int r3 = r3 << r2
            r1 = r1 & r3
            if (r1 != 0) goto L15
            goto L1f
        L15:
            a.e r1 = r4.f477c
            int r3 = r0 + (-1)
            int r3 = r3 - r2
            int r1 = r1.keyAt(r3)
            r6 = r6 | r1
        L1f:
            int r2 = r2 + 1
            goto Lb
        L22:
            r2 = r6
        L23:
            r4.setSelected(r2)
            android.ext.Tools.D(r5)
            return
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public void onClick(android.content.DialogInterface r1, int r2, boolean r3) {
            r0 = this;
            r1 = 1
            if (r3 == 0) goto La
            int r3 = r0.f315d
            int r1 = r1 << r2
            r1 = r1 | r3
        L7:
            r0.f315d = r1
            goto L10
        La:
            int r3 = r0.f315d
            int r1 = r1 << r2
            int r1 = ~r1
            r1 = r1 & r3
            goto L7
        L10:
            return
    }

    @Override // android.ext.SystemSpinner
    public void setSelected(int r9) {
            r8 = this;
            a.e r0 = r8.f477c
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r0.size()
            android.ext.y r2 = new android.ext.y
            r2.<init>()
            r3 = 0
            r4 = 0
        L10:
            if (r4 >= r1) goto L42
            int r5 = r1 + (-1)
            int r5 = r5 - r4
            int r6 = r0.keyAt(r5)
            r6 = r6 & r9
            if (r6 != 0) goto L1d
            goto L3f
        L1d:
            int r6 = r2.c()
            if (r6 == 0) goto L28
            java.lang.String r6 = ","
            r2.a(r6)
        L28:
            java.lang.Object r5 = r0.valueAt(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r6 = r5.toString()
            r7 = 58
            int r6 = r6.indexOf(r7)
            java.lang.CharSequence r5 = r5.subSequence(r3, r6)
            r2.a(r5)
        L3f:
            int r4 = r4 + 1
            goto L10
        L42:
            java.lang.CharSequence r0 = r2.d()
            r8.setText(r0)
            r8.f475a = r9
            android.content.DialogInterface$OnClickListener r0 = r8.f476b
            if (r0 == 0) goto L53
            r1 = 0
            r0.onClick(r1, r9)
        L53:
            return
    }
}
