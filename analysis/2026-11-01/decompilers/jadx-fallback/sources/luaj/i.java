package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    luaj.LuaValue[] f1728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f1729b;

    public i(luaj.LuaValue[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f1728a = r1
            r0.f1729b = r2
            return
    }

    public final void a() {
            r5 = this;
            luaj.LuaValue[] r0 = r5.f1728a
            r1 = 1
            luaj.LuaValue[] r1 = new luaj.LuaValue[r1]
            int r2 = r5.f1729b
            r3 = r0[r2]
            r4 = 0
            r1[r4] = r3
            r5.f1728a = r1
            r1 = 0
            r0[r2] = r1
            r5.f1729b = r4
            return
    }

    public final luaj.LuaValue b() {
            r2 = this;
            luaj.LuaValue[] r0 = r2.f1728a
            int r1 = r2.f1729b
            r0 = r0[r1]
            return r0
    }

    public final void c(luaj.LuaValue r3) {
            r2 = this;
            luaj.LuaValue[] r0 = r2.f1728a
            int r1 = r2.f1729b
            r0[r1] = r3
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            int r1 = r3.f1729b
            r0.append(r1)
            r1 = 47
            r0.append(r1)
            luaj.LuaValue[] r1 = r3.f1728a
            int r1 = r1.length
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            luaj.LuaValue[] r1 = r3.f1728a
            int r2 = r3.f1729b
            r1 = r1[r2]
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
