package android.ext;

import android.view.View;
import android.view.WindowManager$LayoutParams;

/* JADX INFO: loaded from: classes.dex */
class Tools$j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WindowManager$LayoutParams f510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f511b;

    Tools$j(WindowManager$LayoutParams windowManager$LayoutParams, View view) {
        this.f510a = windowManager$LayoutParams;
        this.f511b = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        Tools.n1(this.f511b);
        Tools$ViewWrapper tools$ViewWrapper = new Tools$ViewWrapper(this.f511b.getContext());
        tools$ViewWrapper.addView(this.f511b);
        Tools.f(tools$ViewWrapper, this.f510a);
    }
}
