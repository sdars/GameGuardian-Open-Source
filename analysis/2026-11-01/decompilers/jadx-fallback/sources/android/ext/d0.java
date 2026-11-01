package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class d0 extends android.ext.p1 {

    class a implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean[] f703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.d0 f704b;

        a(android.ext.d0 r1, boolean[] r2) {
                r0 = this;
                r0.f704b = r1
                r0.f703a = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r3, int r4) {
                r2 = this;
                r3 = -1
                r0 = 0
                if (r4 != r3) goto L1b
                r3 = 0
            L5:
                boolean[] r4 = r2.f703a
                int r1 = r4.length
                if (r0 >= r1) goto L1a
                boolean r4 = r4[r0]
                r1 = 1
                if (r4 == 0) goto L13
                int r4 = r1 << r0
                r3 = r3 | r4
                goto L17
            L13:
                int r4 = r1 << r0
                int r4 = ~r4
                r3 = r3 & r4
            L17:
                int r0 = r0 + 1
                goto L5
            L1a:
                r0 = r3
            L1b:
                r3 = 2131034158(0x7f05002e, float:1.7678826E38)
                android.ext.Config$p r3 = android.ext.Config.b(r3)
                r3.f42d = r0
                android.ext.Config.k()
                android.ext.d0 r3 = r2.f704b
                r3.i(r0)
                return
        }
    }

    class b implements android.content.DialogInterface.OnMultiChoiceClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean[] f705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.d0 f706b;

        b(android.ext.d0 r1, boolean[] r2) {
                r0 = this;
                r0.f706b = r1
                r0.f705a = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(android.content.DialogInterface r5, int r6, boolean r7) {
                r4 = this;
                boolean[] r0 = r4.f705a
                r0[r6] = r7
                if (r7 == 0) goto L29
                r7 = 4
                r0 = 0
                if (r6 < r7) goto Lb
                goto Lc
            Lb:
                r6 = 0
            Lc:
                android.app.AlertDialog r5 = (android.app.AlertDialog) r5
                android.widget.ListView r5 = r5.getListView()
                if (r5 == 0) goto L29
                r1 = 0
            L15:
                boolean[] r2 = r4.f705a
                int r3 = r2.length
                if (r1 >= r3) goto L29
                if (r1 < r7) goto L1e
                r3 = r1
                goto L1f
            L1e:
                r3 = 0
            L1f:
                if (r6 == r3) goto L26
                r2[r1] = r0
                r5.setItemChecked(r1, r0)
            L26:
                int r1 = r1 + 1
                goto L15
            L29:
                return
        }
    }

    class c implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.ext.d0 f708b;

        c(android.ext.d0 r1, java.lang.String r2) {
                r0 = this;
                r0.f708b = r1
                r0.f707a = r2
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r2, int r3) {
                r1 = this;
                r2 = -1
                r0 = 1
                if (r3 != r2) goto La
                java.lang.String r2 = r1.f707a
                android.ext.Tools.A(r2, r0)
                goto L1a
            La:
                android.ext.MainService r2 = android.ext.MainService.instance
                android.widget.TabHost r2 = r2.m
                r2.setCurrentTab(r0)
                android.ext.MainService r2 = android.ext.MainService.instance
                android.ext.i2 r2 = r2.W
                java.lang.String r3 = r1.f707a
                r2.u(r3)
            L1a:
                return
        }
    }

    class d implements android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.content.DialogInterface.OnClickListener f710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.ext.d0 f711c;

        d(android.ext.d0 r1, java.lang.String r2, android.content.DialogInterface.OnClickListener r3) {
                r0 = this;
                r0.f711c = r1
                r0.f709a = r2
                r0.f710b = r3
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r2, int r3) {
                r1 = this;
                android.ext.d0 r2 = r1.f711c
                java.lang.String r3 = r1.f709a
                android.content.DialogInterface$OnClickListener r0 = r1.f710b
                r2.j(r3, r0)
                return
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        byte[] f712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f714c;

        e() {
                r2 = this;
                r2.<init>()
                r0 = 800(0x320, float:1.121E-42)
                byte[] r0 = new byte[r0]
                r2.f712a = r0
                r0 = 0
                r2.f713b = r0
                r0 = 0
                r2.f714c = r0
                return
        }
    }

    public d0() {
            r2 = this;
            r0 = 2131296340(0x7f090054, float:1.8210594E38)
            r1 = 2130968598(0x7f040016, float:1.7545854E38)
            r2.<init>(r0, r1)
            return
    }

    private void h(android.ext.d0.e r9, java.lang.StringBuilder r10, android.ext.c r11, int r12) {
            r8 = this;
            if (r9 == 0) goto L39
            long r0 = r9.f714c
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 != 0) goto Le
            long r0 = r11.f672a
            r9.f714c = r0
        Le:
            int r10 = r11.D()
            long r0 = r11.f673b
            r12 = 0
        L15:
            if (r12 >= r10) goto L38
            long r2 = r11.f672a
            long r4 = (long) r12
            long r2 = r2 + r4
            long r4 = r9.f714c
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L32
            byte[] r4 = r9.f712a
            int r5 = r9.f713b
            int r6 = r5 + 1
            r9.f713b = r6
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 & r0
            int r7 = (int) r6
            byte r6 = (byte) r7
            r4[r5] = r6
            r9.f714c = r2
        L32:
            r2 = 8
            long r0 = r0 >> r2
            int r12 = r12 + 1
            goto L15
        L38:
            return
        L39:
            int r9 = r10.length()
            if (r9 == 0) goto L44
            r9 = 59
            r10.append(r9)
        L44:
            r9 = r12 & 2
            if (r9 == 0) goto L55
            java.lang.String r9 = r11.O()
            r10.append(r9)
            r9 = 114(0x72, float:1.6E-43)
        L51:
            r10.append(r9)
            goto L6a
        L55:
            r9 = r12 & 1
            if (r9 == 0) goto L63
            java.lang.String r9 = r11.L()
            r10.append(r9)
            r9 = 104(0x68, float:1.46E-43)
            goto L51
        L63:
            java.lang.String r9 = r11.J()
            r10.append(r9)
        L6a:
            r9 = r12 & 4
            if (r9 == 0) goto L75
            java.lang.CharSequence r9 = r11.z()
            r10.append(r9)
        L75:
            return
    }

    void i(int r22) {
            r21 = this;
            r0 = r21
            r1 = r22
            android.ext.MainService r2 = android.ext.MainService.instance
            java.lang.Object r2 = r2.z()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r3 = r1 & 1008(0x3f0, float:1.413E-42)
            int r3 = java.lang.Integer.numberOfTrailingZeros(r3)
            r4 = 32
            if (r3 == r4) goto L20
            android.ext.d0$e r5 = new android.ext.d0$e
            r5.<init>()
            r12 = r5
            goto L21
        L20:
            r12 = 0
        L21:
            boolean r5 = r2 instanceof d.a
            r6 = 100
            r7 = 0
            if (r5 == 0) goto L61
            d.a r2 = (d.a) r2
            android.ext.c r5 = new android.ext.c
            r5.<init>()
            int r9 = r2.i()
            r15 = r7
            r4 = 0
            r11 = 0
            r17 = 0
        L39:
            if (r11 >= r9) goto L5b
            boolean r18 = r2.c(r11)
            if (r18 != 0) goto L42
            goto L58
        L42:
            if (r4 >= r6) goto L51
            r2.f(r11, r5)
            r0.h(r12, r10, r5, r1)
            long r7 = r5.f672a
            if (r4 != 0) goto L4f
            r15 = r7
        L4f:
            int r4 = r4 + 1
        L51:
            int r14 = r17 + 1
            r17 = r14
            if (r14 <= r6) goto L58
            goto L5b
        L58:
            int r11 = r11 + 1
            goto L39
        L5b:
            r9 = r4
            r13 = r7
            r11 = r17
            goto Ldf
        L61:
            boolean r4 = r2 instanceof d.e
            if (r4 == 0) goto La2
            d.e r2 = (d.e) r2
            int r4 = r2.l()
            r14 = r7
            r5 = 0
            r9 = 0
            r11 = 0
        L6f:
            if (r5 >= r4) goto L9f
            boolean r16 = r2.a(r5)
            if (r16 != 0) goto L78
            goto L9a
        L78:
            java.lang.Object r16 = r2.n(r5)
            r13 = r16
            android.ext.h2 r13 = (android.ext.h2) r13
            boolean r6 = r13 instanceof android.ext.h2
            if (r6 != 0) goto L85
            goto L9a
        L85:
            r6 = 100
            if (r9 >= r6) goto L93
            r0.h(r12, r10, r13, r1)
            long r7 = r13.f672a
            if (r9 != 0) goto L91
            r14 = r7
        L91:
            int r9 = r9 + 1
        L93:
            int r11 = r11 + 1
            r6 = 100
            if (r11 <= r6) goto L9a
            goto L9f
        L9a:
            int r5 = r5 + 1
            r6 = 100
            goto L6f
        L9f:
            r15 = r14
        La0:
            r13 = r7
            goto Ldf
        La2:
            boolean r4 = r2 instanceof boolean[]
            if (r4 == 0) goto Ldb
            android.ext.MainService r4 = android.ext.MainService.instance
            android.ext.n1 r4 = r4.N
            boolean[] r2 = (boolean[]) r2
            int r5 = r2.length
            r6 = 1
            int r5 = r5 - r6
            r13 = r7
            r6 = 1
            r9 = 0
            r11 = 0
        Lb3:
            if (r6 >= r5) goto Ld6
            boolean r15 = r2[r6]
            if (r15 != 0) goto Lbc
            r15 = 100
            goto Ld8
        Lbc:
            r15 = 100
            if (r9 >= r15) goto Ld0
            java.lang.Object r7 = r4.getItem(r6)
            android.ext.c r7 = (android.ext.c) r7
            r0.h(r12, r10, r7, r1)
            long r7 = r7.f672a
            if (r9 != 0) goto Lce
            r13 = r7
        Lce:
            int r9 = r9 + 1
        Ld0:
            int r11 = r11 + 1
            r15 = 100
            if (r11 <= r15) goto Ld8
        Ld6:
            r15 = r13
            goto La0
        Ld8:
            int r6 = r6 + 1
            goto Lb3
        Ldb:
            r13 = r7
            r15 = r13
            r9 = 0
            r11 = 0
        Ldf:
            r2 = 2
            if (r12 != 0) goto Le4
            r4 = 2
            goto Le5
        Le4:
            r4 = 1
        Le5:
            if (r9 >= r4) goto L101
            r1 = 2131296798(0x7f09021e, float:1.8211523E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r5 = 1
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r4 = 0
            r2[r4] = r3
            java.lang.String r1 = android.ext.Tools.L1(r1, r2)
            android.ext.Tools.J1(r1)
            goto L207
        L101:
            r4 = 0
            r5 = 1
            if (r11 <= r9) goto L11b
            r6 = 2131297077(0x7f090335, float:1.8212089E38)
            java.lang.String r6 = android.ext.b2.f(r6)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r7[r4] = r5
            java.lang.String r4 = android.ext.Tools.L1(r6, r7)
            android.ext.Tools.J1(r4)
        L11b:
            r19 = 1
            r4 = 58
            r5 = 8
            if (r12 == 0) goto L19b
            r1 = 5
            r6 = 4
            if (r3 == r6) goto L17d
            if (r3 != r1) goto L12a
            goto L17d
        L12a:
            r1 = 6
            if (r3 != r1) goto L154
            r1 = 104(0x68, float:1.46E-43)
            r10.append(r1)
            char[] r1 = android.ext.x0.f1306a
            byte[] r3 = r12.f712a
            int r4 = r12.f713b
            r5 = 0
        L139:
            if (r5 >= r4) goto L1a7
            r7 = 32
            r10.append(r7)
            r7 = r3[r5]
            r8 = r7 & 240(0xf0, float:3.36E-43)
            int r8 = r8 >> r6
            char r8 = r1[r8]
            r10.append(r8)
            r7 = r7 & 15
            char r7 = r1[r7]
            r10.append(r7)
            int r5 = r5 + 1
            goto L139
        L154:
            r1 = 81
            r10.append(r1)
            r1 = 32
            r10.append(r1)
            r4 = 0
            byte[] r1 = r12.f712a
            int r6 = r12.f713b
            r7 = 7
            r8 = 9
            if (r3 == r7) goto L16d
            if (r3 != r8) goto L16b
            goto L16d
        L16b:
            r7 = 0
            goto L16e
        L16d:
            r7 = 1
        L16e:
            if (r3 == r5) goto L175
            if (r3 != r8) goto L173
            goto L175
        L173:
            r8 = 0
            goto L176
        L175:
            r8 = 1
        L176:
            r9 = 0
            r3 = r10
            r5 = r1
            android.ext.x0.b(r3, r4, r5, r6, r7, r8, r9)
            goto L1a7
        L17d:
            if (r3 != r1) goto L181
            r1 = 1
            goto L182
        L181:
            r1 = 0
        L182:
            if (r1 == 0) goto L186
            r4 = 59
        L186:
            r10.append(r4)
            java.lang.String r3 = new java.lang.String
            byte[] r4 = r12.f712a
            int r5 = r12.f713b
            java.nio.charset.Charset r1 = android.ext.t1.i(r1)
            r6 = 0
            r3.<init>(r4, r6, r5, r1)
            r10.append(r3)
            goto L1a7
        L19b:
            r1 = r1 & r5
            if (r1 == 0) goto L1a7
            r10.append(r4)
            long r3 = r13 + r19
            long r3 = r3 - r15
            r10.append(r3)
        L1a7:
            java.lang.String r1 = r10.toString()
            android.ext.d0$c r3 = new android.ext.d0$c
            r3.<init>(r0, r1)
            if (r12 != 0) goto L204
            long r4 = r13 - r15
            r6 = 65535(0xffff, double:3.23786E-319)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L204
            android.app.AlertDialog$Builder r4 = android.ext.f.b()
            r5 = 2131297015(0x7f0902f7, float:1.8211963E38)
            java.lang.String r5 = android.ext.b2.f(r5)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            long r13 = r13 + r19
            long r13 = r13 - r15
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            r7 = 0
            r2[r7] = r6
            r6 = 65535(0xffff, float:9.1834E-41)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 1
            r2[r7] = r6
            java.lang.String r2 = android.ext.Tools.L1(r5, r2)
            android.app.AlertDialog$Builder r2 = r4.setMessage(r2)
            r4 = 2131296836(0x7f090244, float:1.82116E38)
            java.lang.String r4 = android.ext.b2.f(r4)
            android.ext.d0$d r5 = new android.ext.d0$d
            r5.<init>(r0, r1, r3)
            android.app.AlertDialog$Builder r1 = r2.setPositiveButton(r4, r5)
            r2 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r3 = 0
            android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r2, r3)
            android.ext.f.o(r1)
            goto L207
        L204:
            r0.j(r1, r3)
        L207:
            return
    }

    void j(java.lang.String r2, android.content.DialogInterface.OnClickListener r3) {
            r1 = this;
            android.app.AlertDialog$Builder r0 = android.ext.f.b()
            android.app.AlertDialog$Builder r2 = r0.setMessage(r2)
            r0 = 2131296338(0x7f090052, float:1.821059E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            android.app.AlertDialog$Builder r2 = r2.setPositiveButton(r0, r3)
            r0 = 2131296942(0x7f0902ae, float:1.8211815E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            android.app.AlertDialog$Builder r2 = r2.setNeutralButton(r0, r3)
            r3 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r0 = 0
            android.app.AlertDialog$Builder r2 = r2.setNegativeButton(r3, r0)
            android.ext.f.o(r2)
            return
    }

    @Override // android.ext.p1, android.view.View.OnClickListener
    public void onClick(android.view.View r8) {
            r7 = this;
            r8 = 10
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r8]
            r1 = 2131296472(0x7f0900d8, float:1.8210862E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 0
            r0[r2] = r1
            r1 = 2131296473(0x7f0900d9, float:1.8210864E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r3 = 1
            r0[r3] = r1
            r1 = 2131296263(0x7f090007, float:1.8210438E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r4 = 2
            r0[r4] = r1
            r1 = 2131296262(0x7f090006, float:1.8210436E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r4 = 3
            r0[r4] = r1
            r1 = 4
            java.lang.String r4 = "UTF-8"
            r0[r1] = r4
            r1 = 5
            java.lang.String r4 = "UTF-16LE"
            r0[r1] = r4
            r1 = 6
            java.lang.String r4 = "HEX"
            r0[r1] = r4
            r1 = 7
            java.lang.String r4 = "HEX + UTF-8"
            r0[r1] = r4
            r1 = 8
            java.lang.String r4 = "HEX + UTF-16LE"
            r0[r1] = r4
            r1 = 9
            java.lang.String r4 = "HEX + UTF-8 + UTF-16LE"
            r0[r1] = r4
            int r1 = android.ext.Config.y
            boolean[] r4 = new boolean[r8]
            r5 = 0
        L51:
            if (r5 >= r8) goto L60
            int r6 = r3 << r5
            r6 = r6 & r1
            if (r6 == 0) goto L5a
            r6 = 1
            goto L5b
        L5a:
            r6 = 0
        L5b:
            r4[r5] = r6
            int r5 = r5 + 1
            goto L51
        L60:
            android.ext.d0$a r8 = new android.ext.d0$a
            r8.<init>(r7, r4)
            android.content.Context r1 = android.ext.Tools.k0()
            android.app.AlertDialog$Builder r1 = android.ext.f.c(r1)
            r2 = 2131296340(0x7f090054, float:1.8210594E38)
            android.view.View r2 = android.ext.Tools.g0(r2)
            android.app.AlertDialog$Builder r1 = r1.setCustomTitle(r2)
            android.ext.d0$b r2 = new android.ext.d0$b
            r2.<init>(r7, r4)
            android.app.AlertDialog$Builder r0 = r1.setMultiChoiceItems(r0, r4, r2)
            r1 = 2131297115(0x7f09035b, float:1.8212166E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r8 = r0.setPositiveButton(r1, r8)
            r0 = 2131296805(0x7f090225, float:1.8211537E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            r1 = 0
            android.app.AlertDialog$Builder r8 = r8.setNegativeButton(r0, r1)
            android.ext.f.o(r8)
            return
    }
}
