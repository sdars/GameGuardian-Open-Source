package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
class MainService$p0$a$b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ DialogInterface f285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MainService$p0$a f286b;

    MainService$p0$a$b(MainService$p0$a mainService$p0$a, DialogInterface dialogInterface) {
        this.f286b = mainService$p0$a;
        this.f285a = dialogInterface;
    }

    @Override // java.lang.Runnable
    public void run() {
        f.m((AlertDialog) this.f285a);
    }
}
