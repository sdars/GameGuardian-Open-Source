package luaj;

/* JADX INFO: loaded from: classes.dex */
class LuaTable$g extends LuaTable$e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LuaValue f1654c;

    LuaTable$g(int i, LuaValue luaValue) {
        this.f1653b = i;
        this.f1654c = luaValue;
    }

    @Override // luaj.LuaTable$e, luaj.LuaTable$m
    public int b(int i) {
        return LuaTable.l3(LuaLong.V2(this.f1653b), i);
    }

    @Override // luaj.LuaTable$e, luaj.LuaTable$n
    public LuaValue i() {
        return LuaValue.I2(this.f1653b);
    }

    @Override // luaj.LuaTable$e
    public LuaTable$e j0(LuaValue luaValue) {
        this.f1654c = luaValue;
        return this;
    }

    @Override // luaj.LuaTable$e, luaj.LuaTable$m
    public int r(int i) {
        int i2 = this.f1653b;
        if (i2 < 1 || i2 > i) {
            return 0;
        }
        return i2;
    }

    @Override // luaj.LuaTable$e, luaj.LuaTable$m
    public boolean s(LuaValue luaValue) {
        return luaValue.m1() && this.f1653b == luaValue.y2();
    }

    @Override // luaj.LuaTable$e, luaj.LuaTable$n
    public LuaValue t() {
        return this.f1654c;
    }
}
