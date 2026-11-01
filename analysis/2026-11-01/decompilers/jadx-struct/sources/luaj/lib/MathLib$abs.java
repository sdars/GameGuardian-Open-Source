package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class MathLib$abs extends OneArgFunction {
    MathLib$abs() {
    }

    @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) {
        return luaValue.j1() ? LuaValue.I2(Math.abs(luaValue.z2())) : LuaValue.J2(Math.abs(MathLib.X2(this, 1, luaValue)));
    }
}
