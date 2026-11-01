package android.ext;

import android.app.AlertDialog;
import android.app.AlertDialog$Builder;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class Script$alert$1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Script$alert f405e;

    Script$alert$1(Script$alert script$alert, String str, String str2, String str3, String str4) {
        this.f405e = script$alert;
        this.f401a = str;
        this.f402b = str2;
        this.f403c = str3;
        this.f404d = str4;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertDialog$Builder positiveButton = f.b().setCustomTitle(Tools.h0(Tools.N1(R$string.script))).setMessage(b2.g(this.f401a)).setPositiveButton(b2.g(this.f402b), this.f405e);
        String str = this.f403c;
        if (str != null) {
            positiveButton.setNegativeButton(b2.g(str), this.f405e);
        }
        String str2 = this.f404d;
        if (str2 != null) {
            positiveButton.setNeutralButton(b2.g(str2), this.f405e);
        }
        AlertDialog alertDialogCreate = positiveButton.create();
        f.k(alertDialogCreate, this.f405e);
        f.m(alertDialogCreate);
        MainService.instance.y(true);
    }
}
