package luaj;

/* JADX INFO: loaded from: classes.dex */
public abstract class WeakTable$c implements LuaTable$m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Object f1692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Object f1693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected LuaTable$m f1694c;

    protected WeakTable$c(Object obj, Object obj2, LuaTable$m luaTable$m) {
        this.f1692a = obj;
        this.f1693b = obj2;
        this.f1694c = luaTable$m;
    }

    @Override // luaj.LuaTable$m
    public LuaTable$m a() {
        return this.f1694c;
    }

    @Override // luaj.LuaTable$m
    public LuaTable$m d(LuaTable$m luaTable$m) {
        LuaTable$m luaTable$m2 = this.f1694c;
        if (luaTable$m2 != null) {
            luaTable$m = luaTable$m2.d(luaTable$m);
        }
        this.f1694c = luaTable$m;
        return (k() == null || m() == null) ? this.f1694c : this;
    }

    protected abstract WeakTable$c e(LuaTable$m luaTable$m);

    @Override // luaj.LuaTable$m
    public LuaTable$n f(LuaValue luaValue) {
        LuaTable$n luaTable$nL = l();
        if (luaTable$nL != null) {
            return luaTable$nL.f(luaValue);
        }
        return null;
    }

    public abstract LuaTable$m g(LuaValue luaValue);

    @Override // luaj.LuaTable$m
    public LuaTable$m h(LuaTable$n luaTable$n) {
        LuaValue luaValueK = k();
        if (luaValueK == null) {
            return this.f1694c.h(luaTable$n);
        }
        if (luaTable$n.s(luaValueK)) {
            this.f1693b = null;
            return this;
        }
        this.f1694c = this.f1694c.h(luaTable$n);
        return this;
    }

    @Override // luaj.LuaTable$m
    public LuaTable$m j(LuaTable$n luaTable$n, LuaValue luaValue) {
        LuaValue luaValueK = k();
        if (luaValueK != null && luaTable$n.f(luaValueK) != null) {
            return g(luaValue);
        }
        if (luaValueK == null) {
            return this.f1694c.j(luaTable$n, luaValue);
        }
        this.f1694c = this.f1694c.j(luaTable$n, luaValue);
        return this;
    }

    public LuaValue k() {
        return (LuaValue) this.f1692a;
    }

    @Override // luaj.LuaTable$m
    public LuaTable$n l() {
        LuaValue luaValueK = k();
        LuaValue luaValueM = m();
        if (luaValueK != null && luaValueM != null) {
            return new LuaTable$l(luaValueK, luaValueM);
        }
        this.f1692a = null;
        this.f1693b = null;
        return null;
    }

    public LuaValue m() {
        return (LuaValue) this.f1693b;
    }

    @Override // luaj.LuaTable$m
    public LuaTable$m n(LuaTable$m luaTable$m) {
        if (k() == null || m() == null) {
            return luaTable$m;
        }
        return (luaTable$m == null && this.f1694c == null) ? this : e(luaTable$m);
    }

    @Override // luaj.LuaTable$m
    public int r(int i) {
        return 0;
    }

    @Override // luaj.LuaTable$m
    public boolean s(LuaValue luaValue) {
        LuaTable$n luaTable$nL = l();
        return luaTable$nL != null && luaTable$nL.s(luaValue);
    }
}
