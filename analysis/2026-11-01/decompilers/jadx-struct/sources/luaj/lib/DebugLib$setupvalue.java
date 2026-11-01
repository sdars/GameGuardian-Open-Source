package luaj.lib;

import luaj.LuaClosure;
import luaj.LuaFunction;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class DebugLib$setupvalue extends VarArgFunction {
    DebugLib$setupvalue() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaClosure luaClosure;
        LuaString luaStringC3;
        LuaFunction luaFunctionC = varargs.C(1);
        int iD = varargs.D(2);
        LuaValue luaValueV = varargs.v(3);
        if (!(luaFunctionC instanceof LuaClosure) || (luaStringC3 = DebugLib.c3((luaClosure = (LuaClosure) luaFunctionC), iD)) == null) {
            return LuaValue.f1673c;
        }
        luaClosure.S[iD - 1].c(luaValueV);
        return luaStringC3;
    }
}
