package luaj.lib;

import luaj.LuaFunction;
import luaj.LuaThread;
import luaj.LuaThread$a;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class DebugLib$sethook extends VarArgFunction {
    final /* synthetic */ DebugLib T;

    DebugLib$sethook(DebugLib debugLib) {
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
        LuaFunction luaFunctionX = varargs.X(i, null);
        String strZ = varargs.Z(i + 1, "");
        int iY = varargs.Y(i + 2, 0);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = 0; i2 < strZ.length(); i2++) {
            char cCharAt = strZ.charAt(i2);
            if (cCharAt == 'c') {
                z = true;
            } else if (cCharAt == 'l') {
                z2 = true;
            } else if (cCharAt == 'r') {
                z3 = true;
            }
        }
        LuaThread$a luaThread$a = luaThreadJ.P;
        luaThread$a.f1670f = luaFunctionX;
        luaThread$a.h = z;
        luaThread$a.f1671g = z2;
        luaThread$a.j = iY;
        luaThread$a.i = z3;
        this.T.Y2().l(luaThread$a);
        return LuaValue.f1676f;
    }
}
