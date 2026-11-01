package android.ext;

import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class Config$e$a implements Config$p$b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Config$e f36a;

    Config$e$a(Config$e config$e) {
        this.f36a = config$e;
    }

    @Override // android.ext.Config$p$b
    public void a(int i) {
        StringBuilder sb;
        if ((i & 1) != 0) {
            sb = new StringBuilder();
            sb.append(b2.f(R$string.hide_1_warn));
        } else {
            sb = null;
        }
        if ((i & 8) != 0) {
            if (sb == null) {
                sb = new StringBuilder();
            } else {
                sb.append("\n\n");
            }
            sb.append(b2.f(R$string.hide_4_warn));
        }
        if (sb != null) {
            f.o(f.b().setMessage(sb.toString()).setPositiveButton(R$string.ok, (DialogInterface$OnClickListener) null));
        }
    }
}
