package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class SavedListAdapter$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h2 f363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ SavedListAdapter f364b;

    SavedListAdapter$a(SavedListAdapter savedListAdapter, h2 h2Var) {
        this.f364b = savedListAdapter;
        this.f363a = h2Var;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f364b.k(this.f363a);
    }
}
