package android.ext;

import android.content.Context;
import android.fix.ImageView;
import android.fix.TextView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class ShowApp extends ImageView {
    private static ArrayList k = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WindowManager.LayoutParams f453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    WindowManager.LayoutParams f454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    TextView f455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    WindowManager.LayoutParams f456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile boolean f457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile boolean f458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile View f459g;
    volatile View h;
    volatile View i;
    final Runnable j;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ShowApp.this.f457e) {
                ShowApp showApp = ShowApp.this;
                if (showApp.b(showApp.f455c)) {
                    ShowApp.this.f457e = false;
                }
            }
        }
    }

    class b implements Runnable {

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
            ShowApp showApp = ShowApp.this;
            if (showApp.b(showApp)) {
                ShowApp.this.f458f = false;
            }
            if (this.f461a) {
                return;
            }
            ShowApp showApp2 = ShowApp.this;
            if (showApp2.b(showApp2.h)) {
                ShowApp.this.h = null;
            }
        }
    }

    class c implements View.OnTouchListener {
        c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                ShowApp.this.h(true);
                return true;
            }
            if (action != 1 && action != 3) {
                return false;
            }
            ShowApp.this.h(false);
            return true;
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ShowApp.this.e();
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ShowApp.this.f459g == null) {
                ShowApp.this.o();
                n2.d().postDelayed(ShowApp.this.j, 2000L);
            }
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            n2.d().removeCallbacks(ShowApp.this.j);
            ShowApp showApp = ShowApp.this;
            showApp.f(showApp.f459g);
            MainService mainService = MainService.instance;
            if (mainService == null || (view = mainService.f213c) == null) {
                return;
            }
            View view2 = mainService.f214d;
            if (view2 != null && MainService.instance.n != null) {
                ShowApp showApp2 = ShowApp.this;
                if (showApp2.l(view2, showApp2.f454b)) {
                    ShowApp.this.h = view2;
                }
            }
            ShowApp showApp3 = ShowApp.this;
            if (showApp3.l(view, showApp3.f454b)) {
                ShowApp.this.f459g = view;
            }
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View view = ShowApp.this.f459g;
            if (view == null) {
                return;
            }
            if (MainService.instance.f213c == null || MainService.instance.n == null) {
                ShowApp.this.f(view);
            }
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ShowApp showApp = ShowApp.this;
            if (showApp.b(showApp.i)) {
                ShowApp.this.i = null;
            }
            MainService mainService = MainService.instance;
            if (mainService == null) {
                return;
            }
            View view = mainService.f217g;
            ShowApp showApp2 = ShowApp.this;
            if (showApp2.l(view, showApp2.f454b)) {
                ShowApp.this.i = view;
            }
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ShowApp showApp = ShowApp.this;
            if (showApp.b(showApp.i)) {
                ShowApp.this.i = null;
            }
        }
    }

    class j implements Runnable {
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
            if (ShowApp.this.f458f) {
                ShowApp showApp = ShowApp.this;
                if (showApp.b(showApp)) {
                    ShowApp.this.f458f = false;
                }
            }
            ShowApp showApp2 = ShowApp.this;
            if (showApp2.l(showApp2, showApp2.f453a)) {
                ShowApp.this.f458f = true;
            }
        }
    }

    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ShowApp.this.f457e) {
                ShowApp showApp = ShowApp.this;
                if (showApp.b(showApp.f455c)) {
                    ShowApp.this.f457e = false;
                }
            }
            ShowApp showApp2 = ShowApp.this;
            if (showApp2.l(showApp2.f455c, showApp2.f456d)) {
                ShowApp.this.f457e = true;
            }
        }
    }

    static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference f472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f474c;

        public l(WeakReference weakReference, boolean z, float f2) {
            this.f472a = weakReference;
            this.f473b = z;
            this.f474c = f2;
        }
    }

    public ShowApp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f457e = false;
        this.f458f = false;
        this.f459g = null;
        this.h = null;
        this.i = null;
        if (!isInEditMode()) {
            TextView textView = new TextView(getContext());
            this.f455c = textView;
            try {
                textView.setGravity(17);
            } catch (NoSuchMethodError e2) {
                e1.a(e2);
            }
            textView.setText(Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2grzqordg"));
            textView.setBackgroundColor(-16777216);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f454b = layoutParams;
            layoutParams.type = m2.c();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -2;
            layoutParams.gravity = 51;
            layoutParams.x = -10000;
            layoutParams.y = -10000;
            layoutParams.flags = 8;
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
            this.f453a = layoutParams2;
            layoutParams2.type = m2.c();
            layoutParams2.width = (int) Tools.G(60.0f);
            layoutParams2.height = (int) Tools.G(20.0f);
            layoutParams2.format = -2;
            layoutParams2.gravity = 51;
            layoutParams2.x = 10000;
            layoutParams2.y = 10000;
            layoutParams2.flags = 264;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
            this.f456d = layoutParams3;
            layoutParams3.type = m2.b();
            layoutParams3.width = -2;
            layoutParams3.height = -2;
            layoutParams3.format = -2;
            layoutParams3.gravity = 49;
            layoutParams3.x = 0;
            layoutParams3.y = -1000;
            layoutParams3.flags = 24;
            setOnTouchListener(new c());
        }
        this.j = new d();
    }

    public static void i(Window window) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        ArrayList<l> arrayList = k;
        ArrayList arrayList2 = new ArrayList();
        for (l lVar : arrayList) {
            Window window2 = (Window) lVar.f472a.get();
            if (window2 != null && window2 != window) {
                arrayList2.add(lVar);
            }
        }
        arrayList2.add(new l(new WeakReference(window), (attributes.flags & 2) != 0, attributes.dimAmount));
        k = arrayList2;
        arrayList.clear();
        arrayList.trimToSize();
    }

    private void j(View view, float f2) {
        if (view != null) {
            try {
                view.setAlpha(f2);
            } catch (Throwable th) {
                e1.s("Failed set transparency", th);
            }
        }
    }

    public void a(boolean z) {
        if (z) {
            e();
        } else {
            n2.d().postDelayed(this.j, 2000L);
        }
        n2.i(new b(z));
    }

    boolean b(View view) {
        if (view != null) {
            try {
                if (view instanceof FloatPanel) {
                    ((FloatPanel) view).e();
                } else {
                    Tools.n1(view);
                }
                return true;
            } catch (Throwable th) {
                e1.s("Failed remove view " + view, th);
            }
        }
        return false;
    }

    public void c() {
        e();
        n2.i(new a());
    }

    public void d() {
        n2.i(new i());
    }

    public void e() {
        n2.i(new g());
    }

    void f(View view) {
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
        n2.i(new e());
    }

    void h(boolean z) {
        Iterator it = k.iterator();
        while (true) {
            float f2 = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            l lVar = (l) it.next();
            Window window = (Window) lVar.f472a.get();
            if (window != null) {
                try {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.alpha = z ? 0.0f : 1.0f;
                    if (lVar.f473b) {
                        attributes.flags = z ? attributes.flags & (-3) : attributes.flags | 2;
                        if (!z) {
                            f2 = lVar.f474c;
                        }
                        attributes.dimAmount = f2;
                    }
                    window.setAttributes(attributes);
                } catch (Throwable th) {
                    e1.s("Failed set transparency", th);
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
        n2.i(new j());
    }

    boolean l(View view, WindowManager.LayoutParams layoutParams) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        try {
            if (view instanceof FloatPanel) {
                ((FloatPanel) view).m();
            } else {
                Tools.g(view, layoutParams);
            }
            z = true;
            view.setAlpha(1.0f);
            return true;
        } catch (Throwable th) {
            e1.s("Failed add view " + view, th);
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
        n2.i(new k());
    }

    public void n() {
        n2.i(new h());
    }

    public void o() {
        n2.i(new f());
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
