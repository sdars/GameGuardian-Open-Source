package android.ext;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class MainService$i extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ MainService f248f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainService$i(MainService mainService, int i, int i2) {
        super(i, i2);
        this.f248f = mainService;
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        this.f248f.N.b();
    }
}
