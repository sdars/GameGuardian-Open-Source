package luaj.lib;

import luaj.LuaValue;

/* JADX INFO: loaded from: classes.dex */
protected abstract class MathLib$BinaryOp extends TwoArgFunction {
    protected MathLib$BinaryOp() {
    }

    protected abstract double X2(double d2, double d3);

    @Override // luaj.lib.TwoArgFunction, luaj.lib.LibFunction, luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        return LuaValue.J2(X2(MathLib.X2(this, 1, luaValue), MathLib.X2(this, 2, luaValue2)));
    }
}
