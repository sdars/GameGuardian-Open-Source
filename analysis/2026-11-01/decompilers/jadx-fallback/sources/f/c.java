package f;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class c extends luaj.Varargs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private luaj.LuaValue f1559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private luaj.Varargs f1560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private luaj.Varargs f1561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final luaj.Globals f1562e;

    public c(luaj.Globals r1, luaj.LuaValue r2, luaj.Varargs r3) {
            r0 = this;
            r0.<init>()
            r0.f1562e = r1
            r0.f1559b = r2
            r0.f1560c = r3
            return
    }

    @Override // luaj.Varargs
    public luaj.Varargs N() {
            r7 = this;
            luaj.Varargs r0 = r7.f1561d
            if (r0 != 0) goto L46
            luaj.Globals r1 = r7.f1562e
            r2 = 0
            if (r1 == 0) goto Lc
            luaj.lib.DebugLib r1 = r1.i0
            goto Ld
        Lc:
            r1 = r2
        Ld:
            luaj.LuaValue r3 = r7.f1559b
            luaj.Varargs r4 = r7.f1560c
        L11:
            if (r0 != 0) goto L46
            r5 = 1
            if (r1 == 0) goto L29
            boolean r6 = r3.f1()
            if (r6 != 0) goto L29
            boolean r6 = r3.g1()
            if (r6 == 0) goto L29
            luaj.LuaFunction r6 = r3.y0()
            r1.j3(r6, r5)
        L29:
            luaj.Varargs r5 = r3.D1(r4, r5)
            boolean r6 = r5.O()
            if (r6 == 0) goto L3e
            f.c r5 = (f.c) r5
            luaj.LuaValue r3 = r5.f1559b
            r7.f1559b = r3
            luaj.Varargs r4 = r5.f1560c
            r7.f1560c = r4
            goto L11
        L3e:
            r7.f1561d = r5
            r7.f1559b = r2
            r7.f1560c = r2
            r0 = r5
            goto L11
        L46:
            return r0
    }

    @Override // luaj.Varargs
    public boolean O() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // luaj.Varargs
    public int U() {
            r1 = this;
            luaj.Varargs r0 = r1.f1561d
            if (r0 != 0) goto L7
            r1.N()
        L7:
            luaj.Varargs r0 = r1.f1561d
            int r0 = r0.U()
            return r0
    }

    @Override // luaj.Varargs
    public luaj.Varargs e0(int r2) {
            r1 = this;
            luaj.Varargs r0 = r1.f1561d
            if (r0 != 0) goto L7
            r1.N()
        L7:
            luaj.Varargs r0 = r1.f1561d
            luaj.Varargs r2 = r0.e0(r2)
            return r2
    }

    @Override // luaj.Varargs
    public luaj.LuaValue v(int r2) {
            r1 = this;
            luaj.Varargs r0 = r1.f1561d
            if (r0 != 0) goto L7
            r1.N()
        L7:
            luaj.Varargs r0 = r1.f1561d
            luaj.LuaValue r2 = r0.v(r2)
            return r2
    }

    @Override // luaj.Varargs
    public luaj.LuaValue w() {
            r1 = this;
            luaj.Varargs r0 = r1.f1561d
            if (r0 != 0) goto L7
            r1.N()
        L7:
            luaj.Varargs r0 = r1.f1561d
            luaj.LuaValue r0 = r0.w()
            return r0
    }
}
