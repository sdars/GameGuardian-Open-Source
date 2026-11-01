package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$getTargetPackage extends Script$ApiFunction {
    Script$getTargetPackage() {
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 0;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        z1$d z1_d = MainService.instance.v0;
        String str = z1_d != null ? z1_d.f1434c : null;
        return str == null ? LuaValue.f1673c : LuaValue.K2(str);
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.getTargetPackage() -> string || nil";
    }
}
