package android.ext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnMultiChoiceClickListener;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
class d0$b implements DialogInterface$OnMultiChoiceClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean[] f705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ d0 f706b;

    d0$b(d0 d0Var, boolean[] zArr) {
        this.f706b = d0Var;
        this.f705a = zArr;
    }

    @Override // android.content.DialogInterface$OnMultiChoiceClickListener
    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f705a[i] = z;
        if (!z) {
            return;
        }
        if (i < 4) {
            i = 0;
        }
        ListView listView = ((AlertDialog) dialogInterface).getListView();
        if (listView == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.f705a;
            if (i2 >= zArr.length) {
                return;
            }
            if (i != (i2 >= 4 ? i2 : 0)) {
                zArr[i2] = false;
                listView.setItemChecked(i2, false);
            }
            i2++;
        }
    }
}
