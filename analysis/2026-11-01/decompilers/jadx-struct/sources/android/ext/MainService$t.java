package android.ext;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
class MainService$t implements ComponentCallbacks2 {
    MainService$t() {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        e1.d("ComponentCallbacks2 onConfigurationChanged: " + configuration);
        MainService.Y(a.b.f(configuration));
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        e1.d("ComponentCallbacks2 onLowMemory");
        MainService.t0(-1);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        e1.d("ComponentCallbacks2 onTrimMemory: " + i);
        MainService.t0(i);
    }
}
