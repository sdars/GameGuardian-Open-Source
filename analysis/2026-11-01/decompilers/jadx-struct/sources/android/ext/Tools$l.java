package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.view.View$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class Tools$l implements View$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f514b;

    Tools$l(String str, int i) {
        this.f513a = str;
        this.f514b = i;
    }

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        AlertDialog alertDialogCreate = f.b().setMessage(b2.g(this.f513a) + '\n' + b2.f(this.f514b)).setNegativeButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null).create();
        f.m(alertDialogCreate);
        f.l(alertDialogCreate, new Tools$l$a(this, alertDialogCreate));
    }
}
