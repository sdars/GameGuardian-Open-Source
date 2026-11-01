package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
abstract class z0 {

    class a implements android.content.DialogInterface.OnClickListener {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.ext.z0.a()
                return
        }
    }

    class b implements android.content.DialogInterface.OnClickListener {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.ext.z0.b()
                return
        }
    }

    class c implements android.content.DialogInterface.OnClickListener {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r2, int r3) {
                r1 = this;
                r0 = 1
                if (r3 != r0) goto L6
            L3:
                android.ext.b1.y = r0
                goto La
            L6:
                r0 = 2
                if (r3 != r0) goto La
                goto L3
            La:
                boolean r3 = r2 instanceof android.app.AlertDialog
                if (r3 == 0) goto L13
                android.app.AlertDialog r2 = (android.app.AlertDialog) r2
                r2.dismiss()
            L13:
                return
        }
    }

    class d implements android.content.DialogInterface.OnCancelListener {
        d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(android.content.DialogInterface r1) {
                r0 = this;
                android.ext.z0.b()
                return
        }
    }

    class e implements java.lang.Runnable {
        e() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.ext.r r0 = android.ext.r.n
                r1 = 1
                r0.L(r1)
                android.ext.b1.z1()
                return
        }
    }

    class f implements java.lang.Runnable {
        f() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.lang.String r0 = "install-mode-unavailable"
                android.ext.b1.R1(r0)
                android.ext.r r0 = android.ext.r.n
                if (r0 == 0) goto Lc
                r0.finish()
            Lc:
                android.ext.f1.n()
                return
        }
    }

    class g implements android.content.DialogInterface.OnClickListener {
        g() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r1, int r2) {
                r0 = this;
                android.ext.z0.h()
                return
        }
    }

    class h implements android.content.DialogInterface.OnCancelListener {
        h() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(android.content.DialogInterface r1) {
                r0 = this;
                android.ext.z0.h()
                return
        }
    }

    class i implements android.content.DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.AlertDialog f1411a;

        i(android.app.AlertDialog r1) {
                r0 = this;
                r0.f1411a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(android.content.DialogInterface r1) {
                r0 = this;
                android.app.AlertDialog r1 = r0.f1411a
                android.ext.z0.c(r1)
                return
        }
    }

    static /* synthetic */ void a() {
            f()
            return
    }

    static /* synthetic */ void b() {
            e()
            return
    }

    static /* synthetic */ void c(android.app.AlertDialog r0) {
            j(r0)
            return
    }

    private static int d(android.app.AlertDialog r3) {
            android.util.TypedValue r0 = new android.util.TypedValue     // Catch: java.lang.Throwable -> L24
            r0.<init>()     // Catch: java.lang.Throwable -> L24
            android.content.Context r3 = r3.getContext()     // Catch: java.lang.Throwable -> L24
            android.content.res.Resources$Theme r3 = r3.getTheme()     // Catch: java.lang.Throwable -> L24
            r1 = 16843829(0x1010435, float:2.3696576E-38)
            r2 = 1
            boolean r3 = r3.resolveAttribute(r1, r0, r2)     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L28
            int r3 = r0.type     // Catch: java.lang.Throwable -> L24
            r1 = 28
            if (r3 < r1) goto L28
            r1 = 31
            if (r3 > r1) goto L28
            int r3 = r0.data     // Catch: java.lang.Throwable -> L24
            return r3
        L24:
            r3 = move-exception
            android.ext.e1.a(r3)
        L28:
            r3 = -7686920(0xffffffffff8ab4f8, float:NaN)
            return r3
    }

    private static void e() {
            android.ext.r r0 = android.ext.r.n
            if (r0 == 0) goto L7
            r0.finish()
        L7:
            android.ext.f1.n()
            return
    }

    private static void f() {
            android.content.Context r0 = android.ext.r.p
            android.app.AlertDialog$Builder r0 = android.ext.f.c(r0)
            r1 = 2131296704(0x7f0901c0, float:1.8211332E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            java.lang.CharSequence r1 = g()
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            android.ext.z0$g r1 = new android.ext.z0$g
            r1.<init>()
            r2 = 2131296836(0x7f090244, float:1.82116E38)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r2, r1)
            android.app.AlertDialog r0 = r0.create()
            i(r0)
            android.ext.z0$h r1 = new android.ext.z0$h
            r1.<init>()
            r0.setOnCancelListener(r1)
            android.ext.f.m(r0)
            return
    }

    private static java.lang.CharSequence g() {
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            r1 = 2131296703(0x7f0901bf, float:1.821133E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.text.SpannableStringBuilder r1 = r0.append(r1)
            java.lang.String r2 = "\n\n"
            r1.append(r2)
            r1 = 2131296702(0x7f0901be, float:1.8211328E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.text.SpannableStringBuilder r1 = r0.append(r1)
            r1.append(r2)
            r1 = 2131296373(0x7f090075, float:1.821066E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 2131296464(0x7f0900d0, float:1.8210845E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r3 = 2131296465(0x7f0900d1, float:1.8210847E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}
            android.content.Context r2 = android.ext.r.p
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1094713344(0x41400000, float:12.0)
            float r2 = r2 * r3
            int r2 = (int) r2
            r3 = 1
            int r2 = java.lang.Math.max(r3, r2)
            r3 = 0
            r4 = 0
        L54:
            r5 = 3
            if (r4 >= r5) goto L7e
            int r6 = r0.length()
            java.lang.String r7 = "• "
            android.text.SpannableStringBuilder r7 = r0.append(r7)
            r8 = r1[r4]
            r7.append(r8)
            android.text.style.LeadingMarginSpan$Standard r7 = new android.text.style.LeadingMarginSpan$Standard
            r7.<init>(r3, r2)
            int r8 = r0.length()
            r9 = 33
            r0.setSpan(r7, r6, r8, r9)
            int r4 = r4 + 1
            if (r4 >= r5) goto L54
            r5 = 10
            r0.append(r5)
            goto L54
        L7e:
            return r0
    }

    static void h() {
            android.content.Context r0 = android.ext.r.p
            android.app.AlertDialog$Builder r0 = android.ext.f.c(r0)
            r1 = 2131296704(0x7f0901c0, float:1.8211332E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            r1 = 2131296373(0x7f090075, float:1.821066E38)
            java.lang.String r1 = android.ext.b2.f(r1)
            r2 = 2131296464(0x7f0900d0, float:1.8210845E38)
            java.lang.String r2 = android.ext.b2.f(r2)
            r3 = 2131296465(0x7f0900d1, float:1.8210847E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}
            android.ext.z0$c r2 = new android.ext.z0$c
            r2.<init>()
            r3 = -1
            android.app.AlertDialog$Builder r0 = r0.setSingleChoiceItems(r1, r3, r2)
            android.ext.z0$b r1 = new android.ext.z0$b
            r1.<init>()
            r2 = 2131296311(0x7f090037, float:1.8210535E38)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r1)
            android.ext.z0$a r1 = new android.ext.z0$a
            r1.<init>()
            r2 = 2131296786(0x7f090212, float:1.8211499E38)
            android.app.AlertDialog$Builder r0 = r0.setNeutralButton(r2, r1)
            r1 = 1
            android.app.AlertDialog$Builder r0 = r0.setCancelable(r1)
            android.app.AlertDialog r0 = r0.create()
            i(r0)
            android.ext.z0$d r1 = new android.ext.z0$d
            r1.<init>()
            r0.setOnCancelListener(r1)
            android.ext.z0$e r1 = new android.ext.z0$e
            r1.<init>()
            android.ext.z0$f r2 = new android.ext.z0$f
            r2.<init>()
            android.ext.f.u(r0, r1, r2)
            return
    }

    private static void i(android.app.AlertDialog r5) {
            android.widget.ListView r0 = r5.getListView()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L52
            android.graphics.drawable.StateListDrawable r1 = new android.graphics.drawable.StateListDrawable     // Catch: java.lang.Throwable -> L4e
            r1.<init>()     // Catch: java.lang.Throwable -> L4e
            r2 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r2 = new int[]{r2}     // Catch: java.lang.Throwable -> L4e
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.Throwable -> L4e
            r4 = 872415231(0x33ffffff, float:1.1920928E-7)
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4e
            r1.addState(r2, r3)     // Catch: java.lang.Throwable -> L4e
            r2 = 16842908(0x101009c, float:2.3693995E-38)
            int[] r2 = new int[]{r2}     // Catch: java.lang.Throwable -> L4e
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.Throwable -> L4e
            r4 = 587202559(0x22ffffff, float:6.9388935E-18)
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4e
            r1.addState(r2, r3)     // Catch: java.lang.Throwable -> L4e
            r0.setSelector(r1)     // Catch: java.lang.Throwable -> L4e
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.Throwable -> L4e
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L4e
            r0.setDivider(r1)     // Catch: java.lang.Throwable -> L4e
            android.content.res.Resources r1 = r0.getResources()     // Catch: java.lang.Throwable -> L4e
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch: java.lang.Throwable -> L4e
            float r1 = r1.density     // Catch: java.lang.Throwable -> L4e
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L4e
            r2 = 1
            int r1 = java.lang.Math.max(r2, r1)     // Catch: java.lang.Throwable -> L4e
            r0.setDividerHeight(r1)     // Catch: java.lang.Throwable -> L4e
            goto L52
        L4e:
            r0 = move-exception
            android.ext.e1.a(r0)
        L52:
            android.ext.z0$i r0 = new android.ext.z0$i
            r0.<init>(r5)
            android.ext.f.l(r5, r0)
            return
    }

    private static void j(android.app.AlertDialog r6) {
            int r0 = d(r6)     // Catch: java.lang.Throwable -> L26
            r1 = -1
            r2 = -2
            r3 = -3
            int[] r1 = new int[]{r1, r2, r3}     // Catch: java.lang.Throwable -> L26
            r2 = 0
        Lc:
            r3 = 3
            if (r2 >= r3) goto L2a
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L26
            android.widget.Button r3 = r6.getButton(r3)     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L18
            goto L23
        L18:
            r3.setTextColor(r0)     // Catch: java.lang.Throwable -> L26
            android.graphics.Typeface r4 = r3.getTypeface()     // Catch: java.lang.Throwable -> L26
            r5 = 1
            r3.setTypeface(r4, r5)     // Catch: java.lang.Throwable -> L26
        L23:
            int r2 = r2 + 1
            goto Lc
        L26:
            r6 = move-exception
            android.ext.e1.a(r6)
        L2a:
            return
    }
}
