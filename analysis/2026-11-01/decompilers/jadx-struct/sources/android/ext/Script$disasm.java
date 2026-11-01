package android.ext;

import java.io.Writer;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$disasm extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$disasm(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 3;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        long jF = varargs.F(2);
        int iD = varargs.D(3);
        int iD2 = varargs.D(1);
        if (iD2 == 4) {
            return LuaString.K2(n.o(new n(), jF, iD));
        }
        if (iD2 == 5) {
            return LuaString.K2(n.q(new n(), jF, iD));
        }
        if (iD2 == 6) {
            StringBuilder sb = new StringBuilder();
            m.g(m.d(), jF, iD, sb);
            return LuaString.K2(sb.toString());
        }
        return LuaValue.l0(1, "gg.disasm", "unknown type: " + varargs.D(1));
    }

    @Override // android.ext.Script$ApiFunction
    protected boolean d3(Writer writer, int i, LuaValue luaValue) {
        if (i != 1) {
            if ((i == 2 || i == 3) && luaValue.j1()) {
                return Script$ApiFunction.h3(writer, luaValue);
            }
        } else if (luaValue.h1()) {
            return Script$ApiFunction.g3(writer, this.e0.g0.j, luaValue);
        }
        return super.d3(writer, i, luaValue);
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.disasm(int type, long address, int opcode) -> string";
    }
}
