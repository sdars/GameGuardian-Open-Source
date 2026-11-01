package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class n0$e implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String[] f1110a;

    n0$e(String[] strArr) {
        this.f1110a = strArr;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            e2.n("exec setprop persist.sys.whetstone.level 0", 15);
            Tools.J1(b2.g(this.f1110a[8] + ": " + b2.f(R$string.ok)));
        } catch (Throwable unused) {
            e1.p("Failed fix " + this.f1110a[8]);
            Tools.J1(b2.g(this.f1110a[8] + ": " + b2.f(R$string.patch_failed)));
        }
    }
}
