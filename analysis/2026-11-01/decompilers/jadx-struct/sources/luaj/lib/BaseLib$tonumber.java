package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$tonumber extends LibFunction {
    BaseLib$tonumber() {
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) {
        return luaValue.A2();
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        if (luaValue2.l1()) {
            return luaValue.A2();
        }
        int iA0 = luaValue2.A0();
        if (iA0 < 2 || iA0 > 36) {
            LuaValue.k0(2, "base out of range");
        }
        return luaValue.G0().l3(iA0);
    }
}
