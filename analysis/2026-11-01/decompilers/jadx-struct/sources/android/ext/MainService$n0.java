package android.ext;

import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class MainService$n0 extends MainService$o0 {
    final /* synthetic */ MainService i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainService$n0(MainService mainService) {
        super(mainService, R$string.changed_as_search_result, R$drawable.ic_search_changed_white_24dp);
        this.i = mainService;
    }

    @Override // android.ext.MainService$l0
    void i() {
        d dVar = this.i.u0;
        if (dVar.e() == 0) {
            Tools.J1(b2.f(R$string.changed_not_found));
        } else {
            h(dVar.b(), null);
        }
    }
}
