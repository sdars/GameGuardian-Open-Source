package luaj.lib;

import luaj.LuaNumber;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
class MathLib$frexp extends VarArgFunction {
    MathLib$frexp() {
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
