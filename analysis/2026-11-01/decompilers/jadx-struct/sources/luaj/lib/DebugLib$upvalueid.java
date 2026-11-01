package luaj.lib;

import luaj.LuaClosure;
import luaj.LuaFunction;
import luaj.LuaValue;
import luaj.Varargs;
import luaj.i;

/* JADX INFO: loaded from: classes.dex */
final class DebugLib$upvalueid extends VarArgFunction {
    DebugLib$upvalueid() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        i[] iVarArr;
        LuaFunction luaFunctionC = varargs.C(1);
        int iD = varargs.D(2);
        if ((luaFunctionC instanceof LuaClosure) && (iVarArr = ((LuaClosure) luaFunctionC).S) != null && iD > 0 && iD <= iVarArr.length) {
            return LuaValue.I2(iVarArr[iD - 1].hashCode());
        }
        return LuaValue.l0(2, "debug.upvalueid", "invalid upvalue index " + iD);
    }
}
