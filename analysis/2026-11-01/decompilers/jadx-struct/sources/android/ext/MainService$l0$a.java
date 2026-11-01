package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class MainService$l0$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService$l0 f267a;

    MainService$l0$a(MainService$l0 mainService$l0) {
        this.f267a = mainService$l0;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        MainService$l0 mainService$l0 = this.f267a;
        mainService$l0.f265f = i;
        mainService$l0.i();
    }
}
