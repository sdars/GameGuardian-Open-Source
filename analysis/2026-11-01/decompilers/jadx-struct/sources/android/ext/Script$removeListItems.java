package android.ext;

import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaTable$i;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$removeListItems extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$removeListItems(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 1;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        try {
            LuaTable luaTableI = varargs.I(1);
            luaTableI.W1();
            long[] jArr = new long[luaTableI.d3() + luaTableI.e3()];
            int i = 0;
            LuaString luaString = Script.t0[0];
            LuaTable$i luaTable$iS3 = luaTableI.s3();
            while (luaTable$iS3.c()) {
                LuaValue luaValueD = luaTable$iS3.d();
                jArr[i] = luaValueD.o1() ? Script.i3((LuaTable) luaValueD, luaString) : luaValueD.C0();
                i++;
            }
            Object obj = new Object();
            synchronized (obj) {
                try {
                    n2.i(new Script$removeListItems$1(this, jArr, i, obj));
                    Script.W3(obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return LuaValue.f1674d;
        } catch (luaj.d e2) {
            throw e2;
        } catch (Throwable th2) {
            e1.l("Failed remove list items", th2);
            return LuaValue.K2(Script.V3(th2));
        }
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.removeListItems(table items) -> true || string with error";
    }
}
