package android.ext;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class OffsetCalculator$a implements DialogInterface$OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ OffsetCalculator f318a;

    OffsetCalculator$a(OffsetCalculator offsetCalculator) {
        this.f318a = offsetCalculator;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        SavedListAdapter savedListAdapter = MainService.instance.t0;
        h2 h2Var = new h2(this.f318a.f316f, 0L, i);
        if (!h2Var.V()) {
            h2Var.f674c = c.S(h2Var.f672a, true);
        }
        h2 h2VarE = savedListAdapter.e(this.f318a.f316f);
        if (h2VarE == null || h2VarE.f674c != h2Var.f674c) {
            savedListAdapter.a(h2Var);
            savedListAdapter.i();
        }
        Tools.J1(Tools.L1(b2.f(R$string.items_added), 1));
    }
}
