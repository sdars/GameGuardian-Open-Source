package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$getActiveTab extends Script$ApiFunction {
    Script$getActiveTab() {
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 0;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        return LuaValue.I2(MainService.instance.H());
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.getActiveTab() -> int";
    }
}
