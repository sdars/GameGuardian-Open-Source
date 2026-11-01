package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
class MathLib$max extends VarArgFunction {
    MathLib$max() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaValue luaValueK = varargs.K(1);
        int iU = varargs.U();
        for (int i = 2; i <= iU; i++) {
            LuaValue luaValueK2 = varargs.K(i);
            if (luaValueK.u1(luaValueK2)) {
                luaValueK = luaValueK2;
            }
        }
        return luaValueK;
    }
}
