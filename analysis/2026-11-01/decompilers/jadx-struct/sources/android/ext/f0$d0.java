package android.ext;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class f0$d0 extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f0 f828a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f0$d0(f0 f0Var, String str) {
        super(str);
        this.f828a = f0Var;
    }

    private void a(byte[] bArr) {
        try {
            Exchanger exchanger = this.f828a.f794c;
            while (!Thread.interrupted()) {
                try {
                    exchanger.exchange(bArr, 500L, TimeUnit.MILLISECONDS);
                    return;
                } catch (InterruptedException unused) {
                }
            }
        } catch (Throwable th) {
            e1.l("handleMemoryItem failed", th);
        }
    }

    private void b(byte[] bArr) {
        if (bArr[0] == 20 && bArr[1] == 0) {
            a(bArr);
        } else {
            n2.d().post(new f0$d0$a(this, bArr));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        InOut inOut = this.f828a.f793b;
        while (!Thread.interrupted()) {
            try {
                byte[] bArrK = inOut.k();
                f0.B = null;
                if (bArrK != null) {
                    b(bArrK);
                }
            } catch (Throwable th) {
                e1.l("Read error", th);
                f0.B = th.toString();
                n2.d().post(new f0$d0$b(this));
                return;
            }
        }
    }
}
