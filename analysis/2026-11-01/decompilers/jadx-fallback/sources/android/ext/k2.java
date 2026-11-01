package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f1048a;

    protected k2(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f1048a = r1
            return
    }

    protected android.content.SharedPreferences a(java.lang.String r2, int r3) {
            r1 = this;
            android.content.Context r0 = r1.f1048a
            android.content.SharedPreferences r2 = r0.getSharedPreferences(r2, r3)
            return r2
    }

    protected java.lang.Object b(java.lang.String r2) {
            r1 = this;
            android.content.Context r0 = r1.f1048a
            java.lang.Object r2 = r0.getSystemService(r2)
            return r2
    }

    protected void c() {
            r2 = this;
            android.ext.v r0 = android.ext.v.f1277a
            r1 = 1
            android.ext.v.f1281e = r1
            if (r0 == 0) goto Lf
            java.lang.String r1 = "BootstrapService stopSelf"
            android.ext.e1.d(r1)
            r0.stopSelf()
        Lf:
            android.ext.u r0 = android.ext.u.f1267b
            if (r0 == 0) goto L16
            r0.onDestroy()
        L16:
            return
    }
}
