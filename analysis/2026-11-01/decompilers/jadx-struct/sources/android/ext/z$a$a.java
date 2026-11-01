package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
class z$a$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ z$a f1386a;

    z$a$a(z$a z_a) {
        this.f1386a = z_a;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        boolean zX;
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse("package:" + Tools.C0()));
        synchronized (z.class) {
            try {
                zX = z.x();
                if (zX) {
                    z.g();
                    s1.x();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.f1386a.f1383a.startActivityForResult(intent, 0);
        } catch (Throwable th2) {
            e1.l("Failed call intent", th2);
            if (zX) {
                s1.g();
            }
        }
    }
}
