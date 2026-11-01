package android.ext;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (MainService.instance != null) {
                    MainService.instance.Z();
                }
            } catch (Throwable th) {
                e1.s("MainService onCreate fail", th);
                throw th;
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (MainService.instance != null) {
                    MainService.instance.b0();
                }
            } catch (Throwable th) {
                e1.s("MainService onDestroy fail", th);
            }
        }
    }

    public static void a() {
        e1.d("Bootstrap onDestroy");
        n2.i(new b());
    }

    public static void b(Context context) {
        if (MainService.instance != null) {
            e1.d("Bootstrap start: already");
        }
        new MainService(gga.b.i(context));
        n2.i(new a());
    }

    public static void c() {
        Context contextB;
        e1.d("Bootstrap startService");
        if (MainService.instance != null) {
            e1.d("Bootstrap startService: already");
            return;
        }
        if (u.c()) {
            contextB = u.f1267b.b(false);
        } else {
            contextB = v.f1277a != null ? v.f1277a : MainService.context;
        }
        if (contextB != null) {
            b(contextB);
        } else {
            e1.p("Bootstrap startService: null");
        }
    }
}
