package luaj;

/* JADX INFO: loaded from: classes.dex */
public class LuaThread extends luaj.LuaValue {
    public static luaj.LuaValue T;
    public static final java.lang.String[] U = {"suspended", "suspended", "running", "normal", "dead"};
    public final luaj.LuaThread.a P;
    public java.lang.Object Q;
    public final luaj.Globals R;
    public luaj.LuaValue S;

    public static class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final luaj.Globals f1665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final luaj.LuaValue f1666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        luaj.Varargs f1667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        luaj.Varargs f1668d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        java.lang.String f1669e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public luaj.LuaFunction f1670f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f1671g;
        public boolean h;
        public boolean i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;

        a(luaj.Globals globals, luaj.LuaThread luaThread, luaj.LuaValue luaValue) {
            luaj.LuaValue luaValue2 = luaj.LuaValue.f1676f;
            this.f1667c = luaValue2;
            this.f1668d = luaValue2;
            this.f1669e = null;
            this.o = 0;
            this.f1665a = globals;
            this.f1666b = luaValue;
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            try {
                luaj.Varargs varargs = this.f1667c;
                this.f1667c = luaj.LuaValue.f1676f;
                this.f1668d = this.f1666b.invoke(varargs);
                this.o = 4;
            } catch (java.lang.Throwable th) {
                try {
                    this.f1669e = th.getMessage();
                    this.o = 4;
                } catch (java.lang.Throwable th2) {
                    this.o = 4;
                    notify();
                    throw th2;
                }
            }
            notify();
        }
    }

    public LuaThread(luaj.Globals globals) {
        luaj.LuaThread.a aVar = new luaj.LuaThread.a(globals, this, null);
        this.P = aVar;
        aVar.o = 2;
        this.R = globals;
    }

    @Override // luaj.LuaValue
    public int C2() {
        return 8;
    }

    @Override // luaj.LuaValue
    public java.lang.String D2() {
        return "thread";
    }

    @Override // luaj.LuaValue
    public luaj.LuaThread I0() {
        return this;
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue V0() {
        return T;
    }

    @Override // luaj.LuaValue
    public boolean p1() {
        return true;
    }
}
