package luaj.lib;

import java.io.InputStream;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$load extends VarArgFunction {
    final /* synthetic */ BaseLib T;

    BaseLib$load(BaseLib baseLib) {
        this.T = baseLib;
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaValue luaValueW = varargs.w();
        if (!luaValueW.n1() && !luaValueW.g1()) {
            LuaValue.l0(1, "load", "string or function expected, got " + luaValueW.D2());
        }
        String strZ = varargs.Z(2, luaValueW.n1() ? luaValueW.g0() : "=(load)");
        String strZ2 = varargs.Z(3, "bt");
        LuaValue luaValueD0 = varargs.d0(4, this.T.T);
        LuaString luaStringQ2 = luaValueW.n1() ? luaValueW.q2() : null;
        InputStream inputStreamK3 = luaStringQ2 != null ? luaStringQ2.k3() : new BaseLib$d(luaValueW.y0());
        if (this.T.U != null) {
            inputStreamK3 = this.T.Y2(luaStringQ2, null, false, inputStreamK3);
        }
        return this.T.b3(inputStreamK3, strZ, strZ2, luaValueD0);
    }
}
