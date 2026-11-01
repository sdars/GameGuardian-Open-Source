package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class d2$b$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ d2$b f724b;

    d2$b$a(d2$b d2_b, int i) {
        this.f724b = d2_b;
        this.f723a = i;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        MainService.instance.O();
        this.f724b.onClick(null, this.f723a);
    }
}
