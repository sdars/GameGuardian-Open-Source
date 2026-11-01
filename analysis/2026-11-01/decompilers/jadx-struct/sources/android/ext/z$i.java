package android.ext;

import android.app.Activity;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
class z$i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f1402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ DialogInterface f1403b;

    z$i(Activity activity, DialogInterface dialogInterface) {
        this.f1402a = activity;
        this.f1403b = dialogInterface;
    }

    @Override // java.lang.Runnable
    public void run() {
        z.D(this.f1402a, this.f1403b);
    }
}
