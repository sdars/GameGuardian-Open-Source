package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$print extends VarArgFunction {
    final BaseLib T;
    final /* synthetic */ BaseLib U;

    BaseLib$print(BaseLib baseLib, BaseLib baseLib2) {
        this.U = baseLib;
        this.T = baseLib2;
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaValue luaValueT0 = this.U.T.T0("tostring");
        int iU = varargs.U();
        for (int i = 1; i <= iU; i++) {
            if (i > 1) {
                this.U.T.c0.print(" \t");
            }
            LuaValue luaValueCall = luaValueT0.call(varargs.v(i));
            if (!luaValueCall.n1()) {
                throw new luaj.d("'tostring' must return a string to 'print', got " + luaValueCall.D2());
            }
            this.U.T.c0.print(luaValueCall.q2().g0());
        }
        this.U.T.c0.println();
        return LuaValue.f1676f;
    }
}
