package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;

/* JADX INFO: loaded from: classes.dex */
class f$c implements DialogInterface$OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f765a;

    f$c(Runnable runnable) {
        this.f765a = runnable;
    }

    @Override // android.content.DialogInterface$OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        e1.d(this.f765a + ": 40_");
        n2.d().postDelayed(this.f765a, 5000L);
    }
}
