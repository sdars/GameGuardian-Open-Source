package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
abstract class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f1238a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.String[] f1239b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f1240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f1241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile boolean f1242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile boolean f1243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile boolean f1244g;
    private static final char[] h = null;
    private static java.lang.String[] i;
    private static volatile boolean j;
    private static final java.lang.Runnable k = null;

    class a implements java.lang.Runnable {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                android.ext.s1.z()
                return
        }
    }

    class b implements java.lang.Runnable {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                android.ext.s1.K()
                return
        }
    }

    class c implements java.lang.Runnable {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                android.ext.s1.a()
                return
        }
    }

    class d implements android.content.DialogInterface.OnClickListener {

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.s1.d f1245a;

            a(android.ext.s1.d r1) {
                    r0 = this;
                    r0.f1245a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    boolean r0 = android.ext.s1.u()
                    if (r0 == 0) goto L14
                    int r0 = android.ext.s1.O()
                    r1 = 1
                    if (r0 != r1) goto L14
                    android.ext.r r0 = android.ext.r.n
                    if (r0 == 0) goto L14
                    android.ext.s1.b()
                L14:
                    return
            }
        }

        d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.content.Context r1 = android.ext.r.p
                android.ext.s1$d$a r2 = new android.ext.s1$d$a
                r2.<init>(r0)
                android.ext.f1.r(r1, r2)
                return
        }
    }

    class e implements android.content.DialogInterface.OnClickListener {
        e() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.ext.s1.s()
                return
        }
    }

    class f implements android.content.DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog f1246a;

        f(android.app.AlertDialog r1) {
                r0 = this;
                r0.f1246a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface r1) {
                r0 = this;
                android.app.AlertDialog r1 = r0.f1246a
                android.ext.Tools.u1(r1)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            android.ext.s1.f1238a = r0
            java.lang.String r1 = "intro-shown"
            java.lang.String r2 = "permissions-requested"
            java.lang.String r3 = "permissions-settled"
            java.lang.String r4 = "overlay-shown"
            java.lang.String r5 = "overlay-settled"
            java.lang.String r6 = "complete"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6}
            android.ext.s1.f1239b = r0
            r0 = 0
            android.ext.s1.f1240c = r0
            android.ext.s1.f1241d = r0
            android.ext.s1.f1242e = r0
            android.ext.s1.f1243f = r0
            java.lang.String r0 = "0123456789ABCDEF"
            char[] r0 = r0.toCharArray()
            android.ext.s1.h = r0
            android.ext.s1$c r0 = new android.ext.s1$c
            r0.<init>()
            android.ext.s1.k = r0
            return
    }

    static void A() {
            boolean r0 = u()
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = O()
            r1 = 3
            if (r0 == r1) goto Lf
            return
        Lf:
            r0 = 0
            android.ext.s1.f1244g = r0
            android.ext.z.m()
            return
    }

    static void B() {
            boolean r0 = u()
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = O()
            r1 = 2
            if (r0 == r1) goto Lf
            return
        Lf:
            java.lang.String r0 = "permissions-settled"
            T(r0)
            r0 = 3
            M(r0)
            r0 = 0
            android.ext.s1.f1240c = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L2a
            java.lang.String r0 = "overlay-settled"
            T(r0)
            l()
            return
        L2a:
            android.ext.z.m()
            L()
            return
    }

    static void C() {
            boolean r0 = android.ext.s1.j
            r1 = 0
            if (r0 == 0) goto L10
            boolean r0 = q()
            if (r0 == 0) goto L10
            android.ext.s1.j = r1
            m()
        L10:
            boolean r0 = u()
            if (r0 != 0) goto L17
            return
        L17:
            int r0 = O()
            r2 = 1
            if (r0 != r2) goto L26
            boolean r0 = android.ext.s1.f1241d
            if (r0 != 0) goto L32
        L22:
            o()
            goto L32
        L26:
            r2 = 2
            if (r0 != r2) goto L2a
            goto L22
        L2a:
            r2 = 3
            if (r0 != r2) goto L32
            android.ext.s1.f1244g = r1
            android.ext.z.m()
        L32:
            return
    }

    static boolean D() {
            boolean r0 = android.ext.s1.f1244g
            return r0
    }

    static boolean E() {
            boolean r0 = android.ext.s1.f1243f
            return r0
    }

    private static java.lang.String F() {
            java.lang.Object r0 = android.ext.s1.f1238a     // Catch: java.lang.Throwable -> L23
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L23
            android.content.SharedPreferences r1 = android.ext.Tools.M0()     // Catch: java.lang.Throwable -> L11
            boolean r2 = R(r1)     // Catch: java.lang.Throwable -> L11
            if (r2 != 0) goto L13
            java.lang.String r1 = ""
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r1 = move-exception
            goto L21
        L13:
            java.lang.String r2 = "onboarding-queue"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L1f
            java.lang.String r1 = ""
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            r0 = move-exception
            android.ext.e1.a(r0)
            java.lang.String r0 = ""
            return r0
    }

    private static java.lang.String G() {
            r0 = 0
            java.lang.Object r1 = android.ext.s1.f1238a     // Catch: java.lang.Throwable -> L5c
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L5c
            android.content.SharedPreferences r2 = android.ext.Tools.M0()     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "onboarding-queue"
            java.lang.String r4 = ""
            java.lang.String r3 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L56
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L24
            if (r4 != 0) goto L19
            goto L56
        L19:
            r4 = 44
            int r4 = r3.indexOf(r4)     // Catch: java.lang.Throwable -> L24
            if (r4 >= 0) goto L26
            java.lang.String r4 = ""
            goto L32
        L24:
            r2 = move-exception
            goto L5a
        L26:
            r5 = 0
            java.lang.String r5 = r3.substring(r5, r4)     // Catch: java.lang.Throwable -> L24
            int r4 = r4 + 1
            java.lang.String r4 = r3.substring(r4)     // Catch: java.lang.Throwable -> L24
            r3 = r5
        L32:
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L24
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L24
            if (r5 <= 0) goto L42
            java.lang.String r5 = "onboarding-queue"
            r2.putString(r5, r4)     // Catch: java.lang.Throwable -> L24
            goto L47
        L42:
            java.lang.String r4 = "onboarding-queue"
            r2.remove(r4)     // Catch: java.lang.Throwable -> L24
        L47:
            boolean r2 = r2.commit()     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L54
            java.lang.String r2 = "Failed consume onboarding queue item"
            android.ext.e1.p(r2)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r0
        L54:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r3
        L56:
            java.lang.String r2 = ""
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return r2
        L5a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r2     // Catch: java.lang.Throwable -> L5c
        L5c:
            r1 = move-exception
            android.ext.e1.a(r1)
            return r0
    }

    static void H() {
            r0 = 1
            android.ext.s1.j = r0
            return
    }

    static void I() {
            android.ext.f1.F()
            return
    }

    private static void J(int r2, java.lang.String r3) {
            r0 = 1
            if (r2 == r0) goto L2e
            r0 = 2
            if (r2 == r0) goto L27
            r3 = 4
            if (r2 == r3) goto L20
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r3.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = "Failed replay onboarding prompt: unknown code "
            r3.append(r0)     // Catch: java.lang.Throwable -> L1e
            r3.append(r2)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1e
            android.ext.e1.p(r3)     // Catch: java.lang.Throwable -> L1e
            goto L36
        L1e:
            r3 = move-exception
            goto L44
        L20:
            java.lang.Runnable r3 = android.ext.s1.k     // Catch: java.lang.Throwable -> L1e
            boolean r2 = android.ext.f1.G(r3)     // Catch: java.lang.Throwable -> L1e
            goto L34
        L27:
            java.lang.Runnable r0 = android.ext.s1.k     // Catch: java.lang.Throwable -> L1e
            boolean r2 = android.ext.x2.o(r3, r0)     // Catch: java.lang.Throwable -> L1e
            goto L34
        L2e:
            java.lang.Runnable r0 = android.ext.s1.k     // Catch: java.lang.Throwable -> L1e
            boolean r2 = android.ext.x2.p(r3, r0)     // Catch: java.lang.Throwable -> L1e
        L34:
            if (r2 != 0) goto L43
        L36:
            boolean r2 = j()
            if (r2 != 0) goto L40
            P()
            return
        L40:
            m()
        L43:
            return
        L44:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed replay onboarding prompt "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            android.ext.e1.s(r2, r3)
            P()
            return
    }

    static void K() {
            boolean r0 = q()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = F()
            int r1 = r0.length()
            r2 = 1
            if (r1 != 0) goto L16
            i(r2)
            return
        L16:
            android.ext.s1.f1243f = r2
            java.lang.Class<android.ext.s1> r1 = android.ext.s1.class
            monitor-enter(r1)
            java.lang.String[] r2 = android.ext.s1.i     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L26
            int r2 = r2.length     // Catch: java.lang.Throwable -> L24
            if (r2 <= 0) goto L26
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r0 = move-exception
            goto L33
        L26:
            java.lang.String r2 = ","
            java.lang.String[] r0 = r0.split(r2)     // Catch: java.lang.Throwable -> L24
            android.ext.s1.i = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            m()
            return
        L33:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r0
    }

    private static void L() {
            android.os.Handler r0 = android.ext.n2.d()     // Catch: java.lang.Throwable -> Lf
            android.ext.s1$a r1 = new android.ext.s1$a     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            r2 = 20000(0x4e20, double:9.8813E-320)
            r0.postDelayed(r1, r2)     // Catch: java.lang.Throwable -> Lf
            goto L13
        Lf:
            r0 = move-exception
            android.ext.e1.a(r0)
        L13:
            return
    }

    private static void M(int r4) {
            java.lang.Object r0 = android.ext.s1.f1238a     // Catch: java.lang.Throwable -> L1d
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L1d
            android.content.SharedPreferences r1 = android.ext.Tools.M0()     // Catch: java.lang.Throwable -> L1a
            android.content.SharedPreferences$Editor r1 = f(r1)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "onboarding-step"
            r3 = 161550(0x2770e, float:2.2638E-40)
            int r4 = r4 + r3
            android.content.SharedPreferences$Editor r4 = r1.putInt(r2, r4)     // Catch: java.lang.Throwable -> L1a
            r4.commit()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            goto L21
        L1a:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r4     // Catch: java.lang.Throwable -> L1d
        L1d:
            r4 = move-exception
            android.ext.e1.a(r4)
        L21:
            return
    }

    private static void N() {
            android.content.Context r0 = android.ext.r.p
            android.app.AlertDialog$Builder r0 = android.ext.f.c(r0)
            r1 = 2131296879(0x7f09026f, float:1.8211687E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            r1 = 0
            android.app.AlertDialog$Builder r0 = r0.setCancelable(r1)
            java.lang.String r1 = t()
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            r1 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.ext.s1$e r2 = new android.ext.s1$e
            r2.<init>()
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            r1 = 2131296786(0x7f090212, float:1.8211499E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.ext.s1$d r2 = new android.ext.s1$d
            r2.<init>()
            android.app.AlertDialog$Builder r0 = r0.setNeutralButton(r1, r2)
            android.app.AlertDialog r0 = r0.create()
            android.ext.s1$f r1 = new android.ext.s1$f
            r1.<init>(r0)
            android.ext.f.l(r0, r1)
            android.ext.f.m(r0)
            return
    }

    static int O() {
            r0 = 0
            android.content.SharedPreferences r1 = android.ext.Tools.M0()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "onboarding-step"
            int r1 = r1.getInt(r2, r0)     // Catch: java.lang.Throwable -> L1c
            int r2 = r1 / 10
            r3 = 16155(0x3f1b, float:2.2638E-41)
            if (r2 == r3) goto L12
            return r0
        L12:
            int r1 = r1 % 10
            if (r1 < 0) goto L1b
            r2 = 5
            if (r1 <= r2) goto L1a
            goto L1b
        L1a:
            return r1
        L1b:
            return r0
        L1c:
            r1 = move-exception
            android.ext.e1.a(r1)
            return r0
    }

    private static void P() {
            java.lang.Class<android.ext.s1> r0 = android.ext.s1.class
            monitor-enter(r0)
            r1 = 0
            android.ext.s1.i = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    static boolean Q() {
            r0 = 0
            java.lang.Object r1 = android.ext.s1.f1238a     // Catch: java.lang.Throwable -> L40
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L40
            android.content.SharedPreferences r2 = android.ext.Tools.M0()     // Catch: java.lang.Throwable -> L19
            boolean r3 = R(r2)     // Catch: java.lang.Throwable -> L19
            r4 = 1
            if (r3 == 0) goto L1b
            java.lang.String r3 = "onboarding-shutdown-expected"
            boolean r3 = r2.getBoolean(r3, r0)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L1b
            r3 = 1
            goto L1c
        L19:
            r2 = move-exception
            goto L3e
        L1b:
            r3 = 0
        L1c:
            java.lang.String r5 = "onboarding-shutdown-expected"
            boolean r5 = r2.contains(r5)     // Catch: java.lang.Throwable -> L19
            if (r5 == 0) goto L31
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = "onboarding-shutdown-expected"
            android.content.SharedPreferences$Editor r2 = r2.remove(r5)     // Catch: java.lang.Throwable -> L19
            r2.commit()     // Catch: java.lang.Throwable -> L19
        L31:
            if (r3 == 0) goto L3b
            int r2 = O()     // Catch: java.lang.Throwable -> L19
            r3 = 2
            if (r2 < r3) goto L3b
            goto L3c
        L3b:
            r4 = 0
        L3c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            return r4
        L3e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            throw r2     // Catch: java.lang.Throwable -> L40
        L40:
            r1 = move-exception
            android.ext.e1.a(r1)
            return r0
    }

    private static boolean R(android.content.SharedPreferences r2) {
            java.lang.String r0 = "onboarding-build"
            r1 = -1
            int r2 = r2.getInt(r0, r1)
            r0 = 16155(0x3f1b, float:2.2638E-41)
            if (r2 != r0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            return r2
    }

    static java.lang.String S(java.lang.String r6) {
            if (r6 == 0) goto L53
            int r0 = r6.length()
            if (r0 != 0) goto L9
            goto L53
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length()
            r0.<init>(r1)
            r1 = 0
        L13:
            int r2 = r6.length()
            if (r1 >= r2) goto L4e
            char r2 = r6.charAt(r1)
            r3 = 37
            if (r2 != r3) goto L48
            int r3 = r1 + 2
            int r4 = r6.length()
            if (r3 >= r4) goto L48
            int r4 = r1 + 1
            char r4 = r6.charAt(r4)
            int r4 = r(r4)
            char r5 = r6.charAt(r3)
            int r5 = r(r5)
            if (r4 < 0) goto L48
            if (r5 < 0) goto L48
            int r1 = r4 << 4
            r1 = r1 | r5
            char r1 = (char) r1
            r0.append(r1)
            r1 = r3
            goto L4b
        L48:
            r0.append(r2)
        L4b:
            int r1 = r1 + 1
            goto L13
        L4e:
            java.lang.String r6 = r0.toString()
            return r6
        L53:
            java.lang.String r6 = ""
            return r6
    }

    static void T(java.lang.String r3) {
            if (r3 != 0) goto L8
            java.lang.String r3 = "Failed write onboarding stage: null code"
        L4:
            android.ext.e1.p(r3)
            return
        L8:
            r0 = 0
        L9:
            java.lang.String[] r1 = android.ext.s1.f1239b
            int r2 = r1.length
            if (r0 >= r2) goto L43
            r1 = r1[r0]
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L40
            java.lang.String r0 = "onboarding.stage"
            java.io.File r0 = k(r0)     // Catch: java.lang.Throwable -> L33
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L33
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L33
            r2 = 384(0x180, float:5.38E-43)
            android.ext.Tools.q(r0, r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = "US-ASCII"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L35
            r1.write(r3)     // Catch: java.lang.Throwable -> L35
            r1.close()     // Catch: java.lang.Throwable -> L33
            goto L3f
        L33:
            r3 = move-exception
            goto L3a
        L35:
            r3 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L33
        L3a:
            java.lang.String r0 = "Failed write onboarding stage"
            android.ext.e1.s(r0, r3)
        L3f:
            return
        L40:
            int r0 = r0 + 1
            goto L9
        L43:
            java.lang.String r3 = "Failed write onboarding stage: unknown code"
            goto L4
    }

    static /* synthetic */ void a() {
            c()
            return
    }

    static /* synthetic */ void b() {
            N()
            return
    }

    private static void c() {
            boolean r0 = j()
            if (r0 != 0) goto La
            P()
            return
        La:
            boolean r0 = android.ext.s1.j
            if (r0 == 0) goto Lf
            return
        Lf:
            m()
            return
    }

    static void d() {
            boolean r0 = q()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = u()
            if (r0 != 0) goto L11
            K()
            return
        L11:
            r0 = 1
            android.ext.s1.f1243f = r0
            r1 = 0
            android.ext.s1.f1240c = r1
            boolean r1 = android.ext.s1.f1242e
            if (r1 != 0) goto L20
            android.ext.s1.f1242e = r0
            I()
        L20:
            int r1 = O()
            if (r1 == 0) goto L28
            if (r1 != r0) goto L37
        L28:
            if (r1 != 0) goto L32
            M(r0)
            java.lang.String r1 = "intro-shown"
            T(r1)
        L32:
            android.ext.s1.f1241d = r0
            N()
        L37:
            return
    }

    static void e() {
            r0 = 0
            android.ext.s1.j = r0
            return
    }

    private static android.content.SharedPreferences.Editor f(android.content.SharedPreferences r3) {
            android.content.SharedPreferences$Editor r0 = r3.edit()
            boolean r3 = R(r3)
            if (r3 != 0) goto L1d
            java.lang.String r3 = "onboarding-queue"
            android.content.SharedPreferences$Editor r3 = r0.remove(r3)
            java.lang.String r1 = "onboarding-shutdown-expected"
            android.content.SharedPreferences$Editor r3 = r3.remove(r1)
            java.lang.String r1 = "onboarding-build"
            r2 = 16155(0x3f1b, float:2.2638E-41)
            r3.putInt(r1, r2)
        L1d:
            return r0
    }

    static void g() {
            r0 = 0
            android.ext.s1.f1244g = r0
            return
    }

    private static void h() {
            java.lang.String r0 = "complete"
            T(r0)
            r0 = 4
            M(r0)
            return
    }

    private static boolean i(boolean r3) {
            r0 = 0
            java.lang.Object r1 = android.ext.s1.f1238a     // Catch: java.lang.Throwable -> L25
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = F()     // Catch: java.lang.Throwable -> L10
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L10
            if (r2 <= 0) goto L12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            r3 = move-exception
            goto L23
        L12:
            if (r3 == 0) goto L1d
            int r3 = O()     // Catch: java.lang.Throwable -> L10
            r2 = 5
            if (r3 == r2) goto L1d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L1d:
            h()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            r3 = 1
            return r3
        L23:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r3     // Catch: java.lang.Throwable -> L25
        L25:
            r3 = move-exception
            android.ext.e1.a(r3)
            return r0
    }

    private static boolean j() {
            java.lang.String r0 = G()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private static java.io.File k(java.lang.String r2) {
            java.io.File r0 = android.ext.Tools.p0()
            if (r0 == 0) goto Lf
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto Lf
            r0.mkdirs()
        Lf:
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r2)
            return r1
    }

    static void l() {
            boolean r0 = u()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            android.ext.s1.f1240c = r0
            boolean r0 = i(r0)
            if (r0 == 0) goto L11
            return
        L11:
            r0 = 5
            M(r0)
            android.ext.s1$b r0 = new android.ext.s1$b
            r0.<init>()
            android.ext.n2.i(r0)
            return
    }

    private static void m() {
            java.lang.String r0 = F()
            int r1 = r0.length()
            r2 = 1
            if (r1 != 0) goto L19
            java.lang.Class<android.ext.s1> r1 = android.ext.s1.class
            monitor-enter(r1)
            r0 = 0
            android.ext.s1.i = r0     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            i(r2)
            return
        L16:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r0
        L19:
            r1 = 44
            int r1 = r0.indexOf(r1)
            r3 = 0
            if (r1 < 0) goto L26
            java.lang.String r0 = r0.substring(r3, r1)
        L26:
            r1 = 58
            int r1 = r0.indexOf(r1)
            if (r1 >= 0) goto L3c
            boolean r0 = j()
            if (r0 != 0) goto L38
            P()
            return
        L38:
            m()
            return
        L3c:
            java.lang.String r3 = r0.substring(r3, r1)     // Catch: java.lang.NumberFormatException -> L51
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L51
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r0 = S(r0)
            J(r3, r0)
            return
        L51:
            r0 = move-exception
            java.lang.String r1 = "Failed replay onboarding prompt: bad code"
            android.ext.e1.s(r1, r0)
            boolean r0 = j()
            if (r0 != 0) goto L61
            P()
            return
        L61:
            m()
            return
    }

    static boolean n() {
            r0 = 0
            boolean r1 = u()     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L36
            boolean r1 = q()     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto Le
            goto L36
        Le:
            int r1 = O()     // Catch: java.lang.Throwable -> L32
            r2 = 5
            r3 = 1
            if (r1 != r2) goto L17
            return r3
        L17:
            java.lang.Class<android.ext.s1> r1 = android.ext.s1.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L32
            java.lang.String[] r2 = android.ext.s1.i     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L25
            int r2 = r2.length     // Catch: java.lang.Throwable -> L23
            if (r2 <= 0) goto L25
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            return r3
        L23:
            r2 = move-exception
            goto L34
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = F()     // Catch: java.lang.Throwable -> L32
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L32
            if (r1 <= 0) goto L31
            r0 = 1
        L31:
            return r0
        L32:
            r1 = move-exception
            goto L37
        L34:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            throw r2     // Catch: java.lang.Throwable -> L32
        L36:
            return r0
        L37:
            android.ext.e1.a(r1)
            return r0
    }

    private static void o() {
            boolean r0 = android.ext.s1.f1240c
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            android.ext.s1.f1240c = r0
            r0 = 2
            M(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L16
            B()
            return
        L16:
            android.ext.r r0 = android.ext.r.n
            if (r0 == 0) goto L1d
            r0.m()
        L1d:
            return
    }

    static java.lang.String p(java.lang.String r5) {
            if (r5 == 0) goto L44
            int r0 = r5.length()
            if (r0 != 0) goto L9
            goto L44
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.length()
            r0.<init>(r1)
            r1 = 0
        L13:
            int r2 = r5.length()
            if (r1 >= r2) goto L3f
            char r2 = r5.charAt(r1)
            java.lang.String r3 = "%,:;|"
            int r3 = r3.indexOf(r2)
            if (r3 < 0) goto L39
            r3 = 37
            r0.append(r3)
            char[] r3 = android.ext.s1.h
            int r4 = r2 >> 4
            r4 = r4 & 15
            char r4 = r3[r4]
            r0.append(r4)
            r2 = r2 & 15
            char r2 = r3[r2]
        L39:
            r0.append(r2)
            int r1 = r1 + 1
            goto L13
        L3f:
            java.lang.String r5 = r0.toString()
            return r5
        L44:
            java.lang.String r5 = ""
            return r5
    }

    private static boolean q() {
            boolean r0 = android.ext.Config.vSpaceReal
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.String r0 = android.ext.i.f1000b
            java.lang.String r2 = android.ext.Tools.C0()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L13
            return r1
        L13:
            java.io.File r0 = new java.io.File
            java.lang.String r2 = "2gdwd2JJ1vnls1lqvwdoo"
            java.lang.String r2 = android.ext.Tools.removeNewLinesChars(r2)
            r0.<init>(r2)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L25
            return r1
        L25:
            r0 = 1
            return r0
    }

    private static int r(char r2) {
            r0 = 48
            if (r2 < r0) goto La
            r1 = 57
            if (r2 > r1) goto La
            int r2 = r2 - r0
            return r2
        La:
            r0 = 65
            if (r2 < r0) goto L15
            r0 = 70
            if (r2 > r0) goto L15
            int r2 = r2 + (-55)
            return r2
        L15:
            r0 = 97
            if (r2 < r0) goto L20
            r0 = 102(0x66, float:1.43E-43)
            if (r2 > r0) goto L20
            int r2 = r2 + (-87)
            return r2
        L20:
            r2 = -1
            return r2
    }

    static void s() {
            boolean r0 = u()
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = O()
            r1 = 1
            if (r0 == r1) goto Lf
            return
        Lf:
            r0 = 0
            android.ext.s1.f1241d = r0
            android.ext.r r0 = android.ext.r.n
            if (r0 == 0) goto L19
            r0.p()
        L19:
            return
    }

    private static java.lang.String t() {
            r0 = 2131296787(0x7f090213, float:1.82115E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            return r0
    }

    static boolean u() {
            r0 = 0
            boolean r1 = q()     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            int r1 = O()     // Catch: java.lang.Throwable -> L10
            r2 = 4
            if (r1 >= r2) goto L12
            r0 = 1
            goto L12
        L10:
            r1 = move-exception
            goto L13
        L12:
            return r0
        L13:
            android.ext.e1.a(r1)
            return r0
    }

    static void v(int r5, java.lang.String r6) {
            if (r5 > 0) goto L8
            java.lang.String r5 = "Failed note deferred onboarding prompt: bad code"
            android.ext.e1.p(r5)
            return
        L8:
            if (r6 != 0) goto Lc
            java.lang.String r6 = ""
        Lc:
            java.lang.Object r0 = android.ext.s1.f1238a     // Catch: java.lang.Throwable -> L6d
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L6d
            android.content.SharedPreferences r1 = android.ext.Tools.M0()     // Catch: java.lang.Throwable -> L26
            android.content.SharedPreferences$Editor r2 = f(r1)     // Catch: java.lang.Throwable -> L26
            boolean r3 = R(r1)     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L28
            java.lang.String r3 = "onboarding-queue"
            java.lang.String r4 = ""
            java.lang.String r1 = r1.getString(r3, r4)     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r5 = move-exception
            goto L6b
        L28:
            java.lang.String r1 = ""
        L2a:
            if (r1 != 0) goto L2e
            java.lang.String r1 = ""
        L2e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r3.<init>()     // Catch: java.lang.Throwable -> L26
            r3.append(r5)     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = ":"
            r3.append(r5)     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = p(r6)     // Catch: java.lang.Throwable -> L26
            r3.append(r5)     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L26
            java.lang.String r6 = "onboarding-queue"
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L26
            if (r3 <= 0) goto L62
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r3.<init>()     // Catch: java.lang.Throwable -> L26
            r3.append(r1)     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = ","
            r3.append(r1)     // Catch: java.lang.Throwable -> L26
            r3.append(r5)     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L26
        L62:
            android.content.SharedPreferences$Editor r5 = r2.putString(r6, r5)     // Catch: java.lang.Throwable -> L26
            r5.commit()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            goto L71
        L6b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r5     // Catch: java.lang.Throwable -> L6d
        L6d:
            r5 = move-exception
            android.ext.e1.a(r5)
        L71:
            return
    }

    static void w() {
            java.lang.Object r0 = android.ext.s1.f1238a     // Catch: java.lang.Throwable -> L1a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L1a
            android.content.SharedPreferences r1 = android.ext.Tools.M0()     // Catch: java.lang.Throwable -> L17
            android.content.SharedPreferences$Editor r1 = f(r1)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "onboarding-shutdown-expected"
            r3 = 1
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r2, r3)     // Catch: java.lang.Throwable -> L17
            r1.commit()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L1e
        L17:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1     // Catch: java.lang.Throwable -> L1a
        L1a:
            r0 = move-exception
            android.ext.e1.a(r0)
        L1e:
            return
    }

    static void x() {
            r0 = 1
            android.ext.s1.f1244g = r0
            return
    }

    static void y() {
            boolean r0 = u()
            if (r0 == 0) goto Lb
            java.lang.String r0 = "permissions-requested"
            T(r0)
        Lb:
            return
    }

    static void z() {
            boolean r0 = u()
            if (r0 == 0) goto L20
            int r0 = O()
            r1 = 3
            if (r0 == r1) goto Le
            goto L20
        Le:
            boolean r0 = android.ext.z.y()
            if (r0 != 0) goto L1d
            boolean r0 = android.ext.s1.f1244g
            if (r0 == 0) goto L19
            goto L1d
        L19:
            android.ext.z.F()
            return
        L1d:
            L()
        L20:
            return
    }
}
