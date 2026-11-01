package android.ext;

/* JADX INFO: loaded from: classes.dex */
class f0$w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte f941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ byte[] f942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ f0 f944d;

    f0$w(f0 f0Var, byte b2, byte[] bArr, String str) {
        this.f944d = f0Var;
        this.f941a = b2;
        this.f942b = bArr;
        this.f943c = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        InOut inOut = this.f944d.f793b;
        inOut.q(this.f941a, (byte) 54, 0);
        inOut.u(Config.h);
        inOut.u(Config.A);
        inOut.w(Config.j);
        inOut.u(Config.m);
        inOut.u(Config.i);
        inOut.u(this.f942b.length);
        byte[] bArr = this.f942b;
        inOut.t(bArr, bArr.length);
        long jE = inOut.e();
        f0 f0Var = this.f944d;
        if (jE != f0Var.t) {
            f0Var.t = jE;
            f0Var.t0();
            e1.d("Sended config: " + Config.h + ' ' + Integer.toBinaryString(Config.A) + ' ' + Long.toBinaryString(Config.j) + ' ' + Config.m + ' ' + Config.i + ' ' + this.f943c + "; " + this.f942b.length);
        }
    }
}
