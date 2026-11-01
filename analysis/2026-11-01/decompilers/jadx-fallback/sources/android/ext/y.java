package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f1330a;

    public y() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1330a = r0
            return
    }

    public android.ext.y a(java.lang.CharSequence r2) {
            r1 = this;
            java.util.List r0 = r1.f1330a
            r0.add(r2)
            return r1
    }

    public android.ext.y b(java.lang.String r5, java.lang.CharSequence... r6) {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            java.lang.String r2 = "%s"
            int r2 = r5.indexOf(r2, r0)
            if (r2 >= 0) goto L18
            java.util.List r6 = r4.f1330a
            int r1 = r5.length()
            java.lang.String r5 = r5.substring(r0, r1)
            r6.add(r5)
            return r4
        L18:
            java.util.List r3 = r4.f1330a
            java.lang.String r0 = r5.substring(r0, r2)
            r3.add(r0)
            java.util.List r0 = r4.f1330a
            int r3 = r1 + 1
            r1 = r6[r1]
            r0.add(r1)
            int r0 = r2 + 2
            r1 = r3
            goto L2
    }

    public int c() {
            r1 = this;
            java.util.List r0 = r1.f1330a
            int r0 = r0.size()
            return r0
    }

    public java.lang.CharSequence d() {
            r2 = this;
            java.util.List r0 = r2.f1330a
            int r1 = r0.size()
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
            java.lang.CharSequence r0 = android.ext.Tools.x(r0)
            return r0
    }
}
