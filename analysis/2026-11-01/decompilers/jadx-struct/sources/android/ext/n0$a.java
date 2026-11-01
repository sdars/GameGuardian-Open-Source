package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class n0$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String[] f1105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f1106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Runnable f1107d;

    n0$a(String str, String[] strArr, int i, Runnable runnable) {
        this.f1104a = str;
        this.f1105b = strArr;
        this.f1106c = i;
        this.f1107d = runnable;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            z2.c(this.f1104a);
            Tools.H1(R$string.thank_you);
        }
        if (i == -3) {
            Tools.i1(this.f1105b[this.f1106c + 1]);
        }
        this.f1107d.run();
    }
}
