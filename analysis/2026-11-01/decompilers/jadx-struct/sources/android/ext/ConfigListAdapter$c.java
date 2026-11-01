package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$c implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConfigListAdapter f58a;

    ConfigListAdapter$c(ConfigListAdapter configListAdapter) {
        this.f58a = configListAdapter;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        ConfigListAdapter.j(i);
    }
}
