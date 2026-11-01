package android.ext;

import android.content.DialogInterface$OnClickListener;
import android.os.Handler;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class x$b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f1298a;

    x$b(x xVar) {
        this.f1298a = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        x xVar = this.f1298a;
        xVar.k = -1L;
        xVar.f1290a = f.b().setView(Tools.O0(this.f1298a.j)).setCancelable(false).setPositiveButton(R$string.hide, (DialogInterface$OnClickListener) null).setNegativeButton(R$string.cancel, (DialogInterface$OnClickListener) null).create();
        this.f1298a.c("", -1L, 1L, 0, 1, 0L, "");
        f.l(this.f1298a.f1290a, this.f1298a);
        if (MainService.instance.n != null) {
            Handler handlerD = n2.d();
            handlerD.removeCallbacks(this.f1298a.n);
            handlerD.postDelayed(this.f1298a.n, 100L);
        }
    }
}
