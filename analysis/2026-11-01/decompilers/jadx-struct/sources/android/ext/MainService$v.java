package android.ext;

/* JADX INFO: loaded from: classes.dex */
class MainService$v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ CharSequence f302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ MainService f303c;

    MainService$v(MainService mainService, String str, CharSequence charSequence) {
        this.f303c = mainService;
        this.f301a = str;
        this.f302b = charSequence;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str = this.f301a;
        if (str != null) {
            this.f303c.C.setText(str);
        }
        CharSequence charSequence = this.f302b;
        if (charSequence != null) {
            this.f303c.y.setText(charSequence);
        }
        this.f303c.x.setVisibility(8);
    }
}
