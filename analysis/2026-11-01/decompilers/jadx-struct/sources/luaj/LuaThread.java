package luaj;

/* JADX INFO: loaded from: classes.dex */
public class LuaThread extends LuaValue {
    public static LuaValue T;
    public static final String[] U = {"suspended", "suspended", "running", "normal", "dead"};
    public final LuaThread$a P;
    public Object Q;
    public final Globals R;
    public LuaValue S;

    public LuaThread(Globals globals) {
        LuaThread$a luaThread$a = new LuaThread$a(globals, this, null);
        this.P = luaThread$a;
        luaThread$a.o = 2;
        this.R = globals;
    }

    @Override // luaj.LuaValue
    public int C2() {
        return 8;
    }

    @Override // luaj.LuaValue
    public String D2() {
        return "thread";
    }

    @Override // luaj.LuaValue
    public LuaThread I0() {
        return this;
    }

    @Override // luaj.LuaValue
    public LuaValue V0() {
        return T;
    }

    @Override // luaj.LuaValue
    public boolean p1() {
        return true;
    }
}
