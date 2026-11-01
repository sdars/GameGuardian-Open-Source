package android.ext;

import android.app.AlertDialog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class f$j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f780b;

    public f$j(AlertDialog alertDialog, f$k f_k) {
        this.f779a = new WeakReference(alertDialog);
        this.f780b = new WeakReference(f_k);
    }
}
