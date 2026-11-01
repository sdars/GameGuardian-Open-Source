package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;

/* JADX INFO: loaded from: classes.dex */
class x2$c implements DialogInterface$OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean[] f1315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f1316b;

    x2$c(boolean[] zArr, Runnable runnable) {
        this.f1315a = zArr;
        this.f1316b = runnable;
    }

    @Override // android.content.DialogInterface$OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1315a[0]) {
            return;
        }
        this.f1316b.run();
    }
}
