package android.ext;

/* JADX INFO: loaded from: classes.dex */
public class ShowApp extends android.fix.ImageView {
    private static java.util.ArrayList k = new java.util.ArrayList();

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
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (android.ext.ShowApp.this.f457e) {
                android.ext.ShowApp showApp = android.ext.ShowApp.this;
                if (showApp.b(showApp.f455c)) {
                    android.ext.ShowApp.this.f457e = false;
                }
            }
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f461a;

        b(boolean z) {
            this.f461a = z;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            android.ext.ShowApp showApp = android.ext.ShowApp.this;
            if (showApp.b(showApp)) {
                android.ext.ShowApp.this.f458f = false;
            }
            if (this.f461a) {
                return;
            }
            android.ext.ShowApp showApp2 = android.ext.ShowApp.this;
            if (showApp2.b(showApp2.h)) {
                android.ext.ShowApp.this.h = null;
            }
        }
    }

    class c implements android.view.View.OnTouchListener {
        c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                android.ext.ShowApp.this.h(true);
                return true;
            }
            if (action != 1 && action != 3) {
                return false;
            }
            android.ext.ShowApp.this.h(false);
            return true;
        }
    }

    class d implements java.lang.Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.ShowApp.this.e();
        }
    }

    class e implements java.lang.Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (android.ext.ShowApp.this.f459g == null) {
                android.ext.ShowApp.this.o();
                android.ext.n2.d().postDelayed(android.ext.ShowApp.this.j, 2000L);
            }
        }
    }

    class f implements java.lang.Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.view.View view;
            android.ext.n2.d().removeCallbacks(android.ext.ShowApp.this.j);
            android.ext.ShowApp showApp = android.ext.ShowApp.this;
            showApp.f(showApp.f459g);
            android.ext.MainService mainService = android.ext.MainService.instance;
            if (mainService == null || (view = mainService.f213c) == null) {
                return;
            }
            android.view.View view2 = mainService.f214d;
            if (view2 != null && android.ext.MainService.instance.n != null) {
                android.ext.ShowApp showApp2 = android.ext.ShowApp.this;
                if (showApp2.l(view2, showApp2.f454b)) {
                    android.ext.ShowApp.this.h = view2;
                }
            }
            android.ext.ShowApp showApp3 = android.ext.ShowApp.this;
            if (showApp3.l(view, showApp3.f454b)) {
                android.ext.ShowApp.this.f459g = view;
            }
        }
    }

    class g implements java.lang.Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.view.View view = android.ext.ShowApp.this.f459g;
            if (view == null) {
                return;
            }
            if (android.ext.MainService.instance.f213c == null || android.ext.MainService.instance.n == null) {
                android.ext.ShowApp.this.f(view);
            }
        }
    }

    class h implements java.lang.Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.ShowApp showApp = android.ext.ShowApp.this;
            if (showApp.b(showApp.i)) {
                android.ext.ShowApp.this.i = null;
            }
            android.ext.MainService mainService = android.ext.MainService.instance;
            if (mainService == null) {
                return;
            }
            android.view.View view = mainService.f217g;
            android.ext.ShowApp showApp2 = android.ext.ShowApp.this;
            if (showApp2.l(view, showApp2.f454b)) {
                android.ext.ShowApp.this.i = view;
            }
        }
    }

    class i implements java.lang.Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.ext.ShowApp showApp = android.ext.ShowApp.this;
            if (showApp.b(showApp.i)) {
                android.ext.ShowApp.this.i = null;
            }
        }
    }

    class j implements java.lang.Runnable {
        j() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            if (android.ext.ShowApp.this.f458f) {
                android.ext.ShowApp showApp = android.ext.ShowApp.this;
                if (showApp.b(showApp)) {
                    android.ext.ShowApp.this.f458f = false;
                }
            }
            android.ext.ShowApp showApp2 = android.ext.ShowApp.this;
            if (showApp2.l(showApp2, showApp2.f453a)) {
                android.ext.ShowApp.this.f458f = true;
            }
        }
    }

    class k implements java.lang.Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (android.ext.ShowApp.this.f457e) {
                android.ext.ShowApp showApp = android.ext.ShowApp.this;
                if (showApp.b(showApp.f455c)) {
                    android.ext.ShowApp.this.f457e = false;
                }
            }
            android.ext.ShowApp showApp2 = android.ext.ShowApp.this;
            if (showApp2.l(showApp2.f455c, showApp2.f456d)) {
                android.ext.ShowApp.this.f457e = true;
            }
        }
    }

    static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.ref.WeakReference f472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f474c;

        public l(java.lang.ref.WeakReference weakReference, boolean z, float f2) {
            this.f472a = weakReference;
            this.f473b = z;
            this.f474c = f2;
        }
    }

    public ShowApp(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f457e = false;
        this.f458f = false;
        this.f459g = null;
        this.h = null;
        this.i = null;
        if (!isInEditMode()) {
            android.fix.TextView textView = new android.fix.TextView(getContext());
            this.f455c = textView;
            try {
                textView.setGravity(17);
            } catch (java.lang.NoSuchMethodError e2) {
                android.ext.e1.a(e2);
            }
            textView.setText(android.ext.Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2grzqordg"));
            textView.setBackgroundColor(-16777216);
            android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
            this.f454b = layoutParams;
            layoutParams.type = android.ext.m2.c();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -2;
            layoutParams.gravity = 51;
            layoutParams.x = -10000;
            layoutParams.y = -10000;
            layoutParams.flags = 8;
            android.view.WindowManager.LayoutParams layoutParams2 = new android.view.WindowManager.LayoutParams();
            this.f453a = layoutParams2;
            layoutParams2.type = android.ext.m2.c();
            layoutParams2.width = (int) android.ext.Tools.G(60.0f);
            layoutParams2.height = (int) android.ext.Tools.G(20.0f);
            layoutParams2.format = -2;
            layoutParams2.gravity = 51;
            layoutParams2.x = 10000;
            layoutParams2.y = 10000;
            layoutParams2.flags = 264;
            android.view.WindowManager.LayoutParams layoutParams3 = new android.view.WindowManager.LayoutParams();
            this.f456d = layoutParams3;
            layoutParams3.type = android.ext.m2.b();
            layoutParams3.width = -2;
            layoutParams3.height = -2;
            layoutParams3.format = -2;
            layoutParams3.gravity = 49;
            layoutParams3.x = 0;
            layoutParams3.y = -1000;
            layoutParams3.flags = 24;
            setOnTouchListener(new android.ext.ShowApp.c());
        }
        this.j = new android.ext.ShowApp.d();
    }

    public static void i(android.view.Window window) {
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        java.util.ArrayList<android.ext.ShowApp.l> arrayList = k;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (android.ext.ShowApp.l lVar : arrayList) {
            android.view.Window window2 = (android.view.Window) lVar.f472a.get();
            if (window2 != null && window2 != window) {
                arrayList2.add(lVar);
            }
        }
        arrayList2.add(new android.ext.ShowApp.l(new java.lang.ref.WeakReference(window), (attributes.flags & 2) != 0, attributes.dimAmount));
        k = arrayList2;
        arrayList.clear();
        arrayList.trimToSize();
    }

    private void j(android.view.View view, float f2) {
        if (view != null) {
            try {
                view.setAlpha(f2);
            } catch (java.lang.Throwable th) {
                android.ext.e1.s("Failed set transparency", th);
            }
        }
    }

    public void a(boolean z) {
        if (z) {
            e();
        } else {
            android.ext.n2.d().postDelayed(this.j, 2000L);
        }
        android.ext.n2.i(new android.ext.ShowApp.b(z));
    }

    boolean b(android.view.View view) {
        if (view != null) {
            try {
                if (view instanceof android.ext.FloatPanel) {
                    ((android.ext.FloatPanel) view).e();
                } else {
                    android.ext.Tools.n1(view);
                }
                return true;
            } catch (java.lang.Throwable th) {
                android.ext.e1.s("Failed remove view " + view, th);
            }
        }
        return false;
    }

    public void c() {
        e();
        android.ext.n2.i(new android.ext.ShowApp.a());
    }

    public void d() {
        android.ext.n2.i(new android.ext.ShowApp.i());
    }

    public void e() {
        android.ext.n2.i(new android.ext.ShowApp.g());
    }

    void f(android.view.View view) {
        if (view != null) {
            if (b(view)) {
                this.f459g = null;
            }
            if (b(this.h)) {
                this.h = null;
            }
        }
    }

    public void g() {
        android.ext.n2.i(new android.ext.ShowApp.e());
    }

    void h(boolean z) {
        java.util.Iterator it = k.iterator();
        while (true) {
            float f2 = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            android.ext.ShowApp.l lVar = (android.ext.ShowApp.l) it.next();
            android.view.Window window = (android.view.Window) lVar.f472a.get();
            if (window != null) {
                try {
                    android.view.WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.alpha = z ? 0.0f : 1.0f;
                    if (lVar.f473b) {
                        attributes.flags = z ? attributes.flags & (-3) : attributes.flags | 2;
                        if (!z) {
                            f2 = lVar.f474c;
                        }
                        attributes.dimAmount = f2;
                    }
                    window.setAttributes(attributes);
                } catch (java.lang.Throwable th) {
                    android.ext.e1.s("Failed set transparency", th);
                }
            }
        }
        float f3 = z ? 0.0f : 1.0f;
        if (this.f457e) {
            j(this.f455c, f3);
        }
        j(this.f459g, f3);
        j(this.h, f3);
        j(this.i, f3);
    }

    public void k() {
        o();
        n();
        android.ext.n2.i(new android.ext.ShowApp.j());
    }

    boolean l(android.view.View view, android.view.WindowManager.LayoutParams layoutParams) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        try {
            if (view instanceof android.ext.FloatPanel) {
                ((android.ext.FloatPanel) view).m();
            } else {
                android.ext.Tools.g(view, layoutParams);
            }
            z = true;
            view.setAlpha(1.0f);
            return true;
        } catch (java.lang.Throwable th) {
            android.ext.e1.s("Failed add view " + view, th);
            return z;
        }
    }

    public void m() {
        if (this.f459g == null) {
            o();
        }
        if (this.i == null) {
            n();
        }
        android.ext.n2.i(new android.ext.ShowApp.k());
    }

    public void n() {
        android.ext.n2.i(new android.ext.ShowApp.h());
    }

    public void o() {
        android.ext.n2.i(new android.ext.ShowApp.f());
    }

    public void p() {
        if (this.f459g != null) {
            o();
        }
        if (this.i != null) {
            n();
        }
        if (this.f458f) {
            k();
        }
    }
}
