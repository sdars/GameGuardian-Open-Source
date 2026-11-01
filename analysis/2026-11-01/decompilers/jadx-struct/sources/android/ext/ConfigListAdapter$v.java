package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$v implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService f98a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ConfigListAdapter f99b;

    ConfigListAdapter$v(ConfigListAdapter configListAdapter, MainService mainService) {
        this.f99b = configListAdapter;
        this.f98a = mainService;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f98a.v0();
    }
}
