/*
 * Decompiled with CFR 0.152.
 */
package luaj;

import luaj.LuaString;
import luaj.LuaValue;
import luaj.d;

public abstract class LuaNumber
extends LuaValue {
    public static LuaValue P;

    @Override
    public LuaValue A2() {
        return this;
    }

    @Override
    public int C2() {
        return 3;
    }

    @Override
    public String D2() {
        return "number";
    }

    @Override
    public LuaNumber E0() {
        return this;
    }

    @Override
    public LuaNumber F0(String string2) {
        return this;
    }

    @Override
    public LuaValue K0(LuaValue luaValue) {
        return luaValue.L0(this);
    }

    @Override
    public LuaValue L0(LuaNumber luaNumber) {
        return this.q2().M0(luaNumber.q2());
    }

    @Override
    public LuaValue M0(LuaString luaString) {
        return this.q2().M0(luaString);
    }

    @Override
    public LuaValue V0() {
        return P;
    }

    @Override
    public boolean m1() {
        return true;
    }

    @Override
    public boolean n1() {
        return true;
    }

    @Override
    public int o2(LuaString object) {
        CharSequence charSequence = ((LuaValue)object).toString();
        object = charSequence;
        if (((String)charSequence).length() > 50) {
            object = new StringBuilder();
            ((StringBuilder)object).append(((String)charSequence).substring(0, 50));
            ((StringBuilder)object).append("...");
            object = ((StringBuilder)object).toString();
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("attempt to compare number with string (");
        ((StringBuilder)charSequence).append(this);
        ((StringBuilder)charSequence).append(" with '");
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append("')");
        throw new d(((StringBuilder)charSequence).toString());
    }
}

