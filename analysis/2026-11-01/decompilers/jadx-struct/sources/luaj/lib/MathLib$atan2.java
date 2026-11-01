package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class MathLib$atan2 extends TwoArgFunction {
    MathLib$atan2() {
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        return LuaValue.J2(Math.atan2(MathLib.X2(this, 1, luaValue), MathLib.a3(this, 2, luaValue2, 1.0d)));
    }
}
