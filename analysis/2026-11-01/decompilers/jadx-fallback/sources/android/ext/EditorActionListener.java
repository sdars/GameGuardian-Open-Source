package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class EditorActionListener implements android.widget.TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.ref.WeakReference f122a;

    public EditorActionListener(android.app.AlertDialog r3) {
            r2 = this;
            r2.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            r2.f122a = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.f122a = r0
            return
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView r5, int r6, android.view.KeyEvent r7) {
            r4 = this;
            r7 = 6
            r0 = 0
            if (r6 == r7) goto Ld
            r7 = 3
            if (r6 == r7) goto Ld
            r7 = 4
            if (r6 == r7) goto Ld
            r7 = 2
            if (r6 != r7) goto L45
        Ld:
            java.lang.ref.WeakReference r6 = r4.f122a
            java.lang.Object r6 = r6.get()
            android.app.AlertDialog r6 = (android.app.AlertDialog) r6
            boolean r7 = r6 instanceof android.app.AlertDialog
            r1 = -1
            r2 = 1
            if (r7 == 0) goto L2b
            android.widget.Button r7 = r6.getButton(r1)
            if (r7 == 0) goto L2b
            int r3 = r7.getVisibility()
            if (r3 != 0) goto L2b
            android.ext.Tools.s(r7)
            r0 = 1
        L2b:
            if (r0 != 0) goto L39
            boolean r7 = r6 instanceof android.content.DialogInterface.OnClickListener
            if (r7 == 0) goto L39
            r7 = r6
            android.content.DialogInterface$OnClickListener r7 = (android.content.DialogInterface.OnClickListener) r7
            r0 = 0
            r7.onClick(r0, r1)
            r0 = 1
        L39:
            if (r0 != 0) goto L45
            boolean r7 = r6 instanceof android.view.View.OnClickListener
            if (r7 == 0) goto L45
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r6.onClick(r5)
            r0 = 1
        L45:
            return r0
    }
}
