package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnShowListener;

/* JADX INFO: loaded from: classes.dex */
class z0$i implements DialogInterface$OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertDialog f1411a;

    z0$i(AlertDialog alertDialog) {
        this.f1411a = alertDialog;
    }

    @Override // android.content.DialogInterface$OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        z0.j(this.f1411a);
    }
}
