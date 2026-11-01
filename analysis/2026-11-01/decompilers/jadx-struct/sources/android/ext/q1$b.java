package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
class q1$b implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ q1 f1203a;

    q1$b(q1 q1Var) {
        this.f1203a = q1Var;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            this.f1203a.f1198a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Tools.removeNewLinesChars(this.f1203a.g()))));
        } catch (Throwable th) {
            e1.s("Failed call activity", th);
        }
    }
}
