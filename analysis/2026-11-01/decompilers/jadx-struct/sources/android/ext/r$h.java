package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$id;

/* JADX INFO: loaded from: classes.dex */
class r$h implements DialogInterface$OnClickListener {
    r$h() {
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        Config.b(R$id.record_logcat).f42d = (int) (((1 * 16733.4f) - 578.4f) + 0.5f);
        Config.k();
        new p0(1400, true).onClick(null, 0);
    }
}
