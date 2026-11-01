package luaj.lib;

import luaj.LuaClosure;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class DebugLib$upvaluejoin extends VarArgFunction {
    DebugLib$upvaluejoin() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        LuaClosure luaClosureA = varargs.A(1);
        int iD = varargs.D(2);
        LuaClosure luaClosureA2 = varargs.A(3);
        int iD2 = varargs.D(4);
        if (iD < 1 || iD > luaClosureA.S.length) {
            m0("index out of range");
        }
        if (iD2 < 1 || iD2 > luaClosureA2.S.length) {
            m0("index out of range");
        }
        luaClosureA.S[iD - 1] = luaClosureA2.S[iD2 - 1];
        return LuaValue.f1676f;
    }
}
