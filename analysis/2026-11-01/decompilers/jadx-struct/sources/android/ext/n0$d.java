package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class n0$d implements DialogInterface$OnClickListener {
    n0$d() {
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        String absolutePath;
        try {
            absolutePath = Tools.f0().getFilesDir().getAbsolutePath();
        } catch (Throwable th) {
            e1.s("Failed get files dir", th);
            absolutePath = "error";
        }
        ConfigListAdapter.a(absolutePath);
    }
}
