package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$select extends VarArgFunction {
    BaseLib$select() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        int iU = varargs.U() - 1;
        if (varargs.w().equals(LuaValue.K2("#"))) {
            return LuaValue.I2(iU);
        }
        int iD = varargs.D(1);
        if (iD == 0 || iD < (-iU)) {
            LuaValue.k0(1, "index out of range");
        }
        return varargs.e0(iD < 0 ? iU + iD + 2 : iD + 1);
    }
}
