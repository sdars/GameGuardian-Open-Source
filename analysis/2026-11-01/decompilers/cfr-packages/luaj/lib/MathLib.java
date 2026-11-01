/*
 * Decompiled with CFR 0.152.
 */
package luaj.lib;

import java.util.Random;
import luaj.LuaDouble;
import luaj.LuaLong;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.d;
import luaj.lib.LibFunction;
import luaj.lib.OneArgFunction;
import luaj.lib.TwoArgFunction;
import luaj.lib.VarArgFunction;

public class MathLib
extends TwoArgFunction {
    static double X2(LibFunction libFunction, int n3, LuaValue luaValue) {
        try {
            double d4 = luaValue.x0();
            return d4;
        }
        catch (d d5) {
            LuaValue.l0(n3, MathLib.Z2(libFunction), d5.getMessage());
            return 0.0;
        }
    }

    static long Y2(LibFunction libFunction, int n3, LuaValue luaValue) {
        try {
            long l3 = luaValue.C0();
            return l3;
        }
        catch (d d4) {
            LuaValue.l0(n3, MathLib.Z2(libFunction), d4.getMessage());
            return 0L;
        }
    }

    static String Z2(LibFunction object) {
        object = object.getClass().getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(MathLib.class.getName());
        stringBuilder.append('$');
        return ((String)object).replace(stringBuilder.toString(), "math.");
    }

    static double a3(LibFunction libFunction, int n3, LuaValue luaValue, double d4) {
        try {
            d4 = luaValue.F1(d4);
            return d4;
        }
        catch (d d5) {
            LuaValue.l0(n3, MathLib.Z2(libFunction), d5.getMessage());
            return 0.0;
        }
    }

    @Override
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        luaValue = new LuaTable(0, 64);
        luaValue.i2("abs", new abs());
        luaValue.i2("acos", new acos());
        luaValue.i2("asin", new asin());
        LibFunction libFunction = new atan2();
        luaValue.i2("atan", libFunction);
        luaValue.i2("atan2", libFunction);
        luaValue.i2("ceil", new ceil());
        luaValue.i2("cos", new cos());
        luaValue.i2("cosh", new cosh());
        luaValue.i2("deg", new deg());
        luaValue.i2("exp", new exp());
        luaValue.i2("floor", new floor());
        luaValue.i2("fmod", new fmod());
        luaValue.i2("frexp", new frexp());
        luaValue.i2("huge", LuaDouble.S);
        luaValue.i2("ldexp", new ldexp());
        luaValue.i2("log", new log());
        luaValue.i2("max", new max());
        luaValue.i2("maxinteger", LuaLong.R);
        luaValue.i2("min", new min());
        luaValue.i2("mininteger", LuaLong.S);
        luaValue.i2("modf", new modf());
        luaValue.f2("pi", Math.PI);
        luaValue.i2("pow", new pow());
        libFunction = new random();
        luaValue.i2("random", libFunction);
        luaValue.i2("randomseed", new randomseed((random)libFunction));
        luaValue.i2("rad", new rad());
        luaValue.i2("sin", new sin());
        luaValue.i2("sinh", new sinh());
        luaValue.i2("sqrt", new sqrt());
        luaValue.i2("tan", new tan());
        luaValue.i2("tanh", new tanh());
        luaValue.i2("tointeger", new tointeger());
        luaValue.i2("type", new type());
        luaValue.i2("ult", new ult());
        luaValue2.i2("math", luaValue);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("math", luaValue);
        }
        return luaValue;
    }

    protected static abstract class BinaryOp
    extends TwoArgFunction {
        protected BinaryOp() {
        }

        protected abstract double X2(double var1, double var3);

        @Override
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            return LuaValue.J2(this.X2(MathLib.X2(this, 1, luaValue), MathLib.X2(this, 2, luaValue2)));
        }
    }

    protected static abstract class UnaryOp
    extends OneArgFunction {
        protected UnaryOp() {
        }

        protected abstract double X2(double var1);

        @Override
        public LuaValue call(LuaValue luaValue) {
            return LuaValue.J2(this.X2(MathLib.X2(this, 1, luaValue)));
        }
    }

    static final class abs
    extends OneArgFunction {
        abs() {
        }

        @Override
        public LuaValue call(LuaValue luaValue) {
            luaValue = luaValue.j1() ? LuaValue.I2(Math.abs(luaValue.z2())) : LuaValue.J2(Math.abs(MathLib.X2(this, 1, luaValue)));
            return luaValue;
        }
    }

    static final class acos
    extends UnaryOp {
        acos() {
        }

        @Override
        protected double X2(double d4) {
            return Math.acos(d4);
        }
    }

    static final class asin
    extends UnaryOp {
        asin() {
        }

        @Override
        protected double X2(double d4) {
            return Math.asin(d4);
        }
    }

    static final class atan2
    extends TwoArgFunction {
        atan2() {
        }

        @Override
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            return LuaValue.J2(Math.atan2(MathLib.X2(this, 1, luaValue), MathLib.a3(this, 2, luaValue2, 1.0)));
        }
    }

    static final class ceil
    extends UnaryOp {
        ceil() {
        }

        @Override
        protected double X2(double d4) {
            return Math.ceil(d4);
        }
    }

    static final class cos
    extends UnaryOp {
        cos() {
        }

        @Override
        protected double X2(double d4) {
            return Math.cos(d4);
        }
    }

    static final class cosh
    extends UnaryOp {
        cosh() {
        }

        @Override
        protected double X2(double d4) {
            return Math.cosh(d4);
        }
    }

    static final class deg
    extends UnaryOp {
        deg() {
        }

        @Override
        protected double X2(double d4) {
            return Math.toDegrees(d4);
        }
    }

    static final class exp
    extends UnaryOp {
        exp() {
        }

        @Override
        protected double X2(double d4) {
            return Math.exp(d4);
        }
    }

    static final class floor
    extends UnaryOp {
        floor() {
        }

        @Override
        protected double X2(double d4) {
            return Math.floor(d4);
        }
    }

    static final class fmod
    extends TwoArgFunction {
        fmod() {
        }

        @Override
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            if (luaValue.j1() && luaValue2.j1()) {
                return LuaValue.I2(luaValue.z2() % luaValue2.z2());
            }
            return LuaValue.J2(MathLib.X2(this, 1, luaValue) % MathLib.X2(this, 2, luaValue2));
        }
    }

    static class frexp
    extends VarArgFunction {
        frexp() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            double d4 = varargs.B(1);
            if (d4 == 0.0) {
                varargs = LuaValue.g;
                return LuaValue.N2((LuaValue)varargs, varargs);
            }
            long l3 = Double.doubleToLongBits(d4);
            double d5 = (0xFFFFFFFFFFFFFL & l3) + 0x10000000000000L;
            d4 = l3 >= 0L ? (double)1.110223E-16f : (double)-1.110223E-16f;
            double d6 = ((int)(l3 >> 52) & 0x7FF) - 1022;
            return LuaValue.N2(LuaValue.J2(d5 * d4), LuaValue.J2(d6));
        }
    }

    static final class ldexp
    extends BinaryOp {
        ldexp() {
        }

        @Override
        protected double X2(double d4, double d5) {
            return d4 * Double.longBitsToDouble((long)d5 + 1023L << 52);
        }
    }

    static final class log
    extends TwoArgFunction {
        log() {
        }

        @Override
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            double d4 = Math.log(MathLib.X2(this, 1, luaValue));
            double d5 = MathLib.a3(this, 2, luaValue2, Math.E);
            double d6 = d4;
            if (d5 != Math.E) {
                d6 = d4 / Math.log(d5);
            }
            return LuaValue.J2(d6);
        }
    }

    static class max
    extends VarArgFunction {
        max() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            LuaValue luaValue = varargs.K(1);
            int n3 = varargs.U();
            for (int i3 = 2; i3 <= n3; ++i3) {
                LuaValue luaValue2 = varargs.K(i3);
                LuaValue luaValue3 = luaValue;
                if (luaValue.u1(luaValue2)) {
                    luaValue3 = luaValue2;
                }
                luaValue = luaValue3;
            }
            return luaValue;
        }
    }

    static class min
    extends VarArgFunction {
        min() {
        }

        @Override
        public Varargs invoke(Varargs varargs) {
            LuaValue luaValue = varargs.K(1);
            int n3 = varargs.U();
            for (int i3 = 2; i3 <= n3; ++i3) {
                LuaValue luaValue2 = varargs.K(i3);
                LuaValue luaValue3 = luaValue;
                if (luaValue2.u1(luaValue)) {
                    luaValue3 = luaValue2;
                }
                luaValue = luaValue3;
            }
            return luaValue;
        }
    }

    static class modf
    extends VarArgFunction {
        modf() {
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public Varargs invoke(Varargs varargs) {
            double d4;
            varargs = varargs.w();
            boolean bl = ((LuaValue)varargs).k1();
            double d5 = 0.0;
            if (bl) {
                return LuaValue.N2((LuaValue)varargs, LuaValue.J2(d5));
            }
            double d6 = (d4 = ((LuaValue)varargs).x0()) > 0.0 ? Math.floor(d4) : Math.ceil(d4);
            if (d4 != d6) {
                d5 = d4 - d6;
            }
            varargs = LuaValue.J2(d6);
            return LuaValue.N2((LuaValue)varargs, LuaValue.J2(d5));
        }
    }

    static final class pow
    extends BinaryOp {
        pow() {
        }

        @Override
        protected double X2(double d4, double d5) {
            return Math.pow(d4, d5);
        }
    }

    static final class rad
    extends UnaryOp {
        rad() {
        }

        @Override
        protected double X2(double d4) {
            return Math.toRadians(d4);
        }
    }

    static class random
    extends LibFunction {
        Random T = new Random();

        random() {
        }

        private long X2() {
            long l3;
            long l4 = l3 = this.T.nextLong();
            if (l3 < 0L) {
                l4 = l3 - Long.MIN_VALUE;
            }
            return l4;
        }

        @Override
        public LuaValue call() {
            return LuaValue.J2(this.T.nextDouble());
        }

        @Override
        public LuaValue call(LuaValue luaValue) {
            long l3 = luaValue.C0();
            if (l3 < 1L) {
                LuaValue.k0(1, "interval is empty");
            }
            return LuaValue.I2(this.X2() % l3 + 1L);
        }

        @Override
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            long l3;
            long l4;
            long l5 = luaValue.C0();
            long l6 = luaValue2.C0();
            if (l6 < l5) {
                LuaValue.k0(2, "interval is empty");
            }
            if ((l4 = l6 - l5) < 0L) {
                LuaValue.k0(2, "interval too large");
            }
            l6 = l3 = this.X2();
            if (l4 != Long.MAX_VALUE) {
                l6 = l3 % (l4 + 1L);
            }
            return LuaValue.I2(l5 + l6);
        }

        @Override
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
            return LuaValue.k0(3, "too many arguments");
        }
    }

    static class randomseed
    extends OneArgFunction {
        final random T;

        randomseed(random random2) {
            this.T = random2;
        }

        @Override
        public LuaValue call(LuaValue luaValue) {
            long l3 = MathLib.Y2(this, 1, luaValue);
            this.T.T = new Random(l3);
            return LuaValue.f;
        }
    }

    static final class sin
    extends UnaryOp {
        sin() {
        }

        @Override
        protected double X2(double d4) {
            return Math.sin(d4);
        }
    }

    static final class sinh
    extends UnaryOp {
        sinh() {
        }

        @Override
        protected double X2(double d4) {
            return Math.sinh(d4);
        }
    }

    static final class sqrt
    extends UnaryOp {
        sqrt() {
        }

        @Override
        protected double X2(double d4) {
            return Math.sqrt(d4);
        }
    }

    static final class tan
    extends UnaryOp {
        tan() {
        }

        @Override
        protected double X2(double d4) {
            return Math.tan(d4);
        }
    }

    static final class tanh
    extends UnaryOp {
        tanh() {
        }

        @Override
        protected double X2(double d4) {
            return Math.tanh(d4);
        }
    }

    static final class tointeger
    extends OneArgFunction {
        tointeger() {
        }

        @Override
        public LuaValue call(LuaValue luaValue) {
            luaValue = luaValue.k1() ? LuaValue.I2(luaValue.z2()) : LuaValue.c;
            return luaValue;
        }
    }

    static final class type
    extends OneArgFunction {
        type() {
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public LuaValue call(LuaValue object) {
            if (object instanceof LuaLong) {
                object = "integer";
                return LuaValue.K2((String)object);
            }
            if (!(object instanceof LuaDouble)) return LuaValue.c;
            object = "float";
            return LuaValue.K2((String)object);
        }
    }

    static final class ult
    extends TwoArgFunction {
        ult() {
        }

        @Override
        public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
            long l3;
            boolean bl = true;
            long l4 = MathLib.Y2(this, 1, luaValue);
            boolean bl2 = l4 < (l3 = MathLib.Y2(this, 2, luaValue2));
            boolean bl3 = l4 < 0L;
            if (l3 >= 0L) {
                bl = false;
            }
            luaValue = bl3 ^ bl2 ^ bl ? LuaValue.d : LuaValue.e;
            return luaValue;
        }
    }
}

