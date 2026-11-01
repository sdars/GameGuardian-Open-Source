package luaj;

/* JADX INFO: loaded from: classes.dex */
public class LuaTable extends luaj.LuaValue implements luaj.e {
    private static final luaj.LuaString T = luaj.LuaValue.K2("n");
    private static final luaj.LuaTable.m[] U = new luaj.LuaTable.m[0];
    private static volatile java.util.Set V = null;
    private static volatile int W = 0;
    private luaj.LuaValue[] P;
    private luaj.LuaTable.m[] Q;
    protected int R;
    protected luaj.e S;

    private static class b extends luaj.LuaTable.o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f1648c;

        b(luaj.LuaValue luaValue, boolean z) {
            super(luaValue);
            this.f1648c = z;
        }

        @Override // luaj.LuaTable.e
        public luaj.LuaTable.e j0(luaj.LuaValue luaValue) {
            if (luaValue instanceof luaj.LuaBoolean) {
                this.f1648c = luaValue == luaj.LuaValue.f1674d;
                return this;
            }
            if (luaValue instanceof luaj.LuaLong) {
                long jZ2 = luaValue.z2();
                int i = (int) jZ2;
                return ((long) i) == jZ2 ? new luaj.LuaTable.h(this.f1664b, i) : new luaj.LuaTable.k(this.f1664b, jZ2);
            }
            if (!(luaValue instanceof luaj.LuaDouble)) {
                return new luaj.LuaTable.l(this.f1664b, luaValue);
            }
            double dX2 = luaValue.x2();
            float f2 = (float) dX2;
            return ((double) f2) == dX2 ? new luaj.LuaTable.f(this.f1664b, f2) : new luaj.LuaTable.d(this.f1664b, dX2);
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public luaj.LuaValue t() {
            return luaj.LuaValue.H2(this.f1648c);
        }
    }

    private static class c implements luaj.LuaTable.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f1649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private luaj.LuaTable.m f1650b;

        private c(luaj.LuaValue luaValue, luaj.LuaTable.m mVar) {
            this.f1649a = luaj.LuaTable.r3(luaValue) ? new java.lang.ref.WeakReference(luaValue) : luaValue;
            this.f1650b = mVar;
        }

        private luaj.LuaValue i() {
            java.lang.Object obj = this.f1649a;
            if (obj instanceof java.lang.ref.WeakReference) {
                obj = ((java.lang.ref.WeakReference) obj).get();
            }
            return (luaj.LuaValue) obj;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m a() {
            return this.f1650b;
        }

        @Override // luaj.LuaTable.m
        public int b(int i) {
            return 0;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m d(luaj.LuaTable.m mVar) {
            luaj.LuaTable.m mVar2 = this.f1650b;
            return mVar2 != null ? mVar2.d(mVar) : mVar;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.n f(luaj.LuaValue luaValue) {
            return null;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m h(luaj.LuaTable.n nVar) {
            if (i() == null) {
                return this.f1650b;
            }
            this.f1650b = this.f1650b.h(nVar);
            return this;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m j(luaj.LuaTable.n nVar, luaj.LuaValue luaValue) {
            luaj.LuaTable.m mVar = this.f1650b;
            luaj.LuaTable.m mVarJ = mVar != null ? mVar.j(nVar, luaValue) : null;
            if (i() == null) {
                return mVarJ;
            }
            this.f1650b = mVarJ;
            return this;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.n l() {
            return null;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m n(luaj.LuaTable.m mVar) {
            return mVar;
        }

        @Override // luaj.LuaTable.m
        public int r(int i) {
            return -1;
        }

        @Override // luaj.LuaTable.m
        public boolean s(luaj.LuaValue luaValue) {
            luaj.LuaValue luaValueI = i();
            return luaValueI != null && luaValue.T1(luaValueI);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("<dead");
            luaj.LuaValue luaValueI = i();
            if (luaValueI != null) {
                sb.append(": ");
                sb.append(luaValueI.toString());
            }
            sb.append('>');
            if (this.f1650b != null) {
                sb.append("; ");
                sb.append(this.f1650b.toString());
            }
            return sb.toString();
        }
    }

    private static class d extends luaj.LuaTable.o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f1651c;

        d(luaj.LuaValue luaValue, double d2) {
            super(luaValue);
            this.f1651c = d2;
        }

        @Override // luaj.LuaTable.e
        public luaj.LuaTable.e j0(luaj.LuaValue luaValue) {
            if (luaValue instanceof luaj.LuaBoolean) {
                return new luaj.LuaTable.b(this.f1664b, luaValue.w2());
            }
            luaj.LuaValue luaValueA2 = luaValue.A2();
            if (luaValueA2.l1()) {
                return new luaj.LuaTable.l(this.f1664b, luaValue);
            }
            if (luaValueA2 instanceof luaj.LuaLong) {
                long jZ2 = luaValueA2.z2();
                int i = (int) jZ2;
                return ((long) i) == jZ2 ? new luaj.LuaTable.h(this.f1664b, i) : new luaj.LuaTable.k(this.f1664b, jZ2);
            }
            double dX2 = luaValueA2.x2();
            float f2 = (float) dX2;
            if (f2 == dX2) {
                return new luaj.LuaTable.f(this.f1664b, f2);
            }
            this.f1651c = dX2;
            return this;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public luaj.LuaValue t() {
            return luaj.LuaValue.J2(this.f1651c);
        }
    }

    static abstract class e extends luaj.Varargs implements luaj.LuaTable.n {
        e() {
        }

        @Override // luaj.Varargs
        public int U() {
            return 2;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m a() {
            return null;
        }

        @Override // luaj.LuaTable.m
        public abstract int b(int i);

        @Override // luaj.LuaTable.n
        public luaj.Varargs c() {
            return this;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m d(luaj.LuaTable.m mVar) {
            return new luaj.LuaTable.j(this, mVar);
        }

        @Override // luaj.Varargs
        public luaj.Varargs e0(int i) {
            if (i != 1) {
                return i != 2 ? luaj.LuaValue.f1676f : t();
            }
            return this;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.n f(luaj.LuaValue luaValue) {
            if (s(luaValue)) {
                return this;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m h(luaj.LuaTable.n nVar) {
            return new luaj.LuaTable.c(i(), null);
        }

        @Override // luaj.LuaTable.n
        public abstract luaj.LuaValue i();

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m j(luaj.LuaTable.n nVar, luaj.LuaValue luaValue) {
            return j0(luaValue);
        }

        abstract luaj.LuaTable.e j0(luaj.LuaValue luaValue);

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.n l() {
            return this;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m n(luaj.LuaTable.m mVar) {
            return mVar != null ? new luaj.LuaTable.j(this, mVar) : this;
        }

        @Override // luaj.LuaTable.m
        public int r(int i) {
            return 0;
        }

        @Override // luaj.LuaTable.m
        public abstract boolean s(luaj.LuaValue luaValue);

        public abstract luaj.LuaValue t();

        @Override // luaj.Varargs
        public luaj.LuaValue v(int i) {
            if (i != 1) {
                return i != 2 ? luaj.LuaValue.f1673c : t();
            }
            return i();
        }

        @Override // luaj.Varargs
        public luaj.LuaValue w() {
            return i();
        }
    }

    private static class f extends luaj.LuaTable.o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f1652c;

        f(luaj.LuaValue luaValue, float f2) {
            super(luaValue);
            this.f1652c = f2;
        }

        @Override // luaj.LuaTable.e
        public luaj.LuaTable.e j0(luaj.LuaValue luaValue) {
            if (luaValue instanceof luaj.LuaBoolean) {
                return new luaj.LuaTable.b(this.f1664b, luaValue.w2());
            }
            luaj.LuaValue luaValueA2 = luaValue.A2();
            if (luaValueA2.l1()) {
                return new luaj.LuaTable.l(this.f1664b, luaValue);
            }
            if (luaValueA2 instanceof luaj.LuaLong) {
                long jZ2 = luaValueA2.z2();
                int i = (int) jZ2;
                return ((long) i) == jZ2 ? new luaj.LuaTable.h(this.f1664b, i) : new luaj.LuaTable.k(this.f1664b, jZ2);
            }
            double dX2 = luaValueA2.x2();
            float f2 = (float) dX2;
            if (f2 != dX2) {
                return new luaj.LuaTable.d(this.f1664b, dX2);
            }
            this.f1652c = f2;
            return this;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public luaj.LuaValue t() {
            return luaj.LuaValue.J2(this.f1652c);
        }
    }

    private static class g extends luaj.LuaTable.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private luaj.LuaValue f1654c;

        g(int i, luaj.LuaValue luaValue) {
            this.f1653b = i;
            this.f1654c = luaValue;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.m
        public int b(int i) {
            return luaj.LuaTable.l3(luaj.LuaLong.V2(this.f1653b), i);
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public luaj.LuaValue i() {
            return luaj.LuaValue.I2(this.f1653b);
        }

        @Override // luaj.LuaTable.e
        public luaj.LuaTable.e j0(luaj.LuaValue luaValue) {
            this.f1654c = luaValue;
            return this;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.m
        public int r(int i) {
            int i2 = this.f1653b;
            if (i2 < 1 || i2 > i) {
                return 0;
            }
            return i2;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.m
        public boolean s(luaj.LuaValue luaValue) {
            return luaValue.m1() && this.f1653b == luaValue.y2();
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public luaj.LuaValue t() {
            return this.f1654c;
        }
    }

    private static class h extends luaj.LuaTable.o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1655c;

        h(luaj.LuaValue luaValue, int i) {
            super(luaValue);
            this.f1655c = i;
        }

        @Override // luaj.LuaTable.e
        public luaj.LuaTable.e j0(luaj.LuaValue luaValue) {
            if (luaValue instanceof luaj.LuaBoolean) {
                return new luaj.LuaTable.b(this.f1664b, luaValue.w2());
            }
            luaj.LuaValue luaValueA2 = luaValue.A2();
            if (luaValueA2.l1()) {
                return new luaj.LuaTable.l(this.f1664b, luaValue);
            }
            if (!(luaValueA2 instanceof luaj.LuaLong)) {
                double dX2 = luaValueA2.x2();
                float f2 = (float) dX2;
                return ((double) f2) == dX2 ? new luaj.LuaTable.f(this.f1664b, f2) : new luaj.LuaTable.d(this.f1664b, dX2);
            }
            long jZ2 = luaValueA2.z2();
            int i = (int) jZ2;
            if (i != jZ2) {
                return new luaj.LuaTable.k(this.f1664b, jZ2);
            }
            this.f1655c = i;
            return this;
        }

        int k0() {
            return this.f1655c;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public luaj.LuaValue t() {
            return luaj.LuaValue.I2(this.f1655c);
        }
    }

    public class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1656a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private luaj.LuaTable.m f1657b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private luaj.LuaTable.n f1658c = null;

        public i() {
        }

        public int a() {
            if (this.f1658c == null) {
                return this.f1656a + 1;
            }
            return 0;
        }

        public luaj.LuaValue b() {
            luaj.LuaTable.n nVar = this.f1658c;
            return nVar != null ? nVar.i() : luaj.LuaLong.I2(this.f1656a + 1);
        }

        public boolean c() {
            luaj.LuaTable luaTable;
            luaj.e eVar;
            luaj.LuaTable.n nVarL;
            luaj.LuaTable.m mVarA = this.f1657b;
            while (mVarA != null) {
                mVarA = mVarA.a();
                if (mVarA != null && (nVarL = mVarA.l()) != null) {
                    this.f1657b = mVarA;
                    this.f1658c = nVarL;
                    return true;
                }
            }
            this.f1657b = null;
            this.f1658c = null;
            int i = this.f1656a + 1;
            while (i < luaj.LuaTable.this.P.length) {
                if (luaj.LuaTable.this.P[i] != null && ((eVar = (luaTable = luaj.LuaTable.this).S) == null || eVar.o(luaTable.P, i) != null)) {
                    this.f1656a = i;
                    return true;
                }
                i++;
            }
            for (int length = i - luaj.LuaTable.this.P.length; length < luaj.LuaTable.this.Q.length; length++) {
                for (luaj.LuaTable.m mVarA2 = luaj.LuaTable.this.Q[length]; mVarA2 != null; mVarA2 = mVarA2.a()) {
                    luaj.LuaTable.n nVarL2 = mVarA2.l();
                    if (nVarL2 != null) {
                        this.f1656a = length + luaj.LuaTable.this.P.length;
                        this.f1657b = mVarA2;
                        this.f1658c = nVarL2;
                        return true;
                    }
                }
            }
            return false;
        }

        public luaj.LuaValue d() {
            luaj.LuaTable.n nVar = this.f1658c;
            if (nVar != null) {
                return nVar.t();
            }
            luaj.LuaTable luaTable = luaj.LuaTable.this;
            luaj.e eVar = luaTable.S;
            luaj.LuaValue[] luaValueArr = luaTable.P;
            return eVar == null ? luaValueArr[this.f1656a] : eVar.o(luaValueArr, this.f1656a);
        }
    }

    private static class j implements luaj.LuaTable.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private luaj.LuaTable.e f1660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private luaj.LuaTable.m f1661b;

        j(luaj.LuaTable.e eVar, luaj.LuaTable.m mVar) {
            this.f1660a = eVar;
            this.f1661b = mVar;
        }

        private luaj.LuaTable.m e(luaj.LuaTable.m mVar) {
            if (mVar == null) {
                return this.f1660a;
            }
            this.f1661b = mVar;
            return this;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m a() {
            return this.f1661b;
        }

        @Override // luaj.LuaTable.m
        public int b(int i) {
            return this.f1660a.b(i);
        }

        @Override // luaj.LuaTable.n
        public luaj.Varargs c() {
            return this.f1660a.c();
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m d(luaj.LuaTable.m mVar) {
            return e(this.f1661b.d(mVar));
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.n f(luaj.LuaValue luaValue) {
            if (this.f1660a.s(luaValue)) {
                return this;
            }
            return null;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m h(luaj.LuaTable.n nVar) {
            if (this == nVar) {
                return new luaj.LuaTable.c(i(), this.f1661b);
            }
            this.f1661b = this.f1661b.h(nVar);
            return this;
        }

        @Override // luaj.LuaTable.n
        public luaj.LuaValue i() {
            return this.f1660a.i();
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m j(luaj.LuaTable.n nVar, luaj.LuaValue luaValue) {
            if (nVar != this) {
                return e(this.f1661b.j(nVar, luaValue));
            }
            this.f1660a = this.f1660a.j0(luaValue);
            return this;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.n l() {
            return this.f1660a;
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m n(luaj.LuaTable.m mVar) {
            return mVar != null ? new luaj.LuaTable.j(this.f1660a, mVar) : this.f1660a;
        }

        @Override // luaj.LuaTable.m
        public int r(int i) {
            return this.f1660a.r(i);
        }

        @Override // luaj.LuaTable.m
        public boolean s(luaj.LuaValue luaValue) {
            return this.f1660a.s(luaValue);
        }

        @Override // luaj.LuaTable.n
        public luaj.LuaValue t() {
            return this.f1660a.t();
        }

        public java.lang.String toString() {
            return this.f1660a + "; " + this.f1661b;
        }
    }

    private static class k extends luaj.LuaTable.o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f1662c;

        k(luaj.LuaValue luaValue, long j) {
            super(luaValue);
            this.f1662c = j;
        }

        @Override // luaj.LuaTable.e
        public luaj.LuaTable.e j0(luaj.LuaValue luaValue) {
            if (luaValue instanceof luaj.LuaBoolean) {
                return new luaj.LuaTable.b(this.f1664b, luaValue.w2());
            }
            luaj.LuaValue luaValueA2 = luaValue.A2();
            if (luaValueA2.l1()) {
                return new luaj.LuaTable.l(this.f1664b, luaValue);
            }
            if (!(luaValueA2 instanceof luaj.LuaLong)) {
                double dX2 = luaValueA2.x2();
                float f2 = (float) dX2;
                return ((double) f2) == dX2 ? new luaj.LuaTable.f(this.f1664b, f2) : new luaj.LuaTable.d(this.f1664b, dX2);
            }
            long jZ2 = luaValueA2.z2();
            int i = (int) jZ2;
            if (i == jZ2) {
                return new luaj.LuaTable.h(this.f1664b, i);
            }
            this.f1662c = jZ2;
            return this;
        }

        long k0() {
            return this.f1662c;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public luaj.LuaValue t() {
            return luaj.LuaValue.I2(this.f1662c);
        }
    }

    static class l extends luaj.LuaTable.o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private luaj.LuaValue f1663c;

        l(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
            super(luaValue);
            this.f1663c = luaValue2;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public luaj.Varargs c() {
            return this;
        }

        @Override // luaj.LuaTable.e
        public luaj.LuaTable.e j0(luaj.LuaValue luaValue) {
            if (luaValue instanceof luaj.LuaBoolean) {
                return new luaj.LuaTable.b(this.f1664b, luaValue.w2());
            }
            if (luaValue instanceof luaj.LuaLong) {
                long jZ2 = luaValue.z2();
                int i = (int) jZ2;
                return ((long) i) == jZ2 ? new luaj.LuaTable.h(this.f1664b, i) : new luaj.LuaTable.k(this.f1664b, jZ2);
            }
            if (!(luaValue instanceof luaj.LuaDouble)) {
                this.f1663c = luaValue;
                return this;
            }
            double dX2 = luaValue.x2();
            float f2 = (float) dX2;
            return ((double) f2) == dX2 ? new luaj.LuaTable.f(this.f1664b, f2) : new luaj.LuaTable.d(this.f1664b, dX2);
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public luaj.LuaValue t() {
            return this.f1663c;
        }
    }

    interface m {
        luaj.LuaTable.m a();

        int b(int i);

        luaj.LuaTable.m d(luaj.LuaTable.m mVar);

        luaj.LuaTable.n f(luaj.LuaValue luaValue);

        luaj.LuaTable.m h(luaj.LuaTable.n nVar);

        luaj.LuaTable.m j(luaj.LuaTable.n nVar, luaj.LuaValue luaValue);

        luaj.LuaTable.n l();

        luaj.LuaTable.m n(luaj.LuaTable.m mVar);

        int r(int i);

        boolean s(luaj.LuaValue luaValue);
    }

    interface n extends luaj.LuaTable.m {
        luaj.Varargs c();

        luaj.LuaValue i();

        luaj.LuaValue t();
    }

    private static abstract class o extends luaj.LuaTable.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final luaj.LuaValue f1664b;

        o(luaj.LuaValue luaValue) {
            this.f1664b = luaValue;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.m
        public final int b(int i) {
            return luaj.LuaTable.j3(this.f1664b, i);
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public final luaj.LuaValue i() {
            return this.f1664b;
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.m
        public final boolean s(luaj.LuaValue luaValue) {
            return luaValue.T1(this.f1664b);
        }
    }

    public LuaTable() {
        this.P = luaj.LuaValue.j;
        this.Q = U;
    }

    public LuaTable(int i2, int i3) {
        w3(i2, i3);
    }

    public LuaTable(luaj.Varargs varargs, int i2) {
        int i3 = i2 - 1;
        int iMax = java.lang.Math.max(varargs.U() - i3, 0);
        w3(iMax, 1);
        j2(T, luaj.LuaValue.I2(iMax));
        for (int i4 = 1; i4 <= iMax; i4++) {
            e2(i4, varargs.v(i4 + i3));
        }
    }

    public LuaTable(luaj.LuaValue[] luaValueArr, luaj.LuaValue[] luaValueArr2, luaj.Varargs varargs) {
        int length = luaValueArr != null ? luaValueArr.length : 0;
        int length2 = luaValueArr2 != null ? luaValueArr2.length : 0;
        w3((varargs != null ? varargs.U() : 0) + length2, length >> 1);
        int i2 = 0;
        while (i2 < length2) {
            int i3 = i2 + 1;
            Y1(i3, luaValueArr2[i2]);
            i2 = i3;
        }
        if (varargs != null) {
            int iU = varargs.U();
            for (int i4 = 1; i4 <= iU; i4++) {
                Y1(length2 + i4, varargs.v(i4));
            }
        }
        for (int i5 = 0; i5 < length; i5 += 2) {
            int i6 = i5 + 1;
            if (!luaValueArr[i6].l1()) {
                d2(luaValueArr[i5], luaValueArr[i6]);
            }
        }
    }

    private static luaj.LuaValue[] A3(luaj.LuaValue[] luaValueArr, int i2) {
        luaj.LuaValue[] luaValueArr2 = new luaj.LuaValue[i2];
        java.lang.System.arraycopy(luaValueArr, 0, luaValueArr2, 0, luaValueArr.length);
        return luaValueArr2;
    }

    private void B3(int i2, int i3, luaj.LuaValue luaValue) {
        while (true) {
            int i4 = i2 * 2;
            if (i4 > i3) {
                return;
            }
            if (i4 < i3) {
                int i5 = i4 + 1;
                if (V2(i4, i5, luaValue)) {
                    i4 = i5;
                }
            }
            if (!V2(i2, i4, luaValue)) {
                return;
            }
            luaj.LuaValue luaValueC3 = c3(i2);
            e2(i2, c3(i4));
            e2(i4, luaValueC3);
            i2 = i4;
        }
    }

    private luaj.LuaTable.n C3(luaj.LuaValue luaValue) {
        if (this.R <= 0) {
            return null;
        }
        for (luaj.LuaTable.m mVarA = this.Q[i3(luaValue)]; mVarA != null; mVarA = mVarA.a()) {
            luaj.LuaTable.n nVarF = mVarA.f(luaValue);
            if (nVarF != null) {
                return nVarF;
            }
        }
        return null;
    }

    private boolean U2(int i2, luaj.LuaValue luaValue) {
        if (i2 <= 0) {
            return false;
        }
        luaj.LuaValue[] luaValueArr = this.P;
        if (i2 > luaValueArr.length) {
            return false;
        }
        int i3 = i2 - 1;
        if (luaValue.l1()) {
            luaValue = null;
        } else {
            luaj.e eVar = this.S;
            if (eVar != null) {
                luaValue = eVar.g(luaValue);
            }
        }
        luaValueArr[i3] = luaValue;
        return true;
    }

    private boolean V2(int i2, int i3, luaj.LuaValue luaValue) {
        luaj.LuaValue luaValueC3 = c3(i2);
        luaj.LuaValue luaValueC4 = c3(i3);
        if (luaValueC3 == null || luaValueC4 == null) {
            return false;
        }
        return luaValue != null ? luaValue.call(luaValueC3, luaValueC4).w2() : luaValueC3.u1(luaValueC4);
    }

    private int X2() {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            luaj.LuaTable.m[] mVarArr = this.Q;
            if (i2 >= mVarArr.length) {
                return i3;
            }
            for (luaj.LuaTable.m mVarA = mVarArr[i2]; mVarA != null; mVarA = mVarA.a()) {
                if (mVarA.l() != null) {
                    i3++;
                }
            }
            i2++;
        }
    }

    private int Y2(int[] iArr) {
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        for (int i5 = 0; i5 < 31; i5++) {
            luaj.LuaValue[] luaValueArr = this.P;
            if (i3 > luaValueArr.length) {
                break;
            }
            int iMin = java.lang.Math.min(luaValueArr.length, 1 << i5);
            int i6 = 0;
            while (i3 <= iMin) {
                int i7 = i3 + 1;
                if (this.P[i3 - 1] != null) {
                    i6++;
                }
                i3 = i7;
            }
            iArr[i5] = i6;
            i4 += i6;
        }
        while (true) {
            luaj.LuaTable.m[] mVarArr = this.Q;
            if (i2 >= mVarArr.length) {
                return i4;
            }
            for (luaj.LuaTable.m mVarA = mVarArr[i2]; mVarA != null; mVarA = mVarA.a()) {
                int iR = mVarA.r(Integer.MAX_VALUE);
                if (iR > 0) {
                    int iU3 = u3(iR);
                    iArr[iU3] = iArr[iU3] + 1;
                    i4++;
                }
            }
            i2++;
        }
    }

    protected static luaj.LuaTable.e Z2(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
        if (luaValue.i1()) {
            return new luaj.LuaTable.g(luaValue.y2(), luaValue2);
        }
        if (luaValue2 instanceof luaj.LuaBoolean) {
            return new luaj.LuaTable.b(luaValue, luaValue2.w2());
        }
        if (luaValue2 instanceof luaj.LuaLong) {
            long jZ2 = luaValue2.z2();
            int i2 = (int) jZ2;
            return ((long) i2) == jZ2 ? new luaj.LuaTable.h(luaValue, i2) : new luaj.LuaTable.k(luaValue, jZ2);
        }
        if (!(luaValue2 instanceof luaj.LuaDouble)) {
            return new luaj.LuaTable.l(luaValue, luaValue2);
        }
        double dX2 = luaValue2.x2();
        float f2 = (float) dX2;
        return ((double) f2) == dX2 ? new luaj.LuaTable.f(luaValue, f2) : new luaj.LuaTable.d(luaValue, dX2);
    }

    private void a3() {
        int i2 = 0;
        while (true) {
            luaj.LuaValue[] luaValueArr = this.P;
            if (i2 >= luaValueArr.length) {
                return;
            }
            this.S.o(luaValueArr, i2);
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:102:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:108:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:113:0x0217  */
    /* JADX WARN: Code duplicated, block: B:114:0x021a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0223  */
    /* JADX WARN: Code duplicated, block: B:118:0x022c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0233 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0235  */
    /* JADX WARN: Code duplicated, block: B:123:0x0238  */
    /* JADX WARN: Code duplicated, block: B:125:0x023c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0240  */
    /* JADX WARN: Code duplicated, block: B:129:0x0244  */
    /* JADX WARN: Code duplicated, block: B:131:0x0248  */
    /* JADX WARN: Code duplicated, block: B:132:0x024a  */
    /* JADX WARN: Code duplicated, block: B:133:0x024d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0250  */
    /* JADX WARN: Code duplicated, block: B:135:0x0253  */
    /* JADX WARN: Code duplicated, block: B:136:0x0256  */
    /* JADX WARN: Code duplicated, block: B:137:0x0259  */
    /* JADX WARN: Code duplicated, block: B:138:0x025c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0260  */
    /* JADX WARN: Code duplicated, block: B:142:0x0268  */
    /* JADX WARN: Code duplicated, block: B:144:0x026f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x0271 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x0273  */
    /* JADX WARN: Code duplicated, block: B:149:0x0277  */
    /* JADX WARN: Code duplicated, block: B:150:0x027a  */
    /* JADX WARN: Code duplicated, block: B:151:0x027d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0280  */
    /* JADX WARN: Code duplicated, block: B:155:0x0288  */
    /* JADX WARN: Code duplicated, block: B:157:0x0294  */
    /* JADX WARN: Code duplicated, block: B:160:0x029a  */
    /* JADX WARN: Code duplicated, block: B:163:0x02a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:166:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:169:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:171:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:81:0x017f  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d2  */
    private java.lang.Appendable b3(java.lang.String str, java.lang.Appendable appendable, java.util.Map map) throws java.io.IOException {
        java.lang.String strG0;
        boolean z;
        int iY2;
        java.lang.String str2;
        int iY3;
        java.lang.String strG1;
        int i2;
        java.util.ArrayList arrayList;
        java.lang.Appendable appendable2 = appendable;
        java.util.Set set = V;
        if (set != null) {
            set.add(this);
        }
        appendable2.append("{ -- ");
        appendable2.append(E2());
        appendable2.append("(");
        appendable2.append(java.lang.Integer.toHexString(hashCode()));
        appendable2.append(")\n");
        int iS1 = s1();
        int i3 = W + iS1;
        W = i3;
        int iMax = iS1 == 0 ? 1 : (int) java.lang.Math.max(1.0d, java.lang.Math.min(10.0d, java.lang.Math.log10(java.lang.Math.abs(iS1)) + 1.0d));
        luaj.LuaTable.i iVarS3 = s3();
        boolean z2 = str.length() > 0;
        boolean z3 = str.length() == 1;
        boolean z4 = i3 < 10000;
        int i4 = 1;
        java.util.ArrayList arrayList2 = null;
        boolean z5 = true;
        java.lang.String str3 = null;
        while (iVarS3.c()) {
            luaj.LuaValue luaValueB = iVarS3.b();
            if (!z3 || map == null || map.get(luaValueB) != null) {
                if (z4 && z5) {
                    if (luaValueB.i1()) {
                        int i5 = i4 + 1;
                        if (luaValueB.y2() != i4) {
                            i4 = i5;
                            z5 = false;
                        } else {
                            i4 = i5;
                        }
                    } else {
                        z5 = false;
                    }
                }
                if (!luaValueB.d1()) {
                    luaj.LuaValue luaValueD = iVarS3.d();
                    if (!luaValueD.d1()) {
                        java.lang.Appendable sb = z5 ? appendable2 : new java.lang.StringBuilder();
                        if (z2) {
                            sb.append(str);
                        }
                        boolean z6 = z4;
                        sb.append("\t[");
                        luaj.LuaTable.i iVar = iVarS3;
                        boolean z7 = z3;
                        int i6 = iS1;
                        int i7 = i4;
                        java.util.ArrayList arrayList3 = arrayList2;
                        if (luaValueB.i1()) {
                            android.ext.t2.a(sb, iMax, ' ', java.lang.Integer.toString(luaValueB.y2()));
                        } else {
                            if (set == null || !(luaValueB instanceof luaj.LuaTable)) {
                                iMax = iMax;
                                if (luaValueB instanceof luaj.LuaString) {
                                    sb.append('\'');
                                    strG0 = luaValueB.g0();
                                    if (strG0.indexOf(39) >= 0) {
                                        strG0 = strG0.replace("'", "\\'");
                                    }
                                    sb.append(strG0);
                                    sb.append('\'');
                                } else {
                                    sb.append(luaValueB.g0());
                                }
                                sb.append("] = ");
                                if (set == null && (luaValueD instanceof luaj.LuaTable)) {
                                    luaj.LuaTable luaTable = (luaj.LuaTable) luaValueD;
                                    if (set.contains(luaTable)) {
                                        sb.append("{ -- table(");
                                        sb.append(java.lang.Integer.toHexString(luaTable.hashCode()));
                                        sb.append(")\n");
                                        if (z2) {
                                            sb.append(str);
                                        }
                                        sb.append("\t\t-- *** RECURSION ***\n");
                                        if (z2) {
                                            sb.append(str);
                                        }
                                        sb.append("\t}");
                                    } else {
                                        if (str3 == null) {
                                            str3 = str + '\t';
                                        }
                                        java.lang.String str4 = str3;
                                        luaTable.b3(str4, sb, map);
                                        str3 = str4;
                                    }
                                    sb.append(',');
                                    str2 = null;
                                } else {
                                    if (luaValueD instanceof luaj.LuaString) {
                                        sb.append('\'');
                                        strG1 = luaValueD.g0();
                                        if (strG1.indexOf(39) >= 0) {
                                            strG1 = strG1.replace("'", "\\'");
                                        }
                                        sb.append(strG1);
                                        sb.append("',");
                                    } else if (luaValueD instanceof luaj.LuaLong) {
                                        if (strG0 == null && (luaValueB instanceof luaj.LuaString)) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z || !strG0.equals("address")) {
                                            sb.append(luaValueD.g0());
                                            if (z) {
                                                if (strG0.equals("flags")) {
                                                    iY3 = luaValueD.y2();
                                                    if (iY3 == 1) {
                                                        str2 = "gg.TYPE_BYTE";
                                                    } else if (iY3 == 2) {
                                                        str2 = "gg.TYPE_WORD";
                                                    } else if (iY3 == 4) {
                                                        str2 = "gg.TYPE_DWORD";
                                                    } else if (iY3 == 8) {
                                                        str2 = "gg.TYPE_XOR";
                                                    } else if (iY3 == 16) {
                                                        str2 = "gg.TYPE_FLOAT";
                                                    } else if (iY3 == 32) {
                                                        str2 = "gg.TYPE_QWORD";
                                                    } else if (iY3 != 64) {
                                                        str2 = null;
                                                    } else {
                                                        str2 = "gg.TYPE_DOUBLE";
                                                    }
                                                } else {
                                                    if (strG0.equals("freezeType")) {
                                                        iY2 = luaValueD.y2();
                                                        if (iY2 == 0) {
                                                            str2 = "gg.FREEZE_NORMAL";
                                                        } else if (iY2 == 1) {
                                                            str2 = "gg.FREEZE_MAY_INCREASE";
                                                        } else if (iY2 == 2) {
                                                            str2 = "gg.FREEZE_MAY_DECREASE";
                                                        } else if (iY2 == 3) {
                                                            str2 = "gg.FREEZE_IN_RANGE";
                                                        }
                                                    }
                                                    str2 = null;
                                                }
                                            }
                                            sb.append(',');
                                        } else {
                                            sb.append("0x");
                                            sb.append(java.lang.Long.toHexString(luaValueD.z2()));
                                        }
                                        str2 = null;
                                        sb.append(',');
                                    } else {
                                        sb.append(luaValueD.g0());
                                        if (!(luaValueD instanceof android.ext.Script.ApiFunction)) {
                                            sb.append(',');
                                        }
                                    }
                                    str2 = null;
                                }
                                if (str2 != null) {
                                    sb.append(" -- ");
                                    sb.append(str2);
                                }
                                sb.append('\n');
                                if (z5) {
                                    arrayList2 = arrayList3;
                                } else {
                                    if (arrayList3 == null) {
                                        i2 = i6 - (i7 - 1);
                                        if (i2 < 0) {
                                            arrayList = new java.util.ArrayList();
                                        } else {
                                            arrayList = new java.util.ArrayList(i2);
                                        }
                                        arrayList2 = arrayList;
                                    } else {
                                        arrayList2 = arrayList3;
                                    }
                                    arrayList2.add(sb.toString());
                                }
                                appendable2 = appendable;
                                z4 = z6;
                                iVarS3 = iVar;
                                z3 = z7;
                                iS1 = i6;
                                i4 = i7;
                                iMax = iMax;
                            } else {
                                luaj.LuaTable luaTable2 = (luaj.LuaTable) luaValueB;
                                if (set.contains(luaTable2)) {
                                    sb.append("{ -- table(");
                                    sb.append(java.lang.Integer.toHexString(luaTable2.hashCode()));
                                    sb.append(")\n");
                                    if (z2) {
                                        sb.append(str);
                                    }
                                    sb.append("\t\t-- *** RECURSION ***\n");
                                    if (z2) {
                                        sb.append(str);
                                    }
                                    sb.append("\t}");
                                } else {
                                    if (str3 == null) {
                                        str3 = str + '\t';
                                    }
                                    java.lang.String str5 = str3;
                                    luaTable2.b3(str5, sb, map);
                                    str3 = str5;
                                }
                            }
                            strG0 = null;
                            sb.append("] = ");
                            if (set == null) {
                                if (luaValueD instanceof luaj.LuaString) {
                                    sb.append('\'');
                                    strG1 = luaValueD.g0();
                                    if (strG1.indexOf(39) >= 0) {
                                        strG1 = strG1.replace("'", "\\'");
                                    }
                                    sb.append(strG1);
                                    sb.append("',");
                                } else if (luaValueD instanceof luaj.LuaLong) {
                                    if (strG0 == null) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        sb.append(luaValueD.g0());
                                        if (z) {
                                            str2 = null;
                                        } else if (strG0.equals("flags")) {
                                            iY3 = luaValueD.y2();
                                            if (iY3 == 1) {
                                                str2 = "gg.TYPE_BYTE";
                                            } else if (iY3 == 2) {
                                                str2 = "gg.TYPE_WORD";
                                            } else if (iY3 == 4) {
                                                str2 = "gg.TYPE_DWORD";
                                            } else if (iY3 == 8) {
                                                str2 = "gg.TYPE_XOR";
                                            } else if (iY3 == 16) {
                                                str2 = "gg.TYPE_FLOAT";
                                            } else if (iY3 == 32) {
                                                str2 = "gg.TYPE_QWORD";
                                            } else if (iY3 != 64) {
                                                str2 = null;
                                            } else {
                                                str2 = "gg.TYPE_DOUBLE";
                                            }
                                        } else {
                                            if (strG0.equals("freezeType")) {
                                                iY2 = luaValueD.y2();
                                                if (iY2 == 0) {
                                                    str2 = "gg.FREEZE_NORMAL";
                                                } else if (iY2 == 1) {
                                                    str2 = "gg.FREEZE_MAY_INCREASE";
                                                } else if (iY2 == 2) {
                                                    str2 = "gg.FREEZE_MAY_DECREASE";
                                                } else if (iY2 == 3) {
                                                    str2 = "gg.FREEZE_IN_RANGE";
                                                }
                                            }
                                            str2 = null;
                                        }
                                    } else {
                                        sb.append(luaValueD.g0());
                                        if (z) {
                                            str2 = null;
                                        } else if (strG0.equals("flags")) {
                                            iY3 = luaValueD.y2();
                                            if (iY3 == 1) {
                                                str2 = "gg.TYPE_BYTE";
                                            } else if (iY3 == 2) {
                                                str2 = "gg.TYPE_WORD";
                                            } else if (iY3 == 4) {
                                                str2 = "gg.TYPE_DWORD";
                                            } else if (iY3 == 8) {
                                                str2 = "gg.TYPE_XOR";
                                            } else if (iY3 == 16) {
                                                str2 = "gg.TYPE_FLOAT";
                                            } else if (iY3 == 32) {
                                                str2 = "gg.TYPE_QWORD";
                                            } else if (iY3 != 64) {
                                                str2 = null;
                                            } else {
                                                str2 = "gg.TYPE_DOUBLE";
                                            }
                                        } else {
                                            if (strG0.equals("freezeType")) {
                                                iY2 = luaValueD.y2();
                                                if (iY2 == 0) {
                                                    str2 = "gg.FREEZE_NORMAL";
                                                } else if (iY2 == 1) {
                                                    str2 = "gg.FREEZE_MAY_INCREASE";
                                                } else if (iY2 == 2) {
                                                    str2 = "gg.FREEZE_MAY_DECREASE";
                                                } else if (iY2 == 3) {
                                                    str2 = "gg.FREEZE_IN_RANGE";
                                                }
                                            }
                                            str2 = null;
                                        }
                                    }
                                    sb.append(',');
                                } else {
                                    sb.append(luaValueD.g0());
                                    if (!(luaValueD instanceof android.ext.Script.ApiFunction)) {
                                        sb.append(',');
                                    }
                                }
                                str2 = null;
                            } else {
                                if (luaValueD instanceof luaj.LuaString) {
                                    sb.append('\'');
                                    strG1 = luaValueD.g0();
                                    if (strG1.indexOf(39) >= 0) {
                                        strG1 = strG1.replace("'", "\\'");
                                    }
                                    sb.append(strG1);
                                    sb.append("',");
                                } else if (luaValueD instanceof luaj.LuaLong) {
                                    if (strG0 == null) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        sb.append(luaValueD.g0());
                                        if (z) {
                                            str2 = null;
                                        } else if (strG0.equals("flags")) {
                                            iY3 = luaValueD.y2();
                                            if (iY3 == 1) {
                                                str2 = "gg.TYPE_BYTE";
                                            } else if (iY3 == 2) {
                                                str2 = "gg.TYPE_WORD";
                                            } else if (iY3 == 4) {
                                                str2 = "gg.TYPE_DWORD";
                                            } else if (iY3 == 8) {
                                                str2 = "gg.TYPE_XOR";
                                            } else if (iY3 == 16) {
                                                str2 = "gg.TYPE_FLOAT";
                                            } else if (iY3 == 32) {
                                                str2 = "gg.TYPE_QWORD";
                                            } else if (iY3 != 64) {
                                                str2 = null;
                                            } else {
                                                str2 = "gg.TYPE_DOUBLE";
                                            }
                                        } else {
                                            if (strG0.equals("freezeType")) {
                                                iY2 = luaValueD.y2();
                                                if (iY2 == 0) {
                                                    str2 = "gg.FREEZE_NORMAL";
                                                } else if (iY2 == 1) {
                                                    str2 = "gg.FREEZE_MAY_INCREASE";
                                                } else if (iY2 == 2) {
                                                    str2 = "gg.FREEZE_MAY_DECREASE";
                                                } else if (iY2 == 3) {
                                                    str2 = "gg.FREEZE_IN_RANGE";
                                                }
                                            }
                                            str2 = null;
                                        }
                                    } else {
                                        sb.append(luaValueD.g0());
                                        if (z) {
                                            str2 = null;
                                        } else if (strG0.equals("flags")) {
                                            iY3 = luaValueD.y2();
                                            if (iY3 == 1) {
                                                str2 = "gg.TYPE_BYTE";
                                            } else if (iY3 == 2) {
                                                str2 = "gg.TYPE_WORD";
                                            } else if (iY3 == 4) {
                                                str2 = "gg.TYPE_DWORD";
                                            } else if (iY3 == 8) {
                                                str2 = "gg.TYPE_XOR";
                                            } else if (iY3 == 16) {
                                                str2 = "gg.TYPE_FLOAT";
                                            } else if (iY3 == 32) {
                                                str2 = "gg.TYPE_QWORD";
                                            } else if (iY3 != 64) {
                                                str2 = null;
                                            } else {
                                                str2 = "gg.TYPE_DOUBLE";
                                            }
                                        } else {
                                            if (strG0.equals("freezeType")) {
                                                iY2 = luaValueD.y2();
                                                if (iY2 == 0) {
                                                    str2 = "gg.FREEZE_NORMAL";
                                                } else if (iY2 == 1) {
                                                    str2 = "gg.FREEZE_MAY_INCREASE";
                                                } else if (iY2 == 2) {
                                                    str2 = "gg.FREEZE_MAY_DECREASE";
                                                } else if (iY2 == 3) {
                                                    str2 = "gg.FREEZE_IN_RANGE";
                                                }
                                            }
                                            str2 = null;
                                        }
                                    }
                                    sb.append(',');
                                } else {
                                    sb.append(luaValueD.g0());
                                    if (!(luaValueD instanceof android.ext.Script.ApiFunction)) {
                                        sb.append(',');
                                    }
                                }
                                str2 = null;
                            }
                            if (str2 != null) {
                                sb.append(" -- ");
                                sb.append(str2);
                            }
                            sb.append('\n');
                            if (z5) {
                                if (arrayList3 == null) {
                                    i2 = i6 - (i7 - 1);
                                    if (i2 < 0) {
                                        arrayList = new java.util.ArrayList();
                                    } else {
                                        arrayList = new java.util.ArrayList(i2);
                                    }
                                    arrayList2 = arrayList;
                                } else {
                                    arrayList2 = arrayList3;
                                }
                                arrayList2.add(sb.toString());
                            } else {
                                arrayList2 = arrayList3;
                            }
                            appendable2 = appendable;
                            z4 = z6;
                            iVarS3 = iVar;
                            z3 = z7;
                            iS1 = i6;
                            i4 = i7;
                            iMax = iMax;
                        }
                        iMax = iMax;
                        strG0 = null;
                        sb.append("] = ");
                        if (set == null) {
                            if (luaValueD instanceof luaj.LuaString) {
                                sb.append('\'');
                                strG1 = luaValueD.g0();
                                if (strG1.indexOf(39) >= 0) {
                                    strG1 = strG1.replace("'", "\\'");
                                }
                                sb.append(strG1);
                                sb.append("',");
                            } else if (luaValueD instanceof luaj.LuaLong) {
                                if (strG0 == null) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    sb.append(luaValueD.g0());
                                    if (z) {
                                        str2 = null;
                                    } else if (strG0.equals("flags")) {
                                        iY3 = luaValueD.y2();
                                        if (iY3 == 1) {
                                            str2 = "gg.TYPE_BYTE";
                                        } else if (iY3 == 2) {
                                            str2 = "gg.TYPE_WORD";
                                        } else if (iY3 == 4) {
                                            str2 = "gg.TYPE_DWORD";
                                        } else if (iY3 == 8) {
                                            str2 = "gg.TYPE_XOR";
                                        } else if (iY3 == 16) {
                                            str2 = "gg.TYPE_FLOAT";
                                        } else if (iY3 == 32) {
                                            str2 = "gg.TYPE_QWORD";
                                        } else if (iY3 != 64) {
                                            str2 = null;
                                        } else {
                                            str2 = "gg.TYPE_DOUBLE";
                                        }
                                    } else {
                                        if (strG0.equals("freezeType")) {
                                            iY2 = luaValueD.y2();
                                            if (iY2 == 0) {
                                                str2 = "gg.FREEZE_NORMAL";
                                            } else if (iY2 == 1) {
                                                str2 = "gg.FREEZE_MAY_INCREASE";
                                            } else if (iY2 == 2) {
                                                str2 = "gg.FREEZE_MAY_DECREASE";
                                            } else if (iY2 == 3) {
                                                str2 = "gg.FREEZE_IN_RANGE";
                                            }
                                        }
                                        str2 = null;
                                    }
                                } else {
                                    sb.append(luaValueD.g0());
                                    if (z) {
                                        str2 = null;
                                    } else if (strG0.equals("flags")) {
                                        iY3 = luaValueD.y2();
                                        if (iY3 == 1) {
                                            str2 = "gg.TYPE_BYTE";
                                        } else if (iY3 == 2) {
                                            str2 = "gg.TYPE_WORD";
                                        } else if (iY3 == 4) {
                                            str2 = "gg.TYPE_DWORD";
                                        } else if (iY3 == 8) {
                                            str2 = "gg.TYPE_XOR";
                                        } else if (iY3 == 16) {
                                            str2 = "gg.TYPE_FLOAT";
                                        } else if (iY3 == 32) {
                                            str2 = "gg.TYPE_QWORD";
                                        } else if (iY3 != 64) {
                                            str2 = null;
                                        } else {
                                            str2 = "gg.TYPE_DOUBLE";
                                        }
                                    } else {
                                        if (strG0.equals("freezeType")) {
                                            iY2 = luaValueD.y2();
                                            if (iY2 == 0) {
                                                str2 = "gg.FREEZE_NORMAL";
                                            } else if (iY2 == 1) {
                                                str2 = "gg.FREEZE_MAY_INCREASE";
                                            } else if (iY2 == 2) {
                                                str2 = "gg.FREEZE_MAY_DECREASE";
                                            } else if (iY2 == 3) {
                                                str2 = "gg.FREEZE_IN_RANGE";
                                            }
                                        }
                                        str2 = null;
                                    }
                                }
                                sb.append(',');
                            } else {
                                sb.append(luaValueD.g0());
                                if (!(luaValueD instanceof android.ext.Script.ApiFunction)) {
                                    sb.append(',');
                                }
                            }
                            str2 = null;
                        } else {
                            if (luaValueD instanceof luaj.LuaString) {
                                sb.append('\'');
                                strG1 = luaValueD.g0();
                                if (strG1.indexOf(39) >= 0) {
                                    strG1 = strG1.replace("'", "\\'");
                                }
                                sb.append(strG1);
                                sb.append("',");
                            } else if (luaValueD instanceof luaj.LuaLong) {
                                if (strG0 == null) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    sb.append(luaValueD.g0());
                                    if (z) {
                                        str2 = null;
                                    } else if (strG0.equals("flags")) {
                                        iY3 = luaValueD.y2();
                                        if (iY3 == 1) {
                                            str2 = "gg.TYPE_BYTE";
                                        } else if (iY3 == 2) {
                                            str2 = "gg.TYPE_WORD";
                                        } else if (iY3 == 4) {
                                            str2 = "gg.TYPE_DWORD";
                                        } else if (iY3 == 8) {
                                            str2 = "gg.TYPE_XOR";
                                        } else if (iY3 == 16) {
                                            str2 = "gg.TYPE_FLOAT";
                                        } else if (iY3 == 32) {
                                            str2 = "gg.TYPE_QWORD";
                                        } else if (iY3 != 64) {
                                            str2 = null;
                                        } else {
                                            str2 = "gg.TYPE_DOUBLE";
                                        }
                                    } else {
                                        if (strG0.equals("freezeType")) {
                                            iY2 = luaValueD.y2();
                                            if (iY2 == 0) {
                                                str2 = "gg.FREEZE_NORMAL";
                                            } else if (iY2 == 1) {
                                                str2 = "gg.FREEZE_MAY_INCREASE";
                                            } else if (iY2 == 2) {
                                                str2 = "gg.FREEZE_MAY_DECREASE";
                                            } else if (iY2 == 3) {
                                                str2 = "gg.FREEZE_IN_RANGE";
                                            }
                                        }
                                        str2 = null;
                                    }
                                } else {
                                    sb.append(luaValueD.g0());
                                    if (z) {
                                        str2 = null;
                                    } else if (strG0.equals("flags")) {
                                        iY3 = luaValueD.y2();
                                        if (iY3 == 1) {
                                            str2 = "gg.TYPE_BYTE";
                                        } else if (iY3 == 2) {
                                            str2 = "gg.TYPE_WORD";
                                        } else if (iY3 == 4) {
                                            str2 = "gg.TYPE_DWORD";
                                        } else if (iY3 == 8) {
                                            str2 = "gg.TYPE_XOR";
                                        } else if (iY3 == 16) {
                                            str2 = "gg.TYPE_FLOAT";
                                        } else if (iY3 == 32) {
                                            str2 = "gg.TYPE_QWORD";
                                        } else if (iY3 != 64) {
                                            str2 = null;
                                        } else {
                                            str2 = "gg.TYPE_DOUBLE";
                                        }
                                    } else {
                                        if (strG0.equals("freezeType")) {
                                            iY2 = luaValueD.y2();
                                            if (iY2 == 0) {
                                                str2 = "gg.FREEZE_NORMAL";
                                            } else if (iY2 == 1) {
                                                str2 = "gg.FREEZE_MAY_INCREASE";
                                            } else if (iY2 == 2) {
                                                str2 = "gg.FREEZE_MAY_DECREASE";
                                            } else if (iY2 == 3) {
                                                str2 = "gg.FREEZE_IN_RANGE";
                                            }
                                        }
                                        str2 = null;
                                    }
                                }
                                sb.append(',');
                            } else {
                                sb.append(luaValueD.g0());
                                if (!(luaValueD instanceof android.ext.Script.ApiFunction)) {
                                    sb.append(',');
                                }
                            }
                            str2 = null;
                        }
                        if (str2 != null) {
                            sb.append(" -- ");
                            sb.append(str2);
                        }
                        sb.append('\n');
                        if (z5) {
                            if (arrayList3 == null) {
                                i2 = i6 - (i7 - 1);
                                if (i2 < 0) {
                                    arrayList = new java.util.ArrayList();
                                } else {
                                    arrayList = new java.util.ArrayList(i2);
                                }
                                arrayList2 = arrayList;
                            } else {
                                arrayList2 = arrayList3;
                            }
                            arrayList2.add(sb.toString());
                        } else {
                            arrayList2 = arrayList3;
                        }
                        appendable2 = appendable;
                        z4 = z6;
                        iVarS3 = iVar;
                        z3 = z7;
                        iS1 = i6;
                        i4 = i7;
                        iMax = iMax;
                    }
                }
            }
        }
        java.util.ArrayList arrayList4 = arrayList2;
        if (arrayList4 != null) {
            try {
                java.util.Collections.sort(arrayList4);
            } catch (java.lang.Throwable th) {
                android.ext.e1.a(th);
            }
            java.util.Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                appendable.append((java.lang.String) it.next());
            }
        }
        if (z2) {
            appendable.append(str);
        }
        appendable.append('}');
        return appendable;
    }

    private void h3(luaj.LuaValue luaValue) {
        if (this.Q.length > 0) {
            int iI3 = i3(luaValue);
            for (luaj.LuaTable.m mVarA = this.Q[iI3]; mVarA != null; mVarA = mVarA.a()) {
                luaj.LuaTable.n nVarF = mVarA.f(luaValue);
                if (nVarF != null) {
                    luaj.LuaTable.m[] mVarArr = this.Q;
                    mVarArr[iI3] = mVarArr[iI3].h(nVarF);
                    this.R--;
                    return;
                }
            }
        }
    }

    private int i3(luaj.LuaValue luaValue) {
        return luaValue.hashCode() & (this.Q.length - 1);
    }

    public static int j3(luaj.LuaValue luaValue, int i2) {
        return luaValue.hashCode() & i2;
    }

    public static int l3(int i2, int i3) {
        return i2 & i3;
    }

    private void n3(int i2, luaj.LuaValue luaValue) {
        o3(i2, luaValue);
        while (i2 > 1) {
            luaj.LuaValue luaValueC3 = c3(i2);
            e2(i2, c3(1));
            e2(1, luaValueC3);
            i2--;
            B3(1, i2, luaValue);
        }
    }

    private void o3(int i2, luaj.LuaValue luaValue) {
        for (int i3 = i2 / 2; i3 > 0; i3--) {
            B3(i3, i2, luaValue);
        }
    }

    protected static boolean r3(luaj.LuaValue luaValue) {
        int iC2 = luaValue.C2();
        if (iC2 == 1 || iC2 == 3) {
            return false;
        }
        return iC2 != 4 || luaValue.W1() > 32;
    }

    static int u3(int i2) {
        int i3;
        int i4 = i2 - 1;
        if (i4 < 0) {
            return Integer.MIN_VALUE;
        }
        if (((-65536) & i4) != 0) {
            i4 >>>= 16;
            i3 = 16;
        } else {
            i3 = 0;
        }
        if ((65280 & i4) != 0) {
            i3 += 8;
            i4 >>>= 8;
        }
        if ((i4 & 240) != 0) {
            i3 += 4;
            i4 >>>= 4;
        }
        switch (i4) {
            case 0:
                return 0;
            case 1:
                return i3 + 1;
            case 2:
            case 3:
                return i3 + 2;
            case 4:
            case 5:
            case 6:
            case 7:
                return i3 + 3;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i3 + 4;
            default:
                return i3;
        }
    }

    private void y3(int i2) {
        luaj.LuaValue[] luaValueArr;
        luaj.LuaTable.m[] mVarArr;
        int i3;
        luaj.LuaTable.m mVarZ2;
        luaj.e eVar = this.S;
        if (eVar != null && (eVar.q() || this.S.p())) {
            this.R = X2();
            if (this.S.p()) {
                a3();
            }
        }
        int[] iArr = new int[32];
        int iY2 = Y2(iArr);
        if (i2 > 0) {
            iY2++;
            int iU3 = u3(i2);
            iArr[iU3] = iArr[iU3] + 1;
        }
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = 0;
        while (true) {
            if (i5 >= 32) {
                break;
            }
            i4 += iArr[i5];
            int i7 = 1 << i5;
            if (iY2 * 2 < i7) {
                break;
            }
            if (i4 >= (1 << (i5 - 1))) {
                i6 = i7;
            }
            i5++;
        }
        luaj.LuaValue[] luaValueArr2 = this.P;
        luaj.LuaTable.m[] mVarArr2 = this.Q;
        int i8 = (i2 <= 0 || i2 > i6) ? 0 : -1;
        if (i6 != luaValueArr2.length) {
            luaValueArr = new luaj.LuaValue[i6];
            if (i6 > luaValueArr2.length) {
                int iU4 = u3(i6) + 1;
                for (int iU5 = u3(luaValueArr2.length + 1); iU5 < iU4; iU5++) {
                    i8 += iArr[iU5];
                }
            } else if (luaValueArr2.length > i6) {
                int iU6 = u3(luaValueArr2.length) + 1;
                for (int iU7 = u3(i6 + 1); iU7 < iU6; iU7++) {
                    i8 -= iArr[iU7];
                }
            }
            java.lang.System.arraycopy(luaValueArr2, 0, luaValueArr, 0, java.lang.Math.min(luaValueArr2.length, i6));
        } else {
            luaValueArr = luaValueArr2;
        }
        int i9 = (this.R - i8) + ((i2 < 0 || i2 > i6) ? 1 : 0);
        if (i9 > 0) {
            int iU8 = i9 >= 2 ? 1 << u3(i9) : 2;
            i3 = iU8 - 1;
            mVarArr = new luaj.LuaTable.m[iU8];
        } else {
            mVarArr = U;
            i3 = 0;
        }
        for (luaj.LuaTable.m mVarA : mVarArr2) {
            for (; mVarA != null; mVarA = mVarA.a()) {
                int iR = mVarA.r(i6);
                if (iR > 0) {
                    luaj.LuaTable.n nVarL = mVarA.l();
                    if (nVarL != null) {
                        luaValueArr[iR - 1] = nVarL.t();
                    }
                } else if (!(mVarA instanceof luaj.LuaTable.c)) {
                    int iB = mVarA.b(i3);
                    mVarArr[iB] = mVarA.n(mVarArr[iB]);
                }
            }
        }
        while (i6 < luaValueArr2.length) {
            int i10 = i6 + 1;
            luaj.LuaValue luaValue = luaValueArr2[i6];
            if (luaValue != null) {
                long j2 = i10;
                int iL3 = l3(luaj.LuaLong.V2(j2), i3);
                luaj.e eVar2 = this.S;
                luaj.LuaLong luaLongI2 = luaj.LuaValue.I2(j2);
                if (eVar2 != null) {
                    mVarZ2 = eVar2.k(luaLongI2, luaValue);
                    if (mVarZ2 == null) {
                    }
                } else {
                    mVarZ2 = Z2(luaLongI2, luaValue);
                }
                luaj.LuaTable.m mVar = mVarArr[iL3];
                if (mVar != null) {
                    mVarZ2 = mVar.d(mVarZ2);
                }
                mVarArr[iL3] = mVarZ2;
            }
            i6 = i10;
        }
        this.Q = mVarArr;
        this.P = luaValueArr;
        this.R -= i8;
    }

    @Override // luaj.LuaValue
    public int C2() {
        return 5;
    }

    @Override // luaj.LuaValue
    public java.lang.String D2() {
        return "table";
    }

    public void D3(luaj.LuaValue luaValue) {
        int iS1 = s1();
        if (iS1 >= 16777215) {
            throw new luaj.d("array too big: " + iS1 + " >= 16777215");
        }
        luaj.e eVar = this.S;
        if (eVar != null && eVar.p()) {
            a3();
        }
        if (iS1 > 1) {
            if (luaValue.l1()) {
                luaValue = null;
            }
            n3(iS1, luaValue);
        }
    }

    public java.lang.String E3(java.lang.Appendable appendable, java.util.Map map) {
        if (V != null) {
            return b3("", appendable, map).toString();
        }
        V = new java.util.HashSet();
        W = 0;
        java.lang.String string = b3("", appendable, map).toString();
        W = 0;
        V = null;
        return string;
    }

    public luaj.Varargs F3(long j2, long j3) {
        if (j3 < j2) {
            return luaj.LuaValue.f1676f;
        }
        long j4 = j3 - j2;
        if (j4 < 0) {
            throw new luaj.d("too many results to unpack: greater 9223372036854775807");
        }
        if (j4 >= 16777215) {
            throw new luaj.d("too many results to unpack: " + j4 + " (max is 16777215)");
        }
        int i2 = (int) (j4 + 1);
        int i3 = (int) j2;
        boolean z = ((long) i3) == j2 && ((long) ((int) j3)) == j3;
        if (i2 <= 0) {
            return luaj.LuaValue.f1676f;
        }
        if (i2 == 1) {
            return z ? c3(i3) : U0(luaj.LuaLong.I2(j2));
        }
        if (i2 == 2) {
            luaj.LuaValue luaValueC3 = z ? c3(i3) : U0(luaj.LuaLong.I2(j2));
            long j5 = j2 + 1;
            return luaj.LuaValue.N2(luaValueC3, z ? c3((int) j5) : U0(luaj.LuaLong.I2(j5)));
        }
        try {
            luaj.LuaValue[] luaValueArr = new luaj.LuaValue[i2];
            while (true) {
                i2--;
                if (i2 < 0) {
                    return luaj.LuaValue.O2(luaValueArr);
                }
                long j6 = ((long) i2) + j2;
                luaValueArr[i2] = z ? c3((int) j6) : U0(luaj.LuaLong.I2(j6));
            }
        } catch (java.lang.OutOfMemoryError e2) {
            android.ext.e1.l("OOM on unpack: " + i2, e2);
            throw new luaj.d("too many results to unpack [out of memory]: " + i2);
        }
    }

    public void G3(int i2, luaj.LuaString luaString, double d2) {
        luaj.LuaTable.m[] mVarArr = this.Q;
        float f2 = (float) d2;
        luaj.LuaTable.m fVar = ((double) f2) == d2 ? new luaj.LuaTable.f(luaString, f2) : new luaj.LuaTable.d(luaString, d2);
        luaj.LuaTable.m mVar = mVarArr[i2];
        if (mVar != null) {
            fVar = mVar.d(fVar);
        }
        mVarArr[i2] = fVar;
        this.R++;
    }

    @Override // luaj.LuaValue
    public luaj.LuaTable H0() {
        return this;
    }

    public void H3(int i2, luaj.LuaString luaString, float f2) {
        luaj.LuaTable.m[] mVarArr = this.Q;
        luaj.LuaTable.m fVar = new luaj.LuaTable.f(luaString, f2);
        luaj.LuaTable.m mVar = mVarArr[i2];
        if (mVar != null) {
            fVar = mVar.d(fVar);
        }
        mVarArr[i2] = fVar;
        this.R++;
    }

    public void I3(int i2, luaj.LuaString luaString, int i3) {
        luaj.LuaTable.m[] mVarArr = this.Q;
        luaj.LuaTable.m hVar = new luaj.LuaTable.h(luaString, i3);
        luaj.LuaTable.m mVar = mVarArr[i2];
        if (mVar != null) {
            hVar = mVar.d(hVar);
        }
        mVarArr[i2] = hVar;
        this.R++;
    }

    public void J3(int i2, luaj.LuaString luaString, long j2) {
        luaj.LuaTable.m[] mVarArr = this.Q;
        int i3 = (int) j2;
        luaj.LuaTable.m hVar = ((long) i3) == j2 ? new luaj.LuaTable.h(luaString, i3) : new luaj.LuaTable.k(luaString, j2);
        luaj.LuaTable.m mVar = mVarArr[i2];
        if (mVar != null) {
            hVar = mVar.d(hVar);
        }
        mVarArr[i2] = hVar;
        this.R++;
    }

    public void K3(int i2, luaj.LuaString luaString, boolean z) {
        luaj.LuaTable.m[] mVarArr = this.Q;
        luaj.LuaTable.m bVar = new luaj.LuaTable.b(luaString, z);
        luaj.LuaTable.m mVar = mVarArr[i2];
        if (mVar != null) {
            bVar = mVar.d(bVar);
        }
        mVarArr[i2] = bVar;
        this.R++;
    }

    @Override // luaj.LuaValue
    public luaj.LuaTable L1(luaj.LuaTable luaTable) {
        return this;
    }

    @Override // luaj.LuaValue
    public boolean P0(luaj.LuaValue luaValue) {
        if (this == luaValue) {
            return true;
        }
        if (luaValue.o1()) {
            return luaj.LuaValue.Q0(this, luaValue);
        }
        return false;
    }

    @Override // luaj.LuaValue
    public void R1(int i2) {
        luaj.LuaValue[] luaValueArr = this.P;
        if (i2 > luaValueArr.length) {
            this.P = A3(luaValueArr, 1 << u3(i2));
        }
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue U0(luaj.LuaValue luaValue) {
        luaj.LuaValue luaValueV1 = V1(luaValue);
        return (!luaValueV1.l1() || this.S == null) ? luaValueV1 : luaj.LuaValue.W0(this, luaValue);
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue V0() {
        luaj.e eVar = this.S;
        if (eVar != null) {
            return eVar.e();
        }
        return null;
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue V1(luaj.LuaValue luaValue) {
        int iY2;
        if (luaValue.i1() && (iY2 = luaValue.y2()) > 0) {
            luaj.LuaValue[] luaValueArr = this.P;
            if (iY2 <= luaValueArr.length) {
                luaj.e eVar = this.S;
                int i2 = iY2 - 1;
                luaj.LuaValue luaValueO = eVar == null ? luaValueArr[i2] : eVar.o(luaValueArr, i2);
                return luaValueO != null ? luaValueO : luaj.LuaValue.f1673c;
            }
        }
        return k3(luaValue);
    }

    @Override // luaj.LuaValue
    public int W1() {
        int i2;
        int iD3 = d3();
        if (iD3 == 0 || !x3(iD3).l1()) {
            int iF3 = iD3 + 1;
            int i3 = iD3;
            while (!x3(iF3).l1()) {
                i3 = iF3;
                iF3 = f3() + iD3 + 1 + iF3;
            }
            iD3 = iF3;
            i2 = i3;
        } else {
            i2 = 0;
        }
        while (iD3 > i2 + 1) {
            int i4 = (i2 + iD3) / 2;
            if (x3(i4).l1()) {
                iD3 = i4;
            } else {
                i2 = i4;
            }
        }
        return i2;
    }

    public luaj.LuaValue W2(luaj.LuaString luaString, int i2, int i3) {
        ggf.a aVar = new ggf.a();
        if (i2 <= i3) {
            while (true) {
                aVar.c(c3(i2).G0());
                if (i2 >= Integer.MAX_VALUE || (i2 = i2 + 1) > i3) {
                    break;
                }
                aVar.c(luaString);
            }
        }
        return aVar.l();
    }

    @Override // luaj.LuaValue
    public void Y1(int i2, luaj.LuaValue luaValue) {
        if (luaValue == null || U2(i2, luaValue)) {
            return;
        }
        m3(luaj.LuaLong.I2(i2), luaValue);
    }

    public luaj.LuaValue c3(int i2) {
        luaj.LuaValue luaValueX3 = x3(i2);
        return (!luaValueX3.l1() || this.S == null) ? luaValueX3 : luaj.LuaValue.W0(this, luaj.LuaValue.I2(i2));
    }

    @Override // luaj.LuaValue
    public void d2(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
        if (luaValue == null || luaValue2 == null) {
            return;
        }
        if (luaValue.i1() && U2(luaValue.y2(), luaValue2)) {
            return;
        }
        m3(luaValue, luaValue2);
    }

    public int d3() {
        return this.P.length;
    }

    @Override // luaj.e
    public luaj.LuaValue e() {
        return this;
    }

    @Override // luaj.LuaValue
    public void e2(int i2, luaj.LuaValue luaValue) {
        if (this.S != null && x3(i2).l1() && luaj.LuaValue.l2(this, luaj.LuaLong.I2(i2), luaValue)) {
            return;
        }
        Y1(i2, luaValue);
    }

    public int e3() {
        return this.R;
    }

    public int f3() {
        return this.Q.length;
    }

    @Override // luaj.e
    public luaj.LuaValue g(luaj.LuaValue luaValue) {
        return luaValue;
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public java.lang.String g0() {
        try {
            return E3(new java.lang.StringBuilder(), null);
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public long g3(luaj.LuaValue luaValue) {
        luaj.LuaTable.n nVarC3 = C3(luaValue);
        if (nVarC3 == null) {
            return (this.S != null ? luaj.LuaValue.W0(this, luaValue) : luaj.LuaValue.f1673c).C0();
        }
        if (nVarC3 instanceof luaj.LuaTable.h) {
            return ((luaj.LuaTable.h) nVarC3).k0();
        }
        return nVarC3 instanceof luaj.LuaTable.k ? ((luaj.LuaTable.k) nVarC3).k0() : nVarC3.t().C0();
    }

    @Override // luaj.LuaValue
    public void j2(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
        if (luaValue == null || !(luaValue.q1() || x1(luaj.LuaValue.m).g1())) {
            throw new luaj.d("value ('" + luaValue + "') can not be used as a table index");
        }
        if (this.S != null && V1(luaValue).l1() && luaj.LuaValue.l2(this, luaValue, luaValue2)) {
            return;
        }
        d2(luaValue, luaValue2);
    }

    @Override // luaj.e
    public luaj.LuaTable.m k(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
        return Z2(luaValue, luaValue2);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x003d  */
    @Override // luaj.LuaValue
    public luaj.LuaValue k2(luaj.LuaValue luaValue) {
        luaj.e eVar = this.S;
        boolean z = eVar != null && eVar.q();
        luaj.e eVar2 = this.S;
        boolean z2 = eVar2 != null && eVar2.p();
        luaj.e eVarW1 = luaj.LuaValue.w1(luaValue);
        this.S = eVarW1;
        if (z != (eVarW1 != null && eVarW1.q())) {
            y3(0);
        } else {
            luaj.e eVar3 = this.S;
            if (z2 != (eVar3 != null && eVar3.p())) {
                y3(0);
            }
        }
        return this;
    }

    protected luaj.LuaValue k3(luaj.LuaValue luaValue) {
        luaj.LuaTable.n nVarC3 = C3(luaValue);
        return nVarC3 == null ? luaj.LuaValue.f1673c : nVarC3.t();
    }

    public void m3(luaj.LuaValue luaValue, luaj.LuaValue luaValue2) {
        int iI3;
        if (luaValue2.l1()) {
            h3(luaValue);
            return;
        }
        if (this.Q.length > 0) {
            iI3 = i3(luaValue);
            for (luaj.LuaTable.m mVarA = this.Q[iI3]; mVarA != null; mVarA = mVarA.a()) {
                luaj.LuaTable.n nVarF = mVarA.f(luaValue);
                if (nVarF != null) {
                    luaj.LuaTable.m[] mVarArr = this.Q;
                    mVarArr[iI3] = mVarArr[iI3].j(nVarF, luaValue2);
                    return;
                }
            }
        } else {
            iI3 = 0;
        }
        if (this.R >= this.Q.length) {
            luaj.e eVar = this.S;
            if ((eVar == null || !eVar.p()) && luaValue.i1() && luaValue.y2() > 0) {
                y3(luaValue.y2());
                if (U2(luaValue.y2(), luaValue2)) {
                    return;
                }
            } else {
                y3(-1);
            }
            iI3 = i3(luaValue);
        }
        luaj.e eVar2 = this.S;
        luaj.LuaTable.m mVarK = eVar2 != null ? eVar2.k(luaValue, luaValue2) : Z2(luaValue, luaValue2);
        luaj.LuaTable.m[] mVarArr2 = this.Q;
        luaj.LuaTable.m mVar = mVarArr2[iI3];
        if (mVar != null) {
            mVarK = mVar.d(mVarK);
        }
        mVarArr2[iI3] = mVarK;
        this.R++;
    }

    @Override // luaj.e
    public luaj.LuaValue o(luaj.LuaValue[] luaValueArr, int i2) {
        return luaValueArr[i2];
    }

    @Override // luaj.LuaValue
    public boolean o1() {
        return true;
    }

    @Override // luaj.e
    public boolean p() {
        return false;
    }

    public luaj.Varargs p3(luaj.LuaValue luaValue) {
        int iA0 = luaValue.A0() + 1;
        luaj.LuaValue luaValueC3 = c3(iA0);
        return luaValueC3.l1() ? luaj.LuaValue.f1676f : luaj.LuaValue.N2(luaj.LuaLong.I2(iA0), luaValueC3);
    }

    @Override // luaj.e
    public boolean q() {
        return false;
    }

    public void q3(int i2, luaj.LuaValue luaValue) {
        while (!luaValue.l1()) {
            luaj.LuaValue luaValueC3 = c3(i2);
            e2(i2, luaValue);
            luaValue = luaValueC3;
            i2++;
        }
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue r1() {
        luaj.LuaValue luaValueX1 = x1(luaj.LuaValue.x);
        return luaValueX1.w2() ? luaValueX1.call(this) : luaj.LuaLong.I2(W1());
    }

    @Override // luaj.LuaValue
    public int s1() {
        if (this.S == null) {
            return W1();
        }
        luaj.LuaValue luaValueR1 = r1();
        if (luaValueR1.i1()) {
            return luaValueR1.y2();
        }
        throw new luaj.d("table length is not an integer: " + luaValueR1);
    }

    public luaj.LuaTable.i s3() {
        return new luaj.LuaTable.i();
    }

    public luaj.LuaValue[] t3() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        luaj.LuaTable.i iVarS3 = s3();
        while (iVarS3.c()) {
            arrayList.add(iVarS3.b());
        }
        luaj.LuaValue[] luaValueArr = new luaj.LuaValue[arrayList.size()];
        arrayList.toArray(luaValueArr);
        return luaValueArr;
    }

    public luaj.Varargs v3(luaj.LuaValue luaValue) {
        int iY2;
        int length = 0;
        if (!luaValue.l1()) {
            if (!luaValue.i1() || (iY2 = luaValue.y2()) <= 0 || iY2 > this.P.length) {
                if (this.Q.length == 0) {
                    luaj.LuaValue.R0("invalid key to 'next' 1: " + luaValue);
                }
                int iI3 = i3(luaValue);
                for (luaj.LuaTable.m mVarA = this.Q[iI3]; mVarA != null; mVarA = mVarA.a()) {
                    if (length != 0) {
                        luaj.LuaTable.n nVarL = mVarA.l();
                        if (nVarL != null) {
                            return nVarL.c();
                        }
                    } else if (mVarA.s(luaValue)) {
                        length = 1;
                    }
                }
                if (length == 0) {
                    luaj.LuaValue.R0("invalid key to 'next' 2: " + luaValue);
                }
                length = iI3 + this.P.length + 1;
            } else {
                length = iY2;
            }
        }
        while (true) {
            luaj.LuaValue[] luaValueArr = this.P;
            if (length < luaValueArr.length) {
                luaj.LuaValue luaValueO = luaValueArr[length];
                if (luaValueO != null) {
                    luaj.e eVar = this.S;
                    if (eVar != null) {
                        luaValueO = eVar.o(luaValueArr, length);
                    }
                    if (luaValueO != null) {
                        return luaj.LuaValue.N2(luaj.LuaLong.I2(length + 1), luaValueO);
                    }
                }
                length++;
            } else {
                int length2 = length - luaValueArr.length;
                while (true) {
                    luaj.LuaTable.m[] mVarArr = this.Q;
                    if (length2 >= mVarArr.length) {
                        return luaj.LuaValue.f1673c;
                    }
                    for (luaj.LuaTable.m mVarA2 = mVarArr[length2]; mVarA2 != null; mVarA2 = mVarA2.a()) {
                        luaj.LuaTable.n nVarL2 = mVarA2.l();
                        if (nVarL2 != null) {
                            return nVarL2.c();
                        }
                    }
                    length2++;
                }
            }
        }
    }

    public void w3(int i2, int i3) {
        if (i3 > 0 && i3 < 2) {
            i3 = 2;
        }
        this.P = i2 > 0 ? new luaj.LuaValue[1 << u3(i2)] : luaj.LuaValue.j;
        this.Q = i3 > 0 ? new luaj.LuaTable.m[1 << u3(i3)] : U;
        this.R = 0;
    }

    public luaj.LuaValue x3(int i2) {
        if (i2 > 0) {
            luaj.LuaValue[] luaValueArr = this.P;
            if (i2 <= luaValueArr.length) {
                luaj.e eVar = this.S;
                int i3 = i2 - 1;
                luaj.LuaValue luaValueO = eVar == null ? luaValueArr[i3] : eVar.o(luaValueArr, i3);
                return luaValueO != null ? luaValueO : luaj.LuaValue.f1673c;
            }
        }
        return k3(luaj.LuaLong.I2(i2));
    }

    public luaj.LuaValue z3(int i2, int i3) {
        if (i2 == 0) {
            i2 = i3;
        } else if (i2 > i3) {
            return luaj.LuaValue.f1676f;
        }
        luaj.LuaValue luaValueC3 = c3(i2);
        luaj.LuaValue luaValue = luaValueC3;
        while (!luaValue.l1()) {
            int i4 = i2 + 1;
            luaj.LuaValue luaValueC4 = c3(i4);
            e2(i2, luaValueC4);
            i2 = i4;
            luaValue = luaValueC4;
        }
        return luaValueC3.l1() ? luaj.LuaValue.f1676f : luaValueC3;
    }
}
