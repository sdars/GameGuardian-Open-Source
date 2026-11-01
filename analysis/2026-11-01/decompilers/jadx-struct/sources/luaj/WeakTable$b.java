package luaj;

/* JADX INFO: loaded from: classes.dex */
class WeakTable$b extends WeakTable$c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1691d;

    protected WeakTable$b(LuaValue luaValue, LuaValue luaValue2, LuaTable$m luaTable$m) {
        super(WeakTable.b(luaValue), luaValue2, luaTable$m);
        this.f1691d = luaValue.hashCode();
    }

    protected WeakTable$b(WeakTable$b weakTable$b, LuaTable$m luaTable$m) {
        super(weakTable$b.f1692a, weakTable$b.f1693b, luaTable$m);
        this.f1691d = weakTable$b.f1691d;
    }

    @Override // luaj.LuaTable$m
    public int b(int i) {
        return LuaTable.l3(this.f1691d, i);
    }

    @Override // luaj.WeakTable$c
    protected WeakTable$c e(LuaTable$m luaTable$m) {
        return new WeakTable$b(this, luaTable$m);
    }

    @Override // luaj.WeakTable$c
    public LuaTable$m g(LuaValue luaValue) {
        this.f1693b = luaValue;
        return this;
    }

    @Override // luaj.WeakTable$c
    public LuaValue k() {
        return WeakTable.a(this.f1692a);
    }
}
