package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnShowListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class f$m implements DialogInterface$OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f784a;

    private f$m() {
        this.f784a = new ArrayList();
    }

    /* synthetic */ f$m(f$a f_a) {
        this();
    }

    public void a(DialogInterface$OnShowListener dialogInterface$OnShowListener) {
        if (dialogInterface$OnShowListener == null || this.f784a.contains(dialogInterface$OnShowListener)) {
            return;
        }
        this.f784a.add(dialogInterface$OnShowListener);
    }

    @Override // android.content.DialogInterface$OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Tools.N((AlertDialog) dialogInterface);
        for (DialogInterface$OnShowListener dialogInterface$OnShowListener : this.f784a) {
            if (dialogInterface$OnShowListener != null) {
                dialogInterface$OnShowListener.onShow(dialogInterface);
            }
        }
    }
}
