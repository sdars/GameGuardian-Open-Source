package luaj;

/* JADX INFO: loaded from: classes.dex */
public class LuaThread$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Globals f1665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LuaValue f1666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Varargs f1667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Varargs f1668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f1669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LuaFunction f1670f;

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

    LuaThread$a(Globals globals, LuaThread luaThread, LuaValue luaValue) {
        LuaValue luaValue2 = LuaValue.f1676f;
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
            try {
                Varargs varargs = this.f1667c;
                this.f1667c = LuaValue.f1676f;
                this.f1668d = this.f1666b.invoke(varargs);
                this.o = 4;
            } catch (Throwable th) {
                try {
                    this.f1669e = th.getMessage();
                    this.o = 4;
                } catch (Throwable th2) {
                    this.o = 4;
                    notify();
                    throw th2;
                }
            }
            notify();
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
