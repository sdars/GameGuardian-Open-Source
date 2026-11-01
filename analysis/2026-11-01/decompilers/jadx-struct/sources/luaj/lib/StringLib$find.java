package luaj.lib;

import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class StringLib$find extends VarArgFunction {
    StringLib$find() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        return StringLib.d3(varargs, true);
    }
}
