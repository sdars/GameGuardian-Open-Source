package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$copyText extends Script$ApiFunction {
    Script$copyText() {
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 2;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        String strE = varargs.E(1);
        if (varargs.V(2, true)) {
            strE = Script.D3(strE);
        }
        Tools.z(b2.g(strE));
        return LuaValue.f1673c;
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.copyText(string text [, bool fixLocale = true]) -> nil";
    }
}
