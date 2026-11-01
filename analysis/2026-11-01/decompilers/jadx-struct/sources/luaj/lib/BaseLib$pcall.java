package luaj.lib;

import luaj.LuaClosure;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$pcall extends VarArgFunction {
    final /* synthetic */ BaseLib T;

    BaseLib$pcall(BaseLib baseLib) {
        this.T = baseLib;
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        return LuaClosure.d3(this.T.T, this, varargs.K(1), varargs.e0(2));
    }
}
