package luaj.lib;

import luaj.LuaBoolean;
import luaj.LuaFunction;
import luaj.LuaNil;
import luaj.LuaNumber;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaThread;
import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
final class DebugLib$setmetatable extends TwoArgFunction {
    DebugLib$setmetatable() {
    }

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        LuaTable luaTableL1 = luaValue2.L1(null);
        int iC2 = luaValue.C2();
        if (iC2 == 0) {
            LuaNil.P = luaTableL1;
        } else if (iC2 == 1) {
            LuaBoolean.Q = luaTableL1;
        } else if (iC2 == 3) {
            LuaNumber.P = luaTableL1;
        } else if (iC2 == 4) {
            LuaString.U = luaTableL1;
        } else if (iC2 == 6) {
            LuaFunction.P = luaTableL1;
        } else if (iC2 != 8) {
            luaValue.k2(luaTableL1);
        } else {
            LuaThread.T = luaTableL1;
        }
        return luaValue;
    }
}
