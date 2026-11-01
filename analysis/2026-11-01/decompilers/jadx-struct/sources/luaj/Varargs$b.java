package luaj;

/* JADX INFO: loaded from: classes.dex */
final class Varargs$b extends Varargs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LuaValue[] f1683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Varargs f1684c;

    Varargs$b(LuaValue[] luaValueArr, Varargs varargs) {
        this.f1683b = luaValueArr;
        this.f1684c = varargs;
    }

    @Override // luaj.Varargs
    void L(LuaValue[] luaValueArr, int i, int i2) {
        int iMin = Math.min(this.f1683b.length, i2);
        System.arraycopy(this.f1683b, 0, luaValueArr, i, iMin);
        this.f1684c.L(luaValueArr, i + iMin, i2 - iMin);
    }

    @Override // luaj.Varargs
    public int U() {
        return this.f1683b.length + this.f1684c.U();
    }

    @Override // luaj.Varargs
    public Varargs e0(int i) {
        if (i <= 0) {
            LuaValue.k0(1, "start must be > 0");
        }
        if (i == 1) {
            return this;
        }
        LuaValue[] luaValueArr = this.f1683b;
        if (i > luaValueArr.length) {
            return this.f1684c.e0(i - luaValueArr.length);
        }
        int i2 = i - 1;
        return LuaValue.Q2(luaValueArr, i2, luaValueArr.length - i2, this.f1684c);
    }

    @Override // luaj.Varargs
    public LuaValue v(int i) {
        if (i < 1) {
            return LuaValue.f1673c;
        }
        LuaValue[] luaValueArr = this.f1683b;
        return i <= luaValueArr.length ? luaValueArr[i - 1] : this.f1684c.v(i - luaValueArr.length);
    }

    @Override // luaj.Varargs
    public LuaValue w() {
        LuaValue[] luaValueArr = this.f1683b;
        return luaValueArr.length > 0 ? luaValueArr[0] : this.f1684c.w();
    }
}
