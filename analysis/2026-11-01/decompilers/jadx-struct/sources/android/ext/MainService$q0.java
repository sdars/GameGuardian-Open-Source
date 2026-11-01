package android.ext;

import android.content.DialogInterface$OnClickListener;
import android.util.SparseIntArray;
import android.view.View;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;

/* JADX INFO: loaded from: classes.dex */
class MainService$q0 extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ MainService f289g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainService$q0(MainService mainService) {
        super(R$string.revert_selected, R$drawable.ic_undo_variant_white_24dp);
        this.f289g = mainService;
        this.f288f = 0;
    }

    void h() {
        Object objZ = this.f289g.z();
        d dVar = new d();
        d dVar2 = this.f289g.u0;
        d$a d_a = new d$a();
        if (!(objZ instanceof boolean[])) {
            this.f289g.L0(objZ, dVar);
        } else if (this.f288f == 0) {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a.e eVarO = c.o(this.f289g.N.q((boolean[]) objZ, sparseIntArray));
            if (sparseIntArray.size() > 0) {
                new u2(eVarO, sparseIntArray, "0", b2.f(R$string.type_change_request), new MainService$q0$a(this));
                return;
            }
        } else {
            n1 n1Var = this.f289g.N;
            boolean[] zArr = (boolean[]) objZ;
            int length = zArr.length - 1;
            for (int i = 1; i < length; i++) {
                if (zArr[i]) {
                    c cVar = new c(n1Var.e(i), 0L, this.f288f);
                    if (cVar.V()) {
                        dVar2.a(cVar.f672a, cVar.f674c, d_a);
                        if (d_a.f702b) {
                            dVar.c(cVar.f672a, cVar.f674c, d_a.f701a);
                        }
                    }
                }
            }
            this.f288f = 0;
        }
        int iE = dVar.e();
        if (iE == 0) {
            Tools.H1(R$string.nothing_to_revert);
        } else {
            f.o(f.b().setCustomTitle(Tools.g0(R$string.revert_selected)).setMessage(Tools.L1(b2.f(R$string.revert_prompt), Integer.valueOf(iE))).setPositiveButton(b2.f(R$string.yes), new MainService$q0$b(this, dVar)).setNegativeButton(b2.f(R$string.no), (DialogInterface$OnClickListener) null));
        }
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        this.f288f = 0;
        h();
    }
}
