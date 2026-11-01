package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$getmetatable extends LibFunction {
    BaseLib$getmetatable() {
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call() {
        return LuaValue.k0(1, "value expected");
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) {
        LuaValue luaValueV0 = luaValue.V0();
        return luaValueV0 != null ? luaValueV0.V1(LuaValue.p).M1(luaValueV0) : LuaValue.f1673c;
    }
}
