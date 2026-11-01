package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class x2$d implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f1317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.e f1318b;

    x2$d(int i, a.e eVar) {
        this.f1317a = i;
        this.f1318b = eVar;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -3) {
            new g2().putInt("skip-old", this.f1317a).commit();
            return;
        }
        boolean z = false;
        for (int i2 = 0; i2 < this.f1318b.size(); i2++) {
            String str = ((x2$h) this.f1318b.valueAt(i2)).f1323a;
            if (Tools.e1(str) && x2.t(str)) {
                z = true;
            }
        }
        if (z) {
            s1.H();
        } else {
            s1.e();
        }
    }
}
