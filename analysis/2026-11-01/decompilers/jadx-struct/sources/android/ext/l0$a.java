package android.ext;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class l0$a extends InternalKeyboard$e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l0 f1057a;

    l0$a(l0 l0Var) {
        this.f1057a = l0Var;
    }

    @Override // android.ext.InternalKeyboard$e
    protected boolean a(View view, boolean z) {
        return this.f1057a.u() || view == this.f1057a.f1055f;
    }
}
