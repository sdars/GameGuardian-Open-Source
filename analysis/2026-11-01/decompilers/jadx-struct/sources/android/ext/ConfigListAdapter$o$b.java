package android.ext;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$o$b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConfigListAdapter$o f84a;

    ConfigListAdapter$o$b(ConfigListAdapter$o configListAdapter$o) {
        this.f84a = configListAdapter$o;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (MainService.instance != null) {
            MainService.instance.t();
        }
        this.f84a.f80c.hide();
    }
}
