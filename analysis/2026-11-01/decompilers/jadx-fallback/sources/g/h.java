package g;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class h extends g.a implements luaj.Globals.a, luaj.Globals.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g.h f1629b = null;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.util.Hashtable f1631b;

        protected a() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f1630a = r0
                java.util.Hashtable r0 = new java.util.Hashtable
                r0.<init>()
                r1.f1631b = r0
                return
        }

        public luaj.LuaString a(luaj.LuaString r2) {
                r1 = this;
                java.util.Hashtable r0 = r1.f1631b
                java.lang.Object r0 = r0.get(r2)
                luaj.LuaString r0 = (luaj.LuaString) r0
                if (r0 == 0) goto Lb
                return r0
            Lb:
                java.util.Hashtable r0 = r1.f1631b
                r0.put(r2, r2)
                return r2
        }

        luaj.h b(java.io.InputStream r5, java.lang.String r6) {
                r4 = this;
                g.g r0 = new g.g
                r0.<init>(r4, r5)
                g.c r1 = new g.c
                r1.<init>()
                r0.f1593g = r1
                int r2 = r5.read()
                luaj.LuaString r3 = luaj.LuaValue.K2(r6)
                r0.y1(r4, r2, r5, r3)
                luaj.h r5 = new luaj.h
                r5.<init>()
                r1.f1573b = r5
                luaj.LuaString r6 = luaj.LuaValue.K2(r6)
                r5.f1727g = r6
                r0.a1(r1)
                g.c r5 = r1.f1575d
                r6 = 0
                r2 = 1
                if (r5 != 0) goto L2f
                r5 = 1
                goto L30
            L2f:
                r5 = 0
            L30:
                g.a.C(r5)
                g.g$d r5 = r0.l
                if (r5 == 0) goto L43
                int r0 = r5.f1602b
                if (r0 != 0) goto L44
                int r0 = r5.f1604d
                if (r0 != 0) goto L44
                int r5 = r5.f1606f
                if (r5 != 0) goto L44
            L43:
                r6 = 1
            L44:
                g.a.C(r6)
                luaj.h r5 = r1.f1573b
                return r5
        }

        public luaj.LuaString c(java.lang.String r1) {
                r0 = this;
                luaj.LuaString r1 = luaj.LuaString.K2(r1)
                luaj.LuaString r1 = r0.a(r1)
                return r1
        }

        public luaj.LuaString d(luaj.LuaString r1) {
                r0 = this;
                luaj.LuaString r1 = r0.a(r1)
                return r1
        }

        public java.lang.String e(java.lang.String r1) {
                r0 = this;
                return r1
        }
    }

    static {
            g.h r0 = new g.h
            r0.<init>()
            g.h.f1629b = r0
            return
    }

    protected h() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void M(luaj.Globals r1) {
            g.h r0 = g.h.f1629b
            r1.k0 = r0
            r1.j0 = r0
            return
    }

    @Override // luaj.Globals.b
    public luaj.LuaFunction a(luaj.h r2, java.lang.String r3, luaj.LuaValue r4) {
            r1 = this;
            luaj.LuaClosure r3 = new luaj.LuaClosure
            r0 = 1
            r3.<init>(r2, r4, r0)
            return r3
    }

    @Override // luaj.Globals.a
    public luaj.h b(java.io.InputStream r2, java.lang.String r3) {
            r1 = this;
            g.h$a r0 = new g.h$a
            r0.<init>()
            luaj.h r2 = r0.b(r2, r3)
            return r2
    }
}
