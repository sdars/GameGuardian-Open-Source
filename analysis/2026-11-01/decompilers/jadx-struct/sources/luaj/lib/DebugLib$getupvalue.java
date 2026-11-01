package luaj.lib;

import luaj.LuaClosure;
import luaj.LuaFunction;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class DebugLib$getupvalue extends VarArgFunction {
    DebugLib$getupvalue() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaClosure luaClosure;
        LuaString luaStringC3;
        LuaFunction luaFunctionC = varargs.C(1);
        int iD = varargs.D(2);
        return (!(luaFunctionC instanceof LuaClosure) || (luaStringC3 = DebugLib.c3((luaClosure = (LuaClosure) luaFunctionC), iD)) == null) ? LuaValue.f1673c : LuaValue.N2(luaStringC3, luaClosure.S[iD - 1].b());
    }
}
