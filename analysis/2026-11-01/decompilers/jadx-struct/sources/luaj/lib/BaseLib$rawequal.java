package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$rawequal extends LibFunction {
    BaseLib$rawequal() {
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call() {
        return LuaValue.k0(1, "value expected");
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) {
        return LuaValue.k0(2, "value expected");
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        return LuaValue.H2(luaValue.T1(luaValue2));
    }
}
