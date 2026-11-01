package android.ext;

import java.io.Writer;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$copyMemory extends Script$BusyApiFunction {
    final /* synthetic */ Script f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Script$copyMemory(Script script) {
        super(script);
        this.f0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 3;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        MainService.instance.i.p(this.f0.t3(), varargs.F(1), varargs.F(2), varargs.D(3));
        return null;
    }

    @Override // android.ext.Script$ApiFunction
    protected boolean d3(Writer writer, int i, LuaValue luaValue) {
        return ((i == 1 || i == 2) && luaValue.j1()) ? Script$ApiFunction.h3(writer, luaValue) : super.d3(writer, i, luaValue);
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.copyMemory(long from, long to, int bytes) -> true || string with error";
    }
}
