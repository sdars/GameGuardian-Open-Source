package android.ext;

import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class MainService$g0$a$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService$g0$a f245a;

    MainService$g0$a$a(MainService$g0$a mainService$g0$a) {
        this.f245a = mainService$g0$a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // java.lang.Runnable
    public void run() {
        ?? F = 2131296893;
        try {
            Process processQ = e2.q(Tools.removeNewLinesChars("h{hf#sp#lqvwdoo#0u#00del#{;9#") + this.f245a.f244a.f242a);
            if (processQ == null) {
                F = b2.f(R$string.reinstall_failed) + "\nnull";
            } else {
                int iWaitFor = processQ.waitFor();
                if (iWaitFor == 0) {
                    F = b2.f(R$string.reinstall_ended);
                } else {
                    F = b2.f(R$string.reinstall_failed) + "\ncode: " + iWaitFor;
                }
            }
        } catch (InterruptedException e2) {
            e1.g("Reinstall failed", e2);
            F = b2.f(F) + "\n" + e2.getMessage();
        }
        Tools.K1(F, 1);
    }
}
