package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
abstract class TableLibFunction extends LibFunction {
    TableLibFunction() {
    }

    @Override // luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call() {
        return LuaValue.k0(1, "table expected, got no value");
    }
}
