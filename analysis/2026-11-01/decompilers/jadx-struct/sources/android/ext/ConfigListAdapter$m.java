package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.view.View$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$m implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ View$OnClickListener f75a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AlertDialog f76b;

    ConfigListAdapter$m(View$OnClickListener view$OnClickListener, AlertDialog alertDialog) {
        this.f75a = view$OnClickListener;
        this.f76b = alertDialog;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f75a.onClick(this.f76b.getButton(-1));
    }
}
