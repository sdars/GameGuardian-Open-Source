package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class MathLib$ult extends TwoArgFunction {
    MathLib$ult() {
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        long jY2 = MathLib.Y2(this, 1, luaValue);
        long jY3 = MathLib.Y2(this, 2, luaValue2);
        return (((jY2 > 0L ? 1 : (jY2 == 0L ? 0 : -1)) < 0) ^ ((jY2 > jY3 ? 1 : (jY2 == jY3 ? 0 : -1)) < 0)) ^ (jY3 < 0) ? LuaValue.f1674d : LuaValue.f1675e;
    }
}
