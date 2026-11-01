package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Bit32Lib$Bit32LibV extends VarArgFunction {
    Bit32Lib$Bit32LibV() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        switch (this.R) {
            case 0:
                return Bit32Lib.Y2(varargs);
            case 1:
                return Bit32Lib.a3(varargs);
            case 2:
                return Bit32Lib.b3(varargs);
            case 3:
                return Bit32Lib.c3(varargs);
            case 4:
                return Bit32Lib.d3(varargs);
            case 5:
                return Bit32Lib.e3((int) varargs.F(1), (int) varargs.F(2), (int) varargs.a0(3, 1L));
            case 6:
                return Bit32Lib.h3((int) varargs.F(1), (int) varargs.F(2), (int) varargs.F(3), (int) varargs.a0(4, 1L));
            default:
                return LuaValue.f1673c;
        }
    }
}
