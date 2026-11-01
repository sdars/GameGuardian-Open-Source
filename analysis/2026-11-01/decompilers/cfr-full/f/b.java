/*
 * Decompiled with CFR 0.152.
 */
package f;

import luaj.LuaString;

public class b {
    public LuaString a;
    public int b;
    public int c;

    public b(LuaString luaString, int n3, int n4) {
        this.a = luaString;
        this.b = n3;
        this.c = n4;
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.a);
        stringBuilder.append(' ');
        stringBuilder.append(this.b);
        stringBuilder.append('-');
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }

    public String toString() {
        return this.a();
    }
}

