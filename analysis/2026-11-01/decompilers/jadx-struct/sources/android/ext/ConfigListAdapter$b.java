package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$b implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConfigListAdapter f57a;

    ConfigListAdapter$b(ConfigListAdapter configListAdapter) {
        this.f57a = configListAdapter;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        Config.f30c = 0L;
        Config.k();
    }
}
