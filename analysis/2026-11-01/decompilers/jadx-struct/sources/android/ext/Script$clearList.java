package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$clearList extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$clearList(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 0;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        try {
            MainService.instance.t0.c();
            return LuaValue.f1674d;
        } catch (Throwable th) {
            e1.l("Failed clear list", th);
            return LuaValue.K2(Script.V3(th));
        }
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.clearList() -> true || string with error";
    }
}
