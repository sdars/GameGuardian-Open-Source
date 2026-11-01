package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class Script$makeRequest$1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Script$makeRequest f419a;

    Script$makeRequest$1(Script$makeRequest script$makeRequest) {
        this.f419a = script$makeRequest;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertDialog alertDialogCreate = f.b().setCustomTitle(Tools.h0(Tools.N1(R$string.script))).setMessage(b2.f(R$string.script_prompt_internet)).setPositiveButton(b2.f(R$string.yes), this.f419a).setNegativeButton(b2.f(R$string.no), (DialogInterface$OnClickListener) null).create();
        f.k(alertDialogCreate, this.f419a);
        f.m(alertDialogCreate);
    }
}
