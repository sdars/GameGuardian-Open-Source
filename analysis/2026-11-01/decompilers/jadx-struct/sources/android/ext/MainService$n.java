package android.ext;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
class MainService$n extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainService f275a;

    MainService$n(MainService mainService) {
        this.f275a = mainService;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        super.onChanged();
        this.f275a.k1();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        super.onInvalidated();
        this.f275a.k1();
    }
}
