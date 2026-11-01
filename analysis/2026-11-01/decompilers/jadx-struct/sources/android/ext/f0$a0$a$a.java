package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class f0$a0$a$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f0$a0$a f805a;

    f0$a0$a$a(f0$a0$a f0_a0_a) {
        this.f805a = f0_a0_a;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (!Config.vSpaceReal || Config.C || (Config.B & 512) == 0) {
            ConfigListAdapter.t(R$string.work_without_root);
        } else {
            Config.b(R$id.config_vspace_root).b();
        }
    }
}
