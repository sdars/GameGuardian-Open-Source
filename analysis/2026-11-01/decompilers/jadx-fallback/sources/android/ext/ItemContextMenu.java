package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class ItemContextMenu implements android.widget.AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.ThreadLocal f196f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String[] f199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String[] f200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String[] f201e;

    class a extends android.ext.ArrayAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.List f202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.ItemContextMenu f203c;

        a(android.ext.ItemContextMenu r1, android.content.Context r2, java.util.List r3, java.util.List r4) {
                r0 = this;
                r0.f203c = r1
                r0.f202b = r4
                r0.<init>(r2, r3)
                return
        }

        @Override // android.ext.ArrayAdapter, android.widget.ArrayAdapter, android.widget.Adapter
        public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
                r1 = this;
                android.view.View r3 = super.getView(r2, r3, r4)
                java.util.List r4 = r1.f202b
                java.lang.Object r2 = r4.get(r2)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                android.graphics.drawable.Drawable r2 = android.ext.Tools.o0(r2)
                r4 = 16908308(0x1020014, float:2.3877285E-38)
                android.view.View r4 = r3.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                if (r4 == 0) goto L2c
                r0 = 2131361796(0x7f0a0004, float:1.8343354E38)
                android.ext.Tools.D1(r4, r0)
                int r0 = android.ext.Config.d()
                android.ext.Tools.c(r4, r2, r0)
            L2c:
                return r3
        }
    }

    class b implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.util.List f204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.c f206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ android.ext.ItemContextMenu f207d;

        b(android.ext.ItemContextMenu r1, java.util.List r2, java.util.ArrayList r3, android.ext.c r4) {
                r0 = this;
                r0.f207d = r1
                r0.f204a = r2
                r0.f205b = r3
                r0.f206c = r4
                r0.<init>()
                return
        }

        private java.lang.Long a() {
                r2 = this;
                android.ext.ItemContextMenu r0 = r2.f207d
                int r0 = android.ext.ItemContextMenu.a(r0)
                r1 = 3
                if (r0 != r1) goto L15
                android.ext.c r0 = r2.f206c
                if (r0 != 0) goto Le
                goto L15
            Le:
                long r0 = r0.f672a
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                goto L16
            L15:
                r0 = 0
            L16:
                return r0
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r5, int r6) {
                r4 = this;
                if (r6 < 0) goto Ld5
                java.util.List r0 = r4.f204a
                int r0 = r0.size()
                if (r6 < r0) goto Lc
                goto Ld5
            Lc:
                java.util.List r0 = r4.f204a
                java.lang.Object r0 = r0.get(r6)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                switch(r0) {
                    case 2130968592: goto Lbb;
                    case 2130968597: goto Laf;
                    case 2130968598: goto La3;
                    case 2130968601: goto L97;
                    case 2130968618: goto L63;
                    case 2130968640: goto L52;
                    case 2130968646: goto L41;
                    default: goto L1b;
                }
            L1b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unknown icon in menu: "
                r0.append(r1)
                java.util.List r1 = r4.f204a
                java.lang.Object r6 = r1.get(r6)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                java.lang.String r6 = java.lang.Integer.toHexString(r6)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                android.ext.e1.i(r6)
                goto Lcf
            L41:
                android.ext.MainService r0 = android.ext.MainService.instance
                android.ext.i2 r0 = r0.W
                java.util.ArrayList r1 = r4.f205b
                java.lang.Object r6 = r1.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                r0.y(r6)
                goto Lcf
            L52:
                android.ext.w1 r0 = new android.ext.w1
                r0.<init>()
                java.util.ArrayList r1 = r4.f205b
                java.lang.Object r6 = r1.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                r0.l(r6)
                goto Lcf
            L63:
                android.ext.MainService r0 = android.ext.MainService.instance
                java.lang.Long r1 = r4.a()
                java.util.ArrayList r2 = r4.f205b
                java.lang.Object r6 = r2.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 2131296496(0x7f0900f0, float:1.821091E38)
                java.lang.String r3 = android.ext.Tools.N1(r3)
                r2.append(r3)
                java.lang.String r3 = ": ("
                r2.append(r3)
                android.ext.c r3 = r4.f206c
                r2.append(r3)
                r3 = 41
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.L(r1, r6, r2)
                goto Lcf
            L97:
                java.util.ArrayList r0 = r4.f205b
                java.lang.Object r6 = r0.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                android.ext.b.h(r6)
                goto Lcf
            La3:
                java.util.ArrayList r0 = r4.f205b
                java.lang.Object r6 = r0.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                android.ext.Tools.z(r6)
                goto Lcf
            Laf:
                java.util.ArrayList r0 = r4.f205b
                java.lang.Object r6 = r0.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                android.ext.h.h(r6)
                goto Lcf
            Lbb:
                android.ext.OffsetCalculator r0 = new android.ext.OffsetCalculator
                java.lang.Long r1 = r4.a()
                r0.<init>(r1)
                java.util.ArrayList r1 = r4.f205b
                java.lang.Object r6 = r1.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                r0.j(r6)
            Lcf:
                if (r5 == 0) goto Ld4
                android.ext.Tools.D(r5)
            Ld4:
                return
            Ld5:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "Unknown index in menu: "
                r5.append(r0)
                r5.append(r6)
                java.lang.String r6 = " for "
                r5.append(r6)
                java.util.List r6 = r4.f204a
                int r6 = r6.size()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                android.ext.e1.i(r5)
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            android.ext.ItemContextMenu.f196f = r0
            return
    }

    public ItemContextMenu(int r2) {
            r1 = this;
            r1.<init>()
            r1.f197a = r2
            r2 = 8
            int[] r2 = new int[r2]
            r2 = {x001e: FILL_ARRAY_DATA , data: [0, 4, 16, 64, 2, 1, 32, 8} // fill-array
            r1.f198b = r2
            int r0 = r2.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r1.f199c = r0
            int r0 = r2.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r1.f200d = r0
            int r2 = r2.length
            java.lang.String[] r2 = new java.lang.String[r2]
            r1.f201e = r2
            return
    }

    static /* synthetic */ int a(android.ext.ItemContextMenu r0) {
            int r0 = r0.f197a
            return r0
    }

    public static long b(long r2) {
            java.lang.ThreadLocal r0 = android.ext.ItemContextMenu.f196f
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r0.set(r1)
            return r2
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView r38, android.view.View r39, int r40, long r41) {
            r37 = this;
            r0 = r37
            r1 = r38
            r2 = r40
            java.lang.Object r2 = r1.getItemAtPosition(r2)
            boolean r3 = r2 instanceof android.ext.c
            r4 = 0
            if (r3 != 0) goto L10
            return r4
        L10:
            android.ext.c r2 = (android.ext.c) r2
            android.ext.h2 r3 = new android.ext.h2
            r3.<init>(r2)
            java.lang.String r5 = r3.F()
            long r6 = r3.f672a
            int r8 = r3.f674c
            r9 = r8 & 127(0x7f, float:1.78E-43)
            long r10 = r3.f673b
            android.ext.MainService r3 = android.ext.MainService.instance
            android.ext.z1$d r3 = r3.v0
            int r12 = r0.f197a
            r13 = 8
            r14 = 3
            if (r12 != r14) goto L31
            r12 = 8
            goto L35
        L31:
            int r12 = android.ext.c.E(r9)
        L35:
            r15 = 3
            long r15 = r15 & r6
            r4 = 4
            r17 = 0
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 != 0) goto L58
            if (r12 >= r4) goto L42
            goto L58
        L42:
            if (r3 == 0) goto L56
            boolean r3 = r3.n
            if (r3 == 0) goto L56
            if (r12 != r13) goto L56
            r12 = -4294967296(0xffffffff00000000, double:NaN)
            long r12 = r12 & r10
            int r3 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r3 == 0) goto L56
            r3 = 2
            goto L59
        L56:
            r3 = 1
            goto L59
        L58:
            r3 = 0
        L59:
            r8 = r8 & 47
            if (r8 == 0) goto L5f
            r8 = 1
            goto L60
        L5f:
            r8 = 0
        L60:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r12.add(r5)
            r16 = 2131296834(0x7f090242, float:1.8211596E38)
            java.lang.String r14 = android.ext.b2.f(r16)
            r13.add(r14)
            r14 = 2130968592(0x7f040010, float:1.7545842E38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15.add(r14)
            r12.add(r5)
            r14 = 2131296647(0x7f090187, float:1.8211217E38)
            java.lang.String r14 = android.ext.b2.f(r14)
            r13.add(r14)
            r14 = 2130968640(0x7f040040, float:1.754594E38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15.add(r14)
            r12.add(r5)
            r14 = 2131296946(0x7f0902b2, float:1.8211823E38)
            java.lang.String r14 = android.ext.b2.f(r14)
            r13.add(r14)
            r14 = 2130968646(0x7f040046, float:1.7545952E38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15.add(r14)
            android.ext.MainService r14 = android.ext.MainService.instance
            android.widget.ListView r14 = r14.M
            r16 = 2131296515(0x7f090103, float:1.8210949E38)
            r20 = 2130968618(0x7f04002a, float:1.7545895E38)
            r4 = 32
            if (r1 == r14) goto Le8
            r12.add(r5)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r21 = r2
            java.lang.String r2 = android.ext.b2.f(r16)
            r14.append(r2)
            r14.append(r4)
            r14.append(r5)
            java.lang.String r2 = r14.toString()
            r13.add(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r15.add(r2)
            goto Lea
        Le8:
            r21 = r2
        Lea:
            r2 = 0
        Leb:
            r22 = 2131296270(0x7f09000e, float:1.8210452E38)
            r23 = -4096(0xfffffffffffff000, double:NaN)
            java.lang.String r14 = ": "
            if (r2 >= r3) goto L16a
            r25 = r3
            if (r2 != 0) goto Lf9
            r4 = 4
        Lf9:
            java.lang.String r3 = android.ext.c.M(r6, r10, r4)
            r12.add(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r26 = 2131296516(0x7f090104, float:1.821095E38)
            r27 = r8
            java.lang.String r8 = android.ext.b2.f(r26)
            r1.append(r8)
            r8 = 32
            r1.append(r8)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r13.add(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r15.add(r1)
            r1 = r9
            long r8 = r10 & r23
            int r3 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r3 == 0) goto L15e
            android.ext.RegionList$b r3 = android.ext.RegionList.b(r8)
            if (r3 != 0) goto L15e
            java.lang.String r3 = android.ext.c.M(r6, r8, r4)
            r12.add(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = android.ext.Tools.N1(r22)
            r4.append(r8)
            r4.append(r14)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r13.add(r3)
            r3 = 2130968597(0x7f040015, float:1.7545852E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r15.add(r3)
        L15e:
            int r2 = r2 + 1
            r9 = r1
            r3 = r25
            r8 = r27
            r4 = 32
            r1 = r38
            goto Leb
        L16a:
            r27 = r8
            r1 = r9
            long r2 = r6 & r23
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L1a4
            android.ext.RegionList$b r4 = android.ext.RegionList.b(r2)
            if (r4 != 0) goto L1a4
            r4 = 4
            java.lang.String r2 = android.ext.c.G(r2, r4)
            r12.add(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = android.ext.Tools.N1(r22)
            r3.append(r4)
            r3.append(r14)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r13.add(r2)
            r2 = 2130968597(0x7f040015, float:1.7545852E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r15.add(r3)
        L1a4:
            r12.add(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 2131296339(0x7f090053, float:1.8210592E38)
            java.lang.String r4 = android.ext.b2.f(r3)
            r2.append(r4)
            r4 = 32
            r2.append(r4)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r13.add(r2)
            r2 = 2130968598(0x7f040016, float:1.7545854E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r15.add(r4)
            android.ext.MainService r4 = android.ext.MainService.instance
            int r4 = r4.H()
            r8 = 1
            if (r4 != r8) goto L1db
            int r4 = android.ext.AddressArrayAdapter.f23d
            goto L1ec
        L1db:
            r8 = 3
            if (r4 != r8) goto L1e5
            android.ext.MainService r4 = android.ext.MainService.instance
            android.ext.n1 r4 = r4.N
            int r4 = r4.j
            goto L1ec
        L1e5:
            r8 = 2
            if (r4 != r8) goto L1eb
            int r4 = android.ext.SavedListAdapter.f360c
            goto L1ec
        L1eb:
            r4 = 0
        L1ec:
            java.lang.String r8 = "ARM (x64)"
            java.lang.String r9 = "Thumb"
            java.lang.String r25 = "ARM (x32)"
            if (r4 == 0) goto L353
            r2 = 3
            r3 = 0
            r28 = 0
            r29 = 0
            r30 = 0
        L1fc:
            if (r3 >= r2) goto L34a
            if (r3 != 0) goto L207
            if (r19 != 0) goto L220
            r2 = r4 & 16
            if (r2 != 0) goto L207
            goto L220
        L207:
            r2 = 1
            if (r3 != r2) goto L217
            r31 = 1
            long r31 = r6 & r31
            int r2 = (r31 > r17 ? 1 : (r31 == r17 ? 0 : -1))
            if (r2 != 0) goto L220
            r2 = r4 & 32
            if (r2 != 0) goto L217
            goto L220
        L217:
            r2 = 2
            if (r3 != r2) goto L233
            if (r19 != 0) goto L220
            r2 = r4 & 64
            if (r2 != 0) goto L233
        L220:
            r31 = r4
            r34 = r5
            r35 = r6
            r32 = r8
            r33 = r9
        L22a:
            r2 = 2130968597(0x7f040015, float:1.7545852E38)
            r6 = 2131296339(0x7f090053, float:1.8210592E38)
        L230:
            r7 = 4
            goto L33b
        L233:
            java.lang.ThreadLocal r2 = android.ext.ItemContextMenu.f196f
            r31 = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r17)
            r2.set(r4)
            r4 = 0
            if (r3 != 0) goto L245
            java.lang.String r28 = android.ext.n.o(r4, r6, r10)
        L245:
            r32 = r8
            r8 = 1
            if (r3 != r8) goto L24e
            java.lang.String r29 = android.ext.n.q(r4, r6, r10)
        L24e:
            r4 = 2
            if (r3 != r4) goto L266
            int[] r4 = android.ext.m.d()
            int r8 = (int) r10
            r33 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r4 = android.ext.m.g(r4, r6, r8, r9)
            java.lang.String r30 = r4.toString()
            goto L268
        L266:
            r33 = r9
        L268:
            java.lang.Object r2 = r2.get()
            java.lang.Long r2 = (java.lang.Long) r2
            long r8 = r2.longValue()
            int r2 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r2 == 0) goto L335
            if (r3 != 0) goto L27c
            r4 = r25
            r2 = 1
            goto L27e
        L27c:
            r2 = 1
            r4 = 0
        L27e:
            if (r3 != r2) goto L282
            r4 = r33
        L282:
            r2 = 2
            if (r3 != r2) goto L287
            r4 = r32
        L287:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r34 = r5
            r4 = 4
            java.lang.String r5 = android.ext.c.G(r8, r4)
            r12.add(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r35 = r6
            java.lang.String r6 = android.ext.b2.f(r16)
            r4.append(r6)
            r6 = 32
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r13.add(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            r15.add(r4)
            r12.add(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r6 = 2131296339(0x7f090053, float:1.8210592E38)
            java.lang.String r7 = android.ext.b2.f(r6)
            r4.append(r7)
            r7 = 32
            r4.append(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r13.add(r4)
            r4 = 2130968598(0x7f040016, float:1.7545854E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r15.add(r5)
            long r4 = r8 & r23
            int r7 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r7 == 0) goto L330
            android.ext.RegionList$b r7 = android.ext.RegionList.b(r4)
            if (r7 != 0) goto L330
            r7 = 4
            java.lang.String r4 = android.ext.c.G(r4, r7)
            r12.add(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = android.ext.Tools.N1(r22)
            r5.append(r2)
            r5.append(r14)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            r13.add(r2)
            r2 = 2130968597(0x7f040015, float:1.7545852E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r15.add(r4)
            goto L33b
        L330:
            r2 = 2130968597(0x7f040015, float:1.7545852E38)
            goto L230
        L335:
            r34 = r5
            r35 = r6
            goto L22a
        L33b:
            int r3 = r3 + 1
            r4 = r31
            r8 = r32
            r9 = r33
            r5 = r34
            r6 = r35
            r2 = 3
            goto L1fc
        L34a:
            r34 = r5
            r35 = r6
            r32 = r8
            r33 = r9
            goto L361
        L353:
            r34 = r5
            r35 = r6
            r32 = r8
            r33 = r9
            r28 = 0
            r29 = 0
            r30 = 0
        L361:
            int[] r2 = r0.f198b
            java.lang.String[] r3 = r0.f199c
            java.lang.String[] r4 = r0.f200d
            java.lang.String[] r5 = r0.f201e
            r6 = 0
            r7 = 0
        L36b:
            int r8 = r2.length
            if (r6 >= r8) goto L3c7
            r8 = r2[r6]
            if (r8 == 0) goto L37d
            r9 = r1 & r8
            if (r9 != 0) goto L37d
            r16 = r1
            r17 = r2
            r1 = r35
            goto L3bc
        L37d:
            if (r8 != 0) goto L386
            r8 = r1
            r16 = r8
        L382:
            r14 = r2
            r1 = r35
            goto L389
        L386:
            r16 = r1
            goto L382
        L389:
            java.lang.String r9 = android.ext.c.K(r1, r10, r8)
            r17 = r14
            r14 = 0
        L390:
            if (r14 >= r7) goto L3a0
            r0 = r3[r14]
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L39b
            goto L3bc
        L39b:
            int r14 = r14 + 1
            r0 = r37
            goto L390
        L3a0:
            r3[r7] = r9
            if (r27 == 0) goto L3ba
            r0 = r8 & (-81)
            if (r0 != 0) goto L3aa
            r9 = 0
            goto L3ae
        L3aa:
            java.lang.String r9 = android.ext.c.M(r1, r10, r8)
        L3ae:
            r4[r7] = r9
            if (r0 != 0) goto L3b4
            r0 = 0
            goto L3b8
        L3b4:
            java.lang.String r0 = android.ext.c.P(r1, r10, r8)
        L3b8:
            r5[r7] = r0
        L3ba:
            int r7 = r7 + 1
        L3bc:
            int r6 = r6 + 1
            r0 = r37
            r35 = r1
            r1 = r16
            r2 = r17
            goto L36b
        L3c7:
            if (r7 <= 0) goto L461
            r0 = 0
        L3ca:
            if (r0 >= r7) goto L461
            r1 = r3[r0]
            r12.add(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 2131296348(0x7f09005c, float:1.821061E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            r2 = r3[r0]
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r13.add(r1)
            r1 = 2130968598(0x7f040016, float:1.7545854E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r15.add(r2)
            if (r27 == 0) goto L45d
            r1 = r4[r0]
            if (r1 == 0) goto L45d
            r12.add(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 2131296344(0x7f090058, float:1.8210602E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            r2 = r4[r0]
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r13.add(r1)
            r1 = 2130968598(0x7f040016, float:1.7545854E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r15.add(r2)
            r1 = r5[r0]
            r12.add(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 2131296347(0x7f09005b, float:1.8210608E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            r2 = r5[r0]
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r13.add(r1)
            r1 = 2130968598(0x7f040016, float:1.7545854E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r15.add(r2)
        L45d:
            int r0 = r0 + 1
            goto L3ca
        L461:
            r0 = 3
            r1 = 0
        L463:
            if (r1 >= r0) goto L4da
            if (r1 != 0) goto L46d
            r2 = r25
            r4 = r28
            r3 = 1
            goto L470
        L46d:
            r2 = 0
            r3 = 1
            r4 = 0
        L470:
            if (r1 != r3) goto L476
            r4 = r29
            r2 = r33
        L476:
            r3 = 2
            if (r1 != r3) goto L47d
            r4 = r30
            r2 = r32
        L47d:
            if (r4 != 0) goto L486
        L47f:
            r2 = 32
            r4 = 2130968598(0x7f040016, float:1.7545854E38)
            r7 = 0
            goto L4d7
        L486:
            java.lang.String r4 = r4.trim()
            r5 = 59
            int r5 = r4.indexOf(r5)
            r6 = -1
            if (r5 == r6) goto L49c
            r6 = 0
            java.lang.String r4 = r4.substring(r6, r5)
            java.lang.String r4 = r4.trim()
        L49c:
            int r5 = r4.length()
            if (r5 <= 0) goto L47f
            r12.add(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 2131296346(0x7f09005a, float:1.8210606E38)
            java.lang.String r6 = android.ext.b2.f(r6)
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r7 = 0
            r8[r7] = r2
            java.lang.String r2 = android.ext.Tools.L1(r6, r8)
            r5.append(r2)
            r2 = 32
            r5.append(r2)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r13.add(r4)
            r4 = 2130968598(0x7f040016, float:1.7545854E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r15.add(r5)
        L4d7:
            int r1 = r1 + 1
            goto L463
        L4da:
            android.ext.MainService r0 = android.ext.MainService.instance
            android.widget.ListView r0 = r0.L
            r1 = r38
            if (r1 != r0) goto L4fb
            r0 = r34
            r12.add(r0)
            r0 = 2131296314(0x7f09003a, float:1.8210541E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            r13.add(r0)
            r0 = 2130968601(0x7f040019, float:1.754586E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r15.add(r0)
        L4fb:
            android.ext.ItemContextMenu$a r0 = new android.ext.ItemContextMenu$a
            android.content.Context r1 = android.ext.MainService.context
            r2 = r37
            r0.<init>(r2, r1, r13, r15)
            android.content.Context r1 = android.ext.Tools.k0()
            android.app.AlertDialog$Builder r1 = android.ext.f.c(r1)
            android.ext.ItemContextMenu$b r3 = new android.ext.ItemContextMenu$b
            r4 = r21
            r3.<init>(r2, r15, r12, r4)
            android.app.AlertDialog$Builder r0 = r1.setAdapter(r0, r3)
            r1 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r3 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r3)
            android.ext.f.o(r0)
            r0 = 1
            return r0
    }
}
