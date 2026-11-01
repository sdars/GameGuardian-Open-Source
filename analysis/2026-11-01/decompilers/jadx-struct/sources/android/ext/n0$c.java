package android.ext;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
class n0$c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ File f1109a;

    n0$c(File file) {
        this.f1109a = file;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1109a.delete();
    }
}
