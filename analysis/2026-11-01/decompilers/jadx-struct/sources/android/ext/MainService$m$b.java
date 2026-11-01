package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class MainService$m$b implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MainService$m f273b;

    MainService$m$b(MainService$m mainService$m, int i) {
        this.f273b = mainService$m;
        this.f272a = i;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        MainService$m mainService$m = this.f273b;
        mainService$m.f269b[this.f272a][i].e(mainService$m.f270c.J);
        Tools.D(dialogInterface);
    }
}
