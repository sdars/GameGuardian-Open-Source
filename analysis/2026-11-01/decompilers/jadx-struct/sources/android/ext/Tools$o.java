package android.ext;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
class Tools$o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f529a;

    Tools$o(View view) {
        this.f529a = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        ViewParent parent = this.f529a.getParent();
        if (parent instanceof Tools$ViewWrapper) {
            Tools$ViewWrapper tools$ViewWrapper = (Tools$ViewWrapper) parent;
            Tools.m1(tools$ViewWrapper);
            tools$ViewWrapper.removeAllViews();
        }
    }
}
