package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$showUiButton extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$showUiButton(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 0;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        MainService.instance.R0(true);
        return LuaValue.f1673c;
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.showUiButton() -> nil";
    }
}
