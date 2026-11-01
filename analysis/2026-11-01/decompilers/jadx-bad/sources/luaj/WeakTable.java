package luaj;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class WeakTable implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LuaValue f1687c;

    static class WeakValue extends LuaValue {
        WeakReference P;

        protected WeakValue(LuaValue luaValue) {
            this.P = new WeakReference(luaValue);
        }

        @Override // luaj.LuaValue
        public int C2() {
            a1("type", "weak value");
            return 0;
        }

        @Override // luaj.LuaValue
        public String D2() {
            a1("typename", "weak value");
            return null;
        }

        @Override // luaj.LuaValue
        public boolean T1(LuaValue luaValue) {
            Object obj = this.P.get();
            return obj != null && luaValue.T1((LuaValue) obj);
        }

        @Override // luaj.LuaValue
        public LuaValue p2() {
            return (LuaValue) this.P.get();
        }

        @Override // luaj.LuaValue, luaj.Varargs
        public String toString() {
            return "weak<" + this.P.get() + '>';
        }
    }

    static class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f1688d;

        protected a(LuaValue luaValue, LuaValue luaValue2, LuaTable.m mVar) {
            super(WeakTable.b(luaValue), WeakTable.b(luaValue2), mVar);
            this.f1688d = luaValue.hashCode();
        }

        @Override // luaj.LuaTable.m
        public int b(int i) {
            return LuaTable.l3(this.f1688d, i);
        }

        @Override // luaj.WeakTable.c
        protected c e(LuaTable.m mVar) {
            return new a(this, mVar);
        }

        @Override // luaj.WeakTable.c
        public LuaTable.m g(LuaValue luaValue) {
            this.f1691b = WeakTable.b(luaValue);
            return this;
        }

        @Override // luaj.WeakTable.c
        public LuaValue k() {
            return WeakTable.a(this.f1690a);
        }

        @Override // luaj.WeakTable.c
        public LuaValue m() {
            return WeakTable.a(this.f1691b);
        }

        protected a(a aVar, LuaTable.m mVar) {
            super(aVar.f1690a, aVar.f1691b, mVar);
            this.f1688d = aVar.f1688d;
        }
    }

    static class b extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f1689d;

        protected b(LuaValue luaValue, LuaValue luaValue2, LuaTable.m mVar) {
            super(WeakTable.b(luaValue), luaValue2, mVar);
            this.f1689d = luaValue.hashCode();
        }

        @Override // luaj.LuaTable.m
        public int b(int i) {
            return LuaTable.l3(this.f1689d, i);
        }

        @Override // luaj.WeakTable.c
        protected c e(LuaTable.m mVar) {
            return new b(this, mVar);
        }

        @Override // luaj.WeakTable.c
        public LuaTable.m g(LuaValue luaValue) {
            this.f1691b = luaValue;
            return this;
        }

        @Override // luaj.WeakTable.c
        public LuaValue k() {
            return WeakTable.a(this.f1690a);
        }

        protected b(b bVar, LuaTable.m mVar) {
            super(bVar.f1690a, bVar.f1691b, mVar);
            this.f1689d = bVar.f1689d;
        }
    }

    public static abstract class c implements LuaTable.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected Object f1690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected Object f1691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected LuaTable.m f1692c;

        protected c(Object obj, Object obj2, LuaTable.m mVar) {
            this.f1690a = obj;
            this.f1691b = obj2;
            this.f1692c = mVar;
        }

        @Override // luaj.LuaTable.m
        public LuaTable.m a() {
            return this.f1692c;
        }

        @Override // luaj.LuaTable.m
        public LuaTable.m d(LuaTable.m mVar) {
            LuaTable.m mVar2 = this.f1692c;
            if (mVar2 != null) {
                mVar = mVar2.d(mVar);
            }
            this.f1692c = mVar;
            return (k() == null || m() == null) ? this.f1692c : this;
        }

        protected abstract c e(LuaTable.m mVar);

        @Override // luaj.LuaTable.m
        public LuaTable.n f(LuaValue luaValue) {
            LuaTable.n nVarL = l();
            if (nVarL != null) {
                return nVarL.f(luaValue);
            }
            return null;
        }

        public abstract LuaTable.m g(LuaValue luaValue);

        @Override // luaj.LuaTable.m
        public LuaTable.m h(LuaTable.n nVar) {
            LuaValue luaValueK = k();
            if (luaValueK == null) {
                return this.f1692c.h(nVar);
            }
            if (nVar.s(luaValueK)) {
                this.f1691b = null;
                return this;
            }
            this.f1692c = this.f1692c.h(nVar);
            return this;
        }

        @Override // luaj.LuaTable.m
        public LuaTable.m j(LuaTable.n nVar, LuaValue luaValue) {
            LuaValue luaValueK = k();
            if (luaValueK != null && nVar.f(luaValueK) != null) {
                return g(luaValue);
            }
            if (luaValueK == null) {
                return this.f1692c.j(nVar, luaValue);
            }
            this.f1692c = this.f1692c.j(nVar, luaValue);
            return this;
        }

        public LuaValue k() {
            return (LuaValue) this.f1690a;
        }

        @Override // luaj.LuaTable.m
        public LuaTable.n l() {
            LuaValue luaValueK = k();
            LuaValue luaValueM = m();
            if (luaValueK != null && luaValueM != null) {
                return new LuaTable.l(luaValueK, luaValueM);
            }
            this.f1690a = null;
            this.f1691b = null;
            return null;
        }

        public LuaValue m() {
            return (LuaValue) this.f1691b;
        }

        @Override // luaj.LuaTable.m
        public LuaTable.m n(LuaTable.m mVar) {
            if (k() == null || m() == null) {
                return mVar;
            }
            return (mVar == null && this.f1692c == null) ? this : e(mVar);
        }

        @Override // luaj.LuaTable.m
        public int r(int i) {
            return 0;
        }

        @Override // luaj.LuaTable.m
        public boolean s(LuaValue luaValue) {
            LuaTable.n nVarL = l();
            return nVarL != null && nVarL.s(luaValue);
        }
    }

    static class d extends c {
        protected d(LuaValue luaValue, LuaValue luaValue2, LuaTable.m mVar) {
            super(luaValue, WeakTable.b(luaValue2), mVar);
        }

        @Override // luaj.LuaTable.m
        public int b(int i) {
            return LuaTable.j3(k(), i);
        }

        @Override // luaj.WeakTable.c
        protected c e(LuaTable.m mVar) {
            return new d(this, mVar);
        }

        @Override // luaj.WeakTable.c
        public LuaTable.m g(LuaValue luaValue) {
            this.f1691b = WeakTable.b(luaValue);
            return this;
        }

        @Override // luaj.WeakTable.c
        public LuaValue m() {
            return WeakTable.a(this.f1691b);
        }

        protected d(d dVar, LuaTable.m mVar) {
            super(dVar.f1690a, dVar.f1691b, mVar);
        }
    }

    public WeakTable(boolean z, boolean z2, LuaValue luaValue) {
        this.f1685a = z;
        this.f1686b = z2;
        this.f1687c = luaValue;
    }

    protected static LuaValue a(Object obj) {
        if (obj instanceof WeakReference) {
            obj = ((WeakReference) obj).get();
        }
        return obj instanceof WeakValue ? ((WeakValue) obj).p2() : (LuaValue) obj;
    }

    protected static LuaValue b(LuaValue luaValue) {
        int iC2 = luaValue.C2();
        return (iC2 == 5 || iC2 == 6 || iC2 == 7 || iC2 == 8) ? new WeakValue(luaValue) : luaValue;
    }

    @Override // luaj.e
    public LuaValue e() {
        return this.f1687c;
    }

    @Override // luaj.e
    public LuaValue g(LuaValue luaValue) {
        return this.f1686b ? b(luaValue) : luaValue;
    }

    @Override // luaj.e
    public LuaTable.m k(LuaValue luaValue, LuaValue luaValue2) {
        LuaValue luaValueP2 = luaValue2.p2();
        if (luaValueP2 == null) {
            return null;
        }
        if (!this.f1685a || luaValue.m1() || luaValue.n1() || luaValue.e1()) {
            return (!this.f1686b || luaValueP2.m1() || luaValueP2.n1() || luaValueP2.e1()) ? LuaTable.Z2(luaValue, luaValueP2) : new d(luaValue, luaValueP2, null);
        }
        return (!this.f1686b || luaValueP2.m1() || luaValueP2.n1() || luaValueP2.e1()) ? new b(luaValue, luaValueP2, null) : new a(luaValue, luaValueP2, null);
    }

    @Override // luaj.e
    public LuaValue o(LuaValue[] luaValueArr, int i) {
        LuaValue luaValueA = luaValueArr[i];
        if (luaValueA != null && (luaValueA = a(luaValueA)) == null) {
            luaValueArr[i] = null;
        }
        return luaValueA;
    }

    @Override // luaj.e
    public boolean p() {
        return this.f1686b;
    }

    @Override // luaj.e
    public boolean q() {
        return this.f1685a;
    }
}
