package android.ext;

import luaj.LuaLong;
import luaj.LuaTable;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$getSelectedElements extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$getSelectedElements(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 0;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs c3(Varargs varargs) {
        n1 n1Var = MainService.instance.N;
        boolean[] zArrF = n1Var.f();
        LuaTable luaTable = new LuaTable();
        int i = 1;
        for (int i2 = 0; i2 < zArrF.length; i2++) {
            try {
                if (zArrF[i2]) {
                    int i3 = i + 1;
                    try {
                        luaTable.Y1(i, LuaLong.I2(n1Var.e(i2)));
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
        return "gg.getSelectedElements() -> table || string with error";
    }
}
