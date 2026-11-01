package android.ext;

import luaj.Varargs;
import luaj.lib.VarArgFunction;

/* JADX INFO: loaded from: classes.dex */
final class Script$exit extends VarArgFunction {
    Script$exit() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        throw new Script$OsExit(varargs.Y(1, 0));
    }
}
