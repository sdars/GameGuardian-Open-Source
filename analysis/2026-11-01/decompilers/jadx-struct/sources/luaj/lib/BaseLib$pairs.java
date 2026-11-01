package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$pairs extends VarArgFunction {
    final BaseLib$next T;

    BaseLib$pairs(BaseLib$next baseLib$next) {
        this.T = baseLib$next;
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        return LuaValue.M2(this.T, varargs.I(1), LuaValue.f1673c);
    }
}
