package android.ext;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class Script$getResults$1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Script$getResults f418c;

    Script$getResults$1(Script$getResults script$getResults, ArrayList arrayList, Object obj) {
        this.f418c = script$getResults;
        this.f416a = arrayList;
        this.f417b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        d.a aVar = MainService.instance.s0;
        for (int i = 0; i < aVar.i(); i++) {
            try {
                c cVarF = aVar.f(i, null);
                if (cVarF != null) {
                    this.f416a.add(cVarF);
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        synchronized (this.f417b) {
            try {
                this.f417b.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
