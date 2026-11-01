package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class BaseLib$collectgarbage extends VarArgFunction {
    BaseLib$collectgarbage() {
    }

    @Override // luaj.lib.VarArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        String strZ = varargs.Z(1, "collect");
        if ("collect".equals(strZ)) {
            System.gc();
            return LuaValue.f1677g;
        }
        if ("count".equals(strZ)) {
            Runtime runtime = Runtime.getRuntime();
            long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
            return LuaValue.N2(LuaValue.J2(jFreeMemory / 1024.0d), LuaValue.I2(jFreeMemory % 1024));
        }
        if ("step".equals(strZ)) {
            System.gc();
            return LuaValue.f1674d;
        }
        LuaValue.l0(1, "collectgarbage", "invalid option '" + strZ + "'");
        return LuaValue.f1673c;
    }
}
