package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$d implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService f59a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ConfigListAdapter f60b;

    ConfigListAdapter$d(ConfigListAdapter configListAdapter, MainService mainService) {
        this.f60b = configListAdapter;
        this.f59a = mainService;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f59a.i.s();
    }
}
