package android.ext;

import java.util.ArrayList;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$getListItems extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$getListItems(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 0;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        try {
            ArrayList<h2> arrayList = new ArrayList(MainService.instance.t0.getCount());
            Object obj = new Object();
            synchronized (obj) {
                try {
                    n2.i(new Script$getListItems$1(this, arrayList, obj));
                    Script.W3(obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
            LuaTable luaTable = new LuaTable();
            luaTable.R1(arrayList.size());
            int i = 1;
            for (h2 h2Var : arrayList) {
                if (h2Var != null) {
                    int i2 = i + 1;
                    luaTable.Y1(i, Script.o3(h2Var));
                    i = i2;
                }
            }
            return luaTable;
        } catch (luaj.d e2) {
            throw e2;
        } catch (Throwable th2) {
            e1.l("Failed get list items", th2);
            return LuaValue.K2(Script.V3(th2));
        }
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.getListItems() -> table || string with error";
    }
}
