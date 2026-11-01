package luaj;

/* JADX INFO: loaded from: classes.dex */
public class WeakTable implements luaj.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final luaj.LuaValue f1689c;

    static class WeakValue extends luaj.LuaValue {
        java.lang.ref.WeakReference P;

        protected WeakValue(luaj.LuaValue luaValue) {
            this.P = new java.lang.ref.WeakReference(luaValue);
        }

        @Override // luaj.LuaValue
        public int C2() {
            a1("type", "weak value");
            return 0;
        }

        @Override // luaj.LuaValue
        public java.lang.String D2() {
            a1("typename", "weak value");
            return null;
        }

        @Override // luaj.LuaValue
        public boolean T1(luaj.LuaValue luaValue) {
            java.lang.Object obj = this.P.get();
            return obj != null && luaValue.T1((luaj.LuaValue) obj);
        }

        @Override // luaj.LuaValue
        public luaj.LuaValue p2() {
            return (luaj.LuaValue) this.P.get();
        }

        @Override // luaj.LuaValue, luaj.Varargs
        public java.lang.String toString() {
            return "weak<" + this.P.get() + '>';
        }
    }

    static class a extends luaj.WeakTable.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f1690d;

        protected a(luaj.LuaValue luaValue, luaj.LuaValue luaValue2, luaj.LuaTable.m mVar) {
            super(luaj.WeakTable.b(luaValue), luaj.WeakTable.b(luaValue2), mVar);
            this.f1690d = luaValue.hashCode();
        }

        protected a(luaj.WeakTable.a aVar, luaj.LuaTable.m mVar) {
            super(aVar.f1692a, aVar.f1693b, mVar);
            this.f1690d = aVar.f1690d;
        }

        @Override // luaj.LuaTable.m
        public int b(int i) {
            return luaj.LuaTable.l3(this.f1690d, i);
        }

        @Override // luaj.WeakTable.c
        protected luaj.WeakTable.c e(luaj.LuaTable.m mVar) {
            return new luaj.WeakTable.a(this, mVar);
        }

        @Override // luaj.WeakTable.c
        public luaj.LuaTable.m g(luaj.LuaValue luaValue) {
            this.f1693b = luaj.WeakTable.b(luaValue);
            return this;
        }

        @Override // luaj.WeakTable.c
        public luaj.LuaValue k() {
            return luaj.WeakTable.a(this.f1692a);
        }

        @Override // luaj.WeakTable.c
        public luaj.LuaValue m() {
            return luaj.WeakTable.a(this.f1693b);
        }
    }

    static class b extends luaj.WeakTable.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f1691d;

        protected b(luaj.LuaValue luaValue, luaj.LuaValue luaValue2, luaj.LuaTable.m mVar) {
            super(luaj.WeakTable.b(luaValue), luaValue2, mVar);
            this.f1691d = luaValue.hashCode();
        }

        protected b(luaj.WeakTable.b bVar, luaj.LuaTable.m mVar) {
            super(bVar.f1692a, bVar.f1693b, mVar);
            this.f1691d = bVar.f1691d;
        }

        @Override // luaj.LuaTable.m
        public int b(int i) {
            return luaj.LuaTable.l3(this.f1691d, i);
        }

        @Override // luaj.WeakTable.c
        protected luaj.WeakTable.c e(luaj.LuaTable.m mVar) {
            return new luaj.WeakTable.b(this, mVar);
        }

        @Override // luaj.WeakTable.c
        public luaj.LuaTable.m g(luaj.LuaValue luaValue) {
            this.f1693b = luaValue;
            return this;
        }

        @Override // luaj.WeakTable.c
        public luaj.LuaValue k() {
            return luaj.WeakTable.a(this.f1692a);
        }
    }

    public static abstract class c implements luaj.LuaTable.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected java.lang.Object f1692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected java.lang.Object f1693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected luaj.LuaTable.m f1694c;

        protected c(java.lang.Object obj, java.lang.Object obj2, luaj.LuaTable.m mVar) {
            this.f1692a = obj;
            this.f1693b = obj2;
            this.f1694c = mVar;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m a() {
            return this.f1694c;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m d(luaj.LuaTable.m mVar) {
            luaj.LuaTable.m mVar2 = this.f1694c;
            if (mVar2 != null) {
                mVar = mVar2.d(mVar);
            }
            this.f1694c = mVar;
            return (k() == null || m() == null) ? this.f1694c : this;
        }

        protected abstract luaj.WeakTable.c e(luaj.LuaTable.m mVar);

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.n f(luaj.LuaValue luaValue) {
            luaj.LuaTable.n nVarL = l();
            if (nVarL != null) {
                return nVarL.f(luaValue);
            }
            return null;
        }

        public abstract luaj.LuaTable.m g(luaj.LuaValue luaValue);

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m h(luaj.LuaTable.n nVar) {
            luaj.LuaValue luaValueK = k();
            if (luaValueK == null) {
                return this.f1694c.h(nVar);
            }
            if (nVar.s(luaValueK)) {
                this.f1693b = null;
                return this;
            }
            this.f1694c = this.f1694c.h(nVar);
            return this;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m j(luaj.LuaTable.n nVar, luaj.LuaValue luaValue) {
            luaj.LuaValue luaValueK = k();
            if (luaValueK != null && nVar.f(luaValueK) != null) {
                return g(luaValue);
            }
            if (luaValueK == null) {
                return this.f1694c.j(nVar, luaValue);
            }
            this.f1694c = this.f1694c.j(nVar, luaValue);
            return this;
        }

        public luaj.LuaValue k() {
            return (luaj.LuaValue) this.f1692a;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.n l() {
            luaj.LuaValue luaValueK = k();
            luaj.LuaValue luaValueM = m();
            if (luaValueK != null && luaValueM != null) {
                return new luaj.LuaTable.l(luaValueK, luaValueM);
            }
            this.f1692a = null;
            this.f1693b = null;
            return null;
        }

        public luaj.LuaValue m() {
            return (luaj.LuaValue) this.f1693b;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m n(luaj.LuaTable.m mVar) {
            if (k() == null || m() == null) {
                return mVar;
            }
            return (mVar == null && this.f1694c == null) ? this : e(mVar);
        }

        @Override // luaj.LuaTable.m
        public int r(int i) {
            return 0;
        }

        @Override // luaj.LuaTable.m
        public boolean s(luaj.LuaValue luaValue) {
            luaj.LuaTable.n nVarL = l();
            return nVarL != null && nVarL.s(luaValue);
        }
    }

    static class d extends luaj.WeakTable.c {
        protected d(luaj.LuaValue luaValue, luaj.LuaValue luaValue2, luaj.LuaTable.m mVar) {
            super(luaValue, luaj.WeakTable.b(luaValue2), mVar);
        }

        protected d(luaj.WeakTable.d dVar, luaj.LuaTable.m mVar) {
            super(dVar.f1692a, dVar.f1693b, mVar);
        }

        @Override // luaj.LuaTable.m
        public int b(int i) {
            return luaj.LuaTable.j3(k(), i);
        }

        @Override // luaj.WeakTable.c
        protected luaj.WeakTable.c e(luaj.LuaTable.m mVar) {
            return new luaj.WeakTable.d(this, mVar);
        }

        @Override // luaj.WeakTable.c
        public luaj.LuaTable.m g(luaj.LuaValue luaValue) {
            this.f1693b = luaj.WeakTable.b(luaValue);
            return this;
        }

        @Override // luaj.WeakTable.c
        public luaj.LuaValue m() {
            return luaj.WeakTable.a(this.f1693b);
        }
    }

    public WeakTable(boolean z, boolean z2, luaj.LuaValue luaValue) {
        this.f1687a = z;
        this.f1688b = z2;
        this.f1689c = luaValue;
    }

    protected static luaj.LuaValue a(java.lang.Object obj) {
        if (obj instanceof java.lang.ref.WeakReference) {
            obj = ((java.lang.ref.WeakReference) obj).get();
        }
        return obj instanceof luaj.WeakTable.WeakValue ? ((luaj.WeakTable.WeakValue) obj).p2() : (luaj.LuaValue) obj;
    }

    protected static luaj.LuaValue b(luaj.LuaValue luaValue) {
        int iC2 = luaValue.C2();
        return (iC2 == 5 || iC2 == 6 || iC2 == 7 || iC2 == 8) ? new luaj.WeakTable.WeakValue(luaValue) : luaValue;
    }

    @Override // luaj.e
    public luaj.LuaValue e() {
        return this.f1689c;
    }

    @Override // luaj.e
    public luaj.LuaValue g(luaj.LuaValue luaValue) {
        return this.f1688b ? b(luaValue) : luaValue;
    }

    @Override // luaj.e
    public luaj.LuaTable.m k(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
        luaj.LuaValue luaValueP2 = luaValue2.p2();
        if (luaValueP2 == null) {
            return null;
        }
        if (!this.f1687a || luaValue.m1() || luaValue.n1() || luaValue.e1()) {
            return (!this.f1688b || luaValueP2.m1() || luaValueP2.n1() || luaValueP2.e1()) ? luaj.LuaTable.Z2(luaValue, luaValueP2) : new luaj.WeakTable.d(luaValue, luaValueP2, null);
        }
        return (!this.f1688b || luaValueP2.m1() || luaValueP2.n1() || luaValueP2.e1()) ? new luaj.WeakTable.b(luaValue, luaValueP2, null) : new luaj.WeakTable.a(luaValue, luaValueP2, null);
    }

    @Override // luaj.e
    public luaj.LuaValue o(luaj.LuaValue[] luaValueArr, int i) {
        luaj.LuaValue luaValueA = luaValueArr[i];
        if (luaValueA != null && (luaValueA = a(luaValueA)) == null) {
            luaValueArr[i] = null;
        }
        return luaValueA;
    }

    @Override // luaj.e
    public boolean p() {
        return this.f1688b;
    }

    @Override // luaj.e
    public boolean q() {
        return this.f1687a;
    }
}
