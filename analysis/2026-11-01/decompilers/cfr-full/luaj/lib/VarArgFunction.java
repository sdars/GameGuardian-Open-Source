/*
 * Decompiled with CFR 0.152.
 */
package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;
import luaj.lib.LibFunction;

public abstract class VarArgFunction
extends LibFunction {
    @Override
    public LuaValue call() {
        return this.invoke(LuaValue.f).w();
    }

    @Override
    public LuaValue call(LuaValue luaValue) {
        return this.invoke(luaValue).w();
    }

    @Override
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        return this.invoke(LuaValue.N2(luaValue, luaValue2)).w();
    }

    @Override
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        return this.invoke(LuaValue.M2(luaValue, luaValue2, luaValue3)).w();
    }

    @Override
    public abstract Varargs invoke(Varargs var1);
}

