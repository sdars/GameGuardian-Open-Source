package android.ext;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$o$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f81a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ConfigListAdapter$o f82b;

    ConfigListAdapter$o$a(ConfigListAdapter$o configListAdapter$o, String str) {
        this.f82b = configListAdapter$o;
        this.f81a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f82b.b();
        try {
            e2$d e2_dJ = e2.j(this.f81a);
            if (e2_dJ.f756a.contains("uid=0")) {
                n2.i(new ConfigListAdapter$o$a$a(this));
            } else {
                this.f82b.a(e2_dJ.f756a);
            }
        } catch (Throwable th) {
            this.f82b.a(th.getMessage());
        }
        e2.f745a = "";
    }
}
