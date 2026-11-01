package luaj.lib;

import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Utf8Lib$codes extends VarArgFunction {
    Utf8Lib$codes() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        return new Utf8Lib$CodesAux(varargs.H(1));
    }
}
