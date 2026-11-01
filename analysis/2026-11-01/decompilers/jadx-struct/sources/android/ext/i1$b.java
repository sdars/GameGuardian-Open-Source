package android.ext;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class i1$b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f1007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ i1 f1008b;

    i1$b(i1 i1Var, View view) {
        this.f1008b = i1Var;
        this.f1007a = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1007a.requestApplyInsets();
    }
}
