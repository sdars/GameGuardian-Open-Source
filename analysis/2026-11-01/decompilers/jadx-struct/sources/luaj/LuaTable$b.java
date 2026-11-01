package luaj;

/* JADX INFO: loaded from: classes.dex */
class LuaTable$b extends LuaTable$o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1648c;

    LuaTable$b(LuaValue luaValue, boolean z) {
        super(luaValue);
        this.f1648c = z;
    }

    @Override // luaj.LuaTable$e
    public LuaTable$e j0(LuaValue luaValue) {
        if (luaValue instanceof LuaBoolean) {
            this.f1648c = luaValue == LuaValue.f1674d;
            return this;
        }
        if (luaValue instanceof LuaLong) {
            long jZ2 = luaValue.z2();
            int i = (int) jZ2;
            return ((long) i) == jZ2 ? new LuaTable$h(this.f1664b, i) : new LuaTable$k(this.f1664b, jZ2);
        }
        if (!(luaValue instanceof LuaDouble)) {
            return new LuaTable$l(this.f1664b, luaValue);
        }
        double dX2 = luaValue.x2();
        float f2 = (float) dX2;
        return ((double) f2) == dX2 ? new LuaTable$f(this.f1664b, f2) : new LuaTable$d(this.f1664b, dX2);
    }

    @Override // luaj.LuaTable$e, luaj.LuaTable$n
    public LuaValue t() {
        return LuaValue.H2(this.f1648c);
    }
}
