package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$numberToLocale extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$numberToLocale(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 1;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        return LuaValue.K2(Script.D3(varargs.h0(1)));
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.numberToLocale(string num) -> string";
    }
}
