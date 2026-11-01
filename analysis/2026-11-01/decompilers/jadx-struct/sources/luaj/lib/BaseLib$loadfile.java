package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$loadfile extends VarArgFunction {
    final /* synthetic */ BaseLib T;

    BaseLib$loadfile(BaseLib baseLib) {
        this.T = baseLib;
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaValue luaValueW = varargs.w();
        if (!luaValueW.n1() && !luaValueW.l1()) {
            LuaValue.l0(1, "loadfile", "string expected, got " + luaValueW.D2());
        }
        return this.T.a3(luaValueW.B0(), varargs.Z(2, "bt"), varargs.d0(3, this.T.T));
    }
}
