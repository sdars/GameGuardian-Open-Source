package android.lang;

import java.security.PrivilegedAction;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
class UNIXProcess$a implements PrivilegedAction {
    UNIXProcess$a() {
    }

    @Override // java.security.PrivilegedAction
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Executor run() {
        return Executors.newCachedThreadPool(new UNIXProcess$h(null));
    }
}
