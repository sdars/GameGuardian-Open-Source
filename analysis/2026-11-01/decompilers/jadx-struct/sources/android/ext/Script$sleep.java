package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$sleep extends Script$ApiFunction {
    Script$sleep() {
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 1;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        int iD = varargs.D(1);
        if (iD < 0) {
            throw new luaj.d("milliseconds < 0: " + iD);
        }
        try {
            Thread.sleep(iD);
            return LuaValue.f1673c;
        } catch (InterruptedException e2) {
            e1.s("Interrupted sleep", e2);
            throw new luaj.d(e2);
        }
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.sleep(int milliseconds) -> nil";
    }
}
