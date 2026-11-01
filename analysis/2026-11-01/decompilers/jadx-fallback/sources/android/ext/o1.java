package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public class o1 implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f1151b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f1152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.CharSequence f1153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        java.lang.String f1154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1155d;

        public a(long r1, java.lang.CharSequence r3, java.lang.String r4, int r5) {
                r0 = this;
                r0.<init>()
                r0.f1152a = r1
                r0.f1153b = r3
                r0.f1154c = r4
                r0.f1155d = r5
                return
        }

        public java.lang.CharSequence a() {
                r4 = this;
                r0 = 2
                java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]
                long r1 = r4.f1152a
                r3 = 0
                java.lang.String r1 = android.ext.c.G(r1, r3)
                r2 = 2130837504(0x7f020000, float:1.7279964E38)
                int r2 = android.ext.Tools.d0(r2)
                java.lang.CharSequence r1 = android.ext.Tools.t(r1, r2)
                r0[r3] = r1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ": "
                r1.append(r2)
                java.lang.CharSequence r2 = r4.f1153b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = -1
                java.lang.CharSequence r1 = android.ext.Tools.t(r1, r2)
                r2 = 1
                r0[r2] = r1
                java.lang.CharSequence r0 = android.ext.Tools.x(r0)
                return r0
        }
    }

    public static class b extends android.ext.p1 implements android.view.View.OnLongClickListener {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final android.ext.o1 f1156f;

        public b(android.ext.o1 r3) {
                r2 = this;
                r0 = 2131296295(0x7f090027, float:1.8210503E38)
                r1 = 2130968624(0x7f040030, float:1.7545907E38)
                r2.<init>(r0, r1)
                r2.f1156f = r3
                return
        }

        @Override // android.ext.p1
        public android.widget.ImageView b(boolean r1) {
                r0 = this;
                android.widget.ImageView r1 = super.b(r1)
                r1.setOnLongClickListener(r0)
                return r1
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                android.ext.o1 r1 = r0.f1156f
                r1.c()
                return
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(android.view.View r1) {
                r0 = this;
                android.ext.o1 r1 = r0.f1156f
                r1.d()
                r1 = 1
                return r1
        }
    }

    public static class c extends android.ext.p1 implements android.view.View.OnLongClickListener {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final android.ext.o1 f1157f;

        public c(android.ext.o1 r3) {
                r2 = this;
                r0 = 2131296476(0x7f0900dc, float:1.821087E38)
                r1 = 2130968625(0x7f040031, float:1.7545909E38)
                r2.<init>(r0, r1)
                r2.f1157f = r3
                return
        }

        @Override // android.ext.p1
        public android.widget.ImageView b(boolean r1) {
                r0 = this;
                android.widget.ImageView r1 = super.b(r1)
                r1.setOnLongClickListener(r0)
                return r1
        }

        @Override // android.ext.p1, android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                android.ext.o1 r1 = r0.f1157f
                r1.e()
                return
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(android.view.View r1) {
                r0 = this;
                android.ext.o1 r1 = r0.f1157f
                r1.d()
                r1 = 1
                return r1
        }
    }

    public o1() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1150a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1151b = r0
            return
    }

    public boolean a(long r2, java.lang.CharSequence r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.b(r2, r4, r0)
            return r2
    }

    public boolean b(long r9, java.lang.CharSequence r11, int r12) {
            r8 = this;
            java.util.List r0 = r8.f1151b
            int r0 = r0.size()
            int r1 = r8.f1150a
            if (r1 >= r0) goto L19
            int r0 = r0 + (-1)
        Lc:
            int r1 = r8.f1150a
            if (r0 < r1) goto L18
            java.util.List r1 = r8.f1151b
            r1.remove(r0)
            int r0 = r0 + (-1)
            goto Lc
        L18:
            r0 = r1
        L19:
            r1 = 100
            if (r0 < r1) goto L29
            int r0 = r8.f1150a
            int r0 = r0 + (-1)
            r8.f1150a = r0
            java.util.List r0 = r8.f1151b
            r1 = 0
            r0.remove(r1)
        L29:
            int r0 = r8.f1150a
            int r0 = r0 + 1
            r8.f1150a = r0
            android.ext.MainService r0 = android.ext.MainService.instance
            android.ext.z1$d r0 = r0.v0
            if (r0 == 0) goto L39
            java.lang.String r0 = r0.f1434c
        L37:
            r5 = r0
            goto L3b
        L39:
            r0 = 0
            goto L37
        L3b:
            java.util.List r0 = r8.f1151b
            android.ext.o1$a r7 = new android.ext.o1$a
            r1 = r7
            r2 = r9
            r4 = r11
            r6 = r12
            r1.<init>(r2, r4, r5, r6)
            boolean r9 = r0.add(r7)
            return r9
    }

    public void c() {
            r3 = this;
            java.util.List r0 = r3.f1151b
            int r0 = r0.size()
            if (r0 != 0) goto Lf
            r0 = 2131296681(0x7f0901a9, float:1.8211286E38)
            android.ext.Tools.H1(r0)
            return
        Lf:
            int r0 = r3.f1150a
            r1 = 2
            if (r0 >= r1) goto L1c
            r0 = 2131296810(0x7f09022a, float:1.8211547E38)
            r1 = 0
            android.ext.Tools.I1(r0, r1)
            return
        L1c:
            r2 = 0
            int r0 = r0 - r1
            r3.onClick(r2, r0)
            return
    }

    public void d() {
            r10 = this;
            java.util.List r0 = r10.f1151b
            int r0 = r0.size()
            if (r0 != 0) goto Lf
            r0 = 2131296681(0x7f0901a9, float:1.8211286E38)
            android.ext.Tools.H1(r0)
            return
        Lf:
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r0]
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r0]
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = 0
        L19:
            if (r4 >= r0) goto L6d
            java.util.List r5 = r10.f1151b
            java.lang.Object r5 = r5.get(r4)
            android.ext.o1$a r5 = (android.ext.o1.a) r5
            java.lang.CharSequence r6 = r5.a()
            r1[r4] = r6
            java.lang.String r6 = r5.f1154c
            if (r6 == 0) goto L6a
            java.lang.Object r6 = r3.get(r6)
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            if (r6 != 0) goto L68
            java.lang.String r7 = r5.f1154c     // Catch: java.lang.Throwable -> L4c
            android.content.pm.ApplicationInfo r7 = android.ext.Tools.Y(r7)     // Catch: java.lang.Throwable -> L4c
            android.graphics.drawable.Drawable r7 = android.ext.Tools.X(r7)     // Catch: java.lang.Throwable -> L4c
            int r8 = android.ext.Tools.H()     // Catch: java.lang.Throwable -> L4c
            android.graphics.drawable.Drawable r7 = android.ext.Tools.G0(r7, r8)     // Catch: java.lang.Throwable -> L4c
            android.graphics.drawable.Drawable r6 = android.ext.Tools.R1(r7)     // Catch: java.lang.Throwable -> L4c
            goto L63
        L4c:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Failed load icon for "
            r8.append(r9)
            java.lang.String r9 = r5.f1154c
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.ext.e1.l(r8, r7)
        L63:
            java.lang.String r5 = r5.f1154c
            r3.put(r5, r6)
        L68:
            r2[r4] = r6
        L6a:
            int r4 = r4 + 1
            goto L19
        L6d:
            android.content.Context r0 = android.ext.Tools.k0()
            android.app.AlertDialog$Builder r0 = android.ext.f.c(r0)
            r3 = 2131296515(0x7f090103, float:1.8210949E38)
            android.view.View r3 = android.ext.Tools.g0(r3)
            android.app.AlertDialog$Builder r0 = r0.setCustomTitle(r3)
            int r3 = r10.f1150a
            int r3 = r3 + (-1)
            android.app.AlertDialog$Builder r0 = r0.setSingleChoiceItems(r1, r3, r10)
            r3 = 2131296311(0x7f090037, float:1.8210535E38)
            java.lang.String r3 = android.ext.b2.f(r3)
            r4 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r3, r4)
            android.app.AlertDialog r0 = r0.create()
            android.widget.ListView r3 = r0.getListView()
            if (r3 == 0) goto La6
            r4 = 48
            r5 = 2131361799(0x7f0a0007, float:1.834336E38)
            android.ext.Tools.e(r3, r1, r2, r4, r5)
        La6:
            android.ext.f.m(r0)
            return
    }

    public void e() {
            r2 = this;
            java.util.List r0 = r2.f1151b
            int r0 = r0.size()
            if (r0 != 0) goto Lf
            r0 = 2131296681(0x7f0901a9, float:1.8211286E38)
            android.ext.Tools.H1(r0)
            return
        Lf:
            int r1 = r2.f1150a
            if (r1 < r0) goto L1b
            r0 = 2131296809(0x7f090229, float:1.8211545E38)
            r1 = 0
            android.ext.Tools.I1(r0, r1)
            return
        L1b:
            r0 = 0
            r2.onClick(r0, r1)
            return
    }

    public long f() {
            r2 = this;
            java.util.List r0 = r2.f1151b
            int r0 = r0.size()
            int r1 = r2.f1150a
            if (r1 <= 0) goto L19
            if (r1 > r0) goto L19
            java.util.List r0 = r2.f1151b
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            android.ext.o1$a r0 = (android.ext.o1.a) r0
            long r0 = r0.f1152a
            goto L1b
        L19:
            r0 = 0
        L1b:
            return r0
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r4, int r5) {
            r3 = this;
            java.util.List r0 = r3.f1151b
            java.lang.Object r0 = r0.get(r5)
            android.ext.o1$a r0 = (android.ext.o1.a) r0
            if (r0 == 0) goto L17
            int r5 = r5 + 1
            r3.f1150a = r5
            android.ext.MainService r5 = android.ext.MainService.instance
            long r1 = r0.f1152a
            int r0 = r0.f1155d
            r5.K(r1, r0)
        L17:
            if (r4 == 0) goto L1c
            android.ext.Tools.D(r4)
        L1c:
            return
    }
}
