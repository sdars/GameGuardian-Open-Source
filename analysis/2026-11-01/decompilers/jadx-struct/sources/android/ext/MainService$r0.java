package android.ext;

import android.util.SparseIntArray;
import android.view.View;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class MainService$r0 extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ MainService f294f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainService$r0(MainService mainService) {
        super(R$string.save_selected, R$drawable.ic_content_save_white_24dp);
        this.f294f = mainService;
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        Object objZ = this.f294f.z();
        int iL0 = Tools.L0(objZ);
        if (iL0 == 0) {
            Tools.H1(R$string.nothing_selected);
            return;
        }
        if (objZ instanceof boolean[]) {
            SparseIntArray sparseIntArray = new SparseIntArray();
            new u2(c.o(this.f294f.N.q((boolean[]) objZ, sparseIntArray)), sparseIntArray, "0", b2.f(R$string.type_change_request), new MainService$r0$a(this, objZ, iL0));
            return;
        }
        if (objZ instanceof d.a) {
            ArrayList<c> arrayList = new ArrayList();
            d.a aVar = (d.a) objZ;
            int i = aVar.i();
            for (int i2 = 0; i2 < i; i2++) {
                if (aVar.c(i2)) {
                    arrayList.add(aVar.f(i2, null));
                }
            }
            for (c cVar : arrayList) {
                h2 h2VarE = this.f294f.t0.e(cVar.f672a);
                if (h2VarE == null || h2VarE.f674c != cVar.f674c) {
                    this.f294f.t0.b(new h2(cVar), (byte) 0, false);
                }
            }
            this.f294f.t0.notifyDataSetChanged();
            this.f294f.t0.i();
            Tools.J1(Tools.L1(b2.f(R$string.items_added), Integer.valueOf(iL0)));
            c2 c2Var = MainService.instance.f216f;
            if (c2Var != null) {
                c2Var.write("\nlocal t = ");
                b0.n(c2Var, true);
                c2Var.write("gg.addListItems(t)\n");
                c2Var.write("t = nil\n\n");
            }
        }
    }
}
