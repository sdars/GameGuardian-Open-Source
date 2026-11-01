package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class SavedListAdapter extends android.ext.BaseAdapterIndexer implements android.widget.ListAdapter, android.ext.d3.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static volatile int f360c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d.e f361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.ext.d.a f362b;

    class a implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.h2 f363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.SavedListAdapter f364b;

        a(android.ext.SavedListAdapter r1, android.ext.h2 r2) {
                r0 = this;
                r0.f364b = r1
                r0.f363a = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.ext.SavedListAdapter r1 = r0.f364b
                android.ext.h2 r2 = r0.f363a
                r1.k(r2)
                return
        }
    }

    static class b extends android.ext.d3 {
        final android.widget.ImageView r;
        final android.widget.TextView s;

        b(android.view.View r2, android.ext.d3.a r3) {
                r1 = this;
                r1.<init>(r2, r3)
                r0 = 2131034265(0x7f050099, float:1.7679043E38)
                android.view.View r0 = r2.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                android.widget.ImageView r0 = android.ext.Config.m(r0)
                r1.r = r0
                r0.setOnClickListener(r3)
                r0.setOnLongClickListener(r3)
                r3 = 2131034337(0x7f0500e1, float:1.7679189E38)
                android.view.View r2 = r2.findViewById(r3)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r1.s = r2
                return
        }
    }

    static {
            return
    }

    public SavedListAdapter() {
            r3 = this;
            r3.<init>()
            android.ext.d$a r0 = new android.ext.d$a
            r0.<init>()
            r3.f362b = r0
            d.e r0 = new d.e
            r0.<init>()
            r3.f361a = r0
            android.content.SharedPreferences r0 = android.ext.Tools.M0()
            java.lang.String r1 = "saved-list-format"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            android.ext.SavedListAdapter.f360c = r0
            return
    }

    private android.view.View g(android.view.ViewGroup r3) {
            r2 = this;
            r0 = 2131099684(0x7f060024, float:1.7811728E38)
            r1 = 0
            android.view.View r3 = a.d.g(r0, r3, r1)
            android.ext.SavedListAdapter$b r0 = new android.ext.SavedListAdapter$b
            r0.<init>(r3, r2)
            return r3
    }

    static void o(int r3) {
            android.ext.SavedListAdapter.f360c = r3
            android.ext.g2 r0 = new android.ext.g2
            r0.<init>()
            java.lang.String r1 = "saved-list-format"
            r2 = 0
            android.ext.g2 r3 = r0.g(r1, r3, r2)
            r3.commit()
            r()
            android.ext.MainService r3 = android.ext.MainService.instance
            android.ext.SavedListAdapter r3 = r3.t0
            r3.notifyDataSetChanged()
            return
    }

    public static void p(android.widget.ImageView r2, boolean r3) {
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            if (r3 == 0) goto L9
            r3 = 24
            goto Lb
        L9:
            r3 = 48
        Lb:
            int r1 = android.ext.Config.d()
            if (r1 <= r3) goto L12
            r3 = r1
        L12:
            float r3 = (float) r3
            float r3 = android.ext.Tools.G(r3)
            int r3 = (int) r3
            r0.height = r3
            android.ext.Config.p(r2, r3, r3, r1)
            return
    }

    private void q() {
            r1 = this;
            d.e r0 = r1.f361a
            r0.m()
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.f0 r0 = r0.i
            android.ext.InOut r0 = r0.f793b
            r0.r()
            return
    }

    static void r() {
            android.ext.MainService r0 = android.ext.MainService.instance
            android.widget.TextView r0 = r0.w
            if (r0 == 0) goto L35
            int r1 = android.ext.SavedListAdapter.f360c
            r2 = 1
            if (r1 != 0) goto Le
            java.lang.String r1 = "   "
            goto L1b
        Le:
            int r1 = android.ext.SavedListAdapter.f360c
            int r1 = java.lang.Integer.bitCount(r1)
            if (r1 != r2) goto L19
            java.lang.String r1 = "  "
            goto L1b
        L19:
            java.lang.String r1 = ""
        L1b:
            r3 = 3
            java.lang.CharSequence[] r3 = new java.lang.CharSequence[r3]
            r4 = 0
            java.lang.String r5 = "F: "
            r3[r4] = r5
            int r4 = android.ext.SavedListAdapter.f360c
            java.lang.CharSequence r4 = android.ext.n1.B(r4)
            r3[r2] = r4
            r2 = 2
            r3[r2] = r1
            java.lang.CharSequence r1 = android.ext.Tools.x(r3)
            r0.setText(r1)
        L35:
            return
    }

    public void a(android.ext.h2 r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.b(r3, r0, r1)
            return
    }

    public void b(android.ext.h2 r6, byte r7, boolean r8) {
            r5 = this;
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.f0 r0 = r0.i
            int r1 = r6.f674c
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 != r2) goto Lf
            android.ext.h2 r6 = r6.Y()
        Lf:
            boolean r1 = r6.m
            r3 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            if (r1 == 0) goto L1f
            int r1 = r6.f674c
            r1 = r1 & r3
            r6.f674c = r1
            r0.b(r6)
            goto L28
        L1f:
            int r1 = r6.f674c
            r4 = r1 & r2
            if (r4 != r2) goto L28
            r1 = r1 & r3
            r6.f674c = r1
        L28:
            long r1 = r6.i()
            d.e r3 = r5.f361a
            java.lang.Object r7 = r3.i(r1, r6, r7)
            android.ext.h2 r7 = (android.ext.h2) r7
            if (r7 == 0) goto L41
            boolean r7 = r7.m
            if (r7 == 0) goto L41
            boolean r7 = r6.m
            if (r7 != 0) goto L41
            r0.c(r6)
        L41:
            if (r8 == 0) goto L46
            r5.notifyDataSetChanged()
        L46:
            return
    }

    public void c() {
            r1 = this;
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.f0 r0 = r0.i
            r0.n()
            r1.q()
            r1.notifyDataSetChanged()
            return
    }

    public android.ext.h2 d(int r2) {
            r1 = this;
            d.e r0 = r1.f361a
            java.lang.Object r2 = r0.n(r2)
            android.ext.h2 r2 = (android.ext.h2) r2
            return r2
    }

    public android.ext.h2 e(long r2) {
            r1 = this;
            d.e r0 = r1.f361a
            java.lang.Object r2 = r0.e(r2)
            android.ext.h2 r2 = (android.ext.h2) r2
            if (r2 != 0) goto Lb
            r2 = 0
        Lb:
            return r2
    }

    public d.e f() {
            r1 = this;
            d.e r0 = r1.f361a
            return r0
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            d.e r0 = r1.f361a
            int r0 = r0.l()
            return r0
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            android.ext.h2 r1 = r0.d(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            d.e r0 = r2.f361a
            java.lang.Object r3 = r0.n(r3)
            android.ext.h2 r3 = (android.ext.h2) r3
            if (r3 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            long r0 = r3.i()
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
            r10 = this;
            if (r12 != 0) goto L6
            android.view.View r12 = r10.g(r13)
        L6:
            java.lang.Object r0 = r12.getTag()
            android.ext.SavedListAdapter$b r0 = (android.ext.SavedListAdapter.b) r0
            boolean r1 = r0.b()
            if (r1 == 0) goto L1d
            android.view.View r12 = r10.g(r13)
            java.lang.Object r13 = r12.getTag()
            r0 = r13
            android.ext.SavedListAdapter$b r0 = (android.ext.SavedListAdapter.b) r0
        L1d:
            int r13 = android.ext.Config.q
            int r1 = android.ext.Tools.d1()
            int r1 = r1 + 2
            r2 = 1
            int r1 = r2 << r1
            r13 = r13 & r1
            r1 = 0
            if (r13 == 0) goto L2d
            goto L2e
        L2d:
            r2 = 0
        L2e:
            d.e r13 = r10.f361a
            int r13 = r13.l()
            if (r11 < r13) goto L53
            android.ext.h2 r13 = new android.ext.h2
            r4 = 0
            r6 = 0
            r8 = 4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "null for "
            r3.append(r9)
            r3.append(r11)
            java.lang.String r9 = r3.toString()
            r3 = r13
            r3.<init>(r4, r6, r8, r9)
            goto L61
        L53:
            d.e r13 = r10.f361a
            java.lang.Object r13 = r13.n(r11)
            android.ext.h2 r13 = (android.ext.h2) r13
            d.e r1 = r10.f361a
            boolean r1 = r1.a(r11)
        L61:
            r0.m = r11
            android.widget.ImageView r11 = r0.r
            p(r11, r2)
            android.widget.TextView r11 = r0.s
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            r3 = -2
            if (r2 == 0) goto L73
            r4 = -2
            goto L74
        L73:
            r4 = -1
        L74:
            r11.width = r4
            android.widget.LinearLayout r11 = r0.o
            r4 = r2 ^ 1
            r11.setOrientation(r4)
            android.widget.ImageView r11 = r0.q
            p(r11, r2)
            android.widget.CheckBox r11 = r0.f661a
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            if (r2 == 0) goto L8c
            r2 = -2
            goto L90
        L8c:
            int r2 = android.ext.Tools.H()
        L90:
            r11.height = r2
            android.widget.ImageView r11 = r0.r
            r11.setTag(r13)
            android.widget.CheckBox r11 = r0.f661a
            boolean r11 = r11.isChecked()
            if (r11 == r1) goto Laa
            android.widget.CheckBox r11 = r0.f661a
            r2 = 0
            r11.setOnCheckedChangeListener(r2)
            android.widget.CheckBox r11 = r0.f661a
            r11.setChecked(r1)
        Laa:
            android.widget.CheckBox r11 = r0.f661a
            r11.setOnCheckedChangeListener(r10)
            android.widget.TextView r11 = r0.p
            r11.setTag(r13)
            android.widget.ImageView r11 = r0.q
            r11.setTag(r13)
            r0.a(r1, r3)
            int r11 = r13.m()
            android.widget.TextView r1 = r0.n
            r1.setTextColor(r11)
            android.widget.TextView r1 = r0.p
            r1.setTextColor(r11)
            java.lang.String r11 = r13.J()
            android.ext.d$a r1 = r10.f362b
            android.ext.MainService r2 = android.ext.MainService.instance
            android.ext.d r2 = r2.u0
            long r3 = r13.f672a
            int r5 = r13.f674c
            r2.a(r3, r5, r1)
            boolean r2 = r1.f702b
            if (r2 == 0) goto L102
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r11 = " ("
            r2.append(r11)
            long r3 = r13.f672a
            long r5 = r1.f701a
            int r11 = r13.f674c
            java.lang.String r11 = android.ext.c.I(r3, r5, r11)
            r2.append(r11)
            r11 = 41
            r2.append(r11)
            java.lang.String r11 = r2.toString()
        L102:
            android.widget.TextView r1 = r0.s
            java.lang.String r2 = r13.b0()
            r1.setText(r2)
            android.widget.TextView r1 = r0.p
            java.lang.CharSequence r2 = r13.z()
            r1.setText(r2)
            android.widget.TextView r1 = r0.j
            long r2 = r13.f672a
            java.lang.CharSequence r2 = android.ext.RegionList.a(r2)
            r1.setText(r2)
            android.widget.TextView r1 = r0.f662b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r13.F()
            r2.append(r3)
            java.lang.String r3 = ": "
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            android.widget.TextView r1 = r0.n
            r1.setText(r11)
            android.widget.ImageView r11 = r0.r
            int r1 = r13.Z()
            r11.setImageResource(r1)
            long r1 = r13.f672a
            long r3 = r13.f673b
            int r5 = android.ext.SavedListAdapter.f360c
            r6 = 1
            int r7 = r13.D()
            android.ext.n1.c(r0, r1, r3, r5, r6, r7)
            return r12
    }

    public void h(android.ext.w r12) {
            r11 = this;
            r12.j()
            android.ext.MainService r0 = android.ext.MainService.instance
            android.widget.ListView r0 = r0.L
            int r1 = r0.getFirstVisiblePosition()
            int r0 = r0.getLastVisiblePosition()
            d.e r2 = r11.f361a
            r3 = 0
        L12:
            int r4 = r12.f()     // Catch: java.io.IOException -> L3f
            if (r4 != 0) goto L19
            goto L45
        L19:
            long r4 = r12.g()     // Catch: java.io.IOException -> L3f
            long r6 = r12.h()     // Catch: java.io.IOException -> L3f
            int r4 = r2.g(r4)     // Catch: java.io.IOException -> L3f
            if (r4 >= 0) goto L28
            goto L12
        L28:
            java.lang.Object r5 = r2.n(r4)     // Catch: java.io.IOException -> L3f
            android.ext.h2 r5 = (android.ext.h2) r5     // Catch: java.io.IOException -> L3f
            if (r5 != 0) goto L31
            goto L12
        L31:
            long r8 = r5.f673b     // Catch: java.io.IOException -> L3f
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L12
            if (r1 > r4) goto L3c
            if (r4 > r0) goto L3c
            r3 = 1
        L3c:
            r5.f673b = r6     // Catch: java.io.IOException -> L3f
            goto L12
        L3f:
            r12 = move-exception
            java.lang.String r0 = "???"
            android.ext.e1.l(r0, r12)
        L45:
            if (r3 == 0) goto L4a
            r11.notifyDataSetChanged()
        L4a:
            return
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void i() {
            r8 = this;
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.f0 r0 = r0.i
            r0.B()
            d.e r1 = r8.f361a
            int r2 = r1.l()
            if (r2 != 0) goto L10
            return
        L10:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.OutOfMemoryError -> L2e
            int r3 = r1.l()     // Catch: java.lang.OutOfMemoryError -> L2e
            r2.<init>(r3)     // Catch: java.lang.OutOfMemoryError -> L2e
            r3 = 0
            r4 = 0
        L1b:
            int r5 = r1.l()     // Catch: java.lang.OutOfMemoryError -> L2e
            if (r4 >= r5) goto L39
            java.lang.Object r5 = r1.n(r4)     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.IndexOutOfBoundsException -> L30
            android.ext.h2 r5 = (android.ext.h2) r5     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.IndexOutOfBoundsException -> L30
            if (r5 != 0) goto L2a
            goto L36
        L2a:
            r2.add(r5)     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.IndexOutOfBoundsException -> L30
            goto L36
        L2e:
            r0 = move-exception
            goto L5f
        L30:
            r5 = move-exception
            java.lang.String r6 = "list changed"
            android.ext.e1.s(r6, r5)     // Catch: java.lang.OutOfMemoryError -> L2e
        L36:
            int r4 = r4 + 1
            goto L1b
        L39:
            int r1 = r2.size()     // Catch: java.lang.OutOfMemoryError -> L2e
            if (r1 != 0) goto L40
            return
        L40:
            int r1 = r2.size()     // Catch: java.lang.OutOfMemoryError -> L2e
            int[] r4 = new int[r1]     // Catch: java.lang.OutOfMemoryError -> L2e
            long[] r5 = new long[r1]     // Catch: java.lang.OutOfMemoryError -> L2e
        L48:
            if (r3 >= r1) goto L5b
            java.lang.Object r6 = r2.get(r3)     // Catch: java.lang.OutOfMemoryError -> L2e
            android.ext.c r6 = (android.ext.c) r6     // Catch: java.lang.OutOfMemoryError -> L2e
            int r7 = r6.f674c     // Catch: java.lang.OutOfMemoryError -> L2e
            r4[r3] = r7     // Catch: java.lang.OutOfMemoryError -> L2e
            long r6 = r6.f672a     // Catch: java.lang.OutOfMemoryError -> L2e
            r5[r3] = r6     // Catch: java.lang.OutOfMemoryError -> L2e
            int r3 = r3 + 1
            goto L48
        L5b:
            r0.S(r4, r5)     // Catch: java.lang.OutOfMemoryError -> L2e
            goto L64
        L5f:
            java.lang.String r1 = "OOM in reloadData"
            android.ext.e1.s(r1, r0)
        L64:
            return
    }

    public void j(int r2) {
            r1 = this;
            d.e r0 = r1.f361a
            java.lang.Object r2 = r0.j(r2)
            android.ext.h2 r2 = (android.ext.h2) r2
            if (r2 == 0) goto L26
            boolean r0 = r2.m
            if (r0 == 0) goto L18
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.f0 r0 = r0.i
            r0.c(r2)
            r0.B()
        L18:
            d.e r2 = r1.f361a
            int r2 = r2.l()
            if (r2 != 0) goto L23
            r1.q()
        L23:
            r1.notifyDataSetChanged()
        L26:
            return
    }

    public void k(android.ext.h2 r3) {
            r2 = this;
            long r0 = r3.i()
            r2.n(r0)
            return
    }

    public void l(java.util.List r5) {
            r4 = this;
            d.e r0 = r4.f361a
            android.ext.MainService r1 = android.ext.MainService.instance
            android.ext.f0 r1 = r1.i
            java.util.Iterator r5 = r5.iterator()
        La:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r5.next()
            android.ext.h2 r2 = (android.ext.h2) r2
            if (r2 != 0) goto L19
            goto La
        L19:
            long r2 = r2.i()
            java.lang.Object r2 = r0.c(r2)
            android.ext.h2 r2 = (android.ext.h2) r2
            if (r2 == 0) goto La
            boolean r3 = r2.m
            if (r3 == 0) goto La
            r1.c(r2)
            goto La
        L2d:
            r1.B()
            int r5 = r0.l()
            if (r5 != 0) goto L39
            r4.q()
        L39:
            r4.notifyDataSetChanged()
            return
    }

    public void m(long[] r6, int r7) {
            r5 = this;
            d.e r0 = r5.f361a
            android.ext.MainService r1 = android.ext.MainService.instance
            android.ext.f0 r1 = r1.i
            r2 = 0
        L7:
            if (r2 >= r7) goto L1d
            r3 = r6[r2]
            java.lang.Object r3 = r0.c(r3)
            android.ext.h2 r3 = (android.ext.h2) r3
            if (r3 == 0) goto L1a
            boolean r4 = r3.m
            if (r4 == 0) goto L1a
            r1.c(r3)
        L1a:
            int r2 = r2 + 1
            goto L7
        L1d:
            r1.B()
            int r6 = r0.l()
            if (r6 != 0) goto L29
            r5.q()
        L29:
            r5.notifyDataSetChanged()
            return
    }

    public void n(long r2) {
            r1 = this;
            d.e r0 = r1.f361a
            int r2 = r0.g(r2)
            if (r2 < 0) goto Lb
            r1.j(r2)
        Lb:
            return
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton r3, boolean r4) {
            r2 = this;
            java.lang.Object r3 = r3.getTag()
            android.ext.b3 r3 = (android.ext.b3) r3
            if (r3 != 0) goto L9
            return
        L9:
            d.e r0 = r2.f361a     // Catch: java.lang.IndexOutOfBoundsException -> L16
            int r1 = r3.m     // Catch: java.lang.IndexOutOfBoundsException -> L16
            r0.k(r1, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L16
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
    public void onClick(android.view.View r4) {
            r3 = this;
            int r0 = r4.getId()
            r1 = 2131034119(0x7f050007, float:1.7678747E38)
            if (r0 == r1) goto L4b
            r1 = 2131034123(0x7f05000b, float:1.7678755E38)
            if (r0 == r1) goto L3d
            r1 = 2131034265(0x7f050099, float:1.7679043E38)
            if (r0 == r1) goto L15
            goto L95
        L15:
            java.lang.Object r0 = r4.getTag()
            android.ext.h2 r0 = (android.ext.h2) r0
            android.ext.h2 r0 = r0.Y()
            boolean r1 = r0.m
            r1 = r1 ^ 1
            r0.m = r1
            r3.a(r0)
            boolean r1 = r4 instanceof android.widget.ImageButton
            if (r1 == 0) goto L35
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            int r0 = r0.Z()
            r4.setImageResource(r0)
        L35:
            android.ext.MainService r4 = android.ext.MainService.instance
            android.ext.f0 r4 = r4.i
            r4.B()
            goto L95
        L3d:
            java.lang.Object r4 = r4.getTag()
            android.ext.b3 r4 = (android.ext.b3) r4
            if (r4 == 0) goto L95
            android.widget.CheckBox r4 = r4.f661a
            android.ext.Tools.s(r4)
            goto L95
        L4b:
            java.lang.Object r4 = r4.getTag()
            android.ext.h2 r4 = (android.ext.h2) r4
            if (r4 != 0) goto L54
            return
        L54:
            android.app.AlertDialog$Builder r0 = android.ext.f.b()     // Catch: java.lang.IndexOutOfBoundsException -> L8f
            java.lang.String r1 = r4.b0()     // Catch: java.lang.IndexOutOfBoundsException -> L8f
            android.view.View r1 = android.ext.Tools.h0(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L8f
            android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L8f
            r1 = 2131296374(0x7f090076, float:1.8210663E38)
            java.lang.String r1 = android.ext.b2.f(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L8f
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L8f
            r1 = 2131297115(0x7f09035b, float:1.8212166E38)
            java.lang.String r1 = android.ext.b2.f(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L8f
            android.ext.SavedListAdapter$a r2 = new android.ext.SavedListAdapter$a     // Catch: java.lang.IndexOutOfBoundsException -> L8f
            r2.<init>(r3, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L8f
            android.app.AlertDialog$Builder r4 = r0.setPositiveButton(r1, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L8f
            r0 = 2131296805(0x7f090225, float:1.8211537E38)
            java.lang.String r0 = android.ext.b2.f(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L8f
            r1 = 0
            android.app.AlertDialog$Builder r4 = r4.setNegativeButton(r0, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L8f
            android.ext.f.o(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L8f
            goto L95
        L8f:
            r4 = move-exception
            java.lang.String r0 = "SavedListAdapter onClick Failed"
            android.ext.e1.l(r0, r4)
        L95:
            return
    }
}
