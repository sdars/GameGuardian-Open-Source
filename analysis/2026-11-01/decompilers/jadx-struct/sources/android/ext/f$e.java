package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnShowListener;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
class f$e implements DialogInterface$OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f$n f769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Handler f770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Runnable f771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AlertDialog f772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Runnable f773e;

    f$e(f$n f_n, Handler handler, Runnable runnable, AlertDialog alertDialog, Runnable runnable2) {
        this.f769a = f_n;
        this.f770b = handler;
        this.f771c = runnable;
        this.f772d = alertDialog;
        this.f773e = runnable2;
    }

    @Override // android.content.DialogInterface$OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        this.f769a.f785a = true;
        this.f770b.removeCallbacks(this.f771c);
        f.j(this.f772d, this.f769a, this.f773e);
    }
}
