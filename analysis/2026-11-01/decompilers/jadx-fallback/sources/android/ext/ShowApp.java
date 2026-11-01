package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class ShowApp extends android.fix.ImageView {
    private static java.util.ArrayList k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.view.WindowManager.LayoutParams f453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    android.view.WindowManager.LayoutParams f454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    android.fix.TextView f455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    android.view.WindowManager.LayoutParams f456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile boolean f457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile boolean f458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile android.view.View f459g;
    volatile android.view.View h;
    volatile android.view.View i;
    final java.lang.Runnable j;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.ShowApp f460a;

        a(android.ext.ShowApp r1) {
                r0 = this;
                r0.f460a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.ext.ShowApp r0 = r2.f460a
                boolean r0 = r0.f457e
                if (r0 != 0) goto L7
                return
            L7:
                android.ext.ShowApp r0 = r2.f460a
                android.fix.TextView r1 = r0.f455c
                boolean r0 = r0.b(r1)
                if (r0 == 0) goto L16
                android.ext.ShowApp r0 = r2.f460a
                r1 = 0
                r0.f457e = r1
            L16:
                return
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.ShowApp f462b;

        b(android.ext.ShowApp r1, boolean r2) {
                r0 = this;
                r0.f462b = r1
                r0.f461a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.ext.ShowApp r0 = r2.f462b
                boolean r0 = r0.b(r0)
                if (r0 == 0) goto Ld
                android.ext.ShowApp r0 = r2.f462b
                r1 = 0
                r0.f458f = r1
            Ld:
                boolean r0 = r2.f461a
                if (r0 != 0) goto L20
                android.ext.ShowApp r0 = r2.f462b
                android.view.View r1 = r0.h
                boolean r0 = r0.b(r1)
                if (r0 == 0) goto L20
                android.ext.ShowApp r0 = r2.f462b
                r1 = 0
                r0.h = r1
            L20:
                return
        }
    }

    class c implements android.view.View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.ShowApp f463a;

        c(android.ext.ShowApp r1) {
                r0 = this;
                r0.f463a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r3, android.view.MotionEvent r4) {
                r2 = this;
                int r3 = r4.getAction()
                r4 = 1
                if (r3 == 0) goto L14
                r0 = 0
                if (r3 == r4) goto Le
                r1 = 3
                if (r3 == r1) goto Le
                return r0
            Le:
                android.ext.ShowApp r3 = r2.f463a
                r3.h(r0)
                return r4
            L14:
                android.ext.ShowApp r3 = r2.f463a
                r3.h(r4)
                return r4
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.ShowApp f464a;

        d(android.ext.ShowApp r1) {
                r0 = this;
                r0.f464a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.ext.ShowApp r0 = r1.f464a
                r0.e()
                return
        }
    }

    class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.ShowApp f465a;

        e(android.ext.ShowApp r1) {
                r0 = this;
                r0.f465a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.ext.ShowApp r0 = r4.f465a
                android.view.View r0 = r0.f459g
                if (r0 != 0) goto L18
                android.ext.ShowApp r0 = r4.f465a
                r0.o()
                android.os.Handler r0 = android.ext.n2.d()
                android.ext.ShowApp r1 = r4.f465a
                java.lang.Runnable r1 = r1.j
                r2 = 2000(0x7d0, double:9.88E-321)
                r0.postDelayed(r1, r2)
            L18:
                return
        }
    }

    class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.ShowApp f466a;

        f(android.ext.ShowApp r1) {
                r0 = this;
                r0.f466a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.os.Handler r0 = android.ext.n2.d()
                android.ext.ShowApp r1 = r4.f466a
                java.lang.Runnable r1 = r1.j
                r0.removeCallbacks(r1)
                android.ext.ShowApp r0 = r4.f466a
                android.view.View r1 = r0.f459g
                r0.f(r1)
                android.ext.MainService r0 = android.ext.MainService.instance
                if (r0 != 0) goto L17
                return
            L17:
                android.view.View r1 = r0.f213c
                if (r1 != 0) goto L1c
                return
            L1c:
                android.view.View r0 = r0.f214d
                if (r0 == 0) goto L34
                android.ext.MainService r2 = android.ext.MainService.instance
                android.ext.i1 r2 = r2.n
                if (r2 == 0) goto L34
                android.ext.ShowApp r2 = r4.f466a
                android.view.WindowManager$LayoutParams r3 = r2.f454b
                boolean r2 = r2.l(r0, r3)
                if (r2 == 0) goto L34
                android.ext.ShowApp r2 = r4.f466a
                r2.h = r0
            L34:
                android.ext.ShowApp r0 = r4.f466a
                android.view.WindowManager$LayoutParams r2 = r0.f454b
                boolean r0 = r0.l(r1, r2)
                if (r0 == 0) goto L42
                android.ext.ShowApp r0 = r4.f466a
                r0.f459g = r1
            L42:
                return
        }
    }

    class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.ShowApp f467a;

        g(android.ext.ShowApp r1) {
                r0 = this;
                r0.f467a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.ext.ShowApp r0 = r2.f467a
                android.view.View r0 = r0.f459g
                if (r0 != 0) goto L7
                return
            L7:
                android.ext.MainService r1 = android.ext.MainService.instance
                android.view.View r1 = r1.f213c
                if (r1 == 0) goto L14
                android.ext.MainService r1 = android.ext.MainService.instance
                android.ext.i1 r1 = r1.n
                if (r1 == 0) goto L14
                return
            L14:
                android.ext.ShowApp r1 = r2.f467a
                r1.f(r0)
                return
        }
    }

    class h implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.ShowApp f468a;

        h(android.ext.ShowApp r1) {
                r0 = this;
                r0.f468a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.ext.ShowApp r0 = r3.f468a
                android.view.View r1 = r0.i
                boolean r0 = r0.b(r1)
                if (r0 == 0) goto Lf
                android.ext.ShowApp r0 = r3.f468a
                r1 = 0
                r0.i = r1
            Lf:
                android.ext.MainService r0 = android.ext.MainService.instance
                if (r0 != 0) goto L14
                return
            L14:
                android.view.View r0 = r0.f217g
                android.ext.ShowApp r1 = r3.f468a
                android.view.WindowManager$LayoutParams r2 = r1.f454b
                boolean r1 = r1.l(r0, r2)
                if (r1 == 0) goto L24
                android.ext.ShowApp r1 = r3.f468a
                r1.i = r0
            L24:
                return
        }
    }

    class i implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.ShowApp f469a;

        i(android.ext.ShowApp r1) {
                r0 = this;
                r0.f469a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.ext.ShowApp r0 = r2.f469a
                android.view.View r1 = r0.i
                boolean r0 = r0.b(r1)
                if (r0 == 0) goto Lf
                android.ext.ShowApp r0 = r2.f469a
                r1 = 0
                r0.i = r1
            Lf:
                return
        }
    }

    class j implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.ShowApp f470a;

        j(android.ext.ShowApp r1) {
                r0 = this;
                r0.f470a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.ext.ShowApp r0 = r2.f470a
                boolean r0 = r0.f458f
                if (r0 == 0) goto L13
                android.ext.ShowApp r0 = r2.f470a
                boolean r0 = r0.b(r0)
                if (r0 == 0) goto L13
                android.ext.ShowApp r0 = r2.f470a
                r1 = 0
                r0.f458f = r1
            L13:
                android.ext.ShowApp r0 = r2.f470a
                android.view.WindowManager$LayoutParams r1 = r0.f453a
                boolean r0 = r0.l(r0, r1)
                if (r0 == 0) goto L22
                android.ext.ShowApp r0 = r2.f470a
                r1 = 1
                r0.f458f = r1
            L22:
                return
        }
    }

    class k implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.ShowApp f471a;

        k(android.ext.ShowApp r1) {
                r0 = this;
                r0.f471a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.ext.ShowApp r0 = r3.f471a
                boolean r0 = r0.f457e
                if (r0 == 0) goto L15
                android.ext.ShowApp r0 = r3.f471a
                android.fix.TextView r1 = r0.f455c
                boolean r0 = r0.b(r1)
                if (r0 == 0) goto L15
                android.ext.ShowApp r0 = r3.f471a
                r1 = 0
                r0.f457e = r1
            L15:
                android.ext.ShowApp r0 = r3.f471a
                android.fix.TextView r1 = r0.f455c
                android.view.WindowManager$LayoutParams r2 = r0.f456d
                boolean r0 = r0.l(r1, r2)
                if (r0 == 0) goto L26
                android.ext.ShowApp r0 = r3.f471a
                r1 = 1
                r0.f457e = r1
            L26:
                return
        }
    }

    static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.ref.WeakReference f472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f474c;

        public l(java.lang.ref.WeakReference r1, boolean r2, float r3) {
                r0 = this;
                r0.<init>()
                r0.f472a = r1
                r0.f473b = r2
                r0.f474c = r3
                return
        }
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.ext.ShowApp.k = r0
            return
    }

    public ShowApp(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            r4 = 0
            r3.f457e = r4
            r3.f458f = r4
            r5 = 0
            r3.f459g = r5
            r3.h = r5
            r3.i = r5
            boolean r5 = r3.isInEditMode()
            if (r5 != 0) goto Lb0
            android.fix.TextView r5 = new android.fix.TextView
            android.content.Context r0 = r3.getContext()
            r5.<init>(r0)
            r3.f455c = r5
            r0 = 17
            r5.setGravity(r0)     // Catch: java.lang.NoSuchMethodError -> L26
            goto L2a
        L26:
            r0 = move-exception
            android.ext.e1.a(r0)
        L2a:
            java.lang.String r0 = "kwws=22jdphjxdugldq1qhw2grzqordg"
            java.lang.String r0 = android.ext.Tools.removeNewLinesChars(r0)
            r5.setText(r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.setBackgroundColor(r0)
            android.view.WindowManager$LayoutParams r5 = new android.view.WindowManager$LayoutParams
            r5.<init>()
            r3.f454b = r5
            int r0 = android.ext.m2.c()
            r5.type = r0
            r0 = -2
            r5.width = r0
            r5.height = r0
            r5.format = r0
            r1 = 51
            r5.gravity = r1
            r2 = -10000(0xffffffffffffd8f0, float:NaN)
            r5.x = r2
            r5.y = r2
            r2 = 8
            r5.flags = r2
            android.view.WindowManager$LayoutParams r5 = new android.view.WindowManager$LayoutParams
            r5.<init>()
            r3.f453a = r5
            int r2 = android.ext.m2.c()
            r5.type = r2
            r2 = 1114636288(0x42700000, float:60.0)
            float r2 = android.ext.Tools.G(r2)
            int r2 = (int) r2
            r5.width = r2
            r2 = 1101004800(0x41a00000, float:20.0)
            float r2 = android.ext.Tools.G(r2)
            int r2 = (int) r2
            r5.height = r2
            r5.format = r0
            r5.gravity = r1
            r1 = 10000(0x2710, float:1.4013E-41)
            r5.x = r1
            r5.y = r1
            r1 = 264(0x108, float:3.7E-43)
            r5.flags = r1
            android.view.WindowManager$LayoutParams r5 = new android.view.WindowManager$LayoutParams
            r5.<init>()
            r3.f456d = r5
            int r1 = android.ext.m2.b()
            r5.type = r1
            r5.width = r0
            r5.height = r0
            r5.format = r0
            r0 = 49
            r5.gravity = r0
            r5.x = r4
            r4 = -1000(0xfffffffffffffc18, float:NaN)
            r5.y = r4
            r4 = 24
            r5.flags = r4
            android.ext.ShowApp$c r4 = new android.ext.ShowApp$c
            r4.<init>(r3)
            r3.setOnTouchListener(r4)
        Lb0:
            android.ext.ShowApp$d r4 = new android.ext.ShowApp$d
            r4.<init>(r3)
            r3.j = r4
            return
    }

    public static void i(android.view.Window r6) {
            android.view.WindowManager$LayoutParams r0 = r6.getAttributes()
            java.util.ArrayList r1 = android.ext.ShowApp.k
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        Lf:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2c
            java.lang.Object r4 = r3.next()
            android.ext.ShowApp$l r4 = (android.ext.ShowApp.l) r4
            java.lang.ref.WeakReference r5 = r4.f472a
            java.lang.Object r5 = r5.get()
            android.view.Window r5 = (android.view.Window) r5
            if (r5 == 0) goto Lf
            if (r5 != r6) goto L28
            goto Lf
        L28:
            r2.add(r4)
            goto Lf
        L2c:
            android.ext.ShowApp$l r3 = new android.ext.ShowApp$l
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r6)
            int r6 = r0.flags
            r6 = r6 & 2
            if (r6 == 0) goto L3b
            r6 = 1
            goto L3c
        L3b:
            r6 = 0
        L3c:
            float r0 = r0.dimAmount
            r3.<init>(r4, r6, r0)
            r2.add(r3)
            android.ext.ShowApp.k = r2
            r1.clear()
            r1.trimToSize()
            return
    }

    private void j(android.view.View r1, float r2) {
            r0 = this;
            if (r1 == 0) goto Lc
            r1.setAlpha(r2)     // Catch: java.lang.Throwable -> L6
            goto Lc
        L6:
            r1 = move-exception
            java.lang.String r2 = "Failed set transparency"
            android.ext.e1.s(r2, r1)
        Lc:
            return
    }

    public void a(boolean r5) {
            r4 = this;
            if (r5 == 0) goto L6
            r4.e()
            goto L11
        L6:
            android.os.Handler r0 = android.ext.n2.d()
            java.lang.Runnable r1 = r4.j
            r2 = 2000(0x7d0, double:9.88E-321)
            r0.postDelayed(r1, r2)
        L11:
            android.ext.ShowApp$b r0 = new android.ext.ShowApp$b
            r0.<init>(r4, r5)
            android.ext.n2.i(r0)
            return
    }

    boolean b(android.view.View r4) {
            r3 = this;
            if (r4 == 0) goto L28
            boolean r0 = r4 instanceof android.ext.FloatPanel     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            r0 = r4
            android.ext.FloatPanel r0 = (android.ext.FloatPanel) r0     // Catch: java.lang.Throwable -> Ld
            r0.e()     // Catch: java.lang.Throwable -> Ld
            goto L12
        Ld:
            r0 = move-exception
            goto L14
        Lf:
            android.ext.Tools.n1(r4)     // Catch: java.lang.Throwable -> Ld
        L12:
            r4 = 1
            goto L29
        L14:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed remove view "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.ext.e1.s(r4, r0)
        L28:
            r4 = 0
        L29:
            return r4
    }

    public void c() {
            r1 = this;
            r1.e()
            android.ext.ShowApp$a r0 = new android.ext.ShowApp$a
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    public void d() {
            r1 = this;
            android.ext.ShowApp$i r0 = new android.ext.ShowApp$i
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    public void e() {
            r1 = this;
            android.ext.ShowApp$g r0 = new android.ext.ShowApp$g
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    void f(android.view.View r2) {
            r1 = this;
            if (r2 == 0) goto L15
            boolean r2 = r1.b(r2)
            r0 = 0
            if (r2 == 0) goto Lb
            r1.f459g = r0
        Lb:
            android.view.View r2 = r1.h
            boolean r2 = r1.b(r2)
            if (r2 == 0) goto L15
            r1.h = r0
        L15:
            return
    }

    public void g() {
            r1 = this;
            android.ext.ShowApp$e r0 = new android.ext.ShowApp$e
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    void h(boolean r7) {
            r6 = this;
            java.util.ArrayList r0 = android.ext.ShowApp.k
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r0.next()
            android.ext.ShowApp$l r1 = (android.ext.ShowApp.l) r1
            java.lang.ref.WeakReference r4 = r1.f472a
            java.lang.Object r4 = r4.get()
            android.view.Window r4 = (android.view.Window) r4
            if (r4 != 0) goto L20
            goto L6
        L20:
            android.view.WindowManager$LayoutParams r5 = r4.getAttributes()     // Catch: java.lang.Throwable -> L34
            if (r7 == 0) goto L27
            r2 = 0
        L27:
            r5.alpha = r2     // Catch: java.lang.Throwable -> L34
            boolean r2 = r1.f473b     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L43
            if (r7 == 0) goto L36
            int r2 = r5.flags     // Catch: java.lang.Throwable -> L34
            r2 = r2 & (-3)
            goto L3a
        L34:
            r1 = move-exception
            goto L47
        L36:
            int r2 = r5.flags     // Catch: java.lang.Throwable -> L34
            r2 = r2 | 2
        L3a:
            r5.flags = r2     // Catch: java.lang.Throwable -> L34
            if (r7 == 0) goto L3f
            goto L41
        L3f:
            float r3 = r1.f474c     // Catch: java.lang.Throwable -> L34
        L41:
            r5.dimAmount = r3     // Catch: java.lang.Throwable -> L34
        L43:
            r4.setAttributes(r5)     // Catch: java.lang.Throwable -> L34
            goto L6
        L47:
            java.lang.String r2 = "Failed set transparency"
            android.ext.e1.s(r2, r1)
            goto L6
        L4d:
            if (r7 == 0) goto L50
            r2 = 0
        L50:
            boolean r7 = r6.f457e
            if (r7 == 0) goto L59
            android.fix.TextView r7 = r6.f455c
            r6.j(r7, r2)
        L59:
            android.view.View r7 = r6.f459g
            r6.j(r7, r2)
            android.view.View r7 = r6.h
            r6.j(r7, r2)
            android.view.View r7 = r6.i
            r6.j(r7, r2)
            return
    }

    public void k() {
            r1 = this;
            r1.o()
            r1.n()
            android.ext.ShowApp$j r0 = new android.ext.ShowApp$j
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    boolean l(android.view.View r4, android.view.WindowManager.LayoutParams r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L2e
            boolean r1 = r4 instanceof android.ext.FloatPanel     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            r5 = r4
            android.ext.FloatPanel r5 = (android.ext.FloatPanel) r5     // Catch: java.lang.Throwable -> Le
            r5.m()     // Catch: java.lang.Throwable -> Le
            goto L13
        Le:
            r5 = move-exception
            goto L1a
        L10:
            android.ext.Tools.g(r4, r5)     // Catch: java.lang.Throwable -> Le
        L13:
            r5 = 1065353216(0x3f800000, float:1.0)
            r0 = 1
            r4.setAlpha(r5)     // Catch: java.lang.Throwable -> Le
            goto L2e
        L1a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed add view "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.ext.e1.s(r4, r5)
        L2e:
            return r0
    }

    public void m() {
            r1 = this;
            android.view.View r0 = r1.f459g
            if (r0 != 0) goto L7
            r1.o()
        L7:
            android.view.View r0 = r1.i
            if (r0 != 0) goto Le
            r1.n()
        Le:
            android.ext.ShowApp$k r0 = new android.ext.ShowApp$k
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    public void n() {
            r1 = this;
            android.ext.ShowApp$h r0 = new android.ext.ShowApp$h
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    public void o() {
            r1 = this;
            android.ext.ShowApp$f r0 = new android.ext.ShowApp$f
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    public void p() {
            r1 = this;
            android.view.View r0 = r1.f459g
            if (r0 == 0) goto L7
            r1.o()
        L7:
            android.view.View r0 = r1.i
            if (r0 == 0) goto Le
            r1.n()
        Le:
            boolean r0 = r1.f458f
            if (r0 == 0) goto L15
            r1.k()
        L15:
            return
    }
}
