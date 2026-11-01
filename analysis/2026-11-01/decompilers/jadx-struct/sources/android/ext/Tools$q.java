package android.ext;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class Tools$q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f533a;

    Tools$q(View view) {
        this.f533a = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            MainService.instance.l.removeView(this.f533a);
        } catch (Throwable th) {
            e1.l("Failed removeView: " + this.f533a, th);
        }
    }
}
