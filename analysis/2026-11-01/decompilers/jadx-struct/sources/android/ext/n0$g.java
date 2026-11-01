package android.ext;

import android.os.Looper;
import android.widget.Toast;

/* JADX INFO: loaded from: classes.dex */
class n0$g extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ n0 f1114b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n0$g(n0 n0Var, String str, String str2) {
        super(str);
        this.f1114b = n0Var;
        this.f1113a = str2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            Looper.prepare();
            p2.j(Toast.makeText(p2.h(), this.f1113a, 1));
            Looper.loop();
        } catch (Throwable unused) {
        }
    }
}
