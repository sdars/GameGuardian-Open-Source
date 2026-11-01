package android.ext;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (android.ext.MainService.instance != null) {
                    android.ext.MainService.instance.Z();
                }
            } catch (java.lang.Throwable th) {
                android.ext.e1.s("MainService onCreate fail", th);
                throw th;
            }
        }
    }

    class b implements java.lang.Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (android.ext.MainService.instance != null) {
                    android.ext.MainService.instance.b0();
                }
            } catch (java.lang.Throwable th) {
                android.ext.e1.s("MainService onDestroy fail", th);
            }
        }
    }

    public static void a() {
        android.ext.e1.d("Bootstrap onDestroy");
        android.ext.n2.i(new android.ext.t.b());
    }

    public static void b(android.content.Context context) {
        if (android.ext.MainService.instance != null) {
            android.ext.e1.d("Bootstrap start: already");
        }
        new android.ext.MainService(gga.b.i(context));
        android.ext.n2.i(new android.ext.t.a());
    }

    public static void c() {
        android.content.Context contextB;
        android.ext.e1.d("Bootstrap startService");
        if (android.ext.MainService.instance != null) {
            android.ext.e1.d("Bootstrap startService: already");
            return;
        }
        if (android.ext.u.c()) {
            contextB = android.ext.u.f1267b.b(false);
        } else {
            contextB = android.ext.v.f1277a != null ? android.ext.v.f1277a : android.ext.MainService.context;
        }
        if (contextB != null) {
            b(contextB);
        } else {
            android.ext.e1.p("Bootstrap startService: null");
        }
    }
}
