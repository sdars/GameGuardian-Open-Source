package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
class r$c implements DialogInterface$OnClickListener {
    r$c() {
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            r.p.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/android/answer/6088895")));
        } catch (Throwable th) {
            e1.s("Failed call activity", th);
        }
    }
}
