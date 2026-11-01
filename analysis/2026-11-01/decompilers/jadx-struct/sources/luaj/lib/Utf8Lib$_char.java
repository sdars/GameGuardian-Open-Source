package luaj.lib;

import java.util.Arrays;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Utf8Lib$_char extends VarArgFunction {
    Utf8Lib$_char() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        int i;
        int i2;
        int iU = varargs.U();
        if (iU == 0) {
            return LuaValue.L;
        }
        int i3 = iU * 4;
        byte[] bArrCopyOf = new byte[i3];
        int i4 = 0;
        for (int i5 = 1; i5 <= iU; i5++) {
            int iD = varargs.D(i5);
            if (iD < 0 || iD > 1114111) {
                LuaValue.l0(i5, T2(), "'" + iD + "': value out of range [0; 1114111]");
            }
            if (iD <= 127) {
                i = 1;
                i2 = 0;
            } else if (iD <= 2047) {
                i = 2;
                i2 = 192;
            } else if (iD <= 65535) {
                i = 3;
                i2 = 224;
            } else {
                i = 4;
                i2 = 240;
            }
            for (int i6 = i - 1; i6 > 0; i6--) {
                bArrCopyOf[i4 + i6] = (byte) ((iD & 63) | 128);
                iD >>= 6;
            }
            bArrCopyOf[i4] = (byte) (iD | i2);
            i4 += i;
        }
        if (i4 < i3) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i4);
        }
        return LuaString.p3(bArrCopyOf, 0, i4);
    }
}
