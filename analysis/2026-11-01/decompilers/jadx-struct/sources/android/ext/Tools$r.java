package android.ext;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
class Tools$r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ImageView f534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f535b;

    Tools$r(ImageView imageView, float f2) {
        this.f534a = imageView;
        this.f535b = f2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f534a.setImageAlpha((int) this.f535b);
        } catch (NoSuchMethodError e2) {
            try {
                e1.s("setImageAlpha 1", e2);
                this.f534a.setAlpha((int) this.f535b);
            } catch (NoSuchMethodError e3) {
                e1.s("setImageAlpha 2", e3);
            }
        }
    }
}
