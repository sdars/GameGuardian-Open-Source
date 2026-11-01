package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
public abstract class OneArgFunction extends LibFunction {
    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public final LuaValue call() {
        return call(LuaValue.f1673c);
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public abstract LuaValue call(LuaValue luaValue);

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public final LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        return call(luaValue);
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        return call(luaValue);
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        return call(varargs.w());
    }
}
