package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class d0$c implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ d0 f708b;

    d0$c(d0 d0Var, String str) {
        this.f708b = d0Var;
        this.f707a = str;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            Tools.A(this.f707a, true);
        } else {
            MainService.instance.m.setCurrentTab(1);
            MainService.instance.W.u(this.f707a);
        }
    }
}
