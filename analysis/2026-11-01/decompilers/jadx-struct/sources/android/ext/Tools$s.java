package android.ext;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class Tools$s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextView f536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Drawable f537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f538c;

    Tools$s(TextView textView, Drawable drawable, int i) {
        this.f536a = textView;
        this.f537b = drawable;
        this.f538c = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        Tools.d(this.f536a, this.f537b, this.f538c);
    }
}
