package luaj.lib;

import luaj.LuaTable;
import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
public class TableLib extends TwoArgFunction {
    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        LuaTable luaTable = new LuaTable();
        luaTable.i2("concat", new TableLib$concat());
        luaTable.i2("insert", new TableLib$insert());
        luaTable.i2("move", new TableLib$move());
        luaTable.i2("pack", new TableLib$pack());
        luaTable.i2("remove", new TableLib$remove());
        luaTable.i2("sort", new TableLib$sort());
        luaTable.i2("unpack", new TableLib$unpack());
        luaValue2.i2("table", luaTable);
        if (!luaValue2.T0("package").l1()) {
            luaValue2.T0("package").T0("loaded").i2("table", luaTable);
        }
        return LuaValue.f1673c;
    }
}
