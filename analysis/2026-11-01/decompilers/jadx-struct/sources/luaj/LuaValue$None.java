package luaj;

/* JADX INFO: loaded from: classes.dex */
final class LuaValue$None extends LuaNil {
    private LuaValue$None() {
    }

    /* synthetic */ LuaValue$None(LuaValue$a luaValue$a) {
        this();
    }

    @Override // luaj.Varargs
    void L(LuaValue[] luaValueArr, int i, int i2) {
        while (i2 > 0) {
            luaValueArr[i] = LuaValue.f1673c;
            i2--;
            i++;
        }
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public int U() {
        return 0;
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public Varargs e0(int i) {
        return i > 0 ? this : LuaValue.k0(1, "start must be > 0");
    }

    @Override // luaj.LuaNil, luaj.LuaValue, luaj.Varargs
    public String g0() {
        return "none";
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public LuaValue v(int i) {
        return LuaValue.f1673c;
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public LuaValue w() {
        return LuaValue.f1673c;
    }
}
