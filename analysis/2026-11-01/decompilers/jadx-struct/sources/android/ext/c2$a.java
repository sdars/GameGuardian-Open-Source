package android.ext;

import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class c2$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Throwable f698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c2 f699b;

    c2$a(c2 c2Var, Throwable th) {
        this.f699b = c2Var;
        this.f698a = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            f.o(f.b().setCustomTitle(Tools.g0(R$string.error)).setMessage(this.f699b.f696b + "\n\n" + this.f698a.toString()).setPositiveButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null));
        } catch (Throwable th) {
            e1.s("Failed show alert", th);
        }
    }
}
