package android.ext;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class n1$d$b extends InternalKeyboard$e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ n1$d f1131a;

    n1$d$b(n1$d n1_d) {
        this.f1131a = n1_d;
    }

    @Override // android.ext.InternalKeyboard$e
    protected boolean a(View view, boolean z) {
        return this.f1131a.i;
    }
}
