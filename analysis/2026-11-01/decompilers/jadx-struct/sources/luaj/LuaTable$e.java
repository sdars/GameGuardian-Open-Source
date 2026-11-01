package luaj;

/* JADX INFO: loaded from: classes.dex */
abstract class LuaTable$e extends Varargs implements LuaTable$n {
    LuaTable$e() {
    }

    @Override // luaj.Varargs
    public int U() {
        return 2;
    }

    @Override // luaj.LuaTable$m
    public LuaTable$m a() {
        return null;
    }

    @Override // luaj.LuaTable$m
    public abstract int b(int i);

    @Override // luaj.LuaTable$n
    public Varargs c() {
        return this;
    }

    @Override // luaj.LuaTable$m
    public LuaTable$m d(LuaTable$m luaTable$m) {
        return new LuaTable$j(this, luaTable$m);
    }

    @Override // luaj.Varargs
    public Varargs e0(int i) {
        if (i != 1) {
            return i != 2 ? LuaValue.f1676f : t();
        }
        return this;
    }

    @Override // luaj.LuaTable$m
    public LuaTable$n f(LuaValue luaValue) {
        if (s(luaValue)) {
            return this;
        }
        return null;
    }

    @Override // luaj.LuaTable$m
    public LuaTable$m h(LuaTable$n luaTable$n) {
        return new LuaTable$c(i(), null, null);
    }

    @Override // luaj.LuaTable$n
    public abstract LuaValue i();

    @Override // luaj.LuaTable$m
    public LuaTable$m j(LuaTable$n luaTable$n, LuaValue luaValue) {
        return j0(luaValue);
    }

    abstract LuaTable$e j0(LuaValue luaValue);

    @Override // luaj.LuaTable$m
    public LuaTable$n l() {
        return this;
    }

    @Override // luaj.LuaTable$m
    public LuaTable$m n(LuaTable$m luaTable$m) {
        return luaTable$m != null ? new LuaTable$j(this, luaTable$m) : this;
    }

    @Override // luaj.LuaTable$m
    public int r(int i) {
        return 0;
    }

    @Override // luaj.LuaTable$m
    public abstract boolean s(LuaValue luaValue);

    public abstract LuaValue t();

    @Override // luaj.Varargs
    public LuaValue v(int i) {
        if (i != 1) {
            return i != 2 ? LuaValue.f1673c : t();
        }
        return i();
    }

    @Override // luaj.Varargs
    public LuaValue w() {
        return i();
    }
}
