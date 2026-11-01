package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class LuaNil extends LuaValue {
    public static LuaValue P;

    LuaNil() {
    }

    @Override // luaj.LuaValue
    public LuaValue B1() {
        return LuaValue.f1672d;
    }

    @Override // luaj.LuaValue
    public int C2() {
        return 0;
    }

    @Override // luaj.LuaValue
    public String D2() {
        return "nil";
    }

    @Override // luaj.LuaValue
    public boolean E1(boolean z) {
        return z;
    }

    @Override // luaj.LuaValue
    public double F1(double d2) {
        return d2;
    }

    @Override // luaj.LuaValue
    public LuaFunction G1(LuaFunction luaFunction) {
        return luaFunction;
    }

    @Override // luaj.LuaValue
    public int H1(int i) {
        return i;
    }

    @Override // luaj.LuaValue
    public String I1(String str) {
        return str;
    }

    @Override // luaj.LuaValue
    public long J1(long j) {
        return j;
    }

    @Override // luaj.LuaValue
    public LuaString K1(LuaString luaString) {
        return luaString;
    }

    @Override // luaj.LuaValue
    public LuaTable L1(LuaTable luaTable) {
        return luaTable;
    }

    @Override // luaj.LuaValue
    public LuaValue M1(LuaValue luaValue) {
        return luaValue;
    }

    @Override // luaj.LuaValue
    public LuaValue V0() {
        return P;
    }

    @Override // luaj.LuaValue
    public boolean equals(Object obj) {
        return obj instanceof LuaNil;
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public String g0() {
        return "nil";
    }

    @Override // luaj.LuaValue
    public boolean l1() {
        return true;
    }

    @Override // luaj.LuaValue
    public boolean q1() {
        return false;
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public String toString() {
        return "nil";
    }

    @Override // luaj.LuaValue
    public boolean w2() {
        return false;
    }
}
