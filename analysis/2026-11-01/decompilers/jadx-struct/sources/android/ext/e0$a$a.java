package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
class e0$a$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ e0$a f734a;

    e0$a$a(e0$a e0_a) {
        this.f734a = e0_a;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        for (Intent intent : b1.b0(this.f734a.f732a)) {
            try {
                Tools.f0().startActivity(intent);
                return;
            } catch (Throwable th) {
                e1.a(th);
            }
        }
    }
}
