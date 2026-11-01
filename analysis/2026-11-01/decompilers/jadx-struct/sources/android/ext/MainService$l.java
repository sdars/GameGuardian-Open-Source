package android.ext;

import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class MainService$l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MainService f262b;

    MainService$l(MainService mainService, long j) {
        this.f262b = mainService;
        this.f261a = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertDialog$Builder neutralButton;
        long j = this.f261a;
        if (-1024 >= j || j > 0) {
            String str = c.G(this.f261a, 4) + 'h';
            MainService$l$a mainService$l$a = new MainService$l$a(this, str);
            y0.b(str, 1);
            neutralButton = f.b().setMessage(Tools.N1(R$string.allocated) + ": " + str).setPositiveButton(b2.f(R$string.goto1), mainService$l$a).setNeutralButton(b2.f(R$string.copy), mainService$l$a);
        } else {
            neutralButton = f.b().setMessage(b2.f(R$string.allocate_fail) + ' ' + (-this.f261a));
        }
        f.m(neutralButton.setNegativeButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null).create());
    }
}
