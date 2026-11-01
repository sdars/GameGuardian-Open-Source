package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class MainService$l$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MainService$l f264b;

    MainService$l$a(MainService$l mainService$l, String str) {
        this.f264b = mainService$l;
        this.f263a = str;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -3) {
            Tools.z(this.f263a);
        } else {
            if (i != -1) {
                return;
            }
            MainService.instance.L(null, this.f263a, Tools.N1(R$string.allocated));
        }
    }
}
