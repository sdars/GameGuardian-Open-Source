package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class MainService$c0$c implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService$c0 f229a;

    MainService$c0$c(MainService$c0 mainService$c0) {
        this.f229a = mainService$c0;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        n2.h(new MainService$c0$c$a(this));
    }
}
