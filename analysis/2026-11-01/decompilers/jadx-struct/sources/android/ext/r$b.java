package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class r$b implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f1213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f1214b;

    r$b(r rVar, Runnable runnable) {
        this.f1214b = rVar;
        this.f1213a = runnable;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            this.f1213a.run();
        } else if (i != 1) {
            new p0(1500).onClick(null, 0);
        } else {
            f.o(f.c(r.p).setMessage(b2.f(R$string.how_no_root)).setCancelable(false).setPositiveButton(b2.f(R$string.ok), new r$b$a(this)));
            r.k();
        }
    }
}
