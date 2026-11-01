package luaj;

/* JADX INFO: loaded from: classes.dex */
class LuaTable$k extends LuaTable$o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f1662c;

    LuaTable$k(LuaValue luaValue, long j) {
        super(luaValue);
        this.f1662c = j;
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
        if (!(luaValueA2 instanceof LuaLong)) {
            double dX2 = luaValueA2.x2();
            float f2 = (float) dX2;
            return ((double) f2) == dX2 ? new LuaTable$f(this.f1664b, f2) : new LuaTable$d(this.f1664b, dX2);
        }
        long jZ2 = luaValueA2.z2();
        int i = (int) jZ2;
        if (i == jZ2) {
            return new LuaTable$h(this.f1664b, i);
        }
        this.f1662c = jZ2;
        return this;
    }

    long k0() {
        return this.f1662c;
    }

    @Override // luaj.LuaTable$e, luaj.LuaTable$n
    public LuaValue t() {
        return LuaValue.I2(this.f1662c);
    }
}
