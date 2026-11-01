package android.ext;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
class z2$a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1442a;

    z2$a(String str) {
        this.f1442a = str;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        return Boolean.valueOf(z2.b(this.f1442a.getBytes()));
    }
}
