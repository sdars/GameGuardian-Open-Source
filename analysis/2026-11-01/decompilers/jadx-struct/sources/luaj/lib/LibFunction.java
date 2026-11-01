package luaj.lib;

import luaj.LuaFunction;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
public abstract class LibFunction extends LuaFunction {
    protected int R;
    protected String S;

    protected LibFunction() {
    }

    protected void V2(LuaValue luaValue, LibFunction$a libFunction$a, String[] strArr) {
        W2(luaValue, libFunction$a, strArr, 0);
    }

    protected void W2(LuaValue luaValue, LibFunction$a libFunction$a, String[] strArr, int i) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            LibFunction libFunctionA = libFunction$a.a();
            libFunctionA.R = i + i2;
            String str = strArr[i2];
            libFunctionA.S = str;
            luaValue.i2(str, libFunctionA);
        }
    }

    @Override // luaj.LuaValue
    public LuaValue call() {
        return LuaValue.k0(1, "value expected");
    }

    @Override // luaj.LuaValue
    public abstract LuaValue call(LuaValue luaValue);

    @Override // luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        return call(luaValue);
    }

    @Override // luaj.LuaValue
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        return call(luaValue, luaValue2);
    }

    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3, LuaValue luaValue4) {
        return call(luaValue, luaValue2, luaValue3);
    }

    @Override // luaj.LuaFunction, luaj.LuaValue, luaj.Varargs
    public String g0() {
        if (this.S == null) {
            return super.g0();
        }
        return "function: " + this.S;
    }

    @Override // luaj.LuaValue
    public Varargs invoke(Varargs varargs) {
        int iU = varargs.U();
        if (iU == 0) {
            return call();
        }
        if (iU == 1) {
            return call(varargs.w());
        }
        if (iU != 2) {
            return iU != 3 ? call(varargs.w(), varargs.v(2), varargs.v(3), varargs.v(4)) : call(varargs.w(), varargs.v(2), varargs.v(3));
        }
        return call(varargs.w(), varargs.v(2));
    }
}
