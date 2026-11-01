package luaj.lib;

import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
class Utf8Lib$CodesAux extends VarArgFunction {
    private int T = 0;
    private final LuaString U;

    public Utf8Lib$CodesAux(LuaString luaString) {
        this.U = luaString;
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        int i = this.T;
        LuaString luaString = this.U;
        int i2 = luaString.Q;
        int i3 = luaString.R + i2;
        if (i >= i3) {
            return LuaValue.f1673c;
        }
        int iY2 = Utf8Lib.Y2(luaString.P, i2 + i, i3);
        int i4 = iY2 >> 28;
        int i5 = iY2 & 268435455;
        if (i4 == 5) {
            throw Utf8Lib.Z2((i5 - this.U.Q) + 1);
        }
        this.T = i4 + i;
        return LuaValue.N2(LuaValue.I2(i + 1), LuaValue.I2(i5));
    }
}
