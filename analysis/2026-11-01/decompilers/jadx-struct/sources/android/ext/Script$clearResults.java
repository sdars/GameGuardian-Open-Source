package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$clearResults extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$clearResults(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 0;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        Script script = this.e0;
        script.d0 = Script.J3(script.d0);
        MainService.instance.n(this.e0.t3());
        return LuaValue.f1673c;
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.clearResults() -> nil";
    }
}
