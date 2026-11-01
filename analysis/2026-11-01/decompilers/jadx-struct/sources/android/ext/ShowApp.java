package android.ext;

import android.content.Context;
import android.fix.ImageView;
import android.fix.TextView;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ShowApp extends ImageView {
    private static ArrayList k = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WindowManager$LayoutParams f453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    WindowManager$LayoutParams f454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    TextView f455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    WindowManager$LayoutParams f456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile boolean f457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile boolean f458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile View f459g;
    volatile View h;
    volatile View i;
    final Runnable j;

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
            WindowManager$LayoutParams windowManager$LayoutParams = new WindowManager$LayoutParams();
            this.f454b = windowManager$LayoutParams;
            windowManager$LayoutParams.type = m2.c();
            windowManager$LayoutParams.width = -2;
            windowManager$LayoutParams.height = -2;
            windowManager$LayoutParams.format = -2;
            windowManager$LayoutParams.gravity = 51;
            windowManager$LayoutParams.x = -10000;
            windowManager$LayoutParams.y = -10000;
            windowManager$LayoutParams.flags = 8;
            WindowManager$LayoutParams windowManager$LayoutParams2 = new WindowManager$LayoutParams();
            this.f453a = windowManager$LayoutParams2;
            windowManager$LayoutParams2.type = m2.c();
            windowManager$LayoutParams2.width = (int) Tools.G(60.0f);
            windowManager$LayoutParams2.height = (int) Tools.G(20.0f);
            windowManager$LayoutParams2.format = -2;
            windowManager$LayoutParams2.gravity = 51;
            windowManager$LayoutParams2.x = 10000;
            windowManager$LayoutParams2.y = 10000;
            windowManager$LayoutParams2.flags = 264;
            WindowManager$LayoutParams windowManager$LayoutParams3 = new WindowManager$LayoutParams();
            this.f456d = windowManager$LayoutParams3;
            windowManager$LayoutParams3.type = m2.b();
            windowManager$LayoutParams3.width = -2;
            windowManager$LayoutParams3.height = -2;
            windowManager$LayoutParams3.format = -2;
            windowManager$LayoutParams3.gravity = 49;
            windowManager$LayoutParams3.x = 0;
            windowManager$LayoutParams3.y = -1000;
            windowManager$LayoutParams3.flags = 24;
            setOnTouchListener(new ShowApp$c(this));
        }
        this.j = new ShowApp$d(this);
    }

    public static void i(Window window) {
        WindowManager$LayoutParams attributes = window.getAttributes();
        ArrayList<ShowApp$l> arrayList = k;
        ArrayList arrayList2 = new ArrayList();
        for (ShowApp$l showApp$l : arrayList) {
            Window window2 = (Window) showApp$l.f472a.get();
            if (window2 != null && window2 != window) {
                arrayList2.add(showApp$l);
            }
        }
        arrayList2.add(new ShowApp$l(new WeakReference(window), (attributes.flags & 2) != 0, attributes.dimAmount));
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
        n2.i(new ShowApp$b(this, z));
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
        n2.i(new ShowApp$a(this));
    }

    public void d() {
        n2.i(new ShowApp$i(this));
    }

    public void e() {
        n2.i(new ShowApp$g(this));
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
        n2.i(new ShowApp$e(this));
    }

    void h(boolean z) {
        Iterator it = k.iterator();
        while (true) {
            float f2 = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            ShowApp$l showApp$l = (ShowApp$l) it.next();
            Window window = (Window) showApp$l.f472a.get();
            if (window != null) {
                try {
                    WindowManager$LayoutParams attributes = window.getAttributes();
                    attributes.alpha = z ? 0.0f : 1.0f;
                    if (showApp$l.f473b) {
                        attributes.flags = z ? attributes.flags & (-3) : attributes.flags | 2;
                        if (!z) {
                            f2 = showApp$l.f474c;
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
        n2.i(new ShowApp$j(this));
    }

    boolean l(View view, WindowManager$LayoutParams windowManager$LayoutParams) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        try {
            if (view instanceof FloatPanel) {
                ((FloatPanel) view).m();
            } else {
                Tools.g(view, windowManager$LayoutParams);
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
        n2.i(new ShowApp$k(this));
    }

    public void n() {
        n2.i(new ShowApp$h(this));
    }

    public void o() {
        n2.i(new ShowApp$f(this));
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
