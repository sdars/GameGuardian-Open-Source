package android.ext;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import catch_.me_.if_.you_.can_.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class AddressArrayAdapter extends BaseAdapterIndexer implements d3.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static volatile int f23d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d.a f24a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d.a f25b = new d.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f26c = new c();

    public AddressArrayAdapter(d.a aVar) {
        this.f24a = aVar;
        f23d = Tools.M0().getInt("search-results-format", 0);
    }

    private View a(ViewGroup viewGroup) {
        View viewG = a.d.g(R.layout.service_address_item, viewGroup, false);
        new d3(viewG, this);
        return viewG;
    }

    static void b(int i) {
        f23d = i;
        new g2().g("search-results-format", i, 0).commit();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f24a.i();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        try {
            return this.f24a.f(i, null);
        } catch (IndexOutOfBoundsException e2) {
            e1.s("Failed get item in memory list", e2);
            return null;
        }
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        long j;
        long j2;
        int i2;
        boolean z;
        int iD;
        if (view == null || view.getTag() == null) {
            view = a(viewGroup);
        }
        boolean zC = false;
        boolean z2 = (Config.q & (1 << Tools.d1())) == 0 ? 0 : 1;
        d3 d3Var = (d3) view.getTag();
        if (d3Var.b()) {
            view = a(viewGroup);
            d3Var = (d3) view.getTag();
        }
        d3 d3Var2 = d3Var;
        d3Var2.m = i;
        d3Var2.q.setTag(Integer.valueOf(i));
        d3Var2.p.setTag(Integer.valueOf(i));
        d.a aVar = this.f24a;
        c cVar = null;
        if (aVar.i() > i) {
            try {
                c cVarF = aVar.f(i, this.f26c);
                zC = aVar.c(i);
                cVar = cVarF;
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        d3Var2.o.setOrientation(!z2);
        SavedListAdapter.p(d3Var2.q, z2);
        d3Var2.f661a.setChecked(zC);
        d3Var2.f661a.getLayoutParams().height = z2 != 0 ? -2 : Tools.H();
        d3Var2.a(zC, -2);
        if (cVar != null) {
            int iM = cVar.m();
            d3Var2.n.setTextColor(iM);
            d3Var2.p.setTextColor(iM);
            String strH = cVar.H();
            d.a aVar2 = this.f25b;
            MainService.instance.u0.a(cVar.f672a, cVar.f674c, aVar2);
            if (aVar2.f702b) {
                strH = strH + " (" + c.I(cVar.f672a, aVar2.f701a, cVar.f674c) + ')';
            }
            d3Var2.f662b.setText(cVar.F());
            d3Var2.n.setText(strH);
            d3Var2.p.setText(cVar.z());
            d3Var2.j.setText(RegionList.a(cVar.f672a));
            long j3 = cVar.f672a;
            j2 = cVar.f673b;
            i2 = f23d;
            z = true;
            iD = cVar.D();
            j = j3;
        } else {
            d3Var2.f662b.setText("null");
            d3Var2.n.setText("null");
            d3Var2.p.setText("null");
            d3Var2.j.setText("null");
            j = 0;
            j2 = 0;
            i2 = 0;
            z = false;
            iD = 0;
        }
        n1.c(d3Var2, j, j2, i2, z, iD);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        b3 b3Var = (b3) compoundButton.getTag();
        if (b3Var == null) {
            return;
        }
        try {
            this.f24a.b(b3Var.m, z);
            MainService.instance.p1();
        } catch (IndexOutOfBoundsException e2) {
            e1.l("ArrayAdapter onCheckedChanged failed", e2);
        }
        b3Var.a(z, -2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num = (Integer) view.getTag();
        if (num == null) {
            return;
        }
        try {
            c cVarF = this.f24a.f(num.intValue(), this.f26c);
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVarF);
            MainService.instance.i.j0(arrayList);
        } catch (IndexOutOfBoundsException e2) {
            e1.l("ArrayAdapter onClick Failed", e2);
        }
        MainService.instance.D0(false);
    }
}
