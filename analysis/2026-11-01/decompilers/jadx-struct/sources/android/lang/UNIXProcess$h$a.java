package android.lang;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes.dex */
class UNIXProcess$h$a implements PrivilegedAction {
    UNIXProcess$h$a() {
    }

    @Override // java.security.PrivilegedAction
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ThreadGroup run() {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        while (true) {
            ThreadGroup parent = threadGroup.getParent();
            if (parent == null || threadGroup == parent) {
                break;
            }
            threadGroup = parent;
        }
        return threadGroup;
    }
}
