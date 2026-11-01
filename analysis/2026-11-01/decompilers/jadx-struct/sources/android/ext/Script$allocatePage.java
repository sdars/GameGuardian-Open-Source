package android.ext;

import catch_.me_.if_.you_.can_.R$string;
import java.io.Writer;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$allocatePage extends Script$BusyApiFunction {
    final /* synthetic */ Script f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Script$allocatePage(Script script) {
        super(script);
        this.f0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 2;
    }

    @Override // android.ext.Script$ApiFunction
    protected Varargs a3() {
        long j = Script.s0;
        if (-1024 >= j || j > 0) {
            return LuaValue.I2(Script.s0);
        }
        return LuaValue.K2(b2.f(R$string.allocate_fail) + ' ' + (-j));
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        int iY = varargs.Y(1, 6);
        long jA0 = varargs.a0(2, 0L);
        Script.s0 = 0L;
        MainService.instance.i.f(this.f0.t3(), jA0, iY);
        return null;
    }

    @Override // android.ext.Script$ApiFunction
    protected boolean d3(Writer writer, int i, LuaValue luaValue) {
        if (i != 1) {
            if (i == 2 && luaValue.j1()) {
                return Script$ApiFunction.h3(writer, luaValue);
            }
        } else if (luaValue.h1()) {
            return Script$ApiFunction.g3(writer, this.f0.g0.f377g, luaValue);
        }
        return super.d3(writer, i, luaValue);
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.allocatePage([int mode = gg.PROT_READ | gg.PROT_EXEC [, long address = 0]) -> long || string with error";
    }
}
