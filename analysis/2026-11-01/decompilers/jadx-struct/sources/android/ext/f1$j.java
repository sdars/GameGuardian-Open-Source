package android.ext;

import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class f1$j implements Runnable {
    f1$j() {
    }

    @Override // java.lang.Runnable
    public void run() {
        if ((Config.f30c & 16) == 0 && Config.vSpaceReal && b1.B0()) {
            n2.i(f1.J(r.p, b2.f(R$string.need_random_name), 16L, false));
        }
    }
}
