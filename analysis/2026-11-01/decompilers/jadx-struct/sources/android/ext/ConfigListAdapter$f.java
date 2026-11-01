package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$f implements DialogInterface$OnClickListener {
    ConfigListAdapter$f() {
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        MainService mainService = MainService.instance;
        try {
            mainService.t();
            n2.d().postDelayed(new ConfigListAdapter$f$a(this), 8000L);
            mainService.m1(true);
            mainService.j.e();
            n2.d().postDelayed(new ConfigListAdapter$f$b(this), 300L);
        } catch (Throwable th) {
            e1.l("Failed take screenshot", th);
            try {
                mainService.j.m();
            } catch (Throwable th2) {
                e1.l("Failed restore after take screenshot", th2);
            }
        }
    }
}
