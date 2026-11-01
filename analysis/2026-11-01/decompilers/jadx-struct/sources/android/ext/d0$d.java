package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class d0$d implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ DialogInterface$OnClickListener f710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d0 f711c;

    d0$d(d0 d0Var, String str, DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        this.f711c = d0Var;
        this.f709a = str;
        this.f710b = dialogInterface$OnClickListener;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f711c.j(this.f709a, this.f710b);
    }
}
