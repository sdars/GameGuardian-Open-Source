package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$tostring extends LibFunction {
    BaseLib$tostring() {
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) {
        return BaseLib.d3(luaValue);
    }
}
