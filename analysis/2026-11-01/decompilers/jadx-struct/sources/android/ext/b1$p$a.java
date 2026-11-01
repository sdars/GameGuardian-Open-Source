package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: loaded from: classes.dex */
class b1$p$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b1$p f631a;

    b1$p$a(b1$p b1_p) {
        this.f631a = b1_p;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i != -1) {
            b1.k(true);
        } else {
            new r$n("kwws=22jdphjxdugldq1qhw2iruxp2wrslf2:6<;0jdwkhulqj0lqirupdwlrq0derxw0jj0huuruv2").onClick(dialogInterface, i);
            n2.d().postDelayed(new b1$p$a$a(this), 5000L);
        }
    }
}
