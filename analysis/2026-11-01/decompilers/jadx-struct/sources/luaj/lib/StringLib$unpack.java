package luaj.lib;

import android.ext.t2;
import java.util.ArrayList;
import luaj.LuaDouble;
import luaj.LuaLong;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class StringLib$unpack extends VarArgFunction {
    StringLib$unpack() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaValue luaValueJ2;
        long jE3;
        byte b2 = 1;
        String strE = varargs.E(1);
        LuaString luaStringH = varargs.H(2);
        int iS1 = luaStringH.s1();
        char c2 = 3;
        int iC3 = StringLib.c3(varargs.Y(3, 1), iS1);
        int i = iC3 - 1;
        x(i >= 0 && i <= iS1, 3, "initial position (" + iC3 + ") out of string (length = " + iS1 + ")");
        StringLib$c stringLib$c = new StringLib$c(strE);
        int length = strE.length();
        ArrayList arrayList = new ArrayList();
        while (stringLib$c.f1789e < length) {
            byte bY2 = StringLib.Y2(stringLib$c, i);
            int i2 = stringLib$c.h;
            int i3 = stringLib$c.i;
            int i4 = i + i2;
            int i5 = i4 + i3;
            if (i5 > iS1) {
                Object[] objArr = new Object[4];
                objArr[0] = Integer.valueOf(iS1);
                objArr[b2] = Character.valueOf(stringLib$c.f1790f);
                objArr[2] = Integer.valueOf(i5);
                objArr[c2] = Integer.valueOf(stringLib$c.f1789e);
                LuaValue.k0(2, t2.f("data string too short (%d) for option '%c' (need %d) at pos %d", objArr));
            }
            switch (bY2) {
                case 1:
                case 2:
                    arrayList.add(LuaLong.I2(StringLib.e3(stringLib$c, luaStringH, i4, bY2 == b2)));
                    break;
                case 3:
                    luaValueJ2 = LuaDouble.J2(Float.intBitsToFloat((int) StringLib.e3(stringLib$c, luaStringH, i4, false)));
                    arrayList.add(luaValueJ2);
                    b2 = 1;
                    break;
                case 4:
                    luaValueJ2 = luaStringH.j3(i4, i5);
                    arrayList.add(luaValueJ2);
                    b2 = 1;
                    break;
                case 5:
                    int iE3 = (int) StringLib.e3(stringLib$c, luaStringH, i4, false);
                    i4 += iE3;
                    int i6 = i4 + i3;
                    x(i6 <= iS1, 2, "data string too short (" + iS1 + " but need " + i6 + ") at pos " + stringLib$c.f1789e);
                    luaValueJ2 = luaStringH.j3(i5, iE3 + i5);
                    arrayList.add(luaValueJ2);
                    b2 = 1;
                    break;
                case 6:
                    int iC4 = luaStringH.c3((byte) 0, i4);
                    boolean z = iC4 != -1;
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = Character.valueOf(stringLib$c.f1790f);
                    objArr2[b2] = Integer.valueOf(stringLib$c.f1789e);
                    x(z, 2, t2.f("zero char not found for option '%c' at pos %d", objArr2));
                    arrayList.add(luaStringH.j3(i4, iC4));
                    i4 = iC4 + 1;
                    break;
                case 9:
                    jE3 = StringLib.e3(stringLib$c, luaStringH, i4, false);
                    arrayList.add(luaValueI2);
                    break;
                case 10:
                    stringLib$c.i = 8;
                    jE3 = StringLib.e3(stringLib$c, luaStringH, i4, false);
                    stringLib$c.i = b2;
                    LuaValue luaValueI2 = StringLib.e3(stringLib$c, luaStringH, i4 + 8, false) == 1 ? LuaLong.I2(jE3) : LuaDouble.J2(Double.longBitsToDouble(jE3));
                    arrayList.add(luaValueI2);
                    break;
            }
            i = i4 + i3;
            c2 = 3;
        }
        arrayList.add(LuaValue.I2(i + b2));
        return LuaValue.O2((LuaValue[]) arrayList.toArray(new LuaValue[arrayList.size()]));
    }
}
