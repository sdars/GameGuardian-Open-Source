package android.ext;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class MainService$i0 extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ MainService f249f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainService$i0(MainService mainService, int i, int i2) {
        super(i, i2);
        this.f249f = mainService;
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        new c1(this.f249f.v0, null);
    }
}
