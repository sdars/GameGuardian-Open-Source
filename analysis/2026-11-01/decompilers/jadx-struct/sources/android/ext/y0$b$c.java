package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnShowListener;

/* JADX INFO: loaded from: classes.dex */
class y0$b$c implements DialogInterface$OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ EditText f1345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ y0$b f1346b;

    y0$b$c(y0$b y0_b, EditText editText) {
        this.f1346b = y0_b;
        this.f1345a = editText;
    }

    @Override // android.content.DialogInterface$OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Tools.o1(this.f1345a);
        this.f1345a.requestFocus();
    }
}
