package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$id;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
class f1$c implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ File f959a;

    f1$c(File file) {
        this.f959a = file;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f959a.delete();
        if (i != 0) {
            return;
        }
        Config.b(R$id.selinux).f42d = 1;
        Config.k();
        r.I();
    }
}
