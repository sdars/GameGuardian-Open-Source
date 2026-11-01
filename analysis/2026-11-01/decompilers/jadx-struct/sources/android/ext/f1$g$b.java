package android.ext;

import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class f1$g$b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ DialogInterface$OnClickListener f969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ f1$g f970b;

    f1$g$b(f1$g f1_g, DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        this.f970b = f1_g;
        this.f969a = dialogInterface$OnClickListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        f.o(f.b().setMessage(b2.f(R$string.improve_translation_)).setPositiveButton(b2.f(R$string.site), this.f969a).setNegativeButton(b2.f(R$string.skip), this.f969a));
    }
}
