package android.ext;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Tools$a0 f71a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ConfigListAdapter f72b;

    ConfigListAdapter$k(ConfigListAdapter configListAdapter, Tools$a0 tools$a0) {
        this.f72b = configListAdapter;
        this.f71a = tools$a0;
    }

    @Override // java.lang.Runnable
    public void run() {
        Tools.A1(MainService.instance.Y, this.f71a);
    }
}
