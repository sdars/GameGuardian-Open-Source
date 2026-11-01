package d;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class e implements java.lang.Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.Object f1517f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f1519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Object[] f1520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean[] f1521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1522e;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            d.e.f1517f = r0
            return
    }

    public e() {
            r1 = this;
            r0 = 16
            r1.<init>(r0)
            return
    }

    public e(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1518a = r0
            if (r3 != 0) goto L15
            long[] r3 = d.b.f1513e
            r2.f1519b = r3
            java.lang.Object[] r3 = d.b.f1514f
            r2.f1520c = r3
            boolean[] r3 = d.b.f1515g
            r2.f1521d = r3
            goto L25
        L15:
            int r3 = d.b.c(r3)
            long[] r1 = new long[r3]
            r2.f1519b = r1
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r2.f1520c = r1
            boolean[] r3 = new boolean[r3]
            r2.f1521d = r3
        L25:
            r2.f1522e = r0
            return
    }

    private void d() {
            r10 = this;
            int r0 = r10.f1522e
            long[] r1 = r10.f1519b
            java.lang.Object[] r2 = r10.f1520c
            boolean[] r3 = r10.f1521d
            r4 = 0
            r5 = 0
            r6 = 0
        Lb:
            if (r5 >= r0) goto L27
            r7 = r2[r5]
            java.lang.Object r8 = d.e.f1517f
            if (r7 == r8) goto L24
            if (r5 == r6) goto L22
            r8 = r1[r5]
            r1[r6] = r8
            r2[r6] = r7
            boolean r7 = r3[r5]
            r3[r6] = r7
            r7 = 0
            r2[r5] = r7
        L22:
            int r6 = r6 + 1
        L24:
            int r5 = r5 + 1
            goto Lb
        L27:
            r10.f1518a = r4
            r10.f1522e = r6
            return
    }

    public boolean a(int r2) {
            r1 = this;
            boolean r0 = r1.f1518a
            if (r0 == 0) goto L7
            r1.d()
        L7:
            boolean[] r0 = r1.f1521d
            boolean r2 = r0[r2]
            return r2
    }

    public d.e b() {
            r2 = this;
            r0 = 0
            java.lang.Object r1 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L27
            d.e r1 = (d.e) r1     // Catch: java.lang.CloneNotSupportedException -> L27
            long[] r0 = r2.f1519b     // Catch: java.lang.CloneNotSupportedException -> L26
            java.lang.Object r0 = r0.clone()     // Catch: java.lang.CloneNotSupportedException -> L26
            long[] r0 = (long[]) r0     // Catch: java.lang.CloneNotSupportedException -> L26
            r1.f1519b = r0     // Catch: java.lang.CloneNotSupportedException -> L26
            java.lang.Object[] r0 = r2.f1520c     // Catch: java.lang.CloneNotSupportedException -> L26
            java.lang.Object r0 = r0.clone()     // Catch: java.lang.CloneNotSupportedException -> L26
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.CloneNotSupportedException -> L26
            r1.f1520c = r0     // Catch: java.lang.CloneNotSupportedException -> L26
            boolean[] r0 = r2.f1521d     // Catch: java.lang.CloneNotSupportedException -> L26
            java.lang.Object r0 = r0.clone()     // Catch: java.lang.CloneNotSupportedException -> L26
            boolean[] r0 = (boolean[]) r0     // Catch: java.lang.CloneNotSupportedException -> L26
            r1.f1521d = r0     // Catch: java.lang.CloneNotSupportedException -> L26
            goto L28
        L26:
            r0 = r1
        L27:
            r1 = r0
        L28:
            return r1
    }

    public java.lang.Object c(long r3) {
            r2 = this;
            long[] r0 = r2.f1519b
            int r1 = r2.f1522e
            int r3 = d.b.a(r0, r1, r3)
            if (r3 < 0) goto L18
            java.lang.Object[] r4 = r2.f1520c
            r0 = r4[r3]
            java.lang.Object r1 = d.e.f1517f
            if (r0 == r1) goto L18
            r4[r3] = r1
            r3 = 1
            r2.f1518a = r3
            return r0
        L18:
            r3 = 0
            return r3
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            d.e r0 = r1.b()
            return r0
    }

    public java.lang.Object e(long r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.f(r2, r0)
            return r2
    }

    public java.lang.Object f(long r3, java.lang.Object r5) {
            r2 = this;
            long[] r0 = r2.f1519b
            int r1 = r2.f1522e
            int r3 = d.b.a(r0, r1, r3)
            if (r3 < 0) goto L14
            java.lang.Object[] r4 = r2.f1520c
            r3 = r4[r3]
            java.lang.Object r4 = d.e.f1517f
            if (r3 != r4) goto L13
            goto L14
        L13:
            return r3
        L14:
            return r5
    }

    public int g(long r3) {
            r2 = this;
            boolean r0 = r2.f1518a
            if (r0 == 0) goto L7
            r2.d()
        L7:
            long[] r0 = r2.f1519b
            int r1 = r2.f1522e
            int r3 = d.b.a(r0, r1, r3)
            return r3
    }

    public long h(int r4) {
            r3 = this;
            boolean r0 = r3.f1518a
            if (r0 == 0) goto L7
            r3.d()
        L7:
            long[] r0 = r3.f1519b
            r1 = r0[r4]
            return r1
    }

    public java.lang.Object i(long r9, java.lang.Object r11, byte r12) {
            r8 = this;
            long[] r0 = r8.f1519b
            int r1 = r8.f1522e
            int r0 = d.b.a(r0, r1, r9)
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L1c
            java.lang.Object[] r9 = r8.f1520c
            r10 = r9[r0]
            r9[r0] = r11
            if (r12 == 0) goto L1b
            boolean[] r9 = r8.f1521d
            if (r12 != r2) goto L19
            r1 = 1
        L19:
            r9[r0] = r1
        L1b:
            return r10
        L1c:
            int r0 = ~r0
            int r3 = r8.f1522e
            r4 = 0
            if (r0 >= r3) goto L3a
            java.lang.Object[] r5 = r8.f1520c
            r6 = r5[r0]
            java.lang.Object r7 = d.e.f1517f
            if (r6 != r7) goto L3a
            long[] r3 = r8.f1519b
            r3[r0] = r9
            r5[r0] = r11
            if (r12 == 0) goto L39
            boolean[] r9 = r8.f1521d
            if (r12 != r2) goto L37
            r1 = 1
        L37:
            r9[r0] = r1
        L39:
            return r4
        L3a:
            boolean r5 = r8.f1518a
            if (r5 == 0) goto L4f
            long[] r5 = r8.f1519b
            int r5 = r5.length
            if (r3 < r5) goto L4f
            r8.d()
            long[] r0 = r8.f1519b
            int r3 = r8.f1522e
            int r0 = d.b.a(r0, r3, r9)
            int r0 = ~r0
        L4f:
            long[] r3 = r8.f1519b
            int r5 = r8.f1522e
            long[] r9 = d.d.d(r3, r5, r0, r9)
            r8.f1519b = r9
            java.lang.Object[] r9 = r8.f1520c
            int r10 = r8.f1522e
            java.lang.Object[] r9 = d.d.e(r9, r10, r0, r11)
            r8.f1520c = r9
            boolean[] r9 = r8.f1521d
            int r10 = r8.f1522e
            if (r12 != r2) goto L6a
            r1 = 1
        L6a:
            boolean[] r9 = d.d.f(r9, r10, r0, r1)
            r8.f1521d = r9
            int r9 = r8.f1522e
            int r9 = r9 + r2
            r8.f1522e = r9
            return r4
    }

    public java.lang.Object j(int r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.f1520c
            r1 = r0[r4]
            java.lang.Object r2 = d.e.f1517f
            if (r1 == r2) goto Le
            r0[r4] = r2
            r4 = 1
            r3.f1518a = r4
            return r1
        Le:
            r4 = 0
            return r4
    }

    public void k(int r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.f1518a
            if (r0 == 0) goto L7
            r1.d()
        L7:
            boolean[] r0 = r1.f1521d
            r0[r2] = r3
            return
    }

    public int l() {
            r1 = this;
            boolean r0 = r1.f1518a
            if (r0 == 0) goto L7
            r1.d()
        L7:
            int r0 = r1.f1522e
            return r0
    }

    public void m() {
            r2 = this;
            r0 = 16
            long[] r1 = new long[r0]
            r2.f1519b = r1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2.f1520c = r1
            boolean[] r0 = new boolean[r0]
            r2.f1521d = r0
            r0 = 0
            r2.f1522e = r0
            r2.f1518a = r0
            return
    }

    public java.lang.Object n(int r2) {
            r1 = this;
            boolean r0 = r1.f1518a
            if (r0 == 0) goto L7
            r1.d()
        L7:
            java.lang.Object[] r0 = r1.f1520c
            r2 = r0[r2]
            return r2
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.l()
            if (r0 > 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.f1522e
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r4.f1522e
            if (r1 >= r2) goto L52
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            long r2 = r4.h(r1)
            r0.append(r2)
            r2 = 61
            r0.append(r2)
            java.lang.Object r2 = r4.n(r1)
            if (r2 == r4) goto L39
            r0.append(r2)
            goto L3e
        L39:
            java.lang.String r2 = "(this Map)"
            r0.append(r2)
        L3e:
            java.lang.String r2 = " ["
            r0.append(r2)
            boolean r2 = r4.a(r1)
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            int r1 = r1 + 1
            goto L18
        L52:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
