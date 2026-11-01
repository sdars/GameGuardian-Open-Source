package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$type extends LibFunction {
    BaseLib$type() {
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) {
        return LuaValue.K2(luaValue.D2());
    }
}
