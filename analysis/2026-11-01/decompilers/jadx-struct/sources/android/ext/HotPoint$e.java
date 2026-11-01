package android.ext;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class HotPoint$e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Drawable f170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ HotPoint f171b;

    HotPoint$e(HotPoint hotPoint, Drawable drawable) {
        this.f171b = hotPoint;
        this.f170a = drawable;
    }

    @Override // java.lang.Runnable
    public void run() {
        HotPoint hotPoint = this.f171b;
        Tools.c(hotPoint.y, this.f170a, 24 - hotPoint.q);
    }
}
