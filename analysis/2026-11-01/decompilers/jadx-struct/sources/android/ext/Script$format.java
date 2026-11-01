package android.ext;

import luaj.LuaValue;
import luaj.Varargs;
import luaj.lib.VarArgFunction;

/* JADX INFO: loaded from: classes.dex */
final class Script$format extends VarArgFunction {
    final LuaValue T;

    public Script$format(LuaValue luaValue) {
        this.T = luaValue;
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        return this.T.invoke(LuaValue.N2(LuaValue.K2(b2.g(varargs.E(1)).replace("%,d", "%d")), varargs.e0(2)));
    }
}
