package f;

import luaj.LuaString;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LuaString f1556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1558c;

    public b(LuaString luaString, int i, int i2) {
        this.f1556a = luaString;
        this.f1557b = i;
        this.f1558c = i2;
    }

    public String a() {
        return "" + this.f1556a + ' ' + this.f1557b + '-' + this.f1558c;
    }

    public String toString() {
        return a();
    }
}
