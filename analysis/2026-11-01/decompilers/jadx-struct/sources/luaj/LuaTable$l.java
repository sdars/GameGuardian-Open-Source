package luaj;

/* JADX INFO: loaded from: classes.dex */
class LuaTable$l extends LuaTable$o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LuaValue f1663c;

    LuaTable$l(LuaValue luaValue, LuaValue luaValue2) {
        super(luaValue);
        this.f1663c = luaValue2;
    }

    @Override // luaj.LuaTable$e, luaj.LuaTable$n
    public Varargs c() {
        return this;
    }

    @Override // luaj.LuaTable$e
    public LuaTable$e j0(LuaValue luaValue) {
        if (luaValue instanceof LuaBoolean) {
            return new LuaTable$b(this.f1664b, luaValue.w2());
        }
        if (luaValue instanceof LuaLong) {
            long jZ2 = luaValue.z2();
            int i = (int) jZ2;
            return ((long) i) == jZ2 ? new LuaTable$h(this.f1664b, i) : new LuaTable$k(this.f1664b, jZ2);
        }
        if (!(luaValue instanceof LuaDouble)) {
            this.f1663c = luaValue;
            return this;
        }
        double dX2 = luaValue.x2();
        float f2 = (float) dX2;
        return ((double) f2) == dX2 ? new LuaTable$f(this.f1664b, f2) : new LuaTable$d(this.f1664b, dX2);
    }

    @Override // luaj.LuaTable$e, luaj.LuaTable$n
    public LuaValue t() {
        return this.f1663c;
    }
}
