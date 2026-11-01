package android.ext;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
class z$h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f1399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f1400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f1401c;

    z$h(Activity activity, boolean z, int i) {
        this.f1399a = activity;
        this.f1400b = z;
        this.f1401c = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        z.o(this.f1399a, this.f1400b, this.f1401c);
    }
}
