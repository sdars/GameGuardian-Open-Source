package android.ext;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
class Tools$f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f507a;

    Tools$f(View view) {
        this.f507a = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (Tools.f495g == null) {
                Tools.f495g = (InputMethodManager) MainService.context.getSystemService("input_method");
            }
            View view = this.f507a;
            if (view != null) {
                Tools.f495g.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Throwable th) {
            e1.l("hideSoftInputFromWindow", th);
        }
    }
}
