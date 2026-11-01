package luaj.lib;

import android.ext.t2;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class StringLib$packsize extends VarArgFunction {
    StringLib$packsize() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        String strE = varargs.E(1);
        StringLib$c stringLib$c = new StringLib$c(strE);
        int length = strE.length();
        int i = 0;
        while (stringLib$c.f1789e < length) {
            byte bY2 = StringLib.Y2(stringLib$c, i);
            int i2 = stringLib$c.i + stringLib$c.h;
            x(i <= Integer.MAX_VALUE - i2, 1, "format result too large at pos " + stringLib$c.f1789e);
            i += i2;
            if (bY2 == 5 || bY2 == 6) {
                LuaValue.k0(1, t2.f("variable-length format option '%c' at pos %d", Character.valueOf(stringLib$c.f1790f), Integer.valueOf(stringLib$c.f1789e)));
            }
        }
        return LuaValue.I2(i);
    }
}
