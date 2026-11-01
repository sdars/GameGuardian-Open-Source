package luaj.lib;

import luaj.LuaDouble;
import luaj.LuaLong;
import luaj.LuaTable;
import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
public class MathLib extends TwoArgFunction {
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
        luaTable.i2("abs", new MathLib$abs());
        luaTable.i2("acos", new MathLib$acos());
        luaTable.i2("asin", new MathLib$asin());
        LuaValue mathLib$atan2 = new MathLib$atan2();
        luaTable.i2("atan", mathLib$atan2);
        luaTable.i2("atan2", mathLib$atan2);
        luaTable.i2("ceil", new MathLib$ceil());
        luaTable.i2("cos", new MathLib$cos());
        luaTable.i2("cosh", new MathLib$cosh());
        luaTable.i2("deg", new MathLib$deg());
        luaTable.i2("exp", new MathLib$exp());
        luaTable.i2("floor", new MathLib$floor());
        luaTable.i2("fmod", new MathLib$fmod());
        luaTable.i2("frexp", new MathLib$frexp());
        luaTable.i2("huge", LuaDouble.S);
        luaTable.i2("ldexp", new MathLib$ldexp());
        luaTable.i2("log", new MathLib$log());
        luaTable.i2("max", new MathLib$max());
        luaTable.i2("maxinteger", LuaLong.R);
        luaTable.i2("min", new MathLib$min());
        luaTable.i2("mininteger", LuaLong.S);
        luaTable.i2("modf", new MathLib$modf());
        luaTable.f2("pi", 3.141592653589793d);
        luaTable.i2("pow", new MathLib$pow());
        MathLib$random mathLib$random = new MathLib$random();
        luaTable.i2("random", mathLib$random);
        luaTable.i2("randomseed", new MathLib$randomseed(mathLib$random));
        luaTable.i2("rad", new MathLib$rad());
        luaTable.i2("sin", new MathLib$sin());
        luaTable.i2("sinh", new MathLib$sinh());
        luaTable.i2("sqrt", new MathLib$sqrt());
        luaTable.i2("tan", new MathLib$tan());
        luaTable.i2("tanh", new MathLib$tanh());
        luaTable.i2("tointeger", new MathLib$tointeger());
        luaTable.i2("type", new MathLib$type());
        luaTable.i2("ult", new MathLib$ult());
        luaValue2.i2("math", luaTable);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("math", luaTable);
        }
        return luaTable;
    }
}
