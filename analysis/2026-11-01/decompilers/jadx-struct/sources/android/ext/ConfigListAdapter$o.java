package android.ext;

import android.app.AlertDialog;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$o implements View$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ EditTextPath f78a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ CheckBox f79b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AlertDialog f80c;

    ConfigListAdapter$o(EditTextPath editTextPath, CheckBox checkBox, AlertDialog alertDialog) {
        this.f78a = editTextPath;
        this.f79b = checkBox;
        this.f80c = alertDialog;
    }

    void a(String str) {
        n2.i(new ConfigListAdapter$o$c(this));
        Tools.h(str + "\n\n" + e2.f745a, 0);
    }

    void b() {
        n2.i(new ConfigListAdapter$o$b(this));
    }

    void c(String str, boolean z) {
        e1.d("su path: " + str + "; sh: " + z);
        new g2().k("su", str, "").c("sh", z, false).commit();
        if (str.length() != 0) {
            y0.b(str, 4);
        }
        Tools.D(this.f80c);
        ConfigListAdapter.m();
    }

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        String strTrim = this.f78a.getText().toString().trim();
        if (strTrim.length() <= 0) {
            c(strTrim, this.f79b.isChecked());
            return;
        }
        new n0$i(new ConfigListAdapter$o$a(this, strTrim), "CheckSu: " + strTrim).start();
    }
}
