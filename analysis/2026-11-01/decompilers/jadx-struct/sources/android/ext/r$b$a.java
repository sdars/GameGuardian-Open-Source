package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
class r$b$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ r$b f1215a;

    r$b$a(r$b r_b) {
        this.f1215a = r_b;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            r.p.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2iruxp2wrslf24<7540yluwxdo0vsdfhv0wr0uxq0jdphjxdugldq0zlwkrxw0urrw2"))));
        } catch (Throwable th) {
            e1.s("Failed call activity", th);
        }
        new p0(1400).onClick(null, 0);
    }
}
