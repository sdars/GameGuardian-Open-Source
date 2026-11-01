package luaj;

/* JADX INFO: loaded from: classes.dex */
public class LuaTable$i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1656a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LuaTable$m f1657b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LuaTable$n f1658c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ LuaTable f1659d;

    public LuaTable$i(LuaTable luaTable) {
        this.f1659d = luaTable;
    }

    public int a() {
        if (this.f1658c == null) {
            return this.f1656a + 1;
        }
        return 0;
    }

    public LuaValue b() {
        LuaTable$n luaTable$n = this.f1658c;
        return luaTable$n != null ? luaTable$n.i() : LuaLong.I2(this.f1656a + 1);
    }

    public boolean c() {
        LuaTable luaTable;
        e eVar;
        LuaTable$n luaTable$nL;
        LuaTable$m luaTable$mA = this.f1657b;
        while (luaTable$mA != null) {
            luaTable$mA = luaTable$mA.a();
            if (luaTable$mA != null && (luaTable$nL = luaTable$mA.l()) != null) {
                this.f1657b = luaTable$mA;
                this.f1658c = luaTable$nL;
                return true;
            }
        }
        this.f1657b = null;
        this.f1658c = null;
        int i = this.f1656a + 1;
        while (i < this.f1659d.P.length) {
            if (this.f1659d.P[i] != null && ((eVar = (luaTable = this.f1659d).S) == null || eVar.o(luaTable.P, i) != null)) {
                this.f1656a = i;
                return true;
            }
            i++;
        }
        for (int length = i - this.f1659d.P.length; length < this.f1659d.Q.length; length++) {
            for (LuaTable$m luaTable$mA2 = this.f1659d.Q[length]; luaTable$mA2 != null; luaTable$mA2 = luaTable$mA2.a()) {
                LuaTable$n luaTable$nL2 = luaTable$mA2.l();
                if (luaTable$nL2 != null) {
                    this.f1656a = length + this.f1659d.P.length;
                    this.f1657b = luaTable$mA2;
                    this.f1658c = luaTable$nL2;
                    return true;
                }
            }
        }
        return false;
    }

    public LuaValue d() {
        LuaTable$n luaTable$n = this.f1658c;
        if (luaTable$n != null) {
            return luaTable$n.t();
        }
        LuaTable luaTable = this.f1659d;
        e eVar = luaTable.S;
        LuaValue[] luaValueArr = luaTable.P;
        return eVar == null ? luaValueArr[this.f1656a] : eVar.o(luaValueArr, this.f1656a);
    }
}
