package android.ext;

/* JADX INFO: loaded from: classes.dex */
class Script$toast$1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Script$toast f444c;

    Script$toast$1(Script$toast script$toast, String str, boolean z) {
        this.f444c = script$toast;
        this.f442a = str;
        this.f443b = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        Tools.K1(b2.g(this.f442a), !this.f443b ? 1 : 0);
    }
}
