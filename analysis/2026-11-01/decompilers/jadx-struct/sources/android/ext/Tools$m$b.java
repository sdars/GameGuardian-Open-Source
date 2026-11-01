package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnShowListener;
import android.fix.ScrollView;

/* JADX INFO: loaded from: classes.dex */
class Tools$m$b implements DialogInterface$OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ScrollView f523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Tools$m f524b;

    Tools$m$b(Tools$m tools$m, ScrollView scrollView) {
        this.f524b = tools$m;
        this.f523a = scrollView;
    }

    @Override // android.content.DialogInterface$OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        this.f523a.postDelayed(new Tools$m$b$a(this), 100L);
    }
}
