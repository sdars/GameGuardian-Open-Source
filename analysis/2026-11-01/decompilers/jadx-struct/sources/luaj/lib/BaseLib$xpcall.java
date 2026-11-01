package luaj.lib;

import luaj.LuaClosure;
import luaj.LuaThread;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$xpcall extends VarArgFunction {
    final /* synthetic */ BaseLib T;

    BaseLib$xpcall(BaseLib baseLib) {
        this.T = baseLib;
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaThread luaThread = this.T.T.f0;
        LuaValue luaValue = luaThread.S;
        luaThread.S = varargs.K(2);
        try {
            Varargs varargsD3 = LuaClosure.d3(this.T.T, this, varargs.K(1), varargs.e0(3));
            luaThread.S = luaValue;
            return varargsD3;
        } catch (Throwable th) {
            luaThread.S = luaValue;
            throw th;
        }
    }
}
