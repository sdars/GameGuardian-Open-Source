package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class v2 implements android.view.View.OnClickListener, android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String[] f1284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String[] f1285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.widget.EditText f1286c;

    public v2(java.lang.String[] r4, java.lang.String[] r5) {
            r3 = this;
            r3.<init>()
            r3.f1284a = r4
            r3.f1285b = r5
            int r0 = r4.length
            int r1 = r5.length
            if (r0 != r1) goto Lc
            return
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Params must be with same length: "
            r1.append(r2)
            int r4 = r4.length
            r1.append(r4)
            java.lang.String r4 = " != "
            r1.append(r4)
            int r4 = r5.length
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public static void a(android.widget.Button r5, android.widget.EditText r6) {
            java.lang.String r0 = "error"
            android.content.Context r1 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> Lf
            java.io.File r1 = r1.getFilesDir()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r1 = move-exception
            java.lang.String r2 = "Failed get files dir"
            android.ext.e1.s(r2, r1)
            r1 = r0
        L16:
            android.content.Context r2 = android.ext.Tools.f0()     // Catch: java.lang.Throwable -> L24
            r3 = 0
            java.io.File r2 = r2.getExternalFilesDir(r3)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L24
            goto L2a
        L24:
            r2 = move-exception
            java.lang.String r3 = "Failed get ext files dir"
            android.ext.e1.s(r3, r2)
        L2a:
            android.ext.v2 r2 = new android.ext.v2
            r3 = 2131296710(0x7f0901c6, float:1.8211344E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r4 = 2131296433(0x7f0900b1, float:1.8210783E38)
            java.lang.String r4 = android.ext.b2.f(r4)
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            r2.<init>(r3, r0)
            r5.setOnClickListener(r2)
            r5.setTag(r6)
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r2, int r3) {
            r1 = this;
            if (r3 < 0) goto L1d
            java.lang.String[] r2 = r1.f1285b
            int r0 = r2.length
            if (r3 < r0) goto L8
            goto L1d
        L8:
            android.widget.EditText r0 = r1.f1286c
            if (r0 != 0) goto L17
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>()
            java.lang.String r3 = "Unkwnon edit"
            android.ext.e1.s(r3, r2)
            return
        L17:
            r2 = r2[r3]
            r0.setText(r2)
            return
        L1d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Bad index: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = " for "
            r2.append(r3)
            java.lang.String[] r3 = r1.f1285b
            int r3 = r3.length
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>()
            android.ext.e1.s(r2, r3)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            if (r3 != 0) goto Ld
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            r3.<init>()
            java.lang.String r0 = "Unkwnon view"
            android.ext.e1.s(r0, r3)
            return
        Ld:
            java.lang.Object r3 = r3.getTag()
            boolean r0 = r3 instanceof android.widget.EditText
            if (r0 != 0) goto L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unkwnon tag: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            android.ext.e1.s(r3, r0)
            return
        L2f:
            android.widget.EditText r3 = (android.widget.EditText) r3
            r2.f1286c = r3
            android.app.AlertDialog$Builder r3 = android.ext.f.b()
            r0 = 2131297047(0x7f090317, float:1.8212028E38)
            android.view.View r0 = android.ext.Tools.g0(r0)
            android.app.AlertDialog$Builder r3 = r3.setCustomTitle(r0)
            java.lang.String[] r0 = r2.f1284a
            android.app.AlertDialog$Builder r3 = r3.setItems(r0, r2)
            r0 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            r1 = 0
            android.app.AlertDialog$Builder r3 = r3.setNegativeButton(r0, r1)
            android.ext.f.o(r3)
            return
    }
}
