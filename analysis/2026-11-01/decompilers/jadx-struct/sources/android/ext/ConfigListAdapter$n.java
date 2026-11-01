package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnShowListener;
import android.view.View$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$n implements DialogInterface$OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ View$OnClickListener f77a;

    ConfigListAdapter$n(View$OnClickListener view$OnClickListener) {
        this.f77a = view$OnClickListener;
    }

    @Override // android.content.DialogInterface$OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Tools.s1(dialogInterface, -1, null, this.f77a);
    }
}
