package android.ext;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
class r$m implements e2$c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f1229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f1230b;

    r$m(r rVar, Bundle bundle) {
        this.f1230b = rVar;
        this.f1229a = bundle;
    }

    @Override // android.ext.e2$c
    public void a(int i) {
        n2.i(new r$m$a(this, this.f1230b, i));
    }
}
