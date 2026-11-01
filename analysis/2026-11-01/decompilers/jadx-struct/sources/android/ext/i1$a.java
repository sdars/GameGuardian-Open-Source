package android.ext;

import android.view.View;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
class i1$a implements View$OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ i1 f1006a;

    i1$a(i1 i1Var) {
        this.f1006a = i1Var;
    }

    @Override // android.view.View$OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.f1006a.c(i1.f(windowInsets));
        return windowInsets;
    }
}
