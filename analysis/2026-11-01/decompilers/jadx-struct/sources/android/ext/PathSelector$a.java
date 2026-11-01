package android.ext;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
class PathSelector$a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f323a;

    PathSelector$a(boolean z) {
        this.f323a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r0 != false) goto L5;
     */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int compare(PathSelector$d pathSelector$d, PathSelector$d pathSelector$d2) {
        boolean z = pathSelector$d.f337c;
        int iA = 1;
        if (z == pathSelector$d2.f337c) {
            try {
                if (this.f323a) {
                    iA = r1.a(pathSelector$d.f336b, pathSelector$d2.f336b);
                } else if (pathSelector$d.f335a.lastModified() > pathSelector$d2.f335a.lastModified()) {
                }
                return iA;
            } catch (Throwable th) {
                e1.a(th);
                return 0;
            }
        }
        iA = -1;
        return iA;
    }
}
