package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
class TableLib$concat extends TableLibFunction {
    TableLib$concat() {
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) {
        return luaValue.H0().W2(LuaValue.L, 1, luaValue.s1());
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        return luaValue.H0().W2(luaValue2.G0(), 1, luaValue.s1());
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        return luaValue.H0().W2(luaValue2.G0(), luaValue3.A0(), luaValue.s1());
    }

    @Override // luaj.lib.LibFunction
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3, LuaValue luaValue4) {
        return luaValue.H0().W2(luaValue2.G0(), luaValue3.A0(), luaValue4.A0());
    }
}
