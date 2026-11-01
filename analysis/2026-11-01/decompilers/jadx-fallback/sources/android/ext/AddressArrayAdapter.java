package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class AddressArrayAdapter extends android.ext.BaseAdapterIndexer implements android.ext.d3.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static volatile int f23d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d.a f24a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.ext.d.a f25b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.ext.c f26c;

    static {
            return
    }

    public AddressArrayAdapter(d.a r3) {
            r2 = this;
            r2.<init>()
            android.ext.d$a r0 = new android.ext.d$a
            r0.<init>()
            r2.f25b = r0
            android.ext.c r0 = new android.ext.c
            r0.<init>()
            r2.f26c = r0
            r2.f24a = r3
            android.content.SharedPreferences r3 = android.ext.Tools.M0()
            java.lang.String r0 = "search-results-format"
            r1 = 0
            int r3 = r3.getInt(r0, r1)
            android.ext.AddressArrayAdapter.f23d = r3
            return
    }

    private android.view.View a(android.view.ViewGroup r3) {
            r2 = this;
            r0 = 2131099672(0x7f060018, float:1.7811704E38)
            r1 = 0
            android.view.View r3 = a.d.g(r0, r3, r1)
            android.ext.d3 r0 = new android.ext.d3
            r0.<init>(r3, r2)
            return r3
    }

    static void b(int r3) {
            android.ext.AddressArrayAdapter.f23d = r3
            android.ext.g2 r0 = new android.ext.g2
            r0.<init>()
            java.lang.String r1 = "search-results-format"
            r2 = 0
            android.ext.g2 r3 = r0.g(r1, r3, r2)
            r3.commit()
            return
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            d.a r0 = r1.f24a
            int r0 = r0.i()
            return r0
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int r3) {
            r2 = this;
            r0 = 0
            d.a r1 = r2.f24a     // Catch: java.lang.IndexOutOfBoundsException -> L8
            android.ext.c r3 = r1.f(r3, r0)     // Catch: java.lang.IndexOutOfBoundsException -> L8
            return r3
        L8:
            r3 = move-exception
            java.lang.String r1 = "Failed get item in memory list"
            android.ext.e1.s(r1, r3)
            return r0
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
            r11 = this;
            if (r13 == 0) goto L8
            java.lang.Object r0 = r13.getTag()
            if (r0 != 0) goto Lc
        L8:
            android.view.View r13 = r11.a(r14)
        Lc:
            int r0 = android.ext.Config.q
            int r1 = android.ext.Tools.d1()
            r2 = 1
            int r1 = r2 << r1
            r0 = r0 & r1
            r1 = 0
            if (r0 == 0) goto L1a
            goto L1b
        L1a:
            r2 = 0
        L1b:
            java.lang.Object r0 = r13.getTag()
            android.ext.d3 r0 = (android.ext.d3) r0
            boolean r3 = r0.b()
            if (r3 == 0) goto L32
            android.view.View r13 = r11.a(r14)
            java.lang.Object r14 = r13.getTag()
            r0 = r14
            android.ext.d3 r0 = (android.ext.d3) r0
        L32:
            r3 = r0
            r3.m = r12
            android.widget.ImageView r14 = r3.q
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r14.setTag(r0)
            android.widget.TextView r14 = r3.p
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r14.setTag(r0)
            d.a r14 = r11.f24a
            int r0 = r14.i()
            r4 = 0
            if (r0 <= r12) goto L5b
            android.ext.c r0 = r11.f26c     // Catch: java.lang.IndexOutOfBoundsException -> L5b
            android.ext.c r0 = r14.f(r12, r0)     // Catch: java.lang.IndexOutOfBoundsException -> L5b
            boolean r1 = r14.c(r12)     // Catch: java.lang.IndexOutOfBoundsException -> L5b
            r4 = r0
        L5b:
            android.widget.LinearLayout r12 = r3.o
            r14 = r2 ^ 1
            r12.setOrientation(r14)
            android.widget.ImageView r12 = r3.q
            android.ext.SavedListAdapter.p(r12, r2)
            android.widget.CheckBox r12 = r3.f661a
            r12.setChecked(r1)
            android.widget.CheckBox r12 = r3.f661a
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            r14 = -2
            if (r2 == 0) goto L77
            r0 = -2
            goto L7b
        L77:
            int r0 = android.ext.Tools.H()
        L7b:
            r12.height = r0
            r3.a(r1, r14)
            if (r4 == 0) goto Lfa
            int r12 = r4.m()
            android.widget.TextView r14 = r3.n
            r14.setTextColor(r12)
            android.widget.TextView r14 = r3.p
            r14.setTextColor(r12)
            java.lang.String r12 = r4.H()
            android.ext.d$a r14 = r11.f25b
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.d r0 = r0.u0
            long r1 = r4.f672a
            int r5 = r4.f674c
            r0.a(r1, r5, r14)
            boolean r0 = r14.f702b
            if (r0 == 0) goto Lc8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r12 = " ("
            r0.append(r12)
            long r1 = r4.f672a
            long r5 = r14.f701a
            int r12 = r4.f674c
            java.lang.String r12 = android.ext.c.I(r1, r5, r12)
            r0.append(r12)
            r12 = 41
            r0.append(r12)
            java.lang.String r12 = r0.toString()
        Lc8:
            android.widget.TextView r14 = r3.f662b
            java.lang.String r0 = r4.F()
            r14.setText(r0)
            android.widget.TextView r14 = r3.n
            r14.setText(r12)
            android.widget.TextView r12 = r3.p
            java.lang.CharSequence r14 = r4.z()
            r12.setText(r14)
            android.widget.TextView r12 = r3.j
            long r0 = r4.f672a
            java.lang.CharSequence r14 = android.ext.RegionList.a(r0)
            r12.setText(r14)
            long r0 = r4.f672a
            long r6 = r4.f673b
            int r8 = android.ext.AddressArrayAdapter.f23d
            r9 = 1
            int r10 = r4.D()
            r4 = r0
        Lf6:
            android.ext.n1.c(r3, r4, r6, r8, r9, r10)
            goto L118
        Lfa:
            android.widget.TextView r12 = r3.f662b
            java.lang.String r14 = "null"
            r12.setText(r14)
            android.widget.TextView r12 = r3.n
            r12.setText(r14)
            android.widget.TextView r12 = r3.p
            r12.setText(r14)
            android.widget.TextView r12 = r3.j
            r12.setText(r14)
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            goto Lf6
        L118:
            return r13
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton r3, boolean r4) {
            r2 = this;
            java.lang.Object r3 = r3.getTag()
            android.ext.b3 r3 = (android.ext.b3) r3
            if (r3 != 0) goto L9
            return
        L9:
            d.a r0 = r2.f24a     // Catch: java.lang.IndexOutOfBoundsException -> L16
            int r1 = r3.m     // Catch: java.lang.IndexOutOfBoundsException -> L16
            r0.b(r1, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L16
            android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.IndexOutOfBoundsException -> L16
            r0.p1()     // Catch: java.lang.IndexOutOfBoundsException -> L16
            goto L1c
        L16:
            r0 = move-exception
            java.lang.String r1 = "ArrayAdapter onCheckedChanged failed"
            android.ext.e1.l(r1, r0)
        L1c:
            r0 = -2
            r3.a(r4, r0)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            java.lang.Object r3 = r3.getTag()
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L9
            return
        L9:
            d.a r0 = r2.f24a     // Catch: java.lang.IndexOutOfBoundsException -> L25
            int r3 = r3.intValue()     // Catch: java.lang.IndexOutOfBoundsException -> L25
            android.ext.c r1 = r2.f26c     // Catch: java.lang.IndexOutOfBoundsException -> L25
            android.ext.c r3 = r0.f(r3, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L25
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.IndexOutOfBoundsException -> L25
            r0.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L25
            r0.add(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L25
            android.ext.MainService r3 = android.ext.MainService.instance     // Catch: java.lang.IndexOutOfBoundsException -> L25
            android.ext.f0 r3 = r3.i     // Catch: java.lang.IndexOutOfBoundsException -> L25
            r3.j0(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L25
            goto L2b
        L25:
            r3 = move-exception
            java.lang.String r0 = "ArrayAdapter onClick Failed"
            android.ext.e1.l(r0, r3)
        L2b:
            android.ext.MainService r3 = android.ext.MainService.instance
            r0 = 0
            r3.D0(r0)
            return
    }
}
