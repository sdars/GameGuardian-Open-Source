package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
class z$f implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f1396a;

    z$f(z zVar) {
        this.f1396a = zVar;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        StringBuilder sb = new StringBuilder();
        sb.append("package:");
        sb.append(Config.vSpaceReal ? Config.E : Tools.C0());
        intent.setData(Uri.parse(sb.toString()));
        this.f1396a.f1382a.startActivity(intent);
    }
}
