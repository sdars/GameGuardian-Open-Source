package android.ext;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
class MainService$c0$c$a$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MainService$c0$c$a f232b;

    MainService$c0$c$a$a(MainService$c0$c$a mainService$c0$c$a, Intent intent) {
        this.f232b = mainService$c0$c$a;
        this.f231a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Tools.f0().startActivity(this.f231a);
        } catch (Exception e2) {
            e1.l("Failed restart app 2: " + this.f232b.f230a.f229a.f224a, e2);
        }
    }
}
