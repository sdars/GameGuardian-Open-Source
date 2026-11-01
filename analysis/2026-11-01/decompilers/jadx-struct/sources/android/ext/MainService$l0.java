package android.ext;

import android.util.SparseIntArray;
import android.view.View;
import catch_.me_.if_.you_.can_.R$drawable;
import catch_.me_.if_.you_.can_.R$string;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class MainService$l0 extends p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ MainService f266g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainService$l0(MainService mainService) {
        super(R$string.export_selected, R$drawable.ic_download_checked_white_24dp);
        this.f266g = mainService;
        this.f265f = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainService$l0(MainService mainService, int i, int i2) {
        super(i, i2);
        this.f266g = mainService;
        this.f265f = 0;
    }

    void h(List list, Object obj) {
        int size = list.size();
        h2[] h2VarArr = new h2[size];
        for (int i = 0; i < size; i++) {
            c cVar = (c) list.get(i);
            h2VarArr[i] = cVar instanceof h2 ? (h2) cVar : new h2(cVar);
        }
        new c1(this.f266g.v0, h2VarArr).f694g = true;
    }

    void i() {
        Object objZ = this.f266g.z();
        if (Tools.L0(objZ) == 0) {
            Tools.H1(R$string.nothing_selected);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (objZ instanceof boolean[]) {
            if (this.f265f == 0) {
                SparseIntArray sparseIntArray = new SparseIntArray();
                new u2(c.o(this.f266g.N.q((boolean[]) objZ, sparseIntArray)), sparseIntArray, "0", b2.f(R$string.type_change_request), new MainService$l0$a(this));
                return;
            }
            n1 n1Var = this.f266g.N;
            boolean[] zArr = (boolean[]) objZ;
            int length = zArr.length - 1;
            for (int i2 = 1; i2 < length; i2++) {
                if (zArr[i2]) {
                    Object item = n1Var.getItem(i2);
                    if (item instanceof c) {
                        c cVar = (c) item;
                        cVar.f674c = this.f265f;
                        if (cVar.V()) {
                            arrayList.add(cVar);
                        }
                    }
                }
            }
            this.f265f = 0;
        } else if (objZ instanceof d.a) {
            d.a aVar = (d.a) objZ;
            int i3 = aVar.i();
            while (i < i3) {
                if (aVar.c(i)) {
                    arrayList.add(aVar.f(i, null));
                }
                i++;
            }
        } else if (objZ instanceof d.e) {
            d.e eVar = (d.e) objZ;
            int iL = eVar.l();
            while (i < iL) {
                if (eVar.a(i)) {
                    h2 h2Var = (h2) eVar.n(i);
                    if (h2Var instanceof h2) {
                        arrayList.add(h2Var);
                    }
                }
                i++;
            }
        }
        h(arrayList, objZ);
    }

    void j() {
        this.f265f = 0;
        i();
    }

    @Override // android.ext.p1, android.view.View$OnClickListener
    public void onClick(View view) {
        j();
    }
}
