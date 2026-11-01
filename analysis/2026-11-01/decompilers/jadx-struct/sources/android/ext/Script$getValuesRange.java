package android.ext;

import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaTable$i;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$getValuesRange extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$getValuesRange(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 1;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        LuaTable luaTableI = varargs.I(1);
        LuaTable luaTable = new LuaTable();
        luaTable.w3(luaTableI.d3(), luaTable.f3());
        LuaString luaString = Script.t0[0];
        LuaTable$i luaTable$iS3 = luaTableI.s3();
        while (luaTable$iS3.c()) {
            LuaValue luaValueD = luaTable$iS3.d();
            long jC0 = !luaValueD.o1() ? luaValueD.C0() : Script.i3(luaValueD.H0(), luaString);
            int iA = luaTable$iS3.a();
            if (iA == 0) {
                luaTable.d2(luaTable$iS3.b(), LuaValue.K2(RegionList.a(jC0).toString()));
            } else {
                luaTable.Y1(iA, LuaValue.K2(RegionList.a(jC0).toString()));
            }
        }
        return luaTable;
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.getValuesRange(table values) -> table || string with error";
    }
}
