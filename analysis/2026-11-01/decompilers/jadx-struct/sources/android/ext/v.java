package android.ext;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.IBinder;
import catch_.me_.if_.you_.can_.AnalyticsService;

/* JADX INFO: loaded from: classes.dex */
public abstract class v extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile v f1277a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f1278b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Runnable f1279c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile boolean f1280d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile boolean f1281e = false;

    public v() {
        f1277a = this;
    }

    private void a() {
        if (f1281e || !f1280d) {
            return;
        }
        String[] strArrE = n0.e();
        for (int i = 2; i < strArrE.length; i += 2) {
            String str = strArrE[i];
            if (Tools.e1(strArrE[i + 1])) {
                RuntimeException runtimeException = new RuntimeException("BootstrapService stop: " + str);
                e1.s("Found: " + str, runtimeException);
                n0.m(Thread.currentThread(), runtimeException);
            }
        }
    }

    private void b() {
        Tools.X0(this);
        if (f1280d) {
            if (MainService.context == null) {
                MainService.context = l2.i(this);
            }
            n0.f();
        }
    }

    void c() {
        try {
            stopForeground(true);
            e1.d("BootstrapService stopForeground");
        } catch (Throwable th) {
            e1.a(th);
        }
        try {
            e1.d("BootstrapService stop: " + stopService(new Intent().setClassName(Tools.C0(), AnalyticsService.class.getName())));
        } catch (Throwable th2) {
            e1.l("Failed stop Service", th2);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public SharedPreferences getSharedPreferences(String str, int i) {
        return f2.a(super.getSharedPreferences(str, i));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        e1.d("BootstrapService onBind: " + intent);
        return null;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        e1.d("BootstrapService onConfigurationChanged: " + configuration);
        if (f1278b) {
            Configuration configurationF = a.b.f(configuration);
            super.onConfigurationChanged(configurationF);
            MainService.Y(configurationF);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        e1.d("BootstrapService onCreate: " + f1278b + '-' + f1280d + "; " + f1277a + "; " + this);
        if (f1278b) {
            f1277a = this;
            super.onCreate();
            b();
        } else {
            if (!r.o(this)) {
                c();
                return;
            }
            f1278b = true;
            f1277a = this;
            super.onCreate();
            b();
            s1.w();
            r.J(this, 1000L);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (f1279c != null) {
            e1$e.a("AndroidService", "wait 3");
            f1279c.run();
            return;
        }
        if (!f1278b) {
            e1.d("BootstrapService onDestroy 1: " + f1278b + '-' + f1281e);
            return;
        }
        e1.g("BootstrapService onDestroy 2: " + f1278b + '-' + f1281e, new RuntimeException());
        a();
        stopForeground(true);
        if (!u.c()) {
            t.a();
        }
        super.onDestroy();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        e1.d("BootstrapService onLowMemory");
        if (f1278b) {
            super.onLowMemory();
            MainService.t0(-1);
        }
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        e1.d("BootstrapService onRebind: " + intent);
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        e1.d("BootstrapService onStart: " + i + "; " + intent);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        e1.d("BootstrapService onStartCommand: " + f1278b + '-' + f1280d + "; " + f1277a + "; " + this + "; " + MainService.context);
        StringBuilder sb = new StringBuilder();
        sb.append("BootstrapService onStartCommand: ");
        sb.append(i2);
        sb.append(' ');
        sb.append(i);
        sb.append(' ');
        sb.append(intent);
        e1.d(sb.toString());
        if (!f1278b) {
            c();
            return 2;
        }
        b();
        if (f1280d) {
            f1.D();
            int i3 = Config.vSpaceReal ? 4 : 2;
            Throwable th = null;
            int i4 = 0;
            while (i4 < i3) {
                try {
                    startForeground(1, MainService.instance.F(i4 % 2 == 0, i4 >= 2));
                    e1.d("startForeground 1." + i4);
                    break;
                } catch (Throwable th2) {
                    if (th != null) {
                        th2.addSuppressed(th);
                    }
                    if (i4 == i3 - 1) {
                        e1.s("Failed startForeground", th2);
                        n0.h(Thread.currentThread(), th2, false);
                    }
                    i4++;
                    th = th2;
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        e1.g("BootstrapService onTaskRemoved: " + f1278b + '-' + f1281e + '-' + f1280d + "; " + intent, new RuntimeException());
        if (f1278b) {
            a();
            super.onTaskRemoved(intent);
        }
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        e1.d("BootstrapService onTrimMemory: " + i);
        if (f1278b) {
            super.onTrimMemory(i);
            MainService.t0(i);
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        e1.d("BootstrapService onUnbind: " + intent);
        return super.onUnbind(intent);
    }
}
