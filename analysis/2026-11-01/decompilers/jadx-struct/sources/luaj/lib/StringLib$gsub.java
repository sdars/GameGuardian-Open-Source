package luaj.lib;

import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class StringLib$gsub extends VarArgFunction {
    StringLib$gsub() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaString luaStringH = varargs.H(1);
        int iS1 = luaStringH.s1();
        LuaString luaStringH2 = varargs.H(2);
        LuaValue luaValueV = varargs.v(3);
        int iY = varargs.Y(4, iS1 + 1);
        int i = 0;
        int i2 = (luaStringH2.s1() <= 0 || luaStringH2.T2(0) != 94) ? 0 : 1;
        f.a aVar = new f.a(iS1);
        StringLib$b stringLib$b = new StringLib$b(varargs, luaStringH, luaStringH2);
        int i3 = 0;
        int i4 = -1;
        while (i < iY) {
            stringLib$b.p();
            int iG = stringLib$b.g(i3, i2);
            if (iG != -1 && iG != i4) {
                i++;
                stringLib$b.b(aVar, i3, iG, luaValueV);
                i3 = iG;
                i4 = i3;
            } else {
                if (i3 >= iS1) {
                    break;
                }
                aVar.a((byte) luaStringH.g3(i3));
                i3++;
            }
            if (i2 != 0) {
                break;
            }
        }
        aVar.c(luaStringH.j3(i3, iS1));
        return LuaValue.N2(aVar.l(), LuaValue.I2(i));
    }
}
