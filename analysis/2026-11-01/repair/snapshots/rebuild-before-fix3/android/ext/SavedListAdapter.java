package android.ext;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import catch_.me_.if_.you_.can_.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SavedListAdapter extends BaseAdapterIndexer implements ListAdapter, d3.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static volatile int f360c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ggd.a f362b = new ggd.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ggd.e f361a = new ggd.e();

    class a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h2 f363a;

        a(h2 h2Var) {
            this.f363a = h2Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            SavedListAdapter.this.k(this.f363a);
        }
    }

    static class b extends d3 {
        final ImageView r;
        final TextView s;

        b(View view, d3.a aVar) {
            super(view, aVar);
            ImageView imageViewM = Config.m((ImageView) view.findViewById(R.id.freeze));
            this.r = imageViewM;
            imageViewM.setOnClickListener(aVar);
            imageViewM.setOnLongClickListener(aVar);
            this.s = (TextView) view.findViewById(R.id.name);
        }
    }

    public SavedListAdapter() {
        f360c = Tools.M0().getInt("saved-list-format", 0);
    }

    private View g(ViewGroup viewGroup) {
        View viewG = gga.d.g(R.layout.service_saved_item, viewGroup, false);
        new b(viewG, this);
        return viewG;
    }

    static void o(int i) {
        f360c = i;
        new g2().g("saved-list-format", i, 0).commit();
        r();
        MainService.instance.t0.notifyDataSetChanged();
    }

    public static void p(ImageView imageView, boolean z) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i = z ? 24 : 48;
        int iD = Config.d();
        if (iD > i) {
            i = iD;
        }
        int iG = (int) Tools.G(i);
        layoutParams.height = iG;
        Config.p(imageView, iG, iG, iD);
    }

    private void q() {
        this.f361a.m();
        MainService.instance.i.f793b.r();
    }

    static void r() {
        String str;
        TextView textView = MainService.instance.w;
        if (textView != null) {
            if (f360c == 0) {
                str = "   ";
            } else {
                str = Integer.bitCount(f360c) == 1 ? "  " : "";
            }
            textView.setText(Tools.x("F: ", n1.B(f360c), str));
        }
    }

    public void a(h2 h2Var) {
        b(h2Var, (byte) 0, true);
    }

    public void b(h2 h2Var, byte b2, boolean z) {
        f0 f0Var = MainService.instance.i;
        if ((h2Var.f674c & 1073741824) == 1073741824) {
            h2Var = h2Var.c();
        }
        if (h2Var.m) {
            h2Var.f674c &= -1073741825;
            f0Var.b(h2Var);
        } else {
            int i = h2Var.f674c;
            if ((i & 1073741824) == 1073741824) {
                h2Var.f674c = i & (-1073741825);
            }
        }
        h2 h2Var2 = (h2) this.f361a.i(h2Var.i(), h2Var, b2);
        if (h2Var2 != null && h2Var2.m && !h2Var.m) {
            f0Var.c(h2Var);
        }
        if (z) {
            notifyDataSetChanged();
        }
    }

    public void c() {
        MainService.instance.i.n();
        q();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public h2 getItem(int i) {
        return (h2) this.f361a.n(i);
    }

    public h2 e(long j) {
        h2 h2Var = (h2) this.f361a.e(j);
        if (h2Var == null) {
            return null;
        }
        return h2Var;
    }

    public ggd.e f() {
        return this.f361a;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f361a.l();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        h2 h2Var = (h2) this.f361a.n(i);
        if (h2Var == null) {
            return 0L;
        }
        return h2Var.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        h2 h2Var;
        if (view == null) {
            view = g(viewGroup);
        }
        b bVar = (b) view.getTag();
        if (bVar.b()) {
            view = g(viewGroup);
            bVar = (b) view.getTag();
        }
        boolean zA = false;
        boolean z = (Config.q & (1 << (Tools.d1() + 2))) == 0 ? 0 : 1;
        if (i >= this.f361a.l()) {
            h2Var = new h2(0L, 0L, 4, "null for " + i);
        } else {
            h2Var = (h2) this.f361a.n(i);
            zA = this.f361a.a(i);
        }
        bVar.m = i;
        p(bVar.r, z);
        bVar.s.getLayoutParams().width = z != 0 ? -2 : -1;
        bVar.o.setOrientation(!z);
        p(bVar.q, z);
        bVar.f661a.getLayoutParams().height = z != 0 ? -2 : Tools.H();
        bVar.r.setTag(h2Var);
        if (bVar.f661a.isChecked() != zA) {
            bVar.f661a.setOnCheckedChangeListener(null);
            bVar.f661a.setChecked(zA);
        }
        bVar.f661a.setOnCheckedChangeListener(this);
        bVar.p.setTag(h2Var);
        bVar.q.setTag(h2Var);
        bVar.a(zA, -2);
        int iM = h2Var.m();
        bVar.n.setTextColor(iM);
        bVar.p.setTextColor(iM);
        String strJ = h2Var.J();
        ggd.a aVar = this.f362b;
        MainService.instance.u0.a(h2Var.f672a, h2Var.f674c, aVar);
        if (aVar.f702b) {
            strJ = strJ + " (" + ggc.I(h2Var.f672a, aVar.f701a, h2Var.f674c) + ')';
        }
        bVar.s.setText(h2Var.b0());
        bVar.p.setText(h2Var.z());
        bVar.j.setText(RegionList.a(h2Var.f672a));
        bVar.f662b.setText(h2Var.F() + ": ");
        bVar.n.setText(strJ);
        bVar.r.setImageResource(h2Var.Z());
        n1.c(bVar, h2Var.f672a, h2Var.f673b, f360c, true, h2Var.D());
        return view;
    }

    public void h(w wVar) {
        h2 h2Var;
        wVar.j();
        ListView listView = MainService.instance.L;
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int lastVisiblePosition = listView.getLastVisiblePosition();
        ggd.e eVar = this.f361a;
        boolean z = false;
        while (wVar.f() != 0) {
            try {
                long jG = wVar.g();
                long jH = wVar.h();
                int iG = eVar.g(jG);
                if (iG >= 0 && (h2Var = (h2) eVar.n(iG)) != null && h2Var.f673b != jH) {
                    if (firstVisiblePosition <= iG && iG <= lastVisiblePosition) {
                        z = true;
                    }
                    h2Var.f673b = jH;
                }
            } catch (IOException e2) {
                e1.l("???", e2);
            }
        }
        if (z) {
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public void i() {
        f0 f0Var = MainService.instance.i;
        f0Var.B();
        ggd.e eVar = this.f361a;
        if (eVar.l() == 0) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList(eVar.l());
            for (int i = 0; i < eVar.l(); i++) {
                try {
                    h2 h2Var = (h2) eVar.n(i);
                    if (h2Var != null) {
                        arrayList.add(h2Var);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    e1.s("list changed", e2);
                }
            }
            if (arrayList.size() == 0) {
                return;
            }
            int size = arrayList.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            for (int i2 = 0; i2 < size; i2++) {
                c cVar = (c) arrayList.get(i2);
                iArr[i2] = cVar.f674c;
                jArr[i2] = cVar.f672a;
            }
            f0Var.S(iArr, jArr);
        } catch (OutOfMemoryError e3) {
            e1.s("OOM in reloadData", e3);
        }
    }

    public void j(int i) {
        h2 h2Var = (h2) this.f361a.j(i);
        if (h2Var != null) {
            if (h2Var.m) {
                f0 f0Var = MainService.instance.i;
                f0Var.c(h2Var);
                f0Var.B();
            }
            if (this.f361a.l() == 0) {
                q();
            }
            notifyDataSetChanged();
        }
    }

    public void k(h2 h2Var) {
        n(h2Var.i());
    }

    public void l(List list) {
        h2 h2Var;
        ggd.e eVar = this.f361a;
        f0 f0Var = MainService.instance.i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h2 h2Var2 = (h2) it.next();
            if (h2Var2 != null && (h2Var = (h2) eVar.c(h2Var2.i())) != null && h2Var.m) {
                f0Var.c(h2Var);
            }
        }
        f0Var.B();
        if (eVar.l() == 0) {
            q();
        }
        notifyDataSetChanged();
    }

    public void m(long[] jArr, int i) {
        ggd.e eVar = this.f361a;
        f0 f0Var = MainService.instance.i;
        for (int i2 = 0; i2 < i; i2++) {
            h2 h2Var = (h2) eVar.c(jArr[i2]);
            if (h2Var != null && h2Var.m) {
                f0Var.c(h2Var);
            }
        }
        f0Var.B();
        if (eVar.l() == 0) {
            q();
        }
        notifyDataSetChanged();
    }

    public void n(long j) {
        int iG = this.f361a.g(j);
        if (iG >= 0) {
            j(iG);
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        b3 b3Var = (b3) compoundButton.getTag();
        if (b3Var == null) {
            return;
        }
        try {
            this.f361a.k(b3Var.m, z);
            MainService.instance.p1();
        } catch (IndexOutOfBoundsException e2) {
            e1.l("ArrayAdapter onCheckedChanged failed", e2);
        }
        b3Var.a(z, -2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.addr_item_remove) {
            h2 h2Var = (h2) view.getTag();
            if (h2Var == null) {
                return;
            }
            try {
                ggf.o(ggf.b().setCustomTitle(Tools.h0(h2Var.b0())).setMessage(b2.f(R.string.delete_prompt)).setPositiveButton(b2.f(R.string.yes), new a(h2Var)).setNegativeButton(b2.f(R.string.no), (DialogInterface.OnClickListener) null));
                return;
            } catch (IndexOutOfBoundsException e2) {
                e1.l("SavedListAdapter onClick Failed", e2);
                return;
            }
        }
        if (id == R.id.address) {
            b3 b3Var = (b3) view.getTag();
            if (b3Var != null) {
                Tools.s(b3Var.f661a);
                return;
            }
            return;
        }
        if (id != R.id.freeze) {
            return;
        }
        h2 h2VarC = ((h2) view.getTag()).c();
        h2VarC.m = !h2VarC.m;
        a(h2VarC);
        if (view instanceof ImageButton) {
            ((ImageButton) view).setImageResource(h2VarC.Z());
        }
        MainService.instance.i.B();
    }
}
