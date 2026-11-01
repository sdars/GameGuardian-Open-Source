package luaj.lib;

import luaj.LuaThread;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class DebugLib$setlocal extends VarArgFunction {
    final /* synthetic */ DebugLib T;

    DebugLib$setlocal(DebugLib debugLib) {
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
        int iD = varargs.D(i);
        int iD2 = varargs.D(i + 1);
        LuaValue luaValueV = varargs.v(i + 2);
        DebugLib$b debugLib$bZ2 = this.T.Z2(luaThreadJ);
        int i2 = debugLib$bZ2.f1757b;
        if (debugLib$bZ2.e(1).f1749a == this) {
            iD++;
            i2--;
        }
        DebugLib$a debugLib$aE = debugLib$bZ2.e(iD);
        if (debugLib$aE != null) {
            return debugLib$aE.h(iD2, luaValueV);
        }
        return LuaValue.l0(i, "debug.setlocal", "level out of range: " + iD + " not between 1 and " + i2);
    }
}
