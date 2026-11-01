package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class Tools$m$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextView f521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Tools$m f522b;

    Tools$m$a(Tools$m tools$m, TextView textView) {
        this.f522b = tools$m;
        this.f521a = textView;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        Tools.A(this.f521a.getText().toString().trim(), false);
    }
}
