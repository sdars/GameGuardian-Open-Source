package android.ext;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final java.lang.Runnable f759a = new android.ext.f.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile int f760b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.List f761c = new java.util.ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.List f762d = new java.util.ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static java.util.ArrayList f763e = new java.util.ArrayList();

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.f.v();
        }
    }

    class b implements android.content.DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f764a;

        b(java.lang.Runnable runnable) {
            this.f764a = runnable;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface dialogInterface) {
            android.ext.e1.d(this.f764a + ": 30_");
            android.ext.n2.d().removeCallbacks(this.f764a);
        }
    }

    class c implements android.content.DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f765a;

        c(java.lang.Runnable runnable) {
            this.f765a = runnable;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface dialogInterface) {
            android.ext.e1.d(this.f765a + ": 40_");
            android.ext.n2.d().postDelayed(this.f765a, 5000L);
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog f766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.f.n f767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f768c;

        d(android.app.AlertDialog alertDialog, android.ext.f.n nVar, java.lang.Runnable runnable) {
            this.f766a = alertDialog;
            this.f767b = nVar;
            this.f768c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f766a.isShowing()) {
                this.f767b.a();
                return;
            }
            if (this.f767b.c()) {
                android.ext.e1.d("Fail-closed dialog was not shown");
                java.lang.Runnable runnable = this.f768c;
                if (runnable != null) {
                    runnable.run();
                }
            }
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

        e(android.ext.f.n nVar, android.os.Handler handler, java.lang.Runnable runnable, android.app.AlertDialog alertDialog, java.lang.Runnable runnable2) {
            this.f769a = nVar;
            this.f770b = handler;
            this.f771c = runnable;
            this.f772d = alertDialog;
            this.f773e = runnable2;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface dialogInterface) {
            this.f769a.f785a = true;
            this.f770b.removeCallbacks(this.f771c);
            android.ext.f.j(this.f772d, this.f769a, this.f773e);
        }
    }

    /* JADX INFO: renamed from: android.ext.f$f, reason: collision with other inner class name */
    class DialogInterfaceOnDismissListenerC0015f implements android.content.DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.f.n f774a;

        DialogInterfaceOnDismissListenerC0015f(android.ext.f.n nVar) {
            this.f774a = nVar;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface dialogInterface) {
            this.f774a.a();
        }
    }

    class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog f775a;

        g(android.app.AlertDialog alertDialog) {
            this.f775a = alertDialog;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                android.ext.f.t(this.f775a);
            } catch (java.lang.Throwable th) {
                android.ext.e1.l("Failed show dialog on service", th);
            }
        }
    }

    class h implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog.Builder f776a;

        h(android.app.AlertDialog.Builder builder) {
            this.f776a = builder;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.f.q(this.f776a, null);
        }
    }

    class i implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog.Builder f777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.EditText f778b;

        i(android.app.AlertDialog.Builder builder, android.ext.EditText editText) {
            this.f777a = builder;
            this.f778b = editText;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.f.n(this.f777a.create(), this.f778b);
        }
    }

    private static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.ref.WeakReference f779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public java.lang.ref.WeakReference f780b;

        public j(android.app.AlertDialog alertDialog, android.ext.f.k kVar) {
            this.f779a = new java.lang.ref.WeakReference(alertDialog);
            this.f780b = new java.lang.ref.WeakReference(kVar);
        }
    }

    private static class k implements android.content.DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f781a;

        private k() {
            this.f781a = new java.util.ArrayList();
        }

        /* synthetic */ k(android.ext.f.a aVar) {
            this();
        }

        public void a(android.content.DialogInterface.OnDismissListener onDismissListener) {
            if (onDismissListener == null || this.f781a.contains(onDismissListener)) {
                return;
            }
            this.f781a.add(onDismissListener);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface dialogInterface) {
            android.ext.f.g();
            for (android.content.DialogInterface.OnDismissListener onDismissListener : this.f781a) {
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
            }
        }
    }

    private static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.ref.WeakReference f782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public java.lang.ref.WeakReference f783b;

        public l(android.app.AlertDialog alertDialog, android.ext.f.m mVar) {
            this.f782a = new java.lang.ref.WeakReference(alertDialog);
            this.f783b = new java.lang.ref.WeakReference(mVar);
        }
    }

    private static class m implements android.content.DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f784a;

        private m() {
            this.f784a = new java.util.ArrayList();
        }

        /* synthetic */ m(android.ext.f.a aVar) {
            this();
        }

        public void a(android.content.DialogInterface.OnShowListener onShowListener) {
            if (onShowListener == null || this.f784a.contains(onShowListener)) {
                return;
            }
            this.f784a.add(onShowListener);
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface dialogInterface) {
            android.ext.Tools.N((android.app.AlertDialog) dialogInterface);
            for (android.content.DialogInterface.OnShowListener onShowListener : this.f784a) {
                if (onShowListener != null) {
                    onShowListener.onShow(dialogInterface);
                }
            }
        }
    }

    private static class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile boolean f785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f786b;

        private n() {
            this.f785a = false;
            this.f786b = false;
        }

        /* synthetic */ n(android.ext.f.a aVar) {
            this();
        }

        synchronized void a() {
            this.f786b = true;
        }

        synchronized boolean b() {
            if (this.f786b) {
                return false;
            }
            this.f786b = true;
            return true;
        }

        synchronized boolean c() {
            if (!this.f786b && !this.f785a) {
                this.f786b = true;
                return true;
            }
            return false;
        }
    }

    private static class o implements android.widget.AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.widget.AdapterView.OnItemClickListener f787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.ext.f.n f788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final java.lang.Runnable f789c;

        private o(android.widget.AdapterView.OnItemClickListener onItemClickListener, android.ext.f.n nVar, java.lang.Runnable runnable) {
            this.f787a = onItemClickListener;
            this.f788b = nVar;
            this.f789c = runnable;
        }

        /* synthetic */ o(android.widget.AdapterView.OnItemClickListener onItemClickListener, android.ext.f.n nVar, java.lang.Runnable runnable, android.ext.f.a aVar) {
            this(onItemClickListener, nVar, runnable);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
            boolean zB = this.f788b.b();
            android.widget.AdapterView.OnItemClickListener onItemClickListener = this.f787a;
            if (onItemClickListener != null) {
                try {
                    onItemClickListener.onItemClick(adapterView, view, i, j);
                } catch (java.lang.Throwable th) {
                    android.ext.e1.a(th);
                }
            }
            if (!zB || this.f789c == null) {
                return;
            }
            android.ext.n2.d().post(this.f789c);
        }
    }

    private static class p implements android.widget.AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.widget.AdapterView.OnItemClickListener f790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final android.app.AlertDialog f791b;

        private p(android.app.AlertDialog alertDialog, android.widget.AdapterView.OnItemClickListener onItemClickListener) {
            this.f790a = onItemClickListener;
            this.f791b = alertDialog;
        }

        /* synthetic */ p(android.app.AlertDialog alertDialog, android.widget.AdapterView.OnItemClickListener onItemClickListener, android.ext.f.a aVar) {
            this(alertDialog, onItemClickListener);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
            try {
                this.f790a.onItemClick(adapterView, view, i, j);
            } catch (java.lang.Throwable th) {
                android.ext.e1.a(th);
                android.ext.Tools.D(this.f791b);
            }
        }
    }

    public static android.app.AlertDialog.Builder b() {
        return c(android.ext.Tools.f0());
    }

    public static android.app.AlertDialog.Builder c(android.content.Context context) {
        return new android.app.AlertDialog.Builder(context);
    }

    public static void d() {
        java.util.Iterator it = f763e.iterator();
        while (it.hasNext()) {
            android.app.AlertDialog alertDialog = (android.app.AlertDialog) ((java.lang.ref.WeakReference) it.next()).get();
            if (alertDialog != null) {
                try {
                    if (alertDialog.isShowing()) {
                        android.ext.Tools.D(alertDialog);
                    }
                } catch (java.lang.Throwable th) {
                    android.ext.e1.s("Failed dismiss dialog: " + alertDialog, th);
                }
            }
        }
        if (android.ext.MainService.instance != null) {
            android.ext.MainService.instance.t();
        }
    }

    private static void e(android.app.AlertDialog alertDialog) {
        android.view.Window window = alertDialog.getWindow();
        window.setCallback(new android.ext.g3(window.getCallback()));
        if (h()) {
            window.clearFlags(16777216);
            return;
        }
        window.setType(android.ext.m2.b());
        android.ext.Tools.R(window);
        if ((android.ext.Config.B & 2) != 0) {
            window.addFlags(16777216);
        } else {
            window.clearFlags(16777216);
        }
    }

    private static void f(android.app.AlertDialog alertDialog) {
        android.widget.ListView listView;
        android.ext.f.a aVar = null;
        try {
            listView = alertDialog.getListView();
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
            listView = null;
        }
        if (listView == null) {
            return;
        }
        try {
            android.widget.AdapterView.OnItemClickListener onItemClickListener = listView.getOnItemClickListener();
            if (onItemClickListener == null || (onItemClickListener instanceof android.ext.f.p)) {
                return;
            }
            listView.setOnItemClickListener(new android.ext.f.p(alertDialog, onItemClickListener, aVar));
        } catch (java.lang.Throwable th2) {
            android.ext.e1.a(th2);
        }
    }

    static void g() {
        if (android.ext.MainService.instance == null) {
            return;
        }
        f760b--;
        if (f760b <= 0) {
            android.ext.n2.d().removeCallbacks(f759a);
            android.ext.MainService.instance.h0.c();
            f760b = 0;
        }
    }

    private static boolean h() {
        return android.ext.MainService.instance == null;
    }

    public static void i(android.app.AlertDialog alertDialog) {
        if (alertDialog.getWindow().getAttributes().type < 2000) {
            return;
        }
        java.util.ArrayList<java.lang.ref.WeakReference> arrayList = f763e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.ref.WeakReference weakReference : arrayList) {
            android.app.AlertDialog alertDialog2 = (android.app.AlertDialog) weakReference.get();
            if (alertDialog2 != null && alertDialog2 != alertDialog) {
                arrayList2.add(weakReference);
            }
        }
        arrayList2.add(new java.lang.ref.WeakReference(alertDialog));
        f763e = arrayList2;
        arrayList.clear();
        arrayList.trimToSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(android.app.AlertDialog alertDialog, android.ext.f.n nVar, java.lang.Runnable runnable) {
        android.widget.ListView listView = alertDialog.getListView();
        if (listView == null) {
            return;
        }
        android.widget.AdapterView.OnItemClickListener onItemClickListener = listView.getOnItemClickListener();
        if (onItemClickListener instanceof android.ext.f.o) {
            return;
        }
        listView.setOnItemClickListener(new android.ext.f.o(onItemClickListener, nVar, runnable, null));
    }

    public static void k(android.app.AlertDialog alertDialog, android.content.DialogInterface.OnDismissListener onDismissListener) {
        java.util.List list;
        android.app.AlertDialog alertDialog2;
        android.ext.f.a aVar = null;
        int i2 = 0;
        android.ext.f.j jVar = null;
        while (true) {
            list = f762d;
            if (i2 >= list.size()) {
                break;
            }
            android.ext.f.j jVar2 = (android.ext.f.j) list.get(i2);
            if (jVar2 == null || (alertDialog2 = (android.app.AlertDialog) jVar2.f779a.get()) == null) {
                list.remove(i2);
                i2--;
            } else if (alertDialog2 == alertDialog) {
                jVar = jVar2;
            }
            i2++;
        }
        if (jVar == null) {
            android.ext.f.k kVar = new android.ext.f.k(aVar);
            alertDialog.setOnDismissListener(kVar);
            jVar = new android.ext.f.j(alertDialog, kVar);
            list.add(jVar);
        }
        ((android.ext.f.k) jVar.f780b.get()).a(onDismissListener);
    }

    public static void l(android.app.AlertDialog alertDialog, android.content.DialogInterface.OnShowListener onShowListener) {
        java.util.List list;
        android.app.AlertDialog alertDialog2;
        android.ext.f.a aVar = null;
        int i2 = 0;
        android.ext.f.l lVar = null;
        while (true) {
            list = f761c;
            if (i2 >= list.size()) {
                break;
            }
            android.ext.f.l lVar2 = (android.ext.f.l) list.get(i2);
            if (lVar2 == null || (alertDialog2 = (android.app.AlertDialog) lVar2.f782a.get()) == null) {
                list.remove(i2);
                i2--;
            } else if (alertDialog2 == alertDialog) {
                lVar = lVar2;
            }
            i2++;
        }
        if (lVar == null) {
            android.ext.f.m mVar = new android.ext.f.m(aVar);
            alertDialog.setOnShowListener(mVar);
            lVar = new android.ext.f.l(alertDialog, mVar);
            list.add(lVar);
        }
        ((android.ext.f.m) lVar.f783b.get()).a(onShowListener);
    }

    public static android.app.AlertDialog m(android.app.AlertDialog alertDialog) {
        n(alertDialog, null);
        return alertDialog;
    }

    public static android.app.AlertDialog n(android.app.AlertDialog alertDialog, android.widget.EditText editText) {
        if (editText != null) {
            editText.setOnEditorActionListener(new android.ext.EditorActionListener(alertDialog));
        }
        e(alertDialog);
        android.ext.n2.i(new android.ext.f.g(alertDialog));
        return alertDialog;
    }

    public static void o(android.app.AlertDialog.Builder builder) {
        q(builder, null);
    }

    public static void p(android.app.AlertDialog.Builder builder, android.content.Context context) {
        q(builder, null);
    }

    public static void q(android.app.AlertDialog.Builder builder, android.ext.EditText editText) {
        android.ext.n2.i(new android.ext.f.i(builder, editText));
    }

    public static void r(android.app.AlertDialog alertDialog, java.lang.Runnable runnable, boolean z) {
        l(alertDialog, new android.ext.f.b(runnable));
        if (z) {
            k(alertDialog, new android.ext.f.c(runnable));
        }
        android.ext.n2.d().postDelayed(runnable, 3000L);
        android.ext.e1.d(runnable + ": 10_");
        m(alertDialog);
        android.ext.e1.d(runnable + ": 20_");
    }

    public static void s(android.app.AlertDialog.Builder builder) {
        android.ext.f0.m0(new android.ext.f.h(builder));
    }

    static void t(android.app.AlertDialog alertDialog) {
        l(alertDialog, null);
        alertDialog.show();
        if (h()) {
            return;
        }
        f(alertDialog);
        android.view.Window window = alertDialog.getWindow();
        android.view.View decorView = window.getDecorView();
        android.ext.InternalKeyboard internalKeyboard = (android.ext.InternalKeyboard) decorView.findViewById(catch_.me_.if_.you_.can_.R.id.keyboard);
        if (internalKeyboard != null) {
            internalKeyboard.g(window);
        }
        window.setSoftInputMode(((android.ext.Tools.Q0(decorView) && (internalKeyboard == null || (android.ext.Config.B & 1) == 0)) ? 5 : 2) | 16);
        android.ext.Tools.S(decorView);
        android.ext.ShowApp.i(window);
        android.os.Handler handlerD = android.ext.n2.d();
        java.lang.Runnable runnable = f759a;
        handlerD.removeCallbacks(runnable);
        handlerD.postDelayed(runnable, 100L);
        if (f760b <= 0) {
            f760b = 1;
        } else {
            f760b++;
        }
        k(alertDialog, null);
        i(alertDialog);
    }

    public static void u(android.app.AlertDialog alertDialog, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        android.ext.f.n nVar = new android.ext.f.n(null);
        android.os.Handler handlerD = android.ext.n2.d();
        android.ext.f.d dVar = new android.ext.f.d(alertDialog, nVar, runnable2);
        l(alertDialog, new android.ext.f.e(nVar, handlerD, dVar, alertDialog, runnable));
        k(alertDialog, new android.ext.f.DialogInterfaceOnDismissListenerC0015f(nVar));
        handlerD.postDelayed(dVar, 3000L);
        m(alertDialog);
    }

    static void v() {
        if (android.ext.MainService.instance == null) {
            return;
        }
        android.ext.MainService.instance.h0.p();
        if (android.ext.MainService.instance.f0 == android.ext.MainService.instance.c0) {
            return;
        }
        android.ext.MainService.instance.h0.m();
    }

    public static void w(android.app.AlertDialog alertDialog) {
        try {
            alertDialog.show();
        } catch (android.view.WindowManager.BadTokenException unused) {
            m(alertDialog);
        }
    }
}
