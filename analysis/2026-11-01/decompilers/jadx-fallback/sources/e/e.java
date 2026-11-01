package e;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f1537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f1538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f1539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int[] f1541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int[] f1542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f1543g;
    protected int h;
    protected boolean i;
    protected boolean j;
    protected java.io.Reader k;
    protected char[] l;
    protected int m;
    protected int n;
    protected int o;

    public e(java.io.InputStream r7, java.lang.String r8, int r9, int r10) {
            r6 = this;
            r5 = 4096(0x1000, float:5.74E-42)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public e(java.io.InputStream r2, java.lang.String r3, int r4, int r5, int r6) {
            r1 = this;
            if (r3 != 0) goto L8
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            r3.<init>(r2)
            goto Le
        L8:
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r2, r3)
            r3 = r0
        Le:
            r1.<init>(r3, r4, r5, r6)
            return
    }

    public e(java.io.Reader r2, int r3, int r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f1540d = r0
            r0 = 0
            r1.i = r0
            r1.j = r0
            r1.m = r0
            r1.n = r0
            r0 = 8
            r1.o = r0
            r1.k = r2
            r1.h = r3
            int r4 = r4 + (-1)
            r1.f1543g = r4
            r1.f1537a = r5
            r1.f1538b = r5
            char[] r2 = new char[r5]
            r1.l = r2
            int[] r2 = new int[r5]
            r1.f1541e = r2
            int[] r2 = new int[r5]
            r1.f1542f = r2
            return
    }

    public char a() {
            r2 = this;
            r0 = -1
            r2.f1539c = r0
            char r0 = r2.k()
            int r1 = r2.f1540d
            r2.f1539c = r1
            return r0
    }

    protected void b(boolean r7) {
            r6 = this;
            int r0 = r6.f1537a
            int r1 = r0 + 2048
            char[] r1 = new char[r1]
            int r2 = r0 + 2048
            int[] r2 = new int[r2]
            int r3 = r0 + 2048
            int[] r3 = new int[r3]
            r4 = 0
            if (r7 == 0) goto L66
            char[] r7 = r6.l     // Catch: java.lang.Throwable -> L64
            int r5 = r6.f1539c     // Catch: java.lang.Throwable -> L64
            int r0 = r0 - r5
            java.lang.System.arraycopy(r7, r5, r1, r4, r0)     // Catch: java.lang.Throwable -> L64
            char[] r7 = r6.l     // Catch: java.lang.Throwable -> L64
            int r0 = r6.f1537a     // Catch: java.lang.Throwable -> L64
            int r5 = r6.f1539c     // Catch: java.lang.Throwable -> L64
            int r0 = r0 - r5
            int r5 = r6.f1540d     // Catch: java.lang.Throwable -> L64
            java.lang.System.arraycopy(r7, r4, r1, r0, r5)     // Catch: java.lang.Throwable -> L64
            r6.l = r1     // Catch: java.lang.Throwable -> L64
            int[] r7 = r6.f1541e     // Catch: java.lang.Throwable -> L64
            int r0 = r6.f1539c     // Catch: java.lang.Throwable -> L64
            int r1 = r6.f1537a     // Catch: java.lang.Throwable -> L64
            int r1 = r1 - r0
            java.lang.System.arraycopy(r7, r0, r2, r4, r1)     // Catch: java.lang.Throwable -> L64
            int[] r7 = r6.f1541e     // Catch: java.lang.Throwable -> L64
            int r0 = r6.f1537a     // Catch: java.lang.Throwable -> L64
            int r1 = r6.f1539c     // Catch: java.lang.Throwable -> L64
            int r0 = r0 - r1
            int r1 = r6.f1540d     // Catch: java.lang.Throwable -> L64
            java.lang.System.arraycopy(r7, r4, r2, r0, r1)     // Catch: java.lang.Throwable -> L64
            r6.f1541e = r2     // Catch: java.lang.Throwable -> L64
            int[] r7 = r6.f1542f     // Catch: java.lang.Throwable -> L64
            int r0 = r6.f1539c     // Catch: java.lang.Throwable -> L64
            int r1 = r6.f1537a     // Catch: java.lang.Throwable -> L64
            int r1 = r1 - r0
            java.lang.System.arraycopy(r7, r0, r3, r4, r1)     // Catch: java.lang.Throwable -> L64
            int[] r7 = r6.f1542f     // Catch: java.lang.Throwable -> L64
            int r0 = r6.f1537a     // Catch: java.lang.Throwable -> L64
            int r1 = r6.f1539c     // Catch: java.lang.Throwable -> L64
            int r0 = r0 - r1
            int r1 = r6.f1540d     // Catch: java.lang.Throwable -> L64
            java.lang.System.arraycopy(r7, r4, r3, r0, r1)     // Catch: java.lang.Throwable -> L64
            r6.f1542f = r3     // Catch: java.lang.Throwable -> L64
            int r7 = r6.f1540d     // Catch: java.lang.Throwable -> L64
            int r0 = r6.f1537a     // Catch: java.lang.Throwable -> L64
            int r1 = r6.f1539c     // Catch: java.lang.Throwable -> L64
            int r0 = r0 - r1
            int r7 = r7 + r0
            r6.f1540d = r7     // Catch: java.lang.Throwable -> L64
        L61:
            r6.m = r7     // Catch: java.lang.Throwable -> L64
            goto L90
        L64:
            r7 = move-exception
            goto L9b
        L66:
            char[] r7 = r6.l     // Catch: java.lang.Throwable -> L64
            int r5 = r6.f1539c     // Catch: java.lang.Throwable -> L64
            int r0 = r0 - r5
            java.lang.System.arraycopy(r7, r5, r1, r4, r0)     // Catch: java.lang.Throwable -> L64
            r6.l = r1     // Catch: java.lang.Throwable -> L64
            int[] r7 = r6.f1541e     // Catch: java.lang.Throwable -> L64
            int r0 = r6.f1539c     // Catch: java.lang.Throwable -> L64
            int r1 = r6.f1537a     // Catch: java.lang.Throwable -> L64
            int r1 = r1 - r0
            java.lang.System.arraycopy(r7, r0, r2, r4, r1)     // Catch: java.lang.Throwable -> L64
            r6.f1541e = r2     // Catch: java.lang.Throwable -> L64
            int[] r7 = r6.f1542f     // Catch: java.lang.Throwable -> L64
            int r0 = r6.f1539c     // Catch: java.lang.Throwable -> L64
            int r1 = r6.f1537a     // Catch: java.lang.Throwable -> L64
            int r1 = r1 - r0
            java.lang.System.arraycopy(r7, r0, r3, r4, r1)     // Catch: java.lang.Throwable -> L64
            r6.f1542f = r3     // Catch: java.lang.Throwable -> L64
            int r7 = r6.f1540d     // Catch: java.lang.Throwable -> L64
            int r0 = r6.f1539c     // Catch: java.lang.Throwable -> L64
            int r7 = r7 - r0
            r6.f1540d = r7     // Catch: java.lang.Throwable -> L64
            goto L61
        L90:
            int r7 = r6.f1537a
            int r7 = r7 + 2048
            r6.f1537a = r7
            r6.f1538b = r7
            r6.f1539c = r4
            return
        L9b:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r7 = r7.getMessage()
            r0.<init>(r7)
            throw r0
    }

    protected void c() {
            r7 = this;
            int r0 = r7.m
            int r1 = r7.f1538b
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L33
            int r0 = r7.f1537a
            r4 = 2048(0x800, float:2.87E-42)
            if (r1 != r0) goto L24
            int r0 = r7.f1539c
            if (r0 <= r4) goto L19
            r7.m = r3
            r7.f1540d = r3
        L16:
            r7.f1538b = r0
            goto L33
        L19:
            if (r0 >= 0) goto L20
            r7.m = r3
            r7.f1540d = r3
            goto L33
        L20:
            r7.b(r3)
            goto L33
        L24:
            int r5 = r7.f1539c
            if (r1 <= r5) goto L29
            goto L16
        L29:
            int r0 = r5 - r1
            if (r0 >= r4) goto L31
            r7.b(r2)
            goto L33
        L31:
            r7.f1538b = r5
        L33:
            r0 = -1
            java.io.Reader r1 = r7.k     // Catch: java.io.IOException -> L49
            char[] r4 = r7.l     // Catch: java.io.IOException -> L49
            int r5 = r7.m     // Catch: java.io.IOException -> L49
            int r6 = r7.f1538b     // Catch: java.io.IOException -> L49
            int r6 = r6 - r5
            int r1 = r1.read(r4, r5, r6)     // Catch: java.io.IOException -> L49
            if (r1 == r0) goto L4b
            int r4 = r7.m     // Catch: java.io.IOException -> L49
            int r4 = r4 + r1
            r7.m = r4     // Catch: java.io.IOException -> L49
            return
        L49:
            r1 = move-exception
            goto L56
        L4b:
            java.io.Reader r1 = r7.k     // Catch: java.io.IOException -> L49
            r1.close()     // Catch: java.io.IOException -> L49
            java.io.IOException r1 = new java.io.IOException     // Catch: java.io.IOException -> L49
            r1.<init>()     // Catch: java.io.IOException -> L49
            throw r1     // Catch: java.io.IOException -> L49
        L56:
            int r4 = r7.f1540d
            int r4 = r4 - r2
            r7.f1540d = r4
            r7.f(r3)
            int r2 = r7.f1539c
            if (r2 != r0) goto L66
            int r0 = r7.f1540d
            r7.f1539c = r0
        L66:
            throw r1
    }

    public java.lang.String d() {
            r5 = this;
            int r0 = r5.f1540d
            int r1 = r5.f1539c
            if (r0 < r1) goto L11
            java.lang.String r2 = new java.lang.String
            char[] r3 = r5.l
            int r0 = r0 - r1
            int r0 = r0 + 1
            r2.<init>(r3, r1, r0)
            return r2
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = new java.lang.String
            char[] r2 = r5.l
            int r3 = r5.f1539c
            int r4 = r5.f1537a
            int r4 = r4 - r3
            r1.<init>(r2, r3, r4)
            r0.append(r1)
            java.lang.String r1 = new java.lang.String
            char[] r2 = r5.l
            int r3 = r5.f1540d
            int r3 = r3 + 1
            r4 = 0
            r1.<init>(r2, r4, r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    protected void e(char r5) {
            r4 = this;
            int r0 = r4.f1543g
            r1 = 1
            int r0 = r0 + r1
            r4.f1543g = r0
            boolean r0 = r4.j
            r2 = 10
            r3 = 0
            if (r0 == 0) goto L17
            r4.j = r3
        Lf:
            int r0 = r4.h
            r4.f1543g = r1
            int r0 = r0 + r1
            r4.h = r0
            goto L21
        L17:
            boolean r0 = r4.i
            if (r0 == 0) goto L21
            r4.i = r3
            if (r5 != r2) goto Lf
            r4.j = r1
        L21:
            r0 = 9
            if (r5 == r0) goto L32
            if (r5 == r2) goto L2f
            r0 = 13
            if (r5 == r0) goto L2c
            goto L3f
        L2c:
            r4.i = r1
            goto L3f
        L2f:
            r4.j = r1
            goto L3f
        L32:
            int r5 = r4.f1543g
            int r5 = r5 - r1
            r4.f1543g = r5
            int r0 = r4.o
            int r1 = r5 % r0
            int r0 = r0 - r1
            int r5 = r5 + r0
            r4.f1543g = r5
        L3f:
            int[] r5 = r4.f1541e
            int r0 = r4.f1540d
            int r1 = r4.h
            r5[r0] = r1
            int[] r5 = r4.f1542f
            int r1 = r4.f1543g
            r5[r0] = r1
            return
    }

    public void f(int r2) {
            r1 = this;
            int r0 = r1.n
            int r0 = r0 + r2
            r1.n = r0
            int r0 = r1.f1540d
            int r0 = r0 - r2
            r1.f1540d = r0
            if (r0 >= 0) goto L11
            int r2 = r1.f1537a
            int r0 = r0 + r2
            r1.f1540d = r0
        L11:
            return
    }

    public int g() {
            r2 = this;
            int[] r0 = r2.f1542f
            int r1 = r2.f1539c
            r0 = r0[r1]
            return r0
    }

    public int h() {
            r2 = this;
            int[] r0 = r2.f1541e
            int r1 = r2.f1539c
            r0 = r0[r1]
            return r0
    }

    public int i() {
            r2 = this;
            int[] r0 = r2.f1542f
            int r1 = r2.f1540d
            r0 = r0[r1]
            return r0
    }

    public int j() {
            r2 = this;
            int[] r0 = r2.f1541e
            int r1 = r2.f1540d
            r0 = r0[r1]
            return r0
    }

    public char k() {
            r2 = this;
            int r0 = r2.n
            if (r0 <= 0) goto L1c
            int r0 = r0 + (-1)
            r2.n = r0
            int r0 = r2.f1540d
            int r0 = r0 + 1
            r2.f1540d = r0
            int r1 = r2.f1537a
            if (r0 != r1) goto L15
            r0 = 0
            r2.f1540d = r0
        L15:
            char[] r0 = r2.l
            int r1 = r2.f1540d
            char r0 = r0[r1]
            return r0
        L1c:
            int r0 = r2.f1540d
            int r0 = r0 + 1
            r2.f1540d = r0
            int r1 = r2.m
            if (r0 < r1) goto L29
            r2.c()
        L29:
            char[] r0 = r2.l
            int r1 = r2.f1540d
            char r0 = r0[r1]
            r2.e(r0)
            return r0
    }
}
