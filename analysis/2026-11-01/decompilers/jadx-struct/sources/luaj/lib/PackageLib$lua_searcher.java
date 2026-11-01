package luaj.lib;

import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
public class PackageLib$lua_searcher extends VarArgFunction {
    final /* synthetic */ PackageLib T;

    public PackageLib$lua_searcher(PackageLib packageLib) {
        this.T = packageLib;
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaString luaStringH = varargs.H(1);
        LuaValue luaValueU0 = this.T.U.U0(PackageLib.d0);
        if (!luaValueU0.n1()) {
            return LuaValue.K2("\n\tpackage.path is not a string");
        }
        Varargs varargsInvoke = this.T.U.U0(PackageLib.e0).invoke(LuaValue.N2(luaStringH, luaValueU0));
        if (!varargsInvoke.S(1)) {
            return varargsInvoke.v(2).B2();
        }
        LuaString luaStringQ2 = varargsInvoke.w().q2();
        String strG0 = luaStringQ2.g0();
        this.T.T.g0.Y2(null, strG0, true, null);
        LuaValue luaValueQ3 = this.T.T.Q3(strG0);
        if (luaValueQ3.w().g1()) {
            return LuaValue.N2(luaValueQ3.w(), luaStringQ2);
        }
        return LuaValue.N2(LuaValue.f1673c, LuaValue.K2("'" + luaStringQ2 + "': " + luaValueQ3.v(2).g0()));
    }
}
