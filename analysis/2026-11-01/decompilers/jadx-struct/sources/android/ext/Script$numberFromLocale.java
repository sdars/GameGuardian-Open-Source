package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$numberFromLocale extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$numberFromLocale(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 1;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        return LuaValue.K2(Script.E3(varargs.h0(1)));
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.numberFromLocale(string num) -> string";
    }
}
