package android.ext;

import android.content.ComponentName;
import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
class f1$a$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f1$a f955a;

    f1$a$a(f1$a f1_a) {
        this.f955a = f1_a;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zStartInstrumentation;
        boolean z = false;
        try {
            if (!Config.vSpaceReal && Config.z == 0) {
                ComponentName componentNameU = f1.u();
                if (componentNameU != null) {
                    e1.d("Try instr: " + Process.myUid());
                    f1.f((byte) 0);
                    try {
                        zStartInstrumentation = r.p.startInstrumentation(componentNameU, null, r.u());
                        f1.f((byte) 1);
                        e1.d("Fail instr: " + Process.myUid());
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        e1.l("Failed load Instrumentation", th);
                        if (z) {
                            f1.f((byte) 1);
                        }
                    }
                }
                f1.B(3, "" + zStartInstrumentation + ' ' + Config.z);
                f1.B(6, null);
                f1.I();
            }
            f1.i();
            zStartInstrumentation = false;
            f1.B(3, "" + zStartInstrumentation + ' ' + Config.z);
        } catch (Throwable th2) {
            th = th2;
        }
        f1.B(6, null);
        f1.I();
    }
}
