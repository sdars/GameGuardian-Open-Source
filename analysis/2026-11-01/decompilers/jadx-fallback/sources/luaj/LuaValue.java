package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class LuaValue extends luaj.Varargs {
    public static final luaj.LuaString A = null;
    public static final luaj.LuaString B = null;
    public static final luaj.LuaString C = null;
    public static final luaj.LuaString D = null;
    public static final luaj.LuaString E = null;
    public static final luaj.LuaString F = null;
    public static final luaj.LuaString G = null;
    public static final luaj.LuaString H = null;
    public static final luaj.LuaString I = null;
    public static final luaj.LuaString J = null;
    public static final luaj.LuaString K = null;
    public static final luaj.LuaString L = null;
    public static final luaj.LuaString M = null;
    public static final luaj.LuaString N = null;
    public static final luaj.LuaValue[] O = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f1670b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final luaj.LuaValue f1671c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final luaj.LuaBoolean f1672d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final luaj.LuaBoolean f1673e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final luaj.LuaValue f1674f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final luaj.LuaNumber f1675g = null;
    public static final luaj.LuaNumber h = null;
    public static final luaj.LuaNumber i = null;
    public static final luaj.LuaValue[] j = null;
    public static final luaj.LuaString k = null;
    public static final luaj.LuaString l = null;
    public static final luaj.LuaString m = null;
    public static final luaj.LuaString n = null;
    public static final luaj.LuaString o = null;
    public static final luaj.LuaString p = null;
    public static final luaj.LuaString q = null;
    public static final luaj.LuaString r = null;
    public static final luaj.LuaString s = null;
    public static final luaj.LuaString t = null;
    public static final luaj.LuaString u = null;
    public static final luaj.LuaString v = null;
    public static final luaj.LuaString w = null;
    public static final luaj.LuaString x = null;
    public static final luaj.LuaString y = null;
    public static final luaj.LuaString z = null;

    private static final class None extends luaj.LuaNil {
        private None() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ None(luaj.LuaValue.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.Varargs
        void L(luaj.LuaValue[] r3, int r4, int r5) {
                r2 = this;
            L0:
                if (r5 <= 0) goto Lc
                int r0 = r4 + 1
                luaj.LuaValue r1 = luaj.LuaValue.f1671c
                r3[r4] = r1
                int r5 = r5 + (-1)
                r4 = r0
                goto L0
            Lc:
                return
        }

        @Override // luaj.LuaValue, luaj.Varargs
        public int U() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // luaj.LuaValue, luaj.Varargs
        public luaj.Varargs e0(int r2) {
                r1 = this;
                if (r2 <= 0) goto L4
                r2 = r1
                goto Lb
            L4:
                r2 = 1
                java.lang.String r0 = "start must be > 0"
                luaj.LuaValue r2 = luaj.LuaValue.k0(r2, r0)
            Lb:
                return r2
        }

        @Override // luaj.LuaNil, luaj.LuaValue, luaj.Varargs
        public java.lang.String g0() {
                r1 = this;
                java.lang.String r0 = "none"
                return r0
        }

        @Override // luaj.LuaValue, luaj.Varargs
        public luaj.LuaValue v(int r1) {
                r0 = this;
                luaj.LuaValue r1 = luaj.LuaValue.f1671c
                return r1
        }

        @Override // luaj.LuaValue, luaj.Varargs
        public luaj.LuaValue w() {
                r1 = this;
                luaj.LuaValue r0 = luaj.LuaValue.f1671c
                return r0
        }
    }

    static /* synthetic */ class a {
    }

    static {
            java.lang.String r0 = "nil"
            java.lang.String r1 = "boolean"
            java.lang.String r2 = "lightuserdata"
            java.lang.String r3 = "number"
            java.lang.String r4 = "string"
            java.lang.String r5 = "table"
            java.lang.String r6 = "function"
            java.lang.String r7 = "userdata"
            java.lang.String r8 = "thread"
            java.lang.String r9 = "value"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            luaj.LuaValue.f1670b = r0
            luaj.LuaNil r0 = new luaj.LuaNil
            r0.<init>()
            luaj.LuaValue.f1671c = r0
            luaj.LuaBoolean r0 = new luaj.LuaBoolean
            r1 = 1
            r0.<init>(r1)
            luaj.LuaValue.f1672d = r0
            luaj.LuaBoolean r0 = new luaj.LuaBoolean
            r1 = 0
            r0.<init>(r1)
            luaj.LuaValue.f1673e = r0
            luaj.LuaValue$None r0 = new luaj.LuaValue$None
            r2 = 0
            r0.<init>(r2)
            luaj.LuaValue.f1674f = r0
            r2 = 0
            luaj.LuaLong r0 = luaj.LuaLong.I2(r2)
            luaj.LuaValue.f1675g = r0
            r2 = 1
            luaj.LuaLong r0 = luaj.LuaLong.I2(r2)
            luaj.LuaValue.h = r0
            r2 = -1
            luaj.LuaLong r0 = luaj.LuaLong.I2(r2)
            luaj.LuaValue.i = r0
            luaj.LuaValue[] r0 = new luaj.LuaValue[r1]
            luaj.LuaValue.j = r0
            java.lang.String r0 = "_ENV"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.k = r0
            java.lang.String r0 = "__index"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.l = r0
            java.lang.String r0 = "__newindex"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.m = r0
            java.lang.String r0 = "__call"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.n = r0
            java.lang.String r0 = "__mode"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.o = r0
            java.lang.String r0 = "__metatable"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.p = r0
            java.lang.String r0 = "__add"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.q = r0
            java.lang.String r0 = "__sub"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.r = r0
            java.lang.String r0 = "__div"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.s = r0
            java.lang.String r0 = "__mul"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.t = r0
            java.lang.String r0 = "__pow"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.u = r0
            java.lang.String r0 = "__mod"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.v = r0
            java.lang.String r0 = "__unm"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.w = r0
            java.lang.String r0 = "__len"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.x = r0
            java.lang.String r0 = "__eq"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.y = r0
            java.lang.String r0 = "__lt"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.z = r0
            java.lang.String r0 = "__le"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.A = r0
            java.lang.String r0 = "__tostring"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.B = r0
            java.lang.String r0 = "__concat"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.C = r0
            java.lang.String r0 = "__idiv"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.D = r0
            java.lang.String r0 = "__bnot"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.E = r0
            java.lang.String r0 = "__band"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.F = r0
            java.lang.String r0 = "__bor"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.G = r0
            java.lang.String r0 = "__bxor"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.H = r0
            java.lang.String r0 = "__shl"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.I = r0
            java.lang.String r0 = "__shr"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.J = r0
            java.lang.String r0 = "__name"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.K = r0
            java.lang.String r0 = ""
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.L = r0
            java.lang.String r0 = "0"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.M = r0
            java.lang.String r0 = "1"
            luaj.LuaString r0 = luaj.LuaString.i3(r0)
            luaj.LuaValue.N = r0
            r0 = 250(0xfa, float:3.5E-43)
            luaj.LuaValue[] r2 = new luaj.LuaValue[r0]
            luaj.LuaValue.O = r2
        L14b:
            if (r1 >= r0) goto L156
            luaj.LuaValue[] r2 = luaj.LuaValue.O
            luaj.LuaValue r3 = luaj.LuaValue.f1671c
            r2[r1] = r3
            int r1 = r1 + 1
            goto L14b
        L156:
            return
    }

    public LuaValue() {
            r0 = this;
            r0.<init>()
            return
    }

    public static luaj.LuaNumber C1(java.lang.String r2) {
            int r0 = r2.length()
            r1 = 20
            if (r0 > r1) goto L2a
            r0 = 46
            int r0 = r2.indexOf(r0)
            r1 = -1
            if (r0 != r1) goto L2a
            r0 = 101(0x65, float:1.42E-43)
            int r0 = r2.indexOf(r0)
            if (r0 != r1) goto L2a
            r0 = 69
            int r0 = r2.indexOf(r0)
            if (r0 != r1) goto L2a
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L2a
            luaj.LuaLong r2 = luaj.LuaLong.I2(r0)     // Catch: java.lang.NumberFormatException -> L2a
            return r2
        L2a:
            double r0 = java.lang.Double.parseDouble(r2)
            luaj.LuaNumber r2 = luaj.LuaDouble.J2(r0)
            return r2
    }

    public static luaj.LuaBoolean H2(boolean r0) {
            if (r0 == 0) goto L5
            luaj.LuaBoolean r0 = luaj.LuaValue.f1672d
            goto L7
        L5:
            luaj.LuaBoolean r0 = luaj.LuaValue.f1673e
        L7:
            return r0
    }

    public static luaj.LuaLong I2(long r0) {
            luaj.LuaLong r0 = luaj.LuaLong.I2(r0)
            return r0
    }

    public static luaj.LuaNumber J2(double r0) {
            luaj.LuaNumber r0 = luaj.LuaDouble.J2(r0)
            return r0
    }

    public static luaj.LuaString K2(java.lang.String r0) {
            luaj.LuaString r0 = luaj.LuaString.K2(r0)
            return r0
    }

    public static luaj.LuaString L2(byte[] r0, int r1, int r2) {
            luaj.LuaString r0 = luaj.LuaString.L2(r0, r1, r2)
            return r0
    }

    public static luaj.Varargs M2(luaj.LuaValue r4, luaj.LuaValue r5, luaj.Varargs r6) {
            int r0 = r6.U()
            if (r0 == 0) goto L15
            luaj.Varargs$a r0 = new luaj.Varargs$a
            r1 = 2
            luaj.LuaValue[] r2 = new luaj.LuaValue[r1]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            r0.<init>(r2, r3, r1, r6)
            return r0
        L15:
            luaj.Varargs$c r6 = new luaj.Varargs$c
            r6.<init>(r4, r5)
            return r6
    }

    public static luaj.LuaValue N1(java.lang.CharSequence r25) {
            r0 = r25
            int r1 = r25.length()
            r3 = 0
        L7:
            if (r3 >= r1) goto L16
            char r4 = r0.charAt(r3)
            boolean r4 = g.g.P0(r4)
            if (r4 == 0) goto L16
            int r3 = r3 + 1
            goto L7
        L16:
            r4 = 43
            r5 = 45
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r3 >= r1) goto L2c
            char r8 = r0.charAt(r3)
            if (r8 == r5) goto L26
            if (r8 != r4) goto L2c
        L26:
            if (r8 != r5) goto L2a
            r6 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L2a:
            int r3 = r3 + 1
        L2c:
            int r8 = r3 + 2
            r9 = 0
            if (r8 < r1) goto L32
            return r9
        L32:
            int r8 = r3 + 1
            char r10 = r0.charAt(r3)
            r11 = 48
            if (r10 == r11) goto L3d
            return r9
        L3d:
            char r8 = r0.charAt(r8)
            r10 = 120(0x78, float:1.68E-43)
            if (r8 == r10) goto L4a
            r10 = 88
            if (r8 == r10) goto L4a
            return r9
        L4a:
            int r3 = r3 + 2
            r12 = 0
            r14 = 0
            r16 = r12
            r8 = 0
            r10 = 0
        L54:
            r18 = 4625196817309499392(0x4030000000000000, double:16.0)
            if (r3 >= r1) goto L87
            char r20 = r0.charAt(r3)
            boolean r21 = g.g.Q0(r20)
            if (r21 == 0) goto L87
            int r2 = g.g.H0(r20)
            if (r8 != 0) goto L6a
            if (r2 == 0) goto L7e
        L6a:
            r11 = 30
            if (r8 >= r11) goto L74
            double r16 = r16 * r18
            double r4 = (double) r2
            double r16 = r16 + r4
            goto L76
        L74:
            int r10 = r10 + 4
        L76:
            r4 = 16
            long r14 = r14 * r4
            long r4 = (long) r2
            long r14 = r14 + r4
            int r8 = r8 + 1
        L7e:
            int r3 = r3 + 1
            r4 = 43
            r5 = 45
            r11 = 48
            goto L54
        L87:
            r2 = 8388608(0x800000, float:1.1754944E-38)
            if (r3 >= r1) goto Lc7
            char r4 = r0.charAt(r3)
            r5 = 46
            if (r4 != r5) goto Lc7
            int r8 = r8 + r2
            int r3 = r3 + 1
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2147483647(0x7fffffff, float:NaN)
        L9c:
            if (r3 >= r1) goto Lc7
            char r22 = r0.charAt(r3)
            boolean r23 = g.g.Q0(r22)
            if (r23 == 0) goto Lc7
            if (r5 != r4) goto Lb0
            int r23 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r23 == 0) goto Lb0
            int r5 = r3 + 30
        Lb0:
            if (r3 >= r5) goto Lbf
            double r16 = r16 * r18
            int r4 = g.g.H0(r22)
            double r11 = (double) r4
            double r16 = r16 + r11
            int r10 = r10 + (-4)
            int r8 = r8 + 1
        Lbf:
            int r3 = r3 + 1
            r4 = 2147483647(0x7fffffff, float:NaN)
            r12 = 0
            goto L9c
        Lc7:
            r4 = 8388607(0x7fffff, float:1.1754942E-38)
            r4 = r4 & r8
            if (r4 != 0) goto Lce
            return r9
        Lce:
            if (r3 >= r1) goto L121
            char r4 = r0.charAt(r3)
            r5 = 112(0x70, float:1.57E-43)
            if (r4 == r5) goto Ldc
            r5 = 80
            if (r4 != r5) goto L121
        Ldc:
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            int r8 = r8 + r4
            int r4 = r3 + 1
            r5 = 1
            if (r4 >= r1) goto Lfd
            char r11 = r0.charAt(r4)
            r12 = 45
            if (r11 == r12) goto Lf0
            r13 = 43
            if (r11 != r13) goto Lfd
        Lf0:
            if (r11 != r12) goto Lf4
            r4 = 1
            goto Lf5
        Lf4:
            r4 = 0
        Lf5:
            int r3 = r3 + 2
            r24 = r4
            r4 = r3
            r3 = r24
            goto Lfe
        Lfd:
            r3 = 0
        Lfe:
            r11 = r4
            r4 = 0
            r21 = 0
        L102:
            if (r11 >= r1) goto L119
            char r12 = r0.charAt(r11)
            boolean r13 = g.g.O0(r12)
            if (r13 == 0) goto L119
            int r4 = r4 * 10
            int r4 = r4 + r12
            r12 = 48
            int r4 = r4 - r12
            int r11 = r11 + 1
            r21 = 1
            goto L102
        L119:
            if (r21 != 0) goto L11c
            return r9
        L11c:
            if (r3 == 0) goto L11f
            int r4 = -r4
        L11f:
            int r10 = r10 + r4
            r3 = r11
        L121:
            if (r3 >= r1) goto L130
            char r4 = r0.charAt(r3)
            boolean r4 = g.g.P0(r4)
            if (r4 == 0) goto L130
            int r3 = r3 + 1
            goto L121
        L130:
            if (r3 == r1) goto L133
            return r9
        L133:
            if (r8 >= r2) goto L142
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L13c
            goto L13d
        L13c:
            long r14 = -r14
        L13d:
            luaj.LuaLong r0 = luaj.LuaLong.I2(r14)
            goto L151
        L142:
            double r6 = r6 * r16
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = (double) r10
            double r0 = java.lang.Math.pow(r0, r2)
            double r6 = r6 * r0
            luaj.LuaNumber r0 = J2(r6)
        L151:
            return r0
    }

    public static luaj.Varargs N2(luaj.LuaValue r1, luaj.Varargs r2) {
            int r0 = r2.U()
            if (r0 == 0) goto Lc
            luaj.Varargs$c r0 = new luaj.Varargs$c
            r0.<init>(r1, r2)
            return r0
        Lc:
            return r1
    }

    public static luaj.LuaValue O1(java.lang.String r1) {
            r0 = 120(0x78, float:1.68E-43)
            int r0 = r1.indexOf(r0)
            if (r0 >= 0) goto L1a
            r0 = 88
            int r0 = r1.indexOf(r0)
            if (r0 < 0) goto L11
            goto L1a
        L11:
            java.lang.String r1 = r1.trim()
            luaj.LuaNumber r1 = C1(r1)
            return r1
        L1a:
            luaj.LuaValue r1 = N1(r1)
            return r1
    }

    public static luaj.Varargs O2(luaj.LuaValue[] r4) {
            int r0 = r4.length
            if (r0 == 0) goto L1f
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L1c
            r3 = 2
            if (r0 == r3) goto L12
            luaj.Varargs$b r0 = new luaj.Varargs$b
            luaj.LuaValue r1 = luaj.LuaValue.f1674f
            r0.<init>(r4, r1)
            return r0
        L12:
            luaj.Varargs$c r0 = new luaj.Varargs$c
            r1 = r4[r1]
            r4 = r4[r2]
            r0.<init>(r1, r4)
            return r0
        L1c:
            r4 = r4[r1]
            return r4
        L1f:
            luaj.LuaValue r4 = luaj.LuaValue.f1674f
            return r4
    }

    public static luaj.LuaValue P1(java.lang.String r0, luaj.LuaValue r1) {
            luaj.LuaValue r0 = O1(r0)     // Catch: java.lang.NumberFormatException -> L5
            goto L6
        L5:
            r0 = 0
        L6:
            if (r0 != 0) goto L9
            goto La
        L9:
            r1 = r0
        La:
            return r1
    }

    public static luaj.Varargs P2(luaj.LuaValue[] r2, int r3, int r4) {
            if (r4 == 0) goto L1e
            r0 = 1
            if (r4 == r0) goto L1b
            r1 = 2
            if (r4 == r1) goto L10
            luaj.Varargs$a r0 = new luaj.Varargs$a
            luaj.LuaValue r1 = luaj.LuaValue.f1674f
            r0.<init>(r2, r3, r4, r1)
            return r0
        L10:
            luaj.Varargs$c r4 = new luaj.Varargs$c
            r1 = r2[r3]
            int r3 = r3 + r0
            r2 = r2[r3]
            r4.<init>(r1, r2)
            return r4
        L1b:
            r2 = r2[r3]
            return r2
        L1e:
            luaj.LuaValue r2 = luaj.LuaValue.f1674f
            return r2
    }

    public static final boolean Q0(luaj.LuaValue r2, luaj.LuaValue r3) {
            luaj.LuaValue r0 = luaj.LuaValue.f1671c
            luaj.LuaValue r1 = r2.V0()
            if (r1 == 0) goto Le
            luaj.LuaString r0 = luaj.LuaValue.y
            luaj.LuaValue r0 = r1.V1(r0)
        Le:
            boolean r1 = r0.l1()
            if (r1 == 0) goto L20
            luaj.LuaValue r1 = r3.V0()
            if (r1 == 0) goto L20
            luaj.LuaString r0 = luaj.LuaValue.y
            luaj.LuaValue r0 = r1.V1(r0)
        L20:
            boolean r1 = r0.l1()
            if (r1 == 0) goto L28
            r2 = 0
            goto L30
        L28:
            luaj.LuaValue r2 = r0.call(r2, r3)
            boolean r2 = r2.w2()
        L30:
            return r2
    }

    public static luaj.Varargs Q2(luaj.LuaValue[] r2, int r3, int r4, luaj.Varargs r5) {
            if (r4 == 0) goto L37
            r0 = 1
            if (r4 == r0) goto L26
            r1 = 2
            if (r4 == r1) goto Le
            luaj.Varargs$a r0 = new luaj.Varargs$a
            r0.<init>(r2, r3, r4, r5)
            return r0
        Le:
            int r1 = r5.U()
            if (r1 <= 0) goto L1a
            luaj.Varargs$a r0 = new luaj.Varargs$a
            r0.<init>(r2, r3, r4, r5)
            goto L25
        L1a:
            luaj.Varargs$c r4 = new luaj.Varargs$c
            r5 = r2[r3]
            int r3 = r3 + r0
            r2 = r2[r3]
            r4.<init>(r5, r2)
            r0 = r4
        L25:
            return r0
        L26:
            int r4 = r5.U()
            if (r4 <= 0) goto L34
            luaj.Varargs$c r4 = new luaj.Varargs$c
            r2 = r2[r3]
            r4.<init>(r2, r5)
            goto L36
        L34:
            r4 = r2[r3]
        L36:
            return r4
        L37:
            return r5
    }

    public static luaj.LuaValue R0(java.lang.String r1) {
            luaj.d r0 = new luaj.d
            r0.<init>(r1)
            throw r0
    }

    public static luaj.Varargs R2(luaj.LuaValue[] r4, luaj.Varargs r5) {
            int r0 = r4.length
            if (r0 == 0) goto L37
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L26
            r3 = 2
            if (r0 == r3) goto L10
            luaj.Varargs$b r0 = new luaj.Varargs$b
            r0.<init>(r4, r5)
            return r0
        L10:
            int r0 = r5.U()
            if (r0 <= 0) goto L1c
            luaj.Varargs$b r0 = new luaj.Varargs$b
            r0.<init>(r4, r5)
            goto L25
        L1c:
            luaj.Varargs$c r0 = new luaj.Varargs$c
            r5 = r4[r2]
            r4 = r4[r1]
            r0.<init>(r5, r4)
        L25:
            return r0
        L26:
            int r0 = r5.U()
            if (r0 <= 0) goto L34
            luaj.Varargs$c r0 = new luaj.Varargs$c
            r4 = r4[r2]
            r0.<init>(r4, r5)
            goto L36
        L34:
            r0 = r4[r2]
        L36:
            return r0
        L37:
            return r5
    }

    public static luaj.LuaValue S0(java.lang.String r1, java.lang.Throwable r2) {
            luaj.d r0 = new luaj.d
            r0.<init>(r1, r2)
            throw r0
    }

    protected static luaj.LuaValue W0(luaj.LuaValue r4, luaj.LuaValue r5) {
            r0 = 0
        L1:
            boolean r1 = r4.o1()
            if (r1 == 0) goto L21
            luaj.LuaValue r1 = r4.V1(r5)
            boolean r2 = r1.l1()
            if (r2 == 0) goto L20
            luaj.LuaString r2 = luaj.LuaValue.l
            luaj.LuaValue r2 = r4.x1(r2)
            boolean r3 = r2.l1()
            if (r3 == 0) goto L1e
            goto L20
        L1e:
            r1 = r2
            goto L34
        L20:
            return r1
        L21:
            luaj.LuaString r1 = luaj.LuaValue.l
            luaj.LuaValue r1 = r4.x1(r1)
            boolean r2 = r1.l1()
            if (r2 == 0) goto L34
            java.lang.String r2 = r5.g0()
            r4.b1(r2)
        L34:
            boolean r2 = r1.g1()
            if (r2 == 0) goto L3f
            luaj.LuaValue r4 = r1.call(r4, r5)
            return r4
        L3f:
            int r0 = r0 + 1
            r4 = 100
            if (r0 < r4) goto L4d
            java.lang.String r4 = "loop in gettable"
            R0(r4)
            luaj.LuaValue r4 = luaj.LuaValue.f1671c
            return r4
        L4d:
            r4 = r1
            goto L1
    }

    private void b1(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "attempt to index ? (a "
            r0.append(r1)
            java.lang.String r1 = r2.D2()
            r0.append(r1)
            java.lang.String r1 = " value) with key '"
            r0.append(r1)
            r0.append(r3)
            r3 = 39
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            R0(r3)
            return
    }

    public static luaj.LuaValue k0(int r2, java.lang.String r3) {
            luaj.c r0 = new luaj.c
            r1 = 0
            r0.<init>(r2, r1, r3)
            throw r0
    }

    public static luaj.LuaValue l0(int r1, java.lang.String r2, java.lang.String r3) {
            luaj.c r0 = new luaj.c
            r0.<init>(r1, r2, r3)
            throw r0
    }

    protected static boolean l2(luaj.LuaValue r5, luaj.LuaValue r6, luaj.LuaValue r7) {
            r0 = 0
            r1 = 0
        L2:
            boolean r2 = r5.o1()
            r3 = 1
            if (r2 == 0) goto L23
            luaj.LuaValue r2 = r5.V1(r6)
            boolean r2 = r2.l1()
            if (r2 == 0) goto L1f
            luaj.LuaString r2 = luaj.LuaValue.m
            luaj.LuaValue r2 = r5.x1(r2)
            boolean r4 = r2.l1()
            if (r4 == 0) goto L2f
        L1f:
            r5.d2(r6, r7)
            return r3
        L23:
            luaj.LuaString r2 = luaj.LuaValue.m
            luaj.LuaValue r2 = r5.x1(r2)
            boolean r4 = r2.l1()
            if (r4 != 0) goto L46
        L2f:
            boolean r4 = r2.g1()
            if (r4 == 0) goto L39
            r2.call(r5, r6, r7)
            return r3
        L39:
            int r1 = r1 + r3
            r5 = 100
            if (r1 < r5) goto L44
            java.lang.String r5 = "loop in settable"
            R0(r5)
            return r0
        L44:
            r5 = r2
            goto L2
        L46:
            luaj.d r7 = new luaj.d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "table expected for set index ('"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = "') value, got "
            r0.append(r6)
            java.lang.String r5 = r5.D2()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r7.<init>(r5)
            throw r7
    }

    public static luaj.LuaValue n0(luaj.LuaValue r3, luaj.LuaValue r4, luaj.LuaValue r5) {
            luaj.LuaValue r0 = r4.x1(r3)
            boolean r1 = r0.l1()
            if (r1 == 0) goto L45
            luaj.LuaValue r0 = r5.x1(r3)
            boolean r1 = r0.l1()
            if (r1 == 0) goto L45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "attempt to perform arithmetic "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " on a "
            r1.append(r3)
            java.lang.String r3 = r4.E2()
            r1.append(r3)
            java.lang.String r3 = " value and a "
            r1.append(r3)
            java.lang.String r3 = r5.E2()
            r1.append(r3)
            java.lang.String r3 = " value"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            R0(r3)
        L45:
            luaj.LuaValue r3 = r0.call(r4, r5)
            return r3
    }

    public static luaj.LuaValue p0(luaj.LuaValue r4, luaj.LuaValue r5, luaj.LuaValue r6) {
            luaj.LuaValue r0 = r5.x1(r4)
            boolean r1 = r0.l1()
            if (r1 == 0) goto La7
            luaj.LuaValue r0 = r6.x1(r4)
            boolean r1 = r0.l1()
            if (r1 == 0) goto La7
            boolean r1 = r5.m1()
            if (r1 == 0) goto L22
            boolean r1 = r5.k1()
            if (r1 != 0) goto L22
            r1 = r5
            goto L31
        L22:
            boolean r1 = r6.m1()
            if (r1 == 0) goto L30
            boolean r1 = r6.k1()
            if (r1 != 0) goto L30
            r1 = r6
            goto L31
        L30:
            r1 = 0
        L31:
            java.lang.String r4 = v2(r4)
            if (r1 != 0) goto L69
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "attempt to perform bitwise operation "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " on a "
            r1.append(r4)
            java.lang.String r4 = r5.D2()
            r1.append(r4)
            java.lang.String r4 = " value and a "
            r1.append(r4)
            java.lang.String r4 = r6.D2()
            r1.append(r4)
            java.lang.String r4 = " value"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            R0(r4)
            goto La7
        L69:
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "number '"
            r2.append(r3)
            java.lang.String r1 = r1.g0()
            r2.append(r1)
            java.lang.String r1 = "' has no integer representation (for bitwise operation '"
            r2.append(r1)
            java.lang.String r5 = r5.g0()
            r2.append(r5)
            java.lang.String r5 = " "
            r2.append(r5)
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = r6.g0()
            r2.append(r4)
            java.lang.String r4 = "')"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r0.<init>(r4)
            throw r0
        La7:
            luaj.LuaValue r4 = r0.call(r5, r6)
            return r4
    }

    public static luaj.LuaTable s2() {
            luaj.LuaTable r0 = new luaj.LuaTable
            r0.<init>()
            return r0
    }

    public static luaj.LuaTable t2(luaj.Varargs r1, int r2) {
            luaj.LuaTable r0 = new luaj.LuaTable
            r0.<init>(r1, r2)
            return r0
    }

    public static luaj.LuaTable u2(luaj.LuaValue[] r2) {
            luaj.LuaTable r0 = new luaj.LuaTable
            r1 = 0
            r0.<init>(r2, r1, r1)
            return r0
    }

    public static java.lang.String v2(luaj.LuaValue r1) {
            luaj.LuaString r0 = luaj.LuaValue.F
            if (r1 != r0) goto L7
            java.lang.String r1 = "&"
            return r1
        L7:
            luaj.LuaString r0 = luaj.LuaValue.G
            if (r1 != r0) goto Le
            java.lang.String r1 = "|"
            return r1
        Le:
            luaj.LuaString r0 = luaj.LuaValue.H
            if (r1 != r0) goto L15
            java.lang.String r1 = "~"
            return r1
        L15:
            luaj.LuaString r0 = luaj.LuaValue.I
            if (r1 != r0) goto L1c
            java.lang.String r1 = "<<"
            return r1
        L1c:
            luaj.LuaString r0 = luaj.LuaValue.J
            if (r1 != r0) goto L23
            java.lang.String r1 = ">>"
            return r1
        L23:
            java.lang.String r1 = r1.g0()
            return r1
    }

    protected static luaj.e w1(luaj.LuaValue r5) {
            if (r5 == 0) goto L3b
            boolean r0 = r5.o1()
            if (r0 == 0) goto L3b
            luaj.LuaString r0 = luaj.LuaValue.o
            luaj.LuaValue r0 = r5.V1(r0)
            boolean r1 = r0.n1()
            if (r1 == 0) goto L38
            java.lang.String r0 = r0.g0()
            r1 = 107(0x6b, float:1.5E-43)
            int r1 = r0.indexOf(r1)
            r2 = 0
            r3 = 1
            if (r1 < 0) goto L24
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            r4 = 118(0x76, float:1.65E-43)
            int r0 = r0.indexOf(r4)
            if (r0 < 0) goto L2e
            r2 = 1
        L2e:
            if (r1 != 0) goto L32
            if (r2 == 0) goto L38
        L32:
            luaj.WeakTable r0 = new luaj.WeakTable
            r0.<init>(r1, r2, r5)
            return r0
        L38:
            luaj.LuaTable r5 = (luaj.LuaTable) r5
            return r5
        L3b:
            if (r5 == 0) goto L43
            luaj.f r0 = new luaj.f
            r0.<init>(r5)
            return r0
        L43:
            r5 = 0
            return r5
    }

    public int A0() {
            r1 = this;
            java.lang.String r0 = "int"
            r1.m0(r0)
            r0 = 0
            return r0
    }

    public luaj.LuaValue A1() {
            r2 = this;
            luaj.LuaString r0 = luaj.LuaValue.w
            java.lang.String r1 = "attempt to perform arithmetic on "
            luaj.LuaValue r0 = r2.D0(r0, r1)
            luaj.LuaValue r0 = r0.call(r2)
            return r0
    }

    public luaj.LuaValue A2() {
            r1 = this;
            luaj.LuaValue r0 = luaj.LuaValue.f1671c
            return r0
    }

    public java.lang.String B0() {
            r1 = this;
            java.lang.String r0 = "string"
            r1.m0(r0)
            r0 = 0
            return r0
    }

    public luaj.LuaValue B1() {
            r1 = this;
            luaj.LuaBoolean r0 = luaj.LuaValue.f1673e
            return r0
    }

    public luaj.LuaValue B2() {
            r1 = this;
            luaj.LuaValue r0 = luaj.LuaValue.f1671c
            return r0
    }

    public long C0() {
            r2 = this;
            java.lang.String r0 = "long"
            r2.m0(r0)
            r0 = 0
            return r0
    }

    public abstract int C2();

    protected luaj.LuaValue D0(luaj.LuaValue r3, java.lang.String r4) {
            r2 = this;
            luaj.LuaValue r0 = r2.x1(r3)
            boolean r1 = r0.l1()
            if (r1 == 0) goto L57
            luaj.LuaString r0 = luaj.LuaValue.E
            if (r3 != r0) goto L34
            boolean r3 = r2.m1()
            if (r3 == 0) goto L34
            luaj.d r3 = new luaj.d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "number has no integer representation (for bitwise operation '~"
            r4.append(r0)
            java.lang.String r0 = r2.g0()
            r4.append(r0)
            java.lang.String r0 = "')"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L34:
            luaj.d r3 = new luaj.d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "a "
            r0.append(r4)
            java.lang.String r4 = r2.E2()
            r0.append(r4)
            java.lang.String r4 = " value"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L57:
            return r0
    }

    public luaj.Varargs D1(luaj.Varargs r1, boolean r2) {
            r0 = this;
            luaj.Varargs r1 = r0.invoke(r1)
            return r1
    }

    public abstract java.lang.String D2();

    public luaj.LuaNumber E0() {
            r1 = this;
            java.lang.String r0 = "number"
            r1.m0(r0)
            r0 = 0
            return r0
    }

    public boolean E1(boolean r1) {
            r0 = this;
            java.lang.String r1 = "boolean"
            r0.m0(r1)
            r1 = 0
            return r1
    }

    public java.lang.String E2() {
            r2 = this;
            luaj.LuaString r0 = luaj.LuaValue.K
            luaj.LuaValue r0 = r2.x1(r0)
            boolean r1 = r0.n1()
            if (r1 == 0) goto L11
            java.lang.String r0 = r0.g0()
            return r0
        L11:
            java.lang.String r0 = r2.D2()
            return r0
    }

    public luaj.LuaNumber F0(java.lang.String r2) {
            r1 = this;
            luaj.d r0 = new luaj.d
            r0.<init>(r2)
            throw r0
    }

    public double F1(double r1) {
            r0 = this;
            java.lang.String r1 = "number"
            r0.m0(r1)
            r1 = 0
            return r1
    }

    protected luaj.LuaValue F2(java.lang.String r3) {
            r2 = this;
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " expected, got "
            r1.append(r3)
            java.lang.String r3 = r2.E2()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public luaj.LuaString G0() {
            r1 = this;
            java.lang.String r0 = "string"
            r1.m0(r0)
            r0 = 0
            return r0
    }

    public luaj.LuaFunction G1(luaj.LuaFunction r1) {
            r0 = this;
            java.lang.String r1 = "function"
            r0.m0(r1)
            r1 = 0
            return r1
    }

    protected luaj.LuaValue G2(java.lang.String r4) {
            r3 = this;
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 39
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "' not implemented for "
            r1.append(r4)
            java.lang.String r4 = r3.D2()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public luaj.LuaTable H0() {
            r1 = this;
            java.lang.String r0 = "table"
            r1.m0(r0)
            r0 = 0
            return r0
    }

    public int H1(int r1) {
            r0 = this;
            java.lang.String r1 = "int"
            r0.m0(r1)
            r1 = 0
            return r1
    }

    public luaj.LuaThread I0() {
            r1 = this;
            java.lang.String r0 = "thread"
            r1.m0(r0)
            r0 = 0
            return r0
    }

    public java.lang.String I1(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = "String"
            r0.m0(r1)
            r1 = 0
            return r1
    }

    public luaj.LuaValue J0(luaj.LuaValue r3, luaj.LuaValue r4) {
            r2 = this;
            luaj.LuaValue r0 = r2.x1(r3)
            boolean r1 = r0.l1()
            if (r1 == 0) goto L8b
            luaj.LuaValue r0 = r4.x1(r3)
            boolean r1 = r0.l1()
            if (r1 != 0) goto L15
            goto L8b
        L15:
            luaj.LuaString r0 = luaj.LuaValue.A
            boolean r3 = r0.T1(r3)
            if (r3 == 0) goto L3c
            luaj.LuaString r3 = luaj.LuaValue.z
            luaj.LuaValue r0 = r2.x1(r3)
            boolean r1 = r0.l1()
            if (r1 == 0) goto L33
            luaj.LuaValue r0 = r4.x1(r3)
            boolean r3 = r0.l1()
            if (r3 != 0) goto L3c
        L33:
            luaj.LuaValue r3 = r0.call(r4, r2)
            luaj.LuaValue r3 = r3.B1()
            return r3
        L3c:
            java.lang.String r3 = r2.E2()
            java.lang.String r4 = r4.E2()
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "two "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = " values"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L75
        L61:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = " with "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
        L75:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "attempt to compare "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            luaj.LuaValue r3 = R0(r3)
            return r3
        L8b:
            luaj.LuaValue r3 = r0.call(r2, r4)
            return r3
    }

    public long J1(long r1) {
            r0 = this;
            java.lang.String r1 = "long"
            r0.m0(r1)
            r1 = 0
            return r1
    }

    public luaj.LuaValue K0(luaj.LuaValue r1) {
            r0 = this;
            luaj.LuaValue r1 = r0.N0(r1)
            return r1
    }

    public luaj.LuaString K1(luaj.LuaString r1) {
            r0 = this;
            java.lang.String r1 = "string"
            r0.m0(r1)
            r1 = 0
            return r1
    }

    public luaj.LuaValue L0(luaj.LuaNumber r1) {
            r0 = this;
            luaj.LuaValue r1 = r1.N0(r0)
            return r1
    }

    public luaj.LuaTable L1(luaj.LuaTable r1) {
            r0 = this;
            java.lang.String r1 = "table"
            r0.m0(r1)
            r1 = 0
            return r1
    }

    public luaj.LuaValue M0(luaj.LuaString r1) {
            r0 = this;
            luaj.LuaValue r1 = r1.N0(r0)
            return r1
    }

    public luaj.LuaValue M1(luaj.LuaValue r1) {
            r0 = this;
            return r0
    }

    public luaj.LuaValue N0(luaj.LuaValue r4) {
            r3 = this;
            luaj.LuaString r0 = luaj.LuaValue.C
            luaj.LuaValue r1 = r3.x1(r0)
            boolean r2 = r1.l1()
            if (r2 == 0) goto L6e
            luaj.LuaValue r1 = r4.x1(r0)
            boolean r0 = r1.l1()
            if (r0 == 0) goto L6e
            boolean r0 = r3.n1()
            if (r0 != 0) goto L1e
            r0 = r3
            goto L27
        L1e:
            boolean r0 = r4.n1()
            if (r0 != 0) goto L26
            r0 = r4
            goto L27
        L26:
            r0 = 0
        L27:
            if (r0 != 0) goto L4e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "attempt to concatenate "
            r0.append(r2)
            java.lang.String r2 = r3.D2()
            r0.append(r2)
            java.lang.String r2 = " and "
            r0.append(r2)
            java.lang.String r2 = r4.D2()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            R0(r0)
            goto L6e
        L4e:
            luaj.d r4 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "attempt to concatenate a "
            r1.append(r2)
            java.lang.String r0 = r0.D2()
            r1.append(r0)
            java.lang.String r0 = " value"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L6e:
            luaj.LuaValue r4 = r1.call(r3, r4)
            return r4
    }

    public luaj.LuaValue O0(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaString r0 = luaj.LuaValue.s
            luaj.LuaValue r2 = n0(r0, r1, r2)
            return r2
    }

    public boolean P0(luaj.LuaValue r1) {
            r0 = this;
            if (r0 != r1) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            return r1
    }

    public luaj.LuaValue Q1(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaString r0 = luaj.LuaValue.u
            luaj.LuaValue r2 = n0(r0, r1, r2)
            return r2
    }

    public void R1(int r1) {
            r0 = this;
            java.lang.String r1 = "table"
            r0.F2(r1)
            return
    }

    public boolean S1(luaj.LuaString r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public luaj.LuaValue T0(java.lang.String r1) {
            r0 = this;
            luaj.LuaString r1 = K2(r1)
            luaj.LuaValue r1 = r0.U0(r1)
            return r1
    }

    public boolean T1(luaj.LuaValue r1) {
            r0 = this;
            if (r0 != r1) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            return r1
    }

    @Override // luaj.Varargs
    public int U() {
            r1 = this;
            r0 = 1
            return r0
    }

    public luaj.LuaValue U0(luaj.LuaValue r1) {
            r0 = this;
            luaj.LuaValue r1 = W0(r0, r1)
            return r1
    }

    public luaj.LuaValue U1(java.lang.String r1) {
            r0 = this;
            luaj.LuaString r1 = K2(r1)
            luaj.LuaValue r1 = r0.V1(r1)
            return r1
    }

    public luaj.LuaValue V0() {
            r1 = this;
            r0 = 0
            return r0
    }

    public luaj.LuaValue V1(luaj.LuaValue r1) {
            r0 = this;
            java.lang.String r1 = "rawget"
            luaj.LuaValue r1 = r0.G2(r1)
            return r1
    }

    public int W1() {
            r1 = this;
            java.lang.String r0 = "table or string"
            r1.F2(r0)
            r0 = 0
            return r0
    }

    public boolean X0(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaString r0 = luaj.LuaValue.A
            luaj.LuaValue r2 = r2.J0(r0, r1)
            boolean r2 = r2.w2()
            return r2
    }

    public void X1(int r1, java.lang.String r2) {
            r0 = this;
            if (r2 == 0) goto L9
            luaj.LuaString r2 = K2(r2)
            r0.Y1(r1, r2)
        L9:
            return
    }

    public boolean Y0(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaString r0 = luaj.LuaValue.z
            luaj.LuaValue r2 = r2.J0(r0, r1)
            boolean r2 = r2.w2()
            return r2
    }

    public void Y1(int r3, luaj.LuaValue r4) {
            r2 = this;
            if (r4 == 0) goto La
            long r0 = (long) r3
            luaj.LuaLong r3 = I2(r0)
            r2.d2(r3, r4)
        La:
            return
    }

    public luaj.LuaValue Z0(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaString r0 = luaj.LuaValue.D
            luaj.LuaValue r2 = n0(r0, r1, r2)
            return r2
    }

    public void Z1(java.lang.String r1, double r2) {
            r0 = this;
            if (r1 == 0) goto Ld
            luaj.LuaString r1 = K2(r1)
            luaj.LuaNumber r2 = J2(r2)
            r0.d2(r1, r2)
        Ld:
            return
    }

    protected luaj.LuaValue a1(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "illegal operation '"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "' for "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public void a2(java.lang.String r3, int r4) {
            r2 = this;
            if (r3 == 0) goto Le
            luaj.LuaString r3 = K2(r3)
            long r0 = (long) r4
            luaj.LuaLong r4 = I2(r0)
            r2.d2(r3, r4)
        Le:
            return
    }

    public void b2(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            if (r1 == 0) goto Lf
            if (r2 == 0) goto Lf
            luaj.LuaString r1 = K2(r1)
            luaj.LuaString r2 = K2(r2)
            r0.d2(r1, r2)
        Lf:
            return
    }

    public void c1(luaj.LuaValue r1) {
            r0 = this;
            return
    }

    public void c2(java.lang.String r1, luaj.LuaValue r2) {
            r0 = this;
            if (r1 == 0) goto Lb
            if (r2 == 0) goto Lb
            luaj.LuaString r1 = K2(r1)
            r0.d2(r1, r2)
        Lb:
            return
    }

    public luaj.LuaValue call() {
            r1 = this;
            luaj.LuaValue r0 = r1.u0()
            luaj.LuaValue r0 = r0.call(r1)
            return r0
    }

    public luaj.LuaValue call(java.lang.String r1) {
            r0 = this;
            luaj.LuaString r1 = K2(r1)
            luaj.LuaValue r1 = r0.call(r1)
            return r1
    }

    public luaj.LuaValue call(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaValue r0 = r1.u0()
            luaj.LuaValue r2 = r0.call(r1, r2)
            return r2
    }

    public luaj.LuaValue call(luaj.LuaValue r2, luaj.LuaValue r3) {
            r1 = this;
            luaj.LuaValue r0 = r1.u0()
            luaj.LuaValue r2 = r0.call(r1, r2, r3)
            return r2
    }

    public luaj.LuaValue call(luaj.LuaValue r4, luaj.LuaValue r5, luaj.LuaValue r6) {
            r3 = this;
            luaj.LuaValue r0 = r3.u0()
            r1 = 4
            luaj.LuaValue[] r1 = new luaj.LuaValue[r1]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            r4 = 2
            r1[r4] = r5
            r4 = 3
            r1[r4] = r6
            luaj.Varargs r4 = r0.invoke(r1)
            luaj.LuaValue r4 = r4.w()
            return r4
    }

    public boolean d1() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void d2(luaj.LuaValue r1, luaj.LuaValue r2) {
            r0 = this;
            if (r1 == 0) goto L9
            if (r2 == 0) goto L9
            java.lang.String r1 = "rawset"
            r0.G2(r1)
        L9:
            return
    }

    @Override // luaj.Varargs
    public luaj.Varargs e0(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L4
            return r1
        L4:
            if (r2 <= r0) goto L9
            luaj.LuaValue r2 = luaj.LuaValue.f1674f
            return r2
        L9:
            java.lang.String r2 = "start must be > 0"
            luaj.LuaValue r2 = k0(r0, r2)
            return r2
    }

    public boolean e1() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void e2(int r3, luaj.LuaValue r4) {
            r2 = this;
            if (r4 == 0) goto La
            long r0 = (long) r3
            luaj.LuaLong r3 = luaj.LuaLong.I2(r0)
            r2.j2(r3, r4)
        La:
            return
    }

    public boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 != r1) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            return r1
    }

    public boolean f1() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void f2(java.lang.String r1, double r2) {
            r0 = this;
            if (r1 == 0) goto Ld
            luaj.LuaString r1 = K2(r1)
            luaj.LuaNumber r2 = J2(r2)
            r0.j2(r1, r2)
        Ld:
            return
    }

    @Override // luaj.Varargs
    public java.lang.String g0() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.E2()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            int r1 = r2.hashCode()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean g1() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void g2(java.lang.String r3, int r4) {
            r2 = this;
            if (r3 == 0) goto Le
            luaj.LuaString r3 = K2(r3)
            long r0 = (long) r4
            luaj.LuaLong r4 = I2(r0)
            r2.j2(r3, r4)
        Le:
            return
    }

    public boolean h1() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void h2(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            if (r1 == 0) goto Lf
            if (r2 == 0) goto Lf
            luaj.LuaString r1 = K2(r1)
            luaj.LuaString r2 = K2(r2)
            r0.j2(r1, r2)
        Lf:
            return
    }

    public boolean i1() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void i2(java.lang.String r1, luaj.LuaValue r2) {
            r0 = this;
            if (r1 == 0) goto Lb
            if (r2 == 0) goto Lb
            luaj.LuaString r1 = K2(r1)
            r0.j2(r1, r2)
        Lb:
            return
    }

    public luaj.Varargs invoke() {
            r1 = this;
            luaj.LuaValue r0 = luaj.LuaValue.f1674f
            luaj.Varargs r0 = r1.invoke(r0)
            return r0
    }

    public luaj.Varargs invoke(luaj.LuaValue r1, luaj.LuaValue r2, luaj.Varargs r3) {
            r0 = this;
            luaj.Varargs r1 = M2(r1, r2, r3)
            luaj.Varargs r1 = r0.invoke(r1)
            return r1
    }

    public luaj.Varargs invoke(luaj.LuaValue r1, luaj.Varargs r2) {
            r0 = this;
            luaj.Varargs r1 = N2(r1, r2)
            luaj.Varargs r1 = r0.invoke(r1)
            return r1
    }

    public luaj.Varargs invoke(luaj.Varargs r2) {
            r1 = this;
            luaj.LuaValue r0 = r1.u0()
            luaj.Varargs r2 = r0.invoke(r1, r2)
            return r2
    }

    public luaj.Varargs invoke(luaj.LuaValue[] r1) {
            r0 = this;
            luaj.Varargs r1 = O2(r1)
            luaj.Varargs r1 = r0.invoke(r1)
            return r1
    }

    public luaj.Varargs invoke(luaj.LuaValue[] r1, luaj.Varargs r2) {
            r0 = this;
            luaj.Varargs r1 = R2(r1, r2)
            luaj.Varargs r1 = r0.invoke(r1)
            return r1
    }

    public luaj.LuaValue j0(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaString r0 = luaj.LuaValue.q
            luaj.LuaValue r2 = n0(r0, r1, r2)
            return r2
    }

    public boolean j1() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void j2(luaj.LuaValue r1, luaj.LuaValue r2) {
            r0 = this;
            if (r1 == 0) goto L7
            if (r2 == 0) goto L7
            l2(r0, r1, r2)
        L7:
            return
    }

    public boolean k1() {
            r1 = this;
            r0 = 0
            return r0
    }

    public luaj.LuaValue k2(luaj.LuaValue r1) {
            r0 = this;
            java.lang.String r1 = "table"
            luaj.LuaValue r1 = r0.m0(r1)
            return r1
    }

    public boolean l1() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected luaj.LuaValue m0(java.lang.String r4) {
            r3 = this;
            luaj.d r0 = new luaj.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bad argument: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " expected, got "
            r1.append(r4)
            java.lang.String r4 = r3.E2()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public boolean m1() {
            r1 = this;
            r0 = 0
            return r0
    }

    public luaj.LuaValue m2(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaString r0 = luaj.LuaValue.I
            luaj.LuaValue r2 = p0(r0, r1, r2)
            return r2
    }

    public boolean n1() {
            r1 = this;
            r0 = 0
            return r0
    }

    public luaj.LuaValue n2(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaString r0 = luaj.LuaValue.J
            luaj.LuaValue r2 = p0(r0, r1, r2)
            return r2
    }

    public luaj.LuaValue o0(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaString r0 = luaj.LuaValue.F
            luaj.LuaValue r2 = p0(r0, r1, r2)
            return r2
    }

    public boolean o1() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int o2(luaj.LuaString r2) {
            r1 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "attempt to compare "
            r2.append(r0)
            java.lang.String r0 = r1.D2()
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            R0(r2)
            r2 = 0
            return r2
    }

    public boolean p1() {
            r1 = this;
            r0 = 0
            return r0
    }

    public luaj.LuaValue p2() {
            r0 = this;
            return r0
    }

    public luaj.LuaValue q0() {
            r2 = this;
            luaj.LuaString r0 = luaj.LuaValue.E
            java.lang.String r1 = "attempt to perform bitwise on "
            luaj.LuaValue r0 = r2.D0(r0, r1)
            luaj.LuaValue r0 = r0.call(r2)
            return r0
    }

    public boolean q1() {
            r1 = this;
            r0 = 1
            return r0
    }

    public luaj.LuaString q2() {
            r1 = this;
            java.lang.String r0 = "string or number"
            r1.F2(r0)
            r0 = 0
            return r0
    }

    public luaj.LuaValue r0(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaString r0 = luaj.LuaValue.G
            luaj.LuaValue r2 = p0(r0, r1, r2)
            return r2
    }

    public luaj.LuaValue r1() {
            r2 = this;
            luaj.LuaString r0 = luaj.LuaValue.x
            java.lang.String r1 = "attempt to get length of "
            luaj.LuaValue r0 = r2.D0(r0, r1)
            luaj.LuaValue r0 = r0.call(r2)
            return r0
    }

    public luaj.LuaValue r2(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaString r0 = luaj.LuaValue.r
            luaj.LuaValue r2 = n0(r0, r1, r2)
            return r2
    }

    public f.a s0() {
            r1 = this;
            f.a r0 = new f.a
            r0.<init>(r1)
            return r0
    }

    public int s1() {
            r1 = this;
            luaj.LuaValue r0 = r1.r1()
            int r0 = r0.y2()
            return r0
    }

    public luaj.LuaValue t0(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaString r0 = luaj.LuaValue.H
            luaj.LuaValue r2 = p0(r0, r1, r2)
            return r2
    }

    public luaj.LuaValue t1(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaString r0 = luaj.LuaValue.L
            luaj.LuaValue r2 = r2.call(r0, r1)
            return r2
    }

    @Override // luaj.Varargs
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.g0()
            return r0
    }

    protected luaj.LuaValue u0() {
            r2 = this;
            luaj.LuaString r0 = luaj.LuaValue.n
            java.lang.String r1 = "attempt to call "
            luaj.LuaValue r0 = r2.D0(r0, r1)
            return r0
    }

    public boolean u1(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaString r0 = luaj.LuaValue.z
            luaj.LuaValue r2 = r1.J0(r0, r2)
            boolean r2 = r2.w2()
            return r2
    }

    @Override // luaj.Varargs
    public luaj.LuaValue v(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L5
            r2 = r1
            goto L7
        L5:
            luaj.LuaValue r2 = luaj.LuaValue.f1671c
        L7:
            return r2
    }

    public boolean v0() {
            r1 = this;
            java.lang.String r0 = "boolean"
            r1.m0(r0)
            r0 = 0
            return r0
    }

    public boolean v1(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaString r0 = luaj.LuaValue.A
            luaj.LuaValue r2 = r1.J0(r0, r2)
            boolean r2 = r2.w2()
            return r2
    }

    @Override // luaj.Varargs
    public luaj.LuaValue w() {
            r0 = this;
            return r0
    }

    public luaj.LuaClosure w0() {
            r1 = this;
            java.lang.String r0 = "closure"
            r1.m0(r0)
            r0 = 0
            return r0
    }

    public boolean w2() {
            r1 = this;
            r0 = 1
            return r0
    }

    public double x0() {
            r2 = this;
            java.lang.String r0 = "number"
            r2.m0(r0)
            r0 = 0
            return r0
    }

    public luaj.LuaValue x1(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaValue r0 = r1.V0()
            if (r0 != 0) goto L9
            luaj.LuaValue r2 = luaj.LuaValue.f1671c
            return r2
        L9:
            luaj.LuaValue r2 = r0.V1(r2)
            return r2
    }

    public double x2() {
            r2 = this;
            r0 = 0
            return r0
    }

    public luaj.LuaFunction y0() {
            r1 = this;
            java.lang.String r0 = "function"
            r1.m0(r0)
            r0 = 0
            return r0
    }

    public luaj.LuaValue y1(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaString r0 = luaj.LuaValue.v
            luaj.LuaValue r2 = n0(r0, r1, r2)
            return r2
    }

    public int y2() {
            r1 = this;
            r0 = 0
            return r0
    }

    public luaj.Globals z0() {
            r1 = this;
            java.lang.String r0 = "globals"
            r1.m0(r0)
            r0 = 0
            return r0
    }

    public luaj.LuaValue z1(luaj.LuaValue r2) {
            r1 = this;
            luaj.LuaString r0 = luaj.LuaValue.t
            luaj.LuaValue r2 = n0(r0, r1, r2)
            return r2
    }

    public long z2() {
            r2 = this;
            r0 = 0
            return r0
    }
}
