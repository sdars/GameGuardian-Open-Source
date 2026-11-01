package luaj.lib;

import java.util.Locale;
import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class StringLib$upper extends OneArgFunction {
    StringLib$upper() {
    }

    @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) {
        return LuaValue.K2(luaValue.B0().toUpperCase(Locale.US));
    }
}
