package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class Varargs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f1676a = null;

    static final class a extends luaj.Varargs {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final luaj.LuaValue[] f1678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f1679d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final luaj.Varargs f1680e;

        public a(luaj.LuaValue[] r1, int r2, int r3, luaj.Varargs r4) {
                r0 = this;
                r0.<init>()
                r0.f1678c = r1
                r0.f1677b = r2
                r0.f1679d = r3
                r0.f1680e = r4
                return
        }

        @Override // luaj.Varargs
        void L(luaj.LuaValue[] r4, int r5, int r6) {
                r3 = this;
                int r0 = r3.f1679d
                int r0 = java.lang.Math.min(r0, r6)
                luaj.LuaValue[] r1 = r3.f1678c
                int r2 = r3.f1677b
                java.lang.System.arraycopy(r1, r2, r4, r5, r0)
                luaj.Varargs r1 = r3.f1680e
                int r5 = r5 + r0
                int r6 = r6 - r0
                r1.L(r4, r5, r6)
                return
        }

        @Override // luaj.Varargs
        public int U() {
                r2 = this;
                int r0 = r2.f1679d
                luaj.Varargs r1 = r2.f1680e
                int r1 = r1.U()
                int r0 = r0 + r1
                return r0
        }

        @Override // luaj.Varargs
        public luaj.Varargs e0(int r5) {
                r4 = this;
                r0 = 1
                if (r5 > 0) goto L8
                java.lang.String r1 = "start must be > 0"
                luaj.LuaValue.k0(r0, r1)
            L8:
                if (r5 != r0) goto Lb
                return r4
            Lb:
                int r1 = r4.f1679d
                if (r5 <= r1) goto L17
                luaj.Varargs r0 = r4.f1680e
                int r5 = r5 - r1
                luaj.Varargs r5 = r0.e0(r5)
                return r5
            L17:
                luaj.LuaValue[] r2 = r4.f1678c
                int r3 = r4.f1677b
                int r3 = r3 + r5
                int r3 = r3 - r0
                int r5 = r5 - r0
                int r1 = r1 - r5
                luaj.Varargs r5 = r4.f1680e
                luaj.Varargs r5 = luaj.LuaValue.Q2(r2, r3, r1, r5)
                return r5
        }

        @Override // luaj.Varargs
        public luaj.LuaValue v(int r4) {
                r3 = this;
                r0 = 1
                if (r4 >= r0) goto L6
                luaj.LuaValue r4 = luaj.LuaValue.f1671c
                goto L1a
            L6:
                int r1 = r3.f1679d
                if (r4 > r1) goto L13
                luaj.LuaValue[] r1 = r3.f1678c
                int r2 = r3.f1677b
                int r2 = r2 + r4
                int r2 = r2 - r0
                r4 = r1[r2]
                goto L1a
            L13:
                luaj.Varargs r0 = r3.f1680e
                int r4 = r4 - r1
                luaj.LuaValue r4 = r0.v(r4)
            L1a:
                return r4
        }

        @Override // luaj.Varargs
        public luaj.LuaValue w() {
                r2 = this;
                int r0 = r2.f1679d
                if (r0 <= 0) goto Lb
                luaj.LuaValue[] r0 = r2.f1678c
                int r1 = r2.f1677b
                r0 = r0[r1]
                goto L11
            Lb:
                luaj.Varargs r0 = r2.f1680e
                luaj.LuaValue r0 = r0.w()
            L11:
                return r0
        }
    }

    static final class b extends luaj.Varargs {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final luaj.LuaValue[] f1681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final luaj.Varargs f1682c;

        b(luaj.LuaValue[] r1, luaj.Varargs r2) {
                r0 = this;
                r0.<init>()
                r0.f1681b = r1
                r0.f1682c = r2
                return
        }

        @Override // luaj.Varargs
        void L(luaj.LuaValue[] r4, int r5, int r6) {
                r3 = this;
                luaj.LuaValue[] r0 = r3.f1681b
                int r0 = r0.length
                int r0 = java.lang.Math.min(r0, r6)
                luaj.LuaValue[] r1 = r3.f1681b
                r2 = 0
                java.lang.System.arraycopy(r1, r2, r4, r5, r0)
                luaj.Varargs r1 = r3.f1682c
                int r5 = r5 + r0
                int r6 = r6 - r0
                r1.L(r4, r5, r6)
                return
        }

        @Override // luaj.Varargs
        public int U() {
                r2 = this;
                luaj.LuaValue[] r0 = r2.f1681b
                int r0 = r0.length
                luaj.Varargs r1 = r2.f1682c
                int r1 = r1.U()
                int r0 = r0 + r1
                return r0
        }

        @Override // luaj.Varargs
        public luaj.Varargs e0(int r4) {
                r3 = this;
                r0 = 1
                if (r4 > 0) goto L8
                java.lang.String r1 = "start must be > 0"
                luaj.LuaValue.k0(r0, r1)
            L8:
                if (r4 != r0) goto Lb
                return r3
            Lb:
                luaj.LuaValue[] r1 = r3.f1681b
                int r2 = r1.length
                if (r4 <= r2) goto L19
                luaj.Varargs r0 = r3.f1682c
                int r1 = r1.length
                int r4 = r4 - r1
                luaj.Varargs r4 = r0.e0(r4)
                return r4
            L19:
                int r4 = r4 - r0
                int r0 = r1.length
                int r0 = r0 - r4
                luaj.Varargs r2 = r3.f1682c
                luaj.Varargs r4 = luaj.LuaValue.Q2(r1, r4, r0, r2)
                return r4
        }

        @Override // luaj.Varargs
        public luaj.LuaValue v(int r4) {
                r3 = this;
                r0 = 1
                if (r4 >= r0) goto L6
                luaj.LuaValue r4 = luaj.LuaValue.f1671c
                goto L17
            L6:
                luaj.LuaValue[] r1 = r3.f1681b
                int r2 = r1.length
                if (r4 > r2) goto Lf
                int r4 = r4 - r0
                r4 = r1[r4]
                goto L17
            Lf:
                luaj.Varargs r0 = r3.f1682c
                int r1 = r1.length
                int r4 = r4 - r1
                luaj.LuaValue r4 = r0.v(r4)
            L17:
                return r4
        }

        @Override // luaj.Varargs
        public luaj.LuaValue w() {
                r2 = this;
                luaj.LuaValue[] r0 = r2.f1681b
                int r1 = r0.length
                if (r1 <= 0) goto L9
                r1 = 0
                r0 = r0[r1]
                goto Lf
            L9:
                luaj.Varargs r0 = r2.f1682c
                luaj.LuaValue r0 = r0.w()
            Lf:
                return r0
        }
    }

    static final class c extends luaj.Varargs {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final luaj.LuaValue f1683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final luaj.Varargs f1684c;

        c(luaj.LuaValue r1, luaj.Varargs r2) {
                r0 = this;
                r0.<init>()
                r0.f1683b = r1
                r0.f1684c = r2
                return
        }

        @Override // luaj.Varargs
        public int U() {
                r1 = this;
                luaj.Varargs r0 = r1.f1684c
                int r0 = r0.U()
                int r0 = r0 + 1
                return r0
        }

        @Override // luaj.Varargs
        public luaj.Varargs e0(int r3) {
                r2 = this;
                r0 = 1
                if (r3 != r0) goto L4
                return r2
            L4:
                r1 = 2
                if (r3 != r1) goto La
                luaj.Varargs r3 = r2.f1684c
                return r3
            La:
                if (r3 <= r1) goto L14
                luaj.Varargs r1 = r2.f1684c
                int r3 = r3 - r0
                luaj.Varargs r3 = r1.e0(r3)
                return r3
            L14:
                java.lang.String r3 = "start must be > 0"
                luaj.LuaValue r3 = luaj.LuaValue.k0(r0, r3)
                return r3
        }

        @Override // luaj.Varargs
        public luaj.LuaValue v(int r3) {
                r2 = this;
                r0 = 1
                if (r3 != r0) goto L6
                luaj.LuaValue r3 = r2.f1683b
                goto Ld
            L6:
                luaj.Varargs r1 = r2.f1684c
                int r3 = r3 - r0
                luaj.LuaValue r3 = r1.v(r3)
            Ld:
                return r3
        }

        @Override // luaj.Varargs
        public luaj.LuaValue w() {
                r1 = this;
                luaj.LuaValue r0 = r1.f1683b
                return r0
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            luaj.Varargs.f1676a = r0
            return
    }

    public Varargs() {
            r0 = this;
            r0.<init>()
            return
    }

    private luaj.d y(int r3, luaj.d r4) {
            r2 = this;
            java.lang.String r4 = r4.getMessage()
            java.lang.String r0 = "bad argument: "
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L12
            r0 = 14
            java.lang.String r4 = r4.substring(r0)
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.U()
            if (r3 > r1) goto L26
            luaj.LuaValue r1 = r2.v(r3)
            java.lang.String r1 = r1.D2()
            goto L28
        L26:
            java.lang.String r1 = "no value"
        L28:
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.ThreadLocal r0 = luaj.Varargs.f1676a
            java.lang.Object r0 = r0.get()
            luaj.lib.VarArgFunction r0 = (luaj.lib.VarArgFunction) r0
            luaj.c r1 = new luaj.c
            if (r0 != 0) goto L45
            r0 = 0
            goto L49
        L45:
            java.lang.String r0 = r0.T2()
        L49:
            r1.<init>(r3, r0, r4)
            return r1
    }

    public luaj.LuaClosure A(int r2) {
            r1 = this;
            luaj.LuaValue r0 = r1.v(r2)     // Catch: luaj.d -> L9
            luaj.LuaClosure r2 = r0.w0()     // Catch: luaj.d -> L9
            return r2
        L9:
            r0 = move-exception
            luaj.d r2 = r1.y(r2, r0)
            throw r2
    }

    public double B(int r3) {
            r2 = this;
            luaj.LuaValue r0 = r2.v(r3)     // Catch: luaj.d -> L9
            double r0 = r0.x0()     // Catch: luaj.d -> L9
            return r0
        L9:
            r0 = move-exception
            luaj.d r3 = r2.y(r3, r0)
            throw r3
    }

    public luaj.LuaFunction C(int r2) {
            r1 = this;
            luaj.LuaValue r0 = r1.v(r2)     // Catch: luaj.d -> L9
            luaj.LuaFunction r2 = r0.y0()     // Catch: luaj.d -> L9
            return r2
        L9:
            r0 = move-exception
            luaj.d r2 = r1.y(r2, r0)
            throw r2
    }

    public int D(int r2) {
            r1 = this;
            luaj.LuaValue r0 = r1.v(r2)     // Catch: luaj.d -> L9
            int r2 = r0.A0()     // Catch: luaj.d -> L9
            return r2
        L9:
            r0 = move-exception
            luaj.d r2 = r1.y(r2, r0)
            throw r2
    }

    public java.lang.String E(int r2) {
            r1 = this;
            luaj.LuaValue r0 = r1.v(r2)     // Catch: luaj.d -> L9
            java.lang.String r2 = r0.B0()     // Catch: luaj.d -> L9
            return r2
        L9:
            r0 = move-exception
            luaj.d r2 = r1.y(r2, r0)
            throw r2
    }

    public long F(int r3) {
            r2 = this;
            luaj.LuaValue r0 = r2.v(r3)     // Catch: luaj.d -> L9
            long r0 = r0.C0()     // Catch: luaj.d -> L9
            return r0
        L9:
            r0 = move-exception
            luaj.d r3 = r2.y(r3, r0)
            throw r3
    }

    public luaj.LuaNumber G(int r2) {
            r1 = this;
            luaj.LuaValue r0 = r1.v(r2)     // Catch: luaj.d -> L9
            luaj.LuaNumber r2 = r0.E0()     // Catch: luaj.d -> L9
            return r2
        L9:
            r0 = move-exception
            luaj.d r2 = r1.y(r2, r0)
            throw r2
    }

    public luaj.LuaString H(int r2) {
            r1 = this;
            luaj.LuaValue r0 = r1.v(r2)     // Catch: luaj.d -> L9
            luaj.LuaString r2 = r0.G0()     // Catch: luaj.d -> L9
            return r2
        L9:
            r0 = move-exception
            luaj.d r2 = r1.y(r2, r0)
            throw r2
    }

    public luaj.LuaTable I(int r2) {
            r1 = this;
            luaj.LuaValue r0 = r1.v(r2)     // Catch: luaj.d -> L9
            luaj.LuaTable r2 = r0.H0()     // Catch: luaj.d -> L9
            return r2
        L9:
            r0 = move-exception
            luaj.d r2 = r1.y(r2, r0)
            throw r2
    }

    public luaj.LuaThread J(int r2) {
            r1 = this;
            luaj.LuaValue r0 = r1.v(r2)     // Catch: luaj.d -> L9
            luaj.LuaThread r2 = r0.I0()     // Catch: luaj.d -> L9
            return r2
        L9:
            r0 = move-exception
            luaj.d r2 = r1.y(r2, r0)
            throw r2
    }

    public luaj.LuaValue K(int r2) {
            r1 = this;
            int r0 = r1.U()
            if (r2 > r0) goto Lb
            luaj.LuaValue r2 = r1.v(r2)
            goto L11
        Lb:
            java.lang.String r0 = "value expected"
            luaj.LuaValue r2 = luaj.LuaValue.k0(r2, r0)
        L11:
            return r2
    }

    void L(luaj.LuaValue[] r4, int r5, int r6) {
            r3 = this;
            r0 = 0
        L1:
            if (r0 >= r6) goto Le
            int r1 = r5 + r0
            int r0 = r0 + 1
            luaj.LuaValue r2 = r3.v(r0)
            r4[r1] = r2
            goto L1
        Le:
            return
    }

    public luaj.Varargs M() {
            r3 = this;
            int r0 = r3.U()
            if (r0 == 0) goto L2d
            r1 = 1
            if (r0 == r1) goto L28
            r1 = 2
            if (r0 == r1) goto L1a
            luaj.LuaValue[] r1 = new luaj.LuaValue[r0]
            r2 = 0
            r3.L(r1, r2, r0)
            luaj.Varargs$b r0 = new luaj.Varargs$b
            luaj.LuaValue r2 = luaj.LuaValue.f1674f
            r0.<init>(r1, r2)
            return r0
        L1a:
            luaj.Varargs$c r0 = new luaj.Varargs$c
            luaj.LuaValue r2 = r3.w()
            luaj.LuaValue r1 = r3.v(r1)
            r0.<init>(r2, r1)
            return r0
        L28:
            luaj.LuaValue r0 = r3.w()
            return r0
        L2d:
            luaj.LuaValue r0 = luaj.LuaValue.f1674f
            return r0
    }

    public luaj.Varargs N() {
            r0 = this;
            return r0
    }

    public boolean O() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean P(int r1) {
            r0 = this;
            luaj.LuaValue r1 = r0.v(r1)
            boolean r1 = r1.g1()
            return r1
    }

    public boolean Q(int r1) {
            r0 = this;
            luaj.LuaValue r1 = r0.v(r1)
            boolean r1 = r1.l1()
            return r1
    }

    public boolean R(int r1) {
            r0 = this;
            luaj.LuaValue r1 = r0.v(r1)
            boolean r1 = r1.m1()
            return r1
    }

    public boolean S(int r1) {
            r0 = this;
            luaj.LuaValue r1 = r0.v(r1)
            boolean r1 = r1.n1()
            return r1
    }

    public boolean T(int r1) {
            r0 = this;
            luaj.LuaValue r1 = r0.v(r1)
            boolean r1 = r1.p1()
            return r1
    }

    public abstract int U();

    public boolean V(int r2, boolean r3) {
            r1 = this;
            luaj.LuaValue r0 = r1.v(r2)     // Catch: luaj.d -> L9
            boolean r2 = r0.E1(r3)     // Catch: luaj.d -> L9
            return r2
        L9:
            r3 = move-exception
            luaj.d r2 = r1.y(r2, r3)
            throw r2
    }

    public double W(int r2, double r3) {
            r1 = this;
            luaj.LuaValue r0 = r1.v(r2)     // Catch: luaj.d -> L9
            double r2 = r0.F1(r3)     // Catch: luaj.d -> L9
            return r2
        L9:
            r3 = move-exception
            luaj.d r2 = r1.y(r2, r3)
            throw r2
    }

    public luaj.LuaFunction X(int r2, luaj.LuaFunction r3) {
            r1 = this;
            luaj.LuaValue r0 = r1.v(r2)     // Catch: luaj.d -> L9
            luaj.LuaFunction r2 = r0.G1(r3)     // Catch: luaj.d -> L9
            return r2
        L9:
            r3 = move-exception
            luaj.d r2 = r1.y(r2, r3)
            throw r2
    }

    public int Y(int r2, int r3) {
            r1 = this;
            luaj.LuaValue r0 = r1.v(r2)     // Catch: luaj.d -> L9
            int r2 = r0.H1(r3)     // Catch: luaj.d -> L9
            return r2
        L9:
            r3 = move-exception
            luaj.d r2 = r1.y(r2, r3)
            throw r2
    }

    public java.lang.String Z(int r2, java.lang.String r3) {
            r1 = this;
            luaj.LuaValue r0 = r1.v(r2)     // Catch: luaj.d -> L9
            java.lang.String r2 = r0.I1(r3)     // Catch: luaj.d -> L9
            return r2
        L9:
            r3 = move-exception
            luaj.d r2 = r1.y(r2, r3)
            throw r2
    }

    public long a0(int r2, long r3) {
            r1 = this;
            luaj.LuaValue r0 = r1.v(r2)     // Catch: luaj.d -> L9
            long r2 = r0.J1(r3)     // Catch: luaj.d -> L9
            return r2
        L9:
            r3 = move-exception
            luaj.d r2 = r1.y(r2, r3)
            throw r2
    }

    public luaj.LuaString b0(int r2, luaj.LuaString r3) {
            r1 = this;
            luaj.LuaValue r0 = r1.v(r2)     // Catch: luaj.d -> L9
            luaj.LuaString r2 = r0.K1(r3)     // Catch: luaj.d -> L9
            return r2
        L9:
            r3 = move-exception
            luaj.d r2 = r1.y(r2, r3)
            throw r2
    }

    public luaj.LuaTable c0(int r2, luaj.LuaTable r3) {
            r1 = this;
            luaj.LuaValue r0 = r1.v(r2)     // Catch: luaj.d -> L9
            luaj.LuaTable r2 = r0.L1(r3)     // Catch: luaj.d -> L9
            return r2
        L9:
            r3 = move-exception
            luaj.d r2 = r1.y(r2, r3)
            throw r2
    }

    public luaj.LuaValue d0(int r2, luaj.LuaValue r3) {
            r1 = this;
            if (r2 <= 0) goto Lc
            int r0 = r1.U()
            if (r2 > r0) goto Lc
            luaj.LuaValue r3 = r1.v(r2)
        Lc:
            return r3
    }

    public abstract luaj.Varargs e0(int r1);

    public boolean f0(int r1) {
            r0 = this;
            luaj.LuaValue r1 = r0.v(r1)
            boolean r1 = r1.w2()
            return r1
    }

    public java.lang.String g0() {
            r5 = this;
            f.a r0 = new f.a
            r0.<init>()
            java.lang.String r1 = "("
            r0.b(r1)
            int r1 = r5.U()
            r2 = 1
            r3 = 1
        L10:
            if (r3 > r1) goto L27
            if (r3 <= r2) goto L19
            java.lang.String r4 = ","
            r0.b(r4)
        L19:
            luaj.LuaValue r4 = r5.v(r3)
            java.lang.String r4 = r4.g0()
            r0.b(r4)
            int r3 = r3 + 1
            goto L10
        L27:
            java.lang.String r1 = ")"
            r0.b(r1)
            java.lang.String r0 = r0.k()
            return r0
    }

    public java.lang.String h0(int r1) {
            r0 = this;
            luaj.LuaValue r1 = r0.v(r1)
            java.lang.String r1 = r1.g0()
            return r1
    }

    public long i0(int r3) {
            r2 = this;
            luaj.LuaValue r3 = r2.v(r3)
            long r0 = r3.z2()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.g0()
            return r0
    }

    public abstract luaj.LuaValue v(int r1);

    public abstract luaj.LuaValue w();

    public void x(boolean r1, int r2, java.lang.String r3) {
            r0 = this;
            if (r1 != 0) goto L5
            luaj.LuaValue.k0(r2, r3)
        L5:
            return
    }

    public boolean z(int r2) {
            r1 = this;
            luaj.LuaValue r0 = r1.v(r2)     // Catch: luaj.d -> L9
            boolean r2 = r0.v0()     // Catch: luaj.d -> L9
            return r2
        L9:
            r0 = move-exception
            luaj.d r2 = r1.y(r2, r0)
            throw r2
    }
}
