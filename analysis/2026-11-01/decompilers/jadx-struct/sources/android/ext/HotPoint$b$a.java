package android.ext;

import android.view.View;
import android.view.View$OnLayoutChangeListener;

/* JADX INFO: loaded from: classes.dex */
class HotPoint$b$a implements View$OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ HotPoint$b f160a;

    HotPoint$b$a(HotPoint$b hotPoint$b) {
        this.f160a = hotPoint$b;
    }

    @Override // android.view.View$OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f160a.f159a.o();
    }
}
