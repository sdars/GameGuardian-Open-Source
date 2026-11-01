package android.ext;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$searchPointer extends Script$BusyApiFunction {
    final /* synthetic */ Script f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Script$searchPointer(Script script) {
        super(script);
        this.f0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 4;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        this.f0.y3();
        try {
            if (i2.p(this.f0.t3(), (short) varargs.D(1), varargs.a0(2, 0L), varargs.a0(3, -1L), varargs.a0(4, 0L))) {
                return LuaValue.f1674d;
            }
            return null;
        } catch (NumberFormatException e2) {
            return LuaValue.K2(Script.V3(e2));
        }
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.searchPointer(int maxOffset [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]) -> true || string with error";
    }
}
