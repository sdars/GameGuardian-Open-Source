package android.ext;

import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.view.View$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class b1$c implements View$OnClickListener {
    b1$c() {
    }

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        f.p(f.c(r.p).setMessage(b2.f(R$string.install_cancel_prompt)).setPositiveButton(R$string.yes, new b1$c$a(this)).setNegativeButton(R$string.no, (DialogInterface$OnClickListener) null).setCancelable(false), r.n);
    }
}
