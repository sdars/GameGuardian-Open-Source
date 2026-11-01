package android.ext;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static void a() {
        e1.d("Bootstrap onDestroy");
        n2.i(new t$b());
    }

    public static void b(Context context) {
        if (MainService.instance != null) {
            e1.d("Bootstrap start: already");
        }
        new MainService(a.b.i(context));
        n2.i(new t$a());
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
