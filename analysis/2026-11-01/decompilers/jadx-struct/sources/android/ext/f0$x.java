package android.ext;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
class f0$x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte f945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ f0 f946b;

    f0$x(f0 f0Var, byte b2) {
        this.f946b = f0Var;
        this.f945a = b2;
    }

    @Override // java.lang.Runnable
    public void run() {
        InOut inOut = this.f946b.f793b;
        inOut.q(this.f945a, (byte) 47, 0);
        inOut.u(Process.myPid());
        inOut.u(this.f946b.f797f);
        this.f946b.t0();
    }
}
