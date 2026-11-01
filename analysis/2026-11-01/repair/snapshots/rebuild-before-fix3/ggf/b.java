package ggf;

import luaj.LuaString;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LuaString f1558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1560c;

    public b(LuaString luaString, int i, int i2) {
        this.f1558a = luaString;
        this.f1559b = i;
        this.f1560c = i2;
    }

    public String a() {
        return "" + this.f1558a + ' ' + this.f1559b + '-' + this.f1560c;
    }

    public String toString() {
        return a();
    }
}
