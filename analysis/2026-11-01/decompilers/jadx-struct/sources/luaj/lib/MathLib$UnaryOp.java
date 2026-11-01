package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
protected abstract class MathLib$UnaryOp extends OneArgFunction {
    protected MathLib$UnaryOp() {
    }

    protected abstract double X2(double d2);

    @Override // luaj.lib.OneArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue) {
        return LuaValue.J2(X2(MathLib.X2(this, 1, luaValue)));
    }
}
