/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.b;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Context;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.e1;
import android.ext.i;
import android.ext.l2;
import android.ext.n0;
import android.ext.r;
import android.ext.t;
import android.os.Bundle;

public abstract class u
extends Instrumentation {
    public static volatile boolean a = false;
    public static volatile u b;

    static {
        e1.d("Instrumentation clinit");
        i.a();
        n0.f();
    }

    public u() {
        b = this;
        e1.d("Instrumentation init");
        n0.f();
    }

    public static void a() {
        u u3 = b;
        if (u3 != null) {
            u3.finish(0, new Bundle());
        }
    }

    public static boolean c() {
        return a;
    }

    public Context b(boolean bl) {
        Context context = bl ? this.getTargetContext() : this.getContext();
        Context context2 = !bl ? this.getTargetContext() : this.getContext();
        Context context3 = context;
        if (context == null) {
            context3 = context2;
        }
        return a.b.i(context3);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r.K(bundle);
        Tools.X0(this.getTargetContext());
        Tools.X0(this.getContext());
        if (MainService.context == null) {
            MainService.context = l2.i(this.b(false));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Instrumentation onCreate ");
        stringBuilder.append(bundle);
        e1.d(stringBuilder.toString());
        n0.f();
        b = this;
        a = true;
        this.start();
    }

    public void onDestroy() {
        t.a();
        super.onDestroy();
    }

    public boolean onException(Object object, Throwable throwable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Instrumentation onException: ");
        stringBuilder.append(object);
        e1.s(stringBuilder.toString(), throwable);
        return super.onException(object, throwable);
    }

    public void onStart() {
        super.onStart();
        String string2 = r.t();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Instrumentation onStart ");
        stringBuilder.append(string2);
        e1.d(stringBuilder.toString());
        stringBuilder = this.b(true);
        String string3 = stringBuilder.getPackageName();
        Tools.w1(100, new ComponentName(string3, string2), 1);
        stringBuilder.startActivity(Tools.N0((Context)stringBuilder, string3, string2));
    }
}

