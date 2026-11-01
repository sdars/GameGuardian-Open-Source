package luaj;

/* JADX INFO: loaded from: classes.dex */
class LuaTable$f extends LuaTable$o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f1652c;

    LuaTable$f(LuaValue luaValue, float f2) {
        super(luaValue);
        this.f1652c = f2;
    }

    @Override // luaj.LuaTable$e
    public LuaTable$e j0(LuaValue luaValue) {
        if (luaValue instanceof LuaBoolean) {
            return new LuaTable$b(this.f1664b, luaValue.w2());
        }
        LuaValue luaValueA2 = luaValue.A2();
        if (luaValueA2.l1()) {
            return new LuaTable$l(this.f1664b, luaValue);
        }
        if (luaValueA2 instanceof LuaLong) {
            long jZ2 = luaValueA2.z2();
            int i = (int) jZ2;
            return ((long) i) == jZ2 ? new LuaTable$h(this.f1664b, i) : new LuaTable$k(this.f1664b, jZ2);
        }
        double dX2 = luaValueA2.x2();
        float f2 = (float) dX2;
        if (f2 != dX2) {
            return new LuaTable$d(this.f1664b, dX2);
        }
        this.f1652c = f2;
        return this;
    }

    @Override // luaj.LuaTable$e, luaj.LuaTable$n
    public LuaValue t() {
        return LuaValue.J2(this.f1652c);
    }
}
