package android.ext;

import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R$id;
import catch_.me_.if_.you_.can_.R$layout;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class f1$b$a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ StringBuilder f956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ f1$b f958c;

    f1$b$a(f1$b f1_b, StringBuilder sb, String str) {
        this.f958c = f1_b;
        this.f956a = sb;
        this.f957b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        View viewF = a.d.f(R$layout.main_new_version, null);
        Tools.v1((TextView) viewF.findViewById(R$id.changelog), this.f956a.toString());
        f.o(f.b().setCustomTitle(Tools.h0(Tools.L1(b2.f(R$string.found_new_version), this.f957b))).setView(viewF).setCancelable(false).setPositiveButton(b2.f(R$string.download_it), new r$n(null)).setNegativeButton(b2.f(R$string.ok), (DialogInterface$OnClickListener) null));
    }
}
