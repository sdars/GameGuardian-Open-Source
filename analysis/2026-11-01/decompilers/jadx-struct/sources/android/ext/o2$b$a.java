package android.ext;

/* JADX INFO: loaded from: classes.dex */
class o2$b$a implements Config$p$b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Config$p f1166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ o2$b f1167b;

    o2$b$a(o2$b o2_b, Config$p config$p) {
        this.f1167b = o2_b;
        this.f1166a = config$p;
    }

    @Override // android.ext.Config$p$b
    public void a(int i) {
        this.f1166a.g(null);
        this.f1167b.f1163c.setText(this.f1166a.toString());
    }
}
