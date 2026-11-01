package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class x2$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a.e f1310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f1311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean[] f1312c;

    x2$a(a.e eVar, Runnable runnable, boolean[] zArr) {
        this.f1310a = eVar;
        this.f1311b = runnable;
        this.f1312c = zArr;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        e1.d("Un: no");
        if (x2.r(this.f1310a, this.f1311b)) {
            this.f1312c[0] = true;
        }
    }
}
