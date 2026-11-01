package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class LuaThread extends LuaValue {
    public static LuaValue T;
    public static final String[] U = {"suspended", "suspended", "running", "normal", "dead"};
    public final a P;
    public Object Q;
    public final Globals R;
    public LuaValue S;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Globals f1663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LuaValue f1664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Varargs f1665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Varargs f1666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f1667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LuaFunction f1668f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f1669g;
        public boolean h;
        public boolean i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;

        a(Globals globals, LuaThread luaThread, LuaValue luaValue) {
            LuaValue luaValue2 = LuaValue.f1674f;
            this.f1665c = luaValue2;
            this.f1666d = luaValue2;
            this.f1667e = null;
            this.o = 0;
            this.f1663a = globals;
            this.f1664b = luaValue;
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            try {
                Varargs varargs = this.f1665c;
                this.f1665c = LuaValue.f1674f;
                this.f1666d = this.f1664b.invoke(varargs);
                this.o = 4;
            } catch (Throwable th) {
                try {
                    this.f1667e = th.getMessage();
                    this.o = 4;
                } catch (Throwable th2) {
                    this.o = 4;
                    notify();
                    throw th2;
                }
            }
            notify();
        }
    }

    public LuaThread(Globals globals) {
        a aVar = new a(globals, this, null);
        this.P = aVar;
        aVar.o = 2;
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
