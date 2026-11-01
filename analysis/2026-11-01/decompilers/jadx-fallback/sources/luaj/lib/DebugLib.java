package luaj.lib;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class DebugLib extends luaj.lib.TwoArgFunction {
    public static boolean U;
    public static boolean V;
    private static final luaj.LuaString W = null;
    private static final luaj.LuaString X = null;
    private static final luaj.LuaString Y = null;
    private static final luaj.LuaString Z = null;
    private static final luaj.LuaString a0 = null;
    private static final luaj.LuaString b0 = null;
    static final luaj.LuaString c0 = null;
    static final luaj.LuaString d0 = null;
    static final luaj.LuaString e0 = null;
    static final luaj.LuaString f0 = null;
    static final luaj.LuaString g0 = null;
    static final luaj.LuaString h0 = null;
    static final luaj.LuaString i0 = null;
    static final luaj.LuaString j0 = null;
    static final luaj.LuaString k0 = null;
    static final luaj.LuaString l0 = null;
    static final luaj.LuaString m0 = null;
    static final luaj.LuaString n0 = null;
    static final luaj.LuaString o0 = null;
    static final luaj.LuaString p0 = null;
    static final luaj.LuaString q0 = null;
    static final luaj.LuaString r0 = null;
    luaj.Globals T;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        luaj.LuaFunction f1747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private luaj.LuaValue[] f1749c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        luaj.lib.DebugLib.a f1750d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f1751e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f1752f;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public int a() {
                r4 = this;
                luaj.LuaFunction r0 = r4.f1747a
                boolean r0 = r0.f1()
                r1 = -1
                if (r0 != 0) goto La
                return r1
            La:
                luaj.LuaFunction r0 = r4.f1747a
                luaj.LuaClosure r0 = r0.w0()
                luaj.h r0 = r0.R
                int[] r0 = r0.f1724d
                if (r0 == 0) goto L20
                int r2 = r4.f1748b
                if (r2 < 0) goto L20
                int r3 = r0.length
                if (r2 < r3) goto L1e
                goto L20
            L1e:
                r1 = r0[r2]
            L20:
                return r1
        }

        luaj.Varargs b(int r5) {
                r4 = this;
                if (r5 >= 0) goto L2f
                luaj.LuaFunction r0 = r4.f1747a
                boolean r0 = r0.f1()
                if (r0 != 0) goto Ld
                luaj.LuaValue r5 = luaj.LuaValue.f1671c
                return r5
            Ld:
                luaj.LuaFunction r0 = r4.f1747a
                luaj.LuaClosure r0 = r0.w0()
                int r5 = -r5
                luaj.Varargs r0 = r0.b3()
                if (r0 == 0) goto L2c
                int r1 = r0.U()
                if (r5 <= r1) goto L21
                goto L2c
            L21:
                luaj.LuaString r1 = luaj.lib.DebugLib.r0
                luaj.LuaValue r5 = r0.v(r5)
                luaj.Varargs r5 = luaj.LuaValue.N2(r1, r5)
                return r5
            L2c:
                luaj.LuaValue r5 = luaj.LuaValue.f1671c
                return r5
            L2f:
                luaj.LuaString r0 = r4.c(r5)
                luaj.LuaValue[] r1 = r4.f1749c
                if (r1 == 0) goto L4b
                r2 = 1
                if (r5 < r2) goto L4b
                int r3 = r1.length
                if (r5 > r3) goto L4b
                int r5 = r5 - r2
                r5 = r1[r5]
                if (r5 == 0) goto L4b
                if (r0 != 0) goto L46
                luaj.LuaString r0 = luaj.lib.DebugLib.q0
            L46:
                luaj.Varargs r5 = luaj.LuaValue.N2(r0, r5)
                return r5
            L4b:
                luaj.LuaValue r5 = luaj.LuaValue.f1671c
                return r5
        }

        luaj.LuaString c(int r3) {
                r2 = this;
                luaj.LuaFunction r0 = r2.f1747a
                boolean r0 = r0.f1()
                if (r0 != 0) goto La
                r3 = 0
                return r3
            La:
                luaj.LuaFunction r0 = r2.f1747a
                luaj.LuaClosure r0 = r0.w0()
                luaj.h r0 = r0.R
                int r1 = r2.f1748b
                luaj.LuaString r3 = r0.a(r3, r1)
                return r3
        }

        void d(int r3, luaj.Varargs r4, int r5) {
                r2 = this;
                r2.f1748b = r3
                boolean r0 = luaj.lib.DebugLib.V
                if (r0 == 0) goto L11
                luaj.LuaFunction r0 = r2.f1747a
                luaj.LuaClosure r0 = r0.w0()
                luaj.LuaValue[] r1 = r2.f1749c
                luaj.g.I(r0, r3, r1, r5, r4)
            L11:
                return
        }

        void e() {
                r1 = this;
                r0 = 0
                r1.f1747a = r0
                r1.f1749c = r0
                r0 = 0
                r1.f1748b = r0
                r1.f1751e = r0
                r1.f1752f = r0
                return
        }

        void f(luaj.LuaClosure r1, luaj.Varargs r2, luaj.LuaValue[] r3, boolean r4, boolean r5) {
                r0 = this;
                r0.f1747a = r1
                r0.f1749c = r3
                r1 = 0
                r0.f1748b = r1
                r0.f1751e = r4
                r0.f1752f = r5
                return
        }

        void g(luaj.LuaFunction r1, boolean r2, boolean r3) {
                r0 = this;
                r0.f1747a = r1
                r1 = 0
                r0.f1749c = r1
                r1 = 0
                r0.f1748b = r1
                r0.f1751e = r2
                r0.f1752f = r3
                return
        }

        luaj.Varargs h(int r8, luaj.LuaValue r9) {
                r7 = this;
                r0 = 1
                if (r8 >= 0) goto L46
                luaj.LuaFunction r1 = r7.f1747a
                boolean r1 = r1.f1()
                if (r1 != 0) goto Le
                luaj.LuaValue r8 = luaj.LuaValue.f1671c
                return r8
            Le:
                luaj.LuaFunction r1 = r7.f1747a
                luaj.LuaClosure r1 = r1.w0()
                int r8 = -r8
                luaj.Varargs r2 = r1.b3()
                if (r2 == 0) goto L43
                int r3 = r2.U()
                if (r8 <= r3) goto L22
                goto L43
            L22:
                int r3 = r2.U()
                luaj.LuaValue[] r4 = new luaj.LuaValue[r3]
            L28:
                if (r0 > r3) goto L39
                int r5 = r0 + (-1)
                if (r8 != r0) goto L30
                r6 = r9
                goto L34
            L30:
                luaj.LuaValue r6 = r2.v(r0)
            L34:
                r4[r5] = r6
                int r0 = r0 + 1
                goto L28
            L39:
                luaj.Varargs r8 = luaj.LuaValue.O2(r4)
                r1.f3(r8)
                luaj.LuaString r8 = luaj.lib.DebugLib.r0
                return r8
            L43:
                luaj.LuaValue r8 = luaj.LuaValue.f1671c
                return r8
            L46:
                luaj.LuaString r1 = r7.c(r8)
                luaj.LuaValue[] r2 = r7.f1749c
                if (r2 == 0) goto L5f
                if (r8 < r0) goto L5f
                int r3 = r2.length
                if (r8 > r3) goto L5f
                int r8 = r8 - r0
                r0 = r2[r8]
                if (r0 == 0) goto L5f
                r2[r8] = r9
                if (r1 != 0) goto L5e
                luaj.LuaString r1 = luaj.lib.DebugLib.q0
            L5e:
                return r1
            L5f:
                luaj.LuaValue r8 = luaj.LuaValue.f1671c
                return r8
        }

        public java.lang.String i() {
                r1 = this;
                luaj.LuaFunction r0 = r1.f1747a
                boolean r0 = r0.f1()
                if (r0 == 0) goto L15
                luaj.LuaFunction r0 = r1.f1747a
                luaj.LuaClosure r0 = r0.w0()
                luaj.h r0 = r0.R
                java.lang.String r0 = r0.b()
                goto L17
            L15:
                java.lang.String r0 = "[Java]"
            L17:
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "CallFrame [f="
                r0.append(r1)
                luaj.LuaFunction r1 = r2.f1747a
                r0.append(r1)
                java.lang.String r1 = ", pc="
                r0.append(r1)
                int r1 = r2.f1748b
                r0.append(r1)
                java.lang.String r1 = ", hookcall="
                r0.append(r1)
                boolean r1 = r2.f1751e
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final luaj.lib.DebugLib.a[] f1753c = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        luaj.lib.DebugLib.a[] f1754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1755b;

        static {
                r0 = 0
                luaj.lib.DebugLib$a[] r0 = new luaj.lib.DebugLib.a[r0]
                luaj.lib.DebugLib.b.f1753c = r0
                return
        }

        b() {
                r1 = this;
                r1.<init>()
                luaj.lib.DebugLib$a[] r0 = luaj.lib.DebugLib.b.f1753c
                r1.f1754a = r0
                r0 = 0
                r1.f1755b = r0
                return
        }

        private static luaj.LuaValue d(java.lang.StringBuffer r5, luaj.LuaTable r6, luaj.LuaValue r7, int r8) {
                if (r6 == 0) goto L6b
                luaj.LuaTable$i r6 = r6.s3()
            L6:
                boolean r0 = r6.c()
                if (r0 == 0) goto L6b
                int r0 = r6.a()
                if (r0 == 0) goto L13
                goto L6
            L13:
                luaj.LuaValue r0 = r6.b()
                boolean r1 = r0 instanceof luaj.LuaString
                if (r1 != 0) goto L1c
                goto L6
            L1c:
                luaj.LuaValue r1 = r6.d()
                r2 = 39
                java.lang.String r3 = "function '"
                if (r1 != r7) goto L3a
                r6 = 2
                if (r8 != r6) goto L39
                r5.append(r3)
                java.lang.String r6 = r0.g0()
            L30:
                r5.append(r6)
                r5.append(r2)
                luaj.LuaValue r5 = luaj.LuaValue.f1671c
                return r5
            L39:
                return r0
            L3a:
                r4 = 1
                if (r8 <= r4) goto L6
                boolean r4 = r1.o1()
                if (r4 == 0) goto L6
                luaj.LuaTable r1 = r1.H0()
                int r4 = r8 + (-1)
                luaj.LuaValue r1 = d(r5, r1, r7, r4)
                if (r1 == 0) goto L6
                java.lang.String r6 = r0.g0()
                r5.append(r3)
                java.lang.String r7 = "_G"
                boolean r7 = r6.equals(r7)
                if (r7 != 0) goto L66
                r5.append(r6)
                r6 = 46
                r5.append(r6)
            L66:
                java.lang.String r6 = r1.g0()
                goto L30
            L6b:
                r5 = 0
                return r5
        }

        private synchronized luaj.lib.DebugLib.a j(boolean r6) {
                r5 = this;
                monitor-enter(r5)
                r0 = 1
                if (r6 == 0) goto Lf
                luaj.lib.DebugLib$a[] r6 = r5.f1754a     // Catch: java.lang.Throwable -> Ld
                int r1 = r5.f1755b     // Catch: java.lang.Throwable -> Ld
                int r1 = r1 - r0
                r6 = r6[r1]     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r5)
                return r6
            Ld:
                r6 = move-exception
                goto L53
            Lf:
                int r6 = r5.f1755b     // Catch: java.lang.Throwable -> Ld
                luaj.lib.DebugLib$a[] r1 = r5.f1754a     // Catch: java.lang.Throwable -> Ld
                int r2 = r1.length     // Catch: java.lang.Throwable -> Ld
                if (r6 < r2) goto L47
                int r6 = r1.length     // Catch: java.lang.Throwable -> Ld
                int r6 = r6 * 3
                int r6 = r6 / 2
                r1 = 4
                int r6 = java.lang.Math.max(r1, r6)     // Catch: java.lang.Throwable -> Ld
                luaj.lib.DebugLib$a[] r1 = new luaj.lib.DebugLib.a[r6]     // Catch: java.lang.Throwable -> Ld
                luaj.lib.DebugLib$a[] r2 = r5.f1754a     // Catch: java.lang.Throwable -> Ld
                int r3 = r2.length     // Catch: java.lang.Throwable -> Ld
                r4 = 0
                java.lang.System.arraycopy(r2, r4, r1, r4, r3)     // Catch: java.lang.Throwable -> Ld
                luaj.lib.DebugLib$a[] r2 = r5.f1754a     // Catch: java.lang.Throwable -> Ld
                int r2 = r2.length     // Catch: java.lang.Throwable -> Ld
            L2c:
                if (r2 >= r6) goto L38
                luaj.lib.DebugLib$a r3 = new luaj.lib.DebugLib$a     // Catch: java.lang.Throwable -> Ld
                r3.<init>()     // Catch: java.lang.Throwable -> Ld
                r1[r2] = r3     // Catch: java.lang.Throwable -> Ld
                int r2 = r2 + 1
                goto L2c
            L38:
                r5.f1754a = r1     // Catch: java.lang.Throwable -> Ld
            L3a:
                if (r0 >= r6) goto L47
                r2 = r1[r0]     // Catch: java.lang.Throwable -> Ld
                int r3 = r0 + (-1)
                r3 = r1[r3]     // Catch: java.lang.Throwable -> Ld
                r2.f1750d = r3     // Catch: java.lang.Throwable -> Ld
                int r0 = r0 + 1
                goto L3a
            L47:
                luaj.lib.DebugLib$a[] r6 = r5.f1754a     // Catch: java.lang.Throwable -> Ld
                int r0 = r5.f1755b     // Catch: java.lang.Throwable -> Ld
                int r1 = r0 + 1
                r5.f1755b = r1     // Catch: java.lang.Throwable -> Ld
                r6 = r6[r0]     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r5)
                return r6
            L53:
                monitor-exit(r5)
                throw r6
        }

        private static void k(java.lang.StringBuffer r2, luaj.Globals r3, luaj.lib.DebugLib.c r4) {
                luaj.lib.DebugLib$a r0 = r4.m
                luaj.LuaFunction r0 = r0.f1747a
                r1 = 2
                luaj.LuaValue r3 = d(r2, r3, r0, r1)
                if (r3 == 0) goto Lc
                goto L5e
            Lc:
                java.lang.String r3 = r4.f1757b
                int r3 = r3.length()
                if (r3 <= 0) goto L29
                java.lang.String r3 = r4.f1757b
                r2.append(r3)
                java.lang.String r3 = " '"
                r2.append(r3)
                java.lang.String r3 = r4.f1756a
                r2.append(r3)
                r3 = 39
            L25:
                r2.append(r3)
                goto L5e
            L29:
                java.lang.String r3 = r4.f1758c
                r0 = 0
                char r3 = r3.charAt(r0)
                r1 = 109(0x6d, float:1.53E-43)
                if (r3 != r1) goto L3a
                java.lang.String r3 = "main chunk"
                r2.append(r3)
                goto L5e
            L3a:
                java.lang.String r3 = r4.f1758c
                char r3 = r3.charAt(r0)
                r0 = 74
                if (r3 == r0) goto L5b
                java.lang.String r3 = "function <"
                r2.append(r3)
                java.lang.String r3 = r4.l
                r2.append(r3)
                r3 = 58
                r2.append(r3)
                int r3 = r4.f1761f
                r2.append(r3)
                r3 = 62
                goto L25
            L5b:
                r3 = 63
                goto L25
            L5e:
                return
        }

        synchronized luaj.lib.DebugLib.c a(java.lang.String r8, luaj.LuaFunction r9, luaj.lib.DebugLib.a r10) {
                r7 = this;
                monitor-enter(r7)
                luaj.lib.DebugLib$c r0 = new luaj.lib.DebugLib$c     // Catch: java.lang.Throwable -> L4c
                r0.<init>()     // Catch: java.lang.Throwable -> L4c
                int r1 = r8.length()     // Catch: java.lang.Throwable -> L4c
                r2 = 0
                r3 = 0
            Lc:
                if (r3 >= r1) goto Lb7
                char r4 = r8.charAt(r3)     // Catch: java.lang.Throwable -> L4c
                r5 = 83
                if (r4 == r5) goto Lb0
                r5 = 108(0x6c, float:1.51E-43)
                if (r4 == r5) goto L9d
                r5 = 110(0x6e, float:1.54E-43)
                if (r4 == r5) goto L61
                r5 = 116(0x74, float:1.63E-43)
                r6 = 1
                if (r4 == r5) goto L56
                r5 = 117(0x75, float:1.64E-43)
                if (r4 == r5) goto L29
                goto Lb3
            L29:
                if (r9 == 0) goto L4f
                boolean r4 = r9.f1()     // Catch: java.lang.Throwable -> L4c
                if (r4 == 0) goto L4f
                luaj.LuaClosure r4 = r9.w0()     // Catch: java.lang.Throwable -> L4c
                luaj.h r4 = r4.R     // Catch: java.lang.Throwable -> L4c
                f.d[] r5 = r4.f1726f     // Catch: java.lang.Throwable -> L4c
                int r5 = r5.length     // Catch: java.lang.Throwable -> L4c
                short r5 = (short) r5     // Catch: java.lang.Throwable -> L4c
                r0.h = r5     // Catch: java.lang.Throwable -> L4c
                int r5 = r4.j     // Catch: java.lang.Throwable -> L4c
                short r5 = (short) r5     // Catch: java.lang.Throwable -> L4c
                r0.i = r5     // Catch: java.lang.Throwable -> L4c
                int r4 = r4.k     // Catch: java.lang.Throwable -> L4c
                if (r4 == 0) goto L47
                goto L48
            L47:
                r6 = 0
            L48:
                r0.j = r6     // Catch: java.lang.Throwable -> L4c
                goto Lb3
            L4c:
                r8 = move-exception
                goto Lb9
            L4f:
                r0.h = r2     // Catch: java.lang.Throwable -> L4c
                r0.j = r6     // Catch: java.lang.Throwable -> L4c
                r0.i = r2     // Catch: java.lang.Throwable -> L4c
                goto Lb3
            L56:
                if (r10 == 0) goto L5d
                boolean r4 = r10.f1752f     // Catch: java.lang.Throwable -> L4c
                if (r4 == 0) goto L5d
                goto L5e
            L5d:
                r6 = 0
            L5e:
                r0.k = r6     // Catch: java.lang.Throwable -> L4c
                goto Lb3
            L61:
                if (r10 == 0) goto L91
                boolean r4 = r10.f1752f     // Catch: java.lang.Throwable -> L4c
                if (r4 == 0) goto L68
                goto L91
            L68:
                boolean r4 = r10.f1751e     // Catch: java.lang.Throwable -> L4c
                if (r4 == 0) goto L75
                java.lang.String r4 = "hook"
                r0.f1757b = r4     // Catch: java.lang.Throwable -> L4c
                java.lang.String r4 = "?"
                r0.f1756a = r4     // Catch: java.lang.Throwable -> L4c
                goto L91
            L75:
                luaj.lib.DebugLib$a r4 = r10.f1750d     // Catch: java.lang.Throwable -> L4c
                if (r4 == 0) goto L91
                luaj.LuaFunction r4 = r4.f1747a     // Catch: java.lang.Throwable -> L4c
                boolean r4 = r4.f1()     // Catch: java.lang.Throwable -> L4c
                if (r4 == 0) goto L91
                luaj.lib.DebugLib$a r4 = r10.f1750d     // Catch: java.lang.Throwable -> L4c
                luaj.lib.DebugLib$d r4 = luaj.lib.DebugLib.e3(r4)     // Catch: java.lang.Throwable -> L4c
                if (r4 == 0) goto L91
                java.lang.String r5 = r4.f1763a     // Catch: java.lang.Throwable -> L4c
                r0.f1756a = r5     // Catch: java.lang.Throwable -> L4c
                java.lang.String r4 = r4.f1764b     // Catch: java.lang.Throwable -> L4c
                r0.f1757b = r4     // Catch: java.lang.Throwable -> L4c
            L91:
                java.lang.String r4 = r0.f1757b     // Catch: java.lang.Throwable -> L4c
                if (r4 != 0) goto Lb3
                java.lang.String r4 = ""
                r0.f1757b = r4     // Catch: java.lang.Throwable -> L4c
                r4 = 0
                r0.f1756a = r4     // Catch: java.lang.Throwable -> L4c
                goto Lb3
            L9d:
                if (r10 == 0) goto Lac
                luaj.LuaFunction r4 = r10.f1747a     // Catch: java.lang.Throwable -> L4c
                boolean r4 = r4.f1()     // Catch: java.lang.Throwable -> L4c
                if (r4 == 0) goto Lac
                int r4 = r10.a()     // Catch: java.lang.Throwable -> L4c
                goto Lad
            Lac:
                r4 = -1
            Lad:
                r0.f1760e = r4     // Catch: java.lang.Throwable -> L4c
                goto Lb3
            Lb0:
                r0.a(r9)     // Catch: java.lang.Throwable -> L4c
            Lb3:
                int r3 = r3 + 1
                goto Lc
            Lb7:
                monitor-exit(r7)
                return r0
            Lb9:
                monitor-exit(r7)
                throw r8
        }

        synchronized int b() {
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.f1755b     // Catch: java.lang.Throwable -> L10
                if (r0 <= 0) goto L12
                luaj.lib.DebugLib$a[] r1 = r2.f1754a     // Catch: java.lang.Throwable -> L10
                int r0 = r0 + (-1)
                r0 = r1[r0]     // Catch: java.lang.Throwable -> L10
                int r0 = r0.a()     // Catch: java.lang.Throwable -> L10
                goto L13
            L10:
                r0 = move-exception
                goto L15
            L12:
                r0 = -1
            L13:
                monitor-exit(r2)
                return r0
            L15:
                monitor-exit(r2)
                throw r0
        }

        synchronized luaj.lib.DebugLib.a c(luaj.LuaValue r4) {
                r3 = this;
                monitor-enter(r3)
                r0 = 1
            L2:
                int r1 = r3.f1755b     // Catch: java.lang.Throwable -> L13
                if (r0 > r1) goto L18
                luaj.lib.DebugLib$a[] r2 = r3.f1754a     // Catch: java.lang.Throwable -> L13
                int r1 = r1 - r0
                r1 = r2[r1]     // Catch: java.lang.Throwable -> L13
                luaj.LuaFunction r1 = r1.f1747a     // Catch: java.lang.Throwable -> L13
                if (r1 != r4) goto L15
                r4 = r2[r0]     // Catch: java.lang.Throwable -> L13
                monitor-exit(r3)
                return r4
            L13:
                r4 = move-exception
                goto L1b
            L15:
                int r0 = r0 + 1
                goto L2
            L18:
                monitor-exit(r3)
                r4 = 0
                return r4
            L1b:
                monitor-exit(r3)
                throw r4
        }

        synchronized luaj.lib.DebugLib.a e(int r3) {
                r2 = this;
                monitor-enter(r2)
                r0 = 1
                if (r3 < r0) goto L13
                int r0 = r2.f1755b     // Catch: java.lang.Throwable -> L10
                if (r3 <= r0) goto L9
                goto L13
            L9:
                luaj.lib.DebugLib$a[] r1 = r2.f1754a     // Catch: java.lang.Throwable -> L10
                int r0 = r0 - r3
                r3 = r1[r0]     // Catch: java.lang.Throwable -> L10
                monitor-exit(r2)
                return r3
            L10:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            L13:
                monitor-exit(r2)
                r3 = 0
                return r3
        }

        final synchronized void f(luaj.LuaClosure r7, luaj.Varargs r8, luaj.LuaValue[] r9, boolean r10, boolean r11) {
                r6 = this;
                monitor-enter(r6)
                luaj.lib.DebugLib$a r0 = r6.j(r11)     // Catch: java.lang.Throwable -> Lf
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r0.f(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r6)
                return
            Lf:
                r7 = move-exception
                monitor-exit(r6)
                throw r7
        }

        final synchronized void g(luaj.LuaFunction r2, boolean r3, boolean r4) {
                r1 = this;
                monitor-enter(r1)
                luaj.lib.DebugLib$a r0 = r1.j(r4)     // Catch: java.lang.Throwable -> La
                r0.g(r2, r3, r4)     // Catch: java.lang.Throwable -> La
                monitor-exit(r1)
                return
            La:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
        }

        final synchronized void h(int r3, luaj.Varargs r4, int r5) {
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.f1755b     // Catch: java.lang.Throwable -> Lf
                if (r0 <= 0) goto L11
                luaj.lib.DebugLib$a[] r1 = r2.f1754a     // Catch: java.lang.Throwable -> Lf
                int r0 = r0 + (-1)
                r0 = r1[r0]     // Catch: java.lang.Throwable -> Lf
                r0.d(r3, r4, r5)     // Catch: java.lang.Throwable -> Lf
                goto L11
            Lf:
                r3 = move-exception
                goto L13
            L11:
                monitor-exit(r2)
                return
            L13:
                monitor-exit(r2)
                throw r3
        }

        final synchronized void i(luaj.LuaThread.a r3) {
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.f1755b     // Catch: java.lang.Throwable -> L11
                if (r0 <= 0) goto L13
                luaj.lib.DebugLib$a[] r1 = r2.f1754a     // Catch: java.lang.Throwable -> L11
                int r0 = r0 + (-1)
                r2.f1755b = r0     // Catch: java.lang.Throwable -> L11
                r0 = r1[r0]     // Catch: java.lang.Throwable -> L11
                r0.e()     // Catch: java.lang.Throwable -> L11
                goto L13
            L11:
                r3 = move-exception
                goto L18
            L13:
                r2.l(r3)     // Catch: java.lang.Throwable -> L11
                monitor-exit(r2)
                return
            L18:
                monitor-exit(r2)
                throw r3
        }

        synchronized void l(luaj.LuaThread.a r3) {
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r3.f1669g     // Catch: java.lang.Throwable -> L1a
                if (r0 == 0) goto L1c
                int r0 = r2.f1755b     // Catch: java.lang.Throwable -> L1a
                if (r0 <= 0) goto L1c
                luaj.lib.DebugLib$a[] r1 = r2.f1754a     // Catch: java.lang.Throwable -> L1a
                int r0 = r0 + (-1)
                r0 = r1[r0]     // Catch: java.lang.Throwable -> L1a
                int r1 = r0.a()     // Catch: java.lang.Throwable -> L1a
                r3.l = r1     // Catch: java.lang.Throwable -> L1a
                int r0 = r0.f1748b     // Catch: java.lang.Throwable -> L1a
                r3.m = r0     // Catch: java.lang.Throwable -> L1a
                goto L1c
            L1a:
                r3 = move-exception
                goto L1e
            L1c:
                monitor-exit(r2)
                return
            L1e:
                monitor-exit(r2)
                throw r3
        }

        synchronized java.lang.String m(luaj.Globals r5, int r6) {
                r4 = this;
                monitor-enter(r4)
                java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L34
                r0.<init>()     // Catch: java.lang.Throwable -> L34
                java.lang.String r1 = "stack traceback:"
                r0.append(r1)     // Catch: java.lang.Throwable -> L34
            Lb:
                int r1 = r6 + 1
                luaj.lib.DebugLib$a r6 = r4.e(r6)     // Catch: java.lang.Throwable -> L34
                if (r6 == 0) goto L49
                java.lang.String r2 = "Slnt"
                luaj.LuaFunction r3 = r6.f1747a     // Catch: java.lang.Throwable -> L34
                luaj.lib.DebugLib$c r2 = r4.a(r2, r3, r6)     // Catch: java.lang.Throwable -> L34
                r2.m = r6     // Catch: java.lang.Throwable -> L34
                java.lang.String r6 = "\n\t"
                r0.append(r6)     // Catch: java.lang.Throwable -> L34
                java.lang.String r6 = r2.l     // Catch: java.lang.Throwable -> L34
                r0.append(r6)     // Catch: java.lang.Throwable -> L34
                r6 = 58
                r0.append(r6)     // Catch: java.lang.Throwable -> L34
                int r6 = r2.f1760e     // Catch: java.lang.Throwable -> L34
                if (r6 <= 0) goto L36
                r0.append(r6)     // Catch: java.lang.Throwable -> L34
                goto L36
            L34:
                r5 = move-exception
                goto L54
            L36:
                java.lang.String r6 = " in "
                r0.append(r6)     // Catch: java.lang.Throwable -> L34
                k(r0, r5, r2)     // Catch: java.lang.Throwable -> L34
                boolean r6 = r2.k     // Catch: java.lang.Throwable -> L34
                if (r6 == 0) goto L47
                java.lang.String r6 = "\n\t(...tail calls...)"
                r0.append(r6)     // Catch: java.lang.Throwable -> L34
            L47:
                r6 = r1
                goto Lb
            L49:
                java.lang.String r5 = "\n\t[Java]: in ?"
                r0.append(r5)     // Catch: java.lang.Throwable -> L34
                java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L34
                monitor-exit(r4)
                return r5
            L54:
                monitor-exit(r4)
                throw r5
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.String f1756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.lang.String f1757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        java.lang.String f1758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        java.lang.String f1759d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f1761f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f1762g;
        short h;
        short i;
        boolean j;
        boolean k;
        java.lang.String l;
        luaj.lib.DebugLib.a m;

        c() {
                r0 = this;
                r0.<init>()
                return
        }

        public void a(luaj.LuaFunction r3) {
                r2 = this;
                boolean r0 = r3.f1()
                if (r0 == 0) goto L31
                luaj.LuaClosure r3 = r3.w0()
                luaj.h r3 = r3.R
                luaj.LuaString r0 = r3.f1727g
                if (r0 == 0) goto L15
                java.lang.String r0 = r0.g0()
                goto L17
            L15:
                java.lang.String r0 = "=?"
            L17:
                r2.f1759d = r0
                int r0 = r3.h
                r2.f1761f = r0
                int r1 = r3.i
                r2.f1762g = r1
                if (r0 != 0) goto L26
                java.lang.String r0 = "main"
                goto L28
            L26:
                java.lang.String r0 = "Lua"
            L28:
                r2.f1758c = r0
                java.lang.String r3 = r3.b()
            L2e:
                r2.l = r3
                goto L41
            L31:
                java.lang.String r3 = "=[Java]"
                r2.f1759d = r3
                r3 = -1
                r2.f1761f = r3
                r2.f1762g = r3
                java.lang.String r3 = "Java"
                r2.f1758c = r3
                java.lang.String r3 = "[Java]"
                goto L2e
            L41:
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "DebugInfo [\n\tname="
                r0.append(r1)
                java.lang.String r1 = r2.f1756a
                r0.append(r1)
                java.lang.String r1 = "\n\tnamewhat="
                r0.append(r1)
                java.lang.String r1 = r2.f1757b
                r0.append(r1)
                java.lang.String r1 = "\n\twhat="
                r0.append(r1)
                java.lang.String r1 = r2.f1758c
                r0.append(r1)
                java.lang.String r1 = "\n\tsource="
                r0.append(r1)
                java.lang.String r1 = r2.f1759d
                r0.append(r1)
                java.lang.String r1 = "\n\tcurrentline="
                r0.append(r1)
                int r1 = r2.f1760e
                r0.append(r1)
                java.lang.String r1 = "\n\tlinedefined="
                r0.append(r1)
                int r1 = r2.f1761f
                r0.append(r1)
                java.lang.String r1 = "\n\tlastlinedefined="
                r0.append(r1)
                int r1 = r2.f1762g
                r0.append(r1)
                java.lang.String r1 = "\n\tnups="
                r0.append(r1)
                short r1 = r2.h
                r0.append(r1)
                java.lang.String r1 = "\n\tnparams="
                r0.append(r1)
                short r1 = r2.i
                r0.append(r1)
                java.lang.String r1 = "\n\tisvararg="
                r0.append(r1)
                boolean r1 = r2.j
                r0.append(r1)
                java.lang.String r1 = "\n\tistailcall="
                r0.append(r1)
                boolean r1 = r2.k
                r0.append(r1)
                java.lang.String r1 = "\n\tshort_src="
                r0.append(r1)
                java.lang.String r1 = r2.l
                r0.append(r1)
                java.lang.String r1 = "\n\tcf="
                r0.append(r1)
                luaj.lib.DebugLib$a r1 = r2.m
                r0.append(r1)
                java.lang.String r1 = "\n]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.String f1763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.lang.String f1764b;

        d(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.f1763a = r1
                r0.f1764b = r2
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.f1764b
                r0.append(r1)
                java.lang.String r1 = " '"
                r0.append(r1)
                java.lang.String r1 = r2.f1763a
                r0.append(r1)
                java.lang.String r1 = "'"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static final class debug extends luaj.lib.ZeroArgFunction {
        debug() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.ZeroArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call() {
                r1 = this;
                luaj.LuaValue r0 = luaj.LuaValue.f1674f
                return r0
        }
    }

    final class gethook extends luaj.lib.VarArgFunction {
        final /* synthetic */ luaj.lib.DebugLib T;

        gethook(luaj.lib.DebugLib r1) {
                r0 = this;
                r0.T = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r5) {
                r4 = this;
                int r0 = r5.U()
                if (r0 <= 0) goto Lc
                r0 = 1
                luaj.LuaThread r5 = r5.J(r0)
                goto L12
            Lc:
                luaj.lib.DebugLib r5 = r4.T
                luaj.Globals r5 = r5.T
                luaj.LuaThread r5 = r5.f0
            L12:
                luaj.LuaThread$a r5 = r5.P
                luaj.LuaFunction r0 = r5.f1668f
                if (r0 == 0) goto L19
                goto L1b
            L19:
                luaj.LuaValue r0 = luaj.LuaValue.f1671c
            L1b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                boolean r2 = r5.h
                java.lang.String r3 = ""
                if (r2 == 0) goto L29
                java.lang.String r2 = "c"
                goto L2a
            L29:
                r2 = r3
            L2a:
                r1.append(r2)
                boolean r2 = r5.i
                if (r2 == 0) goto L34
                java.lang.String r2 = "r"
                goto L35
            L34:
                r2 = r3
            L35:
                r1.append(r2)
                boolean r2 = r5.f1669g
                if (r2 == 0) goto L3e
                java.lang.String r3 = "l"
            L3e:
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                luaj.LuaString r1 = luaj.LuaValue.K2(r1)
                int r5 = r5.j
                long r2 = (long) r5
                luaj.LuaLong r5 = luaj.LuaValue.I2(r2)
                luaj.Varargs r5 = luaj.LuaValue.M2(r0, r1, r5)
                return r5
        }
    }

    final class getinfo extends luaj.lib.VarArgFunction {
        final /* synthetic */ luaj.lib.DebugLib T;

        getinfo(luaj.lib.DebugLib r1) {
                r0 = this;
                r0.T = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r14) {
                r13 = this;
                r0 = 1
                boolean r1 = r14.T(r0)
                if (r1 == 0) goto Ld
                luaj.LuaThread r1 = r14.J(r0)
                r2 = 2
                goto L14
            Ld:
                luaj.lib.DebugLib r1 = r13.T
                luaj.Globals r1 = r1.T
                luaj.LuaThread r1 = r1.f0
                r2 = 1
            L14:
                int r3 = r2 + 1
                luaj.LuaValue r4 = r14.v(r2)
                java.lang.String r5 = "flnStu"
                java.lang.String r14 = r14.Z(r3, r5)
                luaj.lib.DebugLib r3 = r13.T
                luaj.lib.DebugLib$b r1 = r3.Z2(r1)
                boolean r3 = r4.m1()
                if (r3 == 0) goto L46
                int r3 = r4.y2()
                luaj.lib.DebugLib$a r4 = r1.e(r0)
                luaj.LuaFunction r4 = r4.f1747a
                if (r4 != r13) goto L3a
                int r3 = r3 + 1
            L3a:
                luaj.lib.DebugLib$a r3 = r1.e(r3)
                if (r3 != 0) goto L43
                luaj.LuaValue r14 = luaj.LuaValue.f1674f
                return r14
            L43:
                luaj.LuaFunction r4 = r3.f1747a
                goto L50
            L46:
                boolean r3 = r4.g1()
                if (r3 == 0) goto L183
                luaj.lib.DebugLib$a r3 = r1.c(r4)
            L50:
                r5 = r4
                luaj.LuaFunction r5 = (luaj.LuaFunction) r5
                luaj.lib.DebugLib$c r1 = r1.a(r14, r5, r3)
                luaj.LuaTable r3 = new luaj.LuaTable
                r3.<init>()
                r5 = 0
                r6 = 0
            L5e:
                int r7 = r14.length()
                if (r6 >= r7) goto L182
                char r7 = r14.charAt(r6)
                r8 = 76
                if (r7 == r8) goto L153
                r8 = 83
                if (r7 == r8) goto L121
                r8 = 102(0x66, float:1.43E-43)
                if (r7 == r8) goto L119
                r8 = 108(0x6c, float:1.51E-43)
                if (r7 == r8) goto L10f
                r8 = 110(0x6e, float:1.54E-43)
                if (r7 == r8) goto Lf6
                r8 = 116(0x74, float:1.63E-43)
                if (r7 == r8) goto Led
                r8 = 117(0x75, float:1.64E-43)
                if (r7 == r8) goto Lc5
                char r7 = r14.charAt(r6)
                int r8 = r2 + 1
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "invalid option: '"
                r9.append(r10)
                r9.append(r7)
                java.lang.String r10 = "' [0x"
                r9.append(r10)
                java.lang.String r7 = java.lang.Integer.toHexString(r7)
                r9.append(r7)
                java.lang.String r7 = "] at index "
                r9.append(r7)
                int r7 = r6 + 1
                r9.append(r7)
                java.lang.String r7 = " in '"
                r9.append(r7)
                r9.append(r14)
                java.lang.String r7 = "'"
                r9.append(r7)
                java.lang.String r7 = r9.toString()
                java.lang.String r9 = "debug.getinfo"
                luaj.LuaValue.l0(r8, r9, r7)
                goto L17e
            Lc5:
                luaj.LuaString r7 = luaj.lib.DebugLib.f0
                short r8 = r1.h
                long r8 = (long) r8
                luaj.LuaLong r8 = luaj.LuaValue.I2(r8)
                r3.j2(r7, r8)
                luaj.LuaString r7 = luaj.lib.DebugLib.g0
                short r8 = r1.i
                long r8 = (long) r8
                luaj.LuaLong r8 = luaj.LuaValue.I2(r8)
                r3.j2(r7, r8)
                luaj.LuaString r7 = luaj.lib.DebugLib.e0
                boolean r8 = r1.j
                if (r8 == 0) goto Le6
                luaj.LuaBoolean r8 = luaj.LuaValue.f1672d
                goto Le8
            Le6:
                luaj.LuaBoolean r8 = luaj.LuaValue.f1673e
            Le8:
                r3.j2(r7, r8)
                goto L17e
            Led:
                luaj.LuaString r7 = luaj.lib.DebugLib.d0
                boolean r8 = r1.k
                luaj.LuaBoolean r8 = luaj.LuaValue.H2(r8)
                goto Le8
            Lf6:
                luaj.LuaString r7 = luaj.lib.DebugLib.h0
                java.lang.String r8 = r1.f1756a
                if (r8 == 0) goto L101
                luaj.LuaString r8 = luaj.LuaValue.K2(r8)
                goto L103
            L101:
                luaj.LuaValue r8 = luaj.LuaValue.f1671c
            L103:
                r3.j2(r7, r8)
                luaj.LuaString r7 = luaj.lib.DebugLib.i0
                java.lang.String r8 = r1.f1757b
                luaj.LuaString r8 = luaj.LuaValue.K2(r8)
                goto Le8
            L10f:
                luaj.LuaString r7 = luaj.lib.DebugLib.o0
                int r8 = r1.f1760e
            L113:
                long r8 = (long) r8
                luaj.LuaLong r8 = luaj.LuaValue.I2(r8)
                goto Le8
            L119:
                if (r4 == 0) goto L17e
                luaj.LuaString r7 = luaj.lib.DebugLib.c0
                r3.j2(r7, r4)
                goto L17e
            L121:
                luaj.LuaString r7 = luaj.lib.DebugLib.j0
                java.lang.String r8 = r1.f1758c
                luaj.LuaString r8 = luaj.LuaValue.K2(r8)
                r3.j2(r7, r8)
                luaj.LuaString r7 = luaj.lib.DebugLib.k0
                java.lang.String r8 = r1.f1759d
                luaj.LuaString r8 = luaj.LuaValue.K2(r8)
                r3.j2(r7, r8)
                luaj.LuaString r7 = luaj.lib.DebugLib.l0
                java.lang.String r8 = r1.l
                luaj.LuaString r8 = luaj.LuaValue.K2(r8)
                r3.j2(r7, r8)
                luaj.LuaString r7 = luaj.lib.DebugLib.m0
                int r8 = r1.f1761f
                long r8 = (long) r8
                luaj.LuaLong r8 = luaj.LuaValue.I2(r8)
                r3.j2(r7, r8)
                luaj.LuaString r7 = luaj.lib.DebugLib.n0
                int r8 = r1.f1762g
                goto L113
            L153:
                boolean r7 = r4.f1()
                if (r7 == 0) goto L17e
                luaj.LuaTable r7 = new luaj.LuaTable
                r7.<init>()
                luaj.LuaString r8 = luaj.lib.DebugLib.p0
                r3.j2(r8, r7)
                luaj.LuaClosure r8 = r4.w0()
                luaj.h r8 = r8.R
                int[] r8 = r8.f1724d
                int r9 = r8.length
                r10 = 0
            L16d:
                if (r10 >= r9) goto L17e
                r11 = r8[r10]
                long r11 = (long) r11
                luaj.LuaLong r11 = luaj.LuaValue.I2(r11)
                luaj.LuaBoolean r12 = luaj.LuaValue.f1672d
                r7.d2(r11, r12)
                int r10 = r10 + 1
                goto L16d
            L17e:
                int r6 = r6 + 1
                goto L5e
            L182:
                return r3
            L183:
                java.lang.String r14 = "function or level"
                luaj.LuaValue r14 = luaj.LuaValue.k0(r2, r14)
                return r14
        }
    }

    final class getlocal extends luaj.lib.VarArgFunction {
        final /* synthetic */ luaj.lib.DebugLib T;

        getlocal(luaj.lib.DebugLib r1) {
                r0 = this;
                r0.T = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r7) {
                r6 = this;
                r0 = 1
                boolean r1 = r7.T(r0)
                if (r1 == 0) goto Ld
                luaj.LuaThread r1 = r7.J(r0)
                r2 = 2
                goto L14
            Ld:
                luaj.lib.DebugLib r1 = r6.T
                luaj.Globals r1 = r1.T
                luaj.LuaThread r1 = r1.f0
                r2 = 1
            L14:
                int r3 = r2 + 1
                luaj.LuaValue r4 = r7.v(r2)
                int r3 = r7.D(r3)
                boolean r5 = r4.g1()
                if (r5 == 0) goto L39
                boolean r7 = r4.f1()
                if (r7 != 0) goto L2d
                luaj.LuaValue r7 = luaj.LuaValue.f1671c
                return r7
            L2d:
                luaj.LuaClosure r7 = r4.w0()
                luaj.h r7 = r7.R
                r0 = 0
                luaj.LuaString r7 = r7.a(r3, r0)
                return r7
            L39:
                int r7 = r7.D(r2)
                luaj.lib.DebugLib r4 = r6.T
                luaj.lib.DebugLib$b r1 = r4.Z2(r1)
                int r4 = r1.f1755b
                luaj.lib.DebugLib$a r0 = r1.e(r0)
                luaj.LuaFunction r0 = r0.f1747a
                if (r0 != r6) goto L51
                int r7 = r7 + 1
                int r4 = r4 + (-1)
            L51:
                luaj.lib.DebugLib$a r0 = r1.e(r7)
                if (r0 == 0) goto L5c
                luaj.Varargs r7 = r0.b(r3)
                goto L7b
            L5c:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "level out of range: "
                r0.append(r1)
                r0.append(r7)
                java.lang.String r7 = " not between 1 and "
                r0.append(r7)
                r0.append(r4)
                java.lang.String r7 = r0.toString()
                java.lang.String r0 = "debug.getlocal"
                luaj.LuaValue r7 = luaj.LuaValue.l0(r2, r0, r7)
            L7b:
                return r7
        }
    }

    static final class getmetatable extends luaj.lib.LibFunction {
        getmetatable() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r1) {
                r0 = this;
                luaj.LuaValue r1 = r1.V0()
                if (r1 == 0) goto L7
                goto L9
            L7:
                luaj.LuaValue r1 = luaj.LuaValue.f1671c
            L9:
                return r1
        }
    }

    final class getregistry extends luaj.lib.ZeroArgFunction {
        final /* synthetic */ luaj.lib.DebugLib T;

        getregistry(luaj.lib.DebugLib r1) {
                r0 = this;
                r0.T = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.ZeroArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call() {
                r1 = this;
                luaj.lib.DebugLib r0 = r1.T
                luaj.Globals r0 = r0.T
                return r0
        }
    }

    static final class getupvalue extends luaj.lib.VarArgFunction {
        getupvalue() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r4) {
                r3 = this;
                r0 = 1
                luaj.LuaFunction r1 = r4.C(r0)
                r2 = 2
                int r4 = r4.D(r2)
                boolean r2 = r1 instanceof luaj.LuaClosure
                if (r2 == 0) goto L24
                luaj.LuaClosure r1 = (luaj.LuaClosure) r1
                luaj.LuaString r2 = luaj.lib.DebugLib.c3(r1, r4)
                if (r2 == 0) goto L24
                luaj.i[] r1 = r1.S
                int r4 = r4 - r0
                r4 = r1[r4]
                luaj.LuaValue r4 = r4.b()
                luaj.Varargs r4 = luaj.LuaValue.N2(r2, r4)
                return r4
            L24:
                luaj.LuaValue r4 = luaj.LuaValue.f1671c
                return r4
        }
    }

    final class sethook extends luaj.lib.VarArgFunction {
        final /* synthetic */ luaj.lib.DebugLib T;

        sethook(luaj.lib.DebugLib r1) {
                r0 = this;
                r0.T = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r11) {
                r10 = this;
                r0 = 1
                boolean r1 = r11.T(r0)
                r2 = 2
                if (r1 == 0) goto Le
                luaj.LuaThread r1 = r11.J(r0)
                r3 = 2
                goto L15
            Le:
                luaj.lib.DebugLib r1 = r10.T
                luaj.Globals r1 = r1.T
                luaj.LuaThread r1 = r1.f0
                r3 = 1
            L15:
                int r4 = r3 + 1
                r5 = 0
                luaj.LuaFunction r5 = r11.X(r3, r5)
                int r3 = r3 + r2
                java.lang.String r2 = ""
                java.lang.String r2 = r11.Z(r4, r2)
                r4 = 0
                int r11 = r11.Y(r3, r4)
                r3 = 0
                r6 = 0
                r7 = 0
            L2b:
                int r8 = r2.length()
                if (r4 >= r8) goto L4a
                char r8 = r2.charAt(r4)
                r9 = 99
                if (r8 == r9) goto L46
                r9 = 108(0x6c, float:1.51E-43)
                if (r8 == r9) goto L44
                r9 = 114(0x72, float:1.6E-43)
                if (r8 == r9) goto L42
                goto L47
            L42:
                r7 = 1
                goto L47
            L44:
                r6 = 1
                goto L47
            L46:
                r3 = 1
            L47:
                int r4 = r4 + 1
                goto L2b
            L4a:
                luaj.LuaThread$a r0 = r1.P
                r0.f1668f = r5
                r0.h = r3
                r0.f1669g = r6
                r0.j = r11
                r0.i = r7
                luaj.lib.DebugLib r11 = r10.T
                luaj.lib.DebugLib$b r11 = r11.Y2()
                r11.l(r0)
                luaj.LuaValue r11 = luaj.LuaValue.f1674f
                return r11
        }
    }

    final class setlocal extends luaj.lib.VarArgFunction {
        final /* synthetic */ luaj.lib.DebugLib T;

        setlocal(luaj.lib.DebugLib r1) {
                r0 = this;
                r0.T = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r7) {
                r6 = this;
                r0 = 1
                boolean r1 = r7.T(r0)
                if (r1 == 0) goto Ld
                luaj.LuaThread r1 = r7.J(r0)
                r2 = 2
                goto L14
            Ld:
                luaj.lib.DebugLib r1 = r6.T
                luaj.Globals r1 = r1.T
                luaj.LuaThread r1 = r1.f0
                r2 = 1
            L14:
                int r3 = r2 + 1
                int r4 = r7.D(r2)
                int r5 = r2 + 2
                int r3 = r7.D(r3)
                luaj.LuaValue r7 = r7.v(r5)
                luaj.lib.DebugLib r5 = r6.T
                luaj.lib.DebugLib$b r1 = r5.Z2(r1)
                int r5 = r1.f1755b
                luaj.lib.DebugLib$a r0 = r1.e(r0)
                luaj.LuaFunction r0 = r0.f1747a
                if (r0 != r6) goto L38
                int r4 = r4 + 1
                int r5 = r5 + (-1)
            L38:
                luaj.lib.DebugLib$a r0 = r1.e(r4)
                if (r0 == 0) goto L43
                luaj.Varargs r7 = r0.h(r3, r7)
                goto L62
            L43:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "level out of range: "
                r7.append(r0)
                r7.append(r4)
                java.lang.String r0 = " not between 1 and "
                r7.append(r0)
                r7.append(r5)
                java.lang.String r7 = r7.toString()
                java.lang.String r0 = "debug.setlocal"
                luaj.LuaValue r7 = luaj.LuaValue.l0(r2, r0, r7)
            L62:
                return r7
        }
    }

    static final class setmetatable extends luaj.lib.TwoArgFunction {
        setmetatable() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r3, luaj.LuaValue r4) {
                r2 = this;
                r0 = 0
                luaj.LuaTable r4 = r4.L1(r0)
                int r0 = r3.C2()
                if (r0 == 0) goto L2e
                r1 = 1
                if (r0 == r1) goto L2b
                r1 = 3
                if (r0 == r1) goto L28
                r1 = 4
                if (r0 == r1) goto L25
                r1 = 6
                if (r0 == r1) goto L22
                r1 = 8
                if (r0 == r1) goto L1f
                r3.k2(r4)
                goto L30
            L1f:
                luaj.LuaThread.T = r4
                goto L30
            L22:
                luaj.LuaFunction.P = r4
                goto L30
            L25:
                luaj.LuaString.U = r4
                goto L30
            L28:
                luaj.LuaNumber.P = r4
                goto L30
            L2b:
                luaj.LuaBoolean.Q = r4
                goto L30
            L2e:
                luaj.LuaNil.P = r4
            L30:
                return r3
        }
    }

    static final class setupvalue extends luaj.lib.VarArgFunction {
        setupvalue() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r5) {
                r4 = this;
                r0 = 1
                luaj.LuaFunction r1 = r5.C(r0)
                r2 = 2
                int r2 = r5.D(r2)
                r3 = 3
                luaj.LuaValue r5 = r5.v(r3)
                boolean r3 = r1 instanceof luaj.LuaClosure
                if (r3 == 0) goto L24
                luaj.LuaClosure r1 = (luaj.LuaClosure) r1
                luaj.LuaString r3 = luaj.lib.DebugLib.c3(r1, r2)
                if (r3 == 0) goto L24
                luaj.i[] r1 = r1.S
                int r2 = r2 - r0
                r0 = r1[r2]
                r0.c(r5)
                return r3
            L24:
                luaj.LuaValue r5 = luaj.LuaValue.f1671c
                return r5
        }
    }

    final class traceback extends luaj.lib.VarArgFunction {
        final /* synthetic */ luaj.lib.DebugLib T;

        traceback(luaj.lib.DebugLib r1) {
                r0 = this;
                r0.T = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r6) {
                r5 = this;
                r0 = 1
                boolean r1 = r6.T(r0)
                if (r1 == 0) goto Ld
                luaj.LuaThread r1 = r6.J(r0)
                r2 = 2
                goto L14
            Ld:
                luaj.lib.DebugLib r1 = r5.T
                luaj.Globals r1 = r1.T
                luaj.LuaThread r1 = r1.f0
                r2 = 1
            L14:
                int r3 = r2 + 1
                luaj.LuaValue r2 = r6.v(r2)
                boolean r4 = r2.n1()
                if (r4 != 0) goto L27
                boolean r4 = r2.l1()
                if (r4 != 0) goto L27
                return r2
            L27:
                int r6 = r6.Y(r3, r0)
                luaj.lib.DebugLib r3 = r5.T
                luaj.lib.DebugLib$b r1 = r3.Z2(r1)
                luaj.lib.DebugLib$a r0 = r1.e(r0)
                luaj.LuaFunction r0 = r0.f1747a
                if (r0 != r5) goto L3b
                int r6 = r6 + 1
            L3b:
                luaj.lib.DebugLib r0 = r5.T
                luaj.Globals r0 = r0.T
                java.lang.String r6 = r1.m(r0, r6)
                boolean r0 = r2.n1()
                if (r0 == 0) goto L61
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.g0()
                r0.append(r1)
                r1 = 10
                r0.append(r1)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
            L61:
                luaj.LuaString r6 = luaj.LuaValue.K2(r6)
                return r6
        }
    }

    static final class upvalueid extends luaj.lib.VarArgFunction {
        upvalueid() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r5) {
                r4 = this;
                r0 = 1
                luaj.LuaFunction r1 = r5.C(r0)
                r2 = 2
                int r5 = r5.D(r2)
                boolean r3 = r1 instanceof luaj.LuaClosure
                if (r3 == 0) goto L26
                luaj.LuaClosure r1 = (luaj.LuaClosure) r1
                luaj.i[] r1 = r1.S
                if (r1 == 0) goto L26
                if (r5 <= 0) goto L26
                int r3 = r1.length
                if (r5 > r3) goto L26
                int r5 = r5 - r0
                r5 = r1[r5]
                int r5 = r5.hashCode()
                long r0 = (long) r5
                luaj.LuaLong r5 = luaj.LuaValue.I2(r0)
                return r5
            L26:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "invalid upvalue index "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                java.lang.String r0 = "debug.upvalueid"
                luaj.LuaValue r5 = luaj.LuaValue.l0(r2, r0, r5)
                return r5
        }
    }

    static final class upvaluejoin extends luaj.lib.VarArgFunction {
        upvaluejoin() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r7) {
                r6 = this;
                r0 = 1
                luaj.LuaClosure r1 = r7.A(r0)
                r2 = 2
                int r2 = r7.D(r2)
                r3 = 3
                luaj.LuaClosure r3 = r7.A(r3)
                r4 = 4
                int r7 = r7.D(r4)
                java.lang.String r4 = "index out of range"
                if (r2 < r0) goto L1d
                luaj.i[] r5 = r1.S
                int r5 = r5.length
                if (r2 <= r5) goto L20
            L1d:
                r6.m0(r4)
            L20:
                if (r7 < r0) goto L27
                luaj.i[] r5 = r3.S
                int r5 = r5.length
                if (r7 <= r5) goto L2a
            L27:
                r6.m0(r4)
            L2a:
                luaj.i[] r1 = r1.S
                int r2 = r2 - r0
                luaj.i[] r3 = r3.S
                int r7 = r7 - r0
                r7 = r3[r7]
                r1[r2] = r7
                luaj.LuaValue r7 = luaj.LuaValue.f1674f
                return r7
        }
    }

    static {
            r0 = 1
            r1 = 0
            java.lang.String r2 = "CALLS"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.Exception -> Lf
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            luaj.lib.DebugLib.U = r2     // Catch: java.lang.Exception -> Lf
        Lf:
            java.lang.String r2 = "TRACE"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.Exception -> L1b
            if (r2 == 0) goto L18
            goto L19
        L18:
            r0 = 0
        L19:
            luaj.lib.DebugLib.V = r0     // Catch: java.lang.Exception -> L1b
        L1b:
            java.lang.String r0 = "?"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.W = r0
            java.lang.String r0 = "call"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.X = r0
            java.lang.String r0 = "tail call"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.Y = r0
            java.lang.String r0 = "line"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.Z = r0
            java.lang.String r0 = "count"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.a0 = r0
            java.lang.String r0 = "return"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.b0 = r0
            java.lang.String r0 = "func"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.c0 = r0
            java.lang.String r0 = "istailcall"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.d0 = r0
            java.lang.String r0 = "isvararg"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.e0 = r0
            java.lang.String r0 = "nups"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.f0 = r0
            java.lang.String r0 = "nparams"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.g0 = r0
            java.lang.String r0 = "name"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.h0 = r0
            java.lang.String r0 = "namewhat"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.i0 = r0
            java.lang.String r0 = "what"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.j0 = r0
            java.lang.String r0 = "source"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.k0 = r0
            java.lang.String r0 = "short_src"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.l0 = r0
            java.lang.String r0 = "linedefined"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.m0 = r0
            java.lang.String r0 = "lastlinedefined"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.n0 = r0
            java.lang.String r0 = "currentline"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.o0 = r0
            java.lang.String r0 = "activelines"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.p0 = r0
            java.lang.String r0 = "(*temporary)"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.q0 = r0
            java.lang.String r0 = "(*vararg)"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.DebugLib.r0 = r0
            return
    }

    public DebugLib() {
            r0 = this;
            r0.<init>()
            return
    }

    private static luaj.LuaString a3(f.d r2, int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "(.upval "
            r0.append(r1)
            if (r2 == 0) goto L1e
            boolean r1 = r2.f1564b
            if (r1 == 0) goto L13
            r1 = 118(0x76, float:1.65E-43)
            goto L15
        L13:
            r1 = 117(0x75, float:1.64E-43)
        L15:
            r0.append(r1)
            short r2 = r2.f1565c
            r0.append(r2)
            goto L23
        L1e:
            java.lang.String r2 = "???"
            r0.append(r2)
        L23:
            java.lang.String r2 = " \"(*no name)\"; u"
            r0.append(r2)
            r0.append(r3)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            luaj.LuaString r2 = luaj.LuaString.K2(r2)
            return r2
    }

    static int b3(luaj.h r6, int r7, int r8) {
            r0 = -1
            r1 = 0
        L2:
            if (r1 >= r7) goto L67
            int[] r2 = r6.f1722b
            r2 = r2[r1]
            int r3 = luaj.b.i(r2)
            r4 = 47
            if (r3 < r4) goto L11
            goto L64
        L11:
            int r4 = luaj.b.c(r2)
            r5 = 4
            if (r3 == r5) goto L5a
            r5 = 23
            if (r3 == r5) goto L4d
            r5 = 27
            if (r3 == r5) goto L4a
            r5 = 34
            if (r3 == r5) goto L45
            r5 = 36
            if (r3 == r5) goto L3c
            r2 = 29
            if (r3 == r2) goto L39
            r2 = 30
            if (r3 == r2) goto L39
            boolean r2 = luaj.b.q(r3)
            if (r2 == 0) goto L64
            if (r8 != r4) goto L64
            goto L63
        L39:
            if (r8 < r4) goto L64
            goto L63
        L3c:
            int r2 = r2 >> 14
            r2 = r2 & 511(0x1ff, float:7.16E-43)
            if (r2 != 0) goto L64
            int r1 = r1 + 1
            goto L64
        L45:
            int r4 = r4 + 2
            if (r8 < r4) goto L64
            goto L63
        L4a:
            if (r8 != r4) goto L64
            goto L63
        L4d:
            int r2 = luaj.b.h(r2)
            int r3 = r1 + 1
            int r3 = r3 + r2
            if (r1 >= r3) goto L64
            if (r3 > r7) goto L64
            int r1 = r1 + r2
            goto L64
        L5a:
            int r2 = luaj.b.e(r2)
            if (r4 > r8) goto L64
            int r4 = r4 + r2
            if (r8 > r4) goto L64
        L63:
            r0 = r1
        L64:
            int r1 = r1 + 1
            goto L2
        L67:
            return r0
    }

    static luaj.LuaString c3(luaj.LuaClosure r2, int r3) {
            luaj.i[] r0 = r2.S
            r1 = 0
            if (r0 == 0) goto L25
            if (r3 <= 0) goto L25
            int r0 = r0.length
            if (r3 > r0) goto L25
            luaj.h r2 = r2.R
            f.d[] r2 = r2.f1726f
            if (r2 == 0) goto L20
            int r0 = r2.length
            if (r3 > r0) goto L20
            int r0 = r3 + (-1)
            r2 = r2[r0]
            luaj.LuaString r0 = r2.f1563a
            if (r0 != 0) goto L1f
            luaj.LuaString r0 = a3(r2, r3)
        L1f:
            return r0
        L20:
            luaj.LuaString r2 = a3(r1, r3)
            return r2
        L25:
            return r1
    }

    static luaj.lib.DebugLib.d e3(luaj.lib.DebugLib.a r4) {
            luaj.LuaFunction r0 = r4.f1747a
            boolean r0 = r0.f1()
            if (r0 != 0) goto L16
            luaj.lib.DebugLib$d r0 = new luaj.lib.DebugLib$d
            luaj.LuaFunction r4 = r4.f1747a
            java.lang.String r4 = r4.S2()
            java.lang.String r1 = "Java"
            r0.<init>(r4, r1)
            return r0
        L16:
            luaj.LuaFunction r0 = r4.f1747a
            luaj.LuaClosure r0 = r0.w0()
            luaj.h r0 = r0.R
            int r4 = r4.f1748b
            int[] r1 = r0.f1722b
            int r2 = r1.length
            r3 = 0
            if (r4 < r2) goto L27
            return r3
        L27:
            r1 = r1[r4]
            int r2 = luaj.b.i(r1)
            switch(r2) {
                case 6: goto L7e;
                case 7: goto L7e;
                case 8: goto L7b;
                case 9: goto L30;
                case 10: goto L7b;
                case 11: goto L30;
                case 12: goto L7e;
                case 13: goto L78;
                case 14: goto L75;
                case 15: goto L72;
                case 16: goto L6f;
                case 17: goto L6c;
                case 18: goto L69;
                case 19: goto L66;
                case 20: goto L30;
                case 21: goto L63;
                case 22: goto L60;
                case 23: goto L30;
                case 24: goto L5d;
                case 25: goto L5a;
                case 26: goto L57;
                case 27: goto L30;
                case 28: goto L30;
                case 29: goto L4e;
                case 30: goto L4e;
                case 31: goto L30;
                case 32: goto L30;
                case 33: goto L30;
                case 34: goto L46;
                case 35: goto L30;
                case 36: goto L30;
                case 37: goto L30;
                case 38: goto L30;
                case 39: goto L30;
                case 40: goto L43;
                case 41: goto L40;
                case 42: goto L3d;
                case 43: goto L3a;
                case 44: goto L37;
                case 45: goto L34;
                case 46: goto L31;
                default: goto L30;
            }
        L30:
            return r3
        L31:
            luaj.LuaString r4 = luaj.LuaValue.J
            goto L80
        L34:
            luaj.LuaString r4 = luaj.LuaValue.I
            goto L80
        L37:
            luaj.LuaString r4 = luaj.LuaValue.H
            goto L80
        L3a:
            luaj.LuaString r4 = luaj.LuaValue.G
            goto L80
        L3d:
            luaj.LuaString r4 = luaj.LuaValue.F
            goto L80
        L40:
            luaj.LuaString r4 = luaj.LuaValue.E
            goto L80
        L43:
            luaj.LuaString r4 = luaj.LuaValue.D
            goto L80
        L46:
            luaj.lib.DebugLib$d r4 = new luaj.lib.DebugLib$d
            java.lang.String r0 = "for iterator"
            r4.<init>(r0, r0)
            return r4
        L4e:
            int r1 = luaj.b.c(r1)
            luaj.lib.DebugLib$d r4 = g3(r0, r4, r1)
            return r4
        L57:
            luaj.LuaString r4 = luaj.LuaValue.A
            goto L80
        L5a:
            luaj.LuaString r4 = luaj.LuaValue.z
            goto L80
        L5d:
            luaj.LuaString r4 = luaj.LuaValue.y
            goto L80
        L60:
            luaj.LuaString r4 = luaj.LuaValue.C
            goto L80
        L63:
            luaj.LuaString r4 = luaj.LuaValue.x
            goto L80
        L66:
            luaj.LuaString r4 = luaj.LuaValue.w
            goto L80
        L69:
            luaj.LuaString r4 = luaj.LuaValue.u
            goto L80
        L6c:
            luaj.LuaString r4 = luaj.LuaValue.v
            goto L80
        L6f:
            luaj.LuaString r4 = luaj.LuaValue.s
            goto L80
        L72:
            luaj.LuaString r4 = luaj.LuaValue.t
            goto L80
        L75:
            luaj.LuaString r4 = luaj.LuaValue.r
            goto L80
        L78:
            luaj.LuaString r4 = luaj.LuaValue.q
            goto L80
        L7b:
            luaj.LuaString r4 = luaj.LuaValue.m
            goto L80
        L7e:
            luaj.LuaString r4 = luaj.LuaValue.l
        L80:
            luaj.lib.DebugLib$d r0 = new luaj.lib.DebugLib$d
            java.lang.String r4 = r4.g0()
            java.lang.String r1 = "metamethod"
            r0.<init>(r4, r1)
            return r0
    }

    public static java.lang.String f3(int r0, int r1, luaj.h r2) {
            luaj.lib.DebugLib$d r0 = g3(r2, r0, r1)
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            java.lang.String r0 = r0.toString()
        Lc:
            return r0
    }

    static luaj.lib.DebugLib.d g3(luaj.h r5, int r6, int r7) {
            int r0 = r7 + 1
            luaj.LuaString r0 = r5.a(r0, r6)
            if (r0 == 0) goto L14
            luaj.lib.DebugLib$d r5 = new luaj.lib.DebugLib$d
            java.lang.String r6 = r0.g0()
            java.lang.String r7 = "local"
            r5.<init>(r6, r7)
            return r5
        L14:
            int r6 = b3(r5, r6, r7)
            r7 = -1
            r0 = 0
            if (r6 == r7) goto Le4
            int[] r7 = r5.f1722b
            r7 = r7[r6]
            int r1 = luaj.b.i(r7)
            if (r1 == 0) goto Ld5
            r2 = 1
            if (r1 == r2) goto La3
            r3 = 2
            if (r1 == r3) goto La3
            r3 = 5
            if (r1 == r3) goto L84
            r3 = 6
            r4 = 7
            if (r1 == r3) goto L4b
            if (r1 == r4) goto L4b
            r2 = 12
            if (r1 == r2) goto L3b
            goto Le4
        L3b:
            int r7 = luaj.b.g(r7)
            java.lang.String r5 = h3(r5, r6, r7)
            luaj.lib.DebugLib$d r6 = new luaj.lib.DebugLib$d
            java.lang.String r7 = "method"
            r6.<init>(r5, r7)
            return r6
        L4b:
            int r0 = luaj.b.g(r7)
            int r1 = luaj.b.e(r7)
            int r7 = luaj.b.i(r7)
            if (r7 != r4) goto L5f
            int r1 = r1 + r2
            luaj.LuaString r7 = r5.a(r1, r6)
            goto L6b
        L5f:
            f.d[] r7 = r5.f1726f
            int r2 = r7.length
            if (r1 >= r2) goto L69
            r7 = r7[r1]
            luaj.LuaString r7 = r7.f1563a
            goto L6b
        L69:
            luaj.LuaString r7 = luaj.lib.DebugLib.W
        L6b:
            java.lang.String r5 = h3(r5, r6, r0)
            luaj.lib.DebugLib$d r6 = new luaj.lib.DebugLib$d
            if (r7 == 0) goto L7e
            luaj.LuaString r0 = luaj.LuaValue.k
            boolean r7 = r7.P0(r0)
            if (r7 == 0) goto L7e
            java.lang.String r7 = "global"
            goto L80
        L7e:
            java.lang.String r7 = "field"
        L80:
            r6.<init>(r5, r7)
            return r6
        L84:
            int r6 = luaj.b.e(r7)
            f.d[] r5 = r5.f1726f
            int r7 = r5.length
            if (r6 >= r7) goto L92
            r5 = r5[r6]
            luaj.LuaString r5 = r5.f1563a
            goto L94
        L92:
            luaj.LuaString r5 = luaj.lib.DebugLib.W
        L94:
            if (r5 != 0) goto L97
            goto La2
        L97:
            luaj.lib.DebugLib$d r0 = new luaj.lib.DebugLib$d
            java.lang.String r5 = r5.g0()
            java.lang.String r6 = "upvalue"
            r0.<init>(r5, r6)
        La2:
            return r0
        La3:
            int r1 = luaj.b.i(r7)
            if (r1 != r2) goto Lae
            int r6 = luaj.b.f(r7)
            goto Lb7
        Lae:
            int[] r7 = r5.f1722b
            int r6 = r6 + r2
            r6 = r7[r6]
            int r6 = luaj.b.d(r6)
        Lb7:
            luaj.LuaValue[] r7 = r5.f1721a
            r7 = r7[r6]
            boolean r7 = r7.n1()
            if (r7 == 0) goto Le4
            luaj.LuaValue[] r5 = r5.f1721a
            r5 = r5[r6]
            luaj.LuaString r5 = r5.q2()
            luaj.lib.DebugLib$d r6 = new luaj.lib.DebugLib$d
            java.lang.String r5 = r5.g0()
            java.lang.String r7 = "constant"
            r6.<init>(r5, r7)
            return r6
        Ld5:
            int r1 = luaj.b.c(r7)
            int r7 = luaj.b.e(r7)
            if (r7 >= r1) goto Le4
            luaj.lib.DebugLib$d r5 = g3(r5, r6, r7)
            return r5
        Le4:
            return r0
    }

    static java.lang.String h3(luaj.h r1, int r2, int r3) {
            boolean r0 = luaj.b.k(r3)
            if (r0 == 0) goto L19
            luaj.LuaValue[] r1 = r1.f1721a
            int r2 = luaj.b.j(r3)
            r1 = r1[r2]
            boolean r2 = r1.n1()
            if (r2 == 0) goto L2c
            java.lang.String r1 = r1.g0()
            return r1
        L19:
            luaj.lib.DebugLib$d r1 = g3(r1, r2, r3)
            if (r1 == 0) goto L2c
            java.lang.String r2 = "constant"
            java.lang.String r3 = r1.f1764b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2c
            java.lang.String r1 = r1.f1763a
            return r1
        L2c:
            java.lang.String r1 = "?"
            return r1
    }

    void X2(luaj.LuaThread.a r5, luaj.LuaValue r6, luaj.LuaValue r7) {
            r4 = this;
            luaj.LuaFunction r0 = r5.f1668f
            int r1 = r5.k
            if (r1 != 0) goto L3a
            if (r0 != 0) goto L9
            goto L3a
        L9:
            r1 = 1
            r5.k = r1
            r2 = 0
            boolean r3 = r0.f1()     // Catch: java.lang.Throwable -> L18 java.lang.RuntimeException -> L1a luaj.d -> L1c
            r1 = r1 ^ r3
            if (r1 == 0) goto L1e
            r4.j3(r0, r2)     // Catch: java.lang.Throwable -> L18 java.lang.RuntimeException -> L1a luaj.d -> L1c
            goto L1e
        L18:
            r6 = move-exception
            goto L37
        L1a:
            r6 = move-exception
            goto L30
        L1c:
            r6 = move-exception
            goto L36
        L1e:
            r0.call(r6, r7)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L26
            r4.l3()     // Catch: java.lang.Throwable -> L18 java.lang.RuntimeException -> L1a luaj.d -> L1c
        L26:
            r5.k = r2
            return
        L29:
            r6 = move-exception
            if (r1 == 0) goto L2f
            r4.l3()     // Catch: java.lang.Throwable -> L18 java.lang.RuntimeException -> L1a luaj.d -> L1c
        L2f:
            throw r6     // Catch: java.lang.Throwable -> L18 java.lang.RuntimeException -> L1a luaj.d -> L1c
        L30:
            luaj.d$a r7 = new luaj.d$a     // Catch: java.lang.Throwable -> L18
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L18
            throw r7     // Catch: java.lang.Throwable -> L18
        L36:
            throw r6     // Catch: java.lang.Throwable -> L18
        L37:
            r5.k = r2
            throw r6
        L3a:
            return
    }

    luaj.lib.DebugLib.b Y2() {
            r1 = this;
            luaj.Globals r0 = r1.T
            luaj.LuaThread r0 = r0.f0
            luaj.lib.DebugLib$b r0 = r1.Z2(r0)
            return r0
    }

    luaj.lib.DebugLib.b Z2(luaj.LuaThread r2) {
            r1 = this;
            java.lang.Object r0 = r2.Q
            if (r0 != 0) goto Lb
            luaj.lib.DebugLib$b r0 = new luaj.lib.DebugLib$b
            r0.<init>()
            r2.Q = r0
        Lb:
            java.lang.Object r2 = r2.Q
            luaj.lib.DebugLib$b r2 = (luaj.lib.DebugLib.b) r2
            return r2
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r4, luaj.LuaValue r5) {
            r3 = this;
            luaj.Globals r4 = r5.z0()
            r3.T = r4
            r4.i0 = r3
            luaj.LuaTable r4 = new luaj.LuaTable
            r4.<init>()
            luaj.lib.DebugLib$debug r0 = new luaj.lib.DebugLib$debug
            r0.<init>()
            java.lang.String r1 = "debug"
            r4.i2(r1, r0)
            luaj.lib.DebugLib$gethook r0 = new luaj.lib.DebugLib$gethook
            r0.<init>(r3)
            java.lang.String r2 = "gethook"
            r4.i2(r2, r0)
            luaj.lib.DebugLib$getinfo r0 = new luaj.lib.DebugLib$getinfo
            r0.<init>(r3)
            java.lang.String r2 = "getinfo"
            r4.i2(r2, r0)
            luaj.lib.DebugLib$getlocal r0 = new luaj.lib.DebugLib$getlocal
            r0.<init>(r3)
            java.lang.String r2 = "getlocal"
            r4.i2(r2, r0)
            luaj.lib.DebugLib$getmetatable r0 = new luaj.lib.DebugLib$getmetatable
            r0.<init>()
            java.lang.String r2 = "getmetatable"
            r4.i2(r2, r0)
            luaj.lib.DebugLib$getregistry r0 = new luaj.lib.DebugLib$getregistry
            r0.<init>(r3)
            java.lang.String r2 = "getregistry"
            r4.i2(r2, r0)
            luaj.lib.DebugLib$getupvalue r0 = new luaj.lib.DebugLib$getupvalue
            r0.<init>()
            java.lang.String r2 = "getupvalue"
            r4.i2(r2, r0)
            luaj.lib.DebugLib$sethook r0 = new luaj.lib.DebugLib$sethook
            r0.<init>(r3)
            java.lang.String r2 = "sethook"
            r4.i2(r2, r0)
            luaj.lib.DebugLib$setlocal r0 = new luaj.lib.DebugLib$setlocal
            r0.<init>(r3)
            java.lang.String r2 = "setlocal"
            r4.i2(r2, r0)
            luaj.lib.DebugLib$setmetatable r0 = new luaj.lib.DebugLib$setmetatable
            r0.<init>()
            java.lang.String r2 = "setmetatable"
            r4.i2(r2, r0)
            luaj.lib.DebugLib$setupvalue r0 = new luaj.lib.DebugLib$setupvalue
            r0.<init>()
            java.lang.String r2 = "setupvalue"
            r4.i2(r2, r0)
            luaj.lib.DebugLib$traceback r0 = new luaj.lib.DebugLib$traceback
            r0.<init>(r3)
            java.lang.String r2 = "traceback"
            r4.i2(r2, r0)
            luaj.lib.DebugLib$upvalueid r0 = new luaj.lib.DebugLib$upvalueid
            r0.<init>()
            java.lang.String r2 = "upvalueid"
            r4.i2(r2, r0)
            luaj.lib.DebugLib$upvaluejoin r0 = new luaj.lib.DebugLib$upvaluejoin
            r0.<init>()
            java.lang.String r2 = "upvaluejoin"
            r4.i2(r2, r0)
            r5.i2(r1, r4)
            java.lang.String r0 = "package"
            luaj.LuaValue r2 = r5.T0(r0)
            boolean r2 = r2.l1()
            if (r2 != 0) goto Lb5
            luaj.LuaValue r5 = r5.T0(r0)
            java.lang.String r0 = "loaded"
            luaj.LuaValue r5 = r5.T0(r0)
            r5.i2(r1, r4)
        Lb5:
            return r4
    }

    public luaj.lib.DebugLib.a d3(int r2) {
            r1 = this;
            luaj.lib.DebugLib$b r0 = r1.Y2()
            luaj.lib.DebugLib$a r2 = r0.e(r2)
            return r2
    }

    public void i3(luaj.LuaClosure r11, luaj.Varargs r12, luaj.LuaValue[] r13, boolean r14) {
            r10 = this;
            luaj.Globals r0 = r10.T
            luaj.LuaThread r0 = r0.f0
            luaj.LuaThread$a r0 = r0.P
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 != r3) goto Le
            r8 = 1
            goto Lf
        Le:
            r8 = 0
        Lf:
            if (r8 == 0) goto L14
            r1 = 2
            r0.k = r1
        L14:
            luaj.lib.DebugLib$b r4 = r10.Y2()
            r5 = r11
            r6 = r12
            r7 = r13
            r9 = r14
            r4.f(r5, r6, r7, r8, r9)
            int r11 = r0.k
            if (r11 == 0) goto L24
            return
        L24:
            boolean r11 = r0.f1669g
            if (r11 == 0) goto L2c
            r0.l = r2
            r0.m = r2
        L2c:
            boolean r11 = r0.h
            if (r11 == 0) goto L3c
            if (r14 == 0) goto L35
            luaj.LuaString r11 = luaj.lib.DebugLib.Y
            goto L37
        L35:
            luaj.LuaString r11 = luaj.lib.DebugLib.X
        L37:
            luaj.LuaValue r12 = luaj.LuaValue.f1671c
            r10.X2(r0, r11, r12)
        L3c:
            return
    }

    public void j3(luaj.LuaFunction r5, boolean r6) {
            r4 = this;
            luaj.Globals r0 = r4.T
            luaj.LuaThread r0 = r0.f0
            luaj.LuaThread$a r0 = r0.P
            int r1 = r0.k
            r2 = 0
            r3 = 1
            if (r1 != r3) goto Ld
            goto Le
        Ld:
            r3 = 0
        Le:
            if (r3 == 0) goto L13
            r1 = 2
            r0.k = r1
        L13:
            luaj.lib.DebugLib$b r1 = r4.Y2()
            r1.g(r5, r3, r6)
            int r5 = r0.k
            if (r5 == 0) goto L1f
            return
        L1f:
            boolean r5 = r0.f1669g
            if (r5 == 0) goto L27
            r0.l = r2
            r0.m = r2
        L27:
            boolean r5 = r0.h
            if (r5 == 0) goto L37
            if (r6 == 0) goto L30
            luaj.LuaString r5 = luaj.lib.DebugLib.Y
            goto L32
        L30:
            luaj.LuaString r5 = luaj.lib.DebugLib.X
        L32:
            luaj.LuaValue r6 = luaj.LuaValue.f1671c
            r4.X2(r0, r5, r6)
        L37:
            return
    }

    public void k3(int r5, luaj.Varargs r6, int r7) {
            r4 = this;
            luaj.Globals r0 = r4.T
            luaj.LuaThread r0 = r0.f0
            luaj.LuaThread$a r1 = r0.P
            luaj.lib.DebugLib$b r0 = r4.Z2(r0)
            r0.h(r5, r6, r7)
            int r6 = r1.k
            if (r6 == 0) goto L12
            return
        L12:
            luaj.LuaFunction r6 = r1.f1668f
            if (r6 != 0) goto L17
            return
        L17:
            int r6 = r1.j
            if (r6 <= 0) goto L2b
            int r7 = r1.n
            int r7 = r7 + 1
            r1.n = r7
            int r7 = r7 % r6
            if (r7 != 0) goto L2b
            luaj.LuaString r6 = luaj.lib.DebugLib.a0
            luaj.LuaValue r7 = luaj.LuaValue.f1671c
            r4.X2(r1, r6, r7)
        L2b:
            boolean r6 = r1.f1669g
            if (r6 == 0) goto L4d
            luaj.lib.DebugLib$b r6 = r4.Y2()
            int r6 = r6.b()
            int r7 = r1.l
            if (r6 != r7) goto L3f
            int r7 = r1.m
            if (r5 > r7) goto L4b
        L3f:
            r1.l = r6
            luaj.LuaString r7 = luaj.lib.DebugLib.Z
            long r2 = (long) r6
            luaj.LuaLong r6 = luaj.LuaValue.I2(r2)
            r4.X2(r1, r7, r6)
        L4b:
            r1.m = r5
        L4d:
            return
    }

    public void l3() {
            r3 = this;
            luaj.Globals r0 = r3.T
            luaj.LuaThread r0 = r0.f0
            luaj.LuaThread$a r0 = r0.P
            int r1 = r0.k
            if (r1 != 0) goto L15
            boolean r1 = r0.i
            if (r1 == 0) goto L15
            luaj.LuaString r1 = luaj.lib.DebugLib.b0
            luaj.LuaValue r2 = luaj.LuaValue.f1671c
            r3.X2(r0, r1, r2)
        L15:
            luaj.lib.DebugLib$b r1 = r3.Y2()
            r1.i(r0)
            return
    }

    public java.lang.String m3(luaj.Globals r2, int r3) {
            r1 = this;
            luaj.lib.DebugLib$b r0 = r1.Y2()
            java.lang.String r2 = r0.m(r2, r3)
            return r2
    }
}
