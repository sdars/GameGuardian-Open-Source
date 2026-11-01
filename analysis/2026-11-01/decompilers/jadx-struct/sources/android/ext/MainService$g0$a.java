package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class MainService$g0$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService$g0 f244a;

    MainService$g0$a(MainService$g0 mainService$g0) {
        this.f244a = mainService$g0;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        Tools.I1(R$string.reinstall_started, 0);
        new n0$i(new MainService$g0$a$a(this), "FixLibs").start();
    }
}
