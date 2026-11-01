package android.ext;

import java.util.regex.Pattern;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$getRangesList extends Script$ApiFunction {
    final /* synthetic */ Script e0;

    Script$getRangesList(Script script) {
        this.e0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 1;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        Pattern patternCompile;
        int i = 1;
        String strZ = varargs.Z(1, "");
        if (strZ.length() > 0) {
            strZ = Tools.k1(strZ);
        }
        LuaTable luaTable = new LuaTable();
        if (strZ.length() > 0) {
            try {
                patternCompile = Pattern.compile(strZ);
            } catch (Throwable th) {
                e1.a(th);
                patternCompile = null;
            }
        } else {
            patternCompile = null;
        }
        LuaString luaStringK2 = LuaString.K2("state");
        LuaString luaStringK3 = LuaString.K2("start");
        LuaString luaStringK4 = LuaString.K2("end");
        LuaString luaStringK5 = LuaString.K2("type");
        LuaString luaStringK6 = LuaString.K2("name");
        LuaString luaStringK7 = LuaString.K2("internalName");
        for (RegionList$b regionList$b : RegionList.getList()) {
            String strA = regionList$b.a();
            if (patternCompile == null || patternCompile.matcher(strA).find()) {
                LuaTable luaTable2 = new LuaTable(0, 6);
                luaTable2.d2(luaStringK2, LuaValue.K2(regionList$b.e().toString()));
                luaTable2.d2(luaStringK3, LuaValue.I2(regionList$b.f356b));
                luaTable2.d2(luaStringK4, LuaValue.I2(regionList$b.f357c));
                luaTable2.d2(luaStringK5, LuaValue.K2(regionList$b.f()));
                luaTable2.d2(luaStringK6, LuaValue.K2(regionList$b.b()));
                luaTable2.d2(luaStringK7, LuaValue.K2(strA));
                luaTable.e2(i, luaTable2);
                i++;
            }
        }
        return luaTable;
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.getRangesList([string filter = '']) -> table";
    }
}
