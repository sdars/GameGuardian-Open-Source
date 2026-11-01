package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class MathLib$log extends TwoArgFunction {
    MathLib$log() {
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
