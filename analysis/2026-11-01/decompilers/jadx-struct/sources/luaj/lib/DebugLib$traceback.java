package luaj.lib;

import luaj.LuaThread;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class DebugLib$traceback extends VarArgFunction {
    final /* synthetic */ DebugLib T;

    DebugLib$traceback(DebugLib debugLib) {
        this.T = debugLib;
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaThread luaThreadJ;
        int i;
        if (varargs.T(1)) {
            luaThreadJ = varargs.J(1);
            i = 2;
        } else {
            luaThreadJ = this.T.T.f0;
            i = 1;
        }
        int i2 = i + 1;
        LuaValue luaValueV = varargs.v(i);
        if (!luaValueV.n1() && !luaValueV.l1()) {
            return luaValueV;
        }
        int iY = varargs.Y(i2, 1);
        DebugLib$b debugLib$bZ2 = this.T.Z2(luaThreadJ);
        if (debugLib$bZ2.e(1).f1749a == this) {
            iY++;
        }
        String strM = debugLib$bZ2.m(this.T.T, iY);
        if (luaValueV.n1()) {
            strM = luaValueV.g0() + '\n' + strM;
        }
        return LuaValue.K2(strM);
    }
}
