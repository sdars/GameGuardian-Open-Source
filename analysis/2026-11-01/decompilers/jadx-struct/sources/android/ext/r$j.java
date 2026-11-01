package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class r$j implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f1223a;

    r$j(r rVar) {
        this.f1223a = rVar;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        boolean z = i == -1;
        new g2().putInt("odd-vspace", z ? 1 : 2).commit();
        if (z) {
            ConfigListAdapter.m();
        }
    }
}
