package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class f1$e implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean[] f960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f961b;

    f1$e(boolean[] zArr, Runnable runnable) {
        this.f960a = zArr;
        this.f961b = runnable;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f960a[0] = true;
        AlertDialog alertDialogCreate = f.b().setCustomTitle(Tools.g0(R$string.fix_it)).setItems(new String[]{Config.b(R$id.config_prevent_unload).toString(), Config.b(R$id.config_ram).toString()}, new f1$e$a(this)).setNegativeButton(b2.f(R$string.cancel), (DialogInterface$OnClickListener) null).create();
        if (this.f961b != null) {
            f.k(alertDialogCreate, new f1$e$b(this));
        }
        f.m(alertDialogCreate);
    }
}
