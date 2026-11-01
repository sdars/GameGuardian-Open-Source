/*
 * Decompiled with CFR 0.152.
 */
package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;
import luaj.lib.LibFunction;

public abstract class ZeroArgFunction
extends LibFunction {
    @Override
    public abstract LuaValue call();

    @Override
    public LuaValue call(LuaValue luaValue) {
        return this.call();
    }

    @Override
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        return this.call();
    }

    @Override
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        return this.call();
    }

    @Override
    public Varargs invoke(Varargs varargs) {
        return this.call();
    }
}

