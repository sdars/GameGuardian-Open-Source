package android.ext;

import catch_.me_.if_.you_.can_.R$string;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$toast extends Script$ApiFunction {
    Script$toast() {
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 2;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        n2.i(new Script$toast$1(this, Tools.N1(R$string.script) + ": " + varargs.E(1), varargs.V(2, false)));
        return LuaValue.f1673c;
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.toast(string text [, bool fast = false]) -> nil";
    }
}
