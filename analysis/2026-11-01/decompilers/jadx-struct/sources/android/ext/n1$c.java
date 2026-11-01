package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnMultiChoiceClickListener;

/* JADX INFO: loaded from: classes.dex */
class n1$c implements DialogInterface$OnMultiChoiceClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean[] f1126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ n1 f1127b;

    n1$c(n1 n1Var, boolean[] zArr) {
        this.f1127b = n1Var;
        this.f1126a = zArr;
    }

    @Override // android.content.DialogInterface$OnMultiChoiceClickListener
    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f1126a[i] = z;
    }
}
