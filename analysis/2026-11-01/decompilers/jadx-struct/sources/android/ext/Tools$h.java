package android.ext;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
class Tools$h implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Process f509a;

    Tools$h(Process process) {
        this.f509a = process;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean call() throws InterruptedException {
        this.f509a.waitFor();
        return Boolean.TRUE;
    }
}
