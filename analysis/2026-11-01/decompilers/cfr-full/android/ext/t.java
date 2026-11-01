/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.b;
import android.content.Context;
import android.ext.MainService;
import android.ext.e1;
import android.ext.n2;
import android.ext.u;
import android.ext.v;

public abstract class t {
    public static void a() {
        e1.d("Bootstrap onDestroy");
        n2.i(new Runnable(){

            @Override
            public void run() {
                try {
                    if (MainService.instance != null) {
                        MainService.instance.b0();
                    }
                }
                catch (Throwable throwable) {
                    e1.s("MainService onDestroy fail", throwable);
                }
            }
        });
    }

    public static void b(Context context) {
        if (MainService.instance != null) {
            e1.d("Bootstrap start: already");
        }
        new MainService(b.i(context));
        n2.i(new Runnable(){

            @Override
            public void run() {
                Throwable throwable2;
                block3: {
                    block2: {
                        try {
                            if (MainService.instance == null) break block2;
                            MainService.instance.Z();
                        }
                        catch (Throwable throwable2) {
                            break block3;
                        }
                    }
                    return;
                }
                e1.s("MainService onCreate fail", throwable2);
                throw throwable2;
            }
        });
    }

    public static void c() {
        e1.d("Bootstrap startService");
        if (MainService.instance != null) {
            e1.d("Bootstrap startService: already");
            return;
        }
        Object object = u.c() ? u.b.b(false) : (v.a != null ? v.a : MainService.context);
        if (object != null) {
            t.b(object);
        } else {
            e1.p("Bootstrap startService: null");
        }
    }
}

