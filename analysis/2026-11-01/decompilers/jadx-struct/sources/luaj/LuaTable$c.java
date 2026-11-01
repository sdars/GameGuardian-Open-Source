package luaj;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class LuaTable$c implements LuaTable$m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f1649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LuaTable$m f1650b;

    private LuaTable$c(LuaValue luaValue, LuaTable$m luaTable$m) {
        this.f1649a = LuaTable.r3(luaValue) ? new WeakReference(luaValue) : luaValue;
        this.f1650b = luaTable$m;
    }

    /* synthetic */ LuaTable$c(LuaValue luaValue, LuaTable$m luaTable$m, LuaTable$a luaTable$a) {
        this(luaValue, luaTable$m);
    }

    private LuaValue i() {
        Object obj = this.f1649a;
        if (obj instanceof WeakReference) {
            obj = ((WeakReference) obj).get();
        }
        return (LuaValue) obj;
    }

    @Override // luaj.LuaTable$m
    public LuaTable$m a() {
        return this.f1650b;
    }

    @Override // luaj.LuaTable$m
    public int b(int i) {
        return 0;
    }

    @Override // luaj.LuaTable$m
    public LuaTable$m d(LuaTable$m luaTable$m) {
        LuaTable$m luaTable$m2 = this.f1650b;
        return luaTable$m2 != null ? luaTable$m2.d(luaTable$m) : luaTable$m;
    }

    @Override // luaj.LuaTable$m
    public LuaTable$n f(LuaValue luaValue) {
        return null;
    }

    @Override // luaj.LuaTable$m
    public LuaTable$m h(LuaTable$n luaTable$n) {
        if (i() == null) {
            return this.f1650b;
        }
        this.f1650b = this.f1650b.h(luaTable$n);
        return this;
    }

    @Override // luaj.LuaTable$m
    public LuaTable$m j(LuaTable$n luaTable$n, LuaValue luaValue) {
        LuaTable$m luaTable$m = this.f1650b;
        LuaTable$m luaTable$mJ = luaTable$m != null ? luaTable$m.j(luaTable$n, luaValue) : null;
        if (i() == null) {
            return luaTable$mJ;
        }
        this.f1650b = luaTable$mJ;
        return this;
    }

    @Override // luaj.LuaTable$m
    public LuaTable$n l() {
        return null;
    }

    @Override // luaj.LuaTable$m
    public LuaTable$m n(LuaTable$m luaTable$m) {
        return luaTable$m;
    }

    @Override // luaj.LuaTable$m
    public int r(int i) {
        return -1;
    }

    @Override // luaj.LuaTable$m
    public boolean s(LuaValue luaValue) {
        LuaValue luaValueI = i();
        return luaValueI != null && luaValue.T1(luaValueI);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<dead");
        LuaValue luaValueI = i();
        if (luaValueI != null) {
            sb.append(": ");
            sb.append(luaValueI.toString());
        }
        sb.append('>');
        if (this.f1650b != null) {
            sb.append("; ");
            sb.append(this.f1650b.toString());
        }
        return sb.toString();
    }
}
