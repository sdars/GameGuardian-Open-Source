package android.ext;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
class Config$j extends Config$s {
    Config$j(int i, int i2, int[] iArr, int i3, String str, boolean z) {
        super(i, i2, iArr, i3, str, z);
    }

    @Override // android.ext.Config$s, android.ext.Config$p
    public boolean e(DialogInterface dialogInterface, int i) {
        boolean zE = super.e(dialogInterface, i);
        if (zE) {
            MainService.instance.j.z();
        }
        return zE;
    }
}
