package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class f0$a0$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f0$a0 f804a;

    f0$a0$a(f0$a0 f0_a0) {
        this.f804a = f0_a0;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            AlertDialog alertDialogCreate = f.b().setCustomTitle(Tools.g0(R$string.failed_load_daemon)).setMessage(b2.f(R$string.is_device_rooted) + "\n\n" + b2.f(R$string.must_be_root)).setPositiveButton(b2.f(R$string.fix_it), new f0$a0$a$a(this)).setNegativeButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null).create();
            f.m(alertDialogCreate);
            Tools.u1(alertDialogCreate);
        } catch (Throwable th) {
            e1.a(th);
        }
    }
}
