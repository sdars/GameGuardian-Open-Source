package luaj.lib;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class Bit32Lib extends luaj.lib.TwoArgFunction {

    static final class Bit32Lib2 extends luaj.lib.TwoArgFunction {
        Bit32Lib2() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r3, luaj.LuaValue r4) {
                r2 = this;
                int r0 = r2.R
                if (r0 == 0) goto L4f
                r1 = 1
                if (r0 == r1) goto L40
                r1 = 2
                if (r0 == r1) goto L31
                r1 = 3
                if (r0 == r1) goto L22
                r1 = 4
                if (r0 == r1) goto L13
                luaj.LuaValue r3 = luaj.LuaValue.f1671c
                return r3
            L13:
                long r0 = r3.C0()
                int r3 = (int) r0
                long r0 = r4.C0()
                int r4 = (int) r0
                luaj.LuaValue r3 = luaj.lib.Bit32Lib.j3(r3, r4)
                return r3
            L22:
                long r0 = r3.C0()
                int r3 = (int) r0
                long r0 = r4.C0()
                int r4 = (int) r0
                luaj.LuaValue r3 = luaj.lib.Bit32Lib.i3(r3, r4)
                return r3
            L31:
                long r0 = r3.C0()
                int r3 = (int) r0
                long r0 = r4.C0()
                int r4 = (int) r0
                luaj.LuaValue r3 = luaj.lib.Bit32Lib.g3(r3, r4)
                return r3
            L40:
                long r0 = r3.C0()
                int r3 = (int) r0
                long r0 = r4.C0()
                int r4 = (int) r0
                luaj.LuaValue r3 = luaj.lib.Bit32Lib.f3(r3, r4)
                return r3
            L4f:
                long r0 = r3.C0()
                int r3 = (int) r0
                long r0 = r4.C0()
                int r4 = (int) r0
                luaj.LuaValue r3 = luaj.lib.Bit32Lib.X2(r3, r4)
                return r3
        }
    }

    static final class Bit32LibV extends luaj.lib.VarArgFunction {
        Bit32LibV() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r8) {
                r7 = this;
                int r0 = r7.R
                r1 = 1
                r3 = 3
                r4 = 2
                r5 = 1
                switch(r0) {
                    case 0: goto L4f;
                    case 1: goto L4a;
                    case 2: goto L45;
                    case 3: goto L40;
                    case 4: goto L3b;
                    case 5: goto L27;
                    case 6: goto Ld;
                    default: goto La;
                }
            La:
                luaj.LuaValue r8 = luaj.LuaValue.f1671c
                return r8
            Ld:
                long r5 = r8.F(r5)
                int r0 = (int) r5
                long r4 = r8.F(r4)
                int r5 = (int) r4
                long r3 = r8.F(r3)
                int r4 = (int) r3
                r3 = 4
                long r1 = r8.a0(r3, r1)
                int r8 = (int) r1
                luaj.LuaValue r8 = luaj.lib.Bit32Lib.h3(r0, r5, r4, r8)
                return r8
            L27:
                long r5 = r8.F(r5)
                int r0 = (int) r5
                long r4 = r8.F(r4)
                int r5 = (int) r4
                long r1 = r8.a0(r3, r1)
                int r8 = (int) r1
                luaj.LuaValue r8 = luaj.lib.Bit32Lib.e3(r0, r5, r8)
                return r8
            L3b:
                luaj.Varargs r8 = luaj.lib.Bit32Lib.d3(r8)
                return r8
            L40:
                luaj.Varargs r8 = luaj.lib.Bit32Lib.c3(r8)
                return r8
            L45:
                luaj.Varargs r8 = luaj.lib.Bit32Lib.b3(r8)
                return r8
            L4a:
                luaj.Varargs r8 = luaj.lib.Bit32Lib.a3(r8)
                return r8
            L4f:
                luaj.Varargs r8 = luaj.lib.Bit32Lib.Y2(r8)
                return r8
        }
    }

    class a implements luaj.lib.LibFunction.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ luaj.lib.Bit32Lib f1745a;

        a(luaj.lib.Bit32Lib r1) {
                r0 = this;
                r0.f1745a = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.LibFunction.a
        public luaj.lib.LibFunction a() {
                r1 = this;
                luaj.lib.Bit32Lib$Bit32LibV r0 = new luaj.lib.Bit32Lib$Bit32LibV
                r0.<init>()
                return r0
        }
    }

    class b implements luaj.lib.LibFunction.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ luaj.lib.Bit32Lib f1746a;

        b(luaj.lib.Bit32Lib r1) {
                r0 = this;
                r0.f1746a = r1
                r0.<init>()
                return
        }

        @Override // luaj.lib.LibFunction.a
        public luaj.lib.LibFunction a() {
                r1 = this;
                luaj.lib.Bit32Lib$Bit32Lib2 r0 = new luaj.lib.Bit32Lib$Bit32Lib2
                r0.<init>()
                return r0
        }
    }

    public Bit32Lib() {
            r0 = this;
            r0.<init>()
            return
    }

    static luaj.LuaValue X2(int r0, int r1) {
            if (r1 < 0) goto L8
            int r0 = r0 >> r1
        L3:
            luaj.LuaValue r0 = Z2(r0)
            return r0
        L8:
            int r1 = -r1
            int r0 = r0 << r1
            goto L3
    }

    static luaj.Varargs Y2(luaj.Varargs r4) {
            r0 = -1
            r1 = 1
        L2:
            int r2 = r4.U()
            if (r1 > r2) goto L11
            long r2 = r4.F(r1)
            int r3 = (int) r2
            r0 = r0 & r3
            int r1 = r1 + 1
            goto L2
        L11:
            luaj.LuaValue r4 = Z2(r0)
            return r4
    }

    private static luaj.LuaValue Z2(int r4) {
            long r0 = (long) r4
            if (r4 >= 0) goto L9
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
        L9:
            luaj.LuaLong r4 = luaj.LuaValue.I2(r0)
            return r4
    }

    static luaj.Varargs a3(luaj.Varargs r2) {
            r0 = 1
            long r0 = r2.F(r0)
            int r2 = (int) r0
            int r2 = ~r2
            luaj.LuaValue r2 = Z2(r2)
            return r2
    }

    static luaj.Varargs b3(luaj.Varargs r4) {
            r0 = 0
            r1 = 1
        L2:
            int r2 = r4.U()
            if (r1 > r2) goto L11
            long r2 = r4.F(r1)
            int r3 = (int) r2
            r0 = r0 | r3
            int r1 = r1 + 1
            goto L2
        L11:
            luaj.LuaValue r4 = Z2(r0)
            return r4
    }

    static luaj.Varargs c3(luaj.Varargs r5) {
            r0 = -1
            r1 = 1
            r2 = 1
        L3:
            int r3 = r5.U()
            if (r2 > r3) goto L12
            long r3 = r5.F(r2)
            int r4 = (int) r3
            r0 = r0 & r4
            int r2 = r2 + 1
            goto L3
        L12:
            if (r0 == 0) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            luaj.LuaBoolean r5 = luaj.LuaValue.H2(r1)
            return r5
    }

    static luaj.Varargs d3(luaj.Varargs r4) {
            r0 = 0
            r1 = 1
        L2:
            int r2 = r4.U()
            if (r1 > r2) goto L11
            long r2 = r4.F(r1)
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r1 = r1 + 1
            goto L2
        L11:
            luaj.LuaValue r4 = Z2(r0)
            return r4
    }

    static luaj.LuaValue e3(int r2, int r3, int r4) {
            if (r3 >= 0) goto L8
            r0 = 2
            java.lang.String r1 = "field cannot be negative"
            luaj.LuaValue.k0(r0, r1)
        L8:
            if (r4 >= 0) goto L10
            r0 = 3
            java.lang.String r1 = "width must be postive"
            luaj.LuaValue.k0(r0, r1)
        L10:
            int r0 = r3 + r4
            r1 = 32
            if (r0 <= r1) goto L1b
            java.lang.String r0 = "trying to access non-existent bits"
            luaj.LuaValue.R0(r0)
        L1b:
            int r2 = r2 >>> r3
            r3 = -1
            int r1 = r1 - r4
            int r3 = r3 >>> r1
            r2 = r2 & r3
            luaj.LuaValue r2 = Z2(r2)
            return r2
    }

    static luaj.LuaValue f3(int r1, int r2) {
            if (r2 >= 0) goto L8
            int r2 = -r2
            luaj.LuaValue r1 = i3(r1, r2)
            return r1
        L8:
            r2 = r2 & 31
            int r0 = r1 << r2
            int r2 = 32 - r2
            int r1 = r1 >>> r2
            r1 = r1 | r0
            luaj.LuaValue r1 = Z2(r1)
            return r1
    }

    static luaj.LuaValue g3(int r1, int r2) {
            r0 = 32
            if (r2 >= r0) goto L14
            r0 = -32
            if (r2 > r0) goto L9
            goto L14
        L9:
            if (r2 < 0) goto L11
            int r1 = r1 << r2
        Lc:
            luaj.LuaValue r1 = Z2(r1)
            return r1
        L11:
            int r2 = -r2
            int r1 = r1 >>> r2
            goto Lc
        L14:
            luaj.LuaNumber r1 = luaj.LuaValue.f1675g
            return r1
    }

    static luaj.LuaValue h3(int r2, int r3, int r4, int r5) {
            if (r4 >= 0) goto L8
            r0 = 3
            java.lang.String r1 = "field cannot be negative"
            luaj.LuaValue.k0(r0, r1)
        L8:
            if (r5 >= 0) goto L10
            r0 = 4
            java.lang.String r1 = "width must be postive"
            luaj.LuaValue.k0(r0, r1)
        L10:
            int r0 = r4 + r5
            r1 = 32
            if (r0 <= r1) goto L1b
            java.lang.String r0 = "trying to access non-existent bits"
            luaj.LuaValue.R0(r0)
        L1b:
            r0 = -1
            int r1 = r1 - r5
            int r5 = r0 >>> r1
            int r5 = r5 << r4
            int r0 = ~r5
            r2 = r2 & r0
            int r3 = r3 << r4
            r3 = r3 & r5
            r2 = r2 | r3
            luaj.LuaValue r2 = Z2(r2)
            return r2
    }

    static luaj.LuaValue i3(int r1, int r2) {
            if (r2 >= 0) goto L8
            int r2 = -r2
            luaj.LuaValue r1 = f3(r1, r2)
            return r1
        L8:
            r2 = r2 & 31
            int r0 = r1 >>> r2
            int r2 = 32 - r2
            int r1 = r1 << r2
            r1 = r1 | r0
            luaj.LuaValue r1 = Z2(r1)
            return r1
    }

    static luaj.LuaValue j3(int r1, int r2) {
            r0 = 32
            if (r2 >= r0) goto L14
            r0 = -32
            if (r2 > r0) goto L9
            goto L14
        L9:
            if (r2 < 0) goto L11
            int r1 = r1 >>> r2
        Lc:
            luaj.LuaValue r1 = Z2(r1)
            return r1
        L11:
            int r2 = -r2
            int r1 = r1 << r2
            goto Lc
        L14:
            luaj.LuaNumber r1 = luaj.LuaValue.f1675g
            return r1
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r9, luaj.LuaValue r10) {
            r8 = this;
            luaj.LuaTable r9 = new luaj.LuaTable
            r9.<init>()
            luaj.lib.Bit32Lib$a r0 = new luaj.lib.Bit32Lib$a
            r0.<init>(r8)
            java.lang.String r1 = "band"
            java.lang.String r2 = "bnot"
            java.lang.String r3 = "bor"
            java.lang.String r4 = "btest"
            java.lang.String r5 = "bxor"
            java.lang.String r6 = "extract"
            java.lang.String r7 = "replace"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7}
            r8.V2(r9, r0, r1)
            luaj.lib.Bit32Lib$b r0 = new luaj.lib.Bit32Lib$b
            r0.<init>(r8)
            java.lang.String r1 = "rrotate"
            java.lang.String r2 = "rshift"
            java.lang.String r3 = "arshift"
            java.lang.String r4 = "lrotate"
            java.lang.String r5 = "lshift"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r5, r1, r2}
            r8.V2(r9, r0, r1)
            java.lang.String r0 = "bit32"
            r10.i2(r0, r9)
            java.lang.String r1 = "package"
            luaj.LuaValue r2 = r10.T0(r1)
            boolean r2 = r2.l1()
            if (r2 != 0) goto L53
            luaj.LuaValue r10 = r10.T0(r1)
            java.lang.String r1 = "loaded"
            luaj.LuaValue r10 = r10.T0(r1)
            r10.i2(r0, r9)
        L53:
            return r9
    }
}
