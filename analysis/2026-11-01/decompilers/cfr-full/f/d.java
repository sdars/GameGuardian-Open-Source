/*
 * Decompiled with CFR 0.152.
 */
package f;

import luaj.LuaString;

public class d {
    public LuaString a;
    public final boolean b;
    public final short c;

    public d(LuaString luaString, boolean bl, int n3) {
        this.a = luaString;
        this.b = bl;
        this.c = (short)n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        char c4 = this.b ? (char)'v' : 'u';
        stringBuilder.append(String.valueOf(c4));
        stringBuilder.append(this.c);
        stringBuilder.append(" \"");
        stringBuilder.append(String.valueOf(this.a));
        stringBuilder.append("\"");
        return stringBuilder.toString();
    }
}

