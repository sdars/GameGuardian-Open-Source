package g;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class c extends g.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    luaj.h f1573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    java.util.Hashtable f1574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    g.c f1575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g.g f1576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    g.c.a f1577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f1578g;
    int h;
    g.e i;
    int j;
    int k;
    int l;
    short m;
    short n;
    short o;
    short p;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g.c.a f1579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        short f1580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        short f1581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        short f1582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f1583e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f1584f;

        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "BlockCnt [firstlabel="
                r0.append(r1)
                short r1 = r2.f1580b
                r0.append(r1)
                java.lang.String r1 = ", firstgoto="
                r0.append(r1)
                short r1 = r2.f1581c
                r0.append(r1)
                java.lang.String r1 = ", nactvar="
                r0.append(r1)
                short r1 = r2.f1582d
                r0.append(r1)
                java.lang.String r1 = ", upval="
                r0.append(r1)
                boolean r1 = r2.f1583e
                r0.append(r1)
                java.lang.String r1 = ", isloop="
                r0.append(r1)
                boolean r1 = r2.f1584f
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    c() {
            r0 = this;
            r0.<init>()
            return
    }

    static int k1(g.c r2, luaj.LuaString r3, g.g.k r4, int r5) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            int r1 = r2.e1(r3)
            if (r1 < 0) goto L14
            r3 = 7
            r4.b(r3, r1)
            if (r5 != 0) goto L13
            r2.L0(r1)
        L13:
            return r3
        L14:
            int r5 = r2.d1(r3)
            if (r5 >= 0) goto L27
            g.c r5 = r2.f1575d
            int r5 = k1(r5, r3, r4, r0)
            if (r5 != 0) goto L23
            return r0
        L23:
            int r5 = r2.O0(r3, r4)
        L27:
            r2 = 8
            r4.b(r2, r5)
            return r2
    }

    static boolean n1(int r1) {
            r0 = 6
            if (r1 == r0) goto L9
            r0 = 7
            if (r1 != r0) goto L7
            goto L9
        L7:
            r1 = 0
            goto La
        L9:
            r1 = 1
        La:
            return r1
    }

    f.b A0(int r3) {
            r2 = this;
            g.g r0 = r2.f1576e
            g.g$d r0 = r0.l
            g.g$j[] r0 = r0.f1601a
            int r1 = r2.l
            int r1 = r1 + r3
            r3 = r0[r1]
            short r3 = r3.f1619a
            short r0 = r2.m
            if (r3 >= r0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            g.a.C(r0)
            luaj.h r0 = r2.f1573b
            f.b[] r0 = r0.f1725e
            r3 = r0[r3]
            return r3
    }

    void B0(g.g.k r5) {
            r4 = this;
            r4.i0(r5)
            int r0 = r5.f1620a
            r1 = -1
            r2 = 1
            if (r0 == r2) goto L1a
            r3 = 3
            if (r0 == r3) goto L1a
            r3 = 10
            if (r0 == r3) goto L15
            int r0 = r4.I0(r5, r2)
            goto L1b
        L15:
            g.g$k$a r0 = r5.f1621b
            int r0 = r0.f1628e
            goto L1b
        L1a:
            r0 = -1
        L1b:
            g.e r2 = r5.f1622c
            r4.c0(r2, r0)
            g.e r0 = r5.f1623d
            int r0 = r0.f1587a
            r4.W0(r0)
            g.e r5 = r5.f1623d
            r5.f1587a = r1
            return
    }

    void C0(g.g.k r4) {
            r3 = this;
            r3.i0(r4)
            int r0 = r4.f1620a
            r1 = 2
            r2 = -1
            if (r0 == r1) goto L21
            r1 = 10
            if (r0 == r1) goto L19
            r1 = 4
            if (r0 == r1) goto L21
            r1 = 5
            if (r0 == r1) goto L21
            r0 = 0
            int r0 = r3.I0(r4, r0)
            goto L22
        L19:
            r3.G0(r4)
            g.g$k$a r0 = r4.f1621b
            int r0 = r0.f1628e
            goto L22
        L21:
            r0 = -1
        L22:
            g.e r1 = r4.f1623d
            r3.c0(r1, r0)
            g.e r0 = r4.f1622c
            int r0 = r0.f1587a
            r3.W0(r0)
            g.e r4 = r4.f1622c
            r4.f1587a = r2
            return
    }

    boolean D0(int r2) {
            r1 = this;
            r0 = 12
            if (r2 == r0) goto Lb
            r0 = 13
            if (r2 != r0) goto L9
            goto Lb
        L9:
            r2 = 0
            goto Lc
        Lb:
            r2 = 1
        Lc:
            return r2
    }

    void E0(g.g.k r3, g.g.k r4) {
            r2 = this;
            g.g$k$a r0 = r3.f1621b
            int r1 = r0.f1628e
            short r1 = (short) r1
            r0.f1625b = r1
            int r4 = r2.l0(r4)
            short r4 = (short) r4
            r0.f1624a = r4
            int r4 = r3.f1620a
            r0 = 8
            if (r4 == r0) goto L1d
            boolean r4 = n1(r4)
            if (r4 == 0) goto L1b
            goto L1d
        L1b:
            r4 = 0
            goto L1e
        L1d:
            r4 = 1
        L1e:
            g.a.C(r4)
            g.g$k$a r4 = r3.f1621b
            int r1 = r3.f1620a
            if (r1 != r0) goto L28
            goto L29
        L28:
            r0 = 7
        L29:
            short r0 = (short) r0
            r4.f1626c = r0
            r4 = 9
            r3.f1620a = r4
            return
    }

    void F0(int r1, g.g.k r2) {
            r0 = this;
            switch(r1) {
                case 0: goto L16;
                case 1: goto L16;
                case 2: goto L16;
                case 3: goto L16;
                case 4: goto L16;
                case 5: goto L16;
                case 6: goto L12;
                default: goto L3;
            }
        L3:
            switch(r1) {
                case 13: goto Le;
                case 14: goto La;
                case 15: goto L16;
                case 16: goto L16;
                case 17: goto L16;
                case 18: goto L16;
                case 19: goto L16;
                case 20: goto L16;
                default: goto L6;
            }
        L6:
            r0.l0(r2)
            goto L1d
        La:
            r0.B0(r2)
            goto L1d
        Le:
            r0.C0(r2)
            goto L1d
        L12:
            r0.o0(r2)
            goto L1d
        L16:
            boolean r1 = r2.c()
            if (r1 != 0) goto L1d
            goto L6
        L1d:
            return
    }

    void G0(g.g.k r5) {
            r4 = this;
            g.g$k$a r5 = r5.f1621b
            int r5 = r5.f1628e
            g.d r5 = r4.y0(r5)
            int r0 = r5.a()
            int r0 = luaj.b.i(r0)
            boolean r0 = luaj.b.r(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L32
            int r0 = r5.a()
            int r0 = luaj.b.i(r0)
            r3 = 28
            if (r0 == r3) goto L32
            int r0 = r5.a()
            int r0 = luaj.b.i(r0)
            r3 = 27
            if (r0 == r3) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            g.a.C(r0)
            int r0 = r5.a()
            int r0 = luaj.b.c(r0)
            if (r0 == 0) goto L41
            goto L42
        L41:
            r1 = 1
        L42:
            g.a.v(r5, r1)
            return
    }

    int H0() {
            r5 = this;
            g.e r0 = r5.i
            int r1 = r0.f1587a
            r2 = -1
            r0.f1587a = r2
            g.e r0 = new g.e
            r3 = 23
            r4 = 0
            int r2 = r5.V(r3, r4, r2)
            r0.<init>(r2)
            r5.c0(r0, r1)
            int r0 = r0.f1587a
            return r0
    }

    int I0(g.g.k r4, int r5) {
            r3 = this;
            int r0 = r4.f1620a
            r1 = 11
            if (r0 != r1) goto L27
            int r0 = r3.v0(r4)
            int r1 = luaj.b.i(r0)
            r2 = 20
            if (r1 != r2) goto L27
            int r4 = r3.f1578g
            r1 = 1
            int r4 = r4 - r1
            r3.f1578g = r4
            int r4 = luaj.b.e(r0)
            r0 = 0
            if (r5 == 0) goto L20
            r1 = 0
        L20:
            r5 = 27
            int r4 = r3.d0(r5, r4, r0, r1)
            return r4
        L27:
            r3.f0(r4)
            r3.t0(r4)
            g.g$k$a r4 = r4.f1621b
            int r4 = r4.f1628e
            r0 = 28
            r1 = 255(0xff, float:3.57E-43)
            int r4 = r3.d0(r0, r1, r4, r5)
            return r4
    }

    void J0(g.g.c r4) {
            r3 = this;
            int r0 = r4.f1600e
            if (r0 != 0) goto L5
            return
        L5:
            g.g$k r0 = r4.f1596a
            int r0 = r0.f1620a
            boolean r0 = r3.D0(r0)
            if (r0 == 0) goto L27
            g.g$k r0 = r4.f1596a
            r3.h1(r0)
            g.g$k r0 = r4.f1597b
            g.g$k$a r0 = r0.f1621b
            int r0 = r0.f1628e
            int r1 = r4.f1599d
            r2 = -1
            r3.g1(r0, r1, r2)
            int r0 = r4.f1599d
            int r0 = r0 + (-1)
            r4.f1599d = r0
            goto L3d
        L27:
            g.g$k r0 = r4.f1596a
            int r1 = r0.f1620a
            if (r1 == 0) goto L30
            r3.o0(r0)
        L30:
            g.g$k r0 = r4.f1597b
            g.g$k$a r0 = r0.f1621b
            int r0 = r0.f1628e
            int r1 = r4.f1599d
            int r4 = r4.f1600e
            r3.g1(r0, r1, r4)
        L3d:
            return
    }

    void K0() {
            r5 = this;
            g.c$a r0 = r5.f1577f
            g.c$a r1 = r0.f1579a
            if (r1 == 0) goto L16
            boolean r1 = r0.f1583e
            if (r1 == 0) goto L16
            int r1 = r5.H0()
            short r2 = r0.f1582d
            r5.S0(r1, r2)
            r5.W0(r1)
        L16:
            boolean r1 = r0.f1584f
            if (r1 == 0) goto L1f
            g.g r1 = r5.f1576e
            r1.V()
        L1f:
            g.c$a r1 = r0.f1579a
            r5.f1577f = r1
            short r1 = r0.f1582d
            r5.a1(r1)
            short r1 = r0.f1582d
            short r2 = r5.n
            if (r1 != r2) goto L30
            r1 = 1
            goto L31
        L30:
            r1 = 0
        L31:
            g.a.C(r1)
            short r1 = r5.n
            r5.p = r1
            g.g r1 = r5.f1576e
            g.g$d r2 = r1.l
            short r3 = r0.f1580b
            r2.f1606f = r3
            g.c$a r3 = r0.f1579a
            if (r3 == 0) goto L48
            r5.M0(r0)
            goto L55
        L48:
            short r3 = r0.f1581c
            int r4 = r2.f1604d
            if (r3 >= r4) goto L55
            g.g$f[] r2 = r2.f1603c
            r2 = r2[r3]
            r1.O1(r2, r5, r0)
        L55:
            return
    }

    void L0(int r3) {
            r2 = this;
            g.c$a r0 = r2.f1577f
        L2:
            short r1 = r0.f1582d
            if (r1 <= r3) goto L9
            g.c$a r0 = r0.f1579a
            goto L2
        L9:
            r3 = 1
            r0.f1583e = r3
            return
    }

    int M(luaj.LuaValue r6) {
            r5 = this;
            java.util.Hashtable r0 = r5.f1574c
            if (r0 != 0) goto Lc
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r5.f1574c = r0
            goto L19
        Lc:
            java.lang.Object r1 = r0.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L19
            int r6 = r1.intValue()
            return r6
        L19:
            int r1 = r5.j
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.put(r6, r2)
            luaj.h r0 = r5.f1573b
            luaj.LuaValue[] r2 = r0.f1721a
            if (r2 == 0) goto L2f
            int r3 = r5.j
            int r3 = r3 + 1
            int r4 = r2.length
            if (r3 < r4) goto L3b
        L2f:
            int r3 = r5.j
            int r3 = r3 * 2
            int r3 = r3 + 1
            luaj.LuaValue[] r2 = g.a.K(r2, r3)
            r0.f1721a = r2
        L3b:
            luaj.LuaValue[] r0 = r0.f1721a
            int r2 = r5.j
            int r3 = r2 + 1
            r5.j = r3
            r0[r2] = r6
            return r1
    }

    void M0(g.c.a r6) {
            r5 = this;
            short r0 = r6.f1581c
            g.g r1 = r5.f1576e
            g.g$d r1 = r1.l
            g.g$f[] r1 = r1.f1603c
        L8:
            g.g r2 = r5.f1576e
            g.g$d r2 = r2.l
            int r2 = r2.f1604d
            if (r0 >= r2) goto L30
            r2 = r1[r0]
            short r3 = r2.f1612d
            short r4 = r6.f1582d
            if (r3 <= r4) goto L25
            boolean r3 = r6.f1583e
            if (r3 == 0) goto L21
            int r3 = r2.f1610b
            r5.S0(r3, r4)
        L21:
            short r3 = r6.f1582d
            r2.f1612d = r3
        L25:
            g.g r2 = r5.f1576e
            boolean r2 = r2.v0(r0)
            if (r2 != 0) goto L8
            int r0 = r0 + 1
            goto L8
        L30:
            return
    }

    int N(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            luaj.LuaBoolean r1 = luaj.LuaValue.f1672d
            goto L7
        L5:
            luaj.LuaBoolean r1 = luaj.LuaValue.f1673e
        L7:
            int r1 = r0.M(r1)
            return r1
    }

    boolean N0(int r3) {
            r2 = this;
        L0:
            r0 = -1
            if (r3 == r0) goto L1a
            g.d r0 = r2.y0(r3)
            int r0 = r0.a()
            int r0 = luaj.b.i(r0)
            r1 = 28
            if (r0 == r1) goto L15
            r3 = 1
            return r3
        L15:
            int r3 = r2.x0(r3)
            goto L0
        L1a:
            r3 = 0
            return r3
    }

    void O(int r1, int r2, java.lang.String r3) {
            r0 = this;
            if (r1 <= r2) goto L5
            r0.k0(r2, r3)
        L5:
            return
    }

    int O0(luaj.LuaString r7, g.g.k r8) {
            r6 = this;
            short r0 = r6.o
            r1 = 1
            int r0 = r0 + r1
            r2 = 255(0xff, float:3.57E-43)
            java.lang.String r3 = "upvalues"
            r6.O(r0, r2, r3)
            luaj.h r0 = r6.f1573b
            f.d[] r2 = r0.f1726f
            if (r2 == 0) goto L17
            short r3 = r6.o
            int r3 = r3 + r1
            int r4 = r2.length
            if (r3 <= r4) goto L25
        L17:
            short r3 = r6.o
            if (r3 <= 0) goto L1e
            int r3 = r3 * 2
            goto L1f
        L1e:
            r3 = 1
        L1f:
            f.d[] r2 = g.a.H(r2, r3)
            r0.f1726f = r2
        L25:
            luaj.h r0 = r6.f1573b
            f.d[] r0 = r0.f1726f
            short r2 = r6.o
            f.d r3 = new f.d
            int r4 = r8.f1620a
            r5 = 7
            if (r4 != r5) goto L33
            goto L34
        L33:
            r1 = 0
        L34:
            g.g$k$a r8 = r8.f1621b
            int r8 = r8.f1628e
            r3.<init>(r7, r1, r8)
            r0[r2] = r3
            short r7 = r6.o
            int r8 = r7 + 1
            short r8 = (short) r8
            r6.o = r8
            return r7
    }

    void P(g.g.f[] r5, int r6, luaj.LuaString r7) {
            r4 = this;
            g.c$a r0 = r4.f1577f
            short r0 = r0.f1580b
        L4:
            if (r0 >= r6) goto L3d
            r1 = r5[r0]
            luaj.LuaString r1 = r1.f1609a
            boolean r1 = r7.P0(r1)
            if (r1 == 0) goto L3a
            g.g r1 = r4.f1576e
            g.h$a r1 = r1.h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "label '"
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = "' already defined on line "
            r2.append(r3)
            r3 = r5[r0]
            int r3 = r3.f1611c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = r1.e(r2)
            g.g r2 = r4.f1576e
            r2.x1(r1)
        L3a:
            int r0 = r0 + 1
            goto L4
        L3d:
            return
    }

    void P0(int r7, int r8) {
            r6 = this;
            int r0 = r7 + r8
            int r1 = r0 + (-1)
            int r2 = r6.f1578g
            int r3 = r6.h
            r4 = 4
            if (r2 <= r3) goto L49
            if (r2 <= 0) goto L49
            luaj.h r3 = r6.f1573b
            int[] r3 = r3.f1722b
            int r2 = r2 + (-1)
            r2 = r3[r2]
            int r3 = luaj.b.i(r2)
            if (r3 != r4) goto L49
            int r3 = luaj.b.c(r2)
            int r2 = luaj.b.e(r2)
            int r2 = r2 + r3
            if (r3 > r7) goto L2a
            int r5 = r2 + 1
            if (r7 <= r5) goto L2e
        L2a:
            if (r7 > r3) goto L49
            if (r3 > r0) goto L49
        L2e:
            if (r3 >= r7) goto L31
            r7 = r3
        L31:
            if (r2 <= r1) goto L34
            r1 = r2
        L34:
            g.d r8 = new g.d
            luaj.h r0 = r6.f1573b
            int[] r0 = r0.f1722b
            int r2 = r6.f1578g
            int r2 = r2 + (-1)
            r8.<init>(r0, r2)
            g.a.v(r8, r7)
            int r1 = r1 - r7
            g.a.x(r8, r1)
            return
        L49:
            int r8 = r8 + (-1)
            r0 = 0
            r6.T(r4, r7, r8, r0)
            return
    }

    void Q(int r3) {
            r2 = this;
            short r0 = r2.p
            int r0 = r0 + r3
            luaj.h r3 = r2.f1573b
            int r3 = r3.l
            if (r0 <= r3) goto L18
            r3 = 250(0xfa, float:3.5E-43)
            if (r0 < r3) goto L14
            g.g r3 = r2.f1576e
            java.lang.String r1 = "function or expression needs too many registers"
            r3.J1(r1)
        L14:
            luaj.h r3 = r2.f1573b
            r3.l = r0
        L18:
            return
    }

    int Q0() {
            r1 = this;
            luaj.LuaValue r0 = luaj.LuaValue.f1671c
            int r0 = r1.M(r0)
            return r0
    }

    void R(g.g.c r5) {
            r4 = this;
            g.g$k r0 = r5.f1596a
            int r1 = r0.f1620a
            if (r1 != 0) goto L7
            return
        L7:
            r4.o0(r0)
            g.g$k r0 = r5.f1596a
            r1 = 0
            r0.f1620a = r1
            int r0 = r5.f1600e
            r2 = 50
            if (r0 != r2) goto L22
            g.g$k r2 = r5.f1597b
            g.g$k$a r2 = r2.f1621b
            int r2 = r2.f1628e
            int r3 = r5.f1599d
            r4.g1(r2, r3, r0)
            r5.f1600e = r1
        L22:
            return
    }

    int R0(luaj.LuaValue r1) {
            r0 = this;
            int r1 = r0.M(r1)
            return r1
    }

    int S(int r5, int r6) {
            r4 = this;
            luaj.h r0 = r4.f1573b
            r4.h0()
            int[] r1 = r0.f1722b
            if (r1 == 0) goto L10
            int r2 = r4.f1578g
            int r2 = r2 + 1
            int r3 = r1.length
            if (r2 <= r3) goto L1c
        L10:
            int r2 = r4.f1578g
            int r2 = r2 * 2
            int r2 = r2 + 1
            int[] r1 = g.a.F(r1, r2)
            r0.f1722b = r1
        L1c:
            int[] r1 = r0.f1722b
            int r2 = r4.f1578g
            r1[r2] = r5
            int[] r5 = r0.f1724d
            if (r5 == 0) goto L2b
            int r1 = r2 + 1
            int r3 = r5.length
            if (r1 <= r3) goto L35
        L2b:
            int r2 = r2 * 2
            int r2 = r2 + 1
            int[] r5 = g.a.F(r5, r2)
            r0.f1724d = r5
        L35:
            int[] r5 = r0.f1724d
            int r0 = r4.f1578g
            r5[r0] = r6
            int r5 = r0 + 1
            r4.f1578g = r5
            return r0
    }

    void S0(int r5, int r6) {
            r4 = this;
            r0 = 1
            int r6 = r6 + r0
        L2:
            r1 = -1
            if (r5 == r1) goto L3e
            int r1 = r4.x0(r5)
            luaj.h r2 = r4.f1573b
            int[] r2 = r2.f1722b
            r2 = r2[r5]
            int r2 = luaj.b.i(r2)
            r3 = 23
            if (r2 != r3) goto L31
            luaj.h r2 = r4.f1573b
            int[] r2 = r2.f1722b
            r2 = r2[r5]
            int r2 = luaj.b.c(r2)
            if (r2 == 0) goto L2f
            luaj.h r2 = r4.f1573b
            int[] r2 = r2.f1722b
            r2 = r2[r5]
            int r2 = luaj.b.c(r2)
            if (r2 < r6) goto L31
        L2f:
            r2 = 1
            goto L32
        L31:
            r2 = 0
        L32:
            g.a.C(r2)
            luaj.h r2 = r4.f1573b
            int[] r2 = r2.f1722b
            g.a.w(r2, r5, r6)
            r5 = r1
            goto L2
        L3e:
            return
    }

    int T(int r4, int r5, int r6, int r7) {
            r3 = this;
            int r0 = luaj.b.p(r4)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            g.a.C(r0)
            int r0 = luaj.b.n(r4)
            if (r0 != 0) goto L19
            if (r6 != 0) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            g.a.C(r0)
            int r0 = luaj.b.o(r4)
            if (r0 != 0) goto L25
            if (r7 != 0) goto L26
        L25:
            r1 = 1
        L26:
            g.a.C(r1)
            int r4 = g.a.s(r4, r5, r6, r7)
            g.g r5 = r3.f1576e
            int r5 = r5.f1590d
            int r4 = r3.S(r4, r5)
            return r4
    }

    void T0(int r2, int r3) {
            r1 = this;
            int r0 = r1.f1578g
            if (r3 != r0) goto L8
            r1.W0(r2)
            goto L15
        L8:
            if (r3 >= r0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            g.a.C(r0)
            r0 = 255(0xff, float:3.57E-43)
            r1.U0(r2, r3, r0, r3)
        L15:
            return
    }

    int U(int r5, int r6, int r7) {
            r4 = this;
            int r0 = luaj.b.p(r5)
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L12
            int r0 = luaj.b.p(r5)
            r3 = 2
            if (r0 != r3) goto L10
            goto L12
        L10:
            r0 = 0
            goto L13
        L12:
            r0 = 1
        L13:
            g.a.C(r0)
            int r0 = luaj.b.o(r5)
            if (r0 != 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            g.a.C(r0)
            if (r7 < 0) goto L2a
            r0 = 262143(0x3ffff, float:3.6734E-40)
            if (r7 > r0) goto L2a
            r1 = 1
        L2a:
            g.a.C(r1)
            int r5 = g.a.t(r5, r6, r7)
            g.g r6 = r4.f1576e
            int r6 = r6.f1590d
            int r5 = r4.S(r5, r6)
            return r5
    }

    void U0(int r3, int r4, int r5, int r6) {
            r2 = this;
        L0:
            r0 = -1
            if (r3 == r0) goto L16
            int r0 = r2.x0(r3)
            boolean r1 = r2.V0(r3, r5)
            if (r1 == 0) goto L11
            r2.r0(r3, r4)
            goto L14
        L11:
            r2.r0(r3, r6)
        L14:
            r3 = r0
            goto L0
        L16:
            return
    }

    int V(int r2, int r3, int r4) {
            r1 = this;
            r0 = 131071(0x1ffff, float:1.8367E-40)
            int r4 = r4 + r0
            int r2 = r1.U(r2, r3, r4)
            return r2
    }

    boolean V0(int r4, int r5) {
            r3 = this;
            g.d r4 = r3.y0(r4)
            int r0 = r4.a()
            int r0 = luaj.b.i(r0)
            r1 = 28
            r2 = 0
            if (r0 == r1) goto L12
            return r2
        L12:
            r0 = 255(0xff, float:3.57E-43)
            if (r5 == r0) goto L24
            int r0 = r4.a()
            int r0 = luaj.b.e(r0)
            if (r5 == r0) goto L24
            g.a.v(r4, r5)
            goto L3d
        L24:
            int r5 = r4.a()
            int r5 = luaj.b.e(r5)
            int r0 = r4.a()
            int r0 = luaj.b.g(r0)
            r1 = 27
            int r5 = g.a.s(r1, r5, r2, r0)
            r4.b(r5)
        L3d:
            r4 = 1
            return r4
    }

    int W(int r3, int r4) {
            r2 = this;
            r0 = 262143(0x3ffff, float:3.6734E-40)
            if (r4 > r0) goto Lb
            r0 = 1
            int r3 = r2.U(r0, r3, r4)
            return r3
        Lb:
            r0 = 2
            r1 = 0
            int r3 = r2.U(r0, r3, r1)
            r2.a0(r4)
            return r3
    }

    void W0(int r2) {
            r1 = this;
            r1.z0()
            g.e r0 = r1.i
            r1.c0(r0, r2)
            return
    }

    int X(int r2, int r3, int r4) {
            r1 = this;
            r1.z0()
            r0 = 3
            int r2 = r1.T(r0, r2, r3, r4)
            return r2
    }

    void X0(int r7, g.g.k r8, g.g.k r9, int r10) {
            r6 = this;
            r0 = 24
            r1 = 25
            r2 = 26
            r3 = -1
            r4 = 1
            r5 = 0
            switch(r7) {
                case 0: goto Lce;
                case 1: goto Lca;
                case 2: goto Lc6;
                case 3: goto Lc2;
                case 4: goto Lbe;
                case 5: goto Lba;
                case 6: goto L71;
                case 7: goto L6d;
                case 8: goto L69;
                case 9: goto L65;
                case 10: goto L60;
                case 11: goto L5b;
                case 12: goto L56;
                case 13: goto L43;
                case 14: goto L27;
                case 15: goto L24;
                case 16: goto L21;
                case 17: goto L1e;
                case 18: goto L1b;
                case 19: goto L18;
                case 20: goto L11;
                default: goto Lc;
            }
        Lc:
            g.a.C(r5)
            goto Ld2
        L11:
            r7 = 46
        L13:
            r6.Y(r7, r8, r9, r10)
            goto Ld2
        L18:
            r7 = 45
            goto L13
        L1b:
            r7 = 44
            goto L13
        L1e:
            r7 = 43
            goto L13
        L21:
            r7 = 42
            goto L13
        L24:
            r7 = 40
            goto L13
        L27:
            g.e r7 = r8.f1623d
            int r7 = r7.f1587a
            if (r7 != r3) goto L2e
            goto L2f
        L2e:
            r4 = 0
        L2f:
            g.a.C(r4)
            r6.i0(r9)
            g.e r7 = r9.f1622c
            g.e r10 = r8.f1622c
        L39:
            int r10 = r10.f1587a
            r6.c0(r7, r10)
            r8.d(r9)
            goto Ld2
        L43:
            g.e r7 = r8.f1622c
            int r7 = r7.f1587a
            if (r7 != r3) goto L4a
            goto L4b
        L4a:
            r4 = 0
        L4b:
            g.a.C(r4)
            r6.i0(r9)
            g.e r7 = r9.f1623d
            g.e r10 = r8.f1623d
            goto L39
        L56:
            r6.Z(r2, r5, r8, r9)
            goto Ld2
        L5b:
            r6.Z(r1, r5, r8, r9)
            goto Ld2
        L60:
            r6.Z(r2, r4, r8, r9)
            goto Ld2
        L65:
            r6.Z(r1, r4, r8, r9)
            goto Ld2
        L69:
            r6.Z(r0, r4, r8, r9)
            goto Ld2
        L6d:
            r6.Z(r0, r5, r8, r9)
            goto Ld2
        L71:
            r6.q0(r9)
            int r7 = r9.f1620a
            r0 = 22
            r1 = 11
            if (r7 != r1) goto Lb3
            int r7 = r6.v0(r9)
            int r7 = luaj.b.i(r7)
            if (r7 != r0) goto Lb3
            g.g$k$a r7 = r8.f1621b
            int r7 = r7.f1628e
            int r10 = r6.v0(r9)
            int r10 = luaj.b.e(r10)
            int r10 = r10 - r4
            if (r7 != r10) goto L96
            goto L97
        L96:
            r4 = 0
        L97:
            g.a.C(r4)
            r6.t0(r8)
            g.d r7 = r6.w0(r9)
            g.g$k$a r10 = r8.f1621b
            int r10 = r10.f1628e
            g.a.x(r7, r10)
            r8.f1620a = r1
            g.g$k$a r7 = r8.f1621b
            g.g$k$a r8 = r9.f1621b
            int r8 = r8.f1628e
            r7.f1628e = r8
            goto Ld2
        Lb3:
            r6.o0(r9)
            r6.Y(r0, r8, r9, r10)
            goto Ld2
        Lba:
            r7 = 18
            goto L13
        Lbe:
            r7 = 17
            goto L13
        Lc2:
            r7 = 16
            goto L13
        Lc6:
            r7 = 15
            goto L13
        Lca:
            r7 = 14
            goto L13
        Lce:
            r7 = 13
            goto L13
        Ld2:
            return
    }

    void Y(int r4, g.g.k r5, g.g.k r6, int r7) {
            r3 = this;
            boolean r0 = r3.e0(r4, r5, r6)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 19
            r1 = 0
            if (r4 == r0) goto L19
            r0 = 21
            if (r4 == r0) goto L19
            r0 = 41
            if (r4 == r0) goto L19
            int r0 = r3.l0(r6)
            goto L1a
        L19:
            r0 = 0
        L1a:
            int r2 = r3.l0(r5)
            if (r2 <= r0) goto L27
            r3.t0(r5)
            r3.t0(r6)
            goto L2d
        L27:
            r3.t0(r6)
            r3.t0(r5)
        L2d:
            g.g$k$a r6 = r5.f1621b
            int r4 = r3.T(r4, r1, r2, r0)
            r6.f1628e = r4
            r4 = 11
            r5.f1620a = r4
            r3.s0(r7)
            return
    }

    void Y0(int r4, g.g.k r5, int r6) {
            r3 = this;
            g.g$k r0 = new g.g$k
            r0.<init>()
            r1 = 5
            r2 = 0
            r0.b(r1, r2)
            if (r4 == 0) goto L40
            r1 = 1
            if (r4 == r1) goto L3c
            r1 = 2
            if (r4 == r1) goto L36
            r1 = 4
            if (r4 == r1) goto L19
            g.a.C(r2)
            goto L57
        L19:
            boolean r4 = r5.c()
            if (r4 == 0) goto L2d
            g.g$k$a r4 = r5.f1621b
            luaj.LuaValue r5 = r4.a()
            luaj.LuaValue r5 = r5.q0()
        L29:
            r4.b(r5)
            goto L57
        L2d:
            r3.m0(r5)
            r4 = 41
        L32:
            r3.Y(r4, r5, r0, r6)
            goto L57
        L36:
            r3.m0(r5)
            r4 = 21
            goto L32
        L3c:
            r3.b0(r5)
            goto L57
        L40:
            boolean r4 = r5.c()
            if (r4 == 0) goto L51
            g.g$k$a r4 = r5.f1621b
            luaj.LuaValue r5 = r4.a()
            luaj.LuaValue r5 = r5.A1()
            goto L29
        L51:
            r3.m0(r5)
            r4 = 19
            goto L32
        L57:
            return
    }

    void Z(int r4, int r5, g.g.k r6, g.g.k r7) {
            r3 = this;
            int r0 = r3.l0(r6)
            int r1 = r3.l0(r7)
            r3.t0(r7)
            r3.t0(r6)
            if (r5 != 0) goto L18
            r7 = 24
            if (r4 == r7) goto L18
            r5 = 1
            r2 = r1
            r1 = r0
            r0 = r2
        L18:
            g.g$k$a r7 = r6.f1621b
            int r4 = r3.d0(r4, r5, r0, r1)
            r7.f1628e = r4
            r4 = 10
            r6.f1620a = r4
            return
    }

    void Z0(int r2) {
            r1 = this;
        L0:
            r0 = -1
            if (r2 == r0) goto Ld
            r0 = 255(0xff, float:3.57E-43)
            r1.V0(r2, r0)
            int r2 = r1.x0(r2)
            goto L0
        Ld:
            return
    }

    int a0(int r2) {
            r1 = this;
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
            if (r2 > r0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            g.a.C(r0)
            r0 = 39
            int r2 = g.a.u(r0, r2)
            g.g r0 = r1.f1576e
            int r0 = r0.f1590d
            int r2 = r1.S(r2, r0)
            return r2
    }

    void a1(int r4) {
            r3 = this;
            g.g r0 = r3.f1576e
            g.g$d r0 = r0.l
            int r1 = r0.f1602b
            short r2 = r3.n
            int r2 = r2 - r4
            int r1 = r1 - r2
            r0.f1602b = r1
        Lc:
            short r0 = r3.n
            if (r0 <= r4) goto L1e
            int r0 = r0 + (-1)
            short r0 = (short) r0
            r3.n = r0
            f.b r0 = r3.A0(r0)
            int r1 = r3.f1578g
            r0.f1558c = r1
            goto Lc
        L1e:
            return
    }

    void b0(g.g.k r6) {
            r5 = this;
            r5.i0(r6)
            int r0 = r6.f1620a
            r1 = 10
            if (r0 == r1) goto L30
            r1 = 11
            r2 = 0
            if (r0 == r1) goto L1b
            switch(r0) {
                case 1: goto L19;
                case 2: goto L15;
                case 3: goto L19;
                case 4: goto L15;
                case 5: goto L15;
                case 6: goto L1b;
                default: goto L11;
            }
        L11:
            g.a.C(r2)
            goto L33
        L15:
            r0 = 3
        L16:
            r6.f1620a = r0
            goto L33
        L19:
            r0 = 2
            goto L16
        L1b:
            r5.f0(r6)
            r5.t0(r6)
            g.g$k$a r0 = r6.f1621b
            r3 = 20
            int r4 = r0.f1628e
            int r2 = r5.T(r3, r2, r4, r2)
            r0.f1628e = r2
            r6.f1620a = r1
            goto L33
        L30:
            r5.G0(r6)
        L33:
            g.e r0 = r6.f1623d
            int r1 = r0.f1587a
            g.e r2 = r6.f1622c
            int r3 = r2.f1587a
            r0.f1587a = r3
            r2.f1587a = r1
            int r0 = r0.f1587a
            r5.Z0(r0)
            g.e r6 = r6.f1622c
            int r6 = r6.f1587a
            r5.Z0(r6)
            return
    }

    void b1(int r2) {
            r1 = this;
            r1.Q(r2)
            short r0 = r1.p
            int r0 = r0 + r2
            short r2 = (short) r0
            r1.p = r2
            return
    }

    void c0(g.e r3, int r4) {
            r2 = this;
            r0 = -1
            if (r4 != r0) goto L4
            return
        L4:
            int r1 = r3.f1587a
            if (r1 != r0) goto Lb
            r3.f1587a = r4
            goto L16
        Lb:
            int r3 = r2.x0(r1)
            if (r3 == r0) goto L13
            r1 = r3
            goto Lb
        L13:
            r2.r0(r1, r4)
        L16:
            return
    }

    void c1(int r3, int r4) {
            r2 = this;
            int r4 = r4 + 1
            r0 = 0
            r1 = 31
            r2.T(r1, r3, r4, r0)
            return
    }

    int d0(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.T(r1, r2, r3, r4)
            int r1 = r0.H0()
            return r1
    }

    int d1(luaj.LuaString r4) {
            r3 = this;
            luaj.h r0 = r3.f1573b
            f.d[] r0 = r0.f1726f
            r1 = 0
        L5:
            short r2 = r3.o
            if (r1 >= r2) goto L17
            r2 = r0[r1]
            luaj.LuaString r2 = r2.f1563a
            boolean r2 = r2.P0(r4)
            if (r2 == 0) goto L14
            return r1
        L14:
            int r1 = r1 + 1
            goto L5
        L17:
            r4 = -1
            return r4
    }

    boolean e0(int r5, g.g.k r6, g.g.k r7) {
            r4 = this;
            boolean r0 = r6.c()
            r1 = 0
            if (r0 == 0) goto Lee
            boolean r0 = r7.c()
            if (r0 != 0) goto Lf
            goto Lee
        Lf:
            r0 = 16
            if (r5 == r0) goto L1b
            r0 = 40
            if (r5 == r0) goto L1b
            r0 = 17
            if (r5 != r0) goto L2a
        L1b:
            g.g$k$a r0 = r7.f1621b
            luaj.LuaValue r0 = r0.a()
            luaj.LuaNumber r2 = luaj.LuaValue.f1675g
            boolean r0 = r0.P0(r2)
            if (r0 == 0) goto L2a
            return r1
        L2a:
            g.g$k$a r0 = r6.f1621b
            luaj.LuaValue r0 = r0.a()
            g.g$k$a r7 = r7.f1621b
            luaj.LuaValue r7 = r7.a()
            r2 = 21
            if (r5 == r2) goto Lee
            switch(r5) {
                case 13: goto Ld6;
                case 14: goto Ld1;
                case 15: goto Lcc;
                case 16: goto Lc7;
                case 17: goto Lc2;
                case 18: goto Lbd;
                case 19: goto Lb8;
                default: goto L3d;
            }
        L3d:
            switch(r5) {
                case 40: goto Lb3;
                case 41: goto La7;
                case 42: goto L94;
                case 43: goto L81;
                case 44: goto L6e;
                case 45: goto L5a;
                case 46: goto L46;
                default: goto L40;
            }
        L40:
            g.a.C(r1)
            r5 = 0
            goto Lda
        L46:
            boolean r5 = r0.k1()
            if (r5 == 0) goto L59
            boolean r5 = r7.k1()
            if (r5 != 0) goto L53
            goto L59
        L53:
            luaj.LuaValue r5 = r0.n2(r7)
            goto Lda
        L59:
            return r1
        L5a:
            boolean r5 = r0.k1()
            if (r5 == 0) goto L6d
            boolean r5 = r7.k1()
            if (r5 != 0) goto L67
            goto L6d
        L67:
            luaj.LuaValue r5 = r0.m2(r7)
            goto Lda
        L6d:
            return r1
        L6e:
            boolean r5 = r0.k1()
            if (r5 == 0) goto L80
            boolean r5 = r7.k1()
            if (r5 != 0) goto L7b
            goto L80
        L7b:
            luaj.LuaValue r5 = r0.t0(r7)
            goto Lda
        L80:
            return r1
        L81:
            boolean r5 = r0.k1()
            if (r5 == 0) goto L93
            boolean r5 = r7.k1()
            if (r5 != 0) goto L8e
            goto L93
        L8e:
            luaj.LuaValue r5 = r0.r0(r7)
            goto Lda
        L93:
            return r1
        L94:
            boolean r5 = r0.k1()
            if (r5 == 0) goto La6
            boolean r5 = r7.k1()
            if (r5 != 0) goto La1
            goto La6
        La1:
            luaj.LuaValue r5 = r0.o0(r7)
            goto Lda
        La6:
            return r1
        La7:
            boolean r5 = r0.k1()
            if (r5 != 0) goto Lae
            return r1
        Lae:
            luaj.LuaValue r5 = r0.q0()
            goto Lda
        Lb3:
            luaj.LuaValue r5 = r0.Z0(r7)
            goto Lda
        Lb8:
            luaj.LuaValue r5 = r0.A1()
            goto Lda
        Lbd:
            luaj.LuaValue r5 = r0.Q1(r7)
            goto Lda
        Lc2:
            luaj.LuaValue r5 = r0.y1(r7)
            goto Lda
        Lc7:
            luaj.LuaValue r5 = r0.O0(r7)
            goto Lda
        Lcc:
            luaj.LuaValue r5 = r0.z1(r7)
            goto Lda
        Ld1:
            luaj.LuaValue r5 = r0.r2(r7)
            goto Lda
        Ld6:
            luaj.LuaValue r5 = r0.j0(r7)
        Lda:
            if (r5 == 0) goto Lee
            double r2 = r5.x2()
            boolean r7 = java.lang.Double.isNaN(r2)
            if (r7 == 0) goto Le7
            goto Lee
        Le7:
            g.g$k$a r6 = r6.f1621b
            r6.b(r5)
            r5 = 1
            return r5
        Lee:
            return r1
    }

    int e1(luaj.LuaString r3) {
            r2 = this;
            short r0 = r2.n
            int r0 = r0 + (-1)
        L4:
            if (r0 < 0) goto L16
            f.b r1 = r2.A0(r0)
            luaj.LuaString r1 = r1.f1556a
            boolean r1 = r3.P0(r1)
            if (r1 == 0) goto L13
            return r0
        L13:
            int r0 = r0 + (-1)
            goto L4
        L16:
            r3 = -1
            return r3
    }

    void f0(g.g.k r3) {
            r2 = this;
            int r0 = r3.f1620a
            r1 = 6
            if (r0 == r1) goto Lf
            r0 = 1
            r2.b1(r0)
            short r1 = r2.p
            int r1 = r1 - r0
            r2.g0(r3, r1)
        Lf:
            return
    }

    void f1(g.g.k r5, g.g.k r6) {
            r4 = this;
            r4.m0(r5)
            r4.t0(r5)
            short r0 = r4.p
            r1 = 2
            r4.b1(r1)
            g.g$k$a r1 = r5.f1621b
            int r1 = r1.f1628e
            int r2 = r4.l0(r6)
            r3 = 12
            r4.T(r3, r0, r1, r2)
            r4.t0(r6)
            g.g$k$a r6 = r5.f1621b
            r6.f1628e = r0
            r6 = 6
            r5.f1620a = r6
            return
    }

    void g0(g.g.k r5, int r6) {
            r4 = this;
            r4.i0(r5)
            int r0 = r5.f1620a
            r1 = 11
            if (r0 == r1) goto L45
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L41;
                case 2: goto L37;
                case 3: goto L37;
                case 4: goto L32;
                case 5: goto L24;
                case 6: goto L1a;
                default: goto Le;
            }
        Le:
            if (r0 == 0) goto L16
            r5 = 10
            if (r0 != r5) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            g.a.C(r1)
            return
        L1a:
            g.g$k$a r0 = r5.f1621b
            int r0 = r0.f1628e
            if (r6 == r0) goto L4c
            r4.T(r2, r6, r0, r2)
            goto L4c
        L24:
            g.g$k$a r0 = r5.f1621b
            luaj.LuaValue r0 = r0.a()
            int r0 = r4.R0(r0)
        L2e:
            r4.W(r6, r0)
            goto L4c
        L32:
            g.g$k$a r0 = r5.f1621b
            int r0 = r0.f1628e
            goto L2e
        L37:
            r3 = 2
            if (r0 != r3) goto L3b
            goto L3c
        L3b:
            r1 = 0
        L3c:
            r0 = 3
            r4.T(r0, r6, r1, r2)
            goto L4c
        L41:
            r4.P0(r6, r1)
            goto L4c
        L45:
            g.d r0 = r4.w0(r5)
            g.a.v(r0, r6)
        L4c:
            g.g$k$a r0 = r5.f1621b
            r0.f1628e = r6
            r6 = 6
            r5.f1620a = r6
            return
    }

    void g1(int r4, int r5, int r6) {
            r3 = this;
            int r5 = r5 + (-1)
            int r5 = r5 / 50
            int r5 = r5 + 1
            r0 = -1
            r1 = 0
            if (r6 != r0) goto Lb
            r6 = 0
        Lb:
            r0 = 511(0x1ff, float:7.16E-43)
            r2 = 36
            if (r5 > r0) goto L15
            r3.T(r2, r4, r6, r5)
            goto L1f
        L15:
            r3.T(r2, r4, r6, r1)
            g.g r6 = r3.f1576e
            int r6 = r6.f1590d
            r3.S(r5, r6)
        L1f:
            int r4 = r4 + 1
            short r4 = (short) r4
            r3.p = r4
            return
    }

    void h0() {
            r3 = this;
            g.e r0 = r3.i
            int r0 = r0.f1587a
            int r1 = r3.f1578g
            r2 = 255(0xff, float:3.57E-43)
            r3.U0(r0, r1, r2, r1)
            g.e r0 = r3.i
            r1 = -1
            r0.f1587a = r1
            return
    }

    void h1(g.g.k r2) {
            r1 = this;
            r0 = -1
            r1.j1(r2, r0)
            return
    }

    void i0(g.g.k r7) {
            r6 = this;
            int r0 = r7.f1620a
            r1 = 6
            r2 = 7
            if (r0 == r2) goto L4a
            r3 = 8
            r4 = 11
            r5 = 0
            if (r0 == r3) goto L40
            r3 = 9
            if (r0 == r3) goto L1e
            r1 = 12
            if (r0 == r1) goto L1a
            r1 = 13
            if (r0 == r1) goto L1a
            goto L4c
        L1a:
            r6.i1(r7)
            goto L4c
        L1e:
            g.g$k$a r0 = r7.f1621b
            short r0 = r0.f1624a
            r6.u0(r0)
            g.g$k$a r0 = r7.f1621b
            short r3 = r0.f1626c
            if (r3 != r2) goto L31
            short r0 = r0.f1625b
            r6.u0(r0)
            r1 = 7
        L31:
            g.g$k$a r0 = r7.f1621b
            short r2 = r0.f1625b
            short r3 = r0.f1624a
            int r1 = r6.T(r1, r5, r2, r3)
        L3b:
            r0.f1628e = r1
            r7.f1620a = r4
            goto L4c
        L40:
            g.g$k$a r0 = r7.f1621b
            r1 = 5
            int r2 = r0.f1628e
            int r1 = r6.T(r1, r5, r2, r5)
            goto L3b
        L4a:
            r7.f1620a = r1
        L4c:
            return
    }

    void i1(g.g.k r3) {
            r2 = this;
            int r0 = r3.f1620a
            r1 = 12
            if (r0 != r1) goto L16
            r0 = 6
            r3.f1620a = r0
            g.g$k$a r0 = r3.f1621b
            int r3 = r2.v0(r3)
            int r3 = luaj.b.c(r3)
            r0.f1628e = r3
            goto L26
        L16:
            r1 = 13
            if (r0 != r1) goto L26
            g.d r0 = r2.w0(r3)
            r1 = 2
            g.a.x(r0, r1)
            r0 = 11
            r3.f1620a = r0
        L26:
            return
    }

    void j0(g.c.a r3, boolean r4) {
            r2 = this;
            r3.f1584f = r4
            short r4 = r2.n
            r3.f1582d = r4
            g.g r0 = r2.f1576e
            g.g$d r0 = r0.l
            int r1 = r0.f1606f
            short r1 = (short) r1
            r3.f1580b = r1
            int r0 = r0.f1604d
            short r0 = (short) r0
            r3.f1581c = r0
            r0 = 0
            r3.f1583e = r0
            g.c$a r1 = r2.f1577f
            r3.f1579a = r1
            r2.f1577f = r3
            short r3 = r2.p
            if (r3 != r4) goto L22
            r0 = 1
        L22:
            g.a.C(r0)
            return
    }

    void j1(g.g.k r4, int r5) {
            r3 = this;
            int r0 = r4.f1620a
            r1 = 12
            r2 = 1
            if (r0 != r1) goto L10
            g.d r4 = r3.w0(r4)
            int r5 = r5 + r2
            g.a.z(r4, r5)
            goto L28
        L10:
            r1 = 13
            if (r0 != r1) goto L28
            g.d r0 = r3.w0(r4)
            int r5 = r5 + r2
            g.a.x(r0, r5)
            g.d r4 = r3.w0(r4)
            short r5 = r3.p
            g.a.v(r4, r5)
            r3.b1(r2)
        L28:
            return
    }

    void k0(int r5, java.lang.String r6) {
            r4 = this;
            luaj.h r0 = r4.f1573b
            int r0 = r0.h
            r1 = 32
            if (r0 != 0) goto L28
            g.g r0 = r4.f1576e
            g.h$a r0 = r0.h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "main function has more than "
        L13:
            r2.append(r3)
            r2.append(r5)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r5 = r2.toString()
            java.lang.String r5 = r0.e(r5)
            goto L40
        L28:
            g.g r0 = r4.f1576e
            g.h$a r0 = r0.h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "function at line "
            r2.append(r3)
            luaj.h r3 = r4.f1573b
            int r3 = r3.h
            r2.append(r3)
            java.lang.String r3 = " has more than "
            goto L13
        L40:
            g.g r6 = r4.f1576e
            r0 = 0
            r6.T0(r5, r0)
            return
    }

    int l0(g.g.k r7) {
            r6 = this;
            r6.q0(r7)
            int r0 = r7.f1620a
            r1 = 255(0xff, float:3.57E-43)
            r2 = 2
            r3 = 4
            r4 = 1
            if (r0 == r4) goto L30
            if (r0 == r2) goto L30
            r5 = 3
            if (r0 == r5) goto L30
            if (r0 == r3) goto L25
            r2 = 5
            if (r0 == r2) goto L17
            goto L52
        L17:
            g.g$k$a r0 = r7.f1621b
            luaj.LuaValue r2 = r0.a()
            int r2 = r6.R0(r2)
            r0.f1628e = r2
            r7.f1620a = r3
        L25:
            g.g$k$a r0 = r7.f1621b
            int r0 = r0.f1628e
            if (r0 > r1) goto L52
            int r7 = luaj.b.l(r0)
            return r7
        L30:
            int r5 = r6.j
            if (r5 > r1) goto L52
            g.g$k$a r1 = r7.f1621b
            if (r0 != r4) goto L3d
            int r0 = r6.Q0()
            goto L45
        L3d:
            if (r0 != r2) goto L40
            goto L41
        L40:
            r4 = 0
        L41:
            int r0 = r6.N(r4)
        L45:
            r1.f1628e = r0
            r7.f1620a = r3
            g.g$k$a r7 = r7.f1621b
            int r7 = r7.f1628e
            int r7 = luaj.b.l(r7)
            return r7
        L52:
            int r7 = r6.m0(r7)
            return r7
    }

    void l1(g.g.k r6, g.g.k r7) {
            r5 = this;
            int r0 = r6.f1620a
            r1 = 7
            if (r0 == r1) goto L37
            r2 = 0
            r3 = 9
            r4 = 8
            if (r0 == r4) goto L28
            if (r0 == r3) goto L12
            g.a.C(r2)
            goto L33
        L12:
            g.g$k$a r0 = r6.f1621b
            short r0 = r0.f1626c
            if (r0 != r1) goto L1a
            r4 = 10
        L1a:
            int r0 = r5.l0(r7)
            g.g$k$a r6 = r6.f1621b
            short r1 = r6.f1625b
            short r6 = r6.f1624a
            r5.T(r4, r1, r6, r0)
            goto L33
        L28:
            int r0 = r5.m0(r7)
            g.g$k$a r6 = r6.f1621b
            int r6 = r6.f1628e
            r5.T(r3, r0, r6, r2)
        L33:
            r5.t0(r7)
            return
        L37:
            r5.t0(r7)
            g.g$k$a r6 = r6.f1621b
            int r6 = r6.f1628e
            r5.p0(r7, r6)
            return
    }

    int m0(g.g.k r3) {
            r2 = this;
            r2.i0(r3)
            int r0 = r3.f1620a
            r1 = 6
            if (r0 != r1) goto L1f
            boolean r0 = r3.a()
            if (r0 != 0) goto L13
        Le:
            g.g$k$a r3 = r3.f1621b
            int r3 = r3.f1628e
            return r3
        L13:
            g.g$k$a r0 = r3.f1621b
            int r0 = r0.f1628e
            short r1 = r2.n
            if (r0 < r1) goto L1f
            r2.p0(r3, r0)
            goto Le
        L1f:
            r2.o0(r3)
            goto Le
    }

    int m1(luaj.LuaString r1) {
            r0 = this;
            int r1 = r0.M(r1)
            return r1
    }

    void n0(g.g.k r3) {
            r2 = this;
            int r0 = r3.f1620a
            r1 = 8
            if (r0 != r1) goto Lc
            boolean r0 = r3.a()
            if (r0 == 0) goto Lf
        Lc:
            r2.m0(r3)
        Lf:
            return
    }

    void o0(g.g.k r3) {
            r2 = this;
            r2.i0(r3)
            r2.t0(r3)
            r0 = 1
            r2.b1(r0)
            short r1 = r2.p
            int r1 = r1 - r0
            r2.p0(r3, r1)
            return
    }

    void p0(g.g.k r6, int r7) {
            r5 = this;
            r5.g0(r6, r7)
            int r0 = r6.f1620a
            r1 = 10
            if (r0 != r1) goto L12
            g.e r0 = r6.f1622c
            g.g$k$a r2 = r6.f1621b
            int r2 = r2.f1628e
            r5.c0(r0, r2)
        L12:
            boolean r0 = r6.a()
            r2 = -1
            if (r0 == 0) goto L5a
            g.e r0 = r6.f1622c
            int r0 = r0.f1587a
            boolean r0 = r5.N0(r0)
            if (r0 != 0) goto L31
            g.e r0 = r6.f1623d
            int r0 = r0.f1587a
            boolean r0 = r5.N0(r0)
            if (r0 == 0) goto L2e
            goto L31
        L2e:
            r1 = -1
            r4 = -1
            goto L48
        L31:
            int r0 = r6.f1620a
            if (r0 != r1) goto L37
            r0 = -1
            goto L3b
        L37:
            int r0 = r5.H0()
        L3b:
            r1 = 0
            r3 = 1
            int r4 = r5.X(r7, r1, r3)
            int r1 = r5.X(r7, r3, r1)
            r5.W0(r0)
        L48:
            int r0 = r5.z0()
            g.e r3 = r6.f1623d
            int r3 = r3.f1587a
            r5.U0(r3, r0, r7, r4)
            g.e r3 = r6.f1622c
            int r3 = r3.f1587a
            r5.U0(r3, r0, r7, r1)
        L5a:
            g.e r0 = r6.f1623d
            g.e r1 = r6.f1622c
            r1.f1587a = r2
            r0.f1587a = r2
            g.g$k$a r0 = r6.f1621b
            r0.f1628e = r7
            r7 = 6
            r6.f1620a = r7
            return
    }

    void q0(g.g.k r2) {
            r1 = this;
            boolean r0 = r2.a()
            if (r0 == 0) goto La
            r1.m0(r2)
            goto Ld
        La:
            r1.i0(r2)
        Ld:
            return
    }

    void r0(int r4, int r5) {
            r3 = this;
            g.d r0 = new g.d
            luaj.h r1 = r3.f1573b
            int[] r1 = r1.f1722b
            r0.<init>(r1, r4)
            r1 = 1
            int r4 = r4 + r1
            int r4 = r5 - r4
            r2 = -1
            if (r5 == r2) goto L11
            goto L12
        L11:
            r1 = 0
        L12:
            g.a.C(r1)
            int r5 = java.lang.Math.abs(r4)
            r1 = 131071(0x1ffff, float:1.8367E-40)
            if (r5 <= r1) goto L25
            g.g r5 = r3.f1576e
            java.lang.String r1 = "control structure too long"
            r5.J1(r1)
        L25:
            g.a.A(r0, r4)
            return
    }

    void s0(int r3) {
            r2 = this;
            luaj.h r0 = r2.f1573b
            int[] r0 = r0.f1724d
            int r1 = r2.f1578g
            int r1 = r1 + (-1)
            r0[r1] = r3
            return
    }

    void t0(g.g.k r3) {
            r2 = this;
            int r0 = r3.f1620a
            r1 = 6
            if (r0 != r1) goto Lc
            g.g$k$a r3 = r3.f1621b
            int r3 = r3.f1628e
            r2.u0(r3)
        Lc:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FuncState [pc="
            r0.append(r1)
            int r1 = r2.f1578g
            r0.append(r1)
            java.lang.String r1 = ", lasttarget="
            r0.append(r1)
            int r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = ", nk="
            r0.append(r1)
            int r1 = r2.j
            r0.append(r1)
            java.lang.String r1 = ", np="
            r0.append(r1)
            int r1 = r2.k
            r0.append(r1)
            java.lang.String r1 = ", firstlocal="
            r0.append(r1)
            int r1 = r2.l
            r0.append(r1)
            java.lang.String r1 = ", nlocvars="
            r0.append(r1)
            short r1 = r2.m
            r0.append(r1)
            java.lang.String r1 = ", nactvar="
            r0.append(r1)
            short r1 = r2.n
            r0.append(r1)
            java.lang.String r1 = ", nups="
            r0.append(r1)
            short r1 = r2.o
            r0.append(r1)
            java.lang.String r1 = ", freereg="
            r0.append(r1)
            short r1 = r2.p
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    void u0(int r3) {
            r2 = this;
            boolean r0 = luaj.b.k(r3)
            if (r0 != 0) goto L18
            short r0 = r2.n
            if (r3 < r0) goto L18
            short r0 = r2.p
            r1 = 1
            int r0 = r0 - r1
            short r0 = (short) r0
            r2.p = r0
            if (r3 != r0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            g.a.C(r1)
        L18:
            return
    }

    int v0(g.g.k r2) {
            r1 = this;
            luaj.h r0 = r1.f1573b
            int[] r0 = r0.f1722b
            g.g$k$a r2 = r2.f1621b
            int r2 = r2.f1628e
            r2 = r0[r2]
            return r2
    }

    g.d w0(g.g.k r3) {
            r2 = this;
            g.d r0 = new g.d
            luaj.h r1 = r2.f1573b
            int[] r1 = r1.f1722b
            g.g$k$a r3 = r3.f1621b
            int r3 = r3.f1628e
            r0.<init>(r1, r3)
            return r0
    }

    int x0(int r3) {
            r2 = this;
            luaj.h r0 = r2.f1573b
            int[] r0 = r0.f1722b
            r0 = r0[r3]
            int r0 = luaj.b.h(r0)
            r1 = -1
            if (r0 != r1) goto Le
            return r1
        Le:
            int r3 = r3 + 1
            int r3 = r3 + r0
            return r3
    }

    g.d y0(int r4) {
            r3 = this;
            g.d r0 = new g.d
            luaj.h r1 = r3.f1573b
            int[] r1 = r1.f1722b
            r0.<init>(r1, r4)
            r1 = 1
            if (r4 < r1) goto L28
            int[] r4 = r0.f1585a
            int r2 = r0.f1586b
            int r2 = r2 - r1
            r4 = r4[r2]
            int r4 = luaj.b.i(r4)
            boolean r4 = luaj.b.r(r4)
            if (r4 == 0) goto L28
            g.d r4 = new g.d
            int[] r2 = r0.f1585a
            int r0 = r0.f1586b
            int r0 = r0 - r1
            r4.<init>(r2, r0)
            return r4
        L28:
            return r0
    }

    int z0() {
            r1 = this;
            int r0 = r1.f1578g
            r1.h = r0
            return r0
    }
}
