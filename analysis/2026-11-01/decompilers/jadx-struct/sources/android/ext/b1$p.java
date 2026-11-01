package android.ext;

import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class b1$p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Throwable f630a;

    b1$p(Throwable th) {
        this.f630a = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        b1$p$a b1_p_a = new b1$p$a(this);
        f.m(f.c(r.p).setMessage(Tools.N1(R$string.reinstall_fail) + ":\n\n" + e1.n(this.f630a)).setPositiveButton(R$string.more, b1_p_a).setNegativeButton(R$string.ok, b1_p_a).setCancelable(false).create());
    }
}
