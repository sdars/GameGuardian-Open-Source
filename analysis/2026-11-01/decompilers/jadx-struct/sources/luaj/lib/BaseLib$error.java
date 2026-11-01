package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$error extends TwoArgFunction {
    BaseLib$error() {
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        if (luaValue.l1()) {
            throw new luaj.d(LuaValue.f1673c);
        }
        if (!luaValue.n1() || luaValue2.H1(1) == 0) {
            throw new luaj.d(luaValue);
        }
        throw new luaj.d(luaValue.g0(), luaValue2.H1(1));
    }
}
