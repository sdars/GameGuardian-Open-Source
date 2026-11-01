package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;

/* JADX INFO: loaded from: classes.dex */
class z$a$c implements DialogInterface$OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ z$a f1388a;

    z$a$c(z$a z_a) {
        this.f1388a = z_a;
    }

    @Override // android.content.DialogInterface$OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (z.x()) {
            boolean unused = z.f1381g = false;
        }
    }
}
