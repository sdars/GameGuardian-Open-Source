package luaj;

/* JADX INFO: loaded from: classes.dex */
class WeakTable$d extends WeakTable$c {
    protected WeakTable$d(LuaValue luaValue, LuaValue luaValue2, LuaTable$m luaTable$m) {
        super(luaValue, WeakTable.b(luaValue2), luaTable$m);
    }

    protected WeakTable$d(WeakTable$d weakTable$d, LuaTable$m luaTable$m) {
        super(weakTable$d.f1692a, weakTable$d.f1693b, luaTable$m);
    }

    @Override // luaj.LuaTable$m
    public int b(int i) {
        return LuaTable.j3(k(), i);
    }

    @Override // luaj.WeakTable$c
    protected WeakTable$c e(LuaTable$m luaTable$m) {
        return new WeakTable$d(this, luaTable$m);
    }

    @Override // luaj.WeakTable$c
    public LuaTable$m g(LuaValue luaValue) {
        this.f1693b = WeakTable.b(luaValue);
        return this;
    }

    @Override // luaj.WeakTable$c
    public LuaValue m() {
        return WeakTable.a(this.f1693b);
    }
}
