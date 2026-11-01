/*
 * Decompiled with CFR 0.152.
 */
package android.ext;

import android.app.Activity;
import android.app.Application;
import android.ext.MainService;
import android.ext.e1;
import android.ext.i;
import android.ext.n0;
import android.os.Bundle;

public abstract class l
extends Application {
    static {
        e1.d("Application clinit");
        i.a();
        n0.f();
    }

    public l() {
        e1.d("Application init");
        n0.f();
    }

    public void onCreate() {
        e1.d("Application onCreate");
        super.onCreate();
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks(this){
                final l a;
                {
                    this.a = l3;
                }

                public void onActivityCreated(Activity activity, Bundle bundle) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onActivityCreated: ");
                    stringBuilder.append(activity);
                    stringBuilder.append("; ");
                    stringBuilder.append(bundle);
                    e1.d(stringBuilder.toString());
                }

                public void onActivityDestroyed(Activity activity) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onActivityDestroyed: ");
                    stringBuilder.append(activity);
                    e1.d(stringBuilder.toString());
                }

                public void onActivityPaused(Activity activity) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onActivityPaused: ");
                    stringBuilder.append(activity);
                    e1.d(stringBuilder.toString());
                }

                public void onActivityResumed(Activity activity) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onActivityResumed: ");
                    stringBuilder.append(activity);
                    e1.d(stringBuilder.toString());
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onActivitySaveInstanceState: ");
                    stringBuilder.append(activity);
                    stringBuilder.append("; ");
                    stringBuilder.append(bundle);
                    e1.d(stringBuilder.toString());
                }

                public void onActivityStarted(Activity activity) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onActivityStarted: ");
                    stringBuilder.append(activity);
                    e1.d(stringBuilder.toString());
                }

                public void onActivityStopped(Activity activity) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onActivityStopped: ");
                    stringBuilder.append(activity);
                    e1.d(stringBuilder.toString());
                }
            };
            this.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        catch (Throwable throwable) {
            e1.a(throwable);
        }
    }

    public void onLowMemory() {
        e1.d("Application onLowMemory");
        super.onLowMemory();
        MainService.t0(-1);
    }

    public void onTerminate() {
        e1.d("Application onTerminate");
        super.onTerminate();
    }

    public void onTrimMemory(int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Application onTrimMemory: ");
        stringBuilder.append(n3);
        e1.d(stringBuilder.toString());
        super.onTrimMemory(n3);
        MainService.t0(n3);
    }
}

