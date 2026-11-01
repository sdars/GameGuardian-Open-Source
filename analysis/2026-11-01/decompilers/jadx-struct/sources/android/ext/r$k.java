package android.ext;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
class r$k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1224a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f1225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f1226c;

    r$k(r rVar, Bundle bundle) {
        this.f1226c = rVar;
        this.f1225b = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        e1.d(this + ": 200");
        if (!this.f1224a) {
            this.f1224a = true;
            this.f1226c.B(this.f1225b);
        } else {
            e1.d(this + ": already");
        }
    }
}
