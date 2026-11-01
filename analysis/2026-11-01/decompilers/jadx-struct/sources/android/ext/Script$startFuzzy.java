package android.ext;

import java.io.Writer;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$startFuzzy extends Script$BusyApiFunction {
    final /* synthetic */ Script f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Script$startFuzzy(Script script) {
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
            if (t0.m(this.f0.t3(), Script.f3(varargs.Y(1, 127)), varargs.a0(2, 0L), varargs.a0(3, -1L), varargs.a0(4, 0L))) {
                return LuaValue.f1674d;
            }
            return null;
        } catch (NumberFormatException e2) {
            return LuaValue.K2(Script.V3(e2));
        }
    }

    @Override // android.ext.Script$ApiFunction
    protected boolean d3(Writer writer, int i, LuaValue luaValue) {
        if (i != 1) {
            if ((i == 2 || i == 3) && luaValue.j1()) {
                return Script$ApiFunction.h3(writer, luaValue);
            }
        } else if (luaValue.h1()) {
            return Script$ApiFunction.g3(writer, this.f0.g0.f372b, luaValue);
        }
        return super.d3(writer, i, luaValue);
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.startFuzzy([int type = gg.TYPE_AUTO [, long memoryFrom = 0 [, long memoryTo = -1 [, long limit = 0]]]]) -> true || string with error";
    }
}
