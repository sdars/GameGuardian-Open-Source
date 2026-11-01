package luaj;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    LuaValue[] f1730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f1731b;

    public i(LuaValue[] luaValueArr, int i) {
        this.f1730a = luaValueArr;
        this.f1731b = i;
    }

    public final void a() {
        LuaValue[] luaValueArr = this.f1730a;
        int i = this.f1731b;
        this.f1730a = new LuaValue[]{luaValueArr[i]};
        luaValueArr[i] = null;
        this.f1731b = 0;
    }

    public final LuaValue b() {
        return this.f1730a[this.f1731b];
    }

    public final void c(LuaValue luaValue) {
        this.f1730a[this.f1731b] = luaValue;
    }

    public String toString() {
        return "" + this.f1731b + '/' + this.f1730a.length + ' ' + this.f1730a[this.f1731b];
    }
}
