package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
public class r$n implements DialogInterface$OnClickListener, View$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1234a;

    public r$n(String str) {
        this.f1234a = str == null ? "kwws=22jdphjxdugldq1qhw2grzqordg" : str;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            Tools.f0().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Tools.removeNewLinesChars(this.f1234a))));
            f.d();
        } catch (Throwable th) {
            e1.s("Failed call activity", th);
        }
    }

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        onClick(null, 0);
    }
}
