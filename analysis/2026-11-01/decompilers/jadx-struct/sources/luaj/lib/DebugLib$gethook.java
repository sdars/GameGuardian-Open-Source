package luaj.lib;

import luaj.LuaThread$a;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class DebugLib$gethook extends VarArgFunction {
    final /* synthetic */ DebugLib T;

    DebugLib$gethook(DebugLib debugLib) {
        this.T = debugLib;
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaThread$a luaThread$a = (varargs.U() > 0 ? varargs.J(1) : this.T.T.f0).P;
        LuaValue luaValue = luaThread$a.f1670f;
        if (luaValue == null) {
            luaValue = LuaValue.f1673c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(luaThread$a.h ? "c" : "");
        sb.append(luaThread$a.i ? "r" : "");
        sb.append(luaThread$a.f1671g ? "l" : "");
        return LuaValue.M2(luaValue, LuaValue.K2(sb.toString()), LuaValue.I2(luaThread$a.j));
    }
}
