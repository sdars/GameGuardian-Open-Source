package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class MathLib$tointeger extends OneArgFunction {
    MathLib$tointeger() {
    }

    @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) {
        return luaValue.k1() ? LuaValue.I2(luaValue.z2()) : LuaValue.f1673c;
    }
}
