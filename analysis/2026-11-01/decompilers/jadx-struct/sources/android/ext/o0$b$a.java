package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class o0$b$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f1148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ o0$b f1149b;

    o0$b$a(o0$b o0_b, int i) {
        this.f1149b = o0_b;
        this.f1148a = i;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        MainService.instance.P();
        this.f1149b.onClick(null, this.f1148a);
    }
}
