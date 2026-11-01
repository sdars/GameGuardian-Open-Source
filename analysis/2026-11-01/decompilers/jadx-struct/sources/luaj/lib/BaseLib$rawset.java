package luaj.lib;

import luaj.LuaTable;
import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$rawset extends TableLibFunction {
    BaseLib$rawset() {
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) {
        return LuaValue.k0(2, "value expected");
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        return LuaValue.k0(3, "value expected");
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        LuaTable luaTableH0 = luaValue.H0();
        if (!luaValue2.q1()) {
            LuaValue.k0(2, "table index is nil");
        }
        luaTableH0.d2(luaValue2, luaValue3);
        return luaTableH0;
    }
}
