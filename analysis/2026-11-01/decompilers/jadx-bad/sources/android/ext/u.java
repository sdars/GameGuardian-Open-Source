package android.ext;

import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class u extends Instrumentation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f1266a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile u f1267b;

    static {
        e1.d("Instrumentation clinit");
        i.a();
        n0.f();
    }

    public u() {
        f1267b = this;
        e1.d("Instrumentation init");
        n0.f();
    }

    public static void a() {
        u uVar = f1267b;
        if (uVar != null) {
            uVar.finish(0, new Bundle());
        }
    }

    public static boolean c() {
        return f1266a;
    }

    public Context b(boolean z) {
        Context targetContext = z ? getTargetContext() : getContext();
        Context targetContext2 = !z ? getTargetContext() : getContext();
        if (targetContext == null) {
            targetContext = targetContext2;
        }
        return a.b.i(targetContext);
    }

    @Override // android.app.Instrumentation
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r.K(bundle);
        Tools.X0(getTargetContext());
        Tools.X0(getContext());
        if (MainService.context == null) {
            MainService.context = l2.i(b(false));
        }
        e1.d("Instrumentation onCreate " + bundle);
        n0.f();
        f1267b = this;
        f1266a = true;
        start();
    }

    @Override // android.app.Instrumentation
    public void onDestroy() {
        t.a();
        super.onDestroy();
    }

    @Override // android.app.Instrumentation
    public boolean onException(Object obj, Throwable th) {
        e1.s("Instrumentation onException: " + obj, th);
        return super.onException(obj, th);
    }

    @Override // android.app.Instrumentation
    public void onStart() {
        super.onStart();
        String strT = r.t();
        e1.d("Instrumentation onStart " + strT);
        Context contextB = b(true);
        String packageName = contextB.getPackageName();
        Tools.w1(100, new ComponentName(packageName, strT), 1);
        contextB.startActivity(Tools.N0(contextB, packageName, strT));
    }
}
