package android.ext;

import luaj.LuaTable;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$getSelectedListItems extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$getSelectedListItems(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 0;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        h2 h2Var;
        d.e eVarF = MainService.instance.t0.f();
        LuaTable luaTable = new LuaTable();
        int i = 1;
        for (int i2 = 0; i2 < eVarF.l(); i2++) {
            try {
                if (eVarF.a(i2) && (h2Var = (h2) eVarF.n(i2)) != null) {
                    int i3 = i + 1;
                    try {
                        luaTable.Y1(i, Script.o3(h2Var));
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
        return "gg.getSelectedListItems() -> table || string with error";
    }
}
