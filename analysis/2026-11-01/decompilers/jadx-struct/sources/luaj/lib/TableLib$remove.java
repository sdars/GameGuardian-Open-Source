package luaj.lib;

import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
class TableLib$remove extends VarArgFunction {
    TableLib$remove() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaTable luaTableI = varargs.I(1);
        int iS1 = luaTableI.s1();
        int iY = varargs.Y(2, iS1);
        if (iY != iS1 && (iY < 1 || iY > iS1 + 1)) {
            LuaValue.l0(2, "table.remove", "position out of bounds: " + iY + " not between 1 and " + (iS1 + 1));
        }
        if (iY < 16777215) {
            return luaTableI.z3(iY, iS1);
        }
        throw new luaj.d("position too big: " + iY + " >= 16777215");
    }
}
