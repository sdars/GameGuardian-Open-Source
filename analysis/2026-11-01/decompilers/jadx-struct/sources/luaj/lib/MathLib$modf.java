package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
class MathLib$modf extends VarArgFunction {
    MathLib$modf() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaValue luaValueW = varargs.w();
        double d2 = 0.0d;
        if (!luaValueW.k1()) {
            double dX0 = luaValueW.x0();
            double dFloor = dX0 > 0.0d ? Math.floor(dX0) : Math.ceil(dX0);
            d2 = dX0 != dFloor ? dX0 - dFloor : 0.0d;
            luaValueW = LuaValue.J2(dFloor);
        }
        return LuaValue.N2(luaValueW, LuaValue.J2(d2));
    }
}
