package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$rawlen extends LibFunction {
    BaseLib$rawlen() {
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) {
        return LuaValue.I2(luaValue.W1());
    }
}
