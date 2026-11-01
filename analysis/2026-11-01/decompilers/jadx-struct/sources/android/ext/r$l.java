package android.ext;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
class r$l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f1227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f1228b;

    r$l(r rVar, Bundle bundle) {
        this.f1228b = rVar;
        this.f1227a = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1228b.j = null;
        this.f1228b.C(this.f1227a, false);
    }
}
