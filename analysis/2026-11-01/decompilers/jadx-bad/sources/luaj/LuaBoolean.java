package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public final class LuaBoolean extends LuaValue {
    public static LuaValue Q;
    public final boolean P;

    LuaBoolean(boolean z) {
        this.P = z;
    }

    @Override // luaj.LuaValue
    public LuaValue B1() {
        return this.P ? LuaValue.f1673e : LuaValue.f1672d;
    }

    @Override // luaj.LuaValue
    public int C2() {
        return 1;
    }

    @Override // luaj.LuaValue
    public String D2() {
        return "boolean";
    }

    @Override // luaj.LuaValue
    public boolean E1(boolean z) {
        return this.P;
    }

    @Override // luaj.LuaValue
    public LuaValue V0() {
        return Q;
    }

    @Override // luaj.LuaValue
    public boolean e1() {
        return true;
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public String g0() {
        return this.P ? "true" : "false";
    }

    @Override // luaj.LuaValue
    public boolean v0() {
        return this.P;
    }

    @Override // luaj.LuaValue
    public boolean w2() {
        return this.P;
    }
}
