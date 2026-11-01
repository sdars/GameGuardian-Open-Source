/*
 * Decompiled with CFR 0.152.
 */
package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;
import luaj.lib.LibFunction;

public abstract class OneArgFunction
extends LibFunction {
    @Override
    public final LuaValue call() {
        return this.call(LuaValue.c);
    }

    @Override
    public abstract LuaValue call(LuaValue var1);

    @Override
    public final LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        return this.call(luaValue);
    }

    @Override
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        return this.call(luaValue);
    }

    @Override
    public Varargs invoke(Varargs varargs) {
        return this.call(varargs.w());
    }
}

