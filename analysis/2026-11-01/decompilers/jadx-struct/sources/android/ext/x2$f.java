package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class x2$f implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f1320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f1321b;

    x2$f(Runnable runnable, String str) {
        this.f1320a = runnable;
        this.f1321b = str;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        e1.d(this.f1320a + ": 120");
        x2.t(this.f1321b);
        e1.d(this.f1320a + ": 130");
    }
}
