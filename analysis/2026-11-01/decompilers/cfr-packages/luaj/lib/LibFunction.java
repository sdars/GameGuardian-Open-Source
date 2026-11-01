/*
 * Decompiled with CFR 0.152.
 */
package luaj.lib;

import luaj.LuaFunction;
import luaj.LuaValue;
import luaj.Varargs;

public abstract class LibFunction
extends LuaFunction {
    protected int R;
    protected String S;

    protected LibFunction() {
    }

    protected void V2(LuaValue luaValue, a a4, String[] stringArray) {
        this.W2(luaValue, a4, stringArray, 0);
    }

    protected void W2(LuaValue luaValue, a a4, String[] stringArray, int n3) {
        int n4 = stringArray.length;
        for (int i3 = 0; i3 < n4; ++i3) {
            String string2;
            LibFunction libFunction = a4.a();
            libFunction.R = n3 + i3;
            libFunction.S = string2 = stringArray[i3];
            luaValue.i2(string2, libFunction);
        }
    }

    @Override
    public LuaValue call() {
        return LuaValue.k0(1, "value expected");
    }

    @Override
    public abstract LuaValue call(LuaValue var1);

    @Override
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        return this.call(luaValue);
    }

    @Override
    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        return this.call(luaValue, luaValue2);
    }

    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3, LuaValue luaValue4) {
        return this.call(luaValue, luaValue2, luaValue3);
    }

    @Override
    public String g0() {
        CharSequence charSequence;
        if (this.S != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("function: ");
            ((StringBuilder)charSequence).append(this.S);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = super.g0();
        }
        return charSequence;
    }

    @Override
    public Varargs invoke(Varargs varargs) {
        int n3 = varargs.U();
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        return this.call(varargs.w(), varargs.v(2), varargs.v(3), varargs.v(4));
                    }
                    return this.call(varargs.w(), varargs.v(2), varargs.v(3));
                }
                return this.call(varargs.w(), varargs.v(2));
            }
            return this.call(varargs.w());
        }
        return this.call();
    }

    protected static interface a {
        public LibFunction a();
    }
}

