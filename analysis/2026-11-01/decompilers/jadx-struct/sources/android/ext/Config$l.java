package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class Config$l extends Config$s {
    private int n;

    Config$l(int i, int i2, int[] iArr, int i3, String str, boolean z, int i4) {
        super(i, i2, iArr, i3, str, z, i4);
        this.n = 0;
    }

    @Override // android.ext.Config$s, android.ext.Config$p
    public boolean e(DialogInterface dialogInterface, int i) {
        if (i < 0) {
            if (i == -2) {
                this.f42d = 0;
                Config.k();
            }
            if (Config.vSpaceReal && this.n != this.f42d) {
                ConfigListAdapter.m();
            }
            return false;
        }
        this.n = this.f42d;
        boolean zE = super.e(dialogInterface, i);
        if (zE) {
            if (i == 1) {
                AlertDialog alertDialogCreate = f.c(Tools.f0()).setCustomTitle(Tools.g0(this.f39a)).setMessage(b2.f(this.h)).setPositiveButton(R$string.save, this).setNegativeButton(R$string.cancel, this).create();
                f.m(alertDialogCreate);
                f.l(alertDialogCreate, new Config$l$a(this, alertDialogCreate));
            } else if (Config.vSpaceReal && this.n != this.f42d) {
                ConfigListAdapter.m();
            }
        }
        return zE;
    }
}
