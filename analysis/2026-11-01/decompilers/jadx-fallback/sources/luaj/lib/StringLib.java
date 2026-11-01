package luaj.lib;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class StringLib extends luaj.lib.TwoArgFunction {
    private static final luaj.LuaString T = null;
    static final byte[] U = null;

    static class GMatchAux extends luaj.lib.VarArgFunction {
        private final int T;
        private final luaj.lib.StringLib.b U;
        private int V;
        private int W;

        public GMatchAux(luaj.Varargs r2, luaj.LuaString r3, luaj.LuaString r4) {
                r1 = this;
                r1.<init>()
                int r0 = r3.s1()
                r1.T = r0
                luaj.lib.StringLib$b r0 = new luaj.lib.StringLib$b
                r0.<init>(r2, r3, r4)
                r1.U = r0
                r2 = 0
                r1.V = r2
                r2 = -1
                r1.W = r2
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r4) {
                r3 = this;
            L0:
                int r4 = r3.V
                int r0 = r3.T
                if (r4 > r0) goto L2e
                luaj.lib.StringLib$b r4 = r3.U
                r4.p()
                luaj.lib.StringLib$b r4 = r3.U
                int r0 = r3.V
                r1 = 0
                int r4 = r4.g(r0, r1)
                r0 = 1
                if (r4 < 0) goto L28
                int r1 = r3.W
                if (r4 == r1) goto L28
                int r1 = r3.V
                r3.V = r4
                r3.W = r4
                luaj.lib.StringLib$b r2 = r3.U
                luaj.Varargs r4 = r2.n(r0, r1, r4)
                return r4
            L28:
                int r4 = r3.V
                int r4 = r4 + r0
                r3.V = r4
                goto L0
            L2e:
                luaj.LuaValue r4 = luaj.LuaValue.f1671c
                return r4
        }
    }

    static final class _byte extends luaj.lib.VarArgFunction {
        _byte() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r8) {
                r7 = this;
                r0 = 1
                luaj.LuaString r1 = r8.H(r0)
                int r2 = r1.R
                r3 = 2
                int r3 = r8.Y(r3, r0)
                int r3 = luaj.lib.StringLib.c3(r3, r2)
                r4 = 3
                int r8 = r8.Y(r4, r3)
                int r8 = luaj.lib.StringLib.c3(r8, r2)
                if (r3 > 0) goto L1c
                r3 = 1
            L1c:
                if (r8 <= r2) goto L1f
                goto L20
            L1f:
                r2 = r8
            L20:
                if (r3 <= r2) goto L25
                luaj.LuaValue r8 = luaj.LuaValue.f1674f
                return r8
            L25:
                int r8 = r2 - r3
                int r8 = r8 + r0
                int r4 = r3 + r8
                if (r4 > r2) goto L31
                java.lang.String r2 = "string slice too long"
                luaj.LuaValue.R0(r2)
            L31:
                luaj.LuaValue[] r2 = new luaj.LuaValue[r8]
                r4 = 0
            L34:
                if (r4 >= r8) goto L47
                int r5 = r3 + r4
                int r5 = r5 - r0
                int r5 = r1.g3(r5)
                long r5 = (long) r5
                luaj.LuaLong r5 = luaj.LuaValue.I2(r5)
                r2[r4] = r5
                int r4 = r4 + 1
                goto L34
            L47:
                luaj.Varargs r8 = luaj.LuaValue.O2(r2)
                return r8
        }
    }

    static final class _char extends luaj.lib.VarArgFunction {
        _char() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r8) {
                r7 = this;
                int r0 = r8.U()
                byte[] r1 = new byte[r0]
                r2 = 0
                r3 = 1
            L8:
                if (r2 >= r0) goto L30
                int r4 = r8.D(r3)
                if (r4 < 0) goto L14
                r5 = 256(0x100, float:3.59E-43)
                if (r4 < r5) goto L28
            L14:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "invalid value for string.char [0; 255]: "
                r5.append(r6)
                r5.append(r4)
                java.lang.String r5 = r5.toString()
                luaj.LuaValue.k0(r3, r5)
            L28:
                byte r4 = (byte) r4
                r1[r2] = r4
                int r2 = r2 + 1
                int r3 = r3 + 1
                goto L8
            L30:
                luaj.LuaString r8 = luaj.LuaString.o3(r1)
                return r8
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f1770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f1771c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f1772d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f1773e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f1774f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f1775g;
        public final int h;
        public final int i;
        public final java.lang.String j;

        public a(luaj.Varargs r8, luaj.LuaString r9, int r10) {
                r7 = this;
                r7.<init>()
                int r8 = r9.s1()
                r0 = 0
                r1 = 1
                r3 = r10
                r2 = 1
                r4 = 0
            Lc:
                if (r2 == 0) goto L40
                if (r3 >= r8) goto L1a
                int r4 = r3 + 1
                int r3 = r9.g3(r3)
                r6 = r4
                r4 = r3
                r3 = r6
                goto L1b
            L1a:
                r4 = 0
            L1b:
                r5 = 32
                if (r4 == r5) goto L3d
                r5 = 35
                if (r4 == r5) goto L3a
                r5 = 43
                if (r4 == r5) goto L37
                r5 = 45
                if (r4 == r5) goto L34
                r5 = 48
                if (r4 == r5) goto L31
                r2 = 0
                goto Lc
            L31:
                r7.f1770b = r1
                goto Lc
            L34:
                r7.f1769a = r1
                goto Lc
            L37:
                r7.f1771c = r1
                goto Lc
            L3a:
                r7.f1773e = r1
                goto Lc
            L3d:
                r7.f1772d = r1
                goto Lc
            L40:
                int r2 = r3 - r10
                r5 = 5
                if (r2 <= r5) goto L4a
                java.lang.String r2 = "invalid format (repeated flags)"
                luaj.LuaValue.R0(r2)
            L4a:
                r2 = -1
                r7.f1774f = r2
                char r5 = (char) r4
                boolean r5 = java.lang.Character.isDigit(r5)
                if (r5 == 0) goto L82
                int r4 = r4 + (-48)
                r7.f1774f = r4
                if (r3 >= r8) goto L64
                int r4 = r3 + 1
                int r3 = r9.g3(r3)
                r6 = r4
                r4 = r3
                r3 = r6
                goto L65
            L64:
                r4 = 0
            L65:
                char r5 = (char) r4
                boolean r5 = java.lang.Character.isDigit(r5)
                if (r5 == 0) goto L82
                int r5 = r7.f1774f
                int r5 = r5 * 10
                int r4 = r4 + (-48)
                int r5 = r5 + r4
                r7.f1774f = r5
                if (r3 >= r8) goto L81
                int r4 = r3 + 1
                int r3 = r9.g3(r3)
                r6 = r4
                r4 = r3
                r3 = r6
                goto L82
            L81:
                r4 = 0
            L82:
                r7.f1775g = r2
                r2 = 46
                if (r4 != r2) goto Lc5
                if (r3 >= r8) goto L93
                int r2 = r3 + 1
                int r3 = r9.g3(r3)
                r4 = r3
                r3 = r2
                goto L94
            L93:
                r4 = 0
            L94:
                char r2 = (char) r4
                boolean r2 = java.lang.Character.isDigit(r2)
                if (r2 == 0) goto Lc5
                int r4 = r4 + (-48)
                r7.f1775g = r4
                if (r3 >= r8) goto Laa
                int r2 = r3 + 1
                int r3 = r9.g3(r3)
                r4 = r3
                r3 = r2
                goto Lab
            Laa:
                r4 = 0
            Lab:
                char r2 = (char) r4
                boolean r2 = java.lang.Character.isDigit(r2)
                if (r2 == 0) goto Lc5
                int r2 = r7.f1775g
                int r2 = r2 * 10
                int r4 = r4 + (-48)
                int r2 = r2 + r4
                r7.f1775g = r2
                if (r3 >= r8) goto Lc4
                int r8 = r3 + 1
                int r0 = r9.g3(r3)
                r3 = r8
            Lc4:
                r4 = r0
            Lc5:
                char r8 = (char) r4
                boolean r8 = java.lang.Character.isDigit(r8)
                if (r8 == 0) goto Le0
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "invalid format (width or precision too long) at pos "
                r8.append(r0)
                r8.append(r3)
                java.lang.String r8 = r8.toString()
                luaj.LuaValue.R0(r8)
            Le0:
                boolean r8 = r7.f1770b
                boolean r0 = r7.f1769a
                r0 = r0 ^ r1
                r8 = r8 & r0
                r7.f1770b = r8
                r7.h = r4
                int r8 = r3 - r10
                r7.i = r8
                int r10 = r10 - r1
                luaj.LuaString r8 = r9.j3(r10, r3)
                java.lang.String r8 = r8.g0()
                r7.j = r8
                return
        }

        public static final void e(f.a r1, char r2, int r3) {
                byte r2 = (byte) r2
            L1:
                int r0 = r3 + (-1)
                if (r3 <= 0) goto La
                r1.a(r2)
                r3 = r0
                goto L1
            La:
                return
        }

        public void a(f.a r1, byte r2) {
                r0 = this;
                r1.a(r2)
                return
        }

        public void b(f.a r6, double r7) {
                r5 = this;
                boolean r0 = java.lang.Double.isNaN(r7)
                if (r0 == 0) goto L9
                java.lang.String r0 = "nan"
                goto L1c
            L9:
                boolean r0 = java.lang.Double.isInfinite(r7)
                if (r0 == 0) goto L1b
                r0 = 0
                int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r2 >= 0) goto L18
                java.lang.String r0 = "-inf"
                goto L1c
            L18:
                java.lang.String r0 = "inf"
                goto L1c
            L1b:
                r0 = 0
            L1c:
                if (r0 == 0) goto L2b
                int r7 = r5.h
                r8 = 97
                if (r7 >= r8) goto L66
                java.util.Locale r7 = java.util.Locale.US
                java.lang.String r0 = r0.toUpperCase(r7)
                goto L66
            L2b:
                java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L3e
                java.lang.String r1 = r5.j     // Catch: java.lang.Throwable -> L3e
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3e
                java.lang.Double r3 = java.lang.Double.valueOf(r7)     // Catch: java.lang.Throwable -> L3e
                r4 = 0
                r2[r4] = r3     // Catch: java.lang.Throwable -> L3e
                java.lang.String r0 = java.lang.String.format(r0, r1, r2)     // Catch: java.lang.Throwable -> L3e
                goto L66
            L3e:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed format double "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r2 = " with '"
                r1.append(r2)
                java.lang.String r2 = r5.j
                r1.append(r2)
                r2 = 39
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.ext.e1.s(r1, r0)
                java.lang.String r0 = java.lang.String.valueOf(r7)
            L66:
                r6.b(r0)
                return
        }

        public void c(f.a r10, long r11) {
                r9 = this;
                r0 = 0
                r2 = 1
                int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                if (r3 != 0) goto Le
                int r0 = r9.f1775g
                if (r0 != 0) goto Le
                java.lang.String r11 = ""
                goto L59
            Le:
                int r0 = r9.h
                r1 = 88
                if (r0 == r1) goto L4b
                r4 = 111(0x6f, float:1.56E-43)
                if (r0 == r4) goto L46
                r4 = 117(0x75, float:1.64E-43)
                if (r0 == r4) goto L25
                r4 = 120(0x78, float:1.68E-43)
                if (r0 == r4) goto L4b
            L20:
                java.lang.String r11 = java.lang.Long.toString(r11)
                goto L4f
            L25:
                if (r3 < 0) goto L28
                goto L20
            L28:
                long r4 = r11 >>> r2
                r6 = 5
                long r4 = r4 / r6
                r6 = 10
                long r6 = r6 * r4
                long r11 = r11 - r6
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = java.lang.Long.toString(r4)
                r0.append(r4)
                r0.append(r11)
                java.lang.String r11 = r0.toString()
                goto L4f
            L46:
                java.lang.String r11 = java.lang.Long.toOctalString(r11)
                goto L4f
            L4b:
                java.lang.String r11 = java.lang.Long.toHexString(r11)
            L4f:
                int r12 = r9.h
                if (r12 != r1) goto L59
                java.util.Locale r12 = java.util.Locale.US
                java.lang.String r11 = r11.toUpperCase(r12)
            L59:
                int r12 = r11.length()
                if (r3 >= 0) goto L65
                int r0 = r12 + (-1)
                r8 = r0
                r0 = r12
                r12 = r8
                goto L72
            L65:
                boolean r0 = r9.f1771c
                if (r0 != 0) goto L70
                boolean r0 = r9.f1772d
                if (r0 == 0) goto L6e
                goto L70
            L6e:
                r0 = r12
                goto L72
            L70:
                int r0 = r12 + 1
            L72:
                int r1 = r9.f1775g
                r4 = 0
                if (r1 <= r12) goto L79
                int r1 = r1 - r12
                goto L88
            L79:
                r12 = -1
                if (r1 != r12) goto L87
                boolean r12 = r9.f1770b
                if (r12 == 0) goto L87
                int r12 = r9.f1774f
                if (r12 <= r0) goto L87
                int r1 = r12 - r0
                goto L88
            L87:
                r1 = 0
            L88:
                int r0 = r0 + r1
                int r12 = r9.f1774f
                if (r12 <= r0) goto L8f
                int r4 = r12 - r0
            L8f:
                boolean r12 = r9.f1769a
                r0 = 32
                if (r12 != 0) goto L98
                e(r10, r0, r4)
            L98:
                if (r3 >= 0) goto La6
                if (r1 <= 0) goto Lb7
                r12 = 45
                r10.a(r12)
                java.lang.String r11 = r11.substring(r2)
                goto Lb7
            La6:
                boolean r12 = r9.f1771c
                if (r12 == 0) goto Lb0
                r12 = 43
                r10.a(r12)
                goto Lb7
            Lb0:
                boolean r12 = r9.f1772d
                if (r12 == 0) goto Lb7
                r10.a(r0)
            Lb7:
                if (r1 <= 0) goto Lbe
                r12 = 48
                e(r10, r12, r1)
            Lbe:
                r10.b(r11)
                boolean r11 = r9.f1769a
                if (r11 == 0) goto Lc8
                e(r10, r0, r4)
            Lc8:
                return
        }

        public void d(f.a r7, luaj.LuaString r8) {
                r6 = this;
                int r0 = r8.s1()
                int r1 = r6.f1774f
                int r2 = r6.f1775g
                r3 = -1
                if (r2 != r3) goto Lc
                r2 = r0
            Lc:
                if (r0 <= r2) goto Lf
                r0 = r2
            Lf:
                r2 = 32
                r3 = 48
                if (r0 >= r1) goto L2d
                boolean r4 = r6.f1769a
                if (r4 != 0) goto L2d
                boolean r4 = r6.f1770b
                if (r4 == 0) goto L20
                r4 = 48
                goto L22
            L20:
                r4 = 32
            L22:
                byte r4 = (byte) r4
                int r5 = r1 - r0
            L25:
                if (r5 <= 0) goto L2d
                r7.a(r4)
                int r5 = r5 + (-1)
                goto L25
            L2d:
                byte[] r4 = r8.P
                int r8 = r8.Q
                r7.e(r4, r8, r0)
                if (r0 >= r1) goto L4a
                boolean r8 = r6.f1769a
                if (r8 == 0) goto L4a
                boolean r8 = r6.f1770b
                if (r8 == 0) goto L40
                r2 = 48
            L40:
                byte r8 = (byte) r2
                int r1 = r1 - r0
            L42:
                if (r1 <= 0) goto L4a
                r7.a(r8)
                int r1 = r1 + (-1)
                goto L42
            L4a:
                return
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final luaj.LuaString f1777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final luaj.LuaString f1778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final luaj.Varargs f1779d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1780e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f1781f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int[] f1782g;

        b(luaj.Varargs r1, luaj.LuaString r2, luaj.LuaString r3) {
                r0 = this;
                r0.<init>()
                r0.f1777b = r2
                r0.f1778c = r3
                r0.f1779d = r1
                r1 = 0
                r0.f1780e = r1
                r1 = 32
                int[] r2 = new int[r1]
                r0.f1781f = r2
                int[] r1 = new int[r1]
                r0.f1782g = r1
                r1 = 200(0xc8, float:2.8E-43)
                r0.f1776a = r1
                return
        }

        private void a(f.a r10, luaj.LuaString r11, int r12, int r13) {
                r9 = this;
                int r0 = r11.s1()
                r1 = 0
                r2 = 0
            L6:
                if (r2 >= r0) goto L88
                int r3 = r11.g3(r2)
                byte r3 = (byte) r3
                r4 = 37
                if (r3 == r4) goto L16
                r10.a(r3)
                goto L84
            L16:
                int r3 = r2 + 1
                if (r3 >= r0) goto L1f
                int r5 = r11.g3(r3)
                goto L20
            L1f:
                r5 = 0
            L20:
                byte r5 = (byte) r5
                char r6 = (char) r5
                boolean r7 = java.lang.Character.isDigit(r6)
                if (r7 != 0) goto L6a
                if (r5 == r4) goto L66
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "invalid use of '%' in replacement string: after '%' must be '0'-'9' or '%', but found "
                r4.append(r7)
                if (r3 >= r0) goto L5a
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "symbol '"
                r7.append(r8)
                r7.append(r6)
                java.lang.String r6 = "' with code "
                r7.append(r6)
                r7.append(r5)
                java.lang.String r6 = " at pos "
                r7.append(r6)
                int r2 = r2 + 2
                r7.append(r2)
                java.lang.String r2 = r7.toString()
                goto L5c
            L5a:
                java.lang.String r2 = "end of string"
            L5c:
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                luaj.LuaValue.R0(r2)
            L66:
                r10.a(r5)
                goto L83
            L6a:
                r2 = 48
                if (r5 != r2) goto L78
                luaj.LuaString r2 = r9.f1777b
                luaj.LuaString r2 = r2.j3(r12, r13)
            L74:
                r10.c(r2)
                goto L83
            L78:
                int r5 = r5 + (-49)
                luaj.LuaValue r2 = r9.o(r5, r12, r13)
                luaj.LuaString r2 = r2.q2()
                goto L74
            L83:
                r2 = r3
            L84:
                int r2 = r2 + 1
                goto L6
            L88:
                return
        }

        private int c() {
                r3 = this;
                int r0 = r3.f1780e
                r1 = -1
                int r0 = r0 + r1
            L4:
                if (r0 < 0) goto L10
                int[] r2 = r3.f1782g
                r2 = r2[r0]
                if (r2 != r1) goto Ld
                return r0
            Ld:
                int r0 = r0 + (-1)
                goto L4
            L10:
                java.lang.String r0 = "invalid pattern capture"
                luaj.LuaValue.R0(r0)
                r0 = 0
                return r0
        }

        private int d(int r4) {
                r3 = this;
                int r0 = r4 + (-49)
                if (r0 < 0) goto Lf
                int r1 = r3.f1780e
                if (r0 >= r1) goto Lf
                int[] r1 = r3.f1782g
                r1 = r1[r0]
                r2 = -1
                if (r1 != r2) goto L25
            Lf:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "invalid capture index %"
                r1.append(r2)
                int r4 = r4 + (-48)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                luaj.LuaValue.R0(r4)
            L25:
                return r0
        }

        static boolean i(int r5, int r6) {
                char r0 = (char) r6
                char r0 = java.lang.Character.toLowerCase(r0)
                byte[] r1 = luaj.lib.StringLib.U
                r1 = r1[r5]
                r2 = 97
                r3 = 0
                r4 = 1
                if (r0 == r2) goto L6e
                r2 = 103(0x67, float:1.44E-43)
                if (r0 == r2) goto L69
                r2 = 108(0x6c, float:1.51E-43)
                if (r0 == r2) goto L64
                r2 = 112(0x70, float:1.57E-43)
                if (r0 == r2) goto L5f
                r2 = 115(0x73, float:1.61E-43)
                if (r0 == r2) goto L5a
                r2 = 117(0x75, float:1.64E-43)
                if (r0 == r2) goto L55
                r2 = 122(0x7a, float:1.71E-43)
                if (r0 == r2) goto L52
                r2 = 99
                if (r0 == r2) goto L4d
                r2 = 100
                if (r0 == r2) goto L48
                r2 = 119(0x77, float:1.67E-43)
                if (r0 == r2) goto L43
                r2 = 120(0x78, float:1.68E-43)
                if (r0 == r2) goto L3b
                if (r6 != r5) goto L3a
                r3 = 1
            L3a:
                return r3
            L3b:
                r5 = r1 & (-128(0xffffffffffffff80, float:NaN))
                if (r5 == 0) goto L41
            L3f:
                r5 = 1
                goto L73
            L41:
                r5 = 0
                goto L73
            L43:
                r5 = r1 & 9
                if (r5 == 0) goto L41
                goto L3f
            L48:
                r5 = r1 & 8
                if (r5 == 0) goto L41
                goto L3f
            L4d:
                r5 = r1 & 64
                if (r5 == 0) goto L41
                goto L3f
            L52:
                if (r5 != 0) goto L41
                goto L3f
            L55:
                r5 = r1 & 4
                if (r5 == 0) goto L41
                goto L3f
            L5a:
                r5 = r1 & 32
                if (r5 == 0) goto L41
                goto L3f
            L5f:
                r5 = r1 & 16
                if (r5 == 0) goto L41
                goto L3f
            L64:
                r5 = r1 & 2
                if (r5 == 0) goto L41
                goto L3f
            L69:
                r5 = r1 & 25
                if (r5 == 0) goto L41
                goto L3f
            L6e:
                r5 = r1 & 1
                if (r5 == 0) goto L41
                goto L3f
            L73:
                if (r0 != r6) goto L77
                r3 = r5
                goto L7a
            L77:
                if (r5 != 0) goto L7a
                r3 = 1
            L7a:
                return r3
        }

        private luaj.LuaValue o(int r2, int r3, int r4) {
                r1 = this;
                int r0 = r1.f1780e
                if (r2 < r0) goto L25
                if (r2 != 0) goto Ld
                luaj.LuaString r2 = r1.f1777b
                luaj.LuaString r2 = r2.j3(r3, r4)
                return r2
            Ld:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "invalid capture index %"
                r3.append(r4)
                int r2 = r2 + 1
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                luaj.LuaValue r2 = luaj.LuaValue.R0(r2)
                return r2
            L25:
                int[] r3 = r1.f1782g
                r3 = r3[r2]
                r4 = -1
                if (r3 != r4) goto L33
                java.lang.String r2 = "unfinished capture"
                luaj.LuaValue r2 = luaj.LuaValue.R0(r2)
                return r2
            L33:
                r4 = -2
                if (r3 != r4) goto L42
                int[] r3 = r1.f1781f
                r2 = r3[r2]
                int r2 = r2 + 1
                long r2 = (long) r2
                luaj.LuaLong r2 = luaj.LuaValue.I2(r2)
                return r2
            L42:
                int[] r4 = r1.f1781f
                r2 = r4[r2]
                luaj.LuaString r4 = r1.f1777b
                int r3 = r3 + r2
                luaj.LuaString r2 = r4.j3(r2, r3)
                return r2
        }

        public void b(f.a r3, int r4, int r5, luaj.LuaValue r6) {
                r2 = this;
                int r0 = r6.C2()
                r1 = 3
                if (r0 == r1) goto L65
                r1 = 4
                if (r0 == r1) goto L65
                r1 = 5
                if (r0 == r1) goto L24
                r1 = 6
                if (r0 == r1) goto L16
                java.lang.String r3 = "bad argument: string/function/table expected"
                luaj.LuaValue.R0(r3)
                return
            L16:
                r0 = 1
                luaj.Varargs r0 = r2.n(r0, r4, r5)
                luaj.Varargs r6 = r6.invoke(r0)
                luaj.LuaValue r6 = r6.w()
                goto L2d
            L24:
                r0 = 0
                luaj.LuaValue r0 = r2.o(r0, r4, r5)
                luaj.LuaValue r6 = r6.U0(r0)
            L2d:
                boolean r0 = r6.w2()
                if (r0 != 0) goto L3a
                luaj.LuaString r6 = r2.f1777b
                luaj.LuaString r6 = r6.j3(r4, r5)
                goto L5d
            L3a:
                boolean r4 = r6.n1()
                if (r4 != 0) goto L5d
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "invalid replacement value (a "
                r4.append(r5)
                java.lang.String r5 = r6.D2()
                r4.append(r5)
                r5 = 41
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                luaj.LuaValue.R0(r4)
            L5d:
                luaj.LuaString r4 = r6.q2()
                r3.c(r4)
                return
            L65:
                luaj.LuaString r6 = r6.q2()
                r2.a(r3, r6, r4, r5)
                return
        }

        int e(int r5) {
                r4 = this;
                luaj.LuaString r0 = r4.f1778c
                int r1 = r5 + 1
                int r0 = r0.g3(r5)
                r2 = 37
                if (r0 == r2) goto L5d
                r3 = 91
                if (r0 == r3) goto L11
                return r1
            L11:
                luaj.LuaString r0 = r4.f1778c
                int r0 = r0.s1()
                if (r1 == r0) goto L25
                luaj.LuaString r0 = r4.f1778c
                int r0 = r0.g3(r1)
                r3 = 94
                if (r0 != r3) goto L25
                int r1 = r5 + 2
            L25:
                luaj.LuaString r5 = r4.f1778c
                int r5 = r5.s1()
                if (r1 != r5) goto L32
                java.lang.String r5 = "malformed pattern (missing ']')"
                luaj.LuaValue.R0(r5)
            L32:
                luaj.LuaString r5 = r4.f1778c
                int r0 = r1 + 1
                int r5 = r5.g3(r1)
                if (r5 != r2) goto L47
                luaj.LuaString r5 = r4.f1778c
                int r5 = r5.s1()
                if (r0 >= r5) goto L47
                int r1 = r1 + 2
                goto L48
            L47:
                r1 = r0
            L48:
                luaj.LuaString r5 = r4.f1778c
                int r5 = r5.s1()
                if (r1 == r5) goto L25
                luaj.LuaString r5 = r4.f1778c
                int r5 = r5.g3(r1)
                r0 = 93
                if (r5 != r0) goto L25
                int r1 = r1 + 1
                return r1
            L5d:
                luaj.LuaString r0 = r4.f1778c
                int r0 = r0.s1()
                if (r1 != r0) goto L6a
                java.lang.String r0 = "malformed pattern (ends with '%')"
                luaj.LuaValue.R0(r0)
            L6a:
                int r5 = r5 + 2
                return r5
        }

        int f(int r4, int r5) {
                r3 = this;
                int r0 = r3.c()
                int[] r1 = r3.f1782g
                int[] r2 = r3.f1781f
                r2 = r2[r0]
                int r2 = r4 - r2
                r1[r0] = r2
                int r4 = r3.g(r4, r5)
                r5 = -1
                if (r4 != r5) goto L19
                int[] r1 = r3.f1782g
                r1[r0] = r5
            L19:
                return r4
        }

        int g(int r7, int r8) {
                r6 = this;
                int r0 = r6.f1776a
                int r1 = r0 + (-1)
                r6.f1776a = r1
                if (r0 != 0) goto Ld
                java.lang.String r0 = "pattern too complex"
                luaj.LuaValue.R0(r0)
            Ld:
                r0 = 1
                luaj.LuaString r1 = r6.f1778c     // Catch: java.lang.Throwable -> L3c
                int r1 = r1.s1()     // Catch: java.lang.Throwable -> L3c
                if (r8 != r1) goto L1c
            L16:
                int r8 = r6.f1776a
                int r8 = r8 + r0
                r6.f1776a = r8
                return r7
            L1c:
                luaj.LuaString r1 = r6.f1778c     // Catch: java.lang.Throwable -> L3c
                int r1 = r1.g3(r8)     // Catch: java.lang.Throwable -> L3c
                r2 = 36
                r3 = 0
                r4 = -1
                if (r1 == r2) goto Lf3
                r2 = 37
                if (r1 == r2) goto L5e
                r2 = 40
                r5 = 41
                if (r1 == r2) goto L3f
                if (r1 == r5) goto L36
                goto L10a
            L36:
                int r8 = r8 + r0
                int r7 = r6.f(r7, r8)     // Catch: java.lang.Throwable -> L3c
                goto L16
            L3c:
                r7 = move-exception
                goto L175
            L3f:
                int r1 = r8 + 1
                luaj.LuaString r2 = r6.f1778c     // Catch: java.lang.Throwable -> L3c
                int r2 = r2.s1()     // Catch: java.lang.Throwable -> L3c
                if (r1 >= r2) goto L59
                luaj.LuaString r2 = r6.f1778c     // Catch: java.lang.Throwable -> L3c
                int r2 = r2.g3(r1)     // Catch: java.lang.Throwable -> L3c
                if (r2 != r5) goto L59
                int r8 = r8 + 2
                r1 = -2
                int r7 = r6.r(r7, r8, r1)     // Catch: java.lang.Throwable -> L3c
                goto L16
            L59:
                int r7 = r6.r(r7, r1, r4)     // Catch: java.lang.Throwable -> L3c
                goto L16
            L5e:
                int r1 = r8 + 1
                luaj.LuaString r2 = r6.f1778c     // Catch: java.lang.Throwable -> L3c
                int r2 = r2.s1()     // Catch: java.lang.Throwable -> L3c
                if (r1 != r2) goto L6d
                java.lang.String r2 = "malformed pattern (ends with '%')"
                luaj.LuaValue.R0(r2)     // Catch: java.lang.Throwable -> L3c
            L6d:
                luaj.LuaString r2 = r6.f1778c     // Catch: java.lang.Throwable -> L3c
                int r2 = r2.g3(r1)     // Catch: java.lang.Throwable -> L3c
                r5 = 98
                if (r2 == r5) goto Le6
                r5 = 102(0x66, float:1.43E-43)
                if (r2 == r5) goto L9c
                luaj.LuaString r2 = r6.f1778c     // Catch: java.lang.Throwable -> L3c
                int r1 = r2.g3(r1)     // Catch: java.lang.Throwable -> L3c
                char r2 = (char) r1     // Catch: java.lang.Throwable -> L3c
                boolean r2 = java.lang.Character.isDigit(r2)     // Catch: java.lang.Throwable -> L3c
                if (r2 == 0) goto Lf3
                int r7 = r6.h(r7, r1)     // Catch: java.lang.Throwable -> L3c
                if (r7 != r4) goto L94
            L8e:
                int r7 = r6.f1776a
                int r7 = r7 + r0
                r6.f1776a = r7
                return r4
            L94:
                int r8 = r8 + 2
                int r7 = r6.g(r7, r8)     // Catch: java.lang.Throwable -> L3c
                goto L16
            L9c:
                int r8 = r8 + 2
                luaj.LuaString r1 = r6.f1778c     // Catch: java.lang.Throwable -> L3c
                int r1 = r1.s1()     // Catch: java.lang.Throwable -> L3c
                if (r8 == r1) goto Lb0
                luaj.LuaString r1 = r6.f1778c     // Catch: java.lang.Throwable -> L3c
                int r1 = r1.g3(r8)     // Catch: java.lang.Throwable -> L3c
                r2 = 91
                if (r1 == r2) goto Lb5
            Lb0:
                java.lang.String r1 = "missing '[' after '%f' in pattern"
                luaj.LuaValue.R0(r1)     // Catch: java.lang.Throwable -> L3c
            Lb5:
                int r1 = r6.e(r8)     // Catch: java.lang.Throwable -> L3c
                if (r7 != 0) goto Lbd
                r2 = 0
                goto Lc5
            Lbd:
                luaj.LuaString r2 = r6.f1777b     // Catch: java.lang.Throwable -> L3c
                int r5 = r7 + (-1)
                int r2 = r2.g3(r5)     // Catch: java.lang.Throwable -> L3c
            Lc5:
                luaj.LuaString r5 = r6.f1777b     // Catch: java.lang.Throwable -> L3c
                int r5 = r5.s1()     // Catch: java.lang.Throwable -> L3c
                if (r7 != r5) goto Lce
                goto Ld4
            Lce:
                luaj.LuaString r3 = r6.f1777b     // Catch: java.lang.Throwable -> L3c
                int r3 = r3.g3(r7)     // Catch: java.lang.Throwable -> L3c
            Ld4:
                int r5 = r1 + (-1)
                boolean r2 = r6.k(r2, r8, r5)     // Catch: java.lang.Throwable -> L3c
                if (r2 != 0) goto L8e
                boolean r8 = r6.k(r3, r8, r5)     // Catch: java.lang.Throwable -> L3c
                if (r8 != 0) goto Le3
                goto L8e
            Le3:
                r8 = r1
                goto Ld
            Le6:
                int r1 = r8 + 2
                int r7 = r6.j(r7, r1)     // Catch: java.lang.Throwable -> L3c
                if (r7 != r4) goto Lef
                goto L8e
            Lef:
                int r8 = r8 + 4
                goto Ld
            Lf3:
                int r1 = r8 + 1
                luaj.LuaString r2 = r6.f1778c     // Catch: java.lang.Throwable -> L3c
                int r2 = r2.s1()     // Catch: java.lang.Throwable -> L3c
                if (r1 != r2) goto L10a
                luaj.LuaString r8 = r6.f1777b     // Catch: java.lang.Throwable -> L3c
                int r8 = r8.s1()     // Catch: java.lang.Throwable -> L3c
                if (r7 != r8) goto L107
                goto L16
            L107:
                r7 = -1
                goto L16
            L10a:
                int r1 = r6.e(r8)     // Catch: java.lang.Throwable -> L3c
                luaj.LuaString r2 = r6.f1777b     // Catch: java.lang.Throwable -> L3c
                int r2 = r2.s1()     // Catch: java.lang.Throwable -> L3c
                if (r7 >= r2) goto L124
                luaj.LuaString r2 = r6.f1777b     // Catch: java.lang.Throwable -> L3c
                int r2 = r2.g3(r7)     // Catch: java.lang.Throwable -> L3c
                boolean r2 = r6.q(r2, r8, r1)     // Catch: java.lang.Throwable -> L3c
                if (r2 == 0) goto L124
                r2 = 1
                goto L125
            L124:
                r2 = 0
            L125:
                luaj.LuaString r5 = r6.f1778c     // Catch: java.lang.Throwable -> L3c
                int r5 = r5.s1()     // Catch: java.lang.Throwable -> L3c
                if (r1 >= r5) goto L133
                luaj.LuaString r3 = r6.f1778c     // Catch: java.lang.Throwable -> L3c
                int r3 = r3.g3(r1)     // Catch: java.lang.Throwable -> L3c
            L133:
                r5 = 42
                if (r3 == r5) goto L16f
                r5 = 43
                if (r3 == r5) goto L166
                r5 = 45
                if (r3 == r5) goto L160
                r8 = 63
                if (r3 == r8) goto L14a
                if (r2 != 0) goto L147
                goto L8e
            L147:
                int r7 = r7 + 1
                goto Le3
            L14a:
                if (r2 == 0) goto L15c
                int r8 = r7 + 1
                int r2 = r1 + 1
                int r8 = r6.g(r8, r2)     // Catch: java.lang.Throwable -> L3c
                if (r8 == r4) goto L15c
                int r7 = r6.f1776a
                int r7 = r7 + r0
                r6.f1776a = r7
                return r8
            L15c:
                int r8 = r1 + 1
                goto Ld
            L160:
                int r7 = r6.m(r7, r8, r1)     // Catch: java.lang.Throwable -> L3c
                goto L16
            L166:
                if (r2 == 0) goto L8e
                int r7 = r7 + r0
                int r4 = r6.l(r7, r8, r1)     // Catch: java.lang.Throwable -> L3c
                goto L8e
            L16f:
                int r7 = r6.l(r7, r8, r1)     // Catch: java.lang.Throwable -> L3c
                goto L16
            L175:
                int r8 = r6.f1776a
                int r8 = r8 + r0
                r6.f1776a = r8
                throw r7
        }

        int h(int r4, int r5) {
                r3 = this;
                int r5 = r3.d(r5)
                int[] r0 = r3.f1782g
                r0 = r0[r5]
                luaj.LuaString r1 = r3.f1777b
                int r1 = r1.s1()
                int r1 = r1 - r4
                if (r1 < r0) goto L1f
                luaj.LuaString r1 = r3.f1777b
                int[] r2 = r3.f1781f
                r5 = r2[r5]
                boolean r5 = luaj.LuaString.W2(r1, r5, r1, r4, r0)
                if (r5 == 0) goto L1f
                int r4 = r4 + r0
                return r4
            L1f:
                r4 = -1
                return r4
        }

        int j(int r7, int r8) {
                r6 = this;
                luaj.LuaString r0 = r6.f1778c
                int r0 = r0.s1()
                if (r8 == r0) goto Lc
                int r1 = r8 + 1
                if (r1 != r0) goto L11
            Lc:
                java.lang.String r0 = "malformed pattern (missing arguments to '%b')"
                luaj.LuaValue.R0(r0)
            L11:
                luaj.LuaString r0 = r6.f1777b
                int r0 = r0.s1()
                r1 = -1
                if (r7 < r0) goto L1b
                return r1
            L1b:
                luaj.LuaString r2 = r6.f1778c
                int r2 = r2.g3(r8)
                luaj.LuaString r3 = r6.f1777b
                int r3 = r3.g3(r7)
                if (r3 == r2) goto L2a
                return r1
            L2a:
                luaj.LuaString r3 = r6.f1778c
                r4 = 1
                int r8 = r8 + r4
                int r8 = r3.g3(r8)
            L32:
                int r3 = r7 + 1
                if (r3 >= r0) goto L52
                luaj.LuaString r5 = r6.f1777b
                int r5 = r5.g3(r3)
                if (r5 != r8) goto L47
                int r4 = r4 + (-1)
                if (r4 != 0) goto L45
                int r7 = r7 + 2
                return r7
            L45:
                r7 = r3
                goto L32
            L47:
                luaj.LuaString r7 = r6.f1777b
                int r7 = r7.g3(r3)
                if (r7 != r2) goto L45
                int r4 = r4 + 1
                goto L45
            L52:
                return r1
        }

        boolean k(int r6, int r7, int r8) {
                r5 = this;
                luaj.LuaString r0 = r5.f1778c
                int r1 = r7 + 1
                int r0 = r0.g3(r1)
                r2 = 94
                r3 = 1
                if (r0 != r2) goto L11
                r7 = 0
                r7 = r1
                r0 = 0
                goto L12
            L11:
                r0 = 1
            L12:
                int r1 = r7 + 1
                if (r1 >= r8) goto L5f
                luaj.LuaString r2 = r5.f1778c
                int r2 = r2.g3(r1)
                r4 = 37
                if (r2 != r4) goto L2f
                int r7 = r7 + 2
                luaj.LuaString r1 = r5.f1778c
                int r1 = r1.g3(r7)
                boolean r1 = i(r6, r1)
                if (r1 == 0) goto L12
                return r0
            L2f:
                luaj.LuaString r2 = r5.f1778c
                int r4 = r7 + 2
                int r2 = r2.g3(r4)
                r4 = 45
                if (r2 != r4) goto L54
                int r2 = r7 + 3
                if (r2 >= r8) goto L54
                luaj.LuaString r1 = r5.f1778c
                int r7 = r7 + 1
                int r7 = r1.g3(r7)
                if (r7 > r6) goto L52
                luaj.LuaString r7 = r5.f1778c
                int r7 = r7.g3(r2)
                if (r6 > r7) goto L52
                return r0
            L52:
                r7 = r2
                goto L12
            L54:
                luaj.LuaString r7 = r5.f1778c
                int r7 = r7.g3(r1)
                if (r7 != r6) goto L5d
                return r0
            L5d:
                r7 = r1
                goto L12
            L5f:
                r6 = r0 ^ 1
                return r6
        }

        int l(int r4, int r5, int r6) {
                r3 = this;
                r0 = 0
            L1:
                int r1 = r4 + r0
                luaj.LuaString r2 = r3.f1777b
                int r2 = r2.s1()
                if (r1 >= r2) goto L1a
                luaj.LuaString r2 = r3.f1777b
                int r1 = r2.g3(r1)
                boolean r1 = r3.q(r1, r5, r6)
                if (r1 == 0) goto L1a
                int r0 = r0 + 1
                goto L1
            L1a:
                r5 = -1
                if (r0 < 0) goto L2b
                int r1 = r4 + r0
                int r2 = r6 + 1
                int r1 = r3.g(r1, r2)
                if (r1 == r5) goto L28
                return r1
            L28:
                int r0 = r0 + (-1)
                goto L1a
            L2b:
                return r5
        }

        int m(int r3, int r4, int r5) {
                r2 = this;
            L0:
                int r0 = r5 + 1
                int r0 = r2.g(r3, r0)
                r1 = -1
                if (r0 == r1) goto La
                return r0
            La:
                luaj.LuaString r0 = r2.f1777b
                int r0 = r0.s1()
                if (r3 >= r0) goto L21
                luaj.LuaString r0 = r2.f1777b
                int r0 = r0.g3(r3)
                boolean r0 = r2.q(r0, r4, r5)
                if (r0 == 0) goto L21
                int r3 = r3 + 1
                goto L0
            L21:
                return r1
        }

        luaj.Varargs n(boolean r4, int r5, int r6) {
                r3 = this;
                int r0 = r3.f1780e
                r1 = 1
                if (r0 != 0) goto L8
                if (r4 == 0) goto L8
                r0 = 1
            L8:
                if (r0 == 0) goto L24
                r4 = 0
                if (r0 == r1) goto L1f
                luaj.LuaValue[] r1 = new luaj.LuaValue[r0]
            Lf:
                if (r4 >= r0) goto L1a
                luaj.LuaValue r2 = r3.o(r4, r5, r6)
                r1[r4] = r2
                int r4 = r4 + 1
                goto Lf
            L1a:
                luaj.Varargs r4 = luaj.LuaValue.O2(r1)
                return r4
            L1f:
                luaj.LuaValue r4 = r3.o(r4, r5, r6)
                return r4
            L24:
                luaj.LuaValue r4 = luaj.LuaValue.f1674f
                return r4
        }

        void p() {
                r1 = this;
                r0 = 0
                r1.f1780e = r0
                r0 = 200(0xc8, float:2.8E-43)
                r1.f1776a = r0
                return
        }

        boolean q(int r4, int r5, int r6) {
                r3 = this;
                luaj.LuaString r0 = r3.f1778c
                int r0 = r0.g3(r5)
                r1 = 37
                r2 = 1
                if (r0 == r1) goto L25
                r1 = 46
                if (r0 == r1) goto L24
                r1 = 91
                if (r0 == r1) goto L1e
                luaj.LuaString r6 = r3.f1778c
                int r5 = r6.g3(r5)
                if (r5 != r4) goto L1c
                goto L1d
            L1c:
                r2 = 0
            L1d:
                return r2
            L1e:
                int r6 = r6 - r2
                boolean r4 = r3.k(r4, r5, r6)
                return r4
            L24:
                return r2
            L25:
                luaj.LuaString r6 = r3.f1778c
                int r5 = r5 + r2
                int r5 = r6.g3(r5)
                boolean r4 = i(r4, r5)
                return r4
        }

        int r(int r3, int r4, int r5) {
                r2 = this;
                int r0 = r2.f1780e
                r1 = 32
                if (r0 < r1) goto Lb
                java.lang.String r1 = "too many captures"
                luaj.LuaValue.R0(r1)
            Lb:
                int[] r1 = r2.f1781f
                r1[r0] = r3
                int[] r1 = r2.f1782g
                r1[r0] = r5
                int r0 = r0 + 1
                r2.f1780e = r0
                int r3 = r2.g(r3, r4)
                r4 = -1
                if (r3 != r4) goto L24
                int r4 = r2.f1780e
                int r4 = r4 + (-1)
                r2.f1780e = r4
            L24:
                return r3
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final byte f1783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f1784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final java.lang.String f1786d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1787e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        char f1788f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f1789g;
        int h;
        int i;
        final byte[] j;
        final java.nio.ByteBuffer k;

        public c(java.lang.String r3) {
                r2 = this;
                r2.<init>()
                r0 = 1
                r2.f1784b = r0
                r2.f1785c = r0
                r0 = 0
                r2.f1787e = r0
                r2.f1788f = r0
                r2.f1789g = r0
                r2.h = r0
                r2.i = r0
                r0 = 8
                byte[] r1 = new byte[r0]
                r2.j = r1
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
                r2.k = r1
                r2.f1786d = r3
                android.ext.MainService r3 = android.ext.MainService.instance
                android.ext.z1$d r3 = r3.v0
                if (r3 == 0) goto L2c
                boolean r3 = r3.n
                if (r3 == 0) goto L2c
                goto L2d
            L2c:
                r0 = 4
            L2d:
                r2.f1783a = r0
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "PackState [size_t="
                r0.append(r1)
                byte r1 = r2.f1783a
                r0.append(r1)
                java.lang.String r1 = ", islittle="
                r0.append(r1)
                boolean r1 = r2.f1784b
                r0.append(r1)
                java.lang.String r1 = ", maxalign="
                r0.append(r1)
                int r1 = r2.f1785c
                r0.append(r1)
                java.lang.String r1 = ", fmt="
                r0.append(r1)
                java.lang.String r1 = r2.f1786d
                r0.append(r1)
                java.lang.String r1 = ", pos="
                r0.append(r1)
                int r1 = r2.f1787e
                r0.append(r1)
                java.lang.String r1 = ", last="
                r0.append(r1)
                char r1 = r2.f1788f
                r0.append(r1)
                java.lang.String r1 = ", align="
                r0.append(r1)
                int r1 = r2.f1789g
                r0.append(r1)
                java.lang.String r1 = ", ntoalign="
                r0.append(r1)
                int r1 = r2.h
                r0.append(r1)
                java.lang.String r1 = ", size="
                r0.append(r1)
                int r1 = r2.i
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static final class dump extends luaj.lib.VarArgFunction {
        dump() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r6) {
                r5 = this;
                r0 = 1
                luaj.LuaFunction r0 = r6.C(r0)
                boolean r1 = r0 instanceof luaj.LuaClosure
                if (r1 == 0) goto L33
                java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
                r1.<init>()
                luaj.LuaClosure r0 = (luaj.LuaClosure) r0     // Catch: java.io.IOException -> L29
                luaj.h r0 = r0.R     // Catch: java.io.IOException -> L29
                r2 = 2
                r3 = 0
                boolean r2 = r6.V(r2, r3)     // Catch: java.io.IOException -> L29
                r4 = 3
                boolean r6 = r6.V(r4, r3)     // Catch: java.io.IOException -> L29
                g.b.a(r0, r1, r2, r6)     // Catch: java.io.IOException -> L29
                byte[] r6 = r1.toByteArray()     // Catch: java.io.IOException -> L29
                luaj.LuaString r6 = luaj.LuaString.o3(r6)     // Catch: java.io.IOException -> L29
                return r6
            L29:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()
                luaj.LuaValue r6 = luaj.LuaValue.R0(r6)
                return r6
            L33:
                luaj.d r6 = new luaj.d
                java.lang.String r0 = "unable to dump given function"
                r6.<init>(r0)
                throw r6
        }
    }

    static final class find extends luaj.lib.VarArgFunction {
        find() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r2) {
                r1 = this;
                r0 = 1
                luaj.Varargs r2 = luaj.lib.StringLib.d3(r2, r0)
                return r2
        }
    }

    static final class format extends luaj.lib.VarArgFunction {
        format() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r14) {
                r13 = this;
                r0 = 1
                luaj.LuaString r1 = r14.H(r0)
                int r2 = r1.s1()
                f.a r3 = new f.a
                r3.<init>(r2)
                r4 = 0
                r5 = 0
                r6 = 1
            L11:
                if (r5 >= r2) goto L113
                int r7 = r5 + 1
                int r8 = r1.g3(r5)
                r9 = 10
                if (r8 == r9) goto L110
                r9 = 37
                if (r8 == r9) goto L27
                byte r5 = (byte) r8
                r3.a(r5)
                goto L10d
            L27:
                if (r7 >= r2) goto L10d
                int r8 = r1.g3(r7)
                if (r8 != r9) goto L35
                int r5 = r5 + 2
                r3.a(r9)
                goto L11
            L35:
                int r6 = r6 + 1
                luaj.lib.StringLib$a r5 = new luaj.lib.StringLib$a
                r5.<init>(r14, r1, r7)
                int r8 = r5.i
                int r7 = r7 + r8
                int r8 = r5.h
                switch(r8) {
                    case 65: goto L106;
                    case 69: goto L106;
                    case 71: goto L106;
                    case 88: goto Lfe;
                    case 97: goto L106;
                    case 105: goto Lfe;
                    case 111: goto Lfe;
                    case 113: goto L92;
                    case 115: goto L6f;
                    case 117: goto Lfe;
                    case 120: goto Lfe;
                    default: goto L44;
                }
            L44:
                switch(r8) {
                    case 99: goto L65;
                    case 100: goto Lfe;
                    case 101: goto L106;
                    case 102: goto L106;
                    case 103: goto L106;
                    default: goto L47;
                }
            L47:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "invalid option '%"
                r8.append(r9)
                int r5 = r5.h
                char r5 = (char) r5
                r8.append(r5)
                java.lang.String r5 = "' to 'string.format'"
                r8.append(r5)
                java.lang.String r5 = r8.toString()
                luaj.LuaValue.R0(r5)
                goto L10d
            L65:
                int r8 = r14.D(r6)
                byte r8 = (byte) r8
                r5.a(r3, r8)
                goto L10d
            L6f:
                luaj.LuaValue r8 = r14.v(r6)
                luaj.LuaString r8 = luaj.lib.BaseLib.d3(r8)
                int r9 = r5.f1775g
                r10 = -1
                if (r9 != r10) goto L89
                int r9 = r8.s1()
                r10 = 100
                if (r9 < r10) goto L89
                r3.c(r8)
                goto L10d
            L89:
                luaj.LuaString r8 = r8.G0()
                r5.d(r3, r8)
                goto L10d
            L92:
                luaj.LuaValue r5 = r14.v(r6)
                int r8 = r5.C2()
                if (r8 == 0) goto Lf9
                if (r8 == r0) goto Lf9
                r9 = 3
                if (r8 == r9) goto Lc8
                r9 = 4
                if (r8 == r9) goto Lc0
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "'"
                r8.append(r9)
                r8.append(r5)
                java.lang.String r5 = "': value has no literal form"
                r8.append(r5)
                java.lang.String r5 = r8.toString()
                java.lang.String r8 = "string.format"
                luaj.LuaValue.l0(r6, r8, r5)
                goto L10d
            Lc0:
                luaj.LuaString r5 = r14.H(r6)
                luaj.lib.StringLib.X2(r3, r5)
                goto L10d
            Lc8:
                boolean r8 = r5 instanceof luaj.LuaDouble
                if (r8 == 0) goto Le1
                if (r4 != 0) goto Ld9
                luaj.lib.StringLib$a r4 = new luaj.lib.StringLib$a
                java.lang.String r8 = "%a"
                luaj.LuaString r8 = luaj.LuaString.K2(r8)
                r4.<init>(r14, r8, r0)
            Ld9:
                double r8 = r5.x0()
                r4.b(r3, r8)
                goto L10d
            Le1:
                boolean r8 = r5 instanceof luaj.LuaLong
                if (r8 == 0) goto Lf5
                long r8 = r5.z2()
                r10 = -9223372036854775808
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 != 0) goto Lf5
                java.lang.String r5 = "0x8000000000000000"
            Lf1:
                r3.b(r5)
                goto L10d
            Lf5:
                r3.d(r5)
                goto L10d
            Lf9:
                java.lang.String r5 = r5.g0()
                goto Lf1
            Lfe:
                long r8 = r14.F(r6)
                r5.c(r3, r8)
                goto L10d
            L106:
                double r8 = r14.B(r6)
                r5.b(r3, r8)
            L10d:
                r5 = r7
                goto L11
            L110:
                java.lang.String r5 = "\n"
                goto Lf1
            L113:
                luaj.LuaString r14 = r3.l()
                return r14
        }
    }

    static final class gmatch extends luaj.lib.VarArgFunction {
        gmatch() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r4) {
                r3 = this;
                r0 = 1
                luaj.LuaString r0 = r4.H(r0)
                r1 = 2
                luaj.LuaString r1 = r4.H(r1)
                luaj.lib.StringLib$GMatchAux r2 = new luaj.lib.StringLib$GMatchAux
                r2.<init>(r4, r0, r1)
                return r2
        }
    }

    static final class gsub extends luaj.lib.VarArgFunction {
        gsub() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r12) {
                r11 = this;
                r0 = 1
                luaj.LuaString r1 = r12.H(r0)
                int r2 = r1.s1()
                r3 = 2
                luaj.LuaString r3 = r12.H(r3)
                r4 = 3
                luaj.LuaValue r4 = r12.v(r4)
                int r5 = r2 + 1
                r6 = 4
                int r5 = r12.Y(r6, r5)
                int r6 = r3.s1()
                r7 = 0
                if (r6 <= 0) goto L2a
                int r6 = r3.T2(r7)
                r8 = 94
                if (r6 != r8) goto L2a
                goto L2b
            L2a:
                r0 = 0
            L2b:
                f.a r6 = new f.a
                r6.<init>(r2)
                luaj.lib.StringLib$b r8 = new luaj.lib.StringLib$b
                r8.<init>(r12, r1, r3)
                r12 = -1
                r3 = 0
                r9 = -1
            L38:
                if (r7 >= r5) goto L5c
                r8.p()
                int r10 = r8.g(r3, r0)
                if (r10 == r12) goto L4d
                if (r10 == r9) goto L4d
                int r7 = r7 + 1
                r8.b(r6, r3, r10, r4)
                r3 = r10
                r9 = r3
                goto L5a
            L4d:
                if (r3 >= r2) goto L5c
                int r10 = r3 + 1
                int r3 = r1.g3(r3)
                byte r3 = (byte) r3
                r6.a(r3)
                r3 = r10
            L5a:
                if (r0 == 0) goto L38
            L5c:
                luaj.LuaString r12 = r1.j3(r3, r2)
                r6.c(r12)
                luaj.LuaString r12 = r6.l()
                long r0 = (long) r7
                luaj.LuaLong r0 = luaj.LuaValue.I2(r0)
                luaj.Varargs r12 = luaj.LuaValue.N2(r12, r0)
                return r12
        }
    }

    static final class len extends luaj.lib.OneArgFunction {
        len() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r1) {
                r0 = this;
                luaj.LuaString r1 = r1.G0()
                luaj.LuaValue r1 = r1.r1()
                return r1
        }
    }

    static final class lower extends luaj.lib.OneArgFunction {
        lower() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r2) {
                r1 = this;
                java.lang.String r2 = r2.B0()
                java.util.Locale r0 = java.util.Locale.US
                java.lang.String r2 = r2.toLowerCase(r0)
                luaj.LuaString r2 = luaj.LuaValue.K2(r2)
                return r2
        }
    }

    static final class match extends luaj.lib.VarArgFunction {
        match() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r2) {
                r1 = this;
                r0 = 0
                luaj.Varargs r2 = luaj.lib.StringLib.d3(r2, r0)
                return r2
        }
    }

    static final class pack extends luaj.lib.VarArgFunction {
        pack() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r19) {
                r18 = this;
                r0 = r18
                r1 = r19
                r2 = 1
                java.lang.String r3 = r1.E(r2)
                luaj.lib.StringLib$c r4 = new luaj.lib.StringLib$c
                r4.<init>(r3)
                f.a r5 = new f.a
                r5.<init>()
                int r3 = r3.length()
                r6 = 0
                r7 = 0
                r8 = 1
            L1a:
                int r9 = r4.f1787e
                if (r9 >= r3) goto L161
                byte r9 = luaj.lib.StringLib.Y2(r4, r7)
                int r10 = r4.h
                int r11 = r4.i
                int r12 = r10 + r11
                int r7 = r7 + r12
                if (r10 <= 0) goto L30
                byte[] r12 = new byte[r10]
                r5.e(r12, r6, r10)
            L30:
                int r10 = r8 + 1
                r14 = 1
                r12 = 8
                switch(r9) {
                    case 0: goto L73;
                    case 1: goto L126;
                    case 2: goto L126;
                    case 3: goto L11a;
                    case 4: goto Ldf;
                    case 5: goto L9d;
                    case 6: goto L77;
                    case 7: goto L70;
                    case 8: goto L73;
                    case 9: goto L64;
                    case 10: goto L3d;
                    default: goto L39;
                }
            L39:
                r17 = r7
                goto L15b
            L3d:
                luaj.LuaNumber r8 = r1.G(r10)
                r4.i = r12
                boolean r9 = r8 instanceof luaj.LuaLong
                if (r9 == 0) goto L4f
                long r11 = r8.z2()
            L4b:
                luaj.lib.StringLib.b3(r4, r5, r11)
                goto L58
            L4f:
                double r11 = r8.x2()
                long r11 = java.lang.Double.doubleToRawLongBits(r11)
                goto L4b
            L58:
                r4.i = r2
                if (r9 == 0) goto L5e
                r12 = r14
                goto L60
            L5e:
                r12 = 0
            L60:
                luaj.lib.StringLib.b3(r4, r5, r12)
                goto L39
            L64:
                double r8 = r1.B(r10)
                long r8 = java.lang.Double.doubleToRawLongBits(r8)
            L6c:
                luaj.lib.StringLib.b3(r4, r5, r8)
                goto L39
            L70:
                r5.a(r6)
            L73:
                r17 = r7
                goto L15c
            L77:
                luaj.LuaString r8 = r1.H(r10)
                int r9 = r8.s1()
                java.lang.String r11 = r8.g0()
                int r11 = r11.indexOf(r6)
                r12 = -1
                if (r11 != r12) goto L8c
                r11 = 1
                goto L8d
            L8c:
                r11 = 0
            L8d:
                java.lang.String r12 = "string contains zeros"
                r0.x(r11, r10, r12)
                r5.c(r8)
                r5.a(r6)
                int r9 = r9 + r2
            L99:
                int r7 = r7 + r9
                r8 = r10
                goto L15e
            L9d:
                luaj.LuaString r8 = r1.H(r10)
                int r9 = r8.s1()
                byte r12 = r4.f1783a
                if (r11 >= r12) goto Lb5
                long r12 = (long) r9
                int r16 = r11 * 8
                long r14 = r14 << r16
                int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r16 >= 0) goto Lb3
                goto Lb5
            Lb3:
                r12 = 0
                goto Lb6
            Lb5:
                r12 = 1
            Lb6:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "string length ("
                r13.append(r14)
                r13.append(r9)
                java.lang.String r14 = ") does not fit in given size ("
                r13.append(r14)
                r13.append(r11)
                java.lang.String r11 = " bytes)"
                r13.append(r11)
                java.lang.String r11 = r13.toString()
                r0.x(r12, r10, r11)
                long r11 = (long) r9
                luaj.lib.StringLib.b3(r4, r5, r11)
                r5.c(r8)
                goto L99
            Ldf:
                luaj.LuaString r8 = r1.H(r10)
                int r9 = r8.s1()
                if (r9 > r11) goto Leb
                r12 = 1
                goto Lec
            Leb:
                r12 = 0
            Lec:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "string longer ("
                r13.append(r14)
                r13.append(r9)
                java.lang.String r14 = ") than given size ("
                r13.append(r14)
                r13.append(r11)
                java.lang.String r14 = ")"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r0.x(r12, r10, r13)
                r5.c(r8)
                int r11 = r11 - r9
                if (r11 <= 0) goto L39
                byte[] r8 = new byte[r11]
                r5.e(r8, r6, r11)
                goto L39
            L11a:
                double r8 = r1.B(r10)
                float r8 = (float) r8
                int r8 = java.lang.Float.floatToRawIntBits(r8)
                long r8 = (long) r8
                goto L6c
            L126:
                r17 = r7
                long r6 = r1.F(r10)
                if (r11 >= r12) goto L158
                int r11 = r11 * 8
                if (r9 != r2) goto L147
                int r11 = r11 - r2
                long r8 = r14 << r11
                long r11 = -r8
                int r14 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r14 > 0) goto L140
                int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r11 >= 0) goto L140
                r8 = 1
                goto L141
            L140:
                r8 = 0
            L141:
                java.lang.String r9 = "integer overflow"
            L143:
                r0.x(r8, r10, r9)
                goto L158
            L147:
                long r8 = r14 << r11
                long r8 = r8 - r14
                long r8 = ~r8
                long r8 = r8 & r6
                r11 = 0
                int r14 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                if (r14 != 0) goto L154
                r8 = 1
                goto L155
            L154:
                r8 = 0
            L155:
                java.lang.String r9 = "unsigned overflow"
                goto L143
            L158:
                luaj.lib.StringLib.b3(r4, r5, r6)
            L15b:
                r8 = r10
            L15c:
                r7 = r17
            L15e:
                r6 = 0
                goto L1a
            L161:
                luaj.LuaString r1 = r5.l()
                return r1
        }
    }

    static final class packsize extends luaj.lib.VarArgFunction {
        packsize() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r10) {
                r9 = this;
                r0 = 1
                java.lang.String r10 = r10.E(r0)
                luaj.lib.StringLib$c r1 = new luaj.lib.StringLib$c
                r1.<init>(r10)
                int r10 = r10.length()
                r2 = 0
                r3 = 0
            L10:
                int r4 = r1.f1787e
                if (r4 >= r10) goto L61
                byte r4 = luaj.lib.StringLib.Y2(r1, r3)
                int r5 = r1.i
                int r6 = r1.h
                int r5 = r5 + r6
                r6 = 2147483647(0x7fffffff, float:NaN)
                int r6 = r6 - r5
                if (r3 > r6) goto L25
                r6 = 1
                goto L26
            L25:
                r6 = 0
            L26:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "format result too large at pos "
                r7.append(r8)
                int r8 = r1.f1787e
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r9.x(r6, r0, r7)
                int r3 = r3 + r5
                r5 = 5
                if (r4 == r5) goto L44
                r5 = 6
                if (r4 == r5) goto L44
                goto L10
            L44:
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                char r5 = r1.f1788f
                java.lang.Character r5 = java.lang.Character.valueOf(r5)
                r4[r2] = r5
                int r5 = r1.f1787e
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r4[r0] = r5
                java.lang.String r5 = "variable-length format option '%c' at pos %d"
                java.lang.String r4 = android.ext.t2.f(r5, r4)
                luaj.LuaValue.k0(r0, r4)
                goto L10
            L61:
                long r0 = (long) r3
                luaj.LuaLong r10 = luaj.LuaValue.I2(r0)
                return r10
        }
    }

    static final class rep extends luaj.lib.VarArgFunction {
        rep() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r11) {
                r10 = this;
                r0 = 1
                luaj.LuaString r1 = r11.H(r0)
                r2 = 2
                int r2 = r11.D(r2)
                if (r2 > 0) goto Lf
                luaj.LuaString r11 = luaj.LuaValue.L
                return r11
            Lf:
                r3 = 3
                luaj.LuaString r4 = luaj.LuaValue.L
                luaj.LuaString r11 = r11.b0(r3, r4)
                int r3 = r1.s1()
                int r4 = r11.s1()
                int r5 = r3 + r4
                if (r5 < r3) goto L4d
                r6 = 2147483647(0x7fffffff, float:NaN)
                int r6 = r6 / r2
                if (r5 > r6) goto L4d
                int r6 = r2 + (-1)
                int r5 = r5 * r6
                int r5 = r5 + r3
                byte[] r5 = new byte[r5]
                byte[] r6 = r1.P
                int r1 = r1.Q
                byte[] r7 = r11.P
                int r11 = r11.Q
                r8 = 0
            L38:
                int r9 = r2 + (-1)
                java.lang.System.arraycopy(r6, r1, r5, r8, r3)
                if (r2 <= r0) goto L48
                int r8 = r8 + r3
                if (r4 <= 0) goto L46
                java.lang.System.arraycopy(r7, r11, r5, r8, r4)
                int r8 = r8 + r4
            L46:
                r2 = r9
                goto L38
            L48:
                luaj.LuaString r11 = luaj.LuaString.o3(r5)
                return r11
            L4d:
                luaj.d r11 = new luaj.d
                java.lang.String r0 = "resulting string too large"
                r11.<init>(r0)
                throw r11
        }
    }

    static final class reverse extends luaj.lib.OneArgFunction {
        reverse() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r7) {
                r6 = this;
                luaj.LuaString r7 = r7.G0()
                int r0 = r7.s1()
                if (r0 != 0) goto Ld
                luaj.LuaString r7 = luaj.LuaValue.L
                return r7
            Ld:
                byte[] r1 = new byte[r0]
                byte[] r2 = r7.P
                int r3 = r0 + (-1)
                int r7 = r7.Q
                int r0 = r0 + r7
            L16:
                if (r7 >= r0) goto L22
                int r4 = r3 + (-1)
                r5 = r2[r7]
                r1[r3] = r5
                int r7 = r7 + 1
                r3 = r4
                goto L16
            L22:
                luaj.LuaString r7 = luaj.LuaString.o3(r1)
                return r7
        }
    }

    static final class sub extends luaj.lib.VarArgFunction {
        sub() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r7) {
                r6 = this;
                r0 = 1
                luaj.LuaString r1 = r7.H(r0)
                int r2 = r1.s1()
                r3 = 2
                int r3 = r7.D(r3)
                int r3 = luaj.lib.StringLib.c3(r3, r2)
                r4 = 3
                r5 = -1
                int r7 = r7.Y(r4, r5)
                int r7 = luaj.lib.StringLib.c3(r7, r2)
                if (r3 >= r0) goto L1f
                r3 = 1
            L1f:
                if (r7 <= r2) goto L22
                goto L23
            L22:
                r2 = r7
            L23:
                if (r3 > r2) goto L2b
                int r3 = r3 - r0
                luaj.LuaString r7 = r1.j3(r3, r2)
                return r7
            L2b:
                luaj.LuaString r7 = luaj.LuaValue.L
                return r7
        }
    }

    static final class unpack extends luaj.lib.VarArgFunction {
        unpack() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r20) {
                r19 = this;
                r0 = r19
                r1 = r20
                r2 = 1
                java.lang.String r3 = r1.E(r2)
                r4 = 2
                luaj.LuaString r5 = r1.H(r4)
                int r6 = r5.s1()
                r7 = 3
                int r1 = r1.Y(r7, r2)
                int r1 = luaj.lib.StringLib.c3(r1, r6)
                int r8 = r1 + (-1)
                r9 = 0
                if (r8 < 0) goto L24
                if (r8 > r6) goto L24
                r10 = 1
                goto L25
            L24:
                r10 = 0
            L25:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "initial position ("
                r11.append(r12)
                r11.append(r1)
                java.lang.String r1 = ") out of string (length = "
                r11.append(r1)
                r11.append(r6)
                java.lang.String r1 = ")"
                r11.append(r1)
                java.lang.String r1 = r11.toString()
                r0.x(r10, r7, r1)
                luaj.lib.StringLib$c r1 = new luaj.lib.StringLib$c
                r1.<init>(r3)
                int r3 = r3.length()
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
            L54:
                int r11 = r1.f1787e
                if (r11 >= r3) goto L153
                byte r11 = luaj.lib.StringLib.Y2(r1, r8)
                int r12 = r1.h
                int r13 = r1.i
                int r8 = r8 + r12
                int r12 = r8 + r13
                if (r12 <= r6) goto L8d
                r14 = 4
                java.lang.Object[] r14 = new java.lang.Object[r14]
                java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
                r14[r9] = r15
                char r15 = r1.f1788f
                java.lang.Character r15 = java.lang.Character.valueOf(r15)
                r14[r2] = r15
                java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
                r14[r4] = r15
                int r15 = r1.f1787e
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                r14[r7] = r15
                java.lang.String r15 = "data string too short (%d) for option '%c' (need %d) at pos %d"
                java.lang.String r14 = android.ext.t2.f(r15, r14)
                luaj.LuaValue.k0(r4, r14)
            L8d:
                switch(r11) {
                    case 1: goto L13f;
                    case 2: goto L13f;
                    case 3: goto L130;
                    case 4: goto L12b;
                    case 5: goto Lee;
                    case 6: goto Lbf;
                    case 7: goto L90;
                    case 8: goto L90;
                    case 9: goto Lba;
                    case 10: goto L92;
                    default: goto L90;
                }
            L90:
                goto L14f
            L92:
                r11 = 8
                r1.i = r11
                long r11 = luaj.lib.StringLib.e3(r1, r5, r8, r9)
                r1.i = r2
                int r14 = r8 + 8
                long r14 = luaj.lib.StringLib.e3(r1, r5, r14, r9)
                r16 = 1
                int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r18 != 0) goto Lb1
                luaj.LuaLong r11 = luaj.LuaLong.I2(r11)
            Lac:
                r10.add(r11)
                goto L14f
            Lb1:
                double r11 = java.lang.Double.longBitsToDouble(r11)
                luaj.LuaNumber r11 = luaj.LuaDouble.J2(r11)
                goto Lac
            Lba:
                long r11 = luaj.lib.StringLib.e3(r1, r5, r8, r9)
                goto Lb1
            Lbf:
                int r11 = r5.c3(r9, r8)
                r12 = -1
                if (r11 == r12) goto Lc8
                r12 = 1
                goto Lc9
            Lc8:
                r12 = 0
            Lc9:
                java.lang.Object[] r14 = new java.lang.Object[r4]
                char r15 = r1.f1788f
                java.lang.Character r15 = java.lang.Character.valueOf(r15)
                r14[r9] = r15
                int r15 = r1.f1787e
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                r14[r2] = r15
                java.lang.String r15 = "zero char not found for option '%c' at pos %d"
                java.lang.String r14 = android.ext.t2.f(r15, r14)
                r0.x(r12, r4, r14)
                luaj.LuaString r8 = r5.j3(r8, r11)
                r10.add(r8)
                int r8 = r11 + 1
                goto L14f
            Lee:
                long r14 = luaj.lib.StringLib.e3(r1, r5, r8, r9)
                int r11 = (int) r14
                int r8 = r8 + r11
                int r14 = r8 + r13
                if (r14 > r6) goto Lfa
                r15 = 1
                goto Lfb
            Lfa:
                r15 = 0
            Lfb:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r2 = "data string too short ("
                r7.append(r2)
                r7.append(r6)
                java.lang.String r2 = " but need "
                r7.append(r2)
                r7.append(r14)
                java.lang.String r2 = ") at pos "
                r7.append(r2)
                int r2 = r1.f1787e
                r7.append(r2)
                java.lang.String r2 = r7.toString()
                r0.x(r15, r4, r2)
                int r11 = r11 + r12
                luaj.LuaString r2 = r5.j3(r12, r11)
            L126:
                r10.add(r2)
                r2 = 1
                goto L14f
            L12b:
                luaj.LuaString r2 = r5.j3(r8, r12)
                goto L126
            L130:
                long r11 = luaj.lib.StringLib.e3(r1, r5, r8, r9)
                int r2 = (int) r11
                float r2 = java.lang.Float.intBitsToFloat(r2)
                double r11 = (double) r2
                luaj.LuaNumber r2 = luaj.LuaDouble.J2(r11)
                goto L126
            L13f:
                if (r11 != r2) goto L143
                r7 = 1
                goto L144
            L143:
                r7 = 0
            L144:
                long r11 = luaj.lib.StringLib.e3(r1, r5, r8, r7)
                luaj.LuaLong r7 = luaj.LuaLong.I2(r11)
                r10.add(r7)
            L14f:
                int r8 = r8 + r13
                r7 = 3
                goto L54
            L153:
                int r8 = r8 + r2
                long r1 = (long) r8
                luaj.LuaLong r1 = luaj.LuaValue.I2(r1)
                r10.add(r1)
                int r1 = r10.size()
                luaj.LuaValue[] r1 = new luaj.LuaValue[r1]
                java.lang.Object[] r1 = r10.toArray(r1)
                luaj.LuaValue[] r1 = (luaj.LuaValue[]) r1
                luaj.Varargs r1 = luaj.LuaValue.O2(r1)
                return r1
        }
    }

    static final class upper extends luaj.lib.OneArgFunction {
        upper() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r2) {
                r1 = this;
                java.lang.String r2 = r2.B0()
                java.util.Locale r0 = java.util.Locale.US
                java.lang.String r2 = r2.toUpperCase(r0)
                luaj.LuaString r2 = luaj.LuaValue.K2(r2)
                return r2
        }
    }

    static {
            java.lang.String r0 = "^$*+?.([%-"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.lib.StringLib.T = r0
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]
            luaj.lib.StringLib.U = r0
            r0 = 0
            r1 = 0
        L10:
            r2 = 128(0x80, float:1.8E-43)
            r3 = 32
            if (r1 >= r2) goto L99
            char r2 = (char) r1
            byte[] r4 = luaj.lib.StringLib.U
            boolean r5 = java.lang.Character.isDigit(r2)
            if (r5 == 0) goto L22
            r5 = 8
            goto L23
        L22:
            r5 = 0
        L23:
            boolean r6 = java.lang.Character.isLowerCase(r2)
            if (r6 == 0) goto L2b
            r6 = 2
            goto L2c
        L2b:
            r6 = 0
        L2c:
            r5 = r5 | r6
            boolean r6 = java.lang.Character.isUpperCase(r2)
            if (r6 == 0) goto L35
            r6 = 4
            goto L36
        L35:
            r6 = 0
        L36:
            r5 = r5 | r6
            r6 = 64
            if (r2 < r3) goto L42
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 != r3) goto L40
            goto L42
        L40:
            r3 = 0
            goto L44
        L42:
            r3 = 64
        L44:
            r3 = r3 | r5
            byte r3 = (byte) r3
            r4[r1] = r3
            r5 = 97
            if (r2 < r5) goto L50
            r5 = 102(0x66, float:1.43E-43)
            if (r2 <= r5) goto L60
        L50:
            r5 = 65
            if (r2 < r5) goto L58
            r5 = 70
            if (r2 <= r5) goto L60
        L58:
            r5 = 48
            if (r2 < r5) goto L65
            r5 = 57
            if (r2 > r5) goto L65
        L60:
            r3 = r3 | (-128(0xffffffffffffff80, float:NaN))
            byte r3 = (byte) r3
            r4[r1] = r3
        L65:
            r3 = 33
            if (r2 < r3) goto L6d
            r3 = 47
            if (r2 <= r3) goto L83
        L6d:
            r3 = 58
            if (r2 < r3) goto L73
            if (r2 <= r6) goto L83
        L73:
            r3 = 91
            if (r2 < r3) goto L7b
            r3 = 96
            if (r2 <= r3) goto L83
        L7b:
            r3 = 123(0x7b, float:1.72E-43)
            if (r2 < r3) goto L8a
            r3 = 126(0x7e, float:1.77E-43)
            if (r2 > r3) goto L8a
        L83:
            r2 = r4[r1]
            r2 = r2 | 16
            byte r2 = (byte) r2
            r4[r1] = r2
        L8a:
            r2 = r4[r1]
            r3 = r2 & 6
            if (r3 == 0) goto L95
            r2 = r2 | 1
            byte r2 = (byte) r2
            r4[r1] = r2
        L95:
            int r1 = r1 + 1
            goto L10
        L99:
            byte[] r0 = luaj.lib.StringLib.U
            r0[r3] = r3
            r1 = 13
            r2 = r0[r1]
            r2 = r2 | r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r1 = 10
            r2 = r0[r1]
            r2 = r2 | r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r1 = 9
            r2 = r0[r1]
            r2 = r2 | r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r1 = 11
            r2 = r0[r1]
            r2 = r2 | r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r1 = 12
            r2 = r0[r1]
            r2 = r2 | r3
            byte r2 = (byte) r2
            r0[r1] = r2
            return
    }

    public StringLib() {
            r0 = this;
            r0.<init>()
            return
    }

    static void X2(f.a r7, luaj.LuaString r8) {
            r0 = 34
            r7.a(r0)
            int r1 = r8.s1()
            r2 = 0
        La:
            if (r2 >= r1) goto L5f
            int r3 = r8.g3(r2)
            r4 = 92
            r5 = 10
            if (r3 == r5) goto L58
            if (r3 == r0) goto L58
            if (r3 == r4) goto L58
            r5 = 31
            if (r3 <= r5) goto L28
            r5 = 127(0x7f, float:1.78E-43)
            if (r3 != r5) goto L23
            goto L28
        L23:
            byte r3 = (byte) r3
            r7.a(r3)
            goto L5c
        L28:
            r7.a(r4)
            int r4 = r2 + 1
            if (r4 == r1) goto L50
            int r5 = r8.g3(r4)
            r6 = 48
            if (r5 < r6) goto L50
            int r4 = r8.g3(r4)
            r5 = 57
            if (r4 <= r5) goto L40
            goto L50
        L40:
            r7.a(r6)
            int r4 = r3 / 10
            int r4 = r4 + r6
            char r4 = (char) r4
            byte r4 = (byte) r4
            r7.a(r4)
            int r3 = r3 % 10
            int r3 = r3 + r6
            char r3 = (char) r3
            goto L23
        L50:
            java.lang.String r3 = java.lang.Integer.toString(r3)
            r7.b(r3)
            goto L5c
        L58:
            r7.a(r4)
            goto L23
        L5c:
            int r2 = r2 + 1
            goto La
        L5f:
            r7.a(r0)
            return
    }

    static byte Y2(luaj.lib.StringLib.c r8, int r9) {
            byte r0 = a3(r8)
            int r1 = r8.f1789g
            r2 = 8
            r3 = 2
            r4 = 4
            r5 = 0
            r6 = 1
            if (r0 != r2) goto L55
            java.lang.String r2 = r8.f1786d
            int r2 = r2.length()
            int r7 = r8.f1787e
            if (r2 > r7) goto L2e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "no next option for option 'X' at pos "
            r2.append(r7)
            int r7 = r8.f1787e
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            luaj.LuaValue.k0(r6, r2)
        L2e:
            byte r2 = a3(r8)
            if (r2 == r4) goto L38
            int r1 = r8.f1789g
            if (r1 != 0) goto L53
        L38:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            char r7 = r8.f1788f
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            r2[r5] = r7
            int r7 = r8.f1787e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2[r6] = r7
            java.lang.String r7 = "invalid next option '%c' for option 'X' at pos %d"
            java.lang.String r2 = android.ext.t2.f(r7, r2)
            luaj.LuaValue.k0(r6, r2)
        L53:
            r8.i = r5
        L55:
            if (r1 <= r6) goto L89
            if (r0 != r4) goto L5a
            goto L89
        L5a:
            int r2 = r8.f1785c
            if (r1 <= r2) goto L61
            r8.f1789g = r2
            r1 = r2
        L61:
            int r2 = r1 + (-1)
            r4 = r1 & r2
            if (r4 == 0) goto L82
            java.lang.Object[] r3 = new java.lang.Object[r3]
            char r4 = r8.f1788f
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r3[r5] = r4
            int r4 = r8.f1787e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r6] = r4
            java.lang.String r4 = "format option '%c' asks for alignment not power of 2 at pos %d"
            java.lang.String r3 = android.ext.t2.f(r4, r3)
            luaj.LuaValue.k0(r6, r3)
        L82:
            r9 = r9 & r2
            int r1 = r1 - r9
            r9 = r1 & r2
            r8.h = r9
            goto L8b
        L89:
            r8.h = r5
        L8b:
            return r0
    }

    static int Z2(luaj.lib.StringLib.c r9, int r10, boolean r11) {
            java.lang.String r0 = r9.f1786d
            int r1 = r0.length()
            int r2 = r9.f1787e
            r3 = 1
            r4 = 0
            if (r2 >= r1) goto L2f
            char r5 = r0.charAt(r2)
            r6 = 57
            if (r5 > r6) goto L2f
            r7 = 48
            if (r5 < r7) goto L2f
            r10 = 0
        L19:
            int r10 = r10 * 10
            int r5 = r5 - r7
            int r10 = r10 + r5
            int r2 = r2 + r3
            if (r2 >= r1) goto L2d
            char r5 = r0.charAt(r2)
            if (r5 > r6) goto L2d
            if (r5 < r7) goto L2d
            r8 = 214748363(0xccccccb, float:3.1554432E-31)
            if (r10 <= r8) goto L19
        L2d:
            r9.f1787e = r2
        L2f:
            if (r11 == 0) goto L58
            r11 = 8
            if (r10 > r11) goto L37
            if (r10 > 0) goto L58
        L37:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r4] = r1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0[r3] = r11
            int r9 = r9.f1787e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11 = 2
            r0[r11] = r9
            java.lang.String r9 = "integral size (%d) out of limits [1,%d] at pos %d"
            java.lang.String r9 = android.ext.t2.f(r9, r0)
            luaj.LuaValue.R0(r9)
        L58:
            return r10
    }

    static byte a3(luaj.lib.StringLib.c r9) {
            java.lang.String r0 = r9.f1786d
            int r1 = r9.f1787e
            int r2 = r1 + 1
            r9.f1787e = r2
            char r0 = r0.charAt(r1)
            r9.f1788f = r0
            r1 = 9
            r2 = 2
            r3 = 8
            r4 = 4
            r5 = 99
            r6 = 1
            r7 = 0
            switch(r0) {
                case 32: goto L133;
                case 33: goto L11d;
                case 60: goto L11a;
                case 61: goto L11a;
                case 62: goto L117;
                case 66: goto L112;
                case 72: goto L109;
                case 73: goto Lf8;
                case 74: goto Lf0;
                case 76: goto Le8;
                case 84: goto Ld9;
                case 88: goto Ld0;
                case 98: goto Lcb;
                case 99: goto La1;
                case 100: goto L99;
                case 102: goto L90;
                case 104: goto L88;
                case 105: goto L77;
                case 106: goto L6f;
                case 108: goto L67;
                case 110: goto L5d;
                case 115: goto L49;
                case 120: goto L43;
                case 122: goto L39;
                default: goto L1b;
            }
        L1b:
            java.lang.String r1 = "invalid format option '%c' at pos %d"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L36
            java.lang.Character r8 = java.lang.Character.valueOf(r0)     // Catch: java.lang.Throwable -> L36
            r2[r7] = r8     // Catch: java.lang.Throwable -> L36
            int r8 = r9.f1787e     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L36
            r2[r6] = r8     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = android.ext.t2.f(r1, r2)     // Catch: java.lang.Throwable -> L36
            luaj.LuaValue.R0(r1)     // Catch: java.lang.Throwable -> L36
            goto L133
        L36:
            r1 = move-exception
            goto L126
        L39:
            r9.i = r7
            if (r0 != r5) goto L3e
            goto L3f
        L3e:
            r6 = 0
        L3f:
            r9.f1789g = r6
            r9 = 6
            return r9
        L43:
            r9.i = r6
            r9.f1789g = r6
            r9 = 7
            return r9
        L49:
            byte r1 = r9.f1783a     // Catch: java.lang.Throwable -> L36
            int r1 = Z2(r9, r1, r6)     // Catch: java.lang.Throwable -> L36
            r9.i = r1
            if (r0 != r5) goto L55
            r4 = 1
            goto L59
        L55:
            if (r1 < r3) goto L58
            goto L59
        L58:
            r4 = r1
        L59:
            r9.f1789g = r4
            r9 = 5
            return r9
        L5d:
            r9.i = r1
            if (r0 != r5) goto L62
            r4 = 1
        L62:
            r9.f1789g = r4
            r9 = 10
            return r9
        L67:
            r9.i = r3
            if (r0 != r5) goto L6c
            r4 = 1
        L6c:
            r9.f1789g = r4
            return r6
        L6f:
            r9.i = r3
            if (r0 != r5) goto L74
            r4 = 1
        L74:
            r9.f1789g = r4
            return r6
        L77:
            int r1 = Z2(r9, r4, r6)     // Catch: java.lang.Throwable -> L36
            r9.i = r1
            if (r0 != r5) goto L81
            r4 = 1
            goto L85
        L81:
            if (r1 < r3) goto L84
            goto L85
        L84:
            r4 = r1
        L85:
            r9.f1789g = r4
            return r6
        L88:
            r9.i = r2
            if (r0 != r5) goto L8d
            r2 = 1
        L8d:
            r9.f1789g = r2
            return r6
        L90:
            r9.i = r4
            if (r0 != r5) goto L95
            r4 = 1
        L95:
            r9.f1789g = r4
            r9 = 3
            return r9
        L99:
            r9.i = r3
            if (r0 != r5) goto L9e
            r4 = 1
        L9e:
            r9.f1789g = r4
            return r1
        La1:
            r1 = -1
            int r7 = Z2(r9, r1, r7)     // Catch: java.lang.Throwable -> L36
            if (r7 != r1) goto Lbe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r1.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "missing size for format option 'c' at pos "
            r1.append(r2)     // Catch: java.lang.Throwable -> L36
            int r2 = r9.f1787e     // Catch: java.lang.Throwable -> L36
            r1.append(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L36
            luaj.LuaValue.R0(r1)     // Catch: java.lang.Throwable -> L36
        Lbe:
            r9.i = r7
            if (r0 != r5) goto Lc3
            goto Lc8
        Lc3:
            if (r7 < r3) goto Lc7
            r6 = 4
            goto Lc8
        Lc7:
            r6 = r7
        Lc8:
            r9.f1789g = r6
            return r4
        Lcb:
            r9.i = r6
            r9.f1789g = r6
            return r6
        Ld0:
            r9.i = r7
            if (r0 != r5) goto Ld5
            goto Ld6
        Ld5:
            r6 = 0
        Ld6:
            r9.f1789g = r6
            return r3
        Ld9:
            byte r1 = r9.f1783a     // Catch: java.lang.Throwable -> L36
            r9.i = r1
            if (r0 != r5) goto Le1
            r4 = 1
            goto Le5
        Le1:
            if (r1 < r3) goto Le4
            goto Le5
        Le4:
            r4 = r1
        Le5:
            r9.f1789g = r4
            return r2
        Le8:
            r9.i = r3
            if (r0 != r5) goto Led
            r4 = 1
        Led:
            r9.f1789g = r4
            return r2
        Lf0:
            r9.i = r3
            if (r0 != r5) goto Lf5
            r4 = 1
        Lf5:
            r9.f1789g = r4
            return r2
        Lf8:
            int r1 = Z2(r9, r4, r6)     // Catch: java.lang.Throwable -> L36
            r9.i = r1
            if (r0 != r5) goto L102
            r4 = 1
            goto L106
        L102:
            if (r1 < r3) goto L105
            goto L106
        L105:
            r4 = r1
        L106:
            r9.f1789g = r4
            return r2
        L109:
            r9.i = r2
            if (r0 != r5) goto L10e
            goto L10f
        L10e:
            r6 = 2
        L10f:
            r9.f1789g = r6
            return r2
        L112:
            r9.i = r6
            r9.f1789g = r6
            return r2
        L117:
            r9.f1784b = r7     // Catch: java.lang.Throwable -> L36
            goto L133
        L11a:
            r9.f1784b = r6     // Catch: java.lang.Throwable -> L36
            goto L133
        L11d:
            byte r1 = r9.f1783a     // Catch: java.lang.Throwable -> L36
            int r1 = Z2(r9, r1, r6)     // Catch: java.lang.Throwable -> L36
            r9.f1785c = r1     // Catch: java.lang.Throwable -> L36
            goto L133
        L126:
            r9.i = r7
            if (r0 == r5) goto L12f
            if (r7 < r3) goto L12d
            goto L130
        L12d:
            r4 = r7
            goto L130
        L12f:
            r4 = 1
        L130:
            r9.f1789g = r4
            throw r1
        L133:
            r9.i = r7
            if (r0 != r5) goto L138
            goto L139
        L138:
            r6 = 0
        L139:
            r9.f1789g = r6
            return r7
    }

    static void b3(luaj.lib.StringLib.c r2, f.a r3, long r4) {
            java.nio.ByteBuffer r0 = r2.k
            boolean r1 = r2.f1784b
            if (r1 == 0) goto L9
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            goto Lb
        L9:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
        Lb:
            java.nio.ByteBuffer r0 = r0.order(r1)
            r1 = 0
            r0.putLong(r1, r4)
            byte[] r4 = r2.j
            boolean r5 = r2.f1784b
            if (r5 == 0) goto L1a
            goto L1e
        L1a:
            int r5 = r2.i
            int r1 = 8 - r5
        L1e:
            int r2 = r2.i
            r3.e(r4, r1, r2)
            return
    }

    static int c3(int r0, int r1) {
            if (r0 < 0) goto L3
            goto L6
        L3:
            int r1 = r1 + r0
            int r0 = r1 + 1
        L6:
            return r0
    }

    static luaj.Varargs d3(luaj.Varargs r8, boolean r9) {
            r0 = 1
            luaj.LuaString r1 = r8.H(r0)
            r2 = 2
            luaj.LuaString r2 = r8.H(r2)
            int r3 = r1.s1()
            r4 = 3
            int r4 = r8.Y(r4, r0)
            int r4 = c3(r4, r3)
            if (r4 >= r0) goto L1b
            r4 = 1
            goto L22
        L1b:
            int r5 = r3 + 1
            if (r4 <= r5) goto L22
            luaj.LuaValue r8 = luaj.LuaValue.f1671c
            return r8
        L22:
            r5 = -1
            int r4 = r4 + r5
            if (r9 == 0) goto L55
            r6 = 4
            luaj.LuaValue r6 = r8.v(r6)
            boolean r6 = r6.w2()
            if (r6 != 0) goto L39
            luaj.LuaString r6 = luaj.lib.StringLib.T
            int r6 = r2.e3(r6)
            if (r6 != r5) goto L55
        L39:
            int r8 = r1.d3(r2, r4)
            if (r8 == r5) goto L9c
            int r9 = r8 + 1
            long r0 = (long) r9
            luaj.LuaLong r9 = luaj.LuaValue.I2(r0)
            int r0 = r2.s1()
            int r8 = r8 + r0
            long r0 = (long) r8
            luaj.LuaLong r8 = luaj.LuaValue.I2(r0)
            luaj.Varargs r8 = luaj.LuaValue.N2(r9, r8)
            return r8
        L55:
            luaj.lib.StringLib$b r6 = new luaj.lib.StringLib$b
            r6.<init>(r8, r1, r2)
            int r8 = r2.s1()
            r1 = 0
            if (r8 <= 0) goto L6c
            int r8 = r2.g3(r1)
            r2 = 94
            if (r8 != r2) goto L6c
            r8 = 1
            r2 = 1
            goto L6e
        L6c:
            r8 = 0
            r2 = 0
        L6e:
            r6.p()
            int r7 = r6.g(r4, r2)
            if (r7 == r5) goto L93
            if (r9 == 0) goto L8e
            int r8 = r4 + 1
            long r8 = (long) r8
            luaj.LuaLong r8 = luaj.LuaValue.I2(r8)
            long r2 = (long) r7
            luaj.LuaLong r9 = luaj.LuaValue.I2(r2)
            luaj.Varargs r0 = r6.n(r1, r4, r7)
            luaj.Varargs r8 = luaj.LuaValue.M2(r8, r9, r0)
            return r8
        L8e:
            luaj.Varargs r8 = r6.n(r0, r4, r7)
            return r8
        L93:
            int r7 = r4 + 1
            if (r4 >= r3) goto L9c
            if (r8 == 0) goto L9a
            goto L9c
        L9a:
            r4 = r7
            goto L6e
        L9c:
            luaj.LuaValue r8 = luaj.LuaValue.f1671c
            return r8
    }

    static long e3(luaj.lib.StringLib.c r7, luaj.LuaString r8, int r9, boolean r10) {
            int r0 = r7.i
            r1 = 1
            if (r0 != r1) goto L13
            byte[] r7 = r8.P
            int r8 = r8.Q
            int r8 = r8 + r9
            r7 = r7[r8]
            long r7 = (long) r7
            if (r10 != 0) goto L53
            r9 = 255(0xff, double:1.26E-321)
            long r7 = r7 & r9
            goto L53
        L13:
            byte[] r2 = r7.j
            r3 = 0
            r4 = 8
            if (r0 >= r4) goto L30
            boolean r5 = r7.f1784b
            if (r5 == 0) goto L26
            int r5 = r0 + (-1)
        L20:
            int r5 = r5 + r1
            if (r5 >= r4) goto L30
            r2[r5] = r3
            goto L20
        L26:
            int r5 = 8 - r0
            r6 = r5
        L29:
            int r6 = r6 + (-1)
            if (r6 < 0) goto L31
            r2[r6] = r3
            goto L29
        L30:
            r5 = 0
        L31:
            r8.U2(r9, r2, r5, r0)
            java.nio.ByteBuffer r8 = r7.k
            boolean r7 = r7.f1784b
            if (r7 == 0) goto L3d
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN
            goto L3f
        L3d:
            java.nio.ByteOrder r7 = java.nio.ByteOrder.BIG_ENDIAN
        L3f:
            java.nio.ByteBuffer r7 = r8.order(r7)
            long r7 = r7.getLong(r3)
            if (r0 >= r4) goto L53
            if (r10 == 0) goto L53
            int r0 = r0 * 8
            int r0 = r0 - r1
            r9 = 1
            long r9 = r9 << r0
            long r7 = r7 ^ r9
            long r7 = r7 - r9
        L53:
            return r7
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r4, luaj.LuaValue r5) {
            r3 = this;
            luaj.LuaTable r4 = new luaj.LuaTable
            r4.<init>()
            luaj.lib.StringLib$_byte r0 = new luaj.lib.StringLib$_byte
            r0.<init>()
            java.lang.String r1 = "byte"
            r4.i2(r1, r0)
            luaj.lib.StringLib$_char r0 = new luaj.lib.StringLib$_char
            r0.<init>()
            java.lang.String r1 = "char"
            r4.i2(r1, r0)
            luaj.lib.StringLib$dump r0 = new luaj.lib.StringLib$dump
            r0.<init>()
            java.lang.String r1 = "dump"
            r4.i2(r1, r0)
            luaj.lib.StringLib$find r0 = new luaj.lib.StringLib$find
            r0.<init>()
            java.lang.String r1 = "find"
            r4.i2(r1, r0)
            luaj.lib.StringLib$format r0 = new luaj.lib.StringLib$format
            r0.<init>()
            java.lang.String r1 = "format"
            r4.i2(r1, r0)
            luaj.lib.StringLib$gmatch r0 = new luaj.lib.StringLib$gmatch
            r0.<init>()
            java.lang.String r1 = "gmatch"
            r4.i2(r1, r0)
            luaj.lib.StringLib$gsub r0 = new luaj.lib.StringLib$gsub
            r0.<init>()
            java.lang.String r1 = "gsub"
            r4.i2(r1, r0)
            luaj.lib.StringLib$len r0 = new luaj.lib.StringLib$len
            r0.<init>()
            java.lang.String r1 = "len"
            r4.i2(r1, r0)
            luaj.lib.StringLib$lower r0 = new luaj.lib.StringLib$lower
            r0.<init>()
            java.lang.String r1 = "lower"
            r4.i2(r1, r0)
            luaj.lib.StringLib$match r0 = new luaj.lib.StringLib$match
            r0.<init>()
            java.lang.String r1 = "match"
            r4.i2(r1, r0)
            luaj.lib.StringLib$pack r0 = new luaj.lib.StringLib$pack
            r0.<init>()
            java.lang.String r1 = "pack"
            r4.i2(r1, r0)
            luaj.lib.StringLib$packsize r0 = new luaj.lib.StringLib$packsize
            r0.<init>()
            java.lang.String r1 = "packsize"
            r4.i2(r1, r0)
            luaj.lib.StringLib$rep r0 = new luaj.lib.StringLib$rep
            r0.<init>()
            java.lang.String r1 = "rep"
            r4.i2(r1, r0)
            luaj.lib.StringLib$reverse r0 = new luaj.lib.StringLib$reverse
            r0.<init>()
            java.lang.String r1 = "reverse"
            r4.i2(r1, r0)
            luaj.lib.StringLib$sub r0 = new luaj.lib.StringLib$sub
            r0.<init>()
            java.lang.String r1 = "sub"
            r4.i2(r1, r0)
            luaj.lib.StringLib$unpack r0 = new luaj.lib.StringLib$unpack
            r0.<init>()
            java.lang.String r1 = "unpack"
            r4.i2(r1, r0)
            luaj.lib.StringLib$upper r0 = new luaj.lib.StringLib$upper
            r0.<init>()
            java.lang.String r1 = "upper"
            r4.i2(r1, r0)
            java.lang.String r0 = "string"
            r5.i2(r0, r4)
            java.lang.String r1 = "package"
            luaj.LuaValue r2 = r5.T0(r1)
            boolean r2 = r2.l1()
            if (r2 != 0) goto Lcd
            luaj.LuaValue r5 = r5.T0(r1)
            java.lang.String r1 = "loaded"
            luaj.LuaValue r5 = r5.T0(r1)
            r5.i2(r0, r4)
        Lcd:
            luaj.LuaValue r5 = luaj.LuaString.U
            if (r5 != 0) goto Le2
            r5 = 2
            luaj.LuaValue[] r5 = new luaj.LuaValue[r5]
            r0 = 0
            luaj.LuaString r1 = luaj.LuaValue.l
            r5[r0] = r1
            r0 = 1
            r5[r0] = r4
            luaj.LuaTable r5 = luaj.LuaValue.u2(r5)
            luaj.LuaString.U = r5
        Le2:
            return r4
    }
}
