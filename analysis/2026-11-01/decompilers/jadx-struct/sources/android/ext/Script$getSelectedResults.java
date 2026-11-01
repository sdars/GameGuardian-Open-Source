package android.ext;

import luaj.LuaTable;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$getSelectedResults extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$getSelectedResults(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 0;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        c cVarF;
        d.a aVar = MainService.instance.s0;
        LuaTable luaTable = new LuaTable();
        int i = 1;
        for (int i2 = 0; i2 < aVar.i(); i2++) {
            try {
                if (aVar.c(i2) && (cVarF = aVar.f(i2, null)) != null) {
                    int i3 = i + 1;
                    try {
                        luaTable.Y1(i, Script.n3(null, cVarF));
                    } catch (IndexOutOfBoundsException unused) {
                    }
                    i = i3;
                }
            } catch (IndexOutOfBoundsException unused2) {
            }
        }
        return luaTable;
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.getSelectedResults() -> table || string with error";
    }
}
