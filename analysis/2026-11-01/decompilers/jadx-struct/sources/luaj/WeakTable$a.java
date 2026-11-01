package luaj;

/* JADX INFO: loaded from: classes.dex */
class WeakTable$a extends WeakTable$c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1690d;

    protected WeakTable$a(LuaValue luaValue, LuaValue luaValue2, LuaTable$m luaTable$m) {
        super(WeakTable.b(luaValue), WeakTable.b(luaValue2), luaTable$m);
        this.f1690d = luaValue.hashCode();
    }

    protected WeakTable$a(WeakTable$a weakTable$a, LuaTable$m luaTable$m) {
        super(weakTable$a.f1692a, weakTable$a.f1693b, luaTable$m);
        this.f1690d = weakTable$a.f1690d;
    }

    @Override // luaj.LuaTable$m
    public int b(int i) {
        return LuaTable.l3(this.f1690d, i);
    }

    @Override // luaj.WeakTable$c
    protected WeakTable$c e(LuaTable$m luaTable$m) {
        return new WeakTable$a(this, luaTable$m);
    }

    @Override // luaj.WeakTable$c
    public LuaTable$m g(LuaValue luaValue) {
        this.f1693b = WeakTable.b(luaValue);
        return this;
    }

    @Override // luaj.WeakTable$c
    public LuaValue k() {
        return WeakTable.a(this.f1692a);
    }

    @Override // luaj.WeakTable$c
    public LuaValue m() {
        return WeakTable.a(this.f1693b);
    }
}
