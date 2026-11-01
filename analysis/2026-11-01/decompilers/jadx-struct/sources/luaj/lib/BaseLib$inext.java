package luaj.lib;

import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$inext extends VarArgFunction {
    BaseLib$inext() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        return varargs.I(1).p3(varargs.v(2));
    }
}
