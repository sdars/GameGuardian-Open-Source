package android.ext;

import catch_.me_.if_.you_.can_.R$string;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$getLocale extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$getLocale(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 0;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        return LuaValue.K2(b2.f(R$string.lang_code).replace("~", ""));
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.getLocale() -> string";
    }
}
