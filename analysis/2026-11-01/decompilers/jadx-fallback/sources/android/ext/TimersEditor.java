package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class TimersEditor implements android.content.DialogInterface.OnClickListener, android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener {
    private static final int[] j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean[] f481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean[] f482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f487g;
    private final int h;
    private java.lang.ref.WeakReference i;

    class a extends android.widget.BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.ext.TimersEditor f488a;

        a(android.ext.TimersEditor r1) {
                r0 = this;
                r0.f488a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r1 = this;
                android.ext.TimersEditor r0 = r1.f488a
                int r0 = android.ext.TimersEditor.a(r0)
                int r0 = r0 + 1
                return r0
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                return r1
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
                r1 = this;
                if (r2 != 0) goto L9
                android.ext.TimersEditor r2 = r1.f488a
                android.view.View r2 = r2.c(r3, r4)
                goto Lf
            L9:
                android.ext.TimersEditor r0 = r1.f488a
                android.view.View r2 = r0.d(r2, r3, r4)
            Lf:
                return r2
        }
    }

    static {
            r0 = 2131034420(0x7f050134, float:1.7679357E38)
            r1 = 2131034352(0x7f0500f0, float:1.767922E38)
            r2 = 2131034127(0x7f05000f, float:1.7678763E38)
            r3 = 2131034295(0x7f0500b7, float:1.7679104E38)
            int[] r0 = new int[]{r2, r3, r0, r1}
            android.ext.TimersEditor.j = r0
            return
    }

    public TimersEditor(java.lang.String r3, java.lang.String r4, int r5, boolean[] r6, int r7) {
            r2 = this;
            r2.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            r2.i = r0
            r2.f485e = r3
            r2.f486f = r4
            r2.f484d = r5
            r2.f487g = r6
            r2.h = r7
            boolean[] r4 = new boolean[r5]
            r2.f481a = r4
            r4 = 4
            boolean[] r4 = new boolean[r4]
            r2.f482b = r4
            int r5 = r5 * 12
            boolean[] r4 = new boolean[r5]
            r2.f483c = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r3 = 58
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.ext.e1.d(r3)
            r2.b()
            return
    }

    static /* synthetic */ int a(android.ext.TimersEditor r0) {
            int r0 = r0.f484d
            return r0
    }

    private android.view.View e() {
            r4 = this;
            boolean[] r0 = r4.f483c
            r1 = 0
        L3:
            int r2 = r4.f484d
            int r2 = r2 * 4
            if (r1 >= r2) goto L14
            int r2 = r1 * 3
            int r3 = r2 + 2
            boolean r2 = r0[r2]
            r0[r3] = r2
            int r1 = r1 + 1
            goto L3
        L14:
            r0 = 2131099693(0x7f06002d, float:1.7811746E38)
            r1 = 0
            android.view.View r0 = a.d.f(r0, r1)
            r1 = r0
            android.widget.ListView r1 = (android.widget.ListView) r1
            android.ext.FastScrollerFix r2 = new android.ext.FastScrollerFix
            r2.<init>(r1)
            r2 = 1
            r1.setItemsCanFocus(r2)
            android.ext.TimersEditor$a r2 = new android.ext.TimersEditor$a
            r2.<init>(r4)
            r1.setAdapter(r2)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
            r4.i = r1
            return r0
    }

    private void g() {
            r8 = this;
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.z1$d r0 = r0.v0
            if (r0 != 0) goto L7
            return
        L7:
            boolean[] r1 = r8.f483c
            android.ext.g2 r2 = new android.ext.g2
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r8.f486f
            r3.append(r4)
            r4 = 45
            r3.append(r4)
            java.lang.String r0 = r0.f1434c
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = r3.toString()
            boolean[] r3 = r8.f487g
            r4 = 0
        L2c:
            int r5 = r8.f484d
            int r5 = r5 * 4
            if (r4 >= r5) goto L4d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            int r6 = r4 * 3
            boolean r6 = r1[r6]
            boolean r7 = r3[r4]
            r2.c(r5, r6, r7)
            int r4 = r4 + 1
            goto L2c
        L4d:
            r2.commit()
            return
    }

    private void j() {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.i
            java.lang.Object r0 = r0.get()
            android.widget.BaseAdapter r0 = (android.widget.BaseAdapter) r0
            if (r0 == 0) goto Ld
            r0.notifyDataSetChanged()
        Ld:
            return
    }

    public boolean[] b() {
            r6 = this;
            boolean[] r0 = r6.f483c
            int r1 = r6.f484d
            int r1 = r1 * 4
            boolean[] r1 = new boolean[r1]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
        Le:
            int r4 = r6.f484d
            int r4 = r4 * 4
            if (r3 >= r4) goto L3d
            int r4 = r3 % 4
            r5 = 1
            if (r4 != 0) goto L29
            r4 = 32
            r2.append(r4)
            int r4 = r3 / 4
            int r4 = r4 + r5
            r2.append(r4)
            r4 = 58
            r2.append(r4)
        L29:
            int r4 = r3 * 3
            boolean r4 = r0[r4]
            if (r4 == 0) goto L37
            r1[r3] = r5
            r4 = 49
        L33:
            r2.append(r4)
            goto L3a
        L37:
            r4 = 48
            goto L33
        L3a:
            int r3 = r3 + 1
            goto Le
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r6.f485e
            r0.append(r3)
            java.lang.String r3 = " get:"
            r0.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.ext.e1.d(r0)
            return r1
    }

    android.view.View c(android.view.View r3, android.view.ViewGroup r4) {
            r2 = this;
            r0 = 2131099691(0x7f06002b, float:1.7811742E38)
            if (r3 == 0) goto Lb
            int r1 = r3.getId()
            if (r1 == r0) goto L3b
        Lb:
            r3 = 0
            android.view.View r4 = a.d.g(r0, r4, r3)
            r4.setId(r0)
        L13:
            r0 = 4
            if (r3 >= r0) goto L3a
            int[] r0 = android.ext.TimersEditor.j
            r0 = r0[r3]
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.setTag(r1)
            r0.setOnClickListener(r2)
            int r1 = r0.getPaintFlags()
            r1 = r1 | 8
            r0.setPaintFlags(r1)
            r1 = 1
            r0.setFocusable(r1)
            int r3 = r3 + 1
            goto L13
        L3a:
            r3 = r4
        L3b:
            return r3
    }

    android.view.View d(int r10, android.view.View r11, android.view.ViewGroup r12) {
            r9 = this;
            a.d r0 = a.d.c()
            int r1 = r10 + (-1)
            r2 = 0
            r3 = 2131099692(0x7f06002c, float:1.7811744E38)
            r4 = 4
            r5 = 1
            if (r11 == 0) goto L14
            int r6 = r11.getId()
            if (r6 == r3) goto L53
        L14:
            android.view.View r11 = r0.inflate(r3, r12, r2)
            r11.setId(r3)
            r12 = 5
            android.view.View[] r12 = new android.view.View[r12]
            r0 = 0
        L1f:
            if (r0 >= r4) goto L36
            int[] r3 = android.ext.TimersEditor.j
            r3 = r3[r0]
            android.view.View r3 = r11.findViewById(r3)
            android.widget.CheckBox r3 = (android.widget.CheckBox) r3
            r3.setFocusable(r5)
            r3.setOnCheckedChangeListener(r9)
            r12[r0] = r3
            int r0 = r0 + 1
            goto L1f
        L36:
            r0 = 2131034337(0x7f0500e1, float:1.7679189E38)
            android.view.View r0 = r11.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r3 = r0.getPaintFlags()
            r3 = r3 | 8
            r0.setPaintFlags(r3)
            r0.setOnClickListener(r9)
            r0.setFocusable(r5)
            r12[r4] = r0
            r11.setTag(r12)
        L53:
            java.lang.Object r12 = r11.getTag()
            android.view.View[] r12 = (android.view.View[]) r12
        L59:
            if (r2 >= r4) goto L8b
            r0 = r12[r2]
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            int r3 = r1 * 4
            int r3 = r3 + r2
            r6 = 0
            r0.setTag(r6)
            boolean[] r6 = r9.f483c
            int r7 = r3 * 3
            int r8 = r7 + 2
            boolean r6 = r6[r8]
            r0.setChecked(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.setTag(r3)
            boolean[] r3 = r9.f483c
            int r7 = r7 + r5
            boolean r3 = r3[r7]
            if (r3 == 0) goto L83
            r3 = -16755456(0xffffffffff005500, float:-1.7058253E38)
            goto L85
        L83:
            r3 = -11206656(0xffffffffff550000, float:-2.8312556E38)
        L85:
            r0.setBackgroundColor(r3)
            int r2 = r2 + 1
            goto L59
        L8b:
            r12 = r12[r4]
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r12.setTag(r0)
            java.lang.String r10 = java.lang.Integer.toString(r10)
            r12.setText(r10)
            return r11
    }

    public void f() {
            r9 = this;
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.z1$d r0 = r0.v0
            if (r0 != 0) goto L7
            return
        L7:
            boolean[] r1 = r9.f483c
            android.content.SharedPreferences r2 = android.ext.Tools.M0()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r9.f486f
            r3.append(r4)
            r4 = 45
            r3.append(r4)
            java.lang.String r0 = r0.f1434c
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = r3.toString()
            boolean[] r3 = r9.f487g
            r4 = 0
            r5 = 0
        L2c:
            int r6 = r9.f484d
            int r6 = r6 * 4
            if (r5 >= r6) goto L72
            int r6 = r5 * 3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r7.<init>()     // Catch: java.lang.Throwable -> L4c
            r7.append(r0)     // Catch: java.lang.Throwable -> L4c
            r7.append(r5)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L4c
            boolean r8 = r3[r5]     // Catch: java.lang.Throwable -> L4c
            boolean r7 = r2.getBoolean(r7, r8)     // Catch: java.lang.Throwable -> L4c
            r1[r6] = r7     // Catch: java.lang.Throwable -> L4c
            goto L6f
        L4c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            boolean r8 = r3[r5]
            int r7 = r2.getInt(r7, r8)
            r8 = 1
            if (r7 == 0) goto L69
            if (r7 == r8) goto L69
            boolean r8 = r3[r5]
            goto L6d
        L69:
            if (r7 == 0) goto L6c
            goto L6d
        L6c:
            r8 = 0
        L6d:
            r1[r6] = r8
        L6f:
            int r5 = r5 + 1
            goto L2c
        L72:
            r9.b()
            return
    }

    public void h() {
            r3 = this;
            r3.f()
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.f0 r0 = r0.i
            int r1 = r3.h
            r0.J0(r1)
            android.app.AlertDialog$Builder r0 = android.ext.f.b()
            android.view.View r1 = r3.e()
            android.view.View r1 = android.ext.Tools.O0(r1)
            android.app.AlertDialog$Builder r0 = r0.setView(r1)
            r1 = 2131296898(0x7f090282, float:1.8211726E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setNeutralButton(r1, r3)
            r1 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            r1 = 2131296917(0x7f090295, float:1.8211764E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r3)
            android.app.AlertDialog r0 = r0.create()
            android.ext.f.m(r0)
            return
    }

    public void i(boolean[] r6) {
            r5 = this;
            boolean[] r0 = r5.f483c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
        L8:
            int r3 = r5.f484d
            int r3 = r3 * 4
            if (r2 >= r3) goto L39
            int r3 = r2 % 4
            if (r3 != 0) goto L23
            r3 = 32
            r1.append(r3)
            int r3 = r2 / 4
            int r3 = r3 + 1
            r1.append(r3)
            r3 = 58
            r1.append(r3)
        L23:
            boolean r3 = r6[r2]
            int r4 = r2 * 3
            int r4 = r4 + 1
            r0[r4] = r3
            if (r3 == 0) goto L33
            r3 = 49
        L2f:
            r1.append(r3)
            goto L36
        L33:
            r3 = 48
            goto L2f
        L36:
            int r2 = r2 + 1
            goto L8
        L39:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = r5.f485e
            r6.append(r0)
            java.lang.String r0 = " usage:"
            r6.append(r0)
            java.lang.String r0 = r1.toString()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            android.ext.e1.d(r6)
            r5.j()
            return
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton r2, boolean r3) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.Object r2 = r2.getTag()
            if (r2 == 0) goto L1c
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 != 0) goto Le
            goto L1c
        Le:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean[] r0 = r1.f483c
            int r2 = r2 * 3
            int r2 = r2 + 2
            r0[r2] = r3
        L1c:
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r5, int r6) {
            r4 = this;
            boolean[] r5 = r4.f483c
            r0 = -3
            r1 = 0
            if (r6 != r0) goto L1a
            boolean[] r6 = r4.f487g
            r0 = 0
        L9:
            int r2 = r4.f484d
            int r2 = r2 * 4
            if (r0 >= r2) goto L1a
            int r2 = r0 * 3
            int r2 = r2 + 2
            boolean r3 = r6[r0]
            r5[r2] = r3
            int r0 = r0 + 1
            goto L9
        L1a:
            int r6 = r4.f484d
            int r6 = r6 * 4
            if (r1 >= r6) goto L2b
            int r6 = r1 * 3
            int r0 = r6 + 2
            boolean r0 = r5[r0]
            r5[r6] = r0
            int r1 = r1 + 1
            goto L1a
        L2b:
            r4.g()
            android.ext.MainService r5 = android.ext.MainService.instance
            android.ext.f0 r5 = r5.i
            int r6 = r4.h
            r5.H0(r6)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r5) {
            r4 = this;
            int r0 = r5.getId()
            r1 = 2131034337(0x7f0500e1, float:1.7679189E38)
            r2 = 0
            java.lang.Object r5 = r5.getTag()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r0 == r1) goto L32
            boolean[] r0 = r4.f482b
            boolean r1 = r0[r5]
            r1 = r1 ^ 1
            r0[r5] = r1
        L1c:
            int r0 = r4.f484d
            if (r2 >= r0) goto L4f
            int r0 = r2 * 4
            int r0 = r0 + r5
            boolean[] r1 = r4.f483c
            int r0 = r0 * 3
            int r0 = r0 + 2
            boolean[] r3 = r4.f482b
            boolean r3 = r3[r5]
            r1[r0] = r3
            int r2 = r2 + 1
            goto L1c
        L32:
            boolean[] r0 = r4.f481a
            boolean r1 = r0[r5]
            r1 = r1 ^ 1
            r0[r5] = r1
        L3a:
            r0 = 4
            if (r2 >= r0) goto L4f
            int r0 = r5 * 4
            int r0 = r0 + r2
            boolean[] r1 = r4.f483c
            int r0 = r0 * 3
            int r0 = r0 + 2
            boolean[] r3 = r4.f481a
            boolean r3 = r3[r5]
            r1[r0] = r3
            int r2 = r2 + 1
            goto L3a
        L4f:
            r4.j()
            return
    }
}
