package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class EditorListener extends android.ext.p1 implements android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f123f;

    static /* synthetic */ class a {
    }

    private class b implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnShowListener, android.content.DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.app.AlertDialog f124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private java.util.List f128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f130g;
        private android.ext.l0 h;
        final /* synthetic */ android.ext.EditorListener i;

        class a implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.EditorListener.b f131a;

            a(android.ext.EditorListener.b r1) {
                    r0 = this;
                    r0.f131a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r1, int r2) {
                    r0 = this;
                    android.ext.EditorListener$b r1 = r0.f131a
                    r1.f129f = r2
                    r2 = 0
                    r1.b(r2)
                    return
            }
        }

        /* JADX INFO: renamed from: android.ext.EditorListener$b$b, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0005b implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.EditorListener.b f132a;

            DialogInterfaceOnClickListenerC0005b(android.ext.EditorListener.b r1) {
                    r0 = this;
                    r0.f132a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r1, int r2) {
                    r0 = this;
                    android.ext.EditorListener$b r1 = r0.f132a
                    r1.f130g = r2
                    r2 = 0
                    r1.b(r2)
                    return
            }
        }

        class c implements android.content.DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ android.ext.c f133a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ android.ext.EditorListener.b f134b;

            c(android.ext.EditorListener.b r1, android.ext.c r2) {
                    r0 = this;
                    r0.f134b = r1
                    r0.f133a = r2
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r1, int r2) {
                    r0 = this;
                    android.ext.c r1 = r0.f133a
                    r1.f674c = r2
                    android.ext.EditorListener$b r2 = r0.f134b
                    r2.d(r1)
                    return
            }
        }

        private b(android.ext.EditorListener r2) {
                r1 = this;
                r1.i = r2
                r1.<init>()
                r2 = 0
                r1.f126c = r2
                r1.f127d = r2
                r0 = 0
                r1.f128e = r0
                r1.f129f = r2
                r1.f130g = r2
                return
        }

        /* synthetic */ b(android.ext.EditorListener r1, android.ext.EditorListener.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private boolean a(android.view.View r19) {
                r18 = this;
                r0 = r18
                int r1 = r19.getId()
                r2 = 32
                r3 = 4
                r4 = 59
                r5 = 1
                r7 = 0
                r9 = 1
                r10 = 0
                switch(r1) {
                    case 2131034255: goto L193;
                    case 2131034256: goto L12e;
                    case 2131034257: goto L12e;
                    case 2131034258: goto L12e;
                    case 2131034259: goto L3c;
                    case 2131034260: goto L3c;
                    case 2131034261: goto L17;
                    default: goto L14;
                }
            L14:
                r1 = 0
                goto L1db
            L17:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.util.List r2 = r0.f128e
                int r2 = r2.size()
                r3 = 0
            L23:
                if (r3 >= r2) goto L1db
                java.util.List r5 = r0.f128e
                java.lang.Object r5 = r5.get(r3)
                android.ext.c r5 = (android.ext.c) r5
                if (r3 == 0) goto L32
                r1.append(r4)
            L32:
                java.lang.String r5 = r5.J()
                r1.append(r5)
                int r3 = r3 + 1
                goto L23
            L3c:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r2 = r19.getId()
                r11 = 2131034260(0x7f050094, float:1.7679033E38)
                if (r2 != r11) goto L4c
                r2 = 1
                goto L4d
            L4c:
                r2 = 0
            L4d:
                if (r2 == 0) goto L51
                r4 = 58
            L51:
                r1.append(r4)
                if (r2 != 0) goto Lf5
                android.ext.l0 r4 = r0.h
                android.ext.c r4 = r4.c()
                int r4 = r4.f674c
                if (r4 != r9) goto L62
                goto Lf5
            L62:
                android.ext.l0 r2 = r0.h
                android.ext.c r2 = r2.c()
                int r2 = r2.f674c
                r4 = 2
                if (r2 != r4) goto La5
                java.util.List r2 = r0.f128e
                int r2 = r2.size()
                char[] r3 = new char[r2]
                r5 = r7
                r4 = 0
            L77:
                if (r4 >= r2) goto L9b
                java.util.List r11 = r0.f128e
                java.lang.Object r11 = r11.get(r4)
                android.ext.c r11 = (android.ext.c) r11
                int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r12 == 0) goto L90
                r12 = 2
                long r5 = r5 + r12
                long r12 = r11.f672a
                int r14 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
                if (r14 == 0) goto L90
                r2 = r4
                goto L9b
            L90:
                long r5 = r11.f672a
                long r11 = r11.f673b
                int r12 = (int) r11
                char r11 = (char) r12
                r3[r4] = r11
                int r4 = r4 + 1
                goto L77
            L9b:
                java.lang.String r4 = new java.lang.String
                r4.<init>(r3, r10, r2)
                r1.append(r4)
                goto L1db
            La5:
                android.ext.l0 r2 = r0.h
                android.ext.c r2 = r2.c()
                int r2 = r2.f674c
                if (r2 != r3) goto L1db
                java.util.List r2 = r0.f128e
                int r2 = r2.size()
                int r3 = r2 * 2
                char[] r3 = new char[r3]
                r11 = r7
                r5 = 0
            Lbb:
                if (r5 >= r2) goto Le9
                java.util.List r6 = r0.f128e
                java.lang.Object r6 = r6.get(r5)
                android.ext.c r6 = (android.ext.c) r6
                int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r13 == 0) goto Ld4
                r13 = 4
                long r11 = r11 + r13
                long r13 = r6.f672a
                int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r15 == 0) goto Ld4
                r2 = r5
                goto Le9
            Ld4:
                long r11 = r6.f672a
                int r13 = r5 * 2
                long r14 = r6.f673b
                int r6 = (int) r14
                char r6 = (char) r6
                r3[r13] = r6
                int r13 = r13 + r9
                r6 = 16
                long r14 = r14 >> r6
                int r6 = (int) r14
                char r6 = (char) r6
                r3[r13] = r6
                int r5 = r5 + 1
                goto Lbb
            Le9:
                java.lang.String r5 = new java.lang.String
                int r2 = r2 * 2
                r5.<init>(r3, r10, r2)
            Lf0:
                r1.append(r5)
                goto L1db
            Lf5:
                java.util.List r3 = r0.f128e
                int r3 = r3.size()
                byte[] r4 = new byte[r3]
                r12 = r7
                r11 = 0
            Lff:
                if (r11 >= r3) goto L123
                java.util.List r14 = r0.f128e
                java.lang.Object r14 = r14.get(r11)
                android.ext.c r14 = (android.ext.c) r14
                int r15 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
                if (r15 == 0) goto L116
                long r12 = r12 + r5
                long r5 = r14.f672a
                int r17 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r17 == 0) goto L116
                r3 = r11
                goto L123
            L116:
                long r12 = r14.f672a
                long r5 = r14.f673b
                int r6 = (int) r5
                byte r5 = (byte) r6
                r4[r11] = r5
                int r11 = r11 + 1
                r5 = 1
                goto Lff
            L123:
                java.lang.String r5 = new java.lang.String
                r2 = r2 ^ r9
                java.nio.charset.Charset r2 = android.ext.t1.i(r2)
                r5.<init>(r4, r10, r3, r2)
                goto Lf0
            L12e:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r3 = 81
                r1.append(r3)
                r1.append(r2)
                int r2 = r19.getId()
                java.util.List r3 = r0.f128e
                int r3 = r3.size()
                byte[] r13 = new byte[r3]
                r5 = r7
                r4 = 0
            L149:
                if (r4 >= r3) goto L16f
                java.util.List r11 = r0.f128e
                java.lang.Object r11 = r11.get(r4)
                android.ext.c r11 = (android.ext.c) r11
                int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r12 == 0) goto L162
                r14 = 1
                long r5 = r5 + r14
                long r9 = r11.f672a
                int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r12 == 0) goto L162
                r14 = r4
                goto L170
            L162:
                long r5 = r11.f672a
                long r9 = r11.f673b
                int r10 = (int) r9
                byte r9 = (byte) r10
                r13[r4] = r9
                int r4 = r4 + 1
                r9 = 1
                r10 = 0
                goto L149
            L16f:
                r14 = r3
            L170:
                r12 = 0
                r3 = 2131034257(0x7f050091, float:1.7679026E38)
                r4 = 2131034258(0x7f050092, float:1.7679028E38)
                if (r2 == r3) goto L17e
                if (r2 != r4) goto L17c
                goto L17e
            L17c:
                r15 = 0
                goto L17f
            L17e:
                r15 = 1
            L17f:
                r3 = 2131034256(0x7f050090, float:1.7679024E38)
                if (r2 == r3) goto L18a
                if (r2 != r4) goto L187
                goto L18a
            L187:
                r16 = 0
                goto L18c
            L18a:
                r16 = 1
            L18c:
                r17 = 0
                r11 = r1
                android.ext.x0.b(r11, r12, r13, r14, r15, r16, r17)
                goto L1db
            L193:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r4 = 104(0x68, float:1.46E-43)
                r1.append(r4)
                java.util.List r4 = r0.f128e
                int r4 = r4.size()
                char[] r5 = android.ext.x0.f1306a
                r9 = r7
                r6 = 0
            L1a7:
                if (r6 >= r4) goto L1db
                java.util.List r11 = r0.f128e
                java.lang.Object r11 = r11.get(r6)
                android.ext.c r11 = (android.ext.c) r11
                int r12 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r12 == 0) goto L1bf
                r12 = 1
                long r9 = r9 + r12
                long r14 = r11.f672a
                int r16 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r16 == 0) goto L1c1
                goto L1db
            L1bf:
                r12 = 1
            L1c1:
                long r9 = r11.f672a
                r1.append(r2)
                long r14 = r11.f673b
                int r11 = (int) r14
                r14 = r11 & 240(0xf0, float:3.36E-43)
                int r14 = r14 >> r3
                char r14 = r5[r14]
                r1.append(r14)
                r11 = r11 & 15
                char r11 = r5[r11]
                r1.append(r11)
                int r6 = r6 + 1
                goto L1a7
            L1db:
                if (r1 == 0) goto L1e6
                android.ext.l0 r2 = r0.h
                java.lang.String r3 = r1.toString()
                r2.s(r3)
            L1e6:
                if (r1 == 0) goto L1ea
                r9 = 1
                goto L1eb
            L1ea:
                r9 = 0
            L1eb:
                return r9
        }

        private void c(boolean r19, boolean r20, java.lang.String r21) {
                r18 = this;
                r0 = r18
                r1 = r21
                r2 = 2
                r3 = 1
                if (r19 == 0) goto L2d
                android.ext.MainService r4 = android.ext.MainService.instance
                int r4 = r4.H()
                if (r4 != r3) goto L1d
                android.ext.MainService r5 = android.ext.MainService.instance
                long r5 = r5.p0
                r7 = 1
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 != 0) goto L1d
                r0.f127d = r3
                goto L2d
            L1d:
                if (r4 != r2) goto L2c
                android.ext.MainService r4 = android.ext.MainService.instance
                android.ext.SavedListAdapter r4 = r4.t0
                int r4 = r4.getCount()
                if (r4 != r3) goto L2c
                r0.f127d = r2
                goto L2d
            L2c:
                return
            L2d:
                int r4 = r0.f127d
                if (r4 == r3) goto L33
                if (r4 != r2) goto L192
            L33:
                android.ext.MainService r4 = android.ext.MainService.instance
                android.ext.c2 r4 = r4.f216f
                if (r4 == 0) goto L192
                android.ext.l0 r5 = r0.h
                android.ext.h2 r5 = r5.g()
                int r6 = r0.f127d
                java.lang.String r7 = "t = nil\n\n"
                java.lang.String r8 = "end\n"
                java.lang.String r9 = "\tend\n"
                java.lang.String r10 = "v.value + "
                java.lang.String r11 = "\t\tv.value = "
                java.lang.String r12 = " then\n"
                java.lang.String r13 = "\tif v.flags == "
                java.lang.String r14 = "for i, v in ipairs(t) do\n"
                java.lang.String r15 = "local t = "
                r16 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
                java.lang.String r3 = "\n"
                if (r6 == r2) goto Lc5
                if (r20 == 0) goto L5d
                goto Lc5
            L5d:
                java.lang.String r2 = "revert = "
                r4.write(r2)
                r2 = 1
                android.ext.b0.n(r4, r2)
                int r6 = r5.f674c
                r2 = 1073741824(0x40000000, float:2.0)
                r0 = r6 & r2
                if (r0 != r2) goto La9
                r0 = r6 & r16
                r5.f674c = r0
                r4.write(r15)
                r0 = 1
                android.ext.b0.n(r4, r0)
                r4.write(r14)
                r4.write(r13)
                android.ext.Script$Consts r0 = r4.f697c
                android.ext.Script$Const[] r0 = r0.f372b
                int r2 = r5.f674c
                android.ext.Script.Consts.a(r4, r0, r2)
                r4.write(r12)
                r4.write(r11)
                r4.write(r10)
                android.ext.Script.Consts.c(r4, r1)
                r4.write(r3)
                r4.write(r9)
                r4.write(r8)
                java.lang.String r0 = "gg.setValues(t)\n"
                r4.write(r0)
                r4.write(r7)
            La5:
                r0 = r18
                goto L192
            La9:
                java.lang.String r0 = "gg.editAll("
                r4.write(r0)
                android.ext.Script.Consts.c(r4, r1)
                java.lang.String r0 = ", "
                r4.write(r0)
                android.ext.Script$Consts r0 = r4.f697c
                android.ext.Script$Const[] r0 = r0.f372b
                int r1 = r5.f674c
                android.ext.Script.Consts.a(r4, r0, r1)
                java.lang.String r0 = ")\n"
                r4.write(r0)
                goto La5
            Lc5:
                java.lang.String r0 = "\nrevert = "
                r4.write(r0)
                r0 = r18
                int r6 = r0.f127d
                java.lang.String r2 = "gg.getListItems()\n"
                r17 = r7
                r7 = 1
                if (r6 != r7) goto Ld9
                android.ext.b0.n(r4, r7)
                goto Ldc
            Ld9:
                r4.write(r2)
            Ldc:
                r4.write(r15)
                int r6 = r0.f127d
                if (r6 != r7) goto Le7
                android.ext.b0.n(r4, r7)
                goto Lea
            Le7:
                r4.write(r2)
            Lea:
                r4.write(r14)
                r4.write(r13)
                android.ext.Script$Consts r2 = r4.f697c
                android.ext.Script$Const[] r2 = r2.f372b
                int r6 = r5.f674c
                android.ext.Script.Consts.a(r4, r2, r6)
                r4.write(r12)
                r4.write(r11)
                int r2 = r5.f674c
                r6 = 1073741824(0x40000000, float:2.0)
                r7 = r2 & r6
                if (r7 != r6) goto L10e
                r2 = r2 & r16
                r5.f674c = r2
                r4.write(r10)
            L10e:
                android.ext.Script.Consts.c(r4, r1)
                r4.write(r3)
                int r1 = r0.f127d
                r2 = 2
                if (r1 == r2) goto L11d
                boolean r1 = r5.m
                if (r1 == 0) goto L182
            L11d:
                java.lang.String r1 = "\t\tv.freeze = "
                r4.write(r1)
                boolean r1 = r5.m
                java.lang.String r1 = java.lang.Boolean.toString(r1)
                r4.write(r1)
                r4.write(r3)
                int r1 = r0.f127d
                r2 = 2
                if (r1 == r2) goto L137
                byte r1 = r5.n
                if (r1 == 0) goto L182
            L137:
                byte r1 = r5.n
                r6 = 3
                if (r1 == 0) goto L151
                r7 = 1
                if (r1 == r7) goto L14e
                if (r1 == r2) goto L14b
                if (r1 == r6) goto L148
                java.lang.String r1 = java.lang.Integer.toString(r1)
                goto L153
            L148:
                java.lang.String r1 = "gg.FREEZE_IN_RANGE"
                goto L153
            L14b:
                java.lang.String r1 = "gg.FREEZE_MAY_DECREASE"
                goto L153
            L14e:
                java.lang.String r1 = "gg.FREEZE_MAY_INCREASE"
                goto L153
            L151:
                java.lang.String r1 = "gg.FREEZE_NORMAL"
            L153:
                java.lang.String r2 = "\t\tv.freezeType = "
                r4.write(r2)
                r4.write(r1)
                r4.write(r3)
                byte r1 = r5.n
                if (r1 != r6) goto L182
                java.lang.String r1 = "\t\tv.freezeFrom = "
                r4.write(r1)
                r1 = 1
                java.lang.String r1 = r5.c0(r1)
                android.ext.Script.Consts.c(r4, r1)
                r4.write(r3)
                java.lang.String r1 = "\t\tv.freezeTo = "
                r4.write(r1)
                r1 = 0
                java.lang.String r1 = r5.c0(r1)
                android.ext.Script.Consts.c(r4, r1)
                r4.write(r3)
            L182:
                r4.write(r9)
                r4.write(r8)
                java.lang.String r1 = "gg.addListItems(t)\n"
                r4.write(r1)
                r1 = r17
                r4.write(r1)
            L192:
                return
        }

        void b(android.ext.c r19) {
                r18 = this;
                r0 = r18
                r1 = 0
                r0.f125b = r1
                r0.f126c = r1
                r2 = 0
                r3 = 2
                r4 = 1
                if (r19 != 0) goto L1b4
                r0.f125b = r4
                android.ext.MainService r5 = android.ext.MainService.instance
                java.lang.Object r5 = r5.z()
                int r6 = android.ext.Tools.L0(r5)
                r7 = 2131296822(0x7f090236, float:1.8211572E38)
                if (r6 != 0) goto L21
                android.ext.Tools.H1(r7)
                return
            L21:
                java.util.List r6 = r0.f128e
                r8 = 2131297030(0x7f090306, float:1.8211993E38)
                if (r6 != 0) goto Lf9
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                r0.f128e = r6
                boolean r6 = r5 instanceof boolean[]
                if (r6 == 0) goto L9e
                r6 = 3
                r0.f127d = r6
                int r6 = r0.f129f
                if (r6 != 0) goto L60
                r0.f128e = r2
                android.util.SparseIntArray r11 = new android.util.SparseIntArray
                r11.<init>()
                android.ext.MainService r1 = android.ext.MainService.instance
                android.ext.n1 r1 = r1.N
                boolean[] r5 = (boolean[]) r5
                int r1 = r1.q(r5, r11)
                a.e r10 = android.ext.c.o(r1)
                android.ext.u2 r9 = new android.ext.u2
                java.lang.String r12 = "0"
                java.lang.String r13 = android.ext.b2.f(r8)
                android.ext.EditorListener$b$a r14 = new android.ext.EditorListener$b$a
                r14.<init>(r0)
                r9.<init>(r10, r11, r12, r13, r14)
                return
            L60:
                android.ext.MainService r6 = android.ext.MainService.instance
                android.ext.n1 r6 = r6.N
                boolean[] r5 = (boolean[]) r5
                int r9 = r5.length
                int r9 = r9 - r4
                r10 = 1
            L69:
                if (r10 >= r9) goto L9b
                boolean r11 = r5[r10]
                if (r11 != 0) goto L70
                goto L98
            L70:
                android.ext.c r11 = new android.ext.c
                long r13 = r6.e(r10)
                r15 = 0
                int r12 = r0.f129f
                r17 = r12
                r12 = r11
                r12.<init>(r13, r15, r17)
                boolean r12 = r11.V()
                if (r12 != 0) goto L87
                goto L98
            L87:
                android.ext.MainService r12 = android.ext.MainService.instance
                long r13 = r11.f672a
                int r15 = r11.f674c
                long r12 = r12.B(r13, r15)
                r11.f673b = r12
                java.util.List r12 = r0.f128e
                r12.add(r11)
            L98:
                int r10 = r10 + 1
                goto L69
            L9b:
                r0.f129f = r1
                goto Lf9
            L9e:
                boolean r6 = r5 instanceof d.e
                if (r6 == 0) goto Lc1
                r0.f127d = r3
                d.e r5 = (d.e) r5
                int r6 = r5.l()
                r9 = 0
            Lab:
                if (r9 >= r6) goto Lf9
                boolean r10 = r5.a(r9)
                if (r10 == 0) goto Lbe
                java.util.List r10 = r0.f128e
                java.lang.Object r11 = r5.n(r9)
                android.ext.c r11 = (android.ext.c) r11
                r10.add(r11)
            Lbe:
                int r9 = r9 + 1
                goto Lab
            Lc1:
                boolean r6 = r5 instanceof d.a
                if (r6 == 0) goto Le2
                r0.f127d = r4
                d.a r5 = (d.a) r5
                int r6 = r5.i()
                r9 = 0
            Lce:
                if (r9 >= r6) goto Lf9
                boolean r10 = r5.c(r9)
                if (r10 == 0) goto Ldf
                java.util.List r10 = r0.f128e
                android.ext.c r11 = r5.f(r9, r2)
                r10.add(r11)
            Ldf:
                int r9 = r9 + 1
                goto Lce
            Le2:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Obj is unknown: "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            Lf9:
                java.util.List r5 = r0.f128e
                if (r5 == 0) goto L1a6
                int r5 = r5.size()
                if (r5 != 0) goto L10c
                android.ext.Tools.H1(r7)
                java.lang.String r1 = "It must never happen."
                android.ext.e1.d(r1)
                return
            L10c:
                int r5 = r0.f130g
                if (r5 != 0) goto L148
                android.util.SparseIntArray r11 = new android.util.SparseIntArray
                r11.<init>()
                java.util.List r2 = r0.f128e
                java.util.Iterator r2 = r2.iterator()
            L11b:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L133
                java.lang.Object r3 = r2.next()
                android.ext.c r3 = (android.ext.c) r3
                int r3 = r3.f674c
                r1 = r1 | r3
                int r5 = r11.get(r3)
                int r5 = r5 + r4
                r11.put(r3, r5)
                goto L11b
            L133:
                a.e r10 = android.ext.c.o(r1)
                android.ext.u2 r9 = new android.ext.u2
                java.lang.String r12 = "0"
                java.lang.String r13 = android.ext.b2.f(r8)
                android.ext.EditorListener$b$b r14 = new android.ext.EditorListener$b$b
                r14.<init>(r0)
                r9.<init>(r10, r11, r12, r13, r14)
                return
            L148:
                r5 = 0
            L149:
                java.util.List r6 = r0.f128e
                int r6 = r6.size()
                if (r5 >= r6) goto L168
                java.util.List r6 = r0.f128e
                java.lang.Object r6 = r6.get(r5)
                android.ext.c r6 = (android.ext.c) r6
                int r6 = r6.f674c
                int r7 = r0.f130g
                if (r6 == r7) goto L166
                java.util.List r6 = r0.f128e
                r6.remove(r5)
                int r5 = r5 + (-1)
            L166:
                int r5 = r5 + r4
                goto L149
            L168:
                r0.f130g = r1
                java.util.List r5 = r0.f128e
                int r5 = r5.size()
                if (r5 != 0) goto L18f
                r1 = 2131296808(0x7f090228, float:1.8211543E38)
                android.ext.Tools.H1(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "It must never happen. "
                r1.append(r2)
                int r2 = r0.f130g
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.ext.e1.d(r1)
                return
            L18f:
                java.util.List r5 = r0.f128e
                java.lang.Object r5 = r5.get(r1)
                android.ext.c r5 = (android.ext.c) r5
                android.ext.c r5 = r5.c()
                java.util.List r6 = r0.f128e
                int r6 = r6.size()
                if (r6 != r4) goto L1a9
                r0.f125b = r1
                goto L1a9
            L1a6:
                r5 = r19
                r6 = 0
            L1a9:
                if (r5 == 0) goto L1ac
                goto L1b7
            L1ac:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "Something going wrong"
                r1.<init>(r2)
                throw r1
            L1b4:
                r5 = r19
                r6 = 0
            L1b7:
                boolean r7 = r0.f125b
                if (r7 != 0) goto L1e3
                android.ext.MainService r7 = android.ext.MainService.instance
                android.ext.SavedListAdapter r7 = r7.t0
                long r8 = r5.f672a
                android.ext.h2 r7 = r7.e(r8)
                if (r7 == 0) goto L1dd
                int r8 = r7.Q()
                int r9 = r5.Q()
                if (r8 != r9) goto L1dd
                android.ext.h2 r7 = r7.Y()
                long r8 = r5.f673b
                r7.f673b = r8
                r0.f126c = r4
            L1db:
                r5 = r7
                goto L1e3
            L1dd:
                android.ext.h2 r7 = new android.ext.h2
                r7.<init>(r5)
                goto L1db
            L1e3:
                boolean r7 = r0.f125b
                if (r7 == 0) goto L1ed
                int r7 = r5.Q()
                r5.f674c = r7
            L1ed:
                android.ext.l0 r7 = new android.ext.l0
                boolean r8 = r0.f125b
                if (r8 == 0) goto L1f5
                r8 = 2
                goto L1fc
            L1f5:
                boolean r8 = r0.f126c
                if (r8 == 0) goto L1fb
                r8 = 0
                goto L1fc
            L1fb:
                r8 = 1
            L1fc:
                r7.<init>(r8, r5)
                r0.h = r7
                boolean r8 = r0.f125b
                if (r8 == 0) goto L21c
                java.lang.String r7 = android.ext.i2.l
                if (r7 == 0) goto L20d
                int r8 = r0.f127d
                if (r8 == r4) goto L211
            L20d:
                java.lang.String r7 = r5.J()
            L211:
                android.ext.l0 r8 = r0.h
                r8.s(r7)
                android.ext.l0 r7 = r0.h
                r7.q(r0)
                goto L223
            L21c:
                boolean r8 = r0.f126c
                if (r8 == 0) goto L223
                r7.l()
            L223:
                java.lang.CharSequence r7 = r5.u()
                android.ext.l0 r8 = r0.h
                android.text.SpannableString r9 = new android.text.SpannableString
                boolean r10 = r0.f125b
                if (r10 == 0) goto L245
                r10 = 2131296395(0x7f09008b, float:1.8210705E38)
                java.lang.String r10 = android.ext.b2.f(r10)
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r3[r1] = r6
                r3[r4] = r7
                java.lang.String r1 = android.ext.Tools.L1(r10, r3)
                goto L25a
            L245:
                r6 = 2131296397(0x7f09008d, float:1.821071E38)
                java.lang.String r6 = android.ext.b2.f(r6)
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r10 = r5.F()
                r3[r1] = r10
                r3[r4] = r7
                java.lang.String r1 = android.ext.Tools.L1(r6, r3)
            L25a:
                r9.<init>(r1)
                int r1 = r5.m()
                java.lang.CharSequence r1 = android.ext.Tools.v(r9, r7, r1)
                r8.r(r1)
                android.app.AlertDialog$Builder r1 = android.ext.f.b()
                android.ext.l0 r3 = r0.h
                android.view.View r3 = r3.j()
                android.app.AlertDialog$Builder r1 = r1.setView(r3)
                r3 = 2131297115(0x7f09035b, float:1.8212166E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r3, r0)
                r3 = 2131296805(0x7f090225, float:1.8211537E38)
                java.lang.String r3 = android.ext.b2.f(r3)
                android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r3, r2)
                android.app.AlertDialog r1 = r1.create()
                r0.f124a = r1
                boolean r2 = r0.f125b
                if (r2 != 0) goto L2a1
                r2 = 2131296514(0x7f090102, float:1.8210947E38)
                java.lang.String r2 = android.ext.b2.f(r2)
                r3 = -3
                r1.setButton(r3, r2, r0)
            L2a1:
                android.ext.f.l(r1, r0)
                android.ext.f.k(r1, r0)
                android.ext.l0 r2 = r0.h
                android.ext.EditText r2 = r2.f()
                android.ext.f.n(r1, r2)
                return
        }

        void d(android.ext.c r2) {
                r1 = this;
                r0 = 0
                r1.f128e = r0
                r0 = 0
                r1.f129f = r0
                r1.f130g = r0
                r1.f127d = r0
                r1.b(r2)
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r5, int r6) {
                r4 = this;
                r5 = -1
                if (r6 != r5) goto L4
                goto L4e
            L4:
                r5 = -2
                if (r6 != r5) goto L8
                goto L4e
            L8:
                r5 = -3
                if (r6 != r5) goto L4e
                boolean r5 = r4.f125b
                if (r5 != 0) goto L4e
                android.ext.l0 r5 = r4.h
                android.ext.c r5 = r5.c()
                android.ext.MainService r6 = android.ext.MainService.instance
                android.ext.EditorListener r0 = r4.i
                boolean r0 = android.ext.EditorListener.h(r0)
                if (r0 != 0) goto L21
                r0 = 0
                goto L27
            L21:
                long r0 = r5.f672a
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
            L27:
                java.lang.String r1 = r5.F()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 2131296498(0x7f0900f2, float:1.8210914E38)
                java.lang.String r3 = android.ext.Tools.N1(r3)
                r2.append(r3)
                java.lang.String r3 = ": ("
                r2.append(r3)
                r2.append(r5)
                r5 = 41
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r6.L(r0, r1, r5)
            L4e:
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r36) {
                r35 = this;
                r1 = r35
                java.lang.String r2 = "Exception in EditorListener"
                r0 = 0
                if (r36 == 0) goto L2bd
                java.lang.Object r3 = r36.getTag()
                boolean r3 = r3 instanceof android.ext.p1
                if (r3 == 0) goto L11
                goto L2bd
            L11:
                boolean r3 = r1.f125b     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L268
                boolean r3 = r35.a(r36)     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                if (r3 == 0) goto L1e
                return
            L1e:
                android.ext.l0 r3 = r1.h     // Catch: java.lang.NumberFormatException -> L34 java.lang.Throwable -> L21f
                java.lang.String r3 = r3.e()     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                java.lang.String r3 = android.ext.j2.h(r3)     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                android.ext.i2$c r6 = android.ext.i2.x(r3, r5)     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                if (r6 == 0) goto L37
                int r7 = r6.f1018b     // Catch: java.lang.Throwable -> L31 java.lang.NumberFormatException -> L34
                goto L38
            L31:
                r0 = move-exception
                goto L256
            L34:
                r0 = move-exception
                goto L25e
            L37:
                r7 = 0
            L38:
                if (r6 == 0) goto L3d
                java.lang.String r6 = r6.f1017a     // Catch: java.lang.Throwable -> L31 java.lang.NumberFormatException -> L34
                goto L3e
            L3d:
                r6 = r3
            L3e:
                android.ext.l0 r8 = r1.h     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                boolean r8 = r8.n()     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                android.ext.l0 r9 = r1.h     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                java.lang.String r9 = r9.b()     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                java.lang.String r9 = android.ext.j2.h(r9)     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                java.util.List r10 = r1.f128e     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                int r14 = r10.size()     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                android.ext.l0 r10 = r1.h     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                boolean r18 = r10.o()     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                android.ext.l0 r10 = r1.h     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                android.ext.c r10 = r10.c()     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                int r10 = r10.f674c     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                if (r10 != r4) goto L72
                boolean r11 = android.ext.t1.m(r6)     // Catch: java.lang.Throwable -> L31 java.lang.NumberFormatException -> L34
                if (r11 == 0) goto L72
                byte[] r10 = android.ext.t1.h(r6)     // Catch: java.lang.Throwable -> L31 java.lang.NumberFormatException -> L34
                r12 = r0
                r15 = r12
                r13 = r10
                goto La7
            L72:
                r10 = r10 & 6
                r11 = 59
                if (r10 == 0) goto L90
                boolean r10 = android.ext.t1.m(r6)     // Catch: java.lang.Throwable -> L31 java.lang.NumberFormatException -> L34
                if (r10 == 0) goto L90
                char r10 = r6.charAt(r5)     // Catch: java.lang.Throwable -> L31 java.lang.NumberFormatException -> L34
                if (r10 != r11) goto L90
                java.lang.String r10 = r6.substring(r4)     // Catch: java.lang.Throwable -> L31 java.lang.NumberFormatException -> L34
                char[] r10 = r10.toCharArray()     // Catch: java.lang.Throwable -> L31 java.lang.NumberFormatException -> L34
                r13 = r0
                r15 = r13
                r12 = r10
                goto La7
            L90:
                int r10 = r6.indexOf(r11)     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                r11 = -1
                if (r10 == r11) goto La0
                java.lang.String r10 = ";"
                java.lang.String[] r10 = r6.split(r10)     // Catch: java.lang.Throwable -> L31 java.lang.NumberFormatException -> L34
                int r11 = r10.length     // Catch: java.lang.Throwable -> L31 java.lang.NumberFormatException -> L34
                if (r11 != 0) goto La4
            La0:
                r12 = r0
                r13 = r12
                r15 = r13
                goto La7
            La4:
                r12 = r0
                r13 = r12
                r15 = r10
            La7:
                android.ext.MainService r10 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                android.ext.SavedListAdapter r11 = r10.t0     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                if (r15 != 0) goto Lb0
                r19 = r0
                goto Lb5
            Lb0:
                int r10 = r15.length     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                android.ext.t1$b[] r10 = new android.ext.t1.b[r10]     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                r19 = r10
            Lb5:
                r20 = 0
                r16 = r0
                r28 = r20
                r10 = 0
                r17 = 0
                r30 = 0
            Lc0:
                if (r10 >= r14) goto L227
                java.util.List r4 = r1.f128e     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                java.lang.Object r4 = r4.get(r10)     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                android.ext.c r4 = (android.ext.c) r4     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                android.ext.MainService r5 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                android.ext.SavedListAdapter r5 = r5.t0     // Catch: java.lang.Throwable -> L21f java.lang.NumberFormatException -> L223
                r31 = r2
                r36 = r3
                long r2 = r4.f672a     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                android.ext.h2 r2 = r5.e(r2)     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                if (r2 == 0) goto Lf0
                int r2 = r2.Q()     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                int r3 = r4.Q()     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                if (r2 != r3) goto Lf0
                r2 = 1
                goto Lf1
            Le6:
                r0 = move-exception
                r2 = r31
                goto L256
            Leb:
                r0 = move-exception
                r2 = r31
                goto L25e
            Lf0:
                r2 = 0
            Lf1:
                android.ext.l0 r3 = r1.h     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                android.ext.h2 r3 = r3.h(r4)     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                if (r18 == 0) goto L1fa
                if (r13 == 0) goto L130
                r22 = 1
                long r28 = r28 + r22
                long r4 = r4.f672a     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                int r22 = (r28 > r4 ? 1 : (r28 == r4 ? 0 : -1))
                if (r22 == 0) goto L109
                r22 = r4
                r4 = 0
                goto L10d
            L109:
                r22 = r4
                r4 = r17
            L10d:
                int r5 = r13.length     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                if (r4 >= r5) goto L11c
                int r5 = r4 + 1
                r4 = r13[r4]     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                r17 = r5
                long r4 = (long) r4     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                r24 = 255(0xff, double:1.26E-321)
                long r4 = r4 & r24
                goto L120
            L11c:
                r17 = r4
                r4 = r20
            L120:
                r3.f673b = r4     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                r4 = r10
                r5 = r11
                r24 = r13
                r25 = r14
                r26 = r15
                r28 = r22
                r23 = r12
                goto L1f6
            L130:
                if (r12 == 0) goto L193
                int r5 = r4.f674c     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                r32 = r11
                r11 = 2
                if (r5 != r11) goto L13b
                r5 = 1
                goto L13c
            L13b:
                r5 = 0
            L13c:
                if (r5 == 0) goto L143
            L13e:
                r34 = r13
                r33 = r14
                goto L145
            L143:
                r11 = 4
                goto L13e
            L145:
                long r13 = (long) r11     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                long r28 = r28 + r13
                long r13 = r4.f672a     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                int r4 = (r28 > r13 ? 1 : (r28 == r13 ? 0 : -1))
                if (r4 == 0) goto L150
                r4 = 0
                goto L152
            L150:
                r4 = r17
            L152:
                int r11 = r12.length     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                r22 = 65535(0xffff, double:3.23786E-319)
                if (r4 >= r11) goto L163
                int r11 = r4 + 1
                char r4 = r12[r4]     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                r24 = r13
                long r13 = (long) r4     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                long r13 = r13 & r22
                r4 = r11
                goto L167
            L163:
                r24 = r13
                r13 = r20
            L167:
                r3.f673b = r13     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                if (r5 != 0) goto L182
                int r5 = r12.length     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                if (r4 >= r5) goto L17b
                int r5 = r4 + 1
                char r4 = r12[r4]     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                r11 = r5
                long r4 = (long) r4     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                long r4 = r4 & r22
                r17 = 16
                long r4 = r4 << r17
                goto L17e
            L17b:
                r11 = r4
                r4 = r20
            L17e:
                long r4 = r4 | r13
                r3.f673b = r4     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                r4 = r11
            L182:
                r17 = r4
                r4 = r10
                r23 = r12
                r26 = r15
                r28 = r24
                r5 = r32
                r25 = r33
                r24 = r34
                goto L1f6
            L193:
                r32 = r11
                r34 = r13
                r33 = r14
                if (r15 != 0) goto L1b3
                if (r0 != 0) goto L1b0
                r22 = 0
                int r0 = r3.f674c     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                r25 = 2131296829(0x7f09023d, float:1.8211586E38)
                long r13 = r4.f672a     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                r23 = r6
                r24 = r0
                r26 = r13
                android.ext.t1$b r0 = android.ext.c.W(r22, r23, r24, r25, r26)     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
            L1b0:
                r5 = r17
                goto L1d2
            L1b3:
                int r0 = r15.length     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                int r17 = r10 % r0
                r6 = r15[r17]     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                r0 = r19[r17]     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                if (r0 != 0) goto L1b0
                r22 = 0
                int r0 = r3.f674c     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                r25 = 2131296829(0x7f09023d, float:1.8211586E38)
                long r13 = r4.f672a     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                r23 = r6
                r24 = r0
                r26 = r13
                android.ext.t1$b r0 = android.ext.c.W(r22, r23, r24, r25, r26)     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                r19[r17] = r0     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                goto L1b0
            L1d2:
                long r13 = r4.f672a     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                int r30 = r30 + 1
                r4 = r10
                r10 = r3
                r22 = r5
                r5 = r32
                r11 = r16
                r23 = r12
                r12 = r0
                r16 = r13
                r24 = r34
                r13 = r6
                r26 = r15
                r25 = r33
                r14 = r16
                r16 = r9
                r17 = r30
                android.ext.c$b r16 = r10.f(r11, r12, r13, r14, r16, r17)     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                r17 = r22
            L1f6:
                r3.b(r7)     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                goto L204
            L1fa:
                r4 = r10
                r5 = r11
                r23 = r12
                r24 = r13
                r25 = r14
                r26 = r15
            L204:
                if (r8 != 0) goto L208
                if (r2 == 0) goto L20c
            L208:
                r2 = 0
                r5.b(r3, r2, r2)     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
            L20c:
                int r10 = r4 + 1
                r3 = r36
                r11 = r5
                r12 = r23
                r13 = r24
                r14 = r25
                r15 = r26
                r2 = r31
                r4 = 1
                r5 = 0
                goto Lc0
            L21f:
                r0 = move-exception
                r31 = r2
                goto L256
            L223:
                r0 = move-exception
                r31 = r2
                goto L25e
            L227:
                r31 = r2
                r36 = r3
                r5 = r11
                r23 = r12
                r24 = r13
                r5.notifyDataSetChanged()     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                r0.e0()     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                android.app.AlertDialog r0 = r1.f124a     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                android.ext.Tools.D(r0)     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                java.lang.String r0 = android.ext.i2.l     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                if (r0 == 0) goto L24b
                int r0 = r1.f127d     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                r2 = 1
                if (r0 != r2) goto L24b
                if (r24 != 0) goto L24f
                if (r23 == 0) goto L24b
                goto L24f
            L24b:
                r2 = r36
                r0 = 0
                goto L252
            L24f:
                android.ext.i2.l = r36     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                goto L24b
            L252:
                r1.c(r0, r8, r2)     // Catch: java.lang.Throwable -> Le6 java.lang.NumberFormatException -> Leb
                goto L2c0
            L256:
                android.ext.e1.l(r2, r0)     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                goto L2c0
            L25a:
                r0 = move-exception
                goto L2af
            L25c:
                r0 = move-exception
                goto L2b3
            L25e:
                android.ext.l0 r3 = r1.h     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                android.ext.EditText r3 = r3.f()     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                android.ext.j2.i(r0, r3)     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                return
            L268:
                android.ext.l0 r0 = r1.h     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                java.lang.String r0 = r0.e()     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                java.lang.String r0 = android.ext.j2.h(r0)     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                r3 = 0
                android.ext.i2$c r4 = android.ext.i2.x(r0, r3)     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                if (r4 == 0) goto L27c
                int r5 = r4.f1018b     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                goto L27d
            L27c:
                r5 = 0
            L27d:
                if (r4 == 0) goto L281
                java.lang.String r0 = r4.f1017a     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
            L281:
                android.ext.l0 r3 = r1.h     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                android.ext.h2 r3 = r3.g()     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                r3.X(r0)     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                r3.b(r5)     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                android.ext.l0 r4 = r1.h     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                boolean r4 = r4.n()     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                if (r4 != 0) goto L299
                boolean r5 = r1.f126c     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                if (r5 == 0) goto L2a0
            L299:
                android.ext.MainService r5 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                android.ext.SavedListAdapter r5 = r5.t0     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                r5.a(r3)     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
            L2a0:
                android.app.AlertDialog r3 = r1.f124a     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                android.ext.Tools.D(r3)     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                r3 = 1
                r1.c(r3, r4, r0)     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                android.ext.MainService r0 = android.ext.MainService.instance     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                r0.e0()     // Catch: java.lang.Throwable -> L25a java.lang.NumberFormatException -> L25c
                goto L2c0
            L2af:
                android.ext.e1.l(r2, r0)
                goto L2c0
            L2b3:
                android.ext.l0 r2 = r1.h
                android.ext.EditText r2 = r2.f()
                android.ext.j2.i(r0, r2)
                return
            L2bd:
                r1.d(r0)
            L2c0:
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r1) {
                r0 = this;
                android.ext.l0 r1 = r0.h     // Catch: java.lang.Throwable -> L6
                r1.k()     // Catch: java.lang.Throwable -> L6
                goto La
            L6:
                r1 = move-exception
                android.ext.e1.a(r1)
            La:
                return
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                java.lang.Object r2 = r1.getItemAtPosition(r3)
                boolean r3 = r2 instanceof android.ext.v0
                if (r3 == 0) goto L23
                android.ext.MainService r1 = android.ext.MainService.instance
                android.ext.v0 r2 = (android.ext.v0) r2
                long r3 = r2.b()
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.String r2 = r2.a()
                r4 = 2131296493(0x7f0900ed, float:1.8210904E38)
                java.lang.String r4 = android.ext.Tools.N1(r4)
                r1.L(r3, r2, r4)
                return
            L23:
                boolean r3 = r2 instanceof android.ext.c
                if (r3 == 0) goto L2a
                android.ext.c r2 = (android.ext.c) r2
                goto L2b
            L2a:
                r2 = 0
            L2b:
                if (r2 != 0) goto L2e
                return
            L2e:
                int r1 = r1.getId()
                r3 = 2131034317(0x7f0500cd, float:1.7679148E38)
                if (r1 != r3) goto L62
                int r1 = android.ext.Config.B
                r1 = r1 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L46
                int r1 = r2.f674c
                int r1 = java.lang.Integer.bitCount(r1)
                r3 = 1
                if (r1 == r3) goto L62
            L46:
                r1 = 127(0x7f, float:1.78E-43)
                long r3 = r2.f672a
                a.e r1 = android.ext.c.p(r1, r3)
                android.ext.u2 r3 = new android.ext.u2
                r4 = 2131297030(0x7f090306, float:1.8211993E38)
                java.lang.String r4 = android.ext.b2.f(r4)
                android.ext.EditorListener$b$c r5 = new android.ext.EditorListener$b$c
                r5.<init>(r0, r2)
                java.lang.String r2 = "0"
                r3.<init>(r1, r2, r4, r5)
                goto L65
            L62:
                r0.d(r2)
            L65:
                return
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface r4) {
                r3 = this;
                android.ext.l0 r0 = r3.h
                android.ext.EditText r0 = r0.f()
                r1 = -1
                r2 = 0
                android.ext.Tools.t1(r4, r1, r2, r3, r0)
                return
        }
    }

    public EditorListener() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public EditorListener(boolean r3) {
            r2 = this;
            r0 = 2131296398(0x7f09008e, float:1.8210712E38)
            r1 = 2130968655(0x7f04004f, float:1.754597E38)
            r2.<init>(r0, r1)
            r2.f123f = r3
            return
    }

    static /* synthetic */ boolean h(android.ext.EditorListener r0) {
            boolean r0 = r0.f123f
            return r0
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            android.ext.EditorListener$b r0 = new android.ext.EditorListener$b
            r1 = 0
            r0.<init>(r2, r1)
            r0.onClick(r3)
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView r7, android.view.View r8, int r9, long r10) {
            r6 = this;
            android.ext.EditorListener$b r0 = new android.ext.EditorListener$b
            r1 = 0
            r0.<init>(r6, r1)
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.onItemClick(r1, r2, r3, r4)
            return
    }
}
