package luaj.lib;

import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$next extends VarArgFunction {
    BaseLib$next() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        return varargs.I(1).v3(varargs.v(2));
    }
}
