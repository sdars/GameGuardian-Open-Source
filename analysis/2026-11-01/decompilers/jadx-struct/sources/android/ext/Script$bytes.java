package android.ext;

import java.io.UnsupportedEncodingException;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$bytes extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$bytes(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 2;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        try {
            byte[] bytes = varargs.E(1).getBytes(varargs.Z(2, "UTF-8"));
            LuaTable luaTable = new LuaTable();
            int length = bytes.length;
            luaTable.R1(length);
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                luaTable.Y1(i2, LuaValue.I2(bytes[i] & 255));
                i = i2;
            }
            return luaTable;
        } catch (UnsupportedEncodingException e2) {
            throw new luaj.d(e2);
        }
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.bytes(string text [, string encoding = 'UTF-8']) -> table";
    }
}
