/*
 * Decompiled with CFR 0.152.
 */
package luaj;

import luaj.LuaFunction;
import luaj.LuaString;
import luaj.LuaTable;
import luaj.LuaValue;

public class LuaNil
extends LuaValue {
    public static LuaValue P;

    LuaNil() {
    }

    @Override
    public LuaValue B1() {
        return LuaValue.d;
    }

    @Override
    public int C2() {
        return 0;
    }

    @Override
    public String D2() {
        return "nil";
    }

    @Override
    public boolean E1(boolean bl) {
        return bl;
    }

    @Override
    public double F1(double d4) {
        return d4;
    }

    @Override
    public LuaFunction G1(LuaFunction luaFunction) {
        return luaFunction;
    }

    @Override
    public int H1(int n3) {
        return n3;
    }

    @Override
    public String I1(String string2) {
        return string2;
    }

    @Override
    public long J1(long l3) {
        return l3;
    }

    @Override
    public LuaString K1(LuaString luaString) {
        return luaString;
    }

    @Override
    public LuaTable L1(LuaTable luaTable) {
        return luaTable;
    }

    @Override
    public LuaValue M1(LuaValue luaValue) {
        return luaValue;
    }

    @Override
    public LuaValue V0() {
        return P;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof LuaNil;
    }

    @Override
    public String g0() {
        return "nil";
    }

    @Override
    public boolean l1() {
        return true;
    }

    @Override
    public boolean q1() {
        return false;
    }

    @Override
    public String toString() {
        return "nil";
    }

    @Override
    public boolean w2() {
        return false;
    }
}

