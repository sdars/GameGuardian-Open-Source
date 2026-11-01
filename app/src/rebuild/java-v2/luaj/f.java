package luaj;

/* JADX INFO: loaded from: classes.dex */
class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LuaValue f1715a;

    public f(LuaValue luaValue) {
        this.f1715a = luaValue;
    }

    @Override // luaj.e
    public LuaValue e() {
        return this.f1715a;
    }

    @Override // luaj.e
    public LuaValue g(LuaValue luaValue) {
        return luaValue;
    }

    @Override // luaj.e
    public LuaTable.m k(LuaValue luaValue, LuaValue luaValue2) {
        return LuaTable.Z2(luaValue, luaValue2);
    }

    @Override // luaj.e
    public LuaValue o(LuaValue[] luaValueArr, int i) {
        return luaValueArr[i];
    }

    @Override // luaj.e
    public boolean p() {
        return false;
    }

    @Override // luaj.e
    public boolean q() {
        return false;
    }
}
