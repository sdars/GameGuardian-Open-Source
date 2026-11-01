package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class Tools {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.Random f489a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile int f490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static float f491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile int f492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static volatile int f493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static java.util.regex.Pattern f494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static android.view.inputmethod.InputMethodManager f495g;
    private static java.lang.String h;
    private static java.lang.String i;
    private static java.lang.String j;
    private static volatile android.content.pm.PackageManager k;
    private static volatile java.lang.String l;
    private static java.lang.String m;
    private static final android.ext.Tools.b0 n = null;
    private static int[] o;
    private static volatile java.lang.Object p;
    private static volatile java.lang.ref.WeakReference q;
    private static int r;
    private static java.lang.ref.WeakReference s;
    private static volatile boolean t;
    private static volatile byte u;
    static volatile java.lang.String[] v;
    private static volatile int w;

    public static final class ViewWrapper extends android.fix.FrameLayout {
        public ViewWrapper(android.content.Context r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f497b;

        a(java.lang.String r1, boolean r2) {
                r0 = this;
                r0.f496a = r1
                r0.f497b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.lang.String r0 = r4.f496a
                java.lang.String r1 = " "
                java.lang.String r2 = " "
                java.lang.String r0 = r0.replace(r1, r2)
                boolean r1 = r4.f497b
                if (r1 == 0) goto L12
                r1 = 1
                android.ext.y0.b(r0, r1)
            L12:
                android.content.Context r1 = android.ext.MainService.context     // Catch: java.lang.Throwable -> L2a
                java.lang.String r2 = "clipboard"
                java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L2a
                android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1     // Catch: java.lang.Throwable -> L2a
                android.content.ClipData r2 = android.content.ClipData.newPlainText(r0, r0)     // Catch: java.lang.Throwable -> L2a
                r1.setPrimaryClip(r2)     // Catch: java.lang.Throwable -> L2a
                r1 = 2131296337(0x7f090051, float:1.8210588E38)
                android.ext.Tools.H1(r1)     // Catch: java.lang.Throwable -> L2a
                goto L66
            L2a:
                r1 = move-exception
                java.lang.String r2 = "Failed to copy text to the clipboard"
                android.ext.e1.l(r2, r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Text: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                android.ext.e1.d(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r2 = 2131296435(0x7f0900b3, float:1.8210787E38)
                java.lang.String r2 = android.ext.b2.f(r2)
                r0.append(r2)
                r2 = 32
                r0.append(r2)
                java.lang.String r1 = r1.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.ext.Tools.J1(r0)
            L66:
                return
        }
    }

    public static class a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f499b;

        public a0(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f498a = r1
                r0.f499b = r2
                return
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f501b;

        b(java.lang.String r1, int r2) {
                r0 = this;
                r0.f500a = r1
                r0.f501b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.content.Context r0 = android.ext.p2.h()     // Catch: java.lang.Throwable -> Lb
                java.lang.String r1 = r3.f500a     // Catch: java.lang.Throwable -> Lb
                if (r1 != 0) goto Ld
                java.lang.String r1 = "null"
                goto Ld
            Lb:
                r0 = move-exception
                goto L1b
            Ld:
                java.lang.String r1 = android.ext.b2.g(r1)     // Catch: java.lang.Throwable -> Lb
                int r2 = r3.f501b     // Catch: java.lang.Throwable -> Lb
                android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)     // Catch: java.lang.Throwable -> Lb
                android.ext.p2.j(r0)     // Catch: java.lang.Throwable -> Lb
                goto L20
            L1b:
                java.lang.String r1 = "Toast fail"
                android.ext.e1.s(r1, r0)
            L20:
                return
        }
    }

    private static class b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final java.lang.ThreadLocal f502a = null;

        class a extends java.lang.ThreadLocal {
            a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            protected java.lang.Integer a() {
                    r1 = this;
                    r0 = 0
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    return r0
            }

            @Override // java.lang.ThreadLocal
            protected /* bridge */ /* synthetic */ java.lang.Object initialValue() {
                    r1 = this;
                    java.lang.Integer r0 = r1.a()
                    return r0
            }
        }

        static {
                android.ext.Tools$b0$a r0 = new android.ext.Tools$b0$a
                r0.<init>()
                android.ext.Tools.b0.f502a = r0
                return
        }

        private b0() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b0(android.ext.Tools.j r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public void a(int r3) {
                r2 = this;
                java.lang.ThreadLocal r0 = android.ext.Tools.b0.f502a
                java.lang.Object r1 = r0.get()
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                int r3 = ~r3
                r3 = r3 & r1
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.set(r3)
                return
        }

        public boolean b(int r4) {
                r3 = this;
                java.lang.ThreadLocal r0 = android.ext.Tools.b0.f502a
                java.lang.Object r1 = r0.get()
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r2 = r1 & r4
                if (r2 != 0) goto L1a
                r4 = r4 | r1
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r0.set(r4)
                r4 = 1
                return r4
            L1a:
                r4 = 0
                return r4
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.widget.TextView f503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String f504b;

        c(android.widget.TextView r1, java.lang.String r2) {
                r0 = this;
                r0.f503a = r1
                r0.f504b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                r0 = 1
                r1 = 1
            L2:
                r2 = 4
                if (r1 >= r2) goto L47
                android.widget.TextView r3 = r7.f503a     // Catch: java.lang.Throwable -> L22
                r4 = 0
                r5 = 2
                if (r1 > r5) goto Ld
                r6 = 1
                goto Le
            Ld:
                r6 = 0
            Le:
                r3.setLinksClickable(r6)     // Catch: java.lang.Throwable -> L22
                android.widget.TextView r3 = r7.f503a     // Catch: java.lang.Throwable -> L22
                if (r1 > r5) goto L16
                r4 = 1
            L16:
                r3.setAutoLinkMask(r4)     // Catch: java.lang.Throwable -> L22
                android.widget.TextView r3 = r7.f503a     // Catch: java.lang.Throwable -> L22
                if (r1 > r0) goto L24
                android.text.method.MovementMethod r4 = android.text.method.LinkMovementMethod.getInstance()     // Catch: java.lang.Throwable -> L22
                goto L25
            L22:
                r2 = move-exception
                goto L30
            L24:
                r4 = 0
            L25:
                r3.setMovementMethod(r4)     // Catch: java.lang.Throwable -> L22
                android.widget.TextView r3 = r7.f503a     // Catch: java.lang.Throwable -> L22
                java.lang.String r4 = r7.f504b     // Catch: java.lang.Throwable -> L22
                r3.setText(r4)     // Catch: java.lang.Throwable -> L22
                goto L47
            L30:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Failed set clickable text "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                android.ext.e1.l(r3, r2)
                int r1 = r1 + 1
                goto L2
            L47:
                if (r1 != r2) goto L50
                android.widget.TextView r0 = r7.f503a
                java.lang.String r1 = "Failed set text"
                r0.setText(r1)
            L50:
                android.widget.TextView r0 = r7.f503a
                android.ext.DefensiveURLSpan.a(r0)
                return
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog f505a;

        d(android.app.AlertDialog r1) {
                r0 = this;
                r0.f505a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.app.AlertDialog r0 = r2.f505a     // Catch: java.lang.Throwable -> La
                android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Throwable -> La
                android.ext.Tools.T0(r0)     // Catch: java.lang.Throwable -> La
                goto L10
            La:
                r0 = move-exception
                java.lang.String r1 = "hideSoftInputFromWindow"
                android.ext.e1.l(r1, r0)
            L10:
                return
        }
    }

    class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.Window f506a;

        e(android.view.Window r1) {
                r0 = this;
                r0.f506a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.view.Window r0 = r2.f506a     // Catch: java.lang.Throwable -> Lf
                android.view.View r0 = r0.getCurrentFocus()     // Catch: java.lang.Throwable -> Lf
                if (r0 != 0) goto L11
                android.view.Window r0 = r2.f506a     // Catch: java.lang.Throwable -> Lf
                android.view.View r0 = r0.peekDecorView()     // Catch: java.lang.Throwable -> Lf
                goto L11
            Lf:
                r0 = move-exception
                goto L17
            L11:
                if (r0 == 0) goto L1c
                android.ext.Tools.S0(r0)     // Catch: java.lang.Throwable -> Lf
                goto L1c
            L17:
                java.lang.String r1 = "hideSoftInputFromWindow"
                android.ext.e1.l(r1, r0)
            L1c:
                return
        }
    }

    class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View f507a;

        f(android.view.View r1) {
                r0 = this;
                r0.f507a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.view.inputmethod.InputMethodManager r0 = android.ext.Tools.f495g     // Catch: java.lang.Throwable -> L11
                if (r0 != 0) goto L13
                android.content.Context r0 = android.ext.MainService.context     // Catch: java.lang.Throwable -> L11
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L11
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0     // Catch: java.lang.Throwable -> L11
                android.ext.Tools.f495g = r0     // Catch: java.lang.Throwable -> L11
                goto L13
            L11:
                r0 = move-exception
                goto L22
            L13:
                android.view.View r0 = r3.f507a     // Catch: java.lang.Throwable -> L11
                if (r0 == 0) goto L27
                android.view.inputmethod.InputMethodManager r1 = android.ext.Tools.f495g     // Catch: java.lang.Throwable -> L11
                android.os.IBinder r0 = r0.getWindowToken()     // Catch: java.lang.Throwable -> L11
                r2 = 0
                r1.hideSoftInputFromWindow(r0, r2)     // Catch: java.lang.Throwable -> L11
                goto L27
            L22:
                java.lang.String r1 = "hideSoftInputFromWindow"
                android.ext.e1.l(r1, r0)
            L27:
                return
        }
    }

    class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.widget.EditText f508a;

        g(android.widget.EditText r1) {
                r0 = this;
                r0.f508a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                android.widget.EditText r0 = r7.f508a
                android.text.Editable r1 = r0.getText()
                int r0 = r1.length()
                if (r0 <= 0) goto L23
                r2 = 0
                r3 = 1
                r0 = 0
                r4 = 1
                java.lang.CharSequence r4 = r1.subSequence(r0, r4)     // Catch: java.lang.Throwable -> L1a
                r5 = 0
                r6 = 1
                r1.replace(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1a
                goto L1e
            L1a:
                r0 = move-exception
                android.ext.e1.a(r0)
            L1e:
                android.widget.EditText r0 = r7.f508a
                r0.selectAll()
            L23:
                return
        }
    }

    class h implements java.util.concurrent.Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Process f509a;

        h(java.lang.Process r1) {
                r0 = this;
                r0.f509a = r1
                r0.<init>()
                return
        }

        public java.lang.Boolean a() {
                r1 = this;
                java.lang.Process r0 = r1.f509a
                r0.waitFor()
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ java.lang.Object call() {
                r1 = this;
                java.lang.Boolean r0 = r1.a()
                return r0
        }
    }

    class i implements java.lang.Runnable {
        i() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Context info. act - "
                r1.append(r2)
                android.content.Context r2 = android.ext.r.p
                java.lang.String r2 = android.ext.Tools.v0(r2)
                r1.append(r2)
                java.lang.String r2 = "; app - "
                r1.append(r2)
                android.content.Context r2 = android.ext.r.o
                java.lang.String r2 = android.ext.Tools.v0(r2)
                r1.append(r2)
                java.lang.String r2 = "; dae - "
                r1.append(r2)
                android.content.Context r2 = android.ext.MainService.context
                java.lang.String r2 = android.ext.Tools.v0(r2)
                r1.append(r2)
                java.lang.String r2 = "; bad - "
                r1.append(r2)
                android.content.Context r2 = android.ext.r.p
                java.lang.Throwable r2 = android.ext.Tools.b1(r2)
                r3 = 0
                if (r2 == 0) goto L47
                r0.add(r2)
                r2 = 1
                goto L48
            L47:
                r2 = 0
            L48:
                android.content.Context r4 = android.ext.r.o
                java.lang.Throwable r4 = android.ext.Tools.b1(r4)
                if (r4 == 0) goto L55
                int r2 = r2 + 10
                r0.add(r4)
            L55:
                android.content.Context r4 = android.ext.MainService.context
                if (r4 == 0) goto L66
                android.content.Context r4 = android.ext.MainService.context
                java.lang.Throwable r4 = android.ext.Tools.b1(r4)
                if (r4 == 0) goto L66
                int r2 = r2 + 100
                r0.add(r4)
            L66:
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                if (r2 <= 0) goto L8f
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                r2.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L78:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L88
                java.lang.Object r4 = r0.next()
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                r2.addSuppressed(r4)
                goto L78
            L88:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                android.ext.n0.h(r0, r2, r3)
            L8f:
                android.ext.e1.d(r1)
                return
        }
    }

    class j implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.WindowManager.LayoutParams f510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.View f511b;

        j(android.view.WindowManager.LayoutParams r1, android.view.View r2) {
                r0 = this;
                r0.f510a = r1
                r0.f511b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.view.View r0 = r2.f511b
                android.ext.Tools.n1(r0)
                android.ext.Tools$ViewWrapper r0 = new android.ext.Tools$ViewWrapper
                android.view.View r1 = r2.f511b
                android.content.Context r1 = r1.getContext()
                r0.<init>(r1)
                android.view.View r1 = r2.f511b
                r0.addView(r1)
                android.view.WindowManager$LayoutParams r1 = r2.f510a
                android.ext.Tools.f(r0, r1)
                return
        }
    }

    class k implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.DialogInterface f512a;

        k(android.content.DialogInterface r1) {
                r0 = this;
                r0.f512a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                android.content.DialogInterface r0 = r1.f512a     // Catch: java.lang.Throwable -> L6
                r0.dismiss()     // Catch: java.lang.Throwable -> L6
                goto La
            L6:
                r0 = move-exception
                android.ext.e1.a(r0)
            La:
                return
        }
    }

    class l implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f514b;

        class a implements android.content.DialogInterface.OnShowListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.app.AlertDialog f515a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.Tools.l f516b;

            a(android.ext.Tools.l r1, android.app.AlertDialog r2) {
                    r0 = this;
                    r0.f516b = r1
                    r0.f515a = r2
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(android.content.DialogInterface r1) {
                    r0 = this;
                    android.app.AlertDialog r1 = r0.f515a
                    android.ext.Tools.u1(r1)
                    return
            }
        }

        l(java.lang.String r1, int r2) {
                r0 = this;
                r0.f513a = r1
                r0.f514b = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                android.app.AlertDialog$Builder r3 = android.ext.f.b()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.f513a
                java.lang.String r1 = android.ext.b2.g(r1)
                r0.append(r1)
                r1 = 10
                r0.append(r1)
                int r1 = r2.f514b
                java.lang.String r1 = android.ext.b2.f(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.app.AlertDialog$Builder r3 = r3.setMessage(r0)
                r0 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r0 = android.ext.b2.f(r0)
                r1 = 0
                android.app.AlertDialog$Builder r3 = r3.setNegativeButton(r0, r1)
                android.app.AlertDialog r3 = r3.create()
                android.ext.f.m(r3)
                android.ext.Tools$l$a r0 = new android.ext.Tools$l$a
                r0.<init>(r2, r3)
                android.ext.f.l(r3, r0)
                return
        }
    }

    class m implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.String f519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ android.content.DialogInterface.OnClickListener f520d;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.widget.TextView f521a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.Tools.m f522b;

            a(android.ext.Tools.m r1, android.widget.TextView r2) {
                    r0 = this;
                    r0.f522b = r1
                    r0.f521a = r2
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r1, int r2) {
                    r0 = this;
                    android.widget.TextView r1 = r0.f521a
                    java.lang.CharSequence r1 = r1.getText()
                    java.lang.String r1 = r1.toString()
                    java.lang.String r1 = r1.trim()
                    r2 = 0
                    android.ext.Tools.A(r1, r2)
                    return
            }
        }

        class b implements android.content.DialogInterface.OnShowListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.fix.ScrollView f523a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.Tools.m f524b;

            class a implements java.lang.Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ android.ext.Tools.m.b f525a;

                a(android.ext.Tools.m.b r1) {
                        r0 = this;
                        r0.f525a = r1
                        r0.<init>()
                        return
                }

                @Override // java.lang.Runnable
                public void run() {
                        r2 = this;
                        android.ext.Tools$m$b r0 = r2.f525a
                        android.fix.ScrollView r0 = r0.f523a
                        r1 = 130(0x82, float:1.82E-43)
                        r0.fullScroll(r1)
                        return
                }
            }

            b(android.ext.Tools.m r1, android.fix.ScrollView r2) {
                    r0 = this;
                    r0.f524b = r1
                    r0.f523a = r2
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(android.content.DialogInterface r4) {
                    r3 = this;
                    android.fix.ScrollView r4 = r3.f523a
                    android.ext.Tools$m$b$a r0 = new android.ext.Tools$m$b$a
                    r0.<init>(r3)
                    r1 = 100
                    r4.postDelayed(r0, r1)
                    return
            }
        }

        m(java.lang.String r1, int r2, java.lang.String r3, android.content.DialogInterface.OnClickListener r4) {
                r0 = this;
                r0.f517a = r1
                r0.f518b = r2
                r0.f519c = r3
                r0.f520d = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                r0 = 2131099656(0x7f060008, float:1.7811671E38)
                r1 = 0
                android.view.View r0 = a.d.f(r0, r1)
                r2 = 2131034313(0x7f0500c9, float:1.767914E38)
                android.view.View r2 = r0.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                java.lang.String r3 = r8.f517a
                r2.setText(r3)
                int r3 = r8.f518b
                r3 = r3 & 4
                if (r3 == 0) goto L3e
                java.lang.String r3 = r8.f517a
                r4 = 8291(0x2063, float:1.1618E-41)
                int r3 = r3.indexOf(r4)
                if (r3 < 0) goto L3e
                android.text.SpannableString r4 = new android.text.SpannableString
                java.lang.String r5 = r8.f517a
                r4.<init>(r5)
                android.text.style.BackgroundColorSpan r5 = new android.text.style.BackgroundColorSpan
                r6 = -7864320(0xffffffffff880000, float:NaN)
                r5.<init>(r6)
                int r6 = r3 + 4
                r7 = 33
                r4.setSpan(r5, r3, r6, r7)
                r2.setText(r4)
            L3e:
                r3 = 2131034312(0x7f0500c8, float:1.7679138E38)
                android.view.View r3 = r0.findViewById(r3)
                android.fix.ScrollView r3 = (android.fix.ScrollView) r3
                r4 = 1
                r3.setFastScrollEnabled(r4)
                android.app.AlertDialog$Builder r5 = android.ext.f.b()
                r6 = 2131296836(0x7f090244, float:1.82116E38)
                java.lang.String r6 = android.ext.b2.f(r6)
                android.app.AlertDialog$Builder r1 = r5.setPositiveButton(r6, r1)
                android.app.AlertDialog$Builder r0 = r1.setView(r0)
                int r1 = r8.f518b
                r1 = r1 & 2
                if (r1 != 0) goto L6f
                android.ext.Tools$m$a r1 = new android.ext.Tools$m$a
                r1.<init>(r8, r2)
                r2 = 2131296338(0x7f090052, float:1.821059E38)
                r0.setNegativeButton(r2, r1)
            L6f:
                java.lang.String r1 = r8.f519c
                if (r1 == 0) goto L78
                android.content.DialogInterface$OnClickListener r2 = r8.f520d
                r0.setNeutralButton(r1, r2)
            L78:
                android.app.AlertDialog r0 = r0.create()
                int r1 = r8.f518b
                r1 = r1 & r4
                if (r1 == 0) goto L89
                android.ext.Tools$m$b r1 = new android.ext.Tools$m$b
                r1.<init>(r8, r3)
                android.ext.f.l(r0, r1)
            L89:
                android.ext.f.m(r0)
                android.view.Window r0 = r0.getWindow()
                android.view.WindowManager$LayoutParams r1 = r0.getAttributes()
                r2 = -1
                r1.width = r2
                r0.setAttributes(r1)
                return
        }
    }

    class n implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.widget.ListView f526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f528c;

        n(android.widget.ListView r1, int r2, int r3) {
                r0 = this;
                r0.f526a = r1
                r0.f527b = r2
                r0.f528c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.widget.ListView r0 = r3.f526a
                int r1 = r3.f527b
                int r2 = r3.f528c
                r0.setSelectionFromTop(r1, r2)
                return
        }
    }

    class o implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View f529a;

        o(android.view.View r1) {
                r0 = this;
                r0.f529a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.view.View r0 = r2.f529a
                android.view.ViewParent r0 = r0.getParent()
                boolean r1 = r0 instanceof android.ext.Tools.ViewWrapper
                if (r1 == 0) goto L12
                android.ext.Tools$ViewWrapper r0 = (android.ext.Tools.ViewWrapper) r0
                android.ext.Tools.m1(r0)
                r0.removeAllViews()
            L12:
                return
        }
    }

    class p implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.view.WindowManager.LayoutParams f531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.view.View f532c;

        p(boolean r1, android.view.WindowManager.LayoutParams r2, android.view.View r3) {
                r0 = this;
                r0.f530a = r1
                r0.f531b = r2
                r0.f532c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.lang.String r0 = "Fail"
                android.ext.Tools.p()
                boolean r1 = r4.f530a     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L17 java.lang.IllegalArgumentException -> L19 android.view.WindowManager.BadTokenException -> L1b
                if (r1 == 0) goto L1d
                android.ext.MainService r1 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L17 java.lang.IllegalArgumentException -> L19 android.view.WindowManager.BadTokenException -> L1b
                android.view.WindowManager r1 = r1.l     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L17 java.lang.IllegalArgumentException -> L19 android.view.WindowManager.BadTokenException -> L1b
                android.view.View r2 = r4.f532c     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L17 java.lang.IllegalArgumentException -> L19 android.view.WindowManager.BadTokenException -> L1b
                android.view.WindowManager$LayoutParams r3 = r4.f531b     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L17 java.lang.IllegalArgumentException -> L19 android.view.WindowManager.BadTokenException -> L1b
                r1.addView(r2, r3)     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L17 java.lang.IllegalArgumentException -> L19 android.view.WindowManager.BadTokenException -> L1b
                goto L74
            L15:
                r1 = move-exception
                goto L29
            L17:
                r0 = move-exception
                goto L2d
            L19:
                r1 = move-exception
                goto L29
            L1b:
                r0 = move-exception
                goto L31
            L1d:
                android.ext.MainService r1 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L17 java.lang.IllegalArgumentException -> L19 android.view.WindowManager.BadTokenException -> L1b
                android.view.WindowManager r1 = r1.l     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L17 java.lang.IllegalArgumentException -> L19 android.view.WindowManager.BadTokenException -> L1b
                android.view.View r2 = r4.f532c     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L17 java.lang.IllegalArgumentException -> L19 android.view.WindowManager.BadTokenException -> L1b
                android.view.WindowManager$LayoutParams r3 = r4.f531b     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L17 java.lang.IllegalArgumentException -> L19 android.view.WindowManager.BadTokenException -> L1b
                r1.updateViewLayout(r2, r3)     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L17 java.lang.IllegalArgumentException -> L19 android.view.WindowManager.BadTokenException -> L1b
                goto L74
            L29:
                android.ext.e1.s(r0, r1)
                goto L74
            L2d:
                android.ext.e1.a(r0)
                goto L74
            L31:
                java.lang.String r1 = r0.getMessage()
                boolean r2 = android.ext.m2.f1074a
                if (r2 == 0) goto L83
                if (r1 == 0) goto L83
                java.lang.String r2 = "permission denied"
                boolean r1 = r1.contains(r2)
                if (r1 == 0) goto L83
                android.view.WindowManager$LayoutParams r1 = r4.f531b
                int r1 = r1.type
                int r2 = android.ext.m2.c()
                if (r1 == r2) goto L83
                android.view.WindowManager$LayoutParams r0 = r4.f531b
                int r1 = r0.type
                int r2 = android.ext.m2.c()
                r0.type = r2
                boolean r0 = r4.f530a     // Catch: android.view.WindowManager.BadTokenException -> L67
                if (r0 == 0) goto L69
                android.ext.MainService r0 = android.ext.MainService.instance     // Catch: android.view.WindowManager.BadTokenException -> L67
                android.view.WindowManager r0 = r0.l     // Catch: android.view.WindowManager.BadTokenException -> L67
                android.view.View r2 = r4.f532c     // Catch: android.view.WindowManager.BadTokenException -> L67
                android.view.WindowManager$LayoutParams r3 = r4.f531b     // Catch: android.view.WindowManager.BadTokenException -> L67
                r0.addView(r2, r3)     // Catch: android.view.WindowManager.BadTokenException -> L67
                goto L74
            L67:
                r0 = move-exception
                goto L7e
            L69:
                android.ext.MainService r0 = android.ext.MainService.instance     // Catch: android.view.WindowManager.BadTokenException -> L67
                android.view.WindowManager r0 = r0.l     // Catch: android.view.WindowManager.BadTokenException -> L67
                android.view.View r2 = r4.f532c     // Catch: android.view.WindowManager.BadTokenException -> L67
                android.view.WindowManager$LayoutParams r3 = r4.f531b     // Catch: android.view.WindowManager.BadTokenException -> L67
                r0.updateViewLayout(r2, r3)     // Catch: android.view.WindowManager.BadTokenException -> L67
            L74:
                boolean r0 = r4.f530a
                if (r0 == 0) goto L7d
                android.view.View r0 = r4.f532c
                android.ext.Tools.S(r0)
            L7d:
                return
            L7e:
                android.view.WindowManager$LayoutParams r2 = r4.f531b
                r2.type = r1
                throw r0
            L83:
                throw r0
        }
    }

    class q implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View f533a;

        q(android.view.View r1) {
                r0 = this;
                r0.f533a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> La
                android.view.WindowManager r0 = r0.l     // Catch: java.lang.Throwable -> La
                android.view.View r1 = r3.f533a     // Catch: java.lang.Throwable -> La
                r0.removeView(r1)     // Catch: java.lang.Throwable -> La
                goto L21
            La:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed removeView: "
                r1.append(r2)
                android.view.View r2 = r3.f533a
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.ext.e1.l(r1, r0)
            L21:
                return
        }
    }

    class r implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.widget.ImageView f534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f535b;

        r(android.widget.ImageView r1, float r2) {
                r0 = this;
                r0.f534a = r1
                r0.f535b = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.widget.ImageView r0 = r2.f534a     // Catch: java.lang.NoSuchMethodError -> L9
                float r1 = r2.f535b     // Catch: java.lang.NoSuchMethodError -> L9
                int r1 = (int) r1     // Catch: java.lang.NoSuchMethodError -> L9
                r0.setImageAlpha(r1)     // Catch: java.lang.NoSuchMethodError -> L9
                goto L1e
            L9:
                r0 = move-exception
                java.lang.String r1 = "setImageAlpha 1"
                android.ext.e1.s(r1, r0)     // Catch: java.lang.NoSuchMethodError -> L18
                android.widget.ImageView r0 = r2.f534a     // Catch: java.lang.NoSuchMethodError -> L18
                float r1 = r2.f535b     // Catch: java.lang.NoSuchMethodError -> L18
                int r1 = (int) r1     // Catch: java.lang.NoSuchMethodError -> L18
                r0.setAlpha(r1)     // Catch: java.lang.NoSuchMethodError -> L18
                goto L1e
            L18:
                r0 = move-exception
                java.lang.String r1 = "setImageAlpha 2"
                android.ext.e1.s(r1, r0)
            L1e:
                return
        }
    }

    class s implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.widget.TextView f536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.graphics.drawable.Drawable f537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f538c;

        s(android.widget.TextView r1, android.graphics.drawable.Drawable r2, int r3) {
                r0 = this;
                r0.f536a = r1
                r0.f537b = r2
                r0.f538c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.widget.TextView r0 = r3.f536a
                android.graphics.drawable.Drawable r1 = r3.f537b
                int r2 = r3.f538c
                android.ext.Tools.b(r0, r1, r2)
                return
        }
    }

    class t implements android.view.ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f539a;

        t(int r1) {
                r0 = this;
                r0.f539a = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(android.view.View r1, android.view.View r2) {
                r0 = this;
                r1 = 16908308(0x1020014, float:2.3877285E-38)
                android.view.View r1 = r2.findViewById(r1)     // Catch: java.lang.Throwable -> L15
                boolean r2 = r1 instanceof android.widget.TextView     // Catch: java.lang.Throwable -> L15
                if (r2 == 0) goto L19
                android.widget.TextView r1 = (android.widget.TextView) r1     // Catch: java.lang.Throwable -> L15
                int r2 = r0.f539a     // Catch: java.lang.Throwable -> L15
                if (r2 == 0) goto L19
                android.ext.Tools.D1(r1, r2)     // Catch: java.lang.Throwable -> L15
                goto L19
            L15:
                r1 = move-exception
                android.ext.e1.a(r1)
            L19:
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(android.view.View r1, android.view.View r2) {
                r0 = this;
                return
        }
    }

    class u implements android.view.ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.CharSequence[] f541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.graphics.drawable.Drawable[] f542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f543d;

        class a implements android.text.TextWatcher {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.widget.TextView f544a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.Tools.u f545b;

            a(android.ext.Tools.u r1, android.widget.TextView r2) {
                    r0 = this;
                    r0.f545b = r1
                    r0.f544a = r2
                    r0.<init>()
                    return
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable r2) {
                    r1 = this;
                    r0 = 0
                    r1.onTextChanged(r2, r0, r0, r0)
                    return
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                    r0 = this;
                    return
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                    r0 = this;
                    java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L26
                    r2 = 0
                L5:
                    android.ext.Tools$u r3 = r0.f545b     // Catch: java.lang.Throwable -> L26
                    java.lang.CharSequence[] r3 = r3.f541b     // Catch: java.lang.Throwable -> L26
                    int r4 = r3.length     // Catch: java.lang.Throwable -> L26
                    if (r2 >= r4) goto L2e
                    r3 = r3[r2]     // Catch: java.lang.Throwable -> L26
                    java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L26
                    boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L26
                    if (r3 == 0) goto L28
                    android.widget.TextView r1 = r0.f544a     // Catch: java.lang.Throwable -> L26
                    android.ext.Tools$u r3 = r0.f545b     // Catch: java.lang.Throwable -> L26
                    android.graphics.drawable.Drawable[] r4 = r3.f542c     // Catch: java.lang.Throwable -> L26
                    r2 = r4[r2]     // Catch: java.lang.Throwable -> L26
                    int r3 = r3.f543d     // Catch: java.lang.Throwable -> L26
                    android.ext.Tools.c(r1, r2, r3)     // Catch: java.lang.Throwable -> L26
                    goto L2e
                L26:
                    r1 = move-exception
                    goto L2b
                L28:
                    int r2 = r2 + 1
                    goto L5
                L2b:
                    android.ext.e1.a(r1)
                L2e:
                    return
            }
        }

        u(int r1, java.lang.CharSequence[] r2, android.graphics.drawable.Drawable[] r3, int r4) {
                r0 = this;
                r0.f540a = r1
                r0.f541b = r2
                r0.f542c = r3
                r0.f543d = r4
                r0.<init>()
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(android.view.View r2, android.view.View r3) {
                r1 = this;
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                android.view.View r2 = r3.findViewById(r2)     // Catch: java.lang.Throwable -> L15
                boolean r3 = r2 instanceof android.widget.TextView     // Catch: java.lang.Throwable -> L15
                if (r3 == 0) goto L34
                android.widget.TextView r2 = (android.widget.TextView) r2     // Catch: java.lang.Throwable -> L15
                int r3 = r1.f540a     // Catch: java.lang.Throwable -> L15
                if (r3 == 0) goto L17
                android.ext.Tools.D1(r2, r3)     // Catch: java.lang.Throwable -> L15
                goto L17
            L15:
                r2 = move-exception
                goto L31
            L17:
                java.lang.Object r3 = r2.getTag()     // Catch: java.lang.Throwable -> L15
                if (r3 != 0) goto L34
                android.ext.Tools$u$a r3 = new android.ext.Tools$u$a     // Catch: java.lang.Throwable -> L15
                r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L15
                r2.addTextChangedListener(r3)     // Catch: java.lang.Throwable -> L15
                r2.setTag(r3)     // Catch: java.lang.Throwable -> L15
                java.lang.CharSequence r2 = r2.getText()     // Catch: java.lang.Throwable -> L15
                r0 = 0
                r3.onTextChanged(r2, r0, r0, r0)     // Catch: java.lang.Throwable -> L15
                goto L34
            L31:
                android.ext.e1.a(r2)
            L34:
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(android.view.View r1, android.view.View r2) {
                r0 = this;
                return
        }
    }

    private static class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.CharSequence f546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f547b;

        public v(java.lang.CharSequence r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f546a = r1
                r0.f547b = r2
                return
        }
    }

    private static class w implements android.view.View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.ArrayList f548a;

        private w() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f548a = r0
                return
        }

        /* synthetic */ w(android.ext.Tools.j r1) {
                r0 = this;
                r0.<init>()
                return
        }

        void a(android.view.View.OnFocusChangeListener r2) {
                r1 = this;
                if (r2 == 0) goto L10
                java.util.ArrayList r0 = r1.f548a
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto Lb
                goto L10
            Lb:
                java.util.ArrayList r0 = r1.f548a
                r0.add(r2)
            L10:
                return
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View r3, boolean r4) {
                r2 = this;
                java.util.ArrayList r0 = r2.f548a
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                android.view.View$OnFocusChangeListener r1 = (android.view.View.OnFocusChangeListener) r1
                r1.onFocusChange(r3, r4)
                goto L6
            L16:
                return
        }
    }

    public static class x extends android.os.Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.os.Handler f549a;

        public x(android.os.Handler r2) {
                r1 = this;
                android.os.Looper r0 = r2.getLooper()
                r1.<init>(r0)
                r1.f549a = r2
                return
        }

        public static android.os.Handler a(android.os.Handler r1) {
                boolean r0 = r1 instanceof android.ext.Tools.x
                if (r0 != 0) goto La
                android.ext.Tools$x r0 = new android.ext.Tools$x
                r0.<init>(r1)
                r1 = r0
            La:
                return r1
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r2) {
                r1 = this;
                android.os.Handler r0 = r1.f549a     // Catch: java.lang.Throwable -> L6
                r0.handleMessage(r2)     // Catch: java.lang.Throwable -> L6
                goto La
            L6:
                r2 = move-exception
                android.ext.e1.a(r2)
            La:
                return
        }
    }

    private static class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.Class f550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.lang.String f551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        java.lang.Class[] f552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        java.lang.Object f553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        java.lang.Object[] f554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        java.lang.reflect.Method f555f;

        public y(java.lang.Class r1, java.lang.String r2, java.lang.Class[] r3, java.lang.Object r4, java.lang.Object[] r5) {
                r0 = this;
                r0.<init>()
                r0.f550a = r1
                r0.f551b = r2
                r0.f552c = r3
                r0.f553d = r4
                r0.f554e = r5
                r1 = 0
                r0.f555f = r1
                return
        }

        public android.ext.Tools.y a() {
                r3 = this;
                java.lang.Class r0 = r3.f550a
                java.lang.String r1 = r3.f551b
                java.lang.Class[] r2 = r3.f552c
                java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
                r3.f555f = r0
                return r3
        }

        public java.lang.Object b() {
                r3 = this;
                java.lang.reflect.Method r0 = r3.f555f
                java.lang.Object r1 = r3.f553d
                java.lang.Object[] r2 = r3.f554e
                java.lang.Object r0 = r0.invoke(r1, r2)
                return r0
        }
    }

    public static class z implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.Runnable f556a;

        public z(java.lang.Runnable r1) {
                r0 = this;
                r0.<init>()
                r0.f556a = r1
                return
        }

        public static java.lang.Runnable a(java.lang.Runnable r1) {
                boolean r0 = r1 instanceof android.ext.Tools.z
                if (r0 != 0) goto La
                android.ext.Tools$z r0 = new android.ext.Tools$z
                r0.<init>(r1)
                r1 = r0
            La:
                return r1
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.lang.Runnable r0 = r1.f556a     // Catch: java.lang.Throwable -> L6
                r0.run()     // Catch: java.lang.Throwable -> L6
                goto La
            L6:
                r0 = move-exception
                android.ext.e1.a(r0)
            La:
                return
        }
    }

    static {
            java.util.Random r0 = new java.util.Random
            long r1 = java.lang.System.currentTimeMillis()
            r0.<init>(r1)
            android.ext.Tools.f489a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = -1
            if (r0 < r1) goto L14
            r0 = -1
            goto L15
        L14:
            r0 = 1
        L15:
            android.ext.Tools.f490b = r0
            r0 = 0
            android.ext.Tools.f491c = r0
            android.ext.Tools.f492d = r2
            android.ext.Tools.f493e = r2
            java.lang.String r0 = "(\\d+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            android.ext.Tools.f494f = r0
            r0 = 0
            android.ext.Tools.h = r0
            android.ext.Tools.i = r0
            android.ext.Tools.j = r0
            android.ext.Tools.k = r0
            android.ext.Tools.l = r0
            android.ext.Tools.m = r0
            android.ext.Tools$b0 r1 = new android.ext.Tools$b0
            r1.<init>(r0)
            android.ext.Tools.n = r1
            r1 = 10
            int[] r1 = new int[r1]
            r1 = {x0060: FILL_ARRAY_DATA , data: [2131297055, 60, 2131297054, 60, 2131297053, 24, 2131297052, 365, 2131297056, -1} // fill-array
            android.ext.Tools.o = r1
            android.ext.Tools.p = r0
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            android.ext.Tools.q = r1
            r1 = 0
            android.ext.Tools.r = r1
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            android.ext.Tools.s = r3
            android.ext.Tools.t = r1
            android.ext.Tools.u = r1
            android.ext.Tools.v = r0
            android.ext.Tools.w = r2
            return
    }

    public static void A(java.lang.String r1, boolean r2) {
            if (r1 != 0) goto L3
            return
        L3:
            android.ext.Tools$a r0 = new android.ext.Tools$a
            r0.<init>(r1, r2)
            android.ext.n2.i(r0)
            return
    }

    public static android.content.pm.PackageInfo A0(java.lang.String r20, int r21) {
            r1 = r20
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r0 = android.ext.a0.i(r20)
            r3 = 0
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed getPackageInfo, isBuggedPackage: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.i(r0)
            goto Le5
        L21:
            android.content.pm.PackageManager r0 = B0()
            java.lang.String r4 = "Failed getPackageInfo"
            if (r0 == 0) goto L53
            java.lang.String r5 = "pkg_info"
            boolean r5 = android.ext.a0.a(r1, r5)     // Catch: java.lang.Throwable -> L44
            r6 = r21
            android.content.pm.PackageInfo r7 = r0.getPackageInfo(r1, r6)     // Catch: java.lang.Throwable -> L3b
            android.ext.a0.b(r5)     // Catch: java.lang.Throwable -> L39
            goto L56
        L39:
            r0 = move-exception
            goto L48
        L3b:
            r0 = move-exception
            r7 = r0
            android.ext.a0.b(r5)     // Catch: java.lang.Throwable -> L41
            throw r7     // Catch: java.lang.Throwable -> L41
        L41:
            r0 = move-exception
        L42:
            r7 = r3
            goto L48
        L44:
            r0 = move-exception
            r6 = r21
            goto L42
        L48:
            boolean r5 = r0 instanceof android.content.pm.PackageManager.NameNotFoundException
            if (r5 != 0) goto L50
            android.ext.e1.l(r4, r0)
            goto L56
        L50:
            android.content.pm.PackageManager$NameNotFoundException r0 = (android.content.pm.PackageManager.NameNotFoundException) r0
            throw r0
        L53:
            r6 = r21
            r7 = r3
        L56:
            if (r7 != 0) goto Le4
            java.lang.Object r0 = u0()
            if (r0 == 0) goto Le4
            java.lang.Class r5 = r0.getClass()     // Catch: java.lang.Throwable -> Lca
            r14 = 2
            android.ext.Tools$y[] r15 = new android.ext.Tools.y[r14]     // Catch: java.lang.Throwable -> Lca
            android.ext.Tools$y r16 = new android.ext.Tools$y     // Catch: java.lang.Throwable -> Lca
            java.lang.String r10 = "getPackageInfo"
            r8 = 3
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> Lca
            r17 = 0
            r11[r17] = r2     // Catch: java.lang.Throwable -> Lca
            java.lang.Class r18 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lca
            r19 = 1
            r11[r19] = r18     // Catch: java.lang.Throwable -> Lca
            r11[r14] = r18     // Catch: java.lang.Throwable -> Lca
            java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Lca
            r13[r17] = r1     // Catch: java.lang.Throwable -> Lca
            java.lang.Integer r8 = java.lang.Integer.valueOf(r21)     // Catch: java.lang.Throwable -> Lca
            r13[r19] = r8     // Catch: java.lang.Throwable -> Lca
            java.lang.Integer r8 = java.lang.Integer.valueOf(r17)     // Catch: java.lang.Throwable -> Lca
            r13[r14] = r8     // Catch: java.lang.Throwable -> Lca
            r8 = r16
            r9 = r5
            r12 = r0
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lca
            r15[r17] = r16     // Catch: java.lang.Throwable -> Lca
            android.ext.Tools$y r16 = new android.ext.Tools$y     // Catch: java.lang.Throwable -> Lca
            java.lang.String r10 = "getPackageInfo"
            java.lang.Class[] r11 = new java.lang.Class[r14]     // Catch: java.lang.Throwable -> Lca
            r11[r17] = r2     // Catch: java.lang.Throwable -> Lca
            r11[r19] = r18     // Catch: java.lang.Throwable -> Lca
            java.lang.Object[] r13 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> Lca
            r13[r17] = r1     // Catch: java.lang.Throwable -> Lca
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)     // Catch: java.lang.Throwable -> Lca
            r13[r19] = r2     // Catch: java.lang.Throwable -> Lca
            r8 = r16
            r9 = r5
            r12 = r0
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lca
            r15[r19] = r16     // Catch: java.lang.Throwable -> Lca
            android.ext.Tools$y r0 = x0(r5, r15)     // Catch: java.lang.Throwable -> Lca
            if (r0 == 0) goto Ld2
            java.lang.String r2 = "pkg_info2"
            boolean r2 = android.ext.a0.a(r1, r2)     // Catch: java.lang.Throwable -> Lca
            java.lang.Object r3 = r0.b()     // Catch: java.lang.Throwable -> Lcc
            android.ext.a0.b(r2)     // Catch: java.lang.Throwable -> Lca
            if (r3 == 0) goto Lc4
            goto Ld2
        Lc4:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException     // Catch: java.lang.Throwable -> Lca
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lca
            throw r0     // Catch: java.lang.Throwable -> Lca
        Lca:
            r0 = move-exception
            goto Ld9
        Lcc:
            r0 = move-exception
            r1 = r0
            android.ext.a0.b(r2)     // Catch: java.lang.Throwable -> Lca
            throw r1     // Catch: java.lang.Throwable -> Lca
        Ld2:
            boolean r0 = r3 instanceof android.content.pm.PackageInfo     // Catch: java.lang.Throwable -> Lca
            if (r0 == 0) goto Le4
            android.content.pm.PackageInfo r3 = (android.content.pm.PackageInfo) r3     // Catch: java.lang.Throwable -> Lca
            goto Le5
        Ld9:
            boolean r1 = r0 instanceof android.content.pm.PackageManager.NameNotFoundException
            if (r1 != 0) goto Le1
            android.ext.e1.l(r4, r0)
            goto Le4
        Le1:
            android.content.pm.PackageManager$NameNotFoundException r0 = (android.content.pm.PackageManager.NameNotFoundException) r0
            throw r0
        Le4:
            r3 = r7
        Le5:
            return r3
    }

    public static void A1(android.widget.ListView r1, android.ext.Tools.a0 r2) {
            if (r2 != 0) goto L3
            return
        L3:
            int r0 = r2.f498a
            int r2 = r2.f499b
            B1(r1, r0, r2)
            return
    }

    public static void B(java.lang.String r14, java.lang.StringBuilder r15) {
            java.lang.String r0 = "; "
            if (r15 != 0) goto La
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Lb
        La:
            r1 = r15
        Lb:
            java.lang.String r2 = "\nActivities:\n"
            r1.append(r2)
            if (r15 != 0) goto L22
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            android.ext.e1.d(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L22:
            r2 = 1
            android.content.pm.PackageInfo r2 = A0(r14, r2)     // Catch: java.lang.Throwable -> L28
            goto L29
        L28:
            r2 = 0
        L29:
            if (r2 != 0) goto L4e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Null for: "
            r0.append(r2)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r1.append(r14)
            if (r15 != 0) goto Le3
        L41:
            java.lang.String r14 = r1.toString()
            java.lang.String r14 = r14.trim()
            android.ext.e1.d(r14)
            goto Le3
        L4e:
            android.content.pm.ActivityInfo[] r2 = r2.activities
            if (r2 != 0) goto L5a
            java.lang.String r14 = "Null"
            r1.append(r14)
            if (r15 != 0) goto Le3
            goto L41
        L5a:
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L5d:
            if (r5 >= r3) goto Le3
            r6 = r2[r5]
            r7 = 10
            r1.append(r6)     // Catch: java.lang.Throwable -> La3
            if (r6 == 0) goto Lab
            r1.append(r7)     // Catch: java.lang.Throwable -> La3
            java.lang.Class<android.content.pm.ActivityInfo> r8 = android.content.pm.ActivityInfo.class
            java.lang.reflect.Field[] r8 = r8.getFields()     // Catch: java.lang.Throwable -> La3
            int r9 = r8.length     // Catch: java.lang.Throwable -> La3
            r10 = 0
        L73:
            if (r10 >= r9) goto Lab
            r11 = r8[r10]     // Catch: java.lang.Throwable -> La3
            int r12 = r11.getModifiers()     // Catch: java.lang.Throwable -> La3
            boolean r13 = java.lang.reflect.Modifier.isPublic(r12)     // Catch: java.lang.Throwable -> La3
            if (r13 == 0) goto La5
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)     // Catch: java.lang.Throwable -> La3
            if (r12 != 0) goto La5
            java.lang.String r12 = r11.getName()     // Catch: java.lang.Throwable -> La3
            r1.append(r12)     // Catch: java.lang.Throwable -> La3
            java.lang.String r12 = ": "
            r1.append(r12)     // Catch: java.lang.Throwable -> La3
            java.lang.Object r11 = r11.get(r6)     // Catch: java.lang.Throwable -> L9b
            r1.append(r11)     // Catch: java.lang.Throwable -> L9b
            goto L9f
        L9b:
            r11 = move-exception
            r1.append(r11)     // Catch: java.lang.Throwable -> La3
        L9f:
            r1.append(r0)     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r8 = move-exception
            goto La8
        La5:
            int r10 = r10 + 1
            goto L73
        La8:
            r1.append(r8)
        Lab:
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = r6.name     // Catch: java.lang.Throwable -> Lc6
            r8.<init>(r14, r6)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r6 = "enabled: "
            r1.append(r6)     // Catch: java.lang.Throwable -> Lc6
            android.content.pm.PackageManager r6 = B0()     // Catch: java.lang.Throwable -> Lc6
            int r6 = r6.getComponentEnabledSetting(r8)     // Catch: java.lang.Throwable -> Lc6
            r1.append(r6)     // Catch: java.lang.Throwable -> Lc6
            r1.append(r0)     // Catch: java.lang.Throwable -> Lc6
            goto Lca
        Lc6:
            r6 = move-exception
            r1.append(r6)
        Lca:
            r1.append(r7)
            if (r15 != 0) goto Ldf
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            android.ext.e1.d(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        Ldf:
            int r5 = r5 + 1
            goto L5d
        Le3:
            return
    }

    public static android.content.pm.PackageManager B0() {
            android.content.pm.PackageManager r0 = android.ext.Tools.k
            if (r0 != 0) goto L1f
            android.ext.Tools$b0 r0 = android.ext.Tools.n
            r1 = 1
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L1f
            android.ext.r r0 = android.ext.r.n     // Catch: java.lang.Throwable -> L16
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L16
            android.ext.Tools.k = r0     // Catch: java.lang.Throwable -> L16
            goto L1a
        L16:
            r0 = move-exception
            android.ext.e1.a(r0)
        L1a:
            android.ext.Tools$b0 r0 = android.ext.Tools.n
            r0.a(r1)
        L1f:
            android.content.pm.PackageManager r0 = android.ext.Tools.k
            if (r0 != 0) goto L42
            android.ext.Tools$b0 r0 = android.ext.Tools.n
            r1 = 2
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L42
            android.ext.r r0 = android.ext.r.n     // Catch: java.lang.Throwable -> L39
            android.app.Application r0 = r0.getApplication()     // Catch: java.lang.Throwable -> L39
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L39
            android.ext.Tools.k = r0     // Catch: java.lang.Throwable -> L39
            goto L3d
        L39:
            r0 = move-exception
            android.ext.e1.a(r0)
        L3d:
            android.ext.Tools$b0 r0 = android.ext.Tools.n
            r0.a(r1)
        L42:
            android.content.pm.PackageManager r0 = android.ext.Tools.k
            if (r0 != 0) goto L65
            android.ext.Tools$b0 r0 = android.ext.Tools.n
            r1 = 4
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L65
            android.ext.r r0 = android.ext.r.n     // Catch: java.lang.Throwable -> L5c
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L5c
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L5c
            android.ext.Tools.k = r0     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            r0 = move-exception
            android.ext.e1.a(r0)
        L60:
            android.ext.Tools$b0 r0 = android.ext.Tools.n
            r0.a(r1)
        L65:
            android.content.pm.PackageManager r0 = android.ext.Tools.k
            if (r0 != 0) goto L85
            android.ext.Tools$b0 r0 = android.ext.Tools.n
            r1 = 8
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L85
            android.content.Context r0 = android.ext.MainService.context     // Catch: java.lang.Throwable -> L7c
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L7c
            android.ext.Tools.k = r0     // Catch: java.lang.Throwable -> L7c
            goto L80
        L7c:
            r0 = move-exception
            android.ext.e1.a(r0)
        L80:
            android.ext.Tools$b0 r0 = android.ext.Tools.n
            r0.a(r1)
        L85:
            android.content.pm.PackageManager r0 = android.ext.Tools.k
            if (r0 != 0) goto La9
            android.ext.Tools$b0 r0 = android.ext.Tools.n
            r1 = 16
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto La9
            android.content.Context r0 = android.ext.MainService.context     // Catch: java.lang.Throwable -> La0
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> La0
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> La0
            android.ext.Tools.k = r0     // Catch: java.lang.Throwable -> La0
            goto La4
        La0:
            r0 = move-exception
            android.ext.e1.a(r0)
        La4:
            android.ext.Tools$b0 r0 = android.ext.Tools.n
            r0.a(r1)
        La9:
            android.content.pm.PackageManager r0 = android.ext.Tools.k
            return r0
    }

    public static void B1(android.widget.ListView r1, int r2, int r3) {
            r1.setSelectionFromTop(r2, r3)
            android.ext.Tools$n r0 = new android.ext.Tools$n
            r0.<init>(r1, r2, r3)
            r1.post(r0)
            return
    }

    private static void C(android.view.ViewGroup r4) {
            if (r4 != 0) goto L3
            return
        L3:
            r0 = 0
            r1 = 0
        L5:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L21
            android.view.View r2 = r4.getChildAt(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1e
            if (r2 != 0) goto L12
            goto L1e
        L12:
            r2.setSoundEffectsEnabled(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1e
            boolean r3 = r2 instanceof android.view.ViewGroup     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1e
            if (r3 == 0) goto L1e
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1e
            C(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1e
        L1e:
            int r1 = r1 + 1
            goto L5
        L21:
            return
    }

    public static java.lang.String C0() {
            java.lang.String r0 = android.ext.Tools.h
            if (r0 != 0) goto L6
            java.lang.String r0 = android.ext.i.f1002d
        L6:
            return r0
    }

    public static void C1(android.widget.ListView r1, int r2) {
            android.ext.Tools$t r0 = new android.ext.Tools$t
            r0.<init>(r2)
            r1.setOnHierarchyChangeListener(r0)
            return
    }

    public static void D(android.content.DialogInterface r1) {
            r1.getClass()
            android.ext.Tools$k r0 = new android.ext.Tools$k
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    public static int D0(java.lang.Process r2) {
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "pid"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L17
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L17
            int r2 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L17
            r1 = 0
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L17
            goto L18
        L17:
            r2 = -1
        L18:
            return r2
    }

    public static void D1(android.widget.TextView r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> La
            r1 = 23
            if (r0 < r1) goto Lc
            android.ext.r2.a(r2, r3)     // Catch: java.lang.Throwable -> La
            goto L17
        La:
            r2 = move-exception
            goto L14
        Lc:
            android.content.Context r0 = r2.getContext()     // Catch: java.lang.Throwable -> La
            r2.setTextAppearance(r0, r3)     // Catch: java.lang.Throwable -> La
            goto L17
        L14:
            android.ext.e1.a(r2)
        L17:
            return
    }

    public static void E(java.lang.ref.WeakReference r0) {
            if (r0 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r0.get()
            android.app.AlertDialog r0 = (android.app.AlertDialog) r0
            if (r0 != 0) goto Lc
            return
        Lc:
            D(r0)
            return
    }

    public static int E0() {
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "/proc/meminfo"
            java.lang.String r2 = "r"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L21
            java.util.regex.Pattern r1 = android.ext.Tools.f494f     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L21
            java.util.regex.Matcher r1 = r1.matcher(r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "-2"
        L15:
            boolean r3 = r1.find()     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L23
            r2 = 1
            java.lang.String r2 = r1.group(r2)     // Catch: java.lang.Throwable -> L21
            goto L15
        L21:
            r0 = move-exception
            goto L2b
        L23:
            r0.close()     // Catch: java.lang.Throwable -> L21
            int r0 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L21
            goto L31
        L2b:
            java.lang.String r1 = "Failed get RAM size"
            android.ext.e1.s(r1, r0)
            r0 = -1
        L31:
            return r0
    }

    public static void E1(android.view.View r1) {
            int r0 = android.ext.Config.B
            r0 = r0 & 32
            if (r0 == 0) goto L7
            return
        L7:
            if (r1 != 0) goto La
            return
        La:
            android.view.View r1 = I0(r1)
            r0 = 0
            r1.setSoundEffectsEnabled(r0)
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1b
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            C(r1)
        L1b:
            return
    }

    public static java.lang.String F(double r14) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r14
            long r1 = java.lang.Math.abs(r1)
            r3 = 0
            r4 = 0
        Lc:
            int[] r5 = android.ext.Tools.o
            int r6 = r5.length
            if (r4 >= r6) goto L5f
            int r6 = r4 + 1
            r5 = r5[r6]
            r6 = 0
            if (r5 > 0) goto L1b
            r8 = r6
            goto L21
        L1b:
            long r8 = (long) r5
            long r10 = r1 % r8
            long r1 = r1 / r8
            r8 = r1
            r1 = r10
        L21:
            int r10 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r10 < 0) goto L56
            int r10 = r0.length()
            if (r10 <= 0) goto L30
            java.lang.String r10 = ":"
            r0.insert(r3, r10)
        L30:
            if (r4 != 0) goto L53
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            double r10 = java.lang.Math.abs(r14)
            double r12 = (double) r5
            double r10 = r10 % r12
            java.lang.Double r2 = java.lang.Double.valueOf(r10)
            r1[r3] = r2
            java.lang.String r2 = "%f"
            java.lang.String r1 = L1(r2, r1)
            java.lang.String r2 = "\\D?0+$"
            java.lang.String r5 = ""
            java.lang.String r1 = r1.replaceFirst(r2, r5)
            r0.insert(r3, r1)
            goto L56
        L53:
            r0.insert(r3, r1)
        L56:
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L5b
            goto L5f
        L5b:
            int r4 = r4 + 2
            r1 = r8
            goto Lc
        L5f:
            int r1 = r0.length()
            if (r1 != 0) goto L6a
            java.lang.String r1 = "0"
            r0.insert(r3, r1)
        L6a:
            r1 = 0
            int r4 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r4 >= 0) goto L75
            java.lang.String r14 = "-"
            r0.insert(r3, r14)
        L75:
            java.lang.String r14 = r0.toString()
            return r14
    }

    public static java.lang.String F0(java.lang.String r3) {
            java.lang.String[] r0 = android.ext.Tools.v
            if (r0 == 0) goto L12
            java.lang.String[] r0 = android.ext.Tools.v
            r1 = 0
            r0 = r0[r1]
            java.lang.String[] r1 = android.ext.Tools.v
            r2 = 1
            r1 = r1[r2]
            java.lang.String r3 = r3.replace(r0, r1)
        L12:
            return r3
    }

    private static void F1(android.view.View r1, android.view.WindowManager.LayoutParams r2, boolean r3) {
            Q(r2)
            android.ext.Tools$p r0 = new android.ext.Tools$p
            r0.<init>(r3, r2, r1)
            android.ext.n2.i(r0)
            return
    }

    public static float G(float r3) {
            float r0 = android.ext.Tools.f491c
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L17
            android.content.Context r2 = f0()
            if (r2 == 0) goto L17
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
        L17:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L1d
            r0 = 1065353216(0x3f800000, float:1.0)
        L1d:
            float r3 = r3 * r0
            return r3
    }

    public static android.graphics.drawable.Drawable G0(android.graphics.drawable.Drawable r6, int r7) {
            boolean r0 = r6 instanceof android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L7a
            r0 = r6
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0     // Catch: java.lang.Throwable -> L1c
            android.graphics.Bitmap r0 = r0.getBitmap()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L7a
            int r1 = r0.getWidth()     // Catch: java.lang.Throwable -> L1c
            int r2 = r7 + 4
            if (r1 > r2) goto L1e
            int r1 = r0.getHeight()     // Catch: java.lang.Throwable -> L1c
            if (r1 <= r2) goto L7a
            goto L1e
        L1c:
            r7 = move-exception
            goto L77
        L1e:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1c
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Throwable -> L1c
            android.content.Context r4 = f0()     // Catch: java.lang.Throwable -> L1c
            android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Throwable -> L1c
            r5 = 0
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r0, r7, r7, r5)     // Catch: java.lang.Throwable -> L1c
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r6.<init>()     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "getResized: "
            r6.append(r4)     // Catch: java.lang.Throwable -> L75
            int r4 = r0.getWidth()     // Catch: java.lang.Throwable -> L75
            r6.append(r4)     // Catch: java.lang.Throwable -> L75
            r4 = 120(0x78, float:1.68E-43)
            r6.append(r4)     // Catch: java.lang.Throwable -> L75
            int r0 = r0.getHeight()     // Catch: java.lang.Throwable -> L75
            r6.append(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = " -> "
            r6.append(r0)     // Catch: java.lang.Throwable -> L75
            r6.append(r7)     // Catch: java.lang.Throwable -> L75
            r6.append(r4)     // Catch: java.lang.Throwable -> L75
            r6.append(r7)     // Catch: java.lang.Throwable -> L75
            java.lang.String r7 = " in "
            r6.append(r7)     // Catch: java.lang.Throwable -> L75
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L75
            long r4 = r4 - r1
            r6.append(r4)     // Catch: java.lang.Throwable -> L75
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L75
            android.ext.e1.d(r6)     // Catch: java.lang.Throwable -> L75
            r6 = r3
            goto L7a
        L75:
            r7 = move-exception
            r6 = r3
        L77:
            android.ext.e1.a(r7)
        L7a:
            return r6
    }

    public static void G1(android.view.View r1, float r2) {
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 == 0) goto Lc
            int r2 = (int) r2
            r0.width = r2
            r1.setLayoutParams(r0)
        Lc:
            return
    }

    public static int H() {
            int r0 = android.ext.Tools.f492d
            if (r0 >= 0) goto Ld
            r0 = 1111490560(0x42400000, float:48.0)
            float r0 = G(r0)
            int r0 = (int) r0
            android.ext.Tools.f492d = r0
        Ld:
            int r0 = android.ext.Tools.f492d
            return r0
    }

    private static java.lang.String H0() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            r2 = 4
            if (r1 >= r2) goto L29
            java.util.Random r2 = android.ext.Tools.f489a
            r3 = 63
            int r2 = r2.nextInt(r3)
            r3 = 10
            if (r2 >= r3) goto L1c
            int r2 = r2 + 48
        L17:
            char r2 = (char) r2
            r0.append(r2)
            goto L26
        L1c:
            r3 = 36
            if (r2 >= r3) goto L23
            int r2 = r2 + 55
            goto L17
        L23:
            int r2 = r2 + 61
            goto L17
        L26:
            int r1 = r1 + 1
            goto L6
        L29:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static void H1(int r1) {
            java.lang.String r1 = android.ext.b2.f(r1)
            r0 = 1
            K1(r1, r0)
            return
    }

    public static java.lang.Process I(java.lang.String[] r1) {
            r0 = 0
            java.lang.Process r1 = K(r1, r0, r0)
            return r1
    }

    public static android.view.View I0(android.view.View r2) {
            android.view.View r0 = r2.getRootView()
            if (r0 != 0) goto L15
        L6:
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r2 = r0
            android.view.View r2 = (android.view.View) r2
            goto L6
        L14:
            r0 = r2
        L15:
            return r0
    }

    public static void I1(int r0, int r1) {
            java.lang.String r0 = android.ext.b2.f(r0)
            K1(r0, r1)
            return
    }

    public static java.lang.Process J(java.lang.String[] r1, java.lang.String[] r2) {
            r0 = 0
            java.lang.Process r1 = K(r1, r2, r0)
            return r1
    }

    public static android.ext.Tools.a0 J0(android.widget.ListView r3) {
            int r0 = r3.getFirstVisiblePosition()
            r1 = 0
            android.view.View r2 = r3.getChildAt(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La
            goto Lb
        La:
            r2 = 0
        Lb:
            if (r2 != 0) goto Le
            goto L17
        Le:
            int r1 = r2.getTop()
            int r3 = r3.getPaddingTop()
            int r1 = r1 - r3
        L17:
            android.ext.Tools$a0 r3 = new android.ext.Tools$a0
            r3.<init>(r0, r1)
            return r3
    }

    public static void J1(java.lang.String r1) {
            r0 = 1
            K1(r1, r0)
            return
    }

    public static java.lang.Process K(java.lang.String[] r3, java.lang.String[] r4, java.io.File r5) {
            boolean r0 = android.ext.Tools.t
            if (r0 != 0) goto L52
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> Ld
            java.lang.Process r3 = r0.exec(r3, r4, r5)     // Catch: java.lang.Throwable -> Ld
            return r3
        Ld:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "nknown error"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L2c
            java.lang.String r2 = "xec failed"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L2c
            java.lang.String r2 = "ead failed"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L2b
            goto L2c
        L2b:
            throw r0
        L2c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed exec: "
            r1.append(r2)
            java.lang.String r2 = java.util.Arrays.toString(r3)
            r1.append(r2)
            java.lang.String r2 = "; "
            r1.append(r2)
            r1.append(r4)
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.ext.e1.s(r1, r0)
        L52:
            java.lang.Process r3 = android.lang.ProcessBuilder.c(r3, r4, r5)
            r4 = 1
            android.ext.Tools.t = r4
            return r3
    }

    public static java.lang.String K0() {
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L9
            goto L10
        L9:
            r0 = move-exception
            java.lang.String r1 = "Fail get sdcard path"
            android.ext.e1.l(r1, r0)
            r0 = 0
        L10:
            if (r0 != 0) goto L15
            java.lang.String r0 = "/sdcard"
            goto L60
        L15:
            java.lang.String r1 = "/storage/emulated/0"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L60
            int r1 = android.ext.Tools.r
            r2 = 19
            java.lang.String r3 = "/storage/emulated/legacy"
            if (r1 != 0) goto L49
            boolean r1 = c1(r0)
            if (r1 != 0) goto L46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r4 = r0.substring(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            boolean r1 = c1(r1)
            if (r1 == 0) goto L46
            r1 = 1
            goto L47
        L46:
            r1 = -1
        L47:
            android.ext.Tools.r = r1
        L49:
            int r1 = android.ext.Tools.r
            if (r1 <= 0) goto L60
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r0 = r0.substring(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L60:
            return r0
    }

    public static void K1(java.lang.String r1, int r2) {
            android.ext.Tools$b r0 = new android.ext.Tools$b
            r0.<init>(r1, r2)
            android.ext.n2.i(r0)
            return
    }

    public static void L(android.view.Window r4, android.view.View r5, boolean r6) {
            android.content.Context r0 = f0()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            android.view.WindowManager$LayoutParams r1 = r4.getAttributes()
            int r1 = r1.softInputMode
            r1 = r1 & (-16)
            r2 = 131072(0x20000, float:1.83671E-40)
            r3 = 0
            if (r6 == 0) goto L25
            r4.clearFlags(r2)
            r6 = r1 | 5
            r4.setSoftInputMode(r6)
            r0.showSoftInput(r5, r3)
            goto L3b
        L25:
            android.os.IBinder r6 = r5.getWindowToken()
            r0.hideSoftInputFromWindow(r6, r3)
            r4.addFlags(r2)
            r6 = r1 | 2
            r4.setSoftInputMode(r6)
            android.os.IBinder r4 = r5.getWindowToken()
            r0.hideSoftInputFromWindow(r4, r3)
        L3b:
            return
    }

    public static int L0(java.lang.Object r4) {
            r0 = 0
            if (r4 == 0) goto L4f
            boolean r1 = r4 instanceof d.a
            if (r1 == 0) goto L1d
            d.a r4 = (d.a) r4
            int r1 = r4.i()
            r2 = 0
        Le:
            if (r0 >= r1) goto L1b
            boolean r3 = r4.c(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L18
            if (r3 == 0) goto L18
            int r2 = r2 + 1
        L18:
            int r0 = r0 + 1
            goto Le
        L1b:
            r0 = r2
            goto L4f
        L1d:
            boolean r1 = r4 instanceof d.e
            if (r1 == 0) goto L35
            d.e r4 = (d.e) r4
            int r1 = r4.l()
            r2 = 0
        L28:
            if (r0 >= r1) goto L1b
            boolean r3 = r4.a(r0)
            if (r3 == 0) goto L32
            int r2 = r2 + 1
        L32:
            int r0 = r0 + 1
            goto L28
        L35:
            boolean r1 = r4 instanceof boolean[]
            if (r1 == 0) goto L49
            boolean[] r4 = (boolean[]) r4
            int r1 = r4.length
            r2 = 1
            int r1 = r1 - r2
        L3e:
            if (r2 >= r1) goto L4f
            boolean r3 = r4[r2]
            if (r3 == 0) goto L46
            int r0 = r0 + 1
        L46:
            int r2 = r2 + 1
            goto L3e
        L49:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L4f:
            return r0
    }

    public static java.lang.String L1(java.lang.String r3, java.lang.Object... r4) {
            java.util.Locale r0 = android.ext.k.f()     // Catch: java.lang.Throwable -> L13
            r1 = 65292(0xff0c, float:9.1494E-41)
            r2 = 44
            java.lang.String r1 = r3.replace(r1, r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = java.lang.String.format(r0, r1, r4)     // Catch: java.lang.Throwable -> L13
            goto Lbf
        L13:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed String.format('"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "', "
            r1.append(r2)
            java.lang.String r2 = java.util.Arrays.toString(r4)
            r1.append(r2)
            java.lang.String r2 = ") with '"
            r1.append(r2)
            java.util.Locale r2 = android.ext.k.f()
            r1.append(r2)
            java.lang.String r2 = "' ("
            r1.append(r2)
            r2 = 2131296732(0x7f0901dc, float:1.8211389E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r1.append(r2)
            java.lang.String r2 = ") "
            r1.append(r2)
            r2 = 2131034183(0x7f050047, float:1.7678876E38)
            android.ext.Config$p r2 = android.ext.Config.b(r2)
            int r2 = r2.f42d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.ext.e1.l(r1, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "\n\n"
            r2.append(r1)
            java.lang.String r0 = android.ext.e1.n(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.ext.n0.i(r0)
            if (r3 == 0) goto Lbf
            if (r4 == 0) goto Lbf
            int r0 = r4.length
            int r0 = r0 + 1
            java.lang.String r1 = "%(\\d+\\$)?([\\-#+ 0;\\(])?(\\d+)?(\\.\\d+)?([bBhHsScCdoxXeEfgGaA]|[tT][HIklMSLNpzZsQBbhAaCYyjmdeRTrDFc])"
            java.lang.String[] r3 = r3.split(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L8e:
            int r2 = r4.length
            if (r1 >= r2) goto La1
            int r2 = r3.length
            if (r1 >= r2) goto L99
            r2 = r3[r1]
            r0.append(r2)
        L99:
            r2 = r4[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L8e
        La1:
            int r1 = r4.length
            int r2 = r3.length
            if (r1 >= r2) goto Lab
            int r4 = r4.length
            r3 = r3[r4]
            r0.append(r3)
        Lab:
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "%n"
            java.lang.String r0 = "\n"
            java.lang.String r3 = r3.replace(r4, r0)
            java.lang.String r4 = "%%"
            java.lang.String r0 = "%"
            java.lang.String r3 = r3.replace(r4, r0)
        Lbf:
            if (r3 != 0) goto Lc3
            java.lang.String r3 = "Failed call String.format"
        Lc3:
            return r3
    }

    public static void M(java.lang.String r6, java.io.File r7) {
            android.content.Context r0 = f0()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ydw"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "raw"
            int r1 = android.ext.b2.d(r1, r2)
            r2 = 32
            if (r1 == 0) goto L68
            r3 = 8192(0x2000, float:1.148E-41)
            byte[] r3 = new byte[r3]     // Catch: java.io.IOException -> L3b
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L3b
            r4.<init>(r7)     // Catch: java.io.IOException -> L3b
            java.io.InputStream r0 = r0.openRawResource(r1)     // Catch: java.io.IOException -> L3b
        L30:
            int r1 = r0.read(r3)     // Catch: java.io.IOException -> L3b
            if (r1 <= 0) goto L3d
            r5 = 0
            r4.write(r3, r5, r1)     // Catch: java.io.IOException -> L3b
            goto L30
        L3b:
            r0 = move-exception
            goto L44
        L3d:
            r0.close()     // Catch: java.io.IOException -> L3b
            r4.close()     // Catch: java.io.IOException -> L3b
            return
        L44:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Failed extract file "
            r1.append(r3)
            r1.append(r6)
            r1.append(r2)
            java.lang.String r6 = r7.getAbsolutePath()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            android.ext.e1.g(r6, r0)
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r0)
            throw r6
        L68:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Nothing extract file "
            r0.append(r1)
            r0.append(r6)
            r0.append(r2)
            java.lang.String r6 = r7.getAbsolutePath()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.ext.e1.d(r6)
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Nothing extract"
            r6.<init>(r7)
            throw r6
    }

    public static android.content.SharedPreferences M0() {
            java.lang.ref.WeakReference r0 = android.ext.Tools.s
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            if (r0 != 0) goto L1c
            android.content.Context r0 = f0()
            java.lang.String r1 = android.ext.MainService.G0
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            android.ext.Tools.s = r1
        L1c:
            return r0
    }

    public static java.lang.String M1(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.Object r7) {
            r0 = 0
            r1 = 1
            java.util.Locale r2 = android.ext.k.f()     // Catch: java.lang.Throwable -> Lf
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lf
            r3[r0] = r7     // Catch: java.lang.Throwable -> Lf
            java.lang.String r4 = java.lang.String.format(r2, r4, r3)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r4 = move-exception
            java.lang.String r2 = "Format fail 1"
            android.ext.e1.s(r2, r4)
            r4 = 0
        L16:
            if (r4 != 0) goto L2b
            java.util.Locale r2 = android.ext.k.f()     // Catch: java.lang.Throwable -> L25
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L25
            r1[r0] = r7     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = java.lang.String.format(r2, r5, r1)     // Catch: java.lang.Throwable -> L25
            goto L2b
        L25:
            r5 = move-exception
            java.lang.String r7 = "Format fail 2"
            android.ext.e1.s(r7, r5)
        L2b:
            if (r4 != 0) goto L2e
            goto L2f
        L2e:
            r6 = r4
        L2f:
            return r6
    }

    public static void N(android.app.AlertDialog r17) {
            r0 = r17
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 3
            android.widget.Button[] r2 = new android.widget.Button[r1]
            r3 = -1
            android.widget.Button r4 = r0.getButton(r3)
            r5 = 0
            r2[r5] = r4
            r4 = -2
            android.widget.Button r6 = r0.getButton(r4)
            r7 = 1
            r2[r7] = r6
            r6 = -3
            android.widget.Button r0 = r0.getButton(r6)
            r6 = 2
            r2[r6] = r0
            r0 = 0
            r8 = 0
        L22:
            if (r8 >= r1) goto L35
            r9 = r2[r8]
            if (r9 != 0) goto L29
            goto L32
        L29:
            android.view.ViewParent r0 = r9.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L32
            goto L35
        L32:
            int r8 = r8 + 1
            goto L22
        L35:
            if (r0 != 0) goto L38
            return
        L38:
            int r8 = r0.getWidth()
            if (r8 != 0) goto L54
            r0.requestLayout()
            int r8 = r0.getWidth()
            if (r8 != 0) goto L4b
            int r8 = r0.getMeasuredWidth()
        L4b:
            if (r8 != 0) goto L54
            r0.measure(r3, r4)
            int r8 = r0.getMeasuredWidth()
        L54:
            if (r8 != 0) goto L57
            return
        L57:
            boolean r4 = P0(r8, r0, r5)
            if (r4 == 0) goto L5e
            return
        L5e:
            r4 = 0
        L5f:
            if (r4 >= r1) goto L6c
            r9 = r2[r4]
            if (r9 != 0) goto L66
            goto L69
        L66:
            r9.setAllCaps(r5)
        L69:
            int r4 = r4 + 1
            goto L5f
        L6c:
            r4 = 5
            boolean r4 = P0(r8, r0, r4)
            if (r4 == 0) goto L74
            return
        L74:
            r4 = 0
        L75:
            if (r4 >= r1) goto L8c
            r9 = r2[r4]
            if (r9 != 0) goto L7c
            goto L89
        L7c:
            android.content.res.ColorStateList r10 = r9.getTextColors()
            r11 = 2131361799(0x7f0a0007, float:1.834336E38)
            D1(r9, r11)
            r9.setTextColor(r10)
        L89:
            int r4 = r4 + 1
            goto L75
        L8c:
            r4 = 10
            boolean r9 = P0(r8, r0, r4)
            if (r9 == 0) goto L95
            return
        L95:
            java.lang.String[][] r9 = new java.lang.String[r1][]
            r10 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r10 = android.ext.b2.f(r10)
            r11 = 2131296805(0x7f090225, float:1.8211537E38)
            java.lang.String r11 = android.ext.b2.f(r11)
            java.lang.String[] r10 = new java.lang.String[]{r10, r11}
            r9[r5] = r10
            r10 = 2131296917(0x7f090295, float:1.8211764E38)
            java.lang.String r10 = android.ext.b2.f(r10)
            r11 = 2131297115(0x7f09035b, float:1.8212166E38)
            java.lang.String r11 = android.ext.b2.f(r11)
            r12 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r12 = android.ext.b2.f(r12)
            java.lang.String[] r10 = new java.lang.String[]{r10, r11, r12}
            r9[r7] = r10
            r10 = 2131296802(0x7f090222, float:1.821153E38)
            java.lang.String r10 = android.ext.b2.f(r10)
            r11 = 2131296803(0x7f090223, float:1.8211533E38)
            java.lang.String r11 = android.ext.b2.f(r11)
            java.lang.String[] r10 = new java.lang.String[]{r10, r11}
            r9[r6] = r10
            r6 = 0
        Ldb:
            if (r6 >= r1) goto L136
            r10 = r9[r6]
            if (r10 != 0) goto Le2
            goto L131
        Le2:
            r11 = 0
            r12 = 0
        Le4:
            int r13 = r10.length
            if (r11 >= r13) goto Lf9
            r13 = r10[r12]
            int r13 = r13.length()
            r14 = r10[r11]
            int r14 = r14.length()
            if (r13 < r14) goto Lf6
            r12 = r11
        Lf6:
            int r11 = r11 + 1
            goto Le4
        Lf9:
            r11 = 0
            r13 = 0
        Lfb:
            if (r11 >= r1) goto L126
            r14 = r2[r11]
            if (r14 != 0) goto L102
            goto L121
        L102:
            java.lang.CharSequence r15 = r14.getText()
            java.lang.String r15 = r15.toString()
        L10a:
            int r7 = r10.length
            if (r5 >= r7) goto L121
            if (r5 != r12) goto L110
            goto L11e
        L110:
            r7 = r10[r5]
            boolean r7 = r7.equals(r15)
            if (r7 == 0) goto L11e
            r7 = r10[r12]
            r14.setText(r7)
            r13 = 1
        L11e:
            int r5 = r5 + 1
            goto L10a
        L121:
            int r11 = r11 + 1
            r5 = 0
            r7 = 1
            goto Lfb
        L126:
            if (r13 == 0) goto L131
            int r5 = r6 + 20
            boolean r5 = P0(r8, r0, r5)
            if (r5 == 0) goto L131
            return
        L131:
            int r6 = r6 + 1
            r5 = 0
            r7 = 1
            goto Ldb
        L136:
            r5 = 0
            r16 = 0
        L139:
            if (r5 >= r1) goto L164
            r6 = r2[r5]
            if (r6 != 0) goto L140
            goto L161
        L140:
            java.lang.CharSequence r7 = r6.getText()
            java.lang.String r7 = r7.toString()
            r9 = 32
            int r7 = r7.indexOf(r9)
            if (r7 == r3) goto L161
            java.lang.CharSequence r7 = r6.getText()
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r7.replace(r9, r4)
            r6.setText(r7)
            r16 = 1
        L161:
            int r5 = r5 + 1
            goto L139
        L164:
            if (r16 == 0) goto L16f
            r1 = 40
            boolean r1 = P0(r8, r0, r1)
            if (r1 == 0) goto L16f
            return
        L16f:
            boolean r1 = r0 instanceof android.widget.LinearLayout
            if (r1 == 0) goto L189
            r1 = r0
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            int r2 = r1.getOrientation()
            if (r2 != 0) goto L189
            r2 = 1
            r1.setOrientation(r2)
            r1 = 100
            boolean r1 = P0(r8, r0, r1)
            if (r1 == 0) goto L189
            return
        L189:
            P0(r8, r0, r3)
            return
    }

    public static android.content.Intent N0(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            if (r1 != 0) goto L6
            android.content.Context r1 = f0()
        L6:
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.content.Intent r1 = r1.getLaunchIntentForPackage(r2)
            if (r1 != 0) goto L17
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.MAIN"
            r1.<init>(r0)
        L17:
            r1.setPackage(r2)
            if (r3 == 0) goto L1f
            r1.setClassName(r2, r3)
        L1f:
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r2)
            return r1
    }

    public static java.lang.String N1(int r0) {
            java.lang.String r0 = android.ext.b2.f(r0)
            java.lang.String r0 = O1(r0)
            return r0
    }

    public static void O(android.view.View r0) {
            return
    }

    public static android.view.View O0(android.view.View r2) {
            if (r2 == 0) goto L16
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L16
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L16
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch: java.lang.Throwable -> L12
            r0.removeView(r2)     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r0 = move-exception
            android.ext.e1.a(r0)
        L16:
            return r2
    }

    public static java.lang.String O1(java.lang.String r1) {
            java.lang.String r0 = ":"
            java.lang.String r1 = P1(r1, r0)
            return r1
    }

    public static void P(android.widget.TextView r1) {
            android.view.ViewTreeObserver r0 = r1.getViewTreeObserver()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Le
            r0.removeOnPreDrawListener(r1)     // Catch: java.lang.Throwable -> La
            goto Le
        La:
            r1 = move-exception
            android.ext.e1.a(r1)
        Le:
            return
    }

    private static boolean P0(int r3, android.view.ViewGroup r4, int r5) {
            r4.requestLayout()
            r0 = -2
            r4.measure(r0, r0)
            int r4 = r4.getMeasuredWidth()
            if (r4 > r3) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r5 != 0) goto L14
            if (r0 != 0) goto L45
        L14:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "fixDialogButtonsSize: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " <= "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = " = "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = " ["
            r1.append(r3)
            r1.append(r5)
            r3 = 93
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            android.ext.e1.d(r3)
        L45:
            return r0
    }

    private static java.lang.String P1(java.lang.String r4, java.lang.String r5) {
            if (r4 == 0) goto L41
            int r0 = r4.length()
            if (r0 != 0) goto L9
            goto L41
        L9:
            if (r5 != 0) goto L1c
        Lb:
            if (r0 == 0) goto L3c
            int r5 = r0 + (-1)
            char r5 = r4.charAt(r5)
            boolean r5 = java.lang.Character.isWhitespace(r5)
            if (r5 == 0) goto L3c
            int r0 = r0 + (-1)
            goto Lb
        L1c:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L23
            return r4
        L23:
            if (r0 == 0) goto L3c
            int r1 = r0 + (-1)
            char r1 = r4.charAt(r1)
            int r2 = r5.indexOf(r1)
            r3 = -1
            if (r2 != r3) goto L39
            boolean r1 = java.lang.Character.isWhitespace(r1)
            if (r1 != 0) goto L39
            goto L3c
        L39:
            int r0 = r0 + (-1)
            goto L23
        L3c:
            r5 = 0
            java.lang.String r4 = r4.substring(r5, r0)
        L41:
            return r4
    }

    public static android.view.WindowManager.LayoutParams Q(android.view.WindowManager.LayoutParams r3) {
            int r0 = android.ext.Config.B
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto Le
            int r0 = r3.flags
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 | r2
        Lb:
            r3.flags = r0
            goto L15
        Le:
            int r0 = r3.flags
            r2 = -16777217(0xfffffffffeffffff, float:-1.7014117E38)
            r0 = r0 & r2
            goto Lb
        L15:
            boolean r0 = W1()
            boolean r2 = android.ext.m2.f1074a
            if (r2 == 0) goto L24
            if (r0 != 0) goto L24
            java.lang.String r2 = "canDrawOverlays = false; fixed"
            android.ext.e1.d(r2)
        L24:
            if (r0 != 0) goto L4b
            r3.type = r1
            android.ext.r r0 = android.ext.r.n
            android.view.Window r0 = r0.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            android.os.IBinder r0 = r0.token
            if (r0 != 0) goto L48
            android.ext.r r0 = android.ext.r.n
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.View r0 = r0.getRootView()
            android.os.IBinder r0 = r0.getWindowToken()
        L48:
            r3.token = r0
            goto L77
        L4b:
            int r0 = r3.type
            int r1 = android.ext.m2.b()
            if (r0 == r1) goto L5b
            int r0 = r3.type
            int r1 = android.ext.m2.c()
            if (r0 != r1) goto L77
        L5b:
            android.os.IBinder r0 = r3.token
            if (r0 == 0) goto L77
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "token: null "
            r0.append(r1)
            android.os.IBinder r1 = r3.token
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            r0 = 0
            goto L48
        L77:
            boolean r0 = android.ext.Config.vSpaceReal
            if (r0 == 0) goto La3
            boolean r0 = android.ext.Config.D
            if (r0 != 0) goto La3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Use 10 "
            r0.append(r1)
            java.lang.String r1 = android.ext.Config.E
            r0.append(r1)
            java.lang.String r1 = " instead of "
            r0.append(r1)
            java.lang.String r1 = r3.packageName
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            java.lang.String r0 = android.ext.Config.E
            r3.packageName = r0
        La3:
            return r3
    }

    public static boolean Q0(android.view.View r6) {
            r0 = 0
            if (r6 == 0) goto L3b
            int r1 = r6.getVisibility()
            if (r1 == 0) goto La
            goto L3b
        La:
            boolean r1 = r6 instanceof android.view.ViewGroup
            r2 = 1
            if (r1 == 0) goto L36
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r1 = r6.getChildCount()
            r3 = 0
        L16:
            if (r3 >= r1) goto L3b
            android.view.View r4 = r6.getChildAt(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L33
            if (r4 == 0) goto L33
            int r5 = r4.getVisibility()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L33
            if (r5 != 0) goto L33
            boolean r5 = r4 instanceof android.widget.EditText     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L33
            if (r5 != 0) goto L3a
            boolean r5 = r4 instanceof android.view.ViewGroup     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L33
            if (r5 == 0) goto L33
            boolean r4 = Q0(r4)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L33
            if (r4 == 0) goto L33
            goto L3a
        L33:
            int r3 = r3 + 1
            goto L16
        L36:
            boolean r6 = r6 instanceof android.widget.EditText
            if (r6 == 0) goto L3b
        L3a:
            r0 = 1
        L3b:
            return r0
    }

    public static java.lang.String Q1(java.lang.String r4) {
            java.lang.String r4 = r4.trim()
            int r0 = r4.length()
            int r1 = r0 + (-1)
        La:
            if (r1 <= 0) goto L1a
            char r2 = r4.charAt(r1)
            r3 = 47
            if (r2 == r3) goto L15
            goto L1a
        L15:
            int r0 = r0 + (-1)
            int r1 = r1 + (-1)
            goto La
        L1a:
            int r1 = r4.length()
            if (r0 >= r1) goto L25
            r1 = 0
            java.lang.String r4 = r4.substring(r1, r0)
        L25:
            return r4
    }

    public static void R(android.view.Window r1) {
            android.view.WindowManager$LayoutParams r0 = r1.getAttributes()
            android.view.WindowManager$LayoutParams r0 = Q(r0)
            r1.setAttributes(r0)
            return
    }

    public static void R0(android.app.AlertDialog r1) {
            android.ext.Tools$d r0 = new android.ext.Tools$d
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    public static android.graphics.drawable.Drawable R1(android.graphics.drawable.Drawable r1) {
            if (r1 == 0) goto L11
            android.graphics.drawable.Drawable$ConstantState r0 = r1.getConstantState()     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L11
            android.graphics.drawable.Drawable r1 = r0.newDrawable()     // Catch: java.lang.Throwable -> Ld
            goto L11
        Ld:
            r0 = move-exception
            android.ext.e1.a(r0)
        L11:
            return r1
    }

    public static void S(android.view.View r0) {
            android.view.View r0 = I0(r0)
            E1(r0)
            O(r0)
            return
    }

    public static void S0(android.view.View r1) {
            android.ext.Tools$f r0 = new android.ext.Tools$f
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    public static boolean S1(long r6, long r8) {
            r0 = 0
            r1 = 1
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            r3 = 0
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 >= 0) goto L11
            r6 = 1
            goto L12
        L11:
            r6 = 0
        L12:
            r6 = r6 ^ r2
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L18
            r0 = 1
        L18:
            r6 = r6 ^ r0
            return r6
    }

    private static java.lang.String T(long r5, boolean r7) {
            float r5 = (float) r5
            r6 = 1149239296(0x44800000, float:1024.0)
            r0 = 1147207680(0x44610000, float:900.0)
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 <= 0) goto Ld
            float r5 = r5 / r6
            java.lang.String r1 = "KB"
            goto Lf
        Ld:
            java.lang.String r1 = "B"
        Lf:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L16
            float r5 = r5 / r6
            java.lang.String r1 = "MB"
        L16:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1d
            float r5 = r5 / r6
            java.lang.String r1 = "GB"
        L1d:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L24
            float r5 = r5 / r6
            java.lang.String r1 = "TB"
        L24:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2b
            float r5 = r5 / r6
            java.lang.String r1 = "PB"
        L2b:
            r6 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = "%.2f"
            r2 = 0
            r3 = 1
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 >= 0) goto L42
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r6[r2] = r5
            java.lang.String r5 = L1(r0, r6)
            goto L8a
        L42:
            r6 = 1092616192(0x41200000, float:10.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 >= 0) goto L60
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            if (r7 == 0) goto L59
            r6[r2] = r5
            java.lang.String r5 = "%.1f"
            java.lang.String r5 = L1(r5, r6)
            goto L8a
        L59:
            r6[r2] = r5
            java.lang.String r5 = L1(r0, r6)
            goto L8a
        L60:
            r6 = 1120403456(0x42c80000, float:100.0)
            java.lang.String r4 = "%.0f"
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 >= 0) goto L7e
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            if (r7 == 0) goto L77
            r6[r2] = r5
            java.lang.String r5 = L1(r4, r6)
            goto L8a
        L77:
            r6[r2] = r5
            java.lang.String r5 = L1(r0, r6)
            goto L8a
        L7e:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r6[r2] = r5
            java.lang.String r5 = L1(r4, r6)
        L8a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r5 = 32
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = r6.toString()
            return r5
    }

    public static void T0(android.view.Window r1) {
            android.ext.Tools$e r0 = new android.ext.Tools$e
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    public static boolean T1(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto Ld
            boolean r1 = S1(r1, r3)
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            goto Le
        Ld:
            r1 = 1
        Le:
            return r1
    }

    public static java.lang.String U(android.content.Context r0, long r1) {
            java.lang.String r0 = android.text.format.Formatter.formatFileSize(r0, r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            android.ext.e1.a(r0)
            r0 = 0
            java.lang.String r0 = T(r1, r0)     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            r0 = move-exception
            android.ext.e1.a(r0)
            java.lang.String r0 = java.lang.Long.toString(r1)
            return r0
    }

    public static void U0(java.lang.ref.WeakReference r0) {
            if (r0 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r0.get()
            android.app.AlertDialog r0 = (android.app.AlertDialog) r0
            if (r0 != 0) goto Lc
            return
        Lc:
            R0(r0)
            return
    }

    public static void U1(android.content.res.Configuration r2) {
            r0 = 0
            if (r2 != 0) goto L12
            android.content.Context r2 = f0()     // Catch: java.lang.Throwable -> L10
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L10
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r2 = move-exception
            goto L19
        L12:
            int r2 = r2.orientation     // Catch: java.lang.Throwable -> L10
            r1 = 2
            if (r2 != r1) goto L1c
            r0 = 1
            goto L1c
        L19:
            android.ext.e1.a(r2)
        L1c:
            android.ext.Tools.w = r0
            return
    }

    public static int V(int r1, int r2) {
        L0:
            r0 = r2
            r2 = r1
            r1 = r0
            if (r1 == 0) goto L7
            int r2 = r2 % r1
            goto L0
        L7:
            return r2
    }

    public static int V0(byte[] r6, byte[] r7) {
            int r0 = r6.length
            r1 = -1
            if (r0 != 0) goto L5
            return r1
        L5:
            int[] r0 = w(r7)
            r2 = 0
            r3 = 0
        Lb:
            int r4 = r6.length
            if (r2 >= r4) goto L2e
        Le:
            if (r3 <= 0) goto L1b
            r4 = r7[r3]
            r5 = r6[r2]
            if (r4 == r5) goto L1b
            int r3 = r3 + (-1)
            r3 = r0[r3]
            goto Le
        L1b:
            r4 = r7[r3]
            r5 = r6[r2]
            if (r4 != r5) goto L23
            int r3 = r3 + 1
        L23:
            int r4 = r7.length
            if (r3 != r4) goto L2b
            int r6 = r7.length
            int r2 = r2 - r6
            int r2 = r2 + 1
            return r2
        L2b:
            int r2 = r2 + 1
            goto Lb
        L2e:
            return r1
    }

    public static void V1(android.view.View r2, android.view.WindowManager.LayoutParams r3) {
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof android.ext.Tools.ViewWrapper
            if (r1 == 0) goto Lb
            r2 = r0
            android.ext.Tools$ViewWrapper r2 = (android.ext.Tools.ViewWrapper) r2
        Lb:
            r0 = 0
            F1(r2, r3, r0)
            return
    }

    public static java.lang.String W() {
            java.lang.String r0 = ".apk"
            r1 = 0
            android.content.Context r2 = f0()     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L12
            java.lang.String r2 = r2.getPackageCodePath()     // Catch: java.lang.Throwable -> Le
            goto L13
        Le:
            r2 = move-exception
            android.ext.e1.a(r2)
        L12:
            r2 = r1
        L13:
            if (r2 != 0) goto L24
            java.lang.String r3 = android.ext.i.f1002d     // Catch: java.lang.Throwable -> L20
            android.content.pm.ApplicationInfo r3 = Y(r3)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L24
            java.lang.String r2 = r3.sourceDir     // Catch: java.lang.Throwable -> L20
            goto L24
        L20:
            r3 = move-exception
            android.ext.e1.a(r3)
        L24:
            if (r2 != 0) goto Lbf
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L98
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L98
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = "/proc/self/maps"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L98
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L98
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L98
        L37:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L98
            if (r4 == 0) goto Lb3
            java.lang.String r5 = android.ext.i.f1002d     // Catch: java.lang.Throwable -> L98
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Throwable -> L98
            if (r5 != 0) goto L46
            goto L37
        L46:
            boolean r5 = r4.contains(r0)     // Catch: java.lang.Throwable -> L98
            if (r5 != 0) goto L4d
            goto L37
        L4d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r5.<init>()     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = "\\.apk"
            r7 = 2
            java.lang.String[] r4 = r4.split(r6, r7)     // Catch: java.lang.Throwable -> L98
            r6 = 0
            r4 = r4[r6]     // Catch: java.lang.Throwable -> L98
            r5.append(r4)     // Catch: java.lang.Throwable -> L98
            r5.append(r0)     // Catch: java.lang.Throwable -> L98
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L98
            r5 = 64
            int r6 = r4.indexOf(r5)     // Catch: java.lang.Throwable -> L98
            r8 = -1
            r9 = 1
            java.lang.String r10 = "/"
            r11 = 47
            if (r6 == r8) goto L9a
            java.lang.String r1 = r4.trim()     // Catch: java.lang.Throwable -> L98
            java.lang.String[] r1 = r1.split(r10)     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r4.<init>()     // Catch: java.lang.Throwable -> L98
            r4.append(r11)     // Catch: java.lang.Throwable -> L98
            int r6 = r1.length     // Catch: java.lang.Throwable -> L98
            int r6 = r6 - r9
            r1 = r1[r6]     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = r1.replace(r5, r11)     // Catch: java.lang.Throwable -> L98
            r4.append(r1)     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L98
            goto L37
        L98:
            r0 = move-exception
            goto Lbc
        L9a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r0.<init>()     // Catch: java.lang.Throwable -> L98
            r0.append(r11)     // Catch: java.lang.Throwable -> L98
            java.lang.String[] r4 = r4.split(r10, r7)     // Catch: java.lang.Throwable -> L98
            r4 = r4[r9]     // Catch: java.lang.Throwable -> L98
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L98
            r0.append(r4)     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L98
        Lb3:
            r3.close()     // Catch: java.lang.Throwable -> L98
            if (r2 != 0) goto Lbf
            if (r1 == 0) goto Lbf
            r2 = r1
            goto Lbf
        Lbc:
            android.ext.e1.a(r0)
        Lbf:
            return r2
    }

    public static void W0(android.app.Activity r1) {
            a(r1)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
        L8:
            android.app.Application r0 = r1.getApplication()     // Catch: java.lang.Throwable -> L10
            a(r0)     // Catch: java.lang.Throwable -> L10
            goto L14
        L10:
            r0 = move-exception
            android.ext.e1.a(r0)
        L14:
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L1c
            a(r1)     // Catch: java.lang.Throwable -> L1c
            goto L20
        L1c:
            r1 = move-exception
            android.ext.e1.a(r1)
        L20:
            return
    }

    static boolean W1() {
            boolean r0 = android.ext.m2.f1074a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = android.ext.Tools.f490b
            r2 = -1
            if (r0 != r2) goto L15
            android.content.Context r0 = f0()
            boolean r0 = m(r0)
            android.ext.Tools.f490b = r0
        L15:
            int r0 = android.ext.Tools.f490b
            if (r0 == 0) goto L1a
            r1 = 1
        L1a:
            return r1
    }

    public static android.graphics.drawable.Drawable X(android.content.pm.ApplicationInfo r4) {
            android.content.pm.PackageManager r0 = android.ext.Tools.k
            r1 = 0
            if (r4 == 0) goto L4b
            if (r0 != 0) goto L8
            goto L4b
        L8:
            java.lang.String r2 = r4.packageName     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "icon"
            boolean r2 = android.ext.a0.a(r2, r3)     // Catch: java.lang.Throwable -> L29
            android.graphics.drawable.Drawable r1 = r4.loadIcon(r0)     // Catch: java.lang.Throwable -> L30
            android.ext.a0.b(r2)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L4b
            java.lang.String r2 = r4.packageName     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "icon2"
            boolean r2 = android.ext.a0.a(r2, r3)     // Catch: java.lang.Throwable -> L29
            android.graphics.drawable.Drawable r1 = r0.getApplicationIcon(r4)     // Catch: java.lang.Throwable -> L2b
            android.ext.a0.b(r2)     // Catch: java.lang.Throwable -> L29
            goto L4b
        L29:
            r0 = move-exception
            goto L35
        L2b:
            r0 = move-exception
            android.ext.a0.b(r2)     // Catch: java.lang.Throwable -> L29
            throw r0     // Catch: java.lang.Throwable -> L29
        L30:
            r0 = move-exception
            android.ext.a0.b(r2)     // Catch: java.lang.Throwable -> L29
            throw r0     // Catch: java.lang.Throwable -> L29
        L35:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed load icon for: "
            r2.append(r3)
            java.lang.String r4 = r4.packageName
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            android.ext.e1.l(r4, r0)
        L4b:
            return r1
    }

    public static void X0(android.content.Context r0) {
            a(r0)     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r0 = move-exception
            android.ext.e1.a(r0)
        L8:
            return
    }

    public static boolean X1(java.lang.Process r4, int r5) {
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask
            android.ext.Tools$h r1 = new android.ext.Tools$h
            r1.<init>(r4)
            r0.<init>(r1)
            android.ext.n0$i r1 = new android.ext.n0$i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "waitForTimeout: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r0, r2)
            r1.start()
            long r1 = (long) r5
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> L31
            java.lang.Object r5 = r0.get(r1, r5)     // Catch: java.lang.Exception -> L31
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L31
            boolean r4 = r5.booleanValue()     // Catch: java.lang.Exception -> L31
            return r4
        L31:
            boolean r4 = Z0(r4)
            return r4
    }

    public static android.content.pm.ApplicationInfo Y(java.lang.String r1) {
            r0 = 0
            android.content.pm.ApplicationInfo r1 = Z(r1, r0)
            return r1
    }

    public static int[] Y0(java.util.List r4) {
            int r0 = r4.size()
            int[] r0 = new int[r0]
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        Lb:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r4.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r1 + 1
            int r2 = r2.intValue()
            r0[r1] = r2
            r1 = r3
            goto Lb
        L21:
            return r0
    }

    public static android.content.pm.ApplicationInfo Z(java.lang.String r20, int r21) {
            r1 = r20
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r0 = android.ext.a0.i(r20)
            r3 = 0
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed getApplicationInfo, isBuggedPackage: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.ext.e1.i(r0)
            goto Le5
        L21:
            android.content.pm.PackageManager r0 = B0()
            java.lang.String r4 = "Failed getApplicationInfo"
            if (r0 == 0) goto L53
            java.lang.String r5 = "app_info"
            boolean r5 = android.ext.a0.a(r1, r5)     // Catch: java.lang.Throwable -> L44
            r6 = r21
            android.content.pm.ApplicationInfo r7 = r0.getApplicationInfo(r1, r6)     // Catch: java.lang.Throwable -> L3b
            android.ext.a0.b(r5)     // Catch: java.lang.Throwable -> L39
            goto L56
        L39:
            r0 = move-exception
            goto L48
        L3b:
            r0 = move-exception
            r7 = r0
            android.ext.a0.b(r5)     // Catch: java.lang.Throwable -> L41
            throw r7     // Catch: java.lang.Throwable -> L41
        L41:
            r0 = move-exception
        L42:
            r7 = r3
            goto L48
        L44:
            r0 = move-exception
            r6 = r21
            goto L42
        L48:
            boolean r5 = r0 instanceof android.content.pm.PackageManager.NameNotFoundException
            if (r5 != 0) goto L50
            android.ext.e1.l(r4, r0)
            goto L56
        L50:
            android.content.pm.PackageManager$NameNotFoundException r0 = (android.content.pm.PackageManager.NameNotFoundException) r0
            throw r0
        L53:
            r6 = r21
            r7 = r3
        L56:
            if (r7 != 0) goto Le4
            java.lang.Object r0 = u0()
            if (r0 == 0) goto Le4
            java.lang.Class r5 = r0.getClass()     // Catch: java.lang.Throwable -> Lca
            r14 = 2
            android.ext.Tools$y[] r15 = new android.ext.Tools.y[r14]     // Catch: java.lang.Throwable -> Lca
            android.ext.Tools$y r16 = new android.ext.Tools$y     // Catch: java.lang.Throwable -> Lca
            java.lang.String r10 = "getApplicationInfo"
            r8 = 3
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> Lca
            r17 = 0
            r11[r17] = r2     // Catch: java.lang.Throwable -> Lca
            java.lang.Class r18 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lca
            r19 = 1
            r11[r19] = r18     // Catch: java.lang.Throwable -> Lca
            r11[r14] = r18     // Catch: java.lang.Throwable -> Lca
            java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Lca
            r13[r17] = r1     // Catch: java.lang.Throwable -> Lca
            java.lang.Integer r8 = java.lang.Integer.valueOf(r21)     // Catch: java.lang.Throwable -> Lca
            r13[r19] = r8     // Catch: java.lang.Throwable -> Lca
            java.lang.Integer r8 = java.lang.Integer.valueOf(r17)     // Catch: java.lang.Throwable -> Lca
            r13[r14] = r8     // Catch: java.lang.Throwable -> Lca
            r8 = r16
            r9 = r5
            r12 = r0
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lca
            r15[r17] = r16     // Catch: java.lang.Throwable -> Lca
            android.ext.Tools$y r16 = new android.ext.Tools$y     // Catch: java.lang.Throwable -> Lca
            java.lang.String r10 = "getApplicationInfo"
            java.lang.Class[] r11 = new java.lang.Class[r14]     // Catch: java.lang.Throwable -> Lca
            r11[r17] = r2     // Catch: java.lang.Throwable -> Lca
            r11[r19] = r18     // Catch: java.lang.Throwable -> Lca
            java.lang.Object[] r13 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> Lca
            r13[r17] = r1     // Catch: java.lang.Throwable -> Lca
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)     // Catch: java.lang.Throwable -> Lca
            r13[r19] = r2     // Catch: java.lang.Throwable -> Lca
            r8 = r16
            r9 = r5
            r12 = r0
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lca
            r15[r19] = r16     // Catch: java.lang.Throwable -> Lca
            android.ext.Tools$y r0 = x0(r5, r15)     // Catch: java.lang.Throwable -> Lca
            if (r0 == 0) goto Ld2
            java.lang.String r2 = "app_info2"
            boolean r2 = android.ext.a0.a(r1, r2)     // Catch: java.lang.Throwable -> Lca
            java.lang.Object r3 = r0.b()     // Catch: java.lang.Throwable -> Lcc
            android.ext.a0.b(r2)     // Catch: java.lang.Throwable -> Lca
            if (r3 == 0) goto Lc4
            goto Ld2
        Lc4:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException     // Catch: java.lang.Throwable -> Lca
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lca
            throw r0     // Catch: java.lang.Throwable -> Lca
        Lca:
            r0 = move-exception
            goto Ld9
        Lcc:
            r0 = move-exception
            r1 = r0
            android.ext.a0.b(r2)     // Catch: java.lang.Throwable -> Lca
            throw r1     // Catch: java.lang.Throwable -> Lca
        Ld2:
            boolean r0 = r3 instanceof android.content.pm.ApplicationInfo     // Catch: java.lang.Throwable -> Lca
            if (r0 == 0) goto Le4
            android.content.pm.ApplicationInfo r3 = (android.content.pm.ApplicationInfo) r3     // Catch: java.lang.Throwable -> Lca
            goto Le5
        Ld9:
            boolean r1 = r0 instanceof android.content.pm.PackageManager.NameNotFoundException
            if (r1 != 0) goto Le1
            android.ext.e1.l(r4, r0)
            goto Le4
        Le1:
            android.content.pm.PackageManager$NameNotFoundException r0 = (android.content.pm.PackageManager.NameNotFoundException) r0
            throw r0
        Le4:
            r3 = r7
        Le5:
            return r3
    }

    public static boolean Z0(java.lang.Process r0) {
            r0.exitValue()     // Catch: java.lang.IllegalThreadStateException -> L5
            r0 = 1
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }

    private static void a(android.content.Context r1) {
            android.content.pm.PackageManager r0 = android.ext.Tools.k
            if (r0 != 0) goto Lf
            android.content.pm.PackageManager r0 = r1.getPackageManager()     // Catch: java.lang.Throwable -> Lb
            android.ext.Tools.k = r0     // Catch: java.lang.Throwable -> Lb
            goto Lf
        Lb:
            r0 = move-exception
            android.ext.e1.a(r0)
        Lf:
            java.lang.String r0 = android.ext.Tools.h
            if (r0 != 0) goto L1e
            java.lang.String r0 = r1.getPackageName()     // Catch: java.lang.Throwable -> L1a
            android.ext.Tools.h = r0     // Catch: java.lang.Throwable -> L1a
            goto L1e
        L1a:
            r0 = move-exception
            android.ext.e1.a(r0)
        L1e:
            java.lang.String r0 = android.ext.Tools.h
            if (r0 != 0) goto L26
            java.lang.String r0 = android.ext.i.f1002d
            android.ext.Tools.h = r0
        L26:
            java.lang.String r0 = android.ext.Tools.i
            if (r0 != 0) goto L39
            java.io.File r0 = r1.getFilesDir()     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L35
            android.ext.Tools.i = r0     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r0 = move-exception
            android.ext.e1.a(r0)
        L39:
            java.lang.String r0 = android.ext.Tools.j
            if (r0 != 0) goto L4c
            java.io.File r1 = r1.getCacheDir()     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L48
            android.ext.Tools.j = r1     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r1 = move-exception
            android.ext.e1.a(r1)
        L4c:
            java.lang.String r1 = android.ext.Tools.i
            if (r1 != 0) goto L6b
            java.lang.String r1 = android.ext.Tools.h
            if (r1 == 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = n0()
            r1.append(r0)
            java.lang.String r0 = "/files"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.ext.Tools.i = r1
        L6b:
            java.lang.String r1 = android.ext.Tools.j
            if (r1 != 0) goto L8a
            java.lang.String r1 = android.ext.Tools.h
            if (r1 == 0) goto L8a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = n0()
            r1.append(r0)
            java.lang.String r0 = "/cache"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.ext.Tools.j = r1
        L8a:
            java.lang.String r1 = android.ext.Tools.i
            if (r1 == 0) goto La3
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = android.ext.Tools.i     // Catch: java.lang.Throwable -> L9f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto La3
            r1.mkdirs()     // Catch: java.lang.Throwable -> L9f
            goto La3
        L9f:
            r1 = move-exception
            android.ext.e1.a(r1)
        La3:
            java.lang.String r1 = android.ext.Tools.j
            if (r1 == 0) goto Lbc
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = android.ext.Tools.j     // Catch: java.lang.Throwable -> Lb8
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> Lb8
            if (r0 != 0) goto Lbc
            r1.mkdirs()     // Catch: java.lang.Throwable -> Lb8
            goto Lbc
        Lb8:
            r1 = move-exception
            android.ext.e1.a(r1)
        Lbc:
            return
    }

    public static java.lang.String a0(android.content.pm.ApplicationInfo r5) {
            android.content.pm.PackageManager r0 = android.ext.Tools.k
            r1 = 0
            if (r5 == 0) goto L53
            if (r0 != 0) goto L8
            goto L53
        L8:
            java.lang.String r2 = r5.packageName     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "label"
            boolean r2 = android.ext.a0.a(r2, r3)     // Catch: java.lang.Throwable -> L35
            java.lang.CharSequence r3 = r5.loadLabel(r0)     // Catch: java.lang.Throwable -> L30
            android.ext.a0.b(r2)     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto L4d
            java.lang.String r2 = r5.packageName     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = "label2"
            boolean r2 = android.ext.a0.a(r2, r4)     // Catch: java.lang.Throwable -> L29
            java.lang.CharSequence r3 = r0.getApplicationLabel(r5)     // Catch: java.lang.Throwable -> L2b
            android.ext.a0.b(r2)     // Catch: java.lang.Throwable -> L29
            goto L4d
        L29:
            r0 = move-exception
            goto L37
        L2b:
            r0 = move-exception
            android.ext.a0.b(r2)     // Catch: java.lang.Throwable -> L29
            throw r0     // Catch: java.lang.Throwable -> L29
        L30:
            r0 = move-exception
            android.ext.a0.b(r2)     // Catch: java.lang.Throwable -> L35
            throw r0     // Catch: java.lang.Throwable -> L35
        L35:
            r0 = move-exception
            r3 = r1
        L37:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Failed load label for: "
            r2.append(r4)
            java.lang.String r5 = r5.packageName
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            android.ext.e1.l(r5, r0)
        L4d:
            if (r3 == 0) goto L53
            java.lang.String r1 = r3.toString()
        L53:
            return r1
    }

    public static boolean a1(java.lang.Object r5) {
            boolean r0 = r5 instanceof java.io.File
            if (r0 == 0) goto L8
            r0 = r5
            java.io.File r0 = (java.io.File) r0
            goto L11
        L8:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
        L11:
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 != 0) goto L1c
            r1 = 2131296450(0x7f0900c2, float:1.8210817E38)
            goto L27
        L1c:
            boolean r1 = r0.isFile()
            if (r1 != 0) goto L26
            r1 = 2131296818(0x7f090232, float:1.8211563E38)
            goto L27
        L26:
            r1 = 0
        L27:
            r3 = 0
            if (r1 == 0) goto L43
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = N1(r1)
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            goto L76
        L43:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r1.read()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            r1.close()     // Catch: java.io.IOException -> L4e
        L4e:
            r5 = 1
            return r5
        L50:
            r5 = move-exception
            r3 = r1
            goto L98
        L53:
            r0 = move-exception
            goto L59
        L55:
            r5 = move-exception
            goto L98
        L57:
            r0 = move-exception
            r1 = r3
        L59:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r4.<init>()     // Catch: java.lang.Throwable -> L50
            r4.append(r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = "\n\n"
            r4.append(r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = r0.getMessage()     // Catch: java.lang.Throwable -> L50
            r4.append(r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L76
            r1.close()     // Catch: java.io.IOException -> L76
        L76:
            android.app.AlertDialog$Builder r0 = android.ext.f.b()
            r1 = 2131296417(0x7f0900a1, float:1.821075E38)
            android.view.View r1 = g0(r1)
            android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r1)
            android.app.AlertDialog$Builder r5 = r0.setMessage(r5)
            r0 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            android.app.AlertDialog$Builder r5 = r5.setPositiveButton(r0, r3)
            android.ext.f.o(r5)
            return r2
        L98:
            if (r3 == 0) goto L9d
            r3.close()     // Catch: java.io.IOException -> L9d
        L9d:
            throw r5
    }

    static /* synthetic */ void b(android.widget.TextView r0, android.graphics.drawable.Drawable r1, int r2) {
            d(r0, r1, r2)
            return
    }

    public static java.io.File b0() {
            java.lang.String r0 = android.ext.Tools.j
            if (r0 != 0) goto La
            java.lang.String r0 = "/cache"
            java.lang.String r0 = m0(r0)
        La:
            if (r0 == 0) goto L12
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    public static java.lang.Throwable b1(android.content.Context r1) {
            r1.getPackageName()     // Catch: java.lang.Throwable -> L14
            r1.getPackageManager()     // Catch: java.lang.Throwable -> L14
            r1.getCacheDir()     // Catch: java.lang.Throwable -> L14
            r1.getFilesDir()     // Catch: java.lang.Throwable -> L14
            r1.getExternalCacheDir()     // Catch: java.lang.Throwable -> L14
            r0 = 0
            r1.getExternalFilesDir(r0)     // Catch: java.lang.Throwable -> L14
            return r0
        L14:
            r1 = move-exception
            return r1
    }

    public static void c(android.widget.TextView r1, android.graphics.drawable.Drawable r2, int r3) {
            if (r1 != 0) goto L3
            return
        L3:
            android.ext.Tools$s r0 = new android.ext.Tools$s
            r0.<init>(r1, r2, r3)
            android.ext.n2.i(r0)
            return
    }

    public static java.io.File c0() {
            java.io.File r0 = b0()
            if (r0 == 0) goto L13
            java.io.File r1 = new java.io.File
            java.lang.String r2 = s0()
            r1.<init>(r0, r2)
            r1.mkdirs()
            r0 = r1
        L13:
            return r0
    }

    private static boolean c1(java.lang.String r4) {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L33
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.String[] r1 = r0.list()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L53
            int r2 = r1.length     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L35
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = ".gg."
            r1.append(r2)     // Catch: java.lang.Throwable -> L33
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L33
            r1.append(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L33
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L33
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L33
            r2.createNewFile()     // Catch: java.lang.Throwable -> L33
            java.lang.String[] r1 = r0.list()     // Catch: java.lang.Throwable -> L33
            r2.delete()     // Catch: java.lang.Throwable -> L33
            goto L35
        L33:
            r0 = move-exception
            goto L3a
        L35:
            int r4 = r1.length     // Catch: java.lang.Throwable -> L33
            if (r4 <= 0) goto L53
            r4 = 1
            return r4
        L3a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isGoodDir: '"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "'"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.ext.e1.s(r4, r0)
        L53:
            r4 = 0
            return r4
    }

    private static void d(android.widget.TextView r7, android.graphics.drawable.Drawable r8, int r9) {
            int r0 = android.ext.Tools.f493e
            r1 = -1
            if (r0 != r1) goto L11
            r0 = 1094713344(0x41400000, float:12.0)
            float r0 = G(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            android.ext.Tools.f493e = r0
        L11:
            r0 = 0
            if (r8 == 0) goto L22
            float r9 = (float) r9
            float r9 = G(r9)
            int r9 = (int) r9
            r8.setBounds(r0, r0, r9, r9)     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r9 = move-exception
            android.ext.e1.a(r9)
        L22:
            r9 = 2131034289(0x7f0500b1, float:1.7679091E38)
            java.lang.Object r1 = r7.getTag(r9)     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            if (r2 == 0) goto L37
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            int r1 = r1.intValue()     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            goto L38
        L34:
            r8 = move-exception
            goto L99
        L37:
            r1 = 0
        L38:
            r2 = 3
            r3 = 2
            if (r1 != 0) goto L5a
            android.graphics.drawable.Drawable[] r1 = r7.getCompoundDrawables()     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            android.graphics.drawable.Drawable[] r4 = r7.getCompoundDrawablesRelative()     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            r5 = r4[r0]     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            if (r5 == 0) goto L4a
            r1 = 4
            goto L52
        L4a:
            r5 = r1[r0]     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            if (r5 == 0) goto L51
            r4 = r1
            r1 = 2
            goto L52
        L51:
            r1 = 3
        L52:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            r7.setTag(r9, r5)     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            goto L5b
        L5a:
            r4 = 0
        L5b:
            r9 = 1
            if (r1 == r9) goto L63
            if (r1 != r3) goto L61
            goto L63
        L61:
            r5 = 0
            goto L64
        L63:
            r5 = 1
        L64:
            if (r4 != 0) goto L71
            if (r5 == 0) goto L6d
            android.graphics.drawable.Drawable[] r4 = r7.getCompoundDrawables()     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            goto L71
        L6d:
            android.graphics.drawable.Drawable[] r4 = r7.getCompoundDrawablesRelative()     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
        L71:
            if (r1 == r9) goto L78
            if (r1 != r2) goto L76
            goto L78
        L76:
            r1 = 2
            goto L79
        L78:
            r1 = 0
        L79:
            r6 = r4[r1]     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            if (r6 == r8) goto L9c
            r4[r1] = r8     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            if (r5 == 0) goto L8d
            r8 = r4[r0]     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            r9 = r4[r9]     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            r0 = r4[r3]     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            r1 = r4[r2]     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            r7.setCompoundDrawables(r8, r9, r0, r1)     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            goto L9c
        L8d:
            r8 = r4[r0]     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            r9 = r4[r9]     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            r0 = r4[r3]     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            r1 = r4[r2]     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            r7.setCompoundDrawablesRelative(r8, r9, r0, r1)     // Catch: java.lang.StringIndexOutOfBoundsException -> L34
            goto L9c
        L99:
            android.ext.e1.a(r8)
        L9c:
            int r8 = android.ext.Tools.f493e
            r7.setCompoundDrawablePadding(r8)
            return
    }

    public static int d0(int r1) {
            r0 = -1
            int r1 = e0(r1, r0)
            return r1
    }

    public static int d1() {
            int r0 = android.ext.Tools.w
            r1 = -1
            if (r0 != r1) goto Lb
            r0 = 0
            U1(r0)
            int r0 = android.ext.Tools.w
        Lb:
            return r0
    }

    public static void e(android.widget.ListView r1, java.lang.CharSequence[] r2, android.graphics.drawable.Drawable[] r3, int r4, int r5) {
            android.ext.Tools$u r0 = new android.ext.Tools$u     // Catch: java.lang.Throwable -> L9
            r0.<init>(r5, r2, r3, r4)     // Catch: java.lang.Throwable -> L9
            r1.setOnHierarchyChangeListener(r0)     // Catch: java.lang.Throwable -> L9
            goto Ld
        L9:
            r1 = move-exception
            android.ext.e1.a(r1)
        Ld:
            return
    }

    public static int e0(int r3, int r4) {
            android.content.Context r0 = f0()     // Catch: java.lang.Throwable -> L14
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L14
            r2 = 23
            if (r1 < r2) goto L16
            int r3 = android.ext.q2.a(r0, r3)     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            r1 = move-exception
            android.ext.e1.a(r1)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r3 = move-exception
            goto L1f
        L16:
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L14
            int r3 = r0.getColor(r3)     // Catch: java.lang.Throwable -> L14
            return r3
        L1f:
            android.ext.e1.a(r3)
            return r4
    }

    public static boolean e1(java.lang.String r1) {
            r0 = 0
            Z(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6
            r1 = 1
            return r1
        L6:
            return r0
    }

    public static void f(android.view.View r2, android.view.WindowManager.LayoutParams r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "dbg2: "
            r0.append(r1)
            r0.append(r2)
            r1 = 32
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            r0 = 1
            F1(r2, r3, r0)
            return
    }

    public static android.content.Context f0() {
            android.content.Context r0 = android.ext.MainService.context
            if (r0 != 0) goto L15
            android.content.Context r1 = android.ext.r.p
            if (r1 == 0) goto L15
            android.content.Context r0 = android.ext.r.p
            android.content.Context r0 = l1(r0)
            if (r0 != 0) goto L13
            android.content.Context r0 = android.ext.r.o
            goto L15
        L13:
            android.content.Context r0 = android.ext.r.p
        L15:
            return r0
    }

    public static boolean f1(java.lang.String r3) {
            int r0 = r3.length()
            r1 = 2
            r2 = 0
            if (r0 < r1) goto L13
            char r0 = r3.charAt(r2)
            r1 = 47
            if (r0 == r1) goto L11
            goto L13
        L11:
            r3 = 1
            return r3
        L13:
            android.app.AlertDialog$Builder r0 = android.ext.f.b()
            r1 = 2131296417(0x7f0900a1, float:1.821075E38)
            android.view.View r1 = g0(r1)
            android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "\n\n"
            r1.append(r3)
            r3 = 2131296853(0x7f090255, float:1.8211634E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            android.app.AlertDialog$Builder r3 = r0.setMessage(r3)
            r0 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            r1 = 0
            android.app.AlertDialog$Builder r3 = r3.setPositiveButton(r0, r1)
            android.ext.f.o(r3)
            return r2
    }

    public static void g(android.view.View r1, android.view.WindowManager.LayoutParams r2) {
            android.ext.Tools$j r0 = new android.ext.Tools$j
            r0.<init>(r2, r1)
            android.ext.n2.i(r0)
            return
    }

    public static android.view.View g0(int r0) {
            java.lang.String r0 = android.ext.b2.f(r0)
            android.view.View r0 = h0(r0)
            return r0
    }

    public static java.lang.String g1(long r11) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = java.lang.Math.abs(r11)
            r3 = 0
            r4 = 0
        Lb:
            int[] r5 = android.ext.Tools.o
            int r6 = r5.length
            r7 = 0
            if (r4 >= r6) goto L49
            int r6 = r4 + 1
            r5 = r5[r6]
            if (r5 > 0) goto L1a
            r5 = r7
            goto L20
        L1a:
            long r5 = (long) r5
            long r9 = r1 % r5
            long r1 = r1 / r5
            r5 = r1
            r1 = r9
        L20:
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 <= 0) goto L40
            int r9 = r0.length()
            java.lang.String r10 = " "
            if (r9 <= 0) goto L2f
            r0.insert(r3, r10)
        L2f:
            int[] r9 = android.ext.Tools.o
            r9 = r9[r4]
            java.lang.String r9 = android.ext.b2.f(r9)
            r0.insert(r3, r9)
            r0.insert(r3, r10)
            r0.insert(r3, r1)
        L40:
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L45
            goto L49
        L45:
            int r4 = r4 + 2
            r1 = r5
            goto Lb
        L49:
            int r1 = r0.length()
            if (r1 != 0) goto L5f
            int[] r1 = android.ext.Tools.o
            r1 = r1[r3]
            java.lang.String r1 = android.ext.b2.f(r1)
            r0.insert(r3, r1)
            java.lang.String r1 = "0 "
            r0.insert(r3, r1)
        L5f:
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 >= 0) goto L68
            java.lang.String r11 = "-"
            r0.insert(r3, r11)
        L68:
            java.lang.String r11 = r0.toString()
            return r11
    }

    public static void h(java.lang.String r1, int r2) {
            r0 = 0
            i(r1, r2, r0, r0)
            return
    }

    public static android.view.View h0(java.lang.String r1) {
            r0 = 0
            android.view.View r1 = i0(r1, r0)
            return r1
    }

    static void h1() {
            r0 = 1
            android.ext.Tools.f490b = r0
            return
    }

    public static void i(java.lang.String r1, int r2, java.lang.String r3, android.content.DialogInterface.OnClickListener r4) {
            android.ext.Tools$m r0 = new android.ext.Tools$m
            r0.<init>(r1, r2, r3, r4)
            android.ext.n2.i(r0)
            return
    }

    public static android.view.View i0(java.lang.String r1, java.lang.String r2) {
            r0 = -1
            android.view.View r1 = j0(r1, r2, r0)
            return r1
    }

    public static boolean i1(java.lang.String r6) {
            java.lang.String r0 = "Failed open app info for: "
            android.content.Context r1 = f0()     // Catch: java.lang.Throwable -> L15
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L15 android.content.ActivityNotFoundException -> L17
            java.lang.String r3 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            java.lang.String r4 = "package"
            r5 = 0
            android.net.Uri r4 = android.net.Uri.fromParts(r4, r6, r5)     // Catch: java.lang.Throwable -> L15 android.content.ActivityNotFoundException -> L17
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L15 android.content.ActivityNotFoundException -> L17
            goto L31
        L15:
            r1 = move-exception
            goto L3b
        L17:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r3.<init>()     // Catch: java.lang.Throwable -> L15
            r3.append(r0)     // Catch: java.lang.Throwable -> L15
            r3.append(r6)     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L15
            android.ext.e1.s(r3, r2)     // Catch: java.lang.Throwable -> L15
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = "android.settings.MANAGE_APPLICATIONS_SETTINGS"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L15
        L31:
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.setFlags(r3)     // Catch: java.lang.Throwable -> L15
            r1.startActivity(r2)     // Catch: java.lang.Throwable -> L15
            r6 = 1
            return r6
        L3b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            android.ext.e1.s(r6, r1)
            r6 = 0
            return r6
    }

    public static boolean j(java.lang.String r5) {
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r1 = r0.canExecute()
            r2 = 1
            if (r1 == 0) goto Ld
            return r2
        Ld:
            java.lang.String r1 = "0755"
            java.lang.String r5 = F0(r5)
            java.lang.String r3 = "chmod"
            java.lang.String[] r5 = new java.lang.String[]{r3, r1, r5}
            r1 = 15
            java.lang.Process r3 = I(r5)     // Catch: java.lang.Exception -> L43
            boolean r3 = X1(r3, r1)     // Catch: java.lang.Exception -> L43
            if (r3 != 0) goto L49
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L43
            r3.<init>()     // Catch: java.lang.Exception -> L43
            java.lang.String r4 = "timeout fail 1: "
            r3.append(r4)     // Catch: java.lang.Exception -> L43
            java.lang.String r4 = java.util.Arrays.toString(r5)     // Catch: java.lang.Exception -> L43
            r3.append(r4)     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L43
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> L43
            r4.<init>()     // Catch: java.lang.Exception -> L43
            android.ext.e1.s(r3, r4)     // Catch: java.lang.Exception -> L43
            goto L49
        L43:
            r3 = move-exception
            java.lang.String r4 = "exec"
            android.ext.e1.s(r4, r3)
        L49:
            boolean r3 = android.ext.Config.C
            if (r3 != 0) goto L99
            boolean r3 = r0.canExecute()
            if (r3 == 0) goto L54
            return r2
        L54:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L93
            r3.<init>()     // Catch: java.lang.Exception -> L93
            java.lang.String r4 = "exec "
            r3.append(r4)     // Catch: java.lang.Exception -> L93
            java.lang.String r4 = " "
            java.lang.String r4 = y(r5, r4)     // Catch: java.lang.Exception -> L93
            r3.append(r4)     // Catch: java.lang.Exception -> L93
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L93
            java.lang.Process r3 = android.ext.e2.q(r3)     // Catch: java.lang.Exception -> L93
            boolean r1 = X1(r3, r1)     // Catch: java.lang.Exception -> L93
            if (r1 != 0) goto L99
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L93
            r1.<init>()     // Catch: java.lang.Exception -> L93
            java.lang.String r3 = "timeout fail 2: "
            r1.append(r3)     // Catch: java.lang.Exception -> L93
            java.lang.String r5 = java.util.Arrays.toString(r5)     // Catch: java.lang.Exception -> L93
            r1.append(r5)     // Catch: java.lang.Exception -> L93
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Exception -> L93
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> L93
            r1.<init>()     // Catch: java.lang.Exception -> L93
            android.ext.e1.s(r5, r1)     // Catch: java.lang.Exception -> L93
            goto L99
        L93:
            r5 = move-exception
            java.lang.String r1 = "root"
            android.ext.e1.s(r1, r5)
        L99:
            boolean r5 = r0.canExecute()
            if (r5 == 0) goto La0
            return r2
        La0:
            r5 = 0
            return r5
    }

    public static android.view.View j0(java.lang.String r3, java.lang.String r4, int r5) {
            r0 = 2131099649(0x7f060001, float:1.7811657E38)
            r1 = 0
            android.view.View r0 = a.d.f(r0, r1)
            r1 = 2131034125(0x7f05000d, float:1.7678759E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r3)
            r2 = -1
            if (r5 == r2) goto L24
            if (r5 == 0) goto L24
            r1(r1)
            android.ext.Tools$l r2 = new android.ext.Tools$l
            r2.<init>(r3, r5)
            r1.setOnClickListener(r2)
        L24:
            if (r4 == 0) goto L36
            r3 = 2131034419(0x7f050133, float:1.7679355E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setText(r4)
            r4 = 0
            r3.setVisibility(r4)
        L36:
            return r0
    }

    public static double j1(java.lang.String r13) {
            java.lang.String r13 = r13.trim()
            java.lang.String r0 = "-"
            boolean r0 = r13.startsWith(r0)
            r1 = 1
            if (r0 == 0) goto L14
            java.lang.String r13 = r13.substring(r1)
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L16
        L14:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L16:
            int[] r0 = android.ext.Tools.o
            int r0 = r0.length
            int r0 = r0 / 2
            java.lang.String r4 = ":"
            java.lang.String[] r0 = r13.split(r4, r0)
            android.ext.t1$b r4 = new android.ext.t1$b
            r4.<init>()
            r5 = 0
            r7 = 0
        L29:
            int r8 = r0.length
            if (r7 >= r8) goto L4f
            int r8 = r0.length
            int r8 = r8 - r1
            int r8 = r8 - r7
            int r8 = r8 * 2
            int r8 = r8 + r1
            int[] r9 = android.ext.Tools.o
            int r9 = r9.length
            if (r8 < r9) goto L38
            goto L4c
        L38:
            r9 = r0[r7]
            android.ext.t1$b r9 = android.ext.t1.t(r4, r9, r13)
            long r9 = r9.f1261a
            double r9 = java.lang.Double.longBitsToDouble(r9)
            int[] r11 = android.ext.Tools.o
            r8 = r11[r8]
            double r11 = (double) r8
            double r5 = r5 * r11
            double r5 = r5 + r9
        L4c:
            int r7 = r7 + 1
            goto L29
        L4f:
            double r5 = r5 * r2
            return r5
    }

    public static boolean[] k(java.util.List r4) {
            int r0 = r4.size()
            boolean[] r0 = new boolean[r0]
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        Lb:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r4.next()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            int r3 = r1 + 1
            boolean r2 = r2.booleanValue()
            r0[r1] = r2
            r1 = r3
            goto Lb
        L21:
            return r0
    }

    public static android.content.Context k0() {
            android.content.Context r0 = f0()
            android.content.Context r0 = l0(r0)
            return r0
    }

    public static java.lang.String k1(java.lang.String r2) {
            java.lang.String r2 = java.util.regex.Pattern.quote(r2)
            java.lang.String r0 = "^"
            java.lang.String r1 = "\\E^\\Q"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "$"
            java.lang.String r1 = "\\E$\\Q"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "?"
            java.lang.String r1 = "\\E.\\Q"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "*"
            java.lang.String r1 = "\\E.*\\Q"
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "\\Q\\E"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    public static final java.lang.String l(byte[] r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L36
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r3 = r3.toUpperCase(r4)
        L17:
            int r4 = r3.length()
            r5 = 2
            if (r4 >= r5) goto L30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 48
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L17
        L30:
            r0.append(r3)
            int r2 = r2 + 1
            goto L7
        L36:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static android.content.Context l0(android.content.Context r0) {
            return r0
    }

    public static android.content.Context l1(android.content.Context r1) {
        L0:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto Lb
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L0
        Lb:
            return r1
    }

    public static boolean m(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lf
            boolean r2 = android.ext.s2.a(r2)     // Catch: java.lang.Throwable -> Lb
            return r2
        Lb:
            r2 = move-exception
            android.ext.e1.a(r2)
        Lf:
            r2 = 1
            return r2
    }

    private static java.lang.String m0(java.lang.String r2) {
            java.lang.String r0 = android.ext.Tools.l
            if (r0 != 0) goto L15
            java.lang.String r0 = android.ext.i.f1002d     // Catch: java.lang.Throwable -> L11
            android.content.pm.ApplicationInfo r0 = Y(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.dataDir     // Catch: java.lang.Throwable -> L11
            android.ext.Tools.l = r0     // Catch: java.lang.Throwable -> L11
            goto L15
        L11:
            r0 = move-exception
            android.ext.e1.a(r0)
        L15:
            java.lang.String r0 = android.ext.Tools.l
            if (r0 == 0) goto L2e
            if (r2 != 0) goto L1c
            goto L2e
        L1c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = android.ext.Tools.l
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            goto L30
        L2e:
            java.lang.String r2 = android.ext.Tools.l
        L30:
            return r2
    }

    public static void m1(android.view.View r1) {
            android.ext.Tools$q r0 = new android.ext.Tools$q
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    public static void n(java.lang.Object r7, int r8) {
            if (r7 != 0) goto L3
            return
        L3:
            r0 = 0
            r1 = 1
            if (r8 != r1) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            boolean r3 = r7 instanceof d.a
            r4 = 2
            if (r3 == 0) goto L2b
            d.a r7 = (d.a) r7
            int r3 = r7.i()
            r5 = 0
        L16:
            if (r5 >= r3) goto L66
            if (r8 != r4) goto L24
            boolean r6 = r7.c(r5)
            if (r6 != 0) goto L22
            r6 = 1
            goto L25
        L22:
            r6 = 0
            goto L25
        L24:
            r6 = r2
        L25:
            r7.b(r5, r6)
            int r5 = r5 + 1
            goto L16
        L2b:
            boolean r3 = r7 instanceof d.e
            if (r3 == 0) goto L4b
            d.e r7 = (d.e) r7
            int r3 = r7.l()
            r5 = 0
        L36:
            if (r5 >= r3) goto L66
            if (r8 != r4) goto L44
            boolean r6 = r7.a(r5)
            if (r6 != 0) goto L42
            r6 = 1
            goto L45
        L42:
            r6 = 0
            goto L45
        L44:
            r6 = r2
        L45:
            r7.k(r5, r6)
            int r5 = r5 + 1
            goto L36
        L4b:
            boolean r3 = r7 instanceof boolean[]
            if (r3 == 0) goto L67
            boolean[] r7 = (boolean[]) r7
            int r3 = r7.length
            int r3 = r3 - r1
            r5 = 1
        L54:
            if (r5 >= r3) goto L66
            if (r8 != r4) goto L60
            boolean r6 = r7[r5]
            if (r6 != 0) goto L5e
            r6 = 1
            goto L61
        L5e:
            r6 = 0
            goto L61
        L60:
            r6 = r2
        L61:
            r7[r5] = r6
            int r5 = r5 + 1
            goto L54
        L66:
            return
        L67:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
    }

    public static java.lang.String n0() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "/data/"
            r0.append(r1)
            int r1 = android.os.Process.myUid()
            r2 = 100000(0x186a0, float:1.4013E-40)
            int r1 = r1 / r2
            if (r1 != 0) goto L1a
            java.lang.String r1 = "data"
            r0.append(r1)
            goto L22
        L1a:
            java.lang.String r2 = "user/"
            r0.append(r2)
            r0.append(r1)
        L22:
            r1 = 47
            r0.append(r1)
            java.lang.String r1 = android.ext.Tools.h
            if (r1 != 0) goto L2d
            java.lang.String r1 = android.ext.i.f1002d
        L2d:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static void n1(android.view.View r1) {
            android.ext.Tools$o r0 = new android.ext.Tools$o
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    public static void o() {
            android.ext.g0 r0 = new android.ext.g0
            android.ext.Tools$i r1 = new android.ext.Tools$i
            r1.<init>()
            java.lang.String r2 = "checkForBadContext"
            r0.<init>(r1, r2)
            r0.start()
            return
    }

    public static android.graphics.drawable.Drawable o0(int r1) {
            android.content.Context r0 = f0()     // Catch: java.lang.NoSuchMethodError -> L9
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)     // Catch: java.lang.NoSuchMethodError -> L9
            goto L15
        L9:
            android.content.Context r0 = f0()
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
        L15:
            return r1
    }

    public static void o1(android.widget.EditText r1) {
            if (r1 != 0) goto L3
            return
        L3:
            android.ext.Tools$g r0 = new android.ext.Tools$g
            r0.<init>(r1)
            android.ext.n2.i(r0)
            return
    }

    static void p() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L1a
            android.content.Context r0 = f0()     // Catch: java.lang.Throwable -> L16
            boolean r0 = m(r0)     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L1a
            java.lang.String r0 = "canDrawOverlays = false"
            android.ext.e1.p(r0)     // Catch: java.lang.Throwable -> L16
            goto L1a
        L16:
            r0 = move-exception
            android.ext.e1.a(r0)
        L1a:
            return
    }

    public static java.io.File p0() {
            java.lang.String r0 = android.ext.Tools.i
            if (r0 != 0) goto La
            java.lang.String r0 = "/files"
            java.lang.String r0 = m0(r0)
        La:
            if (r0 == 0) goto L12
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    public static void p1(android.view.View r1) {
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            q1(r1, r0)
            return
    }

    public static void q(java.io.File r4, int r5) {
            r0 = r5 & 64
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            r3 = r5 & 9
            if (r3 != 0) goto Lf
            r3 = 1
            goto L10
        Lf:
            r3 = 0
        L10:
            r4.setExecutable(r0, r3)
            r0 = r5 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            r3 = r5 & 18
            if (r3 != 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            r4.setWritable(r0, r3)
            r0 = r5 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L2a
            r0 = 1
            goto L2b
        L2a:
            r0 = 0
        L2b:
            r3 = r5 & 36
            if (r3 != 0) goto L30
            r1 = 1
        L30:
            r4.setReadable(r0, r1)
            java.lang.String r0 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L3b
            android.system.Os.chmod(r0, r5)     // Catch: java.lang.Throwable -> L3b
            goto L61
        L3b:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed chmod "
            r1.append(r2)
            java.lang.String r5 = java.lang.Integer.toOctalString(r5)
            r1.append(r5)
            java.lang.String r5 = " '"
            r1.append(r5)
            r1.append(r4)
            java.lang.String r4 = "'"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.ext.e1.s(r4, r0)
        L61:
            return
    }

    public static java.io.File q0() {
            java.io.File r0 = p0()
            if (r0 == 0) goto L13
            java.io.File r1 = new java.io.File
            java.lang.String r2 = s0()
            r1.<init>(r0, r2)
            r1.mkdirs()
            r0 = r1
        L13:
            return r0
    }

    public static void q1(android.view.View r4, android.graphics.drawable.Drawable r5) {
            if (r5 != 0) goto Lb
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.Throwable -> L9
            r0 = 0
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r4 = move-exception
            goto L4f
        Lb:
            r0 = 1
            r4.setFocusable(r0)     // Catch: java.lang.Throwable -> L9
            android.graphics.drawable.StateListDrawable r0 = new android.graphics.drawable.StateListDrawable     // Catch: java.lang.Throwable -> L9
            r0.<init>()     // Catch: java.lang.Throwable -> L9
            android.widget.ImageButton r1 = new android.widget.ImageButton     // Catch: java.lang.Throwable -> L9
            android.content.Context r2 = r4.getContext()     // Catch: java.lang.Throwable -> L9
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L9
            android.graphics.drawable.Drawable r1 = r1.getBackground()     // Catch: java.lang.Throwable -> L9
            int[] r2 = a.g.f19a     // Catch: java.lang.Throwable -> L9
            r0.addState(r2, r1)     // Catch: java.lang.Throwable -> L9
            int[] r2 = a.g.f20b     // Catch: java.lang.Throwable -> L9
            r0.addState(r2, r1)     // Catch: java.lang.Throwable -> L9
            int[] r2 = a.g.f21c     // Catch: java.lang.Throwable -> L9
            r0.addState(r2, r1)     // Catch: java.lang.Throwable -> L9
            int[] r1 = android.util.StateSet.WILD_CARD     // Catch: java.lang.Throwable -> L9
            r0.addState(r1, r5)     // Catch: java.lang.Throwable -> L9
            r4.setBackground(r5)     // Catch: java.lang.Throwable -> L9
            int r5 = r4.getPaddingLeft()     // Catch: java.lang.Throwable -> L9
            int r1 = r4.getPaddingRight()     // Catch: java.lang.Throwable -> L9
            int r2 = r4.getPaddingTop()     // Catch: java.lang.Throwable -> L9
            int r3 = r4.getPaddingBottom()     // Catch: java.lang.Throwable -> L9
            r4.setBackground(r0)     // Catch: java.lang.Throwable -> L9
            r4.setPadding(r5, r2, r1, r3)     // Catch: java.lang.Throwable -> L9
            goto L52
        L4f:
            android.ext.e1.a(r4)
        L52:
            return
    }

    public static void r(java.lang.String r3, java.lang.String r4) {
            r0 = 8
            int r0 = java.lang.Integer.parseInt(r4, r0)     // Catch: java.lang.Throwable -> La
            android.system.Os.chmod(r3, r0)     // Catch: java.lang.Throwable -> La
            goto L2c
        La:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed chmod "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " '"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.ext.e1.s(r1, r0)
        L2c:
            java.lang.String r0 = "chmod"
            java.lang.String r3 = F0(r3)
            java.lang.String[] r3 = new java.lang.String[]{r0, r4, r3}
            r4 = 15
            java.lang.Process r0 = I(r3)     // Catch: java.lang.Exception -> L60
            boolean r0 = X1(r0, r4)     // Catch: java.lang.Exception -> L60
            if (r0 != 0) goto L66
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L60
            r0.<init>()     // Catch: java.lang.Exception -> L60
            java.lang.String r1 = "timeout fail 1: "
            r0.append(r1)     // Catch: java.lang.Exception -> L60
            java.lang.String r1 = java.util.Arrays.toString(r3)     // Catch: java.lang.Exception -> L60
            r0.append(r1)     // Catch: java.lang.Exception -> L60
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L60
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> L60
            r1.<init>()     // Catch: java.lang.Exception -> L60
            android.ext.e1.s(r0, r1)     // Catch: java.lang.Exception -> L60
            goto L66
        L60:
            r0 = move-exception
            java.lang.String r1 = "exec"
            android.ext.e1.s(r1, r0)
        L66:
            boolean r0 = android.ext.Config.C     // Catch: java.lang.Exception -> La9
            if (r0 != 0) goto Laf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La9
            r0.<init>()     // Catch: java.lang.Exception -> La9
            java.lang.String r1 = "exec "
            r0.append(r1)     // Catch: java.lang.Exception -> La9
            java.lang.String r1 = " "
            java.lang.String r1 = y(r3, r1)     // Catch: java.lang.Exception -> La9
            r0.append(r1)     // Catch: java.lang.Exception -> La9
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> La9
            java.lang.Process r0 = android.ext.e2.q(r0)     // Catch: java.lang.Exception -> La9
            boolean r4 = X1(r0, r4)     // Catch: java.lang.Exception -> La9
            if (r4 != 0) goto Laf
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La9
            r4.<init>()     // Catch: java.lang.Exception -> La9
            java.lang.String r0 = "timeout fail 2: "
            r4.append(r0)     // Catch: java.lang.Exception -> La9
            java.lang.String r3 = java.util.Arrays.toString(r3)     // Catch: java.lang.Exception -> La9
            r4.append(r3)     // Catch: java.lang.Exception -> La9
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Exception -> La9
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> La9
            r4.<init>()     // Catch: java.lang.Exception -> La9
            android.ext.e1.s(r3, r4)     // Catch: java.lang.Exception -> La9
            goto Laf
        La9:
            r3 = move-exception
            java.lang.String r4 = "root"
            android.ext.e1.s(r4, r3)
        Laf:
            return
    }

    public static long r0() {
            r0 = -1
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo     // Catch: java.lang.Throwable -> L20
            r2.<init>()     // Catch: java.lang.Throwable -> L20
            android.content.Context r3 = f0()     // Catch: java.lang.Throwable -> L20
            java.lang.String r4 = "activity"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch: java.lang.Throwable -> L20
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L26
            r3.getMemoryInfo(r2)     // Catch: java.lang.Throwable -> L20
            long r2 = r2.availMem     // Catch: java.lang.Throwable -> L20
            r4 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r2 / r4
            goto L26
        L20:
            r2 = move-exception
            java.lang.String r3 = "Failed get free mem"
            android.ext.e1.l(r3, r2)
        L26:
            return r0
    }

    public static void r1(android.view.View r1) {
            r0 = 2130968627(0x7f040033, float:1.7545913E38)
            android.graphics.drawable.Drawable r0 = o0(r0)
            q1(r1, r0)
            return
    }

    public static java.lang.String removeNewLinesChars(java.lang.String r7) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            int r3 = r7.length()
            if (r2 >= r3) goto L37
            char r3 = r7.charAt(r2)
            r4 = 0
            r5 = 0
        L13:
            r6 = 2
            if (r4 >= r6) goto L2a
            r6 = 1
            if (r5 != 0) goto L20
            r5 = 10
            if (r3 != r5) goto L1e
            goto L20
        L1e:
            r5 = 0
            goto L21
        L20:
            r5 = 1
        L21:
            if (r4 != r6) goto L24
            goto L27
        L24:
            int r3 = r3 + (-3)
            char r3 = (char) r3
        L27:
            int r4 = r4 + 1
            goto L13
        L2a:
            if (r5 == 0) goto L31
            java.lang.String r4 = ""
            r0.append(r4)
        L31:
            r0.append(r3)
            int r2 = r2 + 1
            goto L7
        L37:
            java.lang.String r7 = r0.toString()
            return r7
    }

    public static boolean s(android.view.View r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            boolean r0 = r0.callOnClick()
            return r0
    }

    public static java.lang.String s0() {
            java.lang.String r0 = android.ext.Tools.m
            if (r0 != 0) goto L73
            android.content.SharedPreferences r0 = M0()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "hidden-dir"
            boolean r2 = r0.contains(r1)     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L28
            java.lang.String r2 = t0()     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L1d
            java.lang.String r2 = H0()     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r0 = move-exception
            goto L51
        L1d:
            android.content.SharedPreferences$Editor r3 = r0.edit()     // Catch: java.lang.Throwable -> L1b
            android.content.SharedPreferences$Editor r2 = r3.putString(r1, r2)     // Catch: java.lang.Throwable -> L1b
            r2.commit()     // Catch: java.lang.Throwable -> L1b
        L28:
            r2 = 0
            java.lang.String r2 = r0.getString(r1, r2)     // Catch: java.lang.Throwable -> L1b java.lang.ClassCastException -> L2e
            goto L2f
        L2e:
        L2f:
            if (r2 != 0) goto L5a
            r3 = 0
            int r3 = r0.getInt(r1, r3)     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L48
            java.lang.String r2 = java.lang.Integer.toString(r3)     // Catch: java.lang.Throwable -> L1b
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L1b
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L1b
        L44:
            r0.commit()     // Catch: java.lang.Throwable -> L1b
            goto L5a
        L48:
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L1b
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L1b
            goto L44
        L51:
            java.lang.String r1 = "Failed get num"
            android.ext.e1.s(r1, r0)
            java.lang.String r2 = t0()
        L5a:
            if (r2 != 0) goto L60
            java.lang.String r2 = H0()
        L60:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GG-"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.ext.Tools.m = r0
        L73:
            java.lang.String r0 = android.ext.Tools.m
            return r0
    }

    public static boolean s1(android.content.DialogInterface r1, int r2, java.lang.Object r3, android.view.View.OnClickListener r4) {
            boolean r0 = r1 instanceof android.app.AlertDialog
            if (r0 == 0) goto L14
            android.app.AlertDialog r1 = (android.app.AlertDialog) r1
            android.widget.Button r1 = r1.getButton(r2)
            if (r1 == 0) goto L14
            r1.setTag(r3)
            r1.setOnClickListener(r4)
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    public static java.lang.CharSequence t(java.lang.CharSequence r4, int r5) {
            boolean r0 = r4 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0 = r4
            android.text.Spannable r0 = (android.text.Spannable) r0     // Catch: java.lang.Throwable -> L8
            goto Lf
        L8:
            r5 = move-exception
            goto L1f
        La:
            android.text.SpannableString r0 = new android.text.SpannableString     // Catch: java.lang.Throwable -> L8
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L8
        Lf:
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan     // Catch: java.lang.Throwable -> L8
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L8
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L8
            r2 = 33
            r3 = 0
            r0.setSpan(r1, r3, r5, r2)     // Catch: java.lang.Throwable -> L8
            return r0
        L1f:
            java.lang.String r0 = "Failed colorize"
            android.ext.e1.s(r0, r5)
            return r4
    }

    private static java.lang.String t0() {
            r0 = 0
            java.io.File r1 = p0()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L2e
            java.lang.String[] r1 = r1.list()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L2e
            int r2 = r1.length     // Catch: java.lang.Throwable -> L24
            r3 = 0
        Lf:
            if (r3 >= r2) goto L2e
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L26
            java.lang.String r5 = "GG-"
            boolean r5 = r4.startsWith(r5)     // Catch: java.lang.Throwable -> L24
            if (r5 != 0) goto L1e
            goto L26
        L1e:
            r1 = 3
            java.lang.String r0 = r4.substring(r1)     // Catch: java.lang.Throwable -> L24
            goto L2e
        L24:
            r1 = move-exception
            goto L29
        L26:
            int r3 = r3 + 1
            goto Lf
        L29:
            java.lang.String r2 = "Failed get dir"
            android.ext.e1.s(r2, r1)
        L2e:
            return r0
    }

    public static boolean t1(android.content.DialogInterface r0, int r1, java.lang.Object r2, android.view.View.OnClickListener r3, android.ext.EditText r4) {
            if (r4 == 0) goto L8
            r4.requestFocus()
            o1(r4)
        L8:
            boolean r0 = s1(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.CharSequence u(java.lang.CharSequence r7) {
            boolean r0 = r7 instanceof android.text.Spannable
            if (r0 == 0) goto Lf9
            java.lang.ref.WeakReference r0 = android.ext.Tools.q
            java.lang.Object r0 = r0.get()
            android.ext.Tools$v[] r0 = (android.ext.Tools.v[]) r0
            r1 = 0
            if (r0 != 0) goto Lea
            r0 = 11
            android.ext.Tools$v[] r0 = new android.ext.Tools.v[r0]
            android.ext.Tools$v r2 = new android.ext.Tools$v
            r3 = 1
            java.lang.CharSequence r4 = android.ext.c.v(r3)
            int r5 = android.ext.c.n(r3)
            r2.<init>(r4, r5)
            r0[r1] = r2
            android.ext.Tools$v r2 = new android.ext.Tools$v
            r4 = 2
            java.lang.CharSequence r5 = android.ext.c.v(r4)
            int r6 = android.ext.c.n(r4)
            r2.<init>(r5, r6)
            r0[r3] = r2
            android.ext.Tools$v r2 = new android.ext.Tools$v
            r3 = 4
            java.lang.CharSequence r5 = android.ext.c.v(r3)
            int r6 = android.ext.c.n(r3)
            r2.<init>(r5, r6)
            r0[r4] = r2
            android.ext.Tools$v r2 = new android.ext.Tools$v
            r4 = 8
            java.lang.CharSequence r5 = android.ext.c.v(r4)
            int r6 = android.ext.c.n(r4)
            r2.<init>(r5, r6)
            r5 = 3
            r0[r5] = r2
            android.ext.Tools$v r2 = new android.ext.Tools$v
            r5 = 16
            java.lang.CharSequence r6 = android.ext.c.v(r5)
            int r5 = android.ext.c.n(r5)
            r2.<init>(r6, r5)
            r0[r3] = r2
            android.ext.Tools$v r2 = new android.ext.Tools$v
            r3 = 32
            java.lang.CharSequence r5 = android.ext.c.v(r3)
            int r3 = android.ext.c.n(r3)
            r2.<init>(r5, r3)
            r3 = 5
            r0[r3] = r2
            android.ext.Tools$v r2 = new android.ext.Tools$v
            r3 = 64
            java.lang.CharSequence r5 = android.ext.c.v(r3)
            int r3 = android.ext.c.n(r3)
            r2.<init>(r5, r3)
            r3 = 6
            r0[r3] = r2
            android.ext.Tools$v r2 = new android.ext.Tools$v
            r3 = 2131296421(0x7f0900a5, float:1.8210758E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r5 = 2130837517(0x7f02000d, float:1.727999E38)
            int r5 = d0(r5)
            r2.<init>(r3, r5)
            r3 = 7
            r0[r3] = r2
            android.ext.Tools$v r2 = new android.ext.Tools$v
            r3 = 2131297108(0x7f090354, float:1.8212152E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r5 = 2130837521(0x7f020011, float:1.7279998E38)
            int r5 = d0(r5)
            r2.<init>(r3, r5)
            r0[r4] = r2
            android.ext.Tools$v r2 = new android.ext.Tools$v
            r3 = 2131296883(0x7f090273, float:1.8211695E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r4 = 2130837519(0x7f02000f, float:1.7279994E38)
            int r4 = d0(r4)
            r2.<init>(r3, r4)
            r3 = 9
            r0[r3] = r2
            android.ext.Tools$v r2 = new android.ext.Tools$v
            r3 = 2131297109(0x7f090355, float:1.8212154E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r4 = 2130837518(0x7f02000e, float:1.7279992E38)
            int r4 = d0(r4)
            r2.<init>(r3, r4)
            r3 = 10
            r0[r3] = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r0)
            android.ext.Tools.q = r2
        Lea:
            int r2 = r0.length
            if (r1 >= r2) goto Lf9
            r2 = r0[r1]
            java.lang.CharSequence r3 = r2.f546a
            int r2 = r2.f547b
            v(r7, r3, r2)
            int r1 = r1 + 1
            goto Lea
        Lf9:
            return r7
    }

    public static java.lang.Object u0() {
            java.lang.Object r0 = android.ext.Tools.p
            if (r0 != 0) goto L5f
            java.lang.String r0 = "android.os.ServiceManager"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = "getIServiceManager"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L5b
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L5b
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object[] r3 = d.b.f1514f     // Catch: java.lang.Throwable -> L5b
            r4 = 0
            java.lang.Object r0 = r0.invoke(r4, r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = "getService"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L5b
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r2] = r7     // Catch: java.lang.Throwable -> L5b
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L5b
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = "package"
            r5[r2] = r6     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r0 = r3.invoke(r0, r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = "android.content.pm.IPackageManager$Stub"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = "asInterface"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L5b
            java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
            r6[r2] = r7     // Catch: java.lang.Throwable -> L5b
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L5b
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L5b
            r1[r2] = r0     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r0 = r3.invoke(r4, r1)     // Catch: java.lang.Throwable -> L5b
            android.ext.Tools.p = r0     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r0 = move-exception
            android.ext.e1.a(r0)
        L5f:
            java.lang.Object r0 = android.ext.Tools.p
            return r0
    }

    public static android.app.AlertDialog u1(android.app.AlertDialog r2) {
            r0 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r0 = r2.findViewById(r0)     // Catch: java.lang.Throwable -> L17
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L1b
            java.lang.CharSequence r1 = r0.getText()     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L17
            v1(r0, r1)     // Catch: java.lang.Throwable -> L17
            goto L1b
        L17:
            r0 = move-exception
            android.ext.e1.a(r0)
        L1b:
            return r2
    }

    public static java.lang.CharSequence v(java.lang.CharSequence r7, java.lang.CharSequence r8, int r9) {
            boolean r0 = r7 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L2f
            r0 = r7
            android.text.Spannable r0 = (android.text.Spannable) r0     // Catch: java.lang.Throwable -> L29
            int r1 = r8.length()     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L29
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L29
            r3 = 0
        L14:
            int r3 = r2.indexOf(r8, r3)     // Catch: java.lang.Throwable -> L29
            if (r3 >= 0) goto L1b
            goto L2f
        L1b:
            int r4 = r3 + r1
            android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan     // Catch: java.lang.Throwable -> L29
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L29
            r6 = 33
            r0.setSpan(r5, r3, r4, r6)     // Catch: java.lang.Throwable -> L29
            r3 = r4
            goto L14
        L29:
            r8 = move-exception
            java.lang.String r9 = "Failed colorize text"
            android.ext.e1.s(r9, r8)
        L2f:
            return r7
    }

    public static java.lang.String v0(android.content.Context r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Context: "
        L7:
            r0.append(r1)
            r0.append(r2)
            if (r2 == 0) goto L1c
            boolean r1 = r2 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L1c
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            java.lang.String r1 = ", base: "
            goto L7
        L1c:
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static void v1(android.widget.TextView r1, java.lang.String r2) {
            android.ext.Tools$c r0 = new android.ext.Tools$c
            r0.<init>(r1, r2)
            android.ext.n2.i(r0)
            return
    }

    private static int[] w(byte[] r5) {
            int r0 = r5.length
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 1
        L5:
            int r3 = r5.length
            if (r2 >= r3) goto L22
        L8:
            if (r1 <= 0) goto L15
            r3 = r5[r1]
            r4 = r5[r2]
            if (r3 == r4) goto L15
            int r1 = r1 + (-1)
            r1 = r0[r1]
            goto L8
        L15:
            r3 = r5[r1]
            r4 = r5[r2]
            if (r3 != r4) goto L1d
            int r1 = r1 + 1
        L1d:
            r0[r2] = r1
            int r2 = r2 + 1
            goto L5
        L22:
            return r0
    }

    public static android.widget.ListView w0(android.view.View r1) {
        L0:
            if (r1 == 0) goto L15
            boolean r0 = r1 instanceof android.widget.ListView
            if (r0 == 0) goto L9
            android.widget.ListView r1 = (android.widget.ListView) r1
            goto L16
        L9:
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 != 0) goto L12
            goto L15
        L12:
            android.view.View r1 = (android.view.View) r1
            goto L0
        L15:
            r1 = 0
        L16:
            return r1
    }

    public static void w1(int r6, android.content.ComponentName r7, int r8) {
            java.lang.String r0 = ": "
            java.lang.String r1 = "hide "
            android.content.pm.PackageManager r2 = B0()     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r3.<init>()     // Catch: java.lang.Throwable -> L5b
            r3.append(r1)     // Catch: java.lang.Throwable -> L5b
            r3.append(r6)     // Catch: java.lang.Throwable -> L5b
            r3.append(r0)     // Catch: java.lang.Throwable -> L5b
            r3.append(r8)     // Catch: java.lang.Throwable -> L5b
            r4 = 32
            r3.append(r4)     // Catch: java.lang.Throwable -> L5b
            r3.append(r7)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5b
            android.ext.e1.d(r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = r7.getPackageName()     // Catch: java.lang.Throwable -> L5b
            r5 = 0
            B(r3, r5)     // Catch: java.lang.Throwable -> L5b
            r3 = 1
            r2.setComponentEnabledSetting(r7, r8, r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r2.<init>()     // Catch: java.lang.Throwable -> L5b
            r2.append(r1)     // Catch: java.lang.Throwable -> L5b
            int r6 = r6 + r3
            r2.append(r6)     // Catch: java.lang.Throwable -> L5b
            r2.append(r0)     // Catch: java.lang.Throwable -> L5b
            r2.append(r8)     // Catch: java.lang.Throwable -> L5b
            r2.append(r4)     // Catch: java.lang.Throwable -> L5b
            r2.append(r7)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L5b
            android.ext.e1.d(r6)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = r7.getPackageName()     // Catch: java.lang.Throwable -> L5b
            B(r6, r5)     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r6 = move-exception
            android.ext.e1.a(r6)
        L5f:
            return
    }

    public static java.lang.CharSequence x(java.lang.CharSequence... r4) {
            java.lang.CharSequence r4 = android.text.TextUtils.concat(r4)     // Catch: java.lang.Throwable -> L5
            return r4
        L5:
            r0 = move-exception
            android.ext.e1.a(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        L10:
            if (r2 >= r1) goto L1a
            r3 = r4[r2]
            r0.append(r3)
            int r2 = r2 + 1
            goto L10
        L1a:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private static android.ext.Tools.y x0(java.lang.Class r3, android.ext.Tools.y[] r4) {
            r0 = 0
            r1 = r4[r0]     // Catch: java.lang.NoSuchMethodException -> L8
            android.ext.Tools$y r4 = r1.a()     // Catch: java.lang.NoSuchMethodException -> L8
            goto L19
        L8:
            r1 = 0
        L9:
            int r2 = r4.length
            if (r0 >= r2) goto L18
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            r2 = r4[r0]     // Catch: java.lang.NoSuchMethodException -> L15
            android.ext.Tools$y r1 = r2.a()     // Catch: java.lang.NoSuchMethodException -> L15
        L15:
            int r0 = r0 + 1
            goto L9
        L18:
            r4 = r1
        L19:
            if (r4 != 0) goto L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Methods: "
            r0.append(r1)
            java.lang.reflect.Method[] r3 = r3.getMethods()
            java.lang.String r3 = java.util.Arrays.toString(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            android.ext.e1.d(r3)
        L37:
            return r4
    }

    public static void x1(android.view.View r1, float r2) {
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 == 0) goto Lc
            int r2 = (int) r2
            r0.height = r2
            r1.setLayoutParams(r0)
        Lc:
            return
    }

    public static java.lang.String y(java.lang.String[] r5, java.lang.String r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L1a
            r3 = r5[r2]
            int r4 = r0.length()
            if (r4 == 0) goto L14
            r0.append(r6)
        L14:
            r0.append(r3)
            int r2 = r2 + 1
            goto L7
        L1a:
            java.lang.String r5 = r0.toString()
            return r5
    }

    public static java.lang.String y0(java.lang.String r10) {
            byte r0 = android.ext.Tools.u
            r1 = 1
            if (r0 == 0) goto L9
            byte r0 = android.ext.Tools.u
            if (r0 != r1) goto L98
        L9:
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L5d
            r0.<init>(r10)     // Catch: java.io.IOException -> L5d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L5d
            r2.<init>()     // Catch: java.io.IOException -> L5d
            r3 = 47
            r2.append(r3)     // Catch: java.io.IOException -> L5d
            java.lang.String r3 = r0.getName()     // Catch: java.io.IOException -> L5d
            r2.append(r3)     // Catch: java.io.IOException -> L5d
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L5d
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.IOException -> L5d
            r3.<init>(r0)     // Catch: java.io.IOException -> L5d
            java.nio.channels.FileChannel r4 = r3.getChannel()     // Catch: java.io.IOException -> L5d
            java.nio.channels.FileChannel$MapMode r5 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.io.IOException -> L5d
            r6 = 0
            r8 = 4096(0x1000, double:2.0237E-320)
            java.nio.MappedByteBuffer r0 = r4.map(r5, r6, r8)     // Catch: java.io.IOException -> L5d
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.io.IOException -> L5d
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.io.IOException -> L5d
            java.lang.String r6 = "/proc/self/maps"
            r5.<init>(r6)     // Catch: java.io.IOException -> L5d
            r4.<init>(r5)     // Catch: java.io.IOException -> L5d
        L42:
            java.lang.String r5 = r4.readLine()     // Catch: java.io.IOException -> L5d
            if (r5 == 0) goto L73
            int r6 = r5.indexOf(r2)     // Catch: java.io.IOException -> L5d
            if (r6 >= 0) goto L4f
            goto L42
        L4f:
            r2 = r6
        L50:
            if (r2 <= 0) goto L5f
            char r7 = r5.charAt(r2)     // Catch: java.io.IOException -> L5d
            r8 = 32
            if (r7 <= r8) goto L5f
            int r2 = r2 + (-1)
            goto L50
        L5d:
            r0 = move-exception
            goto L84
        L5f:
            if (r2 >= r6) goto L73
            int r6 = r5.length()     // Catch: java.io.IOException -> L5d
            java.lang.String r2 = r5.substring(r2, r6)     // Catch: java.io.IOException -> L5d
            java.lang.String r10 = r2.trim()     // Catch: java.io.IOException -> L5d
            byte r2 = android.ext.Tools.u     // Catch: java.io.IOException -> L5d
            if (r2 != 0) goto L73
            android.ext.Tools.u = r1     // Catch: java.io.IOException -> L5d
        L73:
            r4.close()     // Catch: java.io.IOException -> L5d
            byte r1 = android.ext.Tools.u     // Catch: java.io.IOException -> L5d
            if (r1 != 0) goto L7d
            r1 = 2
            android.ext.Tools.u = r1     // Catch: java.io.IOException -> L5d
        L7d:
            r0.capacity()     // Catch: java.io.IOException -> L5d
            r3.close()     // Catch: java.io.IOException -> L5d
            goto L98
        L84:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed getNativePath: "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.ext.e1.s(r1, r0)
        L98:
            return r10
    }

    public static void y1(android.widget.ImageView r1, float r2) {
            android.ext.Tools$r r0 = new android.ext.Tools$r
            r0.<init>(r1, r2)
            android.ext.n2.i(r0)
            return
    }

    public static void z(java.lang.String r1) {
            r0 = 1
            A(r1, r0)
            return
    }

    public static android.content.pm.PackageInfo z0(java.lang.String r1) {
            r0 = 0
            android.content.pm.PackageInfo r1 = A0(r1, r0)
            return r1
    }

    public static void z1(android.view.View r3, android.view.View.OnFocusChangeListener r4) {
            r0 = 2131099661(0x7f06000d, float:1.7811682E38)
            java.lang.Object r1 = r3.getTag(r0)
            android.ext.Tools$w r1 = (android.ext.Tools.w) r1
            if (r1 != 0) goto L17
            android.ext.Tools$w r1 = new android.ext.Tools$w
            r2 = 0
            r1.<init>(r2)
            r3.setOnFocusChangeListener(r1)
            r3.setTag(r0, r1)
        L17:
            r1.a(r4)
            return
    }
}
