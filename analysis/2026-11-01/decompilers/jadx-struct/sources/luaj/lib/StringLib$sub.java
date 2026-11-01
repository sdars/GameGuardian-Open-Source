package luaj.lib;

import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class StringLib$sub extends VarArgFunction {
    StringLib$sub() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaString luaStringH = varargs.H(1);
        int iS1 = luaStringH.s1();
        int iC3 = StringLib.c3(varargs.D(2), iS1);
        int iC4 = StringLib.c3(varargs.Y(3, -1), iS1);
        if (iC3 < 1) {
            iC3 = 1;
        }
        if (iC4 <= iS1) {
            iS1 = iC4;
        }
        return iC3 <= iS1 ? luaStringH.j3(iC3 - 1, iS1) : LuaValue.L;
    }
}
