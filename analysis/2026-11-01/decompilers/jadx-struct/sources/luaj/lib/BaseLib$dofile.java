package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$dofile extends VarArgFunction {
    final /* synthetic */ BaseLib T;

    BaseLib$dofile(BaseLib baseLib) {
        this.T = baseLib;
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaValue luaValueW = varargs.w();
        if (!luaValueW.n1() && !luaValueW.l1()) {
            LuaValue.l0(1, "dofile", "string expected, got " + luaValueW.D2());
        }
        String strB0 = luaValueW.B0();
        BaseLib baseLib = this.T;
        Varargs varargsA3 = baseLib.a3(strB0, "bt", baseLib.T);
        return varargsA3.Q(1) ? LuaValue.R0(varargsA3.h0(2)) : varargsA3.w().invoke();
    }
}
