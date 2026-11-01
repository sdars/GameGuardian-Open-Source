package a;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class f {
    public static java.lang.Object a(java.lang.Object r1) {
            if (r1 == 0) goto L18
            boolean r0 = a.b.e()
            if (r0 == 0) goto L18
            boolean r0 = r1 instanceof android.view.LayoutInflater
            if (r0 == 0) goto L18
            boolean r0 = r1 instanceof a.d
            if (r0 != 0) goto L18
            a.d r0 = new a.d
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            r0.<init>(r1)
            r1 = r0
        L18:
            return r1
    }
}
