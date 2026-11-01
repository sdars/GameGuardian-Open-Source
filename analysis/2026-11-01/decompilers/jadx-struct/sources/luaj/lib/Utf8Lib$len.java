package luaj.lib;

import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Utf8Lib$len extends VarArgFunction {
    Utf8Lib$len() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaString luaStringH = varargs.H(1);
        int i = luaStringH.R;
        int iC3 = StringLib.c3(varargs.Y(2, 1), i);
        int iC4 = StringLib.c3(varargs.Y(3, -1), i);
        if (iC3 < 1 || iC3 > i + 1) {
            Utf8Lib.a3(T2(), 2, iC3, i);
        }
        if (iC4 > i) {
            Utf8Lib.X2(T2(), 3, iC4, i);
        }
        if (iC3 > iC4) {
            return LuaValue.f1677g;
        }
        byte[] bArr = luaStringH.P;
        int i2 = luaStringH.Q;
        int i3 = luaStringH.R + i2;
        int i4 = iC3 - 1;
        int i5 = 0;
        while (i4 < iC4) {
            int iY2 = Utf8Lib.Y2(bArr, i2 + i4, i3);
            int i6 = iY2 >> 28;
            if (i6 == 5) {
                return LuaValue.N2(LuaValue.f1673c, LuaValue.I2(((268435455 & iY2) - i2) + 1));
            }
            i4 += i6;
            i5++;
        }
        return LuaValue.I2(i5);
    }
}
