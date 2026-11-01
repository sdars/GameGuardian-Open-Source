package android.ext;

import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class b1$m implements Runnable {
    b1$m() {
    }

    @Override // java.lang.Runnable
    public void run() {
        b1$m$a b1_m_a = new b1$m$a(this);
        f.o(f.c(r.p).setMessage(b2.f(R$string.failed_install)).setPositiveButton(R$string.yes, b1_m_a).setNegativeButton(R$string.no, b1_m_a).setCancelable(false));
    }
}
