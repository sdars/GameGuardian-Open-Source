package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$timeJump extends Script$BusyApiFunction {
    final /* synthetic */ Script f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Script$timeJump(Script script) {
        super(script);
        this.f0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 1;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        try {
            MainService.instance.i.d(this.f0.t3(), o2.i(Script.D3(varargs.E(1))));
            return null;
        } catch (NumberFormatException e2) {
            return LuaValue.K2(Script.V3(e2));
        }
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.timeJump(string time) -> true || string with error";
    }
}
