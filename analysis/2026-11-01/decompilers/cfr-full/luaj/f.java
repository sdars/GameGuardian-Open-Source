/*
 * Decompiled with CFR 0.152.
 */
package luaj;

import luaj.LuaTable;
import luaj.LuaValue;
import luaj.e;

class f
implements e {
    private final LuaValue a;

    public f(LuaValue luaValue) {
        this.a = luaValue;
    }

    @Override
    public LuaValue e() {
        return this.a;
    }

    @Override
    public LuaValue g(LuaValue luaValue) {
        return luaValue;
    }

    @Override
    public LuaTable.m k(LuaValue luaValue, LuaValue luaValue2) {
        return LuaTable.Z2(luaValue, luaValue2);
    }

    @Override
    public LuaValue o(LuaValue[] luaValueArray, int n3) {
        return luaValueArray[n3];
    }

    @Override
    public boolean p() {
        return false;
    }

    @Override
    public boolean q() {
        return false;
    }
}

