package android.ext;

import android.app.AlertDialog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class f$l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f783b;

    public f$l(AlertDialog alertDialog, f$m f_m) {
        this.f782a = new WeakReference(alertDialog);
        this.f783b = new WeakReference(f_m);
    }
}
