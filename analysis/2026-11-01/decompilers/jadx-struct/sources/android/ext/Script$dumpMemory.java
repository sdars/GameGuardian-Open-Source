package android.ext;

import catch_.me_.if_.you_.can_.R$string;
import java.io.Writer;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$dumpMemory extends Script$BusyApiFunction {
    final /* synthetic */ Script f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Script$dumpMemory(Script script) {
        super(script);
        this.f0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 4;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        MainService mainService = MainService.instance;
        z1$d z1_d = mainService.v0;
        String str = z1_d == null ? "unknown" : z1_d.f1434c;
        if (!mainService.a1()) {
            return LuaValue.K2(b2.f(R$string.busy_dialog_fail));
        }
        mainService.i.w(this.f0.t3(), varargs.F(1), varargs.F(2), varargs.Y(4, 0), varargs.E(3), str);
        return null;
    }

    @Override // android.ext.Script$ApiFunction
    protected boolean d3(Writer writer, int i, LuaValue luaValue) {
        if (i == 1 || i == 2) {
            if (luaValue.j1()) {
                return Script$ApiFunction.h3(writer, luaValue);
            }
        } else if (i == 4 && luaValue.h1()) {
            return Script$ApiFunction.g3(writer, this.f0.g0.i, luaValue);
        }
        return super.d3(writer, i, luaValue);
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.dumpMemory(long from, long to, string dir [, int flags = nil]) -> true || string with error";
    }
}
