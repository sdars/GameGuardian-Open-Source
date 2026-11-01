package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class LuaNumber extends LuaValue {
    public static LuaValue P;

    @Override // luaj.LuaValue
    public LuaValue A2() {
        return this;
    }

    @Override // luaj.LuaValue
    public int C2() {
        return 3;
    }

    @Override // luaj.LuaValue
    public String D2() {
        return "number";
    }

    @Override // luaj.LuaValue
    public LuaNumber E0() {
        return this;
    }

    @Override // luaj.LuaValue
    public LuaNumber F0(String str) {
        return this;
    }

    @Override // luaj.LuaValue
    public LuaValue K0(LuaValue luaValue) {
        return luaValue.L0(this);
    }

    @Override // luaj.LuaValue
    public LuaValue L0(LuaNumber luaNumber) {
        return q2().M0(luaNumber.q2());
    }

    @Override // luaj.LuaValue
    public LuaValue M0(LuaString luaString) {
        return q2().M0(luaString);
    }

    @Override // luaj.LuaValue
    public LuaValue V0() {
        return P;
    }

    @Override // luaj.LuaValue
    public boolean m1() {
        return true;
    }

    @Override // luaj.LuaValue
    public boolean n1() {
        return true;
    }

    @Override // luaj.LuaValue
    public int o2(LuaString luaString) {
        String string = luaString.toString();
        if (string.length() > 50) {
            string = string.substring(0, 50) + "...";
        }
        throw new d("attempt to compare number with string (" + this + " with '" + string + "')");
    }
}
