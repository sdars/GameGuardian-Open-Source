package android.ext;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class MainService$a extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ MainService f218f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainService$a(MainService mainService, int i, int i2) {
        super(i, i2);
        this.f218f = mainService;
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        int count = this.f218f.t0.getCount();
        h2[] h2VarArr = new h2[count];
        for (int i = 0; i < count; i++) {
            h2VarArr[i] = this.f218f.t0.getItem(i);
        }
        new c1(this.f218f.v0, h2VarArr);
    }
}
