package luaj;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class WeakTable$WeakValue extends LuaValue {
    WeakReference P;

    protected WeakTable$WeakValue(LuaValue luaValue) {
        this.P = new WeakReference(luaValue);
    }

    @Override // luaj.LuaValue
    public int C2() {
        a1("type", "weak value");
        return 0;
    }

    @Override // luaj.LuaValue
    public String D2() {
        a1("typename", "weak value");
        return null;
    }

    @Override // luaj.LuaValue
    public boolean T1(LuaValue luaValue) {
        Object obj = this.P.get();
        return obj != null && luaValue.T1((LuaValue) obj);
    }

    @Override // luaj.LuaValue
    public LuaValue p2() {
        return (LuaValue) this.P.get();
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public String toString() {
        return "weak<" + this.P.get() + '>';
    }
}
