package d;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class f implements java.lang.Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f1523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f1524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1525c;

    public f(int r2) {
            r1 = this;
            r1.<init>()
            if (r2 != 0) goto Lc
            long[] r2 = d.b.f1513e
            r1.f1523a = r2
            r1.f1524b = r2
            goto L18
        Lc:
            int r2 = d.b.c(r2)
            long[] r0 = new long[r2]
            r1.f1523a = r0
            long[] r2 = new long[r2]
            r1.f1524b = r2
        L18:
            r2 = 0
            r1.f1525c = r2
            return
    }

    public d.f a() {
            r2 = this;
            r0 = 0
            java.lang.Object r1 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L1d
            d.f r1 = (d.f) r1     // Catch: java.lang.CloneNotSupportedException -> L1d
            long[] r0 = r2.f1523a     // Catch: java.lang.CloneNotSupportedException -> L1c
            java.lang.Object r0 = r0.clone()     // Catch: java.lang.CloneNotSupportedException -> L1c
            long[] r0 = (long[]) r0     // Catch: java.lang.CloneNotSupportedException -> L1c
            r1.f1523a = r0     // Catch: java.lang.CloneNotSupportedException -> L1c
            long[] r0 = r2.f1524b     // Catch: java.lang.CloneNotSupportedException -> L1c
            java.lang.Object r0 = r0.clone()     // Catch: java.lang.CloneNotSupportedException -> L1c
            long[] r0 = (long[]) r0     // Catch: java.lang.CloneNotSupportedException -> L1c
            r1.f1524b = r0     // Catch: java.lang.CloneNotSupportedException -> L1c
            goto L1e
        L1c:
            r0 = r1
        L1d:
            r1 = r0
        L1e:
            return r1
    }

    public int b(long r3) {
            r2 = this;
            long[] r0 = r2.f1523a
            int r1 = r2.f1525c
            int r3 = d.b.a(r0, r1, r3)
            return r3
    }

    public long c(int r4) {
            r3 = this;
            long[] r0 = r3.f1523a
            r1 = r0[r4]
            return r1
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            d.f r0 = r1.a()
            return r0
    }

    public boolean d(long r5, long r7) {
            r4 = this;
            long[] r0 = r4.f1523a
            int r1 = r4.f1525c
            int r0 = d.b.a(r0, r1, r5)
            r1 = 1
            if (r0 < 0) goto L18
            long[] r5 = r4.f1524b
            r2 = r5[r0]
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 != 0) goto L15
            r5 = 0
            return r5
        L15:
            r5[r0] = r7
            goto L32
        L18:
            int r0 = ~r0
            long[] r2 = r4.f1523a
            int r3 = r4.f1525c
            long[] r5 = d.d.d(r2, r3, r0, r5)
            r4.f1523a = r5
            long[] r5 = r4.f1524b
            int r6 = r4.f1525c
            long[] r5 = d.d.d(r5, r6, r0, r7)
            r4.f1524b = r5
            int r5 = r4.f1525c
            int r5 = r5 + r1
            r4.f1525c = r5
        L32:
            return r1
    }

    public int e() {
            r1 = this;
            int r0 = r1.f1525c
            return r0
    }

    public void f() {
            r2 = this;
            r0 = 16
            long[] r1 = new long[r0]
            r2.f1523a = r1
            long[] r0 = new long[r0]
            r2.f1524b = r0
            r0 = 0
            r2.f1525c = r0
            return
    }

    public long g(int r4) {
            r3 = this;
            long[] r0 = r3.f1524b
            r1 = r0[r4]
            return r1
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.e()
            if (r0 > 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.f1525c
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r4.f1525c
            if (r1 >= r2) goto L39
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            long r2 = r4.c(r1)
            r0.append(r2)
            r2 = 61
            r0.append(r2)
            long r2 = r4.g(r1)
            r0.append(r2)
            int r1 = r1 + 1
            goto L18
        L39:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
