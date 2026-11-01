package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$getRanges extends Script$ApiFunction {
    Script$getRanges() {
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 0;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        return LuaValue.I2(Config.i);
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.getRanges() -> int";
    }
}
