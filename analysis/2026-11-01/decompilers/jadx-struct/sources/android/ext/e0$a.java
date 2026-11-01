package android.ext;

import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
class e0$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ File f732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e0 f733b;

    e0$a(e0 e0Var, File file) {
        this.f733b = e0Var;
        this.f732a = file;
    }

    @Override // java.lang.Runnable
    public void run() {
        f.o(f.b().setMessage(Tools.L1(b2.f(R$string.need_fixer), this.f732a.getAbsolutePath())).setPositiveButton(b2.f(R$string.fix_it), new e0$a$a(this)).setNegativeButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null));
    }
}
