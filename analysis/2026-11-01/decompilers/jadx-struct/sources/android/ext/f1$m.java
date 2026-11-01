package android.ext;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class f1$m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f976b;

    f1$m(Context context, Runnable runnable) {
        this.f975a = context;
        this.f976b = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            AlertDialog alertDialogCreate = f.c(this.f975a).setMessage(b2.g("     15. __help_faq_15_q__\r\n        __help_faq_15_a__\r\n\r\n     16. __help_faq_16_q__\r\n        __help_faq_16_a__\r\n\r\n     17. __help_faq_17_q__\r\n        __help_faq_17_a__\r\n\r\n__rtfm__")).setNegativeButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null).create();
            if (this.f976b != null) {
                f.k(alertDialogCreate, new f1$m$a(this));
            }
            f.m(alertDialogCreate);
        } catch (Throwable th) {
            e1.l("Failed faq alert", th);
        }
    }
}
