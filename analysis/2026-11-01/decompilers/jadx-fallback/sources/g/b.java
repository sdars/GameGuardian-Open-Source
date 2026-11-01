package g;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    java.io.DataOutputStream f1569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f1570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f1571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f1572g;

    public b(java.io.OutputStream r3, boolean r4, boolean r5) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f1566a = r0
            r0 = 0
            r2.f1567b = r0
            r1 = 8
            r2.f1568c = r1
            java.io.DataOutputStream r1 = new java.io.DataOutputStream
            r1.<init>(r3)
            r2.f1569d = r1
            r2.f1570e = r4
            r2.f1571f = r5
            r2.f1572g = r0
            return
    }

    public static int a(luaj.h r1, java.io.OutputStream r2, boolean r3, boolean r4) {
            g.b r0 = new g.b
            r0.<init>(r2, r3, r4)
            r0.h()
            r2 = 0
            r0.g(r1, r2)
            int r1 = r0.f1572g
            return r1
    }

    void b(int r2) {
            r1 = this;
            java.io.DataOutputStream r0 = r1.f1569d
            r0.write(r2)
            return
    }

    void c(luaj.h r4) {
            r3 = this;
            int[] r0 = r4.f1722b
            int r1 = r0.length
            r3.i(r1)
            boolean r2 = r3.f1571f
            if (r2 == 0) goto Lc
            int[] r0 = new int[r1]
        Lc:
            if (r2 == 0) goto L11
            luaj.g.x(r4, r0)
        L11:
            r4 = 0
        L12:
            if (r4 >= r1) goto L1c
            r2 = r0[r4]
            r3.i(r2)
            int r4 = r4 + 1
            goto L12
        L1c:
            return
    }

    void d(luaj.h r11) {
            r10 = this;
            java.io.DataOutputStream r0 = r10.f1569d
            luaj.LuaValue[] r1 = r11.f1721a
            int r2 = r1.length
            r10.i(r2)
            r3 = 0
            r4 = 0
        La:
            if (r4 >= r2) goto Laf
            r5 = r1[r4]
            int r6 = r5.C2()
            if (r6 == 0) goto La8
            r7 = 1
            if (r6 == r7) goto L9d
            r8 = 4
            r9 = 3
            if (r6 == r9) goto L3e
            if (r6 != r8) goto L27
            r0.write(r8)
            luaj.LuaString r5 = (luaj.LuaString) r5
            r10.j(r5)
            goto Lab
        L27:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "bad type for "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        L3e:
            int r6 = r10.f1567b
            if (r6 == 0) goto L58
            if (r6 == r7) goto L7c
            if (r6 != r8) goto L63
            boolean r6 = r5.h1()
            if (r6 == 0) goto L58
            r6 = -2
            r0.write(r6)
        L50:
            int r5 = r5.y2()
            r10.i(r5)
            goto Lab
        L58:
            r0.write(r9)
            double r5 = r5.x2()
            r10.f(r5)
            goto Lab
        L63:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "number format not supported: "
            r0.append(r1)
            int r1 = r10.f1567b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        L7c:
            boolean r6 = r5.h1()
            if (r6 == 0) goto L86
            r0.write(r9)
            goto L50
        L86:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "not an integer: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        L9d:
            r0.write(r7)
            boolean r5 = r5.w2()
            r10.b(r5)
            goto Lab
        La8:
            r0.write(r3)
        Lab:
            int r4 = r4 + 1
            goto La
        Laf:
            luaj.h[] r0 = r11.f1723c
            int r0 = r0.length
            r10.i(r0)
        Lb5:
            if (r3 >= r0) goto Lc3
            luaj.h[] r1 = r11.f1723c
            r1 = r1[r3]
            luaj.LuaString r2 = r11.f1727g
            r10.g(r1, r2)
            int r3 = r3 + 1
            goto Lb5
        Lc3:
            return
    }

    void e(luaj.h r6, luaj.LuaString r7) {
            r5 = this;
            boolean r0 = r5.f1570e
            r1 = 0
            if (r0 != 0) goto L16
            if (r7 == 0) goto L10
            luaj.LuaString r0 = r6.f1727g
            boolean r7 = r7.P0(r0)
            if (r7 == 0) goto L10
            goto L16
        L10:
            luaj.LuaString r7 = r6.f1727g
            r5.j(r7)
            goto L19
        L16:
            r5.i(r1)
        L19:
            int[] r7 = r6.f1724d
            boolean r0 = r5.f1570e
            if (r0 == 0) goto L21
            r0 = 0
            goto L22
        L21:
            int r0 = r7.length
        L22:
            r5.i(r0)
            r2 = 0
        L26:
            if (r2 >= r0) goto L30
            r3 = r7[r2]
            r5.i(r3)
            int r2 = r2 + 1
            goto L26
        L30:
            f.b[] r7 = r6.f1725e
            boolean r0 = r5.f1570e
            if (r0 == 0) goto L38
            r0 = 0
            goto L39
        L38:
            int r0 = r7.length
        L39:
            r5.i(r0)
            r2 = 0
        L3d:
            if (r2 >= r0) goto L53
            r3 = r7[r2]
            luaj.LuaString r4 = r3.f1556a
            r5.j(r4)
            int r4 = r3.f1557b
            r5.i(r4)
            int r3 = r3.f1558c
            r5.i(r3)
            int r2 = r2 + 1
            goto L3d
        L53:
            f.d[] r6 = r6.f1726f
            boolean r7 = r5.f1570e
            if (r7 == 0) goto L5b
            r7 = 0
            goto L5c
        L5b:
            int r7 = r6.length
        L5c:
            r5.i(r7)
        L5f:
            if (r1 >= r7) goto L6b
            r0 = r6[r1]
            luaj.LuaString r0 = r0.f1563a
            r5.j(r0)
            int r1 = r1 + 1
            goto L5f
        L6b:
            return
    }

    void f(double r2) {
            r1 = this;
            long r2 = java.lang.Double.doubleToLongBits(r2)
            boolean r0 = r1.f1566a
            if (r0 == 0) goto Lc
            long r2 = java.lang.Long.reverseBytes(r2)
        Lc:
            java.io.DataOutputStream r0 = r1.f1569d
            r0.writeLong(r2)
            return
    }

    void g(luaj.h r2, luaj.LuaString r3) {
            r1 = this;
            int r0 = r2.h
            r1.i(r0)
            int r0 = r2.i
            r1.i(r0)
            int r0 = r2.j
            r1.b(r0)
            int r0 = r2.k
            r1.b(r0)
            int r0 = r2.l
            r1.b(r0)
            r1.c(r2)
            r1.d(r2)
            r1.k(r2)
            r1.e(r2, r3)
            return
    }

    void h() {
            r2 = this;
            java.io.DataOutputStream r0 = r2.f1569d
            byte[] r1 = luaj.a.n
            r0.write(r1)
            r1 = 82
            r0.write(r1)
            r1 = 0
            r0.write(r1)
            boolean r1 = r2.f1566a
            r0.write(r1)
            r1 = 4
            r0.write(r1)
            r0.write(r1)
            r0.write(r1)
            int r1 = r2.f1568c
            r0.write(r1)
            int r1 = r2.f1567b
            r0.write(r1)
            byte[] r1 = luaj.a.o
            r0.write(r1)
            return
    }

    void i(int r3) {
            r2 = this;
            java.io.DataOutputStream r0 = r2.f1569d
            boolean r1 = r2.f1566a
            if (r1 == 0) goto La
            int r3 = java.lang.Integer.reverseBytes(r3)
        La:
            r0.writeInt(r3)
            return
    }

    void j(luaj.LuaString r4) {
            r3 = this;
            if (r4 != 0) goto L8
            java.lang.String r4 = ""
            luaj.LuaString r4 = luaj.LuaValue.K2(r4)
        L8:
            luaj.LuaValue r0 = r4.r1()
            int r0 = r0.y2()
            int r1 = r0 + 1
            r3.i(r1)
            java.io.DataOutputStream r1 = r3.f1569d
            r2 = 0
            r4.q3(r1, r2, r0)
            java.io.DataOutputStream r4 = r3.f1569d
            r4.write(r2)
            return
    }

    void k(luaj.h r6) {
            r5 = this;
            java.io.DataOutputStream r0 = r5.f1569d
            f.d[] r6 = r6.f1726f
            int r1 = r6.length
            r5.i(r1)
            r2 = 0
        L9:
            if (r2 >= r1) goto L1a
            r3 = r6[r2]
            boolean r4 = r3.f1564b
            r0.writeByte(r4)
            short r3 = r3.f1565c
            r0.writeByte(r3)
            int r2 = r2 + 1
            goto L9
        L1a:
            return
    }
}
