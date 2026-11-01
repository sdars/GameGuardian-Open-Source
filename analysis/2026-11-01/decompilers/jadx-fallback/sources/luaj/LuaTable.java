package luaj;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class LuaTable extends luaj.LuaValue implements luaj.e {
    private static final luaj.LuaString T = null;
    private static final luaj.LuaTable.m[] U = null;
    private static volatile java.util.Set V;
    private static volatile int W;
    private luaj.LuaValue[] P;
    private luaj.LuaTable.m[] Q;
    protected int R;
    protected luaj.e S;

    static /* synthetic */ class a {
    }

    private static class b extends luaj.LuaTable.o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f1646c;

        b(luaj.LuaValue r1, boolean r2) {
                r0 = this;
                r0.<init>(r1)
                r0.f1646c = r2
                return
        }

        @Override // luaj.LuaTable.e
        public luaj.LuaTable.e j0(luaj.LuaValue r6) {
                r5 = this;
                boolean r0 = r6 instanceof luaj.LuaBoolean
                if (r0 == 0) goto Le
                luaj.LuaBoolean r0 = luaj.LuaValue.f1672d
                if (r6 != r0) goto La
                r6 = 1
                goto Lb
            La:
                r6 = 0
            Lb:
                r5.f1646c = r6
                return r5
            Le:
                boolean r0 = r6 instanceof luaj.LuaLong
                if (r0 == 0) goto L2c
                long r0 = r6.z2()
                int r6 = (int) r0
                long r2 = (long) r6
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L24
                luaj.LuaTable$h r0 = new luaj.LuaTable$h
                luaj.LuaValue r1 = r5.f1662b
                r0.<init>(r1, r6)
                return r0
            L24:
                luaj.LuaTable$k r6 = new luaj.LuaTable$k
                luaj.LuaValue r2 = r5.f1662b
                r6.<init>(r2, r0)
                return r6
            L2c:
                boolean r0 = r6 instanceof luaj.LuaDouble
                if (r0 == 0) goto L4a
                double r0 = r6.x2()
                float r6 = (float) r0
                double r2 = (double) r6
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L42
                luaj.LuaTable$f r0 = new luaj.LuaTable$f
                luaj.LuaValue r1 = r5.f1662b
                r0.<init>(r1, r6)
                return r0
            L42:
                luaj.LuaTable$d r6 = new luaj.LuaTable$d
                luaj.LuaValue r2 = r5.f1662b
                r6.<init>(r2, r0)
                return r6
            L4a:
                luaj.LuaTable$l r0 = new luaj.LuaTable$l
                luaj.LuaValue r1 = r5.f1662b
                r0.<init>(r1, r6)
                return r0
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public luaj.LuaValue t() {
                r1 = this;
                boolean r0 = r1.f1646c
                luaj.LuaBoolean r0 = luaj.LuaValue.H2(r0)
                return r0
        }
    }

    private static class c implements luaj.LuaTable.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f1647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private luaj.LuaTable.m f1648b;

        private c(luaj.LuaValue r2, luaj.LuaTable.m r3) {
                r1 = this;
                r1.<init>()
                boolean r0 = luaj.LuaTable.r3(r2)
                if (r0 == 0) goto Lf
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r2 = r0
            Lf:
                r1.f1647a = r2
                r1.f1648b = r3
                return
        }

        /* synthetic */ c(luaj.LuaValue r1, luaj.LuaTable.m r2, luaj.LuaTable.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private luaj.LuaValue i() {
                r2 = this;
                java.lang.Object r0 = r2.f1647a
                boolean r1 = r0 instanceof java.lang.ref.WeakReference
                if (r1 == 0) goto Lc
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
                java.lang.Object r0 = r0.get()
            Lc:
                luaj.LuaValue r0 = (luaj.LuaValue) r0
                return r0
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m a() {
                r1 = this;
                luaj.LuaTable$m r0 = r1.f1648b
                return r0
        }

        @Override // luaj.LuaTable.m
        public int b(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m d(luaj.LuaTable.m r2) {
                r1 = this;
                luaj.LuaTable$m r0 = r1.f1648b
                if (r0 == 0) goto L8
                luaj.LuaTable$m r2 = r0.d(r2)
            L8:
                return r2
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.n f(luaj.LuaValue r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m h(luaj.LuaTable.n r2) {
                r1 = this;
                luaj.LuaValue r0 = r1.i()
                if (r0 == 0) goto Lf
                luaj.LuaTable$m r0 = r1.f1648b
                luaj.LuaTable$m r2 = r0.h(r2)
                r1.f1648b = r2
                return r1
            Lf:
                luaj.LuaTable$m r2 = r1.f1648b
                return r2
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m j(luaj.LuaTable.n r2, luaj.LuaValue r3) {
                r1 = this;
                luaj.LuaTable$m r0 = r1.f1648b
                if (r0 == 0) goto L9
                luaj.LuaTable$m r2 = r0.j(r2, r3)
                goto La
            L9:
                r2 = 0
            La:
                luaj.LuaValue r3 = r1.i()
                if (r3 == 0) goto L13
                r1.f1648b = r2
                return r1
            L13:
                return r2
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.n l() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m n(luaj.LuaTable.m r1) {
                r0 = this;
                return r1
        }

        @Override // luaj.LuaTable.m
        public int r(int r1) {
                r0 = this;
                r1 = -1
                return r1
        }

        @Override // luaj.LuaTable.m
        public boolean s(luaj.LuaValue r2) {
                r1 = this;
                luaj.LuaValue r0 = r1.i()
                if (r0 == 0) goto Le
                boolean r2 = r2.T1(r0)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                return r2
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "<dead"
                r0.append(r1)
                luaj.LuaValue r1 = r3.i()
                if (r1 == 0) goto L1c
                java.lang.String r2 = ": "
                r0.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L1c:
                r1 = 62
                r0.append(r1)
                luaj.LuaTable$m r1 = r3.f1648b
                if (r1 == 0) goto L33
                java.lang.String r1 = "; "
                r0.append(r1)
                luaj.LuaTable$m r1 = r3.f1648b
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L33:
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static class d extends luaj.LuaTable.o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f1649c;

        d(luaj.LuaValue r1, double r2) {
                r0 = this;
                r0.<init>(r1)
                r0.f1649c = r2
                return
        }

        @Override // luaj.LuaTable.e
        public luaj.LuaTable.e j0(luaj.LuaValue r6) {
                r5 = this;
                boolean r0 = r6 instanceof luaj.LuaBoolean
                if (r0 == 0) goto L10
                luaj.LuaTable$b r0 = new luaj.LuaTable$b
                luaj.LuaValue r1 = r5.f1662b
                boolean r6 = r6.w2()
                r0.<init>(r1, r6)
                return r0
            L10:
                luaj.LuaValue r0 = r6.A2()
                boolean r1 = r0.l1()
                if (r1 == 0) goto L22
                luaj.LuaTable$l r0 = new luaj.LuaTable$l
                luaj.LuaValue r1 = r5.f1662b
                r0.<init>(r1, r6)
                return r0
            L22:
                boolean r6 = r0 instanceof luaj.LuaLong
                if (r6 == 0) goto L40
                long r0 = r0.z2()
                int r6 = (int) r0
                long r2 = (long) r6
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L38
                luaj.LuaTable$h r0 = new luaj.LuaTable$h
                luaj.LuaValue r1 = r5.f1662b
                r0.<init>(r1, r6)
                return r0
            L38:
                luaj.LuaTable$k r6 = new luaj.LuaTable$k
                luaj.LuaValue r2 = r5.f1662b
                r6.<init>(r2, r0)
                return r6
            L40:
                double r0 = r0.x2()
                float r6 = (float) r0
                double r2 = (double) r6
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L52
                luaj.LuaTable$f r0 = new luaj.LuaTable$f
                luaj.LuaValue r1 = r5.f1662b
                r0.<init>(r1, r6)
                return r0
            L52:
                r5.f1649c = r0
                return r5
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public luaj.LuaValue t() {
                r2 = this;
                double r0 = r2.f1649c
                luaj.LuaNumber r0 = luaj.LuaValue.J2(r0)
                return r0
        }
    }

    static abstract class e extends luaj.Varargs implements luaj.LuaTable.n {
        e() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // luaj.Varargs
        public int U() {
                r1 = this;
                r0 = 2
                return r0
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m a() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // luaj.LuaTable.m
        public abstract int b(int r1);

        @Override // luaj.LuaTable.n
        public luaj.Varargs c() {
                r0 = this;
                return r0
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m d(luaj.LuaTable.m r2) {
                r1 = this;
                luaj.LuaTable$j r0 = new luaj.LuaTable$j
                r0.<init>(r1, r2)
                return r0
        }

        @Override // luaj.Varargs
        public luaj.Varargs e0(int r2) {
                r1 = this;
                r0 = 1
                if (r2 == r0) goto Le
                r0 = 2
                if (r2 == r0) goto L9
                luaj.LuaValue r2 = luaj.LuaValue.f1674f
                return r2
            L9:
                luaj.LuaValue r2 = r1.t()
                return r2
            Le:
                return r1
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.n f(luaj.LuaValue r1) {
                r0 = this;
                boolean r1 = r0.s(r1)
                if (r1 == 0) goto L8
                r1 = r0
                goto L9
            L8:
                r1 = 0
            L9:
                return r1
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m h(luaj.LuaTable.n r3) {
                r2 = this;
                luaj.LuaTable$c r3 = new luaj.LuaTable$c
                luaj.LuaValue r0 = r2.i()
                r1 = 0
                r3.<init>(r0, r1, r1)
                return r3
        }

        @Override // luaj.LuaTable.n
        public abstract luaj.LuaValue i();

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m j(luaj.LuaTable.n r1, luaj.LuaValue r2) {
                r0 = this;
                luaj.LuaTable$e r1 = r0.j0(r2)
                return r1
        }

        abstract luaj.LuaTable.e j0(luaj.LuaValue r1);

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.n l() {
                r0 = this;
                return r0
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m n(luaj.LuaTable.m r2) {
                r1 = this;
                if (r2 == 0) goto L8
                luaj.LuaTable$j r0 = new luaj.LuaTable$j
                r0.<init>(r1, r2)
                goto L9
            L8:
                r0 = r1
            L9:
                return r0
        }

        @Override // luaj.LuaTable.m
        public int r(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // luaj.LuaTable.m
        public abstract boolean s(luaj.LuaValue r1);

        public abstract luaj.LuaValue t();

        @Override // luaj.Varargs
        public luaj.LuaValue v(int r2) {
                r1 = this;
                r0 = 1
                if (r2 == r0) goto Le
                r0 = 2
                if (r2 == r0) goto L9
                luaj.LuaValue r2 = luaj.LuaValue.f1671c
                return r2
            L9:
                luaj.LuaValue r2 = r1.t()
                return r2
            Le:
                luaj.LuaValue r2 = r1.i()
                return r2
        }

        @Override // luaj.Varargs
        public luaj.LuaValue w() {
                r1 = this;
                luaj.LuaValue r0 = r1.i()
                return r0
        }
    }

    private static class f extends luaj.LuaTable.o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f1650c;

        f(luaj.LuaValue r1, float r2) {
                r0 = this;
                r0.<init>(r1)
                r0.f1650c = r2
                return
        }

        @Override // luaj.LuaTable.e
        public luaj.LuaTable.e j0(luaj.LuaValue r6) {
                r5 = this;
                boolean r0 = r6 instanceof luaj.LuaBoolean
                if (r0 == 0) goto L10
                luaj.LuaTable$b r0 = new luaj.LuaTable$b
                luaj.LuaValue r1 = r5.f1662b
                boolean r6 = r6.w2()
                r0.<init>(r1, r6)
                return r0
            L10:
                luaj.LuaValue r0 = r6.A2()
                boolean r1 = r0.l1()
                if (r1 == 0) goto L22
                luaj.LuaTable$l r0 = new luaj.LuaTable$l
                luaj.LuaValue r1 = r5.f1662b
                r0.<init>(r1, r6)
                return r0
            L22:
                boolean r6 = r0 instanceof luaj.LuaLong
                if (r6 == 0) goto L40
                long r0 = r0.z2()
                int r6 = (int) r0
                long r2 = (long) r6
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L38
                luaj.LuaTable$h r0 = new luaj.LuaTable$h
                luaj.LuaValue r1 = r5.f1662b
                r0.<init>(r1, r6)
                return r0
            L38:
                luaj.LuaTable$k r6 = new luaj.LuaTable$k
                luaj.LuaValue r2 = r5.f1662b
                r6.<init>(r2, r0)
                return r6
            L40:
                double r0 = r0.x2()
                float r6 = (float) r0
                double r2 = (double) r6
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L4d
                r5.f1650c = r6
                return r5
            L4d:
                luaj.LuaTable$d r6 = new luaj.LuaTable$d
                luaj.LuaValue r2 = r5.f1662b
                r6.<init>(r2, r0)
                return r6
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public luaj.LuaValue t() {
                r2 = this;
                float r0 = r2.f1650c
                double r0 = (double) r0
                luaj.LuaNumber r0 = luaj.LuaValue.J2(r0)
                return r0
        }
    }

    private static class g extends luaj.LuaTable.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private luaj.LuaValue f1652c;

        g(int r1, luaj.LuaValue r2) {
                r0 = this;
                r0.<init>()
                r0.f1651b = r1
                r0.f1652c = r2
                return
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.m
        public int b(int r3) {
                r2 = this;
                int r0 = r2.f1651b
                long r0 = (long) r0
                int r0 = luaj.LuaLong.V2(r0)
                int r3 = luaj.LuaTable.l3(r0, r3)
                return r3
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public luaj.LuaValue i() {
                r2 = this;
                int r0 = r2.f1651b
                long r0 = (long) r0
                luaj.LuaLong r0 = luaj.LuaValue.I2(r0)
                return r0
        }

        @Override // luaj.LuaTable.e
        public luaj.LuaTable.e j0(luaj.LuaValue r1) {
                r0 = this;
                r0.f1652c = r1
                return r0
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.m
        public int r(int r3) {
                r2 = this;
                int r0 = r2.f1651b
                r1 = 1
                if (r0 < r1) goto L8
                if (r0 > r3) goto L8
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.m
        public boolean s(luaj.LuaValue r3) {
                r2 = this;
                boolean r0 = r3.m1()
                r1 = 0
                if (r0 != 0) goto L8
                goto L11
            L8:
                int r0 = r2.f1651b
                int r3 = r3.y2()
                if (r0 != r3) goto L11
                r1 = 1
            L11:
                return r1
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public luaj.LuaValue t() {
                r1 = this;
                luaj.LuaValue r0 = r1.f1652c
                return r0
        }
    }

    private static class h extends luaj.LuaTable.o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1653c;

        h(luaj.LuaValue r1, int r2) {
                r0 = this;
                r0.<init>(r1)
                r0.f1653c = r2
                return
        }

        @Override // luaj.LuaTable.e
        public luaj.LuaTable.e j0(luaj.LuaValue r6) {
                r5 = this;
                boolean r0 = r6 instanceof luaj.LuaBoolean
                if (r0 == 0) goto L10
                luaj.LuaTable$b r0 = new luaj.LuaTable$b
                luaj.LuaValue r1 = r5.f1662b
                boolean r6 = r6.w2()
                r0.<init>(r1, r6)
                return r0
            L10:
                luaj.LuaValue r0 = r6.A2()
                boolean r1 = r0.l1()
                if (r1 == 0) goto L22
                luaj.LuaTable$l r0 = new luaj.LuaTable$l
                luaj.LuaValue r1 = r5.f1662b
                r0.<init>(r1, r6)
                return r0
            L22:
                boolean r6 = r0 instanceof luaj.LuaLong
                if (r6 == 0) goto L3b
                long r0 = r0.z2()
                int r6 = (int) r0
                long r2 = (long) r6
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L33
                r5.f1653c = r6
                return r5
            L33:
                luaj.LuaTable$k r6 = new luaj.LuaTable$k
                luaj.LuaValue r2 = r5.f1662b
                r6.<init>(r2, r0)
                return r6
            L3b:
                double r0 = r0.x2()
                float r6 = (float) r0
                double r2 = (double) r6
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L4d
                luaj.LuaTable$f r0 = new luaj.LuaTable$f
                luaj.LuaValue r1 = r5.f1662b
                r0.<init>(r1, r6)
                return r0
            L4d:
                luaj.LuaTable$d r6 = new luaj.LuaTable$d
                luaj.LuaValue r2 = r5.f1662b
                r6.<init>(r2, r0)
                return r6
        }

        int k0() {
                r1 = this;
                int r0 = r1.f1653c
                return r0
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public luaj.LuaValue t() {
                r2 = this;
                int r0 = r2.f1653c
                long r0 = (long) r0
                luaj.LuaLong r0 = luaj.LuaValue.I2(r0)
                return r0
        }
    }

    public class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private luaj.LuaTable.m f1655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private luaj.LuaTable.n f1656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ luaj.LuaTable f1657d;

        public i(luaj.LuaTable r1) {
                r0 = this;
                r0.f1657d = r1
                r0.<init>()
                r1 = -1
                r0.f1654a = r1
                r1 = 0
                r0.f1655b = r1
                r0.f1656c = r1
                return
        }

        public int a() {
                r1 = this;
                luaj.LuaTable$n r0 = r1.f1656c
                if (r0 != 0) goto L9
                int r0 = r1.f1654a
                int r0 = r0 + 1
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        public luaj.LuaValue b() {
                r2 = this;
                luaj.LuaTable$n r0 = r2.f1656c
                if (r0 == 0) goto L9
                luaj.LuaValue r0 = r0.i()
                return r0
            L9:
                int r0 = r2.f1654a
                int r0 = r0 + 1
                long r0 = (long) r0
                luaj.LuaLong r0 = luaj.LuaLong.I2(r0)
                return r0
        }

        public boolean c() {
                r5 = this;
                luaj.LuaTable$m r0 = r5.f1655b
            L2:
                r1 = 1
                if (r0 == 0) goto L16
                luaj.LuaTable$m r0 = r0.a()
                if (r0 == 0) goto L2
                luaj.LuaTable$n r2 = r0.l()
                if (r2 == 0) goto L2
                r5.f1655b = r0
                r5.f1656c = r2
                return r1
            L16:
                r0 = 0
                r5.f1655b = r0
                r5.f1656c = r0
                int r0 = r5.f1654a
                int r0 = r0 + r1
            L1e:
                luaj.LuaTable r2 = r5.f1657d
                luaj.LuaValue[] r2 = luaj.LuaTable.S2(r2)
                int r2 = r2.length
                if (r0 >= r2) goto L47
                luaj.LuaTable r2 = r5.f1657d
                luaj.LuaValue[] r2 = luaj.LuaTable.S2(r2)
                r2 = r2[r0]
                if (r2 == 0) goto L44
                luaj.LuaTable r2 = r5.f1657d
                luaj.e r3 = r2.S
                if (r3 == 0) goto L41
                luaj.LuaValue[] r2 = luaj.LuaTable.S2(r2)
                luaj.LuaValue r2 = r3.o(r2, r0)
                if (r2 == 0) goto L44
            L41:
                r5.f1654a = r0
                return r1
            L44:
                int r0 = r0 + 1
                goto L1e
            L47:
                luaj.LuaTable r2 = r5.f1657d
                luaj.LuaValue[] r2 = luaj.LuaTable.S2(r2)
                int r2 = r2.length
                int r0 = r0 - r2
            L4f:
                luaj.LuaTable r2 = r5.f1657d
                luaj.LuaTable$m[] r2 = luaj.LuaTable.T2(r2)
                int r2 = r2.length
                if (r0 >= r2) goto L7f
                luaj.LuaTable r2 = r5.f1657d
                luaj.LuaTable$m[] r2 = luaj.LuaTable.T2(r2)
                r2 = r2[r0]
            L60:
                if (r2 == 0) goto L7c
                luaj.LuaTable$n r3 = r2.l()
                if (r3 == 0) goto L77
                luaj.LuaTable r4 = r5.f1657d
                luaj.LuaValue[] r4 = luaj.LuaTable.S2(r4)
                int r4 = r4.length
                int r0 = r0 + r4
                r5.f1654a = r0
                r5.f1655b = r2
                r5.f1656c = r3
                return r1
            L77:
                luaj.LuaTable$m r2 = r2.a()
                goto L60
            L7c:
                int r0 = r0 + 1
                goto L4f
            L7f:
                r0 = 0
                return r0
        }

        public luaj.LuaValue d() {
                r3 = this;
                luaj.LuaTable$n r0 = r3.f1656c
                if (r0 == 0) goto L9
                luaj.LuaValue r0 = r0.t()
                return r0
            L9:
                luaj.LuaTable r0 = r3.f1657d
                luaj.e r1 = r0.S
                luaj.LuaValue[] r0 = luaj.LuaTable.S2(r0)
                if (r1 != 0) goto L18
                int r1 = r3.f1654a
                r0 = r0[r1]
                goto L1e
            L18:
                int r2 = r3.f1654a
                luaj.LuaValue r0 = r1.o(r0, r2)
            L1e:
                return r0
        }
    }

    private static class j implements luaj.LuaTable.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private luaj.LuaTable.e f1658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private luaj.LuaTable.m f1659b;

        j(luaj.LuaTable.e r1, luaj.LuaTable.m r2) {
                r0 = this;
                r0.<init>()
                r0.f1658a = r1
                r0.f1659b = r2
                return
        }

        private luaj.LuaTable.m e(luaj.LuaTable.m r1) {
                r0 = this;
                if (r1 == 0) goto L5
                r0.f1659b = r1
                return r0
            L5:
                luaj.LuaTable$e r1 = r0.f1658a
                return r1
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m a() {
                r1 = this;
                luaj.LuaTable$m r0 = r1.f1659b
                return r0
        }

        @Override // luaj.LuaTable.m
        public int b(int r2) {
                r1 = this;
                luaj.LuaTable$e r0 = r1.f1658a
                int r2 = r0.b(r2)
                return r2
        }

        @Override // luaj.LuaTable.n
        public luaj.Varargs c() {
                r1 = this;
                luaj.LuaTable$e r0 = r1.f1658a
                luaj.Varargs r0 = r0.c()
                return r0
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m d(luaj.LuaTable.m r2) {
                r1 = this;
                luaj.LuaTable$m r0 = r1.f1659b
                luaj.LuaTable$m r2 = r0.d(r2)
                luaj.LuaTable$m r2 = r1.e(r2)
                return r2
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.n f(luaj.LuaValue r2) {
                r1 = this;
                luaj.LuaTable$e r0 = r1.f1658a
                boolean r2 = r0.s(r2)
                if (r2 == 0) goto La
                r2 = r1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m h(luaj.LuaTable.n r4) {
                r3 = this;
                if (r3 != r4) goto Lf
                luaj.LuaTable$c r4 = new luaj.LuaTable$c
                luaj.LuaValue r0 = r3.i()
                luaj.LuaTable$m r1 = r3.f1659b
                r2 = 0
                r4.<init>(r0, r1, r2)
                return r4
            Lf:
                luaj.LuaTable$m r0 = r3.f1659b
                luaj.LuaTable$m r4 = r0.h(r4)
                r3.f1659b = r4
                return r3
        }

        @Override // luaj.LuaTable.n
        public luaj.LuaValue i() {
                r1 = this;
                luaj.LuaTable$e r0 = r1.f1658a
                luaj.LuaValue r0 = r0.i()
                return r0
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m j(luaj.LuaTable.n r2, luaj.LuaValue r3) {
                r1 = this;
                if (r2 != r1) goto Lb
                luaj.LuaTable$e r2 = r1.f1658a
                luaj.LuaTable$e r2 = r2.j0(r3)
                r1.f1658a = r2
                return r1
            Lb:
                luaj.LuaTable$m r0 = r1.f1659b
                luaj.LuaTable$m r2 = r0.j(r2, r3)
                luaj.LuaTable$m r2 = r1.e(r2)
                return r2
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.n l() {
                r1 = this;
                luaj.LuaTable$e r0 = r1.f1658a
                return r0
        }

        @Override // luaj.LuaTable.m
        public luaj.LuaTable.m n(luaj.LuaTable.m r3) {
                r2 = this;
                if (r3 == 0) goto La
                luaj.LuaTable$j r0 = new luaj.LuaTable$j
                luaj.LuaTable$e r1 = r2.f1658a
                r0.<init>(r1, r3)
                goto Lc
            La:
                luaj.LuaTable$e r0 = r2.f1658a
            Lc:
                return r0
        }

        @Override // luaj.LuaTable.m
        public int r(int r2) {
                r1 = this;
                luaj.LuaTable$e r0 = r1.f1658a
                int r2 = r0.r(r2)
                return r2
        }

        @Override // luaj.LuaTable.m
        public boolean s(luaj.LuaValue r2) {
                r1 = this;
                luaj.LuaTable$e r0 = r1.f1658a
                boolean r2 = r0.s(r2)
                return r2
        }

        @Override // luaj.LuaTable.n
        public luaj.LuaValue t() {
                r1 = this;
                luaj.LuaTable$e r0 = r1.f1658a
                luaj.LuaValue r0 = r0.t()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                luaj.LuaTable$e r1 = r2.f1658a
                r0.append(r1)
                java.lang.String r1 = "; "
                r0.append(r1)
                luaj.LuaTable$m r1 = r2.f1659b
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static class k extends luaj.LuaTable.o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f1660c;

        k(luaj.LuaValue r1, long r2) {
                r0 = this;
                r0.<init>(r1)
                r0.f1660c = r2
                return
        }

        @Override // luaj.LuaTable.e
        public luaj.LuaTable.e j0(luaj.LuaValue r6) {
                r5 = this;
                boolean r0 = r6 instanceof luaj.LuaBoolean
                if (r0 == 0) goto L10
                luaj.LuaTable$b r0 = new luaj.LuaTable$b
                luaj.LuaValue r1 = r5.f1662b
                boolean r6 = r6.w2()
                r0.<init>(r1, r6)
                return r0
            L10:
                luaj.LuaValue r0 = r6.A2()
                boolean r1 = r0.l1()
                if (r1 == 0) goto L22
                luaj.LuaTable$l r0 = new luaj.LuaTable$l
                luaj.LuaValue r1 = r5.f1662b
                r0.<init>(r1, r6)
                return r0
            L22:
                boolean r6 = r0 instanceof luaj.LuaLong
                if (r6 == 0) goto L3b
                long r0 = r0.z2()
                int r6 = (int) r0
                long r2 = (long) r6
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L38
                luaj.LuaTable$h r0 = new luaj.LuaTable$h
                luaj.LuaValue r1 = r5.f1662b
                r0.<init>(r1, r6)
                return r0
            L38:
                r5.f1660c = r0
                return r5
            L3b:
                double r0 = r0.x2()
                float r6 = (float) r0
                double r2 = (double) r6
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L4d
                luaj.LuaTable$f r0 = new luaj.LuaTable$f
                luaj.LuaValue r1 = r5.f1662b
                r0.<init>(r1, r6)
                return r0
            L4d:
                luaj.LuaTable$d r6 = new luaj.LuaTable$d
                luaj.LuaValue r2 = r5.f1662b
                r6.<init>(r2, r0)
                return r6
        }

        long k0() {
                r2 = this;
                long r0 = r2.f1660c
                return r0
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public luaj.LuaValue t() {
                r2 = this;
                long r0 = r2.f1660c
                luaj.LuaLong r0 = luaj.LuaValue.I2(r0)
                return r0
        }
    }

    static class l extends luaj.LuaTable.o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private luaj.LuaValue f1661c;

        l(luaj.LuaValue r1, luaj.LuaValue r2) {
                r0 = this;
                r0.<init>(r1)
                r0.f1661c = r2
                return
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public luaj.Varargs c() {
                r0 = this;
                return r0
        }

        @Override // luaj.LuaTable.e
        public luaj.LuaTable.e j0(luaj.LuaValue r6) {
                r5 = this;
                boolean r0 = r6 instanceof luaj.LuaBoolean
                if (r0 == 0) goto L10
                luaj.LuaTable$b r0 = new luaj.LuaTable$b
                luaj.LuaValue r1 = r5.f1662b
                boolean r6 = r6.w2()
                r0.<init>(r1, r6)
                return r0
            L10:
                boolean r0 = r6 instanceof luaj.LuaLong
                if (r0 == 0) goto L2e
                long r0 = r6.z2()
                int r6 = (int) r0
                long r2 = (long) r6
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L26
                luaj.LuaTable$h r0 = new luaj.LuaTable$h
                luaj.LuaValue r1 = r5.f1662b
                r0.<init>(r1, r6)
                return r0
            L26:
                luaj.LuaTable$k r6 = new luaj.LuaTable$k
                luaj.LuaValue r2 = r5.f1662b
                r6.<init>(r2, r0)
                return r6
            L2e:
                boolean r0 = r6 instanceof luaj.LuaDouble
                if (r0 == 0) goto L4c
                double r0 = r6.x2()
                float r6 = (float) r0
                double r2 = (double) r6
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L44
                luaj.LuaTable$f r0 = new luaj.LuaTable$f
                luaj.LuaValue r1 = r5.f1662b
                r0.<init>(r1, r6)
                return r0
            L44:
                luaj.LuaTable$d r6 = new luaj.LuaTable$d
                luaj.LuaValue r2 = r5.f1662b
                r6.<init>(r2, r0)
                return r6
            L4c:
                r5.f1661c = r6
                return r5
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public luaj.LuaValue t() {
                r1 = this;
                luaj.LuaValue r0 = r1.f1661c
                return r0
        }
    }

    interface m {
        luaj.LuaTable.m a();

        int b(int r1);

        luaj.LuaTable.m d(luaj.LuaTable.m r1);

        luaj.LuaTable.n f(luaj.LuaValue r1);

        luaj.LuaTable.m h(luaj.LuaTable.n r1);

        luaj.LuaTable.m j(luaj.LuaTable.n r1, luaj.LuaValue r2);

        luaj.LuaTable.n l();

        luaj.LuaTable.m n(luaj.LuaTable.m r1);

        int r(int r1);

        boolean s(luaj.LuaValue r1);
    }

    interface n extends luaj.LuaTable.m {
        luaj.Varargs c();

        luaj.LuaValue i();

        luaj.LuaValue t();
    }

    private static abstract class o extends luaj.LuaTable.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final luaj.LuaValue f1662b;

        o(luaj.LuaValue r1) {
                r0 = this;
                r0.<init>()
                r0.f1662b = r1
                return
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.m
        public final int b(int r2) {
                r1 = this;
                luaj.LuaValue r0 = r1.f1662b
                int r2 = luaj.LuaTable.j3(r0, r2)
                return r2
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.n
        public final luaj.LuaValue i() {
                r1 = this;
                luaj.LuaValue r0 = r1.f1662b
                return r0
        }

        @Override // luaj.LuaTable.e, luaj.LuaTable.m
        public final boolean s(luaj.LuaValue r2) {
                r1 = this;
                luaj.LuaValue r0 = r1.f1662b
                boolean r2 = r2.T1(r0)
                return r2
        }
    }

    static {
            java.lang.String r0 = "n"
            luaj.LuaString r0 = luaj.LuaValue.K2(r0)
            luaj.LuaTable.T = r0
            r0 = 0
            luaj.LuaTable$m[] r1 = new luaj.LuaTable.m[r0]
            luaj.LuaTable.U = r1
            r1 = 0
            luaj.LuaTable.V = r1
            luaj.LuaTable.W = r0
            return
    }

    public LuaTable() {
            r1 = this;
            r1.<init>()
            luaj.LuaValue[] r0 = luaj.LuaValue.j
            r1.P = r0
            luaj.LuaTable$m[] r0 = luaj.LuaTable.U
            r1.Q = r0
            return
    }

    public LuaTable(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.w3(r1, r2)
            return
    }

    public LuaTable(luaj.Varargs r6, int r7) {
            r5 = this;
            r5.<init>()
            r0 = 1
            int r7 = r7 - r0
            int r1 = r6.U()
            int r1 = r1 - r7
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            r5.w3(r1, r0)
            luaj.LuaString r2 = luaj.LuaTable.T
            long r3 = (long) r1
            luaj.LuaLong r3 = luaj.LuaValue.I2(r3)
            r5.j2(r2, r3)
        L1c:
            if (r0 > r1) goto L2a
            int r2 = r0 + r7
            luaj.LuaValue r2 = r6.v(r2)
            r5.e2(r0, r2)
            int r0 = r0 + 1
            goto L1c
        L2a:
            return
    }

    public LuaTable(luaj.LuaValue[] r7, luaj.LuaValue[] r8, luaj.Varargs r9) {
            r6 = this;
            r6.<init>()
            r0 = 0
            if (r7 == 0) goto L8
            int r1 = r7.length
            goto L9
        L8:
            r1 = 0
        L9:
            if (r8 == 0) goto Ld
            int r2 = r8.length
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r9 == 0) goto L15
            int r3 = r9.U()
            goto L16
        L15:
            r3 = 0
        L16:
            int r3 = r3 + r2
            int r4 = r1 >> 1
            r6.w3(r3, r4)
            r3 = 0
        L1d:
            if (r3 >= r2) goto L28
            int r4 = r3 + 1
            r3 = r8[r3]
            r6.Y1(r4, r3)
            r3 = r4
            goto L1d
        L28:
            if (r9 == 0) goto L3d
            int r8 = r9.U()
            r3 = 1
        L2f:
            if (r3 > r8) goto L3d
            int r4 = r2 + r3
            luaj.LuaValue r5 = r9.v(r3)
            r6.Y1(r4, r5)
            int r3 = r3 + 1
            goto L2f
        L3d:
            if (r0 >= r1) goto L53
            int r8 = r0 + 1
            r9 = r7[r8]
            boolean r9 = r9.l1()
            if (r9 != 0) goto L50
            r9 = r7[r0]
            r8 = r7[r8]
            r6.d2(r9, r8)
        L50:
            int r0 = r0 + 2
            goto L3d
        L53:
            return
    }

    private static luaj.LuaValue[] A3(luaj.LuaValue[] r2, int r3) {
            luaj.LuaValue[] r3 = new luaj.LuaValue[r3]
            int r0 = r2.length
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r3, r1, r0)
            return r3
    }

    private void B3(int r4, int r5, luaj.LuaValue r6) {
            r3 = this;
        L0:
            int r0 = r4 * 2
            if (r0 > r5) goto L25
            if (r0 >= r5) goto Lf
            int r1 = r0 + 1
            boolean r2 = r3.V2(r0, r1, r6)
            if (r2 == 0) goto Lf
            r0 = r1
        Lf:
            boolean r1 = r3.V2(r4, r0, r6)
            if (r1 == 0) goto L25
            luaj.LuaValue r1 = r3.c3(r4)
            luaj.LuaValue r2 = r3.c3(r0)
            r3.e2(r4, r2)
            r3.e2(r0, r1)
            r4 = r0
            goto L0
        L25:
            return
    }

    private luaj.LuaTable.n C3(luaj.LuaValue r3) {
            r2 = this;
            int r0 = r2.R
            if (r0 <= 0) goto L1a
            luaj.LuaTable$m[] r0 = r2.Q
            int r1 = r2.i3(r3)
            r0 = r0[r1]
        Lc:
            if (r0 == 0) goto L1a
            luaj.LuaTable$n r1 = r0.f(r3)
            if (r1 == 0) goto L15
            return r1
        L15:
            luaj.LuaTable$m r0 = r0.a()
            goto Lc
        L1a:
            r3 = 0
            return r3
    }

    static /* synthetic */ luaj.LuaValue[] S2(luaj.LuaTable r0) {
            luaj.LuaValue[] r0 = r0.P
            return r0
    }

    static /* synthetic */ luaj.LuaTable.m[] T2(luaj.LuaTable r0) {
            luaj.LuaTable$m[] r0 = r0.Q
            return r0
    }

    private boolean U2(int r4, luaj.LuaValue r5) {
            r3 = this;
            if (r4 <= 0) goto L1c
            luaj.LuaValue[] r0 = r3.P
            int r1 = r0.length
            if (r4 > r1) goto L1c
            r1 = 1
            int r4 = r4 - r1
            boolean r2 = r5.l1()
            if (r2 == 0) goto L11
            r5 = 0
            goto L19
        L11:
            luaj.e r2 = r3.S
            if (r2 == 0) goto L19
            luaj.LuaValue r5 = r2.g(r5)
        L19:
            r0[r4] = r5
            return r1
        L1c:
            r4 = 0
            return r4
    }

    private boolean V2(int r1, int r2, luaj.LuaValue r3) {
            r0 = this;
            luaj.LuaValue r1 = r0.c3(r1)
            luaj.LuaValue r2 = r0.c3(r2)
            if (r1 == 0) goto L1d
            if (r2 != 0) goto Ld
            goto L1d
        Ld:
            if (r3 == 0) goto L18
            luaj.LuaValue r1 = r3.call(r1, r2)
            boolean r1 = r1.w2()
            return r1
        L18:
            boolean r1 = r1.u1(r2)
            return r1
        L1d:
            r1 = 0
            return r1
    }

    private int X2() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            luaj.LuaTable$m[] r2 = r4.Q
            int r3 = r2.length
            if (r0 >= r3) goto L1b
            r2 = r2[r0]
        L9:
            if (r2 == 0) goto L18
            luaj.LuaTable$n r3 = r2.l()
            if (r3 == 0) goto L13
            int r1 = r1 + 1
        L13:
            luaj.LuaTable$m r2 = r2.a()
            goto L9
        L18:
            int r0 = r0 + 1
            goto L2
        L1b:
            return r1
    }

    private int Y2(int[] r10) {
            r9 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            r3 = 1
            r4 = 0
        L5:
            r5 = 31
            if (r2 >= r5) goto L2d
            luaj.LuaValue[] r5 = r9.P
            int r6 = r5.length
            if (r3 <= r6) goto Lf
            goto L2d
        Lf:
            int r5 = r5.length
            int r6 = r1 << r2
            int r5 = java.lang.Math.min(r5, r6)
            r6 = 0
        L17:
            if (r3 > r5) goto L27
            luaj.LuaValue[] r7 = r9.P
            int r8 = r3 + 1
            int r3 = r3 + (-1)
            r3 = r7[r3]
            if (r3 == 0) goto L25
            int r6 = r6 + 1
        L25:
            r3 = r8
            goto L17
        L27:
            r10[r2] = r6
            int r4 = r4 + r6
            int r2 = r2 + 1
            goto L5
        L2d:
            luaj.LuaTable$m[] r2 = r9.Q
            int r3 = r2.length
            if (r0 >= r3) goto L52
            r2 = r2[r0]
        L34:
            if (r2 == 0) goto L4f
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r2.r(r3)
            if (r3 <= 0) goto L4a
            int r3 = u3(r3)
            r5 = r10[r3]
            int r5 = r5 + r1
            r10[r3] = r5
            int r4 = r4 + 1
        L4a:
            luaj.LuaTable$m r2 = r2.a()
            goto L34
        L4f:
            int r0 = r0 + 1
            goto L2d
        L52:
            return r4
    }

    protected static luaj.LuaTable.e Z2(luaj.LuaValue r5, luaj.LuaValue r6) {
            boolean r0 = r5.i1()
            if (r0 == 0) goto L10
            luaj.LuaTable$g r0 = new luaj.LuaTable$g
            int r5 = r5.y2()
            r0.<init>(r5, r6)
            return r0
        L10:
            boolean r0 = r6 instanceof luaj.LuaBoolean
            if (r0 == 0) goto L1e
            luaj.LuaTable$b r0 = new luaj.LuaTable$b
            boolean r6 = r6.w2()
            r0.<init>(r5, r6)
            return r0
        L1e:
            boolean r0 = r6 instanceof luaj.LuaLong
            if (r0 == 0) goto L38
            long r0 = r6.z2()
            int r6 = (int) r0
            long r2 = (long) r6
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L32
            luaj.LuaTable$h r0 = new luaj.LuaTable$h
            r0.<init>(r5, r6)
            return r0
        L32:
            luaj.LuaTable$k r6 = new luaj.LuaTable$k
            r6.<init>(r5, r0)
            return r6
        L38:
            boolean r0 = r6 instanceof luaj.LuaDouble
            if (r0 == 0) goto L52
            double r0 = r6.x2()
            float r6 = (float) r0
            double r2 = (double) r6
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L4c
            luaj.LuaTable$f r0 = new luaj.LuaTable$f
            r0.<init>(r5, r6)
            return r0
        L4c:
            luaj.LuaTable$d r6 = new luaj.LuaTable$d
            r6.<init>(r5, r0)
            return r6
        L52:
            luaj.LuaTable$l r0 = new luaj.LuaTable$l
            r0.<init>(r5, r6)
            return r0
    }

    private void a3() {
            r3 = this;
            r0 = 0
        L1:
            luaj.LuaValue[] r1 = r3.P
            int r2 = r1.length
            if (r0 >= r2) goto Le
            luaj.e r2 = r3.S
            r2.o(r1, r0)
            int r0 = r0 + 1
            goto L1
        Le:
            return
    }

    private java.lang.Appendable b3(java.lang.String r28, java.lang.Appendable r29, java.util.Map r30) {
            r27 = this;
            r1 = r28
            r2 = r29
            r0 = r30
            java.util.Set r3 = luaj.LuaTable.V
            r4 = r27
            if (r3 == 0) goto Lf
            r3.add(r4)
        Lf:
            java.lang.String r5 = "{ -- "
            r2.append(r5)
            java.lang.String r5 = r27.E2()
            r2.append(r5)
            java.lang.String r5 = "("
            r2.append(r5)
            int r5 = r27.hashCode()
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            r2.append(r5)
            java.lang.String r5 = ")\n"
            r2.append(r5)
            int r6 = r27.s1()
            int r7 = luaj.LuaTable.W
            int r7 = r7 + r6
            luaj.LuaTable.W = r7
            r8 = 1
            if (r6 != 0) goto L3e
            r9 = 1
            goto L55
        L3e:
            int r9 = java.lang.Math.abs(r6)
            double r9 = (double) r9
            double r9 = java.lang.Math.log10(r9)
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r9 = r9 + r11
            r13 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r9 = java.lang.Math.min(r13, r9)
            double r9 = java.lang.Math.max(r11, r9)
            int r9 = (int) r9
        L55:
            luaj.LuaTable$i r10 = r27.s3()
            int r11 = r28.length()
            if (r11 <= 0) goto L61
            r11 = 1
            goto L62
        L61:
            r11 = 0
        L62:
            int r13 = r28.length()
            if (r13 != r8) goto L6a
            r13 = 1
            goto L6b
        L6a:
            r13 = 0
        L6b:
            r14 = 10000(0x2710, float:1.4013E-41)
            if (r7 >= r14) goto L71
            r7 = 1
            goto L72
        L71:
            r7 = 0
        L72:
            r12 = 1
            r15 = 0
            r16 = 1
            r17 = 0
        L78:
            boolean r18 = r10.c()
            if (r18 == 0) goto L2da
            luaj.LuaValue r14 = r10.b()
            if (r13 == 0) goto L8d
            if (r0 == 0) goto L8d
            java.lang.Object r19 = r0.get(r14)
            if (r19 != 0) goto L8d
            goto L78
        L8d:
            if (r7 == 0) goto La7
            if (r16 == 0) goto La7
            boolean r19 = r14.i1()
            if (r19 == 0) goto La5
            int r8 = r14.y2()
            int r20 = r12 + 1
            if (r8 == r12) goto La2
            r12 = r20
            goto La5
        La2:
            r12 = r20
            goto La7
        La5:
            r16 = 0
        La7:
            boolean r8 = r14.d1()
            if (r8 == 0) goto Lae
            goto Lb8
        Lae:
            luaj.LuaValue r8 = r10.d()
            boolean r20 = r8.d1()
            if (r20 == 0) goto Lba
        Lb8:
            r8 = 1
            goto L78
        Lba:
            if (r16 == 0) goto Lbe
            r4 = r2
            goto Lc5
        Lbe:
            java.lang.StringBuilder r20 = new java.lang.StringBuilder
            r20.<init>()
            r4 = r20
        Lc5:
            if (r11 == 0) goto Lca
            r4.append(r1)
        Lca:
            r20 = r7
            java.lang.String r7 = "\t["
            r4.append(r7)
            boolean r7 = r14.i1()
            r21 = r10
            java.lang.String r10 = "\\'"
            r22 = r13
            java.lang.String r13 = "'"
            java.lang.String r2 = "\t}"
            r23 = r6
            java.lang.String r6 = "\t\t-- *** RECURSION ***\n"
            r24 = r12
            java.lang.String r12 = "{ -- table("
            r25 = r15
            if (r7 == 0) goto Lf9
            int r7 = r14.y2()
            java.lang.String r7 = java.lang.Integer.toString(r7)
            r15 = 32
            android.ext.t2.a(r4, r9, r15, r7)
            goto L129
        Lf9:
            if (r3 == 0) goto L14e
            boolean r7 = r14 instanceof luaj.LuaTable
            if (r7 == 0) goto L14e
            r7 = r14
            luaj.LuaTable r7 = (luaj.LuaTable) r7
            boolean r15 = r3.contains(r7)
            if (r15 == 0) goto L12c
            r4.append(r12)
            int r7 = r7.hashCode()
            java.lang.String r7 = java.lang.Integer.toHexString(r7)
            r4.append(r7)
            r4.append(r5)
            if (r11 == 0) goto L11e
            r4.append(r1)
        L11e:
            r4.append(r6)
            if (r11 == 0) goto L126
            r4.append(r1)
        L126:
            r4.append(r2)
        L129:
            r26 = r9
            goto L14c
        L12c:
            if (r17 != 0) goto L144
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r1)
            r26 = r9
            r9 = 9
            r15.append(r9)
            java.lang.String r17 = r15.toString()
        L141:
            r9 = r17
            goto L147
        L144:
            r26 = r9
            goto L141
        L147:
            r7.b3(r9, r4, r0)
            r17 = r9
        L14c:
            r9 = 0
            goto L176
        L14e:
            r26 = r9
            boolean r7 = r14 instanceof luaj.LuaString
            if (r7 == 0) goto L16e
            r7 = 39
            r4.append(r7)
            java.lang.String r9 = r14.g0()
            int r15 = r9.indexOf(r7)
            if (r15 < 0) goto L167
            java.lang.String r9 = r9.replace(r13, r10)
        L167:
            r4.append(r9)
            r4.append(r7)
            goto L176
        L16e:
            java.lang.String r7 = r14.g0()
            r4.append(r7)
            goto L14c
        L176:
            java.lang.String r7 = "] = "
            r4.append(r7)
            r7 = 44
            if (r3 == 0) goto L1ce
            boolean r15 = r8 instanceof luaj.LuaTable
            if (r15 == 0) goto L1ce
            luaj.LuaTable r8 = (luaj.LuaTable) r8
            boolean r9 = r3.contains(r8)
            if (r9 == 0) goto L1ad
            r4.append(r12)
            int r8 = r8.hashCode()
            java.lang.String r8 = java.lang.Integer.toHexString(r8)
            r4.append(r8)
            r4.append(r5)
            if (r11 == 0) goto L1a1
            r4.append(r1)
        L1a1:
            r4.append(r6)
            if (r11 == 0) goto L1a9
            r4.append(r1)
        L1a9:
            r4.append(r2)
            goto L1c7
        L1ad:
            if (r17 != 0) goto L1c0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r6 = 9
            r2.append(r6)
            java.lang.String r17 = r2.toString()
        L1c0:
            r2 = r17
            r8.b3(r2, r4, r0)
            r17 = r2
        L1c7:
            r4.append(r7)
            r2 = 0
            r9 = 1
            goto L298
        L1ce:
            boolean r2 = r8 instanceof luaj.LuaString
            if (r2 == 0) goto L1f0
            r2 = 39
            r4.append(r2)
            java.lang.String r6 = r8.g0()
            int r2 = r6.indexOf(r2)
            if (r2 < 0) goto L1e5
            java.lang.String r6 = r6.replace(r13, r10)
        L1e5:
            r4.append(r6)
            java.lang.String r2 = "',"
            r4.append(r2)
            r9 = 1
            goto L297
        L1f0:
            boolean r2 = r8 instanceof luaj.LuaLong
            if (r2 == 0) goto L288
            if (r9 == 0) goto L1fc
            boolean r2 = r14 instanceof luaj.LuaString
            if (r2 == 0) goto L1fc
            r2 = 1
            goto L1fd
        L1fc:
            r2 = 0
        L1fd:
            if (r2 == 0) goto L21a
            java.lang.String r6 = "address"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L21a
            java.lang.String r2 = "0x"
            r4.append(r2)
            long r8 = r8.z2()
            java.lang.String r2 = java.lang.Long.toHexString(r8)
            r4.append(r2)
        L217:
            r9 = 1
            goto L283
        L21a:
            java.lang.String r6 = r8.g0()
            r4.append(r6)
            if (r2 == 0) goto L217
            java.lang.String r2 = "flags"
            boolean r2 = r9.equals(r2)
            r6 = 2
            if (r2 == 0) goto L260
            int r2 = r8.y2()
            r8 = 1
            if (r2 == r8) goto L25c
            if (r2 == r6) goto L259
            r6 = 4
            if (r2 == r6) goto L256
            r6 = 8
            if (r2 == r6) goto L253
            r6 = 16
            if (r2 == r6) goto L250
            r6 = 32
            if (r2 == r6) goto L24d
            r6 = 64
            if (r2 == r6) goto L24a
            r2 = 0
            goto L25e
        L24a:
            java.lang.String r2 = "gg.TYPE_DOUBLE"
            goto L25e
        L24d:
            java.lang.String r2 = "gg.TYPE_QWORD"
            goto L25e
        L250:
            java.lang.String r2 = "gg.TYPE_FLOAT"
            goto L25e
        L253:
            java.lang.String r2 = "gg.TYPE_XOR"
            goto L25e
        L256:
            java.lang.String r2 = "gg.TYPE_DWORD"
            goto L25e
        L259:
            java.lang.String r2 = "gg.TYPE_WORD"
            goto L25e
        L25c:
            java.lang.String r2 = "gg.TYPE_BYTE"
        L25e:
            r9 = 1
            goto L284
        L260:
            java.lang.String r2 = "freezeType"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L217
            int r2 = r8.y2()
            r9 = 1
            if (r2 == 0) goto L280
            if (r2 == r9) goto L27d
            if (r2 == r6) goto L27a
            r6 = 3
            if (r2 == r6) goto L277
            goto L283
        L277:
            java.lang.String r2 = "gg.FREEZE_IN_RANGE"
            goto L284
        L27a:
            java.lang.String r2 = "gg.FREEZE_MAY_DECREASE"
            goto L284
        L27d:
            java.lang.String r2 = "gg.FREEZE_MAY_INCREASE"
            goto L284
        L280:
            java.lang.String r2 = "gg.FREEZE_NORMAL"
            goto L284
        L283:
            r2 = 0
        L284:
            r4.append(r7)
            goto L298
        L288:
            r9 = 1
            java.lang.String r2 = r8.g0()
            r4.append(r2)
            boolean r2 = r8 instanceof android.ext.Script.ApiFunction
            if (r2 != 0) goto L297
            r4.append(r7)
        L297:
            r2 = 0
        L298:
            if (r2 == 0) goto L2a2
            java.lang.String r6 = " -- "
            r4.append(r6)
            r4.append(r2)
        L2a2:
            r2 = 10
            r4.append(r2)
            if (r16 != 0) goto L2c6
            if (r25 != 0) goto L2bc
            int r12 = r24 + (-1)
            int r6 = r23 - r12
            java.util.ArrayList r2 = new java.util.ArrayList
            if (r6 >= 0) goto L2b8
            r2.<init>()
        L2b6:
            r15 = r2
            goto L2be
        L2b8:
            r2.<init>(r6)
            goto L2b6
        L2bc:
            r15 = r25
        L2be:
            java.lang.String r2 = r4.toString()
            r15.add(r2)
            goto L2c8
        L2c6:
            r15 = r25
        L2c8:
            r4 = r27
            r2 = r29
            r7 = r20
            r10 = r21
            r13 = r22
            r6 = r23
            r12 = r24
            r9 = r26
            goto Lb8
        L2da:
            r25 = r15
            if (r25 == 0) goto L2fd
            java.util.Collections.sort(r25)     // Catch: java.lang.Throwable -> L2e2
            goto L2e7
        L2e2:
            r0 = move-exception
            r2 = r0
            android.ext.e1.a(r2)
        L2e7:
            java.util.Iterator r0 = r25.iterator()
        L2eb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2fd
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            r3 = r29
            r3.append(r2)
            goto L2eb
        L2fd:
            r3 = r29
            if (r11 == 0) goto L304
            r3.append(r1)
        L304:
            r0 = 125(0x7d, float:1.75E-43)
            r3.append(r0)
            return r3
    }

    private void h3(luaj.LuaValue r4) {
            r3 = this;
            luaj.LuaTable$m[] r0 = r3.Q
            int r0 = r0.length
            if (r0 <= 0) goto L2b
            int r0 = r3.i3(r4)
            luaj.LuaTable$m[] r1 = r3.Q
            r1 = r1[r0]
        Ld:
            if (r1 == 0) goto L2b
            luaj.LuaTable$n r2 = r1.f(r4)
            if (r2 == 0) goto L26
            luaj.LuaTable$m[] r4 = r3.Q
            r1 = r4[r0]
            luaj.LuaTable$m r1 = r1.h(r2)
            r4[r0] = r1
            int r4 = r3.R
            int r4 = r4 + (-1)
            r3.R = r4
            return
        L26:
            luaj.LuaTable$m r1 = r1.a()
            goto Ld
        L2b:
            return
    }

    private int i3(luaj.LuaValue r2) {
            r1 = this;
            int r2 = r2.hashCode()
            luaj.LuaTable$m[] r0 = r1.Q
            int r0 = r0.length
            int r0 = r0 + (-1)
            r2 = r2 & r0
            return r2
    }

    public static int j3(luaj.LuaValue r0, int r1) {
            int r0 = r0.hashCode()
            r0 = r0 & r1
            return r0
    }

    public static int l3(int r0, int r1) {
            r0 = r0 & r1
            return r0
    }

    private void n3(int r4, luaj.LuaValue r5) {
            r3 = this;
            r3.o3(r4, r5)
        L3:
            r0 = 1
            if (r4 <= r0) goto L1a
            luaj.LuaValue r1 = r3.c3(r4)
            luaj.LuaValue r2 = r3.c3(r0)
            r3.e2(r4, r2)
            r3.e2(r0, r1)
            int r4 = r4 + (-1)
            r3.B3(r0, r4, r5)
            goto L3
        L1a:
            return
    }

    private void o3(int r2, luaj.LuaValue r3) {
            r1 = this;
            int r0 = r2 / 2
        L2:
            if (r0 <= 0) goto La
            r1.B3(r0, r2, r3)
            int r0 = r0 + (-1)
            goto L2
        La:
            return
    }

    protected static boolean r3(luaj.LuaValue r4) {
            int r0 = r4.C2()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L18
            r3 = 3
            if (r0 == r3) goto L18
            r3 = 4
            if (r0 == r3) goto Lf
            return r2
        Lf:
            int r4 = r4.W1()
            r0 = 32
            if (r4 <= r0) goto L18
            r1 = 1
        L18:
            return r1
    }

    static int u3(int r3) {
            int r3 = r3 + (-1)
            if (r3 >= 0) goto L7
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            return r3
        L7:
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r3
            r1 = 0
            if (r0 == 0) goto L12
            int r3 = r3 >>> 16
            r0 = 16
            goto L13
        L12:
            r0 = 0
        L13:
            r2 = 65280(0xff00, float:9.1477E-41)
            r2 = r2 & r3
            if (r2 == 0) goto L1d
            int r0 = r0 + 8
            int r3 = r3 >>> 8
        L1d:
            r2 = r3 & 240(0xf0, float:3.36E-43)
            if (r2 == 0) goto L25
            int r0 = r0 + 4
            int r3 = r3 >>> 4
        L25:
            switch(r3) {
                case 0: goto L35;
                case 1: goto L32;
                case 2: goto L2f;
                case 3: goto L2f;
                case 4: goto L2c;
                case 5: goto L2c;
                case 6: goto L2c;
                case 7: goto L2c;
                case 8: goto L29;
                case 9: goto L29;
                case 10: goto L29;
                case 11: goto L29;
                case 12: goto L29;
                case 13: goto L29;
                case 14: goto L29;
                case 15: goto L29;
                default: goto L28;
            }
        L28:
            goto L34
        L29:
            int r0 = r0 + 4
            goto L34
        L2c:
            int r0 = r0 + 3
            goto L34
        L2f:
            int r0 = r0 + 2
            goto L34
        L32:
            int r0 = r0 + 1
        L34:
            return r0
        L35:
            return r1
    }

    private void y3(int r13) {
            r12 = this;
            luaj.e r0 = r12.S
            if (r0 == 0) goto L23
            boolean r0 = r0.q()
            if (r0 != 0) goto L12
            luaj.e r0 = r12.S
            boolean r0 = r0.p()
            if (r0 == 0) goto L23
        L12:
            int r0 = r12.X2()
            r12.R = r0
            luaj.e r0 = r12.S
            boolean r0 = r0.p()
            if (r0 == 0) goto L23
            r12.a3()
        L23:
            r0 = 32
            int[] r1 = new int[r0]
            int r2 = r12.Y2(r1)
            r3 = 1
            if (r13 <= 0) goto L39
            int r2 = r2 + 1
            int r4 = u3(r13)
            r5 = r1[r4]
            int r5 = r5 + r3
            r1[r4] = r5
        L39:
            r4 = 0
            r5 = r1[r4]
            r6 = 1
            r7 = 0
        L3e:
            r8 = 2
            if (r6 >= r0) goto L55
            r9 = r1[r6]
            int r5 = r5 + r9
            int r9 = r2 * 2
            int r10 = r3 << r6
            if (r9 >= r10) goto L4b
            goto L55
        L4b:
            int r8 = r6 + (-1)
            int r8 = r3 << r8
            if (r5 < r8) goto L52
            r7 = r10
        L52:
            int r6 = r6 + 1
            goto L3e
        L55:
            luaj.LuaValue[] r0 = r12.P
            luaj.LuaTable$m[] r2 = r12.Q
            if (r13 <= 0) goto L5f
            if (r13 > r7) goto L5f
            r5 = -1
            goto L60
        L5f:
            r5 = 0
        L60:
            int r6 = r0.length
            if (r7 == r6) goto L9b
            luaj.LuaValue[] r6 = new luaj.LuaValue[r7]
            int r9 = r0.length
            if (r7 <= r9) goto L7b
            int r9 = r0.length
            int r9 = r9 + r3
            int r9 = u3(r9)
            int r10 = u3(r7)
            int r10 = r10 + r3
        L73:
            if (r9 >= r10) goto L92
            r11 = r1[r9]
            int r5 = r5 + r11
            int r9 = r9 + 1
            goto L73
        L7b:
            int r9 = r0.length
            if (r9 <= r7) goto L92
            int r9 = r7 + 1
            int r9 = u3(r9)
            int r10 = r0.length
            int r10 = u3(r10)
            int r10 = r10 + r3
        L8a:
            if (r9 >= r10) goto L92
            r11 = r1[r9]
            int r5 = r5 - r11
            int r9 = r9 + 1
            goto L8a
        L92:
            int r1 = r0.length
            int r1 = java.lang.Math.min(r1, r7)
            java.lang.System.arraycopy(r0, r4, r6, r4, r1)
            goto L9c
        L9b:
            r6 = r0
        L9c:
            int r1 = r12.R
            int r1 = r1 - r5
            if (r13 < 0) goto La6
            if (r13 <= r7) goto La4
            goto La6
        La4:
            r13 = 0
            goto La7
        La6:
            r13 = 1
        La7:
            int r1 = r1 + r13
            int r13 = r2.length
            if (r1 <= 0) goto Lb9
            if (r1 >= r8) goto Lae
            goto Lb4
        Lae:
            int r1 = u3(r1)
            int r8 = r3 << r1
        Lb4:
            int r1 = r8 + (-1)
            luaj.LuaTable$m[] r3 = new luaj.LuaTable.m[r8]
            goto Lbc
        Lb9:
            luaj.LuaTable$m[] r3 = luaj.LuaTable.U
            r1 = 0
        Lbc:
            if (r4 >= r13) goto Lef
            r8 = r2[r4]
        Lc0:
            if (r8 == 0) goto Lec
            int r9 = r8.r(r7)
            if (r9 <= 0) goto Ld7
            luaj.LuaTable$n r10 = r8.l()
            if (r10 == 0) goto Le7
            int r9 = r9 + (-1)
            luaj.LuaValue r10 = r10.t()
            r6[r9] = r10
            goto Le7
        Ld7:
            boolean r9 = r8 instanceof luaj.LuaTable.c
            if (r9 != 0) goto Le7
            int r9 = r8.b(r1)
            r10 = r3[r9]
            luaj.LuaTable$m r10 = r8.n(r10)
            r3[r9] = r10
        Le7:
            luaj.LuaTable$m r8 = r8.a()
            goto Lc0
        Lec:
            int r4 = r4 + 1
            goto Lbc
        Lef:
            int r13 = r0.length
            if (r7 >= r13) goto L120
            int r13 = r7 + 1
            r2 = r0[r7]
            if (r2 == 0) goto L11e
            long r7 = (long) r13
            int r4 = luaj.LuaLong.V2(r7)
            int r4 = l3(r4, r1)
            luaj.e r9 = r12.S
            luaj.LuaLong r7 = luaj.LuaValue.I2(r7)
            if (r9 == 0) goto L110
            luaj.LuaTable$m r2 = r9.k(r7, r2)
            if (r2 != 0) goto L114
            goto L11e
        L110:
            luaj.LuaTable$e r2 = Z2(r7, r2)
        L114:
            r7 = r3[r4]
            if (r7 == 0) goto L11c
            luaj.LuaTable$m r2 = r7.d(r2)
        L11c:
            r3[r4] = r2
        L11e:
            r7 = r13
            goto Lef
        L120:
            r12.Q = r3
            r12.P = r6
            int r13 = r12.R
            int r13 = r13 - r5
            r12.R = r13
            return
    }

    @Override // luaj.LuaValue
    public int C2() {
            r1 = this;
            r0 = 5
            return r0
    }

    @Override // luaj.LuaValue
    public java.lang.String D2() {
            r1 = this;
            java.lang.String r0 = "table"
            return r0
    }

    public void D3(luaj.LuaValue r5) {
            r4 = this;
            int r0 = r4.s1()
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            if (r0 >= r1) goto L24
            luaj.e r1 = r4.S
            if (r1 == 0) goto L16
            boolean r1 = r1.p()
            if (r1 == 0) goto L16
            r4.a3()
        L16:
            r1 = 1
            if (r0 <= r1) goto L23
            boolean r1 = r5.l1()
            if (r1 == 0) goto L20
            r5 = 0
        L20:
            r4.n3(r0, r5)
        L23:
            return
        L24:
            luaj.d r5 = new luaj.d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "array too big: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " >= "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r5.<init>(r0)
            throw r5
    }

    public java.lang.String E3(java.lang.Appendable r3, java.util.Map r4) {
            r2 = this;
            java.util.Set r0 = luaj.LuaTable.V
            java.lang.String r1 = ""
            if (r0 != 0) goto L1e
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            luaj.LuaTable.V = r0
            r0 = 0
            luaj.LuaTable.W = r0
            java.lang.Appendable r3 = r2.b3(r1, r3, r4)
            java.lang.String r3 = r3.toString()
            luaj.LuaTable.W = r0
            r4 = 0
            luaj.LuaTable.V = r4
            return r3
        L1e:
            java.lang.Appendable r3 = r2.b3(r1, r3, r4)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public luaj.Varargs F3(long r9, long r11) {
            r8 = this;
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 >= 0) goto L7
            luaj.LuaValue r9 = luaj.LuaValue.f1674f
            return r9
        L7:
            long r0 = r11 - r9
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto Lda
            r2 = 16777215(0xffffff, double:8.2890456E-317)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lb6
            r2 = 1
            long r0 = r0 + r2
            int r1 = (int) r0
            int r0 = (int) r9
            long r4 = (long) r0
            r6 = 1
            int r7 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r7 != 0) goto L29
            int r4 = (int) r11
            long r4 = (long) r4
            int r7 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r7 != 0) goto L29
            r11 = 1
            goto L2a
        L29:
            r11 = 0
        L2a:
            if (r1 > 0) goto L2f
            luaj.LuaValue r9 = luaj.LuaValue.f1674f
            return r9
        L2f:
            if (r1 != r6) goto L41
            if (r11 == 0) goto L38
            luaj.LuaValue r9 = r8.c3(r0)
            goto L40
        L38:
            luaj.LuaLong r9 = luaj.LuaLong.I2(r9)
            luaj.LuaValue r9 = r8.U0(r9)
        L40:
            return r9
        L41:
            r12 = 2
            if (r1 != r12) goto L69
            if (r11 == 0) goto L4b
            luaj.LuaValue r12 = r8.c3(r0)
            goto L53
        L4b:
            luaj.LuaLong r12 = luaj.LuaLong.I2(r9)
            luaj.LuaValue r12 = r8.U0(r12)
        L53:
            long r9 = r9 + r2
            if (r11 == 0) goto L5c
            int r10 = (int) r9
            luaj.LuaValue r9 = r8.c3(r10)
            goto L64
        L5c:
            luaj.LuaLong r9 = luaj.LuaLong.I2(r9)
            luaj.LuaValue r9 = r8.U0(r9)
        L64:
            luaj.Varargs r9 = luaj.LuaValue.N2(r12, r9)
            return r9
        L69:
            luaj.LuaValue[] r12 = new luaj.LuaValue[r1]     // Catch: java.lang.OutOfMemoryError -> L79
        L6b:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L86
            long r2 = (long) r1     // Catch: java.lang.OutOfMemoryError -> L79
            long r2 = r2 + r9
            if (r11 == 0) goto L7b
            int r0 = (int) r2     // Catch: java.lang.OutOfMemoryError -> L79
            luaj.LuaValue r0 = r8.c3(r0)     // Catch: java.lang.OutOfMemoryError -> L79
            goto L83
        L79:
            r9 = move-exception
            goto L8b
        L7b:
            luaj.LuaLong r0 = luaj.LuaLong.I2(r2)     // Catch: java.lang.OutOfMemoryError -> L79
            luaj.LuaValue r0 = r8.U0(r0)     // Catch: java.lang.OutOfMemoryError -> L79
        L83:
            r12[r1] = r0     // Catch: java.lang.OutOfMemoryError -> L79
            goto L6b
        L86:
            luaj.Varargs r9 = luaj.LuaValue.O2(r12)     // Catch: java.lang.OutOfMemoryError -> L79
            return r9
        L8b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "OOM on unpack: "
            r10.append(r11)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            android.ext.e1.l(r10, r9)
            luaj.d r9 = new luaj.d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "too many results to unpack [out of memory]: "
            r10.append(r11)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        Lb6:
            luaj.d r9 = new luaj.d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "too many results to unpack: "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r11 = " (max is "
            r10.append(r11)
            r10.append(r2)
            r11 = 41
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        Lda:
            luaj.d r9 = new luaj.d
            java.lang.String r10 = "too many results to unpack: greater 9223372036854775807"
            r9.<init>(r10)
            throw r9
    }

    public void G3(int r6, luaj.LuaString r7, double r8) {
            r5 = this;
            luaj.LuaTable$m[] r0 = r5.Q
            float r1 = (float) r8
            double r2 = (double) r1
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 != 0) goto Le
            luaj.LuaTable$f r8 = new luaj.LuaTable$f
            r8.<init>(r7, r1)
            goto L14
        Le:
            luaj.LuaTable$d r1 = new luaj.LuaTable$d
            r1.<init>(r7, r8)
            r8 = r1
        L14:
            r7 = r0[r6]
            if (r7 == 0) goto L1c
            luaj.LuaTable$m r8 = r7.d(r8)
        L1c:
            r0[r6] = r8
            int r6 = r5.R
            int r6 = r6 + 1
            r5.R = r6
            return
    }

    @Override // luaj.LuaValue
    public luaj.LuaTable H0() {
            r0 = this;
            return r0
    }

    public void H3(int r3, luaj.LuaString r4, float r5) {
            r2 = this;
            luaj.LuaTable$m[] r0 = r2.Q
            luaj.LuaTable$f r1 = new luaj.LuaTable$f
            r1.<init>(r4, r5)
            r4 = r0[r3]
            if (r4 == 0) goto Lf
            luaj.LuaTable$m r1 = r4.d(r1)
        Lf:
            r0[r3] = r1
            int r3 = r2.R
            int r3 = r3 + 1
            r2.R = r3
            return
    }

    public void I3(int r3, luaj.LuaString r4, int r5) {
            r2 = this;
            luaj.LuaTable$m[] r0 = r2.Q
            luaj.LuaTable$h r1 = new luaj.LuaTable$h
            r1.<init>(r4, r5)
            r4 = r0[r3]
            if (r4 == 0) goto Lf
            luaj.LuaTable$m r1 = r4.d(r1)
        Lf:
            r0[r3] = r1
            int r3 = r2.R
            int r3 = r3 + 1
            r2.R = r3
            return
    }

    public void J3(int r6, luaj.LuaString r7, long r8) {
            r5 = this;
            luaj.LuaTable$m[] r0 = r5.Q
            int r1 = (int) r8
            long r2 = (long) r1
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 != 0) goto Le
            luaj.LuaTable$h r8 = new luaj.LuaTable$h
            r8.<init>(r7, r1)
            goto L14
        Le:
            luaj.LuaTable$k r1 = new luaj.LuaTable$k
            r1.<init>(r7, r8)
            r8 = r1
        L14:
            r7 = r0[r6]
            if (r7 == 0) goto L1c
            luaj.LuaTable$m r8 = r7.d(r8)
        L1c:
            r0[r6] = r8
            int r6 = r5.R
            int r6 = r6 + 1
            r5.R = r6
            return
    }

    public void K3(int r3, luaj.LuaString r4, boolean r5) {
            r2 = this;
            luaj.LuaTable$m[] r0 = r2.Q
            luaj.LuaTable$b r1 = new luaj.LuaTable$b
            r1.<init>(r4, r5)
            r4 = r0[r3]
            if (r4 == 0) goto Lf
            luaj.LuaTable$m r1 = r4.d(r1)
        Lf:
            r0[r3] = r1
            int r3 = r2.R
            int r3 = r3 + 1
            r2.R = r3
            return
    }

    @Override // luaj.LuaValue
    public luaj.LuaTable L1(luaj.LuaTable r1) {
            r0 = this;
            return r0
    }

    @Override // luaj.LuaValue
    public boolean P0(luaj.LuaValue r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2.o1()
            if (r0 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            boolean r2 = luaj.LuaValue.Q0(r1, r2)
            return r2
    }

    @Override // luaj.LuaValue
    public void R1(int r3) {
            r2 = this;
            luaj.LuaValue[] r0 = r2.P
            int r1 = r0.length
            if (r3 <= r1) goto L12
            r1 = 1
            int r3 = u3(r3)
            int r3 = r1 << r3
            luaj.LuaValue[] r3 = A3(r0, r3)
            r2.P = r3
        L12:
            return
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue U0(luaj.LuaValue r3) {
            r2 = this;
            luaj.LuaValue r0 = r2.V1(r3)
            boolean r1 = r0.l1()
            if (r1 == 0) goto L12
            luaj.e r1 = r2.S
            if (r1 == 0) goto L12
            luaj.LuaValue r0 = luaj.LuaValue.W0(r2, r3)
        L12:
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue V0() {
            r1 = this;
            luaj.e r0 = r1.S
            if (r0 == 0) goto L9
            luaj.LuaValue r0 = r0.e()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue V1(luaj.LuaValue r4) {
            r3 = this;
            boolean r0 = r4.i1()
            if (r0 == 0) goto L24
            int r0 = r4.y2()
            if (r0 <= 0) goto L24
            luaj.LuaValue[] r1 = r3.P
            int r2 = r1.length
            if (r0 > r2) goto L24
            luaj.e r4 = r3.S
            int r0 = r0 + (-1)
            if (r4 != 0) goto L1a
            r4 = r1[r0]
            goto L1e
        L1a:
            luaj.LuaValue r4 = r4.o(r1, r0)
        L1e:
            if (r4 == 0) goto L21
            goto L23
        L21:
            luaj.LuaValue r4 = luaj.LuaValue.f1671c
        L23:
            return r4
        L24:
            luaj.LuaValue r4 = r3.k3(r4)
            return r4
    }

    @Override // luaj.LuaValue
    public int W1() {
            r5 = this;
            int r0 = r5.d3()
            if (r0 == 0) goto L13
            luaj.LuaValue r1 = r5.x3(r0)
            boolean r1 = r1.l1()
            if (r1 != 0) goto L11
            goto L13
        L11:
            r1 = 0
            goto L2e
        L13:
            int r1 = r0 + 1
            r2 = r0
        L16:
            luaj.LuaValue r3 = r5.x3(r1)
            boolean r3 = r3.l1()
            if (r3 != 0) goto L2c
            int r2 = r5.f3()
            int r2 = r2 + r0
            int r2 = r2 + 1
            int r2 = r2 + r1
            r4 = r2
            r2 = r1
            r1 = r4
            goto L16
        L2c:
            r0 = r1
        L2d:
            r1 = r2
        L2e:
            int r2 = r1 + 1
            if (r0 <= r2) goto L42
            int r2 = r1 + r0
            int r2 = r2 / 2
            luaj.LuaValue r3 = r5.x3(r2)
            boolean r3 = r3.l1()
            if (r3 == 0) goto L2d
            r0 = r2
            goto L2e
        L42:
            return r1
    }

    public luaj.LuaValue W2(luaj.LuaString r3, int r4, int r5) {
            r2 = this;
            f.a r0 = new f.a
            r0.<init>()
            if (r4 > r5) goto L1f
        L7:
            luaj.LuaValue r1 = r2.c3(r4)
            luaj.LuaString r1 = r1.G0()
            r0.c(r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r4 >= r1) goto L1f
            int r4 = r4 + 1
            if (r4 > r5) goto L1f
            r0.c(r3)
            goto L7
        L1f:
            luaj.LuaString r3 = r0.l()
            return r3
    }

    @Override // luaj.LuaValue
    public void Y1(int r3, luaj.LuaValue r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = r2.U2(r3, r4)
            if (r0 != 0) goto L11
            long r0 = (long) r3
            luaj.LuaLong r3 = luaj.LuaLong.I2(r0)
            r2.m3(r3, r4)
        L11:
            return
    }

    public luaj.LuaValue c3(int r3) {
            r2 = this;
            luaj.LuaValue r0 = r2.x3(r3)
            boolean r1 = r0.l1()
            if (r1 == 0) goto L17
            luaj.e r1 = r2.S
            if (r1 == 0) goto L17
            long r0 = (long) r3
            luaj.LuaLong r3 = luaj.LuaValue.I2(r0)
            luaj.LuaValue r0 = luaj.LuaValue.W0(r2, r3)
        L17:
            return r0
    }

    @Override // luaj.LuaValue
    public void d2(luaj.LuaValue r2, luaj.LuaValue r3) {
            r1 = this;
            if (r2 == 0) goto L18
            if (r3 != 0) goto L5
            goto L18
        L5:
            boolean r0 = r2.i1()
            if (r0 == 0) goto L15
            int r0 = r2.y2()
            boolean r0 = r1.U2(r0, r3)
            if (r0 != 0) goto L18
        L15:
            r1.m3(r2, r3)
        L18:
            return
    }

    public int d3() {
            r1 = this;
            luaj.LuaValue[] r0 = r1.P
            int r0 = r0.length
            return r0
    }

    @Override // luaj.e
    public luaj.LuaValue e() {
            r0 = this;
            return r0
    }

    @Override // luaj.LuaValue
    public void e2(int r3, luaj.LuaValue r4) {
            r2 = this;
            luaj.e r0 = r2.S
            if (r0 == 0) goto L19
            luaj.LuaValue r0 = r2.x3(r3)
            boolean r0 = r0.l1()
            if (r0 == 0) goto L19
            long r0 = (long) r3
            luaj.LuaLong r0 = luaj.LuaLong.I2(r0)
            boolean r0 = luaj.LuaValue.l2(r2, r0, r4)
            if (r0 != 0) goto L1c
        L19:
            r2.Y1(r3, r4)
        L1c:
            return
    }

    public int e3() {
            r1 = this;
            int r0 = r1.R
            return r0
    }

    public int f3() {
            r1 = this;
            luaj.LuaTable$m[] r0 = r1.Q
            int r0 = r0.length
            return r0
    }

    @Override // luaj.e
    public luaj.LuaValue g(luaj.LuaValue r1) {
            r0 = this;
            return r1
    }

    @Override // luaj.LuaValue, luaj.Varargs
    public java.lang.String g0() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lb
            r0.<init>()     // Catch: java.io.IOException -> Lb
            r1 = 0
            java.lang.String r0 = r2.E3(r0, r1)     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public long g3(luaj.LuaValue r3) {
            r2 = this;
            luaj.LuaTable$n r0 = r2.C3(r3)
            if (r0 != 0) goto L16
            luaj.e r0 = r2.S
            if (r0 == 0) goto Lf
            luaj.LuaValue r3 = luaj.LuaValue.W0(r2, r3)
            goto L11
        Lf:
            luaj.LuaValue r3 = luaj.LuaValue.f1671c
        L11:
            long r0 = r3.C0()
            return r0
        L16:
            boolean r3 = r0 instanceof luaj.LuaTable.h
            if (r3 == 0) goto L22
            luaj.LuaTable$h r0 = (luaj.LuaTable.h) r0
            int r3 = r0.k0()
            long r0 = (long) r3
            return r0
        L22:
            boolean r3 = r0 instanceof luaj.LuaTable.k
            if (r3 == 0) goto L2d
            luaj.LuaTable$k r0 = (luaj.LuaTable.k) r0
            long r0 = r0.k0()
            return r0
        L2d:
            luaj.LuaValue r3 = r0.t()
            long r0 = r3.C0()
            return r0
    }

    @Override // luaj.LuaValue
    public void j2(luaj.LuaValue r3, luaj.LuaValue r4) {
            r2 = this;
            if (r3 == 0) goto L2c
            boolean r0 = r3.q1()
            if (r0 != 0) goto L14
            luaj.LuaString r0 = luaj.LuaValue.m
            luaj.LuaValue r0 = r2.x1(r0)
            boolean r0 = r0.g1()
            if (r0 == 0) goto L2c
        L14:
            luaj.e r0 = r2.S
            if (r0 == 0) goto L28
            luaj.LuaValue r0 = r2.V1(r3)
            boolean r0 = r0.l1()
            if (r0 == 0) goto L28
            boolean r0 = luaj.LuaValue.l2(r2, r3, r4)
            if (r0 != 0) goto L2b
        L28:
            r2.d2(r3, r4)
        L2b:
            return
        L2c:
            luaj.d r4 = new luaj.d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "value ('"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "') can not be used as a table index"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // luaj.e
    public luaj.LuaTable.m k(luaj.LuaValue r1, luaj.LuaValue r2) {
            r0 = this;
            luaj.LuaTable$e r1 = Z2(r1, r2)
            return r1
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue k2(luaj.LuaValue r5) {
            r4 = this;
            luaj.e r0 = r4.S
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le
            boolean r0 = r0.q()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            luaj.e r3 = r4.S
            if (r3 == 0) goto L1b
            boolean r3 = r3.p()
            if (r3 == 0) goto L1b
            r3 = 1
            goto L1c
        L1b:
            r3 = 0
        L1c:
            luaj.e r5 = luaj.LuaValue.w1(r5)
            r4.S = r5
            if (r5 == 0) goto L2c
            boolean r5 = r5.q()
            if (r5 == 0) goto L2c
            r5 = 1
            goto L2d
        L2c:
            r5 = 0
        L2d:
            if (r0 != r5) goto L3d
            luaj.e r5 = r4.S
            if (r5 == 0) goto L3a
            boolean r5 = r5.p()
            if (r5 == 0) goto L3a
            goto L3b
        L3a:
            r1 = 0
        L3b:
            if (r3 == r1) goto L40
        L3d:
            r4.y3(r2)
        L40:
            return r4
    }

    protected luaj.LuaValue k3(luaj.LuaValue r1) {
            r0 = this;
            luaj.LuaTable$n r1 = r0.C3(r1)
            if (r1 != 0) goto L9
            luaj.LuaValue r1 = luaj.LuaValue.f1671c
            goto Ld
        L9:
            luaj.LuaValue r1 = r1.t()
        Ld:
            return r1
    }

    public void m3(luaj.LuaValue r4, luaj.LuaValue r5) {
            r3 = this;
            boolean r0 = r5.l1()
            if (r0 == 0) goto Lb
            r3.h3(r4)
            goto L87
        Lb:
            luaj.LuaTable$m[] r0 = r3.Q
            int r0 = r0.length
            if (r0 <= 0) goto L30
            int r0 = r3.i3(r4)
            luaj.LuaTable$m[] r1 = r3.Q
            r1 = r1[r0]
        L18:
            if (r1 == 0) goto L31
            luaj.LuaTable$n r2 = r1.f(r4)
            if (r2 == 0) goto L2b
            luaj.LuaTable$m[] r4 = r3.Q
            r1 = r4[r0]
            luaj.LuaTable$m r5 = r1.j(r2, r5)
            r4[r0] = r5
            return
        L2b:
            luaj.LuaTable$m r1 = r1.a()
            goto L18
        L30:
            r0 = 0
        L31:
            int r1 = r3.R
            luaj.LuaTable$m[] r2 = r3.Q
            int r2 = r2.length
            if (r1 < r2) goto L68
            luaj.e r0 = r3.S
            if (r0 == 0) goto L42
            boolean r0 = r0.p()
            if (r0 != 0) goto L60
        L42:
            boolean r0 = r4.i1()
            if (r0 == 0) goto L60
            int r0 = r4.y2()
            if (r0 <= 0) goto L60
            int r0 = r4.y2()
            r3.y3(r0)
            int r0 = r4.y2()
            boolean r0 = r3.U2(r0, r5)
            if (r0 == 0) goto L64
            return
        L60:
            r0 = -1
            r3.y3(r0)
        L64:
            int r0 = r3.i3(r4)
        L68:
            luaj.e r1 = r3.S
            if (r1 == 0) goto L71
            luaj.LuaTable$m r4 = r1.k(r4, r5)
            goto L75
        L71:
            luaj.LuaTable$e r4 = Z2(r4, r5)
        L75:
            luaj.LuaTable$m[] r5 = r3.Q
            r1 = r5[r0]
            if (r1 == 0) goto L7f
            luaj.LuaTable$m r4 = r1.d(r4)
        L7f:
            r5[r0] = r4
            int r4 = r3.R
            int r4 = r4 + 1
            r3.R = r4
        L87:
            return
    }

    @Override // luaj.e
    public luaj.LuaValue o(luaj.LuaValue[] r1, int r2) {
            r0 = this;
            r1 = r1[r2]
            return r1
    }

    @Override // luaj.LuaValue
    public boolean o1() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // luaj.e
    public boolean p() {
            r1 = this;
            r0 = 0
            return r0
    }

    public luaj.Varargs p3(luaj.LuaValue r4) {
            r3 = this;
            int r4 = r4.A0()
            int r4 = r4 + 1
            luaj.LuaValue r0 = r3.c3(r4)
            boolean r1 = r0.l1()
            if (r1 == 0) goto L13
            luaj.LuaValue r4 = luaj.LuaValue.f1674f
            goto L1c
        L13:
            long r1 = (long) r4
            luaj.LuaLong r4 = luaj.LuaLong.I2(r1)
            luaj.Varargs r4 = luaj.LuaValue.N2(r4, r0)
        L1c:
            return r4
    }

    @Override // luaj.e
    public boolean q() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void q3(int r3, luaj.LuaValue r4) {
            r2 = this;
        L0:
            boolean r0 = r4.l1()
            if (r0 != 0) goto L12
            luaj.LuaValue r0 = r2.c3(r3)
            int r1 = r3 + 1
            r2.e2(r3, r4)
            r4 = r0
            r3 = r1
            goto L0
        L12:
            return
    }

    @Override // luaj.LuaValue
    public luaj.LuaValue r1() {
            r2 = this;
            luaj.LuaString r0 = luaj.LuaValue.x
            luaj.LuaValue r0 = r2.x1(r0)
            boolean r1 = r0.w2()
            if (r1 == 0) goto L11
            luaj.LuaValue r0 = r0.call(r2)
            return r0
        L11:
            int r0 = r2.W1()
            long r0 = (long) r0
            luaj.LuaLong r0 = luaj.LuaLong.I2(r0)
            return r0
    }

    @Override // luaj.LuaValue
    public int s1() {
            r4 = this;
            luaj.e r0 = r4.S
            if (r0 == 0) goto L2a
            luaj.LuaValue r0 = r4.r1()
            boolean r1 = r0.i1()
            if (r1 == 0) goto L13
            int r0 = r0.y2()
            return r0
        L13:
            luaj.d r1 = new luaj.d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "table length is not an integer: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L2a:
            int r0 = r4.W1()
            return r0
    }

    public luaj.LuaTable.i s3() {
            r1 = this;
            luaj.LuaTable$i r0 = new luaj.LuaTable$i
            r0.<init>(r1)
            return r0
    }

    public luaj.LuaValue[] t3() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            luaj.LuaTable$i r1 = r3.s3()
        L9:
            boolean r2 = r1.c()
            if (r2 == 0) goto L17
            luaj.LuaValue r2 = r1.b()
            r0.add(r2)
            goto L9
        L17:
            int r1 = r0.size()
            luaj.LuaValue[] r1 = new luaj.LuaValue[r1]
            r0.toArray(r1)
            return r1
    }

    public luaj.Varargs v3(luaj.LuaValue r6) {
            r5 = this;
            boolean r0 = r6.l1()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L73
            boolean r0 = r6.i1()
            if (r0 == 0) goto L1b
            int r0 = r6.y2()
            if (r0 <= 0) goto L1b
            luaj.LuaValue[] r3 = r5.P
            int r3 = r3.length
            if (r0 > r3) goto L1b
            r2 = r0
            goto L73
        L1b:
            luaj.LuaTable$m[] r0 = r5.Q
            int r0 = r0.length
            if (r0 != 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "invalid key to 'next' 1: "
            r0.append(r3)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            luaj.LuaValue.R0(r0)
        L34:
            int r0 = r5.i3(r6)
            luaj.LuaTable$m[] r3 = r5.Q
            r3 = r3[r0]
        L3c:
            if (r3 == 0) goto L57
            if (r2 == 0) goto L4b
            luaj.LuaTable$n r4 = r3.l()
            if (r4 == 0) goto L52
            luaj.Varargs r6 = r4.c()
            return r6
        L4b:
            boolean r4 = r3.s(r6)
            if (r4 == 0) goto L52
            r2 = 1
        L52:
            luaj.LuaTable$m r3 = r3.a()
            goto L3c
        L57:
            if (r2 != 0) goto L6d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "invalid key to 'next' 2: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            luaj.LuaValue.R0(r6)
        L6d:
            luaj.LuaValue[] r6 = r5.P
            int r6 = r6.length
            int r6 = r6 + r1
            int r2 = r0 + r6
        L73:
            luaj.LuaValue[] r6 = r5.P
            int r0 = r6.length
            if (r2 >= r0) goto L95
            r0 = r6[r2]
            if (r0 == 0) goto L92
            luaj.e r3 = r5.S
            if (r3 != 0) goto L81
            goto L85
        L81:
            luaj.LuaValue r0 = r3.o(r6, r2)
        L85:
            if (r0 == 0) goto L92
            int r2 = r2 + r1
            long r1 = (long) r2
            luaj.LuaLong r6 = luaj.LuaLong.I2(r1)
            luaj.Varargs r6 = luaj.LuaValue.N2(r6, r0)
            return r6
        L92:
            int r2 = r2 + 1
            goto L73
        L95:
            int r6 = r6.length
            int r2 = r2 - r6
        L97:
            luaj.LuaTable$m[] r6 = r5.Q
            int r0 = r6.length
            if (r2 >= r0) goto Lb3
            r6 = r6[r2]
        L9e:
            if (r6 == 0) goto Lb0
            luaj.LuaTable$n r0 = r6.l()
            if (r0 == 0) goto Lab
            luaj.Varargs r6 = r0.c()
            return r6
        Lab:
            luaj.LuaTable$m r6 = r6.a()
            goto L9e
        Lb0:
            int r2 = r2 + 1
            goto L97
        Lb3:
            luaj.LuaValue r6 = luaj.LuaValue.f1671c
            return r6
    }

    public void w3(int r2, int r3) {
            r1 = this;
            if (r3 <= 0) goto L6
            r0 = 2
            if (r3 >= r0) goto L6
            r3 = 2
        L6:
            r0 = 1
            if (r2 <= 0) goto L12
            int r2 = u3(r2)
            int r2 = r0 << r2
            luaj.LuaValue[] r2 = new luaj.LuaValue[r2]
            goto L14
        L12:
            luaj.LuaValue[] r2 = luaj.LuaValue.j
        L14:
            r1.P = r2
            if (r3 <= 0) goto L21
            int r2 = u3(r3)
            int r2 = r0 << r2
            luaj.LuaTable$m[] r2 = new luaj.LuaTable.m[r2]
            goto L23
        L21:
            luaj.LuaTable$m[] r2 = luaj.LuaTable.U
        L23:
            r1.Q = r2
            r2 = 0
            r1.R = r2
            return
    }

    public luaj.LuaValue x3(int r3) {
            r2 = this;
            if (r3 <= 0) goto L1a
            luaj.LuaValue[] r0 = r2.P
            int r1 = r0.length
            if (r3 > r1) goto L1a
            luaj.e r1 = r2.S
            int r3 = r3 + (-1)
            if (r1 != 0) goto L10
            r3 = r0[r3]
            goto L14
        L10:
            luaj.LuaValue r3 = r1.o(r0, r3)
        L14:
            if (r3 == 0) goto L17
            goto L19
        L17:
            luaj.LuaValue r3 = luaj.LuaValue.f1671c
        L19:
            return r3
        L1a:
            long r0 = (long) r3
            luaj.LuaLong r3 = luaj.LuaLong.I2(r0)
            luaj.LuaValue r3 = r2.k3(r3)
            return r3
    }

    public luaj.LuaValue z3(int r3, int r4) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = r4
            goto L9
        L4:
            if (r3 <= r4) goto L9
            luaj.LuaValue r3 = luaj.LuaValue.f1674f
            return r3
        L9:
            luaj.LuaValue r4 = r2.c3(r3)
            r0 = r4
        Le:
            boolean r0 = r0.l1()
            if (r0 != 0) goto L20
            int r0 = r3 + 1
            luaj.LuaValue r1 = r2.c3(r0)
            r2.e2(r3, r1)
            r3 = r0
            r0 = r1
            goto Le
        L20:
            boolean r3 = r4.l1()
            if (r3 == 0) goto L28
            luaj.LuaValue r4 = luaj.LuaValue.f1674f
        L28:
            return r4
    }
}
