package android.ext;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class f0$d0$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ f0$d0 f830b;

    f0$d0$a(f0$d0 f0_d0, byte[] bArr) {
        this.f830b = f0_d0;
        this.f829a = bArr;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            this.f830b.f828a.h0(this.f829a);
        } catch (IOException e2) {
            e1.l("Failed process message: " + ((int) this.f829a[0]) + ' ' + this.f829a.length, e2);
        }
    }
}
