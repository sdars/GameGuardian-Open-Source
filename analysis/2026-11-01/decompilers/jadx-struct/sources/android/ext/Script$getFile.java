package android.ext;

import luaj.LuaClosure;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$getFile extends Script$DebugFunction {
    final /* synthetic */ Script f0;

    Script$getFile(Script script) {
        this.f0 = script;
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 0;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        String strG0;
        LuaClosure luaClosure = this.e0;
        if (luaClosure == null) {
            strG0 = "?";
        } else {
            String str = luaClosure.U;
            if (str != null) {
                strG0 = str;
            } else {
                luaj.h hVar = luaClosure.R;
                if (hVar != null) {
                    LuaString luaString = hVar.f1729g;
                    strG0 = luaString != null ? luaString.g0() : "??";
                } else {
                    strG0 = "???";
                }
            }
        }
        if (strG0.startsWith("@")) {
            strG0 = strG0.substring(1);
        }
        return LuaValue.K2(strG0);
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.getFile() -> string";
    }
}
