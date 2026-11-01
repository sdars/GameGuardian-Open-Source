package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$isPackageInstalled extends Script$ApiFunction {
    Script$isPackageInstalled() {
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 1;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        return LuaValue.H2(Tools.e1(varargs.E(1)));
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.isPackageInstalled(string pkg) -> bool";
    }
}
