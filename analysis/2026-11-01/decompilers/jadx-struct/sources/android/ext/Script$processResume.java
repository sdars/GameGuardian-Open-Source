package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$processResume extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$processResume(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 0;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        return LuaValue.H2(MainService.instance.A0(this.e0.t3()));
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.processResume() -> bool";
    }
}
