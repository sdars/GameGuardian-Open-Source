package android.ext;

import java.util.ArrayList;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$loadResults extends Script$BusyApiFunction {
    ArrayList f0;
    final /* synthetic */ Script g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Script$loadResults(Script script) {
        super(script);
        this.g0 = script;
        this.f0 = null;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 1;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        this.g0.y3();
        ArrayList arrayListR3 = Script.r3(varargs);
        MainService.instance.n(this.g0.t3());
        if (arrayListR3.size() == 0) {
            return LuaValue.f1674d;
        }
        this.f0 = arrayListR3;
        return super.b3(varargs);
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        try {
            MainService.instance.i.f0(this.g0.t3(), this.f0);
            this.f0 = null;
            return null;
        } catch (Throwable th) {
            this.f0 = null;
            throw th;
        }
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.loadResults(table results) -> true || string with error";
    }
}
