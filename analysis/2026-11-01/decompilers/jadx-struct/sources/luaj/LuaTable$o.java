package luaj;

/* JADX INFO: loaded from: classes.dex */
abstract class LuaTable$o extends LuaTable$e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final LuaValue f1664b;

    LuaTable$o(LuaValue luaValue) {
        this.f1664b = luaValue;
    }

    @Override // luaj.LuaTable$e, luaj.LuaTable$m
    public final int b(int i) {
        return LuaTable.j3(this.f1664b, i);
    }

    @Override // luaj.LuaTable$e, luaj.LuaTable$n
    public final LuaValue i() {
        return this.f1664b;
    }

    @Override // luaj.LuaTable$e, luaj.LuaTable$m
    public final boolean s(LuaValue luaValue) {
        return luaValue.T1(this.f1664b);
    }
}
