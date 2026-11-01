package android.ext;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$f$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConfigListAdapter$f f62a;

    ConfigListAdapter$f$a(ConfigListAdapter$f configListAdapter$f) {
        this.f62a = configListAdapter$f;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            MainService mainService = MainService.instance;
            mainService.t();
            mainService.j.m();
            mainService.m1(false);
        } catch (Throwable th) {
            e1.l("Failed restore after take screenshot", th);
        }
    }
}
