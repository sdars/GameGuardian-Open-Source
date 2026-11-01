package luaj.lib;

import luaj.LuaDouble;
import luaj.LuaLong;
import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class MathLib$type extends OneArgFunction {
    MathLib$type() {
    }

    @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) {
        String str;
        if (luaValue instanceof LuaLong) {
            str = "integer";
        } else {
            if (!(luaValue instanceof LuaDouble)) {
                return LuaValue.f1673c;
            }
            str = "float";
        }
        return LuaValue.K2(str);
    }
}
