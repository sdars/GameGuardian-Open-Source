package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class z1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Map f1412c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f1413d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final android.util.SparseIntArray f1414e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.Map f1415f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile int f1416g;
    static final android.util.SparseIntArray h = null;
    private static android.ext.z1 i;
    static java.util.HashMap j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.app.ActivityManager f1417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.pm.PackageManager f1418b;

    class a extends java.util.LinkedHashMap {
        a(int r1, float r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(java.util.Map.Entry r2) {
                r1 = this;
                int r2 = r1.size()
                r0 = 128(0x80, float:1.8E-43)
                if (r2 <= r0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ java.util.List f1422d;

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1423a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.z1.b f1424b;

            a(android.ext.z1.b r1, int r2) {
                    r0 = this;
                    r0.f1424b = r1
                    r0.f1423a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    android.ext.z1$b r0 = r4.f1424b
                    java.util.List r1 = r0.f1422d
                    int r2 = r0.f1419a
                    int r3 = r4.f1423a
                    int r0 = r0.f1421c
                    android.ext.z1.b(r1, r2, r3, r0)
                    return
            }
        }

        b(int r1, int r2, int r3, java.util.List r4) {
                r0 = this;
                r0.f1419a = r1
                r0.f1420b = r2
                r0.f1421c = r3
                r0.f1422d = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                int r0 = r4.f1419a
                int r1 = android.ext.z1.a()
                if (r0 == r1) goto L9
                return
            L9:
                int r0 = r4.f1420b
                int r0 = r0 + 8
                int r1 = r4.f1421c
                int r0 = java.lang.Math.min(r0, r1)
                int r1 = r4.f1420b
            L15:
                if (r1 >= r0) goto L39
                int r2 = r4.f1419a
                int r3 = android.ext.z1.a()
                if (r2 == r3) goto L20
                return
            L20:
                java.util.List r2 = r4.f1422d
                java.lang.Object r2 = r2.get(r1)
                android.ext.z1$d r2 = (android.ext.z1.d) r2
                if (r2 == 0) goto L36
                boolean r3 = android.ext.z1.d.a(r2)
                if (r3 == 0) goto L31
                goto L36
            L31:
                int r3 = r4.f1419a
                android.ext.z1.d.b(r2, r3)
            L36:
                int r1 = r1 + 1
                goto L15
            L39:
                int r1 = r4.f1421c
                if (r0 >= r1) goto L49
                android.os.Handler r1 = android.ext.n2.c()
                android.ext.z1$b$a r2 = new android.ext.z1$b$a
                r2.<init>(r4, r0)
                r1.post(r2)
            L49:
                return
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public java.lang.String f1427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public java.lang.String f1428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public java.lang.String f1429e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1430f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f1431g;
        public boolean h;

        public c(int r2, java.lang.String r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ""
                r1.f1429e = r0
                r0 = 0
                r1.f1430f = r0
                r1.f1431g = r0
                r1.h = r0
                r1.f1425a = r2
                r1.f1427c = r3
                r1.f1428d = r3
                r1.f1426b = r2
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AppInfo [uid="
                r0.append(r1)
                int r1 = r2.f1425a
                r0.append(r1)
                java.lang.String r1 = ", pkg="
                r0.append(r1)
                java.lang.String r1 = r2.f1427c
                r0.append(r1)
                java.lang.String r1 = ", name="
                r0.append(r1)
                java.lang.String r1 = r2.f1428d
                r0.append(r1)
                java.lang.String r1 = ", isSystem="
                r0.append(r1)
                boolean r1 = r2.f1430f
                r0.append(r1)
                java.lang.String r1 = ", isGame="
                r0.append(r1)
                boolean r1 = r2.f1431g
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class d implements java.lang.Comparable {
        private static java.lang.ref.WeakReference q;
        public static final int r = 0;
        public static final int s = 0;
        public static final int t = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.String f1432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public java.lang.String f1433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public java.lang.String f1434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public java.lang.String f1435d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile android.graphics.drawable.Drawable f1436e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1437f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1438g;
        public int h;
        public boolean i;
        public boolean j;
        public long k;
        public boolean l;
        public int m;
        public boolean n;
        public int o;
        private volatile boolean p;

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.widget.TextView f1439a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.z1.d f1440b;

            /* JADX INFO: renamed from: android.ext.z1$d$a$a, reason: collision with other inner class name */
            class RunnableC0025a implements java.lang.Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ android.ext.z1.d.a f1441a;

                RunnableC0025a(android.ext.z1.d.a r1) {
                        r0 = this;
                        r0.f1441a = r1
                        r0.<init>()
                        return
                }

                @Override // java.lang.Runnable
                public void run() {
                        r3 = this;
                        android.ext.z1$d$a r0 = r3.f1441a
                        android.widget.TextView r0 = r0.f1439a
                        java.lang.Object r0 = r0.getTag()
                        android.ext.z1$d$a r1 = r3.f1441a
                        android.ext.z1$d r2 = r1.f1440b
                        if (r0 != r2) goto L17
                        android.widget.TextView r0 = r1.f1439a
                        android.graphics.drawable.Drawable r1 = r2.f1436e
                        r2 = 48
                        android.ext.Tools.c(r0, r1, r2)
                    L17:
                        return
                }
            }

            a(android.ext.z1.d r1, android.widget.TextView r2) {
                    r0 = this;
                    r0.f1440b = r1
                    r0.f1439a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    android.ext.z1$d r0 = r1.f1440b
                    r0.h()
                    android.ext.z1$d r0 = r1.f1440b
                    android.graphics.drawable.Drawable r0 = r0.f1436e
                    if (r0 == 0) goto L13
                    android.ext.z1$d$a$a r0 = new android.ext.z1$d$a$a
                    r0.<init>(r1)
                    android.ext.n2.i(r0)
                L13:
                    return
            }
        }

        static {
                r0 = 2130837523(0x7f020013, float:1.7280002E38)
                r1 = -5570561(0xffffffffffaaffff, float:NaN)
                int r0 = android.ext.Tools.e0(r0, r1)
                android.ext.z1.d.r = r0
                r0 = 2130837522(0x7f020012, float:1.728E38)
                r1 = -1
                int r0 = android.ext.Tools.e0(r0, r1)
                android.ext.z1.d.s = r0
                r0 = 2130837524(0x7f020014, float:1.7280005E38)
                r1 = -5570646(0xffffffffffaaffaa, float:NaN)
                int r0 = android.ext.Tools.e0(r0, r1)
                android.ext.z1.d.t = r0
                return
        }

        public d(android.ext.z1.c r2, int r3, int r4, java.lang.String r5, int r6, boolean r7, int r8) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.p = r0
                r1.f1432a = r5
                java.lang.String r0 = r2.f1428d
                r1.f1433b = r0
                java.lang.String r0 = r2.f1427c
                r1.f1434c = r0
                java.lang.String r0 = r2.f1429e
                if (r0 != 0) goto L16
                java.lang.String r0 = ""
            L16:
                r1.f1435d = r0
                r0 = 0
                r1.f1436e = r0
                r1.f1437f = r3
                r1.f1438g = r4
                boolean r3 = r2.h
                if (r3 == 0) goto L24
                goto L26
            L24:
                int r4 = r2.f1426b
            L26:
                r1.h = r4
                java.lang.String r3 = r2.f1427c
                boolean r3 = r5.equals(r3)
                r1.l = r3
                boolean r3 = r2.f1430f
                r1.i = r3
                boolean r3 = r2.f1431g
                r1.j = r3
                r1.m = r6
                r1.n = r7
                r1.o = r8
                boolean r2 = r2.h
                if (r2 == 0) goto L45
                r2 = 1
                r1.p = r2
            L45:
                return
        }

        static /* synthetic */ boolean a(android.ext.z1.d r0) {
                boolean r0 = r0.p
                return r0
        }

        static /* synthetic */ void b(android.ext.z1.d r0, int r1) {
                r0.i(r1)
                return
        }

        private java.lang.String e() {
                r5 = this;
                boolean r0 = r5.l
                java.lang.String r1 = ""
                if (r0 == 0) goto L7
                goto L36
            L7:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = " ("
                r0.append(r2)
                java.lang.String r2 = r5.f1432a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = r5.f1434c
                r3.append(r4)
                r4 = 58
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r1 = r2.replace(r3, r1)
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L36:
                return r1
        }

        private void i(int r5) {
                r4 = this;
                boolean r0 = r4.p
                if (r0 != 0) goto L74
                java.lang.String r0 = r4.f1434c
                android.graphics.drawable.Drawable r0 = android.ext.z1.l(r0)
                r1 = 1
                if (r0 == 0) goto L26
                java.util.Map r2 = android.ext.z1.e()
                monitor-enter(r2)
                if (r5 == 0) goto L1e
                int r3 = android.ext.z1.a()     // Catch: java.lang.Throwable -> L1c
                if (r5 == r3) goto L1e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                return
            L1c:
                r5 = move-exception
                goto L24
            L1e:
                r4.f1436e = r0     // Catch: java.lang.Throwable -> L1c
                r4.p = r1     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                return
            L24:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r5
            L26:
                java.lang.String r0 = r4.f1434c     // Catch: java.lang.Throwable -> L3d
                android.content.pm.ApplicationInfo r0 = android.ext.Tools.Y(r0)     // Catch: java.lang.Throwable -> L3d
                android.graphics.drawable.Drawable r0 = android.ext.Tools.X(r0)     // Catch: java.lang.Throwable -> L3d
                int r2 = android.ext.Tools.H()     // Catch: java.lang.Throwable -> L3d
                android.graphics.drawable.Drawable r0 = android.ext.Tools.G0(r0, r2)     // Catch: java.lang.Throwable -> L3d
                android.graphics.drawable.Drawable r0 = android.ext.Tools.R1(r0)     // Catch: java.lang.Throwable -> L3d
                goto L54
            L3d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Failed load icon for "
                r0.append(r2)
                java.lang.String r2 = r4.f1434c
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                android.ext.e1.p(r0)
                r0 = 0
            L54:
                java.util.Map r2 = android.ext.z1.e()
                monitor-enter(r2)
                if (r5 == 0) goto L65
                int r3 = android.ext.z1.a()     // Catch: java.lang.Throwable -> L63
                if (r5 == r3) goto L65
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
                return
            L63:
                r5 = move-exception
                goto L72
            L65:
                r4.f1436e = r0     // Catch: java.lang.Throwable -> L63
                if (r0 == 0) goto L6e
                java.lang.String r5 = r4.f1434c     // Catch: java.lang.Throwable -> L63
                android.ext.z1.r(r5, r0)     // Catch: java.lang.Throwable -> L63
            L6e:
                r4.p = r1     // Catch: java.lang.Throwable -> L63
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
                goto L74
            L72:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
                throw r5
            L74:
                return
        }

        public int c(android.ext.z1.d r8) {
                r7 = this;
                int r0 = r7.m
                int r1 = r8.m
                r2 = -1
                r3 = 1
                if (r0 == r1) goto Ld
                if (r0 <= r1) goto Lb
                goto L5b
            Lb:
                r2 = 1
                goto L5b
            Ld:
                boolean r0 = r7.j
                boolean r1 = r8.j
                if (r0 == r1) goto L16
                if (r0 == 0) goto Lb
                goto L5b
            L16:
                boolean r0 = r7.i
                boolean r1 = r8.i
                if (r0 == r1) goto L1f
                if (r0 == 0) goto L5b
                goto Lb
            L1f:
                long r0 = r7.k
                long r4 = r8.k
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 == 0) goto L2c
                int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r8 <= 0) goto Lb
                goto L5b
            L2c:
                boolean r0 = r7.l
                boolean r1 = r8.l
                if (r0 == r1) goto L35
                if (r0 == 0) goto Lb
                goto L5b
            L35:
                int r0 = r7.f()
                r1 = 0
                if (r0 <= 0) goto L3e
                r0 = 1
                goto L3f
            L3e:
                r0 = 0
            L3f:
                int r4 = r8.f()
                if (r4 <= 0) goto L47
                r4 = 1
                goto L48
            L47:
                r4 = 0
            L48:
                if (r0 == r4) goto L51
                int r8 = r7.f()
                if (r8 <= 0) goto L5b
                goto Lb
            L51:
                int r0 = r7.f1437f
                int r8 = r8.f1437f
                if (r0 == r8) goto L5a
                if (r0 <= r8) goto Lb
                goto L5b
            L5a:
                r2 = 0
            L5b:
                return r2
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                android.ext.z1$d r1 = (android.ext.z1.d) r1
                int r1 = r0.c(r1)
                return r1
        }

        public java.lang.String d() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ProcessInfo [cmdline="
                r0.append(r1)
                java.lang.String r1 = r3.f1432a
                r0.append(r1)
                java.lang.String r1 = ", name="
                r0.append(r1)
                java.lang.String r1 = r3.f1433b
                r0.append(r1)
                java.lang.String r1 = ", packageName="
                r0.append(r1)
                java.lang.String r1 = r3.f1434c
                r0.append(r1)
                java.lang.String r1 = ", icon="
                r0.append(r1)
                android.graphics.drawable.Drawable r1 = r3.f1436e
                r0.append(r1)
                java.lang.String r1 = ", pid="
                r0.append(r1)
                int r1 = r3.f1437f
                r0.append(r1)
                java.lang.String r1 = ", uid="
                r0.append(r1)
                int r1 = r3.f1438g
                r0.append(r1)
                java.lang.String r1 = ", isSystem="
                r0.append(r1)
                boolean r1 = r3.i
                r0.append(r1)
                java.lang.String r1 = ", isGame="
                r0.append(r1)
                boolean r1 = r3.j
                r0.append(r1)
                java.lang.String r1 = ", weight="
                r0.append(r1)
                long r1 = r3.k
                r0.append(r1)
                java.lang.String r1 = ", main="
                r0.append(r1)
                boolean r1 = r3.l
                r0.append(r1)
                java.lang.String r1 = ", order="
                r0.append(r1)
                int r1 = r3.m
                r0.append(r1)
                java.lang.String r1 = ", x64="
                r0.append(r1)
                boolean r1 = r3.n
                r0.append(r1)
                java.lang.String r1 = ", rss="
                r0.append(r1)
                int r1 = r3.o
                r0.append(r1)
                java.lang.String r1 = ", getTracer()="
                r0.append(r1)
                int r1 = r3.g()
                r0.append(r1)
                java.lang.String r1 = ", getTrace()="
                r0.append(r1)
                int r1 = r3.f()
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public int f() {
                r2 = this;
                android.util.SparseIntArray r0 = android.ext.z1.h
                int r1 = r2.f1437f
                int r1 = r0.indexOfValue(r1)
                if (r1 < 0) goto Le
                int r1 = r0.keyAt(r1)
            Le:
                return r1
        }

        public int g() {
                r2 = this;
                android.util.SparseIntArray r0 = android.ext.z1.h
                int r1 = r2.f1437f
                int r0 = r0.get(r1)
                return r0
        }

        public void h() {
                r1 = this;
                r0 = 0
                r1.i(r0)
                return
        }

        public void j(android.widget.TextView r4) {
                r3 = this;
                if (r4 != 0) goto L3
                return
            L3:
                boolean r0 = r3.p
                android.graphics.drawable.Drawable r1 = r3.f1436e
                if (r1 != 0) goto L17
                java.lang.String r2 = r3.f1434c
                android.graphics.drawable.Drawable r2 = android.ext.z1.l(r2)
                if (r2 == 0) goto L17
                r3.f1436e = r2
                r0 = 1
                r3.p = r0
                r1 = r2
            L17:
                if (r1 != 0) goto L33
                java.lang.ref.WeakReference r2 = android.ext.z1.d.q
                if (r2 == 0) goto L23
                java.lang.Object r1 = r2.get()
                android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            L23:
                if (r1 != 0) goto L33
                r1 = 2130968587(0x7f04000b, float:1.7545832E38)
                android.graphics.drawable.Drawable r1 = android.ext.Tools.o0(r1)
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r1)
                android.ext.z1.d.q = r2
            L33:
                r2 = 48
                android.ext.Tools.c(r4, r1, r2)
                if (r0 != 0) goto L42
                android.ext.z1$d$a r0 = new android.ext.z1$d$a
                r0.<init>(r3, r4)
                android.ext.n2.h(r0)
            L42:
                return
        }

        public void k() {
                r3 = this;
                int r0 = r3.f1438g
                int r1 = r3.h
                if (r0 != r1) goto L7
                return
            L7:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "vs app: "
                r0.append(r1)
                int r1 = r3.h
                r0.append(r1)
                java.lang.String r1 = " != "
                r0.append(r1)
                int r1 = r3.f1438g
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.ext.e1.p(r0)
                android.ext.z1 r0 = android.ext.z1.c()     // Catch: java.lang.Throwable -> L62
                int r1 = r3.f1438g     // Catch: java.lang.Throwable -> L62
                java.lang.String r0 = android.ext.z1.d(r0, r1)     // Catch: java.lang.Throwable -> L62
                if (r0 == 0) goto L79
                android.content.pm.ApplicationInfo r0 = android.ext.Tools.Y(r0)     // Catch: java.lang.Throwable -> L62
                if (r0 == 0) goto L79
                java.lang.String r1 = r0.nativeLibraryDir     // Catch: java.lang.Throwable -> L62
                if (r1 == 0) goto L79
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
                r1.<init>()     // Catch: java.lang.Throwable -> L62
                java.lang.String r2 = "vs: "
                r1.append(r2)     // Catch: java.lang.Throwable -> L62
                java.lang.String r2 = r3.f1435d     // Catch: java.lang.Throwable -> L62
                r1.append(r2)     // Catch: java.lang.Throwable -> L62
                java.lang.String r2 = " => "
                r1.append(r2)     // Catch: java.lang.Throwable -> L62
                java.lang.String r2 = r0.nativeLibraryDir     // Catch: java.lang.Throwable -> L62
                r1.append(r2)     // Catch: java.lang.Throwable -> L62
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L62
                android.ext.e1.p(r1)     // Catch: java.lang.Throwable -> L62
                java.lang.String r0 = r0.nativeLibraryDir     // Catch: java.lang.Throwable -> L62
                r3.f1435d = r0     // Catch: java.lang.Throwable -> L62
                goto L79
            L62:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed get vs info for "
                r1.append(r2)
                int r2 = r3.f1438g
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.ext.e1.s(r1, r0)
            L79:
                return
        }

        public java.lang.CharSequence l() {
                r7 = this;
                android.ext.y r0 = new android.ext.y
                r0.<init>()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r2 = r7.g()
                if (r2 <= 0) goto L15
                r2 = 35
                r1.append(r2)
            L15:
                int r2 = r7.f()
                if (r2 <= 0) goto L20
                r2 = 33
                r1.append(r2)
            L20:
                boolean r2 = android.ext.Config.C
                if (r2 != 0) goto L2f
                int r2 = r7.f1438g
                int r3 = r7.h
                if (r2 == r3) goto L2f
                r2 = 118(0x76, float:1.65E-43)
                r1.append(r2)
            L2f:
                int r2 = r7.f1437f
                r3 = 1
                if (r2 <= r3) goto L47
                r2 = 91
                r1.append(r2)
                int r2 = r7.f1437f
                java.lang.String r2 = java.lang.Integer.toString(r2)
                r1.append(r2)
                java.lang.String r2 = "] "
                r1.append(r2)
            L47:
                java.lang.String r1 = r1.toString()
                int r2 = android.ext.z1.d.r
                java.lang.CharSequence r1 = android.ext.Tools.t(r1, r2)
                r0.a(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r7.f1433b
                r1.append(r2)
                java.lang.String r2 = r7.e()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                int r2 = android.ext.z1.d.s
                java.lang.CharSequence r1 = android.ext.Tools.t(r1, r2)
                r0.a(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                boolean r2 = r7.n
                if (r2 == 0) goto L80
                java.lang.String r2 = " [x64]"
                r1.append(r2)
            L80:
                int r2 = r7.o
                if (r2 == 0) goto La0
                java.lang.String r2 = " ["
                r1.append(r2)
                android.content.Context r2 = android.ext.Tools.f0()
                int r3 = r7.o
                long r3 = (long) r3
                r5 = 1024(0x400, double:5.06E-321)
                long r3 = r3 * r5
                java.lang.String r2 = android.ext.Tools.U(r2, r3)
                r1.append(r2)
                r2 = 93
                r1.append(r2)
            La0:
                java.lang.String r1 = r1.toString()
                int r2 = android.ext.z1.d.t
                java.lang.CharSequence r1 = android.ext.Tools.t(r1, r2)
                r0.a(r1)
                java.lang.CharSequence r0 = r0.d()
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.CharSequence r0 = r1.l()
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            android.ext.z1$a r0 = new android.ext.z1$a
            r1 = 128(0x80, float:1.8E-43)
            r2 = 1061158912(0x3f400000, float:0.75)
            r3 = 1
            r0.<init>(r1, r2, r3)
            android.ext.z1.f1415f = r0
            r0 = 0
            android.ext.z1.f1416g = r0
            r1 = -1
            android.ext.z1.f1413d = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            android.ext.z1.f1414e = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            android.ext.z1.f1412c = r2
            android.ext.a0.k()
            f()
            java.lang.String[] r2 = android.ext.a0.e()
            int r4 = r2.length
        L2b:
            if (r0 >= r4) goto L58
            r5 = r2[r0]
            if (r5 == 0) goto L55
            int r6 = r5.length()
            if (r6 != 0) goto L38
            goto L55
        L38:
            int r6 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L40
            r1.put(r6, r3)     // Catch: java.lang.NumberFormatException -> L40
            goto L55
        L40:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed load bugged uid: "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            android.ext.e1.l(r5, r6)
        L55:
            int r0 = r0 + 1
            goto L2b
        L58:
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            android.ext.z1.h = r0
            r0 = 0
            android.ext.z1.i = r0
            android.ext.z1.j = r0
            return
    }

    public z1(android.app.ActivityManager r1, android.content.pm.PackageManager r2) {
            r0 = this;
            r0.<init>()
            r0.f1417a = r1
            r0.f1418b = r2
            android.ext.z1.i = r0
            return
    }

    static /* synthetic */ int a() {
            int r0 = android.ext.z1.f1416g
            return r0
    }

    static /* synthetic */ void b(java.util.List r0, int r1, int r2, int r3) {
            q(r0, r1, r2, r3)
            return
    }

    static /* synthetic */ android.ext.z1 c() {
            android.ext.z1 r0 = android.ext.z1.i
            return r0
    }

    static /* synthetic */ java.lang.String d(android.ext.z1 r0, int r1) {
            java.lang.String r0 = r0.m(r1)
            return r0
    }

    static /* synthetic */ java.util.Map e() {
            java.util.Map r0 = android.ext.z1.f1415f
            return r0
    }

    private static void f() {
            java.util.Map r0 = android.ext.z1.f1412c
            java.lang.String[] r1 = android.ext.a0.c()
            int r2 = r1.length
            r3 = 0
        L8:
            if (r3 >= r2) goto L20
            r4 = r1[r3]
            if (r4 == 0) goto L1d
            int r5 = r4.length()
            if (r5 != 0) goto L15
            goto L1d
        L15:
            r5 = 0
            android.ext.z1$c r5 = k(r4, r5)
            r0.put(r4, r5)
        L1d:
            int r3 = r3 + 1
            goto L8
        L20:
            return
    }

    public static void g() {
            java.util.Map r0 = android.ext.z1.f1415f
            monitor-enter(r0)
            int r1 = android.ext.z1.f1416g     // Catch: java.lang.Throwable -> L3d
            int r1 = r1 + 1
            android.ext.z1.f1416g = r1     // Catch: java.lang.Throwable -> L3d
            r0.clear()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            java.util.Map r0 = android.ext.z1.f1412c
            int r1 = r0.size()
            if (r1 != 0) goto L16
            return
        L16:
            r0.clear()
            f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "PL: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " -> "
            r2.append(r1)
            int r0 = r0.size()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.ext.e1.d(r0)
            return
        L3d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r1
    }

    private android.ext.z1.c h(int r8, int r9, java.lang.String r10, java.util.List r11, android.util.SparseArray r12) {
            r7 = this;
            r0 = 58
            int r0 = r10.indexOf(r0)
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L12
            java.lang.String r0 = ":"
            java.lang.String[] r10 = r10.split(r0, r2)
            r10 = r10[r1]
        L12:
            r0 = 46
            int r0 = r10.indexOf(r0)
            r3 = 1
            if (r0 == r2) goto L25
            r0 = 47
            int r0 = r10.indexOf(r0)
            if (r0 != r2) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            r2 = 0
            if (r0 == 0) goto L2e
            android.ext.z1$c r4 = r7.i(r10)
            goto L2f
        L2e:
            r4 = r2
        L2f:
            if (r4 == 0) goto L3a
            int r8 = r4.f1425a
            int r10 = android.ext.z1.f1413d
            if (r8 != r10) goto L39
            r4.f1425a = r9
        L39:
            return r4
        L3a:
            if (r0 == 0) goto L4a
            android.content.pm.ApplicationInfo r2 = android.ext.Tools.Y(r10)     // Catch: java.lang.NoSuchMethodError -> L44 android.content.pm.PackageManager.NameNotFoundException -> L49
            if (r2 == 0) goto L4a
            r4 = 1
            goto L4b
        L44:
            r4 = move-exception
            android.ext.e1.a(r4)
            goto L4a
        L49:
        L4a:
            r4 = 0
        L4b:
            if (r2 != 0) goto La6
            if (r11 == 0) goto L70
            java.util.Iterator r11 = r11.iterator()
        L53:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L70
            java.lang.Object r5 = r11.next()
            android.app.ActivityManager$RunningAppProcessInfo r5 = (android.app.ActivityManager.RunningAppProcessInfo) r5
            if (r5 == 0) goto L53
            int r6 = r5.pid
            if (r6 != r8) goto L53
            java.lang.String[] r5 = r5.pkgList
            if (r5 == 0) goto L53
            int r6 = r5.length
            if (r6 <= 0) goto L53
            r8 = r5[r1]
            r4 = 1
            goto L71
        L70:
            r8 = r10
        L71:
            boolean r11 = android.ext.Config.vSpaceReal
            if (r11 != 0) goto L8e
            if (r4 != 0) goto L81
            java.lang.Object r11 = r12.get(r9)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L81
            r8 = r11
            r4 = 1
        L81:
            if (r4 != 0) goto L8e
            java.lang.String r11 = r7.m(r9)
            if (r11 == 0) goto L8e
            r12.put(r9, r11)
            r8 = r11
            r4 = 1
        L8e:
            if (r4 == 0) goto La7
            android.ext.z1$c r11 = r7.i(r8)
            if (r11 == 0) goto La7
            int r8 = r11.f1425a
            int r12 = android.ext.z1.f1413d
            if (r8 != r12) goto L9e
            r11.f1425a = r9
        L9e:
            if (r0 == 0) goto La5
            java.util.Map r8 = android.ext.z1.f1412c
            r8.put(r10, r11)
        La5:
            return r11
        La6:
            r8 = r10
        La7:
            android.ext.z1$c r11 = new android.ext.z1$c
            r11.<init>(r9, r8)
            if (r4 == 0) goto L187
            if (r2 != 0) goto Lbb
            android.content.pm.ApplicationInfo r2 = android.ext.Tools.Y(r8)     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            goto Lbb
        Lb5:
            r9 = move-exception
            goto L15e
        Lb8:
            r9 = move-exception
            goto L162
        Lbb:
            if (r2 == 0) goto L187
            java.lang.String r12 = r7.j(r8, r2)     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            r11.f1428d = r12     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            if (r12 == 0) goto Lda
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            r12.<init>()     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            java.lang.String r4 = r11.f1428d     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            r12.append(r4)     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            java.lang.String r4 = ""
            r12.append(r4)     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            java.lang.String r12 = r12.toString()     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            r11.f1428d = r12     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
        Lda:
            java.lang.String r12 = r2.sourceDir     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            java.lang.String r4 = "/system/"
            boolean r12 = r12.startsWith(r4)     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            if (r12 != 0) goto Lf0
            int r12 = r2.flags     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            r4 = r12 & 128(0x80, float:1.8E-43)
            if (r4 != 0) goto Lf0
            r12 = r12 & r3
            if (r12 == 0) goto Lee
            goto Lf0
        Lee:
            r12 = 0
            goto Lf1
        Lf0:
            r12 = 1
        Lf1:
            r11.f1430f = r12     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            int r12 = r2.flags     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            r4 = 33554432(0x2000000, float:9.403955E-38)
            r12 = r12 & r4
            if (r12 == 0) goto Lfb
            r1 = 1
        Lfb:
            r11.f1431g = r1     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            java.lang.String r12 = r2.nativeLibraryDir     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            r11.f1429e = r12     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            int r12 = r2.uid     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            r11.f1426b = r12     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            java.util.HashMap r12 = android.ext.z1.j     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            java.lang.String r1 = " != "
            if (r12 == 0) goto L13d
            java.lang.Object r12 = r12.get(r8)     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            if (r12 == 0) goto L13d
            int r3 = r12.intValue()     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            int r4 = r2.uid     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            if (r3 == r4) goto L13d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            r3.<init>()     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            java.lang.String r4 = "real uid: "
            r3.append(r4)     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            int r2 = r2.uid     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            r3.append(r2)     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            r3.append(r1)     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            r3.append(r12)     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            java.lang.String r2 = r3.toString()     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            android.ext.e1.p(r2)     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            int r12 = r12.intValue()     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            r11.f1426b = r12     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
        L13d:
            int r12 = r11.f1426b     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            if (r12 == r9) goto L187
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            r12.<init>()     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            java.lang.String r2 = "vs app: "
            r12.append(r2)     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            int r2 = r11.f1426b     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            r12.append(r2)     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            r12.append(r1)     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            r12.append(r9)     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            java.lang.String r9 = r12.toString()     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            android.ext.e1.p(r9)     // Catch: java.lang.NoSuchMethodError -> Lb5 android.content.pm.PackageManager.NameNotFoundException -> Lb8
            goto L187
        L15e:
            android.ext.e1.a(r9)
            goto L187
        L162:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Package not found: "
            r12.append(r1)
            java.lang.String r1 = r11.f1427c
            r12.append(r1)
            java.lang.String r1 = " ["
            r12.append(r1)
            int r1 = r11.f1425a
            r12.append(r1)
            r1 = 93
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            android.ext.e1.l(r12, r9)
        L187:
            java.util.Map r9 = android.ext.z1.f1412c
            r9.put(r8, r11)
            if (r0 == 0) goto L197
            boolean r8 = r10.equals(r8)
            if (r8 != 0) goto L197
            r9.put(r10, r11)
        L197:
            return r11
    }

    private android.ext.z1.c i(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = android.ext.Tools.C0()
            boolean r1 = r3.equals(r0)
            if (r1 == 0) goto L11
            java.lang.String r3 = "GG"
            android.ext.z1$c r3 = k(r0, r3)
            goto L26
        L11:
            java.lang.String r0 = "com.bluestacks."
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L1e
            android.ext.z1$c r3 = k(r3, r3)
            goto L26
        L1e:
            java.util.Map r0 = android.ext.z1.f1412c
            java.lang.Object r3 = r0.get(r3)
            android.ext.z1$c r3 = (android.ext.z1.c) r3
        L26:
            return r3
    }

    private java.lang.String j(java.lang.String r4, android.content.pm.ApplicationInfo r5) {
            r3 = this;
            java.lang.String r4 = r5.packageName
            java.lang.String r5 = android.ext.Tools.a0(r5)     // Catch: java.lang.Throwable -> La
            if (r5 == 0) goto L21
            r4 = r5
            goto L21
        La:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed load label for: "
            r1.append(r2)
            java.lang.String r5 = r5.packageName
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            android.ext.e1.l(r5, r0)
        L21:
            return r4
    }

    private static android.ext.z1.c k(java.lang.String r2, java.lang.String r3) {
            android.ext.z1$c r0 = new android.ext.z1$c
            int r1 = android.ext.z1.f1413d
            r0.<init>(r1, r2)
            if (r3 == 0) goto Lb
            r0.f1428d = r3
        Lb:
            r2 = 1
            r0.h = r2
            return r0
    }

    public static android.graphics.drawable.Drawable l(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.util.Map r1 = android.ext.z1.f1415f
            monitor-enter(r1)
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L1a
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L11
            return r0
        L11:
            android.graphics.drawable.Drawable r1 = android.ext.Tools.R1(r2)
            if (r1 != r2) goto L18
            goto L19
        L18:
            r0 = r1
        L19:
            return r0
        L1a:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r2
    }

    private java.lang.String m(int r5) {
            r4 = this;
            boolean r0 = android.ext.Config.C
            if (r0 == 0) goto L7
            java.lang.String r5 = android.ext.Config.E
            return r5
        L7:
            boolean r0 = android.ext.Config.vSpaceReal
            r1 = 0
            if (r0 == 0) goto L3a
            java.util.HashMap r0 = android.ext.z1.j
            if (r0 == 0) goto L7a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r2 != 0) goto L27
            goto L18
        L27:
            java.lang.Object r3 = r2.getValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != r5) goto L18
            java.lang.Object r5 = r2.getKey()
            java.lang.String r5 = (java.lang.String) r5
        L39:
            return r1
        L3a:
            android.util.SparseIntArray r0 = android.ext.z1.f1414e
            int r0 = r0.get(r5)
            r2 = 1
            if (r0 == r2) goto L7a
            android.content.pm.PackageManager r0 = r4.f1418b     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r2.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = "uid:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L6f
            r2.append(r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = "uid"
            boolean r2 = android.ext.a0.a(r2, r3)     // Catch: java.lang.Throwable -> L6f
            java.lang.String[] r5 = r0.getPackagesForUid(r5)     // Catch: java.lang.Throwable -> L69
            if (r5 == 0) goto L6b
            int r0 = r5.length     // Catch: java.lang.Throwable -> L69
            if (r0 <= 0) goto L6b
            r0 = 0
            r1 = r5[r0]     // Catch: java.lang.Throwable -> L69
            goto L6b
        L69:
            r5 = move-exception
            goto L71
        L6b:
            android.ext.a0.b(r2)     // Catch: java.lang.Throwable -> L6f
            goto L7a
        L6f:
            r5 = move-exception
            goto L75
        L71:
            android.ext.a0.b(r2)     // Catch: java.lang.Throwable -> L6f
            throw r5     // Catch: java.lang.Throwable -> L6f
        L75:
            java.lang.String r0 = "Failed getPackagesForUid"
            android.ext.e1.l(r0, r5)
        L7a:
            return r1
    }

    private void n(android.ext.w r23) {
            r22 = this;
            r7 = r22
            r23.j()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            android.util.SparseIntArray r0 = android.ext.z1.h
            r0.clear()
            r9 = 0
            java.lang.String r0 = "getRunningAppProcesses: start"
            android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L37
            android.app.ActivityManager r0 = r7.f1417a     // Catch: java.lang.Throwable -> L37
            java.util.List r1 = r0.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "getRunningAppProcesses: end "
            r0.append(r2)     // Catch: java.lang.Throwable -> L35
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L35
            r0.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L35
            android.ext.e1.d(r0)     // Catch: java.lang.Throwable -> L35
        L33:
            r10 = r1
            goto L3f
        L35:
            r0 = move-exception
            goto L39
        L37:
            r0 = move-exception
            r1 = r9
        L39:
            java.lang.String r2 = "Failed getRunningAppProcesses"
            android.ext.e1.l(r2, r0)
            goto L33
        L3f:
            int r0 = android.os.Process.myPid()     // Catch: java.io.IOException -> Le5
            android.ext.MainService r1 = android.ext.MainService.instance     // Catch: java.io.IOException -> Le5
            android.ext.f0 r1 = r1.i     // Catch: java.io.IOException -> Le5
            int r11 = r1.J()     // Catch: java.io.IOException -> Le5
            android.ext.MainService r1 = android.ext.MainService.instance     // Catch: java.io.IOException -> Le5
            android.ext.f0 r1 = r1.i     // Catch: java.io.IOException -> Le5
            int r12 = r1.b0()     // Catch: java.io.IOException -> Le5
            a.e r13 = new a.e     // Catch: java.io.IOException -> Le5
            r13.<init>()     // Catch: java.io.IOException -> Le5
        L58:
            int r15 = r23.f()     // Catch: java.io.IOException -> Le5
            if (r15 != 0) goto L60
            goto L106
        L60:
            int r17 = r23.f()     // Catch: java.io.IOException -> Le5
            byte r1 = r23.e()     // Catch: java.io.IOException -> Le5
            if (r1 == 0) goto L6e
            r1 = 1
            r20 = 1
            goto L71
        L6e:
            r1 = 0
            r20 = 0
        L71:
            int r21 = r23.f()     // Catch: java.io.IOException -> Le5
            int r19 = r23.f()     // Catch: java.io.IOException -> Le5
            int r14 = r23.f()     // Catch: java.io.IOException -> Le5
            int r1 = r23.f()     // Catch: java.io.IOException -> Le5
            if (r1 < 0) goto Le7
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 <= r2) goto L89
            goto Le7
        L89:
            r6 = r23
            java.lang.String r18 = r6.i(r1, r9)     // Catch: java.io.IOException -> Le5
            if (r15 == r0) goto L58
            if (r15 == r11) goto L58
            if (r15 != r12) goto L96
            goto L58
        L96:
            r1 = r22
            r2 = r15
            r3 = r17
            r4 = r18
            r5 = r10
            r6 = r13
            android.ext.z1$c r1 = r1.h(r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> Le5
            if (r1 == 0) goto L58
            java.lang.String r2 = r1.f1427c     // Catch: java.io.IOException -> Le5
            java.lang.String r3 = android.ext.Tools.C0()     // Catch: java.io.IOException -> Le5
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> Le5
            if (r2 == 0) goto Lb2
            goto L58
        Lb2:
            android.ext.z1$d r2 = new android.ext.z1$d     // Catch: java.io.IOException -> Le5
            r3 = r14
            r14 = r2
            r4 = r15
            r15 = r1
            r16 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)     // Catch: java.io.IOException -> Le5
            r8.add(r2)     // Catch: java.io.IOException -> Le5
            if (r3 == 0) goto L58
            android.util.SparseIntArray r1 = android.ext.z1.h     // Catch: java.io.IOException -> Le5
            r1.put(r4, r3)     // Catch: java.io.IOException -> Le5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Le5
            r1.<init>()     // Catch: java.io.IOException -> Le5
            java.lang.String r2 = "Tracer: "
            r1.append(r2)     // Catch: java.io.IOException -> Le5
            r1.append(r3)     // Catch: java.io.IOException -> Le5
            java.lang.String r2 = " -> "
            r1.append(r2)     // Catch: java.io.IOException -> Le5
            r1.append(r4)     // Catch: java.io.IOException -> Le5
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> Le5
            android.ext.e1.d(r1)     // Catch: java.io.IOException -> Le5
            goto L58
        Le5:
            r0 = move-exception
            goto L101
        Le7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Le5
            r0.<init>()     // Catch: java.io.IOException -> Le5
            java.lang.String r2 = "Bad cmdline length: "
            r0.append(r2)     // Catch: java.io.IOException -> Le5
            r0.append(r1)     // Catch: java.io.IOException -> Le5
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> Le5
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.io.IOException -> Le5
            r1.<init>()     // Catch: java.io.IOException -> Le5
            android.ext.e1.l(r0, r1)     // Catch: java.io.IOException -> Le5
            goto L106
        L101:
            java.lang.String r1 = "???"
            android.ext.e1.l(r1, r0)
        L106:
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.j r0 = r0.h
            java.util.List r1 = r7.s(r8, r10)
            r0.d(r1)
            return
    }

    public static void o(android.ext.w r1) {
            android.ext.z1 r0 = android.ext.z1.i
            r0.n(r1)
            return
    }

    public static void p(java.util.List r3) {
            if (r3 != 0) goto L3
            return
        L3:
            int r0 = android.ext.z1.f1416g
            int r0 = r0 + 1
            android.ext.z1.f1416g = r0
            int r1 = r3.size()
            r2 = 128(0x80, float:1.8E-43)
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            q(r3, r0, r2, r1)
            return
    }

    private static void q(java.util.List r1, int r2, int r3, int r4) {
            android.ext.z1$b r0 = new android.ext.z1$b
            r0.<init>(r2, r3, r4, r1)
            android.ext.n2.h(r0)
            return
    }

    public static void r(java.lang.String r1, android.graphics.drawable.Drawable r2) {
            if (r1 == 0) goto L19
            if (r2 != 0) goto L5
            goto L19
        L5:
            android.graphics.drawable.Drawable r0 = android.ext.Tools.R1(r2)
            if (r0 == 0) goto L19
            if (r0 != r2) goto Le
            goto L19
        Le:
            java.util.Map r2 = android.ext.z1.f1415f
            monitor-enter(r2)
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r1
        L19:
            return
    }

    private java.util.List s(java.util.List r21, java.util.List r22) {
            r20 = this;
            java.lang.String r1 = "Class not found"
            int r0 = r21.size()
            android.ext.z1$d[] r0 = new android.ext.z1.d[r0]
            r2 = r21
            java.lang.Object[] r0 = r2.toArray(r0)
            r2 = r0
            android.ext.z1$d[] r2 = (android.ext.z1.d[]) r2
            r3 = 0
            r0 = 0
        L13:
            int r4 = r2.length
            r5 = 0
            if (r0 >= r4) goto L1f
            r4 = r2[r0]
            r4.k = r5
            int r0 = r0 + 1
            goto L13
        L1f:
            r4 = 2
            java.util.List[] r7 = new java.util.List[r4]
            r8 = r20
            android.app.ActivityManager r0 = r8.f1417a     // Catch: java.lang.Throwable -> L2f
            r9 = 50
            java.util.List r0 = r0.getRunningTasks(r9)     // Catch: java.lang.Throwable -> L2f
            r7[r3] = r0     // Catch: java.lang.Throwable -> L2f
            goto L35
        L2f:
            r0 = move-exception
            java.lang.String r9 = "Failed getRunningTasks"
            android.ext.e1.l(r9, r0)
        L35:
            r9 = 1
            r7[r9] = r22
            r10 = 0
        L39:
            if (r10 >= r4) goto L12c
            r11 = r7[r10]
            if (r11 != 0) goto L46
        L3f:
            r18 = r1
            r22 = r10
            r1 = 1
            goto L121
        L46:
            int r0 = r2.length
            boolean[] r12 = new boolean[r0]
            r13 = 0
        L4a:
            int r0 = r11.size()
            if (r13 >= r0) goto L3f
            java.lang.Object r14 = r11.get(r13)
            if (r14 != 0) goto L5d
        L56:
            r18 = r1
            r22 = r10
            r1 = 1
            goto L114
        L5d:
            r15 = 0
            boolean r0 = r14 instanceof android.app.ActivityManager.RunningTaskInfo     // Catch: java.lang.NoClassDefFoundError -> L76
            if (r0 == 0) goto La5
            r0 = r14
            android.app.ActivityManager$RunningTaskInfo r0 = (android.app.ActivityManager.RunningTaskInfo) r0     // Catch: java.lang.NoClassDefFoundError -> L76
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch: java.lang.NoClassDefFoundError -> L76
            android.content.ComponentName r6 = android.ext.x1.a(r0)     // Catch: java.lang.NoClassDefFoundError -> L76
            if (r6 == 0) goto L78
            android.content.ComponentName r6 = android.ext.x1.a(r0)     // Catch: java.lang.NoClassDefFoundError -> L76
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.NoClassDefFoundError -> L76
            goto L79
        L76:
            r0 = move-exception
            goto La2
        L78:
            r6 = r15
        L79:
            r5[r3] = r6     // Catch: java.lang.NoClassDefFoundError -> L76
            android.content.ComponentName r6 = android.ext.y1.a(r0)     // Catch: java.lang.NoClassDefFoundError -> L76
            if (r6 == 0) goto L8a
            android.content.ComponentName r0 = android.ext.y1.a(r0)     // Catch: java.lang.NoClassDefFoundError -> L76
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.NoClassDefFoundError -> L76
            goto L8b
        L8a:
            r0 = r15
        L8b:
            r5[r9] = r0     // Catch: java.lang.NoClassDefFoundError -> L76
            r6 = r5[r3]     // Catch: java.lang.NoClassDefFoundError -> L9a
            if (r6 == 0) goto L9d
            boolean r0 = r6.equals(r0)     // Catch: java.lang.NoClassDefFoundError -> L9a
            if (r0 == 0) goto L9d
            r5[r9] = r15     // Catch: java.lang.NoClassDefFoundError -> L9a
            goto L9d
        L9a:
            r0 = move-exception
            r15 = r5
            goto La2
        L9d:
            r16 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r5
            goto La7
        La2:
            android.ext.e1.s(r1, r0)
        La5:
            r16 = 0
        La7:
            boolean r0 = r14 instanceof android.app.ActivityManager.RunningAppProcessInfo     // Catch: java.lang.NoClassDefFoundError -> Lb2
            if (r0 == 0) goto Lb6
            android.app.ActivityManager$RunningAppProcessInfo r14 = (android.app.ActivityManager.RunningAppProcessInfo) r14     // Catch: java.lang.NoClassDefFoundError -> Lb2
            java.lang.String[] r15 = r14.pkgList     // Catch: java.lang.NoClassDefFoundError -> Lb2
            r16 = 1000(0x3e8, double:4.94E-321)
            goto Lb6
        Lb2:
            r0 = move-exception
            android.ext.e1.s(r1, r0)
        Lb6:
            if (r15 != 0) goto Lb9
            goto L56
        Lb9:
            int r0 = r15.length
            r5 = 0
        Lbb:
            if (r5 >= r0) goto L56
            r6 = r15[r5]
            if (r6 != 0) goto Lc9
        Lc1:
            r19 = r0
            r18 = r1
            r22 = r10
            r1 = 1
            goto L108
        Lc9:
            r14 = 0
        Lca:
            int r3 = r2.length
            if (r14 >= r3) goto Lc1
            boolean r3 = r12[r14]
            if (r3 == 0) goto Ld9
        Ld1:
            r19 = r0
            r18 = r1
            r22 = r10
            r1 = 1
            goto Lfd
        Ld9:
            r3 = r2[r14]
            if (r3 != 0) goto Lde
            goto Ld1
        Lde:
            java.lang.String r4 = r3.f1434c
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto Ld1
            r22 = r10
            long r9 = r3.k
            int r18 = r11.size()
            int r4 = r18 - r13
            r19 = r0
            r18 = r1
            long r0 = (long) r4
            long r0 = r0 * r16
            long r9 = r9 + r0
            r3.k = r9
            r1 = 1
            r12[r14] = r1
        Lfd:
            int r14 = r14 + 1
            r10 = r22
            r1 = r18
            r0 = r19
            r4 = 2
            r9 = 1
            goto Lca
        L108:
            int r5 = r5 + 1
            r10 = r22
            r1 = r18
            r0 = r19
            r3 = 0
            r4 = 2
            r9 = 1
            goto Lbb
        L114:
            int r13 = r13 + 1
            r10 = r22
            r1 = r18
            r3 = 0
            r4 = 2
            r5 = 0
            r9 = 1
            goto L4a
        L121:
            int r10 = r22 + 1
            r1 = r18
            r3 = 0
            r4 = 2
            r5 = 0
            r9 = 1
            goto L39
        L12c:
            java.util.Arrays.sort(r2)     // Catch: java.lang.Throwable -> L130
            goto L135
        L130:
            r0 = move-exception
            r1 = r0
            android.ext.e1.a(r1)
        L135:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.length
            r0.<init>(r1)
            r3 = 0
        L13c:
            int r1 = r2.length
            if (r3 >= r1) goto L147
            r1 = r2[r3]
            r0.add(r1)
            int r3 = r3 + 1
            goto L13c
        L147:
            return r0
    }
}
