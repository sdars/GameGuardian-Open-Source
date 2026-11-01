package android.ext;

import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
class l$a implements Application$ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f1049a;

    l$a(l lVar) {
        this.f1049a = lVar;
    }

    @Override // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        e1.d("onActivityCreated: " + activity + "; " + bundle);
    }

    @Override // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        e1.d("onActivityDestroyed: " + activity);
    }

    @Override // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        e1.d("onActivityPaused: " + activity);
    }

    @Override // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        e1.d("onActivityResumed: " + activity);
    }

    @Override // android.app.Application$ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        e1.d("onActivitySaveInstanceState: " + activity + "; " + bundle);
    }

    @Override // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        e1.d("onActivityStarted: " + activity);
    }

    @Override // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        e1.d("onActivityStopped: " + activity);
    }
}
