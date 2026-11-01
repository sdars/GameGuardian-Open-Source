package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    LuaValue[] f1728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f1729b;

    public i(LuaValue[] luaValueArr, int i) {
        this.f1728a = luaValueArr;
        this.f1729b = i;
    }

    public final void a() {
        LuaValue[] luaValueArr = this.f1728a;
        int i = this.f1729b;
        this.f1728a = new LuaValue[]{luaValueArr[i]};
        luaValueArr[i] = null;
        this.f1729b = 0;
    }

    public final LuaValue b() {
        return this.f1728a[this.f1729b];
    }

    public final void c(LuaValue luaValue) {
        this.f1728a[this.f1729b] = luaValue;
    }

    public String toString() {
        return "" + this.f1729b + '/' + this.f1728a.length + ' ' + this.f1728a[this.f1729b];
    }
}
