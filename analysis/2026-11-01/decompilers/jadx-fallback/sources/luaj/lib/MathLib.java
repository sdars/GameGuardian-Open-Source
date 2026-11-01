package luaj.lib;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class MathLib extends luaj.lib.TwoArgFunction {

    protected static abstract class BinaryOp extends luaj.lib.TwoArgFunction {
        protected BinaryOp() {
                r0 = this;
                r0.<init>()
                return
        }

        protected abstract double X2(double r1, double r3);

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r3, luaj.LuaValue r4) {
                r2 = this;
                r0 = 1
                double r0 = luaj.lib.MathLib.X2(r2, r0, r3)
                r3 = 2
                double r3 = luaj.lib.MathLib.X2(r2, r3, r4)
                double r3 = r2.X2(r0, r3)
                luaj.LuaNumber r3 = luaj.LuaValue.J2(r3)
                return r3
        }
    }

    protected static abstract class UnaryOp extends luaj.lib.OneArgFunction {
        protected UnaryOp() {
                r0 = this;
                r0.<init>()
                return
        }

        protected abstract double X2(double r1);

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r3) {
                r2 = this;
                r0 = 1
                double r0 = luaj.lib.MathLib.X2(r2, r0, r3)
                double r0 = r2.X2(r0)
                luaj.LuaNumber r3 = luaj.LuaValue.J2(r0)
                return r3
        }
    }

    static final class abs extends luaj.lib.OneArgFunction {
        abs() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r3) {
                r2 = this;
                boolean r0 = r3.j1()
                if (r0 == 0) goto L13
                long r0 = r3.z2()
                long r0 = java.lang.Math.abs(r0)
                luaj.LuaLong r3 = luaj.LuaValue.I2(r0)
                goto L20
            L13:
                r0 = 1
                double r0 = luaj.lib.MathLib.X2(r2, r0, r3)
                double r0 = java.lang.Math.abs(r0)
                luaj.LuaNumber r3 = luaj.LuaValue.J2(r0)
            L20:
                return r3
        }
    }

    static final class acos extends luaj.lib.MathLib.UnaryOp {
        acos() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double r1) {
                r0 = this;
                double r1 = java.lang.Math.acos(r1)
                return r1
        }
    }

    static final class asin extends luaj.lib.MathLib.UnaryOp {
        asin() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double r1) {
                r0 = this;
                double r1 = java.lang.Math.asin(r1)
                return r1
        }
    }

    static final class atan2 extends luaj.lib.TwoArgFunction {
        atan2() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r5, luaj.LuaValue r6) {
                r4 = this;
                r0 = 1
                double r0 = luaj.lib.MathLib.X2(r4, r0, r5)
                r5 = 2
                r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r5 = luaj.lib.MathLib.a3(r4, r5, r6, r2)
                double r5 = java.lang.Math.atan2(r0, r5)
                luaj.LuaNumber r5 = luaj.LuaValue.J2(r5)
                return r5
        }
    }

    static final class ceil extends luaj.lib.MathLib.UnaryOp {
        ceil() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double r1) {
                r0 = this;
                double r1 = java.lang.Math.ceil(r1)
                return r1
        }
    }

    static final class cos extends luaj.lib.MathLib.UnaryOp {
        cos() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double r1) {
                r0 = this;
                double r1 = java.lang.Math.cos(r1)
                return r1
        }
    }

    static final class cosh extends luaj.lib.MathLib.UnaryOp {
        cosh() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double r1) {
                r0 = this;
                double r1 = java.lang.Math.cosh(r1)
                return r1
        }
    }

    static final class deg extends luaj.lib.MathLib.UnaryOp {
        deg() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double r1) {
                r0 = this;
                double r1 = java.lang.Math.toDegrees(r1)
                return r1
        }
    }

    static final class exp extends luaj.lib.MathLib.UnaryOp {
        exp() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double r1) {
                r0 = this;
                double r1 = java.lang.Math.exp(r1)
                return r1
        }
    }

    static final class floor extends luaj.lib.MathLib.UnaryOp {
        floor() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double r1) {
                r0 = this;
                double r1 = java.lang.Math.floor(r1)
                return r1
        }
    }

    static final class fmod extends luaj.lib.TwoArgFunction {
        fmod() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r3, luaj.LuaValue r4) {
                r2 = this;
                boolean r0 = r3.j1()
                if (r0 == 0) goto L1a
                boolean r0 = r4.j1()
                if (r0 == 0) goto L1a
                long r0 = r3.z2()
                long r3 = r4.z2()
                long r0 = r0 % r3
                luaj.LuaLong r3 = luaj.LuaValue.I2(r0)
                return r3
            L1a:
                r0 = 1
                double r0 = luaj.lib.MathLib.X2(r2, r0, r3)
                r3 = 2
                double r3 = luaj.lib.MathLib.X2(r2, r3, r4)
                double r0 = r0 % r3
                luaj.LuaNumber r3 = luaj.LuaValue.J2(r0)
                return r3
        }
    }

    static class frexp extends luaj.lib.VarArgFunction {
        frexp() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r7) {
                r6 = this;
                r0 = 1
                double r0 = r7.B(r0)
                r2 = 0
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 != 0) goto L12
                luaj.LuaNumber r7 = luaj.LuaValue.f1675g
                luaj.Varargs r7 = luaj.LuaValue.N2(r7, r7)
                return r7
            L12:
                long r0 = java.lang.Double.doubleToLongBits(r0)
                r2 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
                long r2 = r2 & r0
                r4 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
                long r2 = r2 + r4
                double r2 = (double) r2
                r4 = 0
                int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r7 < 0) goto L29
                r4 = 4368491638549381120(0x3ca0000000000000, double:1.1102230246251565E-16)
                goto L2b
            L29:
                r4 = -4854880398305394688(0xbca0000000000000, double:-1.1102230246251565E-16)
            L2b:
                double r2 = r2 * r4
                r7 = 52
                long r0 = r0 >> r7
                int r7 = (int) r0
                r7 = r7 & 2047(0x7ff, float:2.868E-42)
                int r7 = r7 + (-1022)
                double r0 = (double) r7
                luaj.LuaNumber r7 = luaj.LuaValue.J2(r2)
                luaj.LuaNumber r0 = luaj.LuaValue.J2(r0)
                luaj.Varargs r7 = luaj.LuaValue.N2(r7, r0)
                return r7
        }
    }

    static final class ldexp extends luaj.lib.MathLib.BinaryOp {
        ldexp() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.MathLib.BinaryOp
        protected double X2(double r3, double r5) {
                r2 = this;
                long r5 = (long) r5
                r0 = 1023(0x3ff, double:5.054E-321)
                long r5 = r5 + r0
                r0 = 52
                long r5 = r5 << r0
                double r5 = java.lang.Double.longBitsToDouble(r5)
                double r3 = r3 * r5
                return r3
        }
    }

    static final class log extends luaj.lib.TwoArgFunction {
        log() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r6, luaj.LuaValue r7) {
                r5 = this;
                r0 = 1
                double r0 = luaj.lib.MathLib.X2(r5, r0, r6)
                double r0 = java.lang.Math.log(r0)
                r6 = 2
                r2 = 4613303445314885481(0x4005bf0a8b145769, double:2.718281828459045)
                double r6 = luaj.lib.MathLib.a3(r5, r6, r7, r2)
                int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r4 == 0) goto L1c
                double r6 = java.lang.Math.log(r6)
                double r0 = r0 / r6
            L1c:
                luaj.LuaNumber r6 = luaj.LuaValue.J2(r0)
                return r6
        }
    }

    static class max extends luaj.lib.VarArgFunction {
        max() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r6) {
                r5 = this;
                r0 = 1
                luaj.LuaValue r0 = r6.K(r0)
                int r1 = r6.U()
                r2 = 2
            La:
                if (r2 > r1) goto L1a
                luaj.LuaValue r3 = r6.K(r2)
                boolean r4 = r0.u1(r3)
                if (r4 == 0) goto L17
                r0 = r3
            L17:
                int r2 = r2 + 1
                goto La
            L1a:
                return r0
        }
    }

    static class min extends luaj.lib.VarArgFunction {
        min() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r6) {
                r5 = this;
                r0 = 1
                luaj.LuaValue r0 = r6.K(r0)
                int r1 = r6.U()
                r2 = 2
            La:
                if (r2 > r1) goto L1a
                luaj.LuaValue r3 = r6.K(r2)
                boolean r4 = r3.u1(r0)
                if (r4 == 0) goto L17
                r0 = r3
            L17:
                int r2 = r2 + 1
                goto La
            L1a:
                return r0
        }
    }

    static class modf extends luaj.lib.VarArgFunction {
        modf() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs r8) {
                r7 = this;
                luaj.LuaValue r8 = r8.w()
                boolean r0 = r8.k1()
                r1 = 0
                if (r0 == 0) goto L15
            Lc:
                luaj.LuaNumber r0 = luaj.LuaValue.J2(r1)
                luaj.Varargs r8 = luaj.LuaValue.N2(r8, r0)
                return r8
            L15:
                double r3 = r8.x0()
                int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r8 <= 0) goto L22
                double r5 = java.lang.Math.floor(r3)
                goto L26
            L22:
                double r5 = java.lang.Math.ceil(r3)
            L26:
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 != 0) goto L2b
                goto L2d
            L2b:
                double r1 = r3 - r5
            L2d:
                luaj.LuaNumber r8 = luaj.LuaValue.J2(r5)
                goto Lc
        }
    }

    static final class pow extends luaj.lib.MathLib.BinaryOp {
        pow() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.MathLib.BinaryOp
        protected double X2(double r1, double r3) {
                r0 = this;
                double r1 = java.lang.Math.pow(r1, r3)
                return r1
        }
    }

    static final class rad extends luaj.lib.MathLib.UnaryOp {
        rad() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double r1) {
                r0 = this;
                double r1 = java.lang.Math.toRadians(r1)
                return r1
        }
    }

    static class random extends luaj.lib.LibFunction {
        java.util.Random T;

        random() {
                r1 = this;
                r1.<init>()
                java.util.Random r0 = new java.util.Random
                r0.<init>()
                r1.T = r0
                return
        }

        private long X2() {
                r5 = this;
                java.util.Random r0 = r5.T
                long r0 = r0.nextLong()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto Lf
                r2 = -9223372036854775808
                long r0 = r0 + r2
            Lf:
                return r0
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call() {
                r2 = this;
                java.util.Random r0 = r2.T
                double r0 = r0.nextDouble()
                luaj.LuaNumber r0 = luaj.LuaValue.J2(r0)
                return r0
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r7) {
                r6 = this;
                long r0 = r7.C0()
                r2 = 1
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 >= 0) goto L10
                r7 = 1
                java.lang.String r4 = "interval is empty"
                luaj.LuaValue.k0(r7, r4)
            L10:
                long r4 = r6.X2()
                long r4 = r4 % r0
                long r4 = r4 + r2
                luaj.LuaLong r7 = luaj.LuaValue.I2(r4)
                return r7
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r8, luaj.LuaValue r9) {
                r7 = this;
                long r0 = r8.C0()
                long r8 = r9.C0()
                r2 = 2
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 >= 0) goto L12
                java.lang.String r3 = "interval is empty"
                luaj.LuaValue.k0(r2, r3)
            L12:
                long r8 = r8 - r0
                r3 = 0
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 >= 0) goto L1e
                java.lang.String r3 = "interval too large"
                luaj.LuaValue.k0(r2, r3)
            L1e:
                long r2 = r7.X2()
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r6 == 0) goto L2f
                r4 = 1
                long r8 = r8 + r4
                long r2 = r2 % r8
            L2f:
                long r0 = r0 + r2
                luaj.LuaLong r8 = luaj.LuaValue.I2(r0)
                return r8
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r1, luaj.LuaValue r2, luaj.LuaValue r3) {
                r0 = this;
                r1 = 3
                java.lang.String r2 = "too many arguments"
                luaj.LuaValue r1 = luaj.LuaValue.k0(r1, r2)
                return r1
        }
    }

    static class randomseed extends luaj.lib.OneArgFunction {
        final luaj.lib.MathLib.random T;

        randomseed(luaj.lib.MathLib.random r1) {
                r0 = this;
                r0.<init>()
                r0.T = r1
                return
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r4) {
                r3 = this;
                r0 = 1
                long r0 = luaj.lib.MathLib.Y2(r3, r0, r4)
                luaj.lib.MathLib$random r4 = r3.T
                java.util.Random r2 = new java.util.Random
                r2.<init>(r0)
                r4.T = r2
                luaj.LuaValue r4 = luaj.LuaValue.f1674f
                return r4
        }
    }

    static final class sin extends luaj.lib.MathLib.UnaryOp {
        sin() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double r1) {
                r0 = this;
                double r1 = java.lang.Math.sin(r1)
                return r1
        }
    }

    static final class sinh extends luaj.lib.MathLib.UnaryOp {
        sinh() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double r1) {
                r0 = this;
                double r1 = java.lang.Math.sinh(r1)
                return r1
        }
    }

    static final class sqrt extends luaj.lib.MathLib.UnaryOp {
        sqrt() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double r1) {
                r0 = this;
                double r1 = java.lang.Math.sqrt(r1)
                return r1
        }
    }

    static final class tan extends luaj.lib.MathLib.UnaryOp {
        tan() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double r1) {
                r0 = this;
                double r1 = java.lang.Math.tan(r1)
                return r1
        }
    }

    static final class tanh extends luaj.lib.MathLib.UnaryOp {
        tanh() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double r1) {
                r0 = this;
                double r1 = java.lang.Math.tanh(r1)
                return r1
        }
    }

    static final class tointeger extends luaj.lib.OneArgFunction {
        tointeger() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r3) {
                r2 = this;
                boolean r0 = r3.k1()
                if (r0 == 0) goto Lf
                long r0 = r3.z2()
                luaj.LuaLong r3 = luaj.LuaValue.I2(r0)
                goto L11
            Lf:
                luaj.LuaValue r3 = luaj.LuaValue.f1671c
            L11:
                return r3
        }
    }

    static final class type extends luaj.lib.OneArgFunction {
        type() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r2) {
                r1 = this;
                boolean r0 = r2 instanceof luaj.LuaLong
                if (r0 == 0) goto Lb
                java.lang.String r2 = "integer"
            L6:
                luaj.LuaString r2 = luaj.LuaValue.K2(r2)
                return r2
            Lb:
                boolean r2 = r2 instanceof luaj.LuaDouble
                if (r2 == 0) goto L12
                java.lang.String r2 = "float"
                goto L6
            L12:
                luaj.LuaValue r2 = luaj.LuaValue.f1671c
                return r2
        }
    }

    static final class ult extends luaj.lib.TwoArgFunction {
        ult() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue r9, luaj.LuaValue r10) {
                r8 = this;
                r0 = 1
                long r1 = luaj.lib.MathLib.Y2(r8, r0, r9)
                r9 = 2
                long r9 = luaj.lib.MathLib.Y2(r8, r9, r10)
                r3 = 0
                int r4 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
                if (r4 >= 0) goto L11
                r4 = 1
                goto L12
            L11:
                r4 = 0
            L12:
                r5 = 0
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 >= 0) goto L1a
                r1 = 1
                goto L1b
            L1a:
                r1 = 0
            L1b:
                r1 = r1 ^ r4
                int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r2 >= 0) goto L21
                goto L22
            L21:
                r0 = 0
            L22:
                r9 = r1 ^ r0
                if (r9 == 0) goto L29
                luaj.LuaBoolean r9 = luaj.LuaValue.f1672d
                goto L2b
            L29:
                luaj.LuaBoolean r9 = luaj.LuaValue.f1673e
            L2b:
                return r9
        }
    }

    public MathLib() {
            r0 = this;
            r0.<init>()
            return
    }

    static double X2(luaj.lib.LibFunction r0, int r1, luaj.LuaValue r2) {
            double r0 = r2.x0()     // Catch: luaj.d -> L5
            return r0
        L5:
            r2 = move-exception
            java.lang.String r0 = Z2(r0)
            java.lang.String r2 = r2.getMessage()
            luaj.LuaValue.l0(r1, r0, r2)
            r0 = 0
            return r0
    }

    static long Y2(luaj.lib.LibFunction r0, int r1, luaj.LuaValue r2) {
            long r0 = r2.C0()     // Catch: luaj.d -> L5
            return r0
        L5:
            r2 = move-exception
            java.lang.String r0 = Z2(r0)
            java.lang.String r2 = r2.getMessage()
            luaj.LuaValue.l0(r1, r0, r2)
            r0 = 0
            return r0
    }

    static java.lang.String Z2(luaj.lib.LibFunction r2) {
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<luaj.lib.MathLib> r1 = luaj.lib.MathLib.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 36
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "math."
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    static double a3(luaj.lib.LibFunction r0, int r1, luaj.LuaValue r2, double r3) {
            double r0 = r2.F1(r3)     // Catch: luaj.d -> L5
            return r0
        L5:
            r2 = move-exception
            java.lang.String r0 = Z2(r0)
            java.lang.String r2 = r2.getMessage()
            luaj.LuaValue.l0(r1, r0, r2)
            r0 = 0
            return r0
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue r4, luaj.LuaValue r5) {
            r3 = this;
            luaj.LuaTable r4 = new luaj.LuaTable
            r0 = 0
            r1 = 64
            r4.<init>(r0, r1)
            luaj.lib.MathLib$abs r0 = new luaj.lib.MathLib$abs
            r0.<init>()
            java.lang.String r1 = "abs"
            r4.i2(r1, r0)
            luaj.lib.MathLib$acos r0 = new luaj.lib.MathLib$acos
            r0.<init>()
            java.lang.String r1 = "acos"
            r4.i2(r1, r0)
            luaj.lib.MathLib$asin r0 = new luaj.lib.MathLib$asin
            r0.<init>()
            java.lang.String r1 = "asin"
            r4.i2(r1, r0)
            luaj.lib.MathLib$atan2 r0 = new luaj.lib.MathLib$atan2
            r0.<init>()
            java.lang.String r1 = "atan"
            r4.i2(r1, r0)
            java.lang.String r1 = "atan2"
            r4.i2(r1, r0)
            luaj.lib.MathLib$ceil r0 = new luaj.lib.MathLib$ceil
            r0.<init>()
            java.lang.String r1 = "ceil"
            r4.i2(r1, r0)
            luaj.lib.MathLib$cos r0 = new luaj.lib.MathLib$cos
            r0.<init>()
            java.lang.String r1 = "cos"
            r4.i2(r1, r0)
            luaj.lib.MathLib$cosh r0 = new luaj.lib.MathLib$cosh
            r0.<init>()
            java.lang.String r1 = "cosh"
            r4.i2(r1, r0)
            luaj.lib.MathLib$deg r0 = new luaj.lib.MathLib$deg
            r0.<init>()
            java.lang.String r1 = "deg"
            r4.i2(r1, r0)
            luaj.lib.MathLib$exp r0 = new luaj.lib.MathLib$exp
            r0.<init>()
            java.lang.String r1 = "exp"
            r4.i2(r1, r0)
            luaj.lib.MathLib$floor r0 = new luaj.lib.MathLib$floor
            r0.<init>()
            java.lang.String r1 = "floor"
            r4.i2(r1, r0)
            luaj.lib.MathLib$fmod r0 = new luaj.lib.MathLib$fmod
            r0.<init>()
            java.lang.String r1 = "fmod"
            r4.i2(r1, r0)
            luaj.lib.MathLib$frexp r0 = new luaj.lib.MathLib$frexp
            r0.<init>()
            java.lang.String r1 = "frexp"
            r4.i2(r1, r0)
            java.lang.String r0 = "huge"
            luaj.LuaDouble r1 = luaj.LuaDouble.S
            r4.i2(r0, r1)
            luaj.lib.MathLib$ldexp r0 = new luaj.lib.MathLib$ldexp
            r0.<init>()
            java.lang.String r1 = "ldexp"
            r4.i2(r1, r0)
            luaj.lib.MathLib$log r0 = new luaj.lib.MathLib$log
            r0.<init>()
            java.lang.String r1 = "log"
            r4.i2(r1, r0)
            luaj.lib.MathLib$max r0 = new luaj.lib.MathLib$max
            r0.<init>()
            java.lang.String r1 = "max"
            r4.i2(r1, r0)
            java.lang.String r0 = "maxinteger"
            luaj.LuaLong r1 = luaj.LuaLong.R
            r4.i2(r0, r1)
            luaj.lib.MathLib$min r0 = new luaj.lib.MathLib$min
            r0.<init>()
            java.lang.String r1 = "min"
            r4.i2(r1, r0)
            java.lang.String r0 = "mininteger"
            luaj.LuaLong r1 = luaj.LuaLong.S
            r4.i2(r0, r1)
            luaj.lib.MathLib$modf r0 = new luaj.lib.MathLib$modf
            r0.<init>()
            java.lang.String r1 = "modf"
            r4.i2(r1, r0)
            java.lang.String r0 = "pi"
            r1 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            r4.f2(r0, r1)
            luaj.lib.MathLib$pow r0 = new luaj.lib.MathLib$pow
            r0.<init>()
            java.lang.String r1 = "pow"
            r4.i2(r1, r0)
            luaj.lib.MathLib$random r0 = new luaj.lib.MathLib$random
            r0.<init>()
            java.lang.String r1 = "random"
            r4.i2(r1, r0)
            luaj.lib.MathLib$randomseed r1 = new luaj.lib.MathLib$randomseed
            r1.<init>(r0)
            java.lang.String r0 = "randomseed"
            r4.i2(r0, r1)
            luaj.lib.MathLib$rad r0 = new luaj.lib.MathLib$rad
            r0.<init>()
            java.lang.String r1 = "rad"
            r4.i2(r1, r0)
            luaj.lib.MathLib$sin r0 = new luaj.lib.MathLib$sin
            r0.<init>()
            java.lang.String r1 = "sin"
            r4.i2(r1, r0)
            luaj.lib.MathLib$sinh r0 = new luaj.lib.MathLib$sinh
            r0.<init>()
            java.lang.String r1 = "sinh"
            r4.i2(r1, r0)
            luaj.lib.MathLib$sqrt r0 = new luaj.lib.MathLib$sqrt
            r0.<init>()
            java.lang.String r1 = "sqrt"
            r4.i2(r1, r0)
            luaj.lib.MathLib$tan r0 = new luaj.lib.MathLib$tan
            r0.<init>()
            java.lang.String r1 = "tan"
            r4.i2(r1, r0)
            luaj.lib.MathLib$tanh r0 = new luaj.lib.MathLib$tanh
            r0.<init>()
            java.lang.String r1 = "tanh"
            r4.i2(r1, r0)
            luaj.lib.MathLib$tointeger r0 = new luaj.lib.MathLib$tointeger
            r0.<init>()
            java.lang.String r1 = "tointeger"
            r4.i2(r1, r0)
            luaj.lib.MathLib$type r0 = new luaj.lib.MathLib$type
            r0.<init>()
            java.lang.String r1 = "type"
            r4.i2(r1, r0)
            luaj.lib.MathLib$ult r0 = new luaj.lib.MathLib$ult
            r0.<init>()
            java.lang.String r1 = "ult"
            r4.i2(r1, r0)
            java.lang.String r0 = "math"
            r5.i2(r0, r4)
            java.lang.String r1 = "package"
            luaj.LuaValue r2 = r5.T0(r1)
            boolean r2 = r2.l1()
            if (r2 != 0) goto L16c
            luaj.LuaValue r5 = r5.T0(r1)
            java.lang.String r1 = "loaded"
            luaj.LuaValue r5 = r5.T0(r1)
            r5.i2(r0, r4)
        L16c:
            return r4
    }
}
