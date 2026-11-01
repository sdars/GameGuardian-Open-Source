/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.content.Context;
import android.ext.FloatPanel;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.e1;
import android.ext.m2;
import android.ext.n2;
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

public class ShowApp
extends ImageView {
    private static ArrayList k = new ArrayList();
    WindowManager.LayoutParams a;
    WindowManager.LayoutParams b;
    TextView c;
    WindowManager.LayoutParams d;
    volatile boolean e = false;
    volatile boolean f = false;
    volatile View g = null;
    volatile View h = null;
    volatile View i = null;
    final Runnable j;

    public ShowApp(Context context, AttributeSet object) {
        super(context, (AttributeSet)object);
        if (!this.isInEditMode()) {
            object = new TextView(this.getContext());
            this.c = object;
            try {
                object.setGravity(17);
            }
            catch (NoSuchMethodError noSuchMethodError) {
                e1.a(noSuchMethodError);
            }
            object.setText((CharSequence)Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2grzqordg"));
            object.setBackgroundColor(-16777216);
            context = new WindowManager.LayoutParams();
            this.b = context;
            context.type = m2.c();
            context.width = -2;
            context.height = -2;
            context.format = -2;
            context.gravity = 51;
            context.x = -10000;
            context.y = -10000;
            context.flags = 8;
            context = new WindowManager.LayoutParams();
            this.a = context;
            context.type = m2.c();
            context.width = (int)Tools.G(60.0f);
            context.height = (int)Tools.G(20.0f);
            context.format = -2;
            context.gravity = 51;
            context.x = 10000;
            context.y = 10000;
            context.flags = 264;
            context = new WindowManager.LayoutParams();
            this.d = context;
            context.type = m2.b();
            context.width = -2;
            context.height = -2;
            context.format = -2;
            context.gravity = 49;
            context.x = 0;
            context.y = -1000;
            context.flags = 24;
            this.setOnTouchListener(new View.OnTouchListener(this){
                final ShowApp a;
                {
                    this.a = showApp;
                }

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int n3 = motionEvent.getAction();
                    if (n3 != 0) {
                        if (n3 != 1 && n3 != 3) {
                            return false;
                        }
                        this.a.h(false);
                        return true;
                    }
                    this.a.h(true);
                    return true;
                }
            });
        }
        this.j = new Runnable(this){
            final ShowApp a;
            {
                this.a = showApp;
            }

            @Override
            public void run() {
                this.a.e();
            }
        };
    }

    public static void i(Window object) {
        WindowManager.LayoutParams layoutParams = object.getAttributes();
        ArrayList arrayList = k;
        ArrayList<l> arrayList2 = new ArrayList<l>();
        for (l l3 : arrayList) {
            Window window = (Window)l3.a.get();
            if (window == null || window == object) continue;
            arrayList2.add(l3);
        }
        object = new WeakReference<Window>((Window)object);
        boolean bl = (layoutParams.flags & 2) != 0;
        arrayList2.add(new l((WeakReference)object, bl, layoutParams.dimAmount));
        k = arrayList2;
        arrayList.clear();
        arrayList.trimToSize();
    }

    private void j(View view, float f4) {
        if (view != null) {
            try {
                view.setAlpha(f4);
            }
            catch (Throwable throwable) {
                e1.s("Failed set transparency", throwable);
            }
        }
    }

    public void a(boolean bl) {
        if (bl) {
            this.e();
        } else {
            n2.d().postDelayed(this.j, 2000L);
        }
        n2.i(new Runnable(this, bl){
            final boolean a;
            final ShowApp b;
            {
                this.b = showApp;
                this.a = bl;
            }

            @Override
            public void run() {
                ShowApp showApp = this.b;
                if (showApp.b((View)showApp)) {
                    this.b.f = false;
                }
                if (!this.a && (showApp = this.b).b(showApp.h)) {
                    this.b.h = null;
                }
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    boolean b(View view) {
        Throwable throwable2;
        block3: {
            block2: {
                if (view == null) return false;
                try {
                    if (!(view instanceof FloatPanel)) break block2;
                    ((FloatPanel)view).e();
                    return true;
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            Tools.n1(view);
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed remove view ");
        stringBuilder.append(view);
        e1.s(stringBuilder.toString(), throwable2);
        return false;
    }

    public void c() {
        this.e();
        n2.i(new Runnable(this){
            final ShowApp a;
            {
                this.a = showApp;
            }

            @Override
            public void run() {
                if (!this.a.e) {
                    return;
                }
                ShowApp showApp = this.a;
                if (showApp.b((View)showApp.c)) {
                    this.a.e = false;
                }
            }
        });
    }

    public void d() {
        n2.i(new Runnable(this){
            final ShowApp a;
            {
                this.a = showApp;
            }

            @Override
            public void run() {
                ShowApp showApp = this.a;
                if (showApp.b(showApp.i)) {
                    this.a.i = null;
                }
            }
        });
    }

    public void e() {
        n2.i(new Runnable(this){
            final ShowApp a;
            {
                this.a = showApp;
            }

            @Override
            public void run() {
                View view = this.a.g;
                if (view == null) {
                    return;
                }
                if (MainService.instance.c != null && MainService.instance.n != null) {
                    return;
                }
                this.a.f(view);
            }
        });
    }

    void f(View view) {
        if (view != null) {
            if (this.b(view)) {
                this.g = null;
            }
            if (this.b(this.h)) {
                this.h = null;
            }
        }
    }

    public void g() {
        n2.i(new Runnable(this){
            final ShowApp a;
            {
                this.a = showApp;
            }

            @Override
            public void run() {
                if (this.a.g == null) {
                    this.a.o();
                    n2.d().postDelayed(this.a.j, 2000L);
                }
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void h(boolean bl) {
        float f4;
        Iterator iterator = k.iterator();
        while (true) {
            Throwable throwable2;
            block8: {
                WindowManager.LayoutParams layoutParams;
                Window window;
                block7: {
                    int n3;
                    boolean bl2 = iterator.hasNext();
                    f4 = 1.0f;
                    float f5 = 0.0f;
                    if (!bl2) break;
                    l l3 = (l)iterator.next();
                    window = (Window)l3.a.get();
                    if (window == null) continue;
                    try {
                        layoutParams = window.getAttributes();
                        if (bl) {
                            f4 = 0.0f;
                        }
                        layoutParams.alpha = f4;
                        if (l3.b) {
                            n3 = bl ? layoutParams.flags & 0xFFFFFFFD : layoutParams.flags | 2;
                        }
                        break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    layoutParams.flags = n3;
                    f4 = bl ? f5 : l3.c;
                    layoutParams.dimAmount = f4;
                }
                window.setAttributes(layoutParams);
                continue;
            }
            e1.s("Failed set transparency", throwable2);
        }
        if (bl) {
            f4 = 0.0f;
        }
        if (this.e) {
            this.j((View)this.c, f4);
        }
        this.j(this.g, f4);
        this.j(this.h, f4);
        this.j(this.i, f4);
    }

    public void k() {
        this.o();
        this.n();
        n2.i(new Runnable(this){
            final ShowApp a;
            {
                this.a = showApp;
            }

            @Override
            public void run() {
                ShowApp showApp;
                if (this.a.f && (showApp = this.a).b((View)showApp)) {
                    this.a.f = false;
                }
                if ((showApp = this.a).l((View)showApp, showApp.a)) {
                    this.a.f = true;
                }
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    boolean l(View view, WindowManager.LayoutParams layoutParams) {
        Throwable throwable2;
        boolean bl;
        block4: {
            boolean bl2;
            block3: {
                block2: {
                    bl = false;
                    bl2 = false;
                    if (view == null) return bl;
                    bl = bl2;
                    try {
                        if (!(view instanceof FloatPanel)) break block2;
                        bl = bl2;
                        ((FloatPanel)view).m();
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                bl = bl2;
                Tools.g(view, layoutParams);
            }
            bl2 = true;
            bl = true;
            view.setAlpha(1.0f);
            return bl2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed add view ");
        stringBuilder.append(view);
        e1.s(stringBuilder.toString(), throwable2);
        return bl;
    }

    public void m() {
        if (this.g == null) {
            this.o();
        }
        if (this.i == null) {
            this.n();
        }
        n2.i(new Runnable(this){
            final ShowApp a;
            {
                this.a = showApp;
            }

            @Override
            public void run() {
                ShowApp showApp;
                if (this.a.e && (showApp = this.a).b((View)showApp.c)) {
                    this.a.e = false;
                }
                if ((showApp = this.a).l((View)showApp.c, showApp.d)) {
                    this.a.e = true;
                }
            }
        });
    }

    public void n() {
        n2.i(new Runnable(this){
            final ShowApp a;
            {
                this.a = showApp;
            }

            @Override
            public void run() {
                Object object = this.a;
                if (object.b(object.i)) {
                    this.a.i = null;
                }
                if ((object = MainService.instance) == null) {
                    return;
                }
                ShowApp showApp = this.a;
                object = ((MainService)object).g;
                if (showApp.l((View)object, showApp.b)) {
                    this.a.i = object;
                }
            }
        });
    }

    public void o() {
        n2.i(new Runnable(this){
            final ShowApp a;
            {
                this.a = showApp;
            }

            @Override
            public void run() {
                n2.d().removeCallbacks(this.a.j);
                ShowApp showApp = this.a;
                showApp.f(showApp.g);
                Object object = MainService.instance;
                if (object == null) {
                    return;
                }
                showApp = ((MainService)object).c;
                if (showApp == null) {
                    return;
                }
                View view = ((MainService)object).d;
                if (view != null && MainService.instance.n != null && ((ShowApp)((Object)(object = this.a))).l(view, ((ShowApp)((Object)object)).b)) {
                    this.a.h = view;
                }
                if (((ShowApp)((Object)(object = this.a))).l((View)showApp, ((ShowApp)((Object)object)).b)) {
                    this.a.g = showApp;
                }
            }
        });
    }

    public void p() {
        if (this.g != null) {
            this.o();
        }
        if (this.i != null) {
            this.n();
        }
        if (this.f) {
            this.k();
        }
    }

    static class l {
        WeakReference a;
        boolean b;
        float c;

        public l(WeakReference weakReference, boolean bl, float f4) {
            this.a = weakReference;
            this.b = bl;
            this.c = f4;
        }
    }
}

