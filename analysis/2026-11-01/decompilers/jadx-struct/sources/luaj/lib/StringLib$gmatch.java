package luaj.lib;

import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class StringLib$gmatch extends VarArgFunction {
    StringLib$gmatch() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        return new StringLib$GMatchAux(varargs, varargs.H(1), varargs.H(2));
    }
}
