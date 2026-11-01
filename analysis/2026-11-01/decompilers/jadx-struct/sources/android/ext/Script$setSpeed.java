package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$setSpeed extends Script$BusyApiFunction {
    final /* synthetic */ Script f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Script$setSpeed(Script script) {
        super(script);
        this.f0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 1;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        double dB = varargs.B(1);
        if (dB >= 1.0E-9d && dB <= 1.0E9d) {
            MainService.instance.S0(this.f0.t3(), dB);
            return null;
        }
        return LuaValue.K2("Speed outside range: " + dB + " (1.0E-9; 1.0E9)");
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.setSpeed(double speed) -> true || string with error";
    }
}
