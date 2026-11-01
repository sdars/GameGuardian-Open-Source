package android.ext;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$f$b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConfigListAdapter$f f63a;

    ConfigListAdapter$f$b(ConfigListAdapter$f configListAdapter$f) {
        this.f63a = configListAdapter$f;
    }

    @Override // java.lang.Runnable
    public void run() {
        MainService.instance.i.T0();
    }
}
