package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class MathLib$fmod extends TwoArgFunction {
    MathLib$fmod() {
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        return (luaValue.j1() && luaValue2.j1()) ? LuaValue.I2(luaValue.z2() % luaValue2.z2()) : LuaValue.J2(MathLib.X2(this, 1, luaValue) % MathLib.X2(this, 2, luaValue2));
    }
}
