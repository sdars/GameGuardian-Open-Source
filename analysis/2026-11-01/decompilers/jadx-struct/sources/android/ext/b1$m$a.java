package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class b1$m$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b1$m f627a;

    b1$m$a(b1$m b1_m) {
        this.f627a = b1_m;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i != -1) {
            b1.k(false);
            return;
        }
        b1$c0 b1_c0J0 = b1.j0();
        b1_c0J0.l = 0;
        b1_c0J0.m = false;
        b1.z1();
    }
}
