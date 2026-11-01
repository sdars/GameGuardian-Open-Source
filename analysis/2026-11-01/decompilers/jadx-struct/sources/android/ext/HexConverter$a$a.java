package android.ext;

/* JADX INFO: loaded from: classes.dex */
class HexConverter$a$a implements Config$p$b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Config$p f154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ HexConverter$a f155b;

    HexConverter$a$a(HexConverter$a hexConverter$a, Config$p config$p) {
        this.f155b = hexConverter$a;
        this.f154a = config$p;
    }

    @Override // android.ext.Config$p$b
    public void a(int i) {
        this.f154a.g(null);
        String strL1 = Tools.L1("%,d", Long.valueOf(this.f155b.f148b ^ Config.s));
        try {
            HexConverter$a hexConverter$a = this.f155b;
            hexConverter$a.f149c.setSelection(hexConverter$a.f150d, hexConverter$a.f151e);
            HexConverter$a hexConverter$a2 = this.f155b;
            hexConverter$a2.f152f.replace(hexConverter$a2.f150d, hexConverter$a2.f151e, strL1);
        } catch (IndexOutOfBoundsException e2) {
            e1.s("Failed replace text", e2);
            this.f155b.f149c.setText(strL1);
        }
        this.f155b.f149c.requestFocus();
    }
}
