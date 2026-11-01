package android.ext;

/* JADX INFO: loaded from: classes.dex */
class MainService$c0$c$a$c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService$c0$c$a f235a;

    MainService$c0$c$a$c(MainService$c0$c$a mainService$c0$c$a) {
        this.f235a = mainService$c0$c$a;
    }

    @Override // java.lang.Runnable
    public void run() {
        MainService$c0 mainService$c0 = this.f235a.f230a.f229a;
        mainService$c0.f226c.h.c(true, mainService$c0.f224a);
    }
}
