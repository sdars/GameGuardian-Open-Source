package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class VarArgFunction extends LibFunction {
    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call() {
        return invoke(LuaValue.f1674f).w();
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public abstract Varargs invoke(Varargs varargs);

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) {
        return invoke(luaValue).w();
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        return invoke(LuaValue.N2(luaValue, luaValue2)).w();
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        return invoke(LuaValue.M2(luaValue, luaValue2, luaValue3)).w();
    }
}
