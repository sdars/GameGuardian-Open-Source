package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class LuaThread extends luaj.LuaValue {
    public static luaj.LuaValue T;
    public static final java.lang.String[] U = null;
    public final luaj.LuaThread.a P;
    public java.lang.Object Q;
    public final luaj.Globals R;
    public luaj.LuaValue S;

    public static class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final luaj.Globals f1663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final luaj.LuaValue f1664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        luaj.Varargs f1665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        luaj.Varargs f1666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        java.lang.String f1667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public luaj.LuaFunction f1668f;

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

        a(luaj.Globals r1, luaj.LuaThread r2, luaj.LuaValue r3) {
                r0 = this;
                r0.<init>()
                luaj.LuaValue r2 = luaj.LuaValue.f1674f
                r0.f1665c = r2
                r0.f1666d = r2
                r2 = 0
                r0.f1667e = r2
                r2 = 0
                r0.o = r2
                r0.f1663a = r1
                r0.f1664b = r3
                return
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
                r3 = this;
                monitor-enter(r3)
                r0 = 4
                luaj.Varargs r1 = r3.f1665c     // Catch: java.lang.Throwable -> L18
                luaj.LuaValue r2 = luaj.LuaValue.f1674f     // Catch: java.lang.Throwable -> L18
                r3.f1665c = r2     // Catch: java.lang.Throwable -> L18
                luaj.LuaValue r2 = r3.f1664b     // Catch: java.lang.Throwable -> L18
                luaj.Varargs r1 = r2.invoke(r1)     // Catch: java.lang.Throwable -> L18
                r3.f1666d = r1     // Catch: java.lang.Throwable -> L18
                r3.o = r0     // Catch: java.lang.Throwable -> L16
            L12:
                r3.notify()     // Catch: java.lang.Throwable -> L16
                goto L22
            L16:
                r0 = move-exception
                goto L2b
            L18:
                r1 = move-exception
                java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L24
                r3.f1667e = r1     // Catch: java.lang.Throwable -> L24
                r3.o = r0     // Catch: java.lang.Throwable -> L16
                goto L12
            L22:
                monitor-exit(r3)
                return
            L24:
                r1 = move-exception
                r3.o = r0     // Catch: java.lang.Throwable -> L16
                r3.notify()     // Catch: java.lang.Throwable -> L16
                throw r1     // Catch: java.lang.Throwable -> L16
            L2b:
                monitor-exit(r3)
                throw r0
        }
    }

    static {
            java.lang.String r0 = "normal"
            java.lang.String r1 = "dead"
            java.lang.String r2 = "suspended"
            java.lang.String r3 = "running"
            java.lang.String[] r0 = new java.lang.String[]{r2, r2, r3, r0, r1}
            luaj.LuaThread.U = r0
            return
    }

    public LuaThread(luaj.Globals r3) {
            r2 = this;
            r2.<init>()
            luaj.LuaThread$a r0 = new luaj.LuaThread$a
            r1 = 0
            r0.<init>(r3, r2, r1)
            r2.P = r0
            r1 = 2
            r0.o = r1
            r2.R = r3
            return
    }

    @Override // luaj.LuaValue
    public int C2() {
            r1 = this;
            r0 = 8
            return r0
    }

    @Override // luaj.LuaValue
    public java.lang.String D2() {
            r1 = this;
            java.lang.String r0 = "thread"
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaThread I0() {
            r0 = this;
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue V0() {
            r1 = this;
            luaj.LuaValue r0 = luaj.LuaThread.T
            return r0
    }

    @Override // luaj.LuaValue
    public boolean p1() {
            r1 = this;
            r0 = 1
            return r0
    }
}
