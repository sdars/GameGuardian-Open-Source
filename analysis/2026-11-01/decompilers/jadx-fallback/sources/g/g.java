package g;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class g extends g.a {
    protected static final java.lang.String[] r = null;
    private static final java.util.Hashtable s = null;
    static final java.lang.String[] t = null;
    static final java.util.Hashtable u = null;
    static g.g.C0027g[] v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f1588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f1589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f1590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final g.g.i f1591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final g.g.i f1592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    g.c f1593g;
    g.h.a h;
    java.io.InputStream i;
    char[] j;
    int k;
    g.g.d l;
    luaj.LuaString m;
    luaj.LuaString n;
    byte o;
    private g.g.b p;
    private final int[] q;

    static /* synthetic */ class a {
    }

    static class b implements java.lang.CharSequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        char[] f1594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1595b;

        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.CharSequence
        public char charAt(int r2) {
                r1 = this;
                char[] r0 = r1.f1594a
                char r2 = r0[r2]
                return r2
        }

        @Override // java.lang.CharSequence
        public int length() {
                r1 = this;
                int r0 = r1.f1595b
                return r0
        }

        @Override // java.lang.CharSequence
        public java.lang.CharSequence subSequence(int r1, int r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g.g.k f1596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g.g.k f1597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1598c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1599d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1600e;

        c() {
                r1 = this;
                r1.<init>()
                g.g$k r0 = new g.g$k
                r0.<init>()
                r1.f1596a = r0
                return
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g.g.j[] f1601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        g.g.f[] f1603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        g.g.f[] f1605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f1606f;

        d() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f1602b = r0
                r1.f1604d = r0
                r1.f1606f = r0
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Dyndata [actvar="
                r0.append(r1)
                g.g$j[] r1 = r2.f1601a
                java.lang.String r1 = java.util.Arrays.toString(r1)
                r0.append(r1)
                java.lang.String r1 = ", n_actvar="
                r0.append(r1)
                int r1 = r2.f1602b
                r0.append(r1)
                java.lang.String r1 = ", gt="
                r0.append(r1)
                g.g$f[] r1 = r2.f1603c
                java.lang.String r1 = java.util.Arrays.toString(r1)
                r0.append(r1)
                java.lang.String r1 = ", n_gt="
                r0.append(r1)
                int r1 = r2.f1604d
                r0.append(r1)
                java.lang.String r1 = ", label="
                r0.append(r1)
                g.g$f[] r1 = r2.f1605e
                java.lang.String r1 = java.util.Arrays.toString(r1)
                r0.append(r1)
                java.lang.String r1 = ", n_label="
                r0.append(r1)
                int r1 = r2.f1606f
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g.g.e f1607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g.g.k f1608b;

        e() {
                r1 = this;
                r1.<init>()
                g.g$k r0 = new g.g$k
                r0.<init>()
                r1.f1608b = r0
                return
        }
    }

    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        luaj.LuaString f1609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        short f1612d;

        public f(luaj.LuaString r1, int r2, int r3, short r4) {
                r0 = this;
                r0.<init>()
                r0.f1609a = r1
                r0.f1610b = r2
                r0.f1611c = r3
                r0.f1612d = r4
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Labeldesc [name="
                r0.append(r1)
                luaj.LuaString r1 = r2.f1609a
                r0.append(r1)
                java.lang.String r1 = ", pc="
                r0.append(r1)
                int r1 = r2.f1610b
                r0.append(r1)
                java.lang.String r1 = ", line="
                r0.append(r1)
                int r1 = r2.f1611c
                r0.append(r1)
                java.lang.String r1 = ", nactvar="
                r0.append(r1)
                short r1 = r2.f1612d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: g.g$g, reason: collision with other inner class name */
    static class C0027g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final byte f1613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final byte f1614b;

        public C0027g(int r1, int r2) {
                r0 = this;
                r0.<init>()
                byte r1 = (byte) r1
                r0.f1613a = r1
                byte r1 = (byte) r2
                r0.f1614b = r1
                return
        }
    }

    private static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        luaj.LuaValue f1615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        luaj.LuaString f1616b;

        private h() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ h(g.g.a r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g.g.h f1618b;

        private i() {
                r2 = this;
                r2.<init>()
                g.g$h r0 = new g.g$h
                r1 = 0
                r0.<init>(r1)
                r2.f1618b = r0
                return
        }

        /* synthetic */ i(g.g.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public void a(g.g.i r3) {
                r2 = this;
                int r0 = r3.f1617a
                r2.f1617a = r0
                g.g$h r0 = r2.f1618b
                g.g$h r3 = r3.f1618b
                luaj.LuaValue r1 = r3.f1615a
                r0.f1615a = r1
                luaj.LuaString r3 = r3.f1616b
                r0.f1616b = r3
                return
        }
    }

    static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final short f1619a;

        j(int r1) {
                r0 = this;
                r0.<init>()
                short r1 = (short) r1
                r0.f1619a = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Vardesc [idx="
                r0.append(r1)
                short r1 = r2.f1619a
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g.g.k.a f1621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final g.e f1622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final g.e f1623d;

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            short f1624a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            short f1625b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            short f1626c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            luaj.LuaValue f1627d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f1628e;

            a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public luaj.LuaValue a() {
                    r2 = this;
                    luaj.LuaValue r0 = r2.f1627d
                    if (r0 != 0) goto Lb
                    int r0 = r2.f1628e
                    long r0 = (long) r0
                    luaj.LuaLong r0 = luaj.LuaLong.I2(r0)
                Lb:
                    return r0
            }

            public void b(luaj.LuaValue r1) {
                    r0 = this;
                    r0.f1627d = r1
                    return
            }
        }

        k() {
                r1 = this;
                r1.<init>()
                g.g$k$a r0 = new g.g$k$a
                r0.<init>()
                r1.f1621b = r0
                g.e r0 = new g.e
                r0.<init>()
                r1.f1622c = r0
                g.e r0 = new g.e
                r0.<init>()
                r1.f1623d = r0
                return
        }

        boolean a() {
                r2 = this;
                g.e r0 = r2.f1622c
                int r0 = r0.f1587a
                g.e r1 = r2.f1623d
                int r1 = r1.f1587a
                if (r0 == r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        void b(int r3, int r4) {
                r2 = this;
                g.e r0 = r2.f1623d
                r1 = -1
                r0.f1587a = r1
                g.e r0 = r2.f1622c
                r0.f1587a = r1
                r2.f1620a = r3
                g.g$k$a r3 = r2.f1621b
                r3.f1628e = r4
                return
        }

        boolean c() {
                r2 = this;
                int r0 = r2.f1620a
                r1 = 5
                if (r0 != r1) goto L14
                g.e r0 = r2.f1622c
                int r0 = r0.f1587a
                r1 = -1
                if (r0 != r1) goto L14
                g.e r0 = r2.f1623d
                int r0 = r0.f1587a
                if (r0 != r1) goto L14
                r0 = 1
                goto L15
            L14:
                r0 = 0
            L15:
                return r0
        }

        public void d(g.g.k r3) {
                r2 = this;
                g.e r0 = r2.f1623d
                g.e r1 = r3.f1623d
                int r1 = r1.f1587a
                r0.f1587a = r1
                int r0 = r3.f1620a
                r2.f1620a = r0
                g.e r0 = r2.f1622c
                g.e r1 = r3.f1622c
                int r1 = r1.f1587a
                r0.f1587a = r1
                g.g$k$a r0 = r2.f1621b
                g.g$k$a r3 = r3.f1621b
                luaj.LuaValue r1 = r3.f1627d
                r0.f1627d = r1
                short r1 = r3.f1624a
                r0.f1624a = r1
                short r1 = r3.f1625b
                r0.f1625b = r1
                short r1 = r3.f1626c
                r0.f1626c = r1
                int r3 = r3.f1628e
                r0.f1628e = r3
                return
        }
    }

    static {
            java.lang.String r0 = "(for control)"
            java.lang.String r1 = "(for generator)"
            java.lang.String r2 = "(for index)"
            java.lang.String r3 = "(for limit)"
            java.lang.String r4 = "(for state)"
            java.lang.String r5 = "(for step)"
            java.lang.String r6 = "break"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6}
            g.g.r = r0
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            g.g.s = r0
            r0 = 0
            r1 = 0
        L1d:
            java.lang.String[] r2 = g.g.r
            int r3 = r2.length
            if (r1 >= r3) goto L2e
            java.util.Hashtable r3 = g.g.s
            r2 = r2[r1]
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.put(r2, r4)
            int r1 = r1 + 1
            goto L1d
        L2e:
            java.lang.String r2 = "and"
            java.lang.String r3 = "break"
            java.lang.String r4 = "do"
            java.lang.String r5 = "else"
            java.lang.String r6 = "elseif"
            java.lang.String r7 = "end"
            java.lang.String r8 = "false"
            java.lang.String r9 = "for"
            java.lang.String r10 = "function"
            java.lang.String r11 = "goto"
            java.lang.String r12 = "if"
            java.lang.String r13 = "in"
            java.lang.String r14 = "local"
            java.lang.String r15 = "nil"
            java.lang.String r16 = "not"
            java.lang.String r17 = "or"
            java.lang.String r18 = "repeat"
            java.lang.String r19 = "return"
            java.lang.String r20 = "then"
            java.lang.String r21 = "true"
            java.lang.String r22 = "until"
            java.lang.String r23 = "while"
            java.lang.String r24 = "//"
            java.lang.String r25 = ".."
            java.lang.String r26 = "..."
            java.lang.String r27 = "=="
            java.lang.String r28 = ">="
            java.lang.String r29 = "<="
            java.lang.String r30 = "~="
            java.lang.String r31 = "<<"
            java.lang.String r32 = ">>"
            java.lang.String r33 = "::"
            java.lang.String r34 = "<eof>"
            java.lang.String r35 = "<number>"
            java.lang.String r36 = "<integer>"
            java.lang.String r37 = "<name>"
            java.lang.String r38 = "<string>"
            java.lang.String[] r1 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38}
            g.g.t = r1
            java.util.Hashtable r1 = new java.util.Hashtable
            r1.<init>()
            g.g.u = r1
            r1 = 0
        L86:
            r2 = 22
            if (r1 >= r2) goto La0
            java.lang.String[] r2 = g.g.t
            r2 = r2[r1]
            luaj.LuaString r2 = luaj.LuaValue.K2(r2)
            java.util.Hashtable r3 = g.g.u
            int r4 = r1 + 257
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r2, r4)
            int r1 = r1 + 1
            goto L86
        La0:
            r1 = 21
            g.g$g[] r1 = new g.g.C0027g[r1]
            g.g$g r2 = new g.g$g
            r3 = 60
            r2.<init>(r3, r3)
            r1[r0] = r2
            g.g$g r0 = new g.g$g
            r0.<init>(r3, r3)
            r2 = 1
            r1[r2] = r0
            g.g$g r0 = new g.g$g
            r2 = 70
            r0.<init>(r2, r2)
            r3 = 2
            r1[r3] = r0
            g.g$g r0 = new g.g$g
            r0.<init>(r2, r2)
            r3 = 3
            r1[r3] = r0
            g.g$g r0 = new g.g$g
            r0.<init>(r2, r2)
            r3 = 4
            r1[r3] = r0
            g.g$g r0 = new g.g$g
            r3 = 100
            r4 = 90
            r0.<init>(r3, r4)
            r3 = 5
            r1[r3] = r0
            g.g$g r0 = new g.g$g
            r3 = 50
            r4 = 40
            r0.<init>(r3, r4)
            r3 = 6
            r1[r3] = r0
            g.g$g r0 = new g.g$g
            r3 = 30
            r0.<init>(r3, r3)
            r4 = 7
            r1[r4] = r0
            g.g$g r0 = new g.g$g
            r0.<init>(r3, r3)
            r4 = 8
            r1[r4] = r0
            g.g$g r0 = new g.g$g
            r0.<init>(r3, r3)
            r4 = 9
            r1[r4] = r0
            g.g$g r0 = new g.g$g
            r0.<init>(r3, r3)
            r4 = 10
            r1[r4] = r0
            g.g$g r0 = new g.g$g
            r0.<init>(r3, r3)
            r5 = 11
            r1[r5] = r0
            g.g$g r0 = new g.g$g
            r0.<init>(r3, r3)
            r3 = 12
            r1[r3] = r0
            g.g$g r0 = new g.g$g
            r3 = 20
            r0.<init>(r3, r3)
            r5 = 13
            r1[r5] = r0
            g.g$g r0 = new g.g$g
            r0.<init>(r4, r4)
            r4 = 14
            r1[r4] = r0
            g.g$g r0 = new g.g$g
            r0.<init>(r2, r2)
            r2 = 15
            r1[r2] = r0
            g.g$g r0 = new g.g$g
            r2 = 36
            r0.<init>(r2, r2)
            r2 = 16
            r1[r2] = r0
            g.g$g r0 = new g.g$g
            r2 = 32
            r0.<init>(r2, r2)
            r2 = 17
            r1[r2] = r0
            g.g$g r0 = new g.g$g
            r2 = 34
            r0.<init>(r2, r2)
            r2 = 18
            r1[r2] = r0
            g.g$g r0 = new g.g$g
            r2 = 38
            r0.<init>(r2, r2)
            r4 = 19
            r1[r4] = r0
            g.g$g r0 = new g.g$g
            r0.<init>(r2, r2)
            r1[r3] = r0
            g.g.v = r1
            return
    }

    public g(g.h.a r3, java.io.InputStream r4) {
            r2 = this;
            r2.<init>()
            g.g$i r0 = new g.g$i
            r1 = 0
            r0.<init>(r1)
            r2.f1591e = r0
            g.g$i r0 = new g.g$i
            r0.<init>(r1)
            r2.f1592f = r0
            g.g$d r0 = new g.g$d
            r0.<init>()
            r2.l = r0
            g.g$b r0 = new g.g$b
            r0.<init>()
            r2.p = r0
            r0 = 24
            int[] r0 = new int[r0]
            r2.q = r0
            r2.i = r4
            r4 = 32
            char[] r4 = new char[r4]
            r2.j = r4
            r2.h = r3
            return
    }

    private void B1() {
            r2 = this;
            int r0 = r2.f1588b
            r1 = 35
            if (r0 != r1) goto L15
        L6:
            boolean r0 = r2.j0()
            if (r0 != 0) goto L15
            int r0 = r2.f1588b
            r1 = -1
            if (r0 == r1) goto L15
            r2.h1()
            goto L6
        L15:
            return
    }

    public static int H0(int r1) {
            r0 = 57
            if (r1 > r0) goto L7
            int r1 = r1 + (-48)
            goto L10
        L7:
            r0 = 70
            if (r1 > r0) goto Le
            int r1 = r1 + (-55)
            goto L10
        Le:
            int r1 = r1 + (-87)
        L10:
            return r1
    }

    public static boolean K0(java.lang.String r1) {
            java.util.Hashtable r0 = g.g.s
            boolean r1 = r0.containsKey(r1)
            return r1
    }

    public static boolean L0(int r1) {
            r0 = 48
            if (r1 < r0) goto L8
            r0 = 57
            if (r1 <= r0) goto L1c
        L8:
            r0 = 97
            if (r1 < r0) goto L10
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 <= r0) goto L1c
        L10:
            r0 = 65
            if (r1 < r0) goto L18
            r0 = 90
            if (r1 <= r0) goto L1c
        L18:
            r0 = 95
            if (r1 != r0) goto L1e
        L1c:
            r1 = 1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            return r1
    }

    private static final java.lang.String M(java.lang.Object r0) {
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = N(r0)
            return r0
    }

    public static boolean M0(int r1) {
            r0 = 97
            if (r1 < r0) goto L8
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 <= r0) goto L10
        L8:
            r0 = 65
            if (r1 < r0) goto L12
            r0 = 90
            if (r1 > r0) goto L12
        L10:
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    private static final java.lang.String N(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 39
            r0.append(r1)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static boolean N0(int r1) {
            r0 = 32
            if (r1 < r0) goto Lb
            r0 = 255(0xff, float:3.57E-43)
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    public static boolean O0(int r1) {
            r0 = 48
            if (r1 < r0) goto La
            r0 = 57
            if (r1 > r0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public static boolean P0(int r1) {
            if (r1 < 0) goto L8
            r0 = 32
            if (r1 > r0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public static boolean Q0(int r1) {
            r0 = 48
            if (r1 < r0) goto L8
            r0 = 57
            if (r1 <= r0) goto L18
        L8:
            r0 = 97
            if (r1 < r0) goto L10
            r0 = 102(0x66, float:1.43E-43)
            if (r1 <= r0) goto L18
        L10:
            r0 = 65
            if (r1 < r0) goto L1a
            r0 = 70
            if (r1 > r0) goto L1a
        L18:
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            return r1
    }

    static int Z0(int r2) {
            r0 = 0
        L1:
            r1 = 16
            if (r2 < r1) goto Lc
            int r2 = r2 + 1
            int r2 = r2 >> 1
            int r0 = r0 + 1
            goto L1
        Lc:
            r1 = 8
            if (r2 >= r1) goto L11
            return r2
        L11:
            int r0 = r0 + 1
            int r0 = r0 << 3
            int r2 = r2 - r1
            r2 = r2 | r0
            return r2
    }

    void A0(g.g.k r7, int r8) {
            r6 = this;
            g.c r0 = r6.f1593g
            g.g$k r1 = new g.g$k
            r1.<init>()
            g.g$i r2 = r6.f1591e
            int r3 = r2.f1617a
            r4 = 0
            r5 = 40
            if (r3 == r5) goto L2d
            r5 = 123(0x7b, float:1.72E-43)
            if (r3 == r5) goto L29
            r5 = 293(0x125, float:4.1E-43)
            if (r3 == r5) goto L1e
            java.lang.String r7 = "function arguments expected"
            r6.J1(r7)
            return
        L1e:
            g.g$h r2 = r2.f1618b
            luaj.LuaString r2 = r2.f1616b
            r6.g0(r1, r2)
            r6.g1()
            goto L44
        L29:
            r6.i0(r1)
            goto L44
        L2d:
            r6.g1()
            g.g$i r2 = r6.f1591e
            int r2 = r2.f1617a
            r3 = 41
            if (r2 != r3) goto L3b
            r1.f1620a = r4
            goto L41
        L3b:
            r6.q0(r1)
            r0.h1(r1)
        L41:
            r6.Z(r3, r5, r8)
        L44:
            int r2 = r7.f1620a
            r3 = 6
            r5 = 1
            if (r2 != r3) goto L4b
            r4 = 1
        L4b:
            g.a.C(r4)
            g.g$k$a r2 = r7.f1621b
            int r2 = r2.f1628e
            int r3 = r1.f1620a
            boolean r3 = r6.G0(r3)
            if (r3 == 0) goto L5c
            r1 = -1
            goto L68
        L5c:
            int r3 = r1.f1620a
            if (r3 == 0) goto L63
            r0.o0(r1)
        L63:
            short r1 = r0.p
            int r3 = r2 + 1
            int r1 = r1 - r3
        L68:
            int r1 = r1 + r5
            r3 = 2
            r4 = 29
            int r1 = r0.T(r4, r2, r1, r3)
            r3 = 12
            r7.b(r3, r1)
            r0.s0(r8)
            int r2 = r2 + r5
            short r7 = (short) r2
            r0.p = r7
            return
    }

    void A1(g.g.k r7) {
            r6 = this;
            luaj.LuaString r0 = r6.G1()
            g.c r1 = r6.f1593g
            r2 = 1
            int r3 = g.c.k1(r1, r0, r7, r2)
            if (r3 != 0) goto L2b
            g.g$k r3 = new g.g$k
            r3.<init>()
            luaj.LuaString r4 = r6.n
            g.c.k1(r1, r4, r7, r2)
            int r4 = r7.f1620a
            r5 = 7
            if (r4 == r5) goto L22
            r5 = 8
            if (r4 != r5) goto L21
            goto L22
        L21:
            r2 = 0
        L22:
            g.a.C(r2)
            r6.g0(r3, r0)
            r1.E0(r7, r3)
        L2b:
            return
    }

    boolean B0(g.g.k r3) {
            r2 = this;
            r2.A1(r3)
        L3:
            g.g$i r0 = r2.f1591e
            int r0 = r0.f1617a
            r1 = 46
            if (r0 != r1) goto Lf
            r2.t0(r3)
            goto L3
        Lf:
            r1 = 58
            if (r0 != r1) goto L18
            r2.t0(r3)
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            return r3
    }

    void C0(int r4) {
            r3 = this;
            g.g$k r0 = new g.g$k
            r0.<init>()
            g.g$k r1 = new g.g$k
            r1.<init>()
            r3.g1()
            boolean r2 = r3.B0(r0)
            r3.U(r1, r2, r4)
            g.c r2 = r3.f1593g
            r2.l1(r0, r1)
            g.c r0 = r3.f1593g
            r0.s0(r4)
            return
    }

    int C1() {
            r4 = this;
            int r0 = r4.f1588b
            r4.w1()
            r1 = 0
        L6:
            int r2 = r4.f1588b
            r3 = 61
            if (r2 != r3) goto L12
            r4.w1()
            int r1 = r1 + 1
            goto L6
        L12:
            if (r2 != r0) goto L15
            goto L18
        L15:
            int r0 = -r1
            int r1 = r0 + (-1)
        L18:
            return r1
    }

    int D0(int r2) {
            r1 = this;
            r0 = 37
            if (r2 == r0) goto L77
            r0 = 38
            if (r2 == r0) goto L74
            r0 = 42
            if (r2 == r0) goto L72
            r0 = 43
            if (r2 == r0) goto L70
            r0 = 45
            if (r2 == r0) goto L6e
            r0 = 47
            if (r2 == r0) goto L6c
            r0 = 60
            if (r2 == r0) goto L69
            r0 = 62
            if (r2 == r0) goto L66
            r0 = 94
            if (r2 == r0) goto L64
            r0 = 124(0x7c, float:1.74E-43)
            if (r2 == r0) goto L61
            r0 = 126(0x7e, float:1.77E-43)
            if (r2 == r0) goto L5e
            r0 = 257(0x101, float:3.6E-43)
            if (r2 == r0) goto L5b
            r0 = 272(0x110, float:3.81E-43)
            if (r2 == r0) goto L58
            r0 = 279(0x117, float:3.91E-43)
            if (r2 == r0) goto L55
            r0 = 280(0x118, float:3.92E-43)
            if (r2 == r0) goto L53
            switch(r2) {
                case 282: goto L50;
                case 283: goto L4d;
                case 284: goto L4a;
                case 285: goto L48;
                case 286: goto L45;
                case 287: goto L42;
                default: goto L3f;
            }
        L3f:
            r2 = 21
            return r2
        L42:
            r2 = 20
            return r2
        L45:
            r2 = 19
            return r2
        L48:
            r2 = 7
            return r2
        L4a:
            r2 = 10
            return r2
        L4d:
            r2 = 12
            return r2
        L50:
            r2 = 8
            return r2
        L53:
            r2 = 6
            return r2
        L55:
            r2 = 15
            return r2
        L58:
            r2 = 14
            return r2
        L5b:
            r2 = 13
            return r2
        L5e:
            r2 = 18
            return r2
        L61:
            r2 = 17
            return r2
        L64:
            r2 = 5
            return r2
        L66:
            r2 = 11
            return r2
        L69:
            r2 = 9
            return r2
        L6c:
            r2 = 3
            return r2
        L6e:
            r2 = 1
            return r2
        L70:
            r2 = 0
            return r2
        L72:
            r2 = 2
            return r2
        L74:
            r2 = 16
            return r2
        L77:
            r2 = 4
            return r2
    }

    void D1() {
            r2 = this;
        L0:
            g.g$i r0 = r2.f1591e
            int r0 = r0.f1617a
            r1 = 59
            if (r0 == r1) goto Le
            r1 = 288(0x120, float:4.04E-43)
            if (r0 != r1) goto Ld
            goto Le
        Ld:
            return
        Le:
            r2.E1()
            goto L0
    }

    int E0(int r2) {
            r1 = this;
            r0 = 35
            if (r2 == r0) goto L18
            r0 = 45
            if (r2 == r0) goto L16
            r0 = 126(0x7e, float:1.77E-43)
            if (r2 == r0) goto L14
            r0 = 271(0x10f, float:3.8E-43)
            if (r2 == r0) goto L12
            r2 = 3
            return r2
        L12:
            r2 = 1
            return r2
        L14:
            r2 = 4
            return r2
        L16:
            r2 = 0
            return r2
        L18:
            r2 = 2
            return r2
    }

    void E1() {
            r3 = this;
            int r0 = r3.f1589c
            r3.k0()
            g.g$i r1 = r3.f1591e
            int r1 = r1.f1617a
            r2 = 59
            if (r1 == r2) goto L7f
            r2 = 269(0x10d, float:3.77E-43)
            if (r1 == r2) goto L6c
            r2 = 278(0x116, float:3.9E-43)
            if (r1 == r2) goto L68
            r2 = 288(0x120, float:4.04E-43)
            if (r1 == r2) goto L5d
            r2 = 258(0x102, float:3.62E-43)
            if (r1 == r2) goto L53
            r2 = 259(0x103, float:3.63E-43)
            if (r1 == r2) goto L47
            r2 = 273(0x111, float:3.83E-43)
            if (r1 == r2) goto L43
            r2 = 274(0x112, float:3.84E-43)
            if (r1 == r2) goto L3c
            switch(r1) {
                case 264: goto L38;
                case 265: goto L34;
                case 266: goto L53;
                case 267: goto L30;
                default: goto L2c;
            }
        L2c:
            r3.s0()
            goto L82
        L30:
            r3.I0(r0)
            goto L82
        L34:
            r3.C0(r0)
            goto L82
        L38:
            r3.z0(r0)
            goto L82
        L3c:
            r3.g1()
            r3.u1()
            goto L82
        L43:
            r3.t1(r0)
            goto L82
        L47:
            r3.g1()
            r3.S()
            r1 = 262(0x106, float:3.67E-43)
            r3.Z(r1, r2, r0)
            goto L82
        L53:
            g.c r0 = r3.f1593g
            int r0 = r0.H0()
            r3.F0(r0)
            goto L82
        L5d:
            r3.g1()
            luaj.LuaString r1 = r3.G1()
            r3.R0(r1, r0)
            goto L82
        L68:
            r3.P1(r0)
            goto L82
        L6c:
            r3.g1()
            r0 = 265(0x109, float:3.71E-43)
            boolean r0 = r3.L1(r0)
            if (r0 == 0) goto L7b
            r3.W0()
            goto L82
        L7b:
            r3.X0()
            goto L82
        L7f:
            r3.g1()
        L82:
            g.c r0 = r3.f1593g
            luaj.h r1 = r0.f1573b
            int r1 = r1.l
            short r2 = r0.p
            if (r1 < r2) goto L92
            short r0 = r0.n
            if (r2 < r0) goto L92
            r0 = 1
            goto L93
        L92:
            r0 = 0
        L93:
            g.a.C(r0)
            g.c r0 = r3.f1593g
            short r1 = r0.n
            r0.p = r1
            r3.S0()
            return
    }

    void F0(int r7) {
            r6 = this;
            int r4 = r6.f1589c
            r0 = 266(0x10a, float:3.73E-43)
            boolean r0 = r6.L1(r0)
            if (r0 == 0) goto L10
            luaj.LuaString r0 = r6.G1()
        Le:
            r3 = r0
            goto L1a
        L10:
            r6.g1()
            java.lang.String r0 = "break"
            luaj.LuaString r0 = luaj.LuaString.K2(r0)
            goto Le
        L1a:
            g.g$d r0 = r6.l
            g.g$f[] r1 = r0.f1603c
            int r2 = r0.f1604d
            int r2 = r2 + 1
            g.g$f[] r1 = g.a.D(r1, r2)
            r0.f1603c = r1
            g.g$d r0 = r6.l
            int r2 = r0.f1604d
            int r5 = r2 + 1
            r0.f1604d = r5
            r0 = r6
            r5 = r7
            int r7 = r0.d1(r1, r2, r3, r4, r5)
            r6.v0(r7)
            return
    }

    void F1() {
            r2 = this;
        L0:
            r0 = 1
            boolean r0 = r2.T(r0)
            if (r0 != 0) goto L12
            g.g$i r0 = r2.f1591e
            int r0 = r0.f1617a
            r1 = 274(0x112, float:3.84E-43)
            r2.E1()
            if (r0 != r1) goto L0
        L12:
            return
    }

    boolean G0(int r2) {
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

    luaj.LuaString G1() {
            r1 = this;
            r0 = 292(0x124, float:4.09E-43)
            r1.W(r0)
            g.g$i r0 = r1.f1591e
            g.g$h r0 = r0.f1618b
            luaj.LuaString r0 = r0.f1616b
            r1.g1()
            return r0
    }

    int H1(g.g.k r6, int r7) {
            r5 = this;
            r5.k0()
            g.g$i r0 = r5.f1591e
            int r0 = r0.f1617a
            int r0 = r5.E0(r0)
            r1 = 3
            if (r0 == r1) goto L1e
            int r1 = r5.f1589c
            r5.g1()
            r2 = 80
            r5.H1(r6, r2)
            g.c r2 = r5.f1593g
            r2.Y0(r0, r6, r1)
            goto L21
        L1e:
            r5.z1(r6)
        L21:
            g.g$i r0 = r5.f1591e
            int r0 = r0.f1617a
            int r0 = r5.D0(r0)
        L29:
            r1 = 21
            if (r0 == r1) goto L55
            g.g$g[] r1 = g.g.v
            r1 = r1[r0]
            byte r1 = r1.f1613a
            if (r1 <= r7) goto L55
            g.g$k r1 = new g.g$k
            r1.<init>()
            int r2 = r5.f1589c
            r5.g1()
            g.c r3 = r5.f1593g
            r3.F0(r0, r6)
            g.g$g[] r3 = g.g.v
            r3 = r3[r0]
            byte r3 = r3.f1614b
            int r3 = r5.H1(r1, r3)
            g.c r4 = r5.f1593g
            r4.X0(r0, r6, r1, r2)
            r0 = r3
            goto L29
        L55:
            r5.S0()
            return r0
    }

    void I0(int r4) {
            r3 = this;
            g.e r0 = new g.e
            r1 = -1
            r0.<init>(r1)
        L6:
            r3.K1(r0)
            g.g$i r1 = r3.f1591e
            int r1 = r1.f1617a
            r2 = 261(0x105, float:3.66E-43)
            if (r1 != r2) goto L12
            goto L6
        L12:
            r1 = 260(0x104, float:3.64E-43)
            boolean r1 = r3.L1(r1)
            if (r1 == 0) goto L1d
            r3.S()
        L1d:
            r1 = 262(0x106, float:3.67E-43)
            r2 = 267(0x10b, float:3.74E-43)
            r3.Z(r1, r2, r4)
            g.c r4 = r3.f1593g
            int r0 = r0.f1587a
            r4.W0(r0)
            return
    }

    void I1(g.g.k r4) {
            r3 = this;
            int r0 = r3.f1589c
            r3.k1(r4)
        L5:
            g.g$i r1 = r3.f1591e
            int r1 = r1.f1617a
            r2 = 40
            if (r1 == r2) goto L4d
            r2 = 46
            if (r1 == r2) goto L49
            r2 = 58
            if (r1 == r2) goto L35
            r2 = 91
            if (r1 == r2) goto L22
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4d
            r2 = 293(0x125, float:4.1E-43)
            if (r1 == r2) goto L4d
            return
        L22:
            g.g$k r1 = new g.g$k
            r1.<init>()
            g.c r2 = r3.f1593g
            r2.n0(r4)
            r3.Q1(r1)
            g.c r2 = r3.f1593g
            r2.E0(r4, r1)
            goto L5
        L35:
            g.g$k r1 = new g.g$k
            r1.<init>()
            r3.g1()
            r3.b0(r1)
            g.c r2 = r3.f1593g
            r2.f1(r4, r1)
        L45:
            r3.A0(r4, r0)
            goto L5
        L49:
            r3.t0(r4)
            goto L5
        L4d:
            g.c r1 = r3.f1593g
            r1.o0(r4)
            goto L45
    }

    void J0() {
            r2 = this;
            int r0 = r2.f1588b
            boolean r1 = r2.j0()
            g.a.C(r1)
            r2.h1()
            boolean r1 = r2.j0()
            if (r1 == 0) goto L19
            int r1 = r2.f1588b
            if (r1 == r0) goto L19
            r2.h1()
        L19:
            int r0 = r2.f1589c
            int r0 = r0 + 1
            r2.f1589c = r0
            r1 = 2147483645(0x7ffffffd, float:NaN)
            if (r0 < r1) goto L29
            java.lang.String r0 = "chunk has too many lines (> 2147483645)"
            r2.J1(r0)
        L29:
            return
    }

    void J1(java.lang.String r2) {
            r1 = this;
            g.g$i r0 = r1.f1591e
            int r0 = r0.f1617a
            r1.T0(r2, r0)
            return
    }

    void K1(g.e r6) {
            r5 = this;
            g.g$k r0 = new g.g$k
            r0.<init>()
            g.c$a r1 = new g.c$a
            r1.<init>()
            r5.g1()
            r5.r0(r0)
            r2 = 275(0x113, float:3.85E-43)
            r5.c0(r2)
            g.g$i r2 = r5.f1591e
            int r2 = r2.f1617a
            r3 = 266(0x10a, float:3.73E-43)
            r4 = 0
            if (r2 == r3) goto L32
            r3 = 258(0x102, float:3.62E-43)
            if (r2 != r3) goto L23
            goto L32
        L23:
            g.c r2 = r5.f1593g
            r2.C0(r0)
            g.c r2 = r5.f1593g
            r2.j0(r1, r4)
            g.e r0 = r0.f1623d
            int r0 = r0.f1587a
            goto L58
        L32:
            g.c r2 = r5.f1593g
            r2.B0(r0)
            g.c r2 = r5.f1593g
            r2.j0(r1, r4)
            g.e r0 = r0.f1622c
            int r0 = r0.f1587a
            r5.F0(r0)
            r5.D1()
            boolean r0 = r5.T(r4)
            if (r0 == 0) goto L52
            g.c r6 = r5.f1593g
            r6.K0()
            return
        L52:
            g.c r0 = r5.f1593g
            int r0 = r0.H0()
        L58:
            r5.F1()
            g.c r1 = r5.f1593g
            r1.K0()
            g.g$i r1 = r5.f1591e
            int r1 = r1.f1617a
            r2 = 260(0x104, float:3.64E-43)
            if (r1 == r2) goto L6c
            r2 = 261(0x105, float:3.66E-43)
            if (r1 != r2) goto L75
        L6c:
            g.c r1 = r5.f1593g
            int r2 = r1.H0()
            r1.c0(r6, r2)
        L75:
            g.c r6 = r5.f1593g
            r6.W0(r0)
            return
    }

    boolean L1(int r2) {
            r1 = this;
            g.g$i r0 = r1.f1591e
            int r0 = r0.f1617a
            if (r0 != r2) goto Lb
            r1.g1()
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }

    java.lang.String M1(int r4) {
            r3 = this;
            r0 = 257(0x101, float:3.6E-43)
            if (r4 >= r0) goto L44
            boolean r0 = N0(r4)
            if (r0 == 0) goto L3b
            g.h$a r0 = r3.h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "'<\\"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ">' (symbol with decimal code "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " or 0x"
            r1.append(r2)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r1.append(r4)
            java.lang.String r4 = ")"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
        L36:
            java.lang.String r4 = r0.e(r4)
            goto L43
        L3b:
            g.h$a r0 = r3.h
            char r4 = (char) r4
            java.lang.String r4 = java.lang.String.valueOf(r4)
            goto L36
        L43:
            return r4
        L44:
            java.lang.String[] r0 = g.g.t
            int r1 = r4 + (-257)
            r0 = r0[r1]
            switch(r4) {
                case 289: goto L62;
                case 290: goto L62;
                case 291: goto L62;
                case 292: goto L62;
                case 293: goto L62;
                default: goto L4d;
            }
        L4d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r1 = 39
            r4.append(r1)
            r4.append(r0)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            return r4
        L62:
            return r0
    }

    java.lang.String N1(int r6) {
            r5 = this;
            switch(r6) {
                case 290: goto L8;
                case 291: goto L8;
                case 292: goto L8;
                case 293: goto L8;
                default: goto L3;
            }
        L3:
            java.lang.String r6 = r5.M1(r6)
            return r6
        L8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r0 = 39
            r6.append(r0)
            java.lang.String r1 = new java.lang.String
            char[] r2 = r5.j
            r3 = 0
            int r4 = r5.k
            r1.<init>(r2, r3, r4)
            r6.append(r1)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            return r6
    }

    luaj.h O() {
            r5 = this;
            g.c r0 = r5.f1593g
            luaj.h r1 = r0.f1573b
            luaj.h[] r2 = r1.f1723c
            if (r2 == 0) goto Ld
            int r3 = r0.k
            int r4 = r2.length
            if (r3 < r4) goto L1c
        Ld:
            int r0 = r0.k
            int r0 = r0 * 2
            r3 = 1
            int r0 = java.lang.Math.max(r3, r0)
            luaj.h[] r0 = g.a.L(r2, r0)
            r1.f1723c = r0
        L1c:
            luaj.h[] r0 = r1.f1723c
            g.c r1 = r5.f1593g
            int r2 = r1.k
            int r3 = r2 + 1
            r1.k = r3
            luaj.h r1 = new luaj.h
            r1.<init>()
            r0[r2] = r1
            return r1
    }

    void O1(g.g.f r5, g.c r6, g.c.a r7) {
            r4 = this;
            int r6 = r5.f1611c
            r4.f1589c = r6
            luaj.LuaString r6 = r5.f1609a
            java.lang.String r6 = r6.g0()
            boolean r0 = K0(r6)
            g.h$a r1 = r4.h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            if (r0 == 0) goto L35
            r2.<init>()
            java.lang.String r3 = "<"
            r2.append(r3)
            luaj.LuaString r3 = r5.f1609a
            r2.append(r3)
            java.lang.String r3 = "> at line "
            r2.append(r3)
            int r5 = r5.f1611c
            r2.append(r5)
            java.lang.String r5 = " not inside a loop"
            r2.append(r5)
        L30:
            java.lang.String r5 = r2.toString()
            goto L4d
        L35:
            r2.<init>()
            java.lang.String r3 = "no visible label '"
            r2.append(r3)
            luaj.LuaString r3 = r5.f1609a
            r2.append(r3)
            java.lang.String r3 = "' for <goto> at line "
            r2.append(r3)
            int r5 = r5.f1611c
            r2.append(r5)
            goto L30
        L4d:
            java.lang.String r5 = r1.e(r5)
            if (r0 != 0) goto L96
            g.g$d r0 = r4.l
            short r7 = r7.f1580b
        L57:
            int r1 = r0.f1606f
            if (r7 >= r1) goto L96
            g.g$f[] r1 = r0.f1605e
            r1 = r1[r7]
            if (r1 == 0) goto L93
            luaj.LuaString r2 = r1.f1609a
            if (r2 != 0) goto L66
            goto L93
        L66:
            java.lang.String r2 = r2.g0()
            boolean r3 = r2.equalsIgnoreCase(r6)
            if (r3 == 0) goto L93
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            java.lang.String r5 = "\ndid you mean label '"
            r3.append(r5)
            r3.append(r2)
            java.lang.String r5 = "' at line "
            r3.append(r5)
            int r5 = r1.f1611c
            r3.append(r5)
            r5 = 63
            r3.append(r5)
            java.lang.String r5 = r3.toString()
        L93:
            int r7 = r7 + 1
            goto L57
        L96:
            r4.x1(r5)
            return
    }

    void P(int r2, int r3, g.g.k r4) {
            r1 = this;
            g.c r0 = r1.f1593g
            int r2 = r2 - r3
            int r3 = r4.f1620a
            boolean r3 = r1.G0(r3)
            if (r3 == 0) goto L1a
            r3 = 1
            int r2 = r2 + r3
            if (r2 >= 0) goto L10
            r2 = 0
        L10:
            r0.j1(r4, r2)
            if (r2 <= r3) goto L2b
            int r2 = r2 - r3
            r0.b1(r2)
            goto L2b
        L1a:
            int r3 = r4.f1620a
            if (r3 == 0) goto L21
            r0.o0(r4)
        L21:
            if (r2 <= 0) goto L2b
            short r3 = r0.p
            r0.b1(r2)
            r0.P0(r3, r2)
        L2b:
            return
    }

    void P1(int r6) {
            r5 = this;
            g.c r0 = r5.f1593g
            g.c$a r1 = new g.c$a
            r1.<init>()
            r5.g1()
            int r2 = r0.z0()
            int r3 = r5.h0()
            r4 = 1
            r0.j0(r1, r4)
            r1 = 259(0x103, float:3.63E-43)
            r5.c0(r1)
            r5.S()
            int r1 = r0.H0()
            r0.T0(r1, r2)
            r1 = 262(0x106, float:3.67E-43)
            r2 = 278(0x116, float:3.9E-43)
            r5.Z(r1, r2, r6)
            r0.K0()
            r0.W0(r3)
            return
    }

    void Q(int r4) {
            r3 = this;
            g.c r0 = r3.f1593g
            short r1 = r0.n
            int r1 = r1 + r4
            short r1 = (short) r1
            r0.n = r1
        L8:
            if (r4 <= 0) goto L18
            short r1 = r0.n
            int r1 = r1 - r4
            f.b r1 = r0.A0(r1)
            int r2 = r0.f1578g
            r1.f1557b = r2
            int r4 = r4 + (-1)
            goto L8
        L18:
            return
    }

    void Q1(g.g.k r2) {
            r1 = this;
            r1.g1()
            r1.r0(r2)
            g.c r0 = r1.f1593g
            r0.q0(r2)
            r2 = 93
            r1.c0(r2)
            return
    }

    void R(g.g.e r7, int r8) {
            r6 = this;
            g.g$k r0 = new g.g$k
            r0.<init>()
            g.g$k r1 = r7.f1608b
            int r1 = r1.f1620a
            r2 = 9
            r3 = 1
            r4 = 7
            if (r4 > r1) goto L13
            if (r1 > r2) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            java.lang.String r4 = "syntax error"
            r6.X(r1, r4)
            r1 = 44
            boolean r1 = r6.L1(r1)
            if (r1 == 0) goto L3b
            g.g$e r1 = new g.g$e
            r1.<init>()
            r1.f1607a = r7
            g.g$k r4 = r1.f1608b
            r6.I1(r4)
            g.g$k r4 = r1.f1608b
            int r5 = r4.f1620a
            if (r5 == r2) goto L36
            r6.Y(r7, r4)
        L36:
            int r8 = r8 + r3
            r6.R(r1, r8)
            goto L54
        L3b:
            r1 = 61
            r6.c0(r1)
            int r1 = r6.q0(r0)
            if (r1 == r8) goto L65
            r6.P(r8, r1, r0)
            if (r1 <= r8) goto L54
            g.c r2 = r6.f1593g
            short r4 = r2.p
            int r1 = r1 - r8
            int r4 = r4 - r1
            short r8 = (short) r4
            r2.p = r8
        L54:
            g.c r8 = r6.f1593g
            short r8 = r8.p
            int r8 = r8 - r3
            r1 = 6
            r0.b(r1, r8)
        L5d:
            g.c r8 = r6.f1593g
            g.g$k r7 = r7.f1608b
            r8.l1(r7, r0)
            return
        L65:
            g.c r8 = r6.f1593g
            r8.i1(r0)
            goto L5d
    }

    void R0(luaj.LuaString r10, int r11) {
            r9 = this;
            g.c r0 = r9.f1593g
            g.g$d r1 = r9.l
            g.g$f[] r2 = r1.f1605e
            int r1 = r1.f1606f
            r0.P(r2, r1, r10)
            r0 = 288(0x120, float:4.04E-43)
            r9.c0(r0)
            g.g$d r0 = r9.l
            g.g$f[] r1 = r0.f1605e
            int r2 = r0.f1606f
            int r2 = r2 + 1
            g.g$f[] r4 = g.a.D(r1, r2)
            r0.f1605e = r4
            g.g$d r0 = r9.l
            int r5 = r0.f1606f
            int r1 = r5 + 1
            r0.f1606f = r1
            g.c r0 = r9.f1593g
            int r8 = r0.z0()
            r3 = r9
            r6 = r10
            r7 = r11
            int r10 = r3.d1(r4, r5, r6, r7, r8)
            r9.D1()
            r11 = 0
            boolean r11 = r9.T(r11)
            if (r11 == 0) goto L4b
            g.g$d r11 = r9.l
            g.g$f[] r11 = r11.f1605e
            r11 = r11[r10]
            g.c r0 = r9.f1593g
            g.c$a r0 = r0.f1577f
            short r0 = r0.f1582d
            r11.f1612d = r0
        L4b:
            g.g$d r11 = r9.l
            g.g$f[] r11 = r11.f1605e
            r10 = r11[r10]
            r9.u0(r10)
            return
    }

    void S() {
            r3 = this;
            g.c r0 = r3.f1593g
            g.c$a r1 = new g.c$a
            r1.<init>()
            r2 = 0
            r0.j0(r1, r2)
            r3.F1()
            r0.K0()
            return
    }

    void S0() {
            r2 = this;
            g.h$a r0 = r2.h
            int r1 = r0.f1630a
            int r1 = r1 + (-1)
            r0.f1630a = r1
            return
    }

    boolean T(boolean r3) {
            r2 = this;
            g.g$i r0 = r2.f1591e
            int r0 = r0.f1617a
            r1 = 277(0x115, float:3.88E-43)
            if (r0 == r1) goto L12
            r3 = 289(0x121, float:4.05E-43)
            if (r0 == r3) goto L11
            switch(r0) {
                case 260: goto L11;
                case 261: goto L11;
                case 262: goto L11;
                default: goto Lf;
            }
        Lf:
            r3 = 0
            return r3
        L11:
            r3 = 1
        L12:
            return r3
    }

    void T0(java.lang.String r5, int r6) {
            r4 = this;
            luaj.LuaString r0 = r4.m
            java.lang.String r0 = r0.g0()
            java.lang.String r0 = luaj.b.m(r0)
            g.h$a r1 = r4.h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r3 = 58
            r2.append(r3)
            int r3 = r4.f1589c
            r2.append(r3)
            java.lang.String r3 = ": "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.e(r2)
            if (r6 == 0) goto L5d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = " near "
            r1.append(r5)
            java.lang.String r5 = r4.N1(r6)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            g.h$a r6 = r4.h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "syntax error: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r6.e(r1)
        L5d:
            luaj.d r6 = new luaj.d
            int r1 = r4.f1589c
            r6.<init>(r0, r1, r5)
            throw r6
    }

    void U(g.g.k r4, boolean r5, int r6) {
            r3 = this;
            g.c r0 = new g.c
            r0.<init>()
            g.c$a r1 = new g.c$a
            r1.<init>()
            luaj.h r2 = r3.O()
            r0.f1573b = r2
            r2.h = r6
            r3.i1(r0, r1)
            r1 = 40
            r3.c0(r1)
            if (r5 == 0) goto L25
            java.lang.String r5 = "self"
            r3.c1(r5)
            r5 = 1
            r3.Q(r5)
        L25:
            r3.j1()
            r5 = 41
            r3.c0(r5)
            r3.F1()
            luaj.h r5 = r0.f1573b
            int r0 = r3.f1589c
            r5.i = r0
            r5 = 262(0x106, float:3.67E-43)
            r0 = 265(0x109, float:3.71E-43)
            r3.Z(r5, r0, r6)
            r3.f0(r4)
            r3.d0()
            return
    }

    void U0(g.g.c r5) {
            r4 = this;
            g.g$k r0 = r5.f1596a
            r4.r0(r0)
            g.c r0 = r4.f1593g
            int r1 = r5.f1599d
            r2 = 2147483645(0x7ffffffd, float:NaN)
            java.lang.String r3 = "items in a constructor"
            r0.O(r1, r2, r3)
            int r0 = r5.f1599d
            int r0 = r0 + 1
            r5.f1599d = r0
            int r0 = r5.f1600e
            int r0 = r0 + 1
            r5.f1600e = r0
            return
    }

    void V() {
            r7 = this;
            java.lang.String r0 = "break"
            luaj.LuaString r4 = luaj.LuaString.K2(r0)
            g.g$d r0 = r7.l
            g.g$f[] r1 = r0.f1605e
            int r2 = r0.f1606f
            int r2 = r2 + 1
            g.g$f[] r2 = g.a.D(r1, r2)
            r0.f1605e = r2
            g.g$d r0 = r7.l
            int r3 = r0.f1606f
            int r1 = r3 + 1
            r0.f1606f = r1
            r5 = 0
            g.c r0 = r7.f1593g
            int r6 = r0.f1578g
            r1 = r7
            int r0 = r1.d1(r2, r3, r4, r5, r6)
            g.g$d r1 = r7.l
            g.g$f[] r1 = r1.f1605e
            r0 = r1[r0]
            r7.u0(r0)
            return
    }

    int V0(g.g.h r7) {
            r6 = this;
            r0 = 0
        L1:
            r6.k = r0
        L3:
            int r1 = r6.f1588b
            r2 = -1
            if (r1 == r2) goto L147
            r3 = 32
            if (r1 == r3) goto L142
            r3 = 34
            r4 = 293(0x125, float:4.1E-43)
            if (r1 == r3) goto L13e
            r3 = 39
            if (r1 == r3) goto L13e
            r3 = 91
            r5 = 61
            if (r1 == r3) goto L11e
            r4 = 126(0x7e, float:1.77E-43)
            if (r1 == r4) goto L110
            switch(r1) {
                case 9: goto L142;
                case 10: goto L10b;
                case 11: goto L142;
                case 12: goto L142;
                case 13: goto L10b;
                default: goto L23;
            }
        L23:
            r4 = 290(0x122, float:4.06E-43)
            switch(r1) {
                case 45: goto Lde;
                case 46: goto Lb8;
                case 47: goto La8;
                case 48: goto La3;
                case 49: goto La3;
                case 50: goto La3;
                case 51: goto La3;
                case 52: goto La3;
                case 53: goto La3;
                case 54: goto La3;
                case 55: goto La3;
                case 56: goto La3;
                case 57: goto La3;
                case 58: goto L93;
                default: goto L28;
            }
        L28:
            switch(r1) {
                case 60: goto L7b;
                case 61: goto L130;
                case 62: goto L63;
                default: goto L2b;
            }
        L2b:
            boolean r1 = M0(r1)
            if (r1 != 0) goto L3c
            int r1 = r6.f1588b
            r2 = 95
            if (r1 != r2) goto L38
            goto L3c
        L38:
            r6.h1()
            return r1
        L3c:
            r6.w1()
            int r1 = r6.f1588b
            boolean r1 = L0(r1)
            if (r1 != 0) goto L3c
            char[] r1 = r6.j
            int r2 = r6.k
            luaj.LuaString r0 = r6.f1(r1, r0, r2)
            java.util.Hashtable r1 = g.g.u
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L5e
            int r7 = r1.intValue()
            return r7
        L5e:
            r7.f1616b = r0
            r7 = 292(0x124, float:4.09E-43)
            return r7
        L63:
            r6.h1()
            int r7 = r6.f1588b
            if (r7 != r5) goto L70
            r6.h1()
            r7 = 283(0x11b, float:3.97E-43)
            return r7
        L70:
            r0 = 62
            if (r7 != r0) goto L7a
            r6.h1()
            r7 = 287(0x11f, float:4.02E-43)
            return r7
        L7a:
            return r0
        L7b:
            r6.h1()
            int r7 = r6.f1588b
            if (r7 != r5) goto L88
            r6.h1()
            r7 = 284(0x11c, float:3.98E-43)
            return r7
        L88:
            r0 = 60
            if (r7 != r0) goto L92
            r6.h1()
            r7 = 286(0x11e, float:4.01E-43)
            return r7
        L92:
            return r0
        L93:
            r6.h1()
            int r7 = r6.f1588b
            r0 = 58
            if (r7 == r0) goto L9d
            return r0
        L9d:
            r6.h1()
            r7 = 288(0x120, float:4.04E-43)
            return r7
        La3:
            r0 = 1
            r6.m1(r7, r0)
            return r4
        La8:
            r6.h1()
            int r7 = r6.f1588b
            r0 = 47
            if (r7 != r0) goto Lb7
            r6.h1()
            r7 = 279(0x117, float:3.91E-43)
            return r7
        Lb7:
            return r0
        Lb8:
            r6.w1()
            java.lang.String r1 = "."
            boolean r2 = r6.a0(r1)
            if (r2 == 0) goto Lcf
            boolean r7 = r6.a0(r1)
            if (r7 == 0) goto Lcc
            r7 = 281(0x119, float:3.94E-43)
            return r7
        Lcc:
            r7 = 280(0x118, float:3.92E-43)
            return r7
        Lcf:
            int r1 = r6.f1588b
            boolean r1 = O0(r1)
            if (r1 != 0) goto Lda
            r7 = 46
            return r7
        Lda:
            r6.m1(r7, r0)
            return r4
        Lde:
            r6.h1()
            int r1 = r6.f1588b
            r4 = 45
            if (r1 == r4) goto Le8
            return r4
        Le8:
            r6.h1()
            int r1 = r6.f1588b
            if (r1 != r3) goto Lfd
            int r1 = r6.C1()
            r6.k = r0
            if (r1 < 0) goto Lfd
            r2 = 0
            r6.l1(r2, r1)
            goto L1
        Lfd:
            boolean r1 = r6.j0()
            if (r1 != 0) goto L3
            int r1 = r6.f1588b
            if (r1 == r2) goto L3
            r6.h1()
            goto Lfd
        L10b:
            r6.J0()
            goto L3
        L110:
            r6.h1()
            int r7 = r6.f1588b
            if (r7 != r5) goto L11d
            r6.h1()
            r7 = 285(0x11d, float:4.0E-43)
            return r7
        L11d:
            return r4
        L11e:
            int r0 = r6.C1()
            if (r0 != r2) goto L125
            return r3
        L125:
            if (r0 < 0) goto L12b
            r6.l1(r7, r0)
            return r4
        L12b:
            java.lang.String r7 = "invalid long string delimiter"
            r6.T0(r7, r4)
        L130:
            r6.h1()
            int r7 = r6.f1588b
            if (r7 == r5) goto L138
            return r5
        L138:
            r6.h1()
            r7 = 282(0x11a, float:3.95E-43)
            return r7
        L13e:
            r6.n1(r1, r7)
            return r4
        L142:
            r6.h1()
            goto L3
        L147:
            r7 = 289(0x121, float:4.05E-43)
            return r7
    }

    void W(int r2) {
            r1 = this;
            g.g$i r0 = r1.f1591e
            int r0 = r0.f1617a
            if (r0 == r2) goto L9
            r1.l0(r2)
        L9:
            return
    }

    void W0() {
            r5 = this;
            g.g$k r0 = new g.g$k
            r0.<init>()
            g.c r1 = r5.f1593g
            luaj.LuaString r2 = r5.G1()
            r5.b1(r2)
            r2 = 1
            r5.Q(r2)
            r3 = 0
            int r4 = r5.f1589c
            r5.U(r0, r3, r4)
            short r0 = r1.n
            int r0 = r0 - r2
            f.b r0 = r1.A0(r0)
            int r1 = r1.f1578g
            r0.f1557b = r1
            return
    }

    void X(boolean r1, java.lang.String r2) {
            r0 = this;
            if (r1 != 0) goto L5
            r0.J1(r2)
        L5:
            return
    }

    void X0() {
            r4 = this;
            g.g$k r0 = new g.g$k
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            luaj.LuaString r3 = r4.G1()
            r4.b1(r3)
            int r2 = r2 + 1
            r3 = 44
            boolean r3 = r4.L1(r3)
            if (r3 != 0) goto L7
            r3 = 61
            boolean r3 = r4.L1(r3)
            if (r3 == 0) goto L25
            int r1 = r4.q0(r0)
            goto L27
        L25:
            r0.f1620a = r1
        L27:
            r4.P(r2, r1, r0)
            r4.Q(r2)
            return
    }

    void Y(g.g.e r11, g.g.k r12) {
            r10 = this;
            g.c r0 = r10.f1593g
            short r1 = r0.p
            r2 = 0
            r3 = 0
        L6:
            r4 = 7
            r5 = 1
            if (r11 == 0) goto L37
            g.g$k r6 = r11.f1608b
            int r7 = r6.f1620a
            r8 = 9
            if (r7 != r8) goto L34
            g.g$k$a r6 = r6.f1621b
            short r7 = r6.f1626c
            int r8 = r12.f1620a
            if (r7 != r8) goto L27
            short r7 = r6.f1625b
            g.g$k$a r9 = r12.f1621b
            int r9 = r9.f1628e
            if (r7 != r9) goto L27
            r6.f1626c = r4
            r6.f1625b = r1
            r3 = 1
        L27:
            if (r8 != r4) goto L34
            short r4 = r6.f1624a
            g.g$k$a r7 = r12.f1621b
            int r7 = r7.f1628e
            if (r4 != r7) goto L34
            r6.f1624a = r1
            r3 = 1
        L34:
            g.g$e r11 = r11.f1607a
            goto L6
        L37:
            if (r3 == 0) goto L4a
            int r11 = r12.f1620a
            if (r11 != r4) goto L3f
            r11 = 0
            goto L40
        L3f:
            r11 = 5
        L40:
            g.g$k$a r12 = r12.f1621b
            int r12 = r12.f1628e
            r0.T(r11, r1, r12, r2)
            r0.b1(r5)
        L4a:
            return
    }

    void Y0() {
            r2 = this;
            g.g$i r0 = r2.f1592f
            int r0 = r0.f1617a
            r1 = 289(0x121, float:4.05E-43)
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            g.a.C(r0)
            g.g$i r0 = r2.f1592f
            g.g$h r1 = r0.f1618b
            int r1 = r2.V0(r1)
            r0.f1617a = r1
            return
    }

    void Z(int r3, int r4, int r5) {
            r2 = this;
            boolean r0 = r2.L1(r3)
            if (r0 != 0) goto L48
            int r0 = r2.f1589c
            if (r5 != r0) goto Le
            r2.l0(r3)
            goto L48
        Le:
            g.h$a r0 = r2.h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r2.M1(r3)
            java.lang.String r3 = N(r3)
            r1.append(r3)
            java.lang.String r3 = " expected (to close "
            r1.append(r3)
            java.lang.String r3 = r2.M1(r4)
            java.lang.String r3 = N(r3)
            r1.append(r3)
            java.lang.String r3 = " at line "
            r1.append(r3)
            r1.append(r5)
            r3 = 41
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r0.e(r3)
            r2.J1(r3)
        L48:
            return
    }

    boolean a0(java.lang.String r2) {
            r1 = this;
            int r0 = r1.f1588b
            int r2 = r2.indexOf(r0)
            if (r2 >= 0) goto La
            r2 = 0
            return r2
        La:
            r1.w1()
            r2 = 1
            return r2
    }

    public void a1(g.c r3) {
            r2 = this;
            g.c$a r0 = new g.c$a
            r0.<init>()
            r2.i1(r3, r0)
            g.c r3 = r2.f1593g
            luaj.h r3 = r3.f1573b
            r0 = 1
            r3.k = r0
            g.g$k r3 = new g.g$k
            r3.<init>()
            r0 = 7
            r1 = 0
            r3.b(r0, r1)
            g.c r0 = r2.f1593g
            luaj.LuaString r1 = r2.n
            r0.O0(r1, r3)
            r2.g1()
            r2.F1()
            r3 = 289(0x121, float:4.05E-43)
            r2.W(r3)
            r2.d0()
            return
    }

    void b0(g.g.k r2) {
            r1 = this;
            luaj.LuaString r0 = r1.G1()
            r1.g0(r2, r0)
            return
    }

    void b1(luaj.LuaString r6) {
            r5 = this;
            int r6 = r5.s1(r6)
            g.c r0 = r5.f1593g
            g.g$d r1 = r5.l
            int r1 = r1.f1602b
            r2 = 1
            int r1 = r1 + r2
            r3 = 200(0xc8, float:2.8E-43)
            java.lang.String r4 = "local variables"
            r0.O(r1, r3, r4)
            g.g$d r0 = r5.l
            g.g$j[] r1 = r0.f1601a
            if (r1 == 0) goto L1f
            int r3 = r0.f1602b
            int r3 = r3 + r2
            int r4 = r1.length
            if (r3 <= r4) goto L2d
        L1f:
            int r3 = r0.f1602b
            int r3 = r3 * 2
            int r2 = java.lang.Math.max(r2, r3)
            g.g$j[] r1 = g.a.J(r1, r2)
            r0.f1601a = r1
        L2d:
            g.g$d r0 = r5.l
            g.g$j[] r1 = r0.f1601a
            int r2 = r0.f1602b
            int r3 = r2 + 1
            r0.f1602b = r3
            g.g$j r0 = new g.g$j
            r0.<init>(r6)
            r1[r2] = r0
            return
    }

    void c0(int r1) {
            r0 = this;
            r0.W(r1)
            r0.g1()
            return
    }

    void c1(java.lang.String r1) {
            r0 = this;
            luaj.LuaString r1 = r0.e1(r1)
            r0.b1(r1)
            return
    }

    void d0() {
            r5 = this;
            g.c r0 = r5.f1593g
            luaj.h r1 = r0.f1573b
            r2 = 0
            r0.c1(r2, r2)
            r0.K0()
            int[] r3 = r1.f1722b
            int r4 = r0.f1578g
            int[] r3 = g.a.F(r3, r4)
            r1.f1722b = r3
            int[] r3 = r1.f1724d
            int r4 = r0.f1578g
            int[] r3 = g.a.F(r3, r4)
            r1.f1724d = r3
            luaj.LuaValue[] r3 = r1.f1721a
            int r4 = r0.j
            luaj.LuaValue[] r3 = g.a.K(r3, r4)
            r1.f1721a = r3
            luaj.h[] r3 = r1.f1723c
            int r4 = r0.k
            luaj.h[] r3 = g.a.L(r3, r4)
            r1.f1723c = r3
            f.b[] r3 = r1.f1725e
            short r4 = r0.m
            f.b[] r3 = g.a.G(r3, r4)
            r1.f1725e = r3
            f.d[] r3 = r1.f1726f
            short r4 = r0.o
            f.d[] r3 = g.a.H(r3, r4)
            r1.f1726f = r3
            g.c$a r1 = r0.f1577f
            if (r1 != 0) goto L4c
            r2 = 1
        L4c:
            g.a.C(r2)
            g.c r0 = r0.f1575d
            r5.f1593g = r0
            return
    }

    int d1(g.g.f[] r3, int r4, luaj.LuaString r5, int r6, int r7) {
            r2 = this;
            g.g$f r0 = new g.g$f
            g.c r1 = r2.f1593g
            short r1 = r1.n
            r0.<init>(r5, r7, r6, r1)
            r3[r4] = r0
            return r4
    }

    void e0(int r8, g.g.f r9) {
            r7 = this;
            g.c r0 = r7.f1593g
            g.g$d r1 = r7.l
            g.g$f[] r1 = r1.f1603c
            r2 = r1[r8]
            luaj.LuaString r3 = r2.f1609a
            luaj.LuaString r4 = r9.f1609a
            boolean r3 = r3.P0(r4)
            g.a.C(r3)
            short r3 = r2.f1612d
            short r4 = r9.f1612d
            if (r3 >= r4) goto L56
            f.b r3 = r0.A0(r3)
            luaj.LuaString r3 = r3.f1556a
            g.h$a r4 = r7.h
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "<goto "
            r5.append(r6)
            luaj.LuaString r6 = r2.f1609a
            r5.append(r6)
            java.lang.String r6 = "> at line "
            r5.append(r6)
            int r6 = r2.f1611c
            r5.append(r6)
            java.lang.String r6 = " jumps into the scope of local '"
            r5.append(r6)
            java.lang.String r3 = r3.g0()
            r5.append(r3)
            r3 = 39
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r3 = r4.e(r3)
            r7.x1(r3)
        L56:
            int r2 = r2.f1610b
            int r9 = r9.f1610b
            r0.T0(r2, r9)
            int r9 = r8 + 1
            g.g$d r0 = r7.l
            int r0 = r0.f1604d
            int r0 = r0 - r8
            int r0 = r0 + (-1)
            java.lang.System.arraycopy(r1, r9, r1, r8, r0)
            g.g$d r8 = r7.l
            int r9 = r8.f1604d
            int r9 = r9 + (-1)
            r8.f1604d = r9
            r8 = 0
            r1[r9] = r8
            return
    }

    luaj.LuaString e1(java.lang.String r2) {
            r1 = this;
            g.h$a r0 = r1.h
            luaj.LuaString r2 = r0.c(r2)
            return r2
    }

    void f0(g.g.k r5) {
            r4 = this;
            g.c r0 = r4.f1593g
            g.c r0 = r0.f1575d
            int r1 = r0.k
            int r1 = r1 + (-1)
            r2 = 37
            r3 = 0
            int r1 = r0.U(r2, r3, r1)
            r2 = 11
            r5.b(r2, r1)
            r0.o0(r5)
            return
    }

    luaj.LuaString f1(char[] r3, int r4, int r5) {
            r2 = this;
            g.h$a r0 = r2.h
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3, r4, r5)
            luaj.LuaString r3 = r0.c(r1)
            return r3
    }

    void g0(g.g.k r2, luaj.LuaString r3) {
            r1 = this;
            g.c r0 = r1.f1593g
            int r3 = r0.m1(r3)
            r0 = 4
            r2.b(r0, r3)
            return
    }

    void g1() {
            r3 = this;
            int r0 = r3.f1589c
            r3.f1590d = r0
            g.g$i r0 = r3.f1592f
            int r1 = r0.f1617a
            r2 = 289(0x121, float:4.05E-43)
            if (r1 == r2) goto L16
            g.g$i r1 = r3.f1591e
            r1.a(r0)
            g.g$i r0 = r3.f1592f
            r0.f1617a = r2
            goto L20
        L16:
            g.g$i r0 = r3.f1591e
            g.g$h r1 = r0.f1618b
            int r1 = r3.V0(r1)
            r0.f1617a = r1
        L20:
            return
    }

    int h0() {
            r3 = this;
            g.g$k r0 = new g.g$k
            r0.<init>()
            r3.r0(r0)
            int r1 = r0.f1620a
            r2 = 1
            if (r1 != r2) goto L10
            r1 = 3
            r0.f1620a = r1
        L10:
            g.c r1 = r3.f1593g
            r1.C0(r0)
            g.e r0 = r0.f1623d
            int r0 = r0.f1587a
            return r0
    }

    void h1() {
            r1 = this;
            java.io.InputStream r0 = r1.i     // Catch: java.io.IOException -> L9
            int r0 = r0.read()     // Catch: java.io.IOException -> L9
            r1.f1588b = r0     // Catch: java.io.IOException -> L9
            goto L10
        L9:
            r0 = move-exception
            r0.printStackTrace()
            r0 = -1
            r1.f1588b = r0
        L10:
            return
    }

    void i0(g.g.k r9) {
            r8 = this;
            g.c r0 = r8.f1593g
            int r1 = r8.f1589c
            r2 = 11
            r3 = 0
            int r4 = r0.T(r2, r3, r3, r3)
            g.g$c r5 = new g.g$c
            r5.<init>()
            r5.f1600e = r3
            r5.f1598c = r3
            r5.f1599d = r3
            r5.f1597b = r9
            r9.b(r2, r4)
            g.g$k r2 = r5.f1596a
            r2.b(r3, r3)
            r0.o0(r9)
            r9 = 123(0x7b, float:1.72E-43)
            r8.c0(r9)
        L28:
            g.g$k r2 = r5.f1596a
            int r2 = r2.f1620a
            if (r2 == 0) goto L35
            int r2 = r5.f1600e
            if (r2 <= 0) goto L33
            goto L35
        L33:
            r2 = 0
            goto L36
        L35:
            r2 = 1
        L36:
            g.a.C(r2)
            g.g$i r2 = r8.f1591e
            int r2 = r2.f1617a
            r6 = 125(0x7d, float:1.75E-43)
            if (r2 != r6) goto L42
            goto L74
        L42:
            r0.R(r5)
            g.g$i r2 = r8.f1591e
            int r2 = r2.f1617a
            r7 = 91
            if (r2 == r7) goto L61
            r7 = 292(0x124, float:4.09E-43)
            if (r2 == r7) goto L55
        L51:
            r8.U0(r5)
            goto L64
        L55:
            r8.Y0()
            g.g$i r2 = r8.f1592f
            int r2 = r2.f1617a
            r7 = 61
            if (r2 == r7) goto L61
            goto L51
        L61:
            r8.r1(r5)
        L64:
            r2 = 44
            boolean r2 = r8.L1(r2)
            if (r2 != 0) goto L28
            r2 = 59
            boolean r2 = r8.L1(r2)
            if (r2 != 0) goto L28
        L74:
            r8.Z(r6, r9, r1)
            r0.J0(r5)
            g.d r9 = new g.d
            luaj.h r0 = r0.f1573b
            int[] r0 = r0.f1722b
            r9.<init>(r0, r4)
            int r0 = r5.f1599d
            int r0 = Z0(r0)
            g.a.x(r9, r0)
            int r0 = r5.f1598c
            int r0 = Z0(r0)
            g.a.z(r9, r0)
            return
    }

    void i1(g.c r4, g.c.a r5) {
            r3 = this;
            g.c r0 = r3.f1593g
            r4.f1575d = r0
            r4.f1576e = r3
            r3.f1593g = r4
            r0 = 0
            r4.f1578g = r0
            r1 = -1
            r4.h = r1
            g.e r2 = new g.e
            r2.<init>(r1)
            r4.i = r2
            r4.p = r0
            r4.j = r0
            r4.k = r0
            r4.o = r0
            r4.m = r0
            r4.n = r0
            g.g$d r1 = r3.l
            int r1 = r1.f1602b
            r4.l = r1
            r1 = 0
            r4.f1577f = r1
            luaj.h r1 = r4.f1573b
            luaj.LuaString r2 = r3.m
            r1.f1727g = r2
            r2 = 2
            r1.l = r2
            r4.j0(r5, r0)
            return
    }

    boolean j0() {
            r2 = this;
            int r0 = r2.f1588b
            r1 = 10
            if (r0 == r1) goto Ld
            r1 = 13
            if (r0 != r1) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    void j1() {
            r5 = this;
            g.c r0 = r5.f1593g
            luaj.h r1 = r0.f1573b
            r2 = 0
            r1.k = r2
            g.g$i r3 = r5.f1591e
            int r3 = r3.f1617a
            r4 = 41
            if (r3 == r4) goto L57
        Lf:
            g.g$i r3 = r5.f1591e
            int r3 = r3.f1617a
            r4 = 281(0x119, float:3.94E-43)
            if (r3 == r4) goto L45
            r4 = 292(0x124, float:4.09E-43)
            if (r3 == r4) goto L3b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<name> or "
            r3.append(r4)
            java.lang.String r4 = "..."
            java.lang.String r4 = M(r4)
            r3.append(r4)
            java.lang.String r4 = " expected"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5.J1(r3)
            goto L4b
        L3b:
            luaj.LuaString r3 = r5.G1()
            r5.b1(r3)
            int r2 = r2 + 1
            goto L4b
        L45:
            r5.g1()
            r3 = 1
            r1.k = r3
        L4b:
            int r3 = r1.k
            if (r3 != 0) goto L57
            r3 = 44
            boolean r3 = r5.L1(r3)
            if (r3 != 0) goto Lf
        L57:
            r5.Q(r2)
            short r2 = r0.n
            r1.j = r2
            r0.b1(r2)
            return
    }

    void k0() {
            r2 = this;
            g.h$a r0 = r2.h
            int r1 = r0.f1630a
            int r1 = r1 + 1
            r0.f1630a = r1
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 <= r0) goto L12
            java.lang.String r0 = "chunk has too many syntax levels"
            r1 = 0
            r2.T0(r0, r1)
        L12:
            return
    }

    void k1(g.g.k r4) {
            r3 = this;
            g.g$i r0 = r3.f1591e
            int r0 = r0.f1617a
            r1 = 40
            if (r0 == r1) goto L16
            r1 = 292(0x124, float:4.09E-43)
            if (r0 == r1) goto L12
            java.lang.String r4 = "unexpected symbol"
            r3.J1(r4)
            return
        L12:
            r3.A1(r4)
            return
        L16:
            int r0 = r3.f1589c
            r3.g1()
            r3.r0(r4)
            r2 = 41
            r3.Z(r2, r1, r0)
            g.c r0 = r3.f1593g
            r0.i0(r4)
            return
    }

    void l0(int r3) {
            r2 = this;
            g.h$a r0 = r2.h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r2.M1(r3)
            java.lang.String r3 = N(r3)
            r1.append(r3)
            java.lang.String r3 = " expected"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r0.e(r3)
            r2.J1(r3)
            return
    }

    void l1(g.g.h r6, int r7) {
            r5 = this;
            r5.w1()
            boolean r0 = r5.j0()
            if (r0 == 0) goto Lc
            r5.J0()
        Lc:
            r0 = 0
            r1 = 0
        Le:
            if (r1 != 0) goto L60
            int r2 = r5.f1588b
            r3 = -1
            if (r2 == r3) goto L56
            r3 = 10
            if (r2 == r3) goto L4b
            r4 = 13
            if (r2 == r4) goto L4b
            r3 = 91
            if (r2 == r3) goto L3a
            r3 = 93
            if (r2 == r3) goto L2f
            if (r6 == 0) goto L2b
            r5.w1()
            goto Le
        L2b:
            r5.h1()
            goto Le
        L2f:
            int r2 = r5.C1()
            if (r2 != r7) goto Le
            r5.w1()
            r1 = 1
            goto Le
        L3a:
            int r2 = r5.C1()
            if (r2 != r7) goto Le
            r5.w1()
            if (r7 != 0) goto Le
            java.lang.String r2 = "nesting of [[...]] is deprecated"
        L47:
            r5.T0(r2, r3)
            goto Le
        L4b:
            r5.v1(r3)
            r5.J0()
            if (r6 != 0) goto Le
            r5.k = r0
            goto Le
        L56:
            if (r6 == 0) goto L5b
            java.lang.String r2 = "unfinished long string"
            goto L5d
        L5b:
            java.lang.String r2 = "unfinished long comment"
        L5d:
            r3 = 289(0x121, float:4.05E-43)
            goto L47
        L60:
            if (r6 == 0) goto L77
            g.h$a r0 = r5.h
            char[] r1 = r5.j
            int r7 = r7 + 2
            int r2 = r5.k
            int r3 = r7 * 2
            int r2 = r2 - r3
            luaj.LuaString r7 = luaj.LuaString.n3(r1, r7, r2)
            luaj.LuaString r7 = r0.d(r7)
            r6.f1616b = r7
        L77:
            return
    }

    void m0(int r4, java.lang.String r5) {
            r3 = this;
            r0 = 92
            r3.v1(r0)
            r0 = 0
        L6:
            if (r0 >= r4) goto L15
            int[] r1 = r3.q
            r1 = r1[r0]
            r2 = -1
            if (r1 == r2) goto L15
            r3.v1(r1)
            int r0 = r0 + 1
            goto L6
        L15:
            r4 = 293(0x125, float:4.1E-43)
            r3.T0(r5, r4)
            return
    }

    void m1(g.g.h r11, boolean r12) {
            r10 = this;
            int r0 = r10.f1588b
            r10.w1()
            r1 = 0
            r2 = 48
            if (r0 != r2) goto L14
            java.lang.String r0 = "Xx"
            boolean r0 = r10.a0(r0)
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1a
            java.lang.String r3 = "Pp"
            goto L1c
        L1a:
            java.lang.String r3 = "Ee"
        L1c:
            boolean r4 = r10.a0(r3)
            if (r4 == 0) goto L28
            java.lang.String r12 = "+-"
            r10.a0(r12)
            r12 = 0
        L28:
            int r4 = r10.f1588b
            if (r4 < r2) goto L30
            r5 = 57
            if (r4 <= r5) goto L42
        L30:
            if (r0 == 0) goto L46
            r5 = 97
            if (r4 < r5) goto L3a
            r5 = 102(0x66, float:1.43E-43)
            if (r4 <= r5) goto L42
        L3a:
            r5 = 65
            if (r4 < r5) goto L46
            r5 = 70
            if (r4 > r5) goto L46
        L42:
            r10.w1()
            goto L1c
        L46:
            r5 = 46
            if (r4 != r5) goto L4f
            r10.w1()
            r12 = 0
            goto L1c
        L4f:
            r3 = 19
            if (r0 != 0) goto L5a
            if (r12 == 0) goto L5a
            int r4 = r10.k
            if (r4 <= r3) goto L5a
            r12 = 0
        L5a:
            if (r0 == 0) goto L6d
            g.g$b r12 = r10.p     // Catch: java.lang.NumberFormatException -> L6b
            char[] r0 = r10.j     // Catch: java.lang.NumberFormatException -> L6b
            r12.f1594a = r0     // Catch: java.lang.NumberFormatException -> L6b
            int r0 = r10.k     // Catch: java.lang.NumberFormatException -> L6b
            r12.f1595b = r0     // Catch: java.lang.NumberFormatException -> L6b
            luaj.LuaValue r12 = luaj.LuaValue.N1(r12)     // Catch: java.lang.NumberFormatException -> L6b
            goto Lc5
        L6b:
            r11 = move-exception
            goto Lc8
        L6d:
            if (r12 == 0) goto Lb7
            char[] r12 = r10.j     // Catch: java.lang.NumberFormatException -> L6b
            int r0 = r10.k     // Catch: java.lang.NumberFormatException -> L6b
            r4 = 10
            r6 = 0
            if (r0 == r3) goto L8a
        L79:
            if (r1 >= r0) goto L85
            long r6 = r6 * r4
            char r3 = r12[r1]     // Catch: java.lang.NumberFormatException -> L6b
            int r3 = r3 - r2
            long r8 = (long) r3     // Catch: java.lang.NumberFormatException -> L6b
            long r6 = r6 + r8
            int r1 = r1 + 1
            goto L79
        L85:
            luaj.LuaLong r12 = luaj.LuaLong.I2(r6)     // Catch: java.lang.NumberFormatException -> L6b
            goto Lc5
        L8a:
            r3 = 0
        L8b:
            r8 = 18
            if (r3 >= r8) goto L99
            long r6 = r6 * r4
            char r8 = r12[r3]     // Catch: java.lang.NumberFormatException -> L6b
            int r8 = r8 - r2
            long r8 = (long) r8     // Catch: java.lang.NumberFormatException -> L6b
            long r6 = r6 + r8
            int r3 = r3 + 1
            goto L8b
        L99:
            long r4 = r4 * r6
            char r3 = r12[r8]     // Catch: java.lang.NumberFormatException -> L6b
            int r3 = r3 - r2
            long r2 = (long) r3     // Catch: java.lang.NumberFormatException -> L6b
            long r4 = r4 + r2
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto Lb2
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.NumberFormatException -> L6b
            r2.<init>(r12, r1, r0)     // Catch: java.lang.NumberFormatException -> L6b
            double r0 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.NumberFormatException -> L6b
        Lad:
            luaj.LuaNumber r12 = luaj.LuaDouble.J2(r0)     // Catch: java.lang.NumberFormatException -> L6b
            goto Lc5
        Lb2:
            luaj.LuaLong r12 = luaj.LuaLong.I2(r4)     // Catch: java.lang.NumberFormatException -> L6b
            goto Lc5
        Lb7:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.NumberFormatException -> L6b
            char[] r0 = r10.j     // Catch: java.lang.NumberFormatException -> L6b
            int r2 = r10.k     // Catch: java.lang.NumberFormatException -> L6b
            r12.<init>(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L6b
            double r0 = java.lang.Double.parseDouble(r12)     // Catch: java.lang.NumberFormatException -> L6b
            goto Lad
        Lc5:
            r11.f1615a = r12     // Catch: java.lang.NumberFormatException -> L6b
            goto Le7
        Lc8:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "malformed number ("
            r12.append(r0)
            java.lang.String r11 = r11.getMessage()
            r12.append(r11)
            java.lang.String r11 = ")"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r12 = 290(0x122, float:4.06E-43)
            r10.T0(r11, r12)
        Le7:
            return
    }

    void n0(int r4, int r5, java.lang.String r6) {
            r3 = this;
            int[] r0 = r3.q
            r1 = 0
            r2 = 117(0x75, float:1.64E-43)
            r0[r1] = r2
            r1 = 1
            r0[r1] = r4
            r3.m0(r5, r6)
            return
    }

    void n1(int r6, g.g.h r7) {
            r5 = this;
        L0:
            r5.w1()
        L3:
            int r0 = r5.f1588b
            r1 = 1
            if (r0 == r6) goto L82
            r2 = -1
            java.lang.String r3 = "unfinished string"
            if (r0 == r2) goto L7f
            r2 = 10
            if (r0 == r2) goto L79
            r4 = 13
            if (r0 == r4) goto L79
            r3 = 92
            if (r0 == r3) goto L1a
            goto L0
        L1a:
            r5.h1()
            int r0 = r5.f1588b
            switch(r0) {
                case -1: goto L3;
                case 10: goto L72;
                case 13: goto L72;
                case 34: goto L0;
                case 39: goto L0;
                case 92: goto L0;
                case 97: goto L6a;
                case 98: goto L67;
                case 102: goto L64;
                case 110: goto L6b;
                case 114: goto L61;
                case 116: goto L5e;
                case 117: goto L5a;
                case 118: goto L57;
                case 120: goto L52;
                case 122: goto L3d;
                default: goto L22;
            }
        L22:
            boolean r0 = O0(r0)
            if (r0 != 0) goto L35
            int[] r0 = r5.q
            r2 = 0
            int r3 = r5.f1588b
            r0[r2] = r3
            java.lang.String r0 = "invalid escape sequence"
            r5.m0(r1, r0)
            goto L3
        L35:
            int r0 = r5.o1()
            r5.v1(r0)
            goto L3
        L3d:
            r5.h1()
        L40:
            int r0 = r5.f1588b
            boolean r0 = P0(r0)
            if (r0 == 0) goto L3
            boolean r0 = r5.j0()
            if (r0 == 0) goto L3d
            r5.J0()
            goto L40
        L52:
            int r2 = r5.p1()
            goto L6b
        L57:
            r2 = 11
            goto L6b
        L5a:
            r5.q1()
            goto L3
        L5e:
            r2 = 9
            goto L6b
        L61:
            r2 = 13
            goto L6b
        L64:
            r2 = 12
            goto L6b
        L67:
            r2 = 8
            goto L6b
        L6a:
            r2 = 7
        L6b:
            r5.v1(r2)
            r5.h1()
            goto L3
        L72:
            r5.v1(r2)
            r5.J0()
            goto L3
        L79:
            r0 = 293(0x125, float:4.1E-43)
        L7b:
            r5.T0(r3, r0)
            goto L3
        L7f:
            r0 = 289(0x121, float:4.05E-43)
            goto L7b
        L82:
            r5.w1()
            g.h$a r6 = r5.h
            char[] r0 = r5.j
            int r2 = r5.k
            int r2 = r2 + (-2)
            luaj.LuaString r0 = luaj.LuaString.n3(r0, r1, r2)
            luaj.LuaString r6 = r6.d(r0)
            r7.f1616b = r6
            return
    }

    void o0(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 123(0x7b, float:1.72E-43)
            r1.n0(r0, r2, r3)
            return
    }

    int o1() {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 3
            if (r0 >= r2) goto L1e
            int r2 = r5.f1588b
            boolean r2 = O0(r2)
            if (r2 == 0) goto L1e
            int[] r2 = r5.q
            int r3 = r5.f1588b
            r2[r0] = r3
            int r1 = r1 * 10
            int r1 = r1 + r3
            int r1 = r1 + (-48)
            r5.h1()
            int r0 = r0 + 1
            goto L2
        L1e:
            r2 = 255(0xff, float:3.57E-43)
            if (r1 <= r2) goto L2f
            int[] r2 = r5.q
            int r3 = r0 + 1
            int r4 = r5.f1588b
            r2[r0] = r4
            java.lang.String r0 = "decimal escape too large"
            r5.m0(r3, r0)
        L2f:
            return r1
    }

    int p0() {
            r3 = this;
            g.g$k r0 = new g.g$k
            r0.<init>()
            r3.r0(r0)
            int r1 = r0.f1620a
            g.c r2 = r3.f1593g
            r2.o0(r0)
            return r1
    }

    int p1() {
            r6 = this;
            r0 = 0
            r1 = 1
            r2 = 0
        L3:
            r3 = 3
            if (r1 >= r3) goto L2c
            r6.h1()
            int[] r3 = r6.q
            int r4 = r6.f1588b
            r3[r1] = r4
            boolean r3 = Q0(r4)
            if (r3 != 0) goto L22
            int[] r3 = r6.q
            r5 = 120(0x78, float:1.68E-43)
            r3[r0] = r5
            int r3 = r1 + 1
            java.lang.String r5 = "hexadecimal digit expected"
            r6.m0(r3, r5)
        L22:
            int r2 = r2 << 4
            int r3 = H0(r4)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L3
        L2c:
            return r2
    }

    int q0(g.g.k r3) {
            r2 = this;
            r2.r0(r3)
            r0 = 1
        L4:
            r1 = 44
            boolean r1 = r2.L1(r1)
            if (r1 == 0) goto L17
            g.c r1 = r2.f1593g
            r1.o0(r3)
            r2.r0(r3)
            int r0 = r0 + 1
            goto L4
        L17:
            return r0
    }

    void q1() {
            r9 = this;
            r9.h1()
            int r0 = r9.f1588b
            r1 = 123(0x7b, float:1.72E-43)
            java.lang.String r2 = "'"
            r3 = 2
            if (r0 == r1) goto L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "missing '{', got '"
            r1.append(r4)
            char r4 = (char) r0
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.n0(r0, r3, r1)
        L24:
            r0 = 0
            r1 = 2
            r4 = 0
        L27:
            r9.h1()
            r5 = 23
            if (r1 != r5) goto L33
            java.lang.String r5 = "unicode escape too long"
            r9.o0(r1, r5)
        L33:
            int[] r5 = r9.q
            int r6 = r9.f1588b
            r5[r1] = r6
            boolean r5 = Q0(r6)
            if (r5 != 0) goto L94
            if (r1 != r3) goto L5a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "hexadecimal digit expected, got '"
            r3.append(r5)
            char r5 = (char) r6
            r3.append(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r5 = 3
            r9.o0(r5, r3)
        L5a:
            r3 = 125(0x7d, float:1.75E-43)
            if (r6 == r3) goto L78
            int r1 = r1 + 1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "missing '}', got '"
            r3.append(r5)
            char r5 = (char) r6
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r9.o0(r1, r2)
        L78:
            java.lang.String r1 = new java.lang.String
            char[] r2 = java.lang.Character.toChars(r4)
            r1.<init>(r2)
            byte[] r1 = r1.getBytes()
            int r2 = r1.length
        L86:
            if (r0 >= r2) goto L90
            r3 = r1[r0]
            r9.v1(r3)
            int r0 = r0 + 1
            goto L86
        L90:
            r9.h1()
            return
        L94:
            int r4 = r4 << 4
            int r5 = H0(r6)
            int r4 = r4 + r5
            r5 = 1114111(0x10ffff, float:1.561202E-39)
            if (r4 <= r5) goto Lcb
            int r6 = r1 + 1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "UTF-8 value too large: 0x"
            r7.append(r8)
            java.lang.String r8 = java.lang.Integer.toHexString(r4)
            r7.append(r8)
            java.lang.String r8 = " (max allowed = 0x"
            r7.append(r8)
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            r7.append(r5)
            java.lang.String r5 = ")"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r9.o0(r6, r5)
        Lcb:
            int r1 = r1 + 1
            goto L27
    }

    void r0(g.g.k r2) {
            r1 = this;
            r0 = 0
            r1.H1(r2, r0)
            return
    }

    void r1(g.g.c r8) {
            r7 = this;
            g.c r0 = r7.f1593g
            short r1 = r0.p
            g.g$k r2 = new g.g$k
            r2.<init>()
            g.g$k r3 = new g.g$k
            r3.<init>()
            g.g$i r4 = r7.f1591e
            int r4 = r4.f1617a
            r5 = 292(0x124, float:4.09E-43)
            if (r4 != r5) goto L24
            int r4 = r8.f1598c
            r5 = 2147483645(0x7ffffffd, float:NaN)
            java.lang.String r6 = "items in a constructor"
            r0.O(r4, r5, r6)
            r7.b0(r2)
            goto L27
        L24:
            r7.Q1(r2)
        L27:
            int r4 = r8.f1598c
            int r4 = r4 + 1
            r8.f1598c = r4
            r4 = 61
            r7.c0(r4)
            int r2 = r0.l0(r2)
            r7.r0(r3)
            g.g$k r8 = r8.f1597b
            g.g$k$a r8 = r8.f1621b
            int r8 = r8.f1628e
            int r3 = r0.l0(r3)
            r4 = 10
            r0.T(r4, r8, r2, r3)
            short r8 = (short) r1
            r0.p = r8
            return
    }

    void s0() {
            r5 = this;
            g.c r0 = r5.f1593g
            g.g$e r1 = new g.g$e
            r1.<init>()
            g.g$k r2 = r1.f1608b
            r5.I1(r2)
            g.g$i r2 = r5.f1591e
            int r2 = r2.f1617a
            r3 = 61
            r4 = 1
            if (r2 == r3) goto L34
            r3 = 44
            if (r2 != r3) goto L1a
            goto L34
        L1a:
            g.g$k r2 = r1.f1608b
            int r2 = r2.f1620a
            r3 = 12
            if (r2 != r3) goto L24
            r2 = 1
            goto L25
        L24:
            r2 = 0
        L25:
            java.lang.String r3 = "syntax error"
            r5.X(r2, r3)
            g.g$k r1 = r1.f1608b
            g.d r0 = r0.w0(r1)
            g.a.z(r0, r4)
            goto L3a
        L34:
            r0 = 0
            r1.f1607a = r0
            r5.R(r1, r4)
        L3a:
            return
    }

    int s1(luaj.LuaString r6) {
            r5 = this;
            g.c r0 = r5.f1593g
            luaj.h r1 = r0.f1573b
            f.b[] r2 = r1.f1725e
            if (r2 == 0) goto Lf
            short r3 = r0.m
            int r3 = r3 + 1
            int r4 = r2.length
            if (r3 <= r4) goto L1b
        Lf:
            short r3 = r0.m
            int r3 = r3 * 2
            int r3 = r3 + 1
            f.b[] r2 = g.a.G(r2, r3)
            r1.f1725e = r2
        L1b:
            f.b[] r1 = r1.f1725e
            short r2 = r0.m
            f.b r3 = new f.b
            r4 = 0
            r3.<init>(r6, r4, r4)
            r1[r2] = r3
            short r6 = r0.m
            int r1 = r6 + 1
            short r1 = (short) r1
            r0.m = r1
            return r6
    }

    void t0(g.g.k r3) {
            r2 = this;
            g.c r0 = r2.f1593g
            g.g$k r1 = new g.g$k
            r1.<init>()
            r0.n0(r3)
            r2.g1()
            r2.b0(r1)
            r0.E0(r3, r1)
            return
    }

    void t1(int r6) {
            r5 = this;
            g.c r0 = r5.f1593g
            int r1 = r0.z0()
            g.c$a r2 = new g.c$a
            r2.<init>()
            g.c$a r3 = new g.c$a
            r3.<init>()
            r4 = 1
            r0.j0(r2, r4)
            r2 = 0
            r0.j0(r3, r2)
            r5.g1()
            r5.F1()
            r2 = 277(0x115, float:3.88E-43)
            r4 = 273(0x111, float:3.83E-43)
            r5.Z(r2, r4, r6)
            int r6 = r5.h0()
            boolean r2 = r3.f1583e
            if (r2 == 0) goto L32
            short r2 = r3.f1582d
            r0.S0(r6, r2)
        L32:
            r0.K0()
            r0.T0(r6, r1)
            r0.K0()
            return
    }

    void u0(g.g.f r5) {
            r4 = this;
            g.g$d r0 = r4.l
            g.g$f[] r0 = r0.f1603c
            g.c r1 = r4.f1593g
            g.c$a r1 = r1.f1577f
            short r1 = r1.f1581c
        La:
            g.g$d r2 = r4.l
            int r2 = r2.f1604d
            if (r1 >= r2) goto L23
            r2 = r0[r1]
            luaj.LuaString r2 = r2.f1609a
            luaj.LuaString r3 = r5.f1609a
            boolean r2 = r2.P0(r3)
            if (r2 == 0) goto L20
            r4.e0(r1, r5)
            goto La
        L20:
            int r1 = r1 + 1
            goto La
        L23:
            return
    }

    void u1() {
            r8 = this;
            g.c r0 = r8.f1593g
            g.g$k r1 = new g.g$k
            r1.<init>()
            r2 = 1
            boolean r3 = r8.T(r2)
            r4 = 59
            r5 = 0
            if (r3 != 0) goto L66
            g.g$i r3 = r8.f1591e
            int r3 = r3.f1617a
            if (r3 != r4) goto L18
            goto L66
        L18:
            int r3 = r8.q0(r1)
            int r6 = r1.f1620a
            boolean r6 = r8.G0(r6)
            if (r6 == 0) goto L4e
            r0.h1(r1)
            int r6 = r1.f1620a
            r7 = 12
            if (r6 != r7) goto L49
            if (r3 != r2) goto L49
            g.d r3 = r0.w0(r1)
            r6 = 30
            g.a.B(r3, r6)
            int r1 = r0.v0(r1)
            int r1 = luaj.b.c(r1)
            short r3 = r0.n
            if (r1 != r3) goto L45
            goto L46
        L45:
            r2 = 0
        L46:
            g.a.C(r2)
        L49:
            short r5 = r0.n
            r1 = -1
            r3 = -1
            goto L67
        L4e:
            if (r3 != r2) goto L55
            int r5 = r0.m0(r1)
            goto L67
        L55:
            r0.o0(r1)
            short r1 = r0.n
            short r6 = r0.p
            int r6 = r6 - r1
            if (r3 != r6) goto L60
            goto L61
        L60:
            r2 = 0
        L61:
            g.a.C(r2)
            r5 = r1
            goto L67
        L66:
            r3 = 0
        L67:
            r0.c1(r5, r3)
            r8.L1(r4)
            return
    }

    boolean v0(int r8) {
            r7 = this;
            g.c r0 = r7.f1593g
            g.c$a r0 = r0.f1577f
            g.g$d r1 = r7.l
            g.g$f[] r2 = r1.f1603c
            r2 = r2[r8]
            short r3 = r0.f1580b
        Lc:
            int r4 = r1.f1606f
            if (r3 >= r4) goto L3d
            g.g$f[] r4 = r1.f1605e
            r4 = r4[r3]
            luaj.LuaString r5 = r4.f1609a
            luaj.LuaString r6 = r2.f1609a
            boolean r5 = r5.P0(r6)
            if (r5 == 0) goto L3a
            short r3 = r2.f1612d
            short r5 = r4.f1612d
            if (r3 <= r5) goto L35
            boolean r3 = r0.f1583e
            if (r3 != 0) goto L2e
            int r1 = r1.f1606f
            short r0 = r0.f1580b
            if (r1 <= r0) goto L35
        L2e:
            g.c r0 = r7.f1593g
            int r1 = r2.f1610b
            r0.S0(r1, r5)
        L35:
            r7.e0(r8, r4)
            r8 = 1
            return r8
        L3a:
            int r3 = r3 + 1
            goto Lc
        L3d:
            r8 = 0
            return r8
    }

    void v1(int r5) {
            r4 = this;
            char[] r0 = r4.j
            int r1 = r4.k
            if (r0 == 0) goto Lb
            int r2 = r1 + 1
            int r3 = r0.length
            if (r2 <= r3) goto L15
        Lb:
            int r2 = r1 * 2
            int r2 = r2 + 1
            char[] r0 = g.a.E(r0, r2)
            r4.j = r0
        L15:
            char r5 = (char) r5
            r0[r1] = r5
            int r1 = r1 + 1
            r4.k = r1
            return
    }

    void w0(int r6, int r7, int r8, boolean r9) {
            r5 = this;
            g.c$a r0 = new g.c$a
            r0.<init>()
            g.c r1 = r5.f1593g
            r2 = 3
            r5.Q(r2)
            r2 = 259(0x103, float:3.63E-43)
            r5.c0(r2)
            r2 = -1
            if (r9 == 0) goto L1a
            r3 = 33
            int r3 = r1.V(r3, r6, r2)
            goto L1e
        L1a:
            int r3 = r1.H0()
        L1e:
            r4 = 0
            r1.j0(r0, r4)
            r5.Q(r8)
            r1.b1(r8)
            r5.S()
            r1.K0()
            r1.W0(r3)
            if (r9 == 0) goto L3a
            r8 = 32
        L35:
            int r6 = r1.V(r8, r6, r2)
            goto L47
        L3a:
            r9 = 34
            r1.T(r9, r6, r4, r8)
            r1.s0(r7)
            int r6 = r6 + 2
            r8 = 35
            goto L35
        L47:
            int r3 = r3 + 1
            r1.T0(r6, r3)
            r1.s0(r7)
            return
    }

    void w1() {
            r1 = this;
            int r0 = r1.f1588b
            r1.v1(r0)
            r1.h1()
            return
    }

    void x0(luaj.LuaString r7) {
            r6 = this;
            g.c r0 = r6.f1593g
            g.g$k r1 = new g.g$k
            r1.<init>()
            short r2 = r0.p
            java.lang.String r3 = "(for generator)"
            r6.c1(r3)
            java.lang.String r3 = "(for state)"
            r6.c1(r3)
            java.lang.String r3 = "(for control)"
            r6.c1(r3)
            r6.b1(r7)
            r7 = 4
        L1c:
            r3 = 44
            boolean r3 = r6.L1(r3)
            if (r3 == 0) goto L2e
            luaj.LuaString r3 = r6.G1()
            r6.b1(r3)
            int r7 = r7 + 1
            goto L1c
        L2e:
            r3 = 268(0x10c, float:3.76E-43)
            r6.c0(r3)
            int r3 = r6.f1589c
            int r4 = r6.q0(r1)
            r5 = 3
            r6.P(r5, r4, r1)
            r0.Q(r5)
            int r7 = r7 - r5
            r0 = 0
            r6.w0(r2, r3, r7, r0)
            return
    }

    void x1(java.lang.String r3) {
            r2 = this;
            g.g$i r0 = r2.f1591e
            r1 = 0
            r0.f1617a = r1
            r2.J1(r3)
            return
    }

    void y0(luaj.LuaString r6, int r7) {
            r5 = this;
            g.c r0 = r5.f1593g
            short r1 = r0.p
            java.lang.String r2 = "(for index)"
            r5.c1(r2)
            java.lang.String r2 = "(for limit)"
            r5.c1(r2)
            java.lang.String r2 = "(for step)"
            r5.c1(r2)
            r5.b1(r6)
            r6 = 61
            r5.c0(r6)
            r5.p0()
            r6 = 44
            r5.c0(r6)
            r5.p0()
            boolean r6 = r5.L1(r6)
            r2 = 1
            if (r6 == 0) goto L31
            r5.p0()
            goto L43
        L31:
            short r6 = r0.p
            r3 = 1
            luaj.LuaLong r3 = luaj.LuaLong.I2(r3)
            int r3 = r0.R0(r3)
            r0.W(r6, r3)
            r0.b1(r2)
        L43:
            r5.w0(r1, r7, r2, r2)
            return
    }

    void y1(g.h.a r2, int r3, java.io.InputStream r4, luaj.LuaString r5) {
            r1 = this;
            r0 = 46
            r1.o = r0
            r1.h = r2
            g.g$i r2 = r1.f1592f
            r0 = 289(0x121, float:4.05E-43)
            r2.f1617a = r0
            r1.i = r4
            r2 = 0
            r1.f1593g = r2
            r2 = 1
            r1.f1589c = r2
            r1.f1590d = r2
            r1.m = r5
            luaj.LuaString r2 = luaj.LuaValue.k
            r1.n = r2
            r2 = 0
            r1.k = r2
            r1.f1588b = r3
            r1.B1()
            return
    }

    void z0(int r5) {
            r4 = this;
            g.c r0 = r4.f1593g
            g.c$a r1 = new g.c$a
            r1.<init>()
            r2 = 1
            r0.j0(r1, r2)
            r4.g1()
            luaj.LuaString r1 = r4.G1()
            g.g$i r2 = r4.f1591e
            int r2 = r2.f1617a
            r3 = 44
            if (r2 == r3) goto L4f
            r3 = 61
            if (r2 == r3) goto L4b
            r3 = 268(0x10c, float:3.76E-43)
            if (r2 == r3) goto L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "="
            java.lang.String r2 = M(r2)
            r1.append(r2)
            java.lang.String r2 = " or "
            r1.append(r2)
            java.lang.String r2 = "in"
            java.lang.String r2 = M(r2)
            r1.append(r2)
            java.lang.String r2 = " expected"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.J1(r1)
            goto L52
        L4b:
            r4.y0(r1, r5)
            goto L52
        L4f:
            r4.x0(r1)
        L52:
            r1 = 262(0x106, float:3.67E-43)
            r2 = 264(0x108, float:3.7E-43)
            r4.Z(r1, r2, r5)
            r0.K0()
            return
    }

    void z1(g.g.k r7) {
            r6 = this;
            g.g$i r0 = r6.f1591e
            int r1 = r0.f1617a
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L90
            r2 = 263(0x107, float:3.69E-43)
            r3 = 0
            if (r1 == r2) goto L8a
            r2 = 265(0x109, float:3.71E-43)
            if (r1 == r2) goto L81
            r2 = 270(0x10e, float:3.78E-43)
            r4 = 1
            if (r1 == r2) goto L7d
            r2 = 276(0x114, float:3.87E-43)
            if (r1 == r2) goto L78
            r2 = 281(0x119, float:3.94E-43)
            if (r1 == r2) goto L42
            r2 = 290(0x122, float:4.06E-43)
            if (r1 == r2) goto L32
            r2 = 293(0x125, float:4.1E-43)
            if (r1 == r2) goto L2a
            r6.I1(r7)
            return
        L2a:
            g.g$h r0 = r0.f1618b
            luaj.LuaString r0 = r0.f1616b
            r6.g0(r7, r0)
            goto L8c
        L32:
            r0 = 5
            r7.b(r0, r3)
            g.g$k$a r7 = r7.f1621b
            g.g$i r0 = r6.f1591e
            g.g$h r0 = r0.f1618b
            luaj.LuaValue r0 = r0.f1615a
            r7.b(r0)
            goto L8c
        L42:
            g.c r0 = r6.f1593g
            luaj.h r1 = r0.f1573b
            int r1 = r1.k
            if (r1 == 0) goto L4c
            r1 = 1
            goto L4d
        L4c:
            r1 = 0
        L4d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "cannot use "
            r2.append(r5)
            java.lang.String r5 = "..."
            java.lang.String r5 = M(r5)
            r2.append(r5)
            java.lang.String r5 = " outside a vararg function"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r6.X(r1, r2)
            r1 = 38
            int r0 = r0.T(r1, r3, r4, r3)
            r1 = 13
            r7.b(r1, r0)
            goto L8c
        L78:
            r0 = 2
        L79:
            r7.b(r0, r3)
            goto L8c
        L7d:
            r7.b(r4, r3)
            goto L8c
        L81:
            r6.g1()
            int r0 = r6.f1589c
            r6.U(r7, r3, r0)
            return
        L8a:
            r0 = 3
            goto L79
        L8c:
            r6.g1()
            return
        L90:
            r6.i0(r7)
            return
    }
}
