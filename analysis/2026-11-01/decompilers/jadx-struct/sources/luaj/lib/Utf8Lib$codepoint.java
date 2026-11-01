package luaj.lib;

import java.util.Arrays;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Utf8Lib$codepoint extends VarArgFunction {
    Utf8Lib$codepoint() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaString luaStringH = varargs.H(1);
        int i = luaStringH.R;
        int iC3 = StringLib.c3(varargs.Y(2, 1), i);
        int iC4 = StringLib.c3(varargs.Y(3, iC3), i);
        if (iC3 < 1 || iC3 > i + 1) {
            Utf8Lib.a3(T2(), 2, iC3, i);
        }
        if (iC4 > i) {
            Utf8Lib.X2(T2(), 3, iC4, i);
        }
        if (iC3 > iC4) {
            return LuaValue.f1676f;
        }
        int i2 = (iC4 - iC3) + 1;
        LuaValue[] luaValueArr = new LuaValue[i2];
        byte[] bArr = luaStringH.P;
        int i3 = luaStringH.Q;
        int i4 = luaStringH.R + i3;
        int i5 = iC3 - 1;
        int i6 = 0;
        while (i5 < iC4) {
            int iY2 = Utf8Lib.Y2(bArr, i3 + i5, i4);
            int i7 = iY2 >> 28;
            int i8 = iY2 & 268435455;
            if (i7 == 5) {
                throw Utf8Lib.Z2((i8 - i3) + 1);
            }
            i5 += i7;
            luaValueArr[i6] = LuaValue.I2(i8);
            i6++;
        }
        if (i6 == 0) {
            return LuaValue.f1676f;
        }
        if (i6 < i2) {
            luaValueArr = (LuaValue[]) Arrays.copyOf(luaValueArr, i6);
        }
        return LuaValue.O2(luaValueArr);
    }
}
