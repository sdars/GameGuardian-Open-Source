package luaj.lib;

import luaj.LuaString;
import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class StringLib$reverse extends OneArgFunction {
    StringLib$reverse() {
    }

    @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) {
        LuaString luaStringG0 = luaValue.G0();
        int iS1 = luaStringG0.s1();
        if (iS1 == 0) {
            return LuaValue.L;
        }
        byte[] bArr = new byte[iS1];
        byte[] bArr2 = luaStringG0.P;
        int i = iS1 - 1;
        int i2 = luaStringG0.Q;
        int i3 = iS1 + i2;
        while (i2 < i3) {
            bArr[i] = bArr2[i2];
            i2++;
            i--;
        }
        return LuaString.o3(bArr);
    }
}
