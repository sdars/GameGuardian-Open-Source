package android.ext;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$t implements Config$p$a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConfigListAdapter f91a;

    ConfigListAdapter$t(ConfigListAdapter configListAdapter) {
        this.f91a = configListAdapter;
    }

    @Override // android.ext.Config$p$a
    public int a(DialogInterface dialogInterface, int i) {
        if (i != Config.o) {
            ConfigListAdapter.m();
        }
        return i;
    }
}
