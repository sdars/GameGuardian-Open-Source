/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import a.b;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.ext.Config;
import android.ext.MainService;
import android.ext.Tools;
import android.ext.e1;
import android.ext.f1;
import android.ext.f2;
import android.ext.l2;
import android.ext.n0;
import android.ext.r;
import android.ext.s1;
import android.ext.t;
import android.ext.u;
import android.os.IBinder;
import catch_.me_.if_.you_.can_.AnalyticsService;
import java.io.Serializable;

public abstract class v
extends Service {
    public static volatile v a;
    public static volatile boolean b = false;
    public static volatile Runnable c;
    public static volatile boolean d = false;
    public static volatile boolean e = false;

    public v() {
        a = this;
    }

    private void a() {
        if (!e && d) {
            String[] stringArray = n0.e();
            for (int i3 = 2; i3 < stringArray.length; i3 += 2) {
                String string2 = stringArray[i3];
                if (!Tools.e1(stringArray[i3 + 1])) continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("BootstrapService stop: ");
                stringBuilder.append(string2);
                RuntimeException runtimeException = new RuntimeException(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                stringBuilder.append("Found: ");
                stringBuilder.append(string2);
                e1.s(stringBuilder.toString(), runtimeException);
                n0.m(Thread.currentThread(), runtimeException);
            }
        }
    }

    private void b() {
        Tools.X0((Context)this);
        if (d) {
            if (MainService.context == null) {
                MainService.context = l2.i((Context)this);
            }
            n0.f();
        }
    }

    void c() {
        try {
            this.stopForeground(true);
            e1.d("BootstrapService stopForeground");
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
        try {
            CharSequence charSequence = Tools.C0();
            Intent intent = new Intent();
            boolean bl = this.stopService(intent.setClassName((String)charSequence, AnalyticsService.class.getName()));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("BootstrapService stop: ");
            ((StringBuilder)charSequence).append(bl);
            e1.d(((StringBuilder)charSequence).toString());
        }
        catch (Throwable throwable) {
            e1.l("Failed stop Service", throwable);
        }
    }

    public SharedPreferences getSharedPreferences(String string2, int n3) {
        return f2.a(super.getSharedPreferences(string2, n3));
    }

    public IBinder onBind(Intent intent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BootstrapService onBind: ");
        stringBuilder.append(intent);
        e1.d(stringBuilder.toString());
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BootstrapService onConfigurationChanged: ");
        stringBuilder.append(configuration);
        e1.d(stringBuilder.toString());
        if (!b) {
            return;
        }
        configuration = a.b.f(configuration);
        super.onConfigurationChanged(configuration);
        MainService.Y(configuration);
    }

    public void onCreate() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BootstrapService onCreate: ");
        stringBuilder.append(b);
        stringBuilder.append('-');
        stringBuilder.append(d);
        stringBuilder.append("; ");
        stringBuilder.append((Object)a);
        stringBuilder.append("; ");
        stringBuilder.append((Object)this);
        e1.d(stringBuilder.toString());
        if (!b) {
            if (r.o((Context)this)) {
                b = true;
                a = this;
                super.onCreate();
                this.b();
                s1.w();
                r.J((Context)this, 1000L);
                return;
            }
            this.c();
            return;
        }
        a = this;
        super.onCreate();
        this.b();
    }

    public void onDestroy() {
        if (c != null) {
            e1.e.a("AndroidService", "wait 3");
            c.run();
            return;
        }
        if (!b) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("BootstrapService onDestroy 1: ");
            stringBuilder.append(b);
            stringBuilder.append('-');
            stringBuilder.append(e);
            e1.d(stringBuilder.toString());
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BootstrapService onDestroy 2: ");
        stringBuilder.append(b);
        stringBuilder.append('-');
        stringBuilder.append(e);
        e1.g(stringBuilder.toString(), new RuntimeException());
        this.a();
        this.stopForeground(true);
        if (!u.c()) {
            t.a();
        }
        super.onDestroy();
    }

    public void onLowMemory() {
        e1.d("BootstrapService onLowMemory");
        if (!b) {
            return;
        }
        super.onLowMemory();
        MainService.t0(-1);
    }

    public void onRebind(Intent intent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BootstrapService onRebind: ");
        stringBuilder.append(intent);
        e1.d(stringBuilder.toString());
        super.onRebind(intent);
    }

    public void onStart(Intent intent, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BootstrapService onStart: ");
        stringBuilder.append(n3);
        stringBuilder.append("; ");
        stringBuilder.append(intent);
        e1.d(stringBuilder.toString());
        super.onStart(intent, n3);
    }

    public int onStartCommand(Intent intent, int n3, int n4) {
        Serializable serializable = new StringBuilder();
        serializable.append("BootstrapService onStartCommand: ");
        serializable.append(b);
        serializable.append('-');
        serializable.append(d);
        serializable.append("; ");
        serializable.append((Object)a);
        serializable.append("; ");
        serializable.append((Object)this);
        serializable.append("; ");
        serializable.append(MainService.context);
        e1.d(serializable.toString());
        serializable = new StringBuilder();
        serializable.append("BootstrapService onStartCommand: ");
        serializable.append(n4);
        serializable.append(' ');
        serializable.append(n3);
        serializable.append(' ');
        serializable.append(intent);
        e1.d(serializable.toString());
        if (!b) {
            this.c();
            return 2;
        }
        this.b();
        if (d) {
            f1.D();
            int n5 = Config.vSpaceReal ? 4 : 2;
            serializable = null;
            for (int i3 = 0; i3 < n5; ++i3) {
                boolean bl;
                boolean bl2;
                Object object;
                try {
                    object = MainService.instance;
                    bl2 = i3 % 2 == 0;
                    bl = i3 >= 2;
                }
                catch (Throwable throwable) {
                    if (serializable != null) {
                        throwable.addSuppressed((Throwable)serializable);
                    }
                    if (i3 == n5 - 1) {
                        e1.s("Failed startForeground", throwable);
                        n0.h(Thread.currentThread(), throwable, false);
                    }
                    serializable = throwable;
                    continue;
                }
                this.startForeground(1, ((MainService)object).F(bl2, bl));
                object = new StringBuilder();
                ((StringBuilder)object).append("startForeground 1.");
                ((StringBuilder)object).append(i3);
                e1.d(((StringBuilder)object).toString());
                break;
            }
        }
        return super.onStartCommand(intent, n3, n4);
    }

    public void onTaskRemoved(Intent intent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BootstrapService onTaskRemoved: ");
        stringBuilder.append(b);
        stringBuilder.append('-');
        stringBuilder.append(e);
        stringBuilder.append('-');
        stringBuilder.append(d);
        stringBuilder.append("; ");
        stringBuilder.append(intent);
        e1.g(stringBuilder.toString(), new RuntimeException());
        if (!b) {
            return;
        }
        this.a();
        super.onTaskRemoved(intent);
    }

    public void onTrimMemory(int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BootstrapService onTrimMemory: ");
        stringBuilder.append(n3);
        e1.d(stringBuilder.toString());
        if (!b) {
            return;
        }
        super.onTrimMemory(n3);
        MainService.t0(n3);
    }

    public boolean onUnbind(Intent intent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BootstrapService onUnbind: ");
        stringBuilder.append(intent);
        e1.d(stringBuilder.toString());
        return super.onUnbind(intent);
    }
}

