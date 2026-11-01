package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnShowListener;

/* JADX INFO: loaded from: classes.dex */
class s1$f implements DialogInterface$OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertDialog f1246a;

    s1$f(AlertDialog alertDialog) {
        this.f1246a = alertDialog;
    }

    @Override // android.content.DialogInterface$OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Tools.u1(this.f1246a);
    }
}
