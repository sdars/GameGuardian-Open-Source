package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class y0$b$b implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ y0$c f1342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ EditText f1343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ y0$b f1344c;

    y0$b$b(y0$b y0_b, y0$c y0_c, EditText editText) {
        this.f1344c = y0_b;
        this.f1342a = y0_c;
        this.f1343b = editText;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1344c.c(this.f1342a, this.f1343b.getText().toString(), true);
    }
}
