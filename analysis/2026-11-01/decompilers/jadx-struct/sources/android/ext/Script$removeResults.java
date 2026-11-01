package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$removeResults extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$removeResults(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 1;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        this.e0.y3();
        MainService.instance.i.i0(this.e0.t3(), Script.r3(varargs));
        Object obj = new Object();
        synchronized (obj) {
            try {
                n2.i(new Script$removeResults$1(this, obj));
                Script.W3(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return LuaValue.f1674d;
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.removeResults(table results) -> true || string with error";
    }
}
