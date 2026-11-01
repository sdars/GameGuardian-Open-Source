package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$ipairs extends VarArgFunction {
    BaseLib$inext T = new BaseLib$inext();

    BaseLib$ipairs() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        return LuaValue.M2(this.T, varargs.I(1), LuaValue.f1677g);
    }
}
