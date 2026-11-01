package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$processToggle extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$processToggle(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 0;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        return LuaValue.H2(MainService.instance.B0(this.e0.t3(), true));
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.processToggle() -> bool";
    }
}
