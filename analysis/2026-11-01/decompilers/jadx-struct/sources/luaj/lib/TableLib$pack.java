package luaj.lib;

import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
class TableLib$pack extends VarArgFunction {
    TableLib$pack() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaTable luaTableT2 = LuaValue.t2(varargs, 1);
        luaTableT2.g2("n", varargs.U());
        return luaTableT2;
    }
}
