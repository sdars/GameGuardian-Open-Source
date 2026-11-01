package android.ext;

import android.content.Context;
import android.widget.Toast;

/* JADX INFO: loaded from: classes.dex */
class Tools$b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f501b;

    Tools$b(String str, int i) {
        this.f500a = str;
        this.f501b = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Context contextH = p2.h();
            String str = this.f500a;
            if (str == null) {
                str = "null";
            }
            p2.j(Toast.makeText(contextH, b2.g(str), this.f501b));
        } catch (Throwable th) {
            e1.s("Toast fail", th);
        }
    }
}
