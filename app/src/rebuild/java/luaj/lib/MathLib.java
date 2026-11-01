package luaj.lib;

import java.util.Random;
import luaj.LuaDouble;
import luaj.LuaLong;
import luaj.LuaNumber;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
public class MathLib extends TwoArgFunction {

    protected static abstract class BinaryOp extends TwoArgFunction {
        protected BinaryOp() {
        }

        protected abstract double X2(double d2, double d3);

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            return LuaValue.J2(X2(MathLib.X2(this, 1, luaValue), MathLib.X2(this, 2, luaValue2)));
        }
    }

    protected static abstract class UnaryOp extends OneArgFunction {
        protected UnaryOp() {
        }

        protected abstract double X2(double d2);

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            return LuaValue.J2(X2(MathLib.X2(this, 1, luaValue)));
        }
    }

    static final class abs extends OneArgFunction {
        abs() {
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            return luaValue.j1() ? LuaValue.I2(Math.abs(luaValue.z2())) : LuaValue.J2(Math.abs(MathLib.X2(this, 1, luaValue)));
        }
    }

    static final class acos extends UnaryOp {
        acos() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return Math.acos(d2);
        }
    }

    static final class asin extends UnaryOp {
        asin() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return Math.asin(d2);
        }
    }

    static final class atan2 extends TwoArgFunction {
        atan2() {
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            return LuaValue.J2(Math.atan2(MathLib.X2(this, 1, luaValue), MathLib.a3(this, 2, luaValue2, 1.0d)));
        }
    }

    static final class ceil extends UnaryOp {
        ceil() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return Math.ceil(d2);
        }
    }

    static final class cos extends UnaryOp {
        cos() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return Math.cos(d2);
        }
    }

    static final class cosh extends UnaryOp {
        cosh() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return Math.cosh(d2);
        }
    }

    static final class deg extends UnaryOp {
        deg() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return Math.toDegrees(d2);
        }
    }

    static final class exp extends UnaryOp {
        exp() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return Math.exp(d2);
        }
    }

    static final class floor extends UnaryOp {
        floor() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return Math.floor(d2);
        }
    }

    static final class fmod extends TwoArgFunction {
        fmod() {
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            return (luaValue.j1() && luaValue2.j1()) ? LuaValue.I2(luaValue.z2() % luaValue2.z2()) : LuaValue.J2(MathLib.X2(this, 1, luaValue) % MathLib.X2(this, 2, luaValue2));
        }
    }

    static class frexp extends VarArgFunction {
        frexp() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            double dB = varargs.B(1);
            if (dB == 0.0d) {
                LuaNumber luaNumber = LuaValue.f1677g;
                return LuaValue.N2(luaNumber, luaNumber);
            }
            long jDoubleToLongBits = Double.doubleToLongBits(dB);
            return LuaValue.N2(LuaValue.J2(((4503599627370495L & jDoubleToLongBits) + 4503599627370496L) * (jDoubleToLongBits >= 0 ? 1.1102230246251565E-16d : -1.1102230246251565E-16d)), LuaValue.J2((((int) (jDoubleToLongBits >> 52)) & 2047) - 1022));
        }
    }

    static final class ldexp extends BinaryOp {
        ldexp() {
        }

        @Override // luaj.lib.MathLib.BinaryOp
        protected double X2(double d2, double d3) {
            return d2 * Double.longBitsToDouble((((long) d3) + 1023) << 52);
        }
    }

    static final class log extends TwoArgFunction {
        log() {
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            double dLog = Math.log(MathLib.X2(this, 1, luaValue));
            double dA3 = MathLib.a3(this, 2, luaValue2, 2.718281828459045d);
            if (dA3 != 2.718281828459045d) {
                dLog /= Math.log(dA3);
            }
            return LuaValue.J2(dLog);
        }
    }

    static class max extends VarArgFunction {
        max() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaValue luaValueK = varargs.K(1);
            int iU = varargs.U();
            for (int i = 2; i <= iU; i++) {
                LuaValue luaValueK2 = varargs.K(i);
                if (luaValueK.u1(luaValueK2)) {
                    luaValueK = luaValueK2;
                }
            }
            return luaValueK;
        }
    }

    static class min extends VarArgFunction {
        min() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaValue luaValueK = varargs.K(1);
            int iU = varargs.U();
            for (int i = 2; i <= iU; i++) {
                LuaValue luaValueK2 = varargs.K(i);
                if (luaValueK2.u1(luaValueK)) {
                    luaValueK = luaValueK2;
                }
            }
            return luaValueK;
        }
    }

    static class modf extends VarArgFunction {
        modf() {
        }

        @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public Varargs invoke(Varargs varargs) {
            LuaValue luaValueW = varargs.w();
            double d2 = 0.0d;
            if (!luaValueW.k1()) {
                double dX0 = luaValueW.x0();
                double dFloor = dX0 > 0.0d ? Math.floor(dX0) : Math.ceil(dX0);
                d2 = dX0 != dFloor ? dX0 - dFloor : 0.0d;
                luaValueW = LuaValue.J2(dFloor);
            }
            return LuaValue.N2(luaValueW, LuaValue.J2(d2));
        }
    }

    static final class pow extends BinaryOp {
        pow() {
        }

        @Override // luaj.lib.MathLib.BinaryOp
        protected double X2(double d2, double d3) {
            return Math.pow(d2, d3);
        }
    }

    static final class rad extends UnaryOp {
        rad() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return Math.toRadians(d2);
        }
    }

    static class random extends LibFunction {
        Random T = new Random();

        random() {
        }

        private long X2() {
            long jNextLong = this.T.nextLong();
            return jNextLong < 0 ? jNextLong - Long.MIN_VALUE : jNextLong;
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call() {
            return LuaValue.J2(this.T.nextDouble());
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            long jC0 = luaValue.C0();
            if (jC0 < 1) {
                LuaValue.k0(1, "interval is empty");
            }
            return LuaValue.I2((X2() % jC0) + 1);
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            long jC0 = luaValue.C0();
            long jC1 = luaValue2.C0();
            if (jC1 < jC0) {
                LuaValue.k0(2, "interval is empty");
            }
            long j = jC1 - jC0;
            if (j < 0) {
                LuaValue.k0(2, "interval too large");
            }
            long jX2 = X2();
            if (j != Long.MAX_VALUE) {
                jX2 %= j + 1;
            }
            return LuaValue.I2(jC0 + jX2);
        }

        @Override // luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
            return LuaValue.k0(3, "too many arguments");
        }
    }

    static class randomseed extends OneArgFunction {
        final random T;

        randomseed(random randomVar) {
            this.T = randomVar;
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            long jY2 = MathLib.Y2(this, 1, luaValue);
            this.T.T = new Random(jY2);
            return LuaValue.f1676f;
        }
    }

    static final class sin extends UnaryOp {
        sin() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return Math.sin(d2);
        }
    }

    static final class sinh extends UnaryOp {
        sinh() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return Math.sinh(d2);
        }
    }

    static final class sqrt extends UnaryOp {
        sqrt() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return Math.sqrt(d2);
        }
    }

    static final class tan extends UnaryOp {
        tan() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return Math.tan(d2);
        }
    }

    static final class tanh extends UnaryOp {
        tanh() {
        }

        @Override // luaj.lib.MathLib.UnaryOp
        protected double X2(double d2) {
            return Math.tanh(d2);
        }
    }

    static final class tointeger extends OneArgFunction {
        tointeger() {
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            return luaValue.k1() ? LuaValue.I2(luaValue.z2()) : LuaValue.f1673c;
        }
    }

    static final class type extends OneArgFunction {
        type() {
        }

        @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue) {
            String str;
            if (luaValue instanceof LuaLong) {
                str = "integer";
            } else {
                if (!(luaValue instanceof LuaDouble)) {
                    return LuaValue.f1673c;
                }
                str = "float";
            }
            return LuaValue.K2(str);
        }
    }

    static final class ult extends TwoArgFunction {
        ult() {
        }

        @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            long jY2 = MathLib.Y2(this, 1, luaValue);
            long jY3 = MathLib.Y2(this, 2, luaValue2);
            return (((jY2 > 0L ? 1 : (jY2 == 0L ? 0 : -1)) < 0) ^ ((jY2 > jY3 ? 1 : (jY2 == jY3 ? 0 : -1)) < 0)) ^ (jY3 < 0) ? LuaValue.f1674d : LuaValue.f1675e;
        }
    }

    static double X2(LibFunction libFunction, int i, LuaValue luaValue) {
        try {
            return luaValue.x0();
        } catch (luaj.d e2) {
            LuaValue.l0(i, Z2(libFunction), e2.getMessage());
            return 0.0d;
        }
    }

    static long Y2(LibFunction libFunction, int i, LuaValue luaValue) {
        try {
            return luaValue.C0();
        } catch (luaj.d e2) {
            LuaValue.l0(i, Z2(libFunction), e2.getMessage());
            return 0L;
        }
    }

    static String Z2(LibFunction libFunction) {
        return libFunction.getClass().getName().replace(MathLib.class.getName() + '$', "math.");
    }

    static double a3(LibFunction libFunction, int i, LuaValue luaValue, double d2) {
        try {
            return luaValue.F1(d2);
        } catch (luaj.d e2) {
            LuaValue.l0(i, Z2(libFunction), e2.getMessage());
            return 0.0d;
        }
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        LuaValue luaTable = new LuaTable(0, 64);
        luaTable.i2("abs", new abs());
        luaTable.i2("acos", new acos());
        luaTable.i2("asin", new asin());
        LuaValue atan2Var = new atan2();
        luaTable.i2("atan", atan2Var);
        luaTable.i2("atan2", atan2Var);
        luaTable.i2("ceil", new ceil());
        luaTable.i2("cos", new cos());
        luaTable.i2("cosh", new cosh());
        luaTable.i2("deg", new deg());
        luaTable.i2("exp", new exp());
        luaTable.i2("floor", new floor());
        luaTable.i2("fmod", new fmod());
        luaTable.i2("frexp", new frexp());
        luaTable.i2("huge", LuaDouble.S);
        luaTable.i2("ldexp", new ldexp());
        luaTable.i2("log", new log());
        luaTable.i2("max", new max());
        luaTable.i2("maxinteger", LuaLong.R);
        luaTable.i2("min", new min());
        luaTable.i2("mininteger", LuaLong.S);
        luaTable.i2("modf", new modf());
        luaTable.f2("pi", 3.141592653589793d);
        luaTable.i2("pow", new pow());
        random randomVar = new random();
        luaTable.i2("random", randomVar);
        luaTable.i2("randomseed", new randomseed(randomVar));
        luaTable.i2("rad", new rad());
        luaTable.i2("sin", new sin());
        luaTable.i2("sinh", new sinh());
        luaTable.i2("sqrt", new sqrt());
        luaTable.i2("tan", new tan());
        luaTable.i2("tanh", new tanh());
        luaTable.i2("tointeger", new tointeger());
        luaTable.i2("type", new type());
        luaTable.i2("ult", new ult());
        luaValue2.i2("math", luaTable);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("math", luaTable);
        }
        return luaTable;
    }
}
