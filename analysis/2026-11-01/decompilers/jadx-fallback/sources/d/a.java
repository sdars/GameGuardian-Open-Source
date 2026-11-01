package d;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f1505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f1506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean[] f1507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f1508d;

    public a() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public a(int r1) {
            r0 = this;
            r0.<init>()
            int r1 = d.b.c(r1)
            r0.h(r1)
            return
    }

    private void g() {
            r2 = this;
            int r0 = r2.f1508d
            r1 = 6
            if (r0 >= r1) goto L8
            r1 = 12
            goto La
        L8:
            int r1 = r0 >> 1
        La:
            int r0 = r0 + r1
            r2.h(r0)
            return
    }

    private void h(int r8) {
            r7 = this;
            if (r8 != 0) goto L9
            long[] r8 = d.b.f1513e
            int[] r0 = d.b.f1512d
            boolean[] r1 = d.b.f1515g
            goto L15
        L9:
            int r0 = r8 * 2
            long[] r0 = new long[r0]
            int[] r1 = new int[r8]
            boolean[] r8 = new boolean[r8]
            r6 = r1
            r1 = r8
            r8 = r0
            r0 = r6
        L15:
            int r2 = r7.f1508d
            if (r2 == 0) goto L2b
            long[] r3 = r7.f1505a
            int r4 = r2 * 2
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r8, r5, r4)
            int[] r3 = r7.f1506b
            java.lang.System.arraycopy(r3, r5, r0, r5, r2)
            boolean[] r3 = r7.f1507c
            java.lang.System.arraycopy(r3, r5, r1, r5, r2)
        L2b:
            r7.f1505a = r8
            r7.f1506b = r0
            r7.f1507c = r1
            return
    }

    static java.lang.IndexOutOfBoundsException j(int r3, int r4) {
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid index "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ", size is "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public void a(long r4, long r6, int r8, boolean r9) {
            r3 = this;
            int r0 = r3.f1508d
            int[] r1 = r3.f1506b
            int r1 = r1.length
            if (r0 != r1) goto La
            r3.g()
        La:
            long[] r1 = r3.f1505a
            int r2 = r0 * 2
            r1[r2] = r4
            int r2 = r2 + 1
            r1[r2] = r6
            int[] r4 = r3.f1506b
            r4[r0] = r8
            boolean[] r4 = r3.f1507c
            r4[r0] = r9
            int r0 = r0 + 1
            r3.f1508d = r0
            return
    }

    public void b(int r2, boolean r3) {
            r1 = this;
            boolean[] r0 = r1.f1507c
            r0[r2] = r3
            return
    }

    public boolean c(int r2) {
            r1 = this;
            boolean[] r0 = r1.f1507c
            boolean r2 = r0[r2]
            return r2
    }

    public void d() {
            r1 = this;
            r0 = 0
            r1.f1508d = r0
            return
    }

    public void e(int r2) {
            r1 = this;
            int[] r0 = r1.f1506b
            int r0 = r0.length
            if (r0 >= r2) goto L8
            r1.h(r2)
        L8:
            return
    }

    public android.ext.c f(int r8, android.ext.c r9) {
            r7 = this;
            int r0 = r7.f1508d
            if (r8 < r0) goto L7
            j(r8, r0)
        L7:
            if (r9 != 0) goto L1e
            android.ext.c r9 = new android.ext.c
            long[] r0 = r7.f1505a
            int r1 = r8 * 2
            r2 = r0[r1]
            int r1 = r1 + 1
            r4 = r0[r1]
            int[] r0 = r7.f1506b
            r6 = r0[r8]
            r1 = r9
            r1.<init>(r2, r4, r6)
            return r9
        L1e:
            long[] r0 = r7.f1505a
            int r1 = r8 * 2
            r2 = r0[r1]
            r9.f672a = r2
            int r1 = r1 + 1
            r1 = r0[r1]
            r9.f673b = r1
            int[] r0 = r7.f1506b
            r8 = r0[r8]
            r9.f674c = r8
            return r9
    }

    public int i() {
            r1 = this;
            int r0 = r1.f1508d
            return r0
    }

    public void k() {
            r2 = this;
            int r0 = r2.f1508d
            boolean[] r1 = r2.f1507c
            int r1 = r1.length
            if (r0 != r1) goto L8
            return
        L8:
            r2.h(r0)
            return
    }
}
