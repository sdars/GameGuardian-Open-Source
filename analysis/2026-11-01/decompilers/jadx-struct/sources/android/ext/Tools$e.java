package android.ext;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
class Tools$e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Window f506a;

    Tools$e(Window window) {
        this.f506a = window;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            View currentFocus = this.f506a.getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = this.f506a.peekDecorView();
            }
            if (currentFocus != null) {
                Tools.S0(currentFocus);
            }
        } catch (Throwable th) {
            e1.l("hideSoftInputFromWindow", th);
        }
    }
}
