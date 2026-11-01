package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$r$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConfigListAdapter$r f89a;

    ConfigListAdapter$r$a(ConfigListAdapter$r configListAdapter$r) {
        this.f89a = configListAdapter$r;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            k.i((String) this.f89a.f88c.get(i));
            ConfigListAdapter.m();
        } catch (IndexOutOfBoundsException e2) {
            e1.l("Failed get locale for index: " + i, e2);
        }
        Tools.D(dialogInterface);
    }
}
