package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnShowListener;

/* JADX INFO: loaded from: classes.dex */
class f$b implements DialogInterface$OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f764a;

    f$b(Runnable runnable) {
        this.f764a = runnable;
    }

    @Override // android.content.DialogInterface$OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        e1.d(this.f764a + ": 30_");
        n2.d().removeCallbacks(this.f764a);
    }
}
