package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final java.lang.Runnable f759a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile int f760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.List f761c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.List f762d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static java.util.ArrayList f763e;

    class a implements java.lang.Runnable {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                android.ext.f.v()
                return
        }
    }

    class b implements android.content.DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f764a;

        b(java.lang.Runnable r1) {
                r0 = this;
                r0.f764a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface r2) {
                r1 = this;
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.Runnable r0 = r1.f764a
                r2.append(r0)
                java.lang.String r0 = ": 30_"
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                android.ext.e1.d(r2)
                android.os.Handler r2 = android.ext.n2.d()
                java.lang.Runnable r0 = r1.f764a
                r2.removeCallbacks(r0)
                return
        }
    }

    class c implements android.content.DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f765a;

        c(java.lang.Runnable r1) {
                r0 = this;
                r0.f765a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r4) {
                r3 = this;
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.Runnable r0 = r3.f765a
                r4.append(r0)
                java.lang.String r0 = ": 40_"
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                android.ext.e1.d(r4)
                android.os.Handler r4 = android.ext.n2.d()
                java.lang.Runnable r0 = r3.f765a
                r1 = 5000(0x1388, double:2.4703E-320)
                r4.postDelayed(r0, r1)
                return
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog f766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.f.n f767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f768c;

        d(android.app.AlertDialog r1, android.ext.f.n r2, java.lang.Runnable r3) {
                r0 = this;
                r0.f766a = r1
                r0.f767b = r2
                r0.f768c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.app.AlertDialog r0 = r1.f766a
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto Le
                android.ext.f$n r0 = r1.f767b
                r0.a()
                return
            Le:
                android.ext.f$n r0 = r1.f767b
                boolean r0 = r0.c()
                if (r0 == 0) goto L22
                java.lang.String r0 = "Fail-closed dialog was not shown"
                android.ext.e1.d(r0)
                java.lang.Runnable r0 = r1.f768c
                if (r0 == 0) goto L22
                r0.run()
            L22:
                return
        }
    }

    class e implements android.content.DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.f.n f769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.os.Handler f770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f771c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog f772d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f773e;

        e(android.ext.f.n r1, android.os.Handler r2, java.lang.Runnable r3, android.app.AlertDialog r4, java.lang.Runnable r5) {
                r0 = this;
                r0.f769a = r1
                r0.f770b = r2
                r0.f771c = r3
                r0.f772d = r4
                r0.f773e = r5
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface r3) {
                r2 = this;
                android.ext.f$n r3 = r2.f769a
                r0 = 1
                r3.f785a = r0
                android.os.Handler r3 = r2.f770b
                java.lang.Runnable r0 = r2.f771c
                r3.removeCallbacks(r0)
                android.app.AlertDialog r3 = r2.f772d
                android.ext.f$n r0 = r2.f769a
                java.lang.Runnable r1 = r2.f773e
                android.ext.f.a(r3, r0, r1)
                return
        }
    }

    /* JADX INFO: renamed from: android.ext.f$f, reason: collision with other inner class name */
    class DialogInterfaceOnDismissListenerC0015f implements android.content.DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.f.n f774a;

        DialogInterfaceOnDismissListenerC0015f(android.ext.f.n r1) {
                r0 = this;
                r0.f774a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r1) {
                r0 = this;
                android.ext.f$n r1 = r0.f774a
                r1.a()
                return
        }
    }

    class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog f775a;

        g(android.app.AlertDialog r1) {
                r0 = this;
                r0.f775a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.app.AlertDialog r0 = r2.f775a     // Catch: java.lang.Throwable -> L6
                android.ext.f.t(r0)     // Catch: java.lang.Throwable -> L6
                goto Lc
            L6:
                r0 = move-exception
                java.lang.String r1 = "Failed show dialog on service"
                android.ext.e1.l(r1, r0)
            Lc:
                return
        }
    }

    class h implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog.Builder f776a;

        h(android.app.AlertDialog.Builder r1) {
                r0 = this;
                r0.f776a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.app.AlertDialog$Builder r0 = r2.f776a
                r1 = 0
                android.ext.f.q(r0, r1)
                return
        }
    }

    class i implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog.Builder f777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.EditText f778b;

        i(android.app.AlertDialog.Builder r1, android.ext.EditText r2) {
                r0 = this;
                r0.f777a = r1
                r0.f778b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.app.AlertDialog$Builder r0 = r2.f777a
                android.app.AlertDialog r0 = r0.create()
                android.ext.EditText r1 = r2.f778b
                android.ext.f.n(r0, r1)
                return
        }
    }

    private static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.ref.WeakReference f779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public java.lang.ref.WeakReference f780b;

        public j(android.app.AlertDialog r2, android.ext.f.k r3) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f779a = r0
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r3)
                r1.f780b = r2
                return
        }
    }

    private static class k implements android.content.DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f781a;

        private k() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f781a = r0
                return
        }

        /* synthetic */ k(android.ext.f.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public void a(android.content.DialogInterface.OnDismissListener r2) {
                r1 = this;
                if (r2 != 0) goto L3
                return
            L3:
                java.util.List r0 = r1.f781a
                boolean r0 = r0.contains(r2)
                if (r0 != 0) goto L10
                java.util.List r0 = r1.f781a
                r0.add(r2)
            L10:
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r3) {
                r2 = this;
                android.ext.f.g()
                java.util.List r0 = r2.f781a
                java.util.Iterator r0 = r0.iterator()
            L9:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r0.next()
                android.content.DialogInterface$OnDismissListener r1 = (android.content.DialogInterface.OnDismissListener) r1
                if (r1 != 0) goto L18
                goto L9
            L18:
                r1.onDismiss(r3)
                goto L9
            L1c:
                return
        }
    }

    private static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.ref.WeakReference f782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public java.lang.ref.WeakReference f783b;

        public l(android.app.AlertDialog r2, android.ext.f.m r3) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f782a = r0
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r3)
                r1.f783b = r2
                return
        }
    }

    private static class m implements android.content.DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f784a;

        private m() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f784a = r0
                return
        }

        /* synthetic */ m(android.ext.f.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public void a(android.content.DialogInterface.OnShowListener r2) {
                r1 = this;
                if (r2 != 0) goto L3
                return
            L3:
                java.util.List r0 = r1.f784a
                boolean r0 = r0.contains(r2)
                if (r0 != 0) goto L10
                java.util.List r0 = r1.f784a
                r0.add(r2)
            L10:
                return
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface r3) {
                r2 = this;
                r0 = r3
                android.app.AlertDialog r0 = (android.app.AlertDialog) r0
                android.ext.Tools.N(r0)
                java.util.List r0 = r2.f784a
                java.util.Iterator r0 = r0.iterator()
            Lc:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1f
                java.lang.Object r1 = r0.next()
                android.content.DialogInterface$OnShowListener r1 = (android.content.DialogInterface.OnShowListener) r1
                if (r1 != 0) goto L1b
                goto Lc
            L1b:
                r1.onShow(r3)
                goto Lc
            L1f:
                return
        }
    }

    private static class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile boolean f785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f786b;

        private n() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f785a = r0
                r1.f786b = r0
                return
        }

        /* synthetic */ n(android.ext.f.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        synchronized void a() {
                r1 = this;
                monitor-enter(r1)
                r0 = 1
                r1.f786b = r0     // Catch: java.lang.Throwable -> L6
                monitor-exit(r1)
                return
            L6:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
        }

        synchronized boolean b() {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.f786b     // Catch: java.lang.Throwable -> Ld
                if (r0 == 0) goto L8
                monitor-exit(r1)
                r0 = 0
                return r0
            L8:
                r0 = 1
                r1.f786b = r0     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r1)
                return r0
            Ld:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
        }

        synchronized boolean c() {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.f786b     // Catch: java.lang.Throwable -> Lf
                if (r0 != 0) goto L11
                boolean r0 = r1.f785a     // Catch: java.lang.Throwable -> Lf
                if (r0 == 0) goto La
                goto L11
            La:
                r0 = 1
                r1.f786b = r0     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r1)
                return r0
            Lf:
                r0 = move-exception
                goto L14
            L11:
                monitor-exit(r1)
                r0 = 0
                return r0
            L14:
                monitor-exit(r1)
                throw r0
        }
    }

    private static class o implements android.widget.AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.widget.AdapterView.OnItemClickListener f787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.ext.f.n f788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.lang.Runnable f789c;

        private o(android.widget.AdapterView.OnItemClickListener r1, android.ext.f.n r2, java.lang.Runnable r3) {
                r0 = this;
                r0.<init>()
                r0.f787a = r1
                r0.f788b = r2
                r0.f789c = r3
                return
        }

        /* synthetic */ o(android.widget.AdapterView.OnItemClickListener r1, android.ext.f.n r2, java.lang.Runnable r3, android.ext.f.a r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView r8, android.view.View r9, int r10, long r11) {
                r7 = this;
                android.ext.f$n r0 = r7.f788b
                boolean r0 = r0.b()
                android.widget.AdapterView$OnItemClickListener r1 = r7.f787a
                if (r1 == 0) goto L16
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r1.onItemClick(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L12
                goto L16
            L12:
                r8 = move-exception
                android.ext.e1.a(r8)
            L16:
                if (r0 == 0) goto L25
                java.lang.Runnable r8 = r7.f789c
                if (r8 == 0) goto L25
                android.os.Handler r8 = android.ext.n2.d()
                java.lang.Runnable r9 = r7.f789c
                r8.post(r9)
            L25:
                return
        }
    }

    private static class p implements android.widget.AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.widget.AdapterView.OnItemClickListener f790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final android.app.AlertDialog f791b;

        private p(android.app.AlertDialog r1, android.widget.AdapterView.OnItemClickListener r2) {
                r0 = this;
                r0.<init>()
                r0.f790a = r2
                r0.f791b = r1
                return
        }

        /* synthetic */ p(android.app.AlertDialog r1, android.widget.AdapterView.OnItemClickListener r2, android.ext.f.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView r7, android.view.View r8, int r9, long r10) {
                r6 = this;
                android.widget.AdapterView$OnItemClickListener r0 = r6.f790a     // Catch: java.lang.Throwable -> La
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r0.onItemClick(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> La
                goto L13
            La:
                r7 = move-exception
                android.ext.e1.a(r7)
                android.app.AlertDialog r7 = r6.f791b
                android.ext.Tools.D(r7)
            L13:
                return
        }
    }

    static {
            android.ext.f$a r0 = new android.ext.f$a
            r0.<init>()
            android.ext.f.f759a = r0
            r0 = 0
            android.ext.f.f760b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.ext.f.f761c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.ext.f.f762d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.ext.f.f763e = r0
            return
    }

    static /* synthetic */ void a(android.app.AlertDialog r0, android.ext.f.n r1, java.lang.Runnable r2) {
            j(r0, r1, r2)
            return
    }

    public static android.app.AlertDialog.Builder b() {
            android.content.Context r0 = android.ext.Tools.f0()
            android.app.AlertDialog$Builder r0 = c(r0)
            return r0
    }

    public static android.app.AlertDialog.Builder c(android.content.Context r1) {
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r1)
            return r0
    }

    public static void d() {
            java.util.ArrayList r0 = android.ext.f.f763e
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            android.app.AlertDialog r1 = (android.app.AlertDialog) r1
            if (r1 != 0) goto L1b
            goto L6
        L1b:
            boolean r2 = r1.isShowing()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L6
            android.ext.Tools.D(r1)     // Catch: java.lang.Throwable -> L25
            goto L6
        L25:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed dismiss dialog: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.ext.e1.s(r1, r2)
            goto L6
        L3b:
            android.ext.MainService r0 = android.ext.MainService.instance
            if (r0 == 0) goto L44
            android.ext.MainService r0 = android.ext.MainService.instance
            r0.t()
        L44:
            return
    }

    private static void e(android.app.AlertDialog r2) {
            android.view.Window r2 = r2.getWindow()
            android.ext.g3 r0 = new android.ext.g3
            android.view.Window$Callback r1 = r2.getCallback()
            r0.<init>(r1)
            r2.setCallback(r0)
            boolean r0 = h()
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 == 0) goto L1c
            r2.clearFlags(r1)
            return
        L1c:
            int r0 = android.ext.m2.b()
            r2.setType(r0)
            android.ext.Tools.R(r2)
            int r0 = android.ext.Config.B
            r0 = r0 & 2
            if (r0 == 0) goto L30
            r2.addFlags(r1)
            goto L33
        L30:
            r2.clearFlags(r1)
        L33:
            return
    }

    private static void f(android.app.AlertDialog r4) {
            r0 = 0
            android.widget.ListView r1 = r4.getListView()     // Catch: java.lang.Throwable -> L6
            goto Lb
        L6:
            r1 = move-exception
            android.ext.e1.a(r1)
            r1 = r0
        Lb:
            if (r1 != 0) goto Le
            return
        Le:
            android.widget.AdapterView$OnItemClickListener r2 = r1.getOnItemClickListener()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L25
            boolean r3 = r2 instanceof android.ext.f.p     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L25
            android.ext.f$p r3 = new android.ext.f$p     // Catch: java.lang.Throwable -> L21
            r3.<init>(r4, r2, r0)     // Catch: java.lang.Throwable -> L21
            r1.setOnItemClickListener(r3)     // Catch: java.lang.Throwable -> L21
            goto L25
        L21:
            r4 = move-exception
            android.ext.e1.a(r4)
        L25:
            return
    }

    static void g() {
            android.ext.MainService r0 = android.ext.MainService.instance
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = android.ext.f.f760b
            int r0 = r0 + (-1)
            android.ext.f.f760b = r0
            int r0 = android.ext.f.f760b
            if (r0 > 0) goto L22
            android.os.Handler r0 = android.ext.n2.d()
            java.lang.Runnable r1 = android.ext.f.f759a
            r0.removeCallbacks(r1)
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.ShowApp r0 = r0.h0
            r0.c()
            r0 = 0
            android.ext.f.f760b = r0
        L22:
            return
    }

    private static boolean h() {
            android.ext.MainService r0 = android.ext.MainService.instance
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public static void i(android.app.AlertDialog r5) {
            android.view.Window r0 = r5.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            int r0 = r0.type
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r0 >= r1) goto Lf
            return
        Lf:
            java.util.ArrayList r0 = android.ext.f.f763e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L1a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L35
            java.lang.Object r3 = r2.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            android.app.AlertDialog r4 = (android.app.AlertDialog) r4
            if (r4 == 0) goto L1a
            if (r4 != r5) goto L31
            goto L1a
        L31:
            r1.add(r3)
            goto L1a
        L35:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r5)
            r1.add(r2)
            android.ext.f.f763e = r1
            r0.clear()
            r0.trimToSize()
            return
    }

    private static void j(android.app.AlertDialog r3, android.ext.f.n r4, java.lang.Runnable r5) {
            android.widget.ListView r3 = r3.getListView()
            if (r3 != 0) goto L7
            return
        L7:
            android.widget.AdapterView$OnItemClickListener r0 = r3.getOnItemClickListener()
            boolean r1 = r0 instanceof android.ext.f.o
            if (r1 == 0) goto L10
            return
        L10:
            android.ext.f$o r1 = new android.ext.f$o
            r2 = 0
            r1.<init>(r0, r4, r5, r2)
            r3.setOnItemClickListener(r1)
            return
    }

    public static void k(android.app.AlertDialog r6, android.content.DialogInterface.OnDismissListener r7) {
            r0 = 0
            r1 = 0
            r2 = r0
        L3:
            java.util.List r3 = android.ext.f.f762d
            int r4 = r3.size()
            if (r1 >= r4) goto L2a
            java.lang.Object r4 = r3.get(r1)
            android.ext.f$j r4 = (android.ext.f.j) r4
            if (r4 != 0) goto L19
        L13:
            r3.remove(r1)
            int r1 = r1 + (-1)
            goto L27
        L19:
            java.lang.ref.WeakReference r5 = r4.f779a
            java.lang.Object r5 = r5.get()
            android.app.AlertDialog r5 = (android.app.AlertDialog) r5
            if (r5 != 0) goto L24
            goto L13
        L24:
            if (r5 != r6) goto L27
            r2 = r4
        L27:
            int r1 = r1 + 1
            goto L3
        L2a:
            if (r2 != 0) goto L3c
            android.ext.f$k r1 = new android.ext.f$k
            r1.<init>(r0)
            r6.setOnDismissListener(r1)
            android.ext.f$j r2 = new android.ext.f$j
            r2.<init>(r6, r1)
            r3.add(r2)
        L3c:
            java.lang.ref.WeakReference r6 = r2.f780b
            java.lang.Object r6 = r6.get()
            android.ext.f$k r6 = (android.ext.f.k) r6
            r6.a(r7)
            return
    }

    public static void l(android.app.AlertDialog r6, android.content.DialogInterface.OnShowListener r7) {
            r0 = 0
            r1 = 0
            r2 = r0
        L3:
            java.util.List r3 = android.ext.f.f761c
            int r4 = r3.size()
            if (r1 >= r4) goto L2a
            java.lang.Object r4 = r3.get(r1)
            android.ext.f$l r4 = (android.ext.f.l) r4
            if (r4 != 0) goto L19
        L13:
            r3.remove(r1)
            int r1 = r1 + (-1)
            goto L27
        L19:
            java.lang.ref.WeakReference r5 = r4.f782a
            java.lang.Object r5 = r5.get()
            android.app.AlertDialog r5 = (android.app.AlertDialog) r5
            if (r5 != 0) goto L24
            goto L13
        L24:
            if (r5 != r6) goto L27
            r2 = r4
        L27:
            int r1 = r1 + 1
            goto L3
        L2a:
            if (r2 != 0) goto L3c
            android.ext.f$m r1 = new android.ext.f$m
            r1.<init>(r0)
            r6.setOnShowListener(r1)
            android.ext.f$l r2 = new android.ext.f$l
            r2.<init>(r6, r1)
            r3.add(r2)
        L3c:
            java.lang.ref.WeakReference r6 = r2.f783b
            java.lang.Object r6 = r6.get()
            android.ext.f$m r6 = (android.ext.f.m) r6
            r6.a(r7)
            return
    }

    public static android.app.AlertDialog m(android.app.AlertDialog r1) {
            r0 = 0
            n(r1, r0)
            return r1
    }

    public static android.app.AlertDialog n(android.app.AlertDialog r1, android.widget.EditText r2) {
            if (r2 == 0) goto La
            android.ext.EditorActionListener r0 = new android.ext.EditorActionListener
            r0.<init>(r1)
            r2.setOnEditorActionListener(r0)
        La:
            e(r1)
            android.ext.f$g r2 = new android.ext.f$g
            r2.<init>(r1)
            android.ext.n2.i(r2)
            return r1
    }

    public static void o(android.app.AlertDialog.Builder r1) {
            r0 = 0
            q(r1, r0)
            return
    }

    public static void p(android.app.AlertDialog.Builder r0, android.content.Context r1) {
            r1 = 0
            q(r0, r1)
            return
    }

    public static void q(android.app.AlertDialog.Builder r1, android.ext.EditText r2) {
            android.ext.f$i r0 = new android.ext.f$i
            r0.<init>(r1, r2)
            android.ext.n2.i(r0)
            return
    }

    public static void r(android.app.AlertDialog r2, java.lang.Runnable r3, boolean r4) {
            android.ext.f$b r0 = new android.ext.f$b
            r0.<init>(r3)
            l(r2, r0)
            if (r4 == 0) goto L12
            android.ext.f$c r4 = new android.ext.f$c
            r4.<init>(r3)
            k(r2, r4)
        L12:
            android.os.Handler r4 = android.ext.n2.d()
            r0 = 3000(0xbb8, double:1.482E-320)
            r4.postDelayed(r3, r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r0 = ": 10_"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            android.ext.e1.d(r4)
            m(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = ": 20_"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.ext.e1.d(r2)
            return
    }

    public static void s(android.app.AlertDialog.Builder r1) {
            android.ext.f$h r0 = new android.ext.f$h
            r0.<init>(r1)
            android.ext.f0.m0(r0)
            return
    }

    static void t(android.app.AlertDialog r6) {
            r0 = 0
            l(r6, r0)
            r6.show()
            boolean r1 = h()
            if (r1 == 0) goto Le
            return
        Le:
            f(r6)
            android.view.Window r1 = r6.getWindow()
            android.view.View r2 = r1.getDecorView()
            r3 = 2131034303(0x7f0500bf, float:1.767912E38)
            android.view.View r3 = r2.findViewById(r3)
            android.ext.InternalKeyboard r3 = (android.ext.InternalKeyboard) r3
            if (r3 == 0) goto L27
            r3.g(r1)
        L27:
            boolean r4 = android.ext.Tools.Q0(r2)
            r5 = 1
            if (r4 == 0) goto L37
            if (r3 == 0) goto L35
            int r3 = android.ext.Config.B
            r3 = r3 & r5
            if (r3 != 0) goto L37
        L35:
            r3 = 5
            goto L38
        L37:
            r3 = 2
        L38:
            r4 = 16
            r3 = r3 | r4
            r1.setSoftInputMode(r3)
            android.ext.Tools.S(r2)
            android.ext.ShowApp.i(r1)
            android.os.Handler r1 = android.ext.n2.d()
            java.lang.Runnable r2 = android.ext.f.f759a
            r1.removeCallbacks(r2)
            r3 = 100
            r1.postDelayed(r2, r3)
            int r1 = android.ext.f.f760b
            if (r1 > 0) goto L59
            android.ext.f.f760b = r5
            goto L5e
        L59:
            int r1 = android.ext.f.f760b
            int r1 = r1 + r5
            android.ext.f.f760b = r1
        L5e:
            k(r6, r0)
            i(r6)
            return
    }

    public static void u(android.app.AlertDialog r9, java.lang.Runnable r10, java.lang.Runnable r11) {
            android.ext.f$n r6 = new android.ext.f$n
            r0 = 0
            r6.<init>(r0)
            android.os.Handler r7 = android.ext.n2.d()
            android.ext.f$d r8 = new android.ext.f$d
            r8.<init>(r9, r6, r11)
            android.ext.f$e r11 = new android.ext.f$e
            r0 = r11
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            l(r9, r11)
            android.ext.f$f r10 = new android.ext.f$f
            r10.<init>(r6)
            k(r9, r10)
            r10 = 3000(0xbb8, double:1.482E-320)
            r7.postDelayed(r8, r10)
            m(r9)
            return
    }

    static void v() {
            android.ext.MainService r0 = android.ext.MainService.instance
            if (r0 != 0) goto L5
            return
        L5:
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.ShowApp r0 = r0.h0
            r0.p()
            android.ext.MainService r0 = android.ext.MainService.instance
            android.view.View r0 = r0.f0
            android.ext.MainService r1 = android.ext.MainService.instance
            android.view.View r1 = r1.c0
            if (r0 != r1) goto L17
            return
        L17:
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.ShowApp r0 = r0.h0
            r0.m()
            return
    }

    public static void w(android.app.AlertDialog r0) {
            r0.show()     // Catch: android.view.WindowManager.BadTokenException -> L4
            goto L7
        L4:
            m(r0)
        L7:
            return
    }
}
