package android.ext;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends Application {
    static {
        e1.d("Application clinit");
        i.a();
        n0.f();
    }

    public l() {
        e1.d("Application init");
        n0.f();
    }

    @Override // android.app.Application
    public void onCreate() {
        e1.d("Application onCreate");
        super.onCreate();
        try {
            registerActivityLifecycleCallbacks(new l$a(this));
        } catch (Throwable th) {
            e1.a(th);
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        e1.d("Application onLowMemory");
        super.onLowMemory();
        MainService.t0(-1);
    }

    @Override // android.app.Application
    public void onTerminate() {
        e1.d("Application onTerminate");
        super.onTerminate();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        e1.d("Application onTrimMemory: " + i);
        super.onTrimMemory(i);
        MainService.t0(i);
    }
}
