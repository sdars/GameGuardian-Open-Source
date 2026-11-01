package android.ext;

import android.view.View;
import android.view.View$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class p1$a implements View$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ p1 f1175a;

    p1$a(p1 p1Var) {
        this.f1175a = p1Var;
    }

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        this.f1175a.e(view);
    }
}
