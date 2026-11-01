package android.ext;

import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class z1$d$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextView f1439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ z1$d f1440b;

    z1$d$a(z1$d z1_d, TextView textView) {
        this.f1440b = z1_d;
        this.f1439a = textView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1440b.h();
        if (this.f1440b.f1436e != null) {
            n2.i(new z1$d$a$a(this));
        }
    }
}
