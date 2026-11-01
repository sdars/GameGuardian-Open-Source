package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
class q0$b$b implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ CheckBox f1196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ q0$b f1197b;

    q0$b$b(q0$b q0_b, CheckBox checkBox) {
        this.f1197b = q0_b;
        this.f1196a = checkBox;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1196a.setChecked(true);
    }
}
