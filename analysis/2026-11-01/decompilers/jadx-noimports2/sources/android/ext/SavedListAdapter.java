package android.ext;

/* JADX INFO: loaded from: classes.dex */
public class SavedListAdapter extends android.ext.BaseAdapterIndexer implements android.widget.ListAdapter, android.ext.d3.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static volatile int f360c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.ext.d.a f362b = new android.ext.d.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d.e f361a = new d.e();

    class a implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.h2 f363a;

        a(android.ext.h2 h2Var) {
            this.f363a = h2Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            android.ext.SavedListAdapter.this.k(this.f363a);
        }
    }

    static class b extends android.ext.d3 {
        final android.widget.ImageView r;
        final android.widget.TextView s;

        b(android.view.View view, android.ext.d3.a aVar) {
            super(view, aVar);
            android.widget.ImageView imageViewM = android.ext.Config.m((android.widget.ImageView) view.findViewById(catch_.me_.if_.you_.can_.R.id.freeze));
            this.r = imageViewM;
            imageViewM.setOnClickListener(aVar);
            imageViewM.setOnLongClickListener(aVar);
            this.s = (android.widget.TextView) view.findViewById(catch_.me_.if_.you_.can_.R.id.name);
        }
    }

    public SavedListAdapter() {
        f360c = android.ext.Tools.M0().getInt("saved-list-format", 0);
    }

    private android.view.View g(android.view.ViewGroup viewGroup) {
        android.view.View viewG = a.d.g(catch_.me_.if_.you_.can_.R.layout.service_saved_item, viewGroup, false);
        new android.ext.SavedListAdapter.b(viewG, this);
        return viewG;
    }

    static void o(int i) {
        f360c = i;
        new android.ext.g2().g("saved-list-format", i, 0).commit();
        r();
        android.ext.MainService.instance.t0.notifyDataSetChanged();
    }

    public static void p(android.widget.ImageView imageView, boolean z) {
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i = z ? 24 : 48;
        int iD = android.ext.Config.d();
        if (iD > i) {
            i = iD;
        }
        int iG = (int) android.ext.Tools.G(i);
        layoutParams.height = iG;
        android.ext.Config.p(imageView, iG, iG, iD);
    }

    private void q() {
        this.f361a.m();
        android.ext.MainService.instance.i.f793b.r();
    }

    static void r() {
        java.lang.String str;
        android.widget.TextView textView = android.ext.MainService.instance.w;
        if (textView != null) {
            if (f360c == 0) {
                str = "   ";
            } else {
                str = java.lang.Integer.bitCount(f360c) == 1 ? "  " : "";
            }
            textView.setText(android.ext.Tools.x("F: ", android.ext.n1.B(f360c), str));
        }
    }

    public void a(android.ext.h2 h2Var) {
        b(h2Var, (byte) 0, true);
    }

    public void b(android.ext.h2 h2Var, byte b2, boolean z) {
        android.ext.f0 f0Var = android.ext.MainService.instance.i;
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
        android.ext.h2 h2Var2 = (android.ext.h2) this.f361a.i(h2Var.i(), h2Var, b2);
        if (h2Var2 != null && h2Var2.m && !h2Var.m) {
            f0Var.c(h2Var);
        }
        if (z) {
            notifyDataSetChanged();
        }
    }

    public void c() {
        android.ext.MainService.instance.i.n();
        q();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public android.ext.h2 getItem(int i) {
        return (android.ext.h2) this.f361a.n(i);
    }

    public android.ext.h2 e(long j) {
        android.ext.h2 h2Var = (android.ext.h2) this.f361a.e(j);
        if (h2Var == null) {
            return null;
        }
        return h2Var;
    }

    public d.e f() {
        return this.f361a;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f361a.l();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        android.ext.h2 h2Var = (android.ext.h2) this.f361a.n(i);
        if (h2Var == null) {
            return 0L;
        }
        return h2Var.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        android.ext.h2 h2Var;
        if (view == null) {
            view = g(viewGroup);
        }
        android.ext.SavedListAdapter.b bVar = (android.ext.SavedListAdapter.b) view.getTag();
        if (bVar.b()) {
            view = g(viewGroup);
            bVar = (android.ext.SavedListAdapter.b) view.getTag();
        }
        boolean zA = false;
        boolean z = (android.ext.Config.q & (1 << (android.ext.Tools.d1() + 2))) == 0 ? 0 : 1;
        if (i >= this.f361a.l()) {
            h2Var = new android.ext.h2(0L, 0L, 4, "null for " + i);
        } else {
            h2Var = (android.ext.h2) this.f361a.n(i);
            zA = this.f361a.a(i);
        }
        bVar.m = i;
        p(bVar.r, z);
        bVar.s.getLayoutParams().width = z != 0 ? -2 : -1;
        bVar.o.setOrientation(!z);
        p(bVar.q, z);
        bVar.f661a.getLayoutParams().height = z != 0 ? -2 : android.ext.Tools.H();
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
        java.lang.String strJ = h2Var.J();
        android.ext.d.a aVar = this.f362b;
        android.ext.MainService.instance.u0.a(h2Var.f672a, h2Var.f674c, aVar);
        if (aVar.f702b) {
            strJ = strJ + " (" + android.ext.c.I(h2Var.f672a, aVar.f701a, h2Var.f674c) + ')';
        }
        bVar.s.setText(h2Var.b0());
        bVar.p.setText(h2Var.z());
        bVar.j.setText(android.ext.RegionList.a(h2Var.f672a));
        bVar.f662b.setText(h2Var.F() + ": ");
        bVar.n.setText(strJ);
        bVar.r.setImageResource(h2Var.Z());
        android.ext.n1.c(bVar, h2Var.f672a, h2Var.f673b, f360c, true, h2Var.D());
        return view;
    }

    public void h(android.ext.w wVar) {
        android.ext.h2 h2Var;
        wVar.j();
        android.widget.ListView listView = android.ext.MainService.instance.L;
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int lastVisiblePosition = listView.getLastVisiblePosition();
        d.e eVar = this.f361a;
        boolean z = false;
        while (wVar.f() != 0) {
            try {
                long jG = wVar.g();
                long jH = wVar.h();
                int iG = eVar.g(jG);
                if (iG >= 0 && (h2Var = (android.ext.h2) eVar.n(iG)) != null && h2Var.f673b != jH) {
                    if (firstVisiblePosition <= iG && iG <= lastVisiblePosition) {
                        z = true;
                    }
                    h2Var.f673b = jH;
                }
            } catch (java.io.IOException e2) {
                android.ext.e1.l("???", e2);
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
        android.ext.f0 f0Var = android.ext.MainService.instance.i;
        f0Var.B();
        d.e eVar = this.f361a;
        if (eVar.l() == 0) {
            return;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(eVar.l());
            for (int i = 0; i < eVar.l(); i++) {
                try {
                    android.ext.h2 h2Var = (android.ext.h2) eVar.n(i);
                    if (h2Var != null) {
                        arrayList.add(h2Var);
                    }
                } catch (java.lang.IndexOutOfBoundsException e2) {
                    android.ext.e1.s("list changed", e2);
                }
            }
            if (arrayList.size() == 0) {
                return;
            }
            int size = arrayList.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            for (int i2 = 0; i2 < size; i2++) {
                android.ext.c cVar = (android.ext.c) arrayList.get(i2);
                iArr[i2] = cVar.f674c;
                jArr[i2] = cVar.f672a;
            }
            f0Var.S(iArr, jArr);
        } catch (java.lang.OutOfMemoryError e3) {
            android.ext.e1.s("OOM in reloadData", e3);
        }
    }

    public void j(int i) {
        android.ext.h2 h2Var = (android.ext.h2) this.f361a.j(i);
        if (h2Var != null) {
            if (h2Var.m) {
                android.ext.f0 f0Var = android.ext.MainService.instance.i;
                f0Var.c(h2Var);
                f0Var.B();
            }
            if (this.f361a.l() == 0) {
                q();
            }
            notifyDataSetChanged();
        }
    }

    public void k(android.ext.h2 h2Var) {
        n(h2Var.i());
    }

    public void l(java.util.List list) {
        android.ext.h2 h2Var;
        d.e eVar = this.f361a;
        android.ext.f0 f0Var = android.ext.MainService.instance.i;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.ext.h2 h2Var2 = (android.ext.h2) it.next();
            if (h2Var2 != null && (h2Var = (android.ext.h2) eVar.c(h2Var2.i())) != null && h2Var.m) {
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
        d.e eVar = this.f361a;
        android.ext.f0 f0Var = android.ext.MainService.instance.i;
        for (int i2 = 0; i2 < i; i2++) {
            android.ext.h2 h2Var = (android.ext.h2) eVar.c(jArr[i2]);
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
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
        android.ext.b3 b3Var = (android.ext.b3) compoundButton.getTag();
        if (b3Var == null) {
            return;
        }
        try {
            this.f361a.k(b3Var.m, z);
            android.ext.MainService.instance.p1();
        } catch (java.lang.IndexOutOfBoundsException e2) {
            android.ext.e1.l("ArrayAdapter onCheckedChanged failed", e2);
        }
        b3Var.a(z, -2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int id = view.getId();
        if (id == catch_.me_.if_.you_.can_.R.id.addr_item_remove) {
            android.ext.h2 h2Var = (android.ext.h2) view.getTag();
            if (h2Var == null) {
                return;
            }
            try {
                android.ext.f.o(android.ext.f.b().setCustomTitle(android.ext.Tools.h0(h2Var.b0())).setMessage(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.delete_prompt)).setPositiveButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.yes), new android.ext.SavedListAdapter.a(h2Var)).setNegativeButton(android.ext.b2.f(catch_.me_.if_.you_.can_.R.string.no), (android.content.DialogInterface.OnClickListener) null));
                return;
            } catch (java.lang.IndexOutOfBoundsException e2) {
                android.ext.e1.l("SavedListAdapter onClick Failed", e2);
                return;
            }
        }
        if (id == catch_.me_.if_.you_.can_.R.id.address) {
            android.ext.b3 b3Var = (android.ext.b3) view.getTag();
            if (b3Var != null) {
                android.ext.Tools.s(b3Var.f661a);
                return;
            }
            return;
        }
        if (id != catch_.me_.if_.you_.can_.R.id.freeze) {
            return;
        }
        android.ext.h2 h2VarC = ((android.ext.h2) view.getTag()).c();
        h2VarC.m = !h2VarC.m;
        a(h2VarC);
        if (view instanceof android.widget.ImageButton) {
            ((android.widget.ImageButton) view).setImageResource(h2VarC.Z());
        }
        android.ext.MainService.instance.i.B();
    }
}
