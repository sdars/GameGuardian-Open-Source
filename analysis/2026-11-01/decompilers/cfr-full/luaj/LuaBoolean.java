/*
 * Decompiled with CFR 0.152.
 */
package luaj;

import luaj.LuaValue;

public final class LuaBoolean
extends LuaValue {
    public static LuaValue Q;
    public final boolean P;

    LuaBoolean(boolean bl) {
        this.P = bl;
    }

    @Override
    public LuaValue B1() {
        LuaBoolean luaBoolean = this.P ? LuaValue.e : LuaValue.d;
        return luaBoolean;
    }

    @Override
    public int C2() {
        return 1;
    }

    @Override
    public String D2() {
        return "boolean";
    }

    @Override
    public boolean E1(boolean bl) {
        return this.P;
    }

    @Override
    public LuaValue V0() {
        return Q;
    }

    @Override
    public boolean e1() {
        return true;
    }

    @Override
    public String g0() {
        String string2 = this.P ? "true" : "false";
        return string2;
    }

    @Override
    public boolean v0() {
        return this.P;
    }

    @Override
    public boolean w2() {
        return this.P;
    }
}

