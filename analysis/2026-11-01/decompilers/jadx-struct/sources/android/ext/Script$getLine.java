package android.ext;

import luaj.LuaClosure;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$getLine extends Script$DebugFunction {
    final /* synthetic */ Script f0;

    Script$getLine(Script script) {
        this.f0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 0;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        luaj.h hVar;
        LuaClosure luaClosure = this.e0;
        int i = -1;
        if (luaClosure != null && (hVar = luaClosure.R) != null && hVar.f1726d != null && luaClosure.W >= 0) {
            int i2 = this.e0.W;
            LuaClosure luaClosure2 = this.e0;
            int[] iArr = luaClosure2.R.f1726d;
            if (i2 < iArr.length) {
                i = iArr[luaClosure2.W];
            }
        }
        return LuaValue.I2(i);
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.getLine() -> int";
    }
}
