package android.ext;

import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class f0$q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f0 f926a;

    f0$q(f0 f0Var) {
        this.f926a = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        f.o(f.b().setCustomTitle(Tools.g0(R$string.bad_settings)).setMessage(b2.f(R$string.freeze_lags)).setPositiveButton(b2.f(R$string.fix_it), new f0$q$a(this)).setNegativeButton(b2.f(R$string.skip), (DialogInterface$OnClickListener) null));
    }
}
