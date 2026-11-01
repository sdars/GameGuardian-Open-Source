package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
class MathLib$min extends VarArgFunction {
    MathLib$min() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaValue luaValueK = varargs.K(1);
        int iU = varargs.U();
        for (int i = 2; i <= iU; i++) {
            LuaValue luaValueK2 = varargs.K(i);
            if (luaValueK2.u1(luaValueK)) {
                luaValueK = luaValueK2;
            }
        }
        return luaValueK;
    }
}
