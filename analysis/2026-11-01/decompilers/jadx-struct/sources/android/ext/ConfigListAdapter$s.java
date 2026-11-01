package android.ext;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$s implements Config$p$a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConfigListAdapter f90a;

    ConfigListAdapter$s(ConfigListAdapter configListAdapter) {
        this.f90a = configListAdapter;
    }

    @Override // android.ext.Config$p$a
    public int a(DialogInterface dialogInterface, int i) {
        if (i != 1 || InternalKeyboard.a()) {
            return i;
        }
        MainService.I0();
        return 0;
    }
}
