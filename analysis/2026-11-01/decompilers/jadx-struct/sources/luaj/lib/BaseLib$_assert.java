package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$_assert extends VarArgFunction {
    BaseLib$_assert() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        if (varargs.U() == 0) {
            LuaValue.l0(1, "assert", "value expected");
        }
        if (varargs.f0(1)) {
            return varargs;
        }
        if (varargs.U() == 1) {
            throw new luaj.d("assertion failed!");
        }
        throw new luaj.d(varargs.v(2));
    }
}
