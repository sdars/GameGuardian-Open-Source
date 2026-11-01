package android.ext;

import catch_.me_.if_.you_.can_.R$id;
import java.io.Writer;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$setRanges extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$setRanges(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 1;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        Config.b(R$id.config_ranges).f42d = varargs.D(1);
        Config.k();
        return LuaValue.f1673c;
    }

    @Override // android.ext.Script$ApiFunction
    protected boolean d3(Writer writer, int i, LuaValue luaValue) {
        return (i == 1 && luaValue.h1()) ? Script$ApiFunction.g3(writer, this.e0.g0.f371a, luaValue) : super.d3(writer, i, luaValue);
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.setRanges(int ranges) -> nil";
    }
}
