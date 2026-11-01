package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnShowListener;

/* JADX INFO: loaded from: classes.dex */
class Config$l$a implements DialogInterface$OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertDialog f37a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Config$l f38b;

    Config$l$a(Config$l config$l, AlertDialog alertDialog) {
        this.f38b = config$l;
        this.f37a = alertDialog;
    }

    @Override // android.content.DialogInterface$OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Tools.u1(this.f37a);
    }
}
