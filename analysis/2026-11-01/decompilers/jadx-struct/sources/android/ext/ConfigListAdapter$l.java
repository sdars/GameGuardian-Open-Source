package android.ext;

import android.app.AlertDialog;
import android.view.View;
import android.view.View$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$l implements View$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ EditTextPath f73a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AlertDialog f74b;

    ConfigListAdapter$l(EditTextPath editTextPath, AlertDialog alertDialog) {
        this.f73a = editTextPath;
        this.f74b = alertDialog;
    }

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        String strQ1 = Tools.Q1(this.f73a.getText().toString().trim());
        if (strQ1.length() > 0) {
            if (!Tools.f1(strQ1)) {
                return;
            } else {
                y0.b(strQ1, 4);
            }
        }
        e1.d("save path: " + strQ1);
        new g2().k("temp-path", strQ1, "").commit();
        MainService mainService = MainService.instance;
        mainService.i.B0(mainService.I());
        mainService.q(true);
        Tools.D(this.f74b);
    }
}
