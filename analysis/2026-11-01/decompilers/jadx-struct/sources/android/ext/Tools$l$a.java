package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnShowListener;

/* JADX INFO: loaded from: classes.dex */
class Tools$l$a implements DialogInterface$OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertDialog f515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Tools$l f516b;

    Tools$l$a(Tools$l tools$l, AlertDialog alertDialog) {
        this.f516b = tools$l;
        this.f515a = alertDialog;
    }

    @Override // android.content.DialogInterface$OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Tools.u1(this.f515a);
    }
}
