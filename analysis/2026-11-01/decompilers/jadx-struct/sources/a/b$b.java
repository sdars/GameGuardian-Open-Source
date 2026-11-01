package a;

import android.content.Context;
import android.content.Intent;
import android.ext.e1;

/* JADX INFO: loaded from: classes.dex */
class b$b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f12a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Intent f13b;

    b$b(Context context, Intent intent) {
        this.f12a = context;
        this.f13b = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f12a.startActivity(this.f13b);
        } catch (Throwable th) {
            e1.s("Failed startActivity from UI thread: " + this.f13b, th);
        }
    }
}
