package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class Config$i extends Config$s {
    Config$i(int i, int i2, int[] iArr, int i3, String str, boolean z, int i4) {
        super(i, i2, iArr, i3, str, z, i4);
    }

    @Override // android.ext.Config$s, android.ext.Config$p
    public boolean e(DialogInterface dialogInterface, int i) {
        boolean zE = super.e(dialogInterface, i);
        if (zE && this.f42d == 3) {
            f.o(f.c(Tools.f0()).setMessage(b2.f(R$string.help_faq_33_a)).setNegativeButton(R$string.ok, (DialogInterface$OnClickListener) null));
        }
        return zE;
    }
}
