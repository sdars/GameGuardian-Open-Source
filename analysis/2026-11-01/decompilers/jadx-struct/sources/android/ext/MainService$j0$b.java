package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class MainService$j0$b implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String[] f256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ MainService$j0 f257b;

    MainService$j0$b(MainService$j0 mainService$j0, String[] strArr) {
        this.f257b = mainService$j0;
        this.f256a = strArr;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        Tools.z(this.f256a[i]);
        Tools.D(dialogInterface);
    }
}
