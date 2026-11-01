package android.ext;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends android.app.Application {

    class a implements android.app.Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            android.ext.e1.d("onActivityCreated: " + activity + "; " + bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            android.ext.e1.d("onActivityDestroyed: " + activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity activity) {
            android.ext.e1.d("onActivityPaused: " + activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity activity) {
            android.ext.e1.d("onActivityResumed: " + activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
            android.ext.e1.d("onActivitySaveInstanceState: " + activity + "; " + bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity activity) {
            android.ext.e1.d("onActivityStarted: " + activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity activity) {
            android.ext.e1.d("onActivityStopped: " + activity);
        }
    }

    static {
        android.ext.e1.d("Application clinit");
        android.ext.i.a();
        android.ext.n0.f();
    }

    public l() {
        android.ext.e1.d("Application init");
        android.ext.n0.f();
    }

    @Override // android.app.Application
    public void onCreate() {
        android.ext.e1.d("Application onCreate");
        super.onCreate();
        try {
            registerActivityLifecycleCallbacks(new android.ext.l.a());
        } catch (java.lang.Throwable th) {
            android.ext.e1.a(th);
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        android.ext.e1.d("Application onLowMemory");
        super.onLowMemory();
        android.ext.MainService.t0(-1);
    }

    @Override // android.app.Application
    public void onTerminate() {
        android.ext.e1.d("Application onTerminate");
        super.onTerminate();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        android.ext.e1.d("Application onTrimMemory: " + i);
        super.onTrimMemory(i);
        android.ext.MainService.t0(i);
    }
}
