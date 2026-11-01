package android.ext;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends Application {

    class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            e1.d("onActivityCreated: " + activity + "; " + bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            e1.d("onActivityDestroyed: " + activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            e1.d("onActivityPaused: " + activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            e1.d("onActivityResumed: " + activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            e1.d("onActivitySaveInstanceState: " + activity + "; " + bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            e1.d("onActivityStarted: " + activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            e1.d("onActivityStopped: " + activity);
        }
    }

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
            registerActivityLifecycleCallbacks(new a());
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
