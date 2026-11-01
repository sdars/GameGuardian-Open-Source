package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class MainService$q0$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService$q0 f290a;

    MainService$q0$a(MainService$q0 mainService$q0) {
        this.f290a = mainService$q0;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        MainService$q0 mainService$q0 = this.f290a;
        mainService$q0.f288f = i;
        mainService$q0.h();
    }
}
