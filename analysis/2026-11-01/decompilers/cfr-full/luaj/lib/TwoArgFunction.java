/*
 * Decompiled with CFR 0.152.
 */
package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;
import luaj.lib.LibFunction;

public abstract class TwoArgFunction
extends LibFunction {
    @Override
    public final LuaValue call() {
        LuaValue luaValue = LuaValue.c;
        return this.call(luaValue, luaValue);
    }

    @Override
    public final LuaValue call(LuaValue luaValue) {
        return this.call(luaValue, LuaValue.c);
    }

    @Override
    public abstract LuaValue call(LuaValue var1, LuaValue var2);

    @Override
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        return this.call(luaValue, luaValue2);
    }

    @Override
    public Varargs invoke(Varargs varargs) {
        return this.call(varargs.w(), varargs.v(2));
    }
}

