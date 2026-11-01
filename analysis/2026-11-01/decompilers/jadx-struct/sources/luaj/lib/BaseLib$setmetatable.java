package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$setmetatable extends TableLibFunction {
    BaseLib$setmetatable() {
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) {
        return LuaValue.k0(2, "nil or table expected");
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        LuaValue luaValueV0 = luaValue.H0().V0();
        if (luaValueV0 != null && !luaValueV0.V1(LuaValue.p).l1()) {
            LuaValue.R0("cannot change a protected metatable");
        }
        return luaValue.k2(luaValue2.l1() ? null : luaValue2.H0());
    }
}
