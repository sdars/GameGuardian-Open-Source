package android.ext;

import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.view.View$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class Config$q$a implements View$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Config$q f46a;

    Config$q$a(Config$q config$q) {
        this.f46a = config$q;
    }

    @Override // android.view.View$OnClickListener
    public void onClick(View view) {
        f.o(f.b().setMessage(b2.f(this.f46a.f39a) + '\n' + b2.f(this.f46a.h)).setNegativeButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null));
    }
}
