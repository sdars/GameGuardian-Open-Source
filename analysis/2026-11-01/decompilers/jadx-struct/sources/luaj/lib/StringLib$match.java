package luaj.lib;

import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class StringLib$match extends VarArgFunction {
    StringLib$match() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        return StringLib.d3(varargs, false);
    }
}
