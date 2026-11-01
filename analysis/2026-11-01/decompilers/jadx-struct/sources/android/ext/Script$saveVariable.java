package android.ext;

import luaj.Varargs;
import luaj.lib.GgLib$saveVariable;

/* JADX INFO: loaded from: classes.dex */
final class Script$saveVariable extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$saveVariable(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 2;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        return new GgLib$saveVariable(this.e0.T).invoke(varargs);
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.saveVariable(mixed variable, string filename) -> true || string with error";
    }
}
