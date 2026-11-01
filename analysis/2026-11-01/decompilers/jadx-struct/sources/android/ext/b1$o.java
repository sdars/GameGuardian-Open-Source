package android.ext;

import catch_.me_.if_.you_.can_.R$string;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
class b1$o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f628a;

    b1$o(String str) {
        this.f628a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        File file;
        b1 b1Var = b1.B;
        String absolutePath = (b1Var == null || (file = b1Var.f594c) == null) ? null : file.getAbsolutePath();
        f.m(f.c(r.p).setMessage(b2.f(R$string.no_space) + '\n' + this.f628a + '\n' + absolutePath).setPositiveButton(R$string.ok, new b1$o$a(this)).setCancelable(false).create());
    }
}
