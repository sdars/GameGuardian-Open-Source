package luaj.lib;

import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class StringLib$_byte extends VarArgFunction {
    StringLib$_byte() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaString luaStringH = varargs.H(1);
        int i = luaStringH.R;
        int iC3 = StringLib.c3(varargs.Y(2, 1), i);
        int iC4 = StringLib.c3(varargs.Y(3, iC3), i);
        if (iC3 <= 0) {
            iC3 = 1;
        }
        if (iC4 <= i) {
            i = iC4;
        }
        if (iC3 > i) {
            return LuaValue.f1676f;
        }
        int i2 = (i - iC3) + 1;
        if (iC3 + i2 <= i) {
            LuaValue.R0("string slice too long");
        }
        LuaValue[] luaValueArr = new LuaValue[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            luaValueArr[i3] = LuaValue.I2(luaStringH.g3((iC3 + i3) - 1));
        }
        return LuaValue.O2(luaValueArr);
    }
}
