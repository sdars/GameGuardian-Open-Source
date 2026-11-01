package luaj.lib;

import luaj.LuaThread;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class DebugLib$getlocal extends VarArgFunction {
    final /* synthetic */ DebugLib T;

    DebugLib$getlocal(DebugLib debugLib) {
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
        LuaValue luaValueV = varargs.v(i);
        int iD = varargs.D(i + 1);
        if (luaValueV.g1()) {
            return !luaValueV.f1() ? LuaValue.f1673c : luaValueV.w0().R.a(iD, 0);
        }
        int iD2 = varargs.D(i);
        DebugLib$b debugLib$bZ2 = this.T.Z2(luaThreadJ);
        int i2 = debugLib$bZ2.f1757b;
        if (debugLib$bZ2.e(1).f1749a == this) {
            iD2++;
            i2--;
        }
        DebugLib$a debugLib$aE = debugLib$bZ2.e(iD2);
        if (debugLib$aE != null) {
            return debugLib$aE.b(iD);
        }
        return LuaValue.l0(i, "debug.getlocal", "level out of range: " + iD2 + " not between 1 and " + i2);
    }
}
