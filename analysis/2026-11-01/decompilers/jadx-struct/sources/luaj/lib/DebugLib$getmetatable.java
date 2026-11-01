package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class DebugLib$getmetatable extends LibFunction {
    DebugLib$getmetatable() {
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) {
        LuaValue luaValueV0 = luaValue.V0();
        return luaValueV0 != null ? luaValueV0 : LuaValue.f1673c;
    }
}
