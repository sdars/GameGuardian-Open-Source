package luaj.lib;

import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
public class PackageLib$preload_searcher extends VarArgFunction {
    final /* synthetic */ PackageLib T;

    public PackageLib$preload_searcher(PackageLib packageLib) {
        this.T = packageLib;
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaString luaStringH = varargs.H(1);
        LuaValue luaValueU0 = this.T.U.U0(PackageLib.c0).U0(luaStringH);
        if (!luaValueU0.l1()) {
            return luaValueU0;
        }
        return LuaValue.K2("\n\tno field package.preload['" + luaStringH + "']");
    }
}
