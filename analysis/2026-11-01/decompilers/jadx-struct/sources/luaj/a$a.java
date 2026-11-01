package luaj;

import android.app.AlertDialog;
import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnClickListener;
import android.ext.Tools;
import android.ext.b2;
import android.ext.r$n;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class a$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a$b f1702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f1703b;

    a$a(a aVar, a$b a_b) {
        this.f1703b = aVar;
        this.f1702a = a_b;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertDialog$Builder neutralButton = android.ext.f.c(Tools.f0()).setMessage(this.f1703b.j + "\n\n" + Tools.L1(b2.f(R$string.invalid_header), this.f1702a.f1706a)).setNeutralButton(b2.f(R$string.fix_it), new r$n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf2594440elqdu|0vfulswv0zlwk0fruuxswhg0ru0lqydolg0khdghuv2"));
        a$a$a a_a_a = new a$a$a(this);
        if (Tools.f489a.nextBoolean()) {
            neutralButton.setPositiveButton(b2.f(R$string.yes), a_a_a).setNegativeButton(b2.f(R$string.no), (DialogInterface$OnClickListener) null);
        } else {
            neutralButton.setNegativeButton(b2.f(R$string.yes), a_a_a).setPositiveButton(b2.f(R$string.no), (DialogInterface$OnClickListener) null);
        }
        AlertDialog alertDialogCreate = neutralButton.create();
        android.ext.f.k(alertDialogCreate, new a$a$b(this));
        android.ext.f.m(alertDialogCreate);
    }
}
