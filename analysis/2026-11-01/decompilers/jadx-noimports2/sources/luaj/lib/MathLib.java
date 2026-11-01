package luaj.lib;

/* JADX INFO: loaded from: classes.dex */
public class MathLib extends luaj.lib.TwoArgFunction {

    protected static abstract class BinaryOp extends luaj.lib.TwoArgFunction {
        protected BinaryOp() {
        }

        protected abstract double X2(double d2, double d3);

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
            return luaj.LuaValue.J2(X2(luaj.lib.MathLib.X2(this, 1, luaValue), luaj.lib.MathLib.X2(this, 2, luaValue2)));
        }
    }

    protected static abstract class UnaryOp extends luaj.lib.OneArgFunction {
        protected UnaryOp() {
        }

        protected abstract double X2(double d2);

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue) {
            return luaj.LuaValue.J2(X2(luaj.lib.MathLib.X2(this, 1, luaValue)));
        }
    }

    static final class abs extends luaj.lib.OneArgFunction {
        abs() {
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue) {
            return luaValue.j1() ? luaj.LuaValue.I2(java.lang.Math.abs(luaValue.z2())) : luaj.LuaValue.J2(java.lang.Math.abs(luaj.lib.MathLib.X2(this, 1, luaValue)));
        }
    }

    static final class acos extends luaj.lib.MathLib.UnaryOp {
        acos() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return java.lang.Math.acos(d2);
        }
    }

    static final class asin extends luaj.lib.MathLib.UnaryOp {
        asin() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return java.lang.Math.asin(d2);
        }
    }

    static final class atan2 extends luaj.lib.TwoArgFunction {
        atan2() {
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
            return luaj.LuaValue.J2(java.lang.Math.atan2(luaj.lib.MathLib.X2(this, 1, luaValue), luaj.lib.MathLib.a3(this, 2, luaValue2, 1.0d)));
        }
    }

    static final class ceil extends luaj.lib.MathLib.UnaryOp {
        ceil() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return java.lang.Math.ceil(d2);
        }
    }

    static final class cos extends luaj.lib.MathLib.UnaryOp {
        cos() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return java.lang.Math.cos(d2);
        }
    }

    static final class cosh extends luaj.lib.MathLib.UnaryOp {
        cosh() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return java.lang.Math.cosh(d2);
        }
    }

    static final class deg extends luaj.lib.MathLib.UnaryOp {
        deg() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return java.lang.Math.toDegrees(d2);
        }
    }

    static final class exp extends luaj.lib.MathLib.UnaryOp {
        exp() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return java.lang.Math.exp(d2);
        }
    }

    static final class floor extends luaj.lib.MathLib.UnaryOp {
        floor() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return java.lang.Math.floor(d2);
        }
    }

    static final class fmod extends luaj.lib.TwoArgFunction {
        fmod() {
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
            return (luaValue.j1() && luaValue2.j1()) ? luaj.LuaValue.I2(luaValue.z2() % luaValue2.z2()) : luaj.LuaValue.J2(luaj.lib.MathLib.X2(this, 1, luaValue) % luaj.lib.MathLib.X2(this, 2, luaValue2));
        }
    }

    static class frexp extends luaj.lib.VarArgFunction {
        frexp() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            double dB = varargs.B(1);
            if (dB == 0.0d) {
                luaj.LuaNumber luaNumber = luaj.LuaValue.f1677g;
                return luaj.LuaValue.N2(luaNumber, luaNumber);
            }
            long jDoubleToLongBits = java.lang.Double.doubleToLongBits(dB);
            return luaj.LuaValue.N2(luaj.LuaValue.J2(((4503599627370495L & jDoubleToLongBits) + 4503599627370496L) * (jDoubleToLongBits >= 0 ? 1.1102230246251565E-16d : -1.1102230246251565E-16d)), luaj.LuaValue.J2((((int) (jDoubleToLongBits >> 52)) & 2047) - 1022));
        }
    }

    static final class ldexp extends luaj.lib.MathLib.BinaryOp {
        ldexp() {
        }

        @Override // luaj.lib.MathLib.BinaryOp
        protected double X2(double d2, double d3) {
            return d2 * java.lang.Double.longBitsToDouble((((long) d3) + 1023) << 52);
        }
    }

    static final class log extends luaj.lib.TwoArgFunction {
        log() {
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
            double dLog = java.lang.Math.log(luaj.lib.MathLib.X2(this, 1, luaValue));
            double dA3 = luaj.lib.MathLib.a3(this, 2, luaValue2, 2.718281828459045d);
            if (dA3 != 2.718281828459045d) {
                dLog /= java.lang.Math.log(dA3);
            }
            return luaj.LuaValue.J2(dLog);
        }
    }

    static class max extends luaj.lib.VarArgFunction {
        max() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaValue luaValueK = varargs.K(1);
            int iU = varargs.U();
            for (int i = 2; i <= iU; i++) {
                luaj.LuaValue luaValueK2 = varargs.K(i);
                if (luaValueK.u1(luaValueK2)) {
                    luaValueK = luaValueK2;
                }
            }
            return luaValueK;
        }
    }

    static class min extends luaj.lib.VarArgFunction {
        min() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaValue luaValueK = varargs.K(1);
            int iU = varargs.U();
            for (int i = 2; i <= iU; i++) {
                luaj.LuaValue luaValueK2 = varargs.K(i);
                if (luaValueK2.u1(luaValueK)) {
                    luaValueK = luaValueK2;
                }
            }
            return luaValueK;
        }
    }

    static class modf extends luaj.lib.VarArgFunction {
        modf() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.Varargs invoke(luaj.Varargs varargs) {
            luaj.LuaValue luaValueW = varargs.w();
            double d2 = 0.0d;
            if (!luaValueW.k1()) {
                double dX0 = luaValueW.x0();
                double dFloor = dX0 > 0.0d ? java.lang.Math.floor(dX0) : java.lang.Math.ceil(dX0);
                d2 = dX0 != dFloor ? dX0 - dFloor : 0.0d;
                luaValueW = luaj.LuaValue.J2(dFloor);
            }
            return luaj.LuaValue.N2(luaValueW, luaj.LuaValue.J2(d2));
        }
    }

    static final class pow extends luaj.lib.MathLib.BinaryOp {
        pow() {
        }

        @Override // luaj.lib.MathLib.BinaryOp
        protected double X2(double d2, double d3) {
            return java.lang.Math.pow(d2, d3);
        }
    }

    static final class rad extends luaj.lib.MathLib.UnaryOp {
        rad() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return java.lang.Math.toRadians(d2);
        }
    }

    static class random extends luaj.lib.LibFunction {
        java.util.Random T = new java.util.Random();

        random() {
        }

        private long X2() {
            long jNextLong = this.T.nextLong();
            return jNextLong < 0 ? jNextLong - Long.MIN_VALUE : jNextLong;
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call() {
            return luaj.LuaValue.J2(this.T.nextDouble());
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue) {
            long jC0 = luaValue.C0();
            if (jC0 < 1) {
                luaj.LuaValue.k0(1, "interval is empty");
            }
            return luaj.LuaValue.I2((X2() % jC0) + 1);
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
            long jC0 = luaValue.C0();
            long jC1 = luaValue2.C0();
            if (jC1 < jC0) {
                luaj.LuaValue.k0(2, "interval is empty");
            }
            long j = jC1 - jC0;
            if (j < 0) {
                luaj.LuaValue.k0(2, "interval too large");
            }
            long jX2 = X2();
            if (j != Long.MAX_VALUE) {
                jX2 %= j + 1;
            }
            return luaj.LuaValue.I2(jC0 + jX2);
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2, luaj.LuaValue luaValue3) {
            return luaj.LuaValue.k0(3, "too many arguments");
        }
    }

    static class randomseed extends luaj.lib.OneArgFunction {
        final luaj.lib.MathLib.random T;

        randomseed(luaj.lib.MathLib.random randomVar) {
            this.T = randomVar;
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue) {
            long jY2 = luaj.lib.MathLib.Y2(this, 1, luaValue);
            this.T.T = new java.util.Random(jY2);
            return luaj.LuaValue.f1676f;
        }
    }

    static final class sin extends luaj.lib.MathLib.UnaryOp {
        sin() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return java.lang.Math.sin(d2);
        }
    }

    static final class sinh extends luaj.lib.MathLib.UnaryOp {
        sinh() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return java.lang.Math.sinh(d2);
        }
    }

    static final class sqrt extends luaj.lib.MathLib.UnaryOp {
        sqrt() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return java.lang.Math.sqrt(d2);
        }
    }

    static final class tan extends luaj.lib.MathLib.UnaryOp {
        tan() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return java.lang.Math.tan(d2);
        }
    }

    static final class tanh extends luaj.lib.MathLib.UnaryOp {
        tanh() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return java.lang.Math.tanh(d2);
        }
    }

    static final class tointeger extends luaj.lib.OneArgFunction {
        tointeger() {
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue) {
            return luaValue.k1() ? luaj.LuaValue.I2(luaValue.z2()) : luaj.LuaValue.f1673c;
        }
    }

    static final class type extends luaj.lib.OneArgFunction {
        type() {
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue) {
            java.lang.String str;
            if (luaValue instanceof luaj.LuaLong) {
                str = "integer";
            } else {
                if (!(luaValue instanceof luaj.LuaDouble)) {
                    return luaj.LuaValue.f1673c;
                }
                str = "float";
            }
            return luaj.LuaValue.K2(str);
        }
    }

    static final class ult extends luaj.lib.TwoArgFunction {
        ult() {
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
            long jY2 = luaj.lib.MathLib.Y2(this, 1, luaValue);
            long jY3 = luaj.lib.MathLib.Y2(this, 2, luaValue2);
            return (((jY2 > 0L ? 1 : (jY2 == 0L ? 0 : -1)) < 0) ^ ((jY2 > jY3 ? 1 : (jY2 == jY3 ? 0 : -1)) < 0)) ^ (jY3 < 0) ? luaj.LuaValue.f1674d : luaj.LuaValue.f1675e;
        }
    }

    static double X2(luaj.lib.LibFunction libFunction, int i, luaj.LuaValue luaValue) {
        try {
            return luaValue.x0();
        } catch (luaj.d e2) {
            luaj.LuaValue.l0(i, Z2(libFunction), e2.getMessage());
            return 0.0d;
        }
    }

    static long Y2(luaj.lib.LibFunction libFunction, int i, luaj.LuaValue luaValue) {
        try {
            return luaValue.C0();
        } catch (luaj.d e2) {
            luaj.LuaValue.l0(i, Z2(libFunction), e2.getMessage());
            return 0L;
        }
    }

    static java.lang.String Z2(luaj.lib.LibFunction libFunction) {
        return libFunction.getClass().getName().replace(luaj.lib.MathLib.class.getName() + '$', "math.");
    }

    static double a3(luaj.lib.LibFunction libFunction, int i, luaj.LuaValue luaValue, double d2) {
        try {
            return luaValue.F1(d2);
        } catch (luaj.d e2) {
            luaj.LuaValue.l0(i, Z2(libFunction), e2.getMessage());
            return 0.0d;
        }
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public luaj.LuaValue call(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
        luaj.LuaValue luaTable = new luaj.LuaTable(0, 64);
        luaTable.i2("abs", new luaj.lib.MathLib.abs());
        luaTable.i2("acos", new luaj.lib.MathLib.acos());
        luaTable.i2("asin", new luaj.lib.MathLib.asin());
        luaj.LuaValue atan2Var = new luaj.lib.MathLib.atan2();
        luaTable.i2("atan", atan2Var);
        luaTable.i2("atan2", atan2Var);
        luaTable.i2("ceil", new luaj.lib.MathLib.ceil());
        luaTable.i2("cos", new luaj.lib.MathLib.cos());
        luaTable.i2("cosh", new luaj.lib.MathLib.cosh());
        luaTable.i2("deg", new luaj.lib.MathLib.deg());
        luaTable.i2("exp", new luaj.lib.MathLib.exp());
        luaTable.i2("floor", new luaj.lib.MathLib.floor());
        luaTable.i2("fmod", new luaj.lib.MathLib.fmod());
        luaTable.i2("frexp", new luaj.lib.MathLib.frexp());
        luaTable.i2("huge", luaj.LuaDouble.S);
        luaTable.i2("ldexp", new luaj.lib.MathLib.ldexp());
        luaTable.i2("log", new luaj.lib.MathLib.log());
        luaTable.i2("max", new luaj.lib.MathLib.max());
        luaTable.i2("maxinteger", luaj.LuaLong.R);
        luaTable.i2("min", new luaj.lib.MathLib.min());
        luaTable.i2("mininteger", luaj.LuaLong.S);
        luaTable.i2("modf", new luaj.lib.MathLib.modf());
        luaTable.f2("pi", 3.141592653589793d);
        luaTable.i2("pow", new luaj.lib.MathLib.pow());
        luaj.lib.MathLib.random randomVar = new luaj.lib.MathLib.random();
        luaTable.i2("random", randomVar);
        luaTable.i2("randomseed", new luaj.lib.MathLib.randomseed(randomVar));
        luaTable.i2("rad", new luaj.lib.MathLib.rad());
        luaTable.i2("sin", new luaj.lib.MathLib.sin());
        luaTable.i2("sinh", new luaj.lib.MathLib.sinh());
        luaTable.i2("sqrt", new luaj.lib.MathLib.sqrt());
        luaTable.i2("tan", new luaj.lib.MathLib.tan());
        luaTable.i2("tanh", new luaj.lib.MathLib.tanh());
        luaTable.i2("tointeger", new luaj.lib.MathLib.tointeger());
        luaTable.i2("type", new luaj.lib.MathLib.type());
        luaTable.i2("ult", new luaj.lib.MathLib.ult());
        luaValue2.i2("math", luaTable);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("math", luaTable);
        }
        return luaTable;
    }
}
