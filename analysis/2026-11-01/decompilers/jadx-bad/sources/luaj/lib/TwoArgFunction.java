package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class TwoArgFunction extends LibFunction {
    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public final LuaValue call() {
        LuaValue luaValue = LuaValue.f1671c;
        return call(luaValue, luaValue);
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public abstract LuaValue call(LuaValue luaValue, LuaValue luaValue2);

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        return call(varargs.w(), varargs.v(2));
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public final LuaValue call(LuaValue luaValue) {
        return call(luaValue, LuaValue.f1671c);
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        return call(luaValue, luaValue2);
    }
}
