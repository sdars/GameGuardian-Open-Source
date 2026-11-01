package android.ext;

import android.content.DialogInterface$OnClickListener;
import android.view.View;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class MainService$o0 extends MainService$l0 {
    final /* synthetic */ MainService h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainService$o0(MainService mainService) {
        super(mainService, R$string.selected_as_search_result, R$drawable.ic_search_selected_white_24dp);
        this.h = mainService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainService$o0(MainService mainService, int i, int i2) {
        super(mainService, i, i2);
        this.h = mainService;
    }

    @Override // android.ext.MainService$l0
    void h(List list, Object obj) {
        c2 c2Var;
        if (list.size() == 0) {
            this.h.n((byte) 0);
            return;
        }
        if (!this.h.a1()) {
            throw new NumberFormatException(b2.f(R$string.busy_dialog_fail));
        }
        if (this.h.p0 != 0) {
            this.h.n((byte) 0);
        }
        MainService mainService = this.h;
        mainService.q0 = false;
        mainService.i.x0((byte) 0);
        this.h.R((byte) 0);
        MainService mainService2 = this.h;
        mainService2.r0 = false;
        mainService2.i.f0((byte) 0, list);
        this.h.m.setCurrentTab(1);
        boolean z = obj instanceof d.a;
        if ((z || (obj instanceof d.e)) && (c2Var = this.h.f216f) != null && z) {
            b0.n(c2Var, true);
        }
    }

    @Override // android.ext.MainService$l0, android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        if (this.h.p0 == 0) {
            j();
        } else {
            f.o(f.b().setMessage(b2.f(R$string.clear_results_prompt)).setPositiveButton(b2.f(R$string.yes), new MainService$o0$a(this)).setNegativeButton(b2.f(R$string.no), (DialogInterface$OnClickListener) null));
        }
    }
}
