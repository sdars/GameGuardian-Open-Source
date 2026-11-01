package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class MainService$p0$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ MainService$p0 f283c;

    MainService$p0$a(MainService$p0 mainService$p0, int i, Object obj) {
        this.f283c = mainService$p0;
        this.f281a = i;
        this.f282b = obj;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i > 2 && this.f281a == 0) {
            Tools.H1(R$string.nothing_selected);
            return;
        }
        if (i == 0) {
            f.o(f.b().setCustomTitle(Tools.g0(R$string.remove_all2)).setPositiveButton(b2.f(R$string.yes), new MainService$p0$a$a(this)).setNegativeButton(b2.f(R$string.no), (DialogInterface$OnClickListener) null));
            return;
        }
        if (i == 1) {
            n2.d().postDelayed(new MainService$p0$a$b(this, dialogInterface), 1000L);
            return;
        }
        if (i == 2) {
            this.f283c.f280g.L0(this.f282b, null);
        } else if (i != 3) {
            return;
        }
        this.f283c.f280g.H0(this.f282b);
    }
}
