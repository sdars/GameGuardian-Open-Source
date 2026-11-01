package d;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f1509a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final android.view.View[] f1510b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f1511c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f1512d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f1513e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.lang.Object[] f1514f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean[] f1515g = null;

    static {
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            d.b.f1509a = r1
            byte[] r1 = new byte[r0]
            d.b.f1511c = r1
            int[] r1 = new int[r0]
            d.b.f1512d = r1
            long[] r1 = new long[r0]
            d.b.f1513e = r1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            d.b.f1514f = r1
            boolean[] r1 = new boolean[r0]
            d.b.f1515g = r1
            android.view.View[] r0 = new android.view.View[r0]
            d.b.f1510b = r0
            return
    }

    static int a(long[] r5, int r6, long r7) {
            int r6 = r6 + (-1)
            r0 = 0
        L3:
            if (r0 > r6) goto L1a
            int r1 = r0 + r6
            int r1 = r1 >>> 1
            r2 = r5[r1]
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 >= 0) goto L13
            int r1 = r1 + 1
            r0 = r1
            goto L3
        L13:
            if (r4 <= 0) goto L19
            int r1 = r1 + (-1)
            r6 = r1
            goto L3
        L19:
            return r1
        L1a:
            int r5 = ~r0
            return r5
    }

    public static int b(int r2) {
            r0 = 4
        L1:
            r1 = 32
            if (r0 >= r1) goto Lf
            r1 = 1
            int r1 = r1 << r0
            int r1 = r1 + (-12)
            if (r2 > r1) goto Lc
            return r1
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            return r2
    }

    public static int c(int r0) {
            int r0 = r0 * 8
            int r0 = b(r0)
            int r0 = r0 / 8
            return r0
    }
}
