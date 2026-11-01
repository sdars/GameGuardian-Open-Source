package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$isVisible extends Script$ApiFunction {
    Script$isVisible() {
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 0;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        return LuaValue.H2(MainService.instance.n != null);
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.isVisible() -> bool";
    }
}
