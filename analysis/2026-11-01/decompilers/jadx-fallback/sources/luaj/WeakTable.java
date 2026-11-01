package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class WeakTable implements luaj.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final luaj.LuaValue f1687c;

    static class WeakValue extends luaj.LuaValue {
        java.lang.ref.WeakReference P;

        protected WeakValue(luaj.LuaValue r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.P = r0
                return
        }

        @Override // luaj.LuaValue
        public int C2() {
                r2 = this;
                java.lang.String r0 = "type"
                java.lang.String r1 = "weak value"
                r2.a1(r0, r1)
                r0 = 0
                return r0
        }

        @Override // luaj.LuaValue
        public java.lang.String D2() {
                r2 = this;
                java.lang.String r0 = "typename"
                java.lang.String r1 = "weak value"
                r2.a1(r0, r1)
                r0 = 0
                return r0
        }

        @Override // luaj.LuaValue
        public boolean T1(luaj.LuaValue r2) {
                r1 = this;
                java.lang.ref.WeakReference r0 = r1.P
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto L12
                luaj.LuaValue r0 = (luaj.LuaValue) r0
                boolean r2 = r2.T1(r0)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        @Override // luaj.LuaValue
        public luaj.LuaValue p2() {
                r1 = this;
                java.lang.ref.WeakReference r0 = r1.P
                java.lang.Object r0 = r0.get()
                luaj.LuaValue r0 = (luaj.LuaValue) r0
                return r0
        }

        @Override // luaj.LuaValue, luaj.Varargs
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "weak<"
                r0.append(r1)
                java.lang.ref.WeakReference r1 = r2.P
                java.lang.Object r1 = r1.get()
                r0.append(r1)
                r1 = 62
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static class a extends luaj.WeakTable.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f1688d;

        protected a(luaj.LuaValue r2, luaj.LuaValue r3, luaj.LuaTable.m r4) {
                r1 = this;
                luaj.LuaValue r0 = luaj.WeakTable.b(r2)
                luaj.LuaValue r3 = luaj.WeakTable.b(r3)
                r1.<init>(r0, r3, r4)
                int r2 = r2.hashCode()
                r1.f1688d = r2
                return
        }

        protected a(luaj.WeakTable.a r3, luaj.LuaTable.m r4) {
                r2 = this;
                java.lang.Object r0 = r3.f1690a
                java.lang.Object r1 = r3.f1691b
                r2.<init>(r0, r1, r4)
                int r3 = r3.f1688d
                r2.f1688d = r3
                return
        }

        @Override // luaj.LuaTable.m
        public int b(int r2) {
                r1 = this;
                int r0 = r1.f1688d
                int r2 = luaj.LuaTable.l3(r0, r2)
                return r2
        }

        @Override // luaj.WeakTable.c
        protected luaj.WeakTable.c e(luaj.LuaTable.m r2) {
                r1 = this;
                luaj.WeakTable$a r0 = new luaj.WeakTable$a
                r0.<init>(r1, r2)
                return r0
        }

        @Override // luaj.WeakTable.c
        public luaj.LuaTable.m g(luaj.LuaValue r1) {
                r0 = this;
                luaj.LuaValue r1 = luaj.WeakTable.b(r1)
                r0.f1691b = r1
                return r0
        }

        @Override // luaj.WeakTable.c
        public luaj.LuaValue k() {
                r1 = this;
                java.lang.Object r0 = r1.f1690a
                luaj.LuaValue r0 = luaj.WeakTable.a(r0)
                return r0
        }

        @Override // luaj.WeakTable.c
        public luaj.LuaValue m() {
                r1 = this;
                java.lang.Object r0 = r1.f1691b
                luaj.LuaValue r0 = luaj.WeakTable.a(r0)
                return r0
        }
    }

    static class b extends luaj.WeakTable.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f1689d;

        protected b(luaj.LuaValue r2, luaj.LuaValue r3, luaj.LuaTable.m r4) {
                r1 = this;
                luaj.LuaValue r0 = luaj.WeakTable.b(r2)
                r1.<init>(r0, r3, r4)
                int r2 = r2.hashCode()
                r1.f1689d = r2
                return
        }

        protected b(luaj.WeakTable.b r3, luaj.LuaTable.m r4) {
                r2 = this;
                java.lang.Object r0 = r3.f1690a
                java.lang.Object r1 = r3.f1691b
                r2.<init>(r0, r1, r4)
                int r3 = r3.f1689d
                r2.f1689d = r3
                return
        }

        @Override // luaj.LuaTable.m
        public int b(int r2) {
                r1 = this;
                int r0 = r1.f1689d
                int r2 = luaj.LuaTable.l3(r0, r2)
                return r2
        }

        @Override // luaj.WeakTable.c
        protected luaj.WeakTable.c e(luaj.LuaTable.m r2) {
                r1 = this;
                luaj.WeakTable$b r0 = new luaj.WeakTable$b
                r0.<init>(r1, r2)
                return r0
        }

        @Override // luaj.WeakTable.c
        public luaj.LuaTable.m g(luaj.LuaValue r1) {
                r0 = this;
                r0.f1691b = r1
                return r0
        }

        @Override // luaj.WeakTable.c
        public luaj.LuaValue k() {
                r1 = this;
                java.lang.Object r0 = r1.f1690a
                luaj.LuaValue r0 = luaj.WeakTable.a(r0)
                return r0
        }
    }

    public static abstract class c implements luaj.LuaTable.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected java.lang.Object f1690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected java.lang.Object f1691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected luaj.LuaTable.m f1692c;

        protected c(java.lang.Object r1, java.lang.Object r2, luaj.LuaTable.m r3) {
                r0 = this;
                r0.<init>()
                r0.f1690a = r1
                r0.f1691b = r2
                r0.f1692c = r3
                return
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m a() {
                r1 = this;
                luaj.LuaTable$m r0 = r1.f1692c
                return r0
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m d(luaj.LuaTable.m r2) {
                r1 = this;
                luaj.LuaTable$m r0 = r1.f1692c
                if (r0 == 0) goto L8
                luaj.LuaTable$m r2 = r0.d(r2)
            L8:
                r1.f1692c = r2
                luaj.LuaValue r2 = r1.k()
                if (r2 == 0) goto L17
                luaj.LuaValue r2 = r1.m()
                if (r2 == 0) goto L17
                return r1
            L17:
                luaj.LuaTable$m r2 = r1.f1692c
                return r2
        }

        protected abstract luaj.WeakTable.c e(luaj.LuaTable.m r1);

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.n f(luaj.LuaValue r2) {
                r1 = this;
                luaj.LuaTable$n r0 = r1.l()
                if (r0 == 0) goto Lb
                luaj.LuaTable$n r2 = r0.f(r2)
                goto Lc
            Lb:
                r2 = 0
            Lc:
                return r2
        }

        public abstract luaj.LuaTable.m g(luaj.LuaValue r1);

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m h(luaj.LuaTable.n r2) {
                r1 = this;
                luaj.LuaValue r0 = r1.k()
                if (r0 != 0) goto Ld
                luaj.LuaTable$m r0 = r1.f1692c
                luaj.LuaTable$m r2 = r0.h(r2)
                return r2
            Ld:
                boolean r0 = r2.s(r0)
                if (r0 == 0) goto L17
                r2 = 0
                r1.f1691b = r2
                return r1
            L17:
                luaj.LuaTable$m r0 = r1.f1692c
                luaj.LuaTable$m r2 = r0.h(r2)
                r1.f1692c = r2
                return r1
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m j(luaj.LuaTable.n r3, luaj.LuaValue r4) {
                r2 = this;
                luaj.LuaValue r0 = r2.k()
                if (r0 == 0) goto L11
                luaj.LuaTable$n r1 = r3.f(r0)
                if (r1 == 0) goto L11
                luaj.LuaTable$m r3 = r2.g(r4)
                return r3
            L11:
                if (r0 == 0) goto L1c
                luaj.LuaTable$m r0 = r2.f1692c
                luaj.LuaTable$m r3 = r0.j(r3, r4)
                r2.f1692c = r3
                return r2
            L1c:
                luaj.LuaTable$m r0 = r2.f1692c
                luaj.LuaTable$m r3 = r0.j(r3, r4)
                return r3
        }

        public luaj.LuaValue k() {
                r1 = this;
                java.lang.Object r0 = r1.f1690a
                luaj.LuaValue r0 = (luaj.LuaValue) r0
                return r0
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.n l() {
                r3 = this;
                luaj.LuaValue r0 = r3.k()
                luaj.LuaValue r1 = r3.m()
                if (r0 == 0) goto L12
                if (r1 == 0) goto L12
                luaj.LuaTable$l r2 = new luaj.LuaTable$l
                r2.<init>(r0, r1)
                return r2
            L12:
                r0 = 0
                r3.f1690a = r0
                r3.f1691b = r0
                return r0
        }

        public luaj.LuaValue m() {
                r1 = this;
                java.lang.Object r0 = r1.f1691b
                luaj.LuaValue r0 = (luaj.LuaValue) r0
                return r0
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m n(luaj.LuaTable.m r2) {
                r1 = this;
                luaj.LuaValue r0 = r1.k()
                if (r0 == 0) goto L17
                luaj.LuaValue r0 = r1.m()
                if (r0 == 0) goto L17
                if (r2 != 0) goto L13
                luaj.LuaTable$m r0 = r1.f1692c
                if (r0 != 0) goto L13
                return r1
            L13:
                luaj.WeakTable$c r2 = r1.e(r2)
            L17:
                return r2
        }

        @Override // luaj.LuaTable.m
        public int r(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // luaj.LuaTable.m
        public boolean s(luaj.LuaValue r2) {
                r1 = this;
                luaj.LuaTable$n r0 = r1.l()
                if (r0 == 0) goto Le
                boolean r2 = r0.s(r2)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                return r2
        }
    }

    static class d extends luaj.WeakTable.c {
        protected d(luaj.LuaValue r1, luaj.LuaValue r2, luaj.LuaTable.m r3) {
                r0 = this;
                luaj.LuaValue r2 = luaj.WeakTable.b(r2)
                r0.<init>(r1, r2, r3)
                return
        }

        protected d(luaj.WeakTable.d r2, luaj.LuaTable.m r3) {
                r1 = this;
                java.lang.Object r0 = r2.f1690a
                java.lang.Object r2 = r2.f1691b
                r1.<init>(r0, r2, r3)
                return
        }

        @Override // luaj.LuaTable.m
        public int b(int r2) {
                r1 = this;
                luaj.LuaValue r0 = r1.k()
                int r2 = luaj.LuaTable.j3(r0, r2)
                return r2
        }

        @Override // luaj.WeakTable.c
        protected luaj.WeakTable.c e(luaj.LuaTable.m r2) {
                r1 = this;
                luaj.WeakTable$d r0 = new luaj.WeakTable$d
                r0.<init>(r1, r2)
                return r0
        }

        @Override // luaj.WeakTable.c
        public luaj.LuaTable.m g(luaj.LuaValue r1) {
                r0 = this;
                luaj.LuaValue r1 = luaj.WeakTable.b(r1)
                r0.f1691b = r1
                return r0
        }

        @Override // luaj.WeakTable.c
        public luaj.LuaValue m() {
                r1 = this;
                java.lang.Object r0 = r1.f1691b
                luaj.LuaValue r0 = luaj.WeakTable.a(r0)
                return r0
        }
    }

    public WeakTable(boolean r1, boolean r2, luaj.LuaValue r3) {
            r0 = this;
            r0.<init>()
            r0.f1685a = r1
            r0.f1686b = r2
            r0.f1687c = r3
            return
    }

    protected static luaj.LuaValue a(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.ref.WeakReference
            if (r0 == 0) goto La
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
        La:
            boolean r0 = r1 instanceof luaj.WeakTable.WeakValue
            if (r0 == 0) goto L15
            luaj.WeakTable$WeakValue r1 = (luaj.WeakTable.WeakValue) r1
            luaj.LuaValue r1 = r1.p2()
            return r1
        L15:
            luaj.LuaValue r1 = (luaj.LuaValue) r1
            return r1
    }

    protected static luaj.LuaValue b(luaj.LuaValue r2) {
            int r0 = r2.C2()
            r1 = 5
            if (r0 == r1) goto L12
            r1 = 6
            if (r0 == r1) goto L12
            r1 = 7
            if (r0 == r1) goto L12
            r1 = 8
            if (r0 == r1) goto L12
            return r2
        L12:
            luaj.WeakTable$WeakValue r0 = new luaj.WeakTable$WeakValue
            r0.<init>(r2)
            return r0
    }

    @Override // luaj.e
    public luaj.LuaValue e() {
            r1 = this;
            luaj.LuaValue r0 = r1.f1687c
            return r0
    }

    @Override // luaj.e
    public luaj.LuaValue g(luaj.LuaValue r2) {
            r1 = this;
            boolean r0 = r1.f1686b
            if (r0 == 0) goto L8
            luaj.LuaValue r2 = b(r2)
        L8:
            return r2
    }

    @Override // luaj.e
    public luaj.LuaTable.m k(luaj.LuaValue r3, luaj.LuaValue r4) {
            r2 = this;
            luaj.LuaValue r4 = r4.p2()
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            boolean r1 = r2.f1685a
            if (r1 == 0) goto L40
            boolean r1 = r3.m1()
            if (r1 != 0) goto L40
            boolean r1 = r3.n1()
            if (r1 != 0) goto L40
            boolean r1 = r3.e1()
            if (r1 != 0) goto L40
            boolean r1 = r2.f1686b
            if (r1 == 0) goto L3a
            boolean r1 = r4.m1()
            if (r1 != 0) goto L3a
            boolean r1 = r4.n1()
            if (r1 != 0) goto L3a
            boolean r1 = r4.e1()
            if (r1 != 0) goto L3a
            luaj.WeakTable$a r1 = new luaj.WeakTable$a
            r1.<init>(r3, r4, r0)
            return r1
        L3a:
            luaj.WeakTable$b r1 = new luaj.WeakTable$b
            r1.<init>(r3, r4, r0)
            return r1
        L40:
            boolean r1 = r2.f1686b
            if (r1 == 0) goto L5c
            boolean r1 = r4.m1()
            if (r1 != 0) goto L5c
            boolean r1 = r4.n1()
            if (r1 != 0) goto L5c
            boolean r1 = r4.e1()
            if (r1 != 0) goto L5c
            luaj.WeakTable$d r1 = new luaj.WeakTable$d
            r1.<init>(r3, r4, r0)
            return r1
        L5c:
            luaj.LuaTable$e r3 = luaj.LuaTable.Z2(r3, r4)
            return r3
    }

    @Override // luaj.e
    public luaj.LuaValue o(luaj.LuaValue[] r3, int r4) {
            r2 = this;
            r0 = r3[r4]
            if (r0 == 0) goto Ld
            luaj.LuaValue r0 = a(r0)
            if (r0 != 0) goto Ld
            r1 = 0
            r3[r4] = r1
        Ld:
            return r0
    }

    @Override // luaj.e
    public boolean p() {
            r1 = this;
            boolean r0 = r1.f1686b
            return r0
    }

    @Override // luaj.e
    public boolean q() {
            r1 = this;
            boolean r0 = r1.f1685a
            return r0
    }
}
