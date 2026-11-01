package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class p0 implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1169b;

    public p0(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public p0(int r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f1169b = r1
            r0.f1168a = r2
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r1, int r2) {
            r0 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ExitListener called: "
            r1.append(r2)
            int r2 = r0.f1169b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.ext.e1.d(r1)
            boolean r1 = r0.f1168a
            android.ext.f1.f953c = r1
            android.ext.f1.o()
            return
    }
}
