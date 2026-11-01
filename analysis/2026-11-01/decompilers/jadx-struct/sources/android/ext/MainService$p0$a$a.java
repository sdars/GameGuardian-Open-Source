package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class MainService$p0$a$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService$p0$a f284a;

    MainService$p0$a$a(MainService$p0$a mainService$p0$a) {
        this.f284a = mainService$p0$a;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        MainService$p0 mainService$p0 = this.f284a.f283c;
        boolean z = mainService$p0.f279f;
        MainService mainService = mainService$p0.f280g;
        if (z) {
            mainService.t0.c();
        } else {
            mainService.m();
        }
        c2 c2Var = MainService.instance.f216f;
        if (c2Var != null) {
            c2Var.write(this.f284a.f283c.f279f ? "\ngg.clearList()\n" : "\ngg.clearResults()\n");
        }
    }
}
