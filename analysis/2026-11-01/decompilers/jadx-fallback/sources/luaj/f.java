package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
class f implements luaj.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final luaj.LuaValue f1713a;

    public f(luaj.LuaValue r1) {
            r0 = this;
            r0.<init>()
            r0.f1713a = r1
            return
    }

    @Override // luaj.e
    public luaj.LuaValue e() {
            r1 = this;
            luaj.LuaValue r0 = r1.f1713a
            return r0
    }

    @Override // luaj.e
    public luaj.LuaValue g(luaj.LuaValue r1) {
            r0 = this;
            return r1
    }

    @Override // luaj.e
    public luaj.LuaTable.m k(luaj.LuaValue r1, luaj.LuaValue r2) {
            r0 = this;
            luaj.LuaTable$e r1 = luaj.LuaTable.Z2(r1, r2)
            return r1
    }

    @Override // luaj.e
    public luaj.LuaValue o(luaj.LuaValue[] r1, int r2) {
            r0 = this;
            r1 = r1[r2]
            return r1
    }

    @Override // luaj.e
    public boolean p() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // luaj.e
    public boolean q() {
            r1 = this;
            r0 = 0
            return r0
    }
}
