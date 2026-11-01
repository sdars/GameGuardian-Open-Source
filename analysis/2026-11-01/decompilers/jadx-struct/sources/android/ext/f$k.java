package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class f$k implements DialogInterface$OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f781a;

    private f$k() {
        this.f781a = new ArrayList();
    }

    /* synthetic */ f$k(f$a f_a) {
        this();
    }

    public void a(DialogInterface$OnDismissListener dialogInterface$OnDismissListener) {
        if (dialogInterface$OnDismissListener == null || this.f781a.contains(dialogInterface$OnDismissListener)) {
            return;
        }
        this.f781a.add(dialogInterface$OnDismissListener);
    }

    @Override // android.content.DialogInterface$OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        f.g();
        for (DialogInterface$OnDismissListener dialogInterface$OnDismissListener : this.f781a) {
            if (dialogInterface$OnDismissListener != null) {
                dialogInterface$OnDismissListener.onDismiss(dialogInterface);
            }
        }
    }
}
