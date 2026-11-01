/*
 * Decompiled with CFR 0.152.
 */
package luaj;

import luaj.LuaValue;

public final class i {
    LuaValue[] a;
    int b;

    public i(LuaValue[] luaValueArray, int n3) {
        this.a = luaValueArray;
        this.b = n3;
    }

    public final void a() {
        LuaValue[] luaValueArray = this.a;
        int n3 = this.b;
        this.a = new LuaValue[]{luaValueArray[n3]};
        luaValueArray[n3] = null;
        this.b = 0;
    }

    public final LuaValue b() {
        return this.a[this.b];
    }

    public final void c(LuaValue luaValue) {
        this.a[this.b] = luaValue;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.b);
        stringBuilder.append('/');
        stringBuilder.append(this.a.length);
        stringBuilder.append(' ');
        stringBuilder.append(this.a[this.b]);
        return stringBuilder.toString();
    }
}

